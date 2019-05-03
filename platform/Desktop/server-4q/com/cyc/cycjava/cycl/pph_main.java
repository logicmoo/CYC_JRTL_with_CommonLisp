package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import com.cyc.tool.subl.util.SubLTranslatedFile.SubL;

public final class pph_main
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_main";
  public static final String myFingerPrint = "a1507b530e31309a515598d18e257246c4b4ebad9dc56b5bfe356b5ab10ed4e7";
  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 980L)
  private static SubLSymbol $pph_sbhl_spaces_to_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 34162L)
  private static SubLSymbol $generate_text_bad_results$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 44283L)
  private static SubLSymbol $pph_initializedP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 45923L)
  private static SubLSymbol $pph_recursion_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 49406L)
  private static SubLSymbol $pph_method_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 50954L)
  public static SubLSymbol $pph_phrase_method_times$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 51022L)
  public static SubLSymbol $currently_metered_pph_phrase_methods$;
  private static final SubLSymbol $kw0$DEFAULT;
  private static final SubLSymbol $kw1$TEXT;
  private static final SubLSymbol $sym2$CYCL_EXPRESSION_P;
  private static final SubLSymbol $sym3$VALID_EXTERNAL_PPH_NL_PREDS_;
  private static final SubLSymbol $sym4$KEYWORD_OR_NIL_P;
  private static final SubLSymbol $sym5$HLMT_;
  private static final SubLSymbol $sym6$KEYWORDP;
  private static final SubLSymbol $sym7$BOOLEANP;
  private static final SubLSymbol $sym8$NON_NEGATIVE_INTEGER_OR_NIL_P;
  private static final SubLSymbol $sym9$GENERATE_PHRASE;
  private static final SubLList $list10;
  private static final SubLString $str11$_param_OBJECT__the_CycL_object_fo;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$GENERATE_PHRASE_NO_CHECKS_MEMOIZED;
  private static final SubLSymbol $kw15$NONE;
  private static final SubLSymbol $kw16$PPH_METHOD_FAILURE;
  private static final SubLString $str17$_PPH_error_level_;
  private static final SubLString $str18$__;
  private static final SubLString $str19$Don_t_know_what_to_do_with_determ;
  private static final SubLSymbol $kw20$NEW;
  private static final SubLSymbol $sym21$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str22$___Top_level_CycL___S;
  private static final SubLSymbol $kw23$HTML;
  private static final SubLInteger $int24$256;
  private static final SubLSymbol $sym25$PPH_PHRASE_NAUT_;
  private static final SubLSymbol $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_;
  private static final SubLSymbol $sym27$POSSIBLY_MT_P;
  private static final SubLSymbol $sym28$GENERATE_PHRASE_FOR_JAVA;
  private static final SubLList $list29;
  private static final SubLString $str30$Return_paraphrase_info_in_a_java_;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$PRINC_TO_STRING;
  private static final SubLString $str34$Fallback_method__S_is_not_a_known;
  private static final SubLString $str35$Couldn_t_generate_a_string_for__S;
  private static final SubLSymbol $sym36$GENERATE_PHRASE_NO_CHECKS;
  private static final SubLString $str37$Duplicate_javalist_____S;
  private static final SubLSymbol $sym38$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P;
  private static final SubLObject $const39$genTemplate_QuerySentence;
  private static final SubLSymbol $kw40$TOP_LEVEL;
  private static final SubLSymbol $sym41$LIST_OF_STRING_P;
  private static final SubLSymbol $kw42$A_LIST;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$REQUIRED;
  private static final SubLSymbol $sym45$LISTP;
  private static final SubLSymbol $sym46$USE_CACHED_GENERATIONS_P;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$PPH_JAVALIST_STRING;
  private static final SubLSymbol $kw51$JAVALISTS;
  private static final SubLSymbol $sym52$GENERATE_DISAMBIGUATION_PHRASES_FOR_JAVA;
  private static final SubLList $list53;
  private static final SubLString $str54$_param_FORCE__pph_force_p__param_;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLString $str57$ALPHABETIZE_PPH_JAVALISTS_passed_;
  private static final SubLSymbol $sym58$PPH_FORCE_P;
  private static final SubLSymbol $sym59$VALID_PPH_BLACKLIST_;
  private static final SubLString $str60$__Trying_default_precision___S___;
  private static final SubLSymbol $kw61$FAILURE;
  private static final SubLString $str62$__Working_on_dupe_list___S__;
  private static final SubLString $str63$__Trying_to_reparaphrase__S___;
  private static final SubLString $str64$__Trying_targeted_precision__S_fo;
  private static final SubLSymbol $sym65$PPH_PRECISION_P;
  private static final SubLString $str66$__New_paraphrase_with_precision__;
  private static final SubLString $str67$__Trying_full_precision_for__S;
  private static final SubLString $str68$__New_paraphrase_with_full_precis;
  private static final SubLString $str69$__Changing_output_list_for__S_fro;
  private static final SubLString $str70$Timed_out_generating_disambiguati;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$NEVER;
  private static final SubLSymbol $sym73$ASSERTION_P;
  private static final SubLSymbol $kw74$ANY;
  private static final SubLSymbol $sym75$_EXIT;
  private static final SubLSymbol $kw76$ALL;
  private static final SubLSymbol $kw77$LEXICAL_ONLY;
  private static final SubLSymbol $kw78$TOP_LEVEL_ONLY;
  private static final SubLString $str79$Setting_cycl_for__S_to__S_since_i;
  private static final SubLString $str80$Couldn_t_dereference_arg_position;
  private static final SubLString $str81$CycL_on__S_doesn_t_match_CycL__S;
  private static final SubLSymbol $sym82$PPH_PHRASE_OUTPUT_LIST_P;
  private static final SubLSymbol $sym83$KEYWORD_OR_HLMT_;
  private static final SubLSymbol $sym84$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym85$GENERATE_TEXT_W_SENTENTIAL_FORCE;
  private static final SubLList $list86;
  private static final SubLString $str87$generates_text_for_a_given_object;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$_GENERATE_TEXT_BAD_RESULTS_;
  private static final SubLSymbol $sym91$_;
  private static final SubLString $str92$_tmp_;
  private static final SubLSymbol $kw93$OUTPUT;
  private static final SubLString $str94$Unable_to_open__S;
  private static final SubLString $str95$__Term_AForce_AParaphrase_ADemeri;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLString $str98$___A__;
  private static final SubLString $str99$Rechecking_generate_text_bad_resu;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$INVALID_FORT_;
  private static final SubLString $str102$Took__S_seconds_to_paraphrase____;
  private static final SubLString $str103$__Suspending_discourse_referent_t;
  private static final SubLSymbol $kw104$DECLARATIVE;
  private static final SubLString $str105$__Making_new_phrase_with_cycl__S_;
  private static final SubLSymbol $sym106$_PPH_INITIALIZED__;
  private static final SubLSymbol $kw107$INITIALIZED;
  private static final SubLString $str108$No_KB_loaded__Couldn_t_initialize;
  private static final SubLSymbol $kw109$NO_KB_LOADED;
  private static final SubLSymbol $sym110$_PPH_RECURSION_LIMIT_;
  private static final SubLInteger $int111$100;
  private static final SubLObject $const112$EnglishParaphraseMt;
  private static final SubLString $str113$__Entering_PPH_POSSIBLY_BINDING_V;
  private static final SubLString $str114$__Using_mapped_string__S_for__S__;
  private static final SubLObject $const115$PossessivePhrase;
  private static final SubLString $str116$Recursion_limit_exceeded_on__S_;
  private static final SubLString $str117$__Paraphrasing__S_with_agr___S___;
  private static final SubLSymbol $kw118$GENERATE;
  private static final SubLString $str119$Abandoning_unexpressed_negations_;
  private static final SubLString $str120$__PPH_PHRASE_GENERATE_Output_list;
  private static final SubLString $str121$__Leaving_PPH_POSSIBLY_BINDING_VA;
  private static final SubLString $str122$______and__pph_var_types__are_now;
  private static final SubLString $str123$Repeating_sequence_in_paraphrase_;
  private static final SubLSymbol $kw124$NO;
  private static final SubLString $str125$Inside_operator_scope__S;
  private static final SubLString $str126$Leaving_operator_scope__S;
  private static final SubLString $str127$Skipping__S___;
  private static final SubLSymbol $kw128$CONTEXT;
  private static final SubLSymbol $kw129$DONT_NEED_BACKUP_PHRASE;
  private static final SubLSymbol $sym130$PPH_PHRASE_TRY_METHODS;
  private static final SubLSymbol $kw131$NO_ZERO_DEMERIT_METHODS;
  private static final SubLSymbol $kw132$CYCL;
  private static final SubLSymbol $kw133$BEST_METHOD;
  private static final SubLList $list134;
  private static final SubLString $str135$_S_is_not_an_FBOUNDP_symbol_;
  private static final SubLString $str136$___S_demerits_exceeds_cutoff_of__;
  private static final SubLSymbol $kw137$METHOD;
  private static final SubLSymbol $kw138$AGR_PREDS;
  private static final SubLSymbol $kw139$CATEGORY;
  private static final SubLSymbol $kw140$DEMERIT_CUTOFF;
  private static final SubLString $str141$__Trying__S___Remaining___S;
  private static final SubLSymbol $kw142$TOO_MUCH_TIME;
  private static final SubLString $str143$Exceeded_timeout_on____S;
  private static final SubLSymbol $kw144$VERBOSE;
  private static final SubLString $str145$Aborting_PPH_call___;
  private static final SubLString $str146$Zero_demerit_methods_failed____In;
  private static final SubLString $str147$_____S____Reported_Problems___S__;
  private static final SubLString $str148$___Successful_method___S__demerit;
  private static final SubLString $str149$__Context____Top_level_CycL___S__;
  private static final SubLString $str150$_Precision___S__;
  private static final SubLString $str151$__Trying__S_____;
  private static final SubLString $str152$__Entering_PPH_SETTING_VAR_TYPES_;
  private static final SubLString $str153$__Adding__S_demerits_for__S____S;
  private static final SubLString $str154$__PPH_phrase_immediately_before_c;
  private static final SubLString $str155$__PPH_phrase_immediately_after_ca;
  private static final SubLString $str156$_S_failed_;
  private static final SubLString $str157$___S_demerits_exceeds_cutoff_of__;
  private static final SubLString $str158$___S_____S_demerits___S___;
  private static final SubLString $str159$____S__S______S___S__;
  private static final SubLString $str160$____S__S______S;
  private static final SubLString $str161$__Leaving_PPH_SETTING_VAR_TYPES_I;
  private static final SubLString $str162$___Output_list___S__;
  private static final SubLString $str163$___Setting__S_to____S;
  private static final SubLString $str164$___Leaving__PPH_VAR_TYPES___S;
  private static final SubLString $str165$Can_t_use_foolproof_generation_wi;
  private static final SubLString $str166$Can_t_use_foolproof_generation_on;
  private static final SubLString $str167$the;
  private static final SubLString $str168$of;
  private static final SubLString $str169$_s;
  private static final SubLObject $const170$pronounStrings;
  private static final SubLObject $const171$PossessivePronoun_Post;
  private static final SubLObject $const172$OrdinalPhrase;
  private static final SubLString $str173$th;
  private static final SubLString $str174$Java_Phrase_Supercategory;
  private static final SubLString $str175$Output_List_Subcategory;
  private static final SubLString $str176$Java_Phrase_Test_Battery;
  private static final SubLString $str177$Output_List_Test_Battery;
  private static final SubLSymbol $sym178$CLET;
  private static final SubLList $list179;
  private static final SubLList $list180;
  private static final SubLList $list181;
  private static final SubLSymbol $kw182$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw183$FORCES;
  private static final SubLSymbol $kw184$DO_IMPERATIVE;
  private static final SubLSymbol $sym185$DO_PPH_REGRESSION_STORE;
  private static final SubLList $list186;
  private static final SubLSymbol $sym187$DO_PPH_FORCES_LIST;
  private static final SubLSymbol $sym188$WITH_PPH_TEST_OBJECT;
  private static final SubLSymbol $sym189$WITH_OUTPUT_LIST;
  private static final SubLList $list190;
  private static final SubLSymbol $kw191$TEST;
  private static final SubLSymbol $kw192$OWNER;
  private static final SubLSymbol $kw193$CLASSES;
  private static final SubLList $list194;
  private static final SubLSymbol $kw195$KB;
  private static final SubLSymbol $kw196$FULL;
  private static final SubLSymbol $kw197$WORKING_;
  private static final SubLList $list198;
  private static final SubLSymbol $sym199$GENERATE_DISAMBIGUATION_PHRASES_INT;
  private static final SubLList $list200;

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 1356L)
  public static SubLObject generate_phrase(final SubLObject v_object, SubLObject nl_preds, SubLObject determiner, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject top, SubLObject focus_arg)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( determiner == UNPROVIDED )
    {
      determiner = NIL;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( top == UNPROVIDED )
    {
      top = NIL;
    }
    if( focus_arg == UNPROVIDED )
    {
      focus_arg = NIL;
    }
    enforceType( v_object, $sym2$CYCL_EXPRESSION_P );
    enforceType( nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_ );
    enforceType( determiner, $sym4$KEYWORD_OR_NIL_P );
    enforceType( language_mt, $sym5$HLMT_ );
    enforceType( domain_mt, $sym5$HLMT_ );
    enforceType( mode, $sym6$KEYWORDP );
    enforceType( top, $sym7$BOOLEANP );
    enforceType( focus_arg, $sym8$NON_NEGATIVE_INTEGER_OR_NIL_P );
    enforceType( v_object, $sym2$CYCL_EXPRESSION_P );
    enforceType( nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_ );
    return generate_phrase_no_checks( v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 2736L)
  public static SubLObject generate_phrase_no_checks(final SubLObject v_object, SubLObject nl_preds, SubLObject determiner, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject top,
      SubLObject focus_arg)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( determiner == UNPROVIDED )
    {
      determiner = NIL;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = pph_vars.$paraphrase_mode$.getDynamicValue();
    }
    if( top == UNPROVIDED )
    {
      top = NIL;
    }
    if( focus_arg == UNPROVIDED )
    {
      focus_arg = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return generate_phrase_no_checks_memoized( v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg, pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 3223L)
  public static SubLObject generate_phrase_no_checks_memoized_internal(SubLObject v_object, SubLObject nl_preds, final SubLObject determiner, final SubLObject language_mt, final SubLObject domain_mt,
      final SubLObject mode, final SubLObject top, final SubLObject focus_arg, final SubLObject demerit_cutoff)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    final SubLObject original = el_utilities.copy_expression( v_object );
    SubLObject ret_string = NIL;
    SubLObject pred = NIL;
    SubLObject justifications = NIL;
    SubLObject output_list = NIL;
    SubLObject demerits = NIL;
    SubLObject phrase = NIL;
    final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
    try
    {
      Errors.$continue_cerrorP$.bind( NIL, thread );
      pph_error.$pph_error_handling_onP$.bind( T, thread );
      if( NIL != pph_error.pph_break_on_errorP() )
      {
        final SubLObject _prev_bind_0_$1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
        try
        {
          pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$2 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
          try
          {
            pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
            final SubLObject reuseP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            try
            {
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$3 = pph_macros.$pph_memoization_state$.currentBinding( thread );
              try
              {
                pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                final SubLObject new_or_reused = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$4 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                try
                {
                  pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                  final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                  final SubLObject _prev_bind_0_$5 = memoization_state.$memoization_state$.currentBinding( thread );
                  try
                  {
                    memoization_state.$memoization_state$.bind( local_state, thread );
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                    try
                    {
                      final SubLObject _prev_bind_0_$6 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$7 = pph_vars.$pph_cycls$.currentBinding( thread );
                      try
                      {
                        pph_vars.$pph_demerit_cutoff$.bind( demerit_cutoff, thread );
                        pph_vars.$pph_cycls$.bind( ConsesLow.cons( pph_utilities.pph_hl_to_el( v_object ), pph_vars.$pph_cycls$.getDynamicValue( thread ) ), thread );
                        if( $kw0$DEFAULT == nl_preds )
                        {
                          nl_preds = pph_utilities.pph_default_nl_preds( v_object, $kw15$NONE, language_mt, domain_mt );
                        }
                        final SubLObject top_levelP = pph_macros.handling_pph_method_failures_top_level_p();
                        final SubLObject _prev_bind_0_$7 = pph_macros.$suspended_paraphrase_methods$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$8 = pph_macros.$handling_pph_method_failuresP$.currentBinding( thread );
                        try
                        {
                          pph_macros.$suspended_paraphrase_methods$.bind( ( NIL != top_levelP ) ? set.new_set( Symbols.symbol_function( EQUAL ), pph_macros.max_suspended_method_depth() )
                              : pph_macros.$suspended_paraphrase_methods$.getDynamicValue( thread ), thread );
                          pph_macros.$handling_pph_method_failuresP$.bind( T, thread );
                          for( SubLObject failed_method = NIL, tried_oneP = NIL; NIL != failed_method || NIL == tried_oneP; tried_oneP = T )
                          {
                            if( NIL != failed_method )
                            {
                              pph_macros.note_suspended_paraphrase_method_plist( failed_method );
                              failed_method = NIL;
                            }
                            try
                            {
                              thread.throwStack.push( $kw16$PPH_METHOD_FAILURE );
                              final SubLObject _prev_bind_0_$8 = pph_macros.$new_pph_phrases$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$9 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
                              final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
                              try
                              {
                                pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
                                pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
                                pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
                                try
                                {
                                  final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
                                  final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$10 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
                                  final SubLObject _prev_bind_2_$14 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, $pph_sbhl_spaces_to_resource$.getGlobalValue() ),
                                        thread );
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                                    if( NIL != determiner )
                                    {
                                      final SubLObject new_format_string = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil
                                          .format_nil_a_no_copy( $str19$Don_t_know_what_to_do_with_determ )
                                      } );
                                      pph_error.pph_handle_error( new_format_string, ConsesLow.list( determiner ) );
                                    }
                                    v_object = pph_utilities.do_tou_substitution( v_object );
                                    v_object = pph_utilities.pph_nart_substitute( v_object );
                                    final SubLObject _prev_bind_0_$10 = pph_vars.$pph_language_mt$.currentBinding( thread );
                                    final SubLObject _prev_bind_1_$11 = pph_vars.$pph_domain_mt$.currentBinding( thread );
                                    try
                                    {
                                      pph_vars.$pph_language_mt$.bind( language_mt, thread );
                                      pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
                                      phrase = pph_phrase.new_pph_phrase_for_cycl( v_object, pph_utilities.pph_new_identity_map(), T );
                                      if( NIL != pph_phrase.pph_phrase_p( phrase, UNPROVIDED ) )
                                      {
                                        final SubLObject _prev_bind_0_$11 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                                        final SubLObject _prev_bind_1_$12 = pph_vars.$pph_track_discourse_referentsP$.currentBinding( thread );
                                        try
                                        {
                                          pph_vars.$paraphrase_mode$.bind( mode, thread );
                                          pph_vars.$pph_track_discourse_referentsP$.bind( makeBoolean( NIL != pph_vars.$pph_track_discourse_referentsP$.getDynamicValue( thread )
                                              && NIL == pph_discourse_referent_tracking_pointlessP( v_object ) ), thread );
                                          pph_phrase.pph_phrase_update_agr_preds( phrase, nl_preds, UNPROVIDED );
                                          pph_phrase.pph_phrase_set_focus_arg( phrase, focus_arg );
                                          thread.resetMultipleValues();
                                          final SubLObject ret_string_$19 = generate_phrase_int( phrase, top );
                                          final SubLObject pred_$20 = thread.secondMultipleValue();
                                          final SubLObject justifications_$21 = thread.thirdMultipleValue();
                                          final SubLObject output_list_$22 = thread.fourthMultipleValue();
                                          thread.resetMultipleValues();
                                          ret_string = ret_string_$19;
                                          pred = pred_$20;
                                          justifications = justifications_$21;
                                          output_list = output_list_$22;
                                          demerits = pph_phrase.pph_phrase_demerits( phrase );
                                        }
                                        finally
                                        {
                                          pph_vars.$pph_track_discourse_referentsP$.rebind( _prev_bind_1_$12, thread );
                                          pph_vars.$paraphrase_mode$.rebind( _prev_bind_0_$11, thread );
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      pph_vars.$pph_domain_mt$.rebind( _prev_bind_1_$11, thread );
                                      pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$10, thread );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$14, thread );
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$10, thread );
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$9, thread );
                                  }
                                }
                                finally
                                {
                                  final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    final SubLObject _values = Values.getValuesAsVector();
                                    pph_macros.destroy_new_pph_phrases();
                                    Values.restoreValuesFromVector( _values );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
                                  }
                                }
                              }
                              finally
                              {
                                pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
                                pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_1_$9, thread );
                                pph_macros.$new_pph_phrases$.rebind( _prev_bind_0_$8, thread );
                              }
                            }
                            catch( final Throwable ccatch_env_var )
                            {
                              failed_method = Errors.handleThrowable( ccatch_env_var, $kw16$PPH_METHOD_FAILURE );
                            }
                            finally
                            {
                              thread.throwStack.pop();
                            }
                          }
                        }
                        finally
                        {
                          pph_macros.$handling_pph_method_failuresP$.rebind( _prev_bind_1_$8, thread );
                          pph_macros.$suspended_paraphrase_methods$.rebind( _prev_bind_0_$7, thread );
                        }
                      }
                      finally
                      {
                        pph_vars.$pph_cycls$.rebind( _prev_bind_1_$7, thread );
                        pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0_$6, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                      }
                    }
                  }
                  finally
                  {
                    memoization_state.$memoization_state$.rebind( _prev_bind_0_$5, thread );
                  }
                }
                finally
                {
                  pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$4, thread );
                }
                if( new_or_reused == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                {
                  memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$3, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                if( NIL == reuseP )
                {
                  pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                }
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
              }
            }
          }
          finally
          {
            pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$1, thread );
        }
      }
      else
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym21$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              final SubLObject _prev_bind_0_$16 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
              try
              {
                pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$17 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                try
                {
                  pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                  final SubLObject reuseP2 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  try
                  {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$18 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                    try
                    {
                      pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                      final SubLObject new_or_reused2 = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      final SubLObject _prev_bind_0_$19 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                      try
                      {
                        pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                        final SubLObject local_state2 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                        final SubLObject _prev_bind_0_$20 = memoization_state.$memoization_state$.currentBinding( thread );
                        try
                        {
                          memoization_state.$memoization_state$.bind( local_state2, thread );
                          final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
                          try
                          {
                            final SubLObject _prev_bind_0_$21 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$13 = pph_vars.$pph_cycls$.currentBinding( thread );
                            try
                            {
                              pph_vars.$pph_demerit_cutoff$.bind( demerit_cutoff, thread );
                              pph_vars.$pph_cycls$.bind( ConsesLow.cons( pph_utilities.pph_hl_to_el( v_object ), pph_vars.$pph_cycls$.getDynamicValue( thread ) ), thread );
                              if( $kw0$DEFAULT == nl_preds )
                              {
                                nl_preds = pph_utilities.pph_default_nl_preds( v_object, $kw15$NONE, language_mt, domain_mt );
                              }
                              final SubLObject top_levelP2 = pph_macros.handling_pph_method_failures_top_level_p();
                              final SubLObject _prev_bind_0_$22 = pph_macros.$suspended_paraphrase_methods$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$14 = pph_macros.$handling_pph_method_failuresP$.currentBinding( thread );
                              try
                              {
                                pph_macros.$suspended_paraphrase_methods$.bind( ( NIL != top_levelP2 ) ? set.new_set( Symbols.symbol_function( EQUAL ), pph_macros.max_suspended_method_depth() )
                                    : pph_macros.$suspended_paraphrase_methods$.getDynamicValue( thread ), thread );
                                pph_macros.$handling_pph_method_failuresP$.bind( T, thread );
                                for( SubLObject failed_method2 = NIL, tried_oneP2 = NIL; NIL != failed_method2 || NIL == tried_oneP2; tried_oneP2 = T )
                                {
                                  if( NIL != failed_method2 )
                                  {
                                    pph_macros.note_suspended_paraphrase_method_plist( failed_method2 );
                                    failed_method2 = NIL;
                                  }
                                  try
                                  {
                                    thread.throwStack.push( $kw16$PPH_METHOD_FAILURE );
                                    final SubLObject _prev_bind_0_$23 = pph_macros.$new_pph_phrases$.currentBinding( thread );
                                    final SubLObject _prev_bind_1_$15 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
                                    final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
                                    try
                                    {
                                      pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
                                      pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
                                      pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
                                      try
                                      {
                                        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
                                        final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
                                        final SubLObject _prev_bind_1_$16 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
                                        final SubLObject _prev_bind_2_$15 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p2, $pph_sbhl_spaces_to_resource$.getGlobalValue() ),
                                              thread );
                                          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p2 ), thread );
                                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                                          if( NIL != determiner )
                                          {
                                            final SubLObject new_format_string2 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil
                                                .format_nil_a_no_copy( $str19$Don_t_know_what_to_do_with_determ )
                                            } );
                                            pph_error.pph_handle_error( new_format_string2, ConsesLow.list( determiner ) );
                                          }
                                          v_object = pph_utilities.do_tou_substitution( v_object );
                                          v_object = pph_utilities.pph_nart_substitute( v_object );
                                          final SubLObject _prev_bind_0_$25 = pph_vars.$pph_language_mt$.currentBinding( thread );
                                          final SubLObject _prev_bind_1_$17 = pph_vars.$pph_domain_mt$.currentBinding( thread );
                                          try
                                          {
                                            pph_vars.$pph_language_mt$.bind( language_mt, thread );
                                            pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
                                            phrase = pph_phrase.new_pph_phrase_for_cycl( v_object, pph_utilities.pph_new_identity_map(), T );
                                            if( NIL != pph_phrase.pph_phrase_p( phrase, UNPROVIDED ) )
                                            {
                                              final SubLObject _prev_bind_0_$26 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                                              final SubLObject _prev_bind_1_$18 = pph_vars.$pph_track_discourse_referentsP$.currentBinding( thread );
                                              try
                                              {
                                                pph_vars.$paraphrase_mode$.bind( mode, thread );
                                                pph_vars.$pph_track_discourse_referentsP$.bind( makeBoolean( NIL != pph_vars.$pph_track_discourse_referentsP$.getDynamicValue( thread )
                                                    && NIL == pph_discourse_referent_tracking_pointlessP( v_object ) ), thread );
                                                pph_phrase.pph_phrase_update_agr_preds( phrase, nl_preds, UNPROVIDED );
                                                pph_phrase.pph_phrase_set_focus_arg( phrase, focus_arg );
                                                thread.resetMultipleValues();
                                                final SubLObject ret_string_$20 = generate_phrase_int( phrase, top );
                                                final SubLObject pred_$21 = thread.secondMultipleValue();
                                                final SubLObject justifications_$22 = thread.thirdMultipleValue();
                                                final SubLObject output_list_$23 = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                ret_string = ret_string_$20;
                                                pred = pred_$21;
                                                justifications = justifications_$22;
                                                output_list = output_list_$23;
                                                demerits = pph_phrase.pph_phrase_demerits( phrase );
                                              }
                                              finally
                                              {
                                                pph_vars.$pph_track_discourse_referentsP$.rebind( _prev_bind_1_$18, thread );
                                                pph_vars.$paraphrase_mode$.rebind( _prev_bind_0_$26, thread );
                                              }
                                            }
                                          }
                                          finally
                                          {
                                            pph_vars.$pph_domain_mt$.rebind( _prev_bind_1_$17, thread );
                                            pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$25, thread );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$15, thread );
                                          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$16, thread );
                                          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$24, thread );
                                        }
                                      }
                                      finally
                                      {
                                        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                        try
                                        {
                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                          final SubLObject _values4 = Values.getValuesAsVector();
                                          pph_macros.destroy_new_pph_phrases();
                                          Values.restoreValuesFromVector( _values4 );
                                        }
                                        finally
                                        {
                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_4, thread );
                                      pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_1_$15, thread );
                                      pph_macros.$new_pph_phrases$.rebind( _prev_bind_0_$23, thread );
                                    }
                                  }
                                  catch( final Throwable ccatch_env_var2 )
                                  {
                                    failed_method2 = Errors.handleThrowable( ccatch_env_var2, $kw16$PPH_METHOD_FAILURE );
                                  }
                                  finally
                                  {
                                    thread.throwStack.pop();
                                  }
                                }
                              }
                              finally
                              {
                                pph_macros.$handling_pph_method_failuresP$.rebind( _prev_bind_1_$14, thread );
                                pph_macros.$suspended_paraphrase_methods$.rebind( _prev_bind_0_$22, thread );
                              }
                            }
                            finally
                            {
                              pph_vars.$pph_cycls$.rebind( _prev_bind_1_$13, thread );
                              pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0_$21, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values5 = Values.getValuesAsVector();
                              memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
                              Values.restoreValuesFromVector( _values5 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
                            }
                          }
                        }
                        finally
                        {
                          memoization_state.$memoization_state$.rebind( _prev_bind_0_$20, thread );
                        }
                      }
                      finally
                      {
                        pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$19, thread );
                      }
                      if( new_or_reused2 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                      {
                        memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                      }
                    }
                    finally
                    {
                      pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$18, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values6 = Values.getValuesAsVector();
                      if( NIL == reuseP2 )
                      {
                        pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                      }
                      Values.restoreValuesFromVector( _values6 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
                    }
                  }
                }
                finally
                {
                  pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$17, thread );
                }
              }
              finally
              {
                pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$16, thread );
              }
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$15, thread );
          }
        }
        catch( final Throwable ccatch_env_var3 )
        {
          error_message = Errors.handleThrowable( ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
        {
          Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str22$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
        }
      }
    }
    finally
    {
      pph_error.$pph_error_handling_onP$.rebind( _prev_bind_2, thread );
      Errors.$continue_cerrorP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != error_message )
    {
      ret_string = string_utilities.str_by_type( v_object );
    }
    SubLObject any_changeP = NIL;
    thread.resetMultipleValues();
    final SubLObject output_list_$24 = pph_sanitize_output_list( output_list, original );
    final SubLObject any_changeP_$53 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    output_list = output_list_$24;
    any_changeP = any_changeP_$53;
    if( NIL != any_changeP )
    {
      ret_string = pph_phrase.pph_phrase_output_list_string( output_list, Equality.eq( mode, $kw23$HTML ) );
    }
    ret_string = pph_string.pph_string_if_non_null_to_output_format( ret_string, mode );
    if( NIL != pph_data_structures.valid_pph_phrase_p( phrase ) && !pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ).equal( v_object ) )
    {
      for( SubLObject curr = phrase; NIL != curr; curr = ONE_INTEGER.eql( pph_phrase.pph_phrase_dtr_count( curr ) ) ? pph_phrase.pph_phrase_nth_dtr( curr, ZERO_INTEGER ) : NIL )
      {
        pph_phrase.pph_phrase_set_cycl( curr, v_object );
      }
    }
    return Values.values( ret_string, pred, justifications, output_list, demerits, ( NIL != pph_data_structures.valid_pph_phrase_p( phrase ) ) ? phrase : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 3223L)
  public static SubLObject generate_phrase_no_checks_memoized(final SubLObject v_object, final SubLObject nl_preds, final SubLObject determiner, final SubLObject language_mt, final SubLObject domain_mt,
      final SubLObject mode, final SubLObject top, final SubLObject focus_arg, final SubLObject demerit_cutoff)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return generate_phrase_no_checks_memoized_internal( v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg, demerit_cutoff );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym14$GENERATE_PHRASE_NO_CHECKS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym14$GENERATE_PHRASE_NO_CHECKS_MEMOIZED, NINE_INTEGER, $int24$256, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym14$GENERATE_PHRASE_NO_CHECKS_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_9( v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg, demerit_cutoff );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_object.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( nl_preds.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( determiner.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( language_mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( domain_mt.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( mode.equal( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( top.equal( cached_args.first() ) )
                    {
                      cached_args = cached_args.rest();
                      if( focus_arg.equal( cached_args.first() ) )
                      {
                        cached_args = cached_args.rest();
                        if( NIL != cached_args && NIL == cached_args.rest() && demerit_cutoff.equal( cached_args.first() ) )
                        {
                          return memoization_state.caching_results( results2 );
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( generate_phrase_no_checks_memoized_internal( v_object, nl_preds, determiner, language_mt, domain_mt, mode, top,
        focus_arg, demerit_cutoff ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( new SubLObject[] { v_object, nl_preds, determiner, language_mt, domain_mt, mode, top, focus_arg,
      demerit_cutoff
    } ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 5715L)
  public static SubLObject generate_string_from_phrase_naut(final SubLObject phrase_naut, SubLObject language_mt, SubLObject domain_mt, SubLObject force)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( force == UNPROVIDED )
    {
      force = $kw15$NONE;
    }
    assert NIL != pph_types.pph_phrase_nautP( phrase_naut ) : phrase_naut;
    SubLObject to_paraphrase = phrase_naut;
    SubLObject nl_preds = $kw0$DEFAULT;
    if( NIL != el_utilities.el_formula_with_operator_p( to_paraphrase, pph_functions.termparaphrasefn() ) )
    {
      to_paraphrase = cycl_utilities.nat_arg1( to_paraphrase, UNPROVIDED );
    }
    else if( NIL != el_utilities.el_formula_with_operator_p( to_paraphrase, pph_functions.termparaphrasefn_constrained() ) )
    {
      nl_preds = removal_modules_lexicon.preds_from_term_phrases_constraint( cycl_utilities.nat_arg1( to_paraphrase, UNPROVIDED ) );
      to_paraphrase = cycl_utilities.nat_arg2( to_paraphrase, UNPROVIDED );
    }
    return generate_text_wXsentential_force( to_paraphrase, force, nl_preds, language_mt, domain_mt, $kw1$TEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 6562L)
  public static SubLObject generate_good_string_from_phrase_naut(final SubLObject phrase_naut, SubLObject language_mt, SubLObject domain_mt, SubLObject force)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( force == UNPROVIDED )
    {
      force = $kw15$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    SubLObject string = NIL;
    final SubLObject _prev_bind_0 = pph_error.$pph_break_on_errorP$.currentBinding( thread );
    try
    {
      pph_error.$pph_break_on_errorP$.bind( T, thread );
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0_$54 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym21$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject _prev_bind_0_$55 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
            try
            {
              pph_vars.$pph_demerit_cutoff$.bind( TWO_INTEGER, thread );
              string = generate_string_from_phrase_naut( phrase_naut, language_mt, domain_mt, force );
            }
            finally
            {
              pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0_$55, thread );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0_$54, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      pph_error.$pph_break_on_errorP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( string, error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 7147L)
  public static SubLObject generate_phrase_for_java(final SubLObject v_object, SubLObject nl_preds, SubLObject force, SubLObject language_mt, SubLObject domain_mt, SubLObject mode)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw23$HTML;
    }
    enforceType( nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_ );
    enforceType( language_mt, $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_ );
    enforceType( domain_mt, $sym27$POSSIBLY_MT_P );
    return generate_phrase_for_java_no_checks( v_object, nl_preds, force, language_mt, domain_mt, mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 8187L)
  public static SubLObject cached_paraphrase_for_java(final SubLObject v_object, SubLObject fallback_method)
  {
    if( fallback_method == UNPROVIDED )
    {
      fallback_method = $sym33$PRINC_TO_STRING;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( v_object, $sym2$CYCL_EXPRESSION_P );
    SubLObject string = NIL;
    SubLObject item = NIL;
    if( NIL != forts.fort_p( v_object ) )
    {
      thread.resetMultipleValues();
      final SubLObject cached_string = pph_utilities.pph_fort_paraphrase_cache_lookup( v_object, UNPROVIDED, UNPROVIDED );
      final SubLObject agr_pred = thread.secondMultipleValue();
      final SubLObject demerits = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( cached_string.isString() && NIL == pph_vars.pph_too_many_demerits_p( demerits, UNPROVIDED ) && ( NIL == pph_utilities.pph_name_string_predP( agr_pred ) || NIL != pph_utilities.pph_genl_mtP(
          nl_generation_fort_cache.nl_generation_fort_cache_paraphrase_mt( UNPROVIDED ), pph_vars.$pph_language_mt$.getDynamicValue( thread ) ) ) )
      {
        string = cached_string;
      }
    }
    if( NIL == cycl_string.cycl_string_p( string ) )
    {
      if( NIL != Symbols.fboundp( fallback_method ) )
      {
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding( thread );
        final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
        try
        {
          pph_vars.$paraphrase_mode$.bind( $kw1$TEXT, thread );
          pph_vars.$pph_demerit_cutoff$.bind( number_utilities.positive_infinity(), thread );
          string = Functions.funcall( fallback_method, v_object );
        }
        finally
        {
          pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_2, thread );
          pph_vars.$paraphrase_mode$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        Errors.error( $str34$Fallback_method__S_is_not_a_known, fallback_method );
      }
    }
    if( NIL != cycl_string.cycl_string_p( string ) )
    {
      item = pph_data_structures.new_pph_phrase_output_item( pph_string.pph_string_from_cycl_string( string ), NIL, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      Errors.error( $str35$Couldn_t_generate_a_string_for__S, v_object, fallback_method );
    }
    final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding( thread );
    try
    {
      pph_vars.$paraphrase_mode$.bind( $kw23$HTML, thread );
      pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags( item, v_object );
    }
    finally
    {
      pph_vars.$paraphrase_mode$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.list( pph_utilities.pph_output_list_to_javalist( ConsesLow.list( item ) ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 9864L)
  public static SubLObject cached_disambiguation_paraphrases_for_java(final SubLObject objects, SubLObject fallback_method)
  {
    if( fallback_method == UNPROVIDED )
    {
      fallback_method = $sym36$GENERATE_PHRASE_NO_CHECKS;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject abortP = NIL;
    final SubLObject strings = set.new_set( Symbols.symbol_function( EQUALP ), UNPROVIDED );
    SubLObject javalists = NIL;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_ambiguous_strings$.currentBinding( thread );
    try
    {
      pph_vars.$pph_ambiguous_strings$.bind( ( NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue( thread ) ) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue( thread )
          : dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
      SubLObject list_var = NIL;
      SubLObject v_object = NIL;
      SubLObject done_count = NIL;
      list_var = objects;
      v_object = list_var.first();
      for( done_count = ZERO_INTEGER; NIL == abortP && NIL != list_var; list_var = list_var.rest(), v_object = list_var.first(), done_count = Numbers.add( ONE_INTEGER, done_count ) )
      {
        final SubLObject javalist = cached_paraphrase_for_java( v_object, fallback_method ).first();
        final SubLObject string = pph_utilities.pph_javalist_string( javalist );
        if( NIL != set.set_memberP( string, strings ) )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str37$Duplicate_javalist_____S, javalist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          pph_disambiguation.pph_note_ambiguous_string( string, v_object );
          SubLObject list_var_$56 = NIL;
          SubLObject javalist_$57 = NIL;
          SubLObject i = NIL;
          list_var_$56 = javalists;
          javalist_$57 = list_var_$56.first();
          for( i = ZERO_INTEGER; NIL != list_var_$56; list_var_$56 = list_var_$56.rest(), javalist_$57 = list_var_$56.first(), i = Numbers.add( ONE_INTEGER, i ) )
          {
            if( pph_utilities.pph_javalist_string( javalist_$57 ).equalp( string ) )
            {
              final SubLObject n = number_utilities.f_1_( Numbers.subtract( done_count, i ) );
              final SubLObject other_cycl = ConsesLow.nth( n, objects );
              pph_disambiguation.pph_note_ambiguous_string( string, other_cycl );
            }
          }
        }
        else
        {
          set.set_add( string, strings );
        }
        javalists = ConsesLow.cons( javalist, javalists );
      }
      if( NIL == abortP )
      {
        SubLObject cdolist_list_var = javalists;
        SubLObject javalist2 = NIL;
        javalist2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == pph_disambiguation.pph_string_ambiguous_p( pph_utilities.pph_javalist_string( javalist2 ) ) )
          {
            ans = ConsesLow.cons( javalist2, ans );
          }
          else
          {
            ans = ConsesLow.cons( pph_disambiguation.pph_try_to_clarify_javalist( javalist2, $kw15$NONE, $kw0$DEFAULT, UNPROVIDED, UNPROVIDED ), ans );
          }
          cdolist_list_var = cdolist_list_var.rest();
          javalist2 = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      pph_vars.$pph_ambiguous_strings$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 11354L)
  public static SubLObject generate_phrase_for_java_no_checks(final SubLObject v_object, SubLObject nl_preds, SubLObject force, SubLObject language_mt, SubLObject domain_mt, SubLObject mode)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw23$HTML;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw0$DEFAULT == nl_preds )
    {
      nl_preds = pph_utilities.pph_default_nl_preds( narts_high.nart_substitute( v_object ), force, language_mt, domain_mt );
    }
    SubLObject ans = NIL;
    SubLObject error_message = NIL;
    SubLObject use_arg_positions_strictlyP = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
    try
    {
      Errors.$continue_cerrorP$.bind( NIL, thread );
      pph_error.$pph_error_handling_onP$.bind( T, thread );
      if( NIL != pph_error.pph_break_on_errorP() )
      {
        thread.resetMultipleValues();
        final SubLObject olist = generate_pph_output_list( narts_high.nart_substitute( v_object ), nl_preds, language_mt, domain_mt, mode, force );
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject just = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        justification = just;
        use_arg_positions_strictlyP = list_utilities.sublisp_boolean( Sequences.find_if( $sym38$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        final SubLObject _prev_bind_0_$58 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding( thread );
        try
        {
          pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind( makeBoolean( NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P() && NIL == use_arg_positions_strictlyP ), thread );
          ans = ( NIL != olist ) ? pph_utilities.pph_output_list_to_javalist( olist ) : NIL;
        }
        finally
        {
          pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind( _prev_bind_0_$58, thread );
        }
      }
      else
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$59 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym21$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              thread.resetMultipleValues();
              final SubLObject olist2 = generate_pph_output_list( narts_high.nart_substitute( v_object ), nl_preds, language_mt, domain_mt, mode, force );
              final SubLObject pred2 = thread.secondMultipleValue();
              final SubLObject just2 = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              justification = just2;
              use_arg_positions_strictlyP = list_utilities.sublisp_boolean( Sequences.find_if( $sym38$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
              final SubLObject _prev_bind_0_$60 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding( thread );
              try
              {
                pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind( makeBoolean( NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P() && NIL == use_arg_positions_strictlyP ), thread );
                ans = ( NIL != olist2 ) ? pph_utilities.pph_output_list_to_javalist( olist2 ) : NIL;
              }
              finally
              {
                pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind( _prev_bind_0_$60, thread );
              }
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$59, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
        {
          Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str22$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
        }
      }
    }
    finally
    {
      pph_error.$pph_error_handling_onP$.rebind( _prev_bind_2, thread );
      Errors.$continue_cerrorP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != error_message )
    {
      Errors.error( error_message );
    }
    return Values.values( ans, use_arg_positions_strictlyP, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 12941L)
  public static SubLObject gen_template_query_sentence_assertion_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( v_object ) && NIL != assertions_high.gaf_assertionP( v_object ) && assertions_high.gaf_arg0( v_object ).eql( $const39$genTemplate_QuerySentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 13131L)
  public static SubLObject generate_phrase_int(final SubLObject phrase, final SubLObject top)
  {
    pph_utilities.pph_possibly_nartify_phrase( phrase );
    final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope( phrase );
    try
    {
      pph_phrase_generate( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped( phrase, save_cycl, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    if( NIL != top )
    {
      pph_vars.$last_pph_sentence$.setDynamicValue( phrase );
    }
    SubLObject string = NIL;
    SubLObject pred = NIL;
    SubLObject justification = NIL;
    SubLObject output_list = NIL;
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      string = pph_phrase.pph_phrase_string( phrase, UNPROVIDED );
      pred = pph_phrase.pph_phrase_agr_pred( phrase );
      justification = pph_phrase.pph_phrase_gather_supports( phrase );
      output_list = pph_phrase.pph_phrase_output_list( phrase );
    }
    return Values.values( string, pred, justification, output_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 13804L)
  public static SubLObject generate_disambiguation_phrase(final SubLObject v_object, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode)
  {
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw0$DEFAULT == force )
    {
      force = pph_utilities.pph_default_force_for_term( v_object );
    }
    if( $kw0$DEFAULT == nl_preds )
    {
      nl_preds = pph_utilities.pph_default_nl_preds( v_object, force, language_mt, domain_mt );
    }
    SubLObject paraphrase = NIL;
    SubLObject pred = NIL;
    SubLObject justification = NIL;
    SubLObject olist = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding( thread );
    try
    {
      pph_vars.$use_parenthetical_disambiguationsP$.bind( $kw40$TOP_LEVEL, thread );
      thread.resetMultipleValues();
      final SubLObject paraphrase_$61 = generate_text_wXsentential_force( v_object, force, nl_preds, language_mt, domain_mt, mode, UNPROVIDED );
      final SubLObject pred_$62 = thread.secondMultipleValue();
      final SubLObject justification_$63 = thread.thirdMultipleValue();
      final SubLObject olist_$64 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      paraphrase = paraphrase_$61;
      pred = pred_$62;
      justification = justification_$63;
      olist = olist_$64;
    }
    finally
    {
      pph_vars.$use_parenthetical_disambiguationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( paraphrase, pred, justification, olist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 14811L)
  public static SubLObject generate_disambiguation_phrases(final SubLObject objects, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject forbidden_strings)
  {
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( forbidden_strings == UNPROVIDED )
    {
      forbidden_strings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != string_utilities.list_of_string_p( forbidden_strings ) : forbidden_strings;
    if( $kw0$DEFAULT == force )
    {
      force = pph_utilities.pph_default_force_for_term( objects.first() );
    }
    if( $kw0$DEFAULT == nl_preds )
    {
      nl_preds = pph_utilities.pph_default_nl_preds( objects.first(), force, language_mt, domain_mt );
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$65 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$66 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$67 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$68 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  result = generate_disambiguation_phrases_int( objects, force, nl_preds, language_mt, domain_mt, mode, $kw42$A_LIST, forbidden_strings );
                }
                finally
                {
                  final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$69, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$68, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$67, thread );
            }
            if( new_or_reused == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$66, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$70, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$65, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 15874L)
  public static SubLObject use_cached_generations_p(final SubLObject obj)
  {
    return subl_promotions.memberP( obj, $list43, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 15981L)
  public static SubLObject generate_disambiguation_phrases_for_java(final SubLObject objects, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject forbidden_strings,
      SubLObject use_cached_generations)
  {
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( forbidden_strings == UNPROVIDED )
    {
      forbidden_strings = NIL;
    }
    if( use_cached_generations == UNPROVIDED )
    {
      use_cached_generations = $kw44$REQUIRED;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( objects, $sym45$LISTP );
    enforceType( force, $sym6$KEYWORDP );
    enforceType( nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_ );
    enforceType( language_mt, $sym5$HLMT_ );
    enforceType( domain_mt, $sym5$HLMT_ );
    enforceType( forbidden_strings, $sym41$LIST_OF_STRING_P );
    enforceType( use_cached_generations, $sym46$USE_CACHED_GENERATIONS_P );
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$71 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$72 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$73 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$74 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  if( NIL != subl_promotions.memberP( force, $list47, UNPROVIDED, UNPROVIDED ) && NIL != subl_promotions.memberP( use_cached_generations, $list48, UNPROVIDED, UNPROVIDED ) && NIL != subl_promotions
                      .memberP( nl_preds, $list49, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                  {
                    final SubLObject result = cached_disambiguation_paraphrases_for_java( objects, UNPROVIDED );
                    if( use_cached_generations == $kw44$REQUIRED || NIL == list_utilities.duplicatesP( result, EQUAL, $sym50$PPH_JAVALIST_STRING ) )
                    {
                      ans = result;
                    }
                  }
                  if( NIL == ans )
                  {
                    if( $kw0$DEFAULT == nl_preds )
                    {
                      nl_preds = pph_utilities.pph_default_nl_preds( objects.first(), force, language_mt, domain_mt );
                    }
                    nl_preds = pph_utilities.pph_convert_required_nl_preds_to_preferred( nl_preds );
                    ans = generate_disambiguation_phrases_int( objects, force, nl_preds, language_mt, domain_mt, $kw23$HTML, $kw51$JAVALISTS, forbidden_strings );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$75, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$74, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$73, thread );
            }
            if( new_or_reused == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$72, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$76, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$71, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 18223L)
  public static SubLObject alphabetize_pph_javalists(final SubLObject javalists, final SubLObject objects, SubLObject case_sensitiveP)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( javalists ) : javalists;
    assert NIL != Types.listp( objects ) : objects;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.same_length_p( javalists, objects ) )
    {
      Errors.error( $str57$ALPHABETIZE_PPH_JAVALISTS_passed_, Sequences.length( javalists ), Sequences.length( objects ) );
    }
    final SubLObject annotated = pph_utilities.pph_annotate_javalists( javalists, objects );
    final SubLObject optimized = pph_utilities.possibly_optimize_pph_annotated_javalists_for_alphabetization( annotated );
    final SubLObject sorted = pph_utilities.sort_pph_annotated_javalists( optimized, case_sensitiveP );
    return pph_utilities.unannotate_pph_javalists( sorted );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 18934L)
  public static SubLObject generate_disambiguation_phrases_int(final SubLObject objects, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject return_style,
      SubLObject forbidden_strings)
  {
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( return_style == UNPROVIDED )
    {
      return_style = $kw42$A_LIST;
    }
    if( forbidden_strings == UNPROVIDED )
    {
      forbidden_strings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != pph_speech_act.pph_force_p( force ) : force;
    SubLObject output_lists = NIL;
    SubLObject timed_outP = NIL;
    SubLObject ans = NIL;
    final SubLObject blacklist = pph_blacklist_for_objects_and_strings( objects, forbidden_strings );
    final SubLObject resolved_domain_mt = date_utilities.possibly_bind_temporal_indexical_in_object( domain_mt );
    final SubLObject resolved_language_mt = date_utilities.possibly_bind_temporal_indexical_in_object( language_mt );
    final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
    try
    {
      pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
      pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
      pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
      try
      {
        final SubLObject default_timeout = pph_macros.pph_timeout();
        final SubLObject timeout = default_timeout.isNumber() ? Numbers.multiply( default_timeout, Sequences.length( objects ) ) : NIL;
        assert NIL != pph_macros.valid_pph_blacklistP( blacklist ) : blacklist;
        final SubLObject _prev_bind_0_$77 = pph_vars.$pph_term_paraphrase_blacklist$.currentBinding( thread );
        final SubLObject _prev_bind_1_$78 = pph_macros.$pph_timeout_time_check_count$.currentBinding( thread );
        final SubLObject _prev_bind_2_$79 = pph_macros.$pph_timeout_time$.currentBinding( thread );
        final SubLObject _prev_bind_4 = pph_macros.$pph_timeout_reachedP$.currentBinding( thread );
        try
        {
          pph_vars.$pph_term_paraphrase_blacklist$.bind( blacklist, thread );
          pph_macros.$pph_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
          pph_macros.$pph_timeout_time$.bind( pph_macros.pph_compute_timeout_time( timeout ), thread );
          pph_macros.$pph_timeout_reachedP$.bind( pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ), thread );
          pph_macros.$pph_timeout_reachedP$.setDynamicValue( pph_macros.pph_timeout_time_reachedP(), thread );
          if( NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ) )
          {
            final SubLObject top_levelP = pph_macros.handling_pph_method_failures_top_level_p();
            final SubLObject _prev_bind_0_$78 = pph_macros.$suspended_paraphrase_methods$.currentBinding( thread );
            final SubLObject _prev_bind_1_$79 = pph_macros.$handling_pph_method_failuresP$.currentBinding( thread );
            try
            {
              pph_macros.$suspended_paraphrase_methods$.bind( ( NIL != top_levelP ) ? set.new_set( Symbols.symbol_function( EQUAL ), pph_macros.max_suspended_method_depth() )
                  : pph_macros.$suspended_paraphrase_methods$.getDynamicValue( thread ), thread );
              pph_macros.$handling_pph_method_failuresP$.bind( T, thread );
              for( SubLObject failed_method = NIL, tried_oneP = NIL; NIL != failed_method || NIL == tried_oneP; tried_oneP = T )
              {
                if( NIL != failed_method )
                {
                  pph_macros.note_suspended_paraphrase_method_plist( failed_method );
                  failed_method = NIL;
                }
                try
                {
                  thread.throwStack.push( $kw16$PPH_METHOD_FAILURE );
                  final SubLObject _prev_bind_0_$79 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                  try
                  {
                    pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$80 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                    try
                    {
                      pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                      final SubLObject reuseP = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      try
                      {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$81 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                        try
                        {
                          pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                          final SubLObject new_or_reused = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          final SubLObject _prev_bind_0_$82 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                          try
                          {
                            pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                            final SubLObject _prev_bind_0_$83 = memoization_state.$memoization_state$.currentBinding( thread );
                            try
                            {
                              memoization_state.$memoization_state$.bind( local_state, thread );
                              final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                              try
                              {
                                SubLObject output_lists_$87 = NIL;
                                SubLObject abortP = NIL;
                                final SubLObject _prev_bind_0_$84 = pph_vars.$pph_ambiguous_strings$.currentBinding( thread );
                                try
                                {
                                  pph_vars.$pph_ambiguous_strings$.bind( ( NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue( thread ) ) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue( thread )
                                      : dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
                                  pph_disambiguation.pph_disambiguation_note( ONE_INTEGER, $str60$__Trying_default_precision___S___, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED );
                                  SubLObject list_var = NIL;
                                  SubLObject v_object = NIL;
                                  SubLObject ignoreme = NIL;
                                  list_var = objects;
                                  v_object = list_var.first();
                                  for( ignoreme = ZERO_INTEGER; NIL == abortP && NIL != list_var; list_var = list_var.rest(), v_object = list_var.first(), ignoreme = Numbers.add( ONE_INTEGER, ignoreme ) )
                                  {
                                    final SubLObject olist = generate_pph_output_list_no_checks( v_object, nl_preds, resolved_language_mt, resolved_domain_mt, mode, force );
                                    pph_disambiguation.note_pph_output_list_for_disambiguation( ignoreme, olist );
                                    if( NIL != pph_phrase.pph_phrase_output_list_p( olist ) )
                                    {
                                      output_lists_$87 = ConsesLow.cons( olist, output_lists_$87 );
                                    }
                                    else
                                    {
                                      abortP = T;
                                    }
                                  }
                                  if( NIL != abortP )
                                  {
                                    output_lists = $kw61$FAILURE;
                                  }
                                  else
                                  {
                                    output_lists_$87 = Sequences.nreverse( output_lists_$87 );
                                    SubLObject cdolist_list_var;
                                    final SubLObject dupe_index_lists = cdolist_list_var = pph_disambiguation.pph_find_duplicates( output_lists_$87 );
                                    SubLObject dupe_index_list = NIL;
                                    dupe_index_list = cdolist_list_var.first();
                                    while ( NIL != cdolist_list_var)
                                    {
                                      pph_disambiguation.pph_disambiguation_note( TWO_INTEGER, $str62$__Working_on_dupe_list___S__, dupe_index_list, UNPROVIDED, UNPROVIDED );
                                      final SubLObject dupe_objects = pph_disambiguation.pph_dereference_indexes( dupe_index_list, objects );
                                      SubLObject cdolist_list_var_$89 = dupe_index_list;
                                      SubLObject ignoreme2 = NIL;
                                      ignoreme2 = cdolist_list_var_$89.first();
                                      while ( NIL != cdolist_list_var_$89)
                                      {
                                        final SubLObject v_object2 = ConsesLow.nth( ignoreme2, objects );
                                        pph_disambiguation.pph_disambiguation_note( ONE_INTEGER, $str63$__Trying_to_reparaphrase__S___, v_object2, UNPROVIDED, UNPROVIDED );
                                        final SubLObject new_precision = pph_utilities.pph_precision_for_object( v_object2, dupe_objects );
                                        final SubLObject new_demerit_cutoff = pph_disambiguation.pph_demerit_cutoff_from_olist( ignoreme2, output_lists_$87 );
                                        SubLObject new_output_list = NIL;
                                        if( !new_precision.equal( pph_utilities.pph_current_precision() ) )
                                        {
                                          pph_disambiguation.pph_disambiguation_note( TWO_INTEGER, $str64$__Trying_targeted_precision__S_fo, new_precision, v_object2, UNPROVIDED );
                                          assert NIL != pph_utilities.pph_precision_p( new_precision ) : new_precision;
                                          final SubLObject _prev_bind_0_$85 = pph_vars.$paraphrase_precision$.currentBinding( thread );
                                          final SubLObject _prev_bind_1_$80 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
                                          try
                                          {
                                            pph_vars.$paraphrase_precision$.bind( new_precision, thread );
                                            pph_vars.$pph_demerit_cutoff$.bind( new_demerit_cutoff, thread );
                                            new_output_list = generate_pph_output_list_no_checks( v_object2, nl_preds, resolved_language_mt, resolved_domain_mt, mode, force );
                                          }
                                          finally
                                          {
                                            pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_1_$80, thread );
                                            pph_vars.$paraphrase_precision$.rebind( _prev_bind_0_$85, thread );
                                          }
                                          pph_disambiguation.pph_disambiguation_note( TWO_INTEGER, $str66$__New_paraphrase_with_precision__, new_precision, v_object2, new_output_list );
                                        }
                                        if( new_precision.isList() && ( NIL == new_output_list || NIL != pph_disambiguation.pph_output_list_E( new_output_list, ConsesLow.nth( ignoreme2, output_lists_$87 ) ) ) )
                                        {
                                          pph_disambiguation.pph_disambiguation_note( TWO_INTEGER, $str67$__Trying_full_precision_for__S, v_object2, UNPROVIDED, UNPROVIDED );
                                          assert NIL != pph_utilities.pph_precision_p( T ) : T;
                                          final SubLObject _prev_bind_0_$86 = pph_vars.$paraphrase_precision$.currentBinding( thread );
                                          final SubLObject _prev_bind_1_$81 = pph_vars.$pph_ambiguous_strings$.currentBinding( thread );
                                          final SubLObject _prev_bind_2_$80 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
                                          try
                                          {
                                            pph_vars.$paraphrase_precision$.bind( T, thread );
                                            pph_vars.$pph_ambiguous_strings$.bind( ( NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue( thread ) ) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue( thread )
                                                : dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
                                            pph_vars.$pph_demerit_cutoff$.bind( new_demerit_cutoff, thread );
                                            new_output_list = generate_pph_output_list_no_checks( v_object2, nl_preds, resolved_language_mt, resolved_domain_mt, mode, force );
                                          }
                                          finally
                                          {
                                            pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_2_$80, thread );
                                            pph_vars.$pph_ambiguous_strings$.rebind( _prev_bind_1_$81, thread );
                                            pph_vars.$paraphrase_precision$.rebind( _prev_bind_0_$86, thread );
                                          }
                                          pph_disambiguation.pph_disambiguation_note( TWO_INTEGER, $str68$__New_paraphrase_with_full_precis, v_object2, new_output_list, UNPROVIDED );
                                        }
                                        if( NIL != pph_disambiguation.pph_new_olist_better_than_oldP( new_output_list, ConsesLow.nth( ignoreme2, output_lists_$87 ), v_object2 ) )
                                        {
                                          pph_disambiguation.pph_disambiguation_note( ONE_INTEGER, $str69$__Changing_output_list_for__S_fro, v_object2, ConsesLow.nth( ignoreme2, output_lists_$87 ), new_output_list );
                                          ConsesLow.set_nth( ignoreme2, output_lists_$87, new_output_list );
                                          pph_disambiguation.note_pph_output_list_for_disambiguation( ignoreme2, new_output_list );
                                        }
                                        cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                                        ignoreme2 = cdolist_list_var_$89.first();
                                      }
                                      cdolist_list_var = cdolist_list_var.rest();
                                      dupe_index_list = cdolist_list_var.first();
                                    }
                                    SubLObject cdolist_list_var2 = objects;
                                    v_object = NIL;
                                    v_object = cdolist_list_var2.first();
                                    while ( NIL != cdolist_list_var2)
                                    {
                                      pph_drs.pph_possibly_add_reference_marker( v_object );
                                      cdolist_list_var2 = cdolist_list_var2.rest();
                                      v_object = cdolist_list_var2.first();
                                    }
                                    output_lists = ConsesLow.append( output_lists, output_lists_$87 );
                                  }
                                }
                                finally
                                {
                                  pph_vars.$pph_ambiguous_strings$.rebind( _prev_bind_0_$84, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values = Values.getValuesAsVector();
                                  memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                                  Values.restoreValuesFromVector( _values );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$87, thread );
                                }
                              }
                            }
                            finally
                            {
                              memoization_state.$memoization_state$.rebind( _prev_bind_0_$83, thread );
                            }
                          }
                          finally
                          {
                            pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$82, thread );
                          }
                          if( new_or_reused == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                          {
                            memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                          }
                        }
                        finally
                        {
                          pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$81, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          if( NIL == reuseP )
                          {
                            pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                          }
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$88, thread );
                        }
                      }
                    }
                    finally
                    {
                      pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$80, thread );
                    }
                  }
                  finally
                  {
                    pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$79, thread );
                  }
                }
                catch( final Throwable ccatch_env_var )
                {
                  failed_method = Errors.handleThrowable( ccatch_env_var, $kw16$PPH_METHOD_FAILURE );
                }
                finally
                {
                  thread.throwStack.pop();
                }
              }
            }
            finally
            {
              pph_macros.$handling_pph_method_failuresP$.rebind( _prev_bind_1_$79, thread );
              pph_macros.$suspended_paraphrase_methods$.rebind( _prev_bind_0_$78, thread );
            }
          }
          timed_outP = pph_macros.pph_timeout_time_reachedP();
        }
        finally
        {
          pph_macros.$pph_timeout_reachedP$.rebind( _prev_bind_4, thread );
          pph_macros.$pph_timeout_time$.rebind( _prev_bind_2_$79, thread );
          pph_macros.$pph_timeout_time_check_count$.rebind( _prev_bind_1_$78, thread );
          pph_vars.$pph_term_paraphrase_blacklist$.rebind( _prev_bind_0_$77, thread );
        }
        if( NIL != timed_outP && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
        {
          Errors.warn( $str70$Timed_out_generating_disambiguati, objects );
          streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
        }
        if( output_lists.isList() )
        {
          SubLObject output_list = NIL;
          SubLObject output_list_$97 = NIL;
          SubLObject cycl = NIL;
          SubLObject cycl_$98 = NIL;
          output_list = output_lists;
          output_list_$97 = output_list.first();
          cycl = objects;
          cycl_$98 = cycl.first();
          while ( NIL != cycl || NIL != output_list)
          {
            final SubLObject pcase_var = return_style;
            if( pcase_var.eql( $kw42$A_LIST ) )
            {
              final SubLObject string = pph_phrase.pph_phrase_output_list_string( output_list_$97, UNPROVIDED );
              ans = ConsesLow.cons( ConsesLow.cons( cycl_$98, string ), ans );
            }
            else if( pcase_var.eql( $kw51$JAVALISTS ) )
            {
              ans = ConsesLow.cons( pph_utilities.pph_output_list_to_javalist( output_list_$97 ), ans );
            }
            output_list = output_list.rest();
            output_list_$97 = output_list.first();
            cycl = cycl.rest();
            cycl_$98 = cycl.first();
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          pph_macros.destroy_new_pph_phrases();
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$89, thread );
        }
      }
    }
    finally
    {
      pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
      pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_2, thread );
      pph_macros.$new_pph_phrases$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 20564L)
  public static SubLObject pph_blacklist_for_objects_and_strings(final SubLObject objects, final SubLObject forbidden_strings)
  {
    SubLObject blacklist = NIL;
    if( NIL != forbidden_strings )
    {
      SubLObject cdolist_list_var = objects;
      SubLObject v_object = NIL;
      v_object = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        blacklist = list_utilities.alist_enter( blacklist, v_object, forbidden_strings, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        v_object = cdolist_list_var.first();
      }
    }
    return blacklist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 20825L)
  public static SubLObject generate_disambiguation_phrases_and_types(final SubLObject objects, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject forbidden_strings)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $list71;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( forbidden_strings == UNPROVIDED )
    {
      forbidden_strings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != string_utilities.list_of_string_p( forbidden_strings ) : forbidden_strings;
    SubLObject ans = NIL;
    final SubLObject types = pph_disambiguation.pph_disambiguating_generalizations( objects, domain_mt );
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$100 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$101 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$102 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$103 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  final SubLObject _prev_bind_0_$104 = pph_macros.$new_pph_phrases$.currentBinding( thread );
                  final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
                  try
                  {
                    pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
                    pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
                    pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
                    try
                    {
                      final SubLObject _prev_bind_0_$105 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding( thread );
                      try
                      {
                        pph_vars.$use_parenthetical_disambiguationsP$.bind( $kw72$NEVER, thread );
                        final SubLObject term_phrase_pairs = generate_disambiguation_phrases( objects, $kw15$NONE, nl_preds, language_mt, domain_mt, mode, forbidden_strings );
                        final SubLObject type_phrase_pairs = generate_disambiguation_phrases( types, $kw15$NONE, $list71, language_mt, domain_mt, mode, forbidden_strings );
                        SubLObject term_pair = NIL;
                        SubLObject term_pair_$106 = NIL;
                        SubLObject type_pair = NIL;
                        SubLObject type_pair_$107 = NIL;
                        term_pair = term_phrase_pairs;
                        term_pair_$106 = term_pair.first();
                        type_pair = type_phrase_pairs;
                        type_pair_$107 = type_pair.first();
                        while ( NIL != type_pair || NIL != term_pair)
                        {
                          ans = ConsesLow.cons( ConsesLow.append( ConsesLow.list( term_pair_$106.first(), term_pair_$106.rest() ), type_pair_$107 ), ans );
                          term_pair = term_pair.rest();
                          term_pair_$106 = term_pair.first();
                          type_pair = type_pair.rest();
                          type_pair_$107 = type_pair.first();
                        }
                      }
                      finally
                      {
                        pph_vars.$use_parenthetical_disambiguationsP$.rebind( _prev_bind_0_$105, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$106, thread );
                      }
                    }
                  }
                  finally
                  {
                    pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
                    pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_2, thread );
                    pph_macros.$new_pph_phrases$.rebind( _prev_bind_0_$104, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$107, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$103, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$102, thread );
            }
            if( new_or_reused == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$101, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$108, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$100, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 22150L)
  public static SubLObject generate_assertion_output_list(final SubLObject assertion, SubLObject language_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject olist = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding( thread );
    try
    {
      pph_vars.$constant_link_function$.bind( $kw15$NONE, thread );
      pph_vars.$pph_use_bulleted_listsP$.bind( T, thread );
      olist = generate_pph_output_list( assertion, $kw0$DEFAULT, language_mt, assertions_high.assertion_mt( assertion ), $kw23$HTML, $kw15$NONE );
    }
    finally
    {
      pph_vars.$pph_use_bulleted_listsP$.rebind( _prev_bind_2, thread );
      pph_vars.$constant_link_function$.rebind( _prev_bind_0, thread );
    }
    return pph_methods.pph_output_list_to_assertion_output_list( olist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 22781L)
  public static SubLObject generate_pph_output_list(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject force)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != pph_speech_act.pph_force_p( force ) : force;
    if( $kw0$DEFAULT == nl_preds )
    {
      nl_preds = pph_utilities.pph_default_nl_preds( narts_high.nart_substitute( v_object ), force, language_mt, domain_mt );
    }
    if( $kw0$DEFAULT == language_mt )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue( thread );
    }
    if( language_mt.isString() )
    {
      language_mt = pph_utilities.pph_language_mt_from_code( language_mt );
    }
    language_mt = pph_utilities.pph_canonicalize_hlmt( language_mt );
    domain_mt = pph_utilities.pph_canonicalize_hlmt( domain_mt );
    nl_preds = pph_utilities.pph_convert_required_nl_preds_to_preferred( nl_preds );
    return generate_pph_output_list_internal( v_object, nl_preds, language_mt, domain_mt, mode, force, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 23737L)
  public static SubLObject generate_pph_output_list_no_checks(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject force)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    return generate_pph_output_list_internal( v_object, nl_preds, language_mt, domain_mt, mode, force, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 24138L)
  public static SubLObject generate_pph_output_list_internal(final SubLObject v_object, final SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, final SubLObject force,
      final SubLObject checksP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject string = NIL;
    SubLObject pred = NIL;
    SubLObject justification = NIL;
    SubLObject output_list = NIL;
    if( NIL != checksP )
    {
      thread.resetMultipleValues();
      final SubLObject string_$111 = generate_text_wXsentential_force( v_object, force, nl_preds, language_mt, domain_mt, mode, UNPROVIDED );
      final SubLObject pred_$112 = thread.secondMultipleValue();
      final SubLObject justification_$113 = thread.thirdMultipleValue();
      final SubLObject output_list_$114 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      string = string_$111;
      pred = pred_$112;
      justification = justification_$113;
      output_list = output_list_$114;
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject string_$112 = generate_text_wXsentential_force_no_checks( v_object, force, nl_preds, language_mt, domain_mt, mode, UNPROVIDED );
      final SubLObject pred_$113 = thread.secondMultipleValue();
      final SubLObject justification_$114 = thread.thirdMultipleValue();
      final SubLObject output_list_$115 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      string = string_$112;
      pred = pred_$113;
      justification = justification_$114;
      output_list = output_list_$115;
    }
    final SubLObject _prev_bind_0 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding( thread );
    try
    {
      pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind( makeBoolean( NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P() && NIL == Sequences.find_if( $sym38$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P,
          justification, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), thread );
      output_list = pph_sanitize_output_list( conses_high.copy_list( output_list ), v_object );
    }
    finally
    {
      pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind( _prev_bind_0, thread );
    }
    return Values.values( output_list, pred, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 24929L)
  public static SubLObject generate_pph_output_lists_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject allow_morphological_variantsP,
      SubLObject allow_nested_variantsP, SubLObject force)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw74$ANY;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( allow_morphological_variantsP == UNPROVIDED )
    {
      allow_morphological_variantsP = pph_vars.pph_generate_morphological_alternativesP();
    }
    if( allow_nested_variantsP == UNPROVIDED )
    {
      allow_nested_variantsP = pph_vars.pph_generate_nested_alternativesP();
    }
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    SubLObject output_lists = NIL;
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$119 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$120 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$121 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$122 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  final SubLObject _prev_bind_0_$123 = Errors.$continue_cerrorP$.currentBinding( thread );
                  final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
                  try
                  {
                    Errors.$continue_cerrorP$.bind( NIL, thread );
                    pph_error.$pph_error_handling_onP$.bind( T, thread );
                    if( NIL != pph_error.pph_break_on_errorP() )
                    {
                      final SubLObject _prev_bind_0_$124 = pph_macros.$new_pph_phrases$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$125 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
                      final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
                      try
                      {
                        pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
                        pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
                        pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
                        try
                        {
                          thread.resetMultipleValues();
                          final SubLObject v_pph_phrase = pph_phrase_with_alternatives_for_term( v_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, force );
                          final SubLObject doneP = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          if( NIL != doneP )
                          {
                            SubLObject cdolist_list_var = pph_phrase.pph_phrase_all_output_lists( v_pph_phrase );
                            SubLObject output_list = NIL;
                            output_list = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              if( NIL != pph_sentence.pph_sentence_p( v_pph_phrase ) && NIL == pph_phrase_resolution.pph_phrase_output_list_has_sentential_forceP( output_list, force ) )
                              {
                                output_list = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force( output_list, force );
                              }
                              final SubLObject item_var = output_list;
                              if( NIL == conses_high.member( item_var, output_lists, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
                              {
                                output_lists = ConsesLow.cons( item_var, output_lists );
                              }
                              cdolist_list_var = cdolist_list_var.rest();
                              output_list = cdolist_list_var.first();
                            }
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$125 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values = Values.getValuesAsVector();
                            pph_macros.destroy_new_pph_phrases();
                            Values.restoreValuesFromVector( _values );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$125, thread );
                          }
                        }
                      }
                      finally
                      {
                        pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
                        pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_1_$125, thread );
                        pph_macros.$new_pph_phrases$.rebind( _prev_bind_0_$124, thread );
                      }
                    }
                    else
                    {
                      try
                      {
                        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                        final SubLObject _prev_bind_0_$126 = Errors.$error_handler$.currentBinding( thread );
                        try
                        {
                          Errors.$error_handler$.bind( $sym21$CATCH_ERROR_MESSAGE_HANDLER, thread );
                          try
                          {
                            final SubLObject _prev_bind_0_$127 = pph_macros.$new_pph_phrases$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$126 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
                            final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
                            try
                            {
                              pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
                              pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
                              pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
                              try
                              {
                                thread.resetMultipleValues();
                                final SubLObject v_pph_phrase2 = pph_phrase_with_alternatives_for_term( v_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, force );
                                final SubLObject doneP2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != doneP2 )
                                {
                                  SubLObject cdolist_list_var2 = pph_phrase.pph_phrase_all_output_lists( v_pph_phrase2 );
                                  SubLObject output_list2 = NIL;
                                  output_list2 = cdolist_list_var2.first();
                                  while ( NIL != cdolist_list_var2)
                                  {
                                    if( NIL != pph_sentence.pph_sentence_p( v_pph_phrase2 ) && NIL == pph_phrase_resolution.pph_phrase_output_list_has_sentential_forceP( output_list2, force ) )
                                    {
                                      output_list2 = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force( output_list2, force );
                                    }
                                    final SubLObject item_var2 = output_list2;
                                    if( NIL == conses_high.member( item_var2, output_lists, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
                                    {
                                      output_lists = ConsesLow.cons( item_var2, output_lists );
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    output_list2 = cdolist_list_var2.first();
                                  }
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values2 = Values.getValuesAsVector();
                                  pph_macros.destroy_new_pph_phrases();
                                  Values.restoreValuesFromVector( _values2 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$128, thread );
                                }
                              }
                            }
                            finally
                            {
                              pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_4, thread );
                              pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_1_$126, thread );
                              pph_macros.$new_pph_phrases$.rebind( _prev_bind_0_$127, thread );
                            }
                          }
                          catch( final Throwable catch_var )
                          {
                            Errors.handleThrowable( catch_var, NIL );
                          }
                        }
                        finally
                        {
                          Errors.$error_handler$.rebind( _prev_bind_0_$126, thread );
                        }
                      }
                      catch( final Throwable ccatch_env_var )
                      {
                        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                      }
                      finally
                      {
                        thread.throwStack.pop();
                      }
                      if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
                      {
                        Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str22$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
                      }
                    }
                  }
                  finally
                  {
                    pph_error.$pph_error_handling_onP$.rebind( _prev_bind_2, thread );
                    Errors.$continue_cerrorP$.rebind( _prev_bind_0_$123, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$129, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$122, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$121, thread );
            }
            if( new_or_reused == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$120, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values4 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values4 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$130, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$119, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( output_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 26056L)
  public static SubLObject generate_pph_string_combo_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject allow_morphological_variantsP,
      SubLObject allow_nested_variantsP, SubLObject force)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw74$ANY;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( allow_morphological_variantsP == UNPROVIDED )
    {
      allow_morphological_variantsP = pph_vars.pph_generate_morphological_alternativesP();
    }
    if( allow_nested_variantsP == UNPROVIDED )
    {
      allow_nested_variantsP = pph_vars.pph_generate_nested_alternativesP();
    }
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$133 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$134 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$135 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$136 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  final SubLObject _prev_bind_0_$137 = Errors.$continue_cerrorP$.currentBinding( thread );
                  final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
                  try
                  {
                    Errors.$continue_cerrorP$.bind( NIL, thread );
                    pph_error.$pph_error_handling_onP$.bind( T, thread );
                    if( NIL != pph_error.pph_break_on_errorP() )
                    {
                      final SubLObject _prev_bind_0_$138 = pph_macros.$new_pph_phrases$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$139 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
                      final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
                      try
                      {
                        pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
                        pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
                        pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
                        try
                        {
                          thread.resetMultipleValues();
                          final SubLObject v_pph_phrase = pph_phrase_with_alternatives_for_term( v_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, force );
                          final SubLObject doneP = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          SubLObject combo = pph_string_combo.pph_phrase_string_combo( v_pph_phrase, UNPROVIDED );
                          if( NIL != doneP && NIL != pph_sentence.pph_sentence_p( v_pph_phrase ) && NIL == pph_string_combo.pph_string_combo_has_sentential_forceP( combo, force ) )
                          {
                            combo = pph_string_combo.pph_string_combo_add_sentential_force( combo, force );
                          }
                          return combo;
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$139 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values = Values.getValuesAsVector();
                            pph_macros.destroy_new_pph_phrases();
                            Values.restoreValuesFromVector( _values );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$139, thread );
                          }
                        }
                      }
                      finally
                      {
                        pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
                        pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_1_$139, thread );
                        pph_macros.$new_pph_phrases$.rebind( _prev_bind_0_$138, thread );
                      }
                    }
                    try
                    {
                      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                      final SubLObject _prev_bind_0_$140 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( $sym21$CATCH_ERROR_MESSAGE_HANDLER, thread );
                        try
                        {
                          final SubLObject _prev_bind_0_$141 = pph_macros.$new_pph_phrases$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$140 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
                          final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
                          try
                          {
                            pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
                            pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
                            pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
                            try
                            {
                              thread.resetMultipleValues();
                              final SubLObject v_pph_phrase2 = pph_phrase_with_alternatives_for_term( v_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, force );
                              final SubLObject doneP2 = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              SubLObject combo2 = pph_string_combo.pph_phrase_string_combo( v_pph_phrase2, UNPROVIDED );
                              if( NIL != doneP2 && NIL != pph_sentence.pph_sentence_p( v_pph_phrase2 ) && NIL == pph_string_combo.pph_string_combo_has_sentential_forceP( combo2, force ) )
                              {
                                combo2 = pph_string_combo.pph_string_combo_add_sentential_force( combo2, force );
                              }
                              return combo2;
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$142 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values2 = Values.getValuesAsVector();
                                pph_macros.destroy_new_pph_phrases();
                                Values.restoreValuesFromVector( _values2 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$142, thread );
                              }
                            }
                          }
                          finally
                          {
                            pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_4, thread );
                            pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_1_$140, thread );
                            pph_macros.$new_pph_phrases$.rebind( _prev_bind_0_$141, thread );
                          }
                        }
                        catch( final Throwable catch_var )
                        {
                          Errors.handleThrowable( catch_var, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0_$140, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                    if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
                    {
                      Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str22$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
                    }
                  }
                  finally
                  {
                    pph_error.$pph_error_handling_onP$.rebind( _prev_bind_2, thread );
                    Errors.$continue_cerrorP$.rebind( _prev_bind_0_$137, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$143 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$143, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$136, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$135, thread );
            }
            if( new_or_reused == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$134, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$144 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values4 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values4 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$144, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$133, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 27053L)
  public static SubLObject pph_phrase_with_alternatives_for_term(final SubLObject v_term, SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject allow_morphological_variantsP,
      final SubLObject allow_nested_variantsP, SubLObject force)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw0$DEFAULT == nl_preds )
    {
      nl_preds = pph_utilities.pph_default_nl_preds( v_term, $kw15$NONE, language_mt, domain_mt );
    }
    if( $kw0$DEFAULT == force )
    {
      force = pph_utilities.pph_default_force_for_term( v_term );
    }
    final SubLObject _prev_bind_0 = pph_vars.$pph_alternative_phrase_generation_level$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_vars.$pph_search_limit$.currentBinding( thread );
    final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_alternative_phrase_generation_level$.bind( ( NIL != allow_morphological_variantsP ) ? $kw76$ALL : ( ( NIL != allow_nested_variantsP ) ? $kw77$LEXICAL_ONLY : $kw78$TOP_LEVEL_ONLY ), thread );
      pph_vars.$pph_language_mt$.bind( language_mt, thread );
      pph_vars.$pph_search_limit$.bind( ZERO_INTEGER, thread );
      pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
      final SubLObject v_pph_phrase = force.eql( $kw15$NONE ) ? pph_phrase.new_pph_phrase_for_cycl( v_term, pph_utilities.pph_identity_map(), UNPROVIDED ) : pph_sentence.new_pph_sentence( v_term, force, nl_preds );
      SubLObject doneP = NIL;
      if( NIL != pph_sentence.pph_sentence_p( v_pph_phrase ) )
      {
        pph_sentence.pph_sentence_generate( v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        doneP = pph_sentence.pph_sentence_doneP( v_pph_phrase );
      }
      else
      {
        pph_phrase.pph_phrase_set_agr_preds( v_pph_phrase, nl_preds, UNPROVIDED );
        pph_phrase_generate( v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        doneP = pph_phrase.pph_phrase_doneP( v_pph_phrase );
      }
      return Values.values( v_pph_phrase, doneP );
    }
    finally
    {
      pph_vars.$pph_domain_mt$.rebind( _prev_bind_4, thread );
      pph_vars.$pph_search_limit$.rebind( _prev_bind_3, thread );
      pph_vars.$pph_language_mt$.rebind( _prev_bind_2, thread );
      pph_vars.$pph_alternative_phrase_generation_level$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 28160L)
  public static SubLObject pph_sanitize_output_list(SubLObject output_list, SubLObject input_cycl)
  {
    SubLObject any_changeP = NIL;
    input_cycl = cycl_utilities.hl_to_el( input_cycl );
    if( NIL != el_utilities.el_formula_p( input_cycl ) )
    {
      SubLObject cdolist_list_var = output_list;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject changeP = pph_sanitize_output_item( item, input_cycl );
        if( NIL != changeP )
        {
          any_changeP = T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
    }
    if( NIL != any_changeP )
    {
      output_list = pph_phrase.consolidate_same_arg_items( output_list );
    }
    return Values.values( output_list, any_changeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 28678L)
  public static SubLObject pph_sanitize_output_item(final SubLObject item, final SubLObject input_cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position( item );
    final SubLObject output_item_cycl = pph_data_structures.pph_phrase_output_item_cycl( item );
    SubLObject changeP = NIL;
    if( NIL != pph_utilities.pph_unknown_arg_position_p( arg_position ) )
    {
      if( NIL == constant_handles.constant_p( output_item_cycl ) || !constants_high.constant_name( output_item_cycl ).equal( pph_data_structures.pph_phrase_output_item_string( item ) ) )
      {
        pph_phrase_output_item_strip_anchor_tags( item );
        if( NIL == pph_phrase.pph_unknown_cycl_p( output_item_cycl ) && NIL == pph_phrase.pph_empty_cycl_p( output_item_cycl ) )
        {
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( $str79$Setting_cycl_for__S_to__S_since_i, item, pph_phrase.pph_empty_cycl() );
            streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
          }
          pph_data_structures.pph_phrase_output_item_set_cycl( item, pph_phrase.pph_empty_cycl() );
        }
        changeP = T;
      }
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject arg = pph_utilities.pph_dereference_arg_position( input_cycl, arg_position );
      final SubLObject errorP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != errorP )
      {
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
        {
          Errors.warn( $str80$Couldn_t_dereference_arg_position, arg_position, output_item_cycl );
          streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
        }
        pph_data_structures.pph_phrase_output_item_set_arg_position( item, pph_utilities.pph_unknown_arg_position() );
        changeP = T;
      }
      else if( !function_terms.nart_to_naut( output_item_cycl ).equal( function_terms.nart_to_naut( arg ) ) )
      {
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
        {
          Errors.warn( $str81$CycL_on__S_doesn_t_match_CycL__S, item, arg );
          streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
        }
        final SubLObject conservativeP = T;
        if( NIL != conservativeP )
        {
          pph_data_structures.pph_phrase_output_item_set_arg_position( item, pph_utilities.pph_unknown_arg_position() );
          pph_phrase_output_item_strip_anchor_tags( item );
          pph_data_structures.pph_phrase_output_item_set_cycl( item, pph_phrase.pph_unknown_cycl() );
        }
        else
        {
          pph_data_structures.pph_phrase_output_item_set_cycl( item, arg );
        }
        changeP = T;
      }
    }
    return changeP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 30337L)
  public static SubLObject pph_phrase_output_item_strip_anchor_tags(final SubLObject item)
  {
    final SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag( item );
    final SubLObject new_open_tag = pph_strip_anchor_tags( open_tag );
    final SubLObject close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag( item );
    final SubLObject new_close_tag = pph_strip_anchor_tags( close_tag );
    pph_data_structures.pph_phrase_output_item_set_html_tags( item, new_open_tag, new_close_tag );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 30718L)
  public static SubLObject pph_strip_anchor_tags(final SubLObject tag)
  {
    final SubLObject stripped = pph_utilities.pph_remove_html_tags( tag, T );
    return ( NIL != string_utilities.non_empty_stringP( stripped ) ) ? stripped : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 30926L)
  public static SubLObject pph_string_for_arg_position(final SubLObject arg_position, final SubLObject output_list, SubLObject add_tagsP)
  {
    if( add_tagsP == UNPROVIDED )
    {
      add_tagsP = T;
    }
    SubLObject arg_position_items = NIL;
    SubLObject cdolist_list_var = output_list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != pph_utilities.pph_arg_position_subsumesP( pph_data_structures.pph_phrase_output_item_arg_position( item ), arg_position, UNPROVIDED ) )
      {
        arg_position_items = ConsesLow.cons( item, arg_position_items );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return pph_phrase.pph_phrase_output_list_string( Sequences.nreverse( arg_position_items ), add_tagsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 31524L)
  public static SubLObject pph_output_list_arg_position_precedesP(final SubLObject output_list, final SubLObject arg_position1, final SubLObject arg_position2)
  {
    assert NIL != pph_phrase.pph_phrase_output_list_p( output_list ) : output_list;
    SubLObject start_char_index = ZERO_INTEGER;
    SubLObject end_char_index = ZERO_INTEGER;
    final SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string( output_list, T );
    final SubLObject whole_string = pph_utilities.pph_remove_html_tags( whole_html_string, NIL );
    final SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator( output_list );
    while ( NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p( iterator ))
    {
      final SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next( iterator );
      final SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string( item, NIL );
      start_char_index = pph_macros.pph_output_list_find_start_char( raw_item_string, whole_string, end_char_index );
      if( start_char_index.numG( end_char_index ) )
      {
        final SubLObject string = pph_macros.pph_make_space_string( start_char_index, end_char_index );
        final SubLObject arg_position3 = pph_utilities.pph_unknown_arg_position();
        final SubLObject html_open_tag = NIL;
        final SubLObject html_close_tag = NIL;
        final SubLObject paranoid_arg = pph_phrase.pph_empty_cycl();
        final SubLObject output_item = pph_question.new_pph_phrase_filler_item( string );
        final SubLObject start_char_index_$147 = end_char_index;
        if( NIL != pph_utilities.pph_arg_position_subsumesP( arg_position3, arg_position1, UNPROVIDED ) )
        {
          return T;
        }
        if( NIL != pph_utilities.pph_arg_position_subsumesP( arg_position3, arg_position2, UNPROVIDED ) )
        {
          return NIL;
        }
      }
      end_char_index = pph_macros.pph_update_end_char_index( start_char_index, raw_item_string );
      final SubLObject string = pph_phrase.pph_phrase_output_item_get_string( item, NIL );
      final SubLObject arg_position3 = pph_data_structures.pph_phrase_output_item_arg_position( item );
      final SubLObject html_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag( item );
      final SubLObject html_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag( item );
      final SubLObject paranoid_arg = pph_data_structures.pph_phrase_output_item_cycl( item );
      final SubLObject output_item = item;
      if( NIL != pph_utilities.pph_arg_position_subsumesP( arg_position3, arg_position1, UNPROVIDED ) )
      {
        return T;
      }
      if( NIL != pph_utilities.pph_arg_position_subsumesP( arg_position3, arg_position2, UNPROVIDED ) )
      {
        return NIL;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 31971L)
  public static SubLObject pph_agr_pred_for_arg_position(final SubLObject arg_position, final SubLObject output_list)
  {
    SubLObject agr_pred = NIL;
    if( NIL == agr_pred )
    {
      SubLObject csome_list_var = output_list;
      SubLObject item = NIL;
      item = csome_list_var.first();
      while ( NIL == agr_pred && NIL != csome_list_var)
      {
        if( arg_position.equal( pph_data_structures.pph_phrase_output_item_arg_position( item ) ) )
        {
          agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred( item );
        }
        csome_list_var = csome_list_var.rest();
        item = csome_list_var.first();
      }
    }
    return pph_utilities.pph_peer_agr_for_pred( agr_pred, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 32502L)
  public static SubLObject generate_text_wXsentential_force(final SubLObject v_object, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject focus_arg)
  {
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = $kw0$DEFAULT;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $kw0$DEFAULT;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( focus_arg == UNPROVIDED )
    {
      focus_arg = NIL;
    }
    enforceType( v_object, $sym2$CYCL_EXPRESSION_P );
    enforceType( force, $sym58$PPH_FORCE_P );
    enforceType( nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_ );
    enforceType( language_mt, $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_ );
    enforceType( domain_mt, $sym83$KEYWORD_OR_HLMT_ );
    enforceType( mode, $sym6$KEYWORDP );
    if( NIL != focus_arg )
    {
      enforceType( focus_arg, $sym84$NON_NEGATIVE_INTEGER_P );
    }
    enforceType( v_object, $sym2$CYCL_EXPRESSION_P );
    enforceType( force, $sym58$PPH_FORCE_P );
    enforceType( nl_preds, $sym3$VALID_EXTERNAL_PPH_NL_PREDS_ );
    enforceType( language_mt, $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_ );
    return generate_text_wXsentential_force_no_checks( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 33999L)
  public static SubLObject valid_pph_language_mt_specifierP(final SubLObject obj)
  {
    return makeBoolean( NIL != pph_utilities.keyword_or_hlmtP( obj ) || ( obj.isString() && NIL != pph_utilities.get_pph_mt_for_code( obj ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 34236L)
  public static SubLObject maybe_note_bad_generate_text_result(final SubLObject v_object, final SubLObject force, final SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt,
      final SubLObject mode, final SubLObject focus_arg, final SubLObject string, final SubLObject demerits, SubLObject dict)
  {
    if( dict == UNPROVIDED )
    {
      dict = $generate_text_bad_results$.getGlobalValue();
    }
    if( demerits.isNumber() && NIL != pph_vars.pph_too_many_demerits_p( demerits, pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue() ) )
    {
      note_bad_generate_text_result( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg, string, demerits, dict );
    }
    return demerits;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 34658L)
  public static SubLObject note_bad_generate_text_result(final SubLObject v_object, final SubLObject force, final SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode,
      final SubLObject focus_arg, final SubLObject string, final SubLObject demerits, SubLObject dict)
  {
    if( dict == UNPROVIDED )
    {
      dict = $generate_text_bad_results$.getGlobalValue();
    }
    return dictionary.dictionary_enter( dict, ConsesLow.list( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg, string ), demerits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 34954L)
  public static SubLObject output_generate_text_bad_results()
  {
    recheck_generate_text_bad_results();
    dictionary_utilities.sort_dictionary_by_values( $generate_text_bad_results$.getGlobalValue(), Symbols.symbol_function( $sym91$_ ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 35120L)
  public static SubLObject output_generate_text_bad_results_to_tsv()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    recheck_generate_text_bad_results();
    final SubLObject filename = file_utilities.make_unused_temp_filename( $str92$_tmp_ );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw93$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str94$Unable_to_open__S, filename );
      }
      final SubLObject stream_$148 = stream;
      PrintLow.format( stream_$148, $str95$__Term_AForce_AParaphrase_ADemeri, new SubLObject[] { Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab,
        Characters.CHAR_tab, Characters.CHAR_tab, Characters.CHAR_tab
      } );
      SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values( $generate_text_bad_results$.getGlobalValue(), Symbols.symbol_function( $sym91$_ ) );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject key = NIL;
        SubLObject demerits = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
        key = current.first();
        current = ( demerits = current.rest() );
        SubLObject current_$150;
        final SubLObject datum_$149 = current_$150 = key;
        SubLObject v_term = NIL;
        SubLObject force = NIL;
        SubLObject nl_preds = NIL;
        SubLObject language_mt = NIL;
        SubLObject domain_mt = NIL;
        SubLObject mode = NIL;
        SubLObject focus_arg = NIL;
        SubLObject string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$150, datum_$149, $list97 );
        v_term = current_$150.first();
        current_$150 = current_$150.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$150, datum_$149, $list97 );
        force = current_$150.first();
        current_$150 = current_$150.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$150, datum_$149, $list97 );
        nl_preds = current_$150.first();
        current_$150 = current_$150.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$150, datum_$149, $list97 );
        language_mt = current_$150.first();
        current_$150 = current_$150.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$150, datum_$149, $list97 );
        domain_mt = current_$150.first();
        current_$150 = current_$150.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$150, datum_$149, $list97 );
        mode = current_$150.first();
        current_$150 = current_$150.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$150, datum_$149, $list97 );
        focus_arg = current_$150.first();
        current_$150 = current_$150.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$150, datum_$149, $list97 );
        string = current_$150.first();
        current_$150 = current_$150.rest();
        if( NIL == current_$150 )
        {
          final SubLObject line = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( v_term ), new SubLObject[] { format_nil.format_nil_a_no_copy( Characters.CHAR_tab ), format_nil.format_nil_s_no_copy( force ),
            format_nil.format_nil_a_no_copy( Characters.CHAR_tab ), format_nil.format_nil_s_no_copy( string ), format_nil.format_nil_a_no_copy( Characters.CHAR_tab ), format_nil.format_nil_d_no_copy( demerits ),
            format_nil.format_nil_a_no_copy( Characters.CHAR_tab ), format_nil.format_nil_s_no_copy( nl_preds ), format_nil.format_nil_a_no_copy( Characters.CHAR_tab ), format_nil.format_nil_s_no_copy( language_mt ),
            format_nil.format_nil_a_no_copy( Characters.CHAR_tab ), format_nil.format_nil_s_no_copy( domain_mt ), format_nil.format_nil_a_no_copy( Characters.CHAR_tab ), format_nil.format_nil_s_no_copy( mode ),
            format_nil.format_nil_a_no_copy( Characters.CHAR_tab ), format_nil.format_nil_s_no_copy( focus_arg )
          } );
          PrintLow.format( stream_$148, $str98$___A__, Sequences.remove( Characters.CHAR_newline, Sequences.remove( Characters.CHAR_return, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
              UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$149, $list97 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 35973L)
  public static SubLObject recheck_generate_text_bad_results()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject total = dictionary.dictionary_length( $generate_text_bad_results$.getGlobalValue() );
    SubLObject done_count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str99$Rechecking_generate_text_bad_resu );
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( dictionary_utilities.copy_dictionary( $generate_text_bad_results$
            .getGlobalValue() ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject demerits = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject current;
          final SubLObject datum = current = key;
          SubLObject v_object = NIL;
          SubLObject force = NIL;
          SubLObject nl_preds = NIL;
          SubLObject language_mt = NIL;
          SubLObject domain_mt = NIL;
          SubLObject mode = NIL;
          SubLObject focus_arg = NIL;
          SubLObject string = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
          v_object = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
          force = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
          nl_preds = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
          language_mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
          domain_mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
          mode = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
          focus_arg = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
          string = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == cycl_utilities.expression_find_if( $sym101$INVALID_FORT_, v_object, T, UNPROVIDED ) && NIL == cycl_utilities.expression_find_if( $sym101$INVALID_FORT_, language_mt, T, UNPROVIDED )
                && NIL == cycl_utilities.expression_find_if( $sym101$INVALID_FORT_, domain_mt, T, UNPROVIDED ) && NIL == assertions_high.invalid_assertionP( v_object, UNPROVIDED ) )
            {
              thread.resetMultipleValues();
              final SubLObject new_string = generate_text_wXsentential_force_no_checks( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg );
              final SubLObject pred = thread.secondMultipleValue();
              final SubLObject just = thread.thirdMultipleValue();
              final SubLObject olist = thread.fourthMultipleValue();
              final SubLObject new_demerits = thread.fifthMultipleValue();
              thread.resetMultipleValues();
              maybe_note_bad_generate_text_result( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg, new_string, new_demerits, new_dictionary );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
          }
          done_count = Numbers.add( done_count, ONE_INTEGER );
          utilities_macros.note_percent_progress( done_count, total );
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      }
      finally
      {
        final SubLObject _prev_bind_0_$151 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$151, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    $generate_text_bad_results$.setGlobalValue( new_dictionary );
    return $generate_text_bad_results$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 37130L)
  public static SubLObject generate_text_wXsentential_force_no_checks(final SubLObject v_object, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject focus_arg)
  {
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = $kw0$DEFAULT;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $kw0$DEFAULT;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( focus_arg == UNPROVIDED )
    {
      focus_arg = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw0$DEFAULT == language_mt )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue( thread );
    }
    if( language_mt.isString() )
    {
      language_mt = pph_utilities.pph_language_mt_from_code( language_mt );
    }
    if( $kw0$DEFAULT == domain_mt )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue( thread );
    }
    if( $kw0$DEFAULT == force )
    {
      force = pph_utilities.pph_default_force_for_term( v_object );
    }
    if( $kw0$DEFAULT == nl_preds )
    {
      nl_preds = pph_utilities.pph_default_nl_preds( v_object, force, language_mt, domain_mt );
    }
    SubLObject error_message = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_root_phrase$.currentBinding( thread );
    try
    {
      pph_vars.$pph_root_phrase$.bind( misc_utilities.uninitialized(), thread );
      SubLObject string = NIL;
      SubLObject pred = NIL;
      SubLObject just = NIL;
      SubLObject olist = NIL;
      SubLObject demerits = NIL;
      final SubLObject _prev_bind_0_$152 = Errors.$continue_cerrorP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
      try
      {
        Errors.$continue_cerrorP$.bind( NIL, thread );
        pph_error.$pph_error_handling_onP$.bind( T, thread );
        if( NIL != pph_error.pph_break_on_errorP() )
        {
          final SubLObject _prev_bind_0_$153 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
          try
          {
            pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$154 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
            try
            {
              pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
              final SubLObject reuseP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              try
              {
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$155 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                try
                {
                  pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                  final SubLObject new_or_reused = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$156 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                    final SubLObject _prev_bind_0_$157 = memoization_state.$memoization_state$.currentBinding( thread );
                    try
                    {
                      memoization_state.$memoization_state$.bind( local_state, thread );
                      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                      try
                      {
                        final SubLObject _prev_bind_0_$158 = pph_vars.$pph_track_discourse_referentsP$.currentBinding( thread );
                        try
                        {
                          pph_vars.$pph_track_discourse_referentsP$.bind( makeBoolean( NIL != pph_vars.$pph_track_discourse_referentsP$.getDynamicValue( thread ) && NIL == pph_discourse_referent_tracking_pointlessP(
                              v_object ) ), thread );
                          SubLObject time = NIL;
                          final SubLObject time_var = Time.get_internal_real_time();
                          if( $kw74$ANY == nl_preds )
                          {
                            thread.resetMultipleValues();
                            final SubLObject string_$159 = generate_text_wXsentential_force_int( v_object, force, $kw74$ANY, language_mt, domain_mt, mode, focus_arg );
                            final SubLObject pred_$160 = thread.secondMultipleValue();
                            final SubLObject just_$161 = thread.thirdMultipleValue();
                            final SubLObject olist_$162 = thread.fourthMultipleValue();
                            final SubLObject demerits_$163 = thread.fifthMultipleValue();
                            thread.resetMultipleValues();
                            string = string_$159;
                            pred = pred_$160;
                            just = just_$161;
                            olist = olist_$162;
                            demerits = demerits_$163;
                          }
                          else
                          {
                            final SubLObject _prev_bind_0_$159 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
                            try
                            {
                              pph_vars.$pph_demerit_cutoff$.bind( pph_macros.compute_new_pph_demerit_cutoff( TWO_INTEGER ), thread );
                              thread.resetMultipleValues();
                              final SubLObject string_$160 = generate_text_wXsentential_force_int( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg );
                              final SubLObject pred_$161 = thread.secondMultipleValue();
                              final SubLObject just_$162 = thread.thirdMultipleValue();
                              final SubLObject olist_$163 = thread.fourthMultipleValue();
                              final SubLObject demerits_$164 = thread.fifthMultipleValue();
                              thread.resetMultipleValues();
                              string = string_$160;
                              pred = pred_$161;
                              just = just_$162;
                              olist = olist_$163;
                              demerits = demerits_$164;
                            }
                            finally
                            {
                              pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0_$159, thread );
                            }
                            if( NIL == string && NIL == number_utilities.potentially_infinite_number_LE( pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread ), pph_vars.$pph_suggested_demerit_cutoff$
                                .getGlobalValue() ) )
                            {
                              thread.resetMultipleValues();
                              final SubLObject string_$161 = generate_text_wXsentential_force_int( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg );
                              final SubLObject pred_$162 = thread.secondMultipleValue();
                              final SubLObject just_$163 = thread.thirdMultipleValue();
                              final SubLObject olist_$164 = thread.fourthMultipleValue();
                              final SubLObject demerits_$165 = thread.fifthMultipleValue();
                              thread.resetMultipleValues();
                              string = string_$161;
                              pred = pred_$162;
                              just = just_$163;
                              olist = olist_$164;
                              demerits = demerits_$165;
                            }
                          }
                          time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                          if( time.numG( ONE_INTEGER ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
                          {
                            Errors.warn( $str102$Took__S_seconds_to_paraphrase____, time, v_object );
                            streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
                          }
                        }
                        finally
                        {
                          pph_vars.$pph_track_discourse_referentsP$.rebind( _prev_bind_0_$158, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$160 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$160, thread );
                        }
                      }
                    }
                    finally
                    {
                      memoization_state.$memoization_state$.rebind( _prev_bind_0_$157, thread );
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$156, thread );
                  }
                  if( new_or_reused == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                  {
                    memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                  }
                }
                finally
                {
                  pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$155, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$161 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL == reuseP )
                  {
                    pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$161, thread );
                }
              }
            }
            finally
            {
              pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$154, thread );
            }
          }
          finally
          {
            pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$153, thread );
          }
        }
        else
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$162 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym21$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                final SubLObject _prev_bind_0_$163 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                try
                {
                  pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$164 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                    final SubLObject reuseP2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try
                    {
                      thread.resetMultipleValues();
                      final SubLObject _prev_bind_0_$165 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                      try
                      {
                        pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                        final SubLObject new_or_reused2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$166 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                        try
                        {
                          pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                          final SubLObject local_state2 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                          final SubLObject _prev_bind_0_$167 = memoization_state.$memoization_state$.currentBinding( thread );
                          try
                          {
                            memoization_state.$memoization_state$.bind( local_state2, thread );
                            final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
                            try
                            {
                              final SubLObject _prev_bind_0_$168 = pph_vars.$pph_track_discourse_referentsP$.currentBinding( thread );
                              try
                              {
                                pph_vars.$pph_track_discourse_referentsP$.bind( makeBoolean( NIL != pph_vars.$pph_track_discourse_referentsP$.getDynamicValue( thread )
                                    && NIL == pph_discourse_referent_tracking_pointlessP( v_object ) ), thread );
                                SubLObject time2 = NIL;
                                final SubLObject time_var2 = Time.get_internal_real_time();
                                if( $kw74$ANY == nl_preds )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject string_$162 = generate_text_wXsentential_force_int( v_object, force, $kw74$ANY, language_mt, domain_mt, mode, focus_arg );
                                  final SubLObject pred_$163 = thread.secondMultipleValue();
                                  final SubLObject just_$164 = thread.thirdMultipleValue();
                                  final SubLObject olist_$165 = thread.fourthMultipleValue();
                                  final SubLObject demerits_$166 = thread.fifthMultipleValue();
                                  thread.resetMultipleValues();
                                  string = string_$162;
                                  pred = pred_$163;
                                  just = just_$164;
                                  olist = olist_$165;
                                  demerits = demerits_$166;
                                }
                                else
                                {
                                  final SubLObject _prev_bind_0_$169 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
                                  try
                                  {
                                    pph_vars.$pph_demerit_cutoff$.bind( pph_macros.compute_new_pph_demerit_cutoff( TWO_INTEGER ), thread );
                                    thread.resetMultipleValues();
                                    final SubLObject string_$163 = generate_text_wXsentential_force_int( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg );
                                    final SubLObject pred_$164 = thread.secondMultipleValue();
                                    final SubLObject just_$165 = thread.thirdMultipleValue();
                                    final SubLObject olist_$166 = thread.fourthMultipleValue();
                                    final SubLObject demerits_$167 = thread.fifthMultipleValue();
                                    thread.resetMultipleValues();
                                    string = string_$163;
                                    pred = pred_$164;
                                    just = just_$165;
                                    olist = olist_$166;
                                    demerits = demerits_$167;
                                  }
                                  finally
                                  {
                                    pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0_$169, thread );
                                  }
                                  if( NIL == string && NIL == number_utilities.potentially_infinite_number_LE( pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread ), pph_vars.$pph_suggested_demerit_cutoff$
                                      .getGlobalValue() ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject string_$164 = generate_text_wXsentential_force_int( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg );
                                    final SubLObject pred_$165 = thread.secondMultipleValue();
                                    final SubLObject just_$166 = thread.thirdMultipleValue();
                                    final SubLObject olist_$167 = thread.fourthMultipleValue();
                                    final SubLObject demerits_$168 = thread.fifthMultipleValue();
                                    thread.resetMultipleValues();
                                    string = string_$164;
                                    pred = pred_$165;
                                    just = just_$166;
                                    olist = olist_$167;
                                    demerits = demerits_$168;
                                  }
                                }
                                time2 = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var2 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                                if( time2.numG( ONE_INTEGER ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
                                {
                                  Errors.warn( $str102$Took__S_seconds_to_paraphrase____, time2, v_object );
                                  streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
                                }
                              }
                              finally
                              {
                                pph_vars.$pph_track_discourse_referentsP$.rebind( _prev_bind_0_$168, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$170 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values3 = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
                                Values.restoreValuesFromVector( _values3 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$170, thread );
                              }
                            }
                          }
                          finally
                          {
                            memoization_state.$memoization_state$.rebind( _prev_bind_0_$167, thread );
                          }
                        }
                        finally
                        {
                          pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$166, thread );
                        }
                        if( new_or_reused2 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                        {
                          memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                        }
                      }
                      finally
                      {
                        pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$165, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$171 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values4 = Values.getValuesAsVector();
                        if( NIL == reuseP2 )
                        {
                          pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                        }
                        Values.restoreValuesFromVector( _values4 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$171, thread );
                      }
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$164, thread );
                  }
                }
                finally
                {
                  pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$163, thread );
                }
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$162, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str22$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
          }
        }
      }
      finally
      {
        pph_error.$pph_error_handling_onP$.rebind( _prev_bind_2, thread );
        Errors.$continue_cerrorP$.rebind( _prev_bind_0_$152, thread );
      }
      maybe_note_bad_generate_text_result( v_object, force, nl_preds, language_mt, domain_mt, mode, focus_arg, string, demerits, UNPROVIDED );
      return Values.values( string, pred, just, olist, demerits, ( NIL != pph_data_structures.valid_pph_phrase_p( pph_vars.$pph_root_phrase$.getDynamicValue( thread ) ) ) ? pph_vars.$pph_root_phrase$.getDynamicValue(
          thread ) : NIL );
    }
    finally
    {
      pph_vars.$pph_root_phrase$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 39439L)
  public static SubLObject pph_discourse_referent_tracking_pointlessP(final SubLObject v_object)
  {
    if( pph_vars.current_generation_level().isPositive() )
    {
      return NIL;
    }
    if( NIL != assertion_handles.assertion_p( v_object ) )
    {
      return NIL;
    }
    if( NIL != nart_handles.nart_p( v_object ) )
    {
      return NIL;
    }
    if( NIL != el_utilities.el_formula_p( v_object ) )
    {
      return NIL;
    }
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str103$__Suspending_discourse_referent_t, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 39903L)
  public static SubLObject generate_text_wXsentential_force_int(final SubLObject formula, final SubLObject force, final SubLObject nl_preds, final SubLObject language_mt, final SubLObject domain_mt,
      final SubLObject mode, SubLObject focus_arg)
  {
    if( focus_arg == UNPROVIDED )
    {
      focus_arg = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject string = NIL;
    SubLObject result_agr_pred = NIL;
    SubLObject justification = NIL;
    SubLObject output_list = NIL;
    SubLObject demerits = NIL;
    final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
    try
    {
      pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
      pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
      pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
      try
      {
        final SubLObject hl_formula = pph_utilities.pph_nart_substitute( formula );
        final SubLObject v_pph_phrase = ( force == $kw15$NONE ) ? pph_data_structures.new_pph_phrase( NIL, hl_formula, UNPROVIDED )
            : pph_sentence.pph_sentence_copy( pph_sentence.new_pph_sentence( hl_formula, force, nl_preds ), UNPROVIDED );
        final SubLObject _prev_bind_0_$202 = pph_vars.$pph_phrase_methods$.currentBinding( thread );
        try
        {
          pph_vars.$pph_phrase_methods$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
          pph_vars.$pph_root_phrase$.setDynamicValue( v_pph_phrase, thread );
          if( force == $kw15$NONE )
          {
            pph_phrase.pph_phrase_set_agr_preds( v_pph_phrase, nl_preds, UNPROVIDED );
            pph_phrase_generate( v_pph_phrase, language_mt, domain_mt, mode );
          }
          else
          {
            pph_phrase.pph_phrase_set_focus_arg( v_pph_phrase, focus_arg );
            pph_sentence.pph_sentence_generate( v_pph_phrase, language_mt, domain_mt, mode );
          }
          if( NIL != pph_phrase.pph_phrase_doneP( v_pph_phrase ) )
          {
            string = pph_string.pph_string_if_non_null_to_output_format( pph_phrase.pph_phrase_string( v_pph_phrase, UNPROVIDED ), mode );
            result_agr_pred = pph_phrase.pph_phrase_agr_pred( v_pph_phrase );
            justification = pph_phrase.pph_phrase_justification( v_pph_phrase );
            output_list = pph_phrase.pph_phrase_output_list( v_pph_phrase );
            demerits = pph_phrase.pph_phrase_demerits( v_pph_phrase );
          }
        }
        finally
        {
          pph_vars.$pph_phrase_methods$.rebind( _prev_bind_0_$202, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$203 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          pph_macros.destroy_new_pph_phrases();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$203, thread );
        }
      }
    }
    finally
    {
      pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
      pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_2, thread );
      pph_macros.$new_pph_phrases$.rebind( _prev_bind_0, thread );
    }
    return Values.values( string, result_agr_pred, justification, output_list, demerits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 41153L)
  public static SubLObject generate_text_wXsentential_force_and_focus_argnum(final SubLObject formula, final SubLObject focus_arg, SubLObject force, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt,
      SubLObject mode)
  {
    if( force == UNPROVIDED )
    {
      force = $kw0$DEFAULT;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = $kw0$DEFAULT;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $kw0$DEFAULT;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    return generate_text_wXsentential_force( formula, force, nl_preds, language_mt, domain_mt, mode, focus_arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 41977L)
  public static SubLObject generate_text(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject focus_arg)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw1$TEXT;
    }
    if( focus_arg == UNPROVIDED )
    {
      focus_arg = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != pph_utilities.valid_external_pph_nl_predsP( nl_preds ) : nl_preds;
    thread.resetMultipleValues();
    final SubLObject forceless_string = generate_phrase_no_checks( v_object, nl_preds, NIL, language_mt, domain_mt, mode, T, focus_arg );
    final SubLObject pred = thread.secondMultipleValue();
    final SubLObject just = thread.thirdMultipleValue();
    final SubLObject forceless_olist = thread.fourthMultipleValue();
    final SubLObject demerits = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    final SubLObject olist = conses_high.copy_list( forceless_olist );
    if( NIL != forceless_string )
    {
      pph_phrase_resolution.pph_phrase_output_list_add_sentential_force( olist, $kw104$DECLARATIVE );
    }
    final SubLObject string = pph_string.pph_string_if_non_null_to_output_format( pph_phrase.pph_phrase_output_list_string( olist, T ), mode );
    return Values.values( string, pred, just, olist, demerits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 42921L)
  public static SubLObject generate_poss(final SubLObject v_object, SubLObject nl_preds)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject string = generate_phrase_no_checks( v_object, nl_preds, NIL, pph_vars.$pph_language_mt$.getDynamicValue( thread ), pph_vars.$pph_domain_mt$.getDynamicValue( thread ), pph_vars.$paraphrase_mode$
        .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    final SubLObject pred = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return morphology.possessivize_string( string, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 43257L)
  public static SubLObject pph_phrase_generate_string_from_cycl(final SubLObject cycl, SubLObject nl_preds, SubLObject arg_position_map)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw0$DEFAULT;
    }
    if( arg_position_map == UNPROVIDED )
    {
      arg_position_map = pph_utilities.pph_new_identity_map();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject string = NIL;
    SubLObject agr_pred = NIL;
    SubLObject justification = NIL;
    SubLObject output_list = NIL;
    if( $kw0$DEFAULT == nl_preds )
    {
      nl_preds = pph_utilities.pph_default_nl_preds( cycl, $kw15$NONE, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding( thread );
    try
    {
      pph_macros.$new_pph_phrases$.bind( stacks.create_stack(), thread );
      pph_macros.$new_pph_phrase_count$.bind( pph_macros.get_new_pph_phrase_count(), thread );
      pph_macros.$destroy_new_pph_phrasesP$.bind( T, thread );
      try
      {
        final SubLObject phrase = pph_phrase.pph_phrase_copy( pph_phrase.new_pph_phrase_for_cycl( cycl, arg_position_map, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
        {
          format_nil.force_format( T, $str105$__Making_new_phrase_with_cycl__S_, pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        pph_phrase.pph_phrase_set_agr_preds( phrase, nl_preds, UNPROVIDED );
        final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope( phrase );
        try
        {
          pph_phrase_generate( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          final SubLObject _prev_bind_0_$204 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped( phrase, save_cycl, UNPROVIDED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$204, thread );
          }
        }
        if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
        {
          string = pph_phrase.pph_phrase_string( phrase, UNPROVIDED );
          agr_pred = pph_phrase.pph_phrase_agr_pred( phrase );
          justification = pph_phrase.pph_phrase_justification( phrase );
          output_list = pph_phrase.pph_phrase_output_list( phrase );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$205 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          pph_macros.destroy_new_pph_phrases();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$205, thread );
        }
      }
    }
    finally
    {
      pph_macros.$destroy_new_pph_phrasesP$.rebind( _prev_bind_3, thread );
      pph_macros.$new_pph_phrase_count$.rebind( _prev_bind_2, thread );
      pph_macros.$new_pph_phrases$.rebind( _prev_bind_0, thread );
    }
    return Values.values( string, agr_pred, justification, output_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 44466L)
  public static SubLObject set_pph_initialized()
  {
    $pph_initializedP$.setGlobalValue( $kw107$INITIALIZED );
    return $pph_initializedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 44578L)
  public static SubLObject pph_initializedP()
  {
    return list_utilities.sublisp_boolean( $pph_initializedP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 44652L)
  public static SubLObject ensure_pph_initialized()
  {
    if( NIL != pph_initializedP() )
    {
      return $kw107$INITIALIZED;
    }
    return initialize_paraphrase_cycl();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 44888L)
  public static SubLObject initialize_paraphrase_cycl()
  {
    if( NIL != control_vars.kb_loaded() )
    {
      pph_vars.initialize_pph_vars();
      pph_templates.initialize_gen_template_store();
      clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
      $pph_initializedP$.setGlobalValue( T );
      return $kw107$INITIALIZED;
    }
    final SubLObject new_format_string = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
        $str108$No_KB_loaded__Couldn_t_initialize )
    } );
    pph_error.pph_handle_error( new_format_string, ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ) );
    return $kw109$NO_KB_LOADED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 45254L)
  public static SubLObject clear_paraphrase_caches(SubLObject source, SubLObject assertion)
  {
    if( source == UNPROVIDED )
    {
      source = NIL;
    }
    if( assertion == UNPROVIDED )
    {
      assertion = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
    {
      memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
    }
    pph_methods.clear_pph_methods_caches();
    pph_methods_formulas.clear_quant_over_arg_tuples();
    lexicon_accessors.clear_cached_lexical_access_functions();
    pph_methods_lexicon.clear_pph_arg_in_reln_preds();
    pph_utilities.clear_pph_english_contextP();
    pph_utilities.clear_pph_prefer_assertionP();
    pph_utilities.clear_pph_nl_generation_predP();
    pph_methods.clear_pph_enhanced_domain_mt();
    return NIL;
  }

  @SubL(source = "cycl/pph-main.lisp", position = 46012L)
  public static SubLObject pph_phrase_generate(SubLObject phrase, SubLObject language_mt, SubLObject domain_mt, SubLObject mode)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = NIL != pph_vars.$pph_language_mt$.getDynamicValue() ? pph_vars.$pph_language_mt$.getDynamicValue() : $const112$EnglishParaphraseMt;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL != pph_vars.$pph_domain_mt$.getDynamicValue() ? pph_vars.$pph_domain_mt$.getDynamicValue() : $const112$EnglishParaphraseMt;
    }
    if( mode == UNPROVIDED )
    {
      mode = NIL != pph_vars.$paraphrase_mode$.getDynamicValue() ? pph_vars.$paraphrase_mode$.getDynamicValue() : $kw1$TEXT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = wff_utilities.$check_arityP$.currentBinding( thread );
    final SubLObject _prev_bind_12 = pph_vars.$generation_level$.currentBinding( thread );
    final SubLObject _prev_bind_13 = pph_vars.$pph_use_expansions_for_precisionP$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( NIL, thread );
      wff_utilities.$check_arg_typesP$.bind( NIL, thread );
      at_vars.$at_check_arg_typesP$.bind( NIL, thread );
      wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
      wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
      wff_utilities.$check_var_typesP$.bind( NIL, thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      wff_vars.$validate_constantsP$.bind( NIL, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      wff_utilities.$check_arityP$.bind( T, thread );
      pph_vars.$generation_level$.bind( number_utilities.f_1X( pph_vars.current_generation_level() ), thread );
      pph_vars.$pph_use_expansions_for_precisionP$.bind( pph_vars.$pph_use_expansions_for_precisionP$.getDynamicValue( thread ), thread );
      Object error_message = NIL;
      final SubLObject _prev_bind_0_$206 = Errors.$continue_cerrorP$.currentBinding( thread );
      final SubLObject _prev_bind_1_$207 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
      try
      {
        Errors.$continue_cerrorP$.bind( NIL, thread );
        pph_error.$pph_error_handling_onP$.bind( T, thread );
        SubLObject ccatch_env_var;
        SubLObject catch_var;
        SubLObject mapped_string;
        SubLObject _prev_bind_0_$244;
        SubLObject old_pph_vars;
        SubLObject _prev_bind_0_$245;
        SubLObject _prev_bind_1_$246;
        SubLObject _prev_bind_2_$247;
        SubLObject _prev_bind_0_$278;
        SubLObject _values;
        SubLObject local_vars;
        SubLObject _prev_bind_0_$250;
        SubLObject _prev_bind_1_$251;
        SubLObject _prev_bind_2_$252;
        SubLObject _prev_bind_3_$253;
        SubLObject _prev_bind_4_$254;
        SubLObject _prev_bind_0_$265;
        SubLObject _prev_bind_0_$276;
        SubLObject _values_$277;
        SubLObject new_format_string;
        SubLObject _prev_bind_0_$268;
        SubLObject reuseP;
        SubLObject _prev_bind_0_$274;
        SubLObject _values_$275;
        SubLObject _prev_bind_0_$270;
        SubLObject local_state;
        SubLObject _prev_bind_0_$271;
        SubLObject original_memoization_process;
        SubLObject _prev_bind_0_$272;
        if( NIL != pph_error.pph_break_on_errorP() )
        {
          ccatch_env_var = pph_utilities.pph_phrase_rephrase_cycl( phrase, UNPROVIDED, UNPROVIDED );
          catch_var = pph_macros.pph_mapped_string_for_term( ccatch_env_var );
          mapped_string = pph_vars.$pph_var_types$.currentBinding( thread );
          try
          {
            pph_vars.$pph_var_types$.bind( NIL != dictionary.dictionary_p( pph_vars.$pph_var_types$.getDynamicValue( thread ) ) ? pph_vars.$pph_var_types$.getDynamicValue( thread )
                : dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ), thread );
            _prev_bind_0_$244 = pph_variable_handling.pph_registered_vars();
            old_pph_vars = pph_variable_handling.$pph_different_vars$.currentBinding( thread );
            _prev_bind_0_$245 = pph_vars.$pph_noted_var_types$.currentBinding( thread );
            _prev_bind_1_$246 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding( thread );
            try
            {
              pph_variable_handling.$pph_different_vars$.bind( pph_variable_handling.$pph_different_vars$.getDynamicValue( thread ), thread );
              pph_vars.$pph_noted_var_types$.bind( NIL != dictionary.dictionary_p( pph_vars.$pph_noted_var_types$.getDynamicValue( thread ) ) ? pph_vars.$pph_noted_var_types$.getDynamicValue( thread )
                  : dictionary.new_dictionary( Symbols.symbol_function( EQL ), SIXTEEN_INTEGER ), thread );
              pph_vars.$pph_possibly_binding_variables_counter$.bind( number_utilities.f_1X( pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue( thread ) ), thread );
              if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
              {
                format_nil.force_format( T, $str113$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue( thread ), dictionary.dictionary_values( pph_vars.$pph_var_types$
                    .getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              boolean arg10925 = false;
              try
              {
                arg10925 = true;
                if( NIL != catch_var )
                {
                  if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                  {
                    format_nil.force_format( T, $str114$__Using_mapped_string__S_for__S__, catch_var, ccatch_env_var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  pph_phrase.pph_phrase_set_string( phrase, catch_var );
                  if( pph_phrase.pph_phrase_category( phrase, UNPROVIDED ).eql( $const115$PossessivePhrase ) )
                  {
                    possessivize_pph_phrase( phrase );
                    arg10925 = false;
                  }
                  else
                  {
                    arg10925 = false;
                  }
                }
                else if( pph_vars.current_generation_level().numG( $pph_recursion_limit$.getGlobalValue() ) )
                {
                  _prev_bind_2_$247 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
                      $str116$Recursion_limit_exceeded_on__S_ )
                  } );
                  pph_error.pph_handle_error( _prev_bind_2_$247, ConsesLow.list( pph_vars.pph_top_level_cycl() ) );
                  arg10925 = false;
                }
                else
                {
                  pph_phrase.pph_phrase_set_absolute_agr_from_phrase( phrase );
                  if( NIL == pph_phrase.pph_phrase_impossible_p( phrase, T ) )
                  {
                    if( NIL != pph_phrase.pph_phrase_has_known_cyclP( phrase ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                    {
                      format_nil.force_format( T, $str117$__Paraphrasing__S_with_agr___S___, ccatch_env_var, pph_phrase.pph_phrase_agr( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    _prev_bind_2_$247 = pph_utilities.$pph_current_environment$.currentBinding( thread );
                    try
                    {
                      pph_utilities.$pph_current_environment$.bind( pph_utilities.find_or_create_pph_context(), thread );
                      pph_utilities.pph_push_environment( $kw118$GENERATE );
                      boolean arg19616 = false;
                      try
                      {
                        arg19616 = true;
                        pph_utilities.pph_phrase_maybe_mark_type_level_violation( phrase );
                        arg19616 = false;
                      }
                      finally
                      {
                        if( arg19616 )
                        {
                          final SubLObject _prev_bind_0_$213 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values1 = Values.getValuesAsVector();
                            final SubLObject _prev_bind_0_$214 = pph_vars.$pph_language_mt$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$215 = pph_vars.$pph_domain_mt$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$216 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
                            final SubLObject _prev_bind_3_$217 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                            final SubLObject _prev_bind_4_$218 = pph_vars.$pph_type_level_violations$.currentBinding( thread );
                            try
                            {
                              pph_vars.$pph_language_mt$.bind( language_mt, thread );
                              pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
                              lexicon_vars.$lexicon_lookup_mt$.bind( pph_vars.$pph_language_mt$.getDynamicValue( thread ), thread );
                              pph_vars.$paraphrase_mode$.bind( mode, thread );
                              pph_vars.$pph_type_level_violations$.bind( NIL != set.set_p( pph_vars.$pph_type_level_violations$.getDynamicValue( thread ) ) ? pph_vars.$pph_type_level_violations$.getDynamicValue( thread )
                                  : pph_utilities.pph_type_level_violations( ccatch_env_var ), thread );
                              SubLObject _prev_bind_0_$229;
                              SubLObject _prev_bind_0_$2401;
                              SubLObject _values_$2411;
                              SubLObject new_format_string1;
                              SubLObject _prev_bind_0_$232;
                              SubLObject reuseP1;
                              SubLObject _prev_bind_0_$2381;
                              SubLObject _values_$2391;
                              SubLObject _prev_bind_0_$234;
                              SubLObject local_state1;
                              SubLObject _prev_bind_0_$235;
                              SubLObject original_memoization_process1;
                              SubLObject _prev_bind_0_$2361;
                              if( NIL != pph_macros.pph_discourse_context_initializedP() )
                              {
                                pph_drs.pph_ensure_discourse_participant_rms();
                                _prev_bind_0_$229 = misc_utilities.initialized_p( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) );
                                _prev_bind_0_$2401 = pph_vars.$pph_unexpressed_negations$.currentBinding( thread );
                                try
                                {
                                  pph_vars.$pph_unexpressed_negations$.bind( NIL != _prev_bind_0_$229 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread )
                                      : set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                                  _values_$2411 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                                  try
                                  {
                                    pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                                    thread.resetMultipleValues();
                                    new_format_string1 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                                    try
                                    {
                                      pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                                      _prev_bind_0_$232 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      boolean arg18634 = false;
                                      try
                                      {
                                        arg18634 = true;
                                        thread.resetMultipleValues();
                                        reuseP1 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                                        try
                                        {
                                          pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                                          _prev_bind_0_$2381 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          _values_$2391 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                                          try
                                          {
                                            pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                                            _prev_bind_0_$234 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                                            local_state1 = memoization_state.$memoization_state$.currentBinding( thread );
                                            try
                                            {
                                              memoization_state.$memoization_state$.bind( _prev_bind_0_$234, thread );
                                              _prev_bind_0_$235 = memoization_state.memoization_state_original_process( _prev_bind_0_$234 );
                                              boolean arg19475 = false;
                                              try
                                              {
                                                arg19475 = true;
                                                pph_phrase_generate_1( phrase );
                                                arg19475 = false;
                                              }
                                              finally
                                              {
                                                if( arg19475 )
                                                {
                                                  final SubLObject _prev_bind_0_$2251 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                  try
                                                  {
                                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                    final SubLObject _values_$2261 = Values.getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process( _prev_bind_0_$234, _prev_bind_0_$235 );
                                                    Values.restoreValuesFromVector( _values_$2261 );
                                                  }
                                                  finally
                                                  {
                                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2251, thread );
                                                  }
                                                }
                                              }
                                              original_memoization_process1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                              try
                                              {
                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                _prev_bind_0_$2361 = Values.getValuesAsVector();
                                                memoization_state.memoization_state_possibly_clear_original_process( _prev_bind_0_$234, _prev_bind_0_$235 );
                                                Values.restoreValuesFromVector( _prev_bind_0_$2361 );
                                              }
                                              finally
                                              {
                                                Threads.$is_thread_performing_cleanupP$.rebind( original_memoization_process1, thread );
                                              }
                                            }
                                            finally
                                            {
                                              memoization_state.$memoization_state$.rebind( local_state1, thread );
                                            }
                                          }
                                          finally
                                          {
                                            pph_macros.$pph_external_memoization_state$.rebind( _values_$2391, thread );
                                          }
                                          if( _prev_bind_0_$2381 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                                          {
                                            memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                                          }
                                        }
                                        finally
                                        {
                                          pph_macros.$pph_memoization_state$.rebind( reuseP1, thread );
                                        }
                                        arg18634 = false;
                                      }
                                      finally
                                      {
                                        if( arg18634 )
                                        {
                                          final SubLObject _prev_bind_0_$2271 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                          try
                                          {
                                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                            final SubLObject _values_$2281 = Values.getValuesAsVector();
                                            if( NIL == _prev_bind_0_$232 )
                                            {
                                              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                            }
                                            Values.restoreValuesFromVector( _values_$2281 );
                                          }
                                          finally
                                          {
                                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2271, thread );
                                          }
                                        }
                                      }
                                      reuseP1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                      try
                                      {
                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                        _prev_bind_0_$2381 = Values.getValuesAsVector();
                                        if( NIL == _prev_bind_0_$232 )
                                        {
                                          pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                        }
                                        Values.restoreValuesFromVector( _prev_bind_0_$2381 );
                                      }
                                      finally
                                      {
                                        Threads.$is_thread_performing_cleanupP$.rebind( reuseP1, thread );
                                      }
                                    }
                                    finally
                                    {
                                      pph_macros.$pph_problem_store_pointer$.rebind( new_format_string1, thread );
                                    }
                                  }
                                  finally
                                  {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind( _values_$2411, thread );
                                  }
                                  if( NIL == _prev_bind_0_$229 && NIL == set.set_emptyP( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) )
                                  {
                                    _values_$2411 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
                                        $str119$Abandoning_unexpressed_negations_ )
                                    } );
                                    pph_error.pph_handle_error( _values_$2411, ConsesLow.list( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) );
                                  }
                                }
                                finally
                                {
                                  pph_vars.$pph_unexpressed_negations$.rebind( _prev_bind_0_$2401, thread );
                                }
                              }
                              else
                              {
                                _prev_bind_0_$229 = pph_vars.$pph_discourse_context$.currentBinding( thread );
                                try
                                {
                                  pph_vars.$pph_discourse_context$.bind( pph_drs.new_pph_discourse_context(), thread );
                                  pph_macros.herald_new_discourse_context();
                                  boolean arg16111 = false;
                                  try
                                  {
                                    arg16111 = true;
                                    pph_drs.pph_ensure_discourse_participant_rms();
                                    _prev_bind_0_$2401 = misc_utilities.initialized_p( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) );
                                    _values_$2411 = pph_vars.$pph_unexpressed_negations$.currentBinding( thread );
                                    try
                                    {
                                      pph_vars.$pph_unexpressed_negations$.bind( NIL != _prev_bind_0_$2401 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread )
                                          : set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                                      new_format_string1 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                                      try
                                      {
                                        pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                                        thread.resetMultipleValues();
                                        _prev_bind_0_$232 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                                        try
                                        {
                                          pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                                          reuseP1 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          boolean arg16952 = false;
                                          try
                                          {
                                            arg16952 = true;
                                            thread.resetMultipleValues();
                                            _prev_bind_0_$2381 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                                            try
                                            {
                                              pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                                              _values_$2391 = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              _prev_bind_0_$234 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                                              try
                                              {
                                                pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                                                local_state1 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                                                _prev_bind_0_$235 = memoization_state.$memoization_state$.currentBinding( thread );
                                                try
                                                {
                                                  memoization_state.$memoization_state$.bind( local_state1, thread );
                                                  original_memoization_process1 = memoization_state.memoization_state_original_process( local_state1 );
                                                  boolean arg17793 = false;
                                                  try
                                                  {
                                                    arg17793 = true;
                                                    pph_phrase_generate_1( phrase );
                                                    arg17793 = false;
                                                  }
                                                  finally
                                                  {
                                                    if( arg17793 )
                                                    {
                                                      final SubLObject _prev_bind_0_$2362 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                      try
                                                      {
                                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                        final SubLObject _values_$2372 = Values.getValuesAsVector();
                                                        memoization_state.memoization_state_possibly_clear_original_process( local_state1, original_memoization_process1 );
                                                        Values.restoreValuesFromVector( _values_$2372 );
                                                      }
                                                      finally
                                                      {
                                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2362, thread );
                                                      }
                                                    }
                                                  }
                                                  _prev_bind_0_$2361 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                  try
                                                  {
                                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                    final SubLObject _values_$2371 = Values.getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process( local_state1, original_memoization_process1 );
                                                    Values.restoreValuesFromVector( _values_$2371 );
                                                  }
                                                  finally
                                                  {
                                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2361, thread );
                                                  }
                                                }
                                                finally
                                                {
                                                  memoization_state.$memoization_state$.rebind( _prev_bind_0_$235, thread );
                                                }
                                              }
                                              finally
                                              {
                                                pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$234, thread );
                                              }
                                              if( _values_$2391 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                                              {
                                                memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                                              }
                                            }
                                            finally
                                            {
                                              pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$2381, thread );
                                            }
                                            arg16952 = false;
                                          }
                                          finally
                                          {
                                            if( arg16952 )
                                            {
                                              final SubLObject _prev_bind_0_$2382 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                              try
                                              {
                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                final SubLObject _values_$2392 = Values.getValuesAsVector();
                                                if( NIL == reuseP1 )
                                                {
                                                  pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                                }
                                                Values.restoreValuesFromVector( _values_$2392 );
                                              }
                                              finally
                                              {
                                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2382, thread );
                                              }
                                            }
                                          }
                                          _prev_bind_0_$2381 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                          try
                                          {
                                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                            _values_$2391 = Values.getValuesAsVector();
                                            if( NIL == reuseP1 )
                                            {
                                              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                            }
                                            Values.restoreValuesFromVector( _values_$2391 );
                                          }
                                          finally
                                          {
                                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2381, thread );
                                          }
                                        }
                                        finally
                                        {
                                          pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$232, thread );
                                        }
                                      }
                                      finally
                                      {
                                        pph_macros.$free_pph_problem_store_pointers$.rebind( new_format_string1, thread );
                                      }
                                      if( NIL == _prev_bind_0_$2401 && NIL == set.set_emptyP( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) )
                                      {
                                        new_format_string1 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil
                                            .format_nil_a_no_copy( $str119$Abandoning_unexpressed_negations_ )
                                        } );
                                        pph_error.pph_handle_error( new_format_string1, ConsesLow.list( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) );
                                      }
                                    }
                                    finally
                                    {
                                      pph_vars.$pph_unexpressed_negations$.rebind( _values_$2411, thread );
                                    }
                                    arg16111 = false;
                                  }
                                  finally
                                  {
                                    if( arg16111 )
                                    {
                                      final SubLObject _prev_bind_0_$2402 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                      try
                                      {
                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                        final SubLObject _values_$2412 = Values.getValuesAsVector();
                                        pph_macros.herald_end_of_discourse_context();
                                        pph_macros.clear_pph_discourse_context();
                                        Values.restoreValuesFromVector( _values_$2412 );
                                      }
                                      finally
                                      {
                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2402, thread );
                                      }
                                    }
                                  }
                                  _prev_bind_0_$2401 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    _values_$2411 = Values.getValuesAsVector();
                                    pph_macros.herald_end_of_discourse_context();
                                    pph_macros.clear_pph_discourse_context();
                                    Values.restoreValuesFromVector( _values_$2411 );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2401, thread );
                                  }
                                }
                                finally
                                {
                                  pph_vars.$pph_discourse_context$.rebind( _prev_bind_0_$229, thread );
                                }
                              }
                            }
                            finally
                            {
                              pph_vars.$pph_type_level_violations$.rebind( _prev_bind_4_$218, thread );
                              pph_vars.$paraphrase_mode$.rebind( _prev_bind_3_$217, thread );
                              lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_2_$216, thread );
                              pph_vars.$pph_domain_mt$.rebind( _prev_bind_1_$215, thread );
                              pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$214, thread );
                            }
                            pph_utilities.pph_pop_environment();
                            Values.restoreValuesFromVector( _values1 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$213, thread );
                          }
                        }
                      }
                      _prev_bind_0_$278 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        _values = Values.getValuesAsVector();
                        local_vars = pph_vars.$pph_language_mt$.currentBinding( thread );
                        _prev_bind_0_$250 = pph_vars.$pph_domain_mt$.currentBinding( thread );
                        _prev_bind_1_$251 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
                        _prev_bind_2_$252 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                        _prev_bind_3_$253 = pph_vars.$pph_type_level_violations$.currentBinding( thread );
                        try
                        {
                          pph_vars.$pph_language_mt$.bind( language_mt, thread );
                          pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
                          lexicon_vars.$lexicon_lookup_mt$.bind( pph_vars.$pph_language_mt$.getDynamicValue( thread ), thread );
                          pph_vars.$paraphrase_mode$.bind( mode, thread );
                          pph_vars.$pph_type_level_violations$.bind( NIL != set.set_p( pph_vars.$pph_type_level_violations$.getDynamicValue( thread ) ) ? pph_vars.$pph_type_level_violations$.getDynamicValue( thread )
                              : pph_utilities.pph_type_level_violations( ccatch_env_var ), thread );
                          if( NIL != pph_macros.pph_discourse_context_initializedP() )
                          {
                            pph_drs.pph_ensure_discourse_participant_rms();
                            _prev_bind_4_$254 = misc_utilities.initialized_p( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) );
                            _prev_bind_0_$265 = pph_vars.$pph_unexpressed_negations$.currentBinding( thread );
                            try
                            {
                              pph_vars.$pph_unexpressed_negations$.bind( NIL != _prev_bind_4_$254 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread )
                                  : set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                              _prev_bind_0_$276 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                              try
                              {
                                pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                                thread.resetMultipleValues();
                                _values_$277 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                                try
                                {
                                  pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                                  new_format_string = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  boolean arg14429 = false;
                                  try
                                  {
                                    arg14429 = true;
                                    thread.resetMultipleValues();
                                    _prev_bind_0_$268 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                                    try
                                    {
                                      pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                                      reuseP = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      _prev_bind_0_$274 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                                      try
                                      {
                                        pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                                        _values_$275 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                                        _prev_bind_0_$270 = memoization_state.$memoization_state$.currentBinding( thread );
                                        try
                                        {
                                          memoization_state.$memoization_state$.bind( _values_$275, thread );
                                          local_state = memoization_state.memoization_state_original_process( _values_$275 );
                                          boolean arg15270 = false;
                                          try
                                          {
                                            arg15270 = true;
                                            pph_phrase_generate_1( phrase );
                                            arg15270 = false;
                                          }
                                          finally
                                          {
                                            if( arg15270 )
                                            {
                                              final SubLObject _prev_bind_0_$225 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                              try
                                              {
                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                final SubLObject _values_$226 = Values.getValuesAsVector();
                                                memoization_state.memoization_state_possibly_clear_original_process( _values_$275, local_state );
                                                Values.restoreValuesFromVector( _values_$226 );
                                              }
                                              finally
                                              {
                                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$225, thread );
                                              }
                                            }
                                          }
                                          _prev_bind_0_$271 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                          try
                                          {
                                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                            original_memoization_process = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process( _values_$275, local_state );
                                            Values.restoreValuesFromVector( original_memoization_process );
                                          }
                                          finally
                                          {
                                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$271, thread );
                                          }
                                        }
                                        finally
                                        {
                                          memoization_state.$memoization_state$.rebind( _prev_bind_0_$270, thread );
                                        }
                                      }
                                      finally
                                      {
                                        pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$274, thread );
                                      }
                                      if( reuseP == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                                      {
                                        memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                                      }
                                    }
                                    finally
                                    {
                                      pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$268, thread );
                                    }
                                    arg14429 = false;
                                  }
                                  finally
                                  {
                                    if( arg14429 )
                                    {
                                      final SubLObject _prev_bind_0_$227 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                      try
                                      {
                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                        final SubLObject _values_$228 = Values.getValuesAsVector();
                                        if( NIL == new_format_string )
                                        {
                                          pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                        }
                                        Values.restoreValuesFromVector( _values_$228 );
                                      }
                                      finally
                                      {
                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$227, thread );
                                      }
                                    }
                                  }
                                  _prev_bind_0_$268 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    reuseP = Values.getValuesAsVector();
                                    if( NIL == new_format_string )
                                    {
                                      pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                    }
                                    Values.restoreValuesFromVector( reuseP );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$268, thread );
                                  }
                                }
                                finally
                                {
                                  pph_macros.$pph_problem_store_pointer$.rebind( _values_$277, thread );
                                }
                              }
                              finally
                              {
                                pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$276, thread );
                              }
                              if( NIL == _prev_bind_4_$254 && NIL == set.set_emptyP( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) )
                              {
                                _prev_bind_0_$276 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
                                    $str119$Abandoning_unexpressed_negations_ )
                                } );
                                pph_error.pph_handle_error( _prev_bind_0_$276, ConsesLow.list( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) );
                              }
                            }
                            finally
                            {
                              pph_vars.$pph_unexpressed_negations$.rebind( _prev_bind_0_$265, thread );
                            }
                          }
                          else
                          {
                            _prev_bind_4_$254 = pph_vars.$pph_discourse_context$.currentBinding( thread );
                            try
                            {
                              pph_vars.$pph_discourse_context$.bind( pph_drs.new_pph_discourse_context(), thread );
                              pph_macros.herald_new_discourse_context();
                              boolean arg11906 = false;
                              try
                              {
                                arg11906 = true;
                                pph_drs.pph_ensure_discourse_participant_rms();
                                _prev_bind_0_$265 = misc_utilities.initialized_p( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) );
                                _prev_bind_0_$276 = pph_vars.$pph_unexpressed_negations$.currentBinding( thread );
                                try
                                {
                                  pph_vars.$pph_unexpressed_negations$.bind( NIL != _prev_bind_0_$265 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread )
                                      : set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                                  _values_$277 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                                  try
                                  {
                                    pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                                    thread.resetMultipleValues();
                                    new_format_string = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                                    try
                                    {
                                      pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                                      _prev_bind_0_$268 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      boolean arg12747 = false;
                                      try
                                      {
                                        arg12747 = true;
                                        thread.resetMultipleValues();
                                        reuseP = pph_macros.$pph_memoization_state$.currentBinding( thread );
                                        try
                                        {
                                          pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                                          _prev_bind_0_$274 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          _values_$275 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                                          try
                                          {
                                            pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                                            _prev_bind_0_$270 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                                            local_state = memoization_state.$memoization_state$.currentBinding( thread );
                                            try
                                            {
                                              memoization_state.$memoization_state$.bind( _prev_bind_0_$270, thread );
                                              _prev_bind_0_$271 = memoization_state.memoization_state_original_process( _prev_bind_0_$270 );
                                              boolean arg13588 = false;
                                              try
                                              {
                                                arg13588 = true;
                                                pph_phrase_generate_1( phrase );
                                                arg13588 = false;
                                              }
                                              finally
                                              {
                                                if( arg13588 )
                                                {
                                                  final SubLObject _prev_bind_0_$236 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                  try
                                                  {
                                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                    final SubLObject _values_$237 = Values.getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process( _prev_bind_0_$270, _prev_bind_0_$271 );
                                                    Values.restoreValuesFromVector( _values_$237 );
                                                  }
                                                  finally
                                                  {
                                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$236, thread );
                                                  }
                                                }
                                              }
                                              original_memoization_process = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                              try
                                              {
                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                _prev_bind_0_$272 = Values.getValuesAsVector();
                                                memoization_state.memoization_state_possibly_clear_original_process( _prev_bind_0_$270, _prev_bind_0_$271 );
                                                Values.restoreValuesFromVector( _prev_bind_0_$272 );
                                              }
                                              finally
                                              {
                                                Threads.$is_thread_performing_cleanupP$.rebind( original_memoization_process, thread );
                                              }
                                            }
                                            finally
                                            {
                                              memoization_state.$memoization_state$.rebind( local_state, thread );
                                            }
                                          }
                                          finally
                                          {
                                            pph_macros.$pph_external_memoization_state$.rebind( _values_$275, thread );
                                          }
                                          if( _prev_bind_0_$274 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                                          {
                                            memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                                          }
                                        }
                                        finally
                                        {
                                          pph_macros.$pph_memoization_state$.rebind( reuseP, thread );
                                        }
                                        arg12747 = false;
                                      }
                                      finally
                                      {
                                        if( arg12747 )
                                        {
                                          final SubLObject _prev_bind_0_$238 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                          try
                                          {
                                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                            final SubLObject _values_$239 = Values.getValuesAsVector();
                                            if( NIL == _prev_bind_0_$268 )
                                            {
                                              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                            }
                                            Values.restoreValuesFromVector( _values_$239 );
                                          }
                                          finally
                                          {
                                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$238, thread );
                                          }
                                        }
                                      }
                                      reuseP = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                      try
                                      {
                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                        _prev_bind_0_$274 = Values.getValuesAsVector();
                                        if( NIL == _prev_bind_0_$268 )
                                        {
                                          pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                        }
                                        Values.restoreValuesFromVector( _prev_bind_0_$274 );
                                      }
                                      finally
                                      {
                                        Threads.$is_thread_performing_cleanupP$.rebind( reuseP, thread );
                                      }
                                    }
                                    finally
                                    {
                                      pph_macros.$pph_problem_store_pointer$.rebind( new_format_string, thread );
                                    }
                                  }
                                  finally
                                  {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind( _values_$277, thread );
                                  }
                                  if( NIL == _prev_bind_0_$265 && NIL == set.set_emptyP( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) )
                                  {
                                    _values_$277 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
                                        $str119$Abandoning_unexpressed_negations_ )
                                    } );
                                    pph_error.pph_handle_error( _values_$277, ConsesLow.list( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) );
                                  }
                                }
                                finally
                                {
                                  pph_vars.$pph_unexpressed_negations$.rebind( _prev_bind_0_$276, thread );
                                }
                                arg11906 = false;
                              }
                              finally
                              {
                                if( arg11906 )
                                {
                                  final SubLObject _prev_bind_0_$240 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                  try
                                  {
                                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                    final SubLObject _values_$241 = Values.getValuesAsVector();
                                    pph_macros.herald_end_of_discourse_context();
                                    pph_macros.clear_pph_discourse_context();
                                    Values.restoreValuesFromVector( _values_$241 );
                                  }
                                  finally
                                  {
                                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$240, thread );
                                  }
                                }
                              }
                              _prev_bind_0_$265 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                _prev_bind_0_$276 = Values.getValuesAsVector();
                                pph_macros.herald_end_of_discourse_context();
                                pph_macros.clear_pph_discourse_context();
                                Values.restoreValuesFromVector( _prev_bind_0_$276 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$265, thread );
                              }
                            }
                            finally
                            {
                              pph_vars.$pph_discourse_context$.rebind( _prev_bind_4_$254, thread );
                            }
                          }
                        }
                        finally
                        {
                          pph_vars.$pph_type_level_violations$.rebind( _prev_bind_3_$253, thread );
                          pph_vars.$paraphrase_mode$.rebind( _prev_bind_2_$252, thread );
                          lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_1_$251, thread );
                          pph_vars.$pph_domain_mt$.rebind( _prev_bind_0_$250, thread );
                          pph_vars.$pph_language_mt$.rebind( local_vars, thread );
                        }
                        pph_utilities.pph_pop_environment();
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$278, thread );
                      }
                    }
                    finally
                    {
                      pph_utilities.$pph_current_environment$.rebind( _prev_bind_2_$247, thread );
                    }
                    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                    {
                      format_nil.force_format( T, $str120$__PPH_PHRASE_GENERATE_Output_list, pph_phrase.pph_phrase_output_list( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                          UNPROVIDED );
                      arg10925 = false;
                    }
                    else
                    {
                      arg10925 = false;
                    }
                  }
                  else
                  {
                    arg10925 = false;
                  }
                }
              }
              finally
              {
                if( arg10925 )
                {
                  final SubLObject _prev_bind_0_$242 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    final SubLObject local_vars1 = conses_high.set_difference( pph_variable_handling.pph_registered_vars(), _prev_bind_0_$244, UNPROVIDED, UNPROVIDED );
                    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                    {
                      format_nil.force_format( T, $str121$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue( thread ), pph_variable_handling.pph_registered_vars(),
                          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    pph_macros.pph_handle_local_vars( local_vars1 );
                    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                    {
                      format_nil.force_format( T, $str122$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                          UNPROVIDED );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$242, thread );
                  }
                }
              }
              _prev_bind_2_$247 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                _prev_bind_0_$278 = Values.getValuesAsVector();
                _values = conses_high.set_difference( pph_variable_handling.pph_registered_vars(), _prev_bind_0_$244, UNPROVIDED, UNPROVIDED );
                if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                {
                  format_nil.force_format( T, $str121$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue( thread ), pph_variable_handling.pph_registered_vars(),
                      UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                pph_macros.pph_handle_local_vars( _values );
                if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                {
                  format_nil.force_format( T, $str122$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _prev_bind_0_$278 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2_$247, thread );
              }
            }
            finally
            {
              pph_vars.$pph_possibly_binding_variables_counter$.rebind( _prev_bind_1_$246, thread );
              pph_vars.$pph_noted_var_types$.rebind( _prev_bind_0_$245, thread );
              pph_variable_handling.$pph_different_vars$.rebind( old_pph_vars, thread );
            }
          }
          finally
          {
            pph_vars.$pph_var_types$.rebind( mapped_string, thread );
          }
        }
        else
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            ccatch_env_var = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym21$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                catch_var = pph_utilities.pph_phrase_rephrase_cycl( phrase, UNPROVIDED, UNPROVIDED );
                mapped_string = pph_macros.pph_mapped_string_for_term( catch_var );
                _prev_bind_0_$244 = pph_vars.$pph_var_types$.currentBinding( thread );
                try
                {
                  pph_vars.$pph_var_types$.bind( NIL != dictionary.dictionary_p( pph_vars.$pph_var_types$.getDynamicValue( thread ) ) ? pph_vars.$pph_var_types$.getDynamicValue( thread )
                      : dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ), thread );
                  old_pph_vars = pph_variable_handling.pph_registered_vars();
                  _prev_bind_0_$245 = pph_variable_handling.$pph_different_vars$.currentBinding( thread );
                  _prev_bind_1_$246 = pph_vars.$pph_noted_var_types$.currentBinding( thread );
                  _prev_bind_2_$247 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding( thread );
                  try
                  {
                    pph_variable_handling.$pph_different_vars$.bind( pph_variable_handling.$pph_different_vars$.getDynamicValue( thread ), thread );
                    pph_vars.$pph_noted_var_types$.bind( NIL != dictionary.dictionary_p( pph_vars.$pph_noted_var_types$.getDynamicValue( thread ) ) ? pph_vars.$pph_noted_var_types$.getDynamicValue( thread )
                        : dictionary.new_dictionary( Symbols.symbol_function( EQL ), SIXTEEN_INTEGER ), thread );
                    pph_vars.$pph_possibly_binding_variables_counter$.bind( number_utilities.f_1X( pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue( thread ) ), thread );
                    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                    {
                      format_nil.force_format( T, $str113$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue( thread ), dictionary.dictionary_values(
                          pph_vars.$pph_var_types$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    boolean arg1533 = false;
                    try
                    {
                      arg1533 = true;
                      if( NIL != mapped_string )
                      {
                        if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                        {
                          format_nil.force_format( T, $str114$__Using_mapped_string__S_for__S__, mapped_string, catch_var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                        pph_phrase.pph_phrase_set_string( phrase, mapped_string );
                        if( pph_phrase.pph_phrase_category( phrase, UNPROVIDED ).eql( $const115$PossessivePhrase ) )
                        {
                          possessivize_pph_phrase( phrase );
                          arg1533 = false;
                        }
                        else
                        {
                          arg1533 = false;
                        }
                      }
                      else if( pph_vars.current_generation_level().numG( $pph_recursion_limit$.getGlobalValue() ) )
                      {
                        _prev_bind_0_$278 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
                            $str116$Recursion_limit_exceeded_on__S_ )
                        } );
                        pph_error.pph_handle_error( _prev_bind_0_$278, ConsesLow.list( pph_vars.pph_top_level_cycl() ) );
                        arg1533 = false;
                      }
                      else
                      {
                        pph_phrase.pph_phrase_set_absolute_agr_from_phrase( phrase );
                        if( NIL == pph_phrase.pph_phrase_impossible_p( phrase, T ) )
                        {
                          if( NIL != pph_phrase.pph_phrase_has_known_cyclP( phrase ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                          {
                            format_nil.force_format( T, $str117$__Paraphrasing__S_with_agr___S___, catch_var, pph_phrase.pph_phrase_agr( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                          _prev_bind_0_$278 = pph_utilities.$pph_current_environment$.currentBinding( thread );
                          try
                          {
                            pph_utilities.$pph_current_environment$.bind( pph_utilities.find_or_create_pph_context(), thread );
                            pph_utilities.pph_push_environment( $kw118$GENERATE );
                            boolean arg10224 = false;
                            try
                            {
                              arg10224 = true;
                              pph_utilities.pph_phrase_maybe_mark_type_level_violation( phrase );
                              arg10224 = false;
                            }
                            finally
                            {
                              if( arg10224 )
                              {
                                final SubLObject _prev_bind_0_$249 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values3 = Values.getValuesAsVector();
                                  final SubLObject _prev_bind_0_$2501 = pph_vars.$pph_language_mt$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$2511 = pph_vars.$pph_domain_mt$.currentBinding( thread );
                                  final SubLObject _prev_bind_2_$2521 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
                                  final SubLObject _prev_bind_3_$2531 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                                  final SubLObject _prev_bind_4_$2541 = pph_vars.$pph_type_level_violations$.currentBinding( thread );
                                  try
                                  {
                                    pph_vars.$pph_language_mt$.bind( language_mt, thread );
                                    pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
                                    lexicon_vars.$lexicon_lookup_mt$.bind( pph_vars.$pph_language_mt$.getDynamicValue( thread ), thread );
                                    pph_vars.$paraphrase_mode$.bind( mode, thread );
                                    pph_vars.$pph_type_level_violations$.bind( NIL != set.set_p( pph_vars.$pph_type_level_violations$.getDynamicValue( thread ) ) ? pph_vars.$pph_type_level_violations$.getDynamicValue(
                                        thread ) : pph_utilities.pph_type_level_violations( catch_var ), thread );
                                    SubLObject _prev_bind_0_$2651;
                                    SubLObject _prev_bind_0_$2762;
                                    SubLObject _values_$2772;
                                    SubLObject new_format_string2;
                                    SubLObject _prev_bind_0_$2681;
                                    SubLObject reuseP2;
                                    SubLObject _prev_bind_0_$2742;
                                    SubLObject _values_$2752;
                                    SubLObject _prev_bind_0_$2701;
                                    SubLObject local_state2;
                                    SubLObject _prev_bind_0_$2711;
                                    SubLObject original_memoization_process2;
                                    SubLObject _prev_bind_0_$2722;
                                    if( NIL != pph_macros.pph_discourse_context_initializedP() )
                                    {
                                      pph_drs.pph_ensure_discourse_participant_rms();
                                      _prev_bind_0_$2651 = misc_utilities.initialized_p( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) );
                                      _prev_bind_0_$2762 = pph_vars.$pph_unexpressed_negations$.currentBinding( thread );
                                      try
                                      {
                                        pph_vars.$pph_unexpressed_negations$.bind( NIL != _prev_bind_0_$2651 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread )
                                            : set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                                        _values_$2772 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                                        try
                                        {
                                          pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                                          thread.resetMultipleValues();
                                          new_format_string2 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                                          try
                                          {
                                            pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                                            _prev_bind_0_$2681 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            boolean arg9242 = false;
                                            try
                                            {
                                              arg9242 = true;
                                              thread.resetMultipleValues();
                                              reuseP2 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                                              try
                                              {
                                                pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                                                _prev_bind_0_$2742 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                _values_$2752 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                                                try
                                                {
                                                  pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                                                  _prev_bind_0_$2701 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                                                  local_state2 = memoization_state.$memoization_state$.currentBinding( thread );
                                                  try
                                                  {
                                                    memoization_state.$memoization_state$.bind( _prev_bind_0_$2701, thread );
                                                    _prev_bind_0_$2711 = memoization_state.memoization_state_original_process( _prev_bind_0_$2701 );
                                                    boolean arg10083 = false;
                                                    try
                                                    {
                                                      arg10083 = true;
                                                      pph_phrase_generate_1( phrase );
                                                      arg10083 = false;
                                                    }
                                                    finally
                                                    {
                                                      if( arg10083 )
                                                      {
                                                        final SubLObject _prev_bind_0_$2611 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                        try
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                          final SubLObject _values_$2621 = Values.getValuesAsVector();
                                                          memoization_state.memoization_state_possibly_clear_original_process( _prev_bind_0_$2701, _prev_bind_0_$2711 );
                                                          Values.restoreValuesFromVector( _values_$2621 );
                                                        }
                                                        finally
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2611, thread );
                                                        }
                                                      }
                                                    }
                                                    original_memoization_process2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      _prev_bind_0_$2722 = Values.getValuesAsVector();
                                                      memoization_state.memoization_state_possibly_clear_original_process( _prev_bind_0_$2701, _prev_bind_0_$2711 );
                                                      Values.restoreValuesFromVector( _prev_bind_0_$2722 );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( original_memoization_process2, thread );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    memoization_state.$memoization_state$.rebind( local_state2, thread );
                                                  }
                                                }
                                                finally
                                                {
                                                  pph_macros.$pph_external_memoization_state$.rebind( _values_$2752, thread );
                                                }
                                                if( _prev_bind_0_$2742 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                                                {
                                                  memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                                                }
                                              }
                                              finally
                                              {
                                                pph_macros.$pph_memoization_state$.rebind( reuseP2, thread );
                                              }
                                              arg9242 = false;
                                            }
                                            finally
                                            {
                                              if( arg9242 )
                                              {
                                                final SubLObject _prev_bind_0_$2631 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                try
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                  final SubLObject _values_$2641 = Values.getValuesAsVector();
                                                  if( NIL == _prev_bind_0_$2681 )
                                                  {
                                                    pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                                  }
                                                  Values.restoreValuesFromVector( _values_$2641 );
                                                }
                                                finally
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2631, thread );
                                                }
                                              }
                                            }
                                            reuseP2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                            try
                                            {
                                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                              _prev_bind_0_$2742 = Values.getValuesAsVector();
                                              if( NIL == _prev_bind_0_$2681 )
                                              {
                                                pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                              }
                                              Values.restoreValuesFromVector( _prev_bind_0_$2742 );
                                            }
                                            finally
                                            {
                                              Threads.$is_thread_performing_cleanupP$.rebind( reuseP2, thread );
                                            }
                                          }
                                          finally
                                          {
                                            pph_macros.$pph_problem_store_pointer$.rebind( new_format_string2, thread );
                                          }
                                        }
                                        finally
                                        {
                                          pph_macros.$free_pph_problem_store_pointers$.rebind( _values_$2772, thread );
                                        }
                                        if( NIL == _prev_bind_0_$2651 && NIL == set.set_emptyP( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) )
                                        {
                                          _values_$2772 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
                                              $str119$Abandoning_unexpressed_negations_ )
                                          } );
                                          pph_error.pph_handle_error( _values_$2772, ConsesLow.list( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) );
                                        }
                                      }
                                      finally
                                      {
                                        pph_vars.$pph_unexpressed_negations$.rebind( _prev_bind_0_$2762, thread );
                                      }
                                    }
                                    else
                                    {
                                      _prev_bind_0_$2651 = pph_vars.$pph_discourse_context$.currentBinding( thread );
                                      try
                                      {
                                        pph_vars.$pph_discourse_context$.bind( pph_drs.new_pph_discourse_context(), thread );
                                        pph_macros.herald_new_discourse_context();
                                        boolean arg6719 = false;
                                        try
                                        {
                                          arg6719 = true;
                                          pph_drs.pph_ensure_discourse_participant_rms();
                                          _prev_bind_0_$2762 = misc_utilities.initialized_p( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) );
                                          _values_$2772 = pph_vars.$pph_unexpressed_negations$.currentBinding( thread );
                                          try
                                          {
                                            pph_vars.$pph_unexpressed_negations$.bind( NIL != _prev_bind_0_$2762 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread )
                                                : set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                                            new_format_string2 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                                            try
                                            {
                                              pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                                              thread.resetMultipleValues();
                                              _prev_bind_0_$2681 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                                              try
                                              {
                                                pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                                                reuseP2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                boolean arg7560 = false;
                                                try
                                                {
                                                  arg7560 = true;
                                                  thread.resetMultipleValues();
                                                  _prev_bind_0_$2742 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                                                  try
                                                  {
                                                    pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                                                    _values_$2752 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    _prev_bind_0_$2701 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                                                    try
                                                    {
                                                      pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                                                      local_state2 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                                                      _prev_bind_0_$2711 = memoization_state.$memoization_state$.currentBinding( thread );
                                                      try
                                                      {
                                                        memoization_state.$memoization_state$.bind( local_state2, thread );
                                                        original_memoization_process2 = memoization_state.memoization_state_original_process( local_state2 );
                                                        boolean arg8401 = false;
                                                        try
                                                        {
                                                          arg8401 = true;
                                                          pph_phrase_generate_1( phrase );
                                                          arg8401 = false;
                                                        }
                                                        finally
                                                        {
                                                          if( arg8401 )
                                                          {
                                                            final SubLObject _prev_bind_0_$2723 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                            try
                                                            {
                                                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                              final SubLObject _values_$2733 = Values.getValuesAsVector();
                                                              memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
                                                              Values.restoreValuesFromVector( _values_$2733 );
                                                            }
                                                            finally
                                                            {
                                                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2723, thread );
                                                            }
                                                          }
                                                        }
                                                        _prev_bind_0_$2722 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                        try
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                          final SubLObject _values_$2732 = Values.getValuesAsVector();
                                                          memoization_state.memoization_state_possibly_clear_original_process( local_state2, original_memoization_process2 );
                                                          Values.restoreValuesFromVector( _values_$2732 );
                                                        }
                                                        finally
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2722, thread );
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        memoization_state.$memoization_state$.rebind( _prev_bind_0_$2711, thread );
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$2701, thread );
                                                    }
                                                    if( _values_$2752 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                                                    {
                                                      memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$2742, thread );
                                                  }
                                                  arg7560 = false;
                                                }
                                                finally
                                                {
                                                  if( arg7560 )
                                                  {
                                                    final SubLObject _prev_bind_0_$2743 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      final SubLObject _values_$2753 = Values.getValuesAsVector();
                                                      if( NIL == reuseP2 )
                                                      {
                                                        pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                                      }
                                                      Values.restoreValuesFromVector( _values_$2753 );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2743, thread );
                                                    }
                                                  }
                                                }
                                                _prev_bind_0_$2742 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                try
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                  _values_$2752 = Values.getValuesAsVector();
                                                  if( NIL == reuseP2 )
                                                  {
                                                    pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                                  }
                                                  Values.restoreValuesFromVector( _values_$2752 );
                                                }
                                                finally
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2742, thread );
                                                }
                                              }
                                              finally
                                              {
                                                pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$2681, thread );
                                              }
                                            }
                                            finally
                                            {
                                              pph_macros.$free_pph_problem_store_pointers$.rebind( new_format_string2, thread );
                                            }
                                            if( NIL == _prev_bind_0_$2762 && NIL == set.set_emptyP( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) )
                                            {
                                              new_format_string2 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil
                                                  .format_nil_a_no_copy( $str119$Abandoning_unexpressed_negations_ )
                                              } );
                                              pph_error.pph_handle_error( new_format_string2, ConsesLow.list( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) );
                                            }
                                          }
                                          finally
                                          {
                                            pph_vars.$pph_unexpressed_negations$.rebind( _values_$2772, thread );
                                          }
                                          arg6719 = false;
                                        }
                                        finally
                                        {
                                          if( arg6719 )
                                          {
                                            final SubLObject _prev_bind_0_$2763 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                            try
                                            {
                                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                              final SubLObject _values_$2773 = Values.getValuesAsVector();
                                              pph_macros.herald_end_of_discourse_context();
                                              pph_macros.clear_pph_discourse_context();
                                              Values.restoreValuesFromVector( _values_$2773 );
                                            }
                                            finally
                                            {
                                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2763, thread );
                                            }
                                          }
                                        }
                                        _prev_bind_0_$2762 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                        try
                                        {
                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                          _values_$2772 = Values.getValuesAsVector();
                                          pph_macros.herald_end_of_discourse_context();
                                          pph_macros.clear_pph_discourse_context();
                                          Values.restoreValuesFromVector( _values_$2772 );
                                        }
                                        finally
                                        {
                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2762, thread );
                                        }
                                      }
                                      finally
                                      {
                                        pph_vars.$pph_discourse_context$.rebind( _prev_bind_0_$2651, thread );
                                      }
                                    }
                                  }
                                  finally
                                  {
                                    pph_vars.$pph_type_level_violations$.rebind( _prev_bind_4_$2541, thread );
                                    pph_vars.$paraphrase_mode$.rebind( _prev_bind_3_$2531, thread );
                                    lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_2_$2521, thread );
                                    pph_vars.$pph_domain_mt$.rebind( _prev_bind_1_$2511, thread );
                                    pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$2501, thread );
                                  }
                                  pph_utilities.pph_pop_environment();
                                  Values.restoreValuesFromVector( _values3 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$249, thread );
                                }
                              }
                            }
                            _values = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              local_vars = Values.getValuesAsVector();
                              _prev_bind_0_$250 = pph_vars.$pph_language_mt$.currentBinding( thread );
                              _prev_bind_1_$251 = pph_vars.$pph_domain_mt$.currentBinding( thread );
                              _prev_bind_2_$252 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
                              _prev_bind_3_$253 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                              _prev_bind_4_$254 = pph_vars.$pph_type_level_violations$.currentBinding( thread );
                              try
                              {
                                pph_vars.$pph_language_mt$.bind( language_mt, thread );
                                pph_vars.$pph_domain_mt$.bind( domain_mt, thread );
                                lexicon_vars.$lexicon_lookup_mt$.bind( pph_vars.$pph_language_mt$.getDynamicValue( thread ), thread );
                                pph_vars.$paraphrase_mode$.bind( mode, thread );
                                pph_vars.$pph_type_level_violations$.bind( NIL != set.set_p( pph_vars.$pph_type_level_violations$.getDynamicValue( thread ) ) ? pph_vars.$pph_type_level_violations$.getDynamicValue(
                                    thread ) : pph_utilities.pph_type_level_violations( catch_var ), thread );
                                if( NIL != pph_macros.pph_discourse_context_initializedP() )
                                {
                                  pph_drs.pph_ensure_discourse_participant_rms();
                                  _prev_bind_0_$265 = misc_utilities.initialized_p( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) );
                                  _prev_bind_0_$276 = pph_vars.$pph_unexpressed_negations$.currentBinding( thread );
                                  try
                                  {
                                    pph_vars.$pph_unexpressed_negations$.bind( NIL != _prev_bind_0_$265 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread )
                                        : set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                                    _values_$277 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                                    try
                                    {
                                      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                                      thread.resetMultipleValues();
                                      new_format_string = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                                      try
                                      {
                                        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                                        _prev_bind_0_$268 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        boolean arg5037 = false;
                                        try
                                        {
                                          arg5037 = true;
                                          thread.resetMultipleValues();
                                          reuseP = pph_macros.$pph_memoization_state$.currentBinding( thread );
                                          try
                                          {
                                            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                                            _prev_bind_0_$274 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            _values_$275 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                                            try
                                            {
                                              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                                              _prev_bind_0_$270 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                                              local_state = memoization_state.$memoization_state$.currentBinding( thread );
                                              try
                                              {
                                                memoization_state.$memoization_state$.bind( _prev_bind_0_$270, thread );
                                                _prev_bind_0_$271 = memoization_state.memoization_state_original_process( _prev_bind_0_$270 );
                                                boolean arg5878 = false;
                                                try
                                                {
                                                  arg5878 = true;
                                                  pph_phrase_generate_1( phrase );
                                                  arg5878 = false;
                                                }
                                                finally
                                                {
                                                  if( arg5878 )
                                                  {
                                                    final SubLObject _prev_bind_0_$261 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      final SubLObject _values_$262 = Values.getValuesAsVector();
                                                      memoization_state.memoization_state_possibly_clear_original_process( _prev_bind_0_$270, _prev_bind_0_$271 );
                                                      Values.restoreValuesFromVector( _values_$262 );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$261, thread );
                                                    }
                                                  }
                                                }
                                                original_memoization_process = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                try
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                  _prev_bind_0_$272 = Values.getValuesAsVector();
                                                  memoization_state.memoization_state_possibly_clear_original_process( _prev_bind_0_$270, _prev_bind_0_$271 );
                                                  Values.restoreValuesFromVector( _prev_bind_0_$272 );
                                                }
                                                finally
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.rebind( original_memoization_process, thread );
                                                }
                                              }
                                              finally
                                              {
                                                memoization_state.$memoization_state$.rebind( local_state, thread );
                                              }
                                            }
                                            finally
                                            {
                                              pph_macros.$pph_external_memoization_state$.rebind( _values_$275, thread );
                                            }
                                            if( _prev_bind_0_$274 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                                            {
                                              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                                            }
                                          }
                                          finally
                                          {
                                            pph_macros.$pph_memoization_state$.rebind( reuseP, thread );
                                          }
                                          arg5037 = false;
                                        }
                                        finally
                                        {
                                          if( arg5037 )
                                          {
                                            final SubLObject _prev_bind_0_$263 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                            try
                                            {
                                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                              final SubLObject _values_$264 = Values.getValuesAsVector();
                                              if( NIL == _prev_bind_0_$268 )
                                              {
                                                pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                              }
                                              Values.restoreValuesFromVector( _values_$264 );
                                            }
                                            finally
                                            {
                                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$263, thread );
                                            }
                                          }
                                        }
                                        reuseP = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                        try
                                        {
                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                          _prev_bind_0_$274 = Values.getValuesAsVector();
                                          if( NIL == _prev_bind_0_$268 )
                                          {
                                            pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                          }
                                          Values.restoreValuesFromVector( _prev_bind_0_$274 );
                                        }
                                        finally
                                        {
                                          Threads.$is_thread_performing_cleanupP$.rebind( reuseP, thread );
                                        }
                                      }
                                      finally
                                      {
                                        pph_macros.$pph_problem_store_pointer$.rebind( new_format_string, thread );
                                      }
                                    }
                                    finally
                                    {
                                      pph_macros.$free_pph_problem_store_pointers$.rebind( _values_$277, thread );
                                    }
                                    if( NIL == _prev_bind_0_$265 && NIL == set.set_emptyP( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) )
                                    {
                                      _values_$277 = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
                                          $str119$Abandoning_unexpressed_negations_ )
                                      } );
                                      pph_error.pph_handle_error( _values_$277, ConsesLow.list( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) );
                                    }
                                  }
                                  finally
                                  {
                                    pph_vars.$pph_unexpressed_negations$.rebind( _prev_bind_0_$276, thread );
                                  }
                                }
                                else
                                {
                                  _prev_bind_0_$265 = pph_vars.$pph_discourse_context$.currentBinding( thread );
                                  try
                                  {
                                    pph_vars.$pph_discourse_context$.bind( pph_drs.new_pph_discourse_context(), thread );
                                    pph_macros.herald_new_discourse_context();
                                    boolean arg2514 = false;
                                    try
                                    {
                                      arg2514 = true;
                                      pph_drs.pph_ensure_discourse_participant_rms();
                                      _prev_bind_0_$276 = misc_utilities.initialized_p( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) );
                                      _values_$277 = pph_vars.$pph_unexpressed_negations$.currentBinding( thread );
                                      try
                                      {
                                        pph_vars.$pph_unexpressed_negations$.bind( NIL != _prev_bind_0_$276 ? pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread )
                                            : set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
                                        new_format_string = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                                        try
                                        {
                                          pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                                          thread.resetMultipleValues();
                                          _prev_bind_0_$268 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                                          try
                                          {
                                            pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                                            reuseP = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            boolean arg3355 = false;
                                            try
                                            {
                                              arg3355 = true;
                                              thread.resetMultipleValues();
                                              _prev_bind_0_$274 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                                              try
                                              {
                                                pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                                                _values_$275 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                _prev_bind_0_$270 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                                                try
                                                {
                                                  pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                                                  local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                                                  _prev_bind_0_$271 = memoization_state.$memoization_state$.currentBinding( thread );
                                                  try
                                                  {
                                                    memoization_state.$memoization_state$.bind( local_state, thread );
                                                    original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                                                    boolean arg4196 = false;
                                                    try
                                                    {
                                                      arg4196 = true;
                                                      pph_phrase_generate_1( phrase );
                                                      arg4196 = false;
                                                    }
                                                    finally
                                                    {
                                                      if( arg4196 )
                                                      {
                                                        final SubLObject _prev_bind_0_$2721 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                        try
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                          final SubLObject _values_$2731 = Values.getValuesAsVector();
                                                          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                                                          Values.restoreValuesFromVector( _values_$2731 );
                                                        }
                                                        finally
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2721, thread );
                                                        }
                                                      }
                                                    }
                                                    _prev_bind_0_$272 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      final SubLObject _values_$273 = Values.getValuesAsVector();
                                                      memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                                                      Values.restoreValuesFromVector( _values_$273 );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$272, thread );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    memoization_state.$memoization_state$.rebind( _prev_bind_0_$271, thread );
                                                  }
                                                }
                                                finally
                                                {
                                                  pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$270, thread );
                                                }
                                                if( _values_$275 == $kw20$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                                                {
                                                  memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                                                }
                                              }
                                              finally
                                              {
                                                pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$274, thread );
                                              }
                                              arg3355 = false;
                                            }
                                            finally
                                            {
                                              if( arg3355 )
                                              {
                                                final SubLObject _prev_bind_0_$2741 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                try
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                  final SubLObject _values_$2751 = Values.getValuesAsVector();
                                                  if( NIL == reuseP )
                                                  {
                                                    pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                                  }
                                                  Values.restoreValuesFromVector( _values_$2751 );
                                                }
                                                finally
                                                {
                                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2741, thread );
                                                }
                                              }
                                            }
                                            _prev_bind_0_$274 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                            try
                                            {
                                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                              _values_$275 = Values.getValuesAsVector();
                                              if( NIL == reuseP )
                                              {
                                                pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                                              }
                                              Values.restoreValuesFromVector( _values_$275 );
                                            }
                                            finally
                                            {
                                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$274, thread );
                                            }
                                          }
                                          finally
                                          {
                                            pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$268, thread );
                                          }
                                        }
                                        finally
                                        {
                                          pph_macros.$free_pph_problem_store_pointers$.rebind( new_format_string, thread );
                                        }
                                        if( NIL == _prev_bind_0_$276 && NIL == set.set_emptyP( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) )
                                        {
                                          new_format_string = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil
                                              .format_nil_a_no_copy( $str119$Abandoning_unexpressed_negations_ )
                                          } );
                                          pph_error.pph_handle_error( new_format_string, ConsesLow.list( pph_vars.$pph_unexpressed_negations$.getDynamicValue( thread ) ) );
                                        }
                                      }
                                      finally
                                      {
                                        pph_vars.$pph_unexpressed_negations$.rebind( _values_$277, thread );
                                      }
                                      arg2514 = false;
                                    }
                                    finally
                                    {
                                      if( arg2514 )
                                      {
                                        final SubLObject _prev_bind_0_$2761 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                        try
                                        {
                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                          final SubLObject _values_$2771 = Values.getValuesAsVector();
                                          pph_macros.herald_end_of_discourse_context();
                                          pph_macros.clear_pph_discourse_context();
                                          Values.restoreValuesFromVector( _values_$2771 );
                                        }
                                        finally
                                        {
                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2761, thread );
                                        }
                                      }
                                    }
                                    _prev_bind_0_$276 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                    try
                                    {
                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                      _values_$277 = Values.getValuesAsVector();
                                      pph_macros.herald_end_of_discourse_context();
                                      pph_macros.clear_pph_discourse_context();
                                      Values.restoreValuesFromVector( _values_$277 );
                                    }
                                    finally
                                    {
                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$276, thread );
                                    }
                                  }
                                  finally
                                  {
                                    pph_vars.$pph_discourse_context$.rebind( _prev_bind_0_$265, thread );
                                  }
                                }
                              }
                              finally
                              {
                                pph_vars.$pph_type_level_violations$.rebind( _prev_bind_4_$254, thread );
                                pph_vars.$paraphrase_mode$.rebind( _prev_bind_3_$253, thread );
                                lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_2_$252, thread );
                                pph_vars.$pph_domain_mt$.rebind( _prev_bind_1_$251, thread );
                                pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$250, thread );
                              }
                              pph_utilities.pph_pop_environment();
                              Values.restoreValuesFromVector( local_vars );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _values, thread );
                            }
                          }
                          finally
                          {
                            pph_utilities.$pph_current_environment$.rebind( _prev_bind_0_$278, thread );
                          }
                          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                          {
                            format_nil.force_format( T, $str120$__PPH_PHRASE_GENERATE_Output_list, pph_phrase.pph_phrase_output_list( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                                UNPROVIDED );
                            arg1533 = false;
                          }
                          else
                          {
                            arg1533 = false;
                          }
                        }
                        else
                        {
                          arg1533 = false;
                        }
                      }
                    }
                    finally
                    {
                      if( arg1533 )
                      {
                        final SubLObject _prev_bind_0_$2781 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values4 = Values.getValuesAsVector();
                          final SubLObject local_vars2 = conses_high.set_difference( pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED );
                          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                          {
                            format_nil.force_format( T, $str121$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue( thread ), pph_variable_handling.pph_registered_vars(),
                                UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                          pph_macros.pph_handle_local_vars( local_vars2 );
                          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                          {
                            format_nil.force_format( T, $str122$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                                UNPROVIDED );
                          }
                          Values.restoreValuesFromVector( _values4 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2781, thread );
                        }
                      }
                    }
                    _prev_bind_0_$278 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      _values = Values.getValuesAsVector();
                      local_vars = conses_high.set_difference( pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED );
                      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                      {
                        format_nil.force_format( T, $str121$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue( thread ), pph_variable_handling.pph_registered_vars(),
                            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      pph_macros.pph_handle_local_vars( local_vars );
                      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( TWO_INTEGER ) )
                      {
                        format_nil.force_format( T, $str122$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                            UNPROVIDED );
                      }
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$278, thread );
                    }
                  }
                  finally
                  {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind( _prev_bind_2_$247, thread );
                    pph_vars.$pph_noted_var_types$.rebind( _prev_bind_1_$246, thread );
                    pph_variable_handling.$pph_different_vars$.rebind( _prev_bind_0_$245, thread );
                  }
                }
                finally
                {
                  pph_vars.$pph_var_types$.rebind( _prev_bind_0_$244, thread );
                }
              }
              catch( final Throwable arg19740 )
              {
                Errors.handleThrowable( arg19740, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( ccatch_env_var, thread );
            }
          }
          catch( final Throwable arg19742 )
          {
            error_message = Errors.handleThrowable( arg19742, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( ( (SubLObject) error_message ).isString() && NIL == pph_error.suppress_pph_warningsP() )
          {
            Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( (SubLObject) error_message ), $str22$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
          }
        }
      }
      finally
      {
        pph_error.$pph_error_handling_onP$.rebind( _prev_bind_1_$207, thread );
        Errors.$continue_cerrorP$.rebind( _prev_bind_0_$206, thread );
      }
      if( NIL != error_message )
      {
        pph_phrase_possibly_generate_foolproof( phrase );
      }
    }
    finally
    {
      pph_vars.$pph_use_expansions_for_precisionP$.rebind( _prev_bind_13, thread );
      pph_vars.$generation_level$.rebind( _prev_bind_12, thread );
      wff_utilities.$check_arityP$.rebind( _prev_bind_11, thread );
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_10, thread );
      wff_vars.$validate_constantsP$.rebind( _prev_bind_9, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_8, thread );
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_7, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_6, thread );
      wff_utilities.$check_var_typesP$.rebind( _prev_bind_5, thread );
      wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_4, thread );
      wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_3, thread );
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_2, thread );
      wff_utilities.$check_arg_typesP$.rebind( _prev_bind_1, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 48257L)
  public static SubLObject pph_phrase_generate_1(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_object = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject _prev_bind_0 = pph_vars.$pph_cycls$.currentBinding( thread );
    try
    {
      pph_vars.$pph_cycls$.bind( ConsesLow.cons( v_object, pph_vars.$pph_cycls$.getDynamicValue( thread ) ), thread );
      final SubLObject doneP = pph_phrase.pph_phrase_doneP( phrase );
      if( NIL == doneP )
      {
        if( NIL != list_utilities.list_starts_with_repeating_sequenceP( pph_vars.$pph_cycls$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), THREE_INTEGER, UNPROVIDED ) )
        {
          final SubLObject new_format_string = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
              $str123$Repeating_sequence_in_paraphrase_ )
          } );
          pph_error.pph_handle_error( new_format_string, ConsesLow.list( pph_vars.$pph_cycls$.getDynamicValue( thread ) ) );
        }
        else if( NIL != pph_phrase.pph_phrase_has_dtrsP( phrase ) || NIL != pph_phrase.pph_cycl_phrase_p( phrase ) )
        {
          pph_methods_formulas.do_generate_phrase_from_template( phrase );
        }
        else if( pph_phrase.pph_phrase_category( phrase, UNPROVIDED ).eql( $const115$PossessivePhrase ) )
        {
          generate_poss_phrase( phrase );
        }
        else if( NIL != pph_ordinal_phrase_requiring_special_handlingP( phrase ) )
        {
          generate_ordinal_phrase( phrase );
        }
        else if( NIL == pph_phrase.pph_phrase_has_known_cyclP( phrase ) )
        {
          pph_phrase_resolution.pph_phrase_get_string( phrase, UNPROVIDED, UNPROVIDED );
        }
        else if( NIL != pph_methods_formulas.pph_negative_polarity_sentenceP( v_object ) )
        {
          final SubLObject _prev_bind_0_$279 = pph_vars.$pph_operator_scope_context$.currentBinding( thread );
          try
          {
            pph_vars.$pph_operator_scope_context$.bind( ConsesLow.cons( $kw124$NO, pph_vars.$pph_operator_scope_context$.getDynamicValue( thread ) ), thread );
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str125$Inside_operator_scope__S, $kw124$NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            pph_phrase_try_methods( phrase );
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str126$Leaving_operator_scope__S, $kw124$NO, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
          finally
          {
            pph_vars.$pph_operator_scope_context$.rebind( _prev_bind_0_$279, thread );
          }
        }
        else
        {
          pph_phrase_try_methods( phrase );
        }
      }
    }
    finally
    {
      pph_vars.$pph_cycls$.rebind( _prev_bind_0, thread );
    }
    if( NIL == pph_phrase.pph_phrase_doneP( phrase ) )
    {
      pph_phrase_possibly_generate_foolproof( phrase );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 49459L)
  public static SubLObject pph_skip_methodP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != pph_macros.$suspended_paraphrase_methods$.getDynamicValue( thread ) && NIL != pph_skip_methodP_internal( $pph_method_stack$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 49596L)
  public static SubLObject pph_skip_methodP_internal(final SubLObject current)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return pph_skip_methodP_internal_two( current, pph_macros.$suspended_paraphrase_methods$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 49729L)
  public static SubLObject pph_skip_methodP_internal_two(final SubLObject current, final SubLObject suspended)
  {
    final SubLObject skipP = set.set_memberP( current, suspended );
    if( NIL != skipP && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str127$Skipping__S___, current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return skipP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 49927L)
  public static SubLObject pph_truncate_method_context(final SubLObject method, SubLObject leave_top)
  {
    if( leave_top == UNPROVIDED )
    {
      leave_top = ONE_INTEGER;
    }
    return pph_ntruncate_method_context( method, leave_top );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 50091L)
  public static SubLObject pph_ntruncate_method_context(final SubLObject method, final SubLObject leave_top)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == conses_high.getf( method, $kw128$CONTEXT, UNPROVIDED ) )
    {
      return Values.values( method, ZERO_INTEGER );
    }
    if( !leave_top.isPositive() )
    {
      return Values.values( conses_high.remf( method, $kw128$CONTEXT ), ZERO_INTEGER );
    }
    final SubLObject matrix_method = conses_high.getf( method, $kw128$CONTEXT, NIL );
    if( NIL == matrix_method )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject truncated_matrix_method = pph_ntruncate_method_context( matrix_method, leave_top );
    final SubLObject depth = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( leave_top.numG( depth ) )
    {
      return Values.values( conses_high.putf( method, $kw128$CONTEXT, truncated_matrix_method ), number_utilities.f_1X( depth ) );
    }
    return Values.values( conses_high.putf( method, $kw128$CONTEXT, conses_high.getf( truncated_matrix_method, $kw128$CONTEXT, UNPROVIDED ) ), depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 50759L)
  public static SubLObject pph_phrase_try_methods(final SubLObject phrase)
  {
    final SubLObject v_object = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    final SubLObject v_methods = pph_types.get_paraphrase_methods( v_object );
    return pph_phrase_try_these_methods( phrase, v_methods );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 51089L)
  public static SubLObject pph_phrase_try_these_methods(final SubLObject phrase, final SubLObject v_methods)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_object = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    SubLObject successful_method = NIL;
    final SubLObject backup_phrase = ( NIL != pph_macros.handling_pph_method_failures_p() && NIL == pph_vars.pph_generate_alternative_phrasesP() ) ? $kw129$DONT_NEED_BACKUP_PHRASE
        : pph_phrase.pph_phrase_create_backup( phrase );
    final SubLObject dtr_demerits = Numbers.subtract( pph_phrase.pph_phrase_demerits( phrase ), pph_phrase.pph_phrase_top_level_demerits( phrase ) );
    final SubLObject best_method = v_methods.first();
    final SubLObject minimum_demerits = conses_high.second( best_method );
    SubLObject failed_zero_demerit_methods = NIL;
    if( !ZERO_INTEGER.eql( minimum_demerits ) )
    {
      pph_phrase.pph_phrase_maybe_note_problem( phrase, $sym130$PPH_PHRASE_TRY_METHODS, $kw131$NO_ZERO_DEMERIT_METHODS, ConsesLow.list( $kw132$CYCL, v_object, $kw133$BEST_METHOD, best_method ) );
    }
    SubLObject remaining;
    SubLObject method;
    SubLObject current;
    SubLObject datum;
    SubLObject method_symbol;
    SubLObject method_demerits;
    SubLObject timed_outP;
    SubLObject method_failure;
    SubLObject old_pph_method_stack;
    SubLObject _prev_bind_0;
    SubLObject current_phrase;
    SubLObject time;
    SubLObject time_var;
    SubLObject _prev_bind_0_$280;
    SubLObject _prev_bind_2;
    SubLObject _prev_bind_3;
    SubLObject _prev_bind_0_$281;
    for( remaining = NIL, remaining = v_methods; NIL != remaining && ( NIL == successful_method || NIL != pph_vars.pph_generate_alternative_phrasesP() ); remaining = remaining.rest() )
    {
      method = remaining.first();
      datum = ( current = method );
      method_symbol = NIL;
      method_demerits = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
      method_symbol = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list134 );
      method_demerits = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == misc_utilities.initialized_p( pph_vars.$pph_phrase_methods$.getDynamicValue( thread ) ) || NIL == subl_promotions.memberP( method_symbol, dictionary.dictionary_lookup_without_values(
            pph_vars.$pph_phrase_methods$.getDynamicValue( thread ), phrase, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
        {
          if( NIL != misc_utilities.initialized_p( pph_vars.$pph_phrase_methods$.getDynamicValue( thread ) ) )
          {
            dictionary_utilities.dictionary_push( pph_vars.$pph_phrase_methods$.getDynamicValue( thread ), phrase, method_symbol );
          }
          if( !method_symbol.isSymbol() || NIL == Symbols.fboundp( method_symbol ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
            {
              Errors.warn( $str135$_S_is_not_an_FBOUNDP_symbol_, method_symbol );
              streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
            }
          }
          else if( NIL != pph_vars.pph_too_many_demerits_p( Numbers.add( dtr_demerits, method_demerits ), UNPROVIDED ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
            {
              Errors.warn( $str136$___S_demerits_exceeds_cutoff_of__, new SubLObject[] { Numbers.add( dtr_demerits, method_demerits ), pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread ), method_demerits, method,
                dtr_demerits
              } );
              streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
            }
          }
          else
          {
            timed_outP = NIL;
            method_failure = NIL;
            old_pph_method_stack = $pph_method_stack$.getDynamicValue( thread );
            _prev_bind_0 = $pph_method_stack$.currentBinding( thread );
            try
            {
              $pph_method_stack$.bind( ConsesLow.list( new SubLObject[] { $kw137$METHOD, method_symbol, $kw132$CYCL, v_object, $kw138$AGR_PREDS, pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED ), $kw139$CATEGORY,
                pph_phrase.pph_phrase_category( phrase, UNPROVIDED ), $kw140$DEMERIT_CUTOFF, pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread )
              } ), thread );
              if( NIL != old_pph_method_stack )
              {
                $pph_method_stack$.setDynamicValue( pph_truncate_method_context( conses_high.putf( $pph_method_stack$.getDynamicValue( thread ), $kw128$CONTEXT, old_pph_method_stack ), UNPROVIDED ), thread );
              }
              if( NIL == pph_skip_methodP() )
              {
                if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                {
                  format_nil.force_format( T, $str141$__Trying__S___Remaining___S, method, remaining, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                current_phrase = ( ( NIL != pph_phrase.pph_phrase_doneP( phrase ) ) ? pph_phrase.pph_phrase_copy( backup_phrase, NIL, NIL ) : phrase );
                time = NIL;
                time_var = Time.get_internal_real_time();
                _prev_bind_0_$280 = pph_macros.$pph_timeout_time_check_count$.currentBinding( thread );
                _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding( thread );
                _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding( thread );
                try
                {
                  pph_macros.$pph_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
                  pph_macros.$pph_timeout_time$.bind( pph_macros.pph_compute_timeout_time( NIL ), thread );
                  pph_macros.$pph_timeout_reachedP$.bind( pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ), thread );
                  pph_macros.$pph_timeout_reachedP$.setDynamicValue( pph_macros.pph_timeout_time_reachedP(), thread );
                  if( NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ) )
                  {
                    try
                    {
                      thread.throwStack.push( $kw16$PPH_METHOD_FAILURE );
                      _prev_bind_0_$281 = $currently_metered_pph_phrase_methods$.currentBinding( thread );
                      try
                      {
                        $currently_metered_pph_phrase_methods$.bind( ConsesLow.cons( method_symbol, $currently_metered_pph_phrase_methods$.getDynamicValue( thread ) ), thread );
                        pph_phrase_try_method( current_phrase, method_symbol, method_demerits, backup_phrase );
                      }
                      finally
                      {
                        $currently_metered_pph_phrase_methods$.rebind( _prev_bind_0_$281, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      method_failure = Errors.handleThrowable( ccatch_env_var, $kw16$PPH_METHOD_FAILURE );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                  }
                  timed_outP = pph_macros.pph_timeout_time_reachedP();
                }
                finally
                {
                  pph_macros.$pph_timeout_reachedP$.rebind( _prev_bind_3, thread );
                  pph_macros.$pph_timeout_time$.rebind( _prev_bind_2, thread );
                  pph_macros.$pph_timeout_time_check_count$.rebind( _prev_bind_0_$280, thread );
                }
                time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                if( NIL != misc_utilities.initialized_p( $pph_phrase_method_times$.getDynamicValue( thread ) ) && NIL == subl_promotions.memberP( method_symbol, $currently_metered_pph_phrase_methods$.getDynamicValue(
                    thread ), UNPROVIDED, UNPROVIDED ) )
                {
                  dictionary_utilities.dictionary_increment( $pph_phrase_method_times$.getDynamicValue( thread ), method_symbol, time );
                }
                if( current_phrase.eql( phrase ) && NIL != pph_phrase.pph_phrase_doneP( current_phrase ) )
                {
                  successful_method = method_symbol;
                }
                else if( NIL != pph_phrase.pph_phrase_doneP( current_phrase ) )
                {
                  pph_phrase.pph_phrase_add_alternative( phrase, current_phrase );
                }
                else if( NIL != pph_vars.pph_problem_reporting_on_p() && method_demerits.isZero() )
                {
                  failed_zero_demerit_methods = ConsesLow.cons( method_symbol, failed_zero_demerit_methods );
                }
                if( NIL != timed_outP )
                {
                  pph_phrase.pph_phrase_maybe_note_problem( phrase, $sym130$PPH_PHRASE_TRY_METHODS, $kw142$TOO_MUCH_TIME, UNPROVIDED );
                  if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
                  {
                    Errors.warn( $str143$Exceeded_timeout_on____S, current_phrase );
                    streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
                  }
                  pph_abort();
                }
                if( NIL != method_failure && NIL != remaining )
                {
                  pph_macros.throw_pph_method_failure( method_failure );
                }
              }
            }
            finally
            {
              $pph_method_stack$.rebind( _prev_bind_0, thread );
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list134 );
      }
    }
    if( $kw144$VERBOSE == pph_vars.$pph_problem_reporting_mode$.getDynamicValue( thread ) && ( NIL == pph_phrase.pph_phrase_doneP( phrase ) || pph_phrase.pph_phrase_top_level_demerits( phrase ).isPositive() )
        && NIL != failed_zero_demerit_methods )
    {
      pph_phrase_report_problems( phrase, failed_zero_demerit_methods, successful_method );
    }
    pph_phrase.pph_phrase_maybe_dump_problem_reports( phrase, UNPROVIDED );
    return Values.values( pph_phrase.pph_phrase_output_list( phrase ), successful_method );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 55162L)
  public static SubLObject pph_abort()
  {
    final SubLObject new_format_string = Sequences.cconcatenate( $str17$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str18$__, format_nil.format_nil_a_no_copy(
        $str145$Aborting_PPH_call___ )
    } );
    pph_error.pph_handle_error( new_format_string, ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 55246L)
  public static SubLObject pph_phrase_report_problems(final SubLObject phrase, final SubLObject failed_zero_demerit_methods, final SubLObject successful_method)
  {
    final SubLObject v_object = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    if( ( NIL == pph_phrase.pph_phrase_doneP( phrase ) || pph_phrase.pph_phrase_top_level_demerits( phrase ).isPositive() ) && NIL != failed_zero_demerit_methods )
    {
      Errors.warn( $str146$Zero_demerit_methods_failed____In, v_object, pph_phrase.pph_phrase_agr_preds( phrase, UNPROVIDED ) );
      SubLObject cdolist_list_var = failed_zero_demerit_methods;
      SubLObject failed_method = NIL;
      failed_method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject problems = pph_phrase.pph_phrase_reporter_problems( phrase, failed_method );
        PrintLow.format( T, $str147$_____S____Reported_Problems___S__, failed_method, problems );
        cdolist_list_var = cdolist_list_var.rest();
        failed_method = cdolist_list_var.first();
      }
      if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
      {
        PrintLow.format( T, $str148$___Successful_method___S__demerit, new SubLObject[] { successful_method, pph_phrase.pph_phrase_top_level_demerits( phrase ), pph_phrase.pph_phrase_string( phrase, UNPROVIDED )
        } );
      }
      pph_print_context( UNPROVIDED );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 56167L)
  public static SubLObject pph_print_context(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( stream, $str149$__Context____Top_level_CycL___S__, new SubLObject[] { pph_vars.pph_top_level_cycl(), pph_vars.$pph_language_mt$.getDynamicValue( thread ), pph_vars.$pph_domain_mt$.getDynamicValue(
        thread ), pph_vars.$paraphrase_mode$.getDynamicValue( thread )
    } );
    if( NIL != pph_vars.$paraphrase_precision$.getDynamicValue( thread ) )
    {
      PrintLow.format( stream, $str150$_Precision___S__, pph_vars.$paraphrase_precision$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 56526L)
  public static SubLObject pph_phrase_try_method(final SubLObject phrase, final SubLObject method_symbol, final SubLObject method_demerits, final SubLObject backup_phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str151$__Trying__S_____, $pph_method_stack$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject var_types_shadow = dictionary_utilities.copy_dictionary( pph_vars.$pph_var_types$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = pph_vars.$pph_noted_var_types$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_macros.$pph_var_types_counter$.currentBinding( thread );
    try
    {
      pph_vars.$pph_noted_var_types$.bind( ( NIL != dictionary.dictionary_p( pph_vars.$pph_noted_var_types$.getDynamicValue( thread ) ) ) ? pph_vars.$pph_noted_var_types$.getDynamicValue( thread )
          : dictionary.new_dictionary( Symbols.symbol_function( EQL ), SIXTEEN_INTEGER ), thread );
      pph_macros.$pph_var_types_counter$.bind( number_utilities.f_1X( pph_macros.$pph_var_types_counter$.getDynamicValue( thread ) ), thread );
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
      {
        format_nil.force_format( T, $str152$__Entering_PPH_SETTING_VAR_TYPES_, pph_macros.$pph_var_types_counter$.getDynamicValue( thread ), dictionary.dictionary_values( pph_vars.$pph_var_types$.getDynamicValue(
            thread ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      try
      {
        final SubLObject _prev_bind_0_$282 = pph_vars.$pph_var_types$.currentBinding( thread );
        try
        {
          pph_vars.$pph_var_types$.bind( var_types_shadow, thread );
          final SubLObject _prev_bind_0_$283 = Errors.$continue_cerrorP$.currentBinding( thread );
          final SubLObject _prev_bind_1_$284 = pph_error.$pph_error_handling_onP$.currentBinding( thread );
          try
          {
            Errors.$continue_cerrorP$.bind( NIL, thread );
            pph_error.$pph_error_handling_onP$.bind( T, thread );
            if( NIL != pph_error.pph_break_on_errorP() )
            {
              if( method_demerits.isPositive() )
              {
                if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
                {
                  Errors.warn( $str153$__Adding__S_demerits_for__S____S, method_demerits, method_symbol, phrase );
                  streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
                }
                pph_phrase.pph_phrase_set_top_level_demerits( phrase, Numbers.add( pph_phrase.pph_phrase_demerits( ( NIL != pph_phrase.pph_phrase_p( backup_phrase, UNPROVIDED ) ) ? backup_phrase : phrase ),
                    method_demerits ), method_symbol );
              }
              if( NIL != pph_error.pph_trace_level_exceeds_minimumP( THREE_INTEGER ) )
              {
                format_nil.force_format( T, $str154$__PPH_phrase_immediately_before_c, method_symbol, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              pph_methods.funcall_pph_method( method_symbol, phrase );
              if( NIL != pph_error.pph_trace_level_exceeds_minimumP( THREE_INTEGER ) )
              {
                format_nil.force_format( T, $str155$__PPH_phrase_immediately_after_ca, method_symbol, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              if( NIL == pph_phrase.pph_phrase_doneP( phrase ) || error_message.isString() || NIL != pph_vars.pph_too_many_demerits_p( pph_phrase.pph_phrase_demerits( phrase ), UNPROVIDED ) )
              {
                if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                {
                  format_nil.force_format( T, $str156$_S_failed_, method_symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                if( NIL != pph_macros.handling_pph_method_failures_p() )
                {
                  pph_macros.throw_pph_method_failure( $pph_method_stack$.getDynamicValue( thread ) );
                }
                else
                {
                  pph_phrase.pph_phrase_revert_to_backup( phrase, backup_phrase );
                }
              }
            }
            else
            {
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0_$284 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym21$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    if( method_demerits.isPositive() )
                    {
                      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
                      {
                        Errors.warn( $str153$__Adding__S_demerits_for__S____S, method_demerits, method_symbol, phrase );
                        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
                      }
                      pph_phrase.pph_phrase_set_top_level_demerits( phrase, Numbers.add( pph_phrase.pph_phrase_demerits( ( NIL != pph_phrase.pph_phrase_p( backup_phrase, UNPROVIDED ) ) ? backup_phrase : phrase ),
                          method_demerits ), method_symbol );
                    }
                    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( THREE_INTEGER ) )
                    {
                      format_nil.force_format( T, $str154$__PPH_phrase_immediately_before_c, method_symbol, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    pph_methods.funcall_pph_method( method_symbol, phrase );
                    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( THREE_INTEGER ) )
                    {
                      format_nil.force_format( T, $str155$__PPH_phrase_immediately_after_ca, method_symbol, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    if( NIL == pph_phrase.pph_phrase_doneP( phrase ) || error_message.isString() || NIL != pph_vars.pph_too_many_demerits_p( pph_phrase.pph_phrase_demerits( phrase ), UNPROVIDED ) )
                    {
                      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
                      {
                        format_nil.force_format( T, $str156$_S_failed_, method_symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      if( NIL != pph_macros.handling_pph_method_failures_p() )
                      {
                        pph_macros.throw_pph_method_failure( $pph_method_stack$.getDynamicValue( thread ) );
                      }
                      else
                      {
                        pph_phrase.pph_phrase_revert_to_backup( phrase, backup_phrase );
                      }
                    }
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0_$284, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
              if( error_message.isString() && NIL == pph_error.suppress_pph_warningsP() )
              {
                Errors.warn( Sequences.cconcatenate( pph_error_message_truncator.truncate_pph_error_message( error_message ), $str22$___Top_level_CycL___S ), pph_vars.pph_top_level_cycl() );
              }
            }
          }
          finally
          {
            pph_error.$pph_error_handling_onP$.rebind( _prev_bind_1_$284, thread );
            Errors.$continue_cerrorP$.rebind( _prev_bind_0_$283, thread );
          }
          final SubLObject total_demerits = pph_phrase.pph_phrase_demerits( phrase );
          if( NIL == error_message )
          {
            if( NIL != pph_vars.pph_too_many_demerits_p( total_demerits, UNPROVIDED ) )
            {
              if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
              {
                Errors.warn( $str157$___S_demerits_exceeds_cutoff_of__, total_demerits, pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread ), phrase );
                streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
              }
            }
            else if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
            {
              if( NIL != subl_promotions.positive_integer_p( total_demerits ) && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
              {
                format_nil.force_format( T, $str158$___S_____S_demerits___S___, pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ), pph_phrase.pph_phrase_output_list( phrase ), total_demerits, UNPROVIDED, UNPROVIDED,
                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              pph_phrase.pph_phrase_add_justification( phrase, pph_phrase.pph_code_justification( method_symbol, UNPROVIDED ) );
              if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
              {
                format_nil.force_format( T, $str159$____S__S______S___S__, method_symbol, pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ), pph_phrase.pph_phrase_output_list( phrase ), pph_phrase.pph_phrase_agr_pred(
                    phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            else if( NIL != pph_error.pph_trace_level_exceeds_minimumP( THREE_INTEGER ) )
            {
              format_nil.force_format( T, $str160$____S__S______S, method_symbol, pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ), pph_phrase.pph_phrase_output_list( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
                  UNPROVIDED, UNPROVIDED );
            }
          }
        }
        finally
        {
          pph_vars.$pph_var_types$.rebind( _prev_bind_0_$282, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$285 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str161$__Leaving_PPH_SETTING_VAR_TYPES_I, pph_macros.$pph_var_types_counter$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED );
          }
          if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
          {
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str162$___Output_list___S__, pph_phrase.pph_phrase_output_list( phrase ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
            {
              format_nil.force_format( T, $str163$___Setting__S_to____S, pph_vars.$pph_var_types$.getDynamicValue( thread ), dictionary.dictionary_values( var_types_shadow ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
                  UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            pph_macros.pph_reset_var_types( var_types_shadow );
          }
          else if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
          {
            format_nil.force_format( T, $str164$___Leaving__PPH_VAR_TYPES___S, dictionary.dictionary_values( pph_vars.$pph_var_types$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$285, thread );
        }
      }
    }
    finally
    {
      pph_macros.$pph_var_types_counter$.rebind( _prev_bind_2, thread );
      pph_vars.$pph_noted_var_types$.rebind( _prev_bind_0, thread );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 58731L)
  public static SubLObject pph_phrase_possibly_generate_foolproof(final SubLObject phrase)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread ).isInteger() )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
      {
        Errors.warn( $str165$Can_t_use_foolproof_generation_wi, pph_vars.$pph_demerit_cutoff$.getDynamicValue( thread ) );
        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
      }
    }
    else if( NIL == pph_phrase.pph_phrase_has_known_cyclP( phrase ) )
    {
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
      {
        Errors.warn( $str166$Can_t_use_foolproof_generation_on );
        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
      }
    }
    else
    {
      pph_phrase.pph_phrase_set_string( phrase, string_utilities.str_by_type( pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ) ) );
    }
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 59295L)
  public static SubLObject generate_poss_phrase(final SubLObject phrase)
  {
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      return phrase;
    }
    pph_phrase.pph_phrase_set_category_to_np( phrase );
    pph_phrase_generate( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      possessivize_pph_phrase( phrase );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 59612L)
  public static SubLObject possessivize_pph_phrase(final SubLObject phrase)
  {
    final SubLObject output_list = pph_phrase.pph_phrase_output_list( phrase );
    SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy( list_utilities.last_one( output_list ) );
    SubLObject doneP = NIL;
    final SubLObject the_cycl = pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED );
    SubLObject use_possessive_pronounP = NIL;
    if( NIL != pph_phrase.pph_known_cycl_p( the_cycl ) && NIL != list_utilities.singletonP( output_list ) )
    {
      final SubLObject binders_of_phrase = pph_phrase_resolution.pph_phrase_could_bind_possessive_here( phrase );
      final SubLObject binders_cycls = pph_phrase.pph_phrase_cycls_of_phrases( binders_of_phrase );
      use_possessive_pronounP = subl_promotions.memberP( the_cycl, binders_cycls, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != pph_utilities.pph_english_contextP( UNPROVIDED ) && NIL != pph_phrase.pph_phrase_mother( phrase ) && NIL != pph_phrase.pph_phrase_npP( pph_phrase.pph_phrase_mother( phrase ) ) && TWO_INTEGER.eql(
        pph_phrase.pph_phrase_dtr_count( pph_phrase.pph_phrase_mother( phrase ) ) ) && phrase.eql( pph_phrase.pph_phrase_nth_dtr( pph_phrase.pph_phrase_mother( phrase ), ZERO_INTEGER ) ) && NIL != pph_phrase
            .pph_phrase_nbarP( pph_phrase.pph_phrase_nth_dtr( pph_phrase.pph_phrase_mother( phrase ), ONE_INTEGER ) ) && ( NIL != pph_phrase.pph_heavy_npP( phrase ) || ( ONE_INTEGER.eql( pph_phrase.pph_phrase_dtr_count(
                phrase ) ) && NIL != pph_phrase.pph_heavy_npP( pph_phrase.pph_phrase_nth_dtr( phrase, ZERO_INTEGER ) ) ) ) )
    {
      pph_phrase.set_pph_phrase_dtrs_from_list( pph_phrase.pph_phrase_mother( phrase ), ConsesLow.list( pph_data_structures.new_pph_phrase( $str167$the, UNPROVIDED, UNPROVIDED ), pph_phrase.pph_phrase_nth_dtr( pph_phrase
          .pph_phrase_mother( phrase ), ONE_INTEGER ), pph_data_structures.new_pph_phrase( $str168$of, UNPROVIDED, UNPROVIDED ), pph_phrase.pph_phrase_nth_dtr( pph_phrase.pph_phrase_mother( phrase ), ZERO_INTEGER ) ),
          UNPROVIDED );
      doneP = T;
    }
    else if( NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p( new_item ) )
    {
      final SubLObject apostrophe_item = pph_question.new_pph_phrase_filler_item( $str169$_s );
      final SubLObject existing_olists = pph_data_structures.pph_phrase_output_item_nospace_group_items( new_item );
      pph_data_structures.pph_phrase_output_item_nospace_group_set_items( new_item, ConsesLow.append( existing_olists, ConsesLow.list( ConsesLow.list( apostrophe_item ) ) ) );
    }
    else if( NIL != use_possessive_pronounP )
    {
      final SubLObject string = pph_possessive_pronoun_for_cycl( the_cycl );
      if( NIL != pph_string.pph_string_p( string ) )
      {
        pph_data_structures.pph_phrase_output_item_set_string( new_item, string );
        pph_data_structures.pph_phrase_output_item_set_agr_pred( new_item, $const170$pronounStrings );
      }
    }
    else
    {
      new_item = pph_methods_formulas.pph_possessivize_output_item( new_item );
    }
    if( NIL == doneP )
    {
      pph_phrase.pph_phrase_set_output_list( phrase, list_utilities.replace_last( output_list, new_item ), UNPROVIDED );
    }
    SubLObject cdolist_list_var = pph_phrase.pph_phrase_alternatives( phrase );
    SubLObject alternative = NIL;
    alternative = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      possessivize_pph_phrase( alternative );
      cdolist_list_var = cdolist_list_var.rest();
      alternative = cdolist_list_var.first();
    }
    pph_phrase.pph_phrase_set_category( phrase, $const115$PossessivePhrase, UNPROVIDED );
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 62213L)
  public static SubLObject pph_possessive_pronoun_for_cycl(final SubLObject the_cycl)
  {
    final SubLObject person = pph_methods.pph_person( the_cycl );
    final SubLObject number = pph_methods.pph_number( the_cycl );
    final SubLObject gender = pph_methods.pph_gender( the_cycl );
    final SubLObject pronoun_nart = pph_methods_lexicon.pph_pronoun_nart( pph_methods_lexicon.new_pph_pronoun_agr( person, number, gender ), $const171$PossessivePronoun_Post );
    return generate_phrase_no_checks( pronoun_nart, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 62549L)
  public static SubLObject pph_ordinal_phrase_requiring_special_handlingP(final SubLObject phrase)
  {
    return makeBoolean( NIL != pph_phrase.pph_ordinal_phraseP( phrase ) && !pph_phrase.pph_phrase_cycl( phrase, UNPROVIDED ).isNumber() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 62715L)
  public static SubLObject generate_ordinal_phrase(final SubLObject phrase)
  {
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      return phrase;
    }
    pph_phrase.pph_phrase_set_category( phrase, pph_utilities.pph_nbar_category(), UNPROVIDED );
    pph_phrase_generate( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != pph_phrase.pph_phrase_doneP( phrase ) )
    {
      ordinalize_pph_phrase( phrase );
    }
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 63039L)
  public static SubLObject ordinalize_pph_phrase(final SubLObject phrase)
  {
    pph_phrase.pph_phrase_set_category( phrase, $const172$OrdinalPhrase, UNPROVIDED );
    final SubLObject output_list = pph_phrase.pph_phrase_output_list( phrase );
    final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy( list_utilities.last_one( output_list ) );
    if( NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p( new_item ) )
    {
      final SubLObject suffix_item = pph_question.new_pph_phrase_filler_item( $str173$th );
      final SubLObject existing_olists = pph_data_structures.pph_phrase_output_item_nospace_group_items( new_item );
      pph_data_structures.pph_phrase_output_item_nospace_group_set_items( new_item, ConsesLow.append( existing_olists, ConsesLow.list( ConsesLow.list( suffix_item ) ) ) );
    }
    else
    {
      final SubLObject ordinalized_string = pph_methods_formulas.ordinal_form( pph_data_structures.pph_phrase_output_item_string( new_item ) );
      pph_data_structures.pph_phrase_output_item_set_string( new_item, ordinalized_string );
    }
    pph_phrase.pph_phrase_set_output_list( phrase, list_utilities.replace_last( output_list, new_item ), UNPROVIDED );
    return pph_phrase.pph_phrase_output_list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 63944L)
  public static SubLObject with_output_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym178$CLET, $list179, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 63944L)
  public static SubLObject do_output_list_test_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_set = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list180 );
    v_set = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$287 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list180 );
      current_$287 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list180 );
      if( NIL == conses_high.member( current_$287, $list181, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$287 == $kw182$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list180 );
    }
    final SubLObject forces_tail = cdestructuring_bind.property_list_member( $kw183$FORCES, current );
    final SubLObject forces = ( NIL != forces_tail ) ? conses_high.cadr( forces_tail ) : NIL;
    final SubLObject do_imperative_tail = cdestructuring_bind.property_list_member( $kw184$DO_IMPERATIVE, current );
    final SubLObject do_imperative = ( NIL != do_imperative_tail ) ? conses_high.cadr( do_imperative_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym185$DO_PPH_REGRESSION_STORE, reader.bq_cons( v_set, $list186 ), ConsesLow.list( $sym187$DO_PPH_FORCES_LIST, ConsesLow.list( $kw183$FORCES, forces, $kw184$DO_IMPERATIVE, do_imperative ),
        ConsesLow.list( $sym188$WITH_PPH_TEST_OBJECT, reader.bq_cons( $sym189$WITH_OUTPUT_LIST, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-main.lisp", position = 63944L)
  public static SubLObject do_core_output_list_regression(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    return $list190;
  }

  public static SubLObject declare_pph_main_file()
  {
    SubLFiles.declareFunction( me, "generate_phrase", "GENERATE-PHRASE", 1, 7, false );
    SubLFiles.declareFunction( me, "generate_phrase_no_checks", "GENERATE-PHRASE-NO-CHECKS", 1, 7, false );
    SubLFiles.declareFunction( me, "generate_phrase_no_checks_memoized_internal", "GENERATE-PHRASE-NO-CHECKS-MEMOIZED-INTERNAL", 9, 0, false );
    SubLFiles.declareFunction( me, "generate_phrase_no_checks_memoized", "GENERATE-PHRASE-NO-CHECKS-MEMOIZED", 9, 0, false );
    SubLFiles.declareFunction( me, "generate_string_from_phrase_naut", "GENERATE-STRING-FROM-PHRASE-NAUT", 1, 3, false );
    SubLFiles.declareFunction( me, "generate_good_string_from_phrase_naut", "GENERATE-GOOD-STRING-FROM-PHRASE-NAUT", 1, 3, false );
    SubLFiles.declareFunction( me, "generate_phrase_for_java", "GENERATE-PHRASE-FOR-JAVA", 1, 5, false );
    SubLFiles.declareFunction( me, "cached_paraphrase_for_java", "CACHED-PARAPHRASE-FOR-JAVA", 1, 1, false );
    SubLFiles.declareFunction( me, "cached_disambiguation_paraphrases_for_java", "CACHED-DISAMBIGUATION-PARAPHRASES-FOR-JAVA", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_phrase_for_java_no_checks", "GENERATE-PHRASE-FOR-JAVA-NO-CHECKS", 1, 5, false );
    SubLFiles.declareFunction( me, "gen_template_query_sentence_assertion_p", "GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_phrase_int", "GENERATE-PHRASE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_disambiguation_phrase", "GENERATE-DISAMBIGUATION-PHRASE", 1, 5, false );
    SubLFiles.declareFunction( me, "generate_disambiguation_phrases", "GENERATE-DISAMBIGUATION-PHRASES", 1, 6, false );
    SubLFiles.declareFunction( me, "use_cached_generations_p", "USE-CACHED-GENERATIONS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_disambiguation_phrases_for_java", "GENERATE-DISAMBIGUATION-PHRASES-FOR-JAVA", 1, 6, false );
    SubLFiles.declareFunction( me, "alphabetize_pph_javalists", "ALPHABETIZE-PPH-JAVALISTS", 2, 1, false );
    SubLFiles.declareFunction( me, "generate_disambiguation_phrases_int", "GENERATE-DISAMBIGUATION-PHRASES-INT", 1, 7, false );
    SubLFiles.declareFunction( me, "pph_blacklist_for_objects_and_strings", "PPH-BLACKLIST-FOR-OBJECTS-AND-STRINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_disambiguation_phrases_and_types", "GENERATE-DISAMBIGUATION-PHRASES-AND-TYPES", 1, 5, false );
    SubLFiles.declareFunction( me, "generate_assertion_output_list", "GENERATE-ASSERTION-OUTPUT-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_pph_output_list", "GENERATE-PPH-OUTPUT-LIST", 1, 5, false );
    SubLFiles.declareFunction( me, "generate_pph_output_list_no_checks", "GENERATE-PPH-OUTPUT-LIST-NO-CHECKS", 1, 5, false );
    SubLFiles.declareFunction( me, "generate_pph_output_list_internal", "GENERATE-PPH-OUTPUT-LIST-INTERNAL", 7, 0, false );
    SubLFiles.declareFunction( me, "generate_pph_output_lists_for_term", "GENERATE-PPH-OUTPUT-LISTS-FOR-TERM", 1, 6, false );
    SubLFiles.declareFunction( me, "generate_pph_string_combo_for_term", "GENERATE-PPH-STRING-COMBO-FOR-TERM", 1, 6, false );
    SubLFiles.declareFunction( me, "pph_phrase_with_alternatives_for_term", "PPH-PHRASE-WITH-ALTERNATIVES-FOR-TERM", 7, 0, false );
    SubLFiles.declareFunction( me, "pph_sanitize_output_list", "PPH-SANITIZE-OUTPUT-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_sanitize_output_item", "PPH-SANITIZE-OUTPUT-ITEM", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_output_item_strip_anchor_tags", "PPH-PHRASE-OUTPUT-ITEM-STRIP-ANCHOR-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_strip_anchor_tags", "PPH-STRIP-ANCHOR-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_for_arg_position", "PPH-STRING-FOR-ARG-POSITION", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_output_list_arg_position_precedesP", "PPH-OUTPUT-LIST-ARG-POSITION-PRECEDES?", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_agr_pred_for_arg_position", "PPH-AGR-PRED-FOR-ARG-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_text_wXsentential_force", "GENERATE-TEXT-W/SENTENTIAL-FORCE", 1, 6, false );
    SubLFiles.declareFunction( me, "valid_pph_language_mt_specifierP", "VALID-PPH-LANGUAGE-MT-SPECIFIER?", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_note_bad_generate_text_result", "MAYBE-NOTE-BAD-GENERATE-TEXT-RESULT", 9, 1, false );
    SubLFiles.declareFunction( me, "note_bad_generate_text_result", "NOTE-BAD-GENERATE-TEXT-RESULT", 9, 1, false );
    SubLFiles.declareFunction( me, "output_generate_text_bad_results", "OUTPUT-GENERATE-TEXT-BAD-RESULTS", 0, 0, false );
    SubLFiles.declareFunction( me, "output_generate_text_bad_results_to_tsv", "OUTPUT-GENERATE-TEXT-BAD-RESULTS-TO-TSV", 0, 0, false );
    SubLFiles.declareFunction( me, "recheck_generate_text_bad_results", "RECHECK-GENERATE-TEXT-BAD-RESULTS", 0, 0, false );
    SubLFiles.declareFunction( me, "generate_text_wXsentential_force_no_checks", "GENERATE-TEXT-W/SENTENTIAL-FORCE-NO-CHECKS", 1, 6, false );
    SubLFiles.declareFunction( me, "pph_discourse_referent_tracking_pointlessP", "PPH-DISCOURSE-REFERENT-TRACKING-POINTLESS?", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_text_wXsentential_force_int", "GENERATE-TEXT-W/SENTENTIAL-FORCE-INT", 6, 1, false );
    SubLFiles.declareFunction( me, "generate_text_wXsentential_force_and_focus_argnum", "GENERATE-TEXT-W/SENTENTIAL-FORCE-AND-FOCUS-ARGNUM", 2, 5, false );
    SubLFiles.declareFunction( me, "generate_text", "GENERATE-TEXT", 1, 5, false );
    SubLFiles.declareFunction( me, "generate_poss", "GENERATE-POSS", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_generate_string_from_cycl", "PPH-PHRASE-GENERATE-STRING-FROM-CYCL", 1, 2, false );
    SubLFiles.declareFunction( me, "set_pph_initialized", "SET-PPH-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_initializedP", "PPH-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_pph_initialized", "ENSURE-PPH-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_paraphrase_cycl", "INITIALIZE-PARAPHRASE-CYCL", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_paraphrase_caches", "CLEAR-PARAPHRASE-CACHES", 0, 2, false );
    SubLFiles.declareFunction( me, "pph_phrase_generate", "PPH-PHRASE-GENERATE", 1, 3, false );
    SubLFiles.declareFunction( me, "pph_phrase_generate_1", "PPH-PHRASE-GENERATE-1", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_skip_methodP", "PPH-SKIP-METHOD?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_skip_methodP_internal", "PPH-SKIP-METHOD?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_skip_methodP_internal_two", "PPH-SKIP-METHOD?-INTERNAL-TWO", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_truncate_method_context", "PPH-TRUNCATE-METHOD-CONTEXT", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_ntruncate_method_context", "PPH-NTRUNCATE-METHOD-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_try_methods", "PPH-PHRASE-TRY-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_try_these_methods", "PPH-PHRASE-TRY-THESE-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_abort", "PPH-ABORT", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_report_problems", "PPH-PHRASE-REPORT-PROBLEMS", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_print_context", "PPH-PRINT-CONTEXT", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_phrase_try_method", "PPH-PHRASE-TRY-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_phrase_possibly_generate_foolproof", "PPH-PHRASE-POSSIBLY-GENERATE-FOOLPROOF", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_poss_phrase", "GENERATE-POSS-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "possessivize_pph_phrase", "POSSESSIVIZE-PPH-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_possessive_pronoun_for_cycl", "PPH-POSSESSIVE-PRONOUN-FOR-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_ordinal_phrase_requiring_special_handlingP", "PPH-ORDINAL-PHRASE-REQUIRING-SPECIAL-HANDLING?", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_ordinal_phrase", "GENERATE-ORDINAL-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "ordinalize_pph_phrase", "ORDINALIZE-PPH-PHRASE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_output_list", "WITH-OUTPUT-LIST" );
    SubLFiles.declareMacro( me, "do_output_list_test_method", "DO-OUTPUT-LIST-TEST-METHOD" );
    SubLFiles.declareMacro( me, "do_core_output_list_regression", "DO-CORE-OUTPUT-LIST-REGRESSION" );
    return NIL;
  }

  public static SubLObject init_pph_main_file()
  {
    $pph_sbhl_spaces_to_resource$ = SubLFiles.defconstant( "*PPH-SBHL-SPACES-TO-RESOURCE*", SIX_INTEGER );
    $generate_text_bad_results$ = SubLFiles.deflexical( "*GENERATE-TEXT-BAD-RESULTS*", maybeDefault( $sym90$_GENERATE_TEXT_BAD_RESULTS_, $generate_text_bad_results$, () -> ( dictionary.new_dictionary( Symbols
        .symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $pph_initializedP$ = SubLFiles.deflexical( "*PPH-INITIALIZED?*", ( maybeDefault( $sym106$_PPH_INITIALIZED__, $pph_initializedP$, NIL ) ) );
    $pph_recursion_limit$ = SubLFiles.deflexical( "*PPH-RECURSION-LIMIT*", ( maybeDefault( $sym110$_PPH_RECURSION_LIMIT_, $pph_recursion_limit$, $int111$100 ) ) );
    $pph_method_stack$ = SubLFiles.defparameter( "*PPH-METHOD-STACK*", NIL );
    $pph_phrase_method_times$ = SubLFiles.defparameter( "*PPH-PHRASE-METHOD-TIMES*", misc_utilities.uninitialized() );
    $currently_metered_pph_phrase_methods$ = SubLFiles.defparameter( "*CURRENTLY-METERED-PPH-PHRASE-METHODS*", NIL );
    return NIL;
  }

  public static SubLObject setup_pph_main_file()
  {
    utilities_macros.register_cyc_api_function( $sym9$GENERATE_PHRASE, $list10, $str11$_param_OBJECT__the_CycL_object_fo, $list12, $list13 );
    memoization_state.note_memoized_function( $sym14$GENERATE_PHRASE_NO_CHECKS_MEMOIZED );
    utilities_macros.register_cyc_api_function( $sym28$GENERATE_PHRASE_FOR_JAVA, $list29, $str30$Return_paraphrase_info_in_a_java_, $list31, $list32 );
    utilities_macros.register_cyc_api_function( $sym52$GENERATE_DISAMBIGUATION_PHRASES_FOR_JAVA, $list53, $str54$_param_FORCE__pph_force_p__param_, $list55, $list56 );
    utilities_macros.register_cyc_api_function( $sym85$GENERATE_TEXT_W_SENTENTIAL_FORCE, $list86, $str87$generates_text_for_a_given_object, $list88, $list89 );
    subl_macro_promotions.declare_defglobal( $sym90$_GENERATE_TEXT_BAD_RESULTS_ );
    subl_macro_promotions.declare_defglobal( $sym106$_PPH_INITIALIZED__ );
    subl_macro_promotions.declare_defglobal( $sym110$_PPH_RECURSION_LIMIT_ );
    sunit_external.define_test_category( $str174$Java_Phrase_Supercategory, UNPROVIDED );
    sunit_external.define_test_category( $str175$Output_List_Subcategory, ConsesLow.list( $str174$Java_Phrase_Supercategory ) );
    sunit_external.define_test_suite( $str176$Java_Phrase_Test_Battery, ConsesLow.list( $str174$Java_Phrase_Supercategory ), UNPROVIDED, UNPROVIDED );
    sunit_external.define_test_suite( $str177$Output_List_Test_Battery, ConsesLow.list( $str175$Output_List_Subcategory ), UNPROVIDED, UNPROVIDED );
    generic_testing.define_test_case_table_int( $sym85$GENERATE_TEXT_W_SENTENTIAL_FORCE, ConsesLow.list( new SubLObject[] { $kw191$TEST, EQUAL, $kw192$OWNER, NIL, $kw193$CLASSES, $list194, $kw195$KB, $kw196$FULL,
      $kw197$WORKING_, T
    } ), $list198 );
    generic_testing.define_test_case_table_int( $sym199$GENERATE_DISAMBIGUATION_PHRASES_INT, ConsesLow.list( new SubLObject[] { $kw191$TEST, EQUAL, $kw192$OWNER, NIL, $kw193$CLASSES, $list194, $kw195$KB, $kw196$FULL,
      $kw197$WORKING_, T
    } ), $list200 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_main_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_main_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_main_file();
  }
  static
  {
    me = new pph_main();
    $pph_sbhl_spaces_to_resource$ = null;
    $generate_text_bad_results$ = null;
    $pph_initializedP$ = null;
    $pph_recursion_limit$ = null;
    $pph_method_stack$ = null;
    $pph_phrase_method_times$ = null;
    $currently_metered_pph_phrase_methods$ = null;
    $kw0$DEFAULT = makeKeyword( "DEFAULT" );
    $kw1$TEXT = makeKeyword( "TEXT" );
    $sym2$CYCL_EXPRESSION_P = makeSymbol( "CYCL-EXPRESSION-P" );
    $sym3$VALID_EXTERNAL_PPH_NL_PREDS_ = makeSymbol( "VALID-EXTERNAL-PPH-NL-PREDS?" );
    $sym4$KEYWORD_OR_NIL_P = makeSymbol( "KEYWORD-OR-NIL-P" );
    $sym5$HLMT_ = makeSymbol( "HLMT?" );
    $sym6$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym7$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym8$NON_NEGATIVE_INTEGER_OR_NIL_P = makeSymbol( "NON-NEGATIVE-INTEGER-OR-NIL-P" );
    $sym9$GENERATE_PHRASE = makeSymbol( "GENERATE-PHRASE" );
    $list10 = ConsesLow.list( new SubLObject[] { makeSymbol( "OBJECT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NL-PREDS" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "DETERMINER" ), NIL ),
      ConsesLow.list( makeSymbol( "LANGUAGE-MT" ), makeSymbol( "*PPH-LANGUAGE-MT*" ) ), ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeSymbol( "*PPH-DOMAIN-MT*" ) ), ConsesLow.list( makeSymbol( "MODE" ), makeKeyword(
          "TEXT" ) ), ConsesLow.list( makeSymbol( "TOP" ), NIL ), ConsesLow.list( makeSymbol( "FOCUS-ARG" ), NIL )
    } );
    $str11$_param_OBJECT__the_CycL_object_fo = makeString(
        "@param OBJECT; the CycL object for which you want to generate English.\n@param NL-PREDS; a list of instances of #$SpeechPartPredicate.\n@param DETERMINER; a determiner keyword in *DETERMINER-KEYS*.\n@param LANGUAGE-MT; the microtheory from which to look for linguistic information.\n@param DOMAIN-MT; the microtheory from which to look for domain information.\n@return 0 STRINGP or NIL; a string representing our best attempt to paraphrase OBJECT\n into English with the given parameters.\n@return 1; pos-pred or NIL\n@return 2; LISTP of justifications\n@return 3; PPH-OUTPUT-LIST-P." );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "CYCL-EXPRESSION-P" ) ), ConsesLow.list( makeSymbol( "NL-PREDS" ), makeSymbol( "VALID-EXTERNAL-PPH-NL-PREDS?" ) ), ConsesLow.list(
        makeSymbol( "DETERMINER" ), makeSymbol( "KEYWORD-OR-NIL-P" ) ), ConsesLow.list( makeSymbol( "LANGUAGE-MT" ), makeSymbol( "HLMT?" ) ), ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeSymbol( "HLMT?" ) ), ConsesLow
            .list( makeSymbol( "MODE" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "TOP" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "FOCUS-ARG" ), makeSymbol(
                "NON-NEGATIVE-INTEGER-OR-NIL-P" ) ) );
    $list13 = ConsesLow.list( makeSymbol( "STRING-OR-NIL-P" ), makeSymbol( "PREDICATE?-OR-NIL-P" ), makeSymbol( "LISTP" ), makeSymbol( "PPH-OUTPUT-LIST-P" ) );
    $sym14$GENERATE_PHRASE_NO_CHECKS_MEMOIZED = makeSymbol( "GENERATE-PHRASE-NO-CHECKS-MEMOIZED" );
    $kw15$NONE = makeKeyword( "NONE" );
    $kw16$PPH_METHOD_FAILURE = makeKeyword( "PPH-METHOD-FAILURE" );
    $str17$_PPH_error_level_ = makeString( "(PPH error level " );
    $str18$__ = makeString( ") " );
    $str19$Don_t_know_what_to_do_with_determ = makeString( "Don't know what to do with determiner ~S passed to GENERATE-PHRASE." );
    $kw20$NEW = makeKeyword( "NEW" );
    $sym21$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str22$___Top_level_CycL___S = makeString( "~% Top-level CycL: ~S" );
    $kw23$HTML = makeKeyword( "HTML" );
    $int24$256 = makeInteger( 256 );
    $sym25$PPH_PHRASE_NAUT_ = makeSymbol( "PPH-PHRASE-NAUT?" );
    $sym26$VALID_PPH_LANGUAGE_MT_SPECIFIER_ = makeSymbol( "VALID-PPH-LANGUAGE-MT-SPECIFIER?" );
    $sym27$POSSIBLY_MT_P = makeSymbol( "POSSIBLY-MT-P" );
    $sym28$GENERATE_PHRASE_FOR_JAVA = makeSymbol( "GENERATE-PHRASE-FOR-JAVA" );
    $list29 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NL-PREDS" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "FORCE" ), makeKeyword( "DEFAULT" ) ),
        ConsesLow.list( makeSymbol( "LANGUAGE-MT" ), makeSymbol( "*PPH-LANGUAGE-MT*" ) ), ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeSymbol( "*PPH-DOMAIN-MT*" ) ), ConsesLow.list( makeSymbol( "MODE" ), makeKeyword(
            "HTML" ) ) );
    $str30$Return_paraphrase_info_in_a_java_ = makeString(
        "Return paraphrase info in a java-friendly format, one big list with no structures.\n@param OBJECT; the CycL object for which you want to generate English.\n@param NL-PREDS; VALID-EXTERNAL-PPH-NL-PREDS?.\n@param FORCE; PPH-FORCE-P.\n@param LANGUAGE-MT; the microtheory from which to look for linguistic information.\n@param DOMAIN-MT; the microtheory from which to look for domain information.\n@return 0 NIL or PPH-JAVALIST-P;\n@return 1 BOOLEANP; Use arg-positions strictly?\n@return 2 LISTP; of PPH supports." );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "NL-PREDS" ), makeSymbol( "VALID-EXTERNAL-PPH-NL-PREDS?" ) ), ConsesLow.list( makeSymbol( "LANGUAGE-MT" ), makeSymbol( "VALID-PPH-LANGUAGE-MT-SPECIFIER?" ) ),
        ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeSymbol( "POSSIBLY-MT-P" ) ) );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "PPH-JAVALIST-P" ) ), makeSymbol( "BOOLEAN?" ), makeSymbol( "LISTP" ) );
    $sym33$PRINC_TO_STRING = makeSymbol( "PRINC-TO-STRING" );
    $str34$Fallback_method__S_is_not_a_known = makeString( "Fallback method ~S is not a known function." );
    $str35$Couldn_t_generate_a_string_for__S = makeString( "Couldn't generate a string for ~S (fallback method was ~S)" );
    $sym36$GENERATE_PHRASE_NO_CHECKS = makeSymbol( "GENERATE-PHRASE-NO-CHECKS" );
    $str37$Duplicate_javalist_____S = makeString( "Duplicate javalist:~% ~S" );
    $sym38$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P = makeSymbol( "GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P" );
    $const39$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell( makeString( "genTemplate-QuerySentence" ) );
    $kw40$TOP_LEVEL = makeKeyword( "TOP-LEVEL" );
    $sym41$LIST_OF_STRING_P = makeSymbol( "LIST-OF-STRING-P" );
    $kw42$A_LIST = makeKeyword( "A-LIST" );
    $list43 = ConsesLow.list( makeKeyword( "REQUIRED" ), makeKeyword( "PREFERRED" ), makeKeyword( "DISALLOWED" ) );
    $kw44$REQUIRED = makeKeyword( "REQUIRED" );
    $sym45$LISTP = makeSymbol( "LISTP" );
    $sym46$USE_CACHED_GENERATIONS_P = makeSymbol( "USE-CACHED-GENERATIONS-P" );
    $list47 = ConsesLow.list( makeKeyword( "DEFAULT" ), makeKeyword( "NONE" ) );
    $list48 = ConsesLow.list( makeKeyword( "PREFERRED" ), makeKeyword( "REQUIRED" ) );
    $list49 = ConsesLow.list( makeKeyword( "ANY" ), makeKeyword( "DEFAULT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) ) );
    $sym50$PPH_JAVALIST_STRING = makeSymbol( "PPH-JAVALIST-STRING" );
    $kw51$JAVALISTS = makeKeyword( "JAVALISTS" );
    $sym52$GENERATE_DISAMBIGUATION_PHRASES_FOR_JAVA = makeSymbol( "GENERATE-DISAMBIGUATION-PHRASES-FOR-JAVA" );
    $list53 = ConsesLow.list( makeSymbol( "OBJECTS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "FORCE" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "NL-PREDS" ), makeKeyword( "DEFAULT" ) ),
        ConsesLow.list( makeSymbol( "LANGUAGE-MT" ), makeSymbol( "*PPH-LANGUAGE-MT*" ) ), ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeSymbol( "*PPH-DOMAIN-MT*" ) ), ConsesLow.list( makeSymbol( "FORBIDDEN-STRINGS" ),
            NIL ), ConsesLow.list( makeSymbol( "USE-CACHED-GENERATIONS" ), makeKeyword( "REQUIRED" ) ) );
    $str54$_param_FORCE__pph_force_p__param_ = makeString(
        "@param FORCE; pph-force-p\n@param FORBIDDEN-STRINGS; listp of strings to *not* use as a paraphrase for any member of OBJECTS.\n@param USE-CACHED-GENERATIONS; :required, :preferred, or :disallowed.  Required means that it will only\n  use cached generations.  :disallowed means that it will never use them (and will always generate fresh from\n  the KB, and :preferred means that it will use the cached generations unless they turn out ambiguous, at\n  which point fresh generations from the KB will be used.\n@return LISTP of PPH-JAVALIST-P objects, one for each item on OBJECTS.\nAn effort is made to have the paraphrase for each item be sufficiently distinct\nto distinguish it from the other items.\n@sideeffects: Calls *PARTIAL-RESULTS-NOTIFICATION-FN* with a dictionary of new INDEX -> JAVALIST mappings." );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECTS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "FORCE" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "NL-PREDS" ), makeSymbol(
        "VALID-EXTERNAL-PPH-NL-PREDS?" ) ), ConsesLow.list( makeSymbol( "LANGUAGE-MT" ), makeSymbol( "HLMT?" ) ), ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeSymbol( "HLMT?" ) ), ConsesLow.list( makeSymbol(
            "FORBIDDEN-STRINGS" ), makeSymbol( "LIST-OF-STRING-P" ) ), ConsesLow.list( makeSymbol( "USE-CACHED-GENERATIONS" ), makeSymbol( "USE-CACHED-GENERATIONS-P" ) ) );
    $list56 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $str57$ALPHABETIZE_PPH_JAVALISTS_passed_ = makeString( "ALPHABETIZE-PPH-JAVALISTS passed ~S javalists, ~S objects." );
    $sym58$PPH_FORCE_P = makeSymbol( "PPH-FORCE-P" );
    $sym59$VALID_PPH_BLACKLIST_ = makeSymbol( "VALID-PPH-BLACKLIST?" );
    $str60$__Trying_default_precision___S___ = makeString( "~&Trying default precision: ~S.~%" );
    $kw61$FAILURE = makeKeyword( "FAILURE" );
    $str62$__Working_on_dupe_list___S__ = makeString( "~&Working on dupe list: ~S~%" );
    $str63$__Trying_to_reparaphrase__S___ = makeString( "~&Trying to reparaphrase ~S.~%" );
    $str64$__Trying_targeted_precision__S_fo = makeString( "~&Trying targeted precision ~S for ~S" );
    $sym65$PPH_PRECISION_P = makeSymbol( "PPH-PRECISION-P" );
    $str66$__New_paraphrase_with_precision__ = makeString( "~&New paraphrase with precision ~S for ~S:~% ~S" );
    $str67$__Trying_full_precision_for__S = makeString( "~&Trying full precision for ~S" );
    $str68$__New_paraphrase_with_full_precis = makeString( "~&New paraphrase with full precision for ~S:~% ~S" );
    $str69$__Changing_output_list_for__S_fro = makeString( "~&Changing output-list for ~S from~% ~S to~% ~S.~%" );
    $str70$Timed_out_generating_disambiguati = makeString( "Timed out generating disambiguation phrases for~% ~S~%" );
    $list71 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) );
    $kw72$NEVER = makeKeyword( "NEVER" );
    $sym73$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $kw74$ANY = makeKeyword( "ANY" );
    $sym75$_EXIT = makeSymbol( "%EXIT" );
    $kw76$ALL = makeKeyword( "ALL" );
    $kw77$LEXICAL_ONLY = makeKeyword( "LEXICAL-ONLY" );
    $kw78$TOP_LEVEL_ONLY = makeKeyword( "TOP-LEVEL-ONLY" );
    $str79$Setting_cycl_for__S_to__S_since_i = makeString( "Setting cycl for ~S to ~S since it lacks a valid arg-position." );
    $str80$Couldn_t_dereference_arg_position = makeString( "Couldn't dereference arg-position ~S of ~S" );
    $str81$CycL_on__S_doesn_t_match_CycL__S = makeString( "CycL on ~S doesn't match CycL ~S" );
    $sym82$PPH_PHRASE_OUTPUT_LIST_P = makeSymbol( "PPH-PHRASE-OUTPUT-LIST-P" );
    $sym83$KEYWORD_OR_HLMT_ = makeSymbol( "KEYWORD-OR-HLMT?" );
    $sym84$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym85$GENERATE_TEXT_W_SENTENTIAL_FORCE = makeSymbol( "GENERATE-TEXT-W/SENTENTIAL-FORCE" );
    $list86 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "FORCE" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "NL-PREDS" ), makeKeyword( "DEFAULT" ) ),
        ConsesLow.list( makeSymbol( "LANGUAGE-MT" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "MODE" ), makeKeyword( "TEXT" ) ),
        ConsesLow.list( makeSymbol( "FOCUS-ARG" ), NIL ) );
    $str87$generates_text_for_a_given_object = makeString(
        "generates text for a given object.  This is intended to be the\n  main gateway into the generation code for formulas.\n  @param OBJECT CYCL-EXPRESSION-P; the object for which text should be generated.\n  @param FORCE pph-force-p; the sentential force of the text to be generated.\n@return 0 STRINGP or NIL; the string corresponding to object.\n@return 1 pred\n@return 2 justification\n@return 3 pph-output-list-p\n@return 4 non-negative-integer-p -- number of demerits associated with this paraphrase\n@return 5 pph-phrase-p or NIL -- root phrase for the paraphrase" );
    $list88 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "CYCL-EXPRESSION-P" ) ), ConsesLow.list( makeSymbol( "FORCE" ), makeSymbol( "PPH-FORCE-P" ) ), ConsesLow.list( makeSymbol( "NL-PREDS" ),
        makeSymbol( "VALID-EXTERNAL-PPH-NL-PREDS?" ) ), ConsesLow.list( makeSymbol( "LANGUAGE-MT" ), makeSymbol( "VALID-PPH-LANGUAGE-MT-SPECIFIER?" ) ), ConsesLow.list( makeSymbol( "DOMAIN-MT" ), makeSymbol(
            "KEYWORD-OR-HLMT?" ) ), ConsesLow.list( makeSymbol( "MODE" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "FOCUS-ARG" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
                "NON-NEGATIVE-INTEGER-P" ) ) ) );
    $list89 = ConsesLow.list( makeSymbol( "STRING-OR-NIL-P" ), makeSymbol( "PREDICATE-OR-NIL-P" ), makeSymbol( "LISTP" ), makeSymbol( "PPH-OUTPUT-LIST-P" ) );
    $sym90$_GENERATE_TEXT_BAD_RESULTS_ = makeSymbol( "*GENERATE-TEXT-BAD-RESULTS*" );
    $sym91$_ = makeSymbol( ">" );
    $str92$_tmp_ = makeString( "/tmp/" );
    $kw93$OUTPUT = makeKeyword( "OUTPUT" );
    $str94$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str95$__Term_AForce_AParaphrase_ADemeri = makeString( "~&Term~AForce~AParaphrase~ADemerits~ANL Preds~ALanguage Mt~ADomain Mt~AMode~AFocus Arg~%" );
    $list96 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "DEMERITS" ) );
    $list97 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "FORCE" ), makeSymbol( "NL-PREDS" ), makeSymbol( "LANGUAGE-MT" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "MODE" ), makeSymbol( "FOCUS-ARG" ), makeSymbol(
        "STRING" ) );
    $str98$___A__ = makeString( "~&~A~%" );
    $str99$Rechecking_generate_text_bad_resu = makeString( "Rechecking generate-text bad results..." );
    $list100 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "FORCE" ), makeSymbol( "NL-PREDS" ), makeSymbol( "LANGUAGE-MT" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "MODE" ), makeSymbol( "FOCUS-ARG" ), makeSymbol(
        "STRING" ) );
    $sym101$INVALID_FORT_ = makeSymbol( "INVALID-FORT?" );
    $str102$Took__S_seconds_to_paraphrase____ = makeString( "Took ~S seconds to paraphrase~% ~S~%" );
    $str103$__Suspending_discourse_referent_t = makeString( "~&Suspending discourse referent tracking for ~S~%" );
    $kw104$DECLARATIVE = makeKeyword( "DECLARATIVE" );
    $str105$__Making_new_phrase_with_cycl__S_ = makeString( "~&Making new phrase with cycl ~S~%" );
    $sym106$_PPH_INITIALIZED__ = makeSymbol( "*PPH-INITIALIZED?*" );
    $kw107$INITIALIZED = makeKeyword( "INITIALIZED" );
    $str108$No_KB_loaded__Couldn_t_initialize = makeString( "No KB loaded. Couldn't initialize paraphrase code." );
    $kw109$NO_KB_LOADED = makeKeyword( "NO-KB-LOADED" );
    $sym110$_PPH_RECURSION_LIMIT_ = makeSymbol( "*PPH-RECURSION-LIMIT*" );
    $int111$100 = makeInteger( 100 );
    $const112$EnglishParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) );
    $str113$__Entering_PPH_POSSIBLY_BINDING_V = makeString( "~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%" );
    $str114$__Using_mapped_string__S_for__S__ = makeString( "~&Using mapped string ~S for ~S.~%" );
    $const115$PossessivePhrase = constant_handles.reader_make_constant_shell( makeString( "PossessivePhrase" ) );
    $str116$Recursion_limit_exceeded_on__S_ = makeString( "Recursion limit exceeded on ~S." );
    $str117$__Paraphrasing__S_with_agr___S___ = makeString( "~&Paraphrasing ~S with agr: ~S...~%" );
    $kw118$GENERATE = makeKeyword( "GENERATE" );
    $str119$Abandoning_unexpressed_negations_ = makeString( "Abandoning unexpressed negations: ~S" );
    $str120$__PPH_PHRASE_GENERATE_Output_list = makeString( "~&PPH-PHRASE-GENERATE Output list is ~S.~%" );
    $str121$__Leaving_PPH_POSSIBLY_BINDING_VA = makeString( "~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s " );
    $str122$______and__pph_var_types__are_now = makeString( "~&... and *pph-var-types* are now ~S~%" );
    $str123$Repeating_sequence_in_paraphrase_ = makeString( "Repeating sequence in paraphrase args: ~s" );
    $kw124$NO = makeKeyword( "NO" );
    $str125$Inside_operator_scope__S = makeString( "Inside operator scope ~S" );
    $str126$Leaving_operator_scope__S = makeString( "Leaving operator scope ~S" );
    $str127$Skipping__S___ = makeString( "Skipping ~S.~%" );
    $kw128$CONTEXT = makeKeyword( "CONTEXT" );
    $kw129$DONT_NEED_BACKUP_PHRASE = makeKeyword( "DONT-NEED-BACKUP-PHRASE" );
    $sym130$PPH_PHRASE_TRY_METHODS = makeSymbol( "PPH-PHRASE-TRY-METHODS" );
    $kw131$NO_ZERO_DEMERIT_METHODS = makeKeyword( "NO-ZERO-DEMERIT-METHODS" );
    $kw132$CYCL = makeKeyword( "CYCL" );
    $kw133$BEST_METHOD = makeKeyword( "BEST-METHOD" );
    $list134 = ConsesLow.list( makeSymbol( "METHOD-SYMBOL" ), makeSymbol( "METHOD-DEMERITS" ) );
    $str135$_S_is_not_an_FBOUNDP_symbol_ = makeString( "~S is not an FBOUNDP symbol." );
    $str136$___S_demerits_exceeds_cutoff_of__ = makeString( "~&~S demerits exceeds cutoff of ~S~% ~S from ~S,~% ~S from dtrs.~%" );
    $kw137$METHOD = makeKeyword( "METHOD" );
    $kw138$AGR_PREDS = makeKeyword( "AGR-PREDS" );
    $kw139$CATEGORY = makeKeyword( "CATEGORY" );
    $kw140$DEMERIT_CUTOFF = makeKeyword( "DEMERIT-CUTOFF" );
    $str141$__Trying__S___Remaining___S = makeString( "~&Trying ~S~% Remaining: ~S" );
    $kw142$TOO_MUCH_TIME = makeKeyword( "TOO-MUCH-TIME" );
    $str143$Exceeded_timeout_on____S = makeString( "Exceeded timeout on~% ~S" );
    $kw144$VERBOSE = makeKeyword( "VERBOSE" );
    $str145$Aborting_PPH_call___ = makeString( "Aborting PPH call..." );
    $str146$Zero_demerit_methods_failed____In = makeString( "Zero-demerit methods failed:~% Input: ~S~% Agr-preds: ~S~% Failed methods:" );
    $str147$_____S____Reported_Problems___S__ = makeString( "~%  ~S~%  Reported Problems: ~S~%" );
    $str148$___Successful_method___S__demerit = makeString( "~& Successful method: ~S (demerits ~S)~% Paraphrase: ~S~%" );
    $str149$__Context____Top_level_CycL___S__ = makeString( "~&Context:~% Top-level CycL: ~S~% Language mt: ~S~% Domain mt: ~S~% Mode: ~S~%" );
    $str150$_Precision___S__ = makeString( " Precision: ~S~%" );
    $str151$__Trying__S_____ = makeString( "~&Trying ~S...~%" );
    $str152$__Entering_PPH_SETTING_VAR_TYPES_ = makeString( "~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%" );
    $str153$__Adding__S_demerits_for__S____S = makeString( "~&Adding ~S demerits for ~S~% ~S" );
    $str154$__PPH_phrase_immediately_before_c = makeString( "~%PPH phrase immediately before calling ~S:~% ~S" );
    $str155$__PPH_phrase_immediately_after_ca = makeString( "~%PPH phrase immediately after calling ~S:~% ~S" );
    $str156$_S_failed_ = makeString( "~S failed." );
    $str157$___S_demerits_exceeds_cutoff_of__ = makeString( "~&~S demerits exceeds cutoff of ~S~% ~S" );
    $str158$___S_____S_demerits___S___ = makeString( "~&~S -> ~S demerits: ~S.~%" );
    $str159$____S__S______S___S__ = makeString( "~%(~S ~S):~% ~S (~S)." );
    $str160$____S__S______S = makeString( "~%(~S ~S):~% ~S" );
    $str161$__Leaving_PPH_SETTING_VAR_TYPES_I = makeString( "~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). " );
    $str162$___Output_list___S__ = makeString( "~& Output list: ~S~%" );
    $str163$___Setting__S_to____S = makeString( "~& Setting ~S to~% ~S" );
    $str164$___Leaving__PPH_VAR_TYPES___S = makeString( "~% Leaving *PPH-VAR-TYPES* ~S" );
    $str165$Can_t_use_foolproof_generation_wi = makeString( "Can't use foolproof generation with demerit cutoff: ~S.~%" );
    $str166$Can_t_use_foolproof_generation_on = makeString( "Can't use foolproof generation on unknown CycL.~%" );
    $str167$the = makeString( "the" );
    $str168$of = makeString( "of" );
    $str169$_s = makeString( "'s" );
    $const170$pronounStrings = constant_handles.reader_make_constant_shell( makeString( "pronounStrings" ) );
    $const171$PossessivePronoun_Post = constant_handles.reader_make_constant_shell( makeString( "PossessivePronoun-Post" ) );
    $const172$OrdinalPhrase = constant_handles.reader_make_constant_shell( makeString( "OrdinalPhrase" ) );
    $str173$th = makeString( "th" );
    $str174$Java_Phrase_Supercategory = makeString( "Java Phrase Supercategory" );
    $str175$Output_List_Subcategory = makeString( "Output List Subcategory" );
    $str176$Java_Phrase_Test_Battery = makeString( "Java Phrase Test Battery" );
    $str177$Output_List_Test_Battery = makeString( "Output List Test Battery" );
    $sym178$CLET = makeSymbol( "CLET" );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-TMP-OUTPUT-LIST*" ), ConsesLow.list( makeSymbol( "GENERATE-PPH-OUTPUT-LIST" ), ConsesLow.list( makeSymbol( "PPH-NART-SUBSTITUTE" ), makeSymbol(
        "*PPH-TMP-TEST-OBJECT*" ) ), makeKeyword( "ANY" ), ConsesLow.list( makeSymbol( "PPH-REGRESSION-ITEM-LANGUAGE-MT" ), makeSymbol( "*PPH-TMP-REGRESSION-ITEM*" ) ), ConsesLow.list( makeSymbol(
            "PPH-REGRESSION-ITEM-DOMAIN-MT" ), makeSymbol( "*PPH-TMP-REGRESSION-ITEM*" ) ), makeKeyword( "TEXT" ), makeSymbol( "*PPH-TMP-FORCE*" ) ) ) );
    $list180 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET" ), makeSymbol( "&KEY" ), makeSymbol( "FORCES" ), makeSymbol( "DO-IMPERATIVE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list181 = ConsesLow.list( makeKeyword( "FORCES" ), makeKeyword( "DO-IMPERATIVE" ) );
    $kw182$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw183$FORCES = makeKeyword( "FORCES" );
    $kw184$DO_IMPERATIVE = makeKeyword( "DO-IMPERATIVE" );
    $sym185$DO_PPH_REGRESSION_STORE = makeSymbol( "DO-PPH-REGRESSION-STORE" );
    $list186 = ConsesLow.list( makeKeyword( "TEST-FUNC" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "PPH-MAIN-REGRESSION-PRESCREENING" ) ) );
    $sym187$DO_PPH_FORCES_LIST = makeSymbol( "DO-PPH-FORCES-LIST" );
    $sym188$WITH_PPH_TEST_OBJECT = makeSymbol( "WITH-PPH-TEST-OBJECT" );
    $sym189$WITH_OUTPUT_LIST = makeSymbol( "WITH-OUTPUT-LIST" );
    $list190 = ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "EL-FORMULA-P" ), makeSymbol( "*PPH-TMP-TEST-OBJECT*" ) ), ConsesLow.list( makeSymbol( "CALL-PPH-TEST-FUNCTION-INTELLIGENTLY" ), ConsesLow
        .list( makeSymbol( "FUNCTION" ), makeSymbol( "TEST-NO-CONSECUTIVE-DUPLICATES" ) ) ), ConsesLow.list( makeSymbol( "CALL-PPH-TEST-FUNCTION-INTELLIGENTLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
            "VERIFY-ARG-POSITIONS-FAITHFUL" ) ) ), ConsesLow.list( makeSymbol( "CALL-PPH-TEST-FUNCTION-INTELLIGENTLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "VERIFY-ARG-POSITIONS-CORRECT" ) ) ),
        ConsesLow.list( makeSymbol( "CALL-PPH-TEST-FUNCTION-INTELLIGENTLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TEST-REALLY-SANE" ) ) ) );
    $kw191$TEST = makeKeyword( "TEST" );
    $kw192$OWNER = makeKeyword( "OWNER" );
    $kw193$CLASSES = makeKeyword( "CLASSES" );
    $list194 = ConsesLow.list( makeSymbol( "PPH-TEST-CASE-TABLES" ) );
    $kw195$KB = makeKeyword( "KB" );
    $kw196$FULL = makeKeyword( "FULL" );
    $kw197$WORKING_ = makeKeyword( "WORKING?" );
    $list198 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementTypesInFormula-List" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Salt-NaCl" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), constant_handles.reader_make_constant_shell( makeString( "Sodium" ) ), constant_handles
            .reader_make_constant_shell( makeString( "Chlorine" ) ) ) ), makeKeyword( "DECLARATIVE" ) ), makeString(
                "Sodium and chlorine are the complete list of elements in the chemical formula of sodium chloride." ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                    makeString( "elementTypesInFormula-List" ) ), constant_handles.reader_make_constant_shell( makeString( "Salt-NaCl" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "TheList" ) ), constant_handles.reader_make_constant_shell( makeString( "Sodium" ) ), constant_handles.reader_make_constant_shell( makeString( "Chlorine" ) ) ) ), makeKeyword( "INTERROGATIVE" ) ),
                    makeString( "Are sodium and chlorine the complete list of elements in the chemical formula of sodium chloride?" ) ) );
    $sym199$GENERATE_DISAMBIGUATION_PHRASES_INT = makeSymbol( "GENERATE-DISAMBIGUATION-PHRASES-INT" );
    $list200 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Plotting" ) ) ), makeKeyword( "DEFAULT" ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "gerund-Plural" ) ), constant_handles.reader_make_constant_shell( makeString( "wordStrings" ) ), constant_handles.reader_make_constant_shell( makeString(
            "properNameStrings" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) ),
                constant_handles.reader_make_constant_shell( makeString( "CyclishParaphraseMt" ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "TechnicalEnglishLexicalMt" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles
                        .reader_make_constant_shell( makeString( "Now" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell(
                            makeString( "CyclishParaphraseMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                "Now" ) ) ) ), makeKeyword( "TEXT" ), makeKeyword( "JAVALISTS" ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "plottings" ), ConsesLow.list( ConsesLow.list( makeString(
                                    "plottings" ), constant_handles.reader_make_constant_shell( makeString( "Plotting" ) ), NIL, NIL, NIL, ZERO_INTEGER ) ) ) ) ) );
  }
}
/*
 *
 * Total time: 6762 ms language_mt language_mt domain_mt domain_mt mode mode
 * phrase phrase phrase phrase phrase phrase phrase phrase phrase language_mt
 * domain_mt mode phrase phrase language_mt domain_mt mode phrase phrase phrase
 * phrase phrase phrase phrase phrase phrase phrase phrase phrase language_mt
 * domain_mt mode phrase phrase language_mt domain_mt mode phrase phrase phrase
 * phrase phrase
 */