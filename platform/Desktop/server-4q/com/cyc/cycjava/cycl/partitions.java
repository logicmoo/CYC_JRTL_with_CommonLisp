package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.argumentation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class partitions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.partitions";
    public static final String myFingerPrint = "0fd71e1d71621c5aae2a6f638e89b5c2a2afb68719997c1ec4f9fc32dbf1d0c7";
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 1093L)
    private static SubLSymbol $partition_scope_completely_specifiedP$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 1687L)
    public static SubLSymbol $reset_sbhl_links$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 3163L)
    private static SubLSymbol $partition_scope_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 6196L)
    public static SubLSymbol $scope_partition_assertion_selective_test$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 6676L)
    public static SubLSymbol $assertion_partition_fort_filter_function$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12335L)
    private static SubLSymbol $partition_constant_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12632L)
    private static SubLSymbol $partition_nart_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12691L)
    private static SubLSymbol $partition_assertion_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12750L)
    private static SubLSymbol $partition_meta_assertion_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12809L)
    private static SubLSymbol $partition_kb_hl_support_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12868L)
    private static SubLSymbol $partition_argument_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12927L)
    private static SubLSymbol $partition_max_nart_complexity$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12987L)
    private static SubLSymbol $partition_max_term_order$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 13046L)
    private static SubLSymbol $partition_kb_hl_support_orders$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 13110L)
    private static SubLSymbol $partition_max_kb_hl_support_order$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 17286L)
    public static SubLSymbol $mark_partition_object_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 26607L)
    public static SubLSymbol $current_archive_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 35521L)
    private static SubLSymbol $dump_partition_format$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 36082L)
    private static SubLSymbol $backwards_compatibility_pairs$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 36340L)
    private static SubLSymbol $partition_section_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 36400L)
    private static SubLSymbol $partition_asserted_argument_type_flag$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 36473L)
    private static SubLSymbol $partition_special_objects$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 48325L)
    private static SubLSymbol $partition_entire_kb_loadP$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 49519L)
    private static SubLSymbol $load_partition_invalid_missing_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 53004L)
    private static SubLSymbol $load_partition_max_nart_complexity$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 53071L)
    private static SubLSymbol $load_partition_max_term_order$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 53137L)
    private static SubLSymbol $load_partition_max_kb_hl_support_order$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 53203L)
    public static SubLSymbol $trace_partition_link_errors$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 67151L)
    public static SubLSymbol $load_partition_weaken_hl_supports$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 68074L)
    private static SubLSymbol $preseeded_partition_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 68379L)
    private static SubLSymbol $load_partition_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 68690L)
    private static SubLSymbol $load_partition_scope_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 68750L)
    private static SubLSymbol $load_partition_missing_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 78835L)
    private static SubLSymbol $load_partition_narts$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 79153L)
    private static SubLSymbol $load_partition_scope_narts$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 79209L)
    private static SubLSymbol $load_partition_missing_narts$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 81883L)
    private static SubLSymbol $load_partition_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 82229L)
    private static SubLSymbol $load_partition_missing_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 84937L)
    private static SubLSymbol $load_partition_kb_hl_supports$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 85103L)
    private static SubLSymbol $load_partition_scope_kb_hl_supports$;
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 85168L)
    private static SubLSymbol $load_partition_missing_kb_hl_supports$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$KEYWORDP;
    private static final SubLSymbol $kw2$ONTOLOGY;
    private static final SubLSymbol $kw3$QUOTED_ONTOLOGY;
    private static final SubLSymbol $kw4$TERM;
    private static final SubLSymbol $kw5$DEFINITION;
    private static final SubLSymbol $kw6$FUNCTION;
    private static final SubLList $list7;
    private static final SubLString $str8$Unknown_scope_partition_function_;
    private static final SubLSymbol $kw9$ESTIMATED_ASSERTION_COUNT;
    private static final SubLSymbol $kw10$SCOPE_COMPLETELY_SPECIFIED_;
    private static final SubLString $str11$Unable_to_scope_partition_via__S_;
    private static final SubLInteger $int12$100;
    private static final SubLString $str13$Non_scope_object__A_not_allowed_;
    private static final SubLSymbol $sym14$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const15$EverythingPSC;
    private static final SubLSymbol $kw16$GAF;
    private static final SubLObject $const17$ResearchCycDefinitionalPredicate;
    private static final SubLSymbol $sym18$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $sym19$SCOPE_PARTITION_ASSERTION;
    private static final SubLSymbol $sym20$SCOPE_PARTITION_TERM;
    private static final SubLSymbol $sym21$FORT_P;
    private static final SubLString $str22$marking_partition_content;
    private static final SubLInteger $int23$256;
    private static final SubLSymbol $sym24$MARK_PARTITION_OBJECT_CONS_METHOD;
    private static final SubLSymbol $sym25$MARK_PARTITION_OBJECT_CONSTANT_METHOD;
    private static final SubLSymbol $sym26$MARK_PARTITION_OBJECT_NART_METHOD;
    private static final SubLSymbol $sym27$MARK_PARTITION_OBJECT_ASSERTION_METHOD;
    private static final SubLSymbol $sym28$MARK_PARTITION_OBJECT_DEDUCTION_METHOD;
    private static final SubLSymbol $sym29$MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD;
    private static final SubLSymbol $sym30$BELIEF_P;
    private static final SubLString $str31$_______S_constants;
    private static final SubLString $str32$___A_S;
    private static final SubLString $str33$___;
    private static final SubLString $str34$___;
    private static final SubLString $str35$______Max_NART_level____S;
    private static final SubLString $str36$______level__S_NARTs;
    private static final SubLString $str37$______Max_term_order___S;
    private static final SubLString $str38$_______S_assertions;
    private static final SubLString $str39$_______S_meta_assertions;
    private static final SubLString $str40$______order__S_meta_assertions;
    private static final SubLString $str41$_______S_arguments;
    private static final SubLString $str42$Deduction______S;
    private static final SubLString $str43$Beliefs_for____S;
    private static final SubLString $str44$Unknown________S;
    private static final SubLString $str45$______Max_KB_HL_support_level____;
    private static final SubLString $str46$_______S_KB_HL_supports;
    private static final SubLString $str47$______level__S_KB_HL_supports;
    private static final SubLString $str48$removing_partition_assertions;
    private static final SubLString $str49$removing_partition_NARTs;
    private static final SubLString $str50$removing_partition_constants;
    private static final SubLList $list51;
    private static final SubLString $str52$lisp;
    private static final SubLSymbol $sym53$ASSERTION_P;
    private static final SubLString $str54$_____FI_ASSERT___S__S__S__S_;
    private static final SubLString $str55$_____FI_CREATE__a_;
    private static final SubLSymbol $sym56$ARCHIVE_ASSERTION_IF_LOCAL;
    private static final SubLSymbol $kw57$APPEND;
    private static final SubLString $str58$Unable_to_open__S;
    private static final SubLString $str59$______Archive_saved_at__s____;
    private static final SubLSymbol $sym60$STRINGP;
    private static final SubLSymbol $kw61$OUTPUT;
    private static final SubLSymbol $sym62$CFASL_ENCODABLE_STREAM_P;
    private static final SubLSymbol $kw63$UNINITIALIZED;
    private static final SubLSymbol $sym64$DEDUCTION_P;
    private static final SubLSymbol $sym65$_;
    private static final SubLSymbol $sym66$CONSTANT_INTERNAL_ID;
    private static final SubLSymbol $sym67$NART_ID;
    private static final SubLSymbol $sym68$TERM_FUNCTIONAL_COMPLEXITY;
    private static final SubLSymbol $sym69$TERM_ORDER;
    private static final SubLSymbol $sym70$DEDUCTION_ID;
    private static final SubLSymbol $sym71$KB_HL_SUPPORT_ID;
    private static final SubLSymbol $kw72$NEW_CONSTANTS;
    private static final SubLSymbol $kw73$NEW_NARTS;
    private static final SubLSymbol $kw74$NEW_ASSERTIONS;
    private static final SubLSymbol $kw75$NEW_DEDUCTIONS;
    private static final SubLString $str76$2_2;
    private static final SubLList $list77;
    private static final SubLSymbol $kw78$SECTION;
    private static final SubLSymbol $kw79$ASSERTED;
    private static final SubLList $list80;
    private static final SubLFloat $float81$0_1;
    private static final SubLString $str82$_large__partition_constant_shells;
    private static final SubLSymbol $kw83$SKIP;
    private static final SubLString $str84$partition_constant_shells;
    private static final SubLString $str85$partition_level_;
    private static final SubLString $str86$_NART_shells;
    private static final SubLString $str87$_large__;
    private static final SubLString $str88$_large__partition_assertions;
    private static final SubLString $str89$partition_assertions;
    private static final SubLString $str90$partition_order_;
    private static final SubLString $str91$_meta_assertions;
    private static final SubLString $str92$_KB_HL_supports;
    private static final SubLString $str93$_large__partition_beliefs;
    private static final SubLString $str94$_large__partition_deductions;
    private static final SubLString $str95$_large__partition_bookkeeping_inf;
    private static final SubLString $str96$partition_arguments;
    private static final SubLString $str97$Unknown_argument_object__S;
    private static final SubLString $str98$Unable_to_dump_belief__S;
    private static final SubLList $list99;
    private static final SubLString $str100$cleaning_up_after_partition_load_;
    private static final SubLObject $const101$isa;
    private static final SubLSymbol $sym102$LOAD_PARTITION_INVALID_MISSING_TERM_;
    private static final SubLString $str103$partition_load_KB_cleanup_removed;
    private static final SubLString $str104$__A_constants__;
    private static final SubLString $str105$__A_NARTs__;
    private static final SubLString $str106$__A_assertions__;
    private static final SubLSymbol $kw107$INPUT;
    private static final SubLSymbol $sym108$PARTITION_FIND_CONSTANT_BY_ID;
    private static final SubLSymbol $sym109$PARTITION_FIND_NART_BY_ID;
    private static final SubLSymbol $sym110$PARTITION_FIND_ASSERTION_BY_ID;
    private static final SubLSymbol $sym111$PARTITION_FIND_KB_HL_SUPPORT_BY_ID;
    private static final SubLSymbol $sym112$ATOM;
    private static final SubLSymbol $sym113$INTEGERP;
    private static final SubLString $str114$partition_format_is__A__not__A__a;
    private static final SubLSymbol $kw115$EOF;
    private static final SubLString $str116$malformed_partition_file;
    private static final SubLString $str117$loading_partition_constant_shells;
    private static final SubLSymbol $sym118$GUID_P;
    private static final SubLString $str119$loading_partition_level_;
    private static final SubLString $str120$_narts;
    private static final SubLSymbol $sym121$POSSIBLY_NAUT_P;
    private static final SubLString $str122$loading_partition_assertions;
    private static final SubLString $str123$loading_partition_order_;
    private static final SubLString $str124$_meta_assertions;
    private static final SubLString $str125$Skipping_assertion_with_bad_id__A;
    private static final SubLString $str126$Skipping_assertion_with_bad_cnf__;
    private static final SubLString $str127$Skipping_assertion_with_bad_mt__S;
    private static final SubLString $str128$Skipping_assertion_with_bad_direc;
    private static final SubLString $str129$Skipping_assertion_with_bad_vname;
    private static final SubLSymbol $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym133$CSETQ;
    private static final SubLString $str134$_A;
    private static final SubLSymbol $kw135$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym136$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym137$HL_SUPPORT_P;
    private static final SubLSymbol $sym138$HL_JUSTIFICATION_P;
    private static final SubLString $str139$loading_partition_arguments;
    private static final SubLString $str140$Skipping_asserted_argument_for_ba;
    private static final SubLString $str141$Skipping_asserted_argument_for_as;
    private static final SubLString $str142$Skipping_asserted_argument_for_as;
    private static final SubLString $str143$Skipping_deduction__id__A__with_b;
    private static final SubLString $str144$Skipping_deduction__id__A__with_b;
    private static final SubLString $str145$Skipping_deduction__id__A__with_b;
    private static final SubLSymbol $sym146$CNF_P;
    private static final SubLSymbol $sym147$POSSIBLY_HLMT_P;
    private static final SubLSymbol $sym148$EL_STRENGTH_P;
    private static final SubLSymbol $sym149$DIRECTION_P;
    private static final SubLSymbol $sym150$LISTP;
    private static final SubLString $str151$Did_not_find_constant__D_;
    private static final SubLSymbol $sym152$CONSTANT_P;
    private static final SubLSymbol $sym153$_EXIT;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLSymbol $kw156$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw157$EXPECTED_TOTAL;
    private static final SubLSymbol $kw158$SCOPED_MAP;
    private static final SubLSymbol $sym159$CLET;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$_LOAD_PARTITION_CONSTANTS_;
    private static final SubLSymbol $sym162$NEW_LOAD_PARTITION_CONSTANTS_STORE;
    private static final SubLSymbol $sym163$_LOAD_PARTITION_SCOPE_CONSTANTS_;
    private static final SubLSymbol $sym164$FWHEN;
    private static final SubLSymbol $sym165$HASH_TABLE_P;
    private static final SubLSymbol $sym166$NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE;
    private static final SubLSymbol $sym167$PRESEED_LOAD_PARTITION_CONSTANTS_STORE;
    private static final SubLString $str168$NAME_change_for__S___new_name_is_;
    private static final SubLString $str169$installing_ID__S_for__S;
    private static final SubLString $str170$NAME_clash_for__S___renaming_to__;
    private static final SubLString $str171$Constant_with_NAME__S_and_ID__S_m;
    private static final SubLString $str172$Non_scope_NART__S_not_found_;
    private static final SubLString $str173$Did_not_find_NART__D_;
    private static final SubLString $str174$Non_scope_assertion__S___S__not_f;
    private static final SubLString $str175$Did_not_find_assertion__D_;
    private static final SubLString $str176$Non_scope_KB_HL_support__S_not_fo;
    private static final SubLString $str177$Did_not_find_KB_HL_support__D;
    private static final SubLList $list178;
    private static final SubLString $str179$Could_not_assert__a_in__a_with_st;
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 1580L)
    public static SubLObject partition_scope_completely_specifiedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return partitions.$partition_scope_completely_specifiedP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 1961L)
    public static SubLObject scope_partition(final SubLObject partition) {
        clear_partition_scope();
        SubLObject cdolist_list_var = partition;
        SubLObject partition_item = (SubLObject)partitions.NIL;
        partition_item = cdolist_list_var.first();
        while (partitions.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = partition_item;
            SubLObject method = (SubLObject)partitions.NIL;
            SubLObject term_spec = (SubLObject)partitions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)partitions.$list0);
            method = current.first();
            current = (term_spec = current.rest());
            assert partitions.NIL != Types.keywordp(method) : method;
            final SubLObject pcase_var = method;
            if (pcase_var.eql((SubLObject)partitions.$kw2$ONTOLOGY)) {
                scope_partition_ontology(partition_term_spec_to_term(term_spec));
            }
            else if (pcase_var.eql((SubLObject)partitions.$kw3$QUOTED_ONTOLOGY)) {
                scope_partition_quoted_ontology(partition_term_spec_to_term(term_spec));
            }
            else if (pcase_var.eql((SubLObject)partitions.$kw4$TERM)) {
                scope_partition_term(partition_term_spec_to_term(term_spec));
            }
            else if (pcase_var.eql((SubLObject)partitions.$kw5$DEFINITION)) {
                scope_partition_definition(partition_term_spec_to_term(term_spec));
            }
            else if (pcase_var.eql((SubLObject)partitions.$kw6$FUNCTION)) {
                SubLObject current_$2;
                final SubLObject datum_$1 = current_$2 = term_spec;
                SubLObject function = (SubLObject)partitions.NIL;
                SubLObject args = (SubLObject)partitions.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)partitions.$list7);
                function = current_$2.first();
                current_$2 = (args = current_$2.rest());
                if (function.isFunctionSpec()) {
                    Functions.apply(function, args);
                }
                else {
                    Errors.warn((SubLObject)partitions.$str8$Unknown_scope_partition_function_, function);
                }
            }
            else if (!pcase_var.eql((SubLObject)partitions.$kw9$ESTIMATED_ASSERTION_COUNT)) {
                if (!pcase_var.eql((SubLObject)partitions.$kw10$SCOPE_COMPLETELY_SPECIFIED_)) {
                    Errors.warn((SubLObject)partitions.$str11$Unable_to_scope_partition_via__S_, partition_item);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            partition_item = cdolist_list_var.first();
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 3228L)
    public static SubLObject partition_scope_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(Hashtables.gethash_without_values(v_object, partitions.$partition_scope_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 3351L)
    public static SubLObject clear_partition_scope() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!partitions.$partition_scope_hash$.getDynamicValue(thread).isHashtable()) {
            final SubLObject size = Numbers.integerDivide(Numbers.add(assertion_handles.assertion_count(), forts.fort_count()), (SubLObject)partitions.$int12$100);
            partitions.$partition_scope_hash$.setDynamicValue(Hashtables.make_hash_table(size, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED), thread);
        }
        Hashtables.clrhash(partitions.$partition_scope_hash$.getDynamicValue(thread));
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 3737L)
    public static SubLObject partition_term_spec_to_term(final SubLObject term_spec) {
        if (term_spec.isAtom()) {
            return partition_term_spec_to_term_internal(term_spec);
        }
        return partition_term_spec_to_term_internal(term_spec.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 4080L)
    public static SubLObject partition_term_spec_to_term_internal(final SubLObject term_spec) {
        SubLObject v_term = (SubLObject)partitions.NIL;
        if (partitions.NIL != forts.fort_p(term_spec)) {
            if (partitions.NIL != forts.valid_fortP(term_spec)) {
                v_term = term_spec;
            }
        }
        else if (term_spec.isString()) {
            final SubLObject constant = constants_high.find_constant(term_spec);
            if (partitions.NIL != constant_handles.valid_constantP(constant, (SubLObject)partitions.UNPROVIDED)) {
                v_term = constant;
            }
        }
        else if (partitions.NIL != constants_high.constant_external_id_p(term_spec)) {
            final SubLObject constant = constants_high.find_constant_by_external_id(term_spec);
            if (partitions.NIL != constant_handles.valid_constantP(constant, (SubLObject)partitions.UNPROVIDED)) {
                v_term = constant;
            }
        }
        else if (term_spec.isFixnum()) {
            final SubLObject constant = constants_high.find_constant_by_internal_id(term_spec);
            if (partitions.NIL != constant_handles.valid_constantP(constant, (SubLObject)partitions.UNPROVIDED)) {
                v_term = constant;
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 4921L)
    public static SubLObject scope_partition_object_only(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL == Hashtables.gethash_without_values(v_object, partitions.$partition_scope_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            if (partitions.NIL != forts.fort_p(v_object) || partitions.NIL != assertion_handles.assertion_p(v_object) || partitions.NIL != deduction_handles.deduction_p(v_object) || partitions.NIL != kb_hl_support_handles.kb_hl_support_p(v_object)) {
                Hashtables.sethash(v_object, partitions.$partition_scope_hash$.getDynamicValue(thread), v_object);
            }
            else {
                Errors.warn((SubLObject)partitions.$str13$Non_scope_object__A_not_allowed_);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 5496L)
    public static SubLObject scope_partition_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != assertion_handles.assertion_p(assertion)) {
            Hashtables.sethash(assertion, partitions.$partition_scope_hash$.getDynamicValue(thread), assertion);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 5757L)
    public static SubLObject scope_partition_assertion_and_meta_assertions(final SubLObject assertion) {
        if (partitions.NIL != assertion_handles.assertion_p(assertion)) {
            scope_partition_assertion(assertion);
            if (partitions.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                SubLObject cdolist_list_var;
                final SubLObject meta_assertions = cdolist_list_var = assertion_utilities.all_meta_assertions(assertion);
                SubLObject meta_assertion = (SubLObject)partitions.NIL;
                meta_assertion = cdolist_list_var.first();
                while (partitions.NIL != cdolist_list_var) {
                    scope_partition_assertion(meta_assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    meta_assertion = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 6269L)
    public static SubLObject scope_partition_assertion_selective(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != assertion_handles.assertion_p(assertion) && partitions.NIL != Functions.apply(partitions.$scope_partition_assertion_selective_test$.getDynamicValue(thread), (SubLObject)ConsesLow.list(assertion))) {
            Hashtables.sethash(assertion, partitions.$partition_scope_hash$.getDynamicValue(thread), assertion);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 6749L)
    public static SubLObject scope_partition_assertion_and_constituents(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != assertion_handles.assertion_p(assertion)) {
            scope_partition_assertion(assertion);
            SubLObject cdolist_list_var = assertions_high.assertion_forts(assertion, (SubLObject)partitions.T, (SubLObject)partitions.T, (SubLObject)partitions.T, (SubLObject)partitions.UNPROVIDED);
            SubLObject fort = (SubLObject)partitions.NIL;
            fort = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                if (partitions.NIL == partitions.$assertion_partition_fort_filter_function$.getDynamicValue(thread) || partitions.NIL != Functions.funcall(partitions.$assertion_partition_fort_filter_function$.getDynamicValue(thread), fort)) {
                    scope_partition_object_only(fort);
                }
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 7300L)
    public static SubLObject scope_partition_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != kb_indexing_datastructures.indexed_term_p(v_term) && partitions.NIL == Hashtables.gethash_without_values(v_term, partitions.$partition_scope_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            Hashtables.sethash(v_term, partitions.$partition_scope_hash$.getDynamicValue(thread), v_term);
            if (partitions.NIL != forts.fort_p(v_term)) {
                scope_partition_term_internal(v_term);
            }
            else {
                scope_partition_term_internal(v_term);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 7777L)
    public static SubLObject scope_partition_definition(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != kb_indexing_datastructures.indexed_term_p(v_term)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)partitions.$sym14$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(partitions.$const15$EverythingPSC, thread);
                final SubLObject pred_var = (SubLObject)partitions.NIL;
                if (partitions.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)partitions.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)partitions.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)partitions.NIL;
                    final SubLObject token_var = (SubLObject)partitions.NIL;
                    while (partitions.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (partitions.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)partitions.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)partitions.$kw16$GAF, (SubLObject)partitions.NIL, (SubLObject)partitions.NIL);
                                SubLObject done_var_$3 = (SubLObject)partitions.NIL;
                                final SubLObject token_var_$4 = (SubLObject)partitions.NIL;
                                while (partitions.NIL == done_var_$3) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                    if (partitions.NIL != valid_$5) {
                                        final SubLObject predicate = assertions_high.gaf_predicate(gaf);
                                        if (partitions.NIL != isa.quoted_isa_in_any_mtP(predicate, partitions.$const17$ResearchCycDefinitionalPredicate)) {
                                            scope_partition_term(gaf);
                                        }
                                    }
                                    done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(partitions.NIL == valid_$5);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (partitions.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(partitions.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 8188L)
    public static SubLObject scope_partition_term_and_narts(final SubLObject v_term) {
        if (partitions.NIL != forts.fort_p(v_term)) {
            scope_partition_term(v_term);
            SubLObject cdolist_list_var = indexing_utilities.dependent_narts(v_term);
            SubLObject dependent_nart = (SubLObject)partitions.NIL;
            dependent_nart = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                scope_partition_term(dependent_nart);
                cdolist_list_var = cdolist_list_var.rest();
                dependent_nart = cdolist_list_var.first();
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 8469L)
    public static SubLObject scope_partition_term_in_mt(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != kb_indexing_datastructures.indexed_term_p(v_term) && partitions.NIL != fort_types_interface.mtP(mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)partitions.$sym18$RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_term(Symbols.symbol_function((SubLObject)partitions.$sym19$SCOPE_PARTITION_ASSERTION), v_term);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 8721L)
    public static SubLObject scope_partition_rf(final SubLObject rf) {
        if (partitions.NIL != assertion_handles.assertion_p(rf)) {
            return scope_partition_assertion(rf);
        }
        return scope_partition_term(rf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 8890L)
    public static SubLObject scope_partition_rf_and_super_rfs(final SubLObject rf) {
        if (partitions.NIL != assertion_handles.assertion_p(rf)) {
            return scope_partition_assertion_and_meta_assertions(rf);
        }
        return scope_partition_term_and_narts(rf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 9086L)
    public static SubLObject selected_scope_partition_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != kb_indexing_datastructures.indexed_term_p(v_term) && partitions.NIL == Hashtables.gethash_without_values(v_term, partitions.$partition_scope_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            Hashtables.sethash(v_term, partitions.$partition_scope_hash$.getDynamicValue(thread), v_term);
            if (partitions.NIL != forts.fort_p(v_term)) {
                selected_scope_partition_term_internal(v_term);
            }
            else {
                selected_scope_partition_term_internal(v_term);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 9592L)
    public static SubLObject scope_partition_ontology(final SubLObject ontology_start) {
        if (partitions.NIL != forts.fort_p(ontology_start)) {
            scope_partition_term(ontology_start);
            SubLObject cdolist_list_var = isa.all_instances_in_all_mts(ontology_start);
            SubLObject instance = (SubLObject)partitions.NIL;
            instance = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                scope_partition_term(instance);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
            cdolist_list_var = genls.all_specs_in_all_mts(ontology_start, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
            SubLObject spec = (SubLObject)partitions.NIL;
            spec = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                scope_partition_term(spec);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 10018L)
    public static SubLObject scope_partition_quoted_ontology(final SubLObject quoted_ontology_start) {
        if (partitions.NIL != forts.fort_p(quoted_ontology_start)) {
            scope_partition_term(quoted_ontology_start);
            SubLObject cdolist_list_var = isa.all_quoted_instances_in_all_mts(quoted_ontology_start);
            SubLObject quoted_instance = (SubLObject)partitions.NIL;
            quoted_instance = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                scope_partition_term(quoted_instance);
                cdolist_list_var = cdolist_list_var.rest();
                quoted_instance = cdolist_list_var.first();
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 10411L)
    public static SubLObject selected_scope_partition_ontology(final SubLObject ontology_start) {
        if (partitions.NIL != forts.fort_p(ontology_start)) {
            selected_scope_partition_term(ontology_start);
            SubLObject cdolist_list_var = isa.all_instances_in_all_mts(ontology_start);
            SubLObject instance = (SubLObject)partitions.NIL;
            instance = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                selected_scope_partition_term(instance);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            }
            cdolist_list_var = genls.all_specs_in_all_mts(ontology_start, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
            SubLObject spec = (SubLObject)partitions.NIL;
            spec = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                selected_scope_partition_term(spec);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 10874L)
    public static SubLObject scope_partition_arg_index(final SubLObject v_term, final SubLObject arg, SubLObject pred, SubLObject mt, SubLObject truth) {
        if (pred == partitions.UNPROVIDED) {
            pred = (SubLObject)partitions.NIL;
        }
        if (mt == partitions.UNPROVIDED) {
            mt = (SubLObject)partitions.NIL;
        }
        if (truth == partitions.UNPROVIDED) {
            truth = (SubLObject)partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)partitions.$sym14$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(partitions.$const15$EverythingPSC, thread);
            kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)partitions.$sym20$SCOPE_PARTITION_TERM), v_term, arg, pred, truth, mt);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 11108L)
    public static SubLObject scope_partition_predicate_rule_index(final SubLObject v_term, final SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == partitions.UNPROVIDED) {
            mt = (SubLObject)partitions.NIL;
        }
        if (direction == partitions.UNPROVIDED) {
            direction = (SubLObject)partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)partitions.$sym14$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(partitions.$const15$EverythingPSC, thread);
            kb_mapping.map_predicate_rule_index(Symbols.symbol_function((SubLObject)partitions.$sym20$SCOPE_PARTITION_TERM), v_term, sense, direction, mt);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 11362L)
    public static SubLObject scope_partition_mt_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)partitions.$sym14$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(partitions.$const15$EverythingPSC, thread);
            kb_mapping.map_mt_index(Symbols.symbol_function((SubLObject)partitions.$sym20$SCOPE_PARTITION_TERM), v_term, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 11490L)
    public static SubLObject scope_partition_other_index(final SubLObject v_term) {
        kb_mapping.map_other_index(Symbols.symbol_function((SubLObject)partitions.$sym20$SCOPE_PARTITION_TERM), v_term, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 11605L)
    public static SubLObject scope_partition_deduction(final SubLObject deduction) {
        if (partitions.NIL != deduction_handles.deduction_p(deduction)) {
            final SubLObject assertion = deductions_high.deduction_assertion(deduction);
            scope_partition_assertion(assertion);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 11872L)
    public static SubLObject partition_scope() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_values(partitions.$partition_scope_hash$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 11962L)
    public static SubLObject partition_forts() {
        return list_utilities.remove_if_not((SubLObject)partitions.$sym21$FORT_P, partition_scope(), (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12051L)
    public static SubLObject scope_partition_term_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)partitions.$sym14$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(partitions.$const15$EverythingPSC, thread);
            kb_mapping.map_term((SubLObject)partitions.$sym20$SCOPE_PARTITION_TERM, v_term);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 12191L)
    public static SubLObject selected_scope_partition_term_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)partitions.$sym14$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(partitions.$const15$EverythingPSC, thread);
            kb_mapping.selected_map_term((SubLObject)partitions.$sym20$SCOPE_PARTITION_TERM, v_term, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 13173L)
    public static SubLObject clear_partition_content(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == partitions.UNPROVIDED) {
            estimated_assertion_count = (SubLObject)partitions.NIL;
        }
        if (partitions.NIL == estimated_assertion_count) {
            estimated_assertion_count = Numbers.integerDivide(assertion_handles.assertion_count(), (SubLObject)partitions.TEN_INTEGER);
        }
        final SubLObject constant_table_size = Numbers.round(Numbers.divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_constant()), (SubLObject)partitions.UNPROVIDED);
        partitions.$partition_constant_hash$.setDynamicValue(Hashtables.make_hash_table(constant_table_size, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED));
        final SubLObject nart_table_size = Numbers.round(Numbers.divide(Numbers.divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_constant()), kb_utilities.estimated_constants_per_nart()), (SubLObject)partitions.UNPROVIDED);
        partitions.$partition_nart_hash$.setDynamicValue(Hashtables.make_hash_table(nart_table_size, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED));
        final SubLObject assertion_table_size = estimated_assertion_count;
        partitions.$partition_assertion_hash$.setDynamicValue(Hashtables.make_hash_table(assertion_table_size, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED));
        final SubLObject meta_assertion_table_size = Numbers.round(Numbers.divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_meta_assertion()), (SubLObject)partitions.UNPROVIDED);
        partitions.$partition_meta_assertion_hash$.setDynamicValue(Hashtables.make_hash_table(meta_assertion_table_size, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED));
        final SubLObject kb_hl_support_table_size = Numbers.round(Numbers.divide(estimated_assertion_count, kb_utilities.estimated_assertions_per_hl_support()), (SubLObject)partitions.UNPROVIDED);
        partitions.$partition_kb_hl_support_hash$.setDynamicValue(Hashtables.make_hash_table(kb_hl_support_table_size, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED));
        final SubLObject argument_table_size = Numbers.round(Numbers.multiply(estimated_assertion_count, kb_utilities.estimated_arguments_per_assertion()), (SubLObject)partitions.UNPROVIDED);
        partitions.$partition_argument_hash$.setDynamicValue(Hashtables.make_hash_table(argument_table_size, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED));
        partitions.$partition_max_nart_complexity$.setDynamicValue((SubLObject)partitions.ZERO_INTEGER);
        partitions.$partition_max_term_order$.setDynamicValue((SubLObject)partitions.ZERO_INTEGER);
        partitions.$partition_kb_hl_support_orders$.setDynamicValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED));
        partitions.$partition_max_kb_hl_support_order$.setDynamicValue((SubLObject)partitions.ZERO_INTEGER);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 15162L)
    public static SubLObject partition_estimated_assertion_count(final SubLObject partition) {
        final SubLObject cons = list_utilities.alist_lookup_without_values(partition, (SubLObject)partitions.$kw9$ESTIMATED_ASSERTION_COUNT, Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.NIL);
        if (cons.isCons()) {
            return cons.first();
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 15488L)
    public static SubLObject partition_scope_completely_specified_by_partitionP(final SubLObject partition) {
        final SubLObject cons = list_utilities.alist_lookup_without_values(partition, (SubLObject)partitions.$kw10$SCOPE_COMPLETELY_SPECIFIED_, Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.NIL);
        if (cons.isCons()) {
            return cons.first();
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 16044L)
    public static SubLObject mark_partition_content(final SubLObject partition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        scope_partition(partition);
        final SubLObject estimated_assertion_count = partition_estimated_assertion_count(partition);
        clear_partition_content(estimated_assertion_count);
        final SubLObject _prev_bind_0 = partitions.$partition_scope_completely_specifiedP$.currentBinding(thread);
        try {
            partitions.$partition_scope_completely_specifiedP$.bind(partition_scope_completely_specified_by_partitionP(partition), thread);
            final SubLObject table_var = partitions.$partition_scope_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$7 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)partitions.$str22$marking_partition_content, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject v_term = (SubLObject)partitions.NIL;
                    SubLObject value = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            v_term = Hashtables.getEntryKey(cdohash_entry);
                            value = Hashtables.getEntryValue(cdohash_entry);
                            mark_partition_object(v_term);
                            if (partitions.NIL != constant_handles.constant_p(v_term)) {
                                mark_partition_bookkeeping_terms(v_term);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$7, thread);
            }
        }
        finally {
            partitions.$partition_scope_completely_specifiedP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 16646L)
    public static SubLObject mark_partition_bookkeeping_terms(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(constant, partitions.$partition_argument_hash$.getDynamicValue(thread), constant);
        mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant(constant);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 17010L)
    public static SubLObject mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant(final SubLObject constant) {
        SubLObject cdolist_list_var;
        final SubLObject terms_to_mark = cdolist_list_var = bookkeeping_store.indexed_terms_mentioned_in_bookkeeping_assertions_of_term(constant);
        SubLObject v_term = (SubLObject)partitions.NIL;
        v_term = cdolist_list_var.first();
        while (partitions.NIL != cdolist_list_var) {
            mark_partition_object(v_term);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 17286L)
    public static SubLObject mark_partition_object(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, partitions.$mark_partition_object_method_table$.getGlobalValue());
        if (partitions.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 17441L)
    public static SubLObject mark_partition_object_cons_method(final SubLObject v_object) {
        mark_partition_object(v_object.first());
        mark_partition_object(v_object.rest());
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 17586L)
    public static SubLObject mark_partition_object_constant_method(final SubLObject v_object) {
        return mark_partition_object_constant(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 17693L)
    public static SubLObject mark_partition_object_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != constant_handles.valid_constantP(constant, (SubLObject)partitions.UNPROVIDED) && partitions.NIL == Hashtables.gethash_without_values(constant, partitions.$partition_constant_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            Hashtables.sethash(constant, partitions.$partition_constant_hash$.getDynamicValue(thread), constant);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 18006L)
    public static SubLObject mark_partition_object_nart_method(final SubLObject v_object) {
        return mark_partition_object_nart(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 18105L)
    public static SubLObject mark_partition_object_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != nart_handles.valid_nartP(nart, (SubLObject)partitions.UNPROVIDED) && partitions.NIL == Hashtables.gethash_without_values(nart, partitions.$partition_nart_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            Hashtables.sethash(nart, partitions.$partition_nart_hash$.getDynamicValue(thread), nart);
            final SubLObject level = function_terms.term_functional_complexity(nart);
            if (level.numG(partitions.$partition_max_nart_complexity$.getDynamicValue(thread))) {
                partitions.$partition_max_nart_complexity$.setDynamicValue(level, thread);
            }
            final SubLObject assertion = function_terms.term_of_unit_assertion(nart);
            if (partitions.NIL != assertion_handles.assertion_p(assertion)) {
                mark_partition_object(assertion);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 18752L)
    public static SubLObject mark_partition_object_assertion_method(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != assertion_handles.valid_assertionP(v_object, (SubLObject)partitions.UNPROVIDED) && partitions.NIL == Hashtables.gethash_without_values(v_object, partitions.$partition_assertion_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED) && partitions.NIL == Hashtables.gethash_without_values(v_object, partitions.$partition_meta_assertion_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            final SubLObject order = kb_utilities.term_order(v_object);
            if (order.numG(partitions.$partition_max_term_order$.getDynamicValue(thread))) {
                partitions.$partition_max_term_order$.setDynamicValue(order, thread);
            }
            if (order.numE((SubLObject)partitions.ONE_INTEGER)) {
                Hashtables.sethash(v_object, partitions.$partition_assertion_hash$.getDynamicValue(thread), v_object);
            }
            else {
                Hashtables.sethash(v_object, partitions.$partition_meta_assertion_hash$.getDynamicValue(thread), v_object);
            }
            if (partitions.NIL == partition_scope_completely_specifiedP()) {
                mark_partition_object(assertions_high.assertion_cnf(v_object));
                mark_partition_object(assertions_high.assertion_mt(v_object));
            }
            mark_partition_assertion_beliefs(v_object);
            if (partitions.NIL == partition_scope_completely_specifiedP()) {
                SubLObject cdolist_list_var = assertions_high.assertion_arguments(v_object);
                SubLObject argument = (SubLObject)partitions.NIL;
                argument = cdolist_list_var.first();
                while (partitions.NIL != cdolist_list_var) {
                    if (partitions.NIL != deduction_handles.deduction_p(argument)) {
                        mark_partition_assertion_deduction(argument);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    argument = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 19915L)
    public static SubLObject mark_partition_object_deduction_method(final SubLObject v_object) {
        return mark_partition_object_deduction(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 20024L)
    public static SubLObject mark_partition_object_deduction(final SubLObject deduction) {
        return mark_partition_assertion_deduction(deduction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 20141L)
    public static SubLObject mark_partition_object_kb_hl_support_method(final SubLObject v_object) {
        return mark_partition_object_kb_hl_support(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 20258L)
    public static SubLObject mark_partition_object_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, (SubLObject)partitions.UNPROVIDED) && partitions.NIL == Hashtables.gethash_without_values(kb_hl_support, partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            Hashtables.sethash(kb_hl_support, partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread), kb_hl_support);
            note_partition_kb_hl_support_order(kb_hl_support);
            if (partitions.NIL == partition_scope_completely_specifiedP()) {
                mark_partition_object(kb_hl_supports_high.kb_hl_support_sentence(kb_hl_support));
                mark_partition_object(kb_hl_supports_high.kb_hl_support_mt(kb_hl_support));
                SubLObject cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
                SubLObject support = (SubLObject)partitions.NIL;
                support = cdolist_list_var.first();
                while (partitions.NIL != cdolist_list_var) {
                    mark_partition_object(support);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 20892L)
    public static SubLObject mark_partition_assertion_beliefs(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL == Hashtables.gethash_without_values(assertion, partitions.$partition_argument_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED) && partitions.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)partitions.$sym30$BELIEF_P), assertions_high.assertion_arguments(assertion), (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED)) {
            Hashtables.sethash(assertion, partitions.$partition_argument_hash$.getDynamicValue(thread), assertion);
            if (partitions.NIL == partition_scope_completely_specifiedP()) {
                mark_partition_object(assertions_high.asserted_by(assertion));
                mark_partition_object(assertions_high.asserted_why(assertion));
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 21412L)
    public static SubLObject mark_partition_assertion_deduction(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != deduction_handles.valid_deduction(deduction, (SubLObject)partitions.UNPROVIDED) && partitions.NIL == Hashtables.gethash_without_values(deduction, partitions.$partition_argument_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            Hashtables.sethash(deduction, partitions.$partition_argument_hash$.getDynamicValue(thread), deduction);
            if (partitions.NIL == partition_scope_completely_specifiedP()) {
                mark_partition_object(deductions_high.deduction_supported_object(deduction));
                SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
                SubLObject support = (SubLObject)partitions.NIL;
                support = cdolist_list_var.first();
                while (partitions.NIL != cdolist_list_var) {
                    mark_partition_object(support);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 21894L)
    public static SubLObject note_partition_kb_hl_support_order(final SubLObject kb_hl_support) {
        return list_utilities.sublisp_boolean(partition_kb_hl_support_order(kb_hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 22027L)
    public static SubLObject partition_kb_hl_support_order(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject order = dictionary.dictionary_lookup(partitions.$partition_kb_hl_support_orders$.getDynamicValue(thread), kb_hl_support, (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == order) {
            order = (SubLObject)partitions.ONE_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject justification = cdolist_list_var = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
            SubLObject support = (SubLObject)partitions.NIL;
            support = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                if (partitions.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
                    final SubLObject sub_order = partition_kb_hl_support_order(support);
                    if (order.numLE(sub_order)) {
                        order = Numbers.add((SubLObject)partitions.ONE_INTEGER, sub_order);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
            dictionary.dictionary_enter(partitions.$partition_kb_hl_support_orders$.getDynamicValue(thread), kb_hl_support, order);
            if (order.numG(partitions.$partition_max_kb_hl_support_order$.getDynamicValue(thread))) {
                partitions.$partition_max_kb_hl_support_order$.setDynamicValue(order, thread);
            }
        }
        return order;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 22705L)
    public static SubLObject display_partition_content() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str31$_______S_constants, Hashtables.hash_table_count(partitions.$partition_constant_hash$.getDynamicValue(thread)));
        SubLObject cdohash_table = partitions.$partition_constant_hash$.getDynamicValue(thread);
        SubLObject key = (SubLObject)partitions.NIL;
        SubLObject value = (SubLObject)partitions.NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str32$___A_S, (SubLObject)((partitions.NIL != partition_scope_term_p(key)) ? partitions.$str33$___ : partitions.$str34$___), key);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str35$______Max_NART_level____S, partitions.$partition_max_nart_complexity$.getDynamicValue(thread));
        if (partitions.$partition_max_nart_complexity$.getDynamicValue(thread).numG((SubLObject)partitions.ZERO_INTEGER)) {
            SubLObject index;
            SubLObject nart_level;
            SubLObject cdohash_table2;
            SubLObject key2;
            SubLObject value2;
            Iterator cdohash_iterator2;
            Map.Entry cdohash_entry2;
            for (index = (SubLObject)partitions.NIL, index = (SubLObject)partitions.ZERO_INTEGER; index.numL(partitions.$partition_max_nart_complexity$.getDynamicValue(thread)); index = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER)) {
                nart_level = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER);
                PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str36$______level__S_NARTs, nart_level);
                cdohash_table2 = partitions.$partition_nart_hash$.getDynamicValue(thread);
                key2 = (SubLObject)partitions.NIL;
                value2 = (SubLObject)partitions.NIL;
                cdohash_iterator2 = Hashtables.getEntrySetIterator(cdohash_table2);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                        cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                        key2 = Hashtables.getEntryKey(cdohash_entry2);
                        value2 = Hashtables.getEntryValue(cdohash_entry2);
                        if (function_terms.term_functional_complexity(key2).numE(nart_level)) {
                            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str32$___A_S, (SubLObject)((partitions.NIL != partition_scope_term_p(key2)) ? partitions.$str33$___ : partitions.$str34$___), key2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                }
            }
        }
        PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str37$______Max_term_order___S, partitions.$partition_max_term_order$.getDynamicValue(thread));
        if (partitions.$partition_max_term_order$.getDynamicValue(thread).numG((SubLObject)partitions.ZERO_INTEGER)) {
            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str38$_______S_assertions, Hashtables.hash_table_count(partitions.$partition_assertion_hash$.getDynamicValue(thread)));
            cdohash_table = partitions.$partition_assertion_hash$.getDynamicValue(thread);
            key = (SubLObject)partitions.NIL;
            value = (SubLObject)partitions.NIL;
            cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key = Hashtables.getEntryKey(cdohash_entry);
                    value = Hashtables.getEntryValue(cdohash_entry);
                    PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str32$___A_S, (SubLObject)((partitions.NIL != partition_scope_term_p(key)) ? partitions.$str33$___ : partitions.$str34$___), key);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            if (partitions.$partition_max_term_order$.getDynamicValue(thread).numG((SubLObject)partitions.ONE_INTEGER)) {
                PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str39$_______S_meta_assertions, Hashtables.hash_table_count(partitions.$partition_meta_assertion_hash$.getDynamicValue(thread)));
                SubLObject cdotimes_end_var;
                SubLObject order;
                SubLObject meta_order;
                SubLObject cdohash_table3;
                SubLObject key3;
                SubLObject value3;
                Iterator cdohash_iterator3;
                Map.Entry cdohash_entry3;
                for (cdotimes_end_var = Numbers.subtract(partitions.$partition_max_term_order$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), order = (SubLObject)partitions.NIL, order = (SubLObject)partitions.ZERO_INTEGER; order.numL(cdotimes_end_var); order = Numbers.add(order, (SubLObject)partitions.ONE_INTEGER)) {
                    meta_order = Numbers.add(order, (SubLObject)partitions.TWO_INTEGER);
                    PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str40$______order__S_meta_assertions, meta_order);
                    cdohash_table3 = partitions.$partition_meta_assertion_hash$.getDynamicValue(thread);
                    key3 = (SubLObject)partitions.NIL;
                    value3 = (SubLObject)partitions.NIL;
                    cdohash_iterator3 = Hashtables.getEntrySetIterator(cdohash_table3);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator3)) {
                            cdohash_entry3 = Hashtables.iteratorNextEntry(cdohash_iterator3);
                            key3 = Hashtables.getEntryKey(cdohash_entry3);
                            value3 = Hashtables.getEntryValue(cdohash_entry3);
                            if (kb_utilities.term_order(key3).numE(meta_order)) {
                                PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str32$___A_S, (SubLObject)((partitions.NIL != partition_scope_term_p(key3)) ? partitions.$str33$___ : partitions.$str34$___), key3);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator3);
                    }
                }
            }
        }
        PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str41$_______S_arguments, Hashtables.hash_table_count(partitions.$partition_argument_hash$.getDynamicValue(thread)));
        cdohash_table = partitions.$partition_argument_hash$.getDynamicValue(thread);
        key = (SubLObject)partitions.NIL;
        SubLObject v_object = (SubLObject)partitions.NIL;
        cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                v_object = Hashtables.getEntryValue(cdohash_entry);
                streams_high.terpri((SubLObject)partitions.UNPROVIDED);
                if (partitions.NIL != deduction_handles.deduction_p(v_object)) {
                    PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str42$Deduction______S, deductions_high.deduction_supported_object(v_object));
                }
                else if (partitions.NIL != assertion_handles.assertion_p(v_object)) {
                    PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str43$Beliefs_for____S, v_object);
                }
                else {
                    PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str44$Unknown________S, v_object);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str45$______Max_KB_HL_support_level____, partitions.$partition_max_kb_hl_support_order$.getDynamicValue(thread));
        if (partitions.$partition_max_kb_hl_support_order$.getDynamicValue(thread).numG((SubLObject)partitions.ZERO_INTEGER)) {
            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str46$_______S_KB_HL_supports, Hashtables.hash_table_count(partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread)));
            SubLObject index;
            SubLObject cdohash_table2;
            SubLObject key2;
            SubLObject value2;
            Iterator cdohash_iterator2;
            Map.Entry cdohash_entry2;
            SubLObject kb_hl_support_order;
            for (index = (SubLObject)partitions.NIL, index = (SubLObject)partitions.ZERO_INTEGER; index.numL(partitions.$partition_max_kb_hl_support_order$.getDynamicValue(thread)); index = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER)) {
                kb_hl_support_order = Numbers.add((SubLObject)partitions.ONE_INTEGER, index);
                PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str47$______level__S_KB_HL_supports, kb_hl_support_order);
                cdohash_table2 = partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread);
                key2 = (SubLObject)partitions.NIL;
                value2 = (SubLObject)partitions.NIL;
                cdohash_iterator2 = Hashtables.getEntrySetIterator(cdohash_table2);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                        cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                        key2 = Hashtables.getEntryKey(cdohash_entry2);
                        value2 = Hashtables.getEntryValue(cdohash_entry2);
                        if (partition_kb_hl_support_order(key2).numE(kb_hl_support_order)) {
                            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str32$___A_S, (SubLObject)((partitions.NIL != partition_scope_term_p(key2)) ? partitions.$str33$___ : partitions.$str34$___), key2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                }
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 25389L)
    public static SubLObject remove_partition(final SubLObject partition) {
        if (partitions.NIL != partition) {
            scope_partition(partition);
            return remove_scoped_partition();
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 25765L)
    public static SubLObject remove_scoped_partition() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = Errors.$ignore_warnsP$.currentBinding(thread);
        try {
            control_vars.$within_assert$.bind((SubLObject)partitions.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)partitions.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)partitions.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)partitions.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)partitions.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)partitions.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)partitions.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)partitions.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)partitions.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)partitions.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)partitions.T, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)partitions.T, thread);
            Errors.$ignore_warnsP$.bind((SubLObject)partitions.T, thread);
            SubLObject table_var = partitions.$partition_scope_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$10 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$11 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_3_$12 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_4_$13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_5_$14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_6_$15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_7_$16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)partitions.$str48$removing_partition_assertions, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject key = (SubLObject)partitions.NIL;
                    SubLObject v_term = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            key = Hashtables.getEntryKey(cdohash_entry);
                            v_term = Hashtables.getEntryValue(cdohash_entry);
                            if (partitions.NIL != assertions_high.valid_assertion(v_term, (SubLObject)partitions.UNPROVIDED)) {
                                tms.tms_remove_assertion(v_term);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_7_$16, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_6_$15, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_5_$14, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_4_$13, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_3_$12, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_2_$11, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$10, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$9, thread);
            }
            table_var = partitions.$partition_scope_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$11 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$11 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$12 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_3_$13 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_4_$14 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_5_$15 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_6_$16 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_7_$17 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)partitions.$str49$removing_partition_NARTs, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject key = (SubLObject)partitions.NIL;
                    SubLObject v_term = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            key = Hashtables.getEntryKey(cdohash_entry);
                            v_term = Hashtables.getEntryValue(cdohash_entry);
                            if (partitions.NIL != nart_handles.valid_nartP(v_term, (SubLObject)partitions.UNPROVIDED)) {
                                cyc_kernel.cyc_kill(v_term);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_7_$17, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_6_$16, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_5_$15, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_4_$14, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_3_$13, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_2_$12, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$11, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$11, thread);
            }
            table_var = partitions.$partition_scope_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$13 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$12 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2_$13 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_3_$14 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_4_$15 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_5_$16 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_6_$17 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_7_$18 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)partitions.$str50$removing_partition_constants, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject key = (SubLObject)partitions.NIL;
                    SubLObject v_term = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            key = Hashtables.getEntryKey(cdohash_entry);
                            v_term = Hashtables.getEntryValue(cdohash_entry);
                            if (partitions.NIL != constant_handles.valid_constantP(v_term, (SubLObject)partitions.UNPROVIDED)) {
                                cyc_kernel.cyc_kill(v_term);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_7_$18, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_6_$17, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_5_$16, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_4_$15, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_3_$14, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_2_$13, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$12, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$13, thread);
            }
        }
        finally {
            Errors.$ignore_warnsP$.rebind(_prev_bind_13, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_12, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 27703L)
    public static SubLObject make_archive_filename(final SubLObject archive_name) {
        return file_utilities.cyc_home_filename((SubLObject)partitions.$list51, archive_name, (SubLObject)partitions.$str52$lisp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 27819L)
    public static SubLObject archive_assertion_if_local(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert partitions.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (partitions.NIL != assertions_high.asserted_assertionP(assertion)) {
            final SubLObject formula = fi.assertion_fi_formula(assertion, (SubLObject)partitions.UNPROVIDED);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            final SubLObject dir = assertions_high.assertion_direction(assertion);
            PrintLow.format(partitions.$current_archive_stream$.getDynamicValue(thread), (SubLObject)partitions.$str54$_____FI_ASSERT___S__S__S__S_, new SubLObject[] { formula, mt, strength, dir });
        }
        return (SubLObject)partitions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 28329L)
    public static SubLObject archive_term(final SubLObject v_term, SubLObject removeP) {
        if (removeP == partitions.UNPROVIDED) {
            removeP = (SubLObject)partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert partitions.NIL != forts.fort_p(v_term) : v_term;
        if (partitions.NIL != forts.valid_fortP(v_term)) {
            if (partitions.NIL == nart_handles.nart_p(v_term)) {
                PrintLow.format(partitions.$current_archive_stream$.getDynamicValue(thread), (SubLObject)partitions.$str55$_____FI_CREATE__a_, constants_high.constant_name(v_term));
            }
            kb_mapping.map_term(Symbols.symbol_function((SubLObject)partitions.$sym56$ARCHIVE_ASSERTION_IF_LOCAL), v_term);
            if (partitions.NIL != removeP) {
                remove_partition_term(v_term);
            }
        }
        return (SubLObject)partitions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 28707L)
    public static SubLObject archive_ontology(final SubLObject ontology_start, SubLObject removeP) {
        if (removeP == partitions.UNPROVIDED) {
            removeP = (SubLObject)partitions.NIL;
        }
        assert partitions.NIL != forts.fort_p(ontology_start) : ontology_start;
        final SubLObject v_instances = isa.all_instances_in_all_mts(ontology_start);
        final SubLObject specs = genls.all_specs_in_all_mts(ontology_start, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        SubLObject cdolist_list_var = v_instances;
        SubLObject instance = (SubLObject)partitions.NIL;
        instance = cdolist_list_var.first();
        while (partitions.NIL != cdolist_list_var) {
            archive_term(instance, removeP);
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        }
        cdolist_list_var = specs;
        SubLObject spec = (SubLObject)partitions.NIL;
        spec = cdolist_list_var.first();
        while (partitions.NIL != cdolist_list_var) {
            if (!spec.equal(ontology_start)) {
                archive_term(spec, removeP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        return archive_term(ontology_start, removeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 29275L)
    public static SubLObject archive_partition(final SubLObject partition, final SubLObject archive_name, SubLObject removeP) {
        if (removeP == partitions.UNPROVIDED) {
            removeP = (SubLObject)partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject archive_file = make_archive_filename(archive_name);
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)partitions.NIL, thread);
            control_vars.$use_transcriptP$.bind((SubLObject)partitions.NIL, thread);
            SubLObject stream = (SubLObject)partitions.NIL;
            try {
                stream = compatibility.open_text(archive_file, (SubLObject)partitions.$kw57$APPEND);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)partitions.$str58$Unable_to_open__S, archive_file);
                }
                final SubLObject _prev_bind_0_$36 = partitions.$current_archive_stream$.currentBinding(thread);
                try {
                    partitions.$current_archive_stream$.bind(stream, thread);
                    PrintLow.format(partitions.$current_archive_stream$.getDynamicValue(thread), (SubLObject)partitions.$str59$______Archive_saved_at__s____, numeric_date_utilities.timestring((SubLObject)partitions.UNPROVIDED));
                    SubLObject cdolist_list_var = partition;
                    SubLObject partition_item = (SubLObject)partitions.NIL;
                    partition_item = cdolist_list_var.first();
                    while (partitions.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = partition_item;
                        SubLObject method = (SubLObject)partitions.NIL;
                        SubLObject term_spec = (SubLObject)partitions.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)partitions.$list0);
                        method = current.first();
                        current = (term_spec = current.rest());
                        assert partitions.NIL != Types.keywordp(method) : method;
                        assert partitions.NIL != Types.stringp(term_spec) : term_spec;
                        final SubLObject item = fi.fi_find(term_spec);
                        if (partitions.NIL != constant_handles.valid_constantP(item, (SubLObject)partitions.UNPROVIDED)) {
                            final SubLObject pcase_var = method;
                            if (pcase_var.eql((SubLObject)partitions.$kw2$ONTOLOGY)) {
                                archive_ontology(item, removeP);
                            }
                            else {
                                archive_term(item, removeP);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        partition_item = cdolist_list_var.first();
                    }
                }
                finally {
                    partitions.$current_archive_stream$.rebind(_prev_bind_0_$36, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)partitions.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        }
        finally {
            control_vars.$use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return archive_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 30297L)
    public static SubLObject remove_partition_term(final SubLObject v_term) {
        assert partitions.NIL != forts.fort_p(v_term) : v_term;
        if (partitions.NIL != forts.valid_fortP(v_term)) {
            fi.fi_kill(v_term);
            return (SubLObject)partitions.T;
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 30500L)
    public static SubLObject save_partition(final SubLObject filename, final SubLObject partition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert partitions.NIL != Types.stringp(filename) : filename;
        SubLObject result = (SubLObject)partitions.NIL;
        SubLObject stream = (SubLObject)partitions.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)partitions.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)partitions.$kw61$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)partitions.$str58$Unable_to_open__S, filename);
            }
            final SubLObject stream_$38 = stream;
            if (partitions.NIL != partition) {
                save_partition_to_stream(stream_$38, partition);
            }
            result = filename;
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)partitions.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 32729L)
    public static SubLObject save_partition_to_stream(final SubLObject stream, final SubLObject partition) {
        assert partitions.NIL != cfasl.cfasl_encodable_stream_p(stream) : stream;
        mark_partition_content(partition);
        dump_partition_to_stream(stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 32925L)
    public static SubLObject excise_partition_to_stream(final SubLObject stream, final SubLObject partition) {
        assert partitions.NIL != cfasl.cfasl_encodable_stream_p(stream) : stream;
        final SubLObject ret_val = save_partition_to_stream(stream, partition);
        remove_scoped_partition();
        return ret_val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 33262L)
    public static SubLObject save_partition_as_hl_transcript(final SubLObject filename, final SubLObject partition) {
        final SubLObject modification_spec = partition_spec_to_modification_spec(partition);
        final SubLObject content_summary = hl_transcripts.save_hl_transcript_from_modification_spec(filename, modification_spec);
        return Values.values(filename, content_summary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 33804L)
    public static SubLObject partition_spec_to_modification_spec(final SubLObject partition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mark_partition_content(partition);
        SubLObject partition_constants = hash_table_utilities.hash_table_keys(partitions.$partition_constant_hash$.getDynamicValue(thread));
        SubLObject partition_narts = hash_table_utilities.hash_table_keys(partitions.$partition_nart_hash$.getDynamicValue(thread));
        SubLObject simple_assertions = hash_table_utilities.hash_table_keys(partitions.$partition_assertion_hash$.getDynamicValue(thread));
        SubLObject meta_assertions = hash_table_utilities.hash_table_keys(partitions.$partition_meta_assertion_hash$.getDynamicValue(thread));
        SubLObject partition_assertions = (SubLObject)partitions.$kw63$UNINITIALIZED;
        SubLObject partition_deductions = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)partitions.$sym64$DEDUCTION_P), hash_table_utilities.hash_table_keys(partitions.$partition_argument_hash$.getDynamicValue(thread)), (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        SubLObject partition_kb_hl_supports = hash_table_utilities.hash_table_keys(partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread));
        partition_constants = Sort.sort(partition_constants, Symbols.symbol_function((SubLObject)partitions.$sym65$_), Symbols.symbol_function((SubLObject)partitions.$sym66$CONSTANT_INTERNAL_ID));
        partition_narts = Sort.sort(partition_narts, Symbols.symbol_function((SubLObject)partitions.$sym65$_), Symbols.symbol_function((SubLObject)partitions.$sym67$NART_ID));
        partition_narts = Sort.stable_sort(partition_narts, Symbols.symbol_function((SubLObject)partitions.$sym65$_), Symbols.symbol_function((SubLObject)partitions.$sym68$TERM_FUNCTIONAL_COMPLEXITY));
        simple_assertions = assertion_utilities.sort_assertions(simple_assertions);
        meta_assertions = assertion_utilities.sort_assertions(meta_assertions);
        meta_assertions = Sort.stable_sort(meta_assertions, Symbols.symbol_function((SubLObject)partitions.$sym65$_), Symbols.symbol_function((SubLObject)partitions.$sym69$TERM_ORDER));
        partition_assertions = ConsesLow.append(simple_assertions, meta_assertions);
        partition_deductions = Sort.sort(partition_deductions, Symbols.symbol_function((SubLObject)partitions.$sym65$_), Symbols.symbol_function((SubLObject)partitions.$sym70$DEDUCTION_ID));
        partition_kb_hl_supports = Sort.sort(partition_kb_hl_supports, Symbols.symbol_function((SubLObject)partitions.$sym65$_), Symbols.symbol_function((SubLObject)partitions.$sym71$KB_HL_SUPPORT_ID));
        final SubLObject modification_spec = (SubLObject)ConsesLow.list((SubLObject)partitions.$kw72$NEW_CONSTANTS, partition_constants, (SubLObject)partitions.$kw73$NEW_NARTS, partition_narts, (SubLObject)partitions.$kw74$NEW_ASSERTIONS, partition_assertions, (SubLObject)partitions.$kw75$NEW_DEDUCTIONS, partition_deductions);
        return modification_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 36625L)
    public static SubLObject partition_common_symbols() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ConsesLow.append(dumper.kb_dump_common_symbols(), partitions.$partition_special_objects$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 36803L)
    public static SubLObject dump_partition_to_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_info(stream);
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)partitions.NIL, thread);
            cfasl.cfasl_set_common_symbols(partition_common_symbols());
            dump_partition_constant_shells(stream);
            dump_partition_nart_shells(stream);
            dump_partition_assertions(stream);
            dump_partition_kb_hl_supports(stream);
            dump_partition_arguments(stream);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 37159L)
    public static SubLObject dump_partition_section_marker(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_output(partitions.$partition_section_marker$.getDynamicValue(thread), stream);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 37281L)
    public static SubLObject dump_partition_info(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = system_info.cyc_revision_numbers();
        SubLObject system_number = (SubLObject)partitions.NIL;
        SubLObject patch_number = (SubLObject)partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)partitions.$list80);
        system_number = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)partitions.$list80);
        patch_number = current.first();
        final SubLObject branch_specifics;
        current = (branch_specifics = current.rest());
        cfasl.cfasl_output(misc_utilities.copyright_notice(), stream);
        cfasl.cfasl_output(partitions.$dump_partition_format$.getDynamicValue(thread), stream);
        cfasl.cfasl_output(system_number, stream);
        cfasl.cfasl_output(patch_number, stream);
        cfasl.cfasl_output(numeric_date_utilities.get_universal_date((SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED), stream);
        dumper.dump_special_objects_internal(partition_common_symbols(), stream);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 37761L)
    public static SubLObject large_partitionP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numGE(Numbers.divide(Hashtables.hash_table_count(partitions.$partition_constant_hash$.getDynamicValue(thread)), constant_handles.constant_count()), (SubLObject)partitions.$float81$0_1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 37981L)
    public static SubLObject dump_partition_constant_shells(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = Hashtables.hash_table_count(partitions.$partition_constant_hash$.getDynamicValue(thread));
        cfasl.cfasl_output(total, stream);
        if (partitions.NIL != large_partitionP()) {
            final SubLObject idx = constant_handles.do_constants_table();
            final SubLObject mess = (SubLObject)partitions.$str82$_large__partition_constant_shells;
            final SubLObject total_$39 = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)partitions.ZERO_INTEGER;
            assert partitions.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$40 = idx;
                    if (partitions.NIL == id_index.id_index_objects_empty_p(idx_$40, (SubLObject)partitions.$kw83$SKIP)) {
                        final SubLObject idx_$41 = idx_$40;
                        if (partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$41, (SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$41);
                            final SubLObject backwardP_var = (SubLObject)partitions.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)partitions.NIL, v_iteration = (SubLObject)partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)partitions.ONE_INTEGER)) {
                                id = ((partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)partitions.ONE_INTEGER) : v_iteration);
                                constant = Vectors.aref(vector_var, id);
                                if (partitions.NIL == id_index.id_index_tombstone_p(constant) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                                    if (partitions.NIL != id_index.id_index_tombstone_p(constant)) {
                                        constant = (SubLObject)partitions.$kw83$SKIP;
                                    }
                                    if (partitions.NIL != Hashtables.gethash_without_values(constant, partitions.$partition_constant_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_constant_shell(constant, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$39);
                                }
                            }
                        }
                        final SubLObject idx_$42 = idx_$40;
                        if (partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$42) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$42);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$42);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$42);
                            final SubLObject v_default = (SubLObject)((partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) ? partitions.NIL : partitions.$kw83$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP) || partitions.NIL == id_index.id_index_tombstone_p(constant2)) {
                                    if (partitions.NIL != Hashtables.gethash_without_values(constant2, partitions.$partition_constant_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_constant_shell(constant2, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$39);
                                }
                                id2 = Numbers.add(id2, (SubLObject)partitions.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject table_var = partitions.$partition_constant_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)partitions.$str84$partition_constant_shells, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject constant3 = (SubLObject)partitions.NIL;
                    SubLObject value = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            constant3 = Hashtables.getEntryKey(cdohash_entry);
                            value = Hashtables.getEntryValue(cdohash_entry);
                            dump_partition_constant_shell(constant3, stream);
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 38570L)
    public static SubLObject dump_partition_constant_shell(final SubLObject constant, final SubLObject stream) {
        cfasl.cfasl_output(constants_high.constant_internal_id(constant), stream);
        cfasl.cfasl_output(constants_high.constant_name(constant), stream);
        cfasl.cfasl_output(constants_high.constant_guid(constant), stream);
        cfasl.cfasl_output(partition_scope_term_p(constant), stream);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 38907L)
    public static SubLObject dump_partition_nart_shells(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_output(partitions.$partition_max_nart_complexity$.getDynamicValue(thread), stream);
        SubLObject index;
        SubLObject nart_level;
        for (index = (SubLObject)partitions.NIL, index = (SubLObject)partitions.ZERO_INTEGER; index.numL(partitions.$partition_max_nart_complexity$.getDynamicValue(thread)); index = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER)) {
            nart_level = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER);
            dump_partition_nart_shells_at_level(nart_level, stream);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 39198L)
    public static SubLObject dump_partition_nart_shells_at_level(final SubLObject nart_level, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = partition_nart_level_count(nart_level);
        cfasl.cfasl_output(total, stream);
        final SubLObject message = Sequences.cconcatenate((SubLObject)partitions.$str85$partition_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(nart_level), partitions.$str86$_NART_shells });
        if (partitions.NIL != large_partitionP()) {
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = Sequences.cconcatenate((SubLObject)partitions.$str87$_large__, format_nil.format_nil_a_no_copy(message));
            final SubLObject total_$45 = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)partitions.ZERO_INTEGER;
            assert partitions.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$46 = idx;
                    if (partitions.NIL == id_index.id_index_objects_empty_p(idx_$46, (SubLObject)partitions.$kw83$SKIP)) {
                        final SubLObject idx_$47 = idx_$46;
                        if (partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$47, (SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$47);
                            final SubLObject backwardP_var = (SubLObject)partitions.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)partitions.NIL, v_iteration = (SubLObject)partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)partitions.ONE_INTEGER)) {
                                id = ((partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)partitions.ONE_INTEGER) : v_iteration);
                                nart = Vectors.aref(vector_var, id);
                                if (partitions.NIL == id_index.id_index_tombstone_p(nart) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                                    if (partitions.NIL != id_index.id_index_tombstone_p(nart)) {
                                        nart = (SubLObject)partitions.$kw83$SKIP;
                                    }
                                    if (partitions.NIL != Hashtables.gethash_without_values(nart, partitions.$partition_nart_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED) && function_terms.term_functional_complexity(nart).numE(nart_level)) {
                                        dump_partition_nart_shell(nart, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$45);
                                }
                            }
                        }
                        final SubLObject idx_$48 = idx_$46;
                        if (partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$48) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$48);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$48);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$48);
                            final SubLObject v_default = (SubLObject)((partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) ? partitions.NIL : partitions.$kw83$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP) || partitions.NIL == id_index.id_index_tombstone_p(nart2)) {
                                    if (partitions.NIL != Hashtables.gethash_without_values(nart2, partitions.$partition_nart_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED) && function_terms.term_functional_complexity(nart2).numE(nart_level)) {
                                        dump_partition_nart_shell(nart2, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$45);
                                }
                                id2 = Numbers.add(id2, (SubLObject)partitions.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject table_var = partitions.$partition_nart_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind(message, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject nart3 = (SubLObject)partitions.NIL;
                    SubLObject value = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            nart3 = Hashtables.getEntryKey(cdohash_entry);
                            value = Hashtables.getEntryValue(cdohash_entry);
                            if (function_terms.term_functional_complexity(nart3).numE(nart_level)) {
                                dump_partition_nart_shell(nart3, stream);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 39955L)
    public static SubLObject partition_nart_level_count(final SubLObject nart_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)partitions.ZERO_INTEGER;
        final SubLObject cdohash_table = partitions.$partition_nart_hash$.getDynamicValue(thread);
        SubLObject key = (SubLObject)partitions.NIL;
        SubLObject nart = (SubLObject)partitions.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                nart = Hashtables.getEntryValue(cdohash_entry);
                if (function_terms.term_functional_complexity(nart).numE(nart_level)) {
                    total = Numbers.add(total, (SubLObject)partitions.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 40193L)
    public static SubLObject dump_partition_nart_shell(final SubLObject nart, final SubLObject stream) {
        cfasl.cfasl_output(nart_handles.nart_id(nart), stream);
        cfasl.cfasl_output(narts_high.nart_hl_formula(nart), stream);
        cfasl.cfasl_output(partition_scope_term_p(nart), stream);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 40403L)
    public static SubLObject dump_partition_assertions(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_output(partitions.$partition_max_term_order$.getDynamicValue(thread), stream);
        SubLObject term_order;
        SubLObject meta_order;
        for (term_order = (SubLObject)partitions.NIL, term_order = (SubLObject)partitions.ZERO_INTEGER; term_order.numL(partitions.$partition_max_term_order$.getDynamicValue(thread)); term_order = Numbers.add(term_order, (SubLObject)partitions.ONE_INTEGER)) {
            meta_order = Numbers.add(term_order, (SubLObject)partitions.ONE_INTEGER);
            if (meta_order.numE((SubLObject)partitions.ONE_INTEGER)) {
                dump_partition_simple_assertions(stream);
            }
            else {
                dump_partition_meta_assertions(meta_order, stream);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 40760L)
    public static SubLObject dump_partition_simple_assertions(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = Hashtables.hash_table_count(partitions.$partition_assertion_hash$.getDynamicValue(thread));
        cfasl.cfasl_output(total, stream);
        if (partitions.NIL != large_partitionP()) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)partitions.$str88$_large__partition_assertions;
            final SubLObject total_$51 = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)partitions.ZERO_INTEGER;
            assert partitions.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$52 = idx;
                    if (partitions.NIL == id_index.id_index_objects_empty_p(idx_$52, (SubLObject)partitions.$kw83$SKIP)) {
                        final SubLObject idx_$53 = idx_$52;
                        if (partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$53, (SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$53);
                            final SubLObject backwardP_var = (SubLObject)partitions.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)partitions.NIL, v_iteration = (SubLObject)partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)partitions.ONE_INTEGER)) {
                                a_id = ((partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)partitions.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (partitions.NIL == id_index.id_index_tombstone_p(a_handle) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                                    if (partitions.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)partitions.$kw83$SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (partitions.NIL != Hashtables.gethash_without_values(assertion, partitions.$partition_assertion_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_assertion(assertion, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$51);
                                }
                            }
                        }
                        final SubLObject idx_$54 = idx_$52;
                        if (partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$54) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$54);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$54);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$54);
                            final SubLObject v_default = (SubLObject)((partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) ? partitions.NIL : partitions.$kw83$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP) || partitions.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (partitions.NIL != Hashtables.gethash_without_values(assertion2, partitions.$partition_assertion_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_assertion(assertion2, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$51);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)partitions.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject table_var = partitions.$partition_assertion_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)partitions.$str89$partition_assertions, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject assertion3 = (SubLObject)partitions.NIL;
                    SubLObject value = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            assertion3 = Hashtables.getEntryKey(cdohash_entry);
                            value = Hashtables.getEntryValue(cdohash_entry);
                            dump_partition_assertion(assertion3, stream);
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 41340L)
    public static SubLObject dump_partition_meta_assertions(final SubLObject meta_order, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = partition_meta_assertion_order_count(meta_order);
        cfasl.cfasl_output(total, stream);
        final SubLObject message = Sequences.cconcatenate((SubLObject)partitions.$str90$partition_order_, new SubLObject[] { format_nil.format_nil_s_no_copy(meta_order), partitions.$str91$_meta_assertions });
        final SubLObject table_var = partitions.$partition_meta_assertion_hash$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind(message, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject key = (SubLObject)partitions.NIL;
                SubLObject assertion = (SubLObject)partitions.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        assertion = Hashtables.getEntryValue(cdohash_entry);
                        if (kb_utilities.term_order(assertion).numE(meta_order)) {
                            dump_partition_assertion(assertion, stream);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 41970L)
    public static SubLObject partition_meta_assertion_order_count(final SubLObject meta_order) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)partitions.ZERO_INTEGER;
        final SubLObject cdohash_table = partitions.$partition_meta_assertion_hash$.getDynamicValue(thread);
        SubLObject key = (SubLObject)partitions.NIL;
        SubLObject assertion = (SubLObject)partitions.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                assertion = Hashtables.getEntryValue(cdohash_entry);
                if (kb_utilities.term_order(assertion).numE(meta_order)) {
                    total = Numbers.add(total, (SubLObject)partitions.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 42222L)
    public static SubLObject dump_partition_assertion(final SubLObject assertion, final SubLObject stream) {
        cfasl.cfasl_output(assertion_handles.assertion_id(assertion), stream);
        cfasl.cfasl_output(partition_scope_term_p(assertion), stream);
        cfasl.cfasl_output(assertions_high.assertion_cnf(assertion), stream);
        cfasl.cfasl_output(assertions_high.assertion_mt(assertion), stream);
        cfasl.cfasl_output(assertions_high.assertion_direction(assertion), stream);
        cfasl.cfasl_output(assertions_high.assertion_variable_names(assertion), stream);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 42620L)
    public static SubLObject dump_partition_kb_hl_supports(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_output(partitions.$partition_max_kb_hl_support_order$.getDynamicValue(thread), stream);
        SubLObject index;
        SubLObject kb_hl_support_level;
        for (index = (SubLObject)partitions.NIL, index = (SubLObject)partitions.ZERO_INTEGER; index.numL(partitions.$partition_max_kb_hl_support_order$.getDynamicValue(thread)); index = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER)) {
            kb_hl_support_level = Numbers.add((SubLObject)partitions.ONE_INTEGER, index);
            dump_partition_kb_hl_supports_at_level(kb_hl_support_level, stream);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 42946L)
    public static SubLObject dump_partition_kb_hl_supports_at_level(final SubLObject level, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = partition_kb_hl_support_level_count(level);
        cfasl.cfasl_output(total, stream);
        final SubLObject message = Sequences.cconcatenate((SubLObject)partitions.$str85$partition_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(level), partitions.$str92$_KB_HL_supports });
        if (partitions.NIL != large_partitionP()) {
            final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
            final SubLObject mess = Sequences.cconcatenate((SubLObject)partitions.$str87$_large__, format_nil.format_nil_a_no_copy(message));
            final SubLObject total_$58 = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)partitions.ZERO_INTEGER;
            assert partitions.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$59 = idx;
                    if (partitions.NIL == id_index.id_index_objects_empty_p(idx_$59, (SubLObject)partitions.$kw83$SKIP)) {
                        final SubLObject idx_$60 = idx_$59;
                        if (partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$60, (SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$60);
                            final SubLObject backwardP_var = (SubLObject)partitions.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject s_id;
                            SubLObject s_handle;
                            SubLObject kb_hl_support;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)partitions.NIL, v_iteration = (SubLObject)partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)partitions.ONE_INTEGER)) {
                                s_id = ((partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)partitions.ONE_INTEGER) : v_iteration);
                                s_handle = Vectors.aref(vector_var, s_id);
                                if (partitions.NIL == id_index.id_index_tombstone_p(s_handle) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                                    if (partitions.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                        s_handle = (SubLObject)partitions.$kw83$SKIP;
                                    }
                                    kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                    if (partitions.NIL != Hashtables.gethash_without_values(kb_hl_support, partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED) && partition_kb_hl_support_order(kb_hl_support).numE(level)) {
                                        dump_partition_kb_hl_support(kb_hl_support, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$58);
                                }
                            }
                        }
                        final SubLObject idx_$61 = idx_$59;
                        if (partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$61) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$61);
                            SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$61);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$61);
                            final SubLObject v_default = (SubLObject)((partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) ? partitions.NIL : partitions.$kw83$SKIP);
                            while (s_id2.numL(end_id)) {
                                final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                                if (partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP) || partitions.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                    final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                    if (partitions.NIL != Hashtables.gethash_without_values(kb_hl_support2, partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED) && partition_kb_hl_support_order(kb_hl_support2).numE(level)) {
                                        dump_partition_kb_hl_support(kb_hl_support2, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$58);
                                }
                                s_id2 = Numbers.add(s_id2, (SubLObject)partitions.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject table_var = partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind(message, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject kb_hl_support3 = (SubLObject)partitions.NIL;
                    SubLObject value = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            kb_hl_support3 = Hashtables.getEntryKey(cdohash_entry);
                            value = Hashtables.getEntryValue(cdohash_entry);
                            if (partition_kb_hl_support_order(kb_hl_support3).numE(level)) {
                                dump_partition_kb_hl_support(kb_hl_support3, stream);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 43815L)
    public static SubLObject partition_kb_hl_support_level_count(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)partitions.ZERO_INTEGER;
        final SubLObject cdohash_table = partitions.$partition_kb_hl_support_hash$.getDynamicValue(thread);
        SubLObject key = (SubLObject)partitions.NIL;
        SubLObject kb_hl_support = (SubLObject)partitions.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                kb_hl_support = Hashtables.getEntryValue(cdohash_entry);
                if (partition_kb_hl_support_order(kb_hl_support).numE(level)) {
                    total = Numbers.add(total, (SubLObject)partitions.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 44082L)
    public static SubLObject dump_partition_kb_hl_support(final SubLObject kb_hl_support, final SubLObject stream) {
        final SubLObject id = kb_hl_support_handles.kb_hl_support_id(kb_hl_support);
        final SubLObject scopeP = partition_scope_term_p(kb_hl_support);
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
        final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
        cfasl.cfasl_output(id, stream);
        cfasl.cfasl_output(scopeP, stream);
        cfasl.cfasl_output(hl_support, stream);
        cfasl.cfasl_output(justification, stream);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 44541L)
    public static SubLObject dump_partition_arguments(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dump_partition_section_marker(stream);
        final SubLObject total = Hashtables.hash_table_count(partitions.$partition_argument_hash$.getDynamicValue(thread));
        cfasl.cfasl_output(total, stream);
        if (partitions.NIL != large_partitionP()) {
            SubLObject idx = assertion_handles.do_assertions_table();
            SubLObject mess = (SubLObject)partitions.$str93$_large__partition_beliefs;
            final SubLObject total_$64 = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)partitions.ZERO_INTEGER;
            assert partitions.NIL != Types.stringp(mess) : mess;
            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$65 = idx;
                    if (partitions.NIL == id_index.id_index_objects_empty_p(idx_$65, (SubLObject)partitions.$kw83$SKIP)) {
                        final SubLObject idx_$66 = idx_$65;
                        if (partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$66, (SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$66);
                            final SubLObject backwardP_var = (SubLObject)partitions.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)partitions.NIL, v_iteration = (SubLObject)partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)partitions.ONE_INTEGER)) {
                                a_id = ((partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)partitions.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (partitions.NIL == id_index.id_index_tombstone_p(a_handle) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                                    if (partitions.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)partitions.$kw83$SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (partitions.NIL != Hashtables.gethash_without_values(assertion, partitions.$partition_argument_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_argument(assertion, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$64);
                                }
                            }
                        }
                        final SubLObject idx_$67 = idx_$65;
                        if (partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$67) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$67);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$67);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$67);
                            final SubLObject v_default = (SubLObject)((partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) ? partitions.NIL : partitions.$kw83$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP) || partitions.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (partitions.NIL != Hashtables.gethash_without_values(assertion2, partitions.$partition_argument_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_argument(assertion2, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$64);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)partitions.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            idx = deduction_handles.do_deductions_table();
            mess = (SubLObject)partitions.$str94$_large__partition_deductions;
            final SubLObject total_$65 = id_index.id_index_count(idx);
            sofar = (SubLObject)partitions.ZERO_INTEGER;
            assert partitions.NIL != Types.stringp(mess) : mess;
            _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$68 = idx;
                    if (partitions.NIL == id_index.id_index_objects_empty_p(idx_$68, (SubLObject)partitions.$kw83$SKIP)) {
                        final SubLObject idx_$69 = idx_$68;
                        if (partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$69, (SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$69);
                            final SubLObject backwardP_var = (SubLObject)partitions.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject deduction;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)partitions.NIL, v_iteration = (SubLObject)partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)partitions.ONE_INTEGER)) {
                                d_id = ((partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)partitions.ONE_INTEGER) : v_iteration);
                                d_handle = Vectors.aref(vector_var, d_id);
                                if (partitions.NIL == id_index.id_index_tombstone_p(d_handle) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                                    if (partitions.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                        d_handle = (SubLObject)partitions.$kw83$SKIP;
                                    }
                                    deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                    if (partitions.NIL != Hashtables.gethash_without_values(deduction, partitions.$partition_argument_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_argument(deduction, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$65);
                                }
                            }
                        }
                        final SubLObject idx_$70 = idx_$68;
                        if (partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$70) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$70);
                            SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$70);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$70);
                            final SubLObject v_default = (SubLObject)((partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) ? partitions.NIL : partitions.$kw83$SKIP);
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                                if (partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP) || partitions.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                    final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    if (partitions.NIL != Hashtables.gethash_without_values(deduction2, partitions.$partition_argument_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_argument(deduction2, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$65);
                                }
                                d_id2 = Numbers.add(d_id2, (SubLObject)partitions.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            idx = constant_handles.do_constants_table();
            mess = (SubLObject)partitions.$str95$_large__partition_bookkeeping_inf;
            final SubLObject total_$66 = id_index.id_index_count(idx);
            sofar = (SubLObject)partitions.ZERO_INTEGER;
            assert partitions.NIL != Types.stringp(mess) : mess;
            _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$71 = idx;
                    if (partitions.NIL == id_index.id_index_objects_empty_p(idx_$71, (SubLObject)partitions.$kw83$SKIP)) {
                        final SubLObject idx_$72 = idx_$71;
                        if (partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$72, (SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$72);
                            final SubLObject backwardP_var = (SubLObject)partitions.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)partitions.NIL, v_iteration = (SubLObject)partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)partitions.ONE_INTEGER)) {
                                id = ((partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)partitions.ONE_INTEGER) : v_iteration);
                                constant = Vectors.aref(vector_var, id);
                                if (partitions.NIL == id_index.id_index_tombstone_p(constant) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                                    if (partitions.NIL != id_index.id_index_tombstone_p(constant)) {
                                        constant = (SubLObject)partitions.$kw83$SKIP;
                                    }
                                    if (partitions.NIL != Hashtables.gethash_without_values(constant, partitions.$partition_argument_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_argument(constant, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$66);
                                }
                            }
                        }
                        final SubLObject idx_$73 = idx_$71;
                        if (partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$73) || partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$73);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$73);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$73);
                            final SubLObject v_default = (SubLObject)((partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP)) ? partitions.NIL : partitions.$kw83$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)partitions.$kw83$SKIP) || partitions.NIL == id_index.id_index_tombstone_p(constant2)) {
                                    if (partitions.NIL != Hashtables.gethash_without_values(constant2, partitions.$partition_argument_hash$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
                                        dump_partition_argument(constant2, stream);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)partitions.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$66);
                                }
                                id2 = Numbers.add(id2, (SubLObject)partitions.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject table_var = partitions.$partition_argument_hash$.getDynamicValue(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)partitions.$str96$partition_arguments, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject v_object = (SubLObject)partitions.NIL;
                    SubLObject value = (SubLObject)partitions.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            v_object = Hashtables.getEntryKey(cdohash_entry);
                            value = Hashtables.getEntryValue(cdohash_entry);
                            dump_partition_argument(v_object, stream);
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_8, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_5, thread);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 45512L)
    public static SubLObject dump_partition_argument(final SubLObject v_object, final SubLObject stream) {
        if (partitions.NIL != assertion_handles.assertion_p(v_object)) {
            dump_partition_beliefs(v_object, stream);
        }
        else if (partitions.NIL != deduction_handles.deduction_p(v_object)) {
            dump_partition_deduction(v_object, stream);
        }
        else if (partitions.NIL != constant_handles.constant_p(v_object)) {
            dump_partition_bookkeeping_assertions_for_term(v_object, stream);
        }
        else {
            Errors.error((SubLObject)partitions.$str97$Unknown_argument_object__S, v_object);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 46039L)
    public static SubLObject dump_partition_deduction(final SubLObject deduction, final SubLObject stream) {
        cfasl.cfasl_output(deduction_handles.deduction_id(deduction), stream);
        cfasl.cfasl_output(arguments.argument_tv(deduction), stream);
        cfasl.cfasl_output(deductions_high.deduction_supported_object(deduction), stream);
        cfasl.cfasl_output(deductions_high.deduction_supports(deduction), stream);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 46328L)
    public static SubLObject dump_partition_beliefs(final SubLObject assertion, final SubLObject stream) {
        cfasl.cfasl_output((SubLObject)partitions.NIL, stream);
        cfasl.cfasl_output(assertion, stream);
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        final SubLObject total_beliefs = Sequences.count_if(Symbols.symbol_function((SubLObject)partitions.$sym30$BELIEF_P), v_arguments, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        cfasl.cfasl_output(total_beliefs, stream);
        SubLObject cdolist_list_var = v_arguments;
        SubLObject argument = (SubLObject)partitions.NIL;
        argument = cdolist_list_var.first();
        while (partitions.NIL != cdolist_list_var) {
            if (partitions.NIL != arguments.belief_p(argument)) {
                dump_partition_belief(argument, assertion, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 46771L)
    public static SubLObject dump_partition_belief(final SubLObject argument, final SubLObject assertion, final SubLObject stream) {
        if (partitions.NIL != arguments.asserted_argument_p(argument)) {
            dump_partition_asserted_argument(argument, assertion, stream);
        }
        else {
            Errors.error((SubLObject)partitions.$str98$Unable_to_dump_belief__S, argument);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 47022L)
    public static SubLObject dump_partition_asserted_argument(final SubLObject argument, final SubLObject assertion, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_output(partitions.$partition_asserted_argument_type_flag$.getDynamicValue(thread), stream);
        cfasl.cfasl_output(arguments.argument_tv(argument), stream);
        cfasl.cfasl_output(assertions_low.assertion_assert_info(assertion), stream);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 47282L)
    public static SubLObject dump_partition_bookkeeping_assertions_for_term(final SubLObject v_term, final SubLObject stream) {
        cfasl.cfasl_output((SubLObject)partitions.NIL, stream);
        cfasl.cfasl_output((SubLObject)partitions.NIL, stream);
        final SubLObject assertibles = bookkeeping_store.bookkeeping_assertibles_on_term(v_term);
        final SubLObject how_many = Sequences.length(assertibles);
        cfasl.cfasl_output(how_many, stream);
        SubLObject cdolist_list_var = assertibles;
        SubLObject assertible = (SubLObject)partitions.NIL;
        assertible = cdolist_list_var.first();
        while (partitions.NIL != cdolist_list_var) {
            dump_partition_assertible(assertible, stream);
            cdolist_list_var = cdolist_list_var.rest();
            assertible = cdolist_list_var.first();
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 48004L)
    public static SubLObject dump_partition_assertible(final SubLObject assertible, final SubLObject stream) {
        SubLObject cnf = (SubLObject)partitions.NIL;
        SubLObject mt = (SubLObject)partitions.NIL;
        SubLObject strength = (SubLObject)partitions.NIL;
        SubLObject direction = (SubLObject)partitions.NIL;
        SubLObject variable_map = (SubLObject)partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(assertible, assertible, (SubLObject)partitions.$list99);
        cnf = assertible.first();
        SubLObject current = assertible.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, assertible, (SubLObject)partitions.$list99);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, assertible, (SubLObject)partitions.$list99);
        strength = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, assertible, (SubLObject)partitions.$list99);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, assertible, (SubLObject)partitions.$list99);
        variable_map = current.first();
        current = current.rest();
        if (partitions.NIL == current) {
            cfasl.cfasl_output(cnf, stream);
            cfasl.cfasl_output(mt, stream);
            cfasl.cfasl_output(strength, stream);
            cfasl.cfasl_output(direction, stream);
            cfasl.cfasl_output(variable_map, stream);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(assertible, (SubLObject)partitions.$list99);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 48625L)
    public static SubLObject load_entire_kb_partition(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)partitions.NIL;
        final SubLObject _prev_bind_0 = partitions.$partition_entire_kb_loadP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = after_adding.$after_addings_disabledP$.currentBinding(thread);
        try {
            partitions.$partition_entire_kb_loadP$.bind((SubLObject)partitions.T, thread);
            after_adding.$after_addings_disabledP$.bind((SubLObject)partitions.T, thread);
            result = load_partition_clean(filename, (SubLObject)partitions.UNPROVIDED);
        }
        finally {
            after_adding.$after_addings_disabledP$.rebind(_prev_bind_2, thread);
            partitions.$partition_entire_kb_loadP$.rebind(_prev_bind_0, thread);
        }
        clear_partition_loader_state();
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 48931L)
    public static SubLObject load_partition_clean(final SubLObject partition_filename, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == partitions.UNPROVIDED) {
            reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
        }
        load_partition(partition_filename, reset_sbhl_linksP);
        return partition_load_kb_cleanup();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 49226L)
    public static SubLObject load_partitions_clean(final SubLObject partition_filename_list) {
        SubLObject cdolist_list_var = partition_filename_list;
        SubLObject partition_filename = (SubLObject)partitions.NIL;
        partition_filename = cdolist_list_var.first();
        while (partitions.NIL != cdolist_list_var) {
            load_partition(partition_filename, (SubLObject)partitions.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            partition_filename = cdolist_list_var.first();
        }
        return partition_load_kb_cleanup();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 49600L)
    public static SubLObject partition_load_kb_cleanup() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = partitions.$load_partition_invalid_missing_terms$.currentBinding(thread);
        try {
            partitions.$load_partition_invalid_missing_terms$.bind(keyhash.new_keyhash(partition_invalid_missing_terms_count(), (SubLObject)partitions.UNPROVIDED), thread);
            SubLObject removed_constant_count = (SubLObject)partitions.ZERO_INTEGER;
            SubLObject removed_nart_count = (SubLObject)partitions.ZERO_INTEGER;
            SubLObject removed_assertion_count = (SubLObject)partitions.ZERO_INTEGER;
            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str100$cleaning_up_after_partition_load_);
            final SubLObject _prev_bind_0_$80 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)partitions.$sym14$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(partitions.$const15$EverythingPSC, thread);
                SubLObject cdolist_list_var = gather_load_partition_missing_constants();
                SubLObject constant = (SubLObject)partitions.NIL;
                constant = cdolist_list_var.first();
                while (partitions.NIL != cdolist_list_var) {
                    if (!kb_indexing.num_gaf_arg_index(constant, (SubLObject)partitions.ONE_INTEGER, partitions.$const101$isa, (SubLObject)partitions.UNPROVIDED).isPositive()) {
                        add_load_partition_invalid_missing_term(constant);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    constant = cdolist_list_var.first();
                }
                if (partitions.$load_partition_max_nart_complexity$.getDynamicValue(thread).isNumber()) {
                    SubLObject end_var;
                    SubLObject complexity;
                    SubLObject cdolist_list_var2;
                    SubLObject nart;
                    for (end_var = Numbers.add(partitions.$load_partition_max_nart_complexity$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), complexity = (SubLObject)partitions.NIL, complexity = (SubLObject)partitions.ONE_INTEGER; !complexity.numGE(end_var); complexity = number_utilities.f_1X(complexity)) {
                        cdolist_list_var2 = gather_load_partition_missing_narts();
                        nart = (SubLObject)partitions.NIL;
                        nart = cdolist_list_var2.first();
                        while (partitions.NIL != cdolist_list_var2) {
                            if (complexity.eql(function_terms.term_functional_complexity(nart)) && (!kb_indexing.num_gaf_arg_index(nart, (SubLObject)partitions.ONE_INTEGER, partitions.$const101$isa, (SubLObject)partitions.UNPROVIDED).isPositive() || partitions.NIL != list_utilities.tree_find_if((SubLObject)partitions.$sym102$LOAD_PARTITION_INVALID_MISSING_TERM_, narts_high.nart_hl_formula(nart), (SubLObject)partitions.UNPROVIDED))) {
                                add_load_partition_invalid_missing_term(nart);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            nart = cdolist_list_var2.first();
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$80, thread);
            }
            SubLObject cdolist_list_var;
            SubLObject end_var2;
            SubLObject term_order;
            SubLObject assertion;
            for (end_var2 = Numbers.add(partitions.$load_partition_max_term_order$.getDynamicValue(thread), (SubLObject)partitions.TWO_INTEGER), term_order = (SubLObject)partitions.NIL, term_order = (SubLObject)partitions.ONE_INTEGER; !term_order.numGE(end_var2); term_order = number_utilities.f_1X(term_order)) {
                cdolist_list_var = gather_load_partition_missing_assertions();
                assertion = (SubLObject)partitions.NIL;
                assertion = cdolist_list_var.first();
                while (partitions.NIL != cdolist_list_var) {
                    if (term_order.eql(kb_utilities.term_order(assertion)) && (partitions.NIL != load_partition_invalid_missing_termP(hlmt.hlmt_monad_mt(assertions_high.assertion_mt(assertion))) || partitions.NIL != list_utilities.tree_find_if((SubLObject)partitions.$sym102$LOAD_PARTITION_INVALID_MISSING_TERM_, assertions_high.assertion_cnf(assertion), (SubLObject)partitions.UNPROVIDED))) {
                        add_load_partition_invalid_missing_term(assertion);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
            }
            SubLObject cdolist_list_var3 = gather_load_partition_missing_assertions();
            SubLObject assertion2 = (SubLObject)partitions.NIL;
            assertion2 = cdolist_list_var3.first();
            while (partitions.NIL != cdolist_list_var3) {
                if (partitions.NIL != load_partition_invalid_missing_termP(assertion2)) {
                    removed_assertion_count = Numbers.add(removed_assertion_count, (SubLObject)partitions.ONE_INTEGER);
                    tms.tms_remove_assertion(assertion2);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion2 = cdolist_list_var3.first();
            }
            if (partitions.$load_partition_max_nart_complexity$.getDynamicValue(thread).isNumber()) {
                SubLObject complexity2;
                SubLObject nart2;
                for (end_var2 = (SubLObject)partitions.ZERO_INTEGER, complexity2 = (SubLObject)partitions.NIL, complexity2 = partitions.$load_partition_max_nart_complexity$.getDynamicValue(thread); !complexity2.numLE(end_var2); complexity2 = Numbers.add(complexity2, (SubLObject)partitions.MINUS_ONE_INTEGER)) {
                    cdolist_list_var = gather_load_partition_missing_narts();
                    nart2 = (SubLObject)partitions.NIL;
                    nart2 = cdolist_list_var.first();
                    while (partitions.NIL != cdolist_list_var) {
                        if (complexity2.eql(function_terms.term_functional_complexity(nart2)) && partitions.NIL != load_partition_invalid_missing_termP(nart2)) {
                            removed_nart_count = Numbers.add(removed_nart_count, (SubLObject)partitions.ONE_INTEGER);
                            narts_high.remove_nart(nart2);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        nart2 = cdolist_list_var.first();
                    }
                }
            }
            cdolist_list_var3 = gather_load_partition_missing_constants();
            SubLObject constant2 = (SubLObject)partitions.NIL;
            constant2 = cdolist_list_var3.first();
            while (partitions.NIL != cdolist_list_var3) {
                if (partitions.NIL != load_partition_invalid_missing_termP(constant2)) {
                    removed_constant_count = Numbers.add(removed_constant_count, (SubLObject)partitions.ONE_INTEGER);
                    constants_high.remove_constant(constant2);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                constant2 = cdolist_list_var3.first();
            }
            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str103$partition_load_KB_cleanup_removed);
            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str104$__A_constants__, removed_constant_count);
            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str105$__A_NARTs__, removed_nart_count);
            PrintLow.format((SubLObject)partitions.T, (SubLObject)partitions.$str106$__A_assertions__, removed_assertion_count);
        }
        finally {
            partitions.$load_partition_invalid_missing_terms$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 52209L)
    public static SubLObject partition_invalid_missing_terms_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.add(new SubLObject[] { partitions.$load_partition_constants$.getDynamicValue(thread).isHashtable() ? Hashtables.hash_table_count(partitions.$load_partition_constants$.getDynamicValue(thread)) : partitions.ZERO_INTEGER, partitions.$load_partition_narts$.getDynamicValue(thread).isHashtable() ? Hashtables.hash_table_count(partitions.$load_partition_narts$.getDynamicValue(thread)) : partitions.ZERO_INTEGER, partitions.$load_partition_assertions$.getDynamicValue(thread).isHashtable() ? Hashtables.hash_table_count(partitions.$load_partition_assertions$.getDynamicValue(thread)) : partitions.ZERO_INTEGER, partitions.$load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable() ? Hashtables.hash_table_count(partitions.$load_partition_kb_hl_supports$.getDynamicValue(thread)) : partitions.ZERO_INTEGER });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 52741L)
    public static SubLObject load_partition_invalid_missing_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(v_term, partitions.$load_partition_invalid_missing_terms$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 52868L)
    public static SubLObject add_load_partition_invalid_missing_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        keyhash.setkeyhash(v_term, partitions.$load_partition_invalid_missing_terms$.getDynamicValue(thread));
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 53255L)
    public static SubLObject load_partition(final SubLObject filename, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == partitions.UNPROVIDED) {
            reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert partitions.NIL != Types.stringp(filename) : filename;
        SubLObject success = (SubLObject)partitions.NIL;
        if (partitions.NIL != Filesys.probe_file(filename)) {
            SubLObject stream = (SubLObject)partitions.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)partitions.NIL, thread);
                    stream = compatibility.open_binary(filename, (SubLObject)partitions.$kw107$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)partitions.$str58$Unable_to_open__S, filename);
                }
                final SubLObject stream_$81 = stream;
                if (partitions.ZERO_INTEGER.numE(streams_high.file_length(stream_$81))) {
                    success = (SubLObject)partitions.T;
                }
                else {
                    success = load_partition_from_stream(stream_$81, reset_sbhl_linksP);
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)partitions.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 54063L)
    public static SubLObject load_partition_from_stream(final SubLObject stream, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == partitions.UNPROVIDED) {
            reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = (SubLObject)partitions.NIL;
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)partitions.SIX_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)partitions.T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject _prev_bind_0_$82 = control_vars.$bootstrapping_kbP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$83 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                final SubLObject _prev_bind_2_$84 = control_vars.$within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_13 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                final SubLObject _prev_bind_14 = wff_utilities.$check_arityP$.currentBinding(thread);
                final SubLObject _prev_bind_15 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
                try {
                    control_vars.$bootstrapping_kbP$.bind((SubLObject)partitions.T, thread);
                    kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)partitions.NIL, thread);
                    control_vars.$within_assert$.bind((SubLObject)partitions.NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind((SubLObject)partitions.NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind((SubLObject)partitions.NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind((SubLObject)partitions.NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind((SubLObject)partitions.NIL, thread);
                    wff_utilities.$check_var_typesP$.bind((SubLObject)partitions.NIL, thread);
                    czer_vars.$simplify_literalP$.bind((SubLObject)partitions.NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind((SubLObject)partitions.NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind((SubLObject)partitions.NIL, thread);
                    wff_vars.$validate_constantsP$.bind((SubLObject)partitions.NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)partitions.T, thread);
                    wff_utilities.$check_arityP$.bind((SubLObject)partitions.NIL, thread);
                    cycl_grammar.$grammar_uses_kbP$.bind((SubLObject)partitions.NIL, thread);
                    final SubLObject format = load_partition_info(stream);
                    final SubLObject _prev_bind_0_$83 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                    try {
                        cfasl.$cfasl_common_symbols$.bind((SubLObject)partitions.NIL, thread);
                        cfasl.cfasl_set_common_symbols(load_partition_special_objects(stream));
                        final SubLObject _prev_bind_0_$84 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$84 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$85 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$89 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
                        try {
                            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.$sym108$PARTITION_FIND_CONSTANT_BY_ID, thread);
                            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.$sym109$PARTITION_FIND_NART_BY_ID, thread);
                            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.$sym110$PARTITION_FIND_ASSERTION_BY_ID, thread);
                            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.$sym111$PARTITION_FIND_KB_HL_SUPPORT_BY_ID, thread);
                            load_partition_constant_shells(stream);
                            load_partition_nart_shells(stream);
                            if (partitions.NIL != partitions.$partition_entire_kb_loadP$.getDynamicValue(thread)) {
                                hl_storage_modules.reclassify_hl_storage_modules();
                            }
                            load_partition_assertions(stream);
                            if (partitions.NIL != partition_formats_compatibleP((SubLObject)partitions.$str76$2_2, format)) {
                                load_partition_kb_hl_supports(stream);
                            }
                            load_partition_arguments(stream);
                            if (partitions.NIL != reset_sbhl_linksP) {
                                reset_sbhl_links_for_partition_forts();
                            }
                            success = (SubLObject)partitions.T;
                        }
                        finally {
                            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_3_$89, thread);
                            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_2_$85, thread);
                            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_1_$84, thread);
                            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0_$84, thread);
                        }
                    }
                    finally {
                        cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$83, thread);
                    }
                }
                finally {
                    cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_15, thread);
                    wff_utilities.$check_arityP$.rebind(_prev_bind_14, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_13, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_12, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_11, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_10, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_9, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_8, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_6, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_4, thread);
                    control_vars.$within_assert$.rebind(_prev_bind_2_$84, thread);
                    kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_1_$83, thread);
                    control_vars.$bootstrapping_kbP$.rebind(_prev_bind_0_$82, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 55436L)
    public static SubLObject load_partition_info(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copyright_notice = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject format = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject system = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject patch_level = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject date = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.stringp(copyright_notice) : copyright_notice;
        assert partitions.NIL != Types.atom(format) : format;
        assert partitions.NIL != Types.integerp(system) : system;
        assert partitions.NIL != Types.integerp(patch_level) : patch_level;
        assert partitions.NIL != Types.integerp(date) : date;
        if (partitions.NIL == partition_formats_compatibleP(format, partitions.$dump_partition_format$.getDynamicValue(thread))) {
            Errors.error((SubLObject)partitions.$str114$partition_format_is__A__not__A__a, format, partitions.$dump_partition_format$.getDynamicValue(thread));
        }
        return format;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 56047L)
    public static SubLObject partition_formats_compatibleP(final SubLObject file_format, final SubLObject code_format) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(file_format.equal(code_format) || partitions.NIL != conses_high.member((SubLObject)ConsesLow.list(file_format, code_format), partitions.$backwards_compatibility_pairs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)partitions.EQUAL), (SubLObject)partitions.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 56252L)
    public static SubLObject load_partition_section_marker(final SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == partitions.UNPROVIDED) {
            eof_error_p = (SubLObject)partitions.T;
        }
        if (eof_value == partitions.UNPROVIDED) {
            eof_value = (SubLObject)partitions.$kw115$EOF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject marker = cfasl.cfasl_input(stream, eof_error_p, eof_value);
        if (marker.eql(eof_value)) {
            return eof_value;
        }
        if (partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !marker.eql(partitions.$partition_section_marker$.getDynamicValue(thread))) {
            Errors.error((SubLObject)partitions.$str116$malformed_partition_file);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 56569L)
    public static SubLObject load_partition_special_objects(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)partitions.NIL;
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)partitions.NIL, thread);
            cfasl.cfasl_set_common_symbols((SubLObject)partitions.NIL);
            ans = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 56733L)
    public static SubLObject reset_sbhl_links_for_partition_forts() {
        final SubLObject constants = gather_load_partition_scope_constants();
        final SubLObject narts = gather_load_partition_scope_narts();
        final SubLObject v_forts = ConsesLow.nconc(constants, narts);
        sbhl_link_methods.sbhl_recompute_links_of_nodes(v_forts);
        return Sequences.length(v_forts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 57009L)
    public static SubLObject load_partition_constant_shells(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(total) : total;
        clear_load_partition_constants(total);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)partitions.$str117$loading_partition_constant_shells, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(total, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = (SubLObject)partitions.NIL, i = (SubLObject)partitions.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)partitions.ONE_INTEGER)) {
                    load_partition_constant_shell(stream);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 57370L)
    public static SubLObject load_partition_constant_shell(final SubLObject stream) {
        final SubLObject id = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject name = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject guid = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject scopeP = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(id) : id;
        assert partitions.NIL != Types.stringp(name) : name;
        assert partitions.NIL != Types.atom(scopeP) : scopeP;
        assert partitions.NIL != Guids.guid_p(guid) : guid;
        link_partition_constant_shell(id, name, guid, scopeP);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 57751L)
    public static SubLObject load_partition_nart_shells(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_nart_level = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(max_nart_level) : max_nart_level;
        if (max_nart_level.numG(partitions.$load_partition_max_nart_complexity$.getDynamicValue(thread))) {
            partitions.$load_partition_max_nart_complexity$.setDynamicValue(max_nart_level, thread);
        }
        if (partitions.ZERO_INTEGER.numE(max_nart_level)) {
            clear_load_partition_narts((SubLObject)partitions.$int12$100);
        }
        else {
            SubLObject index;
            SubLObject nart_level;
            for (index = (SubLObject)partitions.NIL, index = (SubLObject)partitions.ZERO_INTEGER; index.numL(max_nart_level); index = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER)) {
                nart_level = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER);
                load_partition_nart_order_set(nart_level, stream);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 58369L)
    public static SubLObject load_partition_nart_order_set(final SubLObject nart_level, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(total) : total;
        if (nart_level.numE((SubLObject)partitions.ONE_INTEGER)) {
            clear_load_partition_narts(total);
        }
        final SubLObject message = Sequences.cconcatenate((SubLObject)partitions.$str119$loading_partition_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(nart_level), partitions.$str120$_narts });
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind(message, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(total, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = (SubLObject)partitions.NIL, i = (SubLObject)partitions.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)partitions.ONE_INTEGER)) {
                    load_partition_nart_shell(stream);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 58794L)
    public static SubLObject load_partition_nart_shell(final SubLObject stream) {
        final SubLObject id = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject hl_formula = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject scopeP = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(id) : id;
        assert partitions.NIL != el_utilities.possibly_naut_p(hl_formula) : hl_formula;
        assert partitions.NIL != Types.atom(scopeP) : scopeP;
        link_partition_nart_shell(id, hl_formula, scopeP);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 59133L)
    public static SubLObject load_partition_assertions(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_term_order = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(max_term_order) : max_term_order;
        if (max_term_order.numG(partitions.$load_partition_max_term_order$.getDynamicValue(thread))) {
            partitions.$load_partition_max_term_order$.setDynamicValue(max_term_order, thread);
        }
        SubLObject term_order;
        SubLObject meta_order;
        for (term_order = (SubLObject)partitions.NIL, term_order = (SubLObject)partitions.ZERO_INTEGER; term_order.numL(max_term_order); term_order = Numbers.add(term_order, (SubLObject)partitions.ONE_INTEGER)) {
            meta_order = Numbers.add(term_order, (SubLObject)partitions.ONE_INTEGER);
            if (meta_order.numE((SubLObject)partitions.ONE_INTEGER)) {
                load_partition_simple_assertions(meta_order, stream);
            }
            else {
                load_partition_meta_assertions(meta_order, stream);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 59657L)
    public static SubLObject load_partition_simple_assertions(final SubLObject meta_order, final SubLObject stream) {
        return load_partition_assertion_order_set(meta_order, (SubLObject)partitions.$str122$loading_partition_assertions, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 59824L)
    public static SubLObject load_partition_meta_assertions(final SubLObject meta_order, final SubLObject stream) {
        final SubLObject message = Sequences.cconcatenate((SubLObject)partitions.$str123$loading_partition_order_, new SubLObject[] { format_nil.format_nil_s_no_copy(meta_order), partitions.$str124$_meta_assertions });
        return load_partition_assertion_order_set(meta_order, message, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 60060L)
    public static SubLObject load_partition_assertion_order_set(final SubLObject meta_order, final SubLObject message, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(total) : total;
        if (meta_order.numE((SubLObject)partitions.ONE_INTEGER)) {
            clear_load_partition_assertions(total);
        }
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind(message, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(total, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = (SubLObject)partitions.NIL, i = (SubLObject)partitions.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)partitions.ONE_INTEGER)) {
                    load_partition_assertion(stream);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 60423L)
    public static SubLObject load_partition_assertion(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject scope_termP = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject cnf = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject mt = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject direction = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject vnames = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        if (!id.isInteger()) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str125$Skipping_assertion_with_bad_id__A, new SubLObject[] { id, scope_termP, cnf, mt, direction, vnames });
            }
            return (SubLObject)partitions.NIL;
        }
        if (partitions.NIL == clauses.cnf_p(cnf)) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str126$Skipping_assertion_with_bad_cnf__, new SubLObject[] { cnf, id, scope_termP, mt, direction, vnames });
            }
            return (SubLObject)partitions.NIL;
        }
        if (partitions.NIL == hlmt.possibly_hlmt_p(mt)) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str127$Skipping_assertion_with_bad_mt__S, new SubLObject[] { mt, id, scope_termP, cnf, direction, vnames });
            }
            return (SubLObject)partitions.NIL;
        }
        if (partitions.NIL == enumeration_types.direction_p(direction)) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str128$Skipping_assertion_with_bad_direc, new SubLObject[] { direction, id, scope_termP, cnf, mt, vnames });
            }
            return (SubLObject)partitions.NIL;
        }
        if (!vnames.isList()) {
            Errors.warn((SubLObject)partitions.$str129$Skipping_assertion_with_bad_vname, new SubLObject[] { vnames, id, scope_termP, cnf, mt, direction });
            return (SubLObject)partitions.NIL;
        }
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            SubLObject message_var = (SubLObject)partitions.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)partitions.$sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)partitions.$list131);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)partitions.$sym132$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            link_partition_assertion(id, cnf, mt, scope_termP, direction, vnames);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)partitions.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)partitions.$sym133$CSETQ, (SubLObject)partitions.$sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)partitions.$str134$_A, message_var);
            }
        }
        else {
            SubLObject ignore_errors_tag = (SubLObject)partitions.NIL;
            try {
                thread.throwStack.push(partitions.$kw135$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)partitions.$sym136$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        link_partition_assertion(id, cnf, mt, scope_termP, direction, vnames);
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)partitions.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)partitions.$kw135$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 62025L)
    public static SubLObject load_partition_kb_hl_supports(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_kb_hl_support_level = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(max_kb_hl_support_level) : max_kb_hl_support_level;
        if (max_kb_hl_support_level.numG(partitions.$load_partition_max_kb_hl_support_order$.getDynamicValue(thread))) {
            partitions.$load_partition_max_kb_hl_support_order$.setDynamicValue(max_kb_hl_support_level, thread);
        }
        if (partitions.ZERO_INTEGER.numE(max_kb_hl_support_level)) {
            clear_load_partition_kb_hl_supports((SubLObject)partitions.$int12$100);
        }
        else {
            SubLObject index;
            SubLObject kb_hl_support_level;
            for (index = (SubLObject)partitions.NIL, index = (SubLObject)partitions.ZERO_INTEGER; index.numL(max_kb_hl_support_level); index = Numbers.add(index, (SubLObject)partitions.ONE_INTEGER)) {
                kb_hl_support_level = Numbers.add((SubLObject)partitions.ONE_INTEGER, index);
                load_partition_kb_hl_support_order_set(kb_hl_support_level, stream);
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 62631L)
    public static SubLObject load_partition_kb_hl_support_order_set(final SubLObject level, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(total) : total;
        if (level.numE((SubLObject)partitions.ONE_INTEGER)) {
            clear_load_partition_kb_hl_supports(total);
        }
        final SubLObject message = Sequences.cconcatenate((SubLObject)partitions.$str119$loading_partition_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(level), partitions.$str92$_KB_HL_supports });
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind(message, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(total, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = (SubLObject)partitions.NIL, i = (SubLObject)partitions.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)partitions.ONE_INTEGER)) {
                    load_partition_kb_hl_support(stream);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 63071L)
    public static SubLObject load_partition_kb_hl_support(final SubLObject stream) {
        final SubLObject id = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject scopeP = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject hl_support = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject justification = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(id) : id;
        assert partitions.NIL != arguments.hl_support_p(hl_support) : hl_support;
        assert partitions.NIL != arguments.hl_justification_p(justification) : justification;
        link_partition_kb_hl_support(id, hl_support, justification, scopeP);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 63494L)
    public static SubLObject load_partition_arguments(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_partition_section_marker(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != Types.integerp(total) : total;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)partitions.$str139$loading_partition_arguments, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(total, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = (SubLObject)partitions.NIL, i = (SubLObject)partitions.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)partitions.ONE_INTEGER)) {
                    load_partition_argument(stream);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)partitions.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 63788L)
    public static SubLObject load_partition_argument(final SubLObject stream) {
        final SubLObject id = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == id) {
            load_partition_beliefs(stream);
        }
        else {
            load_partition_deduction(stream, id);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 63981L)
    public static SubLObject load_partition_beliefs(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == assertion) {
            load_some_partition_bookkeeping_assertions(stream);
        }
        else {
            final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
            assert partitions.NIL != assertion_handles.assertion_p(assertion) : assertion;
            assert partitions.NIL != Types.integerp(total) : total;
            SubLObject i;
            SubLObject type;
            for (i = (SubLObject)partitions.NIL, i = (SubLObject)partitions.ZERO_INTEGER; i.numL(total); i = Numbers.add(i, (SubLObject)partitions.ONE_INTEGER)) {
                type = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
                assert partitions.NIL != Types.keywordp(type) : type;
                if (type.eql(partitions.$partition_asserted_argument_type_flag$.getDynamicValue(thread))) {
                    load_partition_asserted_argument(assertion, stream);
                }
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 64508L)
    public static SubLObject load_partition_asserted_argument(final SubLObject assertion, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tv = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject assert_info = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == assertion_handles.valid_assertionP(assertion, (SubLObject)partitions.UNPROVIDED)) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str140$Skipping_asserted_argument_for_ba, assertion);
            }
            return (SubLObject)partitions.NIL;
        }
        if (partitions.NIL == enumeration_types.tv_p(tv)) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str141$Skipping_asserted_argument_for_as, assertion_handles.assertion_id(assertion), tv, assertion);
            }
            return (SubLObject)partitions.NIL;
        }
        if (!assert_info.isList()) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str142$Skipping_asserted_argument_for_as, assertion_handles.assertion_id(assertion), assert_info, assertion);
            }
            return (SubLObject)partitions.NIL;
        }
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            SubLObject message_var = (SubLObject)partitions.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)partitions.$sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)partitions.$list131);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)partitions.$sym132$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            link_partition_asserted_argument(assertion, tv, assert_info);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)partitions.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)partitions.$sym133$CSETQ, (SubLObject)partitions.$sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)partitions.$str134$_A, message_var);
            }
        }
        else {
            SubLObject ignore_errors_tag = (SubLObject)partitions.NIL;
            try {
                thread.throwStack.push(partitions.$kw135$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)partitions.$sym136$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        link_partition_asserted_argument(assertion, tv, assert_info);
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)partitions.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)partitions.$kw135$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 65455L)
    public static SubLObject load_partition_deduction(final SubLObject stream, SubLObject id) {
        if (id == partitions.UNPROVIDED) {
            id = (SubLObject)partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tv = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject assertion = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        SubLObject supports = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == enumeration_types.tv_p(tv)) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str143$Skipping_deduction__id__A__with_b, new SubLObject[] { id, tv, assertion, supports });
            }
            return (SubLObject)partitions.NIL;
        }
        if (partitions.NIL == assertion_handles.valid_assertionP(assertion, (SubLObject)partitions.UNPROVIDED)) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str144$Skipping_deduction__id__A__with_b, new SubLObject[] { id, assertion, tv, supports });
            }
            return (SubLObject)partitions.NIL;
        }
        if (!supports.isCons()) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str145$Skipping_deduction__id__A__with_b, new SubLObject[] { id, supports, tv, assertion });
            }
            return (SubLObject)partitions.NIL;
        }
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            SubLObject message_var = (SubLObject)partitions.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)partitions.$sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)partitions.$list131);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)partitions.$sym132$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            supports = load_partition_possibly_weaken_hl_supports(supports);
                            link_partition_deduction(assertion, supports, tv);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)partitions.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)partitions.$sym133$CSETQ, (SubLObject)partitions.$sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)partitions.$str134$_A, message_var);
            }
        }
        else {
            SubLObject ignore_errors_tag = (SubLObject)partitions.NIL;
            try {
                thread.throwStack.push(partitions.$kw135$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)partitions.$sym136$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        supports = load_partition_possibly_weaken_hl_supports(supports);
                        link_partition_deduction(assertion, supports, tv);
                    }
                    catch (Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, (SubLObject)partitions.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_3, thread);
                }
            }
            catch (Throwable ccatch_env_var2) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, (SubLObject)partitions.$kw135$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 66450L)
    public static SubLObject load_some_partition_bookkeeping_assertions(final SubLObject stream) {
        SubLObject how_many;
        SubLObject i;
        for (how_many = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED), i = (SubLObject)partitions.NIL, i = (SubLObject)partitions.ZERO_INTEGER; i.numL(how_many); i = Numbers.add(i, (SubLObject)partitions.ONE_INTEGER)) {
            load_partition_assertible(stream);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 66644L)
    public static SubLObject load_partition_assertible(final SubLObject stream) {
        final SubLObject cnf = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject mt = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject strength = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject direction = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        final SubLObject variable_map = cfasl.cfasl_input(stream, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        assert partitions.NIL != clauses.cnf_p(cnf) : cnf;
        assert partitions.NIL != hlmt.possibly_hlmt_p(mt) : mt;
        assert partitions.NIL != enumeration_types.el_strength_p(strength) : strength;
        assert partitions.NIL != enumeration_types.direction_p(direction) : direction;
        assert partitions.NIL != Types.listp(variable_map) : variable_map;
        return link_partition_assertible(cnf, mt, strength, direction, variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 67335L)
    public static SubLObject load_partition_possibly_weaken_hl_supports(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != partitions.$load_partition_weaken_hl_supports$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = supports;
            SubLObject support = (SubLObject)partitions.NIL;
            support = cdolist_list_var.first();
            while (partitions.NIL != cdolist_list_var) {
                if (partitions.NIL != arguments.hl_support_p(support)) {
                    final SubLObject module = arguments.hl_support_module(support);
                    final SubLObject weaker_module = list_utilities.alist_lookup_without_values(partitions.$load_partition_weaken_hl_supports$.getDynamicValue(thread), module, Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED);
                    if (partitions.NIL != weaker_module) {
                        replace_hl_support_module(support, weaker_module);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 67770L)
    public static SubLObject replace_hl_support_module(final SubLObject hl_support, final SubLObject new_module) {
        assert partitions.NIL != arguments.hl_support_p(hl_support) : hl_support;
        ConsesLow.rplaca(hl_support, new_module);
        assert partitions.NIL != arguments.hl_support_p(hl_support) : hl_support;
        return hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 68812L)
    public static SubLObject clear_load_partition_constants(final SubLObject total) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!partitions.$load_partition_constants$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_constants$.setDynamicValue(new_load_partition_constants_store(total), thread);
        }
        if (partitions.NIL == partitions.$preseeded_partition_constants$.getDynamicValue(thread)) {
            Hashtables.clrhash(partitions.$load_partition_constants$.getDynamicValue(thread));
        }
        if (!partitions.$load_partition_scope_constants$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_scope_constants$.setDynamicValue(new_load_partition_scope_constants_store(total), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_scope_constants$.getDynamicValue(thread));
        if (!partitions.$load_partition_missing_constants$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_missing_constants$.setDynamicValue(new_load_paritition_missing_constants_store(total), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_missing_constants$.getDynamicValue(thread));
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 69597L)
    public static SubLObject new_load_partition_constants_store(final SubLObject total) {
        return Hashtables.make_hash_table(total, Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 69698L)
    public static SubLObject new_load_partition_scope_constants_store(final SubLObject total) {
        return Hashtables.make_hash_table(Numbers.integerDivide(total, (SubLObject)partitions.TEN_INTEGER), Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 69813L)
    public static SubLObject new_load_paritition_missing_constants_store(final SubLObject total) {
        return Hashtables.make_hash_table(Numbers.integerDivide(total, (SubLObject)partitions.TEN_INTEGER), (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 69937L)
    public static SubLObject gather_load_partition_scope_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_values(partitions.$load_partition_scope_constants$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 70058L)
    public static SubLObject gather_load_partition_missing_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.$load_partition_scope_constants$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values(partitions.$load_partition_missing_constants$.getDynamicValue(thread));
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 70260L)
    public static SubLObject note_load_partition_constant(final SubLObject id, final SubLObject constant, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL == partitions.$preseeded_partition_constants$.getDynamicValue(thread) || partitions.NIL == Hashtables.gethash_without_values(id, partitions.$load_partition_constants$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED)) {
            Hashtables.sethash(id, partitions.$load_partition_constants$.getDynamicValue(thread), constant);
        }
        if (partitions.NIL != scopeP) {
            Hashtables.sethash(id, partitions.$load_partition_scope_constants$.getDynamicValue(thread), constant);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 70646L)
    public static SubLObject note_load_partition_missing_constant(final SubLObject id, final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(id, partitions.$load_partition_missing_constants$.getDynamicValue(thread), constant);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 70809L)
    public static SubLObject partition_find_constant_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = Hashtables.gethash_without_values(id, partitions.$load_partition_constants$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == constant) {
            constant = partition_missing_constant_link_error(id);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 71158L)
    public static SubLObject partition_missing_constant_link_error(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str151$Did_not_find_constant__D_, id);
        }
        final SubLObject invalid_constant = constant_handles.partition_create_invalid_constant();
        note_load_partition_constant(id, invalid_constant, (SubLObject)partitions.NIL);
        note_load_partition_missing_constant(id, invalid_constant);
        return invalid_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 71516L)
    public static SubLObject link_partition_constant_shell(final SubLObject id, final SubLObject name, final SubLObject external_id, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            SubLObject constant = (SubLObject)partitions.NIL;
            if (partitions.NIL != scopeP) {
                final SubLObject existing_by_id = constants_high.find_constant_by_external_id(external_id);
                final SubLObject existing_by_name = constants_high.find_constant(name);
                if (partitions.NIL != constant_handles.constant_p(existing_by_id)) {
                    if (partitions.NIL != constant_handles.constant_p(existing_by_name)) {
                        if (existing_by_id.eql(existing_by_name)) {
                            constant = existing_by_id;
                        }
                        else {
                            constant = link_partition_constant_error_1(name, external_id);
                        }
                    }
                    else {
                        constant = link_partition_constant_error_2(name, external_id);
                    }
                }
                else if (partitions.NIL != constant_handles.constant_p(existing_by_name)) {
                    constant = link_partition_constant_error_3(name, external_id);
                }
                else {
                    constant = link_partition_create_constant(name, external_id);
                }
            }
            else {
                final SubLObject existing_by_id = constants_high.find_constant_by_external_id(external_id);
                final SubLObject existing_by_name = constants_high.find_constant(name);
                if (partitions.NIL != constant_handles.constant_p(existing_by_id)) {
                    if (partitions.NIL != constant_handles.constant_p(existing_by_name)) {
                        if (existing_by_id.eql(existing_by_name)) {
                            constant = existing_by_id;
                        }
                        else {
                            constant = link_partition_constant_error_4(name, external_id);
                        }
                    }
                    else {
                        constant = link_partition_constant_error_5(name, external_id);
                    }
                }
                else if (partitions.NIL != constant_handles.constant_p(existing_by_name)) {
                    constant = link_partition_constant_error_6(name, external_id);
                    note_load_partition_missing_constant(id, constant);
                }
                else {
                    constant = link_partition_constant_error_7(name, external_id);
                    note_load_partition_missing_constant(id, constant);
                }
            }
            assert partitions.NIL != constant_handles.constant_p(constant) : constant;
            note_load_partition_constant(id, constant, scopeP);
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 73697L)
    public static SubLObject link_partition_create_constant(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            return constants_high.find_or_create_constant(name, external_id);
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 73909L)
    public static SubLObject link_partition_install_constant_id(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            return constants_high.find_or_create_constant(name, external_id);
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 74132L)
    public static SubLObject preseed_load_partition_constants_store(final SubLObject pre_seeding, SubLObject scoped_map) {
        if (scoped_map == partitions.UNPROVIDED) {
            scoped_map = (SubLObject)partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = (SubLObject)partitions.NIL;
        SubLObject constant = (SubLObject)partitions.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(pre_seeding);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                id = Hashtables.getEntryKey(cdohash_entry);
                constant = Hashtables.getEntryValue(cdohash_entry);
                final SubLObject scopedP = (SubLObject)(scoped_map.isHashtable() ? Hashtables.gethash_without_values(id, scoped_map, (SubLObject)partitions.UNPROVIDED) : partitions.NIL);
                final SubLObject _prev_bind_0 = partitions.$preseeded_partition_constants$.currentBinding(thread);
                try {
                    partitions.$preseeded_partition_constants$.bind((SubLObject)partitions.NIL, thread);
                    note_load_partition_constant(id, constant, scopedP);
                }
                finally {
                    partitions.$preseeded_partition_constants$.rebind(_prev_bind_0, thread);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 74628L)
    public static SubLObject with_preseeded_partition_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)partitions.$list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pre_seeding = (SubLObject)partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)partitions.$list154);
        pre_seeding = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)partitions.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)partitions.NIL;
        SubLObject current_$96 = (SubLObject)partitions.NIL;
        while (partitions.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)partitions.$list154);
            current_$96 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)partitions.$list154);
            if (partitions.NIL == conses_high.member(current_$96, (SubLObject)partitions.$list155, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED)) {
                bad = (SubLObject)partitions.T;
            }
            if (current_$96 == partitions.$kw156$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (partitions.NIL != bad && partitions.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)partitions.$list154);
        }
        final SubLObject expected_total_tail = cdestructuring_bind.property_list_member((SubLObject)partitions.$kw157$EXPECTED_TOTAL, current);
        final SubLObject expected_total = (SubLObject)((partitions.NIL != expected_total_tail) ? conses_high.cadr(expected_total_tail) : partitions.$int12$100);
        final SubLObject scoped_map_tail = cdestructuring_bind.property_list_member((SubLObject)partitions.$kw158$SCOPED_MAP, current);
        final SubLObject scoped_map = (SubLObject)((partitions.NIL != scoped_map_tail) ? conses_high.cadr(scoped_map_tail) : partitions.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)partitions.$sym159$CLET, (SubLObject)ConsesLow.list((SubLObject)partitions.$list160, (SubLObject)ConsesLow.list((SubLObject)partitions.$sym161$_LOAD_PARTITION_CONSTANTS_, (SubLObject)ConsesLow.list((SubLObject)partitions.$sym162$NEW_LOAD_PARTITION_CONSTANTS_STORE, expected_total)), (SubLObject)ConsesLow.list((SubLObject)partitions.$sym163$_LOAD_PARTITION_SCOPE_CONSTANTS_, (SubLObject)ConsesLow.list((SubLObject)partitions.$sym164$FWHEN, (SubLObject)ConsesLow.list((SubLObject)partitions.$sym165$HASH_TABLE_P, scoped_map), (SubLObject)ConsesLow.list((SubLObject)partitions.$sym166$NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE, expected_total)))), (SubLObject)ConsesLow.list((SubLObject)partitions.$sym167$PRESEED_LOAD_PARTITION_CONSTANTS_STORE, pre_seeding, scoped_map), ConsesLow.append(body, (SubLObject)partitions.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 75187L)
    public static SubLObject load_partition_from_stream_with_preseeding(final SubLObject stream, final SubLObject preseeding, SubLObject reset_sbhl_linksP) {
        if (reset_sbhl_linksP == partitions.UNPROVIDED) {
            reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)partitions.NIL;
        final SubLObject _prev_bind_0 = partitions.$preseeded_partition_constants$.currentBinding(thread);
        final SubLObject _prev_bind_2 = partitions.$load_partition_constants$.currentBinding(thread);
        final SubLObject _prev_bind_3 = partitions.$load_partition_scope_constants$.currentBinding(thread);
        try {
            partitions.$preseeded_partition_constants$.bind((SubLObject)partitions.T, thread);
            partitions.$load_partition_constants$.bind(new_load_partition_constants_store((SubLObject)partitions.$int12$100), thread);
            partitions.$load_partition_scope_constants$.bind((SubLObject)(partitions.NIL.isHashtable() ? new_load_partition_scope_constants_store((SubLObject)partitions.$int12$100) : partitions.NIL), thread);
            preseed_load_partition_constants_store(preseeding, (SubLObject)partitions.NIL);
            result = load_partition_from_stream(stream, reset_sbhl_linksP);
        }
        finally {
            partitions.$load_partition_scope_constants$.rebind(_prev_bind_3, thread);
            partitions.$load_partition_constants$.rebind(_prev_bind_2, thread);
            partitions.$preseeded_partition_constants$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 75614L)
    public static SubLObject link_partition_constant_error_1(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = constants_high.find_constant_by_external_id(external_id);
        final SubLObject new_name = constants_high.constant_name(existing);
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str168$NAME_change_for__S___new_name_is_, name, new_name);
        }
        return existing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 76222L)
    public static SubLObject link_partition_constant_error_2(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = constants_high.find_constant_by_external_id(external_id);
        final SubLObject new_name = constants_high.constant_name(existing);
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str168$NAME_change_for__S___new_name_is_, name, new_name);
        }
        return existing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 76520L)
    public static SubLObject link_partition_constant_error_3(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != constants_high.uninstalled_constant_p(constants_high.find_constant(name))) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str169$installing_ID__S_for__S, external_id, name);
            }
            return link_partition_install_constant_id(name, external_id);
        }
        final SubLObject new_name = constant_completion_high.uniquify_constant_name(name, (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str170$NAME_clash_for__S___renaming_to__, name, new_name);
        }
        return link_partition_create_constant(new_name, external_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 77121L)
    public static SubLObject link_partition_constant_error_4(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = constants_high.find_constant_by_external_id(external_id);
        final SubLObject new_name = constants_high.constant_name(existing);
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str168$NAME_change_for__S___new_name_is_, name, new_name);
        }
        return existing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 77699L)
    public static SubLObject link_partition_constant_error_5(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = constants_high.find_constant_by_external_id(external_id);
        final SubLObject new_name = constants_high.constant_name(existing);
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str168$NAME_change_for__S___new_name_is_, name, new_name);
        }
        return existing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 77997L)
    public static SubLObject link_partition_constant_error_6(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != constants_high.uninstalled_constant_p(constants_high.find_constant(name))) {
            if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)partitions.$str169$installing_ID__S_for__S, external_id, name);
            }
            return link_partition_install_constant_id(name, external_id);
        }
        final SubLObject new_name = constant_completion_high.uniquify_constant_name(name, (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str170$NAME_clash_for__S___renaming_to__, name, new_name);
        }
        return link_partition_create_constant(new_name, external_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 78598L)
    public static SubLObject link_partition_constant_error_7(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str171$Constant_with_NAME__S_and_ID__S_m, name, external_id);
        }
        return link_partition_create_constant(name, external_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 79267L)
    public static SubLObject clear_load_partition_narts(final SubLObject total) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!partitions.$load_partition_narts$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_narts$.setDynamicValue(Hashtables.make_hash_table(total, Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_narts$.getDynamicValue(thread));
        if (!partitions.$load_partition_scope_narts$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_scope_narts$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(total, (SubLObject)partitions.TEN_INTEGER), Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_scope_narts$.getDynamicValue(thread));
        if (!partitions.$load_partition_missing_narts$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_missing_narts$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(total, (SubLObject)partitions.TEN_INTEGER), (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_missing_narts$.getDynamicValue(thread));
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 79920L)
    public static SubLObject gather_load_partition_scope_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_values(partitions.$load_partition_scope_narts$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 80032L)
    public static SubLObject gather_load_partition_missing_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.$load_partition_missing_narts$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values(partitions.$load_partition_missing_narts$.getDynamicValue(thread));
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 80224L)
    public static SubLObject note_load_partition_nart(final SubLObject id, final SubLObject nart, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(id, partitions.$load_partition_narts$.getDynamicValue(thread), nart);
        if (partitions.NIL != scopeP) {
            Hashtables.sethash(id, partitions.$load_partition_scope_narts$.getDynamicValue(thread), nart);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 80453L)
    public static SubLObject note_load_partition_missing_nart(final SubLObject id, final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(id, partitions.$load_partition_missing_narts$.getDynamicValue(thread), nart);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 80600L)
    public static SubLObject partition_find_nart_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nart = Hashtables.gethash_without_values(id, partitions.$load_partition_narts$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == nart) {
            nart = partition_missing_nart_link_error(id);
        }
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 80917L)
    public static SubLObject link_partition_nart_shell(final SubLObject id, final SubLObject nart_hl_formula, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            SubLObject nart = narts_high.find_nart(nart_hl_formula);
            if (partitions.NIL == nart_handles.nart_p(nart)) {
                if (partitions.NIL == scopeP && partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)partitions.$str172$Non_scope_NART__S_not_found_, nart_hl_formula);
                }
                nart = link_partition_create_nart_shell(nart_hl_formula);
                note_load_partition_missing_nart(id, nart);
            }
            note_load_partition_nart(id, nart, scopeP);
            return nart;
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 81404L)
    public static SubLObject link_partition_create_nart_shell(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            return narts_interface.kb_create_nart(nart_hl_formula);
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 81561L)
    public static SubLObject partition_missing_nart_link_error(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str173$Did_not_find_NART__D_, id);
        }
        final SubLObject invalid_nart = nart_handles.partition_create_invalid_nart();
        note_load_partition_nart(id, invalid_nart, (SubLObject)partitions.NIL);
        note_load_partition_missing_nart(id, invalid_nart);
        return invalid_nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 82292L)
    public static SubLObject clear_load_partition_assertions(final SubLObject total) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!partitions.$load_partition_assertions$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_assertions$.setDynamicValue(Hashtables.make_hash_table(total, Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_assertions$.getDynamicValue(thread));
        if (!partitions.$load_partition_missing_assertions$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_missing_assertions$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(total, (SubLObject)partitions.TEN_INTEGER), (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_missing_assertions$.getDynamicValue(thread));
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 82774L)
    public static SubLObject gather_load_partition_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_values(partitions.$load_partition_assertions$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 82884L)
    public static SubLObject gather_load_partition_missing_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.$load_partition_missing_assertions$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values(partitions.$load_partition_missing_assertions$.getDynamicValue(thread));
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 83091L)
    public static SubLObject note_load_partition_assertion(final SubLObject id, final SubLObject assertion, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(id, partitions.$load_partition_assertions$.getDynamicValue(thread), assertion);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 83327L)
    public static SubLObject note_load_partition_missing_assertion(final SubLObject id, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(id, partitions.$load_partition_missing_assertions$.getDynamicValue(thread), assertion);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 83494L)
    public static SubLObject partition_find_assertion_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = Hashtables.gethash_without_values(id, partitions.$load_partition_assertions$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == assertion) {
            assertion = partition_missing_assertion_link_error(id);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 83851L)
    public static SubLObject link_partition_assertion(final SubLObject id, final SubLObject cnf, final SubLObject mt, final SubLObject scopeP, final SubLObject direction, final SubLObject vnames) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
            if (partitions.NIL == assertion) {
                if (partitions.NIL == scopeP && partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)partitions.$str174$Non_scope_assertion__S___S__not_f, cnf, mt);
                }
                assertion = link_partition_create_assertion_shell(cnf, mt, vnames, direction);
                note_load_partition_missing_assertion(id, assertion);
            }
            note_load_partition_assertion(id, assertion, scopeP);
            return assertion;
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 84386L)
    public static SubLObject link_partition_create_assertion_shell(final SubLObject cnf, final SubLObject mt, final SubLObject vnames, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            return assertions_high.create_assertion(cnf, mt, vnames, direction, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 84566L)
    public static SubLObject partition_missing_assertion_link_error(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str175$Did_not_find_assertion__D_, id);
        }
        final SubLObject invalid_assertion = assertion_handles.partition_create_invalid_assertion();
        note_load_partition_assertion(id, invalid_assertion, (SubLObject)partitions.NIL);
        note_load_partition_missing_assertion(id, invalid_assertion);
        return invalid_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 85235L)
    public static SubLObject clear_load_partition_kb_hl_supports(final SubLObject total) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!partitions.$load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_kb_hl_supports$.setDynamicValue(Hashtables.make_hash_table(total, Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_kb_hl_supports$.getDynamicValue(thread));
        if (!partitions.$load_partition_scope_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_scope_kb_hl_supports$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(total, (SubLObject)partitions.TEN_INTEGER), Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED), thread);
        }
        if (!partitions.$load_partition_missing_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            partitions.$load_partition_missing_kb_hl_supports$.setDynamicValue(Hashtables.make_hash_table(Numbers.integerDivide(total, (SubLObject)partitions.TEN_INTEGER), Symbols.symbol_function((SubLObject)partitions.EQL), (SubLObject)partitions.UNPROVIDED), thread);
        }
        Hashtables.clrhash(partitions.$load_partition_missing_kb_hl_supports$.getDynamicValue(thread));
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 85898L)
    public static SubLObject gather_load_partition_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.$load_partition_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values(partitions.$load_partition_kb_hl_supports$.getDynamicValue(thread));
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 86093L)
    public static SubLObject gather_load_partition_scope_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.$load_partition_scope_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values(partitions.$load_partition_scope_kb_hl_supports$.getDynamicValue(thread));
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 86306L)
    public static SubLObject gather_load_partition_missing_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.$load_partition_missing_kb_hl_supports$.getDynamicValue(thread).isHashtable()) {
            return hash_table_utilities.hash_table_values(partitions.$load_partition_missing_kb_hl_supports$.getDynamicValue(thread));
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 86525L)
    public static SubLObject note_load_partition_kb_hl_support(final SubLObject id, final SubLObject kb_hl_support, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(id, partitions.$load_partition_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
        if (partitions.NIL != scopeP) {
            Hashtables.sethash(id, partitions.$load_partition_scope_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
        }
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 86808L)
    public static SubLObject note_load_partition_missing_kb_hl_support(final SubLObject id, final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(id, partitions.$load_partition_missing_kb_hl_supports$.getDynamicValue(thread), kb_hl_support);
        return (SubLObject)partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 86991L)
    public static SubLObject partition_find_kb_hl_support_by_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_hl_support = Hashtables.gethash_without_values(id, partitions.$load_partition_kb_hl_supports$.getDynamicValue(thread), (SubLObject)partitions.UNPROVIDED);
        if (partitions.NIL == kb_hl_support) {
            kb_hl_support = partition_missing_kb_hl_support_link_error(id);
        }
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 87264L)
    public static SubLObject link_partition_kb_hl_support(final SubLObject id, final SubLObject hl_support, final SubLObject justification, final SubLObject scopeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            if (partitions.NIL == kb_hl_support) {
                if (partitions.NIL == scopeP && partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)partitions.$str176$Non_scope_KB_HL_support__S_not_fo, hl_support);
                }
                kb_hl_support = link_partition_create_kb_hl_support(hl_support, justification);
                note_load_partition_missing_kb_hl_support(id, kb_hl_support);
            }
            note_load_partition_kb_hl_support(id, kb_hl_support, scopeP);
            return kb_hl_support;
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 87846L)
    public static SubLObject link_partition_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification) {
        return kb_hl_supports_high.find_or_create_kb_hl_support(hl_support, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 87991L)
    public static SubLObject partition_missing_kb_hl_support_link_error(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (partitions.NIL != partitions.$trace_partition_link_errors$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)partitions.$str177$Did_not_find_KB_HL_support__D, id);
        }
        final SubLObject invalid_kb_hl_support = kb_hl_support_handles.partition_create_invalid_kb_hl_support();
        note_load_partition_kb_hl_support(id, invalid_kb_hl_support, (SubLObject)partitions.NIL);
        note_load_partition_missing_kb_hl_support(id, invalid_kb_hl_support);
        return invalid_kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 88393L)
    public static SubLObject link_partition_asserted_argument(final SubLObject assertion, final SubLObject tv, final SubLObject assert_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            SubLObject ans = (SubLObject)partitions.NIL;
            final SubLObject _prev_bind_0_$97 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)partitions.NIL, thread);
                ans = tms.tms_possibly_replace_asserted_argument_with_tv(assertion, tv);
            }
            finally {
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$97, thread);
            }
            if (partitions.NIL != assert_info && partitions.NIL == assertions_low.asserted_assertion_timestampedP(assertion)) {
                final SubLObject who = (SubLObject)(assert_info.isCons() ? assert_info.first() : partitions.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(assert_info, assert_info, (SubLObject)partitions.$list178);
                SubLObject current = assert_info.rest();
                final SubLObject when = (SubLObject)(current.isCons() ? current.first() : partitions.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, assert_info, (SubLObject)partitions.$list178);
                current = current.rest();
                final SubLObject why = (SubLObject)(current.isCons() ? current.first() : partitions.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, assert_info, (SubLObject)partitions.$list178);
                current = current.rest();
                final SubLObject second = (SubLObject)(current.isCons() ? current.first() : partitions.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, assert_info, (SubLObject)partitions.$list178);
                current = current.rest();
                if (partitions.NIL == current) {
                    assertions_high.timestamp_asserted_assertion(assertion, who, when, why, second);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(assert_info, (SubLObject)partitions.$list178);
                }
            }
            return ans;
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 89068L)
    public static SubLObject link_partition_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject)partitions.NIL, thread);
            SubLObject ans = (SubLObject)partitions.NIL;
            final SubLObject _prev_bind_0_$98 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            final SubLObject _prev_bind_1_$99 = argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)partitions.NIL, thread);
                argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.bind((SubLObject)partitions.T, thread);
                ans = tms.tms_add_deduction_for_assertion(assertion, supports, enumeration_types.tv_truth(tv), (SubLObject)partitions.UNPROVIDED, (SubLObject)partitions.UNPROVIDED);
            }
            finally {
                argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.rebind(_prev_bind_1_$99, thread);
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$98, thread);
            }
            return ans;
        }
        finally {
            api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
            api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
            api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 89541L)
    public static SubLObject link_partition_assertible(final SubLObject cnf, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject successP = hl_storage_modules.hl_assert(cnf, mt, strength, direction, variable_map);
        if (partitions.NIL == successP) {
            Errors.warn((SubLObject)partitions.$str179$Could_not_assert__a_in__a_with_st, new SubLObject[] { cnf, mt, strength, direction, variable_map });
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/partitions.lisp", position = 89966L)
    public static SubLObject clear_partition_loader_state() {
        partitions.$load_partition_constants$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_scope_constants$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_missing_constants$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_narts$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_scope_narts$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_missing_narts$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_assertions$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_missing_assertions$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_kb_hl_supports$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_scope_kb_hl_supports$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_missing_kb_hl_supports$.setDynamicValue((SubLObject)partitions.NIL);
        partitions.$load_partition_max_nart_complexity$.setDynamicValue((SubLObject)partitions.ZERO_INTEGER);
        partitions.$load_partition_max_term_order$.setDynamicValue((SubLObject)partitions.ZERO_INTEGER);
        return (SubLObject)partitions.NIL;
    }
    
    public static SubLObject declare_partitions_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_scope_completely_specifiedP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition", "SCOPE-PARTITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_scope_term_p", "PARTITION-SCOPE-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "clear_partition_scope", "CLEAR-PARTITION-SCOPE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_term_spec_to_term", "PARTITION-TERM-SPEC-TO-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_term_spec_to_term_internal", "PARTITION-TERM-SPEC-TO-TERM-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_object_only", "SCOPE-PARTITION-OBJECT-ONLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_assertion", "SCOPE-PARTITION-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_assertion_and_meta_assertions", "SCOPE-PARTITION-ASSERTION-AND-META-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_assertion_selective", "SCOPE-PARTITION-ASSERTION-SELECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_assertion_and_constituents", "SCOPE-PARTITION-ASSERTION-AND-CONSTITUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_term", "SCOPE-PARTITION-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_definition", "SCOPE-PARTITION-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_term_and_narts", "SCOPE-PARTITION-TERM-AND-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_term_in_mt", "SCOPE-PARTITION-TERM-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_rf", "SCOPE-PARTITION-RF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_rf_and_super_rfs", "SCOPE-PARTITION-RF-AND-SUPER-RFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "selected_scope_partition_term", "SELECTED-SCOPE-PARTITION-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_ontology", "SCOPE-PARTITION-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_quoted_ontology", "SCOPE-PARTITION-QUOTED-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "selected_scope_partition_ontology", "SELECTED-SCOPE-PARTITION-ONTOLOGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_arg_index", "SCOPE-PARTITION-ARG-INDEX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_predicate_rule_index", "SCOPE-PARTITION-PREDICATE-RULE-INDEX", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_mt_index", "SCOPE-PARTITION-MT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_other_index", "SCOPE-PARTITION-OTHER-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_deduction", "SCOPE-PARTITION-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_scope", "PARTITION-SCOPE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_forts", "PARTITION-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "scope_partition_term_internal", "SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "selected_scope_partition_term_internal", "SELECTED-SCOPE-PARTITION-TERM-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "clear_partition_content", "CLEAR-PARTITION-CONTENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_estimated_assertion_count", "PARTITION-ESTIMATED-ASSERTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_scope_completely_specified_by_partitionP", "PARTITION-SCOPE-COMPLETELY-SPECIFIED-BY-PARTITION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_content", "MARK-PARTITION-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_bookkeeping_terms", "MARK-PARTITION-BOOKKEEPING-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_terms_mentioned_in_bookkeeping_assertions_of_constant", "MARK-PARTITION-TERMS-MENTIONED-IN-BOOKKEEPING-ASSERTIONS-OF-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object", "MARK-PARTITION-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_cons_method", "MARK-PARTITION-OBJECT-CONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_constant_method", "MARK-PARTITION-OBJECT-CONSTANT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_constant", "MARK-PARTITION-OBJECT-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_nart_method", "MARK-PARTITION-OBJECT-NART-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_nart", "MARK-PARTITION-OBJECT-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_assertion_method", "MARK-PARTITION-OBJECT-ASSERTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_deduction_method", "MARK-PARTITION-OBJECT-DEDUCTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_deduction", "MARK-PARTITION-OBJECT-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_kb_hl_support_method", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_object_kb_hl_support", "MARK-PARTITION-OBJECT-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_assertion_beliefs", "MARK-PARTITION-ASSERTION-BELIEFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "mark_partition_assertion_deduction", "MARK-PARTITION-ASSERTION-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_partition_kb_hl_support_order", "NOTE-PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_kb_hl_support_order", "PARTITION-KB-HL-SUPPORT-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "display_partition_content", "DISPLAY-PARTITION-CONTENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "remove_partition", "REMOVE-PARTITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "remove_scoped_partition", "REMOVE-SCOPED-PARTITION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "make_archive_filename", "MAKE-ARCHIVE-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "archive_assertion_if_local", "ARCHIVE-ASSERTION-IF-LOCAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "archive_term", "ARCHIVE-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "archive_ontology", "ARCHIVE-ONTOLOGY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "archive_partition", "ARCHIVE-PARTITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "remove_partition_term", "REMOVE-PARTITION-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "save_partition", "SAVE-PARTITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "save_partition_to_stream", "SAVE-PARTITION-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "excise_partition_to_stream", "EXCISE-PARTITION-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "save_partition_as_hl_transcript", "SAVE-PARTITION-AS-HL-TRANSCRIPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_spec_to_modification_spec", "PARTITION-SPEC-TO-MODIFICATION-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_common_symbols", "PARTITION-COMMON-SYMBOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_to_stream", "DUMP-PARTITION-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_section_marker", "DUMP-PARTITION-SECTION-MARKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_info", "DUMP-PARTITION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "large_partitionP", "LARGE-PARTITION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_constant_shells", "DUMP-PARTITION-CONSTANT-SHELLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_constant_shell", "DUMP-PARTITION-CONSTANT-SHELL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_nart_shells", "DUMP-PARTITION-NART-SHELLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_nart_shells_at_level", "DUMP-PARTITION-NART-SHELLS-AT-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_nart_level_count", "PARTITION-NART-LEVEL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_nart_shell", "DUMP-PARTITION-NART-SHELL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_assertions", "DUMP-PARTITION-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_simple_assertions", "DUMP-PARTITION-SIMPLE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_meta_assertions", "DUMP-PARTITION-META-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_meta_assertion_order_count", "PARTITION-META-ASSERTION-ORDER-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_assertion", "DUMP-PARTITION-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_kb_hl_supports", "DUMP-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_kb_hl_supports_at_level", "DUMP-PARTITION-KB-HL-SUPPORTS-AT-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_kb_hl_support_level_count", "PARTITION-KB-HL-SUPPORT-LEVEL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_kb_hl_support", "DUMP-PARTITION-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_arguments", "DUMP-PARTITION-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_argument", "DUMP-PARTITION-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_deduction", "DUMP-PARTITION-DEDUCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_beliefs", "DUMP-PARTITION-BELIEFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_belief", "DUMP-PARTITION-BELIEF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_asserted_argument", "DUMP-PARTITION-ASSERTED-ARGUMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_bookkeeping_assertions_for_term", "DUMP-PARTITION-BOOKKEEPING-ASSERTIONS-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "dump_partition_assertible", "DUMP-PARTITION-ASSERTIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_entire_kb_partition", "LOAD-ENTIRE-KB-PARTITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_clean", "LOAD-PARTITION-CLEAN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partitions_clean", "LOAD-PARTITIONS-CLEAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_load_kb_cleanup", "PARTITION-LOAD-KB-CLEANUP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_invalid_missing_terms_count", "PARTITION-INVALID-MISSING-TERMS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_invalid_missing_termP", "LOAD-PARTITION-INVALID-MISSING-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "add_load_partition_invalid_missing_term", "ADD-LOAD-PARTITION-INVALID-MISSING-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition", "LOAD-PARTITION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_from_stream", "LOAD-PARTITION-FROM-STREAM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_info", "LOAD-PARTITION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_formats_compatibleP", "PARTITION-FORMATS-COMPATIBLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_section_marker", "LOAD-PARTITION-SECTION-MARKER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_special_objects", "LOAD-PARTITION-SPECIAL-OBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "reset_sbhl_links_for_partition_forts", "RESET-SBHL-LINKS-FOR-PARTITION-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_constant_shells", "LOAD-PARTITION-CONSTANT-SHELLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_constant_shell", "LOAD-PARTITION-CONSTANT-SHELL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_nart_shells", "LOAD-PARTITION-NART-SHELLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_nart_order_set", "LOAD-PARTITION-NART-ORDER-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_nart_shell", "LOAD-PARTITION-NART-SHELL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_assertions", "LOAD-PARTITION-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_simple_assertions", "LOAD-PARTITION-SIMPLE-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_meta_assertions", "LOAD-PARTITION-META-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_assertion_order_set", "LOAD-PARTITION-ASSERTION-ORDER-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_assertion", "LOAD-PARTITION-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_kb_hl_supports", "LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_kb_hl_support_order_set", "LOAD-PARTITION-KB-HL-SUPPORT-ORDER-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_kb_hl_support", "LOAD-PARTITION-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_arguments", "LOAD-PARTITION-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_argument", "LOAD-PARTITION-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_beliefs", "LOAD-PARTITION-BELIEFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_asserted_argument", "LOAD-PARTITION-ASSERTED-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_deduction", "LOAD-PARTITION-DEDUCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_some_partition_bookkeeping_assertions", "LOAD-SOME-PARTITION-BOOKKEEPING-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_assertible", "LOAD-PARTITION-ASSERTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_possibly_weaken_hl_supports", "LOAD-PARTITION-POSSIBLY-WEAKEN-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "replace_hl_support_module", "REPLACE-HL-SUPPORT-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "clear_load_partition_constants", "CLEAR-LOAD-PARTITION-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "new_load_partition_constants_store", "NEW-LOAD-PARTITION-CONSTANTS-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "new_load_partition_scope_constants_store", "NEW-LOAD-PARTITION-SCOPE-CONSTANTS-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "new_load_paritition_missing_constants_store", "NEW-LOAD-PARITITION-MISSING-CONSTANTS-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_scope_constants", "GATHER-LOAD-PARTITION-SCOPE-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_missing_constants", "GATHER-LOAD-PARTITION-MISSING-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_load_partition_constant", "NOTE-LOAD-PARTITION-CONSTANT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_load_partition_missing_constant", "NOTE-LOAD-PARTITION-MISSING-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_find_constant_by_id", "PARTITION-FIND-CONSTANT-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_missing_constant_link_error", "PARTITION-MISSING-CONSTANT-LINK-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_constant_shell", "LINK-PARTITION-CONSTANT-SHELL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_create_constant", "LINK-PARTITION-CREATE-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_install_constant_id", "LINK-PARTITION-INSTALL-CONSTANT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "preseed_load_partition_constants_store", "PRESEED-LOAD-PARTITION-CONSTANTS-STORE", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.partitions", "with_preseeded_partition_constants", "WITH-PRESEEDED-PARTITION-CONSTANTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "load_partition_from_stream_with_preseeding", "LOAD-PARTITION-FROM-STREAM-WITH-PRESEEDING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_constant_error_1", "LINK-PARTITION-CONSTANT-ERROR-1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_constant_error_2", "LINK-PARTITION-CONSTANT-ERROR-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_constant_error_3", "LINK-PARTITION-CONSTANT-ERROR-3", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_constant_error_4", "LINK-PARTITION-CONSTANT-ERROR-4", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_constant_error_5", "LINK-PARTITION-CONSTANT-ERROR-5", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_constant_error_6", "LINK-PARTITION-CONSTANT-ERROR-6", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_constant_error_7", "LINK-PARTITION-CONSTANT-ERROR-7", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "clear_load_partition_narts", "CLEAR-LOAD-PARTITION-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_scope_narts", "GATHER-LOAD-PARTITION-SCOPE-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_missing_narts", "GATHER-LOAD-PARTITION-MISSING-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_load_partition_nart", "NOTE-LOAD-PARTITION-NART", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_load_partition_missing_nart", "NOTE-LOAD-PARTITION-MISSING-NART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_find_nart_by_id", "PARTITION-FIND-NART-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_nart_shell", "LINK-PARTITION-NART-SHELL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_create_nart_shell", "LINK-PARTITION-CREATE-NART-SHELL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_missing_nart_link_error", "PARTITION-MISSING-NART-LINK-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "clear_load_partition_assertions", "CLEAR-LOAD-PARTITION-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_assertions", "GATHER-LOAD-PARTITION-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_missing_assertions", "GATHER-LOAD-PARTITION-MISSING-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_load_partition_assertion", "NOTE-LOAD-PARTITION-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_load_partition_missing_assertion", "NOTE-LOAD-PARTITION-MISSING-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_find_assertion_by_id", "PARTITION-FIND-ASSERTION-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_assertion", "LINK-PARTITION-ASSERTION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_create_assertion_shell", "LINK-PARTITION-CREATE-ASSERTION-SHELL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_missing_assertion_link_error", "PARTITION-MISSING-ASSERTION-LINK-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "clear_load_partition_kb_hl_supports", "CLEAR-LOAD-PARTITION-KB-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_kb_hl_supports", "GATHER-LOAD-PARTITION-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_scope_kb_hl_supports", "GATHER-LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "gather_load_partition_missing_kb_hl_supports", "GATHER-LOAD-PARTITION-MISSING-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_load_partition_kb_hl_support", "NOTE-LOAD-PARTITION-KB-HL-SUPPORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "note_load_partition_missing_kb_hl_support", "NOTE-LOAD-PARTITION-MISSING-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_find_kb_hl_support_by_id", "PARTITION-FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_kb_hl_support", "LINK-PARTITION-KB-HL-SUPPORT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_create_kb_hl_support", "LINK-PARTITION-CREATE-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "partition_missing_kb_hl_support_link_error", "PARTITION-MISSING-KB-HL-SUPPORT-LINK-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_asserted_argument", "LINK-PARTITION-ASSERTED-ARGUMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_deduction", "LINK-PARTITION-DEDUCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "link_partition_assertible", "LINK-PARTITION-ASSERTIBLE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.partitions", "clear_partition_loader_state", "CLEAR-PARTITION-LOADER-STATE", 0, 0, false);
        return (SubLObject)partitions.NIL;
    }
    
    public static SubLObject init_partitions_file() {
        partitions.$partition_scope_completely_specifiedP$ = SubLFiles.defparameter("*PARTITION-SCOPE-COMPLETELY-SPECIFIED?*", (SubLObject)partitions.NIL);
        partitions.$reset_sbhl_links$ = SubLFiles.defparameter("*RESET-SBHL-LINKS*", (SubLObject)partitions.NIL);
        partitions.$partition_scope_hash$ = SubLFiles.defparameter("*PARTITION-SCOPE-HASH*", (SubLObject)partitions.NIL);
        partitions.$scope_partition_assertion_selective_test$ = SubLFiles.defparameter("*SCOPE-PARTITION-ASSERTION-SELECTIVE-TEST*", (SubLObject)partitions.NIL);
        partitions.$assertion_partition_fort_filter_function$ = SubLFiles.defparameter("*ASSERTION-PARTITION-FORT-FILTER-FUNCTION*", (SubLObject)partitions.NIL);
        partitions.$partition_constant_hash$ = SubLFiles.defparameter("*PARTITION-CONSTANT-HASH*", (SubLObject)partitions.NIL);
        partitions.$partition_nart_hash$ = SubLFiles.defparameter("*PARTITION-NART-HASH*", (SubLObject)partitions.NIL);
        partitions.$partition_assertion_hash$ = SubLFiles.defparameter("*PARTITION-ASSERTION-HASH*", (SubLObject)partitions.NIL);
        partitions.$partition_meta_assertion_hash$ = SubLFiles.defparameter("*PARTITION-META-ASSERTION-HASH*", (SubLObject)partitions.NIL);
        partitions.$partition_kb_hl_support_hash$ = SubLFiles.defparameter("*PARTITION-KB-HL-SUPPORT-HASH*", (SubLObject)partitions.NIL);
        partitions.$partition_argument_hash$ = SubLFiles.defparameter("*PARTITION-ARGUMENT-HASH*", (SubLObject)partitions.NIL);
        partitions.$partition_max_nart_complexity$ = SubLFiles.defparameter("*PARTITION-MAX-NART-COMPLEXITY*", (SubLObject)partitions.NIL);
        partitions.$partition_max_term_order$ = SubLFiles.defparameter("*PARTITION-MAX-TERM-ORDER*", (SubLObject)partitions.NIL);
        partitions.$partition_kb_hl_support_orders$ = SubLFiles.defparameter("*PARTITION-KB-HL-SUPPORT-ORDERS*", (SubLObject)partitions.NIL);
        partitions.$partition_max_kb_hl_support_order$ = SubLFiles.defparameter("*PARTITION-MAX-KB-HL-SUPPORT-ORDER*", (SubLObject)partitions.NIL);
        partitions.$mark_partition_object_method_table$ = SubLFiles.deflexical("*MARK-PARTITION-OBJECT-METHOD-TABLE*", Vectors.make_vector((SubLObject)partitions.$int23$256, (SubLObject)partitions.NIL));
        partitions.$current_archive_stream$ = SubLFiles.defparameter("*CURRENT-ARCHIVE-STREAM*", (SubLObject)partitions.T);
        partitions.$dump_partition_format$ = SubLFiles.defparameter("*DUMP-PARTITION-FORMAT*", (SubLObject)partitions.$str76$2_2);
        partitions.$backwards_compatibility_pairs$ = SubLFiles.defparameter("*BACKWARDS-COMPATIBILITY-PAIRS*", (SubLObject)partitions.$list77);
        partitions.$partition_section_marker$ = SubLFiles.defparameter("*PARTITION-SECTION-MARKER*", (SubLObject)partitions.$kw78$SECTION);
        partitions.$partition_asserted_argument_type_flag$ = SubLFiles.defparameter("*PARTITION-ASSERTED-ARGUMENT-TYPE-FLAG*", (SubLObject)partitions.$kw79$ASSERTED);
        partitions.$partition_special_objects$ = SubLFiles.defparameter("*PARTITION-SPECIAL-OBJECTS*", (SubLObject)ConsesLow.list(partitions.$partition_section_marker$.getDynamicValue(), partitions.$partition_asserted_argument_type_flag$.getDynamicValue()));
        partitions.$partition_entire_kb_loadP$ = SubLFiles.defparameter("*PARTITION-ENTIRE-KB-LOAD?*", (SubLObject)partitions.NIL);
        partitions.$load_partition_invalid_missing_terms$ = SubLFiles.defparameter("*LOAD-PARTITION-INVALID-MISSING-TERMS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_max_nart_complexity$ = SubLFiles.defparameter("*LOAD-PARTITION-MAX-NART-COMPLEXITY*", (SubLObject)partitions.ZERO_INTEGER);
        partitions.$load_partition_max_term_order$ = SubLFiles.defparameter("*LOAD-PARTITION-MAX-TERM-ORDER*", (SubLObject)partitions.ZERO_INTEGER);
        partitions.$load_partition_max_kb_hl_support_order$ = SubLFiles.defparameter("*LOAD-PARTITION-MAX-KB-HL-SUPPORT-ORDER*", (SubLObject)partitions.ZERO_INTEGER);
        partitions.$trace_partition_link_errors$ = SubLFiles.defparameter("*TRACE-PARTITION-LINK-ERRORS*", (SubLObject)partitions.T);
        partitions.$load_partition_weaken_hl_supports$ = SubLFiles.defparameter("*LOAD-PARTITION-WEAKEN-HL-SUPPORTS*", (SubLObject)partitions.NIL);
        partitions.$preseeded_partition_constants$ = SubLFiles.defparameter("*PRESEEDED-PARTITION-CONSTANTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_constants$ = SubLFiles.defparameter("*LOAD-PARTITION-CONSTANTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_scope_constants$ = SubLFiles.defparameter("*LOAD-PARTITION-SCOPE-CONSTANTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_missing_constants$ = SubLFiles.defparameter("*LOAD-PARTITION-MISSING-CONSTANTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_narts$ = SubLFiles.defparameter("*LOAD-PARTITION-NARTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_scope_narts$ = SubLFiles.defparameter("*LOAD-PARTITION-SCOPE-NARTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_missing_narts$ = SubLFiles.defparameter("*LOAD-PARTITION-MISSING-NARTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_assertions$ = SubLFiles.defparameter("*LOAD-PARTITION-ASSERTIONS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_missing_assertions$ = SubLFiles.defparameter("*LOAD-PARTITION-MISSING-ASSERTIONS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_kb_hl_supports$ = SubLFiles.defparameter("*LOAD-PARTITION-KB-HL-SUPPORTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_scope_kb_hl_supports$ = SubLFiles.defparameter("*LOAD-PARTITION-SCOPE-KB-HL-SUPPORTS*", (SubLObject)partitions.NIL);
        partitions.$load_partition_missing_kb_hl_supports$ = SubLFiles.defparameter("*LOAD-PARTITION-MISSING-KB-HL-SUPPORTS*", (SubLObject)partitions.NIL);
        return (SubLObject)partitions.NIL;
    }
    
    public static SubLObject setup_partitions_file() {
        Structures.register_method(partitions.$mark_partition_object_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)partitions.$sym24$MARK_PARTITION_OBJECT_CONS_METHOD));
        Structures.register_method(partitions.$mark_partition_object_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function((SubLObject)partitions.$sym25$MARK_PARTITION_OBJECT_CONSTANT_METHOD));
        Structures.register_method(partitions.$mark_partition_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)partitions.$sym26$MARK_PARTITION_OBJECT_NART_METHOD));
        Structures.register_method(partitions.$mark_partition_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function((SubLObject)partitions.$sym27$MARK_PARTITION_OBJECT_ASSERTION_METHOD));
        Structures.register_method(partitions.$mark_partition_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function((SubLObject)partitions.$sym28$MARK_PARTITION_OBJECT_DEDUCTION_METHOD));
        Structures.register_method(partitions.$mark_partition_object_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function((SubLObject)partitions.$sym29$MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD));
        return (SubLObject)partitions.NIL;
    }
    
    public void declareFunctions() {
        declare_partitions_file();
    }
    
    public void initializeVariables() {
        init_partitions_file();
    }
    
    public void runTopLevelForms() {
        setup_partitions_file();
    }
    
    static {
        me = (SubLFile)new partitions();
        partitions.$partition_scope_completely_specifiedP$ = null;
        partitions.$reset_sbhl_links$ = null;
        partitions.$partition_scope_hash$ = null;
        partitions.$scope_partition_assertion_selective_test$ = null;
        partitions.$assertion_partition_fort_filter_function$ = null;
        partitions.$partition_constant_hash$ = null;
        partitions.$partition_nart_hash$ = null;
        partitions.$partition_assertion_hash$ = null;
        partitions.$partition_meta_assertion_hash$ = null;
        partitions.$partition_kb_hl_support_hash$ = null;
        partitions.$partition_argument_hash$ = null;
        partitions.$partition_max_nart_complexity$ = null;
        partitions.$partition_max_term_order$ = null;
        partitions.$partition_kb_hl_support_orders$ = null;
        partitions.$partition_max_kb_hl_support_order$ = null;
        partitions.$mark_partition_object_method_table$ = null;
        partitions.$current_archive_stream$ = null;
        partitions.$dump_partition_format$ = null;
        partitions.$backwards_compatibility_pairs$ = null;
        partitions.$partition_section_marker$ = null;
        partitions.$partition_asserted_argument_type_flag$ = null;
        partitions.$partition_special_objects$ = null;
        partitions.$partition_entire_kb_loadP$ = null;
        partitions.$load_partition_invalid_missing_terms$ = null;
        partitions.$load_partition_max_nart_complexity$ = null;
        partitions.$load_partition_max_term_order$ = null;
        partitions.$load_partition_max_kb_hl_support_order$ = null;
        partitions.$trace_partition_link_errors$ = null;
        partitions.$load_partition_weaken_hl_supports$ = null;
        partitions.$preseeded_partition_constants$ = null;
        partitions.$load_partition_constants$ = null;
        partitions.$load_partition_scope_constants$ = null;
        partitions.$load_partition_missing_constants$ = null;
        partitions.$load_partition_narts$ = null;
        partitions.$load_partition_scope_narts$ = null;
        partitions.$load_partition_missing_narts$ = null;
        partitions.$load_partition_assertions$ = null;
        partitions.$load_partition_missing_assertions$ = null;
        partitions.$load_partition_kb_hl_supports$ = null;
        partitions.$load_partition_scope_kb_hl_supports$ = null;
        partitions.$load_partition_missing_kb_hl_supports$ = null;
        $list0 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-SPEC"));
        $sym1$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw2$ONTOLOGY = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $kw3$QUOTED_ONTOLOGY = SubLObjectFactory.makeKeyword("QUOTED-ONTOLOGY");
        $kw4$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw5$DEFINITION = SubLObjectFactory.makeKeyword("DEFINITION");
        $kw6$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $list7 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $str8$Unknown_scope_partition_function_ = SubLObjectFactory.makeString("Unknown scope partition function ~S");
        $kw9$ESTIMATED_ASSERTION_COUNT = SubLObjectFactory.makeKeyword("ESTIMATED-ASSERTION-COUNT");
        $kw10$SCOPE_COMPLETELY_SPECIFIED_ = SubLObjectFactory.makeKeyword("SCOPE-COMPLETELY-SPECIFIED?");
        $str11$Unable_to_scope_partition_via__S_ = SubLObjectFactory.makeString("Unable to scope partition via ~S partition spec");
        $int12$100 = SubLObjectFactory.makeInteger(100);
        $str13$Non_scope_object__A_not_allowed_ = SubLObjectFactory.makeString("Non-scope object ~A not allowed.");
        $sym14$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const15$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw16$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const17$ResearchCycDefinitionalPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchCycDefinitionalPredicate"));
        $sym18$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $sym19$SCOPE_PARTITION_ASSERTION = SubLObjectFactory.makeSymbol("SCOPE-PARTITION-ASSERTION");
        $sym20$SCOPE_PARTITION_TERM = SubLObjectFactory.makeSymbol("SCOPE-PARTITION-TERM");
        $sym21$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str22$marking_partition_content = SubLObjectFactory.makeString("marking partition content");
        $int23$256 = SubLObjectFactory.makeInteger(256);
        $sym24$MARK_PARTITION_OBJECT_CONS_METHOD = SubLObjectFactory.makeSymbol("MARK-PARTITION-OBJECT-CONS-METHOD");
        $sym25$MARK_PARTITION_OBJECT_CONSTANT_METHOD = SubLObjectFactory.makeSymbol("MARK-PARTITION-OBJECT-CONSTANT-METHOD");
        $sym26$MARK_PARTITION_OBJECT_NART_METHOD = SubLObjectFactory.makeSymbol("MARK-PARTITION-OBJECT-NART-METHOD");
        $sym27$MARK_PARTITION_OBJECT_ASSERTION_METHOD = SubLObjectFactory.makeSymbol("MARK-PARTITION-OBJECT-ASSERTION-METHOD");
        $sym28$MARK_PARTITION_OBJECT_DEDUCTION_METHOD = SubLObjectFactory.makeSymbol("MARK-PARTITION-OBJECT-DEDUCTION-METHOD");
        $sym29$MARK_PARTITION_OBJECT_KB_HL_SUPPORT_METHOD = SubLObjectFactory.makeSymbol("MARK-PARTITION-OBJECT-KB-HL-SUPPORT-METHOD");
        $sym30$BELIEF_P = SubLObjectFactory.makeSymbol("BELIEF-P");
        $str31$_______S_constants = SubLObjectFactory.makeString("~%;;; ~S constants");
        $str32$___A_S = SubLObjectFactory.makeString("~%~A~S");
        $str33$___ = SubLObjectFactory.makeString("(*)");
        $str34$___ = SubLObjectFactory.makeString("   ");
        $str35$______Max_NART_level____S = SubLObjectFactory.makeString("~%;;; Max NART level : ~S");
        $str36$______level__S_NARTs = SubLObjectFactory.makeString("~%;;; level ~S NARTs");
        $str37$______Max_term_order___S = SubLObjectFactory.makeString("~%;;; Max term order: ~S");
        $str38$_______S_assertions = SubLObjectFactory.makeString("~%;;; ~S assertions");
        $str39$_______S_meta_assertions = SubLObjectFactory.makeString("~%;;; ~S meta-assertions");
        $str40$______order__S_meta_assertions = SubLObjectFactory.makeString("~%;;; order ~S meta-assertions");
        $str41$_______S_arguments = SubLObjectFactory.makeString("~%;;; ~S arguments");
        $str42$Deduction______S = SubLObjectFactory.makeString("Deduction   : ~S");
        $str43$Beliefs_for____S = SubLObjectFactory.makeString("Beliefs for : ~S");
        $str44$Unknown________S = SubLObjectFactory.makeString("Unknown (?) : ~S");
        $str45$______Max_KB_HL_support_level____ = SubLObjectFactory.makeString("~%;;; Max KB HL support level : ~S");
        $str46$_______S_KB_HL_supports = SubLObjectFactory.makeString("~%;;; ~S KB HL supports");
        $str47$______level__S_KB_HL_supports = SubLObjectFactory.makeString("~%;;; level ~S KB HL supports");
        $str48$removing_partition_assertions = SubLObjectFactory.makeString("removing partition assertions");
        $str49$removing_partition_NARTs = SubLObjectFactory.makeString("removing partition NARTs");
        $str50$removing_partition_constants = SubLObjectFactory.makeString("removing partition constants");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("units"), (SubLObject)SubLObjectFactory.makeString("archive"));
        $str52$lisp = SubLObjectFactory.makeString("lisp");
        $sym53$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str54$_____FI_ASSERT___S__S__S__S_ = SubLObjectFactory.makeString("~%~%(FI-ASSERT '~S ~S ~S ~S)");
        $str55$_____FI_CREATE__a_ = SubLObjectFactory.makeString("~%~%(FI-CREATE ~a)");
        $sym56$ARCHIVE_ASSERTION_IF_LOCAL = SubLObjectFactory.makeSymbol("ARCHIVE-ASSERTION-IF-LOCAL");
        $kw57$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str58$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str59$______Archive_saved_at__s____ = SubLObjectFactory.makeString("~%;;; Archive saved at ~s~%~%");
        $sym60$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw61$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $sym62$CFASL_ENCODABLE_STREAM_P = SubLObjectFactory.makeSymbol("CFASL-ENCODABLE-STREAM-P");
        $kw63$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym64$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym65$_ = SubLObjectFactory.makeSymbol("<");
        $sym66$CONSTANT_INTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $sym67$NART_ID = SubLObjectFactory.makeSymbol("NART-ID");
        $sym68$TERM_FUNCTIONAL_COMPLEXITY = SubLObjectFactory.makeSymbol("TERM-FUNCTIONAL-COMPLEXITY");
        $sym69$TERM_ORDER = SubLObjectFactory.makeSymbol("TERM-ORDER");
        $sym70$DEDUCTION_ID = SubLObjectFactory.makeSymbol("DEDUCTION-ID");
        $sym71$KB_HL_SUPPORT_ID = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-ID");
        $kw72$NEW_CONSTANTS = SubLObjectFactory.makeKeyword("NEW-CONSTANTS");
        $kw73$NEW_NARTS = SubLObjectFactory.makeKeyword("NEW-NARTS");
        $kw74$NEW_ASSERTIONS = SubLObjectFactory.makeKeyword("NEW-ASSERTIONS");
        $kw75$NEW_DEDUCTIONS = SubLObjectFactory.makeKeyword("NEW-DEDUCTIONS");
        $str76$2_2 = SubLObjectFactory.makeString("2.2");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.1"), (SubLObject)SubLObjectFactory.makeString("2.1.2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.1"), (SubLObject)SubLObjectFactory.makeString("2.2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.1.2"), (SubLObject)SubLObjectFactory.makeString("2.2")));
        $kw78$SECTION = SubLObjectFactory.makeKeyword("SECTION");
        $kw79$ASSERTED = SubLObjectFactory.makeKeyword("ASSERTED");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("PATCH-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("BRANCH-SPECIFICS"));
        $float81$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $str82$_large__partition_constant_shells = SubLObjectFactory.makeString("(large) partition constant shells");
        $kw83$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str84$partition_constant_shells = SubLObjectFactory.makeString("partition constant shells");
        $str85$partition_level_ = SubLObjectFactory.makeString("partition level ");
        $str86$_NART_shells = SubLObjectFactory.makeString(" NART shells");
        $str87$_large__ = SubLObjectFactory.makeString("(large) ");
        $str88$_large__partition_assertions = SubLObjectFactory.makeString("(large) partition assertions");
        $str89$partition_assertions = SubLObjectFactory.makeString("partition assertions");
        $str90$partition_order_ = SubLObjectFactory.makeString("partition order ");
        $str91$_meta_assertions = SubLObjectFactory.makeString(" meta assertions");
        $str92$_KB_HL_supports = SubLObjectFactory.makeString(" KB HL supports");
        $str93$_large__partition_beliefs = SubLObjectFactory.makeString("(large) partition beliefs");
        $str94$_large__partition_deductions = SubLObjectFactory.makeString("(large) partition deductions");
        $str95$_large__partition_bookkeeping_inf = SubLObjectFactory.makeString("(large) partition bookkeeping info");
        $str96$partition_arguments = SubLObjectFactory.makeString("partition arguments");
        $str97$Unknown_argument_object__S = SubLObjectFactory.makeString("Unknown argument object ~S");
        $str98$Unable_to_dump_belief__S = SubLObjectFactory.makeString("Unable to dump belief ~S");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP"));
        $str100$cleaning_up_after_partition_load_ = SubLObjectFactory.makeString("cleaning up after partition load...~%");
        $const101$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym102$LOAD_PARTITION_INVALID_MISSING_TERM_ = SubLObjectFactory.makeSymbol("LOAD-PARTITION-INVALID-MISSING-TERM?");
        $str103$partition_load_KB_cleanup_removed = SubLObjectFactory.makeString("partition load KB cleanup removed:~%");
        $str104$__A_constants__ = SubLObjectFactory.makeString(" ~A constants~%");
        $str105$__A_NARTs__ = SubLObjectFactory.makeString(" ~A NARTs~%");
        $str106$__A_assertions__ = SubLObjectFactory.makeString(" ~A assertions~%");
        $kw107$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $sym108$PARTITION_FIND_CONSTANT_BY_ID = SubLObjectFactory.makeSymbol("PARTITION-FIND-CONSTANT-BY-ID");
        $sym109$PARTITION_FIND_NART_BY_ID = SubLObjectFactory.makeSymbol("PARTITION-FIND-NART-BY-ID");
        $sym110$PARTITION_FIND_ASSERTION_BY_ID = SubLObjectFactory.makeSymbol("PARTITION-FIND-ASSERTION-BY-ID");
        $sym111$PARTITION_FIND_KB_HL_SUPPORT_BY_ID = SubLObjectFactory.makeSymbol("PARTITION-FIND-KB-HL-SUPPORT-BY-ID");
        $sym112$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $sym113$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str114$partition_format_is__A__not__A__a = SubLObjectFactory.makeString("partition format is ~A, not ~A, and these versions are incompatible");
        $kw115$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str116$malformed_partition_file = SubLObjectFactory.makeString("malformed partition file");
        $str117$loading_partition_constant_shells = SubLObjectFactory.makeString("loading partition constant shells");
        $sym118$GUID_P = SubLObjectFactory.makeSymbol("GUID-P");
        $str119$loading_partition_level_ = SubLObjectFactory.makeString("loading partition level ");
        $str120$_narts = SubLObjectFactory.makeString(" narts");
        $sym121$POSSIBLY_NAUT_P = SubLObjectFactory.makeSymbol("POSSIBLY-NAUT-P");
        $str122$loading_partition_assertions = SubLObjectFactory.makeString("loading partition assertions");
        $str123$loading_partition_order_ = SubLObjectFactory.makeString("loading partition order ");
        $str124$_meta_assertions = SubLObjectFactory.makeString(" meta-assertions");
        $str125$Skipping_assertion_with_bad_id__A = SubLObjectFactory.makeString("Skipping assertion with bad id=~A (scope-term?=~S cnf=~S mt=~S direction=~A vnames=~S).");
        $str126$Skipping_assertion_with_bad_cnf__ = SubLObjectFactory.makeString("Skipping assertion with bad cnf=~S (id=~A scope-term?=~S mt=~S direction=~A vnames=~S).");
        $str127$Skipping_assertion_with_bad_mt__S = SubLObjectFactory.makeString("Skipping assertion with bad mt=~S (id=~A scope-term?=~S cnf=~S direction=~A vnames=~S).");
        $str128$Skipping_assertion_with_bad_direc = SubLObjectFactory.makeString("Skipping assertion with bad direction=~A (id=~A scope-term?=~S cnf=~S mt=~S vnames=~S).");
        $str129$Skipping_assertion_with_bad_vname = SubLObjectFactory.makeString("Skipping assertion with bad vnames=~S (id=~A scope-term?=~S cnf=~S mt=~S direction=~A).");
        $sym130$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)partitions.NIL);
        $sym132$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym133$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str134$_A = SubLObjectFactory.makeString("~A");
        $kw135$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym136$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym137$HL_SUPPORT_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $sym138$HL_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P");
        $str139$loading_partition_arguments = SubLObjectFactory.makeString("loading partition arguments");
        $str140$Skipping_asserted_argument_for_ba = SubLObjectFactory.makeString("Skipping asserted argument for bad assertion = ~S");
        $str141$Skipping_asserted_argument_for_as = SubLObjectFactory.makeString("Skipping asserted argument for assertion (id=~A) with bad tv = ~S (assertion=~S).");
        $str142$Skipping_asserted_argument_for_as = SubLObjectFactory.makeString("Skipping asserted argument for assertion (id=~A) with bad assert info = ~S (assertion=~S).");
        $str143$Skipping_deduction__id__A__with_b = SubLObjectFactory.makeString("Skipping deduction (id=~A) with bad tv = ~S (assertion=~S supports=~S).");
        $str144$Skipping_deduction__id__A__with_b = SubLObjectFactory.makeString("Skipping deduction (id=~A) with bad assertion = ~S (tv=~S supports=~S).");
        $str145$Skipping_deduction__id__A__with_b = SubLObjectFactory.makeString("Skipping deduction (id=~A) with bad supports = ~S (tv=~S assertion=~S).");
        $sym146$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
        $sym147$POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P");
        $sym148$EL_STRENGTH_P = SubLObjectFactory.makeSymbol("EL-STRENGTH-P");
        $sym149$DIRECTION_P = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $sym150$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str151$Did_not_find_constant__D_ = SubLObjectFactory.makeString("Did not find constant ~D.");
        $sym152$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym153$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list154 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRE-SEEDING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPECTED-TOTAL"), (SubLObject)SubLObjectFactory.makeInteger(100)), (SubLObject)SubLObjectFactory.makeSymbol("SCOPED-MAP")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPED-MAP"));
        $kw156$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw157$EXPECTED_TOTAL = SubLObjectFactory.makeKeyword("EXPECTED-TOTAL");
        $kw158$SCOPED_MAP = SubLObjectFactory.makeKeyword("SCOPED-MAP");
        $sym159$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PRESEEDED-PARTITION-CONSTANTS*"), (SubLObject)partitions.T);
        $sym161$_LOAD_PARTITION_CONSTANTS_ = SubLObjectFactory.makeSymbol("*LOAD-PARTITION-CONSTANTS*");
        $sym162$NEW_LOAD_PARTITION_CONSTANTS_STORE = SubLObjectFactory.makeSymbol("NEW-LOAD-PARTITION-CONSTANTS-STORE");
        $sym163$_LOAD_PARTITION_SCOPE_CONSTANTS_ = SubLObjectFactory.makeSymbol("*LOAD-PARTITION-SCOPE-CONSTANTS*");
        $sym164$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym165$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $sym166$NEW_LOAD_PARTITION_SCOPE_CONSTANTS_STORE = SubLObjectFactory.makeSymbol("NEW-LOAD-PARTITION-SCOPE-CONSTANTS-STORE");
        $sym167$PRESEED_LOAD_PARTITION_CONSTANTS_STORE = SubLObjectFactory.makeSymbol("PRESEED-LOAD-PARTITION-CONSTANTS-STORE");
        $str168$NAME_change_for__S___new_name_is_ = SubLObjectFactory.makeString("NAME change for ~S ; new name is ~S");
        $str169$installing_ID__S_for__S = SubLObjectFactory.makeString("installing ID ~S for ~S");
        $str170$NAME_clash_for__S___renaming_to__ = SubLObjectFactory.makeString("NAME clash for ~S ; renaming to ~S");
        $str171$Constant_with_NAME__S_and_ID__S_m = SubLObjectFactory.makeString("Constant with NAME ~S and ID ~S missing");
        $str172$Non_scope_NART__S_not_found_ = SubLObjectFactory.makeString("Non-scope NART ~S not found.");
        $str173$Did_not_find_NART__D_ = SubLObjectFactory.makeString("Did not find NART ~D.");
        $str174$Non_scope_assertion__S___S__not_f = SubLObjectFactory.makeString("Non-scope assertion ~S (~S) not found.");
        $str175$Did_not_find_assertion__D_ = SubLObjectFactory.makeString("Did not find assertion ~D.");
        $str176$Non_scope_KB_HL_support__S_not_fo = SubLObjectFactory.makeString("Non-scope KB HL support ~S not found.");
        $str177$Did_not_find_KB_HL_support__D = SubLObjectFactory.makeString("Did not find KB HL support ~D");
        $list178 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHO"), (SubLObject)SubLObjectFactory.makeSymbol("WHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WHY"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"));
        $str179$Could_not_assert__a_in__a_with_st = SubLObjectFactory.makeString("Could not assert ~a in ~a with strength ~s and direction ~s and variable-map ~s");
    }
}

/*

	Total time: 2114 ms
	
*/