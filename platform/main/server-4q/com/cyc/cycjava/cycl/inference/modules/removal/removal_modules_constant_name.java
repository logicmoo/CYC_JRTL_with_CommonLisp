package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_constant_name extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_constant_name();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name";

    public static final String myFingerPrint = "5ef31cead88851b9028b46a85a9d21b79c72e71c696c35c5f1d7ccf3faa54649";



    // deflexical
    private static final SubLSymbol $constant_name_check_default_cost$ = makeSymbol("*CONSTANT-NAME-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $constant_name_unify_default_cost$ = makeSymbol("*CONSTANT-NAME-UNIFY-DEFAULT-COST*");



    // deflexical
    private static final SubLSymbol $denotational_term_check_default_cost$ = makeSymbol("*DENOTATIONAL-TERM-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $denotational_term_unify_default_cost$ = makeSymbol("*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*");



    // deflexical
    private static final SubLSymbol $constant_id_check_default_cost$ = makeSymbol("*CONSTANT-ID-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $constant_id_unify_default_cost$ = makeSymbol("*CONSTANT-ID-UNIFY-DEFAULT-COST*");



    // deflexical
    private static final SubLSymbol $constant_guid_check_default_cost$ = makeSymbol("*CONSTANT-GUID-CHECK-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $constant_guid_unify_default_cost$ = makeSymbol("*CONSTANT-GUID-UNIFY-DEFAULT-COST*");

    // deflexical
    private static final SubLSymbol $constant_guid_lookup_default_cost$ = makeSymbol("*CONSTANT-GUID-LOOKUP-DEFAULT-COST*");

    private static final SubLObject $$constantName = reader_make_constant_shell(makeString("constantName"));





    public static final SubLSymbol $constant_name_defining_mt$ = makeSymbol("*CONSTANT-NAME-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $REMOVAL_CONSTANT_NAME_CHECK_POS = makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-POS");

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantName")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantName")), makeKeyword("CONSTANT"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-CONSTANT-NAME-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-NAME-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantName <constant-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantName #$Thing \"Thing\")") });

    private static final SubLSymbol $REMOVAL_CONSTANT_NAME_CHECK_NEG = makeKeyword("REMOVAL-CONSTANT-NAME-CHECK-NEG");

    public static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantName")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantName")), makeKeyword("CONSTANT"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-CONSTANT-NAME-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-NAME-CHECK"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantName <constant-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantName #$Thing \"Collection\"))") });

    private static final SubLSymbol $REMOVAL_CONSTANT_NAME_UNIFY = makeKeyword("REMOVAL-CONSTANT-NAME-UNIFY");

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantName")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantName")), makeKeyword("CONSTANT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CONSTANT-NAME-UNIFY-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("constantName")), list(makeKeyword("BIND"), makeSymbol("CONSTANT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("CONSTANT-NAME"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("constantName")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantName <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantName #$Thing ?NAME)") });

    private static final SubLSymbol $REMOVAL_CONSTANT_NAME_LOOKUP = makeKeyword("REMOVAL-CONSTANT-NAME-LOOKUP");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantName")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantName")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-CONSTANT-NAME-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("constantName")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("NAME"))), list(makeKeyword("VALUE"), makeSymbol("NAME"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FIND-CONSTANT"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("constantName")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("NAME"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-NAME-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantName <not fully-bound> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantName ?CONSTANT \"Thing\")") });

    private static final SubLObject $$denotationalTermName = reader_make_constant_shell(makeString("denotationalTermName"));

    public static final SubLSymbol $denotational_term_defining_mt$ = makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS = makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-CHECK-POS");

    public static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotationalTermName")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotationalTermName")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$denotationalTermName <cycl-denotational-term-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$denotationalTermName #$Thing \"Thing\")") });

    private static final SubLSymbol $REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG = makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-CHECK-NEG");

    public static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotationalTermName")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotationalTermName")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-CHECK"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$denotationalTermName <cycl-denotation-term-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$denotationalTermName #$Thing \"Collection\"))") });

    private static final SubLSymbol $REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY = makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-UNIFY");

    public static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotationalTermName")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotationalTermName")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("denotationalTermName")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("DENOTATIONAL-TERM-NAME"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("denotationalTermName")), list(makeKeyword("VALUE"), makeSymbol("TERM")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$denotationalTermName <cycl-denotational-term-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$denotationalTermName #$Thing ?NAME)") });

    private static final SubLSymbol $REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP = makeKeyword("REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP");

    public static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotationalTermName")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("denotationalTermName")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("denotationalTermName")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("NAME"))), list(makeKeyword("VALUE"), makeSymbol("NAME"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FIND-DENOTATIONAL-TERM"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("denotationalTermName")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("NAME"))), makeKeyword("SUPPORT-MT"), makeSymbol("*DENOTATIONAL-TERM-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$denotationalTermName <not fully-bound> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$denotationalTermName ?TERM \"Thing\")") });

    private static final SubLObject $$constantID = reader_make_constant_shell(makeString("constantID"));

    public static final SubLSymbol $constant_id_defining_mt$ = makeSymbol("*CONSTANT-ID-DEFINING-MT*");





    private static final SubLSymbol $REMOVAL_CONSTANT_ID_CHECK_POS = makeKeyword("REMOVAL-CONSTANT-ID-CHECK-POS");

    public static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantID")), makeKeyword("CONSTANT"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-CONSTANT-ID-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-ID-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantID <constant-p> <integerp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID #$isa 260)") });

    private static final SubLSymbol $REMOVAL_CONSTANT_ID_CHECK_NEG = makeKeyword("REMOVAL-CONSTANT-ID-CHECK-NEG");

    public static final SubLList $list30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantID")), makeKeyword("CONSTANT"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-CONSTANT-ID-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-ID-CHECK"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantID <constant-p> <integerp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantID #$Thing 260))") });

    private static final SubLSymbol $REMOVAL_CONSTANT_ID_UNIFY = makeKeyword("REMOVAL-CONSTANT-ID-UNIFY");

    public static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantID")), makeKeyword("CONSTANT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CONSTANT-ID-UNIFY-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("constantID")), list(makeKeyword("BIND"), makeSymbol("CONSTANT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("CONSTANT-INTERNAL-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("constantID")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantID <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID #$isa ?ID)") });

    private static final SubLSymbol $REMOVAL_CONSTANT_ID_LOOKUP = makeKeyword("REMOVAL-CONSTANT-ID-LOOKUP");

    private static final SubLList $list34 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantID")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("INTEGER")), makeKeyword("COST"), makeSymbol("REMOVAL-CONSTANT-ID-LOOKUP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("constantID")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ID"))), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("constantID")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ID"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-ID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantID <not fully-bound> <integerp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantID ?CONSTANT 260)") });

    private static final SubLObject $$constantGUID = reader_make_constant_shell(makeString("constantGUID"));

    public static final SubLSymbol $constant_guid_defining_mt$ = makeSymbol("*CONSTANT-GUID-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_CONSTANT_GUID_CHECK_POS = makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-POS");

    private static final SubLList $list38 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantGUID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantGUID")), makeKeyword("CONSTANT"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-CONSTANT-GUID-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-GUID-CHECK"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantGUID <constant-p> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantGUID #$isa \"bd588104-9c29-11b1-9dad-c379636f7270\")") });

    private static final SubLSymbol $REMOVAL_CONSTANT_GUID_CHECK_NEG = makeKeyword("REMOVAL-CONSTANT-GUID-CHECK-NEG");

    private static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantGUID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantGUID")), makeKeyword("CONSTANT"), makeKeyword("STRING")), makeKeyword("COST"), makeSymbol("REMOVAL-CONSTANT-GUID-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T, makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-CONSTANT-GUID-CHECK"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$constantGUID <constant-p> <stringp>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$constantGUID #$Thing \"bd588104-9c29-11b1-9dad-c379636f7270\"))") });

    private static final SubLSymbol $REMOVAL_CONSTANT_GUID_UNIFY = makeKeyword("REMOVAL-CONSTANT-GUID-UNIFY");

    private static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantGUID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantGUID")), makeKeyword("CONSTANT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CONSTANT-GUID-UNIFY-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("constantGUID")), list(makeKeyword("BIND"), makeSymbol("CONSTANT")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("GUID-TO-STRING"), list(makeKeyword("CALL"), makeSymbol("CONSTANT-EXTERNAL-ID"), makeKeyword("INPUT")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("constantGUID")), list(makeKeyword("VALUE"), makeSymbol("CONSTANT")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantGUID <constant-p> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$constantGUID #$isa ?GUID-STRING)") });

    private static final SubLSymbol $REMOVAL_CONSTANT_GUID_LOOKUP = makeKeyword("REMOVAL-CONSTANT-GUID-LOOKUP");

    private static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("constantGUID")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("constantGUID")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CONSTANT-GUID-LOOKUP-DEFAULT-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("constantGUID")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GUID-STRING"))), list(makeKeyword("VALUE"), makeSymbol("GUID-STRING"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-CONSTANT-GUID-LOOKUP"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("constantGUID")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GUID-STRING"))), makeKeyword("SUPPORT-MT"), makeSymbol("*CONSTANT-GUID-DEFINING-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"), makeString("(#$constantGUID <not fully-bound> <stringp>)"), makeKeyword("EXAMPLE"), makeString("(#$constantGUID ?CONSTANT \"bd588104-9c29-11b1-9dad-c379636f7270\")") });

    public static SubLObject inference_constant_name_check(final SubLObject constant, final SubLObject name) {
        return equal(name, constants_high.constant_name(constant));
    }

    public static SubLObject removal_constant_name_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return NIL != removal_constant_name_check(asent) ? $constant_name_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    public static SubLObject removal_constant_name_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_name_check_pos_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_constant_name_check(final SubLObject asent) {
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_constant_name_check(constant, name);
    }

    public static SubLObject removal_constant_name_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return NIL != constants_high.find_constant(name) ? ONE_INTEGER : ZERO_INTEGER;
    }

    public static SubLObject inference_denotational_term_check(final SubLObject v_term, final SubLObject name) {
        return equal(name, cycl_utilities.denotational_term_name(v_term));
    }

    public static SubLObject removal_denotational_term_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return NIL != removal_denotational_term_check(asent) ? $denotational_term_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    public static SubLObject removal_denotational_term_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_denotational_term_check_pos_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_denotational_term_check(final SubLObject asent) {
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_denotational_term_check(v_term, name);
    }

    public static SubLObject removal_denotational_term_name_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject name = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return NIL != cycl_utilities.find_denotational_term(name) ? ONE_INTEGER : ZERO_INTEGER;
    }

    public static SubLObject inference_constant_id_check(final SubLObject constant, final SubLObject id) {
        return eql(id, constants_high.constant_internal_id(constant));
    }

    public static SubLObject make_constant_id_support(final SubLObject constant, final SubLObject id, SubLObject negateP) {
        if (negateP == UNPROVIDED) {
            negateP = NIL;
        }
        final SubLObject support_formula = list($$constantID, constant, id);
        if (NIL == negateP) {
            return arguments.make_hl_support($OPAQUE, support_formula, $constant_id_defining_mt$.getGlobalValue(), $TRUE_MON);
        }
        return arguments.make_hl_support($OPAQUE, cycl_utilities.negate(support_formula), $constant_id_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_constant_id_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return NIL != removal_constant_id_check(asent) ? $constant_id_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    public static SubLObject removal_constant_id_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_id_check_pos_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_constant_id_check(final SubLObject asent) {
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_constant_id_check(constant, id);
    }

    public static SubLObject removal_constant_id_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject id = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return NIL != constants_high.find_constant_by_internal_id(id) ? ONE_INTEGER : ZERO_INTEGER;
    }

    public static SubLObject inference_constant_guid_check(final SubLObject constant, final SubLObject guid_string) {
        return equal(guid_string, Guids.guid_to_string(constants_high.constant_external_id(constant)));
    }

    public static SubLObject inference_constant_guid_lookup(final SubLObject guid_string) {
        if (NIL != Guids.guid_string_p(guid_string)) {
            final SubLObject guid = Guids.string_to_guid(guid_string);
            final SubLObject constant = constants_high.find_constant_by_external_id(guid);
            return constant;
        }
        return NIL;
    }

    public static SubLObject removal_constant_guid_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return NIL != removal_constant_guid_check(asent) ? $constant_guid_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
    }

    public static SubLObject removal_constant_guid_check_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_module_utilities.invert_removal_check_cost(removal_constant_guid_check_pos_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_constant_guid_check(final SubLObject asent) {
        final SubLObject constant = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject guid_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return inference_constant_guid_check(constant, guid_string);
    }

    public static SubLObject declare_removal_modules_constant_name_file() {
        declareFunction(me, "inference_constant_name_check", "INFERENCE-CONSTANT-NAME-CHECK", 2, 0, false);
        declareFunction(me, "removal_constant_name_check_pos_cost", "REMOVAL-CONSTANT-NAME-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_constant_name_check_neg_cost", "REMOVAL-CONSTANT-NAME-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_constant_name_check", "REMOVAL-CONSTANT-NAME-CHECK", 1, 0, false);
        declareFunction(me, "removal_constant_name_lookup_cost", "REMOVAL-CONSTANT-NAME-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "inference_denotational_term_check", "INFERENCE-DENOTATIONAL-TERM-CHECK", 2, 0, false);
        declareFunction(me, "removal_denotational_term_check_pos_cost", "REMOVAL-DENOTATIONAL-TERM-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_denotational_term_check_neg_cost", "REMOVAL-DENOTATIONAL-TERM-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_denotational_term_check", "REMOVAL-DENOTATIONAL-TERM-CHECK", 1, 0, false);
        declareFunction(me, "removal_denotational_term_name_lookup_cost", "REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "inference_constant_id_check", "INFERENCE-CONSTANT-ID-CHECK", 2, 0, false);
        declareFunction(me, "make_constant_id_support", "MAKE-CONSTANT-ID-SUPPORT", 2, 1, false);
        declareFunction(me, "removal_constant_id_check_pos_cost", "REMOVAL-CONSTANT-ID-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_constant_id_check_neg_cost", "REMOVAL-CONSTANT-ID-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_constant_id_check", "REMOVAL-CONSTANT-ID-CHECK", 1, 0, false);
        declareFunction(me, "removal_constant_id_lookup_cost", "REMOVAL-CONSTANT-ID-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "inference_constant_guid_check", "INFERENCE-CONSTANT-GUID-CHECK", 2, 0, false);
        declareFunction(me, "inference_constant_guid_lookup", "INFERENCE-CONSTANT-GUID-LOOKUP", 1, 0, false);
        declareFunction(me, "removal_constant_guid_check_pos_cost", "REMOVAL-CONSTANT-GUID-CHECK-POS-COST", 1, 1, false);
        declareFunction(me, "removal_constant_guid_check_neg_cost", "REMOVAL-CONSTANT-GUID-CHECK-NEG-COST", 1, 1, false);
        declareFunction(me, "removal_constant_guid_check", "REMOVAL-CONSTANT-GUID-CHECK", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_constant_name_file() {
        deflexical("*CONSTANT-NAME-DEFINING-MT*", SubLTrampolineFile.maybeDefault($constant_name_defining_mt$, $constant_name_defining_mt$, $$BaseKB));
        deflexical("*CONSTANT-NAME-CHECK-DEFAULT-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*CONSTANT-NAME-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        deflexical("*DENOTATIONAL-TERM-DEFINING-MT*", SubLTrampolineFile.maybeDefault($denotational_term_defining_mt$, $denotational_term_defining_mt$, $$BaseKB));
        deflexical("*DENOTATIONAL-TERM-CHECK-DEFAULT-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        deflexical("*CONSTANT-ID-DEFINING-MT*", SubLTrampolineFile.maybeDefault($constant_id_defining_mt$, $constant_id_defining_mt$, $$BaseKB));
        deflexical("*CONSTANT-ID-CHECK-DEFAULT-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*CONSTANT-ID-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        deflexical("*CONSTANT-GUID-DEFINING-MT*", SubLTrampolineFile.maybeDefault($constant_guid_defining_mt$, $constant_guid_defining_mt$, $$BaseKB));
        deflexical("*CONSTANT-GUID-CHECK-DEFAULT-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*CONSTANT-GUID-UNIFY-DEFAULT-COST*", ONE_INTEGER);
        deflexical("*CONSTANT-GUID-LOOKUP-DEFAULT-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_constant_name_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$constantName);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$constantName);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$constantName);
        declare_defglobal($constant_name_defining_mt$);
        mt_vars.note_mt_var($constant_name_defining_mt$, $$constantName);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_NAME_CHECK_POS, $list6);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_NAME_CHECK_NEG, $list8);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_NAME_UNIFY, $list10);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_NAME_LOOKUP, $list12);
        inference_modules.register_solely_specific_removal_module_predicate($$denotationalTermName);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$denotationalTermName);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$denotationalTermName);
        declare_defglobal($denotational_term_defining_mt$);
        mt_vars.note_mt_var($denotational_term_defining_mt$, $$denotationalTermName);
        inference_modules.inference_removal_module($REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS, $list16);
        inference_modules.inference_removal_module($REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG, $list18);
        inference_modules.inference_removal_module($REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY, $list20);
        inference_modules.inference_removal_module($REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP, $list22);
        inference_modules.register_solely_specific_removal_module_predicate($$constantID);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$constantID);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$constantID);
        declare_defglobal($constant_id_defining_mt$);
        mt_vars.note_mt_var($constant_id_defining_mt$, $$constantID);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_ID_CHECK_POS, $list28);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_ID_CHECK_NEG, $list30);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_ID_UNIFY, $list32);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_ID_LOOKUP, $list34);
        inference_modules.register_solely_specific_removal_module_predicate($$constantGUID);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$constantGUID);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$constantGUID);
        declare_defglobal($constant_guid_defining_mt$);
        mt_vars.note_mt_var($constant_guid_defining_mt$, $$constantGUID);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_GUID_CHECK_POS, $list38);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_GUID_CHECK_NEG, $list40);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_GUID_UNIFY, $list42);
        inference_modules.inference_removal_module($REMOVAL_CONSTANT_GUID_LOOKUP, $list44);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_constant_name_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_constant_name_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_constant_name_file();
    }

    
}

/**
 * Total time: 140 ms
 */
