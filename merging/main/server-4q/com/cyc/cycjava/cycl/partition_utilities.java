/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PARTITION-UTILITIES
 * source file: /cyc/top/cycl/partition-utilities.lisp
 * created:     2019/07/03 17:37:49
 */
public final class partition_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new partition_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.partition_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $assertion_partition$ = makeSymbol("*ASSERTION-PARTITION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $assertion_list_for_assertion_partition$ = makeSymbol("*ASSERTION-LIST-FOR-ASSERTION-PARTITION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $kb_diff_partition$ = makeSymbol("*KB-DIFF-PARTITION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $kb_diff_for_partition$ = makeSymbol("*KB-DIFF-FOR-PARTITION*");

    static private final SubLString $str2$Mismatch_between_parameterization = makeString("Mismatch between parameterization and actualization list: no actual for ~S~%");

    static private final SubLList $list3 = list(makeSymbol("PARAMETER"), makeSymbol("ACTUAL"));

    private static final SubLSymbol SCOPE_PARTITION_MT_INDEX = makeSymbol("SCOPE-PARTITION-MT-INDEX");

    private static final SubLList $list7 = list(list(makeKeyword("FUNCTION"), makeSymbol("SCOPE-ASSERTION-PARTITION")));

    private static final SubLSymbol $sym10$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol SCOPE_ASSERTION_PARTITION = makeSymbol("SCOPE-ASSERTION-PARTITION");

    private static final SubLList $list12 = list(list(makeKeyword("FUNCTION"), makeSymbol("SCOPE-KB-DIFF-CONSTANTS")), list(makeKeyword("FUNCTION"), makeSymbol("SCOPE-KB-DIFF-NARTS")), list(makeKeyword("FUNCTION"), makeSymbol("SCOPE-KB-DIFF-ASSERTIONS")), list(makeKeyword("FUNCTION"), makeSymbol("SCOPE-KB-DIFF-DEDUCTIONS")));

    private static final SubLSymbol KB_DIFFERENCE_P = makeSymbol("KB-DIFFERENCE-P");

    private static final SubLSymbol SCOPE_KB_DIFF_CONSTANTS = makeSymbol("SCOPE-KB-DIFF-CONSTANTS");

    private static final SubLSymbol SCOPE_KB_DIFF_NARTS = makeSymbol("SCOPE-KB-DIFF-NARTS");

    private static final SubLSymbol SCOPE_KB_DIFF_ASSERTIONS = makeSymbol("SCOPE-KB-DIFF-ASSERTIONS");

    private static final SubLSymbol SCOPE_KB_DIFF_DEDUCTIONS = makeSymbol("SCOPE-KB-DIFF-DEDUCTIONS");

    private static final SubLSymbol SCOPE_MICROTHEORY_CONTENTS_AND_IMPLICITLY_DEFINED_TERMS = makeSymbol("SCOPE-MICROTHEORY-CONTENTS-AND-IMPLICITLY-DEFINED-TERMS");



    private static final SubLSymbol SK_SOURCE_P = makeSymbol("SK-SOURCE-P");

    private static final SubLSymbol SCOPE_SK_SOURCE = makeSymbol("SCOPE-SK-SOURCE");

    // Definitions
    /**
     * Given a list of EXEMPLARS and PARAMETER -> ACTUAL mappings in PARAMETERIZED
     * load the partition from STREAM.
     *
     * @return LISTP of CONSTANT-P the terms introduced
     */
    @LispMethod(comment = "Given a list of EXEMPLARS and PARAMETER -> ACTUAL mappings in PARAMETERIZED\r\nload the partition from STREAM.\r\n\r\n@return LISTP of CONSTANT-P the terms introduced\nGiven a list of EXEMPLARS and PARAMETER -> ACTUAL mappings in PARAMETERIZED\nload the partition from STREAM.")
    public static final SubLObject instantiate_prepared_assertion_set_alt(SubLObject stream, SubLObject exemplars, SubLObject parameterized, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(exemplars, LISTP);
            SubLTrampolineFile.checkType(parameterized, HASH_TABLE_P);
            thread.resetMultipleValues();
            {
                SubLObject preseeding = com.cyc.cycjava.cycl.partition_utilities.instantiate_prepared_assertion_set_constants(exemplars, parameterized);
                SubLObject introduced = thread.secondMultipleValue();
                thread.resetMultipleValues();
                partitions.load_partition_from_stream_with_preseeding(stream, preseeding, reset_sbhl_linksP);
                return introduced;
            }
        }
    }

    // Definitions
    /**
     * Given a list of EXEMPLARS and PARAMETER -> ACTUAL mappings in PARAMETERIZED
     * load the partition from STREAM.
     *
     * @return LISTP of CONSTANT-P the terms introduced
     */
    @LispMethod(comment = "Given a list of EXEMPLARS and PARAMETER -> ACTUAL mappings in PARAMETERIZED\r\nload the partition from STREAM.\r\n\r\n@return LISTP of CONSTANT-P the terms introduced\nGiven a list of EXEMPLARS and PARAMETER -> ACTUAL mappings in PARAMETERIZED\nload the partition from STREAM.")
    public static SubLObject instantiate_prepared_assertion_set(final SubLObject stream, final SubLObject exemplars, final SubLObject parameterized, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(exemplars) : "! listp(exemplars) " + ("Types.listp(exemplars) " + "CommonSymbols.NIL != Types.listp(exemplars) ") + exemplars;
        assert NIL != hash_table_p(parameterized) : "! hash_table_p(parameterized) " + ("Types.hash_table_p(parameterized) " + "CommonSymbols.NIL != Types.hash_table_p(parameterized) ") + parameterized;
        thread.resetMultipleValues();
        final SubLObject preseeding = instantiate_prepared_assertion_set_constants(exemplars, parameterized);
        final SubLObject introduced = thread.secondMultipleValue();
        thread.resetMultipleValues();
        partitions.load_partition_from_stream_with_preseeding(stream, preseeding, reset_sbhl_linksP);
        return introduced;
    }

    /**
     * Create equivalent terms for the EXEMPLARS and compute the preseeding set
     * for the lookup of partition constants from the exemplars and the
     * PARAMETER -> ACTUALS mapping.
     *
     * @return 0 HASH-TABLE-P preseeded map
     * @return 1 LISTP of CONSTANT-P terms introduced for the exemplars
     */
    @LispMethod(comment = "Create equivalent terms for the EXEMPLARS and compute the preseeding set\r\nfor the lookup of partition constants from the exemplars and the\r\nPARAMETER -> ACTUALS mapping.\r\n\r\n@return 0 HASH-TABLE-P preseeded map\r\n@return 1 LISTP of CONSTANT-P terms introduced for the exemplars\nCreate equivalent terms for the EXEMPLARS and compute the preseeding set\nfor the lookup of partition constants from the exemplars and the\nPARAMETER -> ACTUALS mapping.")
    public static final SubLObject instantiate_prepared_assertion_set_constants_alt(SubLObject exemplars, SubLObject parametized) {
        SubLTrampolineFile.checkType(exemplars, LISTP);
        SubLTrampolineFile.checkType(parametized, HASH_TABLE_P);
        {
            SubLObject estimated_size = add(length(exemplars), hash_table_count(parametized));
            SubLObject preseeding = partitions.new_load_partition_constants_store(estimated_size);
            SubLObject introduced = NIL;
            SubLObject cdolist_list_var = exemplars;
            SubLObject exemplar = NIL;
            for (exemplar = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , exemplar = cdolist_list_var.first()) {
                {
                    SubLObject name = constants_high.constant_name(exemplar);
                    SubLObject external_id = constants_high.constant_external_id(exemplar);
                    SubLObject internal_id = constants_high.constant_internal_id(exemplar);
                    SubLObject instance = cyc_kernel.cyc_create_new_permanent(constant_completion_high.uniquify_constant_name(name));
                    sethash(external_id, preseeding, instance);
                    sethash(internal_id, preseeding, instance);
                    introduced = cons(instance, introduced);
                }
            }
            {
                SubLObject param_id = NIL;
                SubLObject actual = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(parametized);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            param_id = getEntryKey(cdohash_entry);
                            actual = getEntryValue(cdohash_entry);
                            sethash(param_id, preseeding, actual);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return values(preseeding, introduced);
        }
    }

    /**
     * Create equivalent terms for the EXEMPLARS and compute the preseeding set
     * for the lookup of partition constants from the exemplars and the
     * PARAMETER -> ACTUALS mapping.
     *
     * @return 0 HASH-TABLE-P preseeded map
     * @return 1 LISTP of CONSTANT-P terms introduced for the exemplars
     */
    @LispMethod(comment = "Create equivalent terms for the EXEMPLARS and compute the preseeding set\r\nfor the lookup of partition constants from the exemplars and the\r\nPARAMETER -> ACTUALS mapping.\r\n\r\n@return 0 HASH-TABLE-P preseeded map\r\n@return 1 LISTP of CONSTANT-P terms introduced for the exemplars\nCreate equivalent terms for the EXEMPLARS and compute the preseeding set\nfor the lookup of partition constants from the exemplars and the\nPARAMETER -> ACTUALS mapping.")
    public static SubLObject instantiate_prepared_assertion_set_constants(final SubLObject exemplars, final SubLObject parametized) {
        assert NIL != listp(exemplars) : "! listp(exemplars) " + ("Types.listp(exemplars) " + "CommonSymbols.NIL != Types.listp(exemplars) ") + exemplars;
        assert NIL != hash_table_p(parametized) : "! hash_table_p(parametized) " + ("Types.hash_table_p(parametized) " + "CommonSymbols.NIL != Types.hash_table_p(parametized) ") + parametized;
        final SubLObject estimated_size = add(length(exemplars), hash_table_count(parametized));
        final SubLObject preseeding = partitions.new_load_partition_constants_store(estimated_size);
        SubLObject introduced = NIL;
        SubLObject cdolist_list_var = exemplars;
        SubLObject exemplar = NIL;
        exemplar = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject name = constants_high.constant_name(exemplar);
            final SubLObject external_id = constants_high.constant_external_id(exemplar);
            final SubLObject internal_id = constants_high.constant_internal_id(exemplar);
            final SubLObject instance = cyc_kernel.cyc_create_new_permanent(constant_completion_high.uniquify_constant_name(name, UNPROVIDED));
            sethash(external_id, preseeding, instance);
            sethash(internal_id, preseeding, instance);
            introduced = cons(instance, introduced);
            cdolist_list_var = cdolist_list_var.rest();
            exemplar = cdolist_list_var.first();
        } 
        SubLObject param_id = NIL;
        SubLObject actual = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(parametized);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                param_id = getEntryKey(cdohash_entry);
                actual = getEntryValue(cdohash_entry);
                sethash(param_id, preseeding, actual);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return values(preseeding, introduced);
    }

    /**
     * Given a binary sream, unserialize a exemplar-based parameterized partition, creating new terms for the
     * exemplars and substituting the constants in ACTUALS-MAP for the paramterizing constants.
     *
     * @return LISTP of CONSTANTP the introduced terms
     */
    @LispMethod(comment = "Given a binary sream, unserialize a exemplar-based parameterized partition, creating new terms for the\r\nexemplars and substituting the constants in ACTUALS-MAP for the paramterizing constants.\r\n\r\n@return LISTP of CONSTANTP the introduced terms\nGiven a binary sream, unserialize a exemplar-based parameterized partition, creating new terms for the\nexemplars and substituting the constants in ACTUALS-MAP for the paramterizing constants.")
    public static final SubLObject unserialize_prepared_assertion_set_alt(SubLObject stream, SubLObject actuals_map, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(actuals_map, HASH_TABLE_P);
        {
            SubLObject exemplars = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject parameterized = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = parameterized;
            SubLObject parameter = NIL;
            for (parameter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parameter = cdolist_list_var.first()) {
                if (NIL == gethash_without_values(constants_high.constant_external_id(parameter), actuals_map, UNPROVIDED)) {
                    Errors.error($str_alt2$Mismatch_between_parameterization, parameter);
                }
            }
            return com.cyc.cycjava.cycl.partition_utilities.instantiate_prepared_assertion_set(stream, exemplars, actuals_map, reset_sbhl_linksP);
        }
    }

    /**
     * Given a binary sream, unserialize a exemplar-based parameterized partition, creating new terms for the
     * exemplars and substituting the constants in ACTUALS-MAP for the paramterizing constants.
     *
     * @return LISTP of CONSTANTP the introduced terms
     */
    @LispMethod(comment = "Given a binary sream, unserialize a exemplar-based parameterized partition, creating new terms for the\r\nexemplars and substituting the constants in ACTUALS-MAP for the paramterizing constants.\r\n\r\n@return LISTP of CONSTANTP the introduced terms\nGiven a binary sream, unserialize a exemplar-based parameterized partition, creating new terms for the\nexemplars and substituting the constants in ACTUALS-MAP for the paramterizing constants.")
    public static SubLObject unserialize_prepared_assertion_set(final SubLObject stream, final SubLObject actuals_map, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == UNPROVIDED) {
            reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
        }
        assert NIL != hash_table_p(actuals_map) : "! hash_table_p(actuals_map) " + ("Types.hash_table_p(actuals_map) " + "CommonSymbols.NIL != Types.hash_table_p(actuals_map) ") + actuals_map;
        final SubLObject exemplars = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject parameterized = cdolist_list_var = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject parameter = NIL;
        parameter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == gethash_without_values(constants_high.constant_external_id(parameter), actuals_map, UNPROVIDED)) {
                Errors.error($str2$Mismatch_between_parameterization, parameter);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parameter = cdolist_list_var.first();
        } 
        return instantiate_prepared_assertion_set(stream, exemplars, actuals_map, reset_sbhl_linksP);
    }

    /**
     * Given the list of EXEMPLARS and PARAMETERIZED constants, serialize a partition to
     * the STREAM after noting the exemplars and parameters in it.
     *
     * @return STREAM
     */
    @LispMethod(comment = "Given the list of EXEMPLARS and PARAMETERIZED constants, serialize a partition to\r\nthe STREAM after noting the exemplars and parameters in it.\r\n\r\n@return STREAM\nGiven the list of EXEMPLARS and PARAMETERIZED constants, serialize a partition to\nthe STREAM after noting the exemplars and parameters in it.")
    public static final SubLObject serialize_prepared_assertion_set_alt(SubLObject stream, SubLObject exemplars, SubLObject parameterized) {
        SubLTrampolineFile.checkType(exemplars, LISTP);
        SubLTrampolineFile.checkType(parameterized, LISTP);
        {
            SubLObject partition = com.cyc.cycjava.cycl.partition_utilities.determine_prepared_assertion_set_partition(exemplars);
            cfasl_output(exemplars, stream);
            cfasl_output(parameterized, stream);
            partitions.save_partition_to_stream(stream, partition);
        }
        return stream;
    }

    /**
     * Given the list of EXEMPLARS and PARAMETERIZED constants, serialize a partition to
     * the STREAM after noting the exemplars and parameters in it.
     *
     * @return STREAM
     */
    @LispMethod(comment = "Given the list of EXEMPLARS and PARAMETERIZED constants, serialize a partition to\r\nthe STREAM after noting the exemplars and parameters in it.\r\n\r\n@return STREAM\nGiven the list of EXEMPLARS and PARAMETERIZED constants, serialize a partition to\nthe STREAM after noting the exemplars and parameters in it.")
    public static SubLObject serialize_prepared_assertion_set(final SubLObject stream, final SubLObject exemplars, final SubLObject parameterized) {
        assert NIL != listp(exemplars) : "! listp(exemplars) " + ("Types.listp(exemplars) " + "CommonSymbols.NIL != Types.listp(exemplars) ") + exemplars;
        assert NIL != listp(parameterized) : "! listp(parameterized) " + ("Types.listp(parameterized) " + "CommonSymbols.NIL != Types.listp(parameterized) ") + parameterized;
        final SubLObject partition = determine_prepared_assertion_set_partition(exemplars);
        cfasl_output(exemplars, stream);
        cfasl_output(parameterized, stream);
        partitions.save_partition_to_stream(stream, partition);
        return stream;
    }

    /**
     * Given a list of tuples of the form (PARAMETER ACTUAL), both CONSTANT-P,
     * generate a actuals' map for use with UNSERIALIZE-PREPARED-ASSERTION-SET
     *
     * @return HASH-TABLE-P the map of actuals
     */
    @LispMethod(comment = "Given a list of tuples of the form (PARAMETER ACTUAL), both CONSTANT-P,\r\ngenerate a actuals\' map for use with UNSERIALIZE-PREPARED-ASSERTION-SET\r\n\r\n@return HASH-TABLE-P the map of actuals\nGiven a list of tuples of the form (PARAMETER ACTUAL), both CONSTANT-P,\ngenerate a actuals\' map for use with UNSERIALIZE-PREPARED-ASSERTION-SET")
    public static final SubLObject generate_prepared_assertion_actuals_for_parameters_map_alt(SubLObject actual_parameter_tuples) {
        SubLTrampolineFile.checkType(actual_parameter_tuples, LISTP);
        {
            SubLObject map = make_hash_table(length(actual_parameter_tuples), symbol_function(EQL), UNPROVIDED);
            SubLObject cdolist_list_var = actual_parameter_tuples;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject parameter = NIL;
                    SubLObject actual = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    parameter = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt3);
                    actual = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        sethash(constants_high.constant_external_id(parameter), map, actual);
                        sethash(constants_high.constant_internal_id(parameter), map, actual);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt3);
                    }
                }
            }
            return map;
        }
    }

    /**
     * Given a list of tuples of the form (PARAMETER ACTUAL), both CONSTANT-P,
     * generate a actuals' map for use with UNSERIALIZE-PREPARED-ASSERTION-SET
     *
     * @return HASH-TABLE-P the map of actuals
     */
    @LispMethod(comment = "Given a list of tuples of the form (PARAMETER ACTUAL), both CONSTANT-P,\r\ngenerate a actuals\' map for use with UNSERIALIZE-PREPARED-ASSERTION-SET\r\n\r\n@return HASH-TABLE-P the map of actuals\nGiven a list of tuples of the form (PARAMETER ACTUAL), both CONSTANT-P,\ngenerate a actuals\' map for use with UNSERIALIZE-PREPARED-ASSERTION-SET")
    public static SubLObject generate_prepared_assertion_actuals_for_parameters_map(final SubLObject actual_parameter_tuples) {
        assert NIL != listp(actual_parameter_tuples) : "! listp(actual_parameter_tuples) " + ("Types.listp(actual_parameter_tuples) " + "CommonSymbols.NIL != Types.listp(actual_parameter_tuples) ") + actual_parameter_tuples;
        final SubLObject map = make_hash_table(length(actual_parameter_tuples), symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = actual_parameter_tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject parameter = NIL;
            SubLObject actual = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            parameter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            actual = current.first();
            current = current.rest();
            if (NIL == current) {
                sethash(constants_high.constant_external_id(parameter), map, actual);
                sethash(constants_high.constant_internal_id(parameter), map, actual);
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return map;
    }

    public static final SubLObject determine_prepared_assertion_set_partition_alt(SubLObject exemplars) {
        {
            SubLObject partition_spec = NIL;
            SubLObject mts = NIL;
            {
                SubLObject cdolist_list_var = exemplars;
                SubLObject constant = NIL;
                for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                    partition_spec = cons(list($TERM, constant), partition_spec);
                    if (NIL != fort_types_interface.microtheory_p(constant)) {
                        mts = cons(constant, mts);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = nreverse(mts);
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    partition_spec = cons(list($FUNCTION, SCOPE_PARTITION_MT_INDEX, mt), partition_spec);
                }
            }
            return nreverse(partition_spec);
        }
    }

    public static SubLObject determine_prepared_assertion_set_partition(final SubLObject exemplars) {
        SubLObject partition_spec = NIL;
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = exemplars;
        SubLObject constant = NIL;
        constant = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partition_spec = cons(list($TERM, constant), partition_spec);
            if (NIL != fort_types_interface.microtheory_p(constant)) {
                mts = cons(constant, mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constant = cdolist_list_var.first();
        } 
        cdolist_list_var = nreverse(mts);
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partition_spec = cons(list($FUNCTION, SCOPE_PARTITION_MT_INDEX, mt), partition_spec);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return nreverse(partition_spec);
    }

    static private final SubLString $str_alt2$Mismatch_between_parameterization = makeString("Mismatch between parameterization and actualization list: no actual for ~S~%");

    static private final SubLList $list_alt3 = list(makeSymbol("PARAMETER"), makeSymbol("ACTUAL"));

    public static SubLObject save_assertion_partition(final SubLObject assertion_list, final SubLObject filename, SubLObject fort_filter_function) {
        if (fort_filter_function == UNPROVIDED) {
            fort_filter_function = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(assertion_list) : "! list_utilities.non_dotted_list_p(assertion_list) " + ("list_utilities.non_dotted_list_p(assertion_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(assertion_list) ") + assertion_list;
        SubLObject cdolist_list_var = assertion_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = $assertion_list_for_assertion_partition$.currentBinding(thread);
        final SubLObject _prev_bind_2 = partitions.$assertion_partition_fort_filter_function$.currentBinding(thread);
        try {
            $assertion_list_for_assertion_partition$.bind(assertion_list, thread);
            partitions.$assertion_partition_fort_filter_function$.bind(fort_filter_function, thread);
            return partitions.save_partition(filename, $assertion_partition$.getDynamicValue(thread));
        } finally {
            partitions.$assertion_partition_fort_filter_function$.rebind(_prev_bind_2, thread);
            $assertion_list_for_assertion_partition$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject scope_assertion_partition() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $assertion_list_for_assertion_partition$.getDynamicValue(thread);
        SubLObject as = NIL;
        as = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            partitions.scope_partition_assertion_and_constituents(as);
            cdolist_list_var = cdolist_list_var.rest();
            as = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject save_kb_diff_partition(final SubLObject kb_diff, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kb_compare.kb_difference_p(kb_diff) : "! kb_compare.kb_difference_p(kb_diff) " + ("kb_compare.kb_difference_p(kb_diff) " + "CommonSymbols.NIL != kb_compare.kb_difference_p(kb_diff) ") + kb_diff;
        final SubLObject _prev_bind_0 = $kb_diff_for_partition$.currentBinding(thread);
        try {
            $kb_diff_for_partition$.bind(kb_diff, thread);
            return partitions.save_partition(filename, $kb_diff_partition$.getDynamicValue(thread));
        } finally {
            $kb_diff_for_partition$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject scope_kb_diff_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject set_var = kb_compare.kb_difference_constants($kb_diff_partition$.getDynamicValue(thread));
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject v_const;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            v_const = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, v_const)) {
                partitions.scope_partition_object_only(v_const);
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject scope_kb_diff_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject set_var = kb_compare.kb_difference_narts($kb_diff_partition$.getDynamicValue(thread));
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject nart;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            nart = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                partitions.scope_partition_object_only(nart);
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject scope_kb_diff_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject set_var = kb_compare.kb_difference_assertions($kb_diff_partition$.getDynamicValue(thread));
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject ass;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            ass = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, ass)) {
                partitions.scope_partition_object_only(ass);
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject scope_kb_diff_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject set_var = kb_compare.kb_difference_deductions($kb_diff_partition$.getDynamicValue(thread));
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject ded;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            ded = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, ded)) {
                partitions.scope_partition_object_only(ded);
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject scope_microtheory_contents_and_implicitly_defined_terms(final SubLObject mt) {
        if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
            final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(ass));
                    if (NIL != valid) {
                        partitions.scope_partition_object_only(ass);
                        SubLObject cdolist_list_var = cycl_utilities.subrfs(ass, T);
                        SubLObject rf = NIL;
                        rf = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != rf_defined_in_mtP(rf, mt)) {
                                partitions.scope_partition_rf_and_super_rfs(rf);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            rf = cdolist_list_var.first();
                        } 
                    }
                    done_var = makeBoolean(NIL == valid);
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
        return NIL;
    }

    public static SubLObject rf_defined_in_mtP(final SubLObject rf, final SubLObject mt) {
        if (NIL != assertion_handles.assertion_p(rf)) {
            return hlmt.hlmt_equalP(mt, assertions_high.assertion_mt(rf));
        }
        SubLObject cdolist_list_var = narts_high.nart_independent_assertions(rf);
        SubLObject independent_assertion = NIL;
        independent_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == hlmt.hlmt_equalP(mt, assertions_high.assertion_mt(independent_assertion))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            independent_assertion = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject scope_sk_source(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        partitions.scope_partition_term_and_narts(sk_source);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            assert NIL != sksi_kb_accessors.sk_source_p(sk_source) : "! sksi_kb_accessors.sk_source_p(sk_source) " + ("sksi_kb_accessors.sk_source_p(sk_source) " + "CommonSymbols.NIL != sksi_kb_accessors.sk_source_p(sk_source) ") + sk_source;
            final SubLObject defining_mt = kb_accessors.defining_mt(sk_source);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sk_source);
            if (NIL != fort_types_interface.microtheory_p(defining_mt)) {
                scope_microtheory_contents_and_implicitly_defined_terms(defining_mt);
            }
            if (NIL != fort_types_interface.microtheory_p(content_mt)) {
                scope_microtheory_contents_and_implicitly_defined_terms(content_mt);
            }
            if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(sk_source, NIL, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(sk_source, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$1 = NIL;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(tou_gaf));
                                if (NIL != valid_$3) {
                                    final SubLObject nart = assertions_high.gaf_arg1(tou_gaf);
                                    assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
                                    if (NIL != fort_types_interface.microtheory_p(nart)) {
                                        scope_microtheory_contents_and_implicitly_defined_terms(nart);
                                    }
                                }
                                done_var_$1 = makeBoolean(NIL == valid_$3);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_partition_utilities_file() {
        declareFunction("instantiate_prepared_assertion_set", "INSTANTIATE-PREPARED-ASSERTION-SET", 3, 1, false);
        declareFunction("instantiate_prepared_assertion_set_constants", "INSTANTIATE-PREPARED-ASSERTION-SET-CONSTANTS", 2, 0, false);
        declareFunction("unserialize_prepared_assertion_set", "UNSERIALIZE-PREPARED-ASSERTION-SET", 2, 1, false);
        declareFunction("serialize_prepared_assertion_set", "SERIALIZE-PREPARED-ASSERTION-SET", 3, 0, false);
        declareFunction("generate_prepared_assertion_actuals_for_parameters_map", "GENERATE-PREPARED-ASSERTION-ACTUALS-FOR-PARAMETERS-MAP", 1, 0, false);
        declareFunction("determine_prepared_assertion_set_partition", "DETERMINE-PREPARED-ASSERTION-SET-PARTITION", 1, 0, false);
        declareFunction("save_assertion_partition", "SAVE-ASSERTION-PARTITION", 2, 1, false);
        declareFunction("scope_assertion_partition", "SCOPE-ASSERTION-PARTITION", 0, 0, false);
        declareFunction("save_kb_diff_partition", "SAVE-KB-DIFF-PARTITION", 2, 0, false);
        declareFunction("scope_kb_diff_constants", "SCOPE-KB-DIFF-CONSTANTS", 0, 0, false);
        declareFunction("scope_kb_diff_narts", "SCOPE-KB-DIFF-NARTS", 0, 0, false);
        declareFunction("scope_kb_diff_assertions", "SCOPE-KB-DIFF-ASSERTIONS", 0, 0, false);
        declareFunction("scope_kb_diff_deductions", "SCOPE-KB-DIFF-DEDUCTIONS", 0, 0, false);
        declareFunction("scope_microtheory_contents_and_implicitly_defined_terms", "SCOPE-MICROTHEORY-CONTENTS-AND-IMPLICITLY-DEFINED-TERMS", 1, 0, false);
        declareFunction("rf_defined_in_mtP", "RF-DEFINED-IN-MT?", 2, 0, false);
        declareFunction("scope_sk_source", "SCOPE-SK-SOURCE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_partition_utilities_file() {
        defparameter("*ASSERTION-PARTITION*", $list7);
        defparameter("*ASSERTION-LIST-FOR-ASSERTION-PARTITION*", NIL);
        defparameter("*KB-DIFF-PARTITION*", $list12);
        defparameter("*KB-DIFF-FOR-PARTITION*", NIL);
        return NIL;
    }

    public static SubLObject setup_partition_utilities_file() {
        note_funcall_helper_function(SCOPE_ASSERTION_PARTITION);
        note_funcall_helper_function(SCOPE_KB_DIFF_CONSTANTS);
        note_funcall_helper_function(SCOPE_KB_DIFF_NARTS);
        note_funcall_helper_function(SCOPE_KB_DIFF_ASSERTIONS);
        note_funcall_helper_function(SCOPE_KB_DIFF_DEDUCTIONS);
        note_funcall_helper_function(SCOPE_MICROTHEORY_CONTENTS_AND_IMPLICITLY_DEFINED_TERMS);
        note_funcall_helper_function(SCOPE_SK_SOURCE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_partition_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_partition_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_partition_utilities_file();
    }

    
}

/**
 * Total time: 214 ms
 */
