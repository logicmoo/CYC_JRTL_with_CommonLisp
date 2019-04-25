package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class term_lexicon
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.term_lexicon";
  public static final String myFingerPrint = "b6a439a9ca434fef846926e578751284fff4ef5922fcf49e5ba2839a9cc0bba1";
  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 1556L)
  private static SubLSymbol $term_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 7146L)
  private static SubLSymbol $numeric_date_patterns$;
  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 7479L)
  private static SubLSymbol $compiled_numeric_date_patterns$;
  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
  private static SubLSymbol $ner_clusters_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13530L)
  public static SubLSymbol $term_lexicon_learners$;
  private static final SubLSymbol $sym0$TERM_LEXICON;
  private static final SubLSymbol $sym1$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $kw2$PREFERRED;
  private static final SubLSymbol $sym3$ABSTRACT_LEXICON;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$DEPENDENT_LEXICONS;
  private static final SubLSymbol $sym6$CONCEPT_FILTER_SPECS;
  private static final SubLSymbol $sym7$CONVERT_TO_EL_;
  private static final SubLSymbol $sym8$OBJECT;
  private static final SubLSymbol $sym9$INSTANCE_COUNT;
  private static final SubLSymbol $sym10$DEFAULT_EXCLUDE_MTS;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$DEFAULT_EXCLUDE_PREDICATES;
  private static final SubLSymbol $sym13$DEFAULT_BASE_MT;
  private static final SubLObject $const14$AllGeneralEnglishValidatedLexical;
  private static final SubLSymbol $sym15$DEFAULT_KB_SPEC;
  private static final SubLObject $const16$AbstractLexiconSpecification;
  private static final SubLSymbol $sym17$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_CLASS;
  private static final SubLSymbol $sym18$ISOLATED_P;
  private static final SubLSymbol $sym19$INSTANCE_NUMBER;
  private static final SubLSymbol $sym20$ALLOWED_MTS;
  private static final SubLSymbol $kw21$UNINITIALIZED;
  private static final SubLSymbol $sym22$EXCLUDED_MTS;
  private static final SubLSymbol $sym23$BASE_MT;
  private static final SubLSymbol $sym24$ROOT_MT;
  private static final SubLSymbol $sym25$EXCLUDED_PREDS;
  private static final SubLSymbol $sym26$EXCLUDED_POS_LIST;
  private static final SubLSymbol $sym27$TRIE;
  private static final SubLSymbol $sym28$CACHE;
  private static final SubLSymbol $sym29$IGNORE_CACHE_;
  private static final SubLSymbol $sym30$CASE_SENSITIVITY;
  private static final SubLSymbol $sym31$ALLOW_FABRICATION_;
  private static final SubLSymbol $sym32$LEARNED;
  private static final SubLSymbol $sym33$ACTIVE_LEARNERS;
  private static final SubLSymbol $sym34$ALLOW_STEMMING;
  private static final SubLSymbol $sym35$STOP_WORDS;
  private static final SubLSymbol $sym36$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_INSTANCE;
  private static final SubLSymbol $sym37$INITIALIZE;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym41$TERM_LEXICON_INITIALIZE_METHOD;
  private static final SubLSymbol $sym42$NOTE_DEPENDENT_LEXICON;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym46$TERM_LEXICON_NOTE_DEPENDENT_LEXICON_METHOD;
  private static final SubLSymbol $sym47$REMOVE_DEPENDENT_LEXICON;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym50$TERM_LEXICON_REMOVE_DEPENDENT_LEXICON_METHOD;
  private static final SubLSymbol $sym51$SET_CONVERT_TO_EL;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym56$TERM_LEXICON_SET_CONVERT_TO_EL_METHOD;
  private static final SubLSymbol $sym57$GET_CONVERT_TO_EL;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym60$TERM_LEXICON_GET_CONVERT_TO_EL_METHOD;
  private static final SubLSymbol $sym61$REMOVE_ALL_CONCEPT_FILTER_SPECS;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym64$TERM_LEXICON_REMOVE_ALL_CONCEPT_FILTER_SPECS_METHOD;
  private static final SubLSymbol $sym65$ADD_CONCEPT_FILTER_SPEC;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym69$CONCEPT_FILTER_SPECIFICATION_P;
  private static final SubLSymbol $sym70$TERM_LEXICON_ADD_CONCEPT_FILTER_SPEC_METHOD;
  private static final SubLSymbol $sym71$GET_CONCEPT_FILTER_SPECS;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym74$TERM_LEXICON_GET_CONCEPT_FILTER_SPECS_METHOD;
  private static final SubLSymbol $sym75$CREATE_LEX_ENTRIES;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$GET;
  private static final SubLSymbol $kw79$DENOT;
  private static final SubLSymbol $sym80$NL_TRIE_WORD2LEX_ENTRIES;
  private static final SubLSymbol $sym81$NL_TRIE_TP2LEX_ENTRIES;
  private static final SubLSymbol $sym82$NL_TRIE_NAME2LEX_ENTRIES;
  private static final SubLSymbol $sym83$TERM_LEXICON_CREATE_LEX_ENTRIES_METHOD;
  private static final SubLSymbol $sym84$RESPORATOR_TO_LEX_ENTRY;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$LEX_ENTRY;
  private static final SubLSymbol $sym88$SET;
  private static final SubLSymbol $kw89$STRING;
  private static final SubLSymbol $kw90$CYC_POS;
  private static final SubLObject $const91$ProperNoun;
  private static final SubLSymbol $kw92$INFLECTIONS;
  private static final SubLList $list93;
  private static final SubLSymbol $kw94$PREDICATE;
  private static final SubLObject $const95$denotation;
  private static final SubLSymbol $sym96$RESPORATOR_TO_CYCL;
  private static final SubLSymbol $sym97$TERM_LEXICON_RESPORATOR_TO_LEX_ENTRY_METHOD;
  private static final SubLSymbol $sym98$COPY;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym102$TERM_LEXICON_P;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$TERM_LEXICON_COPY_METHOD;
  private static final SubLSymbol $sym105$ISOLATE;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym108$TERM_LEXICON_ISOLATE_METHOD;
  private static final SubLSymbol $sym109$DELETE_STRING_WITH_TERM;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym113$STRINGP;
  private static final SubLSymbol $sym114$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLSymbol $sym115$GET_CASE_SENSITIVITY;
  private static final SubLSymbol $sym116$DELETE_ENTRY_FROM_STRING;
  private static final SubLSymbol $sym117$TERM_LEXICON_DELETE_STRING_WITH_TERM_METHOD;
  private static final SubLString $str118$_0_9__1_2______0_9__1_2______0_9_;
  private static final SubLString $str119$_0_9__4_4_______0_9__1_2_______0_;
  private static final SubLString $str120$_0_9__1_2______0_9__2_4_;
  private static final SubLString $str121$_0_9__4_;
  private static final SubLSymbol $sym122$SIMPLE_DATE_LEARN;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLSymbol $kw125$FRAME;
  private static final SubLObject $const126$RegularNounFrame;
  private static final SubLSymbol $sym127$LEX_ENTRY_EQUAL_P;
  private static final SubLSymbol $sym128$ADD;
  private static final SubLSymbol $sym129$TERM_LEXICON_SIMPLE_DATE_LEARN_METHOD;
  private static final SubLSymbol $sym130$DATE_LEARN;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$TERM_LEXICON_DATE_LEARN_METHOD;
  private static final SubLSymbol $sym133$STANFORD_NER_DATE_LEARN;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$STANFORD_NER_LEARN;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$TERM_LEXICON_STANFORD_NER_DATE_LEARN_METHOD;
  private static final SubLList $list138;
  private static final SubLObject $list139;
  private static final SubLSymbol $kw140$ANY;
  private static final SubLSymbol $sym141$STANFORD_NER;
  private static final SubLSymbol $sym142$KNOWN_CYC_TYPES;
  private static final SubLSymbol $sym143$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym144$MERGE_CLUSTERS;
  private static final SubLSymbol $sym145$GET_STRING;
  private static final SubLSymbol $sym146$GET_CYC;
  private static final SubLObject $const147$InstanceNamedFn_Ternary;
  private static final SubLString $str148$___S;
  private static final SubLSymbol $sym149$TERM_LEXICON_STANFORD_NER_LEARN_METHOD;
  private static final SubLSymbol $sym150$NER_CLUSTERS;
  private static final SubLSymbol $sym151$RUN;
  private static final SubLSymbol $sym152$_NER_CLUSTERS_CACHING_STATE_;
  private static final SubLInteger $int153$4096;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$SCALAR_INTERVAL_LEARN;
  private static final SubLList $list156;
  private static final SubLList $list157;
  private static final SubLSymbol $sym158$LEX_ENTRY_DENOT;
  private static final SubLSymbol $sym159$TERM_LEXICON_SCALAR_INTERVAL_LEARN_METHOD;
  private static final SubLSymbol $sym160$NUMBER_LEARN;
  private static final SubLList $list161;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$TERM_LEXICON_NUMBER_LEARN_METHOD;
  private static final SubLSymbol $kw164$PENN_TAGS;
  private static final SubLList $list165;
  private static final SubLObject $const166$Number_SP;
  private static final SubLSymbol $sym167$SIMPLE_DATE_FROM_STRING_LEARN;
  private static final SubLList $list168;
  private static final SubLSymbol $sym169$TERM_LEXICON_SIMPLE_DATE_FROM_STRING_LEARN_METHOD;
  private static final SubLList $list170;
  private static final SubLObject $const171$YearFn;
  private static final SubLSymbol $sym172$NOUN_COMPOUND_LEARN;
  private static final SubLList $list173;
  private static final SubLSymbol $sym174$TERM_LEXICON_NOUN_COMPOUND_LEARN_METHOD;
  private static final SubLList $list175;
  private static final SubLList $list176;
  private static final SubLObject $const177$genlPreds;
  private static final SubLList $list178;
  private static final SubLList $list179;
  private static final SubLList $list180;
  private static final SubLObject $const181$EverythingPSC;
  private static final SubLObject $const182$Noun;
  private static final SubLList $list183;
  private static final SubLList $list184;
  private static final SubLSymbol $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $kw186$PRAGMATICS;
  private static final SubLSymbol $kw187$WORD_UNIT;
  private static final SubLSymbol $kw188$TRIE_ENTRY;
  private static final SubLSymbol $sym189$TERM_LEXICON_NL_TRIE_WORD2LEX_ENTRIES_METHOD;
  private static final SubLList $list190;
  private static final SubLList $list191;
  private static final SubLSymbol $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLList $list193;
  private static final SubLSymbol $sym194$TERM_LEXICON_NL_TRIE_NAME2LEX_ENTRIES_METHOD;
  private static final SubLList $list195;
  private static final SubLList $list196;
  private static final SubLSymbol $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym198$TERM_LEXICON_NL_TRIE_TP2LEX_ENTRIES_METHOD;
  private static final SubLSymbol $sym199$DENOTS_FOR_TERM_LEXICON_ENTRIES;
  private static final SubLSymbol $sym200$ADD_LEARNER;
  private static final SubLSymbol $sym201$LEARN;
  private static final SubLSymbol $sym202$TEST_SIMPLE_DATE_LEARN;
  private static final SubLSymbol $kw203$TEST;
  private static final SubLSymbol $sym204$HAS_MEMBER_EQUAL_;
  private static final SubLSymbol $kw205$OWNER;
  private static final SubLSymbol $kw206$CLASSES;
  private static final SubLSymbol $kw207$KB;
  private static final SubLSymbol $kw208$FULL;
  private static final SubLSymbol $kw209$WORKING_;
  private static final SubLList $list210;

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 1681L)
  public static SubLObject new_term_lexicon()
  {
    return object.new_class_instance( $sym0$TERM_LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 1761L)
  public static SubLObject get_term_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == term_lexicon_p( $term_lexicon$.getDynamicValue( thread ) ) )
    {
      $term_lexicon$.setDynamicValue( new_term_lexicon(), thread );
    }
    return $term_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 1966L)
  public static SubLObject new_case_sensitivity_preferred_term_lexicon()
  {
    final SubLObject lex = object.new_class_instance( $sym0$TERM_LEXICON );
    methods.funcall_instance_method_with_1_args( lex, $sym1$SET_CASE_SENSITIVITY, $kw2$PREFERRED );
    return lex;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject get_term_lexicon_dependent_lexicons(final SubLObject v_term_lexicon)
  {
    return classes.subloop_get_access_protected_instance_slot( v_term_lexicon, EIGHTEEN_INTEGER, $sym5$DEPENDENT_LEXICONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject set_term_lexicon_dependent_lexicons(final SubLObject v_term_lexicon, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_term_lexicon, value, EIGHTEEN_INTEGER, $sym5$DEPENDENT_LEXICONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject get_term_lexicon_concept_filter_specs(final SubLObject v_term_lexicon)
  {
    return classes.subloop_get_access_protected_instance_slot( v_term_lexicon, SEVENTEEN_INTEGER, $sym6$CONCEPT_FILTER_SPECS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject set_term_lexicon_concept_filter_specs(final SubLObject v_term_lexicon, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_term_lexicon, value, SEVENTEEN_INTEGER, $sym6$CONCEPT_FILTER_SPECS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject get_term_lexicon_convert_to_elP(final SubLObject v_term_lexicon)
  {
    return classes.subloop_get_access_protected_instance_slot( v_term_lexicon, SIXTEEN_INTEGER, $sym7$CONVERT_TO_EL_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject set_term_lexicon_convert_to_elP(final SubLObject v_term_lexicon, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_term_lexicon, value, SIXTEEN_INTEGER, $sym7$CONVERT_TO_EL_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject subloop_reserved_initialize_term_lexicon_class(final SubLObject new_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym9$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym10$DEFAULT_EXCLUDE_MTS, $list11 );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym12$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list( lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(
        thread ) ) );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym13$DEFAULT_BASE_MT, $const14$AllGeneralEnglishValidatedLexical );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym15$DEFAULT_KB_SPEC, $const16$AbstractLexiconSpecification );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject subloop_reserved_initialize_term_lexicon_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym18$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym19$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym20$ALLOWED_MTS, $kw21$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym22$EXCLUDED_MTS, $kw21$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym23$BASE_MT, $kw21$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym24$ROOT_MT, $kw21$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym25$EXCLUDED_PREDS, $kw21$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym26$EXCLUDED_POS_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym27$TRIE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym28$CACHE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym29$IGNORE_CACHE_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym30$CASE_SENSITIVITY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym31$ALLOW_FABRICATION_, T );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym32$LEARNED, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym33$ACTIVE_LEARNERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym34$ALLOW_STEMMING, T );
    classes.subloop_initialize_slot( new_instance, $sym3$ABSTRACT_LEXICON, $sym35$STOP_WORDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$TERM_LEXICON, $sym7$CONVERT_TO_EL_, T );
    classes.subloop_initialize_slot( new_instance, $sym0$TERM_LEXICON, $sym6$CONCEPT_FILTER_SPECS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$TERM_LEXICON, $sym5$DEPENDENT_LEXICONS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 2143L)
  public static SubLObject term_lexicon_p(final SubLObject v_term_lexicon)
  {
    return classes.subloop_instanceof_class( v_term_lexicon, $sym0$TERM_LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3267L)
  public static SubLObject term_lexicon_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    SubLObject allow_fabricationP = abstract_lexicon.get_abstract_lexicon_allow_fabricationP( self );
    try
    {
      thread.throwStack.push( $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        abstract_lexicon.abstract_lexicon_initialize_method( self );
        allow_fabricationP = NIL;
        Dynamic.sublisp_throw( $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          abstract_lexicon.set_abstract_lexicon_allow_fabricationP( self, allow_fabricationP );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3483L)
  public static SubLObject term_lexicon_note_dependent_lexicon_method(final SubLObject self, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons( self );
    try
    {
      thread.throwStack.push( $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        dependent_lexicons = ConsesLow.cons( lexicon, dependent_lexicons );
        Dynamic.sublisp_throw( $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_dependent_lexicons( self, dependent_lexicons );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3615L)
  public static SubLObject term_lexicon_remove_dependent_lexicon_method(final SubLObject self, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons( self );
    try
    {
      thread.throwStack.push( $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        dependent_lexicons = Sequences.delete( lexicon, dependent_lexicons, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_dependent_lexicons( self, dependent_lexicons );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3777L)
  public static SubLObject term_lexicon_set_convert_to_el_method(final SubLObject self, final SubLObject v_boolean)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    SubLObject convert_to_elP = get_term_lexicon_convert_to_elP( self );
    try
    {
      thread.throwStack.push( $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        convert_to_elP = list_utilities.sublisp_boolean( v_boolean );
        Dynamic.sublisp_throw( $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_convert_to_elP( self, convert_to_elP );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 3958L)
  public static SubLObject term_lexicon_get_convert_to_el_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, convert_to_elP );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_convert_to_elP( self, convert_to_elP );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 4090L)
  public static SubLObject term_lexicon_remove_all_concept_filter_specs_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs( self );
    try
    {
      thread.throwStack.push( $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        concept_filter_specs = NIL;
        Dynamic.sublisp_throw( $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_concept_filter_specs( self, concept_filter_specs );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 4219L)
  public static SubLObject term_lexicon_add_concept_filter_spec_method(final SubLObject self, final SubLObject spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs( self );
    try
    {
      thread.throwStack.push( $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        assert NIL != concept_filter.concept_filter_specification_p( spec ) : spec;
        if( NIL == conses_high.member( spec, concept_filter_specs, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          concept_filter_specs = ConsesLow.cons( spec, concept_filter_specs );
        }
        Dynamic.sublisp_throw( $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_concept_filter_specs( self, concept_filter_specs );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 4452L)
  public static SubLObject term_lexicon_get_concept_filter_specs_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs( self );
    try
    {
      thread.throwStack.push( $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, concept_filter_specs );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_concept_filter_specs( self, concept_filter_specs );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 4597L)
  public static SubLObject term_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry)
  {
    if( NIL != abstract_lexicon.lex_entry_p( nl_trie_entry ) && NIL != methods.funcall_instance_method_with_1_args( nl_trie_entry, $sym78$GET, $kw79$DENOT ) )
    {
      return ConsesLow.list( nl_trie_entry );
    }
    if( NIL != nl_trie.nl_trie_word_p( nl_trie_entry, UNPROVIDED ) )
    {
      return methods.funcall_instance_method_with_2_args( self, $sym80$NL_TRIE_WORD2LEX_ENTRIES, string, nl_trie_entry );
    }
    if( NIL != nl_trie.nl_trie_term_phrases_entry_p( nl_trie_entry, UNPROVIDED ) )
    {
      return methods.funcall_instance_method_with_2_args( self, $sym81$NL_TRIE_TP2LEX_ENTRIES, string, nl_trie_entry );
    }
    return methods.funcall_instance_method_with_2_args( self, $sym82$NL_TRIE_NAME2LEX_ENTRIES, string, nl_trie_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 5399L)
  public static SubLObject term_lexicon_resporator_to_lex_entry_method(final SubLObject self, final SubLObject typeXstring)
  {
    final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, typeXstring.rest() );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw90$CYC_POS, $const91$ProperNoun );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, $list93 );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw94$PREDICATE, $const95$denotation );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, methods.funcall_class_method_with_1_args( self, $sym96$RESPORATOR_TO_CYCL, typeXstring.first() ) );
    return lex_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 5838L)
  public static SubLObject term_lexicon_copy_method(final SubLObject self, SubLObject target)
  {
    if( target == UNPROVIDED )
    {
      target = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    final SubLObject default_kb_spec = abstract_lexicon.get_abstract_lexicon_default_kb_spec( self );
    final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs( self );
    final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP( self );
    try
    {
      thread.throwStack.push( $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        if( NIL != target && !assertionsDisabledInClass && NIL == term_lexicon_p( target ) )
        {
          throw new AssertionError( target );
        }
        target = abstract_lexicon.abstract_lexicon_copy_method( self, target );
        SubLObject cdolist_list_var = $list103;
        SubLObject slot = NIL;
        slot = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject value = instances.get_slot( self, slot );
          if( value.isList() )
          {
            instances.set_slot( target, slot, conses_high.copy_list( value ) );
          }
          else
          {
            instances.set_slot( target, slot, value );
          }
          cdolist_list_var = cdolist_list_var.rest();
          slot = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, target );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          abstract_lexicon.set_abstract_lexicon_default_kb_spec( self, default_kb_spec );
          set_term_lexicon_concept_filter_specs( self, concept_filter_specs );
          set_term_lexicon_convert_to_elP( self, convert_to_elP );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 6394L)
  public static SubLObject term_lexicon_isolate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    final SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons( self );
    try
    {
      thread.throwStack.push( $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        SubLObject cdolist_list_var = dependent_lexicons;
        SubLObject lexicon = NIL;
        lexicon = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          methods.funcall_instance_method_with_0_args( lexicon, $sym105$ISOLATE );
          cdolist_list_var = cdolist_list_var.rest();
          lexicon = cdolist_list_var.first();
        }
        abstract_lexicon.abstract_lexicon_isolate_method( self );
        Dynamic.sublisp_throw( $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_dependent_lexicons( self, dependent_lexicons );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 6580L)
  public static SubLObject term_lexicon_delete_string_with_term_method(final SubLObject self, final SubLObject string, final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    final SubLObject trie = abstract_lexicon.get_abstract_lexicon_trie( self );
    try
    {
      thread.throwStack.push( $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        assert NIL != cycl_grammar.cycl_denotational_term_p( cycl ) : cycl;
        final SubLObject trie_key = nl_trie.nl_trie_string_tokenize( string );
        SubLObject cdolist_list_var;
        final SubLObject trie_entries = cdolist_list_var = nl_trie.nl_trie_lookup( trie, trie_key, methods.funcall_instance_method_with_0_args( self, $sym115$GET_CASE_SENSITIVITY ) );
        SubLObject trie_entry = NIL;
        trie_entry = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != abstract_lexicon.lex_entry_p( trie_entry ) && cycl.equal( methods.funcall_instance_method_with_1_args( trie_entry, $sym78$GET, $kw79$DENOT ) ) )
          {
            methods.funcall_instance_method_with_2_args( self, $sym116$DELETE_ENTRY_FROM_STRING, trie_entry, string );
          }
          cdolist_list_var = cdolist_list_var.rest();
          trie_entry = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          abstract_lexicon.set_abstract_lexicon_trie( self, trie );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 7585L)
  public static SubLObject get_numeric_date_patterns()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != regular_expressions.is_regular_expressions_support_availableP() )
    {
      if( NIL == $compiled_numeric_date_patterns$.getGlobalValue() )
      {
        SubLObject compiled_patterns = NIL;
        SubLObject cdolist_list_var = $numeric_date_patterns$.getDynamicValue( thread );
        SubLObject pattern_string = NIL;
        pattern_string = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          compiled_patterns = ConsesLow.cons( regular_expressions.compile_regular_expression( pattern_string, UNPROVIDED ), compiled_patterns );
          cdolist_list_var = cdolist_list_var.rest();
          pattern_string = cdolist_list_var.first();
        }
        $compiled_numeric_date_patterns$.setGlobalValue( Sequences.nreverse( compiled_patterns ) );
      }
      return $compiled_numeric_date_patterns$.getGlobalValue();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 8060L)
  public static SubLObject term_lexicon_simple_date_learn_method(final SubLObject self, final SubLObject text)
  {
    SubLObject new_lexes = NIL;
    if( NIL == new_lexes )
    {
      SubLObject csome_list_var = get_numeric_date_patterns();
      SubLObject pattern = NIL;
      pattern = csome_list_var.first();
      while ( NIL == new_lexes && NIL != csome_list_var)
      {
        SubLObject cdolist_list_var = regular_expression_utilities.find_all_matches_for_pattern( pattern, text, UNPROVIDED );
        SubLObject possible_date_string = NIL;
        possible_date_string = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$1 = date_utilities.parse_date_from_string_fast( possible_date_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject date_cycl = NIL;
          date_cycl = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            final SubLObject existing_entries = methods.funcall_instance_method_with_1_args( self, $sym78$GET, possible_date_string );
            final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, possible_date_string );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw90$CYC_POS, $const91$ProperNoun );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, date_cycl );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw125$FRAME, $const126$RegularNounFrame );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, $list93 );
            if( NIL == subl_promotions.memberP( lex_entry, existing_entries, $sym127$LEX_ENTRY_EQUAL_P, UNPROVIDED ) )
            {
              methods.funcall_instance_method_with_1_args( self, $sym128$ADD, lex_entry );
              new_lexes = ConsesLow.cons( lex_entry, new_lexes );
            }
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            date_cycl = cdolist_list_var_$1.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          possible_date_string = cdolist_list_var.first();
        }
        csome_list_var = csome_list_var.rest();
        pattern = csome_list_var.first();
      }
    }
    return new_lexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 9012L)
  public static SubLObject term_lexicon_date_learn_method(final SubLObject self, final SubLObject text)
  {
    SubLObject new_lexes = NIL;
    SubLObject cdolist_list_var = date_utilities.parse_date_from_string_fast( text, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject date_cycl = NIL;
    date_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject existing_entries = methods.funcall_instance_method_with_1_args( self, $sym78$GET, text );
      final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, text );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw90$CYC_POS, $const91$ProperNoun );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, date_cycl );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw125$FRAME, $const126$RegularNounFrame );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, $list93 );
      if( NIL == subl_promotions.memberP( lex_entry, existing_entries, $sym127$LEX_ENTRY_EQUAL_P, UNPROVIDED ) )
      {
        methods.funcall_instance_method_with_1_args( self, $sym128$ADD, lex_entry );
        new_lexes = ConsesLow.cons( lex_entry, new_lexes );
      }
      cdolist_list_var = cdolist_list_var.rest();
      date_cycl = cdolist_list_var.first();
    }
    return new_lexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 9718L)
  public static SubLObject term_lexicon_stanford_ner_date_learn_method(final SubLObject self, final SubLObject text)
  {
    return methods.funcall_instance_method_with_3_args( self, $sym135$STANFORD_NER_LEARN, text, $list136, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 10191L)
  public static SubLObject term_lexicon_stanford_ner_learn_method(final SubLObject self, final SubLObject text, SubLObject allowed_types, SubLObject fabricate_meaningP)
  {
    if( allowed_types == UNPROVIDED )
    {
      allowed_types = $kw140$ANY;
    }
    if( fabricate_meaningP == UNPROVIDED )
    {
      fabricate_meaningP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( text ) : text;
    SubLObject new_lexes = NIL;
    SubLObject error = NIL;
    if( allowed_types == $kw140$ANY )
    {
      allowed_types = instances.get_slot( $sym141$STANFORD_NER, $sym142$KNOWN_CYC_TYPES );
    }
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym143$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject sner = object.new_class_instance( $sym141$STANFORD_NER );
          final SubLObject entity_clusters = ner_clusters( sner, text );
          SubLObject cdolist_list_var;
          final SubLObject merged_clusters = cdolist_list_var = methods.funcall_instance_method_with_2_args( sner, $sym144$MERGE_CLUSTERS, entity_clusters, self );
          SubLObject ec = NIL;
          ec = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject cdolist_list_var_$2 = ec;
            SubLObject nament = NIL;
            nament = cdolist_list_var_$2.first();
            while ( NIL != cdolist_list_var_$2)
            {
              if( NIL == methods.funcall_instance_method_with_1_args( self, $sym78$GET, methods.funcall_instance_method_with_0_args( nament, $sym145$GET_STRING ) ) && NIL != subl_promotions.memberP( methods
                  .funcall_instance_method_with_0_args( nament, $sym146$GET_CYC ), allowed_types, UNPROVIDED, UNPROVIDED ) )
              {
                final SubLObject type = methods.funcall_instance_method_with_0_args( nament, $sym146$GET_CYC );
                final SubLObject subtypes = NIL;
                final SubLObject instance_meanings = named_entity_recognizer.get_nament_instance_meaning( nament );
                final SubLObject string = methods.funcall_instance_method_with_0_args( nament, $sym145$GET_STRING );
                final SubLObject current_entries = methods.funcall_instance_method_with_1_args( self, $sym78$GET, string );
                SubLObject cdolist_list_var_$3 = instance_meanings;
                SubLObject instance = NIL;
                instance = cdolist_list_var_$3.first();
                while ( NIL != cdolist_list_var_$3)
                {
                  final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
                  methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, string );
                  methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw90$CYC_POS, $const91$ProperNoun );
                  methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, instance );
                  methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw125$FRAME, $const126$RegularNounFrame );
                  methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, $list93 );
                  methods.funcall_instance_method_with_1_args( self, $sym128$ADD, lex_entry );
                  new_lexes = ConsesLow.cons( lex_entry, new_lexes );
                  cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                  instance = cdolist_list_var_$3.first();
                }
                if( NIL != fabricate_meaningP )
                {
                  SubLObject cdolist_list_var_$4 = subtypes;
                  SubLObject subtype = NIL;
                  subtype = cdolist_list_var_$4.first();
                  while ( NIL != cdolist_list_var_$4)
                  {
                    if( NIL == lexes_contain_entry_of_type( current_entries, subtype ) )
                    {
                      final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
                      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, string );
                      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw90$CYC_POS, $const91$ProperNoun );
                      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, ConsesLow.list( $const147$InstanceNamedFn_Ternary, string, subtype, Guids.guid_to_string( Guids.new_guid() ) ) );
                      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw125$FRAME, $const126$RegularNounFrame );
                      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, $list93 );
                      methods.funcall_instance_method_with_1_args( self, $sym128$ADD, lex_entry );
                      new_lexes = ConsesLow.cons( lex_entry, new_lexes );
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    subtype = cdolist_list_var_$4.first();
                  }
                  if( NIL == new_lexes && NIL != type && NIL == lexes_contain_entry_of_type( current_entries, type ) )
                  {
                    final SubLObject lex_entry2 = object.new_class_instance( $sym87$LEX_ENTRY );
                    methods.funcall_instance_method_with_2_args( lex_entry2, $sym88$SET, $kw89$STRING, string );
                    methods.funcall_instance_method_with_2_args( lex_entry2, $sym88$SET, $kw90$CYC_POS, $const91$ProperNoun );
                    methods.funcall_instance_method_with_2_args( lex_entry2, $sym88$SET, $kw79$DENOT, ConsesLow.list( $const147$InstanceNamedFn_Ternary, string, type, Guids.guid_to_string( Guids.new_guid() ) ) );
                    methods.funcall_instance_method_with_2_args( lex_entry2, $sym88$SET, $kw125$FRAME, $const126$RegularNounFrame );
                    methods.funcall_instance_method_with_2_args( lex_entry2, $sym88$SET, $kw92$INFLECTIONS, $list93 );
                    methods.funcall_instance_method_with_1_args( self, $sym128$ADD, lex_entry2 );
                    new_lexes = ConsesLow.cons( lex_entry2, new_lexes );
                  }
                }
              }
              cdolist_list_var_$2 = cdolist_list_var_$2.rest();
              nament = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            ec = cdolist_list_var.first();
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      Errors.warn( $str148$___S, error );
    }
    return new_lexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
  public static SubLObject clear_ner_clusters()
  {
    final SubLObject cs = $ner_clusters_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
  public static SubLObject remove_ner_clusters(final SubLObject ner, final SubLObject text)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $ner_clusters_caching_state$.getGlobalValue(), ConsesLow.list( ner, text ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
  public static SubLObject ner_clusters_internal(final SubLObject ner, final SubLObject text)
  {
    return methods.funcall_instance_method_with_1_args( ner, $sym151$RUN, text );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13109L)
  public static SubLObject ner_clusters(final SubLObject ner, final SubLObject text)
  {
    SubLObject caching_state = $ner_clusters_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym150$NER_CLUSTERS, $sym152$_NER_CLUSTERS_CACHING_STATE_, $int153$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( ner, text );
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
        if( ner.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && text.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ner_clusters_internal( ner, text ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( ner, text ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13231L)
  public static SubLObject lexes_contain_entry_of_type(final SubLObject entries, final SubLObject type)
  {
    SubLObject cdolist_list_var = entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject denot = methods.funcall_instance_method_with_1_args( entry, $sym78$GET, $kw79$DENOT );
      if( ( cycl_utilities.nat_functor( denot ).eql( $const147$InstanceNamedFn_Ternary ) && cycl_utilities.nat_arg2( denot, UNPROVIDED ).equal( type ) ) || NIL != isa.isa_in_any_mtP( denot, type ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 13740L)
  public static SubLObject term_lexicon_scalar_interval_learn_method(final SubLObject self, final SubLObject text)
  {
    SubLObject scalar_entries = NIL;
    SubLObject cdolist_list_var = abstract_lexicon.scalar_interval_meanings( text );
    SubLObject scalar_string_cycl = NIL;
    scalar_string_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = scalar_string_cycl;
      SubLObject scalar_string = NIL;
      SubLObject scalar_cycl = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
      scalar_string = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
      scalar_cycl = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject known_entries = methods.funcall_instance_method_with_1_args( self, $sym78$GET, scalar_string );
        final SubLObject already_known = subl_promotions.memberP( scalar_cycl, known_entries, EQUAL, $sym158$LEX_ENTRY_DENOT );
        if( NIL == already_known )
        {
          final SubLObject lex_entry = number_term_lex_entry( scalar_string, scalar_cycl );
          methods.funcall_instance_method_with_1_args( self, $sym128$ADD, lex_entry );
          scalar_entries = ConsesLow.cons( lex_entry, scalar_entries );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list157 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      scalar_string_cycl = cdolist_list_var.first();
    }
    return scalar_entries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 14329L)
  public static SubLObject term_lexicon_number_learn_method(final SubLObject self, final SubLObject text)
  {
    final SubLObject numbers = abstract_lexicon.number_meanings( text );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = numbers;
    SubLObject number = NIL;
    number = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = number;
      SubLObject number_string = NIL;
      SubLObject meaning = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list162 );
      number_string = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list162 );
      meaning = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject known_entries = methods.funcall_instance_method_with_1_args( self, $sym78$GET, number_string );
        final SubLObject already_known = subl_promotions.memberP( meaning, known_entries, EQUAL, $sym158$LEX_ENTRY_DENOT );
        if( NIL == already_known )
        {
          final SubLObject lex_entry = number_term_lex_entry( number_string, meaning );
          methods.funcall_instance_method_with_1_args( self, $sym128$ADD, lex_entry );
          result = ConsesLow.cons( lex_entry, result );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list162 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      number = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 14876L)
  public static SubLObject number_term_lex_entry(final SubLObject string, final SubLObject number)
  {
    final SubLObject lex = object.new_class_instance( $sym87$LEX_ENTRY );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw89$STRING, string );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw164$PENN_TAGS, $list165 );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw90$CYC_POS, $const166$Number_SP );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw79$DENOT, number );
    return lex;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 15139L)
  public static SubLObject term_lexicon_simple_date_from_string_learn_method(final SubLObject self, final SubLObject text)
  {
    final SubLObject dates = date_utilities.parse_date_from_string_fast( text, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dates;
    SubLObject date = NIL;
    date = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, text );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw90$CYC_POS, $const91$ProperNoun );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, date );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw125$FRAME, $const126$RegularNounFrame );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, $list93 );
      methods.funcall_instance_method_with_1_args( self, $sym128$ADD, lex_entry );
      result = ConsesLow.cons( lex_entry, result );
      cdolist_list_var = cdolist_list_var.rest();
      date = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 15710L)
  public static SubLObject date_term_from_number_lex_entry(final SubLObject string, final SubLObject number)
  {
    final SubLObject lex = object.new_class_instance( $sym87$LEX_ENTRY );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw89$STRING, string );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw164$PENN_TAGS, $list170 );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw90$CYC_POS, $const91$ProperNoun );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw79$DENOT, ConsesLow.list( $const171$YearFn, number ) );
    return lex;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 15998L)
  public static SubLObject term_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text)
  {
    SubLObject cdolist_list_var;
    final SubLObject entries = cdolist_list_var = text_noun_compound_term_lex_entries( text );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      methods.funcall_instance_method_with_1_args( self, $sym128$ADD, entry );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return entries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 16215L)
  public static SubLObject text_noun_compound_term_lex_entries(final SubLObject str)
  {
    final SubLObject compounds = abstract_lexicon.noun_compound_meanings( str );
    SubLObject res = NIL;
    SubLObject cdolist_list_var = compounds;
    SubLObject compound = NIL;
    compound = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = compound;
      SubLObject string = NIL;
      SubLObject meanings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      string = current.first();
      current = current.rest();
      SubLObject cdolist_list_var_$5;
      meanings = ( cdolist_list_var_$5 = current );
      SubLObject meaning = NIL;
      meaning = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        SubLObject current_$7;
        final SubLObject datum_$6 = current_$7 = meaning;
        SubLObject cycl = NIL;
        SubLObject agr_pred = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list176 );
        cycl = current_$7.first();
        current_$7 = current_$7.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list176 );
        agr_pred = current_$7.first();
        current_$7 = current_$7.rest();
        if( NIL == current_$7 )
        {
          res = ConsesLow.cons( noun_compound_term_lex_entry( string, cycl, agr_pred ), res );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$6, $list176 );
        }
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        meaning = cdolist_list_var_$5.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      compound = cdolist_list_var.first();
    }
    return res;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 16593L)
  public static SubLObject noun_compound_term_lex_entry(final SubLObject string, final SubLObject denotation, final SubLObject number)
  {
    final SubLObject lex = object.new_class_instance( $sym87$LEX_ENTRY );
    final SubLObject penn_tags = ( NIL != backward.removal_ask( ConsesLow.listS( $const177$genlPreds, number, $list178 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? $list179 : $list180;
    final SubLObject reformulated_denotation = reformulator_hub.reformulate_cycl( denotation, $const181$EverythingPSC, UNPROVIDED );
    final SubLObject final_denotation = ( NIL != reformulated_denotation ) ? reformulated_denotation : denotation;
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw89$STRING, string );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw164$PENN_TAGS, penn_tags );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw90$CYC_POS, $const182$Noun );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw125$FRAME, $const126$RegularNounFrame );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw79$DENOT, final_denotation );
    methods.funcall_instance_method_with_2_args( lex, $sym88$SET, $kw92$INFLECTIONS, ConsesLow.list( number ) );
    return lex;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 17228L)
  public static SubLObject term_lexicon_nl_trie_word2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_word)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs( self );
    final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP( self );
    try
    {
      thread.throwStack.push( $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        SubLObject lex_entries = NIL;
        final SubLObject word_unit = nl_trie.nl_trie_word_word_unit( nl_trie_word, UNPROVIDED );
        final SubLObject pos_preds = nl_trie.nl_trie_word_pos_preds( nl_trie_word );
        final SubLObject lex_pred = nl_trie.nl_trie_entry_semantic_pred( nl_trie_word, UNPROVIDED );
        final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics( nl_trie_word );
        SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots( nl_trie_word );
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == concept_filter_specs || NIL != denot_passes_filter_specsP( denot, concept_filter_specs ) )
          {
            final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw186$PRAGMATICS, pragmatics );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, ( NIL != convert_to_elP ) ? cycl_utilities.hl_to_el( denot ) : denot );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw94$PREDICATE, lex_pred );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, pos_preds );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw187$WORD_UNIT, word_unit );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw188$TRIE_ENTRY, nl_trie_word );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, string );
            lex_entries = ConsesLow.cons( lex_entry, lex_entries );
          }
          cdolist_list_var = cdolist_list_var.rest();
          denot = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_concept_filter_specs( self, concept_filter_specs );
          set_term_lexicon_convert_to_elP( self, convert_to_elP );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 18564L)
  public static SubLObject term_lexicon_nl_trie_name2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs( self );
    final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP( self );
    try
    {
      thread.throwStack.push( $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        SubLObject lex_entries = NIL;
        final SubLObject pos = $const91$ProperNoun;
        final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred( nl_trie_name, UNPROVIDED );
        final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics( nl_trie_name );
        SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots( nl_trie_name );
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == concept_filter_specs || NIL != denot_passes_filter_specsP( denot, concept_filter_specs ) )
          {
            final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw186$PRAGMATICS, pragmatics );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, ( NIL != convert_to_elP ) ? cycl_utilities.hl_to_el( denot ) : denot );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw94$PREDICATE, predicate );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw90$CYC_POS, pos );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, string );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, $list193 );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw188$TRIE_ENTRY, nl_trie_name );
            lex_entries = ConsesLow.cons( lex_entry, lex_entries );
          }
          cdolist_list_var = cdolist_list_var.rest();
          denot = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_concept_filter_specs( self, concept_filter_specs );
          set_term_lexicon_convert_to_elP( self, convert_to_elP );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 19446L)
  public static SubLObject term_lexicon_nl_trie_tp2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject tp_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_term_lexicon_method = NIL;
    final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs( self );
    final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP( self );
    try
    {
      thread.throwStack.push( $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
      try
      {
        SubLObject lex_entries = NIL;
        final SubLObject pos = nl_trie.nl_trie_entry_pos( tp_entry );
        final SubLObject inflections = nl_trie.nl_trie_entry_pos_preds( tp_entry );
        final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred( tp_entry, UNPROVIDED );
        final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics( tp_entry );
        SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots( tp_entry );
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == concept_filter_specs || NIL != denot_passes_filter_specsP( denot, concept_filter_specs ) )
          {
            final SubLObject lex_entry = object.new_class_instance( $sym87$LEX_ENTRY );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw186$PRAGMATICS, pragmatics );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw79$DENOT, ( NIL != convert_to_elP ) ? cycl_utilities.hl_to_el( denot ) : denot );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw94$PREDICATE, predicate );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw90$CYC_POS, pos );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw89$STRING, string );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw92$INFLECTIONS, inflections );
            methods.funcall_instance_method_with_2_args( lex_entry, $sym88$SET, $kw188$TRIE_ENTRY, tp_entry );
            lex_entries = ConsesLow.cons( lex_entry, lex_entries );
          }
          cdolist_list_var = cdolist_list_var.rest();
          denot = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_term_lexicon_concept_filter_specs( self, concept_filter_specs );
          set_term_lexicon_convert_to_elP( self, convert_to_elP );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_term_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_term_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 20360L)
  public static SubLObject denot_passes_filter_specsP(final SubLObject denot, final SubLObject filter_specs)
  {
    SubLObject cdolist_list_var = filter_specs;
    SubLObject filter_spec = NIL;
    filter_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == denot_passes_filter_specP( denot, filter_spec ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      filter_spec = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 20553L)
  public static SubLObject denot_passes_filter_specP(final SubLObject denot, final SubLObject filter_spec)
  {
    return list_utilities.non_empty_list_p( concept_filter.valid_concept_filter_nodes( denot, filter_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 20691L)
  public static SubLObject denots_for_term_lexicon_entries(final SubLObject entries)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = narts_high.nart_substitute( methods.funcall_instance_method_with_1_args( entry, $sym78$GET, $kw79$DENOT ) );
      if( NIL == conses_high.member( item_var, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/term-lexicon.lisp", position = 20892L)
  public static SubLObject test_simple_date_learn(final SubLObject sentence)
  {
    final SubLObject lex = new_term_lexicon();
    SubLObject dates = NIL;
    methods.funcall_instance_method_with_1_args( lex, $sym200$ADD_LEARNER, $sym122$SIMPLE_DATE_LEARN );
    methods.funcall_instance_method_with_1_args( lex, $sym201$LEARN, sentence );
    SubLObject cdolist_list_var;
    final SubLObject lexes = cdolist_list_var = methods.funcall_instance_method_with_1_args( lex, $sym78$GET, sentence );
    SubLObject lex_item = NIL;
    lex_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dates = ConsesLow.cons( methods.funcall_instance_method_with_1_args( lex_item, $sym78$GET, $kw79$DENOT ), dates );
      cdolist_list_var = cdolist_list_var.rest();
      lex_item = cdolist_list_var.first();
    }
    return dates;
  }

  public static SubLObject declare_term_lexicon_file()
  {
    SubLFiles.declareFunction( me, "new_term_lexicon", "NEW-TERM-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_term_lexicon", "GET-TERM-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "new_case_sensitivity_preferred_term_lexicon", "NEW-CASE-SENSITIVITY-PREFERRED-TERM-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_term_lexicon_dependent_lexicons", "GET-TERM-LEXICON-DEPENDENT-LEXICONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_term_lexicon_dependent_lexicons", "SET-TERM-LEXICON-DEPENDENT-LEXICONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_term_lexicon_concept_filter_specs", "GET-TERM-LEXICON-CONCEPT-FILTER-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_term_lexicon_concept_filter_specs", "SET-TERM-LEXICON-CONCEPT-FILTER-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_term_lexicon_convert_to_elP", "GET-TERM-LEXICON-CONVERT-TO-EL?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_term_lexicon_convert_to_elP", "SET-TERM-LEXICON-CONVERT-TO-EL?", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_term_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_term_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_p", "TERM-LEXICON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_initialize_method", "TERM-LEXICON-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_note_dependent_lexicon_method", "TERM-LEXICON-NOTE-DEPENDENT-LEXICON-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_remove_dependent_lexicon_method", "TERM-LEXICON-REMOVE-DEPENDENT-LEXICON-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_set_convert_to_el_method", "TERM-LEXICON-SET-CONVERT-TO-EL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_get_convert_to_el_method", "TERM-LEXICON-GET-CONVERT-TO-EL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_remove_all_concept_filter_specs_method", "TERM-LEXICON-REMOVE-ALL-CONCEPT-FILTER-SPECS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_add_concept_filter_spec_method", "TERM-LEXICON-ADD-CONCEPT-FILTER-SPEC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_get_concept_filter_specs_method", "TERM-LEXICON-GET-CONCEPT-FILTER-SPECS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_create_lex_entries_method", "TERM-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_resporator_to_lex_entry_method", "TERM-LEXICON-RESPORATOR-TO-LEX-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_copy_method", "TERM-LEXICON-COPY-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "term_lexicon_isolate_method", "TERM-LEXICON-ISOLATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_delete_string_with_term_method", "TERM-LEXICON-DELETE-STRING-WITH-TERM-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "get_numeric_date_patterns", "GET-NUMERIC-DATE-PATTERNS", 0, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_simple_date_learn_method", "TERM-LEXICON-SIMPLE-DATE-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_date_learn_method", "TERM-LEXICON-DATE-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_stanford_ner_date_learn_method", "TERM-LEXICON-STANFORD-NER-DATE-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_stanford_ner_learn_method", "TERM-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "clear_ner_clusters", "CLEAR-NER-CLUSTERS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ner_clusters", "REMOVE-NER-CLUSTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "ner_clusters_internal", "NER-CLUSTERS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "ner_clusters", "NER-CLUSTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "lexes_contain_entry_of_type", "LEXES-CONTAIN-ENTRY-OF-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_scalar_interval_learn_method", "TERM-LEXICON-SCALAR-INTERVAL-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_number_learn_method", "TERM-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "number_term_lex_entry", "NUMBER-TERM-LEX-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_simple_date_from_string_learn_method", "TERM-LEXICON-SIMPLE-DATE-FROM-STRING-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "date_term_from_number_lex_entry", "DATE-TERM-FROM-NUMBER-LEX-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_noun_compound_learn_method", "TERM-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "text_noun_compound_term_lex_entries", "TEXT-NOUN-COMPOUND-TERM-LEX-ENTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "noun_compound_term_lex_entry", "NOUN-COMPOUND-TERM-LEX-ENTRY", 3, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_nl_trie_word2lex_entries_method", "TERM-LEXICON-NL-TRIE-WORD2LEX-ENTRIES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_nl_trie_name2lex_entries_method", "TERM-LEXICON-NL-TRIE-NAME2LEX-ENTRIES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "term_lexicon_nl_trie_tp2lex_entries_method", "TERM-LEXICON-NL-TRIE-TP2LEX-ENTRIES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "denot_passes_filter_specsP", "DENOT-PASSES-FILTER-SPECS?", 2, 0, false );
    SubLFiles.declareFunction( me, "denot_passes_filter_specP", "DENOT-PASSES-FILTER-SPEC?", 2, 0, false );
    SubLFiles.declareFunction( me, "denots_for_term_lexicon_entries", "DENOTS-FOR-TERM-LEXICON-ENTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "test_simple_date_learn", "TEST-SIMPLE-DATE-LEARN", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_term_lexicon_file()
  {
    $term_lexicon$ = SubLFiles.defparameter( "*TERM-LEXICON*", NIL );
    $numeric_date_patterns$ = SubLFiles.defparameter( "*NUMERIC-DATE-PATTERNS*", ConsesLow.list( $str118$_0_9__1_2______0_9__1_2______0_9_, $str119$_0_9__4_4_______0_9__1_2_______0_, $str120$_0_9__1_2______0_9__2_4_,
        $str121$_0_9__4_ ) );
    $compiled_numeric_date_patterns$ = SubLFiles.deflexical( "*COMPILED-NUMERIC-DATE-PATTERNS*", NIL );
    $ner_clusters_caching_state$ = SubLFiles.deflexical( "*NER-CLUSTERS-CACHING-STATE*", NIL );
    $term_lexicon_learners$ = SubLFiles.defparameter( "*TERM-LEXICON-LEARNERS*", $list154 );
    return NIL;
  }

  public static SubLObject setup_term_lexicon_file()
  {
    classes.subloop_new_class( $sym0$TERM_LEXICON, $sym3$ABSTRACT_LEXICON, NIL, NIL, $list4 );
    classes.class_set_implements_slot_listeners( $sym0$TERM_LEXICON, NIL );
    classes.subloop_note_class_initialization_function( $sym0$TERM_LEXICON, $sym17$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$TERM_LEXICON, $sym36$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_INSTANCE );
    subloop_reserved_initialize_term_lexicon_class( $sym0$TERM_LEXICON );
    methods.methods_incorporate_instance_method( $sym37$INITIALIZE, $sym0$TERM_LEXICON, $list38, NIL, $list39 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym37$INITIALIZE, $sym41$TERM_LEXICON_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym42$NOTE_DEPENDENT_LEXICON, $sym0$TERM_LEXICON, $list38, $list43, $list44 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym42$NOTE_DEPENDENT_LEXICON, $sym46$TERM_LEXICON_NOTE_DEPENDENT_LEXICON_METHOD );
    methods.methods_incorporate_instance_method( $sym47$REMOVE_DEPENDENT_LEXICON, $sym0$TERM_LEXICON, $list38, $list43, $list48 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym47$REMOVE_DEPENDENT_LEXICON, $sym50$TERM_LEXICON_REMOVE_DEPENDENT_LEXICON_METHOD );
    methods.methods_incorporate_instance_method( $sym51$SET_CONVERT_TO_EL, $sym0$TERM_LEXICON, $list52, $list53, $list54 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym51$SET_CONVERT_TO_EL, $sym56$TERM_LEXICON_SET_CONVERT_TO_EL_METHOD );
    methods.methods_incorporate_instance_method( $sym57$GET_CONVERT_TO_EL, $sym0$TERM_LEXICON, $list52, NIL, $list58 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym57$GET_CONVERT_TO_EL, $sym60$TERM_LEXICON_GET_CONVERT_TO_EL_METHOD );
    methods.methods_incorporate_instance_method( $sym61$REMOVE_ALL_CONCEPT_FILTER_SPECS, $sym0$TERM_LEXICON, $list52, NIL, $list62 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym61$REMOVE_ALL_CONCEPT_FILTER_SPECS, $sym64$TERM_LEXICON_REMOVE_ALL_CONCEPT_FILTER_SPECS_METHOD );
    methods.methods_incorporate_instance_method( $sym65$ADD_CONCEPT_FILTER_SPEC, $sym0$TERM_LEXICON, $list52, $list66, $list67 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym65$ADD_CONCEPT_FILTER_SPEC, $sym70$TERM_LEXICON_ADD_CONCEPT_FILTER_SPEC_METHOD );
    methods.methods_incorporate_instance_method( $sym71$GET_CONCEPT_FILTER_SPECS, $sym0$TERM_LEXICON, $list52, NIL, $list72 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym71$GET_CONCEPT_FILTER_SPECS, $sym74$TERM_LEXICON_GET_CONCEPT_FILTER_SPECS_METHOD );
    methods.methods_incorporate_instance_method( $sym75$CREATE_LEX_ENTRIES, $sym0$TERM_LEXICON, $list38, $list76, $list77 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym75$CREATE_LEX_ENTRIES, $sym83$TERM_LEXICON_CREATE_LEX_ENTRIES_METHOD );
    methods.methods_incorporate_class_method( $sym84$RESPORATOR_TO_LEX_ENTRY, $sym0$TERM_LEXICON, $list38, $list85, $list86 );
    methods.subloop_register_class_method( $sym0$TERM_LEXICON, $sym84$RESPORATOR_TO_LEX_ENTRY, $sym97$TERM_LEXICON_RESPORATOR_TO_LEX_ENTRY_METHOD );
    methods.methods_incorporate_instance_method( $sym98$COPY, $sym0$TERM_LEXICON, $list52, $list99, $list100 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym98$COPY, $sym104$TERM_LEXICON_COPY_METHOD );
    methods.methods_incorporate_instance_method( $sym105$ISOLATE, $sym0$TERM_LEXICON, $list38, NIL, $list106 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym105$ISOLATE, $sym108$TERM_LEXICON_ISOLATE_METHOD );
    methods.methods_incorporate_instance_method( $sym109$DELETE_STRING_WITH_TERM, $sym0$TERM_LEXICON, $list52, $list110, $list111 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym109$DELETE_STRING_WITH_TERM, $sym117$TERM_LEXICON_DELETE_STRING_WITH_TERM_METHOD );
    methods.methods_incorporate_instance_method( $sym122$SIMPLE_DATE_LEARN, $sym0$TERM_LEXICON, $list38, $list123, $list124 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym122$SIMPLE_DATE_LEARN, $sym129$TERM_LEXICON_SIMPLE_DATE_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym130$DATE_LEARN, $sym0$TERM_LEXICON, $list38, $list123, $list131 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym130$DATE_LEARN, $sym132$TERM_LEXICON_DATE_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym133$STANFORD_NER_DATE_LEARN, $sym0$TERM_LEXICON, $list38, $list123, $list134 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym133$STANFORD_NER_DATE_LEARN, $sym137$TERM_LEXICON_STANFORD_NER_DATE_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym135$STANFORD_NER_LEARN, $sym0$TERM_LEXICON, $list38, $list138, $list139 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym135$STANFORD_NER_LEARN, $sym149$TERM_LEXICON_STANFORD_NER_LEARN_METHOD );
    memoization_state.note_globally_cached_function( $sym150$NER_CLUSTERS );
    methods.methods_incorporate_instance_method( $sym155$SCALAR_INTERVAL_LEARN, $sym0$TERM_LEXICON, $list38, $list123, $list156 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym155$SCALAR_INTERVAL_LEARN, $sym159$TERM_LEXICON_SCALAR_INTERVAL_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym160$NUMBER_LEARN, $sym0$TERM_LEXICON, $list38, $list123, $list161 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym160$NUMBER_LEARN, $sym163$TERM_LEXICON_NUMBER_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym167$SIMPLE_DATE_FROM_STRING_LEARN, $sym0$TERM_LEXICON, $list38, $list123, $list168 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym167$SIMPLE_DATE_FROM_STRING_LEARN, $sym169$TERM_LEXICON_SIMPLE_DATE_FROM_STRING_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym172$NOUN_COMPOUND_LEARN, $sym0$TERM_LEXICON, $list38, $list123, $list173 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym172$NOUN_COMPOUND_LEARN, $sym174$TERM_LEXICON_NOUN_COMPOUND_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym80$NL_TRIE_WORD2LEX_ENTRIES, $sym0$TERM_LEXICON, $list38, $list183, $list184 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym80$NL_TRIE_WORD2LEX_ENTRIES, $sym189$TERM_LEXICON_NL_TRIE_WORD2LEX_ENTRIES_METHOD );
    methods.methods_incorporate_instance_method( $sym82$NL_TRIE_NAME2LEX_ENTRIES, $sym0$TERM_LEXICON, $list38, $list190, $list191 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym82$NL_TRIE_NAME2LEX_ENTRIES, $sym194$TERM_LEXICON_NL_TRIE_NAME2LEX_ENTRIES_METHOD );
    methods.methods_incorporate_instance_method( $sym81$NL_TRIE_TP2LEX_ENTRIES, $sym0$TERM_LEXICON, $list38, $list195, $list196 );
    methods.subloop_register_instance_method( $sym0$TERM_LEXICON, $sym81$NL_TRIE_TP2LEX_ENTRIES, $sym198$TERM_LEXICON_NL_TRIE_TP2LEX_ENTRIES_METHOD );
    access_macros.register_external_symbol( $sym199$DENOTS_FOR_TERM_LEXICON_ENTRIES );
    generic_testing.define_test_case_table_int( $sym202$TEST_SIMPLE_DATE_LEARN, ConsesLow.list( new SubLObject[] { $kw203$TEST, $sym204$HAS_MEMBER_EQUAL_, $kw205$OWNER, NIL, $kw206$CLASSES, NIL, $kw207$KB, $kw208$FULL,
      $kw209$WORKING_, T
    } ), $list210 );
    return NIL;
  }

  private static SubLObject _constant_139_initializer()
  {
    return ConsesLow.list( makeString(
        "@param TEXT stringp; the text from which to learn lexical entries\n   @param FABRICATE-MEANINGS boolean; if true, some meaning will be returned even if the found date is not understood\n   @return listp; a list of term-lexicon lexical entries learned from TEXT" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TEXT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-LEXES" ), NIL ), makeSymbol(
            "ERROR" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "ALLOWED-TYPES" ), makeKeyword( "ANY" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ALLOWED-TYPES" ), ConsesLow
                .list( makeSymbol( "GET-SLOT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STANFORD-NER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "KNOWN-CYC-TYPES" ) ) ) ) ), ConsesLow.list(
                    makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SNER" ), ConsesLow.list( makeSymbol(
                        "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STANFORD-NER" ) ) ) ), ConsesLow.list( makeSymbol( "ENTITY-CLUSTERS" ), ConsesLow.list( makeSymbol( "NER-CLUSTERS" ),
                            makeSymbol( "SNER" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "MERGED-CLUSTERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SNER" ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "MERGE-CLUSTERS" ) ), makeSymbol( "ENTITY-CLUSTERS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "EC" ),
                                    makeSymbol( "MERGED-CLUSTERS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "NAMENT" ), makeSymbol( "EC" ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                        ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                            makeSymbol( "GET" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ), ConsesLow.list(
                                                makeSymbol( "MEMBER?" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CYC" ) ) ), makeSymbol(
                                                    "ALLOWED-TYPES" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                        "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CYC" ) ) ) ), ConsesLow.list( makeSymbol( "SUBTYPES" ), NIL ), ConsesLow.list( makeSymbol(
                                                            "INSTANCE-MEANINGS" ), ConsesLow.list( makeSymbol( "GET-NAMENT-INSTANCE-MEANING" ), makeSymbol( "NAMENT" ) ) ), ConsesLow.list( makeSymbol( "STRING" ),
                                                                ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list(
                                                                    makeSymbol( "CURRENT-ENTRIES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                        "GET" ) ), makeSymbol( "STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol(
                                                                            "INSTANCE-MEANINGS" ) ), ConsesLow.list( new SubLObject[]
                                                                            { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow
                                                                                .list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow
                                                                                    .list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol(
                                                                                        "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ),
                                                                                        constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                                            "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ), makeSymbol( "INSTANCE" ) ),
                                                                              ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword(
                                                                                  "FRAME" ), constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                      makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list(
                                                                                          makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ), ConsesLow
                                                                                              .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol(
                                                                                                  "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "NEW-LEXES" ) )
                                        } ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "FABRICATE-MEANING?" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SUBTYPE" ), makeSymbol(
                                            "SUBTYPES" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "LEXES-CONTAIN-ENTRY-OF-TYPE" ), makeSymbol( "CURRENT-ENTRIES" ), makeSymbol(
                                                "SUBTYPE" ) ), ConsesLow.list( new SubLObject[]
                                                { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
                                                    "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                        "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                            makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol(
                                                                "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ), ConsesLow.list( makeSymbol(
                                                                    "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) ), makeSymbol( "STRING" ), makeSymbol( "SUBTYPE" ),
                                                                    ConsesLow.list( makeSymbol( "GUID-TO-STRING" ), ConsesLow.list( makeSymbol( "NEW-GUID" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                        "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell(
                                                                            makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles
                                                                                    .reader_make_constant_shell( makeString( "singular" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                                                                                        .list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                                                                                            "LEX-ENTRY" ), makeSymbol( "NEW-LEXES" ) )
                                        } ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "NEW-LEXES" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TYPE" ) ),
                                            ConsesLow.list( makeSymbol( "LEXES-CONTAIN-ENTRY-OF-TYPE" ), makeSymbol( "CURRENT-ENTRIES" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( new SubLObject[]
                                            { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                                                    makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                        "SET" ) ), makeKeyword( "CYC-POS" ), constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                            "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles
                                                                .reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) ), makeSymbol( "STRING" ), makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol(
                                                                    "GUID-TO-STRING" ), ConsesLow.list( makeSymbol( "NEW-GUID" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                                                        makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString(
                                                                            "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                    makeString( "singular" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                        makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol(
                                                                                            "NEW-LEXES" ) )
                                        } ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "WARN" ), makeString( "~%~S" ), makeSymbol( "ERROR" ) ) ), ConsesLow
                                            .list( makeSymbol( "RET" ), makeSymbol( "NEW-LEXES" ) ) ) );
  }

  @Override
  public void declareFunctions()
  {
    declare_term_lexicon_file();
  }

  @Override
  public void initializeVariables()
  {
    init_term_lexicon_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_term_lexicon_file();
  }
  static
  {
    me = new term_lexicon();
    $term_lexicon$ = null;
    $numeric_date_patterns$ = null;
    $compiled_numeric_date_patterns$ = null;
    $ner_clusters_caching_state$ = null;
    $term_lexicon_learners$ = null;
    $sym0$TERM_LEXICON = makeSymbol( "TERM-LEXICON" );
    $sym1$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $kw2$PREFERRED = makeKeyword( "PREFERRED" );
    $sym3$ABSTRACT_LEXICON = makeSymbol( "ABSTRACT-LEXICON" );
    $list4 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEFAULT-KB-SPEC" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), constant_handles.reader_make_constant_shell(
        makeString( "TermLexiconSpecification" ) ) ), ConsesLow.list( makeSymbol( "CONVERT-TO-EL?" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), T ), ConsesLow.list( makeSymbol(
            "CONCEPT-FILTER-SPECS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEPENDENT-LEXICONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-LEX-ENTRIES" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "NL-TRIE-WORD2LEX-ENTRY" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-NAME" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "NL-TRIE-TP2LEX-ENTRIES" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-NAME" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "NL-TRIE-NAME2LEX-ENTRIES" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-NAME" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "STANFORD-NER-DATE-LEARN" ), ConsesLow.list( makeSymbol( "TEXT" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "STANFORD-NER-LEARN" ), ConsesLow.list( makeSymbol( "TEXT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ALLOWED-TYPES" ) ), makeKeyword(
                                        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NOTE-DEPENDENT-LEXICON" ), ConsesLow.list( makeSymbol( "LEXICON" ) ), makeKeyword(
                                            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE-DEPENDENT-LEXICON" ), ConsesLow.list( makeSymbol( "LEXICON" ) ), makeKeyword(
                                                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONVERT-TO-EL" ), ConsesLow.list( makeSymbol( "BOOLEAN" ) ), makeKeyword(
                                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONVERT-TO-EL" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-CONCEPT-FILTER-SPEC" ), ConsesLow.list( makeSymbol( "SPEC" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONCEPT-FILTER-SPECS" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym5$DEPENDENT_LEXICONS = makeSymbol( "DEPENDENT-LEXICONS" );
    $sym6$CONCEPT_FILTER_SPECS = makeSymbol( "CONCEPT-FILTER-SPECS" );
    $sym7$CONVERT_TO_EL_ = makeSymbol( "CONVERT-TO-EL?" );
    $sym8$OBJECT = makeSymbol( "OBJECT" );
    $sym9$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym10$DEFAULT_EXCLUDE_MTS = makeSymbol( "DEFAULT-EXCLUDE-MTS" );
    $list11 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "WebSearchDataMt" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "RelationParaphraseMt" ) ), constant_handles.reader_make_constant_shell( makeString( "WordNetMappingMt" ) ), constant_handles.reader_make_constant_shell( makeString(
            "PornographyJargonMt" ) ), constant_handles.reader_make_constant_shell( makeString( "CommonEnglishMisspellingsMt" ) ), constant_handles.reader_make_constant_shell( makeString( "ComputereseLexicalMt" ) ),
      constant_handles.reader_make_constant_shell( makeString( "CyclishMt" ) ), constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalAssertionsMt" ) ), constant_handles.reader_make_constant_shell(
          makeString( "EnglishWordSenseAssertions-HoldingMt" ) ), constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalAssertions-WordNetImportMt" ) ), constant_handles.reader_make_constant_shell(
              makeString( "RedundantLexicalMt" ) ), constant_handles.reader_make_constant_shell( makeString( "PDATemplateTestMt" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SupplementalDeterminerSemTransLexicalMt" ) )
    } );
    $sym12$DEFAULT_EXCLUDE_PREDICATES = makeSymbol( "DEFAULT-EXCLUDE-PREDICATES" );
    $sym13$DEFAULT_BASE_MT = makeSymbol( "DEFAULT-BASE-MT" );
    $const14$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell( makeString( "AllGeneralEnglishValidatedLexicalMicrotheoryPSC" ) );
    $sym15$DEFAULT_KB_SPEC = makeSymbol( "DEFAULT-KB-SPEC" );
    $const16$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell( makeString( "AbstractLexiconSpecification" ) );
    $sym17$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-CLASS" );
    $sym18$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym19$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym20$ALLOWED_MTS = makeSymbol( "ALLOWED-MTS" );
    $kw21$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym22$EXCLUDED_MTS = makeSymbol( "EXCLUDED-MTS" );
    $sym23$BASE_MT = makeSymbol( "BASE-MT" );
    $sym24$ROOT_MT = makeSymbol( "ROOT-MT" );
    $sym25$EXCLUDED_PREDS = makeSymbol( "EXCLUDED-PREDS" );
    $sym26$EXCLUDED_POS_LIST = makeSymbol( "EXCLUDED-POS-LIST" );
    $sym27$TRIE = makeSymbol( "TRIE" );
    $sym28$CACHE = makeSymbol( "CACHE" );
    $sym29$IGNORE_CACHE_ = makeSymbol( "IGNORE-CACHE?" );
    $sym30$CASE_SENSITIVITY = makeSymbol( "CASE-SENSITIVITY" );
    $sym31$ALLOW_FABRICATION_ = makeSymbol( "ALLOW-FABRICATION?" );
    $sym32$LEARNED = makeSymbol( "LEARNED" );
    $sym33$ACTIVE_LEARNERS = makeSymbol( "ACTIVE-LEARNERS" );
    $sym34$ALLOW_STEMMING = makeSymbol( "ALLOW-STEMMING" );
    $sym35$STOP_WORDS = makeSymbol( "STOP-WORDS" );
    $sym36$SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-INSTANCE" );
    $sym37$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list38 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list39 = ConsesLow.list( makeString( "Initializes this term lexicon" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ALLOW-FABRICATION?" ),
        NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym41$TERM_LEXICON_INITIALIZE_METHOD = makeSymbol( "TERM-LEXICON-INITIALIZE-METHOD" );
    $sym42$NOTE_DEPENDENT_LEXICON = makeSymbol( "NOTE-DEPENDENT-LEXICON" );
    $list43 = ConsesLow.list( makeSymbol( "LEXICON" ) );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEXICON" ), makeSymbol( "DEPENDENT-LEXICONS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym46$TERM_LEXICON_NOTE_DEPENDENT_LEXICON_METHOD = makeSymbol( "TERM-LEXICON-NOTE-DEPENDENT-LEXICON-METHOD" );
    $sym47$REMOVE_DEPENDENT_LEXICON = makeSymbol( "REMOVE-DEPENDENT-LEXICON" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEPENDENT-LEXICONS" ), ConsesLow.list( makeSymbol( "DELETE" ), makeSymbol( "LEXICON" ), makeSymbol( "DEPENDENT-LEXICONS" ) ) ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym50$TERM_LEXICON_REMOVE_DEPENDENT_LEXICON_METHOD = makeSymbol( "TERM-LEXICON-REMOVE-DEPENDENT-LEXICON-METHOD" );
    $sym51$SET_CONVERT_TO_EL = makeSymbol( "SET-CONVERT-TO-EL" );
    $list52 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list53 = ConsesLow.list( makeSymbol( "BOOLEAN" ) );
    $list54 = ConsesLow.list( makeString( "Set lexicon's convert-to-el? value to BOOLEAN." ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONVERT-TO-EL?" ), ConsesLow.list( makeSymbol( "BOOLEAN" ), makeSymbol(
        "BOOLEAN" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym56$TERM_LEXICON_SET_CONVERT_TO_EL_METHOD = makeSymbol( "TERM-LEXICON-SET-CONVERT-TO-EL-METHOD" );
    $sym57$GET_CONVERT_TO_EL = makeSymbol( "GET-CONVERT-TO-EL" );
    $list58 = ConsesLow.list( makeString( "Return lexicon's convert-to-el? value" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONVERT-TO-EL?" ) ) );
    $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym60$TERM_LEXICON_GET_CONVERT_TO_EL_METHOD = makeSymbol( "TERM-LEXICON-GET-CONVERT-TO-EL-METHOD" );
    $sym61$REMOVE_ALL_CONCEPT_FILTER_SPECS = makeSymbol( "REMOVE-ALL-CONCEPT-FILTER-SPECS" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONCEPT-FILTER-SPECS" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym64$TERM_LEXICON_REMOVE_ALL_CONCEPT_FILTER_SPECS_METHOD = makeSymbol( "TERM-LEXICON-REMOVE-ALL-CONCEPT-FILTER-SPECS-METHOD" );
    $sym65$ADD_CONCEPT_FILTER_SPEC = makeSymbol( "ADD-CONCEPT-FILTER-SPEC" );
    $list66 = ConsesLow.list( makeSymbol( "SPEC" ) );
    $list67 = ConsesLow.list( makeString( "Set lexicon's concept filter spec to SPEC" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "SPEC" ), makeSymbol( "CONCEPT-FILTER-SPECIFICATION-P" ) ), ConsesLow.list(
        makeSymbol( "CPUSHNEW" ), makeSymbol( "SPEC" ), makeSymbol( "CONCEPT-FILTER-SPECS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym69$CONCEPT_FILTER_SPECIFICATION_P = makeSymbol( "CONCEPT-FILTER-SPECIFICATION-P" );
    $sym70$TERM_LEXICON_ADD_CONCEPT_FILTER_SPEC_METHOD = makeSymbol( "TERM-LEXICON-ADD-CONCEPT-FILTER-SPEC-METHOD" );
    $sym71$GET_CONCEPT_FILTER_SPECS = makeSymbol( "GET-CONCEPT-FILTER-SPECS" );
    $list72 = ConsesLow.list( makeString( "Return lexicon's concept filter specs" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONCEPT-FILTER-SPECS" ) ) );
    $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym74$TERM_LEXICON_GET_CONCEPT_FILTER_SPECS_METHOD = makeSymbol( "TERM-LEXICON-GET-CONCEPT-FILTER-SPECS-METHOD" );
    $sym75$CREATE_LEX_ENTRIES = makeSymbol( "CREATE-LEX-ENTRIES" );
    $list76 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) );
    $list77 = ConsesLow.list( makeString(
        "@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY" ),
        ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "LEX-ENTRY-P" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "NL-TRIE-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "DENOT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "NL-TRIE-WORD-P" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ),
                    makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NL-TRIE-WORD2LEX-ENTRIES" ) ), makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( ConsesLow.list(
                        makeSymbol( "NL-TRIE-TERM-PHRASES-ENTRY-P" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "NL-TRIE-TP2LEX-ENTRIES" ) ), makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "RET" ), ConsesLow
                                .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NL-TRIE-NAME2LEX-ENTRIES" ) ), makeSymbol( "STRING" ), makeSymbol(
                                    "NL-TRIE-ENTRY" ) ) ) ) ) );
    $sym78$GET = makeSymbol( "GET" );
    $kw79$DENOT = makeKeyword( "DENOT" );
    $sym80$NL_TRIE_WORD2LEX_ENTRIES = makeSymbol( "NL-TRIE-WORD2LEX-ENTRIES" );
    $sym81$NL_TRIE_TP2LEX_ENTRIES = makeSymbol( "NL-TRIE-TP2LEX-ENTRIES" );
    $sym82$NL_TRIE_NAME2LEX_ENTRIES = makeSymbol( "NL-TRIE-NAME2LEX-ENTRIES" );
    $sym83$TERM_LEXICON_CREATE_LEX_ENTRIES_METHOD = makeSymbol( "TERM-LEXICON-CREATE-LEX-ENTRIES-METHOD" );
    $sym84$RESPORATOR_TO_LEX_ENTRY = makeSymbol( "RESPORATOR-TO-LEX-ENTRY" );
    $list85 = ConsesLow.list( makeSymbol( "TYPE.STRING" ) );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), ConsesLow.list(
            makeSymbol( "CDR" ), makeSymbol( "TYPE.STRING" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ),
                constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                    makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                        makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denotation" ) ) ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ), ConsesLow.list( makeSymbol( "FCM" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RESPORATOR-TO-CYCL" ) ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TYPE.STRING" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "LEX-ENTRY" ) ) ) );
    $sym87$LEX_ENTRY = makeSymbol( "LEX-ENTRY" );
    $sym88$SET = makeSymbol( "SET" );
    $kw89$STRING = makeKeyword( "STRING" );
    $kw90$CYC_POS = makeKeyword( "CYC-POS" );
    $const91$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $kw92$INFLECTIONS = makeKeyword( "INFLECTIONS" );
    $list93 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) );
    $kw94$PREDICATE = makeKeyword( "PREDICATE" );
    $const95$denotation = constant_handles.reader_make_constant_shell( makeString( "denotation" ) );
    $sym96$RESPORATOR_TO_CYCL = makeSymbol( "RESPORATOR-TO-CYCL" );
    $sym97$TERM_LEXICON_RESPORATOR_TO_LEX_ENTRY_METHOD = makeSymbol( "TERM-LEXICON-RESPORATOR-TO-LEX-ENTRY-METHOD" );
    $sym98$COPY = makeSymbol( "COPY" );
    $list99 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "TARGET" ) );
    $list100 = ConsesLow.list( makeString( "@return TERM-LEXICON-P; a copy of this lexicon.\n@note -- list values are copied with copy-list.\n@note -- cache and trie are set to their defaults." ), ConsesLow.list(
        makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "TARGET" ), makeSymbol( "TERM-LEXICON-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "COPY" ), makeSymbol(
            "SUPER" ), makeSymbol( "TARGET" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "DEFAULT-KB-SPEC" ),
                makeSymbol( "CONVERT-TO-EL?" ), makeSymbol( "CONCEPT-FILTER-SPECS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE" ), ConsesLow.list( makeSymbol(
                    "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOT" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "VALUE" ) ), ConsesLow.list(
                        makeSymbol( "SET-SLOT" ), makeSymbol( "TARGET" ), makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), makeSymbol( "VALUE" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol(
                            "SET-SLOT" ), makeSymbol( "TARGET" ), makeSymbol( "SLOT" ), makeSymbol( "VALUE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TARGET" ) ) );
    $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym102$TERM_LEXICON_P = makeSymbol( "TERM-LEXICON-P" );
    $list103 = ConsesLow.list( makeSymbol( "DEFAULT-KB-SPEC" ), makeSymbol( "CONVERT-TO-EL?" ), makeSymbol( "CONCEPT-FILTER-SPECS" ) );
    $sym104$TERM_LEXICON_COPY_METHOD = makeSymbol( "TERM-LEXICON-COPY-METHOD" );
    $sym105$ISOLATE = makeSymbol( "ISOLATE" );
    $list106 = ConsesLow.list( makeString( "Finalizes this lexicon" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEXICON" ), makeSymbol( "DEPENDENT-LEXICONS" ) ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ISOLATE" ) ) ) ), ConsesLow.list( makeSymbol( "ISOLATE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "SELF" ) ) );
    $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym108$TERM_LEXICON_ISOLATE_METHOD = makeSymbol( "TERM-LEXICON-ISOLATE-METHOD" );
    $sym109$DELETE_STRING_WITH_TERM = makeSymbol( "DELETE-STRING-WITH-TERM" );
    $list110 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "CYCL" ) );
    $list111 = ConsesLow.list( makeString( "Deletes the entry associating STRING with CYCL from this lexicon" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow
        .list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "CYCL" ), makeSymbol( "CYCL-DENOTATIONAL-TERM-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TRIE-KEY" ), ConsesLow.list(
            makeSymbol( "NL-TRIE-STRING-TOKENIZE" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "TRIE-ENTRIES" ), ConsesLow.list( makeSymbol( "NL-TRIE-LOOKUP" ), makeSymbol( "TRIE" ), makeSymbol(
                "TRIE-KEY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CASE-SENSITIVITY" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                    ConsesLow.list( makeSymbol( "TRIE-ENTRY" ), makeSymbol( "TRIE-ENTRIES" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "LEX-ENTRY-P" ),
                        makeSymbol( "TRIE-ENTRY" ) ), ConsesLow.list( EQUAL, makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TRIE-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "GET" ) ), makeKeyword( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DELETE-ENTRY-FROM-STRING" ) ),
                                makeSymbol( "TRIE-ENTRY" ), makeSymbol( "STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym113$STRINGP = makeSymbol( "STRINGP" );
    $sym114$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $sym115$GET_CASE_SENSITIVITY = makeSymbol( "GET-CASE-SENSITIVITY" );
    $sym116$DELETE_ENTRY_FROM_STRING = makeSymbol( "DELETE-ENTRY-FROM-STRING" );
    $sym117$TERM_LEXICON_DELETE_STRING_WITH_TERM_METHOD = makeSymbol( "TERM-LEXICON-DELETE-STRING-WITH-TERM-METHOD" );
    $str118$_0_9__1_2______0_9__1_2______0_9_ = makeString( "[0-9]{1,2}[/-][0-9]{1,2}[/-][0-9]{2,4}" );
    $str119$_0_9__4_4_______0_9__1_2_______0_ = makeString( "[0-9]{4,4}[./-][0-9]{1,2}[./-][0-9]{1,2}" );
    $str120$_0_9__1_2______0_9__2_4_ = makeString( "[0-9]{1,2}[/-][0-9]{2,4}" );
    $str121$_0_9__4_ = makeString( "[0-9]{4}" );
    $sym122$SIMPLE_DATE_LEARN = makeSymbol( "SIMPLE-DATE-LEARN" );
    $list123 = ConsesLow.list( makeSymbol( "TEXT" ) );
    $list124 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "NEW-LEXES" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "PATTERN" ), ConsesLow.list(
        makeSymbol( "GET-NUMERIC-DATE-PATTERNS" ) ), makeSymbol( "NEW-LEXES" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "POSSIBLE-DATE-STRING" ), ConsesLow.list( makeSymbol(
            "FIND-ALL-MATCHES-FOR-PATTERN" ), makeSymbol( "PATTERN" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DATE-CYCL" ), ConsesLow.list( makeSymbol(
                "PARSE-DATE-FROM-STRING-FAST" ), makeSymbol( "POSSIBLE-DATE-STRING" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EXISTING-ENTRIES" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeSymbol( "POSSIBLE-DATE-STRING" ) ) ), ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow
                        .list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "POSSIBLE-DATE-STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                    makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ), makeSymbol( "DATE-CYCL" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                        makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString(
                                            "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword(
                                                "INFLECTIONS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ), ConsesLow.list(
                                                    makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "EXISTING-ENTRIES" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                        makeSymbol( "LEX-ENTRY-EQUAL-P" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ),
                                                            makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "NEW-LEXES" ) ) ) ) ) ) ), ConsesLow.list(
                                                                makeSymbol( "RET" ), makeSymbol( "NEW-LEXES" ) ) ) );
    $kw125$FRAME = makeKeyword( "FRAME" );
    $const126$RegularNounFrame = constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) );
    $sym127$LEX_ENTRY_EQUAL_P = makeSymbol( "LEX-ENTRY-EQUAL-P" );
    $sym128$ADD = makeSymbol( "ADD" );
    $sym129$TERM_LEXICON_SIMPLE_DATE_LEARN_METHOD = makeSymbol( "TERM-LEXICON-SIMPLE-DATE-LEARN-METHOD" );
    $sym130$DATE_LEARN = makeSymbol( "DATE-LEARN" );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "NEW-LEXES" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DATE-CYCL" ), ConsesLow.list(
        makeSymbol( "PARSE-DATE-FROM-STRING-FAST" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EXISTING-ENTRIES" ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                    makeKeyword( "STRING" ), makeSymbol( "TEXT" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ),
                        constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "SET" ) ), makeKeyword( "DENOT" ), makeSymbol( "DATE-CYCL" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                                makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                        makeString( "singular" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "EXISTING-ENTRIES" ),
                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY-EQUAL-P" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "NEW-LEXES" ) ) ) ) ), ConsesLow.list(
                                                    makeSymbol( "RET" ), makeSymbol( "NEW-LEXES" ) ) ) );
    $sym132$TERM_LEXICON_DATE_LEARN_METHOD = makeSymbol( "TERM-LEXICON-DATE-LEARN-METHOD" );
    $sym133$STANFORD_NER_DATE_LEARN = makeSymbol( "STANFORD-NER-DATE-LEARN" );
    $list134 = ConsesLow.list( makeString(
        "@param TEXT stringp; the text from which to learn lexical entries for dates\n   @return listp; a list of term-lexicon lexical entries learned from TEXT.\n   This is intended to work over large strings, finding the dates embedded within them, using the \n   Stanford Named Entity Recognizer as a test to see what might be a date." ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STANFORD-NER-LEARN" ) ), makeSymbol( "TEXT" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Date" ) ) ) ), NIL ) ) );
    $sym135$STANFORD_NER_LEARN = makeSymbol( "STANFORD-NER-LEARN" );
    $list136 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Date" ) ) );
    $sym137$TERM_LEXICON_STANFORD_NER_DATE_LEARN_METHOD = makeSymbol( "TERM-LEXICON-STANFORD-NER-DATE-LEARN-METHOD" );
    $list138 = ConsesLow.list( makeSymbol( "TEXT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "ALLOWED-TYPES" ), makeKeyword( "ANY" ) ), ConsesLow.list( makeSymbol( "FABRICATE-MEANING?" ), T ) );
    $list139 = _constant_139_initializer();
    $kw140$ANY = makeKeyword( "ANY" );
    $sym141$STANFORD_NER = makeSymbol( "STANFORD-NER" );
    $sym142$KNOWN_CYC_TYPES = makeSymbol( "KNOWN-CYC-TYPES" );
    $sym143$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym144$MERGE_CLUSTERS = makeSymbol( "MERGE-CLUSTERS" );
    $sym145$GET_STRING = makeSymbol( "GET-STRING" );
    $sym146$GET_CYC = makeSymbol( "GET-CYC" );
    $const147$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) );
    $str148$___S = makeString( "~%~S" );
    $sym149$TERM_LEXICON_STANFORD_NER_LEARN_METHOD = makeSymbol( "TERM-LEXICON-STANFORD-NER-LEARN-METHOD" );
    $sym150$NER_CLUSTERS = makeSymbol( "NER-CLUSTERS" );
    $sym151$RUN = makeSymbol( "RUN" );
    $sym152$_NER_CLUSTERS_CACHING_STATE_ = makeSymbol( "*NER-CLUSTERS-CACHING-STATE*" );
    $int153$4096 = makeInteger( 4096 );
    $list154 = ConsesLow.list( makeSymbol( "STANFORD-NER-LEARN" ), makeSymbol( "NOUN-COMPOUND-LEARN" ), makeSymbol( "NUMBER-LEARN" ), makeSymbol( "SCALAR-INTERVAL-LEARN" ), makeSymbol( "SIMPLE-DATE-LEARN" ) );
    $sym155$SCALAR_INTERVAL_LEARN = makeSymbol( "SCALAR-INTERVAL-LEARN" );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCALAR-ENTRIES" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
        "SCALAR-STRING-CYCL" ), ConsesLow.list( makeSymbol( "SCALAR-INTERVAL-MEANINGS" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "SCALAR-STRING" ),
            makeSymbol( "SCALAR-CYCL" ) ), makeSymbol( "SCALAR-STRING-CYCL" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "KNOWN-ENTRIES" ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeSymbol( "SCALAR-STRING" ) ) ), ConsesLow.list( makeSymbol( "ALREADY-KNOWN" ), ConsesLow.list( makeSymbol(
                    "MEMBER?" ), makeSymbol( "SCALAR-CYCL" ), makeSymbol( "KNOWN-ENTRIES" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY-DENOT" ) ) ) ) ),
                ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "ALREADY-KNOWN" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol(
                    "NUMBER-TERM-LEX-ENTRY" ), makeSymbol( "SCALAR-STRING" ), makeSymbol( "SCALAR-CYCL" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "SCALAR-ENTRIES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                            "RET" ), makeSymbol( "SCALAR-ENTRIES" ) ) ) );
    $list157 = ConsesLow.list( makeSymbol( "SCALAR-STRING" ), makeSymbol( "SCALAR-CYCL" ) );
    $sym158$LEX_ENTRY_DENOT = makeSymbol( "LEX-ENTRY-DENOT" );
    $sym159$TERM_LEXICON_SCALAR_INTERVAL_LEARN_METHOD = makeSymbol( "TERM-LEXICON-SCALAR-INTERVAL-LEARN-METHOD" );
    $sym160$NUMBER_LEARN = makeSymbol( "NUMBER-LEARN" );
    $list161 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NUMBERS" ), ConsesLow.list( makeSymbol( "NUMBER-MEANINGS" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list(
        makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "NUMBER" ), makeSymbol( "NUMBERS" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list(
            makeSymbol( "NUMBER-STRING" ), makeSymbol( "MEANING" ) ), makeSymbol( "NUMBER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "KNOWN-ENTRIES" ), ConsesLow.list(
                makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeSymbol( "NUMBER-STRING" ) ) ), ConsesLow.list( makeSymbol( "ALREADY-KNOWN" ), ConsesLow.list(
                    makeSymbol( "MEMBER?" ), makeSymbol( "MEANING" ), makeSymbol( "KNOWN-ENTRIES" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEX-ENTRY-DENOT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "ALREADY-KNOWN" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                            "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NUMBER-TERM-LEX-ENTRY" ), makeSymbol( "NUMBER-STRING" ), makeSymbol( "MEANING" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol(
                                    "RESULT" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $list162 = ConsesLow.list( makeSymbol( "NUMBER-STRING" ), makeSymbol( "MEANING" ) );
    $sym163$TERM_LEXICON_NUMBER_LEARN_METHOD = makeSymbol( "TERM-LEXICON-NUMBER-LEARN-METHOD" );
    $kw164$PENN_TAGS = makeKeyword( "PENN-TAGS" );
    $list165 = ConsesLow.list( makeKeyword( "CD" ) );
    $const166$Number_SP = constant_handles.reader_make_constant_shell( makeString( "Number-SP" ) );
    $sym167$SIMPLE_DATE_FROM_STRING_LEARN = makeSymbol( "SIMPLE-DATE-FROM-STRING-LEARN" );
    $list168 = ConsesLow.list( makeString( "learn a date using the entire string in TEXT" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DATES" ), ConsesLow.list( makeSymbol(
        "PARSE-DATE-FROM-STRING-FAST" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DATE" ), makeSymbol( "DATES" ) ),
            ConsesLow.list( new SubLObject[]
            { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ),
              ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "TEXT" ) ), ConsesLow.list( makeSymbol(
                  "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ),
              ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeSymbol(
                  "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString(
                      "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list(
                          makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                              makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "RESULT" ) )
            } ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym169$TERM_LEXICON_SIMPLE_DATE_FROM_STRING_LEARN_METHOD = makeSymbol( "TERM-LEXICON-SIMPLE-DATE-FROM-STRING-LEARN-METHOD" );
    $list170 = ConsesLow.list( makeKeyword( "NNP" ) );
    $const171$YearFn = constant_handles.reader_make_constant_shell( makeString( "YearFn" ) );
    $sym172$NOUN_COMPOUND_LEARN = makeSymbol( "NOUN-COMPOUND-LEARN" );
    $list173 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ENTRIES" ), ConsesLow.list( makeSymbol( "TEXT-NOUN-COMPOUND-TERM-LEX-ENTRIES" ), makeSymbol(
        "TEXT" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol( "ENTRIES" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "ENTRY" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ENTRIES" ) ) ) );
    $sym174$TERM_LEXICON_NOUN_COMPOUND_LEARN_METHOD = makeSymbol( "TERM-LEXICON-NOUN-COMPOUND-LEARN-METHOD" );
    $list175 = ConsesLow.cons( makeSymbol( "STRING" ), makeSymbol( "MEANINGS" ) );
    $list176 = ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "AGR-PRED" ) );
    $const177$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $list178 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) ) );
    $list179 = ConsesLow.list( makeKeyword( "NNS" ) );
    $list180 = ConsesLow.list( makeKeyword( "NN" ) );
    $const181$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const182$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $list183 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-WORD" ) );
    $list184 = ConsesLow.list( makeString(
        "@param STRING stringp; a lexical string\n   @param NL-TRIE-WORD nl-trie-word-p; an nl-trie-word associated with STRING\n   @return lex-entry-p; a lexical entry with properties STRING and NL-TRIE-WORD" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRIES" ), NIL ), ConsesLow.list( makeSymbol( "WORD-UNIT" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-WORD-UNIT" ),
            makeSymbol( "NL-TRIE-WORD" ) ) ), ConsesLow.list( makeSymbol( "POS-PREDS" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-POS-PREDS" ), makeSymbol( "NL-TRIE-WORD" ) ) ), ConsesLow.list( makeSymbol( "LEX-PRED" ),
                ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-SEMANTIC-PRED" ), makeSymbol( "NL-TRIE-WORD" ) ) ), ConsesLow.list( makeSymbol( "PRAGMATICS" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-PRAGMATICS" ),
                    makeSymbol( "NL-TRIE-WORD" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-DENOTS" ), makeSymbol(
                        "NL-TRIE-WORD" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIMPLIES" ), makeSymbol( "CONCEPT-FILTER-SPECS" ), ConsesLow.list( makeSymbol(
                            "DENOT-PASSES-FILTER-SPECS?" ), makeSymbol( "DENOT" ), makeSymbol( "CONCEPT-FILTER-SPECS" ) ) ), ConsesLow.list( new SubLObject[]
                            { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PRAGMATICS" ),
                                    makeSymbol( "PRAGMATICS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ),
                                        ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "CONVERT-TO-EL?" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ), makeSymbol( "DENOT" ) ), makeSymbol( "DENOT" ) ) ), ConsesLow.list(
                                            makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PREDICATE" ), makeSymbol( "LEX-PRED" ) ), ConsesLow
                                                .list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), makeSymbol(
                                                    "POS-PREDS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword(
                                                        "WORD-UNIT" ), makeSymbol( "WORD-UNIT" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                            "SET" ) ), makeKeyword( "TRIE-ENTRY" ), makeSymbol( "NL-TRIE-WORD" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                                                makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                                                                    "LEX-ENTRY" ), makeSymbol( "LEX-ENTRIES" ) )
        } ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRIES" ) ) ) );
    $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $kw186$PRAGMATICS = makeKeyword( "PRAGMATICS" );
    $kw187$WORD_UNIT = makeKeyword( "WORD-UNIT" );
    $kw188$TRIE_ENTRY = makeKeyword( "TRIE-ENTRY" );
    $sym189$TERM_LEXICON_NL_TRIE_WORD2LEX_ENTRIES_METHOD = makeSymbol( "TERM-LEXICON-NL-TRIE-WORD2LEX-ENTRIES-METHOD" );
    $list190 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-NAME" ) );
    $list191 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRIES" ), NIL ), ConsesLow.list( makeSymbol( "POS" ), constant_handles.reader_make_constant_shell(
        makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "PREDICATE" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-SEMANTIC-PRED" ), makeSymbol( "NL-TRIE-NAME" ) ) ), ConsesLow.list( makeSymbol(
            "PRAGMATICS" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-PRAGMATICS" ), makeSymbol( "NL-TRIE-NAME" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list(
                makeSymbol( "NL-TRIE-ENTRY-DENOTS" ), makeSymbol( "NL-TRIE-NAME" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIMPLIES" ), makeSymbol( "CONCEPT-FILTER-SPECS" ), ConsesLow
                    .list( makeSymbol( "DENOT-PASSES-FILTER-SPECS?" ), makeSymbol( "DENOT" ), makeSymbol( "CONCEPT-FILTER-SPECS" ) ) ), ConsesLow.list( new SubLObject[]
                    { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PRAGMATICS" ), makeSymbol(
                            "PRAGMATICS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ), ConsesLow.list(
                                makeSymbol( "FIF" ), makeSymbol( "CONVERT-TO-EL?" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ), makeSymbol( "DENOT" ) ), makeSymbol( "DENOT" ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                    makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PREDICATE" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                        makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), makeSymbol( "POS" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                            makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                                makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
                                                    .list( constant_handles.reader_make_constant_shell( makeString( "pnNonPlural-Generic" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ),
                                                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "TRIE-ENTRY" ), makeSymbol( "NL-TRIE-NAME" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                            makeSymbol( "LEX-ENTRY" ), makeSymbol( "LEX-ENTRIES" ) )
    } ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRIES" ) ) ) );
    $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $list193 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pnNonPlural-Generic" ) ) );
    $sym194$TERM_LEXICON_NL_TRIE_NAME2LEX_ENTRIES_METHOD = makeSymbol( "TERM-LEXICON-NL-TRIE-NAME2LEX-ENTRIES-METHOD" );
    $list195 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "TP-ENTRY" ) );
    $list196 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRIES" ), NIL ), ConsesLow.list( makeSymbol( "POS" ), ConsesLow.list( makeSymbol(
        "NL-TRIE-ENTRY-POS" ), makeSymbol( "TP-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-POS-PREDS" ), makeSymbol( "TP-ENTRY" ) ) ), ConsesLow.list( makeSymbol(
            "PREDICATE" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-SEMANTIC-PRED" ), makeSymbol( "TP-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "PRAGMATICS" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-PRAGMATICS" ),
                makeSymbol( "TP-ENTRY" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-DENOTS" ), makeSymbol( "TP-ENTRY" ) ) ),
                    ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIMPLIES" ), makeSymbol( "CONCEPT-FILTER-SPECS" ), ConsesLow.list( makeSymbol( "DENOT-PASSES-FILTER-SPECS?" ), makeSymbol(
                        "DENOT" ), makeSymbol( "CONCEPT-FILTER-SPECS" ) ) ), ConsesLow.list( new SubLObject[]
                        { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PRAGMATICS" ), makeSymbol(
                                "PRAGMATICS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "DENOT" ), ConsesLow.list(
                                    makeSymbol( "FIF" ), makeSymbol( "CONVERT-TO-EL?" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ), makeSymbol( "DENOT" ) ), makeSymbol( "DENOT" ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                        makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PREDICATE" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeSymbol(
                                            "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), makeSymbol( "POS" ) ), ConsesLow.list( makeSymbol(
                                                "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list(
                                                    makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), makeSymbol(
                                                        "INFLECTIONS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword(
                                                            "TRIE-ENTRY" ), makeSymbol( "TP-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "LEX-ENTRIES" ) )
                    } ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRIES" ) ) ) );
    $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TERM-LEXICON-METHOD" );
    $sym198$TERM_LEXICON_NL_TRIE_TP2LEX_ENTRIES_METHOD = makeSymbol( "TERM-LEXICON-NL-TRIE-TP2LEX-ENTRIES-METHOD" );
    $sym199$DENOTS_FOR_TERM_LEXICON_ENTRIES = makeSymbol( "DENOTS-FOR-TERM-LEXICON-ENTRIES" );
    $sym200$ADD_LEARNER = makeSymbol( "ADD-LEARNER" );
    $sym201$LEARN = makeSymbol( "LEARN" );
    $sym202$TEST_SIMPLE_DATE_LEARN = makeSymbol( "TEST-SIMPLE-DATE-LEARN" );
    $kw203$TEST = makeKeyword( "TEST" );
    $sym204$HAS_MEMBER_EQUAL_ = makeSymbol( "HAS-MEMBER-EQUAL?" );
    $kw205$OWNER = makeKeyword( "OWNER" );
    $kw206$CLASSES = makeKeyword( "CLASSES" );
    $kw207$KB = makeKeyword( "KB" );
    $kw208$FULL = makeKeyword( "FULL" );
    $kw209$WORKING_ = makeKeyword( "WORKING?" );
    $list210 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "12/31/2006" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "YearFn" ) ), makeInteger( 2006 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "31/12/2006" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2006 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "2/12/2006" ) ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "DayFn" ) ), TWO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                            .reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2006 ) ) ) ) ), ConsesLow.list(
                                ConsesLow.list( makeString( "2/12/2006" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2006 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "12-31-2006" ) ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                    2006 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "2006.12.31" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                                                        makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                            "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2006 ) ) ) ) ), ConsesLow.list( ConsesLow
                                                                .list( makeString( "12/2006" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                    .reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                        makeInteger( 2006 ) ) ) ) );
  }
}
/*
 * 
 * Total time: 747 ms synthetic
 */