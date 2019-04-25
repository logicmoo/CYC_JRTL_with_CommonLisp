package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ebmt_template_parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ebmt_template_parser";
  public static final String myFingerPrint = "bf36012842aba91997c6e3e95213470d35d4d0daab9d1371aad605b914a05e9f";
  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 3150L)
  public static SubLSymbol $ebmt_exclude_predsP$;
  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 3339L)
  public static SubLSymbol $ebmt_phrase_interp_timeout$;
  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLSymbol $dtp_ebmt_template$;
  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8223L)
  private static SubLSymbol $ignore_terms_pattern$;
  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLSymbol $dtp_ebmt_template_parsing_info$;
  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
  private static SubLSymbol $ebmt_cycls_for_phrase_caching_state$;
  private static final SubLInteger $int0$30;
  private static final SubLSymbol $sym1$SEMTRANS_LEXICON;
  private static final SubLSymbol $sym2$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $kw3$OFF;
  private static final SubLSymbol $sym4$GET;
  private static final SubLSymbol $sym5$LEX_ENTRY;
  private static final SubLSymbol $sym6$SET;
  private static final SubLSymbol $kw7$STRING;
  private static final SubLSymbol $sym8$ADD;
  private static final SubLSymbol $kw9$LEXICON;
  private static final SubLString $str10$No_word_linkage_found_for___S;
  private static final SubLString $str11$A_word_linkage_with_unknown_words;
  private static final SubLSymbol $sym12$FORGET;
  private static final SubLSymbol $kw13$CLEARED;
  private static final SubLSymbol $sym14$EBMT_TEMPLATE;
  private static final SubLSymbol $sym15$EBMT_TEMPLATE_P;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$PRINT_EBMT_TEMPLATE;
  private static final SubLSymbol $sym21$EBMT_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$EBMT_TEMPLATE_NL_CYCL_PAIR;
  private static final SubLSymbol $sym24$_CSETF_EBMT_TEMPLATE_NL_CYCL_PAIR;
  private static final SubLSymbol $sym25$EBMT_TEMPLATE_TYPE;
  private static final SubLSymbol $sym26$_CSETF_EBMT_TEMPLATE_TYPE;
  private static final SubLSymbol $sym27$EBMT_TEMPLATE_LINKS;
  private static final SubLSymbol $sym28$_CSETF_EBMT_TEMPLATE_LINKS;
  private static final SubLSymbol $sym29$EBMT_TEMPLATE_CYCL;
  private static final SubLSymbol $sym30$_CSETF_EBMT_TEMPLATE_CYCL;
  private static final SubLSymbol $sym31$EBMT_TEMPLATE_INDEXING_RESULT;
  private static final SubLSymbol $sym32$_CSETF_EBMT_TEMPLATE_INDEXING_RESULT;
  private static final SubLSymbol $sym33$EBMT_TEMPLATE_WEIGHT;
  private static final SubLSymbol $sym34$_CSETF_EBMT_TEMPLATE_WEIGHT;
  private static final SubLSymbol $kw35$NL_CYCL_PAIR;
  private static final SubLSymbol $kw36$TYPE;
  private static final SubLSymbol $kw37$LINKS;
  private static final SubLSymbol $kw38$CYCL;
  private static final SubLSymbol $kw39$INDEXING_RESULT;
  private static final SubLSymbol $kw40$WEIGHT;
  private static final SubLString $str41$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw42$BEGIN;
  private static final SubLSymbol $sym43$MAKE_EBMT_TEMPLATE;
  private static final SubLSymbol $kw44$SLOT;
  private static final SubLSymbol $kw45$END;
  private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_METHOD;
  private static final SubLSymbol $sym47$_;
  private static final SubLString $str48$__TEMPLATE_____Words___S____Links;
  private static final SubLSymbol $kw49$UNINITIALIZED;
  private static final SubLString $str50$______________;
  private static final SubLString $str51$Unable_to_initialize__A__;
  private static final SubLString $str52$_;
  private static final SubLString $str53$_;
  private static final SubLSymbol $sym54$GET_INDEX;
  private static final SubLSymbol $sym55$GET_STRING;
  private static final SubLString $str56$IGNORE_;
  private static final SubLSymbol $sym57$LINKSET_LINK_P;
  private static final SubLSymbol $sym58$EBMT_LINK_NAME_ARGUMENT_P;
  private static final SubLSymbol $sym59$LINKS;
  private static final SubLSymbol $sym60$WORDS;
  private static final SubLString $str61$__A_Za_z0_9__;
  private static final SubLString $str62$___A_Za_z0_9_;
  private static final SubLString $str63$_b_;
  private static final SubLString $str64$__b;
  private static final SubLList $list65;
  private static final SubLString $str66$_VAR;
  private static final SubLSymbol $sym67$EL_VAR_;
  private static final SubLObject $const68$InferencePSC;
  private static final SubLSymbol $sym69$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str70$__;
  private static final SubLString $str71$_;
  private static final SubLSymbol $kw72$GENERAL;
  private static final SubLSymbol $kw73$SPECIFIC;
  private static final SubLSymbol $sym74$STRINGP;
  private static final SubLSymbol $sym75$CYCL_SENTENCE_P;
  private static final SubLString $str76$__NL___S__CycL____S___S__;
  private static final SubLSymbol $kw77$VAR;
  private static final SubLSymbol $sym78$KEYWORDP;
  private static final SubLSymbol $kw79$DEFAULT;
  private static final SubLString $str80$Unknown_EBMT_lexicon___S__;
  private static final SubLSymbol $kw81$APPEND;
  private static final SubLString $str82$Unable_to_open__S;
  private static final SubLString $str83$_A__A__;
  private static final SubLSymbol $kw84$INPUT;
  private static final SubLString $str85$__;
  private static final SubLString $str86$___;
  private static final SubLString $str87$_A_____S__;
  private static final SubLString $str88$Added;
  private static final SubLString $str89$_S__;
  private static final SubLString $str90$Found_;
  private static final SubLString $str91$_templates_for_linkset__;
  private static final SubLSymbol $kw92$DONE;
  private static final SubLString $str93$Deleted;
  private static final SubLString $str94$_A__;
  private static final SubLSymbol $kw95$JUSTIFICATION;
  private static final SubLSymbol $sym96$EBMT_TEMPLATE_PARSING_INFO;
  private static final SubLSymbol $sym97$EBMT_TEMPLATE_PARSING_INFO_P;
  private static final SubLList $list98;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$PRINT_EBMT_TEMPLATE_PARSING_INFO;
  private static final SubLSymbol $sym103$EBMT_TEMPLATE_PARSING_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS;
  private static final SubLSymbol $sym106$_CSETF_EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS;
  private static final SubLSymbol $sym107$EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS;
  private static final SubLSymbol $sym108$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS;
  private static final SubLSymbol $sym109$EBMT_TEMPLATE_PARSING_INFO_LW;
  private static final SubLSymbol $sym110$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW;
  private static final SubLSymbol $sym111$EBMT_TEMPLATE_PARSING_INFO_PROCESSED;
  private static final SubLSymbol $sym112$_CSETF_EBMT_TEMPLATE_PARSING_INFO_PROCESSED;
  private static final SubLSymbol $sym113$EBMT_TEMPLATE_PARSING_INFO_CYCL;
  private static final SubLSymbol $sym114$_CSETF_EBMT_TEMPLATE_PARSING_INFO_CYCL;
  private static final SubLSymbol $kw115$KW_LW_PAIRS;
  private static final SubLSymbol $kw116$LW_LINKS_PAIRS;
  private static final SubLSymbol $kw117$LW;
  private static final SubLSymbol $kw118$PROCESSED;
  private static final SubLSymbol $sym119$MAKE_EBMT_TEMPLATE_PARSING_INFO;
  private static final SubLSymbol $sym120$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_PARSING_INFO_METHOD;
  private static final SubLString $str121$__TEMPLATE_PARSING_INFO______Keyw;
  private static final SubLSymbol $sym122$GET_LINKS;
  private static final SubLSymbol $sym123$LINK_TUPLE_EQUAL;
  private static final SubLString $str124$a;
  private static final SubLString $str125$an;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$EBMT_CYCLS_FOR_PHRASE;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$EQUALS_EL_;
  private static final SubLList $list131;
  private static final SubLSymbol $kw132$BEST_ONLY;
  private static final SubLObject $const133$familyName;
  private static final SubLObject $const134$PhraseFn;
  private static final SubLSymbol $sym135$_EBMT_CYCLS_FOR_PHRASE_CACHING_STATE_;
  private static final SubLInteger $int136$5000;
  private static final SubLObject $const137$ProperNoun;
  private static final SubLObject $const138$NounPhrase;
  private static final SubLSymbol $kw139$ANY;
  private static final SubLSymbol $sym140$PREPOSITION_LINK_WORD_P;
  private static final SubLSymbol $sym141$GET_MODIFIERS;
  private static final SubLSymbol $sym142$GET_LINK_WORD_ABS_INDEX;
  private static final SubLSymbol $sym143$GET_POS;
  private static final SubLSymbol $sym144$YIELD;
  private static final SubLSymbol $sym145$GET_CATEGORY;
  private static final SubLSymbol $sym146$GET_HEAD_DAUGHTER;
  private static final SubLString $str147$Unable_to_understand_some_of_the_;
  private static final SubLString $str148$No_matching_templates_found_;
  private static final SubLSymbol $sym149$SETS_EQUAL_;
  private static final SubLString $str150$Failed_to_compute_a_linkage_for__;
  private static final SubLSymbol $sym151$VALUES;
  private static final SubLString $str152$Wff_checking_rejected_all_cycl_;
  private static final SubLSymbol $kw153$FAILURE;
  private static final SubLSymbol $kw154$SUCCESS;
  private static final SubLString $str155$__Template_Parse_Result___S___S__;
  private static final SubLList $list156;
  private static final SubLInteger $int157$100;
  private static final SubLString $str158$Populating_EBMT_Template_Index___;
  private static final SubLObject $const159$AllEBMTTrainingExamplesCollectorM;
  private static final SubLList $list160;
  private static final SubLList $list161;

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 3480L)
  public static SubLObject new_ebmt_lexicon(SubLObject case_insensitiveP)
  {
    if( case_insensitiveP == UNPROVIDED )
    {
      case_insensitiveP = NIL;
    }
    final SubLObject lexicon = object.new_class_instance( $sym1$SEMTRANS_LEXICON );
    if( NIL != case_insensitiveP )
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym2$SET_CASE_SENSITIVITY, $kw3$OFF );
    }
    return lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 3884L)
  public static SubLObject ebmt_linkage(SubLObject nl_sentence, final SubLObject lexicon, SubLObject error_if_word_linkage_failedP, SubLObject lex_strings)
  {
    if( error_if_word_linkage_failedP == UNPROVIDED )
    {
      error_if_word_linkage_failedP = T;
    }
    if( lex_strings == UNPROVIDED )
    {
      lex_strings = NIL;
    }
    nl_sentence = string_utilities.strip_sentential_punctuation( nl_sentence );
    SubLObject cdolist_list_var = lex_strings;
    SubLObject lex_string = NIL;
    lex_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == methods.funcall_instance_method_with_1_args( lexicon, $sym4$GET, lex_string ) )
      {
        final SubLObject lex_entry = object.new_class_instance( $sym5$LEX_ENTRY );
        methods.funcall_instance_method_with_2_args( lex_entry, $sym6$SET, $kw7$STRING, lex_string );
        methods.funcall_instance_method_with_1_args( lexicon, $sym8$ADD, lex_entry );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex_string = cdolist_list_var.first();
    }
    final SubLObject v_linkage = word_linkage.new_word_linkage( nl_sentence, ConsesLow.list( $kw9$LEXICON, lexicon ) );
    if( NIL == v_linkage )
    {
      Errors.error( $str10$No_word_linkage_found_for___S, nl_sentence );
    }
    if( NIL != error_if_word_linkage_failedP && NIL != word_linkage.word_linkage_failedP( v_linkage, UNPROVIDED ) )
    {
      Errors.error( $str11$A_word_linkage_with_unknown_words, nl_sentence );
    }
    methods.funcall_instance_method_with_0_args( lexicon, $sym12$FORGET );
    return v_linkage;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5173L)
  public static SubLObject ebmt_clear_caches()
  {
    clear_ebmt_cycls_for_phrase();
    return $kw13$CLEARED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject ebmt_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_ebmt_template( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject ebmt_template_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $ebmt_template_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject ebmt_template_nl_cycl_pair(final SubLObject v_object)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject ebmt_template_type(final SubLObject v_object)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject ebmt_template_links(final SubLObject v_object)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject ebmt_template_cycl(final SubLObject v_object)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject ebmt_template_indexing_result(final SubLObject v_object)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject ebmt_template_weight(final SubLObject v_object)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject _csetf_ebmt_template_nl_cycl_pair(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject _csetf_ebmt_template_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject _csetf_ebmt_template_links(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject _csetf_ebmt_template_cycl(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject _csetf_ebmt_template_indexing_result(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject _csetf_ebmt_template_weight(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject make_ebmt_template(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $ebmt_template_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw35$NL_CYCL_PAIR ) )
      {
        _csetf_ebmt_template_nl_cycl_pair( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$TYPE ) )
      {
        _csetf_ebmt_template_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$LINKS ) )
      {
        _csetf_ebmt_template_links( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$CYCL ) )
      {
        _csetf_ebmt_template_cycl( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$INDEXING_RESULT ) )
      {
        _csetf_ebmt_template_indexing_result( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$WEIGHT ) )
      {
        _csetf_ebmt_template_weight( v_new, current_value );
      }
      else
      {
        Errors.error( $str41$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject visit_defstruct_ebmt_template(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw42$BEGIN, $sym43$MAKE_EBMT_TEMPLATE, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw35$NL_CYCL_PAIR, ebmt_template_nl_cycl_pair( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw36$TYPE, ebmt_template_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw37$LINKS, ebmt_template_links( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw38$CYCL, ebmt_template_cycl( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw39$INDEXING_RESULT, ebmt_template_indexing_result( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw40$WEIGHT, ebmt_template_weight( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$END, $sym43$MAKE_EBMT_TEMPLATE, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
  public static SubLObject visit_defstruct_object_ebmt_template_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_ebmt_template( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5662L)
  public static SubLObject new_ebmt_template(SubLObject nl_cycl_pair, SubLObject type, SubLObject links, SubLObject cycl, SubLObject indexing_result, SubLObject weight)
  {
    if( nl_cycl_pair == UNPROVIDED )
    {
      nl_cycl_pair = NIL;
    }
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( links == UNPROVIDED )
    {
      links = NIL;
    }
    if( cycl == UNPROVIDED )
    {
      cycl = NIL;
    }
    if( indexing_result == UNPROVIDED )
    {
      indexing_result = NIL;
    }
    if( weight == UNPROVIDED )
    {
      weight = NIL;
    }
    final SubLObject template = make_ebmt_template( UNPROVIDED );
    _csetf_ebmt_template_nl_cycl_pair( template, nl_cycl_pair );
    _csetf_ebmt_template_type( template, type );
    _csetf_ebmt_template_links( template, links );
    _csetf_ebmt_template_cycl( template, cycl );
    _csetf_ebmt_template_indexing_result( template, indexing_result );
    _csetf_ebmt_template_weight( template, weight );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 6194L)
  public static SubLObject ebmt_template_words(final SubLObject template)
  {
    final SubLObject links = ebmt_template_links( template );
    SubLObject words = NIL;
    SubLObject cdolist_list_var = links;
    SubLObject link = NIL;
    link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      words = list_utilities.alist_enter( words, linkset_link_left_word_index( link ), linkset_link_left_word_string( link ), Symbols.symbol_function( EQ ) );
      words = list_utilities.alist_enter( words, linkset_link_right_word_index( link ), linkset_link_right_word_string( link ), Symbols.symbol_function( EQ ) );
      cdolist_list_var = cdolist_list_var.rest();
      link = cdolist_list_var.first();
    }
    words = list_utilities.sort_alist_by_keys( words, $sym47$_ );
    return list_utilities.alist_values( words );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 6861L)
  public static SubLObject print_ebmt_template(final SubLObject template, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str48$__TEMPLATE_____Words___S____Links, new SubLObject[] { ebmt_template_words( template ), ebmt_template_links( template ), ebmt_template_cycl( template ), ebmt_template_weight( template )
    } );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 7197L)
  public static SubLObject ebmt_template_justification(final SubLObject template)
  {
    return ConsesLow.list( template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 7278L)
  public static SubLObject ebmt_linkage_and_mapped_terms(final SubLObject nl_sentence, final SubLObject cycl_sentence, final SubLObject lexicon, SubLObject error_if_linkage_incompleteP)
  {
    if( error_if_linkage_incompleteP == UNPROVIDED )
    {
      error_if_linkage_incompleteP = T;
    }
    final SubLObject mapped_terms = query_sentence_lexifier.gtqs_find_term_glosses( cycl_sentence, nl_sentence );
    final SubLObject ignorable_terms = ebmt_ignorable_terms_in_training_string( nl_sentence );
    final SubLObject sentence_to_parse = ebmt_remove_ignore_markers( nl_sentence );
    return Values.values( ebmt_linkage( sentence_to_parse, lexicon, error_if_linkage_incompleteP, conses_high.union( list_utilities.alist_values( mapped_terms ), ignorable_terms, Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ), mapped_terms, ignorable_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8223L)
  public static SubLObject ignore_terms_pattern()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $ignore_terms_pattern$.getDynamicValue( thread ) == $kw49$UNINITIALIZED )
    {
      final SubLObject init_value = regular_expressions.compile_regular_expression( $str50$______________, UNPROVIDED );
      if( init_value == $kw49$UNINITIALIZED )
      {
        Errors.error( $str51$Unable_to_initialize__A__, $ignore_terms_pattern$.getDynamicValue( thread ) );
      }
      $ignore_terms_pattern$.setDynamicValue( init_value, thread );
    }
    return $ignore_terms_pattern$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8680L)
  public static SubLObject ebmt_ignorable_terms_in_training_string(final SubLObject string)
  {
    final SubLObject pattern = ignore_terms_pattern();
    return regular_expression_utilities.find_all_captured_matches_for_pattern( pattern, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8860L)
  public static SubLObject ebmt_remove_ignore_markers(final SubLObject string)
  {
    return string_utilities.remove_substring( string_utilities.remove_substring( string, $str52$_ ), $str53$_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8977L)
  public static SubLObject ebmt_linkset_from_linkage_links(final SubLObject links, SubLObject nl_term_vars)
  {
    if( nl_term_vars == UNPROVIDED )
    {
      nl_term_vars = NIL;
    }
    SubLObject linkset = NIL;
    SubLObject cdolist_list_var = links;
    SubLObject link = NIL;
    link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == linkage.link_contains_wall_word_linkage_wordP( link ) && NIL == linkage.link_contains_wall_link_wordP( link ) )
      {
        final SubLObject left_link_word = linkage.link_left_word( link );
        final SubLObject left_link_word_index = methods.funcall_instance_method_with_0_args( left_link_word, $sym54$GET_INDEX );
        SubLObject left_word = ( NIL != left_link_word ) ? methods.funcall_instance_method_with_0_args( left_link_word, $sym55$GET_STRING ) : NIL;
        final SubLObject right_link_word = linkage.link_right_word( link );
        final SubLObject right_link_word_index = methods.funcall_instance_method_with_0_args( right_link_word, $sym54$GET_INDEX );
        SubLObject right_word = ( NIL != right_link_word ) ? methods.funcall_instance_method_with_0_args( right_link_word, $sym55$GET_STRING ) : NIL;
        if( NIL != nl_term_vars )
        {
          left_word = list_utilities.alist_lookup_without_values( nl_term_vars, left_word, Symbols.symbol_function( EQUAL ), left_word );
          right_word = list_utilities.alist_lookup_without_values( nl_term_vars, right_word, Symbols.symbol_function( EQUAL ), right_word );
        }
        if( ( !left_word.isSymbol() || NIL == string_utilities.starts_with( Symbols.symbol_name( left_word ), $str56$IGNORE_ ) ) && ( !right_word.isSymbol() || NIL == string_utilities.starts_with( Symbols.symbol_name(
            right_word ), $str56$IGNORE_ ) ) )
        {
          final SubLObject item_var = new_linkset( ConsesLow.list( left_word, left_link_word_index ), ebmt_link_name( link ), ConsesLow.list( right_word, right_link_word_index ) );
          if( NIL == conses_high.member( item_var, linkset, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            linkset = ConsesLow.cons( item_var, linkset );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      link = cdolist_list_var.first();
    }
    return Sequences.nreverse( linkset );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 10534L)
  public static SubLObject linkset_p(final SubLObject obj)
  {
    return makeBoolean( obj.isList() && NIL != list_utilities.every_in_list( $sym57$LINKSET_LINK_P, obj, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 10637L)
  public static SubLObject linkset_link_p(final SubLObject obj)
  {
    return makeBoolean( obj.isList() && NIL != list_utilities.lengthE( obj, THREE_INTEGER, UNPROVIDED ) && conses_high.second( obj ).isString() && obj.first().isList() && conses_high.third( obj ).isList()
        && linkset_link_left_word_string( obj ).isString() && linkset_link_right_word_string( obj ).isString() && linkset_link_left_word_index( obj ).isInteger() && linkset_link_right_word_index( obj ).isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11016L)
  public static SubLObject ebmt_link_name_argument_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.lower_case_p( v_char ) || v_char.equal( Characters.CHAR_asterisk ) || v_char.equal( Characters.CHAR_hash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11145L)
  public static SubLObject ebmt_link_name(final SubLObject link)
  {
    final SubLObject link_name = linkage.link_name( link );
    final SubLObject ebmt_link_name = Sequences.remove_if( Symbols.symbol_function( $sym58$EBMT_LINK_NAME_ARGUMENT_P ), link_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ebmt_link_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11414L)
  public static SubLObject new_linkset(final SubLObject left_link_word_and_index, final SubLObject link_name, final SubLObject right_link_word_and_index)
  {
    return ConsesLow.list( left_link_word_and_index, link_name, right_link_word_and_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11584L)
  public static SubLObject get_linkset_unindexed_links(final SubLObject linkset)
  {
    SubLObject unindexed_links = NIL;
    SubLObject cdolist_list_var = linkset;
    SubLObject link = NIL;
    link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      unindexed_links = ConsesLow.cons( ConsesLow.list( link.first().first(), conses_high.second( link ), conses_high.third( link ).first() ), unindexed_links );
      cdolist_list_var = cdolist_list_var.rest();
      link = cdolist_list_var.first();
    }
    return unindexed_links;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11817L)
  public static SubLObject get_linkset_indexed_links(final SubLObject linkset)
  {
    return linkset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11887L)
  public static SubLObject linkset_link_name(final SubLObject linkset_link)
  {
    return conses_high.second( linkset_link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11968L)
  public static SubLObject linkset_link_left_word(final SubLObject link)
  {
    return link.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12037L)
  public static SubLObject linkset_link_left_word_string(final SubLObject link)
  {
    return link.first().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12121L)
  public static SubLObject linkset_link_left_word_index(final SubLObject link)
  {
    return conses_high.second( link.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12205L)
  public static SubLObject linkset_link_right_word(final SubLObject link)
  {
    return conses_high.third( link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12275L)
  public static SubLObject linkset_link_right_word_string(final SubLObject link)
  {
    return conses_high.third( link ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12360L)
  public static SubLObject linkset_link_right_word_index(final SubLObject link)
  {
    return conses_high.second( conses_high.third( link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12445L)
  public static SubLObject ebmt_linkset(final SubLObject v_linkage, SubLObject nl_term_vars)
  {
    if( nl_term_vars == UNPROVIDED )
    {
      nl_term_vars = NIL;
    }
    return ebmt_linkset_from_linkage_links( Sequences.remove( NIL, vector_utilities.vector_elements( instances.get_slot( v_linkage, $sym59$LINKS ), UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), nl_term_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 13088L)
  public static SubLObject ebmt_cycl_with_vars(SubLObject cycl, final SubLObject cycl_term_vars)
  {
    SubLObject cdolist_list_var = cycl_term_vars;
    SubLObject cycl_term_var = NIL;
    cycl_term_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_term = cycl_term_var.first();
      final SubLObject var = cycl_term_var.rest();
      cycl = cycl_utilities.expression_nsubst( var, v_term, cycl, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cycl_term_var = cdolist_list_var.first();
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 13742L)
  public static SubLObject ebmt_link_word(final SubLObject word, final SubLObject v_linkage)
  {
    SubLObject linkword = NIL;
    final SubLObject vector_var = instances.get_slot( v_linkage, $sym60$WORDS );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject w;
    SubLObject lw_string;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      w = ( linkword = Vectors.aref( vector_var, element_num ) );
      lw_string = methods.funcall_instance_method_with_0_args( linkword, $sym55$GET_STRING );
      if( Strings.string_downcase( word, UNPROVIDED, UNPROVIDED ).equal( Strings.string_downcase( lw_string, UNPROVIDED, UNPROVIDED ) ) )
      {
        return lw_string;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 14170L)
  public static SubLObject ebmt_lw_offsets(final SubLObject lw_string, final SubLObject string)
  {
    final SubLObject lw_string_with_escaped_chars = regular_expression_utilities.escape_regex_special_chars( lw_string );
    SubLObject cdolist_list_var;
    final SubLObject lw_regexes = cdolist_list_var = ConsesLow.list( Sequences.cconcatenate( $str61$__A_Za_z0_9__, new SubLObject[] { format_nil.format_nil_a_no_copy( lw_string_with_escaped_chars ), $str62$___A_Za_z0_9_
    } ), Sequences.cconcatenate( $str63$_b_, new SubLObject[] { format_nil.format_nil_a_no_copy( lw_string_with_escaped_chars ), $str62$___A_Za_z0_9_
    } ), Sequences.cconcatenate( $str61$__A_Za_z0_9__, new SubLObject[] { format_nil.format_nil_a_no_copy( lw_string_with_escaped_chars ), $str64$__b
    } ), Sequences.cconcatenate( $str63$_b_, new SubLObject[] { format_nil.format_nil_a_no_copy( lw_string_with_escaped_chars ), $str64$__b
    } ) );
    SubLObject lw_regex = NIL;
    lw_regex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lw_offsets = list_utilities.alist_keys( regular_expression_utilities.offsets_of_regex_capturing_matches( lw_regex, string, $list65, UNPROVIDED ) );
      if( NIL != lw_offsets )
      {
        return lw_offsets;
      }
      cdolist_list_var = cdolist_list_var.rest();
      lw_regex = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 15034L)
  public static SubLObject ebmt_mapped_term_vars(final SubLObject english, final SubLObject cycl, final SubLObject mapped_terms, final SubLObject v_linkage, SubLObject allow_multiple_matchesP)
  {
    if( allow_multiple_matchesP == UNPROVIDED )
    {
      allow_multiple_matchesP = NIL;
    }
    SubLObject keyword_counter = ONE_INTEGER;
    SubLObject cycl_term_vars = NIL;
    SubLObject nl_term_vars = NIL;
    SubLObject cdolist_list_var = conses_high.copy_list( mapped_terms );
    SubLObject mapped_term = NIL;
    mapped_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cycl_term = mapped_term.first();
      final SubLObject english_term = mapped_term.rest();
      final SubLObject linkword_english_term = ebmt_link_word( english_term, v_linkage );
      if( NIL != linkword_english_term )
      {
        final SubLObject english_term_positions = ebmt_lw_offsets( linkword_english_term, english );
        final SubLObject cycl_term_positions = cycl_utilities.arg_positions_dfs( cycl_term, cycl, Symbols.symbol_function( EQUAL ) );
        if( NIL != english_term_positions && NIL != cycl_term_positions && ( NIL != allow_multiple_matchesP || NIL != list_utilities.singletonP( english_term_positions ) ) && ( NIL != allow_multiple_matchesP
            || NIL != list_utilities.singletonP( cycl_term_positions ) ) )
        {
          final SubLObject keyword_var = reader.read_from_string( Sequences.cconcatenate( $str66$_VAR, format_nil.format_nil_a_no_copy( keyword_counter ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          cycl_term_vars = conses_high.acons( cycl_term, keyword_var, cycl_term_vars );
          nl_term_vars = conses_high.acons( linkword_english_term, keyword_var, nl_term_vars );
          keyword_counter = number_utilities.f_1X( keyword_counter );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      mapped_term = cdolist_list_var.first();
    }
    return Values.values( cycl_term_vars, nl_term_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 17136L)
  public static SubLObject ebmt_canonicalize_el_sentence(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject el = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$canonicalize_tensed_literalsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = czer_vars.$add_term_of_unit_litsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding( thread );
    try
    {
      czer_vars.$expand_el_relationsP$.bind( NIL, thread );
      czer_vars.$canonicalize_tensed_literalsP$.bind( NIL, thread );
      czer_vars.$add_term_of_unit_litsP$.bind( NIL, thread );
      czer_vars.$turn_existentials_into_skolemsP$.bind( NIL, thread );
      final SubLObject hl = czer_main.el_to_hl( sentence, mt );
      el = uncanonicalizer.cnfs_el_formula( czer_utilities.extract_el_clauses( hl ), UNPROVIDED, UNPROVIDED );
      SubLObject list_var = NIL;
      SubLObject el_var = NIL;
      SubLObject num = NIL;
      list_var = list_utilities.delete_duplicates_from_start( cycl_utilities.expression_gather_with_duplicates( el, $sym67$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
      el_var = list_var.first();
      for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
      {
        el = cycl_utilities.expression_subst( variables.get_default_el_var( num ), el_var, el, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      czer_vars.$turn_existentials_into_skolemsP$.rebind( _prev_bind_4, thread );
      czer_vars.$add_term_of_unit_litsP$.rebind( _prev_bind_3, thread );
      czer_vars.$canonicalize_tensed_literalsP$.rebind( _prev_bind_2, thread );
      czer_vars.$expand_el_relationsP$.rebind( _prev_bind_0, thread );
    }
    return el;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 17810L)
  public static SubLObject ebmt_create_template(final SubLObject english, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( allow_multiple_matchesP == UNPROVIDED )
    {
      allow_multiple_matchesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject canonical_cycl = ebmt_canonicalize_el_sentence( cycl, $const68$InferencePSC );
    SubLObject err_msg = NIL;
    SubLObject v_linkage = NIL;
    SubLObject mapped_terms = NIL;
    SubLObject cycl_term_vars = NIL;
    SubLObject nl_term_vars = NIL;
    SubLObject ignorable_strings = NIL;
    SubLObject template = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym69$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          thread.resetMultipleValues();
          final SubLObject v_linkage_$1 = ebmt_linkage_and_mapped_terms( english, canonical_cycl, lexicon, UNPROVIDED );
          final SubLObject mapped_terms_$2 = thread.secondMultipleValue();
          final SubLObject ignorable_strings_$3 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          v_linkage = v_linkage_$1;
          mapped_terms = mapped_terms_$2;
          ignorable_strings = ignorable_strings_$3;
          thread.resetMultipleValues();
          final SubLObject cycl_term_vars_$4 = ebmt_mapped_term_vars( english, canonical_cycl, mapped_terms, v_linkage, allow_multiple_matchesP );
          final SubLObject nl_term_vars_$5 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          cycl_term_vars = cycl_term_vars_$4;
          nl_term_vars = nl_term_vars_$5;
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
      err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != err_msg )
    {
      Errors.warn( string_utilities.string_subst( $str70$__, $str71$_, err_msg, UNPROVIDED ) );
      return NIL;
    }
    SubLObject list_var = NIL;
    SubLObject ignorable_string = NIL;
    SubLObject num = NIL;
    list_var = ignorable_strings;
    ignorable_string = list_var.first();
    for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), ignorable_string = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
    {
      final SubLObject keyword = Symbols.make_keyword( Sequences.cconcatenate( $str56$IGNORE_, format_nil.format_nil_s_no_copy( num ) ) );
      nl_term_vars = ConsesLow.cons( ConsesLow.cons( ignorable_string, keyword ), nl_term_vars );
    }
    template = new_ebmt_template( ConsesLow.list( english, cycl ), ( NIL != cycl_term_vars ) ? $kw72$GENERAL : $kw73$SPECIFIC, ebmt_linkset( v_linkage, nl_term_vars ), ( NIL != cycl_term_vars ) ? ebmt_cycl_with_vars(
        el_utilities.copy_expression( canonical_cycl ), cycl_term_vars ) : canonical_cycl, UNPROVIDED, UNPROVIDED );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 19203L)
  public static SubLObject ebmt_create_all_possible_training_examples(final SubLObject nl, final SubLObject cycl)
  {
    assert NIL != Types.stringp( nl ) : nl;
    assert NIL != cycl_grammar.cycl_sentence_p( cycl ) : cycl;
    SubLObject nl_cycl_pairs = ConsesLow.list( ConsesLow.list( nl, cycl ) );
    final SubLObject ignorable_strings = ebmt_ignorable_terms_in_training_string( nl );
    if( NIL != ignorable_strings )
    {
      SubLObject new_nl = ebmt_remove_ignore_markers( nl );
      SubLObject cdolist_list_var = ignorable_strings;
      SubLObject ignorable_term = NIL;
      ignorable_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        new_nl = string_utilities.remove_substring( new_nl, ignorable_term );
        cdolist_list_var = cdolist_list_var.rest();
        ignorable_term = cdolist_list_var.first();
      }
      final SubLObject item_var = ConsesLow.list( new_nl, cycl );
      if( NIL == conses_high.member( item_var, nl_cycl_pairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        nl_cycl_pairs = ConsesLow.cons( item_var, nl_cycl_pairs );
      }
    }
    return nl_cycl_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 19926L)
  public static SubLObject ebmt_create_templates(final SubLObject nl, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( allow_multiple_matchesP == UNPROVIDED )
    {
      allow_multiple_matchesP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    assert NIL != Types.stringp( nl ) : nl;
    assert NIL != cycl_grammar.cycl_sentence_p( cycl ) : cycl;
    final SubLObject nl_cycl_pairs = ebmt_create_all_possible_training_examples( nl, cycl );
    SubLObject templates = NIL;
    SubLObject cdolist_list_var = nl_cycl_pairs;
    SubLObject nl_cycl_pair = NIL;
    nl_cycl_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject nl_sent = nl_cycl_pair.first();
      final SubLObject cycl_sent = conses_high.second( nl_cycl_pair );
      final SubLObject template = ebmt_create_template( nl_sent, cycl_sent, lexicon, allow_multiple_matchesP );
      if( NIL != template )
      {
        templates = ConsesLow.cons( template, templates );
      }
      if( NIL != verboseP )
      {
        PrintLow.format( T, $str76$__NL___S__CycL____S___S__, new SubLObject[] { nl_sent, cycl_sent, template
        } );
      }
      cdolist_list_var = cdolist_list_var.rest();
      nl_cycl_pair = cdolist_list_var.first();
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 20796L)
  public static SubLObject ebmt_stringify_list(final SubLObject list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject string = NIL;
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      string = format_nil.format_nil_s( list );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    string = string_utilities.strip_first( string );
    string = string_utilities.strip_final( string, UNPROVIDED );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 21230L)
  public static SubLObject ebmt_linkset_string(final SubLObject links, SubLObject with_varsP)
  {
    if( with_varsP == UNPROVIDED )
    {
      with_varsP = NIL;
    }
    SubLObject result_links = links;
    if( NIL != with_varsP )
    {
      SubLObject cdolist_list_var = links;
      SubLObject link = NIL;
      link = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject item_var;
        final SubLObject link_first_replaced = item_var = list_utilities.replace_nth( ZERO_INTEGER, $kw77$VAR, link );
        if( NIL == conses_high.member( item_var, result_links, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result_links = ConsesLow.cons( item_var, result_links );
        }
        item_var = list_utilities.replace_last( link, $kw77$VAR );
        if( NIL == conses_high.member( item_var, result_links, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result_links = ConsesLow.cons( item_var, result_links );
        }
        item_var = list_utilities.replace_last( link_first_replaced, $kw77$VAR );
        if( NIL == conses_high.member( item_var, result_links, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result_links = ConsesLow.cons( item_var, result_links );
        }
        cdolist_list_var = cdolist_list_var.rest();
        link = cdolist_list_var.first();
      }
    }
    return ebmt_stringify_list( result_links );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 22310L)
  public static SubLObject ebmt_index_template_input(final SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject template_links = ebmt_template_links( template );
    SubLObject template_string = NIL;
    if( ebmt_template_type( template ) == $kw72$GENERAL )
    {
      SubLObject links = NIL;
      SubLObject cdolist_list_var = template_links;
      SubLObject link = NIL;
      link = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        link = conses_high.subst_if( $kw77$VAR, $sym78$KEYWORDP, link, UNPROVIDED );
        links = ConsesLow.cons( link, links );
        cdolist_list_var = cdolist_list_var.rest();
        link = cdolist_list_var.first();
      }
      template_links = Sequences.nreverse( links );
    }
    template_string = ebmt_stringify_list( get_linkset_unindexed_links( template_links ) );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      template_string = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( template_string ), new SubLObject[] { format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_s_no_copy( ConsesLow.list(
          get_linkset_unindexed_links( ebmt_template_links( template ) ), ebmt_template_cycl( template ), get_linkset_indexed_links( ebmt_template_links( template ) ) ) )
      } );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return template_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 23703L)
  public static SubLObject ebmt_template_index_server_info(SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    lexicon = $kw79$DEFAULT;
    SubLObject host = NIL;
    SubLObject port = NIL;
    SubLObject content = NIL;
    SubLObject log = NIL;
    final SubLObject pcase_var = lexicon;
    if( pcase_var.eql( $kw79$DEFAULT ) )
    {
      host = lucene_index.$ebmt_index_host$.getDynamicValue( thread );
      port = lucene_index.$ebmt_index_port$.getDynamicValue( thread );
      content = lucene_index.$ebmt_index_content$.getDynamicValue( thread );
      log = lucene_index.$ebmt_index_log$.getDynamicValue( thread );
    }
    else
    {
      Errors.error( $str80$Unknown_EBMT_lexicon___S__, lexicon );
    }
    return Values.values( host, port, content, log );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 24624L)
  public static SubLObject ebmt_update_log(final SubLObject log, final SubLObject message)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( log, $kw81$APPEND );
        if( !stream.isStream() )
        {
          Errors.error( $str82$Unable_to_open__S, log );
        }
        final SubLObject s_out = stream;
        PrintLow.format( s_out, $str83$_A__A__, numeric_date_utilities.universal_timestring( UNPROVIDED ), message );
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return log;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 24868L)
  public static SubLObject ebmt_delete_example_from_file(final SubLObject file, final SubLObject example)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      final SubLObject example_string = format_nil.format_nil_s( example );
      SubLObject new_lines = NIL;
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$7 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( file, $kw84$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$7, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str82$Unable_to_open__S, file );
        }
        final SubLObject infile = stream;
        if( infile.isStream() )
        {
          SubLObject line;
          for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
          {
            if( !line.equal( example_string ) )
            {
              new_lines = ConsesLow.cons( line, new_lines );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
        }
      }
      file_utilities.output_text_file( file, new_lines, UNPROVIDED );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 25258L)
  public static SubLObject ebmt_index_template_int(final SubLObject template, final SubLObject host, final SubLObject port)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 25439L)
  public static SubLObject ebmt_index_template(final SubLObject template, SubLObject lexicon, SubLObject verboseP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != ebmt_template_p( template ) : template;
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject host = ebmt_template_index_server_info( lexicon );
    final SubLObject port = thread.secondMultipleValue();
    final SubLObject content = thread.thirdMultipleValue();
    final SubLObject log = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    result = ebmt_index_template_int( template, host, port );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      final SubLObject nl_cycl_pair = ebmt_template_nl_cycl_pair( template );
      final SubLObject log_message = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( result ), new SubLObject[] { $str85$__, format_nil.format_nil_a_no_copy( ebmt_template_type( template ) ), $str86$___,
        format_nil.format_nil_s_no_copy( nl_cycl_pair )
      } );
      if( NIL != verboseP )
      {
        PrintLow.format( T, $str87$_A_____S__, result, template );
      }
      ebmt_update_log( log, log_message );
      if( NIL != nl_cycl_pair && result.equal( $str88$Added ) )
      {
        SubLObject stream = NIL;
        try
        {
          stream = compatibility.open_text( content, $kw81$APPEND );
          if( !stream.isStream() )
          {
            Errors.error( $str82$Unable_to_open__S, content );
          }
          final SubLObject s_out = stream;
          PrintLow.format( s_out, $str89$_S__, nl_cycl_pair );
        }
        finally
        {
          final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
          }
        }
      }
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 26242L)
  public static SubLObject ebmt_create_and_add_templates(final SubLObject nl, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( allow_multiple_matchesP == UNPROVIDED )
    {
      allow_multiple_matchesP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    assert NIL != Types.stringp( nl ) : nl;
    assert NIL != cycl_grammar.cycl_sentence_p( cycl ) : cycl;
    SubLObject cdolist_list_var;
    final SubLObject templates = cdolist_list_var = ebmt_create_templates( nl, cycl, lexicon, allow_multiple_matchesP, verboseP );
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      _csetf_ebmt_template_indexing_result( template, ebmt_index_template( template, lexicon, verboseP ) );
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 26823L)
  public static SubLObject ebmt_find_templates_for_linkage(final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject links = get_linkset_unindexed_links( ebmt_linkset( v_linkage, UNPROVIDED ) );
    final SubLObject linkage_string = ebmt_linkset_string( links, with_varsP );
    SubLObject templates = NIL;
    thread.resetMultipleValues();
    final SubLObject host = ebmt_template_index_server_info( lexicon );
    final SubLObject port = thread.secondMultipleValue();
    final SubLObject content = thread.thirdMultipleValue();
    final SubLObject log = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    templates = NIL;
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      final SubLObject log_message = Sequences.cconcatenate( $str90$Found_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( templates ) ), $str91$_templates_for_linkset__, format_nil
          .format_nil_s_no_copy( linkage_string )
      } );
      ebmt_update_log( log, log_message );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 27541L)
  public static SubLObject ebmt_find_templates(final SubLObject sent, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    assert NIL != Types.stringp( sent ) : sent;
    final SubLObject v_linkage = linkage.new_linkage( string_utilities.strip_sentential_punctuation( sent ), ConsesLow.list( $kw9$LEXICON, lexicon ) );
    return ebmt_find_templates_for_linkage( v_linkage, T, lexicon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 27891L)
  public static SubLObject ebmt_delete_template_int(final SubLObject template, final SubLObject host, final SubLObject port)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 28084L)
  public static SubLObject ebmt_delete_template(final SubLObject template, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != ebmt_template_p( template ) : template;
    thread.resetMultipleValues();
    final SubLObject host = ebmt_template_index_server_info( lexicon );
    final SubLObject port = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 28396L)
  public static SubLObject ebmt_delete_template_using_template_string(final SubLObject template_string, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( template_string ) : template_string;
    thread.resetMultipleValues();
    final SubLObject host = ebmt_template_index_server_info( lexicon );
    final SubLObject port = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 28780L)
  public static SubLObject ebmt_delete_template_using_parse(final SubLObject nl_sent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject interps = ebmt_parse( nl_sent, UNPROVIDED, UNPROVIDED );
    final SubLObject justs = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = justs;
    SubLObject just = NIL;
    just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$10 = just;
      SubLObject just_item = NIL;
      just_item = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        if( NIL != ebmt_template_p( just_item ) )
        {
          ebmt_delete_template( just_item, UNPROVIDED );
        }
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        just_item = cdolist_list_var_$10.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      just = cdolist_list_var.first();
    }
    return $kw92$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 29195L)
  public static SubLObject ebmt_delete_templates_using_example(final SubLObject nl_sent, final SubLObject cycl_sent, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( allow_multiple_matchesP == UNPROVIDED )
    {
      allow_multiple_matchesP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( nl_sent ) : nl_sent;
    assert NIL != cycl_grammar.cycl_sentence_p( cycl_sent ) : cycl_sent;
    final SubLObject templates = ebmt_create_templates( nl_sent, cycl_sent, lexicon, allow_multiple_matchesP, verboseP );
    thread.resetMultipleValues();
    final SubLObject host = ebmt_template_index_server_info( lexicon );
    final SubLObject port = thread.secondMultipleValue();
    final SubLObject content = thread.thirdMultipleValue();
    final SubLObject log = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      SubLObject cdolist_list_var = templates;
      SubLObject template = NIL;
      template = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject nl_cycl_pair = ebmt_template_nl_cycl_pair( template );
        final SubLObject result = ebmt_delete_template_int( template, host, port );
        ebmt_update_log( log, Sequences.cconcatenate( format_nil.format_nil_a_no_copy( result ), new SubLObject[] { $str85$__, format_nil.format_nil_a_no_copy( ebmt_template_type( template ) ), $str86$___, format_nil
            .format_nil_s_no_copy( nl_cycl_pair )
        } ) );
        if( result.equal( $str93$Deleted ) )
        {
          ebmt_delete_example_from_file( content, nl_cycl_pair );
        }
        if( NIL != verboseP )
        {
          PrintLow.format( T, $str94$_A__, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        template = cdolist_list_var.first();
      }
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 30239L)
  public static SubLObject new_ebmt_cycl(SubLObject cycl, SubLObject justification, SubLObject weight)
  {
    if( cycl == UNPROVIDED )
    {
      cycl = NIL;
    }
    if( justification == UNPROVIDED )
    {
      justification = NIL;
    }
    if( weight == UNPROVIDED )
    {
      weight = NIL;
    }
    SubLObject result = conses_high.putf( NIL, $kw38$CYCL, cycl );
    result = conses_high.putf( result, $kw95$JUSTIFICATION, justification );
    result = conses_high.putf( result, $kw40$WEIGHT, weight );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 30829L)
  public static SubLObject copy_ebmt_cycl(final SubLObject ebmt_cycl)
  {
    return conses_high.copy_list( ebmt_cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 30906L)
  public static SubLObject ebmt_cycl_p(final SubLObject thing)
  {
    return list_utilities.property_list_p( thing );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 30978L)
  public static SubLObject set_ebmt_cycl_cycl(final SubLObject ebmt_cycl, final SubLObject cycl)
  {
    return conses_high.putf( ebmt_cycl, $kw38$CYCL, cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31070L)
  public static SubLObject get_ebmt_cycl_cycl(final SubLObject ebmt_cycl)
  {
    return conses_high.getf( ebmt_cycl, $kw38$CYCL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31152L)
  public static SubLObject set_ebmt_cycl_justification(final SubLObject ebmt_cycl, final SubLObject justification)
  {
    return conses_high.putf( ebmt_cycl, $kw95$JUSTIFICATION, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31280L)
  public static SubLObject get_ebmt_cycl_justification(final SubLObject ebmt_cycl)
  {
    return conses_high.getf( ebmt_cycl, $kw95$JUSTIFICATION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31380L)
  public static SubLObject set_ebmt_cycl_weight(final SubLObject ebmt_cycl, final SubLObject weight)
  {
    return conses_high.putf( ebmt_cycl, $kw40$WEIGHT, weight );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31480L)
  public static SubLObject get_ebmt_cycl_weight(final SubLObject ebmt_cycl)
  {
    return conses_high.getf( ebmt_cycl, $kw40$WEIGHT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31566L)
  public static SubLObject compose_ebmt_cycl_justifications(final SubLObject ebmt_cycl, final SubLObject new_ebmt_cycl)
  {
    set_ebmt_cycl_justification( ebmt_cycl, conses_high.union( get_ebmt_cycl_justification( ebmt_cycl ), get_ebmt_cycl_justification( new_ebmt_cycl ), EQUAL, UNPROVIDED ) );
    return ebmt_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31813L)
  public static SubLObject compose_ebmt_cycl_weight(final SubLObject ebmt_cycl, final SubLObject new_ebmt_cycl)
  {
    set_ebmt_cycl_weight( ebmt_cycl, conses_high.union( get_ebmt_cycl_weight( ebmt_cycl ), get_ebmt_cycl_weight( new_ebmt_cycl ), UNPROVIDED, UNPROVIDED ) );
    return ebmt_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32024L)
  public static SubLObject ebmt_cycl_subst(final SubLObject new_ebmt_cycl, final SubLObject old_term, final SubLObject old_ebmt_cycl)
  {
    final SubLObject old_cycl = get_ebmt_cycl_cycl( old_ebmt_cycl );
    final SubLObject new_cycl = get_ebmt_cycl_cycl( new_ebmt_cycl );
    set_ebmt_cycl_cycl( old_ebmt_cycl, cycl_utilities.expression_subst( new_cycl, old_term, old_cycl, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    compose_ebmt_cycl_justifications( old_ebmt_cycl, new_ebmt_cycl );
    compose_ebmt_cycl_weight( old_ebmt_cycl, new_ebmt_cycl );
    return old_ebmt_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject ebmt_template_parsing_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_ebmt_template_parsing_info( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject ebmt_template_parsing_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $ebmt_template_parsing_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject ebmt_template_parsing_info_kw_lw_pairs(final SubLObject v_object)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject ebmt_template_parsing_info_lw_links_pairs(final SubLObject v_object)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject ebmt_template_parsing_info_lw(final SubLObject v_object)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject ebmt_template_parsing_info_processed(final SubLObject v_object)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject ebmt_template_parsing_info_cycl(final SubLObject v_object)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject _csetf_ebmt_template_parsing_info_kw_lw_pairs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject _csetf_ebmt_template_parsing_info_lw_links_pairs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject _csetf_ebmt_template_parsing_info_lw(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject _csetf_ebmt_template_parsing_info_processed(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject _csetf_ebmt_template_parsing_info_cycl(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ebmt_template_parsing_info_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject make_ebmt_template_parsing_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $ebmt_template_parsing_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw115$KW_LW_PAIRS ) )
      {
        _csetf_ebmt_template_parsing_info_kw_lw_pairs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw116$LW_LINKS_PAIRS ) )
      {
        _csetf_ebmt_template_parsing_info_lw_links_pairs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw117$LW ) )
      {
        _csetf_ebmt_template_parsing_info_lw( v_new, current_value );
      }
      else if( pcase_var.eql( $kw118$PROCESSED ) )
      {
        _csetf_ebmt_template_parsing_info_processed( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$CYCL ) )
      {
        _csetf_ebmt_template_parsing_info_cycl( v_new, current_value );
      }
      else
      {
        Errors.error( $str41$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject visit_defstruct_ebmt_template_parsing_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw42$BEGIN, $sym119$MAKE_EBMT_TEMPLATE_PARSING_INFO, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw115$KW_LW_PAIRS, ebmt_template_parsing_info_kw_lw_pairs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw116$LW_LINKS_PAIRS, ebmt_template_parsing_info_lw_links_pairs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw117$LW, ebmt_template_parsing_info_lw( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw118$PROCESSED, ebmt_template_parsing_info_processed( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$SLOT, $kw38$CYCL, ebmt_template_parsing_info_cycl( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$END, $sym119$MAKE_EBMT_TEMPLATE_PARSING_INFO, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
  public static SubLObject visit_defstruct_object_ebmt_template_parsing_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_ebmt_template_parsing_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32871L)
  public static SubLObject new_ebmt_template_parsing_info(SubLObject kw_lw_pairs, SubLObject lw_links_pairs, SubLObject lw, SubLObject processed, SubLObject cycl)
  {
    if( kw_lw_pairs == UNPROVIDED )
    {
      kw_lw_pairs = NIL;
    }
    if( lw_links_pairs == UNPROVIDED )
    {
      lw_links_pairs = NIL;
    }
    if( lw == UNPROVIDED )
    {
      lw = NIL;
    }
    if( processed == UNPROVIDED )
    {
      processed = NIL;
    }
    if( cycl == UNPROVIDED )
    {
      cycl = NIL;
    }
    final SubLObject template_parsing_info = make_ebmt_template_parsing_info( UNPROVIDED );
    _csetf_ebmt_template_parsing_info_kw_lw_pairs( template_parsing_info, kw_lw_pairs );
    _csetf_ebmt_template_parsing_info_lw_links_pairs( template_parsing_info, lw_links_pairs );
    _csetf_ebmt_template_parsing_info_lw( template_parsing_info, lw );
    _csetf_ebmt_template_parsing_info_processed( template_parsing_info, processed );
    _csetf_ebmt_template_parsing_info_cycl( template_parsing_info, cycl );
    return template_parsing_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 33563L)
  public static SubLObject print_ebmt_template_parsing_info(final SubLObject template_parsing_info, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str121$__TEMPLATE_PARSING_INFO______Keyw, new SubLObject[] { ebmt_template_parsing_info_kw_lw_pairs( template_parsing_info ), ebmt_template_parsing_info_lw_links_pairs(
        template_parsing_info ), ebmt_template_parsing_info_lw( template_parsing_info ), ebmt_template_parsing_info_processed( template_parsing_info ), ebmt_template_parsing_info_cycl( template_parsing_info )
    } );
    return template_parsing_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 34193L)
  public static SubLObject ebmt_linkset_linkword_linkset_links_pairs(final SubLObject link_tuples)
  {
    SubLObject llw_ll_pairs = NIL;
    SubLObject cdolist_list_var = link_tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject left_word = linkset_link_left_word( tuple );
      final SubLObject right_word = linkset_link_right_word( tuple );
      llw_ll_pairs = list_utilities.alist_pushnew( llw_ll_pairs, left_word, tuple, EQUAL, EQUAL );
      llw_ll_pairs = list_utilities.alist_pushnew( llw_ll_pairs, right_word, tuple, EQUAL, EQUAL );
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return llw_ll_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 35554L)
  public static SubLObject ebmt_llw_lw_equalP(final SubLObject linkset_link_word, final SubLObject link_word, final SubLObject linkset_lw_linkset_links_pairs)
  {
    return conses_high.subsetp( get_linkset_unindexed_links( list_utilities.alist_lookup( linkset_lw_linkset_links_pairs, linkset_link_word, EQUAL, UNPROVIDED ) ), get_linkset_unindexed_links(
        ebmt_linkset_from_linkage_links( methods.funcall_instance_method_with_0_args( link_word, $sym122$GET_LINKS ), UNPROVIDED ) ), $sym123$LINK_TUPLE_EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 36000L)
  public static SubLObject link_tuple_equal(final SubLObject tuple1, final SubLObject tuple2)
  {
    final SubLObject mtuple1 = ConsesLow.list( tuple1.first(), string_utilities.substring( conses_high.second( tuple1 ), ZERO_INTEGER, ONE_INTEGER ), conses_high.third( tuple1 ) );
    final SubLObject mtuple2 = ConsesLow.list( tuple2.first(), string_utilities.substring( conses_high.second( tuple2 ), ZERO_INTEGER, ONE_INTEGER ), conses_high.third( tuple2 ) );
    SubLObject item1 = NIL;
    SubLObject item1_$11 = NIL;
    SubLObject item2 = NIL;
    SubLObject item2_$12 = NIL;
    item1 = mtuple1;
    item1_$11 = item1.first();
    item2 = mtuple2;
    item2_$12 = item2.first();
    while ( NIL != item2 || NIL != item1)
    {
      if( !item1_$11.isKeyword() && !item2_$12.isKeyword() && ( !item1_$11.equal( $str124$a ) || !item2_$12.equal( $str125$an ) ) && ( !item1_$11.equal( $str125$an ) || !item2_$12.equal( $str124$a ) ) && !item1_$11
          .equal( item2_$12 ) )
      {
        return NIL;
      }
      item1 = item1.rest();
      item1_$11 = item1.first();
      item2 = item2.rest();
      item2_$12 = item2.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 36500L)
  public static SubLObject ebmt_keyword_linkword_pairs(final SubLObject template_links, final SubLObject v_linkage)
  {
    final SubLObject linkset_lw_linkset_links_pairs = ebmt_linkset_linkword_linkset_links_pairs( template_links );
    SubLObject keyword_linkword_pairs = NIL;
    SubLObject linkword_links_pairs = NIL;
    SubLObject linkwords = NIL;
    SubLObject used_links = NIL;
    SubLObject errorP = NIL;
    SubLObject cdolist_list_var = template_links;
    SubLObject link_tuple = NIL;
    link_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject doneP = NIL;
      SubLObject link = NIL;
      final SubLObject vector_var = instances.get_slot( v_linkage, $sym59$LINKS );
      final SubLObject backwardP_var = NIL;
      final SubLObject length = Sequences.length( vector_var );
      SubLObject current;
      final SubLObject datum = current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER ) : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER );
      SubLObject start = NIL;
      SubLObject end = NIL;
      SubLObject delta = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
      start = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
      end = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list126 );
      delta = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == doneP )
        {
          SubLObject end_var;
          SubLObject element_num;
          SubLObject l;
          SubLObject link_left_word;
          SubLObject link_right_word;
          SubLObject linkset_link_left_word;
          SubLObject linkset_link_right_word;
          SubLObject tuple_left_word;
          SubLObject tuple_right_word;
          SubLObject item_var;
          for( end_var = end, element_num = NIL, element_num = start; NIL == doneP && NIL == subl_macros.do_numbers_endtest( element_num, delta, end_var ); element_num = Numbers.add( element_num, delta ) )
          {
            l = Vectors.aref( vector_var, element_num );
            if( NIL != l )
            {
              link = l;
              if( NIL == subl_promotions.memberP( link, used_links, UNPROVIDED, UNPROVIDED ) && linkset_link_name( link_tuple ).equal( ebmt_link_name( link ) ) )
              {
                link_left_word = linkage.link_left_word( link );
                link_right_word = linkage.link_right_word( link );
                linkset_link_left_word = linkset_link_left_word( link_tuple );
                linkset_link_right_word = linkset_link_right_word( link_tuple );
                tuple_left_word = linkset_link_left_word_string( link_tuple );
                tuple_right_word = linkset_link_right_word_string( link_tuple );
                if( tuple_left_word.isKeyword() && tuple_right_word.isKeyword() && NIL != ebmt_llw_lw_equalP( linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs ) && NIL != ebmt_llw_lw_equalP(
                    linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs ) )
                {
                  keyword_linkword_pairs = list_utilities.alist_pushnew( keyword_linkword_pairs, tuple_left_word, link_left_word, Symbols.symbol_function( EQL ), Symbols.symbol_function( EQL ) );
                  keyword_linkword_pairs = list_utilities.alist_pushnew( keyword_linkword_pairs, tuple_right_word, link_right_word, Symbols.symbol_function( EQL ), Symbols.symbol_function( EQL ) );
                  linkword_links_pairs = list_utilities.alist_pushnew( linkword_links_pairs, link_left_word, link, Symbols.symbol_function( EQL ), Symbols.symbol_function( EQL ) );
                  linkword_links_pairs = list_utilities.alist_pushnew( linkword_links_pairs, link_right_word, link, Symbols.symbol_function( EQL ), Symbols.symbol_function( EQL ) );
                  doneP = T;
                }
                else if( tuple_left_word.isKeyword() )
                {
                  if( tuple_right_word.equal( methods.funcall_instance_method_with_0_args( link_right_word, $sym55$GET_STRING ) ) && NIL != ebmt_llw_lw_equalP( linkset_link_left_word, link_left_word,
                      linkset_lw_linkset_links_pairs ) && NIL != ebmt_llw_lw_equalP( linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs ) )
                  {
                    keyword_linkword_pairs = list_utilities.alist_pushnew( keyword_linkword_pairs, tuple_left_word, link_left_word, Symbols.symbol_function( EQL ), Symbols.symbol_function( EQL ) );
                    linkword_links_pairs = list_utilities.alist_pushnew( linkword_links_pairs, link_left_word, link, Symbols.symbol_function( EQL ), Symbols.symbol_function( EQL ) );
                    doneP = T;
                  }
                }
                else if( tuple_right_word.isKeyword() )
                {
                  if( tuple_left_word.equal( methods.funcall_instance_method_with_0_args( link_left_word, $sym55$GET_STRING ) ) && NIL != ebmt_llw_lw_equalP( linkset_link_left_word, link_left_word,
                      linkset_lw_linkset_links_pairs ) && NIL != ebmt_llw_lw_equalP( linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs ) )
                  {
                    keyword_linkword_pairs = list_utilities.alist_pushnew( keyword_linkword_pairs, tuple_right_word, link_right_word, Symbols.symbol_function( EQL ), Symbols.symbol_function( EQL ) );
                    linkword_links_pairs = list_utilities.alist_pushnew( linkword_links_pairs, link_right_word, link, Symbols.symbol_function( EQL ), Symbols.symbol_function( EQL ) );
                    doneP = T;
                  }
                }
                else
                {
                  errorP = T;
                  if( tuple_left_word.equal( methods.funcall_instance_method_with_0_args( link_left_word, $sym55$GET_STRING ) ) && tuple_right_word.equal( methods.funcall_instance_method_with_0_args( link_right_word,
                      $sym55$GET_STRING ) ) && NIL != ebmt_llw_lw_equalP( linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs ) && NIL != ebmt_llw_lw_equalP( linkset_link_right_word, link_right_word,
                          linkset_lw_linkset_links_pairs ) )
                  {
                    errorP = NIL;
                    doneP = T;
                  }
                }
                if( NIL != doneP )
                {
                  used_links = ConsesLow.cons( link, used_links );
                  item_var = link_left_word;
                  if( NIL == conses_high.member( item_var, linkwords, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    linkwords = ConsesLow.cons( item_var, linkwords );
                  }
                  item_var = link_right_word;
                  if( NIL == conses_high.member( item_var, linkwords, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    linkwords = ConsesLow.cons( item_var, linkwords );
                  }
                }
              }
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list126 );
      }
      if( NIL != errorP || NIL == doneP )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      link_tuple = cdolist_list_var.first();
    }
    return Values.values( keyword_linkword_pairs, linkword_links_pairs, linkwords );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 42048L)
  public static SubLObject ebmt_templates_relevant_to_linkword(final SubLObject linkword, final SubLObject template_parsing_info_alist)
  {
    SubLObject templates = NIL;
    SubLObject cdolist_list_var = template_parsing_info_alist;
    SubLObject templateXtemplate_parsing_info = NIL;
    templateXtemplate_parsing_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject template_parsing_info = templateXtemplate_parsing_info.rest();
      if( NIL == ebmt_template_parsing_info_processed( template_parsing_info ) && NIL != subl_promotions.memberP( linkword, ebmt_template_parsing_info_lw( template_parsing_info ), UNPROVIDED, UNPROVIDED ) )
      {
        templates = ConsesLow.cons( templateXtemplate_parsing_info.first(), templates );
      }
      cdolist_list_var = cdolist_list_var.rest();
      templateXtemplate_parsing_info = cdolist_list_var.first();
    }
    return templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 42574L)
  public static SubLObject ebmt_used_linkwords(final SubLObject template_parsing_info_alist)
  {
    SubLObject used_linkwords = NIL;
    SubLObject cdolist_list_var = template_parsing_info_alist;
    SubLObject templateXtemplate_parsing_info = NIL;
    templateXtemplate_parsing_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      used_linkwords = conses_high.nunion( used_linkwords, ebmt_template_parsing_info_lw( templateXtemplate_parsing_info.rest() ), EQ, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      templateXtemplate_parsing_info = cdolist_list_var.first();
    }
    return used_linkwords;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 42921L)
  public static SubLObject strings_of_linkwords(final SubLObject linkwords)
  {
    SubLObject strings = NIL;
    SubLObject cdolist_list_var = linkwords;
    SubLObject lw = NIL;
    lw = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      strings = ConsesLow.cons( methods.funcall_instance_method_with_0_args( lw, $sym55$GET_STRING ), strings );
      cdolist_list_var = cdolist_list_var.rest();
      lw = cdolist_list_var.first();
    }
    return Sequences.nreverse( strings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
  public static SubLObject clear_ebmt_cycls_for_phrase()
  {
    final SubLObject cs = $ebmt_cycls_for_phrase_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
  public static SubLObject remove_ebmt_cycls_for_phrase(final SubLObject phrase, final SubLObject category)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $ebmt_cycls_for_phrase_caching_state$.getGlobalValue(), ConsesLow.list( phrase, category ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
  public static SubLObject ebmt_cycls_for_phrase_internal(final SubLObject phrase, final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    if( NIL != subl_promotions.memberP( category, $list128, EQ, UNPROVIDED ) )
    {
      cycls = parsing_utilities.parse_dates_and_numbers( phrase, $list129, NIL, UNPROVIDED, UNPROVIDED );
      cycls = conses_high.union( cycls, english_quantity_parser.string_to_quantities( phrase ), $sym130$EQUALS_EL_, UNPROVIDED );
    }
    if( NIL != $ebmt_exclude_predsP$.getDynamicValue( thread ) && NIL != subl_promotions.memberP( category, $list131, EQ, UNPROVIDED ) )
    {
      SubLObject np_cycls = NIL;
      final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding( thread );
      final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = parsing_vars.$psp_pos_pred_filterP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = parsing_vars.$psp_pos_pred_filter_preds$.currentBinding( thread );
      try
      {
        parsing_vars.$psp_return_mode$.bind( $kw132$BEST_ONLY, thread );
        parsing_vars.$npp_use_nl_tagsP$.bind( NIL, thread );
        parsing_vars.$psp_pos_pred_filterP$.bind( T, thread );
        parsing_vars.$psp_pos_pred_filter_preds$.bind( ConsesLow.cons( $const133$familyName, parsing_vars.$psp_pos_pred_filter_preds$.getDynamicValue( thread ) ), thread );
        SubLObject timed_outP = NIL;
        final SubLObject _prev_bind_0_$13 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding( thread );
        final SubLObject _prev_bind_1_$14 = parsing_macros.$parsing_timeout_time$.currentBinding( thread );
        final SubLObject _prev_bind_2_$15 = parsing_macros.$parsing_timeout_reachedP$.currentBinding( thread );
        try
        {
          parsing_macros.$parsing_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
          parsing_macros.$parsing_timeout_time$.bind( parsing_macros.parsing_compute_timeout_time( $ebmt_phrase_interp_timeout$.getDynamicValue( thread ) ), thread );
          parsing_macros.$parsing_timeout_reachedP$.bind( parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ), thread );
          parsing_macros.$parsing_timeout_reachedP$.setDynamicValue( parsing_macros.parsing_timeout_time_reachedP(), thread );
          if( NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ) )
          {
            np_cycls = psp_main.ps_get_cycls_for_np( phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          timed_outP = parsing_macros.parsing_timeout_time_reachedP();
        }
        finally
        {
          parsing_macros.$parsing_timeout_reachedP$.rebind( _prev_bind_2_$15, thread );
          parsing_macros.$parsing_timeout_time$.rebind( _prev_bind_1_$14, thread );
          parsing_macros.$parsing_timeout_time_check_count$.rebind( _prev_bind_0_$13, thread );
        }
      }
      finally
      {
        parsing_vars.$psp_pos_pred_filter_preds$.rebind( _prev_bind_4, thread );
        parsing_vars.$psp_pos_pred_filterP$.rebind( _prev_bind_3, thread );
        parsing_vars.$npp_use_nl_tagsP$.rebind( _prev_bind_2, thread );
        parsing_vars.$psp_return_mode$.rebind( _prev_bind_0, thread );
      }
      if( NIL != np_cycls )
      {
        return conses_high.union( cycls, np_cycls, UNPROVIDED, UNPROVIDED );
      }
    }
    final SubLObject _prev_bind_5 = parsing_vars.$psp_return_mode$.currentBinding( thread );
    final SubLObject _prev_bind_6 = parsing_vars.$npp_use_nl_tagsP$.currentBinding( thread );
    try
    {
      parsing_vars.$psp_return_mode$.bind( $kw132$BEST_ONLY, thread );
      parsing_vars.$npp_use_nl_tagsP$.bind( NIL, thread );
      SubLObject timed_outP2 = NIL;
      final SubLObject _prev_bind_0_$14 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding( thread );
      final SubLObject _prev_bind_1_$15 = parsing_macros.$parsing_timeout_time$.currentBinding( thread );
      final SubLObject _prev_bind_7 = parsing_macros.$parsing_timeout_reachedP$.currentBinding( thread );
      try
      {
        parsing_macros.$parsing_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
        parsing_macros.$parsing_timeout_time$.bind( parsing_macros.parsing_compute_timeout_time( $ebmt_phrase_interp_timeout$.getDynamicValue( thread ) ), thread );
        parsing_macros.$parsing_timeout_reachedP$.bind( parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ), thread );
        parsing_macros.$parsing_timeout_reachedP$.setDynamicValue( parsing_macros.parsing_timeout_time_reachedP(), thread );
        if( NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ) )
        {
          cycls = conses_high.union( cycls, psp_main.ps_get_cycls_for_phrase( phrase, category, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
          if( NIL == cycls && !lexicon_utilities.bar_level( category, UNPROVIDED ).eql( TWO_INTEGER ) )
          {
            final SubLObject head_cat = lexicon_utilities.pos_of_cat( category, UNPROVIDED );
            final SubLObject phrase_cat = ConsesLow.list( $const134$PhraseFn, head_cat );
            cycls = psp_main.ps_get_cycls_for_phrase( phrase, phrase_cat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
        }
        timed_outP2 = parsing_macros.parsing_timeout_time_reachedP();
      }
      finally
      {
        parsing_macros.$parsing_timeout_reachedP$.rebind( _prev_bind_7, thread );
        parsing_macros.$parsing_timeout_time$.rebind( _prev_bind_1_$15, thread );
        parsing_macros.$parsing_timeout_time_check_count$.rebind( _prev_bind_0_$14, thread );
      }
    }
    finally
    {
      parsing_vars.$npp_use_nl_tagsP$.rebind( _prev_bind_6, thread );
      parsing_vars.$psp_return_mode$.rebind( _prev_bind_5, thread );
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
  public static SubLObject ebmt_cycls_for_phrase(final SubLObject phrase, final SubLObject category)
  {
    SubLObject caching_state = $ebmt_cycls_for_phrase_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym127$EBMT_CYCLS_FOR_PHRASE, $sym135$_EBMT_CYCLS_FOR_PHRASE_CACHING_STATE_, $int136$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( phrase, category );
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
        if( phrase.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && category.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( ebmt_cycls_for_phrase_internal( phrase, category ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( phrase, category ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 45208L)
  public static SubLObject ebmt_penntag_to_cycl_category(final SubLObject penntag)
  {
    final SubLObject cycl_penntag = parsing_utilities.penntag_to_cycl( print_high.princ_to_string( penntag ) );
    SubLObject category = ( NIL != cycl_penntag ) ? parsing_utilities.penntag_category( cycl_penntag ) : NIL;
    if( category.eql( $const137$ProperNoun ) )
    {
      category = $const138$NounPhrase;
    }
    return ( NIL != category ) ? category : $kw139$ANY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 45625L)
  public static SubLObject ebmt_cycls_using_link_word_only(final SubLObject link_word, final SubLObject nl_sent, final SubLObject used_lw)
  {
    SubLObject cycls = NIL;
    SubLObject phrase = NIL;
    SubLObject category = NIL;
    SubLObject lw_used = NIL;
    if( NIL != linkage.noun_link_word_p( link_word ) )
    {
      SubLObject modifiers = Sequences.remove_if( $sym140$PREPOSITION_LINK_WORD_P, methods.funcall_instance_method_with_0_args( link_word, $sym141$GET_MODIFIERS ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      modifiers = conses_high.set_difference( modifiers, used_lw, Symbols.symbol_function( EQ ), UNPROVIDED );
      if( NIL != modifiers )
      {
        lw_used = ConsesLow.cons( link_word, modifiers );
        phrase = string_utilities.bunge_according_to_string( strings_of_linkwords( Sort.sort( conses_high.copy_list( lw_used ), $sym47$_, $sym142$GET_LINK_WORD_ABS_INDEX ) ), nl_sent, UNPROVIDED, UNPROVIDED,
            UNPROVIDED );
        category = $const138$NounPhrase;
        cycls = ebmt_cycls_for_phrase( phrase, category );
      }
    }
    if( NIL == cycls )
    {
      phrase = methods.funcall_instance_method_with_0_args( link_word, $sym55$GET_STRING );
      category = ebmt_penntag_to_cycl_category( methods.funcall_instance_method_with_0_args( link_word, $sym143$GET_POS ) );
      cycls = ebmt_cycls_for_phrase( phrase, category );
      lw_used = ConsesLow.list( link_word );
    }
    return Values.values( cycls, phrase, category, lw_used );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 46739L)
  public static SubLObject ebmt_cycls_for_link_word(final SubLObject link_word, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject nl_sentence, final SubLObject used_lw)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject link_phrase = linkage.get_link_phrase( ConsesLow.list( link_word ) );
    SubLObject doneP = NIL;
    SubLObject cycls = NIL;
    while ( NIL == doneP)
    {
      final SubLObject lp_lw = ( NIL != link_phrase ) ? methods.funcall_instance_method_with_0_args( link_phrase, $sym144$YIELD ) : NIL;
      if( NIL == conses_high.intersection( used_lw, lp_lw, EQ, UNPROVIDED ) )
      {
        if( NIL != lp_lw )
        {
          if( NIL == subl_promotions.memberP( link_word, lp_lw, UNPROVIDED, UNPROVIDED ) )
          {
            link_phrase = link_word;
          }
        }
        else
        {
          link_phrase = link_word;
        }
        SubLObject phrase = methods.funcall_instance_method_with_0_args( link_phrase, $sym55$GET_STRING );
        SubLObject category = ebmt_penntag_to_cycl_category( methods.funcall_instance_method_with_0_args( link_phrase, $sym145$GET_CATEGORY ) );
        SubLObject lw_used = methods.funcall_instance_method_with_0_args( link_phrase, $sym144$YIELD );
        if( NIL != linkage.link_word_p( link_phrase ) )
        {
          thread.resetMultipleValues();
          final SubLObject cycls_$18 = ebmt_cycls_using_link_word_only( link_word, nl_sentence, used_lw );
          final SubLObject phrase_$19 = thread.secondMultipleValue();
          final SubLObject category_$20 = thread.thirdMultipleValue();
          final SubLObject lw_used_$21 = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          cycls = cycls_$18;
          phrase = phrase_$19;
          category = category_$20;
          lw_used = lw_used_$21;
          doneP = T;
        }
        else
        {
          cycls = ebmt_cycls_for_phrase( phrase, category );
        }
        if( NIL != cycls )
        {
          SubLObject cdolist_list_var = cycls;
          SubLObject cycl = NIL;
          cycl = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject item_var = new_ebmt_cycl( cycl, ConsesLow.list( ConsesLow.list( phrase, category, cycl ) ), lw_used );
            if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var, result );
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
          }
          doneP = T;
        }
      }
      if( NIL == doneP )
      {
        link_phrase = methods.funcall_instance_method_with_0_args( link_phrase, $sym146$GET_HEAD_DAUGHTER );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 48764L)
  public static SubLObject ebmt_keyword_cycls_pairs(final SubLObject template, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject nl_sentence)
  {
    SubLObject keyword_cycls_pairs = NIL;
    SubLObject cdolist_list_var = ebmt_template_parsing_info_kw_lw_pairs( list_utilities.alist_lookup( template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED ) );
    SubLObject keyword_linkword_pair = NIL;
    keyword_linkword_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject keyword = keyword_linkword_pair.first();
      final SubLObject linkwords = keyword_linkword_pair.rest();
      final SubLObject already_used_lw = conses_high.set_difference( ebmt_used_linkwords( template_parsing_info_alist ), linkwords, EQ, UNPROVIDED );
      SubLObject ebmt_cycls = NIL;
      SubLObject cdolist_list_var_$22 = linkwords;
      SubLObject link_word = NIL;
      link_word = cdolist_list_var_$22.first();
      while ( NIL != cdolist_list_var_$22)
      {
        ebmt_cycls = conses_high.union( ebmt_cycls, ebmt_cycls_for_link_word( link_word, template_parsing_info_alist, v_linkage, nl_sentence, already_used_lw ), UNPROVIDED, UNPROVIDED );
        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
        link_word = cdolist_list_var_$22.first();
      }
      if( NIL == ebmt_cycls )
      {
        return NIL;
      }
      keyword_cycls_pairs = conses_high.acons( keyword, ConsesLow.list( ebmt_cycls ), keyword_cycls_pairs );
      cdolist_list_var = cdolist_list_var.rest();
      keyword_linkword_pair = cdolist_list_var.first();
    }
    return keyword_cycls_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 50025L)
  public static SubLObject ebmt_remove_invalid_cycls(final SubLObject ebmt_cycls)
  {
    SubLObject valid_ebmt_cycls = NIL;
    SubLObject cdolist_list_var = ebmt_cycls;
    SubLObject ebmt_cycl = NIL;
    ebmt_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cycl = get_ebmt_cycl_cycl( ebmt_cycl );
      if( NIL == cycl_utilities.expression_find_if( $sym78$KEYWORDP, cycl, UNPROVIDED, UNPROVIDED ) )
      {
        valid_ebmt_cycls = ConsesLow.cons( ebmt_cycl, valid_ebmt_cycls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ebmt_cycl = cdolist_list_var.first();
    }
    return valid_ebmt_cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 50373L)
  public static SubLObject ebmt_parses_using_template(final SubLObject template, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject nl_sentence)
  {
    final SubLObject template_parsing_info = list_utilities.alist_lookup( template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED );
    SubLObject ebmt_cycls = ConsesLow.list( new_ebmt_cycl( ebmt_template_cycl( template ), ebmt_template_justification( template ), ebmt_template_parsing_info_lw( template_parsing_info ) ) );
    _csetf_ebmt_template_parsing_info_processed( template_parsing_info, T );
    if( NIL != with_varsP && NIL != ebmt_template_parsing_info_kw_lw_pairs( template_parsing_info ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject keyword_cycls_pairs = cdolist_list_var = ebmt_keyword_cycls_pairs( template, template_parsing_info_alist, v_linkage, nl_sentence );
      SubLObject keyword_cycls_pair = NIL;
      keyword_cycls_pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject kw_cycls_pair_value = keyword_cycls_pair.rest();
        SubLObject ans_cycls = NIL;
        SubLObject cdolist_list_var_$23 = ebmt_cycls;
        SubLObject ebmt_cycl = NIL;
        ebmt_cycl = cdolist_list_var_$23.first();
        while ( NIL != cdolist_list_var_$23)
        {
          SubLObject cdolist_list_var_$24 = kw_cycls_pair_value.first();
          SubLObject cycl_subst = NIL;
          cycl_subst = cdolist_list_var_$24.first();
          while ( NIL != cdolist_list_var_$24)
          {
            ans_cycls = ConsesLow.cons( ebmt_cycl_subst( cycl_subst, keyword_cycls_pair.first(), copy_ebmt_cycl( ebmt_cycl ) ), ans_cycls );
            cdolist_list_var_$24 = cdolist_list_var_$24.rest();
            cycl_subst = cdolist_list_var_$24.first();
          }
          cdolist_list_var_$23 = cdolist_list_var_$23.rest();
          ebmt_cycl = cdolist_list_var_$23.first();
        }
        ebmt_cycls = ans_cycls;
        cdolist_list_var = cdolist_list_var.rest();
        keyword_cycls_pair = cdolist_list_var.first();
      }
    }
    ebmt_cycls = ebmt_remove_invalid_cycls( ebmt_cycls );
    if( NIL == ebmt_cycls )
    {
      Errors.error( $str147$Unable_to_understand_some_of_the_ );
    }
    _csetf_ebmt_template_parsing_info_cycl( template_parsing_info, ebmt_cycls );
    return ebmt_cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 52313L)
  public static SubLObject ebmt_template_parsing_info_alist(final SubLObject templates, final SubLObject v_linkage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject template_parsing_info_alist = NIL;
    SubLObject cdolist_list_var = templates;
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject template_links = ebmt_template_links( template );
      if( Sequences.length( instances.get_slot( v_linkage, $sym59$LINKS ) ).numGE( Numbers.add( Sequences.length( template_links ), TWO_INTEGER ) ) )
      {
        thread.resetMultipleValues();
        final SubLObject keyword_linkword_pairs = ebmt_keyword_linkword_pairs( Sequences.remove_duplicates( template_links, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED ), v_linkage );
        final SubLObject linkword_links_pairs = thread.secondMultipleValue();
        final SubLObject linkwords = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != keyword_linkword_pairs || NIL == cycl_utilities.expression_find_if( $sym78$KEYWORDP, ebmt_template_cycl( template ), UNPROVIDED, UNPROVIDED ) )
        {
          template_parsing_info_alist = conses_high.acons( template, new_ebmt_template_parsing_info( keyword_linkword_pairs, linkword_links_pairs, linkwords, UNPROVIDED, UNPROVIDED ), template_parsing_info_alist );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return template_parsing_info_alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 53416L)
  public static SubLObject ebmt_parse_parts(final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject lexicon, final SubLObject nl_sentence)
  {
    SubLObject templates = ebmt_find_templates_for_linkage( v_linkage, with_varsP, lexicon );
    final SubLObject template_parsing_info_alist = ebmt_template_parsing_info_alist( templates, v_linkage );
    SubLObject all_cycls = NIL;
    templates = list_utilities.alist_keys( template_parsing_info_alist );
    if( NIL != templates )
    {
      while ( NIL != templates)
      {
        final SubLObject template = templates.first();
        final SubLObject template_parsing_info = list_utilities.alist_lookup( template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED );
        SubLObject ebmt_cycls = NIL;
        if( NIL != ebmt_template_parsing_info_processed( template_parsing_info ) )
        {
          ebmt_cycls = ebmt_template_parsing_info_cycl( template_parsing_info );
        }
        else
        {
          ebmt_cycls = ebmt_parses_using_template( template, template_parsing_info_alist, v_linkage, with_varsP, nl_sentence );
        }
        if( NIL != ebmt_cycls )
        {
          all_cycls = Sequences.cconcatenate( all_cycls, ebmt_cycls );
        }
        templates = templates.rest();
      }
      return Values.values( all_cycls, NIL );
    }
    return Values.values( NIL, $str148$No_matching_templates_found_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 54767L)
  public static SubLObject ebmt_relevant_cycl_parts(final SubLObject parse_parts, final SubLObject wff_check_mt)
  {
    SubLObject unique_linkages = NIL;
    SubLObject lw_cycl_pairs = NIL;
    SubLObject cdolist_list_var = parse_parts;
    SubLObject part = NIL;
    part = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject doneP = NIL;
      if( NIL != wff_check_mt && NIL == cyclifier.cyclifier_wffP( get_ebmt_cycl_cycl( part ), UNPROVIDED ) )
      {
        doneP = T;
      }
      if( NIL == doneP )
      {
        final SubLObject v_linkage = get_ebmt_cycl_weight( part );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = unique_linkages;
          SubLObject unique_linkage = NIL;
          unique_linkage = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            if( NIL != conses_high.subsetp( v_linkage, unique_linkage, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL != conses_high.subsetp( unique_linkage, v_linkage, UNPROVIDED, UNPROVIDED ) )
              {
                lw_cycl_pairs = list_utilities.alist_push( lw_cycl_pairs, v_linkage, part, $sym149$SETS_EQUAL_ );
              }
              doneP = T;
            }
            else if( NIL != conses_high.subsetp( unique_linkage, v_linkage, UNPROVIDED, UNPROVIDED ) )
            {
              lw_cycl_pairs = list_utilities.alist_delete( lw_cycl_pairs, unique_linkage, $sym149$SETS_EQUAL_ );
              lw_cycl_pairs = list_utilities.alist_push( lw_cycl_pairs, v_linkage, part, $sym149$SETS_EQUAL_ );
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            unique_linkage = csome_list_var.first();
          }
        }
        if( NIL == doneP )
        {
          lw_cycl_pairs = list_utilities.alist_push( lw_cycl_pairs, v_linkage, part, $sym149$SETS_EQUAL_ );
        }
      }
      unique_linkages = list_utilities.alist_keys( lw_cycl_pairs );
      cdolist_list_var = cdolist_list_var.rest();
      part = cdolist_list_var.first();
    }
    return list_utilities.alist_values( lw_cycl_pairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 56118L)
  public static SubLObject conjoin_ebmt_cycls(final SubLObject ebmt_cycls)
  {
    final SubLObject final_ebmt_cycl = copy_ebmt_cycl( ebmt_cycls.first() );
    SubLObject cdolist_list_var = ebmt_cycls.rest();
    SubLObject ebmt_cycl = NIL;
    ebmt_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set_ebmt_cycl_cycl( final_ebmt_cycl, simplifier.conjoin( ConsesLow.list( get_ebmt_cycl_cycl( final_ebmt_cycl ), get_ebmt_cycl_cycl( ebmt_cycl ) ), T ) );
      set_ebmt_cycl_justification( final_ebmt_cycl, get_ebmt_cycl_justification( compose_ebmt_cycl_justifications( final_ebmt_cycl, ebmt_cycl ) ) );
      set_ebmt_cycl_weight( final_ebmt_cycl, get_ebmt_cycl_weight( compose_ebmt_cycl_weight( final_ebmt_cycl, ebmt_cycl ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      ebmt_cycl = cdolist_list_var.first();
    }
    return final_ebmt_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 56742L)
  public static SubLObject ebmt_merge_parse_parts(final SubLObject parse_parts, final SubLObject wff_check_mt)
  {
    final SubLObject cycl_parts = ebmt_relevant_cycl_parts( parse_parts, wff_check_mt );
    SubLObject parses = NIL;
    SubLObject cdolist_list_var = list_utilities.cross_products( cycl_parts );
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject parse = ( NIL != list_utilities.singletonP( cycl ) ) ? cycl.first() : conjoin_ebmt_cycls( cycl );
      if( NIL != wff_check_mt )
      {
        if( NIL != cyclifier.cyclifier_wffP( get_ebmt_cycl_cycl( parse ), UNPROVIDED ) )
        {
          parses = ConsesLow.cons( parse, parses );
        }
      }
      else
      {
        parses = ConsesLow.cons( parse, parses );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 57262L)
  public static SubLObject ebmt_parse(final SubLObject sent, SubLObject lexicon, SubLObject semantic_mt)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( semantic_mt == UNPROVIDED )
    {
      semantic_mt = $const68$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( sent ) : sent;
    SubLObject err_msg = NIL;
    SubLObject v_linkage = NIL;
    SubLObject cycls = NIL;
    SubLObject justifications = NIL;
    SubLObject weights = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym69$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          v_linkage = linkage.new_linkage( string_utilities.strip_sentential_punctuation( sent ), ConsesLow.list( $kw9$LEXICON, lexicon ) );
          if( NIL == v_linkage )
          {
            Errors.error( $str150$Failed_to_compute_a_linkage_for__, sent );
          }
          thread.resetMultipleValues();
          final SubLObject cycls_$25 = ebmt_parse_linkage( v_linkage, sent, lexicon, semantic_mt );
          final SubLObject justifications_$26 = thread.secondMultipleValue();
          final SubLObject weights_$27 = thread.thirdMultipleValue();
          final SubLObject err_msg_$28 = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          cycls = cycls_$25;
          justifications = justifications_$26;
          weights = weights_$27;
          err_msg = err_msg_$28;
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
      err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != err_msg )
    {
      return Values.values( NIL, NIL, NIL, err_msg );
    }
    return Values.values( cycls, justifications, weights );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 58105L)
  public static SubLObject ebmt_parse_exclude_preds(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject values = NIL;
    final SubLObject _prev_bind_0 = $ebmt_exclude_predsP$.currentBinding( thread );
    try
    {
      $ebmt_exclude_predsP$.bind( T, thread );
      values = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( ebmt_parse( string, UNPROVIDED, UNPROVIDED ) ) );
    }
    finally
    {
      $ebmt_exclude_predsP$.rebind( _prev_bind_0, thread );
    }
    return Functions.apply( Symbols.symbol_function( $sym151$VALUES ), values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 58364L)
  public static SubLObject ebmt_parse_linkage(final SubLObject v_linkage, final SubLObject sent, SubLObject lexicon, SubLObject semantic_mt)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( semantic_mt == UNPROVIDED )
    {
      semantic_mt = $const68$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject parse_parts = ebmt_parse_parts( v_linkage, T, lexicon, sent );
    SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject cycls = NIL;
    SubLObject justifications = NIL;
    SubLObject weights = NIL;
    SubLObject cdolist_list_var;
    final SubLObject ebmt_cycls = cdolist_list_var = ebmt_merge_parse_parts( parse_parts, semantic_mt );
    SubLObject ebmt_cycl = NIL;
    ebmt_cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( get_ebmt_cycl_cycl( ebmt_cycl ), cycls, UNPROVIDED, UNPROVIDED ) || NIL == subl_promotions.memberP( get_ebmt_cycl_justification( ebmt_cycl ), justifications, UNPROVIDED,
          UNPROVIDED ) )
      {
        cycls = ConsesLow.cons( get_ebmt_cycl_cycl( ebmt_cycl ), cycls );
        justifications = ConsesLow.cons( get_ebmt_cycl_justification( ebmt_cycl ), justifications );
        weights = ConsesLow.cons( Numbers.divide( Sequences.length( get_ebmt_cycl_weight( ebmt_cycl ) ), Numbers.subtract( Sequences.length( instances.get_slot( v_linkage, $sym60$WORDS ) ), TWO_INTEGER ) ), weights );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ebmt_cycl = cdolist_list_var.first();
    }
    if( NIL == ebmt_cycls && NIL == error )
    {
      error = $str152$Wff_checking_rejected_all_cycl_;
    }
    return Values.values( cycls, justifications, weights, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 59296L)
  public static SubLObject ebmt_parse_from_template(final SubLObject nl_sentence, final SubLObject template, SubLObject lexicon, SubLObject semantic_mt, SubLObject with_varsP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( semantic_mt == UNPROVIDED )
    {
      semantic_mt = $const68$InferencePSC;
    }
    if( with_varsP == UNPROVIDED )
    {
      with_varsP = T;
    }
    final SubLObject v_linkage = linkage.new_linkage( string_utilities.strip_sentential_punctuation( nl_sentence ), ConsesLow.list( $kw9$LEXICON, lexicon ) );
    final SubLObject template_parsing_info_alist = ebmt_template_parsing_info_alist( ConsesLow.list( template ), v_linkage );
    final SubLObject template_parsing_info = list_utilities.alist_lookup( template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED );
    final SubLObject ebmt_cycls = ( NIL != ebmt_template_parsing_info_p( template_parsing_info ) && NIL != ebmt_template_parsing_info_processed( template_parsing_info ) ) ? ebmt_template_parsing_info_cycl(
        template_parsing_info )
        : ( ( NIL != list_utilities.non_empty_list_p( template_parsing_info_alist ) ) ? ebmt_parses_using_template( template, template_parsing_info_alist, v_linkage, with_varsP, nl_sentence ) : NIL );
    return ebmt_cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 60201L)
  public static SubLObject ebmt_create_and_test_templates(final SubLObject training_nl, final SubLObject training_cycl, final SubLObject test_nl, SubLObject test_cycl, SubLObject lexicon,
      SubLObject allow_multiple_matchesP, SubLObject semantic_mt, SubLObject verboseP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( allow_multiple_matchesP == UNPROVIDED )
    {
      allow_multiple_matchesP = NIL;
    }
    if( semantic_mt == UNPROVIDED )
    {
      semantic_mt = $const68$InferencePSC;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    assert NIL != Types.stringp( training_nl ) : training_nl;
    assert NIL != cycl_grammar.cycl_sentence_p( training_cycl ) : training_cycl;
    assert NIL != Types.stringp( test_nl ) : test_nl;
    assert NIL != cycl_grammar.cycl_sentence_p( test_cycl ) : test_cycl;
    test_cycl = ebmt_canonicalize_el_sentence( test_cycl, $const68$InferencePSC );
    final SubLObject templates = ebmt_create_templates( training_nl, training_cycl, lexicon, allow_multiple_matchesP, verboseP );
    SubLObject test_result = $kw153$FAILURE;
    SubLObject other_parsesP = NIL;
    SubLObject cdolist_list_var = templates;
    SubLObject template = NIL;
    template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject parse_result = ebmt_parse_from_template( test_nl, template, lexicon, semantic_mt, UNPROVIDED );
      SubLObject template_test_result = $kw153$FAILURE;
      SubLObject cdolist_list_var_$29 = parse_result;
      SubLObject ebmt_cycl = NIL;
      ebmt_cycl = cdolist_list_var_$29.first();
      while ( NIL != cdolist_list_var_$29)
      {
        final SubLObject result_cycl = get_ebmt_cycl_cycl( ebmt_cycl );
        if( result_cycl.equalp( test_cycl ) )
        {
          test_result = $kw154$SUCCESS;
          template_test_result = $kw154$SUCCESS;
        }
        else
        {
          other_parsesP = T;
        }
        cdolist_list_var_$29 = cdolist_list_var_$29.rest();
        ebmt_cycl = cdolist_list_var_$29.first();
      }
      if( NIL != verboseP )
      {
        PrintLow.format( T, $str155$__Template_Parse_Result___S___S__, template_test_result, parse_result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      template = cdolist_list_var.first();
    }
    return Values.values( test_result, other_parsesP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 61679L)
  public static SubLObject ebmt_valid_training_cyclP(final SubLObject cycl)
  {
    if( NIL == cycl_grammar.cycl_sentence_p( cycl ) || NIL != fort_types_interface.predicate_p( cycl_utilities.formula_arg1( cycl, UNPROVIDED ) ) || NIL != subl_promotions.memberP( cycl_utilities.formula_arg0( cycl ),
        $list156, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 61912L)
  public static SubLObject ebmt_generate_random_samples_from_kb(SubLObject n, SubLObject verboseP)
  {
    if( n == UNPROVIDED )
    {
      n = $int157$100;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    SubLObject num_samples = ZERO_INTEGER;
    while ( num_samples.numL( n ))
    {
      final SubLObject cycl = cycl_utilities.hl_to_el( assertions_high.assertion_cons( assertions_high.random_assertion( UNPROVIDED ) ) );
      if( NIL != cycl && NIL != ebmt_valid_training_cyclP( cycl ) )
      {
        SubLObject cdolist_list_var;
        final SubLObject glosses = cdolist_list_var = pph_methods_lexicon.all_phrases_for_formula( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject gloss = NIL;
        gloss = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$30 = ebmt_create_and_add_templates( gloss, cycl, new_ebmt_lexicon( UNPROVIDED ), NIL, verboseP );
          SubLObject template = NIL;
          template = cdolist_list_var_$30.first();
          while ( NIL != cdolist_list_var_$30)
          {
            if( ebmt_template_indexing_result( template ).equal( $str88$Added ) )
            {
              num_samples = Numbers.add( num_samples, ONE_INTEGER );
            }
            cdolist_list_var_$30 = cdolist_list_var_$30.rest();
            template = cdolist_list_var_$30.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          gloss = cdolist_list_var.first();
        }
      }
    }
    return num_samples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 62649L)
  public static SubLObject populate_ebmt_index_using_file(final SubLObject f_in, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( allow_multiple_matchesP == UNPROVIDED )
    {
      allow_multiple_matchesP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject template_counter = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( $str158$Populating_EBMT_Template_Index___ );
        SubLObject stream = NIL;
        try
        {
          final SubLObject _prev_bind_0_$31 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream = compatibility.open_text( f_in, $kw84$INPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$31, thread );
          }
          if( !stream.isStream() )
          {
            Errors.error( $str82$Unable_to_open__S, f_in );
          }
          final SubLObject stream_var = stream;
          if( stream_var.isStream() )
          {
            final SubLObject length_var = streams_high.file_length( stream_var );
            final SubLObject stream_var_$32 = stream_var;
            SubLObject line_number_var = NIL;
            SubLObject file_line = NIL;
            line_number_var = ZERO_INTEGER;
            for( file_line = file_utilities.do_stream_lines_get_next_line( stream_var_$32 ); NIL != file_line; file_line = file_utilities.do_stream_lines_get_next_line( stream_var_$32 ) )
            {
              final SubLObject line = reader.read_from_string( file_line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject cdolist_list_var = ebmt_create_and_add_templates( line.first(), conses_high.second( line ), lexicon, allow_multiple_matchesP, verboseP );
              SubLObject template = NIL;
              template = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                if( ebmt_template_indexing_result( template ).equal( $str88$Added ) )
                {
                  template_counter = Numbers.add( template_counter, ONE_INTEGER );
                }
                cdolist_list_var = cdolist_list_var.rest();
                template = cdolist_list_var.first();
              }
              utilities_macros.note_percent_progress( streams_high.file_position( stream_var, UNPROVIDED ), length_var );
              line_number_var = number_utilities.f_1X( line_number_var );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
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
    return template_counter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 63401L)
  public static SubLObject ebmt_populate_index_from_mt(SubLObject mt, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const159$AllEBMTTrainingExamplesCollectorM;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = new_ebmt_lexicon( UNPROVIDED );
    }
    if( allow_multiple_matchesP == UNPROVIDED )
    {
      allow_multiple_matchesP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    SubLObject num_templates = ZERO_INTEGER;
    SubLObject cdolist_list_var = ask_utilities.query_template( $list160, $list161, mt, UNPROVIDED );
    SubLObject example = NIL;
    example = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$35 = ebmt_create_and_add_templates( example.first(), conses_high.second( example ), lexicon, allow_multiple_matchesP, verboseP );
      SubLObject template = NIL;
      template = cdolist_list_var_$35.first();
      while ( NIL != cdolist_list_var_$35)
      {
        if( ebmt_template_indexing_result( template ).equal( $str88$Added ) )
        {
          num_templates = Numbers.add( num_templates, ONE_INTEGER );
        }
        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
        template = cdolist_list_var_$35.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      example = cdolist_list_var.first();
    }
    return num_templates;
  }

  public static SubLObject declare_ebmt_template_parser_file()
  {
    SubLFiles.declareFunction( me, "new_ebmt_lexicon", "NEW-EBMT-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "ebmt_linkage", "EBMT-LINKAGE", 2, 2, false );
    SubLFiles.declareFunction( me, "ebmt_clear_caches", "EBMT-CLEAR-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_print_function_trampoline", "EBMT-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_p", "EBMT-TEMPLATE-P", 1, 0, false );
    new $ebmt_template_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ebmt_template_nl_cycl_pair", "EBMT-TEMPLATE-NL-CYCL-PAIR", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_type", "EBMT-TEMPLATE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_links", "EBMT-TEMPLATE-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_cycl", "EBMT-TEMPLATE-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_indexing_result", "EBMT-TEMPLATE-INDEXING-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_weight", "EBMT-TEMPLATE-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_nl_cycl_pair", "_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_type", "_CSETF-EBMT-TEMPLATE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_links", "_CSETF-EBMT-TEMPLATE-LINKS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_cycl", "_CSETF-EBMT-TEMPLATE-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_indexing_result", "_CSETF-EBMT-TEMPLATE-INDEXING-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_weight", "_CSETF-EBMT-TEMPLATE-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_ebmt_template", "MAKE-EBMT-TEMPLATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_ebmt_template", "VISIT-DEFSTRUCT-EBMT-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_ebmt_template_method", "VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_ebmt_template", "NEW-EBMT-TEMPLATE", 0, 6, false );
    SubLFiles.declareFunction( me, "ebmt_template_words", "EBMT-TEMPLATE-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "print_ebmt_template", "PRINT-EBMT-TEMPLATE", 1, 2, false );
    SubLFiles.declareFunction( me, "ebmt_template_justification", "EBMT-TEMPLATE-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_linkage_and_mapped_terms", "EBMT-LINKAGE-AND-MAPPED-TERMS", 3, 1, false );
    SubLFiles.declareFunction( me, "ignore_terms_pattern", "IGNORE-TERMS-PATTERN", 0, 0, false );
    SubLFiles.declareFunction( me, "ebmt_ignorable_terms_in_training_string", "EBMT-IGNORABLE-TERMS-IN-TRAINING-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_remove_ignore_markers", "EBMT-REMOVE-IGNORE-MARKERS", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_linkset_from_linkage_links", "EBMT-LINKSET-FROM-LINKAGE-LINKS", 1, 1, false );
    SubLFiles.declareFunction( me, "linkset_p", "LINKSET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "linkset_link_p", "LINKSET-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_link_name_argument_p", "EBMT-LINK-NAME-ARGUMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_link_name", "EBMT-LINK-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "new_linkset", "NEW-LINKSET", 3, 0, false );
    SubLFiles.declareFunction( me, "get_linkset_unindexed_links", "GET-LINKSET-UNINDEXED-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_linkset_indexed_links", "GET-LINKSET-INDEXED-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "linkset_link_name", "LINKSET-LINK-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "linkset_link_left_word", "LINKSET-LINK-LEFT-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "linkset_link_left_word_string", "LINKSET-LINK-LEFT-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "linkset_link_left_word_index", "LINKSET-LINK-LEFT-WORD-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "linkset_link_right_word", "LINKSET-LINK-RIGHT-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "linkset_link_right_word_string", "LINKSET-LINK-RIGHT-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "linkset_link_right_word_index", "LINKSET-LINK-RIGHT-WORD-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_linkset", "EBMT-LINKSET", 1, 1, false );
    SubLFiles.declareFunction( me, "ebmt_cycl_with_vars", "EBMT-CYCL-WITH-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_link_word", "EBMT-LINK-WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_lw_offsets", "EBMT-LW-OFFSETS", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_mapped_term_vars", "EBMT-MAPPED-TERM-VARS", 4, 1, false );
    SubLFiles.declareFunction( me, "ebmt_canonicalize_el_sentence", "EBMT-CANONICALIZE-EL-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_create_template", "EBMT-CREATE-TEMPLATE", 2, 2, false );
    SubLFiles.declareFunction( me, "ebmt_create_all_possible_training_examples", "EBMT-CREATE-ALL-POSSIBLE-TRAINING-EXAMPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_create_templates", "EBMT-CREATE-TEMPLATES", 2, 3, false );
    SubLFiles.declareFunction( me, "ebmt_stringify_list", "EBMT-STRINGIFY-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_linkset_string", "EBMT-LINKSET-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "ebmt_index_template_input", "EBMT-INDEX-TEMPLATE-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_index_server_info", "EBMT-TEMPLATE-INDEX-SERVER-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_update_log", "EBMT-UPDATE-LOG", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_delete_example_from_file", "EBMT-DELETE-EXAMPLE-FROM-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_index_template_int", "EBMT-INDEX-TEMPLATE-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "ebmt_index_template", "EBMT-INDEX-TEMPLATE", 1, 2, false );
    SubLFiles.declareFunction( me, "ebmt_create_and_add_templates", "EBMT-CREATE-AND-ADD-TEMPLATES", 2, 3, false );
    SubLFiles.declareFunction( me, "ebmt_find_templates_for_linkage", "EBMT-FIND-TEMPLATES-FOR-LINKAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "ebmt_find_templates", "EBMT-FIND-TEMPLATES", 1, 1, false );
    SubLFiles.declareFunction( me, "ebmt_delete_template_int", "EBMT-DELETE-TEMPLATE-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "ebmt_delete_template", "EBMT-DELETE-TEMPLATE", 1, 1, false );
    SubLFiles.declareFunction( me, "ebmt_delete_template_using_template_string", "EBMT-DELETE-TEMPLATE-USING-TEMPLATE-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "ebmt_delete_template_using_parse", "EBMT-DELETE-TEMPLATE-USING-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_delete_templates_using_example", "EBMT-DELETE-TEMPLATES-USING-EXAMPLE", 2, 3, false );
    SubLFiles.declareFunction( me, "new_ebmt_cycl", "NEW-EBMT-CYCL", 0, 3, false );
    SubLFiles.declareFunction( me, "copy_ebmt_cycl", "COPY-EBMT-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_cycl_p", "EBMT-CYCL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ebmt_cycl_cycl", "SET-EBMT-CYCL-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ebmt_cycl_cycl", "GET-EBMT-CYCL-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ebmt_cycl_justification", "SET-EBMT-CYCL-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ebmt_cycl_justification", "GET-EBMT-CYCL-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ebmt_cycl_weight", "SET-EBMT-CYCL-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ebmt_cycl_weight", "GET-EBMT-CYCL-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "compose_ebmt_cycl_justifications", "COMPOSE-EBMT-CYCL-JUSTIFICATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "compose_ebmt_cycl_weight", "COMPOSE-EBMT-CYCL-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_cycl_subst", "EBMT-CYCL-SUBST", 3, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_parsing_info_print_function_trampoline", "EBMT-TEMPLATE-PARSING-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_parsing_info_p", "EBMT-TEMPLATE-PARSING-INFO-P", 1, 0, false );
    new $ebmt_template_parsing_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ebmt_template_parsing_info_kw_lw_pairs", "EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_parsing_info_lw_links_pairs", "EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_parsing_info_lw", "EBMT-TEMPLATE-PARSING-INFO-LW", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_parsing_info_processed", "EBMT-TEMPLATE-PARSING-INFO-PROCESSED", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_parsing_info_cycl", "EBMT-TEMPLATE-PARSING-INFO-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_parsing_info_kw_lw_pairs", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_parsing_info_lw_links_pairs", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_parsing_info_lw", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_parsing_info_processed", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ebmt_template_parsing_info_cycl", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_ebmt_template_parsing_info", "MAKE-EBMT-TEMPLATE-PARSING-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_ebmt_template_parsing_info", "VISIT-DEFSTRUCT-EBMT-TEMPLATE-PARSING-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_ebmt_template_parsing_info_method", "VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-PARSING-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_ebmt_template_parsing_info", "NEW-EBMT-TEMPLATE-PARSING-INFO", 0, 5, false );
    SubLFiles.declareFunction( me, "print_ebmt_template_parsing_info", "PRINT-EBMT-TEMPLATE-PARSING-INFO", 1, 2, false );
    SubLFiles.declareFunction( me, "ebmt_linkset_linkword_linkset_links_pairs", "EBMT-LINKSET-LINKWORD-LINKSET-LINKS-PAIRS", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_llw_lw_equalP", "EBMT-LLW-LW-EQUAL?", 3, 0, false );
    SubLFiles.declareFunction( me, "link_tuple_equal", "LINK-TUPLE-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_keyword_linkword_pairs", "EBMT-KEYWORD-LINKWORD-PAIRS", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_templates_relevant_to_linkword", "EBMT-TEMPLATES-RELEVANT-TO-LINKWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_used_linkwords", "EBMT-USED-LINKWORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "strings_of_linkwords", "STRINGS-OF-LINKWORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_ebmt_cycls_for_phrase", "CLEAR-EBMT-CYCLS-FOR-PHRASE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_ebmt_cycls_for_phrase", "REMOVE-EBMT-CYCLS-FOR-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_cycls_for_phrase_internal", "EBMT-CYCLS-FOR-PHRASE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_cycls_for_phrase", "EBMT-CYCLS-FOR-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_penntag_to_cycl_category", "EBMT-PENNTAG-TO-CYCL-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_cycls_using_link_word_only", "EBMT-CYCLS-USING-LINK-WORD-ONLY", 3, 0, false );
    SubLFiles.declareFunction( me, "ebmt_cycls_for_link_word", "EBMT-CYCLS-FOR-LINK-WORD", 5, 0, false );
    SubLFiles.declareFunction( me, "ebmt_keyword_cycls_pairs", "EBMT-KEYWORD-CYCLS-PAIRS", 4, 0, false );
    SubLFiles.declareFunction( me, "ebmt_remove_invalid_cycls", "EBMT-REMOVE-INVALID-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_parses_using_template", "EBMT-PARSES-USING-TEMPLATE", 5, 0, false );
    SubLFiles.declareFunction( me, "ebmt_template_parsing_info_alist", "EBMT-TEMPLATE-PARSING-INFO-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_parse_parts", "EBMT-PARSE-PARTS", 4, 0, false );
    SubLFiles.declareFunction( me, "ebmt_relevant_cycl_parts", "EBMT-RELEVANT-CYCL-PARTS", 2, 0, false );
    SubLFiles.declareFunction( me, "conjoin_ebmt_cycls", "CONJOIN-EBMT-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_merge_parse_parts", "EBMT-MERGE-PARSE-PARTS", 2, 0, false );
    SubLFiles.declareFunction( me, "ebmt_parse", "EBMT-PARSE", 1, 2, false );
    SubLFiles.declareFunction( me, "ebmt_parse_exclude_preds", "EBMT-PARSE-EXCLUDE-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_parse_linkage", "EBMT-PARSE-LINKAGE", 2, 2, false );
    SubLFiles.declareFunction( me, "ebmt_parse_from_template", "EBMT-PARSE-FROM-TEMPLATE", 2, 3, false );
    SubLFiles.declareFunction( me, "ebmt_create_and_test_templates", "EBMT-CREATE-AND-TEST-TEMPLATES", 4, 4, false );
    SubLFiles.declareFunction( me, "ebmt_valid_training_cyclP", "EBMT-VALID-TRAINING-CYCL?", 1, 0, false );
    SubLFiles.declareFunction( me, "ebmt_generate_random_samples_from_kb", "EBMT-GENERATE-RANDOM-SAMPLES-FROM-KB", 0, 2, false );
    SubLFiles.declareFunction( me, "populate_ebmt_index_using_file", "POPULATE-EBMT-INDEX-USING-FILE", 1, 3, false );
    SubLFiles.declareFunction( me, "ebmt_populate_index_from_mt", "EBMT-POPULATE-INDEX-FROM-MT", 0, 4, false );
    return NIL;
  }

  public static SubLObject init_ebmt_template_parser_file()
  {
    $ebmt_exclude_predsP$ = SubLFiles.defparameter( "*EBMT-EXCLUDE-PREDS?*", NIL );
    $ebmt_phrase_interp_timeout$ = SubLFiles.defparameter( "*EBMT-PHRASE-INTERP-TIMEOUT*", $int0$30 );
    $dtp_ebmt_template$ = SubLFiles.defconstant( "*DTP-EBMT-TEMPLATE*", $sym14$EBMT_TEMPLATE );
    $ignore_terms_pattern$ = SubLFiles.defparameter( "*IGNORE-TERMS-PATTERN*", $kw49$UNINITIALIZED );
    $dtp_ebmt_template_parsing_info$ = SubLFiles.defconstant( "*DTP-EBMT-TEMPLATE-PARSING-INFO*", $sym96$EBMT_TEMPLATE_PARSING_INFO );
    $ebmt_cycls_for_phrase_caching_state$ = SubLFiles.deflexical( "*EBMT-CYCLS-FOR-PHRASE-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_ebmt_template_parser_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_ebmt_template$.getGlobalValue(), Symbols.symbol_function( $sym21$EBMT_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list22 );
    Structures.def_csetf( $sym23$EBMT_TEMPLATE_NL_CYCL_PAIR, $sym24$_CSETF_EBMT_TEMPLATE_NL_CYCL_PAIR );
    Structures.def_csetf( $sym25$EBMT_TEMPLATE_TYPE, $sym26$_CSETF_EBMT_TEMPLATE_TYPE );
    Structures.def_csetf( $sym27$EBMT_TEMPLATE_LINKS, $sym28$_CSETF_EBMT_TEMPLATE_LINKS );
    Structures.def_csetf( $sym29$EBMT_TEMPLATE_CYCL, $sym30$_CSETF_EBMT_TEMPLATE_CYCL );
    Structures.def_csetf( $sym31$EBMT_TEMPLATE_INDEXING_RESULT, $sym32$_CSETF_EBMT_TEMPLATE_INDEXING_RESULT );
    Structures.def_csetf( $sym33$EBMT_TEMPLATE_WEIGHT, $sym34$_CSETF_EBMT_TEMPLATE_WEIGHT );
    Equality.identity( $sym14$EBMT_TEMPLATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ebmt_template$.getGlobalValue(), Symbols.symbol_function( $sym46$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_ebmt_template_parsing_info$.getGlobalValue(), Symbols.symbol_function(
        $sym103$EBMT_TEMPLATE_PARSING_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list104 );
    Structures.def_csetf( $sym105$EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS, $sym106$_CSETF_EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS );
    Structures.def_csetf( $sym107$EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS, $sym108$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS );
    Structures.def_csetf( $sym109$EBMT_TEMPLATE_PARSING_INFO_LW, $sym110$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW );
    Structures.def_csetf( $sym111$EBMT_TEMPLATE_PARSING_INFO_PROCESSED, $sym112$_CSETF_EBMT_TEMPLATE_PARSING_INFO_PROCESSED );
    Structures.def_csetf( $sym113$EBMT_TEMPLATE_PARSING_INFO_CYCL, $sym114$_CSETF_EBMT_TEMPLATE_PARSING_INFO_CYCL );
    Equality.identity( $sym96$EBMT_TEMPLATE_PARSING_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ebmt_template_parsing_info$.getGlobalValue(), Symbols.symbol_function(
        $sym120$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_PARSING_INFO_METHOD ) );
    memoization_state.note_globally_cached_function( $sym127$EBMT_CYCLS_FOR_PHRASE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ebmt_template_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ebmt_template_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ebmt_template_parser_file();
  }
  static
  {
    me = new ebmt_template_parser();
    $ebmt_exclude_predsP$ = null;
    $ebmt_phrase_interp_timeout$ = null;
    $dtp_ebmt_template$ = null;
    $ignore_terms_pattern$ = null;
    $dtp_ebmt_template_parsing_info$ = null;
    $ebmt_cycls_for_phrase_caching_state$ = null;
    $int0$30 = makeInteger( 30 );
    $sym1$SEMTRANS_LEXICON = makeSymbol( "SEMTRANS-LEXICON" );
    $sym2$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $kw3$OFF = makeKeyword( "OFF" );
    $sym4$GET = makeSymbol( "GET" );
    $sym5$LEX_ENTRY = makeSymbol( "LEX-ENTRY" );
    $sym6$SET = makeSymbol( "SET" );
    $kw7$STRING = makeKeyword( "STRING" );
    $sym8$ADD = makeSymbol( "ADD" );
    $kw9$LEXICON = makeKeyword( "LEXICON" );
    $str10$No_word_linkage_found_for___S = makeString( "No word-linkage found for: ~S" );
    $str11$A_word_linkage_with_unknown_words = makeString( "A word-linkage with unknown words was found for: ~S" );
    $sym12$FORGET = makeSymbol( "FORGET" );
    $kw13$CLEARED = makeKeyword( "CLEARED" );
    $sym14$EBMT_TEMPLATE = makeSymbol( "EBMT-TEMPLATE" );
    $sym15$EBMT_TEMPLATE_P = makeSymbol( "EBMT-TEMPLATE-P" );
    $list16 = ConsesLow.list( makeSymbol( "NL-CYCL-PAIR" ), makeSymbol( "TYPE" ), makeSymbol( "LINKS" ), makeSymbol( "CYCL" ), makeSymbol( "INDEXING-RESULT" ), makeSymbol( "WEIGHT" ) );
    $list17 = ConsesLow.list( makeKeyword( "NL-CYCL-PAIR" ), makeKeyword( "TYPE" ), makeKeyword( "LINKS" ), makeKeyword( "CYCL" ), makeKeyword( "INDEXING-RESULT" ), makeKeyword( "WEIGHT" ) );
    $list18 = ConsesLow.list( makeSymbol( "EBMT-TEMPLATE-NL-CYCL-PAIR" ), makeSymbol( "EBMT-TEMPLATE-TYPE" ), makeSymbol( "EBMT-TEMPLATE-LINKS" ), makeSymbol( "EBMT-TEMPLATE-CYCL" ), makeSymbol(
        "EBMT-TEMPLATE-INDEXING-RESULT" ), makeSymbol( "EBMT-TEMPLATE-WEIGHT" ) );
    $list19 = ConsesLow.list( makeSymbol( "_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR" ), makeSymbol( "_CSETF-EBMT-TEMPLATE-TYPE" ), makeSymbol( "_CSETF-EBMT-TEMPLATE-LINKS" ), makeSymbol( "_CSETF-EBMT-TEMPLATE-CYCL" ),
        makeSymbol( "_CSETF-EBMT-TEMPLATE-INDEXING-RESULT" ), makeSymbol( "_CSETF-EBMT-TEMPLATE-WEIGHT" ) );
    $sym20$PRINT_EBMT_TEMPLATE = makeSymbol( "PRINT-EBMT-TEMPLATE" );
    $sym21$EBMT_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "EBMT-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list22 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "EBMT-TEMPLATE-P" ) );
    $sym23$EBMT_TEMPLATE_NL_CYCL_PAIR = makeSymbol( "EBMT-TEMPLATE-NL-CYCL-PAIR" );
    $sym24$_CSETF_EBMT_TEMPLATE_NL_CYCL_PAIR = makeSymbol( "_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR" );
    $sym25$EBMT_TEMPLATE_TYPE = makeSymbol( "EBMT-TEMPLATE-TYPE" );
    $sym26$_CSETF_EBMT_TEMPLATE_TYPE = makeSymbol( "_CSETF-EBMT-TEMPLATE-TYPE" );
    $sym27$EBMT_TEMPLATE_LINKS = makeSymbol( "EBMT-TEMPLATE-LINKS" );
    $sym28$_CSETF_EBMT_TEMPLATE_LINKS = makeSymbol( "_CSETF-EBMT-TEMPLATE-LINKS" );
    $sym29$EBMT_TEMPLATE_CYCL = makeSymbol( "EBMT-TEMPLATE-CYCL" );
    $sym30$_CSETF_EBMT_TEMPLATE_CYCL = makeSymbol( "_CSETF-EBMT-TEMPLATE-CYCL" );
    $sym31$EBMT_TEMPLATE_INDEXING_RESULT = makeSymbol( "EBMT-TEMPLATE-INDEXING-RESULT" );
    $sym32$_CSETF_EBMT_TEMPLATE_INDEXING_RESULT = makeSymbol( "_CSETF-EBMT-TEMPLATE-INDEXING-RESULT" );
    $sym33$EBMT_TEMPLATE_WEIGHT = makeSymbol( "EBMT-TEMPLATE-WEIGHT" );
    $sym34$_CSETF_EBMT_TEMPLATE_WEIGHT = makeSymbol( "_CSETF-EBMT-TEMPLATE-WEIGHT" );
    $kw35$NL_CYCL_PAIR = makeKeyword( "NL-CYCL-PAIR" );
    $kw36$TYPE = makeKeyword( "TYPE" );
    $kw37$LINKS = makeKeyword( "LINKS" );
    $kw38$CYCL = makeKeyword( "CYCL" );
    $kw39$INDEXING_RESULT = makeKeyword( "INDEXING-RESULT" );
    $kw40$WEIGHT = makeKeyword( "WEIGHT" );
    $str41$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw42$BEGIN = makeKeyword( "BEGIN" );
    $sym43$MAKE_EBMT_TEMPLATE = makeSymbol( "MAKE-EBMT-TEMPLATE" );
    $kw44$SLOT = makeKeyword( "SLOT" );
    $kw45$END = makeKeyword( "END" );
    $sym46$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-METHOD" );
    $sym47$_ = makeSymbol( "<" );
    $str48$__TEMPLATE_____Words___S____Links = makeString( "#<TEMPLATE:~%  Words: ~S~%  Links: ~S~%  CycL: ~S~%  Weight: ~S~%>~%" );
    $kw49$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str50$______________ = makeString( "\\{([^\\}\\{]*)\\}" );
    $str51$Unable_to_initialize__A__ = makeString( "Unable to initialize ~A~%" );
    $str52$_ = makeString( "}" );
    $str53$_ = makeString( "{" );
    $sym54$GET_INDEX = makeSymbol( "GET-INDEX" );
    $sym55$GET_STRING = makeSymbol( "GET-STRING" );
    $str56$IGNORE_ = makeString( "IGNORE-" );
    $sym57$LINKSET_LINK_P = makeSymbol( "LINKSET-LINK-P" );
    $sym58$EBMT_LINK_NAME_ARGUMENT_P = makeSymbol( "EBMT-LINK-NAME-ARGUMENT-P" );
    $sym59$LINKS = makeSymbol( "LINKS" );
    $sym60$WORDS = makeSymbol( "WORDS" );
    $str61$__A_Za_z0_9__ = makeString( "[^A-Za-z0-9](" );
    $str62$___A_Za_z0_9_ = makeString( ")[^A-Za-z0-9]" );
    $str63$_b_ = makeString( "\\b(" );
    $str64$__b = makeString( ")\\b" );
    $list65 = ConsesLow.list( makeKeyword( "CASELESS" ) );
    $str66$_VAR = makeString( ":VAR" );
    $sym67$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $const68$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym69$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str70$__ = makeString( "~~" );
    $str71$_ = makeString( "~" );
    $kw72$GENERAL = makeKeyword( "GENERAL" );
    $kw73$SPECIFIC = makeKeyword( "SPECIFIC" );
    $sym74$STRINGP = makeSymbol( "STRINGP" );
    $sym75$CYCL_SENTENCE_P = makeSymbol( "CYCL-SENTENCE-P" );
    $str76$__NL___S__CycL____S___S__ = makeString( "~%NL: ~S~%CycL:~%~S~%~S~%" );
    $kw77$VAR = makeKeyword( "VAR" );
    $sym78$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw79$DEFAULT = makeKeyword( "DEFAULT" );
    $str80$Unknown_EBMT_lexicon___S__ = makeString( "Unknown EBMT lexicon: ~S~%" );
    $kw81$APPEND = makeKeyword( "APPEND" );
    $str82$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str83$_A__A__ = makeString( "~A ~A~%" );
    $kw84$INPUT = makeKeyword( "INPUT" );
    $str85$__ = makeString( " (" );
    $str86$___ = makeString( "): " );
    $str87$_A_____S__ = makeString( "~A: ~%~S~%" );
    $str88$Added = makeString( "Added" );
    $str89$_S__ = makeString( "~S~%" );
    $str90$Found_ = makeString( "Found " );
    $str91$_templates_for_linkset__ = makeString( " templates for linkset: " );
    $kw92$DONE = makeKeyword( "DONE" );
    $str93$Deleted = makeString( "Deleted" );
    $str94$_A__ = makeString( "~A~%" );
    $kw95$JUSTIFICATION = makeKeyword( "JUSTIFICATION" );
    $sym96$EBMT_TEMPLATE_PARSING_INFO = makeSymbol( "EBMT-TEMPLATE-PARSING-INFO" );
    $sym97$EBMT_TEMPLATE_PARSING_INFO_P = makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-P" );
    $list98 = ConsesLow.list( makeSymbol( "KW-LW-PAIRS" ), makeSymbol( "LW-LINKS-PAIRS" ), makeSymbol( "LW" ), makeSymbol( "PROCESSED" ), makeSymbol( "CYCL" ) );
    $list99 = ConsesLow.list( makeKeyword( "KW-LW-PAIRS" ), makeKeyword( "LW-LINKS-PAIRS" ), makeKeyword( "LW" ), makeKeyword( "PROCESSED" ), makeKeyword( "CYCL" ) );
    $list100 = ConsesLow.list( makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS" ), makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS" ), makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-LW" ), makeSymbol(
        "EBMT-TEMPLATE-PARSING-INFO-PROCESSED" ), makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-CYCL" ) );
    $list101 = ConsesLow.list( makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS" ), makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS" ), makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW" ),
        makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED" ), makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL" ) );
    $sym102$PRINT_EBMT_TEMPLATE_PARSING_INFO = makeSymbol( "PRINT-EBMT-TEMPLATE-PARSING-INFO" );
    $sym103$EBMT_TEMPLATE_PARSING_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list104 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-P" ) );
    $sym105$EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS = makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS" );
    $sym106$_CSETF_EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS = makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS" );
    $sym107$EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS = makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS" );
    $sym108$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS = makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS" );
    $sym109$EBMT_TEMPLATE_PARSING_INFO_LW = makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-LW" );
    $sym110$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW = makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW" );
    $sym111$EBMT_TEMPLATE_PARSING_INFO_PROCESSED = makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-PROCESSED" );
    $sym112$_CSETF_EBMT_TEMPLATE_PARSING_INFO_PROCESSED = makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED" );
    $sym113$EBMT_TEMPLATE_PARSING_INFO_CYCL = makeSymbol( "EBMT-TEMPLATE-PARSING-INFO-CYCL" );
    $sym114$_CSETF_EBMT_TEMPLATE_PARSING_INFO_CYCL = makeSymbol( "_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL" );
    $kw115$KW_LW_PAIRS = makeKeyword( "KW-LW-PAIRS" );
    $kw116$LW_LINKS_PAIRS = makeKeyword( "LW-LINKS-PAIRS" );
    $kw117$LW = makeKeyword( "LW" );
    $kw118$PROCESSED = makeKeyword( "PROCESSED" );
    $sym119$MAKE_EBMT_TEMPLATE_PARSING_INFO = makeSymbol( "MAKE-EBMT-TEMPLATE-PARSING-INFO" );
    $sym120$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_PARSING_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-PARSING-INFO-METHOD" );
    $str121$__TEMPLATE_PARSING_INFO______Keyw = makeString( "#<TEMPLATE-PARSING-INFO: ~%  Keyword-Linkword pairs: ~S~%  Linkword-Links pairs: ~S~%  Linkwords: ~S~%  Processed: ~S~%  CycL: ~S~%>" );
    $sym122$GET_LINKS = makeSymbol( "GET-LINKS" );
    $sym123$LINK_TUPLE_EQUAL = makeSymbol( "LINK-TUPLE-EQUAL" );
    $str124$a = makeString( "a" );
    $str125$an = makeString( "an" );
    $list126 = ConsesLow.list( makeUninternedSymbol( "START" ), makeUninternedSymbol( "END" ), makeUninternedSymbol( "DELTA" ) );
    $sym127$EBMT_CYCLS_FOR_PHRASE = makeSymbol( "EBMT-CYCLS-FOR-PHRASE" );
    $list128 = ConsesLow.list( makeKeyword( "ANY" ), constant_handles.reader_make_constant_shell( makeString( "SententialConstituent" ) ), constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) ) );
    $list129 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ScalarInterval" ) ), constant_handles.reader_make_constant_shell( makeString( "Date" ) ) );
    $sym130$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $list131 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) ), constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) ) );
    $kw132$BEST_ONLY = makeKeyword( "BEST-ONLY" );
    $const133$familyName = constant_handles.reader_make_constant_shell( makeString( "familyName" ) );
    $const134$PhraseFn = constant_handles.reader_make_constant_shell( makeString( "PhraseFn" ) );
    $sym135$_EBMT_CYCLS_FOR_PHRASE_CACHING_STATE_ = makeSymbol( "*EBMT-CYCLS-FOR-PHRASE-CACHING-STATE*" );
    $int136$5000 = makeInteger( 5000 );
    $const137$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $const138$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $kw139$ANY = makeKeyword( "ANY" );
    $sym140$PREPOSITION_LINK_WORD_P = makeSymbol( "PREPOSITION-LINK-WORD-P" );
    $sym141$GET_MODIFIERS = makeSymbol( "GET-MODIFIERS" );
    $sym142$GET_LINK_WORD_ABS_INDEX = makeSymbol( "GET-LINK-WORD-ABS-INDEX" );
    $sym143$GET_POS = makeSymbol( "GET-POS" );
    $sym144$YIELD = makeSymbol( "YIELD" );
    $sym145$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $sym146$GET_HEAD_DAUGHTER = makeSymbol( "GET-HEAD-DAUGHTER" );
    $str147$Unable_to_understand_some_of_the_ = makeString( "Unable to understand some of the tokens in the sentence." );
    $str148$No_matching_templates_found_ = makeString( "No matching templates found." );
    $sym149$SETS_EQUAL_ = makeSymbol( "SETS-EQUAL?" );
    $str150$Failed_to_compute_a_linkage_for__ = makeString( "Failed to compute a linkage for: ~S" );
    $sym151$VALUES = makeSymbol( "VALUES" );
    $str152$Wff_checking_rejected_all_cycl_ = makeString( "Wff checking rejected all cycl." );
    $kw153$FAILURE = makeKeyword( "FAILURE" );
    $kw154$SUCCESS = makeKeyword( "SUCCESS" );
    $str155$__Template_Parse_Result___S___S__ = makeString( "~%Template Parse Result: ~S~%~S~%" );
    $list156 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycSecureDocString" ) ), constant_handles.reader_make_constant_shell( makeString( "comment" ) ) );
    $int157$100 = makeInteger( 100 );
    $str158$Populating_EBMT_Template_Index___ = makeString( "Populating EBMT Template Index ..." );
    $const159$AllEBMTTrainingExamplesCollectorM = constant_handles.reader_make_constant_shell( makeString( "AllEBMTTrainingExamplesCollectorMt" ) );
    $list160 = ConsesLow.list( makeSymbol( "?NL" ), makeSymbol( "?CYCL" ) );
    $list161 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?QUOTEDCYCL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ebmtNLToCycLTrainingExample" ) ), makeSymbol( "?NL" ), makeSymbol( "?QUOTEDCYCL" ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "means" ) ), makeSymbol( "?QUOTEDCYCL" ), makeSymbol( "?CYCL" ) ) ) );
  }

  public static final class $ebmt_template_native
      extends
        SubLStructNative
  {
    public SubLObject $nl_cycl_pair;
    public SubLObject $type;
    public SubLObject $links;
    public SubLObject $cycl;
    public SubLObject $indexing_result;
    public SubLObject $weight;
    private static final SubLStructDeclNative structDecl;

    public $ebmt_template_native()
    {
      this.$nl_cycl_pair = CommonSymbols.NIL;
      this.$type = CommonSymbols.NIL;
      this.$links = CommonSymbols.NIL;
      this.$cycl = CommonSymbols.NIL;
      this.$indexing_result = CommonSymbols.NIL;
      this.$weight = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $ebmt_template_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$nl_cycl_pair;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$links;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$cycl;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$indexing_result;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$weight;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$nl_cycl_pair = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$links = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$cycl = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$indexing_result = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$weight = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $ebmt_template_native.class, $sym14$EBMT_TEMPLATE, $sym15$EBMT_TEMPLATE_P, $list16, $list17, new String[] { "$nl_cycl_pair", "$type", "$links", "$cycl",
        "$indexing_result", "$weight"
      }, $list18, $list19, $sym20$PRINT_EBMT_TEMPLATE );
    }
  }

  public static final class $ebmt_template_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $ebmt_template_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EBMT-TEMPLATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return ebmt_template_p( arg1 );
    }
  }

  public static final class $ebmt_template_parsing_info_native
      extends
        SubLStructNative
  {
    public SubLObject $kw_lw_pairs;
    public SubLObject $lw_links_pairs;
    public SubLObject $lw;
    public SubLObject $processed;
    public SubLObject $cycl;
    private static final SubLStructDeclNative structDecl;

    public $ebmt_template_parsing_info_native()
    {
      this.$kw_lw_pairs = CommonSymbols.NIL;
      this.$lw_links_pairs = CommonSymbols.NIL;
      this.$lw = CommonSymbols.NIL;
      this.$processed = CommonSymbols.NIL;
      this.$cycl = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $ebmt_template_parsing_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$kw_lw_pairs;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$lw_links_pairs;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lw;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$processed;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$cycl;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$kw_lw_pairs = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$lw_links_pairs = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lw = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$processed = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$cycl = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $ebmt_template_parsing_info_native.class, $sym96$EBMT_TEMPLATE_PARSING_INFO, $sym97$EBMT_TEMPLATE_PARSING_INFO_P, $list98, $list99, new String[] { "$kw_lw_pairs",
        "$lw_links_pairs", "$lw", "$processed", "$cycl"
      }, $list100, $list101, $sym102$PRINT_EBMT_TEMPLATE_PARSING_INFO );
    }
  }

  public static final class $ebmt_template_parsing_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $ebmt_template_parsing_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EBMT-TEMPLATE-PARSING-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return ebmt_template_parsing_info_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 806 ms
 * 
 */