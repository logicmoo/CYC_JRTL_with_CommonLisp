package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class arguments extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.arguments";
    public static final String myFingerPrint = "358519124b8b7472f3bc2bf9e4dbd194c5369a554e1a35e6656b0b08d75a0974";
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 3339L)
    private static SubLSymbol $argument_types$;
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 3665L)
    private static SubLSymbol $argument_type_hierarchy$;
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 9092L)
    private static SubLSymbol $asserted_argument_tv_table$;
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 9406L)
    private static SubLSymbol $asserted_arguments$;
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 15479L)
    public static SubLSymbol $assertion_support_module$;
    private static final SubLList $list0;
    private static final SubLString $str1$mapping_Cyc_arguments;
    private static final SubLSymbol $sym2$DO_ASSERTIONS;
    private static final SubLSymbol $sym3$CDOLIST;
    private static final SubLSymbol $sym4$ASSERTION_ARGUMENTS;
    private static final SubLList $list5;
    private static final SubLString $str6$mapping_Cyc_belief_arguments;
    private static final SubLSymbol $sym7$DO_ARGUMENTS;
    private static final SubLSymbol $sym8$PWHEN;
    private static final SubLSymbol $sym9$BELIEF_P;
    private static final SubLList $list10;
    private static final SubLString $str11$mapping_Cyc_asserted_arguments;
    private static final SubLSymbol $sym12$ASSERTED_ARGUMENT_P;
    private static final SubLSymbol $sym13$ARGUMENT_P;
    private static final SubLList $list14;
    private static final SubLString $str15$Return_T_iff_OBJECT_is_an_HL_argu;
    private static final SubLList $list16;
    private static final SubLString $str17$unexpected_argument_type;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$ARGUMENT_TYPE_PROPER_GENLS;
    private static final SubLSymbol $sym21$ARGUMENT_EQUAL;
    private static final SubLList $list22;
    private static final SubLString $str23$Return_T_iff_ARGUMENT1_and_ARGUME;
    private static final SubLSymbol $sym24$ARGUMENT_TRUTH;
    private static final SubLList $list25;
    private static final SubLString $str26$Return_the_truth_of_ARGUMENT_;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$ARGUMENT_STRENGTH;
    private static final SubLString $str30$Return_the_strength_of_ARGUMENT_;
    private static final SubLList $list31;
    private static final SubLString $str32$unexpected_belief_type;
    private static final SubLString $str33$Return_T_iff_OBJECT_is_an_HL_asse;
    private static final SubLSymbol $kw34$ASSERTED_ARGUMENT;
    private static final SubLSymbol $sym35$EL_STRENGTH_SPEC_P;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$FIRST;
    private static final SubLSymbol $sym38$TV_P;
    private static final SubLSymbol $sym39$SECOND;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$SUPPORT_P;
    private static final SubLString $str42$Return_T_iff_OBJECT_can_be_a_supp;
    private static final SubLSymbol $sym43$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw44$SYNTACTICALLY_ILL_FORMED;
    private static final SubLSymbol $sym45$SUPPORT__;
    private static final SubLSymbol $kw46$ASSERTION;
    private static final SubLSymbol $sym47$SUPPORT_MODULE;
    private static final SubLList $list48;
    private static final SubLString $str49$Return_the_module_of_SUPPORT_;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$SUPPORT_SENTENCE;
    private static final SubLString $str53$Return_the_sentence_of_SUPPORT_;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$SUPPORT_FORMULA;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$SUPPORT_MT;
    private static final SubLString $str58$Return_the_microtheory_of_SUPPORT;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$SUPPORT_TRUTH;
    private static final SubLString $str61$Return_the_truth_of_SUPPORT_;
    private static final SubLSymbol $sym62$SUPPORT_STRENGTH;
    private static final SubLString $str63$Return_the_strength_of_SUPPORT_;
    private static final SubLSymbol $sym64$HL_SUPPORT_P;
    private static final SubLString $str65$Does_OBJECT_represent_an_HL_suppo;
    private static final SubLSymbol $kw66$TRUE_DEF;
    private static final SubLSymbol $sym67$HL_SUPPORT_MODULE_P;
    private static final SubLSymbol $sym68$POSSIBLY_CYCL_SENTENCE_P;
    private static final SubLSymbol $sym69$HLMT_P;
    private static final SubLSymbol $sym70$MAKE_HL_SUPPORT;
    private static final SubLList $list71;
    private static final SubLString $str72$Construct_a_new_HL_support_;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$ASSERTION_P;
    private static final SubLSymbol $sym76$INVALID_INDEXED_TERM_;
    private static final SubLSymbol $kw77$GENLPREDS;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$HL_JUSTIFICATION_P;
    private static final SubLSymbol $sym80$SUPPORT_EQUAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 729L)
    public static SubLObject do_arguments(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = (SubLObject)arguments.NIL;
        SubLObject argument = (SubLObject)arguments.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list0);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list0);
        argument = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : arguments.$str1$mapping_Cyc_arguments);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)arguments.$list0);
        current = current.rest();
        if (arguments.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)arguments.$sym2$DO_ASSERTIONS, (SubLObject)ConsesLow.list(assertion, message), (SubLObject)ConsesLow.listS((SubLObject)arguments.$sym3$CDOLIST, (SubLObject)ConsesLow.list(argument, (SubLObject)ConsesLow.list((SubLObject)arguments.$sym4$ASSERTION_ARGUMENTS, assertion)), ConsesLow.append(body, (SubLObject)arguments.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)arguments.$list0);
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 1251L)
    public static SubLObject do_beliefs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = (SubLObject)arguments.NIL;
        SubLObject argument = (SubLObject)arguments.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list5);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list5);
        argument = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : arguments.$str6$mapping_Cyc_belief_arguments);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)arguments.$list5);
        current = current.rest();
        if (arguments.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)arguments.$sym7$DO_ARGUMENTS, (SubLObject)ConsesLow.list(assertion, argument, message), (SubLObject)ConsesLow.listS((SubLObject)arguments.$sym8$PWHEN, (SubLObject)ConsesLow.list((SubLObject)arguments.$sym9$BELIEF_P, argument), ConsesLow.append(body, (SubLObject)arguments.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)arguments.$list5);
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 1712L)
    public static SubLObject do_asserted_arguments(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = (SubLObject)arguments.NIL;
        SubLObject argument = (SubLObject)arguments.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list10);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)arguments.$list10);
        argument = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : arguments.$str11$mapping_Cyc_asserted_arguments);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)arguments.$list10);
        current = current.rest();
        if (arguments.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)arguments.$sym7$DO_ARGUMENTS, (SubLObject)ConsesLow.list(assertion, argument, message), (SubLObject)ConsesLow.listS((SubLObject)arguments.$sym8$PWHEN, (SubLObject)ConsesLow.list((SubLObject)arguments.$sym12$ASSERTED_ARGUMENT_P, argument), ConsesLow.append(body, (SubLObject)arguments.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)arguments.$list10);
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 2200L)
    public static SubLObject argument_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != belief_p(v_object) || arguments.NIL != deduction_handles.deduction_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 2461L)
    public static SubLObject valid_argument(final SubLObject argument, SubLObject robust) {
        if (robust == arguments.UNPROVIDED) {
            robust = (SubLObject)arguments.NIL;
        }
        if (arguments.NIL != belief_p(argument)) {
            return (SubLObject)arguments.T;
        }
        if (arguments.NIL != deduction_handles.deduction_p(argument)) {
            return deduction_handles.valid_deduction(argument, robust);
        }
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 2747L)
    public static SubLObject argument_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != belief_spec_p(v_object) || arguments.NIL != deductions_high.deduction_spec_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 2914L)
    public static SubLObject argument_to_argument_spec(final SubLObject argument) {
        assert arguments.NIL != argument_p(argument) : argument;
        if (arguments.NIL != belief_p(argument)) {
            return belief_to_belief_spec(argument);
        }
        if (arguments.NIL != deduction_handles.deduction_p(argument)) {
            return deductions_high.deduction_to_deduction_spec(argument);
        }
        Errors.error((SubLObject)arguments.$str17$unexpected_argument_type);
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 3193L)
    public static SubLObject argument_spec_type(final SubLObject argument_spec) {
        return argument_spec.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 3454L)
    public static SubLObject argument_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, arguments.$argument_types$.getGlobalValue(), (SubLObject)arguments.UNPROVIDED, (SubLObject)arguments.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 4094L)
    public static SubLObject argument_type_hierarchy() {
        return arguments.$argument_type_hierarchy$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 4381L)
    public static SubLObject argument_type_proper_genls(final SubLObject argument_type) {
        final SubLObject pair = conses_high.assoc(argument_type, argument_type_hierarchy(), (SubLObject)arguments.UNPROVIDED, (SubLObject)arguments.UNPROVIDED);
        if (arguments.NIL == pair) {
            return (SubLObject)arguments.NIL;
        }
        final SubLObject immediate_proper_genls = conses_high.copy_list(conses_high.second(pair));
        final SubLObject recursive_proper_genls = Mapping.mapcan((SubLObject)arguments.$sym20$ARGUMENT_TYPE_PROPER_GENLS, immediate_proper_genls, arguments.EMPTY_SUBL_OBJECT_ARRAY);
        return ConsesLow.append(immediate_proper_genls, recursive_proper_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 4867L)
    public static SubLObject argument_type_genls(final SubLObject argument_type) {
        return (SubLObject)ConsesLow.cons(argument_type, argument_type_proper_genls(argument_type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 5062L)
    public static SubLObject argument_equal(final SubLObject argument1, final SubLObject argument2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != argument_p(argument1) && arguments.NIL != argument_p(argument2) && (argument1.eql(argument2) || arguments.NIL != ((arguments.NIL != belief_p(argument1)) ? SubLObjectFactory.makeBoolean(arguments.NIL != belief_p(argument2) && arguments.NIL != belief_equal(argument1, argument2)) : SubLObjectFactory.makeBoolean(arguments.NIL != deduction_handles.deduction_p(argument2) && arguments.NIL != deductions_high.deduction_equal(argument1, argument2)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 5533L)
    public static SubLObject argument_truth(final SubLObject argument) {
        enforceType(argument, arguments.$sym13$ARGUMENT_P);
        if (arguments.NIL != belief_p(argument)) {
            return belief_truth(argument);
        }
        return deductions_high.deduction_truth(argument);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 5790L)
    public static SubLObject argument_tv(final SubLObject argument) {
        assert arguments.NIL != argument_p(argument) : argument;
        if (arguments.NIL != belief_p(argument)) {
            return belief_tv(argument);
        }
        final SubLObject truth = deductions_high.deduction_truth(argument);
        final SubLObject strength = deductions_high.deduction_strength(argument);
        return enumeration_types.tv_from_truth_strength(truth, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 6117L)
    public static SubLObject argument_strength(final SubLObject argument) {
        enforceType(argument, arguments.$sym13$ARGUMENT_P);
        if (arguments.NIL != belief_p(argument)) {
            return belief_strength(argument);
        }
        return deductions_high.deduction_strength(argument);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 6392L)
    public static SubLObject remove_argument(final SubLObject argument, final SubLObject support) {
        if (arguments.NIL != belief_p(argument)) {
            return remove_belief(argument, support);
        }
        return deductions_interface.kb_remove_deduction(argument);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 6630L)
    public static SubLObject belief_p(final SubLObject v_object) {
        return asserted_argument_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 6849L)
    public static SubLObject belief_spec_p(final SubLObject v_object) {
        return asserted_argument_spec_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 7054L)
    public static SubLObject belief_to_belief_spec(final SubLObject belief) {
        assert arguments.NIL != belief_p(belief) : belief;
        if (arguments.NIL != asserted_argument_p(belief)) {
            return asserted_argument_to_asserted_argument_spec(belief);
        }
        Errors.error((SubLObject)arguments.$str32$unexpected_belief_type);
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 7275L)
    public static SubLObject remove_belief(final SubLObject belief, final SubLObject assertion) {
        return assertions_interface.kb_remove_asserted_argument(assertion, belief);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 7395L)
    public static SubLObject belief_equal(final SubLObject belief1, final SubLObject belief2) {
        return asserted_argument_equal(belief1, belief2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 7494L)
    public static SubLObject belief_truth(final SubLObject belief) {
        return asserted_argument_truth(belief);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 7575L)
    public static SubLObject belief_strength(final SubLObject belief) {
        return asserted_argument_strength(belief);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 7662L)
    public static SubLObject belief_tv(final SubLObject belief) {
        return asserted_argument_tv(belief);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 7737L)
    public static SubLObject asserted_argument_p(final SubLObject v_object) {
        return asserted_argument_token_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 7981L)
    public static SubLObject asserted_argument_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != list_utilities.doubletonP(v_object) && arguments.$kw34$ASSERTED_ARGUMENT == v_object.first() && arguments.NIL != enumeration_types.el_strength_spec_p(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 8211L)
    public static SubLObject asserted_argument_to_asserted_argument_spec(final SubLObject asserted_argument) {
        final SubLObject strength = asserted_argument_strength(asserted_argument);
        final SubLObject argument_spec = create_asserted_argument_spec(strength);
        return argument_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 8444L)
    public static SubLObject create_asserted_argument(final SubLObject assertion, final SubLObject tv) {
        return asserted_argument_token_from_tv(tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 8615L)
    public static SubLObject create_asserted_argument_spec(final SubLObject strength_spec) {
        assert arguments.NIL != enumeration_types.el_strength_spec_p(strength_spec) : strength_spec;
        return (SubLObject)ConsesLow.list((SubLObject)arguments.$kw34$ASSERTED_ARGUMENT, strength_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 8774L)
    public static SubLObject asserted_argument_spec_strength_spec(final SubLObject asserted_argument_spec) {
        return conses_high.second(asserted_argument_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 8893L)
    public static SubLObject kb_remove_asserted_argument_internal(final SubLObject asserted_argument) {
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 9559L)
    public static SubLObject asserted_argument_tokens() {
        return arguments.$asserted_arguments$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 9626L)
    public static SubLObject asserted_argument_token_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, arguments.$asserted_arguments$.getGlobalValue(), Symbols.symbol_function((SubLObject)arguments.EQ), (SubLObject)arguments.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 9732L)
    public static SubLObject asserted_argument_token_from_tv(final SubLObject tv) {
        assert arguments.NIL != enumeration_types.tv_p(tv) : tv;
        return Sequences.find(tv, arguments.$asserted_argument_tv_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)arguments.EQ), Symbols.symbol_function((SubLObject)arguments.$sym39$SECOND), (SubLObject)arguments.UNPROVIDED, (SubLObject)arguments.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 9879L)
    public static SubLObject tv_from_asserted_argument_token(final SubLObject asserted_argument) {
        return conses_high.second(Sequences.find(asserted_argument, arguments.$asserted_argument_tv_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)arguments.EQ), Symbols.symbol_function((SubLObject)arguments.$sym37$FIRST), (SubLObject)arguments.UNPROVIDED, (SubLObject)arguments.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 10033L)
    public static SubLObject make_empty_local_support_set() {
        return (SubLObject)arguments.$list40;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 10093L)
    public static SubLObject asserted_argument_equal(final SubLObject asserted_argument1, final SubLObject asserted_argument2) {
        return Equality.eq(asserted_argument1, asserted_argument2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 10242L)
    public static SubLObject asserted_argument_tv(final SubLObject asserted_argument) {
        if (arguments.NIL != asserted_argument_token_p(asserted_argument)) {
            return tv_from_asserted_argument_token(asserted_argument);
        }
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 10419L)
    public static SubLObject asserted_argument_strength(final SubLObject asserted_argument) {
        return enumeration_types.tv_strength(asserted_argument_tv(asserted_argument));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 10549L)
    public static SubLObject asserted_argument_truth(final SubLObject asserted_argument) {
        return enumeration_types.tv_truth(asserted_argument_tv(asserted_argument));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 10673L)
    public static SubLObject list_of_cycl_support_p(final SubLObject v_object) {
        if (arguments.NIL == list_utilities.proper_list_p(v_object)) {
            return (SubLObject)arguments.NIL;
        }
        SubLObject cdolist_list_var = v_object;
        SubLObject support = (SubLObject)arguments.NIL;
        support = cdolist_list_var.first();
        while (arguments.NIL != cdolist_list_var) {
            if (arguments.NIL == cycl_support_p(support)) {
                return (SubLObject)arguments.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return (SubLObject)arguments.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 10932L)
    public static SubLObject cycl_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != assertion_handles.assertion_p(v_object) || (arguments.NIL != list_utilities.proper_list_p(v_object) && arguments.NIL != list_utilities.lengthE(v_object, (SubLObject)arguments.FOUR_INTEGER, (SubLObject)arguments.UNPROVIDED) && arguments.NIL != hl_supports.hl_support_module_p(v_object.first()) && arguments.NIL != el_utilities.possibly_sentence_p(conses_high.second(v_object)) && arguments.NIL != hlmt.hlmt_p(conses_high.third(v_object)) && arguments.NIL != enumeration_types.el_strength_p(conses_high.fourth(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 11289L)
    public static SubLObject support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != reified_support_p(v_object) || arguments.NIL != hl_support_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 11476L)
    public static SubLObject reified_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != assertion_handles.assertion_p(v_object) || arguments.NIL != kb_hl_support_handles.kb_hl_support_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 11585L)
    public static SubLObject supports_p(final SubLObject v_object) {
        return support_list_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 11654L)
    public static SubLObject support_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != list_utilities.proper_list_p(v_object) && arguments.NIL != list_utilities.every_in_list((SubLObject)arguments.$sym41$SUPPORT_P, v_object, (SubLObject)arguments.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 11825L)
    public static SubLObject valid_supportP(final SubLObject support, SubLObject robust) {
        if (robust == arguments.UNPROVIDED) {
            robust = (SubLObject)arguments.NIL;
        }
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return assertion_handles.valid_assertionP(support, (SubLObject)arguments.UNPROVIDED);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_support_handles.valid_kb_hl_supportP(support, robust);
        }
        if (arguments.NIL != hl_support_p(support)) {
            return valid_hl_supportP(support);
        }
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 12223L)
    public static SubLObject ill_formed_hl_supportP(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return assertion_syntactically_illformedP(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_support_syntactically_illformedP(support);
        }
        if (arguments.NIL != hl_support_p(support)) {
            return hl_support_syntactically_illformedP(support);
        }
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 12576L)
    public static SubLObject hl_support_syntactically_illformedP(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject brokenness = (SubLObject)arguments.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)arguments.$sym43$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (arguments.NIL == wff.el_wff_syntaxP(hl_support_sentence(hl_support), (SubLObject)arguments.UNPROVIDED)) {
                        brokenness = (SubLObject)arguments.$kw44$SYNTACTICALLY_ILL_FORMED;
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)arguments.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            brokenness = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return brokenness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 12990L)
    public static SubLObject kb_hl_support_syntactically_illformedP(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject brokenness = (SubLObject)arguments.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)arguments.$sym43$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (arguments.NIL == wff.el_wff_syntaxP(kb_hl_supports_high.kb_hl_support_sentence(kb_hl_support), (SubLObject)arguments.UNPROVIDED)) {
                        brokenness = (SubLObject)arguments.$kw44$SYNTACTICALLY_ILL_FORMED;
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)arguments.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            brokenness = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return brokenness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 13379L)
    public static SubLObject assertion_syntactically_illformedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject brokenness = (SubLObject)arguments.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)arguments.$sym43$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (arguments.NIL == wff.el_wff_syntaxP(fi.assertion_hl_formula(assertion, (SubLObject)arguments.UNPROVIDED), (SubLObject)arguments.UNPROVIDED)) {
                        brokenness = (SubLObject)arguments.$kw44$SYNTACTICALLY_ILL_FORMED;
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)arguments.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            brokenness = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return brokenness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 13888L)
    public static SubLObject support_equal(final SubLObject support1, final SubLObject support2) {
        if (arguments.NIL != assertion_handles.assertion_p(support1) || arguments.NIL != assertion_handles.assertion_p(support2)) {
            return Equality.eql(support1, support2);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support1) || arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support2)) {
            return Equality.eql(support1, support2);
        }
        return Equality.equal(support1, support2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 14191L)
    public static SubLObject support_L(final SubLObject support1, final SubLObject support2) {
        if (arguments.NIL != assertion_handles.assertion_p(support1)) {
            if (arguments.NIL == assertion_handles.assertion_p(support2)) {
                return (SubLObject)arguments.T;
            }
            if (arguments.NIL != assertions_high.rule_assertionP(support1)) {
                if (arguments.NIL != assertions_high.rule_assertionP(support2)) {
                    return Numbers.numL(assertion_handles.assertion_id(support1), assertion_handles.assertion_id(support2));
                }
                return (SubLObject)arguments.T;
            }
            else {
                if (arguments.NIL != assertions_high.rule_assertionP(support2)) {
                    return (SubLObject)arguments.NIL;
                }
                return Numbers.numL(assertion_handles.assertion_id(support1), assertion_handles.assertion_id(support2));
            }
        }
        else if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support1)) {
            if (arguments.NIL != assertion_handles.assertion_p(support2)) {
                return (SubLObject)arguments.NIL;
            }
            if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support2)) {
                return Numbers.numL(kb_hl_support_handles.kb_hl_support_id(support1), kb_hl_support_handles.kb_hl_support_id(support2));
            }
            return (SubLObject)arguments.T;
        }
        else {
            if (arguments.NIL != assertion_handles.assertion_p(support2)) {
                return (SubLObject)arguments.NIL;
            }
            if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support2)) {
                return (SubLObject)arguments.NIL;
            }
            return kb_utilities.term_L(support1, support2, (SubLObject)arguments.UNPROVIDED, (SubLObject)arguments.UNPROVIDED, (SubLObject)arguments.UNPROVIDED);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 15346L)
    public static SubLObject sort_supports(final SubLObject supports) {
        return Sort.sort(supports, Symbols.symbol_function((SubLObject)arguments.$sym45$SUPPORT__), (SubLObject)arguments.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 15612L)
    public static SubLObject support_module(final SubLObject support) {
        enforceType(support, arguments.$sym41$SUPPORT_P);
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return arguments.$assertion_support_module$.getGlobalValue();
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_module(support);
        }
        return hl_support_module(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 15951L)
    public static SubLObject support_sentence(final SubLObject support) {
        enforceType(support, arguments.$sym41$SUPPORT_P);
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_formula(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_sentence(support);
        }
        return hl_support_sentence(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 16285L)
    public static SubLObject support_sentence_operator(final SubLObject support) {
        return cycl_utilities.formula_operator(support_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 16458L)
    public static SubLObject support_formula(final SubLObject support) {
        return support_sentence(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 16573L)
    public static SubLObject support_el_sentence(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_el_formula(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_el_sentence(support);
        }
        return cycl_utilities.hl_to_el(hl_support_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 16942L)
    public static SubLObject support_ist_sentence(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_ist_formula(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_ist_sentence(support);
        }
        return el_utilities.make_ist_sentence(hl_support_mt(support), hl_support_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 17314L)
    public static SubLObject support_el_ist_sentence(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_el_ist_formula(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_el_ist_sentence(support);
        }
        return el_utilities.make_ist_sentence(support_elmt(support), support_el_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 17697L)
    public static SubLObject support_cons(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_cons(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_cons(support);
        }
        return el_utilities.elf_to_list(hl_support_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 18135L)
    public static SubLObject support_mt(final SubLObject support) {
        enforceType(support, arguments.$sym41$SUPPORT_P);
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_mt(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_mt(support);
        }
        return hl_support_mt(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 18451L)
    public static SubLObject support_elmt(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return uncanonicalizer.assertion_elmt(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_elmt(support);
        }
        return cycl_utilities.hl_to_el(hl_support_mt(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 18764L)
    public static SubLObject support_justification(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return (SubLObject)ConsesLow.list(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_justification(support);
        }
        return hl_supports.hl_support_justify(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 19150L)
    public static SubLObject support_truth(final SubLObject support) {
        enforceType(support, arguments.$sym41$SUPPORT_P);
        return enumeration_types.tv_truth(support_tv(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 19333L)
    public static SubLObject support_strength(final SubLObject support) {
        enforceType(support, arguments.$sym41$SUPPORT_P);
        return enumeration_types.tv_strength(support_tv(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 19530L)
    public static SubLObject support_tv(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.cyc_assertion_tv(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_tv(support);
        }
        return hl_support_tv(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 19780L)
    public static SubLObject hl_support_from_support(final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return hl_support_from_assertion(support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_hl_supports_high.kb_hl_support_hl_support(support);
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 20024L)
    public static SubLObject contextualize_support(final SubLObject support, final SubLObject new_mt) {
        return contextualize_hl_support(hl_support_from_support(support), new_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 20159L)
    public static SubLObject canonicalize_supports(final SubLObject supports, SubLObject possibly_create_new_kb_hl_supportsP) {
        if (possibly_create_new_kb_hl_supportsP == arguments.UNPROVIDED) {
            possibly_create_new_kb_hl_supportsP = (SubLObject)arguments.T;
        }
        SubLObject new_supports = (SubLObject)arguments.NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)arguments.NIL;
        support = cdolist_list_var.first();
        while (arguments.NIL != cdolist_list_var) {
            new_supports = (SubLObject)ConsesLow.cons(canonicalize_support(support, possibly_create_new_kb_hl_supportsP), new_supports);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Sort.sort(new_supports, (SubLObject)arguments.$sym45$SUPPORT__, (SubLObject)arguments.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 20554L)
    public static SubLObject canonicalize_support(final SubLObject support, SubLObject possibly_create_new_kb_hl_supportP) {
        if (possibly_create_new_kb_hl_supportP == arguments.UNPROVIDED) {
            possibly_create_new_kb_hl_supportP = (SubLObject)arguments.T;
        }
        if (arguments.NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return support;
        }
        return canonicalize_hl_support(support, possibly_create_new_kb_hl_supportP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 21088L)
    public static SubLObject canonicalize_hl_support(final SubLObject hl_support, SubLObject possibly_create_new_kb_hl_supportP) {
        if (possibly_create_new_kb_hl_supportP == arguments.UNPROVIDED) {
            possibly_create_new_kb_hl_supportP = (SubLObject)arguments.T;
        }
        SubLObject canon_support = assertion_from_hl_support(hl_support);
        if (arguments.NIL == canon_support) {
            if (arguments.NIL != possibly_create_new_kb_hl_supportP) {
                canon_support = kb_hl_supports_high.find_or_possibly_create_kb_hl_support(hl_support);
            }
            else {
                canon_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            }
        }
        return (arguments.NIL != canon_support) ? canon_support : hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 21514L)
    public static SubLObject hl_support_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && arguments.NIL != list_utilities.proper_list_p(v_object) && arguments.NIL != list_utilities.lengthE(v_object, (SubLObject)arguments.FOUR_INTEGER, (SubLObject)arguments.UNPROVIDED) && arguments.NIL != hl_supports.hl_support_module_p(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 21793L)
    public static SubLObject make_hl_support(final SubLObject hl_module, final SubLObject sentence, SubLObject mt, SubLObject tv) {
        if (mt == arguments.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == arguments.UNPROVIDED) {
            tv = (SubLObject)arguments.$kw66$TRUE_DEF;
        }
        enforceType(hl_module, arguments.$sym67$HL_SUPPORT_MODULE_P);
        enforceType(sentence, arguments.$sym68$POSSIBLY_CYCL_SENTENCE_P);
        enforceType(mt, arguments.$sym69$HLMT_P);
        enforceType(tv, arguments.$sym38$TV_P);
        return (SubLObject)ConsesLow.list(hl_module, sentence, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 22243L)
    public static SubLObject hl_support_from_assertion(final SubLObject assertion) {
        assert arguments.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject hl_module = support_module(assertion);
        final SubLObject formula = support_formula(assertion);
        final SubLObject mt = support_mt(assertion);
        final SubLObject tv = support_tv(assertion);
        return make_hl_support(hl_module, formula, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 22600L)
    public static SubLObject assertion_from_hl_support(final SubLObject hl_support) {
        SubLObject assertion = (SubLObject)arguments.NIL;
        if (hl_support_module(hl_support).eql(arguments.$assertion_support_module$.getGlobalValue())) {
            assertion = czer_meta.find_assertion_cycl(hl_support_sentence(hl_support), hl_support_mt(hl_support));
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 22878L)
    public static SubLObject valid_hl_supportP(final SubLObject hl_support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != hl_support_p(hl_support) && arguments.NIL != hl_supports.hl_support_module_p(hl_support_module(hl_support)) && arguments.NIL != el_utilities.possibly_sentence_p(hl_support_sentence(hl_support)) && arguments.NIL == cycl_utilities.expression_find_if((SubLObject)arguments.$sym76$INVALID_INDEXED_TERM_, hl_support_sentence(hl_support), (SubLObject)arguments.UNPROVIDED, (SubLObject)arguments.UNPROVIDED) && arguments.NIL == cycl_utilities.expression_find_if((SubLObject)arguments.$sym76$INVALID_INDEXED_TERM_, hl_support_mt(hl_support), (SubLObject)arguments.UNPROVIDED, (SubLObject)arguments.UNPROVIDED) && arguments.NIL != hlmt.closed_hlmt_p(hl_support_mt(hl_support)) && arguments.NIL != enumeration_types.tv_p(hl_support_tv(hl_support)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 23350L)
    public static SubLObject hl_support_with_module_p(final SubLObject v_object, final SubLObject module) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != hl_support_p(v_object) && module.eql(hl_support_module(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 23490L)
    public static SubLObject hl_support_module(final SubLObject hl_support) {
        assert arguments.NIL != hl_support_p(hl_support) : hl_support;
        return hl_support.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 23621L)
    public static SubLObject hl_support_sentence(final SubLObject hl_support) {
        assert arguments.NIL != hl_support_p(hl_support) : hl_support;
        return conses_high.second(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 23741L)
    public static SubLObject hl_support_mt(final SubLObject hl_support) {
        assert arguments.NIL != hl_support_p(hl_support) : hl_support;
        return conses_high.third(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 23854L)
    public static SubLObject hl_support_tv(final SubLObject hl_support) {
        assert arguments.NIL != hl_support_p(hl_support) : hl_support;
        return conses_high.fourth(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 23968L)
    public static SubLObject genl_preds_support_p(final SubLObject hl_support) {
        return Equality.eq(hl_support_module(hl_support), (SubLObject)arguments.$kw77$GENLPREDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 24084L)
    public static SubLObject contextualize_hl_support(final SubLObject hl_support, final SubLObject new_mt) {
        SubLObject hl_module = (SubLObject)arguments.NIL;
        SubLObject sentence = (SubLObject)arguments.NIL;
        SubLObject mt = (SubLObject)arguments.NIL;
        SubLObject tv = (SubLObject)arguments.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(hl_support, hl_support, (SubLObject)arguments.$list78);
        hl_module = hl_support.first();
        SubLObject current = hl_support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, hl_support, (SubLObject)arguments.$list78);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, hl_support, (SubLObject)arguments.$list78);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, hl_support, (SubLObject)arguments.$list78);
        tv = current.first();
        current = current.rest();
        if (arguments.NIL == current) {
            return make_hl_support(hl_module, sentence, new_mt, tv);
        }
        cdestructuring_bind.cdestructuring_bind_error(hl_support, (SubLObject)arguments.$list78);
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 24298L)
    public static SubLObject hl_justification_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != list_utilities.non_dotted_list_p(v_object) && arguments.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)arguments.$sym41$SUPPORT_P), v_object, (SubLObject)arguments.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 24559L)
    public static SubLObject hl_justification_list_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p((SubLObject)arguments.$sym79$HL_JUSTIFICATION_P, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 24661L)
    public static SubLObject non_empty_hl_justification_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != list_utilities.proper_list_p(v_object) && arguments.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)arguments.$sym41$SUPPORT_P), v_object, (SubLObject)arguments.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 24795L)
    public static SubLObject empty_hl_justification_p(final SubLObject v_object) {
        return Types.sublisp_null(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 24868L)
    public static SubLObject justification_equal(final SubLObject justification1, final SubLObject justification2) {
        return list_utilities.multisets_equalP(justification1, justification2, (SubLObject)arguments.$sym80$SUPPORT_EQUAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 25009L)
    public static SubLObject canonicalize_hl_justification(final SubLObject hl_justification) {
        assert arguments.NIL != hl_justification_p(hl_justification) : hl_justification;
        return Sort.sort(conses_high.copy_list(hl_justification), Symbols.symbol_function((SubLObject)arguments.$sym45$SUPPORT__), (SubLObject)arguments.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 25259L)
    public static SubLObject hl_support_justification_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(arguments.NIL != list_utilities.non_dotted_list_p(v_object) && arguments.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)arguments.$sym64$HL_SUPPORT_P), v_object, (SubLObject)arguments.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 25575L)
    public static SubLObject hl_justification_to_hl_support_justification(final SubLObject hl_justification) {
        assert arguments.NIL != hl_justification_p(hl_justification) : hl_justification;
        SubLObject supports = (SubLObject)arguments.NIL;
        SubLObject cdolist_list_var = hl_justification;
        SubLObject support = (SubLObject)arguments.NIL;
        support = cdolist_list_var.first();
        while (arguments.NIL != cdolist_list_var) {
            if (arguments.NIL != assertion_handles.assertion_p(support)) {
                support = hl_support_from_assertion(support);
            }
            supports = (SubLObject)ConsesLow.cons(support, supports);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return Sequences.nreverse(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 25987L)
    public static SubLObject reified_support_has_dependent_with_supportP(SubLObject reified_support, final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(reified_support)) {
            return assertion_utilities.assertion_has_dependent_with_supportP(reified_support, support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(reified_support)) {
            return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP(reified_support, support);
        }
        if (arguments.NIL == hl_support_p(reified_support)) {
            return (SubLObject)arguments.NIL;
        }
        reified_support = kb_hl_supports_high.find_kb_hl_support(reified_support);
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(reified_support)) {
            return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP(reified_support, support);
        }
        return (SubLObject)arguments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arguments.lisp", position = 26647L)
    public static SubLObject reified_support_has_dependent_with_supportP_kb_hl_support_aware_version(SubLObject reified_support, final SubLObject support) {
        if (arguments.NIL != assertion_handles.assertion_p(reified_support)) {
            return assertion_utilities.assertion_has_dependent_with_supportP_kb_hl_support_aware_version(reified_support, support);
        }
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(reified_support)) {
            return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP(reified_support, support);
        }
        if (arguments.NIL == hl_support_p(reified_support)) {
            return (SubLObject)arguments.NIL;
        }
        reified_support = kb_hl_supports_high.find_kb_hl_support(reified_support);
        if (arguments.NIL != kb_hl_support_handles.kb_hl_support_p(reified_support)) {
            return kb_hl_supports_high.kb_hl_support_has_dependent_with_supportP(reified_support, support);
        }
        return (SubLObject)arguments.NIL;
    }
    
    public static SubLObject declare_arguments_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.arguments", "do_arguments", "DO-ARGUMENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.arguments", "do_beliefs", "DO-BELIEFS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.arguments", "do_asserted_arguments", "DO-ASSERTED-ARGUMENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_p", "ARGUMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "valid_argument", "VALID-ARGUMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_spec_p", "ARGUMENT-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_to_argument_spec", "ARGUMENT-TO-ARGUMENT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_spec_type", "ARGUMENT-SPEC-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_type_p", "ARGUMENT-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_type_hierarchy", "ARGUMENT-TYPE-HIERARCHY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_type_proper_genls", "ARGUMENT-TYPE-PROPER-GENLS", 1, 0, false);
        new $argument_type_proper_genls$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_type_genls", "ARGUMENT-TYPE-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_equal", "ARGUMENT-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_truth", "ARGUMENT-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_tv", "ARGUMENT-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "argument_strength", "ARGUMENT-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "remove_argument", "REMOVE-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "belief_p", "BELIEF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "belief_spec_p", "BELIEF-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "belief_to_belief_spec", "BELIEF-TO-BELIEF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "remove_belief", "REMOVE-BELIEF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "belief_equal", "BELIEF-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "belief_truth", "BELIEF-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "belief_strength", "BELIEF-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "belief_tv", "BELIEF-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_p", "ASSERTED-ARGUMENT-P", 1, 0, false);
        new $asserted_argument_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_spec_p", "ASSERTED-ARGUMENT-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_to_asserted_argument_spec", "ASSERTED-ARGUMENT-TO-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "create_asserted_argument", "CREATE-ASSERTED-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "create_asserted_argument_spec", "CREATE-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_spec_strength_spec", "ASSERTED-ARGUMENT-SPEC-STRENGTH-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "kb_remove_asserted_argument_internal", "KB-REMOVE-ASSERTED-ARGUMENT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_tokens", "ASSERTED-ARGUMENT-TOKENS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_token_p", "ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_token_from_tv", "ASSERTED-ARGUMENT-TOKEN-FROM-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "tv_from_asserted_argument_token", "TV-FROM-ASSERTED-ARGUMENT-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "make_empty_local_support_set", "MAKE-EMPTY-LOCAL-SUPPORT-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_equal", "ASSERTED-ARGUMENT-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_tv", "ASSERTED-ARGUMENT-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_strength", "ASSERTED-ARGUMENT-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "asserted_argument_truth", "ASSERTED-ARGUMENT-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "list_of_cycl_support_p", "LIST-OF-CYCL-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "cycl_support_p", "CYCL-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_p", "SUPPORT-P", 1, 0, false);
        new $support_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "reified_support_p", "REIFIED-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "supports_p", "SUPPORTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_list_p", "SUPPORT-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "valid_supportP", "VALID-SUPPORT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "ill_formed_hl_supportP", "ILL-FORMED-HL-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_syntactically_illformedP", "HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "kb_hl_support_syntactically_illformedP", "KB-HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "assertion_syntactically_illformedP", "ASSERTION-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_equal", "SUPPORT-EQUAL", 2, 0, false);
        new $support_equal$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_L", "SUPPORT-<", 2, 0, false);
        new $support_L$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "sort_supports", "SORT-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_module", "SUPPORT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_sentence", "SUPPORT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_sentence_operator", "SUPPORT-SENTENCE-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_formula", "SUPPORT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_el_sentence", "SUPPORT-EL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_ist_sentence", "SUPPORT-IST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_el_ist_sentence", "SUPPORT-EL-IST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_cons", "SUPPORT-CONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_mt", "SUPPORT-MT", 1, 0, false);
        new $support_mt$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_elmt", "SUPPORT-ELMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_justification", "SUPPORT-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_truth", "SUPPORT-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_strength", "SUPPORT-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "support_tv", "SUPPORT-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_from_support", "HL-SUPPORT-FROM-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "contextualize_support", "CONTEXTUALIZE-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "canonicalize_supports", "CANONICALIZE-SUPPORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "canonicalize_support", "CANONICALIZE-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "canonicalize_hl_support", "CANONICALIZE-HL-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_p", "HL-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "make_hl_support", "MAKE-HL-SUPPORT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_from_assertion", "HL-SUPPORT-FROM-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "assertion_from_hl_support", "ASSERTION-FROM-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "valid_hl_supportP", "VALID-HL-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_with_module_p", "HL-SUPPORT-WITH-MODULE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_module", "HL-SUPPORT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_sentence", "HL-SUPPORT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_mt", "HL-SUPPORT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_tv", "HL-SUPPORT-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "genl_preds_support_p", "GENL-PREDS-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "contextualize_hl_support", "CONTEXTUALIZE-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_justification_p", "HL-JUSTIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_justification_list_p", "HL-JUSTIFICATION-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "non_empty_hl_justification_p", "NON-EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "empty_hl_justification_p", "EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "justification_equal", "JUSTIFICATION-EQUAL", 2, 0, false);
        new $justification_equal$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "canonicalize_hl_justification", "CANONICALIZE-HL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_support_justification_p", "HL-SUPPORT-JUSTIFICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "hl_justification_to_hl_support_justification", "HL-JUSTIFICATION-TO-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "reified_support_has_dependent_with_supportP", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arguments", "reified_support_has_dependent_with_supportP_kb_hl_support_aware_version", "REIFIED-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false);
        return (SubLObject)arguments.NIL;
    }
    
    public static SubLObject init_arguments_file() {
        arguments.$argument_types$ = SubLFiles.deflexical("*ARGUMENT-TYPES*", (SubLObject)arguments.$list18);
        arguments.$argument_type_hierarchy$ = SubLFiles.deflexical("*ARGUMENT-TYPE-HIERARCHY*", (SubLObject)arguments.$list19);
        arguments.$asserted_argument_tv_table$ = SubLFiles.deflexical("*ASSERTED-ARGUMENT-TV-TABLE*", (SubLObject)arguments.$list36);
        arguments.$asserted_arguments$ = SubLFiles.deflexical("*ASSERTED-ARGUMENTS*", Mapping.mapcar(Symbols.symbol_function((SubLObject)arguments.$sym37$FIRST), arguments.$asserted_argument_tv_table$.getGlobalValue()));
        arguments.$assertion_support_module$ = SubLFiles.deflexical("*ASSERTION-SUPPORT-MODULE*", (SubLObject)arguments.$kw46$ASSERTION);
        return (SubLObject)arguments.NIL;
    }
    
    public static SubLObject setup_arguments_file() {
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym13$ARGUMENT_P, (SubLObject)arguments.$list14, (SubLObject)arguments.$str15$Return_T_iff_OBJECT_is_an_HL_argu, (SubLObject)arguments.NIL, (SubLObject)arguments.$list16);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym21$ARGUMENT_EQUAL, (SubLObject)arguments.$list22, (SubLObject)arguments.$str23$Return_T_iff_ARGUMENT1_and_ARGUME, (SubLObject)arguments.NIL, (SubLObject)arguments.$list16);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym24$ARGUMENT_TRUTH, (SubLObject)arguments.$list25, (SubLObject)arguments.$str26$Return_the_truth_of_ARGUMENT_, (SubLObject)arguments.$list27, (SubLObject)arguments.$list28);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym29$ARGUMENT_STRENGTH, (SubLObject)arguments.$list25, (SubLObject)arguments.$str30$Return_the_strength_of_ARGUMENT_, (SubLObject)arguments.$list27, (SubLObject)arguments.$list31);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym12$ASSERTED_ARGUMENT_P, (SubLObject)arguments.$list14, (SubLObject)arguments.$str33$Return_T_iff_OBJECT_is_an_HL_asse, (SubLObject)arguments.NIL, (SubLObject)arguments.$list16);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym41$SUPPORT_P, (SubLObject)arguments.$list14, (SubLObject)arguments.$str42$Return_T_iff_OBJECT_can_be_a_supp, (SubLObject)arguments.NIL, (SubLObject)arguments.$list16);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym47$SUPPORT_MODULE, (SubLObject)arguments.$list48, (SubLObject)arguments.$str49$Return_the_module_of_SUPPORT_, (SubLObject)arguments.$list50, (SubLObject)arguments.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym52$SUPPORT_SENTENCE, (SubLObject)arguments.$list48, (SubLObject)arguments.$str53$Return_the_sentence_of_SUPPORT_, (SubLObject)arguments.$list50, (SubLObject)arguments.$list54);
        access_macros.define_obsolete_register((SubLObject)arguments.$sym55$SUPPORT_FORMULA, (SubLObject)arguments.$list56);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym57$SUPPORT_MT, (SubLObject)arguments.$list48, (SubLObject)arguments.$str58$Return_the_microtheory_of_SUPPORT, (SubLObject)arguments.$list50, (SubLObject)arguments.$list59);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym60$SUPPORT_TRUTH, (SubLObject)arguments.$list48, (SubLObject)arguments.$str61$Return_the_truth_of_SUPPORT_, (SubLObject)arguments.$list50, (SubLObject)arguments.$list28);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym62$SUPPORT_STRENGTH, (SubLObject)arguments.$list48, (SubLObject)arguments.$str63$Return_the_strength_of_SUPPORT_, (SubLObject)arguments.$list50, (SubLObject)arguments.$list31);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym64$HL_SUPPORT_P, (SubLObject)arguments.$list14, (SubLObject)arguments.$str65$Does_OBJECT_represent_an_HL_suppo, (SubLObject)arguments.NIL, (SubLObject)arguments.$list16);
        utilities_macros.register_cyc_api_function((SubLObject)arguments.$sym70$MAKE_HL_SUPPORT, (SubLObject)arguments.$list71, (SubLObject)arguments.$str72$Construct_a_new_HL_support_, (SubLObject)arguments.$list73, (SubLObject)arguments.$list74);
        return (SubLObject)arguments.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_arguments_file();
    }
    
    @Override
	public void initializeVariables() {
        init_arguments_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_arguments_file();
    }
    
    static {
        me = (SubLFile)new arguments();
        arguments.$argument_types$ = null;
        arguments.$argument_type_hierarchy$ = null;
        arguments.$asserted_argument_tv_table$ = null;
        arguments.$asserted_arguments$ = null;
        arguments.$assertion_support_module$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc arguments"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str1$mapping_Cyc_arguments = SubLObjectFactory.makeString("mapping Cyc arguments");
        $sym2$DO_ASSERTIONS = SubLObjectFactory.makeSymbol("DO-ASSERTIONS");
        $sym3$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym4$ASSERTION_ARGUMENTS = SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENTS");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc belief arguments"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str6$mapping_Cyc_belief_arguments = SubLObjectFactory.makeString("mapping Cyc belief arguments");
        $sym7$DO_ARGUMENTS = SubLObjectFactory.makeSymbol("DO-ARGUMENTS");
        $sym8$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym9$BELIEF_P = SubLObjectFactory.makeSymbol("BELIEF-P");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc asserted arguments"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str11$mapping_Cyc_asserted_arguments = SubLObjectFactory.makeString("mapping Cyc asserted arguments");
        $sym12$ASSERTED_ARGUMENT_P = SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-P");
        $sym13$ARGUMENT_P = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str15$Return_T_iff_OBJECT_is_an_HL_argu = SubLObjectFactory.makeString("Return T iff OBJECT is an HL argument structure.");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $str17$unexpected_argument_type = SubLObjectFactory.makeString("unexpected argument type");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("BELIEF"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"));
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT"), (SubLObject)arguments.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BELIEF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BELIEF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGUMENT"))));
        $sym20$ARGUMENT_TYPE_PROPER_GENLS = SubLObjectFactory.makeSymbol("ARGUMENT-TYPE-PROPER-GENLS");
        $sym21$ARGUMENT_EQUAL = SubLObjectFactory.makeSymbol("ARGUMENT-EQUAL");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT2"));
        $str23$Return_T_iff_ARGUMENT1_and_ARGUME = SubLObjectFactory.makeString("Return T iff ARGUMENT1 and ARGUMENT2 are equivalent arguments.");
        $sym24$ARGUMENT_TRUTH = SubLObjectFactory.makeSymbol("ARGUMENT-TRUTH");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"));
        $str26$Return_the_truth_of_ARGUMENT_ = SubLObjectFactory.makeString("Return the truth of ARGUMENT.");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT-P")));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P"));
        $sym29$ARGUMENT_STRENGTH = SubLObjectFactory.makeSymbol("ARGUMENT-STRENGTH");
        $str30$Return_the_strength_of_ARGUMENT_ = SubLObjectFactory.makeString("Return the strength of ARGUMENT.");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-STRENGTH-P"));
        $str32$unexpected_belief_type = SubLObjectFactory.makeString("unexpected belief type");
        $str33$Return_T_iff_OBJECT_is_an_HL_asse = SubLObjectFactory.makeString("Return T iff OBJECT is an HL asserted argument structure.");
        $kw34$ASSERTED_ARGUMENT = SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT");
        $sym35$EL_STRENGTH_SPEC_P = SubLObjectFactory.makeSymbol("EL-STRENGTH-SPEC-P");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-TRUE-MON"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-MON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-TRUE-DEF"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-UNKNOWN"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-FALSE-DEF"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE-DEF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-FALSE-MON"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE-MON")));
        $sym37$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym38$TV_P = SubLObjectFactory.makeSymbol("TV-P");
        $sym39$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCAL"));
        $sym41$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $str42$Return_T_iff_OBJECT_can_be_a_supp = SubLObjectFactory.makeString("Return T iff OBJECT can be a support in an argument.");
        $sym43$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw44$SYNTACTICALLY_ILL_FORMED = SubLObjectFactory.makeKeyword("SYNTACTICALLY-ILL-FORMED");
        $sym45$SUPPORT__ = SubLObjectFactory.makeSymbol("SUPPORT-<");
        $kw46$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $sym47$SUPPORT_MODULE = SubLObjectFactory.makeSymbol("SUPPORT-MODULE");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"));
        $str49$Return_the_module_of_SUPPORT_ = SubLObjectFactory.makeString("Return the module of SUPPORT.");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-P")));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT-MODULE-P"));
        $sym52$SUPPORT_SENTENCE = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE");
        $str53$Return_the_sentence_of_SUPPORT_ = SubLObjectFactory.makeString("Return the sentence of SUPPORT.");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"));
        $sym55$SUPPORT_FORMULA = SubLObjectFactory.makeSymbol("SUPPORT-FORMULA");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE"));
        $sym57$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $str58$Return_the_microtheory_of_SUPPORT = SubLObjectFactory.makeString("Return the microtheory of SUPPORT.");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLMT-P"));
        $sym60$SUPPORT_TRUTH = SubLObjectFactory.makeSymbol("SUPPORT-TRUTH");
        $str61$Return_the_truth_of_SUPPORT_ = SubLObjectFactory.makeString("Return the truth of SUPPORT.");
        $sym62$SUPPORT_STRENGTH = SubLObjectFactory.makeSymbol("SUPPORT-STRENGTH");
        $str63$Return_the_strength_of_SUPPORT_ = SubLObjectFactory.makeString("Return the strength of SUPPORT.");
        $sym64$HL_SUPPORT_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $str65$Does_OBJECT_represent_an_HL_suppo = SubLObjectFactory.makeString("Does OBJECT represent an HL support?");
        $kw66$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $sym67$HL_SUPPORT_MODULE_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-MODULE-P");
        $sym68$POSSIBLY_CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("POSSIBLY-CYCL-SENTENCE-P");
        $sym69$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym70$MAKE_HL_SUPPORT = SubLObjectFactory.makeSymbol("MAKE-HL-SUPPORT");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("*MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")));
        $str72$Construct_a_new_HL_support_ = SubLObjectFactory.makeString("Construct a new HL support.");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT-MODULE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-CYCL-SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("TV-P")));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-SUPPORT-P"));
        $sym75$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym76$INVALID_INDEXED_TERM_ = SubLObjectFactory.makeSymbol("INVALID-INDEXED-TERM?");
        $kw77$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $sym79$HL_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P");
        $sym80$SUPPORT_EQUAL = SubLObjectFactory.makeSymbol("SUPPORT-EQUAL");
    }
    
    public static final class $argument_type_proper_genls$UnaryFunction extends UnaryFunction
    {
        public $argument_type_proper_genls$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ARGUMENT-TYPE-PROPER-GENLS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return arguments.argument_type_proper_genls(arg1);
        }
    }
    
    public static final class $asserted_argument_p$UnaryFunction extends UnaryFunction
    {
        public $asserted_argument_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASSERTED-ARGUMENT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return arguments.asserted_argument_p(arg1);
        }
    }
    
    public static final class $support_p$UnaryFunction extends UnaryFunction
    {
        public $support_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SUPPORT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return arguments.support_p(arg1);
        }
    }
    
    public static final class $support_equal$BinaryFunction extends BinaryFunction
    {
        public $support_equal$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SUPPORT-EQUAL"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return arguments.support_equal(arg1, arg2);
        }
    }
    
    public static final class $support_L$BinaryFunction extends BinaryFunction
    {
        public $support_L$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SUPPORT-<"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return arguments.support_L(arg1, arg2);
        }
    }
    
    public static final class $support_mt$UnaryFunction extends UnaryFunction
    {
        public $support_mt$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SUPPORT-MT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return arguments.support_mt(arg1);
        }
    }
    
    public static final class $justification_equal$BinaryFunction extends BinaryFunction
    {
        public $justification_equal$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("JUSTIFICATION-EQUAL"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return arguments.justification_equal(arg1, arg2);
        }
    }
}

/*

	Total time: 324 ms
	
*/