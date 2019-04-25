package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyclifier_lexicon
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyclifier_lexicon";
  public static final String myFingerPrint = "eae34c8cecdb52dc180c81a584138bf1e35a486542ced37bca12610a1e426fd1";
  private static final SubLSymbol $sym0$CYCLIFIER_LEXICON;
  private static final SubLSymbol $sym1$SEMTRANS_LEXICON;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$ABSTRACT_LEXICON;
  private static final SubLSymbol $sym6$DEFAULT_EXCLUDE_MTS;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$DEFAULT_EXCLUDE_PREDICATES;
  private static final SubLSymbol $sym9$DEFAULT_BASE_MT;
  private static final SubLObject $const10$AllGeneralEnglishValidatedLexical;
  private static final SubLSymbol $sym11$DEFAULT_KB_SPEC;
  private static final SubLObject $const12$AbstractLexiconSpecification;
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_CLASS;
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
  private static final SubLSymbol $sym32$MY_TERM_LEXICON;
  private static final SubLSymbol $sym33$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_INSTANCE;
  private static final SubLSymbol $sym34$CREATE_LEX_ENTRIES_NUMBER;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$LEX_ENTRY;
  private static final SubLSymbol $sym39$SET;
  private static final SubLSymbol $kw40$STRING;
  private static final SubLSymbol $kw41$SEMTRANS;
  private static final SubLObject $const42$thereExistAtLeast;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$CYC_POS;
  private static final SubLObject $const45$Number_SP;
  private static final SubLSymbol $kw46$PENN_TAGS;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD;
  private static final SubLSymbol $sym49$CREATE_LEX_ENTRIES_NL_TRIE_WORD;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLObject $const53$Verb;
  private static final SubLObject $const54$thereExists;
  private static final SubLSymbol $kw55$ACTION;
  private static final SubLObject $const56$and;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$FRAME;
  private static final SubLSymbol $kw59$WORD_UNIT;
  private static final SubLSymbol $kw60$INFLECTIONS;
  private static final SubLList $list61;
  private static final SubLObject $const62$Noun;
  private static final SubLSymbol $sym63$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const64$EverythingPSC;
  private static final SubLObject $const65$isa;
  private static final SubLObject $const66$equals;
  private static final SubLSymbol $kw67$NOUN;
  private static final SubLObject $const68$RegularNounFrame;
  private static final SubLSymbol $sym69$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD;
  private static final SubLSymbol $sym70$FABRICATE_VERBAL_SEMTRANS;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$CYCLIFIER_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD;
  private static final SubLObject $const74$StateFn;
  private static final SubLSymbol $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_CLA;
  private static final SubLSymbol $sym78$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_INS;
  private static final SubLSymbol $sym79$FABRICATE;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$STRINGP;
  private static final SubLSymbol $sym84$LISTP;
  private static final SubLSymbol $sym85$KEYWORDP;
  private static final SubLSymbol $sym86$CYCLIFIER_LEXICON_W_O_FABRICATION_FABRICATE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 803L)
  public static SubLObject new_cyclifier_lexicon()
  {
    return object.new_class_instance( $sym0$CYCLIFIER_LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 893L)
  public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_class(final SubLObject new_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym6$DEFAULT_EXCLUDE_MTS, $list7 );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym8$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list( lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(
        thread ) ) );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym9$DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym11$DEFAULT_KB_SPEC, $const12$AbstractLexiconSpecification );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 893L)
  public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym16$ALLOWED_MTS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym18$EXCLUDED_MTS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym19$BASE_MT, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym20$ROOT_MT, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym21$EXCLUDED_PREDS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym22$EXCLUDED_POS_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym23$TRIE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym24$CACHE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym26$CASE_SENSITIVITY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym28$LEARNED, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym29$ACTIVE_LEARNERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym30$ALLOW_STEMMING, T );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym31$STOP_WORDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SEMTRANS_LEXICON, $sym32$MY_TERM_LEXICON, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 893L)
  public static SubLObject cyclifier_lexicon_p(final SubLObject v_cyclifier_lexicon)
  {
    return classes.subloop_instanceof_class( v_cyclifier_lexicon, $sym0$CYCLIFIER_LEXICON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 1260L)
  public static SubLObject cyclifier_lexicon_create_lex_entries_number_method(final SubLObject self, final SubLObject number_string)
  {
    final SubLObject lex_entry = object.new_class_instance( $sym38$LEX_ENTRY );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw40$STRING, number_string );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw41$SEMTRANS, ConsesLow.listS( $const42$thereExistAtLeast, numeral_parser.string_to_interval( number_string ), $list43 ) );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw44$CYC_POS, $const45$Number_SP );
    methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw46$PENN_TAGS, $list47 );
    return ConsesLow.list( lex_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 1698L)
  public static SubLObject cyclifier_lexicon_create_lex_entries_nl_trie_word_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lex_entries = NIL;
    final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred( nl_trie_entry, UNPROVIDED );
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
        final SubLObject inflections = ( NIL != wu ) ? conses_high.intersection( lexicon_accessors.preds_of_stringXword( string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED ), lexicon_utilities.preds_of_pos( pos,
            UNPROVIDED ), UNPROVIDED, UNPROVIDED ) : $list52;
        final SubLObject lex_entry = object.new_class_instance( $sym38$LEX_ENTRY );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw44$CYC_POS, pos );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw41$SEMTRANS, ( NIL != lexicon_accessors.genl_posP( pos, $const53$Verb, UNPROVIDED ) && NIL != davidsonian_p( semtrans ) ) ? ConsesLow.list(
            $const54$thereExists, $kw55$ACTION, ConsesLow.listS( $const56$and, semtrans, $list57 ) ) : semtrans );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw58$FRAME, frame );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw59$WORD_UNIT, wu );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw40$STRING, string );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym39$SET, $kw60$INFLECTIONS, inflections );
        lex_entries = ConsesLow.cons( lex_entry, lex_entries );
        cdolist_list_var = cdolist_list_var.rest();
        semtrans = cdolist_list_var.first();
      }
    }
    else if( NIL != subl_promotions.memberP( nl_trie.nl_trie_entry_semantic_pred( nl_trie_entry, UNPROVIDED ), $list61, UNPROVIDED, UNPROVIDED ) && NIL != lexicon_accessors.genl_posP( nl_trie.nl_trie_word_pos(
        nl_trie_entry ), $const62$Noun, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym63$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const64$EverythingPSC, thread );
        SubLObject cdolist_list_var2 = nl_trie.nl_trie_entry_denots( nl_trie_entry );
        SubLObject denot = NIL;
        denot = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( NIL == fort_types_interface.isa_predicateP( denot, UNPROVIDED ) )
          {
            final SubLObject lex_entry2 = object.new_class_instance( $sym38$LEX_ENTRY );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym39$SET, $kw60$INFLECTIONS, nl_trie.nl_trie_word_pos_preds( nl_trie_entry ) );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym39$SET, $kw44$CYC_POS, nl_trie.nl_trie_word_pos( nl_trie_entry ) );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym39$SET, $kw41$SEMTRANS, ConsesLow.list( ( NIL != fort_types_interface.isa_collectionP( denot, UNPROVIDED ) ) ? $const65$isa : $const66$equals,
                $kw67$NOUN, cycl_utilities.hl_to_el( denot ) ) );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym39$SET, $kw58$FRAME, $const68$RegularNounFrame );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym39$SET, $kw59$WORD_UNIT, nl_trie.nl_trie_word_word_unit( nl_trie_entry, UNPROVIDED ) );
            methods.funcall_instance_method_with_2_args( lex_entry2, $sym39$SET, $kw40$STRING, string );
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

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 3735L)
  public static SubLObject cyclifier_lexicon_fabricate_verbal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords)
  {
    SubLObject semtranses = NIL;
    SubLObject cdolist_list_var = semtrans_lexicon.semtrans_lexicon_fabricate_verbal_semtrans_method( self, string, keywords );
    SubLObject semtrans = NIL;
    semtrans = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      semtranses = ConsesLow.cons( ConsesLow.list( $const54$thereExists, $kw55$ACTION, ConsesLow.listS( $const56$and, semtrans, $list57 ) ), semtranses );
      cdolist_list_var = cdolist_list_var.rest();
      semtrans = cdolist_list_var.first();
    }
    return semtranses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4243L)
  public static SubLObject davidsonian_p(final SubLObject cycl)
  {
    final SubLObject stack = stacks.create_stack();
    SubLObject literal = NIL;
    stacks.stack_push( cycl, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      final SubLObject entry = stacks.stack_pop( stack );
      if( NIL != el_utilities.literalP( entry ) )
      {
        literal = entry;
        if( cycl_utilities.formula_arg1( literal, UNPROVIDED ).eql( $kw55$ACTION ) )
        {
          return T;
        }
      }
      SubLObject cdolist_list_var = cycl_utilities.formula_args( entry, UNPROVIDED );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        stacks.stack_push( arg, stack );
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4475L)
  public static SubLObject ensure_davidsonian(final SubLObject cycl)
  {
    return ( NIL != davidsonian_p( cycl ) ) ? cycl : make_davidsonian( cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4667L)
  public static SubLObject make_davidsonian(final SubLObject cycl)
  {
    return ConsesLow.list( $const65$isa, $kw55$ACTION, ConsesLow.list( $const74$StateFn, cycl ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4836L)
  public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class(final SubLObject new_instance)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym6$DEFAULT_EXCLUDE_MTS, $list7 );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym8$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list( lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(
        thread ) ) );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym9$DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym11$DEFAULT_KB_SPEC, $const12$AbstractLexiconSpecification );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4836L)
  public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym16$ALLOWED_MTS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym18$EXCLUDED_MTS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym19$BASE_MT, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym20$ROOT_MT, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym21$EXCLUDED_PREDS, $kw17$UNINITIALIZED );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym22$EXCLUDED_POS_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym23$TRIE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym24$CACHE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym26$CASE_SENSITIVITY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym28$LEARNED, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym29$ACTIVE_LEARNERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym30$ALLOW_STEMMING, T );
    classes.subloop_initialize_slot( new_instance, $sym5$ABSTRACT_LEXICON, $sym31$STOP_WORDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$SEMTRANS_LEXICON, $sym32$MY_TERM_LEXICON, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4836L)
  public static SubLObject cyclifier_lexicon_wXo_fabrication_p(final SubLObject cyclifier_lexicon_wXo_fabrication)
  {
    return classes.subloop_instanceof_class( cyclifier_lexicon_wXo_fabrication, $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 5149L)
  public static SubLObject cyclifier_lexicon_wXo_fabrication_fabricate_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn)
  {
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.listp( keywords ) : keywords;
    assert NIL != Types.keywordp( penn ) : penn;
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 5355L)
  public static SubLObject new_cyclifier_lexicon_wXo_fabrication()
  {
    return object.new_class_instance( $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION );
  }

  public static SubLObject declare_cyclifier_lexicon_file()
  {
    SubLFiles.declareFunction( me, "new_cyclifier_lexicon", "NEW-CYCLIFIER-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclifier_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclifier_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_lexicon_p", "CYCLIFIER-LEXICON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_lexicon_create_lex_entries_number_method", "CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_lexicon_create_lex_entries_nl_trie_word_method", "CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_lexicon_fabricate_verbal_semtrans_method", "CYCLIFIER-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "davidsonian_p", "DAVIDSONIAN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_davidsonian", "ENSURE-DAVIDSONIAN", 1, 0, false );
    SubLFiles.declareFunction( me, "make_davidsonian", "MAKE-DAVIDSONIAN", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_lexicon_wXo_fabrication_p", "CYCLIFIER-LEXICON-W/O-FABRICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_lexicon_wXo_fabrication_fabricate_method", "CYCLIFIER-LEXICON-W/O-FABRICATION-FABRICATE-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "new_cyclifier_lexicon_wXo_fabrication", "NEW-CYCLIFIER-LEXICON-W/O-FABRICATION", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cyclifier_lexicon_file()
  {
    return NIL;
  }

  public static SubLObject setup_cyclifier_lexicon_file()
  {
    classes.subloop_new_class( $sym0$CYCLIFIER_LEXICON, $sym1$SEMTRANS_LEXICON, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$CYCLIFIER_LEXICON, NIL );
    classes.subloop_note_class_initialization_function( $sym0$CYCLIFIER_LEXICON, $sym13$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$CYCLIFIER_LEXICON, $sym33$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_INSTANCE );
    subloop_reserved_initialize_cyclifier_lexicon_class( $sym0$CYCLIFIER_LEXICON );
    methods.methods_incorporate_instance_method( $sym34$CREATE_LEX_ENTRIES_NUMBER, $sym0$CYCLIFIER_LEXICON, $list35, $list36, $list37 );
    methods.subloop_register_instance_method( $sym0$CYCLIFIER_LEXICON, $sym34$CREATE_LEX_ENTRIES_NUMBER, $sym48$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD );
    methods.methods_incorporate_instance_method( $sym49$CREATE_LEX_ENTRIES_NL_TRIE_WORD, $sym0$CYCLIFIER_LEXICON, $list35, $list50, $list51 );
    methods.subloop_register_instance_method( $sym0$CYCLIFIER_LEXICON, $sym49$CREATE_LEX_ENTRIES_NL_TRIE_WORD, $sym69$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD );
    methods.methods_incorporate_instance_method( $sym70$FABRICATE_VERBAL_SEMTRANS, $sym0$CYCLIFIER_LEXICON, $list35, $list71, $list72 );
    methods.subloop_register_instance_method( $sym0$CYCLIFIER_LEXICON, $sym70$FABRICATE_VERBAL_SEMTRANS, $sym73$CYCLIFIER_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD );
    classes.subloop_new_class( $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, $sym0$CYCLIFIER_LEXICON, NIL, NIL, $list76 );
    classes.class_set_implements_slot_listeners( $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, NIL );
    classes.subloop_note_class_initialization_function( $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, $sym77$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_CLA );
    classes.subloop_note_instance_initialization_function( $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, $sym78$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_INS );
    subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class( $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION );
    methods.methods_incorporate_instance_method( $sym79$FABRICATE, $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, $list80, $list81, $list82 );
    methods.subloop_register_instance_method( $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, $sym79$FABRICATE, $sym86$CYCLIFIER_LEXICON_W_O_FABRICATION_FABRICATE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyclifier_lexicon_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyclifier_lexicon_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyclifier_lexicon_file();
  }
  static
  {
    me = new cyclifier_lexicon();
    $sym0$CYCLIFIER_LEXICON = makeSymbol( "CYCLIFIER-LEXICON" );
    $sym1$SEMTRANS_LEXICON = makeSymbol( "SEMTRANS-LEXICON" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEFAULT-KB-SPEC" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), constant_handles.reader_make_constant_shell( makeString(
        "CyclifierLexiconSpecification" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-WORD" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol(
            "NL-TRIE-ENTRY" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-LEX-ENTRIES-NUMBER" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE-VERBAL-SEMTRANS" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ) ) ) );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$ABSTRACT_LEXICON = makeSymbol( "ABSTRACT-LEXICON" );
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
    $sym13$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-CLASS" );
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
    $sym32$MY_TERM_LEXICON = makeSymbol( "MY-TERM-LEXICON" );
    $sym33$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-INSTANCE" );
    $sym34$CREATE_LEX_ENTRIES_NUMBER = makeSymbol( "CREATE-LEX-ENTRIES-NUMBER" );
    $list35 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list36 = ConsesLow.list( makeSymbol( "NUMBER-STRING" ) );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol(
            "NUMBER-STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol(
                "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) ), ConsesLow.list( makeSymbol( "STRING-TO-INTERVAL" ), makeSymbol( "NUMBER-STRING" ) ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NOUN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeKeyword( "RESTR" ), makeKeyword(
                        "SCOPE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), constant_handles
                            .reader_make_constant_shell( makeString( "Number-SP" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                                makeKeyword( "PENN-TAGS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "CD" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ),
                                    makeSymbol( "LEX-ENTRY" ) ) ) ) );
    $sym38$LEX_ENTRY = makeSymbol( "LEX-ENTRY" );
    $sym39$SET = makeSymbol( "SET" );
    $kw40$STRING = makeKeyword( "STRING" );
    $kw41$SEMTRANS = makeKeyword( "SEMTRANS" );
    $const42$thereExistAtLeast = constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) );
    $list43 = ConsesLow.list( makeKeyword( "NOUN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeKeyword( "RESTR" ), makeKeyword( "SCOPE" ) ) );
    $kw44$CYC_POS = makeKeyword( "CYC-POS" );
    $const45$Number_SP = constant_handles.reader_make_constant_shell( makeString( "Number-SP" ) );
    $kw46$PENN_TAGS = makeKeyword( "PENN-TAGS" );
    $list47 = ConsesLow.list( makeKeyword( "CD" ) );
    $sym48$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD = makeSymbol( "CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD" );
    $sym49$CREATE_LEX_ENTRIES_NL_TRIE_WORD = makeSymbol( "CREATE-LEX-ENTRIES-NL-TRIE-WORD" );
    $list50 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "NL-TRIE-ENTRY" ) );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRIES" ), NIL ), ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol(
        "NL-TRIE-ENTRY-SEMANTIC-PRED" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SEMTRANS-PRED?" ), makeSymbol( "PRED" ) ), ConsesLow.list(
            makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-SEMTRANS-TEMPLATES" ), makeSymbol(
                "NL-TRIE-ENTRY" ) ) ) ), ConsesLow.list( new SubLObject[]
                { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WU" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-WORD-UNIT" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "POS" ),
                    ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-POS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "FRAME" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-FRAME" ), makeSymbol(
                        "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "INFLECTIONS" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "WU" ), ConsesLow.list( makeSymbol( "INTERSECTION" ), ConsesLow.list(
                            makeSymbol( "PREDS-OF-STRING&WORD" ), makeSymbol( "STRING" ), makeSymbol( "WU" ) ), ConsesLow.list( makeSymbol( "PREDS-OF-POS" ), makeSymbol( "POS" ) ) ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol(
                                    "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                        makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), makeSymbol( "POS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
                                                "GENL-POS?" ), makeSymbol( "POS" ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) ), ConsesLow.list( makeSymbol( "DAVIDSONIAN-P" ), makeSymbol(
                                                    "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ACTION" ),
                                                        ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol(
                                                            "QUOTE" ), ConsesLow.list( makeKeyword( "SCOPE" ) ) ) ) ), makeSymbol( "SEMTRANS" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ),
                                                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "FRAME" ), makeSymbol( "FRAME" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                    makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "WORD-UNIT" ), makeSymbol( "WU" ) ), ConsesLow
                                                                        .list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ),
                                                                            makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                "SET" ) ), makeKeyword( "INFLECTIONS" ), makeSymbol( "INFLECTIONS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "LEX-ENTRY" ),
                                                                                    makeSymbol( "LEX-ENTRIES" ) )
            } ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "MEMBER?" ), ConsesLow.list( makeSymbol( "NL-TRIE-ENTRY-SEMANTIC-PRED" ), makeSymbol( "NL-TRIE-ENTRY" ) ), ConsesLow
                .list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "multiWordString" ) ) ) ) ), ConsesLow.list( makeSymbol( "GENL-POS?" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-POS" ), makeSymbol( "NL-TRIE-ENTRY" ) ), constant_handles.reader_make_constant_shell(
                        makeString( "Noun" ) ) ) ), ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol(
                            "NL-TRIE-ENTRY-DENOTS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "ISA-PREDICATE?" ), makeSymbol( "DENOT" ) ), ConsesLow.list(
                                new SubLObject[]
                                { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "LEX-ENTRY" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "INFLECTIONS" ),
                                        ConsesLow.list( makeSymbol( "NL-TRIE-WORD-POS-PREDS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "CYC-POS" ), ConsesLow.list( makeSymbol( "NL-TRIE-WORD-POS" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list(
                                                makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "SEMTRANS" ), ConsesLow.list( makeSymbol(
                                                    "LIST" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "ISA-COLLECTION?" ), makeSymbol( "DENOT" ) ), constant_handles.reader_make_constant_shell(
                                                        makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ) ), makeKeyword( "NOUN" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ),
                                                            makeSymbol( "DENOT" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ),
                                                                makeKeyword( "FRAME" ), constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                    "LEX-ENTRY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "WORD-UNIT" ), ConsesLow.list( makeSymbol(
                                                                        "NL-TRIE-WORD-WORD-UNIT" ), makeSymbol( "NL-TRIE-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX-ENTRY" ), ConsesLow.list(
                                                                            makeSymbol( "QUOTE" ), makeSymbol( "SET" ) ), makeKeyword( "STRING" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                                makeSymbol( "LEX-ENTRY" ), makeSymbol( "LEX-ENTRIES" ) )
                                } ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LEX-ENTRIES" ) ) ) );
    $list52 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular" ) ) );
    $const53$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const54$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $kw55$ACTION = makeKeyword( "ACTION" );
    $const56$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list57 = ConsesLow.list( makeKeyword( "SCOPE" ) );
    $kw58$FRAME = makeKeyword( "FRAME" );
    $kw59$WORD_UNIT = makeKeyword( "WORD-UNIT" );
    $kw60$INFLECTIONS = makeKeyword( "INFLECTIONS" );
    $list61 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) ) );
    $const62$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $sym63$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const64$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const65$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const66$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw67$NOUN = makeKeyword( "NOUN" );
    $const68$RegularNounFrame = constant_handles.reader_make_constant_shell( makeString( "RegularNounFrame" ) );
    $sym69$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD = makeSymbol( "CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD" );
    $sym70$FABRICATE_VERBAL_SEMTRANS = makeSymbol( "FABRICATE-VERBAL-SEMTRANS" );
    $list71 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ) );
    $list72 = ConsesLow.list( makeString(
        "@param STRING string; an English word\n   @param KEYWORDS list; a list of keywords to be incorporated into the fabricated semtrans\n   @return el-formula-p; a verbal semtrans for STRING incorporating KEYWORDS" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SEMTRANSES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SEMTRANS" ), ConsesLow.list(
            makeSymbol( "FABRICATE-VERBAL-SEMTRANS" ), makeSymbol( "SUPER" ), makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
                constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "ACTION" ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), constant_handles.reader_make_constant_shell( makeString(
                    "and" ) ), makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "SCOPE" ) ) ) ) ), makeSymbol( "SEMTRANSES" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                        makeSymbol( "SEMTRANSES" ) ) ) );
    $sym73$CYCLIFIER_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD = makeSymbol( "CYCLIFIER-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD" );
    $const74$StateFn = constant_handles.reader_make_constant_shell( makeString( "StateFn" ) );
    $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION = makeSymbol( "CYCLIFIER-LEXICON-W/O-FABRICATION" );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FABRICATE" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) ), makeKeyword(
        "PUBLIC" ) ) );
    $sym77$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_CLA = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-CLASS" );
    $sym78$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_INS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-INSTANCE" );
    $sym79$FABRICATE = makeSymbol( "FABRICATE" );
    $list80 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list81 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "KEYWORDS" ), makeSymbol( "PENN" ) );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "KEYWORDS" ), makeSymbol( "LISTP" ) ),
        ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PENN" ), makeSymbol( "KEYWORDP" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym83$STRINGP = makeSymbol( "STRINGP" );
    $sym84$LISTP = makeSymbol( "LISTP" );
    $sym85$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym86$CYCLIFIER_LEXICON_W_O_FABRICATION_FABRICATE_METHOD = makeSymbol( "CYCLIFIER-LEXICON-W/O-FABRICATION-FABRICATE-METHOD" );
  }
}
/*
 * 
 * Total time: 310 ms
 * 
 */