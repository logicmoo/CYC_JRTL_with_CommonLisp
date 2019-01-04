package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class prop_sentence_clausifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.prop_sentence_clausifier";
    public static final String myFingerPrint = "f7bb49e9a9245d0ad85c2deae675ce9d75a047b3bc023a397ec542f749f8076a";
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1202L)
    public static SubLSymbol $prop_sentence_and$;
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1336L)
    public static SubLSymbol $prop_sentence_or$;
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1386L)
    public static SubLSymbol $prop_sentence_not$;
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1437L)
    public static SubLSymbol $prop_sentence_true$;
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1492L)
    public static SubLSymbol $prop_sentence_false$;
    private static final SubLObject $const0$and;
    private static final SubLObject $const1$or;
    private static final SubLObject $const2$not;
    private static final SubLObject $const3$True;
    private static final SubLObject $const4$False;
    private static final SubLSymbol $sym5$PROP_SENTENCE_NEGATE;
    private static final SubLSymbol $sym6$PROP_SENTENCE_ARG_OPERATOR;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLString $str9$Can_t_handle__S;
    private static final SubLSymbol $sym10$PROP_SENTENCE_CANON_NEGATIONS_IN;
    private static final SubLSymbol $sym11$PROP_SENTENCE_CANON_DISJUNCTIONS_IN;
    private static final SubLSymbol $sym12$PROP_SENTENCE_CANON_CONJUNCTIONS_IN;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$PROP_SENTENCE_SIMPLIFY;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1547L)
    public static SubLObject prop_sentence_conjoin_p(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.equal(prop_sentence_clausifier.$prop_sentence_and$.getDynamicValue(thread), sentence.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1692L)
    public static SubLObject prop_sentence_disjoin_p(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.equal(prop_sentence_clausifier.$prop_sentence_or$.getDynamicValue(thread), sentence.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1835L)
    public static SubLObject prop_sentence_negation_p(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.equal(prop_sentence_clausifier.$prop_sentence_not$.getDynamicValue(thread), sentence.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 1977L)
    public static SubLObject prop_sentence_conjoin(final SubLObject sentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons(prop_sentence_clausifier.$prop_sentence_and$.getDynamicValue(thread), sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 2113L)
    public static SubLObject prop_sentence_disjoin(final SubLObject sentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons(prop_sentence_clausifier.$prop_sentence_or$.getDynamicValue(thread), sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 2247L)
    public static SubLObject prop_sentence_negate(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list(prop_sentence_clausifier.$prop_sentence_not$.getDynamicValue(thread), prop_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 2411L)
    public static SubLObject prop_sentence_negate_args(final SubLObject sentence_list) {
        return Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym5$PROP_SENTENCE_NEGATE, sentence_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 2563L)
    public static SubLObject prop_sentence_args(final SubLObject sentence) {
        return sentence.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 2664L)
    public static SubLObject find_arg_with_operator(final SubLObject operator, final SubLObject args) {
        return Sequences.find(operator, args, Symbols.symbol_function((SubLObject)prop_sentence_clausifier.EQL), Symbols.symbol_function((SubLObject)prop_sentence_clausifier.$sym6$PROP_SENTENCE_ARG_OPERATOR), (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 2835L)
    public static SubLObject prop_sentence_arg_operator(final SubLObject v_object) {
        if (v_object.isCons()) {
            return v_object.first();
        }
        return (SubLObject)prop_sentence_clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 2937L)
    public static SubLObject prop_sentence_to_cnf(SubLObject prop_sentence) {
        if (!prop_sentence.isAtom()) {
            prop_sentence = prop_sentence_canon_negations_in(prop_sentence);
            prop_sentence = prop_sentence_canon_disjunctions_in(prop_sentence);
        }
        return prop_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 3558L)
    public static SubLObject prop_sentence_to_dnf(SubLObject prop_sentence) {
        if (!prop_sentence.isAtom()) {
            prop_sentence = prop_sentence_canon_negations_in(prop_sentence);
            prop_sentence = prop_sentence_canon_conjunctions_in(prop_sentence);
        }
        return prop_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 4081L)
    public static SubLObject prop_sentence_canon_negations_in(final SubLObject prop_sentence) {
        if (prop_sentence.isAtom()) {
            return prop_sentence;
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_negation_p(prop_sentence)) {
            SubLObject current;
            final SubLObject datum = current = prop_sentence_args(prop_sentence);
            SubLObject arg = (SubLObject)prop_sentence_clausifier.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)prop_sentence_clausifier.$list7);
            arg = current.first();
            current = current.rest();
            if (prop_sentence_clausifier.NIL == current) {
                if (arg.isAtom()) {
                    return prop_sentence;
                }
                if (prop_sentence_clausifier.NIL != prop_sentence_negation_p(arg)) {
                    SubLObject current_$2;
                    final SubLObject datum_$1 = current_$2 = prop_sentence_args(arg);
                    SubLObject inner_arg = (SubLObject)prop_sentence_clausifier.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)prop_sentence_clausifier.$list8);
                    inner_arg = current_$2.first();
                    current_$2 = current_$2.rest();
                    if (prop_sentence_clausifier.NIL == current_$2) {
                        return prop_sentence_canon_negations_in(inner_arg);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)prop_sentence_clausifier.$list8);
                }
                else {
                    if (prop_sentence_clausifier.NIL != prop_sentence_conjoin_p(arg)) {
                        return prop_sentence_canon_negations_in(prop_sentence_disjoin(prop_sentence_negate_args(prop_sentence_args(arg))));
                    }
                    if (prop_sentence_clausifier.NIL != prop_sentence_disjoin_p(arg)) {
                        return prop_sentence_canon_negations_in(prop_sentence_conjoin(prop_sentence_negate_args(prop_sentence_args(arg))));
                    }
                    return Errors.error((SubLObject)prop_sentence_clausifier.$str9$Can_t_handle__S, prop_sentence);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)prop_sentence_clausifier.$list7);
            }
            return (SubLObject)prop_sentence_clausifier.NIL;
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_conjoin_p(prop_sentence)) {
            return prop_sentence_conjoin(Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym10$PROP_SENTENCE_CANON_NEGATIONS_IN, prop_sentence_args(prop_sentence)));
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_disjoin_p(prop_sentence)) {
            return prop_sentence_disjoin(Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym10$PROP_SENTENCE_CANON_NEGATIONS_IN, prop_sentence_args(prop_sentence)));
        }
        return Errors.error((SubLObject)prop_sentence_clausifier.$str9$Can_t_handle__S, prop_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 5594L)
    public static SubLObject prop_sentence_canon_disjunctions_in(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prop_sentence.isAtom()) {
            return prop_sentence;
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_negation_p(prop_sentence)) {
            return prop_sentence;
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_conjoin_p(prop_sentence)) {
            return prop_sentence_conjoin(Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym11$PROP_SENTENCE_CANON_DISJUNCTIONS_IN, prop_sentence_args(prop_sentence)));
        }
        if (prop_sentence_clausifier.NIL == prop_sentence_disjoin_p(prop_sentence)) {
            return Errors.error((SubLObject)prop_sentence_clausifier.$str9$Can_t_handle__S, prop_sentence);
        }
        final SubLObject args = prop_sentence_args(prop_sentence);
        final SubLObject nested_conjunction = find_arg_with_operator(prop_sentence_clausifier.$prop_sentence_and$.getDynamicValue(thread), args);
        if (prop_sentence_clausifier.NIL == nested_conjunction) {
            return prop_sentence;
        }
        final SubLObject other_disjuncts = Sequences.delete(nested_conjunction, args, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED);
        if (prop_sentence_clausifier.NIL != other_disjuncts) {
            SubLObject new_conjuncts = (SubLObject)prop_sentence_clausifier.NIL;
            SubLObject cdolist_list_var = nested_conjunction.rest();
            SubLObject conjunct = (SubLObject)prop_sentence_clausifier.NIL;
            conjunct = cdolist_list_var.first();
            while (prop_sentence_clausifier.NIL != cdolist_list_var) {
                final SubLObject new_disjuncts = (SubLObject)ConsesLow.cons(conjunct, other_disjuncts);
                new_conjuncts = (SubLObject)ConsesLow.cons(prop_sentence_disjoin(new_disjuncts), new_conjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return prop_sentence_conjoin(Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym11$PROP_SENTENCE_CANON_DISJUNCTIONS_IN, new_conjuncts));
        }
        return nested_conjunction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 6813L)
    public static SubLObject prop_sentence_canon_conjunctions_in(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prop_sentence.isAtom()) {
            return prop_sentence;
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_negation_p(prop_sentence)) {
            return prop_sentence;
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_disjoin_p(prop_sentence)) {
            return prop_sentence_disjoin(Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym12$PROP_SENTENCE_CANON_CONJUNCTIONS_IN, prop_sentence_args(prop_sentence)));
        }
        if (prop_sentence_clausifier.NIL == prop_sentence_conjoin_p(prop_sentence)) {
            return Errors.error((SubLObject)prop_sentence_clausifier.$str9$Can_t_handle__S, prop_sentence);
        }
        final SubLObject args = prop_sentence_args(prop_sentence);
        final SubLObject nested_disjunction = find_arg_with_operator(prop_sentence_clausifier.$prop_sentence_or$.getDynamicValue(thread), args);
        if (prop_sentence_clausifier.NIL == nested_disjunction) {
            return prop_sentence;
        }
        final SubLObject other_conjuncts = Sequences.delete(nested_disjunction, args, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED);
        if (prop_sentence_clausifier.NIL != other_conjuncts) {
            SubLObject new_disjuncts = (SubLObject)prop_sentence_clausifier.NIL;
            SubLObject cdolist_list_var = nested_disjunction.rest();
            SubLObject disjunct = (SubLObject)prop_sentence_clausifier.NIL;
            disjunct = cdolist_list_var.first();
            while (prop_sentence_clausifier.NIL != cdolist_list_var) {
                final SubLObject new_conjuncts = (SubLObject)ConsesLow.cons(disjunct, other_conjuncts);
                new_disjuncts = (SubLObject)ConsesLow.cons(prop_sentence_conjoin(new_conjuncts), new_disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
            return prop_sentence_disjoin(Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym12$PROP_SENTENCE_CANON_CONJUNCTIONS_IN, new_disjuncts));
        }
        return nested_disjunction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 8031L)
    public static SubLObject prop_sentence_simplify(final SubLObject prop_sentence) {
        if (prop_sentence.isAtom()) {
            return prop_sentence;
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_conjoin_p(prop_sentence)) {
            return prop_sentence_simplify_and(prop_sentence);
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_disjoin_p(prop_sentence)) {
            return prop_sentence_simplify_or(prop_sentence);
        }
        if (prop_sentence_clausifier.NIL != prop_sentence_negation_p(prop_sentence)) {
            return prop_sentence_simplify_not(prop_sentence);
        }
        return Errors.error((SubLObject)prop_sentence_clausifier.$str9$Can_t_handle__S, prop_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 8689L)
    public static SubLObject prop_sentence_simplify_and(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)prop_sentence_clausifier.NIL;
        SubLObject args = (SubLObject)prop_sentence_clausifier.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(prop_sentence, prop_sentence, (SubLObject)prop_sentence_clausifier.$list13);
        operator = prop_sentence.first();
        final SubLObject current = args = prop_sentence.rest();
        args = Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym14$PROP_SENTENCE_SIMPLIFY, args);
        SubLObject lifted_args = (SubLObject)prop_sentence_clausifier.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)prop_sentence_clausifier.NIL;
        arg = cdolist_list_var.first();
        while (prop_sentence_clausifier.NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = arg;
                SubLObject inner_operator = (SubLObject)prop_sentence_clausifier.NIL;
                SubLObject inner_args = (SubLObject)prop_sentence_clausifier.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)prop_sentence_clausifier.$list15);
                inner_operator = current_$4.first();
                current_$4 = (inner_args = current_$4.rest());
                if (prop_sentence_clausifier.$prop_sentence_and$.getDynamicValue(thread).eql(inner_operator)) {
                    SubLObject cdolist_list_var_$5 = inner_args;
                    SubLObject inner_arg = (SubLObject)prop_sentence_clausifier.NIL;
                    inner_arg = cdolist_list_var_$5.first();
                    while (prop_sentence_clausifier.NIL != cdolist_list_var_$5) {
                        lifted_args = (SubLObject)ConsesLow.cons(inner_arg, lifted_args);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        inner_arg = cdolist_list_var_$5.first();
                    }
                }
                else {
                    lifted_args = (SubLObject)ConsesLow.cons(arg, lifted_args);
                }
            }
            else {
                lifted_args = (SubLObject)ConsesLow.cons(arg, lifted_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        args = Sequences.nreverse(lifted_args);
        args = Sequences.delete_duplicates(args, Symbols.symbol_function((SubLObject)prop_sentence_clausifier.EQUAL), (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED);
        args = Sequences.delete(prop_sentence_clausifier.$prop_sentence_true$.getDynamicValue(thread), args, Symbols.symbol_function((SubLObject)prop_sentence_clausifier.EQUAL), (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED);
        if (prop_sentence_clausifier.NIL == args) {
            return prop_sentence_clausifier.$prop_sentence_true$.getDynamicValue(thread);
        }
        if (prop_sentence_clausifier.NIL != list_utilities.singletonP(args)) {
            SubLObject current_$5;
            final SubLObject datum_$4 = current_$5 = args;
            arg = (SubLObject)prop_sentence_clausifier.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)prop_sentence_clausifier.$list7);
            arg = current_$5.first();
            current_$5 = current_$5.rest();
            if (prop_sentence_clausifier.NIL == current_$5) {
                return arg;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$4, (SubLObject)prop_sentence_clausifier.$list7);
            return (SubLObject)prop_sentence_clausifier.NIL;
        }
        else {
            if (prop_sentence_clausifier.NIL != subl_promotions.memberP(prop_sentence_clausifier.$prop_sentence_false$.getDynamicValue(thread), args, Symbols.symbol_function((SubLObject)prop_sentence_clausifier.EQUAL), (SubLObject)prop_sentence_clausifier.UNPROVIDED)) {
                return prop_sentence_clausifier.$prop_sentence_false$.getDynamicValue(thread);
            }
            if (prop_sentence_clausifier.NIL != prop_literal_duals_foundP(args)) {
                return prop_sentence_clausifier.$prop_sentence_false$.getDynamicValue(thread);
            }
            return prop_sentence_conjoin(args);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 10114L)
    public static SubLObject prop_sentence_simplify_or(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)prop_sentence_clausifier.NIL;
        SubLObject args = (SubLObject)prop_sentence_clausifier.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(prop_sentence, prop_sentence, (SubLObject)prop_sentence_clausifier.$list13);
        operator = prop_sentence.first();
        final SubLObject current = args = prop_sentence.rest();
        args = Mapping.mapcar((SubLObject)prop_sentence_clausifier.$sym14$PROP_SENTENCE_SIMPLIFY, args);
        SubLObject lifted_args = (SubLObject)prop_sentence_clausifier.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)prop_sentence_clausifier.NIL;
        arg = cdolist_list_var.first();
        while (prop_sentence_clausifier.NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current_$9;
                final SubLObject datum_$8 = current_$9 = arg;
                SubLObject inner_operator = (SubLObject)prop_sentence_clausifier.NIL;
                SubLObject inner_args = (SubLObject)prop_sentence_clausifier.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)prop_sentence_clausifier.$list15);
                inner_operator = current_$9.first();
                current_$9 = (inner_args = current_$9.rest());
                if (prop_sentence_clausifier.$prop_sentence_or$.getDynamicValue(thread).eql(inner_operator)) {
                    SubLObject cdolist_list_var_$10 = inner_args;
                    SubLObject inner_arg = (SubLObject)prop_sentence_clausifier.NIL;
                    inner_arg = cdolist_list_var_$10.first();
                    while (prop_sentence_clausifier.NIL != cdolist_list_var_$10) {
                        lifted_args = (SubLObject)ConsesLow.cons(inner_arg, lifted_args);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        inner_arg = cdolist_list_var_$10.first();
                    }
                }
                else {
                    lifted_args = (SubLObject)ConsesLow.cons(arg, lifted_args);
                }
            }
            else {
                lifted_args = (SubLObject)ConsesLow.cons(arg, lifted_args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        args = Sequences.nreverse(lifted_args);
        args = Sequences.delete_duplicates(args, Symbols.symbol_function((SubLObject)prop_sentence_clausifier.EQUAL), (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED);
        args = Sequences.delete(prop_sentence_clausifier.$prop_sentence_false$.getDynamicValue(thread), args, Symbols.symbol_function((SubLObject)prop_sentence_clausifier.EQUAL), (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED, (SubLObject)prop_sentence_clausifier.UNPROVIDED);
        if (prop_sentence_clausifier.NIL == args) {
            return prop_sentence_clausifier.$prop_sentence_false$.getDynamicValue(thread);
        }
        if (prop_sentence_clausifier.NIL != list_utilities.singletonP(args)) {
            return args.first();
        }
        if (prop_sentence_clausifier.NIL != subl_promotions.memberP(prop_sentence_clausifier.$prop_sentence_true$.getDynamicValue(thread), args, Symbols.symbol_function((SubLObject)prop_sentence_clausifier.EQUAL), (SubLObject)prop_sentence_clausifier.UNPROVIDED)) {
            return prop_sentence_clausifier.$prop_sentence_true$.getDynamicValue(thread);
        }
        if (prop_sentence_clausifier.NIL != prop_literal_duals_foundP(args)) {
            return prop_sentence_clausifier.$prop_sentence_true$.getDynamicValue(thread);
        }
        return prop_sentence_disjoin(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 11482L)
    public static SubLObject prop_sentence_simplify_not(final SubLObject prop_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)prop_sentence_clausifier.NIL;
        SubLObject arg = (SubLObject)prop_sentence_clausifier.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(prop_sentence, prop_sentence, (SubLObject)prop_sentence_clausifier.$list16);
        operator = prop_sentence.first();
        SubLObject current = prop_sentence.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, prop_sentence, (SubLObject)prop_sentence_clausifier.$list16);
        arg = current.first();
        current = current.rest();
        if (prop_sentence_clausifier.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(prop_sentence, (SubLObject)prop_sentence_clausifier.$list16);
            return (SubLObject)prop_sentence_clausifier.NIL;
        }
        arg = prop_sentence_simplify(arg);
        if (arg.equal(prop_sentence_clausifier.$prop_sentence_true$.getDynamicValue(thread))) {
            return prop_sentence_clausifier.$prop_sentence_false$.getDynamicValue(thread);
        }
        if (arg.equal(prop_sentence_clausifier.$prop_sentence_false$.getDynamicValue(thread))) {
            return prop_sentence_clausifier.$prop_sentence_true$.getDynamicValue(thread);
        }
        if (arg.isCons() && prop_sentence_clausifier.$prop_sentence_not$.getDynamicValue(thread).eql(arg.first())) {
            return conses_high.second(arg);
        }
        return prop_sentence_negate(arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 12149L)
    public static SubLObject prop_literal_duals_foundP(final SubLObject args) {
        if (prop_sentence_clausifier.NIL == args) {
            return (SubLObject)prop_sentence_clausifier.NIL;
        }
        SubLObject first_arg = (SubLObject)prop_sentence_clausifier.NIL;
        SubLObject rest_args = (SubLObject)prop_sentence_clausifier.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)prop_sentence_clausifier.$list17);
        first_arg = args.first();
        final SubLObject current = rest_args = args.rest();
        if (prop_sentence_clausifier.NIL != prop_literal_duals_foundP(rest_args)) {
            return (SubLObject)prop_sentence_clausifier.T;
        }
        SubLObject cdolist_list_var = rest_args;
        SubLObject rest_arg = (SubLObject)prop_sentence_clausifier.NIL;
        rest_arg = cdolist_list_var.first();
        while (prop_sentence_clausifier.NIL != cdolist_list_var) {
            if (prop_sentence_clausifier.NIL != prop_literal_dual_p(first_arg, rest_arg)) {
                return (SubLObject)prop_sentence_clausifier.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rest_arg = cdolist_list_var.first();
        }
        return (SubLObject)prop_sentence_clausifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/prop-sentence-clausifier.lisp", position = 12466L)
    public static SubLObject prop_literal_dual_p(final SubLObject prop_literal1, final SubLObject prop_literal2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (prop_literal1.isCons() && prop_sentence_clausifier.$prop_sentence_not$.getDynamicValue(thread).eql(prop_literal1.first())) {
            return Equality.equal(conses_high.second(prop_literal1), prop_literal2);
        }
        if (prop_literal2.isCons() && prop_sentence_clausifier.$prop_sentence_not$.getDynamicValue(thread).eql(prop_literal2.first())) {
            return Equality.equal(prop_literal1, conses_high.second(prop_literal2));
        }
        return (SubLObject)prop_sentence_clausifier.NIL;
    }
    
    public static SubLObject declare_prop_sentence_clausifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_conjoin_p", "PROP-SENTENCE-CONJOIN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_disjoin_p", "PROP-SENTENCE-DISJOIN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_negation_p", "PROP-SENTENCE-NEGATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_conjoin", "PROP-SENTENCE-CONJOIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_disjoin", "PROP-SENTENCE-DISJOIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_negate", "PROP-SENTENCE-NEGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_negate_args", "PROP-SENTENCE-NEGATE-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_args", "PROP-SENTENCE-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "find_arg_with_operator", "FIND-ARG-WITH-OPERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_arg_operator", "PROP-SENTENCE-ARG-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_to_cnf", "PROP-SENTENCE-TO-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_to_dnf", "PROP-SENTENCE-TO-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_canon_negations_in", "PROP-SENTENCE-CANON-NEGATIONS-IN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_canon_disjunctions_in", "PROP-SENTENCE-CANON-DISJUNCTIONS-IN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_canon_conjunctions_in", "PROP-SENTENCE-CANON-CONJUNCTIONS-IN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_simplify", "PROP-SENTENCE-SIMPLIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_simplify_and", "PROP-SENTENCE-SIMPLIFY-AND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_simplify_or", "PROP-SENTENCE-SIMPLIFY-OR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_sentence_simplify_not", "PROP-SENTENCE-SIMPLIFY-NOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_literal_duals_foundP", "PROP-LITERAL-DUALS-FOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.prop_sentence_clausifier", "prop_literal_dual_p", "PROP-LITERAL-DUAL-P", 2, 0, false);
        return (SubLObject)prop_sentence_clausifier.NIL;
    }
    
    public static SubLObject init_prop_sentence_clausifier_file() {
        prop_sentence_clausifier.$prop_sentence_and$ = SubLFiles.defparameter("*PROP-SENTENCE-AND*", prop_sentence_clausifier.$const0$and);
        prop_sentence_clausifier.$prop_sentence_or$ = SubLFiles.defparameter("*PROP-SENTENCE-OR*", prop_sentence_clausifier.$const1$or);
        prop_sentence_clausifier.$prop_sentence_not$ = SubLFiles.defparameter("*PROP-SENTENCE-NOT*", prop_sentence_clausifier.$const2$not);
        prop_sentence_clausifier.$prop_sentence_true$ = SubLFiles.defparameter("*PROP-SENTENCE-TRUE*", prop_sentence_clausifier.$const3$True);
        prop_sentence_clausifier.$prop_sentence_false$ = SubLFiles.defparameter("*PROP-SENTENCE-FALSE*", prop_sentence_clausifier.$const4$False);
        return (SubLObject)prop_sentence_clausifier.NIL;
    }
    
    public static SubLObject setup_prop_sentence_clausifier_file() {
        return (SubLObject)prop_sentence_clausifier.NIL;
    }
    
    public void declareFunctions() {
        declare_prop_sentence_clausifier_file();
    }
    
    public void initializeVariables() {
        init_prop_sentence_clausifier_file();
    }
    
    public void runTopLevelForms() {
        setup_prop_sentence_clausifier_file();
    }
    
    static {
        me = (SubLFile)new prop_sentence_clausifier();
        prop_sentence_clausifier.$prop_sentence_and$ = null;
        prop_sentence_clausifier.$prop_sentence_or$ = null;
        prop_sentence_clausifier.$prop_sentence_not$ = null;
        prop_sentence_clausifier.$prop_sentence_true$ = null;
        prop_sentence_clausifier.$prop_sentence_false$ = null;
        $const0$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const1$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const2$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $const3$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $const4$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $sym5$PROP_SENTENCE_NEGATE = SubLObjectFactory.makeSymbol("PROP-SENTENCE-NEGATE");
        $sym6$PROP_SENTENCE_ARG_OPERATOR = SubLObjectFactory.makeSymbol("PROP-SENTENCE-ARG-OPERATOR");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INNER-ARG"));
        $str9$Can_t_handle__S = SubLObjectFactory.makeString("Can't handle ~S");
        $sym10$PROP_SENTENCE_CANON_NEGATIONS_IN = SubLObjectFactory.makeSymbol("PROP-SENTENCE-CANON-NEGATIONS-IN");
        $sym11$PROP_SENTENCE_CANON_DISJUNCTIONS_IN = SubLObjectFactory.makeSymbol("PROP-SENTENCE-CANON-DISJUNCTIONS-IN");
        $sym12$PROP_SENTENCE_CANON_CONJUNCTIONS_IN = SubLObjectFactory.makeSymbol("PROP-SENTENCE-CANON-CONJUNCTIONS-IN");
        $list13 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym14$PROP_SENTENCE_SIMPLIFY = SubLObjectFactory.makeSymbol("PROP-SENTENCE-SIMPLIFY");
        $list15 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("INNER-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("INNER-ARGS"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"));
        $list17 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("REST-ARGS"));
    }
}

/*

	Total time: 69 ms
	
*/