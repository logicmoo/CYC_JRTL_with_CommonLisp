package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_variable_handling extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_variable_handling";
    public static final String myFingerPrint = "8c698277d6b585838ccd09f85d31ac14b307b32febc9a1632e3c679ab3d45393";
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLSymbol $dtp_pph_var_entry$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 3060L)
    private static SubLSymbol $pph_default_var_type$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 6764L)
    public static SubLSymbol $pph_hypothesized_vars$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 14104L)
    public static SubLSymbol $pph_different_vars$;
    private static final SubLSymbol $sym0$PPH_VAR_ENTRY;
    private static final SubLSymbol $sym1$PPH_VAR_ENTRY_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PPRINT_PPH_VAR_ENTRY;
    private static final SubLSymbol $sym7$PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PPH_VAR_ENTRY_VAR;
    private static final SubLSymbol $sym10$_CSETF_PPH_VAR_ENTRY_VAR;
    private static final SubLSymbol $sym11$PPH_VAR_ENTRY_TYPE;
    private static final SubLSymbol $sym12$_CSETF_PPH_VAR_ENTRY_TYPE;
    private static final SubLSymbol $sym13$PPH_VAR_ENTRY_QUANTIFIER;
    private static final SubLSymbol $sym14$_CSETF_PPH_VAR_ENTRY_QUANTIFIER;
    private static final SubLSymbol $sym15$PPH_VAR_ENTRY_SINGLE_USE_;
    private static final SubLSymbol $sym16$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_;
    private static final SubLSymbol $sym17$PPH_VAR_ENTRY_ARG_POSITION;
    private static final SubLSymbol $sym18$_CSETF_PPH_VAR_ENTRY_ARG_POSITION;
    private static final SubLSymbol $kw19$VAR;
    private static final SubLSymbol $kw20$TYPE;
    private static final SubLSymbol $kw21$QUANTIFIER;
    private static final SubLSymbol $kw22$SINGLE_USE_;
    private static final SubLSymbol $kw23$ARG_POSITION;
    private static final SubLString $str24$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw25$BEGIN;
    private static final SubLSymbol $sym26$MAKE_PPH_VAR_ENTRY;
    private static final SubLSymbol $kw27$SLOT;
    private static final SubLSymbol $kw28$END;
    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_PPH_VAR_ENTRY_METHOD;
    private static final SubLString $str30$__PPH_VAR_ENTRY___S__S__S__S_;
    private static final SubLObject $const31$Thing;
    private static final SubLString $str32$_PPH_error_level_;
    private static final SubLString $str33$__;
    private static final SubLString $str34$Non_EL_var___S;
    private static final SubLString $str35$Registering__S_as__S___;
    private static final SubLSymbol $sym36$PPH_DEREGISTER_VAR;
    private static final SubLList $list37;
    private static final SubLString $str38$___S_is_not_a_quantifier_keyword_;
    private static final SubLObject $const39$ExistentialQuantifier;
    private static final SubLSymbol $kw40$EXISTENTIAL;
    private static final SubLObject $const41$forAll;
    private static final SubLSymbol $kw42$UNIVERSAL;
    private static final SubLSymbol $kw43$SCOPED;
    private static final SubLSymbol $kw44$IGNORE;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$CLET;
    private static final SubLSymbol $sym47$_PPH_HYPOTHESIZED_VARS_;
    private static final SubLSymbol $sym48$CCONCATENATE;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$PPH_EXISTENTIAL_VAR_P;
    private static final SubLString $str51$__Registering__S_as_a_query_var__;
    private static final SubLSymbol $kw52$QUERY;
    private static final SubLString $str53$PPH_REGISTER_VAR_AS_USED_ONLY_ONC;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$DO_DICTIONARY;
    private static final SubLSymbol $sym56$_PPH_VAR_TYPES_;
    private static final SubLSymbol $sym57$PPH_SPEC_;
    private static final SubLSymbol $sym58$PPH_STRING_IS_POS_;
    private static final SubLSymbol $kw59$NEVER;
    private static final SubLSymbol $kw60$TEXT;
    private static final SubLInteger $int61$128;
    private static final SubLObject $const62$Pronoun;
    private static final SubLString $str63$__Noted___S_is_a__S___;
    private static final SubLString $str64$other;
    private static final SubLString $str65$_other_;
    private static final SubLString $str66$other_;
    private static final SubLString $str67$_another;
    private static final SubLString $str68$another;
    private static final SubLSymbol $sym69$PPH_FORMULA_FREE_VARIABLES;
    private static final SubLSymbol $sym70$EL_VAR_;
    private static final SubLInteger $int71$98;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLObject $const74$quotedCollection;
    private static final SubLSymbol $sym75$PPH_OPERATOR_ARG_SCOPED_;
    private static final SubLInteger $int76$200;
    private static final SubLSymbol $sym77$PPH_OPERATOR_ARG_QUOTED_;
    private static final SubLSymbol $sym78$PPH_VALID_VAR_TYPE_;
    private static final SubLSymbol $kw79$CNF;
    private static final SubLSymbol $kw80$DNF;
    private static final SubLList $list81;
    private static final SubLObject $const82$CycLVariable;
    private static final SubLSymbol $sym83$SPECS_FN_NAT_;
    private static final SubLString $str84$Removing_non_SpecsFn_terms_from__;
    private static final SubLSymbol $sym85$PPH_GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym86$PPH_CLAUSAL_FORM;
    private static final SubLInteger $int87$32;
    private static final SubLSymbol $sym88$PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT;
    private static final SubLObject $const89$FamilyRelationSlot;
    private static final SubLObject $const90$Agent_Generic;
    private static final SubLList $list91;
    private static final SubLSymbol $kw92$ISA;
    private static final SubLSymbol $kw93$GENL;
    private static final SubLSymbol $kw94$NOT_DISJOINT;
    private static final SubLInteger $int95$100;
    private static final SubLSymbol $sym96$PPH_MAKE_TYPE_LEVEL;
    private static final SubLSymbol $sym97$PPH_TRUTH_PRESERVING_OPERATOR_;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLObject $const100$extentCardinality;
    private static final SubLObject $const101$trueSentence;
    private static final SubLObject $const102$holdsSometimeDuring;
    private static final SubLObject $const103$ist;
    private static final SubLSymbol $sym104$EL_EXISTENTIAL_P;
    private static final SubLSymbol $sym105$QUANTIFIED_SUB_SENTENCE;
    private static final SubLSymbol $sym106$PPH_MIN_VARIABLE_ISA_CONSTRAINT;
    private static final SubLString $str107$Constraints_on__S_are__S_____choo;
    private static final SubLSymbol $sym108$PPH_FIND_MOST_SPECIFIC;
    private static final SubLSymbol $sym109$QUOTE;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject pph_var_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_var_entry(v_object, stream, (SubLObject)pph_variable_handling.ZERO_INTEGER);
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject pph_var_entry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $pph_var_entry_native.class) ? pph_variable_handling.T : pph_variable_handling.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject pph_var_entry_var(final SubLObject v_object) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject pph_var_entry_type(final SubLObject v_object) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject pph_var_entry_quantifier(final SubLObject v_object) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject pph_var_entry_single_useP(final SubLObject v_object) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject pph_var_entry_arg_position(final SubLObject v_object) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject _csetf_pph_var_entry_var(final SubLObject v_object, final SubLObject value) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject _csetf_pph_var_entry_type(final SubLObject v_object, final SubLObject value) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject _csetf_pph_var_entry_quantifier(final SubLObject v_object, final SubLObject value) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject _csetf_pph_var_entry_single_useP(final SubLObject v_object, final SubLObject value) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject _csetf_pph_var_entry_arg_position(final SubLObject v_object, final SubLObject value) {
        assert pph_variable_handling.NIL != pph_var_entry_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject make_pph_var_entry(SubLObject arglist) {
        if (arglist == pph_variable_handling.UNPROVIDED) {
            arglist = (SubLObject)pph_variable_handling.NIL;
        }
        final SubLObject v_new = (SubLObject)new $pph_var_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)pph_variable_handling.NIL, next = arglist; pph_variable_handling.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)pph_variable_handling.$kw19$VAR)) {
                _csetf_pph_var_entry_var(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_variable_handling.$kw20$TYPE)) {
                _csetf_pph_var_entry_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_variable_handling.$kw21$QUANTIFIER)) {
                _csetf_pph_var_entry_quantifier(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_variable_handling.$kw22$SINGLE_USE_)) {
                _csetf_pph_var_entry_single_useP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)pph_variable_handling.$kw23$ARG_POSITION)) {
                _csetf_pph_var_entry_arg_position(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)pph_variable_handling.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject visit_defstruct_pph_var_entry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_variable_handling.$kw25$BEGIN, (SubLObject)pph_variable_handling.$sym26$MAKE_PPH_VAR_ENTRY, (SubLObject)pph_variable_handling.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_variable_handling.$kw27$SLOT, (SubLObject)pph_variable_handling.$kw19$VAR, pph_var_entry_var(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_variable_handling.$kw27$SLOT, (SubLObject)pph_variable_handling.$kw20$TYPE, pph_var_entry_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_variable_handling.$kw27$SLOT, (SubLObject)pph_variable_handling.$kw21$QUANTIFIER, pph_var_entry_quantifier(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_variable_handling.$kw27$SLOT, (SubLObject)pph_variable_handling.$kw22$SINGLE_USE_, pph_var_entry_single_useP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_variable_handling.$kw27$SLOT, (SubLObject)pph_variable_handling.$kw23$ARG_POSITION, pph_var_entry_arg_position(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)pph_variable_handling.$kw28$END, (SubLObject)pph_variable_handling.$sym26$MAKE_PPH_VAR_ENTRY, (SubLObject)pph_variable_handling.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 849L)
    public static SubLObject visit_defstruct_object_pph_var_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_var_entry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 1080L)
    public static SubLObject pprint_pph_var_entry(final SubLObject var_entry, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)pph_variable_handling.$str30$__PPH_VAR_ENTRY___S__S__S__S_, new SubLObject[] { pph_var_entry_var(var_entry), pph_var_entry_type(var_entry), pph_var_entry_arg_position(var_entry), pph_var_entry_quantifier(var_entry) });
        return var_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 1423L)
    public static SubLObject new_pph_var_entry(final SubLObject var, SubLObject type, SubLObject type_map, SubLObject quantifier, SubLObject single_useP) {
        if (type == pph_variable_handling.UNPROVIDED) {
            type = pph_default_var_type();
        }
        if (type_map == pph_variable_handling.UNPROVIDED) {
            type_map = pph_utilities.pph_new_empty_map();
        }
        if (quantifier == pph_variable_handling.UNPROVIDED) {
            quantifier = (SubLObject)pph_variable_handling.NIL;
        }
        if (single_useP == pph_variable_handling.UNPROVIDED) {
            single_useP = (SubLObject)pph_variable_handling.NIL;
        }
        final SubLObject new_var_entry = make_pph_var_entry((SubLObject)pph_variable_handling.UNPROVIDED);
        _csetf_pph_var_entry_var(new_var_entry, var);
        _csetf_pph_var_entry_type(new_var_entry, type);
        _csetf_pph_var_entry_arg_position(new_var_entry, type_map);
        _csetf_pph_var_entry_quantifier(new_var_entry, quantifier);
        _csetf_pph_var_entry_single_useP(new_var_entry, single_useP);
        return new_var_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 1960L)
    public static SubLObject pph_var_entry_copy(final SubLObject old_entry) {
        final SubLObject var = pph_var_entry_var(old_entry);
        final SubLObject type = pph_var_entry_type(old_entry);
        final SubLObject arg_position = pph_var_entry_arg_position(old_entry);
        final SubLObject quantifier = pph_var_entry_quantifier(old_entry);
        final SubLObject single_useP = pph_var_entry_single_useP(old_entry);
        return new_pph_var_entry(var, type, arg_position, quantifier, single_useP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 2333L)
    public static SubLObject set_pph_var_type(final SubLObject var_entry, final SubLObject type) {
        _csetf_pph_var_entry_type(var_entry, type);
        return var_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 2496L)
    public static SubLObject set_pph_var_type_map(final SubLObject var_entry, final SubLObject map) {
        _csetf_pph_var_entry_arg_position(var_entry, map);
        return var_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 2715L)
    public static SubLObject set_pph_var_quantifier(final SubLObject var_entry, final SubLObject quantifier) {
        _csetf_pph_var_entry_quantifier(var_entry, quantifier);
        return var_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 2902L)
    public static SubLObject clear_pph_var_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 3167L)
    public static SubLObject pph_default_var_type() {
        return pph_variable_handling.$pph_default_var_type$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 3242L)
    public static SubLObject pph_registered_vars() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_keys(pph_vars.$pph_var_types$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 3327L)
    public static SubLObject pph_var_entry(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_variable_handling.NIL == cycl_variables.el_varP(var)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_variable_handling.$str32$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_variable_handling.ONE_INTEGER), pph_variable_handling.$str33$__, format_nil.format_nil_a_no_copy((SubLObject)pph_variable_handling.$str34$Non_EL_var___S) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(var));
        }
        return (SubLObject)((pph_variable_handling.NIL != cycl_variables.el_varP(var)) ? dictionary.dictionary_lookup(pph_vars.$pph_var_types$.getDynamicValue(thread), var, (SubLObject)pph_variable_handling.UNPROVIDED) : pph_variable_handling.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 3553L)
    public static SubLObject pph_var_entries(final SubLObject vars) {
        return Mapping.mapcar((SubLObject)pph_variable_handling.$sym0$PPH_VAR_ENTRY, vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 3633L)
    public static SubLObject pph_var_registeredP(final SubLObject var) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != pph_vars.pph_tracking_var_types_p() && pph_variable_handling.NIL != pph_var_entry(var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 3787L)
    public static SubLObject pph_var_registered_as_defaultP(final SubLObject var) {
        return Equality.eq(pph_var_type(var), pph_default_var_type());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 3959L)
    public static SubLObject pph_register_var(final SubLObject var, SubLObject type, SubLObject type_map) {
        if (type == pph_variable_handling.UNPROVIDED) {
            type = pph_default_var_type();
        }
        if (type_map == pph_variable_handling.UNPROVIDED) {
            type_map = pph_utilities.pph_new_empty_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_variable_handling.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_variable_handling.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_variable_handling.T, (SubLObject)pph_variable_handling.$str35$Registering__S_as__S___, var, type, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        }
        final SubLObject existing = pph_var_entry(var);
        final SubLObject v_new = (pph_variable_handling.NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        set_pph_var_type(v_new, type);
        set_pph_var_type_map(v_new, type_map);
        dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
        pph_note_var_type(var, type);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 4541L)
    public static SubLObject pph_update_var_type(final SubLObject var, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = pph_var_entry(var);
        final SubLObject v_new = (pph_variable_handling.NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        set_pph_var_type(v_new, type);
        if (pph_variable_handling.NIL == existing) {
            set_pph_var_type_map(v_new, pph_utilities.pph_new_empty_map());
        }
        dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
        pph_note_var_type(var, type);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 5047L)
    public static SubLObject pph_deregister_var(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.dictionary_remove(pph_vars.$pph_var_types$.getDynamicValue(thread), var);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 5158L)
    public static SubLObject pph_deregister_vars(final SubLObject vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Mapping.mapcar((SubLObject)pph_variable_handling.$sym36$PPH_DEREGISTER_VAR, vars);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 5265L)
    public static SubLObject pph_var_quantifiedP(final SubLObject var) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != pph_var_registeredP(var) && pph_variable_handling.NIL != conses_high.member(pph_var_quantifier(var), (SubLObject)pph_variable_handling.$list37, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 5423L)
    public static SubLObject pph_register_var_quantifier(final SubLObject var, final SubLObject quantifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_variable_handling.NIL == pph_vars.pph_quantifier_keyword_p(quantifier)) {
            if (pph_variable_handling.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_variable_handling.TWO_INTEGER) && pph_variable_handling.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_variable_handling.$str38$___S_is_not_a_quantifier_keyword_, quantifier, pph_vars.pph_quantifier_keywords());
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return (SubLObject)pph_variable_handling.NIL;
        }
        final SubLObject existing = pph_var_entry(var);
        final SubLObject v_new = (pph_variable_handling.NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        set_pph_var_quantifier(v_new, quantifier);
        dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 5889L)
    public static SubLObject pph_quantifier_for_operator(final SubLObject operator) {
        if (pph_variable_handling.NIL != pph_utilities.pph_isaP(operator, pph_variable_handling.$const39$ExistentialQuantifier, (SubLObject)pph_variable_handling.UNPROVIDED)) {
            return (SubLObject)pph_variable_handling.$kw40$EXISTENTIAL;
        }
        if (operator.eql(pph_variable_handling.$const41$forAll)) {
            return (SubLObject)pph_variable_handling.$kw42$UNIVERSAL;
        }
        return (SubLObject)pph_variable_handling.$kw43$SCOPED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 6154L)
    public static SubLObject pph_register_scoped_vars(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_variable_handling.NIL != el_utilities.el_formula_p(formula) && pph_variable_handling.NIL != kb_indexing_datastructures.indexed_term_p(cycl_utilities.formula_arg0(formula))) {
            final SubLObject operator = cycl_utilities.formula_arg0(formula);
            final SubLObject scoping_args = kb_accessors.scoping_args(operator, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject quantifier = (SubLObject)((pph_variable_handling.NIL != scoping_args) ? pph_quantifier_for_operator(operator) : pph_variable_handling.NIL);
            SubLObject argnum = (SubLObject)pph_variable_handling.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)pph_variable_handling.$kw44$IGNORE);
            SubLObject arg = (SubLObject)pph_variable_handling.NIL;
            arg = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                argnum = Numbers.add(argnum, (SubLObject)pph_variable_handling.ONE_INTEGER);
                if (pph_variable_handling.NIL != conses_high.member(argnum, scoping_args, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED)) {
                    if (pph_variable_handling.NIL != cycl_variables.el_varP(arg) && pph_variable_handling.NIL == pph_var_quantifier(arg)) {
                        pph_register_var_quantifier(arg, quantifier);
                    }
                }
                else if (pph_variable_handling.NIL != el_utilities.el_formula_p(arg)) {
                    pph_register_scoped_vars(arg);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 6903L)
    public static SubLObject with_pph_hypothesized_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject vars = (SubLObject)pph_variable_handling.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list45);
        vars = current.first();
        current = current.rest();
        if (pph_variable_handling.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_variable_handling.$sym46$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_variable_handling.$sym47$_PPH_HYPOTHESIZED_VARS_, (SubLObject)ConsesLow.listS((SubLObject)pph_variable_handling.$sym48$CCONCATENATE, vars, (SubLObject)pph_variable_handling.$list49))), ConsesLow.append(body, (SubLObject)pph_variable_handling.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_variable_handling.$list45);
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 7071L)
    public static SubLObject pph_register_query_vars(final SubLObject query_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_vars = Sequences.remove_if((SubLObject)pph_variable_handling.$sym50$PPH_EXISTENTIAL_VAR_P, pph_formula_free_variables(query_formula, (SubLObject)pph_variable_handling.UNPROVIDED), (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        query_vars = conses_high.set_difference(query_vars, pph_variable_handling.$pph_hypothesized_vars$.getDynamicValue(thread), (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL != pph_question.pph_hypothesize_antecedent_varsP(query_formula)) {
            final SubLObject antecedent_vars = pph_utilities.pph_vars_to_quantify(cycl_utilities.formula_arg1(query_formula, (SubLObject)pph_variable_handling.UNPROVIDED));
            query_vars = conses_high.set_difference(query_vars, antecedent_vars, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        }
        SubLObject cdolist_list_var = query_vars;
        SubLObject query_var = (SubLObject)pph_variable_handling.NIL;
        query_var = cdolist_list_var.first();
        while (pph_variable_handling.NIL != cdolist_list_var) {
            if (pph_variable_handling.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_variable_handling.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_variable_handling.T, (SubLObject)pph_variable_handling.$str51$__Registering__S_as_a_query_var__, query_var, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
            }
            pph_register_var_quantifier(query_var, (SubLObject)pph_variable_handling.$kw52$QUERY);
            cdolist_list_var = cdolist_list_var.rest();
            query_var = cdolist_list_var.first();
        }
        return query_vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 7959L)
    public static SubLObject pph_query_var_p(final SubLObject var) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != cycl_variables.el_varP(var) && pph_variable_handling.$kw52$QUERY == pph_var_quantifier(var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 8073L)
    public static SubLObject pph_existential_var_p(final SubLObject var) {
        return Equality.eq((SubLObject)pph_variable_handling.$kw40$EXISTENTIAL, pph_var_quantifier(var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 8172L)
    public static SubLObject pph_note_if_var_is_used_only_once_in_formula(final SubLObject var, final SubLObject formula) {
        final SubLObject duplicateP = list_utilities.tree_countG(var, pph_strip_existentials(formula, (SubLObject)pph_variable_handling.UNPROVIDED), (SubLObject)pph_variable_handling.ONE_INTEGER, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == duplicateP) {
            pph_register_var_as_used_only_once(var);
        }
        return duplicateP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 8415L)
    public static SubLObject pph_register_var_as_used_only_once(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry = pph_var_entry(var);
        if (pph_variable_handling.NIL != pph_var_entry_p(entry)) {
            _csetf_pph_var_entry_single_useP(entry, (SubLObject)pph_variable_handling.T);
        }
        else if (pph_variable_handling.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_variable_handling.ONE_INTEGER) && pph_variable_handling.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_variable_handling.$str53$PPH_REGISTER_VAR_AS_USED_ONLY_ONC, var);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 8708L)
    public static SubLObject pph_var_used_only_onceP(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        return (SubLObject)((pph_variable_handling.NIL != entry) ? pph_var_entry_single_useP(entry) : pph_variable_handling.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 8855L)
    public static SubLObject pph_do_var_entries(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)pph_variable_handling.NIL;
        SubLObject var_entry = (SubLObject)pph_variable_handling.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list54);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list54);
        var_entry = current.first();
        current = current.rest();
        final SubLObject stop_var = (SubLObject)(current.isCons() ? current.first() : pph_variable_handling.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_variable_handling.$list54);
        current = current.rest();
        if (pph_variable_handling.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_variable_handling.$sym55$DO_DICTIONARY, (SubLObject)ConsesLow.list(var, var_entry, (SubLObject)pph_variable_handling.$sym56$_PPH_VAR_TYPES_, stop_var), ConsesLow.append(body, (SubLObject)pph_variable_handling.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_variable_handling.$list54);
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 9091L)
    public static SubLObject pph_var_quantifier(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        return (SubLObject)((pph_variable_handling.NIL != entry) ? pph_var_entry_quantifier(entry) : pph_variable_handling.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 9232L)
    public static SubLObject pph_var_type(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        return (pph_variable_handling.NIL != entry) ? pph_var_entry_type(entry) : pph_default_var_type();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 9480L)
    public static SubLObject pph_cycl_var_type(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        SubLObject var_type = (pph_variable_handling.NIL != entry) ? pph_var_entry_type(entry) : pph_default_var_type();
        while (pph_variable_handling.NIL != cycl_variables.el_varP(var_type)) {
            final SubLObject var_type_type = pph_var_type(var_type);
            if (pph_variable_handling.NIL != pph_utilities.specs_fn_natP(var_type_type)) {
                var_type = cycl_utilities.nat_arg1(var_type_type, (SubLObject)pph_variable_handling.UNPROVIDED);
            }
            else {
                var_type = pph_default_var_type();
            }
        }
        return var_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 9961L)
    public static SubLObject pph_type_arg_position_map(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        final SubLObject type_map = (pph_variable_handling.NIL != entry) ? pph_var_entry_arg_position(entry) : pph_utilities.pph_new_empty_map();
        return type_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 10332L)
    public static SubLObject pph_unregistered_variableP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != cycl_variables.el_varP(obj) && pph_variable_handling.NIL == pph_var_registeredP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 10507L)
    public static SubLObject pph_duplicate_var_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != pph_vars.pph_tracking_var_types_p() && Sequences.count(type, Mapping.mapcar(Symbols.symbol_function((SubLObject)pph_variable_handling.$sym11$PPH_VAR_ENTRY_TYPE), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread))), Symbols.symbol_function((SubLObject)pph_variable_handling.$sym57$PPH_SPEC_), (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED).numG((SubLObject)pph_variable_handling.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 10790L)
    public static SubLObject pph_var_paraphrased_explicitlyP(final SubLObject obj) {
        final SubLObject var_as_var_olist = pph_methods.pph_paraphrase_var_as_var(obj, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        final SubLObject var_as_var_string = pph_phrase.pph_phrase_output_list_string(var_as_var_olist, (SubLObject)pph_variable_handling.UNPROVIDED);
        SubLObject foundP = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == foundP) {
            SubLObject csome_list_var = pph_drs.pph_discourse_phrases_for_cycl(obj);
            SubLObject paraphrase = (SubLObject)pph_variable_handling.NIL;
            paraphrase = csome_list_var.first();
            while (pph_variable_handling.NIL == foundP && pph_variable_handling.NIL != csome_list_var) {
                if (pph_variable_handling.NIL != pph_phrase.pph_phrase_p(paraphrase, (SubLObject)pph_variable_handling.UNPROVIDED)) {
                    foundP = Equality.equal(var_as_var_string, pph_phrase.pph_phrase_string(paraphrase, (SubLObject)pph_variable_handling.UNPROVIDED));
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 11207L)
    public static SubLObject string_mentions_varP(final SubLObject string, final SubLObject var) {
        return string_utilities.substringP(pph_phrase.pph_phrase_output_list_string(pph_methods.pph_paraphrase_var_as_var(var, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED), (SubLObject)pph_variable_handling.NIL), string, Symbols.symbol_function((SubLObject)pph_variable_handling.EQUAL), (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 11377L)
    public static SubLObject pph_use_explicit_varP(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_variable_handling.NIL != pph_vars.pph_maximize_linksP()) {
            return (SubLObject)pph_variable_handling.T;
        }
        if (pph_variable_handling.NIL != pph_var_previously_explicitP(var)) {
            return (SubLObject)pph_variable_handling.T;
        }
        if (pph_variable_handling.NIL != pph_query_var_p(var)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL == pph_vars.$pph_use_wh_for_query_varsP$.getDynamicValue(thread));
        }
        if (pph_variable_handling.NIL != pph_var_used_only_onceP(var)) {
            return (SubLObject)pph_variable_handling.NIL;
        }
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 11719L)
    public static SubLObject pph_var_type_previously_explicit_if_mentionedP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread))); pph_variable_handling.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var_entry_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject var_entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (!pph_var_entry_type(var_entry).equal(type) || pph_variable_handling.NIL == pph_drs.pph_discourse_referentP(var_entry_var)) {
                return (SubLObject)pph_variable_handling.NIL;
            }
            SubLObject cdolist_list_var = pph_drs.pph_discourse_phrases_for_cycl(var_entry_var);
            SubLObject paraphrase = (SubLObject)pph_variable_handling.NIL;
            paraphrase = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                if (pph_variable_handling.NIL != pph_phrase.pph_phrase_p(paraphrase, (SubLObject)pph_variable_handling.UNPROVIDED) && pph_variable_handling.NIL != string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, (SubLObject)pph_variable_handling.NIL), var_entry_var)) {
                    return (SubLObject)pph_variable_handling.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                paraphrase = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 12399L)
    public static SubLObject pph_var_previously_explicitP(final SubLObject var) {
        final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
        SubLObject explicitP = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == explicitP) {
            SubLObject csome_list_var = paraphrases;
            SubLObject paraphrase = (SubLObject)pph_variable_handling.NIL;
            paraphrase = csome_list_var.first();
            while (pph_variable_handling.NIL == explicitP && pph_variable_handling.NIL != csome_list_var) {
                if (pph_variable_handling.NIL != pph_phrase.pph_phrase_p(paraphrase, (SubLObject)pph_variable_handling.UNPROVIDED)) {
                    explicitP = string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, (SubLObject)pph_variable_handling.NIL), var);
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            }
        }
        return explicitP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 12790L)
    public static SubLObject pph_var_previously_lexifiedP(final SubLObject var) {
        final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
        SubLObject lexifiedP = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == lexifiedP) {
            SubLObject csome_list_var = paraphrases;
            SubLObject paraphrase = (SubLObject)pph_variable_handling.NIL;
            paraphrase = csome_list_var.first();
            while (pph_variable_handling.NIL == lexifiedP && pph_variable_handling.NIL != csome_list_var) {
                if (pph_variable_handling.NIL == pph_phrase.pph_phrase_p(paraphrase, (SubLObject)pph_variable_handling.UNPROVIDED) || pph_variable_handling.NIL == string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, (SubLObject)pph_variable_handling.NIL), var)) {
                    lexifiedP = (SubLObject)pph_variable_handling.T;
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            }
        }
        return lexifiedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 13208L)
    public static SubLObject pph_string_is_posP_internal(final SubLObject string, final SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
        if (parse_morphologically == pph_variable_handling.UNPROVIDED) {
            parse_morphologically = (SubLObject)pph_variable_handling.$kw59$NEVER;
        }
        if (mt == pph_variable_handling.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_variable_handling.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$allow_utf8_in_pph_text_mode$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            pph_vars.$allow_utf8_in_pph_text_mode$.bind((SubLObject)pph_variable_handling.T, thread);
            lexicon_vars.$parse_morphologically$.bind(parse_morphologically, thread);
            final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    ans = lexicon_accessors.string_is_posP(pph_string.pph_string_if_non_null_to_output_format(string, (SubLObject)pph_variable_handling.$kw60$TEXT), pos, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_variable_handling.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            lexicon_vars.$parse_morphologically$.rebind(_prev_bind_3, thread);
            pph_vars.$allow_utf8_in_pph_text_mode$.rebind(_prev_bind_2, thread);
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 13208L)
    public static SubLObject pph_string_is_posP(final SubLObject string, final SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
        if (parse_morphologically == pph_variable_handling.UNPROVIDED) {
            parse_morphologically = (SubLObject)pph_variable_handling.$kw59$NEVER;
        }
        if (mt == pph_variable_handling.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_string_is_posP_internal(string, pos, parse_morphologically, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym58$PPH_STRING_IS_POS_, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym58$PPH_STRING_IS_POS_, (SubLObject)pph_variable_handling.FOUR_INTEGER, (SubLObject)pph_variable_handling.$int61$128, (SubLObject)pph_variable_handling.EQUAL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym58$PPH_STRING_IS_POS_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(string, pos, parse_morphologically, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (parse_morphologically.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_string_is_posP_internal(string, pos, parse_morphologically, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, pos, parse_morphologically, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 13718L)
    public static SubLObject pph_var_previously_pronounP(final SubLObject var) {
        final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
        SubLObject pronounP = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == pronounP) {
            SubLObject csome_list_var = paraphrases;
            SubLObject paraphrase = (SubLObject)pph_variable_handling.NIL;
            paraphrase = csome_list_var.first();
            while (pph_variable_handling.NIL == pronounP && pph_variable_handling.NIL != csome_list_var) {
                if (pph_variable_handling.NIL != pph_phrase.pph_phrase_p(paraphrase, (SubLObject)pph_variable_handling.UNPROVIDED)) {
                    pronounP = pph_string_is_posP(pph_phrase.pph_phrase_string(paraphrase, (SubLObject)pph_variable_handling.NIL), pph_variable_handling.$const62$Pronoun, (SubLObject)pph_variable_handling.$kw59$NEVER, (SubLObject)pph_variable_handling.UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            }
        }
        return pronounP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 14174L)
    public static SubLObject pph_register_vars_as_different(final SubLObject var1, final SubLObject var2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_variable_handling.$pph_different_vars$.setDynamicValue(list_utilities.alist_enter(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), var1, var2, (SubLObject)pph_variable_handling.UNPROVIDED), thread);
        return pph_variable_handling.$pph_different_vars$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 14342L)
    public static SubLObject pph_different_varsP(final SubLObject var1, final SubLObject var2, SubLObject strictP) {
        if (strictP == pph_variable_handling.UNPROVIDED) {
            strictP = (SubLObject)pph_variable_handling.T;
        }
        if (pph_variable_handling.NIL != strictP) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != pph_different_varsP_int(var1, var2) || pph_variable_handling.NIL != pph_different_varsP_int(var2, var1));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(!var1.eql(var2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 14730L)
    public static SubLObject pph_different_varsP_int(final SubLObject var1, final SubLObject var2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eql(var2, list_utilities.alist_lookup(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), var1, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 14844L)
    public static SubLObject pph_note_var_type(final SubLObject var, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_variable_handling.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
            dictionary_utilities.dictionary_pushnew(pph_vars.$pph_noted_var_types$.getDynamicValue(thread), var, type, Symbols.symbol_function((SubLObject)pph_variable_handling.EQUAL), (SubLObject)pph_variable_handling.UNPROVIDED);
            if (pph_variable_handling.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_variable_handling.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_variable_handling.T, (SubLObject)pph_variable_handling.$str63$__Noted___S_is_a__S___, var, type, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
            }
        }
        return var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 15116L)
    public static SubLObject pph_other_vars_with_var_type(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject other_vars = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
            final SubLObject type = pph_var_type(var);
            SubLObject found_varP = (SubLObject)pph_variable_handling.NIL;
            SubLObject cdolist_list_var = pph_vars_with_type(type);
            SubLObject other_var = (SubLObject)pph_variable_handling.NIL;
            other_var = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                if (other_var.equal(var)) {
                    found_varP = (SubLObject)pph_variable_handling.T;
                }
                else {
                    other_vars = (SubLObject)ConsesLow.cons(other_var, other_vars);
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_var = cdolist_list_var.first();
            }
        }
        return other_vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 15560L)
    public static SubLObject pph_vars_with_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vars = (SubLObject)pph_variable_handling.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))); pph_variable_handling.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject var_types = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = var_types;
            SubLObject var_type = (SubLObject)pph_variable_handling.NIL;
            var_type = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                if (pph_variable_handling.NIL != pph_utilities.pph_genlP(var_type, type, (SubLObject)pph_variable_handling.UNPROVIDED)) {
                    vars = (SubLObject)ConsesLow.cons(var, vars);
                }
                cdolist_list_var = cdolist_list_var.rest();
                var_type = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 15828L)
    public static SubLObject pph_var_previously_paraphrased_with_otherP(final SubLObject var) {
        final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
        SubLObject v_answer = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_answer) {
            SubLObject csome_list_var = paraphrases;
            SubLObject paraphrase = (SubLObject)pph_variable_handling.NIL;
            paraphrase = csome_list_var.first();
            while (pph_variable_handling.NIL == v_answer && pph_variable_handling.NIL != csome_list_var) {
                if (pph_variable_handling.NIL != pph_phrase.pph_phrase_p(paraphrase, (SubLObject)pph_variable_handling.UNPROVIDED)) {
                    final SubLObject paraphrase_string = pph_phrase.pph_phrase_string(paraphrase, (SubLObject)pph_variable_handling.NIL);
                    if (pph_variable_handling.NIL != string_utilities.substringP((SubLObject)pph_variable_handling.$str64$other, paraphrase_string, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED) && (pph_variable_handling.NIL != string_utilities.substringP((SubLObject)pph_variable_handling.$str65$_other_, paraphrase_string, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED) || pph_variable_handling.NIL != string_utilities.starts_with((SubLObject)pph_variable_handling.$str66$other_, paraphrase_string) || pph_variable_handling.NIL != string_utilities.substringP((SubLObject)pph_variable_handling.$str67$_another, paraphrase_string, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED) || pph_variable_handling.NIL != string_utilities.starts_with((SubLObject)pph_variable_handling.$str68$another, paraphrase_string))) {
                        v_answer = (SubLObject)pph_variable_handling.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 16520L)
    public static SubLObject pph_formula_free_variables_internal(final SubLObject formula, SubLObject bound_vars) {
        if (bound_vars == pph_variable_handling.UNPROVIDED) {
            bound_vars = (SubLObject)pph_variable_handling.NIL;
        }
        SubLObject free_vars = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == nart_handles.nart_p(formula)) {
            if (pph_variable_handling.NIL != cycl_grammar.cycl_sentence_p(formula)) {
                free_vars = el_utilities.sentence_free_variables(formula, bound_vars, (SubLObject)pph_variable_handling.$sym70$EL_VAR_, (SubLObject)pph_variable_handling.UNPROVIDED);
            }
            else if (pph_variable_handling.NIL != narts_high.naut_p(formula)) {
                free_vars = el_utilities.naut_free_variables(formula, bound_vars, (SubLObject)pph_variable_handling.$sym70$EL_VAR_, (SubLObject)pph_variable_handling.UNPROVIDED);
            }
        }
        return free_vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 16520L)
    public static SubLObject pph_formula_free_variables(final SubLObject formula, SubLObject bound_vars) {
        if (bound_vars == pph_variable_handling.UNPROVIDED) {
            bound_vars = (SubLObject)pph_variable_handling.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_formula_free_variables_internal(formula, bound_vars);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym69$PPH_FORMULA_FREE_VARIABLES, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym69$PPH_FORMULA_FREE_VARIABLES, (SubLObject)pph_variable_handling.TWO_INTEGER, (SubLObject)pph_variable_handling.$int71$98, (SubLObject)pph_variable_handling.EQUAL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym69$PPH_FORMULA_FREE_VARIABLES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, bound_vars);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && bound_vars.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_formula_free_variables_internal(formula, bound_vars)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, bound_vars));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 17029L)
    public static SubLObject pph_var_scoped_or_quotedP(final SubLObject var, final SubLObject formula) {
        if (pph_variable_handling.NIL != pph_utilities.pph_formula_with_dotsP(formula)) {
            return (SubLObject)pph_variable_handling.NIL;
        }
        SubLObject freeP = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == freeP) {
            SubLObject csome_list_var;
            SubLObject tree_position;
            for (csome_list_var = cycl_utilities.arg_positions_bfs(var, formula, Symbols.symbol_function((SubLObject)pph_variable_handling.EQL)), tree_position = (SubLObject)pph_variable_handling.NIL, tree_position = csome_list_var.first(); pph_variable_handling.NIL == freeP && pph_variable_handling.NIL != csome_list_var; freeP = (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL == pph_arg_scoped_or_quotedP(tree_position, formula)), csome_list_var = csome_list_var.rest(), tree_position = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL == freeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 17336L)
    public static SubLObject pph_arg_scoped_or_quotedP(final SubLObject arg_position, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(formula);
        final SubLObject arg_num = arg_position.first();
        if (pph_variable_handling.NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
            return (SubLObject)pph_variable_handling.T;
        }
        if (pph_variable_handling.NIL != list_utilities.singletonP(arg_position) && (pph_variable_handling.NIL != pph_operator_arg_quotedP(operator, arg_num) || (arg_position.equal((SubLObject)pph_variable_handling.$list72) && pph_variable_handling.NIL != formula_pattern_match.formula_matches_pattern(formula, (SubLObject)pph_variable_handling.$list73)))) {
            return (SubLObject)pph_variable_handling.T;
        }
        if (pph_variable_handling.NIL != list_utilities.lengthG(arg_position, (SubLObject)pph_variable_handling.ONE_INTEGER, (SubLObject)pph_variable_handling.UNPROVIDED)) {
            final SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, (SubLObject)pph_variable_handling.UNPROVIDED);
            return pph_arg_scopedP(arg_position.rest(), sub_formula);
        }
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 17958L)
    public static SubLObject pph_quoted_collectionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != kb_indexing_datastructures.indexed_term_p(v_object) && pph_variable_handling.NIL != pph_utilities.pph_removal_ask_boolean((SubLObject)ConsesLow.list(pph_variable_handling.$const74$quotedCollection, v_object), (SubLObject)pph_variable_handling.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 18111L)
    public static SubLObject pph_arg_scopedP(final SubLObject arg_position, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(formula);
        final SubLObject arg_num = arg_position.first();
        if (pph_variable_handling.NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
            return (SubLObject)pph_variable_handling.T;
        }
        if (pph_variable_handling.NIL != list_utilities.lengthG(arg_position, (SubLObject)pph_variable_handling.ONE_INTEGER, (SubLObject)pph_variable_handling.UNPROVIDED)) {
            final SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, (SubLObject)pph_variable_handling.UNPROVIDED);
            return pph_arg_scopedP(arg_position.rest(), sub_formula);
        }
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 18485L)
    public static SubLObject pph_operator_arg_scopedP_internal(final SubLObject operator, final SubLObject arg_num, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != kb_indexing_datastructures.indexed_term_p(operator) && pph_variable_handling.NIL != conses_high.member(arg_num, kb_accessors.scoping_args(operator, mt), Symbols.symbol_function((SubLObject)pph_variable_handling.EQL), (SubLObject)pph_variable_handling.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 18485L)
    public static SubLObject pph_operator_arg_scopedP(final SubLObject operator, final SubLObject arg_num, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_operator_arg_scopedP_internal(operator, arg_num, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym75$PPH_OPERATOR_ARG_SCOPED_, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym75$PPH_OPERATOR_ARG_SCOPED_, (SubLObject)pph_variable_handling.THREE_INTEGER, (SubLObject)pph_variable_handling.$int76$200, (SubLObject)pph_variable_handling.EQL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym75$PPH_OPERATOR_ARG_SCOPED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(operator, arg_num, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (arg_num.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_operator_arg_scopedP_internal(operator, arg_num, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(operator, arg_num, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 18678L)
    public static SubLObject pph_operator_arg_quotedP_internal(final SubLObject operator, final SubLObject arg_num) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != kb_indexing_datastructures.indexed_term_p(operator) && pph_variable_handling.NIL != kb_accessors.quoted_argumentP(operator, arg_num));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 18678L)
    public static SubLObject pph_operator_arg_quotedP(final SubLObject operator, final SubLObject arg_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_operator_arg_quotedP_internal(operator, arg_num);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym77$PPH_OPERATOR_ARG_QUOTED_, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym77$PPH_OPERATOR_ARG_QUOTED_, (SubLObject)pph_variable_handling.TWO_INTEGER, (SubLObject)pph_variable_handling.$int76$200, (SubLObject)pph_variable_handling.EQL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym77$PPH_OPERATOR_ARG_QUOTED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, arg_num);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && arg_num.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_operator_arg_quotedP_internal(operator, arg_num)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(operator, arg_num));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 18854L)
    public static SubLObject pph_variable_isa_constraints(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
        if (mt == pph_variable_handling.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (use_var_typing_clausesP == pph_variable_handling.UNPROVIDED) {
            use_var_typing_clausesP = (SubLObject)pph_variable_handling.T;
        }
        if (directlyP == pph_variable_handling.UNPROVIDED) {
            directlyP = (SubLObject)pph_variable_handling.NIL;
        }
        if (validity_test == pph_variable_handling.UNPROVIDED) {
            validity_test = (SubLObject)pph_variable_handling.$sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_variable_handling.NIL;
        final SubLObject var_types = set.new_set(Symbols.symbol_function((SubLObject)pph_variable_handling.EQUAL), (SubLObject)pph_variable_handling.UNPROVIDED);
        final SubLObject stripped = pph_strip_existentials(formula, (SubLObject)pph_variable_handling.T);
        final SubLObject clausal_form = (SubLObject)((pph_variable_handling.NIL != el_utilities.el_universal_p(stripped) || pph_variable_handling.NIL != el_utilities.el_implication_p(stripped)) ? pph_variable_handling.$kw79$CNF : pph_variable_handling.$kw80$DNF);
        thread.resetMultipleValues();
        final SubLObject v_clauses = pph_clausal_form(stripped, mt, clausal_form);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (v_clauses.isList()) {
            SubLObject list_var = (SubLObject)pph_variable_handling.NIL;
            SubLObject clause = (SubLObject)pph_variable_handling.NIL;
            SubLObject clause_num = (SubLObject)pph_variable_handling.NIL;
            list_var = v_clauses;
            clause = list_var.first();
            for (clause_num = (SubLObject)pph_variable_handling.ZERO_INTEGER; pph_variable_handling.NIL != list_var; list_var = list_var.rest(), clause = list_var.first(), clause_num = Numbers.add((SubLObject)pph_variable_handling.ONE_INTEGER, clause_num)) {
                SubLObject current;
                final SubLObject datum = current = clause;
                SubLObject neg_lits = (SubLObject)pph_variable_handling.NIL;
                SubLObject pos_lits = (SubLObject)pph_variable_handling.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list81);
                neg_lits = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list81);
                pos_lits = current.first();
                current = current.rest();
                if (pph_variable_handling.NIL == current) {
                    final SubLObject lits_to_use = (pph_variable_handling.NIL != neg_lits) ? neg_lits : pos_lits;
                    SubLObject this_clause_constraints = (SubLObject)pph_variable_handling.NIL;
                    SubLObject cdolist_list_var = lits_to_use;
                    SubLObject exp = (SubLObject)pph_variable_handling.NIL;
                    exp = cdolist_list_var.first();
                    while (pph_variable_handling.NIL != cdolist_list_var) {
                        if (pph_variable_handling.NIL != cycl_utilities.expression_find(var, exp, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED)) {
                            thread.resetMultipleValues();
                            final SubLObject more_ans = pph_variable_isa_constraints_in_lit(var, exp, lits_to_use, new_mt, use_var_typing_clausesP, validity_test);
                            final SubLObject more_var_types = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            this_clause_constraints = ConsesLow.append(this_clause_constraints, more_ans, more_var_types);
                            set_utilities.set_add_all(more_var_types, var_types);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        exp = cdolist_list_var.first();
                    }
                    if (clause_num.eql((SubLObject)pph_variable_handling.ZERO_INTEGER) || clausal_form == pph_variable_handling.$kw79$CNF) {
                        ans = ConsesLow.append(ans, this_clause_constraints);
                    }
                    else {
                        ans = pph_utilities.pph_min_ceiling_cols(pph_delete_genls(ConsesLow.append(ans, this_clause_constraints)), (SubLObject)pph_variable_handling.NIL, mt, (SubLObject)pph_variable_handling.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_variable_handling.$list81);
                }
            }
        }
        ans = list_utilities.delete_if_not(validity_test, Sequences.delete(pph_variable_handling.$const82$CycLVariable, ans, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED), (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL != Sequences.find_if((SubLObject)pph_variable_handling.$sym83$SPECS_FN_NAT_, ans, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED)) {
            if (pph_variable_handling.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_variable_handling.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_variable_handling.T, (SubLObject)pph_variable_handling.$str84$Removing_non_SpecsFn_terms_from__, ans, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
            }
            ans = list_utilities.remove_if_not((SubLObject)pph_variable_handling.$sym83$SPECS_FN_NAT_, ans, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        }
        if (pph_variable_handling.NIL == directlyP && pph_variable_handling.NIL == set.set_emptyP(var_types)) {
            ans = pph_replace_direct_var_types(var_types, ans, mt);
        }
        return Sort.sort(pph_delete_genls(ans), (SubLObject)pph_variable_handling.$sym85$PPH_GENERALITY_ESTIMATE_, (SubLObject)pph_variable_handling.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 20948L)
    public static SubLObject pph_replace_direct_var_types(final SubLObject var_types, SubLObject ans, final SubLObject mt) {
        for (SubLObject var_types_okP = (SubLObject)pph_variable_handling.NIL, v_iteration = (SubLObject)pph_variable_handling.ZERO_INTEGER, max_iterations = (SubLObject)pph_variable_handling.TEN_INTEGER; pph_variable_handling.NIL == var_types_okP && !v_iteration.numGE(max_iterations); var_types_okP = (SubLObject)pph_variable_handling.T) {
            v_iteration = Numbers.add(v_iteration, (SubLObject)pph_variable_handling.ONE_INTEGER);
            SubLObject to_remove = (SubLObject)pph_variable_handling.NIL;
            SubLObject cdolist_list_var = ans;
            SubLObject type = (SubLObject)pph_variable_handling.NIL;
            type = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                if (pph_variable_handling.NIL != set.set_memberP(type, var_types)) {
                    to_remove = (SubLObject)ConsesLow.cons(type, to_remove);
                }
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            }
            if (pph_variable_handling.NIL == list_utilities.empty_list_p(to_remove)) {
                cdolist_list_var = to_remove;
                type = (SubLObject)pph_variable_handling.NIL;
                type = cdolist_list_var.first();
                while (pph_variable_handling.NIL != cdolist_list_var) {
                    ans = Sequences.delete(type, ans, Symbols.symbol_function((SubLObject)pph_variable_handling.EQUAL), (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
                    ans = ConsesLow.append(ans, pph_genls(type, mt));
                    cdolist_list_var = cdolist_list_var.rest();
                    type = cdolist_list_var.first();
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 21494L)
    public static SubLObject pph_clausal_form_internal(final SubLObject expression, final SubLObject mt, final SubLObject dnf_or_cnf) {
        return clausifier.clausal_form(expression, mt, dnf_or_cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 21494L)
    public static SubLObject pph_clausal_form(final SubLObject expression, final SubLObject mt, final SubLObject dnf_or_cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_clausal_form_internal(expression, mt, dnf_or_cnf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym86$PPH_CLAUSAL_FORM, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym86$PPH_CLAUSAL_FORM, (SubLObject)pph_variable_handling.THREE_INTEGER, (SubLObject)pph_variable_handling.$int87$32, (SubLObject)pph_variable_handling.EQUAL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym86$PPH_CLAUSAL_FORM, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(expression, mt, dnf_or_cnf);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && dnf_or_cnf.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_clausal_form_internal(expression, mt, dnf_or_cnf)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(expression, mt, dnf_or_cnf));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 21653L)
    public static SubLObject pph_variable_isa_constraints_in_lit_internal(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject validity_test) {
        if (use_var_typing_clausesP == pph_variable_handling.UNPROVIDED) {
            use_var_typing_clausesP = (SubLObject)pph_variable_handling.T;
        }
        if (validity_test == pph_variable_handling.UNPROVIDED) {
            validity_test = (SubLObject)pph_variable_handling.$sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_variable_handling.NIL;
        SubLObject from_var_typing_clauses = (SubLObject)pph_variable_handling.NIL;
        final SubLObject op = cycl_utilities.formula_operator(exp);
        final SubLObject pos = cycl_utilities.formula_arg_positions(exp, var, Symbols.symbol_function((SubLObject)pph_variable_handling.EQL)).first();
        if (pph_variable_handling.NIL != forts.fort_p(op) && pos.isInteger()) {
            ans = ConsesLow.append(kb_accessors.argn_isa(op, pos, mt), ans);
            SubLObject cdolist_list_var = kb_accessors.argn_genl(op, pos, mt);
            SubLObject genl = (SubLObject)pph_variable_handling.NIL;
            genl = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                final SubLObject item_var = pph_utilities.pph_make_type_level(genl);
                if (pph_variable_handling.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)pph_variable_handling.EQUAL), Symbols.symbol_function((SubLObject)pph_variable_handling.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                genl = cdolist_list_var.first();
            }
        }
        if (pph_variable_handling.NIL != pph_utilities.pph_isaP(op, pph_variable_handling.$const89$FamilyRelationSlot, (SubLObject)pph_variable_handling.UNPROVIDED)) {
            ans = (SubLObject)ConsesLow.cons(pph_variable_handling.$const90$Agent_Generic, ans);
        }
        if (pph_variable_handling.NIL != pph_types.pph_rmp_sentenceP(exp)) {
            SubLObject rbp_constraints = (SubLObject)pph_variable_handling.NIL;
            final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    rbp_constraints = rbp_wff.rbp_formula_variable_isa_constraints(exp, var);
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_variable_handling.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var2 = rbp_constraints;
            SubLObject raw_constraint = (SubLObject)pph_variable_handling.NIL;
            raw_constraint = cdolist_list_var2.first();
            while (pph_variable_handling.NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = raw_constraint;
                SubLObject type = (SubLObject)pph_variable_handling.NIL;
                SubLObject target = (SubLObject)pph_variable_handling.NIL;
                SubLObject constraint_mt = (SubLObject)pph_variable_handling.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list91);
                type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list91);
                target = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_variable_handling.$list91);
                constraint_mt = current.first();
                current = current.rest();
                if (pph_variable_handling.NIL == current) {
                    final SubLObject pcase_var = type;
                    if (pcase_var.eql((SubLObject)pph_variable_handling.$kw92$ISA)) {
                        final SubLObject item_var2 = target;
                        if (pph_variable_handling.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)pph_variable_handling.EQUAL), Symbols.symbol_function((SubLObject)pph_variable_handling.IDENTITY))) {
                            ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                        }
                    }
                    else if (pcase_var.eql((SubLObject)pph_variable_handling.$kw93$GENL) || pcase_var.eql((SubLObject)pph_variable_handling.$kw94$NOT_DISJOINT)) {
                        final SubLObject item_var2 = pph_utilities.pph_make_type_level(target);
                        if (pph_variable_handling.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)pph_variable_handling.EQUAL), Symbols.symbol_function((SubLObject)pph_variable_handling.IDENTITY))) {
                            ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_variable_handling.$list91);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                raw_constraint = cdolist_list_var2.first();
            }
        }
        if (pph_variable_handling.NIL != use_var_typing_clausesP && pph_variable_handling.NIL != pph_utilities.pph_var_typing_clauseP(exp, var, validity_test)) {
            from_var_typing_clauses = (SubLObject)ConsesLow.cons(pph_utilities.pph_var_type_from_asent(exp), from_var_typing_clauses);
        }
        thread.resetMultipleValues();
        final SubLObject more_ans = pph_variable_isa_constraints_in_subexpressions(var, exp, lits, mt, use_var_typing_clausesP);
        final SubLObject more_var_types = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ans = Sequences.cconcatenate(ans, more_ans);
        from_var_typing_clauses = Sequences.cconcatenate(from_var_typing_clauses, more_var_types);
        return Values.values(Sort.sort(pph_delete_genls(ans), (SubLObject)pph_variable_handling.$sym85$PPH_GENERALITY_ESTIMATE_, (SubLObject)pph_variable_handling.UNPROVIDED), Sort.sort(pph_delete_genls(from_var_typing_clauses), (SubLObject)pph_variable_handling.$sym85$PPH_GENERALITY_ESTIMATE_, (SubLObject)pph_variable_handling.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 21653L)
    public static SubLObject pph_variable_isa_constraints_in_lit(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject validity_test) {
        if (use_var_typing_clausesP == pph_variable_handling.UNPROVIDED) {
            use_var_typing_clausesP = (SubLObject)pph_variable_handling.T;
        }
        if (validity_test == pph_variable_handling.UNPROVIDED) {
            validity_test = (SubLObject)pph_variable_handling.$sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, validity_test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym88$PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym88$PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, (SubLObject)pph_variable_handling.SIX_INTEGER, (SubLObject)pph_variable_handling.$int95$100, (SubLObject)pph_variable_handling.EQUAL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym88$PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(var, exp, lits, mt, use_var_typing_clausesP, validity_test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (exp.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (lits.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (use_var_typing_clausesP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && validity_test.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, validity_test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(var, exp, lits, mt, use_var_typing_clausesP, validity_test));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 23715L)
    public static SubLObject pph_genls(final SubLObject v_term, SubLObject mt) {
        if (mt == pph_variable_handling.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (pph_variable_handling.NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
            return genls.genls(v_term, mt, (SubLObject)pph_variable_handling.UNPROVIDED);
        }
        if (pph_variable_handling.NIL != pph_utilities.specs_fn_natP(v_term)) {
            final SubLObject core_term = pph_utilities.pph_core_term(v_term);
            return (SubLObject)((pph_variable_handling.NIL != pph_utilities.specs_fn_natP(core_term)) ? pph_variable_handling.NIL : Mapping.mapcar((SubLObject)pph_variable_handling.$sym96$PPH_MAKE_TYPE_LEVEL, pph_genls(core_term, mt)));
        }
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 24055L)
    public static SubLObject pph_variable_isa_constraints_in_subexpressions(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, final SubLObject use_var_typing_clausesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_variable_handling.NIL;
        SubLObject from_var_typing_clauses = (SubLObject)pph_variable_handling.NIL;
        final SubLObject use_var_typing_sub_clausesP = (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != use_var_typing_clausesP && pph_variable_handling.NIL != pph_truth_preserving_operatorP(cycl_utilities.formula_arg0(exp), (SubLObject)pph_variable_handling.UNPROVIDED));
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(exp, (SubLObject)pph_variable_handling.$kw44$IGNORE);
        SubLObject sub_exp = (SubLObject)pph_variable_handling.NIL;
        sub_exp = cdolist_list_var.first();
        while (pph_variable_handling.NIL != cdolist_list_var) {
            if (pph_variable_handling.NIL != el_utilities.atomic_sentenceP(sub_exp)) {
                thread.resetMultipleValues();
                final SubLObject more_ans = pph_variable_isa_constraints_in_lit(var, sub_exp, lits, mt, use_var_typing_sub_clausesP, (SubLObject)pph_variable_handling.UNPROVIDED);
                final SubLObject more_var_types = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ans = ConsesLow.append(ans, more_ans);
                from_var_typing_clauses = ConsesLow.append(from_var_typing_clauses, more_var_types);
            }
            if (pph_variable_handling.NIL != el_utilities.el_formula_p(sub_exp)) {
                thread.resetMultipleValues();
                final SubLObject more_ans = pph_variable_isa_constraints_in_subexpressions(var, sub_exp, lits, mt, use_var_typing_sub_clausesP);
                final SubLObject more_var_types = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ans = ConsesLow.append(ans, more_ans);
                from_var_typing_clauses = ConsesLow.append(from_var_typing_clauses, more_var_types);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_exp = cdolist_list_var.first();
        }
        return Values.values(ans, from_var_typing_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 25046L)
    public static SubLObject pph_truth_preserving_operatorP_internal(final SubLObject operator, SubLObject mt) {
        if (mt == pph_variable_handling.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_variable_handling.NIL != forts.fort_p(operator) && (pph_variable_handling.NIL != conses_high.member(operator, (SubLObject)pph_variable_handling.$list98, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED) || pph_variable_handling.NIL != conses_high.member(operator, (SubLObject)pph_variable_handling.$list99, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED) || (pph_variable_handling.NIL != fort_types_interface.predicateP(operator) && (pph_variable_handling.NIL != pph_utilities.pph_genl_predicateP(operator, pph_variable_handling.$const100$extentCardinality, mt) || pph_variable_handling.NIL != pph_utilities.pph_genl_predicateP(operator, pph_variable_handling.$const101$trueSentence, mt) || pph_variable_handling.NIL != pph_utilities.pph_genl_predicateP(operator, pph_variable_handling.$const102$holdsSometimeDuring, mt) || pph_variable_handling.NIL != pph_utilities.pph_genl_predicateP(operator, pph_variable_handling.$const103$ist, mt)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 25046L)
    public static SubLObject pph_truth_preserving_operatorP(final SubLObject operator, SubLObject mt) {
        if (mt == pph_variable_handling.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_truth_preserving_operatorP_internal(operator, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym97$PPH_TRUTH_PRESERVING_OPERATOR_, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym97$PPH_TRUTH_PRESERVING_OPERATOR_, (SubLObject)pph_variable_handling.TWO_INTEGER, (SubLObject)pph_variable_handling.$int76$200, (SubLObject)pph_variable_handling.EQL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym97$PPH_TRUTH_PRESERVING_OPERATOR_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_truth_preserving_operatorP_internal(operator, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(operator, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 25708L)
    public static SubLObject pph_strip_existentials(SubLObject formula, SubLObject include_nested_existentialsP) {
        if (include_nested_existentialsP == pph_variable_handling.UNPROVIDED) {
            include_nested_existentialsP = (SubLObject)pph_variable_handling.NIL;
        }
        if (pph_variable_handling.NIL != include_nested_existentialsP) {
            return cycl_utilities.expression_transform(formula, (SubLObject)pph_variable_handling.$sym104$EL_EXISTENTIAL_P, (SubLObject)pph_variable_handling.$sym105$QUANTIFIED_SUB_SENTENCE, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        }
        while (pph_variable_handling.NIL != el_utilities.el_existential_p(formula)) {
            formula = el_utilities.quantified_sub_sentence(formula);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 26032L)
    public static SubLObject pph_delete_genls(SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!cols.isList()) {
            return (SubLObject)pph_variable_handling.NIL;
        }
        SubLObject ans = (SubLObject)pph_variable_handling.NIL;
        SubLObject col = (SubLObject)pph_variable_handling.NIL;
        ans = (SubLObject)pph_variable_handling.NIL;
        for (col = Sequences.delete_duplicates(cols, Symbols.symbol_function((SubLObject)pph_variable_handling.EQUAL), (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED).first(); pph_variable_handling.NIL != col; col = cols.first()) {
            cols = cols.rest();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (pph_variable_handling.NIL == subl_promotions.memberP(col, cols, (SubLObject)pph_variable_handling.$sym57$PPH_SPEC_, (SubLObject)pph_variable_handling.UNPROVIDED) && pph_variable_handling.NIL == conses_high.member(col, ans, (SubLObject)pph_variable_handling.$sym57$PPH_SPEC_, (SubLObject)pph_variable_handling.UNPROVIDED)) {
                    ans = (SubLObject)ConsesLow.cons(col, ans);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            ans = ans;
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 26465L)
    public static SubLObject pph_min_variable_isa_constraint_internal(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
        if (mt == pph_variable_handling.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (use_var_typing_clausesP == pph_variable_handling.UNPROVIDED) {
            use_var_typing_clausesP = (SubLObject)pph_variable_handling.T;
        }
        if (directlyP == pph_variable_handling.UNPROVIDED) {
            directlyP = (SubLObject)pph_variable_handling.NIL;
        }
        if (validity_test == pph_variable_handling.UNPROVIDED) {
            validity_test = (SubLObject)pph_variable_handling.$sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLObject constraints = pph_variable_isa_constraints(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
        final SubLObject found_constraints = pph_find_most_specific(constraints, (SubLObject)pph_variable_handling.UNPROVIDED);
        final SubLObject choice = (pph_variable_handling.NIL != found_constraints) ? found_constraints : pph_default_var_type();
        if (pph_variable_handling.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_variable_handling.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_variable_handling.T, (SubLObject)pph_variable_handling.$str107$Constraints_on__S_are__S_____choo, var, constraints, choice, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED, (SubLObject)pph_variable_handling.UNPROVIDED);
        }
        return choice;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 26465L)
    public static SubLObject pph_min_variable_isa_constraint(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
        if (mt == pph_variable_handling.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (use_var_typing_clausesP == pph_variable_handling.UNPROVIDED) {
            use_var_typing_clausesP = (SubLObject)pph_variable_handling.T;
        }
        if (directlyP == pph_variable_handling.UNPROVIDED) {
            directlyP = (SubLObject)pph_variable_handling.NIL;
        }
        if (validity_test == pph_variable_handling.UNPROVIDED) {
            validity_test = (SubLObject)pph_variable_handling.$sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym106$PPH_MIN_VARIABLE_ISA_CONSTRAINT, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym106$PPH_MIN_VARIABLE_ISA_CONSTRAINT, (SubLObject)pph_variable_handling.SIX_INTEGER, (SubLObject)pph_variable_handling.$int71$98, (SubLObject)pph_variable_handling.EQUAL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym106$PPH_MIN_VARIABLE_ISA_CONSTRAINT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (formula.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (use_var_typing_clausesP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (directlyP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && validity_test.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 27160L)
    public static SubLObject pph_find_most_specific_internal(final SubLObject items, SubLObject test) {
        if (test == pph_variable_handling.UNPROVIDED) {
            test = (SubLObject)pph_variable_handling.$sym85$PPH_GENERALITY_ESTIMATE_;
        }
        SubLObject ans = items.first();
        SubLObject cdolist_list_var = items.rest();
        SubLObject other = (SubLObject)pph_variable_handling.NIL;
        other = cdolist_list_var.first();
        while (pph_variable_handling.NIL != cdolist_list_var) {
            final SubLObject pcase_var = test;
            if (pcase_var.eql((SubLObject)pph_variable_handling.$sym109$QUOTE) || pcase_var.eql((SubLObject)pph_variable_handling.$sym85$PPH_GENERALITY_ESTIMATE_)) {
                if (pph_variable_handling.NIL != pph_utilities.pph_generality_estimateL(other, ans)) {
                    ans = other;
                }
            }
            else if (pph_variable_handling.NIL != Functions.funcall(test, other, ans)) {
                ans = other;
            }
            cdolist_list_var = cdolist_list_var.rest();
            other = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-variable-handling.lisp", position = 27160L)
    public static SubLObject pph_find_most_specific(final SubLObject items, SubLObject test) {
        if (test == pph_variable_handling.UNPROVIDED) {
            test = (SubLObject)pph_variable_handling.$sym85$PPH_GENERALITY_ESTIMATE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_variable_handling.NIL;
        if (pph_variable_handling.NIL == v_memoization_state) {
            return pph_find_most_specific_internal(items, test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_variable_handling.$sym108$PPH_FIND_MOST_SPECIFIC, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (pph_variable_handling.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_variable_handling.$sym108$PPH_FIND_MOST_SPECIFIC, (SubLObject)pph_variable_handling.TWO_INTEGER, (SubLObject)pph_variable_handling.$int95$100, (SubLObject)pph_variable_handling.EQUAL, (SubLObject)pph_variable_handling.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_variable_handling.$sym108$PPH_FIND_MOST_SPECIFIC, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(items, test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_variable_handling.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_variable_handling.NIL;
            collision = cdolist_list_var.first();
            while (pph_variable_handling.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (items.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_variable_handling.NIL != cached_args && pph_variable_handling.NIL == cached_args.rest() && test.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_find_most_specific_internal(items, test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(items, test));
        return memoization_state.caching_results(results3);
    }
    
    public static SubLObject declare_pph_variable_handling_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry_print_function_trampoline", "PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry_p", "PPH-VAR-ENTRY-P", 1, 0, false);
        new $pph_var_entry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry_var", "PPH-VAR-ENTRY-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry_type", "PPH-VAR-ENTRY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry_quantifier", "PPH-VAR-ENTRY-QUANTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry_single_useP", "PPH-VAR-ENTRY-SINGLE-USE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry_arg_position", "PPH-VAR-ENTRY-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "_csetf_pph_var_entry_var", "_CSETF-PPH-VAR-ENTRY-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "_csetf_pph_var_entry_type", "_CSETF-PPH-VAR-ENTRY-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "_csetf_pph_var_entry_quantifier", "_CSETF-PPH-VAR-ENTRY-QUANTIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "_csetf_pph_var_entry_single_useP", "_CSETF-PPH-VAR-ENTRY-SINGLE-USE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "_csetf_pph_var_entry_arg_position", "_CSETF-PPH-VAR-ENTRY-ARG-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "make_pph_var_entry", "MAKE-PPH-VAR-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "visit_defstruct_pph_var_entry", "VISIT-DEFSTRUCT-PPH-VAR-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "visit_defstruct_object_pph_var_entry_method", "VISIT-DEFSTRUCT-OBJECT-PPH-VAR-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pprint_pph_var_entry", "PPRINT-PPH-VAR-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "new_pph_var_entry", "NEW-PPH-VAR-ENTRY", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry_copy", "PPH-VAR-ENTRY-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "set_pph_var_type", "SET-PPH-VAR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "set_pph_var_type_map", "SET-PPH-VAR-TYPE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "set_pph_var_quantifier", "SET-PPH-VAR-QUANTIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "clear_pph_var_types", "CLEAR-PPH-VAR-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_default_var_type", "PPH-DEFAULT-VAR-TYPE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_registered_vars", "PPH-REGISTERED-VARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entry", "PPH-VAR-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_entries", "PPH-VAR-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_registeredP", "PPH-VAR-REGISTERED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_registered_as_defaultP", "PPH-VAR-REGISTERED-AS-DEFAULT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_register_var", "PPH-REGISTER-VAR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_update_var_type", "PPH-UPDATE-VAR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_deregister_var", "PPH-DEREGISTER-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_deregister_vars", "PPH-DEREGISTER-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_quantifiedP", "PPH-VAR-QUANTIFIED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_register_var_quantifier", "PPH-REGISTER-VAR-QUANTIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_quantifier_for_operator", "PPH-QUANTIFIER-FOR-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_register_scoped_vars", "PPH-REGISTER-SCOPED-VARS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_variable_handling", "with_pph_hypothesized_vars", "WITH-PPH-HYPOTHESIZED-VARS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_register_query_vars", "PPH-REGISTER-QUERY-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_query_var_p", "PPH-QUERY-VAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_existential_var_p", "PPH-EXISTENTIAL-VAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_note_if_var_is_used_only_once_in_formula", "PPH-NOTE-IF-VAR-IS-USED-ONLY-ONCE-IN-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_register_var_as_used_only_once", "PPH-REGISTER-VAR-AS-USED-ONLY-ONCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_used_only_onceP", "PPH-VAR-USED-ONLY-ONCE?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_variable_handling", "pph_do_var_entries", "PPH-DO-VAR-ENTRIES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_quantifier", "PPH-VAR-QUANTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_type", "PPH-VAR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_cycl_var_type", "PPH-CYCL-VAR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_type_arg_position_map", "PPH-TYPE-ARG-POSITION-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_unregistered_variableP", "PPH-UNREGISTERED-VARIABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_duplicate_var_typeP", "PPH-DUPLICATE-VAR-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_paraphrased_explicitlyP", "PPH-VAR-PARAPHRASED-EXPLICITLY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "string_mentions_varP", "STRING-MENTIONS-VAR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_use_explicit_varP", "PPH-USE-EXPLICIT-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_type_previously_explicit_if_mentionedP", "PPH-VAR-TYPE-PREVIOUSLY-EXPLICIT-IF-MENTIONED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_previously_explicitP", "PPH-VAR-PREVIOUSLY-EXPLICIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_previously_lexifiedP", "PPH-VAR-PREVIOUSLY-LEXIFIED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_string_is_posP_internal", "PPH-STRING-IS-POS?-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_string_is_posP", "PPH-STRING-IS-POS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_previously_pronounP", "PPH-VAR-PREVIOUSLY-PRONOUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_register_vars_as_different", "PPH-REGISTER-VARS-AS-DIFFERENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_different_varsP", "PPH-DIFFERENT-VARS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_different_varsP_int", "PPH-DIFFERENT-VARS?-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_note_var_type", "PPH-NOTE-VAR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_other_vars_with_var_type", "PPH-OTHER-VARS-WITH-VAR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_vars_with_type", "PPH-VARS-WITH-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_previously_paraphrased_with_otherP", "PPH-VAR-PREVIOUSLY-PARAPHRASED-WITH-OTHER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_formula_free_variables_internal", "PPH-FORMULA-FREE-VARIABLES-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_formula_free_variables", "PPH-FORMULA-FREE-VARIABLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_var_scoped_or_quotedP", "PPH-VAR-SCOPED-OR-QUOTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_arg_scoped_or_quotedP", "PPH-ARG-SCOPED-OR-QUOTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_quoted_collectionP", "PPH-QUOTED-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_arg_scopedP", "PPH-ARG-SCOPED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_operator_arg_scopedP_internal", "PPH-OPERATOR-ARG-SCOPED?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_operator_arg_scopedP", "PPH-OPERATOR-ARG-SCOPED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_operator_arg_quotedP_internal", "PPH-OPERATOR-ARG-QUOTED?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_operator_arg_quotedP", "PPH-OPERATOR-ARG-QUOTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_variable_isa_constraints", "PPH-VARIABLE-ISA-CONSTRAINTS", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_replace_direct_var_types", "PPH-REPLACE-DIRECT-VAR-TYPES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_clausal_form_internal", "PPH-CLAUSAL-FORM-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_clausal_form", "PPH-CLAUSAL-FORM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_variable_isa_constraints_in_lit_internal", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT-INTERNAL", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_variable_isa_constraints_in_lit", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_genls", "PPH-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_variable_isa_constraints_in_subexpressions", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-SUBEXPRESSIONS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_truth_preserving_operatorP_internal", "PPH-TRUTH-PRESERVING-OPERATOR?-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_truth_preserving_operatorP", "PPH-TRUTH-PRESERVING-OPERATOR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_strip_existentials", "PPH-STRIP-EXISTENTIALS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_delete_genls", "PPH-DELETE-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_min_variable_isa_constraint_internal", "PPH-MIN-VARIABLE-ISA-CONSTRAINT-INTERNAL", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_min_variable_isa_constraint", "PPH-MIN-VARIABLE-ISA-CONSTRAINT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_find_most_specific_internal", "PPH-FIND-MOST-SPECIFIC-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_variable_handling", "pph_find_most_specific", "PPH-FIND-MOST-SPECIFIC", 1, 1, false);
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    public static SubLObject init_pph_variable_handling_file() {
        pph_variable_handling.$dtp_pph_var_entry$ = SubLFiles.defconstant("*DTP-PPH-VAR-ENTRY*", (SubLObject)pph_variable_handling.$sym0$PPH_VAR_ENTRY);
        pph_variable_handling.$pph_default_var_type$ = SubLFiles.defconstant("*PPH-DEFAULT-VAR-TYPE*", pph_variable_handling.$const31$Thing);
        pph_variable_handling.$pph_hypothesized_vars$ = SubLFiles.defparameter("*PPH-HYPOTHESIZED-VARS*", (SubLObject)pph_variable_handling.NIL);
        pph_variable_handling.$pph_different_vars$ = SubLFiles.defvar("*PPH-DIFFERENT-VARS*", (SubLObject)pph_variable_handling.NIL);
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    public static SubLObject setup_pph_variable_handling_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), pph_variable_handling.$dtp_pph_var_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_variable_handling.$sym7$PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)pph_variable_handling.$list8);
        Structures.def_csetf((SubLObject)pph_variable_handling.$sym9$PPH_VAR_ENTRY_VAR, (SubLObject)pph_variable_handling.$sym10$_CSETF_PPH_VAR_ENTRY_VAR);
        Structures.def_csetf((SubLObject)pph_variable_handling.$sym11$PPH_VAR_ENTRY_TYPE, (SubLObject)pph_variable_handling.$sym12$_CSETF_PPH_VAR_ENTRY_TYPE);
        Structures.def_csetf((SubLObject)pph_variable_handling.$sym13$PPH_VAR_ENTRY_QUANTIFIER, (SubLObject)pph_variable_handling.$sym14$_CSETF_PPH_VAR_ENTRY_QUANTIFIER);
        Structures.def_csetf((SubLObject)pph_variable_handling.$sym15$PPH_VAR_ENTRY_SINGLE_USE_, (SubLObject)pph_variable_handling.$sym16$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_);
        Structures.def_csetf((SubLObject)pph_variable_handling.$sym17$PPH_VAR_ENTRY_ARG_POSITION, (SubLObject)pph_variable_handling.$sym18$_CSETF_PPH_VAR_ENTRY_ARG_POSITION);
        Equality.identity((SubLObject)pph_variable_handling.$sym0$PPH_VAR_ENTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), pph_variable_handling.$dtp_pph_var_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_variable_handling.$sym29$VISIT_DEFSTRUCT_OBJECT_PPH_VAR_ENTRY_METHOD));
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym58$PPH_STRING_IS_POS_);
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym69$PPH_FORMULA_FREE_VARIABLES);
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym75$PPH_OPERATOR_ARG_SCOPED_);
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym77$PPH_OPERATOR_ARG_QUOTED_);
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym86$PPH_CLAUSAL_FORM);
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym88$PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT);
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym97$PPH_TRUTH_PRESERVING_OPERATOR_);
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym106$PPH_MIN_VARIABLE_ISA_CONSTRAINT);
        memoization_state.note_memoized_function((SubLObject)pph_variable_handling.$sym108$PPH_FIND_MOST_SPECIFIC);
        return (SubLObject)pph_variable_handling.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_variable_handling_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_variable_handling_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_variable_handling_file();
    }
    
    static {
        me = (SubLFile)new pph_variable_handling();
        pph_variable_handling.$dtp_pph_var_entry$ = null;
        pph_variable_handling.$pph_default_var_type$ = null;
        pph_variable_handling.$pph_hypothesized_vars$ = null;
        pph_variable_handling.$pph_different_vars$ = null;
        $sym0$PPH_VAR_ENTRY = SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY");
        $sym1$PPH_VAR_ENTRY_P = SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("SINGLE-USE?"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VAR"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("QUANTIFIER"), (SubLObject)SubLObjectFactory.makeKeyword("SINGLE-USE?"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-POSITION"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-QUANTIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-ARG-POSITION"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION"));
        $sym6$PPRINT_PPH_VAR_ENTRY = SubLObjectFactory.makeSymbol("PPRINT-PPH-VAR-ENTRY");
        $sym7$PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-P"));
        $sym9$PPH_VAR_ENTRY_VAR = SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-VAR");
        $sym10$_CSETF_PPH_VAR_ENTRY_VAR = SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR");
        $sym11$PPH_VAR_ENTRY_TYPE = SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-TYPE");
        $sym12$_CSETF_PPH_VAR_ENTRY_TYPE = SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE");
        $sym13$PPH_VAR_ENTRY_QUANTIFIER = SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-QUANTIFIER");
        $sym14$_CSETF_PPH_VAR_ENTRY_QUANTIFIER = SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER");
        $sym15$PPH_VAR_ENTRY_SINGLE_USE_ = SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?");
        $sym16$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_ = SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?");
        $sym17$PPH_VAR_ENTRY_ARG_POSITION = SubLObjectFactory.makeSymbol("PPH-VAR-ENTRY-ARG-POSITION");
        $sym18$_CSETF_PPH_VAR_ENTRY_ARG_POSITION = SubLObjectFactory.makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION");
        $kw19$VAR = SubLObjectFactory.makeKeyword("VAR");
        $kw20$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw21$QUANTIFIER = SubLObjectFactory.makeKeyword("QUANTIFIER");
        $kw22$SINGLE_USE_ = SubLObjectFactory.makeKeyword("SINGLE-USE?");
        $kw23$ARG_POSITION = SubLObjectFactory.makeKeyword("ARG-POSITION");
        $str24$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw25$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym26$MAKE_PPH_VAR_ENTRY = SubLObjectFactory.makeSymbol("MAKE-PPH-VAR-ENTRY");
        $kw27$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw28$END = SubLObjectFactory.makeKeyword("END");
        $sym29$VISIT_DEFSTRUCT_OBJECT_PPH_VAR_ENTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-VAR-ENTRY-METHOD");
        $str30$__PPH_VAR_ENTRY___S__S__S__S_ = SubLObjectFactory.makeString("#<PPH-VAR-ENTRY: ~S ~S ~S ~S>");
        $const31$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $str32$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str33$__ = SubLObjectFactory.makeString(") ");
        $str34$Non_EL_var___S = SubLObjectFactory.makeString("Non EL var: ~S");
        $str35$Registering__S_as__S___ = SubLObjectFactory.makeString("Registering ~S as ~S.~%");
        $sym36$PPH_DEREGISTER_VAR = SubLObjectFactory.makeSymbol("PPH-DEREGISTER-VAR");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIVERSAL"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENTIAL"), (SubLObject)SubLObjectFactory.makeKeyword("NO"));
        $str38$___S_is_not_a_quantifier_keyword_ = SubLObjectFactory.makeString("~&~S is not a quantifier keyword among ~S");
        $const39$ExistentialQuantifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier"));
        $kw40$EXISTENTIAL = SubLObjectFactory.makeKeyword("EXISTENTIAL");
        $const41$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $kw42$UNIVERSAL = SubLObjectFactory.makeKeyword("UNIVERSAL");
        $kw43$SCOPED = SubLObjectFactory.makeKeyword("SCOPED");
        $kw44$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym47$_PPH_HYPOTHESIZED_VARS_ = SubLObjectFactory.makeSymbol("*PPH-HYPOTHESIZED-VARS*");
        $sym48$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-HYPOTHESIZED-VARS*"));
        $sym50$PPH_EXISTENTIAL_VAR_P = SubLObjectFactory.makeSymbol("PPH-EXISTENTIAL-VAR-P");
        $str51$__Registering__S_as_a_query_var__ = SubLObjectFactory.makeString("~&Registering ~S as a query var.~%");
        $kw52$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $str53$PPH_REGISTER_VAR_AS_USED_ONLY_ONC = SubLObjectFactory.makeString("PPH-REGISTER-VAR-AS-USED-ONLY-ONCE called on var ~S with no PPH-VAR-ENTRY~%");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym55$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $sym56$_PPH_VAR_TYPES_ = SubLObjectFactory.makeSymbol("*PPH-VAR-TYPES*");
        $sym57$PPH_SPEC_ = SubLObjectFactory.makeSymbol("PPH-SPEC?");
        $sym58$PPH_STRING_IS_POS_ = SubLObjectFactory.makeSymbol("PPH-STRING-IS-POS?");
        $kw59$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $kw60$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $int61$128 = SubLObjectFactory.makeInteger(128);
        $const62$Pronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $str63$__Noted___S_is_a__S___ = SubLObjectFactory.makeString("~&Noted: ~S is a ~S.~%");
        $str64$other = SubLObjectFactory.makeString("other");
        $str65$_other_ = SubLObjectFactory.makeString(" other ");
        $str66$other_ = SubLObjectFactory.makeString("other ");
        $str67$_another = SubLObjectFactory.makeString(" another");
        $str68$another = SubLObjectFactory.makeString("another");
        $sym69$PPH_FORMULA_FREE_VARIABLES = SubLObjectFactory.makeSymbol("PPH-FORMULA-FREE-VARIABLES");
        $sym70$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $int71$98 = SubLObjectFactory.makeInteger(98);
        $list72 = ConsesLow.list((SubLObject)pph_variable_handling.ONE_INTEGER);
        $list73 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-QUOTED-COLLECTION?")));
        $const74$quotedCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedCollection"));
        $sym75$PPH_OPERATOR_ARG_SCOPED_ = SubLObjectFactory.makeSymbol("PPH-OPERATOR-ARG-SCOPED?");
        $int76$200 = SubLObjectFactory.makeInteger(200);
        $sym77$PPH_OPERATOR_ARG_QUOTED_ = SubLObjectFactory.makeSymbol("PPH-OPERATOR-ARG-QUOTED?");
        $sym78$PPH_VALID_VAR_TYPE_ = SubLObjectFactory.makeSymbol("PPH-VALID-VAR-TYPE?");
        $kw79$CNF = SubLObjectFactory.makeKeyword("CNF");
        $kw80$DNF = SubLObjectFactory.makeKeyword("DNF");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $const82$CycLVariable = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLVariable"));
        $sym83$SPECS_FN_NAT_ = SubLObjectFactory.makeSymbol("SPECS-FN-NAT?");
        $str84$Removing_non_SpecsFn_terms_from__ = SubLObjectFactory.makeString("Removing non-SpecsFn terms from ~S");
        $sym85$PPH_GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("PPH-GENERALITY-ESTIMATE<");
        $sym86$PPH_CLAUSAL_FORM = SubLObjectFactory.makeSymbol("PPH-CLAUSAL-FORM");
        $int87$32 = SubLObjectFactory.makeInteger(32);
        $sym88$PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT = SubLObjectFactory.makeSymbol("PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT");
        $const89$FamilyRelationSlot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FamilyRelationSlot"));
        $const90$Agent_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agent-Generic"));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-MT"));
        $kw92$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw93$GENL = SubLObjectFactory.makeKeyword("GENL");
        $kw94$NOT_DISJOINT = SubLObjectFactory.makeKeyword("NOT-DISJOINT");
        $int95$100 = SubLObjectFactory.makeInteger(100);
        $sym96$PPH_MAKE_TYPE_LEVEL = SubLObjectFactory.makeSymbol("PPH-MAKE-TYPE-LEVEL");
        $sym97$PPH_TRUTH_PRESERVING_OPERATOR_ = SubLObjectFactory.makeSymbol("PPH-TRUTH-PRESERVING-OPERATOR?");
        $list98 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")));
        $list99 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")));
        $const100$extentCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extentCardinality"));
        $const101$trueSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $const102$holdsSometimeDuring = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("holdsSometimeDuring"));
        $const103$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym104$EL_EXISTENTIAL_P = SubLObjectFactory.makeSymbol("EL-EXISTENTIAL-P");
        $sym105$QUANTIFIED_SUB_SENTENCE = SubLObjectFactory.makeSymbol("QUANTIFIED-SUB-SENTENCE");
        $sym106$PPH_MIN_VARIABLE_ISA_CONSTRAINT = SubLObjectFactory.makeSymbol("PPH-MIN-VARIABLE-ISA-CONSTRAINT");
        $str107$Constraints_on__S_are__S_____choo = SubLObjectFactory.makeString("Constraints on ~S are ~S;~%, choosing ~S~%");
        $sym108$PPH_FIND_MOST_SPECIFIC = SubLObjectFactory.makeSymbol("PPH-FIND-MOST-SPECIFIC");
        $sym109$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
    }
    
    public static final class $pph_var_entry_native extends SubLStructNative
    {
        public SubLObject $var;
        public SubLObject $type;
        public SubLObject $quantifier;
        public SubLObject $single_useP;
        public SubLObject $arg_position;
        private static final SubLStructDeclNative structDecl;
        
        public $pph_var_entry_native() {
            this.$var = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$quantifier = (SubLObject)CommonSymbols.NIL;
            this.$single_useP = (SubLObject)CommonSymbols.NIL;
            this.$arg_position = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$pph_var_entry_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$var;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$quantifier;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$single_useP;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$arg_position;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$var = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$quantifier = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$single_useP = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$arg_position = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$pph_var_entry_native.class, pph_variable_handling.$sym0$PPH_VAR_ENTRY, pph_variable_handling.$sym1$PPH_VAR_ENTRY_P, pph_variable_handling.$list2, pph_variable_handling.$list3, new String[] { "$var", "$type", "$quantifier", "$single_useP", "$arg_position" }, pph_variable_handling.$list4, pph_variable_handling.$list5, pph_variable_handling.$sym6$PPRINT_PPH_VAR_ENTRY);
        }
    }
    
    public static final class $pph_var_entry_p$UnaryFunction extends UnaryFunction
    {
        public $pph_var_entry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-VAR-ENTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return pph_variable_handling.pph_var_entry_p(arg1);
        }
    }
}

/*

	Total time: 474 ms
	
*/