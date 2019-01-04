package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_predicate_creator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_predicate_creator";
    public static final String myFingerPrint = "8958188cd2feceeee5c083086fa43eebce121aa1b6afb071b6c96c297265ba25";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 766L)
    private static SubLSymbol $pc_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1144L)
    private static SubLSymbol $pc_session_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1505L)
    private static SubLSymbol $pc_session_constraint_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLSymbol $dtp_pc_session$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 10067L)
    private static SubLSymbol $pc_downgrade_typelevelpreds_isas$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20649L)
    private static SubLSymbol $predicate_type_for_arity_query$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
    private static SubLSymbol $cached_predicate_type_for_arity_any_mt_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
    private static SubLSymbol $generic_keyword_arg_caching_state$;
    private static final SubLSymbol $sym0$_PC_LOCK_;
    private static final SubLString $str1$Predicate_Creator_lock;
    private static final SubLSymbol $sym2$WITH_LOCK_HELD;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PC_SESSION;
    private static final SubLSymbol $sym8$PC_SESSION_P;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym14$PC_SESSION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$PC_SESSION_INTERACTION;
    private static final SubLSymbol $sym17$_CSETF_PC_SESSION_INTERACTION;
    private static final SubLSymbol $sym18$PC_SESSION_MODE;
    private static final SubLSymbol $sym19$_CSETF_PC_SESSION_MODE;
    private static final SubLSymbol $sym20$PC_SESSION_ARITY;
    private static final SubLSymbol $sym21$_CSETF_PC_SESSION_ARITY;
    private static final SubLSymbol $sym22$PC_SESSION_FULL_EXAMPLES;
    private static final SubLSymbol $sym23$_CSETF_PC_SESSION_FULL_EXAMPLES;
    private static final SubLSymbol $sym24$PC_SESSION_ARG_EXAMPLES;
    private static final SubLSymbol $sym25$_CSETF_PC_SESSION_ARG_EXAMPLES;
    private static final SubLSymbol $sym26$PC_SESSION_CONSTRAINTS_VIA_EXAMPLES;
    private static final SubLSymbol $sym27$_CSETF_PC_SESSION_CONSTRAINTS_VIA_EXAMPLES;
    private static final SubLSymbol $sym28$PC_SESSION_GENERALIZED_CONSTRAINTS;
    private static final SubLSymbol $sym29$_CSETF_PC_SESSION_GENERALIZED_CONSTRAINTS;
    private static final SubLSymbol $sym30$PC_SESSION_TEMPLATE;
    private static final SubLSymbol $sym31$_CSETF_PC_SESSION_TEMPLATE;
    private static final SubLSymbol $sym32$PC_SESSION_PREDICATE;
    private static final SubLSymbol $sym33$_CSETF_PC_SESSION_PREDICATE;
    private static final SubLSymbol $kw34$INTERACTION;
    private static final SubLSymbol $kw35$MODE;
    private static final SubLSymbol $kw36$ARITY;
    private static final SubLSymbol $kw37$FULL_EXAMPLES;
    private static final SubLSymbol $kw38$ARG_EXAMPLES;
    private static final SubLSymbol $kw39$CONSTRAINTS_VIA_EXAMPLES;
    private static final SubLSymbol $kw40$GENERALIZED_CONSTRAINTS;
    private static final SubLSymbol $kw41$TEMPLATE;
    private static final SubLSymbol $kw42$PREDICATE;
    private static final SubLString $str43$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw44$BEGIN;
    private static final SubLSymbol $sym45$MAKE_PC_SESSION;
    private static final SubLSymbol $kw46$SLOT;
    private static final SubLSymbol $kw47$END;
    private static final SubLSymbol $sym48$VISIT_DEFSTRUCT_OBJECT_PC_SESSION_METHOD;
    private static final SubLSymbol $sym49$USER_INTERACTION_P;
    private static final SubLSymbol $kw50$NEW;
    private static final SubLSymbol $sym51$PC_SESSION_MODE_P;
    private static final SubLSymbol $sym52$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym53$PC_SESSION_FULL_EXAMPLE_P;
    private static final SubLSymbol $sym54$PC_SESSION_EXAMPLE_P;
    private static final SubLSymbol $sym55$PC_SESSION_CONSTRAINT_LIST_P;
    private static final SubLSymbol $sym56$FIRST;
    private static final SubLSymbol $sym57$PC_SESSION_CONSTRAINT_P;
    private static final SubLSymbol $sym58$PC_SESSION_TEMPLATE_P;
    private static final SubLSymbol $sym59$FORT_P;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLObject $const64$argIsa;
    private static final SubLObject $const65$Collection;
    private static final SubLObject $const66$argGenl;
    private static final SubLSymbol $kw67$EXAMPLES;
    private static final SubLSymbol $kw68$CONSTRAINTS;
    private static final SubLSymbol $kw69$READY;
    private static final SubLSymbol $kw70$DONE;
    private static final SubLList $list71;
    private static final SubLString $str72$Predicate;
    private static final SubLSymbol $sym73$GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym74$THIRD;
    private static final SubLSymbol $sym75$SECOND;
    private static final SubLSymbol $sym76$_;
    private static final SubLObject $const77$isa;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT;
    private static final SubLSymbol $kw80$COL;
    private static final SubLObject $const81$InferencePSC;
    private static final SubLSymbol $sym82$_CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT_CACHING_STATE_;
    private static final SubLObject $const83$genTemplate;
    private static final SubLObject $const84$assertTemplate_Reln;
    private static final SubLObject $const85$STemplate;
    private static final SubLObject $const86$NPTemplate;
    private static final SubLSymbol $sym87$GENERIC_KEYWORD_ARG;
    private static final SubLString $str88$ARG_A;
    private static final SubLSymbol $sym89$_GENERIC_KEYWORD_ARG_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1050L)
    public static SubLObject with_pc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_predicate_creator.$sym2$WITH_LOCK_HELD, (SubLObject)rkf_predicate_creator.$list3, ConsesLow.append(body, (SubLObject)rkf_predicate_creator.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1409L)
    public static SubLObject pc_session_mode_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(Sequences.find(v_object, rkf_predicate_creator.$pc_session_modes$.getGlobalValue(), (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1593L)
    public static SubLObject pc_session_contraint_predicate_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(Sequences.find(v_object, rkf_predicate_creator.$pc_session_constraint_predicates$.getGlobalValue(), (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1720L)
    public static SubLObject pc_session_full_example_p(final SubLObject v_object) {
        if (v_object.isCons() && rkf_predicate_creator.NIL != list_utilities.proper_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = (SubLObject)rkf_predicate_creator.NIL;
            item = cdolist_list_var.first();
            while (rkf_predicate_creator.NIL != cdolist_list_var) {
                if (rkf_predicate_creator.NIL == pc_session_example_p(item)) {
                    return (SubLObject)rkf_predicate_creator.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            return (SubLObject)rkf_predicate_creator.T;
        }
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 2151L)
    public static SubLObject pc_session_example_p(final SubLObject v_object) {
        return term.first_order_termP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 2277L)
    public static SubLObject pc_session_template_p(final SubLObject v_object) {
        if (rkf_predicate_creator.NIL == v_object || rkf_predicate_creator.NIL != list_utilities.proper_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = (SubLObject)rkf_predicate_creator.NIL;
            item = cdolist_list_var.first();
            while (rkf_predicate_creator.NIL != cdolist_list_var) {
                if (!item.isString() && !item.isKeyword()) {
                    return (SubLObject)rkf_predicate_creator.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            return (SubLObject)rkf_predicate_creator.T;
        }
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 2570L)
    public static SubLObject pc_session_constraint_list_p(final SubLObject constraints) {
        if (rkf_predicate_creator.NIL == constraints || rkf_predicate_creator.NIL != list_utilities.proper_list_p(constraints)) {
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = (SubLObject)rkf_predicate_creator.NIL;
            constraint = cdolist_list_var.first();
            while (rkf_predicate_creator.NIL != cdolist_list_var) {
                if (rkf_predicate_creator.NIL == pc_session_constraint_p(constraint)) {
                    return (SubLObject)rkf_predicate_creator.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            return (SubLObject)rkf_predicate_creator.T;
        }
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 2914L)
    public static SubLObject pc_session_constraint_p(final SubLObject v_object) {
        if (rkf_predicate_creator.NIL != list_utilities.proper_list_p(v_object) && rkf_predicate_creator.NIL != list_utilities.lengthE(v_object, (SubLObject)rkf_predicate_creator.THREE_INTEGER, (SubLObject)rkf_predicate_creator.UNPROVIDED)) {
            SubLObject arg = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject pred = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject value = (SubLObject)rkf_predicate_creator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)rkf_predicate_creator.$list6);
            arg = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)rkf_predicate_creator.$list6);
            pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)rkf_predicate_creator.$list6);
            value = current.first();
            current = current.rest();
            if (rkf_predicate_creator.NIL == current) {
                return (SubLObject)SubLObjectFactory.makeBoolean(rkf_predicate_creator.NIL != subl_promotions.positive_integer_p(arg) && rkf_predicate_creator.NIL != pc_session_contraint_predicate_p(pred) && rkf_predicate_creator.NIL != term.first_order_termP(value));
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)rkf_predicate_creator.$list6);
        }
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_predicate_creator.ZERO_INTEGER);
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pc_session_native.class) ? rkf_predicate_creator.T : rkf_predicate_creator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_interaction(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_mode(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_arity(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_full_examples(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_arg_examples(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_constraints_via_examples(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_generalized_constraints(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_template(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject pc_session_predicate(final SubLObject v_object) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_interaction(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_mode(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_arity(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_full_examples(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_arg_examples(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_constraints_via_examples(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_generalized_constraints(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_template(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject _csetf_pc_session_predicate(final SubLObject v_object, final SubLObject value) {
        assert rkf_predicate_creator.NIL != pc_session_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject make_pc_session(SubLObject arglist) {
        if (arglist == rkf_predicate_creator.UNPROVIDED) {
            arglist = (SubLObject)rkf_predicate_creator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pc_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_predicate_creator.NIL, next = arglist; rkf_predicate_creator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw34$INTERACTION)) {
                _csetf_pc_session_interaction(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw35$MODE)) {
                _csetf_pc_session_mode(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw36$ARITY)) {
                _csetf_pc_session_arity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw37$FULL_EXAMPLES)) {
                _csetf_pc_session_full_examples(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw38$ARG_EXAMPLES)) {
                _csetf_pc_session_arg_examples(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw39$CONSTRAINTS_VIA_EXAMPLES)) {
                _csetf_pc_session_constraints_via_examples(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw40$GENERALIZED_CONSTRAINTS)) {
                _csetf_pc_session_generalized_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw41$TEMPLATE)) {
                _csetf_pc_session_template(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw42$PREDICATE)) {
                _csetf_pc_session_predicate(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_predicate_creator.$str43$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject visit_defstruct_pc_session(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw44$BEGIN, (SubLObject)rkf_predicate_creator.$sym45$MAKE_PC_SESSION, (SubLObject)rkf_predicate_creator.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw34$INTERACTION, pc_session_interaction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw35$MODE, pc_session_mode(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw36$ARITY, pc_session_arity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw37$FULL_EXAMPLES, pc_session_full_examples(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw38$ARG_EXAMPLES, pc_session_arg_examples(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw39$CONSTRAINTS_VIA_EXAMPLES, pc_session_constraints_via_examples(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw40$GENERALIZED_CONSTRAINTS, pc_session_generalized_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw41$TEMPLATE, pc_session_template(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw46$SLOT, (SubLObject)rkf_predicate_creator.$kw42$PREDICATE, pc_session_predicate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_predicate_creator.$kw47$END, (SubLObject)rkf_predicate_creator.$sym45$MAKE_PC_SESSION, (SubLObject)rkf_predicate_creator.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
    public static SubLObject visit_defstruct_object_pc_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pc_session(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3708L)
    public static SubLObject new_pc_session(final SubLObject interaction) {
        assert rkf_predicate_creator.NIL != user_interaction_agenda.user_interaction_p(interaction) : interaction;
        final SubLObject session = make_pc_session((SubLObject)rkf_predicate_creator.UNPROVIDED);
        _csetf_pc_session_interaction(session, interaction);
        pc_session_note_mode(session, (SubLObject)rkf_predicate_creator.$kw50$NEW);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4001L)
    public static SubLObject pc_session_note_mode(final SubLObject session, final SubLObject mode) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != pc_session_mode_p(mode) : mode;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_mode(session, mode);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4275L)
    public static SubLObject pc_session_note_arity(final SubLObject session, final SubLObject v_arity) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != subl_promotions.positive_integer_p(v_arity) : v_arity;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_arity(session, v_arity);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4485L)
    public static SubLObject pc_session_clear_full_examples(final SubLObject session) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_full_examples(session, (SubLObject)rkf_predicate_creator.NIL);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4665L)
    public static SubLObject pc_session_add_full_example(final SubLObject session, final SubLObject full_example) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != pc_session_full_example_p(full_example) : full_example;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            if (rkf_predicate_creator.NIL == conses_high.member(full_example, pc_session_full_examples(session), Symbols.symbol_function((SubLObject)rkf_predicate_creator.EQUAL), Symbols.symbol_function((SubLObject)rkf_predicate_creator.IDENTITY))) {
                _csetf_pc_session_full_examples(session, (SubLObject)ConsesLow.cons(full_example, pc_session_full_examples(session)));
            }
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4928L)
    public static SubLObject pc_session_rem_full_example(final SubLObject session, final SubLObject full_example) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != pc_session_full_example_p(full_example) : full_example;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_full_examples(session, Sequences.delete(full_example, pc_session_full_examples(session), Symbols.symbol_function((SubLObject)rkf_predicate_creator.EQUAL), (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED));
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 5236L)
    public static SubLObject pc_session_clear_arg_examples(final SubLObject session) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_arg_examples(session, (SubLObject)rkf_predicate_creator.NIL);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 5414L)
    public static SubLObject pc_session_add_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != subl_promotions.positive_integer_p(arg) : arg;
        assert rkf_predicate_creator.NIL != pc_session_example_p(example) : example;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            final SubLObject item_var = (SubLObject)ConsesLow.list(arg, example);
            if (rkf_predicate_creator.NIL == conses_high.member(item_var, pc_session_arg_examples(session), Symbols.symbol_function((SubLObject)rkf_predicate_creator.EQUAL), Symbols.symbol_function((SubLObject)rkf_predicate_creator.IDENTITY))) {
                _csetf_pc_session_arg_examples(session, (SubLObject)ConsesLow.cons(item_var, pc_session_arg_examples(session)));
            }
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 5708L)
    public static SubLObject pc_session_rem_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != subl_promotions.positive_integer_p(arg) : arg;
        assert rkf_predicate_creator.NIL != pc_session_example_p(example) : example;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_arg_examples(session, Sequences.delete((SubLObject)ConsesLow.list(arg, example), pc_session_arg_examples(session), Symbols.symbol_function((SubLObject)rkf_predicate_creator.EQUAL), (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED));
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 6046L)
    public static SubLObject pc_session_note_constraints_via_examples(final SubLObject session, final SubLObject constraints) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != pc_session_constraint_list_p(constraints) : constraints;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_constraints_via_examples(session, constraints);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 6323L)
    public static SubLObject pc_session_clear_generalized_constraints(final SubLObject session) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_generalized_constraints(session, (SubLObject)rkf_predicate_creator.NIL);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 6523L)
    public static SubLObject pc_session_clear_generalized_constraints_for_arg(final SubLObject session, final SubLObject arg) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != subl_promotions.positive_integer_p(arg) : arg;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_generalized_constraints(session, Sequences.delete(arg, pc_session_generalized_constraints(session), Symbols.symbol_function((SubLObject)rkf_predicate_creator.EQL), Symbols.symbol_function((SubLObject)rkf_predicate_creator.$sym56$FIRST), (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED));
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 6844L)
    public static SubLObject pc_session_add_generalized_constraint(final SubLObject session, final SubLObject constraint) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != pc_session_constraint_p(constraint) : constraint;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            if (rkf_predicate_creator.NIL == conses_high.member(constraint, pc_session_generalized_constraints(session), Symbols.symbol_function((SubLObject)rkf_predicate_creator.EQUAL), Symbols.symbol_function((SubLObject)rkf_predicate_creator.IDENTITY))) {
                _csetf_pc_session_generalized_constraints(session, (SubLObject)ConsesLow.cons(constraint, pc_session_generalized_constraints(session)));
            }
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 7119L)
    public static SubLObject pc_session_clear_template(final SubLObject session) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_template(session, (SubLObject)rkf_predicate_creator.NIL);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 7289L)
    public static SubLObject pc_session_note_template(final SubLObject session, final SubLObject template) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != pc_session_template_p(template) : template;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_template(session, template);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 7517L)
    public static SubLObject pc_session_note_predicate(final SubLObject session, final SubLObject predicate) {
        assert rkf_predicate_creator.NIL != pc_session_p(session) : session;
        assert rkf_predicate_creator.NIL != forts.fort_p(predicate) : predicate;
        SubLObject release = (SubLObject)rkf_predicate_creator.NIL;
        try {
            release = Locks.seize_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            _csetf_pc_session_predicate(session, predicate);
        }
        finally {
            if (rkf_predicate_creator.NIL != release) {
                Locks.release_lock(rkf_predicate_creator.$pc_lock$.getGlobalValue());
            }
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 7736L)
    public static SubLObject pc_session_full_example_formulas(final SubLObject session) {
        final SubLObject predicate = pc_session_predicate(session);
        final SubLObject full_examples = pc_session_full_examples(session);
        SubLObject formulas = (SubLObject)rkf_predicate_creator.NIL;
        SubLObject cdolist_list_var = full_examples;
        SubLObject full_example = (SubLObject)rkf_predicate_creator.NIL;
        full_example = cdolist_list_var.first();
        while (rkf_predicate_creator.NIL != cdolist_list_var) {
            final SubLObject formula = reader.bq_cons(predicate, ConsesLow.append(full_example, (SubLObject)rkf_predicate_creator.NIL));
            formulas = (SubLObject)ConsesLow.cons(formula, formulas);
            cdolist_list_var = cdolist_list_var.rest();
            full_example = cdolist_list_var.first();
        }
        return formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 8265L)
    public static SubLObject pc_session_switch_mode(final SubLObject session, final SubLObject mode) {
        if (rkf_predicate_creator.NIL != subl_promotions.memberP(mode, (SubLObject)rkf_predicate_creator.$list60, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED)) {
            pc_session_clear_full_examples(session);
            pc_session_clear_arg_examples(session);
            pc_session_update_constraints_via_examples(session);
        }
        if (rkf_predicate_creator.NIL != subl_promotions.memberP(mode, (SubLObject)rkf_predicate_creator.$list61, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED)) {
            pc_session_clear_generalized_constraints(session);
        }
        if (rkf_predicate_creator.NIL != subl_promotions.memberP(mode, (SubLObject)rkf_predicate_creator.$list62, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED)) {
            pc_session_clear_template(session);
        }
        pc_session_note_mode(session, mode);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 8845L)
    public static SubLObject pc_session_arg_examples_for_arg(final SubLObject session, final SubLObject arg) {
        final SubLObject arg_examples = pc_session_arg_examples(session);
        SubLObject v_answer = (SubLObject)rkf_predicate_creator.NIL;
        SubLObject cdolist_list_var = arg_examples;
        SubLObject arg_example = (SubLObject)rkf_predicate_creator.NIL;
        arg_example = cdolist_list_var.first();
        while (rkf_predicate_creator.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_example;
            SubLObject example_arg = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject example_value = (SubLObject)rkf_predicate_creator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_predicate_creator.$list63);
            example_arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_predicate_creator.$list63);
            example_value = current.first();
            current = current.rest();
            if (rkf_predicate_creator.NIL == current) {
                if (arg.numE(example_arg)) {
                    v_answer = (SubLObject)ConsesLow.cons(example_value, v_answer);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_predicate_creator.$list63);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_example = cdolist_list_var.first();
        }
        v_answer = Sequences.nreverse(v_answer);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 9207L)
    public static SubLObject pc_session_agenda(final SubLObject session) {
        final SubLObject interaction = pc_session_interaction(session);
        return user_interaction_agenda.ui_agenda(interaction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 9345L)
    public static SubLObject pc_session_domain_interaction_mt(final SubLObject session) {
        final SubLObject v_agenda = pc_session_agenda(session);
        final SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
        return domain_interaction_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 9547L)
    public static SubLObject pc_session_generation_interaction_mt(final SubLObject session) {
        final SubLObject v_agenda = pc_session_agenda(session);
        final SubLObject generation_interaction_mt = user_interaction_agenda.uia_generation_interaction_mt(v_agenda, (SubLObject)rkf_predicate_creator.UNPROVIDED);
        return generation_interaction_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 9813L)
    public static SubLObject pc_session_parsing_interaction_mt(final SubLObject session) {
        final SubLObject v_agenda = pc_session_agenda(session);
        final SubLObject parsing_interaction_mt = user_interaction_agenda.uia_parsing_interaction_mt(v_agenda);
        return parsing_interaction_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 10276L)
    public static SubLObject pc_session_update_constraints_via_examples(final SubLObject session) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject domain_mt = pc_session_domain_interaction_mt(session);
        final SubLObject v_arity = pc_session_arity(session);
        SubLObject new_constraints = (SubLObject)rkf_predicate_creator.NIL;
        if (v_arity.isInteger()) {
            SubLObject i;
            SubLObject arg;
            SubLObject arg_examples;
            SubLObject isa_constraints;
            SubLObject genls_constraints;
            SubLObject cdolist_list_var;
            SubLObject constraint;
            for (i = (SubLObject)rkf_predicate_creator.NIL, i = (SubLObject)rkf_predicate_creator.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)rkf_predicate_creator.ONE_INTEGER)) {
                arg = Numbers.add(i, (SubLObject)rkf_predicate_creator.ONE_INTEGER);
                arg_examples = pc_session_arg_examples_for_arg(session, arg);
                thread.resetMultipleValues();
                isa_constraints = rkf_ontology_utilities.rkf_narrowest_type_constraints(arg_examples, domain_mt);
                genls_constraints = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (rkf_predicate_creator.NIL != genls_constraints && rkf_predicate_creator.NIL != rkf_predicate_creator.$pc_downgrade_typelevelpreds_isas$.getDynamicValue(thread)) {
                    new_constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arg, rkf_predicate_creator.$const64$argIsa, rkf_predicate_creator.$const65$Collection), new_constraints);
                }
                else {
                    cdolist_list_var = isa_constraints;
                    constraint = (SubLObject)rkf_predicate_creator.NIL;
                    constraint = cdolist_list_var.first();
                    while (rkf_predicate_creator.NIL != cdolist_list_var) {
                        new_constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arg, rkf_predicate_creator.$const64$argIsa, constraint), new_constraints);
                        cdolist_list_var = cdolist_list_var.rest();
                        constraint = cdolist_list_var.first();
                    }
                }
                cdolist_list_var = genls_constraints;
                constraint = (SubLObject)rkf_predicate_creator.NIL;
                constraint = cdolist_list_var.first();
                while (rkf_predicate_creator.NIL != cdolist_list_var) {
                    new_constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arg, rkf_predicate_creator.$const66$argGenl, constraint), new_constraints);
                    cdolist_list_var = cdolist_list_var.rest();
                    constraint = cdolist_list_var.first();
                }
            }
        }
        new_constraints = Sequences.nreverse(new_constraints);
        pc_session_note_constraints_via_examples(session, new_constraints);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 11470L)
    public static SubLObject pc_session_act_create(final SubLObject interaction) {
        final SubLObject session = new_pc_session(interaction);
        pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw36$ARITY);
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 11945L)
    public static SubLObject pc_session_act_set_arity(final SubLObject session, final SubLObject v_arity) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw36$ARITY)) {
            pc_session_note_arity(session, v_arity);
            pc_session_note_mode(session, (SubLObject)rkf_predicate_creator.$kw67$EXAMPLES);
        }
        else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw67$EXAMPLES) || pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw36$ARITY);
            pc_session_act_set_arity(session, v_arity);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 12478L)
    public static SubLObject pc_session_act_add_full_example(final SubLObject session, final SubLObject full_example) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw36$ARITY)) {
            pc_session_act_set_arity(session, Sequences.length(full_example));
            pc_session_act_add_full_example(session, full_example);
        }
        else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw67$EXAMPLES)) {
            pc_session_add_full_example(session, full_example);
            SubLObject list_var = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject example = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject index = (SubLObject)rkf_predicate_creator.NIL;
            list_var = full_example;
            example = list_var.first();
            for (index = (SubLObject)rkf_predicate_creator.ZERO_INTEGER; rkf_predicate_creator.NIL != list_var; list_var = list_var.rest(), example = list_var.first(), index = Numbers.add((SubLObject)rkf_predicate_creator.ONE_INTEGER, index)) {
                final SubLObject arg = Numbers.add(index, (SubLObject)rkf_predicate_creator.ONE_INTEGER);
                pc_session_add_arg_example(session, arg, example);
            }
            pc_session_update_constraints_via_examples(session);
        }
        else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw67$EXAMPLES);
            pc_session_act_add_full_example(session, full_example);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 13338L)
    public static SubLObject pc_session_act_rem_full_example(final SubLObject session, final SubLObject full_example) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw67$EXAMPLES)) {
            pc_session_rem_full_example(session, full_example);
            SubLObject list_var = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject example = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject index = (SubLObject)rkf_predicate_creator.NIL;
            list_var = full_example;
            example = list_var.first();
            for (index = (SubLObject)rkf_predicate_creator.ZERO_INTEGER; rkf_predicate_creator.NIL != list_var; list_var = list_var.rest(), example = list_var.first(), index = Numbers.add((SubLObject)rkf_predicate_creator.ONE_INTEGER, index)) {
                final SubLObject arg = Numbers.add(index, (SubLObject)rkf_predicate_creator.ONE_INTEGER);
                pc_session_rem_arg_example(session, arg, example);
            }
            pc_session_update_constraints_via_examples(session);
        }
        else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw67$EXAMPLES);
            pc_session_act_rem_full_example(session, full_example);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 13958L)
    public static SubLObject pc_session_act_add_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw67$EXAMPLES)) {
            pc_session_add_arg_example(session, arg, example);
            pc_session_update_constraints_via_examples(session);
        }
        else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw67$EXAMPLES);
            pc_session_act_add_arg_example(session, arg, example);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 14435L)
    public static SubLObject pc_session_act_rem_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw67$EXAMPLES)) {
            pc_session_rem_arg_example(session, arg, example);
            pc_session_update_constraints_via_examples(session);
        }
        else if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw67$EXAMPLES);
            pc_session_act_rem_arg_example(session, arg, example);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 14911L)
    public static SubLObject pc_session_act_accept_examples(final SubLObject session) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw67$EXAMPLES)) {
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 15157L)
    public static SubLObject pc_session_act_clear_all_generalized_constraints(final SubLObject session) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            pc_session_clear_generalized_constraints(session);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 15475L)
    public static SubLObject pc_session_act_clear_generalized_constraints(final SubLObject session, final SubLObject arg) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            pc_session_clear_generalized_constraints_for_arg(session, arg);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 15759L)
    public static SubLObject pc_session_act_add_generalized_constraint(final SubLObject session, final SubLObject arg, final SubLObject constraint_pred, final SubLObject value) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            final SubLObject constraint = (SubLObject)ConsesLow.list(arg, constraint_pred, value);
            pc_session_add_generalized_constraint(session, constraint);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 16120L)
    public static SubLObject pc_session_act_accept_generalized_constraints(final SubLObject session) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw68$CONSTRAINTS)) {
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw41$TEMPLATE);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 16381L)
    public static SubLObject pc_session_act_note_template(final SubLObject session, final SubLObject template) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw41$TEMPLATE)) {
            pc_session_note_template(session, template);
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw69$READY);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 16714L)
    public static SubLObject pc_session_act_complete(final SubLObject session, final SubLObject domain_mt, final SubLObject generation_mt, final SubLObject parsing_mt) {
        final SubLObject pcase_var = pc_session_mode(session);
        if (pcase_var.eql((SubLObject)rkf_predicate_creator.$kw69$READY)) {
            final SubLObject predicate = pc_session_create_predicate(session, domain_mt);
            pc_session_note_predicate(session, predicate);
            pc_session_assert_arity(session, predicate, domain_mt);
            pc_session_assert_constraints(session, predicate, domain_mt);
            pc_session_switch_mode(session, (SubLObject)rkf_predicate_creator.$kw70$DONE);
        }
        return session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 17526L)
    public static SubLObject pc_session_act_complete_from_examples(final SubLObject pc_session) {
        SubLObject cdolist_list_var;
        final SubLObject constraints = cdolist_list_var = pc_session_constraints_via_examples(pc_session);
        SubLObject constraint = (SubLObject)rkf_predicate_creator.NIL;
        constraint = cdolist_list_var.first();
        while (rkf_predicate_creator.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject arg = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject constraint_pred = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject value = (SubLObject)rkf_predicate_creator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_predicate_creator.$list71);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_predicate_creator.$list71);
            constraint_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_predicate_creator.$list71);
            value = current.first();
            current = current.rest();
            if (rkf_predicate_creator.NIL == current) {
                pc_session_act_add_generalized_constraint(pc_session, arg, constraint_pred, value);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_predicate_creator.$list71);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        pc_session_act_accept_generalized_constraints(pc_session);
        final SubLObject template = (SubLObject)rkf_predicate_creator.NIL;
        pc_session_act_note_template(pc_session, template);
        final SubLObject domain_interaction_mt = pc_session_domain_interaction_mt(pc_session);
        final SubLObject generation_mt = pc_session_generation_interaction_mt(pc_session);
        final SubLObject parsing_mt = pc_session_parsing_interaction_mt(pc_session);
        pc_session_act_complete(pc_session, domain_interaction_mt, generation_mt, parsing_mt);
        return pc_session;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 18464L)
    public static SubLObject pc_session_create_predicate(final SubLObject session, final SubLObject domain_mt) {
        final SubLObject predicate = rkf_term_utilities.rkf_create((SubLObject)rkf_predicate_creator.$str72$Predicate, domain_mt, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED);
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 18641L)
    public static SubLObject pc_session_assert_arity(final SubLObject session, final SubLObject predicate, final SubLObject domain_mt) {
        final SubLObject v_arity = pc_session_arity(session);
        final SubLObject formula = pc_session_compute_arity_formula(predicate, v_arity, domain_mt);
        rkf_assertion_utilities.rkf_assert(formula, domain_mt, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED);
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 18919L)
    public static SubLObject pc_session_assert_constraints(final SubLObject session, final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject constraints = pc_session_generalized_constraints(session);
        SubLObject cdolist_list_var;
        constraints = (cdolist_list_var = pc_session_sort_constraints(constraints));
        SubLObject constraint = (SubLObject)rkf_predicate_creator.NIL;
        constraint = cdolist_list_var.first();
        while (rkf_predicate_creator.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constraint;
            SubLObject arg = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject constraint_pred = (SubLObject)rkf_predicate_creator.NIL;
            SubLObject value = (SubLObject)rkf_predicate_creator.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_predicate_creator.$list71);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_predicate_creator.$list71);
            constraint_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_predicate_creator.$list71);
            value = current.first();
            current = current.rest();
            if (rkf_predicate_creator.NIL == current) {
                final SubLObject formula = (SubLObject)ConsesLow.list(constraint_pred, predicate, arg, value);
                rkf_assertion_utilities.rkf_assert(formula, domain_mt, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_predicate_creator.$list71);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 19354L)
    public static SubLObject pc_session_sort_constraints(SubLObject constraints) {
        constraints = conses_high.copy_list(constraints);
        constraints = Sort.sort(constraints, Symbols.symbol_function((SubLObject)rkf_predicate_creator.$sym73$GENERALITY_ESTIMATE_), Symbols.symbol_function((SubLObject)rkf_predicate_creator.$sym74$THIRD));
        constraints = list_utilities.stable_sort_via_position(constraints, rkf_predicate_creator.$pc_session_constraint_predicates$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_predicate_creator.EQL), Symbols.symbol_function((SubLObject)rkf_predicate_creator.$sym75$SECOND));
        constraints = Sort.stable_sort(constraints, Symbols.symbol_function((SubLObject)rkf_predicate_creator.$sym76$_), Symbols.symbol_function((SubLObject)rkf_predicate_creator.$sym56$FIRST));
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 19723L)
    public static SubLObject pc_session_assert_generation_template(final SubLObject session, final SubLObject predicate, final SubLObject generation_mt) {
        final SubLObject template = pc_session_template(session);
        final SubLObject formula = pc_session_compute_generation_template_formula(predicate, template, generation_mt);
        rkf_assertion_utilities.rkf_assert(formula, generation_mt, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED);
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20023L)
    public static SubLObject pc_session_assert_parsing_template(final SubLObject session, final SubLObject predicate, final SubLObject parsing_mt) {
        final SubLObject template = pc_session_template(session);
        final SubLObject formula = pc_session_compute_parsing_template_formula(predicate, template, parsing_mt);
        rkf_assertion_utilities.rkf_assert(formula, parsing_mt, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED);
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20308L)
    public static SubLObject pc_session_compute_arity_formula(final SubLObject predicate, final SubLObject v_arity, final SubLObject domain_mt) {
        final SubLObject collection = rkf_predicate_type_for_arity(v_arity, domain_mt);
        return (SubLObject)ConsesLow.list(rkf_predicate_creator.$const77$isa, predicate, collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20512L)
    public static SubLObject rkf_predicate_type_for_arity(final SubLObject v_arity, SubLObject mt) {
        if (mt == rkf_predicate_creator.UNPROVIDED) {
            mt = (SubLObject)rkf_predicate_creator.NIL;
        }
        return cached_predicate_type_for_arity_any_mt(v_arity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
    public static SubLObject clear_cached_predicate_type_for_arity_any_mt() {
        final SubLObject cs = rkf_predicate_creator.$cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue();
        if (rkf_predicate_creator.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
    public static SubLObject remove_cached_predicate_type_for_arity_any_mt(final SubLObject v_arity) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_predicate_creator.$cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_arity), (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
    public static SubLObject cached_predicate_type_for_arity_any_mt_internal(final SubLObject v_arity) {
        final SubLObject query = conses_high.subst(v_arity, (SubLObject)rkf_predicate_creator.$kw36$ARITY, rkf_predicate_creator.$predicate_type_for_arity_query$.getGlobalValue(), (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED);
        return ask_utilities.ask_variable((SubLObject)rkf_predicate_creator.$kw80$COL, query, rkf_predicate_creator.$const81$InferencePSC, (SubLObject)rkf_predicate_creator.NIL, (SubLObject)rkf_predicate_creator.ONE_INTEGER, (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
    public static SubLObject cached_predicate_type_for_arity_any_mt(final SubLObject v_arity) {
        SubLObject caching_state = rkf_predicate_creator.$cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue();
        if (rkf_predicate_creator.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_predicate_creator.$sym79$CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT, (SubLObject)rkf_predicate_creator.$sym82$_CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT_CACHING_STATE_, (SubLObject)rkf_predicate_creator.NIL, (SubLObject)rkf_predicate_creator.EQL, (SubLObject)rkf_predicate_creator.ONE_INTEGER, (SubLObject)rkf_predicate_creator.FIVE_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_arity, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_predicate_type_for_arity_any_mt_internal(v_arity)));
            memoization_state.caching_state_put(caching_state, v_arity, results, (SubLObject)rkf_predicate_creator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 21203L)
    public static SubLObject pc_session_compute_generation_template_formula(final SubLObject predicate, final SubLObject template, final SubLObject generation_mt) {
        final SubLObject generation_template = pc_session_compute_generation_template(template);
        return (SubLObject)ConsesLow.list(rkf_predicate_creator.$const83$genTemplate, predicate, generation_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 21540L)
    public static SubLObject pc_session_compute_generation_template(final SubLObject template) {
        SubLObject template_terms = (SubLObject)rkf_predicate_creator.NIL;
        SubLObject cdolist_list_var = template;
        SubLObject template_item = (SubLObject)rkf_predicate_creator.NIL;
        template_item = cdolist_list_var.first();
        while (rkf_predicate_creator.NIL != cdolist_list_var) {
            if (template_item.isString()) {
                template_terms = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.bestnlphraseofstringfn(), template_item), template_terms);
            }
            else if (template_item.isKeyword()) {
                template_terms = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(pph_functions.termparaphrasefn(), template_item), template_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_item = cdolist_list_var.first();
        }
        template_terms = Sequences.nreverse(template_terms);
        return el_utilities.make_el_formula(pph_functions.concatenatephrasesfn(), template_terms, (SubLObject)rkf_predicate_creator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 22040L)
    public static SubLObject pc_session_compute_parsing_template_formula(final SubLObject predicate, final SubLObject template, final SubLObject parsing_mt) {
        final SubLObject syntax_template = pc_session_compute_parsing_syntax_template(template);
        final SubLObject semantics_template = pc_session_compute_parsing_semantics_template(predicate, template);
        return (SubLObject)ConsesLow.list(rkf_predicate_creator.$const84$assertTemplate_Reln, rkf_predicate_creator.$const85$STemplate, predicate, syntax_template, semantics_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 22674L)
    public static SubLObject pc_session_compute_parsing_syntax_template(final SubLObject template) {
        SubLObject template_terms = (SubLObject)rkf_predicate_creator.NIL;
        SubLObject cdolist_list_var = template;
        SubLObject template_item = (SubLObject)rkf_predicate_creator.NIL;
        template_item = cdolist_list_var.first();
        while (rkf_predicate_creator.NIL != cdolist_list_var) {
            if (template_item.isString()) {
                SubLObject cdolist_list_var_$1;
                final SubLObject strings = cdolist_list_var_$1 = standard_tokenization.standard_raw_tokenization(template_item);
                SubLObject string = (SubLObject)rkf_predicate_creator.NIL;
                string = cdolist_list_var_$1.first();
                while (rkf_predicate_creator.NIL != cdolist_list_var_$1) {
                    template_terms = (SubLObject)ConsesLow.cons(string, template_terms);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    string = cdolist_list_var_$1.first();
                }
            }
            else if (template_item.isKeyword()) {
                template_terms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rkf_predicate_creator.$const86$NPTemplate, template_item), template_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_item = cdolist_list_var.first();
        }
        template_terms = Sequences.nreverse(template_terms);
        return template_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 23157L)
    public static SubLObject pc_session_compute_parsing_semantics_template(final SubLObject predicate, final SubLObject v_arity) {
        return generic_relation_template_of_arity(predicate, v_arity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 23495L)
    public static SubLObject generic_relation_template(final SubLObject relation) {
        final SubLObject v_arity = arity.min_arity(relation);
        return generic_relation_template_of_arity(relation, v_arity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 23897L)
    public static SubLObject generic_relation_template_of_arity(final SubLObject relation, final SubLObject v_arity) {
        SubLObject args = (SubLObject)rkf_predicate_creator.NIL;
        SubLObject i;
        for (i = (SubLObject)rkf_predicate_creator.NIL, i = (SubLObject)rkf_predicate_creator.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)rkf_predicate_creator.ONE_INTEGER)) {
            args = (SubLObject)ConsesLow.cons(generic_keyword_arg(Numbers.add(i, (SubLObject)rkf_predicate_creator.ONE_INTEGER)), args);
        }
        args = Sequences.nreverse(args);
        return el_utilities.make_formula(relation, args, (SubLObject)rkf_predicate_creator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
    public static SubLObject clear_generic_keyword_arg() {
        final SubLObject cs = rkf_predicate_creator.$generic_keyword_arg_caching_state$.getGlobalValue();
        if (rkf_predicate_creator.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
    public static SubLObject remove_generic_keyword_arg(final SubLObject n) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_predicate_creator.$generic_keyword_arg_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(n), (SubLObject)rkf_predicate_creator.UNPROVIDED, (SubLObject)rkf_predicate_creator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
    public static SubLObject generic_keyword_arg_internal(final SubLObject n) {
        final SubLObject string = PrintLow.format((SubLObject)rkf_predicate_creator.NIL, (SubLObject)rkf_predicate_creator.$str88$ARG_A, n);
        return Values.values(string_utilities.keyword_from_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
    public static SubLObject generic_keyword_arg(final SubLObject n) {
        SubLObject caching_state = rkf_predicate_creator.$generic_keyword_arg_caching_state$.getGlobalValue();
        if (rkf_predicate_creator.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_predicate_creator.$sym87$GENERIC_KEYWORD_ARG, (SubLObject)rkf_predicate_creator.$sym89$_GENERIC_KEYWORD_ARG_CACHING_STATE_, (SubLObject)rkf_predicate_creator.NIL, (SubLObject)rkf_predicate_creator.EQL, (SubLObject)rkf_predicate_creator.ONE_INTEGER, (SubLObject)rkf_predicate_creator.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generic_keyword_arg_internal(n)));
            memoization_state.caching_state_put(caching_state, n, results, (SubLObject)rkf_predicate_creator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_rkf_predicate_creator_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_predicate_creator", "with_pc_lock", "WITH-PC-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_mode_p", "PC-SESSION-MODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_contraint_predicate_p", "PC-SESSION-CONTRAINT-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_full_example_p", "PC-SESSION-FULL-EXAMPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_example_p", "PC-SESSION-EXAMPLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_template_p", "PC-SESSION-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_constraint_list_p", "PC-SESSION-CONSTRAINT-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_constraint_p", "PC-SESSION-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_print_function_trampoline", "PC-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_p", "PC-SESSION-P", 1, 0, false);
        new $pc_session_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_interaction", "PC-SESSION-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_mode", "PC-SESSION-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_arity", "PC-SESSION-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_full_examples", "PC-SESSION-FULL-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_arg_examples", "PC-SESSION-ARG-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_constraints_via_examples", "PC-SESSION-CONSTRAINTS-VIA-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_generalized_constraints", "PC-SESSION-GENERALIZED-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_template", "PC-SESSION-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_predicate", "PC-SESSION-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_interaction", "_CSETF-PC-SESSION-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_mode", "_CSETF-PC-SESSION-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_arity", "_CSETF-PC-SESSION-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_full_examples", "_CSETF-PC-SESSION-FULL-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_arg_examples", "_CSETF-PC-SESSION-ARG-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_constraints_via_examples", "_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_generalized_constraints", "_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_template", "_CSETF-PC-SESSION-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "_csetf_pc_session_predicate", "_CSETF-PC-SESSION-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "make_pc_session", "MAKE-PC-SESSION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "visit_defstruct_pc_session", "VISIT-DEFSTRUCT-PC-SESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "visit_defstruct_object_pc_session_method", "VISIT-DEFSTRUCT-OBJECT-PC-SESSION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "new_pc_session", "NEW-PC-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_note_mode", "PC-SESSION-NOTE-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_note_arity", "PC-SESSION-NOTE-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_clear_full_examples", "PC-SESSION-CLEAR-FULL-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_add_full_example", "PC-SESSION-ADD-FULL-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_rem_full_example", "PC-SESSION-REM-FULL-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_clear_arg_examples", "PC-SESSION-CLEAR-ARG-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_add_arg_example", "PC-SESSION-ADD-ARG-EXAMPLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_rem_arg_example", "PC-SESSION-REM-ARG-EXAMPLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_note_constraints_via_examples", "PC-SESSION-NOTE-CONSTRAINTS-VIA-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_clear_generalized_constraints", "PC-SESSION-CLEAR-GENERALIZED-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_clear_generalized_constraints_for_arg", "PC-SESSION-CLEAR-GENERALIZED-CONSTRAINTS-FOR-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_add_generalized_constraint", "PC-SESSION-ADD-GENERALIZED-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_clear_template", "PC-SESSION-CLEAR-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_note_template", "PC-SESSION-NOTE-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_note_predicate", "PC-SESSION-NOTE-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_full_example_formulas", "PC-SESSION-FULL-EXAMPLE-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_switch_mode", "PC-SESSION-SWITCH-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_arg_examples_for_arg", "PC-SESSION-ARG-EXAMPLES-FOR-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_agenda", "PC-SESSION-AGENDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_domain_interaction_mt", "PC-SESSION-DOMAIN-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_generation_interaction_mt", "PC-SESSION-GENERATION-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_parsing_interaction_mt", "PC-SESSION-PARSING-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_update_constraints_via_examples", "PC-SESSION-UPDATE-CONSTRAINTS-VIA-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_create", "PC-SESSION-ACT-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_set_arity", "PC-SESSION-ACT-SET-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_add_full_example", "PC-SESSION-ACT-ADD-FULL-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_rem_full_example", "PC-SESSION-ACT-REM-FULL-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_add_arg_example", "PC-SESSION-ACT-ADD-ARG-EXAMPLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_rem_arg_example", "PC-SESSION-ACT-REM-ARG-EXAMPLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_accept_examples", "PC-SESSION-ACT-ACCEPT-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_clear_all_generalized_constraints", "PC-SESSION-ACT-CLEAR-ALL-GENERALIZED-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_clear_generalized_constraints", "PC-SESSION-ACT-CLEAR-GENERALIZED-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_add_generalized_constraint", "PC-SESSION-ACT-ADD-GENERALIZED-CONSTRAINT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_accept_generalized_constraints", "PC-SESSION-ACT-ACCEPT-GENERALIZED-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_note_template", "PC-SESSION-ACT-NOTE-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_complete", "PC-SESSION-ACT-COMPLETE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_act_complete_from_examples", "PC-SESSION-ACT-COMPLETE-FROM-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_create_predicate", "PC-SESSION-CREATE-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_assert_arity", "PC-SESSION-ASSERT-ARITY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_assert_constraints", "PC-SESSION-ASSERT-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_sort_constraints", "PC-SESSION-SORT-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_assert_generation_template", "PC-SESSION-ASSERT-GENERATION-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_assert_parsing_template", "PC-SESSION-ASSERT-PARSING-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_compute_arity_formula", "PC-SESSION-COMPUTE-ARITY-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "rkf_predicate_type_for_arity", "RKF-PREDICATE-TYPE-FOR-ARITY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "clear_cached_predicate_type_for_arity_any_mt", "CLEAR-CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "remove_cached_predicate_type_for_arity_any_mt", "REMOVE-CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "cached_predicate_type_for_arity_any_mt_internal", "CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "cached_predicate_type_for_arity_any_mt", "CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_compute_generation_template_formula", "PC-SESSION-COMPUTE-GENERATION-TEMPLATE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_compute_generation_template", "PC-SESSION-COMPUTE-GENERATION-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_compute_parsing_template_formula", "PC-SESSION-COMPUTE-PARSING-TEMPLATE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_compute_parsing_syntax_template", "PC-SESSION-COMPUTE-PARSING-SYNTAX-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "pc_session_compute_parsing_semantics_template", "PC-SESSION-COMPUTE-PARSING-SEMANTICS-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "generic_relation_template", "GENERIC-RELATION-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "generic_relation_template_of_arity", "GENERIC-RELATION-TEMPLATE-OF-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "clear_generic_keyword_arg", "CLEAR-GENERIC-KEYWORD-ARG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "remove_generic_keyword_arg", "REMOVE-GENERIC-KEYWORD-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "generic_keyword_arg_internal", "GENERIC-KEYWORD-ARG-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_predicate_creator", "generic_keyword_arg", "GENERIC-KEYWORD-ARG", 1, 0, false);
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    public static SubLObject init_rkf_predicate_creator_file() {
        rkf_predicate_creator.$pc_lock$ = SubLFiles.deflexical("*PC-LOCK*", (rkf_predicate_creator.NIL != Symbols.boundp((SubLObject)rkf_predicate_creator.$sym0$_PC_LOCK_)) ? rkf_predicate_creator.$pc_lock$.getGlobalValue() : Locks.make_lock((SubLObject)rkf_predicate_creator.$str1$Predicate_Creator_lock));
        rkf_predicate_creator.$pc_session_modes$ = SubLFiles.deflexical("*PC-SESSION-MODES*", (SubLObject)rkf_predicate_creator.$list4);
        rkf_predicate_creator.$pc_session_constraint_predicates$ = SubLFiles.deflexical("*PC-SESSION-CONSTRAINT-PREDICATES*", (SubLObject)rkf_predicate_creator.$list5);
        rkf_predicate_creator.$dtp_pc_session$ = SubLFiles.defconstant("*DTP-PC-SESSION*", (SubLObject)rkf_predicate_creator.$sym7$PC_SESSION);
        rkf_predicate_creator.$pc_downgrade_typelevelpreds_isas$ = SubLFiles.defparameter("*PC-DOWNGRADE-TYPELEVELPREDS-ISAS*", (SubLObject)rkf_predicate_creator.T);
        rkf_predicate_creator.$predicate_type_for_arity_query$ = SubLFiles.deflexical("*PREDICATE-TYPE-FOR-ARITY-QUERY*", (SubLObject)rkf_predicate_creator.$list78);
        rkf_predicate_creator.$cached_predicate_type_for_arity_any_mt_caching_state$ = SubLFiles.deflexical("*CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-CACHING-STATE*", (SubLObject)rkf_predicate_creator.NIL);
        rkf_predicate_creator.$generic_keyword_arg_caching_state$ = SubLFiles.deflexical("*GENERIC-KEYWORD-ARG-CACHING-STATE*", (SubLObject)rkf_predicate_creator.NIL);
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    public static SubLObject setup_rkf_predicate_creator_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_predicate_creator.$sym0$_PC_LOCK_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_predicate_creator.$dtp_pc_session$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_predicate_creator.$sym14$PC_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_predicate_creator.$list15);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym16$PC_SESSION_INTERACTION, (SubLObject)rkf_predicate_creator.$sym17$_CSETF_PC_SESSION_INTERACTION);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym18$PC_SESSION_MODE, (SubLObject)rkf_predicate_creator.$sym19$_CSETF_PC_SESSION_MODE);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym20$PC_SESSION_ARITY, (SubLObject)rkf_predicate_creator.$sym21$_CSETF_PC_SESSION_ARITY);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym22$PC_SESSION_FULL_EXAMPLES, (SubLObject)rkf_predicate_creator.$sym23$_CSETF_PC_SESSION_FULL_EXAMPLES);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym24$PC_SESSION_ARG_EXAMPLES, (SubLObject)rkf_predicate_creator.$sym25$_CSETF_PC_SESSION_ARG_EXAMPLES);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym26$PC_SESSION_CONSTRAINTS_VIA_EXAMPLES, (SubLObject)rkf_predicate_creator.$sym27$_CSETF_PC_SESSION_CONSTRAINTS_VIA_EXAMPLES);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym28$PC_SESSION_GENERALIZED_CONSTRAINTS, (SubLObject)rkf_predicate_creator.$sym29$_CSETF_PC_SESSION_GENERALIZED_CONSTRAINTS);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym30$PC_SESSION_TEMPLATE, (SubLObject)rkf_predicate_creator.$sym31$_CSETF_PC_SESSION_TEMPLATE);
        Structures.def_csetf((SubLObject)rkf_predicate_creator.$sym32$PC_SESSION_PREDICATE, (SubLObject)rkf_predicate_creator.$sym33$_CSETF_PC_SESSION_PREDICATE);
        Equality.identity((SubLObject)rkf_predicate_creator.$sym7$PC_SESSION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_predicate_creator.$dtp_pc_session$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_predicate_creator.$sym48$VISIT_DEFSTRUCT_OBJECT_PC_SESSION_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)rkf_predicate_creator.$sym79$CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT);
        memoization_state.note_globally_cached_function((SubLObject)rkf_predicate_creator.$sym87$GENERIC_KEYWORD_ARG);
        return (SubLObject)rkf_predicate_creator.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_predicate_creator_file();
    }
    
    public void initializeVariables() {
        init_rkf_predicate_creator_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_predicate_creator_file();
    }
    
    static {
        me = (SubLFile)new rkf_predicate_creator();
        rkf_predicate_creator.$pc_lock$ = null;
        rkf_predicate_creator.$pc_session_modes$ = null;
        rkf_predicate_creator.$pc_session_constraint_predicates$ = null;
        rkf_predicate_creator.$dtp_pc_session$ = null;
        rkf_predicate_creator.$pc_downgrade_typelevelpreds_isas$ = null;
        rkf_predicate_creator.$predicate_type_for_arity_query$ = null;
        rkf_predicate_creator.$cached_predicate_type_for_arity_any_mt_caching_state$ = null;
        rkf_predicate_creator.$generic_keyword_arg_caching_state$ = null;
        $sym0$_PC_LOCK_ = SubLObjectFactory.makeSymbol("*PC-LOCK*");
        $str1$Predicate_Creator_lock = SubLObjectFactory.makeString("Predicate Creator lock");
        $sym2$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PC-LOCK*"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"), (SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMPLES"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("READY"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $list5 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym7$PC_SESSION = SubLObjectFactory.makeSymbol("PC-SESSION");
        $sym8$PC_SESSION_P = SubLObjectFactory.makeSymbol("PC-SESSION-P");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INTERACTION"), SubLObjectFactory.makeSymbol("MODE"), SubLObjectFactory.makeSymbol("ARITY"), SubLObjectFactory.makeSymbol("FULL-EXAMPLES"), SubLObjectFactory.makeSymbol("ARG-EXAMPLES"), SubLObjectFactory.makeSymbol("CONSTRAINTS-VIA-EXAMPLES"), SubLObjectFactory.makeSymbol("GENERALIZED-CONSTRAINTS"), SubLObjectFactory.makeSymbol("TEMPLATE"), SubLObjectFactory.makeSymbol("PREDICATE") });
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INTERACTION"), SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("ARITY"), SubLObjectFactory.makeKeyword("FULL-EXAMPLES"), SubLObjectFactory.makeKeyword("ARG-EXAMPLES"), SubLObjectFactory.makeKeyword("CONSTRAINTS-VIA-EXAMPLES"), SubLObjectFactory.makeKeyword("GENERALIZED-CONSTRAINTS"), SubLObjectFactory.makeKeyword("TEMPLATE"), SubLObjectFactory.makeKeyword("PREDICATE") });
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PC-SESSION-INTERACTION"), SubLObjectFactory.makeSymbol("PC-SESSION-MODE"), SubLObjectFactory.makeSymbol("PC-SESSION-ARITY"), SubLObjectFactory.makeSymbol("PC-SESSION-FULL-EXAMPLES"), SubLObjectFactory.makeSymbol("PC-SESSION-ARG-EXAMPLES"), SubLObjectFactory.makeSymbol("PC-SESSION-CONSTRAINTS-VIA-EXAMPLES"), SubLObjectFactory.makeSymbol("PC-SESSION-GENERALIZED-CONSTRAINTS"), SubLObjectFactory.makeSymbol("PC-SESSION-TEMPLATE"), SubLObjectFactory.makeSymbol("PC-SESSION-PREDICATE") });
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-INTERACTION"), SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-MODE"), SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-ARITY"), SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-FULL-EXAMPLES"), SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-ARG-EXAMPLES"), SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES"), SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-TEMPLATE"), SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-PREDICATE") });
        $sym13$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym14$PC_SESSION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PC-SESSION-PRINT-FUNCTION-TRAMPOLINE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PC-SESSION-P"));
        $sym16$PC_SESSION_INTERACTION = SubLObjectFactory.makeSymbol("PC-SESSION-INTERACTION");
        $sym17$_CSETF_PC_SESSION_INTERACTION = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-INTERACTION");
        $sym18$PC_SESSION_MODE = SubLObjectFactory.makeSymbol("PC-SESSION-MODE");
        $sym19$_CSETF_PC_SESSION_MODE = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-MODE");
        $sym20$PC_SESSION_ARITY = SubLObjectFactory.makeSymbol("PC-SESSION-ARITY");
        $sym21$_CSETF_PC_SESSION_ARITY = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-ARITY");
        $sym22$PC_SESSION_FULL_EXAMPLES = SubLObjectFactory.makeSymbol("PC-SESSION-FULL-EXAMPLES");
        $sym23$_CSETF_PC_SESSION_FULL_EXAMPLES = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-FULL-EXAMPLES");
        $sym24$PC_SESSION_ARG_EXAMPLES = SubLObjectFactory.makeSymbol("PC-SESSION-ARG-EXAMPLES");
        $sym25$_CSETF_PC_SESSION_ARG_EXAMPLES = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-ARG-EXAMPLES");
        $sym26$PC_SESSION_CONSTRAINTS_VIA_EXAMPLES = SubLObjectFactory.makeSymbol("PC-SESSION-CONSTRAINTS-VIA-EXAMPLES");
        $sym27$_CSETF_PC_SESSION_CONSTRAINTS_VIA_EXAMPLES = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES");
        $sym28$PC_SESSION_GENERALIZED_CONSTRAINTS = SubLObjectFactory.makeSymbol("PC-SESSION-GENERALIZED-CONSTRAINTS");
        $sym29$_CSETF_PC_SESSION_GENERALIZED_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS");
        $sym30$PC_SESSION_TEMPLATE = SubLObjectFactory.makeSymbol("PC-SESSION-TEMPLATE");
        $sym31$_CSETF_PC_SESSION_TEMPLATE = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-TEMPLATE");
        $sym32$PC_SESSION_PREDICATE = SubLObjectFactory.makeSymbol("PC-SESSION-PREDICATE");
        $sym33$_CSETF_PC_SESSION_PREDICATE = SubLObjectFactory.makeSymbol("_CSETF-PC-SESSION-PREDICATE");
        $kw34$INTERACTION = SubLObjectFactory.makeKeyword("INTERACTION");
        $kw35$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw36$ARITY = SubLObjectFactory.makeKeyword("ARITY");
        $kw37$FULL_EXAMPLES = SubLObjectFactory.makeKeyword("FULL-EXAMPLES");
        $kw38$ARG_EXAMPLES = SubLObjectFactory.makeKeyword("ARG-EXAMPLES");
        $kw39$CONSTRAINTS_VIA_EXAMPLES = SubLObjectFactory.makeKeyword("CONSTRAINTS-VIA-EXAMPLES");
        $kw40$GENERALIZED_CONSTRAINTS = SubLObjectFactory.makeKeyword("GENERALIZED-CONSTRAINTS");
        $kw41$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw42$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $str43$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw44$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym45$MAKE_PC_SESSION = SubLObjectFactory.makeSymbol("MAKE-PC-SESSION");
        $kw46$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw47$END = SubLObjectFactory.makeKeyword("END");
        $sym48$VISIT_DEFSTRUCT_OBJECT_PC_SESSION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PC-SESSION-METHOD");
        $sym49$USER_INTERACTION_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-P");
        $kw50$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym51$PC_SESSION_MODE_P = SubLObjectFactory.makeSymbol("PC-SESSION-MODE-P");
        $sym52$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym53$PC_SESSION_FULL_EXAMPLE_P = SubLObjectFactory.makeSymbol("PC-SESSION-FULL-EXAMPLE-P");
        $sym54$PC_SESSION_EXAMPLE_P = SubLObjectFactory.makeSymbol("PC-SESSION-EXAMPLE-P");
        $sym55$PC_SESSION_CONSTRAINT_LIST_P = SubLObjectFactory.makeSymbol("PC-SESSION-CONSTRAINT-LIST-P");
        $sym56$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym57$PC_SESSION_CONSTRAINT_P = SubLObjectFactory.makeSymbol("PC-SESSION-CONSTRAINT-P");
        $sym58$PC_SESSION_TEMPLATE_P = SubLObjectFactory.makeSymbol("PC-SESSION-TEMPLATE-P");
        $sym59$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARITY"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMPLES"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMPLES"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINTS"));
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXAMPLE-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("EXAMPLE-VALUE"));
        $const64$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $const65$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const66$argGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl"));
        $kw67$EXAMPLES = SubLObjectFactory.makeKeyword("EXAMPLES");
        $kw68$CONSTRAINTS = SubLObjectFactory.makeKeyword("CONSTRAINTS");
        $kw69$READY = SubLObjectFactory.makeKeyword("READY");
        $kw70$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str72$Predicate = SubLObjectFactory.makeString("Predicate");
        $sym73$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $sym74$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $sym75$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym76$_ = SubLObjectFactory.makeSymbol("<");
        $const77$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list78 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("COL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationshipTypeByArity"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationshipTypeByArity"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("COL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("COL"), (SubLObject)SubLObjectFactory.makeSymbol("?GENL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity")), (SubLObject)SubLObjectFactory.makeSymbol("?GENL"), (SubLObject)SubLObjectFactory.makeKeyword("ARITY")))));
        $sym79$CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT = SubLObjectFactory.makeSymbol("CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT");
        $kw80$COL = SubLObjectFactory.makeKeyword("COL");
        $const81$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym82$_CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-CACHING-STATE*");
        $const83$genTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate"));
        $const84$assertTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertTemplate-Reln"));
        $const85$STemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"));
        $const86$NPTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"));
        $sym87$GENERIC_KEYWORD_ARG = SubLObjectFactory.makeSymbol("GENERIC-KEYWORD-ARG");
        $str88$ARG_A = SubLObjectFactory.makeString("ARG~A");
        $sym89$_GENERIC_KEYWORD_ARG_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENERIC-KEYWORD-ARG-CACHING-STATE*");
    }
    
    public static final class $pc_session_native extends SubLStructNative
    {
        public SubLObject $interaction;
        public SubLObject $mode;
        public SubLObject $arity;
        public SubLObject $full_examples;
        public SubLObject $arg_examples;
        public SubLObject $constraints_via_examples;
        public SubLObject $generalized_constraints;
        public SubLObject $template;
        public SubLObject $predicate;
        private static final SubLStructDeclNative structDecl;
        
        public $pc_session_native() {
            this.$interaction = (SubLObject)CommonSymbols.NIL;
            this.$mode = (SubLObject)CommonSymbols.NIL;
            this.$arity = (SubLObject)CommonSymbols.NIL;
            this.$full_examples = (SubLObject)CommonSymbols.NIL;
            this.$arg_examples = (SubLObject)CommonSymbols.NIL;
            this.$constraints_via_examples = (SubLObject)CommonSymbols.NIL;
            this.$generalized_constraints = (SubLObject)CommonSymbols.NIL;
            this.$template = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pc_session_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$interaction;
        }
        
        public SubLObject getField3() {
            return this.$mode;
        }
        
        public SubLObject getField4() {
            return this.$arity;
        }
        
        public SubLObject getField5() {
            return this.$full_examples;
        }
        
        public SubLObject getField6() {
            return this.$arg_examples;
        }
        
        public SubLObject getField7() {
            return this.$constraints_via_examples;
        }
        
        public SubLObject getField8() {
            return this.$generalized_constraints;
        }
        
        public SubLObject getField9() {
            return this.$template;
        }
        
        public SubLObject getField10() {
            return this.$predicate;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$interaction = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$mode = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$arity = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$full_examples = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$arg_examples = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$constraints_via_examples = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$generalized_constraints = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$template = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$predicate = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pc_session_native.class, rkf_predicate_creator.$sym7$PC_SESSION, rkf_predicate_creator.$sym8$PC_SESSION_P, rkf_predicate_creator.$list9, rkf_predicate_creator.$list10, new String[] { "$interaction", "$mode", "$arity", "$full_examples", "$arg_examples", "$constraints_via_examples", "$generalized_constraints", "$template", "$predicate" }, rkf_predicate_creator.$list11, rkf_predicate_creator.$list12, rkf_predicate_creator.$sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $pc_session_p$UnaryFunction extends UnaryFunction
    {
        public $pc_session_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PC-SESSION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_predicate_creator.pc_session_p(arg1);
        }
    }
}

/*

	Total time: 299 ms
	
*/