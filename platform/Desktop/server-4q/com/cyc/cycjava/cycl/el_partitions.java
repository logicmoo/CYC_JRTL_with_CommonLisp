package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class el_partitions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.el_partitions";
    public static final String myFingerPrint = "dd5356a0ed437d6abb178de9da8071b2d38625c576c60b83444be2875200cb17";
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 993L)
    public static SubLSymbol $default_pickling_stream_buffer_size$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 2710L)
    public static SubLSymbol $pickling_stream_buffer_size$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 29320L)
    public static SubLSymbol $pickled_kb_comparison_strategy$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLSymbol $dtp_elpart_as_desc$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 56636L)
    private static SubLSymbol $debug_scan_enumerateP$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLSymbol $dtp_el_partition_data_sink$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75138L)
    public static SubLSymbol $el_partition_creator_override$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75343L)
    public static SubLSymbol $el_partition_creation_purpose_override$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75489L)
    public static SubLSymbol $el_partition_mt_override$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75619L)
    public static SubLSymbol $el_partition_direction_override$;
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85181L)
    private static SubLSymbol $transcript_marker_guest_cyclist$;
    private static final SubLInteger $int0$1024;
    private static final SubLSymbol $sym1$WITH_STREAM_BUFFER_SIZE;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$CURR;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym8$PROGN;
    private static final SubLSymbol $sym9$CINC;
    private static final SubLSymbol $sym10$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym11$HL_PROTOTYPICAL_INSTANCE_;
    private static final SubLSymbol $sym12$PICKLE_CONSTANTS;
    private static final SubLString $str13$Pickling_constants_to_;
    private static final SubLString $str14$_____;
    private static final SubLSymbol $kw15$OUTPUT;
    private static final SubLString $str16$Unable_to_open__S;
    private static final SubLSymbol $sym17$STRINGP;
    private static final SubLSymbol $kw18$SKIP;
    private static final SubLSymbol $sym19$DO_PICKLED_CONSTANTS;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw23$MESSAGE;
    private static final SubLSymbol $sym24$STREAM;
    private static final SubLSymbol $sym25$COUNT;
    private static final SubLSymbol $sym26$MSG;
    private static final SubLSymbol $sym27$WITH_PICKLING_STREAM_BUFFER_SIZE;
    private static final SubLSymbol $sym28$WITH_PRIVATE_BINARY_FILE;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$CFASL_INPUT;
    private static final SubLSymbol $sym31$FIF;
    private static final SubLSymbol $sym32$NULL;
    private static final SubLSymbol $sym33$FORMAT_NIL;
    private static final SubLString $str34$Reading_pickled_constants_from__A;
    private static final SubLSymbol $sym35$WITH_PICKLING_PACFICIATION;
    private static final SubLSymbol $sym36$CDO;
    private static final SubLSymbol $sym37$MUST;
    private static final SubLSymbol $sym38$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str39$Read_invalid_SUID__A_from__A_;
    private static final SubLString $str40$Read_invalid_NAME__A_from__A_;
    private static final SubLSymbol $sym41$GUID_P;
    private static final SubLString $str42$Read_invalid_GUID__A_from__A_;
    private static final SubLSymbol $sym43$PICKLE_ASSERTIONS;
    private static final SubLString $str44$Pickling_assertions_to_file_vecto;
    private static final SubLString $str45$_index_cfasl;
    private static final SubLString $str46$_cfasl;
    private static final SubLSymbol $sym47$ASSERTION_TO_PICKLING_FORMAT;
    private static final SubLSymbol $sym48$CONVERT_GUID_TO_PICKLING_FORMAT;
    private static final SubLSymbol $sym49$UNPICKLE_ASSERTION_PICKLING_FORMAT;
    private static final SubLSymbol $sym50$PICKLED_GUID_FORMAT_P;
    private static final SubLSymbol $sym51$RESTORE_GUID_FROM_PICKLING_FORMAT;
    private static final SubLSymbol $kw52$GUID;
    private static final SubLList $list53;
    private static final SubLString $str54$Cannot_restore__A_____not_a_pickl;
    private static final SubLSymbol $sym55$NEW_RELEVANT_ASSERTIONS_ID_SPACE;
    private static final SubLString $str56$Computing_EL_Partition_relevant_a;
    private static final SubLString $str57$Whoa__we_underflowed_the_ID_space;
    private static final SubLSymbol $sym58$COMPARE_PICKLED_KB_TO_CURRENT_KB;
    private static final SubLSymbol $sym59$ENUMERATE_ADDITIONS_TO_CURRENT_KB;
    private static final SubLString $str60$Enumerating_new_constants_____;
    private static final SubLString $str61$Enumerating_new_assertions_____;
    private static final SubLSymbol $sym62$EL_PARTITION_DATA_SINK_P;
    private static final SubLSymbol $sym63$EL_PARTITION_RELEVANT_CONSTANT_;
    private static final SubLSymbol $kw64$DONE;
    private static final SubLSymbol $kw65$INPUT;
    private static final SubLString $str66$Reading_pickled_constants_from_;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$CSETQ;
    private static final SubLSymbol $sym69$ITERATION_NEXT_WITHOUT_VALUES;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$FWHEN;
    private static final SubLSymbol $sym72$ASSERTION_P;
    private static final SubLSymbol $sym73$TL_ENCAPSULATE;
    private static final SubLSymbol $sym74$ASSERTION_TL_IST_FORMULA;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$CDEC;
    private static final SubLSymbol $sym77$UNTIL;
    private static final SubLSymbol $sym78$EL_PARTITION_RELEVANT_ASSERTION_;
    private static final SubLSymbol $sym79$FIND_ASSERTION_BY_ID;
    private static final SubLString $str80$Implementation_error__Tip_index__;
    private static final SubLString $str81$Implementation_error__branch_inde;
    private static final SubLString $str82$Implementation_error__tip_index_u;
    private static final SubLSymbol $kw83$NOT_FOUND;
    private static final SubLSymbol $kw84$SHARED_ASSERTION;
    private static final SubLSymbol $kw85$BRANCH_AS_ID;
    private static final SubLSymbol $kw86$BRANCH_INDEX;
    private static final SubLSymbol $kw87$BRANCH_COUNT;
    private static final SubLSymbol $kw88$JUST_ASSERTED_P;
    private static final SubLSymbol $kw89$SCAN_FORWARD_STEADY;
    private static final SubLSymbol $kw90$CLASSIC_BACKWARD;
    private static final SubLSymbol $kw91$NOVEL_FORWARD;
    private static final SubLSymbol $kw92$SCAN_FORWARD_FAST;
    private static final SubLString $str93$Pickled_KB_Comparison_Strategy__S;
    private static final SubLString $str94$Analyzing_;
    private static final SubLString $str95$_new_assertions_____;
    private static final SubLString $str96$This_algorithm_is_not_designed_to;
    private static final SubLSymbol $sym97$ELPART_AS_DESC;
    private static final SubLSymbol $sym98$ELPART_AS_DESC_P;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$PRINT_ELPART_AS_DESC;
    private static final SubLSymbol $sym104$ELPART_AS_DESC_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$ELPART_AS_DESC_ID;
    private static final SubLSymbol $sym107$_CSETF_ELPART_AS_DESC_ID;
    private static final SubLSymbol $sym108$ELPART_AS_DESC_TL_IST_FORMULA;
    private static final SubLSymbol $sym109$_CSETF_ELPART_AS_DESC_TL_IST_FORMULA;
    private static final SubLSymbol $sym110$ELPART_AS_DESC_HASH;
    private static final SubLSymbol $sym111$_CSETF_ELPART_AS_DESC_HASH;
    private static final SubLSymbol $sym112$ELPART_AS_DESC_EXTRA;
    private static final SubLSymbol $sym113$_CSETF_ELPART_AS_DESC_EXTRA;
    private static final SubLSymbol $sym114$ELPART_AS_DESC_WEAK_IST_FORMULA;
    private static final SubLSymbol $sym115$_CSETF_ELPART_AS_DESC_WEAK_IST_FORMULA;
    private static final SubLSymbol $kw116$ID;
    private static final SubLSymbol $kw117$TL_IST_FORMULA;
    private static final SubLSymbol $kw118$HASH;
    private static final SubLSymbol $kw119$EXTRA;
    private static final SubLSymbol $kw120$WEAK_IST_FORMULA;
    private static final SubLString $str121$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw122$BEGIN;
    private static final SubLSymbol $sym123$MAKE_ELPART_AS_DESC;
    private static final SubLSymbol $kw124$SLOT;
    private static final SubLSymbol $kw125$END;
    private static final SubLSymbol $sym126$VISIT_DEFSTRUCT_OBJECT_ELPART_AS_DESC_METHOD;
    private static final SubLString $str127$_id__;
    private static final SubLString $str128$_hc__;
    private static final SubLString $str129$_AS_ID__;
    private static final SubLString $str130$_FVecInx__;
    private static final SubLString $str131$_xtr__;
    private static final SubLString $str132$_;
    private static final SubLString $str133$_assertions_____;
    private static final SubLString $str134$Not_yet_implemented_;
    private static final SubLString $str135$Mhm__only__A_gaps_across_all_asse;
    private static final SubLString $str136$Finding_start_of_relevant_asserti;
    private static final SubLString $str137$_assertion_gaps_____;
    private static final SubLString $str138$Error_realigning_BRANCH___A__now_;
    private static final SubLList $list139;
    private static final SubLSymbol $sym140$ENUMMISS_TL_HP_NOTATION;
    private static final SubLSymbol $kw141$HP;
    private static final SubLString $str142$Sorry__FAST_is_currently_not_impl;
    private static final SubLString $str143$_branch_assertions_____;
    private static final SubLSymbol $kw144$BOTH_INVALID;
    private static final SubLSymbol $kw145$INVALID_BRANCH;
    private static final SubLSymbol $kw146$INVALID_TIP;
    private static final SubLSymbol $kw147$DIFFERENT;
    private static final SubLSymbol $kw148$EQUAL;
    private static final SubLString $str149$Unknown_state__A____do_not_know_w;
    private static final SubLSymbol $sym150$TEST_EL_PARTITION_SIMPLE_SCAN_ALGORITHM;
    private static final SubLSymbol $kw151$TEST;
    private static final SubLSymbol $kw152$OWNER;
    private static final SubLSymbol $kw153$CLASSES;
    private static final SubLSymbol $kw154$KB;
    private static final SubLSymbol $kw155$TINY;
    private static final SubLSymbol $kw156$WORKING_;
    private static final SubLObject $list157;
    private static final SubLSymbol $kw158$INVALID;
    private static final SubLString $str159$Someone_is_whaffling_____;
    private static final SubLSymbol $kw160$CREATE;
    private static final SubLSymbol $kw161$DELETE;
    private static final SubLSymbol $sym162$TEST_RANDOM_EL_PARTITION_SIMPLE_SCAN_CASES;
    private static final SubLList $list163;
    private static final SubLString $str164$Expected__A__got__A_instead_;
    private static final SubLSymbol $kw165$OK;
    private static final SubLSymbol $sym166$EL_PARTITION_DATA_SINK;
    private static final SubLList $list167;
    private static final SubLList $list168;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLSymbol $sym171$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym172$EL_PARTITION_DATA_SINK_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$ELPART_DSINK_STATE;
    private static final SubLSymbol $sym175$_CSETF_ELPART_DSINK_STATE;
    private static final SubLSymbol $sym176$ELPART_DSINK_BRANCH_CDEL_FN;
    private static final SubLSymbol $sym177$_CSETF_ELPART_DSINK_BRANCH_CDEL_FN;
    private static final SubLSymbol $sym178$ELPART_DSINK_BRANCH_ASDEL_FN;
    private static final SubLSymbol $sym179$_CSETF_ELPART_DSINK_BRANCH_ASDEL_FN;
    private static final SubLSymbol $sym180$ELPART_DSINK_TIP_CCREATE_FN;
    private static final SubLSymbol $sym181$_CSETF_ELPART_DSINK_TIP_CCREATE_FN;
    private static final SubLSymbol $sym182$ELPART_DSINK_TIP_ASCREATE_FN;
    private static final SubLSymbol $sym183$_CSETF_ELPART_DSINK_TIP_ASCREATE_FN;
    private static final SubLSymbol $sym184$ELPART_DSINK_TIP_ASREASSERT_FN;
    private static final SubLSymbol $sym185$_CSETF_ELPART_DSINK_TIP_ASREASSERT_FN;
    private static final SubLSymbol $kw186$STATE;
    private static final SubLSymbol $kw187$BRANCH_CDEL_FN;
    private static final SubLSymbol $kw188$BRANCH_ASDEL_FN;
    private static final SubLSymbol $kw189$TIP_CCREATE_FN;
    private static final SubLSymbol $kw190$TIP_ASCREATE_FN;
    private static final SubLSymbol $kw191$TIP_ASREASSERT_FN;
    private static final SubLSymbol $sym192$MAKE_EL_PARTITION_DATA_SINK;
    private static final SubLSymbol $sym193$VISIT_DEFSTRUCT_OBJECT_EL_PARTITION_DATA_SINK_METHOD;
    private static final SubLSymbol $sym194$NOTE_EL_PARTITION_BRANCH_CONSTANT_DELETE;
    private static final SubLSymbol $sym195$NOTE_EL_PARTITION_BRANCH_ASSERTION_DELETE;
    private static final SubLSymbol $sym196$NOTE_EL_PARTITION_TIP_CONSTANT_CREATE;
    private static final SubLSymbol $sym197$NOTE_EL_PARTITION_TIP_ASSERTION_CREATE;
    private static final SubLSymbol $sym198$NOTE_EL_PARTITION_TIP_ASSERTION_REASSERT;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$_EL_PARTITION_CREATOR_OVERRIDE_;
    private static final SubLList $list201;
    private static final SubLSymbol $sym202$_EL_PARTITION_CREATION_PURPOSE_OVERRIDE_;
    private static final SubLList $list203;
    private static final SubLSymbol $sym204$_EL_PARTITION_MT_OVERRIDE_;
    private static final SubLList $list205;
    private static final SubLSymbol $sym206$_EL_PARTITION_DIRECTION_OVERRIDE_;
    private static final SubLList $list207;
    private static final SubLSymbol $sym208$TRANSCRIPT_DATA_SINK_BRANCH_CONSTANT_DELETE;
    private static final SubLSymbol $sym209$TRANSCRIPT_DATA_SINK_BRANCH_ASSERTION_DELETE;
    private static final SubLSymbol $sym210$TRANSCRIPT_DATA_SINK_TIP_CONSTANT_CREATE;
    private static final SubLSymbol $sym211$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_CREATE;
    private static final SubLSymbol $sym212$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_REASSERT;
    private static final SubLString $str213$_FI_KILL____HP__S__S__;
    private static final SubLString $str214$_FI_UNASSERT___S___S_;
    private static final SubLString $str215$_FI_CREATE___S__S_;
    private static final SubLString $str216$_FI_ASSERT___S___S___S___S_;
    private static final SubLString $str217$_FI_REASSERT___S___S___S___S_;
    private static final SubLString $str218$_FI_TIMESTAMP_CONSTANT___S___S___;
    private static final SubLString $str219$_FI_TIMESTAMP_ASSERTION___S___S__;
    private static final SubLList $list220;
    private static final SubLString $str221$_;
    private static final SubLString $str222$_;
    private static final SubLSymbol $sym223$DEBUG_DATA_SINK_BRANCH_CONSTANT_DELETE;
    private static final SubLSymbol $sym224$DEBUG_DATA_SINK_BRANCH_ASSERTION_DELETE;
    private static final SubLSymbol $sym225$DEBUG_DATA_SINK_TIP_CONSTANT_CREATE;
    private static final SubLSymbol $sym226$DEBUG_DATA_SINK_TIP_ASSERTION_CREATE;
    private static final SubLSymbol $sym227$DEBUG_DATA_SINK_TIP_ASSERTION_REASSERT;
    private static final SubLString $str228$___kill__A__A__;
    private static final SubLString $str229$___unassert__A__;
    private static final SubLString $str230$___create__A__A__;
    private static final SubLString $str231$___assert__A__;
    private static final SubLString $str232$___reassert__A__A__A__;
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 2898L)
    public static SubLObject with_pickling_stream_buffer_size(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)el_partitions.$sym1$WITH_STREAM_BUFFER_SIZE, (SubLObject)el_partitions.$list2, ConsesLow.append(body, (SubLObject)el_partitions.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 3113L)
    public static SubLObject with_pickling_pacficiation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject total = (SubLObject)el_partitions.NIL;
        SubLObject message = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list3);
        total = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list3);
        message = current.first();
        current = current.rest();
        if (el_partitions.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject curr = (SubLObject)el_partitions.$sym4$CURR;
            return (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym5$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(curr, (SubLObject)el_partitions.$list6)), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym7$NOTING_PERCENT_PROGRESS, message, reader.bq_cons((SubLObject)el_partitions.$sym8$PROGN, ConsesLow.append(body, (SubLObject)el_partitions.NIL)), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym9$CINC, curr), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym10$NOTE_PERCENT_PROGRESS, curr, total)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list3);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 3489L)
    public static SubLObject el_partition_relevant_constantP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(el_partitions.NIL != constant_handles.constant_p(v_term) && el_partitions.NIL == hl_prototypes.hl_prototypical_instanceP(v_term) && el_partitions.NIL == fort_types_interface.skolem_function_p(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 4132L)
    public static SubLObject el_partition_relevant_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(el_partitions.NIL != assertion_handles.assertion_p(assertion) && el_partitions.NIL != assertions_high.asserted_assertionP(assertion) && el_partitions.NIL == function_terms.term_of_unit_assertion_p(assertion) && el_partitions.NIL == list_utilities.tree_find_if((SubLObject)el_partitions.$sym11$HL_PROTOTYPICAL_INSTANCE_, assertions_high.assertion_cons(assertion), (SubLObject)el_partitions.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 4511L)
    public static SubLObject pickle_constants(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = Sequences.cconcatenate((SubLObject)el_partitions.$str13$Pickling_constants_to_, new SubLObject[] { format_nil.format_nil_a_no_copy(filename), el_partitions.$str14$_____ });
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(el_partitions.$pickling_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)el_partitions.NIL;
            try {
                final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)el_partitions.NIL, thread);
                    stream = compatibility.open_binary(filename, (SubLObject)el_partitions.$kw15$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$1, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)el_partitions.$str16$Unable_to_open__S, filename);
                }
                final SubLObject s = stream;
                cfasl.cfasl_output(misc_utilities.copyright_notice(), s);
                cfasl.cfasl_output(constant_handles.constant_count(), s);
                final SubLObject idx = constant_handles.do_constants_table();
                final SubLObject mess = message;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)el_partitions.ZERO_INTEGER;
                assert el_partitions.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_0_$2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$4 = idx;
                        if (el_partitions.NIL == id_index.id_index_objects_empty_p(idx_$4, (SubLObject)el_partitions.$kw18$SKIP)) {
                            final SubLObject idx_$5 = idx_$4;
                            if (el_partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$5, (SubLObject)el_partitions.$kw18$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$5);
                                final SubLObject backwardP_var = (SubLObject)el_partitions.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject c;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)el_partitions.NIL, v_iteration = (SubLObject)el_partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)el_partitions.ONE_INTEGER)) {
                                    id = ((el_partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)el_partitions.ONE_INTEGER) : v_iteration);
                                    c = Vectors.aref(vector_var, id);
                                    if (el_partitions.NIL == id_index.id_index_tombstone_p(c) || el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) {
                                        if (el_partitions.NIL != id_index.id_index_tombstone_p(c)) {
                                            c = (SubLObject)el_partitions.$kw18$SKIP;
                                        }
                                        if (el_partitions.NIL != el_partition_relevant_constantP(c)) {
                                            cfasl.cfasl_output(constant_handles.constant_suid(c), s);
                                            cfasl.cfasl_output(constants_high.constant_name(c), s);
                                            cfasl.cfasl_output(constants_high.constant_guid(c), s);
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)el_partitions.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$6 = idx_$4;
                            if (el_partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$6) || el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$6);
                                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$6);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$6);
                                final SubLObject v_default = (SubLObject)((el_partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) ? el_partitions.NIL : el_partitions.$kw18$SKIP);
                                while (id2.numL(end_id)) {
                                    final SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                    if (el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP) || el_partitions.NIL == id_index.id_index_tombstone_p(c2)) {
                                        if (el_partitions.NIL != el_partition_relevant_constantP(c2)) {
                                            cfasl.cfasl_output(constant_handles.constant_suid(c2), s);
                                            cfasl.cfasl_output(constants_high.constant_name(c2), s);
                                            cfasl.cfasl_output(constants_high.constant_guid(c2), s);
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)el_partitions.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    id2 = Numbers.add(id2, (SubLObject)el_partitions.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                }
                cfasl.cfasl_output((SubLObject)el_partitions.NIL, s);
                cfasl.cfasl_output((SubLObject)el_partitions.NIL, s);
                cfasl.cfasl_output((SubLObject)el_partitions.NIL, s);
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)el_partitions.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 5576L)
    public static SubLObject do_pickled_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject suid = (SubLObject)el_partitions.NIL;
        SubLObject name = (SubLObject)el_partitions.NIL;
        SubLObject guid = (SubLObject)el_partitions.NIL;
        SubLObject filename = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list20);
        suid = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list20);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list20);
        guid = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list20);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_partitions.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_partitions.NIL;
        SubLObject current_$9 = (SubLObject)el_partitions.NIL;
        while (el_partitions.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_partitions.$list20);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_partitions.$list20);
            if (el_partitions.NIL == conses_high.member(current_$9, (SubLObject)el_partitions.$list21, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED)) {
                bad = (SubLObject)el_partitions.T;
            }
            if (current_$9 == el_partitions.$kw22$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_partitions.NIL != bad && el_partitions.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list20);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)el_partitions.$kw23$MESSAGE, current);
        final SubLObject message = (SubLObject)((el_partitions.NIL != message_tail) ? conses_high.cadr(message_tail) : el_partitions.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject stream = (SubLObject)el_partitions.$sym24$STREAM;
        final SubLObject count = (SubLObject)el_partitions.$sym25$COUNT;
        final SubLObject msg = (SubLObject)el_partitions.$sym26$MSG;
        return (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym27$WITH_PICKLING_STREAM_BUFFER_SIZE, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym28$WITH_PRIVATE_BINARY_FILE, (SubLObject)ConsesLow.listS(stream, filename, (SubLObject)el_partitions.$list29), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym30$CFASL_INPUT, stream), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(count, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym30$CFASL_INPUT, stream)), (SubLObject)ConsesLow.list(msg, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym31$FIF, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym32$NULL, message), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym33$FORMAT_NIL, (SubLObject)el_partitions.$str34$Reading_pickled_constants_from__A, filename), message))), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym35$WITH_PICKLING_PACFICIATION, (SubLObject)ConsesLow.list(count, msg), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym36$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(suid, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym30$CFASL_INPUT, stream), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym30$CFASL_INPUT, stream)), (SubLObject)ConsesLow.list(name, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym30$CFASL_INPUT, stream), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym30$CFASL_INPUT, stream)), (SubLObject)ConsesLow.list(guid, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym30$CFASL_INPUT, stream), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym30$CFASL_INPUT, stream))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym32$NULL, guid)), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym37$MUST, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym38$NON_NEGATIVE_INTEGER_P, suid), (SubLObject)el_partitions.$str39$Read_invalid_SUID__A_from__A_, suid, stream), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym37$MUST, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym17$STRINGP, name), (SubLObject)el_partitions.$str40$Read_invalid_NAME__A_from__A_, name, stream), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym37$MUST, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym41$GUID_P, guid), (SubLObject)el_partitions.$str42$Read_invalid_GUID__A_from__A_, guid, stream), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym10$NOTE_PERCENT_PROGRESS, suid, count), reader.bq_cons((SubLObject)el_partitions.$sym8$PROGN, ConsesLow.append(body, (SubLObject)el_partitions.NIL)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 7107L)
    public static SubLObject pickle_assertions(final SubLObject filestem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = Sequences.cconcatenate((SubLObject)el_partitions.$str44$Pickling_assertions_to_file_vecto, new SubLObject[] { format_nil.format_nil_a_no_copy(filestem), el_partitions.$str14$_____ });
        final SubLObject index_file = pickling_index_filename(filestem);
        final SubLObject data_file = pickling_data_filename(filestem);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(el_partitions.$pickling_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)el_partitions.NIL;
            try {
                final SubLObject _prev_bind_0_$10 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)el_partitions.NIL, thread);
                    stream = compatibility.open_binary(index_file, (SubLObject)el_partitions.$kw15$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$10, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)el_partitions.$str16$Unable_to_open__S, index_file);
                }
                final SubLObject index_stream = stream;
                SubLObject stream_$11 = (SubLObject)el_partitions.NIL;
                try {
                    final SubLObject _prev_bind_0_$11 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)el_partitions.NIL, thread);
                        stream_$11 = compatibility.open_binary(data_file, (SubLObject)el_partitions.$kw15$OUTPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$11, thread);
                    }
                    if (!stream_$11.isStream()) {
                        Errors.error((SubLObject)el_partitions.$str16$Unable_to_open__S, data_file);
                    }
                    final SubLObject data_stream = stream_$11;
                    final SubLObject fvector = file_vector.create_file_vector(data_stream, index_stream);
                    cfasl.cfasl_output(misc_utilities.copyright_notice(), data_stream);
                    cfasl.cfasl_output(assertion_handles.assertion_count(), data_stream);
                    cfasl.cfasl_output((SubLObject)el_partitions.T, data_stream);
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = message;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)el_partitions.ZERO_INTEGER;
                    assert el_partitions.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$15 = idx;
                            if (el_partitions.NIL == id_index.id_index_objects_empty_p(idx_$15, (SubLObject)el_partitions.$kw18$SKIP)) {
                                final SubLObject idx_$16 = idx_$15;
                                if (el_partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$16, (SubLObject)el_partitions.$kw18$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$16);
                                    final SubLObject backwardP_var = (SubLObject)el_partitions.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject as;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)el_partitions.NIL, v_iteration = (SubLObject)el_partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)el_partitions.ONE_INTEGER)) {
                                        a_id = ((el_partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)el_partitions.ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (el_partitions.NIL == id_index.id_index_tombstone_p(a_handle) || el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) {
                                            if (el_partitions.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = (SubLObject)el_partitions.$kw18$SKIP;
                                            }
                                            as = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (el_partitions.NIL != el_partition_relevant_assertionP(as)) {
                                                file_vector.update_file_vector_index_linear(fvector);
                                                cfasl.cfasl_output(assertion_handles.assertion_id(as), data_stream);
                                                cfasl.cfasl_output(assertion_to_pickling_format(as), data_stream);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)el_partitions.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$17 = idx_$15;
                                if (el_partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$17) || el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$17);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$17);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$17);
                                    final SubLObject v_default = (SubLObject)((el_partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) ? el_partitions.NIL : el_partitions.$kw18$SKIP);
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP) || el_partitions.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            final SubLObject as2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (el_partitions.NIL != el_partition_relevant_assertionP(as2)) {
                                                file_vector.update_file_vector_index_linear(fvector);
                                                cfasl.cfasl_output(assertion_handles.assertion_id(as2), data_stream);
                                                cfasl.cfasl_output(assertion_to_pickling_format(as2), data_stream);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)el_partitions.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, (SubLObject)el_partitions.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$14, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (stream_$11.isStream()) {
                            streams_high.close(stream_$11, (SubLObject)el_partitions.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)el_partitions.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return Values.values(index_file, data_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 8234L)
    public static SubLObject pickling_index_filename(final SubLObject filestem) {
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(filestem), (SubLObject)el_partitions.$str45$_index_cfasl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 8334L)
    public static SubLObject pickling_data_filename(final SubLObject filestem) {
        return Sequences.cconcatenate(filestem, (SubLObject)el_partitions.$str46$_cfasl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 8426L)
    public static SubLObject assertion_to_pickling_format(final SubLObject assertion) {
        final SubLObject formula = canon_tl.assertion_tl_ist_formula(assertion);
        final SubLObject encapsulated = canon_tl.tl_encapsulate(formula);
        final SubLObject rewritten = transform_list_utilities.ntransform(encapsulated, (SubLObject)el_partitions.$sym41$GUID_P, (SubLObject)el_partitions.$sym48$CONVERT_GUID_TO_PICKLING_FORMAT, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        return rewritten;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 8954L)
    public static SubLObject unpickle_assertion_pickling_format(final SubLObject pickled_formula) {
        return transform_list_utilities.transform(pickled_formula, (SubLObject)el_partitions.$sym50$PICKLED_GUID_FORMAT_P, (SubLObject)el_partitions.$sym51$RESTORE_GUID_FROM_PICKLING_FORMAT, (SubLObject)el_partitions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 9284L)
    public static SubLObject convert_guid_to_pickling_format(final SubLObject guid) {
        return (SubLObject)ConsesLow.list((SubLObject)el_partitions.$kw52$GUID, Guids.guid_to_string(guid));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 9464L)
    public static SubLObject pickled_guid_format_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(el_partitions.NIL != list_utilities.proper_list_p(v_object) && el_partitions.NIL != list_utilities.lengthE(v_object, (SubLObject)el_partitions.TWO_INTEGER, (SubLObject)el_partitions.UNPROVIDED) && el_partitions.$kw52$GUID == v_object.first() && el_partitions.NIL != Guids.guid_string_p(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 9698L)
    public static SubLObject restore_guid_from_pickling_format(final SubLObject pickled_guid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject guid_marker = (SubLObject)el_partitions.NIL;
        SubLObject guid_string = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(pickled_guid, pickled_guid, (SubLObject)el_partitions.$list53);
        guid_marker = pickled_guid.first();
        SubLObject current = pickled_guid.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, pickled_guid, (SubLObject)el_partitions.$list53);
        guid_string = current.first();
        current = current.rest();
        if (el_partitions.NIL == current) {
            if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && el_partitions.$kw52$GUID != guid_marker) {
                Errors.error((SubLObject)el_partitions.$str54$Cannot_restore__A_____not_a_pickl, pickled_guid);
            }
            return Guids.string_to_guid(guid_string);
        }
        cdestructuring_bind.cdestructuring_bind_error(pickled_guid, (SubLObject)el_partitions.$list53);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 9970L)
    public static SubLObject new_relevant_assertions_id_space(SubLObject message) {
        if (message == el_partitions.UNPROVIDED) {
            message = (SubLObject)el_partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)el_partitions.ZERO_INTEGER;
        SubLObject keepers = (SubLObject)el_partitions.NIL;
        if (!message.isString()) {
            message = (SubLObject)el_partitions.$str56$Computing_EL_Partition_relevant_a;
        }
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = message;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)el_partitions.ZERO_INTEGER;
        assert el_partitions.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$21 = idx;
                if (el_partitions.NIL == id_index.id_index_objects_empty_p(idx_$21, (SubLObject)el_partitions.$kw18$SKIP)) {
                    final SubLObject idx_$22 = idx_$21;
                    if (el_partitions.NIL == id_index.id_index_dense_objects_empty_p(idx_$22, (SubLObject)el_partitions.$kw18$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$22);
                        final SubLObject backwardP_var = (SubLObject)el_partitions.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)el_partitions.NIL, v_iteration = (SubLObject)el_partitions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)el_partitions.ONE_INTEGER)) {
                            a_id = ((el_partitions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)el_partitions.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (el_partitions.NIL == id_index.id_index_tombstone_p(a_handle) || el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) {
                                if (el_partitions.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)el_partitions.$kw18$SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (el_partitions.NIL != el_partition_relevant_assertionP(assertion)) {
                                    keepers = (SubLObject)ConsesLow.cons(assertion_handles.assertion_id(assertion), keepers);
                                    count = Numbers.add(count, (SubLObject)el_partitions.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)el_partitions.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$23 = idx_$21;
                    if (el_partitions.NIL == id_index.id_index_sparse_objects_empty_p(idx_$23) || el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$23);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$23);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$23);
                        final SubLObject v_default = (SubLObject)((el_partitions.NIL != id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP)) ? el_partitions.NIL : el_partitions.$kw18$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (el_partitions.NIL == id_index.id_index_skip_tombstones_p((SubLObject)el_partitions.$kw18$SKIP) || el_partitions.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (el_partitions.NIL != el_partition_relevant_assertionP(assertion2)) {
                                    keepers = (SubLObject)ConsesLow.cons(assertion_handles.assertion_id(assertion2), keepers);
                                    count = Numbers.add(count, (SubLObject)el_partitions.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)el_partitions.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)el_partitions.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        final SubLObject id_space = Vectors.make_vector(count, (SubLObject)el_partitions.UNPROVIDED);
        SubLObject index = count;
        while (el_partitions.NIL != list_utilities.sublisp_boolean(keepers)) {
            index = Numbers.subtract(index, (SubLObject)el_partitions.ONE_INTEGER);
            if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && el_partitions.NIL == subl_promotions.non_negative_integer_p(index)) {
                Errors.error((SubLObject)el_partitions.$str57$Whoa__we_underflowed_the_ID_space);
            }
            Vectors.set_aref(id_space, index, keepers.first());
            keepers = keepers.rest();
        }
        return id_space;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 21954L)
    public static SubLObject compare_pickled_kb_to_current_kb(final SubLObject pickled_constant_file, final SubLObject pickled_assertion_filestem, final SubLObject data_sink) {
        compare_pickled_kb_to_current_kb_assertions_internal(pickled_assertion_filestem, data_sink, pickled_constant_file);
        return data_sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 22702L)
    public static SubLObject enumerate_additions_to_current_kb(final SubLObject data_sink) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject start = constant_handles.new_constant_suid_threshold();
        SubLObject table_var = constant_handles.do_constants_table();
        SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), start);
        SubLObject sofar = (SubLObject)el_partitions.ZERO_INTEGER;
        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)el_partitions.$str60$Enumerating_new_constants_____);
                SubLObject end_var;
                SubLObject end;
                SubLObject id;
                SubLObject tip_constant;
                for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)el_partitions.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                    tip_constant = id_index.id_index_lookup(table_var, id, (SubLObject)el_partitions.UNPROVIDED);
                    if (el_partitions.NIL != tip_constant) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)el_partitions.ONE_INTEGER);
                        if (el_partitions.NIL != el_partition_relevant_constantP(tip_constant)) {
                            note_el_partition_tip_constant_create(data_sink, tip_constant);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        table_var = assertion_handles.do_assertions_table();
        total = Numbers.subtract(id_index.id_index_next_id(table_var), start);
        sofar = (SubLObject)el_partitions.ZERO_INTEGER;
        _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)el_partitions.$str61$Enumerating_new_assertions_____);
                SubLObject end_var;
                SubLObject end;
                SubLObject id;
                SubLObject tip_assertion;
                for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)el_partitions.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                    tip_assertion = id_index.id_index_lookup(table_var, id, (SubLObject)el_partitions.UNPROVIDED);
                    if (el_partitions.NIL != tip_assertion) {
                        utilities_macros.note_percent_progress(sofar, total);
                        sofar = Numbers.add(sofar, (SubLObject)el_partitions.ONE_INTEGER);
                        if (el_partitions.NIL != el_partition_relevant_assertionP(tip_assertion)) {
                            note_el_partition_tip_assertion_create(data_sink, tip_assertion);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return data_sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 23449L)
    public static SubLObject compare_pickled_kb_to_current_kb_constants(final SubLObject pickled_file, final SubLObject data_sink) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert el_partitions.NIL != el_partition_data_sink_p(data_sink) : data_sink;
        final SubLObject raw_tip_iterator = constant_handles.new_constants_iterator();
        final SubLObject tip_iterator = iteration.new_filter_iterator(raw_tip_iterator, (SubLObject)el_partitions.$sym63$EL_PARTITION_RELEVANT_CONSTANT_, (SubLObject)el_partitions.UNPROVIDED);
        SubLObject tip_constant = iteration.iteration_next_without_values(tip_iterator, (SubLObject)el_partitions.$kw64$DONE);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(el_partitions.$pickling_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)el_partitions.NIL;
            try {
                final SubLObject _prev_bind_0_$27 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)el_partitions.NIL, thread);
                    stream = compatibility.open_binary(pickled_file, (SubLObject)el_partitions.$kw65$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$27, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)el_partitions.$str16$Unable_to_open__S, pickled_file);
                }
                final SubLObject stream_$28 = stream;
                cfasl.cfasl_input(stream_$28, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                final SubLObject count = cfasl.cfasl_input(stream_$28, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                final SubLObject msg = Sequences.cconcatenate((SubLObject)el_partitions.$str66$Reading_pickled_constants_from_, new SubLObject[] { format_nil.format_nil_a_no_copy(pickled_file), el_partitions.$str14$_____ });
                SubLObject curr = (SubLObject)el_partitions.ZERO_INTEGER;
                final SubLObject _prev_bind_0_$28 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$30 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(msg);
                        SubLObject suid = (SubLObject)el_partitions.NIL;
                        SubLObject branch_name = (SubLObject)el_partitions.NIL;
                        SubLObject branch_guid = (SubLObject)el_partitions.NIL;
                        suid = cfasl.cfasl_input(stream_$28, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                        branch_name = cfasl.cfasl_input(stream_$28, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                        for (branch_guid = cfasl.cfasl_input(stream_$28, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED); el_partitions.NIL != branch_guid; branch_guid = cfasl.cfasl_input(stream_$28, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED)) {
                            if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && el_partitions.NIL == subl_promotions.non_negative_integer_p(suid)) {
                                Errors.error((SubLObject)el_partitions.$str39$Read_invalid_SUID__A_from__A_, suid, stream_$28);
                            }
                            if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !branch_name.isString()) {
                                Errors.error((SubLObject)el_partitions.$str40$Read_invalid_NAME__A_from__A_, branch_name, stream_$28);
                            }
                            if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && el_partitions.NIL == Guids.guid_p(branch_guid)) {
                                Errors.error((SubLObject)el_partitions.$str42$Read_invalid_GUID__A_from__A_, branch_guid, stream_$28);
                            }
                            utilities_macros.note_percent_progress(suid, count);
                            if (el_partitions.NIL != constant_handles.constant_p(tip_constant) && el_partitions.NIL != Guids.guidE(branch_guid, constants_high.constant_guid(tip_constant))) {
                                tip_constant = iteration.iteration_next_without_values(tip_iterator, (SubLObject)el_partitions.$kw64$DONE);
                            }
                            else {
                                note_el_partition_branch_constant_delete(data_sink, branch_name, branch_guid);
                            }
                            suid = cfasl.cfasl_input(stream_$28, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                            branch_name = cfasl.cfasl_input(stream_$28, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                        }
                        curr = Numbers.add(curr, (SubLObject)el_partitions.ONE_INTEGER);
                        utilities_macros.note_percent_progress(curr, count);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$30, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$28, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)el_partitions.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        while (el_partitions.NIL != constant_handles.constant_p(tip_constant)) {
            note_el_partition_tip_constant_create(data_sink, tip_constant);
            tip_constant = iteration.iteration_next_without_values(tip_iterator, (SubLObject)el_partitions.$kw64$DONE);
        }
        return pickled_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 24947L)
    public static SubLObject update_as_iteration_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject it = (SubLObject)el_partitions.NIL;
        SubLObject as = (SubLObject)el_partitions.NIL;
        SubLObject tl_ist_formula = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list67);
        it = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list67);
        as = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list67);
        tl_ist_formula = current.first();
        current = current.rest();
        if (el_partitions.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym68$CSETQ, as, (SubLObject)ConsesLow.listS((SubLObject)el_partitions.$sym69$ITERATION_NEXT_WITHOUT_VALUES, it, (SubLObject)el_partitions.$list70), tl_ist_formula, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym71$FWHEN, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym72$ASSERTION_P, as), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym73$TL_ENCAPSULATE, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym74$ASSERTION_TL_IST_FORMULA, as))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list67);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 25309L)
    public static SubLObject decrement_tip_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tip_index = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list75);
        tip_index = current.first();
        current = current.rest();
        if (el_partitions.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym8$PROGN, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym76$CDEC, tip_index), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym77$UNTIL, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym78$EL_PARTITION_RELEVANT_ASSERTION_, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym79$FIND_ASSERTION_BY_ID, tip_index)), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym76$CDEC, tip_index), (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym37$MUST, (SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym38$NON_NEGATIVE_INTEGER_P, tip_index), (SubLObject)el_partitions.$str80$Implementation_error__Tip_index__, tip_index)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list75);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 25768L)
    public static SubLObject find_most_recent_assertion_shared_with_branch(final SubLObject pickled_file_stem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file = pickling_data_filename(pickled_file_stem);
        final SubLObject index_file = pickling_index_filename(pickled_file_stem);
        final SubLObject branch_ids_to_index = dictionary.new_dictionary((SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        SubLObject tip_assertion = (SubLObject)el_partitions.NIL;
        SubLObject corresponding_branch_as_id = (SubLObject)el_partitions.NIL;
        SubLObject total_branch_assertions = (SubLObject)el_partitions.NIL;
        SubLObject fvector = (SubLObject)el_partitions.NIL;
        try {
            fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)el_partitions.$kw65$INPUT, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject branch_index_limit = fetch_branch_limit_information_for_pickled_kb(fvector);
            final SubLObject branch_assertions_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total_branch_assertions = branch_assertions_count;
            final SubLObject window = dictionary.new_dictionary((SubLObject)el_partitions.EQUAL, (SubLObject)el_partitions.UNPROVIDED);
            final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
            SubLObject tip_index = Numbers.min(total_branch_assertions, assertion_handles.assertion_count());
            SubLObject branch_index = branch_index_limit;
            for (SubLObject doneP = (SubLObject)el_partitions.NIL; el_partitions.NIL == doneP; doneP = subl_promotions.non_negative_integer_p(corresponding_branch_as_id)) {
                if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !branch_index.isPositive()) {
                    Errors.error((SubLObject)el_partitions.$str81$Implementation_error__branch_inde);
                }
                if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !tip_index.isPositive()) {
                    Errors.error((SubLObject)el_partitions.$str82$Implementation_error__tip_index_u);
                }
                branch_index = Numbers.subtract(branch_index, (SubLObject)el_partitions.ONE_INTEGER);
                file_vector.position_file_vector(fvector, branch_index);
                final SubLObject branch_as_id = cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                final SubLObject branch_tl_ist_formula = cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                map_utilities.map_put(branch_ids_to_index, branch_as_id, branch_index);
                map_utilities.map_put(window, branch_tl_ist_formula, branch_as_id);
                tip_index = Numbers.subtract(tip_index, (SubLObject)el_partitions.ONE_INTEGER);
                while (el_partitions.NIL == el_partition_relevant_assertionP(assertion_handles.find_assertion_by_id(tip_index))) {
                    tip_index = Numbers.subtract(tip_index, (SubLObject)el_partitions.ONE_INTEGER);
                    if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && el_partitions.NIL == subl_promotions.non_negative_integer_p(tip_index)) {
                        Errors.error((SubLObject)el_partitions.$str80$Implementation_error__Tip_index__, tip_index);
                    }
                }
                tip_assertion = assertion_handles.find_assertion_by_id(tip_index);
                final SubLObject tip_tl_ist_formula = assertion_to_pickling_format(tip_assertion);
                corresponding_branch_as_id = map_utilities.map_get(window, tip_tl_ist_formula, (SubLObject)el_partitions.$kw83$NOT_FOUND);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (el_partitions.NIL != file_vector.file_vector_p(fvector)) {
                    file_vector.close_file_vector(fvector);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject branch_index2 = map_utilities.map_get(branch_ids_to_index, corresponding_branch_as_id, (SubLObject)el_partitions.UNPROVIDED);
        return (SubLObject)ConsesLow.list(new SubLObject[] { el_partitions.$kw84$SHARED_ASSERTION, tip_assertion, el_partitions.$kw85$BRANCH_AS_ID, corresponding_branch_as_id, el_partitions.$kw86$BRANCH_INDEX, branch_index2, el_partitions.$kw87$BRANCH_COUNT, total_branch_assertions, el_partitions.$kw88$JUST_ASSERTED_P, el_partitions.T });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 28720L)
    public static SubLObject compare_pickled_kb_to_current_kb_assertions(final SubLObject pickled_file_stem, final SubLObject data_sink) {
        assert el_partitions.NIL != el_partition_data_sink_p(data_sink) : data_sink;
        return compare_pickled_kb_to_current_kb_assertions_internal(pickled_file_stem, data_sink, (SubLObject)el_partitions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 29442L)
    public static SubLObject compare_pickled_kb_to_current_kb_assertions_internal(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == el_partitions.UNPROVIDED) {
            pickled_constants_file = (SubLObject)el_partitions.NIL;
        }
        final SubLObject pcase_var;
        final SubLObject strategy = pcase_var = el_partitions.$pickled_kb_comparison_strategy$.getGlobalValue();
        if (pcase_var.eql((SubLObject)el_partitions.$kw90$CLASSIC_BACKWARD)) {
            return compare_pickled_kb_to_current_kb_assertions_classic_backward(pickled_file_stem, data_sink, pickled_constants_file);
        }
        if (pcase_var.eql((SubLObject)el_partitions.$kw91$NOVEL_FORWARD)) {
            return compare_pickled_kb_to_current_kb_assertions_novel_forward(pickled_file_stem, data_sink, pickled_constants_file);
        }
        if (pcase_var.eql((SubLObject)el_partitions.$kw92$SCAN_FORWARD_FAST)) {
            return compare_pickled_kb_to_current_kb_assertions_scan_forward_fast(pickled_file_stem, data_sink, pickled_constants_file);
        }
        if (pcase_var.eql((SubLObject)el_partitions.$kw89$SCAN_FORWARD_STEADY)) {
            return compare_pickled_kb_to_current_kb_assertions_scan_forward_steady(pickled_file_stem, data_sink, pickled_constants_file);
        }
        return Errors.error((SubLObject)el_partitions.$str93$Pickled_KB_Comparison_Strategy__S, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 30739L)
    public static SubLObject compare_pickled_kb_to_current_kb_assertions_scan_forward_fast(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == el_partitions.UNPROVIDED) {
            pickled_constants_file = (SubLObject)el_partitions.NIL;
        }
        final SubLObject last_shared = scan_enumerate_branch_assertions_missing_from_current_kb(pickled_file_stem, data_sink, (SubLObject)el_partitions.UNPROVIDED);
        if (pickled_constants_file.isString()) {
            compare_pickled_kb_to_current_kb_constants(pickled_constants_file, data_sink);
        }
        enumerate_tip_assertions_from_current_kb(data_sink, last_shared);
        return (SubLObject)el_partitions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 31610L)
    public static SubLObject compare_pickled_kb_to_current_kb_assertions_scan_forward_steady(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == el_partitions.UNPROVIDED) {
            pickled_constants_file = (SubLObject)el_partitions.NIL;
        }
        final SubLObject relevant_id_space = new_relevant_assertions_id_space((SubLObject)el_partitions.UNPROVIDED);
        final SubLObject last_shared = scan_enumerate_branch_assertions_missing_from_current_kb(pickled_file_stem, data_sink, relevant_id_space);
        if (pickled_constants_file.isString()) {
            compare_pickled_kb_to_current_kb_constants(pickled_constants_file, data_sink);
        }
        enumerate_tip_assertions_from_current_kb(data_sink, last_shared);
        return (SubLObject)el_partitions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 32611L)
    public static SubLObject compare_pickled_kb_to_current_kb_assertions_novel_forward(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == el_partitions.UNPROVIDED) {
            pickled_constants_file = (SubLObject)el_partitions.NIL;
        }
        final SubLObject last_shared = identify_branch_assertions_absent_from_current_kb(pickled_file_stem, data_sink);
        if (pickled_constants_file.isString()) {
            compare_pickled_kb_to_current_kb_constants(pickled_constants_file, data_sink);
        }
        enumerate_tip_assertions_from_current_kb(data_sink, last_shared);
        return (SubLObject)el_partitions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 33443L)
    public static SubLObject compare_pickled_kb_to_current_kb_assertions_classic_backward(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == el_partitions.UNPROVIDED) {
            pickled_constants_file = (SubLObject)el_partitions.NIL;
        }
        final SubLObject cmp_properties = find_most_recent_assertion_shared_with_branch(pickled_file_stem);
        final SubLObject last_shared = conses_high.getf(cmp_properties, (SubLObject)el_partitions.$kw84$SHARED_ASSERTION, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject just_assertedP = conses_high.getf(cmp_properties, (SubLObject)el_partitions.$kw88$JUST_ASSERTED_P, (SubLObject)el_partitions.UNPROVIDED);
        enumerate_branch_assertions_absent_from_current_kb(pickled_file_stem, data_sink, cmp_properties);
        if (pickled_constants_file.isString()) {
            compare_pickled_kb_to_current_kb_constants(pickled_constants_file, data_sink);
        }
        enumerate_tip_assertions_from_current_kb(data_sink, last_shared);
        return just_assertedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 34567L)
    public static SubLObject enumerate_tip_assertions_from_current_kb(final SubLObject data_sink, final SubLObject last_shared) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_space_id;
        final SubLObject new_space_start = new_space_id = Numbers.add(assertion_handles.assertion_id(last_shared), (SubLObject)el_partitions.ONE_INTEGER);
        final SubLObject tip_assertion_count = assertion_handles.assertion_count();
        final SubLObject additions = Numbers.subtract(tip_assertion_count, new_space_id);
        final SubLObject message = Sequences.cconcatenate((SubLObject)el_partitions.$str94$Analyzing_, new SubLObject[] { format_nil.format_nil_a_no_copy(additions), el_partitions.$str95$_new_assertions_____ });
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                while (new_space_id.numL(tip_assertion_count)) {
                    utilities_macros.note_percent_progress(Numbers.subtract(new_space_id, new_space_start), tip_assertion_count);
                    final SubLObject new_assertion = assertion_handles.find_assertion_by_id(new_space_id);
                    if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && el_partitions.NIL == assertion_handles.assertion_p(new_assertion)) {
                        Errors.error((SubLObject)el_partitions.$str96$This_algorithm_is_not_designed_to);
                    }
                    if (el_partitions.NIL != el_partition_relevant_assertionP(new_assertion)) {
                        note_el_partition_tip_assertion_create(data_sink, new_assertion);
                    }
                    new_space_id = Numbers.add(new_space_id, (SubLObject)el_partitions.ONE_INTEGER);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return data_sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 35595L)
    public static SubLObject enumerate_branch_assertions_absent_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, final SubLObject cmp_properties) {
        final SubLObject shared_assertion = conses_high.getf(cmp_properties, (SubLObject)el_partitions.$kw84$SHARED_ASSERTION, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject branch_as_id = conses_high.getf(cmp_properties, (SubLObject)el_partitions.$kw85$BRANCH_AS_ID, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject branch_index = conses_high.getf(cmp_properties, (SubLObject)el_partitions.$kw86$BRANCH_INDEX, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject branch_count = conses_high.getf(cmp_properties, (SubLObject)el_partitions.$kw87$BRANCH_COUNT, (SubLObject)el_partitions.UNPROVIDED);
        return enumerate_branch_assertions_missing_from_current_kb(pickled_file_stem, data_sink, shared_assertion, branch_as_id, branch_index, branch_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject elpart_as_desc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_elpart_as_desc(v_object, stream, (SubLObject)el_partitions.ZERO_INTEGER);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject elpart_as_desc_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $elpart_as_desc_native.class) ? el_partitions.T : el_partitions.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject elpart_as_desc_id(final SubLObject v_object) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject elpart_as_desc_tl_ist_formula(final SubLObject v_object) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject elpart_as_desc_hash(final SubLObject v_object) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject elpart_as_desc_extra(final SubLObject v_object) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject elpart_as_desc_weak_ist_formula(final SubLObject v_object) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject _csetf_elpart_as_desc_id(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject _csetf_elpart_as_desc_tl_ist_formula(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject _csetf_elpart_as_desc_hash(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject _csetf_elpart_as_desc_extra(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject _csetf_elpart_as_desc_weak_ist_formula(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != elpart_as_desc_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject make_elpart_as_desc(SubLObject arglist) {
        if (arglist == el_partitions.UNPROVIDED) {
            arglist = (SubLObject)el_partitions.NIL;
        }
        final SubLObject v_new = (SubLObject)new $elpart_as_desc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)el_partitions.NIL, next = arglist; el_partitions.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)el_partitions.$kw116$ID)) {
                _csetf_elpart_as_desc_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw117$TL_IST_FORMULA)) {
                _csetf_elpart_as_desc_tl_ist_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw118$HASH)) {
                _csetf_elpart_as_desc_hash(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw119$EXTRA)) {
                _csetf_elpart_as_desc_extra(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw120$WEAK_IST_FORMULA)) {
                _csetf_elpart_as_desc_weak_ist_formula(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)el_partitions.$str121$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject visit_defstruct_elpart_as_desc(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw122$BEGIN, (SubLObject)el_partitions.$sym123$MAKE_ELPART_AS_DESC, (SubLObject)el_partitions.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw116$ID, elpart_as_desc_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw117$TL_IST_FORMULA, elpart_as_desc_tl_ist_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw118$HASH, elpart_as_desc_hash(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw119$EXTRA, elpart_as_desc_extra(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw120$WEAK_IST_FORMULA, elpart_as_desc_weak_ist_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw125$END, (SubLObject)el_partitions.$sym123$MAKE_ELPART_AS_DESC, (SubLObject)el_partitions.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
    public static SubLObject visit_defstruct_object_elpart_as_desc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_elpart_as_desc(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36655L)
    public static SubLObject print_elpart_as_desc(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (el_partitions.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)el_partitions.T, (SubLObject)el_partitions.T);
            streams_high.write_string((SubLObject)el_partitions.$str127$_id__, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            print_high.princ(elpart_as_desc_id(v_object), stream);
            streams_high.write_string((SubLObject)el_partitions.$str128$_hc__, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            print_high.princ(elpart_as_desc_hash(v_object), stream);
            final SubLObject extra = elpart_as_desc_extra(v_object);
            if (el_partitions.NIL == extra) {
                print_high.princ(extra, stream);
            }
            else if (el_partitions.NIL != assertion_handles.assertion_p(extra)) {
                streams_high.write_string((SubLObject)el_partitions.$str129$_AS_ID__, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                print_high.princ(assertion_handles.assertion_id(extra), stream);
            }
            else if (el_partitions.NIL != subl_promotions.non_negative_integer_p(extra)) {
                streams_high.write_string((SubLObject)el_partitions.$str130$_FVecInx__, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                print_high.princ(extra, stream);
            }
            else {
                streams_high.write_string((SubLObject)el_partitions.$str131$_xtr__, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
                print_high.princ(extra, stream);
            }
            streams_high.write_string((SubLObject)el_partitions.$str132$_, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)el_partitions.NIL, (SubLObject)el_partitions.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 37410L)
    public static SubLObject identify_branch_assertions_absent_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink) {
        final SubLObject data_file = pickling_data_filename(pickled_file_stem);
        final SubLObject index_file = pickling_index_filename(pickled_file_stem);
        SubLObject shared_assertion = (SubLObject)el_partitions.NIL;
        SubLObject fvector = (SubLObject)el_partitions.NIL;
        try {
            fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)el_partitions.$kw65$INPUT, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            shared_assertion = identify_branch_assertions_absent_from_current_kb_int(fvector, data_sink);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)el_partitions.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (el_partitions.NIL != file_vector.file_vector_p(fvector)) {
                    file_vector.close_file_vector(fvector);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return shared_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 38287L)
    public static SubLObject identify_branch_assertions_absent_from_current_kb_int(final SubLObject fvector, final SubLObject data_sink) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject last_shared = (SubLObject)el_partitions.NIL;
        thread.resetMultipleValues();
        final SubLObject branch_index_limit = fetch_branch_limit_information_for_pickled_kb(fvector);
        final SubLObject branch_assertions_count = thread.secondMultipleValue();
        final SubLObject first_branch_as_id = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject assertions_to_do = Numbers.subtract(branch_assertions_count, first_branch_as_id);
        final SubLObject message = Sequences.cconcatenate((SubLObject)el_partitions.$str94$Analyzing_, new SubLObject[] { format_nil.format_nil_a_no_copy(assertions_to_do), el_partitions.$str133$_assertions_____ });
        SubLObject left_wall = (SubLObject)el_partitions.ZERO_INTEGER;
        SubLObject id_skew = (SubLObject)el_partitions.ZERO_INTEGER;
        SubLObject deletions_noted = (SubLObject)el_partitions.ZERO_INTEGER;
        final SubLObject first_tip_as_id = find_start_of_el_partition_relevant_assertions(first_branch_as_id);
        id_skew = Numbers.subtract(first_branch_as_id, first_tip_as_id);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                while (left_wall.numL(branch_index_limit)) {
                    utilities_macros.note_percent_progress(left_wall, branch_index_limit);
                    SubLObject probe_index = Numbers.integerDivide(Numbers.add(left_wall, branch_index_limit), (SubLObject)el_partitions.TWO_INTEGER);
                    final SubLObject branch_desc = make_elpart_as_desc((SubLObject)el_partitions.UNPROVIDED);
                    final SubLObject tip_desc = make_elpart_as_desc((SubLObject)el_partitions.UNPROVIDED);
                    enummiss_fetch_specific_assertion_information(fvector, branch_desc, probe_index);
                    final SubLObject tip_as_id = Numbers.subtract(elpart_as_desc_id(branch_desc), id_skew);
                    enummiss_compute_specific_assertion_information(tip_desc, tip_as_id);
                    if (el_partitions.NIL != same_elpart_as_descP(branch_desc, tip_desc)) {
                        last_shared = elpart_as_desc_extra(tip_desc);
                        if (probe_index.numE(left_wall)) {
                            left_wall = branch_index_limit;
                        }
                        else {
                            left_wall = probe_index;
                        }
                    }
                    else {
                        SubLObject right_wall = probe_index;
                        while (left_wall.numLE(right_wall)) {
                            probe_index = Numbers.integerDivide(Numbers.add(left_wall, right_wall), (SubLObject)el_partitions.TWO_INTEGER);
                            enummiss_fetch_specific_assertion_information(fvector, branch_desc, probe_index);
                            final SubLObject tip_as_id2 = Numbers.subtract(elpart_as_desc_id(branch_desc), id_skew);
                            enummiss_compute_specific_assertion_information(tip_desc, tip_as_id2);
                            if (el_partitions.NIL != same_elpart_as_descP(branch_desc, tip_desc)) {
                                left_wall = Numbers.add(probe_index, (SubLObject)el_partitions.ONE_INTEGER);
                                last_shared = elpart_as_desc_extra(tip_desc);
                            }
                            else {
                                right_wall = Numbers.subtract(probe_index, (SubLObject)el_partitions.ONE_INTEGER);
                            }
                        }
                        enummiss_fetch_specific_assertion_information(fvector, branch_desc, right_wall);
                        final SubLObject tip_last_good = Numbers.subtract(elpart_as_desc_id(branch_desc), id_skew);
                        final SubLObject tip_cursor = enummiss_find_next_relevant_assertion(tip_last_good);
                        if (tip_cursor.isNegative()) {
                            Errors.error((SubLObject)el_partitions.$str134$Not_yet_implemented_);
                        }
                        else {
                            enummiss_compute_specific_assertion_information(tip_desc, tip_cursor);
                            enummiss_fetch_specific_assertion_information(fvector, branch_desc, left_wall);
                            id_skew = Numbers.subtract(elpart_as_desc_id(branch_desc), tip_cursor);
                            while (left_wall.numL(branch_index_limit) && el_partitions.NIL == same_elpart_as_descP(branch_desc, tip_desc)) {
                                deletions_noted = Numbers.add(deletions_noted, (SubLObject)el_partitions.ONE_INTEGER);
                                note_el_partition_branch_assertion_delete(data_sink, elpart_as_desc_tl_ist_formula(branch_desc));
                                left_wall = Numbers.add(left_wall, (SubLObject)el_partitions.ONE_INTEGER);
                                enummiss_fetch_specific_assertion_information(fvector, branch_desc, left_wall);
                                id_skew = Numbers.subtract(elpart_as_desc_id(branch_desc), tip_cursor);
                                if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_skew.numL(deletions_noted)) {
                                    Errors.error((SubLObject)el_partitions.$str135$Mhm__only__A_gaps_across_all_asse, id_skew, deletions_noted);
                                }
                            }
                            if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && id_skew.numLE(deletions_noted)) {
                                Errors.error((SubLObject)el_partitions.$str135$Mhm__only__A_gaps_across_all_asse, id_skew, deletions_noted);
                            }
                            if (!left_wall.numL(branch_index_limit)) {
                                continue;
                            }
                            last_shared = elpart_as_desc_extra(tip_desc);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return last_shared;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 43637L)
    public static SubLObject find_start_of_el_partition_relevant_assertions(final SubLObject ceiling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tip_as_id = (SubLObject)el_partitions.MINUS_ONE_INTEGER;
        SubLObject doneP = (SubLObject)el_partitions.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)el_partitions.$str136$Finding_start_of_relevant_asserti);
                while (el_partitions.NIL == doneP) {
                    tip_as_id = Numbers.add(tip_as_id, (SubLObject)el_partitions.ONE_INTEGER);
                    utilities_macros.note_percent_progress(tip_as_id, ceiling);
                    final SubLObject tip_assertion = assertion_handles.find_assertion_by_id(tip_as_id);
                    doneP = (SubLObject)SubLObjectFactory.makeBoolean(el_partitions.NIL != el_partition_relevant_assertionP(tip_assertion) || tip_as_id.numG(ceiling));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return tip_as_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 44215L)
    public static SubLObject fetch_branch_limit_information_for_pickled_kb(final SubLObject fvector) {
        SubLObject branch_assertions_count = (SubLObject)el_partitions.NIL;
        SubLObject branch_index_limit = (SubLObject)el_partitions.NIL;
        SubLObject first_as_id = (SubLObject)el_partitions.NIL;
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        compatibility.set_file_position(data_stream, (SubLObject)el_partitions.ZERO_INTEGER);
        cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        branch_assertions_count = cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        branch_index_limit = file_vector.file_vector_length(fvector);
        final SubLObject branch_desc = make_elpart_as_desc((SubLObject)el_partitions.UNPROVIDED);
        enummiss_fetch_specific_assertion_information(fvector, branch_desc, (SubLObject)el_partitions.ZERO_INTEGER);
        first_as_id = elpart_as_desc_id(branch_desc);
        return Values.values(branch_index_limit, branch_assertions_count, first_as_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 45059L)
    public static SubLObject enumerate_branch_assertions_missing_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, final SubLObject shared_assertion, final SubLObject branch_as_id, final SubLObject branch_index, final SubLObject branch_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file = pickling_data_filename(pickled_file_stem);
        final SubLObject index_file = pickling_index_filename(pickled_file_stem);
        SubLObject fvector = (SubLObject)el_partitions.NIL;
        try {
            fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)el_partitions.$kw65$INPUT, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            enumerate_missing_assertions_before_shared(fvector, data_sink, branch_index);
            SubLObject prev_cursor;
            SubLObject cursor = prev_cursor = branch_index;
            final SubLObject total_id_skew = Numbers.subtract(branch_as_id, assertion_handles.assertion_id(shared_assertion));
            final SubLObject message = Sequences.cconcatenate((SubLObject)el_partitions.$str94$Analyzing_, new SubLObject[] { format_nil.format_nil_a_no_copy(total_id_skew), el_partitions.$str137$_assertion_gaps_____ });
            SubLObject id_skew = total_id_skew;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    while (el_partitions.ZERO_INTEGER.numL(id_skew)) {
                        utilities_macros.note_percent_progress(Numbers.subtract(total_id_skew, id_skew), total_id_skew);
                        final SubLObject run_length_guess = Numbers.max((SubLObject)el_partitions.ONE_INTEGER, Numbers.integerDivide(cursor, id_skew));
                        final SubLObject probe_index = Numbers.max((SubLObject)el_partitions.ZERO_INTEGER, Numbers.subtract(cursor, run_length_guess));
                        final SubLObject branch_desc = make_elpart_as_desc((SubLObject)el_partitions.UNPROVIDED);
                        final SubLObject tip_desc = make_elpart_as_desc((SubLObject)el_partitions.UNPROVIDED);
                        enummiss_fetch_specific_assertion_information(fvector, branch_desc, probe_index);
                        final SubLObject tip_as_id = Numbers.subtract(elpart_as_desc_id(branch_desc), id_skew);
                        enummiss_compute_specific_assertion_information(tip_desc, tip_as_id);
                        if (el_partitions.NIL != same_elpart_as_descP(branch_desc, tip_desc)) {
                            prev_cursor = cursor;
                            cursor = probe_index;
                            if (!prev_cursor.numE(cursor)) {
                                continue;
                            }
                            id_skew = (SubLObject)el_partitions.ZERO_INTEGER;
                        }
                        else {
                            SubLObject branch_last_good = probe_index;
                            while (branch_last_good.numLE(cursor)) {
                                final SubLObject search_cursor = Numbers.integerDivide(Numbers.add(branch_last_good, cursor), (SubLObject)el_partitions.TWO_INTEGER);
                                enummiss_fetch_specific_assertion_information(fvector, branch_desc, search_cursor);
                                final SubLObject tip_as_id2 = Numbers.subtract(elpart_as_desc_id(branch_desc), id_skew);
                                enummiss_compute_specific_assertion_information(tip_desc, tip_as_id2);
                                if (el_partitions.NIL != same_elpart_as_descP(branch_desc, tip_desc)) {
                                    cursor = Numbers.subtract(search_cursor, (SubLObject)el_partitions.ONE_INTEGER);
                                }
                                else {
                                    branch_last_good = Numbers.add(search_cursor, (SubLObject)el_partitions.ONE_INTEGER);
                                }
                            }
                            enummiss_fetch_specific_assertion_information(fvector, branch_desc, branch_last_good);
                            final SubLObject tip_last_good = Numbers.subtract(elpart_as_desc_id(branch_desc), id_skew);
                            final SubLObject tip_cursor = enummiss_find_previous_relevant_assertion(tip_last_good);
                            if (tip_cursor.isNegative()) {
                                while (el_partitions.NIL != subl_promotions.non_negative_integer_p(cursor)) {
                                    enummiss_fetch_specific_assertion_information(fvector, branch_desc, cursor);
                                    note_el_partition_branch_assertion_delete(data_sink, elpart_as_desc_tl_ist_formula(branch_desc));
                                    cursor = Numbers.subtract(cursor, (SubLObject)el_partitions.ONE_INTEGER);
                                }
                                id_skew = (SubLObject)el_partitions.ZERO_INTEGER;
                            }
                            else {
                                enummiss_compute_specific_assertion_information(tip_desc, tip_cursor);
                                enummiss_fetch_specific_assertion_information(fvector, branch_desc, cursor);
                                id_skew = Numbers.subtract(elpart_as_desc_id(branch_desc), tip_cursor);
                                while (el_partitions.NIL == same_elpart_as_descP(branch_desc, tip_desc)) {
                                    note_el_partition_branch_assertion_delete(data_sink, elpart_as_desc_tl_ist_formula(branch_desc));
                                    cursor = Numbers.subtract(cursor, (SubLObject)el_partitions.ONE_INTEGER);
                                    enummiss_fetch_specific_assertion_information(fvector, branch_desc, cursor);
                                    id_skew = Numbers.subtract(elpart_as_desc_id(branch_desc), tip_cursor);
                                    if (el_partitions.NIL == subl_promotions.non_negative_integer_p(id_skew)) {
                                        final SubLObject last_good_desc = make_elpart_as_desc((SubLObject)el_partitions.UNPROVIDED);
                                        enummiss_fetch_specific_assertion_information(fvector, last_good_desc, branch_last_good);
                                        Errors.error((SubLObject)el_partitions.$str138$Error_realigning_BRANCH___A__now_, last_good_desc, branch_desc, tip_desc);
                                    }
                                }
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
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
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (el_partitions.NIL != file_vector.file_vector_p(fvector)) {
                    file_vector.close_file_vector(fvector);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return pickled_file_stem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 51214L)
    public static SubLObject same_elpart_as_descP(final SubLObject a_desc, final SubLObject b_desc) {
        return (SubLObject)SubLObjectFactory.makeBoolean(elpart_as_desc_hash(a_desc).eql(elpart_as_desc_hash(b_desc)) && elpart_as_desc_weak_ist_formula(a_desc).equal(elpart_as_desc_weak_ist_formula(b_desc)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 51701L)
    public static SubLObject enummiss_find_previous_relevant_assertion(final SubLObject tip_last_good) {
        SubLObject tip_cursor;
        for (tip_cursor = Numbers.subtract(tip_last_good, (SubLObject)el_partitions.ONE_INTEGER); el_partitions.NIL != subl_promotions.non_negative_integer_p(tip_cursor); tip_cursor = Numbers.subtract(tip_cursor, (SubLObject)el_partitions.ONE_INTEGER)) {
            final SubLObject tip_assertion = assertion_handles.find_assertion_by_id(tip_cursor);
            if (el_partitions.NIL != el_partition_relevant_assertionP(tip_assertion)) {
                return tip_cursor;
            }
        }
        return tip_cursor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 52219L)
    public static SubLObject enummiss_find_next_relevant_assertion(final SubLObject tip_last_good) {
        for (SubLObject tip_cursor = Numbers.add(tip_last_good, (SubLObject)el_partitions.ONE_INTEGER), limit = assertion_handles.get_file_backed_assertion_internal_id_threshold(); tip_cursor.numL(limit); tip_cursor = Numbers.add(tip_cursor, (SubLObject)el_partitions.ONE_INTEGER)) {
            final SubLObject tip_assertion = assertion_handles.find_assertion_by_id(tip_cursor);
            if (el_partitions.NIL != el_partition_relevant_assertionP(tip_assertion)) {
                return tip_cursor;
            }
        }
        return (SubLObject)el_partitions.MINUS_ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 52777L)
    public static SubLObject enummiss_fetch_specific_assertion_information(final SubLObject fvector, final SubLObject branch_desc, final SubLObject index) {
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        file_vector.position_file_vector(fvector, index);
        _csetf_elpart_as_desc_extra(branch_desc, index);
        _csetf_elpart_as_desc_id(branch_desc, cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED));
        final SubLObject as_tl_ist_formula = cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject weak_ist_formula = enummiss_compute_weakened_ist_formula(as_tl_ist_formula);
        _csetf_elpart_as_desc_tl_ist_formula(branch_desc, as_tl_ist_formula);
        _csetf_elpart_as_desc_weak_ist_formula(branch_desc, weak_ist_formula);
        _csetf_elpart_as_desc_hash(branch_desc, Sxhash.sxhash(weak_ist_formula));
        return branch_desc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 53548L)
    public static SubLObject enummiss_compute_specific_assertion_information(final SubLObject tip_desc, final SubLObject potential_id) {
        enummiss_clear_specific_assertion_information(tip_desc);
        _csetf_elpart_as_desc_id(tip_desc, potential_id);
        if (el_partitions.NIL != subl_promotions.non_negative_integer_p(potential_id)) {
            final SubLObject tip_assertion = assertion_handles.find_assertion_by_id(potential_id);
            final SubLObject tl_ist_formula = assertion_to_pickling_format(tip_assertion);
            final SubLObject weak_ist_formula = enummiss_compute_weakened_ist_formula(tl_ist_formula);
            _csetf_elpart_as_desc_extra(tip_desc, tip_assertion);
            _csetf_elpart_as_desc_tl_ist_formula(tip_desc, tl_ist_formula);
            _csetf_elpart_as_desc_weak_ist_formula(tip_desc, weak_ist_formula);
            _csetf_elpart_as_desc_hash(tip_desc, Sxhash.sxhash(weak_ist_formula));
        }
        return tip_desc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 54312L)
    public static SubLObject enummiss_clear_specific_assertion_information(final SubLObject desc) {
        _csetf_elpart_as_desc_id(desc, (SubLObject)el_partitions.NIL);
        _csetf_elpart_as_desc_extra(desc, (SubLObject)el_partitions.NIL);
        _csetf_elpart_as_desc_hash(desc, (SubLObject)el_partitions.NIL);
        _csetf_elpart_as_desc_tl_ist_formula(desc, (SubLObject)el_partitions.NIL);
        _csetf_elpart_as_desc_weak_ist_formula(desc, (SubLObject)el_partitions.NIL);
        return desc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 54622L)
    public static SubLObject enummiss_compute_weakened_ist_formula(final SubLObject tl_ist_formula) {
        SubLObject weak_formula = conses_high.copy_tree(tl_ist_formula);
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(weak_formula, (SubLObject)el_partitions.$sym140$ENUMMISS_TL_HP_NOTATION, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        SubLObject named_term = (SubLObject)el_partitions.NIL;
        named_term = cdolist_list_var.first();
        while (el_partitions.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = named_term;
            SubLObject hp_marker = (SubLObject)el_partitions.NIL;
            SubLObject constant_name = (SubLObject)el_partitions.NIL;
            SubLObject guid = (SubLObject)el_partitions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list139);
            hp_marker = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list139);
            constant_name = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list139);
            guid = current.first();
            current = current.rest();
            if (el_partitions.NIL == current) {
                SubLObject current_$38;
                final SubLObject datum_$37 = current_$38 = guid;
                SubLObject guid_marker = (SubLObject)el_partitions.NIL;
                SubLObject guid_string = (SubLObject)el_partitions.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$38, datum_$37, (SubLObject)el_partitions.$list53);
                guid_marker = current_$38.first();
                current_$38 = current_$38.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$38, datum_$37, (SubLObject)el_partitions.$list53);
                guid_string = current_$38.first();
                current_$38 = current_$38.rest();
                if (el_partitions.NIL == current_$38) {
                    final SubLObject new_named_term = guid_string;
                    weak_formula = cycl_utilities.expression_nsubst(new_named_term, named_term, weak_formula, (SubLObject)el_partitions.EQUAL, (SubLObject)el_partitions.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$37, (SubLObject)el_partitions.$list53);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list139);
            }
            cdolist_list_var = cdolist_list_var.rest();
            named_term = cdolist_list_var.first();
        }
        return weak_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 55464L)
    public static SubLObject enummiss_tl_hp_notation(final SubLObject v_object) {
        if (!v_object.isCons() || el_partitions.$kw141$HP != ConsesLow.nth((SubLObject)el_partitions.ZERO_INTEGER, v_object) || !ConsesLow.nth((SubLObject)el_partitions.ONE_INTEGER, v_object).isString() || el_partitions.NIL == list_utilities.lengthE(v_object, (SubLObject)el_partitions.THREE_INTEGER, (SubLObject)el_partitions.UNPROVIDED)) {
            return (SubLObject)el_partitions.NIL;
        }
        final SubLObject guid_part = ConsesLow.nth((SubLObject)el_partitions.TWO_INTEGER, v_object);
        return (SubLObject)SubLObjectFactory.makeBoolean(guid_part.isCons() && el_partitions.$kw52$GUID == ConsesLow.nth((SubLObject)el_partitions.ZERO_INTEGER, guid_part) && ConsesLow.nth((SubLObject)el_partitions.ONE_INTEGER, guid_part).isString() && el_partitions.NIL != list_utilities.lengthE(guid_part, (SubLObject)el_partitions.TWO_INTEGER, (SubLObject)el_partitions.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 55928L)
    public static SubLObject enumerate_missing_assertions_before_shared(final SubLObject fvector, final SubLObject data_sink, final SubLObject branch_index) {
        SubLObject last_index = Numbers.subtract(file_vector.file_vector_length(fvector), (SubLObject)el_partitions.ONE_INTEGER);
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        while (branch_index.numL(last_index)) {
            file_vector.position_file_vector(fvector, last_index);
            final SubLObject branch_as_id = cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            final SubLObject branch_tl_ist_formula = cfasl.cfasl_input(data_stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            note_el_partition_branch_assertion_delete(data_sink, branch_tl_ist_formula);
            last_index = Numbers.subtract(last_index, (SubLObject)el_partitions.ONE_INTEGER);
        }
        return data_sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 56751L)
    public static SubLObject scan_enumerate_branch_assertions_missing_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject relevant_id_space) {
        if (relevant_id_space == el_partitions.UNPROVIDED) {
            relevant_id_space = (SubLObject)el_partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !relevant_id_space.isVector()) {
            Errors.error((SubLObject)el_partitions.$str142$Sorry__FAST_is_currently_not_impl);
        }
        final SubLObject data_file = pickling_data_filename(pickled_file_stem);
        final SubLObject index_file = pickling_index_filename(pickled_file_stem);
        SubLObject last_shared_as_id = (SubLObject)el_partitions.MINUS_ONE_INTEGER;
        SubLObject fvector = (SubLObject)el_partitions.NIL;
        try {
            fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)el_partitions.$kw65$INPUT, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
            final SubLObject branch_count = file_vector.file_vector_length(fvector);
            SubLObject last_shared_branch_index = (SubLObject)el_partitions.MINUS_ONE_INTEGER;
            SubLObject index_skew = (SubLObject)el_partitions.ZERO_INTEGER;
            final SubLObject message = Sequences.cconcatenate((SubLObject)el_partitions.$str94$Analyzing_, new SubLObject[] { format_nil.format_nil_a_no_copy(branch_count), el_partitions.$str143$_branch_assertions_____ });
            final SubLObject branch_as = make_elpart_as_desc((SubLObject)el_partitions.UNPROVIDED);
            final SubLObject tip_as = make_elpart_as_desc((SubLObject)el_partitions.UNPROVIDED);
            final SubLObject branch_limit = Numbers.subtract(branch_count, (SubLObject)el_partitions.ONE_INTEGER);
            final SubLObject tip_limit = relevant_id_space.isVector() ? Sequences.length(relevant_id_space) : Numbers.subtract(assertion_handles.assertion_count(), (SubLObject)el_partitions.ONE_INTEGER);
            SubLObject doneP = (SubLObject)el_partitions.NIL;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)el_partitions.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)el_partitions.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)el_partitions.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    while (el_partitions.NIL == doneP) {
                        SubLObject offset = (SubLObject)el_partitions.ONE_INTEGER;
                        SubLObject branch_index = Numbers.add(last_shared_branch_index, offset);
                        SubLObject situation = (SubLObject)el_partitions.NIL;
                        utilities_macros.note_percent_progress(branch_index, branch_limit);
                        scan_enummiss_load_branch_assertion(branch_as, fvector, branch_index, branch_limit);
                        if (relevant_id_space.isVector()) {
                            scan_enummiss_corresponding_relevant_tip_assertion(tip_as, branch_index, index_skew, relevant_id_space);
                        }
                        else {
                            scan_enummiss_corresponding_tip_assertion(tip_as, branch_as, index_skew, tip_limit);
                        }
                        final SubLObject pcase_var;
                        situation = (pcase_var = scan_enummiss_classify_situation(branch_as, tip_as));
                        if (pcase_var.eql((SubLObject)el_partitions.$kw144$BOTH_INVALID)) {
                            doneP = (SubLObject)el_partitions.T;
                        }
                        else if (pcase_var.eql((SubLObject)el_partitions.$kw145$INVALID_BRANCH)) {
                            doneP = (SubLObject)el_partitions.T;
                        }
                        else if (pcase_var.eql((SubLObject)el_partitions.$kw146$INVALID_TIP)) {
                            enumerate_missing_assertions_before_shared(fvector, data_sink, branch_count);
                            doneP = (SubLObject)el_partitions.T;
                        }
                        else if (pcase_var.eql((SubLObject)el_partitions.$kw147$DIFFERENT)) {
                            note_el_partition_branch_assertion_delete(data_sink, elpart_as_desc_tl_ist_formula(branch_as));
                            index_skew = Numbers.add(index_skew, (SubLObject)el_partitions.ONE_INTEGER);
                            last_shared_branch_index = branch_index;
                        }
                        else if (pcase_var.eql((SubLObject)el_partitions.$kw148$EQUAL)) {
                            while (situation == el_partitions.$kw148$EQUAL) {
                                last_shared_branch_index = branch_index;
                                last_shared_as_id = elpart_as_desc_id(tip_as);
                                utilities_macros.note_percent_progress(last_shared_branch_index, branch_limit);
                                branch_index = Numbers.add(last_shared_branch_index, offset);
                                offset = Numbers.add(offset, offset);
                                scan_enummiss_load_branch_assertion(branch_as, fvector, branch_index, branch_limit);
                                if (relevant_id_space.isVector()) {
                                    scan_enummiss_corresponding_relevant_tip_assertion(tip_as, branch_index, index_skew, relevant_id_space);
                                }
                                else {
                                    scan_enummiss_corresponding_tip_assertion(tip_as, branch_as, index_skew, tip_limit);
                                }
                                situation = scan_enummiss_classify_situation(branch_as, tip_as);
                            }
                        }
                        else {
                            Errors.error((SubLObject)el_partitions.$str149$Unknown_state__A____do_not_know_w, situation);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
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
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)el_partitions.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (el_partitions.NIL != file_vector.file_vector_p(fvector)) {
                    file_vector.close_file_vector(fvector);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return assertion_handles.find_assertion_by_id(last_shared_as_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 61509L)
    public static SubLObject scan_enummiss_load_branch_assertion(final SubLObject branch_as, final SubLObject fvector, final SubLObject branch_index, final SubLObject branch_limit) {
        if (branch_limit.numL(branch_index)) {
            enummiss_clear_specific_assertion_information(branch_as);
        }
        else {
            enummiss_fetch_specific_assertion_information(fvector, branch_as, branch_index);
        }
        return branch_as;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 61825L)
    public static SubLObject scan_enummiss_corresponding_relevant_tip_assertion(final SubLObject tip_as, final SubLObject branch_index, final SubLObject index_skew, final SubLObject relevant_id_space) {
        final SubLObject tip_index = Numbers.subtract(branch_index, index_skew);
        enummiss_clear_specific_assertion_information(tip_as);
        if (el_partitions.NIL != subl_promotions.non_negative_integer_p(tip_index) && tip_index.numL(Sequences.length(relevant_id_space))) {
            final SubLObject tip_as_id = Vectors.aref(relevant_id_space, tip_index);
            enummiss_compute_specific_assertion_information(tip_as, tip_as_id);
        }
        return tip_as;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 62325L)
    public static SubLObject scan_enummiss_corresponding_tip_assertion(final SubLObject tip_as, final SubLObject branch_as, final SubLObject index_skew, final SubLObject tip_limit) {
        final SubLObject branch_as_id = elpart_as_desc_id(branch_as);
        if (el_partitions.NIL != subl_promotions.non_negative_integer_p(branch_as_id)) {
            final SubLObject tip_index = Numbers.subtract(branch_as_id, index_skew);
            scan_enummiss_load_tip_assertion(tip_as, tip_index, tip_limit);
        }
        else {
            enummiss_clear_specific_assertion_information(tip_as);
        }
        return tip_as;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 62747L)
    public static SubLObject scan_enummiss_load_tip_assertion(final SubLObject tip_as, final SubLObject tip_index, final SubLObject tip_limit) {
        if (tip_limit.numL(tip_index)) {
            enummiss_clear_specific_assertion_information(tip_as);
        }
        else {
            final SubLObject tip_as_id = enummiss_find_previous_relevant_assertion(Numbers.add((SubLObject)el_partitions.ONE_INTEGER, tip_index));
            enummiss_compute_specific_assertion_information(tip_as, tip_as_id);
        }
        return tip_as;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 63188L)
    public static SubLObject scan_enummiss_classify_situation(final SubLObject branch_as, final SubLObject tip_as) {
        if (el_partitions.NIL == elpart_as_desc_hash(branch_as)) {
            if (el_partitions.NIL == elpart_as_desc_hash(tip_as)) {
                return (SubLObject)el_partitions.$kw144$BOTH_INVALID;
            }
            return (SubLObject)el_partitions.$kw145$INVALID_BRANCH;
        }
        else {
            if (el_partitions.NIL == elpart_as_desc_hash(tip_as)) {
                return (SubLObject)el_partitions.$kw146$INVALID_TIP;
            }
            if (el_partitions.NIL != same_elpart_as_descP(branch_as, tip_as)) {
                return (SubLObject)el_partitions.$kw148$EQUAL;
            }
            return (SubLObject)el_partitions.$kw147$DIFFERENT;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 65709L)
    public static SubLObject test_helper_get_assertion(final SubLObject v, final SubLObject i) {
        if (el_partitions.NIL != subl_promotions.non_negative_integer_p(i) && i.numL(Sequences.length(v))) {
            return Vectors.aref(v, i);
        }
        return (SubLObject)el_partitions.$kw158$INVALID;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 65878L)
    public static SubLObject test_helper_classify_situation(final SubLObject branch_as, final SubLObject tip_as) {
        if (el_partitions.$kw158$INVALID == branch_as) {
            if (el_partitions.$kw158$INVALID == tip_as) {
                return (SubLObject)el_partitions.$kw144$BOTH_INVALID;
            }
            return (SubLObject)el_partitions.$kw145$INVALID_BRANCH;
        }
        else {
            if (el_partitions.$kw158$INVALID == tip_as) {
                return (SubLObject)el_partitions.$kw146$INVALID_TIP;
            }
            if (branch_as.equal(tip_as)) {
                return (SubLObject)el_partitions.$kw148$EQUAL;
            }
            return (SubLObject)el_partitions.$kw147$DIFFERENT;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 66222L)
    public static SubLObject test_el_partition_simple_scan_algorithm(final SubLObject branch_ases, final SubLObject tip_ases) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operations = (SubLObject)el_partitions.NIL;
        SubLObject last_shared_branch_index = (SubLObject)el_partitions.MINUS_ONE_INTEGER;
        SubLObject index_skew = (SubLObject)el_partitions.ZERO_INTEGER;
        final SubLObject limit = Numbers.multiply(Sequences.length(branch_ases), Sequences.length(tip_ases));
        SubLObject step = (SubLObject)el_partitions.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)el_partitions.NIL;
        while (el_partitions.NIL == doneP) {
            step = Numbers.add(step, (SubLObject)el_partitions.ONE_INTEGER);
            if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !step.numL(limit)) {
                Errors.error((SubLObject)el_partitions.$str159$Someone_is_whaffling_____);
            }
            SubLObject offset = (SubLObject)el_partitions.ONE_INTEGER;
            SubLObject branch_index = Numbers.add(last_shared_branch_index, offset);
            SubLObject tip_index = Numbers.subtract(branch_index, index_skew);
            SubLObject branch_as = test_helper_get_assertion(branch_ases, branch_index);
            SubLObject tip_as = test_helper_get_assertion(tip_ases, tip_index);
            final SubLObject pcase_var;
            SubLObject situation = pcase_var = test_helper_classify_situation(branch_as, tip_as);
            if (pcase_var.eql((SubLObject)el_partitions.$kw144$BOTH_INVALID)) {
                doneP = (SubLObject)el_partitions.T;
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw145$INVALID_BRANCH)) {
                for (SubLObject sequence_var = Sequences.subseq(tip_ases, tip_index, (SubLObject)el_partitions.UNPROVIDED), end_index = (SubLObject)(sequence_var.isList() ? el_partitions.NIL : Sequences.length(sequence_var)), element_num = (SubLObject)el_partitions.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); el_partitions.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
                    final SubLObject as = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
                    operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)el_partitions.$kw160$CREATE, as), operations);
                    sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                    element_num = Numbers.add(element_num, (SubLObject)el_partitions.ONE_INTEGER);
                }
                doneP = (SubLObject)el_partitions.T;
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw146$INVALID_TIP)) {
                for (SubLObject sequence_var = Sequences.subseq(branch_ases, branch_index, (SubLObject)el_partitions.UNPROVIDED), end_index = (SubLObject)(sequence_var.isList() ? el_partitions.NIL : Sequences.length(sequence_var)), element_num = (SubLObject)el_partitions.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); el_partitions.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
                    final SubLObject as = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
                    operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)el_partitions.$kw161$DELETE, as), operations);
                    sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                    element_num = Numbers.add(element_num, (SubLObject)el_partitions.ONE_INTEGER);
                }
                doneP = (SubLObject)el_partitions.T;
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw147$DIFFERENT)) {
                operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)el_partitions.$kw161$DELETE, branch_as), operations);
                index_skew = Numbers.add(index_skew, (SubLObject)el_partitions.ONE_INTEGER);
                last_shared_branch_index = branch_index;
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw148$EQUAL)) {
                while (situation == el_partitions.$kw148$EQUAL) {
                    last_shared_branch_index = branch_index;
                    branch_index = Numbers.add(last_shared_branch_index, offset);
                    offset = Numbers.add(offset, offset);
                    tip_index = Numbers.subtract(branch_index, index_skew);
                    branch_as = test_helper_get_assertion(branch_ases, branch_index);
                    tip_as = test_helper_get_assertion(tip_ases, tip_index);
                    situation = test_helper_classify_situation(branch_as, tip_as);
                    step = Numbers.add(step, (SubLObject)el_partitions.ONE_INTEGER);
                    if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !step.numL(limit)) {
                        Errors.error((SubLObject)el_partitions.$str159$Someone_is_whaffling_____);
                    }
                }
            }
            else {
                Errors.error((SubLObject)el_partitions.$str149$Unknown_state__A____do_not_know_w, situation);
            }
        }
        return Sequences.nreverse(operations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 68585L)
    public static SubLObject generate_el_partition_simple_scan_case(final SubLObject size, final SubLObject additions, final SubLObject deletions) {
        final SubLObject blacklist = set.new_set((SubLObject)el_partitions.EQ, deletions);
        SubLObject change_log = (SubLObject)el_partitions.NIL;
        SubLObject branch_ases = (SubLObject)el_partitions.NIL;
        SubLObject tip_ases = (SubLObject)el_partitions.NIL;
        branch_ases = Vectors.make_vector(size, (SubLObject)el_partitions.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)el_partitions.NIL, i = (SubLObject)el_partitions.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)el_partitions.ONE_INTEGER)) {
            Vectors.set_aref(branch_ases, i, i);
        }
        while (set.set_size(blacklist).numL(deletions)) {
            set.set_add(random.random(size), blacklist);
        }
        final SubLObject tip_size = Numbers.add(size, additions, Numbers.minus(deletions));
        tip_ases = Vectors.make_vector(tip_size, (SubLObject)el_partitions.UNPROVIDED);
        SubLObject index = (SubLObject)el_partitions.ZERO_INTEGER;
        SubLObject j;
        for (j = (SubLObject)el_partitions.NIL, j = (SubLObject)el_partitions.ZERO_INTEGER; j.numL(size); j = Numbers.add(j, (SubLObject)el_partitions.ONE_INTEGER)) {
            if (el_partitions.NIL != set.set_memberP(j, blacklist)) {
                change_log = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)el_partitions.$kw161$DELETE, j), change_log);
            }
            else {
                Vectors.set_aref(tip_ases, index, j);
                index = Numbers.add(index, (SubLObject)el_partitions.ONE_INTEGER);
            }
        }
        SubLObject value;
        for (j = (SubLObject)el_partitions.NIL, j = (SubLObject)el_partitions.ZERO_INTEGER; j.numL(additions); j = Numbers.add(j, (SubLObject)el_partitions.ONE_INTEGER)) {
            value = Numbers.add(size, j);
            change_log = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)el_partitions.$kw160$CREATE, value), change_log);
            Vectors.set_aref(tip_ases, index, value);
            index = Numbers.add(index, (SubLObject)el_partitions.ONE_INTEGER);
        }
        return Values.values(branch_ases, tip_ases, Sequences.nreverse(change_log));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 70162L)
    public static SubLObject test_random_el_partition_simple_scan_cases(final SubLObject n, final SubLObject size, final SubLObject addition_range, final SubLObject deletions_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        SubLObject additions;
        SubLObject deletions;
        SubLObject branch_ases;
        SubLObject tip_ases;
        SubLObject expected_change_log;
        SubLObject actual_change_log;
        for (i = (SubLObject)el_partitions.NIL, i = (SubLObject)el_partitions.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)el_partitions.ONE_INTEGER)) {
            additions = random.random(addition_range);
            deletions = random.random(deletions_range);
            thread.resetMultipleValues();
            branch_ases = generate_el_partition_simple_scan_case(size, additions, deletions);
            tip_ases = thread.secondMultipleValue();
            expected_change_log = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            actual_change_log = test_el_partition_simple_scan_algorithm(branch_ases, tip_ases);
            if (el_partitions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_change_log.equal(actual_change_log)) {
                Errors.error((SubLObject)el_partitions.$str164$Expected__A__got__A_instead_, expected_change_log, actual_change_log);
            }
        }
        return (SubLObject)el_partitions.$kw165$OK;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject el_partition_data_sink_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)el_partitions.ZERO_INTEGER);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject el_partition_data_sink_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $el_partition_data_sink_native.class) ? el_partitions.T : el_partitions.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject elpart_dsink_state(final SubLObject v_object) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject elpart_dsink_branch_cdel_fn(final SubLObject v_object) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject elpart_dsink_branch_asdel_fn(final SubLObject v_object) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject elpart_dsink_tip_ccreate_fn(final SubLObject v_object) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject elpart_dsink_tip_ascreate_fn(final SubLObject v_object) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject elpart_dsink_tip_asreassert_fn(final SubLObject v_object) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject _csetf_elpart_dsink_state(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject _csetf_elpart_dsink_branch_cdel_fn(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject _csetf_elpart_dsink_branch_asdel_fn(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject _csetf_elpart_dsink_tip_ccreate_fn(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject _csetf_elpart_dsink_tip_ascreate_fn(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject _csetf_elpart_dsink_tip_asreassert_fn(final SubLObject v_object, final SubLObject value) {
        assert el_partitions.NIL != el_partition_data_sink_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject make_el_partition_data_sink(SubLObject arglist) {
        if (arglist == el_partitions.UNPROVIDED) {
            arglist = (SubLObject)el_partitions.NIL;
        }
        final SubLObject v_new = (SubLObject)new $el_partition_data_sink_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)el_partitions.NIL, next = arglist; el_partitions.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)el_partitions.$kw186$STATE)) {
                _csetf_elpart_dsink_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw187$BRANCH_CDEL_FN)) {
                _csetf_elpart_dsink_branch_cdel_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw188$BRANCH_ASDEL_FN)) {
                _csetf_elpart_dsink_branch_asdel_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw189$TIP_CCREATE_FN)) {
                _csetf_elpart_dsink_tip_ccreate_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw190$TIP_ASCREATE_FN)) {
                _csetf_elpart_dsink_tip_ascreate_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)el_partitions.$kw191$TIP_ASREASSERT_FN)) {
                _csetf_elpart_dsink_tip_asreassert_fn(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)el_partitions.$str121$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject visit_defstruct_el_partition_data_sink(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw122$BEGIN, (SubLObject)el_partitions.$sym192$MAKE_EL_PARTITION_DATA_SINK, (SubLObject)el_partitions.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw186$STATE, elpart_dsink_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw187$BRANCH_CDEL_FN, elpart_dsink_branch_cdel_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw188$BRANCH_ASDEL_FN, elpart_dsink_branch_asdel_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw189$TIP_CCREATE_FN, elpart_dsink_tip_ccreate_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw190$TIP_ASCREATE_FN, elpart_dsink_tip_ascreate_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw124$SLOT, (SubLObject)el_partitions.$kw191$TIP_ASREASSERT_FN, elpart_dsink_tip_asreassert_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)el_partitions.$kw125$END, (SubLObject)el_partitions.$sym192$MAKE_EL_PARTITION_DATA_SINK, (SubLObject)el_partitions.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
    public static SubLObject visit_defstruct_object_el_partition_data_sink_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_el_partition_data_sink(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72628L)
    public static SubLObject new_el_partition_data_sink(final SubLObject state, final SubLObject branch_constant_delete_fn, final SubLObject branch_assertion_delete_fn, final SubLObject tip_constant_create_fn, final SubLObject tip_assertion_create_fn, final SubLObject tip_assertion_reassert_fn) {
        final SubLObject sink = make_el_partition_data_sink((SubLObject)el_partitions.UNPROVIDED);
        _csetf_elpart_dsink_state(sink, state);
        _csetf_elpart_dsink_branch_cdel_fn(sink, branch_constant_delete_fn);
        _csetf_elpart_dsink_branch_asdel_fn(sink, branch_assertion_delete_fn);
        _csetf_elpart_dsink_tip_ccreate_fn(sink, tip_constant_create_fn);
        _csetf_elpart_dsink_tip_ascreate_fn(sink, tip_assertion_create_fn);
        _csetf_elpart_dsink_tip_asreassert_fn(sink, tip_assertion_reassert_fn);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 73455L)
    public static SubLObject note_el_partition_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid) {
        final SubLObject cdel_fn = elpart_dsink_branch_cdel_fn(sink);
        Functions.funcall(cdel_fn, sink, name, guid);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 73722L)
    public static SubLObject note_el_partition_branch_assertion_delete(final SubLObject sink, final SubLObject tl_ist_formula) {
        final SubLObject asdel_fn = elpart_dsink_branch_asdel_fn(sink);
        Functions.funcall(asdel_fn, sink, tl_ist_formula);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 74002L)
    public static SubLObject note_el_partition_tip_constant_create(final SubLObject sink, final SubLObject constant) {
        final SubLObject ccreate_fn = elpart_dsink_tip_ccreate_fn(sink);
        Functions.funcall(ccreate_fn, sink, constant);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 74296L)
    public static SubLObject note_el_partition_tip_assertion_create(final SubLObject sink, final SubLObject assertion) {
        final SubLObject ascreate_fn = elpart_dsink_tip_ascreate_fn(sink);
        Functions.funcall(ascreate_fn, sink, assertion);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 74598L)
    public static SubLObject note_el_partition_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject strength, SubLObject direction) {
        if (strength == el_partitions.UNPROVIDED) {
            strength = (SubLObject)el_partitions.NIL;
        }
        if (direction == el_partitions.UNPROVIDED) {
            direction = (SubLObject)el_partitions.NIL;
        }
        final SubLObject ascreate_fn = elpart_dsink_tip_asreassert_fn(sink);
        Functions.funcall(ascreate_fn, sink, assertion, strength, direction);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 74952L)
    public static SubLObject get_el_partition_data_sink_state(final SubLObject sink) {
        return elpart_dsink_state(sink);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75758L)
    public static SubLObject with_el_partition_creator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list199);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject creator = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list199);
        creator = current.first();
        current = current.rest();
        if (el_partitions.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)el_partitions.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym200$_EL_PARTITION_CREATOR_OVERRIDE_, creator)), ConsesLow.append(body, (SubLObject)el_partitions.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list199);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75938L)
    public static SubLObject with_el_partition_creation_purpose(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list201);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject purpose = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list201);
        purpose = current.first();
        current = current.rest();
        if (el_partitions.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)el_partitions.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym202$_EL_PARTITION_CREATION_PURPOSE_OVERRIDE_, purpose)), ConsesLow.append(body, (SubLObject)el_partitions.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list201);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 76140L)
    public static SubLObject with_el_partition_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list203);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list203);
        mt = current.first();
        current = current.rest();
        if (el_partitions.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)el_partitions.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym204$_EL_PARTITION_MT_OVERRIDE_, mt)), ConsesLow.append(body, (SubLObject)el_partitions.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list203);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 76298L)
    public static SubLObject with_el_partition_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list205);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction = (SubLObject)el_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_partitions.$list205);
        direction = current.first();
        current = current.rest();
        if (el_partitions.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)el_partitions.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_partitions.$sym206$_EL_PARTITION_DIRECTION_OVERRIDE_, direction)), ConsesLow.append(body, (SubLObject)el_partitions.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_partitions.$list205);
        return (SubLObject)el_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 76484L)
    public static SubLObject without_el_partition_creation_purpose(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)el_partitions.$sym5$CLET, (SubLObject)el_partitions.$list207, ConsesLow.append(body, (SubLObject)el_partitions.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 76762L)
    public static SubLObject new_transcript_el_partition_data_sink(final SubLObject stream) {
        return new_el_partition_data_sink(stream, (SubLObject)el_partitions.$sym208$TRANSCRIPT_DATA_SINK_BRANCH_CONSTANT_DELETE, (SubLObject)el_partitions.$sym209$TRANSCRIPT_DATA_SINK_BRANCH_ASSERTION_DELETE, (SubLObject)el_partitions.$sym210$TRANSCRIPT_DATA_SINK_TIP_CONSTANT_CREATE, (SubLObject)el_partitions.$sym211$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_CREATE, (SubLObject)el_partitions.$sym212$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_REASSERT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 77290L)
    public static SubLObject transcript_data_sink_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        transcript_data_sink_form_prologue(stream);
        final SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        try {
            print_high.$print_level$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_length$.bind((SubLObject)el_partitions.NIL, thread);
            PrintLow.format(stream, (SubLObject)el_partitions.$str213$_FI_KILL____HP__S__S__, name, guid);
        }
        finally {
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_level$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_form_epilogue(stream);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 77874L)
    public static SubLObject transcript_data_sink_branch_assertion_delete(final SubLObject sink, final SubLObject pickled_tl_ist_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject tl_ist_formula = unpickle_assertion_pickling_format(pickled_tl_ist_formula);
        final SubLObject tl_elmt = cycl_utilities.formula_arg1(tl_ist_formula, (SubLObject)el_partitions.UNPROVIDED);
        transcript_data_sink_form_prologue(stream);
        final SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        try {
            print_high.$print_level$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_length$.bind((SubLObject)el_partitions.NIL, thread);
            PrintLow.format(stream, (SubLObject)el_partitions.$str214$_FI_UNASSERT___S___S_, tl_ist_formula, tl_elmt);
        }
        finally {
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_level$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_form_epilogue(stream);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 78961L)
    public static SubLObject transcript_data_sink_tip_constant_create(final SubLObject sink, final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject guid = constants_high.constant_external_id(constant);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_length$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_level$.bind((SubLObject)el_partitions.NIL, thread);
            transcript_data_sink_form_prologue(stream);
            PrintLow.format(stream, (SubLObject)el_partitions.$str215$_FI_CREATE___S__S_, name, guid);
            transcript_data_sink_form_epilogue(stream);
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_tip_constant_timestamp(sink, constant);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 79638L)
    public static SubLObject transcript_data_sink_tip_assertion_create(final SubLObject sink, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        final SubLObject elmt = (el_partitions.NIL != el_partitions.$el_partition_mt_override$.getDynamicValue(thread)) ? el_partitions.$el_partition_mt_override$.getDynamicValue(thread) : cycl_utilities.formula_arg1(ist_formula, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject formula = cycl_utilities.formula_arg2(ist_formula, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject direction = (el_partitions.NIL != el_partitions.$el_partition_direction_override$.getDynamicValue(thread)) ? el_partitions.$el_partition_direction_override$.getDynamicValue(thread) : assertions_high.assertion_direction(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_length$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_level$.bind((SubLObject)el_partitions.NIL, thread);
            transcript_data_sink_form_prologue(stream);
            PrintLow.format(stream, (SubLObject)el_partitions.$str216$_FI_ASSERT___S___S___S___S_, new SubLObject[] { encapsulation.encapsulate(formula), encapsulation.encapsulate(elmt), strength, direction });
            transcript_data_sink_form_epilogue(stream);
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_tip_assertion_timestamp(sink, assertion);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 80928L)
    public static SubLObject transcript_data_sink_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject new_strength, SubLObject new_direction) {
        if (new_strength == el_partitions.UNPROVIDED) {
            new_strength = (SubLObject)el_partitions.NIL;
        }
        if (new_direction == el_partitions.UNPROVIDED) {
            new_direction = (SubLObject)el_partitions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject ist_formula = canon_tl.assertion_tl_ist_formula(assertion);
        final SubLObject elmt = (el_partitions.NIL != el_partitions.$el_partition_mt_override$.getDynamicValue(thread)) ? el_partitions.$el_partition_mt_override$.getDynamicValue(thread) : cycl_utilities.formula_arg1(ist_formula, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject direction = (el_partitions.NIL != el_partitions.$el_partition_direction_override$.getDynamicValue(thread)) ? el_partitions.$el_partition_direction_override$.getDynamicValue(thread) : ((el_partitions.NIL != new_direction) ? new_direction : assertions_high.assertion_direction(assertion));
        final SubLObject strength = (el_partitions.NIL != new_strength) ? new_strength : assertions_high.assertion_strength(assertion);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_length$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_level$.bind((SubLObject)el_partitions.NIL, thread);
            transcript_data_sink_form_prologue(stream);
            PrintLow.format(stream, (SubLObject)el_partitions.$str217$_FI_REASSERT___S___S___S___S_, new SubLObject[] { encapsulation.encapsulate(ist_formula), encapsulation.encapsulate(elmt), strength, direction });
            transcript_data_sink_form_epilogue(stream);
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_tip_assertion_timestamp(sink, assertion);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 82749L)
    public static SubLObject transcript_data_sink_tip_constant_timestamp(final SubLObject sink, final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject creator = transcript_data_sink_clean_fort((el_partitions.NIL != el_partitions.$el_partition_creator_override$.getDynamicValue(thread)) ? el_partitions.$el_partition_creator_override$.getDynamicValue(thread) : bookkeeping_store.creator(constant, (SubLObject)el_partitions.UNPROVIDED));
        final SubLObject time = bookkeeping_store.creation_time(constant, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject purpose = transcript_data_sink_clean_fort((el_partitions.NIL != el_partitions.$el_partition_creation_purpose_override$.getDynamicValue(thread)) ? el_partitions.$el_partition_creation_purpose_override$.getDynamicValue(thread) : bookkeeping_store.creation_purpose(constant, (SubLObject)el_partitions.UNPROVIDED));
        final SubLObject second = bookkeeping_store.creation_second(constant, (SubLObject)el_partitions.UNPROVIDED);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_length$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_level$.bind((SubLObject)el_partitions.NIL, thread);
            transcript_data_sink_form_prologue(stream);
            PrintLow.format(stream, (SubLObject)el_partitions.$str218$_FI_TIMESTAMP_CONSTANT___S___S___, new SubLObject[] { encapsulation.encapsulate(creator), encapsulation.encapsulate(time), encapsulation.encapsulate(purpose), encapsulation.encapsulate(second) });
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_form_epilogue(stream);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 83908L)
    public static SubLObject transcript_data_sink_tip_assertion_timestamp(final SubLObject sink, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject creator = transcript_data_sink_clean_fort((el_partitions.NIL != el_partitions.$el_partition_creator_override$.getDynamicValue(thread)) ? el_partitions.$el_partition_creator_override$.getDynamicValue(thread) : assertions_high.asserted_by(assertion));
        final SubLObject time = assertions_high.asserted_when(assertion);
        final SubLObject purpose = transcript_data_sink_clean_fort((el_partitions.NIL != el_partitions.$el_partition_creation_purpose_override$.getDynamicValue(thread)) ? el_partitions.$el_partition_creation_purpose_override$.getDynamicValue(thread) : assertions_high.asserted_why(assertion));
        final SubLObject second = assertions_high.asserted_second(assertion);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_length$.bind((SubLObject)el_partitions.NIL, thread);
            print_high.$print_level$.bind((SubLObject)el_partitions.NIL, thread);
            transcript_data_sink_form_prologue(stream);
            PrintLow.format(stream, (SubLObject)el_partitions.$str219$_FI_TIMESTAMP_ASSERTION___S___S__, new SubLObject[] { encapsulation.encapsulate(creator), encapsulation.encapsulate(time), encapsulation.encapsulate(purpose), encapsulation.encapsulate(second) });
            transcript_data_sink_form_epilogue(stream);
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85075L)
    public static SubLObject transcript_data_sink_clean_fort(final SubLObject v_object) {
        return (SubLObject)((el_partitions.NIL != forts.valid_fortP(v_object)) ? v_object : el_partitions.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85395L)
    public static SubLObject transcript_data_sink_form_prologue(final SubLObject stream) {
        streams_high.fresh_line(stream);
        streams_high.write_string((SubLObject)el_partitions.$str221$_, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        print_high.prin1(el_partitions.$transcript_marker_guest_cyclist$.getGlobalValue(), stream);
        streams_high.write_string((SubLObject)el_partitions.$str132$_, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        print_high.prin1(control_vars.cyc_image_id(), stream);
        streams_high.write_string((SubLObject)el_partitions.$str132$_, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        print_high.prin1(numeric_date_utilities.get_universal_date((SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED), stream);
        streams_high.write_string((SubLObject)el_partitions.$str132$_, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85727L)
    public static SubLObject transcript_data_sink_form_epilogue(final SubLObject stream) {
        streams_high.write_string((SubLObject)el_partitions.$str222$_, stream, (SubLObject)el_partitions.UNPROVIDED, (SubLObject)el_partitions.UNPROVIDED);
        streams_high.terpri(stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85850L)
    public static SubLObject new_debug_el_partition_data_sink(SubLObject stream) {
        if (stream == el_partitions.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return new_el_partition_data_sink(stream, (SubLObject)el_partitions.$sym223$DEBUG_DATA_SINK_BRANCH_CONSTANT_DELETE, (SubLObject)el_partitions.$sym224$DEBUG_DATA_SINK_BRANCH_ASSERTION_DELETE, (SubLObject)el_partitions.$sym225$DEBUG_DATA_SINK_TIP_CONSTANT_CREATE, (SubLObject)el_partitions.$sym226$DEBUG_DATA_SINK_TIP_ASSERTION_CREATE, (SubLObject)el_partitions.$sym227$DEBUG_DATA_SINK_TIP_ASSERTION_REASSERT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 86486L)
    public static SubLObject debug_data_sink_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid) {
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        PrintLow.format(stream, (SubLObject)el_partitions.$str228$___kill__A__A__, name, guid);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 86682L)
    public static SubLObject debug_data_sink_branch_assertion_delete(final SubLObject sink, final SubLObject tl_ist_formula) {
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        PrintLow.format(stream, (SubLObject)el_partitions.$str229$___unassert__A__, tl_ist_formula);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 86889L)
    public static SubLObject debug_data_sink_tip_constant_create(final SubLObject sink, final SubLObject constant) {
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject guid = constants_high.constant_external_id(constant);
        PrintLow.format(stream, (SubLObject)el_partitions.$str230$___create__A__A__, name, guid);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 87172L)
    public static SubLObject debug_data_sink_tip_assertion_create(final SubLObject sink, final SubLObject assertion) {
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        PrintLow.format(stream, (SubLObject)el_partitions.$str231$___assert__A__, ist_formula);
        return sink;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 87426L)
    public static SubLObject debug_data_sink_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject strength, SubLObject direction) {
        if (strength == el_partitions.UNPROVIDED) {
            strength = (SubLObject)el_partitions.NIL;
        }
        if (direction == el_partitions.UNPROVIDED) {
            direction = (SubLObject)el_partitions.NIL;
        }
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        PrintLow.format(stream, (SubLObject)el_partitions.$str232$___reassert__A__A__A__, new SubLObject[] { ist_formula, strength, direction });
        return sink;
    }
    
    public static SubLObject declare_el_partitions_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "with_pickling_stream_buffer_size", "WITH-PICKLING-STREAM-BUFFER-SIZE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "with_pickling_pacficiation", "WITH-PICKLING-PACFICIATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "el_partition_relevant_constantP", "EL-PARTITION-RELEVANT-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "el_partition_relevant_assertionP", "EL-PARTITION-RELEVANT-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "pickle_constants", "PICKLE-CONSTANTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "do_pickled_constants", "DO-PICKLED-CONSTANTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "pickle_assertions", "PICKLE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "pickling_index_filename", "PICKLING-INDEX-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "pickling_data_filename", "PICKLING-DATA-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "assertion_to_pickling_format", "ASSERTION-TO-PICKLING-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "unpickle_assertion_pickling_format", "UNPICKLE-ASSERTION-PICKLING-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "convert_guid_to_pickling_format", "CONVERT-GUID-TO-PICKLING-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "pickled_guid_format_p", "PICKLED-GUID-FORMAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "restore_guid_from_pickling_format", "RESTORE-GUID-FROM-PICKLING-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "new_relevant_assertions_id_space", "NEW-RELEVANT-ASSERTIONS-ID-SPACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "compare_pickled_kb_to_current_kb", "COMPARE-PICKLED-KB-TO-CURRENT-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enumerate_additions_to_current_kb", "ENUMERATE-ADDITIONS-TO-CURRENT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "compare_pickled_kb_to_current_kb_constants", "COMPARE-PICKLED-KB-TO-CURRENT-KB-CONSTANTS", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "update_as_iteration_state", "UPDATE-AS-ITERATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "decrement_tip_index", "DECREMENT-TIP-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "find_most_recent_assertion_shared_with_branch", "FIND-MOST-RECENT-ASSERTION-SHARED-WITH-BRANCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "compare_pickled_kb_to_current_kb_assertions", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "compare_pickled_kb_to_current_kb_assertions_internal", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "compare_pickled_kb_to_current_kb_assertions_scan_forward_fast", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-SCAN-FORWARD-FAST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "compare_pickled_kb_to_current_kb_assertions_scan_forward_steady", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-SCAN-FORWARD-STEADY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "compare_pickled_kb_to_current_kb_assertions_novel_forward", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-NOVEL-FORWARD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "compare_pickled_kb_to_current_kb_assertions_classic_backward", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-CLASSIC-BACKWARD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enumerate_tip_assertions_from_current_kb", "ENUMERATE-TIP-ASSERTIONS-FROM-CURRENT-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enumerate_branch_assertions_absent_from_current_kb", "ENUMERATE-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_as_desc_print_function_trampoline", "ELPART-AS-DESC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_as_desc_p", "ELPART-AS-DESC-P", 1, 0, false);
        new $elpart_as_desc_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_as_desc_id", "ELPART-AS-DESC-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_as_desc_tl_ist_formula", "ELPART-AS-DESC-TL-IST-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_as_desc_hash", "ELPART-AS-DESC-HASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_as_desc_extra", "ELPART-AS-DESC-EXTRA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_as_desc_weak_ist_formula", "ELPART-AS-DESC-WEAK-IST-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_as_desc_id", "_CSETF-ELPART-AS-DESC-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_as_desc_tl_ist_formula", "_CSETF-ELPART-AS-DESC-TL-IST-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_as_desc_hash", "_CSETF-ELPART-AS-DESC-HASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_as_desc_extra", "_CSETF-ELPART-AS-DESC-EXTRA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_as_desc_weak_ist_formula", "_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "make_elpart_as_desc", "MAKE-ELPART-AS-DESC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "visit_defstruct_elpart_as_desc", "VISIT-DEFSTRUCT-ELPART-AS-DESC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "visit_defstruct_object_elpart_as_desc_method", "VISIT-DEFSTRUCT-OBJECT-ELPART-AS-DESC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "print_elpart_as_desc", "PRINT-ELPART-AS-DESC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "identify_branch_assertions_absent_from_current_kb", "IDENTIFY-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "identify_branch_assertions_absent_from_current_kb_int", "IDENTIFY-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "find_start_of_el_partition_relevant_assertions", "FIND-START-OF-EL-PARTITION-RELEVANT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "fetch_branch_limit_information_for_pickled_kb", "FETCH-BRANCH-LIMIT-INFORMATION-FOR-PICKLED-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enumerate_branch_assertions_missing_from_current_kb", "ENUMERATE-BRANCH-ASSERTIONS-MISSING-FROM-CURRENT-KB", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "same_elpart_as_descP", "SAME-ELPART-AS-DESC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enummiss_find_previous_relevant_assertion", "ENUMMISS-FIND-PREVIOUS-RELEVANT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enummiss_find_next_relevant_assertion", "ENUMMISS-FIND-NEXT-RELEVANT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enummiss_fetch_specific_assertion_information", "ENUMMISS-FETCH-SPECIFIC-ASSERTION-INFORMATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enummiss_compute_specific_assertion_information", "ENUMMISS-COMPUTE-SPECIFIC-ASSERTION-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enummiss_clear_specific_assertion_information", "ENUMMISS-CLEAR-SPECIFIC-ASSERTION-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enummiss_compute_weakened_ist_formula", "ENUMMISS-COMPUTE-WEAKENED-IST-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enummiss_tl_hp_notation", "ENUMMISS-TL-HP-NOTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "enumerate_missing_assertions_before_shared", "ENUMERATE-MISSING-ASSERTIONS-BEFORE-SHARED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "scan_enumerate_branch_assertions_missing_from_current_kb", "SCAN-ENUMERATE-BRANCH-ASSERTIONS-MISSING-FROM-CURRENT-KB", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "scan_enummiss_load_branch_assertion", "SCAN-ENUMMISS-LOAD-BRANCH-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "scan_enummiss_corresponding_relevant_tip_assertion", "SCAN-ENUMMISS-CORRESPONDING-RELEVANT-TIP-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "scan_enummiss_corresponding_tip_assertion", "SCAN-ENUMMISS-CORRESPONDING-TIP-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "scan_enummiss_load_tip_assertion", "SCAN-ENUMMISS-LOAD-TIP-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "scan_enummiss_classify_situation", "SCAN-ENUMMISS-CLASSIFY-SITUATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "test_helper_get_assertion", "TEST-HELPER-GET-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "test_helper_classify_situation", "TEST-HELPER-CLASSIFY-SITUATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "test_el_partition_simple_scan_algorithm", "TEST-EL-PARTITION-SIMPLE-SCAN-ALGORITHM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "generate_el_partition_simple_scan_case", "GENERATE-EL-PARTITION-SIMPLE-SCAN-CASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "test_random_el_partition_simple_scan_cases", "TEST-RANDOM-EL-PARTITION-SIMPLE-SCAN-CASES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "el_partition_data_sink_print_function_trampoline", "EL-PARTITION-DATA-SINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "el_partition_data_sink_p", "EL-PARTITION-DATA-SINK-P", 1, 0, false);
        new $el_partition_data_sink_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_dsink_state", "ELPART-DSINK-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_dsink_branch_cdel_fn", "ELPART-DSINK-BRANCH-CDEL-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_dsink_branch_asdel_fn", "ELPART-DSINK-BRANCH-ASDEL-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_dsink_tip_ccreate_fn", "ELPART-DSINK-TIP-CCREATE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_dsink_tip_ascreate_fn", "ELPART-DSINK-TIP-ASCREATE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "elpart_dsink_tip_asreassert_fn", "ELPART-DSINK-TIP-ASREASSERT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_dsink_state", "_CSETF-ELPART-DSINK-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_dsink_branch_cdel_fn", "_CSETF-ELPART-DSINK-BRANCH-CDEL-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_dsink_branch_asdel_fn", "_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_dsink_tip_ccreate_fn", "_CSETF-ELPART-DSINK-TIP-CCREATE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_dsink_tip_ascreate_fn", "_CSETF-ELPART-DSINK-TIP-ASCREATE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "_csetf_elpart_dsink_tip_asreassert_fn", "_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "make_el_partition_data_sink", "MAKE-EL-PARTITION-DATA-SINK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "visit_defstruct_el_partition_data_sink", "VISIT-DEFSTRUCT-EL-PARTITION-DATA-SINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "visit_defstruct_object_el_partition_data_sink_method", "VISIT-DEFSTRUCT-OBJECT-EL-PARTITION-DATA-SINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "new_el_partition_data_sink", "NEW-EL-PARTITION-DATA-SINK", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "note_el_partition_branch_constant_delete", "NOTE-EL-PARTITION-BRANCH-CONSTANT-DELETE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "note_el_partition_branch_assertion_delete", "NOTE-EL-PARTITION-BRANCH-ASSERTION-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "note_el_partition_tip_constant_create", "NOTE-EL-PARTITION-TIP-CONSTANT-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "note_el_partition_tip_assertion_create", "NOTE-EL-PARTITION-TIP-ASSERTION-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "note_el_partition_tip_assertion_reassert", "NOTE-EL-PARTITION-TIP-ASSERTION-REASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "get_el_partition_data_sink_state", "GET-EL-PARTITION-DATA-SINK-STATE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "with_el_partition_creator", "WITH-EL-PARTITION-CREATOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "with_el_partition_creation_purpose", "WITH-EL-PARTITION-CREATION-PURPOSE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "with_el_partition_mt", "WITH-EL-PARTITION-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "with_el_partition_direction", "WITH-EL-PARTITION-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_partitions", "without_el_partition_creation_purpose", "WITHOUT-EL-PARTITION-CREATION-PURPOSE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "new_transcript_el_partition_data_sink", "NEW-TRANSCRIPT-EL-PARTITION-DATA-SINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_branch_constant_delete", "TRANSCRIPT-DATA-SINK-BRANCH-CONSTANT-DELETE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_branch_assertion_delete", "TRANSCRIPT-DATA-SINK-BRANCH-ASSERTION-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_tip_constant_create", "TRANSCRIPT-DATA-SINK-TIP-CONSTANT-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_tip_assertion_create", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_tip_assertion_reassert", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-REASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_tip_constant_timestamp", "TRANSCRIPT-DATA-SINK-TIP-CONSTANT-TIMESTAMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_tip_assertion_timestamp", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-TIMESTAMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_clean_fort", "TRANSCRIPT-DATA-SINK-CLEAN-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_form_prologue", "TRANSCRIPT-DATA-SINK-FORM-PROLOGUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "transcript_data_sink_form_epilogue", "TRANSCRIPT-DATA-SINK-FORM-EPILOGUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "new_debug_el_partition_data_sink", "NEW-DEBUG-EL-PARTITION-DATA-SINK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "debug_data_sink_branch_constant_delete", "DEBUG-DATA-SINK-BRANCH-CONSTANT-DELETE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "debug_data_sink_branch_assertion_delete", "DEBUG-DATA-SINK-BRANCH-ASSERTION-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "debug_data_sink_tip_constant_create", "DEBUG-DATA-SINK-TIP-CONSTANT-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "debug_data_sink_tip_assertion_create", "DEBUG-DATA-SINK-TIP-ASSERTION-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_partitions", "debug_data_sink_tip_assertion_reassert", "DEBUG-DATA-SINK-TIP-ASSERTION-REASSERT", 2, 2, false);
        return (SubLObject)el_partitions.NIL;
    }
    
    public static SubLObject init_el_partitions_file() {
        el_partitions.$default_pickling_stream_buffer_size$ = SubLFiles.deflexical("*DEFAULT-PICKLING-STREAM-BUFFER-SIZE*", Numbers.multiply((SubLObject)el_partitions.FOUR_INTEGER, (SubLObject)el_partitions.$int0$1024, (SubLObject)el_partitions.$int0$1024));
        el_partitions.$pickling_stream_buffer_size$ = SubLFiles.defparameter("*PICKLING-STREAM-BUFFER-SIZE*", el_partitions.$default_pickling_stream_buffer_size$.getGlobalValue());
        el_partitions.$pickled_kb_comparison_strategy$ = SubLFiles.deflexical("*PICKLED-KB-COMPARISON-STRATEGY*", (SubLObject)el_partitions.$kw89$SCAN_FORWARD_STEADY);
        el_partitions.$dtp_elpart_as_desc$ = SubLFiles.defconstant("*DTP-ELPART-AS-DESC*", (SubLObject)el_partitions.$sym97$ELPART_AS_DESC);
        el_partitions.$debug_scan_enumerateP$ = SubLFiles.deflexical("*DEBUG-SCAN-ENUMERATE?*", (SubLObject)el_partitions.NIL);
        el_partitions.$dtp_el_partition_data_sink$ = SubLFiles.defconstant("*DTP-EL-PARTITION-DATA-SINK*", (SubLObject)el_partitions.$sym166$EL_PARTITION_DATA_SINK);
        el_partitions.$el_partition_creator_override$ = SubLFiles.defparameter("*EL-PARTITION-CREATOR-OVERRIDE*", (SubLObject)el_partitions.NIL);
        el_partitions.$el_partition_creation_purpose_override$ = SubLFiles.defparameter("*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*", (SubLObject)el_partitions.NIL);
        el_partitions.$el_partition_mt_override$ = SubLFiles.defparameter("*EL-PARTITION-MT-OVERRIDE*", (SubLObject)el_partitions.NIL);
        el_partitions.$el_partition_direction_override$ = SubLFiles.defparameter("*EL-PARTITION-DIRECTION-OVERRIDE*", (SubLObject)el_partitions.NIL);
        el_partitions.$transcript_marker_guest_cyclist$ = SubLFiles.deflexical("*TRANSCRIPT-MARKER-GUEST-CYCLIST*", (SubLObject)el_partitions.$list220);
        return (SubLObject)el_partitions.NIL;
    }
    
    public static SubLObject setup_el_partitions_file() {
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym12$PICKLE_CONSTANTS);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym19$DO_PICKLED_CONSTANTS);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym43$PICKLE_ASSERTIONS);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym47$ASSERTION_TO_PICKLING_FORMAT);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym49$UNPICKLE_ASSERTION_PICKLING_FORMAT);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym55$NEW_RELEVANT_ASSERTIONS_ID_SPACE);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym58$COMPARE_PICKLED_KB_TO_CURRENT_KB);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym59$ENUMERATE_ADDITIONS_TO_CURRENT_KB);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), el_partitions.$dtp_elpart_as_desc$.getGlobalValue(), Symbols.symbol_function((SubLObject)el_partitions.$sym104$ELPART_AS_DESC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)el_partitions.$list105);
        Structures.def_csetf((SubLObject)el_partitions.$sym106$ELPART_AS_DESC_ID, (SubLObject)el_partitions.$sym107$_CSETF_ELPART_AS_DESC_ID);
        Structures.def_csetf((SubLObject)el_partitions.$sym108$ELPART_AS_DESC_TL_IST_FORMULA, (SubLObject)el_partitions.$sym109$_CSETF_ELPART_AS_DESC_TL_IST_FORMULA);
        Structures.def_csetf((SubLObject)el_partitions.$sym110$ELPART_AS_DESC_HASH, (SubLObject)el_partitions.$sym111$_CSETF_ELPART_AS_DESC_HASH);
        Structures.def_csetf((SubLObject)el_partitions.$sym112$ELPART_AS_DESC_EXTRA, (SubLObject)el_partitions.$sym113$_CSETF_ELPART_AS_DESC_EXTRA);
        Structures.def_csetf((SubLObject)el_partitions.$sym114$ELPART_AS_DESC_WEAK_IST_FORMULA, (SubLObject)el_partitions.$sym115$_CSETF_ELPART_AS_DESC_WEAK_IST_FORMULA);
        Equality.identity((SubLObject)el_partitions.$sym97$ELPART_AS_DESC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), el_partitions.$dtp_elpart_as_desc$.getGlobalValue(), Symbols.symbol_function((SubLObject)el_partitions.$sym126$VISIT_DEFSTRUCT_OBJECT_ELPART_AS_DESC_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)el_partitions.$sym150$TEST_EL_PARTITION_SIMPLE_SCAN_ALGORITHM, (SubLObject)ConsesLow.list(new SubLObject[] { el_partitions.$kw151$TEST, el_partitions.EQUAL, el_partitions.$kw152$OWNER, el_partitions.NIL, el_partitions.$kw153$CLASSES, el_partitions.NIL, el_partitions.$kw154$KB, el_partitions.$kw155$TINY, el_partitions.$kw156$WORKING_, el_partitions.T }), el_partitions.$list157);
        generic_testing.define_test_case_table_int((SubLObject)el_partitions.$sym162$TEST_RANDOM_EL_PARTITION_SIMPLE_SCAN_CASES, (SubLObject)ConsesLow.list(new SubLObject[] { el_partitions.$kw151$TEST, el_partitions.EQUAL, el_partitions.$kw152$OWNER, el_partitions.NIL, el_partitions.$kw153$CLASSES, el_partitions.NIL, el_partitions.$kw154$KB, el_partitions.$kw155$TINY, el_partitions.$kw156$WORKING_, el_partitions.T }), (SubLObject)el_partitions.$list163);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), el_partitions.$dtp_el_partition_data_sink$.getGlobalValue(), Symbols.symbol_function((SubLObject)el_partitions.$sym172$EL_PARTITION_DATA_SINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)el_partitions.$list173);
        Structures.def_csetf((SubLObject)el_partitions.$sym174$ELPART_DSINK_STATE, (SubLObject)el_partitions.$sym175$_CSETF_ELPART_DSINK_STATE);
        Structures.def_csetf((SubLObject)el_partitions.$sym176$ELPART_DSINK_BRANCH_CDEL_FN, (SubLObject)el_partitions.$sym177$_CSETF_ELPART_DSINK_BRANCH_CDEL_FN);
        Structures.def_csetf((SubLObject)el_partitions.$sym178$ELPART_DSINK_BRANCH_ASDEL_FN, (SubLObject)el_partitions.$sym179$_CSETF_ELPART_DSINK_BRANCH_ASDEL_FN);
        Structures.def_csetf((SubLObject)el_partitions.$sym180$ELPART_DSINK_TIP_CCREATE_FN, (SubLObject)el_partitions.$sym181$_CSETF_ELPART_DSINK_TIP_CCREATE_FN);
        Structures.def_csetf((SubLObject)el_partitions.$sym182$ELPART_DSINK_TIP_ASCREATE_FN, (SubLObject)el_partitions.$sym183$_CSETF_ELPART_DSINK_TIP_ASCREATE_FN);
        Structures.def_csetf((SubLObject)el_partitions.$sym184$ELPART_DSINK_TIP_ASREASSERT_FN, (SubLObject)el_partitions.$sym185$_CSETF_ELPART_DSINK_TIP_ASREASSERT_FN);
        Equality.identity((SubLObject)el_partitions.$sym166$EL_PARTITION_DATA_SINK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), el_partitions.$dtp_el_partition_data_sink$.getGlobalValue(), Symbols.symbol_function((SubLObject)el_partitions.$sym193$VISIT_DEFSTRUCT_OBJECT_EL_PARTITION_DATA_SINK_METHOD));
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym194$NOTE_EL_PARTITION_BRANCH_CONSTANT_DELETE);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym195$NOTE_EL_PARTITION_BRANCH_ASSERTION_DELETE);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym196$NOTE_EL_PARTITION_TIP_CONSTANT_CREATE);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym197$NOTE_EL_PARTITION_TIP_ASSERTION_CREATE);
        access_macros.register_external_symbol((SubLObject)el_partitions.$sym198$NOTE_EL_PARTITION_TIP_ASSERTION_REASSERT);
        return (SubLObject)el_partitions.NIL;
    }
    
    private static SubLObject _constant_157_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D"), SubLObjectFactory.makeSymbol("E") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D"), SubLObjectFactory.makeSymbol("E") })), (SubLObject)el_partitions.NIL), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("D") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("B")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("C")))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D"), SubLObjectFactory.makeSymbol("E") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("E")))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D"), SubLObjectFactory.makeSymbol("E") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("E"), SubLObjectFactory.makeSymbol("F"), SubLObjectFactory.makeSymbol("G") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("F")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("G")))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D"), SubLObjectFactory.makeSymbol("E") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("F"), SubLObjectFactory.makeSymbol("G"), SubLObjectFactory.makeSymbol("H"), SubLObjectFactory.makeSymbol("I"), SubLObjectFactory.makeSymbol("J") })), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("B")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("C")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("D")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("E")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("F")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("G")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("H")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("I")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("J")) })), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("D"), SubLObjectFactory.makeSymbol("E"), SubLObjectFactory.makeSymbol("F"), SubLObjectFactory.makeSymbol("G"), SubLObjectFactory.makeSymbol("H"), SubLObjectFactory.makeSymbol("I"), SubLObjectFactory.makeSymbol("J"), SubLObjectFactory.makeSymbol("K"), SubLObjectFactory.makeSymbol("L"), SubLObjectFactory.makeSymbol("M"), SubLObjectFactory.makeSymbol("N") }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeSymbol("A"), SubLObjectFactory.makeSymbol("B"), SubLObjectFactory.makeSymbol("C"), SubLObjectFactory.makeSymbol("H"), SubLObjectFactory.makeSymbol("I"), SubLObjectFactory.makeSymbol("J"), SubLObjectFactory.makeSymbol("K"), SubLObjectFactory.makeSymbol("L"), SubLObjectFactory.makeSymbol("M"), SubLObjectFactory.makeSymbol("N") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("E")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("F")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("G")))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { el_partitions.ZERO_INTEGER, el_partitions.ONE_INTEGER, el_partitions.TWO_INTEGER, el_partitions.THREE_INTEGER, el_partitions.FOUR_INTEGER, el_partitions.FIVE_INTEGER, el_partitions.SIX_INTEGER, el_partitions.SEVEN_INTEGER, el_partitions.EIGHT_INTEGER, el_partitions.NINE_INTEGER, el_partitions.TEN_INTEGER, el_partitions.ELEVEN_INTEGER, el_partitions.TWELVE_INTEGER, el_partitions.THIRTEEN_INTEGER, el_partitions.FOURTEEN_INTEGER, el_partitions.FIFTEEN_INTEGER, el_partitions.SIXTEEN_INTEGER, el_partitions.SEVENTEEN_INTEGER, el_partitions.EIGHTEEN_INTEGER, el_partitions.NINETEEN_INTEGER, el_partitions.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29) }), Vectors.vector(new SubLObject[] { el_partitions.ZERO_INTEGER, el_partitions.ONE_INTEGER, el_partitions.TWO_INTEGER, el_partitions.THREE_INTEGER, el_partitions.FIVE_INTEGER, el_partitions.SIX_INTEGER, el_partitions.SEVEN_INTEGER, el_partitions.EIGHT_INTEGER, el_partitions.TEN_INTEGER, el_partitions.ELEVEN_INTEGER, el_partitions.TWELVE_INTEGER, el_partitions.THIRTEEN_INTEGER, el_partitions.FOURTEEN_INTEGER, el_partitions.FIFTEEN_INTEGER, el_partitions.SEVENTEEN_INTEGER, el_partitions.EIGHTEEN_INTEGER, el_partitions.NINETEEN_INTEGER, el_partitions.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(32) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)el_partitions.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)el_partitions.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)el_partitions.SIXTEEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeInteger(25)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeInteger(30)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeInteger(31)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeInteger(32)))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { el_partitions.ZERO_INTEGER, el_partitions.ONE_INTEGER, el_partitions.TWO_INTEGER, el_partitions.THREE_INTEGER, el_partitions.FOUR_INTEGER, el_partitions.FIVE_INTEGER, el_partitions.SIX_INTEGER, el_partitions.SEVEN_INTEGER, el_partitions.EIGHT_INTEGER, el_partitions.NINE_INTEGER, el_partitions.TEN_INTEGER, el_partitions.ELEVEN_INTEGER, el_partitions.TWELVE_INTEGER, el_partitions.THIRTEEN_INTEGER, el_partitions.FOURTEEN_INTEGER, el_partitions.FIFTEEN_INTEGER, el_partitions.SIXTEEN_INTEGER, el_partitions.SEVENTEEN_INTEGER, el_partitions.EIGHTEEN_INTEGER, el_partitions.NINETEEN_INTEGER, el_partitions.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29) }), Vectors.vector(new SubLObject[] { el_partitions.ZERO_INTEGER, el_partitions.ONE_INTEGER, el_partitions.TWO_INTEGER, el_partitions.THREE_INTEGER, el_partitions.FOUR_INTEGER, el_partitions.FIVE_INTEGER, el_partitions.SIX_INTEGER, el_partitions.SEVEN_INTEGER, el_partitions.EIGHT_INTEGER, el_partitions.NINE_INTEGER, el_partitions.TEN_INTEGER, el_partitions.ELEVEN_INTEGER, el_partitions.TWELVE_INTEGER, el_partitions.THIRTEEN_INTEGER, el_partitions.FOURTEEN_INTEGER, el_partitions.FIFTEEN_INTEGER, el_partitions.SIXTEEN_INTEGER, el_partitions.SEVENTEEN_INTEGER, el_partitions.EIGHTEEN_INTEGER, el_partitions.NINETEEN_INTEGER, el_partitions.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeInteger(29)))), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { el_partitions.ZERO_INTEGER, el_partitions.ONE_INTEGER, el_partitions.TWO_INTEGER, el_partitions.THREE_INTEGER, el_partitions.FOUR_INTEGER, el_partitions.FIVE_INTEGER, el_partitions.SIX_INTEGER, el_partitions.SEVEN_INTEGER, el_partitions.EIGHT_INTEGER, el_partitions.NINE_INTEGER, el_partitions.TEN_INTEGER, el_partitions.ELEVEN_INTEGER, el_partitions.TWELVE_INTEGER, el_partitions.THIRTEEN_INTEGER, el_partitions.FOURTEEN_INTEGER, el_partitions.FIFTEEN_INTEGER, el_partitions.SIXTEEN_INTEGER, el_partitions.SEVENTEEN_INTEGER, el_partitions.EIGHTEEN_INTEGER, el_partitions.NINETEEN_INTEGER, el_partitions.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(33), SubLObjectFactory.makeInteger(34), SubLObjectFactory.makeInteger(35), SubLObjectFactory.makeInteger(36), SubLObjectFactory.makeInteger(37), SubLObjectFactory.makeInteger(38), SubLObjectFactory.makeInteger(39) }), Vectors.vector(new SubLObject[] { el_partitions.ZERO_INTEGER, el_partitions.ONE_INTEGER, el_partitions.TWO_INTEGER, el_partitions.THREE_INTEGER, el_partitions.FOUR_INTEGER, el_partitions.FIVE_INTEGER, el_partitions.SIX_INTEGER, el_partitions.SEVEN_INTEGER, el_partitions.EIGHT_INTEGER, el_partitions.NINE_INTEGER, el_partitions.TEN_INTEGER, el_partitions.ELEVEN_INTEGER, el_partitions.TWELVE_INTEGER, el_partitions.THIRTEEN_INTEGER, el_partitions.FOURTEEN_INTEGER, el_partitions.FIFTEEN_INTEGER, el_partitions.SIXTEEN_INTEGER, el_partitions.SEVENTEEN_INTEGER, el_partitions.EIGHTEEN_INTEGER, el_partitions.NINETEEN_INTEGER, el_partitions.TWENTY_INTEGER, SubLObjectFactory.makeInteger(21), SubLObjectFactory.makeInteger(22), SubLObjectFactory.makeInteger(23), SubLObjectFactory.makeInteger(24), SubLObjectFactory.makeInteger(25), SubLObjectFactory.makeInteger(26), SubLObjectFactory.makeInteger(27), SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(29), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(33), SubLObjectFactory.makeInteger(34), SubLObjectFactory.makeInteger(35), SubLObjectFactory.makeInteger(36), SubLObjectFactory.makeInteger(37), SubLObjectFactory.makeInteger(38), SubLObjectFactory.makeInteger(40) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DELETE"), (SubLObject)SubLObjectFactory.makeInteger(39)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeInteger(40)))) });
    }
    
    @Override
	public void declareFunctions() {
        declare_el_partitions_file();
    }
    
    @Override
	public void initializeVariables() {
        init_el_partitions_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_el_partitions_file();
    }
    
    static {
        me = (SubLFile)new el_partitions();
        el_partitions.$default_pickling_stream_buffer_size$ = null;
        el_partitions.$pickling_stream_buffer_size$ = null;
        el_partitions.$pickled_kb_comparison_strategy$ = null;
        el_partitions.$dtp_elpart_as_desc$ = null;
        el_partitions.$debug_scan_enumerateP$ = null;
        el_partitions.$dtp_el_partition_data_sink$ = null;
        el_partitions.$el_partition_creator_override$ = null;
        el_partitions.$el_partition_creation_purpose_override$ = null;
        el_partitions.$el_partition_mt_override$ = null;
        el_partitions.$el_partition_direction_override$ = null;
        el_partitions.$transcript_marker_guest_cyclist$ = null;
        $int0$1024 = SubLObjectFactory.makeInteger(1024);
        $sym1$WITH_STREAM_BUFFER_SIZE = SubLObjectFactory.makeSymbol("WITH-STREAM-BUFFER-SIZE");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PICKLING-STREAM-BUFFER-SIZE*"));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym4$CURR = SubLObjectFactory.makeUninternedSymbol("CURR");
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list6 = ConsesLow.list((SubLObject)el_partitions.ZERO_INTEGER);
        $sym7$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym8$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym9$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym10$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym11$HL_PROTOTYPICAL_INSTANCE_ = SubLObjectFactory.makeSymbol("HL-PROTOTYPICAL-INSTANCE?");
        $sym12$PICKLE_CONSTANTS = SubLObjectFactory.makeSymbol("PICKLE-CONSTANTS");
        $str13$Pickling_constants_to_ = SubLObjectFactory.makeString("Pickling constants to ");
        $str14$_____ = SubLObjectFactory.makeString(" ....");
        $kw15$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str16$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym17$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw18$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym19$DO_PICKLED_CONSTANTS = SubLObjectFactory.makeSymbol("DO-PICKLED-CONSTANTS");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("GUID"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"));
        $kw22$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw23$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $sym24$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
        $sym25$COUNT = SubLObjectFactory.makeUninternedSymbol("COUNT");
        $sym26$MSG = SubLObjectFactory.makeUninternedSymbol("MSG");
        $sym27$WITH_PICKLING_STREAM_BUFFER_SIZE = SubLObjectFactory.makeSymbol("WITH-PICKLING-STREAM-BUFFER-SIZE");
        $sym28$WITH_PRIVATE_BINARY_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $sym30$CFASL_INPUT = SubLObjectFactory.makeSymbol("CFASL-INPUT");
        $sym31$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym32$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym33$FORMAT_NIL = SubLObjectFactory.makeSymbol("FORMAT-NIL");
        $str34$Reading_pickled_constants_from__A = SubLObjectFactory.makeString("Reading pickled constants from ~A ....");
        $sym35$WITH_PICKLING_PACFICIATION = SubLObjectFactory.makeSymbol("WITH-PICKLING-PACFICIATION");
        $sym36$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym37$MUST = SubLObjectFactory.makeSymbol("MUST");
        $sym38$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str39$Read_invalid_SUID__A_from__A_ = SubLObjectFactory.makeString("Read invalid SUID ~A from ~A.");
        $str40$Read_invalid_NAME__A_from__A_ = SubLObjectFactory.makeString("Read invalid NAME ~A from ~A.");
        $sym41$GUID_P = SubLObjectFactory.makeSymbol("GUID-P");
        $str42$Read_invalid_GUID__A_from__A_ = SubLObjectFactory.makeString("Read invalid GUID ~A from ~A.");
        $sym43$PICKLE_ASSERTIONS = SubLObjectFactory.makeSymbol("PICKLE-ASSERTIONS");
        $str44$Pickling_assertions_to_file_vecto = SubLObjectFactory.makeString("Pickling assertions to file-vector with prefix ");
        $str45$_index_cfasl = SubLObjectFactory.makeString("-index.cfasl");
        $str46$_cfasl = SubLObjectFactory.makeString(".cfasl");
        $sym47$ASSERTION_TO_PICKLING_FORMAT = SubLObjectFactory.makeSymbol("ASSERTION-TO-PICKLING-FORMAT");
        $sym48$CONVERT_GUID_TO_PICKLING_FORMAT = SubLObjectFactory.makeSymbol("CONVERT-GUID-TO-PICKLING-FORMAT");
        $sym49$UNPICKLE_ASSERTION_PICKLING_FORMAT = SubLObjectFactory.makeSymbol("UNPICKLE-ASSERTION-PICKLING-FORMAT");
        $sym50$PICKLED_GUID_FORMAT_P = SubLObjectFactory.makeSymbol("PICKLED-GUID-FORMAT-P");
        $sym51$RESTORE_GUID_FROM_PICKLING_FORMAT = SubLObjectFactory.makeSymbol("RESTORE-GUID-FROM-PICKLING-FORMAT");
        $kw52$GUID = SubLObjectFactory.makeKeyword("GUID");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUID-MARKER"), (SubLObject)SubLObjectFactory.makeSymbol("GUID-STRING"));
        $str54$Cannot_restore__A_____not_a_pickl = SubLObjectFactory.makeString("Cannot restore ~A ... not a pickled GUID.");
        $sym55$NEW_RELEVANT_ASSERTIONS_ID_SPACE = SubLObjectFactory.makeSymbol("NEW-RELEVANT-ASSERTIONS-ID-SPACE");
        $str56$Computing_EL_Partition_relevant_a = SubLObjectFactory.makeString("Computing EL Partition relevant assertion ID space ....");
        $str57$Whoa__we_underflowed_the_ID_space = SubLObjectFactory.makeString("Whoa, we underflowed the ID space counter.");
        $sym58$COMPARE_PICKLED_KB_TO_CURRENT_KB = SubLObjectFactory.makeSymbol("COMPARE-PICKLED-KB-TO-CURRENT-KB");
        $sym59$ENUMERATE_ADDITIONS_TO_CURRENT_KB = SubLObjectFactory.makeSymbol("ENUMERATE-ADDITIONS-TO-CURRENT-KB");
        $str60$Enumerating_new_constants_____ = SubLObjectFactory.makeString("Enumerating new constants ....");
        $str61$Enumerating_new_assertions_____ = SubLObjectFactory.makeString("Enumerating new assertions ....");
        $sym62$EL_PARTITION_DATA_SINK_P = SubLObjectFactory.makeSymbol("EL-PARTITION-DATA-SINK-P");
        $sym63$EL_PARTITION_RELEVANT_CONSTANT_ = SubLObjectFactory.makeSymbol("EL-PARTITION-RELEVANT-CONSTANT?");
        $kw64$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw65$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str66$Reading_pickled_constants_from_ = SubLObjectFactory.makeString("Reading pickled constants from ");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IT"), (SubLObject)SubLObjectFactory.makeSymbol("AS"), (SubLObject)SubLObjectFactory.makeSymbol("TL-IST-FORMULA"));
        $sym68$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym69$ITERATION_NEXT_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("ITERATION-NEXT-WITHOUT-VALUES");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym71$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym72$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym73$TL_ENCAPSULATE = SubLObjectFactory.makeSymbol("TL-ENCAPSULATE");
        $sym74$ASSERTION_TL_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-TL-IST-FORMULA");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIP-INDEX"));
        $sym76$CDEC = SubLObjectFactory.makeSymbol("CDEC");
        $sym77$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym78$EL_PARTITION_RELEVANT_ASSERTION_ = SubLObjectFactory.makeSymbol("EL-PARTITION-RELEVANT-ASSERTION?");
        $sym79$FIND_ASSERTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $str80$Implementation_error__Tip_index__ = SubLObjectFactory.makeString("Implementation error: Tip index ~A underflowed.");
        $str81$Implementation_error__branch_inde = SubLObjectFactory.makeString("Implementation error: branch index underflowed.");
        $str82$Implementation_error__tip_index_u = SubLObjectFactory.makeString("Implementation error: tip index underflowed.");
        $kw83$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $kw84$SHARED_ASSERTION = SubLObjectFactory.makeKeyword("SHARED-ASSERTION");
        $kw85$BRANCH_AS_ID = SubLObjectFactory.makeKeyword("BRANCH-AS-ID");
        $kw86$BRANCH_INDEX = SubLObjectFactory.makeKeyword("BRANCH-INDEX");
        $kw87$BRANCH_COUNT = SubLObjectFactory.makeKeyword("BRANCH-COUNT");
        $kw88$JUST_ASSERTED_P = SubLObjectFactory.makeKeyword("JUST-ASSERTED-P");
        $kw89$SCAN_FORWARD_STEADY = SubLObjectFactory.makeKeyword("SCAN-FORWARD-STEADY");
        $kw90$CLASSIC_BACKWARD = SubLObjectFactory.makeKeyword("CLASSIC-BACKWARD");
        $kw91$NOVEL_FORWARD = SubLObjectFactory.makeKeyword("NOVEL-FORWARD");
        $kw92$SCAN_FORWARD_FAST = SubLObjectFactory.makeKeyword("SCAN-FORWARD-FAST");
        $str93$Pickled_KB_Comparison_Strategy__S = SubLObjectFactory.makeString("Pickled KB Comparison Strategy ~S not yet implemented.");
        $str94$Analyzing_ = SubLObjectFactory.makeString("Analyzing ");
        $str95$_new_assertions_____ = SubLObjectFactory.makeString(" new assertions ....");
        $str96$This_algorithm_is_not_designed_to = SubLObjectFactory.makeString("This algorithm is not designed to deal with gaps in assertion ID space. Dump KB first.");
        $sym97$ELPART_AS_DESC = SubLObjectFactory.makeSymbol("ELPART-AS-DESC");
        $sym98$ELPART_AS_DESC_P = SubLObjectFactory.makeSymbol("ELPART-AS-DESC-P");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("TL-IST-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("HASH"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRA"), (SubLObject)SubLObjectFactory.makeSymbol("WEAK-IST-FORMULA"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("TL-IST-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("HASH"), (SubLObject)SubLObjectFactory.makeKeyword("EXTRA"), (SubLObject)SubLObjectFactory.makeKeyword("WEAK-IST-FORMULA"));
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELPART-AS-DESC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-AS-DESC-TL-IST-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-AS-DESC-HASH"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-AS-DESC-EXTRA"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-AS-DESC-WEAK-IST-FORMULA"));
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-TL-IST-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-HASH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-EXTRA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA"));
        $sym103$PRINT_ELPART_AS_DESC = SubLObjectFactory.makeSymbol("PRINT-ELPART-AS-DESC");
        $sym104$ELPART_AS_DESC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ELPART-AS-DESC-PRINT-FUNCTION-TRAMPOLINE");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-AS-DESC-P"));
        $sym106$ELPART_AS_DESC_ID = SubLObjectFactory.makeSymbol("ELPART-AS-DESC-ID");
        $sym107$_CSETF_ELPART_AS_DESC_ID = SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-ID");
        $sym108$ELPART_AS_DESC_TL_IST_FORMULA = SubLObjectFactory.makeSymbol("ELPART-AS-DESC-TL-IST-FORMULA");
        $sym109$_CSETF_ELPART_AS_DESC_TL_IST_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-TL-IST-FORMULA");
        $sym110$ELPART_AS_DESC_HASH = SubLObjectFactory.makeSymbol("ELPART-AS-DESC-HASH");
        $sym111$_CSETF_ELPART_AS_DESC_HASH = SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-HASH");
        $sym112$ELPART_AS_DESC_EXTRA = SubLObjectFactory.makeSymbol("ELPART-AS-DESC-EXTRA");
        $sym113$_CSETF_ELPART_AS_DESC_EXTRA = SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-EXTRA");
        $sym114$ELPART_AS_DESC_WEAK_IST_FORMULA = SubLObjectFactory.makeSymbol("ELPART-AS-DESC-WEAK-IST-FORMULA");
        $sym115$_CSETF_ELPART_AS_DESC_WEAK_IST_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA");
        $kw116$ID = SubLObjectFactory.makeKeyword("ID");
        $kw117$TL_IST_FORMULA = SubLObjectFactory.makeKeyword("TL-IST-FORMULA");
        $kw118$HASH = SubLObjectFactory.makeKeyword("HASH");
        $kw119$EXTRA = SubLObjectFactory.makeKeyword("EXTRA");
        $kw120$WEAK_IST_FORMULA = SubLObjectFactory.makeKeyword("WEAK-IST-FORMULA");
        $str121$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw122$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym123$MAKE_ELPART_AS_DESC = SubLObjectFactory.makeSymbol("MAKE-ELPART-AS-DESC");
        $kw124$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw125$END = SubLObjectFactory.makeKeyword("END");
        $sym126$VISIT_DEFSTRUCT_OBJECT_ELPART_AS_DESC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ELPART-AS-DESC-METHOD");
        $str127$_id__ = SubLObjectFactory.makeString(" id# ");
        $str128$_hc__ = SubLObjectFactory.makeString(" hc: ");
        $str129$_AS_ID__ = SubLObjectFactory.makeString(" AS-ID: ");
        $str130$_FVecInx__ = SubLObjectFactory.makeString(" FVecInx: ");
        $str131$_xtr__ = SubLObjectFactory.makeString(" xtr: ");
        $str132$_ = SubLObjectFactory.makeString(" ");
        $str133$_assertions_____ = SubLObjectFactory.makeString(" assertions ....");
        $str134$Not_yet_implemented_ = SubLObjectFactory.makeString("Not yet implemented.");
        $str135$Mhm__only__A_gaps_across_all_asse = SubLObjectFactory.makeString("Mhm, only ~A gaps across all assertion types, but ~A deletions???");
        $str136$Finding_start_of_relevant_asserti = SubLObjectFactory.makeString("Finding start of relevant assertions in TIP KB ....");
        $str137$_assertion_gaps_____ = SubLObjectFactory.makeString(" assertion gaps ....");
        $str138$Error_realigning_BRANCH___A__now_ = SubLObjectFactory.makeString("Error realigning BRANCH (~A, now at ~A) and TIP (~A)");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HP-MARKER"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("GUID"));
        $sym140$ENUMMISS_TL_HP_NOTATION = SubLObjectFactory.makeSymbol("ENUMMISS-TL-HP-NOTATION");
        $kw141$HP = SubLObjectFactory.makeKeyword("HP");
        $str142$Sorry__FAST_is_currently_not_impl = SubLObjectFactory.makeString("Sorry, FAST is currently not implemented.");
        $str143$_branch_assertions_____ = SubLObjectFactory.makeString(" branch assertions ....");
        $kw144$BOTH_INVALID = SubLObjectFactory.makeKeyword("BOTH-INVALID");
        $kw145$INVALID_BRANCH = SubLObjectFactory.makeKeyword("INVALID-BRANCH");
        $kw146$INVALID_TIP = SubLObjectFactory.makeKeyword("INVALID-TIP");
        $kw147$DIFFERENT = SubLObjectFactory.makeKeyword("DIFFERENT");
        $kw148$EQUAL = SubLObjectFactory.makeKeyword("EQUAL");
        $str149$Unknown_state__A____do_not_know_w = SubLObjectFactory.makeString("Unknown state ~A -- do not know what to do.~%");
        $sym150$TEST_EL_PARTITION_SIMPLE_SCAN_ALGORITHM = SubLObjectFactory.makeSymbol("TEST-EL-PARTITION-SIMPLE-SCAN-ALGORITHM");
        $kw151$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw152$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw153$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw154$KB = SubLObjectFactory.makeKeyword("KB");
        $kw155$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw156$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list157 = _constant_157_initializer();
        $kw158$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $str159$Someone_is_whaffling_____ = SubLObjectFactory.makeString("Someone is whaffling ....");
        $kw160$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $kw161$DELETE = SubLObjectFactory.makeKeyword("DELETE");
        $sym162$TEST_RANDOM_EL_PARTITION_SIMPLE_SCAN_CASES = SubLObjectFactory.makeSymbol("TEST-RANDOM-EL-PARTITION-SIMPLE-SCAN-CASES");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)el_partitions.TWENTY_INTEGER, (SubLObject)el_partitions.TWENTY_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("OK")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_partitions.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1000), (SubLObject)SubLObjectFactory.makeInteger(50), (SubLObject)SubLObjectFactory.makeInteger(50)), (SubLObject)SubLObjectFactory.makeKeyword("OK")));
        $str164$Expected__A__got__A_instead_ = SubLObjectFactory.makeString("Expected ~A, got ~A instead.");
        $kw165$OK = SubLObjectFactory.makeKeyword("OK");
        $sym166$EL_PARTITION_DATA_SINK = SubLObjectFactory.makeSymbol("EL-PARTITION-DATA-SINK");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("BRANCH-CDEL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("BRANCH-ASDEL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("TIP-CCREATE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("TIP-ASCREATE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("TIP-ASREASSERT-FN"));
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("BRANCH-CDEL-FN"), (SubLObject)SubLObjectFactory.makeKeyword("BRANCH-ASDEL-FN"), (SubLObject)SubLObjectFactory.makeKeyword("TIP-CCREATE-FN"), (SubLObject)SubLObjectFactory.makeKeyword("TIP-ASCREATE-FN"), (SubLObject)SubLObjectFactory.makeKeyword("TIP-ASREASSERT-FN"));
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELPART-DSINK-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-DSINK-BRANCH-CDEL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-DSINK-BRANCH-ASDEL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-DSINK-TIP-CCREATE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-DSINK-TIP-ASCREATE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ELPART-DSINK-TIP-ASREASSERT-FN"));
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-BRANCH-CDEL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-TIP-CCREATE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-TIP-ASCREATE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN"));
        $sym171$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym172$EL_PARTITION_DATA_SINK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EL-PARTITION-DATA-SINK-PRINT-FUNCTION-TRAMPOLINE");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-PARTITION-DATA-SINK-P"));
        $sym174$ELPART_DSINK_STATE = SubLObjectFactory.makeSymbol("ELPART-DSINK-STATE");
        $sym175$_CSETF_ELPART_DSINK_STATE = SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-STATE");
        $sym176$ELPART_DSINK_BRANCH_CDEL_FN = SubLObjectFactory.makeSymbol("ELPART-DSINK-BRANCH-CDEL-FN");
        $sym177$_CSETF_ELPART_DSINK_BRANCH_CDEL_FN = SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-BRANCH-CDEL-FN");
        $sym178$ELPART_DSINK_BRANCH_ASDEL_FN = SubLObjectFactory.makeSymbol("ELPART-DSINK-BRANCH-ASDEL-FN");
        $sym179$_CSETF_ELPART_DSINK_BRANCH_ASDEL_FN = SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN");
        $sym180$ELPART_DSINK_TIP_CCREATE_FN = SubLObjectFactory.makeSymbol("ELPART-DSINK-TIP-CCREATE-FN");
        $sym181$_CSETF_ELPART_DSINK_TIP_CCREATE_FN = SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-TIP-CCREATE-FN");
        $sym182$ELPART_DSINK_TIP_ASCREATE_FN = SubLObjectFactory.makeSymbol("ELPART-DSINK-TIP-ASCREATE-FN");
        $sym183$_CSETF_ELPART_DSINK_TIP_ASCREATE_FN = SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-TIP-ASCREATE-FN");
        $sym184$ELPART_DSINK_TIP_ASREASSERT_FN = SubLObjectFactory.makeSymbol("ELPART-DSINK-TIP-ASREASSERT-FN");
        $sym185$_CSETF_ELPART_DSINK_TIP_ASREASSERT_FN = SubLObjectFactory.makeSymbol("_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN");
        $kw186$STATE = SubLObjectFactory.makeKeyword("STATE");
        $kw187$BRANCH_CDEL_FN = SubLObjectFactory.makeKeyword("BRANCH-CDEL-FN");
        $kw188$BRANCH_ASDEL_FN = SubLObjectFactory.makeKeyword("BRANCH-ASDEL-FN");
        $kw189$TIP_CCREATE_FN = SubLObjectFactory.makeKeyword("TIP-CCREATE-FN");
        $kw190$TIP_ASCREATE_FN = SubLObjectFactory.makeKeyword("TIP-ASCREATE-FN");
        $kw191$TIP_ASREASSERT_FN = SubLObjectFactory.makeKeyword("TIP-ASREASSERT-FN");
        $sym192$MAKE_EL_PARTITION_DATA_SINK = SubLObjectFactory.makeSymbol("MAKE-EL-PARTITION-DATA-SINK");
        $sym193$VISIT_DEFSTRUCT_OBJECT_EL_PARTITION_DATA_SINK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EL-PARTITION-DATA-SINK-METHOD");
        $sym194$NOTE_EL_PARTITION_BRANCH_CONSTANT_DELETE = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-BRANCH-CONSTANT-DELETE");
        $sym195$NOTE_EL_PARTITION_BRANCH_ASSERTION_DELETE = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-BRANCH-ASSERTION-DELETE");
        $sym196$NOTE_EL_PARTITION_TIP_CONSTANT_CREATE = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-TIP-CONSTANT-CREATE");
        $sym197$NOTE_EL_PARTITION_TIP_ASSERTION_CREATE = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-TIP-ASSERTION-CREATE");
        $sym198$NOTE_EL_PARTITION_TIP_ASSERTION_REASSERT = SubLObjectFactory.makeSymbol("NOTE-EL-PARTITION-TIP-ASSERTION-REASSERT");
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym200$_EL_PARTITION_CREATOR_OVERRIDE_ = SubLObjectFactory.makeSymbol("*EL-PARTITION-CREATOR-OVERRIDE*");
        $list201 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PURPOSE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym202$_EL_PARTITION_CREATION_PURPOSE_OVERRIDE_ = SubLObjectFactory.makeSymbol("*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*");
        $list203 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym204$_EL_PARTITION_MT_OVERRIDE_ = SubLObjectFactory.makeSymbol("*EL-PARTITION-MT-OVERRIDE*");
        $list205 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym206$_EL_PARTITION_DIRECTION_OVERRIDE_ = SubLObjectFactory.makeSymbol("*EL-PARTITION-DIRECTION-OVERRIDE*");
        $list207 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*"), (SubLObject)SubLObjectFactory.makeInteger(212)));
        $sym208$TRANSCRIPT_DATA_SINK_BRANCH_CONSTANT_DELETE = SubLObjectFactory.makeSymbol("TRANSCRIPT-DATA-SINK-BRANCH-CONSTANT-DELETE");
        $sym209$TRANSCRIPT_DATA_SINK_BRANCH_ASSERTION_DELETE = SubLObjectFactory.makeSymbol("TRANSCRIPT-DATA-SINK-BRANCH-ASSERTION-DELETE");
        $sym210$TRANSCRIPT_DATA_SINK_TIP_CONSTANT_CREATE = SubLObjectFactory.makeSymbol("TRANSCRIPT-DATA-SINK-TIP-CONSTANT-CREATE");
        $sym211$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_CREATE = SubLObjectFactory.makeSymbol("TRANSCRIPT-DATA-SINK-TIP-ASSERTION-CREATE");
        $sym212$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_REASSERT = SubLObjectFactory.makeSymbol("TRANSCRIPT-DATA-SINK-TIP-ASSERTION-REASSERT");
        $str213$_FI_KILL____HP__S__S__ = SubLObjectFactory.makeString("(FI-KILL '(:HP ~S ~S))");
        $str214$_FI_UNASSERT___S___S_ = SubLObjectFactory.makeString("(FI-UNASSERT '~S '~S)");
        $str215$_FI_CREATE___S__S_ = SubLObjectFactory.makeString("(FI-CREATE '~S ~S)");
        $str216$_FI_ASSERT___S___S___S___S_ = SubLObjectFactory.makeString("(FI-ASSERT '~S '~S '~S '~S)");
        $str217$_FI_REASSERT___S___S___S___S_ = SubLObjectFactory.makeString("(FI-REASSERT '~S '~S '~S '~S)");
        $str218$_FI_TIMESTAMP_CONSTANT___S___S___ = SubLObjectFactory.makeString("(FI-TIMESTAMP-CONSTANT '~S '~S '~S '~S)");
        $str219$_FI_TIMESTAMP_ASSERTION___S___S__ = SubLObjectFactory.makeString("(FI-TIMESTAMP-ASSERTION '~S '~S '~S '~S)");
        $list220 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HP"), (SubLObject)SubLObjectFactory.makeString("Guest"), (SubLObject)SubLObjectFactory.makeGuid("bd5ad700-9c29-11b1-9dad-c379636f7270"));
        $str221$_ = SubLObjectFactory.makeString("(");
        $str222$_ = SubLObjectFactory.makeString(")");
        $sym223$DEBUG_DATA_SINK_BRANCH_CONSTANT_DELETE = SubLObjectFactory.makeSymbol("DEBUG-DATA-SINK-BRANCH-CONSTANT-DELETE");
        $sym224$DEBUG_DATA_SINK_BRANCH_ASSERTION_DELETE = SubLObjectFactory.makeSymbol("DEBUG-DATA-SINK-BRANCH-ASSERTION-DELETE");
        $sym225$DEBUG_DATA_SINK_TIP_CONSTANT_CREATE = SubLObjectFactory.makeSymbol("DEBUG-DATA-SINK-TIP-CONSTANT-CREATE");
        $sym226$DEBUG_DATA_SINK_TIP_ASSERTION_CREATE = SubLObjectFactory.makeSymbol("DEBUG-DATA-SINK-TIP-ASSERTION-CREATE");
        $sym227$DEBUG_DATA_SINK_TIP_ASSERTION_REASSERT = SubLObjectFactory.makeSymbol("DEBUG-DATA-SINK-TIP-ASSERTION-REASSERT");
        $str228$___kill__A__A__ = SubLObjectFactory.makeString("~&:kill ~A ~A~%");
        $str229$___unassert__A__ = SubLObjectFactory.makeString("~&:unassert ~A~%");
        $str230$___create__A__A__ = SubLObjectFactory.makeString("~&:create ~A ~A~%");
        $str231$___assert__A__ = SubLObjectFactory.makeString("~&:assert ~A~%");
        $str232$___reassert__A__A__A__ = SubLObjectFactory.makeString("~&:reassert ~A ~A ~A~%");
    }
    
    public static final class $elpart_as_desc_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $tl_ist_formula;
        public SubLObject $hash;
        public SubLObject $extra;
        public SubLObject $weak_ist_formula;
        private static final SubLStructDeclNative structDecl;
        
        public $elpart_as_desc_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$tl_ist_formula = (SubLObject)CommonSymbols.NIL;
            this.$hash = (SubLObject)CommonSymbols.NIL;
            this.$extra = (SubLObject)CommonSymbols.NIL;
            this.$weak_ist_formula = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$elpart_as_desc_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$tl_ist_formula;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$hash;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$extra;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$weak_ist_formula;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$tl_ist_formula = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$hash = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$extra = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$weak_ist_formula = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$elpart_as_desc_native.class, el_partitions.$sym97$ELPART_AS_DESC, el_partitions.$sym98$ELPART_AS_DESC_P, el_partitions.$list99, el_partitions.$list100, new String[] { "$id", "$tl_ist_formula", "$hash", "$extra", "$weak_ist_formula" }, el_partitions.$list101, el_partitions.$list102, el_partitions.$sym103$PRINT_ELPART_AS_DESC);
        }
    }
    
    public static final class $elpart_as_desc_p$UnaryFunction extends UnaryFunction
    {
        public $elpart_as_desc_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ELPART-AS-DESC-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return el_partitions.elpart_as_desc_p(arg1);
        }
    }
    
    public static final class $el_partition_data_sink_native extends SubLStructNative
    {
        public SubLObject $state;
        public SubLObject $branch_cdel_fn;
        public SubLObject $branch_asdel_fn;
        public SubLObject $tip_ccreate_fn;
        public SubLObject $tip_ascreate_fn;
        public SubLObject $tip_asreassert_fn;
        private static final SubLStructDeclNative structDecl;
        
        public $el_partition_data_sink_native() {
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$branch_cdel_fn = (SubLObject)CommonSymbols.NIL;
            this.$branch_asdel_fn = (SubLObject)CommonSymbols.NIL;
            this.$tip_ccreate_fn = (SubLObject)CommonSymbols.NIL;
            this.$tip_ascreate_fn = (SubLObject)CommonSymbols.NIL;
            this.$tip_asreassert_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$el_partition_data_sink_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$state;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$branch_cdel_fn;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$branch_asdel_fn;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$tip_ccreate_fn;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$tip_ascreate_fn;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$tip_asreassert_fn;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$branch_cdel_fn = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$branch_asdel_fn = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$tip_ccreate_fn = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$tip_ascreate_fn = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$tip_asreassert_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$el_partition_data_sink_native.class, el_partitions.$sym166$EL_PARTITION_DATA_SINK, el_partitions.$sym62$EL_PARTITION_DATA_SINK_P, el_partitions.$list167, el_partitions.$list168, new String[] { "$state", "$branch_cdel_fn", "$branch_asdel_fn", "$tip_ccreate_fn", "$tip_ascreate_fn", "$tip_asreassert_fn" }, el_partitions.$list169, el_partitions.$list170, el_partitions.$sym171$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $el_partition_data_sink_p$UnaryFunction extends UnaryFunction
    {
        public $el_partition_data_sink_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EL-PARTITION-DATA-SINK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return el_partitions.el_partition_data_sink_p(arg1);
        }
    }
}

/*

	Total time: 2248 ms
	
*/