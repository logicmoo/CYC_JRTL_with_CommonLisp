package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_storage_modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hl_storage_modules";
    public static final String myFingerPrint = "99ed41b198c69db701e9e4c8a6f44c4592173ccb31a13ea7704094b7eae5783c";
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 897L)
    private static SubLSymbol $hl_storage_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 1024L)
    private static SubLSymbol $predicate_generic_hl_storage_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 1160L)
    private static SubLSymbol $predicate_specific_hl_storage_modules_table$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 1395L)
    private static SubLSymbol $argument_type_specific_hl_storage_modules_table$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 10380L)
    public static SubLSymbol $currently_executing_hl_storage_module$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 23341L)
    private static SubLSymbol $hl_storage_module_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 30779L)
    private static SubLSymbol $solely_specific_hl_storage_module_predicate_store$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 38732L)
    private static SubLSymbol $successful_hl_storage_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 41248L)
    private static SubLSymbol $robustly_remove_uncanonical_decontextualized_assertiblesP$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 43506L)
    private static SubLSymbol $dummy_asserted_argument_spec$;
    private static final SubLSymbol $sym0$_HL_STORAGE_MODULES_;
    private static final SubLSymbol $sym1$_PREDICATE_GENERIC_HL_STORAGE_MODULES_;
    private static final SubLSymbol $sym2$_PREDICATE_SPECIFIC_HL_STORAGE_MODULES_TABLE_;
    private static final SubLSymbol $sym3$_ARGUMENT_TYPE_SPECIFIC_HL_STORAGE_MODULES_TABLE_;
    private static final SubLSymbol $sym4$CONSP;
    private static final SubLSymbol $sym5$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym6$HL_MODULE_P;
    private static final SubLSymbol $kw7$ADD;
    private static final SubLSymbol $kw8$REMOVE;
    private static final SubLSymbol $kw9$REMOVE_ALL;
    private static final SubLSymbol $kw10$ARGUMENT;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CLET;
    private static final SubLSymbol $sym13$_CURRENTLY_EXECUTING_HL_STORAGE_MODULE_;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$ALL;
    private static final SubLSymbol $kw16$INCOMPLETENESS;
    private static final SubLSymbol $kw17$ARGUMENT_TYPE;
    private static final SubLSymbol $kw18$SENSE;
    private static final SubLSymbol $kw19$DIRECTION;
    private static final SubLSymbol $kw20$REQUIRED_MT;
    private static final SubLSymbol $kw21$PREDICATE;
    private static final SubLSymbol $kw22$ANY_PREDICATES;
    private static final SubLSymbol $kw23$APPLICABILITY;
    private static final SubLSymbol $kw24$APPLICABILITY_PATTERN;
    private static final SubLSymbol $kw25$EXCLUSIVE;
    private static final SubLSymbol $kw26$SUPPLANTS;
    private static final SubLSymbol $kw27$PREFERRED_OVER;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$KEYWORDP;
    private static final SubLSymbol $sym30$PROPERTY_LIST_P;
    private static final SubLSymbol $sym31$HL_STORAGE_MODULE_PROPERTY_P;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw34$PRETTY_NAME;
    private static final SubLSymbol $kw35$MODULE_SUBTYPE;
    private static final SubLSymbol $kw36$MODULE_SOURCE;
    private static final SubLSymbol $kw37$DOCUMENTATION;
    private static final SubLSymbol $sym38$STRINGP;
    private static final SubLSymbol $sym39$ARGUMENT_TYPE_P;
    private static final SubLSymbol $sym40$SYMBOLP;
    private static final SubLSymbol $sym41$HLMT_P;
    private static final SubLSymbol $sym42$HL_STORAGE_MODULE_APPLICABILITY_PATTERN_P;
    private static final SubLSymbol $sym43$SENSE_P;
    private static final SubLSymbol $sym44$DIRECTION_P;
    private static final SubLSymbol $sym45$FORT_P;
    private static final SubLSymbol $sym46$CONSTANT_P;
    private static final SubLList $list47;
    private static final SubLSymbol $kw48$STORAGE;
    private static final SubLSymbol $kw49$POS;
    private static final SubLSymbol $kw50$NEG;
    private static final SubLSymbol $sym51$_SOLELY_SPECIFIC_HL_STORAGE_MODULE_PREDICATE_STORE_;
    private static final SubLInteger $int52$50;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$ASS;
    private static final SubLSymbol $sym56$ASENT;
    private static final SubLSymbol $sym57$PROGN;
    private static final SubLSymbol $sym58$DO_ASSERTIONS;
    private static final SubLSymbol $sym59$ASSERTION_TO_HL_ASSERTION_SPEC;
    private static final SubLSymbol $sym60$DO_BOOKKEEPING_ASENTS;
    private static final SubLSymbol $sym61$BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$HL_ASSERTION_SPEC_VAR;
    private static final SubLSymbol $sym64$HL_ASSERTION_SPEC_CNF;
    private static final SubLSymbol $sym65$HL_ASSERTION_SPEC_MT;
    private static final SubLSymbol $sym66$HL_ASSERTION_SPEC_DIRECTION;
    private static final SubLSymbol $sym67$HL_ASSERTION_SPEC_VARIABLE_MAP;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$ASS;
    private static final SubLSymbol $sym70$ASENT;
    private static final SubLSymbol $sym71$ASSERTIBLES;
    private static final SubLSymbol $sym72$ASSERTION_TO_HL_ASSERTIBLES;
    private static final SubLSymbol $sym73$CDOLIST;
    private static final SubLSymbol $sym74$BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$HL_ASSERTIBLE_VAR;
    private static final SubLSymbol $sym77$HL_ASSERTION_SPEC_VAR;
    private static final SubLSymbol $sym78$HL_ASSERTIBLE_ARGUMENT_SPEC;
    private static final SubLSymbol $sym79$HL_ASSERTIBLE_HL_ASSERTION_SPEC;
    private static final SubLSymbol $sym80$DESTRUCTURE_HL_ASSERTION_SPEC;
    private static final SubLSymbol $sym81$HL_ASSERTIBLE_P;
    private static final SubLSymbol $sym82$ARGUMENT_SPEC_P;
    private static final SubLSymbol $sym83$CNF_P;
    private static final SubLSymbol $sym84$LISTP;
    private static final SubLSymbol $sym85$TL_ADD_ARGUMENT;
    private static final SubLSymbol $sym86$TL_REMOVE_ARGUMENT;
    private static final SubLSymbol $sym87$TL_REMOVE_ALL_ARGUMENTS;
    private static final SubLList $list88;
    private static final SubLString $str89$Unexpected_HL_storage_action__a;
    private static final SubLSymbol $sym90$_DUMMY_ASSERTED_ARGUMENT_SPEC_;
    private static final SubLSymbol $kw91$UNSPECIFIED;
    private static final SubLSymbol $kw92$FORWARD;
    private static final SubLObject $const93$False;
    private static final SubLObject $const94$True;
    private static final SubLList $list95;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 1585L)
    public static SubLObject hl_storage_module(final SubLObject name, final SubLObject plist) {
        final SubLObject hl_module = setup_hl_storage_module(name, plist);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 1850L)
    public static SubLObject undeclare_hl_storage_module(final SubLObject name) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (hl_storage_modules.NIL != hl_module) {
            remove_hl_storage_module(hl_module);
            final SubLObject pred = hl_storage_module_predicate(hl_module);
            if (hl_storage_modules.NIL != forts.fort_p(pred)) {
                remove_hl_storage_module_from_predicate_specific_hl_module_cache(pred, hl_module);
            }
            else {
                remove_hl_storage_module_from_generic_hl_module_cache(hl_module);
            }
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 2276L)
    public static SubLObject try_hl_add_modules(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        assert hl_storage_modules.NIL != Types.consp(hl_modules) : hl_modules;
        assert hl_storage_modules.NIL != list_utilities.non_dotted_list_p(hl_modules) : hl_modules;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject elem = (SubLObject)hl_storage_modules.NIL;
        elem = cdolist_list_var.first();
        while (hl_storage_modules.NIL != cdolist_list_var) {
            assert hl_storage_modules.NIL != inference_modules.hl_module_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return try_hl_storage_modules_int(hl_modules, argument_spec, cnf, mt, direction, variable_map, (SubLObject)hl_storage_modules.$kw7$ADD, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 7790L)
    public static SubLObject try_hl_remove_modules(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        assert hl_storage_modules.NIL != Types.consp(hl_modules) : hl_modules;
        assert hl_storage_modules.NIL != list_utilities.non_dotted_list_p(hl_modules) : hl_modules;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject elem = (SubLObject)hl_storage_modules.NIL;
        elem = cdolist_list_var.first();
        while (hl_storage_modules.NIL != cdolist_list_var) {
            assert hl_storage_modules.NIL != inference_modules.hl_module_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return try_hl_storage_modules_int(hl_modules, argument_spec, cnf, mt, (SubLObject)hl_storage_modules.NIL, (SubLObject)hl_storage_modules.NIL, (SubLObject)hl_storage_modules.$kw8$REMOVE, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 8162L)
    public static SubLObject try_hl_remove_all_modules(final SubLObject hl_modules, final SubLObject cnf, final SubLObject mt) {
        assert hl_storage_modules.NIL != Types.consp(hl_modules) : hl_modules;
        assert hl_storage_modules.NIL != list_utilities.non_dotted_list_p(hl_modules) : hl_modules;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject elem = (SubLObject)hl_storage_modules.NIL;
        elem = cdolist_list_var.first();
        while (hl_storage_modules.NIL != cdolist_list_var) {
            assert hl_storage_modules.NIL != inference_modules.hl_module_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return try_hl_storage_modules_int(hl_modules, (SubLObject)hl_storage_modules.NIL, cnf, mt, (SubLObject)hl_storage_modules.NIL, (SubLObject)hl_storage_modules.NIL, (SubLObject)hl_storage_modules.$kw9$REMOVE_ALL, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 8520L)
    public static SubLObject hl_storage_modules_for_predicate_and_argument_type(final SubLObject predicate, final SubLObject argument_type) {
        return keyhash_utilities.fast_intersection(hl_storage_modules_for_predicate(predicate), hl_storage_modules_for_argument_type(argument_type), (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 8835L)
    public static SubLObject hl_storage_modules_for_predicate(final SubLObject predicate) {
        return conses_high.copy_list(dictionary.dictionary_lookup(hl_storage_modules.$predicate_specific_hl_storage_modules_table$.getGlobalValue(), predicate, (SubLObject)hl_storage_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 8993L)
    public static SubLObject predicate_has_specific_hl_storage_modulesP(final SubLObject predicate) {
        return list_utilities.sublisp_boolean(hl_storage_modules_for_predicate(predicate));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 9128L)
    public static SubLObject predicates_with_specific_hl_storage_modules() {
        return dictionary.dictionary_keys(hl_storage_modules.$predicate_specific_hl_storage_modules_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 9267L)
    public static SubLObject predicate_generic_hl_storage_modules() {
        return set.set_element_list(hl_storage_modules.$predicate_generic_hl_storage_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 9392L)
    public static SubLObject hl_storage_modules_for_argument_type(final SubLObject argument_type) {
        final SubLObject v_genls = arguments.argument_type_genls(argument_type);
        SubLObject hl_modules = (SubLObject)hl_storage_modules.NIL;
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = (SubLObject)hl_storage_modules.NIL;
        genl = cdolist_list_var.first();
        while (hl_storage_modules.NIL != cdolist_list_var) {
            hl_modules = ConsesLow.nconc(hl_modules, hl_storage_modules_for_just_argument_type(genl));
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 9676L)
    public static SubLObject generic_hl_storage_modules() {
        return keyhash_utilities.fast_intersection(predicate_generic_hl_storage_modules(), hl_storage_modules_for_argument_type((SubLObject)hl_storage_modules.$kw10$ARGUMENT), (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 9918L)
    public static SubLObject generic_hl_storage_module_count() {
        return conses_high.list_length(generic_hl_storage_modules());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 10022L)
    public static SubLObject hl_storage_modules_for_just_argument_type(final SubLObject argument_type) {
        return conses_high.copy_list(dictionary.dictionary_lookup_without_values(hl_storage_modules.$argument_type_specific_hl_storage_modules_table$.getGlobalValue(), argument_type, (SubLObject)hl_storage_modules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 10496L)
    public static SubLObject currently_executing_hl_storage_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hl_storage_modules.$currently_executing_hl_storage_module$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 10605L)
    public static SubLObject within_hl_storage_module_execution(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject hl_storage_module = (SubLObject)hl_storage_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list11);
        hl_storage_module = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)hl_storage_modules.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym13$_CURRENTLY_EXECUTING_HL_STORAGE_MODULE_, hl_storage_module)), ConsesLow.append(body, (SubLObject)hl_storage_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 10853L)
    public static SubLObject try_hl_storage_modules_int(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map, final SubLObject action, SubLObject v_default) {
        if (v_default == hl_storage_modules.UNPROVIDED) {
            v_default = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)hl_storage_modules.NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)hl_storage_modules.FOUR_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)hl_storage_modules.T, thread);
            thread.resetMultipleValues();
            final SubLObject applicable_hl_modules = applicable_hl_storage_modules(hl_modules, argument_spec, cnf, mt, direction, variable_map);
            final SubLObject dispreferred_hl_modules = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject sorted_applicable_hl_modules = sort_hl_storage_modules_by_cost(applicable_hl_modules, argument_spec, cnf, mt, direction, variable_map);
            if (hl_storage_modules.NIL == successP) {
                SubLObject csome_list_var = sorted_applicable_hl_modules;
                SubLObject hl_module = (SubLObject)hl_storage_modules.NIL;
                hl_module = csome_list_var.first();
                while (hl_storage_modules.NIL == successP && hl_storage_modules.NIL != csome_list_var) {
                    successP = apply_hl_storage_module(hl_module, argument_spec, cnf, mt, direction, variable_map, action, v_default);
                    if (hl_storage_modules.NIL != successP) {
                        note_successful_hl_storage_module(hl_module);
                    }
                    csome_list_var = csome_list_var.rest();
                    hl_module = csome_list_var.first();
                }
            }
            if (hl_storage_modules.NIL == successP) {
                final SubLObject sorted_dispreferred_hl_modules = sort_dispreferred_hl_storage_modules_by_cost(dispreferred_hl_modules, argument_spec, cnf, mt, direction, variable_map);
                SubLObject rest;
                SubLObject cons;
                SubLObject current;
                SubLObject datum;
                SubLObject dispreferred_hl_module;
                SubLObject preferred_modules;
                SubLObject dispreferP;
                SubLObject csome_list_var2;
                SubLObject preferred_module;
                for (rest = (SubLObject)hl_storage_modules.NIL, rest = sorted_dispreferred_hl_modules; hl_storage_modules.NIL == successP && hl_storage_modules.NIL != rest; rest = rest.rest()) {
                    cons = rest.first();
                    datum = (current = cons);
                    dispreferred_hl_module = (SubLObject)hl_storage_modules.NIL;
                    preferred_modules = (SubLObject)hl_storage_modules.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list14);
                    dispreferred_hl_module = current.first();
                    current = (preferred_modules = current.rest());
                    dispreferP = (SubLObject)hl_storage_modules.NIL;
                    if (hl_storage_modules.NIL == dispreferP) {
                        csome_list_var2 = preferred_modules;
                        preferred_module = (SubLObject)hl_storage_modules.NIL;
                        preferred_module = csome_list_var2.first();
                        while (hl_storage_modules.NIL == dispreferP && hl_storage_modules.NIL != csome_list_var2) {
                            if (hl_storage_modules.NIL != hl_storage_module_successfulP(preferred_module)) {
                                dispreferP = (SubLObject)hl_storage_modules.T;
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            preferred_module = csome_list_var2.first();
                        }
                    }
                    if (hl_storage_modules.NIL == dispreferP) {
                        successP = apply_hl_storage_module(dispreferred_hl_module, argument_spec, cnf, mt, direction, variable_map, action, v_default);
                        if (hl_storage_modules.NIL != successP) {
                            note_successful_hl_storage_module(dispreferred_hl_module);
                        }
                    }
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 12732L)
    public static SubLObject apply_hl_storage_module(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map, final SubLObject action, final SubLObject v_default) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)hl_storage_modules.NIL;
        final SubLObject _prev_bind_0 = hl_storage_modules.$currently_executing_hl_storage_module$.currentBinding(thread);
        try {
            hl_storage_modules.$currently_executing_hl_storage_module$.bind(hl_module, thread);
            if (action.eql((SubLObject)hl_storage_modules.$kw7$ADD)) {
                successP = hl_storage_module_add(hl_module, argument_spec, cnf, mt, direction, variable_map, v_default);
            }
            else if (action.eql((SubLObject)hl_storage_modules.$kw8$REMOVE)) {
                successP = hl_storage_module_remove(hl_module, argument_spec, cnf, mt, v_default);
            }
            else if (action.eql((SubLObject)hl_storage_modules.$kw9$REMOVE_ALL)) {
                successP = hl_storage_module_remove_all(hl_module, cnf, mt, v_default);
            }
        }
        finally {
            hl_storage_modules.$currently_executing_hl_storage_module$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 13256L)
    public static SubLObject hl_storage_module_name(final SubLObject hl_module) {
        return inference_modules.hl_module_name(hl_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 13374L)
    public static SubLObject hl_storage_module_applicableP(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject applicable_func = hl_storage_module_applicability_func(hl_module);
        if (hl_storage_modules.NIL != Symbols.fboundp(applicable_func)) {
            return Functions.funcall(applicable_func, argument_spec, cnf, mt, direction, variable_map);
        }
        return hl_storage_module_applicable_intP(hl_module, argument_spec, cnf, mt, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 13767L)
    public static SubLObject applicable_hl_storage_modules(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supplanted_hl_modules = (SubLObject)hl_storage_modules.NIL;
        SubLObject dispreferred_hl_modules = (SubLObject)hl_storage_modules.NIL;
        SubLObject applicable_hl_modules = (SubLObject)hl_storage_modules.NIL;
        SubLObject exclusive_foundP = (SubLObject)hl_storage_modules.NIL;
        if (hl_storage_modules.NIL == exclusive_foundP) {
            SubLObject csome_list_var = hl_modules;
            SubLObject hl_module = (SubLObject)hl_storage_modules.NIL;
            hl_module = csome_list_var.first();
            while (hl_storage_modules.NIL == exclusive_foundP && hl_storage_modules.NIL != csome_list_var) {
                if (hl_storage_modules.NIL == subl_promotions.memberP(hl_module, supplanted_hl_modules, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED) && (hl_storage_modules.NIL != list_utilities.alist_lookup_without_values(dispreferred_hl_modules, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED) || hl_storage_modules.NIL != hl_storage_module_applicableP(hl_module, argument_spec, cnf, mt, direction, variable_map))) {
                    final SubLObject exclusive_func = hl_storage_module_exclusive_func(hl_module);
                    if (hl_storage_modules.NIL == exclusive_func || (exclusive_func.isFunctionSpec() && hl_storage_modules.NIL != Functions.funcall(exclusive_func, argument_spec, cnf, mt, direction, variable_map))) {
                        if (hl_storage_modules.NIL != exclusive_func) {
                            thread.resetMultipleValues();
                            final SubLObject exclusive_foundP_$1 = update_supplanted_hl_storage_modules_wrt_applicable_modules(hl_module, applicable_hl_modules, supplanted_hl_modules);
                            final SubLObject applicable_hl_modules_$2 = thread.secondMultipleValue();
                            final SubLObject supplanted_hl_modules_$3 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            exclusive_foundP = exclusive_foundP_$1;
                            applicable_hl_modules = applicable_hl_modules_$2;
                            supplanted_hl_modules = supplanted_hl_modules_$3;
                        }
                        if (hl_storage_modules.NIL == exclusive_foundP) {
                            thread.resetMultipleValues();
                            final SubLObject applicable_hl_modules_$3 = update_dispreferred_hl_storage_modules_wrt_applicable_modules(hl_module, applicable_hl_modules, dispreferred_hl_modules, hl_modules, argument_spec, cnf, mt, direction, variable_map);
                            final SubLObject dispreferred_hl_modules_$5 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            applicable_hl_modules = applicable_hl_modules_$3;
                            dispreferred_hl_modules = dispreferred_hl_modules_$5;
                        }
                        if (hl_storage_modules.NIL != exclusive_foundP || hl_storage_modules.NIL == list_utilities.alist_lookup(dispreferred_hl_modules, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED)) {
                            applicable_hl_modules = (SubLObject)ConsesLow.cons(hl_module, applicable_hl_modules);
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                hl_module = csome_list_var.first();
            }
        }
        return Values.values(Sequences.nreverse(applicable_hl_modules), (SubLObject)((hl_storage_modules.NIL != exclusive_foundP) ? hl_storage_modules.NIL : dispreferred_hl_modules));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 15489L)
    public static SubLObject update_dispreferred_hl_storage_modules_wrt_applicable_modules(final SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject dispreferred_hl_modules, final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject pcase_var;
        final SubLObject preferred_over_info = pcase_var = hl_storage_module_preferred_over_info(hl_module);
        SubLObject cdolist_list_var;
        final SubLObject newly_dispreferred_module_names = cdolist_list_var = preferred_over_info;
        SubLObject dispreferred_module_name = (SubLObject)hl_storage_modules.NIL;
        dispreferred_module_name = cdolist_list_var.first();
        while (hl_storage_modules.NIL != cdolist_list_var) {
            final SubLObject dispreferred_hl_module = inference_modules.find_hl_module_by_name(dispreferred_module_name);
            if (hl_storage_modules.NIL != subl_promotions.memberP(dispreferred_hl_module, hl_modules, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED)) {
                if (hl_storage_modules.NIL != subl_promotions.memberP(dispreferred_hl_module, applicable_hl_modules, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED)) {
                    applicable_hl_modules = Sequences.delete(dispreferred_hl_module, applicable_hl_modules, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
                    dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED);
                }
                else if (hl_storage_modules.NIL != list_utilities.alist_lookup(dispreferred_hl_modules, dispreferred_hl_module, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED)) {
                    dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED);
                }
                else if (hl_storage_modules.NIL != hl_storage_module_applicableP(dispreferred_hl_module, argument_spec, cnf, mt, direction, variable_map)) {
                    dispreferred_hl_modules = list_utilities.alist_push(dispreferred_hl_modules, dispreferred_hl_module, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            dispreferred_module_name = cdolist_list_var.first();
        }
        return Values.values(applicable_hl_modules, dispreferred_hl_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 17093L)
    public static SubLObject update_supplanted_hl_storage_modules_wrt_applicable_modules(final SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        final SubLObject supplants_info = hl_storage_module_supplants_info(hl_module);
        SubLObject exclusive_foundP = (SubLObject)hl_storage_modules.NIL;
        final SubLObject pcase_var = supplants_info;
        if (pcase_var.eql((SubLObject)hl_storage_modules.$kw15$ALL)) {
            applicable_hl_modules = (SubLObject)hl_storage_modules.NIL;
            exclusive_foundP = (SubLObject)hl_storage_modules.T;
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject newly_supplanted_module_names = cdolist_list_var = supplants_info;
            SubLObject supplanted_module_name = (SubLObject)hl_storage_modules.NIL;
            supplanted_module_name = cdolist_list_var.first();
            while (hl_storage_modules.NIL != cdolist_list_var) {
                final SubLObject supplanted_hl_module = inference_modules.find_hl_module_by_name(supplanted_module_name);
                supplanted_hl_modules = (SubLObject)ConsesLow.cons(supplanted_hl_module, supplanted_hl_modules);
                applicable_hl_modules = Sequences.delete(supplanted_hl_module, applicable_hl_modules, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                supplanted_module_name = cdolist_list_var.first();
            }
        }
        return Values.values(exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 18277L)
    public static SubLObject sort_hl_storage_modules_by_cost(final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 18458L)
    public static SubLObject sort_dispreferred_hl_storage_modules_by_cost(final SubLObject dispreferred_hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        return dispreferred_hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 19167L)
    public static SubLObject hl_storage_module_incompleteness(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map, SubLObject v_default) {
        if (v_default == hl_storage_modules.UNPROVIDED) {
            v_default = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLObject incompleteness_func = get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw16$INCOMPLETENESS);
        return (hl_storage_modules.NIL != incompleteness_func) ? Functions.funcall(incompleteness_func, argument_spec, cnf, mt, direction, variable_map) : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 19737L)
    public static SubLObject hl_storage_module_add(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map, SubLObject v_default) {
        if (v_default == hl_storage_modules.UNPROVIDED) {
            v_default = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLObject add_func = get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw7$ADD);
        return (hl_storage_modules.NIL != add_func) ? Functions.funcall(add_func, argument_spec, cnf, mt, direction, variable_map) : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 20195L)
    public static SubLObject hl_storage_module_remove(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, SubLObject v_default) {
        if (v_default == hl_storage_modules.UNPROVIDED) {
            v_default = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLObject remove_func = get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw8$REMOVE);
        return (hl_storage_modules.NIL != remove_func) ? Functions.funcall(remove_func, argument_spec, cnf, mt) : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 20599L)
    public static SubLObject hl_storage_module_remove_all(final SubLObject hl_module, final SubLObject cnf, final SubLObject mt, SubLObject v_default) {
        if (v_default == hl_storage_modules.UNPROVIDED) {
            v_default = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLObject remove_all_func = get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw9$REMOVE_ALL);
        return (hl_storage_modules.NIL != remove_all_func) ? Functions.funcall(remove_all_func, cnf, mt) : v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 20982L)
    public static SubLObject hl_storage_module_argument_type(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw17$ARGUMENT_TYPE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 21110L)
    public static SubLObject hl_storage_module_sense(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw18$SENSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 21221L)
    public static SubLObject hl_storage_module_direction(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw19$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 21340L)
    public static SubLObject hl_storage_module_required_mt(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw20$REQUIRED_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 21463L)
    public static SubLObject hl_storage_module_predicate(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw21$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 21582L)
    public static SubLObject hl_storage_module_any_predicates(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw22$ANY_PREDICATES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 21711L)
    public static SubLObject hl_storage_module_applicability_func(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject applicability_func = get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw23$APPLICABILITY);
        final SubLObject defaultP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (hl_storage_modules.NIL != defaultP) {
            return (SubLObject)hl_storage_modules.NIL;
        }
        return applicability_func;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 22146L)
    public static SubLObject hl_storage_module_applicability_pattern(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw24$APPLICABILITY_PATTERN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 22289L)
    public static SubLObject hl_storage_module_exclusive_func(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw25$EXCLUSIVE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 22413L)
    public static SubLObject hl_storage_module_supplants_info(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw26$SUPPLANTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 22539L)
    public static SubLObject hl_storage_module_preferred_over_info(final SubLObject hl_module) {
        return get_hl_storage_module_property(hl_module, (SubLObject)hl_storage_modules.$kw27$PREFERRED_OVER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 22673L)
    public static SubLObject get_hl_storage_module_property(final SubLObject hl_module, final SubLObject indicator) {
        return inference_modules.hl_module_property(hl_module, indicator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 22793L)
    public static SubLObject reclassify_hl_storage_modules() {
        clear_hl_storage_module_indexes();
        rebuild_solely_specific_hl_storage_module_predicate_store();
        final SubLObject set_contents_var = set.do_set_internal(hl_storage_modules.$hl_storage_modules$.getGlobalValue());
        SubLObject basis_object;
        SubLObject state;
        SubLObject hl_module;
        SubLObject predicate;
        SubLObject argument_type;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)hl_storage_modules.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); hl_storage_modules.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            hl_module = set_contents.do_set_contents_next(basis_object, state);
            if (hl_storage_modules.NIL != set_contents.do_set_contents_element_validP(state, hl_module)) {
                predicate = hl_storage_module_predicate(hl_module);
                argument_type = hl_storage_module_argument_type(hl_module);
                classify_hl_storage_module(hl_module, predicate, argument_type);
            }
        }
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 23746L)
    public static SubLObject hl_storage_module_properties() {
        return hl_storage_modules.$hl_storage_module_properties$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 23837L)
    public static SubLObject hl_storage_module_property_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, hl_storage_modules.$hl_storage_module_properties$.getGlobalValue(), (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 23949L)
    public static SubLObject remove_hl_storage_module(final SubLObject hl_module) {
        final SubLObject argument_type = hl_storage_module_argument_type(hl_module);
        inference_modules.remove_hl_module(hl_module);
        dictionary_utilities.dictionary_remove_from_value(hl_storage_modules.$argument_type_specific_hl_storage_modules_table$.getGlobalValue(), argument_type, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
        set.set_remove(hl_module, hl_storage_modules.$hl_storage_modules$.getGlobalValue());
        return hl_storage_modules.$hl_storage_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 24297L)
    public static SubLObject remove_hl_storage_module_from_generic_hl_module_cache(final SubLObject hl_module) {
        set.set_remove(hl_module, hl_storage_modules.$predicate_generic_hl_storage_modules$.getGlobalValue());
        return hl_storage_modules.$predicate_generic_hl_storage_modules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 24492L)
    public static SubLObject remove_hl_storage_module_from_predicate_specific_hl_module_cache(final SubLObject pred, final SubLObject hl_module) {
        return dictionary_utilities.dictionary_remove_from_value(hl_storage_modules.$predicate_specific_hl_storage_modules_table$.getGlobalValue(), pred, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 24692L)
    public static SubLObject clear_hl_storage_module_indexes() {
        hl_storage_modules.$predicate_generic_hl_storage_modules$.setGlobalValue(set.new_set(Symbols.symbol_function((SubLObject)hl_storage_modules.EQL), (SubLObject)hl_storage_modules.UNPROVIDED));
        dictionary.clear_dictionary(hl_storage_modules.$predicate_specific_hl_storage_modules_table$.getGlobalValue());
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 24889L)
    public static SubLObject setup_hl_storage_module(final SubLObject name, final SubLObject plist) {
        assert hl_storage_modules.NIL != Types.keywordp(name) : name;
        assert hl_storage_modules.NIL != list_utilities.property_list_p(plist) : plist;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)hl_storage_modules.NIL, remainder = plist; hl_storage_modules.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert hl_storage_modules.NIL != hl_storage_module_property_p(property) : property;
        }
        SubLObject allow_other_keys_p = (SubLObject)hl_storage_modules.NIL;
        SubLObject rest = plist;
        SubLObject bad = (SubLObject)hl_storage_modules.NIL;
        SubLObject current_$6 = (SubLObject)hl_storage_modules.NIL;
        while (hl_storage_modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, plist, (SubLObject)hl_storage_modules.$list32);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, plist, (SubLObject)hl_storage_modules.$list32);
            if (hl_storage_modules.NIL == conses_high.member(current_$6, (SubLObject)hl_storage_modules.$list28, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED)) {
                bad = (SubLObject)hl_storage_modules.T;
            }
            if (current_$6 == hl_storage_modules.$kw33$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_storage_modules.NIL != bad && hl_storage_modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(plist, (SubLObject)hl_storage_modules.$list32);
        }
        final SubLObject pretty_name_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw34$PRETTY_NAME, plist);
        final SubLObject pretty_name = (SubLObject)((hl_storage_modules.NIL != pretty_name_tail) ? conses_high.cadr(pretty_name_tail) : hl_storage_modules.NIL);
        final SubLObject module_subtype_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw35$MODULE_SUBTYPE, plist);
        final SubLObject module_subtype = (SubLObject)((hl_storage_modules.NIL != module_subtype_tail) ? conses_high.cadr(module_subtype_tail) : hl_storage_modules.NIL);
        final SubLObject module_source_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw36$MODULE_SOURCE, plist);
        final SubLObject module_source = (SubLObject)((hl_storage_modules.NIL != module_source_tail) ? conses_high.cadr(module_source_tail) : hl_storage_modules.NIL);
        final SubLObject argument_type_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw17$ARGUMENT_TYPE, plist);
        final SubLObject argument_type = (SubLObject)((hl_storage_modules.NIL != argument_type_tail) ? conses_high.cadr(argument_type_tail) : hl_storage_modules.NIL);
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw18$SENSE, plist);
        final SubLObject sense = (SubLObject)((hl_storage_modules.NIL != sense_tail) ? conses_high.cadr(sense_tail) : hl_storage_modules.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw19$DIRECTION, plist);
        final SubLObject direction = (SubLObject)((hl_storage_modules.NIL != direction_tail) ? conses_high.cadr(direction_tail) : hl_storage_modules.NIL);
        final SubLObject required_mt_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw20$REQUIRED_MT, plist);
        final SubLObject required_mt = (SubLObject)((hl_storage_modules.NIL != required_mt_tail) ? conses_high.cadr(required_mt_tail) : hl_storage_modules.NIL);
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw21$PREDICATE, plist);
        final SubLObject predicate = (SubLObject)((hl_storage_modules.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : hl_storage_modules.NIL);
        final SubLObject any_predicates_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw22$ANY_PREDICATES, plist);
        final SubLObject any_predicates = (SubLObject)((hl_storage_modules.NIL != any_predicates_tail) ? conses_high.cadr(any_predicates_tail) : hl_storage_modules.NIL);
        final SubLObject applicability_pattern_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw24$APPLICABILITY_PATTERN, plist);
        final SubLObject applicability_pattern = (SubLObject)((hl_storage_modules.NIL != applicability_pattern_tail) ? conses_high.cadr(applicability_pattern_tail) : hl_storage_modules.NIL);
        final SubLObject applicability_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw23$APPLICABILITY, plist);
        final SubLObject applicability = (SubLObject)((hl_storage_modules.NIL != applicability_tail) ? conses_high.cadr(applicability_tail) : hl_storage_modules.NIL);
        final SubLObject supplants_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw26$SUPPLANTS, plist);
        final SubLObject supplants = (SubLObject)((hl_storage_modules.NIL != supplants_tail) ? conses_high.cadr(supplants_tail) : hl_storage_modules.NIL);
        final SubLObject exclusive_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw25$EXCLUSIVE, plist);
        final SubLObject exclusive = (SubLObject)((hl_storage_modules.NIL != exclusive_tail) ? conses_high.cadr(exclusive_tail) : hl_storage_modules.NIL);
        final SubLObject preferred_over_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw27$PREFERRED_OVER, plist);
        final SubLObject preferred_over = (SubLObject)((hl_storage_modules.NIL != preferred_over_tail) ? conses_high.cadr(preferred_over_tail) : hl_storage_modules.NIL);
        final SubLObject incompleteness_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw16$INCOMPLETENESS, plist);
        final SubLObject incompleteness = (SubLObject)((hl_storage_modules.NIL != incompleteness_tail) ? conses_high.cadr(incompleteness_tail) : hl_storage_modules.NIL);
        final SubLObject add_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw7$ADD, plist);
        final SubLObject add = (SubLObject)((hl_storage_modules.NIL != add_tail) ? conses_high.cadr(add_tail) : hl_storage_modules.NIL);
        final SubLObject remove_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw8$REMOVE, plist);
        final SubLObject remove = (SubLObject)((hl_storage_modules.NIL != remove_tail) ? conses_high.cadr(remove_tail) : hl_storage_modules.NIL);
        final SubLObject remove_all_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw9$REMOVE_ALL, plist);
        final SubLObject remove_all = (SubLObject)((hl_storage_modules.NIL != remove_all_tail) ? conses_high.cadr(remove_all_tail) : hl_storage_modules.NIL);
        final SubLObject documentation_tail = cdestructuring_bind.property_list_member((SubLObject)hl_storage_modules.$kw37$DOCUMENTATION, plist);
        final SubLObject documentation = (SubLObject)((hl_storage_modules.NIL != documentation_tail) ? conses_high.cadr(documentation_tail) : hl_storage_modules.NIL);
        assert hl_storage_modules.NIL != Types.stringp(pretty_name) : pretty_name;
        assert hl_storage_modules.NIL != arguments.argument_type_p(argument_type) : argument_type;
        assert hl_storage_modules.NIL != Types.symbolp(incompleteness) : incompleteness;
        assert hl_storage_modules.NIL != Types.symbolp(add) : add;
        assert hl_storage_modules.NIL != Types.symbolp(remove) : remove;
        assert hl_storage_modules.NIL != Types.symbolp(remove_all) : remove_all;
        if (hl_storage_modules.NIL != applicability) {
            assert hl_storage_modules.NIL != Types.symbolp(applicability) : applicability;
        }
        else {
            assert hl_storage_modules.NIL != hlmt.hlmt_p(required_mt) : required_mt;
            assert hl_storage_modules.NIL != hl_storage_module_applicability_pattern_p(applicability_pattern) : applicability_pattern;
            if (hl_storage_modules.NIL != sense && !hl_storage_modules.assertionsDisabledSynth && hl_storage_modules.NIL == enumeration_types.sense_p(sense)) {
                throw new AssertionError(sense);
            }
            if (hl_storage_modules.NIL != direction && !hl_storage_modules.assertionsDisabledSynth && hl_storage_modules.NIL == enumeration_types.direction_p(direction)) {
                throw new AssertionError(direction);
            }
        }
        if (hl_storage_modules.NIL != module_subtype && !hl_storage_modules.assertionsDisabledSynth && hl_storage_modules.NIL == Types.keywordp(module_subtype)) {
            throw new AssertionError(module_subtype);
        }
        if (hl_storage_modules.NIL != module_source && !hl_storage_modules.assertionsDisabledSynth && hl_storage_modules.NIL == forts.fort_p(module_source)) {
            throw new AssertionError(module_source);
        }
        if (hl_storage_modules.NIL != supplants) {
            final SubLObject list_var = supplants;
            assert hl_storage_modules.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
            SubLObject cdolist_list_var = list_var;
            SubLObject elem = (SubLObject)hl_storage_modules.NIL;
            elem = cdolist_list_var.first();
            while (hl_storage_modules.NIL != cdolist_list_var) {
                assert hl_storage_modules.NIL != Types.keywordp(elem) : elem;
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
        }
        if (hl_storage_modules.NIL != exclusive && !hl_storage_modules.assertionsDisabledSynth && hl_storage_modules.NIL == Types.symbolp(exclusive)) {
            throw new AssertionError(exclusive);
        }
        if (hl_storage_modules.NIL != preferred_over) {
            final SubLObject list_var = preferred_over;
            assert hl_storage_modules.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
            SubLObject cdolist_list_var = list_var;
            SubLObject elem = (SubLObject)hl_storage_modules.NIL;
            elem = cdolist_list_var.first();
            while (hl_storage_modules.NIL != cdolist_list_var) {
                assert hl_storage_modules.NIL != Types.keywordp(elem) : elem;
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
        }
        if (hl_storage_modules.NIL != predicate && !hl_storage_modules.assertionsDisabledSynth && hl_storage_modules.NIL == constant_handles.constant_p(predicate)) {
            throw new AssertionError(predicate);
        }
        if (hl_storage_modules.NIL != any_predicates) {
            final SubLObject list_var = any_predicates;
            assert hl_storage_modules.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
            SubLObject cdolist_list_var = list_var;
            SubLObject elem = (SubLObject)hl_storage_modules.NIL;
            elem = cdolist_list_var.first();
            while (hl_storage_modules.NIL != cdolist_list_var) {
                assert hl_storage_modules.NIL != forts.fort_p(elem) : elem;
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            }
        }
        if (hl_storage_modules.NIL != documentation && !hl_storage_modules.assertionsDisabledSynth && hl_storage_modules.NIL == Types.stringp(documentation)) {
            throw new AssertionError(documentation);
        }
        return register_hl_storage_module(name, plist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 26551L)
    public static SubLObject hl_storage_module_applicability_pattern_p(final SubLObject pattern) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_modules.NIL != subl_promotions.memberP(pattern, (SubLObject)hl_storage_modules.$list47, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED) || pattern.isList());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 26696L)
    public static SubLObject register_hl_storage_module(final SubLObject name, final SubLObject plist) {
        final SubLObject hl_module = inference_modules.setup_module(name, (SubLObject)hl_storage_modules.$kw48$STORAGE, plist);
        set.set_add(hl_module, hl_storage_modules.$hl_storage_modules$.getGlobalValue());
        final SubLObject predicate = conses_high.getf(plist, (SubLObject)hl_storage_modules.$kw21$PREDICATE, (SubLObject)hl_storage_modules.UNPROVIDED);
        final SubLObject argument_type = conses_high.getf(plist, (SubLObject)hl_storage_modules.$kw17$ARGUMENT_TYPE, (SubLObject)hl_storage_modules.UNPROVIDED);
        classify_hl_storage_module(hl_module, predicate, argument_type);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 27045L)
    public static SubLObject classify_hl_storage_module(final SubLObject hl_module, final SubLObject predicate, final SubLObject argument_type) {
        if (hl_storage_modules.NIL != predicate) {
            register_predicate_specific_hl_storage_module(hl_module, predicate);
        }
        else {
            register_predicate_generic_hl_storage_module(hl_module);
        }
        register_argument_type_specific_hl_storage_module(hl_module, argument_type);
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 27373L)
    public static SubLObject register_predicate_specific_hl_storage_module(final SubLObject hl_module, final SubLObject predicate) {
        return dictionary_utilities.dictionary_pushnew(hl_storage_modules.$predicate_specific_hl_storage_modules_table$.getGlobalValue(), predicate, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 27556L)
    public static SubLObject register_predicate_generic_hl_storage_module(final SubLObject hl_module) {
        set.set_add(hl_module, hl_storage_modules.$predicate_generic_hl_storage_modules$.getGlobalValue());
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 27710L)
    public static SubLObject register_argument_type_specific_hl_storage_module(final SubLObject hl_module, final SubLObject argument_type) {
        return dictionary_utilities.dictionary_pushnew(hl_storage_modules.$argument_type_specific_hl_storage_modules_table$.getGlobalValue(), argument_type, hl_module, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 27907L)
    public static SubLObject hl_storage_modules() {
        return set.set_element_list(hl_storage_modules.$hl_storage_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 28008L)
    public static SubLObject hl_storage_module_count() {
        return set.set_size(hl_storage_modules.$hl_storage_modules$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 28092L)
    public static SubLObject hl_storage_module_applicable_intP(final SubLObject hl_module, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject sentence = clauses.cnf_formula(cnf, (SubLObject)hl_storage_modules.UNPROVIDED);
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_modules.NIL != hl_storage_module_sense_relevant_p(hl_module, cnf) && hl_storage_modules.NIL != hl_storage_module_direction_relevant_p(hl_module, direction) && hl_storage_modules.NIL != hl_storage_module_argument_type_relevant_p(hl_module, argument_spec) && hl_storage_modules.NIL != hl_storage_module_predicate_relevant_p(hl_module, predicate) && hl_storage_modules.NIL != hl_storage_module_required_mt_relevant_p(hl_module, mt) && hl_storage_modules.NIL != hl_storage_module_applicability_pattern_matched_p(hl_module, sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 28850L)
    public static SubLObject hl_storage_module_sense_relevant_p(final SubLObject hl_module, final SubLObject cnf) {
        final SubLObject module_sense = hl_storage_module_sense(hl_module);
        if (hl_storage_modules.NIL == module_sense) {
            return (SubLObject)hl_storage_modules.T;
        }
        if (hl_storage_modules.NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            return Equality.eq(module_sense, (SubLObject)hl_storage_modules.$kw49$POS);
        }
        if (hl_storage_modules.NIL != clause_utilities.neg_atomic_cnf_p(cnf)) {
            return Equality.eq(module_sense, (SubLObject)hl_storage_modules.$kw50$NEG);
        }
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 29177L)
    public static SubLObject hl_storage_module_direction_relevant_p(final SubLObject hl_module, final SubLObject direction) {
        if (hl_storage_modules.NIL == direction) {
            return (SubLObject)hl_storage_modules.T;
        }
        final SubLObject module_direction = hl_storage_module_direction(hl_module);
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_modules.NIL == module_direction || module_direction.eql(direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 29494L)
    public static SubLObject hl_storage_module_argument_type_relevant_p(final SubLObject hl_module, final SubLObject argument_spec) {
        if (hl_storage_modules.NIL == argument_spec) {
            return (SubLObject)hl_storage_modules.T;
        }
        final SubLObject module_argument_type = hl_storage_module_argument_type(hl_module);
        return (SubLObject)hl_storage_modules.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 29767L)
    public static SubLObject hl_storage_module_predicate_relevant_p(final SubLObject hl_module, final SubLObject predicate) {
        final SubLObject module_predicate = hl_storage_module_predicate(hl_module);
        final SubLObject module_any_preds = hl_storage_module_any_predicates(hl_module);
        return (SubLObject)SubLObjectFactory.makeBoolean((hl_storage_modules.NIL == module_predicate && hl_storage_modules.NIL == module_any_preds) || (hl_storage_modules.NIL == module_any_preds && module_predicate.eql(predicate)) || (hl_storage_modules.NIL == module_predicate && hl_storage_modules.NIL != subl_promotions.memberP(predicate, module_any_preds, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 30380L)
    public static SubLObject hl_storage_module_required_mt_relevant_p(final SubLObject hl_module, final SubLObject mt) {
        final SubLObject module_mt = hl_storage_module_required_mt(hl_module);
        return mt_relevance_macros.mt_relevant_to_mtP(mt, module_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 30563L)
    public static SubLObject hl_storage_module_applicability_pattern_matched_p(final SubLObject hl_module, final SubLObject sentence) {
        final SubLObject pattern = hl_storage_module_applicability_pattern(hl_module);
        return formula_pattern_match.pattern_matches_formula(pattern, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 30924L)
    public static SubLObject clear_solely_specific_hl_storage_module_predicate_store() {
        set.clear_set(hl_storage_modules.$solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 31079L)
    public static SubLObject rebuild_solely_specific_hl_storage_module_predicate_store() {
        return set.set_rebuild(hl_storage_modules.$solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 31232L)
    public static SubLObject register_solely_specific_hl_storage_module_predicate(final SubLObject predicate) {
        return set.set_add(predicate, hl_storage_modules.$solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 31535L)
    public static SubLObject deregister_solely_specific_hl_storage_module_predicate(final SubLObject predicate) {
        return set.set_remove(predicate, hl_storage_modules.$solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 31705L)
    public static SubLObject solely_specific_hl_storage_module_predicateP(final SubLObject predicate) {
        return set.set_memberP(predicate, hl_storage_modules.$solely_specific_hl_storage_module_predicate_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 31864L)
    public static SubLObject hl_assertion_spec_p(final SubLObject v_object) {
        if (v_object.isCons() && hl_storage_modules.NIL != list_utilities.lengthGE(v_object, (SubLObject)hl_storage_modules.TWO_INTEGER, (SubLObject)hl_storage_modules.UNPROVIDED)) {
            SubLObject cnf = (SubLObject)hl_storage_modules.NIL;
            SubLObject mt = (SubLObject)hl_storage_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)hl_storage_modules.$list53);
            cnf = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)hl_storage_modules.$list53);
            mt = current.first();
            current = current.rest();
            final SubLObject direction = (SubLObject)(current.isCons() ? current.first() : hl_storage_modules.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, v_object, (SubLObject)hl_storage_modules.$list53);
            current = current.rest();
            final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : hl_storage_modules.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, v_object, (SubLObject)hl_storage_modules.$list53);
            current = current.rest();
            if (hl_storage_modules.NIL == current) {
                return (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_modules.NIL != clauses.cnf_p(cnf) && hl_storage_modules.NIL != hlmt.hlmt_p(mt) && (hl_storage_modules.NIL == direction || hl_storage_modules.NIL != enumeration_types.direction_p(direction)) && variable_map.isList());
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)hl_storage_modules.$list53);
        }
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 32468L)
    public static SubLObject new_hl_assertion_spec(final SubLObject cnf, final SubLObject mt, SubLObject direction, SubLObject variable_map) {
        if (direction == hl_storage_modules.UNPROVIDED) {
            direction = (SubLObject)hl_storage_modules.NIL;
        }
        if (variable_map == hl_storage_modules.UNPROVIDED) {
            variable_map = (SubLObject)hl_storage_modules.NIL;
        }
        return (SubLObject)ConsesLow.list(cnf, mt, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 32594L)
    public static SubLObject do_hl_assertion_specs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_assertion_spec_var = (SubLObject)hl_storage_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list54);
        hl_assertion_spec_var = current.first();
        current = current.rest();
        if (hl_storage_modules.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject ass = (SubLObject)hl_storage_modules.$sym55$ASS;
            final SubLObject asent = (SubLObject)hl_storage_modules.$sym56$ASENT;
            return (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym57$PROGN, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym58$DO_ASSERTIONS, (SubLObject)ConsesLow.list(ass), (SubLObject)ConsesLow.listS((SubLObject)hl_storage_modules.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hl_assertion_spec_var, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym59$ASSERTION_TO_HL_ASSERTION_SPEC, ass))), ConsesLow.append(body, (SubLObject)hl_storage_modules.NIL))), (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym60$DO_BOOKKEEPING_ASENTS, (SubLObject)ConsesLow.list(asent), (SubLObject)ConsesLow.listS((SubLObject)hl_storage_modules.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hl_assertion_spec_var, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym61$BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC, asent))), ConsesLow.append(body, (SubLObject)hl_storage_modules.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_modules.$list54);
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 32974L)
    public static SubLObject destructure_hl_assertion_spec(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cnf = (SubLObject)hl_storage_modules.NIL;
        SubLObject mt = (SubLObject)hl_storage_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list62);
        cnf = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list62);
        mt = current.first();
        current = current.rest();
        final SubLObject direction = (SubLObject)(current.isCons() ? current.first() : hl_storage_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_modules.$list62);
        current = current.rest();
        final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : hl_storage_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_modules.$list62);
        current = current.rest();
        if (hl_storage_modules.NIL == current) {
            current = temp;
            SubLObject hl_assertion_spec = (SubLObject)hl_storage_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list62);
            hl_assertion_spec = current.first();
            final SubLObject body;
            current = (body = current.rest());
            final SubLObject hl_assertion_spec_var = (SubLObject)hl_storage_modules.$sym63$HL_ASSERTION_SPEC_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)hl_storage_modules.$sym12$CLET, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list(hl_assertion_spec_var, hl_assertion_spec), (SubLObject)ConsesLow.list(cnf, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym64$HL_ASSERTION_SPEC_CNF, hl_assertion_spec_var)), (SubLObject)ConsesLow.list(mt, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym65$HL_ASSERTION_SPEC_MT, hl_assertion_spec_var)), ConsesLow.append((SubLObject)((hl_storage_modules.NIL != direction) ? ConsesLow.list((SubLObject)ConsesLow.list(direction, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym66$HL_ASSERTION_SPEC_DIRECTION, hl_assertion_spec_var))) : hl_storage_modules.NIL), (SubLObject)((hl_storage_modules.NIL != variable_map) ? ConsesLow.list((SubLObject)ConsesLow.list(variable_map, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym67$HL_ASSERTION_SPEC_VARIABLE_MAP, hl_assertion_spec_var))) : hl_storage_modules.NIL), (SubLObject)hl_storage_modules.NIL)), ConsesLow.append(body, (SubLObject)hl_storage_modules.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_modules.$list62);
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 33543L)
    public static SubLObject hl_assertion_spec_cnf(final SubLObject hl_assertion_spec) {
        return hl_assertion_spec.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 33636L)
    public static SubLObject hl_assertion_spec_mt(final SubLObject hl_assertion_spec) {
        return conses_high.second(hl_assertion_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 33729L)
    public static SubLObject hl_assertion_spec_direction(final SubLObject hl_assertion_spec) {
        return conses_high.third(hl_assertion_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 33828L)
    public static SubLObject hl_assertion_spec_variable_map(final SubLObject hl_assertion_spec) {
        return conses_high.fourth(hl_assertion_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 33931L)
    public static SubLObject hl_assertible_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_modules.NIL != list_utilities.doubletonP(v_object) && hl_storage_modules.NIL != hl_assertion_spec_p(v_object.first()) && hl_storage_modules.NIL != arguments.argument_spec_p(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 34202L)
    public static SubLObject new_hl_assertible(final SubLObject hl_assertion_spec, final SubLObject argument_spec) {
        return (SubLObject)ConsesLow.list(hl_assertion_spec, argument_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 34318L)
    public static SubLObject do_hl_assertibles(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list68);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_assertible_var = (SubLObject)hl_storage_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list68);
        hl_assertible_var = current.first();
        current = current.rest();
        if (hl_storage_modules.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject ass = (SubLObject)hl_storage_modules.$sym69$ASS;
            final SubLObject asent = (SubLObject)hl_storage_modules.$sym70$ASENT;
            final SubLObject assertibles = (SubLObject)hl_storage_modules.$sym71$ASSERTIBLES;
            return (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym57$PROGN, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym58$DO_ASSERTIONS, (SubLObject)ConsesLow.list(ass), (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(assertibles, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym72$ASSERTION_TO_HL_ASSERTIBLES, ass))), (SubLObject)ConsesLow.listS((SubLObject)hl_storage_modules.$sym73$CDOLIST, (SubLObject)ConsesLow.list(hl_assertible_var, assertibles), ConsesLow.append(body, (SubLObject)hl_storage_modules.NIL)))), (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym60$DO_BOOKKEEPING_ASENTS, (SubLObject)ConsesLow.list(asent), (SubLObject)ConsesLow.listS((SubLObject)hl_storage_modules.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hl_assertible_var, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym74$BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE, asent))), ConsesLow.append(body, (SubLObject)hl_storage_modules.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_modules.$list68);
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 34729L)
    public static SubLObject destructure_hl_assertible(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argument_spec = (SubLObject)hl_storage_modules.NIL;
        SubLObject cnf = (SubLObject)hl_storage_modules.NIL;
        SubLObject mt = (SubLObject)hl_storage_modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list75);
        argument_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list75);
        cnf = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list75);
        mt = current.first();
        current = current.rest();
        final SubLObject direction = (SubLObject)(current.isCons() ? current.first() : hl_storage_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_modules.$list75);
        current = current.rest();
        final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : hl_storage_modules.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_modules.$list75);
        current = current.rest();
        if (hl_storage_modules.NIL == current) {
            current = temp;
            SubLObject hl_assertible = (SubLObject)hl_storage_modules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list75);
            hl_assertible = current.first();
            final SubLObject body;
            current = (body = current.rest());
            final SubLObject hl_assertible_var = (SubLObject)hl_storage_modules.$sym76$HL_ASSERTIBLE_VAR;
            final SubLObject hl_assertion_spec_var = (SubLObject)hl_storage_modules.$sym77$HL_ASSERTION_SPEC_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hl_assertible_var, hl_assertible), (SubLObject)ConsesLow.list(argument_spec, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym78$HL_ASSERTIBLE_ARGUMENT_SPEC, hl_assertible_var)), (SubLObject)ConsesLow.list(hl_assertion_spec_var, (SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym79$HL_ASSERTIBLE_HL_ASSERTION_SPEC, hl_assertible_var))), (SubLObject)ConsesLow.listS((SubLObject)hl_storage_modules.$sym80$DESTRUCTURE_HL_ASSERTION_SPEC, (SubLObject)ConsesLow.list(cnf, mt, direction, variable_map), hl_assertion_spec_var, ConsesLow.append(body, (SubLObject)hl_storage_modules.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_modules.$list75);
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 35246L)
    public static SubLObject hl_assertible_hl_assertion_spec(final SubLObject hl_assertible) {
        return hl_assertible.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 35341L)
    public static SubLObject hl_assertible_argument_spec(final SubLObject hl_assertible) {
        return conses_high.second(hl_assertible);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 35433L)
    public static SubLObject hl_add_assertible(final SubLObject hl_assertible) {
        assert hl_storage_modules.NIL != hl_assertible_p(hl_assertible) : hl_assertible;
        final SubLObject argument_spec = hl_assertible_argument_spec(hl_assertible);
        final SubLObject hl_assertion_spec_var_$7;
        final SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$7 = hl_assertible_hl_assertion_spec(hl_assertible);
        final SubLObject cnf = hl_assertion_spec_cnf(hl_assertion_spec_var_$7);
        final SubLObject mt = hl_assertion_spec_mt(hl_assertion_spec_var_$7);
        final SubLObject direction = hl_assertion_spec_direction(hl_assertion_spec_var_$7);
        final SubLObject variable_map = hl_assertion_spec_variable_map(hl_assertion_spec_var_$7);
        return hl_add_argument(argument_spec, cnf, mt, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 35914L)
    public static SubLObject hl_add_argument(final SubLObject argument_spec, final SubLObject cnf, SubLObject mt, final SubLObject direction, SubLObject variable_map) {
        if (variable_map == hl_storage_modules.UNPROVIDED) {
            variable_map = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_storage_modules.NIL != arguments.argument_spec_p(argument_spec) : argument_spec;
        assert hl_storage_modules.NIL != clauses.cnf_p(cnf) : cnf;
        assert hl_storage_modules.NIL != hlmt.hlmt_p(mt) : mt;
        assert hl_storage_modules.NIL != enumeration_types.direction_p(direction) : direction;
        assert hl_storage_modules.NIL != Types.listp(variable_map) : variable_map;
        janus.janus_note_argument(argument_spec, cnf, mt, direction, variable_map);
        if (hl_storage_modules.NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
            kb_control_vars.record_hl_transcript_operation((SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym85$TL_ADD_ARGUMENT, list_utilities.quotify(argument_spec), list_utilities.quotify(cnf), list_utilities.quotify(mt), list_utilities.quotify(direction), list_utilities.quotify(variable_map)));
        }
        if (hl_storage_modules.NIL != hlmt.hlmts_supportedP()) {
            mt = hlmt_czer.canonicalize_hlmt(mt);
        }
        return hl_store_perform_action_int((SubLObject)hl_storage_modules.$kw7$ADD, argument_spec, cnf, mt, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 36680L)
    public static SubLObject tl_add_argument(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, SubLObject variable_map) {
        if (variable_map == hl_storage_modules.UNPROVIDED) {
            variable_map = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_storage_modules.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)hl_storage_modules.NIL, thread);
            result = hl_add_argument(canon_tl.transform_tl_terms_to_hl(argument_spec), canon_tl.transform_tl_terms_to_hl(cnf), canon_tl.transform_tl_terms_to_hl(mt), direction, canon_tl.transform_tl_terms_to_hl(variable_map));
            if (hl_storage_modules.NIL != assertion_handles.assertion_p(result)) {}
            assertions_high.tl_cache_assertion(canon_tl.hl_term_to_tl(result), result);
        }
        finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 37160L)
    public static SubLObject hl_remove_assertible(final SubLObject hl_assertible) {
        assert hl_storage_modules.NIL != hl_assertible_p(hl_assertible) : hl_assertible;
        final SubLObject argument_spec = hl_assertible_argument_spec(hl_assertible);
        final SubLObject hl_assertion_spec_var_$8;
        final SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$8 = hl_assertible_hl_assertion_spec(hl_assertible);
        final SubLObject cnf = hl_assertion_spec_cnf(hl_assertion_spec_var_$8);
        final SubLObject mt = hl_assertion_spec_mt(hl_assertion_spec_var_$8);
        return hl_remove_argument(argument_spec, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 37445L)
    public static SubLObject hl_remove_argument(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_storage_modules.NIL != arguments.argument_spec_p(argument_spec) : argument_spec;
        assert hl_storage_modules.NIL != clauses.cnf_p(cnf) : cnf;
        assert hl_storage_modules.NIL != hlmt.hlmt_p(mt) : mt;
        if (hl_storage_modules.NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
            kb_control_vars.record_hl_transcript_operation((SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym86$TL_REMOVE_ARGUMENT, list_utilities.quotify(argument_spec), list_utilities.quotify(cnf), list_utilities.quotify(mt)));
        }
        return hl_store_perform_action_int((SubLObject)hl_storage_modules.$kw8$REMOVE, argument_spec, cnf, mt, (SubLObject)hl_storage_modules.NIL, (SubLObject)hl_storage_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 37794L)
    public static SubLObject tl_remove_argument(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_storage_modules.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)hl_storage_modules.NIL, thread);
            result = hl_remove_argument(canon_tl.transform_tl_terms_to_hl(argument_spec), canon_tl.transform_tl_terms_to_hl(cnf), canon_tl.transform_tl_terms_to_hl(mt));
        }
        finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 38110L)
    public static SubLObject hl_remove_all_arguments(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_storage_modules.NIL != clauses.cnf_p(cnf) : cnf;
        assert hl_storage_modules.NIL != hlmt.hlmt_p(mt) : mt;
        if (hl_storage_modules.NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread)) {
            kb_control_vars.record_hl_transcript_operation((SubLObject)ConsesLow.list((SubLObject)hl_storage_modules.$sym87$TL_REMOVE_ALL_ARGUMENTS, list_utilities.quotify(cnf), list_utilities.quotify(mt)));
        }
        return hl_store_perform_action_int((SubLObject)hl_storage_modules.$kw9$REMOVE_ALL, (SubLObject)hl_storage_modules.NIL, cnf, mt, (SubLObject)hl_storage_modules.NIL, (SubLObject)hl_storage_modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 38461L)
    public static SubLObject tl_remove_all_arguments(final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_storage_modules.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)hl_storage_modules.NIL, thread);
            result = hl_remove_all_arguments(canon_tl.transform_tl_terms_to_hl(cnf), canon_tl.transform_tl_terms_to_hl(mt));
        }
        finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 39159L)
    public static SubLObject with_new_successful_hl_storage_modules_info(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)hl_storage_modules.$sym12$CLET, (SubLObject)hl_storage_modules.$list88, ConsesLow.append(body, (SubLObject)hl_storage_modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 39308L)
    public static SubLObject note_successful_hl_storage_module(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set.set_add(hl_module, hl_storage_modules.$successful_hl_storage_modules$.getDynamicValue(thread));
        return hl_storage_modules.$successful_hl_storage_modules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 39466L)
    public static SubLObject hl_storage_module_successfulP(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(hl_module, hl_storage_modules.$successful_hl_storage_modules$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 39590L)
    public static SubLObject hl_store_perform_action_int(final SubLObject action, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)hl_storage_modules.NIL;
        SubLObject solely_specificP = (SubLObject)hl_storage_modules.NIL;
        final SubLObject argument_type = (SubLObject)((hl_storage_modules.NIL != argument_spec) ? arguments.argument_spec_type(argument_spec) : hl_storage_modules.NIL);
        final SubLObject _prev_bind_0 = hl_storage_modules.$successful_hl_storage_modules$.currentBinding(thread);
        try {
            hl_storage_modules.$successful_hl_storage_modules$.bind(set.new_set((SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED), thread);
            if (hl_storage_modules.NIL != clauses.atomic_clause_p(cnf)) {
                final SubLObject predicate = clause_utilities.atomic_cnf_predicate(cnf);
                final SubLObject predicate_specific_modules = (hl_storage_modules.NIL != argument_type) ? hl_storage_modules_for_predicate_and_argument_type(predicate, argument_type) : hl_storage_modules_for_predicate(predicate);
                solely_specificP = solely_specific_hl_storage_module_predicateP(predicate);
                if (hl_storage_modules.NIL != predicate_specific_modules) {
                    successP = hl_perform_action_with_storage_modules_int(action, predicate_specific_modules, argument_spec, cnf, mt, direction, variable_map);
                }
            }
            if (hl_storage_modules.NIL == successP && hl_storage_modules.NIL == solely_specificP) {
                final SubLObject predicate_generic_modules = (hl_storage_modules.NIL != argument_type) ? hl_storage_modules_for_argument_type(argument_type) : generic_hl_storage_modules();
                if (hl_storage_modules.NIL != predicate_generic_modules) {
                    successP = hl_perform_action_with_storage_modules_int(action, predicate_generic_modules, argument_spec, cnf, mt, direction, variable_map);
                }
            }
        }
        finally {
            hl_storage_modules.$successful_hl_storage_modules$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 41673L)
    public static SubLObject hl_perform_action_with_storage_modules_int(final SubLObject action, final SubLObject hl_modules, final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject actual_mt = kb_accessors.possibly_convention_mt_for_decontextualized_cnf(mt, cnf);
        if (action.eql((SubLObject)hl_storage_modules.$kw7$ADD)) {
            final SubLObject successP = try_hl_add_modules(hl_modules, argument_spec, cnf, actual_mt, direction, variable_map);
            return successP;
        }
        if (action.eql((SubLObject)hl_storage_modules.$kw8$REMOVE)) {
            SubLObject successP = try_hl_remove_modules(hl_modules, argument_spec, cnf, actual_mt);
            if (hl_storage_modules.NIL != hl_storage_modules.$robustly_remove_uncanonical_decontextualized_assertiblesP$.getGlobalValue() && hl_storage_modules.NIL == hlmt.hlmt_equal(mt, actual_mt)) {
                final SubLObject robust_successP = try_hl_remove_modules(hl_modules, argument_spec, cnf, mt);
                successP = (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_modules.NIL != successP || hl_storage_modules.NIL != robust_successP);
            }
            return successP;
        }
        if (action.eql((SubLObject)hl_storage_modules.$kw9$REMOVE_ALL)) {
            SubLObject successP = try_hl_remove_all_modules(hl_modules, cnf, actual_mt);
            if (hl_storage_modules.NIL != hl_storage_modules.$robustly_remove_uncanonical_decontextualized_assertiblesP$.getGlobalValue() && hl_storage_modules.NIL == hlmt.hlmt_equal(mt, actual_mt)) {
                final SubLObject robust_successP = try_hl_remove_all_modules(hl_modules, cnf, mt);
                successP = (SubLObject)SubLObjectFactory.makeBoolean(hl_storage_modules.NIL != successP || hl_storage_modules.NIL != robust_successP);
            }
            return successP;
        }
        Errors.error((SubLObject)hl_storage_modules.$str89$Unexpected_HL_storage_action__a, action);
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 42985L)
    public static SubLObject hl_assert(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject variable_map) {
        if (variable_map == hl_storage_modules.UNPROVIDED) {
            variable_map = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLObject argument_spec = arguments.create_asserted_argument_spec(strength);
        return hl_add_argument(argument_spec, cnf, mt, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 43649L)
    public static SubLObject hl_unassert(final SubLObject cnf, final SubLObject mt) {
        final SubLObject argument_spec = hl_storage_modules.$dummy_asserted_argument_spec$.getGlobalValue();
        return hl_remove_argument(argument_spec, cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 43798L)
    public static SubLObject hl_add_deduction(final SubLObject cnf, final SubLObject mt, final SubLObject supports, final SubLObject direction, SubLObject variable_map, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (variable_map == hl_storage_modules.UNPROVIDED) {
            variable_map = (SubLObject)hl_storage_modules.NIL;
        }
        if (v_bindings == hl_storage_modules.UNPROVIDED) {
            v_bindings = (SubLObject)hl_storage_modules.NIL;
        }
        if (pragmatic_support_mts == hl_storage_modules.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)hl_storage_modules.NIL;
        }
        final SubLObject deduction_spec = deductions_high.create_deduction_spec(supports, v_bindings, pragmatic_support_mts);
        return hl_add_argument(deduction_spec, cnf, mt, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 44140L)
    public static SubLObject hl_add_deduction_for_gaf(final SubLObject asent, final SubLObject truth, final SubLObject mt, final SubLObject supports, SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hl_storage_modules.NIL == control_vars.$allow_backward_gafs$.getDynamicValue(thread)) {
            direction = (SubLObject)hl_storage_modules.$kw92$FORWARD;
        }
        final SubLObject gaf_formula = cycl_utilities.possibly_negate(asent, truth);
        final SubLObject canon_cnfs = czer_main.canonicalize_gaf(gaf_formula, mt);
        if (hl_storage_modules.NIL == canon_cnfs || hl_storage_modules.$const93$False.eql(canon_cnfs)) {
            conflicts.handle_invalid_deduction_conflict(asent, truth, mt);
            return (SubLObject)hl_storage_modules.NIL;
        }
        if (!hl_storage_modules.$const94$True.eql(canon_cnfs)) {
            SubLObject cdolist_list_var = canon_cnfs;
            SubLObject canon_cnf_bind_list_pair = (SubLObject)hl_storage_modules.NIL;
            canon_cnf_bind_list_pair = cdolist_list_var.first();
            while (hl_storage_modules.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = canon_cnf_bind_list_pair;
                SubLObject canon_cnf = (SubLObject)hl_storage_modules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_storage_modules.$list95);
                canon_cnf = current.first();
                current = current.rest();
                final SubLObject binding_list = (SubLObject)(current.isCons() ? current.first() : hl_storage_modules.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)hl_storage_modules.$list95);
                current = current.rest();
                if (hl_storage_modules.NIL == current) {
                    assert hl_storage_modules.NIL != clauses.cnf_p(canon_cnf) : canon_cnf;
                    if (hl_storage_modules.NIL != control_vars.$filter_deductions_for_trivially_derivable_gafs$.getDynamicValue(thread) && hl_storage_modules.NIL != clauses.atomic_clause_p(canon_cnf) && hl_storage_modules.NIL != tms.atomic_cnf_trivially_derivable(canon_cnf, mt)) {
                        return (SubLObject)hl_storage_modules.NIL;
                    }
                    return hl_add_deduction(canon_cnf, mt, supports, direction, binding_list, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_storage_modules.$list95);
                    cdolist_list_var = cdolist_list_var.rest();
                    canon_cnf_bind_list_pair = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-storage-modules.lisp", position = 45130L)
    public static SubLObject hl_remove_deduction(final SubLObject cnf, final SubLObject mt, final SubLObject supports) {
        final SubLObject deduction_spec = deductions_high.create_deduction_spec(supports, (SubLObject)hl_storage_modules.UNPROVIDED, (SubLObject)hl_storage_modules.UNPROVIDED);
        return hl_remove_argument(deduction_spec, cnf, mt);
    }
    
    public static SubLObject declare_hl_storage_modules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module", "HL-STORAGE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "undeclare_hl_storage_module", "UNDECLARE-HL-STORAGE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "try_hl_add_modules", "TRY-HL-ADD-MODULES", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "try_hl_remove_modules", "TRY-HL-REMOVE-MODULES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "try_hl_remove_all_modules", "TRY-HL-REMOVE-ALL-MODULES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_modules_for_predicate_and_argument_type", "HL-STORAGE-MODULES-FOR-PREDICATE-AND-ARGUMENT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_modules_for_predicate", "HL-STORAGE-MODULES-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "predicate_has_specific_hl_storage_modulesP", "PREDICATE-HAS-SPECIFIC-HL-STORAGE-MODULES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "predicates_with_specific_hl_storage_modules", "PREDICATES-WITH-SPECIFIC-HL-STORAGE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "predicate_generic_hl_storage_modules", "PREDICATE-GENERIC-HL-STORAGE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_modules_for_argument_type", "HL-STORAGE-MODULES-FOR-ARGUMENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "generic_hl_storage_modules", "GENERIC-HL-STORAGE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "generic_hl_storage_module_count", "GENERIC-HL-STORAGE-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_modules_for_just_argument_type", "HL-STORAGE-MODULES-FOR-JUST-ARGUMENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "currently_executing_hl_storage_module", "CURRENTLY-EXECUTING-HL-STORAGE-MODULE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_storage_modules", "within_hl_storage_module_execution", "WITHIN-HL-STORAGE-MODULE-EXECUTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "try_hl_storage_modules_int", "TRY-HL-STORAGE-MODULES-INT", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "apply_hl_storage_module", "APPLY-HL-STORAGE-MODULE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_name", "HL-STORAGE-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_applicableP", "HL-STORAGE-MODULE-APPLICABLE?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "applicable_hl_storage_modules", "APPLICABLE-HL-STORAGE-MODULES", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "update_dispreferred_hl_storage_modules_wrt_applicable_modules", "UPDATE-DISPREFERRED-HL-STORAGE-MODULES-WRT-APPLICABLE-MODULES", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "update_supplanted_hl_storage_modules_wrt_applicable_modules", "UPDATE-SUPPLANTED-HL-STORAGE-MODULES-WRT-APPLICABLE-MODULES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "sort_hl_storage_modules_by_cost", "SORT-HL-STORAGE-MODULES-BY-COST", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "sort_dispreferred_hl_storage_modules_by_cost", "SORT-DISPREFERRED-HL-STORAGE-MODULES-BY-COST", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_incompleteness", "HL-STORAGE-MODULE-INCOMPLETENESS", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_add", "HL-STORAGE-MODULE-ADD", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_remove", "HL-STORAGE-MODULE-REMOVE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_remove_all", "HL-STORAGE-MODULE-REMOVE-ALL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_argument_type", "HL-STORAGE-MODULE-ARGUMENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_sense", "HL-STORAGE-MODULE-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_direction", "HL-STORAGE-MODULE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_required_mt", "HL-STORAGE-MODULE-REQUIRED-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_predicate", "HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_any_predicates", "HL-STORAGE-MODULE-ANY-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_applicability_func", "HL-STORAGE-MODULE-APPLICABILITY-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_applicability_pattern", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_exclusive_func", "HL-STORAGE-MODULE-EXCLUSIVE-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_supplants_info", "HL-STORAGE-MODULE-SUPPLANTS-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_preferred_over_info", "HL-STORAGE-MODULE-PREFERRED-OVER-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "get_hl_storage_module_property", "GET-HL-STORAGE-MODULE-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "reclassify_hl_storage_modules", "RECLASSIFY-HL-STORAGE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_properties", "HL-STORAGE-MODULE-PROPERTIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_property_p", "HL-STORAGE-MODULE-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "remove_hl_storage_module", "REMOVE-HL-STORAGE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "remove_hl_storage_module_from_generic_hl_module_cache", "REMOVE-HL-STORAGE-MODULE-FROM-GENERIC-HL-MODULE-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "remove_hl_storage_module_from_predicate_specific_hl_module_cache", "REMOVE-HL-STORAGE-MODULE-FROM-PREDICATE-SPECIFIC-HL-MODULE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "clear_hl_storage_module_indexes", "CLEAR-HL-STORAGE-MODULE-INDEXES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "setup_hl_storage_module", "SETUP-HL-STORAGE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_applicability_pattern_p", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "register_hl_storage_module", "REGISTER-HL-STORAGE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "classify_hl_storage_module", "CLASSIFY-HL-STORAGE-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "register_predicate_specific_hl_storage_module", "REGISTER-PREDICATE-SPECIFIC-HL-STORAGE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "register_predicate_generic_hl_storage_module", "REGISTER-PREDICATE-GENERIC-HL-STORAGE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "register_argument_type_specific_hl_storage_module", "REGISTER-ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_modules", "HL-STORAGE-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_count", "HL-STORAGE-MODULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_applicable_intP", "HL-STORAGE-MODULE-APPLICABLE-INT?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_sense_relevant_p", "HL-STORAGE-MODULE-SENSE-RELEVANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_direction_relevant_p", "HL-STORAGE-MODULE-DIRECTION-RELEVANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_argument_type_relevant_p", "HL-STORAGE-MODULE-ARGUMENT-TYPE-RELEVANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_predicate_relevant_p", "HL-STORAGE-MODULE-PREDICATE-RELEVANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_required_mt_relevant_p", "HL-STORAGE-MODULE-REQUIRED-MT-RELEVANT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_applicability_pattern_matched_p", "HL-STORAGE-MODULE-APPLICABILITY-PATTERN-MATCHED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "clear_solely_specific_hl_storage_module_predicate_store", "CLEAR-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "rebuild_solely_specific_hl_storage_module_predicate_store", "REBUILD-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "register_solely_specific_hl_storage_module_predicate", "REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "deregister_solely_specific_hl_storage_module_predicate", "DEREGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "solely_specific_hl_storage_module_predicateP", "SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assertion_spec_p", "HL-ASSERTION-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "new_hl_assertion_spec", "NEW-HL-ASSERTION-SPEC", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_storage_modules", "do_hl_assertion_specs", "DO-HL-ASSERTION-SPECS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_storage_modules", "destructure_hl_assertion_spec", "DESTRUCTURE-HL-ASSERTION-SPEC");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assertion_spec_cnf", "HL-ASSERTION-SPEC-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assertion_spec_mt", "HL-ASSERTION-SPEC-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assertion_spec_direction", "HL-ASSERTION-SPEC-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assertion_spec_variable_map", "HL-ASSERTION-SPEC-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assertible_p", "HL-ASSERTIBLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "new_hl_assertible", "NEW-HL-ASSERTIBLE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_storage_modules", "do_hl_assertibles", "DO-HL-ASSERTIBLES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_storage_modules", "destructure_hl_assertible", "DESTRUCTURE-HL-ASSERTIBLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assertible_hl_assertion_spec", "HL-ASSERTIBLE-HL-ASSERTION-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assertible_argument_spec", "HL-ASSERTIBLE-ARGUMENT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_add_assertible", "HL-ADD-ASSERTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_add_argument", "HL-ADD-ARGUMENT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "tl_add_argument", "TL-ADD-ARGUMENT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_remove_assertible", "HL-REMOVE-ASSERTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_remove_argument", "HL-REMOVE-ARGUMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "tl_remove_argument", "TL-REMOVE-ARGUMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_remove_all_arguments", "HL-REMOVE-ALL-ARGUMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "tl_remove_all_arguments", "TL-REMOVE-ALL-ARGUMENTS", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_storage_modules", "with_new_successful_hl_storage_modules_info", "WITH-NEW-SUCCESSFUL-HL-STORAGE-MODULES-INFO");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "note_successful_hl_storage_module", "NOTE-SUCCESSFUL-HL-STORAGE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_storage_module_successfulP", "HL-STORAGE-MODULE-SUCCESSFUL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_store_perform_action_int", "HL-STORE-PERFORM-ACTION-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_perform_action_with_storage_modules_int", "HL-PERFORM-ACTION-WITH-STORAGE-MODULES-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_assert", "HL-ASSERT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_unassert", "HL-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_add_deduction", "HL-ADD-DEDUCTION", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_add_deduction_for_gaf", "HL-ADD-DEDUCTION-FOR-GAF", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_storage_modules", "hl_remove_deduction", "HL-REMOVE-DEDUCTION", 3, 0, false);
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    public static SubLObject init_hl_storage_modules_file() {
        hl_storage_modules.$hl_storage_modules$ = SubLFiles.deflexical("*HL-STORAGE-MODULES*", (hl_storage_modules.NIL != Symbols.boundp((SubLObject)hl_storage_modules.$sym0$_HL_STORAGE_MODULES_)) ? hl_storage_modules.$hl_storage_modules$.getGlobalValue() : set.new_set(Symbols.symbol_function((SubLObject)hl_storage_modules.EQL), (SubLObject)hl_storage_modules.UNPROVIDED));
        hl_storage_modules.$predicate_generic_hl_storage_modules$ = SubLFiles.deflexical("*PREDICATE-GENERIC-HL-STORAGE-MODULES*", (hl_storage_modules.NIL != Symbols.boundp((SubLObject)hl_storage_modules.$sym1$_PREDICATE_GENERIC_HL_STORAGE_MODULES_)) ? hl_storage_modules.$predicate_generic_hl_storage_modules$.getGlobalValue() : set.new_set(Symbols.symbol_function((SubLObject)hl_storage_modules.EQL), (SubLObject)hl_storage_modules.UNPROVIDED));
        hl_storage_modules.$predicate_specific_hl_storage_modules_table$ = SubLFiles.deflexical("*PREDICATE-SPECIFIC-HL-STORAGE-MODULES-TABLE*", (hl_storage_modules.NIL != Symbols.boundp((SubLObject)hl_storage_modules.$sym2$_PREDICATE_SPECIFIC_HL_STORAGE_MODULES_TABLE_)) ? hl_storage_modules.$predicate_specific_hl_storage_modules_table$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)hl_storage_modules.EQL), (SubLObject)hl_storage_modules.UNPROVIDED));
        hl_storage_modules.$argument_type_specific_hl_storage_modules_table$ = SubLFiles.deflexical("*ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULES-TABLE*", (hl_storage_modules.NIL != Symbols.boundp((SubLObject)hl_storage_modules.$sym3$_ARGUMENT_TYPE_SPECIFIC_HL_STORAGE_MODULES_TABLE_)) ? hl_storage_modules.$argument_type_specific_hl_storage_modules_table$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)hl_storage_modules.EQL), (SubLObject)hl_storage_modules.UNPROVIDED));
        hl_storage_modules.$currently_executing_hl_storage_module$ = SubLFiles.defparameter("*CURRENTLY-EXECUTING-HL-STORAGE-MODULE*", (SubLObject)hl_storage_modules.NIL);
        hl_storage_modules.$hl_storage_module_properties$ = SubLFiles.deflexical("*HL-STORAGE-MODULE-PROPERTIES*", (SubLObject)hl_storage_modules.$list28);
        hl_storage_modules.$solely_specific_hl_storage_module_predicate_store$ = SubLFiles.deflexical("*SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE*", (hl_storage_modules.NIL != Symbols.boundp((SubLObject)hl_storage_modules.$sym51$_SOLELY_SPECIFIC_HL_STORAGE_MODULE_PREDICATE_STORE_)) ? hl_storage_modules.$solely_specific_hl_storage_module_predicate_store$.getGlobalValue() : set.new_set((SubLObject)hl_storage_modules.EQL, (SubLObject)hl_storage_modules.$int52$50));
        hl_storage_modules.$successful_hl_storage_modules$ = SubLFiles.defparameter("*SUCCESSFUL-HL-STORAGE-MODULES*", (SubLObject)hl_storage_modules.NIL);
        hl_storage_modules.$robustly_remove_uncanonical_decontextualized_assertiblesP$ = SubLFiles.deflexical("*ROBUSTLY-REMOVE-UNCANONICAL-DECONTEXTUALIZED-ASSERTIBLES?*", (SubLObject)hl_storage_modules.T);
        hl_storage_modules.$dummy_asserted_argument_spec$ = SubLFiles.deflexical("*DUMMY-ASSERTED-ARGUMENT-SPEC*", (hl_storage_modules.NIL != Symbols.boundp((SubLObject)hl_storage_modules.$sym90$_DUMMY_ASSERTED_ARGUMENT_SPEC_)) ? hl_storage_modules.$dummy_asserted_argument_spec$.getGlobalValue() : arguments.create_asserted_argument_spec((SubLObject)hl_storage_modules.$kw91$UNSPECIFIED));
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    public static SubLObject setup_hl_storage_modules_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)hl_storage_modules.$sym0$_HL_STORAGE_MODULES_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_storage_modules.$sym1$_PREDICATE_GENERIC_HL_STORAGE_MODULES_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_storage_modules.$sym2$_PREDICATE_SPECIFIC_HL_STORAGE_MODULES_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_storage_modules.$sym3$_ARGUMENT_TYPE_SPECIFIC_HL_STORAGE_MODULES_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_storage_modules.$sym51$_SOLELY_SPECIFIC_HL_STORAGE_MODULE_PREDICATE_STORE_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_storage_modules.$sym90$_DUMMY_ASSERTED_ARGUMENT_SPEC_);
        return (SubLObject)hl_storage_modules.NIL;
    }
    
    public void declareFunctions() {
        declare_hl_storage_modules_file();
    }
    
    public void initializeVariables() {
        init_hl_storage_modules_file();
    }
    
    public void runTopLevelForms() {
        setup_hl_storage_modules_file();
    }
    
    static {
        me = (SubLFile)new hl_storage_modules();
        hl_storage_modules.$hl_storage_modules$ = null;
        hl_storage_modules.$predicate_generic_hl_storage_modules$ = null;
        hl_storage_modules.$predicate_specific_hl_storage_modules_table$ = null;
        hl_storage_modules.$argument_type_specific_hl_storage_modules_table$ = null;
        hl_storage_modules.$currently_executing_hl_storage_module$ = null;
        hl_storage_modules.$hl_storage_module_properties$ = null;
        hl_storage_modules.$solely_specific_hl_storage_module_predicate_store$ = null;
        hl_storage_modules.$successful_hl_storage_modules$ = null;
        hl_storage_modules.$robustly_remove_uncanonical_decontextualized_assertiblesP$ = null;
        hl_storage_modules.$dummy_asserted_argument_spec$ = null;
        $sym0$_HL_STORAGE_MODULES_ = SubLObjectFactory.makeSymbol("*HL-STORAGE-MODULES*");
        $sym1$_PREDICATE_GENERIC_HL_STORAGE_MODULES_ = SubLObjectFactory.makeSymbol("*PREDICATE-GENERIC-HL-STORAGE-MODULES*");
        $sym2$_PREDICATE_SPECIFIC_HL_STORAGE_MODULES_TABLE_ = SubLObjectFactory.makeSymbol("*PREDICATE-SPECIFIC-HL-STORAGE-MODULES-TABLE*");
        $sym3$_ARGUMENT_TYPE_SPECIFIC_HL_STORAGE_MODULES_TABLE_ = SubLObjectFactory.makeSymbol("*ARGUMENT-TYPE-SPECIFIC-HL-STORAGE-MODULES-TABLE*");
        $sym4$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym5$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym6$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $kw7$ADD = SubLObjectFactory.makeKeyword("ADD");
        $kw8$REMOVE = SubLObjectFactory.makeKeyword("REMOVE");
        $kw9$REMOVE_ALL = SubLObjectFactory.makeKeyword("REMOVE-ALL");
        $kw10$ARGUMENT = SubLObjectFactory.makeKeyword("ARGUMENT");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-STORAGE-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym12$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym13$_CURRENTLY_EXECUTING_HL_STORAGE_MODULE_ = SubLObjectFactory.makeSymbol("*CURRENTLY-EXECUTING-HL-STORAGE-MODULE*");
        $list14 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DISPREFERRED-HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("PREFERRED-MODULES"));
        $kw15$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw16$INCOMPLETENESS = SubLObjectFactory.makeKeyword("INCOMPLETENESS");
        $kw17$ARGUMENT_TYPE = SubLObjectFactory.makeKeyword("ARGUMENT-TYPE");
        $kw18$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw19$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw20$REQUIRED_MT = SubLObjectFactory.makeKeyword("REQUIRED-MT");
        $kw21$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw22$ANY_PREDICATES = SubLObjectFactory.makeKeyword("ANY-PREDICATES");
        $kw23$APPLICABILITY = SubLObjectFactory.makeKeyword("APPLICABILITY");
        $kw24$APPLICABILITY_PATTERN = SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN");
        $kw25$EXCLUSIVE = SubLObjectFactory.makeKeyword("EXCLUSIVE");
        $kw26$SUPPLANTS = SubLObjectFactory.makeKeyword("SUPPLANTS");
        $kw27$PREFERRED_OVER = SubLObjectFactory.makeKeyword("PREFERRED-OVER");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PRETTY-NAME"), SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("MODULE-SOURCE"), SubLObjectFactory.makeKeyword("ARGUMENT-TYPE"), SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("REQUIRED-MT"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("ANY-PREDICATES"), SubLObjectFactory.makeKeyword("APPLICABILITY-PATTERN"), SubLObjectFactory.makeKeyword("APPLICABILITY"), SubLObjectFactory.makeKeyword("SUPPLANTS"), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeKeyword("PREFERRED-OVER"), SubLObjectFactory.makeKeyword("INCOMPLETENESS"), SubLObjectFactory.makeKeyword("ADD"), SubLObjectFactory.makeKeyword("REMOVE"), SubLObjectFactory.makeKeyword("REMOVE-ALL"), SubLObjectFactory.makeKeyword("DOCUMENTATION") });
        $sym29$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym30$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym31$HL_STORAGE_MODULE_PROPERTY_P = SubLObjectFactory.makeSymbol("HL-STORAGE-MODULE-PROPERTY-P");
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("PRETTY-NAME"), SubLObjectFactory.makeSymbol("MODULE-SUBTYPE"), SubLObjectFactory.makeSymbol("MODULE-SOURCE"), SubLObjectFactory.makeSymbol("ARGUMENT-TYPE"), SubLObjectFactory.makeSymbol("SENSE"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("REQUIRED-MT"), SubLObjectFactory.makeSymbol("PREDICATE"), SubLObjectFactory.makeSymbol("ANY-PREDICATES"), SubLObjectFactory.makeSymbol("APPLICABILITY-PATTERN"), SubLObjectFactory.makeSymbol("APPLICABILITY"), SubLObjectFactory.makeSymbol("SUPPLANTS"), SubLObjectFactory.makeSymbol("EXCLUSIVE"), SubLObjectFactory.makeSymbol("PREFERRED-OVER"), SubLObjectFactory.makeSymbol("INCOMPLETENESS"), SubLObjectFactory.makeSymbol("ADD"), SubLObjectFactory.makeSymbol("REMOVE"), SubLObjectFactory.makeSymbol("REMOVE-ALL"), SubLObjectFactory.makeSymbol("DOCUMENTATION") });
        $kw33$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw34$PRETTY_NAME = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $kw35$MODULE_SUBTYPE = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $kw36$MODULE_SOURCE = SubLObjectFactory.makeKeyword("MODULE-SOURCE");
        $kw37$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $sym38$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym39$ARGUMENT_TYPE_P = SubLObjectFactory.makeSymbol("ARGUMENT-TYPE-P");
        $sym40$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym41$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym42$HL_STORAGE_MODULE_APPLICABILITY_PATTERN_P = SubLObjectFactory.makeSymbol("HL-STORAGE-MODULE-APPLICABILITY-PATTERN-P");
        $sym43$SENSE_P = SubLObjectFactory.makeSymbol("SENSE-P");
        $sym44$DIRECTION_P = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $sym45$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym46$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOTHING"));
        $kw48$STORAGE = SubLObjectFactory.makeKeyword("STORAGE");
        $kw49$POS = SubLObjectFactory.makeKeyword("POS");
        $kw50$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym51$_SOLELY_SPECIFIC_HL_STORAGE_MODULE_PREDICATE_STORE_ = SubLObjectFactory.makeSymbol("*SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE*");
        $int52$50 = SubLObjectFactory.makeInteger(50);
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP"));
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-ASSERTION-SPEC-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym55$ASS = SubLObjectFactory.makeUninternedSymbol("ASS");
        $sym56$ASENT = SubLObjectFactory.makeUninternedSymbol("ASENT");
        $sym57$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym58$DO_ASSERTIONS = SubLObjectFactory.makeSymbol("DO-ASSERTIONS");
        $sym59$ASSERTION_TO_HL_ASSERTION_SPEC = SubLObjectFactory.makeSymbol("ASSERTION-TO-HL-ASSERTION-SPEC");
        $sym60$DO_BOOKKEEPING_ASENTS = SubLObjectFactory.makeSymbol("DO-BOOKKEEPING-ASENTS");
        $sym61$BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC = SubLObjectFactory.makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP")), (SubLObject)SubLObjectFactory.makeSymbol("HL-ASSERTION-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym63$HL_ASSERTION_SPEC_VAR = SubLObjectFactory.makeUninternedSymbol("HL-ASSERTION-SPEC-VAR");
        $sym64$HL_ASSERTION_SPEC_CNF = SubLObjectFactory.makeSymbol("HL-ASSERTION-SPEC-CNF");
        $sym65$HL_ASSERTION_SPEC_MT = SubLObjectFactory.makeSymbol("HL-ASSERTION-SPEC-MT");
        $sym66$HL_ASSERTION_SPEC_DIRECTION = SubLObjectFactory.makeSymbol("HL-ASSERTION-SPEC-DIRECTION");
        $sym67$HL_ASSERTION_SPEC_VARIABLE_MAP = SubLObjectFactory.makeSymbol("HL-ASSERTION-SPEC-VARIABLE-MAP");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-ASSERTIBLE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym69$ASS = SubLObjectFactory.makeUninternedSymbol("ASS");
        $sym70$ASENT = SubLObjectFactory.makeUninternedSymbol("ASENT");
        $sym71$ASSERTIBLES = SubLObjectFactory.makeUninternedSymbol("ASSERTIBLES");
        $sym72$ASSERTION_TO_HL_ASSERTIBLES = SubLObjectFactory.makeSymbol("ASSERTION-TO-HL-ASSERTIBLES");
        $sym73$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym74$BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE = SubLObjectFactory.makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP")), (SubLObject)SubLObjectFactory.makeSymbol("HL-ASSERTIBLE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym76$HL_ASSERTIBLE_VAR = SubLObjectFactory.makeUninternedSymbol("HL-ASSERTIBLE-VAR");
        $sym77$HL_ASSERTION_SPEC_VAR = SubLObjectFactory.makeUninternedSymbol("HL-ASSERTION-SPEC-VAR");
        $sym78$HL_ASSERTIBLE_ARGUMENT_SPEC = SubLObjectFactory.makeSymbol("HL-ASSERTIBLE-ARGUMENT-SPEC");
        $sym79$HL_ASSERTIBLE_HL_ASSERTION_SPEC = SubLObjectFactory.makeSymbol("HL-ASSERTIBLE-HL-ASSERTION-SPEC");
        $sym80$DESTRUCTURE_HL_ASSERTION_SPEC = SubLObjectFactory.makeSymbol("DESTRUCTURE-HL-ASSERTION-SPEC");
        $sym81$HL_ASSERTIBLE_P = SubLObjectFactory.makeSymbol("HL-ASSERTIBLE-P");
        $sym82$ARGUMENT_SPEC_P = SubLObjectFactory.makeSymbol("ARGUMENT-SPEC-P");
        $sym83$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
        $sym84$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym85$TL_ADD_ARGUMENT = SubLObjectFactory.makeSymbol("TL-ADD-ARGUMENT");
        $sym86$TL_REMOVE_ARGUMENT = SubLObjectFactory.makeSymbol("TL-REMOVE-ARGUMENT");
        $sym87$TL_REMOVE_ALL_ARGUMENTS = SubLObjectFactory.makeSymbol("TL-REMOVE-ALL-ARGUMENTS");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SUCCESSFUL-HL-STORAGE-MODULES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"))));
        $str89$Unexpected_HL_storage_action__a = SubLObjectFactory.makeString("Unexpected HL storage action ~a");
        $sym90$_DUMMY_ASSERTED_ARGUMENT_SPEC_ = SubLObjectFactory.makeSymbol("*DUMMY-ASSERTED-ARGUMENT-SPEC*");
        $kw91$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $kw92$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $const93$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $const94$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANON-CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-LIST"));
    }
}

/*

	Total time: 539 ms
	 synthetic 
*/