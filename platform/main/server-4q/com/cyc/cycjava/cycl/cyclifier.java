package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_implies;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyclifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyclifier";
  public static final String myFingerPrint = "31926c63e03bf5c089c7b7b49c42a9143060726762ea0e4a45f9eccc70731c4a";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9232L)
  public static SubLSymbol $full_cyclifier_quantifier_support$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9447L)
  public static SubLSymbol $cyclifiers$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22929L)
  public static SubLSymbol $cyclifier_catch_errorsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23071L)
  private static SubLSymbol $default_cyclifier_parser_factory$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34352L)
  private static SubLSymbol $cyclifier_test_sentences$;
  private static final SubLString $str0$X;
  private static final SubLSymbol $sym1$LF_LITERAL;
  private static final SubLSymbol $sym2$OBJECT;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$PARSE;
  private static final SubLSymbol $sym5$ARGS;
  private static final SubLSymbol $sym6$PREDICATE;
  private static final SubLSymbol $sym7$INSTANCE_COUNT;
  private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS;
  private static final SubLSymbol $sym9$ISOLATED_P;
  private static final SubLSymbol $sym10$INSTANCE_NUMBER;
  private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE;
  private static final SubLSymbol $sym12$PRINT;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
  private static final SubLString $str17$__;
  private static final SubLSymbol $sym18$LF_LITERAL_PRINT_METHOD;
  private static final SubLSymbol $sym19$GET_PREDICATE;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
  private static final SubLSymbol $sym23$LF_LITERAL_GET_PREDICATE_METHOD;
  private static final SubLSymbol $sym24$GET_ARGS;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
  private static final SubLSymbol $sym27$LF_LITERAL_GET_ARGS_METHOD;
  private static final SubLSymbol $sym28$GET_ARG;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
  private static final SubLSymbol $sym32$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym33$LF_LITERAL_GET_ARG_METHOD;
  private static final SubLSymbol $sym34$GET_REF;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$LF_LITERAL_GET_REF_METHOD;
  private static final SubLSymbol $sym37$GET_PARSE;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
  private static final SubLSymbol $sym40$LF_LITERAL_GET_PARSE_METHOD;
  private static final SubLSymbol $sym41$UNARY_P;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
  private static final SubLSymbol $sym44$LF_LITERAL_UNARY_P_METHOD;
  private static final SubLSymbol $sym45$BINARY_P;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD;
  private static final SubLSymbol $sym48$LF_LITERAL_BINARY_P_METHOD;
  private static final SubLSymbol $sym49$LOGICAL_FORM_INT;
  private static final SubLSymbol $sym50$PHRASE_TREE;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD;
  private static final SubLSymbol $sym53$PHRASE_TREE_LOGICAL_FORM_INT_METHOD;
  private static final SubLSymbol $sym54$GET_LF_PREDICATE;
  private static final SubLSymbol $sym55$WORD_TREE;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD;
  private static final SubLString $str58$NP;
  private static final SubLSymbol $kw59$PROPER_NOUN;
  private static final SubLString $str60$NN;
  private static final SubLSymbol $kw61$NOUN;
  private static final SubLString $str62$VB;
  private static final SubLSymbol $kw63$VERB;
  private static final SubLString $str64$JJ;
  private static final SubLSymbol $kw65$ADJECTIVE;
  private static final SubLString $str66$RB;
  private static final SubLSymbol $kw67$ADVERB;
  private static final SubLString $str68$IN;
  private static final SubLSymbol $kw69$PREPOSITION;
  private static final SubLString $str70$_;
  private static final SubLSymbol $sym71$WORD_TREE_GET_LF_PREDICATE_METHOD;
  private static final SubLSymbol $sym72$VERBAL_WORD_TREE;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD;
  private static final SubLSymbol $sym75$GET_SEMANTIC_SUBJECT;
  private static final SubLSymbol $sym76$GET_SEMANTIC_OBJECTS;
  private static final SubLSymbol $sym77$GET_VERBAL_COMPLEMENT;
  private static final SubLString $str78$subj;
  private static final SubLSymbol $sym79$GET_REFS;
  private static final SubLString $str80$obj;
  private static final SubLString $str81$clause;
  private static final SubLSymbol $sym82$VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD;
  private static final SubLSymbol $sym83$MODIFIER_WORD_TREE;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$GET_MODIFIEDS;
  private static final SubLString $str86$modifies;
  private static final SubLSymbol $sym87$MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD;
  private static final SubLSymbol $sym88$NOMINAL_WORD_TREE;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$GET_COMPLEMENTS;
  private static final SubLString $str91$arg;
  private static final SubLSymbol $sym92$NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD;
  private static final SubLSymbol $sym93$PREPOSITIONAL_OR_PARTICLE_WORD_TREE;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$GET_STRING;
  private static final SubLString $str96$of;
  private static final SubLSymbol $sym97$GET_OBLIQUE_OBJECT;
  private static final SubLSymbol $sym98$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD;
  private static final SubLSymbol $sym99$POSSESSIVE_WORD_TREE;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD;
  private static final SubLSymbol $sym102$GET_MOTHER;
  private static final SubLSymbol $sym103$FIND_FIRST;
  private static final SubLSymbol $sym104$NOMINAL_TREE_P;
  private static final SubLSymbol $sym105$GET_INDEX;
  private static final SubLSymbol $sym106$POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD;
  private static final SubLSymbol $sym107$LOGICAL_FORM;
  private static final SubLSymbol $sym108$PARSE_TREE;
  private static final SubLList $list109;
  private static final SubLList $list110;
  private static final SubLSymbol $sym111$ABSTRACT_LEXICON_P;
  private static final SubLSymbol $sym112$LEXIFY_INT;
  private static final SubLSymbol $sym113$PARSE_TREE_LOGICAL_FORM_METHOD;
  private static final SubLSymbol $sym114$STRINGP;
  private static final SubLSymbol $sym115$LEARN;
  private static final SubLSymbol $sym116$GET;
  private static final SubLSymbol $kw117$FRAME;
  private static final SubLSymbol $kw118$SEMTRANS;
  private static final SubLSymbol $kw119$ACTION;
  private static final SubLSymbol $kw120$SCOPE;
  private static final SubLSymbol $sym121$GET_ROOT;
  private static final SubLSymbol $sym122$CYCLIFIER;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$ERROR_HANDLING;
  private static final SubLSymbol $sym126$SBHL_RESOURCE;
  private static final SubLSymbol $sym127$MEMOIZATION_STATE;
  private static final SubLSymbol $sym128$SCORE;
  private static final SubLSymbol $sym129$NEXT;
  private static final SubLSymbol $sym130$OUTPUT;
  private static final SubLSymbol $sym131$SCORE_FUNCTION;
  private static final SubLSymbol $sym132$RAW_CYCLIFICATIONS;
  private static final SubLSymbol $sym133$RAW_CYCLIFIED_;
  private static final SubLSymbol $sym134$WFF_CHECK_;
  private static final SubLSymbol $sym135$SUBCYCLIFIER_POOL;
  private static final SubLSymbol $sym136$TREE;
  private static final SubLSymbol $sym137$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS;
  private static final SubLSymbol $sym138$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE;
  private static final SubLSymbol $sym139$HAS_NEXT_;
  private static final SubLList $list140;
  private static final SubLSymbol $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD;
  private static final SubLSymbol $sym142$CYCLIFY_INT;
  private static final SubLSymbol $sym143$CYCLIFICATION;
  private static final SubLSymbol $sym144$EL_FORMULA;
  private static final SubLSymbol $sym145$WFF_CHECK;
  private static final SubLSymbol $sym146$CYCLIFIABLE_QUESTION_P;
  private static final SubLObject $const147$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLSymbol $sym148$CYCLIFIER_HAS_NEXT__METHOD;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD;
  private static final SubLSymbol $kw151$BRIEF;
  private static final SubLSymbol $kw152$VERBOSE;
  private static final SubLString $str153$Illegal_output_format__a;
  private static final SubLSymbol $sym154$CYCLIFIER_NEXT_METHOD;
  private static final SubLList $list155;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD;
  private static final SubLSymbol $sym158$CYCLIFIER_WFF_CHECK_METHOD;
  private static final SubLSymbol $kw159$UNKNOWN;
  private static final SubLList $list160;
  private static final SubLSymbol $kw161$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym162$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw163$APPEND;
  private static final SubLString $str164$Unable_to_open__S;
  private static final SubLString $str165$____original__S____output_cycl__S;
  private static final SubLSymbol $sym166$HANDLE_ERROR;
  private static final SubLList $list167;
  private static final SubLList $list168;
  private static final SubLSymbol $sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD;
  private static final SubLSymbol $kw170$THROW;
  private static final SubLSymbol $kw171$WARN;
  private static final SubLSymbol $sym172$CYCLIFIER_HANDLE_ERROR_METHOD;
  private static final SubLObject $const173$InstanceFn;
  private static final SubLSymbol $sym174$BEAUTIFY_CYCLIFICATION;
  private static final SubLSymbol $sym175$CYC_VAR_;
  private static final SubLList $list176;
  private static final SubLObject $const177$and;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$GET_CYCL;
  private static final SubLSymbol $kw180$SUBJECT;
  private static final SubLList $list181;
  private static final SubLList $list182;
  private static final SubLSymbol $sym183$CYCL;
  private static final SubLObject $const184$PPCompFrameFn;
  private static final SubLList $list185;
  private static final SubLSymbol $sym186$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw187$PARSER;
  private static final SubLSymbol $kw188$LEXICON;
  private static final SubLSymbol $sym189$CYCLIFIER_LEXICON;
  private static final SubLSymbol $sym190$CYCLIFY;
  private static final SubLSymbol $sym191$NEW_STANFORD_PARSER;
  private static final SubLSymbol $kw192$CONTEXT;
  private static final SubLSymbol $sym193$PARSE_TREE_CONTEXT;
  private static final SubLSymbol $sym194$GET_CYCLIFIER;
  private static final SubLString $str195$Sentence__;
  private static final SubLSymbol $sym196$LISTP;
  private static final SubLSymbol $sym197$CYCLIFY_PARSE;
  private static final SubLString $str198$__;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$CONFIDENCE;
  private static final SubLSymbol $sym201$WORD;
  private static final SubLSymbol $sym202$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS;
  private static final SubLSymbol $sym203$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE;
  private static final SubLSymbol $sym204$NUMBERP;
  private static final SubLList $list205;
  private static final SubLSymbol $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD;
  private static final SubLSymbol $sym207$CYCLIFICATION_GET_CYCL_METHOD;
  private static final SubLSymbol $sym208$GET_WORD;
  private static final SubLList $list209;
  private static final SubLSymbol $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD;
  private static final SubLSymbol $sym211$CYCLIFICATION_GET_WORD_METHOD;
  private static final SubLSymbol $sym212$GET_CONFIDENCE;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD;
  private static final SubLSymbol $sym215$CYCLIFICATION_GET_CONFIDENCE_METHOD;
  private static final SubLSymbol $sym216$COPY;
  private static final SubLList $list217;
  private static final SubLSymbol $sym218$CYCLIFICATION_COPY_METHOD;
  private static final SubLList $list219;
  private static final SubLSymbol $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD;
  private static final SubLString $str221$__CYCLIFICATION_;
  private static final SubLString $str222$_;
  private static final SubLSymbol $sym223$CYCLIFICATION_PRINT_METHOD;
  private static final SubLList $list224;
  private static final SubLList $list225;
  private static final SubLSymbol $sym226$CYCLIFICATION_EL_FORMULA_METHOD;
  private static final SubLSymbol $sym227$FIND;
  private static final SubLList $list228;
  private static final SubLList $list229;
  private static final SubLSymbol $sym230$CYCLIFICATION_FIND_METHOD;
  private static final SubLSymbol $sym231$SUBSTITUTE;
  private static final SubLList $list232;
  private static final SubLList $list233;
  private static final SubLSymbol $sym234$CYCLIFICATION_SUBSTITUTE_METHOD;
  private static final SubLString $str235$illegal_cyclification__a;
  private static final SubLSymbol $sym236$YIELD;
  private static final SubLString $str237$Illegal_cyclification__a;
  private static final SubLSymbol $sym238$CYCLIFICATION_SCORE;
  private static final SubLSymbol $sym239$_;
  private static final SubLSymbol $sym240$CDR;
  private static final SubLSymbol $sym241$_;
  private static final SubLSymbol $sym242$QUANTIFIER_SCOPING_SCORE;
  private static final SubLSymbol $sym243$GET_HEAD;
  private static final SubLSymbol $sym244$GET_ABS_INDEX;
  private static final SubLInteger $int245$100;
  private static final SubLList $list246;
  private static final SubLString $str247$sentence___S__;
  private static final SubLSymbol $sym248$INFERENCE_FORMULA_FOLLOWS;
  private static final SubLObject $const249$InferencePSC;
  private static final SubLSymbol $sym250$INSTANCEFN_NAT_;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 943L)
  public static SubLObject new_lf_variable(SubLObject prefix)
  {
    if( prefix == UNPROVIDED )
    {
      prefix = $str0$X;
    }
    return cycl_variables.gentemp_el_var( el_utilities.string_to_el_var_name( prefix ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject get_lf_literal_parse(final SubLObject lf_literal)
  {
    return classes.subloop_get_access_protected_instance_slot( lf_literal, THREE_INTEGER, $sym4$PARSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject set_lf_literal_parse(final SubLObject lf_literal, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lf_literal, value, THREE_INTEGER, $sym4$PARSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject get_lf_literal_args(final SubLObject lf_literal)
  {
    return classes.subloop_get_access_protected_instance_slot( lf_literal, TWO_INTEGER, $sym5$ARGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject set_lf_literal_args(final SubLObject lf_literal, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lf_literal, value, TWO_INTEGER, $sym5$ARGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject get_lf_literal_predicate(final SubLObject lf_literal)
  {
    return classes.subloop_get_access_protected_instance_slot( lf_literal, ONE_INTEGER, $sym6$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject set_lf_literal_predicate(final SubLObject lf_literal, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( lf_literal, value, ONE_INTEGER, $sym6$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject subloop_reserved_initialize_lf_literal_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject subloop_reserved_initialize_lf_literal_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$LF_LITERAL, $sym6$PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$LF_LITERAL, $sym5$ARGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$LF_LITERAL, $sym4$PARSE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1130L)
  public static SubLObject lf_literal_p(final SubLObject lf_literal)
  {
    return classes.subloop_instanceof_class( lf_literal, $sym1$LF_LITERAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1644L)
  public static SubLObject new_lf_literal(final SubLObject predicate, final SubLObject v_arguments, final SubLObject parse)
  {
    final SubLObject literal = object.new_class_instance( $sym1$LF_LITERAL );
    set_lf_literal_predicate( literal, predicate );
    set_lf_literal_args( literal, v_arguments );
    set_lf_literal_parse( literal, parse );
    return literal;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1910L)
  public static SubLObject lf_literal_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lf_literal_method = NIL;
    final SubLObject args = get_lf_literal_args( self );
    final SubLObject predicate = get_lf_literal_predicate( self );
    try
    {
      thread.throwStack.push( $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
      try
      {
        streams_high.write_string( predicate, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_char( Characters.CHAR_lparen, stream );
        print_high.princ( args.first(), stream );
        SubLObject cdolist_list_var = args.rest();
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          streams_high.write_string( $str17$__, stream, UNPROVIDED, UNPROVIDED );
          print_high.princ( arg, stream );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        streams_high.write_char( Characters.CHAR_rparen, stream );
        Dynamic.sublisp_throw( $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lf_literal_args( self, args );
          set_lf_literal_predicate( self, predicate );
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
      catch_var_for_lf_literal_method = Errors.handleThrowable( ccatch_env_var, $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lf_literal_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2257L)
  public static SubLObject lf_literal_get_predicate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lf_literal_method = NIL;
    final SubLObject predicate = get_lf_literal_predicate( self );
    try
    {
      thread.throwStack.push( $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD, predicate );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lf_literal_predicate( self, predicate );
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
      catch_var_for_lf_literal_method = Errors.handleThrowable( ccatch_env_var, $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lf_literal_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2387L)
  public static SubLObject lf_literal_get_args_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lf_literal_method = NIL;
    final SubLObject args = get_lf_literal_args( self );
    try
    {
      thread.throwStack.push( $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD, args );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lf_literal_args( self, args );
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
      catch_var_for_lf_literal_method = Errors.handleThrowable( ccatch_env_var, $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lf_literal_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2516L)
  public static SubLObject lf_literal_get_arg_method(final SubLObject self, final SubLObject i)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lf_literal_method = NIL;
    final SubLObject args = get_lf_literal_args( self );
    try
    {
      thread.throwStack.push( $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
      try
      {
        assert NIL != subl_promotions.positive_integer_p( i ) : i;
        Dynamic.sublisp_throw( $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD, conses_high.nthcdr( number_utilities.f_1_( i ), args ).first() );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lf_literal_args( self, args );
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
      catch_var_for_lf_literal_method = Errors.handleThrowable( ccatch_env_var, $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lf_literal_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2830L)
  public static SubLObject lf_literal_get_ref_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_1_args( self, $sym28$GET_ARG, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2969L)
  public static SubLObject lf_literal_get_parse_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lf_literal_method = NIL;
    final SubLObject parse = get_lf_literal_parse( self );
    try
    {
      thread.throwStack.push( $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD, parse );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lf_literal_parse( self, parse );
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
      catch_var_for_lf_literal_method = Errors.handleThrowable( ccatch_env_var, $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lf_literal_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3116L)
  public static SubLObject lf_literal_unary_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lf_literal_method = NIL;
    final SubLObject args = get_lf_literal_args( self );
    try
    {
      thread.throwStack.push( $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD, Numbers.numE( Sequences.length( args ), ONE_INTEGER ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lf_literal_args( self, args );
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
      catch_var_for_lf_literal_method = Errors.handleThrowable( ccatch_env_var, $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lf_literal_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3262L)
  public static SubLObject lf_literal_binary_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_lf_literal_method = NIL;
    final SubLObject args = get_lf_literal_args( self );
    try
    {
      thread.throwStack.push( $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD, Numbers.numE( Sequences.length( args ), TWO_INTEGER ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_lf_literal_args( self, args );
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
      catch_var_for_lf_literal_method = Errors.handleThrowable( ccatch_env_var, $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_lf_literal_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3410L)
  public static SubLObject phrase_tree_logical_form_int_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_phrase_tree_method = NIL;
    final SubLObject daughters = parse_tree.get_phrase_tree_daughters( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
      try
      {
        SubLObject lf = NIL;
        final SubLObject vector_var = daughters;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter = Vectors.aref( vector_var, element_num );
          lf = ConsesLow.append( lf, methods.funcall_instance_method_with_0_args( daughter, $sym49$LOGICAL_FORM_INT ) );
        }
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD, lf );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_phrase_tree_daughters( self, daughters );
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
      catch_var_for_phrase_tree_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_phrase_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3665L)
  public static SubLObject word_tree_get_lf_predicate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject category = parse_tree.get_parse_tree_category( self );
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        SubLObject v_class = NIL;
        SubLObject pos = NIL;
        if( NIL != word_tree.name_word_tree_p( self ) )
        {
          v_class = $str58$NP;
          pos = $kw59$PROPER_NOUN;
        }
        else if( NIL != word_tree.nominal_word_tree_p( self ) )
        {
          v_class = $str60$NN;
          pos = $kw61$NOUN;
        }
        else if( NIL != word_tree.verbal_word_tree_p( self ) )
        {
          v_class = $str62$VB;
          pos = $kw63$VERB;
        }
        else if( NIL != word_tree.adjectival_word_tree_p( self ) )
        {
          v_class = $str64$JJ;
          pos = $kw65$ADJECTIVE;
        }
        else if( NIL != word_tree.adverbial_word_tree_p( self ) )
        {
          v_class = $str66$RB;
          pos = $kw67$ADVERB;
        }
        else if( NIL != word_tree.prepositional_or_particle_word_tree_p( self ) )
        {
          v_class = $str68$IN;
          pos = $kw69$PREPOSITION;
        }
        else
        {
          v_class = print_high.princ_to_string( category );
        }
        Dynamic.sublisp_throw( $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD, Sequences.cconcatenate( Strings.string_downcase( morphology.get_root( string, pos ), UNPROVIDED, UNPROVIDED ), new SubLObject[] { $str70$_, v_class
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_category( self, category );
          parse_tree.set_parse_tree_string( self, string );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4413L)
  public static SubLObject verbal_word_tree_logical_form_int_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_verbal_word_tree_method = NIL;
    final SubLObject refs = word_tree.get_word_tree_refs( self );
    try
    {
      thread.throwStack.push( $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
      try
      {
        final SubLObject ref = refs.first();
        SubLObject lf = ConsesLow.list( new_lf_literal( methods.funcall_instance_method_with_0_args( self, $sym54$GET_LF_PREDICATE ), ConsesLow.list( ref ), self ) );
        final SubLObject subject = methods.funcall_instance_method_with_0_args( self, $sym75$GET_SEMANTIC_SUBJECT );
        final SubLObject objects = methods.funcall_instance_method_with_0_args( self, $sym76$GET_SEMANTIC_OBJECTS );
        final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args( self, $sym77$GET_VERBAL_COMPLEMENT );
        final SubLObject cl_complements = ( NIL != verbal_complement ) ? ConsesLow.list( verbal_complement ) : NIL;
        SubLObject i = ZERO_INTEGER;
        if( NIL != subject )
        {
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( subject, $sym79$GET_REFS );
          SubLObject subj_ref = NIL;
          subj_ref = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            lf = ConsesLow.cons( new_lf_literal( $str78$subj, ConsesLow.list( ref, subj_ref ), self ), lf );
            cdolist_list_var = cdolist_list_var.rest();
            subj_ref = cdolist_list_var.first();
          }
        }
        i = ZERO_INTEGER;
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          i = Numbers.add( i, ONE_INTEGER );
          SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args( v_object, $sym79$GET_REFS );
          SubLObject obj_ref = NIL;
          obj_ref = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            lf = ConsesLow.cons( new_lf_literal( Sequences.cconcatenate( $str80$obj, PrintLow.write_to_string( i, EMPTY_SUBL_OBJECT_ARRAY ) ), ConsesLow.list( ref, obj_ref ), self ), lf );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            obj_ref = cdolist_list_var_$1.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_object = cdolist_list_var.first();
        }
        i = ZERO_INTEGER;
        cdolist_list_var = cl_complements;
        SubLObject cl_complement = NIL;
        cl_complement = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          i = Numbers.add( i, ONE_INTEGER );
          SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args( cl_complement, $sym79$GET_REFS );
          SubLObject comp_ref = NIL;
          comp_ref = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            lf = ConsesLow.cons( new_lf_literal( Sequences.cconcatenate( $str81$clause, PrintLow.write_to_string( i, EMPTY_SUBL_OBJECT_ARRAY ) ), ConsesLow.list( ref, comp_ref ), self ), lf );
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            comp_ref = cdolist_list_var_$2.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          cl_complement = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, Sequences.nreverse( lf ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          word_tree.set_word_tree_refs( self, refs );
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
      catch_var_for_verbal_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_verbal_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5570L)
  public static SubLObject modifier_word_tree_logical_form_int_method(final SubLObject self)
  {
    final SubLObject ref = methods.funcall_instance_method_with_0_args( self, $sym79$GET_REFS ).first();
    SubLObject lf = ConsesLow.list( new_lf_literal( word_tree_get_lf_predicate_method( self ), ConsesLow.list( ref ), self ) );
    SubLObject cdolist_list_var;
    final SubLObject modifieds = cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym85$GET_MODIFIEDS );
    SubLObject modified = NIL;
    modified = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_0_args( modified, $sym79$GET_REFS );
      SubLObject modified_ref = NIL;
      modified_ref = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        lf = ConsesLow.cons( new_lf_literal( $str86$modifies, ConsesLow.list( ref, modified_ref ), self ), lf );
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        modified_ref = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      modified = cdolist_list_var.first();
    }
    return lf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6058L)
  public static SubLObject nominal_word_tree_logical_form_int_method(final SubLObject self)
  {
    final SubLObject complements = methods.funcall_instance_method_with_0_args( self, $sym90$GET_COMPLEMENTS );
    final SubLObject ref = methods.funcall_instance_method_with_0_args( self, $sym79$GET_REFS ).first();
    SubLObject lf = ConsesLow.list( new_lf_literal( methods.funcall_instance_method_with_0_args( self, $sym54$GET_LF_PREDICATE ), ConsesLow.list( ref ), self ) );
    SubLObject i = ZERO_INTEGER;
    SubLObject cdolist_list_var = complements;
    SubLObject complement = NIL;
    complement = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      i = Numbers.add( i, ONE_INTEGER );
      SubLObject cdolist_list_var_$4 = methods.funcall_instance_method_with_0_args( complement, $sym79$GET_REFS );
      SubLObject comp_ref = NIL;
      comp_ref = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        lf = ConsesLow.cons( new_lf_literal( Sequences.cconcatenate( $str91$arg, PrintLow.write_to_string( i, EMPTY_SUBL_OBJECT_ARRAY ) ), ConsesLow.list( ref, comp_ref ), self ), lf );
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        comp_ref = cdolist_list_var_$4.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      complement = cdolist_list_var.first();
    }
    return lf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6624L)
  public static SubLObject prepositional_or_particle_word_tree_logical_form_int_method(final SubLObject self)
  {
    if( methods.funcall_instance_method_with_0_args( self, $sym95$GET_STRING ).equalp( $str96$of ) )
    {
      return NIL;
    }
    final SubLObject ref = methods.funcall_instance_method_with_0_args( self, $sym79$GET_REFS ).first();
    SubLObject lf = ConsesLow.list( new_lf_literal( methods.funcall_instance_method_with_0_args( self, $sym54$GET_LF_PREDICATE ), ConsesLow.list( ref ), self ) );
    final SubLObject complements = ConsesLow.list( methods.funcall_instance_method_with_0_args( self, $sym97$GET_OBLIQUE_OBJECT ) );
    final SubLObject modified = methods.funcall_instance_method_with_0_args( self, $sym85$GET_MODIFIEDS ).first();
    SubLObject cdolist_list_var;
    final SubLObject mod_refs = cdolist_list_var = ( NIL != modified ) ? methods.funcall_instance_method_with_0_args( modified, $sym79$GET_REFS ) : NIL;
    SubLObject mod_ref = NIL;
    mod_ref = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lf = ConsesLow.cons( new_lf_literal( $str86$modifies, ConsesLow.list( ref, mod_ref ), self ), lf );
      cdolist_list_var = cdolist_list_var.rest();
      mod_ref = cdolist_list_var.first();
    }
    cdolist_list_var = complements;
    SubLObject complement = NIL;
    complement = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$5 = methods.funcall_instance_method_with_0_args( complement, $sym79$GET_REFS );
      SubLObject comp_ref = NIL;
      comp_ref = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        lf = ConsesLow.cons( new_lf_literal( $str91$arg, ConsesLow.list( ref, comp_ref ), self ), lf );
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        comp_ref = cdolist_list_var_$5.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      complement = cdolist_list_var.first();
    }
    return lf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7411L)
  public static SubLObject possessive_word_tree_logical_form_int_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_possessive_word_tree_method = NIL;
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD );
      try
      {
        SubLObject lf = NIL;
        final SubLObject complement = methods.funcall_instance_method_with_0_args( self, $sym90$GET_COMPLEMENTS ).first();
        final SubLObject comp_refs = ( NIL != complement ) ? methods.funcall_instance_method_with_0_args( complement, $sym79$GET_REFS ) : NIL;
        final SubLObject grandmother = methods.funcall_instance_method_with_0_args( mother, $sym102$GET_MOTHER );
        final SubLObject possession = ( NIL != grandmother ) ? methods.funcall_instance_method_with_2_args( grandmother, $sym103$FIND_FIRST, $sym104$NOMINAL_TREE_P, number_utilities.f_1X( methods
            .funcall_instance_method_with_0_args( mother, $sym105$GET_INDEX ) ) ) : NIL;
        final SubLObject poss_refs = ( NIL != possession ) ? methods.funcall_instance_method_with_0_args( possession, $sym79$GET_REFS ) : NIL;
        SubLObject cdolist_list_var = comp_refs;
        SubLObject comp_ref = NIL;
        comp_ref = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$6 = poss_refs;
          SubLObject poss_ref = NIL;
          poss_ref = cdolist_list_var_$6.first();
          while ( NIL != cdolist_list_var_$6)
          {
            lf = ConsesLow.cons( new_lf_literal( methods.funcall_instance_method_with_0_args( self, $sym54$GET_LF_PREDICATE ), ConsesLow.list( comp_ref, poss_ref ), self ), lf );
            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
            poss_ref = cdolist_list_var_$6.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          comp_ref = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, lf );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          parse_tree.set_parse_tree_mother( self, mother );
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
      catch_var_for_possessive_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_possessive_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8067L)
  public static SubLObject parse_tree_logical_form_method(final SubLObject self, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( NIL != lexicon && !assertionsDisabledSynth && NIL == abstract_lexicon.abstract_lexicon_p( lexicon ) )
    {
      throw new AssertionError( lexicon );
    }
    if( NIL != lexicon )
    {
      methods.funcall_instance_method_with_1_args( self, $sym112$LEXIFY_INT, lexicon );
    }
    return methods.funcall_instance_method_with_0_args( self, $sym49$LOGICAL_FORM_INT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8338L)
  public static SubLObject logical_form(final SubLObject english, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    assert NIL != Types.stringp( english ) : english;
    if( NIL != lexicon && !assertionsDisabledSynth && NIL == abstract_lexicon.abstract_lexicon_p( lexicon ) )
    {
      throw new AssertionError( lexicon );
    }
    if( NIL != lexicon )
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym115$LEARN, english );
    }
    return methods.funcall_instance_method_with_1_args( methods.funcall_instance_method_with_2_args( parser.new_charniak_parser( UNPROVIDED, UNPROVIDED ), $sym4$PARSE, english, lexicon ), $sym107$LOGICAL_FORM, lexicon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8614L)
  public static SubLObject formula_keywords(final SubLObject formula)
  {
    SubLObject keywords = NIL;
    final SubLObject stack = stacks.create_stack();
    SubLObject v_term = NIL;
    stacks.stack_push( formula, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      final SubLObject entry = v_term = stacks.stack_pop( stack );
      if( v_term.isKeyword() )
      {
        final SubLObject item_var = v_term;
        if( NIL == conses_high.member( item_var, keywords, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          keywords = ConsesLow.cons( item_var, keywords );
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
    return keywords;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8864L)
  public static SubLObject lexical_keywords(final SubLObject lex)
  {
    final SubLObject frame = methods.funcall_instance_method_with_1_args( lex, $sym116$GET, $kw117$FRAME );
    final SubLObject semtrans = methods.funcall_instance_method_with_1_args( lex, $sym116$GET, $kw118$SEMTRANS );
    return Sequences.remove( $kw119$ACTION, Sequences.remove( $kw120$SCOPE, Sequences.remove_duplicates( formula_keywords( rename_variables( semtrans, frame_renaming( frame ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9532L)
  public static SubLObject get_subcyclifier_pool(final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $cyclifiers$.getDynamicValue( thread );
    SubLObject v_cyclifier = NIL;
    v_cyclifier = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( methods.funcall_instance_method_with_0_args( tree, $sym121$GET_ROOT ).eql( get_cyclifier_tree( v_cyclifier ) ) )
      {
        return get_cyclifier_subcyclifier_pool( v_cyclifier );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cyclifier = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_error_handling(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, TWELVE_INTEGER, $sym125$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_error_handling(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, TWELVE_INTEGER, $sym125$ERROR_HANDLING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_sbhl_resource(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, ELEVEN_INTEGER, $sym126$SBHL_RESOURCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_sbhl_resource(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, ELEVEN_INTEGER, $sym126$SBHL_RESOURCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_memoization_state(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, TEN_INTEGER, $sym127$MEMOIZATION_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_memoization_state(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, TEN_INTEGER, $sym127$MEMOIZATION_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_score(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, NINE_INTEGER, $sym128$SCORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_score(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, NINE_INTEGER, $sym128$SCORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_next(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, EIGHT_INTEGER, $sym129$NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_next(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, EIGHT_INTEGER, $sym129$NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_output(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, SEVEN_INTEGER, $sym130$OUTPUT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_output(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, SEVEN_INTEGER, $sym130$OUTPUT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_score_function(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, SIX_INTEGER, $sym131$SCORE_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_score_function(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, SIX_INTEGER, $sym131$SCORE_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_raw_cyclifications(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, FIVE_INTEGER, $sym132$RAW_CYCLIFICATIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_raw_cyclifications(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, FIVE_INTEGER, $sym132$RAW_CYCLIFICATIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_raw_cyclifiedP(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, FOUR_INTEGER, $sym133$RAW_CYCLIFIED_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_raw_cyclifiedP(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, FOUR_INTEGER, $sym133$RAW_CYCLIFIED_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_wff_checkP(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, THREE_INTEGER, $sym134$WFF_CHECK_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_wff_checkP(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, THREE_INTEGER, $sym134$WFF_CHECK_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_subcyclifier_pool(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, TWO_INTEGER, $sym135$SUBCYCLIFIER_POOL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_subcyclifier_pool(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, TWO_INTEGER, $sym135$SUBCYCLIFIER_POOL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject get_cyclifier_tree(final SubLObject v_cyclifier)
  {
    return classes.subloop_get_access_protected_instance_slot( v_cyclifier, ONE_INTEGER, $sym136$TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject set_cyclifier_tree(final SubLObject v_cyclifier, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_cyclifier, value, ONE_INTEGER, $sym136$TREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject subloop_reserved_initialize_cyclifier_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject subloop_reserved_initialize_cyclifier_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym136$TREE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym135$SUBCYCLIFIER_POOL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym134$WFF_CHECK_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym133$RAW_CYCLIFIED_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym132$RAW_CYCLIFICATIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym131$SCORE_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym130$OUTPUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym129$NEXT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym128$SCORE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym127$MEMOIZATION_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym126$SBHL_RESOURCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym122$CYCLIFIER, $sym125$ERROR_HANDLING, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9863L)
  public static SubLObject cyclifier_p(final SubLObject v_cyclifier)
  {
    return classes.subloop_instanceof_class( v_cyclifier, $sym122$CYCLIFIER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10577L)
  public static SubLObject cyclifier_has_nextP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclifier_method = NIL;
    SubLObject score = get_cyclifier_score( self );
    SubLObject next = get_cyclifier_next( self );
    final SubLObject score_function = get_cyclifier_score_function( self );
    SubLObject raw_cyclifications = get_cyclifier_raw_cyclifications( self );
    SubLObject raw_cyclifiedP = get_cyclifier_raw_cyclifiedP( self );
    final SubLObject wff_checkP = get_cyclifier_wff_checkP( self );
    final SubLObject tree = get_cyclifier_tree( self );
    try
    {
      thread.throwStack.push( $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD );
      try
      {
        if( NIL == raw_cyclifiedP )
        {
          final SubLObject _prev_bind_0 = cyclifier_interface.$allow_duplicate_cyclificationsP$.currentBinding( thread );
          final SubLObject _prev_bind_2 = cyclifier_interface.$cyclification_complete$.currentBinding( thread );
          final SubLObject _prev_bind_3 = $cyclifiers$.currentBinding( thread );
          try
          {
            cyclifier_interface.$allow_duplicate_cyclificationsP$.bind( NIL, thread );
            cyclifier_interface.$cyclification_complete$.bind( NIL, thread );
            $cyclifiers$.bind( ConsesLow.cons( self, $cyclifiers$.getDynamicValue( thread ) ), thread );
            raw_cyclifications = rank_cyclifications( methods.funcall_instance_method_with_0_args( tree, $sym142$CYCLIFY_INT ), score_function );
            raw_cyclifiedP = T;
          }
          finally
          {
            $cyclifiers$.rebind( _prev_bind_3, thread );
            cyclifier_interface.$cyclification_complete$.rebind( _prev_bind_2, thread );
            cyclifier_interface.$allow_duplicate_cyclificationsP$.rebind( _prev_bind_0, thread );
          }
        }
        while ( NIL == next && NIL != raw_cyclifications)
        {
          next = raw_cyclifications.first().first();
          score = raw_cyclifications.first().rest();
          next = methods.funcall_class_method_with_1_args( $sym143$CYCLIFICATION, $sym144$EL_FORMULA, next );
          if( NIL != el_utilities.el_formula_p( next ) )
          {
            next = el_utilities.el_remove_unnecessary_existentials( next );
            next = simplifier.fold_equals( next );
            next = list_utilities.tree_delete( $kw120$SCOPE, beautify_cyclification( next ), UNPROVIDED, UNPROVIDED );
            if( NIL != wff_checkP )
            {
              next = methods.funcall_instance_method_with_1_args( self, $sym145$WFF_CHECK, next );
            }
            if( NIL != next && NIL == methods.funcall_instance_method_with_0_args( tree, $sym146$CYCLIFIABLE_QUESTION_P ) )
            {
              next = predicate_strengthener.typed_pred_strengthen_formula_unambiguously( next, $const147$CurrentWorldDataCollectorMt_NonHo, UNPROVIDED ).first();
            }
          }
          raw_cyclifications = raw_cyclifications.rest();
        }
        Dynamic.sublisp_throw( $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD, list_utilities.sublisp_boolean( next ) );
      }
      finally
      {
        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclifier_score( self, score );
          set_cyclifier_next( self, next );
          set_cyclifier_score_function( self, score_function );
          set_cyclifier_raw_cyclifications( self, raw_cyclifications );
          set_cyclifier_raw_cyclifiedP( self, raw_cyclifiedP );
          set_cyclifier_wff_checkP( self, wff_checkP );
          set_cyclifier_tree( self, tree );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cyclifier_method = Errors.handleThrowable( ccatch_env_var, $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclifier_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12328L)
  public static SubLObject cyclifier_next_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclifier_method = NIL;
    SubLObject score = get_cyclifier_score( self );
    SubLObject next = get_cyclifier_next( self );
    final SubLObject output = get_cyclifier_output( self );
    try
    {
      thread.throwStack.push( $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD );
      try
      {
        if( NIL != methods.funcall_instance_method_with_0_args( self, $sym139$HAS_NEXT_ ) )
        {
          final SubLObject cycl = get_cyclifier_next( self );
          final SubLObject s = get_cyclifier_score( self );
          next = NIL;
          score = NIL;
          final SubLObject pcase_var = output;
          if( pcase_var.eql( $kw151$BRIEF ) )
          {
            Dynamic.sublisp_throw( $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD, cycl );
          }
          else if( pcase_var.eql( $kw152$VERBOSE ) )
          {
            Dynamic.sublisp_throw( $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD, ConsesLow.cons( cycl, s ) );
          }
          else
          {
            Errors.error( $str153$Illegal_output_format__a, output );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclifier_score( self, score );
          set_cyclifier_next( self, next );
          set_cyclifier_output( self, output );
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
      catch_var_for_cyclifier_method = Errors.handleThrowable( ccatch_env_var, $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclifier_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12735L)
  public static SubLObject cyclifier_wff_check_method(final SubLObject self, SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclifier_method = NIL;
    SubLObject sbhl_resource = get_cyclifier_sbhl_resource( self );
    final SubLObject v_memoization_state = get_cyclifier_memoization_state( self );
    try
    {
      thread.throwStack.push( $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD );
      try
      {
        SubLObject wffP = NIL;
        final SubLObject local_state = v_memoization_state;
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_resource, thread );
              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
              sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
              try
              {
                thread.resetMultipleValues();
                final SubLObject wffP_$8 = cyclifier_wffP( narts_high.nart_substitute( cycl ), UNPROVIDED );
                final SubLObject cycl_$9 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                wffP = wffP_$8;
                cycl = cycl_$9;
              }
              finally
              {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
              sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0_$7, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
        }
        Dynamic.sublisp_throw( $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD, ( NIL != wffP ) ? cycl : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          set_cyclifier_sbhl_resource( self, sbhl_resource );
          set_cyclifier_memoization_state( self, v_memoization_state );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_cyclifier_method = Errors.handleThrowable( ccatch_env_var, $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclifier_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13033L)
  public static SubLObject storing_cyclifier_wff_resultsP()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13516L)
  public static SubLObject cyclifier_wffP(final SubLObject cycl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $list160;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject wffP = NIL;
    if( NIL != cycl )
    {
      final SubLObject var_cycl = subst_vars_for_instancefn( cycl );
      if( NIL != cyclifier_wff_intP( var_cycl, mt ) )
      {
        wffP = T;
      }
    }
    if( NIL != storing_cyclifier_wff_resultsP() )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw161$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym162$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            SubLObject stream = NIL;
            try
            {
              stream = compatibility.open_text( parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue( thread ), $kw163$APPEND );
              if( !stream.isStream() )
              {
                Errors.error( $str164$Unable_to_open__S, parsing_vars.$cyclifier_wff_checking_results$.getDynamicValue( thread ) );
              }
              final SubLObject s = stream;
              PrintLow.format( s, $str165$____original__S____output_cycl__S, new SubLObject[] { cycl, cycl, wffP, control_vars.kb_loaded()
              } );
            }
            finally
            {
              final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
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
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw161$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return Values.values( wffP, cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14286L)
  public static SubLObject cyclifier_handle_error_method(final SubLObject self, final SubLObject error)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclifier_method = NIL;
    final SubLObject error_handling = get_cyclifier_error_handling( self );
    try
    {
      thread.throwStack.push( $sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD );
      try
      {
        final SubLObject pcase_var = error_handling;
        if( pcase_var.eql( $kw170$THROW ) )
        {
          Errors.error( error );
        }
        else if( pcase_var.eql( $kw171$WARN ) )
        {
          Errors.warn( error );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclifier_error_handling( self, error_handling );
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
      catch_var_for_cyclifier_method = Errors.handleThrowable( ccatch_env_var, $sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclifier_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14430L)
  public static SubLObject subst_vars_for_instancefn(final SubLObject cycl)
  {
    return conses_high.sublis( create_term_to_var_mapping( cycl ), cycl, EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14545L)
  public static SubLObject create_term_to_var_mapping(final SubLObject cycl)
  {
    SubLObject mapping = NIL;
    SubLObject cdolist_list_var = gather_instancefn_terms( cycl );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      mapping = ConsesLow.cons( ConsesLow.cons( v_term, new_lf_variable( cycl_utilities.formula_arg1( v_term, UNPROVIDED ) ) ), mapping );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return mapping;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14764L)
  public static SubLObject gather_instancefn_terms(final SubLObject cycl)
  {
    SubLObject terms = NIL;
    final SubLObject stack = stacks.create_stack();
    SubLObject arg = NIL;
    stacks.stack_push( cycl, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      final SubLObject entry = arg = stacks.stack_pop( stack );
      if( cycl_utilities.formula_operator( arg ).eql( $const173$InstanceFn ) )
      {
        final SubLObject item_var = arg;
        if( NIL == conses_high.member( item_var, terms, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          terms = ConsesLow.cons( item_var, terms );
        }
      }
      SubLObject cdolist_list_var = cycl_utilities.formula_args( entry, UNPROVIDED );
      SubLObject arg_$13 = NIL;
      arg_$13 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        stacks.stack_push( arg_$13, stack );
        cdolist_list_var = cdolist_list_var.rest();
        arg_$13 = cdolist_list_var.first();
      }
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14983L)
  public static SubLObject beautify_cyclification(final SubLObject cycl)
  {
    final SubLObject operator = cycl_utilities.formula_operator( cycl );
    if( NIL != el_utilities.el_conjunction_p( cycl ) )
    {
      return simplifier.conjoin( Mapping.mapcar( $sym174$BEAUTIFY_CYCLIFICATION, simplifier.lift_conjuncts( cycl_utilities.formula_args( cycl, UNPROVIDED ) ) ), UNPROVIDED );
    }
    if( NIL != fort_types_interface.quantifier_p( operator ) )
    {
      return ConsesLow.append( conses_high.butlast( cycl, UNPROVIDED ), ConsesLow.list( beautify_cyclification( quantified_formula( cycl ) ) ) );
    }
    if( NIL != fort_types_interface.logical_connective_p( operator ) )
    {
      return ConsesLow.cons( operator, Mapping.mapcar( $sym174$BEAUTIFY_CYCLIFICATION, cycl_utilities.formula_args( cycl, UNPROVIDED ) ) );
    }
    return cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15546L)
  public static SubLObject quantified_quantifier(final SubLObject quantified)
  {
    return cycl_utilities.formula_operator( quantified );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15637L)
  public static SubLObject quantified_variable(final SubLObject quantified)
  {
    return conses_high.nthcdr( Numbers.subtract( Sequences.length( quantified ), TWO_INTEGER ), quantified ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15748L)
  public static SubLObject quantified_formula(final SubLObject quantified)
  {
    return conses_high.last( quantified, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15830L)
  public static SubLObject apply_alist(final SubLObject alist, final SubLObject tree, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return conses_high.sublis( alist, tree, test, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15929L)
  public static SubLObject non_singleton_possibly_equal_terms(final SubLObject cycl)
  {
    SubLObject terms = NIL;
    SubLObject non_singleton_terms = NIL;
    final SubLObject stack = stacks.create_stack();
    SubLObject clause = NIL;
    stacks.stack_push( cycl, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      final SubLObject entry = stacks.stack_pop( stack );
      if( NIL != el_utilities.literalP( entry ) )
      {
        clause = entry;
        if( NIL != equals_clauseP( clause ) && NIL != cycl_utilities.expression_find_if( $sym175$CYC_VAR_, cycl_utilities.formula_arg1( clause, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject item_var = cycl_utilities.formula_arg1( clause, UNPROVIDED );
          if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            terms = ConsesLow.cons( item_var, terms );
          }
          if( NIL != cycl_utilities.expression_find_if( $sym175$CYC_VAR_, cycl_utilities.formula_arg2( clause, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
          {
            item_var = cycl_utilities.formula_arg2( clause, UNPROVIDED );
            if( NIL == conses_high.member( item_var, terms, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              terms = ConsesLow.cons( item_var, terms );
            }
          }
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
    SubLObject cdolist_list_var2 = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != list_utilities.lengthG( cycl_utilities.arg_positions_bfs( v_term, cycl, Symbols.symbol_function( EQUAL ) ), ONE_INTEGER, UNPROVIDED ) )
      {
        non_singleton_terms = ConsesLow.cons( v_term, non_singleton_terms );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      v_term = cdolist_list_var2.first();
    }
    return non_singleton_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17350L)
  public static SubLObject get_assignment(final SubLObject cycl, SubLObject vars)
  {
    if( vars == UNPROVIDED )
    {
      vars = el_utilities.sentence_variables( cycl, UNPROVIDED, UNPROVIDED );
    }
    SubLObject v_bindings = NIL;
    SubLObject to_be_deleted = NIL;
    final SubLObject stack = stacks.create_stack();
    SubLObject clause = NIL;
    stacks.stack_push( cycl, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      final SubLObject entry = stacks.stack_pop( stack );
      if( NIL != el_utilities.literalP( entry ) )
      {
        clause = entry;
        if( NIL != equals_clauseP( clause ) )
        {
          if( cycl_utilities.formula_arg1( clause, UNPROVIDED ).equal( cycl_utilities.formula_arg2( clause, UNPROVIDED ) ) )
          {
            to_be_deleted = ConsesLow.cons( clause, to_be_deleted );
          }
          else if( NIL != subl_promotions.memberP( cycl_utilities.formula_arg1( clause, UNPROVIDED ), vars, UNPROVIDED, UNPROVIDED ) )
          {
            v_bindings = ConsesLow.cons( bindings.make_variable_binding( cycl_utilities.formula_arg1( clause, UNPROVIDED ), cycl_utilities.formula_arg2( clause, UNPROVIDED ) ), v_bindings );
          }
          else if( NIL != subl_promotions.memberP( cycl_utilities.formula_arg2( clause, UNPROVIDED ), vars, UNPROVIDED, UNPROVIDED ) )
          {
            v_bindings = ConsesLow.cons( bindings.make_variable_binding( cycl_utilities.formula_arg2( clause, UNPROVIDED ), cycl_utilities.formula_arg1( clause, UNPROVIDED ) ), v_bindings );
          }
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
    SubLObject cdolist_list_var2 = to_be_deleted;
    clause = NIL;
    clause = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      list_utilities.tree_delete( clause, cycl, EQUAL, UNPROVIDED );
      cdolist_list_var2 = cdolist_list_var2.rest();
      clause = cdolist_list_var2.first();
    }
    if( cycl.equal( $list176 ) )
    {
      Sequences.delete( $const177$and, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18447L)
  public static SubLObject equals_clauseP(final SubLObject cycl)
  {
    return subl_promotions.memberP( cycl_utilities.formula_operator( cycl ), $list178, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18644L)
  public static SubLObject quick_sentential_parse_wffP(final SubLObject cycl)
  {
    return cyclifier_wff_intP( cycl, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18787L)
  public static SubLObject cyclifier_wff_intP(final SubLObject var_cycl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $list160;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject wffP = NIL;
    final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_vars.$provide_wff_suggestionsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$use_transcriptP$.currentBinding( thread );
    try
    {
      wff_vars.$permit_keyword_variablesP$.bind( T, thread );
      wff_vars.$provide_wff_suggestionsP$.bind( NIL, thread );
      control_vars.$use_transcriptP$.bind( NIL, thread );
      final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
      final SubLObject _prev_bind_1_$15 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
      final SubLObject _prev_bind_2_$16 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
        wffP = makeBoolean( NIL != constant_arguments_okP( var_cycl, mt ) && NIL != variable_arguments_okP( var_cycl, mt ) );
      }
      finally
      {
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2_$16, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1_$15, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$14, thread );
      }
    }
    finally
    {
      control_vars.$use_transcriptP$.rebind( _prev_bind_3, thread );
      wff_vars.$provide_wff_suggestionsP$.rebind( _prev_bind_2, thread );
      wff_vars.$permit_keyword_variablesP$.rebind( _prev_bind_0, thread );
    }
    return wffP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19337L)
  public static SubLObject variable_arguments_okP(final SubLObject cycl, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding( thread );
    try
    {
      at_vars.$at_check_inter_arg_isaP$.bind( T, thread );
      okP = at_var_types.inter_formula_var_types_okP( cycl, mt );
    }
    finally
    {
      at_vars.$at_check_inter_arg_isaP$.rebind( _prev_bind_0, thread );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19607L)
  public static SubLObject constant_arguments_okP(final SubLObject cycl, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = T;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      okP = at_admitted.admitted_sentence_wrt_asent_arg_constraintsP( cycl );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19876L)
  public static SubLObject quantify_implicit_subject(final SubLObject cyclification)
  {
    SubLObject cycl = methods.funcall_instance_method_with_0_args( cyclification, $sym179$GET_CYCL );
    if( NIL != subl_promotions.memberP( $kw180$SUBJECT, formula_keywords( cycl ), UNPROVIDED, UNPROVIDED ) )
    {
      cycl = parse_tree.quantify_existentially( rename_variables( cycl, $list181 ), $list182 );
      instances.set_slot( cyclification, $sym183$CYCL, cycl );
    }
    return cyclification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20255L)
  public static SubLObject required_keywords(final SubLObject lexes)
  {
    SubLObject keywords = NIL;
    SubLObject cdolist_list_var = lexes;
    SubLObject rle = NIL;
    rle = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      keywords = ConsesLow.append( formula_keywords( methods.funcall_instance_method_with_1_args( rle_lex( rle ), $sym116$GET, $kw118$SEMTRANS ) ), keywords );
      cdolist_list_var = cdolist_list_var.rest();
      rle = cdolist_list_var.first();
    }
    return Sequences.remove_duplicates( keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20628L)
  public static SubLObject rename_variables(SubLObject formula, final SubLObject renaming)
  {
    SubLObject cdolist_list_var = renaming;
    SubLObject oldXnew = NIL;
    oldXnew = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      formula = el_utilities.variable_subst( oldXnew.rest(), oldXnew.first(), formula );
      cdolist_list_var = cdolist_list_var.rest();
      oldXnew = cdolist_list_var.first();
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20965L)
  public static SubLObject frame_renaming(final SubLObject frame)
  {
    return ( NIL != nart_handles.nart_p( frame ) && cycl_utilities.formula_operator( narts_high.nart_el_formula( frame ) ).eql( $const184$PPCompFrameFn ) ) ? $list185 : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21149L)
  public static SubLObject cyclify_int(final SubLObject v_cyclifier)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycls = NIL;
    SubLObject error_message = NIL;
    if( NIL != cyclifier_catch_errorsP() )
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym186$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( NIL != v_cyclifier )
            {
              while ( NIL != methods.funcall_instance_method_with_0_args( v_cyclifier, $sym139$HAS_NEXT_ ))
              {
                cycls = ConsesLow.cons( methods.funcall_instance_method_with_0_args( v_cyclifier, $sym129$NEXT ), cycls );
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
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
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
    else if( NIL != v_cyclifier )
    {
      while ( NIL != methods.funcall_instance_method_with_0_args( v_cyclifier, $sym139$HAS_NEXT_ ))
      {
        cycls = ConsesLow.cons( methods.funcall_instance_method_with_0_args( v_cyclifier, $sym129$NEXT ), cycls );
      }
    }
    if( NIL != error_message )
    {
      methods.funcall_instance_method_with_1_args( v_cyclifier, $sym166$HANDLE_ERROR, error_message );
    }
    return Sequences.nreverse( cycls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21502L)
  public static SubLObject cyclify_link(final SubLObject english, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( english ) : english;
    SubLObject cyclifier_properties = conses_high.putf( v_properties, $kw187$PARSER, parser.new_link_parser( linkage.$link_parse_options$.getDynamicValue( thread ), $kw171$WARN, UNPROVIDED ) );
    cyclifier_properties = list_utilities.maybe_putf( cyclifier_properties, $kw188$LEXICON, object.new_class_instance( $sym189$CYCLIFIER_LEXICON ) );
    final SubLObject v_cyclifier = new_cyclifier( english, cyclifier_properties );
    return cyclify_int( v_cyclifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22073L)
  public static SubLObject cyclify_charniak(final SubLObject english, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    assert NIL != Types.stringp( english ) : english;
    final SubLObject v_parser = parser.new_charniak_parser( UNPROVIDED, UNPROVIDED );
    final SubLObject v_cyclifier = new_cyclifier( english, conses_high.putf( v_properties, $kw187$PARSER, v_parser ) );
    return cyclify_int( v_cyclifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22385L)
  public static SubLObject cyclify_stanford(final SubLObject english, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    assert NIL != Types.stringp( english ) : english;
    final SubLObject v_cyclifier = new_cyclifier( english, conses_high.putf( v_properties, $kw187$PARSER, parser.new_stanford_parser( UNPROVIDED, UNPROVIDED ) ) );
    return cyclify_int( v_cyclifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22679L)
  public static SubLObject cyclify(final SubLObject english, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    assert NIL != Types.stringp( english ) : english;
    final SubLObject v_cyclifier = new_cyclifier( english, v_properties );
    return cyclify_int( v_cyclifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22983L)
  public static SubLObject cyclifier_catch_errorsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $cyclifier_catch_errorsP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23151L)
  public static SubLObject new_cyclifier(final SubLObject english, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = v_properties;
    final SubLObject lexicon_tail = cdestructuring_bind.property_list_member( $kw188$LEXICON, current );
    final SubLObject lexicon = ( NIL != lexicon_tail ) ? conses_high.cadr( lexicon_tail ) : object.new_class_instance( $sym189$CYCLIFIER_LEXICON );
    final SubLObject parser_tail = cdestructuring_bind.property_list_member( $kw187$PARSER, current );
    final SubLObject v_parser = ( NIL != parser_tail ) ? conses_high.cadr( parser_tail ) : Functions.funcall( $default_cyclifier_parser_factory$.getDynamicValue( thread ) );
    final SubLObject context_tail = cdestructuring_bind.property_list_member( $kw192$CONTEXT, current );
    final SubLObject v_context = ( NIL != context_tail ) ? conses_high.cadr( context_tail ) : object.new_class_instance( $sym193$PARSE_TREE_CONTEXT );
    assert NIL != Types.stringp( english ) : english;
    methods.funcall_instance_method_with_1_args( lexicon, $sym115$LEARN, english );
    final SubLObject tree = methods.funcall_instance_method_with_3_args( v_parser, $sym4$PARSE, english, lexicon, v_context );
    SubLObject v_cyclifier = NIL;
    SubLObject error = NIL;
    if( NIL != cyclifier_catch_errorsP() )
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym186$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            v_cyclifier = ( NIL != tree ) ? methods.funcall_instance_method_with_1_args( tree, $sym194$GET_CYCLIFIER, v_properties ) : NIL;
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
    }
    else
    {
      v_cyclifier = ( NIL != tree ) ? methods.funcall_instance_method_with_1_args( tree, $sym194$GET_CYCLIFIER, v_properties ) : NIL;
    }
    if( NIL != error )
    {
      methods.funcall_instance_method_with_1_args( v_parser, $sym166$HANDLE_ERROR, Sequences.cconcatenate( format_nil.format_nil_a_no_copy( error ), new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(),
        $str195$Sentence__, format_nil.format_nil_a_no_copy( english )
      } ) );
    }
    return v_cyclifier;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24020L)
  public static SubLObject new_parse_cyclifier(final SubLObject parse, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLObject current;
    final SubLObject datum = current = v_properties;
    final SubLObject context_tail = cdestructuring_bind.property_list_member( $kw192$CONTEXT, current );
    final SubLObject v_context = ( NIL != context_tail ) ? conses_high.cadr( context_tail ) : object.new_class_instance( $sym193$PARSE_TREE_CONTEXT );
    assert NIL != Types.listp( parse ) : parse;
    final SubLObject tree = parse_tree.new_parse_tree( parser.retag( parser.strip_shell( parse ) ), NIL, v_context );
    return ( NIL != tree ) ? methods.funcall_instance_method_with_1_args( tree, $sym194$GET_CYCLIFIER, v_properties ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24503L)
  public static SubLObject cyclify_parse(final SubLObject parse_string, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    assert NIL != Types.stringp( parse_string ) : parse_string;
    final SubLObject parse = reader.read_from_string( parse_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject v_cyclifier = new_parse_cyclifier( parse, v_properties );
    return cyclify_int( v_cyclifier );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24864L)
  public static SubLObject free_variable_p(final SubLObject keyword)
  {
    return string_utilities.starts_with( Symbols.symbol_name( keyword ), $str198$__ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject get_cyclification_confidence(final SubLObject cyclification)
  {
    return classes.subloop_get_access_protected_instance_slot( cyclification, THREE_INTEGER, $sym200$CONFIDENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject set_cyclification_confidence(final SubLObject cyclification, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyclification, value, THREE_INTEGER, $sym200$CONFIDENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject get_cyclification_word(final SubLObject cyclification)
  {
    return classes.subloop_get_access_protected_instance_slot( cyclification, TWO_INTEGER, $sym201$WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject set_cyclification_word(final SubLObject cyclification, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyclification, value, TWO_INTEGER, $sym201$WORD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject get_cyclification_cycl(final SubLObject cyclification)
  {
    return classes.subloop_get_access_protected_instance_slot( cyclification, ONE_INTEGER, $sym183$CYCL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject set_cyclification_cycl(final SubLObject cyclification, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cyclification, value, ONE_INTEGER, $sym183$CYCL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject subloop_reserved_initialize_cyclification_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject subloop_reserved_initialize_cyclification_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym143$CYCLIFICATION, $sym183$CYCL, NIL );
    classes.subloop_initialize_slot( new_instance, $sym143$CYCLIFICATION, $sym201$WORD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym143$CYCLIFICATION, $sym200$CONFIDENCE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25028L)
  public static SubLObject cyclification_p(final SubLObject cyclification)
  {
    return classes.subloop_instanceof_class( cyclification, $sym143$CYCLIFICATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25629L)
  public static SubLObject new_cyclification(final SubLObject cycl, final SubLObject word, final SubLObject confidence)
  {
    assert NIL != Types.numberp( confidence ) : confidence;
    final SubLObject cyclification = object.new_class_instance( $sym143$CYCLIFICATION );
    set_cyclification_cycl( cyclification, cycl );
    set_cyclification_word( cyclification, word );
    set_cyclification_confidence( cyclification, confidence );
    return cyclification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25967L)
  public static SubLObject cyclification_get_cycl_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclification_method = NIL;
    final SubLObject cycl = get_cyclification_cycl( self );
    try
    {
      thread.throwStack.push( $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, cycl );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclification_cycl( self, cycl );
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
      catch_var_for_cyclification_method = Errors.handleThrowable( ccatch_env_var, $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclification_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26104L)
  public static SubLObject cyclification_get_word_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclification_method = NIL;
    final SubLObject word = get_cyclification_word( self );
    try
    {
      thread.throwStack.push( $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, word );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclification_word( self, word );
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
      catch_var_for_cyclification_method = Errors.handleThrowable( ccatch_env_var, $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclification_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26230L)
  public static SubLObject cyclification_get_confidence_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclification_method = NIL;
    final SubLObject confidence = get_cyclification_confidence( self );
    try
    {
      thread.throwStack.push( $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, confidence );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclification_confidence( self, confidence );
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
      catch_var_for_cyclification_method = Errors.handleThrowable( ccatch_env_var, $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclification_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26444L)
  public static SubLObject cyclification_copy_method(final SubLObject self)
  {
    final SubLObject copy = object.new_class_instance( $sym143$CYCLIFICATION );
    set_cyclification_cycl( copy, methods.funcall_instance_method_with_0_args( self, $sym179$GET_CYCL ) );
    set_cyclification_word( copy, methods.funcall_instance_method_with_0_args( self, $sym208$GET_WORD ) );
    set_cyclification_confidence( copy, methods.funcall_instance_method_with_0_args( self, $sym212$GET_CONFIDENCE ) );
    return copy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26807L)
  public static SubLObject cyclification_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cyclification_method = NIL;
    final SubLObject cycl = get_cyclification_cycl( self );
    try
    {
      thread.throwStack.push( $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD );
      try
      {
        streams_high.write_string( $str221$__CYCLIFICATION_, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( cycl, stream );
        streams_high.write_string( $str222$_, stream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cyclification_cycl( self, cycl );
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
      catch_var_for_cyclification_method = Errors.handleThrowable( ccatch_env_var, $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cyclification_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27065L)
  public static SubLObject cyclification_el_formula_method(final SubLObject self, final SubLObject cyclification_formula)
  {
    SubLObject result = NIL;
    if( cyclification_formula.isList() )
    {
      SubLObject cdolist_list_var = cyclification_formula;
      SubLObject e = NIL;
      e = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( methods.funcall_class_method_with_1_args( $sym143$CYCLIFICATION, $sym144$EL_FORMULA, e ), result );
        cdolist_list_var = cdolist_list_var.rest();
        e = cdolist_list_var.first();
      }
      return Sequences.nreverse( result );
    }
    if( NIL != cyclification_p( cyclification_formula ) )
    {
      return methods.funcall_class_method_with_1_args( $sym143$CYCLIFICATION, $sym144$EL_FORMULA, methods.funcall_instance_method_with_0_args( cyclification_formula, $sym179$GET_CYCL ) );
    }
    return cyclification_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27573L)
  public static SubLObject cyclification_find_method(final SubLObject self, final SubLObject cyclification, final SubLObject item, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQL;
    }
    if( cyclification.isList() )
    {
      SubLObject result = NIL;
      if( NIL == result )
      {
        SubLObject csome_list_var;
        SubLObject e;
        for( csome_list_var = cyclification, e = NIL, e = csome_list_var.first(); NIL == result && NIL != csome_list_var; result = methods.funcall_class_method_with_3_args( $sym143$CYCLIFICATION, $sym227$FIND, e, item,
            test ), csome_list_var = csome_list_var.rest(), e = csome_list_var.first() )
        {
        }
      }
      return result;
    }
    if( NIL != cyclification_p( cyclification ) )
    {
      return methods.funcall_class_method_with_3_args( $sym143$CYCLIFICATION, $sym227$FIND, methods.funcall_instance_method_with_0_args( cyclification, $sym179$GET_CYCL ), item, test );
    }
    return Functions.funcall( test, cyclification, item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27997L)
  public static SubLObject cyclification_substitute_method(final SubLObject self, final SubLObject cyclification, final SubLObject v_new, final SubLObject old, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQL;
    }
    if( cyclification.isList() )
    {
      SubLObject new_list = NIL;
      SubLObject cdolist_list_var = cyclification;
      SubLObject e = NIL;
      e = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        new_list = ConsesLow.cons( methods.funcall_class_method_with_3_args( $sym143$CYCLIFICATION, $sym231$SUBSTITUTE, e, v_new, old ), new_list );
        cdolist_list_var = cdolist_list_var.rest();
        e = cdolist_list_var.first();
      }
      return Sequences.nreverse( new_list );
    }
    if( NIL != cyclification_p( cyclification ) )
    {
      final SubLObject new_cyclification = object.new_class_instance( $sym143$CYCLIFICATION );
      set_cyclification_cycl( new_cyclification, methods.funcall_class_method_with_3_args( $sym143$CYCLIFICATION, $sym231$SUBSTITUTE, methods.funcall_instance_method_with_0_args( cyclification, $sym179$GET_CYCL ), v_new,
          old ) );
      set_cyclification_word( new_cyclification, methods.funcall_instance_method_with_0_args( cyclification, $sym208$GET_WORD ) );
      set_cyclification_confidence( new_cyclification, methods.funcall_instance_method_with_0_args( cyclification, $sym212$GET_CONFIDENCE ) );
      return new_cyclification;
    }
    return ( NIL != Functions.funcall( test, cyclification, old ) ) ? v_new : cyclification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28802L)
  public static SubLObject cyclification_score(final SubLObject sem)
  {
    if( NIL != cyclification_p( sem ) )
    {
      return Numbers.multiply( methods.funcall_instance_method_with_0_args( sem, $sym212$GET_CONFIDENCE ), cyclification_score( methods.funcall_instance_method_with_0_args( sem, $sym179$GET_CYCL ) ) );
    }
    if( NIL != list_utilities.non_empty_list_p( sem ) )
    {
      return ONE_INTEGER;
    }
    if( sem.isKeyword() )
    {
      return ONE_INTEGER;
    }
    if( NIL != fort_types_interface.logical_connective_p( sem.first() ) )
    {
      SubLObject c = ONE_INTEGER;
      SubLObject cdolist_list_var = sem.rest();
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        c = Numbers.multiply( c, cyclification_score( arg ) );
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      return c;
    }
    if( NIL != fort_types_interface.quantifier_p( sem.first() ) )
    {
      return cyclification_score( quantified_formula( sem ) );
    }
    if( NIL != el_utilities.literalP( sem ) )
    {
      return ONE_INTEGER;
    }
    Errors.error( $str235$illegal_cyclification__a, sem );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29466L)
  public static SubLObject cyclification_coverage(final SubLObject sem)
  {
    SubLObject length = ZERO_INTEGER;
    SubLObject cdolist_list_var = cyclification_yield( sem );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == cyclifier_interface.punctuation_word_p( word ) )
      {
        length = Numbers.add( length, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return Numbers.divide( cyclification_coverage_int( sem ), length );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29788L)
  public static SubLObject cyclification_yield(final SubLObject sem)
  {
    if( NIL != cyclification_p( sem ) )
    {
      final SubLObject word = methods.funcall_instance_method_with_0_args( sem, $sym208$GET_WORD );
      final SubLObject tree = methods.funcall_instance_method_with_0_args( word, $sym121$GET_ROOT );
      return methods.funcall_instance_method_with_0_args( tree, $sym236$YIELD );
    }
    if( NIL != fort_types_interface.logical_connective_p( sem.first() ) )
    {
      return cyclification_yield( sem.rest().first() );
    }
    Errors.error( $str237$Illegal_cyclification__a, sem );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30173L)
  public static SubLObject cyclification_coverage_int(final SubLObject sem)
  {
    if( NIL != cyclification_p( sem ) )
    {
      final SubLObject new_sem = methods.funcall_instance_method_with_0_args( sem, $sym179$GET_CYCL );
      if( NIL != cyclification_p( new_sem ) )
      {
        return cyclification_coverage_int( new_sem );
      }
      return number_utilities.f_1X( cyclification_coverage_int( methods.funcall_instance_method_with_0_args( sem, $sym179$GET_CYCL ) ) );
    }
    else
    {
      if( sem.isKeyword() )
      {
        return ZERO_INTEGER;
      }
      if( NIL != fort_types_interface.logical_connective_p( sem.first() ) )
      {
        SubLObject c = ZERO_INTEGER;
        SubLObject cdolist_list_var = sem.rest();
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          c = Numbers.add( c, cyclification_coverage_int( arg ) );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return c;
      }
      if( NIL != fort_types_interface.quantifier_p( sem.first() ) )
      {
        return cyclification_coverage_int( quantified_formula( sem ) );
      }
      if( NIL != el_utilities.literalP( sem ) )
      {
        return ZERO_INTEGER;
      }
      Errors.error( $str235$illegal_cyclification__a, sem );
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30804L)
  public static SubLObject rank_cyclifications(final SubLObject cyclifications, SubLObject score_function)
  {
    if( score_function == UNPROVIDED )
    {
      score_function = $sym238$CYCLIFICATION_SCORE;
    }
    SubLObject scored = NIL;
    SubLObject cdolist_list_var = cyclifications;
    SubLObject cyclification = NIL;
    cyclification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      scored = ConsesLow.cons( ConsesLow.cons( cyclification, Functions.funcall( score_function, cyclification ) ), scored );
      cdolist_list_var = cdolist_list_var.rest();
      cyclification = cdolist_list_var.first();
    }
    return Sort.sort( scored, $sym239$_, $sym240$CDR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31159L)
  public static SubLObject new_ranked_lex_entry(final SubLObject lex, SubLObject score)
  {
    if( score == UNPROVIDED )
    {
      score = ZERO_INTEGER;
    }
    return ConsesLow.cons( lex, score );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31310L)
  public static SubLObject rle_lex(final SubLObject rle)
  {
    return rle.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31362L)
  public static SubLObject rle_confidence(final SubLObject rle)
  {
    return rle.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31421L)
  public static SubLObject rle_set_lex(final SubLObject rle, final SubLObject lex)
  {
    return ConsesLow.rplaca( rle, lex );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31488L)
  public static SubLObject rle_set_confidence(final SubLObject rle, final SubLObject score)
  {
    return ConsesLow.rplacd( rle, score );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31566L)
  public static SubLObject rle_sem_equal(final SubLObject rle1, final SubLObject rle2)
  {
    return Equality.equal( methods.funcall_instance_method_with_1_args( rle_lex( rle1 ), $sym116$GET, $kw118$SEMTRANS ), methods.funcall_instance_method_with_1_args( rle_lex( rle2 ), $sym116$GET, $kw118$SEMTRANS ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31706L)
  public static SubLObject ranked_lex_entry_p(final SubLObject obj)
  {
    return makeBoolean( obj.isCons() && obj.rest().isNumber() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31806L)
  public static SubLObject new_even_lex_entry_distribution(final SubLObject lexes)
  {
    if( NIL == lexes )
    {
      return NIL;
    }
    SubLObject distribution = NIL;
    final SubLObject confidence = Numbers.divide( ONE_INTEGER, Sequences.length( lexes ) );
    SubLObject cdolist_list_var = lexes;
    SubLObject lex = NIL;
    lex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      distribution = ConsesLow.cons( new_ranked_lex_entry( lex, confidence ), distribution );
      cdolist_list_var = cdolist_list_var.rest();
      lex = cdolist_list_var.first();
    }
    return distribution;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32243L)
  public static SubLObject instantiate_scope(final SubLObject unscoped)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject lambda_expressions = partition_unscoped( unscoped );
    SubLObject non_lambda_expressions = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( !Sequences.length( non_lambda_expressions ).numL( TWO_INTEGER ) )
    {
      non_lambda_expressions = ConsesLow.list( simplifier.conjoin( non_lambda_expressions, UNPROVIDED ) );
    }
    return beta_reduce( ( NIL != non_lambda_expressions ) ? non_lambda_expressions.first() : NIL, Sequences.reverse( scope_quantifiers( lambda_expressions ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32722L)
  public static SubLObject scope_quantifiers(final SubLObject lambda_expressions)
  {
    return Sort.sort( lambda_expressions, $sym241$_, $sym242$QUANTIFIER_SCOPING_SCORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32915L)
  public static SubLObject quantifier_scoping_score(final SubLObject lambda_expression)
  {
    final SubLObject index = methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( lambda_expression, $sym208$GET_WORD ),
        $sym243$GET_HEAD ), $sym244$GET_ABS_INDEX );
    return ( NIL != cyclification_free_variables( lambda_expression ) ) ? Numbers.multiply( $int245$100, index ) : index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33287L)
  public static SubLObject cyclification_free_variables(final SubLObject cyclification)
  {
    return el_utilities.sentence_free_variables( simplifier.fold_equals( methods.funcall_class_method_with_1_args( $sym143$CYCLIFICATION, $sym144$EL_FORMULA, cyclification ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33500L)
  public static SubLObject partition_unscoped(final SubLObject unscoped)
  {
    SubLObject lambda_expressions = NIL;
    SubLObject non_lambda_expressions = NIL;
    SubLObject cdolist_list_var = unscoped;
    SubLObject e = NIL;
    e = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != lambda_expressionP( e ) )
      {
        lambda_expressions = ConsesLow.cons( e, lambda_expressions );
      }
      else
      {
        non_lambda_expressions = ConsesLow.cons( e, non_lambda_expressions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      e = cdolist_list_var.first();
    }
    return Values.values( lambda_expressions, non_lambda_expressions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33808L)
  public static SubLObject lambda_expressionP(final SubLObject sem)
  {
    return methods.funcall_class_method_with_3_args( $sym143$CYCLIFICATION, $sym227$FIND, sem, $kw120$SCOPE, EQL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33990L)
  public static SubLObject beta_reduce(final SubLObject argument, final SubLObject lambda_expressions)
  {
    final SubLObject l_term = lambda_expressions.first();
    SubLObject new_l_term = NIL;
    if( NIL == l_term )
    {
      return argument;
    }
    new_l_term = methods.funcall_instance_method_with_0_args( l_term, $sym216$COPY );
    if( NIL != argument )
    {
      new_l_term = methods.funcall_class_method_with_3_args( $sym143$CYCLIFICATION, $sym231$SUBSTITUTE, new_l_term, argument, $kw120$SCOPE );
    }
    return beta_reduce( new_l_term, lambda_expressions.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36375L)
  public static SubLObject cyclify_test()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lexicon = object.new_class_instance( $sym189$CYCLIFIER_LEXICON );
    final SubLObject v_parser = parser.new_charniak_parser( UNPROVIDED, UNPROVIDED );
    final SubLObject v_context = object.new_class_instance( $sym193$PARSE_TREE_CONTEXT );
    SubLObject result = NIL;
    memoization_state.clear_hl_store_dependent_caches();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject cdolist_list_var = $cyclifier_test_sentences$.getDynamicValue( thread );
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          Errors.warn( $str247$sentence___S__, sentence );
          final SubLObject tree = methods.funcall_instance_method_with_3_args( v_parser, $sym4$PARSE, sentence, lexicon, v_context );
          SubLObject cycls = NIL;
          if( NIL != tree )
          {
            final SubLObject v_cyclifier = methods.funcall_instance_method_with_1_args( tree, $sym194$GET_CYCLIFIER, ConsesLow.list( $kw188$LEXICON, lexicon ) );
            while ( NIL != methods.funcall_instance_method_with_0_args( v_cyclifier, $sym139$HAS_NEXT_ ))
            {
              cycls = ConsesLow.cons( methods.funcall_instance_method_with_0_args( v_cyclifier, $sym129$NEXT ), cycls );
            }
            result = ConsesLow.cons( ConsesLow.list( sentence, cycls ), result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          sentence = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37047L)
  public static SubLObject test_cyclify(final SubLObject sentence, final SubLObject target)
  {
    assert NIL != Types.stringp( sentence ) : sentence;
    assert NIL != Types.stringp( target ) : target;
    final SubLObject output = cyclify( sentence, ConsesLow.list( $kw187$PARSER, parser.new_charniak_parser( UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject cycl = reader.read_from_string( string_utilities.cyclify_string( target ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject result = conses_high.subsetp( cycl, output, $sym248$INFERENCE_FORMULA_FOLLOWS, UNPROVIDED );
    final SubLObject kb = control_vars.kb_loaded();
    final SubLObject revision = system_info.cyc_revision_string();
    return ConsesLow.list( result, output, kb, revision );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37762L)
  public static SubLObject inference_formula_follows(final SubLObject consequent, final SubLObject antecedent)
  {
    final SubLObject canonical_antecedent = uncanonicalizer.dnfs_el_formula( czer_utilities.extract_el_clauses( czer_main.canonicalize_ask( reformulate_instancefns_for_testing( antecedent ), $const249$InferencePSC ) ),
        $const249$InferencePSC, UNPROVIDED );
    final SubLObject canonical_consequent = uncanonicalizer.dnfs_el_formula( czer_utilities.extract_el_clauses( czer_main.canonicalize_ask( reformulate_instancefns_for_testing( consequent ), $const249$InferencePSC ) ),
        $const249$InferencePSC, UNPROVIDED );
    return makeBoolean( NIL != removal_modules_formula_implies.inference_formula_implies( canonical_antecedent, canonical_consequent ) || NIL != czer_utilities.equals_elP( antecedent, consequent, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39178L)
  public static SubLObject reformulate_instancefns_for_testing(final SubLObject sentence)
  {
    SubLObject result = conses_high.copy_list( sentence );
    SubLObject cdolist_list_var = cycl_utilities.expression_gather( result, $sym250$INSTANCEFN_NAT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject instancefn = NIL;
    instancefn = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( result, UNPROVIDED );
      result = cycl_utilities.expression_subst( ConsesLow.list( $const173$InstanceFn, new_var ), instancefn, result, EQUAL, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      instancefn = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39520L)
  public static SubLObject instancefn_natP(final SubLObject obj)
  {
    return kb_utilities.kbeq( cycl_utilities.formula_arg0( obj ), $const173$InstanceFn );
  }

  public static SubLObject declare_cyclifier_file()
  {
    SubLFiles.declareFunction( me, "new_lf_variable", "NEW-LF-VARIABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "get_lf_literal_parse", "GET-LF-LITERAL-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lf_literal_parse", "SET-LF-LITERAL-PARSE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lf_literal_args", "GET-LF-LITERAL-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lf_literal_args", "SET-LF-LITERAL-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_lf_literal_predicate", "GET-LF-LITERAL-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_lf_literal_predicate", "SET-LF-LITERAL-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lf_literal_class", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_lf_literal_instance", "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_p", "LF-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_lf_literal", "NEW-LF-LITERAL", 3, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_print_method", "LF-LITERAL-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_get_predicate_method", "LF-LITERAL-GET-PREDICATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_get_args_method", "LF-LITERAL-GET-ARGS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_get_arg_method", "LF-LITERAL-GET-ARG-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_get_ref_method", "LF-LITERAL-GET-REF-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_get_parse_method", "LF-LITERAL-GET-PARSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_unary_p_method", "LF-LITERAL-UNARY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "lf_literal_binary_p_method", "LF-LITERAL-BINARY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_logical_form_int_method", "PHRASE-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_get_lf_predicate_method", "WORD-TREE-GET-LF-PREDICATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "verbal_word_tree_logical_form_int_method", "VERBAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "modifier_word_tree_logical_form_int_method", "MODIFIER-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "nominal_word_tree_logical_form_int_method", "NOMINAL-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "prepositional_or_particle_word_tree_logical_form_int_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "possessive_word_tree_logical_form_int_method", "POSSESSIVE-WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_logical_form_method", "PARSE-TREE-LOGICAL-FORM-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "logical_form", "LOGICAL-FORM", 1, 1, false );
    SubLFiles.declareFunction( me, "formula_keywords", "FORMULA-KEYWORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "lexical_keywords", "LEXICAL-KEYWORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_subcyclifier_pool", "GET-SUBCYCLIFIER-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_error_handling", "GET-CYCLIFIER-ERROR-HANDLING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_error_handling", "SET-CYCLIFIER-ERROR-HANDLING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_sbhl_resource", "GET-CYCLIFIER-SBHL-RESOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_sbhl_resource", "SET-CYCLIFIER-SBHL-RESOURCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_memoization_state", "GET-CYCLIFIER-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_memoization_state", "SET-CYCLIFIER-MEMOIZATION-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_score", "GET-CYCLIFIER-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_score", "SET-CYCLIFIER-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_next", "GET-CYCLIFIER-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_next", "SET-CYCLIFIER-NEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_output", "GET-CYCLIFIER-OUTPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_output", "SET-CYCLIFIER-OUTPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_score_function", "GET-CYCLIFIER-SCORE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_score_function", "SET-CYCLIFIER-SCORE-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_raw_cyclifications", "GET-CYCLIFIER-RAW-CYCLIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_raw_cyclifications", "SET-CYCLIFIER-RAW-CYCLIFICATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_raw_cyclifiedP", "GET-CYCLIFIER-RAW-CYCLIFIED?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_raw_cyclifiedP", "SET-CYCLIFIER-RAW-CYCLIFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_wff_checkP", "GET-CYCLIFIER-WFF-CHECK?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_wff_checkP", "SET-CYCLIFIER-WFF-CHECK?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_subcyclifier_pool", "GET-CYCLIFIER-SUBCYCLIFIER-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_subcyclifier_pool", "SET-CYCLIFIER-SUBCYCLIFIER-POOL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclifier_tree", "GET-CYCLIFIER-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclifier_tree", "SET-CYCLIFIER-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_p", "CYCLIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_has_nextP_method", "CYCLIFIER-HAS-NEXT?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_next_method", "CYCLIFIER-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_wff_check_method", "CYCLIFIER-WFF-CHECK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "storing_cyclifier_wff_resultsP", "STORING-CYCLIFIER-WFF-RESULTS?", 0, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_wffP", "CYCLIFIER-WFF?", 1, 1, false );
    SubLFiles.declareFunction( me, "cyclifier_handle_error_method", "CYCLIFIER-HANDLE-ERROR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subst_vars_for_instancefn", "SUBST-VARS-FOR-INSTANCEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "create_term_to_var_mapping", "CREATE-TERM-TO-VAR-MAPPING", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_instancefn_terms", "GATHER-INSTANCEFN-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "beautify_cyclification", "BEAUTIFY-CYCLIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_quantifier", "QUANTIFIED-QUANTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_variable", "QUANTIFIED-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "quantified_formula", "QUANTIFIED-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "apply_alist", "APPLY-ALIST", 2, 1, false );
    SubLFiles.declareFunction( me, "non_singleton_possibly_equal_terms", "NON-SINGLETON-POSSIBLY-EQUAL-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_assignment", "GET-ASSIGNMENT", 1, 1, false );
    SubLFiles.declareFunction( me, "equals_clauseP", "EQUALS-CLAUSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "quick_sentential_parse_wffP", "QUICK-SENTENTIAL-PARSE-WFF?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_wff_intP", "CYCLIFIER-WFF-INT?", 1, 1, false );
    SubLFiles.declareFunction( me, "variable_arguments_okP", "VARIABLE-ARGUMENTS-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "constant_arguments_okP", "CONSTANT-ARGUMENTS-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "quantify_implicit_subject", "QUANTIFY-IMPLICIT-SUBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "required_keywords", "REQUIRED-KEYWORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "rename_variables", "RENAME-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "frame_renaming", "FRAME-RENAMING", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_int", "CYCLIFY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_link", "CYCLIFY-LINK", 1, 1, false );
    SubLFiles.declareFunction( me, "cyclify_charniak", "CYCLIFY-CHARNIAK", 1, 1, false );
    SubLFiles.declareFunction( me, "cyclify_stanford", "CYCLIFY-STANFORD", 1, 1, false );
    SubLFiles.declareFunction( me, "cyclify", "CYCLIFY", 1, 1, false );
    SubLFiles.declareFunction( me, "cyclifier_catch_errorsP", "CYCLIFIER-CATCH-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "new_cyclifier", "NEW-CYCLIFIER", 1, 1, false );
    SubLFiles.declareFunction( me, "new_parse_cyclifier", "NEW-PARSE-CYCLIFIER", 1, 1, false );
    SubLFiles.declareFunction( me, "cyclify_parse", "CYCLIFY-PARSE", 1, 1, false );
    SubLFiles.declareFunction( me, "free_variable_p", "FREE-VARIABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cyclification_confidence", "GET-CYCLIFICATION-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclification_confidence", "SET-CYCLIFICATION-CONFIDENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclification_word", "GET-CYCLIFICATION-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclification_word", "SET-CYCLIFICATION-WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cyclification_cycl", "GET-CYCLIFICATION-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cyclification_cycl", "SET-CYCLIFICATION-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclification_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cyclification_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_p", "CYCLIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cyclification", "NEW-CYCLIFICATION", 3, 0, false );
    SubLFiles.declareFunction( me, "cyclification_get_cycl_method", "CYCLIFICATION-GET-CYCL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_get_word_method", "CYCLIFICATION-GET-WORD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_get_confidence_method", "CYCLIFICATION-GET-CONFIDENCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_copy_method", "CYCLIFICATION-COPY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_print_method", "CYCLIFICATION-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "cyclification_el_formula_method", "CYCLIFICATION-EL-FORMULA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclification_find_method", "CYCLIFICATION-FIND-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "cyclification_substitute_method", "CYCLIFICATION-SUBSTITUTE-METHOD", 4, 1, false );
    SubLFiles.declareFunction( me, "cyclification_score", "CYCLIFICATION-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_coverage", "CYCLIFICATION-COVERAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_yield", "CYCLIFICATION-YIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_coverage_int", "CYCLIFICATION-COVERAGE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "rank_cyclifications", "RANK-CYCLIFICATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "new_ranked_lex_entry", "NEW-RANKED-LEX-ENTRY", 1, 1, false );
    SubLFiles.declareFunction( me, "rle_lex", "RLE-LEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rle_confidence", "RLE-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rle_set_lex", "RLE-SET-LEX", 2, 0, false );
    SubLFiles.declareFunction( me, "rle_set_confidence", "RLE-SET-CONFIDENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rle_sem_equal", "RLE-SEM-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "ranked_lex_entry_p", "RANKED-LEX-ENTRY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_even_lex_entry_distribution", "NEW-EVEN-LEX-ENTRY-DISTRIBUTION", 1, 0, false );
    SubLFiles.declareFunction( me, "instantiate_scope", "INSTANTIATE-SCOPE", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_quantifiers", "SCOPE-QUANTIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "quantifier_scoping_score", "QUANTIFIER-SCOPING-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclification_free_variables", "CYCLIFICATION-FREE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "partition_unscoped", "PARTITION-UNSCOPED", 1, 0, false );
    SubLFiles.declareFunction( me, "lambda_expressionP", "LAMBDA-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "beta_reduce", "BETA-REDUCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_test", "CYCLIFY-TEST", 0, 0, false );
    SubLFiles.declareFunction( me, "test_cyclify", "TEST-CYCLIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_formula_follows", "INFERENCE-FORMULA-FOLLOWS", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulate_instancefns_for_testing", "REFORMULATE-INSTANCEFNS-FOR-TESTING", 1, 0, false );
    SubLFiles.declareFunction( me, "instancefn_natP", "INSTANCEFN-NAT?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cyclifier_file()
  {
    $full_cyclifier_quantifier_support$ = SubLFiles.defparameter( "*FULL-CYCLIFIER-QUANTIFIER-SUPPORT*", T );
    $cyclifiers$ = SubLFiles.defparameter( "*CYCLIFIERS*", NIL );
    $cyclifier_catch_errorsP$ = SubLFiles.defparameter( "*CYCLIFIER-CATCH-ERRORS?*", T );
    $default_cyclifier_parser_factory$ = SubLFiles.defparameter( "*DEFAULT-CYCLIFIER-PARSER-FACTORY*", $sym191$NEW_STANFORD_PARSER );
    $cyclifier_test_sentences$ = SubLFiles.defparameter( "*CYCLIFIER-TEST-SENTENCES*", $list246 );
    return NIL;
  }

  public static SubLObject setup_cyclifier_file()
  {
    classes.subloop_new_class( $sym1$LF_LITERAL, $sym2$OBJECT, NIL, NIL, $list3 );
    classes.class_set_implements_slot_listeners( $sym1$LF_LITERAL, NIL );
    classes.subloop_note_class_initialization_function( $sym1$LF_LITERAL, $sym8$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS );
    classes.subloop_note_instance_initialization_function( $sym1$LF_LITERAL, $sym11$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE );
    subloop_reserved_initialize_lf_literal_class( $sym1$LF_LITERAL );
    methods.methods_incorporate_instance_method( $sym12$PRINT, $sym1$LF_LITERAL, $list13, $list14, $list15 );
    methods.subloop_register_instance_method( $sym1$LF_LITERAL, $sym12$PRINT, $sym18$LF_LITERAL_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym19$GET_PREDICATE, $sym1$LF_LITERAL, $list20, NIL, $list21 );
    methods.subloop_register_instance_method( $sym1$LF_LITERAL, $sym19$GET_PREDICATE, $sym23$LF_LITERAL_GET_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym24$GET_ARGS, $sym1$LF_LITERAL, $list20, NIL, $list25 );
    methods.subloop_register_instance_method( $sym1$LF_LITERAL, $sym24$GET_ARGS, $sym27$LF_LITERAL_GET_ARGS_METHOD );
    methods.methods_incorporate_instance_method( $sym28$GET_ARG, $sym1$LF_LITERAL, $list20, $list29, $list30 );
    methods.subloop_register_instance_method( $sym1$LF_LITERAL, $sym28$GET_ARG, $sym33$LF_LITERAL_GET_ARG_METHOD );
    methods.methods_incorporate_instance_method( $sym34$GET_REF, $sym1$LF_LITERAL, $list20, NIL, $list35 );
    methods.subloop_register_instance_method( $sym1$LF_LITERAL, $sym34$GET_REF, $sym36$LF_LITERAL_GET_REF_METHOD );
    methods.methods_incorporate_instance_method( $sym37$GET_PARSE, $sym1$LF_LITERAL, $list20, NIL, $list38 );
    methods.subloop_register_instance_method( $sym1$LF_LITERAL, $sym37$GET_PARSE, $sym40$LF_LITERAL_GET_PARSE_METHOD );
    methods.methods_incorporate_instance_method( $sym41$UNARY_P, $sym1$LF_LITERAL, $list20, NIL, $list42 );
    methods.subloop_register_instance_method( $sym1$LF_LITERAL, $sym41$UNARY_P, $sym44$LF_LITERAL_UNARY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym45$BINARY_P, $sym1$LF_LITERAL, $list20, NIL, $list46 );
    methods.subloop_register_instance_method( $sym1$LF_LITERAL, $sym45$BINARY_P, $sym48$LF_LITERAL_BINARY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym49$LOGICAL_FORM_INT, $sym50$PHRASE_TREE, $list13, NIL, $list51 );
    methods.subloop_register_instance_method( $sym50$PHRASE_TREE, $sym49$LOGICAL_FORM_INT, $sym53$PHRASE_TREE_LOGICAL_FORM_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym54$GET_LF_PREDICATE, $sym55$WORD_TREE, $list13, NIL, $list56 );
    methods.subloop_register_instance_method( $sym55$WORD_TREE, $sym54$GET_LF_PREDICATE, $sym71$WORD_TREE_GET_LF_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym49$LOGICAL_FORM_INT, $sym72$VERBAL_WORD_TREE, $list13, NIL, $list73 );
    methods.subloop_register_instance_method( $sym72$VERBAL_WORD_TREE, $sym49$LOGICAL_FORM_INT, $sym82$VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym49$LOGICAL_FORM_INT, $sym83$MODIFIER_WORD_TREE, $list13, NIL, $list84 );
    methods.subloop_register_instance_method( $sym83$MODIFIER_WORD_TREE, $sym49$LOGICAL_FORM_INT, $sym87$MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym49$LOGICAL_FORM_INT, $sym88$NOMINAL_WORD_TREE, $list13, NIL, $list89 );
    methods.subloop_register_instance_method( $sym88$NOMINAL_WORD_TREE, $sym49$LOGICAL_FORM_INT, $sym92$NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym49$LOGICAL_FORM_INT, $sym93$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list13, NIL, $list94 );
    methods.subloop_register_instance_method( $sym93$PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym49$LOGICAL_FORM_INT, $sym98$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym49$LOGICAL_FORM_INT, $sym99$POSSESSIVE_WORD_TREE, $list13, NIL, $list100 );
    methods.subloop_register_instance_method( $sym99$POSSESSIVE_WORD_TREE, $sym49$LOGICAL_FORM_INT, $sym106$POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD );
    methods.methods_incorporate_instance_method( $sym107$LOGICAL_FORM, $sym108$PARSE_TREE, $list20, $list109, $list110 );
    methods.subloop_register_instance_method( $sym108$PARSE_TREE, $sym107$LOGICAL_FORM, $sym113$PARSE_TREE_LOGICAL_FORM_METHOD );
    classes.subloop_new_class( $sym122$CYCLIFIER, $sym2$OBJECT, $list123, NIL, $list124 );
    classes.class_set_implements_slot_listeners( $sym122$CYCLIFIER, NIL );
    classes.subloop_note_class_initialization_function( $sym122$CYCLIFIER, $sym137$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym122$CYCLIFIER, $sym138$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE );
    subloop_reserved_initialize_cyclifier_class( $sym122$CYCLIFIER );
    methods.methods_incorporate_instance_method( $sym139$HAS_NEXT_, $sym122$CYCLIFIER, $list20, NIL, $list140 );
    methods.subloop_register_instance_method( $sym122$CYCLIFIER, $sym139$HAS_NEXT_, $sym148$CYCLIFIER_HAS_NEXT__METHOD );
    methods.methods_incorporate_instance_method( $sym129$NEXT, $sym122$CYCLIFIER, $list20, NIL, $list149 );
    methods.subloop_register_instance_method( $sym122$CYCLIFIER, $sym129$NEXT, $sym154$CYCLIFIER_NEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym145$WFF_CHECK, $sym122$CYCLIFIER, $list13, $list155, $list156 );
    methods.subloop_register_instance_method( $sym122$CYCLIFIER, $sym145$WFF_CHECK, $sym158$CYCLIFIER_WFF_CHECK_METHOD );
    methods.methods_incorporate_instance_method( $sym166$HANDLE_ERROR, $sym122$CYCLIFIER, $list13, $list167, $list168 );
    methods.subloop_register_instance_method( $sym122$CYCLIFIER, $sym166$HANDLE_ERROR, $sym172$CYCLIFIER_HANDLE_ERROR_METHOD );
    access_macros.register_external_symbol( $sym190$CYCLIFY );
    access_macros.register_external_symbol( $sym197$CYCLIFY_PARSE );
    classes.subloop_new_class( $sym143$CYCLIFICATION, $sym2$OBJECT, NIL, NIL, $list199 );
    classes.class_set_implements_slot_listeners( $sym143$CYCLIFICATION, NIL );
    classes.subloop_note_class_initialization_function( $sym143$CYCLIFICATION, $sym202$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym143$CYCLIFICATION, $sym203$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE );
    subloop_reserved_initialize_cyclification_class( $sym143$CYCLIFICATION );
    methods.methods_incorporate_instance_method( $sym179$GET_CYCL, $sym143$CYCLIFICATION, $list20, NIL, $list205 );
    methods.subloop_register_instance_method( $sym143$CYCLIFICATION, $sym179$GET_CYCL, $sym207$CYCLIFICATION_GET_CYCL_METHOD );
    methods.methods_incorporate_instance_method( $sym208$GET_WORD, $sym143$CYCLIFICATION, $list20, NIL, $list209 );
    methods.subloop_register_instance_method( $sym143$CYCLIFICATION, $sym208$GET_WORD, $sym211$CYCLIFICATION_GET_WORD_METHOD );
    methods.methods_incorporate_instance_method( $sym212$GET_CONFIDENCE, $sym143$CYCLIFICATION, $list20, NIL, $list213 );
    methods.subloop_register_instance_method( $sym143$CYCLIFICATION, $sym212$GET_CONFIDENCE, $sym215$CYCLIFICATION_GET_CONFIDENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym216$COPY, $sym143$CYCLIFICATION, $list20, NIL, $list217 );
    methods.subloop_register_instance_method( $sym143$CYCLIFICATION, $sym216$COPY, $sym218$CYCLIFICATION_COPY_METHOD );
    methods.methods_incorporate_instance_method( $sym12$PRINT, $sym143$CYCLIFICATION, $list13, $list14, $list219 );
    methods.subloop_register_instance_method( $sym143$CYCLIFICATION, $sym12$PRINT, $sym223$CYCLIFICATION_PRINT_METHOD );
    methods.methods_incorporate_class_method( $sym144$EL_FORMULA, $sym143$CYCLIFICATION, $list20, $list224, $list225 );
    methods.subloop_register_class_method( $sym143$CYCLIFICATION, $sym144$EL_FORMULA, $sym226$CYCLIFICATION_EL_FORMULA_METHOD );
    methods.methods_incorporate_class_method( $sym227$FIND, $sym143$CYCLIFICATION, $list20, $list228, $list229 );
    methods.subloop_register_class_method( $sym143$CYCLIFICATION, $sym227$FIND, $sym230$CYCLIFICATION_FIND_METHOD );
    methods.methods_incorporate_class_method( $sym231$SUBSTITUTE, $sym143$CYCLIFICATION, $list20, $list232, $list233 );
    methods.subloop_register_class_method( $sym143$CYCLIFICATION, $sym231$SUBSTITUTE, $sym234$CYCLIFICATION_SUBSTITUTE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyclifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyclifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyclifier_file();
  }
  static
  {
    me = new cyclifier();
    $full_cyclifier_quantifier_support$ = null;
    $cyclifiers$ = null;
    $cyclifier_catch_errorsP$ = null;
    $default_cyclifier_parser_factory$ = null;
    $cyclifier_test_sentences$ = null;
    $str0$X = makeString( "X" );
    $sym1$LF_LITERAL = makeSymbol( "LF-LITERAL" );
    $sym2$OBJECT = makeSymbol( "OBJECT" );
    $list3 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PREDICATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ARGS" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PARSE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PREDICATE" ),
            NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ARGS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "GET-ARG" ), ConsesLow.list( makeSymbol( "I" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-REF" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PARSE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "UNARY-P" ), NIL, makeKeyword(
                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "BINARY-P" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym4$PARSE = makeSymbol( "PARSE" );
    $sym5$ARGS = makeSymbol( "ARGS" );
    $sym6$PREDICATE = makeSymbol( "PREDICATE" );
    $sym7$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym8$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-CLASS" );
    $sym9$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym10$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym11$SUBLOOP_RESERVED_INITIALIZE_LF_LITERAL_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-LF-LITERAL-INSTANCE" );
    $sym12$PRINT = makeSymbol( "PRINT" );
    $list13 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list14 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list15 = ConsesLow.list( makeString( "Prints this literal to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeSymbol(
        "PREDICATE" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-CHAR" ), Characters.CHAR_lparen, makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list( makeSymbol( "FIRST" ),
            makeSymbol( "ARGS" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ARG" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "ARGS" ) ) ), ConsesLow.list(
                makeSymbol( "WRITE-STRING" ), makeString( ", " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "ARG" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol(
                    "WRITE-CHAR" ), Characters.CHAR_rparen, makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym16$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LF-LITERAL-METHOD" );
    $str17$__ = makeString( ", " );
    $sym18$LF_LITERAL_PRINT_METHOD = makeSymbol( "LF-LITERAL-PRINT-METHOD" );
    $sym19$GET_PREDICATE = makeSymbol( "GET-PREDICATE" );
    $list20 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list21 = ConsesLow.list( makeString( "@return stringp; the predicate of this literal" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PREDICATE" ) ) );
    $sym22$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LF-LITERAL-METHOD" );
    $sym23$LF_LITERAL_GET_PREDICATE_METHOD = makeSymbol( "LF-LITERAL-GET-PREDICATE-METHOD" );
    $sym24$GET_ARGS = makeSymbol( "GET-ARGS" );
    $list25 = ConsesLow.list( makeString( "@return listp; the list of arguments of this lf-literal" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ARGS" ) ) );
    $sym26$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LF-LITERAL-METHOD" );
    $sym27$LF_LITERAL_GET_ARGS_METHOD = makeSymbol( "LF-LITERAL-GET-ARGS-METHOD" );
    $sym28$GET_ARG = makeSymbol( "GET-ARG" );
    $list29 = ConsesLow.list( makeSymbol( "I" ) );
    $list30 = ConsesLow.list( makeString(
        "@param i non-negative-integer; the argument index of the argument to be returned\n   @return lf-variable; the variable in argument position I of this literal, \n   nil if there is none" ), ConsesLow.list(
            makeSymbol( "CHECK-TYPE" ), makeSymbol( "I" ), makeSymbol( "POSITIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAR" ), ConsesLow.list( makeSymbol( "NTHCDR" ), ConsesLow
                .list( makeSymbol( "1-" ), makeSymbol( "I" ) ), makeSymbol( "ARGS" ) ) ) ) );
    $sym31$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LF-LITERAL-METHOD" );
    $sym32$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym33$LF_LITERAL_GET_ARG_METHOD = makeSymbol( "LF-LITERAL-GET-ARG-METHOD" );
    $sym34$GET_REF = makeSymbol( "GET-REF" );
    $list35 = ConsesLow.list( makeString( "@return lf-variable; the referent of this literal" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "GET-ARG" ) ), ZERO_INTEGER ) ) );
    $sym36$LF_LITERAL_GET_REF_METHOD = makeSymbol( "LF-LITERAL-GET-REF-METHOD" );
    $sym37$GET_PARSE = makeSymbol( "GET-PARSE" );
    $list38 = ConsesLow.list( makeString( "@return parse-tree-p; the parse tree whose logical form is this literal" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PARSE" ) ) );
    $sym39$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LF-LITERAL-METHOD" );
    $sym40$LF_LITERAL_GET_PARSE_METHOD = makeSymbol( "LF-LITERAL-GET-PARSE-METHOD" );
    $sym41$UNARY_P = makeSymbol( "UNARY-P" );
    $list42 = ConsesLow.list( makeString( "@return boolean; t if this literal is unary, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "LENGTH" ),
        makeSymbol( "ARGS" ) ), ONE_INTEGER ) ) );
    $sym43$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LF-LITERAL-METHOD" );
    $sym44$LF_LITERAL_UNARY_P_METHOD = makeSymbol( "LF-LITERAL-UNARY-P-METHOD" );
    $sym45$BINARY_P = makeSymbol( "BINARY-P" );
    $list46 = ConsesLow.list( makeString( "@return boolean; t if this literal is binary, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "LENGTH" ),
        makeSymbol( "ARGS" ) ), TWO_INTEGER ) ) );
    $sym47$OUTER_CATCH_FOR_LF_LITERAL_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-LF-LITERAL-METHOD" );
    $sym48$LF_LITERAL_BINARY_P_METHOD = makeSymbol( "LF-LITERAL-BINARY-P-METHOD" );
    $sym49$LOGICAL_FORM_INT = makeSymbol( "LOGICAL-FORM-INT" );
    $sym50$PHRASE_TREE = makeSymbol( "PHRASE-TREE" );
    $list51 = ConsesLow.list( makeString( "@return listp; the logical form of this parse tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LF" ), NIL ) ), ConsesLow.list(
        makeSymbol( "CDOVECTOR" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), makeSymbol( "DAUGHTERS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LF" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol(
            "LF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOGICAL-FORM-INT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                "LF" ) ) ) );
    $sym52$OUTER_CATCH_FOR_PHRASE_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PHRASE-TREE-METHOD" );
    $sym53$PHRASE_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol( "PHRASE-TREE-LOGICAL-FORM-INT-METHOD" );
    $sym54$GET_LF_PREDICATE = makeSymbol( "GET-LF-PREDICATE" );
    $sym55$WORD_TREE = makeSymbol( "WORD-TREE" );
    $list56 = ConsesLow.list( makeString( "@return stringp; the predicate name of this word tree" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "POS" ) ), ConsesLow.list(
        makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NAME-WORD-TREE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLASS" ), makeString( "NP" ) ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "POS" ), makeKeyword( "PROPER-NOUN" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "NOMINAL-WORD-TREE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                "CSETQ" ), makeSymbol( "CLASS" ), makeString( "NN" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POS" ), makeKeyword( "NOUN" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                    "VERBAL-WORD-TREE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLASS" ), makeString( "VB" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POS" ),
                        makeKeyword( "VERB" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "ADJECTIVAL-WORD-TREE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLASS" ), makeString(
                            "JJ" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POS" ), makeKeyword( "ADJECTIVE" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "ADVERBIAL-WORD-TREE-P" ), makeSymbol(
                                "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLASS" ), makeString( "RB" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POS" ), makeKeyword( "ADVERB" ) ) ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLASS" ), makeString( "IN" ) ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "POS" ), makeKeyword( "PREPOSITION" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "PRINC-TO-STRING" ),
                makeSymbol( "CATEGORY" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), ConsesLow.list( makeSymbol( "STRING-DOWNCASE" ), ConsesLow.list( makeSymbol(
                    "GET-ROOT" ), makeSymbol( "STRING" ), makeSymbol( "POS" ) ) ), makeString( "_" ), makeSymbol( "CLASS" ) ) ) ) );
    $sym57$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $str58$NP = makeString( "NP" );
    $kw59$PROPER_NOUN = makeKeyword( "PROPER-NOUN" );
    $str60$NN = makeString( "NN" );
    $kw61$NOUN = makeKeyword( "NOUN" );
    $str62$VB = makeString( "VB" );
    $kw63$VERB = makeKeyword( "VERB" );
    $str64$JJ = makeString( "JJ" );
    $kw65$ADJECTIVE = makeKeyword( "ADJECTIVE" );
    $str66$RB = makeString( "RB" );
    $kw67$ADVERB = makeKeyword( "ADVERB" );
    $str68$IN = makeString( "IN" );
    $kw69$PREPOSITION = makeKeyword( "PREPOSITION" );
    $str70$_ = makeString( "_" );
    $sym71$WORD_TREE_GET_LF_PREDICATE_METHOD = makeSymbol( "WORD-TREE-GET-LF-PREDICATE-METHOD" );
    $sym72$VERBAL_WORD_TREE = makeSymbol( "VERBAL-WORD-TREE" );
    $list73 = ConsesLow.list( makeString( "@return listp; the logical form of this verb" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REF" ), ConsesLow.list( makeSymbol(
        "FIRST" ), makeSymbol( "REFS" ) ) ), ConsesLow.list( makeSymbol( "LF" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NEW-LF-LITERAL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LF-PREDICATE" ) ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "REF" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol(
                "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "OBJECTS" ),
                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol( "VERBAL-COMPLEMENT" ),
                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VERBAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "CL-COMPLEMENTS" ),
                            ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "VERBAL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "VERBAL-COMPLEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "I" ),
                                ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SUBJ-REF" ), ConsesLow.list(
                                    makeSymbol( "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                        "NEW-LF-LITERAL" ), makeString( "subj" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "REF" ), makeSymbol( "SUBJ-REF" ) ), makeSymbol( "SELF" ) ), makeSymbol( "LF" ) ) ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "I" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "OBJECTS" ) ), ConsesLow.list( makeSymbol(
            "CINC" ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "OBJ-REF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-LF-LITERAL" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "obj" ),
                    ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "REF" ), makeSymbol( "OBJ-REF" ) ), makeSymbol( "SELF" ) ), makeSymbol(
                        "LF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "I" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CL-COMPLEMENT" ), makeSymbol(
                            "CL-COMPLEMENTS" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMP-REF" ), ConsesLow.list( makeSymbol(
                                "FIM" ), makeSymbol( "CL-COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                    "NEW-LF-LITERAL" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "clause" ), ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), makeSymbol( "I" ) ) ), ConsesLow.list(
                                        makeSymbol( "LIST" ), makeSymbol( "REF" ), makeSymbol( "COMP-REF" ) ), makeSymbol( "SELF" ) ), makeSymbol( "LF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                            makeSymbol( "NREVERSE" ), makeSymbol( "LF" ) ) ) ) );
    $sym74$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD" );
    $sym75$GET_SEMANTIC_SUBJECT = makeSymbol( "GET-SEMANTIC-SUBJECT" );
    $sym76$GET_SEMANTIC_OBJECTS = makeSymbol( "GET-SEMANTIC-OBJECTS" );
    $sym77$GET_VERBAL_COMPLEMENT = makeSymbol( "GET-VERBAL-COMPLEMENT" );
    $str78$subj = makeString( "subj" );
    $sym79$GET_REFS = makeSymbol( "GET-REFS" );
    $str80$obj = makeString( "obj" );
    $str81$clause = makeString( "clause" );
    $sym82$VERBAL_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol( "VERBAL-WORD-TREE-LOGICAL-FORM-INT-METHOD" );
    $sym83$MODIFIER_WORD_TREE = makeSymbol( "MODIFIER-WORD-TREE" );
    $list84 = ConsesLow.list( makeString( "@return listp; the logical form of this modifier" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REF" ), ConsesLow.list( makeSymbol(
        "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ), ConsesLow.list( makeSymbol( "LF" ), ConsesLow.list( makeSymbol(
            "LIST" ), ConsesLow.list( makeSymbol( "NEW-LF-LITERAL" ), ConsesLow.list( makeSymbol( "GET-LF-PREDICATE" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "REF" ) ), makeSymbol(
                "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "MODIFIEDS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MODIFIED" ), makeSymbol( "MODIFIEDS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MODIFIED-REF" ), ConsesLow
            .list( makeSymbol( "FIM" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                "NEW-LF-LITERAL" ), makeString( "modifies" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "REF" ), makeSymbol( "MODIFIED-REF" ) ), makeSymbol( "SELF" ) ), makeSymbol( "LF" ) ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), makeSymbol( "LF" ) ) ) );
    $sym85$GET_MODIFIEDS = makeSymbol( "GET-MODIFIEDS" );
    $str86$modifies = makeString( "modifies" );
    $sym87$MODIFIER_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol( "MODIFIER-WORD-TREE-LOGICAL-FORM-INT-METHOD" );
    $sym88$NOMINAL_WORD_TREE = makeSymbol( "NOMINAL-WORD-TREE" );
    $list89 = ConsesLow.list( makeString( "@return listp; the logical form of this noun" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COMPLEMENTS" ), ConsesLow.list( makeSymbol(
        "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "REF" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ), ConsesLow.list( makeSymbol( "LF" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol(
                "NEW-LF-LITERAL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LF-PREDICATE" ) ) ), ConsesLow.list( makeSymbol( "LIST" ),
                    makeSymbol( "REF" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "I" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), makeSymbol(
                        "COMPLEMENTS" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMP-REF" ), ConsesLow.list( makeSymbol(
                            "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                "NEW-LF-LITERAL" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "arg" ), ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol(
                                    "LIST" ), makeSymbol( "REF" ), makeSymbol( "COMP-REF" ) ), makeSymbol( "SELF" ) ), makeSymbol( "LF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LF" ) ) ) );
    $sym90$GET_COMPLEMENTS = makeSymbol( "GET-COMPLEMENTS" );
    $str91$arg = makeString( "arg" );
    $sym92$NOMINAL_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol( "NOMINAL-WORD-TREE-LOGICAL-FORM-INT-METHOD" );
    $sym93$PREPOSITIONAL_OR_PARTICLE_WORD_TREE = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE" );
    $list94 = ConsesLow.list( makeString( "@return listp; the logical form of this preposition" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "of" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
            makeSymbol( "REF" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ), ConsesLow.list(
                makeSymbol( "LF" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NEW-LF-LITERAL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "GET-LF-PREDICATE" ) ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "REF" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "COMPLEMENTS" ), ConsesLow.list( makeSymbol(
                        "LIST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBLIQUE-OBJECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "MODIFIED" ),
                            ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIEDS" ) ) ) ) ), ConsesLow.list(
                                makeSymbol( "MOD-REFS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MODIFIED" ), ConsesLow.list( makeSymbol(
                                    "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MOD-REF" ), makeSymbol( "MOD-REFS" ) ), ConsesLow.list( makeSymbol(
                                        "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-LF-LITERAL" ), makeString( "modifies" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "REF" ), makeSymbol( "MOD-REF" ) ),
                                            makeSymbol( "SELF" ) ), makeSymbol( "LF" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMPLEMENT" ), makeSymbol( "COMPLEMENTS" ) ), ConsesLow
                                                .list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMP-REF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol(
                                                    "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-LF-LITERAL" ), makeString( "arg" ), ConsesLow.list(
                                                        makeSymbol( "LIST" ), makeSymbol( "REF" ), makeSymbol( "COMP-REF" ) ), makeSymbol( "SELF" ) ), makeSymbol( "LF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                            makeSymbol( "LF" ) ) ) );
    $sym95$GET_STRING = makeSymbol( "GET-STRING" );
    $str96$of = makeString( "of" );
    $sym97$GET_OBLIQUE_OBJECT = makeSymbol( "GET-OBLIQUE-OBJECT" );
    $sym98$PREPOSITIONAL_OR_PARTICLE_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-LOGICAL-FORM-INT-METHOD" );
    $sym99$POSSESSIVE_WORD_TREE = makeSymbol( "POSSESSIVE-WORD-TREE" );
    $list100 = ConsesLow.list( makeString( "@return listp; the logical form of this possessive" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LF" ), NIL ), ConsesLow.list(
        makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "COMP-REFS" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COMPLEMENT" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ), ConsesLow.list( makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-MOTHER" ) ) ) ), ConsesLow.list( makeSymbol( "POSSESSION" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "GRANDMOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "GRANDMOTHER" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NOMINAL-TREE-P" ) ), ConsesLow.list( makeSymbol( "1+" ), ConsesLow.list(
                        makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INDEX" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "POSS-REFS" ), ConsesLow.list( makeSymbol(
                            "FWHEN" ), makeSymbol( "POSSESSION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "POSSESSION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ) ), ConsesLow
                                .list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COMP-REF" ), makeSymbol( "COMP-REFS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "POSS-REF" ),
                                    makeSymbol( "POSS-REFS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-LF-LITERAL" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                                        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LF-PREDICATE" ) ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "COMP-REF" ), makeSymbol( "POSS-REF" ) ), makeSymbol(
                                            "SELF" ) ), makeSymbol( "LF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LF" ) ) ) );
    $sym101$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD" );
    $sym102$GET_MOTHER = makeSymbol( "GET-MOTHER" );
    $sym103$FIND_FIRST = makeSymbol( "FIND-FIRST" );
    $sym104$NOMINAL_TREE_P = makeSymbol( "NOMINAL-TREE-P" );
    $sym105$GET_INDEX = makeSymbol( "GET-INDEX" );
    $sym106$POSSESSIVE_WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol( "POSSESSIVE-WORD-TREE-LOGICAL-FORM-INT-METHOD" );
    $sym107$LOGICAL_FORM = makeSymbol( "LOGICAL-FORM" );
    $sym108$PARSE_TREE = makeSymbol( "PARSE-TREE" );
    $list109 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "LEXICON" ) );
    $list110 = ConsesLow.list( makeString( "@return listp; the logical form of this parse tree" ), ConsesLow.list( makeSymbol( "CHECK-TYPE-IF-PRESENT" ), makeSymbol( "LEXICON" ), makeSymbol( "ABSTRACT-LEXICON-P" ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY-INT" ) ), makeSymbol(
            "LEXICON" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOGICAL-FORM-INT" ) ) ) ) );
    $sym111$ABSTRACT_LEXICON_P = makeSymbol( "ABSTRACT-LEXICON-P" );
    $sym112$LEXIFY_INT = makeSymbol( "LEXIFY-INT" );
    $sym113$PARSE_TREE_LOGICAL_FORM_METHOD = makeSymbol( "PARSE-TREE-LOGICAL-FORM-METHOD" );
    $sym114$STRINGP = makeSymbol( "STRINGP" );
    $sym115$LEARN = makeSymbol( "LEARN" );
    $sym116$GET = makeSymbol( "GET" );
    $kw117$FRAME = makeKeyword( "FRAME" );
    $kw118$SEMTRANS = makeKeyword( "SEMTRANS" );
    $kw119$ACTION = makeKeyword( "ACTION" );
    $kw120$SCOPE = makeKeyword( "SCOPE" );
    $sym121$GET_ROOT = makeSymbol( "GET-ROOT" );
    $sym122$CYCLIFIER = makeSymbol( "CYCLIFIER" );
    $list123 = ConsesLow.list( makeSymbol( "ITERATOR-TEMPLATE" ) );
    $list124 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "TREE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SUBCYCLIFIER-POOL" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "WFF-CHECK?" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "RAW-CYCLIFIED?" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "RAW-CYCLIFICATIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SCORE-FUNCTION" ),
                makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "OUTPUT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "NEXT" ), makeKeyword(
                    "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SCORE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "MEMOIZATION-STATE" ),
                        makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SBHL-RESOURCE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                            "ERROR-HANDLING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HAS-NEXT?" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "WFF-CHECK" ), ConsesLow.list( makeSymbol(
          "CYCL" ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym125$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym126$SBHL_RESOURCE = makeSymbol( "SBHL-RESOURCE" );
    $sym127$MEMOIZATION_STATE = makeSymbol( "MEMOIZATION-STATE" );
    $sym128$SCORE = makeSymbol( "SCORE" );
    $sym129$NEXT = makeSymbol( "NEXT" );
    $sym130$OUTPUT = makeSymbol( "OUTPUT" );
    $sym131$SCORE_FUNCTION = makeSymbol( "SCORE-FUNCTION" );
    $sym132$RAW_CYCLIFICATIONS = makeSymbol( "RAW-CYCLIFICATIONS" );
    $sym133$RAW_CYCLIFIED_ = makeSymbol( "RAW-CYCLIFIED?" );
    $sym134$WFF_CHECK_ = makeSymbol( "WFF-CHECK?" );
    $sym135$SUBCYCLIFIER_POOL = makeSymbol( "SUBCYCLIFIER-POOL" );
    $sym136$TREE = makeSymbol( "TREE" );
    $sym137$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-CLASS" );
    $sym138$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-INSTANCE" );
    $sym139$HAS_NEXT_ = makeSymbol( "HAS-NEXT?" );
    $list140 = ConsesLow.list( makeString( "@return boolean; t if there is another valid interpretation, nil otherwise" ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "RAW-CYCLIFIED?" ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*ALLOW-DUPLICATE-CYCLIFICATIONS?*" ), NIL ), ConsesLow.list( makeSymbol( "*CYCLIFICATION-COMPLETE*" ), NIL ), ConsesLow.list( makeSymbol(
            "*CYCLIFIERS*" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "SELF" ), makeSymbol( "*CYCLIFIERS*" ) ) ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "*ALLOW-DUPLICATE-CYCLIFICATIONS?*" ),
                makeSymbol( "*CYCLIFICATION-COMPLETE*" ), makeSymbol( "*CYCLIFIERS*" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RAW-CYCLIFICATIONS" ), ConsesLow.list( makeSymbol( "RANK-CYCLIFICATIONS" ),
                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFY-INT" ) ) ), makeSymbol( "SCORE-FUNCTION" ) ) ), ConsesLow.list( makeSymbol(
                        "CSETQ" ), makeSymbol( "RAW-CYCLIFIED?" ), T ) ) ), ConsesLow.list( makeSymbol( "UNTIL" ), ConsesLow.list( makeSymbol( "COR" ), makeSymbol( "NEXT" ), ConsesLow.list( makeSymbol( "CNOT" ),
                            makeSymbol( "RAW-CYCLIFICATIONS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT" ), ConsesLow.list( makeSymbol( "CAR" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol(
                                "RAW-CYCLIFICATIONS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCORE" ), ConsesLow.list( makeSymbol( "CDR" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol(
                                    "RAW-CYCLIFICATIONS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EL-FORMULA" ) ), makeSymbol( "NEXT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                            makeSymbol( "EL-FORMULA-P" ), makeSymbol( "NEXT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT" ), ConsesLow.list( makeSymbol(
                                                "EL-REMOVE-UNNECESSARY-EXISTENTIALS" ), makeSymbol( "NEXT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT" ), ConsesLow.list( makeSymbol( "FOLD-EQUALS" ),
                                                    makeSymbol( "NEXT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT" ), ConsesLow.list( makeSymbol( "TREE-DELETE" ), makeKeyword( "SCOPE" ), ConsesLow
                                                        .list( makeSymbol( "BEAUTIFY-CYCLIFICATION" ), makeSymbol( "NEXT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "WFF-CHECK?" ), ConsesLow.list(
                                                            makeSymbol( "CSETQ" ), makeSymbol( "NEXT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                "WFF-CHECK" ) ), makeSymbol( "NEXT" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol(
                                                                    "NULL" ), makeSymbol( "NEXT" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                        "CYCLIFIABLE-QUESTION-P" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow
                                                                            .list( makeSymbol( "TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY" ), makeSymbol( "NEXT" ), constant_handles.reader_make_constant_shell(
                                                                                makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                                    "RAW-CYCLIFICATIONS" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "RAW-CYCLIFICATIONS" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                        "RET" ), ConsesLow.list( makeSymbol( "BOOLEAN" ), makeSymbol( "NEXT" ) ) ) );
    $sym141$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFIER-METHOD" );
    $sym142$CYCLIFY_INT = makeSymbol( "CYCLIFY-INT" );
    $sym143$CYCLIFICATION = makeSymbol( "CYCLIFICATION" );
    $sym144$EL_FORMULA = makeSymbol( "EL-FORMULA" );
    $sym145$WFF_CHECK = makeSymbol( "WFF-CHECK" );
    $sym146$CYCLIFIABLE_QUESTION_P = makeSymbol( "CYCLIFIABLE-QUESTION-P" );
    $const147$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $sym148$CYCLIFIER_HAS_NEXT__METHOD = makeSymbol( "CYCLIFIER-HAS-NEXT?-METHOD" );
    $list149 = ConsesLow.list( makeString( "@return el-formula-p; the next interpretation of this iterator" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "HAS-NEXT?" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCL" ), ConsesLow.list( makeSymbol( "GET-CYCLIFIER-NEXT" ),
            makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "S" ), ConsesLow.list( makeSymbol( "GET-CYCLIFIER-SCORE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT" ),
                NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCORE" ), NIL ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "OUTPUT" ), ConsesLow.list( makeKeyword( "BRIEF" ), ConsesLow.list(
                    makeSymbol( "RET" ), makeSymbol( "CYCL" ) ) ), ConsesLow.list( makeKeyword( "VERBOSE" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "CYCL" ), makeSymbol(
                        "S" ) ) ) ), ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Illegal output format ~a" ), makeSymbol( "OUTPUT" ) ) ) ) ) ) );
    $sym150$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFIER-METHOD" );
    $kw151$BRIEF = makeKeyword( "BRIEF" );
    $kw152$VERBOSE = makeKeyword( "VERBOSE" );
    $str153$Illegal_output_format__a = makeString( "Illegal output format ~a" );
    $sym154$CYCLIFIER_NEXT_METHOD = makeSymbol( "CYCLIFIER-NEXT-METHOD" );
    $list155 = ConsesLow.list( makeSymbol( "CYCL" ) );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WFF?" ), NIL ) ), ConsesLow.list( makeSymbol( "WITH-MEMOIZATION-STATE" ), ConsesLow.list( makeSymbol(
        "MEMOIZATION-STATE" ) ), ConsesLow.list( makeSymbol( "WITH-SBHL-MARKING-SPACE-RESOURCE" ), makeSymbol( "SBHL-RESOURCE" ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-SETQ" ), ConsesLow.list( makeSymbol(
            "WFF?" ), makeSymbol( "CYCL" ) ), ConsesLow.list( makeSymbol( "CYCLIFIER-WFF?" ), ConsesLow.list( makeSymbol( "NART-SUBSTITUTE" ), makeSymbol( "CYCL" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "WFF?" ), makeSymbol( "CYCL" ) ) ) ) );
    $sym157$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFIER-METHOD" );
    $sym158$CYCLIFIER_WFF_CHECK_METHOD = makeSymbol( "CYCLIFIER-WFF-CHECK-METHOD" );
    $kw159$UNKNOWN = makeKeyword( "UNKNOWN" );
    $list160 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "DataForNLMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "AnytimePSC" ) ) );
    $kw161$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym162$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw163$APPEND = makeKeyword( "APPEND" );
    $str164$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str165$____original__S____output_cycl__S = makeString( "~%(:original ~S~% :output-cycl ~S~% :wff? ~S :kb ~S)~%" );
    $sym166$HANDLE_ERROR = makeSymbol( "HANDLE-ERROR" );
    $list167 = ConsesLow.list( makeSymbol( "ERROR" ) );
    $list168 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "ERROR-HANDLING" ), ConsesLow.list( makeKeyword( "THROW" ), ConsesLow.list( makeSymbol( "ERROR" ), makeSymbol( "ERROR" ) ) ), ConsesLow
        .list( makeKeyword( "WARN" ), ConsesLow.list( makeSymbol( "WARN" ), makeSymbol( "ERROR" ) ) ) ) );
    $sym169$OUTER_CATCH_FOR_CYCLIFIER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFIER-METHOD" );
    $kw170$THROW = makeKeyword( "THROW" );
    $kw171$WARN = makeKeyword( "WARN" );
    $sym172$CYCLIFIER_HANDLE_ERROR_METHOD = makeSymbol( "CYCLIFIER-HANDLE-ERROR-METHOD" );
    $const173$InstanceFn = constant_handles.reader_make_constant_shell( makeString( "InstanceFn" ) );
    $sym174$BEAUTIFY_CYCLIFICATION = makeSymbol( "BEAUTIFY-CYCLIFICATION" );
    $sym175$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $list176 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ) );
    $const177$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list178 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ) );
    $sym179$GET_CYCL = makeSymbol( "GET-CYCL" );
    $kw180$SUBJECT = makeKeyword( "SUBJECT" );
    $list181 = ConsesLow.list( ConsesLow.cons( makeKeyword( "SUBJECT" ), makeSymbol( "?SUBJECT" ) ) );
    $list182 = ConsesLow.list( makeSymbol( "?SUBJECT" ) );
    $sym183$CYCL = makeSymbol( "CYCL" );
    $const184$PPCompFrameFn = constant_handles.reader_make_constant_shell( makeString( "PPCompFrameFn" ) );
    $list185 = ConsesLow.list( ConsesLow.cons( makeKeyword( "OBLIQUE-OBJECT" ), makeKeyword( "PREP-OBJECT" ) ) );
    $sym186$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw187$PARSER = makeKeyword( "PARSER" );
    $kw188$LEXICON = makeKeyword( "LEXICON" );
    $sym189$CYCLIFIER_LEXICON = makeSymbol( "CYCLIFIER-LEXICON" );
    $sym190$CYCLIFY = makeSymbol( "CYCLIFY" );
    $sym191$NEW_STANFORD_PARSER = makeSymbol( "NEW-STANFORD-PARSER" );
    $kw192$CONTEXT = makeKeyword( "CONTEXT" );
    $sym193$PARSE_TREE_CONTEXT = makeSymbol( "PARSE-TREE-CONTEXT" );
    $sym194$GET_CYCLIFIER = makeSymbol( "GET-CYCLIFIER" );
    $str195$Sentence__ = makeString( "Sentence: " );
    $sym196$LISTP = makeSymbol( "LISTP" );
    $sym197$CYCLIFY_PARSE = makeSymbol( "CYCLIFY-PARSE" );
    $str198$__ = makeString( "??" );
    $list199 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "CYCL" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "WORD" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONFIDENCE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CYCL" ),
            NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-WORD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "GET-CONFIDENCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COPY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-CLASS-METHOD" ), makeSymbol( "EL-FORMULA" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "SCORE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
                        .list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "FIND" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "SUBSTITUTE" ), NIL, makeKeyword(
                            "PROTECTED" ) )
    } );
    $sym200$CONFIDENCE = makeSymbol( "CONFIDENCE" );
    $sym201$WORD = makeSymbol( "WORD" );
    $sym202$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-CLASS" );
    $sym203$SUBLOOP_RESERVED_INITIALIZE_CYCLIFICATION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCLIFICATION-INSTANCE" );
    $sym204$NUMBERP = makeSymbol( "NUMBERP" );
    $list205 = ConsesLow.list( makeString( "@return el-formula-p; the cycl part of this string semantics" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCL" ) ) );
    $sym206$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFICATION-METHOD" );
    $sym207$CYCLIFICATION_GET_CYCL_METHOD = makeSymbol( "CYCLIFICATION-GET-CYCL-METHOD" );
    $sym208$GET_WORD = makeSymbol( "GET-WORD" );
    $list209 = ConsesLow.list( makeString( "@return stringp; the string of this cyclification" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "WORD" ) ) );
    $sym210$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFICATION-METHOD" );
    $sym211$CYCLIFICATION_GET_WORD_METHOD = makeSymbol( "CYCLIFICATION-GET-WORD-METHOD" );
    $sym212$GET_CONFIDENCE = makeSymbol( "GET-CONFIDENCE" );
    $list213 = ConsesLow.list( makeString( "@return non-negative-integerp; the confidence that the lex entry of this cyclification\n   is the intended meaning of its word" ), ConsesLow.list( makeSymbol( "RET" ),
        makeSymbol( "CONFIDENCE" ) ) );
    $sym214$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFICATION-METHOD" );
    $sym215$CYCLIFICATION_GET_CONFIDENCE_METHOD = makeSymbol( "CYCLIFICATION-GET-CONFIDENCE-METHOD" );
    $sym216$COPY = makeSymbol( "COPY" );
    $list217 = ConsesLow.list( makeString( "@return cyclification-p; a copy of this cyclification" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COPY" ), ConsesLow.list(
        makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFICATION" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFICATION-CYCL" ), makeSymbol( "COPY" ), ConsesLow.list(
            makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CYCL" ) ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFICATION-WORD" ), makeSymbol( "COPY" ), ConsesLow.list(
                makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-WORD" ) ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFICATION-CONFIDENCE" ), makeSymbol( "COPY" ),
                    ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONFIDENCE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COPY" ) ) ) );
    $sym218$CYCLIFICATION_COPY_METHOD = makeSymbol( "CYCLIFICATION-COPY-METHOD" );
    $list219 = ConsesLow.list( makeString( "Pretty-prints this word semantics to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ),
        makeString( "#<CYCLIFICATION " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeSymbol( "CYCL" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ">" ),
            makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym220$OUTER_CATCH_FOR_CYCLIFICATION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCLIFICATION-METHOD" );
    $str221$__CYCLIFICATION_ = makeString( "#<CYCLIFICATION " );
    $str222$_ = makeString( ">" );
    $sym223$CYCLIFICATION_PRINT_METHOD = makeSymbol( "CYCLIFICATION-PRINT-METHOD" );
    $list224 = ConsesLow.list( makeSymbol( "CYCLIFICATION-FORMULA" ) );
    $list225 = ConsesLow.list( makeString( "@return el-formula-p; the el-formula of CYCLIFICATION-FORMULA" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ) ),
        ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "CYCLIFICATION-FORMULA" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "E" ),
            makeSymbol( "CYCLIFICATION-FORMULA" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "EL-FORMULA" ) ), makeSymbol( "E" ) ), makeSymbol( "RESULT" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIFICATION-P" ), makeSymbol(
                    "CYCLIFICATION-FORMULA" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "EL-FORMULA" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CYCLIFICATION-FORMULA" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "GET-CYCL" ) ) ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCLIFICATION-FORMULA" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                "NREVERSE" ), makeSymbol( "RESULT" ) ) ) ) );
    $sym226$CYCLIFICATION_EL_FORMULA_METHOD = makeSymbol( "CYCLIFICATION-EL-FORMULA-METHOD" );
    $sym227$FIND = makeSymbol( "FIND" );
    $list228 = ConsesLow.list( makeSymbol( "CYCLIFICATION" ), makeSymbol( "ITEM" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) );
    $list229 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "E" ), makeSymbol( "CYCLIFICATION" ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "RESULT" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND" ) ), makeSymbol( "E" ),
                makeSymbol( "ITEM" ), makeSymbol( "TEST" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIFICATION-P" ), makeSymbol(
                    "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "FIND" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CYCLIFICATION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CYCL" ) ) ), makeSymbol( "ITEM" ),
                        makeSymbol( "TEST" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "TEST" ), makeSymbol( "CYCLIFICATION" ), makeSymbol(
                            "ITEM" ) ) ) ) ) );
    $sym230$CYCLIFICATION_FIND_METHOD = makeSymbol( "CYCLIFICATION-FIND-METHOD" );
    $sym231$SUBSTITUTE = makeSymbol( "SUBSTITUTE" );
    $list232 = ConsesLow.list( makeSymbol( "CYCLIFICATION" ), makeSymbol( "NEW" ), makeSymbol( "OLD" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) );
    $list233 = ConsesLow.list( ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        ConsesLow.list( makeSymbol( "NEW-LIST" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "E" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
            .list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBSTITUTE" ) ), makeSymbol( "E" ), makeSymbol( "NEW" ),
                makeSymbol( "OLD" ) ), makeSymbol( "NEW-LIST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "NEW-LIST" ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "CYCLIFICATION-P" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-CYCLIFICATION" ), ConsesLow.list( makeSymbol(
                        "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFICATION" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFICATION-CYCL" ), makeSymbol( "NEW-CYCLIFICATION" ),
                            ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CYCLIFICATION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBSTITUTE" ) ), ConsesLow
                                .list( makeSymbol( "FIM" ), makeSymbol( "CYCLIFICATION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CYCL" ) ) ), makeSymbol( "NEW" ), makeSymbol( "OLD" ) ) ), ConsesLow
                                    .list( makeSymbol( "SET-CYCLIFICATION-WORD" ), makeSymbol( "NEW-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CYCLIFICATION" ), ConsesLow.list( makeSymbol(
                                        "QUOTE" ), makeSymbol( "GET-WORD" ) ) ) ), ConsesLow.list( makeSymbol( "SET-CYCLIFICATION-CONFIDENCE" ), makeSymbol( "NEW-CYCLIFICATION" ), ConsesLow.list( makeSymbol( "FIM" ),
                                            makeSymbol( "CYCLIFICATION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONFIDENCE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                "NEW-CYCLIFICATION" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "FUNCALL" ),
                                                    makeSymbol( "TEST" ), makeSymbol( "CYCLIFICATION" ), makeSymbol( "OLD" ) ), makeSymbol( "NEW" ), makeSymbol( "CYCLIFICATION" ) ) ) ) ) );
    $sym234$CYCLIFICATION_SUBSTITUTE_METHOD = makeSymbol( "CYCLIFICATION-SUBSTITUTE-METHOD" );
    $str235$illegal_cyclification__a = makeString( "illegal cyclification ~a" );
    $sym236$YIELD = makeSymbol( "YIELD" );
    $str237$Illegal_cyclification__a = makeString( "Illegal cyclification ~a" );
    $sym238$CYCLIFICATION_SCORE = makeSymbol( "CYCLIFICATION-SCORE" );
    $sym239$_ = makeSymbol( ">" );
    $sym240$CDR = makeSymbol( "CDR" );
    $sym241$_ = makeSymbol( "<" );
    $sym242$QUANTIFIER_SCOPING_SCORE = makeSymbol( "QUANTIFIER-SCOPING-SCORE" );
    $sym243$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym244$GET_ABS_INDEX = makeSymbol( "GET-ABS-INDEX" );
    $int245$100 = makeInteger( 100 );
    $list246 = ConsesLow.list( new SubLObject[] { makeString( "What is the involvement of the armed forces in the chemical weapons process in Lybia?" ), makeString( "Who is Prime Minister?" ), makeString(
        "Has India used Chemical Weapons?" ), makeString( "Has India used Biological Weapons?" ), makeString( "What type of government does Lybia have?" ), makeString( "Who is Lybia?" ), makeString(
            "What is the population of Lybia?" ), makeString( "What are the major areas of economic growth in Lybia?" ), makeString( "What is Lybia's growth domestic product?" ), makeString(
                "Has Lybia used Chemical Weapons?" ), makeString( "Does Libya have access to chemical weapons research?" ), makeString( "Has Libya stockpiled chemical weapons?" ), makeString(
                    "Has Libya used Chemical weapons?" ), makeString( "has Libya stored chemical weapons?" ), makeString( "Who are Iran's Chemical Weapons Scientists?" ), makeString(
                        "what is the distance from Tehran to Baghdad?" ), makeString( "how far is Iran from Iraq?" ), makeString( "Where are Pakistan's chemical weapons?" ), makeString(
                            "What are Pakistan delivery systems?" ), makeString( "Who are Pakistans scientists?" ), makeString( "Where are Pakistan's chemical facilities?" ), makeString(
                                "Where are Pakistan's chemical plants?" ), makeString( "What chemicals does Pakistan have?" ), makeString( "Where are Pakistan's pesticide plants?" ), makeString(
                                    "Which scientists are involved in Russia's chemcial weapons program?" ), makeString( "What Russian weapons systems are capable of delivering chemical weapons?" ), makeString(
                                        "Which countries has Russia assisted in chemical weapons?" ), makeString( "What Russian NBC weapons facilities store what types of materials?" ), makeString(
                                            "Who are Russia's chemical scientists?" ), makeString( "What chemical weapons does Russia have?" ), makeString(
                                                "What happened to South Africa's chemical weapons scientists?" ), makeString( "What are the current and future development of chemicals in South Africa?" ), makeString(
                                                    "Tell me about Egypt's biological weapons program." ), makeString( "Does Egypt possess old technology for biological weapons?" )
    } );
    $str247$sentence___S__ = makeString( "sentence: ~S~%" );
    $sym248$INFERENCE_FORMULA_FOLLOWS = makeSymbol( "INFERENCE-FORMULA-FOLLOWS" );
    $const249$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym250$INSTANCEFN_NAT_ = makeSymbol( "INSTANCEFN-NAT?" );
  }
}
/*
 * 
 * Total time: 1299 ms synthetic
 */