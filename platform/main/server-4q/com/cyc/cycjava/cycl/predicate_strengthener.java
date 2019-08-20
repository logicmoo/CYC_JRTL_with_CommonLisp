/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PREDICATE-STRENGTHENER
 * source file: /cyc/top/cycl/predicate-strengthener.lisp
 * created:     2019/07/03 17:38:01
 */
public final class predicate_strengthener extends SubLTranslatedFile implements V12 {
    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_126_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("inRegion"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("objectFoundInLocation"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))))), T), list(list(list(reader_make_constant_shell("relationInstanceExists"), reader_make_constant_shell("possessiveRelation"), reader_make_constant_shell("Lenat"), reader_make_constant_shell("PhDDegree")), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("relationInstanceExists"), reader_make_constant_shell("hasIssuedTo"), reader_make_constant_shell("Lenat"), reader_make_constant_shell("PhDDegree")))), T), list(list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("IntelligentAgent"), reader_make_constant_shell("AliceInWonderland-TheBook")), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("characterInCW"), reader_make_constant_shell("IntelligentAgent"), reader_make_constant_shell("AliceInWonderland-TheBook")))), T), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("is-Underspecified"), reader_make_constant_shell("BillClinton"), makeSymbol("?X")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("MaleAnimal")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("father"), reader_make_constant_shell("Animal"), makeSymbol("?X")))), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("father"), reader_make_constant_shell("Animal"), reader_make_constant_shell("BillClinton")))), T), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("contains-Underspecified"), reader_make_constant_shell("Animal"), makeSymbol("?X")), list(reader_make_constant_shell("is-Underspecified"), reader_make_constant_shell("BillClinton"), makeSymbol("?X")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("MaleAnimal")))), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equals"), reader_make_constant_shell("BillClinton"), makeSymbol("?X")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("MaleAnimal")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("in-ContGeneric"), reader_make_constant_shell("Animal"), makeSymbol("?X")))), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equals"), reader_make_constant_shell("BillClinton"), makeSymbol("?X")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("MaleAnimal")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("constituents"), reader_make_constant_shell("Animal"), makeSymbol("?X")))))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State"))), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State"))))), T), list(list(list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")))), T), list(list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("in-UnderspecifiedContainer"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("inRegion"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("inRegion"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("objectFoundInLocation"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("objectFoundInLocation"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")))), T), list(list(list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("contains-Underspecified"), reader_make_constant_shell("Ribonucleotide"), reader_make_constant_shell("Ribose")), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("constituents"), reader_make_constant_shell("Ribonucleotide"), reader_make_constant_shell("Ribose")), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("in-ContGeneric"), reader_make_constant_shell("Ribonucleotide"), reader_make_constant_shell("Ribose")))), T) });
    }

    public static final SubLFile me = new predicate_strengthener();



    // defparameter
    @LispMethod(comment = "When doing predicate strengthening, should the original pred be pruned if there are other more specific preds?\ndefparameter")
    private static final SubLSymbol $strengthen_original_pred_awayP$ = makeSymbol("*STRENGTHEN-ORIGINAL-PRED-AWAY?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pred_strengthen_stop_at_first_specified_pred$ = makeSymbol("*PRED-STRENGTHEN-STOP-AT-FIRST-SPECIFIED-PRED*");

    // defparameter
    @LispMethod(comment = "Don\'t try to pred-strengthen sentences with more than this many literals\ndefparameter")
    public static final SubLSymbol $pred_strengthening_max_literal_count$ = makeSymbol("*PRED-STRENGTHENING-MAX-LITERAL-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $max_pred_strengs$ = makeSymbol("*MAX-PRED-STRENGS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pred_strengthener_fn$ = makeSymbol("*PRED-STRENGTHENER-FN*");

    // defparameter
    // Do not use typed spec preds of #$isa
    /**
     * Do not use typed spec preds of #$isa
     */
    @LispMethod(comment = "Do not use typed spec preds of #$isa\ndefparameter")
    private static final SubLSymbol $do_not_strengthen_isaP$ = makeSymbol("*DO-NOT-STRENGTHEN-ISA?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_constraint$ = makeSymbol("*DTP-CONSTRAINT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $predstren_common_uninteresting$ = makeSymbol("*PREDSTREN-COMMON-UNINTERESTING*");

    // defvar
    // what are the typed specInverses of the original pred?
    /**
     * what are the typed specInverses of the original pred?
     */
    @LispMethod(comment = "what are the typed specInverses of the original pred?\ndefvar")
    private static final SubLSymbol $ps_typed_inverses$ = makeSymbol("*PS-TYPED-INVERSES*");

    // defvar
    // what are the typed specPreds of the original pred?
    /**
     * what are the typed specPreds of the original pred?
     */
    @LispMethod(comment = "what are the typed specPreds of the original pred?\ndefvar")
    private static final SubLSymbol $ps_typed_preds$ = makeSymbol("*PS-TYPED-PREDS*");

    static private final SubLSymbol $sym1$ATOMIC_SENTENCE_ = makeSymbol("ATOMIC-SENTENCE?");

    private static final SubLSymbol $sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS = makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS");

    private static final SubLSymbol $sym4$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY = makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY");



    private static final SubLObject $$is_Underspecified = reader_make_constant_shell("is-Underspecified");

    private static final SubLString $str8$PredStren__no_contracted_version_ = makeString("PredStren: no contracted version for ~S~%");





    private static final SubLSymbol $sym13$PREDSTREN_EXPANDIBLE_RMP_ = makeSymbol("PREDSTREN-EXPANDIBLE-RMP?");

    private static final SubLSymbol $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_ = makeSymbol("PREDSTREN-EXPANDIBLE-EXPRESSION?");

    private static final SubLSymbol PREDSTREN_EXPAND_FORMULA = makeSymbol("PREDSTREN-EXPAND-FORMULA");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol PREDSTREN_EXPAND_ONE_STEP = makeSymbol("PREDSTREN-EXPAND-ONE-STEP");



    private static final SubLSymbol $reformulator_rules_to_use$ = makeSymbol("*REFORMULATOR-RULES-TO-USE*");







    private static final SubLSymbol $reformulator_rules_to_ignore$ = makeSymbol("*REFORMULATOR-RULES-TO-IGNORE*");

    private static final SubLList $list27 = list(reader_make_constant_shell("reformulatorEquiv"), list(makeSymbol("?PRED"), makeSymbol("?THING"), makeSymbol("?VAR"), makeSymbol("?ROLE")), list(makeSymbol("?PRED"), makeSymbol("?THING"), makeSymbol("?VAR"), list(reader_make_constant_shell("CycLVariableFn"), makeSymbol("?ROLE"))));



    static private final SubLList $list29 = list(makeSymbol("CYCL"), makeSymbol("MT"));





    private static final SubLList $list37 = list(makeKeyword("WFF-ENFORCEMENT"), $NONE);

    private static final SubLList $list38 = list(makeSymbol("TERM"), makeSymbol("ISAS"), makeSymbol("GENLS"));







    private static final SubLList $list42 = list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection"), reader_make_constant_shell("CollectionType"), reader_make_constant_shell("CollectionTypeType"));



    private static final SubLObject $$Set_Mathematical = reader_make_constant_shell("Set-Mathematical");



    private static final SubLSymbol CONSTRAINT_P = makeSymbol("CONSTRAINT-P");

    private static final SubLList $list48 = list(makeSymbol("VARIABLE"), makeSymbol("ISA-LIST"), makeSymbol("GENL-LIST"));

    private static final SubLList $list49 = list(makeKeyword("VARIABLE"), makeKeyword("ISA-LIST"), makeKeyword("GENL-LIST"));

    static private final SubLList $list50 = list(makeSymbol("CONSTRAINT-VARIABLE"), makeSymbol("CONSTRAINT-ISA-LIST"), makeSymbol("CONSTRAINT-GENL-LIST"));

    static private final SubLList $list51 = list(makeSymbol("_CSETF-CONSTRAINT-VARIABLE"), makeSymbol("_CSETF-CONSTRAINT-ISA-LIST"), makeSymbol("_CSETF-CONSTRAINT-GENL-LIST"));

    private static final SubLSymbol PRINT_CONSTRAINT = makeSymbol("PRINT-CONSTRAINT");

    private static final SubLSymbol CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list54 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CONSTRAINT-P"));

    private static final SubLSymbol CONSTRAINT_VARIABLE = makeSymbol("CONSTRAINT-VARIABLE");

    private static final SubLSymbol _CSETF_CONSTRAINT_VARIABLE = makeSymbol("_CSETF-CONSTRAINT-VARIABLE");

    private static final SubLSymbol CONSTRAINT_ISA_LIST = makeSymbol("CONSTRAINT-ISA-LIST");

    private static final SubLSymbol _CSETF_CONSTRAINT_ISA_LIST = makeSymbol("_CSETF-CONSTRAINT-ISA-LIST");

    private static final SubLSymbol CONSTRAINT_GENL_LIST = makeSymbol("CONSTRAINT-GENL-LIST");

    private static final SubLSymbol _CSETF_CONSTRAINT_GENL_LIST = makeSymbol("_CSETF-CONSTRAINT-GENL-LIST");

    private static final SubLString $str64$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CONSTRAINT = makeSymbol("MAKE-CONSTRAINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONSTRAINT-METHOD");

    private static final SubLString $str70$__Constraint___A_isa___A_genl___A = makeString("#<Constraint: ~A isa: ~A genl: ~A> ");





    private static final SubLSymbol COLLECTION_SUBSET_FN_NAUT_P = makeSymbol("COLLECTION-SUBSET-FN-NAUT-P");

    private static final SubLSymbol PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS = makeSymbol("PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS");

    private static final SubLSymbol COLLECTION_SUBSET_FN_NART_P = makeSymbol("COLLECTION-SUBSET-FN-NART-P");

    private static final SubLSymbol NART_EXPAND = makeSymbol("NART-EXPAND");





    private static final SubLList $list80 = list(makeSymbol("FUNCTOR"), makeSymbol("VAR"), makeSymbol("TERM"));

    static private final SubLList $list81 = list(reader_make_constant_shell("CycLVariable"));

    private static final SubLString $str83$Non_binary_constraint_in_Predicat = makeString("Non-binary constraint in Predicate Strengthener: ~S");

    private static final SubLSymbol PREDSTREN_IDENTIFY_PREDICATE = makeSymbol("PREDSTREN-IDENTIFY-PREDICATE");

    private static final SubLList $list85 = list(reader_make_constant_shell("genlMt"), reader_make_constant_shell("thereExists"));



    private static final SubLList $list87 = list(makeSymbol("HOW"), makeSymbol("PREDICATES"));

    private static final SubLSymbol $sym88$_ = makeSymbol("<");

    private static final SubLSymbol RELATION_GENERALITY_ESTIMATE = makeSymbol("RELATION-GENERALITY-ESTIMATE");

    private static final SubLList $list90 = list(reader_make_constant_shell("CycLSentence-Assertible"));



















    static private final SubLList $list100 = list(makeSymbol("PRED"), makeSymbol("MARKING"), makeSymbol("&OPTIONAL"), list(makeSymbol("PRED-TYPE"), makeKeyword("TYPED")));

    private static final SubLSymbol PRED_STRENG_MARKING_MODE = makeSymbol("PRED-STRENG-MARKING-MODE");

    static private final SubLList $list104 = list(makeSymbol("*SBHL-GENL-PREDS-MARKING*"));

    static private final SubLList $list106 = list(makeSymbol("*PS-TYPED-PREDS*"));

    static private final SubLList $list107 = list(makeSymbol("*SBHL-GENL-INVERSE-MARKING*"));

    static private final SubLList $list108 = list(makeSymbol("*PS-TYPED-INVERSES*"));

    private static final SubLList $list109 = list(makeSymbol("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*"));

    private static final SubLList $list110 = list(makeSymbol("*PS-SUGGESTED-PREDS*"));

    private static final SubLList $list111 = list(makeSymbol("*PS-SUGGESTED-INVERSES*"));

    private static final SubLList $list112 = list(makeSymbol("PRED"), makeSymbol("MARKING"));

    private static final SubLSymbol $sym114$MEMBER_ = makeSymbol("MEMBER?");

    private static final SubLSymbol $ps_suggested_preds$ = makeSymbol("*PS-SUGGESTED-PREDS*");

    private static final SubLSymbol SNOC = makeSymbol("SNOC");

    private static final SubLSymbol $ps_suggested_inverses$ = makeSymbol("*PS-SUGGESTED-INVERSES*");

    private static final SubLString $str119$Error_in_processing__A__result_co = makeString("Error in processing ~A~%result count not equal to expected count ~%actual result: ~A~%Expected Result ~A~%");

    private static final SubLSymbol $sym120$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLString $str121$_A___not_found_in_expected_result = makeString("~A~% not found in expected results for ~%~A~%");

    private static final SubLSymbol PASSES_PRED_STRENGTHENING_TEST = makeSymbol("PASSES-PRED-STRENGTHENING-TEST");

    private static final SubLObject $list129 = _constant_129_initializer();

    private static final SubLSymbol PASSES_NARTY_PRED_STRENGTHENING_TEST = makeSymbol("PASSES-NARTY-PRED-STRENGTHENING-TEST");

    private static final SubLList $list131 = list(list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("inRegion"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("objectFoundInLocation"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State"))), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State"))))), T), list(list(list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")))), T), list(list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("in-UnderspecifiedContainer"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("inRegion"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("inRegion"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("objectFoundInLocation"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("objectFoundInLocation"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")))), T));

    public static final SubLObject max_pred_strengs_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $max_pred_strengs$.getDynamicValue(thread);
        }
    }

    public static SubLObject max_pred_strengs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $max_pred_strengs$.getDynamicValue(thread);
    }

    public static final SubLObject skip_pred_strengthening_for_formulaP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != subl_promotions.non_negative_integer_p($pred_strengthening_max_literal_count$.getDynamicValue(thread))) && (NIL != list_utilities.lengthG(cycl_utilities.expression_gather(formula, $sym1$ATOMIC_SENTENCE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $pred_strengthening_max_literal_count$.getDynamicValue(thread), UNPROVIDED))) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject skip_pred_strengthening_for_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != subl_promotions.non_negative_integer_p($pred_strengthening_max_literal_count$.getDynamicValue(thread))) && (NIL != list_utilities.lengthG(cycl_utilities.expression_gather(formula, $sym1$ATOMIC_SENTENCE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $pred_strengthening_max_literal_count$.getDynamicValue(thread), UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    /**
     * given a formula, return the strengthened versions of that formula
     */
    @LispMethod(comment = "given a formula, return the strengthened versions of that formula")
    public static final SubLObject pred_strengthen_formula_alt(SubLObject formula, SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(formula, EL_FORMULA_P);
            {
                SubLObject new_proposals = NIL;
                if (NIL == skip_pred_strengthening_for_formulaP(formula)) {
                    {
                        SubLObject state = memoization_state.possibly_new_memoization_state();
                        SubLObject local_state = state;
                        {
                            SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                    SubLObject original_memoization_process = NIL;
                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                        {
                                            SubLObject current_proc = current_process();
                                            if (NIL == original_memoization_process) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                            } else {
                                                if (original_memoization_process != current_proc) {
                                                    Errors.error($str_alt3$Invalid_attempt_to_reuse_memoizat);
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        {
                                            SubLObject stripped_cycl = formula;
                                            {
                                                SubLObject _prev_bind_0_1 = $strengthen_original_pred_awayP$.currentBinding(thread);
                                                try {
                                                    $strengthen_original_pred_awayP$.bind(T, thread);
                                                    {
                                                        SubLObject proposals = formula_predicate_strengthen_with_constraints(stripped_cycl, domain_mt, constraints);
                                                        if (NIL != proposals) {
                                                            new_proposals = expand_formula_with_stronger_predicates(stripped_cycl, proposals, domain_mt);
                                                        }
                                                    }
                                                } finally {
                                                    $strengthen_original_pred_awayP$.rebind(_prev_bind_0_1, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return new_proposals;
            }
        }
    }

    /**
     * given a formula, return the strengthened versions of that formula
     */
    @LispMethod(comment = "given a formula, return the strengthened versions of that formula")
    public static SubLObject pred_strengthen_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_formula_p(formula) : "! el_utilities.el_formula_p(formula) " + ("el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) ") + formula;
        SubLObject new_proposals = NIL;
        if (NIL == skip_pred_strengthening_for_formulaP(formula)) {
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$1 = $strengthen_original_pred_awayP$.currentBinding(thread);
                    try {
                        $strengthen_original_pred_awayP$.bind(T, thread);
                        final SubLObject proposals = formula_predicate_strengthen_with_constraints(formula, domain_mt, constraints);
                        if (NIL != proposals) {
                            new_proposals = expand_formula_with_stronger_predicates(formula, proposals, domain_mt);
                        }
                    } finally {
                        $strengthen_original_pred_awayP$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        return new_proposals;
    }

    /**
     * given a formula, strengthen any predicates in it using allowed typed spec-preds or spec-inverses
     */
    @LispMethod(comment = "given a formula, strengthen any predicates in it using allowed typed spec-preds or spec-inverses")
    public static final SubLObject typed_pred_strengthen_formula_alt(SubLObject formula, SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $pred_strengthener_fn$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $strengthen_original_pred_awayP$.currentBinding(thread);
                    try {
                        $pred_strengthener_fn$.bind($sym5$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY, thread);
                        $strengthen_original_pred_awayP$.bind(T, thread);
                        result = pred_strengthen_formula(formula, domain_mt, constraints);
                    } finally {
                        $strengthen_original_pred_awayP$.rebind(_prev_bind_1, thread);
                        $pred_strengthener_fn$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * given a formula, strengthen any predicates in it using allowed typed spec-preds or spec-inverses
     */
    @LispMethod(comment = "given a formula, strengthen any predicates in it using allowed typed spec-preds or spec-inverses")
    public static SubLObject typed_pred_strengthen_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $pred_strengthener_fn$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $strengthen_original_pred_awayP$.currentBinding(thread);
        try {
            $pred_strengthener_fn$.bind($sym4$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY, thread);
            $strengthen_original_pred_awayP$.bind(T, thread);
            result = pred_strengthen_formula(formula, domain_mt, constraints);
        } finally {
            $strengthen_original_pred_awayP$.rebind(_prev_bind_2, thread);
            $pred_strengthener_fn$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject typed_pred_strengthen_formula_unambiguously_alt(SubLObject formula, SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $max_pred_strengs$.currentBinding(thread);
                    try {
                        $max_pred_strengs$.bind(ONE_INTEGER, thread);
                        result = typed_pred_strengthen_formula(formula, domain_mt, constraints);
                    } finally {
                        $max_pred_strengs$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == result) {
                    result = list(formula);
                }
                return result;
            }
        }
    }

    public static SubLObject typed_pred_strengthen_formula_unambiguously(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints) {
        if (constraints == UNPROVIDED) {
            constraints = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $max_pred_strengs$.currentBinding(thread);
        try {
            $max_pred_strengs$.bind(ONE_INTEGER, thread);
            result = typed_pred_strengthen_formula(formula, domain_mt, constraints);
        } finally {
            $max_pred_strengs$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            result = list(formula);
        }
        return result;
    }

    /**
     * Given an EL formula, locate all of the predicates one can attempt
     * to strengthen in this Mt, either via genlPreds or -Inverse, and
     * compute stronger versions for them. Return a list of lists of
     * of subformulas and suggestions, where the subformula is the head and
     * has the structure of (predicate ITEM ITEM ITEM), a verbatim quote from the EL
     * expanded formula; and where the suggestions, the remainder of
     * the list, are of the format (genPred/Inverse (list of pred choices)).
     */
    @LispMethod(comment = "Given an EL formula, locate all of the predicates one can attempt\r\nto strengthen in this Mt, either via genlPreds or -Inverse, and\r\ncompute stronger versions for them. Return a list of lists of\r\nof subformulas and suggestions, where the subformula is the head and\r\nhas the structure of (predicate ITEM ITEM ITEM), a verbatim quote from the EL\r\nexpanded formula; and where the suggestions, the remainder of\r\nthe list, are of the format (genPred/Inverse (list of pred choices)).\nGiven an EL formula, locate all of the predicates one can attempt\nto strengthen in this Mt, either via genlPreds or -Inverse, and\ncompute stronger versions for them. Return a list of lists of\nof subformulas and suggestions, where the subformula is the head and\nhas the structure of (predicate ITEM ITEM ITEM), a verbatim quote from the EL\nexpanded formula; and where the suggestions, the remainder of\nthe list, are of the format (genPred/Inverse (list of pred choices)).")
    public static final SubLObject formula_predicate_strengthen_alt(SubLObject formula, SubLObject mt) {
        {
            SubLObject el_formula = predstren_expand_formula(formula, UNPROVIDED);
            SubLObject constraint_sets = predstren_compute_constraints(el_formula, mt);
            SubLObject predforms = predstren_collect_predicates(el_formula, mt);
            SubLObject options = predstren_analyze_options(predforms, constraint_sets, mt);
            return options;
        }
    }

    /**
     * Given an EL formula, locate all of the predicates one can attempt
     * to strengthen in this Mt, either via genlPreds or -Inverse, and
     * compute stronger versions for them. Return a list of lists of
     * of subformulas and suggestions, where the subformula is the head and
     * has the structure of (predicate ITEM ITEM ITEM), a verbatim quote from the EL
     * expanded formula; and where the suggestions, the remainder of
     * the list, are of the format (genPred/Inverse (list of pred choices)).
     */
    @LispMethod(comment = "Given an EL formula, locate all of the predicates one can attempt\r\nto strengthen in this Mt, either via genlPreds or -Inverse, and\r\ncompute stronger versions for them. Return a list of lists of\r\nof subformulas and suggestions, where the subformula is the head and\r\nhas the structure of (predicate ITEM ITEM ITEM), a verbatim quote from the EL\r\nexpanded formula; and where the suggestions, the remainder of\r\nthe list, are of the format (genPred/Inverse (list of pred choices)).\nGiven an EL formula, locate all of the predicates one can attempt\nto strengthen in this Mt, either via genlPreds or -Inverse, and\ncompute stronger versions for them. Return a list of lists of\nof subformulas and suggestions, where the subformula is the head and\nhas the structure of (predicate ITEM ITEM ITEM), a verbatim quote from the EL\nexpanded formula; and where the suggestions, the remainder of\nthe list, are of the format (genPred/Inverse (list of pred choices)).")
    public static SubLObject formula_predicate_strengthen(final SubLObject formula, final SubLObject mt) {
        final SubLObject el_formula = predstren_expand_formula(formula, UNPROVIDED);
        final SubLObject constraint_sets = predstren_compute_constraints(el_formula, mt);
        final SubLObject predforms = predstren_collect_predicates(el_formula, mt);
        final SubLObject options = predstren_analyze_options(predforms, constraint_sets, mt);
        return options;
    }

    /**
     * Like @xref formula-predicate-strengthen
     * except that additional constraints are available for some of the terms,
     * found in the CONSTRAINTS information structure.
     */
    @LispMethod(comment = "Like @xref formula-predicate-strengthen\r\nexcept that additional constraints are available for some of the terms,\r\nfound in the CONSTRAINTS information structure.\nLike @xref formula-predicate-strengthen\nexcept that additional constraints are available for some of the terms,\nfound in the CONSTRAINTS information structure.")
    public static final SubLObject formula_predicate_strengthen_with_constraints_alt(SubLObject formula, SubLObject mt, SubLObject constraints) {
        {
            SubLObject el_formula = predstren_expand_formula(formula, mt);
            SubLObject constraint_sets = NIL;
            SubLObject predforms = NIL;
            SubLObject options = NIL;
            el_formula = narts_high.nart_substitute(el_formula);
            if (NIL != constraints) {
                el_formula = predstren_extend_formula_from_constraints(el_formula, constraints);
            }
            constraint_sets = predstren_compute_constraints(el_formula, mt);
            if (NIL != constraints) {
                constraint_sets = predstren_extend_constraints_from_table(constraint_sets, constraints);
            }
            predforms = predstren_collect_predicates(el_formula, mt);
            options = predstren_analyze_options(predforms, constraint_sets, mt);
            return options;
        }
    }

    /**
     * Like @xref formula-predicate-strengthen
     * except that additional constraints are available for some of the terms,
     * found in the CONSTRAINTS information structure.
     */
    @LispMethod(comment = "Like @xref formula-predicate-strengthen\r\nexcept that additional constraints are available for some of the terms,\r\nfound in the CONSTRAINTS information structure.\nLike @xref formula-predicate-strengthen\nexcept that additional constraints are available for some of the terms,\nfound in the CONSTRAINTS information structure.")
    public static SubLObject formula_predicate_strengthen_with_constraints(final SubLObject formula, final SubLObject mt, final SubLObject constraints) {
        SubLObject el_formula = predstren_expand_formula(formula, mt);
        SubLObject constraint_sets = NIL;
        SubLObject predforms = NIL;
        SubLObject options = NIL;
        el_formula = narts_high.nart_substitute(el_formula);
        if (NIL != constraints) {
            el_formula = predstren_extend_formula_from_constraints(el_formula, constraints);
        }
        constraint_sets = predstren_compute_constraints(el_formula, mt);
        if (NIL != constraints) {
            constraint_sets = predstren_extend_constraints_from_table(constraint_sets, constraints);
        }
        predforms = predstren_collect_predicates(el_formula, mt);
        options = predstren_analyze_options(predforms, constraint_sets, mt);
        return options;
    }

    public static final SubLObject strengthen_predicate_with_constraints_alt(SubLObject predicate, SubLObject alist, SubLObject mt, SubLObject strengthening_fn) {
        if (strengthening_fn == UNPROVIDED) {
            strengthening_fn = $pred_strengthener_fn$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if ((predicate == $$isa) && (NIL != $do_not_strengthen_isaP$.getDynamicValue(thread))) {
                    return result;
                } else {
                    if (predicate == $$is_Underspecified) {
                        result = predstren_handle_is_underspecified(predicate, alist, mt);
                    } else {
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
                                    result = funcall(strengthening_fn, predicate, alist);
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject strengthen_predicate_with_constraints(final SubLObject predicate, final SubLObject alist, final SubLObject mt, SubLObject strengthening_fn) {
        if (strengthening_fn == UNPROVIDED) {
            strengthening_fn = $pred_strengthener_fn$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (predicate.eql($$isa) && (NIL != $do_not_strengthen_isaP$.getDynamicValue(thread))) {
            return result;
        }
        if (predicate.eql($$is_Underspecified)) {
            result = predstren_handle_is_underspecified(predicate, alist, mt);
        } else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = funcall(strengthening_fn, predicate, alist);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject gather_subformula_pieces_alt(SubLObject sub_formula, SubLObject formula) {
        return list_utilities.tree_find(sub_formula, formula, symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject gather_subformula_pieces(final SubLObject sub_formula, final SubLObject formula) {
        return list_utilities.tree_find(sub_formula, formula, symbol_function(EQUALP), UNPROVIDED);
    }

    public static final SubLObject expand_formula_with_stronger_predicates_alt(SubLObject formula, SubLObject suggestions, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject input_formula = copy_tree(formula);
                if (NIL != cycl_utilities.expression_find_if(NART_P, input_formula, UNPROVIDED, UNPROVIDED)) {
                    input_formula = narts_high.nart_expand(input_formula);
                }
                {
                    SubLObject work_stack = list(input_formula);
                    SubLObject runs = ZERO_INTEGER;
                    {
                        SubLObject cdolist_list_var = suggestions;
                        SubLObject suggestion = NIL;
                        for (suggestion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suggestion = cdolist_list_var.first()) {
                            {
                                SubLObject sub_formula = suggestion.first();
                                SubLObject replacements = suggestion.rest();
                                SubLObject cdolist_list_var_3 = replacements;
                                SubLObject replacement = NIL;
                                for (replacement = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , replacement = cdolist_list_var_3.first()) {
                                    {
                                        SubLObject pred_direction = replacement.first();
                                        SubLObject predicates = second(replacement);
                                        SubLObject temp_stack = NIL;
                                        runs = add(runs, ONE_INTEGER);
                                        {
                                            SubLObject cdolist_list_var_4 = work_stack;
                                            SubLObject formula_5 = NIL;
                                            for (formula_5 = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , formula_5 = cdolist_list_var_4.first()) {
                                                if (NIL != gather_subformula_pieces(sub_formula, formula_5)) {
                                                    {
                                                        SubLObject cdolist_list_var_6 = predicates;
                                                        SubLObject predicate = NIL;
                                                        for (predicate = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , predicate = cdolist_list_var_6.first()) {
                                                            {
                                                                SubLObject new_formula = predstren_substitute_stronger_predicates(predicate, pred_direction, sub_formula, formula_5);
                                                                temp_stack = cons(new_formula, temp_stack);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    {
                                                        SubLObject expandable_subformulas = predstren_get_expandable_subformulas(formula_5, UNPROVIDED);
                                                        SubLObject cdolist_list_var_7 = expandable_subformulas;
                                                        SubLObject expandable_subformula = NIL;
                                                        for (expandable_subformula = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , expandable_subformula = cdolist_list_var_7.first()) {
                                                            {
                                                                SubLObject expanded_subformula = predstren_expand_formula(expandable_subformula, UNPROVIDED);
                                                                SubLObject new_sub_formula = NIL;
                                                                SubLObject new_literal = NIL;
                                                                SubLObject new_formula = NIL;
                                                                if (NIL != gather_subformula_pieces(sub_formula, expanded_subformula)) {
                                                                    {
                                                                        SubLObject cdolist_list_var_8 = predicates;
                                                                        SubLObject predicate = NIL;
                                                                        for (predicate = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , predicate = cdolist_list_var_8.first()) {
                                                                            new_sub_formula = predstren_substitute_stronger_predicates(predicate, pred_direction, sub_formula, expanded_subformula);
                                                                            new_literal = predstren_contract_formula(new_sub_formula, mt);
                                                                            new_formula = cycl_utilities.formula_subst(new_literal, expandable_subformula, formula_5, symbol_function(EQUALP), UNPROVIDED);
                                                                            temp_stack = cons(new_formula, temp_stack);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((NIL != temp_stack) && (NIL != $strengthen_original_pred_awayP$.getDynamicValue(thread))) {
                                            work_stack = NIL;
                                        }
                                        {
                                            SubLObject cdolist_list_var_9 = temp_stack;
                                            SubLObject newbe = NIL;
                                            for (newbe = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , newbe = cdolist_list_var_9.first()) {
                                                {
                                                    SubLObject item_var = newbe;
                                                    if (NIL == member(item_var, work_stack, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                                        work_stack = cons(item_var, work_stack);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject reformulated = NIL;
                        SubLObject cdolist_list_var = work_stack;
                        SubLObject formula_10 = NIL;
                        for (formula_10 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula_10 = cdolist_list_var.first()) {
                            {
                                SubLObject new_formula = predstren_contract_formula(formula_10, mt);
                                if (NIL != new_formula) {
                                    {
                                        SubLObject item_var = new_formula;
                                        if (NIL == member(item_var, reformulated, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                            reformulated = cons(item_var, reformulated);
                                        }
                                    }
                                } else {
                                    Errors.warn($str_alt9$PredStren__no_contracted_version_, formula_10);
                                }
                            }
                        }
                        work_stack = reformulated;
                    }
                    if (NIL == oddp(runs)) {
                        work_stack = nreverse(work_stack);
                    }
                    return work_stack;
                }
            }
        }
    }

    public static SubLObject expand_formula_with_stronger_predicates(final SubLObject formula, final SubLObject suggestions, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject input_formula = copy_tree(formula);
        if (NIL != cycl_utilities.expression_find_if(NART_P, input_formula, UNPROVIDED, UNPROVIDED)) {
            input_formula = narts_high.nart_expand(input_formula);
        }
        SubLObject work_stack = list(input_formula);
        SubLObject runs = ZERO_INTEGER;
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sub_formula = suggestion.first();
            SubLObject cdolist_list_var_$3;
            final SubLObject replacements = cdolist_list_var_$3 = suggestion.rest();
            SubLObject replacement = NIL;
            replacement = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject pred_direction = replacement.first();
                final SubLObject predicates = second(replacement);
                SubLObject temp_stack = NIL;
                runs = add(runs, ONE_INTEGER);
                SubLObject cdolist_list_var_$4 = work_stack;
                SubLObject formula_$5 = NIL;
                formula_$5 = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL != gather_subformula_pieces(sub_formula, formula_$5)) {
                        SubLObject cdolist_list_var_$5 = predicates;
                        SubLObject predicate = NIL;
                        predicate = cdolist_list_var_$5.first();
                        while (NIL != cdolist_list_var_$5) {
                            final SubLObject new_formula = predstren_substitute_stronger_predicates(predicate, pred_direction, sub_formula, formula_$5);
                            temp_stack = cons(new_formula, temp_stack);
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            predicate = cdolist_list_var_$5.first();
                        } 
                    } else {
                        SubLObject cdolist_list_var_$6;
                        final SubLObject expandable_subformulas = cdolist_list_var_$6 = predstren_get_expandable_subformulas(formula_$5, UNPROVIDED);
                        SubLObject expandable_subformula = NIL;
                        expandable_subformula = cdolist_list_var_$6.first();
                        while (NIL != cdolist_list_var_$6) {
                            final SubLObject expanded_subformula = predstren_expand_formula(expandable_subformula, UNPROVIDED);
                            SubLObject new_sub_formula = NIL;
                            SubLObject new_literal = NIL;
                            SubLObject new_formula2 = NIL;
                            if (NIL != gather_subformula_pieces(sub_formula, expanded_subformula)) {
                                SubLObject cdolist_list_var_$7 = predicates;
                                SubLObject predicate2 = NIL;
                                predicate2 = cdolist_list_var_$7.first();
                                while (NIL != cdolist_list_var_$7) {
                                    new_sub_formula = predstren_substitute_stronger_predicates(predicate2, pred_direction, sub_formula, expanded_subformula);
                                    new_literal = predstren_contract_formula(new_sub_formula, mt);
                                    new_formula2 = cycl_utilities.formula_subst(new_literal, expandable_subformula, formula_$5, symbol_function(EQUALP), UNPROVIDED);
                                    temp_stack = cons(new_formula2, temp_stack);
                                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                    predicate2 = cdolist_list_var_$7.first();
                                } 
                            }
                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                            expandable_subformula = cdolist_list_var_$6.first();
                        } 
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    formula_$5 = cdolist_list_var_$4.first();
                } 
                if ((NIL != temp_stack) && (NIL != $strengthen_original_pred_awayP$.getDynamicValue(thread))) {
                    work_stack = NIL;
                }
                SubLObject cdolist_list_var_$8 = temp_stack;
                SubLObject newbe = NIL;
                newbe = cdolist_list_var_$8.first();
                while (NIL != cdolist_list_var_$8) {
                    final SubLObject item_var = newbe;
                    if (NIL == member(item_var, work_stack, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        work_stack = cons(item_var, work_stack);
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    newbe = cdolist_list_var_$8.first();
                } 
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                replacement = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        } 
        SubLObject reformulated = NIL;
        SubLObject cdolist_list_var2 = work_stack;
        SubLObject formula_$6 = NIL;
        formula_$6 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject new_formula3 = predstren_contract_formula(formula_$6, mt);
            if (NIL != new_formula3) {
                final SubLObject item_var2 = new_formula3;
                if (NIL == member(item_var2, reformulated, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                    reformulated = cons(item_var2, reformulated);
                }
            } else {
                Errors.warn($str8$PredStren__no_contracted_version_, formula_$6);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            formula_$6 = cdolist_list_var2.first();
        } 
        work_stack = reformulated;
        if (NIL == oddp(runs)) {
            work_stack = nreverse(work_stack);
        }
        return work_stack;
    }

    public static final SubLObject predstren_substitute_stronger_predicates_alt(SubLObject pred, SubLObject direction, SubLObject subformula, SubLObject formula) {
        {
            SubLObject new_args = copy_list(cycl_utilities.formula_args(subformula, UNPROVIDED));
            SubLObject ordered_args = (direction == $$genlInverse) ? ((SubLObject) (nreverse(new_args))) : new_args;
            SubLObject new_subformula = make_formula(pred, ordered_args, UNPROVIDED);
            SubLObject new_formula = NIL;
            new_formula = cycl_utilities.expression_subst(new_subformula, subformula, formula, symbol_function(EQUAL), UNPROVIDED);
            return new_formula;
        }
    }

    public static SubLObject predstren_substitute_stronger_predicates(final SubLObject pred, final SubLObject direction, final SubLObject subformula, final SubLObject formula) {
        final SubLObject new_args = copy_list(cycl_utilities.formula_args(subformula, UNPROVIDED));
        final SubLObject ordered_args = (direction.eql($$genlInverse)) ? nreverse(new_args) : new_args;
        final SubLObject new_subformula = make_formula(pred, ordered_args, UNPROVIDED);
        SubLObject new_formula = NIL;
        new_formula = cycl_utilities.expression_subst(new_subformula, subformula, formula, symbol_function(EQUAL), UNPROVIDED);
        return new_formula;
    }

    public static final SubLObject predstren_get_rmp_subformulas_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found = NIL;
                if (mt == $ANY) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                            found = cycl_utilities.formula_gather(formula, $sym14$PREDSTREN_EXPANDIBLE_RMP_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
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
                                found = cycl_utilities.formula_gather(formula, $sym14$PREDSTREN_EXPANDIBLE_RMP_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return found;
            }
        }
    }

    public static SubLObject predstren_get_rmp_subformulas(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found = NIL;
        if (mt == $ANY) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                found = cycl_utilities.formula_gather(formula, $sym13$PREDSTREN_EXPANDIBLE_RMP_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                found = cycl_utilities.formula_gather(formula, $sym13$PREDSTREN_EXPANDIBLE_RMP_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            }
        }
        return found;
    }

    public static final SubLObject predstren_get_expandable_subformulas_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found = NIL;
                if (mt == $ANY) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                            found = cycl_utilities.formula_gather(formula, $sym15$PREDSTREN_EXPANDIBLE_EXPRESSION_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
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
                                found = cycl_utilities.formula_gather(formula, $sym15$PREDSTREN_EXPANDIBLE_EXPRESSION_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return found;
            }
        }
    }

    public static SubLObject predstren_get_expandable_subformulas(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found = NIL;
        if (mt == $ANY) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                found = cycl_utilities.formula_gather(formula, $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                found = cycl_utilities.formula_gather(formula, $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            }
        }
        return found;
    }

    public static final SubLObject predstren_expand_formula_internal_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_formula = cycl_utilities.hl_to_el(formula);
                SubLObject result = el_formula;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                if (mt == $ANY) {
                                    {
                                        SubLObject _prev_bind_0_11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                            result = cycl_utilities.expression_transform(el_formula, $sym15$PREDSTREN_EXPANDIBLE_EXPRESSION_, PREDSTREN_EXPAND_ONE_STEP, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                        {
                                            SubLObject _prev_bind_0_12 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                result = cycl_utilities.expression_transform(el_formula, $sym15$PREDSTREN_EXPANDIBLE_EXPRESSION_, PREDSTREN_EXPAND_ONE_STEP, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                return clausifier.standardize_sentence_variables(result);
            }
        }
    }

    public static SubLObject predstren_expand_formula_internal(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result;
        final SubLObject el_formula = result = cycl_utilities.hl_to_el(formula);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (mt == $ANY) {
                        final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                            result = cycl_utilities.expression_transform(el_formula, $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, PREDSTREN_EXPAND_ONE_STEP, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$11, thread);
                        }
                    } else {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            result = cycl_utilities.expression_transform(el_formula, $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, PREDSTREN_EXPAND_ONE_STEP, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return clausifier.standardize_sentence_variables(result);
    }

    public static final SubLObject predstren_expand_formula_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return predstren_expand_formula_internal(formula, mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PREDSTREN_EXPAND_FORMULA, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PREDSTREN_EXPAND_FORMULA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PREDSTREN_EXPAND_FORMULA, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw20$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(predstren_expand_formula_internal(formula, mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject predstren_expand_formula(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return predstren_expand_formula_internal(formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PREDSTREN_EXPAND_FORMULA, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PREDSTREN_EXPAND_FORMULA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PREDSTREN_EXPAND_FORMULA, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(predstren_expand_formula_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject predstren_expandible_expressionP_alt(SubLObject formula) {
        return makeBoolean((NIL != predstren_expandible_rmpP(formula)) || (NIL != predstren_expandible_srfP(formula)));
    }

    public static SubLObject predstren_expandible_expressionP(final SubLObject formula) {
        return makeBoolean((NIL != predstren_expandible_rmpP(formula)) || (NIL != predstren_expandible_srfP(formula)));
    }

    public static final SubLObject predstren_expandible_rmpP_alt(SubLObject formula) {
        return makeBoolean(((NIL != fort_types_interface.rule_macro_predicate_p(cycl_utilities.formula_operator(formula))) && (NIL != fort_types_interface.predicate_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) && (NIL != kb_mapping_utilities.some_pred_value(cycl_utilities.formula_operator(formula), $$expansion, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject predstren_expandible_rmpP(final SubLObject formula) {
        return makeBoolean(((NIL != fort_types_interface.rule_macro_predicate_p(cycl_utilities.formula_operator(formula))) && (NIL != fort_types_interface.predicate_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))) && (NIL != kb_mapping_utilities.some_pred_value(cycl_utilities.formula_operator(formula), $$expansion, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject predstren_expandible_srfP_alt(SubLObject formula) {
        return makeBoolean((NIL != kb_accessors.subcollection_relation_function_expression_p(formula)) && (NIL != kb_mapping_utilities.some_pred_value(cycl_utilities.nat_functor(formula), $$expansion, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject predstren_expandible_srfP(final SubLObject formula) {
        return makeBoolean((NIL != kb_accessors.subcollection_relation_function_expression_p(formula)) && (NIL != kb_mapping_utilities.some_pred_value(cycl_utilities.nat_functor(formula), $$expansion, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject predstren_expand_one_step_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return verbosifier.el_expansion_one_step(formula, mt);
    }

    public static SubLObject predstren_expand_one_step(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return verbosifier.el_expansion_one_step(formula, mt);
    }

    public static final SubLObject reformulator_rules_to_use_alt() {
        if (NIL == $reformulator_rules_to_use$.getGlobalValue()) {
            initialize_reformulator_rules_to_use();
        }
        return $reformulator_rules_to_use$.getGlobalValue();
    }

    public static SubLObject reformulator_rules_to_use() {
        if (NIL == $reformulator_rules_to_use$.getGlobalValue()) {
            initialize_reformulator_rules_to_use();
        }
        return $reformulator_rules_to_use$.getGlobalValue();
    }

    public static final SubLObject initialize_reformulator_rules_to_use_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject relevant_relations = append(isa.all_fort_instances($$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED), isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED));
                        SubLObject cdolist_list_var = relevant_relations;
                        SubLObject rel = NIL;
                        for (rel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel = cdolist_list_var.first()) {
                            {
                                SubLObject expansion = kb_mapping_utilities.fpred_value_gaf(rel, $$expansion, ONE_INTEGER, $TRUE);
                                if (NIL != assertion_handles.assertion_p(expansion)) {
                                    {
                                        SubLObject reformulator_rule = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(expansion);
                                        if (NIL != reformulator_rule_unifier_datastructures.reformulator_rule_p(reformulator_rule)) {
                                            $reformulator_rules_to_use$.setGlobalValue(cons(reformulator_rule, $reformulator_rules_to_use$.getGlobalValue()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $reformulator_rules_to_use$.getGlobalValue();
        }
    }

    public static SubLObject initialize_reformulator_rules_to_use() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject relevant_relations = cdolist_list_var = append(isa.all_fort_instances($$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED), isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED));
            SubLObject rel = NIL;
            rel = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject expansion = kb_mapping_utilities.fpred_value_gaf(rel, $$expansion, ONE_INTEGER, $TRUE);
                if (NIL != assertion_handles.assertion_p(expansion)) {
                    final SubLObject reformulator_rule = reformulator_datastructures.find_reformulator_rule_for_rule_assertion(expansion);
                    if (NIL != reformulator_rule_unifier_datastructures.reformulator_rule_p(reformulator_rule)) {
                        $reformulator_rules_to_use$.setGlobalValue(cons(reformulator_rule, $reformulator_rules_to_use$.getGlobalValue()));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                rel = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $reformulator_rules_to_use$.getGlobalValue();
    }

    public static final SubLObject reformulator_rules_to_ignore_alt() {
        if (NIL == $reformulator_rules_to_ignore$.getGlobalValue()) {
            initialize_reformulator_rules_to_ignore();
        }
        return $reformulator_rules_to_ignore$.getGlobalValue();
    }

    public static SubLObject reformulator_rules_to_ignore() {
        if (NIL == $reformulator_rules_to_ignore$.getGlobalValue()) {
            initialize_reformulator_rules_to_ignore();
        }
        return $reformulator_rules_to_ignore$.getGlobalValue();
    }

    public static final SubLObject initialize_reformulator_rules_to_ignore_alt() {
        {
            SubLObject rr_assertion_cycl_mt_pairs = list(list($list_alt29, $$IntermediateVocabularyMt));
            SubLObject cdolist_list_var = rr_assertion_cycl_mt_pairs;
            SubLObject rr_assertion_cycl_mt_pair = NIL;
            for (rr_assertion_cycl_mt_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rr_assertion_cycl_mt_pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = rr_assertion_cycl_mt_pair;
                    SubLObject current = datum;
                    SubLObject cycl = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    cycl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject rr_assertion = czer_meta.find_assertion_cycl(cycl, mt);
                            if (NIL != assertion_handles.assertion_p(rr_assertion)) {
                                $reformulator_rules_to_ignore$.setGlobalValue(cons(rr_assertion, $reformulator_rules_to_ignore$.getGlobalValue()));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt31);
                    }
                }
            }
            return $reformulator_rules_to_ignore$.getGlobalValue();
        }
    }

    public static SubLObject initialize_reformulator_rules_to_ignore() {
        SubLObject cdolist_list_var;
        final SubLObject rr_assertion_cycl_mt_pairs = cdolist_list_var = list(list($list27, $$IntermediateVocabularyMt));
        SubLObject rr_assertion_cycl_mt_pair = NIL;
        rr_assertion_cycl_mt_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = rr_assertion_cycl_mt_pair;
            SubLObject cycl = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            cycl = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject rr_assertion = czer_meta.find_assertion_cycl(cycl, mt);
                if (NIL != assertion_handles.assertion_p(rr_assertion)) {
                    $reformulator_rules_to_ignore$.setGlobalValue(cons(rr_assertion, $reformulator_rules_to_ignore$.getGlobalValue()));
                }
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rr_assertion_cycl_mt_pair = cdolist_list_var.first();
        } 
        return $reformulator_rules_to_ignore$.getGlobalValue();
    }

    public static final SubLObject predstren_contract_formula_alt(SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return reformulator_hub.reformulate_cycl(formula, mt, listS($MAX_TIME, new SubLObject[]{ $int$30, $RECURSION_LIMIT, TEN_INTEGER, $FOCUS, $$ReformulatorRuleUnifier, $REFORMULATOR_RULES, reformulator_rules_to_use(), $SKIP_ASSERTIONS, reformulator_rules_to_ignore(), $list_alt39 }));
    }

    public static SubLObject predstren_contract_formula(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return reformulator_hub.reformulate_cycl(formula, mt, listS($MAX_TIME, new SubLObject[]{ $int$30, $RECURSION_LIMIT, TEN_INTEGER, $FOCUS, $$ReformulatorRuleUnifier, $REFORMULATOR_RULES, reformulator_rules_to_use(), $SKIP_ASSERTIONS, reformulator_rules_to_ignore(), $list37 }));
    }

    public static final SubLObject predstren_extend_formula_from_constraints_alt(SubLObject el_formula, SubLObject constraints) {
        {
            SubLObject new_el_formula = NIL;
            if (NIL != constraints) {
                new_el_formula = cons(el_formula, new_el_formula);
                {
                    SubLObject cdolist_list_var = constraints;
                    SubLObject constraint = NIL;
                    for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                        {
                            SubLObject datum = constraint;
                            SubLObject current = datum;
                            SubLObject v_term = NIL;
                            SubLObject isas = NIL;
                            SubLObject v_genls = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            v_term = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            isas = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt40);
                            v_genls = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject cdolist_list_var_13 = isas;
                                    SubLObject v_isa = NIL;
                                    for (v_isa = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , v_isa = cdolist_list_var_13.first()) {
                                        new_el_formula = cons(list($$isa, v_term, v_isa), new_el_formula);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var_14 = v_genls;
                                    SubLObject genl = NIL;
                                    for (genl = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , genl = cdolist_list_var_14.first()) {
                                        new_el_formula = cons(list($$genls, v_term, genl), new_el_formula);
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt40);
                            }
                        }
                    }
                }
                new_el_formula = cons($$and, new_el_formula);
                return new_el_formula;
            }
            return el_formula;
        }
    }

    public static SubLObject predstren_extend_formula_from_constraints(final SubLObject el_formula, final SubLObject constraints) {
        SubLObject new_el_formula = NIL;
        if (NIL != constraints) {
            new_el_formula = cons(el_formula, new_el_formula);
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = constraint;
                SubLObject v_term = NIL;
                SubLObject isas = NIL;
                SubLObject v_genls = NIL;
                destructuring_bind_must_consp(current, datum, $list38);
                v_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list38);
                isas = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list38);
                v_genls = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$13 = isas;
                    SubLObject v_isa = NIL;
                    v_isa = cdolist_list_var_$13.first();
                    while (NIL != cdolist_list_var_$13) {
                        new_el_formula = cons(list($$isa, v_term, v_isa), new_el_formula);
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        v_isa = cdolist_list_var_$13.first();
                    } 
                    SubLObject cdolist_list_var_$14 = v_genls;
                    SubLObject genl = NIL;
                    genl = cdolist_list_var_$14.first();
                    while (NIL != cdolist_list_var_$14) {
                        new_el_formula = cons(list($$genls, v_term, genl), new_el_formula);
                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                        genl = cdolist_list_var_$14.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list38);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
            new_el_formula = cons($$and, new_el_formula);
            return new_el_formula;
        }
        return el_formula;
    }

    /**
     * Handle the underspecified is cases, because they are so tricky.
     */
    @LispMethod(comment = "Handle the underspecified is cases, because they are so tricky.")
    public static final SubLObject predstren_handle_is_underspecified_alt(SubLObject predicate, SubLObject alist, SubLObject mt) {
        return predstren_interpret_is(alist, mt);
    }

    /**
     * Handle the underspecified is cases, because they are so tricky.
     */
    @LispMethod(comment = "Handle the underspecified is cases, because they are so tricky.")
    public static SubLObject predstren_handle_is_underspecified(final SubLObject predicate, final SubLObject alist, final SubLObject mt) {
        return predstren_interpret_is(alist, mt);
    }

    public static final SubLObject predstren_interpret_is_alt(SubLObject alist, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject arg1_isas = predstren_crack_alist(alist);
                SubLObject arg1_genls = thread.secondMultipleValue();
                SubLObject arg2_isas = thread.thirdMultipleValue();
                SubLObject arg2_genls = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject result = NIL;
                    result = predstren_is_means_elementofP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
                    if (NIL == result) {
                        result = predstren_is_means_isaP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
                    }
                    if (NIL == result) {
                        result = predstren_is_means_equalsP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
                    }
                    if (NIL != result) {
                        result = list(list($$genlPreds, list(result)));
                    }
                    return result;
                }
            }
        }
    }

    public static SubLObject predstren_interpret_is(final SubLObject alist, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject arg1_isas = predstren_crack_alist(alist);
        final SubLObject arg1_genls = thread.secondMultipleValue();
        final SubLObject arg2_isas = thread.thirdMultipleValue();
        final SubLObject arg2_genls = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject result = NIL;
        result = predstren_is_means_elementofP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
        if (NIL == result) {
            result = predstren_is_means_isaP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
        }
        if (NIL == result) {
            result = predstren_is_means_equalsP(arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt);
        }
        if (NIL != result) {
            result = list(list($$genlPreds, list(result)));
        }
        return result;
    }

    public static final SubLObject predstren_crack_alist_alt(SubLObject alist) {
        {
            SubLObject arg1_constraints = second(assoc(ONE_INTEGER, alist, UNPROVIDED, UNPROVIDED));
            SubLObject arg2_constraints = second(assoc(TWO_INTEGER, alist, UNPROVIDED, UNPROVIDED));
            SubLObject arg1_isas = assoc($$isa, arg1_constraints, UNPROVIDED, UNPROVIDED).rest();
            SubLObject arg2_isas = assoc($$isa, arg2_constraints, UNPROVIDED, UNPROVIDED).rest();
            SubLObject arg1_genls = assoc($$genls, arg1_constraints, UNPROVIDED, UNPROVIDED).rest();
            SubLObject arg2_genls = assoc($$genls, arg2_constraints, UNPROVIDED, UNPROVIDED).rest();
            return values(arg1_isas, arg1_genls, arg2_isas, arg2_genls);
        }
    }

    public static SubLObject predstren_crack_alist(final SubLObject alist) {
        final SubLObject arg1_constraints = second(assoc(ONE_INTEGER, alist, UNPROVIDED, UNPROVIDED));
        final SubLObject arg2_constraints = second(assoc(TWO_INTEGER, alist, UNPROVIDED, UNPROVIDED));
        final SubLObject arg1_isas = assoc($$isa, arg1_constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject arg2_isas = assoc($$isa, arg2_constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject arg1_genls = assoc($$genls, arg1_constraints, UNPROVIDED, UNPROVIDED).rest();
        final SubLObject arg2_genls = assoc($$genls, arg2_constraints, UNPROVIDED, UNPROVIDED).rest();
        return values(arg1_isas, arg1_genls, arg2_isas, arg2_genls);
    }

    /**
     *
     *
     * @unknown The CollectionTypeType might be overkill.
     */
    @LispMethod(comment = "@unknown The CollectionTypeType might be overkill.")
    public static final SubLObject predstren_is_means_isaP_alt(SubLObject arg1_isas, SubLObject arg1_genls, SubLObject arg2_isas, SubLObject arg2_genls, SubLObject mt) {
        if ((NIL == arg1_isas) || (NIL == arg2_genls)) {
            return NIL;
        }
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = $list_alt44;
                    SubLObject v_class = NIL;
                    for (v_class = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_class = csome_list_var.first()) {
                        if ((NIL != genls.any_specP(v_class, arg1_isas, mt, UNPROVIDED)) && (NIL != genls.any_specP(v_class, arg2_genls, mt, UNPROVIDED))) {
                            doneP = $$isa;
                        }
                    }
                }
            }
            return doneP;
        }
    }

    /**
     *
     *
     * @unknown The CollectionTypeType might be overkill.
     */
    @LispMethod(comment = "@unknown The CollectionTypeType might be overkill.")
    public static SubLObject predstren_is_means_isaP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt) {
        if ((NIL == arg1_isas) || (NIL == arg2_genls)) {
            return NIL;
        }
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = $list42;
            SubLObject v_class = NIL;
            v_class = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if ((NIL != genls.any_specP(v_class, arg1_isas, mt, UNPROVIDED)) && (NIL != genls.any_specP(v_class, arg2_genls, mt, UNPROVIDED))) {
                    doneP = $$isa;
                }
                csome_list_var = csome_list_var.rest();
                v_class = csome_list_var.first();
            } 
        }
        return doneP;
    }

    public static final SubLObject predstren_is_means_equalsP_alt(SubLObject arg1_isas, SubLObject arg1_genls, SubLObject arg2_isas, SubLObject arg2_genls, SubLObject mt) {
        if ((NIL == arg1_isas) || (NIL == arg2_isas)) {
            return NIL;
        }
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = $list_alt44;
                    SubLObject v_class = NIL;
                    for (v_class = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_class = csome_list_var.first()) {
                        if ((NIL != genls.any_specP(v_class, arg1_isas, mt, UNPROVIDED)) && (NIL != genls.any_specP(v_class, arg2_isas, mt, UNPROVIDED))) {
                            doneP = $$equals;
                        }
                    }
                }
            }
            return doneP;
        }
    }

    public static SubLObject predstren_is_means_equalsP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt) {
        if ((NIL == arg1_isas) || (NIL == arg2_isas)) {
            return NIL;
        }
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = $list42;
            SubLObject v_class = NIL;
            v_class = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if ((NIL != genls.any_specP(v_class, arg1_isas, mt, UNPROVIDED)) && (NIL != genls.any_specP(v_class, arg2_isas, mt, UNPROVIDED))) {
                    doneP = $$equals;
                }
                csome_list_var = csome_list_var.rest();
                v_class = csome_list_var.first();
            } 
        }
        return doneP;
    }

    public static final SubLObject predstren_is_means_elementofP_alt(SubLObject arg1_isas, SubLObject arg1_genls, SubLObject arg2_isas, SubLObject arg2_genls, SubLObject mt) {
        if (NIL != genls.any_specP($$Set_Mathematical, arg2_isas, mt, UNPROVIDED)) {
            return $$elementOf;
        } else {
            return NIL;
        }
    }

    public static SubLObject predstren_is_means_elementofP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt) {
        if (NIL != genls.any_specP($$Set_Mathematical, arg2_isas, mt, UNPROVIDED)) {
            return $$elementOf;
        }
        return NIL;
    }

    public static final SubLObject predstren_terms_tester_alt(SubLObject term_a, SubLObject term_b, SubLObject mt) {
        {
            SubLObject alist_a = constraint_from_fort_as_alist(term_a, mt);
            SubLObject alist_b = constraint_from_fort_as_alist(term_b, mt);
            SubLObject alist = list(list(ONE_INTEGER, alist_a), list(TWO_INTEGER, alist_b));
            return predstren_interpret_is(alist, mt);
        }
    }

    public static SubLObject predstren_terms_tester(final SubLObject term_a, final SubLObject term_b, final SubLObject mt) {
        final SubLObject alist_a = constraint_from_fort_as_alist(term_a, mt);
        final SubLObject alist_b = constraint_from_fort_as_alist(term_b, mt);
        final SubLObject alist = list(list(ONE_INTEGER, alist_a), list(TWO_INTEGER, alist_b));
        return predstren_interpret_is(alist, mt);
    }

    public static final SubLObject constraint_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject constraint_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.predicate_strengthener.$constraint_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject constraint_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.predicate_strengthener.$constraint_native.class ? T : NIL;
    }

    public static final SubLObject constraint_variable_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CONSTRAINT_P);
        return v_object.getField2();
    }

    public static SubLObject constraint_variable(final SubLObject v_object) {
        assert NIL != constraint_p(v_object) : "! predicate_strengthener.constraint_p(v_object) " + "predicate_strengthener.constraint_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject constraint_isa_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CONSTRAINT_P);
        return v_object.getField3();
    }

    public static SubLObject constraint_isa_list(final SubLObject v_object) {
        assert NIL != constraint_p(v_object) : "! predicate_strengthener.constraint_p(v_object) " + "predicate_strengthener.constraint_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject constraint_genl_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CONSTRAINT_P);
        return v_object.getField4();
    }

    public static SubLObject constraint_genl_list(final SubLObject v_object) {
        assert NIL != constraint_p(v_object) : "! predicate_strengthener.constraint_p(v_object) " + "predicate_strengthener.constraint_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_constraint_variable_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CONSTRAINT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_constraint_variable(final SubLObject v_object, final SubLObject value) {
        assert NIL != constraint_p(v_object) : "! predicate_strengthener.constraint_p(v_object) " + "predicate_strengthener.constraint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_constraint_isa_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CONSTRAINT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_constraint_isa_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != constraint_p(v_object) : "! predicate_strengthener.constraint_p(v_object) " + "predicate_strengthener.constraint_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_constraint_genl_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CONSTRAINT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_constraint_genl_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != constraint_p(v_object) : "! predicate_strengthener.constraint_p(v_object) " + "predicate_strengthener.constraint_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_constraint_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.predicate_strengthener.$constraint_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($VARIABLE)) {
                        _csetf_constraint_variable(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ISA_LIST)) {
                            _csetf_constraint_isa_list(v_new, current_value);
                        } else {
                            if (pcase_var.eql($GENL_LIST)) {
                                _csetf_constraint_genl_list(v_new, current_value);
                            } else {
                                Errors.error($str_alt65$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_constraint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.predicate_strengthener.$constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($VARIABLE)) {
                _csetf_constraint_variable(v_new, current_value);
            } else
                if (pcase_var.eql($ISA_LIST)) {
                    _csetf_constraint_isa_list(v_new, current_value);
                } else
                    if (pcase_var.eql($GENL_LIST)) {
                        _csetf_constraint_genl_list(v_new, current_value);
                    } else {
                        Errors.error($str64$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CONSTRAINT, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $VARIABLE, constraint_variable(obj));
        funcall(visitor_fn, obj, $SLOT, $ISA_LIST, constraint_isa_list(obj));
        funcall(visitor_fn, obj, $SLOT, $GENL_LIST, constraint_genl_list(obj));
        funcall(visitor_fn, obj, $END, MAKE_CONSTRAINT, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_constraint(obj, visitor_fn);
    }

    public static final SubLObject new_constraint_alt(SubLObject variable) {
        {
            SubLObject constraint = make_constraint(UNPROVIDED);
            _csetf_constraint_variable(constraint, variable);
            return constraint;
        }
    }

    public static SubLObject new_constraint(final SubLObject variable) {
        final SubLObject constraint = make_constraint(UNPROVIDED);
        _csetf_constraint_variable(constraint, variable);
        return constraint;
    }

    public static final SubLObject invalid_constraintP_alt(SubLObject constraint) {
        return sublisp_null(constraint_isa_list(constraint));
    }

    public static SubLObject invalid_constraintP(final SubLObject constraint) {
        return sublisp_null(constraint_isa_list(constraint));
    }

    public static final SubLObject print_constraint_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        SubLTrampolineFile.checkType(v_object, CONSTRAINT_P);
        format(stream, $str_alt66$__Constraint___A_isa___A_genl___A, new SubLObject[]{ constraint_variable(v_object), constraint_isa_list(v_object), constraint_genl_list(v_object) });
        return v_object;
    }

    public static SubLObject print_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        assert NIL != constraint_p(v_object) : "! predicate_strengthener.constraint_p(v_object) " + "predicate_strengthener.constraint_p error :" + v_object;
        format(stream, $str70$__Constraint___A_isa___A_genl___A, new SubLObject[]{ constraint_variable(v_object), constraint_isa_list(v_object), constraint_genl_list(v_object) });
        return v_object;
    }

    public static final SubLObject constraint_as_alist_alt(SubLObject constraint) {
        {
            SubLObject isa_list = constraint_isa_list(constraint);
            SubLObject genl_list = constraint_genl_list(constraint);
            return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
        }
    }

    public static SubLObject constraint_as_alist(final SubLObject constraint) {
        final SubLObject isa_list = constraint_isa_list(constraint);
        final SubLObject genl_list = constraint_genl_list(constraint);
        return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
    }

    public static final SubLObject convert_isa_and_genl_list_to_alist_alt(SubLObject isa_list, SubLObject genl_list) {
        {
            SubLObject isa_list_result = NIL;
            if (NIL != isa_list) {
                isa_list_result = cons($$isa, isa_list);
            }
            if ((NIL == genl_list) && (NIL == isa_list_result)) {
                return NIL;
            } else {
                if (NIL == genl_list) {
                    return list(isa_list_result);
                } else {
                    return list(isa_list_result, cons($$genls, genl_list));
                }
            }
        }
    }

    public static SubLObject convert_isa_and_genl_list_to_alist(final SubLObject isa_list, final SubLObject genl_list) {
        SubLObject isa_list_result = NIL;
        if (NIL != isa_list) {
            isa_list_result = cons($$isa, isa_list);
        }
        if ((NIL == genl_list) && (NIL == isa_list_result)) {
            return NIL;
        }
        if (NIL == genl_list) {
            return list(isa_list_result);
        }
        return list(isa_list_result, cons($$genls, genl_list));
    }

    public static final SubLObject collection_subset_fn_nat_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && (cycl_utilities.nat_functor(v_object) == $$CollectionSubsetFn));
    }

    public static SubLObject collection_subset_fn_nat_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && cycl_utilities.nat_functor(v_object).eql($$CollectionSubsetFn));
    }

    public static final SubLObject collection_subset_fn_nart_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) && (cycl_utilities.nat_functor(v_object) == $$CollectionSubsetFn));
    }

    public static SubLObject collection_subset_fn_nart_p(final SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) && cycl_utilities.nat_functor(v_object).eql($$CollectionSubsetFn));
    }

    public static final SubLObject collection_subset_fn_naut_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && (cycl_utilities.nat_functor(v_object) == $$CollectionSubsetFn));
    }

    public static SubLObject collection_subset_fn_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && cycl_utilities.nat_functor(v_object).eql($$CollectionSubsetFn));
    }

    public static final SubLObject collection_subset_fn_nat_subset_formula_alt(SubLObject collection_subset_fn_nat) {
        {
            SubLObject subset = cycl_utilities.nat_arg2(collection_subset_fn_nat, UNPROVIDED);
            if (NIL != el_formula_with_operator_p(subset, $$TheSetOf)) {
                return cycl_utilities.nat_arg2(subset, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject collection_subset_fn_nat_subset_formula(final SubLObject collection_subset_fn_nat) {
        final SubLObject subset = cycl_utilities.nat_arg2(collection_subset_fn_nat, UNPROVIDED);
        if (NIL != el_formula_with_operator_p(subset, $$TheSetOf)) {
            return cycl_utilities.nat_arg2(subset, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject predstren_get_inter_formula_variables_arg_constraints_alt(SubLObject el_formula, SubLObject mt) {
        {
            SubLObject arg_constraint_formula = (NIL != collection_subset_fn_nat_p(el_formula)) ? ((SubLObject) (collection_subset_fn_nat_subset_formula(el_formula))) : el_formula;
            SubLObject constraint_formula = at_var_types.inter_formula_variables_arg_constraints(arg_constraint_formula, mt, UNPROVIDED);
            SubLObject collection_subset_fn_naut_subformulas = cycl_utilities.expression_gather(el_formula, COLLECTION_SUBSET_FN_NAUT_P, T, symbol_function(EQUAL), FORMULA_ARG2, UNPROVIDED);
            SubLObject new_formula = predstren_expand_collection_subset_fn_narts(el_formula);
            SubLObject additional_constraints = NIL;
            if (!el_formula.equal(new_formula)) {
                constraint_formula = make_conjunction(list(constraint_formula, at_var_types.inter_formula_variables_arg_constraints(new_formula, mt, UNPROVIDED)));
            }
            {
                SubLObject cdolist_list_var = collection_subset_fn_naut_subformulas;
                SubLObject subformula = NIL;
                for (subformula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subformula = cdolist_list_var.first()) {
                    {
                        SubLObject pred = cycl_utilities.formula_operator(subformula);
                        SubLObject arg1 = cycl_utilities.formula_arg1(subformula, UNPROVIDED);
                        SubLObject arg2 = cycl_utilities.formula_arg2(subformula, UNPROVIDED);
                        if (NIL != cycl_variables.el_varP(arg1)) {
                            if (pred == $$isa) {
                                {
                                    SubLObject v_genls = genls.min_genls(arg2, mt, UNPROVIDED);
                                    SubLObject cdolist_list_var_15 = v_genls;
                                    SubLObject genl = NIL;
                                    for (genl = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , genl = cdolist_list_var_15.first()) {
                                        additional_constraints = cons(make_binary_formula($$isa, arg1, genl), additional_constraints);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != additional_constraints) {
                constraint_formula = make_conjunction(cons(constraint_formula, additional_constraints));
            }
            return constraint_formula;
        }
    }

    public static SubLObject predstren_get_inter_formula_variables_arg_constraints(final SubLObject el_formula, final SubLObject mt) {
        final SubLObject arg_constraint_formula = (NIL != collection_subset_fn_nat_p(el_formula)) ? collection_subset_fn_nat_subset_formula(el_formula) : el_formula;
        SubLObject constraint_formula = at_var_types.inter_formula_variables_arg_constraints(arg_constraint_formula, mt, UNPROVIDED);
        final SubLObject collection_subset_fn_naut_subformulas = cycl_utilities.expression_gather(el_formula, COLLECTION_SUBSET_FN_NAUT_P, T, symbol_function(EQUAL), FORMULA_ARG2, UNPROVIDED);
        final SubLObject new_formula = predstren_expand_collection_subset_fn_narts(el_formula);
        SubLObject additional_constraints = NIL;
        if (!el_formula.equal(new_formula)) {
            constraint_formula = make_conjunction(list(constraint_formula, at_var_types.inter_formula_variables_arg_constraints(new_formula, mt, UNPROVIDED)));
        }
        SubLObject cdolist_list_var = collection_subset_fn_naut_subformulas;
        SubLObject subformula = NIL;
        subformula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(subformula);
            final SubLObject arg1 = cycl_utilities.formula_arg1(subformula, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(subformula, UNPROVIDED);
            if ((NIL != cycl_variables.el_varP(arg1)) && pred.eql($$isa)) {
                SubLObject cdolist_list_var_$15;
                final SubLObject v_genls = cdolist_list_var_$15 = genls.min_genls(arg2, mt, UNPROVIDED);
                SubLObject genl = NIL;
                genl = cdolist_list_var_$15.first();
                while (NIL != cdolist_list_var_$15) {
                    additional_constraints = cons(make_binary_formula($$isa, arg1, genl), additional_constraints);
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    genl = cdolist_list_var_$15.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            subformula = cdolist_list_var.first();
        } 
        if (NIL != additional_constraints) {
            constraint_formula = make_conjunction(cons(constraint_formula, additional_constraints));
        }
        return constraint_formula;
    }

    public static final SubLObject predstren_expand_collection_subset_fn_narts_internal_alt(SubLObject formula) {
        return cycl_utilities.expression_transform(formula, COLLECTION_SUBSET_FN_NART_P, NART_EXPAND, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predstren_expand_collection_subset_fn_narts_internal(final SubLObject formula) {
        return cycl_utilities.expression_transform(formula, COLLECTION_SUBSET_FN_NART_P, NART_EXPAND, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject predstren_expand_collection_subset_fn_narts_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return predstren_expand_collection_subset_fn_narts_internal(formula);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, $kw20$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw20$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(predstren_expand_collection_subset_fn_narts_internal(formula)));
                        memoization_state.caching_state_put(caching_state, formula, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject predstren_expand_collection_subset_fn_narts(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return predstren_expand_collection_subset_fn_narts_internal(formula);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(predstren_expand_collection_subset_fn_narts_internal(formula)));
            memoization_state.caching_state_put(caching_state, formula, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject predstren_compute_constraints_alt(SubLObject el_formula, SubLObject mt) {
        {
            SubLObject constraints = predstren_get_inter_formula_variables_arg_constraints(el_formula, mt);
            SubLObject result = NIL;
            if (NIL == constraints) {
                return NIL;
            }
            constraints = append(constraints, predstren_get_typegenl_constraints(constraints));
            {
                SubLObject cdolist_list_var = predstren_normalize_constraints(constraints);
                SubLObject v_set = NIL;
                for (v_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_set = cdolist_list_var.first()) {
                    {
                        SubLObject new_constraint = predstren_restructure_constraints(v_set);
                        if (NIL != new_constraint) {
                            result = cons(new_constraint, result);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject predstren_compute_constraints(final SubLObject el_formula, final SubLObject mt) {
        SubLObject constraints = predstren_get_inter_formula_variables_arg_constraints(el_formula, mt);
        SubLObject result = NIL;
        if (NIL == constraints) {
            return NIL;
        }
        constraints = append(constraints, predstren_get_typegenl_constraints(constraints));
        SubLObject cdolist_list_var = predstren_normalize_constraints(constraints);
        SubLObject v_set = NIL;
        v_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_constraint = predstren_restructure_constraints(v_set);
            if (NIL != new_constraint) {
                result = cons(new_constraint, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject predstren_get_typegenl_constraints_alt(SubLObject constraints) {
        if (cycl_utilities.formula_operator(constraints) != $$and) {
            return NIL;
        }
        {
            SubLObject constraint_list = cycl_utilities.formula_args(constraints, UNPROVIDED);
            SubLObject genls_constraints = NIL;
            SubLObject cdolist_list_var = constraint_list;
            SubLObject constraint = NIL;
            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                if ($$isa == cycl_utilities.formula_operator(constraint)) {
                    {
                        SubLObject var = cycl_utilities.formula_arg1(constraint, UNPROVIDED);
                        SubLObject col = cycl_utilities.formula_arg2(constraint, UNPROVIDED);
                        SubLObject isa_cols = genls.genls(col, UNPROVIDED, UNPROVIDED);
                        isa_cols = cons(col, isa_cols);
                        {
                            SubLObject cdolist_list_var_16 = isa_cols;
                            SubLObject isa_col = NIL;
                            for (isa_col = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , isa_col = cdolist_list_var_16.first()) {
                                {
                                    SubLObject type_genls = kb_mapping_utilities.pred_values(isa_col, $$typeGenls, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL != type_genls) {
                                        {
                                            SubLObject cdolist_list_var_17 = type_genls;
                                            SubLObject type_genl = NIL;
                                            for (type_genl = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , type_genl = cdolist_list_var_17.first()) {
                                                {
                                                    SubLObject item_var = list($$genls, var, type_genl);
                                                    if (NIL == member(item_var, genls_constraints, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        genls_constraints = cons(item_var, genls_constraints);
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
            return genls_constraints;
        }
    }

    public static SubLObject predstren_get_typegenl_constraints(final SubLObject constraints) {
        if (!cycl_utilities.formula_operator(constraints).eql($$and)) {
            return NIL;
        }
        final SubLObject constraint_list = cycl_utilities.formula_args(constraints, UNPROVIDED);
        SubLObject genls_constraints = NIL;
        SubLObject cdolist_list_var = constraint_list;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($$isa.eql(cycl_utilities.formula_operator(constraint))) {
                final SubLObject var = cycl_utilities.formula_arg1(constraint, UNPROVIDED);
                final SubLObject col = cycl_utilities.formula_arg2(constraint, UNPROVIDED);
                SubLObject isa_cols = genls.genls(col, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var_$16;
                isa_cols = cdolist_list_var_$16 = cons(col, isa_cols);
                SubLObject isa_col = NIL;
                isa_col = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    final SubLObject type_genls = kb_mapping_utilities.pred_values(isa_col, $$typeGenls, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != type_genls) {
                        SubLObject cdolist_list_var_$17 = type_genls;
                        SubLObject type_genl = NIL;
                        type_genl = cdolist_list_var_$17.first();
                        while (NIL != cdolist_list_var_$17) {
                            final SubLObject item_var = list($$genls, var, type_genl);
                            if (NIL == member(item_var, genls_constraints, symbol_function(EQL), symbol_function(IDENTITY))) {
                                genls_constraints = cons(item_var, genls_constraints);
                            }
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            type_genl = cdolist_list_var_$17.first();
                        } 
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    isa_col = cdolist_list_var_$16.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return genls_constraints;
    }

    public static final SubLObject predstren_normalize_constraints_alt(SubLObject constraints) {
        if ($$or == constraints.first()) {
            constraints = constraints.rest();
        }
        if (!constraints.first().isList()) {
            constraints = list(constraints);
        }
        if ($$and != constraints.first().first()) {
            constraints = list(constraints);
        }
        return constraints;
    }

    public static SubLObject predstren_normalize_constraints(SubLObject constraints) {
        if ($$or.eql(constraints.first())) {
            constraints = constraints.rest();
        }
        if (!constraints.first().isList()) {
            constraints = list(constraints);
        }
        if (!$$and.eql(constraints.first().first())) {
            constraints = list(constraints);
        }
        return constraints;
    }

    public static final SubLObject predstren_restructure_constraints_alt(SubLObject v_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject seen = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                SubLObject constraints = NIL;
                SubLObject result = NIL;
                predstren_cache_constraints(v_set, seen);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(seen));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != invalid_constraintP(value)) {
                                result = T;
                            } else {
                                constraints = cons(value, constraints);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return NIL != result ? ((SubLObject) (NIL)) : constraints;
            }
        }
    }

    public static SubLObject predstren_restructure_constraints(final SubLObject v_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject seen = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
        SubLObject constraints = NIL;
        SubLObject result = NIL;
        predstren_cache_constraints(v_set, seen);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(seen)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != invalid_constraintP(value)) {
                result = T;
            } else {
                constraints = cons(value, constraints);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL != result ? NIL : constraints;
    }

    public static final SubLObject predstren_cache_constraints_alt(SubLObject v_set, SubLObject seen) {
        {
            SubLObject cdolist_list_var = v_set;
            SubLObject constraint = NIL;
            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                if (constraint == $$and) {
                } else {
                    if (constraint.isList() && (constraint.first() == $$and)) {
                        predstren_cache_constraints(constraint.rest(), seen);
                    } else {
                        if ((NIL != el_formula_p(constraint)) && (NIL != formula_arityE(constraint, TWO_INTEGER, UNPROVIDED))) {
                            {
                                SubLObject datum = constraint;
                                SubLObject current = datum;
                                SubLObject functor = NIL;
                                SubLObject var = NIL;
                                SubLObject v_term = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt76);
                                functor = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt76);
                                var = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt76);
                                v_term = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != subl_promotions.memberP(v_term, $list_alt77, UNPROVIDED, UNPROVIDED)) {
                                        predstren_extend_constraint_cache(seen, functor, var, $EMPTY);
                                    } else {
                                        predstren_extend_constraint_cache(seen, functor, var, v_term);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt76);
                                }
                            }
                        } else {
                            Errors.warn($str_alt79$Non_binary_constraint_in_Predicat, constraint);
                        }
                    }
                }
            }
        }
        return seen;
    }

    public static SubLObject predstren_cache_constraints(final SubLObject v_set, final SubLObject seen) {
        SubLObject cdolist_list_var = v_set;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!constraint.eql($$and)) {
                if (constraint.isList() && constraint.first().eql($$and)) {
                    predstren_cache_constraints(constraint.rest(), seen);
                } else
                    if ((NIL != el_formula_p(constraint)) && (NIL != formula_arityE(constraint, TWO_INTEGER, UNPROVIDED))) {
                        SubLObject current;
                        final SubLObject datum = current = constraint;
                        SubLObject functor = NIL;
                        SubLObject var = NIL;
                        SubLObject v_term = NIL;
                        destructuring_bind_must_consp(current, datum, $list80);
                        functor = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list80);
                        var = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list80);
                        v_term = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != subl_promotions.memberP(v_term, $list81, UNPROVIDED, UNPROVIDED)) {
                                predstren_extend_constraint_cache(seen, functor, var, $EMPTY);
                            } else {
                                predstren_extend_constraint_cache(seen, functor, var, v_term);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list80);
                        }
                    } else {
                        Errors.warn($str83$Non_binary_constraint_in_Predicat, constraint);
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return seen;
    }

    public static final SubLObject predstren_extend_constraint_cache_alt(SubLObject v_cache, SubLObject functor, SubLObject var, SubLObject constraint) {
        {
            SubLObject old = dictionary.dictionary_lookup(v_cache, var, NIL);
            if (NIL == old) {
                old = new_constraint(var);
            }
            if (constraint != $EMPTY) {
                if (functor == $$genls) {
                    {
                        SubLObject genl_list = constraint_genl_list(old);
                        SubLObject item_var = constraint;
                        if (NIL == member(item_var, genl_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            genl_list = cons(item_var, genl_list);
                        }
                        _csetf_constraint_genl_list(old, genl_list);
                    }
                } else {
                    if (functor == $$isa) {
                        {
                            SubLObject isa_list = constraint_isa_list(old);
                            SubLObject item_var = constraint;
                            if (NIL == member(item_var, isa_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                isa_list = cons(item_var, isa_list);
                            }
                            _csetf_constraint_isa_list(old, isa_list);
                        }
                    }
                }
            }
            dictionary.dictionary_enter(v_cache, var, old);
        }
        return v_cache;
    }

    public static SubLObject predstren_extend_constraint_cache(final SubLObject v_cache, final SubLObject functor, final SubLObject var, final SubLObject constraint) {
        SubLObject old = dictionary.dictionary_lookup(v_cache, var, NIL);
        if (NIL == old) {
            old = new_constraint(var);
        }
        if (!constraint.eql($EMPTY)) {
            if (functor.eql($$genls)) {
                SubLObject genl_list = constraint_genl_list(old);
                if (NIL == member(constraint, genl_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    genl_list = cons(constraint, genl_list);
                }
                _csetf_constraint_genl_list(old, genl_list);
            } else
                if (functor.eql($$isa)) {
                    SubLObject isa_list = constraint_isa_list(old);
                    if (NIL == member(constraint, isa_list, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        isa_list = cons(constraint, isa_list);
                    }
                    _csetf_constraint_isa_list(old, isa_list);
                }

        }
        dictionary.dictionary_enter(v_cache, var, old);
        return v_cache;
    }

    public static final SubLObject predstren_collect_predicates_alt(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_formula = predstren_expand_collection_subset_fn_narts(formula);
                SubLObject occurrences = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        occurrences = list_utilities.tree_find_all_nested_if(PREDSTREN_IDENTIFY_PREDICATE, el_formula, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return occurrences;
            }
        }
    }

    public static SubLObject predstren_collect_predicates(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_formula = predstren_expand_collection_subset_fn_narts(formula);
        SubLObject occurrences = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            occurrences = list_utilities.tree_find_all_nested_if(PREDSTREN_IDENTIFY_PREDICATE, el_formula, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return occurrences;
    }

    public static final SubLObject predstren_identify_predicate_alt(SubLObject item) {
        if (NIL == el_formula_p(item)) {
            return NIL;
        }
        {
            SubLObject functor = cycl_utilities.formula_operator(item);
            return makeBoolean(((NIL != fort_types_interface.predicateP(functor)) && (NIL == list_utilities.member_eqP(functor, $predstren_common_uninteresting$.getGlobalValue()))) && ((NIL != isa.isaP(functor, $$UnderspecifiedPredicate, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.some_spec_pred_or_inverseP(functor, UNPROVIDED, UNPROVIDED))));
        }
    }

    public static SubLObject predstren_identify_predicate(final SubLObject item) {
        if (NIL == el_formula_p(item)) {
            return NIL;
        }
        final SubLObject functor = cycl_utilities.formula_operator(item);
        return makeBoolean(((NIL != fort_types_interface.predicateP(functor)) && (NIL == subl_promotions.memberP(functor, $predstren_common_uninteresting$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) && ((NIL != isa.isaP(functor, $$UnderspecifiedPredicate, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.some_spec_pred_or_inverseP(functor, UNPROVIDED, UNPROVIDED))));
    }

    /**
     * Given the constraints and the predicates, figure out if there is a better
     * one to try.
     */
    @LispMethod(comment = "Given the constraints and the predicates, figure out if there is a better\r\none to try.\nGiven the constraints and the predicates, figure out if there is a better\none to try.")
    public static final SubLObject predstren_analyze_options_alt(SubLObject predforms, SubLObject constraints, SubLObject mt) {
        {
            SubLObject replacements = NIL;
            if (NIL == constraints) {
                constraints = list(NIL);
            }
            {
                SubLObject cdolist_list_var = predforms;
                SubLObject predform = NIL;
                for (predform = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predform = cdolist_list_var.first()) {
                    {
                        SubLObject result = predstren_analyze_one_option(predform, constraints, mt);
                        if (NIL != result) {
                            replacements = cons(narts_high.nart_expand(cons(predform, result)), replacements);
                        }
                    }
                }
            }
            return replacements;
        }
    }

    /**
     * Given the constraints and the predicates, figure out if there is a better
     * one to try.
     */
    @LispMethod(comment = "Given the constraints and the predicates, figure out if there is a better\r\none to try.\nGiven the constraints and the predicates, figure out if there is a better\none to try.")
    public static SubLObject predstren_analyze_options(final SubLObject predforms, SubLObject constraints, final SubLObject mt) {
        SubLObject replacements = NIL;
        if (NIL == constraints) {
            constraints = list(NIL);
        }
        SubLObject cdolist_list_var = predforms;
        SubLObject predform = NIL;
        predform = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = predstren_analyze_one_option(predform, constraints, mt);
            if (NIL != result) {
                replacements = cons(narts_high.nart_expand(cons(predform, result)), replacements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predform = cdolist_list_var.first();
        } 
        return replacements;
    }

    public static final SubLObject predstren_analyze_one_option_alt(SubLObject predform, SubLObject constraint_sets, SubLObject mt) {
        {
            SubLObject results = NIL;
            SubLObject predicate = cycl_utilities.formula_operator(predform);
            SubLObject v_arguments = cycl_utilities.formula_args(predform, UNPROVIDED);
            SubLObject cdolist_list_var = constraint_sets;
            SubLObject constraint_set = NIL;
            for (constraint_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_set = cdolist_list_var.first()) {
                {
                    SubLObject alist = NIL;
                    SubLObject preds = NIL;
                    SubLObject list_var = NIL;
                    SubLObject arg = NIL;
                    SubLObject arg_index = NIL;
                    for (list_var = v_arguments, arg = list_var.first(), arg_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , arg_index = add(ONE_INTEGER, arg_index)) {
                        {
                            SubLObject arg_desc = NIL;
                            if (NIL != subl_promotions.memberP(arg, constraint_set, symbol_function(EQUALP), CONSTRAINT_VARIABLE)) {
                                {
                                    SubLObject constraint = find(arg, constraint_set, symbol_function(EQUALP), CONSTRAINT_VARIABLE, UNPROVIDED, UNPROVIDED);
                                    arg_desc = constraint_as_alist(constraint);
                                }
                            } else {
                                if (NIL != forts.fort_p(arg)) {
                                    arg_desc = constraint_from_fort_as_alist(arg, mt);
                                } else {
                                    if (arg.isList()) {
                                        arg_desc = constraint_from_listy_as_alist(arg, mt);
                                    } else {
                                        arg_desc = constraint_from_object_as_alist(arg, mt);
                                    }
                                }
                            }
                            alist = cons(list(add(arg_index, ONE_INTEGER), arg_desc), alist);
                        }
                    }
                    preds = strengthen_predicate_with_constraints(predicate, alist, mt, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var_18 = preds;
                        SubLObject result_set = NIL;
                        for (result_set = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest() , result_set = cdolist_list_var_18.first()) {
                            {
                                SubLObject datum = result_set;
                                SubLObject current = datum;
                                SubLObject how = NIL;
                                SubLObject predicates = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt83);
                                how = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt83);
                                predicates = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject sorted = predstren_sort_by_arg_specs(predicates, mt);
                                        results = cons(list(how, sorted), results);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt83);
                                }
                            }
                        }
                    }
                }
            }
            return results;
        }
    }

    public static SubLObject predstren_analyze_one_option(final SubLObject predform, final SubLObject constraint_sets, final SubLObject mt) {
        SubLObject results = NIL;
        final SubLObject predicate = cycl_utilities.formula_operator(predform);
        final SubLObject v_arguments = cycl_utilities.formula_args(predform, UNPROVIDED);
        SubLObject cdolist_list_var = constraint_sets;
        SubLObject constraint_set = NIL;
        constraint_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject alist = NIL;
            SubLObject preds = NIL;
            SubLObject list_var = NIL;
            SubLObject arg = NIL;
            SubLObject arg_index = NIL;
            list_var = v_arguments;
            arg = list_var.first();
            for (arg_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , arg_index = add(ONE_INTEGER, arg_index)) {
                SubLObject arg_desc = NIL;
                if (NIL != subl_promotions.memberP(arg, constraint_set, symbol_function(EQUALP), CONSTRAINT_VARIABLE)) {
                    final SubLObject constraint = find(arg, constraint_set, symbol_function(EQUALP), CONSTRAINT_VARIABLE, UNPROVIDED, UNPROVIDED);
                    arg_desc = constraint_as_alist(constraint);
                } else
                    if (NIL != forts.fort_p(arg)) {
                        arg_desc = constraint_from_fort_as_alist(arg, mt);
                    } else
                        if (arg.isList()) {
                            arg_desc = constraint_from_listy_as_alist(arg, mt);
                        } else {
                            arg_desc = constraint_from_object_as_alist(arg, mt);
                        }


                alist = cons(list(add(arg_index, ONE_INTEGER), arg_desc), alist);
            }
            SubLObject cdolist_list_var_$18;
            preds = cdolist_list_var_$18 = strengthen_predicate_with_constraints(predicate, alist, mt, UNPROVIDED);
            SubLObject result_set = NIL;
            result_set = cdolist_list_var_$18.first();
            while (NIL != cdolist_list_var_$18) {
                SubLObject current;
                final SubLObject datum = current = result_set;
                SubLObject how = NIL;
                SubLObject predicates = NIL;
                destructuring_bind_must_consp(current, datum, $list87);
                how = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list87);
                predicates = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject sorted = predstren_sort_by_arg_specs(predicates, mt);
                    results = cons(list(how, sorted), results);
                } else {
                    cdestructuring_bind_error(datum, $list87);
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                result_set = cdolist_list_var_$18.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            constraint_set = cdolist_list_var.first();
        } 
        return results;
    }

    public static final SubLObject predstren_sort_by_arg_specs_alt(SubLObject predicates, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        results = Sort.sort(predicates, $sym84$_, RELATION_GENERALITY_ESTIMATE);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject predstren_sort_by_arg_specs(final SubLObject predicates, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            results = Sort.sort(predicates, $sym88$_, RELATION_GENERALITY_ESTIMATE);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject constraint_from_fort_as_alist_alt(SubLObject fort, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
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
                            SubLObject isa_list = isa.min_isa(fort, UNPROVIDED, UNPROVIDED);
                            SubLObject genl_list = genls.min_genls(fort, UNPROVIDED, UNPROVIDED);
                            result = convert_isa_and_genl_list_to_alist(isa_list, genl_list);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject constraint_from_fort_as_alist(final SubLObject fort, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject isa_list = isa.min_isa(fort, UNPROVIDED, UNPROVIDED);
            final SubLObject genl_list = genls.min_genls(fort, UNPROVIDED, UNPROVIDED);
            result = convert_isa_and_genl_list_to_alist(isa_list, genl_list);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * This is tricky. Because we are reasoning about formulas, we might
     * be encountering a SubLisp list, a reifiable function, a NART,
     * or whatever. So we have to do some careful analysis.
     */
    @LispMethod(comment = "This is tricky. Because we are reasoning about formulas, we might\r\nbe encountering a SubLisp list, a reifiable function, a NART,\r\nor whatever. So we have to do some careful analysis.\nThis is tricky. Because we are reasoning about formulas, we might\nbe encountering a SubLisp list, a reifiable function, a NART,\nor whatever. So we have to do some careful analysis.")
    public static final SubLObject constraint_from_listy_as_alist_alt(SubLObject listy, SubLObject mt) {
        {
            SubLObject functor = cycl_utilities.formula_arg0(listy);
            SubLObject isa_list = NIL;
            SubLObject genl_list = NIL;
            if (NIL != fort_types_interface.functionP(functor)) {
                isa_list = isa.min_isa(listy, mt, UNPROVIDED);
                genl_list = genls.min_genls(listy, mt, UNPROVIDED);
            } else {
                if (NIL != forts.fort_p(functor)) {
                    isa_list = $list_alt86;
                    genl_list = NIL;
                } else {
                    isa_list = min_isa_via_deffns(listy, mt);
                    genl_list = NIL;
                }
            }
            return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
        }
    }

    /**
     * This is tricky. Because we are reasoning about formulas, we might
     * be encountering a SubLisp list, a reifiable function, a NART,
     * or whatever. So we have to do some careful analysis.
     */
    @LispMethod(comment = "This is tricky. Because we are reasoning about formulas, we might\r\nbe encountering a SubLisp list, a reifiable function, a NART,\r\nor whatever. So we have to do some careful analysis.\nThis is tricky. Because we are reasoning about formulas, we might\nbe encountering a SubLisp list, a reifiable function, a NART,\nor whatever. So we have to do some careful analysis.")
    public static SubLObject constraint_from_listy_as_alist(final SubLObject listy, final SubLObject mt) {
        final SubLObject functor = cycl_utilities.formula_arg0(listy);
        SubLObject isa_list = NIL;
        SubLObject genl_list = NIL;
        if (NIL != fort_types_interface.functionP(functor)) {
            isa_list = isa.min_isa(listy, mt, UNPROVIDED);
            genl_list = genls.min_genls(listy, mt, UNPROVIDED);
        } else
            if (NIL != forts.fort_p(functor)) {
                isa_list = $list90;
                genl_list = NIL;
            } else {
                isa_list = min_isa_via_deffns(listy, mt);
                genl_list = NIL;
            }

        return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
    }

    public static final SubLObject constraint_from_object_as_alist_alt(SubLObject v_object, SubLObject mt) {
        {
            SubLObject isa_list = min_isa_via_deffns(v_object, mt);
            SubLObject genl_list = NIL;
            return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
        }
    }

    public static SubLObject constraint_from_object_as_alist(final SubLObject v_object, final SubLObject mt) {
        final SubLObject isa_list = min_isa_via_deffns(v_object, mt);
        final SubLObject genl_list = NIL;
        return convert_isa_and_genl_list_to_alist(isa_list, genl_list);
    }

    /**
     * Determine the isa of the object by walking down the deffns hierarchy
     * and determining the most appropriate collection this element belongs
     * to.
     *
     * @unknown Hardcode a few interersting cases and let someone else code
    up the rest.
     */
    @LispMethod(comment = "Determine the isa of the object by walking down the deffns hierarchy\r\nand determining the most appropriate collection this element belongs\r\nto.\r\n\r\n@unknown Hardcode a few interersting cases and let someone else code\r\nup the rest.\nDetermine the isa of the object by walking down the deffns hierarchy\nand determining the most appropriate collection this element belongs\nto.")
    public static final SubLObject min_isa_via_deffns_alt(SubLObject v_object, SubLObject mt) {
        if (v_object.isString()) {
            return list($$SubLString);
        } else {
            if (v_object.isInteger()) {
                return list(v_object.isNegative() ? ((SubLObject) ($$NegativeInteger)) : $$NonNegativeInteger);
            } else {
                if (v_object.isDouble()) {
                    return list($$RealNumber);
                } else {
                    if (v_object.isKeyword()) {
                        return list($$SubLKeyword);
                    } else {
                        if (NIL == v_object) {
                            return list($$SubLListOrAtom);
                        } else {
                            if (v_object.isList()) {
                                return list($$SubLList);
                            } else {
                                if (v_object.isAtom()) {
                                    return list($$SubLAtom);
                                } else {
                                    return list($$Thing);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Determine the isa of the object by walking down the deffns hierarchy\r\nand determining the most appropriate collection this element belongs\r\nto.\r\n\r\n@unknown Hardcode a few interersting cases and let someone else code\r\nup the rest.\nDetermine the isa of the object by walking down the deffns hierarchy\nand determining the most appropriate collection this element belongs\nto.")
    public static SubLObject min_isa_via_deffns(final SubLObject v_object, final SubLObject mt) {
        if (v_object.isString()) {
            return list($$SubLString);
        }
        if (v_object.isInteger()) {
            return list(v_object.isNegative() ? $$NegativeInteger : $$NonNegativeInteger);
        }
        if (v_object.isDouble()) {
            return list($$RealNumber);
        }
        if (v_object.isKeyword()) {
            return list($$SubLKeyword);
        }
        if (NIL == v_object) {
            return list($$SubLListOrAtom);
        }
        if (v_object.isList()) {
            return list($$SubLList);
        }
        if (v_object.isAtom()) {
            return list($$SubLAtom);
        }
        return list($$Thing);
    }

    /**
     * Given a list of constraint structures and a list of constraint terms
     * with ISA and GENLs lists for each, merge them to extend the constraint
     * set, which we return.
     */
    @LispMethod(comment = "Given a list of constraint structures and a list of constraint terms\r\nwith ISA and GENLs lists for each, merge them to extend the constraint\r\nset, which we return.\nGiven a list of constraint structures and a list of constraint terms\nwith ISA and GENLs lists for each, merge them to extend the constraint\nset, which we return.")
    public static final SubLObject predstren_extend_constraints_from_table_alt(SubLObject constraint_sets, SubLObject constraints) {
        if (NIL == constraint_sets) {
            return list(predstren_augment_one_constraint_set(NIL, constraints));
        }
        {
            SubLObject new_constraint_sets = NIL;
            SubLObject cdolist_list_var = constraint_sets;
            SubLObject constraint_set = NIL;
            for (constraint_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint_set = cdolist_list_var.first()) {
                {
                    SubLObject new_constraint_set = predstren_augment_one_constraint_set(constraint_set, constraints);
                    new_constraint_sets = cons(new_constraint_set, new_constraint_sets);
                }
            }
            return nreverse(new_constraint_sets);
        }
    }

    @LispMethod(comment = "Given a list of constraint structures and a list of constraint terms\r\nwith ISA and GENLs lists for each, merge them to extend the constraint\r\nset, which we return.\nGiven a list of constraint structures and a list of constraint terms\nwith ISA and GENLs lists for each, merge them to extend the constraint\nset, which we return.")
    public static SubLObject predstren_extend_constraints_from_table(final SubLObject constraint_sets, final SubLObject constraints) {
        if (NIL == constraint_sets) {
            return list(predstren_augment_one_constraint_set(NIL, constraints));
        }
        SubLObject new_constraint_sets = NIL;
        SubLObject cdolist_list_var = constraint_sets;
        SubLObject constraint_set = NIL;
        constraint_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_constraint_set = predstren_augment_one_constraint_set(constraint_set, constraints);
            new_constraint_sets = cons(new_constraint_set, new_constraint_sets);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_set = cdolist_list_var.first();
        } 
        return nreverse(new_constraint_sets);
    }/**
     * Given a list of constraint structures and a list of constraint terms
     * with ISA and GENLs lists for each, merge them to extend the constraint
     * set, which we return.
     */


    /**
     * Do one set of transformations.
     */
    @LispMethod(comment = "Do one set of transformations.")
    public static final SubLObject predstren_augment_one_constraint_set_alt(SubLObject constraint_set, SubLObject constraints) {
        {
            SubLObject new_constraint_set = NIL;
            SubLObject cdolist_list_var = constraints;
            SubLObject constraint = NIL;
            for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                {
                    SubLObject v_term = constraint.first();
                    SubLObject isas = second(constraint);
                    SubLObject v_genls = third(constraint);
                    SubLObject existing = find(v_term, constraint_set, EQL, CONSTRAINT_VARIABLE, UNPROVIDED, UNPROVIDED);
                    if (NIL != existing) {
                        {
                            SubLObject old_isas = constraint_isa_list(existing);
                            SubLObject old_genls = constraint_genl_list(existing);
                            {
                                SubLObject cdolist_list_var_19 = isas;
                                SubLObject v_isa = NIL;
                                for (v_isa = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , v_isa = cdolist_list_var_19.first()) {
                                    {
                                        SubLObject item_var = v_isa;
                                        if (NIL == member(item_var, old_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            old_isas = cons(item_var, old_isas);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var_20 = v_genls;
                                SubLObject genl = NIL;
                                for (genl = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , genl = cdolist_list_var_20.first()) {
                                    {
                                        SubLObject item_var = genl;
                                        if (NIL == member(item_var, old_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            old_genls = cons(item_var, old_genls);
                                        }
                                    }
                                }
                            }
                            _csetf_constraint_isa_list(existing, old_isas);
                            _csetf_constraint_genl_list(existing, old_genls);
                        }
                    } else {
                        {
                            SubLObject new_one = new_constraint(v_term);
                            _csetf_constraint_isa_list(new_one, isas);
                            _csetf_constraint_genl_list(new_one, v_genls);
                            new_constraint_set = cons(new_one, new_constraint_set);
                        }
                    }
                }
            }
            return append(new_constraint_set, constraint_set);
        }
    }

    /**
     * Do one set of transformations.
     */
    @LispMethod(comment = "Do one set of transformations.")
    public static SubLObject predstren_augment_one_constraint_set(final SubLObject constraint_set, final SubLObject constraints) {
        SubLObject new_constraint_set = NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_term = constraint.first();
            final SubLObject isas = second(constraint);
            final SubLObject v_genls = third(constraint);
            final SubLObject existing = find(v_term, constraint_set, EQL, CONSTRAINT_VARIABLE, UNPROVIDED, UNPROVIDED);
            if (NIL != existing) {
                SubLObject old_isas = constraint_isa_list(existing);
                SubLObject old_genls = constraint_genl_list(existing);
                SubLObject cdolist_list_var_$19 = isas;
                SubLObject v_isa = NIL;
                v_isa = cdolist_list_var_$19.first();
                while (NIL != cdolist_list_var_$19) {
                    final SubLObject item_var = v_isa;
                    if (NIL == member(item_var, old_isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                        old_isas = cons(item_var, old_isas);
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    v_isa = cdolist_list_var_$19.first();
                } 
                SubLObject cdolist_list_var_$20 = v_genls;
                SubLObject genl = NIL;
                genl = cdolist_list_var_$20.first();
                while (NIL != cdolist_list_var_$20) {
                    final SubLObject item_var = genl;
                    if (NIL == member(item_var, old_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                        old_genls = cons(item_var, old_genls);
                    }
                    cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                    genl = cdolist_list_var_$20.first();
                } 
                _csetf_constraint_isa_list(existing, old_isas);
                _csetf_constraint_genl_list(existing, old_genls);
            } else {
                final SubLObject new_one = new_constraint(v_term);
                _csetf_constraint_isa_list(new_one, isas);
                _csetf_constraint_genl_list(new_one, v_genls);
                new_constraint_set = cons(new_one, new_constraint_set);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        return append(new_constraint_set, constraint_set);
    }

    public static final SubLObject strengthen_predicate_wXnew_pred_strengthener_alt(SubLObject pred, SubLObject alist) {
        return strengthen_predicate_wXtyped_and_minimal_suggestions(pred, alist);
    }

    public static SubLObject strengthen_predicate_wXnew_pred_strengthener(final SubLObject pred, final SubLObject alist) {
        return strengthen_predicate_wXtyped_and_minimal_suggestions(pred, alist);
    }

    public static final SubLObject push_pred_wXmarkingXtype_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pred = NIL;
            SubLObject marking = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            marking = current.first();
            current = current.rest();
            {
                SubLObject pred_type = (current.isCons()) ? ((SubLObject) (current.first())) : $TYPED;
                destructuring_bind_must_listp(current, datum, $list_alt96);
                current = current.rest();
                if (NIL == current) {
                    if (pred_type == $TYPED) {
                        return list(PCOND, list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt100), listS(CPUSHNEW, pred, $list_alt102)), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt103), listS(CPUSHNEW, pred, $list_alt104)), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt105), listS(CPUSHNEW, pred, $list_alt102), listS(CPUSHNEW, pred, $list_alt104)));
                    } else {
                        return list(PCOND, list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt100), listS(CPUSHNEW, pred, $list_alt106)), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt103), listS(CPUSHNEW, pred, $list_alt107)), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt105), listS(CPUSHNEW, pred, $list_alt106), listS(CPUSHNEW, pred, $list_alt107)));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt96);
                }
            }
        }
        return NIL;
    }

    public static SubLObject push_pred_wXmarkingXtype(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = NIL;
        SubLObject marking = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        marking = current.first();
        current = current.rest();
        final SubLObject pred_type = (current.isCons()) ? current.first() : $TYPED;
        destructuring_bind_must_listp(current, datum, $list100);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list100);
            return NIL;
        }
        if (pred_type == $TYPED) {
            return list(PCOND, list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list104), listS(CPUSHNEW, pred, $list106)), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list107), listS(CPUSHNEW, pred, $list108)), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list109), listS(CPUSHNEW, pred, $list106), listS(CPUSHNEW, pred, $list108)));
        }
        return list(PCOND, list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list104), listS(CPUSHNEW, pred, $list110)), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list107), listS(CPUSHNEW, pred, $list111)), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list109), listS(CPUSHNEW, pred, $list110), listS(CPUSHNEW, pred, $list111)));
    }

    public static final SubLObject append_pred_wXmarking_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pred = NIL;
            SubLObject marking = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt108);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt108);
            marking = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PCOND, list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt100), list(PUNLESS, listS($sym110$MEMBER_, pred, $list_alt106), list(CSETQ, $ps_suggested_preds$, listS(SNOC, pred, $list_alt106)))), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt103), list(PUNLESS, listS($sym110$MEMBER_, pred, $list_alt107), list(CSETQ, $ps_suggested_inverses$, listS(SNOC, pred, $list_alt107)))), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list_alt105), list(PUNLESS, listS($sym110$MEMBER_, pred, $list_alt107), list(CSETQ, $ps_suggested_inverses$, listS(SNOC, pred, $list_alt107))), list(PUNLESS, listS($sym110$MEMBER_, pred, $list_alt106), list(CSETQ, $ps_suggested_preds$, listS(SNOC, pred, $list_alt106)))));
            } else {
                cdestructuring_bind_error(datum, $list_alt108);
            }
        }
        return NIL;
    }

    public static SubLObject append_pred_wXmarking(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = NIL;
        SubLObject marking = NIL;
        destructuring_bind_must_consp(current, datum, $list112);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list112);
        marking = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PCOND, list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list104), list(PUNLESS, listS($sym114$MEMBER_, pred, $list110), list(CSETQ, $ps_suggested_preds$, listS(SNOC, pred, $list110)))), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list107), list(PUNLESS, listS($sym114$MEMBER_, pred, $list111), list(CSETQ, $ps_suggested_inverses$, listS(SNOC, pred, $list111)))), list(listS(EQ, list(PRED_STRENG_MARKING_MODE, marking), $list109), list(PUNLESS, listS($sym114$MEMBER_, pred, $list111), list(CSETQ, $ps_suggested_inverses$, listS(SNOC, pred, $list111))), list(PUNLESS, listS($sym114$MEMBER_, pred, $list110), list(CSETQ, $ps_suggested_preds$, listS(SNOC, pred, $list110)))));
        }
        cdestructuring_bind_error(datum, $list112);
        return NIL;
    }

    /**
     * return the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number
     * of suggested links in the shortest path back to the root
     *
     * @param PREDICATE
    predicate
     * 		
     * @param ALIST
     * 		alist; a list containing the constraints on the arguments to PRED in some formula
     * @return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are
    in that relation to PRED.  Any typed links will always be before suggested links in these lists
     */
    @LispMethod(comment = "return the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number\r\nof suggested links in the shortest path back to the root\r\n\r\n@param PREDICATE\npredicate\r\n\t\t\r\n@param ALIST\r\n\t\talist; a list containing the constraints on the arguments to PRED in some formula\r\n@return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are\r\nin that relation to PRED.  Any typed links will always be before suggested links in these lists\nreturn the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number\nof suggested links in the shortest path back to the root")
    public static final SubLObject strengthen_predicate_wXtyped_and_minimal_suggestions_alt(SubLObject predicate, SubLObject alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject max_suggested_links = NIL;
                {
                    SubLObject _prev_bind_0 = $ps_typed_preds$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $ps_typed_inverses$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $ps_suggested_inverses$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $ps_suggested_preds$.currentBinding(thread);
                    try {
                        $ps_typed_preds$.bind(NIL, thread);
                        $ps_typed_inverses$.bind(NIL, thread);
                        $ps_suggested_inverses$.bind(NIL, thread);
                        $ps_suggested_preds$.bind(NIL, thread);
                        {
                            SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, UNPROVIDED);
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject marking = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (pred != predicate) {
                                        if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking) == ZERO_INTEGER) {
                                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                                                {
                                                    SubLObject item_var = pred;
                                                    if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                                    }
                                                }
                                            } else {
                                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                                                    {
                                                        SubLObject item_var = pred;
                                                        if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                                        }
                                                    }
                                                } else {
                                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if ((NIL == max_suggested_links) || predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numL(max_suggested_links)) {
                                                $ps_suggested_inverses$.setDynamicValue(NIL, thread);
                                                $ps_suggested_preds$.setDynamicValue(NIL, thread);
                                                max_suggested_links = predicate_strengthener_internals.pred_streng_marking_suggested_count(marking);
                                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                                                    {
                                                        SubLObject item_var = pred;
                                                        if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                        }
                                                    }
                                                } else {
                                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    } else {
                                                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                                                            {
                                                                SubLObject item_var = pred;
                                                                if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                            {
                                                                SubLObject item_var = pred;
                                                                if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numG(max_suggested_links)) {
                                                } else {
                                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    } else {
                                                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                                                            {
                                                                SubLObject item_var = pred;
                                                                if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        } else {
                                                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                                                                {
                                                                    SubLObject item_var = pred;
                                                                    if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                                    }
                                                                }
                                                                {
                                                                    SubLObject item_var = pred;
                                                                    if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            if ((NIL != $ps_typed_inverses$.getDynamicValue(thread)) || (NIL != $ps_suggested_inverses$.getDynamicValue(thread))) {
                                result = cons(list($$genlInverse, cconcatenate($ps_typed_inverses$.getDynamicValue(thread), $ps_suggested_inverses$.getDynamicValue(thread))), result);
                            }
                            if ((NIL != $ps_typed_preds$.getDynamicValue(thread)) || (NIL != $ps_suggested_preds$.getDynamicValue(thread))) {
                                result = cons(list($$genlPreds, cconcatenate($ps_typed_preds$.getDynamicValue(thread), $ps_suggested_preds$.getDynamicValue(thread))), result);
                            }
                        }
                    } finally {
                        $ps_suggested_preds$.rebind(_prev_bind_3, thread);
                        $ps_suggested_inverses$.rebind(_prev_bind_2, thread);
                        $ps_typed_inverses$.rebind(_prev_bind_1, thread);
                        $ps_typed_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * return the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number
     * of suggested links in the shortest path back to the root
     *
     * @param PREDICATE
    		predicate
     * 		
     * @param ALIST
     * 		alist; a list containing the constraints on the arguments to PRED in some formula
     * @return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are
    in that relation to PRED.  Any typed links will always be before suggested links in these lists
     */
    @LispMethod(comment = "return the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number\r\nof suggested links in the shortest path back to the root\r\n\r\n@param PREDICATE\n\t\tpredicate\r\n\t\t\r\n@param ALIST\r\n\t\talist; a list containing the constraints on the arguments to PRED in some formula\r\n@return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are\r\nin that relation to PRED.  Any typed links will always be before suggested links in these lists\nreturn the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number\nof suggested links in the shortest path back to the root")
    public static SubLObject strengthen_predicate_wXtyped_and_minimal_suggestions(final SubLObject predicate, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject max_suggested_links = NIL;
        final SubLObject _prev_bind_0 = $ps_typed_preds$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ps_typed_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ps_suggested_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ps_suggested_preds$.currentBinding(thread);
        try {
            $ps_typed_preds$.bind(NIL, thread);
            $ps_typed_inverses$.bind(NIL, thread);
            $ps_suggested_inverses$.bind(NIL, thread);
            $ps_suggested_preds$.bind(NIL, thread);
            final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject marking = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!pred.eql(predicate)) {
                    if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).eql(ZERO_INTEGER)) {
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                            }
                        } else
                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                                final SubLObject item_var = pred;
                                if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                }
                            } else
                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                                    SubLObject item_var = pred;
                                    if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                        $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                    }
                                    item_var = pred;
                                    if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                        $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                    }
                                }


                    } else
                        if ((NIL == max_suggested_links) || predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numL(max_suggested_links)) {
                            $ps_suggested_inverses$.setDynamicValue(NIL, thread);
                            $ps_suggested_preds$.setDynamicValue(NIL, thread);
                            max_suggested_links = predicate_strengthener_internals.pred_streng_marking_suggested_count(marking);
                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                                final SubLObject item_var = pred;
                                if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                }
                            } else
                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                                    final SubLObject item_var = pred;
                                    if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                        $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                    }
                                } else
                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                                        SubLObject item_var = pred;
                                        if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                            $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                        }
                                        item_var = pred;
                                        if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                            $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                        }
                                    }


                        } else
                            if (!predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numG(max_suggested_links)) {
                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                                    final SubLObject item_var = pred;
                                    if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                        $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                    }
                                } else
                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                                        final SubLObject item_var = pred;
                                        if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                            $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                        }
                                    } else
                                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                                            SubLObject item_var = pred;
                                            if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                            }
                                            item_var = pred;
                                            if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                            }
                                        }


                            }


                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if ((NIL != $ps_typed_inverses$.getDynamicValue(thread)) || (NIL != $ps_suggested_inverses$.getDynamicValue(thread))) {
                result = cons(list($$genlInverse, cconcatenate($ps_typed_inverses$.getDynamicValue(thread), $ps_suggested_inverses$.getDynamicValue(thread))), result);
            }
            if ((NIL != $ps_typed_preds$.getDynamicValue(thread)) || (NIL != $ps_suggested_preds$.getDynamicValue(thread))) {
                result = cons(list($$genlPreds, cconcatenate($ps_typed_preds$.getDynamicValue(thread), $ps_suggested_preds$.getDynamicValue(thread))), result);
            }
        } finally {
            $ps_suggested_preds$.rebind(_prev_bind_4, thread);
            $ps_suggested_inverses$.rebind(_prev_bind_3, thread);
            $ps_typed_inverses$.rebind(_prev_bind_2, thread);
            $ps_typed_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * return the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number
     * of suggested links in the shortest path back to the root
     *
     * @param PREDICATE
    predicate
     * 		
     * @param ALIST
     * 		alist; a list containing the constraints on the arguments to PRED in some formula
     * @return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are
    in that relation to PRED.  Any typed links will always be before suggested links in these lists
     */
    @LispMethod(comment = "return the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number\r\nof suggested links in the shortest path back to the root\r\n\r\n@param PREDICATE\npredicate\r\n\t\t\r\n@param ALIST\r\n\t\talist; a list containing the constraints on the arguments to PRED in some formula\r\n@return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are\r\nin that relation to PRED.  Any typed links will always be before suggested links in these lists\nreturn the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number\nof suggested links in the shortest path back to the root")
    public static final SubLObject strengthen_predicate_wXtyped_and_all_suggestions_alt(SubLObject predicate, SubLObject alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject max_suggested_links = NIL;
                {
                    SubLObject _prev_bind_0 = $ps_typed_preds$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $ps_typed_inverses$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $ps_suggested_inverses$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $ps_suggested_preds$.currentBinding(thread);
                    try {
                        $ps_typed_preds$.bind(NIL, thread);
                        $ps_typed_inverses$.bind(NIL, thread);
                        $ps_suggested_inverses$.bind(NIL, thread);
                        $ps_suggested_preds$.bind(NIL, thread);
                        {
                            SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, UNPROVIDED);
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject marking = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (pred != predicate) {
                                        if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking) == ZERO_INTEGER) {
                                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                                                {
                                                    SubLObject item_var = pred;
                                                    if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                                    }
                                                }
                                            } else {
                                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                                                    {
                                                        SubLObject item_var = pred;
                                                        if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                                        }
                                                    }
                                                } else {
                                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if ((NIL == max_suggested_links) || predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numL(max_suggested_links)) {
                                                max_suggested_links = predicate_strengthener_internals.pred_streng_marking_suggested_count(marking);
                                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                                                    {
                                                        SubLObject item_var = pred;
                                                        if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                        }
                                                    }
                                                } else {
                                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    } else {
                                                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                                                            {
                                                                SubLObject item_var = pred;
                                                                if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                            {
                                                                SubLObject item_var = pred;
                                                                if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numG(max_suggested_links)) {
                                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                                                        if (NIL == subl_promotions.memberP(pred, $ps_suggested_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                            $ps_suggested_preds$.setDynamicValue(list_utilities.snoc(pred, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                        }
                                                    } else {
                                                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                                                            if (NIL == subl_promotions.memberP(pred, $ps_suggested_inverses$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                                $ps_suggested_inverses$.setDynamicValue(list_utilities.snoc(pred, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                            }
                                                        } else {
                                                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                                                                if (NIL == subl_promotions.memberP(pred, $ps_suggested_inverses$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                                    $ps_suggested_inverses$.setDynamicValue(list_utilities.snoc(pred, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                                }
                                                                if (NIL == subl_promotions.memberP(pred, $ps_suggested_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                                    $ps_suggested_preds$.setDynamicValue(list_utilities.snoc(pred, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    } else {
                                                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                                                            {
                                                                SubLObject item_var = pred;
                                                                if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                                }
                                                            }
                                                        } else {
                                                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                                                                {
                                                                    SubLObject item_var = pred;
                                                                    if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                                                    }
                                                                }
                                                                {
                                                                    SubLObject item_var = pred;
                                                                    if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            if ((NIL != $ps_typed_inverses$.getDynamicValue(thread)) || (NIL != $ps_suggested_inverses$.getDynamicValue(thread))) {
                                result = cons(list($$genlInverse, cconcatenate($ps_typed_inverses$.getDynamicValue(thread), $ps_suggested_inverses$.getDynamicValue(thread))), result);
                            }
                            if ((NIL != $ps_typed_preds$.getDynamicValue(thread)) || (NIL != $ps_suggested_preds$.getDynamicValue(thread))) {
                                result = cons(list($$genlPreds, cconcatenate($ps_typed_preds$.getDynamicValue(thread), $ps_suggested_preds$.getDynamicValue(thread))), result);
                            }
                        }
                    } finally {
                        $ps_suggested_preds$.rebind(_prev_bind_3, thread);
                        $ps_suggested_inverses$.rebind(_prev_bind_2, thread);
                        $ps_typed_inverses$.rebind(_prev_bind_1, thread);
                        $ps_typed_preds$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * return the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number
     * of suggested links in the shortest path back to the root
     *
     * @param PREDICATE
    		predicate
     * 		
     * @param ALIST
     * 		alist; a list containing the constraints on the arguments to PRED in some formula
     * @return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are
    in that relation to PRED.  Any typed links will always be before suggested links in these lists
     */
    @LispMethod(comment = "return the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number\r\nof suggested links in the shortest path back to the root\r\n\r\n@param PREDICATE\n\t\tpredicate\r\n\t\t\r\n@param ALIST\r\n\t\talist; a list containing the constraints on the arguments to PRED in some formula\r\n@return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are\r\nin that relation to PRED.  Any typed links will always be before suggested links in these lists\nreturn the leaves of typed-spec-pred/inverse graphs, as well as the suggested preds that have the fewest number\nof suggested links in the shortest path back to the root")
    public static SubLObject strengthen_predicate_wXtyped_and_all_suggestions(final SubLObject predicate, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject max_suggested_links = NIL;
        final SubLObject _prev_bind_0 = $ps_typed_preds$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ps_typed_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ps_suggested_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ps_suggested_preds$.currentBinding(thread);
        try {
            $ps_typed_preds$.bind(NIL, thread);
            $ps_typed_inverses$.bind(NIL, thread);
            $ps_suggested_inverses$.bind(NIL, thread);
            $ps_suggested_preds$.bind(NIL, thread);
            final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject marking = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (!pred.eql(predicate)) {
                    if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).eql(ZERO_INTEGER)) {
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                            }
                        } else
                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                                final SubLObject item_var = pred;
                                if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                }
                            } else
                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                                    SubLObject item_var = pred;
                                    if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                        $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                    }
                                    item_var = pred;
                                    if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                        $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                    }
                                }


                    } else
                        if ((NIL == max_suggested_links) || predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numL(max_suggested_links)) {
                            max_suggested_links = predicate_strengthener_internals.pred_streng_marking_suggested_count(marking);
                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                                final SubLObject item_var = pred;
                                if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                }
                            } else
                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                                    final SubLObject item_var = pred;
                                    if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                        $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                    }
                                } else
                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                                        SubLObject item_var = pred;
                                        if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                            $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                        }
                                        item_var = pred;
                                        if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                            $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                        }
                                    }


                        } else
                            if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).numG(max_suggested_links)) {
                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                                    if (NIL == subl_promotions.memberP(pred, $ps_suggested_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                        $ps_suggested_preds$.setDynamicValue(list_utilities.snoc(pred, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                    }
                                } else
                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                                        if (NIL == subl_promotions.memberP(pred, $ps_suggested_inverses$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                            $ps_suggested_inverses$.setDynamicValue(list_utilities.snoc(pred, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                        }
                                    } else
                                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                                            if (NIL == subl_promotions.memberP(pred, $ps_suggested_inverses$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                $ps_suggested_inverses$.setDynamicValue(list_utilities.snoc(pred, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                            }
                                            if (NIL == subl_promotions.memberP(pred, $ps_suggested_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                $ps_suggested_preds$.setDynamicValue(list_utilities.snoc(pred, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                            }
                                        }


                            } else
                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                                    final SubLObject item_var = pred;
                                    if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                        $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                    }
                                } else
                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                                        final SubLObject item_var = pred;
                                        if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                            $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                        }
                                    } else
                                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                                            SubLObject item_var = pred;
                                            if (NIL == member(item_var, $ps_suggested_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                $ps_suggested_preds$.setDynamicValue(cons(item_var, $ps_suggested_preds$.getDynamicValue(thread)), thread);
                                            }
                                            item_var = pred;
                                            if (NIL == member(item_var, $ps_suggested_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                $ps_suggested_inverses$.setDynamicValue(cons(item_var, $ps_suggested_inverses$.getDynamicValue(thread)), thread);
                                            }
                                        }





                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if ((NIL != $ps_typed_inverses$.getDynamicValue(thread)) || (NIL != $ps_suggested_inverses$.getDynamicValue(thread))) {
                result = cons(list($$genlInverse, cconcatenate($ps_typed_inverses$.getDynamicValue(thread), $ps_suggested_inverses$.getDynamicValue(thread))), result);
            }
            if ((NIL != $ps_typed_preds$.getDynamicValue(thread)) || (NIL != $ps_suggested_preds$.getDynamicValue(thread))) {
                result = cons(list($$genlPreds, cconcatenate($ps_typed_preds$.getDynamicValue(thread), $ps_suggested_preds$.getDynamicValue(thread))), result);
            }
        } finally {
            $ps_suggested_preds$.rebind(_prev_bind_4, thread);
            $ps_suggested_inverses$.rebind(_prev_bind_3, thread);
            $ps_typed_inverses$.rebind(_prev_bind_2, thread);
            $ps_typed_preds$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * return the leaves of typed-spec-pred/inverse graphs from pred
     *
     * @param PREDICATE
    predicate
     * 		
     * @param ALIST
     * 		alist; a list containing the constraints on the arguments to PRED in some formula
     * @return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are
    in that relation to PRED.
     */
    @LispMethod(comment = "return the leaves of typed-spec-pred/inverse graphs from pred\r\n\r\n@param PREDICATE\npredicate\r\n\t\t\r\n@param ALIST\r\n\t\talist; a list containing the constraints on the arguments to PRED in some formula\r\n@return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are\r\nin that relation to PRED.")
    public static final SubLObject strengthen_predicate_wXtyped_links_only_alt(SubLObject predicate, SubLObject alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, NIL);
                {
                    SubLObject _prev_bind_0 = $ps_typed_inverses$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $ps_typed_preds$.currentBinding(thread);
                    try {
                        $ps_typed_inverses$.bind(NIL, thread);
                        $ps_typed_preds$.bind(NIL, thread);
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject marking = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (pred != predicate) {
                                        if (predicate_strengthener_internals.pred_streng_marking_suggested_count(marking) == ZERO_INTEGER) {
                                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue()) {
                                                {
                                                    SubLObject item_var = pred;
                                                    if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                                    }
                                                }
                                            } else {
                                                if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue()) {
                                                    {
                                                        SubLObject item_var = pred;
                                                        if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                                        }
                                                    }
                                                } else {
                                                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking) == sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) {
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                        {
                                                            SubLObject item_var = pred;
                                                            if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            if (NIL != $ps_typed_inverses$.getDynamicValue(thread)) {
                                result = cons(list($$genlInverse, $ps_typed_inverses$.getDynamicValue(thread)), result);
                            }
                            if (NIL != $ps_typed_preds$.getDynamicValue(thread)) {
                                result = cons(list($$genlPreds, $ps_typed_preds$.getDynamicValue(thread)), result);
                            }
                        }
                    } finally {
                        $ps_typed_preds$.rebind(_prev_bind_1, thread);
                        $ps_typed_inverses$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "return the leaves of typed-spec-pred/inverse graphs from pred\r\n\r\n@param PREDICATE\n\t\tpredicate\r\n\t\t\r\n@param ALIST\r\n\t\talist; a list containing the constraints on the arguments to PRED in some formula\r\n@return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are\r\nin that relation to PRED.")
    public static SubLObject strengthen_predicate_wXtyped_links_only(final SubLObject predicate, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds(predicate, alist, NIL);
        final SubLObject _prev_bind_0 = $ps_typed_inverses$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ps_typed_preds$.currentBinding(thread);
        try {
            $ps_typed_inverses$.bind(NIL, thread);
            $ps_typed_preds$.bind(NIL, thread);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_streng_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject marking = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((!pred.eql(predicate)) && predicate_strengthener_internals.pred_streng_marking_suggested_count(marking).eql(ZERO_INTEGER)) {
                    if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
                        final SubLObject item_var = pred;
                        if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                            $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                        }
                    } else
                        if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
                            final SubLObject item_var = pred;
                            if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                            }
                        } else
                            if (predicate_strengthener_internals.pred_streng_marking_mode(marking).eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue())) {
                                SubLObject item_var = pred;
                                if (NIL == member(item_var, $ps_typed_preds$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    $ps_typed_preds$.setDynamicValue(cons(item_var, $ps_typed_preds$.getDynamicValue(thread)), thread);
                                }
                                item_var = pred;
                                if (NIL == member(item_var, $ps_typed_inverses$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    $ps_typed_inverses$.setDynamicValue(cons(item_var, $ps_typed_inverses$.getDynamicValue(thread)), thread);
                                }
                            }


                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if (NIL != $ps_typed_inverses$.getDynamicValue(thread)) {
                result = cons(list($$genlInverse, $ps_typed_inverses$.getDynamicValue(thread)), result);
            }
            if (NIL != $ps_typed_preds$.getDynamicValue(thread)) {
                result = cons(list($$genlPreds, $ps_typed_preds$.getDynamicValue(thread)), result);
            }
        } finally {
            $ps_typed_preds$.rebind(_prev_bind_2, thread);
            $ps_typed_inverses$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * return the leaves of typed-spec-pred/inverse graphs from pred
     *
     * @param PREDICATE
    		predicate
     * 		
     * @param ALIST
     * 		alist; a list containing the constraints on the arguments to PRED in some formula
     * @return list; an alist with the type of relation (genlPreds/genlInverse, as well as the predicates that are
    in that relation to PRED.
     */


    public static final SubLObject passes_pred_strengthening_test_alt(SubLObject in_form, SubLObject mt, SubLObject out_forms) {
        {
            SubLObject strengthened_formulas = pred_strengthen_formula(in_form, mt, UNPROVIDED);
            if (NIL == list_utilities.lengthE(strengthened_formulas, length(out_forms), UNPROVIDED)) {
                return format(NIL, $str_alt115$Error_in_processing__A__result_co, new SubLObject[]{ in_form, strengthened_formulas, out_forms });
            }
            {
                SubLObject cdolist_list_var = strengthened_formulas;
                SubLObject strengthened_formula = NIL;
                for (strengthened_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strengthened_formula = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(strengthened_formula, out_forms, $sym116$EQUALS_EL_, UNPROVIDED)) {
                        return format(NIL, $str_alt117$_A___not_found_in_expected_result, strengthened_formula, in_form);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject passes_pred_strengthening_test(final SubLObject in_form, final SubLObject mt, final SubLObject out_forms) {
        final SubLObject strengthened_formulas = pred_strengthen_formula(in_form, mt, UNPROVIDED);
        if (NIL == list_utilities.lengthE(strengthened_formulas, length(out_forms), UNPROVIDED)) {
            return format(NIL, $str119$Error_in_processing__A__result_co, new SubLObject[]{ in_form, strengthened_formulas, out_forms });
        }
        SubLObject cdolist_list_var = strengthened_formulas;
        SubLObject strengthened_formula = NIL;
        strengthened_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(strengthened_formula, out_forms, $sym120$EQUALS_EL_, UNPROVIDED)) {
                return format(NIL, $str121$_A___not_found_in_expected_result, strengthened_formula, in_form);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strengthened_formula = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject passes_narty_pred_strengthening_test_alt(SubLObject in_form, SubLObject mt, SubLObject out_forms) {
        {
            SubLObject strengthened_formulas = pred_strengthen_formula(narts_high.nart_substitute(in_form), mt, UNPROVIDED);
            if (NIL == list_utilities.lengthE(strengthened_formulas, length(out_forms), UNPROVIDED)) {
                return format(NIL, $str_alt115$Error_in_processing__A__result_co, new SubLObject[]{ in_form, strengthened_formulas, out_forms });
            }
            {
                SubLObject cdolist_list_var = strengthened_formulas;
                SubLObject strengthened_formula = NIL;
                for (strengthened_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , strengthened_formula = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(strengthened_formula, out_forms, $sym116$EQUALS_EL_, UNPROVIDED)) {
                        return format(NIL, $str_alt117$_A___not_found_in_expected_result, strengthened_formula, in_form);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject passes_narty_pred_strengthening_test(final SubLObject in_form, final SubLObject mt, final SubLObject out_forms) {
        final SubLObject strengthened_formulas = pred_strengthen_formula(narts_high.nart_substitute(in_form), mt, UNPROVIDED);
        if (NIL == list_utilities.lengthE(strengthened_formulas, length(out_forms), UNPROVIDED)) {
            return format(NIL, $str119$Error_in_processing__A__result_co, new SubLObject[]{ in_form, strengthened_formulas, out_forms });
        }
        SubLObject cdolist_list_var = strengthened_formulas;
        SubLObject strengthened_formula = NIL;
        strengthened_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(strengthened_formula, out_forms, $sym120$EQUALS_EL_, UNPROVIDED)) {
                return format(NIL, $str121$_A___not_found_in_expected_result, strengthened_formula, in_form);
            }
            cdolist_list_var = cdolist_list_var.rest();
            strengthened_formula = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject declare_predicate_strengthener_file() {
        declareFunction("max_pred_strengs", "MAX-PRED-STRENGS", 0, 0, false);
        declareFunction("skip_pred_strengthening_for_formulaP", "SKIP-PRED-STRENGTHENING-FOR-FORMULA?", 1, 0, false);
        declareFunction("pred_strengthen_formula", "PRED-STRENGTHEN-FORMULA", 2, 1, false);
        declareFunction("typed_pred_strengthen_formula", "TYPED-PRED-STRENGTHEN-FORMULA", 2, 1, false);
        declareFunction("typed_pred_strengthen_formula_unambiguously", "TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY", 2, 1, false);
        declareFunction("formula_predicate_strengthen", "FORMULA-PREDICATE-STRENGTHEN", 2, 0, false);
        declareFunction("formula_predicate_strengthen_with_constraints", "FORMULA-PREDICATE-STRENGTHEN-WITH-CONSTRAINTS", 3, 0, false);
        declareFunction("strengthen_predicate_with_constraints", "STRENGTHEN-PREDICATE-WITH-CONSTRAINTS", 3, 1, false);
        declareFunction("gather_subformula_pieces", "GATHER-SUBFORMULA-PIECES", 2, 0, false);
        declareFunction("expand_formula_with_stronger_predicates", "EXPAND-FORMULA-WITH-STRONGER-PREDICATES", 2, 1, false);
        declareFunction("predstren_substitute_stronger_predicates", "PREDSTREN-SUBSTITUTE-STRONGER-PREDICATES", 4, 0, false);
        declareFunction("predstren_get_rmp_subformulas", "PREDSTREN-GET-RMP-SUBFORMULAS", 1, 1, false);
        declareFunction("predstren_get_expandable_subformulas", "PREDSTREN-GET-EXPANDABLE-SUBFORMULAS", 1, 1, false);
        declareFunction("predstren_expand_formula_internal", "PREDSTREN-EXPAND-FORMULA-INTERNAL", 1, 1, false);
        declareFunction("predstren_expand_formula", "PREDSTREN-EXPAND-FORMULA", 1, 1, false);
        declareFunction("predstren_expandible_expressionP", "PREDSTREN-EXPANDIBLE-EXPRESSION?", 1, 0, false);
        declareFunction("predstren_expandible_rmpP", "PREDSTREN-EXPANDIBLE-RMP?", 1, 0, false);
        declareFunction("predstren_expandible_srfP", "PREDSTREN-EXPANDIBLE-SRF?", 1, 0, false);
        declareFunction("predstren_expand_one_step", "PREDSTREN-EXPAND-ONE-STEP", 1, 1, false);
        declareFunction("reformulator_rules_to_use", "REFORMULATOR-RULES-TO-USE", 0, 0, false);
        declareFunction("initialize_reformulator_rules_to_use", "INITIALIZE-REFORMULATOR-RULES-TO-USE", 0, 0, false);
        declareFunction("reformulator_rules_to_ignore", "REFORMULATOR-RULES-TO-IGNORE", 0, 0, false);
        declareFunction("initialize_reformulator_rules_to_ignore", "INITIALIZE-REFORMULATOR-RULES-TO-IGNORE", 0, 0, false);
        declareFunction("predstren_contract_formula", "PREDSTREN-CONTRACT-FORMULA", 1, 1, false);
        declareFunction("predstren_extend_formula_from_constraints", "PREDSTREN-EXTEND-FORMULA-FROM-CONSTRAINTS", 2, 0, false);
        declareFunction("predstren_handle_is_underspecified", "PREDSTREN-HANDLE-IS-UNDERSPECIFIED", 3, 0, false);
        declareFunction("predstren_interpret_is", "PREDSTREN-INTERPRET-IS", 2, 0, false);
        declareFunction("predstren_crack_alist", "PREDSTREN-CRACK-ALIST", 1, 0, false);
        declareFunction("predstren_is_means_isaP", "PREDSTREN-IS-MEANS-ISA?", 5, 0, false);
        declareFunction("predstren_is_means_equalsP", "PREDSTREN-IS-MEANS-EQUALS?", 5, 0, false);
        declareFunction("predstren_is_means_elementofP", "PREDSTREN-IS-MEANS-ELEMENTOF?", 5, 0, false);
        declareFunction("predstren_terms_tester", "PREDSTREN-TERMS-TESTER", 3, 0, false);
        declareFunction("constraint_print_function_trampoline", "CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("constraint_p", "CONSTRAINT-P", 1, 0, false);
        new predicate_strengthener.$constraint_p$UnaryFunction();
        declareFunction("constraint_variable", "CONSTRAINT-VARIABLE", 1, 0, false);
        declareFunction("constraint_isa_list", "CONSTRAINT-ISA-LIST", 1, 0, false);
        declareFunction("constraint_genl_list", "CONSTRAINT-GENL-LIST", 1, 0, false);
        declareFunction("_csetf_constraint_variable", "_CSETF-CONSTRAINT-VARIABLE", 2, 0, false);
        declareFunction("_csetf_constraint_isa_list", "_CSETF-CONSTRAINT-ISA-LIST", 2, 0, false);
        declareFunction("_csetf_constraint_genl_list", "_CSETF-CONSTRAINT-GENL-LIST", 2, 0, false);
        declareFunction("make_constraint", "MAKE-CONSTRAINT", 0, 1, false);
        declareFunction("visit_defstruct_constraint", "VISIT-DEFSTRUCT-CONSTRAINT", 2, 0, false);
        declareFunction("visit_defstruct_object_constraint_method", "VISIT-DEFSTRUCT-OBJECT-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction("new_constraint", "NEW-CONSTRAINT", 1, 0, false);
        declareFunction("invalid_constraintP", "INVALID-CONSTRAINT?", 1, 0, false);
        declareFunction("print_constraint", "PRINT-CONSTRAINT", 3, 0, false);
        declareFunction("constraint_as_alist", "CONSTRAINT-AS-ALIST", 1, 0, false);
        declareFunction("convert_isa_and_genl_list_to_alist", "CONVERT-ISA-AND-GENL-LIST-TO-ALIST", 2, 0, false);
        declareFunction("collection_subset_fn_nat_p", "COLLECTION-SUBSET-FN-NAT-P", 1, 0, false);
        declareFunction("collection_subset_fn_nart_p", "COLLECTION-SUBSET-FN-NART-P", 1, 0, false);
        declareFunction("collection_subset_fn_naut_p", "COLLECTION-SUBSET-FN-NAUT-P", 1, 0, false);
        declareFunction("collection_subset_fn_nat_subset_formula", "COLLECTION-SUBSET-FN-NAT-SUBSET-FORMULA", 1, 0, false);
        declareFunction("predstren_get_inter_formula_variables_arg_constraints", "PREDSTREN-GET-INTER-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 0, false);
        declareFunction("predstren_expand_collection_subset_fn_narts_internal", "PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS-INTERNAL", 1, 0, false);
        declareFunction("predstren_expand_collection_subset_fn_narts", "PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS", 1, 0, false);
        declareFunction("predstren_compute_constraints", "PREDSTREN-COMPUTE-CONSTRAINTS", 2, 0, false);
        declareFunction("predstren_get_typegenl_constraints", "PREDSTREN-GET-TYPEGENL-CONSTRAINTS", 1, 0, false);
        declareFunction("predstren_normalize_constraints", "PREDSTREN-NORMALIZE-CONSTRAINTS", 1, 0, false);
        declareFunction("predstren_restructure_constraints", "PREDSTREN-RESTRUCTURE-CONSTRAINTS", 1, 0, false);
        declareFunction("predstren_cache_constraints", "PREDSTREN-CACHE-CONSTRAINTS", 2, 0, false);
        declareFunction("predstren_extend_constraint_cache", "PREDSTREN-EXTEND-CONSTRAINT-CACHE", 4, 0, false);
        declareFunction("predstren_collect_predicates", "PREDSTREN-COLLECT-PREDICATES", 2, 0, false);
        declareFunction("predstren_identify_predicate", "PREDSTREN-IDENTIFY-PREDICATE", 1, 0, false);
        declareFunction("predstren_analyze_options", "PREDSTREN-ANALYZE-OPTIONS", 3, 0, false);
        declareFunction("predstren_analyze_one_option", "PREDSTREN-ANALYZE-ONE-OPTION", 3, 0, false);
        declareFunction("predstren_sort_by_arg_specs", "PREDSTREN-SORT-BY-ARG-SPECS", 2, 0, false);
        declareFunction("constraint_from_fort_as_alist", "CONSTRAINT-FROM-FORT-AS-ALIST", 2, 0, false);
        declareFunction("constraint_from_listy_as_alist", "CONSTRAINT-FROM-LISTY-AS-ALIST", 2, 0, false);
        declareFunction("constraint_from_object_as_alist", "CONSTRAINT-FROM-OBJECT-AS-ALIST", 2, 0, false);
        declareFunction("min_isa_via_deffns", "MIN-ISA-VIA-DEFFNS", 2, 0, false);
        declareFunction("predstren_extend_constraints_from_table", "PREDSTREN-EXTEND-CONSTRAINTS-FROM-TABLE", 2, 0, false);
        declareFunction("predstren_augment_one_constraint_set", "PREDSTREN-AUGMENT-ONE-CONSTRAINT-SET", 2, 0, false);
        declareFunction("strengthen_predicate_wXnew_pred_strengthener", "STRENGTHEN-PREDICATE-W/NEW-PRED-STRENGTHENER", 2, 0, false);
        declareMacro("push_pred_wXmarkingXtype", "PUSH-PRED-W/MARKING&TYPE");
        declareMacro("append_pred_wXmarking", "APPEND-PRED-W/MARKING");
        declareFunction("strengthen_predicate_wXtyped_and_minimal_suggestions", "STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS", 2, 0, false);
        declareFunction("strengthen_predicate_wXtyped_and_all_suggestions", "STRENGTHEN-PREDICATE-W/TYPED-AND-ALL-SUGGESTIONS", 2, 0, false);
        declareFunction("strengthen_predicate_wXtyped_links_only", "STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY", 2, 0, false);
        declareFunction("passes_pred_strengthening_test", "PASSES-PRED-STRENGTHENING-TEST", 3, 0, false);
        declareFunction("passes_narty_pred_strengthening_test", "PASSES-NARTY-PRED-STRENGTHENING-TEST", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_predicate_strengthener_file_alt() {
        defparameter("*STRENGTHEN-ORIGINAL-PRED-AWAY?*", NIL);
        defparameter("*PRED-STRENGTHEN-STOP-AT-FIRST-SPECIFIED-PRED*", NIL);
        defparameter("*PRED-STRENGTHENING-MAX-LITERAL-COUNT*", $POSITIVE_INFINITY);
        defparameter("*MAX-PRED-STRENGS*", NIL);
        defparameter("*PRED-STRENGTHENER-FN*", $sym4$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS);
        defparameter("*DO-NOT-STRENGTHEN-ISA?*", T);
        deflexical("*REFORMULATOR-RULES-TO-USE*", NIL != boundp($reformulator_rules_to_use$) ? ((SubLObject) ($reformulator_rules_to_use$.getGlobalValue())) : NIL);
        deflexical("*REFORMULATOR-RULES-TO-IGNORE*", NIL != boundp($reformulator_rules_to_ignore$) ? ((SubLObject) ($reformulator_rules_to_ignore$.getGlobalValue())) : NIL);
        defconstant("*DTP-CONSTRAINT*", CONSTRAINT);
        deflexical("*PREDSTREN-COMMON-UNINTERESTING*", $list_alt81);
        defvar("*PS-SUGGESTED-INVERSES*", NIL);
        defvar("*PS-SUGGESTED-PREDS*", NIL);
        defvar("*PS-TYPED-INVERSES*", NIL);
        defvar("*PS-TYPED-PREDS*", NIL);
        return NIL;
    }

    public static SubLObject init_predicate_strengthener_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*STRENGTHEN-ORIGINAL-PRED-AWAY?*", NIL);
            defparameter("*PRED-STRENGTHEN-STOP-AT-FIRST-SPECIFIED-PRED*", NIL);
            defparameter("*PRED-STRENGTHENING-MAX-LITERAL-COUNT*", $POSITIVE_INFINITY);
            defparameter("*MAX-PRED-STRENGS*", NIL);
            defparameter("*PRED-STRENGTHENER-FN*", $sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS);
            defparameter("*DO-NOT-STRENGTHEN-ISA?*", T);
            deflexical("*REFORMULATOR-RULES-TO-USE*", SubLTrampolineFile.maybeDefault($reformulator_rules_to_use$, $reformulator_rules_to_use$, NIL));
            deflexical("*REFORMULATOR-RULES-TO-IGNORE*", SubLTrampolineFile.maybeDefault($reformulator_rules_to_ignore$, $reformulator_rules_to_ignore$, NIL));
            defconstant("*DTP-CONSTRAINT*", CONSTRAINT);
            deflexical("*PREDSTREN-COMMON-UNINTERESTING*", $list85);
            defvar("*PS-SUGGESTED-INVERSES*", NIL);
            defvar("*PS-SUGGESTED-PREDS*", NIL);
            defvar("*PS-TYPED-INVERSES*", NIL);
            defvar("*PS-TYPED-PREDS*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*PRED-STRENGTHENER-FN*", $sym4$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS);
            deflexical("*REFORMULATOR-RULES-TO-USE*", NIL != boundp($reformulator_rules_to_use$) ? ((SubLObject) ($reformulator_rules_to_use$.getGlobalValue())) : NIL);
            deflexical("*REFORMULATOR-RULES-TO-IGNORE*", NIL != boundp($reformulator_rules_to_ignore$) ? ((SubLObject) ($reformulator_rules_to_ignore$.getGlobalValue())) : NIL);
            deflexical("*PREDSTREN-COMMON-UNINTERESTING*", $list_alt81);
        }
        return NIL;
    }

    public static SubLObject init_predicate_strengthener_file_Previous() {
        defparameter("*STRENGTHEN-ORIGINAL-PRED-AWAY?*", NIL);
        defparameter("*PRED-STRENGTHEN-STOP-AT-FIRST-SPECIFIED-PRED*", NIL);
        defparameter("*PRED-STRENGTHENING-MAX-LITERAL-COUNT*", $POSITIVE_INFINITY);
        defparameter("*MAX-PRED-STRENGS*", NIL);
        defparameter("*PRED-STRENGTHENER-FN*", $sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS);
        defparameter("*DO-NOT-STRENGTHEN-ISA?*", T);
        deflexical("*REFORMULATOR-RULES-TO-USE*", SubLTrampolineFile.maybeDefault($reformulator_rules_to_use$, $reformulator_rules_to_use$, NIL));
        deflexical("*REFORMULATOR-RULES-TO-IGNORE*", SubLTrampolineFile.maybeDefault($reformulator_rules_to_ignore$, $reformulator_rules_to_ignore$, NIL));
        defconstant("*DTP-CONSTRAINT*", CONSTRAINT);
        deflexical("*PREDSTREN-COMMON-UNINTERESTING*", $list85);
        defvar("*PS-SUGGESTED-INVERSES*", NIL);
        defvar("*PS-SUGGESTED-PREDS*", NIL);
        defvar("*PS-TYPED-INVERSES*", NIL);
        defvar("*PS-TYPED-PREDS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_predicate_strengthener_file_alt() {
        memoization_state.note_memoized_function(PREDSTREN_EXPAND_FORMULA);
        declare_defglobal($reformulator_rules_to_use$);
        declare_defglobal($reformulator_rules_to_ignore$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_constraint$.getGlobalValue(), symbol_function(CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CONSTRAINT_VARIABLE, _CSETF_CONSTRAINT_VARIABLE);
        def_csetf(CONSTRAINT_ISA_LIST, _CSETF_CONSTRAINT_ISA_LIST);
        def_csetf(CONSTRAINT_GENL_LIST, _CSETF_CONSTRAINT_GENL_LIST);
        identity(CONSTRAINT);
        memoization_state.note_memoized_function(PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS);
        define_test_case_table_int(PASSES_PRED_STRENGTHENING_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt126);
        define_test_case_table_int(PASSES_NARTY_PRED_STRENGTHENING_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt128);
        return NIL;
    }

    public static SubLObject setup_predicate_strengthener_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(PREDSTREN_EXPAND_FORMULA);
            declare_defglobal($reformulator_rules_to_use$);
            declare_defglobal($reformulator_rules_to_ignore$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_constraint$.getGlobalValue(), symbol_function(CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list54);
            def_csetf(CONSTRAINT_VARIABLE, _CSETF_CONSTRAINT_VARIABLE);
            def_csetf(CONSTRAINT_ISA_LIST, _CSETF_CONSTRAINT_ISA_LIST);
            def_csetf(CONSTRAINT_GENL_LIST, _CSETF_CONSTRAINT_GENL_LIST);
            identity(CONSTRAINT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD));
            memoization_state.note_memoized_function(PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS);
            define_test_case_table_int(PASSES_PRED_STRENGTHENING_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list129);
            define_test_case_table_int(PASSES_NARTY_PRED_STRENGTHENING_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list131);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(PASSES_PRED_STRENGTHENING_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt126);
            define_test_case_table_int(PASSES_NARTY_PRED_STRENGTHENING_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt128);
        }
        return NIL;
    }

    public static SubLObject setup_predicate_strengthener_file_Previous() {
        memoization_state.note_memoized_function(PREDSTREN_EXPAND_FORMULA);
        declare_defglobal($reformulator_rules_to_use$);
        declare_defglobal($reformulator_rules_to_ignore$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_constraint$.getGlobalValue(), symbol_function(CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list54);
        def_csetf(CONSTRAINT_VARIABLE, _CSETF_CONSTRAINT_VARIABLE);
        def_csetf(CONSTRAINT_ISA_LIST, _CSETF_CONSTRAINT_ISA_LIST);
        def_csetf(CONSTRAINT_GENL_LIST, _CSETF_CONSTRAINT_GENL_LIST);
        identity(CONSTRAINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD));
        memoization_state.note_memoized_function(PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS);
        define_test_case_table_int(PASSES_PRED_STRENGTHENING_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list129);
        define_test_case_table_int(PASSES_NARTY_PRED_STRENGTHENING_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list131);
        return NIL;
    }

    private static SubLObject _constant_129_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("inRegion"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("objectFoundInLocation"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))))), T), list(list(list(reader_make_constant_shell("relationInstanceExists"), reader_make_constant_shell("possessiveRelation"), reader_make_constant_shell("Lenat"), reader_make_constant_shell("PhDDegree")), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("relationInstanceExists"), reader_make_constant_shell("hasIssuedTo"), reader_make_constant_shell("Lenat"), reader_make_constant_shell("PhDDegree")))), T), list(list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("IntelligentAgent"), reader_make_constant_shell("AliceInWonderland-TheBook")), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("characterInCW"), reader_make_constant_shell("IntelligentAgent"), reader_make_constant_shell("AliceInWonderland-TheBook")))), T), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("is-Underspecified"), reader_make_constant_shell("BillClinton"), makeSymbol("?X")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("MaleAnimal")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("father"), reader_make_constant_shell("Animal"), makeSymbol("?X")))), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("father"), reader_make_constant_shell("Animal"), reader_make_constant_shell("BillClinton")))), T), list(list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("contains-Underspecified"), reader_make_constant_shell("Animal"), makeSymbol("?X")), list(reader_make_constant_shell("is-Underspecified"), reader_make_constant_shell("BillClinton"), makeSymbol("?X")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("MaleAnimal")))), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equals"), reader_make_constant_shell("BillClinton"), makeSymbol("?X")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("MaleAnimal")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("in-ContGeneric"), reader_make_constant_shell("Animal"), makeSymbol("?X")))), list(reader_make_constant_shell("thereExists"), makeSymbol("?X"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("equals"), reader_make_constant_shell("BillClinton"), makeSymbol("?X")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("MaleAnimal")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("constituents"), reader_make_constant_shell("Animal"), makeSymbol("?X")))))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State"))), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State"))))), T), list(list(list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")))), T), list(list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("in-UnderspecifiedContainer"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("inRegion"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("inRegion"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("objectFoundInLocation"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("objectFoundInLocation"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")))), T), list(list(list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("contains-Underspecified"), reader_make_constant_shell("Ribonucleotide"), reader_make_constant_shell("Ribose")), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("constituents"), reader_make_constant_shell("Ribonucleotide"), reader_make_constant_shell("Ribose")), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("in-ContGeneric"), reader_make_constant_shell("Ribonucleotide"), reader_make_constant_shell("Ribose")))), T) });
    }

    @Override
    public void declareFunctions() {
        declare_predicate_strengthener_file();
    }

    @Override
    public void initializeVariables() {
        init_predicate_strengthener_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_predicate_strengthener_file();
    }

    static {
    }

    public static final class $constraint_native extends SubLStructNative {
        public SubLObject $variable;

        public SubLObject $isa_list;

        public SubLObject $genl_list;

        private static final SubLStructDeclNative structDecl;

        public $constraint_native() {
            predicate_strengthener.$constraint_native.this.$variable = Lisp.NIL;
            predicate_strengthener.$constraint_native.this.$isa_list = Lisp.NIL;
            predicate_strengthener.$constraint_native.this.$genl_list = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return predicate_strengthener.$constraint_native.this.$variable;
        }

        @Override
        public SubLObject getField3() {
            return predicate_strengthener.$constraint_native.this.$isa_list;
        }

        @Override
        public SubLObject getField4() {
            return predicate_strengthener.$constraint_native.this.$genl_list;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return predicate_strengthener.$constraint_native.this.$variable = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return predicate_strengthener.$constraint_native.this.$isa_list = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return predicate_strengthener.$constraint_native.this.$genl_list = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.predicate_strengthener.$constraint_native.class, CONSTRAINT, CONSTRAINT_P, $list48, $list49, new String[]{ "$variable", "$isa_list", "$genl_list" }, $list50, $list51, PRINT_CONSTRAINT);
        }
    }

    public static final class $constraint_p$UnaryFunction extends UnaryFunction {
        public $constraint_p$UnaryFunction() {
            super(extractFunctionNamed("CONSTRAINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return constraint_p(arg1);
        }
    }

    static private final SubLString $str_alt3$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym4$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS = makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS");

    static private final SubLSymbol $sym5$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY = makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY");

    static private final SubLString $str_alt9$PredStren__no_contracted_version_ = makeString("PredStren: no contracted version for ~S~%");

    static private final SubLSymbol $sym14$PREDSTREN_EXPANDIBLE_RMP_ = makeSymbol("PREDSTREN-EXPANDIBLE-RMP?");

    static private final SubLSymbol $sym15$PREDSTREN_EXPANDIBLE_EXPRESSION_ = makeSymbol("PREDSTREN-EXPANDIBLE-EXPRESSION?");

    public static final SubLSymbol $kw20$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt29 = list(reader_make_constant_shell("reformulatorEquiv"), list(makeSymbol("?PRED"), makeSymbol("?THING"), makeSymbol("?VAR"), makeSymbol("?ROLE")), list(makeSymbol("?PRED"), makeSymbol("?THING"), makeSymbol("?VAR"), list(reader_make_constant_shell("CycLVariableFn"), makeSymbol("?ROLE"))));

    static private final SubLList $list_alt31 = list(makeSymbol("CYCL"), makeSymbol("MT"));

    static private final SubLList $list_alt39 = list(makeKeyword("WFF-ENFORCEMENT"), $NONE);

    static private final SubLList $list_alt40 = list(makeSymbol("TERM"), makeSymbol("ISAS"), makeSymbol("GENLS"));

    static private final SubLList $list_alt44 = list(reader_make_constant_shell("Individual"), reader_make_constant_shell("Collection"), reader_make_constant_shell("CollectionType"), reader_make_constant_shell("CollectionTypeType"));

    static private final SubLList $list_alt50 = list(makeSymbol("VARIABLE"), makeSymbol("ISA-LIST"), makeSymbol("GENL-LIST"));

    static private final SubLList $list_alt51 = list(makeKeyword("VARIABLE"), makeKeyword("ISA-LIST"), makeKeyword("GENL-LIST"));

    static private final SubLList $list_alt52 = list(makeSymbol("CONSTRAINT-VARIABLE"), makeSymbol("CONSTRAINT-ISA-LIST"), makeSymbol("CONSTRAINT-GENL-LIST"));

    static private final SubLList $list_alt53 = list(makeSymbol("_CSETF-CONSTRAINT-VARIABLE"), makeSymbol("_CSETF-CONSTRAINT-ISA-LIST"), makeSymbol("_CSETF-CONSTRAINT-GENL-LIST"));

    static private final SubLString $str_alt65$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt66$__Constraint___A_isa___A_genl___A = makeString("#<Constraint: ~A isa: ~A genl: ~A> ");

    static private final SubLList $list_alt76 = list(makeSymbol("FUNCTOR"), makeSymbol("VAR"), makeSymbol("TERM"));

    static private final SubLList $list_alt77 = list(reader_make_constant_shell("CycLVariable"));

    static private final SubLString $str_alt79$Non_binary_constraint_in_Predicat = makeString("Non-binary constraint in Predicate Strengthener: ~S");

    static private final SubLList $list_alt81 = list(reader_make_constant_shell("genlMt"), reader_make_constant_shell("thereExists"));

    static private final SubLList $list_alt83 = list(makeSymbol("HOW"), makeSymbol("PREDICATES"));

    static private final SubLSymbol $sym84$_ = makeSymbol("<");

    static private final SubLList $list_alt86 = list(reader_make_constant_shell("CycLSentence-Assertible"));

    static private final SubLList $list_alt96 = list(makeSymbol("PRED"), makeSymbol("MARKING"), makeSymbol("&OPTIONAL"), list(makeSymbol("PRED-TYPE"), makeKeyword("TYPED")));

    static private final SubLList $list_alt100 = list(makeSymbol("*SBHL-GENL-PREDS-MARKING*"));

    static private final SubLList $list_alt102 = list(makeSymbol("*PS-TYPED-PREDS*"));

    static private final SubLList $list_alt103 = list(makeSymbol("*SBHL-GENL-INVERSE-MARKING*"));

    static private final SubLList $list_alt104 = list(makeSymbol("*PS-TYPED-INVERSES*"));

    static private final SubLList $list_alt105 = list(makeSymbol("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*"));

    static private final SubLList $list_alt106 = list(makeSymbol("*PS-SUGGESTED-PREDS*"));

    static private final SubLList $list_alt107 = list(makeSymbol("*PS-SUGGESTED-INVERSES*"));

    static private final SubLList $list_alt108 = list(makeSymbol("PRED"), makeSymbol("MARKING"));

    static private final SubLSymbol $sym110$MEMBER_ = makeSymbol("MEMBER?");

    static private final SubLString $str_alt115$Error_in_processing__A__result_co = makeString("Error in processing ~A~%result count not equal to expected count ~%actual result: ~A~%Expected Result ~A~%");

    static private final SubLSymbol $sym116$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    static private final SubLString $str_alt117$_A___not_found_in_expected_result = makeString("~A~% not found in expected results for ~%~A~%");

    static private final SubLString $$$daves = makeString("daves");

    public static final SubLObject $list_alt126 = _constant_126_initializer();

    static private final SubLList $list_alt128 = list(list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))), reader_make_constant_shell("RKFParsingMt"), list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("inRegion"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), reader_make_constant_shell("Angola"), reader_make_constant_shell("Country")), list(reader_make_constant_shell("objectFoundInLocation"), reader_make_constant_shell("Angola"), list(reader_make_constant_shell("SouthWesternRegionFn"), reader_make_constant_shell("ContinentOfAfrica")))))), T), list(list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State"))), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State"))), list(reader_make_constant_shell("isa"), reader_make_constant_shell("GeorgeWBush"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State"))))), T), list(list(list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")))), T), list(list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("in-UnderspecifiedContainer"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("in-UnderspecifiedContainer"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("InferencePSC"), list(list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("inRegion"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("inRegion"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("objectFoundInLocation"), list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("inRegion"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")), list(reader_make_constant_shell("relationExistsInstance"), reader_make_constant_shell("objectFoundInLocation"), list(reader_make_constant_shell("SubcollectionByRegionFn"), reader_make_constant_shell("Person"), reader_make_constant_shell("Texas-State")), reader_make_constant_shell("Texas-State")))), T));
}

/**
 * Total time: 610 ms
 */
