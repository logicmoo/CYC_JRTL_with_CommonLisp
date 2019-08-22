package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_relation_instance_exists extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_relation_instance_exists();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_instance_exists";

    public static final String myFingerPrint = "98a4f2cc8a9baae65d418938ad512716b76c1a4da71a6236c4066a338b12ea4c";

    // deflexical
    private static final SubLSymbol $relation_instance_exists_rule$ = makeSymbol("*RELATION-INSTANCE-EXISTS-RULE*");



    // deflexical
    private static final SubLSymbol $default_relation_instance_exists_check_cost$ = makeSymbol("*DEFAULT-RELATION-INSTANCE-EXISTS-CHECK-COST*");

    // deflexical
    private static final SubLSymbol $minimum_relation_instance_exists_unify_cost$ = makeSymbol("*MINIMUM-RELATION-INSTANCE-EXISTS-UNIFY-COST*");

    // deflexical
    private static final SubLSymbol $relation_exists_instance_rule$ = makeSymbol("*RELATION-EXISTS-INSTANCE-RULE*");



    // deflexical
    private static final SubLSymbol $default_relation_exists_instance_check_cost$ = makeSymbol("*DEFAULT-RELATION-EXISTS-INSTANCE-CHECK-COST*");

    // deflexical
    private static final SubLSymbol $minimum_relation_exists_instance_unify_cost$ = makeSymbol("*MINIMUM-RELATION-EXISTS-INSTANCE-UNIFY-COST*");







    private static final SubLObject $$relationInstanceExists = reader_make_constant_shell(makeString("relationInstanceExists"));

    private static final SubLObject $$RelationInstanceExistsFn = reader_make_constant_shell(makeString("RelationInstanceExistsFn"));

    public static final SubLList $list5 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("relationInstanceExists")), makeSymbol("?PRED"), makeSymbol("?THING"), makeSymbol("?COLL")), list(makeSymbol("?PRED"), makeSymbol("?THING"), list(reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeSymbol("?PRED"), makeSymbol("?THING"), makeSymbol("?COLL"))));

    public static final SubLSymbol $relation_instance_exists_defining_mt$ = makeSymbol("*RELATION-INSTANCE-EXISTS-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));





    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_EXISTS_PRUNE = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE");

    public static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell(makeString("RelationInstanceExistsFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("@todo write this"), makeKeyword("EXAMPLE"), makeString("@todo write this") });

    public static final SubLList $list12 = list(makeKeyword("FORT"), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));

    public static final SubLList $list13 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(reader_make_constant_shell(makeString("RelationInstanceExistsFn")), list(makeKeyword("BIND"), makeSymbol("RIE-PRED")), list(makeKeyword("BIND"), makeSymbol("RIE-TERM")), list(makeKeyword("BIND"), makeSymbol("RIE-COL"))));

    public static final SubLSymbol RIE_COL = makeSymbol("RIE-COL");

    public static final SubLSymbol RIE_TERM = makeSymbol("RIE-TERM");

    public static final SubLSymbol RIE_PRED = makeSymbol("RIE-PRED");





    public static final SubLList $list19 = list(makeKeyword("FORT"), list(reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));

    public static final SubLList $list20 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(reader_make_constant_shell(makeString("RelationInstanceExistsFn")), list(makeKeyword("BIND"), makeSymbol("RIE-PRED")), list(makeKeyword("BIND"), makeSymbol("RIE-TERM")), list(makeKeyword("BIND"), makeSymbol("RIE-COL"))), list(makeKeyword("BIND"), makeSymbol("TERM")));











    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_EXISTS_CHECK = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-CHECK");

    public static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), list(reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("FORT"), list(reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-INSTANCE-EXISTS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> (#$RelationInstanceExistsFn <predicate> <object> <coll>)) \nwhere <object> is a TERM\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)\n\nor \n\n(<predicate> (#$RelationInstanceExistsFn <predicate> <object> <coll>) <object>) \nwhere <object> is a TERM\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)\n"), makeKeyword("EXAMPLE"), makeString("(#$owns #$Sean \n      (#$RelationInstanceExistsFn #$owns #$Sean #$Holster))\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)") });



    public static final SubLList $list29 = list(makeSymbol("SUPPORT-SENT"), makeSymbol("SUPPORT-MT"));

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG1 = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1");

    public static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>)\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG2 = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2");

    public static final SubLList $list33 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>)\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$owns #$Sean ?ITEM)\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)") });

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG1 = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1");

    public static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("VARIABLE")), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("ANYTHING"))))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <anything>)\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$owns ?WHO ?ITEM)\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)") });

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG2 = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2");

    public static final SubLList $list37 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <anything> <not fully-bound>)\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLObject $$relationExistsInstance = reader_make_constant_shell(makeString("relationExistsInstance"));

    private static final SubLObject $$RelationExistsInstanceFn = reader_make_constant_shell(makeString("RelationExistsInstanceFn"));

    public static final SubLList $list40 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("relationExistsInstance")), makeSymbol("?PRED"), makeSymbol("?COLL"), makeSymbol("?THING")), list(makeSymbol("?PRED"), list(reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeSymbol("?PRED"), makeSymbol("?COLL"), makeSymbol("?THING")), makeSymbol("?THING")));

    public static final SubLSymbol $relation_exists_instance_defining_mt$ = makeSymbol("*RELATION-EXISTS-INSTANCE-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_INSTANCE_PRUNE = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE");

    public static final SubLList $list43 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), reader_make_constant_shell(makeString("RelationExistsInstanceFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("@todo write this"), makeKeyword("EXAMPLE"), makeString("@todo write this") });

    public static final SubLList $list44 = list(makeKeyword("FORT"), list(reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));

    public static final SubLList $list45 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(reader_make_constant_shell(makeString("RelationExistsInstanceFn")), list(makeKeyword("BIND"), makeSymbol("REI-PRED")), list(makeKeyword("BIND"), makeSymbol("REI-COL")), list(makeKeyword("BIND"), makeSymbol("REI-TERM"))), list(makeKeyword("BIND"), makeSymbol("TERM")));

    public static final SubLSymbol REI_TERM = makeSymbol("REI-TERM");

    public static final SubLSymbol REI_COL = makeSymbol("REI-COL");

    public static final SubLSymbol REI_PRED = makeSymbol("REI-PRED");

    public static final SubLList $list49 = list(makeKeyword("FORT"), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));

    public static final SubLList $list50 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(reader_make_constant_shell(makeString("RelationExistsInstanceFn")), list(makeKeyword("BIND"), makeSymbol("REI-PRED")), list(makeKeyword("BIND"), makeSymbol("REI-COL")), list(makeKeyword("BIND"), makeSymbol("REI-TERM"))));

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_INSTANCE_CHECK = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-CHECK");

    public static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), list(reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), list(reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-EXISTS-INSTANCE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> (#$RelationExistsInstanceFn <predicate> <coll> <object>) <object>) \nfrom (#$relationExistsInstance <spec-predicate> <coll> <object>)\nand (#$genlPreds <spec-predicate> <predicate)\n\nor \n\n(<predicate> <object> (#$RelationExistsInstanceFn <predicate> <coll> <object>)) \nfrom (#$relationExistsInstance <inv-predicate> <coll> <object>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$inRegion (#$RelationExistsInstanceFn #$inRegion #$Subway #$CityOfMadridSpain)\n                #$CityOfMadridSpain)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)") });

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG1 = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1");

    public static final SubLList $list54 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>) \nfrom (#$relationExistsInstance <spec-predicate> <coll> <object>)\nand (#$genlPreds <spec-predicate> <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$inRegion ?WHAT #$CityOfMadridSpain)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)") });

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG2 = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2");

    public static final SubLList $list56 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>) \nfrom (#$relationExistsInstance <inv-predicate> <coll> <object>)\nand (#$genlInverse <inv-predicate> <predicate>"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG1 = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1");

    public static final SubLList $list58 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <anything>)\nfrom (#$relationExistsInstance <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG2 = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2");

    public static final SubLList $list60 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), makeKeyword("VARIABLE"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("FORT"), list(makeKeyword("NAT"), cons(reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("ANYTHING"))), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <anything> <not fully-bound>)\nfrom (#$relationExistsInstance <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$inRegion ?OBJ1 ?OBJ2)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)") });

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_EXISTS_VIA_EXEMPLAR = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR");

    public static final SubLList $list62 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("relationInstanceExists")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("relationInstanceExists")), makeKeyword("PREDICATE-FORT"), makeKeyword("FORT"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$relationInstanceExists <predicate> <term> <collection>) \nfrom (<spec-predicate> <term> <collection-instance>) \n(#$genlPreds <spec-predicate> <predicate>) \nand (#$isa <collection-instance> <collection>) \nor \nfrom (<inv-predicate> <collection-instance> <term>) \n(#$genlInverse <inv-predicate> <predicate>) \nand (#$isa <collection-instance> <collection>)\t       \n"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    public static final SubLSymbol $sym64$_INS = makeSymbol("?INS");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLList $list66 = list(makeSymbol("?INS"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLSymbol $REMOVAL_RELATION_EXISTS_INSTANCE_VIA_EXEMPLAR = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR");

    public static final SubLList $list70 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("relationExistsInstance")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("relationExistsInstance")), makeKeyword("PREDICATE-FORT"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$relationExistsInstance <predicate> <collection> <term>)\nfrom (<spec-predicate> <collection-instance> <term>)\n(#$genlPreds <spec-predicate> <predicate>)\nand (#$isa <collection-instance> <collection>)\nor\nfrom (<inv-predicate> <term> <collection-instance>)\n(#$genlInverse <inv-predicate> <predicate>)\nand (#$isa <collection-instance> <collection>)\t       \n"), makeKeyword("EXAMPLE"), makeString("") });

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_EXISTS_EXPANSION = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION");

    public static final SubLList $list72 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), list(reader_make_constant_shell(makeString("isa"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$and (<fort> <anything> <not-fully-bound-N>)\n           (#$isa <not-fully-bound-N> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$organismKilled ?EVENT ?PERSON)\n           (#$isa ?PERSON #$UnitedStatesPerson))") });

    public static final SubLList $list73 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));

    public static final SubLList $list74 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));

    public static final SubLList $list75 = list(makeSymbol("RIE-BINDINGS"), makeSymbol("RIE-JUST"));

    public static final SubLList $list76 = list(NIL);





    public static final SubLList $list79 = list(makeSymbol("CONTEXTUALIZED-ASENT1"), makeSymbol("CONTEXTUALIZED-ASENT2"));

    public static final SubLList $list80 = list(makeSymbol("MT2"), makeSymbol("ASENT2"));

    public static SubLObject some_relation_instance_for_predicate(final SubLObject relation_instance_pred, final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, relation_instance_pred, mt, ONE_INTEGER, UNPROVIDED)) {
            return T;
        }
        if (NIL != sksi_infrastructure_utilities.any_sksi_content_mt_relevantP()) {
            return sksi_tva_utilities.sksi_pred_and_relevance_p(relation_instance_pred);
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_support_direction_relevantP(final SubLObject support) {
        if ((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL != sksi_infrastructure_utilities.sksi_support_p(support))) {
            return NIL;
        }
        if ((NIL != assertion_handles.assertion_p(support)) && (NIL == backward_utilities.direction_is_relevant(support))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject removal_relation_instance_support_sentence(final SubLObject support) {
        return NIL != assertions_high.gaf_assertionP(support) ? assertions_high.gaf_formula(support) : arguments.hl_support_sentence(support);
    }

    public static SubLObject sksi_relation_instance_cost(final SubLObject rel_inst_pred) {
        SubLObject sksi_cost = ZERO_INTEGER;
        if (NIL != sksi_infrastructure_utilities.any_sksi_content_mt_relevantP()) {
            sksi_cost = sksi_sks_predicate_indexing.sksi_indexed_predicate_extent_count_in_relevant_mts(rel_inst_pred);
        }
        return sksi_cost;
    }

    public static SubLObject removal_all_spec_or_inverse_predicates(final SubLObject predicate, final SubLObject mode) {
        if (mode.eql($GENL_PREDS)) {
            return inference_trampolines.inference_all_spec_predicates(predicate);
        }
        if (mode.eql($GENL_INVERSE)) {
            return inference_trampolines.inference_all_spec_inverses(predicate);
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_instance_exists_for_predicate(final SubLObject predicate, final SubLObject mode, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (mode.eql($BOTH)) {
            return makeBoolean((NIL != some_relation_instance_exists_for_predicate_and_spec(predicate, mt)) || (NIL != some_relation_instance_exists_for_predicate_and_inverse(predicate, mt)));
        }
        if (mode.eql($GENL_PREDS)) {
            return some_relation_instance_exists_for_predicate_and_spec(predicate, mt);
        }
        if (mode.eql($GENL_INVERSE)) {
            return some_relation_instance_exists_for_predicate_and_inverse(predicate, mt);
        }
        return NIL;
    }

    public static SubLObject some_relation_instance_exists_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return some_relation_instance_for_predicate($$relationInstanceExists, predicate, mt);
    }

    public static SubLObject some_relation_instance_exists_for_predicate_and_spec(final SubLObject predicate, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject spec_predicates = cdolist_list_var = inference_trampolines.inference_all_spec_predicates(predicate);
        SubLObject spec_predicate = NIL;
        spec_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_relation_instance_exists_for_predicate(spec_predicate, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject some_relation_instance_exists_for_predicate_and_inverse(final SubLObject predicate, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject inv_predicates = cdolist_list_var = inference_trampolines.inference_all_spec_inverses(predicate);
        SubLObject inv_predicate = NIL;
        inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_relation_instance_exists_for_predicate(inv_predicate, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            inv_predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_required(final SubLObject asent, final SubLObject mode, final SubLObject require_new_terms_allowedP) {
        if ((NIL != require_new_terms_allowedP) && (NIL == removal_module_utilities.current_query_allows_new_termsP())) {
            return NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean(((NIL == hl_supports.hl_predicate_p(predicate)) && ((NIL == require_new_terms_allowedP) || (NIL != removal_modules_termofunit.skolemization_allowed($$RelationInstanceExistsFn)))) && (NIL != removal_some_relation_instance_exists_for_predicate(predicate, mode, NIL)));
    }

    public static SubLObject make_relation_instance_exists_support() {
        return arguments.make_hl_support($CODE, $relation_instance_exists_rule$.getGlobalValue(), $relation_instance_exists_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject make_relation_instance_exists_term(final SubLObject predicate, final SubLObject v_object, final SubLObject coll) {
        return list_to_elf(list($$RelationInstanceExistsFn, predicate, v_object, coll));
    }

    public static SubLObject removal_relation_instance_exists_prune(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != formula_pattern_match.pattern_matches_formula($list12, asent)) {
            final SubLObject pattern = $list13;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject rie_col = list_utilities.alist_lookup_without_values(v_bindings, RIE_COL, UNPROVIDED, UNPROVIDED);
                final SubLObject rie_term = list_utilities.alist_lookup_without_values(v_bindings, RIE_TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject rie_pred = list_utilities.alist_lookup_without_values(v_bindings, RIE_PRED, UNPROVIDED, UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, PREDICATE, UNPROVIDED, UNPROVIDED);
                if ((!rie_pred.eql(predicate)) && (NIL == genl_predicates.genl_predicateP(rie_pred, predicate, UNPROVIDED, UNPROVIDED))) {
                    return T;
                }
                if (NIL == unification.unify_possible(rie_term, v_term)) {
                    return T;
                }
            }
        } else {
            if (NIL == formula_pattern_match.pattern_matches_formula($list19, asent)) {
                return T;
            }
            final SubLObject pattern = $list20;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject rie_col = list_utilities.alist_lookup_without_values(v_bindings, RIE_COL, UNPROVIDED, UNPROVIDED);
                final SubLObject rie_term = list_utilities.alist_lookup_without_values(v_bindings, RIE_TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject rie_pred = list_utilities.alist_lookup_without_values(v_bindings, RIE_PRED, UNPROVIDED, UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, PREDICATE, UNPROVIDED, UNPROVIDED);
                if ((!rie_pred.eql(predicate)) && (NIL == genl_predicates.genl_inverseP(rie_pred, predicate, UNPROVIDED, UNPROVIDED))) {
                    return T;
                }
                if (NIL == unification.unify_possible(rie_term, v_term)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == removal_relation_instance_exists_required(asent, $BOTH, NIL)) {
            return NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL != el_formula_p(arg2)) && (NIL != cycl_utilities.formula_find($$RelationInstanceExistsFn, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject functor = unmake_ternary_formula(arg2);
            final SubLObject rie_pred = thread.secondMultipleValue();
            final SubLObject v_term = thread.thirdMultipleValue();
            final SubLObject coll = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((rie_pred.eql(predicate) || (NIL != genl_predicates.genl_predicateP(rie_pred, predicate, UNPROVIDED, UNPROVIDED))) && arg1.equal(v_term));
        }
        if ((NIL != el_formula_p(arg1)) && (NIL != cycl_utilities.formula_find($$RelationInstanceExistsFn, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject functor = unmake_ternary_formula(arg1);
            final SubLObject rie_pred = thread.secondMultipleValue();
            final SubLObject v_term = thread.thirdMultipleValue();
            final SubLObject coll = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((rie_pred.eql(predicate) || (NIL != genl_predicates.genl_inverseP(rie_pred, predicate, UNPROVIDED, UNPROVIDED))) && arg2.equal(v_term));
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject functor = NIL;
        SubLObject pred = NIL;
        SubLObject v_term = NIL;
        SubLObject coll = NIL;
        SubLObject mode = NIL;
        if ((NIL != el_formula_p(arg2)) && (NIL != cycl_utilities.formula_find($$RelationInstanceExistsFn, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject functor_$1 = unmake_ternary_formula(arg2);
            final SubLObject pred_$2 = thread.secondMultipleValue();
            final SubLObject v_term_$3 = thread.thirdMultipleValue();
            final SubLObject coll_$4 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            functor = functor_$1;
            pred = pred_$2;
            v_term = v_term_$3;
            coll = coll_$4;
            mode = $GENL_PREDS;
        } else
            if ((NIL != el_formula_p(arg1)) && (NIL != cycl_utilities.formula_find($$RelationInstanceExistsFn, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                thread.resetMultipleValues();
                final SubLObject functor_$2 = unmake_ternary_formula(arg1);
                final SubLObject pred_$3 = thread.secondMultipleValue();
                final SubLObject v_term_$4 = thread.thirdMultipleValue();
                final SubLObject coll_$5 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                functor = functor_$2;
                pred = pred_$3;
                v_term = v_term_$4;
                coll = coll_$5;
                mode = $GENL_INVERSE;
            }

        final SubLObject rie_sentence = list_to_elf(list($$relationInstanceExists, pred, v_term, coll));
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(rie_sentence, $POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term_$5 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate_$10 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate_$10) {
                    final SubLObject pred_var = predicate_$10;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$5, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$5, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$11 = NIL;
                                    final SubLObject token_var_$12 = NIL;
                                    while (NIL == done_var_$11) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                        final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(assertion));
                                        if (NIL != valid_$13) {
                                            removal_relation_instance_exists_check_expand_internal(predicate, v_term, coll, assertion, mode);
                                        }
                                        done_var_$11 = makeBoolean(NIL == valid_$13);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$5, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$5, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$12 = NIL;
                                    final SubLObject token_var_$13 = NIL;
                                    while (NIL == done_var_$12) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                        final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(assertion));
                                        if (NIL != valid_$14) {
                                            removal_relation_instance_exists_check_expand_internal(predicate, v_term, coll, assertion, mode);
                                        }
                                        done_var_$12 = makeBoolean(NIL == valid_$14);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate_$10) {
                    final SubLObject pred_var = predicate_$10;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$5, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$5, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$13 = NIL;
                                    final SubLObject token_var_$14 = NIL;
                                    while (NIL == done_var_$13) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$14);
                                        final SubLObject valid_$15 = makeBoolean(!token_var_$14.eql(assertion));
                                        if (NIL != valid_$15) {
                                            removal_relation_instance_exists_check_expand_internal(predicate, v_term, coll, assertion, mode);
                                        }
                                        done_var_$13 = makeBoolean(NIL == valid_$15);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$5, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$5, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$14 = NIL;
                                    final SubLObject token_var_$15 = NIL;
                                    while (NIL == done_var_$14) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        final SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(assertion));
                                        if (NIL != valid_$16) {
                                            removal_relation_instance_exists_check_expand_internal(predicate, v_term, coll, assertion, mode);
                                        }
                                        done_var_$14 = makeBoolean(NIL == valid_$16);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$15 = NIL;
                                    final SubLObject token_var_$16 = NIL;
                                    while (NIL == done_var_$15) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$16);
                                        final SubLObject valid_$17 = makeBoolean(!token_var_$16.eql(assertion2));
                                        if (NIL != valid_$17) {
                                            removal_relation_instance_exists_check_expand_internal(predicate, v_term, coll, assertion2, mode);
                                        }
                                        done_var_$15 = makeBoolean(NIL == valid_$17);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                            removal_relation_instance_exists_check_expand_internal(predicate, v_term, coll, assertion3, mode);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_lookup_index(rie_sentence, $POS);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject support_$27 = support;
            removal_relation_instance_exists_check_expand_internal(predicate, v_term, coll, support_$27, mode);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_check_expand_internal(final SubLObject pred, final SubLObject v_term, final SubLObject coll, final SubLObject support, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == removal_relation_instance_support_direction_relevantP(support)) {
            return NIL;
        }
        final SubLObject support_sent = removal_relation_instance_support_sentence(support);
        if (NIL != formula_arityE(support_sent, THREE_INTEGER, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject relation_instance_exists = unmake_ternary_formula(support_sent);
            final SubLObject gaf_pred = thread.secondMultipleValue();
            final SubLObject gaf_obj = thread.thirdMultipleValue();
            final SubLObject gaf_coll = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if ((!gaf_obj.equal(v_term)) || (!gaf_coll.equal(coll))) {
                return NIL;
            }
            SubLObject more_supports = NIL;
            if (mode.eql($GENL_PREDS)) {
                if (gaf_pred.eql(pred) || (NIL != genl_predicates.genl_predicateP(gaf_pred, pred, UNPROVIDED, UNPROVIDED))) {
                    final SubLObject rule_support = make_relation_instance_exists_support();
                    final SubLObject genl_preds_supports = removal_module_utilities.additional_genl_preds_supports(gaf_pred, pred);
                    more_supports = listS(rule_support, genl_preds_supports);
                }
            } else
                if (mode.eql($GENL_INVERSE)) {
                    if (gaf_pred.eql(pred) || (NIL != genl_predicates.genl_inverseP(gaf_pred, pred, UNPROVIDED, UNPROVIDED))) {
                    }
                    final SubLObject rule_support = make_relation_instance_exists_support();
                    final SubLObject genl_inverse_supports = removal_module_utilities.additional_genl_inverse_supports(gaf_pred, pred);
                    more_supports = listS(rule_support, genl_inverse_supports);
                }

            backward.removal_add_node(support, NIL, more_supports);
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_unify_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_instance_exists_required(asent, $GENL_INVERSE, T);
    }

    public static SubLObject removal_relation_instance_exists_unify_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_instance_exists_required(asent, $GENL_PREDS, T);
    }

    public static SubLObject removal_relation_instance_exists_unify_cost(final SubLObject predicate, final SubLObject v_term, final SubLObject mode) {
        final SubLObject predicate_cost_estimate = relation_instance_exists_predicate_cost_estimate(predicate, mode, UNPROVIDED);
        final SubLObject object_cost_estimate = relation_instance_exists_object_cost_estimate(v_term, UNPROVIDED);
        return max($minimum_relation_instance_exists_unify_cost$.getGlobalValue(), min(predicate_cost_estimate, object_cost_estimate));
    }

    public static SubLObject removal_relation_instance_exists_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return removal_relation_instance_exists_unify_cost(predicate, v_term, $GENL_PREDS);
    }

    public static SubLObject removal_relation_instance_exists_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_relation_instance_exists_unify_cost(predicate, v_term, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_instance_exists_unify_expand(final SubLObject predicate, final SubLObject v_term, final SubLObject asent, final SubLObject mode) {
        final SubLObject predicate_cost_estimate = relation_instance_exists_predicate_cost_estimate(predicate, mode, NIL);
        final SubLObject object_cost_estimate = relation_instance_exists_object_cost_estimate(v_term, NIL);
        if (predicate_cost_estimate.numLE(object_cost_estimate)) {
            SubLObject cdolist_list_var;
            final SubLObject spec_inv_predicates = cdolist_list_var = removal_all_spec_or_inverse_predicates(predicate, mode);
            SubLObject spec_inv_predicate = NIL;
            spec_inv_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = $$relationInstanceExists;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(spec_inv_predicate, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(spec_inv_predicate, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$28 = NIL;
                                final SubLObject token_var_$29 = NIL;
                                while (NIL == done_var_$28) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                    final SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(assertion));
                                    if (NIL != valid_$30) {
                                        removal_relation_instance_exists_unify_via_predicate_expand(asent, assertion, v_term, mode);
                                    }
                                    done_var_$28 = makeBoolean(NIL == valid_$30);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_inv_predicate = cdolist_list_var.first();
            } 
        } else {
            final SubLObject pred_var2 = $$relationInstanceExists;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, TWO_INTEGER, pred_var2)) {
                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, TWO_INTEGER, pred_var2);
                SubLObject done_var2 = NIL;
                final SubLObject token_var2 = NIL;
                while (NIL == done_var2) {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                    if (NIL != valid2) {
                        SubLObject final_index_iterator2 = NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                            SubLObject done_var_$29 = NIL;
                            final SubLObject token_var_$30 = NIL;
                            while (NIL == done_var_$29) {
                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$30);
                                final SubLObject valid_$31 = makeBoolean(!token_var_$30.eql(assertion2));
                                if (NIL != valid_$31) {
                                    removal_relation_instance_exists_unify_via_object_expand(asent, assertion2, mode);
                                }
                                done_var_$29 = makeBoolean(NIL == valid_$31);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var2 = makeBoolean(NIL == valid2);
                } 
            }
        }
        SubLObject cdolist_list_var;
        final SubLObject spec_inv_predicates = cdolist_list_var = removal_all_spec_or_inverse_predicates(predicate, mode);
        SubLObject spec_inv_predicate = NIL;
        spec_inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$34 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index(spec_inv_predicate, ONE_INTEGER, $$relationInstanceExists, $TRUE);
            SubLObject gather_sentence_mt_pair = NIL;
            gather_sentence_mt_pair = cdolist_list_var_$34.first();
            while (NIL != cdolist_list_var_$34) {
                SubLObject current;
                final SubLObject datum = current = gather_sentence_mt_pair;
                SubLObject support_sent = NIL;
                SubLObject support_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list29);
                support_sent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list29);
                support_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject support = sksi_infrastructure_utilities.make_sksi_support(support_sent, support_mt);
                    removal_relation_instance_exists_unify_via_predicate_expand(asent, support, v_term, mode);
                } else {
                    cdestructuring_bind_error(datum, $list29);
                }
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                gather_sentence_mt_pair = cdolist_list_var_$34.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv_predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return removal_relation_instance_exists_unify_expand(predicate, v_term, asent, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_instance_exists_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_relation_instance_exists_unify_expand(predicate, v_term, asent, $GENL_PREDS);
    }

    public static SubLObject relation_instance_exists_sksi_cost() {
        return sksi_relation_instance_cost($$relationInstanceExists);
    }

    public static SubLObject relation_instance_exists_predicate_cost_estimate(final SubLObject predicate, final SubLObject mode, SubLObject include_sksiP) {
        if (include_sksiP == UNPROVIDED) {
            include_sksiP = T;
        }
        final SubLObject spec_inv_predicates = removal_all_spec_or_inverse_predicates(predicate, mode);
        SubLObject kb_cost = ZERO_INTEGER;
        final SubLObject sksi_cost = (NIL != include_sksiP) ? relation_instance_exists_sksi_cost() : ZERO_INTEGER;
        SubLObject cdolist_list_var = spec_inv_predicates;
        SubLObject spec_inv_predicate = NIL;
        spec_inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_relation_instance_exists_for_predicate(spec_inv_predicate, UNPROVIDED)) {
                kb_cost = add(kb_cost, kb_indexing.relevant_num_gaf_arg_index(spec_inv_predicate, ONE_INTEGER, $$relationInstanceExists));
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv_predicate = cdolist_list_var.first();
        } 
        return add(kb_cost, sksi_cost);
    }

    public static SubLObject relation_instance_exists_object_cost_estimate(final SubLObject v_object, SubLObject include_sksiP) {
        if (include_sksiP == UNPROVIDED) {
            include_sksiP = T;
        }
        if (NIL != indexed_term_p(v_object)) {
            return NIL != include_sksiP ? add(kb_indexing.relevant_num_gaf_arg_index(v_object, TWO_INTEGER, $$relationInstanceExists), relation_instance_exists_sksi_cost()) : kb_indexing.relevant_num_gaf_arg_index(v_object, TWO_INTEGER, $$relationInstanceExists);
        }
        return $most_positive_fixnum$.getGlobalValue();
    }

    public static SubLObject removal_relation_instance_exists_unify_via_predicate_expand(final SubLObject asent, final SubLObject support, final SubLObject v_term, final SubLObject mode) {
        if (NIL != variables.fully_bound_p(v_term)) {
            final SubLObject support_sent = removal_relation_instance_support_sentence(support);
            if (!v_term.equal(cycl_utilities.atomic_sentence_arg2(support_sent, UNPROVIDED))) {
                return NIL;
            }
        }
        return removal_relation_instance_exists_unify_expand_guts(asent, support, mode);
    }

    public static SubLObject removal_relation_instance_exists_unify_via_object_expand(final SubLObject asent, final SubLObject assertion, final SubLObject mode) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject rie_pred = assertions_high.gaf_arg1(assertion);
        if (mode.eql($GENL_PREDS)) {
            if ((!rie_pred.eql(predicate)) && (NIL == genl_predicates.genl_predP(rie_pred, predicate, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
        } else
            if ((mode.eql($GENL_INVERSE) && (!rie_pred.eql(predicate))) && (NIL == genl_predicates.genl_inverseP(rie_pred, predicate, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }

        return removal_relation_instance_exists_unify_expand_guts(asent, assertion, mode);
    }

    public static SubLObject removal_relation_instance_exists_unify_expand_guts(final SubLObject asent, final SubLObject support, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == removal_relation_instance_support_direction_relevantP(support)) {
            return NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject support_sent = removal_relation_instance_support_sentence(support);
        final SubLObject rie_pred = cycl_utilities.atomic_sentence_arg1(support_sent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(support_sent, UNPROVIDED);
        final SubLObject coll = cycl_utilities.atomic_sentence_arg3(support_sent, UNPROVIDED);
        final SubLObject exists_term = make_relation_instance_exists_term(rie_pred, v_term, coll);
        SubLObject bound_asent = NIL;
        if (mode.eql($GENL_PREDS)) {
            bound_asent = list(predicate, v_term, exists_term);
        } else
            if (mode.eql($GENL_INVERSE)) {
                bound_asent = list(predicate, exists_term, v_term);
            }

        if (NIL != function_terms.within_term_functional_complexity_cutoffP(exists_term)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(asent, bound_asent, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject rule_support = make_relation_instance_exists_support();
                SubLObject pred_supports = NIL;
                SubLObject more_supports = NIL;
                if (mode.eql($GENL_PREDS)) {
                    pred_supports = removal_module_utilities.additional_genl_preds_supports(rie_pred, predicate);
                } else
                    if (mode.eql($GENL_INVERSE)) {
                        pred_supports = removal_module_utilities.additional_genl_inverse_supports(rie_pred, predicate);
                    }

                more_supports = append(list(rule_support), pred_supports, unify_justification);
                backward.removal_add_node(support, v_bindings, more_supports);
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_unbound_required(final SubLObject asent, final SubLObject mode) {
        return removal_relation_instance_exists_required(asent, mode, T);
    }

    public static SubLObject removal_relation_instance_exists_unbound_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_instance_exists_unbound_required(asent, $GENL_PREDS);
    }

    public static SubLObject removal_relation_instance_exists_unbound_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_instance_exists_unbound_required(asent, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_instance_exists_unbound_cost(final SubLObject asent, final SubLObject mode) {
        return relation_instance_exists_predicate_cost_estimate(cycl_utilities.atomic_sentence_predicate(asent), mode, UNPROVIDED);
    }

    public static SubLObject removal_relation_instance_exists_unbound_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_instance_exists_unbound_cost(asent, $GENL_PREDS);
    }

    public static SubLObject removal_relation_instance_exists_unbound_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_instance_exists_unbound_cost(asent, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_instance_exists_unbound_expand(final SubLObject asent, final SubLObject mode) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject v_term = NIL;
        final SubLObject spec_inv_predicates = removal_all_spec_or_inverse_predicates(predicate, mode);
        if (mode.eql($GENL_PREDS)) {
            v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        } else
            if (mode.eql($GENL_INVERSE)) {
                v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            }

        SubLObject cdolist_list_var = spec_inv_predicates;
        SubLObject spec_inv_predicate = NIL;
        spec_inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred_var = $$relationInstanceExists;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(spec_inv_predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(spec_inv_predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$35 = NIL;
                            final SubLObject token_var_$36 = NIL;
                            while (NIL == done_var_$35) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                final SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(assertion));
                                if (NIL != valid_$37) {
                                    removal_relation_instance_exists_unify_via_predicate_expand(asent, assertion, v_term, mode);
                                }
                                done_var_$35 = makeBoolean(NIL == valid_$37);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv_predicate = cdolist_list_var.first();
        } 
        cdolist_list_var = spec_inv_predicates;
        spec_inv_predicate = NIL;
        spec_inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$38 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index(spec_inv_predicate, ONE_INTEGER, $$relationInstanceExists, $TRUE);
            SubLObject gather_sentence_mt_pair = NIL;
            gather_sentence_mt_pair = cdolist_list_var_$38.first();
            while (NIL != cdolist_list_var_$38) {
                SubLObject current;
                final SubLObject datum = current = gather_sentence_mt_pair;
                SubLObject support_sent = NIL;
                SubLObject support_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list29);
                support_sent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list29);
                support_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject support = sksi_infrastructure_utilities.make_sksi_support(support_sent, support_mt);
                    removal_relation_instance_exists_unify_via_predicate_expand(asent, support, v_term, mode);
                } else {
                    cdestructuring_bind_error(datum, $list29);
                }
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                gather_sentence_mt_pair = cdolist_list_var_$38.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv_predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_unbound_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_instance_exists_unbound_expand(asent, $GENL_PREDS);
    }

    public static SubLObject removal_relation_instance_exists_unbound_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_instance_exists_unbound_expand(asent, $GENL_INVERSE);
    }

    public static SubLObject removal_some_relation_exists_instance_for_predicate(final SubLObject predicate, final SubLObject mode, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (mode.eql($BOTH)) {
            return makeBoolean((NIL != some_relation_exists_instance_for_predicate_and_spec(predicate, mt)) || (NIL != some_relation_exists_instance_for_predicate_and_inverse(predicate, mt)));
        }
        if (mode.eql($GENL_PREDS)) {
            return some_relation_exists_instance_for_predicate_and_spec(predicate, mt);
        }
        if (mode.eql($GENL_INVERSE)) {
            return some_relation_exists_instance_for_predicate_and_inverse(predicate, mt);
        }
        return NIL;
    }

    public static SubLObject some_relation_exists_instance_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return some_relation_instance_for_predicate($$relationExistsInstance, predicate, mt);
    }

    public static SubLObject some_relation_exists_instance_for_predicate_and_spec(final SubLObject predicate, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject spec_predicates = cdolist_list_var = inference_trampolines.inference_all_spec_predicates(predicate);
        SubLObject spec_predicate = NIL;
        spec_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_relation_exists_instance_for_predicate(spec_predicate, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject some_relation_exists_instance_for_predicate_and_inverse(final SubLObject predicate, final SubLObject mt) {
        SubLObject cdolist_list_var;
        final SubLObject inv_predicates = cdolist_list_var = inference_trampolines.inference_all_spec_inverses(predicate);
        SubLObject inv_predicate = NIL;
        inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_relation_exists_instance_for_predicate(inv_predicate, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            inv_predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_required(final SubLObject asent, final SubLObject mode, final SubLObject require_new_terms_allowedP) {
        if ((NIL != require_new_terms_allowedP) && (NIL == removal_module_utilities.current_query_allows_new_termsP())) {
            return NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean(((NIL == hl_supports.hl_predicate_p(predicate)) && ((NIL == require_new_terms_allowedP) || (NIL != removal_modules_termofunit.skolemization_allowed($$RelationExistsInstanceFn)))) && (NIL != removal_some_relation_exists_instance_for_predicate(predicate, mode, NIL)));
    }

    public static SubLObject make_relation_exists_instance_support() {
        return arguments.make_hl_support($CODE, $relation_exists_instance_rule$.getGlobalValue(), $relation_exists_instance_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject make_relation_exists_instance_term(final SubLObject predicate, final SubLObject coll, final SubLObject v_object) {
        return list_to_elf(list($$RelationExistsInstanceFn, predicate, coll, v_object));
    }

    public static SubLObject removal_relation_exists_instance_prune(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != formula_pattern_match.pattern_matches_formula($list44, asent)) {
            final SubLObject pattern = $list45;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject rei_term = list_utilities.alist_lookup_without_values(v_bindings, REI_TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject rei_col = list_utilities.alist_lookup_without_values(v_bindings, REI_COL, UNPROVIDED, UNPROVIDED);
                final SubLObject rei_pred = list_utilities.alist_lookup_without_values(v_bindings, REI_PRED, UNPROVIDED, UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, PREDICATE, UNPROVIDED, UNPROVIDED);
                if ((!rei_pred.eql(predicate)) && (NIL == genl_predicates.genl_predicateP(rei_pred, predicate, UNPROVIDED, UNPROVIDED))) {
                    return T;
                }
                if (NIL == unification.unify_possible(rei_term, v_term)) {
                    return T;
                }
            }
        } else {
            if (NIL == formula_pattern_match.pattern_matches_formula($list49, asent)) {
                return T;
            }
            final SubLObject pattern = $list50;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject rei_col2 = list_utilities.alist_lookup_without_values(v_bindings, REI_COL, UNPROVIDED, UNPROVIDED);
                final SubLObject rei_term2 = list_utilities.alist_lookup_without_values(v_bindings, REI_TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject rei_pred = list_utilities.alist_lookup_without_values(v_bindings, REI_PRED, UNPROVIDED, UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                final SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, PREDICATE, UNPROVIDED, UNPROVIDED);
                if ((!rei_pred.eql(predicate)) && (NIL == genl_predicates.genl_inverseP(rei_pred, predicate, UNPROVIDED, UNPROVIDED))) {
                    return T;
                }
                if (NIL == unification.unify_possible(rei_term2, v_term)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != removal_relation_exists_instance_required(asent, $BOTH, NIL)) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if ((NIL != el_formula_p(arg1)) && (NIL != cycl_utilities.formula_find($$RelationExistsInstanceFn, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                thread.resetMultipleValues();
                final SubLObject functor = unmake_ternary_formula(arg1);
                final SubLObject rei_pred = thread.secondMultipleValue();
                final SubLObject coll = thread.thirdMultipleValue();
                final SubLObject v_term = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((rei_pred.eql(predicate) || (NIL != genl_predicates.genl_predicateP(rei_pred, predicate, UNPROVIDED, UNPROVIDED))) && arg2.equal(v_term));
            }
            if ((NIL != el_formula_p(arg2)) && (NIL != cycl_utilities.formula_find($$RelationExistsInstanceFn, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                thread.resetMultipleValues();
                final SubLObject functor = unmake_ternary_formula(arg2);
                final SubLObject rei_pred = thread.secondMultipleValue();
                final SubLObject coll = thread.thirdMultipleValue();
                final SubLObject v_term = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((rei_pred.eql(predicate) || (NIL != genl_predicates.genl_inverseP(rei_pred, predicate, UNPROVIDED, UNPROVIDED))) && arg1.equal(v_term));
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject functor = NIL;
        SubLObject pred = NIL;
        SubLObject v_term = NIL;
        SubLObject coll = NIL;
        SubLObject mode = NIL;
        if ((NIL != el_formula_p(arg1)) && (NIL != cycl_utilities.formula_find($$RelationExistsInstanceFn, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject functor_$39 = unmake_ternary_formula(arg1);
            final SubLObject pred_$40 = thread.secondMultipleValue();
            final SubLObject coll_$41 = thread.thirdMultipleValue();
            final SubLObject v_term_$42 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            functor = functor_$39;
            pred = pred_$40;
            coll = coll_$41;
            v_term = v_term_$42;
            mode = $GENL_PREDS;
        } else
            if ((NIL != el_formula_p(arg2)) && (NIL != cycl_utilities.formula_find($$RelationExistsInstanceFn, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                thread.resetMultipleValues();
                final SubLObject functor_$40 = unmake_ternary_formula(arg2);
                final SubLObject pred_$41 = thread.secondMultipleValue();
                final SubLObject coll_$42 = thread.thirdMultipleValue();
                final SubLObject v_term_$43 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                functor = functor_$40;
                pred = pred_$41;
                coll = coll_$42;
                v_term = v_term_$43;
                mode = $GENL_INVERSE;
            }

        final SubLObject rei_sentence = list_to_elf(list($$relationExistsInstance, pred, coll, v_term));
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(rei_sentence, $POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term_$44 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate_$48 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate_$48) {
                    final SubLObject pred_var = predicate_$48;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$44, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$44, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$49 = NIL;
                                    final SubLObject token_var_$50 = NIL;
                                    while (NIL == done_var_$49) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$50);
                                        final SubLObject valid_$51 = makeBoolean(!token_var_$50.eql(assertion));
                                        if (NIL != valid_$51) {
                                            removal_relation_exists_instance_check_expand_internal(predicate, v_term, coll, assertion, mode);
                                        }
                                        done_var_$49 = makeBoolean(NIL == valid_$51);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$44, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$44, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$50 = NIL;
                                    final SubLObject token_var_$51 = NIL;
                                    while (NIL == done_var_$50) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                        final SubLObject valid_$52 = makeBoolean(!token_var_$51.eql(assertion));
                                        if (NIL != valid_$52) {
                                            removal_relation_exists_instance_check_expand_internal(predicate, v_term, coll, assertion, mode);
                                        }
                                        done_var_$50 = makeBoolean(NIL == valid_$52);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate_$48) {
                    final SubLObject pred_var = predicate_$48;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$44, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$44, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$51 = NIL;
                                    final SubLObject token_var_$52 = NIL;
                                    while (NIL == done_var_$51) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                                        final SubLObject valid_$53 = makeBoolean(!token_var_$52.eql(assertion));
                                        if (NIL != valid_$53) {
                                            removal_relation_exists_instance_check_expand_internal(predicate, v_term, coll, assertion, mode);
                                        }
                                        done_var_$51 = makeBoolean(NIL == valid_$53);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$44, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$44, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$52 = NIL;
                                    final SubLObject token_var_$53 = NIL;
                                    while (NIL == done_var_$52) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                        final SubLObject valid_$54 = makeBoolean(!token_var_$53.eql(assertion));
                                        if (NIL != valid_$54) {
                                            removal_relation_exists_instance_check_expand_internal(predicate, v_term, coll, assertion, mode);
                                        }
                                        done_var_$52 = makeBoolean(NIL == valid_$54);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$53 = NIL;
                                    final SubLObject token_var_$54 = NIL;
                                    while (NIL == done_var_$53) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$54);
                                        final SubLObject valid_$55 = makeBoolean(!token_var_$54.eql(assertion2));
                                        if (NIL != valid_$55) {
                                            removal_relation_exists_instance_check_expand_internal(predicate, v_term, coll, assertion2, mode);
                                        }
                                        done_var_$53 = makeBoolean(NIL == valid_$55);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL == enumeration_types.sense_truth($POS)) || (NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS)))) {
                            removal_relation_exists_instance_check_expand_internal(predicate, v_term, coll, assertion3, mode);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_lookup_index(rei_sentence, $POS);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject support_$65 = support;
            removal_relation_exists_instance_check_expand_internal(predicate, v_term, coll, support_$65, mode);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_check_expand_internal(final SubLObject pred, final SubLObject v_term, final SubLObject coll, final SubLObject support, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == removal_relation_instance_support_direction_relevantP(support)) {
            return NIL;
        }
        final SubLObject support_sent = removal_relation_instance_support_sentence(support);
        if (NIL != formula_arityE(support_sent, THREE_INTEGER, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject relation_exists_instance = unmake_ternary_formula(support_sent);
            final SubLObject gaf_pred = thread.secondMultipleValue();
            final SubLObject gaf_coll = thread.thirdMultipleValue();
            final SubLObject gaf_obj = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if ((!coll.equal(gaf_coll)) || (!v_term.equal(gaf_obj))) {
                return NIL;
            }
            SubLObject more_supports = NIL;
            if (mode.eql($GENL_PREDS)) {
                if (gaf_pred.eql(pred) || (NIL != genl_predicates.genl_predicateP(gaf_pred, pred, UNPROVIDED, UNPROVIDED))) {
                    final SubLObject rule_support = make_relation_exists_instance_support();
                    final SubLObject genl_preds_supports = removal_module_utilities.additional_genl_preds_supports(gaf_pred, pred);
                    more_supports = listS(rule_support, genl_preds_supports);
                }
            } else
                if (mode.eql($GENL_INVERSE) && (gaf_pred.eql(pred) || (NIL != genl_predicates.genl_inverseP(gaf_pred, pred, UNPROVIDED, UNPROVIDED)))) {
                    final SubLObject rule_support = make_relation_exists_instance_support();
                    final SubLObject genl_inverse_supports = removal_module_utilities.additional_genl_inverse_supports(gaf_pred, pred);
                    more_supports = listS(rule_support, genl_inverse_supports);
                }

            backward.removal_add_node(support, NIL, more_supports);
        }
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_unify_required(final SubLObject asent, final SubLObject mode) {
        return removal_relation_exists_instance_required(asent, mode, T);
    }

    public static SubLObject removal_relation_exists_instance_unify_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_exists_instance_unify_required(asent, $GENL_PREDS);
    }

    public static SubLObject removal_relation_exists_instance_unify_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_exists_instance_unify_required(asent, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_exists_instance_unify_cost(final SubLObject predicate, final SubLObject v_term, final SubLObject mode) {
        final SubLObject predicate_cost_estimate = relation_exists_instance_predicate_cost_estimate(predicate, mode, UNPROVIDED);
        final SubLObject object_cost_estimate = relation_exists_instance_object_cost_estimate(v_term, UNPROVIDED);
        return max($minimum_relation_exists_instance_unify_cost$.getGlobalValue(), min(predicate_cost_estimate, object_cost_estimate));
    }

    public static SubLObject removal_relation_exists_instance_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return removal_relation_exists_instance_unify_cost(predicate, v_term, $GENL_PREDS);
    }

    public static SubLObject removal_relation_exists_instance_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_relation_exists_instance_unify_cost(predicate, v_term, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_exists_instance_unify_expand(final SubLObject predicate, final SubLObject v_term, final SubLObject asent, final SubLObject mode) {
        final SubLObject predicate_cost_estimate = relation_exists_instance_predicate_cost_estimate(predicate, mode, NIL);
        final SubLObject object_cost_estimate = relation_exists_instance_object_cost_estimate(v_term, NIL);
        if (predicate_cost_estimate.numLE(object_cost_estimate)) {
            SubLObject cdolist_list_var;
            final SubLObject spec_inv_predicates = cdolist_list_var = removal_all_spec_or_inverse_predicates(predicate, mode);
            SubLObject spec_inv_predicate = NIL;
            spec_inv_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = $$relationExistsInstance;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(spec_inv_predicate, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(spec_inv_predicate, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$66 = NIL;
                                final SubLObject token_var_$67 = NIL;
                                while (NIL == done_var_$66) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                                    final SubLObject valid_$68 = makeBoolean(!token_var_$67.eql(assertion));
                                    if (NIL != valid_$68) {
                                        removal_relation_exists_instance_unify_via_predicate_expand(asent, assertion, v_term, mode);
                                    }
                                    done_var_$66 = makeBoolean(NIL == valid_$68);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_inv_predicate = cdolist_list_var.first();
            } 
        } else {
            final SubLObject pred_var2 = $$relationExistsInstance;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, THREE_INTEGER, pred_var2)) {
                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, THREE_INTEGER, pred_var2);
                SubLObject done_var2 = NIL;
                final SubLObject token_var2 = NIL;
                while (NIL == done_var2) {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                    if (NIL != valid2) {
                        SubLObject final_index_iterator2 = NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                            SubLObject done_var_$67 = NIL;
                            final SubLObject token_var_$68 = NIL;
                            while (NIL == done_var_$67) {
                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$68);
                                final SubLObject valid_$69 = makeBoolean(!token_var_$68.eql(assertion2));
                                if (NIL != valid_$69) {
                                    removal_relation_exists_instance_unify_via_object_expand(asent, assertion2, mode);
                                }
                                done_var_$67 = makeBoolean(NIL == valid_$69);
                            } 
                        } finally {
                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var2 = makeBoolean(NIL == valid2);
                } 
            }
        }
        SubLObject cdolist_list_var;
        final SubLObject spec_inv_predicates = cdolist_list_var = removal_all_spec_or_inverse_predicates(predicate, mode);
        SubLObject spec_inv_predicate = NIL;
        spec_inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$72 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index(spec_inv_predicate, ONE_INTEGER, $$relationExistsInstance, $TRUE);
            SubLObject gather_sentence_mt_pair = NIL;
            gather_sentence_mt_pair = cdolist_list_var_$72.first();
            while (NIL != cdolist_list_var_$72) {
                SubLObject current;
                final SubLObject datum = current = gather_sentence_mt_pair;
                SubLObject support_sent = NIL;
                SubLObject support_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list29);
                support_sent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list29);
                support_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject support = sksi_infrastructure_utilities.make_sksi_support(support_sent, support_mt);
                    removal_relation_exists_instance_unify_via_predicate_expand(asent, support, v_term, mode);
                } else {
                    cdestructuring_bind_error(datum, $list29);
                }
                cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                gather_sentence_mt_pair = cdolist_list_var_$72.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv_predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return removal_relation_exists_instance_unify_expand(predicate, v_term, asent, $GENL_PREDS);
    }

    public static SubLObject removal_relation_exists_instance_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_relation_exists_instance_unify_expand(predicate, v_term, asent, $GENL_INVERSE);
    }

    public static SubLObject relation_exists_instance_sksi_cost() {
        return sksi_relation_instance_cost($$relationExistsInstance);
    }

    public static SubLObject relation_exists_instance_predicate_cost_estimate(final SubLObject predicate, final SubLObject mode, SubLObject include_sksiP) {
        if (include_sksiP == UNPROVIDED) {
            include_sksiP = T;
        }
        final SubLObject spec_inv_predicates = removal_all_spec_or_inverse_predicates(predicate, mode);
        SubLObject kb_cost = ZERO_INTEGER;
        final SubLObject sksi_cost = (NIL != include_sksiP) ? relation_exists_instance_sksi_cost() : ZERO_INTEGER;
        SubLObject cdolist_list_var = spec_inv_predicates;
        SubLObject spec_inv_predicate = NIL;
        spec_inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_relation_exists_instance_for_predicate(spec_inv_predicate, UNPROVIDED)) {
                kb_cost = add(kb_cost, kb_indexing.relevant_num_gaf_arg_index(predicate, ONE_INTEGER, $$relationExistsInstance));
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv_predicate = cdolist_list_var.first();
        } 
        return add(kb_cost, sksi_cost);
    }

    public static SubLObject relation_exists_instance_object_cost_estimate(final SubLObject v_object, SubLObject include_sksiP) {
        if (include_sksiP == UNPROVIDED) {
            include_sksiP = T;
        }
        if (NIL != indexed_term_p(v_object)) {
            return NIL != include_sksiP ? add(kb_indexing.relevant_num_gaf_arg_index(v_object, THREE_INTEGER, $$relationExistsInstance), relation_exists_instance_sksi_cost()) : kb_indexing.relevant_num_gaf_arg_index(v_object, THREE_INTEGER, $$relationExistsInstance);
        }
        return $most_positive_fixnum$.getGlobalValue();
    }

    public static SubLObject removal_relation_exists_instance_unify_via_predicate_expand(final SubLObject asent, final SubLObject support, final SubLObject v_term, final SubLObject mode) {
        if (NIL != variables.fully_bound_p(v_term)) {
            final SubLObject support_sent = removal_relation_instance_support_sentence(support);
            if (!v_term.equal(cycl_utilities.atomic_sentence_arg3(support_sent, UNPROVIDED))) {
                return NIL;
            }
        }
        return removal_relation_exists_instance_unify_expand_guts(asent, support, mode);
    }

    public static SubLObject removal_relation_exists_instance_unify_via_object_expand(final SubLObject asent, final SubLObject assertion, final SubLObject mode) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject rei_pred = assertions_high.gaf_arg1(assertion);
        if (mode.eql($GENL_PREDS)) {
            if ((!rei_pred.eql(predicate)) && (NIL == genl_predicates.genl_predP(rei_pred, predicate, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
        } else
            if ((mode.eql($GENL_INVERSE) && (!rei_pred.eql(predicate))) && (NIL == genl_predicates.genl_inverseP(rei_pred, predicate, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }

        return removal_relation_exists_instance_unify_expand_guts(asent, assertion, mode);
    }

    public static SubLObject removal_relation_exists_instance_unify_expand_guts(final SubLObject asent, final SubLObject support, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == removal_relation_instance_support_direction_relevantP(support)) {
            return NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject support_sent = removal_relation_instance_support_sentence(support);
        final SubLObject rei_pred = cycl_utilities.atomic_sentence_arg1(support_sent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg3(support_sent, UNPROVIDED);
        final SubLObject coll = cycl_utilities.atomic_sentence_arg2(support_sent, UNPROVIDED);
        final SubLObject exists_term = make_relation_exists_instance_term(rei_pred, coll, v_term);
        SubLObject bound_asent = NIL;
        if (mode.eql($GENL_PREDS)) {
            bound_asent = list(predicate, exists_term, v_term);
        } else
            if (mode.eql($GENL_INVERSE)) {
                bound_asent = list(predicate, v_term, exists_term);
            }

        if (NIL != function_terms.within_term_functional_complexity_cutoffP(exists_term)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(asent, bound_asent, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject rule_support = make_relation_exists_instance_support();
                SubLObject pred_supports = NIL;
                SubLObject more_supports = NIL;
                if (mode.eql($GENL_PREDS)) {
                    pred_supports = removal_module_utilities.additional_genl_preds_supports(rei_pred, predicate);
                } else
                    if (mode.eql($GENL_INVERSE)) {
                        pred_supports = removal_module_utilities.additional_genl_inverse_supports(rei_pred, predicate);
                    }

                more_supports = append(list(rule_support), pred_supports, unify_justification);
                backward.removal_add_node(support, v_bindings, more_supports);
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_unbound_required(final SubLObject asent, final SubLObject mode) {
        return removal_relation_exists_instance_required(asent, mode, T);
    }

    public static SubLObject removal_relation_exists_instance_unbound_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_exists_instance_unbound_required(asent, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_exists_instance_unbound_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_exists_instance_unbound_required(asent, $GENL_PREDS);
    }

    public static SubLObject removal_relation_exists_instance_unbound_cost(final SubLObject asent, final SubLObject mode) {
        return relation_exists_instance_predicate_cost_estimate(cycl_utilities.atomic_sentence_predicate(asent), mode, UNPROVIDED);
    }

    public static SubLObject removal_relation_exists_instance_unbound_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_exists_instance_unbound_cost(asent, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_exists_instance_unbound_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_exists_instance_unbound_cost(asent, $GENL_PREDS);
    }

    public static SubLObject removal_relation_exists_instance_unbound_expand(final SubLObject asent, final SubLObject mode) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject v_term = NIL;
        final SubLObject spec_inv_predicates = removal_all_spec_or_inverse_predicates(predicate, mode);
        if (mode.eql($GENL_PREDS)) {
            v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        } else
            if (mode.eql($GENL_INVERSE)) {
                v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            }

        SubLObject cdolist_list_var = spec_inv_predicates;
        SubLObject spec_inv_predicate = NIL;
        spec_inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred_var = $$relationExistsInstance;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(spec_inv_predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(spec_inv_predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$73 = NIL;
                            final SubLObject token_var_$74 = NIL;
                            while (NIL == done_var_$73) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$74);
                                final SubLObject valid_$75 = makeBoolean(!token_var_$74.eql(assertion));
                                if (NIL != valid_$75) {
                                    removal_relation_exists_instance_unify_via_predicate_expand(asent, assertion, v_term, mode);
                                }
                                done_var_$73 = makeBoolean(NIL == valid_$75);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv_predicate = cdolist_list_var.first();
        } 
        cdolist_list_var = spec_inv_predicates;
        spec_inv_predicate = NIL;
        spec_inv_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$76 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index(spec_inv_predicate, ONE_INTEGER, $$relationExistsInstance, $TRUE);
            SubLObject gather_sentence_mt_pair = NIL;
            gather_sentence_mt_pair = cdolist_list_var_$76.first();
            while (NIL != cdolist_list_var_$76) {
                SubLObject current;
                final SubLObject datum = current = gather_sentence_mt_pair;
                SubLObject support_sent = NIL;
                SubLObject support_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list29);
                support_sent = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list29);
                support_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject support = sksi_infrastructure_utilities.make_sksi_support(support_sent, support_mt);
                    removal_relation_exists_instance_unify_via_predicate_expand(asent, support, v_term, mode);
                } else {
                    cdestructuring_bind_error(datum, $list29);
                }
                cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                gather_sentence_mt_pair = cdolist_list_var_$76.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec_inv_predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_unbound_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_exists_instance_unbound_expand(asent, $GENL_INVERSE);
    }

    public static SubLObject removal_relation_exists_instance_unbound_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_relation_exists_instance_unbound_expand(asent, $GENL_PREDS);
    }

    public static SubLObject removal_relation_instance_exists_via_exemplar_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject sentence = list($$thereExists, $sym64$_INS, list($$and, listS(predicate, v_term, $list66), list($$isa, $sym64$_INS, collection)));
        SubLObject cost = inference_utilities.literal_removal_cost(sentence, $POS, UNPROVIDED, UNPROVIDED);
        if (!cost.isZero()) {
            cost = add(cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        return cost;
    }

    public static SubLObject removal_relation_instance_exists_via_exemplar_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject sentence = list($$thereExists, $sym64$_INS, list($$and, listS(predicate, v_term, $list66), list($$isa, $sym64$_INS, collection)));
        if (NIL != removal_relation_instance_exists_via_exemplar_query(sentence, UNPROVIDED)) {
            final SubLObject hl_support = make_relation_instance_exists_via_exemplar_support(sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_exists_via_exemplar_query(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_true_sentence_recursive_query(sentence, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_relation_instance_exists_via_exemplar_support(final SubLObject sentence) {
        return arguments.make_hl_support($QUERY, sentence, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_relation_exists_instance_via_exemplar_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject sentence = list($$thereExists, $sym64$_INS, list($$and, list(predicate, $sym64$_INS, v_term), list($$isa, $sym64$_INS, collection)));
        SubLObject cost = inference_utilities.literal_removal_cost(sentence, $POS, UNPROVIDED, UNPROVIDED);
        if (!cost.isZero()) {
            cost = add(cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        return cost;
    }

    public static SubLObject removal_relation_exists_instance_via_exemplar_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject sentence = list($$thereExists, $sym64$_INS, list($$and, list(predicate, $sym64$_INS, v_term), list($$isa, $sym64$_INS, collection)));
        if (NIL != removal_relation_exists_instance_via_exemplar_query(sentence, UNPROVIDED)) {
            final SubLObject hl_support = make_relation_exists_instance_via_exemplar_support(sentence);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_relation_exists_instance_via_exemplar_query(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return inference_trampolines.inference_true_sentence_recursive_query(sentence, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_relation_exists_instance_via_exemplar_support(final SubLObject sentence) {
        return arguments.make_hl_support($QUERY, sentence, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_relation_instance_exists_expansion_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = NIL;
        if (NIL != removal_module_utilities.current_query_allows_new_termsP()) {
            SubLObject index0 = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject contextualized_asent0 = NIL;
            contextualized_asent0 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent0;
                SubLObject mt0 = NIL;
                SubLObject asent0 = NIL;
                destructuring_bind_must_consp(current, datum, $list73);
                mt0 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list73);
                asent0 = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject mt_var = mt0;
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if ($$isa.eql(cycl_utilities.atomic_sentence_predicate(asent0))) {
                            final SubLObject isa_arg1 = cycl_utilities.atomic_sentence_arg1(asent0, UNPROVIDED);
                            final SubLObject isa_arg2 = cycl_utilities.atomic_sentence_arg2(asent0, UNPROVIDED);
                            if ((NIL != variables.fully_bound_p(isa_arg2)) && (NIL != variables.not_fully_bound_p(isa_arg1))) {
                                SubLObject index2 = ZERO_INTEGER;
                                SubLObject cdolist_list_var_$77 = clauses.pos_lits(contextualized_dnf_clause);
                                SubLObject contextualized_asent2 = NIL;
                                contextualized_asent2 = cdolist_list_var_$77.first();
                                while (NIL != cdolist_list_var_$77) {
                                    if (!index0.eql(index2)) {
                                        SubLObject current_$79;
                                        final SubLObject datum_$78 = current_$79 = contextualized_asent2;
                                        SubLObject mt2 = NIL;
                                        SubLObject asent2 = NIL;
                                        destructuring_bind_must_consp(current_$79, datum_$78, $list74);
                                        mt2 = current_$79.first();
                                        current_$79 = current_$79.rest();
                                        destructuring_bind_must_consp(current_$79, datum_$78, $list74);
                                        asent2 = current_$79.first();
                                        current_$79 = current_$79.rest();
                                        if (NIL == current_$79) {
                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                final SubLObject mt_var_$80 = mt2;
                                                final SubLObject _prev_bind_0_$81 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$82 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$83 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$80), thread);
                                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$80), thread);
                                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$80), thread);
                                                    final SubLObject pred1 = cycl_utilities.atomic_sentence_predicate(asent2);
                                                    if ((NIL != hl_supports.non_hl_predicate_p(pred1)) && (NIL != kb_accessors.binary_predicateP(pred1))) {
                                                        final SubLObject pred1_arg1 = cycl_utilities.atomic_sentence_arg1(asent2, UNPROVIDED);
                                                        final SubLObject pred1_arg2 = cycl_utilities.atomic_sentence_arg2(asent2, UNPROVIDED);
                                                        if ((((NIL != variables.not_fully_bound_p(pred1_arg2)) && pred1_arg2.equal(isa_arg1)) && (NIL != relation_instance_exists_unifiableP(pred1, pred1_arg1, isa_arg2, mt2))) && (NIL != removal_relation_instance_exists_required(asent2, $GENL_PREDS, T))) {
                                                            if (index0.numL(index2)) {
                                                                subclause_specs = cons(list(NIL, list(index0, index2)), subclause_specs);
                                                            } else {
                                                                subclause_specs = cons(list(NIL, list(index2, index0)), subclause_specs);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$83, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$82, thread);
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$81, thread);
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_$78, $list74);
                                        }
                                    }
                                    index2 = add(index2, ONE_INTEGER);
                                    cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                                    contextualized_asent2 = cdolist_list_var_$77.first();
                                } 
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list73);
                }
                index0 = add(index0, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent0 = cdolist_list_var.first();
            } 
        }
        return list_utilities.fast_delete_duplicates(subclause_specs, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_relation_instance_exists_expansion_cost(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = NIL;
        thread.resetMultipleValues();
        final SubLObject isa_mt = destructure_relation_instance_exists_expansion(contextualized_dnf_clause);
        final SubLObject isa_asent = thread.secondMultipleValue();
        final SubLObject other_mt = thread.thirdMultipleValue();
        final SubLObject other_asent = thread.fourthMultipleValue();
        final SubLObject isa_firstP = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject relation = cycl_utilities.atomic_sentence_predicate(other_asent);
        final SubLObject instance = cycl_utilities.atomic_sentence_arg1(other_asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
        final SubLObject asent = make_ternary_formula($$relationInstanceExists, relation, instance, collection);
        final SubLObject mt_var = other_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            cost = removal_modules_tva_lookup.removal_tva_unify_cost(asent, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cost;
    }

    public static SubLObject removal_relation_instance_exists_expansion_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject isa_mt = destructure_relation_instance_exists_expansion(contextualized_dnf_clause);
        final SubLObject isa_asent = thread.secondMultipleValue();
        final SubLObject other_mt = thread.thirdMultipleValue();
        final SubLObject other_asent = thread.fourthMultipleValue();
        final SubLObject isa_firstP = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject relation = cycl_utilities.atomic_sentence_predicate(other_asent);
        final SubLObject instance = cycl_utilities.atomic_sentence_arg1(other_asent, UNPROVIDED);
        final SubLObject collection = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
        final SubLObject tva_asent_template = make_ternary_formula($$relationInstanceExists, relation, instance, collection);
        final SubLObject rie_term_template = make_relation_instance_exists_term(relation, instance, collection);
        final SubLObject rie_isa_asent_template = make_binary_formula($$isa, rie_term_template, collection);
        final SubLObject rie_other_asent_template = make_binary_formula(relation, instance, rie_term_template);
        SubLObject cdolist_list_var = relation_instance_exists_unify(relation, instance, collection, other_mt);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject rie_bindings = NIL;
            SubLObject rie_just = NIL;
            destructuring_bind_must_consp(current, datum, $list75);
            rie_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list75);
            rie_just = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sub_bindings = (NIL != rie_bindings) ? rie_bindings : $list76;
                final SubLObject tva_asent = bindings.subst_bindings(sub_bindings, tva_asent_template);
                final SubLObject tva_support = arguments.make_hl_support($TVA, tva_asent, other_mt, UNPROVIDED);
                final SubLObject rie_isa_asent = bindings.subst_bindings(sub_bindings, rie_isa_asent_template);
                thread.resetMultipleValues();
                final SubLObject isa_bindings = unification_utilities.gaf_asent_unify(isa_asent, rie_isa_asent, T, T);
                final SubLObject isa_gaf_asent = thread.secondMultipleValue();
                final SubLObject isa_unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != isa_bindings) {
                    final SubLObject isa_support = arguments.make_hl_support($ISA, rie_isa_asent, isa_mt, UNPROVIDED);
                    final SubLObject isa_just = cons(isa_support, isa_unify_justification);
                    final SubLObject rie_other_asent = bindings.subst_bindings(sub_bindings, rie_other_asent_template);
                    thread.resetMultipleValues();
                    final SubLObject other_bindings = unification_utilities.gaf_asent_unify(other_asent, rie_other_asent, T, T);
                    final SubLObject other_gaf_asent = thread.secondMultipleValue();
                    final SubLObject other_unify_justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != other_bindings) {
                        final SubLObject other_support = make_relation_instance_exists_support();
                        final SubLObject other_just = cons(other_support, cons(tva_support, other_unify_justification));
                        final SubLObject v_bindings = list_utilities.fast_delete_duplicates(append(rie_bindings, isa_bindings, other_bindings), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        inference_worker_removal.conjunctive_removal_callback(v_bindings, NIL != isa_firstP ? list(isa_just, other_just) : list(other_just, isa_just));
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list75);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject destructure_relation_instance_exists_expansion(final SubLObject contextualized_dnf_clause) {
        SubLObject current;
        final SubLObject datum = current = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent1 = NIL;
        SubLObject contextualized_asent2 = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        contextualized_asent1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        contextualized_asent2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$85;
            final SubLObject datum_$84 = current_$85 = contextualized_asent1;
            SubLObject mt1 = NIL;
            SubLObject asent1 = NIL;
            destructuring_bind_must_consp(current_$85, datum_$84, $list74);
            mt1 = current_$85.first();
            current_$85 = current_$85.rest();
            destructuring_bind_must_consp(current_$85, datum_$84, $list74);
            asent1 = current_$85.first();
            current_$85 = current_$85.rest();
            if (NIL == current_$85) {
                SubLObject current_$86;
                final SubLObject datum_$85 = current_$86 = contextualized_asent2;
                SubLObject mt2 = NIL;
                SubLObject asent2 = NIL;
                destructuring_bind_must_consp(current_$86, datum_$85, $list80);
                mt2 = current_$86.first();
                current_$86 = current_$86.rest();
                destructuring_bind_must_consp(current_$86, datum_$85, $list80);
                asent2 = current_$86.first();
                current_$86 = current_$86.rest();
                if (NIL == current_$86) {
                    return $$isa.eql(cycl_utilities.atomic_sentence_predicate(asent1)) ? values(mt1, asent1, mt2, asent2, T) : values(mt2, asent2, mt1, asent1, NIL);
                }
                cdestructuring_bind_error(datum_$85, $list80);
            } else {
                cdestructuring_bind_error(datum_$84, $list74);
            }
        } else {
            cdestructuring_bind_error(datum, $list79);
        }
        return NIL;
    }

    public static SubLObject relation_instance_exists_unifiableP(final SubLObject relation, final SubLObject instance, final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unifiableP = NIL;
        final SubLObject asent = make_ternary_formula($$relationInstanceExists, relation, instance, collection);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            unifiableP = removal_modules_tva_lookup.tva_unify_usefulP(asent);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return unifiableP;
    }

    public static SubLObject relation_instance_exists_unify(final SubLObject relation, final SubLObject instance, final SubLObject collection, final SubLObject mt) {
        final SubLObject asent = make_ternary_formula($$relationInstanceExists, relation, instance, collection);
        return tva_inference.tva_unify(asent, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_removal_modules_relation_instance_exists_file() {
        declareFunction(me, "some_relation_instance_for_predicate", "SOME-RELATION-INSTANCE-FOR-PREDICATE", 2, 1, false);
        declareFunction(me, "removal_relation_instance_support_direction_relevantP", "REMOVAL-RELATION-INSTANCE-SUPPORT-DIRECTION-RELEVANT?", 1, 0, false);
        declareFunction(me, "removal_relation_instance_support_sentence", "REMOVAL-RELATION-INSTANCE-SUPPORT-SENTENCE", 1, 0, false);
        declareFunction(me, "sksi_relation_instance_cost", "SKSI-RELATION-INSTANCE-COST", 1, 0, false);
        declareFunction(me, "removal_all_spec_or_inverse_predicates", "REMOVAL-ALL-SPEC-OR-INVERSE-PREDICATES", 2, 0, false);
        declareFunction(me, "removal_some_relation_instance_exists_for_predicate", "REMOVAL-SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE", 2, 1, false);
        declareFunction(me, "some_relation_instance_exists_for_predicate", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE", 1, 1, false);
        declareFunction(me, "some_relation_instance_exists_for_predicate_and_spec", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE-AND-SPEC", 2, 0, false);
        declareFunction(me, "some_relation_instance_exists_for_predicate_and_inverse", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE-AND-INVERSE", 2, 0, false);
        declareFunction(me, "removal_relation_instance_exists_required", "REMOVAL-RELATION-INSTANCE-EXISTS-REQUIRED", 3, 0, false);
        declareFunction(me, "make_relation_instance_exists_support", "MAKE-RELATION-INSTANCE-EXISTS-SUPPORT", 0, 0, false);
        declareFunction(me, "make_relation_instance_exists_term", "MAKE-RELATION-INSTANCE-EXISTS-TERM", 3, 0, false);
        declareFunction(me, "removal_relation_instance_exists_prune", "REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_check_required", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_check_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_check_expand_internal", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND-INTERNAL", 5, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unify_arg1_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED", 1, 1, false);
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_unify_arg1_required$UnaryFunction();
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_unify_arg1_required$BinaryFunction();
        declareFunction(me, "removal_relation_instance_exists_unify_arg2_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED", 1, 1, false);
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_unify_arg2_required$UnaryFunction();
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_unify_arg2_required$BinaryFunction();
        declareFunction(me, "removal_relation_instance_exists_unify_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-COST", 3, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unify_arg1_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_unify_arg2_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_unify_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-EXPAND", 4, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unify_arg1_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_unify_arg2_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "relation_instance_exists_sksi_cost", "RELATION-INSTANCE-EXISTS-SKSI-COST", 0, 0, false);
        declareFunction(me, "relation_instance_exists_predicate_cost_estimate", "RELATION-INSTANCE-EXISTS-PREDICATE-COST-ESTIMATE", 2, 1, false);
        declareFunction(me, "relation_instance_exists_object_cost_estimate", "RELATION-INSTANCE-EXISTS-OBJECT-COST-ESTIMATE", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_unify_via_predicate_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-VIA-PREDICATE-EXPAND", 4, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unify_via_object_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-VIA-OBJECT-EXPAND", 3, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unify_expand_guts", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-EXPAND-GUTS", 3, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unbound_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-REQUIRED", 2, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unbound_arg1_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED", 1, 1, false);
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_unbound_arg1_required$UnaryFunction();
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_unbound_arg1_required$BinaryFunction();
        declareFunction(me, "removal_relation_instance_exists_unbound_arg2_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED", 1, 1, false);
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_unbound_arg2_required$UnaryFunction();
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_unbound_arg2_required$BinaryFunction();
        declareFunction(me, "removal_relation_instance_exists_unbound_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-COST", 2, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unbound_arg1_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-COST", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_unbound_arg2_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_unbound_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_instance_exists_unbound_arg1_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_unbound_arg2_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_some_relation_exists_instance_for_predicate", "REMOVAL-SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE", 2, 1, false);
        declareFunction(me, "some_relation_exists_instance_for_predicate", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE", 1, 1, false);
        declareFunction(me, "some_relation_exists_instance_for_predicate_and_spec", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE-AND-SPEC", 2, 0, false);
        declareFunction(me, "some_relation_exists_instance_for_predicate_and_inverse", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE-AND-INVERSE", 2, 0, false);
        declareFunction(me, "removal_relation_exists_instance_required", "REMOVAL-RELATION-EXISTS-INSTANCE-REQUIRED", 3, 0, false);
        declareFunction(me, "make_relation_exists_instance_support", "MAKE-RELATION-EXISTS-INSTANCE-SUPPORT", 0, 0, false);
        declareFunction(me, "make_relation_exists_instance_term", "MAKE-RELATION-EXISTS-INSTANCE-TERM", 3, 0, false);
        declareFunction(me, "removal_relation_exists_instance_prune", "REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_check_required", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_check_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_check_expand_internal", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND-INTERNAL", 5, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unify_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-REQUIRED", 2, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unify_arg1_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED", 1, 1, false);
        new removal_modules_relation_instance_exists.$removal_relation_exists_instance_unify_arg1_required$UnaryFunction();
        new removal_modules_relation_instance_exists.$removal_relation_exists_instance_unify_arg1_required$BinaryFunction();
        declareFunction(me, "removal_relation_exists_instance_unify_arg2_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED", 1, 1, false);
        new removal_modules_relation_instance_exists.$removal_relation_exists_instance_unify_arg2_required$UnaryFunction();
        new removal_modules_relation_instance_exists.$removal_relation_exists_instance_unify_arg2_required$BinaryFunction();
        declareFunction(me, "removal_relation_exists_instance_unify_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-COST", 3, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unify_arg1_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_unify_arg2_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_unify_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-EXPAND", 4, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unify_arg1_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_unify_arg2_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "relation_exists_instance_sksi_cost", "RELATION-EXISTS-INSTANCE-SKSI-COST", 0, 0, false);
        declareFunction(me, "relation_exists_instance_predicate_cost_estimate", "RELATION-EXISTS-INSTANCE-PREDICATE-COST-ESTIMATE", 2, 1, false);
        declareFunction(me, "relation_exists_instance_object_cost_estimate", "RELATION-EXISTS-INSTANCE-OBJECT-COST-ESTIMATE", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_unify_via_predicate_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-VIA-PREDICATE-EXPAND", 4, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unify_via_object_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-VIA-OBJECT-EXPAND", 3, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unify_expand_guts", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-EXPAND-GUTS", 3, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unbound_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-REQUIRED", 2, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unbound_arg1_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED", 1, 1, false);
        new removal_modules_relation_instance_exists.$removal_relation_exists_instance_unbound_arg1_required$UnaryFunction();
        new removal_modules_relation_instance_exists.$removal_relation_exists_instance_unbound_arg1_required$BinaryFunction();
        declareFunction(me, "removal_relation_exists_instance_unbound_arg2_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED", 1, 1, false);
        new removal_modules_relation_instance_exists.$removal_relation_exists_instance_unbound_arg2_required$UnaryFunction();
        new removal_modules_relation_instance_exists.$removal_relation_exists_instance_unbound_arg2_required$BinaryFunction();
        declareFunction(me, "removal_relation_exists_instance_unbound_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-COST", 2, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unbound_arg1_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-COST", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_unbound_arg2_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_unbound_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_exists_instance_unbound_arg1_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_unbound_arg2_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_via_exemplar_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-COST", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_via_exemplar_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_instance_exists_via_exemplar_query", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-QUERY", 1, 1, false);
        declareFunction(me, "make_relation_instance_exists_via_exemplar_support", "MAKE-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_relation_exists_instance_via_exemplar_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-COST", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_via_exemplar_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_exists_instance_via_exemplar_query", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-QUERY", 1, 1, false);
        declareFunction(me, "make_relation_exists_instance_via_exemplar_support", "MAKE-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_relation_instance_exists_expansion_applicability", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY", 1, 0, false);
        new removal_modules_relation_instance_exists.$removal_relation_instance_exists_expansion_applicability$UnaryFunction();
        declareFunction(me, "removal_relation_instance_exists_expansion_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-COST", 1, 0, false);
        declareFunction(me, "removal_relation_instance_exists_expansion_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-EXPAND", 1, 0, false);
        declareFunction(me, "destructure_relation_instance_exists_expansion", "DESTRUCTURE-RELATION-INSTANCE-EXISTS-EXPANSION", 1, 0, false);
        declareFunction(me, "relation_instance_exists_unifiableP", "RELATION-INSTANCE-EXISTS-UNIFIABLE?", 4, 0, false);
        declareFunction(me, "relation_instance_exists_unify", "RELATION-INSTANCE-EXISTS-UNIFY", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_relation_instance_exists_file() {
        deflexical("*RELATION-INSTANCE-EXISTS-RULE*", list_to_elf($list5));
        deflexical("*RELATION-INSTANCE-EXISTS-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_instance_exists_defining_mt$, $relation_instance_exists_defining_mt$, $$BaseKB));
        deflexical("*DEFAULT-RELATION-INSTANCE-EXISTS-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*MINIMUM-RELATION-INSTANCE-EXISTS-UNIFY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*RELATION-EXISTS-INSTANCE-RULE*", list_to_elf($list40));
        deflexical("*RELATION-EXISTS-INSTANCE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_exists_instance_defining_mt$, $relation_exists_instance_defining_mt$, $$BaseKB));
        deflexical("*DEFAULT-RELATION-EXISTS-INSTANCE-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*MINIMUM-RELATION-EXISTS-INSTANCE-UNIFY-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_relation_instance_exists_file() {
        declare_defglobal($relation_instance_exists_defining_mt$);
        mt_vars.note_mt_var($relation_instance_exists_defining_mt$, $$relationInstanceExists);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_EXISTS_PRUNE, $list11);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_EXISTS_CHECK, $list27);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG1, $list31);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG2, $list33);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG1, $list35);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG2, $list37);
        declare_defglobal($relation_exists_instance_defining_mt$);
        mt_vars.note_mt_var($relation_exists_instance_defining_mt$, $$relationExistsInstance);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_INSTANCE_PRUNE, $list43);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_INSTANCE_CHECK, $list52);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG1, $list54);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG2, $list56);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG1, $list58);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG2, $list60);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_EXISTS_VIA_EXEMPLAR, $list62);
        inference_modules.inference_removal_module($REMOVAL_RELATION_EXISTS_INSTANCE_VIA_EXEMPLAR, $list70);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_RELATION_INSTANCE_EXISTS_EXPANSION, $list72);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_relation_instance_exists_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_relation_instance_exists_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_relation_instance_exists_file();
    }

    

    public static final class $removal_relation_instance_exists_unify_arg1_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_instance_exists_unify_arg1_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_instance_exists_unify_arg1_required(arg1, removal_modules_relation_instance_exists.$removal_relation_instance_exists_unify_arg1_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_instance_exists_unify_arg1_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_instance_exists_unify_arg1_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_instance_exists_unify_arg1_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_instance_exists_unify_arg2_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_instance_exists_unify_arg2_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_instance_exists_unify_arg2_required(arg1, removal_modules_relation_instance_exists.$removal_relation_instance_exists_unify_arg2_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_instance_exists_unify_arg2_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_instance_exists_unify_arg2_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_instance_exists_unify_arg2_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_instance_exists_unbound_arg1_required(arg1, removal_modules_relation_instance_exists.$removal_relation_instance_exists_unbound_arg1_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_instance_exists_unbound_arg1_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_instance_exists_unbound_arg1_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_instance_exists_unbound_arg1_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_instance_exists_unbound_arg2_required(arg1, removal_modules_relation_instance_exists.$removal_relation_instance_exists_unbound_arg2_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_instance_exists_unbound_arg2_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_instance_exists_unbound_arg2_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_instance_exists_unbound_arg2_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_exists_instance_unify_arg1_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_exists_instance_unify_arg1_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_exists_instance_unify_arg1_required(arg1, removal_modules_relation_instance_exists.$removal_relation_exists_instance_unify_arg1_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_exists_instance_unify_arg1_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_exists_instance_unify_arg1_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_exists_instance_unify_arg1_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_exists_instance_unify_arg2_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_exists_instance_unify_arg2_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_exists_instance_unify_arg2_required(arg1, removal_modules_relation_instance_exists.$removal_relation_exists_instance_unify_arg2_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_exists_instance_unify_arg2_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_exists_instance_unify_arg2_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_exists_instance_unify_arg2_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_exists_instance_unbound_arg1_required(arg1, removal_modules_relation_instance_exists.$removal_relation_exists_instance_unbound_arg1_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_exists_instance_unbound_arg1_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_exists_instance_unbound_arg1_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_exists_instance_unbound_arg1_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_exists_instance_unbound_arg2_required(arg1, removal_modules_relation_instance_exists.$removal_relation_exists_instance_unbound_arg2_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_exists_instance_unbound_arg2_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_exists_instance_unbound_arg2_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_exists_instance_unbound_arg2_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_instance_exists_expansion_applicability$UnaryFunction extends UnaryFunction {
        public $removal_relation_instance_exists_expansion_applicability$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_instance_exists_expansion_applicability(arg1);
        }
    }
}

/**
 * Total time: 1403 ms
 */
