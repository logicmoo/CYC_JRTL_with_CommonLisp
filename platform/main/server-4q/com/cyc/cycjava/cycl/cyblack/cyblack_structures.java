/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-STRUCTURES
 *  source file: /cyc/top/cycl/cyblack/cyblack-structures.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_structures extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_structures() {
    }

    public static final SubLFile me = new cyblack_structures();


    // // Definitions
    public static final class $external_knowledge_source_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_structures.$external_knowledge_source_native.structDecl;
        }

        public SubLObject getField2() {
            return $lock;
        }

        public SubLObject getField3() {
            return $internals;
        }

        public SubLObject getField4() {
            return $knowledge_source;
        }

        public SubLObject getField5() {
            return $external_module;
        }

        public SubLObject getField6() {
            return $cyblack_application;
        }

        public SubLObject getField7() {
            return $precondition_pattern;
        }

        public SubLObject getField8() {
            return $uncompiled_precondition_pattern;
        }

        public SubLObject getField9() {
            return $precondition_datatypes;
        }

        public SubLObject getField10() {
            return $stimulation_function;
        }

        public SubLObject getField11() {
            return $post_proposal_function;
        }

        public SubLObject getField12() {
            return $generate_ksi_function;
        }

        public SubLObject setField2(SubLObject value) {
            return $lock = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $internals = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $knowledge_source = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $external_module = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $cyblack_application = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $precondition_pattern = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $uncompiled_precondition_pattern = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $precondition_datatypes = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $stimulation_function = value;
        }

        public SubLObject setField11(SubLObject value) {
            return $post_proposal_function = value;
        }

        public SubLObject setField12(SubLObject value) {
            return $generate_ksi_function = value;
        }

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $internals = Lisp.NIL;

        public SubLObject $knowledge_source = Lisp.NIL;

        public SubLObject $external_module = Lisp.NIL;

        public SubLObject $cyblack_application = Lisp.NIL;

        public SubLObject $precondition_pattern = Lisp.NIL;

        public SubLObject $uncompiled_precondition_pattern = Lisp.NIL;

        public SubLObject $precondition_datatypes = Lisp.NIL;

        public SubLObject $stimulation_function = Lisp.NIL;

        public SubLObject $post_proposal_function = Lisp.NIL;

        public SubLObject $generate_ksi_function = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_structures.$external_knowledge_source_native.class, EXTERNAL_KNOWLEDGE_SOURCE, EXTERNAL_KNOWLEDGE_SOURCE_P, $list_alt2, $list_alt3, new String[]{ "$lock", "$internals", "$knowledge_source", "$external_module", "$cyblack_application", "$precondition_pattern", "$uncompiled_precondition_pattern", "$precondition_datatypes", "$stimulation_function", "$post_proposal_function", "$generate_ksi_function" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_external_knowledge_source$ = makeSymbol("*DTP-EXTERNAL-KNOWLEDGE-SOURCE*");

    public static final SubLObject external_knowledge_source_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject external_knowledge_source_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_structures.$external_knowledge_source_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $external_knowledge_source_p$UnaryFunction extends UnaryFunction {
        public $external_knowledge_source_p$UnaryFunction() {
            super(extractFunctionNamed("EXTERNAL-KNOWLEDGE-SOURCE-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return external_knowledge_source_p(arg1);
        }
    }

    public static final SubLObject eks_lock(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField2();
    }

    public static final SubLObject eks_internals(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField3();
    }

    public static final SubLObject eks_knowledge_source(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField4();
    }

    public static final SubLObject eks_external_module(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField5();
    }

    public static final SubLObject eks_cyblack_application(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField6();
    }

    public static final SubLObject eks_precondition_pattern(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField7();
    }

    public static final SubLObject eks_uncompiled_precondition_pattern(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField8();
    }

    public static final SubLObject eks_precondition_datatypes(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField9();
    }

    public static final SubLObject eks_stimulation_function(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField10();
    }

    public static final SubLObject eks_post_proposal_function(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField11();
    }

    public static final SubLObject eks_generate_ksi_function(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.getField12();
    }

    public static final SubLObject _csetf_eks_lock(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_eks_internals(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_eks_knowledge_source(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_eks_external_module(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_eks_cyblack_application(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_eks_precondition_pattern(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_eks_uncompiled_precondition_pattern(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_eks_precondition_datatypes(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_eks_stimulation_function(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_eks_post_proposal_function(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_eks_generate_ksi_function(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_KNOWLEDGE_SOURCE_P);
        return v_object.setField12(value);
    }

    public static final SubLObject make_external_knowledge_source(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_structures.$external_knowledge_source_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        _csetf_eks_lock(v_new, current_value);
                    } else
                        if (pcase_var.eql($INTERNALS)) {
                            _csetf_eks_internals(v_new, current_value);
                        } else
                            if (pcase_var.eql($KNOWLEDGE_SOURCE)) {
                                _csetf_eks_knowledge_source(v_new, current_value);
                            } else
                                if (pcase_var.eql($EXTERNAL_MODULE)) {
                                    _csetf_eks_external_module(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CYBLACK_APPLICATION)) {
                                        _csetf_eks_cyblack_application(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PRECONDITION_PATTERN)) {
                                            _csetf_eks_precondition_pattern(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($UNCOMPILED_PRECONDITION_PATTERN)) {
                                                _csetf_eks_uncompiled_precondition_pattern(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($PRECONDITION_DATATYPES)) {
                                                    _csetf_eks_precondition_datatypes(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($STIMULATION_FUNCTION)) {
                                                        _csetf_eks_stimulation_function(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($POST_PROPOSAL_FUNCTION)) {
                                                            _csetf_eks_post_proposal_function(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($GENERATE_KSI_FUNCTION)) {
                                                                _csetf_eks_generate_ksi_function(v_new, current_value);
                                                            } else {
                                                                Errors.error($str_alt41$Invalid_slot__S_for_construction_, current_arg);
                                                            }










                }
            }
            return v_new;
        }
    }

    public static final SubLObject with_eks_read_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            eks = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eks_var = make_symbol($$$eks);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(eks_var, eks, EKS_, $list_alt2, forms, UNPROVIDED);
            }
        }
    }

    public static final SubLObject with_eks_read_write(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            eks = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eks_var = make_symbol($$$eks);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(eks_var, eks, EKS_, $list_alt2, forms, NIL);
            }
        }
    }

    public static final SubLObject with_locked_eks(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            eks = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eks_var = make_symbol($$$eks);
                SubLObject lock_var = make_symbol($$$lock);
                return list(CLET, list(list(eks_var, eks), list(lock_var, list(EKS_LOCK, eks_var))), listS(WITH_LOCK_HELD, list(lock_var), forms));
            }
        }
    }

    public static final SubLObject with_locked_eks_read_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            eks = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eks_var = make_symbol($$$eks);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(eks_var, eks, EKS_, $list_alt48, list(listS(WITH_LOCK_HELD, $list_alt49, forms)), UNPROVIDED);
            }
        }
    }

    public static final SubLObject with_locked_eks_read_write(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject eks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            eks = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject eks_var = make_symbol($$$eks);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(eks_var, eks, EKS_, $list_alt48, list(listS(WITH_LOCK_HELD, $list_alt49, forms)), NIL);
            }
        }
    }

    public static final SubLObject declare_cyblack_structures_file() {
        declareFunction("external_knowledge_source_print_function_trampoline", "EXTERNAL-KNOWLEDGE-SOURCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("external_knowledge_source_p", "EXTERNAL-KNOWLEDGE-SOURCE-P", 1, 0, false);
        new cyblack_structures.$external_knowledge_source_p$UnaryFunction();
        declareFunction("eks_lock", "EKS-LOCK", 1, 0, false);
        declareFunction("eks_internals", "EKS-INTERNALS", 1, 0, false);
        declareFunction("eks_knowledge_source", "EKS-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("eks_external_module", "EKS-EXTERNAL-MODULE", 1, 0, false);
        declareFunction("eks_cyblack_application", "EKS-CYBLACK-APPLICATION", 1, 0, false);
        declareFunction("eks_precondition_pattern", "EKS-PRECONDITION-PATTERN", 1, 0, false);
        declareFunction("eks_uncompiled_precondition_pattern", "EKS-UNCOMPILED-PRECONDITION-PATTERN", 1, 0, false);
        declareFunction("eks_precondition_datatypes", "EKS-PRECONDITION-DATATYPES", 1, 0, false);
        declareFunction("eks_stimulation_function", "EKS-STIMULATION-FUNCTION", 1, 0, false);
        declareFunction("eks_post_proposal_function", "EKS-POST-PROPOSAL-FUNCTION", 1, 0, false);
        declareFunction("eks_generate_ksi_function", "EKS-GENERATE-KSI-FUNCTION", 1, 0, false);
        declareFunction("_csetf_eks_lock", "_CSETF-EKS-LOCK", 2, 0, false);
        declareFunction("_csetf_eks_internals", "_CSETF-EKS-INTERNALS", 2, 0, false);
        declareFunction("_csetf_eks_knowledge_source", "_CSETF-EKS-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("_csetf_eks_external_module", "_CSETF-EKS-EXTERNAL-MODULE", 2, 0, false);
        declareFunction("_csetf_eks_cyblack_application", "_CSETF-EKS-CYBLACK-APPLICATION", 2, 0, false);
        declareFunction("_csetf_eks_precondition_pattern", "_CSETF-EKS-PRECONDITION-PATTERN", 2, 0, false);
        declareFunction("_csetf_eks_uncompiled_precondition_pattern", "_CSETF-EKS-UNCOMPILED-PRECONDITION-PATTERN", 2, 0, false);
        declareFunction("_csetf_eks_precondition_datatypes", "_CSETF-EKS-PRECONDITION-DATATYPES", 2, 0, false);
        declareFunction("_csetf_eks_stimulation_function", "_CSETF-EKS-STIMULATION-FUNCTION", 2, 0, false);
        declareFunction("_csetf_eks_post_proposal_function", "_CSETF-EKS-POST-PROPOSAL-FUNCTION", 2, 0, false);
        declareFunction("_csetf_eks_generate_ksi_function", "_CSETF-EKS-GENERATE-KSI-FUNCTION", 2, 0, false);
        declareFunction("make_external_knowledge_source", "MAKE-EXTERNAL-KNOWLEDGE-SOURCE", 0, 1, false);
        declareMacro("with_eks_read_only", "WITH-EKS-READ-ONLY");
        declareMacro("with_eks_read_write", "WITH-EKS-READ-WRITE");
        declareMacro("with_locked_eks", "WITH-LOCKED-EKS");
        declareMacro("with_locked_eks_read_only", "WITH-LOCKED-EKS-READ-ONLY");
        declareMacro("with_locked_eks_read_write", "WITH-LOCKED-EKS-READ-WRITE");
        return NIL;
    }

    public static final SubLObject init_cyblack_structures_file() {
        defconstant("*DTP-EXTERNAL-KNOWLEDGE-SOURCE*", EXTERNAL_KNOWLEDGE_SOURCE);
        return NIL;
    }

    public static final SubLObject setup_cyblack_structures_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_external_knowledge_source$.getGlobalValue(), symbol_function(EXTERNAL_KNOWLEDGE_SOURCE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EKS_LOCK, _CSETF_EKS_LOCK);
        def_csetf(EKS_INTERNALS, _CSETF_EKS_INTERNALS);
        def_csetf(EKS_KNOWLEDGE_SOURCE, _CSETF_EKS_KNOWLEDGE_SOURCE);
        def_csetf(EKS_EXTERNAL_MODULE, _CSETF_EKS_EXTERNAL_MODULE);
        def_csetf(EKS_CYBLACK_APPLICATION, _CSETF_EKS_CYBLACK_APPLICATION);
        def_csetf(EKS_PRECONDITION_PATTERN, _CSETF_EKS_PRECONDITION_PATTERN);
        def_csetf(EKS_UNCOMPILED_PRECONDITION_PATTERN, _CSETF_EKS_UNCOMPILED_PRECONDITION_PATTERN);
        def_csetf(EKS_PRECONDITION_DATATYPES, _CSETF_EKS_PRECONDITION_DATATYPES);
        def_csetf(EKS_STIMULATION_FUNCTION, _CSETF_EKS_STIMULATION_FUNCTION);
        def_csetf(EKS_POST_PROPOSAL_FUNCTION, _CSETF_EKS_POST_PROPOSAL_FUNCTION);
        def_csetf(EKS_GENERATE_KSI_FUNCTION, _CSETF_EKS_GENERATE_KSI_FUNCTION);
        identity(EXTERNAL_KNOWLEDGE_SOURCE);
        return NIL;
    }



    private static final SubLSymbol EXTERNAL_KNOWLEDGE_SOURCE_P = makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-P");

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("LOCK"), makeSymbol("INTERNALS"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("EXTERNAL-MODULE"), makeSymbol("CYBLACK-APPLICATION"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"), makeSymbol("PRECONDITION-DATATYPES"), makeSymbol("STIMULATION-FUNCTION"), makeSymbol("POST-PROPOSAL-FUNCTION"), makeSymbol("GENERATE-KSI-FUNCTION") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ $LOCK, makeKeyword("INTERNALS"), makeKeyword("KNOWLEDGE-SOURCE"), makeKeyword("EXTERNAL-MODULE"), makeKeyword("CYBLACK-APPLICATION"), makeKeyword("PRECONDITION-PATTERN"), makeKeyword("UNCOMPILED-PRECONDITION-PATTERN"), makeKeyword("PRECONDITION-DATATYPES"), makeKeyword("STIMULATION-FUNCTION"), makeKeyword("POST-PROPOSAL-FUNCTION"), makeKeyword("GENERATE-KSI-FUNCTION") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("EKS-LOCK"), makeSymbol("EKS-INTERNALS"), makeSymbol("EKS-KNOWLEDGE-SOURCE"), makeSymbol("EKS-EXTERNAL-MODULE"), makeSymbol("EKS-CYBLACK-APPLICATION"), makeSymbol("EKS-PRECONDITION-PATTERN"), makeSymbol("EKS-UNCOMPILED-PRECONDITION-PATTERN"), makeSymbol("EKS-PRECONDITION-DATATYPES"), makeSymbol("EKS-STIMULATION-FUNCTION"), makeSymbol("EKS-POST-PROPOSAL-FUNCTION"), makeSymbol("EKS-GENERATE-KSI-FUNCTION") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-EKS-LOCK"), makeSymbol("_CSETF-EKS-INTERNALS"), makeSymbol("_CSETF-EKS-KNOWLEDGE-SOURCE"), makeSymbol("_CSETF-EKS-EXTERNAL-MODULE"), makeSymbol("_CSETF-EKS-CYBLACK-APPLICATION"), makeSymbol("_CSETF-EKS-PRECONDITION-PATTERN"), makeSymbol("_CSETF-EKS-UNCOMPILED-PRECONDITION-PATTERN"), makeSymbol("_CSETF-EKS-PRECONDITION-DATATYPES"), makeSymbol("_CSETF-EKS-STIMULATION-FUNCTION"), makeSymbol("_CSETF-EKS-POST-PROPOSAL-FUNCTION"), makeSymbol("_CSETF-EKS-GENERATE-KSI-FUNCTION") });



    private static final SubLSymbol EXTERNAL_KNOWLEDGE_SOURCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol EKS_LOCK = makeSymbol("EKS-LOCK");

    public static final SubLSymbol _CSETF_EKS_LOCK = makeSymbol("_CSETF-EKS-LOCK");

    private static final SubLSymbol EKS_INTERNALS = makeSymbol("EKS-INTERNALS");

    public static final SubLSymbol _CSETF_EKS_INTERNALS = makeSymbol("_CSETF-EKS-INTERNALS");

    private static final SubLSymbol EKS_KNOWLEDGE_SOURCE = makeSymbol("EKS-KNOWLEDGE-SOURCE");

    public static final SubLSymbol _CSETF_EKS_KNOWLEDGE_SOURCE = makeSymbol("_CSETF-EKS-KNOWLEDGE-SOURCE");

    private static final SubLSymbol EKS_EXTERNAL_MODULE = makeSymbol("EKS-EXTERNAL-MODULE");

    public static final SubLSymbol _CSETF_EKS_EXTERNAL_MODULE = makeSymbol("_CSETF-EKS-EXTERNAL-MODULE");

    private static final SubLSymbol EKS_CYBLACK_APPLICATION = makeSymbol("EKS-CYBLACK-APPLICATION");

    public static final SubLSymbol _CSETF_EKS_CYBLACK_APPLICATION = makeSymbol("_CSETF-EKS-CYBLACK-APPLICATION");

    private static final SubLSymbol EKS_PRECONDITION_PATTERN = makeSymbol("EKS-PRECONDITION-PATTERN");

    public static final SubLSymbol _CSETF_EKS_PRECONDITION_PATTERN = makeSymbol("_CSETF-EKS-PRECONDITION-PATTERN");

    private static final SubLSymbol EKS_UNCOMPILED_PRECONDITION_PATTERN = makeSymbol("EKS-UNCOMPILED-PRECONDITION-PATTERN");

    public static final SubLSymbol _CSETF_EKS_UNCOMPILED_PRECONDITION_PATTERN = makeSymbol("_CSETF-EKS-UNCOMPILED-PRECONDITION-PATTERN");

    private static final SubLSymbol EKS_PRECONDITION_DATATYPES = makeSymbol("EKS-PRECONDITION-DATATYPES");

    public static final SubLSymbol _CSETF_EKS_PRECONDITION_DATATYPES = makeSymbol("_CSETF-EKS-PRECONDITION-DATATYPES");

    private static final SubLSymbol EKS_STIMULATION_FUNCTION = makeSymbol("EKS-STIMULATION-FUNCTION");

    public static final SubLSymbol _CSETF_EKS_STIMULATION_FUNCTION = makeSymbol("_CSETF-EKS-STIMULATION-FUNCTION");

    private static final SubLSymbol EKS_POST_PROPOSAL_FUNCTION = makeSymbol("EKS-POST-PROPOSAL-FUNCTION");

    public static final SubLSymbol _CSETF_EKS_POST_PROPOSAL_FUNCTION = makeSymbol("_CSETF-EKS-POST-PROPOSAL-FUNCTION");

    private static final SubLSymbol EKS_GENERATE_KSI_FUNCTION = makeSymbol("EKS-GENERATE-KSI-FUNCTION");

    public static final SubLSymbol _CSETF_EKS_GENERATE_KSI_FUNCTION = makeSymbol("_CSETF-EKS-GENERATE-KSI-FUNCTION");



    private static final SubLSymbol $INTERNALS = makeKeyword("INTERNALS");

    private static final SubLSymbol $KNOWLEDGE_SOURCE = makeKeyword("KNOWLEDGE-SOURCE");

    private static final SubLSymbol $EXTERNAL_MODULE = makeKeyword("EXTERNAL-MODULE");

    private static final SubLSymbol $CYBLACK_APPLICATION = makeKeyword("CYBLACK-APPLICATION");

    private static final SubLSymbol $PRECONDITION_PATTERN = makeKeyword("PRECONDITION-PATTERN");

    private static final SubLSymbol $UNCOMPILED_PRECONDITION_PATTERN = makeKeyword("UNCOMPILED-PRECONDITION-PATTERN");

    private static final SubLSymbol $PRECONDITION_DATATYPES = makeKeyword("PRECONDITION-DATATYPES");

    private static final SubLSymbol $STIMULATION_FUNCTION = makeKeyword("STIMULATION-FUNCTION");

    private static final SubLSymbol $POST_PROPOSAL_FUNCTION = makeKeyword("POST-PROPOSAL-FUNCTION");

    private static final SubLSymbol $GENERATE_KSI_FUNCTION = makeKeyword("GENERATE-KSI-FUNCTION");

    static private final SubLString $str_alt41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt42 = list(makeSymbol("EKS"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    static private final SubLString $$$eks = makeString("eks");

    private static final SubLSymbol EKS_ = makeSymbol("EKS-");

    static private final SubLString $$$lock = makeString("lock");





    static private final SubLList $list_alt48 = list(new SubLObject[]{ makeSymbol("LOCK"), makeSymbol("INTERNALS"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-APPLICATION"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"), makeSymbol("PRECONDITION-DATATYPES"), makeSymbol("STIMULATION-FUNCTION"), makeSymbol("POST-PROPOSAL-FUNCTION"), makeSymbol("GENERATE-KSI-FUNCTION") });

    static private final SubLList $list_alt49 = list(makeSymbol("LOCK"));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_structures_file();
    }

    public void initializeVariables() {
        init_cyblack_structures_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_structures_file();
    }
}

