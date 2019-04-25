package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class semtrans_lexicon
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.semtrans_lexicon";
  public static final String myFingerPrint = "aeced5f5007023c463cc25fe7ceaffef698bf74eea4f337b84f8830544c4e096";
  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1420L)
  public static SubLSymbol $manufacture_semtrans_assertionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1542L)
  private static SubLSymbol $semtrans_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 9916L)
  private static SubLSymbol $default_verbal_lex_entry_literals$;
  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 20118L)
  public static SubLSymbol $semtrans_lexicon_learners$;
  private static final SubLSymbol $sym0$SEMTRANS_LEXICON;
  private static final SubLSymbol $sym1$ABSTRACT_LEXICON;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$MY_TERM_LEXICON;
  private static final SubLSymbol $sym4$OBJECT;
  private static final SubLSymbol $sym5$INSTANCE_COUNT;
  private static final SubLSymbol $sym6$DEFAULT_EXCLUDE_MTS;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$DEFAULT_EXCLUDE_PREDICATES;
  private static final SubLSymbol $sym9$DEFAULT_BASE_MT;
  private static final SubLObject $const10$AllGeneralEnglishValidatedLexical;
  private static final SubLSymbol $sym11$DEFAULT_KB_SPEC;
  private static final SubLObject $const12$AbstractLexiconSpecification;
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS;
  private static final SubLSymbol $sym14$ISOLATED_P;
  private static final SubLSymbol $sym15$INSTANCE_NUMBER;
  private static final SubLSymbol $sym16$ALLOWED_MTS;
  private static final SubLSymbol $kw17$UNINITIALIZED;
  private static final SubLSymbol $sym18$EXCLUDED_MTS;
  private static final SubLSymbol $sym19$BASE_MT;
  private static final SubLSymbol $sym20$ROOT_MT;
  private static final SubLSymbol $sym21$EXCLUDED_PREDS;
  private static final SubLSymbol $sym22$EXCLUDED_POS_LIST;
  private static final SubLSymbol $sym23$TRIE;
  private static final SubLSymbol $sym24$CACHE;
  private static final SubLSymbol $sym25$IGNORE_CACHE_;
  private static final SubLSymbol $sym26$CASE_SENSITIVITY;
  private static final SubLSymbol $sym27$ALLOW_FABRICATION_;
  private static final SubLSymbol $sym28$LEARNED;
  private static final SubLSymbol $sym29$ACTIVE_LEARNERS;
  private static final SubLSymbol $sym30$ALLOW_STEMMING;
  private static final SubLSymbol $sym31$STOP_WORDS;
  private static final SubLSymbol $sym32$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE;
  private static final SubLSymbol $sym33$INITIALIZE;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$EXCLUDE_PREDICATE;
  private static final SubLObject $const37$preferredNameString;
  private static final SubLObject $const38$denotationPlaceholder;
  private static final SubLObject $const39$denotationRelatedTo;
  private static final SubLSymbol $sym40$SEMTRANS_LEXICON_INITIALIZE_METHOD;
  private static final SubLSymbol $sym41$GET_TERM_LEXICON;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD;
  private static final SubLSymbol $sym44$SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym45$SEMTRANS_LEXICON_P;
  private static final SubLSymbol $sym46$COPY;
  private static final SubLSymbol $sym47$SET_TERM_LEXICON;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD;
  private static final SubLSymbol $sym51$SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD;
  private static final SubLSymbol $sym52$FABRICATE;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD;
  private static final SubLSymbol $sym57$STRINGP;
  private static final SubLSymbol $sym58$LISTP;
  private static final SubLSymbol $sym59$KEYWORDP;
  private static final SubLSymbol $sym60$FABRICATE_NOMINAL;
  private static final SubLSymbol $sym61$FABRICATE_VERBAL;
  private static final SubLSymbol $sym62$FABRICATE_ADJECTIVAL;
  private static final SubLSymbol $sym63$FABRICATE_ADVERBIAL;
  private static final SubLSymbol $sym64$SEMTRANS_LEXICON_FABRICATE_METHOD;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$LEX_ENTRY;
  private static final SubLSymbol $sym67$SET;
  private static final SubLSymbol $kw68$STRING;
  private static final SubLSymbol $kw69$PENN_TAGS;
  private static final SubLSymbol $kw70$SEMTRANS;
  private static final SubLSymbol $sym71$FABRICATE_NOMINAL_SEMTRANS;
  private static final SubLSymbol $sym72$SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLSymbol $kw75$NOUN;
  private static final SubLObject $const76$isa;
  private static final SubLObject $const77$ThingDescribableAsFn;
  private static final SubLObject $const78$WordFn;
  private static final SubLList $list79;
  private static final SubLSymbol $kw80$POSSESSOR;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$FABRICATE_VERBAL_SEMTRANS;
  private static final SubLSymbol $sym85$SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD;
  private static final SubLSymbol $kw88$ACTION;
  private static final SubLSymbol $sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD;
  private static final SubLList $list92;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD;
  private static final SubLList $list95;
  private static final SubLObject $const96$equals;
  private static final SubLSymbol $kw97$SUBJECT;
  private static final SubLSymbol $kw98$OBJECT;
  private static final SubLSymbol $kw99$OBLIQUE_OBJECT;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD;
  private static final SubLSymbol $sym107$CREATE_LEX_ENTRIES;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD;
  private static final SubLSymbol $sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME;
  private static final SubLSymbol $sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY;
  private static final SubLSymbol $sym113$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD;
  private static final SubLSymbol $sym114$TEXTRACT_LEMMA_TO_LEX_ENTRY;
  private static final SubLList $list115;
  private static final SubLList $list116;
  private static final SubLSymbol $kw117$PERSON;
  private static final SubLObject $const118$and;
  private static final SubLList $list119;
  private static final SubLObject $const120$nameString;
  private static final SubLSymbol $kw121$PERSON_;
  private static final SubLSymbol $kw122$PLACE;
  private static final SubLList $list123;
  private static final SubLSymbol $kw124$PLACE_;
  private static final SubLSymbol $kw125$ORG;
  private static final SubLList $list126;
  private static final SubLSymbol $kw127$UNAME;
  private static final SubLSymbol $kw128$CYC_POS;
  private static final SubLObject $const129$ProperNoun;
  private static final SubLSymbol $kw130$FRAME;
  private static final SubLObject $const131$RegularNounFrame;
  private static final SubLSymbol $sym132$SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD;
  private static final SubLSymbol $sym133$RESPORATOR_TO_LEX_ENTRIES;
  private static final SubLList $list134;
  private static final SubLList $list135;
  private static final SubLSymbol $kw136$INFLECTIONS;
  private static final SubLSymbol $sym137$RESPORATOR_TO_INFLECTIONS;
  private static final SubLSymbol $sym138$RESPORATOR_TO_CYCL;
  private static final SubLSymbol $sym139$SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD;
  private static final SubLSymbol $sym140$RESPORATOR_LEARN;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym144$SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD;
  private static final SubLSymbol $sym145$RESPORATOR___LEARN;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD;
  private static final SubLSymbol $sym148$STANFORD_NER_LEARN;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$STANFORD_NER_LEARN_INT;
  private static final SubLSymbol $sym151$SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD;
  private static final SubLSymbol $sym152$STANFORD_NER_LEARN_TIGHTENED_TYPES;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD;
  private static final SubLList $list155;
  private static final SubLObject $list156;
  private static final SubLSymbol $sym157$STANFORD_NER;
  private static final SubLSymbol $sym158$RUN;
  private static final SubLSymbol $sym159$SET_LEXICON;
  private static final SubLSymbol $sym160$O;
  private static final SubLSymbol $sym161$GET_TYPE;
  private static final SubLSymbol $sym162$GET_CYC;
  private static final SubLSymbol $sym163$TIGHTEN_TYPE;
  private static final SubLSymbol $sym164$GET_STRING;
  private static final SubLSymbol $sym165$GET;
  private static final SubLList $list166;
  private static final SubLSymbol $sym167$ADD;
  private static final SubLString $str168$___S;
  private static final SubLSymbol $sym169$SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD;
  private static final SubLSymbol $sym170$NUMBER_LEARN;
  private static final SubLList $list171;
  private static final SubLList $list172;
  private static final SubLSymbol $sym173$LEX_ENTRY_SEMTRANS;
  private static final SubLSymbol $sym174$SEMTRANS_LEXICON_NUMBER_LEARN_METHOD;
  private static final SubLList $list175;
  private static final SubLObject $const176$Number_SP;
  private static final SubLList $list177;
  private static final SubLList $list178;
  private static final SubLList $list179;
  private static final SubLSymbol $kw180$WORD_UNIT;
  private static final SubLSymbol $kw181$TRIE_ENTRY;
  private static final SubLList $list182;
  private static final SubLObject $const183$Noun;
  private static final SubLSymbol $sym184$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const185$EverythingPSC;
  private static final SubLObject $const186$Collection;
  private static final SubLSymbol $sym187$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD;
  private static final SubLList $list188;
  private static final SubLSymbol $sym189$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD;
  private static final SubLList $list190;
  private static final SubLList $list191;
  private static final SubLSymbol $kw192$PRAGMATICS;
  private static final SubLSymbol $kw193$PREDICATE;
  private static final SubLSymbol $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME;
  private static final SubLSymbol $sym195$CREATE_LEX_ENTRIES_NUMBER;
  private static final SubLList $list196;
  private static final SubLList $list197;
  private static final SubLSymbol $sym198$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD;
  private static final SubLSymbol $sym199$NOUN_COMPOUND_LEARN;
  private static final SubLList $list200;
  private static final SubLSymbol $sym201$SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD;
  private static final SubLObject $const202$genlPreds;
  private static final SubLList $list203;
  private static final SubLList $list204;
  private static final SubLList $list205;
  private static final SubLSymbol $sym206$COOCCURRENCE_STATISTICS_LEARN;
  private static final SubLList $list207;
  private static final SubLSymbol $sym208$PARSE;
  private static final SubLSymbol $sym209$YIELD;
  private static final SubLList $list210;
  private static final SubLSymbol $sym211$GET_CATEGORY;
  private static final SubLSymbol $kw212$ISA;
  private static final SubLSymbol $kw213$GENLS;
  private static final SubLObject $const214$SubCollectionNamedFn;
  private static final SubLSymbol $sym215$SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD;
  private static final SubLSymbol $sym216$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $sym217$LEX_ENTRY_P;
  private static final SubLObject $const218$InstanceFn;
  private static final SubLSymbol $sym219$INSTANCEFN_CLAUSE;
  private static final SubLList $list220;
  private static final SubLSymbol $kw221$IGNORE;
  private static final SubLSymbol $sym222$DELETE;
  private static final SubLObject $const223$InstanceNamedFn_Ternary;
  private static final SubLObject $const224$CollectionIntersection2Fn;
  private static final SubLObject $const225$BaseKB;
  private static final SubLSymbol $sym226$FORT_P;
  private static final SubLObject $const227$termOfUnit;

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1622L)
  public static SubLObject new_semtrans_lexicon()
  {
    return object.new_class_instance( $sym0$SEMTRANS_LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1710L)
  public static SubLObject get_semtrans_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == semtrans_lexicon_p( $semtrans_lexicon$.getDynamicValue( thread ) ) )
    {
      $semtrans_lexicon$.setDynamicValue( new_semtrans_lexicon(), thread );
    }
    return $semtrans_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
  public static SubLObject get_semtrans_lexicon_my_term_lexicon(final SubLObject v_semtrans_lexicon)
  {
    return classes.subloop_get_access_protected_instance_slot( v_semtrans_lexicon, SIXTEEN_INTEGER, $sym3$MY_TERM_LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
  public static SubLObject set_semtrans_lexicon_my_term_lexicon(final SubLObject v_semtrans_lexicon, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_semtrans_lexicon, value, SIXTEEN_INTEGER, $sym3$MY_TERM_LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
  public static SubLObject subloop_reserved_initialize_semtrans_lexicon_class(final SubLObject new_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym5$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym6$DEFAULT_EXCLUDE_MTS, $list7 );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym8$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list( lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(
        thread ) ) );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym9$DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym11$DEFAULT_KB_SPEC, $const12$AbstractLexiconSpecification );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
  public static SubLObject subloop_reserved_initialize_semtrans_lexicon_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym16$ALLOWED_MTS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym18$EXCLUDED_MTS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym19$BASE_MT, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym20$ROOT_MT, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym21$EXCLUDED_PREDS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym22$EXCLUDED_POS_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym23$TRIE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym24$CACHE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym26$CASE_SENSITIVITY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym28$LEARNED, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym29$ACTIVE_LEARNERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym30$ALLOW_STEMMING, T );
    classes.subloop_initialize_slot( new_instance, $sym1$ABSTRACT_LEXICON, $sym31$STOP_WORDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SEMTRANS_LEXICON, $sym3$MY_TERM_LEXICON, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 1947L)
  public static SubLObject semtrans_lexicon_p(final SubLObject v_semtrans_lexicon)
  {
    return classes.subloop_instanceof_class( v_semtrans_lexicon, $sym0$SEMTRANS_LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 3418L)
  public static SubLObject semtrans_lexicon_initialize_method(final SubLObject self)
  {
    abstract_lexicon.abstract_lexicon_initialize_method( self );
    methods.funcall_instance_method_with_1_args( self, $sym36$EXCLUDE_PREDICATE, $const37$preferredNameString );
    methods.funcall_instance_method_with_1_args( self, $sym36$EXCLUDE_PREDICATE, $const38$denotationPlaceholder );
    methods.funcall_instance_method_with_1_args( self, $sym36$EXCLUDE_PREDICATE, $const39$denotationRelatedTo );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 3721L)
  public static SubLObject semtrans_lexicon_get_term_lexicon_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_semtrans_lexicon_method = NIL;
    SubLObject my_term_lexicon = get_semtrans_lexicon_my_term_lexicon( self );
    try
    {
      thread.throwStack.push( $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD );
      try
      {
        if( NIL == my_term_lexicon )
        {
          my_term_lexicon = new_term_lexicon_from_semtrans_lexicon( self );
        }
        Dynamic.sublisp_throw( $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, my_term_lexicon );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_semtrans_lexicon_my_term_lexicon( self, my_term_lexicon );
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
      catch_var_for_semtrans_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_semtrans_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 4015L)
  public static SubLObject new_term_lexicon_from_semtrans_lexicon(final SubLObject lexicon)
  {
    assert NIL != semtrans_lexicon_p( lexicon ) : lexicon;
    final SubLObject v_term_lexicon = methods.funcall_instance_method_with_1_args( lexicon, $sym46$COPY, term_lexicon.new_term_lexicon() );
    return v_term_lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 4268L)
  public static SubLObject semtrans_lexicon_set_term_lexicon_method(final SubLObject self, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_semtrans_lexicon_method = NIL;
    SubLObject my_term_lexicon = get_semtrans_lexicon_my_term_lexicon( self );
    try
    {
      thread.throwStack.push( $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD );
      try
      {
        my_term_lexicon = lexicon;
        Dynamic.sublisp_throw( $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_semtrans_lexicon_my_term_lexicon( self, my_term_lexicon );
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
      catch_var_for_semtrans_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_semtrans_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 4395L)
  public static SubLObject semtrans_lexicon_fabricate_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_semtrans_lexicon_method = NIL;
    final SubLObject allow_fabricationP = abstract_lexicon.get_abstract_lexicon_allow_fabricationP( self );
    try
    {
      thread.throwStack.push( $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD );
      try
      {
        assert NIL != Types.stringp( string ) : string;
        assert NIL != Types.listp( keywords ) : keywords;
        assert NIL != Types.keywordp( penn ) : penn;
        Dynamic.sublisp_throw( $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, ( NIL == allow_fabricationP ) ? NIL
            : ( ( NIL != nominal_penn_tag( penn ) ) ? methods.funcall_instance_method_with_3_args( self, $sym60$FABRICATE_NOMINAL, string, keywords, penn )
                : ( ( NIL != verbal_penn_tag( penn ) ) ? methods.funcall_instance_method_with_3_args( self, $sym61$FABRICATE_VERBAL, string, keywords, penn )
                    : ( ( NIL != adjectival_penn_tag( penn ) ) ? methods.funcall_instance_method_with_3_args( self, $sym62$FABRICATE_ADJECTIVAL, string, keywords, penn )
                        : ( ( NIL != adverbial_penn_tag( penn ) ) ? methods.funcall_instance_method_with_3_args( self, $sym63$FABRICATE_ADVERBIAL, string, keywords, penn ) : NIL ) ) ) ) );
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
      catch_var_for_semtrans_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_semtrans_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5295L)
  public static SubLObject nominal_penn_tag(final SubLObject tag)
  {
    return conses_high.member( tag, abstract_lexicon.$nominal_tags$.getGlobalValue(), EQ, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5376L)
  public static SubLObject verbal_penn_tag(final SubLObject tag)
  {
    return conses_high.member( tag, abstract_lexicon.$verbal_tags$.getGlobalValue(), EQ, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5455L)
  public static SubLObject adjectival_penn_tag(final SubLObject tag)
  {
    return conses_high.member( tag, abstract_lexicon.$adjectival_tags$.getGlobalValue(), EQ, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5542L)
  public static SubLObject adverbial_penn_tag(final SubLObject tag)
  {
    return conses_high.member( tag, abstract_lexicon.$adverbial_tags$.getGlobalValue(), EQ, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 5627L)
  public static SubLObject semtrans_lexicon_fabricate_nominal_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn)
  {
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.listp( keywords ) : keywords;
    final SubLObject lex = object.new_class_instance( $sym66$LEX_ENTRY );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw68$STRING, string );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw69$PENN_TAGS, ConsesLow.list( penn ) );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw70$SEMTRANS, methods.funcall_instance_method_with_2_args( self, $sym71$FABRICATE_NOMINAL_SEMTRANS, string, keywords ) );
    return ConsesLow.list( lex );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 6226L)
  public static SubLObject semtrans_lexicon_fabricate_nominal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords)
  {
    SubLObject literals = NIL;
    SubLObject cdolist_list_var = keywords;
    SubLObject keyword = NIL;
    keyword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pcase_var = keyword;
      if( pcase_var.eql( $kw75$NOUN ) )
      {
        literals = ConsesLow.cons( ConsesLow.list( $const76$isa, $kw75$NOUN, ConsesLow.listS( $const77$ThingDescribableAsFn, ConsesLow.list( $const78$WordFn, string ), $list79 ) ), literals );
      }
      else if( pcase_var.eql( $kw80$POSSESSOR ) )
      {
        literals = ConsesLow.cons( $list81, literals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      keyword = cdolist_list_var.first();
    }
    return simplifier.conjoin( literals, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 6594L)
  public static SubLObject semtrans_lexicon_fabricate_verbal_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn)
  {
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.listp( keywords ) : keywords;
    SubLObject lexes = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_2_args( self, $sym84$FABRICATE_VERBAL_SEMTRANS, string, keywords );
    SubLObject semtrans = NIL;
    semtrans = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lex = object.new_class_instance( $sym66$LEX_ENTRY );
      methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw68$STRING, string );
      methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw69$PENN_TAGS, ConsesLow.list( penn ) );
      methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw70$SEMTRANS, semtrans );
      lexes = ConsesLow.cons( lex, lexes );
      cdolist_list_var = cdolist_list_var.rest();
      semtrans = cdolist_list_var.first();
    }
    return lexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 7257L)
  public static SubLObject semtrans_lexicon_fabricate_verbal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_semtrans_lexicon_method = NIL;
    final SubLObject case_sensitivity = abstract_lexicon.get_abstract_lexicon_case_sensitivity( self );
    final SubLObject trie = abstract_lexicon.get_abstract_lexicon_trie( self );
    try
    {
      thread.throwStack.push( $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD );
      try
      {
        if( NIL != subl_promotions.memberP( $kw88$ACTION, keywords, EQ, UNPROVIDED ) )
        {
          SubLObject semtranses = NIL;
          SubLObject cdolist_list_var = nl_trie.nl_trie_search( string, trie, case_sensitivity );
          SubLObject entry = NIL;
          entry = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_2_args( self, $sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, entry, keywords );
            SubLObject semtrans = NIL;
            semtrans = cdolist_list_var_$1.first();
            while ( NIL != cdolist_list_var_$1)
            {
              semtranses = ConsesLow.cons( semtrans, semtranses );
              cdolist_list_var_$1 = cdolist_list_var_$1.rest();
              semtrans = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
          }
          if( NIL == semtranses )
          {
            SubLObject keyword_literal = NIL;
            SubLObject literals = ConsesLow.list( ConsesLow.list( $const76$isa, $kw88$ACTION, ConsesLow.listS( $const77$ThingDescribableAsFn, ConsesLow.list( $const78$WordFn, string ), $list90 ) ) );
            SubLObject cdolist_list_var2 = keywords;
            SubLObject keyword = NIL;
            keyword = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              keyword_literal = keyword_to_semtrans_literal( keyword, UNPROVIDED );
              if( NIL != keyword_literal )
              {
                literals = ConsesLow.cons( keyword_literal, literals );
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              keyword = cdolist_list_var2.first();
            }
            if( NIL != literals )
            {
              semtranses = ConsesLow.cons( simplifier.conjoin( literals, UNPROVIDED ), semtranses );
            }
          }
          Dynamic.sublisp_throw( $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, semtranses );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          abstract_lexicon.set_abstract_lexicon_case_sensitivity( self, case_sensitivity );
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
      catch_var_for_semtrans_lexicon_method = Errors.handleThrowable( ccatch_env_var, $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_semtrans_lexicon_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 8262L)
  public static SubLObject semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method(final SubLObject self, final SubLObject entry, final SubLObject keywords)
  {
    SubLObject semtranses = NIL;
    if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) && NIL != conses_high.member( $kw88$ACTION, keywords, EQ, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots( entry );
      SubLObject denot = NIL;
      denot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        semtranses = ConsesLow.cons( denot_to_verbal_semtrans( denot, keywords ), semtranses );
        cdolist_list_var = cdolist_list_var.rest();
        denot = cdolist_list_var.first();
      }
    }
    return semtranses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 8749L)
  public static SubLObject denot_to_verbal_semtrans(final SubLObject denot, final SubLObject keywords)
  {
    SubLObject literals = NIL;
    SubLObject literal = NIL;
    SubLObject cdolist_list_var = keywords;
    SubLObject keyword = NIL;
    keyword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      literal = keyword_to_semtrans_literal( keyword, denot );
      if( NIL != literal )
      {
        literals = ConsesLow.cons( literal, literals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      keyword = cdolist_list_var.first();
    }
    return simplifier.conjoin( literals, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 9116L)
  public static SubLObject keyword_to_semtrans_literal(final SubLObject keyword, SubLObject denot)
  {
    if( denot == UNPROVIDED )
    {
      denot = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == denot )
    {
      return conses_high.assoc( keyword, $default_verbal_lex_entry_literals$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
    }
    final SubLObject mt = $list95;
    if( keyword.eql( $kw88$ACTION ) )
    {
      if( NIL != fort_types_interface.collectionP( denot ) )
      {
        return ConsesLow.list( $const76$isa, $kw88$ACTION, denot );
      }
      return ConsesLow.list( $const96$equals, $kw88$ACTION, denot );
    }
    else
    {
      if( keyword.eql( $kw97$SUBJECT ) )
      {
        return ConsesLow.list( parsing_utilities.known_subject_roles_for_denot( denot, mt, T ), $kw88$ACTION, $kw97$SUBJECT );
      }
      if( keyword.eql( $kw98$OBJECT ) )
      {
        return ConsesLow.list( parsing_utilities.known_direct_object_roles_for_denot( denot, mt, T ), $kw88$ACTION, $kw98$OBJECT );
      }
      if( keyword.eql( $kw99$OBLIQUE_OBJECT ) )
      {
        return ConsesLow.list( parsing_utilities.known_indirect_object_roles_for_denot( denot, mt, T ), $kw88$ACTION, $kw99$OBLIQUE_OBJECT );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 10249L)
  public static SubLObject semtrans_lexicon_fabricate_adjectival_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn)
  {
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.listp( keywords ) : keywords;
    final SubLObject lex = object.new_class_instance( $sym66$LEX_ENTRY );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw68$STRING, string );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw69$PENN_TAGS, ConsesLow.list( penn ) );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( $const76$isa, $kw75$NOUN, ConsesLow.listS( $const77$ThingDescribableAsFn, ConsesLow.list( $const78$WordFn, string ),
        $list102 ) ) );
    return ConsesLow.list( lex );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 10669L)
  public static SubLObject semtrans_lexicon_fabricate_adverbial_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn)
  {
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.listp( keywords ) : keywords;
    final SubLObject lex = object.new_class_instance( $sym66$LEX_ENTRY );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw68$STRING, string );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw69$PENN_TAGS, ConsesLow.list( penn ) );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( $const76$isa, $kw88$ACTION, ConsesLow.listS( $const77$ThingDescribableAsFn, ConsesLow.list( $const78$WordFn, string ),
        $list105 ) ) );
    return ConsesLow.list( lex );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 11126L)
  public static SubLObject semtrans_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry)
  {
    if( NIL != nl_trie.nl_trie_word_p( nl_trie_entry, UNPROVIDED ) )
    {
      return methods.funcall_instance_method_with_2_args( self, $sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD, string, nl_trie_entry );
    }
    if( NIL != nl_trie.nl_trie_name_p( nl_trie_entry, UNPROVIDED ) )
    {
      return methods.funcall_instance_method_with_2_args( self, $sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME, string, nl_trie_entry );
    }
    if( NIL != nl_trie.nl_trie_term_phrases_entry_p( nl_trie_entry, UNPROVIDED ) )
    {
      return methods.funcall_instance_method_with_2_args( self, $sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, string, nl_trie_entry );
    }
    if( NIL != abstract_lexicon.lex_entry_p( nl_trie_entry ) )
    {
      return ConsesLow.list( methods.funcall_instance_method_with_0_args( nl_trie_entry, $sym46$COPY ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 12087L)
  public static SubLObject semtrans_lexicon_textract_lemma_to_lex_entry_method(final SubLObject self, final SubLObject lemma)
  {
    SubLObject cycl = NIL;
    SubLObject lex_entry = NIL;
    final SubLObject pcase_var = abstract_lexicon.textract_lemma_type( lemma );
    if( pcase_var.eql( $kw117$PERSON ) )
    {
      cycl = ConsesLow.list( $const118$and, $list119, ConsesLow.list( $const120$nameString, $kw75$NOUN, abstract_lexicon.textract_lemma_string( lemma ) ) );
    }
    else if( pcase_var.eql( $kw121$PERSON_ ) )
    {
      cycl = ConsesLow.list( $const118$and, $list119, ConsesLow.list( $const120$nameString, $kw75$NOUN, abstract_lexicon.textract_lemma_string( lemma ) ) );
    }
    else if( pcase_var.eql( $kw122$PLACE ) )
    {
      cycl = ConsesLow.list( $const118$and, $list123, ConsesLow.list( $const120$nameString, $kw75$NOUN, abstract_lexicon.textract_lemma_string( lemma ) ) );
    }
    else if( pcase_var.eql( $kw124$PLACE_ ) )
    {
      cycl = ConsesLow.list( $const118$and, $list123, ConsesLow.list( $const120$nameString, $kw75$NOUN, abstract_lexicon.textract_lemma_string( lemma ) ) );
    }
    else if( pcase_var.eql( $kw125$ORG ) )
    {
      cycl = ConsesLow.list( $const118$and, $list126, ConsesLow.list( $const120$nameString, $kw75$NOUN, abstract_lexicon.textract_lemma_string( lemma ) ) );
    }
    else if( pcase_var.eql( $kw127$UNAME ) )
    {
      cycl = ConsesLow.list( $const120$nameString, $kw75$NOUN, abstract_lexicon.textract_lemma_string( lemma ) );
    }
    else
    {
      cycl = NIL;
    }
    if( NIL != cycl )
    {
      lex_entry = object.new_class_instance( $sym66$LEX_ENTRY );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw128$CYC_POS, $const129$ProperNoun );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( cycl ) );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw68$STRING, abstract_lexicon.textract_lemma_string( lemma ) );
    }
    return lex_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 13527L)
  public static SubLObject semtrans_lexicon_resporator_to_lex_entries_method(final SubLObject self, final SubLObject typeXstring)
  {
    SubLObject lex_entries = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( self, $sym138$RESPORATOR_TO_CYCL, typeXstring );
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lex_entry = object.new_class_instance( $sym66$LEX_ENTRY );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw68$STRING, typeXstring.rest() );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw128$CYC_POS, $const129$ProperNoun );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( $const118$and, ConsesLow.list( $const76$isa, $kw75$NOUN, parse ), ConsesLow.list( $const120$nameString,
          $kw75$NOUN, typeXstring.rest() ) ) );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw136$INFLECTIONS, methods.funcall_class_method_with_1_args( $sym1$ABSTRACT_LEXICON, $sym137$RESPORATOR_TO_INFLECTIONS, typeXstring ) );
      lex_entries = ConsesLow.cons( lex_entry, lex_entries );
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    return lex_entries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 14179L)
  public static SubLObject semtrans_lexicon_resporator_learn_method(final SubLObject self, final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( text ) : text;
    SubLObject lexes = NIL;
    SubLObject typings = NIL;
    SubLObject errorP = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym143$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          typings = external_interfaces.resporator( text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
      errorP = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != errorP )
    {
      Errors.warn( errorP );
      return NIL;
    }
    SubLObject cdolist_list_var = typings;
    SubLObject typeXstring = NIL;
    typeXstring = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_1_args( self, $sym133$RESPORATOR_TO_LEX_ENTRIES, typeXstring );
      SubLObject lex = NIL;
      lex = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        lexes = ConsesLow.cons( lex, lexes );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        lex = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      typeXstring = cdolist_list_var.first();
    }
    return lexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 14912L)
  public static SubLObject semtrans_lexicon_resporatorXX_learn_method(final SubLObject self, final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( text ) : text;
    SubLObject lexes = NIL;
    SubLObject typings = NIL;
    SubLObject errorP = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym143$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          typings = external_interfaces.resporatorXX( text );
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
      errorP = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != errorP )
    {
      Errors.warn( errorP );
      return NIL;
    }
    SubLObject cdolist_list_var = typings;
    SubLObject typeXstring = NIL;
    typeXstring = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_1_args( self, $sym133$RESPORATOR_TO_LEX_ENTRIES, typeXstring );
      SubLObject lex = NIL;
      lex = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        lexes = ConsesLow.cons( lex, lexes );
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        lex = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      typeXstring = cdolist_list_var.first();
    }
    return lexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 15859L)
  public static SubLObject semtrans_lexicon_stanford_ner_learn_method(final SubLObject self, final SubLObject text)
  {
    return methods.funcall_instance_method_with_2_args( self, $sym150$STANFORD_NER_LEARN_INT, text, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 15990L)
  public static SubLObject semtrans_lexicon_stanford_ner_learn_tightened_types_method(final SubLObject self, final SubLObject text)
  {
    return methods.funcall_instance_method_with_2_args( self, $sym150$STANFORD_NER_LEARN_INT, text, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 16135L)
  public static SubLObject semtrans_lexicon_stanford_ner_learn_int_method(final SubLObject self, final SubLObject text, final SubLObject tighten_typesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( text ) : text;
    SubLObject new_lexes = NIL;
    final SubLObject sner = object.new_class_instance( $sym157$STANFORD_NER );
    final SubLObject entity_clusters = methods.funcall_instance_method_with_1_args( sner, $sym158$RUN, text );
    final SubLObject v_term_lexicon = methods.funcall_instance_method_with_0_args( self, $sym41$GET_TERM_LEXICON );
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym143$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject cdolist_list_var = entity_clusters;
          SubLObject ec = NIL;
          ec = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject cdolist_list_var_$4 = ec;
            SubLObject nament = NIL;
            nament = cdolist_list_var_$4.first();
            while ( NIL != cdolist_list_var_$4)
            {
              methods.funcall_instance_method_with_1_args( nament, $sym159$SET_LEXICON, v_term_lexicon );
              if( !$sym160$O.eql( methods.funcall_instance_method_with_0_args( nament, $sym161$GET_TYPE ) ) )
              {
                final SubLObject type = methods.funcall_instance_method_with_0_args( nament, $sym162$GET_CYC );
                final SubLObject subtypes = ( NIL != tighten_typesP && NIL != type ) ? methods.funcall_instance_method_with_0_args( nament, $sym163$TIGHTEN_TYPE ).first() : NIL;
                final SubLObject instance_meanings = named_entity_recognizer.get_nament_instance_meaning( nament );
                final SubLObject string = methods.funcall_instance_method_with_0_args( nament, $sym164$GET_STRING );
                final SubLObject existing_entries = methods.funcall_instance_method_with_1_args( v_term_lexicon, $sym165$GET, string );
                SubLObject entity_lexes = NIL;
                if( NIL != instance_meanings )
                {
                  SubLObject cdolist_list_var_$5 = instance_meanings;
                  SubLObject instance_meaning = NIL;
                  instance_meaning = cdolist_list_var_$5.first();
                  while ( NIL != cdolist_list_var_$5)
                  {
                    final SubLObject lex_entry = object.new_class_instance( $sym66$LEX_ENTRY );
                    methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw68$STRING, string );
                    methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( $const96$equals, $kw75$NOUN, instance_meaning ) );
                    methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
                    methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw136$INFLECTIONS, $list166 );
                    if( NIL == contains_semtrans_lexicon_usable_entryP( existing_entries ) )
                    {
                      methods.funcall_instance_method_with_1_args( self, $sym167$ADD, lex_entry );
                      entity_lexes = ConsesLow.cons( lex_entry, entity_lexes );
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    instance_meaning = cdolist_list_var_$5.first();
                  }
                }
                else
                {
                  SubLObject cdolist_list_var_$6 = subtypes;
                  SubLObject subtype = NIL;
                  subtype = cdolist_list_var_$6.first();
                  while ( NIL != cdolist_list_var_$6)
                  {
                    final SubLObject lex_entry = object.new_class_instance( $sym66$LEX_ENTRY );
                    methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw68$STRING, string );
                    methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( $const118$and, ConsesLow.list( $const76$isa, $kw75$NOUN, subtype ), ConsesLow.list(
                        $const120$nameString, $kw75$NOUN, string ) ) );
                    methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
                    methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw136$INFLECTIONS, $list166 );
                    if( NIL == contains_semtrans_lexicon_usable_entryP( existing_entries ) )
                    {
                      methods.funcall_instance_method_with_1_args( self, $sym167$ADD, lex_entry );
                      entity_lexes = ConsesLow.cons( lex_entry, entity_lexes );
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    subtype = cdolist_list_var_$6.first();
                  }
                }
                if( NIL == entity_lexes && NIL != type )
                {
                  final SubLObject lex_entry2 = object.new_class_instance( $sym66$LEX_ENTRY );
                  final SubLObject existing_entries_$7 = methods.funcall_instance_method_with_1_args( v_term_lexicon, $sym165$GET, string );
                  methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw68$STRING, string );
                  methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( $const118$and, ConsesLow.list( $const76$isa, $kw75$NOUN, type ), ConsesLow.list(
                      $const120$nameString, $kw75$NOUN, string ) ) );
                  methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
                  methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw136$INFLECTIONS, $list166 );
                  if( NIL == contains_semtrans_lexicon_usable_entryP( existing_entries_$7 ) )
                  {
                    methods.funcall_instance_method_with_1_args( self, $sym167$ADD, lex_entry2 );
                    entity_lexes = ConsesLow.cons( lex_entry2, entity_lexes );
                  }
                }
                final SubLObject items_var = entity_lexes;
                if( items_var.isVector() )
                {
                  final SubLObject vector_var = items_var;
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject element_num;
                  SubLObject item;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    item = Vectors.aref( vector_var, element_num );
                    new_lexes = ConsesLow.cons( item, new_lexes );
                  }
                }
                else
                {
                  SubLObject cdolist_list_var_$7 = items_var;
                  SubLObject item2 = NIL;
                  item2 = cdolist_list_var_$7.first();
                  while ( NIL != cdolist_list_var_$7)
                  {
                    new_lexes = ConsesLow.cons( item2, new_lexes );
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    item2 = cdolist_list_var_$7.first();
                  }
                }
              }
              cdolist_list_var_$4 = cdolist_list_var_$4.rest();
              nament = cdolist_list_var_$4.first();
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
      Errors.warn( $str168$___S, error );
    }
    return new_lexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 18911L)
  public static SubLObject contains_semtrans_lexicon_usable_entryP(final SubLObject lex_entries)
  {
    SubLObject usableP = NIL;
    if( NIL == usableP )
    {
      SubLObject csome_list_var = lex_entries;
      SubLObject entry = NIL;
      entry = csome_list_var.first();
      while ( NIL == usableP && NIL != csome_list_var)
      {
        if( NIL == abstract_lexicon.lex_entry_p( abstract_lexicon.lex_entry_trie_entry( entry ) ) )
        {
          usableP = T;
        }
        else if( NIL != abstract_lexicon.lex_entry_p( entry ) && NIL != abstract_lexicon.lex_entry_semtrans( entry ) )
        {
          usableP = T;
        }
        else
        {
          usableP = NIL;
        }
        csome_list_var = csome_list_var.rest();
        entry = csome_list_var.first();
      }
    }
    return usableP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 19281L)
  public static SubLObject semtrans_lexicon_number_learn_method(final SubLObject self, final SubLObject text)
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
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
      number_string = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
      meaning = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject known_entries = methods.funcall_instance_method_with_1_args( self, $sym165$GET, number_string );
        final SubLObject already_known = subl_promotions.memberP( meaning, known_entries, EQUAL, $sym173$LEX_ENTRY_SEMTRANS );
        if( NIL == already_known )
        {
          final SubLObject lex_entry = number_semtrans_lex_entry( number_string, meaning );
          methods.funcall_instance_method_with_1_args( self, $sym167$ADD, lex_entry );
          result = ConsesLow.cons( lex_entry, result );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list172 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      number = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 19829L)
  public static SubLObject number_semtrans_lex_entry(final SubLObject string, final SubLObject number)
  {
    final SubLObject lex = object.new_class_instance( $sym66$LEX_ENTRY );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw68$STRING, string );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw69$PENN_TAGS, $list175 );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw128$CYC_POS, $const176$Number_SP );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( $const96$equals, $kw75$NOUN, number ) );
    return lex;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 20301L)
  public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_word_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lex_entries = NIL;
    final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred( nl_trie_entry, NIL );
    if( NIL != lexicon_vars.semtrans_predP( pred ) )
    {
      SubLObject cdolist_list_var = cycl_utilities.hl_to_el( nl_trie.nl_trie_word_semtrans_templates( nl_trie_entry ) );
      SubLObject semtrans = NIL;
      semtrans = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject wu = nl_trie.nl_trie_word_word_unit( nl_trie_entry, UNPROVIDED );
        final SubLObject pos = nl_trie.nl_trie_entry_pos( nl_trie_entry );
        final SubLObject frame = nl_trie.nl_trie_word_frame( nl_trie_entry );
        final SubLObject inflections = ( NIL != wu ) ? pph_utilities.pph_filter_preds( lexicon_accessors.preds_of_stringXword( string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED ), lexicon_utilities.preds_of_pos( pos,
            UNPROVIDED ), UNPROVIDED ) : $list179;
        final SubLObject lex_entry = object.new_class_instance( $sym66$LEX_ENTRY );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw128$CYC_POS, pos );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw70$SEMTRANS, semtrans );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw130$FRAME, frame );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw180$WORD_UNIT, wu );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw68$STRING, string );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw136$INFLECTIONS, inflections );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw181$TRIE_ENTRY, nl_trie_entry );
        lex_entries = ConsesLow.cons( lex_entry, lex_entries );
        cdolist_list_var = cdolist_list_var.rest();
        semtrans = cdolist_list_var.first();
      }
    }
    else if( NIL != $manufacture_semtrans_assertionsP$.getDynamicValue( thread ) && NIL != subl_promotions.memberP( pred, $list182, UNPROVIDED, UNPROVIDED ) && NIL != lexicon_accessors.genl_posP( nl_trie
        .nl_trie_word_pos( nl_trie_entry ), $const183$Noun, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym184$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const185$EverythingPSC, thread );
        SubLObject cdolist_list_var2 = nl_trie.nl_trie_entry_denots( nl_trie_entry );
        SubLObject denot = NIL;
        denot = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( NIL == fort_types_interface.predicate_p( denot ) )
          {
            final SubLObject lex_entry2 = object.new_class_instance( $sym66$LEX_ENTRY );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw136$INFLECTIONS, nl_trie.nl_trie_word_pos_preds( nl_trie_entry ) );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw128$CYC_POS, nl_trie.nl_trie_word_pos( nl_trie_entry ) );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( ( NIL != isa.isa_in_any_mtP( denot, $const186$Collection ) ) ? $const76$isa : $const96$equals, $kw75$NOUN,
                cycl_utilities.hl_to_el( denot ) ) );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw180$WORD_UNIT, nl_trie.nl_trie_word_word_unit( nl_trie_entry, NIL ) );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw68$STRING, string );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym67$SET, $kw181$TRIE_ENTRY, nl_trie_entry );
            lex_entries = ConsesLow.cons( lex_entry2, lex_entries );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          denot = cdolist_list_var2.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return lex_entries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 22460L)
  public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_name_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry)
  {
    SubLObject lex_entries = NIL;
    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots( nl_trie_entry );
    SubLObject denot = NIL;
    denot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lex_entry = object.new_class_instance( $sym66$LEX_ENTRY );
      final SubLObject collectionP = fort_types_interface.collection_p( denot );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( ( NIL != collectionP ) ? $const76$isa : $const96$equals, $kw75$NOUN, cycl_utilities.hl_to_el( denot ) ) );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw128$CYC_POS, $const129$ProperNoun );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw136$INFLECTIONS, $list166 );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw68$STRING, string );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw181$TRIE_ENTRY, nl_trie_entry );
      lex_entries = ConsesLow.cons( lex_entry, lex_entries );
      cdolist_list_var = cdolist_list_var.rest();
      denot = cdolist_list_var.first();
    }
    return lex_entries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 23397L)
  public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method(final SubLObject self, final SubLObject string, final SubLObject tp_entry)
  {
    SubLObject lex_entries = NIL;
    final SubLObject pos = nl_trie.nl_trie_entry_pos( tp_entry );
    final SubLObject inflections = nl_trie.nl_trie_entry_pos_preds( tp_entry );
    final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred( tp_entry, NIL );
    final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics( tp_entry );
    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots( tp_entry );
    SubLObject denot = NIL;
    denot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lex_entry = object.new_class_instance( $sym66$LEX_ENTRY );
      final SubLObject collectionP = fort_types_interface.collection_p( denot );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw192$PRAGMATICS, pragmatics );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw70$SEMTRANS, ConsesLow.list( ( NIL != collectionP ) ? $const76$isa : $const96$equals, $kw75$NOUN, cycl_utilities.hl_to_el( denot ) ) );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw193$PREDICATE, predicate );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw128$CYC_POS, pos );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw68$STRING, string );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw136$INFLECTIONS, inflections );
      methods.funcall_instance_method_with_2_args( lex_entry, $sym67$SET, $kw181$TRIE_ENTRY, tp_entry );
      lex_entries = ConsesLow.cons( lex_entry, lex_entries );
      cdolist_list_var = cdolist_list_var.rest();
      denot = cdolist_list_var.first();
    }
    return lex_entries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 24304L)
  public static SubLObject semtrans_lexicon_create_lex_entries_number_method(final SubLObject self, final SubLObject number_string)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 24436L)
  public static SubLObject semtrans_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text)
  {
    return text_noun_compound_semtrans_lex_entries( text );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 24784L)
  public static SubLObject noun_compound_semtrans_lex_entry(final SubLObject string, final SubLObject denotation, final SubLObject number)
  {
    final SubLObject lex = object.new_class_instance( $sym66$LEX_ENTRY );
    final SubLObject penn_tags = ( NIL != backward.removal_ask( ConsesLow.listS( $const202$genlPreds, number, $list203 ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? $list204 : $list205;
    final SubLObject base_sem_trans = ConsesLow.list( $const76$isa, $kw75$NOUN, denotation );
    final SubLObject reformulated_sem_trans = reformulator_hub.reformulate_cycl( base_sem_trans, $const185$EverythingPSC, UNPROVIDED );
    final SubLObject final_sem_trans = ( NIL != reformulated_sem_trans ) ? reformulated_sem_trans : base_sem_trans;
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw68$STRING, string );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw69$PENN_TAGS, penn_tags );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw128$CYC_POS, $const183$Noun );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw70$SEMTRANS, final_sem_trans );
    methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw136$INFLECTIONS, ConsesLow.list( number ) );
    return lex;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 25479L)
  public static SubLObject text_noun_compound_semtrans_lex_entries(final SubLObject str)
  {
    final SubLObject compounds = abstract_lexicon.noun_compound_meanings( str );
    SubLObject res = NIL;
    SubLObject cdolist_list_var = compounds;
    SubLObject compound = NIL;
    compound = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$9 = compound.rest();
      SubLObject meaning = NIL;
      meaning = cdolist_list_var_$9.first();
      while ( NIL != cdolist_list_var_$9)
      {
        res = ConsesLow.cons( noun_compound_semtrans_lex_entry( compound.first(), meaning.first(), conses_high.second( meaning ) ), res );
        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
        meaning = cdolist_list_var_$9.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      compound = cdolist_list_var.first();
    }
    return res;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 25816L)
  public static SubLObject semtrans_lexicon_cooccurrence_statistics_learn_method(final SubLObject self, final SubLObject text)
  {
    final SubLObject parse = methods.funcall_instance_method_with_1_args( parser.new_stanford_parser( UNPROVIDED, UNPROVIDED ), $sym208$PARSE, text );
    final SubLObject words = ( NIL != parse ) ? methods.funcall_instance_method_with_0_args( parse, $sym209$YIELD ) : NIL;
    SubLObject lexes = NIL;
    SubLObject cdolist_list_var;
    final SubLObject learned_nouns = cdolist_list_var = NIL;
    SubLObject learned_noun = NIL;
    learned_noun = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = learned_noun;
      SubLObject learned_string = NIL;
      SubLObject type = NIL;
      SubLObject relationship = NIL;
      SubLObject confidence = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list210 );
      learned_string = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list210 );
      type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list210 );
      relationship = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list210 );
      confidence = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject penn_tags = NIL;
        SubLObject parsed_string = NIL;
        SubLObject singularized_string = NIL;
        SubLObject semtrans = NIL;
        if( NIL == penn_tags )
        {
          SubLObject csome_list_var = words;
          SubLObject word = NIL;
          word = csome_list_var.first();
          while ( NIL == penn_tags && NIL != csome_list_var)
          {
            parsed_string = methods.funcall_instance_method_with_0_args( word, $sym164$GET_STRING );
            if( NIL != parsed_string )
            {
              singularized_string = lexification_utilities.singularize_word( parsed_string, UNPROVIDED );
            }
            if( singularized_string.equalp( learned_string ) )
            {
              penn_tags = ConsesLow.cons( methods.funcall_instance_method_with_0_args( word, $sym211$GET_CATEGORY ), penn_tags );
            }
            csome_list_var = csome_list_var.rest();
            word = csome_list_var.first();
          }
        }
        final SubLObject pcase_var = relationship;
        if( pcase_var.eql( $kw212$ISA ) )
        {
          semtrans = ConsesLow.list( $const96$equals, $kw75$NOUN, type );
        }
        else if( pcase_var.eql( $kw213$GENLS ) )
        {
          semtrans = ConsesLow.list( $const76$isa, $kw75$NOUN, ConsesLow.list( $const214$SubCollectionNamedFn, singularized_string, type ) );
        }
        if( NIL != penn_tags && NIL != semtrans )
        {
          final SubLObject lex = object.new_class_instance( $sym66$LEX_ENTRY );
          methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw68$STRING, parsed_string );
          methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw69$PENN_TAGS, penn_tags );
          methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw130$FRAME, $const131$RegularNounFrame );
          methods.funcall_instance_method_with_2_args( lex, $sym67$SET, $kw70$SEMTRANS, semtrans );
          lexes = ConsesLow.cons( lex, lexes );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list210 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      learned_noun = cdolist_list_var.first();
    }
    return lexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 27246L)
  public static SubLObject semtrans_lexicon_from_term_lexicon(final SubLObject v_term_lexicon)
  {
    final SubLObject v_semtrans_lexicon = new_semtrans_lexicon();
    instances.set_slot( v_semtrans_lexicon, $sym11$DEFAULT_KB_SPEC, instances.get_slot( v_term_lexicon, $sym11$DEFAULT_KB_SPEC ) );
    methods.funcall_instance_method_with_1_args( v_semtrans_lexicon, $sym216$SET_CASE_SENSITIVITY, instances.get_slot( v_term_lexicon, $sym26$CASE_SENSITIVITY ) );
    return v_semtrans_lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 27588L)
  public static SubLObject extract_cycl_from_semtrans_lex_entry(final SubLObject lex_entry, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    assert NIL != abstract_lexicon.lex_entry_p( lex_entry ) : lex_entry;
    final SubLObject semtrans = methods.funcall_instance_method_with_1_args( lex_entry, $sym165$GET, $kw70$SEMTRANS );
    return extract_cycl_from_semtrans_sentence( semtrans, lexicon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 28204L)
  public static SubLObject extract_cycl_from_semtrans_sentence(SubLObject semtrans, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    SubLObject concise_cycl = NIL;
    if( NIL != likely_ner_result_semtransP( semtrans, lexicon ) )
    {
      concise_cycl = extract_concise_cycl_from_ner_semtrans( semtrans, lexicon );
    }
    else if( cycl_utilities.formula_arg0( semtrans ).eql( $const76$isa ) )
    {
      concise_cycl = cycl_utilities.formula_arg2( semtrans, UNPROVIDED );
    }
    else if( cycl_utilities.formula_arg0( semtrans ).eql( $const96$equals ) )
    {
      concise_cycl = cycl_utilities.formula_arg2( semtrans, UNPROVIDED );
    }
    else if( NIL != cycl_grammar.cycl_formula_p( cycl_utilities.formula_arg1( semtrans, UNPROVIDED ) ) )
    {
      if( NIL != cycl_utilities.expression_find( $const218$InstanceFn, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        semtrans = simplifier.simplify_cycl_sentence_syntax( semtrans, UNPROVIDED );
        semtrans = Sequences.remove_if( $sym219$INSTANCEFN_CLAUSE, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == concise_cycl )
      {
        SubLObject csome_list_var = semtrans;
        SubLObject clause = NIL;
        clause = csome_list_var.first();
        while ( NIL == concise_cycl && NIL != csome_list_var)
        {
          final SubLObject pred = cycl_utilities.formula_arg0( clause );
          if( pred.eql( $const76$isa ) )
          {
            concise_cycl = cycl_utilities.formula_arg2( clause, UNPROVIDED );
          }
          else if( pred.eql( $const96$equals ) && ( NIL == narts_high.naut_p( cycl_utilities.formula_arg2( clause, UNPROVIDED ) ) || !cycl_utilities.formula_arg0( cycl_utilities.formula_arg2( clause, UNPROVIDED ) ).eql(
              $const218$InstanceFn ) ) )
          {
            concise_cycl = cycl_utilities.formula_arg2( clause, UNPROVIDED );
          }
          csome_list_var = csome_list_var.rest();
          clause = csome_list_var.first();
        }
      }
    }
    if( concise_cycl.isKeyword() || NIL == concise_cycl )
    {
      concise_cycl = semtrans;
    }
    if( concise_cycl.isKeyword() )
    {
      concise_cycl = NIL;
    }
    return narts_high.nart_substitute( concise_cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 29451L)
  public static SubLObject instancefn_clause(final SubLObject clause)
  {
    return makeBoolean( cycl_utilities.formula_arg0( clause ).eql( $const96$equals ) && cycl_utilities.formula_arg_position( clause, $list220, UNPROVIDED ).eql( $const218$InstanceFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 29608L)
  public static SubLObject likely_ner_result_semtransP(final SubLObject semtrans, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    SubLObject isa_restriction = NIL;
    SubLObject name = NIL;
    final SubLObject instancefnP = NIL;
    SubLObject other_stuffP = NIL;
    if( semtrans.isList() )
    {
      SubLObject cdolist_list_var;
      final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms( simplifier.simplify_cycl_sentence_syntax( semtrans, UNPROVIDED ), $kw221$IGNORE );
      SubLObject clause = NIL;
      clause = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.el_formula_p( clause ) )
        {
          if( cycl_utilities.formula_arg0( clause ).eql( $const76$isa ) && NIL == isa_restriction )
          {
            isa_restriction = cycl_utilities.formula_arg2( clause, UNPROVIDED );
          }
          else if( cycl_utilities.formula_arg0( clause ).eql( $const120$nameString ) )
          {
            name = cycl_utilities.formula_arg2( clause, UNPROVIDED );
          }
          else
          {
            other_stuffP = T;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        clause = cdolist_list_var.first();
      }
      if( NIL != isa_restriction && NIL != name )
      {
        return get_infnt_nart_with_specification( name, isa_restriction, lexicon );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 30467L)
  public static SubLObject extract_concise_cycl_from_ner_semtrans(final SubLObject semtrans, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    return likely_ner_result_semtransP( semtrans, lexicon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 30608L)
  public static SubLObject get_infnt_nart_with_specification(final SubLObject name, final SubLObject isa_restriction, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    SubLObject result = NIL;
    result = find_infnt_nart_with_specification( name, isa_restriction );
    if( NIL == result )
    {
      if( NIL != lexicon )
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym222$DELETE, name );
      }
      result = czer_main.cyc_find_or_create_nart( ConsesLow.list( $const223$InstanceNamedFn_Ternary, name, isa_restriction, Guids.guid_to_string( Guids.new_guid() ) ), UNPROVIDED );
      if( cycl_utilities.formula_arg0( isa_restriction ).equal( $const224$CollectionIntersection2Fn ) )
      {
        SubLObject cdolist_list_var = cycl_utilities.formula_args( isa_restriction, UNPROVIDED );
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          ke.ke_assert_now( ConsesLow.list( $const76$isa, result, v_isa ), $const225$BaseKB, UNPROVIDED, UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/semtrans-lexicon.lisp", position = 31317L)
  public static SubLObject find_infnt_nart_with_specification(final SubLObject name, final SubLObject isa_restriction)
  {
    final SubLObject isa_forts = cycl_utilities.expression_gather( isa_restriction, $sym226$FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject tou_asserts = virtual_indexing.assertions_mentioning_terms( ConsesLow.cons( $const227$termOfUnit, isa_forts ), UNPROVIDED );
    SubLObject result = NIL;
    if( NIL == result )
    {
      SubLObject csome_list_var = tou_asserts;
      SubLObject v_assert = NIL;
      v_assert = csome_list_var.first();
      while ( NIL == result && NIL != csome_list_var)
      {
        final SubLObject nart = cycl_utilities.formula_arg0( v_assert ).eql( $const227$termOfUnit ) ? cycl_utilities.formula_arg1( v_assert, UNPROVIDED ) : NIL;
        if( cycl_utilities.formula_arg0( nart ).eql( $const223$InstanceNamedFn_Ternary ) && cycl_utilities.formula_arg1( nart, UNPROVIDED ).equal( name ) && cycl_utilities.formula_arg2( nart, UNPROVIDED ).equal(
            isa_restriction ) )
        {
          result = nart;
        }
        csome_list_var = csome_list_var.rest();
        v_assert = csome_list_var.first();
      }
    }
    return result;
  }

  public static SubLObject declare_semtrans_lexicon_file()
  {
    SubLFiles.declareFunction( me, "new_semtrans_lexicon", "NEW-SEMTRANS-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_semtrans_lexicon", "GET-SEMTRANS-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_semtrans_lexicon_my_term_lexicon", "GET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "set_semtrans_lexicon_my_term_lexicon", "SET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_semtrans_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_semtrans_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_p", "SEMTRANS-LEXICON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_initialize_method", "SEMTRANS-LEXICON-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_get_term_lexicon_method", "SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_term_lexicon_from_semtrans_lexicon", "NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_set_term_lexicon_method", "SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_fabricate_method", "SEMTRANS-LEXICON-FABRICATE-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "nominal_penn_tag", "NOMINAL-PENN-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_penn_tag", "VERBAL-PENN-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectival_penn_tag", "ADJECTIVAL-PENN-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "adverbial_penn_tag", "ADVERBIAL-PENN-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_fabricate_nominal_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_fabricate_nominal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_fabricate_verbal_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_fabricate_verbal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method", "SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "denot_to_verbal_semtrans", "DENOT-TO-VERBAL-SEMTRANS", 2, 0, false );
    SubLFiles.declareFunction( me, "keyword_to_semtrans_literal", "KEYWORD-TO-SEMTRANS-LITERAL", 1, 1, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_fabricate_adjectival_method", "SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_fabricate_adverbial_method", "SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_create_lex_entries_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_textract_lemma_to_lex_entry_method", "SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_resporator_to_lex_entries_method", "SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_resporator_learn_method", "SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_resporatorXX_learn_method", "SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_stanford_ner_learn_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_stanford_ner_learn_tightened_types_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_stanford_ner_learn_int_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "contains_semtrans_lexicon_usable_entryP", "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_number_learn_method", "SEMTRANS-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "number_semtrans_lex_entry", "NUMBER-SEMTRANS-LEX-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_create_lex_entries_nl_trie_word_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_create_lex_entries_nl_trie_name_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_create_lex_entries_number_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_noun_compound_learn_method", "SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "noun_compound_semtrans_lex_entry", "NOUN-COMPOUND-SEMTRANS-LEX-ENTRY", 3, 0, false );
    SubLFiles.declareFunction( me, "text_noun_compound_semtrans_lex_entries", "TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_cooccurrence_statistics_learn_method", "SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "semtrans_lexicon_from_term_lexicon", "SEMTRANS-LEXICON-FROM-TERM-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_cycl_from_semtrans_lex_entry", "EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY", 1, 1, false );
    SubLFiles.declareFunction( me, "extract_cycl_from_semtrans_sentence", "EXTRACT-CYCL-FROM-SEMTRANS-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "instancefn_clause", "INSTANCEFN-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "likely_ner_result_semtransP", "LIKELY-NER-RESULT-SEMTRANS?", 1, 1, false );
    SubLFiles.declareFunction( me, "extract_concise_cycl_from_ner_semtrans", "EXTRACT-CONCISE-CYCL-FROM-NER-SEMTRANS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_infnt_nart_with_specification", "GET-INFNT-NART-WITH-SPECIFICATION", 2, 1, false );
    SubLFiles.declareFunction( me, "find_infnt_nart_with_specification", "FIND-INFNT-NART-WITH-SPECIFICATION", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_semtrans_lexicon_file()
  {
    $manufacture_semtrans_assertionsP$ = SubLFiles.defparameter( "*MANUFACTURE-SEMTRANS-ASSERTIONS?*", T );
    $semtrans_lexicon$ = SubLFiles.defparameter( "*SEMTRANS-LEXICON*", NIL );
    $default_verbal_lex_entry_literals$ = SubLFiles.defvar( "*DEFAULT-VERBAL-LEX-ENTRY-LITERALS*", $list100 );
    $semtrans_lexicon_learners$ = SubLFiles.defparameter( "*SEMTRANS-LEXICON-LEARNERS*", $list177 );
    return NIL;
  }

  public static SubLObject setup_semtrans_lexicon_file()
  {
    classes.subloop_new_class( $sym0$SEMTRANS_LEXICON, $sym1$ABSTRACT_LEXICON, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$SEMTRANS_LEXICON, NIL );
    classes.subloop_note_class_initialization_function( $sym0$SEMTRANS_LEXICON, $sym13$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$SEMTRANS_LEXICON, $sym32$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE );
    subloop_reserved_initialize_semtrans_lexicon_class( $sym0$SEMTRANS_LEXICON );
    methods.methods_incorporate_instance_method( $sym33$INITIALIZE, $sym0$SEMTRANS_LEXICON, $list34, NIL, $list35 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym33$INITIALIZE, $sym40$SEMTRANS_LEXICON_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym41$GET_TERM_LEXICON, $sym0$SEMTRANS_LEXICON, $list34, NIL, $list42 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym41$GET_TERM_LEXICON, $sym44$SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD );
    methods.methods_incorporate_instance_method( $sym47$SET_TERM_LEXICON, $sym0$SEMTRANS_LEXICON, $list34, $list48, $list49 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym47$SET_TERM_LEXICON, $sym51$SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD );
    methods.methods_incorporate_instance_method( $sym52$FABRICATE, $sym0$SEMTRANS_LEXICON, $list53, $list54, $list55 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym52$FABRICATE, $sym64$SEMTRANS_LEXICON_FABRICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym60$FABRICATE_NOMINAL, $sym0$SEMTRANS_LEXICON, $list53, $list54, $list65 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym60$FABRICATE_NOMINAL, $sym72$SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD );
    methods.methods_incorporate_instance_method( $sym71$FABRICATE_NOMINAL_SEMTRANS, $sym0$SEMTRANS_LEXICON, $list34, $list73, $list74 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym71$FABRICATE_NOMINAL_SEMTRANS, $sym82$SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD );
    methods.methods_incorporate_instance_method( $sym61$FABRICATE_VERBAL, $sym0$SEMTRANS_LEXICON, $list53, $list54, $list83 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym61$FABRICATE_VERBAL, $sym85$SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD );
    methods.methods_incorporate_instance_method( $sym84$FABRICATE_VERBAL_SEMTRANS, $sym0$SEMTRANS_LEXICON, $list34, $list73, $list86 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym84$FABRICATE_VERBAL_SEMTRANS, $sym91$SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD );
    methods.methods_incorporate_instance_method( $sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, $sym0$SEMTRANS_LEXICON, $list34, $list92, $list93 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, $sym94$SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD );
    methods.methods_incorporate_instance_method( $sym62$FABRICATE_ADJECTIVAL, $sym0$SEMTRANS_LEXICON, $list53, $list54, $list101 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym62$FABRICATE_ADJECTIVAL, $sym103$SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD );
    methods.methods_incorporate_instance_method( $sym63$FABRICATE_ADVERBIAL, $sym0$SEMTRANS_LEXICON, $list53, $list54, $list104 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym63$FABRICATE_ADVERBIAL, $sym106$SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD );
    methods.methods_incorporate_instance_method( $sym107$CREATE_LEX_ENTRIES, $sym0$SEMTRANS_LEXICON, $list34, $list108, $list109 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym107$CREATE_LEX_ENTRIES, $sym113$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD );
    methods.methods_incorporate_class_method( $sym114$TEXTRACT_LEMMA_TO_LEX_ENTRY, $sym0$SEMTRANS_LEXICON, $list34, $list115, $list116 );
    methods.subloop_register_class_method( $sym0$SEMTRANS_LEXICON, $sym114$TEXTRACT_LEMMA_TO_LEX_ENTRY, $sym132$SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD );
    methods.methods_incorporate_instance_method( $sym133$RESPORATOR_TO_LEX_ENTRIES, $sym0$SEMTRANS_LEXICON, $list34, $list134, $list135 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym133$RESPORATOR_TO_LEX_ENTRIES, $sym139$SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD );
    methods.methods_incorporate_instance_method( $sym140$RESPORATOR_LEARN, $sym0$SEMTRANS_LEXICON, $list34, $list141, $list142 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym140$RESPORATOR_LEARN, $sym144$SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym145$RESPORATOR___LEARN, $sym0$SEMTRANS_LEXICON, $list34, $list141, $list146 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym145$RESPORATOR___LEARN, $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym148$STANFORD_NER_LEARN, $sym0$SEMTRANS_LEXICON, $list34, $list141, $list149 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym148$STANFORD_NER_LEARN, $sym151$SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym152$STANFORD_NER_LEARN_TIGHTENED_TYPES, $sym0$SEMTRANS_LEXICON, $list34, $list141, $list153 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym152$STANFORD_NER_LEARN_TIGHTENED_TYPES, $sym154$SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD );
    methods.methods_incorporate_instance_method( $sym150$STANFORD_NER_LEARN_INT, $sym0$SEMTRANS_LEXICON, $list34, $list155, $list156 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym150$STANFORD_NER_LEARN_INT, $sym169$SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym170$NUMBER_LEARN, $sym0$SEMTRANS_LEXICON, $list34, $list141, $list171 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym170$NUMBER_LEARN, $sym174$SEMTRANS_LEXICON_NUMBER_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD, $sym0$SEMTRANS_LEXICON, $list34, $list108, $list178 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD, $sym187$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD );
    methods.methods_incorporate_instance_method( $sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME, $sym0$SEMTRANS_LEXICON, $list34, $list108, $list188 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME, $sym189$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, $sym0$SEMTRANS_LEXICON, $list34, $list190, $list191 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME );
    methods.methods_incorporate_instance_method( $sym195$CREATE_LEX_ENTRIES_NUMBER, $sym0$SEMTRANS_LEXICON, $list34, $list196, $list197 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym195$CREATE_LEX_ENTRIES_NUMBER, $sym198$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym199$NOUN_COMPOUND_LEARN, $sym0$SEMTRANS_LEXICON, $list34, $list141, $list200 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym199$NOUN_COMPOUND_LEARN, $sym201$SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD );
    methods.methods_incorporate_instance_method( $sym206$COOCCURRENCE_STATISTICS_LEARN, $sym0$SEMTRANS_LEXICON, $list34, $list141, $list207 );
    methods.subloop_register_instance_method( $sym0$SEMTRANS_LEXICON, $sym206$COOCCURRENCE_STATISTICS_LEARN, $sym215$SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD );
    return NIL;
  }

  private static SubLObject _constant_156_initializer()
  {
    return ConsesLow.list( makeString( "@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of semtrans lexical entries learned from TEXT" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "TEXT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-LEXES" ), NIL ), ConsesLow.list( makeSymbol( "SNER" ),
            ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STANFORD-NER" ) ) ) ), ConsesLow.list( makeSymbol( "ENTITY-CLUSTERS" ), ConsesLow.list( makeSymbol(
                "FIM" ), makeSymbol( "SNER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RUN" ) ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "TERM-LEXICON" ), ConsesLow.list( makeSymbol( "FIM" ),
                    makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-TERM-LEXICON" ) ) ) ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list(
                        makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "EC" ), makeSymbol( "ENTITY-CLUSTERS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                            makeSymbol( "NAMENT" ), makeSymbol( "EC" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-LEXICON" ) ), makeSymbol(
                                "TERM-LEXICON" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQL, ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "O" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                    makeSymbol( "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                        "TYPE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CYC" ) ) ) ), ConsesLow.list( makeSymbol(
                                            "SUBTYPES" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "TIGHTEN-TYPES?" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeSymbol(
                                                "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TIGHTEN-TYPE" ) ) ) ) ) ), ConsesLow.list(
                                                    makeSymbol( "INSTANCE-MEANINGS" ), ConsesLow.list( makeSymbol( "GET-NAMENT-INSTANCE-MEANING" ), makeSymbol( "NAMENT" ) ) ), ConsesLow.list( makeSymbol( "STRING" ),
                                                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NAMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol(
                                                            "EXISTING-ENTRIES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TERM-LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                                                                makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "ENTITY-LEXES" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "INSTANCE-MEANINGS" ),
                                                                    ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "INSTANCE-MEANING" ), makeSymbol( "INSTANCE-MEANINGS" ) ), ConsesLow.list(
                                                                        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list(
                                                                            makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                                                                makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                    makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list(
                                                                                        makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "NOUN" ), makeSymbol(
                                                                                            "INSTANCE-MEANING" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                    "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol(
                                                                                                        "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
                                                                                                            .list( constant_handles.reader_make_constant_shell( makeString( "pnNonPlural-Generic" ) ) ) ) ), ConsesLow.list(
                                                                                                                makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?" ),
                                                                                                                    makeSymbol( "EXISTING-ENTRIES" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                                                                                                                        .list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list(
                                                                                                                            makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "ENTITY-LEXES" ) ) ) ) ),
                                                                    ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SUBTYPE" ), makeSymbol( "SUBTYPES" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                                                                        ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
                                                                            "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol(
                                                                                "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                                    "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol(
                                                                                        "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
                                                                                            constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), makeSymbol( "SUBTYPE" ) ), ConsesLow
                                                                                                .list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword(
                                                                                                    "NOUN" ), makeSymbol( "STRING" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                                                                                        makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell(
                                                                                                            makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow
                                                                                                                .list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list(
                                                                                                                    makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                        "pnNonPlural-Generic" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list(
                                                                                                                            makeSymbol( "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?" ), makeSymbol( "EXISTING-ENTRIES" ) ),
                                                                                                                            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                                                                                                                "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                    "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "ENTITY-LEXES" ) ) ) ) ) ), ConsesLow
                                                                                                                                        .list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol(
                                                                                                                                            "ENTITY-LEXES" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
                                                                                                                                                "TYPE" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                                                                                                                                    ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol(
                                                                                                                                                        "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                                                                            makeSymbol( "LEX-ENTRY" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                "EXISTING-ENTRIES" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                                                                                                    makeSymbol( "TERM-LEXICON" ), ConsesLow.list(
                                                                                                                                                                        makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                                                                                                                                                                    makeSymbol( "STRING" ) ) ) ), ConsesLow.list(
                                                                                                                                                                        makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ),
                                                                                                                                                                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                                                                            "SET" ) ), makeKeyword( "STRING" ), makeSymbol(
                                                                                                                                                                                "STRING" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                                    "FIM" ), makeSymbol( "LEX-ENTRY" ),
                                                                                                                                                                                    ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                                                                                                        makeSymbol( "SET" ) ), makeKeyword(
                                                                                                                                                                                            "SEMTRANS" ), ConsesLow.list(
                                                                                                                                                                                                makeSymbol( "BQ-LIST" ),
                                                                                                                                                                                                constant_handles
                                                                                                                                                                                                    .reader_make_constant_shell(
                                                                                                                                                                                                        makeString(
                                                                                                                                                                                                            "and" ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "BQ-LIST" ),
                                                                                                                                                                                                    constant_handles
                                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                                            makeString(
                                                                                                                                                                                                                "isa" ) ),
                                                                                                                                                                                                    makeKeyword( "NOUN" ),
                                                                                                                                                                                                    makeSymbol( "TYPE" ) ),
                                                                                                                                                                                                ConsesLow.list( makeSymbol(
                                                                                                                                                                                                    "BQ-LIST" ),
                                                                                                                                                                                                    constant_handles
                                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                                            makeString(
                                                                                                                                                                                                                "nameString" ) ),
                                                                                                                                                                                                    makeKeyword( "NOUN" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "STRING" ) ) ) ),
                                                                                                                                                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ),
                                                                                                                                                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                                                                                                                                                        makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell(
                                                                                                                                                            makeString( "RegularNounFrame" ) ) ), ConsesLow.list(
                                                                                                                                                                makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow
                                                                                                                                                                    .list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                                                                                                                                                                makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol(
                                                                                                                                                                    "QUOTE" ), ConsesLow.list( constant_handles
                                                                                                                                                                        .reader_make_constant_shell( makeString(
                                                                                                                                                                            "pnNonPlural-Generic" ) ) ) ) ), ConsesLow.list(
                                                                                                                                                                                makeSymbol( "PUNLESS" ), ConsesLow.list(
                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                        "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?" ),
                                                                                                                                                                                    makeSymbol( "EXISTING-ENTRIES" ) ),
                                                                                                                                                                                ConsesLow.list( makeSymbol( "FIM" ),
                                                                                                                                                                                    makeSymbol( "SELF" ), ConsesLow.list(
                                                                                                                                                                                        makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                                                                                            "ADD" ) ), makeSymbol(
                                                                                                                                                                                                "LEX-ENTRY" ) ), ConsesLow
                                                                                                                                                                                                    .list( makeSymbol(
                                                                                                                                                                                                        "CPUSH" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "LEX-ENTRY" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "ENTITY-LEXES" ) ) ) ) ),
                                        ConsesLow.list( makeSymbol( "CPUSH-ALL" ), makeSymbol( "ENTITY-LEXES" ), makeSymbol( "NEW-LEXES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ),
                                            ConsesLow.list( makeSymbol( "WARN" ), makeString( "~%~S" ), makeSymbol( "ERROR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-LEXES" ) ) ) );
  }

  @Override
  public void declareFunctions()
  {
    declare_semtrans_lexicon_file();
  }

  @Override
  public void initializeVariables()
  {
    init_semtrans_lexicon_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_semtrans_lexicon_file();
  }
  static
  {
    me = new semtrans_lexicon();
    $manufacture_semtrans_assertionsP$ = null;
    $semtrans_lexicon$ = null;
    $default_verbal_lex_entry_literals$ = null;
    $semtrans_lexicon_learners$ = null;
    $sym0$SEMTRANS_LEXICON = makeSymbol( "SEMTRANS-LEXICON" );
    $sym1$ABSTRACT_LEXICON = makeSymbol( "ABSTRACT-LEXICON" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEFAULT-KB-SPEC" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), constant_handles.reader_make_constant_shell(
        makeString( "SemTransLexiconSpecification" ) ) ), ConsesLow.list( makeSymbol( "MY-TERM-LEXICON" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), NIL ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE-VERBAL" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE-NOMINAL" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE-ADJECTIVAL" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE-ADVERBIAL" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE-VERBAL-SEMTRANS" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
          makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE-NOMINAL-SEMTRANS" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES" ), ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol( "KEYWORDS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                  "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-LEX-ENTRIES" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                      "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-WORD" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                          makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-NAME" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ), makeKeyword(
          "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RESPORATOR-TO-LEX-ENTRIES" ), ConsesLow.list( makeSymbol( "TYPE.STRING" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
              makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TERM-LEXICON" ), NIL, makeKeyword(
                  "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-TERM-LEXICON" ), ConsesLow.list( makeSymbol( "TERM-LEXICON" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                      makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "TEXTRACT-LEMMA-TO-LEX-ENTRY" ), ConsesLow.list( makeSymbol( "LEMMA" ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym3$MY_TERM_LEXICON = makeSymbol( "MY-TERM-LEXICON" );
    $sym4$OBJECT = makeSymbol( "OBJECT" );
    $sym5$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym6$DEFAULT_EXCLUDE_MTS = makeSymbol( "DEFAULT-EXCLUDE-MTS" );
    $list7 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "WebSearchDataMt" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "RelationParaphraseMt" ) ), constant_handles.reader_make_constant_shell( makeString( "WordNetMappingMt" ) ), constant_handles.reader_make_constant_shell( makeString(
            "PornographyJargonMt" ) ), constant_handles.reader_make_constant_shell( makeString( "CommonEnglishMisspellingsMt" ) ), constant_handles.reader_make_constant_shell( makeString( "ComputereseLexicalMt" ) ),
      constant_handles.reader_make_constant_shell( makeString( "CyclishMt" ) ), constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalAssertionsMt" ) ), constant_handles.reader_make_constant_shell(
          makeString( "EnglishWordSenseAssertions-HoldingMt" ) ), constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalAssertions-WordNetImportMt" ) ), constant_handles.reader_make_constant_shell(
              makeString( "RedundantLexicalMt" ) ), constant_handles.reader_make_constant_shell( makeString( "PDATemplateTestMt" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SupplementalDeterminerSemTransLexicalMt" ) )
    } );
    $sym8$DEFAULT_EXCLUDE_PREDICATES = makeSymbol( "DEFAULT-EXCLUDE-PREDICATES" );
    $sym9$DEFAULT_BASE_MT = makeSymbol( "DEFAULT-BASE-MT" );
    $const10$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell( makeString( "AllGeneralEnglishValidatedLexicalMicrotheoryPSC" ) );
    $sym11$DEFAULT_KB_SPEC = makeSymbol( "DEFAULT-KB-SPEC" );
    $const12$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell( makeString( "AbstractLexiconSpecification" ) );
    $sym13$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$ALLOWED_MTS = makeSymbol( "ALLOWED-MTS" );
    $kw17$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym18$EXCLUDED_MTS = makeSymbol( "EXCLUDED-MTS" );
    $sym19$BASE_MT = makeSymbol( "BASE-MT" );
    $sym20$ROOT_MT = makeSymbol( "ROOT-MT" );
    $sym21$EXCLUDED_PREDS = makeSymbol( "EXCLUDED-PREDS" );
    $sym22$EXCLUDED_POS_LIST = makeSymbol( "EXCLUDED-POS-LIST" );
    $sym23$TRIE = makeSymbol( "TRIE" );
    $sym24$CACHE = makeSymbol( "CACHE" );
    $sym25$IGNORE_CACHE_ = makeSymbol( "IGNORE-CACHE?" );
    $sym26$CASE_SENSITIVITY = makeSymbol( "CASE-SENSITIVITY" );
    $sym27$ALLOW_FABRICATION_ = makeSymbol( "ALLOW-FABRICATION?" );
    $sym28$LEARNED = makeSymbol( "LEARNED" );
    $sym29$ACTIVE_LEARNERS = makeSymbol( "ACTIVE-LEARNERS" );
    $sym30$ALLOW_STEMMING = makeSymbol( "ALLOW-STEMMING" );
    $sym31$STOP_WORDS = makeSymbol( "STOP-WORDS" );
    $sym32$SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE" );
    $sym33$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list34 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list35 = ConsesLow.list( makeString( "Initializes this semtrans lexicon" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "EXCLUDE-PREDICATE" ) ), constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EXCLUDE-PREDICATE" ) ), constant_handles.reader_make_constant_shell( makeString( "denotationPlaceholder" ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EXCLUDE-PREDICATE" ) ), constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym36$EXCLUDE_PREDICATE = makeSymbol( "EXCLUDE-PREDICATE" );
    $const37$preferredNameString = constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) );
    $const38$denotationPlaceholder = constant_handles.reader_make_constant_shell( makeString( "denotationPlaceholder" ) );
    $const39$denotationRelatedTo = constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) );
    $sym40$SEMTRANS_LEXICON_INITIALIZE_METHOD = makeSymbol( "SEMTRANS-LEXICON-INITIALIZE-METHOD" );
    $sym41$GET_TERM_LEXICON = makeSymbol( "GET-TERM-LEXICON" );
    $list42 = ConsesLow.list( makeString( "Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "MY-TERM-LEXICON" ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MY-TERM-LEXICON" ), ConsesLow.list( makeSymbol( "NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "MY-TERM-LEXICON" ) ) );
    $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD" );
    $sym44$SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD = makeSymbol( "SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD" );
    $sym45$SEMTRANS_LEXICON_P = makeSymbol( "SEMTRANS-LEXICON-P" );
    $sym46$COPY = makeSymbol( "COPY" );
    $sym47$SET_TERM_LEXICON = makeSymbol( "SET-TERM-LEXICON" );
    $list48 = ConsesLow.list( makeSymbol( "LEXICON" ) );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MY-TERM-LEXICON" ), makeSymbol( "LEXICON" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD" );
    $sym51$SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD = makeSymbol( "SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD" );
    $sym52$FABRICATE = makeSymbol( "FABRICATE" );
    $list53 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list54 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) );
    $list55 = ConsesLow.list( makeString(
        "@param STRING stringp; the string for which to fabricate some lex entries\n   @param KEYWORDS listp; the syntactic dependents of STRING\n   @param PENN keywordp; the part-of-speech tag of STRING\n   @return listp; a list of lexical entries for word STRING with dependents KEYWORDS \n   and part-of-speech tag PENN" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "KEYWORDS" ), makeSymbol( "LISTP" ) ), ConsesLow.list(
            makeSymbol( "CHECK-TYPE" ), makeSymbol( "PENN" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CNOT" ),
                makeSymbol( "ALLOW-FABRICATION?" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeSymbol( "NOMINAL-PENN-TAG" ), makeSymbol( "PENN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                    .list( makeSymbol( "QUOTE" ), makeSymbol( "FABRICATE-NOMINAL" ) ), makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "VERBAL-PENN-TAG" ), makeSymbol( "PENN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FABRICATE-VERBAL" ) ), makeSymbol(
                            "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "ADJECTIVAL-PENN-TAG" ), makeSymbol( "PENN" ) ), ConsesLow.list( makeSymbol(
                                "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FABRICATE-ADJECTIVAL" ) ), makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ) ),
                ConsesLow.list( ConsesLow.list( makeSymbol( "ADVERBIAL-PENN-TAG" ), makeSymbol( "PENN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "FABRICATE-ADVERBIAL" ) ), makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ) ), ConsesLow.list( T, NIL ) ) ) );
    $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD" );
    $sym57$STRINGP = makeSymbol( "STRINGP" );
    $sym58$LISTP = makeSymbol( "LISTP" );
    $sym59$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym60$FABRICATE_NOMINAL = makeSymbol( "FABRICATE-NOMINAL" );
    $sym61$FABRICATE_VERBAL = makeSymbol( "FABRICATE-VERBAL" );
    $sym62$FABRICATE_ADJECTIVAL = makeSymbol( "FABRICATE-ADJECTIVAL" );
    $sym63$FABRICATE_ADVERBIAL = makeSymbol( "FABRICATE-ADVERBIAL" );
    $sym64$SEMTRANS_LEXICON_FABRICATE_METHOD = makeSymbol( "SEMTRANS-LEXICON-FABRICATE-METHOD" );
    $list65 = ConsesLow.list( makeString(
        "@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the noun frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "KEYWORDS" ), makeSymbol( "LISTP" ) ), ConsesLow.list(
            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PENN-TAGS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "PENN" ) ) ), ConsesLow.list( makeSymbol(
                    "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "FABRICATE-NOMINAL-SEMTRANS" ) ), makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                            "LIST" ), makeSymbol( "LEX" ) ) ) ) );
    $sym66$LEX_ENTRY = makeSymbol( "LEX-ENTRY" );
    $sym67$SET = makeSymbol( "SET" );
    $kw68$STRING = makeKeyword( "STRING" );
    $kw69$PENN_TAGS = makeKeyword( "PENN-TAGS" );
    $kw70$SEMTRANS = makeKeyword( "SEMTRANS" );
    $sym71$FABRICATE_NOMINAL_SEMTRANS = makeSymbol( "FABRICATE-NOMINAL-SEMTRANS" );
    $sym72$SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD = makeSymbol( "SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD" );
    $list73 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ) );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "LITERALS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "KEYWORD" ), makeSymbol(
        "KEYWORDS" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "KEYWORD" ), ConsesLow.list( makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
            constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString(
                "ThingDescribableAsFn" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "WordFn" ) ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) ) ) ) ), makeSymbol( "LITERALS" ) ) ), ConsesLow.list( makeKeyword( "POSSESSOR" ), ConsesLow.list( makeSymbol(
                        "CPUSH" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "possessiveRelation" ) ), makeKeyword( "POSSESSOR" ), makeKeyword(
                            "NOUN" ) ) ), makeSymbol( "LITERALS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CONJOIN" ), makeSymbol( "LITERALS" ) ) ) ) );
    $kw75$NOUN = makeKeyword( "NOUN" );
    $const76$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const77$ThingDescribableAsFn = constant_handles.reader_make_constant_shell( makeString( "ThingDescribableAsFn" ) );
    $const78$WordFn = constant_handles.reader_make_constant_shell( makeString( "WordFn" ) );
    $list79 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) );
    $kw80$POSSESSOR = makeKeyword( "POSSESSOR" );
    $list81 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "possessiveRelation" ) ), makeKeyword( "POSSESSOR" ), makeKeyword( "NOUN" ) );
    $sym82$SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD = makeSymbol( "SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD" );
    $list83 = ConsesLow.list( makeString(
        "@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the verb frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS" ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "KEYWORDS" ), makeSymbol( "LISTP" ) ), ConsesLow.list(
            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEXES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FABRICATE-VERBAL-SEMTRANS" ) ), makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                    ConsesLow.list( ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list(
                        makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                            makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PENN-TAGS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "PENN" ) ) ), ConsesLow.list(
                                makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), makeSymbol( "SEMTRANS" ) ), ConsesLow.list( makeSymbol(
                                    "CPUSH" ), makeSymbol( "LEX" ), makeSymbol( "LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym84$FABRICATE_VERBAL_SEMTRANS = makeSymbol( "FABRICATE-VERBAL-SEMTRANS" );
    $sym85$SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD = makeSymbol( "SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD" );
    $list86 = ConsesLow.list( makeString( "@return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
        makeKeyword( "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SEMTRANSES" ), NIL ) ),
            ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ENTRY" ), ConsesLow.list( makeSymbol( "NL-TRIE-SEARCH" ), makeSymbol( "STRING" ), makeSymbol( "TRIE" ), makeSymbol(
                "CASE-SENSITIVITY" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES" ) ), makeSymbol( "ENTRY" ), makeSymbol( "KEYWORDS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "SEMTRANS" ), makeSymbol(
                        "SEMTRANSES" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SEMTRANSES" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "KEYWORD-LITERAL" ), ConsesLow.list(
                            makeSymbol( "LITERALS" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
                                "ACTION" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString( "ThingDescribableAsFn" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
                                    constant_handles.reader_make_constant_shell( makeString( "WordFn" ) ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "Verb" ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "KEYWORD" ), makeSymbol( "KEYWORDS" ) ),
                                            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "KEYWORD-LITERAL" ), ConsesLow.list( makeSymbol( "KEYWORD-TO-SEMTRANS-LITERAL" ), makeSymbol( "KEYWORD" ) ) ), ConsesLow
                                                .list( makeSymbol( "PWHEN" ), makeSymbol( "KEYWORD-LITERAL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "KEYWORD-LITERAL" ), makeSymbol( "LITERALS" ) ) ) ),
                            ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LITERALS" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "CONJOIN" ), makeSymbol( "LITERALS" ) ), makeSymbol(
                                "SEMTRANSES" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SEMTRANSES" ) ) ) ) );
    $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD" );
    $kw88$ACTION = makeKeyword( "ACTION" );
    $sym89$NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES = makeSymbol( "NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES" );
    $list90 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) );
    $sym91$SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD = makeSymbol( "SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD" );
    $list92 = ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol( "KEYWORDS" ) );
    $list93 = ConsesLow.list( makeString( "@return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots \n   for each syntactic relation keyword in KEYWORDS" ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SEMTRANSES" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-P" ),
            makeSymbol( "ENTRY" ) ), ConsesLow.list( makeSymbol( "MEMBER" ), makeKeyword( "ACTION" ), makeSymbol( "KEYWORDS" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-DENOTS" ), makeSymbol( "ENTRY" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                    "DENOT-TO-VERBAL-SEMTRANS" ), makeSymbol( "DENOT" ), makeSymbol( "KEYWORDS" ) ), makeSymbol( "SEMTRANSES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SEMTRANSES" ) ) ) );
    $sym94$SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD = makeSymbol( "SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD" );
    $list95 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "AllEnglishValidatedLexicalMicrotheoryPSC" ) ),
        constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) ) );
    $const96$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw97$SUBJECT = makeKeyword( "SUBJECT" );
    $kw98$OBJECT = makeKeyword( "OBJECT" );
    $kw99$OBLIQUE_OBJECT = makeKeyword( "OBLIQUE-OBJECT" );
    $list100 = ConsesLow.list( ConsesLow.list( makeKeyword( "ACTION" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ACTION" ), constant_handles.reader_make_constant_shell(
        makeString( "Situation" ) ) ), ConsesLow.list( makeKeyword( "SUBJECT" ), constant_handles.reader_make_constant_shell( makeString( "doneBy" ) ), makeKeyword( "ACTION" ), makeKeyword( "SUBJECT" ) ), ConsesLow.list(
            makeKeyword( "OBJECT" ), constant_handles.reader_make_constant_shell( makeString( "patient-Generic" ) ), makeKeyword( "ACTION" ), makeKeyword( "OBJECT" ) ), ConsesLow.list( makeKeyword( "OBLIQUE-OBJECT" ),
                constant_handles.reader_make_constant_shell( makeString( "to-UnderspecifiedLocation" ) ), makeKeyword( "ACTION" ), makeKeyword( "OBLIQUE-OBJECT" ) ), ConsesLow.list( makeKeyword( "CLAUSE" ),
                    constant_handles.reader_make_constant_shell( makeString( "awareOfProp" ) ), makeKeyword( "SUBJECT" ), makeKeyword( "CLAUSE" ) ) );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "KEYWORDS" ), makeSymbol( "LISTP" ) ),
        ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "KEYWORDS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword(
                "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PENN-TAGS" ), ConsesLow.list(
                    makeSymbol( "LIST" ), makeSymbol( "PENN" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ),
                        ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles
                            .reader_make_constant_shell( makeString( "ThingDescribableAsFn" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "WordFn" ) ), makeSymbol(
                                "STRING" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                    "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "LEX" ) ) ) ) );
    $list102 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ) );
    $sym103$SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD = makeSymbol( "SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "KEYWORDS" ), makeSymbol( "LISTP" ) ),
        ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "KEYWORDS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword(
                "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PENN-TAGS" ), ConsesLow.list(
                    makeSymbol( "LIST" ), makeSymbol( "PENN" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ),
                        ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ACTION" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles
                            .reader_make_constant_shell( makeString( "ThingDescribableAsFn" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "WordFn" ) ), makeSymbol(
                                "STRING" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adverb" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                    ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "LEX" ) ) ) ) );
    $list105 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adverb" ) ) );
    $sym106$SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD = makeSymbol( "SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD" );
    $sym107$CREATE_LEX_ENTRIES = makeSymbol( "CREATE-LEX-ENTRIES" );
    $list108 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) );
    $list109 = ConsesLow.list( makeString(
        "@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY" ),
        ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NL-TRIE-WORD-P" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ),
            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-WORD" ) ), makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( ConsesLow.list(
                makeSymbol( "NL-TRIE-NAME-P" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-NAME" ) ), makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "NL-TRIE-TERM-PHRASES-ENTRY-P" ),
                        makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY" ) ), makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY-P" ), makeSymbol(
                                "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NL-TRIE-ENTRY" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "COPY" ) ) ) ) ) ) ) );
    $sym110$CREATE_LEX_ENTRIES_NL_TRIE_WORD = makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-WORD" );
    $sym111$CREATE_LEX_ENTRIES_NL_TRIE_NAME = makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-NAME" );
    $sym112$CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY = makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY" );
    $sym113$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD = makeSymbol( "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD" );
    $sym114$TEXTRACT_LEMMA_TO_LEX_ENTRY = makeSymbol( "TEXTRACT-LEMMA-TO-LEX-ENTRY" );
    $list115 = ConsesLow.list( makeSymbol( "LEMMA" ) );
    $list116 = ConsesLow.list( makeString( "@param LEMMA textract-lemma-p\n   @return lex-entry-p or nil; the lex entry equivalent of LEMMA,\n   or nil if one can't be obtained" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( new SubLObject[]
        { makeSymbol( "PCASE" ), ConsesLow.list( makeSymbol( "TEXTRACT-LEMMA-TYPE" ), makeSymbol( "LEMMA" ) ), ConsesLow.list( makeKeyword( "PERSON" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCL" ),
            ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "isa" ) ), makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles
                    .reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "TEXTRACT-LEMMA-STRING" ), makeSymbol( "LEMMA" ) ) ) ) ) ), ConsesLow.list( makeKeyword(
                        "PERSON?" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow
                            .list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell(
                                makeString( "Person" ) ) ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword( "NOUN" ), ConsesLow.list(
                                    makeSymbol( "TEXTRACT-LEMMA-STRING" ), makeSymbol( "LEMMA" ) ) ) ) ) ), ConsesLow.list( makeKeyword( "PLACE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCL" ), ConsesLow
                                        .list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) ) ), ConsesLow.list( makeSymbol(
                                                "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "TEXTRACT-LEMMA-STRING" ),
                                                    makeSymbol( "LEMMA" ) ) ) ) ) ), ConsesLow.list( makeKeyword( "PLACE?" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol(
                                                        "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles
                                                            .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) ) ), ConsesLow
                                                                .list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword( "NOUN" ), ConsesLow.list(
                                                                    makeSymbol( "TEXTRACT-LEMMA-STRING" ), makeSymbol( "LEMMA" ) ) ) ) ) ), ConsesLow.list( makeKeyword( "ORG" ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                        makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                            makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ),
                                                                                constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles
                                                                                    .reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "TEXTRACT-LEMMA-STRING" ),
                                                                                        makeSymbol( "LEMMA" ) ) ) ) ) ), ConsesLow.list( makeKeyword( "UNAME" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                                            "CYCL" ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString( "nameString" ) ),
                                                                                                makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "TEXTRACT-LEMMA-STRING" ), makeSymbol( "LEMMA" ) ) ) ) ), ConsesLow.list(
                                                                                                    makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCL" ), NIL ) )
        } ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword(
                "CYC-POS" ), constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "CYCL" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                        "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) ) ), ConsesLow
                            .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), ConsesLow.list( makeSymbol(
                                "TEXTRACT-LEMMA-STRING" ), makeSymbol( "LEMMA" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRY" ) ) ) );
    $kw117$PERSON = makeKeyword( "PERSON" );
    $const118$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list119 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ) );
    $const120$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $kw121$PERSON_ = makeKeyword( "PERSON?" );
    $kw122$PLACE = makeKeyword( "PLACE" );
    $list123 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) );
    $kw124$PLACE_ = makeKeyword( "PLACE?" );
    $kw125$ORG = makeKeyword( "ORG" );
    $list126 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) );
    $kw127$UNAME = makeKeyword( "UNAME" );
    $kw128$CYC_POS = makeKeyword( "CYC-POS" );
    $const129$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $kw130$FRAME = makeKeyword( "FRAME" );
    $const131$RegularNounFrame = constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) );
    $sym132$SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD = makeSymbol( "SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD" );
    $sym133$RESPORATOR_TO_LEX_ENTRIES = makeSymbol( "RESPORATOR-TO-LEX-ENTRIES" );
    $list134 = ConsesLow.list( makeSymbol( "TYPE.STRING" ) );
    $list135 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRIES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PARSE" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RESPORATOR-TO-CYCL" ) ), makeSymbol( "TYPE.STRING" ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
            ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list(
                makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TYPE.STRING" ) ) ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), constant_handles.reader_make_constant_shell( makeString(
                "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol(
                    "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                        makeKeyword( "NOUN" ), makeSymbol( "PARSE" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword( "NOUN" ), ConsesLow
                            .list( makeSymbol( "CDR" ), makeSymbol( "TYPE.STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                                makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "ABSTRACT-LEXICON" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RESPORATOR-TO-INFLECTIONS" ) ), makeSymbol( "TYPE.STRING" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                            makeSymbol( "LEX-ENTRY" ), makeSymbol( "LEX-ENTRIES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRIES" ) ) ) );
    $kw136$INFLECTIONS = makeKeyword( "INFLECTIONS" );
    $sym137$RESPORATOR_TO_INFLECTIONS = makeSymbol( "RESPORATOR-TO-INFLECTIONS" );
    $sym138$RESPORATOR_TO_CYCL = makeSymbol( "RESPORATOR-TO-CYCL" );
    $sym139$SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD = makeSymbol( "SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD" );
    $sym140$RESPORATOR_LEARN = makeSymbol( "RESPORATOR-LEARN" );
    $list141 = ConsesLow.list( makeSymbol( "TEXT" ) );
    $list142 = ConsesLow.list( makeString( "@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ),
        makeSymbol( "TEXT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEXES" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN-FEATURE" ), makeKeyword(
            "CYC-QUIRK" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "TYPINGS" ), makeSymbol( "ERROR?" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol(
                "ERROR?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TYPINGS" ), ConsesLow.list( makeSymbol( "RESPORATOR" ), makeSymbol( "TEXT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                    "ERROR?" ), ConsesLow.list( makeSymbol( "WARN" ), makeSymbol( "ERROR?" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                        "TYPE.STRING" ), makeSymbol( "TYPINGS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "RESPORATOR-TO-LEX-ENTRIES" ) ), makeSymbol( "TYPE.STRING" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX" ), makeSymbol(
                                "LEXES" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym143$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym144$SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD = makeSymbol( "SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD" );
    $sym145$RESPORATOR___LEARN = makeSymbol( "RESPORATOR++-LEARN" );
    $list146 = ConsesLow.list( makeString(
        "@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   @note this is a 'lazy' variation of resporator that attempts to discover\n   shorter strings of type PERSON that exclude additional information like \n   'French Prime Minister' from the string 'French Prime Minister Jacques Chirac'\n   and just returns 'Jacques Chirac'." ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TEXT" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEXES" ), NIL ) ), ConsesLow.list(
            makeSymbol( "PWHEN-FEATURE" ), makeKeyword( "CYC-QUIRK" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "TYPINGS" ), makeSymbol( "ERROR?" ) ), ConsesLow.list( makeSymbol(
                "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "ERROR?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TYPINGS" ), ConsesLow.list( makeSymbol( "RESPORATOR++" ), makeSymbol( "TEXT" ) ) ) ),
                ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR?" ), ConsesLow.list( makeSymbol( "WARN" ), makeSymbol( "ERROR?" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol(
                    "CDOLIST" ), ConsesLow.list( makeSymbol( "TYPE.STRING" ), makeSymbol( "TYPINGS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "FIM" ),
                        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RESPORATOR-TO-LEX-ENTRIES" ) ), makeSymbol( "TYPE.STRING" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                            "LEX" ), makeSymbol( "LEXES" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD = makeSymbol( "SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD" );
    $sym148$STANFORD_NER_LEARN = makeSymbol( "STANFORD-NER-LEARN" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STANFORD-NER-LEARN-INT" ) ), makeSymbol(
        "TEXT" ), NIL ) ) );
    $sym150$STANFORD_NER_LEARN_INT = makeSymbol( "STANFORD-NER-LEARN-INT" );
    $sym151$SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD = makeSymbol( "SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD" );
    $sym152$STANFORD_NER_LEARN_TIGHTENED_TYPES = makeSymbol( "STANFORD-NER-LEARN-TIGHTENED-TYPES" );
    $list153 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STANFORD-NER-LEARN-INT" ) ), makeSymbol(
        "TEXT" ), T ) ) );
    $sym154$SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD = makeSymbol( "SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD" );
    $list155 = ConsesLow.list( makeSymbol( "TEXT" ), makeSymbol( "TIGHTEN-TYPES?" ) );
    $list156 = _constant_156_initializer();
    $sym157$STANFORD_NER = makeSymbol( "STANFORD-NER" );
    $sym158$RUN = makeSymbol( "RUN" );
    $sym159$SET_LEXICON = makeSymbol( "SET-LEXICON" );
    $sym160$O = makeSymbol( "O" );
    $sym161$GET_TYPE = makeSymbol( "GET-TYPE" );
    $sym162$GET_CYC = makeSymbol( "GET-CYC" );
    $sym163$TIGHTEN_TYPE = makeSymbol( "TIGHTEN-TYPE" );
    $sym164$GET_STRING = makeSymbol( "GET-STRING" );
    $sym165$GET = makeSymbol( "GET" );
    $list166 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pnNonPlural-Generic" ) ) );
    $sym167$ADD = makeSymbol( "ADD" );
    $str168$___S = makeString( "~%~S" );
    $sym169$SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD = makeSymbol( "SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD" );
    $sym170$NUMBER_LEARN = makeSymbol( "NUMBER-LEARN" );
    $list171 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NUMBERS" ), ConsesLow.list( makeSymbol( "NUMBER-MEANINGS" ), makeSymbol( "TEXT" ) ) ), ConsesLow.list(
        makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "NUMBER" ), makeSymbol( "NUMBERS" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list(
            makeSymbol( "NUMBER-STRING" ), makeSymbol( "MEANING" ) ), makeSymbol( "NUMBER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "KNOWN-ENTRIES" ), ConsesLow.list(
                makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeSymbol( "NUMBER-STRING" ) ) ), ConsesLow.list( makeSymbol( "ALREADY-KNOWN" ), ConsesLow.list(
                    makeSymbol( "MEMBER?" ), makeSymbol( "MEANING" ), makeSymbol( "KNOWN-ENTRIES" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEX-ENTRY-SEMTRANS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "ALREADY-KNOWN" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                            "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NUMBER-SEMTRANS-LEX-ENTRY" ), makeSymbol( "NUMBER-STRING" ), makeSymbol( "MEANING" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "LEX-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol(
                                    "RESULT" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $list172 = ConsesLow.list( makeSymbol( "NUMBER-STRING" ), makeSymbol( "MEANING" ) );
    $sym173$LEX_ENTRY_SEMTRANS = makeSymbol( "LEX-ENTRY-SEMTRANS" );
    $sym174$SEMTRANS_LEXICON_NUMBER_LEARN_METHOD = makeSymbol( "SEMTRANS-LEXICON-NUMBER-LEARN-METHOD" );
    $list175 = ConsesLow.list( makeKeyword( "CD" ) );
    $const176$Number_SP = constant_handles.reader_make_constant_shell( makeString( "Number-SP" ) );
    $list177 = ConsesLow.list( makeSymbol( "STANFORD-NER-LEARN" ), makeSymbol( "RESPORATOR++-LEARN" ), makeSymbol( "NUMBER-LEARN" ) );
    $list178 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRIES" ), NIL ), ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol(
        "NL-TRIE-ENTRY-SEMANTIC-PRED" ), makeSymbol( "NL-TRIE-ENTRY" ), NIL ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SEMTRANS-PRED?" ), makeSymbol( "PRED" ) ), ConsesLow
            .list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-SEMTRANS-TEMPLATES" ), makeSymbol(
                "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( new SubLObject[]
                { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WU" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-WORD-UNIT" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "POS" ),
                    ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-POS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "FRAME" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-FRAME" ), makeSymbol(
                        "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "WU" ), ConsesLow.list( makeSymbol( "PPH-FILTER-PREDS" ), ConsesLow.list(
                            makeSymbol( "PREDS-OF-STRING&WORD" ), makeSymbol( "STRING" ), makeSymbol( "WU" ) ), ConsesLow.list( makeSymbol( "PREDS-OF-POS" ), makeSymbol( "POS" ) ) ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ), constant_handles.reader_make_constant_shell( makeString( "plural" ) ) ) ) ) ), ConsesLow
                                    .list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list(
                                        makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), makeSymbol( "POS" ) ), ConsesLow.list(
                                            makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), makeSymbol( "SEMTRANS" ) ), ConsesLow
                                                .list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), makeSymbol( "FRAME" ) ),
                  ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "WORD-UNIT" ), makeSymbol( "WU" ) ), ConsesLow.list(
                      makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                          makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), makeSymbol( "INFLECTIONS" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                              makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "TRIE-ENTRY" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                  makeSymbol( "LEX-ENTRY" ), makeSymbol( "LEX-ENTRIES" ) )
    } ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "*MANUFACTURE-SEMTRANS-ASSERTIONS?*" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "GENL-POS?" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-POS" ), makeSymbol( "NL-TRIE-ENTRY" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) ) ), ConsesLow.list( makeSymbol(
                "WITH-ALL-MTS" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-DENOTS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list(
                    makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "PREDICATE-P" ), makeSymbol( "DENOT" ) ), ConsesLow.list( new SubLObject[]
                    { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list(
                            makeSymbol( "NL-TRIE-WORD-POS-PREDS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "SET" ) ), makeKeyword( "CYC-POS" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-POS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ),
                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list(
                                        makeSymbol( "ISA-IN-ANY-MT?" ), makeSymbol( "DENOT" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), constant_handles.reader_make_constant_shell(
                                            makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ), makeSymbol(
                                                "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ),
                                                    constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                                        makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "WORD-UNIT" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-WORD-UNIT" ), makeSymbol( "NL-TRIE-ENTRY" ),
                                                            NIL ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ),
                                                                makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                                                                    makeKeyword( "TRIE-ENTRY" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol(
                                                                        "LEX-ENTRIES" ) )
                    } ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRIES" ) ) ) );
    $list179 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ), constant_handles.reader_make_constant_shell( makeString( "plural" ) ) );
    $kw180$WORD_UNIT = makeKeyword( "WORD-UNIT" );
    $kw181$TRIE_ENTRY = makeKeyword( "TRIE-ENTRY" );
    $list182 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) ) );
    $const183$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $sym184$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const185$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const186$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $sym187$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD = makeSymbol( "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD" );
    $list188 = ConsesLow.list( makeString(
        "@param STRING stringp; the string of the lex entries to be constructed\n   @param NL-TRIE-ENTRY; the nl trie entry out of which to construct a list of lex entries\n   @return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRIES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list(
            makeSymbol( "NL-TRIE-ENTRY-DENOTS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( new SubLObject[]
            { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ),
                ConsesLow.list( makeSymbol( "COLLECTION?" ), ConsesLow.list( makeSymbol( "COLLECTION-P" ), makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "COLLECTION?" ), constant_handles
                        .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ),
                            makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ),
                                constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                        "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "pnNonPlural-Generic" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol(
                                                    "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "TRIE-ENTRY" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ),
                                                        makeSymbol( "LEX-ENTRIES" ) )
        } ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRIES" ) ) ) );
    $sym189$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD = makeSymbol( "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD" );
    $list190 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "TP-ENTRY" ) );
    $list191 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRIES" ), NIL ), ConsesLow.list( makeSymbol( "POS" ), ConsesLow.list( makeSymbol(
        "NL-TRIE-ENTRY-POS" ), makeSymbol( "TP-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-POS-PREDS" ), makeSymbol( "TP-ENTRY" ) ) ), ConsesLow.list( makeSymbol(
            "PREDICATE" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-SEMANTIC-PRED" ), makeSymbol( "TP-ENTRY" ), NIL ) ), ConsesLow.list( makeSymbol( "PRAGMATICS" ), ConsesLow.list( makeSymbol(
                "NL-TRIE-ENTRY-PRAGMATICS" ), makeSymbol( "TP-ENTRY" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-DENOTS" ),
                    makeSymbol( "TP-ENTRY" ) ) ), ConsesLow.list( new SubLObject[]
                    { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEX-ENTRY" ) ) ) ), ConsesLow.list( makeSymbol( "COLLECTION?" ), ConsesLow.list( makeSymbol( "COLLECTION-P" ), makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                            "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PRAGMATICS" ), makeSymbol( "PRAGMATICS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIF" ),
                                    makeSymbol( "COLLECTION?" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ) ), makeKeyword(
                                        "NOUN" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ), makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol(
                                            "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "PREDICATE" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                                makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), makeSymbol( "POS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow
                                                    .list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ),
                                                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ), makeSymbol( "INFLECTIONS" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                                            makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "TRIE-ENTRY" ), makeSymbol( "TP-ENTRY" ) ), ConsesLow
                                                                .list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ), makeSymbol( "LEX-ENTRIES" ) )
    } ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRIES" ) ) ) );
    $kw192$PRAGMATICS = makeKeyword( "PRAGMATICS" );
    $kw193$PREDICATE = makeKeyword( "PREDICATE" );
    $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME = makeSymbol( "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD" );
    $sym195$CREATE_LEX_ENTRIES_NUMBER = makeSymbol( "CREATE-LEX-ENTRIES-NUMBER" );
    $list196 = ConsesLow.list( makeSymbol( "NUMBER-STRING" ) );
    $list197 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "NUMBER-STRING" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym198$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD = makeSymbol( "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD" );
    $sym199$NOUN_COMPOUND_LEARN = makeSymbol( "NOUN-COMPOUND-LEARN" );
    $list200 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES" ), makeSymbol( "TEXT" ) ) ) );
    $sym201$SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD = makeSymbol( "SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD" );
    $const202$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $list203 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) ) );
    $list204 = ConsesLow.list( makeKeyword( "NNS" ) );
    $list205 = ConsesLow.list( makeKeyword( "NN" ) );
    $sym206$COOCCURRENCE_STATISTICS_LEARN = makeSymbol( "COOCCURRENCE-STATISTICS-LEARN" );
    $list207 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "NEW-STANFORD-PARSER" ) ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ), makeSymbol( "TEXT" ) ) ), ConsesLow.list( makeSymbol( "WORDS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PARSE" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ) ), ConsesLow.list( makeSymbol( "LEXES" ), NIL ), ConsesLow.list( makeSymbol( "LEARNED-NOUNS" ),
                NIL ) ), ConsesLow.list( makeSymbol( "PWHEN-FEATURE" ), makeKeyword( "CYC-NOUNLEARNER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEARNED-NOUNS" ), ConsesLow.list( makeSymbol(
                    "LEARN-UNKNOWN-NOUNS-FROM-PARSE-TREE" ), makeSymbol( "PARSE" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEARNED-NOUN" ), makeSymbol( "LEARNED-NOUNS" ) ), ConsesLow
                        .list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "LEARNED-STRING" ), makeSymbol( "TYPE" ), makeSymbol( "RELATIONSHIP" ), makeSymbol( "CONFIDENCE" ) ), makeSymbol(
                            "LEARNED-NOUN" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "CONFIDENCE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PENN-TAGS" ), NIL ),
                                makeSymbol( "PARSED-STRING" ), makeSymbol( "SINGULARIZED-STRING" ), makeSymbol( "SEMTRANS" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol(
                                    "WORDS" ), makeSymbol( "PENN-TAGS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARSED-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list(
                                        makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "PARSED-STRING" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                            "SINGULARIZED-STRING" ), ConsesLow.list( makeSymbol( "SINGULARIZE-WORD" ), makeSymbol( "PARSED-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP,
                                                makeSymbol( "SINGULARIZED-STRING" ), makeSymbol( "LEARNED-STRING" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ),
                                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeSymbol( "PENN-TAGS" ) ) ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol(
                                                        "RELATIONSHIP" ), ConsesLow.list( makeKeyword( "ISA" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
                                                            constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "NOUN" ), makeSymbol( "TYPE" ) ) ) ), ConsesLow.list( makeKeyword(
                                                                "GENLS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles
                                                                    .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles
                                                                        .reader_make_constant_shell( makeString( "SubCollectionNamedFn" ) ), makeSymbol( "SINGULARIZED-STRING" ), makeSymbol( "TYPE" ) ) ) ) ) ), ConsesLow
                                                                            .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "PENN-TAGS" ), makeSymbol( "SEMTRANS" ) ), ConsesLow.list(
                                                                                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow
                                                                                    .list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow
                                                                                        .list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "PARSED-STRING" ) ), ConsesLow.list(
                                                                                            makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword(
                                                                                                "PENN-TAGS" ), makeSymbol( "PENN-TAGS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list(
                                                                                                    makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell(
                                                                                                        makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list(
                                                                                                            makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), makeSymbol( "SEMTRANS" ) ), ConsesLow
                                                                                                                .list( makeSymbol( "CPUSH" ), makeSymbol( "LEX" ), makeSymbol( "LEXES" ) ) ) ) ) ) ), ConsesLow.list(
                                                                                                                    makeSymbol( "RET" ), makeSymbol( "LEXES" ) ) ) );
    $sym208$PARSE = makeSymbol( "PARSE" );
    $sym209$YIELD = makeSymbol( "YIELD" );
    $list210 = ConsesLow.list( makeSymbol( "LEARNED-STRING" ), makeSymbol( "TYPE" ), makeSymbol( "RELATIONSHIP" ), makeSymbol( "CONFIDENCE" ) );
    $sym211$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $kw212$ISA = makeKeyword( "ISA" );
    $kw213$GENLS = makeKeyword( "GENLS" );
    $const214$SubCollectionNamedFn = constant_handles.reader_make_constant_shell( makeString( "SubCollectionNamedFn" ) );
    $sym215$SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD = makeSymbol( "SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD" );
    $sym216$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $sym217$LEX_ENTRY_P = makeSymbol( "LEX-ENTRY-P" );
    $const218$InstanceFn = constant_handles.reader_make_constant_shell( makeString( "InstanceFn" ) );
    $sym219$INSTANCEFN_CLAUSE = makeSymbol( "INSTANCEFN-CLAUSE" );
    $list220 = ConsesLow.list( TWO_INTEGER, ZERO_INTEGER );
    $kw221$IGNORE = makeKeyword( "IGNORE" );
    $sym222$DELETE = makeSymbol( "DELETE" );
    $const223$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) );
    $const224$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $const225$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym226$FORT_P = makeSymbol( "FORT-P" );
    $const227$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
  }
}
/*
 * 
 * Total time: 1195 ms
 * 
 */