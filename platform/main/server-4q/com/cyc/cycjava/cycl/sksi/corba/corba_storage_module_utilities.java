package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class corba_storage_module_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new corba_storage_module_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_storage_module_utilities";

    public static final String myFingerPrint = "527bc6cbf2e286a75eaffa79f0d8e7359030b1a714d88e113f885a709cae6836";

    private static final SubLObject $$corbaSetObjectMethodArgs = reader_make_constant_shell(makeString("corbaSetObjectMethodArgs"));

    private static final SubLObject $$corbaSetObjectFieldArg = reader_make_constant_shell(makeString("corbaSetObjectFieldArg"));

    private static final SubLObject $$corbaSetClassMethodArgs = reader_make_constant_shell(makeString("corbaSetClassMethodArgs"));

    private static final SubLObject $$corbaSetClassFieldArg = reader_make_constant_shell(makeString("corbaSetClassFieldArg"));

    public static final SubLSymbol ASSERTED_ARGUMENT_SPEC_P = makeSymbol("ASSERTED-ARGUMENT-SPEC-P");









    public static SubLObject corba_set_object_method_args_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return equal(cycl_utilities.sentence_arg0(asent), $$corbaSetObjectMethodArgs);
        }
        return NIL;
    }

    public static SubLObject corba_set_object_field_arg_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return equal(cycl_utilities.sentence_arg0(asent), $$corbaSetObjectFieldArg);
        }
        return NIL;
    }

    public static SubLObject corba_set_class_method_args_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return equal(cycl_utilities.sentence_arg0(asent), $$corbaSetClassMethodArgs);
        }
        return NIL;
    }

    public static SubLObject corba_set_class_field_arg_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return equal(cycl_utilities.sentence_arg0(asent), $$corbaSetClassFieldArg);
        }
        return NIL;
    }

    public static SubLObject corba_set_hl_storage_module_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        assert NIL != arguments.asserted_argument_spec_p(argument_spec) : "arguments.asserted_argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.asserted_argument_spec_p(argument_spec) " + argument_spec;
        SubLObject incompleteness = NIL;
        final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
        if ($MONOTONIC != strength_spec) {
            incompleteness = cons($STRENGTH, incompleteness);
        }
        if ($BACKWARD != direction) {
            incompleteness = cons($DIRECTION, incompleteness);
        }
        return incompleteness;
    }

    public static SubLObject corba_set_hl_storage_module_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject literal = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject content_mt = hl_storage_modules.hl_storage_module_required_mt(hl_storage_modules.currently_executing_hl_storage_module());
        final SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
        final SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
        final SubLObject corba_predicate = literal_arg0(literal, UNPROVIDED);
        final SubLObject args = literal_args(literal, UNPROVIDED);
        final SubLObject result_object = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, args);
        return result_object;
    }

    public static SubLObject corba_set_object_method_args_hl_storage_module_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        return NIL;
    }

    public static SubLObject declare_corba_storage_module_utilities_file() {
        declareFunction(me, "corba_set_object_method_args_hl_storage_module_applicableP", "CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "corba_set_object_field_arg_hl_storage_module_applicableP", "CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "corba_set_class_method_args_hl_storage_module_applicableP", "CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "corba_set_class_field_arg_hl_storage_module_applicableP", "CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "corba_set_hl_storage_module_incompleteness", "CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "corba_set_hl_storage_module_assert", "CORBA-SET-HL-STORAGE-MODULE-ASSERT", 5, 0, false);
        declareFunction(me, "corba_set_object_method_args_hl_storage_module_unassert", "CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-UNASSERT", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_corba_storage_module_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_corba_storage_module_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_corba_storage_module_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_corba_storage_module_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_corba_storage_module_utilities_file();
    }

    
}

/**
 * Total time: 32 ms
 */
