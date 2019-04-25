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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class ctest_utils
    extends
      SubLTranslatedFile
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
  public static SubLObject initialize_ctest()
  {
    $default_email_notify_style_id$.setGlobalValue( string_utilities.to_string( constants_high.constant_external_id( $const18$TestResultNotification_EmailBrief ) ) );
    $default_test_id$.setGlobalValue( string_utilities.to_string( constants_high.constant_external_id( $const19$TKBTemplateTestForMissingMt ) ) );
    $default_string_binding_set$.setGlobalValue( $str20$___TheSet____ELInferenceBindingFn );
    $default_binding_set$.setGlobalValue( bindings.make_kb_binding_set( ConsesLow.list( bindings.make_kb_binding( $sym21$_SOMETHING, $str22$A_SOMETHING ) ) ) );
    $default_binding_set2$.setGlobalValue( bindings.make_kb_binding_set( ConsesLow.list( bindings.make_kb_binding( $sym23$_OTHERTHING, $str24$ANOTHER_THING ) ) ) );
    $default_set_of_binding_sets$.setGlobalValue( bindings.make_kb_set_of_binding_sets( ConsesLow.list( bindings.make_kb_binding_set( ConsesLow.list( bindings.make_kb_binding( $sym21$_SOMETHING,
        $str22$A_SOMETHING ) ) ) ) ) );
    $default_set_of_binding_sets2$.setGlobalValue( bindings.make_kb_set_of_binding_sets( ConsesLow.list( bindings.make_kb_binding_set( ConsesLow.list( bindings.make_kb_binding( $sym23$_OTHERTHING,
        $str24$ANOTHER_THING ) ) ) ) ) );
    $default_set_of_binding_sets3$.setGlobalValue( bindings.make_kb_set_of_binding_sets( ConsesLow.list( bindings.make_kb_binding_set( ConsesLow.list( bindings.make_kb_binding( $sym25$_ANOTHERTHING,
        $str26$YET_ANOTHER_THING ) ) ) ) ) );
    $default_module_sentence$.setGlobalValue( $list27 );
    $default_module_mt$.setGlobalValue( $const28$BaseKB );
    $default_module_mt2$.setGlobalValue( $const29$UniversalVocabularyMt );
    $default_dependency_test_id$.setGlobalValue( string_utilities.to_string( constants_high.constant_external_id( $const30$TKBTemplateTestForMissingExplanat ) ) );
    $default_dependency_test_id2$.setGlobalValue( string_utilities.to_string( constants_high.constant_external_id( $const31$TKBTemplateTestForMissingExample ) ) );
    $default_isa_id$.setGlobalValue( string_utilities.to_string( constants_high.constant_external_id( $const32$TKBTemplateIntegrityTest ) ) );
    $default_isa_id2$.setGlobalValue( string_utilities.to_string( constants_high.constant_external_id( $const33$TKB_RTVQueries ) ) );
    $default_test_query$.setGlobalValue( $list34 );
    $default_test_mt$.setGlobalValue( $const28$BaseKB );
    $default_collection_id$.setGlobalValue( string_utilities.to_string( constants_high.constant_external_id( $const32$TKBTemplateIntegrityTest ) ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7121L)
  public static SubLObject kct_valid_execution_type(final SubLObject v_object)
  {
    return makeBoolean( v_object.equalp( $collection_execution_type$.getGlobalValue() ) || v_object.equalp( $individual_execution_type$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8340L)
  public static SubLObject kct_valid_execution_mode(final SubLObject v_object)
  {
    return makeBoolean( v_object.equalp( $sampling_execution_mode$.getGlobalValue() ) || v_object.equalp( $hypothesize_execution_mode$.getGlobalValue() ) || v_object.equalp( $simple_execution_mode$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9438L)
  public static SubLObject kct_valid_collection_type(final SubLObject type)
  {
    return makeBoolean( type.equalp( $collection_test_collection_type$.getGlobalValue() ) || type.equalp( $system_test_collection_type$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 14309L)
  public static SubLObject add_in_process_test(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == id )
    {
      Errors.error( $str81$Test_or_test_collection_GUID_must );
    }
    if( NIL != find_in_process_test( id ) )
    {
      return T;
    }
    return dictionary.dictionary_enter( $tests_in_process$.getDynamicValue( thread ), id, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 14520L)
  public static SubLObject find_in_process_test(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_lookup( $tests_in_process$.getDynamicValue( thread ), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 15713L)
  public static SubLObject ctest_truncate_value_for_field(SubLObject value, final SubLObject field_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject max_length = conses_high.second( conses_high.assoc( field_name, $ctest_field_maxima$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    if( NIL != max_length )
    {
      value = string_utilities.string_first_n( max_length, string_utilities.trim_whitespace( value ) );
    }
    if( value.isString() )
    {
      return string_utilities.trim_whitespace( value );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 16401L)
  public static SubLObject valid_ctest_output_format(final SubLObject format)
  {
    return conses_high.member( format, $ctest_output_formats$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 16632L)
  public static SubLObject valid_ctest_output_style(final SubLObject style)
  {
    return conses_high.member( style, $ctest_output_styles$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 16789L)
  public static SubLObject valid_ctest_type(final SubLObject type)
  {
    return conses_high.member( type, $ctest_test_types$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 16917L)
  public static SubLObject valid_ctest_status(final SubLObject status)
  {
    return conses_high.member( status, $ctest_test_statuses$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17056L)
  public static SubLObject valid_ctest_support_type(final SubLObject type)
  {
    return conses_high.member( type, $ctest_support_types$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17205L)
  public static SubLObject valid_ctest_support_designation(final SubLObject designation)
  {
    return conses_high.member( designation, $ctest_support_designations$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17389L)
  public static SubLObject valid_ctest_suppport_tv(final SubLObject v_object)
  {
    if( v_object.eql( $kw101$TRUE ) || v_object.eql( $kw102$FALSE ) || v_object.eql( $kw103$TRUE_DEF ) || v_object.eql( $kw104$TRUE_MON ) || v_object.eql( $kw105$FALSE_DEF ) || v_object.eql( $kw106$FALSE_MON ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17595L)
  public static SubLObject valid_ctest_binding_designation(final SubLObject v_object)
  {
    return conses_high.member( v_object, $kct_binding_set_designations$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 17783L)
  public static SubLObject add_leading_and_trailing_text(SubLObject string, final SubLObject leading, final SubLObject trailing)
  {
    if( NIL != leading )
    {
      string = string_utilities.pre_fix( string, leading );
    }
    if( NIL != trailing )
    {
      string = string_utilities.post_fix( string, trailing );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 18186L)
  public static SubLObject escape_double_quotes(final SubLObject string)
  {
    return string_utilities.to_lisp_string( string_utilities.to_lisp_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 18372L)
  public static SubLObject kct_test_metric_from_keyword(final SubLObject keyword)
  {
    assert NIL != Types.keywordp( keyword ) : keyword;
    return subl_identifier.cyc_entity_from_sublid( keyword, $const108$IndividualTestMetric );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 18729L)
  public static SubLObject kct_collection_test_metric_from_keyword(final SubLObject keyword)
  {
    assert NIL != Types.keywordp( keyword ) : keyword;
    return subl_identifier.cyc_entity_from_sublid( keyword, $const109$CollectionTestMetric );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 18892L)
  public static SubLObject kct_keyword_from_test_metric(final SubLObject metric)
  {
    assert NIL != constant_handles.constant_p( metric ) : metric;
    return subl_identifier.sublid_from_cyc_entity( metric );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 19020L)
  public static SubLObject ctest_kb_test_metric_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != isa.isa_in_any_mtP( v_object, $const111$TestMetric ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 19165L)
  public static SubLObject ctest_unsupported_metricP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != isa.isa_in_any_mtP( v_object, $const112$UnsupportedTestMetric ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 19368L)
  public static SubLObject ctest_all_kb_test_metric_constants()
  {
    SubLObject result = list_utilities.remove_if_not( Symbols.symbol_function( $sym110$CONSTANT_P ), isa.all_fort_instances_in_all_mts( $const108$IndividualTestMetric ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    result = Sequences.remove_if( Symbols.symbol_function( $sym113$CTEST_UNSUPPORTED_METRIC_ ), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 19610L)
  public static SubLObject ctest_all_kb_collection_test_metric_constants()
  {
    SubLObject result = list_utilities.remove_if_not( Symbols.symbol_function( $sym110$CONSTANT_P ), isa.all_fort_instances_in_all_mts( $const109$CollectionTestMetric ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    result = Sequences.remove_if( Symbols.symbol_function( $sym113$CTEST_UNSUPPORTED_METRIC_ ), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  public static SubLObject declare_ctest_utils_file()
  {
    SubLFiles.declareFunction( me, "initialize_ctest", "INITIALIZE-CTEST", 0, 0, false );
    SubLFiles.declareFunction( me, "kct_valid_execution_type", "KCT-VALID-EXECUTION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_valid_execution_mode", "KCT-VALID-EXECUTION-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_valid_collection_type", "KCT-VALID-COLLECTION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_in_process_test", "ADD-IN-PROCESS-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "find_in_process_test", "FIND-IN-PROCESS-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "ctest_truncate_value_for_field", "CTEST-TRUNCATE-VALUE-FOR-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_ctest_output_format", "VALID-CTEST-OUTPUT-FORMAT", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_ctest_output_style", "VALID-CTEST-OUTPUT-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_ctest_type", "VALID-CTEST-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_ctest_status", "VALID-CTEST-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_ctest_support_type", "VALID-CTEST-SUPPORT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_ctest_support_designation", "VALID-CTEST-SUPPORT-DESIGNATION", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_ctest_suppport_tv", "VALID-CTEST-SUPPPORT-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_ctest_binding_designation", "VALID-CTEST-BINDING-DESIGNATION", 1, 0, false );
    SubLFiles.declareFunction( me, "add_leading_and_trailing_text", "ADD-LEADING-AND-TRAILING-TEXT", 3, 0, false );
    SubLFiles.declareFunction( me, "escape_double_quotes", "ESCAPE-DOUBLE-QUOTES", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_metric_from_keyword", "KCT-TEST-METRIC-FROM-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_collection_test_metric_from_keyword", "KCT-COLLECTION-TEST-METRIC-FROM-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_keyword_from_test_metric", "KCT-KEYWORD-FROM-TEST-METRIC", 1, 0, false );
    SubLFiles.declareFunction( me, "ctest_kb_test_metric_p", "CTEST-KB-TEST-METRIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ctest_unsupported_metricP", "CTEST-UNSUPPORTED-METRIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "ctest_all_kb_test_metric_constants", "CTEST-ALL-KB-TEST-METRIC-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "ctest_all_kb_collection_test_metric_constants", "CTEST-ALL-KB-COLLECTION-TEST-METRIC-CONSTANTS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_ctest_utils_file()
  {
    $default_email_notify_style_id$ = SubLFiles.deflexical( "*DEFAULT-EMAIL-NOTIFY-STYLE-ID*", ( maybeDefault( $sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_, $default_email_notify_style_id$, NIL ) ) );
    $default_test_id$ = SubLFiles.deflexical( "*DEFAULT-TEST-ID*", ( maybeDefault( $sym1$_DEFAULT_TEST_ID_, $default_test_id$, NIL ) ) );
    $default_string_binding_set$ = SubLFiles.deflexical( "*DEFAULT-STRING-BINDING-SET*", ( maybeDefault( $sym2$_DEFAULT_STRING_BINDING_SET_, $default_string_binding_set$, NIL ) ) );
    $default_binding_set$ = SubLFiles.deflexical( "*DEFAULT-BINDING-SET*", ( maybeDefault( $sym3$_DEFAULT_BINDING_SET_, $default_binding_set$, NIL ) ) );
    $default_binding_set2$ = SubLFiles.deflexical( "*DEFAULT-BINDING-SET2*", ( maybeDefault( $sym4$_DEFAULT_BINDING_SET2_, $default_binding_set2$, NIL ) ) );
    $default_set_of_binding_sets$ = SubLFiles.deflexical( "*DEFAULT-SET-OF-BINDING-SETS*", ( maybeDefault( $sym5$_DEFAULT_SET_OF_BINDING_SETS_, $default_set_of_binding_sets$, NIL ) ) );
    $default_set_of_binding_sets2$ = SubLFiles.deflexical( "*DEFAULT-SET-OF-BINDING-SETS2*", ( maybeDefault( $sym6$_DEFAULT_SET_OF_BINDING_SETS2_, $default_set_of_binding_sets2$, NIL ) ) );
    $default_set_of_binding_sets3$ = SubLFiles.deflexical( "*DEFAULT-SET-OF-BINDING-SETS3*", ( maybeDefault( $sym7$_DEFAULT_SET_OF_BINDING_SETS3_, $default_set_of_binding_sets3$, NIL ) ) );
    $default_module_sentence$ = SubLFiles.deflexical( "*DEFAULT-MODULE-SENTENCE*", ( maybeDefault( $sym8$_DEFAULT_MODULE_SENTENCE_, $default_module_sentence$, NIL ) ) );
    $default_module_mt$ = SubLFiles.deflexical( "*DEFAULT-MODULE-MT*", ( maybeDefault( $sym9$_DEFAULT_MODULE_MT_, $default_module_mt$, NIL ) ) );
    $default_module_mt2$ = SubLFiles.deflexical( "*DEFAULT-MODULE-MT2*", ( maybeDefault( $sym10$_DEFAULT_MODULE_MT2_, $default_module_mt2$, NIL ) ) );
    $default_dependency_test_id$ = SubLFiles.deflexical( "*DEFAULT-DEPENDENCY-TEST-ID*", ( maybeDefault( $sym11$_DEFAULT_DEPENDENCY_TEST_ID_, $default_dependency_test_id$, NIL ) ) );
    $default_dependency_test_id2$ = SubLFiles.deflexical( "*DEFAULT-DEPENDENCY-TEST-ID2*", ( maybeDefault( $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_, $default_dependency_test_id2$, NIL ) ) );
    $default_isa_id$ = SubLFiles.deflexical( "*DEFAULT-ISA-ID*", ( maybeDefault( $sym13$_DEFAULT_ISA_ID_, $default_isa_id$, NIL ) ) );
    $default_isa_id2$ = SubLFiles.deflexical( "*DEFAULT-ISA-ID2*", ( maybeDefault( $sym14$_DEFAULT_ISA_ID2_, $default_isa_id2$, NIL ) ) );
    $default_test_query$ = SubLFiles.deflexical( "*DEFAULT-TEST-QUERY*", ( maybeDefault( $sym15$_DEFAULT_TEST_QUERY_, $default_test_query$, NIL ) ) );
    $default_test_mt$ = SubLFiles.deflexical( "*DEFAULT-TEST-MT*", ( maybeDefault( $sym16$_DEFAULT_TEST_MT_, $default_test_mt$, NIL ) ) );
    $default_collection_id$ = SubLFiles.deflexical( "*DEFAULT-COLLECTION-ID*", ( maybeDefault( $sym17$_DEFAULT_COLLECTION_ID_, $default_collection_id$, NIL ) ) );
    $ctest_output_formats$ = SubLFiles.defconstant( "*CTEST-OUTPUT-FORMATS*", ConsesLow.list( $kw35$TEXT, $kw36$HTML ) );
    $ctest_output_styles$ = SubLFiles.defconstant( "*CTEST-OUTPUT-STYLES*", ConsesLow.list( $kw37$BRIEF, $kw38$VERBOSE, $kw39$POST_BUILD ) );
    $max_test_retry_time$ = SubLFiles.defconstant( "*MAX-TEST-RETRY-TIME*", $int40$60 );
    $csc_table_name$ = SubLFiles.defconstant( "*CSC-TABLE-NAME*", $str41$cyc_system_config );
    $max_image_type_len$ = SubLFiles.defconstant( "*MAX-IMAGE-TYPE-LEN*", $int42$50 );
    $max_image_version_len$ = SubLFiles.defconstant( "*MAX-IMAGE-VERSION-LEN*", $int42$50 );
    $max_system_version_num_len$ = SubLFiles.defconstant( "*MAX-SYSTEM-VERSION-NUM-LEN*", TEN_INTEGER );
    $max_kb_number_len$ = SubLFiles.defconstant( "*MAX-KB-NUMBER-LEN*", TWELVE_INTEGER );
    $mc_table_name$ = SubLFiles.defconstant( "*MC-TABLE-NAME*", $str43$machine_config );
    $max_machine_name_len$ = SubLFiles.defconstant( "*MAX-MACHINE-NAME-LEN*", $int44$100 );
    $max_machine_type_len$ = SubLFiles.defconstant( "*MAX-MACHINE-TYPE-LEN*", $int42$50 );
    $max_machine_hardware_type_len$ = SubLFiles.defconstant( "*MAX-MACHINE-HARDWARE-TYPE-LEN*", TWENTY_INTEGER );
    $max_os_type_len$ = SubLFiles.defconstant( "*MAX-OS-TYPE-LEN*", $int42$50 );
    $te_table_name$ = SubLFiles.defconstant( "*TE-TABLE-NAME*", $str45$test_execution );
    $max_test_id_len$ = SubLFiles.defconstant( "*MAX-TEST-ID-LEN*", $int44$100 );
    $max_test_type_len$ = SubLFiles.defconstant( "*MAX-TEST-TYPE-LEN*", TWENTY_INTEGER );
    $max_date_len$ = SubLFiles.defconstant( "*MAX-DATE-LEN*", NINETEEN_INTEGER );
    $max_test_status_len$ = SubLFiles.defconstant( "*MAX-TEST-STATUS-LEN*", TEN_INTEGER );
    $max_test_execution_type_len$ = SubLFiles.defconstant( "*MAX-TEST-EXECUTION-TYPE-LEN*", ONE_INTEGER );
    $ctest_test_types$ = SubLFiles.defconstant( "*CTEST-TEST-TYPES*", ConsesLow.list( $str46$KBCONTENT ) );
    $ctest_test_statuses$ = SubLFiles.defconstant( "*CTEST-TEST-STATUSES*", ConsesLow.list( $str47$SUCCESS, $str48$FAILURE, $str49$DFAILURE, $str50$ERROR, $str51$SKIPPED, $str52$PROBLEM ) );
    $ctest_success_status$ = SubLFiles.defconstant( "*CTEST-SUCCESS-STATUS*", $str47$SUCCESS );
    $ctest_failure_status$ = SubLFiles.defconstant( "*CTEST-FAILURE-STATUS*", $str48$FAILURE );
    $ctest_dfailure_status$ = SubLFiles.defconstant( "*CTEST-DFAILURE-STATUS*", $str49$DFAILURE );
    $ctest_error_status$ = SubLFiles.defconstant( "*CTEST-ERROR-STATUS*", $str50$ERROR );
    $ctest_skipped_status$ = SubLFiles.defconstant( "*CTEST-SKIPPED-STATUS*", $str51$SKIPPED );
    $ctest_problem_status$ = SubLFiles.defconstant( "*CTEST-PROBLEM-STATUS*", $str52$PROBLEM );
    $kct_test_type$ = SubLFiles.defconstant( "*KCT-TEST-TYPE*", $str46$KBCONTENT );
    $tcmr_table_name$ = SubLFiles.defconstant( "*TCMR-TABLE-NAME*", $str53$test_collection_metric_result );
    $max_metric_id_len$ = SubLFiles.defconstant( "*MAX-METRIC-ID-LEN*", $int44$100 );
    $tmr_table_name$ = SubLFiles.defconstant( "*TMR-TABLE-NAME*", $str54$test_metric_result );
    $tem_table_name$ = SubLFiles.defconstant( "*TEM-TABLE-NAME*", $str55$test_execution_member );
    $kcte_table_name$ = SubLFiles.defconstant( "*KCTE-TABLE-NAME*", $str56$kct_execution );
    $max_exec_type_len$ = SubLFiles.defconstant( "*MAX-EXEC-TYPE-LEN*", ONE_INTEGER );
    $collection_execution_type$ = SubLFiles.defconstant( "*COLLECTION-EXECUTION-TYPE*", $str57$C );
    $individual_execution_type$ = SubLFiles.defconstant( "*INDIVIDUAL-EXECUTION-TYPE*", $str58$I );
    $kctem_table_name$ = SubLFiles.defconstant( "*KCTEM-TABLE-NAME*", $str59$kct_execution_member );
    $max_exec_mode_len$ = SubLFiles.defconstant( "*MAX-EXEC-MODE-LEN*", ONE_INTEGER );
    $sampling_execution_mode$ = SubLFiles.defconstant( "*SAMPLING-EXECUTION-MODE*", $str60$S );
    $hypothesize_execution_mode$ = SubLFiles.defconstant( "*HYPOTHESIZE-EXECUTION-MODE*", $str61$H );
    $simple_execution_mode$ = SubLFiles.defconstant( "*SIMPLE-EXECUTION-MODE*", $str62$X );
    $kctc_table_name$ = SubLFiles.defconstant( "*KCTC-TABLE-NAME*", $str63$kct_config );
    $kcts_project_desc$ = SubLFiles.defconstant( "*KCTS-PROJECT-DESC*", $str64$KB_Content_Test_System );
    $kctcc_table_name$ = SubLFiles.defconstant( "*KCTCC-TABLE-NAME*", $str65$kct_collection_config );
    $max_collection_type_len$ = SubLFiles.defconstant( "*MAX-COLLECTION-TYPE-LEN*", ONE_INTEGER );
    $collection_test_collection_type$ = SubLFiles.defconstant( "*COLLECTION-TEST-COLLECTION-TYPE*", $str57$C );
    $system_test_collection_type$ = SubLFiles.defconstant( "*SYSTEM-TEST-COLLECTION-TYPE*", $str60$S );
    $tcrc_table_name$ = SubLFiles.defconstant( "*TCRC-TABLE-NAME*", $str66$test_cyclist_responsible_config );
    $max_cyclist_id_len$ = SubLFiles.defconstant( "*MAX-CYCLIST-ID-LEN*", $int44$100 );
    $max_email_notify_style_id_len$ = SubLFiles.defconstant( "*MAX-EMAIL-NOTIFY-STYLE-ID-LEN*", $int44$100 );
    $kctccbs_table_name$ = SubLFiles.defconstant( "*KCTCCBS-TABLE-NAME*", $str67$kct_config_cycl_binding_set );
    $max_binding_designation_len$ = SubLFiles.defconstant( "*MAX-BINDING-DESIGNATION-LEN*", ONE_INTEGER );
    $kct_exact_binding_set_designation$ = SubLFiles.defconstant( "*KCT-EXACT-BINDING-SET-DESIGNATION*", $str68$E );
    $kct_wanted_binding_set_designation$ = SubLFiles.defconstant( "*KCT-WANTED-BINDING-SET-DESIGNATION*", $str69$W );
    $kct_unwanted_binding_set_designation$ = SubLFiles.defconstant( "*KCT-UNWANTED-BINDING-SET-DESIGNATION*", $str70$N );
    $kct_unimportant_binding_set_designation$ = SubLFiles.defconstant( "*KCT-UNIMPORTANT-BINDING-SET-DESIGNATION*", $str71$U );
    $kct_binding_set_designations$ = SubLFiles.defconstant( "*KCT-BINDING-SET-DESIGNATIONS*", ConsesLow.list( $str68$E, $str69$W, $str70$N, $str71$U ) );
    $kctcas_table_name$ = SubLFiles.defconstant( "*KCTCAS-TABLE-NAME*", $str72$kct_config_answer_support );
    $max_support_type_len$ = SubLFiles.defconstant( "*MAX-SUPPORT-TYPE-LEN*", ONE_INTEGER );
    $max_support_designation_len$ = SubLFiles.defconstant( "*MAX-SUPPORT-DESIGNATION-LEN*", ONE_INTEGER );
    $ctest_support_types$ = SubLFiles.defconstant( "*CTEST-SUPPORT-TYPES*", ConsesLow.list( $str73$M, $str60$S ) );
    $ctest_support_designations$ = SubLFiles.defconstant( "*CTEST-SUPPORT-DESIGNATIONS*", ConsesLow.list( $str69$W, $str70$N ) );
    $kct_wanted_support_designation$ = SubLFiles.defconstant( "*KCT-WANTED-SUPPORT-DESIGNATION*", $str69$W );
    $kct_unwanted_support_designation$ = SubLFiles.defconstant( "*KCT-UNWANTED-SUPPORT-DESIGNATION*", $str70$N );
    $kct_support_support_type$ = SubLFiles.defconstant( "*KCT-SUPPORT-SUPPORT-TYPE*", $str60$S );
    $kct_module_support_type$ = SubLFiles.defconstant( "*KCT-MODULE-SUPPORT-TYPE*", $str73$M );
    $ipc_table_name$ = SubLFiles.defconstant( "*IPC-TABLE-NAME*", $str74$inference_param_config );
    $max_inference_param_id_len$ = SubLFiles.defconstant( "*MAX-INFERENCE-PARAM-ID-LEN*", $int44$100 );
    $tmc_table_name$ = SubLFiles.defconstant( "*TMC-TABLE-NAME*", $str75$test_metric_config );
    $max_test_metric_type_len$ = SubLFiles.defconstant( "*MAX-TEST-METRIC-TYPE-LEN*", ONE_INTEGER );
    $ctest_metric_types$ = SubLFiles.defconstant( "*CTEST-METRIC-TYPES*", ConsesLow.list( $str57$C, $str76$Q, $str77$B ) );
    $ctest_collection_level_metric$ = SubLFiles.defconstant( "*CTEST-COLLECTION-LEVEL-METRIC*", $str57$C );
    $ctest_query_level_metric$ = SubLFiles.defconstant( "*CTEST-QUERY-LEVEL-METRIC*", $str76$Q );
    $ctest_binding_level_metric$ = SubLFiles.defconstant( "*CTEST-BINDING-LEVEL-METRIC*", $str77$B );
    $tdc_table_name$ = SubLFiles.defconstant( "*TDC-TABLE-NAME*", $str78$test_dependency_config );
    $kctcg_table_name$ = SubLFiles.defconstant( "*KCTCG-TABLE-NAME*", $str79$kct_config_genls );
    $kctci_table_name$ = SubLFiles.defconstant( "*KCTCI-TABLE-NAME*", $str80$kct_config_isas );
    $ctest_storing_p$ = SubLFiles.defparameter( "*CTEST-STORING-P*", NIL );
    $ctest_storing_configs_p$ = SubLFiles.defparameter( "*CTEST-STORING-CONFIGS-P*", NIL );
    $ctest_required_metrics$ = SubLFiles.defparameter( "*CTEST-REQUIRED-METRICS*", NIL );
    $tests_in_process$ = SubLFiles.defparameter( "*TESTS-IN-PROCESS*", NIL );
    $ctest_field_maxima$ = SubLFiles.defparameter( "*CTEST-FIELD-MAXIMA*", ConsesLow.list( new SubLObject[] { ConsesLow.list( $str82$binding_designation, $max_binding_designation_len$.getGlobalValue() ), ConsesLow.list(
        $str83$cyclist_id, $max_cyclist_id_len$.getGlobalValue() ), ConsesLow.list( $str84$email_notify_style_id, $max_email_notify_style_id_len$.getGlobalValue() ), ConsesLow.list( $str85$execution_type,
            $max_exec_type_len$.getGlobalValue() ), ConsesLow.list( $str86$genls_id, $max_test_id_len$.getGlobalValue() ), ConsesLow.list( $str87$image_type, $max_image_type_len$.getGlobalValue() ), ConsesLow.list(
                $str88$image_version, $max_image_version_len$.getGlobalValue() ), ConsesLow.list( $str89$inference_metric_id, $max_metric_id_len$.getGlobalValue() ), ConsesLow.list( $str90$isa_id, $max_test_id_len$
                    .getGlobalValue() ), ConsesLow.list( $str91$kb_number, $max_kb_number_len$.getGlobalValue() ), ConsesLow.list( $str92$machine_hardware_type, $max_machine_hardware_type_len$.getGlobalValue() ),
      ConsesLow.list( $str93$machine_name, $max_machine_name_len$.getGlobalValue() ), ConsesLow.list( $str94$machine_type, $max_machine_type_len$.getGlobalValue() ), ConsesLow.list( $str95$os_type, $max_os_type_len$
          .getGlobalValue() ), ConsesLow.list( $str96$support_type, $max_support_type_len$.getGlobalValue() ), ConsesLow.list( $str97$system_version_num, $max_system_version_num_len$.getGlobalValue() ), ConsesLow.list(
              $str98$test_id, $max_test_id_len$.getGlobalValue() ), ConsesLow.list( $str99$test_status, $max_test_status_len$.getGlobalValue() ), ConsesLow.list( $str100$test_type, $max_test_type_len$.getGlobalValue() )
    } ) );
    return NIL;
  }

  public static SubLObject setup_ctest_utils_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_ );
    subl_macro_promotions.declare_defglobal( $sym1$_DEFAULT_TEST_ID_ );
    subl_macro_promotions.declare_defglobal( $sym2$_DEFAULT_STRING_BINDING_SET_ );
    subl_macro_promotions.declare_defglobal( $sym3$_DEFAULT_BINDING_SET_ );
    subl_macro_promotions.declare_defglobal( $sym4$_DEFAULT_BINDING_SET2_ );
    subl_macro_promotions.declare_defglobal( $sym5$_DEFAULT_SET_OF_BINDING_SETS_ );
    subl_macro_promotions.declare_defglobal( $sym6$_DEFAULT_SET_OF_BINDING_SETS2_ );
    subl_macro_promotions.declare_defglobal( $sym7$_DEFAULT_SET_OF_BINDING_SETS3_ );
    subl_macro_promotions.declare_defglobal( $sym8$_DEFAULT_MODULE_SENTENCE_ );
    subl_macro_promotions.declare_defglobal( $sym9$_DEFAULT_MODULE_MT_ );
    subl_macro_promotions.declare_defglobal( $sym10$_DEFAULT_MODULE_MT2_ );
    subl_macro_promotions.declare_defglobal( $sym11$_DEFAULT_DEPENDENCY_TEST_ID_ );
    subl_macro_promotions.declare_defglobal( $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_ );
    subl_macro_promotions.declare_defglobal( $sym13$_DEFAULT_ISA_ID_ );
    subl_macro_promotions.declare_defglobal( $sym14$_DEFAULT_ISA_ID2_ );
    subl_macro_promotions.declare_defglobal( $sym15$_DEFAULT_TEST_QUERY_ );
    subl_macro_promotions.declare_defglobal( $sym16$_DEFAULT_TEST_MT_ );
    subl_macro_promotions.declare_defglobal( $sym17$_DEFAULT_COLLECTION_ID_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ctest_utils_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ctest_utils_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ctest_utils_file();
  }
  static
  {
    me = new ctest_utils();
    $default_email_notify_style_id$ = null;
    $default_test_id$ = null;
    $default_string_binding_set$ = null;
    $default_binding_set$ = null;
    $default_binding_set2$ = null;
    $default_set_of_binding_sets$ = null;
    $default_set_of_binding_sets2$ = null;
    $default_set_of_binding_sets3$ = null;
    $default_module_sentence$ = null;
    $default_module_mt$ = null;
    $default_module_mt2$ = null;
    $default_dependency_test_id$ = null;
    $default_dependency_test_id2$ = null;
    $default_isa_id$ = null;
    $default_isa_id2$ = null;
    $default_test_query$ = null;
    $default_test_mt$ = null;
    $default_collection_id$ = null;
    $ctest_output_formats$ = null;
    $ctest_output_styles$ = null;
    $max_test_retry_time$ = null;
    $csc_table_name$ = null;
    $max_image_type_len$ = null;
    $max_image_version_len$ = null;
    $max_system_version_num_len$ = null;
    $max_kb_number_len$ = null;
    $mc_table_name$ = null;
    $max_machine_name_len$ = null;
    $max_machine_type_len$ = null;
    $max_machine_hardware_type_len$ = null;
    $max_os_type_len$ = null;
    $te_table_name$ = null;
    $max_test_id_len$ = null;
    $max_test_type_len$ = null;
    $max_date_len$ = null;
    $max_test_status_len$ = null;
    $max_test_execution_type_len$ = null;
    $ctest_test_types$ = null;
    $ctest_test_statuses$ = null;
    $ctest_success_status$ = null;
    $ctest_failure_status$ = null;
    $ctest_dfailure_status$ = null;
    $ctest_error_status$ = null;
    $ctest_skipped_status$ = null;
    $ctest_problem_status$ = null;
    $kct_test_type$ = null;
    $tcmr_table_name$ = null;
    $max_metric_id_len$ = null;
    $tmr_table_name$ = null;
    $tem_table_name$ = null;
    $kcte_table_name$ = null;
    $max_exec_type_len$ = null;
    $collection_execution_type$ = null;
    $individual_execution_type$ = null;
    $kctem_table_name$ = null;
    $max_exec_mode_len$ = null;
    $sampling_execution_mode$ = null;
    $hypothesize_execution_mode$ = null;
    $simple_execution_mode$ = null;
    $kctc_table_name$ = null;
    $kcts_project_desc$ = null;
    $kctcc_table_name$ = null;
    $max_collection_type_len$ = null;
    $collection_test_collection_type$ = null;
    $system_test_collection_type$ = null;
    $tcrc_table_name$ = null;
    $max_cyclist_id_len$ = null;
    $max_email_notify_style_id_len$ = null;
    $kctccbs_table_name$ = null;
    $max_binding_designation_len$ = null;
    $kct_exact_binding_set_designation$ = null;
    $kct_wanted_binding_set_designation$ = null;
    $kct_unwanted_binding_set_designation$ = null;
    $kct_unimportant_binding_set_designation$ = null;
    $kct_binding_set_designations$ = null;
    $kctcas_table_name$ = null;
    $max_support_type_len$ = null;
    $max_support_designation_len$ = null;
    $ctest_support_types$ = null;
    $ctest_support_designations$ = null;
    $kct_wanted_support_designation$ = null;
    $kct_unwanted_support_designation$ = null;
    $kct_support_support_type$ = null;
    $kct_module_support_type$ = null;
    $ipc_table_name$ = null;
    $max_inference_param_id_len$ = null;
    $tmc_table_name$ = null;
    $max_test_metric_type_len$ = null;
    $ctest_metric_types$ = null;
    $ctest_collection_level_metric$ = null;
    $ctest_query_level_metric$ = null;
    $ctest_binding_level_metric$ = null;
    $tdc_table_name$ = null;
    $kctcg_table_name$ = null;
    $kctci_table_name$ = null;
    $ctest_storing_p$ = null;
    $ctest_storing_configs_p$ = null;
    $ctest_required_metrics$ = null;
    $tests_in_process$ = null;
    $ctest_field_maxima$ = null;
    $sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_ = makeSymbol( "*DEFAULT-EMAIL-NOTIFY-STYLE-ID*" );
    $sym1$_DEFAULT_TEST_ID_ = makeSymbol( "*DEFAULT-TEST-ID*" );
    $sym2$_DEFAULT_STRING_BINDING_SET_ = makeSymbol( "*DEFAULT-STRING-BINDING-SET*" );
    $sym3$_DEFAULT_BINDING_SET_ = makeSymbol( "*DEFAULT-BINDING-SET*" );
    $sym4$_DEFAULT_BINDING_SET2_ = makeSymbol( "*DEFAULT-BINDING-SET2*" );
    $sym5$_DEFAULT_SET_OF_BINDING_SETS_ = makeSymbol( "*DEFAULT-SET-OF-BINDING-SETS*" );
    $sym6$_DEFAULT_SET_OF_BINDING_SETS2_ = makeSymbol( "*DEFAULT-SET-OF-BINDING-SETS2*" );
    $sym7$_DEFAULT_SET_OF_BINDING_SETS3_ = makeSymbol( "*DEFAULT-SET-OF-BINDING-SETS3*" );
    $sym8$_DEFAULT_MODULE_SENTENCE_ = makeSymbol( "*DEFAULT-MODULE-SENTENCE*" );
    $sym9$_DEFAULT_MODULE_MT_ = makeSymbol( "*DEFAULT-MODULE-MT*" );
    $sym10$_DEFAULT_MODULE_MT2_ = makeSymbol( "*DEFAULT-MODULE-MT2*" );
    $sym11$_DEFAULT_DEPENDENCY_TEST_ID_ = makeSymbol( "*DEFAULT-DEPENDENCY-TEST-ID*" );
    $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_ = makeSymbol( "*DEFAULT-DEPENDENCY-TEST-ID2*" );
    $sym13$_DEFAULT_ISA_ID_ = makeSymbol( "*DEFAULT-ISA-ID*" );
    $sym14$_DEFAULT_ISA_ID2_ = makeSymbol( "*DEFAULT-ISA-ID2*" );
    $sym15$_DEFAULT_TEST_QUERY_ = makeSymbol( "*DEFAULT-TEST-QUERY*" );
    $sym16$_DEFAULT_TEST_MT_ = makeSymbol( "*DEFAULT-TEST-MT*" );
    $sym17$_DEFAULT_COLLECTION_ID_ = makeSymbol( "*DEFAULT-COLLECTION-ID*" );
    $const18$TestResultNotification_EmailBrief = constant_handles.reader_make_constant_shell( makeString( "TestResultNotification-EmailBrief" ) );
    $const19$TKBTemplateTestForMissingMt = constant_handles.reader_make_constant_shell( makeString( "TKBTemplateTestForMissingMt" ) );
    $str20$___TheSet____ELInferenceBindingFn = makeString( "(#$TheSet (#$ELInferenceBindingFn ?SOMETHING \"A SOMETHING\"))" );
    $sym21$_SOMETHING = makeSymbol( "?SOMETHING" );
    $str22$A_SOMETHING = makeString( "A SOMETHING" );
    $sym23$_OTHERTHING = makeSymbol( "?OTHERTHING" );
    $str24$ANOTHER_THING = makeString( "ANOTHER THING" );
    $sym25$_ANOTHERTHING = makeSymbol( "?ANOTHERTHING" );
    $str26$YET_ANOTHER_THING = makeString( "YET ANOTHER THING" );
    $list27 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Thing" ) ) );
    $const28$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const29$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const30$TKBTemplateTestForMissingExplanat = constant_handles.reader_make_constant_shell( makeString( "TKBTemplateTestForMissingExplanation" ) );
    $const31$TKBTemplateTestForMissingExample = constant_handles.reader_make_constant_shell( makeString( "TKBTemplateTestForMissingExample" ) );
    $const32$TKBTemplateIntegrityTest = constant_handles.reader_make_constant_shell( makeString( "TKBTemplateIntegrityTest" ) );
    $const33$TKB_RTVQueries = constant_handles.reader_make_constant_shell( makeString( "TKB-RTVQueries" ) );
    $list34 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), makeSymbol( "?WHAT" ) );
    $kw35$TEXT = makeKeyword( "TEXT" );
    $kw36$HTML = makeKeyword( "HTML" );
    $kw37$BRIEF = makeKeyword( "BRIEF" );
    $kw38$VERBOSE = makeKeyword( "VERBOSE" );
    $kw39$POST_BUILD = makeKeyword( "POST-BUILD" );
    $int40$60 = makeInteger( 60 );
    $str41$cyc_system_config = makeString( "cyc_system_config" );
    $int42$50 = makeInteger( 50 );
    $str43$machine_config = makeString( "machine_config" );
    $int44$100 = makeInteger( 100 );
    $str45$test_execution = makeString( "test_execution" );
    $str46$KBCONTENT = makeString( "KBCONTENT" );
    $str47$SUCCESS = makeString( "SUCCESS" );
    $str48$FAILURE = makeString( "FAILURE" );
    $str49$DFAILURE = makeString( "DFAILURE" );
    $str50$ERROR = makeString( "ERROR" );
    $str51$SKIPPED = makeString( "SKIPPED" );
    $str52$PROBLEM = makeString( "PROBLEM" );
    $str53$test_collection_metric_result = makeString( "test_collection_metric_result" );
    $str54$test_metric_result = makeString( "test_metric_result" );
    $str55$test_execution_member = makeString( "test_execution_member" );
    $str56$kct_execution = makeString( "kct_execution" );
    $str57$C = makeString( "C" );
    $str58$I = makeString( "I" );
    $str59$kct_execution_member = makeString( "kct_execution_member" );
    $str60$S = makeString( "S" );
    $str61$H = makeString( "H" );
    $str62$X = makeString( "X" );
    $str63$kct_config = makeString( "kct_config" );
    $str64$KB_Content_Test_System = makeString( "KB Content Test System" );
    $str65$kct_collection_config = makeString( "kct_collection_config" );
    $str66$test_cyclist_responsible_config = makeString( "test_cyclist_responsible_config" );
    $str67$kct_config_cycl_binding_set = makeString( "kct_config_cycl_binding_set" );
    $str68$E = makeString( "E" );
    $str69$W = makeString( "W" );
    $str70$N = makeString( "N" );
    $str71$U = makeString( "U" );
    $str72$kct_config_answer_support = makeString( "kct_config_answer_support" );
    $str73$M = makeString( "M" );
    $str74$inference_param_config = makeString( "inference_param_config" );
    $str75$test_metric_config = makeString( "test_metric_config" );
    $str76$Q = makeString( "Q" );
    $str77$B = makeString( "B" );
    $str78$test_dependency_config = makeString( "test_dependency_config" );
    $str79$kct_config_genls = makeString( "kct_config_genls" );
    $str80$kct_config_isas = makeString( "kct_config_isas" );
    $str81$Test_or_test_collection_GUID_must = makeString( "Test or test collection GUID must be supplied." );
    $str82$binding_designation = makeString( "binding_designation" );
    $str83$cyclist_id = makeString( "cyclist_id" );
    $str84$email_notify_style_id = makeString( "email_notify_style_id" );
    $str85$execution_type = makeString( "execution_type" );
    $str86$genls_id = makeString( "genls_id" );
    $str87$image_type = makeString( "image_type" );
    $str88$image_version = makeString( "image_version" );
    $str89$inference_metric_id = makeString( "inference_metric_id" );
    $str90$isa_id = makeString( "isa_id" );
    $str91$kb_number = makeString( "kb_number" );
    $str92$machine_hardware_type = makeString( "machine_hardware_type" );
    $str93$machine_name = makeString( "machine_name" );
    $str94$machine_type = makeString( "machine_type" );
    $str95$os_type = makeString( "os_type" );
    $str96$support_type = makeString( "support-type" );
    $str97$system_version_num = makeString( "system_version_num" );
    $str98$test_id = makeString( "test_id" );
    $str99$test_status = makeString( "test_status" );
    $str100$test_type = makeString( "test_type" );
    $kw101$TRUE = makeKeyword( "TRUE" );
    $kw102$FALSE = makeKeyword( "FALSE" );
    $kw103$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $kw104$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw105$FALSE_DEF = makeKeyword( "FALSE-DEF" );
    $kw106$FALSE_MON = makeKeyword( "FALSE-MON" );
    $sym107$KEYWORDP = makeSymbol( "KEYWORDP" );
    $const108$IndividualTestMetric = constant_handles.reader_make_constant_shell( makeString( "IndividualTestMetric" ) );
    $const109$CollectionTestMetric = constant_handles.reader_make_constant_shell( makeString( "CollectionTestMetric" ) );
    $sym110$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $const111$TestMetric = constant_handles.reader_make_constant_shell( makeString( "TestMetric" ) );
    $const112$UnsupportedTestMetric = constant_handles.reader_make_constant_shell( makeString( "UnsupportedTestMetric" ) );
    $sym113$CTEST_UNSUPPORTED_METRIC_ = makeSymbol( "CTEST-UNSUPPORTED-METRIC?" );
  }
}
/*
 * 
 * Total time: 493 ms
 * 
 */