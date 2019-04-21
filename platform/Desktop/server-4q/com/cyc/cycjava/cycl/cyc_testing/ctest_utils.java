package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_identifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ctest_utils extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.ctest_utils";
    public static final String myFingerPrint = "0ad818adf251d98a103d124a4b13fd2ef70b07d8ea2de1448134e943fcdc23c3";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 779L)
    public static SubLSymbol $default_email_notify_style_id$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1112L)
    public static SubLSymbol $default_test_id$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1156L)
    public static SubLSymbol $default_string_binding_set$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1211L)
    public static SubLSymbol $default_binding_set$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1259L)
    public static SubLSymbol $default_binding_set2$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1308L)
    public static SubLSymbol $default_set_of_binding_sets$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1364L)
    public static SubLSymbol $default_set_of_binding_sets2$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1421L)
    public static SubLSymbol $default_set_of_binding_sets3$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1478L)
    public static SubLSymbol $default_module_sentence$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1530L)
    public static SubLSymbol $default_module_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1576L)
    public static SubLSymbol $default_module_mt2$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1623L)
    public static SubLSymbol $default_dependency_test_id$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1678L)
    public static SubLSymbol $default_dependency_test_id2$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1734L)
    public static SubLSymbol $default_isa_id$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1777L)
    public static SubLSymbol $default_isa_id2$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1821L)
    public static SubLSymbol $default_test_query$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1868L)
    public static SubLSymbol $default_test_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1912L)
    public static SubLSymbol $default_collection_id$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 3839L)
    public static SubLSymbol $ctest_output_formats$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 3903L)
    public static SubLSymbol $ctest_output_styles$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 3981L)
    public static SubLSymbol $max_test_retry_time$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4136L)
    public static SubLSymbol $csc_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4321L)
    public static SubLSymbol $max_image_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4392L)
    public static SubLSymbol $max_image_version_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4440L)
    public static SubLSymbol $max_system_version_num_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4493L)
    public static SubLSymbol $max_kb_number_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4537L)
    public static SubLSymbol $mc_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4716L)
    public static SubLSymbol $max_machine_name_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4790L)
    public static SubLSymbol $max_machine_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4837L)
    public static SubLSymbol $max_machine_hardware_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4893L)
    public static SubLSymbol $max_os_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4935L)
    public static SubLSymbol $te_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5114L)
    public static SubLSymbol $max_test_id_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5183L)
    public static SubLSymbol $max_test_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5227L)
    public static SubLSymbol $max_date_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5266L)
    public static SubLSymbol $max_test_status_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5312L)
    public static SubLSymbol $max_test_execution_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5365L)
    public static SubLSymbol $ctest_test_types$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5447L)
    public static SubLSymbol $ctest_test_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5582L)
    public static SubLSymbol $ctest_success_status$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5637L)
    public static SubLSymbol $ctest_failure_status$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5691L)
    public static SubLSymbol $ctest_dfailure_status$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5747L)
    public static SubLSymbol $ctest_error_status$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5797L)
    public static SubLSymbol $ctest_skipped_status$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5851L)
    public static SubLSymbol $ctest_problem_status$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5905L)
    public static SubLSymbol $kct_test_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5954L)
    public static SubLSymbol $tcmr_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6191L)
    public static SubLSymbol $max_metric_id_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6297L)
    public static SubLSymbol $tmr_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6489L)
    public static SubLSymbol $tem_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6714L)
    public static SubLSymbol $kcte_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6924L)
    public static SubLSymbol $max_exec_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6993L)
    public static SubLSymbol $collection_execution_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7068L)
    public static SubLSymbol $individual_execution_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7279L)
    public static SubLSymbol $kctem_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7515L)
    public static SubLSymbol $max_exec_mode_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7584L)
    public static SubLSymbol $sampling_execution_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7887L)
    public static SubLSymbol $hypothesize_execution_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8153L)
    public static SubLSymbol $simple_execution_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8542L)
    public static SubLSymbol $kctc_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8746L)
    public static SubLSymbol $kcts_project_desc$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8860L)
    public static SubLSymbol $kctcc_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9103L)
    public static SubLSymbol $max_collection_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9178L)
    public static SubLSymbol $collection_test_collection_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9304L)
    public static SubLSymbol $system_test_collection_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9599L)
    public static SubLSymbol $tcrc_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9847L)
    public static SubLSymbol $max_cyclist_id_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9919L)
    public static SubLSymbol $max_email_notify_style_id_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9976L)
    public static SubLSymbol $kctccbs_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10242L)
    public static SubLSymbol $max_binding_designation_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10321L)
    public static SubLSymbol $kct_exact_binding_set_designation$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10418L)
    public static SubLSymbol $kct_wanted_binding_set_designation$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10480L)
    public static SubLSymbol $kct_unwanted_binding_set_designation$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10544L)
    public static SubLSymbol $kct_unimportant_binding_set_designation$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10611L)
    public static SubLSymbol $kct_binding_set_designations$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10691L)
    public static SubLSymbol $kctcas_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10952L)
    public static SubLSymbol $max_support_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11024L)
    public static SubLSymbol $max_support_designation_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11077L)
    public static SubLSymbol $ctest_support_types$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11168L)
    public static SubLSymbol $ctest_support_designations$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11233L)
    public static SubLSymbol $kct_wanted_support_designation$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11339L)
    public static SubLSymbol $kct_unwanted_support_designation$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11399L)
    public static SubLSymbol $kct_support_support_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11451L)
    public static SubLSymbol $kct_module_support_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11502L)
    public static SubLSymbol $ipc_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11694L)
    public static SubLSymbol $max_inference_param_id_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11774L)
    public static SubLSymbol $tmc_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11989L)
    public static SubLSymbol $max_test_metric_type_len$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12065L)
    public static SubLSymbol $ctest_metric_types$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12144L)
    public static SubLSymbol $ctest_collection_level_metric$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12258L)
    public static SubLSymbol $ctest_query_level_metric$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12355L)
    public static SubLSymbol $ctest_binding_level_metric$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12455L)
    public static SubLSymbol $tdc_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12644L)
    public static SubLSymbol $kctcg_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12887L)
    public static SubLSymbol $kctci_table_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 13127L)
    public static SubLSymbol $ctest_storing_p$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 13413L)
    public static SubLSymbol $ctest_storing_configs_p$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 13714L)
    public static SubLSymbol $ctest_required_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 13946L)
    public static SubLSymbol $tests_in_process$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 14613L)
    private static SubLSymbol $ctest_field_maxima$;
    private static final SubLSymbol $sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_;
    private static final SubLSymbol $sym1$_DEFAULT_TEST_ID_;
    private static final SubLSymbol $sym2$_DEFAULT_STRING_BINDING_SET_;
    private static final SubLSymbol $sym3$_DEFAULT_BINDING_SET_;
    private static final SubLSymbol $sym4$_DEFAULT_BINDING_SET2_;
    private static final SubLSymbol $sym5$_DEFAULT_SET_OF_BINDING_SETS_;
    private static final SubLSymbol $sym6$_DEFAULT_SET_OF_BINDING_SETS2_;
    private static final SubLSymbol $sym7$_DEFAULT_SET_OF_BINDING_SETS3_;
    private static final SubLSymbol $sym8$_DEFAULT_MODULE_SENTENCE_;
    private static final SubLSymbol $sym9$_DEFAULT_MODULE_MT_;
    private static final SubLSymbol $sym10$_DEFAULT_MODULE_MT2_;
    private static final SubLSymbol $sym11$_DEFAULT_DEPENDENCY_TEST_ID_;
    private static final SubLSymbol $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_;
    private static final SubLSymbol $sym13$_DEFAULT_ISA_ID_;
    private static final SubLSymbol $sym14$_DEFAULT_ISA_ID2_;
    private static final SubLSymbol $sym15$_DEFAULT_TEST_QUERY_;
    private static final SubLSymbol $sym16$_DEFAULT_TEST_MT_;
    private static final SubLSymbol $sym17$_DEFAULT_COLLECTION_ID_;
    private static final SubLObject $const18$TestResultNotification_EmailBrief;
    private static final SubLObject $const19$TKBTemplateTestForMissingMt;
    private static final SubLString $str20$___TheSet____ELInferenceBindingFn;
    private static final SubLSymbol $sym21$_SOMETHING;
    private static final SubLString $str22$A_SOMETHING;
    private static final SubLSymbol $sym23$_OTHERTHING;
    private static final SubLString $str24$ANOTHER_THING;
    private static final SubLSymbol $sym25$_ANOTHERTHING;
    private static final SubLString $str26$YET_ANOTHER_THING;
    private static final SubLList $list27;
    private static final SubLObject $const28$BaseKB;
    private static final SubLObject $const29$UniversalVocabularyMt;
    private static final SubLObject $const30$TKBTemplateTestForMissingExplanat;
    private static final SubLObject $const31$TKBTemplateTestForMissingExample;
    private static final SubLObject $const32$TKBTemplateIntegrityTest;
    private static final SubLObject $const33$TKB_RTVQueries;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$TEXT;
    private static final SubLSymbol $kw36$HTML;
    private static final SubLSymbol $kw37$BRIEF;
    private static final SubLSymbol $kw38$VERBOSE;
    private static final SubLSymbol $kw39$POST_BUILD;
    private static final SubLInteger $int40$60;
    private static final SubLString $str41$cyc_system_config;
    private static final SubLInteger $int42$50;
    private static final SubLString $str43$machine_config;
    private static final SubLInteger $int44$100;
    private static final SubLString $str45$test_execution;
    private static final SubLString $str46$KBCONTENT;
    private static final SubLString $str47$SUCCESS;
    private static final SubLString $str48$FAILURE;
    private static final SubLString $str49$DFAILURE;
    private static final SubLString $str50$ERROR;
    private static final SubLString $str51$SKIPPED;
    private static final SubLString $str52$PROBLEM;
    private static final SubLString $str53$test_collection_metric_result;
    private static final SubLString $str54$test_metric_result;
    private static final SubLString $str55$test_execution_member;
    private static final SubLString $str56$kct_execution;
    private static final SubLString $str57$C;
    private static final SubLString $str58$I;
    private static final SubLString $str59$kct_execution_member;
    private static final SubLString $str60$S;
    private static final SubLString $str61$H;
    private static final SubLString $str62$X;
    private static final SubLString $str63$kct_config;
    private static final SubLString $str64$KB_Content_Test_System;
    private static final SubLString $str65$kct_collection_config;
    private static final SubLString $str66$test_cyclist_responsible_config;
    private static final SubLString $str67$kct_config_cycl_binding_set;
    private static final SubLString $str68$E;
    private static final SubLString $str69$W;
    private static final SubLString $str70$N;
    private static final SubLString $str71$U;
    private static final SubLString $str72$kct_config_answer_support;
    private static final SubLString $str73$M;
    private static final SubLString $str74$inference_param_config;
    private static final SubLString $str75$test_metric_config;
    private static final SubLString $str76$Q;
    private static final SubLString $str77$B;
    private static final SubLString $str78$test_dependency_config;
    private static final SubLString $str79$kct_config_genls;
    private static final SubLString $str80$kct_config_isas;
    private static final SubLString $str81$Test_or_test_collection_GUID_must;
    private static final SubLString $str82$binding_designation;
    private static final SubLString $str83$cyclist_id;
    private static final SubLString $str84$email_notify_style_id;
    private static final SubLString $str85$execution_type;
    private static final SubLString $str86$genls_id;
    private static final SubLString $str87$image_type;
    private static final SubLString $str88$image_version;
    private static final SubLString $str89$inference_metric_id;
    private static final SubLString $str90$isa_id;
    private static final SubLString $str91$kb_number;
    private static final SubLString $str92$machine_hardware_type;
    private static final SubLString $str93$machine_name;
    private static final SubLString $str94$machine_type;
    private static final SubLString $str95$os_type;
    private static final SubLString $str96$support_type;
    private static final SubLString $str97$system_version_num;
    private static final SubLString $str98$test_id;
    private static final SubLString $str99$test_status;
    private static final SubLString $str100$test_type;
    private static final SubLSymbol $kw101$TRUE;
    private static final SubLSymbol $kw102$FALSE;
    private static final SubLSymbol $kw103$TRUE_DEF;
    private static final SubLSymbol $kw104$TRUE_MON;
    private static final SubLSymbol $kw105$FALSE_DEF;
    private static final SubLSymbol $kw106$FALSE_MON;
    private static final SubLSymbol $sym107$KEYWORDP;
    private static final SubLObject $const108$IndividualTestMetric;
    private static final SubLObject $const109$CollectionTestMetric;
    private static final SubLSymbol $sym110$CONSTANT_P;
    private static final SubLObject $const111$TestMetric;
    private static final SubLObject $const112$UnsupportedTestMetric;
    private static final SubLSymbol $sym113$CTEST_UNSUPPORTED_METRIC_;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1962L)
    public static SubLObject initialize_ctest() {
        ctest_utils.$default_email_notify_style_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id(ctest_utils.$const18$TestResultNotification_EmailBrief)));
        ctest_utils.$default_test_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id(ctest_utils.$const19$TKBTemplateTestForMissingMt)));
        ctest_utils.$default_string_binding_set$.setGlobalValue((SubLObject)ctest_utils.$str20$___TheSet____ELInferenceBindingFn);
        ctest_utils.$default_binding_set$.setGlobalValue(bindings.make_kb_binding_set((SubLObject)ConsesLow.list(bindings.make_kb_binding((SubLObject)ctest_utils.$sym21$_SOMETHING, (SubLObject)ctest_utils.$str22$A_SOMETHING))));
        ctest_utils.$default_binding_set2$.setGlobalValue(bindings.make_kb_binding_set((SubLObject)ConsesLow.list(bindings.make_kb_binding((SubLObject)ctest_utils.$sym23$_OTHERTHING, (SubLObject)ctest_utils.$str24$ANOTHER_THING))));
        ctest_utils.$default_set_of_binding_sets$.setGlobalValue(bindings.make_kb_set_of_binding_sets((SubLObject)ConsesLow.list(bindings.make_kb_binding_set((SubLObject)ConsesLow.list(bindings.make_kb_binding((SubLObject)ctest_utils.$sym21$_SOMETHING, (SubLObject)ctest_utils.$str22$A_SOMETHING))))));
        ctest_utils.$default_set_of_binding_sets2$.setGlobalValue(bindings.make_kb_set_of_binding_sets((SubLObject)ConsesLow.list(bindings.make_kb_binding_set((SubLObject)ConsesLow.list(bindings.make_kb_binding((SubLObject)ctest_utils.$sym23$_OTHERTHING, (SubLObject)ctest_utils.$str24$ANOTHER_THING))))));
        ctest_utils.$default_set_of_binding_sets3$.setGlobalValue(bindings.make_kb_set_of_binding_sets((SubLObject)ConsesLow.list(bindings.make_kb_binding_set((SubLObject)ConsesLow.list(bindings.make_kb_binding((SubLObject)ctest_utils.$sym25$_ANOTHERTHING, (SubLObject)ctest_utils.$str26$YET_ANOTHER_THING))))));
        ctest_utils.$default_module_sentence$.setGlobalValue((SubLObject)ctest_utils.$list27);
        ctest_utils.$default_module_mt$.setGlobalValue(ctest_utils.$const28$BaseKB);
        ctest_utils.$default_module_mt2$.setGlobalValue(ctest_utils.$const29$UniversalVocabularyMt);
        ctest_utils.$default_dependency_test_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id(ctest_utils.$const30$TKBTemplateTestForMissingExplanat)));
        ctest_utils.$default_dependency_test_id2$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id(ctest_utils.$const31$TKBTemplateTestForMissingExample)));
        ctest_utils.$default_isa_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id(ctest_utils.$const32$TKBTemplateIntegrityTest)));
        ctest_utils.$default_isa_id2$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id(ctest_utils.$const33$TKB_RTVQueries)));
        ctest_utils.$default_test_query$.setGlobalValue((SubLObject)ctest_utils.$list34);
        ctest_utils.$default_test_mt$.setGlobalValue(ctest_utils.$const28$BaseKB);
        ctest_utils.$default_collection_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id(ctest_utils.$const32$TKBTemplateIntegrityTest)));
        return (SubLObject)ctest_utils.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7121L)
    public static SubLObject kct_valid_execution_type(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.equalp(ctest_utils.$collection_execution_type$.getGlobalValue()) || v_object.equalp(ctest_utils.$individual_execution_type$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8340L)
    public static SubLObject kct_valid_execution_mode(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.equalp(ctest_utils.$sampling_execution_mode$.getGlobalValue()) || v_object.equalp(ctest_utils.$hypothesize_execution_mode$.getGlobalValue()) || v_object.equalp(ctest_utils.$simple_execution_mode$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9438L)
    public static SubLObject kct_valid_collection_type(final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(type.equalp(ctest_utils.$collection_test_collection_type$.getGlobalValue()) || type.equalp(ctest_utils.$system_test_collection_type$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 14309L)
    public static SubLObject add_in_process_test(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ctest_utils.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && ctest_utils.NIL == id) {
            Errors.error((SubLObject)ctest_utils.$str81$Test_or_test_collection_GUID_must);
        }
        if (ctest_utils.NIL != find_in_process_test(id)) {
            return (SubLObject)ctest_utils.T;
        }
        return dictionary.dictionary_enter(ctest_utils.$tests_in_process$.getDynamicValue(thread), id, (SubLObject)ctest_utils.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 14520L)
    public static SubLObject find_in_process_test(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup(ctest_utils.$tests_in_process$.getDynamicValue(thread), id, (SubLObject)ctest_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 15713L)
    public static SubLObject ctest_truncate_value_for_field(SubLObject value, final SubLObject field_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_length = conses_high.second(conses_high.assoc(field_name, ctest_utils.$ctest_field_maxima$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)ctest_utils.EQUAL), (SubLObject)ctest_utils.UNPROVIDED));
        if (ctest_utils.NIL != max_length) {
            value = string_utilities.string_first_n(max_length, string_utilities.trim_whitespace(value));
        }
        if (value.isString()) {
            return string_utilities.trim_whitespace(value);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 16401L)
    public static SubLObject valid_ctest_output_format(final SubLObject format) {
        return conses_high.member(format, ctest_utils.$ctest_output_formats$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_utils.EQUAL), (SubLObject)ctest_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 16632L)
    public static SubLObject valid_ctest_output_style(final SubLObject style) {
        return conses_high.member(style, ctest_utils.$ctest_output_styles$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_utils.EQUAL), (SubLObject)ctest_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 16789L)
    public static SubLObject valid_ctest_type(final SubLObject type) {
        return conses_high.member(type, ctest_utils.$ctest_test_types$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_utils.EQUAL), (SubLObject)ctest_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 16917L)
    public static SubLObject valid_ctest_status(final SubLObject status) {
        return conses_high.member(status, ctest_utils.$ctest_test_statuses$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_utils.EQUAL), (SubLObject)ctest_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17056L)
    public static SubLObject valid_ctest_support_type(final SubLObject type) {
        return conses_high.member(type, ctest_utils.$ctest_support_types$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_utils.EQUAL), (SubLObject)ctest_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17205L)
    public static SubLObject valid_ctest_support_designation(final SubLObject designation) {
        return conses_high.member(designation, ctest_utils.$ctest_support_designations$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_utils.EQUAL), (SubLObject)ctest_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17389L)
    public static SubLObject valid_ctest_suppport_tv(final SubLObject v_object) {
        if (v_object.eql((SubLObject)ctest_utils.$kw101$TRUE) || v_object.eql((SubLObject)ctest_utils.$kw102$FALSE) || v_object.eql((SubLObject)ctest_utils.$kw103$TRUE_DEF) || v_object.eql((SubLObject)ctest_utils.$kw104$TRUE_MON) || v_object.eql((SubLObject)ctest_utils.$kw105$FALSE_DEF) || v_object.eql((SubLObject)ctest_utils.$kw106$FALSE_MON)) {
            return (SubLObject)ctest_utils.T;
        }
        return (SubLObject)ctest_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17595L)
    public static SubLObject valid_ctest_binding_designation(final SubLObject v_object) {
        return conses_high.member(v_object, ctest_utils.$kct_binding_set_designations$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_utils.EQUAL), (SubLObject)ctest_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17783L)
    public static SubLObject add_leading_and_trailing_text(SubLObject string, final SubLObject leading, final SubLObject trailing) {
        if (ctest_utils.NIL != leading) {
            string = string_utilities.pre_fix(string, leading);
        }
        if (ctest_utils.NIL != trailing) {
            string = string_utilities.post_fix(string, trailing);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 18186L)
    public static SubLObject escape_double_quotes(final SubLObject string) {
        return string_utilities.to_lisp_string(string_utilities.to_lisp_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 18372L)
    public static SubLObject kct_test_metric_from_keyword(final SubLObject keyword) {
        assert ctest_utils.NIL != Types.keywordp(keyword) : keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, ctest_utils.$const108$IndividualTestMetric);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 18729L)
    public static SubLObject kct_collection_test_metric_from_keyword(final SubLObject keyword) {
        assert ctest_utils.NIL != Types.keywordp(keyword) : keyword;
        return subl_identifier.cyc_entity_from_sublid(keyword, ctest_utils.$const109$CollectionTestMetric);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 18892L)
    public static SubLObject kct_keyword_from_test_metric(final SubLObject metric) {
        assert ctest_utils.NIL != constant_handles.constant_p(metric) : metric;
        return subl_identifier.sublid_from_cyc_entity(metric);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 19020L)
    public static SubLObject ctest_kb_test_metric_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ctest_utils.NIL != forts.fort_p(v_object) && ctest_utils.NIL != isa.isa_in_any_mtP(v_object, ctest_utils.$const111$TestMetric));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 19165L)
    public static SubLObject ctest_unsupported_metricP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ctest_utils.NIL != forts.fort_p(v_object) && ctest_utils.NIL != isa.isa_in_any_mtP(v_object, ctest_utils.$const112$UnsupportedTestMetric));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 19368L)
    public static SubLObject ctest_all_kb_test_metric_constants() {
        SubLObject result = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)ctest_utils.$sym110$CONSTANT_P), isa.all_fort_instances_in_all_mts(ctest_utils.$const108$IndividualTestMetric), (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED);
        result = Sequences.remove_if(Symbols.symbol_function((SubLObject)ctest_utils.$sym113$CTEST_UNSUPPORTED_METRIC_), result, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 19610L)
    public static SubLObject ctest_all_kb_collection_test_metric_constants() {
        SubLObject result = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)ctest_utils.$sym110$CONSTANT_P), isa.all_fort_instances_in_all_mts(ctest_utils.$const109$CollectionTestMetric), (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED);
        result = Sequences.remove_if(Symbols.symbol_function((SubLObject)ctest_utils.$sym113$CTEST_UNSUPPORTED_METRIC_), result, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED, (SubLObject)ctest_utils.UNPROVIDED);
        return result;
    }
    
    public static SubLObject declare_ctest_utils_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "initialize_ctest", "INITIALIZE-CTEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "kct_valid_execution_type", "KCT-VALID-EXECUTION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "kct_valid_execution_mode", "KCT-VALID-EXECUTION-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "kct_valid_collection_type", "KCT-VALID-COLLECTION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "add_in_process_test", "ADD-IN-PROCESS-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "find_in_process_test", "FIND-IN-PROCESS-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "ctest_truncate_value_for_field", "CTEST-TRUNCATE-VALUE-FOR-FIELD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "valid_ctest_output_format", "VALID-CTEST-OUTPUT-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "valid_ctest_output_style", "VALID-CTEST-OUTPUT-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "valid_ctest_type", "VALID-CTEST-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "valid_ctest_status", "VALID-CTEST-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "valid_ctest_support_type", "VALID-CTEST-SUPPORT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "valid_ctest_support_designation", "VALID-CTEST-SUPPORT-DESIGNATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "valid_ctest_suppport_tv", "VALID-CTEST-SUPPPORT-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "valid_ctest_binding_designation", "VALID-CTEST-BINDING-DESIGNATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "add_leading_and_trailing_text", "ADD-LEADING-AND-TRAILING-TEXT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "escape_double_quotes", "ESCAPE-DOUBLE-QUOTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "kct_test_metric_from_keyword", "KCT-TEST-METRIC-FROM-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "kct_collection_test_metric_from_keyword", "KCT-COLLECTION-TEST-METRIC-FROM-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "kct_keyword_from_test_metric", "KCT-KEYWORD-FROM-TEST-METRIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "ctest_kb_test_metric_p", "CTEST-KB-TEST-METRIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "ctest_unsupported_metricP", "CTEST-UNSUPPORTED-METRIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "ctest_all_kb_test_metric_constants", "CTEST-ALL-KB-TEST-METRIC-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_utils", "ctest_all_kb_collection_test_metric_constants", "CTEST-ALL-KB-COLLECTION-TEST-METRIC-CONSTANTS", 0, 0, false);
        return (SubLObject)ctest_utils.NIL;
    }
    
    public static SubLObject init_ctest_utils_file() {
        ctest_utils.$default_email_notify_style_id$ = SubLFiles.deflexical("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_, ctest_utils.$default_email_notify_style_id$, ctest_utils.NIL)));
        ctest_utils.$default_test_id$ = SubLFiles.deflexical("*DEFAULT-TEST-ID*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym1$_DEFAULT_TEST_ID_, ctest_utils.$default_test_id$, ctest_utils.NIL)));
        ctest_utils.$default_string_binding_set$ = SubLFiles.deflexical("*DEFAULT-STRING-BINDING-SET*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym2$_DEFAULT_STRING_BINDING_SET_, ctest_utils.$default_string_binding_set$, ctest_utils.NIL)));
        ctest_utils.$default_binding_set$ = SubLFiles.deflexical("*DEFAULT-BINDING-SET*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym3$_DEFAULT_BINDING_SET_, ctest_utils.$default_binding_set$, ctest_utils.NIL)));
        ctest_utils.$default_binding_set2$ = SubLFiles.deflexical("*DEFAULT-BINDING-SET2*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym4$_DEFAULT_BINDING_SET2_, ctest_utils.$default_binding_set2$, ctest_utils.NIL)));
        ctest_utils.$default_set_of_binding_sets$ = SubLFiles.deflexical("*DEFAULT-SET-OF-BINDING-SETS*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym5$_DEFAULT_SET_OF_BINDING_SETS_, ctest_utils.$default_set_of_binding_sets$, ctest_utils.NIL)));
        ctest_utils.$default_set_of_binding_sets2$ = SubLFiles.deflexical("*DEFAULT-SET-OF-BINDING-SETS2*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym6$_DEFAULT_SET_OF_BINDING_SETS2_, ctest_utils.$default_set_of_binding_sets2$, ctest_utils.NIL)));
        ctest_utils.$default_set_of_binding_sets3$ = SubLFiles.deflexical("*DEFAULT-SET-OF-BINDING-SETS3*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym7$_DEFAULT_SET_OF_BINDING_SETS3_, ctest_utils.$default_set_of_binding_sets3$, ctest_utils.NIL)));
        ctest_utils.$default_module_sentence$ = SubLFiles.deflexical("*DEFAULT-MODULE-SENTENCE*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym8$_DEFAULT_MODULE_SENTENCE_, ctest_utils.$default_module_sentence$, ctest_utils.NIL)));
        ctest_utils.$default_module_mt$ = SubLFiles.deflexical("*DEFAULT-MODULE-MT*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym9$_DEFAULT_MODULE_MT_, ctest_utils.$default_module_mt$, ctest_utils.NIL)));
        ctest_utils.$default_module_mt2$ = SubLFiles.deflexical("*DEFAULT-MODULE-MT2*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym10$_DEFAULT_MODULE_MT2_, ctest_utils.$default_module_mt2$, ctest_utils.NIL)));
        ctest_utils.$default_dependency_test_id$ = SubLFiles.deflexical("*DEFAULT-DEPENDENCY-TEST-ID*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym11$_DEFAULT_DEPENDENCY_TEST_ID_, ctest_utils.$default_dependency_test_id$, ctest_utils.NIL)));
        ctest_utils.$default_dependency_test_id2$ = SubLFiles.deflexical("*DEFAULT-DEPENDENCY-TEST-ID2*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym12$_DEFAULT_DEPENDENCY_TEST_ID2_, ctest_utils.$default_dependency_test_id2$, ctest_utils.NIL)));
        ctest_utils.$default_isa_id$ = SubLFiles.deflexical("*DEFAULT-ISA-ID*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym13$_DEFAULT_ISA_ID_, ctest_utils.$default_isa_id$, ctest_utils.NIL)));
        ctest_utils.$default_isa_id2$ = SubLFiles.deflexical("*DEFAULT-ISA-ID2*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym14$_DEFAULT_ISA_ID2_, ctest_utils.$default_isa_id2$, ctest_utils.NIL)));
        ctest_utils.$default_test_query$ = SubLFiles.deflexical("*DEFAULT-TEST-QUERY*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym15$_DEFAULT_TEST_QUERY_, ctest_utils.$default_test_query$, ctest_utils.NIL)));
        ctest_utils.$default_test_mt$ = SubLFiles.deflexical("*DEFAULT-TEST-MT*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym16$_DEFAULT_TEST_MT_, ctest_utils.$default_test_mt$, ctest_utils.NIL)));
        ctest_utils.$default_collection_id$ = SubLFiles.deflexical("*DEFAULT-COLLECTION-ID*", (SubLObject)(maybeDefault((SubLObject)ctest_utils.$sym17$_DEFAULT_COLLECTION_ID_, ctest_utils.$default_collection_id$, ctest_utils.NIL)));
        ctest_utils.$ctest_output_formats$ = SubLFiles.defconstant("*CTEST-OUTPUT-FORMATS*", (SubLObject)ConsesLow.list((SubLObject)ctest_utils.$kw35$TEXT, (SubLObject)ctest_utils.$kw36$HTML));
        ctest_utils.$ctest_output_styles$ = SubLFiles.defconstant("*CTEST-OUTPUT-STYLES*", (SubLObject)ConsesLow.list((SubLObject)ctest_utils.$kw37$BRIEF, (SubLObject)ctest_utils.$kw38$VERBOSE, (SubLObject)ctest_utils.$kw39$POST_BUILD));
        ctest_utils.$max_test_retry_time$ = SubLFiles.defconstant("*MAX-TEST-RETRY-TIME*", (SubLObject)ctest_utils.$int40$60);
        ctest_utils.$csc_table_name$ = SubLFiles.defconstant("*CSC-TABLE-NAME*", (SubLObject)ctest_utils.$str41$cyc_system_config);
        ctest_utils.$max_image_type_len$ = SubLFiles.defconstant("*MAX-IMAGE-TYPE-LEN*", (SubLObject)ctest_utils.$int42$50);
        ctest_utils.$max_image_version_len$ = SubLFiles.defconstant("*MAX-IMAGE-VERSION-LEN*", (SubLObject)ctest_utils.$int42$50);
        ctest_utils.$max_system_version_num_len$ = SubLFiles.defconstant("*MAX-SYSTEM-VERSION-NUM-LEN*", (SubLObject)ctest_utils.TEN_INTEGER);
        ctest_utils.$max_kb_number_len$ = SubLFiles.defconstant("*MAX-KB-NUMBER-LEN*", (SubLObject)ctest_utils.TWELVE_INTEGER);
        ctest_utils.$mc_table_name$ = SubLFiles.defconstant("*MC-TABLE-NAME*", (SubLObject)ctest_utils.$str43$machine_config);
        ctest_utils.$max_machine_name_len$ = SubLFiles.defconstant("*MAX-MACHINE-NAME-LEN*", (SubLObject)ctest_utils.$int44$100);
        ctest_utils.$max_machine_type_len$ = SubLFiles.defconstant("*MAX-MACHINE-TYPE-LEN*", (SubLObject)ctest_utils.$int42$50);
        ctest_utils.$max_machine_hardware_type_len$ = SubLFiles.defconstant("*MAX-MACHINE-HARDWARE-TYPE-LEN*", (SubLObject)ctest_utils.TWENTY_INTEGER);
        ctest_utils.$max_os_type_len$ = SubLFiles.defconstant("*MAX-OS-TYPE-LEN*", (SubLObject)ctest_utils.$int42$50);
        ctest_utils.$te_table_name$ = SubLFiles.defconstant("*TE-TABLE-NAME*", (SubLObject)ctest_utils.$str45$test_execution);
        ctest_utils.$max_test_id_len$ = SubLFiles.defconstant("*MAX-TEST-ID-LEN*", (SubLObject)ctest_utils.$int44$100);
        ctest_utils.$max_test_type_len$ = SubLFiles.defconstant("*MAX-TEST-TYPE-LEN*", (SubLObject)ctest_utils.TWENTY_INTEGER);
        ctest_utils.$max_date_len$ = SubLFiles.defconstant("*MAX-DATE-LEN*", (SubLObject)ctest_utils.NINETEEN_INTEGER);
        ctest_utils.$max_test_status_len$ = SubLFiles.defconstant("*MAX-TEST-STATUS-LEN*", (SubLObject)ctest_utils.TEN_INTEGER);
        ctest_utils.$max_test_execution_type_len$ = SubLFiles.defconstant("*MAX-TEST-EXECUTION-TYPE-LEN*", (SubLObject)ctest_utils.ONE_INTEGER);
        ctest_utils.$ctest_test_types$ = SubLFiles.defconstant("*CTEST-TEST-TYPES*", (SubLObject)ConsesLow.list((SubLObject)ctest_utils.$str46$KBCONTENT));
        ctest_utils.$ctest_test_statuses$ = SubLFiles.defconstant("*CTEST-TEST-STATUSES*", (SubLObject)ConsesLow.list((SubLObject)ctest_utils.$str47$SUCCESS, (SubLObject)ctest_utils.$str48$FAILURE, (SubLObject)ctest_utils.$str49$DFAILURE, (SubLObject)ctest_utils.$str50$ERROR, (SubLObject)ctest_utils.$str51$SKIPPED, (SubLObject)ctest_utils.$str52$PROBLEM));
        ctest_utils.$ctest_success_status$ = SubLFiles.defconstant("*CTEST-SUCCESS-STATUS*", (SubLObject)ctest_utils.$str47$SUCCESS);
        ctest_utils.$ctest_failure_status$ = SubLFiles.defconstant("*CTEST-FAILURE-STATUS*", (SubLObject)ctest_utils.$str48$FAILURE);
        ctest_utils.$ctest_dfailure_status$ = SubLFiles.defconstant("*CTEST-DFAILURE-STATUS*", (SubLObject)ctest_utils.$str49$DFAILURE);
        ctest_utils.$ctest_error_status$ = SubLFiles.defconstant("*CTEST-ERROR-STATUS*", (SubLObject)ctest_utils.$str50$ERROR);
        ctest_utils.$ctest_skipped_status$ = SubLFiles.defconstant("*CTEST-SKIPPED-STATUS*", (SubLObject)ctest_utils.$str51$SKIPPED);
        ctest_utils.$ctest_problem_status$ = SubLFiles.defconstant("*CTEST-PROBLEM-STATUS*", (SubLObject)ctest_utils.$str52$PROBLEM);
        ctest_utils.$kct_test_type$ = SubLFiles.defconstant("*KCT-TEST-TYPE*", (SubLObject)ctest_utils.$str46$KBCONTENT);
        ctest_utils.$tcmr_table_name$ = SubLFiles.defconstant("*TCMR-TABLE-NAME*", (SubLObject)ctest_utils.$str53$test_collection_metric_result);
        ctest_utils.$max_metric_id_len$ = SubLFiles.defconstant("*MAX-METRIC-ID-LEN*", (SubLObject)ctest_utils.$int44$100);
        ctest_utils.$tmr_table_name$ = SubLFiles.defconstant("*TMR-TABLE-NAME*", (SubLObject)ctest_utils.$str54$test_metric_result);
        ctest_utils.$tem_table_name$ = SubLFiles.defconstant("*TEM-TABLE-NAME*", (SubLObject)ctest_utils.$str55$test_execution_member);
        ctest_utils.$kcte_table_name$ = SubLFiles.defconstant("*KCTE-TABLE-NAME*", (SubLObject)ctest_utils.$str56$kct_execution);
        ctest_utils.$max_exec_type_len$ = SubLFiles.defconstant("*MAX-EXEC-TYPE-LEN*", (SubLObject)ctest_utils.ONE_INTEGER);
        ctest_utils.$collection_execution_type$ = SubLFiles.defconstant("*COLLECTION-EXECUTION-TYPE*", (SubLObject)ctest_utils.$str57$C);
        ctest_utils.$individual_execution_type$ = SubLFiles.defconstant("*INDIVIDUAL-EXECUTION-TYPE*", (SubLObject)ctest_utils.$str58$I);
        ctest_utils.$kctem_table_name$ = SubLFiles.defconstant("*KCTEM-TABLE-NAME*", (SubLObject)ctest_utils.$str59$kct_execution_member);
        ctest_utils.$max_exec_mode_len$ = SubLFiles.defconstant("*MAX-EXEC-MODE-LEN*", (SubLObject)ctest_utils.ONE_INTEGER);
        ctest_utils.$sampling_execution_mode$ = SubLFiles.defconstant("*SAMPLING-EXECUTION-MODE*", (SubLObject)ctest_utils.$str60$S);
        ctest_utils.$hypothesize_execution_mode$ = SubLFiles.defconstant("*HYPOTHESIZE-EXECUTION-MODE*", (SubLObject)ctest_utils.$str61$H);
        ctest_utils.$simple_execution_mode$ = SubLFiles.defconstant("*SIMPLE-EXECUTION-MODE*", (SubLObject)ctest_utils.$str62$X);
        ctest_utils.$kctc_table_name$ = SubLFiles.defconstant("*KCTC-TABLE-NAME*", (SubLObject)ctest_utils.$str63$kct_config);
        ctest_utils.$kcts_project_desc$ = SubLFiles.defconstant("*KCTS-PROJECT-DESC*", (SubLObject)ctest_utils.$str64$KB_Content_Test_System);
        ctest_utils.$kctcc_table_name$ = SubLFiles.defconstant("*KCTCC-TABLE-NAME*", (SubLObject)ctest_utils.$str65$kct_collection_config);
        ctest_utils.$max_collection_type_len$ = SubLFiles.defconstant("*MAX-COLLECTION-TYPE-LEN*", (SubLObject)ctest_utils.ONE_INTEGER);
        ctest_utils.$collection_test_collection_type$ = SubLFiles.defconstant("*COLLECTION-TEST-COLLECTION-TYPE*", (SubLObject)ctest_utils.$str57$C);
        ctest_utils.$system_test_collection_type$ = SubLFiles.defconstant("*SYSTEM-TEST-COLLECTION-TYPE*", (SubLObject)ctest_utils.$str60$S);
        ctest_utils.$tcrc_table_name$ = SubLFiles.defconstant("*TCRC-TABLE-NAME*", (SubLObject)ctest_utils.$str66$test_cyclist_responsible_config);
        ctest_utils.$max_cyclist_id_len$ = SubLFiles.defconstant("*MAX-CYCLIST-ID-LEN*", (SubLObject)ctest_utils.$int44$100);
        ctest_utils.$max_email_notify_style_id_len$ = SubLFiles.defconstant("*MAX-EMAIL-NOTIFY-STYLE-ID-LEN*", (SubLObject)ctest_utils.$int44$100);
        ctest_utils.$kctccbs_table_name$ = SubLFiles.defconstant("*KCTCCBS-TABLE-NAME*", (SubLObject)ctest_utils.$str67$kct_config_cycl_binding_set);
        ctest_utils.$max_binding_designation_len$ = SubLFiles.defconstant("*MAX-BINDING-DESIGNATION-LEN*", (SubLObject)ctest_utils.ONE_INTEGER);
        ctest_utils.$kct_exact_binding_set_designation$ = SubLFiles.defconstant("*KCT-EXACT-BINDING-SET-DESIGNATION*", (SubLObject)ctest_utils.$str68$E);
        ctest_utils.$kct_wanted_binding_set_designation$ = SubLFiles.defconstant("*KCT-WANTED-BINDING-SET-DESIGNATION*", (SubLObject)ctest_utils.$str69$W);
        ctest_utils.$kct_unwanted_binding_set_designation$ = SubLFiles.defconstant("*KCT-UNWANTED-BINDING-SET-DESIGNATION*", (SubLObject)ctest_utils.$str70$N);
        ctest_utils.$kct_unimportant_binding_set_designation$ = SubLFiles.defconstant("*KCT-UNIMPORTANT-BINDING-SET-DESIGNATION*", (SubLObject)ctest_utils.$str71$U);
        ctest_utils.$kct_binding_set_designations$ = SubLFiles.defconstant("*KCT-BINDING-SET-DESIGNATIONS*", (SubLObject)ConsesLow.list((SubLObject)ctest_utils.$str68$E, (SubLObject)ctest_utils.$str69$W, (SubLObject)ctest_utils.$str70$N, (SubLObject)ctest_utils.$str71$U));
        ctest_utils.$kctcas_table_name$ = SubLFiles.defconstant("*KCTCAS-TABLE-NAME*", (SubLObject)ctest_utils.$str72$kct_config_answer_support);
        ctest_utils.$max_support_type_len$ = SubLFiles.defconstant("*MAX-SUPPORT-TYPE-LEN*", (SubLObject)ctest_utils.ONE_INTEGER);
        ctest_utils.$max_support_designation_len$ = SubLFiles.defconstant("*MAX-SUPPORT-DESIGNATION-LEN*", (SubLObject)ctest_utils.ONE_INTEGER);
        ctest_utils.$ctest_support_types$ = SubLFiles.defconstant("*CTEST-SUPPORT-TYPES*", (SubLObject)ConsesLow.list((SubLObject)ctest_utils.$str73$M, (SubLObject)ctest_utils.$str60$S));
        ctest_utils.$ctest_support_designations$ = SubLFiles.defconstant("*CTEST-SUPPORT-DESIGNATIONS*", (SubLObject)ConsesLow.list((SubLObject)ctest_utils.$str69$W, (SubLObject)ctest_utils.$str70$N));
        ctest_utils.$kct_wanted_support_designation$ = SubLFiles.defconstant("*KCT-WANTED-SUPPORT-DESIGNATION*", (SubLObject)ctest_utils.$str69$W);
        ctest_utils.$kct_unwanted_support_designation$ = SubLFiles.defconstant("*KCT-UNWANTED-SUPPORT-DESIGNATION*", (SubLObject)ctest_utils.$str70$N);
        ctest_utils.$kct_support_support_type$ = SubLFiles.defconstant("*KCT-SUPPORT-SUPPORT-TYPE*", (SubLObject)ctest_utils.$str60$S);
        ctest_utils.$kct_module_support_type$ = SubLFiles.defconstant("*KCT-MODULE-SUPPORT-TYPE*", (SubLObject)ctest_utils.$str73$M);
        ctest_utils.$ipc_table_name$ = SubLFiles.defconstant("*IPC-TABLE-NAME*", (SubLObject)ctest_utils.$str74$inference_param_config);
        ctest_utils.$max_inference_param_id_len$ = SubLFiles.defconstant("*MAX-INFERENCE-PARAM-ID-LEN*", (SubLObject)ctest_utils.$int44$100);
        ctest_utils.$tmc_table_name$ = SubLFiles.defconstant("*TMC-TABLE-NAME*", (SubLObject)ctest_utils.$str75$test_metric_config);
        ctest_utils.$max_test_metric_type_len$ = SubLFiles.defconstant("*MAX-TEST-METRIC-TYPE-LEN*", (SubLObject)ctest_utils.ONE_INTEGER);
        ctest_utils.$ctest_metric_types$ = SubLFiles.defconstant("*CTEST-METRIC-TYPES*", (SubLObject)ConsesLow.list((SubLObject)ctest_utils.$str57$C, (SubLObject)ctest_utils.$str76$Q, (SubLObject)ctest_utils.$str77$B));
        ctest_utils.$ctest_collection_level_metric$ = SubLFiles.defconstant("*CTEST-COLLECTION-LEVEL-METRIC*", (SubLObject)ctest_utils.$str57$C);
        ctest_utils.$ctest_query_level_metric$ = SubLFiles.defconstant("*CTEST-QUERY-LEVEL-METRIC*", (SubLObject)ctest_utils.$str76$Q);
        ctest_utils.$ctest_binding_level_metric$ = SubLFiles.defconstant("*CTEST-BINDING-LEVEL-METRIC*", (SubLObject)ctest_utils.$str77$B);
        ctest_utils.$tdc_table_name$ = SubLFiles.defconstant("*TDC-TABLE-NAME*", (SubLObject)ctest_utils.$str78$test_dependency_config);
        ctest_utils.$kctcg_table_name$ = SubLFiles.defconstant("*KCTCG-TABLE-NAME*", (SubLObject)ctest_utils.$str79$kct_config_genls);
        ctest_utils.$kctci_table_name$ = SubLFiles.defconstant("*KCTCI-TABLE-NAME*", (SubLObject)ctest_utils.$str80$kct_config_isas);
        ctest_utils.$ctest_storing_p$ = SubLFiles.defparameter("*CTEST-STORING-P*", (SubLObject)ctest_utils.NIL);
        ctest_utils.$ctest_storing_configs_p$ = SubLFiles.defparameter("*CTEST-STORING-CONFIGS-P*", (SubLObject)ctest_utils.NIL);
        ctest_utils.$ctest_required_metrics$ = SubLFiles.defparameter("*CTEST-REQUIRED-METRICS*", (SubLObject)ctest_utils.NIL);
        ctest_utils.$tests_in_process$ = SubLFiles.defparameter("*TESTS-IN-PROCESS*", (SubLObject)ctest_utils.NIL);
        ctest_utils.$ctest_field_maxima$ = SubLFiles.defparameter("*CTEST-FIELD-MAXIMA*", (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ctest_utils.$str82$binding_designation, ctest_utils.$max_binding_designation_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str83$cyclist_id, ctest_utils.$max_cyclist_id_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str84$email_notify_style_id, ctest_utils.$max_email_notify_style_id_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str85$execution_type, ctest_utils.$max_exec_type_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str86$genls_id, ctest_utils.$max_test_id_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str87$image_type, ctest_utils.$max_image_type_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str88$image_version, ctest_utils.$max_image_version_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str89$inference_metric_id, ctest_utils.$max_metric_id_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str90$isa_id, ctest_utils.$max_test_id_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str91$kb_number, ctest_utils.$max_kb_number_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str92$machine_hardware_type, ctest_utils.$max_machine_hardware_type_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str93$machine_name, ctest_utils.$max_machine_name_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str94$machine_type, ctest_utils.$max_machine_type_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str95$os_type, ctest_utils.$max_os_type_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str96$support_type, ctest_utils.$max_support_type_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str97$system_version_num, ctest_utils.$max_system_version_num_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str98$test_id, ctest_utils.$max_test_id_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str99$test_status, ctest_utils.$max_test_status_len$.getGlobalValue()), ConsesLow.list((SubLObject)ctest_utils.$str100$test_type, ctest_utils.$max_test_type_len$.getGlobalValue()) }));
        return (SubLObject)ctest_utils.NIL;
    }
    
    public static SubLObject setup_ctest_utils_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym1$_DEFAULT_TEST_ID_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym2$_DEFAULT_STRING_BINDING_SET_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym3$_DEFAULT_BINDING_SET_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym4$_DEFAULT_BINDING_SET2_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym5$_DEFAULT_SET_OF_BINDING_SETS_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym6$_DEFAULT_SET_OF_BINDING_SETS2_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym7$_DEFAULT_SET_OF_BINDING_SETS3_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym8$_DEFAULT_MODULE_SENTENCE_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym9$_DEFAULT_MODULE_MT_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym10$_DEFAULT_MODULE_MT2_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym11$_DEFAULT_DEPENDENCY_TEST_ID_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym12$_DEFAULT_DEPENDENCY_TEST_ID2_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym13$_DEFAULT_ISA_ID_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym14$_DEFAULT_ISA_ID2_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym15$_DEFAULT_TEST_QUERY_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym16$_DEFAULT_TEST_MT_);
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_utils.$sym17$_DEFAULT_COLLECTION_ID_);
        return (SubLObject)ctest_utils.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_ctest_utils_file();
    }
    
    @Override
	public void initializeVariables() {
        init_ctest_utils_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_ctest_utils_file();
    }
    
    static {
        me = (SubLFile)new ctest_utils();
        ctest_utils.$default_email_notify_style_id$ = null;
        ctest_utils.$default_test_id$ = null;
        ctest_utils.$default_string_binding_set$ = null;
        ctest_utils.$default_binding_set$ = null;
        ctest_utils.$default_binding_set2$ = null;
        ctest_utils.$default_set_of_binding_sets$ = null;
        ctest_utils.$default_set_of_binding_sets2$ = null;
        ctest_utils.$default_set_of_binding_sets3$ = null;
        ctest_utils.$default_module_sentence$ = null;
        ctest_utils.$default_module_mt$ = null;
        ctest_utils.$default_module_mt2$ = null;
        ctest_utils.$default_dependency_test_id$ = null;
        ctest_utils.$default_dependency_test_id2$ = null;
        ctest_utils.$default_isa_id$ = null;
        ctest_utils.$default_isa_id2$ = null;
        ctest_utils.$default_test_query$ = null;
        ctest_utils.$default_test_mt$ = null;
        ctest_utils.$default_collection_id$ = null;
        ctest_utils.$ctest_output_formats$ = null;
        ctest_utils.$ctest_output_styles$ = null;
        ctest_utils.$max_test_retry_time$ = null;
        ctest_utils.$csc_table_name$ = null;
        ctest_utils.$max_image_type_len$ = null;
        ctest_utils.$max_image_version_len$ = null;
        ctest_utils.$max_system_version_num_len$ = null;
        ctest_utils.$max_kb_number_len$ = null;
        ctest_utils.$mc_table_name$ = null;
        ctest_utils.$max_machine_name_len$ = null;
        ctest_utils.$max_machine_type_len$ = null;
        ctest_utils.$max_machine_hardware_type_len$ = null;
        ctest_utils.$max_os_type_len$ = null;
        ctest_utils.$te_table_name$ = null;
        ctest_utils.$max_test_id_len$ = null;
        ctest_utils.$max_test_type_len$ = null;
        ctest_utils.$max_date_len$ = null;
        ctest_utils.$max_test_status_len$ = null;
        ctest_utils.$max_test_execution_type_len$ = null;
        ctest_utils.$ctest_test_types$ = null;
        ctest_utils.$ctest_test_statuses$ = null;
        ctest_utils.$ctest_success_status$ = null;
        ctest_utils.$ctest_failure_status$ = null;
        ctest_utils.$ctest_dfailure_status$ = null;
        ctest_utils.$ctest_error_status$ = null;
        ctest_utils.$ctest_skipped_status$ = null;
        ctest_utils.$ctest_problem_status$ = null;
        ctest_utils.$kct_test_type$ = null;
        ctest_utils.$tcmr_table_name$ = null;
        ctest_utils.$max_metric_id_len$ = null;
        ctest_utils.$tmr_table_name$ = null;
        ctest_utils.$tem_table_name$ = null;
        ctest_utils.$kcte_table_name$ = null;
        ctest_utils.$max_exec_type_len$ = null;
        ctest_utils.$collection_execution_type$ = null;
        ctest_utils.$individual_execution_type$ = null;
        ctest_utils.$kctem_table_name$ = null;
        ctest_utils.$max_exec_mode_len$ = null;
        ctest_utils.$sampling_execution_mode$ = null;
        ctest_utils.$hypothesize_execution_mode$ = null;
        ctest_utils.$simple_execution_mode$ = null;
        ctest_utils.$kctc_table_name$ = null;
        ctest_utils.$kcts_project_desc$ = null;
        ctest_utils.$kctcc_table_name$ = null;
        ctest_utils.$max_collection_type_len$ = null;
        ctest_utils.$collection_test_collection_type$ = null;
        ctest_utils.$system_test_collection_type$ = null;
        ctest_utils.$tcrc_table_name$ = null;
        ctest_utils.$max_cyclist_id_len$ = null;
        ctest_utils.$max_email_notify_style_id_len$ = null;
        ctest_utils.$kctccbs_table_name$ = null;
        ctest_utils.$max_binding_designation_len$ = null;
        ctest_utils.$kct_exact_binding_set_designation$ = null;
        ctest_utils.$kct_wanted_binding_set_designation$ = null;
        ctest_utils.$kct_unwanted_binding_set_designation$ = null;
        ctest_utils.$kct_unimportant_binding_set_designation$ = null;
        ctest_utils.$kct_binding_set_designations$ = null;
        ctest_utils.$kctcas_table_name$ = null;
        ctest_utils.$max_support_type_len$ = null;
        ctest_utils.$max_support_designation_len$ = null;
        ctest_utils.$ctest_support_types$ = null;
        ctest_utils.$ctest_support_designations$ = null;
        ctest_utils.$kct_wanted_support_designation$ = null;
        ctest_utils.$kct_unwanted_support_designation$ = null;
        ctest_utils.$kct_support_support_type$ = null;
        ctest_utils.$kct_module_support_type$ = null;
        ctest_utils.$ipc_table_name$ = null;
        ctest_utils.$max_inference_param_id_len$ = null;
        ctest_utils.$tmc_table_name$ = null;
        ctest_utils.$max_test_metric_type_len$ = null;
        ctest_utils.$ctest_metric_types$ = null;
        ctest_utils.$ctest_collection_level_metric$ = null;
        ctest_utils.$ctest_query_level_metric$ = null;
        ctest_utils.$ctest_binding_level_metric$ = null;
        ctest_utils.$tdc_table_name$ = null;
        ctest_utils.$kctcg_table_name$ = null;
        ctest_utils.$kctci_table_name$ = null;
        ctest_utils.$ctest_storing_p$ = null;
        ctest_utils.$ctest_storing_configs_p$ = null;
        ctest_utils.$ctest_required_metrics$ = null;
        ctest_utils.$tests_in_process$ = null;
        ctest_utils.$ctest_field_maxima$ = null;
        $sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_ = SubLObjectFactory.makeSymbol("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*");
        $sym1$_DEFAULT_TEST_ID_ = SubLObjectFactory.makeSymbol("*DEFAULT-TEST-ID*");
        $sym2$_DEFAULT_STRING_BINDING_SET_ = SubLObjectFactory.makeSymbol("*DEFAULT-STRING-BINDING-SET*");
        $sym3$_DEFAULT_BINDING_SET_ = SubLObjectFactory.makeSymbol("*DEFAULT-BINDING-SET*");
        $sym4$_DEFAULT_BINDING_SET2_ = SubLObjectFactory.makeSymbol("*DEFAULT-BINDING-SET2*");
        $sym5$_DEFAULT_SET_OF_BINDING_SETS_ = SubLObjectFactory.makeSymbol("*DEFAULT-SET-OF-BINDING-SETS*");
        $sym6$_DEFAULT_SET_OF_BINDING_SETS2_ = SubLObjectFactory.makeSymbol("*DEFAULT-SET-OF-BINDING-SETS2*");
        $sym7$_DEFAULT_SET_OF_BINDING_SETS3_ = SubLObjectFactory.makeSymbol("*DEFAULT-SET-OF-BINDING-SETS3*");
        $sym8$_DEFAULT_MODULE_SENTENCE_ = SubLObjectFactory.makeSymbol("*DEFAULT-MODULE-SENTENCE*");
        $sym9$_DEFAULT_MODULE_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-MODULE-MT*");
        $sym10$_DEFAULT_MODULE_MT2_ = SubLObjectFactory.makeSymbol("*DEFAULT-MODULE-MT2*");
        $sym11$_DEFAULT_DEPENDENCY_TEST_ID_ = SubLObjectFactory.makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID*");
        $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_ = SubLObjectFactory.makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID2*");
        $sym13$_DEFAULT_ISA_ID_ = SubLObjectFactory.makeSymbol("*DEFAULT-ISA-ID*");
        $sym14$_DEFAULT_ISA_ID2_ = SubLObjectFactory.makeSymbol("*DEFAULT-ISA-ID2*");
        $sym15$_DEFAULT_TEST_QUERY_ = SubLObjectFactory.makeSymbol("*DEFAULT-TEST-QUERY*");
        $sym16$_DEFAULT_TEST_MT_ = SubLObjectFactory.makeSymbol("*DEFAULT-TEST-MT*");
        $sym17$_DEFAULT_COLLECTION_ID_ = SubLObjectFactory.makeSymbol("*DEFAULT-COLLECTION-ID*");
        $const18$TestResultNotification_EmailBrief = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestResultNotification-EmailBrief"));
        $const19$TKBTemplateTestForMissingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBTemplateTestForMissingMt"));
        $str20$___TheSet____ELInferenceBindingFn = SubLObjectFactory.makeString("(#$TheSet (#$ELInferenceBindingFn ?SOMETHING \"A SOMETHING\"))");
        $sym21$_SOMETHING = SubLObjectFactory.makeSymbol("?SOMETHING");
        $str22$A_SOMETHING = SubLObjectFactory.makeString("A SOMETHING");
        $sym23$_OTHERTHING = SubLObjectFactory.makeSymbol("?OTHERTHING");
        $str24$ANOTHER_THING = SubLObjectFactory.makeString("ANOTHER THING");
        $sym25$_ANOTHERTHING = SubLObjectFactory.makeSymbol("?ANOTHERTHING");
        $str26$YET_ANOTHER_THING = SubLObjectFactory.makeString("YET ANOTHER THING");
        $list27 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $const28$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const29$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const30$TKBTemplateTestForMissingExplanat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBTemplateTestForMissingExplanation"));
        $const31$TKBTemplateTestForMissingExample = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBTemplateTestForMissingExample"));
        $const32$TKBTemplateIntegrityTest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBTemplateIntegrityTest"));
        $const33$TKB_RTVQueries = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKB-RTVQueries"));
        $list34 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), (SubLObject)SubLObjectFactory.makeSymbol("?WHAT"));
        $kw35$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw36$HTML = SubLObjectFactory.makeKeyword("HTML");
        $kw37$BRIEF = SubLObjectFactory.makeKeyword("BRIEF");
        $kw38$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $kw39$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $int40$60 = SubLObjectFactory.makeInteger(60);
        $str41$cyc_system_config = SubLObjectFactory.makeString("cyc_system_config");
        $int42$50 = SubLObjectFactory.makeInteger(50);
        $str43$machine_config = SubLObjectFactory.makeString("machine_config");
        $int44$100 = SubLObjectFactory.makeInteger(100);
        $str45$test_execution = SubLObjectFactory.makeString("test_execution");
        $str46$KBCONTENT = SubLObjectFactory.makeString("KBCONTENT");
        $str47$SUCCESS = SubLObjectFactory.makeString("SUCCESS");
        $str48$FAILURE = SubLObjectFactory.makeString("FAILURE");
        $str49$DFAILURE = SubLObjectFactory.makeString("DFAILURE");
        $str50$ERROR = SubLObjectFactory.makeString("ERROR");
        $str51$SKIPPED = SubLObjectFactory.makeString("SKIPPED");
        $str52$PROBLEM = SubLObjectFactory.makeString("PROBLEM");
        $str53$test_collection_metric_result = SubLObjectFactory.makeString("test_collection_metric_result");
        $str54$test_metric_result = SubLObjectFactory.makeString("test_metric_result");
        $str55$test_execution_member = SubLObjectFactory.makeString("test_execution_member");
        $str56$kct_execution = SubLObjectFactory.makeString("kct_execution");
        $str57$C = SubLObjectFactory.makeString("C");
        $str58$I = SubLObjectFactory.makeString("I");
        $str59$kct_execution_member = SubLObjectFactory.makeString("kct_execution_member");
        $str60$S = SubLObjectFactory.makeString("S");
        $str61$H = SubLObjectFactory.makeString("H");
        $str62$X = SubLObjectFactory.makeString("X");
        $str63$kct_config = SubLObjectFactory.makeString("kct_config");
        $str64$KB_Content_Test_System = SubLObjectFactory.makeString("KB Content Test System");
        $str65$kct_collection_config = SubLObjectFactory.makeString("kct_collection_config");
        $str66$test_cyclist_responsible_config = SubLObjectFactory.makeString("test_cyclist_responsible_config");
        $str67$kct_config_cycl_binding_set = SubLObjectFactory.makeString("kct_config_cycl_binding_set");
        $str68$E = SubLObjectFactory.makeString("E");
        $str69$W = SubLObjectFactory.makeString("W");
        $str70$N = SubLObjectFactory.makeString("N");
        $str71$U = SubLObjectFactory.makeString("U");
        $str72$kct_config_answer_support = SubLObjectFactory.makeString("kct_config_answer_support");
        $str73$M = SubLObjectFactory.makeString("M");
        $str74$inference_param_config = SubLObjectFactory.makeString("inference_param_config");
        $str75$test_metric_config = SubLObjectFactory.makeString("test_metric_config");
        $str76$Q = SubLObjectFactory.makeString("Q");
        $str77$B = SubLObjectFactory.makeString("B");
        $str78$test_dependency_config = SubLObjectFactory.makeString("test_dependency_config");
        $str79$kct_config_genls = SubLObjectFactory.makeString("kct_config_genls");
        $str80$kct_config_isas = SubLObjectFactory.makeString("kct_config_isas");
        $str81$Test_or_test_collection_GUID_must = SubLObjectFactory.makeString("Test or test collection GUID must be supplied.");
        $str82$binding_designation = SubLObjectFactory.makeString("binding_designation");
        $str83$cyclist_id = SubLObjectFactory.makeString("cyclist_id");
        $str84$email_notify_style_id = SubLObjectFactory.makeString("email_notify_style_id");
        $str85$execution_type = SubLObjectFactory.makeString("execution_type");
        $str86$genls_id = SubLObjectFactory.makeString("genls_id");
        $str87$image_type = SubLObjectFactory.makeString("image_type");
        $str88$image_version = SubLObjectFactory.makeString("image_version");
        $str89$inference_metric_id = SubLObjectFactory.makeString("inference_metric_id");
        $str90$isa_id = SubLObjectFactory.makeString("isa_id");
        $str91$kb_number = SubLObjectFactory.makeString("kb_number");
        $str92$machine_hardware_type = SubLObjectFactory.makeString("machine_hardware_type");
        $str93$machine_name = SubLObjectFactory.makeString("machine_name");
        $str94$machine_type = SubLObjectFactory.makeString("machine_type");
        $str95$os_type = SubLObjectFactory.makeString("os_type");
        $str96$support_type = SubLObjectFactory.makeString("support-type");
        $str97$system_version_num = SubLObjectFactory.makeString("system_version_num");
        $str98$test_id = SubLObjectFactory.makeString("test_id");
        $str99$test_status = SubLObjectFactory.makeString("test_status");
        $str100$test_type = SubLObjectFactory.makeString("test_type");
        $kw101$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw102$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw103$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw104$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw105$FALSE_DEF = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $kw106$FALSE_MON = SubLObjectFactory.makeKeyword("FALSE-MON");
        $sym107$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $const108$IndividualTestMetric = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndividualTestMetric"));
        $const109$CollectionTestMetric = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionTestMetric"));
        $sym110$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $const111$TestMetric = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestMetric"));
        $const112$UnsupportedTestMetric = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnsupportedTestMetric"));
        $sym113$CTEST_UNSUPPORTED_METRIC_ = SubLObjectFactory.makeSymbol("CTEST-UNSUPPORTED-METRIC?");
    }
}

/*

	Total time: 493 ms
	
*/