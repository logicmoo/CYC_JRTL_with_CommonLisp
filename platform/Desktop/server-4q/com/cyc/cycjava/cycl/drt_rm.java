package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class drt_rm extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.drt_rm";
    public static final String myFingerPrint = "fd59d1f917864a6320cc402a2bd9e104682bbdf9b5330ec656028a358ee371cd";
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 6058L)
    private static SubLSymbol $drt_rm_wrapper_fns$;
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 6386L)
    private static SubLSymbol $drt_rm_wrapper_fns_to_keywords$;
    private static final SubLSymbol $sym0$TARGET_TERM;
    private static final SubLString $str1$_______________________RM_MAPPING;
    private static final SubLString $str2$_A_has_been_mapped_to__A__;
    private static final SubLString $str3$map_rm___A_was_mapped_to__A__now_;
    private static final SubLSymbol $sym4$RM;
    private static final SubLSymbol $sym5$OBJECT;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$SYNTACTIC_ROLE;
    private static final SubLSymbol $sym8$NUMBER;
    private static final SubLSymbol $sym9$GENDER;
    private static final SubLSymbol $sym10$QUANT;
    private static final SubLSymbol $sym11$DEFINITENESS;
    private static final SubLSymbol $sym12$CONDITIONS;
    private static final SubLSymbol $sym13$SCOPE;
    private static final SubLSymbol $sym14$TARGET_VAR;
    private static final SubLSymbol $sym15$TYPE;
    private static final SubLSymbol $sym16$SUB_RMS;
    private static final SubLSymbol $sym17$SUPER_RM;
    private static final SubLSymbol $sym18$ROOT_TERM;
    private static final SubLSymbol $sym19$MAPPED_FORMULA;
    private static final SubLSymbol $sym20$FORMULA;
    private static final SubLSymbol $sym21$INSTANCE_COUNT;
    private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_RM_CLASS;
    private static final SubLSymbol $sym23$ISOLATED_P;
    private static final SubLSymbol $sym24$INSTANCE_NUMBER;
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_RM_INSTANCE;
    private static final SubLSymbol $sym26$SET_PROPERTY;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$OUTER_CATCH_FOR_RM_METHOD;
    private static final SubLSymbol $kw30$TYPE;
    private static final SubLSymbol $kw31$DEFINITENESS;
    private static final SubLObject $const32$Definite_NLAttr;
    private static final SubLSymbol $kw33$DEFINITE;
    private static final SubLSymbol $kw34$QUANT;
    private static final SubLObject $const35$ProperName_NLAttr;
    private static final SubLSymbol $kw36$GENDER;
    private static final SubLSymbol $kw37$NUMBER;
    private static final SubLSymbol $kw38$SYNTACTIC_ROLE;
    private static final SubLString $str39$___rm_set_property_method__A__pro;
    private static final SubLSymbol $sym40$RM_SET_PROPERTY_METHOD;
    private static final SubLSymbol $sym41$CONSTRUCT_CYCL;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$OUTER_CATCH_FOR_RM_METHOD;
    private static final SubLString $str44$___rm_construct_cycl_method__A__b;
    private static final SubLString $str45$___rm_construct_cycl_method__A__n;
    private static final SubLString $str46$___rm_construct_cycl_method__A__n;
    private static final SubLSymbol $sym47$RM_CONSTRUCT_CYCL_METHOD;
    private static final SubLSymbol $sym48$COREFERENCE_PROBABILITY;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$OUTER_CATCH_FOR_RM_METHOD;
    private static final SubLFloat $float52$0_0;
    private static final SubLFloat $float53$0_5;
    private static final SubLSymbol $sym54$RM_COREFERENCE_PROBABILITY_METHOD;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$DRT_POSSIBLE_RM_FORMULA;
    private static final SubLObject $const58$SubcollectionFunction;
    private static final SubLList $list59;
    private static final SubLSymbol $kw60$PRONOMIAL;
    private static final SubLSymbol $kw61$SOMEFN;
    private static final SubLString $str62$drt_rm_formula_properties___A_has;
    private static final SubLSymbol $sym63$NEW;
    private static final SubLList $list64;
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 761L)
    public static SubLObject real_rm(final SubLObject rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_rm = drt.drt_get_coreference(rm);
        final SubLObject existsP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (drt_rm.NIL == existsP) {
            return rm;
        }
        if (rm.eql(new_rm)) {
            return rm;
        }
        return real_rm(new_rm);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1127L)
    public static SubLObject map_rm(final SubLObject rm, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (drt_rm.NIL != forts.fort_p(target)) {
            instances.set_slot(rm, (SubLObject)drt_rm.$sym0$TARGET_TERM, target);
            if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.TWO_INTEGER)) {
                if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.TWO_INTEGER)) {
                    drt.drt_tracer_output((SubLObject)drt_rm.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)drt_rm.$str1$_______________________RM_MAPPING));
                }
                if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.TWO_INTEGER)) {
                    drt.drt_tracer_output((SubLObject)drt_rm.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)drt_rm.$str2$_A_has_been_mapped_to__A__, rm, target));
                }
            }
        }
        else if (drt_rm.NIL != rm_p(target)) {
            thread.resetMultipleValues();
            final SubLObject old_rm = drt.drt_get_coreference(rm);
            final SubLObject existsP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (drt_rm.NIL != existsP && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.ONE_INTEGER)) {
                Errors.warn((SubLObject)drt_rm.$str3$map_rm___A_was_mapped_to__A__now_, rm, old_rm, target);
            }
            final SubLObject result = drt.drt_set_coreference(rm, target);
            if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.TWO_INTEGER)) {
                if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.TWO_INTEGER)) {
                    drt.drt_tracer_output((SubLObject)drt_rm.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)drt_rm.$str1$_______________________RM_MAPPING));
                }
                if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.TWO_INTEGER)) {
                    drt.drt_tracer_output((SubLObject)drt_rm.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)drt_rm.$str2$_A_has_been_mapped_to__A__, rm, target));
                }
            }
            return result;
        }
        return (SubLObject)drt_rm.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_syntactic_role(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.FIFTEEN_INTEGER, (SubLObject)drt_rm.$sym7$SYNTACTIC_ROLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_syntactic_role(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.FIFTEEN_INTEGER, (SubLObject)drt_rm.$sym7$SYNTACTIC_ROLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_number(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.FOURTEEN_INTEGER, (SubLObject)drt_rm.$sym8$NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_number(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.FOURTEEN_INTEGER, (SubLObject)drt_rm.$sym8$NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_gender(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.THIRTEEN_INTEGER, (SubLObject)drt_rm.$sym9$GENDER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_gender(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.THIRTEEN_INTEGER, (SubLObject)drt_rm.$sym9$GENDER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_quant(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.TWELVE_INTEGER, (SubLObject)drt_rm.$sym10$QUANT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_quant(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.TWELVE_INTEGER, (SubLObject)drt_rm.$sym10$QUANT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_definiteness(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.ELEVEN_INTEGER, (SubLObject)drt_rm.$sym11$DEFINITENESS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_definiteness(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.ELEVEN_INTEGER, (SubLObject)drt_rm.$sym11$DEFINITENESS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_conditions(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.TEN_INTEGER, (SubLObject)drt_rm.$sym12$CONDITIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_conditions(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.TEN_INTEGER, (SubLObject)drt_rm.$sym12$CONDITIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_scope(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.NINE_INTEGER, (SubLObject)drt_rm.$sym13$SCOPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_scope(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.NINE_INTEGER, (SubLObject)drt_rm.$sym13$SCOPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_target_term(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.EIGHT_INTEGER, (SubLObject)drt_rm.$sym0$TARGET_TERM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_target_term(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.EIGHT_INTEGER, (SubLObject)drt_rm.$sym0$TARGET_TERM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_target_var(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.SEVEN_INTEGER, (SubLObject)drt_rm.$sym14$TARGET_VAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_target_var(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.SEVEN_INTEGER, (SubLObject)drt_rm.$sym14$TARGET_VAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_type(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.SIX_INTEGER, (SubLObject)drt_rm.$sym15$TYPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_type(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.SIX_INTEGER, (SubLObject)drt_rm.$sym15$TYPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_sub_rms(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.FIVE_INTEGER, (SubLObject)drt_rm.$sym16$SUB_RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_sub_rms(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.FIVE_INTEGER, (SubLObject)drt_rm.$sym16$SUB_RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_super_rm(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.FOUR_INTEGER, (SubLObject)drt_rm.$sym17$SUPER_RM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_super_rm(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.FOUR_INTEGER, (SubLObject)drt_rm.$sym17$SUPER_RM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_root_term(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.THREE_INTEGER, (SubLObject)drt_rm.$sym18$ROOT_TERM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_root_term(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.THREE_INTEGER, (SubLObject)drt_rm.$sym18$ROOT_TERM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_mapped_formula(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.TWO_INTEGER, (SubLObject)drt_rm.$sym19$MAPPED_FORMULA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_mapped_formula(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.TWO_INTEGER, (SubLObject)drt_rm.$sym19$MAPPED_FORMULA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject get_rm_formula(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, (SubLObject)drt_rm.ONE_INTEGER, (SubLObject)drt_rm.$sym20$FORMULA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject set_rm_formula(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, (SubLObject)drt_rm.ONE_INTEGER, (SubLObject)drt_rm.$sym20$FORMULA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject subloop_reserved_initialize_rm_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym5$OBJECT, (SubLObject)drt_rm.$sym21$INSTANCE_COUNT, (SubLObject)drt_rm.ZERO_INTEGER);
        return (SubLObject)drt_rm.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject subloop_reserved_initialize_rm_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym5$OBJECT, (SubLObject)drt_rm.$sym23$ISOLATED_P, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym5$OBJECT, (SubLObject)drt_rm.$sym24$INSTANCE_NUMBER, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym20$FORMULA, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym19$MAPPED_FORMULA, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym18$ROOT_TERM, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym17$SUPER_RM, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym16$SUB_RMS, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym15$TYPE, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym14$TARGET_VAR, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym0$TARGET_TERM, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym13$SCOPE, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym12$CONDITIONS, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym11$DEFINITENESS, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym10$QUANT, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym9$GENDER, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym8$NUMBER, (SubLObject)drt_rm.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym7$SYNTACTIC_ROLE, (SubLObject)drt_rm.NIL);
        return (SubLObject)drt_rm.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 1930L)
    public static SubLObject rm_p(final SubLObject rm) {
        return classes.subloop_instanceof_class(rm, (SubLObject)drt_rm.$sym4$RM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 3784L)
    public static SubLObject rm_set_property_method(final SubLObject self, final SubLObject property_keyword, final SubLObject new_property_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rm_method = (SubLObject)drt_rm.NIL;
        SubLObject syntactic_role = get_rm_syntactic_role(self);
        SubLObject number = get_rm_number(self);
        SubLObject gender = get_rm_gender(self);
        SubLObject quant = get_rm_quant(self);
        SubLObject definiteness = get_rm_definiteness(self);
        SubLObject target_term = get_rm_target_term(self);
        SubLObject type = get_rm_type(self);
        final SubLObject root_term = get_rm_root_term(self);
        try {
            thread.throwStack.push(drt_rm.$sym29$OUTER_CATCH_FOR_RM_METHOD);
            try {
                if (property_keyword.eql((SubLObject)drt_rm.$kw30$TYPE)) {
                    type = new_property_value;
                }
                else if (property_keyword.eql((SubLObject)drt_rm.$kw31$DEFINITENESS)) {
                    definiteness = new_property_value;
                    if (new_property_value.eql(drt_rm.$const32$Definite_NLAttr)) {
                        type = (SubLObject)drt_rm.$kw33$DEFINITE;
                    }
                }
                else if (property_keyword.eql((SubLObject)drt_rm.$kw34$QUANT)) {
                    quant = new_property_value;
                    if (new_property_value.eql(drt_rm.$const35$ProperName_NLAttr)) {
                        target_term = root_term;
                    }
                }
                else if (property_keyword.eql((SubLObject)drt_rm.$kw36$GENDER)) {
                    gender = new_property_value;
                }
                else if (property_keyword.eql((SubLObject)drt_rm.$kw37$NUMBER)) {
                    number = new_property_value;
                }
                else if (property_keyword.eql((SubLObject)drt_rm.$kw38$SYNTACTIC_ROLE)) {
                    syntactic_role = new_property_value;
                }
                else if (drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.ONE_INTEGER)) {
                    Errors.warn((SubLObject)drt_rm.$str39$___rm_set_property_method__A__pro, self, property_keyword, new_property_value);
                }
                Dynamic.sublisp_throw((SubLObject)drt_rm.$sym29$OUTER_CATCH_FOR_RM_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_rm.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rm_syntactic_role(self, syntactic_role);
                    set_rm_number(self, number);
                    set_rm_gender(self, gender);
                    set_rm_quant(self, quant);
                    set_rm_definiteness(self, definiteness);
                    set_rm_target_term(self, target_term);
                    set_rm_type(self, type);
                    set_rm_root_term(self, root_term);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rm_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_rm.$sym29$OUTER_CATCH_FOR_RM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rm_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 4736L)
    public static SubLObject rm_construct_cycl_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rm_method = (SubLObject)drt_rm.NIL;
        final SubLObject target_term = get_rm_target_term(self);
        final SubLObject target_var = get_rm_target_var(self);
        final SubLObject root_term = get_rm_root_term(self);
        try {
            thread.throwStack.push(drt_rm.$sym43$OUTER_CATCH_FOR_RM_METHOD);
            try {
                if (drt_rm.NIL != target_var && drt_rm.NIL != target_term && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.ONE_INTEGER)) {
                    Errors.warn((SubLObject)drt_rm.$str44$___rm_construct_cycl_method__A__b, self, target_var, target_term);
                }
                if (drt_rm.NIL != target_var) {
                    Dynamic.sublisp_throw((SubLObject)drt_rm.$sym43$OUTER_CATCH_FOR_RM_METHOD, target_var);
                }
                else if (drt_rm.NIL != target_term) {
                    Dynamic.sublisp_throw((SubLObject)drt_rm.$sym43$OUTER_CATCH_FOR_RM_METHOD, target_term);
                }
                else if (drt_rm.NIL != root_term) {
                    if (drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.ONE_INTEGER)) {
                        Errors.warn((SubLObject)drt_rm.$str45$___rm_construct_cycl_method__A__n, self, root_term);
                    }
                    Dynamic.sublisp_throw((SubLObject)drt_rm.$sym43$OUTER_CATCH_FOR_RM_METHOD, root_term);
                }
                else {
                    if (drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.ONE_INTEGER)) {
                        Errors.warn((SubLObject)drt_rm.$str46$___rm_construct_cycl_method__A__n, self);
                    }
                    Dynamic.sublisp_throw((SubLObject)drt_rm.$sym43$OUTER_CATCH_FOR_RM_METHOD, (SubLObject)drt_rm.NIL);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_rm.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rm_target_term(self, target_term);
                    set_rm_target_var(self, target_var);
                    set_rm_root_term(self, root_term);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rm_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_rm.$sym43$OUTER_CATCH_FOR_RM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rm_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 5364L)
    public static SubLObject rm_coreference_probability_method(final SubLObject self, final SubLObject target_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rm_method = (SubLObject)drt_rm.NIL;
        final SubLObject number = get_rm_number(self);
        final SubLObject gender = get_rm_gender(self);
        final SubLObject formula = get_rm_formula(self);
        try {
            thread.throwStack.push(drt_rm.$sym51$OUTER_CATCH_FOR_RM_METHOD);
            try {
                if (self.eql(target_rm)) {
                    Dynamic.sublisp_throw((SubLObject)drt_rm.$sym51$OUTER_CATCH_FOR_RM_METHOD, (SubLObject)drt_rm.NIL);
                }
                if (drt_rm.NIL != list_utilities.tree_find(formula, instances.get_slot(target_rm, (SubLObject)drt_rm.$sym20$FORMULA), Symbols.symbol_function((SubLObject)drt_rm.EQUAL), (SubLObject)drt_rm.UNPROVIDED)) {
                    Dynamic.sublisp_throw((SubLObject)drt_rm.$sym51$OUTER_CATCH_FOR_RM_METHOD, (SubLObject)drt_rm.$float52$0_0);
                }
                SubLObject probability = (SubLObject)drt_rm.$float52$0_0;
                if (gender.eql(instances.get_slot(target_rm, (SubLObject)drt_rm.$sym9$GENDER))) {
                    probability = Numbers.add(probability, (SubLObject)drt_rm.$float53$0_5);
                }
                if (number.eql(instances.get_slot(target_rm, (SubLObject)drt_rm.$sym8$NUMBER))) {
                    probability = Numbers.add(probability, (SubLObject)drt_rm.$float53$0_5);
                }
                Dynamic.sublisp_throw((SubLObject)drt_rm.$sym51$OUTER_CATCH_FOR_RM_METHOD, probability);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_rm.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_rm_number(self, number);
                    set_rm_gender(self, gender);
                    set_rm_formula(self, formula);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_rm_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_rm.$sym51$OUTER_CATCH_FOR_RM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rm_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 6765L)
    public static SubLObject drt_rm_wrapper_fn_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fort, drt_rm.$drt_rm_wrapper_fns$.getDynamicValue(thread), (SubLObject)drt_rm.UNPROVIDED, (SubLObject)drt_rm.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 7030L)
    public static SubLObject drt_rm_wrapper_fn_to_keyword(final SubLObject wrapper_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assoc_pair = conses_high.assoc(wrapper_fn, drt_rm.$drt_rm_wrapper_fns_to_keywords$.getDynamicValue(thread), (SubLObject)drt_rm.UNPROVIDED, (SubLObject)drt_rm.UNPROVIDED);
        if (drt_rm.NIL != assoc_pair) {
            return conses_high.second(assoc_pair);
        }
        return (SubLObject)drt_rm.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 7284L)
    public static SubLObject drt_possible_rm_formula(final SubLObject poss_rm_formula) {
        if (poss_rm_formula.isCons()) {
            return list_utilities.sublisp_boolean(drt_rm_wrapper_fn_p(poss_rm_formula.first()));
        }
        return (SubLObject)drt_rm.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 7576L)
    public static SubLObject drt_find_rm_formulas(final SubLObject formula) {
        final SubLObject poss_rm_formulas = list_utilities.tree_gather(formula, Symbols.symbol_function((SubLObject)drt_rm.$sym57$DRT_POSSIBLE_RM_FORMULA), (SubLObject)drt_rm.UNPROVIDED, (SubLObject)drt_rm.UNPROVIDED, (SubLObject)drt_rm.UNPROVIDED);
        SubLObject last_poss_formula = (SubLObject)drt_rm.NIL;
        SubLObject result = (SubLObject)drt_rm.NIL;
        SubLObject cdolist_list_var = poss_rm_formulas;
        SubLObject poss_rm_formula = (SubLObject)drt_rm.NIL;
        poss_rm_formula = cdolist_list_var.first();
        while (drt_rm.NIL != cdolist_list_var) {
            if (drt_rm.NIL == subl_promotions.memberP(poss_rm_formula, last_poss_formula, Symbols.symbol_function((SubLObject)drt_rm.EQUAL), (SubLObject)drt_rm.UNPROVIDED) || drt_rm.NIL != isa.isaP(cycl_utilities.formula_arg0(last_poss_formula), drt_rm.$const58$SubcollectionFunction, (SubLObject)drt_rm.UNPROVIDED, (SubLObject)drt_rm.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(poss_rm_formula, result);
            }
            last_poss_formula = poss_rm_formula;
            cdolist_list_var = cdolist_list_var.rest();
            poss_rm_formula = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 8700L)
    public static SubLObject drt_pronoun_formula_to_property_pairs(final SubLObject pronoun_formula) {
        if (Sequences.length(pronoun_formula).eql((SubLObject)drt_rm.FIVE_INTEGER)) {
            final SubLObject number = conses_high.third(pronoun_formula);
            final SubLObject gender = conses_high.fourth(pronoun_formula);
            return (SubLObject)ConsesLow.list((SubLObject)drt_rm.$list59, (SubLObject)ConsesLow.list((SubLObject)drt_rm.$kw37$NUMBER, number), (SubLObject)ConsesLow.list((SubLObject)drt_rm.$kw36$GENDER, gender));
        }
        return (SubLObject)drt_rm.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 9256L)
    public static SubLObject drt_rm_formula_properties(final SubLObject rm_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!rm_formula.isCons()) {
            return Values.values((SubLObject)drt_rm.NIL, rm_formula);
        }
        final SubLObject poss_rm_wrapper_keyword = drt_rm_wrapper_fn_to_keyword(rm_formula.first());
        if (poss_rm_wrapper_keyword == drt_rm.$kw60$PRONOMIAL) {
            return Values.values(drt_pronoun_formula_to_property_pairs(rm_formula), (SubLObject)drt_rm.NIL);
        }
        if (poss_rm_wrapper_keyword == drt_rm.$kw61$SOMEFN) {
            return Values.values((SubLObject)drt_rm.NIL, conses_high.second(rm_formula));
        }
        if (poss_rm_wrapper_keyword.isKeyword()) {
            thread.resetMultipleValues();
            final SubLObject recurse_property_pairs = drt_rm_formula_properties(conses_high.third(rm_formula));
            final SubLObject recurse_root_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (drt_rm.NIL != conses_high.assoc(poss_rm_wrapper_keyword, recurse_property_pairs, (SubLObject)drt_rm.UNPROVIDED, (SubLObject)drt_rm.UNPROVIDED) && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_rm.ONE_INTEGER)) {
                Errors.warn((SubLObject)drt_rm.$str62$drt_rm_formula_properties___A_has, rm_formula, poss_rm_wrapper_keyword);
            }
            return Values.values((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(poss_rm_wrapper_keyword, conses_high.second(rm_formula)), recurse_property_pairs), recurse_root_term);
        }
        return Values.values((SubLObject)drt_rm.NIL, rm_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-rm.lisp", position = 10377L)
    public static SubLObject create_rm_from_rm_formula(final SubLObject rm_formula, SubLObject rm_formula_to_rm_mappings) {
        if (rm_formula_to_rm_mappings == drt_rm.UNPROVIDED) {
            rm_formula_to_rm_mappings = (SubLObject)drt_rm.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject property_pairs = drt_rm_formula_properties(rm_formula);
        final SubLObject root_term = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rm = methods.funcall_class_method_with_0_args((SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym63$NEW);
        SubLObject rm_mapped_formula = conses_high.copy_tree(root_term);
        SubLObject cdolist_list_var = rm_formula_to_rm_mappings;
        SubLObject rm_formula_to_rm_mapping = (SubLObject)drt_rm.NIL;
        rm_formula_to_rm_mapping = cdolist_list_var.first();
        while (drt_rm.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = rm_formula_to_rm_mapping;
            SubLObject prev_rm_formula = (SubLObject)drt_rm.NIL;
            SubLObject prev_rm = (SubLObject)drt_rm.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)drt_rm.$list64);
            prev_rm_formula = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)drt_rm.$list64);
            prev_rm = current.first();
            current = current.rest();
            if (drt_rm.NIL == current) {
                rm_mapped_formula = conses_high.subst(prev_rm, prev_rm_formula, rm_mapped_formula, Symbols.symbol_function((SubLObject)drt_rm.EQUAL), (SubLObject)drt_rm.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)drt_rm.$list64);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rm_formula_to_rm_mapping = cdolist_list_var.first();
        }
        instances.set_slot(rm, (SubLObject)drt_rm.$sym20$FORMULA, rm_formula);
        instances.set_slot(rm, (SubLObject)drt_rm.$sym19$MAPPED_FORMULA, rm_mapped_formula);
        instances.set_slot(rm, (SubLObject)drt_rm.$sym18$ROOT_TERM, root_term);
        cdolist_list_var = property_pairs;
        SubLObject property_pair = (SubLObject)drt_rm.NIL;
        property_pair = cdolist_list_var.first();
        while (drt_rm.NIL != cdolist_list_var) {
            final SubLObject property_keyword = property_pair.first();
            final SubLObject property_value = conses_high.second(property_pair);
            methods.funcall_instance_method_with_2_args(rm, (SubLObject)drt_rm.$sym26$SET_PROPERTY, property_keyword, property_value);
            cdolist_list_var = cdolist_list_var.rest();
            property_pair = cdolist_list_var.first();
        }
        return rm;
    }
    
    public static SubLObject declare_drt_rm_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "real_rm", "REAL-RM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "map_rm", "MAP-RM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_syntactic_role", "GET-RM-SYNTACTIC-ROLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_syntactic_role", "SET-RM-SYNTACTIC-ROLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_number", "GET-RM-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_number", "SET-RM-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_gender", "GET-RM-GENDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_gender", "SET-RM-GENDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_quant", "GET-RM-QUANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_quant", "SET-RM-QUANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_definiteness", "GET-RM-DEFINITENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_definiteness", "SET-RM-DEFINITENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_conditions", "GET-RM-CONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_conditions", "SET-RM-CONDITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_scope", "GET-RM-SCOPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_scope", "SET-RM-SCOPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_target_term", "GET-RM-TARGET-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_target_term", "SET-RM-TARGET-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_target_var", "GET-RM-TARGET-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_target_var", "SET-RM-TARGET-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_type", "GET-RM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_type", "SET-RM-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_sub_rms", "GET-RM-SUB-RMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_sub_rms", "SET-RM-SUB-RMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_super_rm", "GET-RM-SUPER-RM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_super_rm", "SET-RM-SUPER-RM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_root_term", "GET-RM-ROOT-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_root_term", "SET-RM-ROOT-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_mapped_formula", "GET-RM-MAPPED-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_mapped_formula", "SET-RM-MAPPED-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "get_rm_formula", "GET-RM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "set_rm_formula", "SET-RM-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "subloop_reserved_initialize_rm_class", "SUBLOOP-RESERVED-INITIALIZE-RM-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "subloop_reserved_initialize_rm_instance", "SUBLOOP-RESERVED-INITIALIZE-RM-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "rm_p", "RM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "rm_set_property_method", "RM-SET-PROPERTY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "rm_construct_cycl_method", "RM-CONSTRUCT-CYCL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "rm_coreference_probability_method", "RM-COREFERENCE-PROBABILITY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "drt_rm_wrapper_fn_p", "DRT-RM-WRAPPER-FN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "drt_rm_wrapper_fn_to_keyword", "DRT-RM-WRAPPER-FN-TO-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "drt_possible_rm_formula", "DRT-POSSIBLE-RM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "drt_find_rm_formulas", "DRT-FIND-RM-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "drt_pronoun_formula_to_property_pairs", "DRT-PRONOUN-FORMULA-TO-PROPERTY-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "drt_rm_formula_properties", "DRT-RM-FORMULA-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_rm", "create_rm_from_rm_formula", "CREATE-RM-FROM-RM-FORMULA", 1, 1, false);
        return (SubLObject)drt_rm.NIL;
    }
    
    public static SubLObject init_drt_rm_file() {
        drt_rm.$drt_rm_wrapper_fns$ = SubLFiles.defparameter("*DRT-RM-WRAPPER-FNS*", (SubLObject)drt_rm.$list55);
        drt_rm.$drt_rm_wrapper_fns_to_keywords$ = SubLFiles.defparameter("*DRT-RM-WRAPPER-FNS-TO-KEYWORDS*", (SubLObject)drt_rm.$list56);
        return (SubLObject)drt_rm.NIL;
    }
    
    public static SubLObject setup_drt_rm_file() {
        classes.subloop_new_class((SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym5$OBJECT, (SubLObject)drt_rm.NIL, (SubLObject)drt_rm.NIL, (SubLObject)drt_rm.$list6);
        classes.class_set_implements_slot_listeners((SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym22$SUBLOOP_RESERVED_INITIALIZE_RM_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym25$SUBLOOP_RESERVED_INITIALIZE_RM_INSTANCE);
        subloop_reserved_initialize_rm_class((SubLObject)drt_rm.$sym4$RM);
        methods.methods_incorporate_instance_method((SubLObject)drt_rm.$sym26$SET_PROPERTY, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.NIL, (SubLObject)drt_rm.$list27, (SubLObject)drt_rm.$list28);
        methods.subloop_register_instance_method((SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym26$SET_PROPERTY, (SubLObject)drt_rm.$sym40$RM_SET_PROPERTY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_rm.$sym41$CONSTRUCT_CYCL, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.NIL, (SubLObject)drt_rm.NIL, (SubLObject)drt_rm.$list42);
        methods.subloop_register_instance_method((SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym41$CONSTRUCT_CYCL, (SubLObject)drt_rm.$sym47$RM_CONSTRUCT_CYCL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_rm.$sym48$COREFERENCE_PROBABILITY, (SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.NIL, (SubLObject)drt_rm.$list49, (SubLObject)drt_rm.$list50);
        methods.subloop_register_instance_method((SubLObject)drt_rm.$sym4$RM, (SubLObject)drt_rm.$sym48$COREFERENCE_PROBABILITY, (SubLObject)drt_rm.$sym54$RM_COREFERENCE_PROBABILITY_METHOD);
        return (SubLObject)drt_rm.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_drt_rm_file();
    }
    
    @Override
	public void initializeVariables() {
        init_drt_rm_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_drt_rm_file();
    }
    
    static {
        me = (SubLFile)new drt_rm();
        drt_rm.$drt_rm_wrapper_fns$ = null;
        drt_rm.$drt_rm_wrapper_fns_to_keywords$ = null;
        $sym0$TARGET_TERM = SubLObjectFactory.makeSymbol("TARGET-TERM");
        $str1$_______________________RM_MAPPING = SubLObjectFactory.makeString("~%******************** RM MAPPING ********************~%");
        $str2$_A_has_been_mapped_to__A__ = SubLObjectFactory.makeString("~A has been mapped to ~A~%");
        $str3$map_rm___A_was_mapped_to__A__now_ = SubLObjectFactory.makeString("map-rm: ~A was mapped to ~A, now to ~A~%");
        $sym4$RM = SubLObjectFactory.makeSymbol("RM");
        $sym5$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list6 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPPED-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOT-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPER-RM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-RMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINITENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENDER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNTACTIC-ROLE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PROPERTY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COREFERENCE-PROBABILITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-RM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-CYCL"), (SubLObject)drt_rm.NIL) });
        $sym7$SYNTACTIC_ROLE = SubLObjectFactory.makeSymbol("SYNTACTIC-ROLE");
        $sym8$NUMBER = SubLObjectFactory.makeSymbol("NUMBER");
        $sym9$GENDER = SubLObjectFactory.makeSymbol("GENDER");
        $sym10$QUANT = SubLObjectFactory.makeSymbol("QUANT");
        $sym11$DEFINITENESS = SubLObjectFactory.makeSymbol("DEFINITENESS");
        $sym12$CONDITIONS = SubLObjectFactory.makeSymbol("CONDITIONS");
        $sym13$SCOPE = SubLObjectFactory.makeSymbol("SCOPE");
        $sym14$TARGET_VAR = SubLObjectFactory.makeSymbol("TARGET-VAR");
        $sym15$TYPE = SubLObjectFactory.makeSymbol("TYPE");
        $sym16$SUB_RMS = SubLObjectFactory.makeSymbol("SUB-RMS");
        $sym17$SUPER_RM = SubLObjectFactory.makeSymbol("SUPER-RM");
        $sym18$ROOT_TERM = SubLObjectFactory.makeSymbol("ROOT-TERM");
        $sym19$MAPPED_FORMULA = SubLObjectFactory.makeSymbol("MAPPED-FORMULA");
        $sym20$FORMULA = SubLObjectFactory.makeSymbol("FORMULA");
        $sym21$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym22$SUBLOOP_RESERVED_INITIALIZE_RM_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RM-CLASS");
        $sym23$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym24$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym25$SUBLOOP_RESERVED_INITIALIZE_RM_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RM-INSTANCE");
        $sym26$SET_PROPERTY = SubLObjectFactory.makeSymbol("SET-PROPERTY");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Sets the property of this RM indicated by PROPERTY-KEYWORD to NEW-PROPERTY-VALUE."), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PCASE"), SubLObjectFactory.makeSymbol("PROPERTY-KEYWORD"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFINITENESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITENESS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)drt_rm.EQ, (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DEFINITE")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)drt_rm.EQ, (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperName-NLAttr"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-TERM")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENDER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SYNTACTIC-ROLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SYNTACTIC-ROLE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("~%(rm-set-property-method ~A) property keyword/value ~A/~A invalid"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTY-VALUE"))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym29$OUTER_CATCH_FOR_RM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RM-METHOD");
        $kw30$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw31$DEFINITENESS = SubLObjectFactory.makeKeyword("DEFINITENESS");
        $const32$Definite_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr"));
        $kw33$DEFINITE = SubLObjectFactory.makeKeyword("DEFINITE");
        $kw34$QUANT = SubLObjectFactory.makeKeyword("QUANT");
        $const35$ProperName_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperName-NLAttr"));
        $kw36$GENDER = SubLObjectFactory.makeKeyword("GENDER");
        $kw37$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw38$SYNTACTIC_ROLE = SubLObjectFactory.makeKeyword("SYNTACTIC-ROLE");
        $str39$___rm_set_property_method__A__pro = SubLObjectFactory.makeString("~%(rm-set-property-method ~A) property keyword/value ~A/~A invalid");
        $sym40$RM_SET_PROPERTY_METHOD = SubLObjectFactory.makeSymbol("RM-SET-PROPERTY-METHOD");
        $sym41$CONSTRUCT_CYCL = SubLObjectFactory.makeSymbol("CONSTRUCT-CYCL");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Constructs the cycl that this RM can be represented with."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("~%(rm-construct-cycl-method ~A) both target-var (~A) and target-term (~A) are set: using target-var"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOT-TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("~%(rm-construct-cycl-method ~A) niether target-var nor target-term are set: using root-term (~A)"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-TERM"))), (SubLObject)ConsesLow.list((SubLObject)drt_rm.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("~%(rm-construct-cycl-method ~A) no match."), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)drt_rm.NIL))));
        $sym43$OUTER_CATCH_FOR_RM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RM-METHOD");
        $str44$___rm_construct_cycl_method__A__b = SubLObjectFactory.makeString("~%(rm-construct-cycl-method ~A) both target-var (~A) and target-term (~A) are set: using target-var");
        $str45$___rm_construct_cycl_method__A__n = SubLObjectFactory.makeString("~%(rm-construct-cycl-method ~A) niether target-var nor target-term are set: using root-term (~A)");
        $str46$___rm_construct_cycl_method__A__n = SubLObjectFactory.makeString("~%(rm-construct-cycl-method ~A) no match.");
        $sym47$RM_CONSTRUCT_CYCL_METHOD = SubLObjectFactory.makeSymbol("RM-CONSTRUCT-CYCL-METHOD");
        $sym48$COREFERENCE_PROBABILITY = SubLObjectFactory.makeSymbol("COREFERENCE-PROBABILITY");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-RM"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Determines the probability that this RM can corefer to TARGET-RM.\n@returns a number between 0 and 1, or nil if no coreference is possible.\n@note This is a simple initial implementation..."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)drt_rm.EQ, (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)drt_rm.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-FIND"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)drt_rm.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeDouble(0.0))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"), (SubLObject)SubLObjectFactory.makeDouble(0.0))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)drt_rm.EQ, (SubLObject)SubLObjectFactory.makeSymbol("GENDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GENDER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"), (SubLObject)SubLObjectFactory.makeDouble(0.5)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)drt_rm.EQ, (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"), (SubLObject)SubLObjectFactory.makeDouble(0.5)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PROBABILITY"))));
        $sym51$OUTER_CATCH_FOR_RM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-RM-METHOD");
        $float52$0_0 = (SubLFloat)SubLObjectFactory.makeDouble(0.0);
        $float53$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $sym54$RM_COREFERENCE_PROBABILITY_METHOD = SubLObjectFactory.makeSymbol("RM-COREFERENCE-PROBABILITY-METHOD");
        $list55 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSemFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTagFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PronounFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn")));
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSemFn")), (SubLObject)SubLObjectFactory.makeKeyword("SEM")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3")), (SubLObject)SubLObjectFactory.makeKeyword("DEFINITENESS")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")), (SubLObject)SubLObjectFactory.makeKeyword("QUANT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTagFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PronounFn")), (SubLObject)SubLObjectFactory.makeKeyword("PRONOMIAL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn")), (SubLObject)SubLObjectFactory.makeKeyword("SOMEFN")));
        $sym57$DRT_POSSIBLE_RM_FORMULA = SubLObjectFactory.makeSymbol("DRT-POSSIBLE-RM-FORMULA");
        $const58$SubcollectionFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionFunction"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PRONOMIAL"));
        $kw60$PRONOMIAL = SubLObjectFactory.makeKeyword("PRONOMIAL");
        $kw61$SOMEFN = SubLObjectFactory.makeKeyword("SOMEFN");
        $str62$drt_rm_formula_properties___A_has = SubLObjectFactory.makeString("drt-rm-formula-properties: ~A has multiple ~A properties");
        $sym63$NEW = SubLObjectFactory.makeSymbol("NEW");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREV-RM-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-RM"));
    }
}

/*

	Total time: 211 ms
	
*/