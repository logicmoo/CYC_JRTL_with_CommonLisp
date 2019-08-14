/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_completion_high.new_constant_completion_iterator;
import static com.cyc.cycjava.cycl.constant_index_manager.get_file_backed_constant_internal_id_threshold;
import static com.cyc.cycjava.cycl.constant_index_manager.setup_constant_index_table;
import static com.cyc.cycjava.cycl.id_index.clear_id_index;
import static com.cyc.cycjava.cycl.id_index.clone_id_index;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_missing_ids;
import static com.cyc.cycjava.cycl.id_index.id_index_new_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_old_and_new_object_counts;
import static com.cyc.cycjava.cycl.id_index.id_index_old_object_count;
import static com.cyc.cycjava.cycl.id_index.id_index_remove;
import static com.cyc.cycjava.cycl.id_index.id_index_reserve;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.id_index.new_id_index_iterator;
import static com.cyc.cycjava.cycl.id_index.new_id_index_ordered_iterator;
import static com.cyc.cycjava.cycl.id_index.new_indirect_compact_id_index;
import static com.cyc.cycjava.cycl.id_index.optimize_id_index;
import static com.cyc.cycjava.cycl.id_index.set_id_index_next_id;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.free_term_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.index_installed_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_macro;
import static com.cyc.cycjava.cycl.utilities_macros.register_obsolete_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTANT-HANDLES
 * source file: /cyc/top/cycl/constant-handles.lisp
 * created:     2019/07/03 17:37:18
 */
public final class constant_handles extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constant_handles();

 public static final String myName = "com.cyc.cycjava.cycl.constant_handles";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_constant$ = makeSymbol("*DTP-CONSTANT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $constant_from_suid$ = makeSymbol("*CONSTANT-FROM-SUID*");

    static private final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc constants")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$mapping_Cyc_constants = makeString("mapping Cyc constants");

    static private final SubLList $list4 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list8 = list(makeSymbol("DO-CONSTANTS-TABLE"));

    private static final SubLSymbol DO_CONSTANTS = makeSymbol("DO-CONSTANTS");

    static private final SubLString $str11$Iterate_over_all_HL_constant_data = makeString(
	    "Iterate over all HL constant datastructures, executing BODY within the scope of VAR.\n   VAR is bound to each constant in turn.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");

    private static final SubLSymbol DO_CONSTANTS_TABLE = makeSymbol("DO-CONSTANTS-TABLE");

    private static final SubLSymbol CREATE_CONSTANT_DUMP_ID_TABLE = makeSymbol("CREATE-CONSTANT-DUMP-ID-TABLE");

    private static final SubLSymbol WITH_CONSTANT_DUMP_ID_TABLE = makeSymbol("WITH-CONSTANT-DUMP-ID-TABLE");

    private static final SubLSymbol CONSTANT_COUNT = makeSymbol("CONSTANT-COUNT");

    static private final SubLString $str18$Return_the_total_number_of_consta = makeString("Return the total number of constants.");

    static private final SubLList $list19 = list(makeSymbol("INTEGERP"));

    private static final SubLSymbol $new_constant_suid_threshold$ = makeSymbol("*NEW-CONSTANT-SUID-THRESHOLD*");

    static private final SubLList $list23 = list(list(makeSymbol("ID"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym24$ITERATOR = makeUninternedSymbol("ITERATOR");

    static private final SubLList $list26 = list(list(makeSymbol("DELETED-CONSTANT-ID-ITERATOR")));

    private static final SubLString $$$Determining_maximum_constant_SUID = makeString("Determining maximum constant SUID");

    static private final SubLList $list29 = list(list(makeSymbol("CONSTANT"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list30 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $sym31$THRESHOLD = makeUninternedSymbol("THRESHOLD");

    private static final SubLList $list32 = list(list(makeSymbol("NEW-CONSTANT-SUID-THRESHOLD")));

    private static final SubLSymbol DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");

    private static final SubLSymbol $sym34$START = makeUninternedSymbol("START");

    private static final SubLSymbol DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");

    private static final SubLSymbol $sym36$NEW_CONSTANTS_TABLE_ENTRY_ = makeSymbol("NEW-CONSTANTS-TABLE-ENTRY?");

    private static final SubLSymbol CONSTANTS_TABLE_TUPLE_TO_CONSTANT = makeSymbol("CONSTANTS-TABLE-TUPLE-TO-CONSTANT");

    private static final SubLList $list38 = list(makeSymbol("ID"), makeSymbol("PAYLOAD"));

    private static final SubLInteger $int$140 = makeInteger(140);

    static final SubLList $list42 = list(makeSymbol("SUID"), makeSymbol("NAME"));

    static final SubLList $list43 = list($SUID, $NAME);

    static final SubLList $list44 = list(makeSymbol("C-SUID"), makeSymbol("C-NAME"));

    static final SubLList $list45 = list(makeSymbol("_CSETF-C-SUID"), makeSymbol("_CSETF-C-NAME"));

    static final SubLSymbol PRINT_CONSTANT = makeSymbol("PRINT-CONSTANT");

    private static final SubLSymbol CONSTANT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CONSTANT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list48 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CONSTANT-P"));

    private static final SubLSymbol C_SUID = makeSymbol("C-SUID");

    private static final SubLSymbol _CSETF_C_SUID = makeSymbol("_CSETF-C-SUID");

    private static final SubLSymbol C_NAME = makeSymbol("C-NAME");

    private static final SubLSymbol _CSETF_C_NAME = makeSymbol("_CSETF-C-NAME");

    private static final SubLString $str55$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CONSTANT = makeSymbol("MAKE-CONSTANT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CONSTANT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONSTANT-METHOD");

    private static final SubLString $str61$___a = makeString("#$~a");

    private static final SubLString $str62$_The_CFASL_invalid_constant_ = makeString("<The CFASL invalid constant>");

    private static final SubLString $str63$_Constant__a_ = makeString("<Constant ~a>");

    private static final SubLSymbol SXHASH_CONSTANT_METHOD = makeSymbol("SXHASH-CONSTANT-METHOD");

    static private final SubLList $list65 = list(makeSymbol("OBJECT"));

    private static final SubLString $str66$Return_T_iff_the_argument_is_a_Cy = makeString("Return T iff the argument is a CycL constant");

    private static final SubLList $list67 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol $sym68$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLList $list69 = list(makeSymbol("CONSTANT"), makeSymbol("&OPTIONAL"), makeSymbol("ROBUST"));

    private static final SubLString $str70$Return_T_if_CONSTANT_is_a_valid__ = makeString("Return T if CONSTANT is a valid, fully-formed constant.");

    private static final SubLSymbol VALID_CONSTANT = makeSymbol("VALID-CONSTANT");

    private static final SubLList $list73 = list(makeSymbol("VALID-CONSTANT?"));

    private static final SubLString $str74$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant?\n   Return T if CONSTANT is a valid constant.");

    private static final SubLSymbol $invalid_constants$ = makeSymbol("*INVALID-CONSTANTS*");

    private static final SubLInteger $int$4000 = makeInteger(4000);

    private static final SubLString $str77$clearing_local_constant_informati = makeString("clearing local constant information");

    private static final SubLInteger $int$50000 = makeInteger(50000);

    private static final SubLList $list79 = list(makeSymbol("INTERNAL-ID"), makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    private static final SubLSymbol CONSTANT_NAME_SPEC_P = makeSymbol("CONSTANT-NAME-SPEC-P");

    private static final SubLString $$$Freeing_constants = makeString("Freeing constants");

    private static final SubLString $str83$Rebuilding_constant_completion_ta = makeString("Rebuilding constant completion table");

    /**
     * Return a new ITERATOR for iterating over all constants.
     */
    @LispMethod(comment = "Return a new ITERATOR for iterating over all constants.")
    public static final SubLObject new_constants_iterator_alt() {
	return iteration.new_indirect_iterator(new_id_index_iterator($constant_from_suid$.getGlobalValue()), symbol_function(SECOND), UNPROVIDED);
    }

    /**
     * Return a new ITERATOR for iterating over all constants.
     */
    @LispMethod(comment = "Return a new ITERATOR for iterating over all constants.")
    public static SubLObject new_constants_iterator() {
	return iteration.new_indirect_iterator(new_id_index_iterator($constant_from_suid$.getGlobalValue()), symbol_function(SECOND), UNPROVIDED);
    }

    /**
     * Iterate over all HL constant datastructures, executing BODY within the scope of VAR.
     * VAR is bound to each constant in turn.
     * PROGRESS-MESSAGE is a progress message string.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all HL constant datastructures, executing BODY within the scope of VAR.\r\nVAR is bound to each constant in turn.\r\nPROGRESS-MESSAGE is a progress message string.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate over all HL constant datastructures, executing BODY within the scope of VAR.\nVAR is bound to each constant in turn.\nPROGRESS-MESSAGE is a progress message string.\nIteration halts early as soon as DONE becomes non-nil.")
    public static final SubLObject do_constants_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt2);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject var = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt2);
		    var = current.first();
		    current = current.rest();
		    {
			SubLObject progress_message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$mapping_Cyc_constants;
			destructuring_bind_must_listp(current, datum, $list_alt2);
			current = current.rest();
			{
			    SubLObject allow_other_keys_p = NIL;
			    SubLObject rest = current;
			    SubLObject bad = NIL;
			    SubLObject current_1 = NIL;
			    for (; NIL != rest;) {
				destructuring_bind_must_consp(rest, datum, $list_alt2);
				current_1 = rest.first();
				rest = rest.rest();
				destructuring_bind_must_consp(rest, datum, $list_alt2);
				if (NIL == member(current_1, $list_alt4, UNPROVIDED, UNPROVIDED)) {
				    bad = T;
				}
				if (current_1 == $ALLOW_OTHER_KEYS) {
				    allow_other_keys_p = rest.first();
				}
				rest = rest.rest();
			    }
			    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
				cdestructuring_bind_error(datum, $list_alt2);
			    }
			    {
				SubLObject done_tail = property_list_member($DONE, current);
				SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
				current = temp;
				{
				    SubLObject body = current;
				    return listS(DO_KB_SUID_TABLE, list(var, $list_alt8, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
				}
			    }
			}
		    }
		}
	    }
	}
    }

    /**
     * Iterate over all HL constant datastructures, executing BODY within the scope of VAR.
     * VAR is bound to each constant in turn.
     * PROGRESS-MESSAGE is a progress message string.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all HL constant datastructures, executing BODY within the scope of VAR.\r\nVAR is bound to each constant in turn.\r\nPROGRESS-MESSAGE is a progress message string.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate over all HL constant datastructures, executing BODY within the scope of VAR.\nVAR is bound to each constant in turn.\nPROGRESS-MESSAGE is a progress message string.\nIteration halts early as soon as DONE becomes non-nil.")
    public static SubLObject do_constants(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list2);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject var = NIL;
	destructuring_bind_must_consp(current, datum, $list2);
	var = current.first();
	current = current.rest();
	final SubLObject progress_message = (current.isCons()) ? current.first() : $$$mapping_Cyc_constants;
	destructuring_bind_must_listp(current, datum, $list2);
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$1 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list2);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list2);
	    if (NIL == member(current_$1, $list4, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$1 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list2);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return listS(DO_KB_SUID_TABLE, list(var, $list8, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_constants_table_alt() {
	return $constant_from_suid$.getGlobalValue();
    }

    public static SubLObject do_constants_table() {
	return $constant_from_suid$.getGlobalValue();
    }

    public static final SubLObject map_constants_alt(SubLObject function) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject idx = do_constants_table();
		SubLObject total = id_index_count(idx);
		SubLObject sofar = ZERO_INTEGER;
		SubLTrampolineFile.checkType($$$mapping_Cyc_constants, STRINGP);
		{
		    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			noting_percent_progress_preamble($$$mapping_Cyc_constants);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
			    {
				SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
				SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
				SubLObject c = NIL;
				while (NIL != id) {
				    c = do_id_index_state_object(idx, $SKIP, id, state_var);
				    if (NIL != do_id_index_id_and_object_validP(id, c, $SKIP)) {
					note_percent_progress(sofar, total);
					sofar = add(sofar, ONE_INTEGER);
					funcall(function, c);
				    }
				    id = do_id_index_next_id(idx, T, id, state_var);
				    state_var = do_id_index_next_state(idx, T, id, state_var);
				}
			    }
			}
			noting_percent_progress_postamble();
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_3, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject map_constants(final SubLObject function) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject idx = do_constants_table();
	final SubLObject mess = $$$mapping_Cyc_constants;
	final SubLObject total = id_index_count(idx);
	SubLObject sofar = ZERO_INTEGER;
	assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
	final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble(mess);
		final SubLObject idx_$2 = idx;
		if (NIL == id_index_objects_empty_p(idx_$2, $SKIP)) {
		    final SubLObject idx_$3 = idx_$2;
		    if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
			final SubLObject vector_var = id_index_dense_objects(idx_$3);
			final SubLObject backwardP_var = NIL;
			SubLObject length;
			SubLObject v_iteration;
			SubLObject id;
			SubLObject c;
			for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			    c = aref(vector_var, id);
			    if ((NIL == id_index_tombstone_p(c)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
				if (NIL != id_index_tombstone_p(c)) {
				    c = $SKIP;
				}
				funcall(function, c);
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			}
		    }
		    final SubLObject idx_$4 = idx_$2;
		    if ((NIL == id_index_sparse_objects_empty_p(idx_$4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			final SubLObject sparse = id_index_sparse_objects(idx_$4);
			SubLObject id2 = id_index_sparse_id_threshold(idx_$4);
			final SubLObject end_id = id_index_next_id(idx_$4);
			final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
			while (id2.numL(end_id)) {
			    final SubLObject c2 = gethash_without_values(id2, sparse, v_default);
			    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(c2))) {
				funcall(function, c2);
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			    id2 = add(id2, ONE_INTEGER);
			}
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
		}
	    }
	} finally {
	    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
	    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
	    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
	    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject setup_constant_suid_table_alt(SubLObject size, SubLObject exactP) {
	if (NIL != $constant_from_suid$.getGlobalValue()) {
	    return NIL;
	}
	constant_completion.initialize_constant_names_in_code();
	$constant_from_suid$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
	return T;
    }

    public static SubLObject setup_constant_suid_table(final SubLObject size, final SubLObject exactP) {
	if (NIL != $constant_from_suid$.getGlobalValue()) {
	    return NIL;
	}
	constant_completion.initialize_constant_names_in_code();
	$constant_from_suid$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
	return T;
    }

    public static final SubLObject finalize_constant_suid_table_alt(SubLObject max_constant_suid) {
	if (max_constant_suid == UNPROVIDED) {
	    max_constant_suid = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    set_next_constant_suid(max_constant_suid);
	    if (NIL == max_constant_suid) {
		{
		    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
		    try {
			Storage.$current_area$.bind(Storage.get_static_area(), thread);
			optimize_id_index($constant_from_suid$.getGlobalValue(), UNPROVIDED);
		    } finally {
			Storage.$current_area$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject finalize_constant_suid_table(SubLObject max_constant_suid) {
	if (max_constant_suid == UNPROVIDED) {
	    max_constant_suid = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	set_next_constant_suid(max_constant_suid);
	set_new_constant_suid_threshold(next_constant_suid());
	if (NIL == max_constant_suid) {
	    final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
	    try {
		Storage.$current_area$.bind(Storage.get_static_area(), thread);
		optimize_id_index($constant_from_suid$.getGlobalValue(), UNPROVIDED);
	    } finally {
		Storage.$current_area$.rebind(_prev_bind_0, thread);
	    }
	}
	return NIL;
    }

    public static final SubLObject clear_constant_suid_table_alt() {
	return clear_id_index($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject clear_constant_suid_table() {
	return clear_id_index($constant_from_suid$.getGlobalValue());
    }

    public static final SubLObject create_constant_dump_id_table_alt() {
	return new_indirect_compact_id_index($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject create_constant_dump_id_table() {
	return new_indirect_compact_id_index($constant_from_suid$.getGlobalValue());
    }

    public static final SubLObject new_dense_constant_id_index_alt() {
	return clone_id_index(do_constants_table());
    }

    public static SubLObject new_dense_constant_id_index() {
	return clone_id_index(do_constants_table());
    }

    /**
     * Return the total number of constants.
     */
    @LispMethod(comment = "Return the total number of constants.")
    public static final SubLObject constant_count_alt() {
	if (NIL == $constant_from_suid$.getGlobalValue()) {
	    return ZERO_INTEGER;
	}
	return id_index_count($constant_from_suid$.getGlobalValue());
    }

    /**
     * Return the total number of constants.
     */
    @LispMethod(comment = "Return the total number of constants.")
    public static SubLObject constant_count() {
	if (NIL == $constant_from_suid$.getGlobalValue()) {
	    return ZERO_INTEGER;
	}
	return id_index_count($constant_from_suid$.getGlobalValue());
    }

    public static final SubLObject lookup_constant_by_suid_alt(SubLObject suid) {
	return id_index_lookup($constant_from_suid$.getGlobalValue(), suid, UNPROVIDED);
    }

    public static SubLObject lookup_constant_by_suid(final SubLObject suid) {
	return id_index_lookup($constant_from_suid$.getGlobalValue(), suid, UNPROVIDED);
    }

    public static final SubLObject next_constant_suid_alt() {
	return id_index_next_id($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject next_constant_suid() {
	return id_index_next_id($constant_from_suid$.getGlobalValue());
    }

    public static final SubLObject new_constant_suid_threshold_alt() {
	return id_index_new_id_threshold($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject new_constant_suid_threshold() {
	return NIL != $new_constant_suid_threshold$.getGlobalValue() ? $new_constant_suid_threshold$.getGlobalValue() : constant_index_manager.get_file_backed_constant_internal_id_threshold();
    }

    public static SubLObject set_new_constant_suid_threshold(final SubLObject id) {
	$new_constant_suid_threshold$.setGlobalValue(id);
	return id;
    }

    public static final SubLObject old_constant_count_alt() {
	return id_index_old_object_count(do_constants_table());
    }

    public static SubLObject old_constant_count() {
	return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), id_index_old_and_new_object_counts(do_constants_table(), new_constant_suid_threshold()));
    }

    public static final SubLObject new_constant_count_alt() {
	return subtract(constant_count(), old_constant_count());
    }

    public static SubLObject new_constant_count() {
	return nth_value_step_2(nth_value_step_1(ONE_INTEGER), id_index_old_and_new_object_counts(do_constants_table(), new_constant_suid_threshold()));
    }

    /**
     * Return a list of old constant internal IDs which are no longer being used.
     */
    @LispMethod(comment = "Return a list of old constant internal IDs which are no longer being used.")
    public static final SubLObject missing_old_constant_internal_ids_alt() {
	{
	    SubLObject id_limit = get_file_backed_constant_internal_id_threshold();
	    return id_index_missing_ids(do_constants_table(), $OLD, id_limit);
	}
    }

    /**
     * Return a list of old constant internal IDs which are no longer being used.
     */
    @LispMethod(comment = "Return a list of old constant internal IDs which are no longer being used.")
    public static SubLObject missing_old_constant_internal_ids() {
	final SubLObject id_limit = new_constant_suid_threshold();
	return id_index_missing_ids(do_constants_table(), $DENSE, id_limit);
    }

    public static SubLObject missing_constant_id_set() {
	return set_utilities.construct_set_from_list(id_index_missing_ids(do_constants_table(), $ALL, UNPROVIDED), EQL, UNPROVIDED);
    }

    public static SubLObject deleted_constant_id_iterator() {
	return iteration.new_list_iterator(id_index_missing_ids(do_constants_table(), $ALL, UNPROVIDED));
    }

    public static SubLObject do_deleted_constant_ids(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list23);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject id = NIL;
	destructuring_bind_must_consp(current, datum, $list23);
	id = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$6 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list23);
	    current_$6 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list23);
	    if (NIL == member(current_$6, $list4, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$6 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list23);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject iterator = $sym24$ITERATOR;
	return list(CLET, list(bq_cons(iterator, $list26)), listS(DO_ITERATOR, list(id, iterator, $DONE, done), append(body, NIL)));
    }

    public static SubLObject has_new_constantsP() {
	return numG(next_constant_suid(), new_constant_suid_threshold());
    }

    public static final SubLObject set_next_constant_suid_alt(SubLObject max_constant_suid) {
	if (max_constant_suid == UNPROVIDED) {
	    max_constant_suid = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject max = MINUS_ONE_INTEGER;
		if (NIL != max_constant_suid) {
		    max = max_constant_suid;
		} else {
		    {
			SubLObject idx = do_constants_table();
			SubLObject total = id_index_count(idx);
			SubLObject sofar = ZERO_INTEGER;
			SubLTrampolineFile.checkType($$$Determining_maximum_constant_SUID, STRINGP);
			{
			    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
			    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
			    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
			    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
			    try {
				$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
				$last_percent_progress_prediction$.bind(NIL, thread);
				$within_noting_percent_progress$.bind(T, thread);
				$percent_progress_start_time$.bind(get_universal_time(), thread);
				noting_percent_progress_preamble($$$Determining_maximum_constant_SUID);
				if (NIL == do_id_index_empty_p(idx, $SKIP)) {
				    {
					SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
					SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
					SubLObject constant = NIL;
					while (NIL != id) {
					    constant = do_id_index_state_object(idx, $SKIP, id, state_var);
					    if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
						note_percent_progress(sofar, total);
						sofar = add(sofar, ONE_INTEGER);
						{
						    SubLObject suid = constant_suid(constant);
						    max = max(max, suid);
						}
					    }
					    id = do_id_index_next_id(idx, T, id, state_var);
					    state_var = do_id_index_next_state(idx, T, id, state_var);
					}
				    }
				}
				noting_percent_progress_postamble();
			    } finally {
				$percent_progress_start_time$.rebind(_prev_bind_3, thread);
				$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
				$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
				$last_percent_progress_index$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		{
		    SubLObject next_suid = add(max, ONE_INTEGER);
		    set_id_index_next_id($constant_from_suid$.getGlobalValue(), next_suid);
		    return next_suid;
		}
	    }
	}
    }

    public static SubLObject set_next_constant_suid(SubLObject max_constant_suid) {
	if (max_constant_suid == UNPROVIDED) {
	    max_constant_suid = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject max = MINUS_ONE_INTEGER;
	if (NIL != max_constant_suid) {
	    max = max_constant_suid;
	} else {
	    final SubLObject idx = do_constants_table();
	    final SubLObject mess = $$$Determining_maximum_constant_SUID;
	    final SubLObject total = id_index_count(idx);
	    SubLObject sofar = ZERO_INTEGER;
	    assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
	    final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
	    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
	    try {
		$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		$last_percent_progress_prediction$.bind(NIL, thread);
		$within_noting_percent_progress$.bind(T, thread);
		$percent_progress_start_time$.bind(get_universal_time(), thread);
		try {
		    noting_percent_progress_preamble(mess);
		    final SubLObject idx_$7 = idx;
		    if (NIL == id_index_objects_empty_p(idx_$7, $SKIP)) {
			final SubLObject idx_$8 = idx_$7;
			if (NIL == id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
			    final SubLObject vector_var = id_index_dense_objects(idx_$8);
			    final SubLObject backwardP_var = NIL;
			    SubLObject length;
			    SubLObject v_iteration;
			    SubLObject id;
			    SubLObject constant;
			    SubLObject suid;
			    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
				id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
				constant = aref(vector_var, id);
				if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
				    if (NIL != id_index_tombstone_p(constant)) {
					constant = $SKIP;
				    }
				    suid = constant_suid(constant);
				    max = max(max, suid);
				    sofar = add(sofar, ONE_INTEGER);
				    note_percent_progress(sofar, total);
				}
			    }
			}
			final SubLObject idx_$9 = idx_$7;
			if ((NIL == id_index_sparse_objects_empty_p(idx_$9)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			    final SubLObject sparse = id_index_sparse_objects(idx_$9);
			    SubLObject id2 = id_index_sparse_id_threshold(idx_$9);
			    final SubLObject end_id = id_index_next_id(idx_$9);
			    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
			    while (id2.numL(end_id)) {
				final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
				if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
				    final SubLObject suid2 = constant_suid(constant2);
				    max = max(max, suid2);
				    sofar = add(sofar, ONE_INTEGER);
				    note_percent_progress(sofar, total);
				}
				id2 = add(id2, ONE_INTEGER);
			    }
			}
		    }
		} finally {
		    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values = getValuesAsVector();
			noting_percent_progress_postamble();
			restoreValuesFromVector(_values);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
		    }
		}
	    } finally {
		$percent_progress_start_time$.rebind(_prev_bind_4, thread);
		$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
		$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
		$last_percent_progress_index$.rebind(_prev_bind_0, thread);
	    }
	}
	final SubLObject next_suid = add(max, ONE_INTEGER);
	set_id_index_next_id($constant_from_suid$.getGlobalValue(), next_suid);
	return next_suid;
    }

    /**
     * Note that SUID will be used as the suid for CONSTANT.
     */
    @LispMethod(comment = "Note that SUID will be used as the suid for CONSTANT.")
    public static final SubLObject register_constant_suid_alt(SubLObject constant, SubLObject suid) {
	reset_constant_suid(constant, suid);
	id_index_enter($constant_from_suid$.getGlobalValue(), suid, constant);
	return constant;
    }

    /**
     * Note that SUID will be used as the suid for CONSTANT.
     */
    @LispMethod(comment = "Note that SUID will be used as the suid for CONSTANT.")
    public static SubLObject register_constant_suid(final SubLObject constant, final SubLObject suid) {
	reset_constant_suid(constant, suid);
	id_index_enter($constant_from_suid$.getGlobalValue(), suid, constant);
	return constant;
    }

    /**
     * Note that SUID is not in use as a constant suid.
     */
    @LispMethod(comment = "Note that SUID is not in use as a constant suid.")
    public static final SubLObject deregister_constant_suid_alt(SubLObject suid) {
	return id_index_remove($constant_from_suid$.getGlobalValue(), suid);
    }

    /**
     * Note that SUID is not in use as a constant suid.
     */
    @LispMethod(comment = "Note that SUID is not in use as a constant suid.")
    public static SubLObject deregister_constant_suid(final SubLObject suid) {
	return id_index_remove($constant_from_suid$.getGlobalValue(), suid);
    }

    /**
     * Return a new integer suid for a constant.
     */
    @LispMethod(comment = "Return a new integer suid for a constant.")
    public static final SubLObject make_constant_suid_alt() {
	return id_index_reserve($constant_from_suid$.getGlobalValue());
    }

    /**
     * Return a new integer suid for a constant.
     */
    @LispMethod(comment = "Return a new integer suid for a constant.")
    public static SubLObject make_constant_suid() {
	return id_index_reserve($constant_from_suid$.getGlobalValue());
    }

    /**
     * Iterate over all the old constant datastructures, executing BODY within the scope of CONSTANT.
     * CONSTANT is an 'old' deduction, i.e. one that was already present when the KB was loaded.
     * PROGRESS-MESSAGE, if provided, is a progress message string.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all the old constant datastructures, executing BODY within the scope of CONSTANT.\r\nCONSTANT is an \'old\' deduction, i.e. one that was already present when the KB was loaded.\r\nPROGRESS-MESSAGE, if provided, is a progress message string.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate over all the old constant datastructures, executing BODY within the scope of CONSTANT.\nCONSTANT is an \'old\' deduction, i.e. one that was already present when the KB was loaded.\nPROGRESS-MESSAGE, if provided, is a progress message string.\nIteration halts early as soon as DONE becomes non-nil.")
    public static final SubLObject do_old_constants_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt22);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject constant = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt22);
		    constant = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_2 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt22);
			    current_2 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt22);
			    if (NIL == member(current_2, $list_alt23, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_2 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt22);
			}
			{
			    SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
			    SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject threshold = $sym24$THRESHOLD;
				return list(CLET, list(bq_cons(threshold, $list_alt26)), listS(DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, list(constant, $list_alt8, threshold, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    /**
     * Iterate over all the old constant datastructures, executing BODY within the scope of CONSTANT.
     * CONSTANT is an 'old' deduction, i.e. one that was already present when the KB was loaded.
     * PROGRESS-MESSAGE, if provided, is a progress message string.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all the old constant datastructures, executing BODY within the scope of CONSTANT.\r\nCONSTANT is an \'old\' deduction, i.e. one that was already present when the KB was loaded.\r\nPROGRESS-MESSAGE, if provided, is a progress message string.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate over all the old constant datastructures, executing BODY within the scope of CONSTANT.\nCONSTANT is an \'old\' deduction, i.e. one that was already present when the KB was loaded.\nPROGRESS-MESSAGE, if provided, is a progress message string.\nIteration halts early as soon as DONE becomes non-nil.")
    public static SubLObject do_old_constants(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list29);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject constant = NIL;
	destructuring_bind_must_consp(current, datum, $list29);
	constant = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$11 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list29);
	    current_$11 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list29);
	    if (NIL == member(current_$11, $list30, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$11 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list29);
	}
	final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
	final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject threshold = $sym31$THRESHOLD;
	return list(CLET, list(bq_cons(threshold, $list32)), listS(DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, list(constant, $list8, threshold, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    /**
     * Iterate over all the new constant datastructures, executing BODY within the scope of CONSTANT.
     * CONSTANT is an 'new' constant, i.e. one that was not already present when the KB was loaded.
     * PROGRESS-MESSAGE, if provided, is a progress message string.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all the new constant datastructures, executing BODY within the scope of CONSTANT.\r\nCONSTANT is an \'new\' constant, i.e. one that was not already present when the KB was loaded.\r\nPROGRESS-MESSAGE, if provided, is a progress message string.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate over all the new constant datastructures, executing BODY within the scope of CONSTANT.\nCONSTANT is an \'new\' constant, i.e. one that was not already present when the KB was loaded.\nPROGRESS-MESSAGE, if provided, is a progress message string.\nIteration halts early as soon as DONE becomes non-nil.")
    public static final SubLObject do_new_constants_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt22);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject constant = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt22);
		    constant = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_3 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt22);
			    current_3 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt22);
			    if (NIL == member(current_3, $list_alt23, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt22);
			}
			{
			    SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
			    SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject start = $sym28$START;
				return list(CLET, list(bq_cons(start, $list_alt29)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(constant, $list_alt8, start, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    /**
     * Iterate over all the new constant datastructures, executing BODY within the scope of CONSTANT.
     * CONSTANT is an 'new' constant, i.e. one that was not already present when the KB was loaded.
     * PROGRESS-MESSAGE, if provided, is a progress message string.
     * Iteration halts early as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all the new constant datastructures, executing BODY within the scope of CONSTANT.\r\nCONSTANT is an \'new\' constant, i.e. one that was not already present when the KB was loaded.\r\nPROGRESS-MESSAGE, if provided, is a progress message string.\r\nIteration halts early as soon as DONE becomes non-nil.\nIterate over all the new constant datastructures, executing BODY within the scope of CONSTANT.\nCONSTANT is an \'new\' constant, i.e. one that was not already present when the KB was loaded.\nPROGRESS-MESSAGE, if provided, is a progress message string.\nIteration halts early as soon as DONE becomes non-nil.")
    public static SubLObject do_new_constants(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list29);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject constant = NIL;
	destructuring_bind_must_consp(current, datum, $list29);
	constant = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$12 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list29);
	    current_$12 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list29);
	    if (NIL == member(current_$12, $list30, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$12 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list29);
	}
	final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
	final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject start = $sym34$START;
	return list(CLET, list(bq_cons(start, $list32)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(constant, $list8, start, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject new_new_constants_iterator() {
	return iteration.new_indirect_iterator(iteration.new_filter_iterator(new_id_index_ordered_iterator(do_constants_table()), $sym36$NEW_CONSTANTS_TABLE_ENTRY_, list(new_constant_suid_threshold())), CONSTANTS_TABLE_TUPLE_TO_CONSTANT, UNPROVIDED);
    }

    public static SubLObject new_constants_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
	SubLObject id = NIL;
	SubLObject payload = NIL;
	destructuring_bind_must_consp(tuple, tuple, $list38);
	id = tuple.first();
	SubLObject current = tuple.rest();
	destructuring_bind_must_consp(current, tuple, $list38);
	payload = current.first();
	current = current.rest();
	if (NIL == current) {
	    return numGE(id, id_threshold);
	}
	cdestructuring_bind_error(tuple, $list38);
	return NIL;
    }

    public static SubLObject constants_table_tuple_to_constant(final SubLObject tuple) {
	SubLObject id = NIL;
	SubLObject payload = NIL;
	destructuring_bind_must_consp(tuple, tuple, $list38);
	id = tuple.first();
	SubLObject current = tuple.rest();
	destructuring_bind_must_consp(current, tuple, $list38);
	payload = current.first();
	current = current.rest();
	if (NIL == current) {
	    return find_constant_by_suid(id);
	}
	cdestructuring_bind_error(tuple, $list38);
	return NIL;
    }

    public static final SubLObject constant_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	print_constant(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject constant_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_constant(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject constant_p_alt(SubLObject v_object) {
	return v_object.getClass() == $constant_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject constant_p(final SubLObject v_object) {
	return v_object.getClass() == $constant_native.class ? T : NIL;
    }

    public static final SubLObject c_suid_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, CONSTANT_P);
	return v_object.getField2();
    }

    public static SubLObject c_suid(final SubLObject v_object) {
	assert NIL != constant_p(v_object) : "! constant_p(v_object) " + "constant_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject c_name_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, CONSTANT_P);
	return v_object.getField3();
    }

    public static SubLObject c_name(final SubLObject v_object) {
	assert NIL != constant_p(v_object) : "! constant_p(v_object) " + "constant_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject _csetf_c_suid_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, CONSTANT_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_c_suid(final SubLObject v_object, final SubLObject value) {
	assert NIL != constant_p(v_object) : "! constant_p(v_object) " + "constant_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_c_name_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, CONSTANT_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_c_name(final SubLObject v_object, final SubLObject value) {
	assert NIL != constant_p(v_object) : "! constant_p(v_object) " + "constant_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject make_constant_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new $constant_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($SUID)) {
			_csetf_c_suid(v_new, current_value);
		    } else {
			if (pcase_var.eql($NAME)) {
			    _csetf_c_name(v_new, current_value);
			} else {
			    Errors.error($str_alt46$Invalid_slot__S_for_construction_, current_arg);
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_constant(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $constant_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($SUID)) {
		_csetf_c_suid(v_new, current_value);
	    } else if (pcase_var.eql($NAME)) {
		_csetf_c_name(v_new, current_value);
	    } else {
		Errors.error($str55$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_constant(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_CONSTANT, TWO_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $SUID, c_suid(obj));
	funcall(visitor_fn, obj, $SLOT, $NAME, c_name(obj));
	funcall(visitor_fn, obj, $END, MAKE_CONSTANT, TWO_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_constant_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_constant(obj, visitor_fn);
    }

    public static final SubLObject print_constant_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    SubLObject name = c_name(v_object);
	    SubLObject suid = c_suid(v_object);
	    if (name.isString()) {
		format(stream, $str_alt47$___a, name);
	    } else {
		if (v_object == cfasl_kb_methods.cfasl_invalid_constant()) {
		    format(stream, $str_alt48$_The_CFASL_invalid_constant_);
		} else {
		    if (suid.isInteger()) {
			format(stream, $str_alt49$_Constant__a_, suid);
		    } else {
			compatibility.default_struct_print_function(v_object, stream, depth);
		    }
		}
	    }
	}
	return v_object;
    }

    public static SubLObject print_constant(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLObject name = c_name(v_object);
	final SubLObject suid = c_suid(v_object);
	if (name.isString()) {
	    format(stream, $str61$___a, name);
	} else if (v_object.eql(cfasl_kb_methods.cfasl_invalid_constant())) {
	    format(stream, $str62$_The_CFASL_invalid_constant_);
	} else if (suid.isInteger()) {
	    format(stream, $str63$_Constant__a_, suid);
	} else {
	    compatibility.default_struct_print_function(v_object, stream, depth);
	}

	return v_object;
    }

    public static final SubLObject sxhash_constant_method_alt(SubLObject v_object) {
	{
	    SubLObject suid = c_suid(v_object);
	    if (suid.isInteger()) {
		return suid;
	    }
	}
	return ZERO_INTEGER;
    }

    public static SubLObject sxhash_constant_method(final SubLObject v_object) {
	final SubLObject suid = c_suid(v_object);
	if (suid.isInteger()) {
	    return suid;
	}
	return ZERO_INTEGER;
    }

    /**
     * Make a new constant shell, potentially in static space.
     */
    @LispMethod(comment = "Make a new constant shell, potentially in static space.")
    public static final SubLObject get_constant_alt() {
	{
	    SubLObject constant = NIL;
	    constant = make_constant(UNPROVIDED);
	    return constant;
	}
    }

    /**
     * Make a new constant shell, potentially in static space.
     */
    @LispMethod(comment = "Make a new constant shell, potentially in static space.")
    public static SubLObject get_constant() {
	SubLObject constant = NIL;
	constant = make_constant(UNPROVIDED);
	return constant;
    }

    public static final SubLObject init_constant_alt(SubLObject constant) {
	_csetf_c_suid(constant, NIL);
	return constant;
    }

    public static SubLObject init_constant(final SubLObject constant) {
	_csetf_c_suid(constant, NIL);
	return constant;
    }

    /**
     * Invalidate CONSTANT.
     */
    @LispMethod(comment = "Invalidate CONSTANT.")
    public static final SubLObject free_constant_alt(SubLObject constant) {
	return init_constant(constant);
    }

    /**
     * Invalidate CONSTANT.
     */
    @LispMethod(comment = "Invalidate CONSTANT.")
    public static SubLObject free_constant(final SubLObject constant) {
	return init_constant(constant);
    }

    /**
     * Return T iff OBJECT is a valid constant handle.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid constant handle.")
    public static final SubLObject valid_constant_handleP_alt(SubLObject constant) {
	return makeBoolean((NIL != constant_p(constant)) && (NIL != constant_handle_validP(constant)));
    }

    /**
     * Return T iff OBJECT is a valid constant handle.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid constant handle.")
    public static SubLObject valid_constant_handleP(final SubLObject constant) {
	return makeBoolean((NIL != constant_p(constant)) && (NIL != constant_handle_validP(constant)));
    }

    /**
     * Return T if CONSTANT is a valid, fully-formed constant.
     */
    @LispMethod(comment = "Return T if CONSTANT is a valid, fully-formed constant.")
    public static final SubLObject valid_constantP_alt(SubLObject constant, SubLObject robust) {
	if (robust == UNPROVIDED) {
	    robust = NIL;
	}
	return valid_constant_handleP(constant);
    }

    /**
     * Return T if CONSTANT is a valid, fully-formed constant.
     */
    @LispMethod(comment = "Return T if CONSTANT is a valid, fully-formed constant.")
    public static SubLObject valid_constantP(final SubLObject constant, SubLObject robust) {
	if (robust == UNPROVIDED) {
	    robust = NIL;
	}
	arete.arete_note_constant_touched(constant);
	return valid_constant_handleP(constant);
    }

    /**
     * Return T if CONSTANT is a valid constant.
     * Performs more thorough checking than @xref VALID-CONSTANT?.
     */
    @LispMethod(comment = "Return T if CONSTANT is a valid constant.\r\nPerforms more thorough checking than @xref VALID-CONSTANT?.\nReturn T if CONSTANT is a valid constant.\nPerforms more thorough checking than @xref VALID-CONSTANT?.")
    public static final SubLObject valid_constant_robustP_alt(SubLObject constant) {
	if (NIL != valid_constantP(constant, UNPROVIDED)) {
	    {
		SubLObject name = constants_high.constant_name(constant);
		SubLObject index = constants_low.constant_index(constant);
		return makeBoolean((name.isString() || ($UNNAMED == name)) && (NIL != index_installed_p(index)));
	    }
	}
	return NIL;
    }

    /**
     * Return T if CONSTANT is a valid constant.
     * Performs more thorough checking than @xref VALID-CONSTANT?.
     */
    @LispMethod(comment = "Return T if CONSTANT is a valid constant.\r\nPerforms more thorough checking than @xref VALID-CONSTANT?.\nReturn T if CONSTANT is a valid constant.\nPerforms more thorough checking than @xref VALID-CONSTANT?.")
    public static SubLObject valid_constant_robustP(final SubLObject constant) {
	if (NIL != valid_constantP(constant, UNPROVIDED)) {
	    final SubLObject name = constants_high.constant_name(constant);
	    final SubLObject index = constants_low.constant_index(constant);
	    return makeBoolean((name.isString() || ($UNNAMED == name)) && (NIL != index_installed_p(index)));
	}
	return NIL;
    }

    /**
     * Deprecated in favor of valid-constant?
     * Return T if CONSTANT is a valid constant.
     */
    @LispMethod(comment = "Deprecated in favor of valid-constant?\r\nReturn T if CONSTANT is a valid constant.\nDeprecated in favor of valid-constant?\nReturn T if CONSTANT is a valid constant.")
    public static final SubLObject valid_constant_alt(SubLObject constant, SubLObject robust) {
	if (robust == UNPROVIDED) {
	    robust = NIL;
	}
	return valid_constantP(constant, UNPROVIDED);
    }

    /**
     * Deprecated in favor of valid-constant?
     * Return T if CONSTANT is a valid constant.
     */
    @LispMethod(comment = "Deprecated in favor of valid-constant?\r\nReturn T if CONSTANT is a valid constant.\nDeprecated in favor of valid-constant?\nReturn T if CONSTANT is a valid constant.")
    public static SubLObject valid_constant(final SubLObject constant, SubLObject robust) {
	if (robust == UNPROVIDED) {
	    robust = NIL;
	}
	return valid_constantP(constant, UNPROVIDED);
    }

    public static final SubLObject invalid_constant_handleP_alt(SubLObject constant) {
	return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constant_handleP(constant)));
    }

    public static SubLObject invalid_constant_handleP(final SubLObject constant) {
	return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constant_handleP(constant)));
    }

    public static final SubLObject invalid_constantP_alt(SubLObject constant, SubLObject robust) {
	if (robust == UNPROVIDED) {
	    robust = NIL;
	}
	return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constantP(constant, UNPROVIDED)));
    }

    public static SubLObject invalid_constantP(final SubLObject constant, SubLObject robust) {
	if (robust == UNPROVIDED) {
	    robust = NIL;
	}
	return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constantP(constant, UNPROVIDED)));
    }

    public static final SubLObject invalid_constant_robustP_alt(SubLObject constant) {
	return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constant_robustP(constant)));
    }

    public static SubLObject invalid_constant_robustP(final SubLObject constant) {
	return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constant_robustP(constant)));
    }

    public static final SubLObject invalid_constant_names_alt() {
	return hash_table_utilities.hash_table_keys($invalid_constants$.getGlobalValue());
    }

    public static SubLObject invalid_constant_names() {
	return hash_table_utilities.hash_table_keys($invalid_constants$.getGlobalValue());
    }

    public static final SubLObject clear_invalid_constants_table_alt() {
	return clrhash($invalid_constants$.getGlobalValue());
    }

    public static SubLObject clear_invalid_constants_table() {
	return clrhash($invalid_constants$.getGlobalValue());
    }

    public static final SubLObject find_invalid_constant_alt(SubLObject name) {
	return gethash(name, $invalid_constants$.getGlobalValue(), NIL);
    }

    public static SubLObject find_invalid_constant(final SubLObject name) {
	return gethash(name, $invalid_constants$.getGlobalValue(), NIL);
    }

    public static final SubLObject register_invalid_constant_by_name_alt(SubLObject constant, SubLObject name) {
	return sethash(name, $invalid_constants$.getGlobalValue(), constant);
    }

    public static SubLObject register_invalid_constant_by_name(final SubLObject constant, final SubLObject name) {
	return sethash(name, $invalid_constants$.getGlobalValue(), constant);
    }

    public static final SubLObject deregister_invalid_constant_by_name_alt(SubLObject name) {
	return remhash(name, $invalid_constants$.getGlobalValue());
    }

    public static SubLObject deregister_invalid_constant_by_name(final SubLObject name) {
	return remhash(name, $invalid_constants$.getGlobalValue());
    }

    public static final SubLObject synchronize_constants_with_hl_store_alt() {
	return NIL != hl_interface_infrastructure.hl_access_remoteP() ? ((SubLObject) (synchronize_constants_with_remote_hl_store())) : synchronize_constants_with_local_hl_store();
    }

    public static SubLObject synchronize_constants_with_hl_store() {
	return NIL != hl_interface_infrastructure.hl_access_remoteP() ? synchronize_constants_with_remote_hl_store() : synchronize_constants_with_local_hl_store();
    }

    public static final SubLObject synchronize_constants_with_remote_hl_store_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject idx = do_constants_table();
		SubLObject total = id_index_count(idx);
		SubLObject sofar = ZERO_INTEGER;
		SubLTrampolineFile.checkType($str_alt63$clearing_local_constant_informati, STRINGP);
		{
		    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			noting_percent_progress_preamble($str_alt63$clearing_local_constant_informati);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
			    {
				SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
				SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
				SubLObject constant = NIL;
				while (NIL != id) {
				    constant = do_id_index_state_object(idx, $SKIP, id, state_var);
				    if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
					note_percent_progress(sofar, total);
					sofar = add(sofar, ONE_INTEGER);
					{
					    SubLObject suid = constant_suid(constant);
					    if (suid.isInteger()) {
						deregister_constant_suid(suid);
						reset_constant_suid(constant, NIL);
						{
						    SubLObject name = constants_high.constant_name(constant);
						    if (name.isString()) {
							register_invalid_constant_by_name(constant, name);
						    }
						}
					    }
					}
				    }
				    id = do_id_index_next_id(idx, T, id, state_var);
				    state_var = do_id_index_next_state(idx, T, id, state_var);
				}
			    }
			}
			noting_percent_progress_postamble();
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_3, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
		constants_low.clear_constant_guid_table();
		constant_completion_low.clear_constant_completion_table();
	    }
	    {
		SubLObject constant_info_iterator = constants_interface.kb_new_constant_info_iterator($int$50000);
		SubLObject count = ZERO_INTEGER;
		try {
		    {
			SubLObject done_var = NIL;
			while (NIL == done_var) {
			    thread.resetMultipleValues();
			    {
				SubLObject constant_info = iteration.iteration_next(constant_info_iterator);
				SubLObject valid = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != valid) {
				    {
					SubLObject datum = constant_info;
					SubLObject current = datum;
					SubLObject internal_id = NIL;
					SubLObject name = NIL;
					SubLObject external_id = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt65);
					internal_id = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt65);
					name = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt65);
					external_id = current.first();
					current = current.rest();
					if (NIL == current) {
					    {
						SubLObject constant = make_constant_shell(name, T);
						if (internal_id.isInteger()) {
						    constants_low.install_constant_internal_id(constant, internal_id);
						    if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
							constants_low.install_constant_external_id(constant, external_id);
							constant_completion_low.add_constant_to_completions(constant, name);
						    }
						    deregister_invalid_constant_by_name(name);
						    count = add(count, ONE_INTEGER);
						} else {
						    if (constant_suid(constant).isInteger()) {
							reset_constant_suid(constant, NIL);
						    }
						    register_invalid_constant_by_name(constant, name);
						}
					    }
					} else {
					    cdestructuring_bind_error(datum, $list_alt65);
					}
				    }
				}
				done_var = makeBoolean(NIL == valid);
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
			    $is_thread_performing_cleanupP$.bind(T, thread);
			    hl_interface_infrastructure.destroy_hl_store_iterator(constant_info_iterator);
			} finally {
			    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		return count;
	    }
	}
    }

    public static SubLObject synchronize_constants_with_remote_hl_store() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject idx = do_constants_table();
	final SubLObject mess = $str77$clearing_local_constant_informati;
	final SubLObject total = id_index_count(idx);
	SubLObject sofar = ZERO_INTEGER;
	assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
	final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble(mess);
		final SubLObject idx_$13 = idx;
		if (NIL == id_index_objects_empty_p(idx_$13, $SKIP)) {
		    final SubLObject idx_$14 = idx_$13;
		    if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
			final SubLObject vector_var = id_index_dense_objects(idx_$14);
			final SubLObject backwardP_var = NIL;
			SubLObject length;
			SubLObject v_iteration;
			SubLObject id;
			SubLObject constant;
			SubLObject suid;
			SubLObject name;
			for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			    constant = aref(vector_var, id);
			    if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
				if (NIL != id_index_tombstone_p(constant)) {
				    constant = $SKIP;
				}
				suid = constant_suid(constant);
				if (suid.isInteger()) {
				    deregister_constant_suid(suid);
				    reset_constant_suid(constant, NIL);
				    name = constants_high.constant_name(constant);
				    if (name.isString()) {
					register_invalid_constant_by_name(constant, name);
				    }
				}
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			}
		    }
		    final SubLObject idx_$15 = idx_$13;
		    if ((NIL == id_index_sparse_objects_empty_p(idx_$15)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			final SubLObject sparse = id_index_sparse_objects(idx_$15);
			SubLObject id2 = id_index_sparse_id_threshold(idx_$15);
			final SubLObject end_id = id_index_next_id(idx_$15);
			final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
			while (id2.numL(end_id)) {
			    final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
			    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
				final SubLObject suid2 = constant_suid(constant2);
				if (suid2.isInteger()) {
				    deregister_constant_suid(suid2);
				    reset_constant_suid(constant2, NIL);
				    final SubLObject name2 = constants_high.constant_name(constant2);
				    if (name2.isString()) {
					register_invalid_constant_by_name(constant2, name2);
				    }
				}
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			    id2 = add(id2, ONE_INTEGER);
			}
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
		}
	    }
	} finally {
	    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
	    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
	    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
	    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
	}
	if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
	    constants_low.clear_constant_guid_table();
	    constant_completion_low.clear_constant_completion_table();
	}
	final SubLObject constant_info_iterator = constants_interface.kb_new_constant_info_iterator($int$50000);
	SubLObject count = ZERO_INTEGER;
	try {
	    SubLObject valid;
	    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
		thread.resetMultipleValues();
		final SubLObject constant_info = iteration.iteration_next(constant_info_iterator);
		valid = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != valid) {
		    SubLObject current;
		    final SubLObject datum = current = constant_info;
		    SubLObject internal_id = NIL;
		    SubLObject name3 = NIL;
		    SubLObject external_id = NIL;
		    destructuring_bind_must_consp(current, datum, $list79);
		    internal_id = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list79);
		    name3 = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list79);
		    external_id = current.first();
		    current = current.rest();
		    if (NIL == current) {
			final SubLObject constant3 = make_constant_shell(name3, T);
			if (internal_id.isInteger()) {
			    constants_low.install_constant_internal_id(constant3, internal_id);
			    if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
				constants_low.install_constant_external_id(constant3, external_id);
				constant_completion_low.add_constant_to_completions(constant3, name3);
			    }
			    deregister_invalid_constant_by_name(name3);
			    count = add(count, ONE_INTEGER);
			} else {
			    if (constant_suid(constant3).isInteger()) {
				reset_constant_suid(constant3, NIL);
			    }
			    register_invalid_constant_by_name(constant3, name3);
			}
		    } else {
			cdestructuring_bind_error(datum, $list79);
		    }
		}
	    }
	} finally {
	    final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values2 = getValuesAsVector();
		hl_interface_infrastructure.destroy_hl_store_iterator(constant_info_iterator);
		restoreValuesFromVector(_values2);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
	    }
	}
	return count;
    }

    public static final SubLObject synchronize_constants_with_local_hl_store_alt() {
	{
	    SubLObject name = NIL;
	    SubLObject constant = NIL;
	    {
		final Iterator cdohash_iterator = getEntrySetIterator($invalid_constants$.getGlobalValue());
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			name = getEntryKey(cdohash_entry);
			constant = getEntryValue(cdohash_entry);
			{
			    SubLObject old_constant = constant_completion_low.constant_shell_from_name(name);
			    if (NIL != constant_p(old_constant)) {
				{
				    SubLObject datum = constants_low.constant_info(old_constant);
				    SubLObject current = datum;
				    SubLObject internal_id = NIL;
				    SubLObject name_4 = NIL;
				    SubLObject external_id = NIL;
				    destructuring_bind_must_consp(current, datum, $list_alt65);
				    internal_id = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list_alt65);
				    name_4 = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list_alt65);
				    external_id = current.first();
				    current = current.rest();
				    if (NIL == current) {
					constants_low.kb_remove_constant_internal(old_constant);
					constants_low.install_constant_internal_id(constant, internal_id);
					constants_low.install_constant_external_id(constant, external_id);
					constant_completion_low.add_constant_to_completions(constant, name_4);
					deregister_invalid_constant_by_name(name_4);
				    } else {
					cdestructuring_bind_error(datum, $list_alt65);
				    }
				}
			    }
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return NIL;
    }

    public static SubLObject synchronize_constants_with_local_hl_store() {
	SubLObject name = NIL;
	SubLObject constant = NIL;
	final Iterator cdohash_iterator = getEntrySetIterator($invalid_constants$.getGlobalValue());
	try {
	    while (iteratorHasNext(cdohash_iterator)) {
		final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
		name = getEntryKey(cdohash_entry);
		constant = getEntryValue(cdohash_entry);
		final SubLObject old_constant = constant_completion_low.constant_shell_from_name(name);
		if (NIL != constant_p(old_constant)) {
		    SubLObject current;
		    final SubLObject datum = current = constants_low.constant_info(old_constant);
		    SubLObject internal_id = NIL;
		    SubLObject name_$17 = NIL;
		    SubLObject external_id = NIL;
		    destructuring_bind_must_consp(current, datum, $list79);
		    internal_id = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list79);
		    name_$17 = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list79);
		    external_id = current.first();
		    current = current.rest();
		    if (NIL == current) {
			constants_low.kb_remove_constant_internal(old_constant);
			constants_low.install_constant_internal_id(constant, internal_id);
			constants_low.install_constant_external_id(constant, external_id);
			constant_completion_low.add_constant_to_completions(constant, name_$17);
			deregister_invalid_constant_by_name(name_$17);
		    } else {
			cdestructuring_bind_error(datum, $list79);
		    }
		}
	    }
	} finally {
	    releaseEntrySetIterator(cdohash_iterator);
	}
	return NIL;
    }

    public static final SubLObject make_constant_shell_alt(SubLObject name, SubLObject use_existingP) {
	if (use_existingP == UNPROVIDED) {
	    use_existingP = NIL;
	}
	SubLTrampolineFile.checkType(name, CONSTANT_NAME_SPEC_P);
	if ((NIL != use_existingP) && name.isString()) {
	    {
		SubLObject found = constant_completion_low.constant_shell_from_name(name);
		if (NIL != found) {
		    return found;
		}
	    }
	    {
		SubLObject found = find_invalid_constant(name);
		if (NIL != found) {
		    return found;
		}
	    }
	}
	{
	    SubLObject constant = make_constant_shell_internal(name, T);
	    if (name.isString()) {
		register_invalid_constant_by_name(constant, name);
	    }
	    return constant;
	}
    }

    public static SubLObject make_constant_shell(final SubLObject name, SubLObject use_existingP) {
	if (use_existingP == UNPROVIDED) {
	    use_existingP = NIL;
	}
	assert NIL != constant_completion_high.constant_name_spec_p(name) : "! constant_completion_high.constant_name_spec_p(name) " + ("constant_completion_high.constant_name_spec_p(name) " + "CommonSymbols.NIL != constant_completion_high.constant_name_spec_p(name) ") + name;
	if ((NIL != use_existingP) && name.isString()) {
	    SubLObject found = constant_completion_low.constant_shell_from_name(name);
	    if (NIL != found) {
		return found;
	    }
	    found = find_invalid_constant(name);
	    if (NIL != found) {
		return found;
	    }
	}
	final SubLObject constant = make_constant_shell_internal(name, T);
	if (name.isString()) {
	    register_invalid_constant_by_name(constant, name);
	}
	return constant;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc constants")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt4 = list($DONE);

    public static final SubLObject make_constant_shell_internal_alt(SubLObject name, SubLObject v_static) {
	{
	    SubLObject constant = NIL;
	    constant = get_constant();
	    _csetf_c_name(constant, name);
	    return constant;
	}
    }

    public static SubLObject make_constant_shell_internal(final SubLObject name, final SubLObject v_static) {
	SubLObject constant = NIL;
	constant = get_constant();
	_csetf_c_name(constant, name);
	return constant;
    }

    static private final SubLList $list_alt8 = list(makeSymbol("DO-CONSTANTS-TABLE"));

    /**
     * Trampoline called by the #$ reader
     */
    @LispMethod(comment = "Trampoline called by the #$ reader")
    public static final SubLObject reader_make_constant_shell_alt(SubLObject constant_name) {
	return make_constant_shell(constant_name, T);
    }

    /**
     * TODO Describe the purpose of this method.
     *
     * @param string
     * 		
     * @return Trampoline called by the #$ reader
     */
    /**
     * Trampoline called by the #$ reader
     */
    @LispMethod(comment = "TODO Describe the purpose of this method.\r\n\r\n@param string\r\n\t\t\r\n@return Trampoline called by the #$ reader")
    public static SubLObject reader_make_constant_shell_alt(String string) {
	return reader_make_constant_shell(makeString(string));
    }

    /**
     * Trampoline called by the #$ reader
     *
     *
     * TODO Describe the purpose of this method.
     *
     * @param string
     * 		
     * @return Trampoline called by the #$ reader
     */
    @LispMethod(comment = "Trampoline called by the #$ reader\r\n\r\n\r\nTODO Describe the purpose of this method.\r\n\r\n@param string\r\n\t\t\r\n@return Trampoline called by the #$ reader\nTrampoline called by the #$ reader\n\n\nTODO Describe the purpose of this method.")
    public static SubLObject reader_make_constant_shell(final SubLObject constant_name) {
	return make_constant_shell(constant_name, T);
    }

    /**
    * TODO Describe the purpose of this method.
    *
    * @param string
    * 		
    * @return Trampoline called by the #$ reader
    */

    static private final SubLString $str_alt11$Iterate_over_all_HL_constant_data = makeString(
	    "Iterate over all HL constant datastructures, executing BODY within the scope of VAR.\n   VAR is bound to each constant in turn.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");

    public static SubLObject reader_make_constant_shell(final String constant_name) {
	return reader_make_constant_shell(makeString(constant_name));
    }

    public static final SubLObject make_bogus_constant_shell_alt(SubLObject name) {
	SubLTrampolineFile.checkType(name, STRINGP);
	return make_constant_shell_internal(name, NIL);
    }

    public static SubLObject make_bogus_constant_shell(final SubLObject name) {
	assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
	return make_constant_shell_internal(name, NIL);
    }

    /**
     * Create a sample invalid constant
     */
    @LispMethod(comment = "Create a sample invalid constant")
    public static final SubLObject create_sample_invalid_constant_alt() {
	return make_constant_shell_internal(NIL, NIL);
    }

    /**
     * Create a sample invalid constant
     */
    @LispMethod(comment = "Create a sample invalid constant")
    public static SubLObject create_sample_invalid_constant() {
	return make_constant_shell_internal(NIL, NIL);
    }

    /**
     * Create a new invalid CONSTANT during a partition load.
     * This is only to be called by the partition code.
     */
    @LispMethod(comment = "Create a new invalid CONSTANT during a partition load.\r\nThis is only to be called by the partition code.\nCreate a new invalid CONSTANT during a partition load.\nThis is only to be called by the partition code.")
    public static final SubLObject partition_create_invalid_constant_alt() {
	return make_constant_shell($UNNAMED, UNPROVIDED);
    }

    /**
     * Create a new invalid CONSTANT during a partition load.
     * This is only to be called by the partition code.
     */
    @LispMethod(comment = "Create a new invalid CONSTANT during a partition load.\r\nThis is only to be called by the partition code.\nCreate a new invalid CONSTANT during a partition load.\nThis is only to be called by the partition code.")
    public static SubLObject partition_create_invalid_constant() {
	return make_constant_shell($UNNAMED, UNPROVIDED);
    }

    static private final SubLString $str_alt18$Return_the_total_number_of_consta = makeString("Return the total number of constants.");

    public static final SubLObject free_all_constants_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject idx = do_constants_table();
		SubLObject total = id_index_count(idx);
		SubLObject sofar = ZERO_INTEGER;
		SubLTrampolineFile.checkType($$$Freeing_constants, STRINGP);
		{
		    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			noting_percent_progress_preamble($$$Freeing_constants);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
			    {
				SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
				SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
				SubLObject constant = NIL;
				while (NIL != id) {
				    constant = do_id_index_state_object(idx, $SKIP, id, state_var);
				    if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
					note_percent_progress(sofar, total);
					sofar = add(sofar, ONE_INTEGER);
					free_term_index(constant);
					free_constant(constant);
				    }
				    id = do_id_index_next_id(idx, T, id, state_var);
				    state_var = do_id_index_next_state(idx, T, id, state_var);
				}
			    }
			}
			noting_percent_progress_postamble();
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_3, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    clear_constant_tables();
	    return NIL;
	}
    }

    public static SubLObject free_all_constants() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject idx = do_constants_table();
	final SubLObject mess = $$$Freeing_constants;
	final SubLObject total = id_index_count(idx);
	SubLObject sofar = ZERO_INTEGER;
	assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
	final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble(mess);
		final SubLObject idx_$18 = idx;
		if (NIL == id_index_objects_empty_p(idx_$18, $SKIP)) {
		    final SubLObject idx_$19 = idx_$18;
		    if (NIL == id_index_dense_objects_empty_p(idx_$19, $SKIP)) {
			final SubLObject vector_var = id_index_dense_objects(idx_$19);
			final SubLObject backwardP_var = NIL;
			SubLObject length;
			SubLObject v_iteration;
			SubLObject id;
			SubLObject constant;
			for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			    constant = aref(vector_var, id);
			    if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
				if (NIL != id_index_tombstone_p(constant)) {
				    constant = $SKIP;
				}
				free_term_index(constant);
				free_constant(constant);
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			}
		    }
		    final SubLObject idx_$20 = idx_$18;
		    if ((NIL == id_index_sparse_objects_empty_p(idx_$20)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			final SubLObject sparse = id_index_sparse_objects(idx_$20);
			SubLObject id2 = id_index_sparse_id_threshold(idx_$20);
			final SubLObject end_id = id_index_next_id(idx_$20);
			final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
			while (id2.numL(end_id)) {
			    final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
			    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
				free_term_index(constant2);
				free_constant(constant2);
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			    id2 = add(id2, ONE_INTEGER);
			}
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
		}
	    }
	} finally {
	    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
	    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
	    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
	    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
	}
	clear_constant_tables();
	return NIL;
    }

    static private final SubLList $list_alt19 = list(makeSymbol("INTEGERP"));

    static private final SubLList $list_alt22 = list(list(CONSTANT, makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt23 = list($PROGRESS_MESSAGE, $DONE);

    static private final SubLSymbol $sym24$THRESHOLD = makeUninternedSymbol("THRESHOLD");

    static private final SubLList $list_alt26 = list(list(makeSymbol("GET-FILE-BACKED-CONSTANT-INTERNAL-ID-THRESHOLD")));

    static private final SubLSymbol $sym28$START = makeUninternedSymbol("START");

    static private final SubLList $list_alt29 = list(list(makeSymbol("+"), ONE_INTEGER, list(makeSymbol("GET-FILE-BACKED-CONSTANT-INTERNAL-ID-THRESHOLD"))));

    static private final SubLList $list_alt34 = list(makeSymbol("SUID"), makeSymbol("NAME"));

    static private final SubLList $list_alt35 = list($SUID, $NAME);

    static private final SubLList $list_alt36 = list(makeSymbol("C-SUID"), makeSymbol("C-NAME"));

    static private final SubLList $list_alt37 = list(makeSymbol("_CSETF-C-SUID"), makeSymbol("_CSETF-C-NAME"));

    static private final SubLString $str_alt46$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt47$___a = makeString("#$~a");

    static private final SubLString $str_alt48$_The_CFASL_invalid_constant_ = makeString("<The CFASL invalid constant>");

    static private final SubLString $str_alt49$_Constant__a_ = makeString("<Constant ~a>");

    static private final SubLList $list_alt51 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt52$Return_T_iff_the_argument_is_a_Cy = makeString("Return T iff the argument is a CycL constant");

    static private final SubLList $list_alt53 = list(makeSymbol("BOOLEANP"));

    static private final SubLSymbol $sym54$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    static private final SubLList $list_alt55 = list(makeSymbol("CONSTANT"), makeSymbol("&OPTIONAL"), makeSymbol("ROBUST"));

    static private final SubLString $str_alt56$Return_T_if_CONSTANT_is_a_valid__ = makeString("Return T if CONSTANT is a valid, fully-formed constant.");

    static private final SubLList $list_alt59 = list(makeSymbol("VALID-CONSTANT?"));

    static private final SubLString $str_alt60$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant?\n   Return T if CONSTANT is a valid constant.");

    static private final SubLString $str_alt63$clearing_local_constant_informati = makeString("clearing local constant information");

    static private final SubLList $list_alt65 = list(makeSymbol("INTERNAL-ID"), makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    static private final SubLString $str_alt69$Rebuilding_constant_completion_ta = makeString("Rebuilding constant completion table");

    /**
     * Return the SUID of CONSTANT.
     */
    @LispMethod(comment = "Return the SUID of CONSTANT.")
    public static final SubLObject constant_suid_alt(SubLObject constant) {
	SubLTrampolineFile.checkType(constant, CONSTANT_P);
	return c_suid(constant);
    }

    /**
     * Return the SUID of CONSTANT.
     */
    @LispMethod(comment = "Return the SUID of CONSTANT.")
    public static SubLObject constant_suid(final SubLObject constant) {
	assert NIL != constant_p(constant) : "! constant_p(constant) " + ("constant_p(constant) " + "CommonSymbols.NIL != constant_p(constant) ") + constant;
	return c_suid(constant);
    }

    public static final SubLObject install_constant_suid_alt(SubLObject constant, SubLObject suid) {
	SubLTrampolineFile.checkType(constant, CONSTANT_P);
	SubLTrampolineFile.checkType(suid, INTEGERP);
	if (!constant_suid(constant).isInteger()) {
	    register_constant_suid(constant, suid);
	}
	return constant;
    }

    public static SubLObject install_constant_suid(final SubLObject constant, final SubLObject suid) {
	assert NIL != constant_p(constant) : "! constant_p(constant) " + ("constant_p(constant) " + "CommonSymbols.NIL != constant_p(constant) ") + constant;
	assert NIL != integerp(suid) : "! integerp(suid) " + ("Types.integerp(suid) " + "CommonSymbols.NIL != Types.integerp(suid) ") + suid;
	if (!constant_suid(constant).isInteger()) {
	    register_constant_suid(constant, suid);
	}
	return constant;
    }

    /**
     * Primitively change the SUID of CONSTANT to NEW-SUID.
     */
    @LispMethod(comment = "Primitively change the SUID of CONSTANT to NEW-SUID.")
    public static final SubLObject reset_constant_suid_alt(SubLObject constant, SubLObject new_suid) {
	_csetf_c_suid(constant, new_suid);
	return constant;
    }

    /**
     * Primitively change the SUID of CONSTANT to NEW-SUID.
     */
    @LispMethod(comment = "Primitively change the SUID of CONSTANT to NEW-SUID.")
    public static SubLObject reset_constant_suid(final SubLObject constant, final SubLObject new_suid) {
	_csetf_c_suid(constant, new_suid);
	return constant;
    }

    public static final SubLObject constant_handle_validP_alt(SubLObject constant) {
	return integerp(c_suid(constant));
    }

    public static SubLObject constant_handle_validP(final SubLObject constant) {
	return integerp(constant_suid(constant));
    }

    /**
     * Return the constant with SUID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with SUID, or NIL if not present.")
    public static final SubLObject find_constant_by_suid_alt(SubLObject suid) {
	SubLTrampolineFile.checkType(suid, INTEGERP);
	return lookup_constant_by_suid(suid);
    }

    /**
     * Return the constant with SUID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with SUID, or NIL if not present.")
    public static SubLObject find_constant_by_suid(final SubLObject suid) {
	assert NIL != integerp(suid) : "! integerp(suid) " + ("Types.integerp(suid) " + "CommonSymbols.NIL != Types.integerp(suid) ") + suid;
	return lookup_constant_by_suid(suid);
    }

    public static final SubLObject setup_constant_tables_alt(SubLObject size, SubLObject exactP) {
	constants_low.setup_constant_guid_table(size, exactP);
	setup_constant_suid_table(size, exactP);
	setup_constant_index_table(size, exactP);
	return NIL;
    }

    public static SubLObject setup_constant_tables(final SubLObject size, final SubLObject exactP) {
	constants_low.setup_constant_guid_table(size, exactP);
	setup_constant_suid_table(size, exactP);
	constant_index_manager.setup_constant_index_table(size, exactP);
	return NIL;
    }

    public static final SubLObject finalize_constants_alt(SubLObject max_constant_suid) {
	if (max_constant_suid == UNPROVIDED) {
	    max_constant_suid = NIL;
	}
	finalize_constant_suid_table(max_constant_suid);
	return NIL;
    }

    public static SubLObject finalize_constants(SubLObject max_constant_suid) {
	if (max_constant_suid == UNPROVIDED) {
	    max_constant_suid = NIL;
	}
	finalize_constant_suid_table(max_constant_suid);
	return NIL;
    }

    public static final SubLObject clear_constant_tables_alt() {
	constants_low.clear_constant_guid_table();
	clear_constant_suid_table();
	return NIL;
    }

    public static SubLObject clear_constant_tables() {
	constants_low.clear_constant_guid_table();
	clear_constant_suid_table();
	return NIL;
    }

    /**
     * Map over the KB, completely rebuilding the constant-completion table
     */
    @LispMethod(comment = "Map over the KB, completely rebuilding the constant-completion table")
    public static final SubLObject rebuild_constant_completion_table_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject code_constants = constant_completion.constants_mentioned_in_code();
		constant_completion_low.clear_constant_completion_table();
		{
		    SubLObject idx = do_constants_table();
		    SubLObject total = id_index_count(idx);
		    SubLObject sofar = ZERO_INTEGER;
		    SubLTrampolineFile.checkType($str_alt69$Rebuilding_constant_completion_ta, STRINGP);
		    {
			SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
			SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
			SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
			SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
			try {
			    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			    $last_percent_progress_prediction$.bind(NIL, thread);
			    $within_noting_percent_progress$.bind(T, thread);
			    $percent_progress_start_time$.bind(get_universal_time(), thread);
			    noting_percent_progress_preamble($str_alt69$Rebuilding_constant_completion_ta);
			    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
				{
				    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
				    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
				    SubLObject constant = NIL;
				    while (NIL != id) {
					constant = do_id_index_state_object(idx, $SKIP, id, state_var);
					if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
					    note_percent_progress(sofar, total);
					    sofar = add(sofar, ONE_INTEGER);
					    if (NIL != valid_constantP(constant, UNPROVIDED)) {
						{
						    SubLObject name = constants_high.constant_name(constant);
						    if (name.isString()) {
							constant_completion_low.add_constant_to_completions(constant, name);
						    }
						}
					    }
					}
					id = do_id_index_next_id(idx, T, id, state_var);
					state_var = do_id_index_next_state(idx, T, id, state_var);
				    }
				}
			    }
			    noting_percent_progress_postamble();
			} finally {
			    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
			    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		{
		    SubLObject cdolist_list_var = code_constants;
		    SubLObject constant = NIL;
		    for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), constant = cdolist_list_var.first()) {
			if (NIL == valid_constantP(constant, UNPROVIDED)) {
			    {
				SubLObject name = constants_high.constant_name(constant);
				if (name.isString()) {
				    constant_completion_low.add_constant_to_completions(constant, name);
				}
			    }
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     * Map over the KB, completely rebuilding the constant-completion table
     */
    @LispMethod(comment = "Map over the KB, completely rebuilding the constant-completion table")
    public static SubLObject rebuild_constant_completion_table() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject code_constants = constant_completion.constants_mentioned_in_code();
	constant_completion_low.clear_constant_completion_table();
	final SubLObject idx = do_constants_table();
	final SubLObject mess = $str83$Rebuilding_constant_completion_ta;
	final SubLObject total = id_index_count(idx);
	SubLObject sofar = ZERO_INTEGER;
	assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
	final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble(mess);
		final SubLObject idx_$22 = idx;
		if (NIL == id_index_objects_empty_p(idx_$22, $SKIP)) {
		    final SubLObject idx_$23 = idx_$22;
		    if (NIL == id_index_dense_objects_empty_p(idx_$23, $SKIP)) {
			final SubLObject vector_var = id_index_dense_objects(idx_$23);
			final SubLObject backwardP_var = NIL;
			SubLObject length;
			SubLObject v_iteration;
			SubLObject id;
			SubLObject constant;
			SubLObject name;
			for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			    constant = aref(vector_var, id);
			    if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
				if (NIL != id_index_tombstone_p(constant)) {
				    constant = $SKIP;
				}
				if (NIL != valid_constantP(constant, UNPROVIDED)) {
				    name = constants_high.constant_name(constant);
				    if (name.isString()) {
					constant_completion_low.add_constant_to_completions(constant, name);
				    }
				}
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			}
		    }
		    final SubLObject idx_$24 = idx_$22;
		    if ((NIL == id_index_sparse_objects_empty_p(idx_$24)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			final SubLObject sparse = id_index_sparse_objects(idx_$24);
			SubLObject id2 = id_index_sparse_id_threshold(idx_$24);
			final SubLObject end_id = id_index_next_id(idx_$24);
			final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
			while (id2.numL(end_id)) {
			    final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
			    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
				if (NIL != valid_constantP(constant2, UNPROVIDED)) {
				    final SubLObject name2 = constants_high.constant_name(constant2);
				    if (name2.isString()) {
					constant_completion_low.add_constant_to_completions(constant2, name2);
				    }
				}
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			    id2 = add(id2, ONE_INTEGER);
			}
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
		}
	    }
	} finally {
	    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
	    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
	    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
	    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
	}
	SubLObject cdolist_list_var = code_constants;
	SubLObject constant3 = NIL;
	constant3 = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL == valid_constantP(constant3, UNPROVIDED)) {
		final SubLObject name3 = constants_high.constant_name(constant3);
		if (name3.isString()) {
		    constant_completion_low.add_constant_to_completions(constant3, name3);
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    constant3 = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject remove_invalid_constants_from_completions_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject invalid_constants = NIL;
		SubLObject iterator = new_constant_completion_iterator(T, UNPROVIDED);
		SubLObject done_var = NIL;
		while (NIL == done_var) {
		    thread.resetMultipleValues();
		    {
			SubLObject constant = iteration.iteration_next(iterator);
			SubLObject valid = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL != valid) {
			    if (NIL != invalid_constant_handleP(constant)) {
				invalid_constants = cons(constant, invalid_constants);
			    }
			}
			done_var = makeBoolean(NIL == valid);
		    }
		}
		iteration.iteration_finalize(iterator);
		{
		    SubLObject cdolist_list_var = invalid_constants;
		    SubLObject constant = NIL;
		    for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), constant = cdolist_list_var.first()) {
			{
			    SubLObject name = constants_high.constant_name(constant);
			    if (name.isString()) {
				constant_completion_low.remove_constant_from_completions(constant, name);
				register_invalid_constant_by_name(constant, name);
			    }
			}
		    }
		}
		return length(invalid_constants);
	    }
	}
    }

    public static SubLObject remove_invalid_constants_from_completions() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject invalid_constants = NIL;
	final SubLObject iterator = constant_completion_high.new_constant_completion_iterator(T, UNPROVIDED);
	SubLObject valid;
	for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
	    thread.resetMultipleValues();
	    final SubLObject constant = iteration.iteration_next(iterator);
	    valid = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if ((NIL != valid) && (NIL != invalid_constant_handleP(constant))) {
		invalid_constants = cons(constant, invalid_constants);
	    }
	}
	iteration.iteration_finalize(iterator);
	SubLObject cdolist_list_var = invalid_constants;
	SubLObject constant2 = NIL;
	constant2 = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject name = constants_high.constant_name(constant2);
	    if (name.isString()) {
		constant_completion_low.remove_constant_from_completions(constant2, name);
		register_invalid_constant_by_name(constant2, name);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    constant2 = cdolist_list_var.first();
	}
	return length(invalid_constants);
    }

    public static SubLObject declare_constant_handles_file() {
	SubLPackage.setCurrentPackage("CYC");
	declareFunction("new_constants_iterator", "NEW-CONSTANTS-ITERATOR", 0, 0, false);
	declareMacro("do_constants", "DO-CONSTANTS");
	declareFunction("do_constants_table", "DO-CONSTANTS-TABLE", 0, 0, false);
	declareFunction("map_constants", "MAP-CONSTANTS", 1, 0, false);
	declareFunction("setup_constant_suid_table", "SETUP-CONSTANT-SUID-TABLE", 2, 0, false);
	declareFunction("finalize_constant_suid_table", "FINALIZE-CONSTANT-SUID-TABLE", 0, 1, false);
	declareFunction("clear_constant_suid_table", "CLEAR-CONSTANT-SUID-TABLE", 0, 0, false);
	declareFunction("create_constant_dump_id_table", "CREATE-CONSTANT-DUMP-ID-TABLE", 0, 0, false);
	declareFunction("new_dense_constant_id_index", "NEW-DENSE-CONSTANT-ID-INDEX", 0, 0, false);
	declareFunction("constant_count", "CONSTANT-COUNT", 0, 0, false);
	declareFunction("lookup_constant_by_suid", "LOOKUP-CONSTANT-BY-SUID", 1, 0, false);
	declareFunction("next_constant_suid", "NEXT-CONSTANT-SUID", 0, 0, false);
	declareFunction("new_constant_suid_threshold", "NEW-CONSTANT-SUID-THRESHOLD", 0, 0, false);
	declareFunction("set_new_constant_suid_threshold", "SET-NEW-CONSTANT-SUID-THRESHOLD", 1, 0, false);
	declareFunction("old_constant_count", "OLD-CONSTANT-COUNT", 0, 0, false);
	declareFunction("new_constant_count", "NEW-CONSTANT-COUNT", 0, 0, false);
	declareFunction("missing_old_constant_internal_ids", "MISSING-OLD-CONSTANT-INTERNAL-IDS", 0, 0, false);
	declareFunction("missing_constant_id_set", "MISSING-CONSTANT-ID-SET", 0, 0, false);
	declareFunction("deleted_constant_id_iterator", "DELETED-CONSTANT-ID-ITERATOR", 0, 0, false);
	declareMacro("do_deleted_constant_ids", "DO-DELETED-CONSTANT-IDS");
	declareFunction("has_new_constantsP", "HAS-NEW-CONSTANTS?", 0, 0, false);
	declareFunction("set_next_constant_suid", "SET-NEXT-CONSTANT-SUID", 0, 1, false);
	declareFunction("register_constant_suid", "REGISTER-CONSTANT-SUID", 2, 0, false);
	declareFunction("deregister_constant_suid", "DEREGISTER-CONSTANT-SUID", 1, 0, false);
	declareFunction("make_constant_suid", "MAKE-CONSTANT-SUID", 0, 0, false);
	declareMacro("do_old_constants", "DO-OLD-CONSTANTS");
	declareMacro("do_new_constants", "DO-NEW-CONSTANTS");
	declareFunction("new_new_constants_iterator", "NEW-NEW-CONSTANTS-ITERATOR", 0, 0, false);
	declareFunction("new_constants_table_entryP", "NEW-CONSTANTS-TABLE-ENTRY?", 2, 0, false);
	declareFunction("constants_table_tuple_to_constant", "CONSTANTS-TABLE-TUPLE-TO-CONSTANT", 1, 0, false);
	declareFunction("constant_print_function_trampoline", "CONSTANT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	new $constant_print_function_trampoline$BinaryFunction();
	declareFunction("constant_p", "CONSTANT-P", 1, 0, false);
	new $constant_p$UnaryFunction();
	declareFunction("c_suid", "C-SUID", 1, 0, false);
	declareFunction("c_name", "C-NAME", 1, 0, false);
	declareFunction("_csetf_c_suid", "_CSETF-C-SUID", 2, 0, false);
	declareFunction("_csetf_c_name", "_CSETF-C-NAME", 2, 0, false);
	declareFunction("make_constant", "MAKE-CONSTANT", 0, 1, false);
	declareFunction("visit_defstruct_constant", "VISIT-DEFSTRUCT-CONSTANT", 2, 0, false);
	declareFunction("visit_defstruct_object_constant_method", "VISIT-DEFSTRUCT-OBJECT-CONSTANT-METHOD", 2, 0, false);
	declareFunction("print_constant", "PRINT-CONSTANT", 3, 0, false);
	declareFunction("sxhash_constant_method", "SXHASH-CONSTANT-METHOD", 1, 0, false);
	new $sxhash_constant_method$UnaryFunction();
	declareFunction("get_constant", "GET-CONSTANT", 0, 0, false);
	declareFunction("init_constant", "INIT-CONSTANT", 1, 0, false);
	declareFunction("free_constant", "FREE-CONSTANT", 1, 0, false);
	declareFunction("valid_constant_handleP", "VALID-CONSTANT-HANDLE?", 1, 0, false);
	declareFunction("valid_constantP", "VALID-CONSTANT?", 1, 1, false);
	new $valid_constantP$UnaryFunction();
	new $valid_constantP$BinaryFunction();
	declareFunction("valid_constant_robustP", "VALID-CONSTANT-ROBUST?", 1, 0, false);
	declareFunction("valid_constant", "VALID-CONSTANT", 1, 1, false);
	declareFunction("invalid_constant_handleP", "INVALID-CONSTANT-HANDLE?", 1, 0, false);
	declareFunction("invalid_constantP", "INVALID-CONSTANT?", 1, 1, false);
	new $invalid_constantP$UnaryFunction();
	new $invalid_constantP$BinaryFunction();
	declareFunction("invalid_constant_robustP", "INVALID-CONSTANT-ROBUST?", 1, 0, false);
	declareFunction("invalid_constant_names", "INVALID-CONSTANT-NAMES", 0, 0, false);
	declareFunction("clear_invalid_constants_table", "CLEAR-INVALID-CONSTANTS-TABLE", 0, 0, false);
	declareFunction("find_invalid_constant", "FIND-INVALID-CONSTANT", 1, 0, false);
	declareFunction("register_invalid_constant_by_name", "REGISTER-INVALID-CONSTANT-BY-NAME", 2, 0, false);
	declareFunction("deregister_invalid_constant_by_name", "DEREGISTER-INVALID-CONSTANT-BY-NAME", 1, 0, false);
	declareFunction("synchronize_constants_with_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-HL-STORE", 0, 0, false);
	declareFunction("synchronize_constants_with_remote_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-REMOTE-HL-STORE", 0, 0, false);
	declareFunction("synchronize_constants_with_local_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-LOCAL-HL-STORE", 0, 0, false);
	declareFunction("make_constant_shell", "MAKE-CONSTANT-SHELL", 1, 1, false);
	declareFunction("make_constant_shell_internal", "MAKE-CONSTANT-SHELL-INTERNAL", 2, 0, false);
	declareFunction("reader_make_constant_shell", "READER-MAKE-CONSTANT-SHELL", 1, 0, false);
	declareFunction("make_bogus_constant_shell", "MAKE-BOGUS-CONSTANT-SHELL", 1, 0, false);
	declareFunction("create_sample_invalid_constant", "CREATE-SAMPLE-INVALID-CONSTANT", 0, 0, false);
	declareFunction("partition_create_invalid_constant", "PARTITION-CREATE-INVALID-CONSTANT", 0, 0, false);
	declareFunction("free_all_constants", "FREE-ALL-CONSTANTS", 0, 0, false);
	declareFunction("constant_suid", "CONSTANT-SUID", 1, 0, false);
	declareFunction("install_constant_suid", "INSTALL-CONSTANT-SUID", 2, 0, false);
	declareFunction("reset_constant_suid", "RESET-CONSTANT-SUID", 2, 0, false);
	declareFunction("constant_handle_validP", "CONSTANT-HANDLE-VALID?", 1, 0, false);
	declareFunction("find_constant_by_suid", "FIND-CONSTANT-BY-SUID", 1, 0, false);
	declareFunction("setup_constant_tables", "SETUP-CONSTANT-TABLES", 2, 0, false);
	declareFunction("finalize_constants", "FINALIZE-CONSTANTS", 0, 1, false);
	declareFunction("clear_constant_tables", "CLEAR-CONSTANT-TABLES", 0, 0, false);
	declareFunction("rebuild_constant_completion_table", "REBUILD-CONSTANT-COMPLETION-TABLE", 0, 0, false);
	declareFunction("remove_invalid_constants_from_completions", "REMOVE-INVALID-CONSTANTS-FROM-COMPLETIONS", 0, 0, false);
	return NIL;
    }

    public static final SubLObject init_constant_handles_file_alt() {
	deflexical("*CONSTANT-FROM-SUID*", NIL != boundp($constant_from_suid$) ? ((SubLObject) ($constant_from_suid$.getGlobalValue())) : NIL);
	defconstant("*DTP-CONSTANT*", CONSTANT);
	deflexical("*INVALID-CONSTANTS*", NIL != boundp($invalid_constants$) ? ((SubLObject) ($invalid_constants$.getGlobalValue())) : make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED));
	return NIL;
    }

    public static SubLObject init_constant_handles_file() {
	if (SubLFiles.USE_V1) {
	    deflexical("*CONSTANT-FROM-SUID*", SubLTrampolineFile.maybeDefault($constant_from_suid$, $constant_from_suid$, NIL));
	    deflexical("*NEW-CONSTANT-SUID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_constant_suid_threshold$, $new_constant_suid_threshold$, NIL));
	    defconstant("*DTP-CONSTANT*", CONSTANT);
	    deflexical("*INVALID-CONSTANTS*", SubLTrampolineFile.maybeDefault($invalid_constants$, $invalid_constants$, () -> make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED)));
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*CONSTANT-FROM-SUID*", NIL != boundp($constant_from_suid$) ? ((SubLObject) ($constant_from_suid$.getGlobalValue())) : NIL);
	    deflexical("*INVALID-CONSTANTS*", NIL != boundp($invalid_constants$) ? ((SubLObject) ($invalid_constants$.getGlobalValue())) : make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED));
	}
	return NIL;
    }

    public static SubLObject init_constant_handles_file_Previous() {
	deflexical("*CONSTANT-FROM-SUID*", SubLTrampolineFile.maybeDefault($constant_from_suid$, $constant_from_suid$, NIL));
	deflexical("*NEW-CONSTANT-SUID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_constant_suid_threshold$, $new_constant_suid_threshold$, NIL));
	defconstant("*DTP-CONSTANT*", CONSTANT);
	deflexical("*INVALID-CONSTANTS*", SubLTrampolineFile.maybeDefault($invalid_constants$, $invalid_constants$, () -> make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED)));
	return NIL;
    }

    public static final SubLObject setup_constant_handles_file_alt() {
	declare_defglobal($constant_from_suid$);
	register_cyc_api_macro(DO_CONSTANTS, $list_alt2, $str_alt11$Iterate_over_all_HL_constant_data);
	register_macro_helper(DO_CONSTANTS_TABLE, DO_CONSTANTS);
	register_macro_helper(CREATE_CONSTANT_DUMP_ID_TABLE, WITH_CONSTANT_DUMP_ID_TABLE);
	register_cyc_api_function(CONSTANT_COUNT, NIL, $str_alt18$Return_the_total_number_of_consta, NIL, $list_alt19);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(CONSTANT_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(C_SUID, _CSETF_C_SUID);
	def_csetf(C_NAME, _CSETF_C_NAME);
	identity(CONSTANT);
	register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(SXHASH_CONSTANT_METHOD));
	register_cyc_api_function(CONSTANT_P, $list_alt51, $str_alt52$Return_T_iff_the_argument_is_a_Cy, NIL, $list_alt53);
	register_cyc_api_function($sym54$VALID_CONSTANT_, $list_alt55, $str_alt56$Return_T_if_CONSTANT_is_a_valid__, NIL, $list_alt53);
	register_obsolete_cyc_api_function(VALID_CONSTANT, $list_alt59, $list_alt55, $str_alt60$Deprecated_in_favor_of_valid_cons, NIL, $list_alt53);
	declare_defglobal($invalid_constants$);
	return NIL;
    }

    public static SubLObject setup_constant_handles_file() {
	if (SubLFiles.USE_V1) {
	    declare_defglobal($constant_from_suid$);
	    register_cyc_api_macro(DO_CONSTANTS, $list2, $str11$Iterate_over_all_HL_constant_data);
	    register_macro_helper(DO_CONSTANTS_TABLE, DO_CONSTANTS);
	    register_macro_helper(CREATE_CONSTANT_DUMP_ID_TABLE, WITH_CONSTANT_DUMP_ID_TABLE);
	    register_cyc_api_function(CONSTANT_COUNT, NIL, $str18$Return_the_total_number_of_consta, NIL, $list19);
	    declare_defglobal($new_constant_suid_threshold$);
	    note_funcall_helper_function($sym36$NEW_CONSTANTS_TABLE_ENTRY_);
	    note_funcall_helper_function(CONSTANTS_TABLE_TUPLE_TO_CONSTANT);
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(CONSTANT_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list48);
	    def_csetf(C_SUID, _CSETF_C_SUID);
	    def_csetf(C_NAME, _CSETF_C_NAME);
	    identity(CONSTANT);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CONSTANT_METHOD));
	    register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(SXHASH_CONSTANT_METHOD));
	    register_cyc_api_function(CONSTANT_P, $list65, $str66$Return_T_iff_the_argument_is_a_Cy, NIL, $list67);
	    register_cyc_api_function($sym68$VALID_CONSTANT_, $list69, $str70$Return_T_if_CONSTANT_is_a_valid__, NIL, $list67);
	    register_obsolete_cyc_api_function(VALID_CONSTANT, $list73, $list69, $str74$Deprecated_in_favor_of_valid_cons, NIL, $list67);
	    declare_defglobal($invalid_constants$);
	}
	if (SubLFiles.USE_V2) {
	    register_cyc_api_function(CONSTANT_P, $list_alt51, $str_alt52$Return_T_iff_the_argument_is_a_Cy, NIL, $list_alt53);
	    register_cyc_api_function($sym54$VALID_CONSTANT_, $list_alt55, $str_alt56$Return_T_if_CONSTANT_is_a_valid__, NIL, $list_alt53);
	    register_obsolete_cyc_api_function(VALID_CONSTANT, $list_alt59, $list_alt55, $str_alt60$Deprecated_in_favor_of_valid_cons, NIL, $list_alt53);
	}
	return NIL;
    }

    public static SubLObject setup_constant_handles_file_Previous() {
	declare_defglobal($constant_from_suid$);
	register_cyc_api_macro(DO_CONSTANTS, $list2, $str11$Iterate_over_all_HL_constant_data);
	register_macro_helper(DO_CONSTANTS_TABLE, DO_CONSTANTS);
	register_macro_helper(CREATE_CONSTANT_DUMP_ID_TABLE, WITH_CONSTANT_DUMP_ID_TABLE);
	register_cyc_api_function(CONSTANT_COUNT, NIL, $str18$Return_the_total_number_of_consta, NIL, $list19);
	declare_defglobal($new_constant_suid_threshold$);
	note_funcall_helper_function($sym36$NEW_CONSTANTS_TABLE_ENTRY_);
	note_funcall_helper_function(CONSTANTS_TABLE_TUPLE_TO_CONSTANT);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(CONSTANT_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list48);
	def_csetf(C_SUID, _CSETF_C_SUID);
	def_csetf(C_NAME, _CSETF_C_NAME);
	identity(CONSTANT);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CONSTANT_METHOD));
	register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(SXHASH_CONSTANT_METHOD));
	register_cyc_api_function(CONSTANT_P, $list65, $str66$Return_T_iff_the_argument_is_a_Cy, NIL, $list67);
	register_cyc_api_function($sym68$VALID_CONSTANT_, $list69, $str70$Return_T_if_CONSTANT_is_a_valid__, NIL, $list67);
	register_obsolete_cyc_api_function(VALID_CONSTANT, $list73, $list69, $str74$Deprecated_in_favor_of_valid_cons, NIL, $list67);
	declare_defglobal($invalid_constants$);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_constant_handles_file();
    }

    @Override
    public void initializeVariables() {
	init_constant_handles_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_constant_handles_file();
    }

    static {
    }

    public static final class $constant_native extends SubLStructNative {
	public SubLObject $suid;

	public SubLObject $name;

	private static final SubLStructDeclNative structDecl;

	public $constant_native() {
	    $constant_native.this.$suid = Lisp.NIL;
	    $constant_native.this.$name = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $constant_native.this.$suid;
	}

	@Override
	public SubLObject getField3() {
	    return $constant_native.this.$name;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return $constant_native.this.$suid = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return $constant_native.this.$name = value;
	}

	static {
	    structDecl = makeStructDeclNative($constant_native.class, CONSTANT, CONSTANT_P, $list42, $list43, new String[] { "$suid", "$name" }, $list44, $list45, PRINT_CONSTANT);
	    structDecl.setTrackStructInstance(true, -1);
	}
    }

    public static final class $constant_print_function_trampoline$BinaryFunction extends BinaryFunction {
	public $constant_print_function_trampoline$BinaryFunction() {
	    super(extractFunctionNamed("CONSTANT-PRINT-FUNCTION-TRAMPOLINE"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
	    return constant_print_function_trampoline(arg1, arg2);
	}
    }

    public static final class $constant_p$UnaryFunction extends UnaryFunction {
	public $constant_p$UnaryFunction() {
	    super(extractFunctionNamed("CONSTANT-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return constant_p(arg1);
	}
    }

    public static final class $sxhash_constant_method$UnaryFunction extends UnaryFunction {
	public $sxhash_constant_method$UnaryFunction() {
	    super(extractFunctionNamed("SXHASH-CONSTANT-METHOD"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return sxhash_constant_method(arg1);
	}
    }

    public static final class $valid_constantP$UnaryFunction extends UnaryFunction {
	public $valid_constantP$UnaryFunction() {
	    super(extractFunctionNamed("VALID-CONSTANT?"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return valid_constantP(arg1, $valid_constantP$UnaryFunction.UNPROVIDED);
	}
    }

    public static final class $valid_constantP$BinaryFunction extends BinaryFunction {
	public $valid_constantP$BinaryFunction() {
	    super(extractFunctionNamed("VALID-CONSTANT?"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
	    return valid_constantP(arg1, arg2);
	}
    }

    public static final class $invalid_constantP$UnaryFunction extends UnaryFunction {
	public $invalid_constantP$UnaryFunction() {
	    super(extractFunctionNamed("INVALID-CONSTANT?"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return invalid_constantP(arg1, $invalid_constantP$UnaryFunction.UNPROVIDED);
	}
    }

    public static final class $invalid_constantP$BinaryFunction extends BinaryFunction {
	public $invalid_constantP$BinaryFunction() {
	    super(extractFunctionNamed("INVALID-CONSTANT?"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
	    return invalid_constantP(arg1, arg2);
	}
    }
}
