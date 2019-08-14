/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.subl_escape_subl;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUBL-IDENTIFIER
 * source file: /cyc/top/cycl/subl-identifier.lisp
 * created:     2019/07/03 17:37:51
 */
public final class subl_identifier extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_sublid_test_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_TEST_CASE, CONSTANTS, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLID_TEST, DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, SUBLID_TEST, FORT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sublid_test_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject sublid_test_p(SubLObject sublid_test) {
        return classes.subloop_instanceof_class(sublid_test, SUBLID_TEST);
    }

    public static final SubLObject set_sublid_test_fort(SubLObject sublid_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sublid_test, value, FIVE_INTEGER, FORT);
    }

    public static final SubLObject set_sublid_test_domain(SubLObject sublid_test, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sublid_test, value, FOUR_INTEGER, DOMAIN);
    }

    public static final SubLObject get_sublid_test_fort(SubLObject sublid_test) {
        return classes.subloop_get_access_protected_instance_slot(sublid_test, FIVE_INTEGER, FORT);
    }

    public static final SubLObject get_sublid_test_domain(SubLObject sublid_test) {
        return classes.subloop_get_access_protected_instance_slot(sublid_test, FOUR_INTEGER, DOMAIN);
    }

    public static final SubLFile me = new subl_identifier();

 public static final String myName = "com.cyc.cycjava.cycl.subl_identifier";


    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $sublid_pred$ = makeSymbol("*SUBLID-PRED*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $sublid_uiit_pred$ = makeSymbol("*SUBLID-UIIT-PRED*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $sublid_domain_to_forts_table$ = makeSymbol("*SUBLID-DOMAIN-TO-FORTS-TABLE*");

    public static final SubLSymbol $sublid_id_to_forts_table$ = makeSymbol("*SUBLID-ID-TO-FORTS-TABLE*");

    public static final SubLSymbol $sublid_fort_to_id_table$ = makeSymbol("*SUBLID-FORT-TO-ID-TABLE*");





    static private final SubLString $str5$More_than_one_Cyc_entity_found_fo = makeString("More than one Cyc entity found for ID ~A and domain ~A.");

    private static final SubLSymbol SUBLID_DOMAIN_P = makeSymbol("SUBLID-DOMAIN-P");

    static private final SubLString $str10$Unknown_sublid_domain_to_forts_up = makeString("Unknown sublid-domain-to-forts-update operation ~A");

    private static final SubLSymbol SUBLID_P = makeSymbol("SUBLID-P");



    static private final SubLString $str13$Unknown_sublid_forts_update_opera = makeString("Unknown sublid-forts-update operation ~A");

    private static final SubLSymbol NAT_FUNCTOR = makeSymbol("NAT-FUNCTOR");

    private static final SubLSymbol ADD_SUBLIDENTIFIER = makeSymbol("ADD-SUBLIDENTIFIER");

    private static final SubLSymbol REMOVE_SUBLIDENTIFIER = makeSymbol("REMOVE-SUBLIDENTIFIER");

    private static final SubLSymbol ADD_UNIQUELYIDENTIFIEDINTYPE = makeSymbol("ADD-UNIQUELYIDENTIFIEDINTYPE");

    private static final SubLSymbol REMOVE_UNIQUELYIDENTIFIEDINTYPE = makeSymbol("REMOVE-UNIQUELYIDENTIFIEDINTYPE");

    public static final SubLObject sublid_p_alt(SubLObject v_object) {
        return symbolp(v_object);
    }

    public static SubLObject sublid_p(final SubLObject v_object) {
        return symbolp(v_object);
    }

    public static final SubLObject sublid_domain_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collectionP(v_object)));
    }

    public static SubLObject sublid_domain_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collectionP(v_object)));
    }

    /**
     * Returns the Cyc FORT representing the SubL entity uniquely identified,
     * among instances of DOMAIN, by the identifier SUBLID.
     */
    @LispMethod(comment = "Returns the Cyc FORT representing the SubL entity uniquely identified,\r\namong instances of DOMAIN, by the identifier SUBLID.\nReturns the Cyc FORT representing the SubL entity uniquely identified,\namong instances of DOMAIN, by the identifier SUBLID.")
    public static final SubLObject cyc_entity_from_sublid_alt(SubLObject sublid, SubLObject domain) {
        {
            SubLObject id_candidates = remove_duplicates(com.cyc.cycjava.cycl.subl_identifier.sublid_id_to_forts_lookup(sublid), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject domain_candidates = com.cyc.cycjava.cycl.subl_identifier.sublid_domain_to_forts_lookup(domain);
            SubLObject result = equals.simplest_forts_wrt_rewrite(keyhash_utilities.fast_intersection(id_candidates, domain_candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt_vars.$sublid_mt$.getGlobalValue());
            if (NIL == result) {
                return NIL;
            } else {
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                } else {
                    Errors.warn($str_alt5$More_than_one_Cyc_entity_found_fo, sublid, domain);
                    return NIL;
                }
            }
        }
    }

    /**
     * Returns the Cyc FORT representing the SubL entity uniquely identified,
     * among instances of DOMAIN, by the identifier SUBLID.
     */
    @LispMethod(comment = "Returns the Cyc FORT representing the SubL entity uniquely identified,\r\namong instances of DOMAIN, by the identifier SUBLID.\nReturns the Cyc FORT representing the SubL entity uniquely identified,\namong instances of DOMAIN, by the identifier SUBLID.")
    public static SubLObject cyc_entity_from_sublid(final SubLObject sublid, final SubLObject domain) {
        final SubLObject id_candidates = remove_duplicates(sublid_id_to_forts_lookup(sublid), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject domain_candidates = sublid_domain_to_forts_lookup(domain);
        final SubLObject result = equals.simplest_forts_wrt_rewrite(keyhash_utilities.fast_intersection(id_candidates, domain_candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt_vars.$sublid_mt$.getGlobalValue());
        if (NIL == result) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        Errors.warn($str5$More_than_one_Cyc_entity_found_fo, sublid, domain);
        return NIL;
    }

    /**
     * Returns the SubL identifier for FORT.
     */
    @LispMethod(comment = "Returns the SubL identifier for FORT.")
    public static final SubLObject sublid_from_cyc_entity_alt(SubLObject fort) {
        return com.cyc.cycjava.cycl.subl_identifier.sublid_fort_to_id_lookup(fort);
    }

    /**
     * Returns the SubL identifier for FORT.
     */
    @LispMethod(comment = "Returns the SubL identifier for FORT.")
    public static SubLObject sublid_from_cyc_entity(final SubLObject fort) {
        return sublid_fort_to_id_lookup(fort);
    }

    public static final SubLObject sublid_add_domain_to_forts_alt(SubLObject domain, SubLObject fort) {
        return com.cyc.cycjava.cycl.subl_identifier.sublid_domain_to_forts_update(domain, fort, $ADD);
    }

    public static SubLObject sublid_add_domain_to_forts(final SubLObject domain, final SubLObject fort) {
        return sublid_domain_to_forts_update(domain, fort, $ADD);
    }

    public static final SubLObject sublid_remove_domain_to_forts_alt(SubLObject domain, SubLObject fort) {
        return com.cyc.cycjava.cycl.subl_identifier.sublid_domain_to_forts_update(domain, fort, $REMOVE);
    }

    public static SubLObject sublid_remove_domain_to_forts(final SubLObject domain, final SubLObject fort) {
        return sublid_domain_to_forts_update(domain, fort, $REMOVE);
    }

    public static final SubLObject sublid_domain_to_forts_update_alt(SubLObject domain, SubLObject fort, SubLObject operation) {
        SubLTrampolineFile.checkType(domain, SUBLID_DOMAIN_P);
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject existing = com.cyc.cycjava.cycl.subl_identifier.sublid_domain_to_forts_lookup(domain);
            SubLObject v_new = NIL;
            SubLObject pcase_var = operation;
            if (pcase_var.eql($ADD)) {
                v_new = cons(fort, existing);
            } else {
                if (pcase_var.eql($REMOVE)) {
                    v_new = remove(fort, existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    Errors.error($str_alt10$Unknown_sublid_domain_to_forts_up, operation);
                }
            }
            dictionary.dictionary_remove($sublid_domain_to_forts_table$.getGlobalValue(), domain);
            if (NIL != v_new) {
                dictionary.dictionary_enter($sublid_domain_to_forts_table$.getGlobalValue(), domain, v_new);
            }
        }
        return dictionary.dictionary_lookup($sublid_domain_to_forts_table$.getGlobalValue(), domain, UNPROVIDED);
    }

    public static SubLObject sublid_domain_to_forts_update(final SubLObject domain, final SubLObject fort, final SubLObject operation) {
        assert NIL != sublid_domain_p(domain) : "! subl_identifier.sublid_domain_p(domain) " + ("subl_identifier.sublid_domain_p(domain) " + "CommonSymbols.NIL != subl_identifier.sublid_domain_p(domain) ") + domain;
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        final SubLObject existing = sublid_domain_to_forts_lookup(domain);
        SubLObject v_new = NIL;
        if (operation.eql($ADD)) {
            v_new = cons(fort, existing);
        } else
            if (operation.eql($REMOVE)) {
                v_new = remove(fort, existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                Errors.error($str10$Unknown_sublid_domain_to_forts_up, operation);
            }

        dictionary.dictionary_remove($sublid_domain_to_forts_table$.getGlobalValue(), domain);
        if (NIL != v_new) {
            dictionary.dictionary_enter($sublid_domain_to_forts_table$.getGlobalValue(), domain, v_new);
        }
        return dictionary.dictionary_lookup($sublid_domain_to_forts_table$.getGlobalValue(), domain, UNPROVIDED);
    }

    /**
     * Returns a list of domains (collections) which have some instance identified by SUBLID.
     */
    @LispMethod(comment = "Returns a list of domains (collections) which have some instance identified by SUBLID.")
    public static final SubLObject sublid_domain_to_forts_lookup_alt(SubLObject domain) {
        SubLTrampolineFile.checkType(domain, SUBLID_DOMAIN_P);
        return dictionary.dictionary_lookup($sublid_domain_to_forts_table$.getGlobalValue(), domain, UNPROVIDED);
    }

    /**
     * Returns a list of domains (collections) which have some instance identified by SUBLID.
     */
    @LispMethod(comment = "Returns a list of domains (collections) which have some instance identified by SUBLID.")
    public static SubLObject sublid_domain_to_forts_lookup(final SubLObject domain) {
        assert NIL != sublid_domain_p(domain) : "! subl_identifier.sublid_domain_p(domain) " + ("subl_identifier.sublid_domain_p(domain) " + "CommonSymbols.NIL != subl_identifier.sublid_domain_p(domain) ") + domain;
        return dictionary.dictionary_lookup($sublid_domain_to_forts_table$.getGlobalValue(), domain, UNPROVIDED);
    }

    public static final SubLObject sublid_add_id_to_forts_alt(SubLObject sublid, SubLObject fort) {
        return com.cyc.cycjava.cycl.subl_identifier.sublid_id_to_forts_update(sublid, fort, $ADD);
    }

    public static SubLObject sublid_add_id_to_forts(final SubLObject sublid, final SubLObject fort) {
        return sublid_id_to_forts_update(sublid, fort, $ADD);
    }

    public static final SubLObject sublid_remove_id_to_forts_alt(SubLObject sublid, SubLObject fort) {
        return com.cyc.cycjava.cycl.subl_identifier.sublid_id_to_forts_update(sublid, fort, $REMOVE);
    }

    public static SubLObject sublid_remove_id_to_forts(final SubLObject sublid, final SubLObject fort) {
        return sublid_id_to_forts_update(sublid, fort, $REMOVE);
    }

    public static final SubLObject sublid_id_to_forts_update_alt(SubLObject sublid, SubLObject fort, SubLObject operation) {
        SubLTrampolineFile.checkType(sublid, SUBLID_P);
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject existing = com.cyc.cycjava.cycl.subl_identifier.sublid_id_to_forts_lookup(sublid);
            SubLObject v_new = NIL;
            if ($$SubLSymbolEntityFn == cycl_utilities.nat_functor(v_new)) {
                return existing;
            }
            if (NIL != list_utilities.member_eqP(v_new, existing)) {
                return existing;
            }
            {
                SubLObject pcase_var = operation;
                if (pcase_var.eql($ADD)) {
                    v_new = cons(fort, existing);
                } else {
                    if (pcase_var.eql($REMOVE)) {
                        v_new = remove(fort, existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        Errors.error($str_alt13$Unknown_sublid_forts_update_opera, operation);
                    }
                }
            }
            dictionary.dictionary_remove($sublid_id_to_forts_table$.getGlobalValue(), sublid);
            if (NIL != v_new) {
                dictionary.dictionary_enter($sublid_id_to_forts_table$.getGlobalValue(), sublid, v_new);
            }
        }
        return dictionary.dictionary_lookup($sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED);
    }

    public static SubLObject sublid_id_to_forts_update(final SubLObject sublid, final SubLObject fort, final SubLObject operation) {
        assert NIL != sublid_p(sublid) : "! subl_identifier.sublid_p(sublid) " + ("subl_identifier.sublid_p(sublid) " + "CommonSymbols.NIL != subl_identifier.sublid_p(sublid) ") + sublid;
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        final SubLObject existing = sublid_id_to_forts_lookup(sublid);
        SubLObject v_new = NIL;
        if ($$SubLSymbolEntityFn.eql(cycl_utilities.nat_functor(v_new))) {
            return existing;
        }
        if (NIL != list_utilities.member_eqP(v_new, existing)) {
            return existing;
        }
        if (operation.eql($ADD)) {
            v_new = cons(fort, existing);
        } else
            if (operation.eql($REMOVE)) {
                v_new = remove(fort, existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                Errors.error($str13$Unknown_sublid_forts_update_opera, operation);
            }

        dictionary.dictionary_remove($sublid_id_to_forts_table$.getGlobalValue(), sublid);
        if (NIL != v_new) {
            dictionary.dictionary_enter($sublid_id_to_forts_table$.getGlobalValue(), sublid, v_new);
        }
        return dictionary.dictionary_lookup($sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED);
    }

    public static final SubLObject cleanup_sublid_id_to_forts_alt(SubLObject sublid) {
        {
            SubLObject existing = com.cyc.cycjava.cycl.subl_identifier.sublid_id_to_forts_lookup(sublid);
            SubLObject v_new = list_utilities.fast_delete_duplicates(existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            v_new = remove($$SubLSymbolEntityFn, v_new, EQ, NAT_FUNCTOR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            dictionary.dictionary_remove($sublid_id_to_forts_table$.getGlobalValue(), sublid);
            if (NIL != v_new) {
                dictionary.dictionary_enter($sublid_id_to_forts_table$.getGlobalValue(), sublid, v_new);
            }
            return dictionary.dictionary_lookup($sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED);
        }
    }

    public static SubLObject cleanup_sublid_id_to_forts(final SubLObject sublid) {
        final SubLObject existing = sublid_id_to_forts_lookup(sublid);
        SubLObject v_new = list_utilities.fast_delete_duplicates(existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        v_new = remove($$SubLSymbolEntityFn, v_new, EQ, NAT_FUNCTOR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        dictionary.dictionary_remove($sublid_id_to_forts_table$.getGlobalValue(), sublid);
        if (NIL != v_new) {
            dictionary.dictionary_enter($sublid_id_to_forts_table$.getGlobalValue(), sublid, v_new);
        }
        return dictionary.dictionary_lookup($sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED);
    }

    /**
     * Returns a list of FORTs which are identified by SUBLID in some domain.
     */
    @LispMethod(comment = "Returns a list of FORTs which are identified by SUBLID in some domain.")
    public static final SubLObject sublid_id_to_forts_lookup_alt(SubLObject sublid) {
        SubLTrampolineFile.checkType(sublid, SUBLID_P);
        return dictionary.dictionary_lookup($sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED);
    }

    /**
     * Returns a list of FORTs which are identified by SUBLID in some domain.
     */
    @LispMethod(comment = "Returns a list of FORTs which are identified by SUBLID in some domain.")
    public static SubLObject sublid_id_to_forts_lookup(final SubLObject sublid) {
        assert NIL != sublid_p(sublid) : "! subl_identifier.sublid_p(sublid) " + ("subl_identifier.sublid_p(sublid) " + "CommonSymbols.NIL != subl_identifier.sublid_p(sublid) ") + sublid;
        return dictionary.dictionary_lookup($sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED);
    }

    public static final SubLObject sublid_add_fort_to_id_alt(SubLObject fort, SubLObject sublid) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        SubLTrampolineFile.checkType(sublid, SUBLID_P);
        return dictionary.dictionary_enter($sublid_fort_to_id_table$.getGlobalValue(), fort, sublid);
    }

    public static SubLObject sublid_add_fort_to_id(final SubLObject fort, final SubLObject sublid) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        assert NIL != sublid_p(sublid) : "! subl_identifier.sublid_p(sublid) " + ("subl_identifier.sublid_p(sublid) " + "CommonSymbols.NIL != subl_identifier.sublid_p(sublid) ") + sublid;
        return dictionary.dictionary_enter($sublid_fort_to_id_table$.getGlobalValue(), fort, sublid);
    }

    public static final SubLObject sublid_remove_fort_to_id_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        return dictionary.dictionary_remove($sublid_fort_to_id_table$.getGlobalValue(), fort);
    }

    public static SubLObject sublid_remove_fort_to_id(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        return dictionary.dictionary_remove($sublid_fort_to_id_table$.getGlobalValue(), fort);
    }

    /**
     * Returns the SubL identifier for FORT.
     */
    @LispMethod(comment = "Returns the SubL identifier for FORT.")
    public static final SubLObject sublid_fort_to_id_lookup_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        return dictionary.dictionary_lookup($sublid_fort_to_id_table$.getGlobalValue(), fort, UNPROVIDED);
    }

    /**
     * Returns the SubL identifier for FORT.
     */
    @LispMethod(comment = "Returns the SubL identifier for FORT.")
    public static SubLObject sublid_fort_to_id_lookup(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        return dictionary.dictionary_lookup($sublid_fort_to_id_table$.getGlobalValue(), fort, UNPROVIDED);
    }

    /**
     * Initialize the SubL identifier mappings from the predicate extents of
     * #$subLIdentifier and #$uniquelyIdentifiedInType.
     */
    @LispMethod(comment = "Initialize the SubL identifier mappings from the predicate extents of\r\n#$subLIdentifier and #$uniquelyIdentifiedInType.\nInitialize the SubL identifier mappings from the predicate extents of\n#$subLIdentifier and #$uniquelyIdentifiedInType.")
    public static final SubLObject initialize_sublid_mappings_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            dictionary.clear_dictionary($sublid_domain_to_forts_table$.getGlobalValue());
            dictionary.clear_dictionary($sublid_id_to_forts_table$.getGlobalValue());
            dictionary.clear_dictionary($sublid_fort_to_id_table$.getGlobalValue());
            if ((NIL != fort_types_interface.mtP(mt_vars.$sublid_mt$.getGlobalValue())) && (NIL != fort_types_interface.predicateP($sublid_pred$.getGlobalValue()))) {
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$sublid_mt$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject pred_var = $sublid_pred$.getGlobalValue();
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_1 = NIL;
                                                                SubLObject token_var_2 = NIL;
                                                                while (NIL == done_var_1) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                        SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                        if (NIL != valid_3) {
                                                                            com.cyc.cycjava.cycl.subl_identifier.sublid_mappings_add(assertion);
                                                                        }
                                                                        done_var_1 = makeBoolean(NIL == valid_3);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                            {
                                SubLObject pred_var = $sublid_uiit_pred$.getGlobalValue();
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_5 = NIL;
                                                                SubLObject token_var_6 = NIL;
                                                                while (NIL == done_var_5) {
                                                                    {
                                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                                                        SubLObject valid_7 = makeBoolean(token_var_6 != assertion);
                                                                        if (NIL != valid_7) {
                                                                            com.cyc.cycjava.cycl.subl_identifier.uiit_mappings_add(assertion);
                                                                        }
                                                                        done_var_5 = makeBoolean(NIL == valid_7);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
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
            return NIL;
        }
    }

    /**
     * Initialize the SubL identifier mappings from the predicate extents of
     * #$subLIdentifier and #$uniquelyIdentifiedInType.
     */
    @LispMethod(comment = "Initialize the SubL identifier mappings from the predicate extents of\r\n#$subLIdentifier and #$uniquelyIdentifiedInType.\nInitialize the SubL identifier mappings from the predicate extents of\n#$subLIdentifier and #$uniquelyIdentifiedInType.")
    public static SubLObject initialize_sublid_mappings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary($sublid_domain_to_forts_table$.getGlobalValue());
        dictionary.clear_dictionary($sublid_id_to_forts_table$.getGlobalValue());
        dictionary.clear_dictionary($sublid_fort_to_id_table$.getGlobalValue());
        if ((NIL != fort_types_interface.mtP(mt_vars.$sublid_mt$.getGlobalValue())) && (NIL != fort_types_interface.predicateP($sublid_pred$.getGlobalValue()))) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$sublid_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject pred_var = $sublid_pred$.getGlobalValue();
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$1 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$2 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                        if (NIL != valid_$6) {
                                            sublid_mappings_add(assertion);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$2, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                pred_var = $sublid_uiit_pred$.getGlobalValue();
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$3 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$4 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
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
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$5 = NIL;
                                    final SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                        if (NIL != valid_$7) {
                                            uiit_mappings_add(assertion);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$4, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject add_sublidentifier_alt(SubLObject argument, SubLObject assertion) {
        return com.cyc.cycjava.cycl.subl_identifier.sublid_mappings_add(assertion);
    }

    public static SubLObject add_sublidentifier(final SubLObject argument, final SubLObject assertion) {
        return sublid_mappings_add(assertion);
    }

    public static final SubLObject remove_sublidentifier_alt(SubLObject argument, SubLObject assertion) {
        return com.cyc.cycjava.cycl.subl_identifier.sublid_mappings_remove(assertion);
    }

    public static SubLObject remove_sublidentifier(final SubLObject argument, final SubLObject assertion) {
        return sublid_mappings_remove(assertion);
    }

    public static final SubLObject sublid_mappings_add_alt(SubLObject assertion) {
        {
            SubLObject fort = assertions_high.gaf_arg1(assertion);
            SubLObject sublid = subl_escape_subl(assertions_high.gaf_arg2(assertion));
            com.cyc.cycjava.cycl.subl_identifier.sublid_add_id_to_forts(sublid, fort);
            com.cyc.cycjava.cycl.subl_identifier.sublid_add_fort_to_id(fort, sublid);
        }
        return NIL;
    }

    public static SubLObject sublid_mappings_add(final SubLObject assertion) {
        final SubLObject fort = assertions_high.gaf_arg1(assertion);
        final SubLObject sublid = subl_escape_subl(assertions_high.gaf_arg2(assertion));
        sublid_add_id_to_forts(sublid, fort);
        sublid_add_fort_to_id(fort, sublid);
        return NIL;
    }

    public static final SubLObject sublid_mappings_remove_alt(SubLObject assertion) {
        {
            SubLObject fort = assertions_high.gaf_arg1(assertion);
            SubLObject sublid = subl_escape_subl(assertions_high.gaf_arg2(assertion));
            com.cyc.cycjava.cycl.subl_identifier.sublid_remove_id_to_forts(sublid, fort);
            com.cyc.cycjava.cycl.subl_identifier.sublid_remove_fort_to_id(fort);
        }
        return NIL;
    }

    public static SubLObject sublid_mappings_remove(final SubLObject assertion) {
        final SubLObject fort = assertions_high.gaf_arg1(assertion);
        final SubLObject sublid = subl_escape_subl(assertions_high.gaf_arg2(assertion));
        sublid_remove_id_to_forts(sublid, fort);
        sublid_remove_fort_to_id(fort);
        return NIL;
    }

    public static final SubLObject add_uniquelyidentifiedintype_alt(SubLObject argument, SubLObject assertion) {
        return com.cyc.cycjava.cycl.subl_identifier.uiit_mappings_add(assertion);
    }

    public static SubLObject add_uniquelyidentifiedintype(final SubLObject argument, final SubLObject assertion) {
        return uiit_mappings_add(assertion);
    }

    public static final SubLObject remove_uniquelyidentifiedintype_alt(SubLObject argument, SubLObject assertion) {
        return com.cyc.cycjava.cycl.subl_identifier.uiit_mappings_remove(assertion);
    }

    public static SubLObject remove_uniquelyidentifiedintype(final SubLObject argument, final SubLObject assertion) {
        return uiit_mappings_remove(assertion);
    }

    public static final SubLObject uiit_mappings_add_alt(SubLObject assertion) {
        {
            SubLObject fort = assertions_high.gaf_arg1(assertion);
            SubLObject domain = assertions_high.gaf_arg2(assertion);
            return com.cyc.cycjava.cycl.subl_identifier.sublid_add_domain_to_forts(domain, fort);
        }
    }

    public static SubLObject uiit_mappings_add(final SubLObject assertion) {
        final SubLObject fort = assertions_high.gaf_arg1(assertion);
        final SubLObject domain = assertions_high.gaf_arg2(assertion);
        return sublid_add_domain_to_forts(domain, fort);
    }

    public static final SubLObject uiit_mappings_remove_alt(SubLObject assertion) {
        {
            SubLObject fort = assertions_high.gaf_arg1(assertion);
            SubLObject domain = assertions_high.gaf_arg2(assertion);
            return com.cyc.cycjava.cycl.subl_identifier.sublid_remove_domain_to_forts(domain, fort);
        }
    }

    public static SubLObject uiit_mappings_remove(final SubLObject assertion) {
        final SubLObject fort = assertions_high.gaf_arg1(assertion);
        final SubLObject domain = assertions_high.gaf_arg2(assertion);
        return sublid_remove_domain_to_forts(domain, fort);
    }

    public static final SubLObject declare_subl_identifier_file_alt() {
        declareFunction("sublid_p", "SUBLID-P", 1, 0, false);
        declareFunction("sublid_domain_p", "SUBLID-DOMAIN-P", 1, 0, false);
        declareFunction("cyc_entity_from_sublid", "CYC-ENTITY-FROM-SUBLID", 2, 0, false);
        declareFunction("sublid_from_cyc_entity", "SUBLID-FROM-CYC-ENTITY", 1, 0, false);
        declareFunction("sublid_add_domain_to_forts", "SUBLID-ADD-DOMAIN-TO-FORTS", 2, 0, false);
        declareFunction("sublid_remove_domain_to_forts", "SUBLID-REMOVE-DOMAIN-TO-FORTS", 2, 0, false);
        declareFunction("sublid_domain_to_forts_update", "SUBLID-DOMAIN-TO-FORTS-UPDATE", 3, 0, false);
        declareFunction("sublid_domain_to_forts_lookup", "SUBLID-DOMAIN-TO-FORTS-LOOKUP", 1, 0, false);
        declareFunction("sublid_add_id_to_forts", "SUBLID-ADD-ID-TO-FORTS", 2, 0, false);
        declareFunction("sublid_remove_id_to_forts", "SUBLID-REMOVE-ID-TO-FORTS", 2, 0, false);
        declareFunction("sublid_id_to_forts_update", "SUBLID-ID-TO-FORTS-UPDATE", 3, 0, false);
        declareFunction("cleanup_sublid_id_to_forts", "CLEANUP-SUBLID-ID-TO-FORTS", 1, 0, false);
        declareFunction("sublid_id_to_forts_lookup", "SUBLID-ID-TO-FORTS-LOOKUP", 1, 0, false);
        declareFunction("sublid_add_fort_to_id", "SUBLID-ADD-FORT-TO-ID", 2, 0, false);
        declareFunction("sublid_remove_fort_to_id", "SUBLID-REMOVE-FORT-TO-ID", 1, 0, false);
        declareFunction("sublid_fort_to_id_lookup", "SUBLID-FORT-TO-ID-LOOKUP", 1, 0, false);
        declareFunction("initialize_sublid_mappings", "INITIALIZE-SUBLID-MAPPINGS", 0, 0, false);
        declareFunction("add_sublidentifier", "ADD-SUBLIDENTIFIER", 2, 0, false);
        declareFunction("remove_sublidentifier", "REMOVE-SUBLIDENTIFIER", 2, 0, false);
        declareFunction("sublid_mappings_add", "SUBLID-MAPPINGS-ADD", 1, 0, false);
        declareFunction("sublid_mappings_remove", "SUBLID-MAPPINGS-REMOVE", 1, 0, false);
        declareFunction("add_uniquelyidentifiedintype", "ADD-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
        declareFunction("remove_uniquelyidentifiedintype", "REMOVE-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
        declareFunction("uiit_mappings_add", "UIIT-MAPPINGS-ADD", 1, 0, false);
        declareFunction("uiit_mappings_remove", "UIIT-MAPPINGS-REMOVE", 1, 0, false);
        declareFunction("get_sublid_test_fort", "GET-SUBLID-TEST-FORT", 1, 0, false);
        declareFunction("set_sublid_test_fort", "SET-SUBLID-TEST-FORT", 2, 0, false);
        declareFunction("get_sublid_test_domain", "GET-SUBLID-TEST-DOMAIN", 1, 0, false);
        declareFunction("set_sublid_test_domain", "SET-SUBLID-TEST-DOMAIN", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sublid_test_class", "SUBLOOP-RESERVED-INITIALIZE-SUBLID-TEST-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sublid_test_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBLID-TEST-INSTANCE", 1, 0, false);
        declareFunction("sublid_test_p", "SUBLID-TEST-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_subl_identifier_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("sublid_p", "SUBLID-P", 1, 0, false);
            declareFunction("sublid_domain_p", "SUBLID-DOMAIN-P", 1, 0, false);
            declareFunction("cyc_entity_from_sublid", "CYC-ENTITY-FROM-SUBLID", 2, 0, false);
            declareFunction("sublid_from_cyc_entity", "SUBLID-FROM-CYC-ENTITY", 1, 0, false);
            declareFunction("sublid_add_domain_to_forts", "SUBLID-ADD-DOMAIN-TO-FORTS", 2, 0, false);
            declareFunction("sublid_remove_domain_to_forts", "SUBLID-REMOVE-DOMAIN-TO-FORTS", 2, 0, false);
            declareFunction("sublid_domain_to_forts_update", "SUBLID-DOMAIN-TO-FORTS-UPDATE", 3, 0, false);
            declareFunction("sublid_domain_to_forts_lookup", "SUBLID-DOMAIN-TO-FORTS-LOOKUP", 1, 0, false);
            declareFunction("sublid_add_id_to_forts", "SUBLID-ADD-ID-TO-FORTS", 2, 0, false);
            declareFunction("sublid_remove_id_to_forts", "SUBLID-REMOVE-ID-TO-FORTS", 2, 0, false);
            declareFunction("sublid_id_to_forts_update", "SUBLID-ID-TO-FORTS-UPDATE", 3, 0, false);
            declareFunction("cleanup_sublid_id_to_forts", "CLEANUP-SUBLID-ID-TO-FORTS", 1, 0, false);
            declareFunction("sublid_id_to_forts_lookup", "SUBLID-ID-TO-FORTS-LOOKUP", 1, 0, false);
            declareFunction("sublid_add_fort_to_id", "SUBLID-ADD-FORT-TO-ID", 2, 0, false);
            declareFunction("sublid_remove_fort_to_id", "SUBLID-REMOVE-FORT-TO-ID", 1, 0, false);
            declareFunction("sublid_fort_to_id_lookup", "SUBLID-FORT-TO-ID-LOOKUP", 1, 0, false);
            declareFunction("initialize_sublid_mappings", "INITIALIZE-SUBLID-MAPPINGS", 0, 0, false);
            declareFunction("add_sublidentifier", "ADD-SUBLIDENTIFIER", 2, 0, false);
            declareFunction("remove_sublidentifier", "REMOVE-SUBLIDENTIFIER", 2, 0, false);
            declareFunction("sublid_mappings_add", "SUBLID-MAPPINGS-ADD", 1, 0, false);
            declareFunction("sublid_mappings_remove", "SUBLID-MAPPINGS-REMOVE", 1, 0, false);
            declareFunction("add_uniquelyidentifiedintype", "ADD-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
            declareFunction("remove_uniquelyidentifiedintype", "REMOVE-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
            declareFunction("uiit_mappings_add", "UIIT-MAPPINGS-ADD", 1, 0, false);
            declareFunction("uiit_mappings_remove", "UIIT-MAPPINGS-REMOVE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_sublid_test_fort", "GET-SUBLID-TEST-FORT", 1, 0, false);
            declareFunction("set_sublid_test_fort", "SET-SUBLID-TEST-FORT", 2, 0, false);
            declareFunction("get_sublid_test_domain", "GET-SUBLID-TEST-DOMAIN", 1, 0, false);
            declareFunction("set_sublid_test_domain", "SET-SUBLID-TEST-DOMAIN", 2, 0, false);
            declareFunction("subloop_reserved_initialize_sublid_test_class", "SUBLOOP-RESERVED-INITIALIZE-SUBLID-TEST-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_sublid_test_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBLID-TEST-INSTANCE", 1, 0, false);
            declareFunction("sublid_test_p", "SUBLID-TEST-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_subl_identifier_file_Previous() {
        declareFunction("sublid_p", "SUBLID-P", 1, 0, false);
        declareFunction("sublid_domain_p", "SUBLID-DOMAIN-P", 1, 0, false);
        declareFunction("cyc_entity_from_sublid", "CYC-ENTITY-FROM-SUBLID", 2, 0, false);
        declareFunction("sublid_from_cyc_entity", "SUBLID-FROM-CYC-ENTITY", 1, 0, false);
        declareFunction("sublid_add_domain_to_forts", "SUBLID-ADD-DOMAIN-TO-FORTS", 2, 0, false);
        declareFunction("sublid_remove_domain_to_forts", "SUBLID-REMOVE-DOMAIN-TO-FORTS", 2, 0, false);
        declareFunction("sublid_domain_to_forts_update", "SUBLID-DOMAIN-TO-FORTS-UPDATE", 3, 0, false);
        declareFunction("sublid_domain_to_forts_lookup", "SUBLID-DOMAIN-TO-FORTS-LOOKUP", 1, 0, false);
        declareFunction("sublid_add_id_to_forts", "SUBLID-ADD-ID-TO-FORTS", 2, 0, false);
        declareFunction("sublid_remove_id_to_forts", "SUBLID-REMOVE-ID-TO-FORTS", 2, 0, false);
        declareFunction("sublid_id_to_forts_update", "SUBLID-ID-TO-FORTS-UPDATE", 3, 0, false);
        declareFunction("cleanup_sublid_id_to_forts", "CLEANUP-SUBLID-ID-TO-FORTS", 1, 0, false);
        declareFunction("sublid_id_to_forts_lookup", "SUBLID-ID-TO-FORTS-LOOKUP", 1, 0, false);
        declareFunction("sublid_add_fort_to_id", "SUBLID-ADD-FORT-TO-ID", 2, 0, false);
        declareFunction("sublid_remove_fort_to_id", "SUBLID-REMOVE-FORT-TO-ID", 1, 0, false);
        declareFunction("sublid_fort_to_id_lookup", "SUBLID-FORT-TO-ID-LOOKUP", 1, 0, false);
        declareFunction("initialize_sublid_mappings", "INITIALIZE-SUBLID-MAPPINGS", 0, 0, false);
        declareFunction("add_sublidentifier", "ADD-SUBLIDENTIFIER", 2, 0, false);
        declareFunction("remove_sublidentifier", "REMOVE-SUBLIDENTIFIER", 2, 0, false);
        declareFunction("sublid_mappings_add", "SUBLID-MAPPINGS-ADD", 1, 0, false);
        declareFunction("sublid_mappings_remove", "SUBLID-MAPPINGS-REMOVE", 1, 0, false);
        declareFunction("add_uniquelyidentifiedintype", "ADD-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
        declareFunction("remove_uniquelyidentifiedintype", "REMOVE-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
        declareFunction("uiit_mappings_add", "UIIT-MAPPINGS-ADD", 1, 0, false);
        declareFunction("uiit_mappings_remove", "UIIT-MAPPINGS-REMOVE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_subl_identifier_file_alt() {
        deflexical("*SUBLID-DOMAIN-TO-FORTS-TABLE*", NIL != boundp($sublid_domain_to_forts_table$) ? ((SubLObject) ($sublid_domain_to_forts_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*SUBLID-ID-TO-FORTS-TABLE*", NIL != boundp($sublid_id_to_forts_table$) ? ((SubLObject) ($sublid_id_to_forts_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*SUBLID-FORT-TO-ID-TABLE*", NIL != boundp($sublid_fort_to_id_table$) ? ((SubLObject) ($sublid_fort_to_id_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*SUBLID-PRED*", $$subLIdentifier);
        defconstant("*SUBLID-UIIT-PRED*", $$uniquelyIdentifiedInType);
        return NIL;
    }

    public static SubLObject init_subl_identifier_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SUBLID-DOMAIN-TO-FORTS-TABLE*", SubLTrampolineFile.maybeDefault($sublid_domain_to_forts_table$, $sublid_domain_to_forts_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*SUBLID-ID-TO-FORTS-TABLE*", SubLTrampolineFile.maybeDefault($sublid_id_to_forts_table$, $sublid_id_to_forts_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*SUBLID-FORT-TO-ID-TABLE*", SubLTrampolineFile.maybeDefault($sublid_fort_to_id_table$, $sublid_fort_to_id_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            defconstant("*SUBLID-PRED*", $$subLIdentifier);
            defconstant("*SUBLID-UIIT-PRED*", $$uniquelyIdentifiedInType);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SUBLID-DOMAIN-TO-FORTS-TABLE*", NIL != boundp($sublid_domain_to_forts_table$) ? ((SubLObject) ($sublid_domain_to_forts_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*SUBLID-ID-TO-FORTS-TABLE*", NIL != boundp($sublid_id_to_forts_table$) ? ((SubLObject) ($sublid_id_to_forts_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*SUBLID-FORT-TO-ID-TABLE*", NIL != boundp($sublid_fort_to_id_table$) ? ((SubLObject) ($sublid_fort_to_id_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_subl_identifier_file_Previous() {
        deflexical("*SUBLID-DOMAIN-TO-FORTS-TABLE*", SubLTrampolineFile.maybeDefault($sublid_domain_to_forts_table$, $sublid_domain_to_forts_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*SUBLID-ID-TO-FORTS-TABLE*", SubLTrampolineFile.maybeDefault($sublid_id_to_forts_table$, $sublid_id_to_forts_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*SUBLID-FORT-TO-ID-TABLE*", SubLTrampolineFile.maybeDefault($sublid_fort_to_id_table$, $sublid_fort_to_id_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*SUBLID-PRED*", $$subLIdentifier);
        defconstant("*SUBLID-UIIT-PRED*", $$uniquelyIdentifiedInType);
        return NIL;
    }

    public static final SubLObject setup_subl_identifier_file_alt() {
        declare_defglobal($sublid_domain_to_forts_table$);
        declare_defglobal($sublid_id_to_forts_table$);
        declare_defglobal($sublid_fort_to_id_table$);
        register_kb_function(ADD_SUBLIDENTIFIER);
        register_kb_function(REMOVE_SUBLIDENTIFIER);
        register_kb_function(ADD_UNIQUELYIDENTIFIEDINTYPE);
        register_kb_function(REMOVE_UNIQUELYIDENTIFIEDINTYPE);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SUBLID_TEST, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(SUBLID_TEST);
        classes.subloop_new_class(SUBLID_TEST, CYCL_TEST_CASE, NIL, NIL, $list_alt23);
        classes.class_set_implements_slot_listeners(SUBLID_TEST, NIL);
        classes.subloop_note_class_initialization_function(SUBLID_TEST, SUBLOOP_RESERVED_INITIALIZE_SUBLID_TEST_CLASS);
        classes.subloop_note_instance_initialization_function(SUBLID_TEST, SUBLOOP_RESERVED_INITIALIZE_SUBLID_TEST_INSTANCE);
        com.cyc.cycjava.cycl.subl_identifier.subloop_reserved_initialize_sublid_test_class(SUBLID_TEST);
        sunit_macros.define_test_case_postamble(SUBLID_TEST, $str_alt42$subl_identifier, $$$cycl, NIL);
        sunit_macros.def_test_method_register(SUBLID_TEST, TEST_INITIALIZATION);
        sunit_macros.def_test_method_register(SUBLID_TEST, TEST_SUBLID_RETRIEVAL);
        sunit_macros.def_test_method_register(SUBLID_TEST, TEST_AFTER_ADDING);
        sunit_macros.def_test_method_register(SUBLID_TEST, TEST_SUBLID_CONSISTENCY);
        sunit_macros.def_test_method_register(SUBLID_TEST, TEST_SUBLID_INFERENCE_PARAMETER_COVERAGE);
        return NIL;
    }

    public static SubLObject setup_subl_identifier_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($sublid_domain_to_forts_table$);
            declare_defglobal($sublid_id_to_forts_table$);
            declare_defglobal($sublid_fort_to_id_table$);
            register_kb_function(ADD_SUBLIDENTIFIER);
            register_kb_function(REMOVE_SUBLIDENTIFIER);
            register_kb_function(ADD_UNIQUELYIDENTIFIEDINTYPE);
            register_kb_function(REMOVE_UNIQUELYIDENTIFIEDINTYPE);
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SUBLID_TEST, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(SUBLID_TEST);
            classes.subloop_new_class(SUBLID_TEST, CYCL_TEST_CASE, NIL, NIL, $list_alt23);
            classes.class_set_implements_slot_listeners(SUBLID_TEST, NIL);
            classes.subloop_note_class_initialization_function(SUBLID_TEST, SUBLOOP_RESERVED_INITIALIZE_SUBLID_TEST_CLASS);
            classes.subloop_note_instance_initialization_function(SUBLID_TEST, SUBLOOP_RESERVED_INITIALIZE_SUBLID_TEST_INSTANCE);
            com.cyc.cycjava.cycl.subl_identifier.subloop_reserved_initialize_sublid_test_class(SUBLID_TEST);
            sunit_macros.define_test_case_postamble(SUBLID_TEST, $str_alt42$subl_identifier, $$$cycl, NIL);
            sunit_macros.def_test_method_register(SUBLID_TEST, TEST_INITIALIZATION);
            sunit_macros.def_test_method_register(SUBLID_TEST, TEST_SUBLID_RETRIEVAL);
            sunit_macros.def_test_method_register(SUBLID_TEST, TEST_AFTER_ADDING);
            sunit_macros.def_test_method_register(SUBLID_TEST, TEST_SUBLID_CONSISTENCY);
            sunit_macros.def_test_method_register(SUBLID_TEST, TEST_SUBLID_INFERENCE_PARAMETER_COVERAGE);
        }
        return NIL;
    }

    public static SubLObject setup_subl_identifier_file_Previous() {
        declare_defglobal($sublid_domain_to_forts_table$);
        declare_defglobal($sublid_id_to_forts_table$);
        declare_defglobal($sublid_fort_to_id_table$);
        register_kb_function(ADD_SUBLIDENTIFIER);
        register_kb_function(REMOVE_SUBLIDENTIFIER);
        register_kb_function(ADD_UNIQUELYIDENTIFIEDINTYPE);
        register_kb_function(REMOVE_UNIQUELYIDENTIFIEDINTYPE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subl_identifier_file();
    }

    @Override
    public void initializeVariables() {
        init_subl_identifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subl_identifier_file();
    }

    static {
    }

    static private final SubLString $str_alt5$More_than_one_Cyc_entity_found_fo = makeString("More than one Cyc entity found for ID ~A and domain ~A.");

    static private final SubLString $str_alt10$Unknown_sublid_domain_to_forts_up = makeString("Unknown sublid-domain-to-forts-update operation ~A");

    static private final SubLString $str_alt13$Unknown_sublid_forts_update_opera = makeString("Unknown sublid-forts-update operation ~A");

    private static final SubLSymbol SUBLID_TEST = makeSymbol("SUBLID-TEST");

    private static final SubLSymbol CYCL_TEST_CASE = makeSymbol("CYCL-TEST-CASE");

    static private final SubLList $list_alt23 = list(list(makeSymbol("DOMAIN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FORT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INITIALIZATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-SUBLID-RETRIEVAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-AFTER-ADDING"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-SUBLID-CONSISTENCY"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBLID_TEST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLID-TEST-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBLID_TEST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLID-TEST-INSTANCE");

    static private final SubLString $str_alt42$subl_identifier = makeString("subl-identifier");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol TEST_INITIALIZATION = makeSymbol("TEST-INITIALIZATION");

    private static final SubLSymbol TEST_SUBLID_RETRIEVAL = makeSymbol("TEST-SUBLID-RETRIEVAL");

    private static final SubLSymbol TEST_AFTER_ADDING = makeSymbol("TEST-AFTER-ADDING");

    private static final SubLSymbol TEST_SUBLID_CONSISTENCY = makeSymbol("TEST-SUBLID-CONSISTENCY");

    private static final SubLSymbol TEST_SUBLID_INFERENCE_PARAMETER_COVERAGE = makeSymbol("TEST-SUBLID-INFERENCE-PARAMETER-COVERAGE");
}

/**
 * Total time: 308 ms
 */
