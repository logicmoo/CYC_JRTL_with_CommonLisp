package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_indexing extends SubLTranslatedFile {
	public static final SubLFile me;
	public static final String myName = "com.cyc.cycjava.cycl.kb_indexing";
	public static final String myFingerPrint = "74f7ebb1dce868f3e0432f5ce53930aa1c652ec05d0194df88d0d32b1860146e";
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 719L)
	private static SubLSymbol $indexing_good_enough_threshold$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 7237L)
	private static SubLSymbol $key_gaf_arg_index_cached_caching_state$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 87278L)
	private static SubLSymbol $index_spec_preds_of_ist_in_ist_pred_indexP$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 112243L)
	private static SubLSymbol $best_gaf_lookup_index_exact_num_predicate_extent_cutoff$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 112520L)
	private static SubLSymbol $best_gaf_lookup_index_zero_num_predicate_extent_cutoff$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116053L)
	private static SubLSymbol $pred_heinous_mt_fanout_cutoff$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116111L)
	private static SubLSymbol $pred_has_heinous_mt_fanoutP_caching_state$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116305L)
	private static SubLSymbol $reindex_all_assertions_full_gc_threshhold_constant_count$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 118056L)
	private static SubLSymbol $warn_on_assertion_reindexing_errorsP$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 135056L)
	private static SubLSymbol $gathered_rule_assertions$;
	private static final SubLSymbol $sym0$INTERMEDIATE_INDEX_P;
	private static final SubLList $list1;
	private static final SubLSymbol $sym2$NON_NEGATIVE_INTEGER_P;
	private static final SubLSymbol $sym3$NUM_GAF_ARG_INDEX;
	private static final SubLList $list4;
	private static final SubLString $str5$Return_the_number_of_gafs_indexed;
	private static final SubLList $list6;
	private static final SubLSymbol $sym7$KEY_GAF_ARG_INDEX;
	private static final SubLSymbol $sym8$RELEVANT_NUM_GAF_ARG_INDEX;
	private static final SubLList $list9;
	private static final SubLString $str10$Return_the_assertion_count_at_rel;
	private static final SubLSymbol $sym11$RELEVANT_NUM_GAF_ARG_INDEX_WITH_CUTOFF;
	private static final SubLSymbol $sym12$KEY_GAF_ARG_INDEX_CACHED;
	private static final SubLSymbol $sym13$_KEY_GAF_ARG_INDEX_CACHED_CACHING_STATE_;
	private static final SubLInteger $int14$5000;
	private static final SubLSymbol $sym15$CLEAR_KEY_GAF_ARG_INDEX_CACHED;
	private static final SubLString $str16$Return_a_list_of_the_keys_to_the_;
	private static final SubLList $list17;
	private static final SubLList $list18;
	private static final SubLSymbol $kw19$GAF_ARG;
	private static final SubLSymbol $sym20$NUM_NART_ARG_INDEX;
	private static final SubLList $list21;
	private static final SubLString $str22$Return_the_number_of___termOfUnit;
	private static final SubLSymbol $sym23$RELEVANT_NUM_NART_ARG_INDEX;
	private static final SubLString $str24$Compute_the_assertion_count_at_re;
	private static final SubLSymbol $sym25$KEY_NART_ARG_INDEX;
	private static final SubLString $str26$Return_a_list_of_the_keys_to_the_;
	private static final SubLSymbol $kw27$NART_ARG;
	private static final SubLSymbol $sym28$NUM_PREDICATE_EXTENT_INDEX;
	private static final SubLList $list29;
	private static final SubLString $str30$Return_the_assertion_count_at_PRE;
	private static final SubLSymbol $sym31$KEY_PREDICATE_EXTENT_INDEX;
	private static final SubLSymbol $sym32$RELEVANT_NUM_PREDICATE_EXTENT_INDEX;
	private static final SubLList $list33;
	private static final SubLString $str34$Compute_the_assertion_count_at_re;
	private static final SubLSymbol $sym35$RELEVANT_NUM_PREDICATE_EXTENT_INDEX_WITH_CUTOFF;
	private static final SubLString $str36$Return_a_list_of_the_keys_to_the_;
	private static final SubLSymbol $kw37$PREDICATE_EXTENT;
	private static final SubLSymbol $sym38$NUM_FUNCTION_EXTENT_INDEX;
	private static final SubLList $list39;
	private static final SubLString $str40$Return_the_function_extent_of_FUN;
	private static final SubLSymbol $sym41$RELEVANT_NUM_FUNCTION_EXTENT_INDEX;
	private static final SubLString $str42$Compute_the_function_extent_at_re;
	private static final SubLSymbol $kw43$FUNCTION_EXTENT;
	private static final SubLSymbol $sym44$NUM_PREDICATE_RULE_INDEX;
	private static final SubLList $list45;
	private static final SubLString $str46$Return_the_raw_assertion_count_at;
	private static final SubLSymbol $sym47$KEY_PREDICATE_RULE_INDEX;
	private static final SubLSymbol $sym48$RELEVANT_NUM_PREDICATE_RULE_INDEX;
	private static final SubLSymbol $sym49$RELEVANT_NUM_PREDICATE_RULE_INDEX_WITH_CUTOFF;
	private static final SubLList $list50;
	private static final SubLString $str51$Return_a_list_of_the_keys_to_the_;
	private static final SubLSymbol $kw52$PREDICATE_RULE;
	private static final SubLSymbol $sym53$NUM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX;
	private static final SubLList $list54;
	private static final SubLString $str55$Return_the_raw_assertion_count_at;
	private static final SubLSymbol $sym56$KEY_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX;
	private static final SubLList $list57;
	private static final SubLString $str58$Return_a_list_of_the_keys_to_the_;
	private static final SubLSymbol $kw59$DECONTEXTUALIZED_IST_PREDICATE_RULE;
	private static final SubLSymbol $sym60$NUM_ISA_RULE_INDEX;
	private static final SubLList $list61;
	private static final SubLString $str62$Return_the_raw_assertion_count_at;
	private static final SubLSymbol $sym63$KEY_ISA_RULE_INDEX;
	private static final SubLSymbol $sym64$RELEVANT_NUM_ISA_RULE_INDEX;
	private static final SubLSymbol $sym65$RELEVANT_NUM_ISA_RULE_INDEX_WITH_CUTOFF;
	private static final SubLList $list66;
	private static final SubLString $str67$Return_a_list_of_the_keys_to_the_;
	private static final SubLSymbol $kw68$ISA_RULE;
	private static final SubLSymbol $sym69$NUM_QUOTED_ISA_RULE_INDEX;
	private static final SubLSymbol $sym70$KEY_QUOTED_ISA_RULE_INDEX;
	private static final SubLSymbol $sym71$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX;
	private static final SubLSymbol $sym72$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX_WITH_CUTOFF;
	private static final SubLSymbol $kw73$QUOTED_ISA_RULE;
	private static final SubLSymbol $sym74$NUM_GENLS_RULE_INDEX;
	private static final SubLSymbol $sym75$KEY_GENLS_RULE_INDEX;
	private static final SubLSymbol $sym76$RELEVANT_NUM_GENLS_RULE_INDEX;
	private static final SubLSymbol $sym77$RELEVANT_NUM_GENLS_RULE_INDEX_WITH_CUTOFF;
	private static final SubLSymbol $kw78$GENLS_RULE;
	private static final SubLSymbol $sym79$NUM_GENL_MT_RULE_INDEX;
	private static final SubLSymbol $sym80$KEY_GENL_MT_RULE_INDEX;
	private static final SubLSymbol $sym81$RELEVANT_NUM_GENL_MT_RULE_INDEX;
	private static final SubLSymbol $sym82$RELEVANT_NUM_GENL_MT_RULE_INDEX_WITH_CUTOFF;
	private static final SubLSymbol $kw83$GENL_MT_RULE;
	private static final SubLSymbol $sym84$NUM_FUNCTION_RULE_INDEX;
	private static final SubLList $list85;
	private static final SubLString $str86$Return_the_raw_assertion_count_at;
	private static final SubLSymbol $sym87$KEY_FUNCTION_RULE_INDEX;
	private static final SubLSymbol $sym88$RELEVANT_NUM_FUNCTION_RULE_INDEX;
	private static final SubLSymbol $sym89$RELEVANT_NUM_FUNCTION_RULE_INDEX_WITH_CUTOFF;
	private static final SubLList $list90;
	private static final SubLString $str91$Return_a_list_of_the_keys_to_the_;
	private static final SubLSymbol $kw92$FUNCTION_RULE;
	private static final SubLSymbol $sym93$NUM_EXCEPTION_RULE_INDEX;
	private static final SubLList $list94;
	private static final SubLString $str95$Return_the_raw_assertion_count_at;
	private static final SubLSymbol $sym96$KEY_EXCEPTION_RULE_INDEX;
	private static final SubLSymbol $sym97$RELEVANT_NUM_EXCEPTION_RULE_INDEX;
	private static final SubLSymbol $sym98$RELEVANT_NUM_EXCEPTION_RULE_INDEX_WITH_CUTOFF;
	private static final SubLList $list99;
	private static final SubLString $str100$Return_a_list_of_the_keys_to_the_;
	private static final SubLSymbol $kw101$EXCEPTION_RULE;
	private static final SubLSymbol $sym102$NUM_PRAGMA_RULE_INDEX;
	private static final SubLSymbol $sym103$KEY_PRAGMA_RULE_INDEX;
	private static final SubLSymbol $sym104$RELEVANT_NUM_PRAGMA_RULE_INDEX;
	private static final SubLSymbol $sym105$RELEVANT_NUM_PRAGMA_RULE_INDEX_WITH_CUTOFF;
	private static final SubLSymbol $kw106$PRAGMA_RULE;
	private static final SubLSymbol $sym107$NUM_MT_INDEX;
	private static final SubLList $list108;
	private static final SubLString $str109$Return_the_number_of_assertions_a;
	private static final SubLSymbol $kw110$MT;
	private static final SubLSymbol $kw111$BROAD_MT;
	private static final SubLString $str112$do_broad_mt_index;
	private static final SubLSymbol $sym113$STRINGP;
	private static final SubLSymbol $kw114$SKIP;
	private static final SubLInteger $int115$1000;
	private static final SubLSymbol $kw116$IST;
	private static final SubLSymbol $sym117$RELEVANT_MT_IS_EVERYTHING;
	private static final SubLObject $const118$EverythingPSC;
	private static final SubLSymbol $sym119$NUM_HLMT_INDEX;
	private static final SubLList $list120;
	private static final SubLString $str121$Return_the_number_of_assertions_a;
	private static final SubLObject $const122$BroadMicrotheory;
	private static final SubLSymbol $sym123$REM_BROAD_MT_INDEX;
	private static final SubLSymbol $sym124$NUM_OTHER_INDEX;
	private static final SubLString $str125$Return_the_number_of_assertions_a;
	private static final SubLList $list126;
	private static final SubLSymbol $sym127$FINAL_INDEX_P;
	private static final SubLSymbol $kw128$OTHER;
	private static final SubLSymbol $sym129$NUM_INDEX;
	private static final SubLString $str130$The_total_number_of_assertions_in;
	private static final SubLString $str131$Performing_indexing_cleanup___;
	private static final SubLSymbol $sym132$UNINDEXED_SYNTAX_CONSTANT_CLEANUP_ONE_INDEX;
	private static final SubLSymbol $sym133$UNINDEXED_SYNTAX_CONSTANT_INDEX_CLEANUP_INTERNAL;
	private static final SubLSymbol $sym134$INDEXED_TERM_P;
	private static final SubLSymbol $sym135$ASSERTION_MT;
	private static final SubLSymbol $sym136$ASSERTION_P;
	private static final SubLSymbol $kw137$POS;
	private static final SubLSymbol $kw138$NEG;
	private static final SubLSymbol $sym139$_;
	private static final SubLObject $const140$isa;
	private static final SubLObject $const141$genls;
	private static final SubLObject $const142$termOfUnit;
	private static final SubLString $str143$indexing_problem_while_removing__;
	private static final SubLSymbol $sym144$REMOVE_TERM_INDICES;
	private static final SubLString $str145$Remove_all_assertions_about_TERM_;
	private static final SubLList $list146;
	private static final SubLSymbol $kw147$IGNORE;
	private static final SubLSymbol $sym148$VALID_FULLY_INDEXED_TERM_P;
	private static final SubLSymbol $sym149$CDR;
	private static final SubLSymbol $sym150$_;
	private static final SubLSymbol $sym151$CAR;
	private static final SubLSymbol $sym152$FORT_P;
	private static final SubLSymbol $sym153$TERM_INDEX_SWAPPED_IN_;
	private static final SubLSymbol $sym154$POSITIVE_INTEGER_P;
	private static final SubLSymbol $sym155$FULLY_INDEXED_HLMT_TERM_P;
	private static final SubLString $str156$So_don_t_;
	private static final SubLString $str157$Don_t_know_how_to_index__S;
	private static final SubLList $list158;
	private static final SubLList $list159;
	private static final SubLSymbol $kw160$ISA;
	private static final SubLSymbol $kw161$PRED;
	private static final SubLObject $const162$quotedIsa;
	private static final SubLSymbol $kw163$QUOTED_ISA;
	private static final SubLSymbol $kw164$GENLS;
	private static final SubLObject $const165$genlMt;
	private static final SubLSymbol $kw166$GENL_MT;
	private static final SubLSymbol $kw167$FUNC;
	private static final SubLObject $const168$abnormal;
	private static final SubLSymbol $kw169$EXCEPTION;
	private static final SubLObject $const170$meetsPragmaticRequirement;
	private static final SubLSymbol $kw171$PRAGMA;
	private static final SubLSymbol $kw172$IST_PRED;
	private static final SubLSymbol $sym173$FULLY_INDEXED_TERM_P;
	private static final SubLSymbol $sym174$SECOND;
	private static final SubLList $list175;
	private static final SubLString $str176$Can_t_index_a_pragmatic_requireme;
	private static final SubLString $str177$Can_t_index_an_exception_as_a_neg;
	private static final SubLString $str178$Don_t_know_how_to_handle_indexing;
	private static final SubLList $list179;
	private static final SubLString $str180$Can_t_index_a_function_rule_as_a_;
	private static final SubLString $str181$Can_t_remove_the_index_of_a_pragm;
	private static final SubLString $str182$Can_t_remove_the_index_of_an_exce;
	private static final SubLString $str183$Can_t_remove_the_index_of_a_funct;
	private static final SubLObject $const184$ist;
	private static final SubLString $str185$Enabling_spec_preds_of_ist_indexi;
	private static final SubLString $str186$_assertions_;
	private static final SubLSymbol $kw187$RULE;
	private static final SubLSymbol $kw188$OVERLAP;
	private static final SubLSymbol $sym189$DECENT_NAT_INDEX;
	private static final SubLList $list190;
	private static final SubLSymbol $sym191$BEST_NAT_INDEX_COUNT;
	private static final SubLList $list192;
	private static final SubLSymbol $kw193$PRED_POS;
	private static final SubLSymbol $kw194$IST_PRED_POS;
	private static final SubLSymbol $kw195$ISA_POS;
	private static final SubLSymbol $kw196$QUOTED_ISA_POS;
	private static final SubLSymbol $kw197$GENLS_POS;
	private static final SubLSymbol $kw198$GENL_MT_POS;
	private static final SubLSymbol $kw199$PRED_NEG;
	private static final SubLSymbol $kw200$IST_PRED_NEG;
	private static final SubLSymbol $kw201$ISA_NEG;
	private static final SubLSymbol $kw202$QUOTED_ISA_NEG;
	private static final SubLSymbol $kw203$GENLS_NEG;
	private static final SubLSymbol $kw204$GENL_MT_NEG;
	private static final SubLList $list205;
	private static final SubLList $list206;
	private static final SubLSymbol $kw207$INDEX_TYPE;
	private static final SubLSymbol $kw208$PREDICATE;
	private static final SubLSymbol $kw209$TERM;
	private static final SubLSymbol $kw210$ARGNUM;
	private static final SubLSymbol $kw211$TERMS;
	private static final SubLInteger $int212$500;
	private static final SubLString $str213$__slow_overlap___S_for__S__;
	private static final SubLSymbol $kw214$FUNCTOR;
	private static final SubLInteger $int215$212;
	private static final SubLInteger $int216$2120;
	private static final SubLInteger $int217$100;
	private static final SubLSymbol $sym218$PRED_HAS_HEINOUS_MT_FANOUT_;
	private static final SubLSymbol $sym219$_PRED_HAS_HEINOUS_MT_FANOUT__CACHING_STATE_;
	private static final SubLInteger $int220$10000;
	private static final SubLString $str221$Reindexing_assertions;
	private static final SubLString $str222$Clearing_Assertion_indexing;
	private static final SubLString $str223$Clear_unrepresented_terms_table;
	private static final SubLString $str224$Clear_auxiliary_indexing;
	private static final SubLSymbol $kw225$CLEARED;
	private static final SubLString $str226$Clearing_FORT_indexing;
	private static final SubLString $str227$Clearing_Unrepresented_Term_index;
	private static final SubLSymbol $sym228$CATCH_ERROR_MESSAGE_HANDLER;
	private static final SubLSymbol $kw229$IGNORE_ERRORS_TARGET;
	private static final SubLSymbol $sym230$IGNORE_ERRORS_HANDLER;
	private static final SubLString $str231$Error_when_indexing_assertion__A_;
	private static final SubLSymbol $sym232$INDEX_LEAF_COUNT;
	private static final SubLString $str233$Unexpected_index__S_when_merging_;
	private static final SubLSymbol $sym234$CNF_P;
	private static final SubLSymbol $sym235$POSSIBLY_HLMT_P;
	private static final SubLSymbol $sym236$FIND_ASSERTION;
	private static final SubLList $list237;
	private static final SubLString $str238$Find_the_assertion_in_MT_with_CNF;
	private static final SubLList $list239;
	private static final SubLList $list240;
	private static final SubLSymbol $sym241$RELEVANT_MT_IS_EQ;
	private static final SubLSymbol $sym242$FIND_ASSERTION_ANY_MT;
	private static final SubLList $list243;
	private static final SubLString $str244$Find_any_assertion_in_any_mt_with;
	private static final SubLList $list245;
	private static final SubLSymbol $sym246$FIND_ALL_ASSERTIONS;
	private static final SubLString $str247$Return_all_assertions_that_have_C;
	private static final SubLList $list248;
	private static final SubLSymbol $sym249$EL_FORMULA_P;
	private static final SubLSymbol $sym250$HLMT_P;
	private static final SubLSymbol $sym251$FIND_GAF;
	private static final SubLList $list252;
	private static final SubLString $str253$Find_the_assertion_in_MT_with_GAF;
	private static final SubLList $list254;
	private static final SubLSymbol $sym255$FIND_GAF_ANY_MT;
	private static final SubLList $list256;
	private static final SubLString $str257$Find_any_assertion_in_any_mt_with;
	private static final SubLList $list258;
	private static final SubLSymbol $sym259$RELEVANT_MT_IS_GENL_MT;
	private static final SubLSymbol $sym260$FIND_ALL_GAFS;
	private static final SubLString $str261$Return_all_assertions_of_GAF_FORM;
	private static final SubLList $list262;
	private static final SubLSymbol $kw263$MAPPING_DONE;
	private static final SubLSymbol $sym264$FIND_CNF_INTERNAL;
	private static final SubLSymbol $kw265$GAF;
	private static final SubLSymbol $kw266$CUTOFF;
	private static final SubLSymbol $sym267$_EXIT;
	private static final SubLSymbol $sym268$ASSERTION_EL_FORMULA;
	private static final SubLSymbol $sym269$GATHER_ONE_RULE_ASSERTION;
	private static final SubLList $list270;
	private static final SubLObject $const271$implies;

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 815L)
	public static SubLObject get_subindex(final SubLObject v_term, final SubLObject keys) {
		SubLObject subindex = kb_indexing_datastructures.term_index(v_term);
		SubLObject cdolist_list_var = keys;
		SubLObject key = (SubLObject) kb_indexing.NIL;
		key = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (kb_indexing.NIL != key && kb_indexing.NIL != subindex) {
				subindex = kb_indexing_datastructures.intermediate_index_lookup(subindex, key);
			}
			cdolist_list_var = cdolist_list_var.rest();
			key = cdolist_list_var.first();
		}
		return subindex;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 1173L)
	public static SubLObject term_add_indexing_leaf(final SubLObject v_term, final SubLObject keys,
			final SubLObject leaf) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = (SubLObject) kb_indexing.NIL;
		final SubLObject index = kb_indexing_datastructures.term_index(v_term);
		mark_term_index_as_muted(v_term);
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			result = simple_indexing.add_simple_index_to_term_assertion_list(v_term, index, leaf);
		} else {
			final SubLObject _prev_bind_0 = kb_indexing_datastructures.$current_complex_index_term$
					.currentBinding(thread);
			final SubLObject _prev_bind_2 = kb_indexing_datastructures.$current_complex_index_keys$
					.currentBinding(thread);
			try {
				kb_indexing_datastructures.$current_complex_index_term$.bind(v_term, thread);
				kb_indexing_datastructures.$current_complex_index_keys$.bind(keys, thread);
				result = kb_indexing_datastructures.intermediate_index_insert(index, keys, leaf);
			} finally {
				kb_indexing_datastructures.$current_complex_index_keys$.rebind(_prev_bind_2, thread);
				kb_indexing_datastructures.$current_complex_index_term$.rebind(_prev_bind_0, thread);
			}
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 1995L)
	public static SubLObject term_rem_indexing_leaf(final SubLObject v_term, final SubLObject keys,
			final SubLObject leaf) {
		SubLObject result = (SubLObject) kb_indexing.NIL;
		final SubLObject index = kb_indexing_datastructures.term_index(v_term);
		mark_term_index_as_muted(v_term);
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			result = simple_indexing.rem_simple_index_from_term_assertion_list(v_term, index, leaf);
		} else {
			kb_indexing_datastructures.intermediate_index_delete(index, keys, leaf);
			simple_indexing.possibly_toggle_term_index_mode(v_term);
			result = leaf;
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 2727L)
	public static SubLObject all_mt_subindex_keys_relevant_p() {
		return mt_relevance_macros.any_or_all_mts_are_relevantP();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 2835L)
	public static SubLObject relevant_mt_subindex_count(final SubLObject mt_subindex) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert kb_indexing.NIL != kb_indexing_datastructures.intermediate_index_p(mt_subindex) : mt_subindex;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return kb_indexing_datastructures.subindex_leaf_count(mt_subindex);
		}
		if (kb_indexing.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
			final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
			final SubLObject subindex = kb_indexing_datastructures.subindex_lookup(mt_subindex, mt);
			return (SubLObject) ((kb_indexing.NIL != subindex)
					? kb_indexing_datastructures.subindex_leaf_count(subindex) : kb_indexing.ZERO_INTEGER);
		}
		SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p(mt_subindex)) {
			final SubLObject iterator = map_utilities
					.new_map_iterator(kb_indexing_datastructures.intermediate_index_map(mt_subindex));
			SubLObject valid;
			for (SubLObject done_var = (SubLObject) kb_indexing.NIL; kb_indexing.NIL == done_var; done_var = (SubLObject) SubLObjectFactory
					.makeBoolean(kb_indexing.NIL == valid)) {
				thread.resetMultipleValues();
				final SubLObject var = iteration.iteration_next(iterator);
				valid = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (kb_indexing.NIL != valid) {
					SubLObject current;
					final SubLObject datum = current = var;
					SubLObject mt2 = (SubLObject) kb_indexing.NIL;
					SubLObject subindex2 = (SubLObject) kb_indexing.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list1);
					mt2 = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list1);
					subindex2 = current.first();
					current = current.rest();
					if (kb_indexing.NIL == current) {
						if (kb_indexing.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
							count = Numbers.add(count, kb_indexing_datastructures.subindex_leaf_count(subindex2));
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list1);
					}
				}
			}
		}
		return count;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 3592L)
	public static SubLObject relevant_mt_subindex_count_with_cutoff(final SubLObject mt_subindex,
			final SubLObject cutoff) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert kb_indexing.NIL != kb_indexing_datastructures.intermediate_index_p(mt_subindex) : mt_subindex;
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return Numbers.min(cutoff, kb_indexing_datastructures.subindex_leaf_count(mt_subindex));
		}
		if (kb_indexing.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
			final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
			final SubLObject subindex = kb_indexing_datastructures.subindex_lookup(mt_subindex, mt);
			return (SubLObject) ((kb_indexing.NIL != subindex)
					? Numbers.min(cutoff, kb_indexing_datastructures.subindex_leaf_count(subindex))
					: kb_indexing.ZERO_INTEGER);
		}
		SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
		SubLObject doneP = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p(mt_subindex)) {
			final SubLObject iterator = map_utilities
					.new_map_iterator(kb_indexing_datastructures.intermediate_index_map(mt_subindex));
			SubLObject valid;
			for (SubLObject done_var = doneP; kb_indexing.NIL == done_var; done_var = (SubLObject) SubLObjectFactory
					.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != doneP)) {
				thread.resetMultipleValues();
				final SubLObject var = iteration.iteration_next(iterator);
				valid = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (kb_indexing.NIL != valid) {
					SubLObject current;
					final SubLObject datum = current = var;
					SubLObject mt2 = (SubLObject) kb_indexing.NIL;
					SubLObject subindex2 = (SubLObject) kb_indexing.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list1);
					mt2 = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list1);
					subindex2 = current.first();
					current = current.rest();
					if (kb_indexing.NIL == current) {
						if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(count, cutoff)) {
							doneP = (SubLObject) kb_indexing.T;
						} else if (kb_indexing.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
							count = Numbers.add(count, kb_indexing_datastructures.subindex_leaf_count(subindex2));
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list1);
					}
				}
			}
		}
		return Numbers.min(cutoff, count);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 4432L)
	public static SubLObject relevant_mt_subindex_keys(final SubLObject mt_subindex) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert kb_indexing.NIL != kb_indexing_datastructures.intermediate_index_p(mt_subindex) : mt_subindex;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return kb_indexing_datastructures.intermediate_index_keys(mt_subindex);
		}
		if (kb_indexing.NIL != mt_relevance_macros.only_specified_mt_is_relevantP()) {
			final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
			final SubLObject subindex = kb_indexing_datastructures.subindex_lookup(mt_subindex, mt);
			return (SubLObject) ((kb_indexing.NIL != subindex) ? ConsesLow.list(mt) : kb_indexing.NIL);
		}
		SubLObject relevant_mts = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p(mt_subindex)) {
			final SubLObject iterator = map_utilities
					.new_map_iterator(kb_indexing_datastructures.intermediate_index_map(mt_subindex));
			SubLObject valid;
			for (SubLObject done_var = (SubLObject) kb_indexing.NIL; kb_indexing.NIL == done_var; done_var = (SubLObject) SubLObjectFactory
					.makeBoolean(kb_indexing.NIL == valid)) {
				thread.resetMultipleValues();
				final SubLObject var = iteration.iteration_next(iterator);
				valid = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (kb_indexing.NIL != valid) {
					SubLObject current;
					final SubLObject datum = current = var;
					SubLObject mt2 = (SubLObject) kb_indexing.NIL;
					SubLObject subindex2 = (SubLObject) kb_indexing.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list1);
					mt2 = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list1);
					subindex2 = current.first();
					current = current.rest();
					if (kb_indexing.NIL == current) {
						if (kb_indexing.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
							relevant_mts = (SubLObject) ConsesLow.cons(mt2, relevant_mts);
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list1);
					}
				}
			}
		}
		return relevant_mts;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 5058L)
	public static SubLObject mark_term_index_as_muted(final SubLObject v_term) {
		if (kb_indexing.NIL != constant_handles.constant_p(v_term)) {
			final SubLObject id = constant_handles.constant_suid(v_term);
			if (kb_indexing.NIL != id) {
				return constant_index_manager.mark_constant_index_as_muted(id);
			}
		} else if (kb_indexing.NIL != nart_handles.nart_p(v_term)) {
			final SubLObject id = nart_handles.nart_id(v_term);
			if (kb_indexing.NIL != id) {
				return nart_index_manager.mark_nart_index_as_muted(id);
			}
		} else if (kb_indexing.NIL != unrepresented_terms.kb_unrepresented_term_p(v_term)) {
			final SubLObject id = unrepresented_terms.unrepresented_term_suid(v_term);
			if (kb_indexing.NIL != id) {
				return unrepresented_term_index_manager.mark_unrepresented_term_index_as_muted(id);
			}
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 5679L)
	public static SubLObject num_gaf_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject pred,
			SubLObject mt) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (pred == kb_indexing.UNPROVIDED) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_gaf_arg_index(ass, v_term, argnum, pred, mt)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_gaf_arg_subindex(v_term, argnum, pred, mt);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 6189L)
	public static SubLObject relevant_num_gaf_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject pred) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (pred == kb_indexing.UNPROVIDED) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_gaf_arg_index(v_term, argnum, pred, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_gaf_arg_index(ass, v_term, argnum, pred,
						(SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(argnum, pred,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.THREE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_gaf_arg_subindex(v_term, argnum, pred,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, argnum, pred,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym7$KEY_GAF_ARG_INDEX, v_term, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num, Functions.apply((SubLObject) kb_indexing.$sym8$RELEVANT_NUM_GAF_ARG_INDEX,
							v_term, ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 6646L)
	public static SubLObject relevant_num_gaf_arg_index_with_cutoff(final SubLObject v_term, final SubLObject cutoff,
			SubLObject argnum, SubLObject pred) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (pred == kb_indexing.UNPROVIDED) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_gaf_arg_index(v_term, argnum, pred, (SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_gaf_arg_index(ass, v_term, argnum, pred,
								(SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(argnum, pred,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.THREE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_gaf_arg_subindex(v_term, argnum, pred,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, argnum, pred,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym7$KEY_GAF_ARG_INDEX, v_term, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					SubLObject args2 = ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key));
					SubLObject[] args = new SubLObject[] { cutoff,
							args2 };
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym11$RELEVANT_NUM_GAF_ARG_INDEX_WITH_CUTOFF,

									v_term, args));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 7237L)
	public static SubLObject clear_key_gaf_arg_index_cached() {
		final SubLObject cs = kb_indexing.$key_gaf_arg_index_cached_caching_state$.getGlobalValue();
		if (kb_indexing.NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 7237L)
	public static SubLObject remove_key_gaf_arg_index_cached(final SubLObject v_term, SubLObject argnum,
			SubLObject pred) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (pred == kb_indexing.UNPROVIDED) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		return memoization_state.caching_state_remove_function_results_with_args(
				kb_indexing.$key_gaf_arg_index_cached_caching_state$.getGlobalValue(),
				(SubLObject) ConsesLow.list(v_term, argnum, pred), (SubLObject) kb_indexing.UNPROVIDED,
				(SubLObject) kb_indexing.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 7237L)
	public static SubLObject key_gaf_arg_index_cached_internal(final SubLObject v_term, final SubLObject argnum,
			final SubLObject pred) {
		return key_gaf_arg_index(v_term, argnum, pred);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 7237L)
	public static SubLObject key_gaf_arg_index_cached(final SubLObject v_term, SubLObject argnum, SubLObject pred) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (pred == kb_indexing.UNPROVIDED) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		SubLObject caching_state = kb_indexing.$key_gaf_arg_index_cached_caching_state$.getGlobalValue();
		if (kb_indexing.NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(
					(SubLObject) kb_indexing.$sym12$KEY_GAF_ARG_INDEX_CACHED,
					(SubLObject) kb_indexing.$sym13$_KEY_GAF_ARG_INDEX_CACHED_CACHING_STATE_,
					(SubLObject) kb_indexing.$int14$5000, (SubLObject) kb_indexing.EQ,
					(SubLObject) kb_indexing.THREE_INTEGER, (SubLObject) kb_indexing.ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(
					(SubLObject) kb_indexing.$sym15$CLEAR_KEY_GAF_ARG_INDEX_CACHED);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, argnum, pred);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash,
				(SubLObject) kb_indexing.UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = (SubLObject) kb_indexing.NIL;
			collision = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = conses_high.second(collision);
				if (v_term.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (argnum.eql(cached_args.first())) {
						cached_args = cached_args.rest();
						if (kb_indexing.NIL != cached_args && kb_indexing.NIL == cached_args.rest()
								&& pred.eql(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = Values.arg2(Values.resetMultipleValues(),
				(SubLObject) Values.multiple_value_list(key_gaf_arg_index_cached_internal(v_term, argnum, pred)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3,
				(SubLObject) ConsesLow.list(v_term, argnum, pred));
		return memoization_state.caching_results(results3);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 7707L)
	public static SubLObject key_gaf_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject pred) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (pred == kb_indexing.UNPROVIDED) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_gaf_arg_index(ass, keys_accum, v_term, argnum, pred);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_gaf_arg_subindex(v_term, argnum, pred,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 8162L)
	public static SubLObject gaf_arg_indices(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject predicate_subindices = (SubLObject) kb_indexing.NIL;
		final SubLObject index = kb_indexing_macros.term_gaf_arg_index(v_term);
		if (kb_indexing.NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p(index)) {
			final SubLObject iterator = map_utilities
					.new_map_iterator(kb_indexing_datastructures.intermediate_index_map(index));
			SubLObject valid;
			for (SubLObject done_var = (SubLObject) kb_indexing.NIL; kb_indexing.NIL == done_var; done_var = (SubLObject) SubLObjectFactory
					.makeBoolean(kb_indexing.NIL == valid)) {
				thread.resetMultipleValues();
				final SubLObject var = iteration.iteration_next(iterator);
				valid = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (kb_indexing.NIL != valid) {
					SubLObject current;
					final SubLObject datum = current = var;
					SubLObject argnum = (SubLObject) kb_indexing.NIL;
					SubLObject pred_subindex = (SubLObject) kb_indexing.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list18);
					argnum = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list18);
					pred_subindex = current.first();
					current = current.rest();
					if (kb_indexing.NIL == current) {
						if (kb_indexing.NIL != kb_indexing_macros.valid_gaf_arg_index_keyP(argnum)) {
							predicate_subindices = (SubLObject) ConsesLow.cons(pred_subindex, predicate_subindices);
						}
					} else {
						cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list18);
					}
				}
			}
		}
		return predicate_subindices;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 8559L)
	public static SubLObject preds_from_gafs_mentioning_term_at_argnum_with_relevant_mt(final SubLObject v_term,
			SubLObject argnum) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL != argnum) {
			return relevant_key_gaf_arg_index(v_term, argnum, (SubLObject) kb_indexing.UNPROVIDED);
		}
		final SubLObject argnums = argnums_from_gafs_mentioning_term_with_relevant_mt(v_term);
		final SubLObject pred_set = set.new_set(Symbols.symbol_function((SubLObject) kb_indexing.EQL),
				(SubLObject) kb_indexing.UNPROVIDED);
		SubLObject cdolist_list_var = argnums;
		SubLObject argindex = (SubLObject) kb_indexing.NIL;
		argindex = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			set_utilities.set_add_all(preds_from_gafs_mentioning_term_at_argnum_with_relevant_mt(v_term, argindex),
					pred_set);
			cdolist_list_var = cdolist_list_var.rest();
			argindex = cdolist_list_var.first();
		}
		return set.set_element_list(pred_set);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 9010L)
	public static SubLObject argnums_from_gafs_mentioning_term_with_relevant_mt(final SubLObject v_term) {
		return relevant_key_gaf_arg_index(v_term, (SubLObject) kb_indexing.UNPROVIDED,
				(SubLObject) kb_indexing.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 9127L)
	public static SubLObject relevant_key_gaf_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject pred) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (pred == kb_indexing.UNPROVIDED) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_gaf_arg_index(v_term, argnum, pred);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_gaf_arg_index(ass, v_term, argnum, pred,
						(SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_gaf_arg_index(ass, keys_accum, v_term, argnum, pred);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(argnum, pred,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.THREE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_gaf_arg_subindex(v_term, argnum, pred,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, argnum, pred,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym7$KEY_GAF_ARG_INDEX, v_term, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym8$RELEVANT_NUM_GAF_ARG_INDEX, v_term,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 9527L)
	public static SubLObject mts_gaf_arg_index(final SubLObject v_term, final SubLObject argnum, final SubLObject pred,
			SubLObject accumulator) {
		if (accumulator == kb_indexing.UNPROVIDED) {
			accumulator = (SubLObject) kb_indexing.NIL;
		}
		final SubLObject keys = key_gaf_arg_index(v_term, argnum, pred);
		accumulator = conses_high.union(keys, accumulator, (SubLObject) kb_indexing.UNPROVIDED,
				(SubLObject) kb_indexing.UNPROVIDED);
		return accumulator;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 9992L)
	public static SubLObject gaf_arg_index_key_validator(final SubLObject v_term, SubLObject argnum,
			SubLObject predicate, SubLObject mt) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (predicate == kb_indexing.UNPROVIDED) {
			predicate = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		return (SubLObject) SubLObjectFactory
				.makeBoolean(
						kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(v_term)
								&& (kb_indexing.NIL == argnum
										|| kb_indexing.NIL != subl_promotions.positive_integer_p(argnum))
								&& (kb_indexing.NIL == predicate || kb_indexing.NIL != forts.fort_p(predicate))
								&& (kb_indexing.NIL == mt || kb_indexing.NIL != hlmt.hlmt_p(mt)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 10584L)
	public static SubLObject get_gaf_arg_subindex(final SubLObject v_term, SubLObject argnum, SubLObject pred,
			SubLObject mt) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (pred == kb_indexing.UNPROVIDED) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(v_term,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw19$GAF_ARG, argnum, pred, mt));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 10918L)
	public static SubLObject add_gaf_arg_index(final SubLObject v_term, final SubLObject argnum, final SubLObject pred,
			final SubLObject mt, final SubLObject assertion) {
		return term_add_indexing_leaf(v_term,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw19$GAF_ARG, argnum, pred, mt), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 11087L)
	public static SubLObject rem_gaf_arg_index(final SubLObject v_term, final SubLObject argnum, final SubLObject pred,
			final SubLObject mt, final SubLObject assertion) {
		return term_rem_indexing_leaf(v_term,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw19$GAF_ARG, argnum, pred, mt), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 11234L)
	public static SubLObject num_nart_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject func) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (func == kb_indexing.UNPROVIDED) {
			func = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_nart_arg_index(ass, v_term, argnum, func)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_nart_arg_subindex(v_term, argnum, func);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 11747L)
	public static SubLObject relevant_num_nart_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject func) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (func == kb_indexing.UNPROVIDED) {
			func = (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL != mt_relevance_macros.relevant_mtP(mt_vars.$tou_mt$.getGlobalValue())) {
			return num_nart_arg_index(v_term, argnum, func);
		}
		return (SubLObject) kb_indexing.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 12287L)
	public static SubLObject relevant_num_nart_arg_index_with_cutoff(final SubLObject v_term, final SubLObject cutoff,
			SubLObject argnum, SubLObject func) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (func == kb_indexing.UNPROVIDED) {
			func = (SubLObject) kb_indexing.NIL;
		}
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		return Numbers.min(cutoff, relevant_num_nart_arg_index(v_term, argnum, func));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 12774L)
	public static SubLObject key_nart_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject func) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (func == kb_indexing.UNPROVIDED) {
			func = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_nart_arg_index(ass, keys_accum, v_term, argnum, func);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_nart_arg_subindex(v_term, argnum, func);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 13210L)
	public static SubLObject relevant_key_nart_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject func) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (func == kb_indexing.UNPROVIDED) {
			func = (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL == mt_relevance_macros.relevant_mtP(mt_vars.$tou_mt$.getGlobalValue())) {
			return (SubLObject) kb_indexing.NIL;
		}
		return key_nart_arg_index(v_term, argnum, func);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 13547L)
	public static SubLObject mts_nart_arg_index(final SubLObject v_term, final SubLObject argnum, final SubLObject func,
			SubLObject accumulator) {
		if (accumulator == kb_indexing.UNPROVIDED) {
			accumulator = (SubLObject) kb_indexing.NIL;
		}
		final SubLObject keys = key_nart_arg_index(v_term, argnum, func);
		accumulator = conses_high.union(keys, accumulator, (SubLObject) kb_indexing.UNPROVIDED,
				(SubLObject) kb_indexing.UNPROVIDED);
		return accumulator;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 13894L)
	public static SubLObject get_nart_arg_subindex(final SubLObject v_term, SubLObject argnum, SubLObject func) {
		if (argnum == kb_indexing.UNPROVIDED) {
			argnum = (SubLObject) kb_indexing.NIL;
		}
		if (func == kb_indexing.UNPROVIDED) {
			func = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(v_term, (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw27$NART_ARG, argnum, func));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 14116L)
	public static SubLObject add_nart_arg_index(final SubLObject v_term, final SubLObject argnum, final SubLObject func,
			final SubLObject assertion) {
		return term_add_indexing_leaf(v_term,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw27$NART_ARG, argnum, func), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 14281L)
	public static SubLObject rem_nart_arg_index(final SubLObject v_term, final SubLObject argnum, final SubLObject func,
			final SubLObject assertion) {
		return term_rem_indexing_leaf(v_term,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw27$NART_ARG, argnum, func), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 14424L)
	public static SubLObject num_predicate_extent_index(final SubLObject pred, SubLObject mt) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_predicate_extent_index(ass, pred, mt)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_predicate_extent_subindex(pred, mt);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 14925L)
	public static SubLObject relevant_num_predicate_extent_index(final SubLObject pred) {
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_predicate_extent_index(pred, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_predicate_extent_index(ass, pred,
						(SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_predicate_extent_subindex(pred, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym31$KEY_PREDICATE_EXTENT_INDEX, pred, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym32$RELEVANT_NUM_PREDICATE_EXTENT_INDEX, pred,
									ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 15352L)
	public static SubLObject relevant_num_predicate_extent_index_with_cutoff(final SubLObject pred,
			final SubLObject cutoff) {
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_predicate_extent_index(pred, (SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_predicate_extent_index(ass, pred,
								(SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_predicate_extent_subindex(pred, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym31$KEY_PREDICATE_EXTENT_INDEX, pred, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					SubLObject[] args = new SubLObject[] { cutoff,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) };
					num = Numbers.add(num,
							Functions.apply(
									(SubLObject) kb_indexing.$sym35$RELEVANT_NUM_PREDICATE_EXTENT_INDEX_WITH_CUTOFF,
									pred, args));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 15925L)
	public static SubLObject no_predicate_extent_p(final SubLObject pred) {
		return Numbers.zerop(num_predicate_extent_index(pred, (SubLObject) kb_indexing.UNPROVIDED));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 16212L)
	public static SubLObject key_predicate_extent_index(final SubLObject pred) {
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_predicate_extent_index(ass, keys_accum, pred);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_predicate_extent_subindex(pred,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 16631L)
	public static SubLObject relevant_key_predicate_extent_index(final SubLObject pred) {
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_predicate_extent_index(pred);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_predicate_extent_index(ass, pred,
						(SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_predicate_extent_index(ass, keys_accum, pred);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_predicate_extent_subindex(pred, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym31$KEY_PREDICATE_EXTENT_INDEX, pred, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym32$RELEVANT_NUM_PREDICATE_EXTENT_INDEX, pred,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 17021L)
	public static SubLObject predicate_extent_top_level_key() {
		return (SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 17113L)
	public static SubLObject add_predicate_extent_index(final SubLObject pred, final SubLObject mt,
			final SubLObject assertion) {
		return term_add_indexing_leaf(pred, (SubLObject) ConsesLow.list(predicate_extent_top_level_key(), mt),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 17269L)
	public static SubLObject rem_predicate_extent_index(final SubLObject pred, final SubLObject mt,
			final SubLObject assertion) {
		return term_rem_indexing_leaf(pred, (SubLObject) ConsesLow.list(predicate_extent_top_level_key(), mt),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 17425L)
	public static SubLObject get_predicate_extent_subindex(final SubLObject pred, SubLObject mt) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(pred, (SubLObject) ConsesLow.list(predicate_extent_top_level_key(), mt));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 17806L)
	public static SubLObject num_function_extent_index(final SubLObject func) {
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(func)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(func);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_function_extent_index(ass, func)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_function_extent_subindex(func);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 18279L)
	public static SubLObject relevant_num_function_extent_index(final SubLObject func) {
		if (kb_indexing.NIL != mt_relevance_macros.relevant_mtP(mt_vars.$tou_mt$.getGlobalValue())) {
			return num_function_extent_index(func);
		}
		return (SubLObject) kb_indexing.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 18789L)
	public static SubLObject relevant_num_function_extent_index_with_cutoff(final SubLObject func,
			final SubLObject cutoff) {
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		return Numbers.min(cutoff, relevant_num_function_extent_index(func));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 19396L)
	public static SubLObject get_function_extent_subindex(final SubLObject func) {
		return get_subindex(func, (SubLObject) ConsesLow.list(function_extent_top_level_key()));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 19747L)
	public static SubLObject add_function_extent_index(final SubLObject func, final SubLObject assertion) {
		return term_add_indexing_leaf(func, (SubLObject) ConsesLow.list(function_extent_top_level_key()), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 19917L)
	public static SubLObject rem_function_extent_index(final SubLObject func, final SubLObject assertion) {
		return term_rem_indexing_leaf(func, (SubLObject) ConsesLow.list(function_extent_top_level_key()), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 20065L)
	public static SubLObject function_extent_top_level_key() {
		return (SubLObject) kb_indexing.$kw43$FUNCTION_EXTENT;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 20141L)
	public static SubLObject num_predicate_rule_index(final SubLObject pred, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_predicate_rule_index(ass, pred, sense, mt, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_predicate_rule_subindex(pred, sense, mt, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 20698L)
	public static SubLObject relevant_num_predicate_rule_index(final SubLObject pred, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_predicate_rule_index(pred, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_predicate_rule_index(ass, pred, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_predicate_rule_subindex(pred, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym47$KEY_PREDICATE_RULE_INDEX, pred, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym48$RELEVANT_NUM_PREDICATE_RULE_INDEX, pred,
									ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 21130L)
	public static SubLObject relevant_num_predicate_rule_index_with_cutoff(final SubLObject pred,
			final SubLObject cutoff, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_predicate_rule_index(pred, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_predicate_rule_index(ass, pred, sense,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_predicate_rule_subindex(pred, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym47$KEY_PREDICATE_RULE_INDEX, pred, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply(
									(SubLObject) kb_indexing.$sym49$RELEVANT_NUM_PREDICATE_RULE_INDEX_WITH_CUTOFF, pred,
									new SubLObject[] { cutoff,
											ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) }));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 21785L)
	public static SubLObject key_predicate_rule_index(final SubLObject pred, SubLObject sense, SubLObject mt) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_predicate_rule_index(ass, keys_accum, pred, sense, mt);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_predicate_rule_subindex(pred, sense, mt,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 22227L)
	public static SubLObject relevant_key_predicate_rule_index(final SubLObject pred, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_predicate_rule_index(pred, sense, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_predicate_rule_index(ass, pred, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_predicate_rule_index(ass, keys_accum, pred, sense,
							(SubLObject) kb_indexing.UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_predicate_rule_subindex(pred, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym47$KEY_PREDICATE_RULE_INDEX, pred, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym48$RELEVANT_NUM_PREDICATE_RULE_INDEX, pred,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 22673L)
	public static SubLObject get_predicate_rule_subindex(final SubLObject pred, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(pred,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw52$PREDICATE_RULE, sense, mt, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 23001L)
	public static SubLObject add_predicate_rule_index(final SubLObject pred, final SubLObject sense,
			final SubLObject mt, final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(pred,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw52$PREDICATE_RULE, sense, mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 23319L)
	public static SubLObject rem_predicate_rule_index(final SubLObject pred, final SubLObject sense,
			final SubLObject mt, final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(pred,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw52$PREDICATE_RULE, sense, mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 23615L)
	public static SubLObject num_decontextualized_ist_predicate_rule_index(final SubLObject pred, SubLObject sense,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_decontextualized_ist_predicate_rule_index(ass, pred,
						sense, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_decontextualized_ist_predicate_rule_subindex(pred, sense, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 24286L)
	public static SubLObject key_decontextualized_ist_predicate_rule_index(final SubLObject pred, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(pred)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_decontextualized_ist_predicate_rule_index(ass, keys_accum, pred,
						sense);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_decontextualized_ist_predicate_rule_subindex(pred, sense,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 24779L)
	public static SubLObject get_decontextualized_ist_predicate_rule_subindex(final SubLObject pred, SubLObject sense,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(pred, (SubLObject) ConsesLow
				.list((SubLObject) kb_indexing.$kw59$DECONTEXTUALIZED_IST_PREDICATE_RULE, sense, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 25164L)
	public static SubLObject add_decontextualized_ist_predicate_rule_index(final SubLObject pred,
			final SubLObject sense, final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(pred, (SubLObject) ConsesLow
				.list((SubLObject) kb_indexing.$kw59$DECONTEXTUALIZED_IST_PREDICATE_RULE, sense, direction), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 25539L)
	public static SubLObject rem_decontextualized_ist_predicate_rule_index(final SubLObject pred,
			final SubLObject sense, final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(pred, (SubLObject) ConsesLow
				.list((SubLObject) kb_indexing.$kw59$DECONTEXTUALIZED_IST_PREDICATE_RULE, sense, direction), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 25892L)
	public static SubLObject num_isa_rule_index(final SubLObject col, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_isa_rule_index(ass, col, sense, mt, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_isa_rule_subindex(col, sense, mt, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 26409L)
	public static SubLObject relevant_num_isa_rule_index(final SubLObject col, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_isa_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_isa_rule_index(ass, col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_isa_rule_subindex(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym63$KEY_ISA_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num, Functions.apply((SubLObject) kb_indexing.$sym64$RELEVANT_NUM_ISA_RULE_INDEX,
							col, ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 26770L)
	public static SubLObject relevant_num_isa_rule_index_with_cutoff(final SubLObject col, final SubLObject cutoff,
			SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_isa_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_isa_rule_index(ass, col, sense,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_isa_rule_subindex(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym63$KEY_ISA_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym65$RELEVANT_NUM_ISA_RULE_INDEX_WITH_CUTOFF,
									col, new SubLObject[] { cutoff,
											ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) }));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 27347L)
	public static SubLObject key_isa_rule_index(final SubLObject col, SubLObject sense, SubLObject mt) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_isa_rule_index(ass, keys_accum, col, sense, mt);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_isa_rule_subindex(col, sense, mt,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 27767L)
	public static SubLObject relevant_key_isa_rule_index(final SubLObject col, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_isa_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_isa_rule_index(ass, col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_isa_rule_index(ass, keys_accum, col, sense,
							(SubLObject) kb_indexing.UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_isa_rule_subindex(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym63$KEY_ISA_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym64$RELEVANT_NUM_ISA_RULE_INDEX, col,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 28142L)
	public static SubLObject get_isa_rule_subindex(final SubLObject col, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw68$ISA_RULE, sense, mt, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 28450L)
	public static SubLObject add_isa_rule_index(final SubLObject col, final SubLObject sense, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw68$ISA_RULE, sense, mt, direction), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 28748L)
	public static SubLObject rem_isa_rule_index(final SubLObject col, final SubLObject sense, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw68$ISA_RULE, sense, mt, direction), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 29024L)
	public static SubLObject num_quoted_isa_rule_index(final SubLObject col, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_quoted_isa_rule_index(ass, col, sense, mt, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_quoted_isa_rule_subindex(col, sense, mt, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 29569L)
	public static SubLObject relevant_num_quoted_isa_rule_index(final SubLObject col, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_quoted_isa_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_quoted_isa_rule_index(ass, col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_quoted_isa_rule_subindex(col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym70$KEY_QUOTED_ISA_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym71$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX, col,
									ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 29951L)
	public static SubLObject relevant_num_quoted_isa_rule_index_with_cutoff(final SubLObject col,
			final SubLObject cutoff, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_quoted_isa_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_quoted_isa_rule_index(ass, col, sense,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_quoted_isa_rule_subindex(col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym70$KEY_QUOTED_ISA_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply(
									(SubLObject) kb_indexing.$sym72$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX_WITH_CUTOFF, col,
									new SubLObject[] { cutoff,
											ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) }));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 30549L)
	public static SubLObject key_quoted_isa_rule_index(final SubLObject col, SubLObject sense, SubLObject mt) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_quoted_isa_rule_index(ass, keys_accum, col, sense, mt);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_quoted_isa_rule_subindex(col, sense, mt,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 30990L)
	public static SubLObject relevant_key_quoted_isa_rule_index(final SubLObject col, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_quoted_isa_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_quoted_isa_rule_index(ass, col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_quoted_isa_rule_index(ass, keys_accum, col, sense,
							(SubLObject) kb_indexing.UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_quoted_isa_rule_subindex(col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym70$KEY_QUOTED_ISA_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym71$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX, col,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 31386L)
	public static SubLObject get_quoted_isa_rule_subindex(final SubLObject col, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw73$QUOTED_ISA_RULE, sense, mt, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 31715L)
	public static SubLObject add_quoted_isa_rule_index(final SubLObject col, final SubLObject sense,
			final SubLObject mt, final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw73$QUOTED_ISA_RULE, sense, mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 32034L)
	public static SubLObject rem_quoted_isa_rule_index(final SubLObject col, final SubLObject sense,
			final SubLObject mt, final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw73$QUOTED_ISA_RULE, sense, mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 32331L)
	public static SubLObject num_genls_rule_index(final SubLObject col, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_genls_rule_index(ass, col, sense, mt, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_genls_rule_subindex(col, sense, mt, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 32860L)
	public static SubLObject relevant_num_genls_rule_index(final SubLObject col, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_genls_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_genls_rule_index(ass, col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_genls_rule_subindex(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym75$KEY_GENLS_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym76$RELEVANT_NUM_GENLS_RULE_INDEX, col,
									ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 33227L)
	public static SubLObject relevant_num_genls_rule_index_with_cutoff(final SubLObject col, final SubLObject cutoff,
			SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_genls_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_genls_rule_index(ass, col, sense,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_genls_rule_subindex(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym75$KEY_GENLS_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym77$RELEVANT_NUM_GENLS_RULE_INDEX_WITH_CUTOFF,
									col, new SubLObject[] { cutoff,
											ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) }));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 33810L)
	public static SubLObject key_genls_rule_index(final SubLObject col, SubLObject sense, SubLObject mt) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_genls_rule_index(ass, keys_accum, col, sense, mt);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_genls_rule_subindex(col, sense, mt,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 34236L)
	public static SubLObject relevant_key_genls_rule_index(final SubLObject col, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_genls_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_genls_rule_index(ass, col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_genls_rule_index(ass, keys_accum, col, sense,
							(SubLObject) kb_indexing.UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_genls_rule_subindex(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym75$KEY_GENLS_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym76$RELEVANT_NUM_GENLS_RULE_INDEX, col,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 34617L)
	public static SubLObject get_genls_rule_subindex(final SubLObject col, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw78$GENLS_RULE, sense, mt, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 34931L)
	public static SubLObject add_genls_rule_index(final SubLObject col, final SubLObject sense, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw78$GENLS_RULE, sense, mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 35235L)
	public static SubLObject rem_genls_rule_index(final SubLObject col, final SubLObject sense, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw78$GENLS_RULE, sense, mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 35517L)
	public static SubLObject num_genl_mt_rule_index(final SubLObject col, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_genl_mt_rule_index(ass, col, sense, mt, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_genl_mt_rule_subindex(col, sense, mt, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 36055L)
	public static SubLObject relevant_num_genl_mt_rule_index(final SubLObject col, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_genl_mt_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_genl_mt_rule_index(ass, col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_genl_mt_rule_subindex(col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym80$KEY_GENL_MT_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym81$RELEVANT_NUM_GENL_MT_RULE_INDEX, col,
									ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 36428L)
	public static SubLObject relevant_num_genl_mt_rule_index_with_cutoff(final SubLObject col, final SubLObject cutoff,
			SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_genl_mt_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_genl_mt_rule_index(ass, col, sense,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_genl_mt_rule_subindex(col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym80$KEY_GENL_MT_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym82$RELEVANT_NUM_GENL_MT_RULE_INDEX_WITH_CUTOFF,
									col, new SubLObject[] { cutoff,
											ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) }));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 37017L)
	public static SubLObject key_genl_mt_rule_index(final SubLObject col, SubLObject sense, SubLObject mt) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_genl_mt_rule_index(ass, keys_accum, col, sense, mt);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_genl_mt_rule_subindex(col, sense, mt,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 37449L)
	public static SubLObject relevant_key_genl_mt_rule_index(final SubLObject col, SubLObject sense) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_genl_mt_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(col)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_genl_mt_rule_index(ass, col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_genl_mt_rule_index(ass, keys_accum, col, sense,
							(SubLObject) kb_indexing.UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.TWO_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_genl_mt_rule_subindex(col, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count, sense,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym80$KEY_GENL_MT_RULE_INDEX, col, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym81$RELEVANT_NUM_GENL_MT_RULE_INDEX, col,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 37836L)
	public static SubLObject get_genl_mt_rule_subindex(final SubLObject col, SubLObject sense, SubLObject mt,
			SubLObject direction) {
		if (sense == kb_indexing.UNPROVIDED) {
			sense = (SubLObject) kb_indexing.NIL;
		}
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw83$GENL_MT_RULE, sense, mt, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 38156L)
	public static SubLObject add_genl_mt_rule_index(final SubLObject col, final SubLObject sense, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw83$GENL_MT_RULE, sense, mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 38341L)
	public static SubLObject rem_genl_mt_rule_index(final SubLObject col, final SubLObject sense, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(col,
				(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw83$GENL_MT_RULE, sense, mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 38504L)
	public static SubLObject num_function_rule_index(final SubLObject func, SubLObject mt, SubLObject direction) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(func)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(func);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_function_rule_index(ass, func, mt, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_function_rule_subindex(func, mt, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 39031L)
	public static SubLObject relevant_num_function_rule_index(final SubLObject func) {
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_function_rule_index(func, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(func)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(func);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_function_rule_index(ass, func,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_function_rule_subindex(func, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym87$KEY_FUNCTION_RULE_INDEX, func, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym88$RELEVANT_NUM_FUNCTION_RULE_INDEX, func,
									ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 39381L)
	public static SubLObject relevant_num_function_rule_index_with_cutoff(final SubLObject func,
			final SubLObject cutoff) {
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_function_rule_index(func, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(func)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(func);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_function_rule_index(ass, func,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_function_rule_subindex(func, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym87$KEY_FUNCTION_RULE_INDEX, func, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply(
									(SubLObject) kb_indexing.$sym89$RELEVANT_NUM_FUNCTION_RULE_INDEX_WITH_CUTOFF, func,
									new SubLObject[] { cutoff,
											ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) }));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 39948L)
	public static SubLObject key_function_rule_index(final SubLObject func, SubLObject mt) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(func)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(func);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_function_rule_index(ass, keys_accum, func, mt);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_function_rule_subindex(func, mt,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 40363L)
	public static SubLObject relevant_key_function_rule_index(final SubLObject func) {
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_function_rule_index(func, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(func)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(func);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_function_rule_index(ass, func,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_function_rule_index(ass, keys_accum, func,
							(SubLObject) kb_indexing.UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_function_rule_subindex(func, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym87$KEY_FUNCTION_RULE_INDEX, func, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym88$RELEVANT_NUM_FUNCTION_RULE_INDEX, func,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 40728L)
	public static SubLObject get_function_rule_subindex(final SubLObject func, SubLObject mt, SubLObject direction) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(func, (SubLObject) ConsesLow.list(function_rule_top_level_key(), mt, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 41056L)
	public static SubLObject add_function_rule_index(final SubLObject func, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(func, (SubLObject) ConsesLow.list(function_rule_top_level_key(), mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 41240L)
	public static SubLObject rem_function_rule_index(final SubLObject func, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(func, (SubLObject) ConsesLow.list(function_rule_top_level_key(), mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 41410L)
	public static SubLObject function_rule_top_level_key() {
		return (SubLObject) kb_indexing.$kw92$FUNCTION_RULE;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 41482L)
	public static SubLObject num_exception_rule_index(final SubLObject rule, SubLObject mt, SubLObject direction) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_exception_rule_index(ass, rule, mt, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_exception_rule_subindex(rule, mt, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 42015L)
	public static SubLObject relevant_num_exception_rule_index(final SubLObject rule) {
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_exception_rule_index(rule, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_exception_rule_index(ass, rule,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_exception_rule_subindex(rule, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym96$KEY_EXCEPTION_RULE_INDEX, rule, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym97$RELEVANT_NUM_EXCEPTION_RULE_INDEX, rule,
									ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 42369L)
	public static SubLObject relevant_num_exception_rule_index_with_cutoff(final SubLObject rule,
			final SubLObject cutoff) {
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_exception_rule_index(rule, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_exception_rule_index(ass, rule,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_exception_rule_subindex(rule, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym96$KEY_EXCEPTION_RULE_INDEX, rule, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply(
									(SubLObject) kb_indexing.$sym98$RELEVANT_NUM_EXCEPTION_RULE_INDEX_WITH_CUTOFF, rule,
									new SubLObject[] { cutoff,
											ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) }));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 42939L)
	public static SubLObject key_exception_rule_index(final SubLObject rule, SubLObject mt) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_exception_rule_index(ass, keys_accum, rule, mt);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_exception_rule_subindex(rule, mt,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 43357L)
	public static SubLObject relevant_key_exception_rule_index(final SubLObject rule) {
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_exception_rule_index(rule, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_exception_rule_index(ass, rule,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_exception_rule_index(ass, keys_accum, rule,
							(SubLObject) kb_indexing.UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_exception_rule_subindex(rule, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym96$KEY_EXCEPTION_RULE_INDEX, rule, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym97$RELEVANT_NUM_EXCEPTION_RULE_INDEX, rule,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 43724L)
	public static SubLObject exception_rule_top_level_key() {
		return (SubLObject) kb_indexing.$kw101$EXCEPTION_RULE;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 43945L)
	public static SubLObject get_exception_rule_subindex(final SubLObject rule, SubLObject mt, SubLObject direction) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(rule, (SubLObject) ConsesLow.list(exception_rule_top_level_key(), mt, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 44262L)
	public static SubLObject add_exception_rule_index(final SubLObject rule, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(rule, (SubLObject) ConsesLow.list(exception_rule_top_level_key(), mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 44583L)
	public static SubLObject rem_exception_rule_index(final SubLObject rule, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(rule, (SubLObject) ConsesLow.list(exception_rule_top_level_key(), mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 44882L)
	public static SubLObject num_pragma_rule_index(final SubLObject rule, SubLObject mt, SubLObject direction) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_pragma_rule_index(ass, rule, mt, direction)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_pragma_rule_subindex(rule, mt, direction);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 45564L)
	public static SubLObject relevant_num_pragma_rule_index(final SubLObject rule) {
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_pragma_rule_index(rule, (SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_pragma_rule_index(ass, rule,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_pragma_rule_subindex(rule, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym103$KEY_PRAGMA_RULE_INDEX, rule, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym104$RELEVANT_NUM_PRAGMA_RULE_INDEX, rule,
									ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 45909L)
	public static SubLObject relevant_num_pragma_rule_index_with_cutoff(final SubLObject rule,
			final SubLObject cutoff) {
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			num = num_pragma_rule_index(rule, (SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)) {
				num = cutoff;
			}
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff)
						&& kb_indexing.NIL != simple_indexing.matches_pragma_rule_index(ass, rule,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_pragma_rule_subindex(rule, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym103$KEY_PRAGMA_RULE_INDEX, rule, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					num = Numbers.add(num,
							Functions.apply((SubLObject) kb_indexing.$sym105$RELEVANT_NUM_PRAGMA_RULE_INDEX_WITH_CUTOFF,
									rule, new SubLObject[] { cutoff,
											ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key)) }));
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 46470L)
	public static SubLObject key_pragma_rule_index(final SubLObject rule, SubLObject mt) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				keys_accum = simple_indexing.simple_key_pragma_rule_index(ass, keys_accum, rule, mt);
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject next_level_subindex = get_pragma_rule_subindex(rule, mt,
					(SubLObject) kb_indexing.UNPROVIDED);
			keys = (SubLObject) ((kb_indexing.NIL != kb_indexing_datastructures
					.intermediate_index_p(next_level_subindex))
							? kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)
							: kb_indexing.NIL);
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 46879L)
	public static SubLObject relevant_key_pragma_rule_index(final SubLObject rule) {
		SubLObject keys = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			keys = key_pragma_rule_index(rule, (SubLObject) kb_indexing.UNPROVIDED);
		} else if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(rule)) {
			SubLObject keys_accum = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_pragma_rule_index(ass, rule,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					keys_accum = simple_indexing.simple_key_pragma_rule_index(ass, keys_accum, rule,
							(SubLObject) kb_indexing.UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			keys = keys_accum;
		} else {
			final SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			if (good_key_count.numE(
					Numbers.subtract((SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ONE_INTEGER))) {
				final SubLObject mt_subindex = get_pragma_rule_subindex(rule, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != mt_subindex) {
					keys = relevant_mt_subindex_keys(mt_subindex);
				}
			} else {
				final SubLObject good_keys = kb_indexing_macros.list_of_first_n_args(good_key_count,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject cdolist_list_var2;
				final SubLObject next_level_keys = cdolist_list_var2 = Functions
						.apply((SubLObject) kb_indexing.$sym103$KEY_PRAGMA_RULE_INDEX, rule, good_keys);
				SubLObject next_key = (SubLObject) kb_indexing.NIL;
				next_key = cdolist_list_var2.first();
				while (kb_indexing.NIL != cdolist_list_var2) {
					if (Functions.apply((SubLObject) kb_indexing.$sym104$RELEVANT_NUM_PRAGMA_RULE_INDEX, rule,
							ConsesLow.append(good_keys, (SubLObject) ConsesLow.list(next_key))).isPositive()) {
						keys = (SubLObject) ConsesLow.cons(next_key, keys);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					next_key = cdolist_list_var2.first();
				}
			}
		}
		return keys;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 47237L)
	public static SubLObject pragma_rule_top_level_key() {
		return (SubLObject) kb_indexing.$kw106$PRAGMA_RULE;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 47449L)
	public static SubLObject get_pragma_rule_subindex(final SubLObject rule, SubLObject mt, SubLObject direction) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		if (direction == kb_indexing.UNPROVIDED) {
			direction = (SubLObject) kb_indexing.NIL;
		}
		return get_subindex(rule, (SubLObject) ConsesLow.list(pragma_rule_top_level_key(), mt, direction));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 47757L)
	public static SubLObject add_pragma_rule_index(final SubLObject rule, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_add_indexing_leaf(rule, (SubLObject) ConsesLow.list(pragma_rule_top_level_key(), mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 48069L)
	public static SubLObject rem_pragma_rule_index(final SubLObject rule, final SubLObject mt,
			final SubLObject direction, final SubLObject assertion) {
		return term_rem_indexing_leaf(rule, (SubLObject) ConsesLow.list(pragma_rule_top_level_key(), mt, direction),
				assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 48359L)
	public static SubLObject num_mt_index(final SubLObject v_term) {
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_mt_index(ass, v_term)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_mt_subindex(v_term);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 48794L)
	public static SubLObject relevant_num_mt_index(final SubLObject v_term) {
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return num_mt_index(v_term);
		}
		final SubLObject mt_count = num_mt_index(v_term);
		if (mt_count.isPositive() && kb_indexing.NIL != mt_relevance_macros.relevant_mtP(v_term)) {
			return mt_count;
		}
		return (SubLObject) kb_indexing.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 49239L)
	public static SubLObject relevant_num_mt_index_with_cutoff(final SubLObject v_term, final SubLObject cutoff) {
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return Numbers.min(cutoff, num_mt_index(v_term));
		}
		final SubLObject mt_count = num_mt_index(v_term);
		if (mt_count.isPositive() && kb_indexing.NIL != mt_relevance_macros.relevant_mtP(v_term)) {
			return Numbers.min(cutoff, mt_count);
		}
		return (SubLObject) kb_indexing.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 49907L)
	public static SubLObject num_mt_contents(final SubLObject mt) {
		if (kb_indexing.NIL != fort_types_interface.broad_microtheory_p(mt)) {
			return count_mt_contents(mt);
		}
		return num_mt_index(mt);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 50145L)
	public static SubLObject count_mt_contents(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject total = (SubLObject) kb_indexing.ZERO_INTEGER;
		final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
		if (pcase_var.eql((SubLObject) kb_indexing.$kw110$MT)) {
			if (kb_indexing.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject) kb_indexing.NIL)) {
				final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
				SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
				try {
					final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
							(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL);
					SubLObject done_var = (SubLObject) kb_indexing.NIL;
					final SubLObject token_var = (SubLObject) kb_indexing.NIL;
					while (kb_indexing.NIL == done_var) {
						final SubLObject assertion = iteration
								.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
						final SubLObject valid = (SubLObject) SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
						if (kb_indexing.NIL != valid) {
							total = Numbers.add(total, (SubLObject) kb_indexing.ONE_INTEGER);
						}
						done_var = (SubLObject) SubLObjectFactory.makeBoolean(kb_indexing.NIL == valid);
					}
				} finally {
					final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
						final SubLObject _values = Values.getValuesAsVector();
						if (kb_indexing.NIL != final_index_iterator) {
							kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
						}
						Values.restoreValuesFromVector(_values);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
					}
				}
			}
		} else if (pcase_var.eql((SubLObject) kb_indexing.$kw111$BROAD_MT) && kb_indexing.NIL != kb_mapping_macros
				.do_broad_mt_index_key_validator(mt, (SubLObject) kb_indexing.NIL)) {
			final SubLObject idx = assertion_handles.do_assertions_table();
			final SubLObject mess = (SubLObject) kb_indexing.$str112$do_broad_mt_index;
			final SubLObject total_$1 = id_index.id_index_count(idx);
			SubLObject sofar = (SubLObject) kb_indexing.ZERO_INTEGER;
			assert kb_indexing.NIL != Types.stringp(mess) : mess;
			final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
			final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
			final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
			final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
			try {
				utilities_macros.$last_percent_progress_index$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
				utilities_macros.$last_percent_progress_prediction$.bind((SubLObject) kb_indexing.NIL, thread);
				utilities_macros.$within_noting_percent_progress$.bind((SubLObject) kb_indexing.T, thread);
				utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
				try {
					utilities_macros.noting_percent_progress_preamble(mess);
					final SubLObject idx_$2 = idx;
					if (kb_indexing.NIL == id_index.id_index_objects_empty_p(idx_$2,
							(SubLObject) kb_indexing.$kw114$SKIP)) {
						final SubLObject idx_$3 = idx_$2;
						if (kb_indexing.NIL == id_index.id_index_dense_objects_empty_p(idx_$3,
								(SubLObject) kb_indexing.$kw114$SKIP)) {
							final SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
							final SubLObject backwardP_var = (SubLObject) kb_indexing.NIL;
							SubLObject length;
							SubLObject v_iteration;
							SubLObject a_id;
							SubLObject a_handle;
							SubLObject assertion2;
							for (length = Sequences
									.length(vector_var), v_iteration = (SubLObject) kb_indexing.NIL, v_iteration = (SubLObject) kb_indexing.ZERO_INTEGER; v_iteration
											.numL(length); v_iteration = Numbers.add(v_iteration,
													(SubLObject) kb_indexing.ONE_INTEGER)) {
								a_id = ((kb_indexing.NIL != backwardP_var)
										? Numbers.subtract(length, v_iteration, (SubLObject) kb_indexing.ONE_INTEGER)
										: v_iteration);
								a_handle = Vectors.aref(vector_var, a_id);
								if (kb_indexing.NIL == id_index.id_index_tombstone_p(a_handle)
										|| kb_indexing.NIL == id_index
												.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) {
									if (kb_indexing.NIL != id_index.id_index_tombstone_p(a_handle)) {
										a_handle = (SubLObject) kb_indexing.$kw114$SKIP;
									}
									assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
									if (kb_indexing.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt,
											(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL)) {
										total = Numbers.add(total, (SubLObject) kb_indexing.ONE_INTEGER);
									}
									sofar = Numbers.add(sofar, (SubLObject) kb_indexing.ONE_INTEGER);
									utilities_macros.note_percent_progress(sofar, total_$1);
								}
							}
						}
						final SubLObject idx_$4 = idx_$2;
						if (kb_indexing.NIL == id_index.id_index_sparse_objects_empty_p(idx_$4)
								|| kb_indexing.NIL == id_index
										.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) {
							final SubLObject sparse = id_index.id_index_sparse_objects(idx_$4);
							SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$4);
							final SubLObject end_id = id_index.id_index_next_id(idx_$4);
							final SubLObject v_default = (SubLObject) ((kb_indexing.NIL != id_index
									.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) ? kb_indexing.NIL
											: kb_indexing.$kw114$SKIP);
							while (a_id2.numL(end_id)) {
								final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse,
										v_default);
								if (kb_indexing.NIL == id_index
										.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)
										|| kb_indexing.NIL == id_index.id_index_tombstone_p(a_handle2)) {
									final SubLObject assertion3 = assertion_handles
											.resolve_assertion_id_value_pair(a_id2, a_handle2);
									if (kb_indexing.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt,
											(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL)) {
										total = Numbers.add(total, (SubLObject) kb_indexing.ONE_INTEGER);
									}
									sofar = Numbers.add(sofar, (SubLObject) kb_indexing.ONE_INTEGER);
									utilities_macros.note_percent_progress(sofar, total_$1);
								}
								a_id2 = Numbers.add(a_id2, (SubLObject) kb_indexing.ONE_INTEGER);
							}
						}
					}
				} finally {
					final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
						final SubLObject _values2 = Values.getValuesAsVector();
						utilities_macros.noting_percent_progress_postamble();
						Values.restoreValuesFromVector(_values2);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
					}
				}
			} finally {
				utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
				utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
				utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
				utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
			}
		}
		return total;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 50333L)
	public static SubLObject estimated_num_mt_contents(final SubLObject mt, SubLObject sample_size) {
		if (sample_size == kb_indexing.UNPROVIDED) {
			sample_size = (SubLObject) kb_indexing.$int115$1000;
		}
		if (kb_indexing.NIL != fort_types_interface.broad_microtheory_p(mt)) {
			return estimated_count_mt_contents(mt, sample_size);
		}
		return num_mt_index(mt);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 50670L)
	public static SubLObject estimated_count_mt_contents(final SubLObject mt, SubLObject sample_size) {
		if (sample_size == kb_indexing.UNPROVIDED) {
			sample_size = (SubLObject) kb_indexing.$int115$1000;
		}
		final SubLObject sample = assertions_high.sample_assertions(sample_size, (SubLObject) kb_indexing.NIL,
				(SubLObject) kb_indexing.UNPROVIDED);
		final SubLObject total_assertions = assertion_handles.assertion_count();
		SubLObject samples_in_mt = (SubLObject) kb_indexing.ZERO_INTEGER;
		SubLObject cdolist_list_var = sample;
		SubLObject assertion = (SubLObject) kb_indexing.NIL;
		assertion = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (kb_indexing.NIL != assertions_high.assertion_has_mtP(assertion, mt)) {
				samples_in_mt = Numbers.add(samples_in_mt, (SubLObject) kb_indexing.ONE_INTEGER);
			}
			cdolist_list_var = cdolist_list_var.rest();
			assertion = cdolist_list_var.first();
		}
		return Numbers.integerDivide(Numbers.multiply(total_assertions, samples_in_mt), sample_size);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 51110L)
	public static SubLObject get_mt_subindex(final SubLObject v_term) {
		return kb_indexing_datastructures.term_complex_index_lookup(v_term, mt_top_level_key());
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 51345L)
	public static SubLObject add_mt_index(final SubLObject v_term, final SubLObject assertion) {
		if (kb_indexing.NIL == broad_mtP(v_term)) {
			add_mt_index_internal(v_term, assertion);
		}
		return assertion;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 51620L)
	public static SubLObject rem_mt_index(final SubLObject v_term, final SubLObject assertion) {
		if (kb_indexing.NIL == broad_mtP(v_term)) {
			rem_mt_index_internal(v_term, assertion);
		}
		return assertion;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 51873L)
	public static SubLObject add_mt_index_internal(final SubLObject v_term, final SubLObject assertion) {
		return term_add_indexing_leaf(v_term, (SubLObject) ConsesLow.list(mt_top_level_key()), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 52172L)
	public static SubLObject rem_mt_index_internal(final SubLObject v_term, final SubLObject assertion) {
		return term_rem_indexing_leaf(v_term, (SubLObject) ConsesLow.list(mt_top_level_key()), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 52465L)
	public static SubLObject mt_top_level_key() {
		return (SubLObject) kb_indexing.$kw116$IST;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 52635L)
	public static SubLObject num_hlmt_index(final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING,
					thread);
			mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
			SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list_utilities.flatten(mt),
					(SubLObject) kb_indexing.UNPROVIDED);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(ass), mt)) {
					num = Numbers.add(num, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 53097L)
	public static SubLObject relevant_num_hlmt_index(final SubLObject v_term) {
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return num_hlmt_index(v_term);
		}
		final SubLObject mt_count = num_hlmt_index(v_term);
		if (mt_count.isPositive() && kb_indexing.NIL != mt_relevance_macros.relevant_mtP(v_term)) {
			return mt_count;
		}
		return (SubLObject) kb_indexing.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 53550L)
	public static SubLObject broad_mtP(final SubLObject mt) {
		final SubLObject monad = hlmt.hlmt_monad_mt(mt);
		SubLObject result = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != forts.fort_p(monad)) {
			result = fort_types_interface.broad_microtheory_p(monad);
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 53945L)
	public static SubLObject broad_mt_index_cleanup() {
		if (kb_indexing.NIL != constant_handles.valid_constantP(kb_indexing.$const122$BroadMicrotheory,
				(SubLObject) kb_indexing.UNPROVIDED)) {
			SubLObject cdolist_list_var = get_broad_mts_for_index_cleanup();
			SubLObject broad_mt = (SubLObject) kb_indexing.NIL;
			broad_mt = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != forts.fort_p(broad_mt)) {
					rem_broad_mt_index(broad_mt);
				}
				cdolist_list_var = cdolist_list_var.rest();
				broad_mt = cdolist_list_var.first();
			}
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 54302L)
	public static SubLObject get_broad_mts_for_index_cleanup() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject broad_mts = (SubLObject) kb_indexing.NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING,
					thread);
			mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
			broad_mts = isa.all_instances_via_indexing(kb_indexing.$const122$BroadMicrotheory,
					(SubLObject) kb_indexing.UNPROVIDED);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return broad_mts;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 54487L)
	public static SubLObject rem_broad_mt_index(final SubLObject v_term) {
		if (kb_indexing.NIL == kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			final SubLObject index = kb_indexing_datastructures.term_index(v_term);
			kb_indexing_datastructures.intermediate_index_delete_key(kb_indexing_datastructures.term_index(v_term),
					mt_top_level_key());
			kb_indexing_datastructures.intermediate_index_leaf_count_reset(index,
					Sequences.length(kb_indexing_datastructures.intermediate_index_leaves(index)));
		}
		return v_term;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 55079L)
	public static SubLObject num_other_index(final SubLObject v_term) {
		SubLObject num = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_other_index(ass, v_term)) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			num = count;
		} else {
			final SubLObject subindex = get_other_subindex(v_term);
			num = (SubLObject) ((kb_indexing.NIL != subindex) ? kb_indexing_datastructures.subindex_leaf_count(subindex)
					: kb_indexing.ZERO_INTEGER);
		}
		return num;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 55546L)
	public static SubLObject relevant_num_other_index(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return num_other_index(v_term);
		}
		SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != simple_indexing.matches_other_index(ass, v_term)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
		} else {
			final SubLObject final_index = get_other_subindex(v_term);
			if (kb_indexing.NIL != final_index) {
				final SubLObject index = final_index;
				if (kb_indexing.NIL != index) {
					if (kb_indexing.NIL != kb_indexing_datastructures.final_unified_index_p(index)) {
						final SubLObject set_var = kb_indexing_datastructures.final_unified_index_set(index);
						final SubLObject set_contents_var = set.do_set_internal(set_var);
						SubLObject basis_object;
						SubLObject state;
						SubLObject ass2;
						for (basis_object = set_contents.do_set_contents_basis_object(
								set_contents_var), state = (SubLObject) kb_indexing.NIL, state = set_contents
										.do_set_contents_initial_state(basis_object,
												set_contents_var); kb_indexing.NIL == set_contents
														.do_set_contents_doneP(basis_object,
																state); state = set_contents
																		.do_set_contents_update_state(state)) {
							ass2 = set_contents.do_set_contents_next(basis_object, state);
							if (kb_indexing.NIL != set_contents.do_set_contents_element_validP(state, ass2)
									&& kb_indexing.NIL != mt_relevance_macros
											.relevant_mtP(assertions_high.assertion_mt(ass2))) {
								count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
							}
						}
					} else if (kb_indexing.NIL != kb_indexing_datastructures.final_sharded_index_p(index)) {
						final SubLObject iterator = map_utilities
								.new_map_iterator(kb_indexing_datastructures.final_sharded_index_shard_map(index));
						SubLObject valid;
						for (SubLObject done_var = (SubLObject) kb_indexing.NIL; kb_indexing.NIL == done_var; done_var = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid)) {
							thread.resetMultipleValues();
							final SubLObject var = iteration.iteration_next(iterator);
							valid = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (kb_indexing.NIL != valid) {
								SubLObject current;
								final SubLObject datum = current = var;
								SubLObject ignored_key = (SubLObject) kb_indexing.NIL;
								SubLObject shard = (SubLObject) kb_indexing.NIL;
								cdestructuring_bind.destructuring_bind_must_consp(current, datum,
										(SubLObject) kb_indexing.$list126);
								ignored_key = current.first();
								current = current.rest();
								cdestructuring_bind.destructuring_bind_must_consp(current, datum,
										(SubLObject) kb_indexing.$list126);
								shard = current.first();
								current = current.rest();
								if (kb_indexing.NIL == current) {
									final SubLObject set_contents_var2 = set.do_set_internal(shard);
									SubLObject basis_object2;
									SubLObject state2;
									SubLObject ass3;
									for (basis_object2 = set_contents.do_set_contents_basis_object(
											set_contents_var2), state2 = (SubLObject) kb_indexing.NIL, state2 = set_contents
													.do_set_contents_initial_state(basis_object2,
															set_contents_var2); kb_indexing.NIL == set_contents
																	.do_set_contents_doneP(basis_object2,
																			state2); state2 = set_contents
																					.do_set_contents_update_state(
																							state2)) {
										ass3 = set_contents.do_set_contents_next(basis_object2, state2);
										if (kb_indexing.NIL != set_contents.do_set_contents_element_validP(state2, ass3)
												&& kb_indexing.NIL != mt_relevance_macros
														.relevant_mtP(assertions_high.assertion_mt(ass3))) {
											count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
										}
									}
								} else {
									cdestructuring_bind.cdestructuring_bind_error(datum,
											(SubLObject) kb_indexing.$list126);
								}
							}
						}
					} else if (kb_indexing.NIL != kb_indexing_datastructures.final_topn_index_p(index)) {
						final SubLObject iterator_var = kb_indexing_datastructures.new_final_topn_index_iterator(index);
						SubLObject valid;
						for (SubLObject done_var = (SubLObject) kb_indexing.NIL; kb_indexing.NIL == done_var; done_var = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid)) {
							thread.resetMultipleValues();
							final SubLObject ass4 = iteration.iteration_next(iterator_var);
							valid = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (kb_indexing.NIL != valid && kb_indexing.NIL != mt_relevance_macros
									.relevant_mtP(assertions_high.assertion_mt(ass4))) {
								count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
							}
						}
					} else {
						enforceType(index, kb_indexing.$sym127$FINAL_INDEX_P);
					}
				}
			}
		}
		return count;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 56316L)
	public static SubLObject relevant_num_other_index_with_cutoff(final SubLObject v_term, final SubLObject cutoff) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert kb_indexing.NIL != subl_promotions.non_negative_integer_p(cutoff) : cutoff;
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return Numbers.min(cutoff, num_other_index(v_term));
		}
		SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
		SubLObject doneP = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject rest;
			SubLObject ass;
			for (rest = (SubLObject) kb_indexing.NIL, rest = kb_indexing_datastructures
					.do_simple_index_term_assertion_list(v_term); kb_indexing.NIL == doneP
							&& kb_indexing.NIL != rest; rest = rest.rest()) {
				ass = rest.first();
				if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(count, cutoff)) {
					doneP = (SubLObject) kb_indexing.T;
				} else if (kb_indexing.NIL != simple_indexing.matches_other_index(ass, v_term)
						&& kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
			}
		} else {
			final SubLObject final_index = get_other_subindex(v_term);
			if (kb_indexing.NIL != final_index) {
				final SubLObject index = final_index;
				if (kb_indexing.NIL != index) {
					if (kb_indexing.NIL != kb_indexing_datastructures.final_unified_index_p(index)) {
						final SubLObject set_var = kb_indexing_datastructures.final_unified_index_set(index);
						final SubLObject set_contents_var = set.do_set_internal(set_var);
						SubLObject basis_object;
						SubLObject state;
						SubLObject ass2;
						for (basis_object = set_contents.do_set_contents_basis_object(
								set_contents_var), state = (SubLObject) kb_indexing.NIL, state = set_contents
										.do_set_contents_initial_state(basis_object,
												set_contents_var); kb_indexing.NIL == doneP
														&& kb_indexing.NIL == set_contents.do_set_contents_doneP(
																basis_object, state); state = set_contents
																		.do_set_contents_update_state(state)) {
							ass2 = set_contents.do_set_contents_next(basis_object, state);
							if (kb_indexing.NIL != set_contents.do_set_contents_element_validP(state, ass2)) {
								if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(count, cutoff)) {
									doneP = (SubLObject) kb_indexing.T;
								} else if (kb_indexing.NIL != mt_relevance_macros
										.relevant_mtP(assertions_high.assertion_mt(ass2))) {
									count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
								}
							}
						}
					} else if (kb_indexing.NIL != kb_indexing_datastructures.final_sharded_index_p(index)) {
						final SubLObject iterator = map_utilities
								.new_map_iterator(kb_indexing_datastructures.final_sharded_index_shard_map(index));
						SubLObject valid;
						for (SubLObject done_var = doneP; kb_indexing.NIL == done_var; done_var = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != doneP)) {
							thread.resetMultipleValues();
							final SubLObject var = iteration.iteration_next(iterator);
							valid = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (kb_indexing.NIL != valid) {
								SubLObject current;
								final SubLObject datum = current = var;
								SubLObject ignored_key = (SubLObject) kb_indexing.NIL;
								SubLObject shard = (SubLObject) kb_indexing.NIL;
								cdestructuring_bind.destructuring_bind_must_consp(current, datum,
										(SubLObject) kb_indexing.$list126);
								ignored_key = current.first();
								current = current.rest();
								cdestructuring_bind.destructuring_bind_must_consp(current, datum,
										(SubLObject) kb_indexing.$list126);
								shard = current.first();
								current = current.rest();
								if (kb_indexing.NIL == current) {
									final SubLObject set_contents_var2 = set.do_set_internal(shard);
									SubLObject basis_object2;
									SubLObject state2;
									SubLObject ass3;
									for (basis_object2 = set_contents.do_set_contents_basis_object(
											set_contents_var2), state2 = (SubLObject) kb_indexing.NIL, state2 = set_contents
													.do_set_contents_initial_state(basis_object2,
															set_contents_var2); kb_indexing.NIL == doneP
																	&& kb_indexing.NIL == set_contents
																			.do_set_contents_doneP(basis_object2,
																					state2); state2 = set_contents
																							.do_set_contents_update_state(
																									state2)) {
										ass3 = set_contents.do_set_contents_next(basis_object2, state2);
										if (kb_indexing.NIL != set_contents.do_set_contents_element_validP(state2,
												ass3)) {
											if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(count,
													cutoff)) {
												doneP = (SubLObject) kb_indexing.T;
											} else if (kb_indexing.NIL != mt_relevance_macros
													.relevant_mtP(assertions_high.assertion_mt(ass3))) {
												count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
											}
										}
									}
								} else {
									cdestructuring_bind.cdestructuring_bind_error(datum,
											(SubLObject) kb_indexing.$list126);
								}
							}
						}
					} else if (kb_indexing.NIL != kb_indexing_datastructures.final_topn_index_p(index)) {
						final SubLObject iterator_var = kb_indexing_datastructures.new_final_topn_index_iterator(index);
						SubLObject valid;
						for (SubLObject done_var = doneP; kb_indexing.NIL == done_var; done_var = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != doneP)) {
							thread.resetMultipleValues();
							final SubLObject ass4 = iteration.iteration_next(iterator_var);
							valid = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (kb_indexing.NIL != valid) {
								if (kb_indexing.NIL != kb_indexing_macros.number_has_reached_cutoffP(count, cutoff)) {
									doneP = (SubLObject) kb_indexing.T;
								} else if (kb_indexing.NIL != mt_relevance_macros
										.relevant_mtP(assertions_high.assertion_mt(ass4))) {
									count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
								}
							}
						}
					} else {
						enforceType(index, kb_indexing.$sym127$FINAL_INDEX_P);
					}
				}
			}
		}
		return Numbers.min(cutoff, count);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 57492L)
	public static SubLObject get_other_subindex(final SubLObject v_term) {
		return kb_indexing_datastructures.term_complex_index_lookup(v_term, other_top_level_key());
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 57736L)
	public static SubLObject add_other_index(final SubLObject v_term, final SubLObject assertion) {
		return term_add_indexing_leaf(v_term, (SubLObject) ConsesLow.list(other_top_level_key()), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 58004L)
	public static SubLObject rem_other_index(final SubLObject v_term, final SubLObject assertion) {
		return term_rem_indexing_leaf(v_term, (SubLObject) ConsesLow.list(other_top_level_key()), assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 58256L)
	public static SubLObject other_top_level_key() {
		return (SubLObject) kb_indexing.$kw128$OTHER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 58434L)
	public static SubLObject num_index(final SubLObject v_term) {
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			return kb_indexing_datastructures.simple_num_index(v_term);
		}
		return kb_indexing_datastructures.complex_index_leaf_count(kb_indexing_datastructures.term_index(v_term));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 58878L)
	public static SubLObject relevant_num_index(final SubLObject v_term) {
		if (kb_indexing.NIL != all_mt_subindex_keys_relevant_p()) {
			return num_index(v_term);
		}
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			return count;
		}
		return Numbers.add(new SubLObject[] {
				relevant_num_gaf_arg_index(v_term, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED),
				relevant_num_nart_arg_index(v_term, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED),
				relevant_num_predicate_extent_index(v_term), relevant_num_function_extent_index(v_term),
				relevant_num_predicate_rule_index(v_term, (SubLObject) kb_indexing.UNPROVIDED),
				num_decontextualized_ist_predicate_rule_index(v_term, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED),
				relevant_num_isa_rule_index(v_term, (SubLObject) kb_indexing.UNPROVIDED),
				relevant_num_quoted_isa_rule_index(v_term, (SubLObject) kb_indexing.UNPROVIDED),
				relevant_num_genls_rule_index(v_term, (SubLObject) kb_indexing.UNPROVIDED),
				relevant_num_genl_mt_rule_index(v_term, (SubLObject) kb_indexing.UNPROVIDED),
				relevant_num_function_rule_index(v_term), relevant_num_exception_rule_index(v_term),
				relevant_num_pragma_rule_index(v_term), relevant_num_mt_index(v_term),
				relevant_num_other_index(v_term) });
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 60111L)
	public static SubLObject perform_indexing_pre_dump_cleanup() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject str = (SubLObject) kb_indexing.$str131$Performing_indexing_cleanup___;
		final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
		final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
		final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$
				.currentBinding(thread);
		final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
		final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
		final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
		final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
		final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
		try {
			utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
			utilities_macros.$progress_last_pacification_time$
					.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$
					.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			utilities_macros.$progress_notification_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$is_noting_progressP$.bind((SubLObject) kb_indexing.T, thread);
			utilities_macros.$silent_progressP$.bind((SubLObject) ((kb_indexing.NIL != str)
					? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_indexing.T), thread);
			utilities_macros.noting_progress_preamble(str);
			broad_mt_index_cleanup();
			unindexed_syntax_constant_index_cleanup();
			utilities_macros.noting_progress_postamble();
		} finally {
			utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
			utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
			utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
			utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
			utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
			utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 60589L)
	public static SubLObject get_indexing_pre_dump_cleanup_defs() {
		return (SubLObject) ConsesLow.list(
				(SubLObject) ConsesLow.list(
						set_utilities.construct_set_from_list(get_broad_mts_for_index_cleanup(),
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED),
						(SubLObject) kb_indexing.$sym123$REM_BROAD_MT_INDEX),
				(SubLObject) ConsesLow.list(
						set_utilities.construct_set_from_list(kb_indexing_datastructures.unindexed_syntax_constants(),
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED),
						(SubLObject) kb_indexing.$sym132$UNINDEXED_SYNTAX_CONSTANT_CLEANUP_ONE_INDEX));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 61182L)
	public static SubLObject unindexed_syntax_constant_index_cleanup() {
		SubLObject cdolist_list_var = kb_indexing_datastructures.unindexed_syntax_constants();
		SubLObject constant = (SubLObject) kb_indexing.NIL;
		constant = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			unindexed_syntax_constant_cleanup_one_index(constant);
			cdolist_list_var = cdolist_list_var.rest();
			constant = cdolist_list_var.first();
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 61524L)
	public static SubLObject unindexed_syntax_constant_cleanup_one_index(final SubLObject constant) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (kb_indexing.NIL == kb_indexing_datastructures.simple_indexed_term_p(constant)) {
			final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				control_vars.$mapping_target$.bind(constant, thread);
				mt_relevance_macros.$relevant_mt_function$
						.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING, thread);
				mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
				kb_mapping.map_other_index(
						Symbols.symbol_function(
								(SubLObject) kb_indexing.$sym133$UNINDEXED_SYNTAX_CONSTANT_INDEX_CLEANUP_INTERNAL),
						constant, (SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
			}
		}
		return constant;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 61833L)
	public static SubLObject unindexed_syntax_constant_index_cleanup_internal(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		rem_other_index(control_vars.$mapping_target$.getDynamicValue(thread), assertion);
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 62122L)
	public static SubLObject term_mt_count(final SubLObject v_term) {
		assert kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(v_term) : v_term;
		return Sequences.length(mts_of_indexed_term(v_term));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 62491L)
	public static SubLObject mts_of_indexed_term(final SubLObject v_term) {
		if (kb_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term)) {
			SubLObject v_answer = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
			SubLObject ass = (SubLObject) kb_indexing.NIL;
			ass = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				final SubLObject item_var = assertions_high.assertion_mt(ass);
				if (kb_indexing.NIL == conses_high.member(item_var, v_answer,
						Symbols.symbol_function((SubLObject) kb_indexing.EQL),
						Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
					v_answer = (SubLObject) ConsesLow.cons(item_var, v_answer);
				}
				cdolist_list_var = cdolist_list_var.rest();
				ass = cdolist_list_var.first();
			}
			return v_answer;
		}
		final SubLObject all_assertions = kb_indexing_datastructures
				.intermediate_index_leaves(kb_indexing_datastructures.term_index(v_term));
		final SubLObject all_mts = list_utilities.nmapcar((SubLObject) kb_indexing.$sym135$ASSERTION_MT,
				all_assertions);
		final SubLObject unique_mts = list_utilities.fast_delete_duplicates(all_mts, (SubLObject) kb_indexing.EQUAL,
				(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
				(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
		return unique_mts;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 63179L)
	public static SubLObject add_assertion_indices(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert kb_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
		final SubLObject _prev_bind_0 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$
				.currentBinding(thread);
		final SubLObject _prev_bind_2 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding(thread);
		try {
			simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind((SubLObject) kb_indexing.T, thread);
			simple_indexing.$terms_to_toggle_indexing_mode$.bind((SubLObject) kb_indexing.NIL, thread);
			if (kb_indexing.NIL != assertion_handles.valid_assertion_handleP(assertion)) {
				if (kb_indexing.NIL != assertions_interface.kb_gaf_assertionP(assertion)) {
					add_gaf_indices(assertion, v_term);
				} else {
					add_rule_indices(assertion, v_term);
				}
			}
			if (kb_indexing.NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread)) {
				simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
			}
		} finally {
			simple_indexing.$terms_to_toggle_indexing_mode$.rebind(_prev_bind_2, thread);
			simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind(_prev_bind_0, thread);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 63738L)
	public static SubLObject remove_assertion_indices(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		assert kb_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
		if (kb_indexing.NIL != assertions_high.gaf_assertionP(assertion)) {
			remove_gaf_indices(assertion, v_term);
		} else {
			remove_rule_indices(assertion, v_term);
		}
		return assertion;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 64292L)
	public static SubLObject remove_term_indices(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_3 = Errors.$ignore_warnsP$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING,
					thread);
			mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
			Errors.$ignore_warnsP$.bind((SubLObject) kb_indexing.T, thread);
			tms.tms_remove_assertion_list(kb_mapping.gather_other_index(v_term));
			if (kb_indexing.NIL != hlmt.hlmt_p(v_term)) {
				tms.tms_remove_assertion_list(kb_mapping.gather_mt_index(v_term));
			}
			tms.tms_remove_assertion_list(
					kb_mapping.gather_predicate_rule_index(v_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(
					kb_mapping.gather_predicate_rule_index(v_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(kb_mapping.gather_decontextualized_ist_predicate_rule_index(v_term,
					(SubLObject) kb_indexing.$kw137$POS, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(kb_mapping.gather_decontextualized_ist_predicate_rule_index(v_term,
					(SubLObject) kb_indexing.$kw138$NEG, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(kb_mapping.gather_isa_rule_index(v_term, (SubLObject) kb_indexing.$kw138$NEG,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(kb_mapping.gather_isa_rule_index(v_term, (SubLObject) kb_indexing.$kw137$POS,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(
					kb_mapping.gather_quoted_isa_rule_index(v_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(
					kb_mapping.gather_quoted_isa_rule_index(v_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(
					kb_mapping.gather_genls_rule_index(v_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(
					kb_mapping.gather_genls_rule_index(v_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(
					kb_mapping.gather_genl_mt_rule_index(v_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(
					kb_mapping.gather_genl_mt_rule_index(v_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(kb_mapping.gather_function_rule_index(v_term,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(kb_mapping.gather_exception_rule_index(v_term,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			tms.tms_remove_assertion_list(kb_mapping.gather_pragma_rule_index(v_term,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
			if (kb_indexing.NIL != forts.fort_p(v_term)) {
				tms.tms_remove_assertion_list(kb_mapping.gather_predicate_extent_index(v_term,
						(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL));
				tms.tms_remove_assertion_list(kb_mapping.gather_function_extent_index(v_term));
			}
			SubLObject nart_indexed_argnums = key_nart_arg_index(v_term, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			SubLObject cdolist_list_var;
			nart_indexed_argnums = (cdolist_list_var = Sort.sort(nart_indexed_argnums,
					Symbols.symbol_function((SubLObject) kb_indexing.$sym139$_), (SubLObject) kb_indexing.UNPROVIDED));
			SubLObject argnum = (SubLObject) kb_indexing.NIL;
			argnum = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				tms.tms_remove_assertion_list(
						kb_mapping.gather_nart_arg_index(v_term, argnum, (SubLObject) kb_indexing.NIL));
				cdolist_list_var = cdolist_list_var.rest();
				argnum = cdolist_list_var.first();
			}
			SubLObject gaf_indexed_argnums = key_gaf_arg_index(v_term, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			gaf_indexed_argnums = (cdolist_list_var = Sort.sort(gaf_indexed_argnums,
					Symbols.symbol_function((SubLObject) kb_indexing.$sym139$_), (SubLObject) kb_indexing.UNPROVIDED));
			argnum = (SubLObject) kb_indexing.NIL;
			argnum = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (!kb_indexing.ONE_INTEGER.numE(argnum)) {
					tms.tms_remove_assertion_list(kb_mapping.gather_gaf_arg_index(v_term, argnum,
							(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL));
				}
				cdolist_list_var = cdolist_list_var.rest();
				argnum = cdolist_list_var.first();
			}
			final SubLObject isa_assertions = kb_mapping.gather_gaf_arg_index(v_term,
					(SubLObject) kb_indexing.ONE_INTEGER, kb_indexing.$const140$isa, (SubLObject) kb_indexing.NIL,
					(SubLObject) kb_indexing.NIL);
			final SubLObject genls_assertions = kb_mapping.gather_gaf_arg_index(v_term,
					(SubLObject) kb_indexing.ONE_INTEGER, kb_indexing.$const141$genls, (SubLObject) kb_indexing.NIL,
					(SubLObject) kb_indexing.NIL);
			final SubLObject tou_assertions = kb_mapping.gather_gaf_arg_index(v_term,
					(SubLObject) kb_indexing.ONE_INTEGER, kb_indexing.$const142$termOfUnit,
					(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL);
			SubLObject cdolist_list_var2;
			final SubLObject arg1_assertions = cdolist_list_var2 = kb_mapping.gather_gaf_arg_index(v_term,
					(SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL,
					(SubLObject) kb_indexing.NIL);
			SubLObject assertion = (SubLObject) kb_indexing.NIL;
			assertion = cdolist_list_var2.first();
			while (kb_indexing.NIL != cdolist_list_var2) {
				if (kb_indexing.NIL != assertions_high.valid_assertion(assertion, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL == subl_promotions.memberP(assertion, isa_assertions,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL == conses_high.member(assertion, genls_assertions,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
						&& kb_indexing.NIL == conses_high.member(assertion, tou_assertions,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)) {
					tms.tms_remove_assertion(assertion);
				}
				cdolist_list_var2 = cdolist_list_var2.rest();
				assertion = cdolist_list_var2.first();
			}
			tms.tms_remove_assertion_list(genls_assertions);
			tms.tms_remove_assertion_list(isa_assertions);
			tms.tms_remove_assertion_list(tou_assertions);
			final SubLObject remaining_assertions = kb_accessors.all_term_assertions(v_term,
					(SubLObject) kb_indexing.T);
			if (kb_indexing.NIL != remaining_assertions) {
				Errors.warn((SubLObject) kb_indexing.$str143$indexing_problem_while_removing__, v_term);
			}
			tms.tms_remove_assertion_list(remaining_assertions);
		} finally {
			Errors.$ignore_warnsP$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return v_term;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 68853L)
	public static SubLObject determine_formula_indices(SubLObject formula) {
		formula = el_utilities.ignore_sequence_vars(formula);
		SubLObject others = (SubLObject) kb_indexing.NIL;
		SubLObject pairs = (SubLObject) kb_indexing.NIL;
		final SubLObject terms = cycl_utilities.formula_terms(formula, (SubLObject) kb_indexing.$kw147$IGNORE);
		SubLObject list_var = (SubLObject) kb_indexing.NIL;
		SubLObject arg = (SubLObject) kb_indexing.NIL;
		SubLObject argnum = (SubLObject) kb_indexing.NIL;
		list_var = terms;
		arg = list_var.first();
		for (argnum = (SubLObject) kb_indexing.ZERO_INTEGER; kb_indexing.NIL != list_var; list_var = list_var
				.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
			if (kb_indexing.NIL != kb_indexing_datastructures.valid_indexed_termP(arg)) {
				final SubLObject pair = (SubLObject) ConsesLow.cons(argnum, arg);
				pairs = (SubLObject) ConsesLow.cons(pair, pairs);
			} else {
				others = conses_high.nunion(
						list_utilities.tree_gather(arg,
								Symbols.symbol_function((SubLObject) kb_indexing.$sym148$VALID_FULLY_INDEXED_TERM_P),
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED),
						others, (SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			}
		}
		if (kb_indexing.NIL != others) {
			others = list_utilities.fast_delete_duplicates(others,
					Symbols.symbol_function((SubLObject) kb_indexing.EQUAL), (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED);
			SubLObject filtered_others = (SubLObject) kb_indexing.NIL;
			SubLObject cdolist_list_var = others;
			SubLObject other = (SubLObject) kb_indexing.NIL;
			other = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL == subl_promotions.memberP(other, pairs,
						Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
						Symbols.symbol_function((SubLObject) kb_indexing.$sym149$CDR))) {
					filtered_others = (SubLObject) ConsesLow.cons(other, filtered_others);
				}
				cdolist_list_var = cdolist_list_var.rest();
				other = cdolist_list_var.first();
			}
			others = filtered_others;
		}
		pairs = optimize_argnum_pairs(pairs);
		return subl_promotions.values2(pairs, others);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 70058L)
	public static SubLObject optimize_argnum_pairs(SubLObject argnum_pairs) {
		argnum_pairs = Sort.sort(argnum_pairs, Symbols.symbol_function((SubLObject) kb_indexing.$sym150$_),
				Symbols.symbol_function((SubLObject) kb_indexing.$sym151$CAR));
		argnum_pairs = list_utilities.stable_sort_via_test(argnum_pairs,
				Symbols.symbol_function((SubLObject) kb_indexing.$sym152$FORT_P),
				Symbols.symbol_function((SubLObject) kb_indexing.$sym149$CDR));
		argnum_pairs = list_utilities.stable_sort_via_test(argnum_pairs,
				(SubLObject) kb_indexing.$sym153$TERM_INDEX_SWAPPED_IN_,
				Symbols.symbol_function((SubLObject) kb_indexing.$sym149$CDR));
		argnum_pairs = list_utilities.stable_sort_via_test(argnum_pairs,
				Symbols.symbol_function((SubLObject) kb_indexing.$sym154$POSITIVE_INTEGER_P),
				Symbols.symbol_function((SubLObject) kb_indexing.$sym151$CAR));
		return argnum_pairs;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 70737L)
	public static SubLObject determine_gaf_indices(final SubLObject formula, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject argnum_pairs = determine_formula_indices(formula);
		SubLObject others = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (kb_indexing.NIL == forts.fort_p(mt)) {
			others = conses_high.nunion(
					cycl_utilities.formula_gather(mt, (SubLObject) kb_indexing.$sym155$FULLY_INDEXED_HLMT_TERM_P,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED),
					others, (SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
		}
		return Values.values(argnum_pairs, others);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 71451L)
	public static SubLObject add_gaf_indices(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject literal = assertions_high.gaf_formula(assertion);
		final SubLObject mt = assertions_high.assertion_mt(assertion);
		thread.resetMultipleValues();
		final SubLObject alist = determine_gaf_indices(literal, mt);
		final SubLObject others = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject pred = conses_high.assoc((SubLObject) kb_indexing.ZERO_INTEGER, alist,
				(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED).rest();
		if (kb_indexing.NIL == hlmt.hlmt_p(mt) || kb_indexing.NIL == forts.fort_p(pred)) {
			Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
					(SubLObject) kb_indexing.$str157$Don_t_know_how_to_index__S, assertion);
			return (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL == v_term || kb_indexing.NIL != hlmt.hlmt_equal(v_term, mt)) {
			add_mt_index(mt, assertion);
		}
		if (kb_indexing.NIL == v_term || v_term.eql(pred)) {
			add_predicate_extent_index(pred, mt, assertion);
		}
		SubLObject cdolist_list_var = alist;
		SubLObject pair = (SubLObject) kb_indexing.NIL;
		pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = pair;
			SubLObject argnum = (SubLObject) kb_indexing.NIL;
			SubLObject arg = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list158);
			argnum = current.first();
			current = (arg = current.rest());
			if (argnum.isPositive() && kb_indexing.NIL != arg && (kb_indexing.NIL == v_term || v_term.equal(arg))) {
				add_gaf_arg_index(arg, argnum, pred, mt, assertion);
			}
			cdolist_list_var = cdolist_list_var.rest();
			pair = cdolist_list_var.first();
		}
		if (pred.eql(kb_indexing.$const142$termOfUnit)) {
			add_function_indices(assertion, v_term);
		} else if (kb_indexing.NIL != others) {
			cdolist_list_var = others;
			SubLObject fort = (SubLObject) kb_indexing.NIL;
			fort = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(fort)
						&& (kb_indexing.NIL == v_term || v_term.equal(fort))) {
					add_other_index(fort, assertion);
				}
				cdolist_list_var = cdolist_list_var.rest();
				fort = cdolist_list_var.first();
			}
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 72797L)
	public static SubLObject remove_gaf_indices(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject literal = assertions_high.gaf_formula(assertion);
		final SubLObject mt = assertions_high.assertion_mt(assertion);
		thread.resetMultipleValues();
		final SubLObject alist = determine_gaf_indices(literal, mt);
		final SubLObject others = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject pred = conses_high.assoc((SubLObject) kb_indexing.ZERO_INTEGER, alist,
				(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED).rest();
		if (kb_indexing.NIL == hlmt.hlmt_p(mt) || kb_indexing.NIL == forts.fort_p(pred)) {
			Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
					(SubLObject) kb_indexing.$str157$Don_t_know_how_to_index__S, assertion);
			return (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL == v_term || kb_indexing.NIL != hlmt.hlmt_equal(v_term, mt)) {
			rem_mt_index(mt, assertion);
		}
		if (kb_indexing.NIL == v_term || v_term.eql(pred)) {
			rem_predicate_extent_index(pred, mt, assertion);
		}
		SubLObject cdolist_list_var = alist;
		SubLObject pair = (SubLObject) kb_indexing.NIL;
		pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = pair;
			SubLObject argnum = (SubLObject) kb_indexing.NIL;
			SubLObject arg = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list158);
			argnum = current.first();
			current = (arg = current.rest());
			if (argnum.isPositive() && kb_indexing.NIL != arg && (kb_indexing.NIL == v_term || v_term.equal(arg))) {
				rem_gaf_arg_index(arg, argnum, pred, mt, assertion);
			}
			cdolist_list_var = cdolist_list_var.rest();
			pair = cdolist_list_var.first();
		}
		if (pred.eql(kb_indexing.$const142$termOfUnit)) {
			rem_function_indices(assertion, v_term);
		} else if (kb_indexing.NIL != others) {
			cdolist_list_var = others;
			SubLObject fort = (SubLObject) kb_indexing.NIL;
			fort = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(fort)
						&& (kb_indexing.NIL == v_term || v_term.equal(fort))) {
					rem_other_index(fort, assertion);
				}
				cdolist_list_var = cdolist_list_var.rest();
				fort = cdolist_list_var.first();
			}
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 74148L)
	public static SubLObject determine_function_indices(final SubLObject naut) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject argnum_pairs = determine_formula_indices(naut);
		final SubLObject others = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return Values.values(argnum_pairs, others);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 74638L)
	public static SubLObject add_function_indices(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject term_of_unit = el_utilities.unmake_binary_formula(assertions_high.gaf_formula(assertion));
		final SubLObject nart = thread.secondMultipleValue();
		final SubLObject naut = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (term_of_unit.eql(kb_indexing.$const142$termOfUnit)) {
			thread.resetMultipleValues();
			final SubLObject alist = determine_function_indices(naut);
			final SubLObject others = thread.secondMultipleValue();
			thread.resetMultipleValues();
			final SubLObject function = conses_high.assoc((SubLObject) kb_indexing.ZERO_INTEGER, alist,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED).rest();
			if (kb_indexing.NIL == forts.fort_p(function)) {
				Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
						(SubLObject) kb_indexing.$str157$Don_t_know_how_to_index__S, assertion);
				return (SubLObject) kb_indexing.NIL;
			}
			if (kb_indexing.NIL == v_term || v_term.eql(function)) {
				add_function_extent_index(function, assertion);
			}
			SubLObject cdolist_list_var = alist;
			SubLObject pair = (SubLObject) kb_indexing.NIL;
			pair = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				SubLObject current;
				final SubLObject datum = current = pair;
				SubLObject f_argnum = (SubLObject) kb_indexing.NIL;
				SubLObject f_arg = (SubLObject) kb_indexing.NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list159);
				f_argnum = current.first();
				current = (f_arg = current.rest());
				if (f_argnum.isPositive() && kb_indexing.NIL != f_arg
						&& (kb_indexing.NIL == v_term || v_term.equal(f_arg))) {
					add_nart_arg_index(f_arg, f_argnum, function, assertion);
				}
				cdolist_list_var = cdolist_list_var.rest();
				pair = cdolist_list_var.first();
			}
			if (kb_indexing.NIL != others) {
				cdolist_list_var = others;
				SubLObject fort = (SubLObject) kb_indexing.NIL;
				fort = cdolist_list_var.first();
				while (kb_indexing.NIL != cdolist_list_var) {
					if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(fort)
							&& (kb_indexing.NIL == v_term || v_term.equal(fort))) {
						add_other_index(fort, assertion);
					}
					cdolist_list_var = cdolist_list_var.rest();
					fort = cdolist_list_var.first();
				}
			}
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 75858L)
	public static SubLObject rem_function_indices(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject term_of_unit = el_utilities.unmake_binary_formula(assertions_high.gaf_formula(assertion));
		final SubLObject nart = thread.secondMultipleValue();
		final SubLObject naut = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (term_of_unit.eql(kb_indexing.$const142$termOfUnit)) {
			thread.resetMultipleValues();
			final SubLObject alist = determine_function_indices(naut);
			final SubLObject others = thread.secondMultipleValue();
			thread.resetMultipleValues();
			final SubLObject function = conses_high.assoc((SubLObject) kb_indexing.ZERO_INTEGER, alist,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED).rest();
			if (kb_indexing.NIL == forts.fort_p(function)) {
				Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
						(SubLObject) kb_indexing.$str157$Don_t_know_how_to_index__S, assertion);
				return (SubLObject) kb_indexing.NIL;
			}
			if (kb_indexing.NIL == v_term || v_term.eql(function)) {
				rem_function_extent_index(function, assertion);
			}
			SubLObject cdolist_list_var = alist;
			SubLObject pair = (SubLObject) kb_indexing.NIL;
			pair = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				SubLObject current;
				final SubLObject datum = current = pair;
				SubLObject f_argnum = (SubLObject) kb_indexing.NIL;
				SubLObject f_arg = (SubLObject) kb_indexing.NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list159);
				f_argnum = current.first();
				current = (f_arg = current.rest());
				if (f_argnum.isPositive() && kb_indexing.NIL != f_arg
						&& (kb_indexing.NIL == v_term || v_term.equal(f_arg))) {
					rem_nart_arg_index(f_arg, f_argnum, function, assertion);
				}
				cdolist_list_var = cdolist_list_var.rest();
				pair = cdolist_list_var.first();
			}
			if (kb_indexing.NIL != others) {
				cdolist_list_var = others;
				SubLObject fort = (SubLObject) kb_indexing.NIL;
				fort = cdolist_list_var.first();
				while (kb_indexing.NIL != cdolist_list_var) {
					if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(fort)
							&& (kb_indexing.NIL == v_term || v_term.equal(fort))) {
						rem_other_index(fort, assertion);
					}
					cdolist_list_var = cdolist_list_var.rest();
					fort = cdolist_list_var.first();
				}
			}
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 77042L)
	public static SubLObject determine_rule_indices_int(final SubLObject asents, final SubLObject sense) {
		SubLObject pairs = (SubLObject) kb_indexing.NIL;
		SubLObject other = (SubLObject) kb_indexing.NIL;
		SubLObject cdolist_list_var = asents;
		SubLObject asent = (SubLObject) kb_indexing.NIL;
		asent = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
			if (pred.eql(kb_indexing.$const140$isa)) {
				final SubLObject collection = cycl_utilities.sentence_arg2(asent, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != forts.fort_p(collection)) {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw160$ISA,
							collection);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				} else {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED,
							kb_indexing.$const140$isa);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				}
			} else if (pred.eql(kb_indexing.$const162$quotedIsa)) {
				final SubLObject collection = cycl_utilities.sentence_arg2(asent, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != forts.fort_p(collection)) {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw163$QUOTED_ISA,
							collection);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				} else {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED,
							kb_indexing.$const162$quotedIsa);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				}
			} else if (pred.eql(kb_indexing.$const141$genls)) {
				final SubLObject collection = cycl_utilities.sentence_arg2(asent, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != forts.fort_p(collection)) {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw164$GENLS,
							collection);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				} else {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED,
							kb_indexing.$const141$genls);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				}
			} else if (pred.eql(kb_indexing.$const165$genlMt)) {
				final SubLObject genl_mt = cycl_utilities.sentence_arg2(asent, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != hlmt.hlmt_p(genl_mt)) {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw166$GENL_MT,
							genl_mt);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				} else {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED,
							kb_indexing.$const165$genlMt);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				}
			} else if (sense == kb_indexing.$kw138$NEG && pred.eql(kb_indexing.$const142$termOfUnit)) {
				final SubLObject naut = cycl_utilities.sentence_arg2(asent, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != el_utilities.possibly_naut_p(naut)) {
					final SubLObject function = cycl_utilities.nat_functor(naut);
					if (kb_indexing.NIL != forts.fort_p(function)) {
						final SubLObject item_var2 = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw167$FUNC,
								function);
						if (kb_indexing.NIL == conses_high.member(item_var2, pairs,
								Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
								Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
							pairs = (SubLObject) ConsesLow.cons(item_var2, pairs);
						}
					} else {
						final SubLObject item_var2 = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED,
								kb_indexing.$const142$termOfUnit);
						if (kb_indexing.NIL == conses_high.member(item_var2, pairs,
								Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
								Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
							pairs = (SubLObject) ConsesLow.cons(item_var2, pairs);
						}
					}
				} else {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED,
							kb_indexing.$const142$termOfUnit);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				}
			} else if (sense == kb_indexing.$kw137$POS && pred.eql(kb_indexing.$const168$abnormal)) {
				final SubLObject assertion = cycl_utilities.sentence_arg2(asent, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != assertion_handles.assertion_p(assertion)) {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw169$EXCEPTION,
							assertion);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				} else {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED,
							kb_indexing.$const168$abnormal);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				}
			} else if (sense == kb_indexing.$kw137$POS && pred.eql(kb_indexing.$const170$meetsPragmaticRequirement)) {
				final SubLObject assertion = cycl_utilities.sentence_arg2(asent, (SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != assertion_handles.assertion_p(assertion)) {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw171$PRAGMA,
							assertion);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				} else {
					final SubLObject item_var = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED,
							kb_indexing.$const170$meetsPragmaticRequirement);
					if (kb_indexing.NIL == conses_high.member(item_var, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var, pairs);
					}
				}
			} else if (kb_indexing.NIL != el_utilities.ist_predicateP(pred, spec_preds_of_ist_indexing_enabledP())) {
				final SubLObject sub_sentence = cycl_utilities.sentence_arg2(asent,
						(SubLObject) kb_indexing.UNPROVIDED);
				final SubLObject sub_pred = el_utilities.literal_predicate(sub_sentence,
						(SubLObject) kb_indexing.UNPROVIDED);
				if (kb_indexing.NIL != forts.fort_p(sub_pred)) {
					final SubLObject item_var2 = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw172$IST_PRED,
							sub_pred);
					if (kb_indexing.NIL == conses_high.member(item_var2, pairs,
							Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
							Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
						pairs = (SubLObject) ConsesLow.cons(item_var2, pairs);
					}
				}
			} else if (kb_indexing.NIL != forts.fort_p(pred)) {
				final SubLObject item_var3 = (SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw161$PRED, pred);
				if (kb_indexing.NIL == conses_high.member(item_var3, pairs,
						Symbols.symbol_function((SubLObject) kb_indexing.EQUAL),
						Symbols.symbol_function((SubLObject) kb_indexing.IDENTITY))) {
					pairs = (SubLObject) ConsesLow.cons(item_var3, pairs);
				}
			}
			other = conses_high.nunion(other,
					list_utilities.tree_gather(cycl_utilities.sentence_args(asent, (SubLObject) kb_indexing.UNPROVIDED),
							Symbols.symbol_function((SubLObject) kb_indexing.$sym173$FULLY_INDEXED_TERM_P),
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
							(SubLObject) kb_indexing.UNPROVIDED),
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			asent = cdolist_list_var.first();
		}
		return Values.values(pairs, other);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 80135L)
	public static SubLObject determine_rule_indices(final SubLObject cnf) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject neg_pairs = determine_rule_indices_int(clauses.neg_lits(cnf),
				(SubLObject) kb_indexing.$kw138$NEG);
		final SubLObject neg_other = thread.secondMultipleValue();
		thread.resetMultipleValues();
		thread.resetMultipleValues();
		final SubLObject pos_pairs = determine_rule_indices_int(clauses.pos_lits(cnf),
				(SubLObject) kb_indexing.$kw137$POS);
		final SubLObject pos_other = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject neg_terms = Mapping.mapcar(Symbols.symbol_function((SubLObject) kb_indexing.$sym174$SECOND),
				neg_pairs);
		final SubLObject pos_terms = Mapping.mapcar(Symbols.symbol_function((SubLObject) kb_indexing.$sym174$SECOND),
				pos_pairs);
		SubLObject other = list_utilities.fast_delete_duplicates(
				conses_high.nunion(neg_other, pos_other, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED),
				(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
				(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
				(SubLObject) kb_indexing.UNPROVIDED);
		other = conses_high.nset_difference(
				conses_high.nset_difference(other, neg_terms, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED),
				pos_terms, (SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
		return Values.values(neg_pairs, pos_pairs, other);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 81224L)
	public static SubLObject add_rule_indices(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject cnf = assertions_high.assertion_cnf(assertion);
		final SubLObject mt = assertions_high.assertion_mt(assertion);
		final SubLObject dir = assertions_high.assertion_direction(assertion);
		thread.resetMultipleValues();
		final SubLObject neg_pairs = determine_rule_indices(cnf);
		final SubLObject pos_pairs = thread.secondMultipleValue();
		final SubLObject other = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		SubLObject cdolist_list_var = neg_pairs;
		SubLObject neg_pair = (SubLObject) kb_indexing.NIL;
		neg_pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = neg_pair;
			SubLObject neg_indexing_type = (SubLObject) kb_indexing.NIL;
			SubLObject neg_term = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list175);
			neg_indexing_type = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list175);
			neg_term = current.first();
			current = current.rest();
			if (kb_indexing.NIL == current) {
				if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(neg_term)
						&& (kb_indexing.NIL == v_term || neg_term.equal(v_term))) {
					final SubLObject pcase_var = neg_indexing_type;
					if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
						add_predicate_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
						add_decontextualized_ist_predicate_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG,
								dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw167$FUNC)) {
						add_function_rule_index(neg_term, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
						add_isa_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
						add_quoted_isa_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
						add_genls_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
						add_genl_mt_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw171$PRAGMA)) {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str176$Can_t_index_a_pragmatic_requireme, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw169$EXCEPTION)) {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str177$Can_t_index_an_exception_as_a_neg, assertion);
					} else {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str178$Don_t_know_how_to_handle_indexing, neg_indexing_type);
					}
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list175);
			}
			cdolist_list_var = cdolist_list_var.rest();
			neg_pair = cdolist_list_var.first();
		}
		cdolist_list_var = pos_pairs;
		SubLObject pos_pair = (SubLObject) kb_indexing.NIL;
		pos_pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = pos_pair;
			SubLObject pos_indexing_type = (SubLObject) kb_indexing.NIL;
			SubLObject pos_term = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list179);
			pos_indexing_type = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list179);
			pos_term = current.first();
			current = current.rest();
			if (kb_indexing.NIL == current) {
				if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(pos_term)
						&& (kb_indexing.NIL == v_term || pos_term.equal(v_term))) {
					final SubLObject pcase_var = pos_indexing_type;
					if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
						add_predicate_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
						add_decontextualized_ist_predicate_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS,
								dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
						add_isa_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
						add_quoted_isa_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
						add_genls_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
						add_genl_mt_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw171$PRAGMA)) {
						add_pragma_rule_index(pos_term, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw169$EXCEPTION)) {
						add_exception_rule_index(pos_term, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw167$FUNC)) {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str180$Can_t_index_a_function_rule_as_a_, assertion);
					} else {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str178$Don_t_know_how_to_handle_indexing, pos_indexing_type);
					}
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list179);
			}
			cdolist_list_var = cdolist_list_var.rest();
			pos_pair = cdolist_list_var.first();
		}
		cdolist_list_var = other;
		SubLObject other_term = (SubLObject) kb_indexing.NIL;
		other_term = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(other_term)
					&& (kb_indexing.NIL == v_term || other_term.equal(v_term))) {
				add_other_index(other_term, assertion);
			}
			cdolist_list_var = cdolist_list_var.rest();
			other_term = cdolist_list_var.first();
		}
		if (kb_indexing.NIL != hlmt.hlmt_p(mt)
				&& (kb_indexing.NIL == v_term || kb_indexing.NIL != hlmt.hlmt_equal(mt, v_term))) {
			add_mt_index(mt, assertion);
		}
		if (kb_indexing.NIL == v_term) {
			auxiliary_indexing.add_unbound_rule_indices(assertion);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 84225L)
	public static SubLObject remove_rule_indices(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject cnf = assertions_high.assertion_cnf(assertion);
		final SubLObject mt = assertions_high.assertion_mt(assertion);
		final SubLObject dir = assertions_high.assertion_direction(assertion);
		thread.resetMultipleValues();
		final SubLObject neg_pairs = determine_rule_indices(cnf);
		final SubLObject pos_pairs = thread.secondMultipleValue();
		final SubLObject other = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		SubLObject cdolist_list_var = neg_pairs;
		SubLObject neg_pair = (SubLObject) kb_indexing.NIL;
		neg_pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = neg_pair;
			SubLObject neg_indexing_type = (SubLObject) kb_indexing.NIL;
			SubLObject neg_term = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list175);
			neg_indexing_type = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list175);
			neg_term = current.first();
			current = current.rest();
			if (kb_indexing.NIL == current) {
				if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(neg_term)
						&& (kb_indexing.NIL == v_term || neg_term.equal(v_term))) {
					final SubLObject pcase_var = neg_indexing_type;
					if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
						rem_predicate_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
						rem_decontextualized_ist_predicate_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG,
								dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
						rem_isa_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
						rem_quoted_isa_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
						rem_genls_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
						rem_genl_mt_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw167$FUNC)) {
						rem_function_rule_index(neg_term, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw171$PRAGMA)) {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str181$Can_t_remove_the_index_of_a_pragm, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw169$EXCEPTION)) {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str182$Can_t_remove_the_index_of_an_exce, assertion);
					} else {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str178$Don_t_know_how_to_handle_indexing, neg_indexing_type);
					}
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list175);
			}
			cdolist_list_var = cdolist_list_var.rest();
			neg_pair = cdolist_list_var.first();
		}
		cdolist_list_var = pos_pairs;
		SubLObject pos_pair = (SubLObject) kb_indexing.NIL;
		pos_pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = pos_pair;
			SubLObject pos_indexing_type = (SubLObject) kb_indexing.NIL;
			SubLObject pos_term = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list179);
			pos_indexing_type = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list179);
			pos_term = current.first();
			current = current.rest();
			if (kb_indexing.NIL == current) {
				if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(pos_term)
						&& (kb_indexing.NIL == v_term || pos_term.equal(v_term))) {
					final SubLObject pcase_var = pos_indexing_type;
					if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
						rem_predicate_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
						rem_decontextualized_ist_predicate_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS,
								dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
						rem_isa_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
						rem_quoted_isa_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
						rem_genls_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
						rem_genl_mt_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw169$EXCEPTION)) {
						rem_exception_rule_index(pos_term, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw171$PRAGMA)) {
						rem_pragma_rule_index(pos_term, mt, dir, assertion);
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw167$FUNC)) {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str183$Can_t_remove_the_index_of_a_funct, assertion);
					} else {
						Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
								(SubLObject) kb_indexing.$str178$Don_t_know_how_to_handle_indexing, pos_indexing_type);
					}
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list179);
			}
			cdolist_list_var = cdolist_list_var.rest();
			pos_pair = cdolist_list_var.first();
		}
		cdolist_list_var = other;
		SubLObject other_term = (SubLObject) kb_indexing.NIL;
		other_term = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (kb_indexing.NIL != kb_indexing_datastructures.fully_indexed_term_p(other_term)
					&& (kb_indexing.NIL == v_term || other_term.equal(v_term))) {
				rem_other_index(other_term, assertion);
			}
			cdolist_list_var = cdolist_list_var.rest();
			other_term = cdolist_list_var.first();
		}
		if (kb_indexing.NIL != hlmt.hlmt_p(mt)
				&& (kb_indexing.NIL == v_term || kb_indexing.NIL != hlmt.hlmt_equal(mt, v_term))) {
			rem_mt_index(mt, assertion);
		}
		if (kb_indexing.NIL == v_term) {
			auxiliary_indexing.rem_unbound_rule_indices(assertion);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 87425L)
	public static SubLObject spec_preds_of_ist_indexing_enabledP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$.getDynamicValue(thread);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 87537L)
	public static SubLObject spec_preds_of_ist_indexing_enabledP_robust() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return (SubLObject) SubLObjectFactory.makeBoolean(
				kb_indexing.NIL != kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$.getDynamicValue(thread)
						&& spec_preds_of_ist_old_indexed_rule_count().isZero());
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 87760L)
	public static SubLObject spec_preds_of_ist_old_indexed_rule_count() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING,
					thread);
			mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
			SubLObject cdolist_list_var = genl_predicates.all_proper_spec_predicates(kb_indexing.$const184$ist,
					(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			SubLObject pred = (SubLObject) kb_indexing.NIL;
			pred = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				count = Numbers.add(count, num_predicate_rule_index(pred, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
				cdolist_list_var = cdolist_list_var.rest();
				pred = cdolist_list_var.first();
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 87982L)
	public static SubLObject enable_spec_preds_of_ist_indexing() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject total = spec_preds_of_ist_old_indexed_rule_count();
		SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
		if (!total.isZero()) {
			final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
			final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
			final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
			final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
			try {
				utilities_macros.$last_percent_progress_index$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
				utilities_macros.$last_percent_progress_prediction$.bind((SubLObject) kb_indexing.NIL, thread);
				utilities_macros.$within_noting_percent_progress$.bind((SubLObject) kb_indexing.T, thread);
				utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
				try {
					utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate(
							(SubLObject) kb_indexing.$str185$Enabling_spec_preds_of_ist_indexi, new SubLObject[] {
									format_nil.format_nil_a_no_copy(total), kb_indexing.$str186$_assertions_ }));
					final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$
							.currentBinding(thread);
					final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$
								.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
						SubLObject cdolist_list_var = genl_predicates.all_proper_spec_predicates(
								kb_indexing.$const184$ist, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
						SubLObject pred = (SubLObject) kb_indexing.NIL;
						pred = cdolist_list_var.first();
						while (kb_indexing.NIL != cdolist_list_var) {
							if (kb_indexing.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred,
									(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL)) {
								final SubLObject iterator_var = kb_mapping_macros
										.new_predicate_rule_final_index_spec_iterator(pred,
												(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL);
								SubLObject done_var = (SubLObject) kb_indexing.NIL;
								final SubLObject token_var = (SubLObject) kb_indexing.NIL;
								while (kb_indexing.NIL == done_var) {
									final SubLObject final_index_spec = iteration
											.iteration_next_without_values_macro_helper(iterator_var, token_var);
									final SubLObject valid = (SubLObject) SubLObjectFactory
											.makeBoolean(!token_var.eql(final_index_spec));
									if (kb_indexing.NIL != valid) {
										SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
										try {
											final_index_iterator = kb_mapping_macros.new_final_index_iterator(
													final_index_spec, (SubLObject) kb_indexing.$kw187$RULE,
													(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL);
											SubLObject done_var_$8 = (SubLObject) kb_indexing.NIL;
											final SubLObject token_var_$9 = (SubLObject) kb_indexing.NIL;
											while (kb_indexing.NIL == done_var_$8) {
												final SubLObject a = iteration
														.iteration_next_without_values_macro_helper(
																final_index_iterator, token_var_$9);
												final SubLObject valid_$10 = (SubLObject) SubLObjectFactory
														.makeBoolean(!token_var_$9.eql(a));
												if (kb_indexing.NIL != valid_$10) {
													final SubLObject _prev_bind_0_$7 = kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$
															.currentBinding(thread);
													try {
														kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$
																.bind((SubLObject) kb_indexing.NIL, thread);
														remove_assertion_indices(a,
																(SubLObject) kb_indexing.UNPROVIDED);
													} finally {
														kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$
																.rebind(_prev_bind_0_$7, thread);
													}
													final SubLObject _prev_bind_0_$8 = kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$
															.currentBinding(thread);
													try {
														kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$
																.bind((SubLObject) kb_indexing.T, thread);
														add_assertion_indices(a, (SubLObject) kb_indexing.UNPROVIDED);
													} finally {
														kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$
																.rebind(_prev_bind_0_$8, thread);
													}
													count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
													utilities_macros.note_percent_progress(count, total);
												}
												done_var_$8 = (SubLObject) SubLObjectFactory
														.makeBoolean(kb_indexing.NIL == valid_$10);
											}
										} finally {
											final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$
													.currentBinding(thread);
											try {
												Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T,
														thread);
												final SubLObject _values = Values.getValuesAsVector();
												if (kb_indexing.NIL != final_index_iterator) {
													kb_mapping_macros
															.destroy_final_index_iterator(final_index_iterator);
												}
												Values.restoreValuesFromVector(_values);
											} finally {
												Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
											}
										}
									}
									done_var = (SubLObject) SubLObjectFactory.makeBoolean(kb_indexing.NIL == valid);
								}
							}
							cdolist_list_var = cdolist_list_var.rest();
							pred = cdolist_list_var.first();
						}
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1_$7, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
						final SubLObject _values2 = Values.getValuesAsVector();
						utilities_macros.noting_percent_progress_postamble();
						Values.restoreValuesFromVector(_values2);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
					}
				}
			} finally {
				utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
				utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
				utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
				utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
			}
		}
		kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$.setDynamicValue((SubLObject) kb_indexing.T, thread);
		return count;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 88793L)
	public static SubLObject best_nat_lookup_index(final SubLObject nart_hl_formula, SubLObject v_methods) {
		if (v_methods == kb_indexing.UNPROVIDED) {
			v_methods = (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw43$FUNCTION_EXTENT, v_methods)
				|| kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw27$NART_ARG, v_methods)) {
			return best_nat_lookup_index_try_all_allowed(nart_hl_formula, v_methods);
		}
		if (kb_indexing.NIL != lookup_methods_allow_onlyP((SubLObject) kb_indexing.$kw188$OVERLAP, v_methods)) {
			return lookup_index_for_overlap(nart_hl_formula);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 89912L)
	public static SubLObject num_best_nat_lookup_index(final SubLObject nart_hl_formula, SubLObject v_methods) {
		if (v_methods == kb_indexing.UNPROVIDED) {
			v_methods = (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw43$FUNCTION_EXTENT, v_methods)
				|| kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw27$NART_ARG, v_methods)) {
			return num_best_nat_lookup_index_try_all_allowed(nart_hl_formula, v_methods);
		}
		if (kb_indexing.NIL != lookup_methods_allow_onlyP((SubLObject) kb_indexing.$kw188$OVERLAP, v_methods)) {
			return virtual_indexing.estimated_num_overlap_index_for_formula(nart_hl_formula,
					(SubLObject) kb_indexing.UNPROVIDED);
		}
		return (SubLObject) kb_indexing.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 90532L)
	public static SubLObject best_nat_lookup_index_try_all_allowed(final SubLObject nart_hl_formula,
			final SubLObject v_methods) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject lookup_index = (SubLObject) kb_indexing.NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING,
					thread);
			mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
			thread.resetMultipleValues();
			final SubLObject best_fort = best_nat_lookup_index_wrt_methods(nart_hl_formula, v_methods);
			final SubLObject best_index_argnum = thread.secondMultipleValue();
			final SubLObject functor = thread.thirdMultipleValue();
			final SubLObject best_count = thread.fourthMultipleValue();
			thread.resetMultipleValues();
			if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw188$OVERLAP, v_methods)
					&& kb_indexing.NIL != virtual_indexing.lookup_should_use_index_overlapP(nart_hl_formula,
							best_count)) {
				lookup_index = lookup_index_for_overlap(nart_hl_formula);
			} else if (kb_indexing.NIL == best_fort && kb_indexing.NIL == best_index_argnum
					&& kb_indexing.NIL == functor && kb_indexing.ZERO_INTEGER.eql(best_count)) {
				lookup_index = (SubLObject) kb_indexing.NIL;
			} else if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw43$FUNCTION_EXTENT,
					v_methods) && kb_indexing.ZERO_INTEGER.eql(best_index_argnum)) {
				lookup_index = lookup_index_for_function_extent(best_fort);
			} else if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw27$NART_ARG, v_methods)
					&& kb_indexing.NIL != subl_promotions.positive_integer_p(best_index_argnum)) {
				lookup_index = lookup_index_for_nart_arg(best_fort, best_index_argnum, functor);
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return lookup_index;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 91940L)
	public static SubLObject num_best_nat_lookup_index_try_all_allowed(final SubLObject nart_hl_formula,
			final SubLObject v_methods) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject best_fort = best_nat_lookup_index_wrt_methods(nart_hl_formula, v_methods);
		final SubLObject best_index_argnum = thread.secondMultipleValue();
		final SubLObject functor = thread.thirdMultipleValue();
		final SubLObject best_count = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw188$OVERLAP, v_methods)
				&& kb_indexing.NIL != virtual_indexing.lookup_should_use_index_overlapP(nart_hl_formula, best_count)) {
			return virtual_indexing.estimated_num_overlap_index_for_formula(nart_hl_formula,
					(SubLObject) kb_indexing.UNPROVIDED);
		}
		return best_count;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 92632L)
	public static SubLObject best_nat_lookup_index_wrt_methods(final SubLObject nart_hl_formula,
			final SubLObject v_methods) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject tweaked_formula = (kb_indexing.NIL != lookup_methods_includeP(
				(SubLObject) kb_indexing.$kw43$FUNCTION_EXTENT, v_methods)
				&& kb_indexing.NIL == lookup_methods_includeP((SubLObject) kb_indexing.$kw27$NART_ARG, v_methods))
						? el_utilities.make_formula(cycl_utilities.nat_functor(nart_hl_formula),
								(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.UNPROVIDED)
						: nart_hl_formula;
		thread.resetMultipleValues();
		final SubLObject best_term = best_nat_lookup_index_int(tweaked_formula);
		final SubLObject best_index_argnum = thread.secondMultipleValue();
		final SubLObject functor = thread.thirdMultipleValue();
		final SubLObject best_count = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (kb_indexing.NIL == lookup_methods_includeP((SubLObject) kb_indexing.$kw27$NART_ARG, v_methods)
				|| kb_indexing.NIL == subl_promotions.positive_integer_p(best_index_argnum)) {
			if (kb_indexing.NIL == lookup_methods_includeP((SubLObject) kb_indexing.$kw43$FUNCTION_EXTENT, v_methods)
					|| !kb_indexing.ZERO_INTEGER.eql(best_index_argnum)) {
				if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw27$NART_ARG, v_methods)
						&& kb_indexing.ZERO_INTEGER.eql(best_index_argnum)) {
					return Values.values((SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL,
							(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.ZERO_INTEGER);
				}
			}
		}
		return Values.values(best_term, best_index_argnum, functor, best_count);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 93672L)
	public static SubLObject best_nat_lookup_index_int(final SubLObject nart_hl_formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject argnum_pairs = determine_function_indices(nart_hl_formula);
		final SubLObject others = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return decent_nat_index_from_terms(argnum_pairs);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 94117L)
	public static SubLObject decent_nat_index_from_terms(final SubLObject argnum_pairs) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject best_count = Numbers.$most_positive_fixnum$.getGlobalValue();
		SubLObject best_fort = (SubLObject) kb_indexing.NIL;
		SubLObject best_argnum = (SubLObject) kb_indexing.NIL;
		final SubLObject functor = conses_high.assoc((SubLObject) kb_indexing.ZERO_INTEGER, argnum_pairs,
				(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED).rest();
		if (kb_indexing.NIL == kb_indexing_datastructures.indexed_term_p(functor)) {
			return Values.values((SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL,
					(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL);
		}
		SubLObject cdolist_list_var = argnum_pairs;
		SubLObject cons = (SubLObject) kb_indexing.NIL;
		cons = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject argnum = (SubLObject) kb_indexing.NIL;
			SubLObject arg = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list158);
			argnum = current.first();
			current = (arg = current.rest());
			if (best_count.numG(kb_indexing.$indexing_good_enough_threshold$.getDynamicValue(thread))) {
				if (argnum.isPositive()) {
					if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(arg)) {
						final SubLObject num = num_nart_arg_index(arg, argnum, functor);
						if (num.numL(best_count)) {
							best_fort = arg;
							best_count = num;
							best_argnum = argnum;
						}
					}
				} else {
					final SubLObject num = num_function_extent_index(functor);
					if (num.numL(best_count)) {
						best_fort = functor;
						best_count = num;
						best_argnum = argnum;
					}
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return Values.values(best_fort, best_argnum, functor, best_count);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 95087L)
	public static SubLObject decent_nat_index(final SubLObject nart_hl_formula) {
		if (kb_indexing.NIL != el_utilities.formula_with_sequence_termP(nart_hl_formula)) {
			final SubLObject chopped_nart_hl_formula = cycl_utilities.formula_terms(nart_hl_formula,
					(SubLObject) kb_indexing.$kw147$IGNORE);
			return decent_nat_index(chopped_nart_hl_formula);
		}
		final SubLObject alist = determine_function_indices(nart_hl_formula);
		return decent_nat_index_from_terms(alist);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 95681L)
	public static SubLObject best_nat_index_count(final SubLObject nart_hl_formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject best_fort = decent_nat_index(nart_hl_formula);
		final SubLObject best_index = thread.secondMultipleValue();
		final SubLObject arg0 = thread.thirdMultipleValue();
		final SubLObject best_count = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		return best_count;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 96071L)
	public static SubLObject decent_rule_index(final SubLObject rule_cnf) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject best_type = (SubLObject) kb_indexing.NIL;
		SubLObject best_term = (SubLObject) kb_indexing.NIL;
		SubLObject best_total = Numbers.$most_positive_fixnum$.getGlobalValue();
		thread.resetMultipleValues();
		final SubLObject neg_pairs = determine_rule_indices(rule_cnf);
		final SubLObject pos_pairs = thread.secondMultipleValue();
		final SubLObject other = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		SubLObject cdolist_list_var = pos_pairs;
		SubLObject pos_pair = (SubLObject) kb_indexing.NIL;
		pos_pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			final SubLObject pos_indexing_type = pos_pair.first();
			final SubLObject pos_term = conses_high.second(pos_pair);
			if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(pos_term)) {
				SubLObject total = Numbers.$most_positive_fixnum$.getGlobalValue();
				SubLObject pcase_var = pos_indexing_type;
				if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
					total = num_predicate_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
					total = num_decontextualized_ist_predicate_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
					total = num_isa_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
					total = num_quoted_isa_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
					total = num_genls_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
					total = num_genl_mt_rule_index(pos_term, (SubLObject) kb_indexing.$kw137$POS,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw171$PRAGMA)) {
					total = num_pragma_rule_index(pos_term, (SubLObject) kb_indexing.UNPROVIDED,
							(SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw169$EXCEPTION)) {
					total = num_exception_rule_index(pos_term, (SubLObject) kb_indexing.UNPROVIDED,
							(SubLObject) kb_indexing.UNPROVIDED);
				} else {
					Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
							(SubLObject) kb_indexing.$str178$Don_t_know_how_to_handle_indexing, pos_indexing_type);
				}
				if (total.numL(best_total)) {
					best_total = total;
					best_term = pos_term;
					pcase_var = pos_indexing_type;
					if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
						best_type = (SubLObject) kb_indexing.$kw193$PRED_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
						best_type = (SubLObject) kb_indexing.$kw194$IST_PRED_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
						best_type = (SubLObject) kb_indexing.$kw195$ISA_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
						best_type = (SubLObject) kb_indexing.$kw196$QUOTED_ISA_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
						best_type = (SubLObject) kb_indexing.$kw197$GENLS_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
						best_type = (SubLObject) kb_indexing.$kw198$GENL_MT_POS;
					} else {
						best_type = pos_indexing_type;
					}
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			pos_pair = cdolist_list_var.first();
		}
		cdolist_list_var = neg_pairs;
		SubLObject neg_pair = (SubLObject) kb_indexing.NIL;
		neg_pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			final SubLObject neg_indexing_type = neg_pair.first();
			final SubLObject neg_term = conses_high.second(neg_pair);
			if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(neg_term)) {
				SubLObject total = Numbers.$most_positive_fixnum$.getGlobalValue();
				SubLObject pcase_var = neg_indexing_type;
				if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
					total = num_predicate_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
					total = num_decontextualized_ist_predicate_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
					total = num_isa_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
					total = num_quoted_isa_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
					total = num_genls_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
					total = num_genl_mt_rule_index(neg_term, (SubLObject) kb_indexing.$kw138$NEG,
							(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
				} else if (pcase_var.eql((SubLObject) kb_indexing.$kw167$FUNC)) {
					total = num_function_rule_index(neg_term, (SubLObject) kb_indexing.UNPROVIDED,
							(SubLObject) kb_indexing.UNPROVIDED);
				} else {
					Errors.cerror((SubLObject) kb_indexing.$str156$So_don_t_,
							(SubLObject) kb_indexing.$str178$Don_t_know_how_to_handle_indexing, neg_indexing_type);
				}
				if (total.numL(best_total)) {
					best_total = total;
					best_term = neg_term;
					pcase_var = neg_indexing_type;
					if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
						best_type = (SubLObject) kb_indexing.$kw199$PRED_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
						best_type = (SubLObject) kb_indexing.$kw200$IST_PRED_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
						best_type = (SubLObject) kb_indexing.$kw201$ISA_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
						best_type = (SubLObject) kb_indexing.$kw202$QUOTED_ISA_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
						best_type = (SubLObject) kb_indexing.$kw203$GENLS_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
						best_type = (SubLObject) kb_indexing.$kw204$GENL_MT_NEG;
					} else {
						best_type = neg_indexing_type;
					}
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			neg_pair = cdolist_list_var.first();
		}
		cdolist_list_var = other;
		SubLObject other_term = (SubLObject) kb_indexing.NIL;
		other_term = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(other_term)) {
				final SubLObject total2 = num_other_index(other_term);
				if (total2.numL(best_total)) {
					best_total = total2;
					best_term = other_term;
					best_type = (SubLObject) kb_indexing.$kw128$OTHER;
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			other_term = cdolist_list_var.first();
		}
		return Values.values(best_type, best_term);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 99846L)
	public static SubLObject all_rule_indices(final SubLObject rule_cnf) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject all_rule_indices = (SubLObject) kb_indexing.NIL;
		thread.resetMultipleValues();
		final SubLObject neg_pairs = determine_rule_indices(rule_cnf);
		final SubLObject pos_pairs = thread.secondMultipleValue();
		final SubLObject other = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		SubLObject cdolist_list_var = neg_pairs;
		SubLObject neg_pair = (SubLObject) kb_indexing.NIL;
		neg_pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = neg_pair;
			SubLObject neg_indexing_type = (SubLObject) kb_indexing.NIL;
			SubLObject v_term = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list205);
			neg_indexing_type = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list205);
			v_term = current.first();
			current = current.rest();
			if (kb_indexing.NIL == current) {
				if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
					SubLObject index_type = (SubLObject) kb_indexing.NIL;
					final SubLObject pcase_var = neg_indexing_type;
					if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
						index_type = (SubLObject) kb_indexing.$kw199$PRED_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
						index_type = (SubLObject) kb_indexing.$kw200$IST_PRED_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
						index_type = (SubLObject) kb_indexing.$kw201$ISA_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
						index_type = (SubLObject) kb_indexing.$kw202$QUOTED_ISA_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
						index_type = (SubLObject) kb_indexing.$kw203$GENLS_NEG;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
						index_type = (SubLObject) kb_indexing.$kw204$GENL_MT_NEG;
					} else {
						index_type = neg_indexing_type;
					}
					all_rule_indices = (SubLObject) ConsesLow.cons((SubLObject) ConsesLow.list(index_type, v_term),
							all_rule_indices);
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list205);
			}
			cdolist_list_var = cdolist_list_var.rest();
			neg_pair = cdolist_list_var.first();
		}
		cdolist_list_var = pos_pairs;
		SubLObject pos_pair = (SubLObject) kb_indexing.NIL;
		pos_pair = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = pos_pair;
			SubLObject pos_indexing_type = (SubLObject) kb_indexing.NIL;
			SubLObject v_term = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list206);
			pos_indexing_type = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list206);
			v_term = current.first();
			current = current.rest();
			if (kb_indexing.NIL == current) {
				if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
					SubLObject index_type = (SubLObject) kb_indexing.NIL;
					final SubLObject pcase_var = pos_indexing_type;
					if (pcase_var.eql((SubLObject) kb_indexing.$kw161$PRED)) {
						index_type = (SubLObject) kb_indexing.$kw193$PRED_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw172$IST_PRED)) {
						index_type = (SubLObject) kb_indexing.$kw194$IST_PRED_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw160$ISA)) {
						index_type = (SubLObject) kb_indexing.$kw195$ISA_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw163$QUOTED_ISA)) {
						index_type = (SubLObject) kb_indexing.$kw196$QUOTED_ISA_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw164$GENLS)) {
						index_type = (SubLObject) kb_indexing.$kw197$GENLS_POS;
					} else if (pcase_var.eql((SubLObject) kb_indexing.$kw166$GENL_MT)) {
						index_type = (SubLObject) kb_indexing.$kw198$GENL_MT_POS;
					} else {
						index_type = pos_indexing_type;
					}
					all_rule_indices = (SubLObject) ConsesLow.cons((SubLObject) ConsesLow.list(index_type, v_term),
							all_rule_indices);
				}
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_indexing.$list206);
			}
			cdolist_list_var = cdolist_list_var.rest();
			pos_pair = cdolist_list_var.first();
		}
		cdolist_list_var = other;
		SubLObject v_term2 = (SubLObject) kb_indexing.NIL;
		v_term2 = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(v_term2)) {
				all_rule_indices = (SubLObject) ConsesLow.cons(
						(SubLObject) ConsesLow.list((SubLObject) kb_indexing.$kw128$OTHER, v_term2), all_rule_indices);
			}
			cdolist_list_var = cdolist_list_var.rest();
			v_term2 = cdolist_list_var.first();
		}
		return Sequences.nreverse(all_rule_indices);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 101506L)
	public static SubLObject lookup_index_p(final SubLObject v_object) {
		return list_utilities.property_list_p(v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 101800L)
	public static SubLObject lookup_index_get_property(final SubLObject lookup_index, final SubLObject indicator,
			SubLObject v_default) {
		if (v_default == kb_indexing.UNPROVIDED) {
			v_default = (SubLObject) kb_indexing.NIL;
		}
		return conses_high.getf(lookup_index, indicator, v_default);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 102063L)
	public static SubLObject lookup_index_set_property(final SubLObject lookup_index, final SubLObject indicator,
			final SubLObject value) {
		return conses_high.putf(lookup_index, indicator, value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 102374L)
	public static SubLObject lookup_index_get_type(final SubLObject lookup_index) {
		return lookup_index_get_property(lookup_index, (SubLObject) kb_indexing.$kw207$INDEX_TYPE,
				(SubLObject) kb_indexing.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 102653L)
	public static SubLObject lookup_index_predicate_extent_value(final SubLObject lookup_index) {
		final SubLObject predicate = lookup_index_get_property(lookup_index, (SubLObject) kb_indexing.$kw208$PREDICATE,
				(SubLObject) kb_indexing.UNPROVIDED);
		return predicate;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 103224L)
	public static SubLObject lookup_index_gaf_arg_values(final SubLObject lookup_index) {
		final SubLObject v_term = lookup_index_get_property(lookup_index, (SubLObject) kb_indexing.$kw209$TERM,
				(SubLObject) kb_indexing.UNPROVIDED);
		final SubLObject argnum = lookup_index_get_property(lookup_index, (SubLObject) kb_indexing.$kw210$ARGNUM,
				(SubLObject) kb_indexing.UNPROVIDED);
		final SubLObject predicate = lookup_index_get_property(lookup_index, (SubLObject) kb_indexing.$kw208$PREDICATE,
				(SubLObject) kb_indexing.UNPROVIDED);
		return Values.values(v_term, argnum, predicate);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 103767L)
	public static SubLObject lookup_index_overlap_value(final SubLObject lookup_index) {
		final SubLObject terms = lookup_index_get_property(lookup_index, (SubLObject) kb_indexing.$kw211$TERMS,
				(SubLObject) kb_indexing.UNPROVIDED);
		return terms;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 104047L)
	public static SubLObject lookup_index_for_overlap(final SubLObject formula) {
		SubLObject lookup_index = (SubLObject) kb_indexing.NIL;
		final SubLObject terms = virtual_indexing.terms_for_overlap_index(formula);
		if (kb_indexing.NIL != list_utilities.singletonP(terms)) {
			final SubLObject v_term = terms.first();
			if (num_index(v_term).numG((SubLObject) kb_indexing.$int212$500)) {
				PrintLow.format((SubLObject) kb_indexing.T,
						(SubLObject) kb_indexing.$str213$__slow_overlap___S_for__S__, v_term, formula);
			}
		}
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw207$INDEX_TYPE,
				(SubLObject) kb_indexing.$kw188$OVERLAP);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw211$TERMS, terms);
		return lookup_index;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 104689L)
	public static SubLObject lookup_index_for_predicate_extent(final SubLObject predicate) {
		SubLObject lookup_index = (SubLObject) kb_indexing.NIL;
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw207$INDEX_TYPE,
				(SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw208$PREDICATE, predicate);
		return lookup_index;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 105124L)
	public static SubLObject lookup_index_for_function_extent(final SubLObject functor) {
		SubLObject lookup_index = (SubLObject) kb_indexing.NIL;
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw207$INDEX_TYPE,
				(SubLObject) kb_indexing.$kw43$FUNCTION_EXTENT);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw214$FUNCTOR, functor);
		return lookup_index;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 105550L)
	public static SubLObject lookup_index_for_gaf_arg(final SubLObject best_term, final SubLObject best_index_argnum,
			final SubLObject index_pred) {
		SubLObject lookup_index = (SubLObject) kb_indexing.NIL;
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw207$INDEX_TYPE,
				(SubLObject) kb_indexing.$kw19$GAF_ARG);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw209$TERM, best_term);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw210$ARGNUM,
				best_index_argnum);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw208$PREDICATE, index_pred);
		return lookup_index;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 106162L)
	public static SubLObject lookup_index_for_nart_arg(final SubLObject best_term, final SubLObject best_index_argnum,
			final SubLObject functor) {
		SubLObject lookup_index = (SubLObject) kb_indexing.NIL;
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw207$INDEX_TYPE,
				(SubLObject) kb_indexing.$kw27$NART_ARG);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw209$TERM, best_term);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw210$ARGNUM,
				best_index_argnum);
		lookup_index = lookup_index_set_property(lookup_index, (SubLObject) kb_indexing.$kw214$FUNCTOR, functor);
		return lookup_index;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 106769L)
	public static SubLObject lookup_methods_includeP(final SubLObject index_type, final SubLObject v_methods) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(kb_indexing.NIL == v_methods || kb_indexing.NIL != conses_high.member(index_type,
						v_methods, (SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 107126L)
	public static SubLObject lookup_methods_allow_onlyP(final SubLObject index_type, final SubLObject v_methods) {
		return (SubLObject) SubLObjectFactory.makeBoolean(
				kb_indexing.NIL != list_utilities.singletonP(v_methods) && index_type.eql(v_methods.first()));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 107475L)
	public static SubLObject best_gaf_lookup_index(final SubLObject asent, final SubLObject truth,
			SubLObject v_methods) {
		if (v_methods == kb_indexing.UNPROVIDED) {
			v_methods = (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT, v_methods)
				|| kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw19$GAF_ARG, v_methods)) {
			return best_gaf_lookup_index_try_all_allowed(asent, truth, v_methods);
		}
		if (kb_indexing.NIL != lookup_methods_allow_onlyP((SubLObject) kb_indexing.$kw188$OVERLAP, v_methods)) {
			return lookup_index_for_overlap(asent);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 108555L)
	public static SubLObject num_best_gaf_lookup_index(final SubLObject asent, final SubLObject truth,
			SubLObject v_methods) {
		if (v_methods == kb_indexing.UNPROVIDED) {
			v_methods = (SubLObject) kb_indexing.NIL;
		}
		if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT, v_methods)
				|| kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw19$GAF_ARG, v_methods)) {
			return num_best_gaf_lookup_index_try_all_allowed(asent, truth, v_methods);
		}
		if (kb_indexing.NIL != lookup_methods_allow_onlyP((SubLObject) kb_indexing.$kw188$OVERLAP, v_methods)) {
			return virtual_indexing.estimated_num_overlap_index_for_asent(asent, (SubLObject) kb_indexing.UNPROVIDED);
		}
		return (SubLObject) kb_indexing.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 109214L)
	public static SubLObject best_gaf_lookup_index_try_all_allowed(final SubLObject asent, final SubLObject truth,
			final SubLObject v_methods) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject lookup_index = (SubLObject) kb_indexing.NIL;
		thread.resetMultipleValues();
		final SubLObject best_fort = best_gaf_lookup_index_wrt_methods(asent, truth, v_methods);
		final SubLObject best_index_argnum = thread.secondMultipleValue();
		final SubLObject index_pred = thread.thirdMultipleValue();
		final SubLObject best_count = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw188$OVERLAP, v_methods)
				&& kb_indexing.NIL != virtual_indexing.lookup_should_use_index_overlapP(asent, best_count)) {
			lookup_index = lookup_index_for_overlap(asent);
		} else if (kb_indexing.NIL == best_fort && kb_indexing.NIL == best_index_argnum && kb_indexing.NIL == index_pred
				&& kb_indexing.ZERO_INTEGER.eql(best_count)) {
			lookup_index = (SubLObject) kb_indexing.NIL;
		} else if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT,
				v_methods) && kb_indexing.ZERO_INTEGER.eql(best_index_argnum)) {
			lookup_index = lookup_index_for_predicate_extent(best_fort);
		} else if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw19$GAF_ARG, v_methods)
				&& kb_indexing.NIL != subl_promotions.positive_integer_p(best_index_argnum)) {
			lookup_index = lookup_index_for_gaf_arg(best_fort, best_index_argnum, index_pred);
		}
		return lookup_index;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 110525L)
	public static SubLObject num_best_gaf_lookup_index_try_all_allowed(final SubLObject asent, final SubLObject truth,
			final SubLObject v_methods) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject best_fort = best_gaf_lookup_index_wrt_methods(asent, truth, v_methods);
		final SubLObject best_index_argnum = thread.secondMultipleValue();
		final SubLObject index_pred = thread.thirdMultipleValue();
		final SubLObject best_count = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw188$OVERLAP, v_methods)
				&& kb_indexing.NIL != virtual_indexing.lookup_should_use_index_overlapP(asent, best_count)) {
			return virtual_indexing.estimated_num_overlap_index_for_asent(asent, (SubLObject) kb_indexing.UNPROVIDED);
		}
		return best_count;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 111193L)
	public static SubLObject best_gaf_lookup_index_wrt_methods(final SubLObject asent, final SubLObject truth,
			final SubLObject v_methods) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject tweaked_asent = (kb_indexing.NIL != lookup_methods_includeP(
				(SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT, v_methods)
				&& kb_indexing.NIL == lookup_methods_includeP((SubLObject) kb_indexing.$kw19$GAF_ARG, v_methods))
						? el_utilities.make_formula(cycl_utilities.atomic_sentence_predicate(asent),
								(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.UNPROVIDED)
						: asent;
		thread.resetMultipleValues();
		final SubLObject best_term = best_gaf_lookup_index_int(tweaked_asent, truth);
		final SubLObject best_index_argnum = thread.secondMultipleValue();
		final SubLObject index_pred = thread.thirdMultipleValue();
		final SubLObject best_count = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (kb_indexing.NIL == lookup_methods_includeP((SubLObject) kb_indexing.$kw19$GAF_ARG, v_methods)
				|| kb_indexing.NIL == subl_promotions.positive_integer_p(best_index_argnum)) {
			if (kb_indexing.NIL == lookup_methods_includeP((SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT, v_methods)
					|| !kb_indexing.ZERO_INTEGER.eql(best_index_argnum)) {
				if (kb_indexing.NIL != lookup_methods_includeP((SubLObject) kb_indexing.$kw19$GAF_ARG, v_methods)
						&& kb_indexing.ZERO_INTEGER.eql(best_index_argnum)) {
					return subl_promotions.values4((SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL,
							(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.ZERO_INTEGER);
				}
			}
		}
		return subl_promotions.values4(best_term, best_index_argnum, index_pred, best_count);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 112849L)
	public static SubLObject best_gaf_lookup_index_int(final SubLObject asent, final SubLObject truth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject argnum_pairs = determine_formula_indices(asent);
		final SubLObject others = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject best_count = Numbers.$most_positive_fixnum$.getGlobalValue();
		SubLObject best_fort = (SubLObject) kb_indexing.NIL;
		SubLObject best_argnum = (SubLObject) kb_indexing.NIL;
		SubLObject pred = conses_high.assoc((SubLObject) kb_indexing.ZERO_INTEGER, argnum_pairs,
				(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED).rest();
		if (kb_indexing.NIL == forts.fort_p(pred)) {
			pred = (SubLObject) kb_indexing.NIL;
		}
		SubLObject cdolist_list_var = argnum_pairs;
		SubLObject cons = (SubLObject) kb_indexing.NIL;
		cons = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject argnum = (SubLObject) kb_indexing.NIL;
			SubLObject arg = (SubLObject) kb_indexing.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_indexing.$list158);
			argnum = current.first();
			current = (arg = current.rest());
			if (best_count.numG(kb_indexing.$indexing_good_enough_threshold$.getDynamicValue(thread))) {
				if (argnum.isPositive()) {
					if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(arg)) {
						final SubLObject num = num_gaf_arg_index(arg, argnum, pred,
								(SubLObject) kb_indexing.UNPROVIDED);
						if (num.numL(best_count)) {
							best_fort = arg;
							best_count = num;
							best_argnum = argnum;
						}
					}
				} else if (kb_indexing.NIL == best_argnum && kb_indexing.NIL != pred) {
					final SubLObject num = num_predicate_extent_index(pred, (SubLObject) kb_indexing.UNPROVIDED);
					if (num.numL(best_count)) {
						best_fort = arg;
						best_count = num;
						best_argnum = argnum;
					}
				}
			}
			if (kb_indexing.NIL == mt_relevance_macros.any_or_all_mts_are_relevantP()
					&& best_count.numG(kb_indexing.$indexing_good_enough_threshold$.getDynamicValue(thread))
					&& (kb_indexing.NIL == pred || kb_indexing.NIL == pred_has_heinous_mt_fanoutP(pred))) {
				if (argnum.isPositive()) {
					if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(arg)) {
						final SubLObject num = relevant_num_gaf_arg_index_with_cutoff(arg, best_count, argnum, pred);
						if (num.numL(best_count)) {
							best_fort = arg;
							best_count = num;
							best_argnum = argnum;
						}
					}
				} else if (!best_argnum.isPositive() && kb_indexing.NIL != pred) {
					SubLObject new_best_count = (SubLObject) kb_indexing.NIL;
					if (best_count.isPositive()) {
						if (best_count.numL(kb_indexing.$best_gaf_lookup_index_exact_num_predicate_extent_cutoff$
								.getDynamicValue(thread))) {
							new_best_count = relevant_num_predicate_extent_index_with_cutoff(pred, best_count);
						} else if (best_count
								.numL(kb_indexing.$best_gaf_lookup_index_zero_num_predicate_extent_cutoff$
										.getDynamicValue(thread))
								&& relevant_num_predicate_extent_index_with_cutoff(pred,
										(SubLObject) kb_indexing.ONE_INTEGER).isZero()) {
							new_best_count = (SubLObject) kb_indexing.ZERO_INTEGER;
						}
					}
					if (new_best_count.isNumber()) {
						best_fort = arg;
						best_count = new_best_count;
						best_argnum = argnum;
					}
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return subl_promotions.values4(best_fort, best_argnum, pred, best_count);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116111L)
	public static SubLObject clear_pred_has_heinous_mt_fanoutP() {
		final SubLObject cs = kb_indexing.$pred_has_heinous_mt_fanoutP_caching_state$.getGlobalValue();
		if (kb_indexing.NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116111L)
	public static SubLObject remove_pred_has_heinous_mt_fanoutP(final SubLObject pred) {
		return memoization_state.caching_state_remove_function_results_with_args(
				kb_indexing.$pred_has_heinous_mt_fanoutP_caching_state$.getGlobalValue(),
				(SubLObject) ConsesLow.list(pred), (SubLObject) kb_indexing.UNPROVIDED,
				(SubLObject) kb_indexing.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116111L)
	public static SubLObject pred_has_heinous_mt_fanoutP_internal(final SubLObject pred) {
		return Numbers.numG(Sequences.length(key_predicate_extent_index(pred)),
				kb_indexing.$pred_heinous_mt_fanout_cutoff$.getGlobalValue());
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116111L)
	public static SubLObject pred_has_heinous_mt_fanoutP(final SubLObject pred) {
		SubLObject caching_state = kb_indexing.$pred_has_heinous_mt_fanoutP_caching_state$.getGlobalValue();
		if (kb_indexing.NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(
					(SubLObject) kb_indexing.$sym218$PRED_HAS_HEINOUS_MT_FANOUT_,
					(SubLObject) kb_indexing.$sym219$_PRED_HAS_HEINOUS_MT_FANOUT__CACHING_STATE_,
					(SubLObject) kb_indexing.$int217$100, (SubLObject) kb_indexing.EQUAL,
					(SubLObject) kb_indexing.ONE_INTEGER, (SubLObject) kb_indexing.ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, pred,
				memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = Values.arg2(Values.resetMultipleValues(),
					(SubLObject) Values.multiple_value_list(pred_has_heinous_mt_fanoutP_internal(pred)));
			memoization_state.caching_state_put(caching_state, pred, results, (SubLObject) kb_indexing.UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116564L)
	public static SubLObject reindex_all_assertions() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		clear_all_existing_indexing();
		final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
		try {
			Errors.$continue_cerrorP$.bind((SubLObject) kb_indexing.T, thread);
			final SubLObject idx = assertion_handles.do_assertions_table();
			final SubLObject mess = (SubLObject) kb_indexing.$str221$Reindexing_assertions;
			final SubLObject total = id_index.id_index_count(idx);
			SubLObject sofar = (SubLObject) kb_indexing.ZERO_INTEGER;
			assert kb_indexing.NIL != Types.stringp(mess) : mess;
			final SubLObject _prev_bind_0_$15 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
			final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
			final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
			final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
			try {
				utilities_macros.$last_percent_progress_index$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
				utilities_macros.$last_percent_progress_prediction$.bind((SubLObject) kb_indexing.NIL, thread);
				utilities_macros.$within_noting_percent_progress$.bind((SubLObject) kb_indexing.T, thread);
				utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
				try {
					utilities_macros.noting_percent_progress_preamble(mess);
					final SubLObject idx_$16 = idx;
					if (kb_indexing.NIL == id_index.id_index_objects_empty_p(idx_$16,
							(SubLObject) kb_indexing.$kw114$SKIP)) {
						final SubLObject idx_$17 = idx_$16;
						if (kb_indexing.NIL == id_index.id_index_dense_objects_empty_p(idx_$17,
								(SubLObject) kb_indexing.$kw114$SKIP)) {
							final SubLObject vector_var = id_index.id_index_dense_objects(idx_$17);
							final SubLObject backwardP_var = (SubLObject) kb_indexing.NIL;
							SubLObject length;
							SubLObject v_iteration;
							SubLObject a_id;
							SubLObject a_handle;
							SubLObject ass;
							for (length = Sequences
									.length(vector_var), v_iteration = (SubLObject) kb_indexing.NIL, v_iteration = (SubLObject) kb_indexing.ZERO_INTEGER; v_iteration
											.numL(length); v_iteration = Numbers.add(v_iteration,
													(SubLObject) kb_indexing.ONE_INTEGER)) {
								a_id = ((kb_indexing.NIL != backwardP_var)
										? Numbers.subtract(length, v_iteration, (SubLObject) kb_indexing.ONE_INTEGER)
										: v_iteration);
								a_handle = Vectors.aref(vector_var, a_id);
								if (kb_indexing.NIL == id_index.id_index_tombstone_p(a_handle)
										|| kb_indexing.NIL == id_index
												.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) {
									if (kb_indexing.NIL != id_index.id_index_tombstone_p(a_handle)) {
										a_handle = (SubLObject) kb_indexing.$kw114$SKIP;
									}
									ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
									reindex_one_of_all_assertions(ass);
									sofar = Numbers.add(sofar, (SubLObject) kb_indexing.ONE_INTEGER);
									utilities_macros.note_percent_progress(sofar, total);
								}
							}
						}
						final SubLObject idx_$18 = idx_$16;
						if (kb_indexing.NIL == id_index.id_index_sparse_objects_empty_p(idx_$18)
								|| kb_indexing.NIL == id_index
										.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) {
							final SubLObject sparse = id_index.id_index_sparse_objects(idx_$18);
							SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$18);
							final SubLObject end_id = id_index.id_index_next_id(idx_$18);
							final SubLObject v_default = (SubLObject) ((kb_indexing.NIL != id_index
									.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) ? kb_indexing.NIL
											: kb_indexing.$kw114$SKIP);
							while (a_id2.numL(end_id)) {
								final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse,
										v_default);
								if (kb_indexing.NIL == id_index
										.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)
										|| kb_indexing.NIL == id_index.id_index_tombstone_p(a_handle2)) {
									final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2,
											a_handle2);
									reindex_one_of_all_assertions(ass2);
									sofar = Numbers.add(sofar, (SubLObject) kb_indexing.ONE_INTEGER);
									utilities_macros.note_percent_progress(sofar, total);
								}
								a_id2 = Numbers.add(a_id2, (SubLObject) kb_indexing.ONE_INTEGER);
							}
						}
					}
				} finally {
					final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
						final SubLObject _values = Values.getValuesAsVector();
						utilities_macros.noting_percent_progress_postamble();
						Values.restoreValuesFromVector(_values);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
					}
				}
			} finally {
				utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
				utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
				utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
				utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$15, thread);
			}
		} finally {
			Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 116987L)
	public static SubLObject clear_all_existing_indexing() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject assertions_were_indexedP = list_utilities
				.sublisp_boolean(kb_indexing_datastructures.assertion_indexing_store());
		final SubLObject constant_count = constant_handles.constant_count();
		clear_large_existing_indexing();
		SubLObject str = (SubLObject) kb_indexing.$str222$Clearing_Assertion_indexing;
		SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
		SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
		SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
		SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
		SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
		SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
		SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
		SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
		try {
			utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
			utilities_macros.$progress_last_pacification_time$
					.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$
					.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			utilities_macros.$progress_notification_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$is_noting_progressP$.bind((SubLObject) kb_indexing.T, thread);
			utilities_macros.$silent_progressP$.bind((SubLObject) ((kb_indexing.NIL != str)
					? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_indexing.T), thread);
			utilities_macros.noting_progress_preamble(str);
			kb_indexing_datastructures.clear_assertion_indexing();
			utilities_macros.noting_progress_postamble();
		} finally {
			utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
			utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
			utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
			utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
			utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
			utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
		}
		str = (SubLObject) kb_indexing.$str223$Clear_unrepresented_terms_table;
		_prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
		_prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
		_prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
		_prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
		_prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
		_prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
		_prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
		_prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
		try {
			utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
			utilities_macros.$progress_last_pacification_time$
					.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$
					.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			utilities_macros.$progress_notification_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$is_noting_progressP$.bind((SubLObject) kb_indexing.T, thread);
			utilities_macros.$silent_progressP$.bind((SubLObject) ((kb_indexing.NIL != str)
					? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_indexing.T), thread);
			utilities_macros.noting_progress_preamble(str);
			unrepresented_terms.clear_unrepresented_term_table();
			utilities_macros.noting_progress_postamble();
		} finally {
			utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
			utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
			utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
			utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
			utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
			utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
		}
		str = (SubLObject) kb_indexing.$str224$Clear_auxiliary_indexing;
		_prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
		_prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
		_prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
		_prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
		_prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
		_prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
		_prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
		_prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
		try {
			utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
			utilities_macros.$progress_last_pacification_time$
					.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$
					.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			utilities_macros.$progress_notification_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$is_noting_progressP$.bind((SubLObject) kb_indexing.T, thread);
			utilities_macros.$silent_progressP$.bind((SubLObject) ((kb_indexing.NIL != str)
					? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_indexing.T), thread);
			utilities_macros.noting_progress_preamble(str);
			SubLObject cdolist_list_var = auxiliary_indexing.auxiliary_indices();
			SubLObject aux_index = (SubLObject) kb_indexing.NIL;
			aux_index = cdolist_list_var.first();
			while (kb_indexing.NIL != cdolist_list_var) {
				auxiliary_indexing.clear_auxiliary_index(aux_index);
				cdolist_list_var = cdolist_list_var.rest();
				aux_index = cdolist_list_var.first();
			}
			utilities_macros.noting_progress_postamble();
		} finally {
			utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
			utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
			utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
			utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
			utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
			utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
		}
		if (kb_indexing.NIL != assertions_were_indexedP && constant_count
				.numG(kb_indexing.$reindex_all_assertions_full_gc_threshhold_constant_count$.getGlobalValue())) {
			Storage.gc_full();
		}
		return (SubLObject) kb_indexing.$kw225$CLEARED;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 117802L)
	public static SubLObject clear_large_existing_indexing() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject message = (SubLObject) kb_indexing.$str226$Clearing_FORT_indexing;
		final SubLObject total = forts.fort_count();
		SubLObject sofar = (SubLObject) kb_indexing.ZERO_INTEGER;
		final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
		final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
		final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
		final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
		try {
			utilities_macros.$last_percent_progress_index$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_prediction$.bind((SubLObject) kb_indexing.NIL, thread);
			utilities_macros.$within_noting_percent_progress$.bind((SubLObject) kb_indexing.T, thread);
			utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
			try {
				utilities_macros.noting_percent_progress_preamble(message);
				SubLObject cdolist_list_var = forts.do_forts_tables();
				SubLObject table_var = (SubLObject) kb_indexing.NIL;
				table_var = cdolist_list_var.first();
				while (kb_indexing.NIL != cdolist_list_var) {
					final SubLObject idx = table_var;
					if (kb_indexing.NIL == id_index.id_index_objects_empty_p(idx,
							(SubLObject) kb_indexing.$kw114$SKIP)) {
						final SubLObject idx_$20 = idx;
						if (kb_indexing.NIL == id_index.id_index_dense_objects_empty_p(idx_$20,
								(SubLObject) kb_indexing.$kw114$SKIP)) {
							final SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
							final SubLObject backwardP_var = (SubLObject) kb_indexing.NIL;
							SubLObject length;
							SubLObject v_iteration;
							SubLObject id;
							SubLObject fort;
							for (length = Sequences
									.length(vector_var), v_iteration = (SubLObject) kb_indexing.NIL, v_iteration = (SubLObject) kb_indexing.ZERO_INTEGER; v_iteration
											.numL(length); v_iteration = Numbers.add(v_iteration,
													(SubLObject) kb_indexing.ONE_INTEGER)) {
								id = ((kb_indexing.NIL != backwardP_var)
										? Numbers.subtract(length, v_iteration, (SubLObject) kb_indexing.ONE_INTEGER)
										: v_iteration);
								fort = Vectors.aref(vector_var, id);
								if (kb_indexing.NIL == id_index.id_index_tombstone_p(fort)
										|| kb_indexing.NIL == id_index
												.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) {
									if (kb_indexing.NIL != id_index.id_index_tombstone_p(fort)) {
										fort = (SubLObject) kb_indexing.$kw114$SKIP;
									}
									sofar = Numbers.add(sofar, (SubLObject) kb_indexing.ONE_INTEGER);
									utilities_macros.note_percent_progress(sofar, total);
									forts.clear_fort_index(fort);
								}
							}
						}
						final SubLObject idx_$21 = idx;
						if (kb_indexing.NIL == id_index.id_index_sparse_objects_empty_p(idx_$21)
								|| kb_indexing.NIL == id_index
										.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) {
							final SubLObject sparse = id_index.id_index_sparse_objects(idx_$21);
							SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$21);
							final SubLObject end_id = id_index.id_index_next_id(idx_$21);
							final SubLObject v_default = (SubLObject) ((kb_indexing.NIL != id_index
									.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)) ? kb_indexing.NIL
											: kb_indexing.$kw114$SKIP);
							while (id2.numL(end_id)) {
								final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
								if (kb_indexing.NIL == id_index
										.id_index_skip_tombstones_p((SubLObject) kb_indexing.$kw114$SKIP)
										|| kb_indexing.NIL == id_index.id_index_tombstone_p(fort2)) {
									sofar = Numbers.add(sofar, (SubLObject) kb_indexing.ONE_INTEGER);
									utilities_macros.note_percent_progress(sofar, total);
									forts.clear_fort_index(fort2);
								}
								id2 = Numbers.add(id2, (SubLObject) kb_indexing.ONE_INTEGER);
							}
						}
					}
					cdolist_list_var = cdolist_list_var.rest();
					table_var = cdolist_list_var.first();
				}
			} finally {
				final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					utilities_macros.noting_percent_progress_postamble();
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
				}
			}
		} finally {
			utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
			utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
			utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
			utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
		final SubLObject str = (SubLObject) kb_indexing.$str227$Clearing_Unrepresented_Term_index;
		final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
		final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
		final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$
				.currentBinding(thread);
		final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
		final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
		final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
		final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
		final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
		try {
			utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
			utilities_macros.$progress_last_pacification_time$
					.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$
					.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			utilities_macros.$progress_notification_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$progress_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
			utilities_macros.$is_noting_progressP$.bind((SubLObject) kb_indexing.T, thread);
			utilities_macros.$silent_progressP$.bind((SubLObject) ((kb_indexing.NIL != str)
					? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_indexing.T), thread);
			utilities_macros.noting_progress_preamble(str);
			unrepresented_term_index_manager.clear_unrepresented_term_index_table();
			utilities_macros.noting_progress_postamble();
		} finally {
			utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
			utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
			utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
			utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
			utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
			utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
			utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
			utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
		}
		Storage.room((SubLObject) kb_indexing.UNPROVIDED);
		return (SubLObject) kb_indexing.$kw225$CLEARED;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 118279L)
	public static SubLObject reindex_one_of_all_assertions(final SubLObject ass) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject err = (SubLObject) kb_indexing.NIL;
		try {
			thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind((SubLObject) kb_indexing.$sym228$CATCH_ERROR_MESSAGE_HANDLER, thread);
				try {
					SubLObject success_var = (SubLObject) kb_indexing.NIL;
					try {
						add_assertion_indices(ass, (SubLObject) kb_indexing.UNPROVIDED);
						success_var = (SubLObject) kb_indexing.T;
					} finally {
						final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$
								.currentBinding(thread);
						try {
							Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
							final SubLObject _values = Values.getValuesAsVector();
							if (kb_indexing.NIL == success_var) {
								SubLObject ignore_errors_tag = (SubLObject) kb_indexing.NIL;
								try {
									thread.throwStack.push(kb_indexing.$kw229$IGNORE_ERRORS_TARGET);
									final SubLObject _prev_bind_0_$24 = Errors.$error_handler$.currentBinding(thread);
									try {
										Errors.$error_handler$.bind(
												Symbols.symbol_function(
														(SubLObject) kb_indexing.$sym230$IGNORE_ERRORS_HANDLER),
												thread);
										try {
											remove_assertion_indices(ass, (SubLObject) kb_indexing.UNPROVIDED);
										} catch (Throwable catch_var) {
											Errors.handleThrowable(catch_var, (SubLObject) kb_indexing.NIL);
										}
									} finally {
										Errors.$error_handler$.rebind(_prev_bind_0_$24, thread);
									}
								} catch (Throwable ccatch_env_var) {
									ignore_errors_tag = Errors.handleThrowable(ccatch_env_var,
											(SubLObject) kb_indexing.$kw229$IGNORE_ERRORS_TARGET);
								} finally {
									thread.throwStack.pop();
								}
							}
							Values.restoreValuesFromVector(_values);
						} finally {
							Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
						}
					}
				} catch (Throwable catch_var2) {
					Errors.handleThrowable(catch_var2, (SubLObject) kb_indexing.NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (Throwable ccatch_env_var2) {
			err = Errors.handleThrowable(ccatch_env_var2,
					subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
		} finally {
			thread.throwStack.pop();
		}
		if (kb_indexing.NIL != kb_indexing.$warn_on_assertion_reindexing_errorsP$.getDynamicValue(thread)
				&& err.isString()) {
			Errors.warn((SubLObject) kb_indexing.$str231$Error_when_indexing_assertion__A_, ass, err);
		}
		return ass;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 118869L)
	public static SubLObject reindex_all_term_assertions(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject assertions = kb_accessors.all_term_assertions(v_term, (SubLObject) kb_indexing.T);
		assertions = assertion_utilities.sort_assertions(assertions);
		kb_indexing_datastructures.clear_term_index(v_term);
		final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
		try {
			Errors.$continue_cerrorP$.bind((SubLObject) kb_indexing.T, thread);
			reindex_assertions(assertions, v_term);
		} finally {
			Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
		}
		return Sequences.length(assertions);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 119356L)
	public static SubLObject reindex_assertions(final SubLObject assertions, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		SubLObject cdolist_list_var = assertions;
		SubLObject assertion = (SubLObject) kb_indexing.NIL;
		assertion = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			reindex_assertion(assertion, v_term);
			cdolist_list_var = cdolist_list_var.rest();
			assertion = cdolist_list_var.first();
		}
		return assertions;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 119725L)
	public static SubLObject reindex_assertion(final SubLObject assertion, SubLObject v_term) {
		if (v_term == kb_indexing.UNPROVIDED) {
			v_term = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (kb_indexing.NIL != assertions_high.valid_assertion(assertion, (SubLObject) kb_indexing.UNPROVIDED)) {
			final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
			try {
				Errors.$continue_cerrorP$.bind((SubLObject) kb_indexing.T, thread);
				remove_assertion_indices(assertion, v_term);
				add_assertion_indices(assertion, v_term);
			} finally {
				Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
			}
		}
		return assertion;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 120245L)
	public static SubLObject merge_term_indices(final SubLObject v_term, SubLObject indices) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		indices = Sort.sort(indices, Symbols.symbol_function((SubLObject) kb_indexing.$sym139$_),
				(SubLObject) kb_indexing.$sym232$INDEX_LEAF_COUNT);
		final SubLObject biggest = indices.first();
		final SubLObject smaller = indices.rest();
		kb_indexing_datastructures.reset_term_index(v_term, biggest);
		SubLObject cdolist_list_var = smaller;
		SubLObject smaller_index = (SubLObject) kb_indexing.NIL;
		smaller_index = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (kb_indexing.NIL != kb_indexing_datastructures.simple_index_p(smaller_index)) {
				reindex_assertions(assertion_utilities
						.sort_assertions(kb_indexing_datastructures.simple_index_leaves(smaller_index)), v_term);
			} else if (kb_indexing.NIL != kb_indexing_datastructures.complex_index_p(smaller_index)) {
				final SubLObject _prev_bind_0 = kb_indexing_datastructures.$current_complex_index_term$
						.currentBinding(thread);
				try {
					kb_indexing_datastructures.$current_complex_index_term$.bind(v_term, thread);
					kb_indexing_datastructures.merge_complex_indices(biggest, smaller_index);
				} finally {
					kb_indexing_datastructures.$current_complex_index_term$.rebind(_prev_bind_0, thread);
				}
			} else {
				Errors.error((SubLObject) kb_indexing.$str233$Unexpected_index__S_when_merging_, smaller_index, v_term);
			}
			cdolist_list_var = cdolist_list_var.rest();
			smaller_index = cdolist_list_var.first();
		}
		return v_term;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 121002L)
	public static SubLObject find_assertion(final SubLObject cnf, final SubLObject mt) {
		enforceType(cnf, kb_indexing.$sym234$CNF_P);
		enforceType(mt, kb_indexing.$sym235$POSSIBLY_HLMT_P);
		return assertions_interface.kb_lookup_assertion(cnf, mt);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 121646L)
	public static SubLObject find_assertion_internal(final SubLObject cnf, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject assertion = (SubLObject) kb_indexing.NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym241$RELEVANT_MT_IS_EQ, thread);
			mt_relevance_macros.$mt$.bind(mt, thread);
			assertion = find_cnf(cnf);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return assertion;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 121973L)
	public static SubLObject find_assertion_any_mt(final SubLObject cnf) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		enforceType(cnf, kb_indexing.$sym234$CNF_P);
		SubLObject ans = (SubLObject) kb_indexing.NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING,
					thread);
			mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
			ans = find_cnf(cnf);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 122417L)
	public static SubLObject find_assertion_genl_mts(final SubLObject cnf, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = (SubLObject) kb_indexing.NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$
					.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var),
					thread);
			ans = find_cnf(cnf);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 122779L)
	public static SubLObject find_all_assertions(final SubLObject cnf) {
		enforceType(cnf, kb_indexing.$sym234$CNF_P);
		final SubLObject assertion = find_assertion_any_mt(cnf);
		if (kb_indexing.NIL == assertion) {
			return (SubLObject) kb_indexing.NIL;
		}
		final SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
		if (kb_indexing.NIL != clause_struc) {
			return conses_high.copy_list(clause_strucs.clause_struc_assertions(clause_struc));
		}
		return (SubLObject) ConsesLow.list(assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 123410L)
	public static SubLObject find_gaf(final SubLObject gaf_formula, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		enforceType(gaf_formula, kb_indexing.$sym249$EL_FORMULA_P);
		enforceType(mt, kb_indexing.$sym250$HLMT_P);
		SubLObject ans = (SubLObject) kb_indexing.NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym241$RELEVANT_MT_IS_EQ, thread);
			mt_relevance_macros.$mt$.bind(mt, thread);
			ans = find_gaf_formula(gaf_formula);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 123991L)
	public static SubLObject find_gaf_any_mt(final SubLObject gaf_formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		enforceType(gaf_formula, kb_indexing.$sym249$EL_FORMULA_P);
		SubLObject ans = (SubLObject) kb_indexing.NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING,
					thread);
			mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
			ans = find_gaf_formula(gaf_formula);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 124488L)
	public static SubLObject find_gaf_genl_mts(final SubLObject gaf_formula, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = (SubLObject) kb_indexing.NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym259$RELEVANT_MT_IS_GENL_MT,
					thread);
			mt_relevance_macros.$mt$.bind(mt, thread);
			ans = find_gaf_formula(gaf_formula);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 124860L)
	public static SubLObject find_all_gafs(final SubLObject gaf_formula) {
		enforceType(gaf_formula, kb_indexing.$sym249$EL_FORMULA_P);
		final SubLObject assertion = find_gaf_any_mt(gaf_formula);
		if (kb_indexing.NIL == assertion) {
			return (SubLObject) kb_indexing.NIL;
		}
		final SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
		if (kb_indexing.NIL != clause_struc) {
			return conses_high.copy_list(clause_strucs.clause_struc_assertions(clause_struc));
		}
		return (SubLObject) ConsesLow.list(assertion);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 125513L)
	public static SubLObject count_all_gafs(final SubLObject gaf_formula) {
		final SubLObject assertion = find_gaf_any_mt(gaf_formula);
		if (kb_indexing.NIL != assertion) {
			return sibling_mt_assertion_count(assertion, (SubLObject) kb_indexing.NIL);
		}
		return (SubLObject) kb_indexing.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 125772L)
	public static SubLObject find_gaf_in_relevant_mt(final SubLObject gaf_formula) {
		return find_gaf_formula(gaf_formula);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 126102L)
	public static SubLObject find_gaf_possibly_in_mt(final SubLObject gaf_formula, SubLObject mt) {
		if (mt == kb_indexing.UNPROVIDED) {
			mt = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject assertion = (SubLObject) kb_indexing.NIL;
		final SubLObject mt_var = mt;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$
					.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
			assertion = find_gaf_in_relevant_mt(gaf_formula);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return assertion;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 126520L)
	public static SubLObject gaf_mts(final SubLObject gaf_formula) {
		return Mapping.mapcar(Symbols.symbol_function((SubLObject) kb_indexing.$sym135$ASSERTION_MT),
				find_all_gafs(gaf_formula));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 126732L)
	public static SubLObject sibling_mt_assertions(final SubLObject assertion, SubLObject exclusiveP) {
		if (exclusiveP == kb_indexing.UNPROVIDED) {
			exclusiveP = (SubLObject) kb_indexing.T;
		}
		final SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
		if (kb_indexing.NIL != clause_struc) {
			final SubLObject sibling_assertions = conses_high
					.copy_list(clause_strucs.clause_struc_assertions(clause_struc));
			if (kb_indexing.NIL != exclusiveP) {
				return Sequences.delete(assertion, sibling_assertions, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED,
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
			}
			return sibling_assertions;
		} else {
			if (kb_indexing.NIL != exclusiveP) {
				return (SubLObject) kb_indexing.NIL;
			}
			return (SubLObject) ConsesLow.list(assertion);
		}
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 127384L)
	public static SubLObject sibling_mt_assertion_count(final SubLObject assertion, SubLObject exclusiveP) {
		if (exclusiveP == kb_indexing.UNPROVIDED) {
			exclusiveP = (SubLObject) kb_indexing.T;
		}
		assert kb_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
		final SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
		return (SubLObject) ((kb_indexing.NIL != clause_struc)
				? Numbers.subtract(Sequences.length(clause_strucs.clause_struc_assertions(clause_struc)),
						(SubLObject) ((kb_indexing.NIL != exclusiveP) ? kb_indexing.ONE_INTEGER
								: kb_indexing.ZERO_INTEGER))
				: ((kb_indexing.NIL != exclusiveP) ? kb_indexing.ZERO_INTEGER : kb_indexing.ONE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 127940L)
	public static SubLObject find_cnf(final SubLObject cnf) {
		assert kb_indexing.NIL != clauses.cnf_p(cnf) : cnf;
		if (kb_indexing.NIL != clauses.gaf_cnfP(cnf)) {
			return find_gaf_cnf(cnf);
		}
		return find_rule_cnf(cnf);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 128223L)
	public static SubLObject find_gaf_cnf(final SubLObject cnf) {
		return find_gaf_formula(assertions_low.cnf_to_gaf_formula(cnf));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 128379L)
	public static SubLObject find_rule_cnf(final SubLObject cnf) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject index = decent_rule_index(cnf);
		final SubLObject v_term = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return find_rule_cnf_via_index_int(cnf, index, v_term);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 128602L)
	public static SubLObject find_rule_cnf_via_index(final SubLObject cnf, final SubLObject rule_index_spec) {
		SubLObject index = (SubLObject) kb_indexing.NIL;
		SubLObject v_term = (SubLObject) kb_indexing.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(rule_index_spec, rule_index_spec,
				(SubLObject) kb_indexing.$list262);
		index = rule_index_spec.first();
		SubLObject current = rule_index_spec.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, rule_index_spec, (SubLObject) kb_indexing.$list262);
		v_term = current.first();
		current = current.rest();
		if (kb_indexing.NIL == current) {
			return find_rule_cnf_via_index_int(cnf, index, v_term);
		}
		cdestructuring_bind.cdestructuring_bind_error(rule_index_spec, (SubLObject) kb_indexing.$list262);
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 128954L)
	public static SubLObject find_rule_cnf_via_index_int(final SubLObject cnf, final SubLObject index,
			final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
			final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
			final SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
			try {
				control_vars.$mapping_target$.bind(cnf, thread);
				control_vars.$mapping_answer$.bind((SubLObject) kb_indexing.NIL, thread);
				SubLObject catch_var = (SubLObject) kb_indexing.NIL;
				try {
					thread.throwStack.push(kb_indexing.$kw263$MAPPING_DONE);
					if (index.eql((SubLObject) kb_indexing.$kw128$OTHER)) {
						kb_mapping.map_other_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL);
					} else if (index.eql((SubLObject) kb_indexing.$kw199$PRED_NEG)) {
						kb_mapping.map_predicate_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw138$NEG, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw193$PRED_POS)) {
						kb_mapping.map_predicate_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw137$POS, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw200$IST_PRED_NEG)) {
						kb_mapping.map_decontextualized_ist_predicate_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw138$NEG, (SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw194$IST_PRED_POS)) {
						kb_mapping.map_decontextualized_ist_predicate_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw137$POS, (SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw201$ISA_NEG)) {
						kb_mapping.map_isa_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw138$NEG, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw195$ISA_POS)) {
						kb_mapping.map_isa_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw137$POS, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw202$QUOTED_ISA_NEG)) {
						kb_mapping.map_quoted_isa_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw138$NEG, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw196$QUOTED_ISA_POS)) {
						kb_mapping.map_quoted_isa_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw137$POS, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw203$GENLS_NEG)) {
						kb_mapping.map_genls_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw138$NEG, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw197$GENLS_POS)) {
						kb_mapping.map_genls_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw137$POS, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw204$GENL_MT_NEG)) {
						kb_mapping.map_genl_mt_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw138$NEG, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw198$GENL_MT_POS)) {
						kb_mapping.map_genl_mt_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.$kw137$POS, (SubLObject) kb_indexing.UNPROVIDED,
								(SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw167$FUNC)) {
						kb_mapping.map_function_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw169$EXCEPTION)) {
						kb_mapping.map_exception_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
					} else if (index.eql((SubLObject) kb_indexing.$kw171$PRAGMA)) {
						kb_mapping.map_pragma_rule_index(
								Symbols.symbol_function((SubLObject) kb_indexing.$sym264$FIND_CNF_INTERNAL), v_term,
								(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED);
					}
				} catch (Throwable ccatch_env_var) {
					catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject) kb_indexing.$kw263$MAPPING_DONE);
				} finally {
					thread.throwStack.pop();
				}
				ans = control_vars.$mapping_answer$.getDynamicValue(thread);
			} finally {
				control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
				control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
			}
		}
		return ans;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 130585L)
	public static SubLObject find_cnf_internal(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (kb_indexing.NIL != control_vars.$mapping_target$.getDynamicValue(thread)
				&& kb_indexing.NIL != assertions_high.valid_assertion(assertion, (SubLObject) kb_indexing.UNPROVIDED)) {
			final SubLObject cnf = assertions_high.assertion_cnf(assertion);
			final SubLObject _prev_bind_0 = control_vars.$candidate_assertion$.currentBinding(thread);
			try {
				control_vars.$candidate_assertion$.bind(assertion, thread);
				if (kb_indexing.NIL != Functions.funcall(control_vars.$cnf_matching_predicate$.getDynamicValue(thread),
						cnf, control_vars.$mapping_target$.getDynamicValue(thread))) {
					control_vars.$mapping_answer$.setDynamicValue(assertion, thread);
					utilities_macros.mapping_finished();
				}
			} finally {
				control_vars.$candidate_assertion$.rebind(_prev_bind_0, thread);
			}
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 130998L)
	public static SubLObject find_gaf_formula(final SubLObject gaf_formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = (SubLObject) kb_indexing.NIL;
		final SubLObject l_index = best_gaf_lookup_index(gaf_formula, (SubLObject) kb_indexing.NIL,
				(SubLObject) kb_indexing.NIL);
		final SubLObject pcase_var;
		final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
		if (pcase_var.eql((SubLObject) kb_indexing.$kw19$GAF_ARG)) {
			thread.resetMultipleValues();
			final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
			final SubLObject argnum = thread.secondMultipleValue();
			final SubLObject predicate = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			if (kb_indexing.NIL != argnum) {
				if (kb_indexing.NIL != predicate) {
					final SubLObject pred_var = predicate;
					if (kb_indexing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
						final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term,
								argnum, pred_var);
						SubLObject done_var = result;
						final SubLObject token_var = (SubLObject) kb_indexing.NIL;
						while (kb_indexing.NIL == done_var) {
							final SubLObject final_index_spec = iteration
									.iteration_next_without_values_macro_helper(iterator_var, token_var);
							final SubLObject valid = (SubLObject) SubLObjectFactory
									.makeBoolean(!token_var.eql(final_index_spec));
							if (kb_indexing.NIL != valid) {
								SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
								try {
									final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
											(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
											(SubLObject) kb_indexing.NIL);
									SubLObject done_var_$25 = result;
									final SubLObject token_var_$26 = (SubLObject) kb_indexing.NIL;
									while (kb_indexing.NIL == done_var_$25) {
										final SubLObject assertion = iteration
												.iteration_next_without_values_macro_helper(final_index_iterator,
														token_var_$26);
										final SubLObject valid_$27 = (SubLObject) SubLObjectFactory
												.makeBoolean(!token_var_$26.eql(assertion));
										if (kb_indexing.NIL != valid_$27) {
											final SubLObject possible_result = find_gaf_internal(assertion,
													gaf_formula);
											if (kb_indexing.NIL != possible_result) {
												result = possible_result;
											}
										}
										done_var_$25 = (SubLObject) SubLObjectFactory
												.makeBoolean(kb_indexing.NIL == valid_$27 || kb_indexing.NIL != result);
									}
								} finally {
									final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$
											.currentBinding(thread);
									try {
										Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T,
												thread);
										final SubLObject _values = Values.getValuesAsVector();
										if (kb_indexing.NIL != final_index_iterator) {
											kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
										}
										Values.restoreValuesFromVector(_values);
									} finally {
										Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
									}
								}
							}
							done_var = (SubLObject) SubLObjectFactory
									.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != result);
						}
					}
				} else {
					final SubLObject pred_var = (SubLObject) kb_indexing.NIL;
					if (kb_indexing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
						final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term,
								argnum, pred_var);
						SubLObject done_var = result;
						final SubLObject token_var = (SubLObject) kb_indexing.NIL;
						while (kb_indexing.NIL == done_var) {
							final SubLObject final_index_spec = iteration
									.iteration_next_without_values_macro_helper(iterator_var, token_var);
							final SubLObject valid = (SubLObject) SubLObjectFactory
									.makeBoolean(!token_var.eql(final_index_spec));
							if (kb_indexing.NIL != valid) {
								SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
								try {
									final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
											(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
											(SubLObject) kb_indexing.NIL);
									SubLObject done_var_$26 = result;
									final SubLObject token_var_$27 = (SubLObject) kb_indexing.NIL;
									while (kb_indexing.NIL == done_var_$26) {
										final SubLObject assertion = iteration
												.iteration_next_without_values_macro_helper(final_index_iterator,
														token_var_$27);
										final SubLObject valid_$28 = (SubLObject) SubLObjectFactory
												.makeBoolean(!token_var_$27.eql(assertion));
										if (kb_indexing.NIL != valid_$28) {
											final SubLObject possible_result = find_gaf_internal(assertion,
													gaf_formula);
											if (kb_indexing.NIL != possible_result) {
												result = possible_result;
											}
										}
										done_var_$26 = (SubLObject) SubLObjectFactory
												.makeBoolean(kb_indexing.NIL == valid_$28 || kb_indexing.NIL != result);
									}
								} finally {
									final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$
											.currentBinding(thread);
									try {
										Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T,
												thread);
										final SubLObject _values2 = Values.getValuesAsVector();
										if (kb_indexing.NIL != final_index_iterator) {
											kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
										}
										Values.restoreValuesFromVector(_values2);
									} finally {
										Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
									}
								}
							}
							done_var = (SubLObject) SubLObjectFactory
									.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != result);
						}
					}
				}
			} else if (kb_indexing.NIL != predicate) {
				final SubLObject pred_var = predicate;
				if (kb_indexing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term,
						(SubLObject) kb_indexing.NIL, pred_var)) {
					final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term,
							(SubLObject) kb_indexing.NIL, pred_var);
					SubLObject done_var = result;
					final SubLObject token_var = (SubLObject) kb_indexing.NIL;
					while (kb_indexing.NIL == done_var) {
						final SubLObject final_index_spec = iteration
								.iteration_next_without_values_macro_helper(iterator_var, token_var);
						final SubLObject valid = (SubLObject) SubLObjectFactory
								.makeBoolean(!token_var.eql(final_index_spec));
						if (kb_indexing.NIL != valid) {
							SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
										(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
										(SubLObject) kb_indexing.NIL);
								SubLObject done_var_$27 = result;
								final SubLObject token_var_$28 = (SubLObject) kb_indexing.NIL;
								while (kb_indexing.NIL == done_var_$27) {
									final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(
											final_index_iterator, token_var_$28);
									final SubLObject valid_$29 = (SubLObject) SubLObjectFactory
											.makeBoolean(!token_var_$28.eql(assertion));
									if (kb_indexing.NIL != valid_$29) {
										final SubLObject possible_result = find_gaf_internal(assertion, gaf_formula);
										if (kb_indexing.NIL != possible_result) {
											result = possible_result;
										}
									}
									done_var_$27 = (SubLObject) SubLObjectFactory
											.makeBoolean(kb_indexing.NIL == valid_$29 || kb_indexing.NIL != result);
								}
							} finally {
								final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$
										.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
									final SubLObject _values3 = Values.getValuesAsVector();
									if (kb_indexing.NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values3);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
								}
							}
						}
						done_var = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != result);
					}
				}
			} else {
				final SubLObject pred_var = (SubLObject) kb_indexing.NIL;
				if (kb_indexing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term,
						(SubLObject) kb_indexing.NIL, pred_var)) {
					final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term,
							(SubLObject) kb_indexing.NIL, pred_var);
					SubLObject done_var = result;
					final SubLObject token_var = (SubLObject) kb_indexing.NIL;
					while (kb_indexing.NIL == done_var) {
						final SubLObject final_index_spec = iteration
								.iteration_next_without_values_macro_helper(iterator_var, token_var);
						final SubLObject valid = (SubLObject) SubLObjectFactory
								.makeBoolean(!token_var.eql(final_index_spec));
						if (kb_indexing.NIL != valid) {
							SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
										(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
										(SubLObject) kb_indexing.NIL);
								SubLObject done_var_$28 = result;
								final SubLObject token_var_$29 = (SubLObject) kb_indexing.NIL;
								while (kb_indexing.NIL == done_var_$28) {
									final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(
											final_index_iterator, token_var_$29);
									final SubLObject valid_$30 = (SubLObject) SubLObjectFactory
											.makeBoolean(!token_var_$29.eql(assertion));
									if (kb_indexing.NIL != valid_$30) {
										final SubLObject possible_result = find_gaf_internal(assertion, gaf_formula);
										if (kb_indexing.NIL != possible_result) {
											result = possible_result;
										}
									}
									done_var_$28 = (SubLObject) SubLObjectFactory
											.makeBoolean(kb_indexing.NIL == valid_$30 || kb_indexing.NIL != result);
								}
							} finally {
								final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$
										.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
									final SubLObject _values4 = Values.getValuesAsVector();
									if (kb_indexing.NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values4);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
								}
							}
						}
						done_var = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != result);
					}
				}
			}
		} else if (pcase_var.eql((SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT)) {
			final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
			if (kb_indexing.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
				final SubLObject str = (SubLObject) kb_indexing.NIL;
				final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
				final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$
						.currentBinding(thread);
				final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$
						.currentBinding(thread);
				final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
				final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$
						.currentBinding(thread);
				final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
				final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
				final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
				try {
					utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
					utilities_macros.$progress_last_pacification_time$
							.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
					utilities_macros.$progress_elapsed_seconds_for_notification$.bind(
							utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread),
							thread);
					utilities_macros.$progress_notification_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
					utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject) kb_indexing.ZERO_INTEGER,
							thread);
					utilities_macros.$progress_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
					utilities_macros.$is_noting_progressP$.bind((SubLObject) kb_indexing.T, thread);
					utilities_macros.$silent_progressP$.bind(
							(SubLObject) ((kb_indexing.NIL != str)
									? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_indexing.T),
							thread);
					utilities_macros.noting_progress_preamble(str);
					final SubLObject iterator_var2 = kb_mapping_macros
							.new_predicate_extent_final_index_spec_iterator(pred_var2);
					SubLObject done_var2 = result;
					final SubLObject token_var2 = (SubLObject) kb_indexing.NIL;
					while (kb_indexing.NIL == done_var2) {
						final SubLObject final_index_spec2 = iteration
								.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
						final SubLObject valid2 = (SubLObject) SubLObjectFactory
								.makeBoolean(!token_var2.eql(final_index_spec2));
						if (kb_indexing.NIL != valid2) {
							utilities_macros.note_progress();
							SubLObject final_index_iterator2 = (SubLObject) kb_indexing.NIL;
							try {
								final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2,
										(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
										(SubLObject) kb_indexing.NIL);
								SubLObject done_var_$29 = result;
								final SubLObject token_var_$30 = (SubLObject) kb_indexing.NIL;
								while (kb_indexing.NIL == done_var_$29) {
									final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(
											final_index_iterator2, token_var_$30);
									final SubLObject valid_$31 = (SubLObject) SubLObjectFactory
											.makeBoolean(!token_var_$30.eql(assertion2));
									if (kb_indexing.NIL != valid_$31) {
										final SubLObject possible_result2 = find_gaf_internal(assertion2, gaf_formula);
										if (kb_indexing.NIL != possible_result2) {
											result = possible_result2;
										}
									}
									done_var_$29 = (SubLObject) SubLObjectFactory
											.makeBoolean(kb_indexing.NIL == valid_$31 || kb_indexing.NIL != result);
								}
							} finally {
								final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$
										.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
									final SubLObject _values5 = Values.getValuesAsVector();
									if (kb_indexing.NIL != final_index_iterator2) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
									}
									Values.restoreValuesFromVector(_values5);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
								}
							}
						}
						done_var2 = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid2 || kb_indexing.NIL != result);
					}
					utilities_macros.noting_progress_postamble();
				} finally {
					utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
					utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
					utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
					utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
					utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
					utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
					utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
					utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
				}
			}
		} else if (pcase_var.eql((SubLObject) kb_indexing.$kw188$OVERLAP)) {
			SubLObject rest;
			SubLObject assertion3;
			SubLObject possible_result3;
			for (rest = (SubLObject) kb_indexing.NIL, rest = virtual_indexing.gather_overlap_index(
					kb_mapping_macros.do_gli_vo_extract_key(l_index),
					(SubLObject) kb_indexing.UNPROVIDED); kb_indexing.NIL == result
							&& kb_indexing.NIL != rest; rest = rest.rest()) {
				assertion3 = rest.first();
				possible_result3 = find_gaf_internal(assertion3, gaf_formula);
				if (kb_indexing.NIL != possible_result3) {
					result = possible_result3;
				}
			}
		} else {
			kb_mapping_macros.do_gli_method_error(l_index, method);
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 131472L)
	public static SubLObject find_gaf_internal(final SubLObject assertion, final SubLObject sentence) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != sentence
				&& kb_indexing.NIL != assertions_high.valid_assertion(assertion, (SubLObject) kb_indexing.UNPROVIDED)
				&& kb_indexing.NIL != assertions_high.gaf_assertionP(assertion)) {
			final SubLObject gaf = assertions_high.assertion_gaf_hl_formula(assertion);
			final SubLObject _prev_bind_0 = control_vars.$candidate_assertion$.currentBinding(thread);
			try {
				control_vars.$candidate_assertion$.bind(assertion, thread);
				if (kb_indexing.NIL != Functions.funcall(control_vars.$gaf_matching_predicate$.getDynamicValue(thread),
						gaf, sentence)) {
					result = assertion;
				}
			} finally {
				control_vars.$candidate_assertion$.rebind(_prev_bind_0, thread);
			}
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 131916L)
	public static SubLObject asent_kb_lookup(final SubLObject asent, SubLObject cutoff) {
		if (cutoff == kb_indexing.UNPROVIDED) {
			cutoff = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = (SubLObject) kb_indexing.NIL;
		SubLObject doneP = (SubLObject) kb_indexing.NIL;
		SubLObject count = (SubLObject) kb_indexing.ZERO_INTEGER;
		final SubLObject l_index = best_gaf_lookup_index(asent, (SubLObject) kb_indexing.NIL,
				(SubLObject) kb_indexing.NIL);
		final SubLObject pcase_var;
		final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
		if (pcase_var.eql((SubLObject) kb_indexing.$kw19$GAF_ARG)) {
			thread.resetMultipleValues();
			final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
			final SubLObject argnum = thread.secondMultipleValue();
			final SubLObject predicate = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			if (kb_indexing.NIL != argnum) {
				if (kb_indexing.NIL != predicate) {
					final SubLObject pred_var = predicate;
					if (kb_indexing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
						final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term,
								argnum, pred_var);
						SubLObject done_var = doneP;
						final SubLObject token_var = (SubLObject) kb_indexing.NIL;
						while (kb_indexing.NIL == done_var) {
							final SubLObject final_index_spec = iteration
									.iteration_next_without_values_macro_helper(iterator_var, token_var);
							final SubLObject valid = (SubLObject) SubLObjectFactory
									.makeBoolean(!token_var.eql(final_index_spec));
							if (kb_indexing.NIL != valid) {
								SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
								try {
									final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
											(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
											(SubLObject) kb_indexing.NIL);
									SubLObject done_var_$41 = doneP;
									final SubLObject token_var_$42 = (SubLObject) kb_indexing.NIL;
									while (kb_indexing.NIL == done_var_$41) {
										final SubLObject assertion = iteration
												.iteration_next_without_values_macro_helper(final_index_iterator,
														token_var_$42);
										final SubLObject valid_$43 = (SubLObject) SubLObjectFactory
												.makeBoolean(!token_var_$42.eql(assertion));
										if (kb_indexing.NIL != valid_$43) {
											if (kb_indexing.NIL != unification_utilities.asent_unify(asent,
													assertions_high.gaf_formula(assertion),
													(SubLObject) kb_indexing.UNPROVIDED,
													(SubLObject) kb_indexing.UNPROVIDED)) {
												result = assertion;
												doneP = (SubLObject) kb_indexing.T;
											} else if (kb_indexing.NIL != cutoff) {
												count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
												if (count.numGE(cutoff)) {
													result = (SubLObject) kb_indexing.$kw266$CUTOFF;
													doneP = (SubLObject) kb_indexing.T;
												}
											}
										}
										done_var_$41 = (SubLObject) SubLObjectFactory
												.makeBoolean(kb_indexing.NIL == valid_$43 || kb_indexing.NIL != doneP);
									}
								} finally {
									final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$
											.currentBinding(thread);
									try {
										Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T,
												thread);
										final SubLObject _values = Values.getValuesAsVector();
										if (kb_indexing.NIL != final_index_iterator) {
											kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
										}
										Values.restoreValuesFromVector(_values);
									} finally {
										Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
									}
								}
							}
							done_var = (SubLObject) SubLObjectFactory
									.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != doneP);
						}
					}
				} else {
					final SubLObject pred_var = (SubLObject) kb_indexing.NIL;
					if (kb_indexing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
						final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term,
								argnum, pred_var);
						SubLObject done_var = doneP;
						final SubLObject token_var = (SubLObject) kb_indexing.NIL;
						while (kb_indexing.NIL == done_var) {
							final SubLObject final_index_spec = iteration
									.iteration_next_without_values_macro_helper(iterator_var, token_var);
							final SubLObject valid = (SubLObject) SubLObjectFactory
									.makeBoolean(!token_var.eql(final_index_spec));
							if (kb_indexing.NIL != valid) {
								SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
								try {
									final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
											(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
											(SubLObject) kb_indexing.NIL);
									SubLObject done_var_$42 = doneP;
									final SubLObject token_var_$43 = (SubLObject) kb_indexing.NIL;
									while (kb_indexing.NIL == done_var_$42) {
										final SubLObject assertion = iteration
												.iteration_next_without_values_macro_helper(final_index_iterator,
														token_var_$43);
										final SubLObject valid_$44 = (SubLObject) SubLObjectFactory
												.makeBoolean(!token_var_$43.eql(assertion));
										if (kb_indexing.NIL != valid_$44) {
											if (kb_indexing.NIL != unification_utilities.asent_unify(asent,
													assertions_high.gaf_formula(assertion),
													(SubLObject) kb_indexing.UNPROVIDED,
													(SubLObject) kb_indexing.UNPROVIDED)) {
												result = assertion;
												doneP = (SubLObject) kb_indexing.T;
											} else if (kb_indexing.NIL != cutoff) {
												count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
												if (count.numGE(cutoff)) {
													result = (SubLObject) kb_indexing.$kw266$CUTOFF;
													doneP = (SubLObject) kb_indexing.T;
												}
											}
										}
										done_var_$42 = (SubLObject) SubLObjectFactory
												.makeBoolean(kb_indexing.NIL == valid_$44 || kb_indexing.NIL != doneP);
									}
								} finally {
									final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$
											.currentBinding(thread);
									try {
										Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T,
												thread);
										final SubLObject _values2 = Values.getValuesAsVector();
										if (kb_indexing.NIL != final_index_iterator) {
											kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
										}
										Values.restoreValuesFromVector(_values2);
									} finally {
										Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
									}
								}
							}
							done_var = (SubLObject) SubLObjectFactory
									.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != doneP);
						}
					}
				}
			} else if (kb_indexing.NIL != predicate) {
				final SubLObject pred_var = predicate;
				if (kb_indexing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term,
						(SubLObject) kb_indexing.NIL, pred_var)) {
					final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term,
							(SubLObject) kb_indexing.NIL, pred_var);
					SubLObject done_var = doneP;
					final SubLObject token_var = (SubLObject) kb_indexing.NIL;
					while (kb_indexing.NIL == done_var) {
						final SubLObject final_index_spec = iteration
								.iteration_next_without_values_macro_helper(iterator_var, token_var);
						final SubLObject valid = (SubLObject) SubLObjectFactory
								.makeBoolean(!token_var.eql(final_index_spec));
						if (kb_indexing.NIL != valid) {
							SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
										(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
										(SubLObject) kb_indexing.NIL);
								SubLObject done_var_$43 = doneP;
								final SubLObject token_var_$44 = (SubLObject) kb_indexing.NIL;
								while (kb_indexing.NIL == done_var_$43) {
									final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(
											final_index_iterator, token_var_$44);
									final SubLObject valid_$45 = (SubLObject) SubLObjectFactory
											.makeBoolean(!token_var_$44.eql(assertion));
									if (kb_indexing.NIL != valid_$45) {
										if (kb_indexing.NIL != unification_utilities.asent_unify(asent,
												assertions_high.gaf_formula(assertion),
												(SubLObject) kb_indexing.UNPROVIDED,
												(SubLObject) kb_indexing.UNPROVIDED)) {
											result = assertion;
											doneP = (SubLObject) kb_indexing.T;
										} else if (kb_indexing.NIL != cutoff) {
											count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
											if (count.numGE(cutoff)) {
												result = (SubLObject) kb_indexing.$kw266$CUTOFF;
												doneP = (SubLObject) kb_indexing.T;
											}
										}
									}
									done_var_$43 = (SubLObject) SubLObjectFactory
											.makeBoolean(kb_indexing.NIL == valid_$45 || kb_indexing.NIL != doneP);
								}
							} finally {
								final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$
										.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
									final SubLObject _values3 = Values.getValuesAsVector();
									if (kb_indexing.NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values3);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
								}
							}
						}
						done_var = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != doneP);
					}
				}
			} else {
				final SubLObject pred_var = (SubLObject) kb_indexing.NIL;
				if (kb_indexing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term,
						(SubLObject) kb_indexing.NIL, pred_var)) {
					final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term,
							(SubLObject) kb_indexing.NIL, pred_var);
					SubLObject done_var = doneP;
					final SubLObject token_var = (SubLObject) kb_indexing.NIL;
					while (kb_indexing.NIL == done_var) {
						final SubLObject final_index_spec = iteration
								.iteration_next_without_values_macro_helper(iterator_var, token_var);
						final SubLObject valid = (SubLObject) SubLObjectFactory
								.makeBoolean(!token_var.eql(final_index_spec));
						if (kb_indexing.NIL != valid) {
							SubLObject final_index_iterator = (SubLObject) kb_indexing.NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec,
										(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
										(SubLObject) kb_indexing.NIL);
								SubLObject done_var_$44 = doneP;
								final SubLObject token_var_$45 = (SubLObject) kb_indexing.NIL;
								while (kb_indexing.NIL == done_var_$44) {
									final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(
											final_index_iterator, token_var_$45);
									final SubLObject valid_$46 = (SubLObject) SubLObjectFactory
											.makeBoolean(!token_var_$45.eql(assertion));
									if (kb_indexing.NIL != valid_$46) {
										if (kb_indexing.NIL != unification_utilities.asent_unify(asent,
												assertions_high.gaf_formula(assertion),
												(SubLObject) kb_indexing.UNPROVIDED,
												(SubLObject) kb_indexing.UNPROVIDED)) {
											result = assertion;
											doneP = (SubLObject) kb_indexing.T;
										} else if (kb_indexing.NIL != cutoff) {
											count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
											if (count.numGE(cutoff)) {
												result = (SubLObject) kb_indexing.$kw266$CUTOFF;
												doneP = (SubLObject) kb_indexing.T;
											}
										}
									}
									done_var_$44 = (SubLObject) SubLObjectFactory
											.makeBoolean(kb_indexing.NIL == valid_$46 || kb_indexing.NIL != doneP);
								}
							} finally {
								final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$
										.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
									final SubLObject _values4 = Values.getValuesAsVector();
									if (kb_indexing.NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									Values.restoreValuesFromVector(_values4);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
								}
							}
						}
						done_var = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid || kb_indexing.NIL != doneP);
					}
				}
			}
		} else if (pcase_var.eql((SubLObject) kb_indexing.$kw37$PREDICATE_EXTENT)) {
			final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
			if (kb_indexing.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
				final SubLObject str = (SubLObject) kb_indexing.NIL;
				final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
				final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$
						.currentBinding(thread);
				final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$
						.currentBinding(thread);
				final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
				final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$
						.currentBinding(thread);
				final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
				final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
				final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
				try {
					utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
					utilities_macros.$progress_last_pacification_time$
							.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
					utilities_macros.$progress_elapsed_seconds_for_notification$.bind(
							utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread),
							thread);
					utilities_macros.$progress_notification_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
					utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject) kb_indexing.ZERO_INTEGER,
							thread);
					utilities_macros.$progress_count$.bind((SubLObject) kb_indexing.ZERO_INTEGER, thread);
					utilities_macros.$is_noting_progressP$.bind((SubLObject) kb_indexing.T, thread);
					utilities_macros.$silent_progressP$.bind(
							(SubLObject) ((kb_indexing.NIL != str)
									? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_indexing.T),
							thread);
					utilities_macros.noting_progress_preamble(str);
					final SubLObject iterator_var2 = kb_mapping_macros
							.new_predicate_extent_final_index_spec_iterator(pred_var2);
					SubLObject done_var2 = doneP;
					final SubLObject token_var2 = (SubLObject) kb_indexing.NIL;
					while (kb_indexing.NIL == done_var2) {
						final SubLObject final_index_spec2 = iteration
								.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
						final SubLObject valid2 = (SubLObject) SubLObjectFactory
								.makeBoolean(!token_var2.eql(final_index_spec2));
						if (kb_indexing.NIL != valid2) {
							utilities_macros.note_progress();
							SubLObject final_index_iterator2 = (SubLObject) kb_indexing.NIL;
							try {
								final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2,
										(SubLObject) kb_indexing.$kw265$GAF, (SubLObject) kb_indexing.NIL,
										(SubLObject) kb_indexing.NIL);
								SubLObject done_var_$45 = doneP;
								final SubLObject token_var_$46 = (SubLObject) kb_indexing.NIL;
								while (kb_indexing.NIL == done_var_$45) {
									final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(
											final_index_iterator2, token_var_$46);
									final SubLObject valid_$47 = (SubLObject) SubLObjectFactory
											.makeBoolean(!token_var_$46.eql(assertion2));
									if (kb_indexing.NIL != valid_$47) {
										if (kb_indexing.NIL != unification_utilities.asent_unify(asent,
												assertions_high.gaf_formula(assertion2),
												(SubLObject) kb_indexing.UNPROVIDED,
												(SubLObject) kb_indexing.UNPROVIDED)) {
											result = assertion2;
											doneP = (SubLObject) kb_indexing.T;
										} else if (kb_indexing.NIL != cutoff) {
											count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
											if (count.numGE(cutoff)) {
												result = (SubLObject) kb_indexing.$kw266$CUTOFF;
												doneP = (SubLObject) kb_indexing.T;
											}
										}
									}
									done_var_$45 = (SubLObject) SubLObjectFactory
											.makeBoolean(kb_indexing.NIL == valid_$47 || kb_indexing.NIL != doneP);
								}
							} finally {
								final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$
										.currentBinding(thread);
								try {
									Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_indexing.T, thread);
									final SubLObject _values5 = Values.getValuesAsVector();
									if (kb_indexing.NIL != final_index_iterator2) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
									}
									Values.restoreValuesFromVector(_values5);
								} finally {
									Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
								}
							}
						}
						done_var2 = (SubLObject) SubLObjectFactory
								.makeBoolean(kb_indexing.NIL == valid2 || kb_indexing.NIL != doneP);
					}
					utilities_macros.noting_progress_postamble();
				} finally {
					utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
					utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
					utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
					utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
					utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
					utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
					utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
					utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
				}
			}
		} else if (pcase_var.eql((SubLObject) kb_indexing.$kw188$OVERLAP)) {
			SubLObject rest;
			SubLObject assertion3;
			for (rest = (SubLObject) kb_indexing.NIL, rest = virtual_indexing.gather_overlap_index(
					kb_mapping_macros.do_gli_vo_extract_key(l_index),
					(SubLObject) kb_indexing.UNPROVIDED); kb_indexing.NIL == doneP
							&& kb_indexing.NIL != rest; rest = rest.rest()) {
				assertion3 = rest.first();
				if (kb_indexing.NIL != unification_utilities.asent_unify(asent, assertions_high.gaf_formula(assertion3),
						(SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)) {
					result = assertion3;
					doneP = (SubLObject) kb_indexing.T;
				} else if (kb_indexing.NIL != cutoff) {
					count = Numbers.add(count, (SubLObject) kb_indexing.ONE_INTEGER);
					if (count.numGE(cutoff)) {
						result = (SubLObject) kb_indexing.$kw266$CUTOFF;
						doneP = (SubLObject) kb_indexing.T;
					}
				}
			}
		} else {
			kb_mapping_macros.do_gli_method_error(l_index, method);
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 132725L)
	public static SubLObject asent_kb_lookup_in_any_mt(final SubLObject asent, SubLObject cutoff) {
		if (cutoff == kb_indexing.UNPROVIDED) {
			cutoff = (SubLObject) kb_indexing.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING,
					thread);
			mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
			return asent_kb_lookup(asent, cutoff);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 133148L)
	public static SubLObject find_clause_struc(final SubLObject cnf) {
		assert kb_indexing.NIL != clauses.cnf_p(cnf) : cnf;
		final SubLObject assertion = find_assertion_any_mt(cnf);
		if (kb_indexing.NIL != assertion) {
			final SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
			if (kb_indexing.NIL != clause_struc) {
				return clause_struc;
			}
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 133695L)
	public static SubLObject gather_all_el_rule_assertions_for_term(final SubLObject v_term) {
		assert kb_indexing.NIL != forts.fort_p(v_term) : v_term;
		return Mapping.mapcar(Symbols.symbol_function((SubLObject) kb_indexing.$sym268$ASSERTION_EL_FORMULA),
				gather_all_rule_assertions_for_term(v_term));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 134259L)
	public static SubLObject gather_all_rule_assertions_for_term(final SubLObject v_term) {
		assert kb_indexing.NIL != forts.fort_p(v_term) : v_term;
		SubLObject assertions = (SubLObject) kb_indexing.NIL;
		if (kb_indexing.NIL != fort_types_interface.collectionP(v_term)) {
			assertions = ConsesLow.append(gather_all_isa_rule_assertions_for_col(v_term),
					gather_all_genls_rule_assertions_for_col(v_term),
					gather_all_other_rule_assertions_for_term(v_term));
		} else if (kb_indexing.NIL != fort_types_interface.predicateP(v_term)) {
			assertions = ConsesLow.append(gather_all_rule_assertions_for_pred(v_term),
					gather_all_other_rule_assertions_for_term(v_term));
		} else {
			assertions = gather_all_other_rule_assertions_for_term(v_term);
		}
		return assertions;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 135152L)
	public static SubLObject gather_all_rule_assertions_for_pred(final SubLObject pred) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rules = (SubLObject) kb_indexing.NIL;
		SubLObject cdolist_list_var = (SubLObject) kb_indexing.$list270;
		SubLObject sense = (SubLObject) kb_indexing.NIL;
		sense = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (num_predicate_rule_index(pred, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED).numG((SubLObject) kb_indexing.ZERO_INTEGER)) {
				SubLObject cdolist_list_var_$57;
				final SubLObject mts = cdolist_list_var_$57 = key_predicate_rule_index(pred, sense,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject mt = (SubLObject) kb_indexing.NIL;
				mt = cdolist_list_var_$57.first();
				while (kb_indexing.NIL != cdolist_list_var_$57) {
					SubLObject cdolist_list_var_$58;
					final SubLObject directions = cdolist_list_var_$58 = key_predicate_rule_index(pred, sense, mt);
					SubLObject direction = (SubLObject) kb_indexing.NIL;
					direction = cdolist_list_var_$58.first();
					while (kb_indexing.NIL != cdolist_list_var_$58) {
						final SubLObject _prev_bind_0 = kb_indexing.$gathered_rule_assertions$.currentBinding(thread);
						try {
							kb_indexing.$gathered_rule_assertions$.bind((SubLObject) kb_indexing.NIL, thread);
							kb_mapping.map_predicate_rule_index(
									Symbols.symbol_function((SubLObject) kb_indexing.$sym269$GATHER_ONE_RULE_ASSERTION),
									pred, sense, direction, mt);
							rules = ConsesLow.append(rules,
									kb_indexing.$gathered_rule_assertions$.getDynamicValue(thread));
						} finally {
							kb_indexing.$gathered_rule_assertions$.rebind(_prev_bind_0, thread);
						}
						cdolist_list_var_$58 = cdolist_list_var_$58.rest();
						direction = cdolist_list_var_$58.first();
					}
					cdolist_list_var_$57 = cdolist_list_var_$57.rest();
					mt = cdolist_list_var_$57.first();
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return rules;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 135955L)
	public static SubLObject gather_one_rule_assertion(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert kb_indexing.NIL != assertion_handles.assertion_p(assertion) : assertion;
		if (cycl_utilities.formula_arg0(assertion).eql(kb_indexing.$const271$implies)) {
			kb_indexing.$gathered_rule_assertions$.setDynamicValue((SubLObject) ConsesLow.cons(assertion,
					kb_indexing.$gathered_rule_assertions$.getDynamicValue(thread)), thread);
		}
		return (SubLObject) kb_indexing.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 136221L)
	public static SubLObject gather_all_isa_rule_assertions_for_col(final SubLObject col) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rules = (SubLObject) kb_indexing.NIL;
		SubLObject cdolist_list_var = (SubLObject) kb_indexing.$list270;
		SubLObject sense = (SubLObject) kb_indexing.NIL;
		sense = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (num_isa_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED, (SubLObject) kb_indexing.UNPROVIDED)
					.numG((SubLObject) kb_indexing.ZERO_INTEGER)) {
				SubLObject cdolist_list_var_$59;
				final SubLObject mts = cdolist_list_var_$59 = key_isa_rule_index(col, sense,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject mt = (SubLObject) kb_indexing.NIL;
				mt = cdolist_list_var_$59.first();
				while (kb_indexing.NIL != cdolist_list_var_$59) {
					SubLObject cdolist_list_var_$60;
					final SubLObject directions = cdolist_list_var_$60 = key_isa_rule_index(col, sense, mt);
					SubLObject direction = (SubLObject) kb_indexing.NIL;
					direction = cdolist_list_var_$60.first();
					while (kb_indexing.NIL != cdolist_list_var_$60) {
						final SubLObject _prev_bind_0 = kb_indexing.$gathered_rule_assertions$.currentBinding(thread);
						try {
							kb_indexing.$gathered_rule_assertions$.bind((SubLObject) kb_indexing.NIL, thread);
							kb_mapping.map_isa_rule_index(
									Symbols.symbol_function((SubLObject) kb_indexing.$sym269$GATHER_ONE_RULE_ASSERTION),
									col, sense, direction, mt);
							rules = ConsesLow.append(rules,
									kb_indexing.$gathered_rule_assertions$.getDynamicValue(thread));
						} finally {
							kb_indexing.$gathered_rule_assertions$.rebind(_prev_bind_0, thread);
						}
						cdolist_list_var_$60 = cdolist_list_var_$60.rest();
						direction = cdolist_list_var_$60.first();
					}
					cdolist_list_var_$59 = cdolist_list_var_$59.rest();
					mt = cdolist_list_var_$59.first();
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return rules;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 137005L)
	public static SubLObject gather_all_genls_rule_assertions_for_col(final SubLObject col) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rules = (SubLObject) kb_indexing.NIL;
		SubLObject cdolist_list_var = (SubLObject) kb_indexing.$list270;
		SubLObject sense = (SubLObject) kb_indexing.NIL;
		sense = cdolist_list_var.first();
		while (kb_indexing.NIL != cdolist_list_var) {
			if (num_genls_rule_index(col, sense, (SubLObject) kb_indexing.UNPROVIDED,
					(SubLObject) kb_indexing.UNPROVIDED).numG((SubLObject) kb_indexing.ZERO_INTEGER)) {
				SubLObject cdolist_list_var_$61;
				final SubLObject mts = cdolist_list_var_$61 = key_genls_rule_index(col, sense,
						(SubLObject) kb_indexing.UNPROVIDED);
				SubLObject mt = (SubLObject) kb_indexing.NIL;
				mt = cdolist_list_var_$61.first();
				while (kb_indexing.NIL != cdolist_list_var_$61) {
					SubLObject cdolist_list_var_$62;
					final SubLObject directions = cdolist_list_var_$62 = key_genls_rule_index(col, sense, mt);
					SubLObject direction = (SubLObject) kb_indexing.NIL;
					direction = cdolist_list_var_$62.first();
					while (kb_indexing.NIL != cdolist_list_var_$62) {
						final SubLObject _prev_bind_0 = kb_indexing.$gathered_rule_assertions$.currentBinding(thread);
						try {
							kb_indexing.$gathered_rule_assertions$.bind((SubLObject) kb_indexing.NIL, thread);
							kb_mapping.map_genls_rule_index(
									Symbols.symbol_function((SubLObject) kb_indexing.$sym269$GATHER_ONE_RULE_ASSERTION),
									col, sense, direction, mt);
							rules = ConsesLow.append(rules,
									kb_indexing.$gathered_rule_assertions$.getDynamicValue(thread));
						} finally {
							kb_indexing.$gathered_rule_assertions$.rebind(_prev_bind_0, thread);
						}
						cdolist_list_var_$62 = cdolist_list_var_$62.rest();
						direction = cdolist_list_var_$62.first();
					}
					cdolist_list_var_$61 = cdolist_list_var_$61.rest();
					mt = cdolist_list_var_$61.first();
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			sense = cdolist_list_var.first();
		}
		return rules;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-indexing.lisp", position = 137802L)
	public static SubLObject gather_all_other_rule_assertions_for_term(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rules = (SubLObject) kb_indexing.NIL;
		final SubLObject _prev_bind_0 = kb_indexing.$gathered_rule_assertions$.currentBinding(thread);
		try {
			kb_indexing.$gathered_rule_assertions$.bind((SubLObject) kb_indexing.NIL, thread);
			final SubLObject _prev_bind_0_$63 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$
						.bind((SubLObject) kb_indexing.$sym117$RELEVANT_MT_IS_EVERYTHING, thread);
				mt_relevance_macros.$mt$.bind(kb_indexing.$const118$EverythingPSC, thread);
				kb_mapping.map_other_index(
						Symbols.symbol_function((SubLObject) kb_indexing.$sym269$GATHER_ONE_RULE_ASSERTION), v_term,
						(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.NIL);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$63, thread);
			}
			rules = kb_indexing.$gathered_rule_assertions$.getDynamicValue(thread);
		} finally {
			kb_indexing.$gathered_rule_assertions$.rebind(_prev_bind_0, thread);
		}
		return rules;
	}

	public static SubLObject declare_kb_indexing_file() {
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_subindex", "GET-SUBINDEX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "term_add_indexing_leaf",
				"TERM-ADD-INDEXING-LEAF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "term_rem_indexing_leaf",
				"TERM-REM-INDEXING-LEAF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "all_mt_subindex_keys_relevant_p",
				"ALL-MT-SUBINDEX-KEYS-RELEVANT-P", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_mt_subindex_count",
				"RELEVANT-MT-SUBINDEX-COUNT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_mt_subindex_count_with_cutoff",
				"RELEVANT-MT-SUBINDEX-COUNT-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_mt_subindex_keys",
				"RELEVANT-MT-SUBINDEX-KEYS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "mark_term_index_as_muted",
				"MARK-TERM-INDEX-AS-MUTED", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_gaf_arg_index", "NUM-GAF-ARG-INDEX", 1, 3,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_gaf_arg_index",
				"RELEVANT-NUM-GAF-ARG-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_gaf_arg_index_with_cutoff",
				"RELEVANT-NUM-GAF-ARG-INDEX-WITH-CUTOFF", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "clear_key_gaf_arg_index_cached",
				"CLEAR-KEY-GAF-ARG-INDEX-CACHED", 0, 0, false);
		new $clear_key_gaf_arg_index_cached$ZeroArityFunction();
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "remove_key_gaf_arg_index_cached",
				"REMOVE-KEY-GAF-ARG-INDEX-CACHED", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_gaf_arg_index_cached_internal",
				"KEY-GAF-ARG-INDEX-CACHED-INTERNAL", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_gaf_arg_index_cached",
				"KEY-GAF-ARG-INDEX-CACHED", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_gaf_arg_index", "KEY-GAF-ARG-INDEX", 1, 2,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gaf_arg_indices", "GAF-ARG-INDICES", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing",
				"preds_from_gafs_mentioning_term_at_argnum_with_relevant_mt",
				"PREDS-FROM-GAFS-MENTIONING-TERM-AT-ARGNUM-WITH-RELEVANT-MT", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing",
				"argnums_from_gafs_mentioning_term_with_relevant_mt",
				"ARGNUMS-FROM-GAFS-MENTIONING-TERM-WITH-RELEVANT-MT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_gaf_arg_index",
				"RELEVANT-KEY-GAF-ARG-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "mts_gaf_arg_index", "MTS-GAF-ARG-INDEX", 3, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gaf_arg_index_key_validator",
				"GAF-ARG-INDEX-KEY-VALIDATOR", 1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_gaf_arg_subindex", "GET-GAF-ARG-SUBINDEX", 1,
				3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_gaf_arg_index", "ADD-GAF-ARG-INDEX", 5, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_gaf_arg_index", "REM-GAF-ARG-INDEX", 5, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_nart_arg_index", "NUM-NART-ARG-INDEX", 1, 2,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_nart_arg_index",
				"RELEVANT-NUM-NART-ARG-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_nart_arg_index_with_cutoff",
				"RELEVANT-NUM-NART-ARG-INDEX-WITH-CUTOFF", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_nart_arg_index", "KEY-NART-ARG-INDEX", 1, 2,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_nart_arg_index",
				"RELEVANT-KEY-NART-ARG-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "mts_nart_arg_index", "MTS-NART-ARG-INDEX", 3, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_nart_arg_subindex", "GET-NART-ARG-SUBINDEX",
				1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_nart_arg_index", "ADD-NART-ARG-INDEX", 4, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_nart_arg_index", "REM-NART-ARG-INDEX", 4, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_predicate_extent_index",
				"NUM-PREDICATE-EXTENT-INDEX", 1, 1, false);
		new $num_predicate_extent_index$UnaryFunction();
		new $num_predicate_extent_index$BinaryFunction();
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_predicate_extent_index",
				"RELEVANT-NUM-PREDICATE-EXTENT-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_predicate_extent_index_with_cutoff",
				"RELEVANT-NUM-PREDICATE-EXTENT-INDEX-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "no_predicate_extent_p", "NO-PREDICATE-EXTENT-P",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_predicate_extent_index",
				"KEY-PREDICATE-EXTENT-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_predicate_extent_index",
				"RELEVANT-KEY-PREDICATE-EXTENT-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "predicate_extent_top_level_key",
				"PREDICATE-EXTENT-TOP-LEVEL-KEY", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_predicate_extent_index",
				"ADD-PREDICATE-EXTENT-INDEX", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_predicate_extent_index",
				"REM-PREDICATE-EXTENT-INDEX", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_predicate_extent_subindex",
				"GET-PREDICATE-EXTENT-SUBINDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_function_extent_index",
				"NUM-FUNCTION-EXTENT-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_function_extent_index",
				"RELEVANT-NUM-FUNCTION-EXTENT-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_function_extent_index_with_cutoff",
				"RELEVANT-NUM-FUNCTION-EXTENT-INDEX-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_function_extent_subindex",
				"GET-FUNCTION-EXTENT-SUBINDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_function_extent_index",
				"ADD-FUNCTION-EXTENT-INDEX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_function_extent_index",
				"REM-FUNCTION-EXTENT-INDEX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "function_extent_top_level_key",
				"FUNCTION-EXTENT-TOP-LEVEL-KEY", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_predicate_rule_index",
				"NUM-PREDICATE-RULE-INDEX", 1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_predicate_rule_index",
				"RELEVANT-NUM-PREDICATE-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_predicate_rule_index_with_cutoff",
				"RELEVANT-NUM-PREDICATE-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_predicate_rule_index",
				"KEY-PREDICATE-RULE-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_predicate_rule_index",
				"RELEVANT-KEY-PREDICATE-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_predicate_rule_subindex",
				"GET-PREDICATE-RULE-SUBINDEX", 1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_predicate_rule_index",
				"ADD-PREDICATE-RULE-INDEX", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_predicate_rule_index",
				"REM-PREDICATE-RULE-INDEX", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_decontextualized_ist_predicate_rule_index",
				"NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_decontextualized_ist_predicate_rule_index",
				"KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing",
				"get_decontextualized_ist_predicate_rule_subindex", "GET-DECONTEXTUALIZED-IST-PREDICATE-RULE-SUBINDEX",
				1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_decontextualized_ist_predicate_rule_index",
				"ADD-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_decontextualized_ist_predicate_rule_index",
				"REM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_isa_rule_index", "NUM-ISA-RULE-INDEX", 1, 3,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_isa_rule_index",
				"RELEVANT-NUM-ISA-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_isa_rule_index_with_cutoff",
				"RELEVANT-NUM-ISA-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_isa_rule_index", "KEY-ISA-RULE-INDEX", 1, 2,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_isa_rule_index",
				"RELEVANT-KEY-ISA-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_isa_rule_subindex", "GET-ISA-RULE-SUBINDEX",
				1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_isa_rule_index", "ADD-ISA-RULE-INDEX", 5, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_isa_rule_index", "REM-ISA-RULE-INDEX", 5, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_quoted_isa_rule_index",
				"NUM-QUOTED-ISA-RULE-INDEX", 1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_quoted_isa_rule_index",
				"RELEVANT-NUM-QUOTED-ISA-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_quoted_isa_rule_index_with_cutoff",
				"RELEVANT-NUM-QUOTED-ISA-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_quoted_isa_rule_index",
				"KEY-QUOTED-ISA-RULE-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_quoted_isa_rule_index",
				"RELEVANT-KEY-QUOTED-ISA-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_quoted_isa_rule_subindex",
				"GET-QUOTED-ISA-RULE-SUBINDEX", 1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_quoted_isa_rule_index",
				"ADD-QUOTED-ISA-RULE-INDEX", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_quoted_isa_rule_index",
				"REM-QUOTED-ISA-RULE-INDEX", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_genls_rule_index", "NUM-GENLS-RULE-INDEX", 1,
				3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_genls_rule_index",
				"RELEVANT-NUM-GENLS-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_genls_rule_index_with_cutoff",
				"RELEVANT-NUM-GENLS-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_genls_rule_index", "KEY-GENLS-RULE-INDEX", 1,
				2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_genls_rule_index",
				"RELEVANT-KEY-GENLS-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_genls_rule_subindex",
				"GET-GENLS-RULE-SUBINDEX", 1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_genls_rule_index", "ADD-GENLS-RULE-INDEX", 5,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_genls_rule_index", "REM-GENLS-RULE-INDEX", 5,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_genl_mt_rule_index",
				"NUM-GENL-MT-RULE-INDEX", 1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_genl_mt_rule_index",
				"RELEVANT-NUM-GENL-MT-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_genl_mt_rule_index_with_cutoff",
				"RELEVANT-NUM-GENL-MT-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_genl_mt_rule_index",
				"KEY-GENL-MT-RULE-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_genl_mt_rule_index",
				"RELEVANT-KEY-GENL-MT-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_genl_mt_rule_subindex",
				"GET-GENL-MT-RULE-SUBINDEX", 1, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_genl_mt_rule_index",
				"ADD-GENL-MT-RULE-INDEX", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_genl_mt_rule_index",
				"REM-GENL-MT-RULE-INDEX", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_function_rule_index",
				"NUM-FUNCTION-RULE-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_function_rule_index",
				"RELEVANT-NUM-FUNCTION-RULE-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_function_rule_index_with_cutoff",
				"RELEVANT-NUM-FUNCTION-RULE-INDEX-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_function_rule_index",
				"KEY-FUNCTION-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_function_rule_index",
				"RELEVANT-KEY-FUNCTION-RULE-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_function_rule_subindex",
				"GET-FUNCTION-RULE-SUBINDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_function_rule_index",
				"ADD-FUNCTION-RULE-INDEX", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_function_rule_index",
				"REM-FUNCTION-RULE-INDEX", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "function_rule_top_level_key",
				"FUNCTION-RULE-TOP-LEVEL-KEY", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_exception_rule_index",
				"NUM-EXCEPTION-RULE-INDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_exception_rule_index",
				"RELEVANT-NUM-EXCEPTION-RULE-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_exception_rule_index_with_cutoff",
				"RELEVANT-NUM-EXCEPTION-RULE-INDEX-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_exception_rule_index",
				"KEY-EXCEPTION-RULE-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_exception_rule_index",
				"RELEVANT-KEY-EXCEPTION-RULE-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "exception_rule_top_level_key",
				"EXCEPTION-RULE-TOP-LEVEL-KEY", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_exception_rule_subindex",
				"GET-EXCEPTION-RULE-SUBINDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_exception_rule_index",
				"ADD-EXCEPTION-RULE-INDEX", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_exception_rule_index",
				"REM-EXCEPTION-RULE-INDEX", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_pragma_rule_index", "NUM-PRAGMA-RULE-INDEX",
				1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_pragma_rule_index",
				"RELEVANT-NUM-PRAGMA-RULE-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_pragma_rule_index_with_cutoff",
				"RELEVANT-NUM-PRAGMA-RULE-INDEX-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "key_pragma_rule_index", "KEY-PRAGMA-RULE-INDEX",
				1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_key_pragma_rule_index",
				"RELEVANT-KEY-PRAGMA-RULE-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "pragma_rule_top_level_key",
				"PRAGMA-RULE-TOP-LEVEL-KEY", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_pragma_rule_subindex",
				"GET-PRAGMA-RULE-SUBINDEX", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_pragma_rule_index", "ADD-PRAGMA-RULE-INDEX",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_pragma_rule_index", "REM-PRAGMA-RULE-INDEX",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_mt_index", "NUM-MT-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_mt_index", "RELEVANT-NUM-MT-INDEX",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_mt_index_with_cutoff",
				"RELEVANT-NUM-MT-INDEX-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_mt_contents", "NUM-MT-CONTENTS", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "count_mt_contents", "COUNT-MT-CONTENTS", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "estimated_num_mt_contents",
				"ESTIMATED-NUM-MT-CONTENTS", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "estimated_count_mt_contents",
				"ESTIMATED-COUNT-MT-CONTENTS", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_mt_subindex", "GET-MT-SUBINDEX", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_mt_index", "ADD-MT-INDEX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_mt_index", "REM-MT-INDEX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_mt_index_internal", "ADD-MT-INDEX-INTERNAL",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_mt_index_internal", "REM-MT-INDEX-INTERNAL",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "mt_top_level_key", "MT-TOP-LEVEL-KEY", 0, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_hlmt_index", "NUM-HLMT-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_hlmt_index",
				"RELEVANT-NUM-HLMT-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "broad_mtP", "BROAD-MT?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "broad_mt_index_cleanup",
				"BROAD-MT-INDEX-CLEANUP", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_broad_mts_for_index_cleanup",
				"GET-BROAD-MTS-FOR-INDEX-CLEANUP", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_broad_mt_index", "REM-BROAD-MT-INDEX", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_other_index", "NUM-OTHER-INDEX", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_other_index",
				"RELEVANT-NUM-OTHER-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_other_index_with_cutoff",
				"RELEVANT-NUM-OTHER-INDEX-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_other_subindex", "GET-OTHER-SUBINDEX", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_other_index", "ADD-OTHER-INDEX", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_other_index", "REM-OTHER-INDEX", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "other_top_level_key", "OTHER-TOP-LEVEL-KEY", 0,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_index", "NUM-INDEX", 1, 0, false);
		new $num_index$UnaryFunction();
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "relevant_num_index", "RELEVANT-NUM-INDEX", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "perform_indexing_pre_dump_cleanup",
				"PERFORM-INDEXING-PRE-DUMP-CLEANUP", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "get_indexing_pre_dump_cleanup_defs",
				"GET-INDEXING-PRE-DUMP-CLEANUP-DEFS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "unindexed_syntax_constant_index_cleanup",
				"UNINDEXED-SYNTAX-CONSTANT-INDEX-CLEANUP", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "unindexed_syntax_constant_cleanup_one_index",
				"UNINDEXED-SYNTAX-CONSTANT-CLEANUP-ONE-INDEX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing",
				"unindexed_syntax_constant_index_cleanup_internal", "UNINDEXED-SYNTAX-CONSTANT-INDEX-CLEANUP-INTERNAL",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "term_mt_count", "TERM-MT-COUNT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "mts_of_indexed_term", "MTS-OF-INDEXED-TERM", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_assertion_indices", "ADD-ASSERTION-INDICES",
				1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "remove_assertion_indices",
				"REMOVE-ASSERTION-INDICES", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "remove_term_indices", "REMOVE-TERM-INDICES", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "determine_formula_indices",
				"DETERMINE-FORMULA-INDICES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "optimize_argnum_pairs", "OPTIMIZE-ARGNUM-PAIRS",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "determine_gaf_indices", "DETERMINE-GAF-INDICES",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_gaf_indices", "ADD-GAF-INDICES", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "remove_gaf_indices", "REMOVE-GAF-INDICES", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "determine_function_indices",
				"DETERMINE-FUNCTION-INDICES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_function_indices", "ADD-FUNCTION-INDICES", 1,
				1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "rem_function_indices", "REM-FUNCTION-INDICES", 1,
				1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "determine_rule_indices_int",
				"DETERMINE-RULE-INDICES-INT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "determine_rule_indices",
				"DETERMINE-RULE-INDICES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "add_rule_indices", "ADD-RULE-INDICES", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "remove_rule_indices", "REMOVE-RULE-INDICES", 1,
				1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "spec_preds_of_ist_indexing_enabledP",
				"SPEC-PREDS-OF-IST-INDEXING-ENABLED?", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "spec_preds_of_ist_indexing_enabledP_robust",
				"SPEC-PREDS-OF-IST-INDEXING-ENABLED?-ROBUST", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "spec_preds_of_ist_old_indexed_rule_count",
				"SPEC-PREDS-OF-IST-OLD-INDEXED-RULE-COUNT", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "enable_spec_preds_of_ist_indexing",
				"ENABLE-SPEC-PREDS-OF-IST-INDEXING", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_nat_lookup_index", "BEST-NAT-LOOKUP-INDEX",
				1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_best_nat_lookup_index",
				"NUM-BEST-NAT-LOOKUP-INDEX", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_nat_lookup_index_try_all_allowed",
				"BEST-NAT-LOOKUP-INDEX-TRY-ALL-ALLOWED", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_best_nat_lookup_index_try_all_allowed",
				"NUM-BEST-NAT-LOOKUP-INDEX-TRY-ALL-ALLOWED", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_nat_lookup_index_wrt_methods",
				"BEST-NAT-LOOKUP-INDEX-WRT-METHODS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_nat_lookup_index_int",
				"BEST-NAT-LOOKUP-INDEX-INT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "decent_nat_index_from_terms",
				"DECENT-NAT-INDEX-FROM-TERMS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "decent_nat_index", "DECENT-NAT-INDEX", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_nat_index_count", "BEST-NAT-INDEX-COUNT", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "decent_rule_index", "DECENT-RULE-INDEX", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "all_rule_indices", "ALL-RULE-INDICES", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_p", "LOOKUP-INDEX-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_get_property",
				"LOOKUP-INDEX-GET-PROPERTY", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_set_property",
				"LOOKUP-INDEX-SET-PROPERTY", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_get_type", "LOOKUP-INDEX-GET-TYPE",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_predicate_extent_value",
				"LOOKUP-INDEX-PREDICATE-EXTENT-VALUE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_gaf_arg_values",
				"LOOKUP-INDEX-GAF-ARG-VALUES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_overlap_value",
				"LOOKUP-INDEX-OVERLAP-VALUE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_for_overlap",
				"LOOKUP-INDEX-FOR-OVERLAP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_for_predicate_extent",
				"LOOKUP-INDEX-FOR-PREDICATE-EXTENT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_for_function_extent",
				"LOOKUP-INDEX-FOR-FUNCTION-EXTENT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_for_gaf_arg",
				"LOOKUP-INDEX-FOR-GAF-ARG", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_index_for_nart_arg",
				"LOOKUP-INDEX-FOR-NART-ARG", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_methods_includeP",
				"LOOKUP-METHODS-INCLUDE?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "lookup_methods_allow_onlyP",
				"LOOKUP-METHODS-ALLOW-ONLY?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_gaf_lookup_index", "BEST-GAF-LOOKUP-INDEX",
				2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_best_gaf_lookup_index",
				"NUM-BEST-GAF-LOOKUP-INDEX", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_gaf_lookup_index_try_all_allowed",
				"BEST-GAF-LOOKUP-INDEX-TRY-ALL-ALLOWED", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "num_best_gaf_lookup_index_try_all_allowed",
				"NUM-BEST-GAF-LOOKUP-INDEX-TRY-ALL-ALLOWED", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_gaf_lookup_index_wrt_methods",
				"BEST-GAF-LOOKUP-INDEX-WRT-METHODS", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "best_gaf_lookup_index_int",
				"BEST-GAF-LOOKUP-INDEX-INT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "clear_pred_has_heinous_mt_fanoutP",
				"CLEAR-PRED-HAS-HEINOUS-MT-FANOUT?", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "remove_pred_has_heinous_mt_fanoutP",
				"REMOVE-PRED-HAS-HEINOUS-MT-FANOUT?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "pred_has_heinous_mt_fanoutP_internal",
				"PRED-HAS-HEINOUS-MT-FANOUT?-INTERNAL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "pred_has_heinous_mt_fanoutP",
				"PRED-HAS-HEINOUS-MT-FANOUT?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "reindex_all_assertions",
				"REINDEX-ALL-ASSERTIONS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "clear_all_existing_indexing",
				"CLEAR-ALL-EXISTING-INDEXING", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "clear_large_existing_indexing",
				"CLEAR-LARGE-EXISTING-INDEXING", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "reindex_one_of_all_assertions",
				"REINDEX-ONE-OF-ALL-ASSERTIONS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "reindex_all_term_assertions",
				"REINDEX-ALL-TERM-ASSERTIONS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "reindex_assertions", "REINDEX-ASSERTIONS", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "reindex_assertion", "REINDEX-ASSERTION", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "merge_term_indices", "MERGE-TERM-INDICES", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_assertion", "FIND-ASSERTION", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_assertion_internal",
				"FIND-ASSERTION-INTERNAL", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_assertion_any_mt", "FIND-ASSERTION-ANY-MT",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_assertion_genl_mts",
				"FIND-ASSERTION-GENL-MTS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_all_assertions", "FIND-ALL-ASSERTIONS", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_gaf", "FIND-GAF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_gaf_any_mt", "FIND-GAF-ANY-MT", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_gaf_genl_mts", "FIND-GAF-GENL-MTS", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_all_gafs", "FIND-ALL-GAFS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "count_all_gafs", "COUNT-ALL-GAFS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_gaf_in_relevant_mt",
				"FIND-GAF-IN-RELEVANT-MT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_gaf_possibly_in_mt",
				"FIND-GAF-POSSIBLY-IN-MT", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gaf_mts", "GAF-MTS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "sibling_mt_assertions", "SIBLING-MT-ASSERTIONS",
				1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "sibling_mt_assertion_count",
				"SIBLING-MT-ASSERTION-COUNT", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_cnf", "FIND-CNF", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_gaf_cnf", "FIND-GAF-CNF", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_rule_cnf", "FIND-RULE-CNF", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_rule_cnf_via_index",
				"FIND-RULE-CNF-VIA-INDEX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_rule_cnf_via_index_int",
				"FIND-RULE-CNF-VIA-INDEX-INT", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_cnf_internal", "FIND-CNF-INTERNAL", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_gaf_formula", "FIND-GAF-FORMULA", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_gaf_internal", "FIND-GAF-INTERNAL", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "asent_kb_lookup", "ASENT-KB-LOOKUP", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "asent_kb_lookup_in_any_mt",
				"ASENT-KB-LOOKUP-IN-ANY-MT", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "find_clause_struc", "FIND-CLAUSE-STRUC", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gather_all_el_rule_assertions_for_term",
				"GATHER-ALL-EL-RULE-ASSERTIONS-FOR-TERM", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gather_all_rule_assertions_for_term",
				"GATHER-ALL-RULE-ASSERTIONS-FOR-TERM", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gather_all_rule_assertions_for_pred",
				"GATHER-ALL-RULE-ASSERTIONS-FOR-PRED", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gather_one_rule_assertion",
				"GATHER-ONE-RULE-ASSERTION", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gather_all_isa_rule_assertions_for_col",
				"GATHER-ALL-ISA-RULE-ASSERTIONS-FOR-COL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gather_all_genls_rule_assertions_for_col",
				"GATHER-ALL-GENLS-RULE-ASSERTIONS-FOR-COL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing", "gather_all_other_rule_assertions_for_term",
				"GATHER-ALL-OTHER-RULE-ASSERTIONS-FOR-TERM", 1, 0, false);
		return (SubLObject) kb_indexing.NIL;
	}

	public static SubLObject init_kb_indexing_file() {
		kb_indexing.$indexing_good_enough_threshold$ = SubLFiles.defparameter("*INDEXING-GOOD-ENOUGH-THRESHOLD*",
				(SubLObject) kb_indexing.THREE_INTEGER);
		kb_indexing.$key_gaf_arg_index_cached_caching_state$ = SubLFiles
				.deflexical("*KEY-GAF-ARG-INDEX-CACHED-CACHING-STATE*", (SubLObject) kb_indexing.NIL);
		kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$ = SubLFiles
				.defparameter("*INDEX-SPEC-PREDS-OF-IST-IN-IST-PRED-INDEX?*", (SubLObject) kb_indexing.NIL);
		kb_indexing.$best_gaf_lookup_index_exact_num_predicate_extent_cutoff$ = SubLFiles.defparameter(
				"*BEST-GAF-LOOKUP-INDEX-EXACT-NUM-PREDICATE-EXTENT-CUTOFF*", (SubLObject) kb_indexing.$int215$212);
		kb_indexing.$best_gaf_lookup_index_zero_num_predicate_extent_cutoff$ = SubLFiles.defparameter(
				"*BEST-GAF-LOOKUP-INDEX-ZERO-NUM-PREDICATE-EXTENT-CUTOFF*", (SubLObject) kb_indexing.$int216$2120);
		kb_indexing.$pred_heinous_mt_fanout_cutoff$ = SubLFiles.deflexical("*PRED-HEINOUS-MT-FANOUT-CUTOFF*",
				(SubLObject) kb_indexing.$int217$100);
		kb_indexing.$pred_has_heinous_mt_fanoutP_caching_state$ = SubLFiles
				.deflexical("*PRED-HAS-HEINOUS-MT-FANOUT?-CACHING-STATE*", (SubLObject) kb_indexing.NIL);
		kb_indexing.$reindex_all_assertions_full_gc_threshhold_constant_count$ = SubLFiles.deflexical(
				"*REINDEX-ALL-ASSERTIONS-FULL-GC-THRESHHOLD-CONSTANT-COUNT*", (SubLObject) kb_indexing.$int220$10000);
		kb_indexing.$warn_on_assertion_reindexing_errorsP$ = SubLFiles
				.defparameter("*WARN-ON-ASSERTION-REINDEXING-ERRORS?*", (SubLObject) kb_indexing.NIL);
		kb_indexing.$gathered_rule_assertions$ = SubLFiles.defparameter("*GATHERED-RULE-ASSERTIONS*",
				(SubLObject) kb_indexing.NIL);
		return (SubLObject) kb_indexing.NIL;
	}

	public static SubLObject setup_kb_indexing_file() {
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym3$NUM_GAF_ARG_INDEX,
				(SubLObject) kb_indexing.$list4, (SubLObject) kb_indexing.$str5$Return_the_number_of_gafs_indexed,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym8$RELEVANT_NUM_GAF_ARG_INDEX,
				(SubLObject) kb_indexing.$list9, (SubLObject) kb_indexing.$str10$Return_the_assertion_count_at_rel,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		memoization_state.note_globally_cached_function((SubLObject) kb_indexing.$sym12$KEY_GAF_ARG_INDEX_CACHED);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym7$KEY_GAF_ARG_INDEX,
				(SubLObject) kb_indexing.$list9, (SubLObject) kb_indexing.$str16$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym20$NUM_NART_ARG_INDEX,
				(SubLObject) kb_indexing.$list21, (SubLObject) kb_indexing.$str22$Return_the_number_of___termOfUnit,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym23$RELEVANT_NUM_NART_ARG_INDEX,
				(SubLObject) kb_indexing.$list21, (SubLObject) kb_indexing.$str24$Compute_the_assertion_count_at_re,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym25$KEY_NART_ARG_INDEX,
				(SubLObject) kb_indexing.$list21, (SubLObject) kb_indexing.$str26$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym28$NUM_PREDICATE_EXTENT_INDEX,
				(SubLObject) kb_indexing.$list29, (SubLObject) kb_indexing.$str30$Return_the_assertion_count_at_PRE,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym32$RELEVANT_NUM_PREDICATE_EXTENT_INDEX,
				(SubLObject) kb_indexing.$list33, (SubLObject) kb_indexing.$str34$Compute_the_assertion_count_at_re,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym31$KEY_PREDICATE_EXTENT_INDEX,
				(SubLObject) kb_indexing.$list33, (SubLObject) kb_indexing.$str36$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym38$NUM_FUNCTION_EXTENT_INDEX,
				(SubLObject) kb_indexing.$list39, (SubLObject) kb_indexing.$str40$Return_the_function_extent_of_FUN,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym41$RELEVANT_NUM_FUNCTION_EXTENT_INDEX,
				(SubLObject) kb_indexing.$list39, (SubLObject) kb_indexing.$str42$Compute_the_function_extent_at_re,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym44$NUM_PREDICATE_RULE_INDEX,
				(SubLObject) kb_indexing.$list45, (SubLObject) kb_indexing.$str46$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym47$KEY_PREDICATE_RULE_INDEX,
				(SubLObject) kb_indexing.$list50, (SubLObject) kb_indexing.$str51$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function(
				(SubLObject) kb_indexing.$sym53$NUM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX,
				(SubLObject) kb_indexing.$list54, (SubLObject) kb_indexing.$str55$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function(
				(SubLObject) kb_indexing.$sym56$KEY_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX,
				(SubLObject) kb_indexing.$list57, (SubLObject) kb_indexing.$str58$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym60$NUM_ISA_RULE_INDEX,
				(SubLObject) kb_indexing.$list61, (SubLObject) kb_indexing.$str62$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym63$KEY_ISA_RULE_INDEX,
				(SubLObject) kb_indexing.$list66, (SubLObject) kb_indexing.$str67$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym69$NUM_QUOTED_ISA_RULE_INDEX,
				(SubLObject) kb_indexing.$list61, (SubLObject) kb_indexing.$str62$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym70$KEY_QUOTED_ISA_RULE_INDEX,
				(SubLObject) kb_indexing.$list66, (SubLObject) kb_indexing.$str67$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym74$NUM_GENLS_RULE_INDEX,
				(SubLObject) kb_indexing.$list61, (SubLObject) kb_indexing.$str62$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym75$KEY_GENLS_RULE_INDEX,
				(SubLObject) kb_indexing.$list66, (SubLObject) kb_indexing.$str67$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym79$NUM_GENL_MT_RULE_INDEX,
				(SubLObject) kb_indexing.$list61, (SubLObject) kb_indexing.$str62$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym80$KEY_GENL_MT_RULE_INDEX,
				(SubLObject) kb_indexing.$list66, (SubLObject) kb_indexing.$str67$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym84$NUM_FUNCTION_RULE_INDEX,
				(SubLObject) kb_indexing.$list85, (SubLObject) kb_indexing.$str86$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym87$KEY_FUNCTION_RULE_INDEX,
				(SubLObject) kb_indexing.$list90, (SubLObject) kb_indexing.$str91$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym93$NUM_EXCEPTION_RULE_INDEX,
				(SubLObject) kb_indexing.$list94, (SubLObject) kb_indexing.$str95$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym96$KEY_EXCEPTION_RULE_INDEX,
				(SubLObject) kb_indexing.$list99, (SubLObject) kb_indexing.$str100$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym102$NUM_PRAGMA_RULE_INDEX,
				(SubLObject) kb_indexing.$list94, (SubLObject) kb_indexing.$str95$Return_the_raw_assertion_count_at,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym103$KEY_PRAGMA_RULE_INDEX,
				(SubLObject) kb_indexing.$list99, (SubLObject) kb_indexing.$str100$Return_a_list_of_the_keys_to_the_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list17);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym107$NUM_MT_INDEX,
				(SubLObject) kb_indexing.$list108, (SubLObject) kb_indexing.$str109$Return_the_number_of_assertions_a,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym119$NUM_HLMT_INDEX,
				(SubLObject) kb_indexing.$list120, (SubLObject) kb_indexing.$str121$Return_the_number_of_assertions_a,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.note_funcall_helper_function((SubLObject) kb_indexing.$sym123$REM_BROAD_MT_INDEX);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym124$NUM_OTHER_INDEX,
				(SubLObject) kb_indexing.$list108, (SubLObject) kb_indexing.$str125$Return_the_number_of_assertions_a,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym129$NUM_INDEX,
				(SubLObject) kb_indexing.$list108, (SubLObject) kb_indexing.$str130$The_total_number_of_assertions_in,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list6);
		utilities_macros.note_funcall_helper_function(
				(SubLObject) kb_indexing.$sym132$UNINDEXED_SYNTAX_CONSTANT_CLEANUP_ONE_INDEX);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym144$REMOVE_TERM_INDICES,
				(SubLObject) kb_indexing.$list108, (SubLObject) kb_indexing.$str145$Remove_all_assertions_about_TERM_,
				(SubLObject) kb_indexing.NIL, (SubLObject) kb_indexing.$list146);
		access_macros.define_obsolete_register((SubLObject) kb_indexing.$sym189$DECENT_NAT_INDEX,
				(SubLObject) kb_indexing.$list190);
		access_macros.define_obsolete_register((SubLObject) kb_indexing.$sym191$BEST_NAT_INDEX_COUNT,
				(SubLObject) kb_indexing.$list192);
		memoization_state.note_globally_cached_function((SubLObject) kb_indexing.$sym218$PRED_HAS_HEINOUS_MT_FANOUT_);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym236$FIND_ASSERTION,
				(SubLObject) kb_indexing.$list237, (SubLObject) kb_indexing.$str238$Find_the_assertion_in_MT_with_CNF,
				(SubLObject) kb_indexing.$list239, (SubLObject) kb_indexing.$list240);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym242$FIND_ASSERTION_ANY_MT,
				(SubLObject) kb_indexing.$list243, (SubLObject) kb_indexing.$str244$Find_any_assertion_in_any_mt_with,
				(SubLObject) kb_indexing.$list245, (SubLObject) kb_indexing.$list240);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym246$FIND_ALL_ASSERTIONS,
				(SubLObject) kb_indexing.$list243, (SubLObject) kb_indexing.$str247$Return_all_assertions_that_have_C,
				(SubLObject) kb_indexing.$list245, (SubLObject) kb_indexing.$list248);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym251$FIND_GAF,
				(SubLObject) kb_indexing.$list252, (SubLObject) kb_indexing.$str253$Find_the_assertion_in_MT_with_GAF,
				(SubLObject) kb_indexing.$list254, (SubLObject) kb_indexing.$list240);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym255$FIND_GAF_ANY_MT,
				(SubLObject) kb_indexing.$list256, (SubLObject) kb_indexing.$str257$Find_any_assertion_in_any_mt_with,
				(SubLObject) kb_indexing.$list258, (SubLObject) kb_indexing.$list240);
		utilities_macros.register_cyc_api_function((SubLObject) kb_indexing.$sym260$FIND_ALL_GAFS,
				(SubLObject) kb_indexing.$list256, (SubLObject) kb_indexing.$str261$Return_all_assertions_of_GAF_FORM,
				(SubLObject) kb_indexing.$list258, (SubLObject) kb_indexing.$list248);
		return (SubLObject) kb_indexing.NIL;
	}

	@Override
	public void declareFunctions() {
		declare_kb_indexing_file();
	}

	@Override
	public void initializeVariables() {
		init_kb_indexing_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_kb_indexing_file();
	}

	static {
		me = (SubLFile) new kb_indexing();
		kb_indexing.$indexing_good_enough_threshold$ = null;
		kb_indexing.$key_gaf_arg_index_cached_caching_state$ = null;
		kb_indexing.$index_spec_preds_of_ist_in_ist_pred_indexP$ = null;
		kb_indexing.$best_gaf_lookup_index_exact_num_predicate_extent_cutoff$ = null;
		kb_indexing.$best_gaf_lookup_index_zero_num_predicate_extent_cutoff$ = null;
		kb_indexing.$pred_heinous_mt_fanout_cutoff$ = null;
		kb_indexing.$pred_has_heinous_mt_fanoutP_caching_state$ = null;
		kb_indexing.$reindex_all_assertions_full_gc_threshhold_constant_count$ = null;
		kb_indexing.$warn_on_assertion_reindexing_errorsP$ = null;
		kb_indexing.$gathered_rule_assertions$ = null;
		$sym0$INTERMEDIATE_INDEX_P = SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-P");
		$list1 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("MT"),
				(SubLObject) SubLObjectFactory.makeSymbol("SUBINDEX"));
		$sym2$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
		$sym3$NUM_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("NUM-GAF-ARG-INDEX");
		$list4 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("TERM"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject) SubLObjectFactory.makeSymbol("PRED"),
				(SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str5$Return_the_number_of_gafs_indexed = SubLObjectFactory
				.makeString("Return the number of gafs indexed off of TERM ARGNUM PRED MT.");
		$list6 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("INTEGERP"));
		$sym7$KEY_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("KEY-GAF-ARG-INDEX");
		$sym8$RELEVANT_NUM_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX");
		$list9 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("TERM"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject) SubLObjectFactory.makeSymbol("PRED"));
		$str10$Return_the_assertion_count_at_rel = SubLObjectFactory
				.makeString("Return the assertion count at relevant mts under TERM ARGNUM PRED.");
		$sym11$RELEVANT_NUM_GAF_ARG_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX-WITH-CUTOFF");
		$sym12$KEY_GAF_ARG_INDEX_CACHED = SubLObjectFactory.makeSymbol("KEY-GAF-ARG-INDEX-CACHED");
		$sym13$_KEY_GAF_ARG_INDEX_CACHED_CACHING_STATE_ = SubLObjectFactory
				.makeSymbol("*KEY-GAF-ARG-INDEX-CACHED-CACHING-STATE*");
		$int14$5000 = SubLObjectFactory.makeInteger(5000);
		$sym15$CLEAR_KEY_GAF_ARG_INDEX_CACHED = SubLObjectFactory.makeSymbol("CLEAR-KEY-GAF-ARG-INDEX-CACHED");
		$str16$Return_a_list_of_the_keys_to_the_ = SubLObjectFactory.makeString(
				"Return a list of the keys to the next index level below TERM ARGNUM PRED.\n   @note destructible");
		$list17 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("LISTP"));
		$list18 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("ARGNUM"),
				(SubLObject) SubLObjectFactory.makeSymbol("PRED-SUBINDEX"));
		$kw19$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
		$sym20$NUM_NART_ARG_INDEX = SubLObjectFactory.makeSymbol("NUM-NART-ARG-INDEX");
		$list21 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("TERM"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject) SubLObjectFactory.makeSymbol("FUNC"));
		$str22$Return_the_number_of___termOfUnit = SubLObjectFactory
				.makeString("Return the number of #$termOfUnit gafs indexed off of TERM ARGNUM FUNC.");
		$sym23$RELEVANT_NUM_NART_ARG_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-NART-ARG-INDEX");
		$str24$Compute_the_assertion_count_at_re = SubLObjectFactory.makeString(
				"Compute the assertion count at relevant mts under TERM ARGNUM FUNC.\n   This will be the entire count extent if *tou-mt* is relevant,\n   and zero otherwise.");
		$sym25$KEY_NART_ARG_INDEX = SubLObjectFactory.makeSymbol("KEY-NART-ARG-INDEX");
		$str26$Return_a_list_of_the_keys_to_the_ = SubLObjectFactory
				.makeString("Return a list of the keys to the next index level below TERM ARGNUM FUNC.");
		$kw27$NART_ARG = SubLObjectFactory.makeKeyword("NART-ARG");
		$sym28$NUM_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("NUM-PREDICATE-EXTENT-INDEX");
		$list29 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PRED"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str30$Return_the_assertion_count_at_PRE = SubLObjectFactory
				.makeString("Return the assertion count at PRED MT.");
		$sym31$KEY_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("KEY-PREDICATE-EXTENT-INDEX");
		$sym32$RELEVANT_NUM_PREDICATE_EXTENT_INDEX = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX");
		$list33 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PRED"));
		$str34$Compute_the_assertion_count_at_re = SubLObjectFactory
				.makeString("Compute the assertion count at relevant mts under PRED.");
		$sym35$RELEVANT_NUM_PREDICATE_EXTENT_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX-WITH-CUTOFF");
		$str36$Return_a_list_of_the_keys_to_the_ = SubLObjectFactory
				.makeString("Return a list of the keys to the next predicate-extent index level below PRED.");
		$kw37$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
		$sym38$NUM_FUNCTION_EXTENT_INDEX = SubLObjectFactory.makeSymbol("NUM-FUNCTION-EXTENT-INDEX");
		$list39 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("FUNC"));
		$str40$Return_the_function_extent_of_FUN = SubLObjectFactory.makeString("Return the function extent of FUNC.");
		$sym41$RELEVANT_NUM_FUNCTION_EXTENT_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX");
		$str42$Compute_the_function_extent_at_re = SubLObjectFactory.makeString(
				"Compute the function extent at relevant mts under FUNC.\n   This will be the entire function extent if *tou-mt* is relevant,\n   and zero otherwise.");
		$kw43$FUNCTION_EXTENT = SubLObjectFactory.makeKeyword("FUNCTION-EXTENT");
		$sym44$NUM_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("NUM-PREDICATE-RULE-INDEX");
		$list45 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PRED"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("SENSE"), (SubLObject) SubLObjectFactory.makeSymbol("MT"),
				(SubLObject) SubLObjectFactory.makeSymbol("DIRECTION"));
		$str46$Return_the_raw_assertion_count_at = SubLObjectFactory
				.makeString("Return the raw assertion count at PRED SENSE MT DIRECTION.");
		$sym47$KEY_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("KEY-PREDICATE-RULE-INDEX");
		$sym48$RELEVANT_NUM_PREDICATE_RULE_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX");
		$sym49$RELEVANT_NUM_PREDICATE_RULE_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX-WITH-CUTOFF");
		$list50 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PRED"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("SENSE"), (SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str51$Return_a_list_of_the_keys_to_the_ = SubLObjectFactory
				.makeString("Return a list of the keys to the next index level below PRED SENSE MT.");
		$kw52$PREDICATE_RULE = SubLObjectFactory.makeKeyword("PREDICATE-RULE");
		$sym53$NUM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = SubLObjectFactory
				.makeSymbol("NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
		$list54 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PRED"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("SENSE"),
				(SubLObject) SubLObjectFactory.makeSymbol("DIRECTION"));
		$str55$Return_the_raw_assertion_count_at = SubLObjectFactory
				.makeString("Return the raw assertion count at PRED SENSE DIRECTION.");
		$sym56$KEY_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = SubLObjectFactory
				.makeSymbol("KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
		$list57 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("PRED"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("SENSE"));
		$str58$Return_a_list_of_the_keys_to_the_ = SubLObjectFactory
				.makeString("Return a list of the keys to the next index level below PRED SENSE.");
		$kw59$DECONTEXTUALIZED_IST_PREDICATE_RULE = SubLObjectFactory
				.makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
		$sym60$NUM_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("NUM-ISA-RULE-INDEX");
		$list61 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("COL"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("SENSE"), (SubLObject) SubLObjectFactory.makeSymbol("MT"),
				(SubLObject) SubLObjectFactory.makeSymbol("DIRECTION"));
		$str62$Return_the_raw_assertion_count_at = SubLObjectFactory
				.makeString("Return the raw assertion count at COL SENSE MT DIRECTION.");
		$sym63$KEY_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("KEY-ISA-RULE-INDEX");
		$sym64$RELEVANT_NUM_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX");
		$sym65$RELEVANT_NUM_ISA_RULE_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX-WITH-CUTOFF");
		$list66 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("COL"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("SENSE"), (SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str67$Return_a_list_of_the_keys_to_the_ = SubLObjectFactory
				.makeString("Return a list of the keys to the next index level below COL SENSE MT.");
		$kw68$ISA_RULE = SubLObjectFactory.makeKeyword("ISA-RULE");
		$sym69$NUM_QUOTED_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("NUM-QUOTED-ISA-RULE-INDEX");
		$sym70$KEY_QUOTED_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("KEY-QUOTED-ISA-RULE-INDEX");
		$sym71$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX");
		$sym72$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX-WITH-CUTOFF");
		$kw73$QUOTED_ISA_RULE = SubLObjectFactory.makeKeyword("QUOTED-ISA-RULE");
		$sym74$NUM_GENLS_RULE_INDEX = SubLObjectFactory.makeSymbol("NUM-GENLS-RULE-INDEX");
		$sym75$KEY_GENLS_RULE_INDEX = SubLObjectFactory.makeSymbol("KEY-GENLS-RULE-INDEX");
		$sym76$RELEVANT_NUM_GENLS_RULE_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX");
		$sym77$RELEVANT_NUM_GENLS_RULE_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX-WITH-CUTOFF");
		$kw78$GENLS_RULE = SubLObjectFactory.makeKeyword("GENLS-RULE");
		$sym79$NUM_GENL_MT_RULE_INDEX = SubLObjectFactory.makeSymbol("NUM-GENL-MT-RULE-INDEX");
		$sym80$KEY_GENL_MT_RULE_INDEX = SubLObjectFactory.makeSymbol("KEY-GENL-MT-RULE-INDEX");
		$sym81$RELEVANT_NUM_GENL_MT_RULE_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX");
		$sym82$RELEVANT_NUM_GENL_MT_RULE_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX-WITH-CUTOFF");
		$kw83$GENL_MT_RULE = SubLObjectFactory.makeKeyword("GENL-MT-RULE");
		$sym84$NUM_FUNCTION_RULE_INDEX = SubLObjectFactory.makeSymbol("NUM-FUNCTION-RULE-INDEX");
		$list85 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("FUNC"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject) SubLObjectFactory.makeSymbol("MT"),
				(SubLObject) SubLObjectFactory.makeSymbol("DIRECTION"));
		$str86$Return_the_raw_assertion_count_at = SubLObjectFactory
				.makeString("Return the raw assertion count at FUNC MT DIRECTION.");
		$sym87$KEY_FUNCTION_RULE_INDEX = SubLObjectFactory.makeSymbol("KEY-FUNCTION-RULE-INDEX");
		$sym88$RELEVANT_NUM_FUNCTION_RULE_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX");
		$sym89$RELEVANT_NUM_FUNCTION_RULE_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX-WITH-CUTOFF");
		$list90 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("FUNC"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str91$Return_a_list_of_the_keys_to_the_ = SubLObjectFactory
				.makeString("Return a list of the keys to the next index level below FUNC MT.");
		$kw92$FUNCTION_RULE = SubLObjectFactory.makeKeyword("FUNCTION-RULE");
		$sym93$NUM_EXCEPTION_RULE_INDEX = SubLObjectFactory.makeSymbol("NUM-EXCEPTION-RULE-INDEX");
		$list94 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("RULE"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject) SubLObjectFactory.makeSymbol("MT"),
				(SubLObject) SubLObjectFactory.makeSymbol("DIRECTION"));
		$str95$Return_the_raw_assertion_count_at = SubLObjectFactory
				.makeString("Return the raw assertion count at RULE MT DIRECTION.");
		$sym96$KEY_EXCEPTION_RULE_INDEX = SubLObjectFactory.makeSymbol("KEY-EXCEPTION-RULE-INDEX");
		$sym97$RELEVANT_NUM_EXCEPTION_RULE_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX");
		$sym98$RELEVANT_NUM_EXCEPTION_RULE_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX-WITH-CUTOFF");
		$list99 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("RULE"),
				(SubLObject) SubLObjectFactory.makeSymbol("&OPTIONAL"),
				(SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str100$Return_a_list_of_the_keys_to_the_ = SubLObjectFactory
				.makeString("Return a list of the keys to the next index level below RULE MT.");
		$kw101$EXCEPTION_RULE = SubLObjectFactory.makeKeyword("EXCEPTION-RULE");
		$sym102$NUM_PRAGMA_RULE_INDEX = SubLObjectFactory.makeSymbol("NUM-PRAGMA-RULE-INDEX");
		$sym103$KEY_PRAGMA_RULE_INDEX = SubLObjectFactory.makeSymbol("KEY-PRAGMA-RULE-INDEX");
		$sym104$RELEVANT_NUM_PRAGMA_RULE_INDEX = SubLObjectFactory.makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX");
		$sym105$RELEVANT_NUM_PRAGMA_RULE_INDEX_WITH_CUTOFF = SubLObjectFactory
				.makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX-WITH-CUTOFF");
		$kw106$PRAGMA_RULE = SubLObjectFactory.makeKeyword("PRAGMA-RULE");
		$sym107$NUM_MT_INDEX = SubLObjectFactory.makeSymbol("NUM-MT-INDEX");
		$list108 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("TERM"));
		$str109$Return_the_number_of_assertions_a = SubLObjectFactory
				.makeString("Return the number of assertions at the mt index for TERM.");
		$kw110$MT = SubLObjectFactory.makeKeyword("MT");
		$kw111$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
		$str112$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
		$sym113$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
		$kw114$SKIP = SubLObjectFactory.makeKeyword("SKIP");
		$int115$1000 = SubLObjectFactory.makeInteger(1000);
		$kw116$IST = SubLObjectFactory.makeKeyword("IST");
		$sym117$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
		$const118$EverythingPSC = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("EverythingPSC"));
		$sym119$NUM_HLMT_INDEX = SubLObjectFactory.makeSymbol("NUM-HLMT-INDEX");
		$list120 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str121$Return_the_number_of_assertions_a = SubLObjectFactory
				.makeString("Return the number of assertions at the hlmt virtual index for TERM.");
		$const122$BroadMicrotheory = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("BroadMicrotheory"));
		$sym123$REM_BROAD_MT_INDEX = SubLObjectFactory.makeSymbol("REM-BROAD-MT-INDEX");
		$sym124$NUM_OTHER_INDEX = SubLObjectFactory.makeSymbol("NUM-OTHER-INDEX");
		$str125$Return_the_number_of_assertions_a = SubLObjectFactory
				.makeString("Return the number of assertions at the other index for TERM.");
		$list126 = ConsesLow.list((SubLObject) SubLObjectFactory.makeUninternedSymbol("IGNORED-KEY"),
				(SubLObject) SubLObjectFactory.makeUninternedSymbol("SHARD"));
		$sym127$FINAL_INDEX_P = SubLObjectFactory.makeSymbol("FINAL-INDEX-P");
		$kw128$OTHER = SubLObjectFactory.makeKeyword("OTHER");
		$sym129$NUM_INDEX = SubLObjectFactory.makeSymbol("NUM-INDEX");
		$str130$The_total_number_of_assertions_in = SubLObjectFactory
				.makeString("The total number of assertions indexed from TERM.");
		$str131$Performing_indexing_cleanup___ = SubLObjectFactory.makeString("Performing indexing cleanup...");
		$sym132$UNINDEXED_SYNTAX_CONSTANT_CLEANUP_ONE_INDEX = SubLObjectFactory
				.makeSymbol("UNINDEXED-SYNTAX-CONSTANT-CLEANUP-ONE-INDEX");
		$sym133$UNINDEXED_SYNTAX_CONSTANT_INDEX_CLEANUP_INTERNAL = SubLObjectFactory
				.makeSymbol("UNINDEXED-SYNTAX-CONSTANT-INDEX-CLEANUP-INTERNAL");
		$sym134$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
		$sym135$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
		$sym136$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
		$kw137$POS = SubLObjectFactory.makeKeyword("POS");
		$kw138$NEG = SubLObjectFactory.makeKeyword("NEG");
		$sym139$_ = SubLObjectFactory.makeSymbol(">");
		$const140$isa = constant_handles.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("isa"));
		$const141$genls = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("genls"));
		$const142$termOfUnit = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("termOfUnit"));
		$str143$indexing_problem_while_removing__ = SubLObjectFactory.makeString("indexing problem while removing ~S");
		$sym144$REMOVE_TERM_INDICES = SubLObjectFactory.makeSymbol("REMOVE-TERM-INDICES");
		$str145$Remove_all_assertions_about_TERM_ = SubLObjectFactory
				.makeString("Remove all assertions about TERM from the KB. Return the TERM.");
		$list146 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("INDEXED-TERM-P"));
		$kw147$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
		$sym148$VALID_FULLY_INDEXED_TERM_P = SubLObjectFactory.makeSymbol("VALID-FULLY-INDEXED-TERM-P");
		$sym149$CDR = SubLObjectFactory.makeSymbol("CDR");
		$sym150$_ = SubLObjectFactory.makeSymbol("<");
		$sym151$CAR = SubLObjectFactory.makeSymbol("CAR");
		$sym152$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
		$sym153$TERM_INDEX_SWAPPED_IN_ = SubLObjectFactory.makeSymbol("TERM-INDEX-SWAPPED-IN?");
		$sym154$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
		$sym155$FULLY_INDEXED_HLMT_TERM_P = SubLObjectFactory.makeSymbol("FULLY-INDEXED-HLMT-TERM-P");
		$str156$So_don_t_ = SubLObjectFactory.makeString("So don't!");
		$str157$Don_t_know_how_to_index__S = SubLObjectFactory.makeString("Don't know how to index ~S");
		$list158 = (SubLList) ConsesLow.cons((SubLObject) SubLObjectFactory.makeSymbol("ARGNUM"),
				(SubLObject) SubLObjectFactory.makeSymbol("ARG"));
		$list159 = (SubLList) ConsesLow.cons((SubLObject) SubLObjectFactory.makeSymbol("F-ARGNUM"),
				(SubLObject) SubLObjectFactory.makeSymbol("F-ARG"));
		$kw160$ISA = SubLObjectFactory.makeKeyword("ISA");
		$kw161$PRED = SubLObjectFactory.makeKeyword("PRED");
		$const162$quotedIsa = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("quotedIsa"));
		$kw163$QUOTED_ISA = SubLObjectFactory.makeKeyword("QUOTED-ISA");
		$kw164$GENLS = SubLObjectFactory.makeKeyword("GENLS");
		$const165$genlMt = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("genlMt"));
		$kw166$GENL_MT = SubLObjectFactory.makeKeyword("GENL-MT");
		$kw167$FUNC = SubLObjectFactory.makeKeyword("FUNC");
		$const168$abnormal = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("abnormal"));
		$kw169$EXCEPTION = SubLObjectFactory.makeKeyword("EXCEPTION");
		$const170$meetsPragmaticRequirement = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("meetsPragmaticRequirement"));
		$kw171$PRAGMA = SubLObjectFactory.makeKeyword("PRAGMA");
		$kw172$IST_PRED = SubLObjectFactory.makeKeyword("IST-PRED");
		$sym173$FULLY_INDEXED_TERM_P = SubLObjectFactory.makeSymbol("FULLY-INDEXED-TERM-P");
		$sym174$SECOND = SubLObjectFactory.makeSymbol("SECOND");
		$list175 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("NEG-INDEXING-TYPE"),
				(SubLObject) SubLObjectFactory.makeSymbol("NEG-TERM"));
		$str176$Can_t_index_a_pragmatic_requireme = SubLObjectFactory
				.makeString("Can't index a pragmatic requirement as a neg-lit ~S");
		$str177$Can_t_index_an_exception_as_a_neg = SubLObjectFactory
				.makeString("Can't index an exception as a neg-lit ~S");
		$str178$Don_t_know_how_to_handle_indexing = SubLObjectFactory
				.makeString("Don't know how to handle indexing type ~S");
		$list179 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("POS-INDEXING-TYPE"),
				(SubLObject) SubLObjectFactory.makeSymbol("POS-TERM"));
		$str180$Can_t_index_a_function_rule_as_a_ = SubLObjectFactory
				.makeString("Can't index a function rule as a pos-lit ~S");
		$str181$Can_t_remove_the_index_of_a_pragm = SubLObjectFactory
				.makeString("Can't remove the index of a pragmatic requirement as a neg-lit ~S");
		$str182$Can_t_remove_the_index_of_an_exce = SubLObjectFactory
				.makeString("Can't remove the index of an exception as a neg-lit ~S");
		$str183$Can_t_remove_the_index_of_a_funct = SubLObjectFactory
				.makeString("Can't remove the index of a function rule as a pos-lit ~S");
		$const184$ist = constant_handles.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("ist"));
		$str185$Enabling_spec_preds_of_ist_indexi = SubLObjectFactory
				.makeString("Enabling spec-preds of ist indexing (reindexing ");
		$str186$_assertions_ = SubLObjectFactory.makeString(" assertions)");
		$kw187$RULE = SubLObjectFactory.makeKeyword("RULE");
		$kw188$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
		$sym189$DECENT_NAT_INDEX = SubLObjectFactory.makeSymbol("DECENT-NAT-INDEX");
		$list190 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("BEST-NAT-LOOKUP-INDEX"));
		$sym191$BEST_NAT_INDEX_COUNT = SubLObjectFactory.makeSymbol("BEST-NAT-INDEX-COUNT");
		$list192 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("NUM-BEST-NAT-LOOKUP-INDEX"));
		$kw193$PRED_POS = SubLObjectFactory.makeKeyword("PRED-POS");
		$kw194$IST_PRED_POS = SubLObjectFactory.makeKeyword("IST-PRED-POS");
		$kw195$ISA_POS = SubLObjectFactory.makeKeyword("ISA-POS");
		$kw196$QUOTED_ISA_POS = SubLObjectFactory.makeKeyword("QUOTED-ISA-POS");
		$kw197$GENLS_POS = SubLObjectFactory.makeKeyword("GENLS-POS");
		$kw198$GENL_MT_POS = SubLObjectFactory.makeKeyword("GENL-MT-POS");
		$kw199$PRED_NEG = SubLObjectFactory.makeKeyword("PRED-NEG");
		$kw200$IST_PRED_NEG = SubLObjectFactory.makeKeyword("IST-PRED-NEG");
		$kw201$ISA_NEG = SubLObjectFactory.makeKeyword("ISA-NEG");
		$kw202$QUOTED_ISA_NEG = SubLObjectFactory.makeKeyword("QUOTED-ISA-NEG");
		$kw203$GENLS_NEG = SubLObjectFactory.makeKeyword("GENLS-NEG");
		$kw204$GENL_MT_NEG = SubLObjectFactory.makeKeyword("GENL-MT-NEG");
		$list205 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("NEG-INDEXING-TYPE"),
				(SubLObject) SubLObjectFactory.makeSymbol("TERM"));
		$list206 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("POS-INDEXING-TYPE"),
				(SubLObject) SubLObjectFactory.makeSymbol("TERM"));
		$kw207$INDEX_TYPE = SubLObjectFactory.makeKeyword("INDEX-TYPE");
		$kw208$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
		$kw209$TERM = SubLObjectFactory.makeKeyword("TERM");
		$kw210$ARGNUM = SubLObjectFactory.makeKeyword("ARGNUM");
		$kw211$TERMS = SubLObjectFactory.makeKeyword("TERMS");
		$int212$500 = SubLObjectFactory.makeInteger(500);
		$str213$__slow_overlap___S_for__S__ = SubLObjectFactory.makeString("~&slow overlap: ~S for ~S~&");
		$kw214$FUNCTOR = SubLObjectFactory.makeKeyword("FUNCTOR");
		$int215$212 = SubLObjectFactory.makeInteger(212);
		$int216$2120 = SubLObjectFactory.makeInteger(2120);
		$int217$100 = SubLObjectFactory.makeInteger(100);
		$sym218$PRED_HAS_HEINOUS_MT_FANOUT_ = SubLObjectFactory.makeSymbol("PRED-HAS-HEINOUS-MT-FANOUT?");
		$sym219$_PRED_HAS_HEINOUS_MT_FANOUT__CACHING_STATE_ = SubLObjectFactory
				.makeSymbol("*PRED-HAS-HEINOUS-MT-FANOUT?-CACHING-STATE*");
		$int220$10000 = SubLObjectFactory.makeInteger(10000);
		$str221$Reindexing_assertions = SubLObjectFactory.makeString("Reindexing assertions");
		$str222$Clearing_Assertion_indexing = SubLObjectFactory.makeString("Clearing Assertion indexing");
		$str223$Clear_unrepresented_terms_table = SubLObjectFactory.makeString("Clear unrepresented terms table");
		$str224$Clear_auxiliary_indexing = SubLObjectFactory.makeString("Clear auxiliary indexing");
		$kw225$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
		$str226$Clearing_FORT_indexing = SubLObjectFactory.makeString("Clearing FORT indexing");
		$str227$Clearing_Unrepresented_Term_index = SubLObjectFactory
				.makeString("Clearing Unrepresented Term indexing");
		$sym228$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
		$kw229$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
		$sym230$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
		$str231$Error_when_indexing_assertion__A_ = SubLObjectFactory
				.makeString("Error when indexing assertion ~A: ~A.~%");
		$sym232$INDEX_LEAF_COUNT = SubLObjectFactory.makeSymbol("INDEX-LEAF-COUNT");
		$str233$Unexpected_index__S_when_merging_ = SubLObjectFactory
				.makeString("Unexpected index ~S when merging term indices for ~A.");
		$sym234$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
		$sym235$POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P");
		$sym236$FIND_ASSERTION = SubLObjectFactory.makeSymbol("FIND-ASSERTION");
		$list237 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("CNF"),
				(SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str238$Find_the_assertion_in_MT_with_CNF = SubLObjectFactory
				.makeString("Find the assertion in MT with CNF.  Return NIL if not present.");
		$list239 = ConsesLow.list(
				(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("CNF"),
						(SubLObject) SubLObjectFactory.makeSymbol("CNF-P")),
				(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("MT"),
						(SubLObject) SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P")));
		$list240 = ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("NIL-OR"),
				(SubLObject) SubLObjectFactory.makeSymbol("ASSERTION-P")));
		$sym241$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
		$sym242$FIND_ASSERTION_ANY_MT = SubLObjectFactory.makeSymbol("FIND-ASSERTION-ANY-MT");
		$list243 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("CNF"));
		$str244$Find_any_assertion_in_any_mt_with = SubLObjectFactory
				.makeString("Find any assertion in any mt with CNF.  Return NIL if none are present.");
		$list245 = ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("CNF"),
				(SubLObject) SubLObjectFactory.makeSymbol("CNF-P")));
		$sym246$FIND_ALL_ASSERTIONS = SubLObjectFactory.makeSymbol("FIND-ALL-ASSERTIONS");
		$str247$Return_all_assertions_that_have_C = SubLObjectFactory
				.makeString("Return all assertions that have CNF or NIL if there aren't any.\n   @note destructible");
		$list248 = ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("NIL-OR"),
				(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("LIST"),
						(SubLObject) SubLObjectFactory.makeSymbol("ASSERTION-P"))));
		$sym249$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
		$sym250$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
		$sym251$FIND_GAF = SubLObjectFactory.makeSymbol("FIND-GAF");
		$list252 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("GAF-FORMULA"),
				(SubLObject) SubLObjectFactory.makeSymbol("MT"));
		$str253$Find_the_assertion_in_MT_with_GAF = SubLObjectFactory
				.makeString("Find the assertion in MT with GAF-FORMULA as its formula.  Return NIL if not present.");
		$list254 = ConsesLow.list(
				(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("GAF-FORMULA"),
						(SubLObject) SubLObjectFactory.makeSymbol("EL-FORMULA-P")),
				(SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("MT"),
						(SubLObject) SubLObjectFactory.makeSymbol("HLMT-P")));
		$sym255$FIND_GAF_ANY_MT = SubLObjectFactory.makeSymbol("FIND-GAF-ANY-MT");
		$list256 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("GAF-FORMULA"));
		$str257$Find_any_assertion_in_any_mt_with = SubLObjectFactory.makeString(
				"Find any assertion in any mt with GAF-FORMULA as its formula.  Return NIL if not present.");
		$list258 = ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("GAF-FORMULA"),
				(SubLObject) SubLObjectFactory.makeSymbol("EL-FORMULA-P")));
		$sym259$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
		$sym260$FIND_ALL_GAFS = SubLObjectFactory.makeSymbol("FIND-ALL-GAFS");
		$str261$Return_all_assertions_of_GAF_FORM = SubLObjectFactory
				.makeString("Return all assertions of GAF-FORMULA or NIL if there aren't any.\n   @note destructible");
		$list262 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("INDEX"),
				(SubLObject) SubLObjectFactory.makeSymbol("TERM"));
		$kw263$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
		$sym264$FIND_CNF_INTERNAL = SubLObjectFactory.makeSymbol("FIND-CNF-INTERNAL");
		$kw265$GAF = SubLObjectFactory.makeKeyword("GAF");
		$kw266$CUTOFF = SubLObjectFactory.makeKeyword("CUTOFF");
		$sym267$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
		$sym268$ASSERTION_EL_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-EL-FORMULA");
		$sym269$GATHER_ONE_RULE_ASSERTION = SubLObjectFactory.makeSymbol("GATHER-ONE-RULE-ASSERTION");
		$list270 = ConsesLow.list((SubLObject) SubLObjectFactory.makeKeyword("NEG"),
				(SubLObject) SubLObjectFactory.makeKeyword("POS"));
		$const271$implies = constant_handles
				.reader_make_constant_shell((SubLObject) SubLObjectFactory.makeString("implies"));
	}

	public static final class $clear_key_gaf_arg_index_cached$ZeroArityFunction extends ZeroArityFunction {
		public $clear_key_gaf_arg_index_cached$ZeroArityFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("CLEAR-KEY-GAF-ARG-INDEX-CACHED"));
		}

		@Override
		public SubLObject processItem() {
			return kb_indexing.clear_key_gaf_arg_index_cached();
		}
	}

	public static final class $num_predicate_extent_index$UnaryFunction extends UnaryFunction {
		public $num_predicate_extent_index$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("NUM-PREDICATE-EXTENT-INDEX"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return kb_indexing.num_predicate_extent_index(arg1,
					(SubLObject) $num_predicate_extent_index$UnaryFunction.UNPROVIDED);
		}
	}

	public static final class $num_predicate_extent_index$BinaryFunction extends BinaryFunction {
		public $num_predicate_extent_index$BinaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("NUM-PREDICATE-EXTENT-INDEX"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return kb_indexing.num_predicate_extent_index(arg1, arg2);
		}
	}

	public static final class $num_index$UnaryFunction extends UnaryFunction {
		public $num_index$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("NUM-INDEX"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return kb_indexing.num_index(arg1);
		}
	}
}

/*
 *
 * D:\workspace\phase02-jrtl\extra-classes/com/cyc/cycjava/cycl/kb_indexing.
 * class Total time: 2497 ms
 *
 */