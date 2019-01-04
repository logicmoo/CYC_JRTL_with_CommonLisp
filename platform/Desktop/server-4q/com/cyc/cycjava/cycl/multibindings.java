package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class multibindings extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.multibindings";
    public static final String myFingerPrint = "c97ae837ee8ff6ff754ab3dedcf02a16da004df41503f4f8a3f850d08c593156";
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 1842L)
    private static SubLSymbol $multibinding_fail$;
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 1940L)
    public static SubLSymbol $mb_reify_natsP$;
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLSymbol $dtp_mbinding$;
    private static final SubLSymbol $kw0$FAIL;
    private static final SubLSymbol $sym1$TERMS_IN_MULTIBINDING_ORDER_;
    private static final SubLSymbol $sym2$EL_VAR_;
    private static final SubLSymbol $sym3$ATOM;
    private static final SubLString $str4$warning__trying_to_sort_the_varia;
    private static final SubLString $str5$warning__trying_to_string_sort_th;
    private static final SubLSymbol $sym6$EMPTY_MULTIBINDING_PAIR_;
    private static final SubLString $str7$convert_unit_to_normal_binding___;
    private static final SubLSymbol $sym8$MULTIBINDING_P;
    private static final SubLString $str9$MBIND_SIMPLE_BINDING_LIST___s_is_;
    private static final SubLString $str10$MULTIBINDING_;
    private static final SubLString $str11$_s____;
    private static final SubLString $str12$__s;
    private static final SubLSymbol $sym13$MBINDING;
    private static final SubLSymbol $sym14$MBINDING_P;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$PRINT_MB;
    private static final SubLSymbol $sym20$MBINDING_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$MB_MULTI_VAR_TERM_MAP;
    private static final SubLSymbol $sym23$_CSETF_MB_MULTI_VAR_TERM_MAP;
    private static final SubLSymbol $sym24$MB_SIMPLE_VAR_TERM_MAP;
    private static final SubLSymbol $sym25$_CSETF_MB_SIMPLE_VAR_TERM_MAP;
    private static final SubLSymbol $sym26$MB_DEGENERATE_;
    private static final SubLSymbol $sym27$_CSETF_MB_DEGENERATE_;
    private static final SubLSymbol $kw28$MULTI_VAR_TERM_MAP;
    private static final SubLSymbol $kw29$SIMPLE_VAR_TERM_MAP;
    private static final SubLSymbol $kw30$DEGENERATE_;
    private static final SubLString $str31$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw32$BEGIN;
    private static final SubLSymbol $sym33$MAKE_MBINDING;
    private static final SubLSymbol $kw34$SLOT;
    private static final SubLSymbol $kw35$END;
    private static final SubLSymbol $sym36$VISIT_DEFSTRUCT_OBJECT_MBINDING_METHOD;
    private static final SubLString $str37$__MB_;
    private static final SubLString $str38$_a_;
    private static final SubLString $str39$_a;
    private static final SubLString $str40$_;
    private static final SubLString $str41$empty_;
    private static final SubLSymbol $sym42$FIRST;
    private static final SubLSymbol $sym43$SECOND;
    private static final SubLSymbol $sym44$APPEND;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$ENTRY;
    private static final SubLSymbol $sym47$PROGN;
    private static final SubLSymbol $sym48$DO_DICTIONARY;
    private static final SubLSymbol $sym49$CLET;
    private static final SubLSymbol $sym50$MAPCAR;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$PUNLESS;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$ENTRY;
    private static final SubLSymbol $sym55$VARIABLE_EXTENT_IN_MULTIBINDING;
    private static final SubLSymbol $sym56$IGNORE;
    private static final SubLString $str57$;
    private static final SubLString $str58$___s____;
    private static final SubLSymbol $sym59$CAR;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$MB_ADD_BINDINGS_AND_SUPPORTS;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$BINDING_LIST_P;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$MULTIBINDING_REIFY_NAT_VALUES;
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 2087L)
    public static SubLObject multibinding_fail_token() {
        return multibindings.$multibinding_fail$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 2161L)
    public static SubLObject multibinding_failedP(final SubLObject mbinding) {
        return Equality.eq(multibindings.$multibinding_fail$.getGlobalValue(), mbinding);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 2296L)
    public static SubLObject empty_multibindingP(final SubLObject mbind) {
        return (SubLObject)SubLObjectFactory.makeBoolean(multibindings.NIL != dictionary.dictionary_empty_p(mb_multi_var_term_map(mbind)) && multibindings.NIL != dictionary.dictionary_empty_p(mb_simple_var_term_map(mbind)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 2467L)
    public static SubLObject make_multibinding() {
        return make_mbinding((SubLObject)multibindings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 2546L)
    public static SubLObject copy_multibinding(final SubLObject mbind) {
        return copy_mb(mbind);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 2773L)
    public static SubLObject terms_in_multibinding_orderP(final SubLObject term1, final SubLObject term2) {
        if (term1.eql(term2)) {
            return (SubLObject)multibindings.T;
        }
        if (term1.isAtom()) {
            if (term2.isAtom()) {
                return atoms_in_multibinding_orderP(term1, term2);
            }
            return (SubLObject)multibindings.T;
        }
        else {
            if (term2.isAtom()) {
                return (SubLObject)multibindings.NIL;
            }
            return formulas_in_multibinding_orderP(term1, term2);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 3242L)
    public static SubLObject sort_terms_into_multibinding_order(final SubLObject term_list) {
        return Sort.sort(term_list, Symbols.symbol_function((SubLObject)multibindings.$sym1$TERMS_IN_MULTIBINDING_ORDER_), (SubLObject)multibindings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 3364L)
    public static SubLObject formulas_in_multibinding_orderP(final SubLObject formula1, final SubLObject formula2) {
        final SubLObject var_num1 = list_utilities.tree_count_if(Symbols.symbol_function((SubLObject)multibindings.$sym2$EL_VAR_), formula1, (SubLObject)multibindings.UNPROVIDED);
        final SubLObject var_num2 = list_utilities.tree_count_if(Symbols.symbol_function((SubLObject)multibindings.$sym2$EL_VAR_), formula2, (SubLObject)multibindings.UNPROVIDED);
        if (var_num1.numL(var_num2)) {
            return (SubLObject)multibindings.T;
        }
        if (var_num1.numG(var_num2)) {
            return (SubLObject)multibindings.NIL;
        }
        final SubLObject atom_num1 = list_utilities.tree_count_if(Symbols.symbol_function((SubLObject)multibindings.$sym3$ATOM), formula1, (SubLObject)multibindings.UNPROVIDED);
        final SubLObject atom_num2 = list_utilities.tree_count_if(Symbols.symbol_function((SubLObject)multibindings.$sym3$ATOM), formula2, (SubLObject)multibindings.UNPROVIDED);
        if (atom_num1.numL(atom_num2)) {
            return (SubLObject)multibindings.T;
        }
        if (atom_num1.numG(atom_num2)) {
            return (SubLObject)multibindings.NIL;
        }
        if (cycl_utilities.formula_arg0(formula1).equal(cycl_utilities.formula_arg0(formula2))) {
            return terms_in_multibinding_orderP(cycl_utilities.formula_args(formula1, (SubLObject)multibindings.UNPROVIDED), cycl_utilities.formula_args(formula2, (SubLObject)multibindings.UNPROVIDED));
        }
        return terms_in_multibinding_orderP(cycl_utilities.formula_arg0(formula1), cycl_utilities.formula_arg0(formula2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 4164L)
    public static SubLObject multibinding_constant_L(final SubLObject constant1, final SubLObject constant2) {
        return constants_high.constant_external_id_L(constant1, constant2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 4395L)
    public static SubLObject atoms_in_multibinding_orderP(final SubLObject atom1, final SubLObject atom2) {
        if (multibindings.NIL != nart_handles.nart_p(atom1) && multibindings.NIL != nart_handles.nart_p(atom2)) {
            return terms_in_multibinding_orderP(narts_high.nart_el_formula(atom1), narts_high.nart_el_formula(atom2));
        }
        if (multibindings.NIL != nart_handles.nart_p(atom1)) {
            return terms_in_multibinding_orderP(narts_high.nart_el_formula(atom1), atom2);
        }
        if (multibindings.NIL != nart_handles.nart_p(atom2)) {
            return terms_in_multibinding_orderP(atom1, narts_high.nart_el_formula(atom2));
        }
        if (multibindings.NIL != cycl_variables.kb_varP(atom1)) {
            return terms_in_multibinding_orderP(variables.default_el_var_for_hl_var(atom1), atom2);
        }
        if (multibindings.NIL != cycl_variables.kb_varP(atom2)) {
            return terms_in_multibinding_orderP(atom1, variables.default_el_var_for_hl_var(atom2));
        }
        if (multibindings.NIL != constant_handles.constant_p(atom1)) {
            if (multibindings.NIL != constant_handles.constant_p(atom2)) {
                return multibinding_constant_L(atom1, atom2);
            }
            return (SubLObject)multibindings.T;
        }
        else {
            if (multibindings.NIL != constant_handles.constant_p(atom2)) {
                return (SubLObject)multibindings.NIL;
            }
            if (multibindings.NIL != cycl_variables.el_varP(atom1)) {
                if (multibindings.NIL != cycl_variables.el_varP(atom2)) {
                    el_utilities.el_error((SubLObject)multibindings.FIVE_INTEGER, (SubLObject)multibindings.$str4$warning__trying_to_sort_the_varia, atom1, atom2, (SubLObject)multibindings.UNPROVIDED);
                    return Strings.string_lessp(Symbols.symbol_name(atom1), Symbols.symbol_name(atom2), (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
                }
                return (SubLObject)multibindings.T;
            }
            else {
                if (multibindings.NIL != cycl_variables.el_varP(atom2)) {
                    return (SubLObject)multibindings.NIL;
                }
                if (atom1.isSymbol()) {
                    if (atom2.isSymbol()) {
                        return Strings.string_lessp(Symbols.symbol_name(atom1), Symbols.symbol_name(atom2), (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
                    }
                    return (SubLObject)multibindings.T;
                }
                else {
                    if (atom2.isSymbol()) {
                        return (SubLObject)multibindings.NIL;
                    }
                    if (atom1.isNumber()) {
                        if (atom2.isNumber()) {
                            return Numbers.numL(atom1, atom2);
                        }
                        return (SubLObject)multibindings.T;
                    }
                    else {
                        if (atom2.isNumber()) {
                            return (SubLObject)multibindings.NIL;
                        }
                        if (atom1.isChar()) {
                            if (atom2.isChar()) {
                                return Characters.char_lessp(atom1, atom2);
                            }
                            return (SubLObject)multibindings.T;
                        }
                        else {
                            if (atom2.isChar()) {
                                return (SubLObject)multibindings.NIL;
                            }
                            if (atom1.isString()) {
                                if (atom2.isString()) {
                                    return Strings.string_lessp(atom1, atom2, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
                                }
                                return (SubLObject)multibindings.T;
                            }
                            else {
                                if (atom2.isString()) {
                                    return (SubLObject)multibindings.NIL;
                                }
                                el_utilities.el_error((SubLObject)multibindings.FIVE_INTEGER, (SubLObject)multibindings.$str5$warning__trying_to_string_sort_th, atom1, atom2, (SubLObject)multibindings.UNPROVIDED);
                                return Strings.string_lessp(string_utilities.str(atom1), string_utilities.str(atom2), (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 6953L)
    public static SubLObject compose_multibindings(final SubLObject sub1, final SubLObject sub2) {
        final SubLObject new_bindings = conses_high.copy_list(sub1);
        SubLObject bindings_to_append = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = sub2;
        SubLObject sub_pair = (SubLObject)multibindings.NIL;
        sub_pair = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            if (multibindings.NIL == conses_high.assoc(sub_pair.first(), new_bindings, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED)) {
                bindings_to_append = (SubLObject)ConsesLow.cons(sub_pair, bindings_to_append);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_pair = cdolist_list_var.first();
        }
        return ConsesLow.append(new_bindings, Sequences.reverse(bindings_to_append));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 7451L)
    public static SubLObject multibinding_p(final SubLObject x) {
        return mbinding_p(x);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 7601L)
    public static SubLObject simple_multibinding_listP(final SubLObject subs) {
        if (multibindings.NIL == subs) {
            return (SubLObject)multibindings.T;
        }
        if (multibindings.NIL != unit_multibinding_pairP(subs.first())) {
            return simple_multibinding_listP(subs.rest());
        }
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 7788L)
    public static SubLObject unit_multibinding_pairP(final SubLObject binding) {
        return Numbers.numE(conses_high.list_length(binding), (SubLObject)multibindings.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 7936L)
    public static SubLObject empty_multibinding_pairP(final SubLObject binding) {
        return Numbers.numE(conses_high.list_length(binding), (SubLObject)multibindings.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 8085L)
    public static SubLObject degenerate_multibindingP(final SubLObject mbinding) {
        return conses_high.member_if((SubLObject)multibindings.$sym6$EMPTY_MULTIBINDING_PAIR_, mbinding, (SubLObject)multibindings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 8250L)
    public static SubLObject atomic_unit_multibinding_pairP(final SubLObject binding) {
        return (SubLObject)SubLObjectFactory.makeBoolean(multibindings.NIL != unit_multibinding_pairP(binding) && conses_high.second(binding).isAtom() && multibindings.NIL == cycl_variables.el_varP(conses_high.second(binding)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 8493L)
    public static SubLObject convert_unit_to_normal_binding(final SubLObject unit_binding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (multibindings.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && multibindings.NIL == unit_multibinding_pairP(unit_binding)) {
            Errors.error((SubLObject)multibindings.$str7$convert_unit_to_normal_binding___, unit_binding);
        }
        return (SubLObject)ConsesLow.cons(unit_binding.first(), conses_high.second(unit_binding));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 8813L)
    public static SubLObject assoc_multibinding(final SubLObject var, final SubLObject mbinding) {
        return conses_high.assoc(var, mbinding, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 8993L)
    public static SubLObject get_multibinding_values(final SubLObject var, final SubLObject mbinding) {
        return mb_var_values(var, mbinding);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 9174L)
    public static SubLObject atomic_binding_in_multibindingP(final SubLObject var, final SubLObject mbind) {
        final SubLObject values = get_multibinding_values(var, mbind);
        if (conses_high.list_length(values).numE((SubLObject)multibindings.ONE_INTEGER) && list_utilities.tree_count_if((SubLObject)multibindings.$sym2$EL_VAR_, values, (SubLObject)multibindings.UNPROVIDED).numE((SubLObject)multibindings.ZERO_INTEGER)) {
            return (SubLObject)multibindings.T;
        }
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 9534L)
    public static SubLObject replace_or_create_in_multibinding(final SubLObject var, final SubLObject value_list, final SubLObject mbinding) {
        final SubLObject bpair = assoc_multibinding(var, mbinding);
        if (multibindings.NIL == bpair) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var, value_list), mbinding);
        }
        ConsesLow.rplacd(bpair, value_list);
        return mbinding;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 9962L)
    public static SubLObject variable_in_multibindingP(final SubLObject var, final SubLObject mbinding) {
        return list_utilities.sublisp_boolean(assoc_multibinding(var, mbinding));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 10079L)
    public static SubLObject free_variable_in_multibindingP(final SubLObject var, final SubLObject mbinding) {
        final SubLObject vals = get_multibinding_values(var, mbinding);
        if (multibindings.NIL == vals) {
            return (SubLObject)multibindings.T;
        }
        final SubLObject vars_in_binding = list_utilities.tree_gather(vals, (SubLObject)multibindings.$sym2$EL_VAR_, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
        if (multibindings.NIL == vars_in_binding) {
            return (SubLObject)multibindings.NIL;
        }
        SubLObject cdolist_list_var = vars_in_binding;
        SubLObject v = (SubLObject)multibindings.NIL;
        v = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            if (multibindings.NIL != free_variable_in_multibindingP(v, mbinding)) {
                return (SubLObject)multibindings.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v = cdolist_list_var.first();
        }
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 10562L)
    public static SubLObject apply_multibinding(final SubLObject exp, final SubLObject mbind) {
        return (SubLObject)ConsesLow.list(conses_high.sublis(mbind, exp, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 10655L)
    public static SubLObject propagate_atomic_multibinding(final SubLObject mbinding) {
        final SubLObject reversed_mbinding = Sequences.reverse(mbinding);
        SubLObject unit_subs = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = reversed_mbinding;
        SubLObject bpair = (SubLObject)multibindings.NIL;
        bpair = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = unit_subs;
            SubLObject unit_sub = (SubLObject)multibindings.NIL;
            unit_sub = cdolist_list_var_$1.first();
            while (multibindings.NIL != cdolist_list_var_$1) {
                conses_high.nsubst(conses_high.second(unit_sub), unit_sub.first(), bpair, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                unit_sub = cdolist_list_var_$1.first();
            }
            if (multibindings.NIL != atomic_unit_multibinding_pairP(bpair)) {
                unit_subs = (SubLObject)ConsesLow.cons(bpair, unit_subs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bpair = cdolist_list_var.first();
        }
        return Sequences.reverse(reversed_mbinding);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 11027L)
    public static SubLObject singleton_variable_extentP(final SubLObject var, final SubLObject mbinding) {
        return (SubLObject)(conses_high.list_length(variable_extent_in_multibinding(var, mbinding)).numE((SubLObject)multibindings.ONE_INTEGER) ? multibindings.T : multibindings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 11269L)
    public static SubLObject collate_multibinding_list(final SubLObject mbindings) {
        SubLObject next_mbindings = Sequences.subseq(mbindings, (SubLObject)multibindings.ZERO_INTEGER, (SubLObject)multibindings.ONE_INTEGER);
        SubLObject made_a_changeP = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = mbindings.rest();
        SubLObject cur_mbinding = (SubLObject)multibindings.NIL;
        cur_mbinding = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            SubLObject doneP = (SubLObject)multibindings.NIL;
            if (multibindings.NIL == doneP) {
                SubLObject csome_list_var = next_mbindings;
                SubLObject cur_next_mbinding = (SubLObject)multibindings.NIL;
                cur_next_mbinding = csome_list_var.first();
                while (multibindings.NIL == doneP && multibindings.NIL != csome_list_var) {
                    final SubLObject different_var = only_variable_different(cur_next_mbinding, cur_mbinding);
                    if (multibindings.NIL != different_var) {
                        final SubLObject old_values = get_multibinding_values(different_var, cur_mbinding);
                        final SubLObject next_entry = assoc_multibinding(different_var, cur_next_mbinding);
                        made_a_changeP = (SubLObject)multibindings.T;
                        ConsesLow.rplacd(next_entry, sort_terms_into_multibinding_order(conses_high.union(next_entry.rest(), old_values, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED)));
                        doneP = (SubLObject)multibindings.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    cur_next_mbinding = csome_list_var.first();
                }
            }
            if (multibindings.NIL == doneP) {
                next_mbindings = (SubLObject)ConsesLow.cons(cur_mbinding, next_mbindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_mbinding = cdolist_list_var.first();
        }
        return Values.values(next_mbindings, made_a_changeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 12254L)
    public static SubLObject simple_multibinding(final SubLObject mbinding) {
        assert multibindings.NIL != multibinding_p(mbinding) : mbinding;
        SubLObject simple_pairs = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = mbinding;
        SubLObject bpair = (SubLObject)multibindings.NIL;
        bpair = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            final SubLObject var = bpair.first();
            if (multibindings.NIL != singleton_variable_extentP(var, mbinding)) {
                simple_pairs = (SubLObject)ConsesLow.cons(bpair, simple_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bpair = cdolist_list_var.first();
        }
        return Sequences.reverse(simple_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 13295L)
    public static SubLObject mbind_simple_binding_list(final SubLObject mbinding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (multibindings.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && multibindings.NIL == multibinding_p(mbinding)) {
            Errors.error((SubLObject)multibindings.$str9$MBIND_SIMPLE_BINDING_LIST___s_is_, mbinding);
        }
        return mb_simple_binding(mbinding);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 13723L)
    public static SubLObject print_multibinding(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        assert multibindings.NIL != multibinding_p(v_object) : v_object;
        print_high.princ((SubLObject)multibindings.$str10$MULTIBINDING_, (SubLObject)multibindings.UNPROVIDED);
        streams_high.terpri((SubLObject)multibindings.UNPROVIDED);
        SubLObject cdolist_list_var = v_object;
        SubLObject cur_pair = (SubLObject)multibindings.NIL;
        cur_pair = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)multibindings.$str11$_s____, cur_pair.first());
            SubLObject cdolist_list_var_$2 = cur_pair.rest();
            SubLObject cur_val = (SubLObject)multibindings.NIL;
            cur_val = cdolist_list_var_$2.first();
            while (multibindings.NIL != cdolist_list_var_$2) {
                PrintLow.format(stream, (SubLObject)multibindings.$str12$__s, cur_val);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                cur_val = cdolist_list_var_$2.first();
            }
            streams_high.terpri((SubLObject)multibindings.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cur_pair = cdolist_list_var.first();
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14705L)
    public static SubLObject multibinding_string(final SubLObject v_object) {
        return mb_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject mbinding_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_mb(v_object, stream, (SubLObject)multibindings.ZERO_INTEGER);
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject mbinding_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $mbinding_native.class) ? multibindings.T : multibindings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject mb_multi_var_term_map(final SubLObject v_object) {
        assert multibindings.NIL != mbinding_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject mb_simple_var_term_map(final SubLObject v_object) {
        assert multibindings.NIL != mbinding_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject mb_degenerateP(final SubLObject v_object) {
        assert multibindings.NIL != mbinding_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject _csetf_mb_multi_var_term_map(final SubLObject v_object, final SubLObject value) {
        assert multibindings.NIL != mbinding_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject _csetf_mb_simple_var_term_map(final SubLObject v_object, final SubLObject value) {
        assert multibindings.NIL != mbinding_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject _csetf_mb_degenerateP(final SubLObject v_object, final SubLObject value) {
        assert multibindings.NIL != mbinding_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject make_mbinding(SubLObject arglist) {
        if (arglist == multibindings.UNPROVIDED) {
            arglist = (SubLObject)multibindings.NIL;
        }
        final SubLObject v_new = (SubLObject)new $mbinding_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)multibindings.NIL, next = arglist; multibindings.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)multibindings.$kw28$MULTI_VAR_TERM_MAP)) {
                _csetf_mb_multi_var_term_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)multibindings.$kw29$SIMPLE_VAR_TERM_MAP)) {
                _csetf_mb_simple_var_term_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)multibindings.$kw30$DEGENERATE_)) {
                _csetf_mb_degenerateP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)multibindings.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject visit_defstruct_mbinding(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)multibindings.$kw32$BEGIN, (SubLObject)multibindings.$sym33$MAKE_MBINDING, (SubLObject)multibindings.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)multibindings.$kw34$SLOT, (SubLObject)multibindings.$kw28$MULTI_VAR_TERM_MAP, mb_multi_var_term_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)multibindings.$kw34$SLOT, (SubLObject)multibindings.$kw29$SIMPLE_VAR_TERM_MAP, mb_simple_var_term_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)multibindings.$kw34$SLOT, (SubLObject)multibindings.$kw30$DEGENERATE_, mb_degenerateP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)multibindings.$kw35$END, (SubLObject)multibindings.$sym33$MAKE_MBINDING, (SubLObject)multibindings.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 14779L)
    public static SubLObject visit_defstruct_object_mbinding_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_mbinding(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 16468L)
    public static SubLObject print_mb(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)multibindings.$str37$__MB_);
        final SubLObject vars = mb_variables(v_object);
        if (multibindings.NIL != vars) {
            SubLObject cdolist_list_var = vars;
            SubLObject cur_var = (SubLObject)multibindings.NIL;
            cur_var = cdolist_list_var.first();
            while (multibindings.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)multibindings.$str38$_a_, cur_var);
                final SubLObject terms = mb_var_values(cur_var, v_object);
                final SubLObject n = Sequences.length(terms);
                PrintLow.format(stream, (SubLObject)multibindings.$str39$_a, n);
                cdolist_list_var = cdolist_list_var.rest();
                cur_var = cdolist_list_var.first();
            }
            PrintLow.format(stream, (SubLObject)multibindings.$str40$_);
        }
        else {
            PrintLow.format(stream, (SubLObject)multibindings.$str41$empty_);
        }
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 17056L)
    public static SubLObject create_mb() {
        final SubLObject new_mbind = make_mbinding((SubLObject)multibindings.UNPROVIDED);
        _csetf_mb_multi_var_term_map(new_mbind, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)multibindings.EQL), (SubLObject)multibindings.TEN_INTEGER));
        _csetf_mb_simple_var_term_map(new_mbind, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)multibindings.EQL), (SubLObject)multibindings.TEN_INTEGER));
        return new_mbind;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 17292L)
    public static SubLObject empty_mb() {
        return create_mb();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 17341L)
    public static SubLObject copy_mb(final SubLObject mb) {
        final SubLObject new_mb = make_mbinding((SubLObject)multibindings.UNPROVIDED);
        _csetf_mb_multi_var_term_map(new_mb, dictionary_utilities.copy_dictionary(mb_multi_var_term_map(mb)));
        _csetf_mb_simple_var_term_map(new_mb, dictionary_utilities.copy_dictionary(mb_simple_var_term_map(mb)));
        return new_mb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 17603L)
    public static SubLObject mb_multi_variables(final SubLObject mb) {
        return dictionary.dictionary_keys(mb_multi_var_term_map(mb));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 17705L)
    public static SubLObject mb_simple_variables(final SubLObject mb) {
        return dictionary.dictionary_keys(mb_simple_var_term_map(mb));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 17804L)
    public static SubLObject mb_variables(final SubLObject mb) {
        return ConsesLow.append(mb_multi_variables(mb), mb_simple_variables(mb));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 17914L)
    public static SubLObject mb_multi_var_entry(final SubLObject var, final SubLObject mb) {
        return dictionary.dictionary_lookup(mb_multi_var_term_map(mb), var, (SubLObject)multibindings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 18020L)
    public static SubLObject mb_multi_var_values(final SubLObject var, final SubLObject mb) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), mb_multi_var_entry(var, mb));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 18121L)
    public static SubLObject mb_simple_var_entry(final SubLObject var, final SubLObject mb) {
        return dictionary.dictionary_lookup(mb_simple_var_term_map(mb), var, (SubLObject)multibindings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 18234L)
    public static SubLObject mb_simple_var_values(final SubLObject var, final SubLObject mb) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), mb_simple_var_entry(var, mb));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 18337L)
    public static SubLObject mb_var_values(final SubLObject var, final SubLObject mb) {
        final SubLObject result = mb_multi_var_values(var, mb);
        return (multibindings.NIL != result) ? result : mb_simple_var_values(var, mb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 18498L)
    public static SubLObject mb_var_entry(final SubLObject var, final SubLObject mb) {
        final SubLObject result = mb_multi_var_entry(var, mb);
        return (multibindings.NIL != result) ? result : mb_simple_var_entry(var, mb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 18660L)
    public static SubLObject mb_var_supports(final SubLObject var, final SubLObject mb) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym43$SECOND), mb_var_entry(var, mb));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 18743L)
    public static SubLObject mb_supports(final SubLObject mb) {
        SubLObject supports = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = mb_variables(mb);
        SubLObject var = (SubLObject)multibindings.NIL;
        var = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            supports = Functions.apply((SubLObject)multibindings.$sym44$APPEND, (SubLObject)ConsesLow.cons(supports, mb_var_supports(var, mb)));
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 18941L)
    public static SubLObject set_mb_var_entry(final SubLObject mb, final SubLObject var, final SubLObject entry) {
        if (Sequences.length(entry).numG((SubLObject)multibindings.ONE_INTEGER)) {
            mb_promote_var_to_multi(var, mb);
            dictionary.dictionary_enter(mb_multi_var_term_map(mb), var, entry);
        }
        else {
            mb_promote_var_to_simple(var, mb);
            dictionary.dictionary_enter(mb_simple_var_term_map(mb), var, entry);
        }
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 19253L)
    public static SubLObject mb_var_push(final SubLObject mb, final SubLObject var, final SubLObject item) {
        if (multibindings.NIL != mb_multi_variableP(var, mb)) {
            dictionary_utilities.dictionary_push(mb_multi_var_term_map(mb), var, item);
        }
        else if (multibindings.NIL != mb_simple_variableP(var, mb)) {
            mb_promote_var_to_multi(var, mb);
            dictionary_utilities.dictionary_push(mb_multi_var_term_map(mb), var, item);
        }
        else {
            dictionary_utilities.dictionary_push(mb_simple_var_term_map(mb), var, item);
        }
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 19616L)
    public static SubLObject mb_multi_variableP(final SubLObject var, final SubLObject mb) {
        return mb_multi_var_values(var, mb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 19700L)
    public static SubLObject mb_simple_variableP(final SubLObject var, final SubLObject mb) {
        return mb_simple_var_values(var, mb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 19786L)
    public static SubLObject mb_variableP(final SubLObject var, final SubLObject mb) {
        return (SubLObject)SubLObjectFactory.makeBoolean(multibindings.NIL != mb_multi_variableP(var, mb) || multibindings.NIL != mb_simple_variableP(var, mb));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 19902L)
    public static SubLObject mb_promote_var_to_simple(final SubLObject var, final SubLObject mb) {
        final SubLObject values = mb_multi_var_entry(var, mb);
        dictionary.dictionary_enter(mb_simple_var_term_map(mb), var, values);
        dictionary.dictionary_remove(mb_multi_var_term_map(mb), var);
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 20134L)
    public static SubLObject mb_promote_var_to_multi(final SubLObject var, final SubLObject mb) {
        final SubLObject values = mb_simple_var_entry(var, mb);
        dictionary.dictionary_enter(mb_multi_var_term_map(mb), var, values);
        dictionary.dictionary_remove(mb_simple_var_term_map(mb), var);
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 20374L)
    public static SubLObject do_mbind(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)multibindings.NIL;
        SubLObject values = (SubLObject)multibindings.NIL;
        SubLObject mb = (SubLObject)multibindings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list45);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list45);
        values = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list45);
        mb = current.first();
        current = current.rest();
        final SubLObject done = (SubLObject)(current.isCons() ? current.first() : multibindings.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)multibindings.$list45);
        current = current.rest();
        if (multibindings.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject entry = (SubLObject)multibindings.$sym46$ENTRY;
            return (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym47$PROGN, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym48$DO_DICTIONARY, (SubLObject)ConsesLow.list(var, entry, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym22$MB_MULTI_VAR_TERM_MAP, mb), done), (SubLObject)ConsesLow.listS((SubLObject)multibindings.$sym49$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(values, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym50$MAPCAR, (SubLObject)multibindings.$list51, entry))), ConsesLow.append(body, (SubLObject)multibindings.NIL))), (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym52$PUNLESS, done, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym48$DO_DICTIONARY, (SubLObject)ConsesLow.list(var, entry, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym24$MB_SIMPLE_VAR_TERM_MAP, mb), done), (SubLObject)ConsesLow.listS((SubLObject)multibindings.$sym49$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(values, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym50$MAPCAR, (SubLObject)multibindings.$list51, entry))), ConsesLow.append(body, (SubLObject)multibindings.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)multibindings.$list45);
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 20779L)
    public static SubLObject do_mbind_var_extents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)multibindings.NIL;
        SubLObject extent = (SubLObject)multibindings.NIL;
        SubLObject mb = (SubLObject)multibindings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list53);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list53);
        extent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list53);
        mb = current.first();
        current = current.rest();
        final SubLObject done = (SubLObject)(current.isCons() ? current.first() : multibindings.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)multibindings.$list53);
        current = current.rest();
        if (multibindings.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject entry = (SubLObject)multibindings.$sym54$ENTRY;
            return (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym47$PROGN, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym48$DO_DICTIONARY, (SubLObject)ConsesLow.list(var, entry, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym22$MB_MULTI_VAR_TERM_MAP, mb), done), (SubLObject)ConsesLow.listS((SubLObject)multibindings.$sym49$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(extent, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym55$VARIABLE_EXTENT_IN_MULTIBINDING, var, mb))), (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym56$IGNORE, entry), ConsesLow.append(body, (SubLObject)multibindings.NIL))), (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym52$PUNLESS, done, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym48$DO_DICTIONARY, (SubLObject)ConsesLow.list(var, entry, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym24$MB_SIMPLE_VAR_TERM_MAP, mb), done), (SubLObject)ConsesLow.listS((SubLObject)multibindings.$sym49$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(extent, (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym55$VARIABLE_EXTENT_IN_MULTIBINDING, var, mb))), (SubLObject)ConsesLow.list((SubLObject)multibindings.$sym56$IGNORE, entry), ConsesLow.append(body, (SubLObject)multibindings.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)multibindings.$list53);
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 21271L)
    public static SubLObject mb_simple_binding(final SubLObject mb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject blist = (SubLObject)multibindings.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            blist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var, entry.first().first()), blist);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return blist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 21463L)
    public static SubLObject mb_string(final SubLObject mb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject obj_string = (SubLObject)multibindings.$str57$;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mb))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), entry);
            obj_string = Sequences.cconcatenate(obj_string, PrintLow.format((SubLObject)multibindings.NIL, (SubLObject)multibindings.$str58$___s____, var));
            SubLObject cdolist_list_var = values;
            SubLObject cur_val = (SubLObject)multibindings.NIL;
            cur_val = cdolist_list_var.first();
            while (multibindings.NIL != cdolist_list_var) {
                obj_string = Sequences.cconcatenate(obj_string, PrintLow.format((SubLObject)multibindings.NIL, (SubLObject)multibindings.$str12$__s, cur_val));
                cdolist_list_var = cdolist_list_var.rest();
                cur_val = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), entry);
            obj_string = Sequences.cconcatenate(obj_string, PrintLow.format((SubLObject)multibindings.NIL, (SubLObject)multibindings.$str58$___s____, var));
            SubLObject cdolist_list_var = values;
            SubLObject cur_val = (SubLObject)multibindings.NIL;
            cur_val = cdolist_list_var.first();
            while (multibindings.NIL != cdolist_list_var) {
                obj_string = Sequences.cconcatenate(obj_string, PrintLow.format((SubLObject)multibindings.NIL, (SubLObject)multibindings.$str12$__s, cur_val));
                cdolist_list_var = cdolist_list_var.rest();
                cur_val = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return obj_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 21818L)
    public static SubLObject mb_add_bindings(final SubLObject mb, final SubLObject v_bindings) {
        return mb_add_bindings_and_supports(mb, v_bindings, (SubLObject)multibindings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 21924L)
    public static SubLObject mb_add_supports_to_value(final SubLObject mb, final SubLObject var, final SubLObject value, final SubLObject new_supports) {
        final SubLObject entry = mb_var_entry(var, mb);
        SubLObject current;
        final SubLObject datum = current = conses_high.member(value, entry, Symbols.symbol_function((SubLObject)multibindings.EQUAL), Symbols.symbol_function((SubLObject)multibindings.$sym59$CAR)).first();
        SubLObject value_$3 = (SubLObject)multibindings.NIL;
        SubLObject old_supports = (SubLObject)multibindings.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list60);
        value_$3 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list60);
        old_supports = current.first();
        current = current.rest();
        if (multibindings.NIL == current) {
            set_mb_var_entry(mb, var, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value_$3, ConsesLow.append(old_supports, new_supports))));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)multibindings.$list60);
        }
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 22349L)
    public static SubLObject mb_add_bindings_and_supports(final SubLObject mb, final SubLObject v_bindings, final SubLObject supports) {
        final SubLObject new_mb = copy_mb(mb);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject bpair = (SubLObject)multibindings.NIL;
        bpair = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            final SubLObject var = bpair.first();
            final SubLObject value = bpair.rest();
            if (multibindings.NIL != mb_variableP(var, new_mb)) {
                final SubLObject values = mb_var_values(var, new_mb);
                if (multibindings.NIL != conses_high.member(value, values, Symbols.symbol_function((SubLObject)multibindings.EQUAL), (SubLObject)multibindings.UNPROVIDED)) {
                    mb_add_supports_to_value(new_mb, var, value, supports);
                }
                else {
                    if (multibindings.NIL == cycl_variables.el_varP(value)) {
                        return multibinding_fail_token();
                    }
                    final SubLObject values_2 = mb_var_values(value, new_mb);
                    set_mb_var_entry(new_mb, value, mb_make_entry_with_null_supports(conses_high.intersection(values, values_2, Symbols.symbol_function((SubLObject)multibindings.EQUAL), (SubLObject)multibindings.UNPROVIDED)));
                    set_mb_var_entry(new_mb, var, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value, (SubLObject)multibindings.NIL)));
                }
            }
            else {
                mb_var_push(new_mb, var, (SubLObject)ConsesLow.list(value, supports));
            }
            cdolist_list_var = cdolist_list_var.rest();
            bpair = cdolist_list_var.first();
        }
        return new_mb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 23158L)
    public static SubLObject mb_add_blist_and_supports_entry(final SubLObject mb, final SubLObject entry) {
        return Functions.apply((SubLObject)multibindings.$sym61$MB_ADD_BINDINGS_AND_SUPPORTS, (SubLObject)ConsesLow.cons(mb, entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 23282L)
    public static SubLObject make_mbinds_from_binding_lists(final SubLObject binding_lists, final SubLObject old_mb) {
        SubLObject v_answer = (SubLObject)multibindings.NIL;
        SubLObject mb = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = mb_collapse_multiple_proof_bindings(binding_lists);
        SubLObject blist = (SubLObject)multibindings.NIL;
        blist = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            mb = copy_mb(old_mb);
            mb = mb_add_blist_and_supports_entry(mb, blist);
            if (multibindings.NIL == multibinding_failedP(mb)) {
                v_answer = (SubLObject)ConsesLow.cons(mb, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            blist = cdolist_list_var.first();
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 23629L)
    public static SubLObject gather_bound_vars_in_blists_and_supports(final SubLObject binding_lists) {
        SubLObject var_list = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject cur_entry = (SubLObject)multibindings.NIL;
        cur_entry = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = cur_entry.first();
            SubLObject cur_pair = (SubLObject)multibindings.NIL;
            cur_pair = cdolist_list_var_$4.first();
            while (multibindings.NIL != cdolist_list_var_$4) {
                final SubLObject item_var = cur_pair.first();
                if (multibindings.NIL == conses_high.member(item_var, var_list, Symbols.symbol_function((SubLObject)multibindings.EQL), Symbols.symbol_function((SubLObject)multibindings.IDENTITY))) {
                    var_list = (SubLObject)ConsesLow.cons(item_var, var_list);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                cur_pair = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_entry = cdolist_list_var.first();
        }
        return var_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 23871L)
    public static SubLObject mb_reifiable_natP(final SubLObject nat) {
        if (multibindings.NIL != obsolete.reifiable_natP(nat, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED) && multibindings.NIL != czer_utilities.el_find_nart(nat)) {
            return (SubLObject)multibindings.T;
        }
        return (SubLObject)multibindings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 24003L)
    public static SubLObject mb_find_nart_or_naut(final SubLObject nat) {
        final SubLObject nart = czer_utilities.el_find_nart(nat);
        if (multibindings.NIL != nart) {
            return nart;
        }
        return nat;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 24194L)
    public static SubLObject multibinding_reify_nat_values(final SubLObject mb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject done;
        SubLObject iteration_state;
        for (done = (SubLObject)multibindings.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mb))); multibindings.NIL == done && multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            set_mb_var_entry(mb, cur_var, shop_basic_planner_thread.shop_reify_narts_in_expression(entry));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb))); multibindings.NIL == done && multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            set_mb_var_entry(mb, cur_var, shop_basic_planner_thread.shop_reify_narts_in_expression(entry));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return mb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 24885L)
    public static SubLObject mb_collapse_multiple_proof_bindings(final SubLObject binding_lists) {
        SubLObject alist = (SubLObject)multibindings.NIL;
        SubLObject blist = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject cur_binding = (SubLObject)multibindings.NIL;
        cur_binding = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cur_binding;
            SubLObject binding = (SubLObject)multibindings.NIL;
            SubLObject supports = (SubLObject)multibindings.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list62);
            binding = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list62);
            supports = current.first();
            current = current.rest();
            if (multibindings.NIL == current) {
                assert multibindings.NIL != bindings.binding_list_p(binding) : binding;
                alist = list_utilities.assoc_push(binding, supports, alist, Symbols.symbol_function((SubLObject)multibindings.EQUAL));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)multibindings.$list62);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_binding = cdolist_list_var.first();
        }
        cdolist_list_var = alist;
        SubLObject cons = (SubLObject)multibindings.NIL;
        cons = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject binding = (SubLObject)multibindings.NIL;
            SubLObject supports_list = (SubLObject)multibindings.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)multibindings.$list64);
            binding = current.first();
            current = (supports_list = current.rest());
            blist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(binding, Sequences.remove_duplicates(Functions.apply(Symbols.symbol_function((SubLObject)multibindings.$sym44$APPEND), supports_list.first()), Symbols.symbol_function((SubLObject)multibindings.EQUAL), (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED)), blist);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return blist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 25358L)
    public static SubLObject convert_binding_lists_and_supports_to_mbinds(final SubLObject binding_lists, final SubLObject mbind, SubLObject bound_variables) {
        if (bound_variables == multibindings.UNPROVIDED) {
            bound_variables = (SubLObject)multibindings.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (multibindings.NIL == bound_variables) {
            bound_variables = gather_bound_vars_in_blists_and_supports(binding_lists);
        }
        final SubLObject variable_count = conses_high.list_length(bound_variables);
        SubLObject v_answer = (SubLObject)multibindings.NIL;
        SubLObject mb = (SubLObject)multibindings.NIL;
        if (multibindings.ONE_INTEGER.numE(variable_count) || multibindings.ZERO_INTEGER.numE(variable_count)) {
            if (multibindings.NIL != binding_lists) {
                v_answer = (SubLObject)ConsesLow.list(mbind);
            }
            else {
                v_answer = (SubLObject)multibindings.NIL;
            }
        }
        else {
            mb = make_mbinds_from_binding_lists(binding_lists, mbind);
            v_answer = collate_multibindings_totally(mb);
        }
        if (v_answer.isList() && multibindings.NIL != multibindings.$mb_reify_natsP$.getDynamicValue(thread)) {
            v_answer = Mapping.mapcar((SubLObject)multibindings.$sym65$MULTIBINDING_REIFY_NAT_VALUES, v_answer);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 26081L)
    public static SubLObject convert_binding_lists_to_mbinds(final SubLObject v_bindings, SubLObject mbind) {
        if (mbind == multibindings.UNPROVIDED) {
            mbind = empty_mb();
        }
        SubLObject bindings_with_emtpy_supports = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)multibindings.NIL;
        binding = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            bindings_with_emtpy_supports = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(binding, (SubLObject)multibindings.NIL), bindings_with_emtpy_supports);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return convert_binding_lists_and_supports_to_mbinds(bindings_with_emtpy_supports, mbind, (SubLObject)multibindings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 26398L)
    public static SubLObject convert_binding_to_mbind(final SubLObject binding, final SubLObject mbind) {
        SubLObject result = (SubLObject)multibindings.NIL;
        final SubLObject ls = convert_binding_lists_and_supports_to_mbinds((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(binding, (SubLObject)multibindings.NIL)), mbind, (SubLObject)multibindings.UNPROVIDED);
        if (multibindings.NIL != list_utilities.singletonP(ls)) {
            result = ls.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 26652L)
    public static SubLObject collate_multibindings_totally(SubLObject mbindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject not_doneP = (SubLObject)multibindings.T;
        SubLObject cur_mbindings = (SubLObject)multibindings.NIL;
        cur_mbindings = mbindings;
        while (multibindings.NIL != not_doneP) {
            thread.resetMultipleValues();
            final SubLObject cur_mbindings_$5 = collate_mb_list(cur_mbindings);
            final SubLObject not_doneP_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cur_mbindings = cur_mbindings_$5;
            not_doneP = not_doneP_$6;
            cur_mbindings = cur_mbindings;
        }
        mbindings = cur_mbindings;
        return mbindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 27228L)
    public static SubLObject only_variable_different(final SubLObject mbinding1, final SubLObject mbinding2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject any_differentP = (SubLObject)multibindings.NIL;
        SubLObject many_differentP = (SubLObject)multibindings.NIL;
        SubLObject different_var = (SubLObject)multibindings.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbinding1))); multibindings.NIL == many_differentP && multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject cur_values = Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), entry);
            if (!cur_values.equal(mb_var_values(cur_var, mbinding2))) {
                if (multibindings.NIL != any_differentP) {
                    many_differentP = (SubLObject)multibindings.T;
                }
                else {
                    any_differentP = (SubLObject)multibindings.T;
                    different_var = cur_var;
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (multibindings.NIL == many_differentP) {
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbinding1))); multibindings.NIL == many_differentP && multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject entry = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject cur_values = Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), entry);
                if (!cur_values.equal(mb_var_values(cur_var, mbinding2))) {
                    if (multibindings.NIL != any_differentP) {
                        many_differentP = (SubLObject)multibindings.T;
                    }
                    else {
                        any_differentP = (SubLObject)multibindings.T;
                        different_var = cur_var;
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return (SubLObject)((multibindings.NIL == many_differentP) ? ((multibindings.NIL != any_differentP) ? different_var : multibindings.NIL) : multibindings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 27964L)
    public static SubLObject mb_entry_L(final SubLObject x, final SubLObject y) {
        return terms_in_multibinding_orderP(x.first(), y.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 28058L)
    public static SubLObject mb_merge_entry_values(final SubLObject values1, final SubLObject values2) {
        return mb_merge_entry_values_int(values1, values2, (SubLObject)multibindings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 28288L)
    public static SubLObject mb_merge_entry_values_int(final SubLObject values1, final SubLObject values2, final SubLObject merged_values) {
        SubLObject new1 = (SubLObject)multibindings.NIL;
        SubLObject new2 = (SubLObject)multibindings.NIL;
        SubLObject new_merge = (SubLObject)multibindings.NIL;
        if (multibindings.NIL == values1 && multibindings.NIL == values2) {
            return Sequences.nreverse(merged_values);
        }
        if (multibindings.NIL == values1) {
            new2 = values2.rest();
            new_merge = (SubLObject)ConsesLow.cons(values2.first(), merged_values);
        }
        else if (multibindings.NIL == values2) {
            new1 = values1.rest();
            new_merge = (SubLObject)ConsesLow.cons(values1.first(), merged_values);
        }
        else {
            final SubLObject val1 = values1.first();
            final SubLObject val2 = values2.first();
            if (multibindings.NIL != mb_entry_L(val1, val2)) {
                new1 = values1.rest();
                new2 = values2;
                new_merge = (SubLObject)ConsesLow.cons(val1, merged_values);
            }
            else {
                new2 = values2.rest();
                new1 = values1;
                new_merge = (SubLObject)ConsesLow.cons(val2, merged_values);
            }
        }
        return mb_merge_entry_values_int(new1, new2, new_merge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 29145L)
    public static SubLObject collate_mb_list(final SubLObject mbinds) {
        SubLObject next_mbinds = Sequences.subseq(mbinds, (SubLObject)multibindings.ZERO_INTEGER, (SubLObject)multibindings.ONE_INTEGER);
        SubLObject made_a_changeP = (SubLObject)multibindings.NIL;
        SubLObject doneP = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = mbinds.rest();
        SubLObject cur_mbind = (SubLObject)multibindings.NIL;
        cur_mbind = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            doneP = (SubLObject)multibindings.NIL;
            if (multibindings.NIL == doneP) {
                SubLObject csome_list_var = next_mbinds;
                SubLObject cur_next_mbind = (SubLObject)multibindings.NIL;
                cur_next_mbind = csome_list_var.first();
                while (multibindings.NIL == doneP && multibindings.NIL != csome_list_var) {
                    final SubLObject different_var = only_variable_different(cur_next_mbind, cur_mbind);
                    if (multibindings.NIL != different_var) {
                        final SubLObject cur_values = mb_var_entry(different_var, cur_mbind);
                        final SubLObject cur_next_values = mb_var_entry(different_var, cur_next_mbind);
                        final SubLObject new_values = mb_merge_entry_values(cur_values, cur_next_values);
                        made_a_changeP = (SubLObject)multibindings.T;
                        set_mb_var_entry(cur_next_mbind, different_var, new_values);
                        doneP = (SubLObject)multibindings.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    cur_next_mbind = csome_list_var.first();
                }
            }
            if (multibindings.NIL == doneP) {
                next_mbinds = (SubLObject)ConsesLow.cons(cur_mbind, next_mbinds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_mbind = cdolist_list_var.first();
        }
        return Values.values(next_mbinds, made_a_changeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 30023L)
    public static SubLObject mb_equivP(final SubLObject mbind1, final SubLObject mbind2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbind1))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values1 = Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), entry);
            final SubLObject values2 = mb_var_values(var, mbind2);
            if (multibindings.NIL == conses_high.subsetp(values1, values2, Symbols.symbol_function((SubLObject)multibindings.EQUAL), (SubLObject)multibindings.UNPROVIDED)) {
                return (SubLObject)multibindings.NIL;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbind1))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values1 = Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), entry);
            final SubLObject values2 = mb_var_values(var, mbind2);
            if (multibindings.NIL == conses_high.subsetp(values1, values2, Symbols.symbol_function((SubLObject)multibindings.EQUAL), (SubLObject)multibindings.UNPROVIDED)) {
                return (SubLObject)multibindings.NIL;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)multibindings.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 30334L)
    public static SubLObject variable_extent_in_multibinding(final SubLObject var, final SubLObject mbinding) {
        SubLObject domain = (SubLObject)multibindings.NIL;
        SubLObject cdolist_list_var = mb_var_values(var, mbinding);
        SubLObject val = (SubLObject)multibindings.NIL;
        val = cdolist_list_var.first();
        while (multibindings.NIL != cdolist_list_var) {
            if (multibindings.NIL != cycl_variables.el_varP(val)) {
                domain = ConsesLow.append(variable_extent_in_multibinding(val, mbinding), domain);
            }
            else if (val.isAtom()) {
                domain = (SubLObject)ConsesLow.cons(val, domain);
            }
            else if (val.isCons()) {
                domain = (SubLObject)ConsesLow.cons(val, domain);
            }
            cdolist_list_var = cdolist_list_var.rest();
            val = cdolist_list_var.first();
        }
        return domain;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 30821L)
    public static SubLObject apply_mb(final SubLObject exp, final SubLObject mbinding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (multibindings.NIL == mbinding) {
            return (SubLObject)ConsesLow.list(exp);
        }
        SubLObject answers = (SubLObject)ConsesLow.list(exp);
        SubLObject new_answers = (SubLObject)multibindings.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbinding))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), entry);
            SubLObject cdolist_list_var = answers;
            SubLObject cur_exp = (SubLObject)multibindings.NIL;
            cur_exp = cdolist_list_var.first();
            while (multibindings.NIL != cdolist_list_var) {
                if (multibindings.NIL != subl_promotions.memberP(var, el_utilities.sentence_free_variables(cur_exp, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED), (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$7 = values;
                    SubLObject val = (SubLObject)multibindings.NIL;
                    val = cdolist_list_var_$7.first();
                    while (multibindings.NIL != cdolist_list_var_$7) {
                        new_answers = ConsesLow.append(new_answers, (SubLObject)ConsesLow.list(conses_high.subst(val, var, cur_exp, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED)));
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        val = cdolist_list_var_$7.first();
                    }
                }
                else {
                    new_answers = ConsesLow.append(new_answers, (SubLObject)ConsesLow.list(cur_exp));
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_exp = cdolist_list_var.first();
            }
            answers = new_answers;
            new_answers = (SubLObject)multibindings.NIL;
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbinding))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(Symbols.symbol_function((SubLObject)multibindings.$sym42$FIRST), entry);
            SubLObject cdolist_list_var = answers;
            SubLObject cur_exp = (SubLObject)multibindings.NIL;
            cur_exp = cdolist_list_var.first();
            while (multibindings.NIL != cdolist_list_var) {
                if (multibindings.NIL != subl_promotions.memberP(var, el_utilities.sentence_free_variables(cur_exp, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED), (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$8 = values;
                    SubLObject val = (SubLObject)multibindings.NIL;
                    val = cdolist_list_var_$8.first();
                    while (multibindings.NIL != cdolist_list_var_$8) {
                        new_answers = ConsesLow.append(new_answers, (SubLObject)ConsesLow.list(conses_high.subst(val, var, cur_exp, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED)));
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        val = cdolist_list_var_$8.first();
                    }
                }
                else {
                    new_answers = ConsesLow.append(new_answers, (SubLObject)ConsesLow.list(cur_exp));
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_exp = cdolist_list_var.first();
            }
            answers = new_answers;
            new_answers = (SubLObject)multibindings.NIL;
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 31511L)
    public static SubLObject mb_make_entry_with_null_supports(final SubLObject values) {
        return Sequences.nreverse(list_utilities.make_pair_list(values, (SubLObject)ConsesLow.make_list(Sequences.length(values), (SubLObject)multibindings.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 31645L)
    public static SubLObject propagate_variable_extent_in_multibinding(final SubLObject var, final SubLObject extent, SubLObject mbinding) {
        if (multibindings.NIL != mb_var_entry(var, mbinding)) {
            set_mb_var_entry(mbinding, var, mb_make_entry_with_null_supports(extent));
        }
        else {
            final SubLObject vals = mb_var_entry(var, mbinding);
            SubLObject new_vals = (SubLObject)multibindings.NIL;
            SubLObject cdolist_list_var = vals;
            SubLObject val = (SubLObject)multibindings.NIL;
            val = cdolist_list_var.first();
            while (multibindings.NIL != cdolist_list_var) {
                if (multibindings.NIL != cycl_variables.el_varP(val.first())) {
                    new_vals = (SubLObject)ConsesLow.cons(val, new_vals);
                    mbinding = propagate_variable_extent_in_multibinding(val.first(), extent, mbinding);
                }
                else if (multibindings.NIL != conses_high.member(val.first(), extent, Symbols.symbol_function((SubLObject)multibindings.EQUAL), (SubLObject)multibindings.UNPROVIDED)) {
                    new_vals = (SubLObject)ConsesLow.cons(val, new_vals);
                }
                cdolist_list_var = cdolist_list_var.rest();
                val = cdolist_list_var.first();
            }
            set_mb_var_entry(mbinding, var, new_vals);
        }
        return mbinding;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 32335L)
    public static SubLObject mb_inverse(SubLObject mbind1, final SubLObject mbind2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (multibindings.NIL != mb_equivP(mbind1, mbind2)) {
            return multibinding_fail_token();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbind1))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject extent1 = variable_extent_in_multibinding(cur_var, mbind1);
            final SubLObject extent2 = variable_extent_in_multibinding(cur_var, mbind2);
            final SubLObject extent_diff = conses_high.set_difference(extent1, extent2, Symbols.symbol_function((SubLObject)multibindings.EQUAL), (SubLObject)multibindings.UNPROVIDED);
            if (multibindings.NIL == extent_diff) {
                return multibinding_fail_token();
            }
            mbind1 = propagate_variable_extent_in_multibinding(cur_var, extent_diff, mbind1);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbind1))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject extent1 = variable_extent_in_multibinding(cur_var, mbind1);
            final SubLObject extent2 = variable_extent_in_multibinding(cur_var, mbind2);
            final SubLObject extent_diff = conses_high.set_difference(extent1, extent2, Symbols.symbol_function((SubLObject)multibindings.EQUAL), (SubLObject)multibindings.UNPROVIDED);
            if (multibindings.NIL == extent_diff) {
                return multibinding_fail_token();
            }
            mbind1 = propagate_variable_extent_in_multibinding(cur_var, extent_diff, mbind1);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return mbind1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/multibindings.lisp", position = 33095L)
    public static SubLObject multibinding_inverse_list(SubLObject genl_mbind, final SubLObject mbind_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(genl_mbind))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject extent_diff;
            final SubLObject cur_genl_extent = extent_diff = variable_extent_in_multibinding(cur_var, genl_mbind);
            SubLObject cdolist_list_var = mbind_list;
            SubLObject cur_mbind = (SubLObject)multibindings.NIL;
            cur_mbind = cdolist_list_var.first();
            while (multibindings.NIL != cdolist_list_var) {
                final SubLObject cur_spec_extent = variable_extent_in_multibinding(cur_var, cur_mbind);
                extent_diff = conses_high.set_difference(extent_diff, cur_spec_extent, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cur_mbind = cdolist_list_var.first();
            }
            if (multibindings.NIL == extent_diff) {
                return multibindings.$multibinding_fail$.getGlobalValue();
            }
            genl_mbind = propagate_variable_extent_in_multibinding(cur_var, extent_diff, genl_mbind);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(genl_mbind))); multibindings.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject extent_diff;
            final SubLObject cur_genl_extent = extent_diff = variable_extent_in_multibinding(cur_var, genl_mbind);
            SubLObject cdolist_list_var = mbind_list;
            SubLObject cur_mbind = (SubLObject)multibindings.NIL;
            cur_mbind = cdolist_list_var.first();
            while (multibindings.NIL != cdolist_list_var) {
                final SubLObject cur_spec_extent = variable_extent_in_multibinding(cur_var, cur_mbind);
                extent_diff = conses_high.set_difference(extent_diff, cur_spec_extent, (SubLObject)multibindings.UNPROVIDED, (SubLObject)multibindings.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cur_mbind = cdolist_list_var.first();
            }
            if (multibindings.NIL == extent_diff) {
                return multibindings.$multibinding_fail$.getGlobalValue();
            }
            genl_mbind = propagate_variable_extent_in_multibinding(cur_var, extent_diff, genl_mbind);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return genl_mbind;
    }
    
    public static SubLObject declare_multibindings_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "multibinding_fail_token", "MULTIBINDING-FAIL-TOKEN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "multibinding_failedP", "MULTIBINDING-FAILED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "empty_multibindingP", "EMPTY-MULTIBINDING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "make_multibinding", "MAKE-MULTIBINDING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "copy_multibinding", "COPY-MULTIBINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "terms_in_multibinding_orderP", "TERMS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "sort_terms_into_multibinding_order", "SORT-TERMS-INTO-MULTIBINDING-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "formulas_in_multibinding_orderP", "FORMULAS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "multibinding_constant_L", "MULTIBINDING-CONSTANT-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "atoms_in_multibinding_orderP", "ATOMS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "compose_multibindings", "COMPOSE-MULTIBINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "multibinding_p", "MULTIBINDING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "simple_multibinding_listP", "SIMPLE-MULTIBINDING-LIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "unit_multibinding_pairP", "UNIT-MULTIBINDING-PAIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "empty_multibinding_pairP", "EMPTY-MULTIBINDING-PAIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "degenerate_multibindingP", "DEGENERATE-MULTIBINDING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "atomic_unit_multibinding_pairP", "ATOMIC-UNIT-MULTIBINDING-PAIR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "convert_unit_to_normal_binding", "CONVERT-UNIT-TO-NORMAL-BINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "assoc_multibinding", "ASSOC-MULTIBINDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "get_multibinding_values", "GET-MULTIBINDING-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "atomic_binding_in_multibindingP", "ATOMIC-BINDING-IN-MULTIBINDING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "replace_or_create_in_multibinding", "REPLACE-OR-CREATE-IN-MULTIBINDING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "variable_in_multibindingP", "VARIABLE-IN-MULTIBINDING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "free_variable_in_multibindingP", "FREE-VARIABLE-IN-MULTIBINDING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "apply_multibinding", "APPLY-MULTIBINDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "propagate_atomic_multibinding", "PROPAGATE-ATOMIC-MULTIBINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "singleton_variable_extentP", "SINGLETON-VARIABLE-EXTENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "collate_multibinding_list", "COLLATE-MULTIBINDING-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "simple_multibinding", "SIMPLE-MULTIBINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mbind_simple_binding_list", "MBIND-SIMPLE-BINDING-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "print_multibinding", "PRINT-MULTIBINDING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "multibinding_string", "MULTIBINDING-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mbinding_print_function_trampoline", "MBINDING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mbinding_p", "MBINDING-P", 1, 0, false);
        new $mbinding_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_multi_var_term_map", "MB-MULTI-VAR-TERM-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_simple_var_term_map", "MB-SIMPLE-VAR-TERM-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_degenerateP", "MB-DEGENERATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "_csetf_mb_multi_var_term_map", "_CSETF-MB-MULTI-VAR-TERM-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "_csetf_mb_simple_var_term_map", "_CSETF-MB-SIMPLE-VAR-TERM-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "_csetf_mb_degenerateP", "_CSETF-MB-DEGENERATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "make_mbinding", "MAKE-MBINDING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "visit_defstruct_mbinding", "VISIT-DEFSTRUCT-MBINDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "visit_defstruct_object_mbinding_method", "VISIT-DEFSTRUCT-OBJECT-MBINDING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "print_mb", "PRINT-MB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "create_mb", "CREATE-MB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "empty_mb", "EMPTY-MB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "copy_mb", "COPY-MB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_multi_variables", "MB-MULTI-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_simple_variables", "MB-SIMPLE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_variables", "MB-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_multi_var_entry", "MB-MULTI-VAR-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_multi_var_values", "MB-MULTI-VAR-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_simple_var_entry", "MB-SIMPLE-VAR-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_simple_var_values", "MB-SIMPLE-VAR-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_var_values", "MB-VAR-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_var_entry", "MB-VAR-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_var_supports", "MB-VAR-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_supports", "MB-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "set_mb_var_entry", "SET-MB-VAR-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_var_push", "MB-VAR-PUSH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_multi_variableP", "MB-MULTI-VARIABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_simple_variableP", "MB-SIMPLE-VARIABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_variableP", "MB-VARIABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_promote_var_to_simple", "MB-PROMOTE-VAR-TO-SIMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_promote_var_to_multi", "MB-PROMOTE-VAR-TO-MULTI", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.multibindings", "do_mbind", "DO-MBIND");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.multibindings", "do_mbind_var_extents", "DO-MBIND-VAR-EXTENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_simple_binding", "MB-SIMPLE-BINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_string", "MB-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_add_bindings", "MB-ADD-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_add_supports_to_value", "MB-ADD-SUPPORTS-TO-VALUE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_add_bindings_and_supports", "MB-ADD-BINDINGS-AND-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_add_blist_and_supports_entry", "MB-ADD-BLIST-AND-SUPPORTS-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "make_mbinds_from_binding_lists", "MAKE-MBINDS-FROM-BINDING-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "gather_bound_vars_in_blists_and_supports", "GATHER-BOUND-VARS-IN-BLISTS-AND-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_reifiable_natP", "MB-REIFIABLE-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_find_nart_or_naut", "MB-FIND-NART-OR-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "multibinding_reify_nat_values", "MULTIBINDING-REIFY-NAT-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_collapse_multiple_proof_bindings", "MB-COLLAPSE-MULTIPLE-PROOF-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "convert_binding_lists_and_supports_to_mbinds", "CONVERT-BINDING-LISTS-AND-SUPPORTS-TO-MBINDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "convert_binding_lists_to_mbinds", "CONVERT-BINDING-LISTS-TO-MBINDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "convert_binding_to_mbind", "CONVERT-BINDING-TO-MBIND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "collate_multibindings_totally", "COLLATE-MULTIBINDINGS-TOTALLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "only_variable_different", "ONLY-VARIABLE-DIFFERENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_entry_L", "MB-ENTRY-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_merge_entry_values", "MB-MERGE-ENTRY-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_merge_entry_values_int", "MB-MERGE-ENTRY-VALUES-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "collate_mb_list", "COLLATE-MB-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_equivP", "MB-EQUIV?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "variable_extent_in_multibinding", "VARIABLE-EXTENT-IN-MULTIBINDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "apply_mb", "APPLY-MB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_make_entry_with_null_supports", "MB-MAKE-ENTRY-WITH-NULL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "propagate_variable_extent_in_multibinding", "PROPAGATE-VARIABLE-EXTENT-IN-MULTIBINDING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "mb_inverse", "MB-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.multibindings", "multibinding_inverse_list", "MULTIBINDING-INVERSE-LIST", 2, 0, false);
        return (SubLObject)multibindings.NIL;
    }
    
    public static SubLObject init_multibindings_file() {
        multibindings.$multibinding_fail$ = SubLFiles.deflexical("*MULTIBINDING-FAIL*", (SubLObject)multibindings.$kw0$FAIL);
        multibindings.$mb_reify_natsP$ = SubLFiles.defparameter("*MB-REIFY-NATS?*", (SubLObject)multibindings.T);
        multibindings.$dtp_mbinding$ = SubLFiles.defconstant("*DTP-MBINDING*", (SubLObject)multibindings.$sym13$MBINDING);
        return (SubLObject)multibindings.NIL;
    }
    
    public static SubLObject setup_multibindings_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), multibindings.$dtp_mbinding$.getGlobalValue(), Symbols.symbol_function((SubLObject)multibindings.$sym20$MBINDING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)multibindings.$list21);
        Structures.def_csetf((SubLObject)multibindings.$sym22$MB_MULTI_VAR_TERM_MAP, (SubLObject)multibindings.$sym23$_CSETF_MB_MULTI_VAR_TERM_MAP);
        Structures.def_csetf((SubLObject)multibindings.$sym24$MB_SIMPLE_VAR_TERM_MAP, (SubLObject)multibindings.$sym25$_CSETF_MB_SIMPLE_VAR_TERM_MAP);
        Structures.def_csetf((SubLObject)multibindings.$sym26$MB_DEGENERATE_, (SubLObject)multibindings.$sym27$_CSETF_MB_DEGENERATE_);
        Equality.identity((SubLObject)multibindings.$sym13$MBINDING);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), multibindings.$dtp_mbinding$.getGlobalValue(), Symbols.symbol_function((SubLObject)multibindings.$sym36$VISIT_DEFSTRUCT_OBJECT_MBINDING_METHOD));
        return (SubLObject)multibindings.NIL;
    }
    
    public void declareFunctions() {
        declare_multibindings_file();
    }
    
    public void initializeVariables() {
        init_multibindings_file();
    }
    
    public void runTopLevelForms() {
        setup_multibindings_file();
    }
    
    static {
        me = (SubLFile)new multibindings();
        multibindings.$multibinding_fail$ = null;
        multibindings.$mb_reify_natsP$ = null;
        multibindings.$dtp_mbinding$ = null;
        $kw0$FAIL = SubLObjectFactory.makeKeyword("FAIL");
        $sym1$TERMS_IN_MULTIBINDING_ORDER_ = SubLObjectFactory.makeSymbol("TERMS-IN-MULTIBINDING-ORDER?");
        $sym2$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym3$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $str4$warning__trying_to_sort_the_varia = SubLObjectFactory.makeString("warning: trying to sort the variables ~A and ~A~%");
        $str5$warning__trying_to_string_sort_th = SubLObjectFactory.makeString("warning: trying to string-sort the atoms ~A and ~A~%");
        $sym6$EMPTY_MULTIBINDING_PAIR_ = SubLObjectFactory.makeSymbol("EMPTY-MULTIBINDING-PAIR?");
        $str7$convert_unit_to_normal_binding___ = SubLObjectFactory.makeString("convert-unit-to-normal-binding: ~s is not a unit-multibinding-pair?");
        $sym8$MULTIBINDING_P = SubLObjectFactory.makeSymbol("MULTIBINDING-P");
        $str9$MBIND_SIMPLE_BINDING_LIST___s_is_ = SubLObjectFactory.makeString("MBIND-SIMPLE-BINDING-LIST: ~s is not a multibinding-p.");
        $str10$MULTIBINDING_ = SubLObjectFactory.makeString("MULTIBINDING:");
        $str11$_s____ = SubLObjectFactory.makeString("~s -->");
        $str12$__s = SubLObjectFactory.makeString(" ~s");
        $sym13$MBINDING = SubLObjectFactory.makeSymbol("MBINDING");
        $sym14$MBINDING_P = SubLObjectFactory.makeSymbol("MBINDING-P");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTI-VAR-TERM-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-VAR-TERM-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE?"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTI-VAR-TERM-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-VAR-TERM-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("DEGENERATE?"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MB-MULTI-VAR-TERM-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("MB-SIMPLE-VAR-TERM-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("MB-DEGENERATE?"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MB-MULTI-VAR-TERM-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MB-SIMPLE-VAR-TERM-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MB-DEGENERATE?"));
        $sym19$PRINT_MB = SubLObjectFactory.makeSymbol("PRINT-MB");
        $sym20$MBINDING_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("MBINDING-PRINT-FUNCTION-TRAMPOLINE");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING-P"));
        $sym22$MB_MULTI_VAR_TERM_MAP = SubLObjectFactory.makeSymbol("MB-MULTI-VAR-TERM-MAP");
        $sym23$_CSETF_MB_MULTI_VAR_TERM_MAP = SubLObjectFactory.makeSymbol("_CSETF-MB-MULTI-VAR-TERM-MAP");
        $sym24$MB_SIMPLE_VAR_TERM_MAP = SubLObjectFactory.makeSymbol("MB-SIMPLE-VAR-TERM-MAP");
        $sym25$_CSETF_MB_SIMPLE_VAR_TERM_MAP = SubLObjectFactory.makeSymbol("_CSETF-MB-SIMPLE-VAR-TERM-MAP");
        $sym26$MB_DEGENERATE_ = SubLObjectFactory.makeSymbol("MB-DEGENERATE?");
        $sym27$_CSETF_MB_DEGENERATE_ = SubLObjectFactory.makeSymbol("_CSETF-MB-DEGENERATE?");
        $kw28$MULTI_VAR_TERM_MAP = SubLObjectFactory.makeKeyword("MULTI-VAR-TERM-MAP");
        $kw29$SIMPLE_VAR_TERM_MAP = SubLObjectFactory.makeKeyword("SIMPLE-VAR-TERM-MAP");
        $kw30$DEGENERATE_ = SubLObjectFactory.makeKeyword("DEGENERATE?");
        $str31$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw32$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym33$MAKE_MBINDING = SubLObjectFactory.makeSymbol("MAKE-MBINDING");
        $kw34$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw35$END = SubLObjectFactory.makeKeyword("END");
        $sym36$VISIT_DEFSTRUCT_OBJECT_MBINDING_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-MBINDING-METHOD");
        $str37$__MB_ = SubLObjectFactory.makeString("#<MB:");
        $str38$_a_ = SubLObjectFactory.makeString("~a:");
        $str39$_a = SubLObjectFactory.makeString("~a");
        $str40$_ = SubLObjectFactory.makeString(">");
        $str41$empty_ = SubLObjectFactory.makeString("empty>");
        $sym42$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym43$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym44$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("MB"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $sym47$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym48$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $sym49$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym50$MAPCAR = SubLObjectFactory.makeSymbol("MAPCAR");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"));
        $sym52$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("EXTENT"), (SubLObject)SubLObjectFactory.makeSymbol("MB"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym54$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $sym55$VARIABLE_EXTENT_IN_MULTIBINDING = SubLObjectFactory.makeSymbol("VARIABLE-EXTENT-IN-MULTIBINDING");
        $sym56$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $str57$ = SubLObjectFactory.makeString("");
        $str58$___s____ = SubLObjectFactory.makeString("~%~s -->");
        $sym59$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-SUPPORTS"));
        $sym61$MB_ADD_BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeSymbol("MB-ADD-BINDINGS-AND-SUPPORTS");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym63$BINDING_LIST_P = SubLObjectFactory.makeSymbol("BINDING-LIST-P");
        $list64 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS-LIST"));
        $sym65$MULTIBINDING_REIFY_NAT_VALUES = SubLObjectFactory.makeSymbol("MULTIBINDING-REIFY-NAT-VALUES");
    }
    
    public static final class $mbinding_native extends SubLStructNative
    {
        public SubLObject $multi_var_term_map;
        public SubLObject $simple_var_term_map;
        public SubLObject $degenerateP;
        private static final SubLStructDeclNative structDecl;
        
        public $mbinding_native() {
            this.$multi_var_term_map = (SubLObject)CommonSymbols.NIL;
            this.$simple_var_term_map = (SubLObject)CommonSymbols.NIL;
            this.$degenerateP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$mbinding_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$multi_var_term_map;
        }
        
        public SubLObject getField3() {
            return this.$simple_var_term_map;
        }
        
        public SubLObject getField4() {
            return this.$degenerateP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$multi_var_term_map = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$simple_var_term_map = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$degenerateP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$mbinding_native.class, multibindings.$sym13$MBINDING, multibindings.$sym14$MBINDING_P, multibindings.$list15, multibindings.$list16, new String[] { "$multi_var_term_map", "$simple_var_term_map", "$degenerateP" }, multibindings.$list17, multibindings.$list18, multibindings.$sym19$PRINT_MB);
        }
    }
    
    public static final class $mbinding_p$UnaryFunction extends UnaryFunction
    {
        public $mbinding_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MBINDING-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return multibindings.mbinding_p(arg1);
        }
    }
}

/*

	Total time: 894 ms
	
*/