/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CORBA-STORAGE-MODULE-UTILITIES
 *  source file: /cyc/top/cycl/sksi/corba/corba-storage-module-utilities.lisp
 *  created:     2019/07/03 17:38:36
 */
public final class corba_storage_module_utilities extends SubLTranslatedFile implements V10 {
    // // Constructor
    private corba_storage_module_utilities() {
    }

    public static final SubLFile me = new corba_storage_module_utilities();

    public static final String myName = "com.cyc.cycjava_2.cycl.sksi.corba.corba_storage_module_utilities";

    // // Definitions
    public static final SubLObject corba_set_object_method_args_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                return equal(cycl_utilities.sentence_arg0(asent), $$corbaSetObjectMethodArgs);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_set_object_field_arg_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                return equal(cycl_utilities.sentence_arg0(asent), $$corbaSetObjectFieldArg);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_set_class_method_args_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                return equal(cycl_utilities.sentence_arg0(asent), $$corbaSetClassMethodArgs);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_set_class_field_arg_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
                return equal(cycl_utilities.sentence_arg0(asent), $$corbaSetClassFieldArg);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_set_hl_storage_module_incompleteness(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        SubLTrampolineFile.checkType(argument_spec, ASSERTED_ARGUMENT_SPEC_P);
        {
            SubLObject incompleteness = NIL;
            SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
            if ($MONOTONIC != strength_spec) {
                incompleteness = cons($STRENGTH, incompleteness);
            }
            if ($BACKWARD != direction) {
                incompleteness = cons($DIRECTION, incompleteness);
            }
            return incompleteness;
        }
    }

    public static final SubLObject corba_set_hl_storage_module_assert(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
        {
            SubLObject literal = clause_utilities.gaf_cnf_literal(cnf);
            SubLObject content_mt = hl_storage_modules.hl_storage_module_required_mt(hl_storage_modules.currently_executing_hl_storage_module());
            SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt(content_mt);
            SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks(sks);
            SubLObject corba_predicate = el_utilities.literal_arg0(literal, UNPROVIDED);
            SubLObject args = el_utilities.literal_args(literal, UNPROVIDED);
            SubLObject result_object = corba_utilities.corba_connection_eval(corba_connection, corba_predicate, args);
            return result_object;
        }
    }

    public static final SubLObject corba_set_object_method_args_hl_storage_module_unassert(SubLObject argument_spec, SubLObject cnf, SubLObject mt) {
        return NIL;
    }

    public static final SubLObject declare_corba_storage_module_utilities_file() {
        declareFunction("corba_set_object_method_args_hl_storage_module_applicableP", "CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction("corba_set_object_field_arg_hl_storage_module_applicableP", "CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction("corba_set_class_method_args_hl_storage_module_applicableP", "CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction("corba_set_class_field_arg_hl_storage_module_applicableP", "CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction("corba_set_hl_storage_module_incompleteness", "CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS", 5, 0, false);
        declareFunction("corba_set_hl_storage_module_assert", "CORBA-SET-HL-STORAGE-MODULE-ASSERT", 5, 0, false);
        declareFunction("corba_set_object_method_args_hl_storage_module_unassert", "CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-UNASSERT", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_corba_storage_module_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_corba_storage_module_utilities_file() {
                return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$corbaSetObjectMethodArgs = constant_handles.reader_make_constant_shell(makeString("corbaSetObjectMethodArgs"));

    public static final SubLObject $$corbaSetObjectFieldArg = constant_handles.reader_make_constant_shell(makeString("corbaSetObjectFieldArg"));

    public static final SubLObject $$corbaSetClassMethodArgs = constant_handles.reader_make_constant_shell(makeString("corbaSetClassMethodArgs"));

    public static final SubLObject $$corbaSetClassFieldArg = constant_handles.reader_make_constant_shell(makeString("corbaSetClassFieldArg"));

    private static final SubLSymbol ASSERTED_ARGUMENT_SPEC_P = makeSymbol("ASSERTED-ARGUMENT-SPEC-P");









    // // Initializers
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

