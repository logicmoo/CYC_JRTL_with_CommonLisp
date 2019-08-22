/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.nl_stats;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.sunit_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      VERB-ARGUMENT-LOOKUPS
 *  source file: /cyc/top/cycl/nl-stats/verb-argument-lookups.lisp
 *  created:     2019/07/03 17:39:01
 */
public final class verb_argument_lookups extends SubLTranslatedFile implements V02 {
    // // Constructor
    private verb_argument_lookups() {
    }

    public static final SubLFile me = new verb_argument_lookups();


    // // Definitions
    // defconstant
    public static final SubLSymbol $nl_stats_supported_verb_arg_positions$ = makeSymbol("*NL-STATS-SUPPORTED-VERB-ARG-POSITIONS*");

    public static final SubLObject nl_stats_supported_verb_arg_position_p(SubLObject v_object) {
        return member(v_object, $nl_stats_supported_verb_arg_positions$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    // defparameter
    public static final SubLSymbol $verb_argument_directory_list$ = makeSymbol("*VERB-ARGUMENT-DIRECTORY-LIST*");

    /**
     * Construct the pathname of the file FILENAME
     */
    public static final SubLObject verb_argument_pathname(SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = $$$fht;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return file_utilities.cyc_home_filename($verb_argument_directory_list$.getDynamicValue(thread), filename, extension);
        }
    }

    /**
     *
     *
     * @return file-hash-table-p or NIL
    Open the table in file FILENAME if there's a table there
     */
    public static final SubLObject open_verb_argument_fht(SubLObject filename) {
        {
            SubLObject error = NIL;
            SubLObject fht = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            fht = file_hash_table.open_file_hash_table_read_only(verb_argument_pathname(filename, UNPROVIDED), symbol_function(EQUAL), $IMAGE_INDEPENDENT_CFASL);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                return fht;
            } else {
                return $TABLE_NOT_FOUND;
            }
        }
    }

    // deflexical
    public static final SubLSymbol $typical_subjects_by_verb_fht_filename$ = makeSymbol("*TYPICAL-SUBJECTS-BY-VERB-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $typical_objects_by_verb_fht_filename$ = makeSymbol("*TYPICAL-OBJECTS-BY-VERB-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $subject_selectiveness_fht_filename$ = makeSymbol("*SUBJECT-SELECTIVENESS-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $object_selectiveness_fht_filename$ = makeSymbol("*OBJECT-SELECTIVENESS-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $subject_selectional_preference_strengths_fht_filename$ = makeSymbol("*SUBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $object_selectional_preference_strengths_fht_filename$ = makeSymbol("*OBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $subject_adjusted_pointwise_mutual_information_fht_filename$ = makeSymbol("*SUBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $object_adjusted_pointwise_mutual_information_fht_filename$ = makeSymbol("*OBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $subject_selectional_associations_fht_filename$ = makeSymbol("*SUBJECT-SELECTIONAL-ASSOCIATIONS-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $object_selectional_associations_fht_filename$ = makeSymbol("*OBJECT-SELECTIONAL-ASSOCIATIONS-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $subject_matching_collections_by_verb_fht_filename$ = makeSymbol("*SUBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $object_matching_collections_by_verb_fht_filename$ = makeSymbol("*OBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT-FILENAME*");

    // deflexical
    public static final SubLSymbol $noun_conjectures_fht_filename$ = makeSymbol("*NOUN-CONJECTURES-FHT-FILENAME*");

    // deflexical
    private static final SubLSymbol $typical_subjects_by_verb_fht$ = makeSymbol("*TYPICAL-SUBJECTS-BY-VERB-FHT*");

    // deflexical
    private static final SubLSymbol $typical_objects_by_verb_fht$ = makeSymbol("*TYPICAL-OBJECTS-BY-VERB-FHT*");

    // deflexical
    private static final SubLSymbol $subject_selectiveness_fht$ = makeSymbol("*SUBJECT-SELECTIVENESS-FHT*");

    // deflexical
    private static final SubLSymbol $object_selectiveness_fht$ = makeSymbol("*OBJECT-SELECTIVENESS-FHT*");

    // deflexical
    private static final SubLSymbol $subject_selectional_preference_strengths_fht$ = makeSymbol("*SUBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT*");

    // deflexical
    private static final SubLSymbol $object_selectional_preference_strengths_fht$ = makeSymbol("*OBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT*");

    // deflexical
    private static final SubLSymbol $subject_adjusted_pointwise_mutual_information_fht$ = makeSymbol("*SUBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT*");

    // deflexical
    private static final SubLSymbol $object_adjusted_pointwise_mutual_information_fht$ = makeSymbol("*OBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT*");

    // deflexical
    private static final SubLSymbol $subject_selectional_associations_fht$ = makeSymbol("*SUBJECT-SELECTIONAL-ASSOCIATIONS-FHT*");

    // deflexical
    private static final SubLSymbol $object_selectional_associations_fht$ = makeSymbol("*OBJECT-SELECTIONAL-ASSOCIATIONS-FHT*");

    // deflexical
    private static final SubLSymbol $subject_matching_collections_by_verb_fht$ = makeSymbol("*SUBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT*");

    // deflexical
    private static final SubLSymbol $object_matching_collections_by_verb_fht$ = makeSymbol("*OBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT*");

    // deflexical
    private static final SubLSymbol $noun_conjectures_fht$ = makeSymbol("*NOUN-CONJECTURES-FHT*");

    /**
     * This can be used when you want to switch to using different tables.
     */
    public static final SubLObject reinitialize_verb_argument_fhts() {
        $typical_subjects_by_verb_fht$.setGlobalValue(NIL);
        $typical_objects_by_verb_fht$.setGlobalValue(NIL);
        $subject_selectiveness_fht$.setGlobalValue(NIL);
        $object_selectiveness_fht$.setGlobalValue(NIL);
        $subject_selectional_preference_strengths_fht$.setGlobalValue(NIL);
        $object_selectional_preference_strengths_fht$.setGlobalValue(NIL);
        $subject_adjusted_pointwise_mutual_information_fht$.setGlobalValue(NIL);
        $object_adjusted_pointwise_mutual_information_fht$.setGlobalValue(NIL);
        $subject_selectional_associations_fht$.setGlobalValue(NIL);
        $object_selectional_associations_fht$.setGlobalValue(NIL);
        $subject_matching_collections_by_verb_fht$.setGlobalValue(NIL);
        $object_matching_collections_by_verb_fht$.setGlobalValue(NIL);
        $noun_conjectures_fht$.setGlobalValue(NIL);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $verbs_with_known_typical_subject$ = makeSymbol("*VERBS-WITH-KNOWN-TYPICAL-SUBJECT*");

    // deflexical
    private static final SubLSymbol $verbs_with_known_typical_object$ = makeSymbol("*VERBS-WITH-KNOWN-TYPICAL-OBJECT*");

    public static final SubLObject typical_subjects_by_verb_fht() {
        if (NIL == $typical_subjects_by_verb_fht$.getGlobalValue()) {
            $typical_subjects_by_verb_fht$.setGlobalValue(open_verb_argument_fht($typical_subjects_by_verb_fht_filename$.getGlobalValue()));
        }
        return $typical_subjects_by_verb_fht$.getGlobalValue();
    }

    public static final SubLObject typical_objects_by_verb_fht() {
        if (NIL == $typical_objects_by_verb_fht$.getGlobalValue()) {
            $typical_objects_by_verb_fht$.setGlobalValue(open_verb_argument_fht($typical_objects_by_verb_fht_filename$.getGlobalValue()));
        }
        return $typical_objects_by_verb_fht$.getGlobalValue();
    }

    public static final SubLObject subject_selectiveness_fht() {
        if (NIL == $subject_selectiveness_fht$.getGlobalValue()) {
            $subject_selectiveness_fht$.setGlobalValue(open_verb_argument_fht($subject_selectiveness_fht_filename$.getGlobalValue()));
        }
        return $subject_selectiveness_fht$.getGlobalValue();
    }

    public static final SubLObject object_selectiveness_fht() {
        if (NIL == $object_selectiveness_fht$.getGlobalValue()) {
            $object_selectiveness_fht$.setGlobalValue(open_verb_argument_fht($object_selectiveness_fht_filename$.getGlobalValue()));
        }
        return $object_selectiveness_fht$.getGlobalValue();
    }

    public static final SubLObject subject_selectional_preference_strengths_fht() {
        if (NIL == $subject_selectional_preference_strengths_fht$.getGlobalValue()) {
            $subject_selectional_preference_strengths_fht$.setGlobalValue(open_verb_argument_fht($subject_selectional_preference_strengths_fht_filename$.getGlobalValue()));
        }
        return $subject_selectional_preference_strengths_fht$.getGlobalValue();
    }

    public static final SubLObject object_selectional_preference_strengths_fht() {
        if (NIL == $object_selectional_preference_strengths_fht$.getGlobalValue()) {
            $object_selectional_preference_strengths_fht$.setGlobalValue(open_verb_argument_fht($object_selectional_preference_strengths_fht_filename$.getGlobalValue()));
        }
        return $object_selectional_preference_strengths_fht$.getGlobalValue();
    }

    public static final SubLObject subject_adjusted_pointwise_mutual_information_fht() {
        if (NIL == $subject_adjusted_pointwise_mutual_information_fht$.getGlobalValue()) {
            $subject_adjusted_pointwise_mutual_information_fht$.setGlobalValue(open_verb_argument_fht($subject_adjusted_pointwise_mutual_information_fht_filename$.getGlobalValue()));
        }
        return $subject_adjusted_pointwise_mutual_information_fht$.getGlobalValue();
    }

    public static final SubLObject object_adjusted_pointwise_mutual_information_fht() {
        if (NIL == $object_adjusted_pointwise_mutual_information_fht$.getGlobalValue()) {
            $object_adjusted_pointwise_mutual_information_fht$.setGlobalValue(open_verb_argument_fht($object_adjusted_pointwise_mutual_information_fht_filename$.getGlobalValue()));
        }
        return $object_adjusted_pointwise_mutual_information_fht$.getGlobalValue();
    }

    public static final SubLObject subject_selectional_associations_fht() {
        if (NIL == $subject_selectional_associations_fht$.getGlobalValue()) {
            $subject_selectional_associations_fht$.setGlobalValue(open_verb_argument_fht($subject_selectional_associations_fht_filename$.getGlobalValue()));
        }
        return $subject_selectional_associations_fht$.getGlobalValue();
    }

    public static final SubLObject object_selectional_associations_fht() {
        if (NIL == $object_selectional_associations_fht$.getGlobalValue()) {
            $object_selectional_associations_fht$.setGlobalValue(open_verb_argument_fht($object_selectional_associations_fht_filename$.getGlobalValue()));
        }
        return $object_selectional_associations_fht$.getGlobalValue();
    }

    public static final SubLObject subject_matching_collections_by_verb_fht() {
        if (NIL == $subject_matching_collections_by_verb_fht$.getGlobalValue()) {
            $subject_matching_collections_by_verb_fht$.setGlobalValue(open_verb_argument_fht($subject_matching_collections_by_verb_fht_filename$.getGlobalValue()));
        }
        return $subject_matching_collections_by_verb_fht$.getGlobalValue();
    }

    public static final SubLObject object_matching_collections_by_verb_fht() {
        if (NIL == $object_matching_collections_by_verb_fht$.getGlobalValue()) {
            $object_matching_collections_by_verb_fht$.setGlobalValue(open_verb_argument_fht($object_matching_collections_by_verb_fht_filename$.getGlobalValue()));
        }
        return $object_matching_collections_by_verb_fht$.getGlobalValue();
    }

    public static final SubLObject noun_conjectures_fht() {
        if (NIL == $noun_conjectures_fht$.getGlobalValue()) {
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                            try {
                                $noun_conjectures_fht$.setGlobalValue(open_verb_argument_fht($noun_conjectures_fht_filename$.getGlobalValue()));
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
        }
        return $noun_conjectures_fht$.getGlobalValue();
    }

    /**
     * Returns DEFAULT if unknown
     */
    public static final SubLObject typical_subject(SubLObject verb, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject fht = typical_subjects_by_verb_fht();
            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                return file_hash_table.get_file_hash_table(verb, fht, v_default);
            } else {
                return v_default;
            }
        }
    }

    /**
     * Returns DEFAULT if unknown
     */
    public static final SubLObject typical_object(SubLObject verb, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject fht = typical_objects_by_verb_fht();
            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                return file_hash_table.get_file_hash_table(verb, fht, v_default);
            } else {
                return v_default;
            }
        }
    }

    /**
     * Returns DEFAULT if unknown
     */
    public static final SubLObject typical_arg(SubLObject verb, SubLObject relation, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
        {
            SubLObject pcase_var = relation;
            if (pcase_var.eql($SUBJ)) {
                return typical_subject(verb, v_default);
            } else
                if (pcase_var.eql($OBJ)) {
                    return typical_object(verb, v_default);
                }

        }
        return NIL;
    }

    /**
     *
     *
     * @return listp of stringp; all of the verbs whose typical subject is known
     */
    public static final SubLObject verbs_with_known_typical_subject() {
        if (NIL == $verbs_with_known_typical_subject$.getGlobalValue()) {
            {
                SubLObject fht = typical_subjects_by_verb_fht();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    $verbs_with_known_typical_subject$.setGlobalValue(file_hash_table.file_hash_table_keys(fht));
                }
            }
        }
        return $verbs_with_known_typical_subject$.getGlobalValue();
    }

    /**
     *
     *
     * @return listp of stringp; all of the verbs whose typical object is known
     */
    public static final SubLObject verbs_with_known_typical_object() {
        if (NIL == $verbs_with_known_typical_object$.getGlobalValue()) {
            {
                SubLObject fht = typical_objects_by_verb_fht();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    $verbs_with_known_typical_object$.setGlobalValue(file_hash_table.file_hash_table_keys(fht));
                }
            }
        }
        return $verbs_with_known_typical_object$.getGlobalValue();
    }

    /**
     * Returns NIL if the selectiveness is unknown
     */
    public static final SubLObject selectiveness_wrt_subject(SubLObject verb) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject fht = subject_selectiveness_fht();
            return NIL != file_hash_table.file_hash_table_p(fht) ? ((SubLObject) (file_hash_table.get_file_hash_table(verb, fht, UNPROVIDED))) : NIL;
        }
    }

    /**
     * Returns NIL if the selectiveness is unknown
     */
    public static final SubLObject selectiveness_wrt_object(SubLObject verb) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject fht = object_selectiveness_fht();
            return NIL != file_hash_table.file_hash_table_p(fht) ? ((SubLObject) (file_hash_table.get_file_hash_table(verb, fht, UNPROVIDED))) : NIL;
        }
    }

    /**
     * Returns NIL if the selectiveness is unknown
     */
    public static final SubLObject selectiveness(SubLObject verb, SubLObject relation) {
        SubLTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
        {
            SubLObject pcase_var = relation;
            if (pcase_var.eql($SUBJ)) {
                return selectiveness_wrt_subject(verb);
            } else
                if (pcase_var.eql($OBJ)) {
                    return selectiveness_wrt_object(verb);
                }

        }
        return NIL;
    }

    /**
     * Shorthand for @xref SELECTIONAL-PREFERENCE-STRENGTH-WRT-SUBJECT
     */
    public static final SubLObject sps_subj(SubLObject verb) {
        return selectional_preference_strength_wrt_subject(verb);
    }

    /**
     * Shorthand for @xref SELECTIONAL-PREFERENCE-STRENGTH-WRT-OBJECT
     */
    public static final SubLObject sps_obj(SubLObject verb) {
        return selectional_preference_strength_wrt_object(verb);
    }

    /**
     * Shorthand for @xref SELECTIONAL-PREFERENCE-STRENGTH
     */
    public static final SubLObject sps(SubLObject verb, SubLObject relation) {
        return selectional_preference_strength(verb, relation);
    }

    /**
     * Returns NIL if the selectional preference strength is unknown
     */
    public static final SubLObject selectional_preference_strength_wrt_subject(SubLObject verb) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject fht = subject_selectional_preference_strengths_fht();
            return NIL != file_hash_table.file_hash_table_p(fht) ? ((SubLObject) (file_hash_table.get_file_hash_table(verb, fht, UNPROVIDED))) : NIL;
        }
    }

    /**
     * Returns NIL if the selectional preference strength is unknown
     */
    public static final SubLObject selectional_preference_strength_wrt_object(SubLObject verb) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject fht = object_selectional_preference_strengths_fht();
            return NIL != file_hash_table.file_hash_table_p(fht) ? ((SubLObject) (file_hash_table.get_file_hash_table(verb, fht, UNPROVIDED))) : NIL;
        }
    }

    /**
     * Returns NIL if the selectional preference strength is unknown
     */
    public static final SubLObject selectional_preference_strength(SubLObject verb, SubLObject relation) {
        SubLTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
        {
            SubLObject pcase_var = relation;
            if (pcase_var.eql($SUBJ)) {
                return selectional_preference_strength_wrt_subject(verb);
            } else
                if (pcase_var.eql($OBJ)) {
                    return selectional_preference_strength_wrt_object(verb);
                }

        }
        return NIL;
    }

    /**
     * Shorthand for @xref ADJUSTED-POINTWISE-MUTUAL-INFORMATION-WRT-SUBJECT
     */
    public static final SubLObject apmi_subj(SubLObject verb, SubLObject collection) {
        return adjusted_pointwise_mutual_information_wrt_subject(verb, collection);
    }

    /**
     * Shorthand for @xref ADJUSTED-POINTWISE-MUTUAL-INFORMATION-WRT-OBJECT
     */
    public static final SubLObject apmi_obj(SubLObject verb, SubLObject collection) {
        return adjusted_pointwise_mutual_information_wrt_object(verb, collection);
    }

    /**
     * Shorthand for @xref ADJUSTED-POINTWISE-MUTUAL-INFORMATION
     */
    public static final SubLObject apmi(SubLObject verb, SubLObject collection, SubLObject relation) {
        return adjusted_pointwise_mutual_information(verb, collection, relation);
    }

    /**
     *
     *
     * @return numberp
    Returns NIL if the APMI is unknown
     */
    public static final SubLObject adjusted_pointwise_mutual_information_wrt_subject(SubLObject verb, SubLObject collection) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        SubLTrampolineFile.checkType(collection, COLLECTION_P);
        {
            SubLObject fht = subject_adjusted_pointwise_mutual_information_fht();
            return NIL != file_hash_table.file_hash_table_p(fht) ? ((SubLObject) (file_hash_table.get_file_hash_table(list(verb, collection), fht, UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @return numberp
    Returns NIL if the APMI is unknown
     */
    public static final SubLObject adjusted_pointwise_mutual_information_wrt_object(SubLObject verb, SubLObject collection) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        SubLTrampolineFile.checkType(collection, COLLECTION_P);
        {
            SubLObject fht = object_adjusted_pointwise_mutual_information_fht();
            return NIL != file_hash_table.file_hash_table_p(fht) ? ((SubLObject) (file_hash_table.get_file_hash_table(list(verb, collection), fht, UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @param VERB;
     * 		stringp
     * @param COLLECTION;
     * 		collection-p
     * @return numberp
    Returns NIL if the APMI is unknown
     */
    public static final SubLObject adjusted_pointwise_mutual_information(SubLObject verb, SubLObject collection, SubLObject relation) {
        SubLTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
        {
            SubLObject pcase_var = relation;
            if (pcase_var.eql($SUBJ)) {
                return adjusted_pointwise_mutual_information_wrt_subject(verb, collection);
            } else
                if (pcase_var.eql($OBJ)) {
                    return adjusted_pointwise_mutual_information_wrt_object(verb, collection);
                }

        }
        return NIL;
    }

    /**
     * Shorthand for @xref SELECTIONAL-ASSOCIATION-WRT-SUBJECT
     */
    public static final SubLObject sa_subj(SubLObject verb, SubLObject collection) {
        return selectional_association_wrt_subject(verb, collection);
    }

    /**
     * Shorthand for @xref SELECTIONAL-ASSOCIATION-WRT-OBJECT
     */
    public static final SubLObject sa_obj(SubLObject verb, SubLObject collection) {
        return selectional_association_wrt_object(verb, collection);
    }

    /**
     * Shorthand for @xref SELECTIONAL-ASSOCIATION
     */
    public static final SubLObject sa(SubLObject verb, SubLObject collection, SubLObject relation) {
        return selectional_association(verb, collection, relation);
    }

    /**
     *
     *
     * @return numberp
    Returns NIL if the selectional association is unknown
     */
    public static final SubLObject selectional_association_wrt_subject(SubLObject verb, SubLObject collection) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        SubLTrampolineFile.checkType(collection, COLLECTION_P);
        {
            SubLObject fht = subject_selectional_associations_fht();
            return NIL != file_hash_table.file_hash_table_p(fht) ? ((SubLObject) (file_hash_table.get_file_hash_table(list(verb, collection), fht, UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @return numberp
    Returns NIL if the selectional association is unknown
     */
    public static final SubLObject selectional_association_wrt_object(SubLObject verb, SubLObject collection) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        SubLTrampolineFile.checkType(collection, COLLECTION_P);
        {
            SubLObject fht = object_selectional_associations_fht();
            return NIL != file_hash_table.file_hash_table_p(fht) ? ((SubLObject) (file_hash_table.get_file_hash_table(list(verb, collection), fht, UNPROVIDED))) : NIL;
        }
    }

    /**
     *
     *
     * @param VERB;
     * 		stringp
     * @param COLLECTION;
     * 		collection-p
     * @return numberp
    Returns NIL if the selectional association is unknown
     */
    public static final SubLObject selectional_association(SubLObject verb, SubLObject collection, SubLObject relation) {
        SubLTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
        {
            SubLObject pcase_var = relation;
            if (pcase_var.eql($SUBJ)) {
                return selectional_association_wrt_subject(verb, collection);
            } else
                if (pcase_var.eql($OBJ)) {
                    return selectional_association_wrt_object(verb, collection);
                }

        }
        return NIL;
    }

    /**
     * Returns NIL if the possible subjects are unknown
     */
    public static final SubLObject possible_subjects(SubLObject verb) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject fht = subject_matching_collections_by_verb_fht();
            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                {
                    SubLObject result = file_hash_table.get_file_hash_table(verb, fht, UNPROVIDED);
                    return delete_if(symbol_function($sym27$INVALID_FORT_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                return NIL;
            }
        }
    }

    /**
     * Returns NIL if the possible objects are unknown
     */
    public static final SubLObject possible_objects(SubLObject verb) {
        SubLTrampolineFile.checkType(verb, STRINGP);
        {
            SubLObject fht = object_matching_collections_by_verb_fht();
            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                {
                    SubLObject result = file_hash_table.get_file_hash_table(verb, fht, UNPROVIDED);
                    return delete_if(symbol_function($sym27$INVALID_FORT_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                return NIL;
            }
        }
    }

    /**
     * Returns NIL if the possible args are unknown
     */
    public static final SubLObject possible_args(SubLObject verb, SubLObject relation) {
        SubLTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
        {
            SubLObject pcase_var = relation;
            if (pcase_var.eql($SUBJ)) {
                return possible_subjects(verb);
            } else
                if (pcase_var.eql($OBJ)) {
                    return possible_objects(verb);
                }

        }
        return NIL;
    }

    /**
     * Returns the top N ranked conjectures for NOUN,
     * or NIL if there are no stored conjectures for NOUN
     */
    public static final SubLObject noun_conjectures(SubLObject noun, SubLObject n) {
        if (n == UNPROVIDED) {
            n = FIVE_INTEGER;
        }
        SubLTrampolineFile.checkType(noun, STRINGP);
        {
            SubLObject fht = noun_conjectures_fht();
            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                {
                    SubLObject result = file_hash_table.get_file_hash_table(noun, fht, UNPROVIDED);
                    if (result.isKeyword()) {
                        return result;
                    } else {
                        return list_utilities.first_n_if(n, symbol_function($sym28$VALID_FORT_), result, UNPROVIDED);
                    }
                }
            } else {
                return NIL;
            }
        }
    }

    /**
     * Returns the top-ranked conjecture for NOUN,
     * or NIL if there are no stored conjectures for NOUN
     */
    public static final SubLObject noun_conjecture(SubLObject noun) {
        SubLTrampolineFile.checkType(noun, STRINGP);
        {
            SubLObject list = noun_conjectures(noun, ONE_INTEGER);
            return NIL != list_utilities.non_empty_list_p(list) ? ((SubLObject) (list.first())) : NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_verb_argument_lookups_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_verb_argument_lookups_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject verb_argument_lookups_test_case_p(SubLObject verb_argument_lookups_test_case) {
        return classes.subloop_instanceof_class(verb_argument_lookups_test_case, VERB_ARGUMENT_LOOKUPS_TEST_CASE);
    }

    public static final SubLObject declare_verb_argument_lookups_file() {
        declareFunction("nl_stats_supported_verb_arg_position_p", "NL-STATS-SUPPORTED-VERB-ARG-POSITION-P", 1, 0, false);
        declareFunction("verb_argument_pathname", "VERB-ARGUMENT-PATHNAME", 1, 1, false);
        declareFunction("open_verb_argument_fht", "OPEN-VERB-ARGUMENT-FHT", 1, 0, false);
        declareFunction("reinitialize_verb_argument_fhts", "REINITIALIZE-VERB-ARGUMENT-FHTS", 0, 0, false);
        declareFunction("typical_subjects_by_verb_fht", "TYPICAL-SUBJECTS-BY-VERB-FHT", 0, 0, false);
        declareFunction("typical_objects_by_verb_fht", "TYPICAL-OBJECTS-BY-VERB-FHT", 0, 0, false);
        declareFunction("subject_selectiveness_fht", "SUBJECT-SELECTIVENESS-FHT", 0, 0, false);
        declareFunction("object_selectiveness_fht", "OBJECT-SELECTIVENESS-FHT", 0, 0, false);
        declareFunction("subject_selectional_preference_strengths_fht", "SUBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT", 0, 0, false);
        declareFunction("object_selectional_preference_strengths_fht", "OBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT", 0, 0, false);
        declareFunction("subject_adjusted_pointwise_mutual_information_fht", "SUBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT", 0, 0, false);
        declareFunction("object_adjusted_pointwise_mutual_information_fht", "OBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT", 0, 0, false);
        declareFunction("subject_selectional_associations_fht", "SUBJECT-SELECTIONAL-ASSOCIATIONS-FHT", 0, 0, false);
        declareFunction("object_selectional_associations_fht", "OBJECT-SELECTIONAL-ASSOCIATIONS-FHT", 0, 0, false);
        declareFunction("subject_matching_collections_by_verb_fht", "SUBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT", 0, 0, false);
        declareFunction("object_matching_collections_by_verb_fht", "OBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT", 0, 0, false);
        declareFunction("noun_conjectures_fht", "NOUN-CONJECTURES-FHT", 0, 0, false);
        declareFunction("typical_subject", "TYPICAL-SUBJECT", 1, 1, false);
        declareFunction("typical_object", "TYPICAL-OBJECT", 1, 1, false);
        declareFunction("typical_arg", "TYPICAL-ARG", 2, 1, false);
        declareFunction("verbs_with_known_typical_subject", "VERBS-WITH-KNOWN-TYPICAL-SUBJECT", 0, 0, false);
        declareFunction("verbs_with_known_typical_object", "VERBS-WITH-KNOWN-TYPICAL-OBJECT", 0, 0, false);
        declareFunction("selectiveness_wrt_subject", "SELECTIVENESS-WRT-SUBJECT", 1, 0, false);
        declareFunction("selectiveness_wrt_object", "SELECTIVENESS-WRT-OBJECT", 1, 0, false);
        declareFunction("selectiveness", "SELECTIVENESS", 2, 0, false);
        declareFunction("sps_subj", "SPS-SUBJ", 1, 0, false);
        declareFunction("sps_obj", "SPS-OBJ", 1, 0, false);
        declareFunction("sps", "SPS", 2, 0, false);
        declareFunction("selectional_preference_strength_wrt_subject", "SELECTIONAL-PREFERENCE-STRENGTH-WRT-SUBJECT", 1, 0, false);
        declareFunction("selectional_preference_strength_wrt_object", "SELECTIONAL-PREFERENCE-STRENGTH-WRT-OBJECT", 1, 0, false);
        declareFunction("selectional_preference_strength", "SELECTIONAL-PREFERENCE-STRENGTH", 2, 0, false);
        declareFunction("apmi_subj", "APMI-SUBJ", 2, 0, false);
        declareFunction("apmi_obj", "APMI-OBJ", 2, 0, false);
        declareFunction("apmi", "APMI", 3, 0, false);
        declareFunction("adjusted_pointwise_mutual_information_wrt_subject", "ADJUSTED-POINTWISE-MUTUAL-INFORMATION-WRT-SUBJECT", 2, 0, false);
        declareFunction("adjusted_pointwise_mutual_information_wrt_object", "ADJUSTED-POINTWISE-MUTUAL-INFORMATION-WRT-OBJECT", 2, 0, false);
        declareFunction("adjusted_pointwise_mutual_information", "ADJUSTED-POINTWISE-MUTUAL-INFORMATION", 3, 0, false);
        declareFunction("sa_subj", "SA-SUBJ", 2, 0, false);
        declareFunction("sa_obj", "SA-OBJ", 2, 0, false);
        declareFunction("sa", "SA", 3, 0, false);
        declareFunction("selectional_association_wrt_subject", "SELECTIONAL-ASSOCIATION-WRT-SUBJECT", 2, 0, false);
        declareFunction("selectional_association_wrt_object", "SELECTIONAL-ASSOCIATION-WRT-OBJECT", 2, 0, false);
        declareFunction("selectional_association", "SELECTIONAL-ASSOCIATION", 3, 0, false);
        declareFunction("possible_subjects", "POSSIBLE-SUBJECTS", 1, 0, false);
        declareFunction("possible_objects", "POSSIBLE-OBJECTS", 1, 0, false);
        declareFunction("possible_args", "POSSIBLE-ARGS", 2, 0, false);
        declareFunction("noun_conjectures", "NOUN-CONJECTURES", 1, 1, false);
        declareFunction("noun_conjecture", "NOUN-CONJECTURE", 1, 0, false);
        declareFunction("subloop_reserved_initialize_verb_argument_lookups_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-VERB-ARGUMENT-LOOKUPS-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_verb_argument_lookups_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-VERB-ARGUMENT-LOOKUPS-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("verb_argument_lookups_test_case_p", "VERB-ARGUMENT-LOOKUPS-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_verb_argument_lookups_file() {
        defconstant("*NL-STATS-SUPPORTED-VERB-ARG-POSITIONS*", $list_alt0);
        defparameter("*VERB-ARGUMENT-DIRECTORY-LIST*", list($$$data, $str_alt2$verb_argument_stats));
        deflexical("*TYPICAL-SUBJECTS-BY-VERB-FHT-FILENAME*", $$$subj);
        deflexical("*TYPICAL-OBJECTS-BY-VERB-FHT-FILENAME*", $$$obj);
        deflexical("*SUBJECT-SELECTIVENESS-FHT-FILENAME*", $str_alt9$selectiveness_subj);
        deflexical("*OBJECT-SELECTIVENESS-FHT-FILENAME*", $str_alt10$selectiveness_obj);
        deflexical("*SUBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT-FILENAME*", $str_alt11$sps_subj);
        deflexical("*OBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT-FILENAME*", $str_alt12$sps_obj);
        deflexical("*SUBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT-FILENAME*", $str_alt13$apmi_subj);
        deflexical("*OBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT-FILENAME*", $str_alt14$apmi_obj);
        deflexical("*SUBJECT-SELECTIONAL-ASSOCIATIONS-FHT-FILENAME*", $str_alt15$sa_subj);
        deflexical("*OBJECT-SELECTIONAL-ASSOCIATIONS-FHT-FILENAME*", $str_alt16$sa_obj);
        deflexical("*SUBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT-FILENAME*", $str_alt17$matching_colls_subj);
        deflexical("*OBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT-FILENAME*", $str_alt18$matching_colls_obj);
        deflexical("*NOUN-CONJECTURES-FHT-FILENAME*", $str_alt19$noun_conjectures);
        deflexical("*TYPICAL-SUBJECTS-BY-VERB-FHT*", NIL);
        deflexical("*TYPICAL-OBJECTS-BY-VERB-FHT*", NIL);
        deflexical("*SUBJECT-SELECTIVENESS-FHT*", NIL);
        deflexical("*OBJECT-SELECTIVENESS-FHT*", NIL);
        deflexical("*SUBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT*", NIL);
        deflexical("*OBJECT-SELECTIONAL-PREFERENCE-STRENGTHS-FHT*", NIL);
        deflexical("*SUBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT*", NIL);
        deflexical("*OBJECT-ADJUSTED-POINTWISE-MUTUAL-INFORMATION-FHT*", NIL);
        deflexical("*SUBJECT-SELECTIONAL-ASSOCIATIONS-FHT*", NIL);
        deflexical("*OBJECT-SELECTIONAL-ASSOCIATIONS-FHT*", NIL);
        deflexical("*SUBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT*", NIL);
        deflexical("*OBJECT-MATCHING-COLLECTIONS-BY-VERB-FHT*", NIL);
        deflexical("*NOUN-CONJECTURES-FHT*", NIL);
        deflexical("*VERBS-WITH-KNOWN-TYPICAL-SUBJECT*", NIL);
        deflexical("*VERBS-WITH-KNOWN-TYPICAL-OBJECT*", NIL);
        return NIL;
    }

    public static final SubLObject setup_verb_argument_lookups_file() {
                sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(VERB_ARGUMENT_LOOKUPS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(VERB_ARGUMENT_LOOKUPS_TEST_CASE);
        classes.subloop_new_class(VERB_ARGUMENT_LOOKUPS_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt31);
        classes.class_set_implements_slot_listeners(VERB_ARGUMENT_LOOKUPS_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(VERB_ARGUMENT_LOOKUPS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VERB_ARGUMENT_LOOKUPS_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(VERB_ARGUMENT_LOOKUPS_TEST_CASE, $sym45$SUBLOOP_RESERVED_INITIALIZE_VERB_ARGUMENT_LOOKUPS_TEST_CASE_INSTA);
        subloop_reserved_initialize_verb_argument_lookups_test_case_class(VERB_ARGUMENT_LOOKUPS_TEST_CASE);
        sunit_macros.define_test_case_postamble(VERB_ARGUMENT_LOOKUPS_TEST_CASE, $str_alt46$verb_argument_lookups, $$$cycl, NIL);
        sunit_macros.def_test_method_register(VERB_ARGUMENT_LOOKUPS_TEST_CASE, NOUN_CONJECTURES_TEST);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list($SUBJ, makeKeyword("OBJ"));

    static private final SubLString $$$data = makeString("data");

    static private final SubLString $str_alt2$verb_argument_stats = makeString("verb-argument-stats");

    static private final SubLString $$$fht = makeString("fht");



    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLSymbol $TABLE_NOT_FOUND = makeKeyword("TABLE-NOT-FOUND");

    static private final SubLString $$$subj = makeString("subj");

    static private final SubLString $$$obj = makeString("obj");

    static private final SubLString $str_alt9$selectiveness_subj = makeString("selectiveness-subj");

    static private final SubLString $str_alt10$selectiveness_obj = makeString("selectiveness-obj");

    static private final SubLString $str_alt11$sps_subj = makeString("sps-subj");

    static private final SubLString $str_alt12$sps_obj = makeString("sps-obj");

    static private final SubLString $str_alt13$apmi_subj = makeString("apmi-subj");

    static private final SubLString $str_alt14$apmi_obj = makeString("apmi-obj");

    static private final SubLString $str_alt15$sa_subj = makeString("sa-subj");

    static private final SubLString $str_alt16$sa_obj = makeString("sa-obj");

    static private final SubLString $str_alt17$matching_colls_subj = makeString("matching-colls-subj");

    static private final SubLString $str_alt18$matching_colls_obj = makeString("matching-colls-obj");

    static private final SubLString $str_alt19$noun_conjectures = makeString("noun-conjectures");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLSymbol NL_STATS_SUPPORTED_VERB_ARG_POSITION_P = makeSymbol("NL-STATS-SUPPORTED-VERB-ARG-POSITION-P");







    static private final SubLSymbol $sym27$INVALID_FORT_ = makeSymbol("INVALID-FORT?");

    static private final SubLSymbol $sym28$VALID_FORT_ = makeSymbol("VALID-FORT?");

    private static final SubLSymbol VERB_ARGUMENT_LOOKUPS_TEST_CASE = makeSymbol("VERB-ARGUMENT-LOOKUPS-TEST-CASE");



    static private final SubLList $list_alt31 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOUN-CONJECTURES-TEST"), NIL, makeKeyword("PROTECTED")));

















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERB_ARGUMENT_LOOKUPS_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERB-ARGUMENT-LOOKUPS-TEST-CASE-CLASS");









    static private final SubLSymbol $sym45$SUBLOOP_RESERVED_INITIALIZE_VERB_ARGUMENT_LOOKUPS_TEST_CASE_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERB-ARGUMENT-LOOKUPS-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt46$verb_argument_lookups = makeString("verb-argument-lookups");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol NOUN_CONJECTURES_TEST = makeSymbol("NOUN-CONJECTURES-TEST");

    // // Initializers
    public void declareFunctions() {
        declare_verb_argument_lookups_file();
    }

    public void initializeVariables() {
        init_verb_argument_lookups_file();
    }

    public void runTopLevelForms() {
        setup_verb_argument_lookups_file();
    }
}

