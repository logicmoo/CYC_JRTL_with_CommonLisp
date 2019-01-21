package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycl_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cycl_utilities";
    public static final String myFingerPrint = "8d445da95a6da93715bb3f7935626c76028bccf3c9d57b148f4d4f1eb2c876dd";
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 1552L)
    public static SubLSymbol $opaque_arg_function$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 1730L)
    public static SubLSymbol $opaque_seqvar_function$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 16516L)
    private static SubLSymbol $expression_count_item$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 16572L)
    private static SubLSymbol $expression_count_test$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 29951L)
    private static SubLSymbol $containing_subexpressions_lambda_term$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 40975L)
    private static SubLSymbol $default_transformation_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 69758L)
    private static SubLSymbol $permute_list_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 78604L)
    private static SubLSymbol $renamed_default_el_var_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 79454L)
    private static SubLSymbol $non_indexed_constants$;
    private static final SubLSymbol $sym0$DEFAULT_OPAQUE_ARG_;
    private static final SubLSymbol $sym1$DEFAULT_OPAQUE_SEQVAR_;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLSymbol $sym4$_OPAQUE_ARG_FUNCTION_;
    private static final SubLSymbol $sym5$_OPAQUE_SEQVAR_FUNCTION_;
    private static final SubLSymbol $sym6$OPAQUE_ARG_WRT_EL_TEMPLATE_;
    private static final SubLObject $const7$SkolemFunctionFn;
    private static final SubLObject $const8$trueSentence;
    private static final SubLSymbol $sym9$HL_TERM_WITH_EL_COUNTERPART_P;
    private static final SubLSymbol $kw10$TRANSFORMATION_LIMIT_EXCEEDED;
    private static final SubLSymbol $sym11$HL_TERM_TO_EL_TERM;
    private static final SubLString $str12$Recursion_limit_reached___el_to_h;
    private static final SubLSymbol $sym13$CAREFUL_HL_TERM_TO_EL_TERM;
    private static final SubLSymbol $kw14$NART;
    private static final SubLSymbol $kw15$ASSERTION;
    private static final SubLSymbol $sym16$RF_P;
    private static final SubLSymbol $kw17$REGULARIZE;
    private static final SubLSymbol $sym18$ASSERTION_P;
    private static final SubLSymbol $sym19$EXPRESSION_COUNT_HELPER;
    private static final SubLSymbol $sym20$EL_FORMULA_P;
    private static final SubLSymbol $sym21$FORT_P;
    private static final SubLSymbol $sym22$CONSTANT_P;
    private static final SubLSymbol $sym23$NART_P;
    private static final SubLSymbol $kw24$IGNORE;
    private static final SubLString $str25$_S_is_not_well_formed_;
    private static final SubLSymbol $sym26$CONTAINING_SUBEXPRESSIONS_LAMBDA_FN;
    private static final SubLSymbol $sym27$KEYWORDP;
    private static final SubLSymbol $sym28$EXPRESSION_FIND_IF;
    private static final SubLSymbol $sym29$LISTP;
    private static final SubLInteger $int30$212;
    private static final SubLObject $const31$Quote;
    private static final SubLObject $const32$ExpandSubLFn;
    private static final SubLSymbol $sym33$EXPRESSION_SUBST;
    private static final SubLSymbol $sym34$FORMULA_SUBST;
    private static final SubLSymbol $sym35$CYC_VAR_;
    private static final SubLSymbol $sym36$EL_VAR_;
    private static final SubLSymbol $sym37$PERMUTE_LIST_CACHED;
    private static final SubLSymbol $sym38$_PERMUTE_LIST_CACHED_CACHING_STATE_;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$DEFAULT_EL_VAR_;
    private static final SubLSymbol $sym43$RENAMED_DEFAULT_EL_VAR_P;
    private static final SubLString $str44$_RENAMED_VAR;
    private static final SubLSymbol $sym45$KBEQ;
    private static final SubLSymbol $sym46$NART_EL_FORMULA;
    private static final SubLObject $const47$CollectionIntersectionFn;
    private static final SubLObject $const48$CollectionIntersection2Fn;
    private static final SubLObject $const49$CollectionUnionFn;
    private static final SubLObject $const50$TheSet;
    private static final SubLSymbol $sym51$COLLECTION_INTERSECTION_NAT_;
    private static final SubLSymbol $sym52$COLLECTION_UNION_NAT_;
    private static final SubLInteger $int53$5000;
    private static final SubLSymbol $sym54$_EXIT;
    private static final SubLString $str55$;
    private static final SubLString $str56$__;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$CONSTANT_EXTERNAL_ID__;
    private static final SubLSymbol $sym59$CONSTANT_EXTERNAL_ID;
    private static final SubLSymbol $sym60$GUID_;
    private static final SubLSymbol $sym61$CONSTANT_INTERNAL_ID;
    private static final SubLSymbol $sym62$_;
    private static final SubLSymbol $sym63$NART_ID;
    private static final SubLSymbol $sym64$FORT_INTERNAL_ID;
    private static final SubLSymbol $sym65$VALID_SOMEWHERE_CACHE_ITEM_;
    private static final SubLObject $const66$functionalInArgs;
    private static final SubLObject $const67$strictlyFunctionalInArgs;
    private static final SubLSymbol $sym68$FUNCTIONAL_IN_ARG_POSITIONS;
    private static final SubLSymbol $sym69$INDEXED_TERM_P;
    private static final SubLInteger $int70$100;
    private static final SubLSymbol $sym71$STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS;
    private static final SubLSymbol $sym72$OPAQUE_ARG_WRT_NAT_REIFICATION_;
    private static final SubLSymbol $sym73$NART_LOOKUP;
    private static final SubLSymbol $sym74$NULL;
    private static final SubLSymbol $sym75$EL_FIND_IF_NART;
    private static final SubLSymbol $sym76$VARIABLE_P;
    private static final SubLObject $const77$False;
    private static final SubLObject $const78$not;
    private static final SubLSymbol $sym79$NEGATED_;
    private static final SubLList $list80;
    private static final SubLString $str81$Return_T_iff_OBJECT_is_a_negated_;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$POSSIBLY_SENTENCE_OR_VARIABLE_P;
    private static final SubLSymbol $sym84$NEGATE;
    private static final SubLList $list85;
    private static final SubLString $str86$Assuming_FORM_is_a_valid_CycL_for;
    private static final SubLList $list87;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$TRUTH_P;
    private static final SubLSymbol $kw90$TRUE;
    private static final SubLSymbol $sym91$NON_NEGATIVE_INTEGER_P;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$FORMULA_OPERATOR;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$CYCL_SENTENCE_P;
    private static final SubLSymbol $kw96$INCLUDE;
    private static final SubLString $str97$formula_terms_int_got_a_non_el_va;
    private static final SubLSymbol $sym98$POSSIBLY_NAUT_P;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLList $list104;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$FIXNUMP;
    private static final SubLObject $const107$FormulaArgPositionFn;
    private static final SubLSymbol $sym108$ARG_POSITION_P;
    private static final SubLSymbol $sym109$CYCL_ARG_POSITION_P;
    private static final SubLSymbol $sym110$NON_DOTTED_LIST_P;
    private static final SubLString $str111$CycL_Utilities_Module_Supercatego;
    private static final SubLString $str112$CycL_Utilities_Subcategory;
    private static final SubLString $str113$CycL_Utilities_Testing_Suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 1865L)
    public static SubLObject with_opaque_arg_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject func = (SubLObject)cycl_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycl_utilities.$list2);
        func = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cycl_utilities.$sym4$_OPAQUE_ARG_FUNCTION_, func)), ConsesLow.append(body, (SubLObject)cycl_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 2150L)
    public static SubLObject with_opaque_seqvar_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject func = (SubLObject)cycl_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycl_utilities.$list2);
        func = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)cycl_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cycl_utilities.$sym5$_OPAQUE_SEQVAR_FUNCTION_, func)), ConsesLow.append(body, (SubLObject)cycl_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 2441L)
    public static SubLObject maybe_some_opaque_argP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.$opaque_arg_function$.getDynamicValue(thread) != cycl_utilities.$sym0$DEFAULT_OPAQUE_ARG_ || cycl_utilities.NIL != el_utilities.subl_escape_p(expression) || cycl_utilities.NIL != el_utilities.formula_with_sequence_termP(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 2809L)
    public static SubLObject opaque_argP(final SubLObject formula, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return opaque_argP_int(formula, argnum, cycl_utilities.$opaque_arg_function$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 3181L)
    public static SubLObject opaque_argP_int(final SubLObject formula, final SubLObject argnum, final SubLObject opaque_arg_function) {
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        if (opaque_arg_function.eql((SubLObject)cycl_utilities.$sym0$DEFAULT_OPAQUE_ARG_)) {
            result = default_opaque_argP(formula, argnum);
        }
        else if (opaque_arg_function.eql((SubLObject)cycl_utilities.$sym6$OPAQUE_ARG_WRT_EL_TEMPLATE_)) {
            result = opaque_arg_wrt_el_templateP(formula, argnum);
        }
        else {
            result = Functions.funcall(opaque_arg_function, formula, argnum);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 3403L)
    public static SubLObject opaque_seqvarP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Functions.funcall(cycl_utilities.$opaque_seqvar_function$.getDynamicValue(thread), formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 3633L)
    public static SubLObject default_opaque_argP(final SubLObject formula, final SubLObject argnum) {
        if (cycl_utilities.NIL != el_utilities.formula_arityL(formula, argnum, (SubLObject)cycl_utilities.UNPROVIDED)) {
            return opaque_seqvarP(formula);
        }
        return el_utilities.subl_escape_p(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 3806L)
    public static SubLObject opaque_arg_wrt_free_varsP(final SubLObject formula, final SubLObject argnum) {
        if (cycl_utilities.TWO_INTEGER.eql(argnum) && cycl_utilities.NIL != el_utilities.el_formula_with_operator_p(formula, cycl_utilities.$const7$SkolemFunctionFn)) {
            return (SubLObject)cycl_utilities.T;
        }
        if (cycl_utilities.NIL != el_utilities.formula_arityL(formula, argnum, (SubLObject)cycl_utilities.UNPROVIDED)) {
            return opaque_seqvarP(formula);
        }
        return el_utilities.subl_quote_p(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 4170L)
    public static SubLObject opaque_arg_wrt_el_templateP(final SubLObject formula, final SubLObject argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != default_opaque_argP(formula, argnum) || cycl_utilities.NIL != czer_utilities.leave_some_terms_at_el_for_argP(formula_arg0(formula), argnum, (SubLObject)cycl_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 4473L)
    public static SubLObject opaque_arg_wrt_quotingP(final SubLObject formula, final SubLObject argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != default_opaque_argP(formula, argnum) || (cycl_utilities.NIL == el_utilities.tou_litP(formula) && (cycl_utilities.NIL != cycl_grammar.fast_quote_term_p(formula_arg(formula, argnum, (SubLObject)cycl_utilities.UNPROVIDED)) || cycl_utilities.NIL != kb_accessors.quoted_argumentP(formula_arg0(formula), argnum))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 4824L)
    public static SubLObject opaque_arg_wrt_quoting_not_counting_logical_opsP(final SubLObject formula, final SubLObject argnum) {
        if (cycl_utilities.NIL != el_utilities.el_formula_with_operator_p(formula, cycl_utilities.$const8$trueSentence) || cycl_utilities.NIL != el_utilities.cyc_const_logical_operator_p(formula_operator(formula)) || cycl_utilities.NIL != el_utilities.cyc_const_quantifier_p(formula_operator(formula))) {
            return (SubLObject)cycl_utilities.NIL;
        }
        return opaque_arg_wrt_quotingP(formula, argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 5427L)
    public static SubLObject opaque_arg_wrt_quoteP(final SubLObject formula, final SubLObject argnum) {
        return cycl_grammar.fast_quote_term_p(formula_arg(formula, argnum, (SubLObject)cycl_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 5630L)
    public static SubLObject opaque_arg_wrt_el_template_or_quoteP(final SubLObject formula, final SubLObject argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != opaque_arg_wrt_el_templateP(formula, argnum) || cycl_utilities.NIL != opaque_arg_wrt_quoteP(formula, argnum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 5804L)
    public static SubLObject opaque_arg_wrt_skolemP(final SubLObject formula, final SubLObject argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != default_opaque_argP(formula, argnum) || cycl_utilities.NIL != el_utilities.tou_asentP(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 6043L)
    public static SubLObject default_opaque_seqvarP(final SubLObject formula) {
        return el_utilities.subl_escape_p(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 6135L)
    public static SubLObject hl_term_with_el_counterpart_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != nart_handles.valid_nart_handleP(v_object) || cycl_utilities.NIL != assertion_handles.valid_assertion_handleP(v_object) || cycl_utilities.NIL != variables.variable_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 6422L)
    public static SubLObject hl_term_to_el_term(final SubLObject hl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.NIL != nart_handles.nart_p(hl_term)) {
            return el_utilities.copy_expression(Functions.funcall(czer_vars.$nart_key$.getDynamicValue(thread), hl_term));
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(hl_term)) {
            return el_utilities.copy_expression(Functions.funcall(czer_vars.$assertion_key$.getDynamicValue(thread), hl_term));
        }
        if (cycl_utilities.NIL != variables.variable_p(hl_term)) {
            return variables.default_el_var_for_hl_var(hl_term);
        }
        return hl_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 6886L)
    public static SubLObject careful_hl_term_to_el_term(final SubLObject hl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.NIL != nart_handles.nart_p(hl_term)) {
            return Functions.funcall(czer_vars.$nart_key$.getDynamicValue(thread), hl_term);
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(hl_term)) {
            return Functions.funcall(czer_vars.$assertion_key$.getDynamicValue(thread), hl_term);
        }
        if (cycl_utilities.NIL != variables.variable_p(hl_term)) {
            return variables.default_el_var_for_hl_var(hl_term);
        }
        return hl_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 7372L)
    public static SubLObject hl_to_el(final SubLObject hl_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.NIL == expression_find_if(Symbols.symbol_function((SubLObject)cycl_utilities.$sym9$HL_TERM_WITH_EL_COUNTERPART_P), hl_expression, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED)) {
            return hl_expression;
        }
        SubLObject error = (SubLObject)cycl_utilities.NIL;
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        try {
            thread.throwStack.push(cycl_utilities.$kw10$TRANSFORMATION_LIMIT_EXCEEDED);
            result = unrename_default_el_vars(expression_transform(rename_default_el_vars(hl_expression), Symbols.symbol_function((SubLObject)cycl_utilities.$sym9$HL_TERM_WITH_EL_COUNTERPART_P), Symbols.symbol_function((SubLObject)cycl_utilities.$sym11$HL_TERM_TO_EL_TERM), (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.UNPROVIDED));
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, (SubLObject)cycl_utilities.$kw10$TRANSFORMATION_LIMIT_EXCEEDED);
        }
        finally {
            thread.throwStack.pop();
        }
        if (cycl_utilities.NIL != error) {
            Errors.warn((SubLObject)cycl_utilities.$str12$Recursion_limit_reached___el_to_h, el_utilities.sefify(hl_expression));
            result = hl_expression;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 8147L)
    public static SubLObject hl_to_el_destructive(final SubLObject hl_expression) {
        if (cycl_utilities.NIL == expression_find_if(Symbols.symbol_function((SubLObject)cycl_utilities.$sym9$HL_TERM_WITH_EL_COUNTERPART_P), hl_expression, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED)) {
            return hl_expression;
        }
        return unrename_default_el_vars_destructive(expression_ntransform(rename_default_el_vars_destructive(hl_expression), Symbols.symbol_function((SubLObject)cycl_utilities.$sym9$HL_TERM_WITH_EL_COUNTERPART_P), Symbols.symbol_function((SubLObject)cycl_utilities.$sym13$CAREFUL_HL_TERM_TO_EL_TERM), (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 8545L)
    public static SubLObject hl_to_el_preserve_el_vars(final SubLObject hl_expression) {
        if (cycl_utilities.NIL == expression_find_if(Symbols.symbol_function((SubLObject)cycl_utilities.$sym9$HL_TERM_WITH_EL_COUNTERPART_P), hl_expression, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED)) {
            return hl_expression;
        }
        return expression_transform(hl_expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym9$HL_TERM_WITH_EL_COUNTERPART_P), Symbols.symbol_function((SubLObject)cycl_utilities.$sym11$HL_TERM_TO_EL_TERM), (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 8887L)
    public static SubLObject binding_lists_hl_to_el(final SubLObject binding_lists) {
        if (cycl_utilities.NIL == list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)cycl_utilities.$sym9$HL_TERM_WITH_EL_COUNTERPART_P), binding_lists, (SubLObject)cycl_utilities.UNPROVIDED)) {
            return binding_lists;
        }
        return el_utilities.expression_to_binding_lists(hl_to_el_preserve_el_vars(el_utilities.binding_lists_to_expression(binding_lists)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 9396L)
    public static SubLObject transform_hl_to_el(final SubLObject form) {
        if (cycl_utilities.NIL != constant_handles.constant_p(form)) {
            return form;
        }
        if (form.isString()) {
            return form;
        }
        if (form.isNumber()) {
            return form;
        }
        if (cycl_utilities.NIL != hl_term_with_el_counterpart_p(form)) {
            return hl_to_el(form);
        }
        if (form.isCons()) {
            return list_utilities.recons(transform_hl_to_el(form.first()), transform_hl_to_el(form.rest()), form);
        }
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 9916L)
    public static SubLObject reified_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != atomic_reified_term_p(v_object) || cycl_utilities.NIL != reified_formula_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 10109L)
    public static SubLObject atomic_reified_term_p(final SubLObject v_object) {
        return constant_handles.constant_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 10185L)
    public static SubLObject reified_formula_p(final SubLObject v_object) {
        return collection_defns.hl_formula_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 10259L)
    public static SubLObject rf_p(final SubLObject v_object) {
        return reified_formula_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 10325L)
    public static SubLObject rf_type(final SubLObject rf) {
        if (cycl_utilities.NIL != nart_handles.nart_p(rf)) {
            return (SubLObject)cycl_utilities.$kw14$NART;
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(rf)) {
            return (SubLObject)cycl_utilities.$kw15$ASSERTION;
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 10447L)
    public static SubLObject rf_raw_id(final SubLObject rf) {
        if (cycl_utilities.NIL != nart_handles.nart_p(rf)) {
            return nart_handles.nart_id(rf);
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(rf)) {
            return assertion_handles.assertion_id(rf);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 10588L)
    public static SubLObject rf_id(final SubLObject rf) {
        return (SubLObject)ConsesLow.cons(rf_type(rf), rf_raw_id(rf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 10659L)
    public static SubLObject find_rf_by_id(final SubLObject rf_id) {
        final SubLObject type = rf_id.first();
        final SubLObject raw_id = rf_id.rest();
        if (raw_id.isInteger()) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql((SubLObject)cycl_utilities.$kw14$NART)) {
                return nart_handles.find_nart_by_id(raw_id);
            }
            if (pcase_var.eql((SubLObject)cycl_utilities.$kw15$ASSERTION)) {
                return assertion_handles.find_assertion_by_id(raw_id);
            }
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 10902L)
    public static SubLObject find_rf(final SubLObject formula) {
        final SubLObject nart = narts_high.find_nart(formula);
        return (cycl_utilities.NIL != nart) ? nart : czer_meta.find_assertion_cycl(formula, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 11045L)
    public static SubLObject robustly_find_rf(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$robust_assertion_lookup$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$robust_nart_lookup$.currentBinding(thread);
        try {
            czer_vars.$robust_assertion_lookup$.bind((SubLObject)cycl_utilities.T, thread);
            czer_vars.$robust_nart_lookup$.bind((SubLObject)cycl_utilities.T, thread);
            final SubLObject nart = czer_utilities.el_find_nart(formula);
            result = ((cycl_utilities.NIL != nart) ? nart : czer_meta.find_assertion_cycl(formula, (SubLObject)cycl_utilities.UNPROVIDED));
        }
        finally {
            czer_vars.$robust_nart_lookup$.rebind(_prev_bind_2, thread);
            czer_vars.$robust_assertion_lookup$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 11306L)
    public static SubLObject rf_formula(final SubLObject rf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.NIL != nart_handles.nart_p(rf)) {
            return Functions.funcall(czer_vars.$nart_key$.getDynamicValue(thread), rf);
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(rf)) {
            return Functions.funcall(czer_vars.$assertion_key$.getDynamicValue(thread), rf);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 11467L)
    public static SubLObject rf_expand(final SubLObject rf) {
        if (cycl_utilities.NIL != nart_handles.nart_p(rf)) {
            return narts_high.nart_expand(rf);
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(rf)) {
            return fi.assertion_expand(rf);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 11613L)
    public static SubLObject rf_narts(final SubLObject rf, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return formula_narts(Functions.funcall(czer_vars.$rf_key$.getDynamicValue(thread), rf), penetrate_hl_structuresP, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 11932L)
    public static SubLObject rf_assertions(final SubLObject rf, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return fi.sentence_assertions(Functions.funcall(czer_vars.$rf_key$.getDynamicValue(thread), rf), penetrate_hl_structuresP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 12267L)
    public static SubLObject wf_rf_syntaxP(final SubLObject rf) {
        if (cycl_utilities.NIL != nart_handles.nart_p(rf)) {
            return term.first_order_termP(narts_high.nart_hl_formula(rf));
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(rf)) {
            return el_grammar.el_sentence_p(fi.assertion_fi_formula(rf, (SubLObject)cycl_utilities.UNPROVIDED));
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 12521L)
    public static SubLObject valid_rfP(final SubLObject rf) {
        if (cycl_utilities.NIL != nart_handles.nart_p(rf)) {
            return nart_handles.valid_nartP(rf, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(rf)) {
            return assertions_high.valid_assertion(rf, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 12659L)
    public static SubLObject all_rfs() {
        return ConsesLow.nconc(kb_utilities.all_narts(), kb_utilities.all_assertions());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 13003L)
    public static SubLObject unreify_rfs(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return transform_list_utilities.transform(formula, Symbols.symbol_function((SubLObject)cycl_utilities.$sym16$RF_P), czer_vars.$rf_key$.getDynamicValue(thread), (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 13079L)
    public static SubLObject rf_count() {
        return Numbers.add(nart_handles.nart_count(), assertion_handles.assertion_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 13151L)
    public static SubLObject subrfs(final SubLObject rf, final SubLObject penetrate_hl_structuresP) {
        final SubLObject formula = rf_formula(rf);
        return ConsesLow.nconc(formula_narts(formula, penetrate_hl_structuresP, (SubLObject)cycl_utilities.UNPROVIDED), formula_sub_assertions(formula, penetrate_hl_structuresP, (SubLObject)cycl_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 13369L)
    public static SubLObject super_rfs(final SubLObject rf) {
        return ConsesLow.nconc((SubLObject)((cycl_utilities.NIL != nart_handles.nart_p(rf)) ? indexing_utilities.dependent_narts(rf) : cycl_utilities.NIL), kb_accessors.all_term_assertions(rf, (SubLObject)cycl_utilities.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 13533L)
    public static SubLObject inclusive_subrfs(final SubLObject rf) {
        return (SubLObject)ConsesLow.cons(rf, subrfs(rf, (SubLObject)cycl_utilities.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 13604L)
    public static SubLObject expression_gather_int_2(final SubLObject expression, final SubLObject pred, final SubLObject penetrate_hl_structuresP, final SubLObject key, final SubLObject subs_tooP) {
        SubLObject result = (SubLObject)((cycl_utilities.NIL != Functions.funcall(pred, Functions.funcall(key, expression))) ? ConsesLow.list(expression) : cycl_utilities.NIL);
        if (cycl_utilities.NIL != subs_tooP || cycl_utilities.NIL == result) {
            if (cycl_utilities.NIL != penetrate_hl_structuresP && cycl_utilities.NIL != hl_term_with_el_counterpart_p(expression)) {
                result = ConsesLow.nconc(expression_gather_int_2(careful_hl_term_to_el_term(expression), pred, (SubLObject)cycl_utilities.T, key, subs_tooP), result);
            }
            else if (cycl_utilities.NIL != el_utilities.el_formula_p(expression)) {
                final SubLObject maybe_some_opaque_argP = maybe_some_opaque_argP(expression);
                final SubLObject terms = formula_terms(expression, (SubLObject)cycl_utilities.$kw17$REGULARIZE);
                SubLObject list_var = (SubLObject)cycl_utilities.NIL;
                SubLObject v_term = (SubLObject)cycl_utilities.NIL;
                SubLObject argnum = (SubLObject)cycl_utilities.NIL;
                list_var = terms;
                v_term = list_var.first();
                for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                    if (cycl_utilities.NIL == maybe_some_opaque_argP || cycl_utilities.NIL == opaque_argP(expression, argnum)) {
                        result = ConsesLow.nconc(expression_gather_int_2(v_term, pred, penetrate_hl_structuresP, key, subs_tooP), result);
                    }
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 14587L)
    public static SubLObject expression_gather_int(final SubLObject expression, final SubLObject pred, final SubLObject penetrate_hl_structuresP, final SubLObject test, final SubLObject key, final SubLObject subs_tooP) {
        return list_utilities.fast_delete_duplicates(expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP), test, key, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 14812L)
    public static SubLObject expression_gather_with_duplicates(final SubLObject expression, final SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        return expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 15065L)
    public static SubLObject expression_gather(final SubLObject expression, final SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        return expression_gather_int(expression, pred, penetrate_hl_structuresP, test, key, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 15615L)
    public static SubLObject assertion_gather(final SubLObject pred, final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        assert cycl_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cycl_utilities.NIL == hl_term_with_el_counterpart_p(assertion)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        final SubLObject mt_objects = expression_gather_int(assertions_high.assertion_mt(assertion), pred, penetrate_hl_structuresP, test, key, subs_tooP);
        final SubLObject formula_objects = expression_gather_int(assertions_high.assertion_cons(assertion), pred, penetrate_hl_structuresP, test, key, subs_tooP);
        if (cycl_utilities.NIL == mt_objects) {
            return formula_objects;
        }
        if (cycl_utilities.NIL == formula_objects) {
            return mt_objects;
        }
        return list_utilities.fast_delete_duplicates(ConsesLow.nconc(mt_objects, formula_objects), test, key, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 16622L)
    public static SubLObject expression_count(final SubLObject item, final SubLObject list, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$expression_count_item$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cycl_utilities.$expression_count_test$.currentBinding(thread);
        try {
            cycl_utilities.$expression_count_item$.bind(item, thread);
            cycl_utilities.$expression_count_test$.bind(test, thread);
            result = Sequences.length(expression_gather_int_2(list, (SubLObject)cycl_utilities.$sym19$EXPRESSION_COUNT_HELPER, penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), subs_tooP));
        }
        finally {
            cycl_utilities.$expression_count_test$.rebind(_prev_bind_2, thread);
            cycl_utilities.$expression_count_item$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 17061L)
    public static SubLObject expression_count_helper(final SubLObject list_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Functions.funcall(cycl_utilities.$expression_count_test$.getDynamicValue(thread), cycl_utilities.$expression_count_item$.getDynamicValue(thread), list_expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 17203L)
    public static SubLObject expression_list_gather(final SubLObject expression_list, final SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        SubLObject cdolist_list_var = expression_list;
        SubLObject expression = (SubLObject)cycl_utilities.NIL;
        expression = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            final SubLObject partial_result = expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP);
            result = ConsesLow.nconc(result, partial_result);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, test, key, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 17972L)
    public static SubLObject formula_gather(final SubLObject formula, final SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_gather(formula, pred, penetrate_hl_structuresP, test, key, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 18478L)
    public static SubLObject expression_forts(final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        if (delete_duplicatesP == cycl_utilities.UNPROVIDED) {
            delete_duplicatesP = (SubLObject)cycl_utilities.T;
        }
        return (cycl_utilities.NIL != delete_duplicatesP) ? expression_gather_int(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym21$FORT_P), penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), subs_tooP) : expression_gather_int_2(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym21$FORT_P), penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 19122L)
    public static SubLObject expression_list_forts(final SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        return expression_list_gather(expression_list, Symbols.symbol_function((SubLObject)cycl_utilities.$sym21$FORT_P), penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 19604L)
    public static SubLObject formula_forts(final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP, SubLObject delete_duplicatesP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        if (delete_duplicatesP == cycl_utilities.UNPROVIDED) {
            delete_duplicatesP = (SubLObject)cycl_utilities.T;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_forts(formula, penetrate_hl_structuresP, subs_tooP, delete_duplicatesP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 20071L)
    public static SubLObject expression_constants(final SubLObject expression, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        return expression_gather_int(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym22$CONSTANT_P), penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 20550L)
    public static SubLObject expression_list_constants(final SubLObject expression_list, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        return expression_list_gather(expression_list, Symbols.symbol_function((SubLObject)cycl_utilities.$sym22$CONSTANT_P), penetrate_hl_structuresP, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 21003L)
    public static SubLObject formula_constants(final SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_constants(formula, penetrate_hl_structuresP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 21405L)
    public static SubLObject expression_narts(final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        return expression_gather_int(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym23$NART_P), penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 21890L)
    public static SubLObject expression_list_narts(final SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        return expression_list_gather(expression_list, Symbols.symbol_function((SubLObject)cycl_utilities.$sym23$NART_P), penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 22372L)
    public static SubLObject formula_narts(final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_narts(formula, penetrate_hl_structuresP, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 22786L)
    public static SubLObject expression_sub_assertions(final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        return expression_gather_int(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym18$ASSERTION_P), penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 23294L)
    public static SubLObject expression_list_sub_assertions(final SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        return expression_list_gather(expression_list, Symbols.symbol_function((SubLObject)cycl_utilities.$sym18$ASSERTION_P), penetrate_hl_structuresP, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY), subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 23795L)
    public static SubLObject formula_sub_assertions(final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_sub_assertions(formula, penetrate_hl_structuresP, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 24231L)
    public static SubLObject assertion_sub_assertions(final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        assert cycl_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return expression_sub_assertions(fi.assertion_hl_formula(assertion, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 24770L)
    public static SubLObject nart_sub_assertions(final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        assert cycl_utilities.NIL != nart_handles.nart_p(nart) : nart;
        return expression_sub_assertions(nart, penetrate_hl_structuresP, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 25170L)
    public static SubLObject subnarts(final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (subs_tooP == cycl_utilities.UNPROVIDED) {
            subs_tooP = (SubLObject)cycl_utilities.T;
        }
        return expression_narts(narts_high.nart_hl_formula(nart), penetrate_hl_structuresP, subs_tooP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 25568L)
    public static SubLObject all_formula_terms(final SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!formula.isAtom()) {
            if (cycl_utilities.NIL != penetrate_hl_structuresP && cycl_utilities.NIL != nart_handles.nart_p(formula)) {
                return all_formula_terms(narts_high.nart_hl_formula(formula), penetrate_hl_structuresP);
            }
            if (cycl_utilities.NIL != penetrate_hl_structuresP && cycl_utilities.NIL != assertion_handles.assertion_p(formula)) {
                return all_formula_terms(fi.assertion_fi_formula(formula, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP);
            }
            if (cycl_utilities.NIL != el_utilities.el_negation_p(formula)) {
                return all_formula_terms(formula_arg1(formula, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP);
            }
            if (cycl_utilities.NIL != el_utilities.el_conjunction_p(formula) || cycl_utilities.NIL != el_utilities.el_disjunction_p(formula)) {
                SubLObject result = (SubLObject)cycl_utilities.NIL;
                SubLObject cdolist_list_var;
                final SubLObject terms = cdolist_list_var = formula_terms(formula, (SubLObject)cycl_utilities.$kw24$IGNORE);
                SubLObject v_term = (SubLObject)cycl_utilities.NIL;
                v_term = cdolist_list_var.first();
                while (cycl_utilities.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(all_formula_terms(v_term, penetrate_hl_structuresP), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
                return result;
            }
            if (cycl_utilities.NIL != el_utilities.el_implication_p(formula)) {
                return conses_high.union(all_formula_terms(formula_arg1(formula, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP), all_formula_terms(formula_arg2(formula, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
            }
            if (cycl_utilities.NIL != el_utilities.el_exception_p(formula)) {
                return conses_high.union(all_formula_terms(formula_arg1(formula, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP), all_formula_terms(formula_arg2(formula, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
            }
            if (cycl_utilities.NIL != el_utilities.el_universal_p(formula) || cycl_utilities.NIL != el_utilities.el_existential_p(formula)) {
                return conses_high.adjoin(formula_arg1(formula, (SubLObject)cycl_utilities.UNPROVIDED), all_formula_terms(formula_arg2(formula, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
            }
            if (cycl_utilities.NIL != el_utilities.el_bounded_existential_p(formula)) {
                return conses_high.adjoin(formula_arg2(formula, (SubLObject)cycl_utilities.UNPROVIDED), all_formula_terms(formula_arg3(formula, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
            }
            if (cycl_utilities.NIL != el_utilities.mt_designating_literalP(formula)) {
                final SubLObject mt = el_utilities.designated_mt(formula);
                final SubLObject subformula = el_utilities.designated_sentence(formula);
                SubLObject result2 = (SubLObject)cycl_utilities.NIL;
                final SubLObject mt_var = (SubLObject)((cycl_utilities.NIL != fort_types_interface.mtP(mt)) ? mt : cycl_utilities.NIL);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    result2 = all_formula_terms(subformula, penetrate_hl_structuresP);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                return conses_high.adjoin(mt, result2, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
            }
            if (cycl_utilities.NIL != el_utilities.atomic_sentenceP(formula)) {
                return all_literal_terms(formula, penetrate_hl_structuresP);
            }
            el_utilities.el_error((SubLObject)cycl_utilities.FOUR_INTEGER, (SubLObject)cycl_utilities.$str25$_S_is_not_well_formed_, formula, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 27616L)
    public static SubLObject all_literal_terms(final SubLObject literal, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.NIL != el_utilities.el_negation_p(literal)) {
            return all_literal_terms(formula_arg1(literal, (SubLObject)cycl_utilities.UNPROVIDED), penetrate_hl_structuresP);
        }
        SubLObject ans = (SubLObject)cycl_utilities.NIL;
        SubLObject psn = (SubLObject)cycl_utilities.ONE_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(literal, (SubLObject)cycl_utilities.$kw24$IGNORE);
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            if (cycl_utilities.NIL != forts.fort_p(v_term)) {
                final SubLObject item_var = v_term;
                if (cycl_utilities.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
                if (cycl_utilities.NIL != penetrate_hl_structuresP && cycl_utilities.NIL != nart_handles.nart_p(v_term)) {
                    ans = list_utilities.fast_delete_duplicates(ConsesLow.append(ans, all_literal_terms(Functions.funcall(czer_vars.$nart_key$.getDynamicValue(thread), v_term), (SubLObject)cycl_utilities.T)), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
                }
            }
            else if (cycl_utilities.NIL != penetrate_hl_structuresP && cycl_utilities.NIL != assertion_handles.assertion_p(v_term)) {
                ans = list_utilities.fast_delete_duplicates(ConsesLow.append(ans, all_formula_terms(Functions.funcall(czer_vars.$assertion_key$.getDynamicValue(thread), v_term), (SubLObject)cycl_utilities.T)), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
            }
            else if (cycl_utilities.NIL != cycl_variables.kb_variableP(v_term)) {
                final SubLObject item_var = v_term;
                if (cycl_utilities.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
            }
            else if (cycl_utilities.NIL != collection_defns.el_variableP(v_term)) {
                final SubLObject item_var = v_term;
                if (cycl_utilities.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)cycl_utilities.EQL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
            }
            else if (cycl_utilities.NIL != term.unreified_skolem_termP(v_term)) {
                SubLObject cdolist_list_var_$1 = conses_high.second(v_term);
                SubLObject sub_term = (SubLObject)cycl_utilities.NIL;
                sub_term = cdolist_list_var_$1.first();
                while (cycl_utilities.NIL != cdolist_list_var_$1) {
                    final SubLObject item_var2 = sub_term;
                    if (cycl_utilities.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)cycl_utilities.EQUAL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    sub_term = cdolist_list_var_$1.first();
                }
            }
            else if (cycl_utilities.NIL != term.nautP(v_term, (SubLObject)cycl_utilities.UNPROVIDED)) {
                SubLObject cdolist_list_var_$2 = all_literal_terms(v_term, penetrate_hl_structuresP);
                SubLObject sub_term = (SubLObject)cycl_utilities.NIL;
                sub_term = cdolist_list_var_$2.first();
                while (cycl_utilities.NIL != cdolist_list_var_$2) {
                    final SubLObject item_var2 = sub_term;
                    if (cycl_utilities.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)cycl_utilities.EQUAL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    sub_term = cdolist_list_var_$2.first();
                }
            }
            else if (cycl_utilities.NIL != term.sentenceP(v_term, (SubLObject)cycl_utilities.UNPROVIDED)) {
                SubLObject cdolist_list_var_$3 = all_formula_terms(v_term, penetrate_hl_structuresP);
                SubLObject sub_term = (SubLObject)cycl_utilities.NIL;
                sub_term = cdolist_list_var_$3.first();
                while (cycl_utilities.NIL != cdolist_list_var_$3) {
                    final SubLObject item_var2 = sub_term;
                    if (cycl_utilities.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)cycl_utilities.EQUAL), Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    sub_term = cdolist_list_var_$3.first();
                }
            }
            else {
                el_utilities.el_error((SubLObject)cycl_utilities.FOUR_INTEGER, (SubLObject)cycl_utilities.$str25$_S_is_not_well_formed_, literal, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
            }
            psn = Numbers.add(psn, (SubLObject)cycl_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.reverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 29009L)
    public static SubLObject top_level_predicates(final SubLObject sentence, SubLObject remove_duplicatesP) {
        if (remove_duplicatesP == cycl_utilities.UNPROVIDED) {
            remove_duplicatesP = (SubLObject)cycl_utilities.NIL;
        }
        SubLObject predicates = top_level_predicates_int(sentence);
        if (cycl_utilities.NIL != remove_duplicatesP) {
            predicates = list_utilities.fast_delete_duplicates(predicates, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return predicates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 29440L)
    public static SubLObject top_level_predicates_int(final SubLObject sentence) {
        SubLObject predicates = (SubLObject)cycl_utilities.NIL;
        final SubLObject truth_function = sentence_truth_function(sentence);
        if (cycl_utilities.NIL != el_utilities.cyc_const_logical_operator_p(truth_function)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = formula_args(sentence, (SubLObject)cycl_utilities.$kw24$IGNORE);
            SubLObject subsentence = (SubLObject)cycl_utilities.NIL;
            subsentence = cdolist_list_var.first();
            while (cycl_utilities.NIL != cdolist_list_var) {
                final SubLObject sub_predicates = top_level_predicates_int(subsentence);
                predicates = ConsesLow.nconc(predicates, sub_predicates);
                cdolist_list_var = cdolist_list_var.rest();
                subsentence = cdolist_list_var.first();
            }
        }
        else if (cycl_utilities.NIL != fort_types_interface.predicateP(truth_function)) {
            final SubLObject predicate = truth_function;
            predicates = (SubLObject)ConsesLow.cons(predicate, predicates);
        }
        return predicates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 30109L)
    public static SubLObject containing_subexpressions(final SubLObject v_term, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expressions = (SubLObject)cycl_utilities.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$containing_subexpressions_lambda_term$.currentBinding(thread);
        try {
            cycl_utilities.$containing_subexpressions_lambda_term$.bind(v_term, thread);
            expressions = expression_gather(formula, (SubLObject)cycl_utilities.$sym26$CONTAINING_SUBEXPRESSIONS_LAMBDA_FN, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        finally {
            cycl_utilities.$containing_subexpressions_lambda_term$.rebind(_prev_bind_0, thread);
        }
        return expressions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 30369L)
    public static SubLObject containing_subexpressions_lambda_fn(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = formula_terms(formula, (SubLObject)cycl_utilities.$kw24$IGNORE);
        SubLObject arg = (SubLObject)cycl_utilities.NIL;
        arg = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            if (arg.equal(cycl_utilities.$containing_subexpressions_lambda_term$.getDynamicValue(thread))) {
                return (SubLObject)cycl_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 30563L)
    public static SubLObject expression_contains_keywordp(final SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        return list_utilities.sublisp_boolean(expression_find_if((SubLObject)cycl_utilities.$sym27$KEYWORDP, formula, penetrate_hl_structuresP, (SubLObject)cycl_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 30736L)
    public static SubLObject expression_find_if_int(final SubLObject test, final SubLObject expression, final SubLObject penetrate_hl_structuresP, final SubLObject key) {
        final SubLObject transformed_expression = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY).eql(key) ? expression : Functions.funcall(key, expression);
        final SubLObject test_succeededP = Functions.funcall(test, transformed_expression);
        if (cycl_utilities.NIL != test_succeededP) {
            return expression;
        }
        if (cycl_utilities.NIL != penetrate_hl_structuresP && cycl_utilities.NIL != hl_term_with_el_counterpart_p(expression)) {
            return expression_find_if_int(test, careful_hl_term_to_el_term(expression), (SubLObject)cycl_utilities.T, key);
        }
        if (cycl_utilities.NIL == el_utilities.el_formula_p(expression)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        final SubLObject maybe_some_opaque_argP = maybe_some_opaque_argP(expression);
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        final SubLObject terms = formula_terms(expression, (SubLObject)cycl_utilities.$kw17$REGULARIZE);
        SubLObject list_var = (SubLObject)cycl_utilities.NIL;
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        SubLObject argnum = (SubLObject)cycl_utilities.NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL == result && cycl_utilities.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if (cycl_utilities.NIL == maybe_some_opaque_argP || cycl_utilities.NIL == opaque_argP(expression, argnum)) {
                result = expression_find_if_int(test, v_term, penetrate_hl_structuresP, key);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 31770L)
    public static SubLObject expression_find_if(final SubLObject test, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        if (cycl_utilities.NIL == penetrate_hl_structuresP && cycl_utilities.NIL == list_utilities.tree_find_if(test, expression, key)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        return expression_find_if_int(test, expression, penetrate_hl_structuresP, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 32340L)
    public static SubLObject formula_find_if(final SubLObject test, final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_find_if(test, formula, penetrate_hl_structuresP, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 32801L)
    public static SubLObject assertion_find_if(final SubLObject test, final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cycl_utilities.NIL != hl_term_with_el_counterpart_p(assertion)) {
            SubLObject v_object = expression_find_if(test, assertions_high.assertion_cons(assertion), penetrate_hl_structuresP, key);
            if (cycl_utilities.NIL != v_object) {
                return v_object;
            }
            v_object = expression_find_if(test, assertions_high.assertion_mt(assertion), penetrate_hl_structuresP, key);
            if (cycl_utilities.NIL != v_object) {
                return v_object;
            }
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 33482L)
    public static SubLObject nart_find_if(final SubLObject test, final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != nart_handles.nart_p(nart) : nart;
        if (cycl_utilities.NIL != hl_term_with_el_counterpart_p(nart)) {
            return expression_find_if(test, nart_cons(nart), penetrate_hl_structuresP, key);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 33939L)
    public static SubLObject expression_find_int(final SubLObject v_object, final SubLObject expression, final SubLObject penetrate_hl_structuresP, final SubLObject test, final SubLObject key) {
        if (cycl_utilities.NIL != Functions.funcall(test, v_object, Functions.funcall(key, expression))) {
            return expression;
        }
        if (cycl_utilities.NIL != penetrate_hl_structuresP && cycl_utilities.NIL != hl_term_with_el_counterpart_p(expression)) {
            return expression_find_int(v_object, careful_hl_term_to_el_term(expression), (SubLObject)cycl_utilities.T, test, key);
        }
        if (cycl_utilities.NIL == el_utilities.el_formula_p(expression)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        final SubLObject maybe_some_opaque_argP = maybe_some_opaque_argP(expression);
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        final SubLObject terms = formula_terms(expression, (SubLObject)cycl_utilities.$kw17$REGULARIZE);
        SubLObject list_var = (SubLObject)cycl_utilities.NIL;
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        SubLObject argnum = (SubLObject)cycl_utilities.NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL == result && cycl_utilities.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if (cycl_utilities.NIL == maybe_some_opaque_argP || cycl_utilities.NIL == opaque_argP(expression, argnum)) {
                result = expression_find_int(v_object, v_term, penetrate_hl_structuresP, test, key);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 34812L)
    public static SubLObject expression_find(final SubLObject v_object, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        return expression_find_int(v_object, expression, penetrate_hl_structuresP, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 35222L)
    public static SubLObject formula_find(final SubLObject v_object, final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_find_int(v_object, formula, penetrate_hl_structuresP, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 35700L)
    public static SubLObject assertion_find(final SubLObject v_object, final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject result = expression_find_int(v_object, assertions_high.assertion_cons(assertion), penetrate_hl_structuresP, test, key);
        if (cycl_utilities.NIL != result) {
            return result;
        }
        result = expression_find_int(v_object, assertions_high.assertion_mt(assertion), penetrate_hl_structuresP, test, key);
        if (cycl_utilities.NIL != result) {
            return result;
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 36369L)
    public static SubLObject nart_find(final SubLObject v_object, final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != nart_handles.nart_p(nart) : nart;
        return expression_find_int(v_object, nart, penetrate_hl_structuresP, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 36795L)
    public static SubLObject expression_list_find(final SubLObject v_object, final SubLObject expression_list, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != Types.listp(expression_list) : expression_list;
        SubLObject cdolist_list_var = expression_list;
        SubLObject expression = (SubLObject)cycl_utilities.NIL;
        expression = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            final SubLObject result = expression_find(v_object, expression, penetrate_hl_structuresP, test, key);
            if (cycl_utilities.NIL != result) {
                return result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 37366L)
    public static SubLObject remove_if_not_in_expression(final SubLObject list, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)cycl_utilities.NIL;
        elem = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            if (cycl_utilities.NIL != expression_find(elem, expression, penetrate_hl_structuresP, test, key)) {
                result = (SubLObject)ConsesLow.cons(elem, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 37911L)
    public static SubLObject expression_find_any(final SubLObject objects, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = (SubLObject)cycl_utilities.NIL;
        v_object = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            final SubLObject result = expression_find(v_object, expression, penetrate_hl_structuresP, test, key);
            if (cycl_utilities.NIL != result) {
                return result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 38508L)
    public static SubLObject expression_map_int(final SubLObject func, final SubLObject expression, final SubLObject penetrate_hl_structuresP, final SubLObject key) {
        Functions.funcall(func, Functions.funcall(key, expression));
        if (cycl_utilities.NIL != penetrate_hl_structuresP && cycl_utilities.NIL != hl_term_with_el_counterpart_p(expression)) {
            return expression_map_int(func, careful_hl_term_to_el_term(expression), (SubLObject)cycl_utilities.T, key);
        }
        if (cycl_utilities.NIL == el_utilities.el_formula_p(expression)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        final SubLObject terms = formula_terms(expression, (SubLObject)cycl_utilities.$kw17$REGULARIZE);
        SubLObject list_var = (SubLObject)cycl_utilities.NIL;
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        SubLObject argnum = (SubLObject)cycl_utilities.NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if (cycl_utilities.NIL == opaque_argP(expression, argnum)) {
                expression_map_int(func, v_term, penetrate_hl_structuresP, key);
            }
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 39175L)
    public static SubLObject expression_map(final SubLObject func, final SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        return expression_map_int(func, expression, penetrate_hl_structuresP, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 39560L)
    public static SubLObject formula_map(final SubLObject func, final SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_map_int(func, formula, penetrate_hl_structuresP, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 39977L)
    public static SubLObject assertion_map(final SubLObject func, final SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cycl_utilities.NIL != hl_term_with_el_counterpart_p(assertion)) {
            expression_map_int(func, assertions_high.assertion_mt(assertion), penetrate_hl_structuresP, key);
            expression_map_int(func, assertions_high.assertion_cons(assertion), penetrate_hl_structuresP, key);
            return (SubLObject)cycl_utilities.NIL;
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 40543L)
    public static SubLObject nart_map(final SubLObject func, final SubLObject nart, SubLObject penetrate_hl_structuresP, SubLObject key) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.NIL;
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != nart_handles.nart_p(nart) : nart;
        if (cycl_utilities.NIL != hl_term_with_el_counterpart_p(nart)) {
            return expression_map_int(func, nart_cons(nart), penetrate_hl_structuresP, key);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 41098L)
    public static SubLObject expression_ntransform_int(final SubLObject expression, final SubLObject pred, final SubLObject transform, final SubLObject transform_sequence_variablesP, final SubLObject transformation_limit, final SubLObject transformation_level, final SubLObject test_pred_on_transformation_resultP, final SubLObject negate_predP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transformation_level.numG(transformation_limit)) {
            Dynamic.sublisp_throw((SubLObject)cycl_utilities.$kw10$TRANSFORMATION_LIMIT_EXCEEDED, transformation_limit);
        }
        SubLObject transformed_expression = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL != test_pred_on_transformation_resultP) {
            final SubLObject transform_result = Functions.funcall(transform, expression);
            if (!SubLObjectFactory.makeBoolean(cycl_utilities.NIL == negate_predP).eql((SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL == Functions.funcall(pred, transform_result)))) {
                transformed_expression = expression_ntransform_int(transform_result, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP);
            }
            else {
                transformed_expression = expression;
            }
        }
        else if (!SubLObjectFactory.makeBoolean(cycl_utilities.NIL == negate_predP).eql((SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL == Functions.funcall(pred, expression)))) {
            final SubLObject transform_result = Functions.funcall(transform, expression);
            if (!expression.eql(transform_result)) {
                transformed_expression = expression_ntransform_int(transform_result, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP);
            }
            else {
                transformed_expression = expression;
            }
        }
        else {
            transformed_expression = expression;
        }
        if (cycl_utilities.NIL == el_utilities.el_formula_p(transformed_expression)) {
            return transformed_expression;
        }
        final SubLObject possible_seqvar = el_utilities.sequence_term(transformed_expression);
        final SubLObject transformed_seqvar = (SubLObject)((cycl_utilities.NIL != possible_seqvar && cycl_utilities.NIL != cycl_variables.cyc_varP(possible_seqvar) && cycl_utilities.NIL != transform_sequence_variablesP && cycl_utilities.NIL == opaque_seqvarP(transformed_expression)) ? expression_ntransform_int(possible_seqvar, pred, transform, (SubLObject)cycl_utilities.T, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP) : cycl_utilities.NIL);
        final SubLObject new_seq_term = (cycl_utilities.NIL != transformed_seqvar) ? transformed_seqvar : possible_seqvar;
        final SubLObject ist_sentenceP = el_utilities.ist_sentence_p(transformed_expression, (SubLObject)cycl_utilities.UNPROVIDED);
        final SubLObject maybe_some_opaque_argP = maybe_some_opaque_argP(transformed_expression);
        SubLObject new_mt = (SubLObject)cycl_utilities.NIL;
        SubLObject rest_of_expression = (SubLObject)cycl_utilities.NIL;
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        SubLObject argnum = (SubLObject)cycl_utilities.NIL;
        rest_of_expression = transformed_expression;
        v_term = rest_of_expression.first();
        for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest(), v_term = rest_of_expression.first(), argnum = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, argnum)) {
            final SubLObject mt_var = new_mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                if (cycl_utilities.NIL == maybe_some_opaque_argP || cycl_utilities.NIL == opaque_argP(transformed_expression, argnum)) {
                    ConsesLow.rplaca(rest_of_expression, expression_ntransform_int(v_term, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP));
                    if (cycl_utilities.NIL != ist_sentenceP && argnum.numE((SubLObject)cycl_utilities.ONE_INTEGER)) {
                        new_mt = rest_of_expression.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (cycl_utilities.NIL == maybe_some_opaque_argP || cycl_utilities.NIL == opaque_argP(transformed_expression, argnum)) {
            ConsesLow.rplaca(rest_of_expression, expression_ntransform_int(v_term, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP));
        }
        ConsesLow.rplacd(rest_of_expression, new_seq_term);
        return transformed_expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 44904L)
    public static SubLObject expression_transform(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(el_utilities.copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 45759L)
    public static SubLObject expression_ntransform(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 46142L)
    public static SubLObject formula_transform(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_ntransform_int(el_utilities.copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 46906L)
    public static SubLObject formula_ntransform(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 47313L)
    public static SubLObject expression_transform_if(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(el_utilities.copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 48169L)
    public static SubLObject expression_ntransform_if(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 48514L)
    public static SubLObject formula_transform_if(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_ntransform_int(el_utilities.copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 49372L)
    public static SubLObject formula_ntransform_if(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 49741L)
    public static SubLObject expression_transform_if_not(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(el_utilities.copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 50606L)
    public static SubLObject expression_ntransform_if_not(final SubLObject expression, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        return expression_ntransform_int(expression, pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 50957L)
    public static SubLObject formula_transform_if_not(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_ntransform_int(el_utilities.copy_formula(formula), pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 51824L)
    public static SubLObject formula_ntransform_if_not(final SubLObject formula, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_ntransform_int(formula, pred, transform, transform_sequence_variablesP, transformation_limit, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 52199L)
    public static SubLObject formula_and_mt_transform(SubLObject formula, SubLObject mt, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            formula = formula_transform(formula, pred, transform, transform_sequence_variablesP, transformation_limit);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject formula_$4 = czer_utilities.unwrap_if_ist(formula, mt, (SubLObject)cycl_utilities.UNPROVIDED);
        final SubLObject mt_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        formula = formula_$4;
        mt = mt_$5;
        return Values.values(formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 53156L)
    public static SubLObject formula_and_mt_ntransform(SubLObject formula, SubLObject mt, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            formula = formula_ntransform(formula, pred, transform, transform_sequence_variablesP, transformation_limit);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        thread.resetMultipleValues();
        final SubLObject formula_$6 = czer_utilities.unwrap_if_ist(formula, mt, (SubLObject)cycl_utilities.UNPROVIDED);
        final SubLObject mt_$7 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        formula = formula_$6;
        mt = mt_$7;
        return Values.values(formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 53592L)
    public static SubLObject sentence_and_mt_transform(final SubLObject sentence, final SubLObject mt, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        return formula_and_mt_transform(sentence, mt, pred, transform, transform_sequence_variablesP, transformation_limit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 53872L)
    public static SubLObject sentence_and_mt_ntransform(final SubLObject sentence, final SubLObject mt, final SubLObject pred, final SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
        if (transform_sequence_variablesP == cycl_utilities.UNPROVIDED) {
            transform_sequence_variablesP = (SubLObject)cycl_utilities.NIL;
        }
        if (transformation_limit == cycl_utilities.UNPROVIDED) {
            transformation_limit = cycl_utilities.$default_transformation_limit$.getGlobalValue();
        }
        return formula_and_mt_ntransform(sentence, mt, pred, transform, transform_sequence_variablesP, transformation_limit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 54153L)
    public static SubLObject expression_nsubst_free_vars_int(final SubLObject v_new, final SubLObject old, final SubLObject expression, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.NIL != Functions.funcall(test, expression, old)) {
            if (cycl_utilities.NIL != czer_vars.$inside_quote$.getDynamicValue(thread)) {
                return expression;
            }
            return v_new;
        }
        else {
            if (cycl_utilities.NIL == el_utilities.el_formula_p(expression)) {
                return expression;
            }
            if (cycl_utilities.NIL != cycl_grammar.fast_escape_quote_term_p(expression) || cycl_utilities.NIL != cycl_grammar.fast_quasi_quote_term_p(expression)) {
                SubLObject result = (SubLObject)cycl_utilities.NIL;
                final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                try {
                    czer_vars.$inside_quote$.bind((SubLObject)cycl_utilities.NIL, thread);
                    if (cycl_utilities.NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread)) {
                        result = expression_nsubst_free_vars_int(v_new, old, formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED), test);
                    }
                    else {
                        result = el_utilities.make_unary_formula(formula_arg0(expression), expression_nsubst_free_vars_int(v_new, old, formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED), test));
                    }
                }
                finally {
                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if (cycl_utilities.NIL != cycl_grammar.fast_quote_term_p(expression)) {
                SubLObject result = (SubLObject)cycl_utilities.NIL;
                final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                try {
                    czer_vars.$inside_quote$.bind((SubLObject)cycl_utilities.T, thread);
                    result = el_utilities.make_unary_formula(cycl_utilities.$const31$Quote, expression_nsubst_free_vars_int(v_new, old, formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED), test));
                }
                finally {
                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if (cycl_utilities.NIL != el_utilities.expand_subl_fn_p(expression) && cycl_utilities.NIL != subl_promotions.memberP(old, formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED), test, (SubLObject)cycl_utilities.UNPROVIDED)) {
                return el_utilities.make_binary_formula(cycl_utilities.$const32$ExpandSubLFn, conses_high.subst(v_new, old, formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED), test, (SubLObject)cycl_utilities.UNPROVIDED), expression_nsubst_free_vars_int(v_new, old, formula_arg2(expression, (SubLObject)cycl_utilities.UNPROVIDED), test));
            }
            final SubLObject seqvar = el_utilities.sequence_var(expression, (SubLObject)cycl_utilities.UNPROVIDED);
            final SubLObject substituted_seqvar = (cycl_utilities.NIL != seqvar && cycl_utilities.NIL == opaque_seqvarP(expression)) ? expression_nsubst_free_vars_int(v_new, old, seqvar, test) : seqvar;
            SubLObject rest_of_expression = (SubLObject)cycl_utilities.NIL;
            SubLObject v_term = (SubLObject)cycl_utilities.NIL;
            SubLObject argnum = (SubLObject)cycl_utilities.NIL;
            rest_of_expression = expression;
            v_term = rest_of_expression.first();
            for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest(), v_term = rest_of_expression.first(), argnum = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, argnum)) {
                if (cycl_utilities.NIL == opaque_arg_wrt_free_varsP(expression, argnum)) {
                    ConsesLow.rplaca(rest_of_expression, expression_nsubst_free_vars_int(v_new, old, v_term, test));
                }
            }
            if (cycl_utilities.NIL == opaque_arg_wrt_free_varsP(expression, argnum)) {
                ConsesLow.rplaca(rest_of_expression, expression_nsubst_free_vars_int(v_new, old, v_term, test));
            }
            ConsesLow.rplacd(rest_of_expression, substituted_seqvar);
            return expression;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 56595L)
    public static SubLObject expression_nsubst_free_vars(final SubLObject v_new, final SubLObject old, final SubLObject expression, SubLObject test) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        return expression_nsubst_free_vars_int(v_new, old, expression, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 56753L)
    public static SubLObject expression_nsubst_int(final SubLObject v_new, final SubLObject old, final SubLObject expression, final SubLObject test, final SubLObject key) {
        if (cycl_utilities.NIL != Functions.funcall(test, Functions.funcall(key, expression), old)) {
            return v_new;
        }
        if (cycl_utilities.NIL == el_utilities.el_formula_p(expression)) {
            return expression;
        }
        final SubLObject seqvar = el_utilities.sequence_var(expression, (SubLObject)cycl_utilities.UNPROVIDED);
        final SubLObject substituted_seqvar = (cycl_utilities.NIL != seqvar && cycl_utilities.NIL == opaque_seqvarP(expression)) ? expression_nsubst_int(v_new, old, seqvar, test, key) : seqvar;
        SubLObject rest_of_expression = (SubLObject)cycl_utilities.NIL;
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        SubLObject argnum = (SubLObject)cycl_utilities.NIL;
        rest_of_expression = expression;
        v_term = rest_of_expression.first();
        for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest(), v_term = rest_of_expression.first(), argnum = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, argnum)) {
            if (cycl_utilities.NIL == opaque_argP(expression, argnum)) {
                ConsesLow.rplaca(rest_of_expression, expression_nsubst_int(v_new, old, v_term, test, key));
            }
        }
        if (cycl_utilities.NIL == opaque_argP(expression, argnum)) {
            ConsesLow.rplaca(rest_of_expression, expression_nsubst_int(v_new, old, v_term, test, key));
        }
        ConsesLow.rplacd(rest_of_expression, substituted_seqvar);
        return expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 57671L)
    public static SubLObject expression_subst(final SubLObject v_new, final SubLObject old, final SubLObject expression, SubLObject test, SubLObject key) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        return expression_nsubst_int(v_new, old, el_utilities.copy_expression(expression), test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 58025L)
    public static SubLObject expression_nsubst(final SubLObject v_new, final SubLObject old, final SubLObject expression, SubLObject test, SubLObject key) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        return expression_nsubst_int(v_new, old, expression, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 58234L)
    public static SubLObject formula_subst(final SubLObject v_new, final SubLObject old, final SubLObject formula, SubLObject test, SubLObject key) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_nsubst_int(v_new, old, el_utilities.copy_formula(formula), test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 58604L)
    public static SubLObject formula_nsubst(final SubLObject v_new, final SubLObject old, final SubLObject formula, SubLObject test, SubLObject key) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_nsubst_int(v_new, old, formula, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 58837L)
    public static SubLObject expression_nsublis_free_vars_int(final SubLObject alist, SubLObject expression, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject oldXnew = conses_high.assoc(expression, alist, test, (SubLObject)cycl_utilities.UNPROVIDED);
        if (cycl_utilities.NIL != oldXnew) {
            if (cycl_utilities.NIL != czer_vars.$inside_quote$.getDynamicValue(thread)) {
                return expression;
            }
            return oldXnew.rest();
        }
        else {
            if (cycl_utilities.NIL == el_utilities.el_formula_p(expression)) {
                return expression;
            }
            if (cycl_utilities.NIL != cycl_grammar.fast_escape_quote_term_p(expression) || cycl_utilities.NIL != cycl_grammar.fast_quasi_quote_term_p(expression)) {
                SubLObject result = (SubLObject)cycl_utilities.NIL;
                final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                try {
                    czer_vars.$inside_quote$.bind((SubLObject)cycl_utilities.NIL, thread);
                    if (cycl_utilities.NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread)) {
                        result = expression_nsublis_free_vars_int(alist, formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED), test);
                    }
                    else {
                        result = el_utilities.make_unary_formula(formula_arg0(expression), expression_nsublis_free_vars_int(alist, formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED), test));
                    }
                }
                finally {
                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if (cycl_utilities.NIL != cycl_grammar.fast_quote_term_p(expression)) {
                SubLObject result = (SubLObject)cycl_utilities.NIL;
                final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
                try {
                    czer_vars.$inside_quote$.bind((SubLObject)cycl_utilities.T, thread);
                    result = el_utilities.make_unary_formula(cycl_utilities.$const31$Quote, expression_nsublis_free_vars_int(alist, formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED), test));
                }
                finally {
                    czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
                }
                return result;
            }
            if (cycl_utilities.NIL != el_utilities.expand_subl_fn_p(expression)) {
                final SubLObject arg1 = formula_arg1(expression, (SubLObject)cycl_utilities.UNPROVIDED);
                final SubLObject vars = expression_gather(arg1, Symbols.symbol_function((SubLObject)cycl_utilities.$sym35$CYC_VAR_), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
                SubLObject non_opaque_var_list = (SubLObject)cycl_utilities.NIL;
                if (cycl_utilities.NIL != vars) {
                    SubLObject cdolist_list_var = vars;
                    SubLObject var = (SubLObject)cycl_utilities.NIL;
                    var = cdolist_list_var.first();
                    while (cycl_utilities.NIL != cdolist_list_var) {
                        final SubLObject oldXnew2 = conses_high.assoc(var, alist, test, (SubLObject)cycl_utilities.UNPROVIDED);
                        if (cycl_utilities.NIL != oldXnew2) {
                            non_opaque_var_list = (SubLObject)ConsesLow.cons(oldXnew2, non_opaque_var_list);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        var = cdolist_list_var.first();
                    }
                    if (cycl_utilities.NIL != non_opaque_var_list) {
                        expression = el_utilities.make_binary_formula(cycl_utilities.$const32$ExpandSubLFn, expression_nsublis_free_vars_int(alist, arg1, test), expression_nsublis_free_vars_int(non_opaque_var_list, formula_arg2(expression, (SubLObject)cycl_utilities.UNPROVIDED), test));
                    }
                }
                return expression;
            }
            final SubLObject seqvar = el_utilities.sequence_var(expression, (SubLObject)cycl_utilities.UNPROVIDED);
            final SubLObject substituted_seqvar = (cycl_utilities.NIL != seqvar && cycl_utilities.NIL == opaque_seqvarP(expression)) ? expression_nsublis_free_vars_int(alist, seqvar, test) : seqvar;
            SubLObject rest_of_expression = (SubLObject)cycl_utilities.NIL;
            SubLObject v_term = (SubLObject)cycl_utilities.NIL;
            SubLObject argnum = (SubLObject)cycl_utilities.NIL;
            rest_of_expression = expression;
            v_term = rest_of_expression.first();
            for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest(), v_term = rest_of_expression.first(), argnum = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, argnum)) {
                if (cycl_utilities.NIL == opaque_arg_wrt_free_varsP(expression, argnum)) {
                    ConsesLow.rplaca(rest_of_expression, expression_nsublis_free_vars_int(alist, v_term, test));
                }
            }
            if (cycl_utilities.NIL == opaque_arg_wrt_free_varsP(expression, argnum)) {
                ConsesLow.rplaca(rest_of_expression, expression_nsublis_free_vars_int(alist, v_term, test));
            }
            ConsesLow.rplacd(rest_of_expression, substituted_seqvar);
            return expression;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 61676L)
    public static SubLObject expression_nsublis_free_vars(final SubLObject alist, final SubLObject expression, SubLObject test) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        return expression_nsublis_free_vars_int(alist, expression, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 61832L)
    public static SubLObject expression_nsublis_int(final SubLObject alist, final SubLObject expression, final SubLObject test, final SubLObject key) {
        final SubLObject oldXnew = conses_high.assoc(Functions.funcall(key, expression), alist, test, (SubLObject)cycl_utilities.UNPROVIDED);
        if (cycl_utilities.NIL != oldXnew) {
            return oldXnew.rest();
        }
        if (cycl_utilities.NIL == el_utilities.el_formula_p(expression)) {
            return expression;
        }
        final SubLObject seqvar = el_utilities.sequence_var(expression, (SubLObject)cycl_utilities.UNPROVIDED);
        final SubLObject substituted_seqvar = (cycl_utilities.NIL != seqvar && cycl_utilities.NIL == opaque_seqvarP(expression)) ? expression_nsublis_int(alist, seqvar, test, key) : seqvar;
        SubLObject rest_of_expression = (SubLObject)cycl_utilities.NIL;
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        SubLObject argnum = (SubLObject)cycl_utilities.NIL;
        rest_of_expression = expression;
        v_term = rest_of_expression.first();
        for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest(), v_term = rest_of_expression.first(), argnum = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, argnum)) {
            if (cycl_utilities.NIL == opaque_argP(expression, argnum)) {
                ConsesLow.rplaca(rest_of_expression, expression_nsublis_int(alist, v_term, test, key));
            }
        }
        if (cycl_utilities.NIL == opaque_argP(expression, argnum)) {
            ConsesLow.rplaca(rest_of_expression, expression_nsublis_int(alist, v_term, test, key));
        }
        ConsesLow.rplacd(rest_of_expression, substituted_seqvar);
        return expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 62844L)
    public static SubLObject expression_sublis(final SubLObject alist, final SubLObject expression, SubLObject test, SubLObject key) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        return expression_nsublis_int(alist, el_utilities.copy_expression(expression), test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 63324L)
    public static SubLObject expression_nsublis(final SubLObject alist, final SubLObject expression, SubLObject test, SubLObject key) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        return expression_nsublis_int(alist, expression, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 63532L)
    public static SubLObject formula_sublis(final SubLObject alist, final SubLObject formula, SubLObject test, SubLObject key) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_nsublis_int(alist, el_utilities.copy_formula(formula), test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 63998L)
    public static SubLObject formula_nsublis(final SubLObject alist, final SubLObject formula, SubLObject test, SubLObject key) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return expression_nsublis_int(alist, formula, test, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 64230L)
    public static SubLObject expression_nsublis_el_variables(final SubLObject expression, final SubLObject el_variables) {
        SubLObject alist = (SubLObject)cycl_utilities.NIL;
        SubLObject list_var = (SubLObject)cycl_utilities.NIL;
        SubLObject el_var = (SubLObject)cycl_utilities.NIL;
        SubLObject n = (SubLObject)cycl_utilities.NIL;
        list_var = el_variables;
        el_var = list_var.first();
        for (n = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), n = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, n)) {
            final SubLObject variable = variables.find_variable_by_id(n);
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(variable, el_var), alist);
        }
        return expression_nsublis(alist, expression, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 64625L)
    public static SubLObject expression_sublis_el_variables(final SubLObject expression, final SubLObject el_variables) {
        return expression_nsublis_el_variables(el_utilities.copy_expression(expression), el_variables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 64903L)
    public static SubLObject expression_nsublis_hl_variables(final SubLObject expression) {
        SubLObject alist = (SubLObject)cycl_utilities.NIL;
        SubLObject list_var = (SubLObject)cycl_utilities.NIL;
        SubLObject el_var = (SubLObject)cycl_utilities.NIL;
        SubLObject n = (SubLObject)cycl_utilities.NIL;
        list_var = expression_gather(expression, (SubLObject)cycl_utilities.$sym36$EL_VAR_, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        el_var = list_var.first();
        for (n = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), n = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, n)) {
            final SubLObject variable = variables.find_variable_by_id(n);
            alist = list_utilities.alist_enter(alist, el_var, variable, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return Values.values(expression_nsublis(alist, expression, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED), alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 65471L)
    public static SubLObject expression_sublis_hl_variables(final SubLObject expression) {
        return expression_nsublis_hl_variables(el_utilities.copy_expression(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 65849L)
    public static SubLObject cnf_nsublis_el_variables(final SubLObject cnf, final SubLObject el_variables) {
        return expression_nsublis_el_variables(cnf, el_variables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 66048L)
    public static SubLObject cnf_sublis_el_variables(final SubLObject cnf, final SubLObject el_variables) {
        return expression_sublis_el_variables(cnf, el_variables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 66245L)
    public static SubLObject formula_arg_position_subst(final SubLObject new_term, final SubLObject arg_position, final SubLObject formula) {
        return formula_arg_position_nsubst(new_term, arg_position, el_utilities.copy_expression(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 66521L)
    public static SubLObject formula_arg_position_nsubst(final SubLObject new_term, final SubLObject arg_position, final SubLObject formula) {
        if (cycl_utilities.NIL == arg_position) {
            return (SubLObject)cycl_utilities.NIL;
        }
        if (cycl_utilities.NIL != list_utilities.singletonP(arg_position)) {
            return el_utilities.nreplace_formula_arg(arg_position.first(), new_term, formula);
        }
        formula_arg_position_nsubst(new_term, arg_position.rest(), formula_arg(formula, arg_position.first(), (SubLObject)cycl_utilities.UNPROVIDED));
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 66959L)
    public static SubLObject permute_formula(final SubLObject source_formula, final SubLObject argnums_to_permute, final SubLObject argnum_permutation) {
        SubLObject target_formula = el_utilities.copy_formula(source_formula);
        SubLObject list_var = (SubLObject)cycl_utilities.NIL;
        SubLObject target_argnum = (SubLObject)cycl_utilities.NIL;
        SubLObject index = (SubLObject)cycl_utilities.NIL;
        list_var = argnum_permutation;
        target_argnum = list_var.first();
        for (index = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL != list_var; list_var = list_var.rest(), target_argnum = list_var.first(), index = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, index)) {
            final SubLObject source_argnum = ConsesLow.nth(index, argnums_to_permute);
            final SubLObject target_term = formula_arg(source_formula, source_argnum, (SubLObject)cycl_utilities.UNPROVIDED);
            target_formula = el_utilities.nreplace_formula_arg(target_argnum, target_term, target_formula);
        }
        return target_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 67434L)
    public static SubLObject formula_permutations(final SubLObject source_formula, final SubLObject argnums_to_permute) {
        SubLObject target_formulas = (SubLObject)cycl_utilities.NIL;
        SubLObject cdolist_list_var;
        final SubLObject argnum_permutations = cdolist_list_var = permute_list_cached(argnums_to_permute);
        SubLObject argnum_permutation = (SubLObject)cycl_utilities.NIL;
        argnum_permutation = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            final SubLObject target_formula = permute_formula(source_formula, argnums_to_permute, argnum_permutation);
            target_formulas = (SubLObject)ConsesLow.cons(target_formula, target_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            argnum_permutation = cdolist_list_var.first();
        }
        return Sequences.nreverse(target_formulas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 67877L)
    public static SubLObject formulas_permutations(final SubLObject source_formulas, final SubLObject argnums_to_permute) {
        SubLObject target_formulas = (SubLObject)cycl_utilities.NIL;
        SubLObject cdolist_list_var = source_formulas;
        SubLObject source_formula = (SubLObject)cycl_utilities.NIL;
        source_formula = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            target_formulas = ConsesLow.nconc(formula_permutations(source_formula, argnums_to_permute), target_formulas);
            cdolist_list_var = cdolist_list_var.rest();
            source_formula = cdolist_list_var.first();
        }
        return Sequences.delete_duplicates(target_formulas, Symbols.symbol_function((SubLObject)cycl_utilities.EQUAL), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 68225L)
    public static SubLObject formula_arg_permutations(final SubLObject source_formula) {
        SubLObject target_formulas = (SubLObject)ConsesLow.list(el_utilities.copy_formula(source_formula));
        SubLObject argnum = (SubLObject)cycl_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(source_formula, (SubLObject)cycl_utilities.$kw24$IGNORE);
        SubLObject arg = (SubLObject)cycl_utilities.NIL;
        arg = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)cycl_utilities.ONE_INTEGER);
            if (cycl_utilities.NIL == el_utilities.subl_escape_p(arg)) {
                if (cycl_utilities.NIL != term.nautP(arg, (SubLObject)cycl_utilities.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$8 = nat_commutative_permutations(arg);
                    SubLObject arg_permutation = (SubLObject)cycl_utilities.NIL;
                    arg_permutation = cdolist_list_var_$8.first();
                    while (cycl_utilities.NIL != cdolist_list_var_$8) {
                        if (!arg_permutation.equal(arg)) {
                            target_formulas = (SubLObject)ConsesLow.cons(el_utilities.nreplace_formula_arg(argnum, arg_permutation, el_utilities.copy_formula(source_formula)), target_formulas);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        arg_permutation = cdolist_list_var_$8.first();
                    }
                }
                else if (cycl_utilities.NIL != el_utilities.el_relation_expressionP(arg)) {
                    SubLObject cdolist_list_var_$9 = formula_commutative_permutations(arg, (SubLObject)cycl_utilities.T);
                    SubLObject formula_permutation = (SubLObject)cycl_utilities.NIL;
                    formula_permutation = cdolist_list_var_$9.first();
                    while (cycl_utilities.NIL != cdolist_list_var_$9) {
                        if (!formula_permutation.equal(arg)) {
                            target_formulas = (SubLObject)ConsesLow.cons(el_utilities.nreplace_formula_arg(argnum, formula_permutation, el_utilities.copy_formula(source_formula)), target_formulas);
                        }
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        formula_permutation = cdolist_list_var_$9.first();
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return target_formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 69164L)
    public static SubLObject nat_commutative_permutations(final SubLObject nat) {
        SubLObject permutations = (SubLObject)cycl_utilities.NIL;
        final SubLObject function = nat_functor(nat);
        if (cycl_utilities.NIL != czer_main.unary_function_commutes_with_its_argumentP(nat)) {
            final SubLObject inner_func = nat_functor(nat_arg1(nat, (SubLObject)cycl_utilities.UNPROVIDED));
            final SubLObject arg = nat_arg1(nat_arg1(nat, (SubLObject)cycl_utilities.UNPROVIDED), (SubLObject)cycl_utilities.UNPROVIDED);
            permutations = (SubLObject)ConsesLow.cons(nat, permutations);
            permutations = (SubLObject)ConsesLow.cons(el_utilities.make_unary_nat_formula(inner_func, el_utilities.make_unary_nat_formula(function, arg)), permutations);
        }
        else if (cycl_utilities.NIL != kb_accessors.commutative_functionP(function) || cycl_utilities.NIL != fort_types_interface.partially_commutative_relation_p(function)) {
            permutations = formula_commutative_permutations(nat, (SubLObject)cycl_utilities.T);
        }
        return permutations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 69758L)
    public static SubLObject clear_permute_list_cached() {
        final SubLObject cs = cycl_utilities.$permute_list_cached_caching_state$.getGlobalValue();
        if (cycl_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 69758L)
    public static SubLObject remove_permute_list_cached(final SubLObject list) {
        return memoization_state.caching_state_remove_function_results_with_args(cycl_utilities.$permute_list_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(list), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 69758L)
    public static SubLObject permute_list_cached_internal(final SubLObject list) {
        return list_utilities.permute_list(list, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 69758L)
    public static SubLObject permute_list_cached(final SubLObject list) {
        SubLObject caching_state = cycl_utilities.$permute_list_cached_caching_state$.getGlobalValue();
        if (cycl_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cycl_utilities.$sym37$PERMUTE_LIST_CACHED, (SubLObject)cycl_utilities.$sym38$_PERMUTE_LIST_CACHED_CACHING_STATE_, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.EQUAL, (SubLObject)cycl_utilities.ONE_INTEGER, (SubLObject)cycl_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, list, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(permute_list_cached_internal(list)));
            memoization_state.caching_state_put(caching_state, list, results, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 69852L)
    public static SubLObject formula_commutative_permutations(final SubLObject formula, SubLObject penetrate_argsP) {
        if (penetrate_argsP == cycl_utilities.UNPROVIDED) {
            penetrate_argsP = (SubLObject)cycl_utilities.NIL;
        }
        SubLObject target_formulas = (SubLObject)((cycl_utilities.NIL != penetrate_argsP) ? formula_arg_permutations(formula) : ConsesLow.list(formula));
        SubLObject cdolist_list_var = czer_main.commutative_argnums(formula);
        SubLObject argnums_to_permute = (SubLObject)cycl_utilities.NIL;
        argnums_to_permute = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            target_formulas = formulas_permutations(target_formulas, argnums_to_permute);
            cdolist_list_var = cdolist_list_var.rest();
            argnums_to_permute = cdolist_list_var.first();
        }
        return Sequences.nreverse(target_formulas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 70520L)
    public static SubLObject canonical_commutative_permutations(final SubLObject formula, SubLObject varP, SubLObject penetrate_argsP) {
        if (varP == cycl_utilities.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)cycl_utilities.$sym35$CYC_VAR_);
        }
        if (penetrate_argsP == cycl_utilities.UNPROVIDED) {
            penetrate_argsP = (SubLObject)cycl_utilities.NIL;
        }
        if (cycl_utilities.NIL != el_utilities.groundP(formula, varP)) {
            return (SubLObject)ConsesLow.list(czer_main.canonicalize_literal_commutative_terms(formula));
        }
        final SubLObject variable_argnums = variable_argnums(formula, varP);
        SubLObject target_formulas = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL == penetrate_argsP && cycl_utilities.NIL == variable_argnums) {
            target_formulas = (SubLObject)ConsesLow.list(czer_main.canonicalize_literal_commutative_args(formula));
            return target_formulas;
        }
        if (cycl_utilities.NIL != penetrate_argsP && cycl_utilities.NIL == variable_argnums) {
            target_formulas = args_canonical_commutative_permutations(czer_main.canonicalize_literal_commutative_terms(formula), varP);
            return Sequences.nreverse(target_formulas);
        }
        if (cycl_utilities.NIL != penetrate_argsP && cycl_utilities.NIL != variable_argnums) {
            target_formulas = args_canonical_commutative_permutations(czer_main.canonicalize_literal_commutative_terms(formula), varP);
        }
        else {
            target_formulas = (SubLObject)ConsesLow.list(czer_main.canonicalize_literal_commutative_args(formula));
        }
        target_formulas = formulas_canonical_permutations(target_formulas);
        return Sequences.nreverse(target_formulas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 71997L)
    public static SubLObject variable_argnums(final SubLObject formula, SubLObject varP) {
        if (varP == cycl_utilities.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)cycl_utilities.$sym35$CYC_VAR_);
        }
        if (cycl_utilities.NIL != el_utilities.groundP(formula, varP)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        SubLObject argnums = (SubLObject)cycl_utilities.NIL;
        SubLObject argnum = (SubLObject)cycl_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(formula, (SubLObject)cycl_utilities.$kw24$IGNORE);
        SubLObject arg = (SubLObject)cycl_utilities.NIL;
        arg = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)cycl_utilities.ONE_INTEGER);
            if (cycl_utilities.NIL != Functions.funcall(varP, arg)) {
                argnums = (SubLObject)ConsesLow.cons(argnum, argnums);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return argnums;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 72265L)
    public static SubLObject args_canonical_commutative_permutations(final SubLObject formula, final SubLObject varP) {
        SubLObject target_formulas = (SubLObject)ConsesLow.list(el_utilities.copy_formula(formula));
        SubLObject argnum = (SubLObject)cycl_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = formula_args(formula, (SubLObject)cycl_utilities.$kw24$IGNORE);
        SubLObject arg = (SubLObject)cycl_utilities.NIL;
        arg = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)cycl_utilities.ONE_INTEGER);
            if (cycl_utilities.NIL == el_utilities.subl_escape_p(arg)) {
                if (cycl_utilities.NIL != term.nautP(arg, varP)) {
                    SubLObject cdolist_list_var_$10 = nat_canonical_commutative_permutations(arg, varP);
                    SubLObject arg_permutation = (SubLObject)cycl_utilities.NIL;
                    arg_permutation = cdolist_list_var_$10.first();
                    while (cycl_utilities.NIL != cdolist_list_var_$10) {
                        if (!arg_permutation.equal(arg)) {
                            target_formulas = (SubLObject)ConsesLow.cons(el_utilities.nreplace_formula_arg(argnum, arg_permutation, el_utilities.copy_formula(formula)), target_formulas);
                        }
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        arg_permutation = cdolist_list_var_$10.first();
                    }
                }
                else if (cycl_utilities.NIL != el_utilities.el_relation_expressionP(arg)) {
                    SubLObject cdolist_list_var_$11 = canonical_commutative_permutations(arg, varP, (SubLObject)cycl_utilities.T);
                    SubLObject formula_permutation = (SubLObject)cycl_utilities.NIL;
                    formula_permutation = cdolist_list_var_$11.first();
                    while (cycl_utilities.NIL != cdolist_list_var_$11) {
                        if (!formula_permutation.equal(arg)) {
                            target_formulas = (SubLObject)ConsesLow.cons(el_utilities.nreplace_formula_arg(argnum, formula_permutation, el_utilities.copy_formula(formula)), target_formulas);
                        }
                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        formula_permutation = cdolist_list_var_$11.first();
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return target_formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 73227L)
    public static SubLObject formulas_canonical_permutations(final SubLObject source_formulas) {
        SubLObject target_formulas = (SubLObject)cycl_utilities.NIL;
        SubLObject permutedP = (SubLObject)cycl_utilities.NIL;
        SubLObject cdolist_list_var = source_formulas;
        SubLObject source_formula = (SubLObject)cycl_utilities.NIL;
        source_formula = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12 = czer_main.commutative_argnums(source_formula);
            SubLObject commutative_argnums = (SubLObject)cycl_utilities.NIL;
            commutative_argnums = cdolist_list_var_$12.first();
            while (cycl_utilities.NIL != cdolist_list_var_$12) {
                final SubLObject variable_argnums = variable_argnums(source_formula, (SubLObject)cycl_utilities.UNPROVIDED);
                final SubLObject argnums_to_permute = keyhash_utilities.fast_intersection(commutative_argnums, variable_argnums, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
                SubLObject other_argnums = (SubLObject)cycl_utilities.NIL;
                SubLObject argnum_permutations = (SubLObject)cycl_utilities.NIL;
                if (cycl_utilities.NIL != argnums_to_permute) {
                    other_argnums = Sequences.nreverse(conses_high.set_difference(commutative_argnums, argnums_to_permute, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED));
                    argnum_permutations = permutations_merge(other_argnums, argnums_to_permute);
                    permutedP = (SubLObject)cycl_utilities.T;
                    SubLObject cdolist_list_var_$13 = argnum_permutations;
                    SubLObject argnum_permutation = (SubLObject)cycl_utilities.NIL;
                    argnum_permutation = cdolist_list_var_$13.first();
                    while (cycl_utilities.NIL != cdolist_list_var_$13) {
                        target_formulas = (SubLObject)ConsesLow.cons(canonical_permute_formula(source_formula, commutative_argnums, argnum_permutation), target_formulas);
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        argnum_permutation = cdolist_list_var_$13.first();
                    }
                }
                else {
                    target_formulas = (SubLObject)ConsesLow.cons(source_formula, target_formulas);
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                commutative_argnums = cdolist_list_var_$12.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            source_formula = cdolist_list_var.first();
        }
        if (cycl_utilities.NIL != permutedP) {
            return Sequences.delete_duplicates(target_formulas, Symbols.symbol_function((SubLObject)cycl_utilities.EQUAL), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return source_formulas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 74205L)
    public static SubLObject canonical_permute_formula(final SubLObject source_formula, final SubLObject argnums_to_permute, final SubLObject argnum_permutation) {
        SubLObject target_formula = el_utilities.copy_formula(source_formula);
        SubLObject list_var = (SubLObject)cycl_utilities.NIL;
        SubLObject source_argnum = (SubLObject)cycl_utilities.NIL;
        SubLObject index = (SubLObject)cycl_utilities.NIL;
        list_var = argnum_permutation;
        source_argnum = list_var.first();
        for (index = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL != list_var; list_var = list_var.rest(), source_argnum = list_var.first(), index = Numbers.add((SubLObject)cycl_utilities.ONE_INTEGER, index)) {
            final SubLObject target_argnum = ConsesLow.nth(index, argnums_to_permute);
            if (!target_argnum.eql(source_argnum)) {
                final SubLObject target_term = formula_arg(source_formula, source_argnum, (SubLObject)cycl_utilities.UNPROVIDED);
                target_formula = el_utilities.nreplace_formula_arg(target_argnum, target_term, target_formula);
            }
        }
        return target_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 74750L)
    public static SubLObject nat_canonical_commutative_permutations(final SubLObject nat, final SubLObject varP) {
        SubLObject permutations = (SubLObject)cycl_utilities.NIL;
        final SubLObject function = nat_functor(nat);
        if (cycl_utilities.NIL != kb_accessors.commutative_functionP(function) || cycl_utilities.NIL != fort_types_interface.partially_commutative_relation_p(function)) {
            permutations = canonical_commutative_permutations(nat, varP, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return permutations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 75072L)
    public static SubLObject split_list_set(final SubLObject l) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject splits = (SubLObject)ConsesLow.list(reader.bq_cons(l, (SubLObject)cycl_utilities.$list39));
        SubLObject end_var;
        SubLObject length;
        SubLObject i;
        SubLObject list1;
        SubLObject list2;
        for (length = (end_var = Sequences.length(l)), i = (SubLObject)cycl_utilities.NIL, i = (SubLObject)cycl_utilities.ONE_INTEGER; !i.numGE(end_var); i = number_utilities.f_1X(i)) {
            thread.resetMultipleValues();
            list1 = list_utilities.split_list(l, i);
            list2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            splits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(list1, list2), splits);
        }
        return splits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 75316L)
    public static SubLObject permutations_merge(final SubLObject list1, final SubLObject list2) {
        SubLObject merged = (SubLObject)cycl_utilities.NIL;
        final SubLObject permutations = list_utilities.permute_list(list2, (SubLObject)cycl_utilities.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject list1_splits = cdolist_list_var = split_list_set(list1);
        SubLObject list1_split = (SubLObject)cycl_utilities.NIL;
        list1_split = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = list1_split;
            SubLObject front1 = (SubLObject)cycl_utilities.NIL;
            SubLObject rest1 = (SubLObject)cycl_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycl_utilities.$list40);
            front1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycl_utilities.$list40);
            rest1 = current.first();
            current = current.rest();
            if (cycl_utilities.NIL == current) {
                SubLObject cdolist_list_var_$14 = permutations;
                SubLObject permutation = (SubLObject)cycl_utilities.NIL;
                permutation = cdolist_list_var_$14.first();
                while (cycl_utilities.NIL != cdolist_list_var_$14) {
                    SubLObject cdolist_list_var_$15;
                    final SubLObject list2_splits = cdolist_list_var_$15 = split_list_set(permutation);
                    SubLObject list2_split = (SubLObject)cycl_utilities.NIL;
                    list2_split = cdolist_list_var_$15.first();
                    while (cycl_utilities.NIL != cdolist_list_var_$15) {
                        SubLObject current_$17;
                        final SubLObject datum_$16 = current_$17 = list2_split;
                        SubLObject front2 = (SubLObject)cycl_utilities.NIL;
                        SubLObject rest2 = (SubLObject)cycl_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, (SubLObject)cycl_utilities.$list41);
                        front2 = current_$17.first();
                        current_$17 = current_$17.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, (SubLObject)cycl_utilities.$list41);
                        rest2 = current_$17.first();
                        current_$17 = current_$17.rest();
                        if (cycl_utilities.NIL == current_$17) {
                            merged = (SubLObject)ConsesLow.cons(ConsesLow.append(front1, front2, rest1, rest2), merged);
                            merged = (SubLObject)ConsesLow.cons(ConsesLow.append(front2, front1, rest2, rest1), merged);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$16, (SubLObject)cycl_utilities.$list41);
                        }
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        list2_split = cdolist_list_var_$15.first();
                    }
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    permutation = cdolist_list_var_$14.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cycl_utilities.$list40);
            }
            cdolist_list_var = cdolist_list_var.rest();
            list1_split = cdolist_list_var.first();
        }
        return Sequences.delete_duplicates(merged, Symbols.symbol_function((SubLObject)cycl_utilities.EQUAL), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 75905L)
    public static SubLObject formula_operator_recursive(final SubLObject formula) {
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        final SubLObject result = formula_operator(formula);
        if (cycl_utilities.NIL != forts.fort_p(result)) {
            return result;
        }
        if (cycl_utilities.NIL != el_utilities.el_formula_p(result)) {
            return formula_operator(result);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 76333L)
    public static SubLObject rename_default_el_vars_int(final SubLObject expression, final SubLObject destructiveP) {
        final SubLObject default_el_vars = clausifier.sort_vars(expression_gather(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym42$DEFAULT_EL_VAR_), (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED));
        final SubLObject already_renamed_default_el_vars = clausifier.sort_vars(expression_gather(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym43$RENAMED_DEFAULT_EL_VAR_P), (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED));
        final SubLObject max_renamed_default_el_var_num = list_utilities.safe_max(already_renamed_default_el_vars, (SubLObject)cycl_utilities.MINUS_ONE_INTEGER);
        SubLObject curr_renamed_default_el_var_num = number_utilities.f_1X(max_renamed_default_el_var_num);
        SubLObject alist = (SubLObject)cycl_utilities.NIL;
        SubLObject cdolist_list_var = default_el_vars;
        SubLObject var = (SubLObject)cycl_utilities.NIL;
        var = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var, get_renamed_default_el_var(curr_renamed_default_el_var_num)), alist);
            curr_renamed_default_el_var_num = Numbers.add(curr_renamed_default_el_var_num, (SubLObject)cycl_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return (cycl_utilities.NIL != destructiveP) ? expression_nsublis(alist, expression, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED) : expression_sublis(alist, expression, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 77113L)
    public static SubLObject rename_default_el_vars(final SubLObject expression) {
        return rename_default_el_vars_int(expression, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 77270L)
    public static SubLObject rename_default_el_vars_destructive(final SubLObject expression) {
        return rename_default_el_vars_int(expression, (SubLObject)cycl_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 77448L)
    public static SubLObject unrename_default_el_vars_int(final SubLObject expression, final SubLObject destructiveP) {
        final SubLObject renamed_default_el_vars = clausifier.sort_vars(expression_gather(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym43$RENAMED_DEFAULT_EL_VAR_P), (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED));
        final SubLObject default_el_vars = clausifier.sort_vars(expression_gather(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym42$DEFAULT_EL_VAR_), (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED));
        final SubLObject max_default_el_var_num = list_utilities.safe_max(default_el_vars, (SubLObject)cycl_utilities.MINUS_ONE_INTEGER);
        SubLObject curr_default_el_var_num = number_utilities.f_1X(max_default_el_var_num);
        SubLObject alist = (SubLObject)cycl_utilities.NIL;
        SubLObject cdolist_list_var = renamed_default_el_vars;
        SubLObject var = (SubLObject)cycl_utilities.NIL;
        var = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var, variables.get_default_el_var(curr_default_el_var_num)), alist);
            curr_default_el_var_num = Numbers.add(curr_default_el_var_num, (SubLObject)cycl_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return (cycl_utilities.NIL != destructiveP) ? expression_nsublis(alist, expression, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED) : expression_sublis(alist, expression, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 78212L)
    public static SubLObject unrename_default_el_vars(final SubLObject expression) {
        return unrename_default_el_vars_int(expression, (SubLObject)cycl_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 78420L)
    public static SubLObject unrename_default_el_vars_destructive(final SubLObject expression) {
        return unrename_default_el_vars_int(expression, (SubLObject)cycl_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 78739L)
    public static SubLObject renamed_default_el_var_num(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.NIL != cycl_variables.el_varP(v_object)) {
            final SubLObject name = cycl_variables.el_var_name(v_object);
            if (name.isString() && cycl_utilities.NIL != string_utilities.starts_with(name, cycl_utilities.$renamed_default_el_var_prefix$.getDynamicValue(thread))) {
                final SubLObject tail = string_utilities.substring(name, Sequences.length(cycl_utilities.$renamed_default_el_var_prefix$.getDynamicValue(thread)), (SubLObject)cycl_utilities.UNPROVIDED);
                return string_utilities.string_to_integer(tail);
            }
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 79142L)
    public static SubLObject renamed_default_el_var_p(final SubLObject v_object) {
        return Types.integerp(renamed_default_el_var_num(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 79311L)
    public static SubLObject get_renamed_default_el_var(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cycl_variables.make_el_var(Sequences.cconcatenate(cycl_utilities.$renamed_default_el_var_prefix$.getDynamicValue(thread), string_utilities.object_to_string(num)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 80393L)
    public static SubLObject non_indexed_fort_p(final SubLObject fort) {
        assert cycl_utilities.NIL != forts.fort_p(fort) : fort;
        return subl_promotions.memberP(fort, cycl_utilities.$non_indexed_constants$.getGlobalValue(), Symbols.symbol_function((SubLObject)cycl_utilities.$sym45$KBEQ), (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 80616L)
    public static SubLObject fort_or_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != forts.fort_p(v_object) || (cycl_utilities.NIL != el_utilities.possibly_naut_p(v_object) && cycl_utilities.NIL != fort_types_interface.functorP(nat_functor(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 81155L)
    public static SubLObject fort_or_possibly_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != forts.fort_p(v_object) || cycl_utilities.NIL != el_utilities.possibly_naut_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 81265L)
    public static SubLObject naut_substitute(final SubLObject v_object) {
        return expression_transform(v_object, (SubLObject)cycl_utilities.$sym23$NART_P, (SubLObject)cycl_utilities.$sym46$NART_EL_FORMULA, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 81427L)
    public static SubLObject collection_intersection_natP(final SubLObject v_object) {
        if (cycl_utilities.NIL != cycl_grammar.cycl_nat_p(v_object)) {
            final SubLObject functor = nat_functor(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(functor.eql(cycl_utilities.$const47$CollectionIntersectionFn) || functor.eql(cycl_utilities.$const48$CollectionIntersection2Fn));
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 81745L)
    public static SubLObject collection_union_natP(final SubLObject v_object) {
        return cycl_nat_with_functor_p(v_object, cycl_utilities.$const49$CollectionUnionFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 81854L)
    public static SubLObject collection_intersection(final SubLObject collections) {
        final SubLObject pcase_var = Sequences.length(collections);
        if (pcase_var.eql((SubLObject)cycl_utilities.ZERO_INTEGER)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        if (pcase_var.eql((SubLObject)cycl_utilities.ONE_INTEGER)) {
            return collections.first();
        }
        return (SubLObject)ConsesLow.list(cycl_utilities.$const47$CollectionIntersectionFn, (SubLObject)ConsesLow.cons(cycl_utilities.$const50$TheSet, collections));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 82221L)
    public static SubLObject collection_union(final SubLObject collections) {
        final SubLObject pcase_var = Sequences.length(collections);
        if (pcase_var.eql((SubLObject)cycl_utilities.ZERO_INTEGER)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        if (pcase_var.eql((SubLObject)cycl_utilities.ONE_INTEGER)) {
            return collections.first();
        }
        return (SubLObject)ConsesLow.list(cycl_utilities.$const49$CollectionUnionFn, (SubLObject)ConsesLow.cons(cycl_utilities.$const50$TheSet, collections));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 82567L)
    public static SubLObject collection_intersection_intersectees(final SubLObject collection_intersection_nat) {
        assert cycl_utilities.NIL != collection_intersection_natP(collection_intersection_nat) : collection_intersection_nat;
        final SubLObject pcase_var = nat_functor(collection_intersection_nat);
        if (pcase_var.eql(cycl_utilities.$const47$CollectionIntersectionFn)) {
            return quantities.set_extent(nat_arg1(collection_intersection_nat, (SubLObject)cycl_utilities.UNPROVIDED), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        if (pcase_var.eql(cycl_utilities.$const48$CollectionIntersection2Fn)) {
            return nat_args(collection_intersection_nat, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 82567L)
    public static SubLObject collection_union_united_collections(final SubLObject collection_union_nat) {
        assert cycl_utilities.NIL != collection_union_natP(collection_union_nat) : collection_union_nat;
        return quantities.set_extent(nat_arg1(collection_union_nat, (SubLObject)cycl_utilities.UNPROVIDED), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 83344L)
    public static SubLObject find_denotational_term(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!string.isString()) {
            return (SubLObject)cycl_utilities.NIL;
        }
        if (cycl_utilities.NIL != constants_high.find_constant(string)) {
            return constants_high.find_constant(string);
        }
        final SubLObject _prev_bind_0 = reader.$read_eval$.currentBinding(thread);
        try {
            reader.$read_eval$.bind((SubLObject)cycl_utilities.NIL, thread);
            final SubLObject clipped_string = (cycl_utilities.NIL != list_utilities.lengthG(string, (SubLObject)cycl_utilities.$int53$5000, (SubLObject)cycl_utilities.UNPROVIDED)) ? Sequences.subseq(string, (SubLObject)cycl_utilities.ZERO_INTEGER, (SubLObject)cycl_utilities.$int53$5000) : string;
            final SubLObject v_term = reader.read_from_string_ignoring_errors(string_utilities.cyclify_string(clipped_string), (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
            final SubLObject denotational_term = (SubLObject)((cycl_utilities.NIL != cycl_grammar.cycl_denotational_term_p(v_term)) ? czer_main.canonicalize_term(v_term, (SubLObject)cycl_utilities.UNPROVIDED) : cycl_utilities.NIL);
            return denotational_term;
        }
        finally {
            reader.$read_eval$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 84103L)
    public static SubLObject denotational_term_name(final SubLObject cycl) {
        if (cycl_utilities.NIL != constant_handles.constant_p(cycl)) {
            return constants_high.constant_name(cycl);
        }
        if (cycl_utilities.NIL != nart_handles.nart_p(cycl)) {
            return string_utilities.string_substitute((SubLObject)cycl_utilities.$str55$, (SubLObject)cycl_utilities.$str56$__, string_utilities.object_to_string(narts_high.nart_el_formula(cycl)), (SubLObject)cycl_utilities.UNPROVIDED);
        }
        if (cycl_utilities.NIL != narts_high.naut_p(cycl)) {
            return string_utilities.string_substitute((SubLObject)cycl_utilities.$str55$, (SubLObject)cycl_utilities.$str56$__, string_utilities.object_to_string(cycl), (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return string_utilities.object_to_string(cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 84419L)
    public static SubLObject denotational_term_name_for_alpha_sort(final SubLObject value) {
        return string_utilities.do_string_substitutions_robust(denotational_term_name(value), (SubLObject)cycl_utilities.$list57, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 84969L)
    public static SubLObject sorted_constant_list(final SubLObject expression) {
        return Sort.sort(constant_list(expression, (SubLObject)cycl_utilities.NIL), Symbols.symbol_function((SubLObject)cycl_utilities.$sym58$CONSTANT_EXTERNAL_ID__), (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 85268L)
    public static SubLObject sorted_constant_external_id_list(final SubLObject expression) {
        return Sort.sort(Mapping.mapcar(Symbols.symbol_function((SubLObject)cycl_utilities.$sym59$CONSTANT_EXTERNAL_ID), constant_list(expression, (SubLObject)cycl_utilities.NIL)), Symbols.symbol_function((SubLObject)cycl_utilities.$sym60$GUID_), (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 85534L)
    public static SubLObject sorted_constant_internal_id_list(final SubLObject expression) {
        return Sort.sort(Mapping.mapcar(Symbols.symbol_function((SubLObject)cycl_utilities.$sym61$CONSTANT_INTERNAL_ID), constant_list(expression, (SubLObject)cycl_utilities.NIL)), Symbols.symbol_function((SubLObject)cycl_utilities.$sym62$_), (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 85796L)
    public static SubLObject constant_list(final SubLObject expression, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == cycl_utilities.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)cycl_utilities.T;
        }
        return expression_gather(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym22$CONSTANT_P), penetrate_hl_structuresP, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 86038L)
    public static SubLObject sorted_nat_list(final SubLObject expression) {
        return Sort.sort(nat_list(expression), Symbols.symbol_function((SubLObject)cycl_utilities.$sym62$_), Symbols.symbol_function((SubLObject)cycl_utilities.$sym63$NART_ID));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 86230L)
    public static SubLObject nat_list(final SubLObject expression) {
        return expression_gather(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym23$NART_P), (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 86396L)
    public static SubLObject sorted_assertion_list(final SubLObject expression) {
        return assertion_utilities.sort_assertions(assertion_list(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 86609L)
    public static SubLObject assertion_list(final SubLObject expression) {
        return expression_gather(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym18$ASSERTION_P), (SubLObject)cycl_utilities.T, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 86792L)
    public static SubLObject sorted_fort_id_list(final SubLObject expression) {
        return Sort.sort(Mapping.mapcar(Symbols.symbol_function((SubLObject)cycl_utilities.$sym64$FORT_INTERNAL_ID), list_utilities.tree_gather(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym21$FORT_P), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED)), Symbols.symbol_function((SubLObject)cycl_utilities.$sym62$_), (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 87000L)
    public static SubLObject functional_in_some_argP(final SubLObject pred) {
        assert cycl_utilities.NIL != somewhere_cache.valid_somewhere_cache_itemP(pred) : pred;
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != somewhere_cache.some_pred_assertion_somewhereP(cycl_utilities.$const66$functionalInArgs, pred, (SubLObject)cycl_utilities.ONE_INTEGER, (SubLObject)cycl_utilities.UNPROVIDED) || cycl_utilities.NIL != somewhere_cache.some_pred_assertion_somewhereP(cycl_utilities.$const67$strictlyFunctionalInArgs, pred, (SubLObject)cycl_utilities.ONE_INTEGER, (SubLObject)cycl_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 87311L)
    public static SubLObject functional_in_arg_positions_internal(final SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == cycl_utilities.UNPROVIDED) {
            assume_pred_has_functional_argsP = (SubLObject)cycl_utilities.NIL;
        }
        assert cycl_utilities.NIL != kb_indexing_datastructures.indexed_term_p(pred) : pred;
        if (cycl_utilities.NIL == assume_pred_has_functional_argsP && cycl_utilities.NIL != somewhere_cache.valid_somewhere_cache_itemP(pred) && cycl_utilities.NIL == functional_in_some_argP(pred)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        if (cycl_utilities.NIL != forts.fort_p(pred)) {
            return list_utilities.fast_delete_duplicates(ConsesLow.append(kb_mapping_utilities.pred_values_in_any_mt(pred, cycl_utilities.$const66$functionalInArgs, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED), kb_mapping_utilities.pred_values_in_any_mt(pred, cycl_utilities.$const67$strictlyFunctionalInArgs, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED)), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 87311L)
    public static SubLObject functional_in_arg_positions(final SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == cycl_utilities.UNPROVIDED) {
            assume_pred_has_functional_argsP = (SubLObject)cycl_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL == v_memoization_state) {
            return functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)cycl_utilities.$sym68$FUNCTIONAL_IN_ARG_POSITIONS, (SubLObject)cycl_utilities.UNPROVIDED);
        if (cycl_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)cycl_utilities.$sym68$FUNCTIONAL_IN_ARG_POSITIONS, (SubLObject)cycl_utilities.TWO_INTEGER, (SubLObject)cycl_utilities.$int70$100, (SubLObject)cycl_utilities.EQL, (SubLObject)cycl_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)cycl_utilities.$sym68$FUNCTIONAL_IN_ARG_POSITIONS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, assume_pred_has_functional_argsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)cycl_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)cycl_utilities.NIL;
            collision = cdolist_list_var.first();
            while (cycl_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cycl_utilities.NIL != cached_args && cycl_utilities.NIL == cached_args.rest() && assume_pred_has_functional_argsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, assume_pred_has_functional_argsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 87901L)
    public static SubLObject strictly_functional_in_some_argP(final SubLObject pred) {
        assert cycl_utilities.NIL != somewhere_cache.valid_somewhere_cache_itemP(pred) : pred;
        return somewhere_cache.some_pred_assertion_somewhereP(cycl_utilities.$const67$strictlyFunctionalInArgs, pred, (SubLObject)cycl_utilities.ONE_INTEGER, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 88151L)
    public static SubLObject strictly_functional_in_arg_positions_internal(final SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == cycl_utilities.UNPROVIDED) {
            assume_pred_has_functional_argsP = (SubLObject)cycl_utilities.NIL;
        }
        if (cycl_utilities.NIL == assume_pred_has_functional_argsP && cycl_utilities.NIL != somewhere_cache.valid_somewhere_cache_itemP(pred) && cycl_utilities.NIL == strictly_functional_in_some_argP(pred)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        if (cycl_utilities.NIL != forts.fort_p(pred)) {
            return list_utilities.fast_delete_duplicates(kb_mapping_utilities.pred_values_in_any_mt(pred, cycl_utilities.$const67$strictlyFunctionalInArgs, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 88151L)
    public static SubLObject strictly_functional_in_arg_positions(final SubLObject pred, SubLObject assume_pred_has_functional_argsP) {
        if (assume_pred_has_functional_argsP == cycl_utilities.UNPROVIDED) {
            assume_pred_has_functional_argsP = (SubLObject)cycl_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL == v_memoization_state) {
            return strictly_functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)cycl_utilities.$sym71$STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS, (SubLObject)cycl_utilities.UNPROVIDED);
        if (cycl_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)cycl_utilities.$sym71$STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS, (SubLObject)cycl_utilities.TWO_INTEGER, (SubLObject)cycl_utilities.$int70$100, (SubLObject)cycl_utilities.EQL, (SubLObject)cycl_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)cycl_utilities.$sym71$STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, assume_pred_has_functional_argsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)cycl_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)cycl_utilities.NIL;
            collision = cdolist_list_var.first();
            while (cycl_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cycl_utilities.NIL != cached_args && cycl_utilities.NIL == cached_args.rest() && assume_pred_has_functional_argsP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(strictly_functional_in_arg_positions_internal(pred, assume_pred_has_functional_argsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, assume_pred_has_functional_argsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 88659L)
    public static SubLObject nart_cons(final SubLObject nart) {
        return narts_high.nart_hl_formula(nart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 88916L)
    public static SubLObject lookup_all_narts(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)cycl_utilities.$sym72$OPAQUE_ARG_WRT_NAT_REIFICATION_, thread);
            result = expression_transform_if(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym23$NART_P), (SubLObject)cycl_utilities.$sym73$NART_LOOKUP, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 89340L)
    public static SubLObject reify_all_existing_narts(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind((SubLObject)cycl_utilities.$sym72$OPAQUE_ARG_WRT_NAT_REIFICATION_, thread);
            result = expression_transform_if_not(expression, Symbols.symbol_function((SubLObject)cycl_utilities.$sym74$NULL), (SubLObject)cycl_utilities.$sym75$EL_FIND_IF_NART, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 89804L)
    public static SubLObject opaque_arg_wrt_nat_reificationP(final SubLObject formula, final SubLObject argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != default_opaque_argP(formula, argnum) || cycl_utilities.NIL != el_utilities.arg_types_of_expression_prescribe_unreifiedP(formula, argnum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 89989L)
    public static SubLObject reify_arg_when_closed_naut(final SubLObject reln, final SubLObject psn) {
        final SubLObject v_object = formula_arg(reln, psn, (SubLObject)cycl_utilities.UNPROVIDED);
        if (cycl_utilities.NIL != el_utilities.arg_types_prescribe_unreifiedP(reln, psn)) {
            return v_object;
        }
        return reify_when_closed_naut(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 90195L)
    public static SubLObject reify_when_closed_naut(final SubLObject v_object) {
        if (cycl_utilities.NIL == el_utilities.possibly_naut_p(v_object)) {
            return v_object;
        }
        if (cycl_utilities.NIL != term.closed_nautP(v_object, (SubLObject)cycl_utilities.UNPROVIDED)) {
            final SubLObject cnat = narts_high.nart_substitute(v_object);
            if (cycl_utilities.NIL != cnat) {
                return cnat;
            }
            return v_object;
        }
        else {
            if (cycl_utilities.NIL != el_utilities.el_formulaP(v_object)) {
                SubLObject result = (SubLObject)cycl_utilities.NIL;
                SubLObject cdotimes_end_var;
                SubLObject psn;
                for (cdotimes_end_var = el_utilities.formula_length(v_object, (SubLObject)cycl_utilities.$kw24$IGNORE), psn = (SubLObject)cycl_utilities.NIL, psn = (SubLObject)cycl_utilities.ZERO_INTEGER; psn.numL(cdotimes_end_var); psn = Numbers.add(psn, (SubLObject)cycl_utilities.ONE_INTEGER)) {
                    result = (SubLObject)ConsesLow.cons(reify_arg_when_closed_naut(v_object, psn), result);
                }
                return Sequences.nreverse(result);
            }
            return v_object;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 90632L)
    public static SubLObject find_when_closed_naut(final SubLObject v_object) {
        if (cycl_utilities.NIL != term.closed_nautP(v_object, (SubLObject)cycl_utilities.UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(v_object);
            if (cycl_utilities.NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 90902L)
    public static SubLObject find_closed_naut(final SubLObject v_object) {
        if (cycl_utilities.NIL != term.closed_nautP(v_object, (SubLObject)cycl_utilities.UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(v_object);
            if (cycl_utilities.NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 91227L)
    public static SubLObject find_when_ground_naut(final SubLObject v_object) {
        if (cycl_utilities.NIL != term.ground_nautP(v_object, (SubLObject)cycl_utilities.UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(v_object);
            if (cycl_utilities.NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 91560L)
    public static SubLObject find_ground_naut(final SubLObject v_object) {
        if (cycl_utilities.NIL != term.ground_nautP(v_object, (SubLObject)cycl_utilities.UNPROVIDED)) {
            final SubLObject nat = narts_high.find_nart(v_object);
            return (SubLObject)((cycl_utilities.NIL != nart_handles.nart_p(nat)) ? nat : cycl_utilities.NIL);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 91871L)
    public static SubLObject ground_hl_formulaP(final SubLObject hl_formula) {
        return el_utilities.groundP(hl_formula, Symbols.symbol_function((SubLObject)cycl_utilities.$sym76$VARIABLE_P));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 91962L)
    public static SubLObject atomic_sentence_with_pred_p(final SubLObject asent, final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != el_utilities.possibly_atomic_sentence_p(asent) && cycl_utilities.NIL != kb_utilities.kbeq(pred, atomic_sentence_predicate(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 92259L)
    public static SubLObject atomic_sentence_with_any_of_preds_p(final SubLObject asent, final SubLObject preds) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != el_utilities.possibly_atomic_sentence_p(asent) && cycl_utilities.NIL != list_utilities.member_kbeqP(atomic_sentence_predicate(asent), preds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 92580L)
    public static SubLObject null_or_falseP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL == v_object || cycl_utilities.NIL != kb_utilities.kbeq(cycl_utilities.$const77$False, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 92676L)
    public static SubLObject possibly_cycl_formula_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != el_utilities.el_formula_p(v_object) || cycl_utilities.NIL != nart_handles.nart_p(v_object) || cycl_utilities.NIL != assertion_handles.assertion_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 93000L)
    public static SubLObject negatedP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && v_object.first().eql(cycl_utilities.$const78$not) && Sequences.length(v_object).numE((SubLObject)cycl_utilities.TWO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 93201L)
    public static SubLObject negate(final SubLObject form) {
        enforceType(form, cycl_utilities.$sym83$POSSIBLY_SENTENCE_OR_VARIABLE_P);
        if (cycl_utilities.NIL != negatedP(form)) {
            return formula_arg1(form, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(cycl_utilities.$const78$not, form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 93486L)
    public static SubLObject possibly_negate(final SubLObject sentence, final SubLObject truth) {
        assert cycl_utilities.NIL != enumeration_types.truth_p(truth) : truth;
        if (truth == cycl_utilities.$kw90$TRUE) {
            return sentence;
        }
        return negate(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 93735L)
    public static SubLObject formula_arg(final SubLObject formula, final SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        if (cycl_utilities.NIL == subl_promotions.non_negative_integer_p(argnum)) {
            return (SubLObject)cycl_utilities.NIL;
        }
        if (cycl_utilities.NIL != el_utilities.el_formula_p(formula)) {
            return el_formula_arg(formula, argnum, seqvar_handling);
        }
        if (cycl_utilities.NIL != nart_handles.nart_p(formula)) {
            return el_formula_arg(narts_high.nart_hl_formula(formula), argnum, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        if (cycl_utilities.NIL != assertions_high.gaf_assertionP(formula)) {
            return conses_high.copy_tree(el_formula_arg(assertions_high.gaf_el_formula(formula), argnum, (SubLObject)cycl_utilities.UNPROVIDED));
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_arg(fi.assertion_hl_formula(formula, (SubLObject)cycl_utilities.UNPROVIDED), argnum, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 95003L)
    public static SubLObject el_formula_arg(final SubLObject el_formula, final SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(el_formula) : el_formula;
        assert cycl_utilities.NIL != subl_promotions.non_negative_integer_p(argnum) : argnum;
        if (cycl_utilities.NIL != el_utilities.el_formula_arityGE(el_formula, argnum, seqvar_handling)) {
            return ConsesLow.nth(argnum, el_formula_terms(el_formula, seqvar_handling));
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 95760L)
    public static SubLObject el_formula_has_argP(final SubLObject el_formula, final SubLObject argnum, final SubLObject v_term) {
        return Equality.equal(v_term, el_formula_arg(el_formula, argnum, (SubLObject)cycl_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 95970L)
    public static SubLObject formula_arg0(final SubLObject formula) {
        if (cycl_utilities.NIL != el_utilities.el_formula_p(formula)) {
            return el_formula_operator(formula);
        }
        if (cycl_utilities.NIL != nart_handles.nart_p(formula)) {
            return el_formula_operator(narts_high.nart_hl_formula(formula));
        }
        if (cycl_utilities.NIL != assertions_high.gaf_assertionP(formula)) {
            return conses_high.copy_tree(el_formula_operator(assertions_high.gaf_el_formula(formula)));
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_operator(fi.assertion_hl_formula(formula, (SubLObject)cycl_utilities.UNPROVIDED));
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 96589L)
    public static SubLObject formula_operator(final SubLObject formula) {
        return formula_arg0(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 96786L)
    public static SubLObject el_formula_operator(final SubLObject el_formula) {
        assert cycl_utilities.NIL != el_utilities.el_formula_p(el_formula) : el_formula;
        return el_formula.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 96941L)
    public static SubLObject el_formula_arg1(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return el_formula_arg(el_formula, (SubLObject)cycl_utilities.ONE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 97121L)
    public static SubLObject el_formula_arg2(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return el_formula_arg(el_formula, (SubLObject)cycl_utilities.TWO_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 97301L)
    public static SubLObject el_formula_arg3(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return el_formula_arg(el_formula, (SubLObject)cycl_utilities.THREE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 97481L)
    public static SubLObject formula_arg1(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(formula, (SubLObject)cycl_utilities.ONE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 97691L)
    public static SubLObject formula_arg2(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(formula, (SubLObject)cycl_utilities.TWO_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 97900L)
    public static SubLObject formula_arg3(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(formula, (SubLObject)cycl_utilities.THREE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 98109L)
    public static SubLObject formula_arg4(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(formula, (SubLObject)cycl_utilities.FOUR_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 98318L)
    public static SubLObject formula_arg5(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(formula, (SubLObject)cycl_utilities.FIVE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 98527L)
    public static SubLObject formula_arg6(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(formula, (SubLObject)cycl_utilities.SIX_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 98736L)
    public static SubLObject formula_args(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        if (cycl_utilities.NIL != el_utilities.el_formula_p(formula)) {
            return el_formula_args(formula, seqvar_handling);
        }
        if (cycl_utilities.NIL != nart_handles.nart_p(formula)) {
            return el_formula_args(narts_high.nart_hl_formula(formula), (SubLObject)cycl_utilities.UNPROVIDED);
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_args(fi.assertion_hl_formula(formula, (SubLObject)cycl_utilities.UNPROVIDED), (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 99651L)
    public static SubLObject el_formula_args(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(el_formula) : el_formula;
        if (cycl_utilities.NIL != list_utilities.non_dotted_list_p(el_formula)) {
            return el_formula.rest();
        }
        return formula_terms_int(el_formula.rest(), seqvar_handling, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 100369L)
    public static SubLObject cycl_formula_args(final SubLObject cycl_sentence) {
        assert cycl_utilities.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : cycl_sentence;
        SubLObject formula = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        }
        else {
            formula = cycl_sentence;
        }
        return formula_args(formula, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 100753L)
    public static SubLObject cycl_formula_arg0(final SubLObject cycl_sentence) {
        assert cycl_utilities.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : cycl_sentence;
        SubLObject formula = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        }
        else {
            formula = cycl_sentence;
        }
        return formula_arg0(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 101145L)
    public static SubLObject cycl_formula_arg1(final SubLObject cycl_sentence) {
        assert cycl_utilities.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : cycl_sentence;
        SubLObject formula = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        }
        else {
            formula = cycl_sentence;
        }
        return formula_arg1(formula, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 101520L)
    public static SubLObject cycl_formula_arg2(final SubLObject cycl_sentence) {
        assert cycl_utilities.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : cycl_sentence;
        SubLObject formula = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        }
        else {
            formula = cycl_sentence;
        }
        return formula_arg2(formula, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 101895L)
    public static SubLObject cycl_formula_arg3(final SubLObject cycl_sentence) {
        assert cycl_utilities.NIL != cycl_grammar.cycl_sentence_p(cycl_sentence) : cycl_sentence;
        SubLObject formula = (SubLObject)cycl_utilities.NIL;
        if (cycl_utilities.NIL != assertion_handles.assertion_p(cycl_sentence)) {
            formula = assertions_high.assertion_formula(cycl_sentence);
        }
        else {
            formula = cycl_sentence;
        }
        return formula_arg3(formula, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 102272L)
    public static SubLObject formula_terms(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        if (cycl_utilities.NIL != el_utilities.el_formula_p(formula)) {
            return el_formula_terms(formula, seqvar_handling);
        }
        if (cycl_utilities.NIL != nart_handles.nart_p(formula)) {
            return el_formula_terms(narts_high.nart_hl_formula(formula), (SubLObject)cycl_utilities.UNPROVIDED);
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_terms(fi.assertion_hl_formula(formula, (SubLObject)cycl_utilities.UNPROVIDED), (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 103039L)
    public static SubLObject el_formula_terms(final SubLObject el_formula, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(el_formula) : el_formula;
        return formula_terms_int(el_formula, seqvar_handling, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 103507L)
    public static SubLObject formula_terms_int(final SubLObject formula, final SubLObject seqvar_handling, SubLObject force_one_passP) {
        if (force_one_passP == cycl_utilities.UNPROVIDED) {
            force_one_passP = (SubLObject)cycl_utilities.NIL;
        }
        if (cycl_utilities.NIL != force_one_passP) {
            return formula_terms_int_one_pass(formula, seqvar_handling);
        }
        return formula_terms_int_two_pass(formula, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 103751L)
    public static SubLObject formula_terms_int_two_pass(final SubLObject formula, final SubLObject seqvar_handling) {
        if (cycl_utilities.NIL != el_utilities.formula_with_sequence_termP(formula)) {
            return formula_terms_int_one_pass(formula, seqvar_handling);
        }
        if (formula.isCons()) {
            return formula;
        }
        return formula_terms_int_one_pass(formula, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 104288L)
    public static SubLObject formula_terms_int_one_pass(final SubLObject formula, final SubLObject seqvar_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.NIL == formula) {
            return subl_promotions.values2((SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.NIL);
        }
        if (formula.isCons()) {
            thread.resetMultipleValues();
            final SubLObject subformula = formula_terms_int(formula.rest(), seqvar_handling, (SubLObject)cycl_utilities.T);
            final SubLObject consP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cycl_utilities.NIL != consP) {
                return subl_promotions.values2((SubLObject)ConsesLow.cons(formula.first(), subformula), (SubLObject)cycl_utilities.T);
            }
            return subl_promotions.values2(formula, (SubLObject)cycl_utilities.NIL);
        }
        else {
            if (cycl_utilities.NIL == cycl_variables.cyc_varP(formula)) {
                el_utilities.el_error((SubLObject)cycl_utilities.THREE_INTEGER, (SubLObject)cycl_utilities.$str97$formula_terms_int_got_a_non_el_va, formula, (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
                return subl_promotions.values2((SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.T);
            }
            if (seqvar_handling.eql((SubLObject)cycl_utilities.$kw24$IGNORE)) {
                return subl_promotions.values2((SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.T);
            }
            if (seqvar_handling.eql((SubLObject)cycl_utilities.$kw17$REGULARIZE)) {
                return subl_promotions.values2((SubLObject)ConsesLow.list(formula), (SubLObject)cycl_utilities.T);
            }
            if (seqvar_handling.eql((SubLObject)cycl_utilities.$kw96$INCLUDE)) {
                return subl_promotions.values2(formula, (SubLObject)cycl_utilities.NIL);
            }
            return subl_promotions.values2((SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.T);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 105624L)
    public static SubLObject formula_arg_positions(final SubLObject formula, final SubLObject arg, SubLObject test) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = (SubLObject)cycl_utilities.EQUAL;
        }
        if (cycl_utilities.NIL != el_utilities.el_formula_p(formula)) {
            return el_formula_arg_positions(formula, arg, test);
        }
        if (cycl_utilities.NIL != nart_handles.nart_p(formula)) {
            return el_formula_arg_positions(narts_high.nart_hl_formula(formula), arg, test);
        }
        if (cycl_utilities.NIL != assertion_handles.assertion_p(formula)) {
            return el_formula_arg_positions(fi.assertion_hl_formula(formula, (SubLObject)cycl_utilities.UNPROVIDED), arg, test);
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 106197L)
    public static SubLObject el_formula_arg_positions(final SubLObject el_formula, final SubLObject arg, SubLObject test) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = (SubLObject)cycl_utilities.EQUAL;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(el_formula) : el_formula;
        SubLObject result = (SubLObject)cycl_utilities.NIL;
        final SubLObject terms = formula_terms(el_formula, (SubLObject)cycl_utilities.$kw24$IGNORE);
        SubLObject list_var = (SubLObject)cycl_utilities.NIL;
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        SubLObject argnum = (SubLObject)cycl_utilities.NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = (SubLObject)cycl_utilities.ZERO_INTEGER; cycl_utilities.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if (cycl_utilities.NIL != Functions.funcall(test, v_term, arg)) {
                result = (SubLObject)ConsesLow.cons(argnum, result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 106587L)
    public static SubLObject possibly_conjuncts(final SubLObject el_formula) {
        if (cycl_utilities.NIL != el_utilities.el_conjunction_p(el_formula)) {
            return formula_args(el_formula, (SubLObject)cycl_utilities.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(el_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 106902L)
    public static SubLObject nat_arity(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return Sequences.length(nat_args(nat, seqvar_handling));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 107722L)
    public static SubLObject nat_args(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_args(nat, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 108167L)
    public static SubLObject naut_args(final SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        assert cycl_utilities.NIL != el_utilities.possibly_naut_p(naut) : naut;
        return el_formula_args(naut, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 108618L)
    public static SubLObject nat_arg(final SubLObject nat, final SubLObject n, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(nat, n, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 109136L)
    public static SubLObject naut_arg(final SubLObject naut, final SubLObject n, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        assert cycl_utilities.NIL != el_utilities.possibly_naut_p(naut) : naut;
        return el_formula_arg(naut, n, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 109804L)
    public static SubLObject nat_function(final SubLObject nat) {
        return nat_arg0(nat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 109894L)
    public static SubLObject nat_functor(final SubLObject nat) {
        return nat_arg0(nat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 110053L)
    public static SubLObject naut_functor(final SubLObject naut) {
        return el_formula_operator(naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 110157L)
    public static SubLObject nat_arg0(final SubLObject nat) {
        if (cycl_utilities.NIL != el_utilities.el_formula_p(nat)) {
            return naut_functor(nat);
        }
        if (cycl_utilities.NIL != nart_handles.nart_p(nat)) {
            return naut_functor(narts_high.nart_hl_formula(nat));
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 110425L)
    public static SubLObject nat_arg1(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return nat_arg(nat, (SubLObject)cycl_utilities.ONE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 110607L)
    public static SubLObject naut_arg1(final SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return naut_arg(naut, (SubLObject)cycl_utilities.ONE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 110758L)
    public static SubLObject nat_arg2(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return nat_arg(nat, (SubLObject)cycl_utilities.TWO_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 110940L)
    public static SubLObject naut_arg2(final SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return naut_arg(naut, (SubLObject)cycl_utilities.TWO_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 111091L)
    public static SubLObject nat_arg3(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return nat_arg(nat, (SubLObject)cycl_utilities.THREE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 111273L)
    public static SubLObject naut_arg3(final SubLObject naut, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return naut_arg(naut, (SubLObject)cycl_utilities.THREE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 111424L)
    public static SubLObject nat_arg4(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return nat_arg(nat, (SubLObject)cycl_utilities.FOUR_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 111606L)
    public static SubLObject nat_arg5(final SubLObject nat, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return nat_arg(nat, (SubLObject)cycl_utilities.FIVE_INTEGER, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 111788L)
    public static SubLObject nat_with_functor_p(final SubLObject v_object, final SubLObject functor) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != el_utilities.possibly_nat_p(v_object) && nat_functor(v_object).eql(functor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 111921L)
    public static SubLObject naut_with_functor_p(final SubLObject v_object, final SubLObject functor) {
        return el_utilities.el_formula_with_operator_p(v_object, functor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 112027L)
    public static SubLObject naut_with_any_of_functors_p(final SubLObject v_object, final SubLObject functors) {
        return el_utilities.el_formula_with_any_of_operators_p(v_object, functors);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 112151L)
    public static SubLObject cycl_nat_with_functor_p(final SubLObject v_object, final SubLObject functor) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != cycl_grammar.cycl_nat_p(v_object) && nat_functor(v_object).eql(functor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 112285L)
    public static SubLObject sentence_arg(final SubLObject sentence, final SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(sentence, argnum, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 112539L)
    public static SubLObject sentence_args(final SubLObject sentence, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_args(sentence, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 112709L)
    public static SubLObject sentence_truth_function(final SubLObject sentence) {
        return formula_arg0(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 112826L)
    public static SubLObject sentence_arg0(final SubLObject sentence) {
        return formula_arg0(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 112899L)
    public static SubLObject sentence_arg1(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg1(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 113019L)
    public static SubLObject sentence_arg2(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg2(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 113139L)
    public static SubLObject sentence_arg3(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg3(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 113259L)
    public static SubLObject sentence_arg4(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg4(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 113379L)
    public static SubLObject sentence_arg5(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg5(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 113499L)
    public static SubLObject atomic_sentence_arg(final SubLObject asent, final SubLObject argnum, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg(asent, argnum, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 113760L)
    public static SubLObject atomic_sentence_args(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_args(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 113933L)
    public static SubLObject atomic_sentence_predicate(final SubLObject asent) {
        return formula_arg0(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 114053L)
    public static SubLObject atomic_sentence_arg0(final SubLObject asent) {
        return formula_arg0(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 114127L)
    public static SubLObject atomic_sentence_arg1(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg1(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 114254L)
    public static SubLObject atomic_sentence_arg2(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg2(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 114381L)
    public static SubLObject atomic_sentence_arg3(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg3(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 114508L)
    public static SubLObject atomic_sentence_arg4(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg4(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 114635L)
    public static SubLObject atomic_sentence_arg5(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg5(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 114762L)
    public static SubLObject atomic_sentence_arg6(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == cycl_utilities.UNPROVIDED) {
            seqvar_handling = (SubLObject)cycl_utilities.$kw24$IGNORE;
        }
        return formula_arg6(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 114889L)
    public static SubLObject arg_position_p(final SubLObject v_object) {
        return list_utilities.non_empty_list_of_type_p(Symbols.symbol_function((SubLObject)cycl_utilities.$sym106$FIXNUMP), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 115092L)
    public static SubLObject formula_arg_position(final SubLObject formula, final SubLObject arg_position, SubLObject v_default) {
        if (v_default == cycl_utilities.UNPROVIDED) {
            v_default = (SubLObject)cycl_utilities.NIL;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return list_utilities.get_nested_nth(el_utilities.elf_to_list(formula), arg_position, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 115641L)
    public static SubLObject get_nested_nth_arg(final SubLObject formula, final SubLObject where, SubLObject v_default) {
        if (v_default == cycl_utilities.UNPROVIDED) {
            v_default = (SubLObject)cycl_utilities.NIL;
        }
        return formula_arg_position(formula, where, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 115827L)
    public static SubLObject arg_positions_dfs(final SubLObject item, final SubLObject formula, SubLObject test) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return list_utilities.tree_positions_dfs(item, el_utilities.elf_to_list(formula), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 116470L)
    public static SubLObject arg_positions_bfs(final SubLObject item, final SubLObject formula, SubLObject test) {
        if (test == cycl_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)cycl_utilities.EQL);
        }
        return list_utilities.tree_positions_bfs(item, el_utilities.elf_to_list(formula), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 117087L)
    public static SubLObject arg_positions_if_dfs(final SubLObject test, final SubLObject formula, SubLObject key) {
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return list_utilities.tree_positions_if_dfs(test, el_utilities.elf_to_list(formula), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 117789L)
    public static SubLObject arg_positions_if_bfs(final SubLObject test, final SubLObject formula, SubLObject key) {
        if (key == cycl_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)cycl_utilities.IDENTITY);
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return list_utilities.tree_positions_if_bfs(test, el_utilities.elf_to_list(formula), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 118489L)
    public static SubLObject smallest_enclosing_cycl_sentence(final SubLObject formula, final SubLObject arg_position) {
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        for (SubLObject argpos = arg_position; cycl_utilities.NIL != argpos; argpos = conses_high.butlast(argpos, (SubLObject)cycl_utilities.UNPROVIDED)) {
            final SubLObject subexpression = formula_arg_position(formula, argpos, (SubLObject)cycl_utilities.UNPROVIDED);
            if (cycl_utilities.NIL != cycl_grammar.cycl_sentence_p(subexpression)) {
                return subexpression;
            }
        }
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 118955L)
    public static SubLObject cycl_arg_position_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_utilities.NIL != el_utilities.el_formula_with_operator_p(v_object, cycl_utilities.$const107$FormulaArgPositionFn) && cycl_utilities.NIL != arg_position_p(formula_args(v_object, (SubLObject)cycl_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 119255L)
    public static SubLObject make_cycl_arg_position(final SubLObject arg_position) {
        assert cycl_utilities.NIL != arg_position_p(arg_position) : arg_position;
        return el_utilities.make_el_formula(cycl_utilities.$const107$FormulaArgPositionFn, arg_position, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 119415L)
    public static SubLObject cycl_arg_position_to_arg_position(final SubLObject cycl_arg_position) {
        assert cycl_utilities.NIL != cycl_arg_position_p(cycl_arg_position) : cycl_arg_position;
        return formula_args(cycl_arg_position, (SubLObject)cycl_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 119580L)
    public static SubLObject formula_cycl_arg_position(final SubLObject formula, final SubLObject argpos, SubLObject v_default) {
        if (v_default == cycl_utilities.UNPROVIDED) {
            v_default = (SubLObject)cycl_utilities.NIL;
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        assert cycl_utilities.NIL != cycl_arg_position_p(argpos) : argpos;
        return formula_arg_position(formula, cycl_arg_position_to_arg_position(argpos), v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 119907L)
    public static SubLObject cycl_arg_position_nsubst(final SubLObject v_term, final SubLObject argpos, final SubLObject formula) {
        assert cycl_utilities.NIL != cycl_arg_position_p(argpos) : argpos;
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        return formula_arg_position_nsubst(v_term, cycl_arg_position_to_arg_position(argpos), formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-utilities.lisp", position = 120201L)
    public static SubLObject substitute_terms_into_positions(final SubLObject terms, final SubLObject arg_positions, final SubLObject formula) {
        assert cycl_utilities.NIL != list_utilities.non_dotted_list_p(terms) : terms;
        assert cycl_utilities.NIL != list_utilities.non_dotted_list_p(arg_positions) : arg_positions;
        SubLObject cdolist_list_var = arg_positions;
        SubLObject elem = (SubLObject)cycl_utilities.NIL;
        elem = cdolist_list_var.first();
        while (cycl_utilities.NIL != cdolist_list_var) {
            assert cycl_utilities.NIL != cycl_arg_position_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert cycl_utilities.NIL != el_utilities.el_formula_p(formula) : formula;
        final SubLObject result = conses_high.copy_tree(formula);
        SubLObject v_term = (SubLObject)cycl_utilities.NIL;
        SubLObject v_term_$18 = (SubLObject)cycl_utilities.NIL;
        SubLObject argpos = (SubLObject)cycl_utilities.NIL;
        SubLObject argpos_$19 = (SubLObject)cycl_utilities.NIL;
        v_term = terms;
        v_term_$18 = v_term.first();
        argpos = arg_positions;
        argpos_$19 = argpos.first();
        while (cycl_utilities.NIL != argpos || cycl_utilities.NIL != v_term) {
            cycl_arg_position_nsubst(v_term_$18, argpos_$19, result);
            v_term = v_term.rest();
            v_term_$18 = v_term.first();
            argpos = argpos.rest();
            argpos_$19 = argpos.first();
        }
        return result;
    }
    
    public static SubLObject declare_cycl_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_utilities", "with_opaque_arg_function", "WITH-OPAQUE-ARG-FUNCTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycl_utilities", "with_opaque_seqvar_function", "WITH-OPAQUE-SEQVAR-FUNCTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "maybe_some_opaque_argP", "MAYBE-SOME-OPAQUE-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_argP", "OPAQUE-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_argP_int", "OPAQUE-ARG?-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_seqvarP", "OPAQUE-SEQVAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "default_opaque_argP", "DEFAULT-OPAQUE-ARG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_arg_wrt_free_varsP", "OPAQUE-ARG-WRT-FREE-VARS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_arg_wrt_el_templateP", "OPAQUE-ARG-WRT-EL-TEMPLATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_arg_wrt_quotingP", "OPAQUE-ARG-WRT-QUOTING?", 2, 0, false);
        new $opaque_arg_wrt_quotingP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_arg_wrt_quoting_not_counting_logical_opsP", "OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_arg_wrt_quoteP", "OPAQUE-ARG-WRT-QUOTE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_arg_wrt_el_template_or_quoteP", "OPAQUE-ARG-WRT-EL-TEMPLATE-OR-QUOTE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_arg_wrt_skolemP", "OPAQUE-ARG-WRT-SKOLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "default_opaque_seqvarP", "DEFAULT-OPAQUE-SEQVAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "hl_term_with_el_counterpart_p", "HL-TERM-WITH-EL-COUNTERPART-P", 1, 0, false);
        new $hl_term_with_el_counterpart_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "hl_term_to_el_term", "HL-TERM-TO-EL-TERM", 1, 0, false);
        new $hl_term_to_el_term$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "careful_hl_term_to_el_term", "CAREFUL-HL-TERM-TO-EL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "hl_to_el", "HL-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "hl_to_el_destructive", "HL-TO-EL-DESTRUCTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "hl_to_el_preserve_el_vars", "HL-TO-EL-PRESERVE-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "binding_lists_hl_to_el", "BINDING-LISTS-HL-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "transform_hl_to_el", "TRANSFORM-HL-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "reified_term_p", "REIFIED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_reified_term_p", "ATOMIC-REIFIED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "reified_formula_p", "REIFIED-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_p", "RF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_type", "RF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_raw_id", "RF-RAW-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_id", "RF-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "find_rf_by_id", "FIND-RF-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "find_rf", "FIND-RF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "robustly_find_rf", "ROBUSTLY-FIND-RF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_formula", "RF-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_expand", "RF-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_narts", "RF-NARTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_assertions", "RF-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "wf_rf_syntaxP", "WF-RF-SYNTAX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "valid_rfP", "VALID-RF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "all_rfs", "ALL-RFS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "unreify_rfs", "UNREIFY-RFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rf_count", "RF-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "subrfs", "SUBRFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "super_rfs", "SUPER-RFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "inclusive_subrfs", "INCLUSIVE-SUBRFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_gather_int_2", "EXPRESSION-GATHER-INT-2", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_gather_int", "EXPRESSION-GATHER-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_gather_with_duplicates", "EXPRESSION-GATHER-WITH-DUPLICATES", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_gather", "EXPRESSION-GATHER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "assertion_gather", "ASSERTION-GATHER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_count", "EXPRESSION-COUNT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_count_helper", "EXPRESSION-COUNT-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_list_gather", "EXPRESSION-LIST-GATHER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_gather", "FORMULA-GATHER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_forts", "EXPRESSION-FORTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_list_forts", "EXPRESSION-LIST-FORTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_forts", "FORMULA-FORTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_constants", "EXPRESSION-CONSTANTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_list_constants", "EXPRESSION-LIST-CONSTANTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_constants", "FORMULA-CONSTANTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_narts", "EXPRESSION-NARTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_list_narts", "EXPRESSION-LIST-NARTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_narts", "FORMULA-NARTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_sub_assertions", "EXPRESSION-SUB-ASSERTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_list_sub_assertions", "EXPRESSION-LIST-SUB-ASSERTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_sub_assertions", "FORMULA-SUB-ASSERTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "assertion_sub_assertions", "ASSERTION-SUB-ASSERTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nart_sub_assertions", "NART-SUB-ASSERTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "subnarts", "SUBNARTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "all_formula_terms", "ALL-FORMULA-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "all_literal_terms", "ALL-LITERAL-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "top_level_predicates", "TOP-LEVEL-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "top_level_predicates_int", "TOP-LEVEL-PREDICATES-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "containing_subexpressions", "CONTAINING-SUBEXPRESSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "containing_subexpressions_lambda_fn", "CONTAINING-SUBEXPRESSIONS-LAMBDA-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_contains_keywordp", "EXPRESSION-CONTAINS-KEYWORDP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_find_if_int", "EXPRESSION-FIND-IF-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_find_if", "EXPRESSION-FIND-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_find_if", "FORMULA-FIND-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "assertion_find_if", "ASSERTION-FIND-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nart_find_if", "NART-FIND-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_find_int", "EXPRESSION-FIND-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_find", "EXPRESSION-FIND", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_find", "FORMULA-FIND", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "assertion_find", "ASSERTION-FIND", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nart_find", "NART-FIND", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_list_find", "EXPRESSION-LIST-FIND", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "remove_if_not_in_expression", "REMOVE-IF-NOT-IN-EXPRESSION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_find_any", "EXPRESSION-FIND-ANY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_map_int", "EXPRESSION-MAP-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_map", "EXPRESSION-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_map", "FORMULA-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "assertion_map", "ASSERTION-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nart_map", "NART-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_ntransform_int", "EXPRESSION-NTRANSFORM-INT", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_transform", "EXPRESSION-TRANSFORM", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_ntransform", "EXPRESSION-NTRANSFORM", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_transform", "FORMULA-TRANSFORM", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_ntransform", "FORMULA-NTRANSFORM", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_transform_if", "EXPRESSION-TRANSFORM-IF", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_ntransform_if", "EXPRESSION-NTRANSFORM-IF", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_transform_if", "FORMULA-TRANSFORM-IF", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_ntransform_if", "FORMULA-NTRANSFORM-IF", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_transform_if_not", "EXPRESSION-TRANSFORM-IF-NOT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_ntransform_if_not", "EXPRESSION-NTRANSFORM-IF-NOT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_transform_if_not", "FORMULA-TRANSFORM-IF-NOT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_ntransform_if_not", "FORMULA-NTRANSFORM-IF-NOT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_and_mt_transform", "FORMULA-AND-MT-TRANSFORM", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_and_mt_ntransform", "FORMULA-AND-MT-NTRANSFORM", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_and_mt_transform", "SENTENCE-AND-MT-TRANSFORM", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_and_mt_ntransform", "SENTENCE-AND-MT-NTRANSFORM", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsubst_free_vars_int", "EXPRESSION-NSUBST-FREE-VARS-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsubst_free_vars", "EXPRESSION-NSUBST-FREE-VARS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsubst_int", "EXPRESSION-NSUBST-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_subst", "EXPRESSION-SUBST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsubst", "EXPRESSION-NSUBST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_subst", "FORMULA-SUBST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_nsubst", "FORMULA-NSUBST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsublis_free_vars_int", "EXPRESSION-NSUBLIS-FREE-VARS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsublis_free_vars", "EXPRESSION-NSUBLIS-FREE-VARS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsublis_int", "EXPRESSION-NSUBLIS-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_sublis", "EXPRESSION-SUBLIS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsublis", "EXPRESSION-NSUBLIS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_sublis", "FORMULA-SUBLIS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_nsublis", "FORMULA-NSUBLIS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsublis_el_variables", "EXPRESSION-NSUBLIS-EL-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_sublis_el_variables", "EXPRESSION-SUBLIS-EL-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_nsublis_hl_variables", "EXPRESSION-NSUBLIS-HL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "expression_sublis_hl_variables", "EXPRESSION-SUBLIS-HL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cnf_nsublis_el_variables", "CNF-NSUBLIS-EL-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cnf_sublis_el_variables", "CNF-SUBLIS-EL-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg_position_subst", "FORMULA-ARG-POSITION-SUBST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg_position_nsubst", "FORMULA-ARG-POSITION-NSUBST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "permute_formula", "PERMUTE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_permutations", "FORMULA-PERMUTATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formulas_permutations", "FORMULAS-PERMUTATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg_permutations", "FORMULA-ARG-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_commutative_permutations", "NAT-COMMUTATIVE-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "clear_permute_list_cached", "CLEAR-PERMUTE-LIST-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "remove_permute_list_cached", "REMOVE-PERMUTE-LIST-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "permute_list_cached_internal", "PERMUTE-LIST-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "permute_list_cached", "PERMUTE-LIST-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_commutative_permutations", "FORMULA-COMMUTATIVE-PERMUTATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "canonical_commutative_permutations", "CANONICAL-COMMUTATIVE-PERMUTATIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "variable_argnums", "VARIABLE-ARGNUMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "args_canonical_commutative_permutations", "ARGS-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formulas_canonical_permutations", "FORMULAS-CANONICAL-PERMUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "canonical_permute_formula", "CANONICAL-PERMUTE-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_canonical_commutative_permutations", "NAT-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "split_list_set", "SPLIT-LIST-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "permutations_merge", "PERMUTATIONS-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_operator_recursive", "FORMULA-OPERATOR-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rename_default_el_vars_int", "RENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rename_default_el_vars", "RENAME-DEFAULT-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "rename_default_el_vars_destructive", "RENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "unrename_default_el_vars_int", "UNRENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "unrename_default_el_vars", "UNRENAME-DEFAULT-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "unrename_default_el_vars_destructive", "UNRENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "renamed_default_el_var_num", "RENAMED-DEFAULT-EL-VAR-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "renamed_default_el_var_p", "RENAMED-DEFAULT-EL-VAR-P", 1, 0, false);
        new $renamed_default_el_var_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "get_renamed_default_el_var", "GET-RENAMED-DEFAULT-EL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "non_indexed_fort_p", "NON-INDEXED-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "fort_or_naut_p", "FORT-OR-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "fort_or_possibly_naut_p", "FORT-OR-POSSIBLY-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_substitute", "NAUT-SUBSTITUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "collection_intersection_natP", "COLLECTION-INTERSECTION-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "collection_union_natP", "COLLECTION-UNION-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "collection_intersection", "COLLECTION-INTERSECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "collection_union", "COLLECTION-UNION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "collection_intersection_intersectees", "COLLECTION-INTERSECTION-INTERSECTEES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "collection_union_united_collections", "COLLECTION-UNION-UNITED-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "find_denotational_term", "FIND-DENOTATIONAL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "denotational_term_name", "DENOTATIONAL-TERM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "denotational_term_name_for_alpha_sort", "DENOTATIONAL-TERM-NAME-FOR-ALPHA-SORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sorted_constant_list", "SORTED-CONSTANT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sorted_constant_external_id_list", "SORTED-CONSTANT-EXTERNAL-ID-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sorted_constant_internal_id_list", "SORTED-CONSTANT-INTERNAL-ID-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "constant_list", "CONSTANT-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sorted_nat_list", "SORTED-NAT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_list", "NAT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sorted_assertion_list", "SORTED-ASSERTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "assertion_list", "ASSERTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sorted_fort_id_list", "SORTED-FORT-ID-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "functional_in_some_argP", "FUNCTIONAL-IN-SOME-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "functional_in_arg_positions_internal", "FUNCTIONAL-IN-ARG-POSITIONS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "functional_in_arg_positions", "FUNCTIONAL-IN-ARG-POSITIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "strictly_functional_in_some_argP", "STRICTLY-FUNCTIONAL-IN-SOME-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "strictly_functional_in_arg_positions_internal", "STRICTLY-FUNCTIONAL-IN-ARG-POSITIONS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "strictly_functional_in_arg_positions", "STRICTLY-FUNCTIONAL-IN-ARG-POSITIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nart_cons", "NART-CONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "lookup_all_narts", "LOOKUP-ALL-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "reify_all_existing_narts", "REIFY-ALL-EXISTING-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "opaque_arg_wrt_nat_reificationP", "OPAQUE-ARG-WRT-NAT-REIFICATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "reify_arg_when_closed_naut", "REIFY-ARG-WHEN-CLOSED-NAUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "reify_when_closed_naut", "REIFY-WHEN-CLOSED-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "find_when_closed_naut", "FIND-WHEN-CLOSED-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "find_closed_naut", "FIND-CLOSED-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "find_when_ground_naut", "FIND-WHEN-GROUND-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "find_ground_naut", "FIND-GROUND-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "ground_hl_formulaP", "GROUND-HL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_with_pred_p", "ATOMIC-SENTENCE-WITH-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_with_any_of_preds_p", "ATOMIC-SENTENCE-WITH-ANY-OF-PREDS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "null_or_falseP", "NULL-OR-FALSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "possibly_cycl_formula_p", "POSSIBLY-CYCL-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "negatedP", "NEGATED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "negate", "NEGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "possibly_negate", "POSSIBLY-NEGATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg", "FORMULA-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_arg", "EL-FORMULA-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_has_argP", "EL-FORMULA-HAS-ARG?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg0", "FORMULA-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_operator", "FORMULA-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_operator", "EL-FORMULA-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_arg1", "EL-FORMULA-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_arg2", "EL-FORMULA-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_arg3", "EL-FORMULA-ARG3", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg1", "FORMULA-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg2", "FORMULA-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg3", "FORMULA-ARG3", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg4", "FORMULA-ARG4", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg5", "FORMULA-ARG5", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg6", "FORMULA-ARG6", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_args", "FORMULA-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_args", "EL-FORMULA-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_formula_args", "CYCL-FORMULA-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_formula_arg0", "CYCL-FORMULA-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_formula_arg1", "CYCL-FORMULA-ARG1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_formula_arg2", "CYCL-FORMULA-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_formula_arg3", "CYCL-FORMULA-ARG3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_terms", "FORMULA-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_terms", "EL-FORMULA-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_terms_int", "FORMULA-TERMS-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_terms_int_two_pass", "FORMULA-TERMS-INT-TWO-PASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_terms_int_one_pass", "FORMULA-TERMS-INT-ONE-PASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg_positions", "FORMULA-ARG-POSITIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "el_formula_arg_positions", "EL-FORMULA-ARG-POSITIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "possibly_conjuncts", "POSSIBLY-CONJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_arity", "NAT-ARITY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_args", "NAT-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_args", "NAUT-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_arg", "NAT-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_arg", "NAUT-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_function", "NAT-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_functor", "NAT-FUNCTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_functor", "NAUT-FUNCTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_arg0", "NAT-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_arg1", "NAT-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_arg1", "NAUT-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_arg2", "NAT-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_arg2", "NAUT-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_arg3", "NAT-ARG3", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_arg3", "NAUT-ARG3", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_arg4", "NAT-ARG4", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_arg5", "NAT-ARG5", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "nat_with_functor_p", "NAT-WITH-FUNCTOR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_with_functor_p", "NAUT-WITH-FUNCTOR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "naut_with_any_of_functors_p", "NAUT-WITH-ANY-OF-FUNCTORS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_nat_with_functor_p", "CYCL-NAT-WITH-FUNCTOR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_arg", "SENTENCE-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_args", "SENTENCE-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_truth_function", "SENTENCE-TRUTH-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_arg0", "SENTENCE-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_arg1", "SENTENCE-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_arg2", "SENTENCE-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_arg3", "SENTENCE-ARG3", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_arg4", "SENTENCE-ARG4", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "sentence_arg5", "SENTENCE-ARG5", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_arg", "ATOMIC-SENTENCE-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_args", "ATOMIC-SENTENCE-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_predicate", "ATOMIC-SENTENCE-PREDICATE", 1, 0, false);
        new $atomic_sentence_predicate$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_arg0", "ATOMIC-SENTENCE-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_arg1", "ATOMIC-SENTENCE-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_arg2", "ATOMIC-SENTENCE-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_arg3", "ATOMIC-SENTENCE-ARG3", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_arg4", "ATOMIC-SENTENCE-ARG4", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_arg5", "ATOMIC-SENTENCE-ARG5", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "atomic_sentence_arg6", "ATOMIC-SENTENCE-ARG6", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "arg_position_p", "ARG-POSITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_arg_position", "FORMULA-ARG-POSITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "get_nested_nth_arg", "GET-NESTED-NTH-ARG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "arg_positions_dfs", "ARG-POSITIONS-DFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "arg_positions_bfs", "ARG-POSITIONS-BFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "arg_positions_if_dfs", "ARG-POSITIONS-IF-DFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "arg_positions_if_bfs", "ARG-POSITIONS-IF-BFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "smallest_enclosing_cycl_sentence", "SMALLEST-ENCLOSING-CYCL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_arg_position_p", "CYCL-ARG-POSITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "make_cycl_arg_position", "MAKE-CYCL-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_arg_position_to_arg_position", "CYCL-ARG-POSITION-TO-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "formula_cycl_arg_position", "FORMULA-CYCL-ARG-POSITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "cycl_arg_position_nsubst", "CYCL-ARG-POSITION-NSUBST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_utilities", "substitute_terms_into_positions", "SUBSTITUTE-TERMS-INTO-POSITIONS", 3, 0, false);
        return (SubLObject)cycl_utilities.NIL;
    }
    
    public static SubLObject init_cycl_utilities_file() {
        cycl_utilities.$opaque_arg_function$ = SubLFiles.defparameter("*OPAQUE-ARG-FUNCTION*", (SubLObject)cycl_utilities.$sym0$DEFAULT_OPAQUE_ARG_);
        cycl_utilities.$opaque_seqvar_function$ = SubLFiles.defparameter("*OPAQUE-SEQVAR-FUNCTION*", (SubLObject)cycl_utilities.$sym1$DEFAULT_OPAQUE_SEQVAR_);
        cycl_utilities.$expression_count_item$ = SubLFiles.defparameter("*EXPRESSION-COUNT-ITEM*", (SubLObject)cycl_utilities.NIL);
        cycl_utilities.$expression_count_test$ = SubLFiles.defparameter("*EXPRESSION-COUNT-TEST*", (SubLObject)cycl_utilities.NIL);
        cycl_utilities.$containing_subexpressions_lambda_term$ = SubLFiles.defparameter("*CONTAINING-SUBEXPRESSIONS-LAMBDA-TERM*", (SubLObject)cycl_utilities.NIL);
        cycl_utilities.$default_transformation_limit$ = SubLFiles.deflexical("*DEFAULT-TRANSFORMATION-LIMIT*", (SubLObject)cycl_utilities.$int30$212);
        cycl_utilities.$permute_list_cached_caching_state$ = SubLFiles.deflexical("*PERMUTE-LIST-CACHED-CACHING-STATE*", (SubLObject)cycl_utilities.NIL);
        cycl_utilities.$renamed_default_el_var_prefix$ = SubLFiles.defparameter("*RENAMED-DEFAULT-EL-VAR-PREFIX*", (SubLObject)cycl_utilities.$str44$_RENAMED_VAR);
        cycl_utilities.$non_indexed_constants$ = SubLFiles.deflexical("*NON-INDEXED-CONSTANTS*", ConsesLow.append(new SubLObject[] { el_utilities.$cyc_const_unary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_binary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_ternary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_quaternary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_quintary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_variable_arity_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_regular_quantifiers$.getGlobalValue(), el_utilities.$cyc_const_bounded_existentials$.getGlobalValue(), el_utilities.$cyc_const_exception_operators$.getGlobalValue(), el_utilities.$cyc_const_pragmatic_requirement_operators$.getGlobalValue() }));
        return (SubLObject)cycl_utilities.NIL;
    }
    
    public static SubLObject setup_cycl_utilities_file() {
        access_macros.register_external_symbol((SubLObject)cycl_utilities.$sym28$EXPRESSION_FIND_IF);
        access_macros.register_external_symbol((SubLObject)cycl_utilities.$sym33$EXPRESSION_SUBST);
        access_macros.register_external_symbol((SubLObject)cycl_utilities.$sym34$FORMULA_SUBST);
        memoization_state.note_globally_cached_function((SubLObject)cycl_utilities.$sym37$PERMUTE_LIST_CACHED);
        memoization_state.note_memoized_function((SubLObject)cycl_utilities.$sym68$FUNCTIONAL_IN_ARG_POSITIONS);
        memoization_state.note_memoized_function((SubLObject)cycl_utilities.$sym71$STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS);
        utilities_macros.register_cyc_api_function((SubLObject)cycl_utilities.$sym79$NEGATED_, (SubLObject)cycl_utilities.$list80, (SubLObject)cycl_utilities.$str81$Return_T_iff_OBJECT_is_a_negated_, (SubLObject)cycl_utilities.NIL, (SubLObject)cycl_utilities.$list82);
        utilities_macros.register_cyc_api_function((SubLObject)cycl_utilities.$sym84$NEGATE, (SubLObject)cycl_utilities.$list85, (SubLObject)cycl_utilities.$str86$Assuming_FORM_is_a_valid_CycL_for, (SubLObject)cycl_utilities.$list87, (SubLObject)cycl_utilities.$list88);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list92);
        access_macros.register_external_symbol((SubLObject)cycl_utilities.$sym93$FORMULA_OPERATOR);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list94);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list99);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list100);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list101);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list102);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list103);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list104);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_utilities.$list105);
        sunit_external.define_test_category((SubLObject)cycl_utilities.$str111$CycL_Utilities_Module_Supercatego, (SubLObject)cycl_utilities.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)cycl_utilities.$str112$CycL_Utilities_Subcategory, (SubLObject)ConsesLow.list((SubLObject)cycl_utilities.$str111$CycL_Utilities_Module_Supercatego));
        sunit_external.define_test_suite((SubLObject)cycl_utilities.$str113$CycL_Utilities_Testing_Suite, (SubLObject)ConsesLow.list((SubLObject)cycl_utilities.$str111$CycL_Utilities_Module_Supercatego), (SubLObject)cycl_utilities.UNPROVIDED, (SubLObject)cycl_utilities.UNPROVIDED);
        return (SubLObject)cycl_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cycl_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cycl_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cycl_utilities_file();
    }
    
    static {
        me = (SubLFile)new cycl_utilities();
        cycl_utilities.$opaque_arg_function$ = null;
        cycl_utilities.$opaque_seqvar_function$ = null;
        cycl_utilities.$expression_count_item$ = null;
        cycl_utilities.$expression_count_test$ = null;
        cycl_utilities.$containing_subexpressions_lambda_term$ = null;
        cycl_utilities.$default_transformation_limit$ = null;
        cycl_utilities.$permute_list_cached_caching_state$ = null;
        cycl_utilities.$renamed_default_el_var_prefix$ = null;
        cycl_utilities.$non_indexed_constants$ = null;
        $sym0$DEFAULT_OPAQUE_ARG_ = SubLObjectFactory.makeSymbol("DEFAULT-OPAQUE-ARG?");
        $sym1$DEFAULT_OPAQUE_SEQVAR_ = SubLObjectFactory.makeSymbol("DEFAULT-OPAQUE-SEQVAR?");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym4$_OPAQUE_ARG_FUNCTION_ = SubLObjectFactory.makeSymbol("*OPAQUE-ARG-FUNCTION*");
        $sym5$_OPAQUE_SEQVAR_FUNCTION_ = SubLObjectFactory.makeSymbol("*OPAQUE-SEQVAR-FUNCTION*");
        $sym6$OPAQUE_ARG_WRT_EL_TEMPLATE_ = SubLObjectFactory.makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE?");
        $const7$SkolemFunctionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn"));
        $const8$trueSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $sym9$HL_TERM_WITH_EL_COUNTERPART_P = SubLObjectFactory.makeSymbol("HL-TERM-WITH-EL-COUNTERPART-P");
        $kw10$TRANSFORMATION_LIMIT_EXCEEDED = SubLObjectFactory.makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");
        $sym11$HL_TERM_TO_EL_TERM = SubLObjectFactory.makeSymbol("HL-TERM-TO-EL-TERM");
        $str12$Recursion_limit_reached___el_to_h = SubLObjectFactory.makeString("Recursion limit reached: (el-to-hl ~S)");
        $sym13$CAREFUL_HL_TERM_TO_EL_TERM = SubLObjectFactory.makeSymbol("CAREFUL-HL-TERM-TO-EL-TERM");
        $kw14$NART = SubLObjectFactory.makeKeyword("NART");
        $kw15$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $sym16$RF_P = SubLObjectFactory.makeSymbol("RF-P");
        $kw17$REGULARIZE = SubLObjectFactory.makeKeyword("REGULARIZE");
        $sym18$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym19$EXPRESSION_COUNT_HELPER = SubLObjectFactory.makeSymbol("EXPRESSION-COUNT-HELPER");
        $sym20$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym21$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym22$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym23$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $kw24$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str25$_S_is_not_well_formed_ = SubLObjectFactory.makeString("~S is not well formed.");
        $sym26$CONTAINING_SUBEXPRESSIONS_LAMBDA_FN = SubLObjectFactory.makeSymbol("CONTAINING-SUBEXPRESSIONS-LAMBDA-FN");
        $sym27$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym28$EXPRESSION_FIND_IF = SubLObjectFactory.makeSymbol("EXPRESSION-FIND-IF");
        $sym29$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $int30$212 = SubLObjectFactory.makeInteger(212);
        $const31$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $const32$ExpandSubLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $sym33$EXPRESSION_SUBST = SubLObjectFactory.makeSymbol("EXPRESSION-SUBST");
        $sym34$FORMULA_SUBST = SubLObjectFactory.makeSymbol("FORMULA-SUBST");
        $sym35$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $sym36$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym37$PERMUTE_LIST_CACHED = SubLObjectFactory.makeSymbol("PERMUTE-LIST-CACHED");
        $sym38$_PERMUTE_LIST_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PERMUTE-LIST-CACHED-CACHING-STATE*");
        $list39 = ConsesLow.list((SubLObject)cycl_utilities.NIL);
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRONT1"), (SubLObject)SubLObjectFactory.makeSymbol("REST1"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRONT2"), (SubLObject)SubLObjectFactory.makeSymbol("REST2"));
        $sym42$DEFAULT_EL_VAR_ = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR?");
        $sym43$RENAMED_DEFAULT_EL_VAR_P = SubLObjectFactory.makeSymbol("RENAMED-DEFAULT-EL-VAR-P");
        $str44$_RENAMED_VAR = SubLObjectFactory.makeString("?RENAMED-VAR");
        $sym45$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $sym46$NART_EL_FORMULA = SubLObjectFactory.makeSymbol("NART-EL-FORMULA");
        $const47$CollectionIntersectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $const48$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $const49$CollectionUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn"));
        $const50$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $sym51$COLLECTION_INTERSECTION_NAT_ = SubLObjectFactory.makeSymbol("COLLECTION-INTERSECTION-NAT?");
        $sym52$COLLECTION_UNION_NAT_ = SubLObjectFactory.makeSymbol("COLLECTION-UNION-NAT?");
        $int53$5000 = SubLObjectFactory.makeInteger(5000);
        $sym54$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str55$ = SubLObjectFactory.makeString("");
        $str56$__ = SubLObjectFactory.makeString("#$");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("("), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString(")"), (SubLObject)SubLObjectFactory.makeString("")));
        $sym58$CONSTANT_EXTERNAL_ID__ = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-<");
        $sym59$CONSTANT_EXTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID");
        $sym60$GUID_ = SubLObjectFactory.makeSymbol("GUID<");
        $sym61$CONSTANT_INTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $sym62$_ = SubLObjectFactory.makeSymbol("<");
        $sym63$NART_ID = SubLObjectFactory.makeSymbol("NART-ID");
        $sym64$FORT_INTERNAL_ID = SubLObjectFactory.makeSymbol("FORT-INTERNAL-ID");
        $sym65$VALID_SOMEWHERE_CACHE_ITEM_ = SubLObjectFactory.makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");
        $const66$functionalInArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionalInArgs"));
        $const67$strictlyFunctionalInArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strictlyFunctionalInArgs"));
        $sym68$FUNCTIONAL_IN_ARG_POSITIONS = SubLObjectFactory.makeSymbol("FUNCTIONAL-IN-ARG-POSITIONS");
        $sym69$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $int70$100 = SubLObjectFactory.makeInteger(100);
        $sym71$STRICTLY_FUNCTIONAL_IN_ARG_POSITIONS = SubLObjectFactory.makeSymbol("STRICTLY-FUNCTIONAL-IN-ARG-POSITIONS");
        $sym72$OPAQUE_ARG_WRT_NAT_REIFICATION_ = SubLObjectFactory.makeSymbol("OPAQUE-ARG-WRT-NAT-REIFICATION?");
        $sym73$NART_LOOKUP = SubLObjectFactory.makeSymbol("NART-LOOKUP");
        $sym74$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym75$EL_FIND_IF_NART = SubLObjectFactory.makeSymbol("EL-FIND-IF-NART");
        $sym76$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $const77$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const78$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $sym79$NEGATED_ = SubLObjectFactory.makeSymbol("NEGATED?");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str81$Return_T_iff_OBJECT_is_a_negated_ = SubLObjectFactory.makeString("Return T iff OBJECT is a negated EL formula.");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym83$POSSIBLY_SENTENCE_OR_VARIABLE_P = SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-OR-VARIABLE-P");
        $sym84$NEGATE = SubLObjectFactory.makeSymbol("NEGATE");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $str86$Assuming_FORM_is_a_valid_CycL_for = SubLObjectFactory.makeString("Assuming FORM is a valid CycL formula, return a negated version of it.");
        $list87 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-OR-VARIABLE-P")));
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P"));
        $sym89$TRUTH_P = SubLObjectFactory.makeSymbol("TRUTH-P");
        $kw90$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym91$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"));
        $sym93$FORMULA_OPERATOR = SubLObjectFactory.makeSymbol("FORMULA-OPERATOR");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-OPERATOR"));
        $sym95$CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $kw96$INCLUDE = SubLObjectFactory.makeKeyword("INCLUDE");
        $str97$formula_terms_int_got_a_non_el_va = SubLObjectFactory.makeString("formula-terms-int got a non-el-variable or cons: ~A~%");
        $sym98$POSSIBLY_NAUT_P = SubLObjectFactory.makeSymbol("POSSIBLY-NAUT-P");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("NAT-FUNCTION"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("NAT-FUNCTOR"));
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("NAUT-FUNCTOR"));
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-TRUTH-FUNCTION"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-ARG0"));
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE"));
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG0"));
        $sym106$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $const107$FormulaArgPositionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgPositionFn"));
        $sym108$ARG_POSITION_P = SubLObjectFactory.makeSymbol("ARG-POSITION-P");
        $sym109$CYCL_ARG_POSITION_P = SubLObjectFactory.makeSymbol("CYCL-ARG-POSITION-P");
        $sym110$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $str111$CycL_Utilities_Module_Supercatego = SubLObjectFactory.makeString("CycL-Utilities Module Supercategory");
        $str112$CycL_Utilities_Subcategory = SubLObjectFactory.makeString("CycL Utilities Subcategory");
        $str113$CycL_Utilities_Testing_Suite = SubLObjectFactory.makeString("CycL Utilities Testing Suite");
    }
    
    public static final class $opaque_arg_wrt_quotingP$BinaryFunction extends BinaryFunction
    {
        public $opaque_arg_wrt_quotingP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("OPAQUE-ARG-WRT-QUOTING?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return cycl_utilities.opaque_arg_wrt_quotingP(arg1, arg2);
        }
    }
    
    public static final class $hl_term_with_el_counterpart_p$UnaryFunction extends UnaryFunction
    {
        public $hl_term_with_el_counterpart_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-TERM-WITH-EL-COUNTERPART-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cycl_utilities.hl_term_with_el_counterpart_p(arg1);
        }
    }
    
    public static final class $hl_term_to_el_term$UnaryFunction extends UnaryFunction
    {
        public $hl_term_to_el_term$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-TERM-TO-EL-TERM"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cycl_utilities.hl_term_to_el_term(arg1);
        }
    }
    
    public static final class $renamed_default_el_var_p$UnaryFunction extends UnaryFunction
    {
        public $renamed_default_el_var_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RENAMED-DEFAULT-EL-VAR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cycl_utilities.renamed_default_el_var_p(arg1);
        }
    }
    
    public static final class $atomic_sentence_predicate$UnaryFunction extends UnaryFunction
    {
        public $atomic_sentence_predicate$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ATOMIC-SENTENCE-PREDICATE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cycl_utilities.atomic_sentence_predicate(arg1);
        }
    }
}

/*

	Total time: 922 ms
	
*/