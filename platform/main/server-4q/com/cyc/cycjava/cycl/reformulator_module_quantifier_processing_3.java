/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_ternary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityGE;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_existential;
import static com.cyc.cycjava.cycl.el_utilities.make_implication;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_universal;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.unmake_ternary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_quantifier_processing_3 extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new reformulator_module_quantifier_processing_3();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $subcollection_function_mt$ = makeSymbol("*SUBCOLLECTION-FUNCTION-MT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $gen_quant_relations_from$ = makeSymbol("*GEN-QUANT-RELATIONS-FROM*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $gen_quant_relations_to$ = makeSymbol("*GEN-QUANT-RELATIONS-TO*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $quantproc_3_microseconds$ = makeSymbol("*QUANTPROC-3-MICROSECONDS*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLObject $$QuantifierProcessing_3_RLModule = reader_make_constant_shell("QuantifierProcessing-3-RLModule");

    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("QUANTPROC-3-REQUIRED"), $COST, makeSymbol("QUANTPROC-3-COST"), makeKeyword("REFORMULATE"), makeSymbol("QUANTPROC-3-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Handles the reformulation of NL-quantified expressions."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$contains-Underspecified \n     (#$NLQuantFn-3 #$Every-NLAttr \n \t       (#$NLNumberFn #$Singular-NLAttr #$SNRNP)) \n     (#$NLQuantFn-3 #$Some-NLAttr \n \t       (#$NLNumberFn #$Mass-NLAttr #$RNAMolecule)))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$implies \n     (#$isa ?VAR0 #$SNRNP) \n     (#$contains-Underspecified ?VAR0 \n      (#$NLQuantFn-3 #$Some-NLAttr \n       (#$NLNumberFn #$Mass-NLAttr #$RNAMolecule))))") });

    static private final SubLList $list3 = list(new SubLObject[]{ reader_make_constant_shell("Every-NLAttr"), reader_make_constant_shell("Some-NLAttr"), reader_make_constant_shell("BareForm-NLAttr"), reader_make_constant_shell("Each-NLAttr"), reader_make_constant_shell("No-NLAttr"), reader_make_constant_shell("Many-NLAttr"), reader_make_constant_shell("Most-NLAttr"), reader_make_constant_shell("Several-NLAttr"), reader_make_constant_shell("Few-NLAttr") });

    private static final SubLObject $$NLQuantFn_3 = reader_make_constant_shell("NLQuantFn-3");

    static private final SubLList $list5 = list(reader_make_constant_shell("Indefinite-NLAttr"), reader_make_constant_shell("Definite-NLAttr"));

    private static final SubLObject $$NLDefinitenessFn_3 = reader_make_constant_shell("NLDefinitenessFn-3");

    static private final SubLList $list7 = list(list(reader_make_constant_shell("NLNumberFn"), list(makeKeyword("ISA"), reader_make_constant_shell("NLNumberAttribute")), list($TEST, makeSymbol("ISA-COLLECTION?"))));

    static private final SubLList $list8 = list(list(reader_make_constant_shell("NLNumberFn"), list(makeKeyword("ISA"), reader_make_constant_shell("NLNumberAttribute")), list($TEST, makeSymbol("ISA-COLLECTION?"))), list($TEST, makeSymbol("NUMBERP")));

    static private final SubLList $list9 = list(reader_make_constant_shell("NLQuantFn-3"), list(reader_make_constant_shell("NumericalQuant-NLAttrFn"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("NLNumberFn"), list(makeKeyword("ISA"), reader_make_constant_shell("NLNumberAttribute")), list($TEST, makeSymbol("ISA-COLLECTION?"))), list($TEST, makeSymbol("NUMBERP")));

    static private final SubLList $list10 = list(reader_make_constant_shell("NLQuantFn"), list(reader_make_constant_shell("NumericalQuant-NLAttrFn"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("NLNumberFn"), list(makeKeyword("ISA"), reader_make_constant_shell("NLNumberAttribute")), list($TEST, makeSymbol("ISA-COLLECTION?"))));

    static private final SubLList $list11 = list(list($TEST, makeSymbol("NL-TAG-FN-FORT-3?")), list($TEST, makeSymbol("NON-GEN-QUANT-ATTRIBUTE?")), list(reader_make_constant_shell("NLNumberFn"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?"))), list($TEST, makeSymbol("NUMBERP")));

    static private final SubLList $list12 = list(list($TEST, makeSymbol("NL-TAG-FN-FORT-3?")), list($TEST, makeSymbol("NON-GEN-QUANT-ATTRIBUTE?")), list(reader_make_constant_shell("NLNumberFn"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?"))));



    static private final SubLList $list14 = list(reader_make_constant_shell("Definite-NLAttr"), reader_make_constant_shell("Indefinite-NLAttr"));

    static private final SubLList $list15 = list(reader_make_constant_shell("BareForm-NLAttr"));

    static private final SubLList $list16 = list(reader_make_constant_shell("CardinalityOfFn"), makeKeyword("ANYTHING"));

    static private final SubLList $list17 = list(reader_make_constant_shell("BareForm-NLAttr"), reader_make_constant_shell("Some-NLAttr"));

    static private final SubLList $list18 = list(reader_make_constant_shell("Indefinite-NLAttr"));



    private static final SubLObject $const20$TypeInstanceTernaryRuleMacroPredi = reader_make_constant_shell("TypeInstanceTernaryRuleMacroPredicate");

    private static final SubLObject $const22$InstanceTypeTernaryRuleMacroPredi = reader_make_constant_shell("InstanceTypeTernaryRuleMacroPredicate");

    static private final SubLList $list24 = list(reader_make_constant_shell("most-GenQuantRelnFrom"), reader_make_constant_shell("many-GenQuantRelnFrom"), reader_make_constant_shell("few-GenQuantRelnFrom"), reader_make_constant_shell("several-GenQuantRelnFrom"), reader_make_constant_shell("no-GenQuantRelnFrom"));

    static private final SubLList $list25 = list(reader_make_constant_shell("most-GenQuantRelnTo"), reader_make_constant_shell("many-GenQuantRelnTo"), reader_make_constant_shell("few-GenQuantRelnTo"), reader_make_constant_shell("several-GenQuantRelnTo"), reader_make_constant_shell("no-GenQuantRelnTo"));

    private static final SubLInteger $int$30000 = makeInteger(30000);

    static private final SubLList $list27 = list(reader_make_constant_shell("Every-NLAttr"));

    static private final SubLList $list28 = list(reader_make_constant_shell("Some-NLAttr"));

    static private final SubLList $list29 = list(reader_make_constant_shell("Each-NLAttr"));

    static private final SubLList $list30 = list(reader_make_constant_shell("Most-NLAttr"), reader_make_constant_shell("Many-NLAttr"), reader_make_constant_shell("Several-NLAttr"), reader_make_constant_shell("Few-NLAttr"));

    static private final SubLList $list31 = list(reader_make_constant_shell("No-NLAttr"));

    static private final SubLList $list32 = list(reader_make_constant_shell("Definite-NLAttr"));

    private static final SubLObject $$is_Underspecified = reader_make_constant_shell("is-Underspecified");







    static private final SubLString $$$CardinalityOfFn_1 = makeString("CardinalityOfFn 1");

    private static final SubLObject $$most_GenQuantRelnTo = reader_make_constant_shell("most-GenQuantRelnTo");

    private static final SubLObject $$most_GenQuantRelnToType = reader_make_constant_shell("most-GenQuantRelnToType");

    static private final SubLString $str40$3_4 = makeString("3.4");

    private static final SubLObject $$few_GenQuantRelnTo = reader_make_constant_shell("few-GenQuantRelnTo");

    private static final SubLObject $$few_GenQuantRelnToType = reader_make_constant_shell("few-GenQuantRelnToType");

    static private final SubLString $str43$11_5_1 = makeString("11.5.1");

    private static final SubLObject $$many_GenQuantRelnTo = reader_make_constant_shell("many-GenQuantRelnTo");

    private static final SubLObject $$many_GenQuantRelnToType = reader_make_constant_shell("many-GenQuantRelnToType");

    static private final SubLString $str46$2_4 = makeString("2.4");

    private static final SubLObject $$several_GenQuantRelnTo = reader_make_constant_shell("several-GenQuantRelnTo");

    private static final SubLObject $$several_GenQuantRelnToType = reader_make_constant_shell("several-GenQuantRelnToType");

    static private final SubLString $str49$7_5_1 = makeString("7.5.1");

    private static final SubLObject $$no_GenQuantRelnTo = reader_make_constant_shell("no-GenQuantRelnTo");

    private static final SubLObject $$no_GenQuantRelnToFromType = reader_make_constant_shell("no-GenQuantRelnToFromType");

    static private final SubLString $str52$9_2_5 = makeString("9.2.5");

    private static final SubLObject $$most_GenQuantRelnFrom = reader_make_constant_shell("most-GenQuantRelnFrom");

    private static final SubLObject $$most_GenQuantRelnFromType = reader_make_constant_shell("most-GenQuantRelnFromType");

    static private final SubLString $str55$3_3 = makeString("3.3");

    private static final SubLObject $$few_GenQuantRelnFrom = reader_make_constant_shell("few-GenQuantRelnFrom");

    private static final SubLObject $$few_GenQuantRelnFromType = reader_make_constant_shell("few-GenQuantRelnFromType");

    static private final SubLString $str58$11_5_2 = makeString("11.5.2");

    private static final SubLObject $$many_GenQuantRelnFrom = reader_make_constant_shell("many-GenQuantRelnFrom");

    private static final SubLObject $$many_GenQuantRelnFromType = reader_make_constant_shell("many-GenQuantRelnFromType");

    static private final SubLString $str61$2_5 = makeString("2.5");

    private static final SubLObject $$several_GenQuantRelnFrom = reader_make_constant_shell("several-GenQuantRelnFrom");

    private static final SubLObject $$several_GenQuantRelnFromType = reader_make_constant_shell("several-GenQuantRelnFromType");

    static private final SubLString $str64$7_5_2 = makeString("7.5.2");

    private static final SubLObject $$no_GenQuantRelnFrom = reader_make_constant_shell("no-GenQuantRelnFrom");

    static private final SubLString $str66$9_1_5 = makeString("9.1.5");



    static private final SubLList $list68 = list(reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Mass-NLAttr"));

    private static final SubLObject $$Most_NLAttr = reader_make_constant_shell("Most-NLAttr");

    static private final SubLString $str70$GenQuant_2_1 = makeString("GenQuant 2.1");

    private static final SubLObject $$Many_NLAttr = reader_make_constant_shell("Many-NLAttr");

    static private final SubLString $str72$GenQuant_2_2 = makeString("GenQuant 2.2");

    private static final SubLObject $$Few_NLAttr = reader_make_constant_shell("Few-NLAttr");

    static private final SubLString $str74$GenQuant_2_3 = makeString("GenQuant 2.3");

    private static final SubLObject $$Several_NLAttr = reader_make_constant_shell("Several-NLAttr");

    static private final SubLString $str76$GenQuant_2_4 = makeString("GenQuant 2.4");

    static private final SubLString $str77$GenQuant_3_1 = makeString("GenQuant 3.1");

    static private final SubLString $str78$GenQuant_3_2 = makeString("GenQuant 3.2");

    static private final SubLString $str79$GenQuant_3_3 = makeString("GenQuant 3.3");

    static private final SubLString $str80$GenQuant_3_4 = makeString("GenQuant 3.4");

    private static final SubLObject $$Plural_NLAttr = reader_make_constant_shell("Plural-NLAttr");

    static private final SubLString $$$GenQuant_1 = makeString("GenQuant 1");





    private static final SubLObject $$Every_NLAttr = reader_make_constant_shell("Every-NLAttr");

    private static final SubLObject $$Some_NLAttr = reader_make_constant_shell("Some-NLAttr");

    static private final SubLList $list87 = list(reader_make_constant_shell("Thing"));

    static private final SubLList $list88 = list(reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Mass-NLAttr"), reader_make_constant_shell("Singular-NLAttr"));

    static private final SubLList $list89 = list(TWO_INTEGER, ONE_INTEGER);

    private static final SubLObject $$Generic_NLAttr = reader_make_constant_shell("Generic-NLAttr");

    static private final SubLString $str91$BAREFORM_1 = makeString("BAREFORM-1");

    static private final SubLString $str92$BAREFORM_2 = makeString("BAREFORM-2");

    static private final SubLString $str93$BAREFORM_3 = makeString("BAREFORM-3");

    private static final SubLObject $$Singular_NLAttr = reader_make_constant_shell("Singular-NLAttr");

    static private final SubLList $list95 = list(ONE_INTEGER, TWO_INTEGER);

    static private final SubLString $str96$5_1_or_5_2 = makeString("5.1 or 5.2");

    static private final SubLList $list97 = list(reader_make_constant_shell("Singular-NLAttr"), reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Mass-NLAttr"));

    static private final SubLString $str98$9_1 = makeString("9.1");

    static private final SubLString $str99$9_2 = makeString("9.2");



    static private final SubLString $str101$9_5_ = makeString("9.5+");

    static private final SubLList $list102 = list(reader_make_constant_shell("Singular-NLAttr"), reader_make_constant_shell("Generic-NLAttr"));





    static private final SubLString $str105$4_2 = makeString("4.2");

    static private final SubLString $str106$6_1 = makeString("6.1");

    static private final SubLList $list107 = list(reader_make_constant_shell("Mass-NLAttr"), reader_make_constant_shell("Plural-NLAttr"));









    static private final SubLString $str112$6_4_1 = makeString("6.4.1");





    private static final SubLObject $$num_GenQuant = reader_make_constant_shell("num-GenQuant");

    static private final SubLString $str116$10_1 = makeString("10.1");









    static private final SubLList $list122 = list(reader_make_constant_shell("Mass-NLAttr"), reader_make_constant_shell("Singular-NLAttr"));

    static private final SubLString $str123$8_1_or_8_2 = makeString("8.1 or 8.2");

    static private final SubLList $list124 = list(reader_make_constant_shell("BareForm-NLAttr"), reader_make_constant_shell("Every-NLAttr"), reader_make_constant_shell("Each-NLAttr"));

    static private final SubLString $str125$8_2_5 = makeString("8.2.5");

    static private final SubLList $list126 = list(reader_make_constant_shell("Mass-NLAttr"), reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Singular-NLAttr"));

    static private final SubLString $str127$8_3_1 = makeString("8.3.1");

    private static final SubLSymbol QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER = makeSymbol("QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER");

    static private final SubLList $list129 = list(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER });

    static private final SubLList $list133 = list(makeKeyword("SWITCH-FIRST"), makeKeyword("SHIFT-LEFT"), makeKeyword("SWITCH-FIRST"), makeKeyword("SHIFT-RIGHT"));

    // Definitions
    /**
     *
     *
     * @return boolean; t iff EXPRESSION has an argument of the form
    (NLQuantFn-3 ?ATTR1 (#$NLNumberFn ?ATTR2 ?COL)),
    and the operator of EXPRESSION is a predicate in MT,
    ?ATTR2 is an NLNumberAttribute,
    ?ATTR1 is either #$Every-NLAttr, #$Some-NLAttr, or #$BareForm-NLAttr,
    and ?COL is a collection in MT.
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION has an argument of the form\r\n(NLQuantFn-3 ?ATTR1 (#$NLNumberFn ?ATTR2 ?COL)),\r\nand the operator of EXPRESSION is a predicate in MT,\r\n?ATTR2 is an NLNumberAttribute,\r\n?ATTR1 is either #$Every-NLAttr, #$Some-NLAttr, or #$BareForm-NLAttr,\r\nand ?COL is a collection in MT.")
    public static final SubLObject quantproc_3_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                if (NIL != el_formula_p(asent)) {
                    {
                        SubLObject matchP = NIL;
                        SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                        SubLObject rest = NIL;
                        for (rest = args; !((NIL != matchP) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject arg = rest.first();
                                if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_any_nl_quant_fn_expressionP(arg, mt)) {
                                    {
                                        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                                        if (NIL != fort_types_interface.isa_predicateP(pred, mt)) {
                                            matchP = T;
                                        }
                                    }
                                }
                                matchP = makeBoolean((NIL != matchP) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_subcol_expressionP(arg, mt)));
                                matchP = makeBoolean((NIL != matchP) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nested_subcol_expressionP(arg, mt)));
                                matchP = makeBoolean((NIL != matchP) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_cardinality_of_fn_expressionP(arg, mt)));
                            }
                        }
                        matchP = makeBoolean((NIL != matchP) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_gen_quant_reln_from_expressionP(asent, mt)));
                        matchP = makeBoolean((NIL != matchP) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_gen_quant_reln_to_expressionP(asent, mt)));
                        return matchP;
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     *
     *
     * @return boolean; t iff EXPRESSION has an argument of the form
    (NLQuantFn-3 ?ATTR1 (#$NLNumberFn ?ATTR2 ?COL)),
    and the operator of EXPRESSION is a predicate in MT,
    ?ATTR2 is an NLNumberAttribute,
    ?ATTR1 is either #$Every-NLAttr, #$Some-NLAttr, or #$BareForm-NLAttr,
    and ?COL is a collection in MT.
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION has an argument of the form\r\n(NLQuantFn-3 ?ATTR1 (#$NLNumberFn ?ATTR2 ?COL)),\r\nand the operator of EXPRESSION is a predicate in MT,\r\n?ATTR2 is an NLNumberAttribute,\r\n?ATTR1 is either #$Every-NLAttr, #$Some-NLAttr, or #$BareForm-NLAttr,\r\nand ?COL is a collection in MT.")
    public static SubLObject quantproc_3_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            if (NIL != el_formula_p(asent)) {
                SubLObject matchP = NIL;
                final SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject rest;
                SubLObject arg;
                SubLObject pred;
                for (rest = NIL, rest = args; (NIL == matchP) && (NIL != rest); matchP = makeBoolean((NIL != matchP) || (NIL != quantproc_3_subcol_expressionP(arg, mt))) , matchP = makeBoolean((NIL != matchP) || (NIL != quantproc_3_nested_subcol_expressionP(arg, mt))) , matchP = makeBoolean((NIL != matchP) || (NIL != quantproc_3_cardinality_of_fn_expressionP(arg, mt))) , rest = rest.rest()) {
                    arg = rest.first();
                    if (NIL != quantproc_3_any_nl_quant_fn_expressionP(arg, mt)) {
                        pred = cycl_utilities.atomic_sentence_predicate(asent);
                        if (NIL != fort_types_interface.isa_predicateP(pred, mt)) {
                            matchP = T;
                        }
                    }
                }
                matchP = makeBoolean((NIL != matchP) || (NIL != quantproc_3_gen_quant_reln_from_expressionP(asent, mt)));
                matchP = makeBoolean((NIL != matchP) || (NIL != quantproc_3_gen_quant_reln_to_expressionP(asent, mt)));
                return matchP;
            }
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_any_nl_quant_fn_expressionP_alt(SubLObject expression, SubLObject mt) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(expression, mt, $list_alt3, $$NLQuantFn_3)) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(expression, mt, $list_alt5, $$NLDefinitenessFn_3))) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_numerical_quant_fn_expressionP(expression, mt)));
    }

    public static SubLObject quantproc_3_any_nl_quant_fn_expressionP(final SubLObject expression, final SubLObject mt) {
        return makeBoolean(((NIL != quantproc_3_nl_quant_fn_expressionP(expression, mt, $list3, $$NLQuantFn_3)) || (NIL != quantproc_3_nl_quant_fn_expressionP(expression, mt, $list5, $$NLDefinitenessFn_3))) || (NIL != quantproc_3_numerical_quant_fn_expressionP(expression, mt)));
    }

    /**
     *
     *
     * @return boolean; t iff EXPRESSION is of the form
    (TARGET-NL-QUANT-FN <member of NL-ATTR-LIST> (#$NLNumberFn <nl-number-attribute> <collection>))
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION is of the form\r\n(TARGET-NL-QUANT-FN <member of NL-ATTR-LIST> (#$NLNumberFn <nl-number-attribute> <collection>))")
    public static final SubLObject quantproc_3_nl_quant_fn_expressionP_alt(SubLObject expression, SubLObject mt, SubLObject nl_attr_list, SubLObject target_nl_quant_fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != el_formula_p(expression)) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject pcase_var = formula_arity(expression, UNPROVIDED);
                                    if (pcase_var.eql(TWO_INTEGER)) {
                                        if (NIL == ans) {
                                            {
                                                SubLObject csome_list_var = nl_attr_list;
                                                SubLObject nl_attr = NIL;
                                                for (nl_attr = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , nl_attr = csome_list_var.first()) {
                                                    ans = formula_pattern_match.formula_matches_pattern(expression, listS(target_nl_quant_fn, nl_attr, $list_alt7));
                                                }
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql(THREE_INTEGER)) {
                                            if (NIL == ans) {
                                                {
                                                    SubLObject csome_list_var = nl_attr_list;
                                                    SubLObject nl_attr = NIL;
                                                    for (nl_attr = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , nl_attr = csome_list_var.first()) {
                                                        ans = formula_pattern_match.formula_matches_pattern(expression, listS(target_nl_quant_fn, nl_attr, $list_alt8));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff EXPRESSION is of the form
    (TARGET-NL-QUANT-FN <member of NL-ATTR-LIST> (#$NLNumberFn <nl-number-attribute> <collection>))
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION is of the form\r\n(TARGET-NL-QUANT-FN <member of NL-ATTR-LIST> (#$NLNumberFn <nl-number-attribute> <collection>))")
    public static SubLObject quantproc_3_nl_quant_fn_expressionP(final SubLObject expression, final SubLObject mt, final SubLObject nl_attr_list, final SubLObject target_nl_quant_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != el_formula_p(expression)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pcase_var = formula_arity(expression, UNPROVIDED);
                if (pcase_var.eql(TWO_INTEGER)) {
                    if (NIL == ans) {
                        SubLObject csome_list_var;
                        SubLObject nl_attr;
                        for (csome_list_var = nl_attr_list, nl_attr = NIL, nl_attr = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = formula_pattern_match.formula_matches_pattern(expression, listS(target_nl_quant_fn, nl_attr, $list7)) , csome_list_var = csome_list_var.rest() , nl_attr = csome_list_var.first()) {
                        }
                    }
                } else
                    if (pcase_var.eql(THREE_INTEGER) && (NIL == ans)) {
                        SubLObject csome_list_var;
                        SubLObject nl_attr;
                        for (csome_list_var = nl_attr_list, nl_attr = NIL, nl_attr = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = formula_pattern_match.formula_matches_pattern(expression, listS(target_nl_quant_fn, nl_attr, $list8)) , csome_list_var = csome_list_var.rest() , nl_attr = csome_list_var.first()) {
                        }
                    }

            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    /**
     *
     *
     * @return boolean; t iff EXPRESSION is of the form
    (NLQuantFn-3 (NumericalQuant-NLAttrFn ?N) (NLNumberFn ??NUMBER ?COLL))
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION is of the form\r\n(NLQuantFn-3 (NumericalQuant-NLAttrFn ?N) (NLNumberFn ??NUMBER ?COLL))")
    public static final SubLObject quantproc_3_numerical_quant_fn_expressionP_alt(SubLObject expression, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        ans = makeBoolean((NIL != el_formula_p(expression)) && ((NIL != formula_pattern_match.formula_matches_pattern(expression, $list_alt9)) || (NIL != formula_pattern_match.formula_matches_pattern(expression, $list_alt10))));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff EXPRESSION is of the form
    (NLQuantFn-3 (NumericalQuant-NLAttrFn ?N) (NLNumberFn ??NUMBER ?COLL))
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION is of the form\r\n(NLQuantFn-3 (NumericalQuant-NLAttrFn ?N) (NLNumberFn ??NUMBER ?COLL))")
    public static SubLObject quantproc_3_numerical_quant_fn_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = makeBoolean((NIL != el_formula_p(expression)) && ((NIL != formula_pattern_match.formula_matches_pattern(expression, $list9)) || (NIL != formula_pattern_match.formula_matches_pattern(expression, $list10))));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject subcollection_function_naut_sans_mtP_alt(SubLObject naut) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return reformulator_module_quantifier_unifier_3.subcollection_function_nautP(naut, $subcollection_function_mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject subcollection_function_naut_sans_mtP(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return reformulator_module_quantifier_unifier_3.subcollection_function_nautP(naut, $subcollection_function_mt$.getDynamicValue(thread));
    }

    public static final SubLObject quantproc_3_subcol_expressionP_alt(SubLObject expression, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != el_formula_p(expression)) {
                    {
                        SubLObject _prev_bind_0 = $subcollection_function_mt$.currentBinding(thread);
                        try {
                            $subcollection_function_mt$.bind(mt, thread);
                            {
                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                {
                                    SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        ans = makeBoolean((NIL != formula_pattern_match.formula_matches_pattern(expression, $list_alt11)) || (NIL != formula_pattern_match.formula_matches_pattern(expression, $list_alt12)));
                                    } finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        } finally {
                            $subcollection_function_mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject quantproc_3_subcol_expressionP(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != el_formula_p(expression)) {
            final SubLObject _prev_bind_0 = $subcollection_function_mt$.currentBinding(thread);
            try {
                $subcollection_function_mt$.bind(mt, thread);
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    ans = makeBoolean((NIL != formula_pattern_match.formula_matches_pattern(expression, $list11)) || (NIL != formula_pattern_match.formula_matches_pattern(expression, $list12)));
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                $subcollection_function_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static final SubLObject non_gen_quant_attributeP_alt(SubLObject obj) {
        return makeBoolean(NIL == isa.isaP(obj, $$NLGenQuantAttribute, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject non_gen_quant_attributeP(final SubLObject obj) {
        return makeBoolean(NIL == isa.isaP(obj, $$NLGenQuantAttribute, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject quantproc_3_nested_subcol_expressionP_alt(SubLObject expression, SubLObject mt) {
        if (NIL != el_formula_p(expression)) {
            {
                SubLObject args = cycl_utilities.formula_args(expression, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    if ((NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt14, $$NLDefinitenessFn_3)) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt15, $$NLQuantFn_3))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quantproc_3_nested_subcol_expressionP(final SubLObject expression, final SubLObject mt) {
        if (NIL != el_formula_p(expression)) {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(expression, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != quantproc_3_nl_quant_fn_expressionP(arg, mt, $list14, $$NLDefinitenessFn_3)) || (NIL != quantproc_3_nl_quant_fn_expressionP(arg, mt, $list15, $$NLQuantFn_3))) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_cardinality_of_fn_expressionP_alt(SubLObject expression, SubLObject mt) {
        return makeBoolean((NIL != el_formula_p(expression)) && (NIL != formula_pattern_match.formula_matches_pattern(expression, $list_alt16)));
    }

    public static SubLObject quantproc_3_cardinality_of_fn_expressionP(final SubLObject expression, final SubLObject mt) {
        return makeBoolean((NIL != el_formula_p(expression)) && (NIL != formula_pattern_match.formula_matches_pattern(expression, $list16)));
    }

    /**
     *
     *
     * @return keyword :to-type if the operator in EXPRESSION is a *-GenQuantRelnTo predicate and the 3rd arg is and existential quantifier expression
     * @return keyword :from-type if the operator EXPRESSION is a *-GenQuantRelnFrom predicate and the 2nd arg is an existential quantifier expression
     */
    @LispMethod(comment = "@return keyword :to-type if the operator in EXPRESSION is a *-GenQuantRelnTo predicate and the 3rd arg is and existential quantifier expression\r\n@return keyword :from-type if the operator EXPRESSION is a *-GenQuantRelnFrom predicate and the 2nd arg is an existential quantifier expression")
    public static final SubLObject quantproc_3_gen_quant_reln_type_arg_position_alt(SubLObject expression, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_ternary_formula_p(expression)) {
                {
                    SubLObject quant_attr_list = $list_alt17;
                    SubLObject def_attr_list = $list_alt18;
                    SubLObject result = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject gen_quant_reln = unmake_ternary_formula(expression);
                        SubLObject pred = thread.secondMultipleValue();
                        SubLObject first_arg = thread.thirdMultipleValue();
                        SubLObject second_arg = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (((NIL != isa.isaP(gen_quant_reln, $$GeneralizedQuantifierRelation, mt, UNPROVIDED)) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && TWO_INTEGER.numE(arity.arity(pred))) {
                            if ((NIL != isa.isaP(gen_quant_reln, $const20$TypeInstanceTernaryRuleMacroPredi, mt, UNPROVIDED)) && ((NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(second_arg, mt, quant_attr_list, $$NLQuantFn_3)) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(second_arg, mt, def_attr_list, $$NLDefinitenessFn_3)))) {
                                result = $TO_TYPE;
                                return result;
                            } else {
                                if ((NIL != isa.isaP(gen_quant_reln, $const22$InstanceTypeTernaryRuleMacroPredi, mt, UNPROVIDED)) && ((NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(first_arg, mt, quant_attr_list, $$NLQuantFn_3)) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(first_arg, mt, def_attr_list, $$NLDefinitenessFn_3)))) {
                                    result = $FROM_TYPE;
                                    return result;
                                } else {
                                    return result;
                                }
                            }
                        }
                    }
                    return NIL;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return keyword :to-type if the operator in EXPRESSION is a *-GenQuantRelnTo predicate and the 3rd arg is and existential quantifier expression
     * @return keyword :from-type if the operator EXPRESSION is a *-GenQuantRelnFrom predicate and the 2nd arg is an existential quantifier expression
     */
    @LispMethod(comment = "@return keyword :to-type if the operator in EXPRESSION is a *-GenQuantRelnTo predicate and the 3rd arg is and existential quantifier expression\r\n@return keyword :from-type if the operator EXPRESSION is a *-GenQuantRelnFrom predicate and the 2nd arg is an existential quantifier expression")
    public static SubLObject quantproc_3_gen_quant_reln_type_arg_position(final SubLObject expression, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_ternary_formula_p(expression)) {
            return NIL;
        }
        final SubLObject quant_attr_list = $list17;
        final SubLObject def_attr_list = $list18;
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject gen_quant_reln = unmake_ternary_formula(expression);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject first_arg = thread.thirdMultipleValue();
        final SubLObject second_arg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (((NIL == isa.isaP(gen_quant_reln, $$GeneralizedQuantifierRelation, mt, UNPROVIDED)) || (NIL == fort_types_interface.isa_predicateP(pred, mt))) || (!TWO_INTEGER.numE(arity.arity(pred)))) {
            return NIL;
        }
        if ((NIL != isa.isaP(gen_quant_reln, $const20$TypeInstanceTernaryRuleMacroPredi, mt, UNPROVIDED)) && ((NIL != quantproc_3_nl_quant_fn_expressionP(second_arg, mt, quant_attr_list, $$NLQuantFn_3)) || (NIL != quantproc_3_nl_quant_fn_expressionP(second_arg, mt, def_attr_list, $$NLDefinitenessFn_3)))) {
            result = $TO_TYPE;
            return result;
        }
        if ((NIL != isa.isaP(gen_quant_reln, $const22$InstanceTypeTernaryRuleMacroPredi, mt, UNPROVIDED)) && ((NIL != quantproc_3_nl_quant_fn_expressionP(first_arg, mt, quant_attr_list, $$NLQuantFn_3)) || (NIL != quantproc_3_nl_quant_fn_expressionP(first_arg, mt, def_attr_list, $$NLDefinitenessFn_3)))) {
            result = $FROM_TYPE;
            return result;
        }
        return result;
    }

    /**
     *
     *
     * @unknown This should be in the KB.
     */
    @LispMethod(comment = "@unknown This should be in the KB.")
    public static final SubLObject gen_quant_relation_from_p_alt(SubLObject obj) {
        return subl_promotions.memberP(obj, $gen_quant_relations_from$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown This should be in the KB.
     */
    @LispMethod(comment = "@unknown This should be in the KB.")
    public static SubLObject gen_quant_relation_from_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, $gen_quant_relations_from$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown This should be in the KB.
     */
    @LispMethod(comment = "@unknown This should be in the KB.")
    public static final SubLObject gen_quant_relation_to_p_alt(SubLObject obj) {
        return subl_promotions.memberP(obj, $gen_quant_relations_to$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown This should be in the KB.
     */
    @LispMethod(comment = "@unknown This should be in the KB.")
    public static SubLObject gen_quant_relation_to_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, $gen_quant_relations_to$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean: T if the formula-operator of EXPRESSION is a predicate of the form *-GenQuantRelnFrom.
     */
    @LispMethod(comment = "@return boolean: T if the formula-operator of EXPRESSION is a predicate of the form *-GenQuantRelnFrom.")
    public static final SubLObject quantproc_3_gen_quant_reln_from_expressionP_alt(SubLObject expression, SubLObject mt) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.gen_quant_relation_from_p(cycl_utilities.formula_operator(expression))) && com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_gen_quant_reln_type_arg_position(expression, mt).eql($FROM_TYPE));
    }

    /**
     *
     *
     * @return boolean: T if the formula-operator of EXPRESSION is a predicate of the form *-GenQuantRelnFrom.
     */
    @LispMethod(comment = "@return boolean: T if the formula-operator of EXPRESSION is a predicate of the form *-GenQuantRelnFrom.")
    public static SubLObject quantproc_3_gen_quant_reln_from_expressionP(final SubLObject expression, final SubLObject mt) {
        return makeBoolean((NIL != gen_quant_relation_from_p(cycl_utilities.formula_operator(expression))) && quantproc_3_gen_quant_reln_type_arg_position(expression, mt).eql($FROM_TYPE));
    }

    /**
     *
     *
     * @return boolean: T if the formula-operator of EXPRESSION is a predicate of the form *-GenQuantRelnTo.
     */
    @LispMethod(comment = "@return boolean: T if the formula-operator of EXPRESSION is a predicate of the form *-GenQuantRelnTo.")
    public static final SubLObject quantproc_3_gen_quant_reln_to_expressionP_alt(SubLObject expression, SubLObject mt) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.gen_quant_relation_to_p(cycl_utilities.formula_operator(expression))) && com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_gen_quant_reln_type_arg_position(expression, mt).eql($TO_TYPE));
    }

    /**
     *
     *
     * @return boolean: T if the formula-operator of EXPRESSION is a predicate of the form *-GenQuantRelnTo.
     */
    @LispMethod(comment = "@return boolean: T if the formula-operator of EXPRESSION is a predicate of the form *-GenQuantRelnTo.")
    public static SubLObject quantproc_3_gen_quant_reln_to_expressionP(final SubLObject expression, final SubLObject mt) {
        return makeBoolean((NIL != gen_quant_relation_to_p(cycl_utilities.formula_operator(expression))) && quantproc_3_gen_quant_reln_type_arg_position(expression, mt).eql($TO_TYPE));
    }

    public static final SubLObject quantproc_3_cost_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return $quantproc_3_microseconds$.getGlobalValue();
    }

    public static SubLObject quantproc_3_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $quantproc_3_microseconds$.getGlobalValue();
    }

    public static final SubLObject quantproc_3_reformulate_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((((NIL != clauses.clauses_p(expression)) && (NIL != clauses.clauses_p(original_clause))) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
                {
                    SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                    SubLObject new_sentence = NIL;
                    SubLObject justification = T;
                    if (NIL != el_formula_p(asent)) {
                        {
                            SubLObject argnum = ZERO_INTEGER;
                            SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                            SubLObject rest = NIL;
                            for (rest = args; !((NIL != new_sentence) || (NIL == rest)); rest = rest.rest()) {
                                {
                                    SubLObject arg = rest.first();
                                    argnum = add(argnum, ONE_INTEGER);
                                    if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_cardinality_of_fn_expressionP(arg, mt)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject new_sentence_2 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_cardinality_of_fn(asent, argnum, mt, settings, original_clause);
                                            SubLObject justification_3 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            new_sentence = new_sentence_2;
                                            justification = justification_3;
                                        }
                                    } else {
                                        if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_subcol_expressionP(arg, mt)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject new_sentence_4 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_subcol(asent, argnum, mt, settings, original_clause);
                                                SubLObject justification_5 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                new_sentence = new_sentence_4;
                                                justification = justification_5;
                                            }
                                        } else {
                                            if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nested_subcol_expressionP(arg, mt)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject new_sentence_6 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_nested_subcol(asent, argnum, mt, settings, original_clause);
                                                    SubLObject justification_7 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    new_sentence = new_sentence_6;
                                                    justification = justification_7;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL == new_sentence) {
                            if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_gen_quant_reln_from_expressionP(asent, mt)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject new_sentence_8 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_gen_quant_reln_from(asent, mt, settings);
                                    SubLObject justification_9 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    new_sentence = new_sentence_8;
                                    justification = justification_9;
                                }
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_gen_quant_reln_to_expressionP(asent, mt)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject new_sentence_10 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_gen_quant_reln_to(asent, mt, settings);
                                        SubLObject justification_11 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        new_sentence = new_sentence_10;
                                        justification = justification_11;
                                    }
                                } else {
                                    if (NIL == new_sentence) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject arg = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_el_formula_next_arg_argnum(asent, mt);
                                            SubLObject argnum = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt27, $$NLQuantFn_3)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject new_sentence_12 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_every(asent, argnum, mt, settings, original_clause);
                                                    SubLObject justification_13 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    new_sentence = new_sentence_12;
                                                    justification = justification_13;
                                                }
                                            } else {
                                                if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt28, $$NLQuantFn_3)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject new_sentence_14 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_some(asent, argnum, mt, settings, original_clause);
                                                        SubLObject justification_15 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        new_sentence = new_sentence_14;
                                                        justification = justification_15;
                                                    }
                                                } else {
                                                    if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt15, $$NLQuantFn_3)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject new_sentence_16 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_bare_form(asent, argnum, mt, settings, original_clause);
                                                            SubLObject justification_17 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            new_sentence = new_sentence_16;
                                                            justification = justification_17;
                                                        }
                                                    } else {
                                                        if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt29, $$NLQuantFn_3)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject new_sentence_18 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_each(asent, argnum, mt, settings, original_clause);
                                                                SubLObject justification_19 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                new_sentence = new_sentence_18;
                                                                justification = justification_19;
                                                            }
                                                        } else {
                                                            if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt30, $$NLQuantFn_3)) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject new_sentence_20 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_gen_quant(asent, argnum, mt, settings, original_clause);
                                                                    SubLObject justification_21 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    new_sentence = new_sentence_20;
                                                                    justification = justification_21;
                                                                }
                                                            } else {
                                                                if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt31, $$NLQuantFn_3)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject new_sentence_22 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_no(asent, argnum, mt, settings, original_clause);
                                                                        SubLObject justification_23 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        new_sentence = new_sentence_22;
                                                                        justification = justification_23;
                                                                    }
                                                                } else {
                                                                    if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt18, $$NLDefinitenessFn_3)) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject new_sentence_24 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_indefinite(asent, argnum, mt, settings, original_clause);
                                                                            SubLObject justification_25 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            new_sentence = new_sentence_24;
                                                                            justification = justification_25;
                                                                        }
                                                                    } else {
                                                                        if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt32, $$NLDefinitenessFn_3)) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject new_sentence_26 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_definite(asent, argnum, mt, settings, original_clause);
                                                                                SubLObject justification_27 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                new_sentence = new_sentence_26;
                                                                                justification = justification_27;
                                                                            }
                                                                        } else {
                                                                            if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_numerical_quant_fn_expressionP(arg, mt)) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject new_sentence_28 = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_reformulate_numerical(asent, argnum, mt, settings, original_clause);
                                                                                    SubLObject justification_29 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    new_sentence = new_sentence_28;
                                                                                    justification = justification_29;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != new_sentence) {
                        return values(list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
                    }
                }
            }
            return values(expression, NIL);
        }
    }

    public static SubLObject quantproc_3_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL != clauses.clauses_p(expression)) && (NIL != clauses.clauses_p(original_clause))) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject new_sentence = NIL;
            SubLObject justification = T;
            if (NIL != el_formula_p(asent)) {
                SubLObject argnum = ZERO_INTEGER;
                final SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                SubLObject rest;
                SubLObject arg;
                SubLObject new_sentence_$2;
                SubLObject justification_$3;
                SubLObject new_sentence_$3;
                SubLObject justification_$4;
                SubLObject new_sentence_$4;
                SubLObject justification_$5;
                for (rest = NIL, rest = args; (NIL == new_sentence) && (NIL != rest); rest = rest.rest()) {
                    arg = rest.first();
                    argnum = add(argnum, ONE_INTEGER);
                    if (NIL != quantproc_3_cardinality_of_fn_expressionP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$2 = quantproc_3_reformulate_cardinality_of_fn(asent, argnum, mt, settings, original_clause);
                        justification_$3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$2;
                        justification = justification_$3;
                    } else
                        if (NIL != quantproc_3_subcol_expressionP(arg, mt)) {
                            thread.resetMultipleValues();
                            new_sentence_$3 = quantproc_3_reformulate_subcol(asent, argnum, mt, settings, original_clause);
                            justification_$4 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$3;
                            justification = justification_$4;
                        } else
                            if (NIL != quantproc_3_nested_subcol_expressionP(arg, mt)) {
                                thread.resetMultipleValues();
                                new_sentence_$4 = quantproc_3_reformulate_nested_subcol(asent, argnum, mt, settings, original_clause);
                                justification_$5 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                new_sentence = new_sentence_$4;
                                justification = justification_$5;
                            }


                }
                if (NIL == new_sentence) {
                    if (NIL != quantproc_3_gen_quant_reln_from_expressionP(asent, mt)) {
                        thread.resetMultipleValues();
                        final SubLObject new_sentence_$5 = quantproc_3_reformulate_gen_quant_reln_from(asent, mt, settings);
                        final SubLObject justification_$6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$5;
                        justification = justification_$6;
                    } else
                        if (NIL != quantproc_3_gen_quant_reln_to_expressionP(asent, mt)) {
                            thread.resetMultipleValues();
                            final SubLObject new_sentence_$6 = quantproc_3_reformulate_gen_quant_reln_to(asent, mt, settings);
                            final SubLObject justification_$7 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_$6;
                            justification = justification_$7;
                        } else
                            if (NIL == new_sentence) {
                                thread.resetMultipleValues();
                                final SubLObject arg2 = quantproc_3_el_formula_next_arg_argnum(asent, mt);
                                final SubLObject argnum2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, $list27, $$NLQuantFn_3)) {
                                    thread.resetMultipleValues();
                                    final SubLObject new_sentence_$7 = quantproc_3_reformulate_every(asent, argnum2, mt, settings, original_clause);
                                    final SubLObject justification_$8 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    new_sentence = new_sentence_$7;
                                    justification = justification_$8;
                                } else
                                    if (NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, $list28, $$NLQuantFn_3)) {
                                        thread.resetMultipleValues();
                                        final SubLObject new_sentence_$8 = quantproc_3_reformulate_some(asent, argnum2, mt, settings, original_clause);
                                        final SubLObject justification_$9 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        new_sentence = new_sentence_$8;
                                        justification = justification_$9;
                                    } else
                                        if (NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, $list15, $$NLQuantFn_3)) {
                                            thread.resetMultipleValues();
                                            final SubLObject new_sentence_$9 = quantproc_3_reformulate_bare_form(asent, argnum2, mt, settings, original_clause);
                                            final SubLObject justification_$10 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            new_sentence = new_sentence_$9;
                                            justification = justification_$10;
                                        } else
                                            if (NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, $list29, $$NLQuantFn_3)) {
                                                thread.resetMultipleValues();
                                                final SubLObject new_sentence_$10 = quantproc_3_reformulate_each(asent, argnum2, mt, settings, original_clause);
                                                final SubLObject justification_$11 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                new_sentence = new_sentence_$10;
                                                justification = justification_$11;
                                            } else
                                                if (NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, $list30, $$NLQuantFn_3)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject new_sentence_$11 = quantproc_3_reformulate_gen_quant(asent, argnum2, mt, settings, original_clause);
                                                    final SubLObject justification_$12 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    new_sentence = new_sentence_$11;
                                                    justification = justification_$12;
                                                } else
                                                    if (NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, $list31, $$NLQuantFn_3)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject new_sentence_$12 = quantproc_3_reformulate_no(asent, argnum2, mt, settings, original_clause);
                                                        final SubLObject justification_$13 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        new_sentence = new_sentence_$12;
                                                        justification = justification_$13;
                                                    } else
                                                        if (NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, $list18, $$NLDefinitenessFn_3)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject new_sentence_$13 = quantproc_3_reformulate_indefinite(asent, argnum2, mt, settings, original_clause);
                                                            final SubLObject justification_$14 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            new_sentence = new_sentence_$13;
                                                            justification = justification_$14;
                                                        } else
                                                            if (NIL != quantproc_3_nl_quant_fn_expressionP(arg2, mt, $list32, $$NLDefinitenessFn_3)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject new_sentence_$14 = quantproc_3_reformulate_definite(asent, argnum2, mt, settings, original_clause);
                                                                final SubLObject justification_$15 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                new_sentence = new_sentence_$14;
                                                                justification = justification_$15;
                                                            } else
                                                                if (NIL != quantproc_3_numerical_quant_fn_expressionP(arg2, mt)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject new_sentence_$15 = quantproc_3_reformulate_numerical(asent, argnum2, mt, settings, original_clause);
                                                                    final SubLObject justification_$16 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    new_sentence = new_sentence_$15;
                                                                    justification = justification_$16;
                                                                }








                            }


                }
            }
            if (NIL != new_sentence) {
                return values(list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
            }
        }
        return values(expression, NIL);
    }

    public static final SubLObject quantproc_3_reformulate_cardinality_of_fn_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        if (NIL != el_binary_formula_p(thesent)) {
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                SubLObject col = cycl_utilities.formula_arg1(arg, UNPROVIDED);
                SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                if ((pred == $$is_Underspecified) && argnum.numLE(TWO_INTEGER)) {
                    {
                        SubLObject the_value = (argnum.numE(TWO_INTEGER)) ? ((SubLObject) (cycl_utilities.formula_arg(asent, ONE_INTEGER, UNPROVIDED))) : cycl_utilities.formula_arg(asent, TWO_INTEGER, UNPROVIDED);
                        return values(list_to_elf(list($$extentCardinality, list($$TheSetOf, new_var, list($$isa, new_var, col)), the_value)), list($$$CardinalityOfFn_1));
                    }
                }
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject quantproc_3_reformulate_cardinality_of_fn(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        if (NIL == el_binary_formula_p(thesent)) {
            return NIL;
        }
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject col = cycl_utilities.formula_arg1(arg, UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
        if (pred.eql($$is_Underspecified) && argnum.numLE(TWO_INTEGER)) {
            final SubLObject the_value = (argnum.numE(TWO_INTEGER)) ? cycl_utilities.formula_arg(asent, ONE_INTEGER, UNPROVIDED) : cycl_utilities.formula_arg(asent, TWO_INTEGER, UNPROVIDED);
            return values(list_to_elf(list($$extentCardinality, list($$TheSetOf, new_var, list($$isa, new_var, col)), the_value)), list($$$CardinalityOfFn_1));
        }
        return NIL;
    }

    /**
     *
     *
     * @return list: reformulate (QUANTIFIER-GenQuantRelnTo RELN (<quant> <attr> COL1) COL2) to (QUANTIFIER-GenQuantRelnToType RELN COL1 COL2)
     */
    @LispMethod(comment = "@return list: reformulate (QUANTIFIER-GenQuantRelnTo RELN (<quant> <attr> COL1) COL2) to (QUANTIFIER-GenQuantRelnToType RELN COL1 COL2)")
    public static final SubLObject quantproc_3_reformulate_gen_quant_reln_to_alt(SubLObject asent, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject gen_quant_reln = unmake_ternary_formula(asent);
                SubLObject pred = thread.secondMultipleValue();
                SubLObject col1 = thread.thirdMultipleValue();
                SubLObject nl_quant_fn_expr = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject nl_quant_tag = unmake_binary_formula(nl_quant_fn_expr);
                    SubLObject nl_quant_attr = thread.secondMultipleValue();
                    SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                        SubLObject nl_number_attr = thread.secondMultipleValue();
                        SubLObject col2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = gen_quant_reln;
                            if (pcase_var.eql($$most_GenQuantRelnTo)) {
                                return values(make_ternary_formula($$most_GenQuantRelnToType, pred, col1, col2), list($str_alt40$3_4));
                            } else {
                                if (pcase_var.eql($$few_GenQuantRelnTo)) {
                                    return values(make_ternary_formula($$few_GenQuantRelnToType, pred, col1, col2), list($str_alt43$11_5_1));
                                } else {
                                    if (pcase_var.eql($$many_GenQuantRelnTo)) {
                                        return values(make_ternary_formula($$many_GenQuantRelnToType, pred, col1, col2), list($str_alt46$2_4));
                                    } else {
                                        if (pcase_var.eql($$several_GenQuantRelnTo)) {
                                            return values(make_ternary_formula($$several_GenQuantRelnToType, pred, col1, col2), list($str_alt49$7_5_1));
                                        } else {
                                            if (pcase_var.eql($$no_GenQuantRelnTo)) {
                                                return values(make_ternary_formula($$no_GenQuantRelnToFromType, pred, col1, col2), list($str_alt52$9_2_5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return list: reformulate (QUANTIFIER-GenQuantRelnTo RELN (<quant> <attr> COL1) COL2) to (QUANTIFIER-GenQuantRelnToType RELN COL1 COL2)
     */
    @LispMethod(comment = "@return list: reformulate (QUANTIFIER-GenQuantRelnTo RELN (<quant> <attr> COL1) COL2) to (QUANTIFIER-GenQuantRelnToType RELN COL1 COL2)")
    public static SubLObject quantproc_3_reformulate_gen_quant_reln_to(final SubLObject asent, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject gen_quant_reln = unmake_ternary_formula(asent);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject col1 = thread.thirdMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_tag = unmake_binary_formula(nl_quant_fn_expr);
        final SubLObject nl_quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
        final SubLObject nl_number_attr = thread.secondMultipleValue();
        final SubLObject col2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = gen_quant_reln;
        if (pcase_var.eql($$most_GenQuantRelnTo)) {
            return values(make_ternary_formula($$most_GenQuantRelnToType, pred, col1, col2), list($str40$3_4));
        }
        if (pcase_var.eql($$few_GenQuantRelnTo)) {
            return values(make_ternary_formula($$few_GenQuantRelnToType, pred, col1, col2), list($str43$11_5_1));
        }
        if (pcase_var.eql($$many_GenQuantRelnTo)) {
            return values(make_ternary_formula($$many_GenQuantRelnToType, pred, col1, col2), list($str46$2_4));
        }
        if (pcase_var.eql($$several_GenQuantRelnTo)) {
            return values(make_ternary_formula($$several_GenQuantRelnToType, pred, col1, col2), list($str49$7_5_1));
        }
        if (pcase_var.eql($$no_GenQuantRelnTo)) {
            return values(make_ternary_formula($$no_GenQuantRelnToFromType, pred, col1, col2), list($str52$9_2_5));
        }
        return NIL;
    }

    /**
     *
     *
     * @return list: reformulate (QUANTIFIER-GenQuantRelnTo RELN (<quant> <attr> COL1) COL2) to (QUANTIFIER-GenQuantRelnToType RELN COL1 COL2)
     */
    @LispMethod(comment = "@return list: reformulate (QUANTIFIER-GenQuantRelnTo RELN (<quant> <attr> COL1) COL2) to (QUANTIFIER-GenQuantRelnToType RELN COL1 COL2)")
    public static final SubLObject quantproc_3_reformulate_gen_quant_reln_from_alt(SubLObject asent, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject gen_quant_reln = unmake_ternary_formula(asent);
                SubLObject pred = thread.secondMultipleValue();
                SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
                SubLObject col2 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject nl_quant_tag = unmake_binary_formula(nl_quant_fn_expr);
                    SubLObject nl_quant_attr = thread.secondMultipleValue();
                    SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                        SubLObject nl_number_attr = thread.secondMultipleValue();
                        SubLObject col1 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = gen_quant_reln;
                            if (pcase_var.eql($$most_GenQuantRelnFrom)) {
                                return values(make_ternary_formula($$most_GenQuantRelnFromType, pred, col1, col2), list($str_alt55$3_3));
                            } else {
                                if (pcase_var.eql($$few_GenQuantRelnFrom)) {
                                    return values(make_ternary_formula($$few_GenQuantRelnFromType, pred, col1, col2), list($str_alt58$11_5_2));
                                } else {
                                    if (pcase_var.eql($$many_GenQuantRelnFrom)) {
                                        return values(make_ternary_formula($$many_GenQuantRelnFromType, pred, col1, col2), list($str_alt61$2_5));
                                    } else {
                                        if (pcase_var.eql($$several_GenQuantRelnFrom)) {
                                            return values(make_ternary_formula($$several_GenQuantRelnFromType, pred, col1, col2), list($str_alt64$7_5_2));
                                        } else {
                                            if (pcase_var.eql($$no_GenQuantRelnFrom)) {
                                                return values(make_ternary_formula($$no_GenQuantRelnToFromType, pred, col1, col2), list($str_alt66$9_1_5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return list: reformulate (QUANTIFIER-GenQuantRelnTo RELN (<quant> <attr> COL1) COL2) to (QUANTIFIER-GenQuantRelnToType RELN COL1 COL2)
     */
    @LispMethod(comment = "@return list: reformulate (QUANTIFIER-GenQuantRelnTo RELN (<quant> <attr> COL1) COL2) to (QUANTIFIER-GenQuantRelnToType RELN COL1 COL2)")
    public static SubLObject quantproc_3_reformulate_gen_quant_reln_from(final SubLObject asent, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject gen_quant_reln = unmake_ternary_formula(asent);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
        final SubLObject col2 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_quant_tag = unmake_binary_formula(nl_quant_fn_expr);
        final SubLObject nl_quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
        final SubLObject nl_number_attr = thread.secondMultipleValue();
        final SubLObject col3 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = gen_quant_reln;
        if (pcase_var.eql($$most_GenQuantRelnFrom)) {
            return values(make_ternary_formula($$most_GenQuantRelnFromType, pred, col3, col2), list($str55$3_3));
        }
        if (pcase_var.eql($$few_GenQuantRelnFrom)) {
            return values(make_ternary_formula($$few_GenQuantRelnFromType, pred, col3, col2), list($str58$11_5_2));
        }
        if (pcase_var.eql($$many_GenQuantRelnFrom)) {
            return values(make_ternary_formula($$many_GenQuantRelnFromType, pred, col3, col2), list($str61$2_5));
        }
        if (pcase_var.eql($$several_GenQuantRelnFrom)) {
            return values(make_ternary_formula($$several_GenQuantRelnFromType, pred, col3, col2), list($str64$7_5_2));
        }
        if (pcase_var.eql($$no_GenQuantRelnFrom)) {
            return values(make_ternary_formula($$no_GenQuantRelnToFromType, pred, col3, col2), list($str66$9_1_5));
        }
        return NIL;
    }

    /**
     *
     *
     * @return list: reformulate sentences of the form (PRED .... (NLQuantFn-3 ATTR COL NUM) ....) where
    ATTR is one of Many-NLAttr, Most-NLAttr, Few-NLAttr, Several-NLAttr
     */
    @LispMethod(comment = "@return list: reformulate sentences of the form (PRED .... (NLQuantFn-3 ATTR COL NUM) ....) where\r\nATTR is one of Many-NLAttr, Most-NLAttr, Few-NLAttr, Several-NLAttr")
    public static final SubLObject quantproc_3_reformulate_gen_quant_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != formula_arityGE(thesent, TWO_INTEGER, UNPROVIDED)) {
                {
                    SubLObject asent = copy_tree(thesent);
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    SubLObject arg1 = cycl_utilities.formula_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.formula_arg2(asent, UNPROVIDED);
                    SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                    SubLObject gen_quantifier = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_quant_fn = unmake_binary_formula(arg);
                        SubLObject gen_quant_attr = thread.secondMultipleValue();
                        SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        gen_quantifier = kb_mapping_utilities.fpred_value_in_any_mt(gen_quant_attr, $$correspondingGenQuant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                            SubLObject number = thread.secondMultipleValue();
                            SubLObject col = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != subl_promotions.memberP(number, $list_alt68, UNPROVIDED, UNPROVIDED)) {
                                if (((argnum.numE(TWO_INTEGER) && (NIL != el_binary_formula_p(asent))) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                                    {
                                        SubLObject pcase_var = gen_quant_attr;
                                        if (pcase_var.eql($$Most_NLAttr)) {
                                            return values(make_ternary_formula($$most_GenQuantRelnFrom, pred, arg1, col), list($str_alt70$GenQuant_2_1));
                                        } else {
                                            if (pcase_var.eql($$Many_NLAttr)) {
                                                return values(make_ternary_formula($$many_GenQuantRelnFrom, pred, arg1, col), list($str_alt72$GenQuant_2_2));
                                            } else {
                                                if (pcase_var.eql($$Few_NLAttr)) {
                                                    return values(make_ternary_formula($$few_GenQuantRelnFrom, pred, arg1, col), list($str_alt74$GenQuant_2_3));
                                                } else {
                                                    if (pcase_var.eql($$Several_NLAttr)) {
                                                        return values(make_ternary_formula($$several_GenQuantRelnFrom, pred, arg1, col), list($str_alt76$GenQuant_2_4));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (((argnum.numE(ONE_INTEGER) && (NIL != el_binary_formula_p(asent))) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                                        {
                                            SubLObject pcase_var = gen_quant_attr;
                                            if (pcase_var.eql($$Most_NLAttr)) {
                                                return values(make_ternary_formula($$most_GenQuantRelnTo, pred, col, arg2), list($str_alt77$GenQuant_3_1));
                                            } else {
                                                if (pcase_var.eql($$Many_NLAttr)) {
                                                    return values(make_ternary_formula($$many_GenQuantRelnTo, pred, col, arg2), list($str_alt78$GenQuant_3_2));
                                                } else {
                                                    if (pcase_var.eql($$Few_NLAttr)) {
                                                        return values(make_ternary_formula($$few_GenQuantRelnTo, pred, col, arg2), list($str_alt79$GenQuant_3_3));
                                                    } else {
                                                        if (pcase_var.eql($$Several_NLAttr)) {
                                                            return values(make_ternary_formula($$several_GenQuantRelnTo, pred, col, arg2), list($str_alt80$GenQuant_3_4));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if ((NIL != formula_arityGE(asent, THREE_INTEGER, UNPROVIDED)) && number.eql($$Plural_NLAttr)) {
                                            {
                                                SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                                SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                                return values(list_to_elf(list(gen_quantifier, col, list($$TheSetOf, new_var, subsentence))), $$$GenQuant_1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return list: reformulate sentences of the form (PRED .... (NLQuantFn-3 ATTR COL NUM) ....) where
    ATTR is one of Many-NLAttr, Most-NLAttr, Few-NLAttr, Several-NLAttr
     */
    @LispMethod(comment = "@return list: reformulate sentences of the form (PRED .... (NLQuantFn-3 ATTR COL NUM) ....) where\r\nATTR is one of Many-NLAttr, Most-NLAttr, Few-NLAttr, Several-NLAttr")
    public static SubLObject quantproc_3_reformulate_gen_quant(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != formula_arityGE(thesent, TWO_INTEGER, UNPROVIDED)) {
            final SubLObject asent = copy_tree(thesent);
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject arg1 = cycl_utilities.formula_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(asent, UNPROVIDED);
            final SubLObject arg3 = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
            SubLObject gen_quantifier = NIL;
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(arg3);
            final SubLObject gen_quant_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            gen_quantifier = kb_mapping_utilities.fpred_value_in_any_mt(gen_quant_attr, $$correspondingGenQuant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != subl_promotions.memberP(number, $list68, UNPROVIDED, UNPROVIDED)) {
                if (((argnum.numE(TWO_INTEGER) && (NIL != el_binary_formula_p(asent))) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                    final SubLObject pcase_var = gen_quant_attr;
                    if (pcase_var.eql($$Most_NLAttr)) {
                        return values(make_ternary_formula($$most_GenQuantRelnFrom, pred, arg1, col), list($str70$GenQuant_2_1));
                    }
                    if (pcase_var.eql($$Many_NLAttr)) {
                        return values(make_ternary_formula($$many_GenQuantRelnFrom, pred, arg1, col), list($str72$GenQuant_2_2));
                    }
                    if (pcase_var.eql($$Few_NLAttr)) {
                        return values(make_ternary_formula($$few_GenQuantRelnFrom, pred, arg1, col), list($str74$GenQuant_2_3));
                    }
                    if (pcase_var.eql($$Several_NLAttr)) {
                        return values(make_ternary_formula($$several_GenQuantRelnFrom, pred, arg1, col), list($str76$GenQuant_2_4));
                    }
                } else
                    if (((argnum.numE(ONE_INTEGER) && (NIL != el_binary_formula_p(asent))) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                        final SubLObject pcase_var = gen_quant_attr;
                        if (pcase_var.eql($$Most_NLAttr)) {
                            return values(make_ternary_formula($$most_GenQuantRelnTo, pred, col, arg2), list($str77$GenQuant_3_1));
                        }
                        if (pcase_var.eql($$Many_NLAttr)) {
                            return values(make_ternary_formula($$many_GenQuantRelnTo, pred, col, arg2), list($str78$GenQuant_3_2));
                        }
                        if (pcase_var.eql($$Few_NLAttr)) {
                            return values(make_ternary_formula($$few_GenQuantRelnTo, pred, col, arg2), list($str79$GenQuant_3_3));
                        }
                        if (pcase_var.eql($$Several_NLAttr)) {
                            return values(make_ternary_formula($$several_GenQuantRelnTo, pred, col, arg2), list($str80$GenQuant_3_4));
                        }
                    } else
                        if ((NIL != formula_arityGE(asent, THREE_INTEGER, UNPROVIDED)) && number.eql($$Plural_NLAttr)) {
                            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                            final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                            return values(list_to_elf(list(gen_quantifier, col, list($$TheSetOf, new_var, subsentence))), $$$GenQuant_1);
                        }


            }
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_every_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                if (!((NIL != isa.isaP(pred, $$RuleMacroPredicate, mt, UNPROVIDED)) && (pred != $$genls))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_quant_fn = unmake_binary_formula(arg);
                        SubLObject every = thread.secondMultipleValue();
                        SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                            SubLObject number = thread.secondMultipleValue();
                            SubLObject col = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                SubLObject consequent = replace_formula_arg(argnum, new_var, asent);
                                return values(make_universal(new_var, make_implication(make_binary_formula($$isa, new_var, col), consequent)), list($$Every_NLAttr));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_every(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if ((NIL == isa.isaP(pred, $$RuleMacroPredicate, mt, UNPROVIDED)) || pred.eql($$genls)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(arg);
            final SubLObject every = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
            final SubLObject consequent = replace_formula_arg(argnum, new_var, asent);
            return values(make_universal(new_var, make_implication(make_binary_formula($$isa, new_var, col), consequent)), list($$Every_NLAttr));
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_some_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                if (!((NIL != isa.isaP(pred, $$RuleMacroPredicate, mt, UNPROVIDED)) && (pred != $$genls))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_quant_fn = unmake_binary_formula(arg);
                        SubLObject some = thread.secondMultipleValue();
                        SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                            SubLObject number = thread.secondMultipleValue();
                            SubLObject col = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                return values(make_existential(new_var, simplifier.conjoin(list(make_binary_formula($$isa, new_var, col), subsentence), UNPROVIDED)), list($$Some_NLAttr));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_some(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if ((NIL == isa.isaP(pred, $$RuleMacroPredicate, mt, UNPROVIDED)) || pred.eql($$genls)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(arg);
            final SubLObject some = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
            final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
            return values(make_existential(new_var, simplifier.conjoin(list(make_binary_formula($$isa, new_var, col), subsentence), UNPROVIDED)), list($$Some_NLAttr));
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_bare_form_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject nl_quant_fn = unmake_ternary_formula(arg);
                    SubLObject bare_form = thread.secondMultipleValue();
                    SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                    SubLObject nl_quant_fn_argnum = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                        SubLObject number = thread.secondMultipleValue();
                        SubLObject col = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if ($list_alt87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || (NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt))) {
                            if (nl_quant_fn_argnum.numLE(ONE_INTEGER) && (NIL != member(number, $list_alt88, UNPROVIDED, UNPROVIDED))) {
                                {
                                    SubLObject new_arg = list_utilities.replace_nested_nth(arg, $list_alt89, $$Generic_NLAttr);
                                    return values(replace_formula_arg(argnum, new_arg, asent), list($str_alt91$BAREFORM_1));
                                }
                            } else {
                                if (nl_quant_fn_argnum.numG(ONE_INTEGER) && (NIL != member(number, $list_alt88, UNPROVIDED, UNPROVIDED))) {
                                    {
                                        SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                        SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                        return values(make_existential(new_var, simplifier.conjoin(list(make_binary_formula($$isa, new_var, col), subsentence), UNPROVIDED)), list($str_alt92$BAREFORM_2));
                                    }
                                } else {
                                    if (number.eql($$Generic_NLAttr)) {
                                        {
                                            SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                            SubLObject consequent = replace_formula_arg(argnum, new_var, asent);
                                            return values(make_universal(new_var, make_implication(make_binary_formula($$isa, new_var, col), consequent)), list($str_alt93$BAREFORM_3));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static SubLObject quantproc_3_reformulate_bare_form(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_ternary_formula(arg);
        final SubLObject bare_form = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        final SubLObject nl_quant_fn_argnum = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ($list87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || (NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt))) {
            if (nl_quant_fn_argnum.numLE(ONE_INTEGER) && (NIL != member(number, $list88, UNPROVIDED, UNPROVIDED))) {
                final SubLObject new_arg = list_utilities.replace_nested_nth(arg, $list89, $$Generic_NLAttr);
                return values(replace_formula_arg(argnum, new_arg, asent), list($str91$BAREFORM_1));
            }
            if (nl_quant_fn_argnum.numG(ONE_INTEGER) && (NIL != member(number, $list88, UNPROVIDED, UNPROVIDED))) {
                final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                return values(make_existential(new_var, simplifier.conjoin(list(make_binary_formula($$isa, new_var, col), subsentence), UNPROVIDED)), list($str92$BAREFORM_2));
            }
            if (number.eql($$Generic_NLAttr)) {
                final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                final SubLObject consequent = replace_formula_arg(argnum, new_var, asent);
                return values(make_universal(new_var, make_implication(make_binary_formula($$isa, new_var, col), consequent)), list($str93$BAREFORM_3));
            }
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_each_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject nl_quant_fn = unmake_binary_formula(arg);
                    SubLObject each = thread.secondMultipleValue();
                    SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                        SubLObject number = thread.secondMultipleValue();
                        SubLObject col = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (number.equal($$Singular_NLAttr)) {
                            if ((NIL != subl_promotions.memberP(argnum, $list_alt95, UNPROVIDED, UNPROVIDED)) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                                {
                                    SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                    SubLObject consequent = replace_formula_arg(argnum, new_var, asent);
                                    return values(make_universal(new_var, make_implication(make_binary_formula($$isa, new_var, col), consequent)), list($str_alt96$5_1_or_5_2));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_each(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_binary_formula(arg);
        final SubLObject each = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((number.equal($$Singular_NLAttr) && (NIL != subl_promotions.memberP(argnum, $list95, UNPROVIDED, UNPROVIDED))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
            final SubLObject consequent = replace_formula_arg(argnum, new_var, asent);
            return values(make_universal(new_var, make_implication(make_binary_formula($$isa, new_var, col), consequent)), list($str96$5_1_or_5_2));
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_no_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != formula_arityGE(thesent, TWO_INTEGER, UNPROVIDED)) {
                {
                    SubLObject asent = copy_tree(thesent);
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    SubLObject arg1 = cycl_utilities.formula_arg1(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.formula_arg2(asent, UNPROVIDED);
                    SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_quant_fn = unmake_binary_formula(arg);
                        SubLObject no = thread.secondMultipleValue();
                        SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                            SubLObject number = thread.secondMultipleValue();
                            SubLObject col = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != subl_promotions.memberP(number, $list_alt97, UNPROVIDED, UNPROVIDED)) {
                                if (((argnum.numE(TWO_INTEGER) && (NIL != el_binary_formula_p(asent))) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                                    return values(make_ternary_formula($$no_GenQuantRelnFrom, pred, arg1, col), list($str_alt98$9_1));
                                } else {
                                    if (((argnum.numE(ONE_INTEGER) && (NIL != el_binary_formula_p(asent))) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                                        return values(make_ternary_formula($$no_GenQuantRelnTo, pred, col, arg2), list($str_alt99$9_2));
                                    } else {
                                        if (NIL != formula_arityGE(asent, THREE_INTEGER, UNPROVIDED)) {
                                            {
                                                SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                                SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                                return values(list_to_elf(list($$disjointWith, col, list($$TheSetOf, new_var, subsentence))), $str_alt101$9_5_);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_no(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != formula_arityGE(thesent, TWO_INTEGER, UNPROVIDED)) {
            final SubLObject asent = copy_tree(thesent);
            final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject arg1 = cycl_utilities.formula_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(asent, UNPROVIDED);
            final SubLObject arg3 = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_binary_formula(arg3);
            final SubLObject no = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != subl_promotions.memberP(number, $list97, UNPROVIDED, UNPROVIDED)) {
                if (((argnum.numE(TWO_INTEGER) && (NIL != el_binary_formula_p(asent))) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                    return values(make_ternary_formula($$no_GenQuantRelnFrom, pred, arg1, col), list($str98$9_1));
                }
                if (((argnum.numE(ONE_INTEGER) && (NIL != el_binary_formula_p(asent))) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) {
                    return values(make_ternary_formula($$no_GenQuantRelnTo, pred, col, arg2), list($str99$9_2));
                }
                if (NIL != formula_arityGE(asent, THREE_INTEGER, UNPROVIDED)) {
                    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                    final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                    return values(list_to_elf(list($$disjointWith, col, list($$TheSetOf, new_var, subsentence))), $str101$9_5_);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_indefinite_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject nl_quant_fn = unmake_binary_formula(arg);
                    SubLObject indefinite = thread.secondMultipleValue();
                    SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                        SubLObject number = thread.secondMultipleValue();
                        SubLObject col = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != subl_promotions.memberP(number, $list_alt102, UNPROVIDED, UNPROVIDED)) {
                            if (number.eql($$Singular_NLAttr) && ($list_alt87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || (NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt)))) {
                                {
                                    SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                    SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                    return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$isa, new_var, col), subsentence))), list($str_alt105$4_2));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_indefinite(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_binary_formula(arg);
        final SubLObject indefinite = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (((NIL != subl_promotions.memberP(number, $list102, UNPROVIDED, UNPROVIDED)) && number.eql($$Singular_NLAttr)) && ($list87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || (NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt)))) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
            final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
            return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$isa, new_var, col), subsentence))), list($str105$4_2));
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_definite_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                thread.resetMultipleValues();
                {
                    SubLObject nl_quant_fn = unmake_binary_formula(arg);
                    SubLObject definite = thread.secondMultipleValue();
                    SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                        SubLObject number = thread.secondMultipleValue();
                        SubLObject col = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if ((((NIL != subl_promotions.memberP(number, $list_alt97, UNPROVIDED, UNPROVIDED)) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) && ($list_alt87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || (NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt)))) {
                            {
                                SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$isa, new_var, col), subsentence))), list($str_alt106$6_1));
                            }
                        } else {
                            if (((((argnum.numE(TWO_INTEGER) && (NIL != member(number, $list_alt107, UNPROVIDED, UNPROVIDED))) && (NIL != arity.arity_admitsGE(pred, THREE_INTEGER))) && (NIL == arity.arity_admitsP(pred, TWO_INTEGER))) && (NIL != isa.isaP(pred, $$ComparisonWRTPredicate, mt, UNPROVIDED))) && ((NIL != isa.isaP(pred, $$IndividualLevelPredicate, mt, UNPROVIDED)) || ($list_alt87.equal(kb_accessors.arg1_isa(pred, mt)) && $list_alt87.equal(kb_accessors.arg2_isa(pred, mt))))) {
                                {
                                    SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                    SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                    return values(list_to_elf(list($$forAll, new_var, list($$implies, list($$isa, new_var, col), subsentence))), list($str_alt112$6_4_1));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_definite(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_binary_formula(arg);
        final SubLObject definite = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
        final SubLObject number = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((((NIL != subl_promotions.memberP(number, $list97, UNPROVIDED, UNPROVIDED)) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) && (NIL != fort_types_interface.isa_collectionP(col, mt))) && ($list87.equal(kb_accessors.argn_isa(pred, argnum, mt)) || (NIL == at_admitted.admitted_argumentP(col, argnum, pred, mt)))) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
            final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
            return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$isa, new_var, col), subsentence))), list($str106$6_1));
        }
        if (((((argnum.numE(TWO_INTEGER) && (NIL != member(number, $list107, UNPROVIDED, UNPROVIDED))) && (NIL != arity.arity_admitsGE(pred, THREE_INTEGER))) && (NIL == arity.arity_admitsP(pred, TWO_INTEGER))) && (NIL != isa.isaP(pred, $$ComparisonWRTPredicate, mt, UNPROVIDED))) && ((NIL != isa.isaP(pred, $$IndividualLevelPredicate, mt, UNPROVIDED)) || ($list87.equal(kb_accessors.arg1_isa(pred, mt)) && $list87.equal(kb_accessors.arg2_isa(pred, mt))))) {
            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
            final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
            return values(list_to_elf(list($$forAll, new_var, list($$implies, list($$isa, new_var, col), subsentence))), list($str112$6_4_1));
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_numerical_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject nl_quant_fn = unmake_binary_formula(arg);
                    SubLObject nl_attr = thread.secondMultipleValue();
                    SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject numerical_quant = unmake_binary_formula(nl_attr);
                        SubLObject integer_arg = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (((NIL != subl_promotions.positive_integer_p(integer_arg)) || (NIL != at_defns.quiet_has_typeP(integer_arg, $$ScalarInterval, UNPROVIDED))) || ((NIL != el_formula_p(integer_arg)) && (NIL != isa.result_isa_colP(cycl_utilities.formula_arg0(integer_arg), $$IntegerExtent, mt)))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                                SubLObject number = thread.secondMultipleValue();
                                SubLObject col = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (number.eql(ONE_INTEGER.eql(integer_arg) ? ((SubLObject) ($$Singular_NLAttr)) : $$Plural_NLAttr)) {
                                    {
                                        SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                        SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                        return values(list_to_elf(list($$num_GenQuant, col, list($$TheSetOf, new_var, subsentence), integer_arg)), list($str_alt116$10_1));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_numerical(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = unmake_binary_formula(arg);
        final SubLObject nl_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject numerical_quant = unmake_binary_formula(nl_attr);
        final SubLObject integer_arg = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (((NIL != subl_promotions.positive_integer_p(integer_arg)) || (NIL != at_defns.quiet_has_typeP(integer_arg, $$ScalarInterval, UNPROVIDED))) || ((NIL != el_formula_p(integer_arg)) && (NIL != isa.result_isa_colP(cycl_utilities.formula_arg0(integer_arg), $$IntegerExtent, mt)))) {
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (number.eql(ONE_INTEGER.eql(integer_arg) ? $$Singular_NLAttr : $$Plural_NLAttr)) {
                final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                return values(list_to_elf(list($$num_GenQuant, col, list($$TheSetOf, new_var, subsentence), integer_arg)), list($str116$10_1));
            }
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_subcol_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                if (NIL != fort_types_interface.isa_predicateP(pred, mt)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject nl_quant_fn = unmake_ternary_formula(arg);
                        SubLObject nl_attr = thread.secondMultipleValue();
                        SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                            SubLObject number = thread.secondMultipleValue();
                            SubLObject col = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != genl_predicates.genl_predP(pred, $$isa, UNPROVIDED, UNPROVIDED)) {
                                return values(replace_formula_arg(argnum, col, asent), list($$SubcollectionFunction, $1));
                            }
                            {
                                SubLObject cdolist_list_var = kb_accessors.argn_isa(pred, argnum, mt);
                                SubLObject arg_isa_col = NIL;
                                for (arg_isa_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_isa_col = cdolist_list_var.first()) {
                                    if (!$$Thing.eql(arg_isa_col)) {
                                        if (NIL != isa.isaP(arg_isa_col, $$CollectionType, mt, UNPROVIDED)) {
                                            if (NIL != isa.isaP(col, arg_isa_col, mt, UNPROVIDED)) {
                                                {
                                                    SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                                    SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                                                    return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$genls, new_var, col), subsentence))), list($$SubcollectionFunction));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_subcol(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != fort_types_interface.isa_predicateP(pred, mt)) {
            thread.resetMultipleValues();
            final SubLObject nl_quant_fn = unmake_ternary_formula(arg);
            final SubLObject nl_attr = thread.secondMultipleValue();
            final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
            final SubLObject number = thread.secondMultipleValue();
            final SubLObject col = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != genl_predicates.genl_predP(pred, $$isa, UNPROVIDED, UNPROVIDED)) {
                return values(replace_formula_arg(argnum, col, asent), list($$SubcollectionFunction, $1));
            }
            SubLObject cdolist_list_var = kb_accessors.argn_isa(pred, argnum, mt);
            SubLObject arg_isa_col = NIL;
            arg_isa_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((!$$Thing.eql(arg_isa_col)) && (NIL != isa.isaP(arg_isa_col, $$CollectionType, mt, UNPROVIDED))) && (NIL != isa.isaP(col, arg_isa_col, mt, UNPROVIDED))) {
                    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                    final SubLObject subsentence = replace_formula_arg(argnum, new_var, asent);
                    return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$genls, new_var, col), subsentence))), list($$SubcollectionFunction));
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg_isa_col = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_reformulate_nested_subcol_alt(SubLObject thesent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject asent = copy_tree(thesent);
                SubLObject function_arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
                SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                if ((NIL != possibly_naut_p(function_arg)) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) {
                    {
                        SubLObject functor = cycl_utilities.nat_functor(function_arg);
                        if (((NIL != fort_types_interface.isa_functionP(functor, mt)) && (NIL == isa.quoted_isaP(functor, $$CycNLParsingConstant, mt, UNPROVIDED))) && (NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP(function_arg, mt))) {
                            {
                                SubLObject function_argnum = ZERO_INTEGER;
                                SubLObject args = cycl_utilities.formula_args(function_arg, $IGNORE);
                                SubLObject cdolist_list_var = args;
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                    function_argnum = add(function_argnum, ONE_INTEGER);
                                    if ((NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt14, $$NLDefinitenessFn_3)) || (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expressionP(arg, mt, $list_alt15, $$NLQuantFn_3))) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject nl_quant_fn = unmake_ternary_formula(arg);
                                            SubLObject nl_attr = thread.secondMultipleValue();
                                            SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                                            SubLObject start_index = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                                                SubLObject number = thread.secondMultipleValue();
                                                SubLObject col = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((nl_quant_fn.eql($$NLDefinitenessFn_3) && (NIL != member(number, $list_alt122, UNPROVIDED, UNPROVIDED))) && (NIL == at_admitted.admitted_argumentP(col, function_argnum, functor, mt))) {
                                                    {
                                                        SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                                        SubLObject new_function_expr = replace_formula_arg(function_argnum, new_var, function_arg);
                                                        SubLObject subsentence = replace_formula_arg(argnum, new_function_expr, asent);
                                                        return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$isa, new_var, col), subsentence))), list($str_alt123$8_1_or_8_2));
                                                    }
                                                } else {
                                                    if (((nl_quant_fn.eql($$NLQuantFn_3) && (NIL != member(nl_attr, $list_alt124, UNPROVIDED, UNPROVIDED))) && (NIL == at_admitted.admitted_argumentP(col, function_argnum, functor, mt))) && (NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP(col, mt))) {
                                                        {
                                                            SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                                            SubLObject new_function_expr = replace_formula_arg(function_argnum, new_var, function_arg);
                                                            SubLObject subsentence = replace_formula_arg(argnum, new_function_expr, asent);
                                                            return values(list_to_elf(list($$forAll, new_var, list($$implies, list($$isa, new_var, col), subsentence))), list($str_alt125$8_2_5));
                                                        }
                                                    } else {
                                                        if ((((nl_quant_fn.eql($$NLQuantFn_3) && (NIL != member(number, $list_alt107, UNPROVIDED, UNPROVIDED))) || (nl_quant_fn.eql($$NLDefinitenessFn_3) && (NIL != member(number, $list_alt126, UNPROVIDED, UNPROVIDED)))) && (NIL != reformulator_module_quantifier_unifier_3.subcollection_function_nautP(col, mt))) && (NIL != at_admitted.admitted_argumentP(col, function_argnum, functor, mt))) {
                                                            {
                                                                SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                                                                SubLObject new_function_expr = replace_formula_arg(function_argnum, new_var, function_arg);
                                                                SubLObject subsentence = replace_formula_arg(argnum, new_function_expr, asent);
                                                                return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$genls, new_var, col), subsentence))), list($str_alt127$8_3_1));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quantproc_3_reformulate_nested_subcol(final SubLObject thesent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = copy_tree(thesent);
        final SubLObject function_arg = cycl_utilities.formula_arg(asent, argnum, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        if ((NIL != possibly_naut_p(function_arg)) && (NIL != fort_types_interface.isa_predicateP(pred, mt))) {
            final SubLObject functor = cycl_utilities.nat_functor(function_arg);
            if (((NIL != fort_types_interface.isa_functionP(functor, mt)) && (NIL == isa.quoted_isaP(functor, $$CycNLParsingConstant, mt, UNPROVIDED))) && (NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP(function_arg, mt))) {
                SubLObject function_argnum = ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(function_arg, $IGNORE);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    function_argnum = add(function_argnum, ONE_INTEGER);
                    if ((NIL != quantproc_3_nl_quant_fn_expressionP(arg, mt, $list14, $$NLDefinitenessFn_3)) || (NIL != quantproc_3_nl_quant_fn_expressionP(arg, mt, $list15, $$NLQuantFn_3))) {
                        thread.resetMultipleValues();
                        final SubLObject nl_quant_fn = unmake_ternary_formula(arg);
                        final SubLObject nl_attr = thread.secondMultipleValue();
                        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
                        final SubLObject start_index = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        final SubLObject nl_number_fn = unmake_binary_formula(nl_number_fn_expr);
                        final SubLObject number = thread.secondMultipleValue();
                        final SubLObject col = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if ((nl_quant_fn.eql($$NLDefinitenessFn_3) && (NIL != member(number, $list122, UNPROVIDED, UNPROVIDED))) && (NIL == at_admitted.admitted_argumentP(col, function_argnum, functor, mt))) {
                            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                            final SubLObject new_function_expr = replace_formula_arg(function_argnum, new_var, function_arg);
                            final SubLObject subsentence = replace_formula_arg(argnum, new_function_expr, asent);
                            return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$isa, new_var, col), subsentence))), list($str123$8_1_or_8_2));
                        }
                        if (((nl_quant_fn.eql($$NLQuantFn_3) && (NIL != member(nl_attr, $list124, UNPROVIDED, UNPROVIDED))) && (NIL == at_admitted.admitted_argumentP(col, function_argnum, functor, mt))) && (NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP(col, mt))) {
                            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                            final SubLObject new_function_expr = replace_formula_arg(function_argnum, new_var, function_arg);
                            final SubLObject subsentence = replace_formula_arg(argnum, new_function_expr, asent);
                            return values(list_to_elf(list($$forAll, new_var, list($$implies, list($$isa, new_var, col), subsentence))), list($str125$8_2_5));
                        }
                        if ((((nl_quant_fn.eql($$NLQuantFn_3) && (NIL != member(number, $list107, UNPROVIDED, UNPROVIDED))) || (nl_quant_fn.eql($$NLDefinitenessFn_3) && (NIL != member(number, $list126, UNPROVIDED, UNPROVIDED)))) && (NIL != reformulator_module_quantifier_unifier_3.subcollection_function_nautP(col, mt))) && (NIL != at_admitted.admitted_argumentP(col, function_argnum, functor, mt))) {
                            final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, asent), UNPROVIDED);
                            final SubLObject new_function_expr = replace_formula_arg(function_argnum, new_var, function_arg);
                            final SubLObject subsentence = replace_formula_arg(argnum, new_function_expr, asent);
                            return values(list_to_elf(list($$thereExists, new_var, list($$and, list($$genls, new_var, col), subsentence))), list($str127$8_3_1));
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject quantproc_3_el_formula_next_arg_argnum_alt(SubLObject asent, SubLObject mt) {
        {
            SubLObject min_order = NIL;
            SubLObject best_candidate_arg_number = NIL;
            SubLObject best_candidate_sentence = NIL;
            SubLObject cur_arg_number = ZERO_INTEGER;
            SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject cur_sentence = NIL;
            for (cur_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_sentence = cdolist_list_var.first()) {
                cur_arg_number = add(cur_arg_number, ONE_INTEGER);
                if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_any_nl_quant_fn_expressionP(cur_sentence, mt)) {
                    {
                        SubLObject cur_order = cycl_utilities.formula_arg3(cur_sentence, UNPROVIDED);
                        if ((NIL == cur_order) && (NIL == best_candidate_sentence)) {
                            best_candidate_sentence = cur_sentence;
                            best_candidate_arg_number = cur_arg_number;
                        } else {
                            if (cur_order.isInteger() && ((NIL == min_order) || cur_order.numL(min_order))) {
                                min_order = cur_order;
                                best_candidate_sentence = cur_sentence;
                                best_candidate_arg_number = cur_arg_number;
                            }
                        }
                    }
                }
            }
            return values(best_candidate_sentence, best_candidate_arg_number);
        }
    }

    public static SubLObject quantproc_3_el_formula_next_arg_argnum(final SubLObject asent, final SubLObject mt) {
        SubLObject min_order = NIL;
        SubLObject best_candidate_arg_number = NIL;
        SubLObject best_candidate_sentence = NIL;
        SubLObject cur_arg_number = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
        SubLObject cur_sentence = NIL;
        cur_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cur_arg_number = add(cur_arg_number, ONE_INTEGER);
            if (NIL != quantproc_3_any_nl_quant_fn_expressionP(cur_sentence, mt)) {
                final SubLObject cur_order = cycl_utilities.formula_arg3(cur_sentence, UNPROVIDED);
                if ((NIL == cur_order) && (NIL == best_candidate_sentence)) {
                    best_candidate_sentence = cur_sentence;
                    best_candidate_arg_number = cur_arg_number;
                } else
                    if (cur_order.isInteger() && ((NIL == min_order) || cur_order.numL(min_order))) {
                        min_order = cur_order;
                        best_candidate_sentence = cur_sentence;
                        best_candidate_arg_number = cur_arg_number;
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_sentence = cdolist_list_var.first();
        } 
        return values(best_candidate_sentence, best_candidate_arg_number);
    }

    public static final SubLObject quantproc_3_nl_quant_fn_expression_arg_order_alt(SubLObject poss_quant_fn_expr) {
        if (poss_quant_fn_expr.isList() && (($$NLQuantFn_3 == cycl_utilities.sentence_arg0(poss_quant_fn_expr)) || ($$NLDefinitenessFn_3 == cycl_utilities.sentence_arg0(poss_quant_fn_expr)))) {
            {
                SubLObject arg_order = cycl_utilities.sentence_arg3(poss_quant_fn_expr, UNPROVIDED);
                if (arg_order.isInteger()) {
                    return arg_order;
                } else {
                    return NIL;
                }
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject quantproc_3_nl_quant_fn_expression_arg_order(final SubLObject poss_quant_fn_expr) {
        if ((!poss_quant_fn_expr.isList()) || ((!$$NLQuantFn_3.eql(cycl_utilities.sentence_arg0(poss_quant_fn_expr))) && (!$$NLDefinitenessFn_3.eql(cycl_utilities.sentence_arg0(poss_quant_fn_expr))))) {
            return NIL;
        }
        final SubLObject arg_order = cycl_utilities.sentence_arg3(poss_quant_fn_expr, UNPROVIDED);
        if (arg_order.isInteger()) {
            return arg_order;
        }
        return NIL;
    }

    /**
     * Apply a list like '(1 2 3 4) to an ASENT with some #$NLQuantFn-3 nauts.  Change the arg4 of these nauts to the provided int in the ordr given.
     */
    @LispMethod(comment = "Apply a list like \'(1 2 3 4) to an ASENT with some #$NLQuantFn-3 nauts.  Change the arg4 of these nauts to the provided int in the ordr given.")
    public static final SubLObject quantproc_3_expression_arg_order_list_apply_alt(SubLObject asent, SubLObject arg_order_min_list) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = asent;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_nl_quant_fn_expression_arg_order(arg)) {
                    {
                        SubLObject new_arg_order = arg_order_min_list.first();
                        arg_order_min_list = arg_order_min_list.rest();
                        result = cons(list_utilities.replace_nth(THREE_INTEGER, new_arg_order, arg), result);
                    }
                } else {
                    result = cons(arg, result);
                }
            }
            return nreverse(result);
        }
    }

    @LispMethod(comment = "Apply a list like \'(1 2 3 4) to an ASENT with some #$NLQuantFn-3 nauts.  Change the arg4 of these nauts to the provided int in the ordr given.")
    public static SubLObject quantproc_3_expression_arg_order_list_apply(final SubLObject asent, SubLObject arg_order_min_list) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = asent;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != quantproc_3_nl_quant_fn_expression_arg_order(arg)) {
                final SubLObject new_arg_order = arg_order_min_list.first();
                arg_order_min_list = arg_order_min_list.rest();
                result = cons(list_utilities.replace_nth(THREE_INTEGER, new_arg_order, arg), result);
            } else {
                result = cons(arg, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return nreverse(result);
    }/**
     * Apply a list like '(1 2 3 4) to an ASENT with some #$NLQuantFn-3 nauts.  Change the arg4 of these nauts to the provided int in the ordr given.
     */


    public static final SubLObject quantproc_3_formula_arg_order_list_alt(SubLObject asent) {
        return remove(NIL, Mapping.mapcar(symbol_function(QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER), asent), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject quantproc_3_formula_arg_order_list(final SubLObject asent) {
        return remove(NIL, Mapping.mapcar(symbol_function(QUANTPROC_3_NL_QUANT_FN_EXPRESSION_ARG_ORDER), asent), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Normalize a formula as follows: a correct formula must have exactly 1 zero arg-order number OR all the arg-order numbers must be unique.  if this is not the case, then we assign sequential arg-order numbers 0, 1, 2, ... (i.e. arg position -1 to each arg).  note that the case (1 0 0) will become (0 1 2).
     */
    @LispMethod(comment = "Normalize a formula as follows: a correct formula must have exactly 1 zero arg-order number OR all the arg-order numbers must be unique.  if this is not the case, then we assign sequential arg-order numbers 0, 1, 2, ... (i.e. arg position -1 to each arg).  note that the case (1 0 0) will become (0 1 2).")
    public static final SubLObject quantproc_3_el_formula_normalize_alt(SubLObject asent) {
        {
            SubLObject arg_order_list = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_formula_arg_order_list(asent);
            if ((!ONE_INTEGER.numE(count(ZERO_INTEGER, arg_order_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != list_utilities.duplicates(arg_order_list, UNPROVIDED, UNPROVIDED))) {
                return com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_expression_arg_order_list_apply(asent, $list_alt129);
            }
        }
        return asent;
    }

    @LispMethod(comment = "Normalize a formula as follows: a correct formula must have exactly 1 zero arg-order number OR all the arg-order numbers must be unique.  if this is not the case, then we assign sequential arg-order numbers 0, 1, 2, ... (i.e. arg position -1 to each arg).  note that the case (1 0 0) will become (0 1 2).")
    public static SubLObject quantproc_3_el_formula_normalize(final SubLObject asent) {
        final SubLObject arg_order_list = quantproc_3_formula_arg_order_list(asent);
        if ((!ONE_INTEGER.numE(count(ZERO_INTEGER, arg_order_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != list_utilities.duplicates(arg_order_list, UNPROVIDED, UNPROVIDED))) {
            return quantproc_3_expression_arg_order_list_apply(asent, $list129);
        }
        return asent;
    }/**
     * Normalize a formula as follows: a correct formula must have exactly 1 zero arg-order number OR all the arg-order numbers must be unique.  if this is not the case, then we assign sequential arg-order numbers 0, 1, 2, ... (i.e. arg position -1 to each arg).  note that the case (1 0 0) will become (0 1 2).
     */


    public static final SubLObject quantproc_3_apply_operation_alt(SubLObject list, SubLObject operation) {
        {
            SubLObject pcase_var = operation;
            if (pcase_var.eql($SWITCH_FIRST)) {
                if (length(list).numG(ONE_INTEGER)) {
                    return cons(cadr(list), cons(list.first(), cddr(list)));
                } else {
                    return list;
                }
            } else {
                if (pcase_var.eql($SHIFT_LEFT)) {
                    return list_utilities.list_rotate_left(list);
                } else {
                    if (pcase_var.eql($SHIFT_RIGHT)) {
                        return list_utilities.list_rotate_right(list);
                    }
                }
            }
        }
        return list;
    }

    public static SubLObject quantproc_3_apply_operation(final SubLObject list, final SubLObject operation) {
        if (operation.eql($SWITCH_FIRST)) {
            if (length(list).numG(ONE_INTEGER)) {
                return cons(cadr(list), cons(list.first(), cddr(list)));
            }
            return list;
        } else {
            if (operation.eql($SHIFT_LEFT)) {
                return list_utilities.list_rotate_left(list);
            }
            if (operation.eql($SHIFT_RIGHT)) {
                return list_utilities.list_rotate_right(list);
            }
            return list;
        }
    }

    public static final SubLObject quantproc_3_arg_order_list_permutations_alt(SubLObject arg_order_list) {
        {
            SubLObject arg_order_list_list = list(arg_order_list);
            SubLObject cur_arg_order_list = arg_order_list;
            SubLObject operation_list_orig = $list_alt133;
            SubLObject arg_order_list_length = length(arg_order_list);
            SubLObject num_steps = (arg_order_list_length.numG(ONE_INTEGER)) ? ((SubLObject) (multiply(arg_order_list_length, subtract(arg_order_list_length, ONE_INTEGER)))) : ONE_INTEGER;
            SubLObject step = NIL;
            SubLObject operation_list = NIL;
            SubLObject operation = NIL;
            for (step = ONE_INTEGER, operation_list = operation_list_orig, operation = operation_list.first(); !step.numGE(num_steps); step = add(step, ONE_INTEGER) , operation_list = list_utilities.list_rotate_left(operation_list) , operation = operation_list.first()) {
                cur_arg_order_list = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_apply_operation(cur_arg_order_list, operation);
                arg_order_list_list = cons(cur_arg_order_list, arg_order_list_list);
            }
            arg_order_list_list = nreverse(arg_order_list_list);
            arg_order_list_list = remove_duplicates(arg_order_list_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return arg_order_list_list;
        }
    }

    public static SubLObject quantproc_3_arg_order_list_permutations(final SubLObject arg_order_list) {
        SubLObject arg_order_list_list = list(arg_order_list);
        SubLObject cur_arg_order_list = arg_order_list;
        final SubLObject operation_list_orig = $list133;
        final SubLObject arg_order_list_length = length(arg_order_list);
        final SubLObject num_steps = (arg_order_list_length.numG(ONE_INTEGER)) ? multiply(arg_order_list_length, subtract(arg_order_list_length, ONE_INTEGER)) : ONE_INTEGER;
        SubLObject step = NIL;
        SubLObject operation_list = NIL;
        SubLObject operation = NIL;
        step = ONE_INTEGER;
        operation_list = operation_list_orig;
        operation = operation_list.first();
        while (!step.numGE(num_steps)) {
            cur_arg_order_list = quantproc_3_apply_operation(cur_arg_order_list, operation);
            arg_order_list_list = cons(cur_arg_order_list, arg_order_list_list);
            step = add(step, ONE_INTEGER);
            operation_list = list_utilities.list_rotate_left(operation_list);
            operation = operation_list.first();
        } 
        arg_order_list_list = nreverse(arg_order_list_list);
        arg_order_list_list = remove_duplicates(arg_order_list_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return arg_order_list_list;
    }

    public static final SubLObject quantproc_3_el_formula_permutations_alt(SubLObject asent) {
        {
            SubLObject arg_order_list_orig = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_formula_arg_order_list(asent);
            SubLObject arg_order_list_list = com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_arg_order_list_permutations(arg_order_list_orig);
            SubLObject result_list = NIL;
            arg_order_list_list = remove_duplicates(arg_order_list_list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = arg_order_list_list;
                SubLObject arg_order_list = NIL;
                for (arg_order_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_order_list = cdolist_list_var.first()) {
                    result_list = cons(com.cyc.cycjava.cycl.reformulator_module_quantifier_processing_3.quantproc_3_expression_arg_order_list_apply(asent, arg_order_list), result_list);
                }
            }
            result_list = nreverse(result_list);
            return result_list;
        }
    }

    public static SubLObject quantproc_3_el_formula_permutations(final SubLObject asent) {
        final SubLObject arg_order_list_orig = quantproc_3_formula_arg_order_list(asent);
        SubLObject arg_order_list_list = quantproc_3_arg_order_list_permutations(arg_order_list_orig);
        SubLObject result_list = NIL;
        SubLObject cdolist_list_var;
        arg_order_list_list = cdolist_list_var = remove_duplicates(arg_order_list_list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject arg_order_list = NIL;
        arg_order_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_list = cons(quantproc_3_expression_arg_order_list_apply(asent, arg_order_list), result_list);
            cdolist_list_var = cdolist_list_var.rest();
            arg_order_list = cdolist_list_var.first();
        } 
        result_list = nreverse(result_list);
        return result_list;
    }

    public static final SubLObject declare_reformulator_module_quantifier_processing_3_file_alt() {
        declareFunction("quantproc_3_required", "QUANTPROC-3-REQUIRED", 3, 0, false);
        declareFunction("quantproc_3_any_nl_quant_fn_expressionP", "QUANTPROC-3-ANY-NL-QUANT-FN-EXPRESSION?", 2, 0, false);
        declareFunction("quantproc_3_nl_quant_fn_expressionP", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION?", 4, 0, false);
        declareFunction("quantproc_3_numerical_quant_fn_expressionP", "QUANTPROC-3-NUMERICAL-QUANT-FN-EXPRESSION?", 2, 0, false);
        declareFunction("subcollection_function_naut_sans_mtP", "SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?", 1, 0, false);
        declareFunction("quantproc_3_subcol_expressionP", "QUANTPROC-3-SUBCOL-EXPRESSION?", 2, 0, false);
        declareFunction("non_gen_quant_attributeP", "NON-GEN-QUANT-ATTRIBUTE?", 1, 0, false);
        declareFunction("quantproc_3_nested_subcol_expressionP", "QUANTPROC-3-NESTED-SUBCOL-EXPRESSION?", 2, 0, false);
        declareFunction("quantproc_3_cardinality_of_fn_expressionP", "QUANTPROC-3-CARDINALITY-OF-FN-EXPRESSION?", 2, 0, false);
        declareFunction("quantproc_3_gen_quant_reln_type_arg_position", "QUANTPROC-3-GEN-QUANT-RELN-TYPE-ARG-POSITION", 2, 0, false);
        declareFunction("gen_quant_relation_from_p", "GEN-QUANT-RELATION-FROM-P", 1, 0, false);
        declareFunction("gen_quant_relation_to_p", "GEN-QUANT-RELATION-TO-P", 1, 0, false);
        declareFunction("quantproc_3_gen_quant_reln_from_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-FROM-EXPRESSION?", 2, 0, false);
        declareFunction("quantproc_3_gen_quant_reln_to_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-TO-EXPRESSION?", 2, 0, false);
        declareFunction("quantproc_3_cost", "QUANTPROC-3-COST", 3, 0, false);
        declareFunction("quantproc_3_reformulate", "QUANTPROC-3-REFORMULATE", 4, 0, false);
        declareFunction("quantproc_3_reformulate_cardinality_of_fn", "QUANTPROC-3-REFORMULATE-CARDINALITY-OF-FN", 4, 1, false);
        declareFunction("quantproc_3_reformulate_gen_quant_reln_to", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-TO", 3, 0, false);
        declareFunction("quantproc_3_reformulate_gen_quant_reln_from", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-FROM", 3, 0, false);
        declareFunction("quantproc_3_reformulate_gen_quant", "QUANTPROC-3-REFORMULATE-GEN-QUANT", 4, 1, false);
        declareFunction("quantproc_3_reformulate_every", "QUANTPROC-3-REFORMULATE-EVERY", 4, 1, false);
        declareFunction("quantproc_3_reformulate_some", "QUANTPROC-3-REFORMULATE-SOME", 4, 1, false);
        declareFunction("quantproc_3_reformulate_bare_form", "QUANTPROC-3-REFORMULATE-BARE-FORM", 4, 1, false);
        declareFunction("quantproc_3_reformulate_each", "QUANTPROC-3-REFORMULATE-EACH", 4, 1, false);
        declareFunction("quantproc_3_reformulate_no", "QUANTPROC-3-REFORMULATE-NO", 4, 1, false);
        declareFunction("quantproc_3_reformulate_indefinite", "QUANTPROC-3-REFORMULATE-INDEFINITE", 4, 1, false);
        declareFunction("quantproc_3_reformulate_definite", "QUANTPROC-3-REFORMULATE-DEFINITE", 4, 1, false);
        declareFunction("quantproc_3_reformulate_numerical", "QUANTPROC-3-REFORMULATE-NUMERICAL", 4, 1, false);
        declareFunction("quantproc_3_reformulate_subcol", "QUANTPROC-3-REFORMULATE-SUBCOL", 4, 1, false);
        declareFunction("quantproc_3_reformulate_nested_subcol", "QUANTPROC-3-REFORMULATE-NESTED-SUBCOL", 4, 1, false);
        declareFunction("quantproc_3_el_formula_next_arg_argnum", "QUANTPROC-3-EL-FORMULA-NEXT-ARG-ARGNUM", 2, 0, false);
        declareFunction("quantproc_3_nl_quant_fn_expression_arg_order", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER", 1, 0, false);
        declareFunction("quantproc_3_expression_arg_order_list_apply", "QUANTPROC-3-EXPRESSION-ARG-ORDER-LIST-APPLY", 2, 0, false);
        declareFunction("quantproc_3_formula_arg_order_list", "QUANTPROC-3-FORMULA-ARG-ORDER-LIST", 1, 0, false);
        declareFunction("quantproc_3_el_formula_normalize", "QUANTPROC-3-EL-FORMULA-NORMALIZE", 1, 0, false);
        declareFunction("quantproc_3_apply_operation", "QUANTPROC-3-APPLY-OPERATION", 2, 0, false);
        declareFunction("quantproc_3_arg_order_list_permutations", "QUANTPROC-3-ARG-ORDER-LIST-PERMUTATIONS", 1, 0, false);
        declareFunction("quantproc_3_el_formula_permutations", "QUANTPROC-3-EL-FORMULA-PERMUTATIONS", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_reformulator_module_quantifier_processing_3_file() {
        if (SubLFiles.USE_V1) {
	    declareFunction("quantproc_3_required", "QUANTPROC-3-REQUIRED", 3, 0, false);
	    declareFunction("quantproc_3_any_nl_quant_fn_expressionP", "QUANTPROC-3-ANY-NL-QUANT-FN-EXPRESSION?", 2, 0, false);
	    declareFunction("quantproc_3_nl_quant_fn_expressionP", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION?", 4, 0, false);
	    declareFunction("quantproc_3_numerical_quant_fn_expressionP", "QUANTPROC-3-NUMERICAL-QUANT-FN-EXPRESSION?", 2, 0, false);
	    declareFunction("subcollection_function_naut_sans_mtP", "SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?", 1, 0, false);
	    declareFunction("quantproc_3_subcol_expressionP", "QUANTPROC-3-SUBCOL-EXPRESSION?", 2, 0, false);
	    declareFunction("non_gen_quant_attributeP", "NON-GEN-QUANT-ATTRIBUTE?", 1, 0, false);
	    declareFunction("quantproc_3_nested_subcol_expressionP", "QUANTPROC-3-NESTED-SUBCOL-EXPRESSION?", 2, 0, false);
	    declareFunction("quantproc_3_cardinality_of_fn_expressionP", "QUANTPROC-3-CARDINALITY-OF-FN-EXPRESSION?", 2, 0, false);
	    declareFunction("quantproc_3_gen_quant_reln_type_arg_position", "QUANTPROC-3-GEN-QUANT-RELN-TYPE-ARG-POSITION", 2, 0, false);
	    declareFunction("gen_quant_relation_from_p", "GEN-QUANT-RELATION-FROM-P", 1, 0, false);
	    declareFunction("gen_quant_relation_to_p", "GEN-QUANT-RELATION-TO-P", 1, 0, false);
	    declareFunction("quantproc_3_gen_quant_reln_from_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-FROM-EXPRESSION?", 2, 0, false);
	    declareFunction("quantproc_3_gen_quant_reln_to_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-TO-EXPRESSION?", 2, 0, false);
	    declareFunction("quantproc_3_cost", "QUANTPROC-3-COST", 3, 0, false);
	    declareFunction("quantproc_3_reformulate", "QUANTPROC-3-REFORMULATE", 4, 0, false);
	    declareFunction("quantproc_3_reformulate_cardinality_of_fn", "QUANTPROC-3-REFORMULATE-CARDINALITY-OF-FN", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_gen_quant_reln_to", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-TO", 3, 0, false);
	    declareFunction("quantproc_3_reformulate_gen_quant_reln_from", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-FROM", 3, 0, false);
	    declareFunction("quantproc_3_reformulate_gen_quant", "QUANTPROC-3-REFORMULATE-GEN-QUANT", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_every", "QUANTPROC-3-REFORMULATE-EVERY", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_some", "QUANTPROC-3-REFORMULATE-SOME", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_bare_form", "QUANTPROC-3-REFORMULATE-BARE-FORM", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_each", "QUANTPROC-3-REFORMULATE-EACH", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_no", "QUANTPROC-3-REFORMULATE-NO", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_indefinite", "QUANTPROC-3-REFORMULATE-INDEFINITE", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_definite", "QUANTPROC-3-REFORMULATE-DEFINITE", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_numerical", "QUANTPROC-3-REFORMULATE-NUMERICAL", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_subcol", "QUANTPROC-3-REFORMULATE-SUBCOL", 4, 1, false);
	    declareFunction("quantproc_3_reformulate_nested_subcol", "QUANTPROC-3-REFORMULATE-NESTED-SUBCOL", 4, 1, false);
	    declareFunction("quantproc_3_el_formula_next_arg_argnum", "QUANTPROC-3-EL-FORMULA-NEXT-ARG-ARGNUM", 2, 0, false);
	    declareFunction("quantproc_3_nl_quant_fn_expression_arg_order", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER", 1, 0, false);
	    declareFunction("quantproc_3_expression_arg_order_list_apply", "QUANTPROC-3-EXPRESSION-ARG-ORDER-LIST-APPLY", 2, 0, false);
	    declareFunction("quantproc_3_formula_arg_order_list", "QUANTPROC-3-FORMULA-ARG-ORDER-LIST", 1, 0, false);
	    declareFunction("quantproc_3_el_formula_normalize", "QUANTPROC-3-EL-FORMULA-NORMALIZE", 1, 0, false);
	    declareFunction("quantproc_3_apply_operation", "QUANTPROC-3-APPLY-OPERATION", 2, 0, false);
	    declareFunction("quantproc_3_arg_order_list_permutations", "QUANTPROC-3-ARG-ORDER-LIST-PERMUTATIONS", 1, 0, false);
	    declareFunction("quantproc_3_el_formula_permutations", "QUANTPROC-3-EL-FORMULA-PERMUTATIONS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("quantproc_3_required", "QUANTPROC-3-REQUIRED", 3, 0, false);
            declareFunction("quantproc_3_any_nl_quant_fn_expressionP", "QUANTPROC-3-ANY-NL-QUANT-FN-EXPRESSION?", 2, 0, false);
            declareFunction("quantproc_3_nl_quant_fn_expressionP", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION?", 4, 0, false);
            declareFunction("quantproc_3_numerical_quant_fn_expressionP", "QUANTPROC-3-NUMERICAL-QUANT-FN-EXPRESSION?", 2, 0, false);
            declareFunction("subcollection_function_naut_sans_mtP", "SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?", 1, 0, false);
            declareFunction("quantproc_3_subcol_expressionP", "QUANTPROC-3-SUBCOL-EXPRESSION?", 2, 0, false);
            declareFunction("non_gen_quant_attributeP", "NON-GEN-QUANT-ATTRIBUTE?", 1, 0, false);
            declareFunction("quantproc_3_nested_subcol_expressionP", "QUANTPROC-3-NESTED-SUBCOL-EXPRESSION?", 2, 0, false);
            declareFunction("quantproc_3_cardinality_of_fn_expressionP", "QUANTPROC-3-CARDINALITY-OF-FN-EXPRESSION?", 2, 0, false);
            declareFunction("quantproc_3_gen_quant_reln_type_arg_position", "QUANTPROC-3-GEN-QUANT-RELN-TYPE-ARG-POSITION", 2, 0, false);
            declareFunction("gen_quant_relation_from_p", "GEN-QUANT-RELATION-FROM-P", 1, 0, false);
            declareFunction("gen_quant_relation_to_p", "GEN-QUANT-RELATION-TO-P", 1, 0, false);
            declareFunction("quantproc_3_gen_quant_reln_from_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-FROM-EXPRESSION?", 2, 0, false);
            declareFunction("quantproc_3_gen_quant_reln_to_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-TO-EXPRESSION?", 2, 0, false);
            declareFunction("quantproc_3_cost", "QUANTPROC-3-COST", 3, 0, false);
            declareFunction("quantproc_3_reformulate", "QUANTPROC-3-REFORMULATE", 4, 0, false);
            declareFunction("quantproc_3_reformulate_cardinality_of_fn", "QUANTPROC-3-REFORMULATE-CARDINALITY-OF-FN", 4, 1, false);
            declareFunction("quantproc_3_reformulate_gen_quant_reln_to", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-TO", 3, 0, false);
            declareFunction("quantproc_3_reformulate_gen_quant_reln_from", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-FROM", 3, 0, false);
            declareFunction("quantproc_3_reformulate_gen_quant", "QUANTPROC-3-REFORMULATE-GEN-QUANT", 4, 1, false);
            declareFunction("quantproc_3_reformulate_every", "QUANTPROC-3-REFORMULATE-EVERY", 4, 1, false);
            declareFunction("quantproc_3_reformulate_some", "QUANTPROC-3-REFORMULATE-SOME", 4, 1, false);
            declareFunction("quantproc_3_reformulate_bare_form", "QUANTPROC-3-REFORMULATE-BARE-FORM", 4, 1, false);
            declareFunction("quantproc_3_reformulate_each", "QUANTPROC-3-REFORMULATE-EACH", 4, 1, false);
            declareFunction("quantproc_3_reformulate_no", "QUANTPROC-3-REFORMULATE-NO", 4, 1, false);
            declareFunction("quantproc_3_reformulate_indefinite", "QUANTPROC-3-REFORMULATE-INDEFINITE", 4, 1, false);
            declareFunction("quantproc_3_reformulate_definite", "QUANTPROC-3-REFORMULATE-DEFINITE", 4, 1, false);
            declareFunction("quantproc_3_reformulate_numerical", "QUANTPROC-3-REFORMULATE-NUMERICAL", 4, 1, false);
            declareFunction("quantproc_3_reformulate_subcol", "QUANTPROC-3-REFORMULATE-SUBCOL", 4, 1, false);
            declareFunction("quantproc_3_reformulate_nested_subcol", "QUANTPROC-3-REFORMULATE-NESTED-SUBCOL", 4, 1, false);
            declareFunction("quantproc_3_el_formula_next_arg_argnum", "QUANTPROC-3-EL-FORMULA-NEXT-ARG-ARGNUM", 2, 0, false);
            declareFunction("quantproc_3_nl_quant_fn_expression_arg_order", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER", 1, 0, false);
            declareFunction("quantproc_3_expression_arg_order_list_apply", "QUANTPROC-3-EXPRESSION-ARG-ORDER-LIST-APPLY", 2, 0, false);
            declareFunction("quantproc_3_formula_arg_order_list", "QUANTPROC-3-FORMULA-ARG-ORDER-LIST", 1, 0, false);
            declareFunction("quantproc_3_el_formula_normalize", "QUANTPROC-3-EL-FORMULA-NORMALIZE", 1, 0, false);
            declareFunction("quantproc_3_apply_operation", "QUANTPROC-3-APPLY-OPERATION", 2, 0, false);
            declareFunction("quantproc_3_arg_order_list_permutations", "QUANTPROC-3-ARG-ORDER-LIST-PERMUTATIONS", 1, 0, false);
            declareFunction("quantproc_3_el_formula_permutations", "QUANTPROC-3-EL-FORMULA-PERMUTATIONS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_reformulator_module_quantifier_processing_3_file_Previous() {
	declareFunction("quantproc_3_required", "QUANTPROC-3-REQUIRED", 3, 0, false);
	declareFunction("quantproc_3_any_nl_quant_fn_expressionP", "QUANTPROC-3-ANY-NL-QUANT-FN-EXPRESSION?", 2, 0, false);
	declareFunction("quantproc_3_nl_quant_fn_expressionP", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION?", 4, 0, false);
	declareFunction("quantproc_3_numerical_quant_fn_expressionP", "QUANTPROC-3-NUMERICAL-QUANT-FN-EXPRESSION?", 2, 0, false);
	declareFunction("subcollection_function_naut_sans_mtP", "SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?", 1, 0, false);
	declareFunction("quantproc_3_subcol_expressionP", "QUANTPROC-3-SUBCOL-EXPRESSION?", 2, 0, false);
	declareFunction("non_gen_quant_attributeP", "NON-GEN-QUANT-ATTRIBUTE?", 1, 0, false);
	declareFunction("quantproc_3_nested_subcol_expressionP", "QUANTPROC-3-NESTED-SUBCOL-EXPRESSION?", 2, 0, false);
	declareFunction("quantproc_3_cardinality_of_fn_expressionP", "QUANTPROC-3-CARDINALITY-OF-FN-EXPRESSION?", 2, 0, false);
	declareFunction("quantproc_3_gen_quant_reln_type_arg_position", "QUANTPROC-3-GEN-QUANT-RELN-TYPE-ARG-POSITION", 2, 0, false);
	declareFunction("gen_quant_relation_from_p", "GEN-QUANT-RELATION-FROM-P", 1, 0, false);
	declareFunction("gen_quant_relation_to_p", "GEN-QUANT-RELATION-TO-P", 1, 0, false);
	declareFunction("quantproc_3_gen_quant_reln_from_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-FROM-EXPRESSION?", 2, 0, false);
	declareFunction("quantproc_3_gen_quant_reln_to_expressionP", "QUANTPROC-3-GEN-QUANT-RELN-TO-EXPRESSION?", 2, 0, false);
	declareFunction("quantproc_3_cost", "QUANTPROC-3-COST", 3, 0, false);
	declareFunction("quantproc_3_reformulate", "QUANTPROC-3-REFORMULATE", 4, 0, false);
	declareFunction("quantproc_3_reformulate_cardinality_of_fn", "QUANTPROC-3-REFORMULATE-CARDINALITY-OF-FN", 4, 1, false);
	declareFunction("quantproc_3_reformulate_gen_quant_reln_to", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-TO", 3, 0, false);
	declareFunction("quantproc_3_reformulate_gen_quant_reln_from", "QUANTPROC-3-REFORMULATE-GEN-QUANT-RELN-FROM", 3, 0, false);
	declareFunction("quantproc_3_reformulate_gen_quant", "QUANTPROC-3-REFORMULATE-GEN-QUANT", 4, 1, false);
	declareFunction("quantproc_3_reformulate_every", "QUANTPROC-3-REFORMULATE-EVERY", 4, 1, false);
	declareFunction("quantproc_3_reformulate_some", "QUANTPROC-3-REFORMULATE-SOME", 4, 1, false);
	declareFunction("quantproc_3_reformulate_bare_form", "QUANTPROC-3-REFORMULATE-BARE-FORM", 4, 1, false);
	declareFunction("quantproc_3_reformulate_each", "QUANTPROC-3-REFORMULATE-EACH", 4, 1, false);
	declareFunction("quantproc_3_reformulate_no", "QUANTPROC-3-REFORMULATE-NO", 4, 1, false);
	declareFunction("quantproc_3_reformulate_indefinite", "QUANTPROC-3-REFORMULATE-INDEFINITE", 4, 1, false);
	declareFunction("quantproc_3_reformulate_definite", "QUANTPROC-3-REFORMULATE-DEFINITE", 4, 1, false);
	declareFunction("quantproc_3_reformulate_numerical", "QUANTPROC-3-REFORMULATE-NUMERICAL", 4, 1, false);
	declareFunction("quantproc_3_reformulate_subcol", "QUANTPROC-3-REFORMULATE-SUBCOL", 4, 1, false);
	declareFunction("quantproc_3_reformulate_nested_subcol", "QUANTPROC-3-REFORMULATE-NESTED-SUBCOL", 4, 1, false);
	declareFunction("quantproc_3_el_formula_next_arg_argnum", "QUANTPROC-3-EL-FORMULA-NEXT-ARG-ARGNUM", 2, 0, false);
	declareFunction("quantproc_3_nl_quant_fn_expression_arg_order", "QUANTPROC-3-NL-QUANT-FN-EXPRESSION-ARG-ORDER", 1, 0, false);
	declareFunction("quantproc_3_expression_arg_order_list_apply", "QUANTPROC-3-EXPRESSION-ARG-ORDER-LIST-APPLY", 2, 0, false);
	declareFunction("quantproc_3_formula_arg_order_list", "QUANTPROC-3-FORMULA-ARG-ORDER-LIST", 1, 0, false);
	declareFunction("quantproc_3_el_formula_normalize", "QUANTPROC-3-EL-FORMULA-NORMALIZE", 1, 0, false);
	declareFunction("quantproc_3_apply_operation", "QUANTPROC-3-APPLY-OPERATION", 2, 0, false);
	declareFunction("quantproc_3_arg_order_list_permutations", "QUANTPROC-3-ARG-ORDER-LIST-PERMUTATIONS", 1, 0, false);
	declareFunction("quantproc_3_el_formula_permutations", "QUANTPROC-3-EL-FORMULA-PERMUTATIONS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_quantifier_processing_3_file() {
        defparameter("*SUBCOLLECTION-FUNCTION-MT*", NIL);
        deflexical("*GEN-QUANT-RELATIONS-FROM*", $list24);
        deflexical("*GEN-QUANT-RELATIONS-TO*", $list25);
        deflexical("*QUANTPROC-3-MICROSECONDS*", $int$30000);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_quantifier_processing_3_file() {
        reformulator_module_harness.declare_rl_module($$QuantifierProcessing_3_RLModule, $list1);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_quantifier_processing_3_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_quantifier_processing_3_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_quantifier_processing_3_file();
    }

    static {
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("QUANTPROC-3-REQUIRED"), $COST, makeSymbol("QUANTPROC-3-COST"), makeKeyword("REFORMULATE"), makeSymbol("QUANTPROC-3-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Handles the reformulation of NL-quantified expressions."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$contains-Underspecified \n     (#$NLQuantFn-3 #$Every-NLAttr \n \t       (#$NLNumberFn #$Singular-NLAttr #$SNRNP)) \n     (#$NLQuantFn-3 #$Some-NLAttr \n \t       (#$NLNumberFn #$Mass-NLAttr #$RNAMolecule)))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$implies \n     (#$isa ?VAR0 #$SNRNP) \n     (#$contains-Underspecified ?VAR0 \n      (#$NLQuantFn-3 #$Some-NLAttr \n       (#$NLNumberFn #$Mass-NLAttr #$RNAMolecule))))") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ reader_make_constant_shell("Every-NLAttr"), reader_make_constant_shell("Some-NLAttr"), reader_make_constant_shell("BareForm-NLAttr"), reader_make_constant_shell("Each-NLAttr"), reader_make_constant_shell("No-NLAttr"), reader_make_constant_shell("Many-NLAttr"), reader_make_constant_shell("Most-NLAttr"), reader_make_constant_shell("Several-NLAttr"), reader_make_constant_shell("Few-NLAttr") });

    static private final SubLList $list_alt5 = list(reader_make_constant_shell("Indefinite-NLAttr"), reader_make_constant_shell("Definite-NLAttr"));

    static private final SubLList $list_alt7 = list(list(reader_make_constant_shell("NLNumberFn"), list(makeKeyword("ISA"), reader_make_constant_shell("NLNumberAttribute")), list($TEST, makeSymbol("ISA-COLLECTION?"))));

    static private final SubLList $list_alt8 = list(list(reader_make_constant_shell("NLNumberFn"), list(makeKeyword("ISA"), reader_make_constant_shell("NLNumberAttribute")), list($TEST, makeSymbol("ISA-COLLECTION?"))), list($TEST, makeSymbol("NUMBERP")));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("NLQuantFn-3"), list(reader_make_constant_shell("NumericalQuant-NLAttrFn"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("NLNumberFn"), list(makeKeyword("ISA"), reader_make_constant_shell("NLNumberAttribute")), list($TEST, makeSymbol("ISA-COLLECTION?"))), list($TEST, makeSymbol("NUMBERP")));

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("NLQuantFn"), list(reader_make_constant_shell("NumericalQuant-NLAttrFn"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("NLNumberFn"), list(makeKeyword("ISA"), reader_make_constant_shell("NLNumberAttribute")), list($TEST, makeSymbol("ISA-COLLECTION?"))));

    static private final SubLList $list_alt11 = list(list($TEST, makeSymbol("NL-TAG-FN-FORT-3?")), list($TEST, makeSymbol("NON-GEN-QUANT-ATTRIBUTE?")), list(reader_make_constant_shell("NLNumberFn"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?"))), list($TEST, makeSymbol("NUMBERP")));

    static private final SubLList $list_alt12 = list(list($TEST, makeSymbol("NL-TAG-FN-FORT-3?")), list($TEST, makeSymbol("NON-GEN-QUANT-ATTRIBUTE?")), list(reader_make_constant_shell("NLNumberFn"), makeKeyword("ANYTHING"), list($TEST, makeSymbol("SUBCOLLECTION-FUNCTION-NAUT-SANS-MT?"))));

    static private final SubLList $list_alt14 = list(reader_make_constant_shell("Definite-NLAttr"), reader_make_constant_shell("Indefinite-NLAttr"));

    static private final SubLList $list_alt15 = list(reader_make_constant_shell("BareForm-NLAttr"));

    static private final SubLList $list_alt16 = list(reader_make_constant_shell("CardinalityOfFn"), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt17 = list(reader_make_constant_shell("BareForm-NLAttr"), reader_make_constant_shell("Some-NLAttr"));

    static private final SubLList $list_alt18 = list(reader_make_constant_shell("Indefinite-NLAttr"));

    static private final SubLList $list_alt24 = list(reader_make_constant_shell("most-GenQuantRelnFrom"), reader_make_constant_shell("many-GenQuantRelnFrom"), reader_make_constant_shell("few-GenQuantRelnFrom"), reader_make_constant_shell("several-GenQuantRelnFrom"), reader_make_constant_shell("no-GenQuantRelnFrom"));

    static private final SubLList $list_alt25 = list(reader_make_constant_shell("most-GenQuantRelnTo"), reader_make_constant_shell("many-GenQuantRelnTo"), reader_make_constant_shell("few-GenQuantRelnTo"), reader_make_constant_shell("several-GenQuantRelnTo"), reader_make_constant_shell("no-GenQuantRelnTo"));

    static private final SubLList $list_alt27 = list(reader_make_constant_shell("Every-NLAttr"));

    static private final SubLList $list_alt28 = list(reader_make_constant_shell("Some-NLAttr"));

    static private final SubLList $list_alt29 = list(reader_make_constant_shell("Each-NLAttr"));

    static private final SubLList $list_alt30 = list(reader_make_constant_shell("Most-NLAttr"), reader_make_constant_shell("Many-NLAttr"), reader_make_constant_shell("Several-NLAttr"), reader_make_constant_shell("Few-NLAttr"));

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("No-NLAttr"));

    static private final SubLList $list_alt32 = list(reader_make_constant_shell("Definite-NLAttr"));

    static private final SubLString $str_alt40$3_4 = makeString("3.4");

    static private final SubLString $str_alt43$11_5_1 = makeString("11.5.1");

    static private final SubLString $str_alt46$2_4 = makeString("2.4");

    static private final SubLString $str_alt49$7_5_1 = makeString("7.5.1");

    static private final SubLString $str_alt52$9_2_5 = makeString("9.2.5");

    static private final SubLString $str_alt55$3_3 = makeString("3.3");

    static private final SubLString $str_alt58$11_5_2 = makeString("11.5.2");

    static private final SubLString $str_alt61$2_5 = makeString("2.5");

    static private final SubLString $str_alt64$7_5_2 = makeString("7.5.2");

    static private final SubLString $str_alt66$9_1_5 = makeString("9.1.5");

    static private final SubLList $list_alt68 = list(reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Mass-NLAttr"));

    static private final SubLString $str_alt70$GenQuant_2_1 = makeString("GenQuant 2.1");

    static private final SubLString $str_alt72$GenQuant_2_2 = makeString("GenQuant 2.2");

    static private final SubLString $str_alt74$GenQuant_2_3 = makeString("GenQuant 2.3");

    static private final SubLString $str_alt76$GenQuant_2_4 = makeString("GenQuant 2.4");

    static private final SubLString $str_alt77$GenQuant_3_1 = makeString("GenQuant 3.1");

    static private final SubLString $str_alt78$GenQuant_3_2 = makeString("GenQuant 3.2");

    static private final SubLString $str_alt79$GenQuant_3_3 = makeString("GenQuant 3.3");

    static private final SubLString $str_alt80$GenQuant_3_4 = makeString("GenQuant 3.4");

    static private final SubLList $list_alt87 = list(reader_make_constant_shell("Thing"));

    static private final SubLList $list_alt88 = list(reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Mass-NLAttr"), reader_make_constant_shell("Singular-NLAttr"));

    static private final SubLList $list_alt89 = list(TWO_INTEGER, ONE_INTEGER);

    static private final SubLString $str_alt91$BAREFORM_1 = makeString("BAREFORM-1");

    static private final SubLString $str_alt92$BAREFORM_2 = makeString("BAREFORM-2");

    static private final SubLString $str_alt93$BAREFORM_3 = makeString("BAREFORM-3");

    static private final SubLList $list_alt95 = list(ONE_INTEGER, TWO_INTEGER);

    static private final SubLString $str_alt96$5_1_or_5_2 = makeString("5.1 or 5.2");

    static private final SubLList $list_alt97 = list(reader_make_constant_shell("Singular-NLAttr"), reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Mass-NLAttr"));

    static private final SubLString $str_alt98$9_1 = makeString("9.1");

    static private final SubLString $str_alt99$9_2 = makeString("9.2");

    static private final SubLString $str_alt101$9_5_ = makeString("9.5+");

    static private final SubLList $list_alt102 = list(reader_make_constant_shell("Singular-NLAttr"), reader_make_constant_shell("Generic-NLAttr"));

    static private final SubLString $str_alt105$4_2 = makeString("4.2");

    static private final SubLString $str_alt106$6_1 = makeString("6.1");

    static private final SubLList $list_alt107 = list(reader_make_constant_shell("Mass-NLAttr"), reader_make_constant_shell("Plural-NLAttr"));

    static private final SubLString $str_alt112$6_4_1 = makeString("6.4.1");

    static private final SubLString $str_alt116$10_1 = makeString("10.1");

    static private final SubLList $list_alt122 = list(reader_make_constant_shell("Mass-NLAttr"), reader_make_constant_shell("Singular-NLAttr"));

    static private final SubLString $str_alt123$8_1_or_8_2 = makeString("8.1 or 8.2");

    static private final SubLList $list_alt124 = list(reader_make_constant_shell("BareForm-NLAttr"), reader_make_constant_shell("Every-NLAttr"), reader_make_constant_shell("Each-NLAttr"));

    static private final SubLString $str_alt125$8_2_5 = makeString("8.2.5");

    static private final SubLList $list_alt126 = list(reader_make_constant_shell("Mass-NLAttr"), reader_make_constant_shell("Plural-NLAttr"), reader_make_constant_shell("Singular-NLAttr"));

    static private final SubLString $str_alt127$8_3_1 = makeString("8.3.1");

    static private final SubLList $list_alt129 = list(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER });

    static private final SubLList $list_alt133 = list(makeKeyword("SWITCH-FIRST"), makeKeyword("SHIFT-LEFT"), makeKeyword("SWITCH-FIRST"), makeKeyword("SHIFT-RIGHT"));
}

/**
 * Total time: 274 ms
 */
