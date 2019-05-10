package com.cyc.cycjava.cycl.leader;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycml_generator;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parse_tree_gui
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.leader.parse_tree_gui";
  public static final String myFingerPrint = "cd4fbe8fb6c82aafdd1bd49ea6b597ac886c03ffc26440f6e8b4968deb80bef6";
  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 921L)
  private static SubLSymbol $stop_word_categories$;
  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLSymbol $dtp_gui_enabled_document$;
  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLSymbol $dtp_gui_enabled_sentence$;
  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 7041L)
  private static SubLSymbol $token_index$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$GUI_ENABLED_DOCUMENT;
  private static final SubLSymbol $sym2$GUI_ENABLED_DOCUMENT_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PPRINT_GED;
  private static final SubLSymbol $sym8$GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$GED_SENTENCES;
  private static final SubLSymbol $sym11$_CSETF_GED_SENTENCES;
  private static final SubLSymbol $sym12$GED_PARSER;
  private static final SubLSymbol $sym13$_CSETF_GED_PARSER;
  private static final SubLSymbol $sym14$GED_LEXICON;
  private static final SubLSymbol $sym15$_CSETF_GED_LEXICON;
  private static final SubLSymbol $kw16$SENTENCES;
  private static final SubLSymbol $kw17$PARSER;
  private static final SubLSymbol $kw18$LEXICON;
  private static final SubLString $str19$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw20$BEGIN;
  private static final SubLSymbol $sym21$MAKE_GUI_ENABLED_DOCUMENT;
  private static final SubLSymbol $kw22$SLOT;
  private static final SubLSymbol $kw23$END;
  private static final SubLSymbol $sym24$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD;
  private static final SubLSymbol $sym25$NEW_GUI_ENABLED_DOCUMENT;
  private static final SubLSymbol $sym26$CYCLIFIER_LEXICON;
  private static final SubLSymbol $sym27$ADD_SENTENCE_TO_GED;
  private static final SubLSymbol $sym28$GED_SENTENCE_NUMBER;
  private static final SubLSymbol $sym29$GUI_ENABLED_SENTENCE;
  private static final SubLSymbol $sym30$GUI_ENABLED_SENTENCE_P;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$PPRINT_GES;
  private static final SubLSymbol $sym36$GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$GES_SURFACE_STRING;
  private static final SubLSymbol $sym39$_CSETF_GES_SURFACE_STRING;
  private static final SubLSymbol $sym40$GES_GUI_TOKENS;
  private static final SubLSymbol $sym41$_CSETF_GES_GUI_TOKENS;
  private static final SubLSymbol $sym42$GES_FULL_PARSE_TREE;
  private static final SubLSymbol $sym43$_CSETF_GES_FULL_PARSE_TREE;
  private static final SubLSymbol $sym44$GES_CURRENT_PARSE_TREE;
  private static final SubLSymbol $sym45$_CSETF_GES_CURRENT_PARSE_TREE;
  private static final SubLSymbol $sym46$GES_TOKEN_MAPPING;
  private static final SubLSymbol $sym47$_CSETF_GES_TOKEN_MAPPING;
  private static final SubLSymbol $sym48$GES_PARENT_DOCUMENT;
  private static final SubLSymbol $sym49$_CSETF_GES_PARENT_DOCUMENT;
  private static final SubLSymbol $kw50$SURFACE_STRING;
  private static final SubLSymbol $kw51$GUI_TOKENS;
  private static final SubLSymbol $kw52$FULL_PARSE_TREE;
  private static final SubLSymbol $kw53$CURRENT_PARSE_TREE;
  private static final SubLSymbol $kw54$TOKEN_MAPPING;
  private static final SubLSymbol $kw55$PARENT_DOCUMENT;
  private static final SubLSymbol $sym56$MAKE_GUI_ENABLED_SENTENCE;
  private static final SubLSymbol $sym57$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD;
  private static final SubLSymbol $sym58$NEW_GUI_ENABLED_SENTENCE;
  private static final SubLSymbol $sym59$PARSE;
  private static final SubLSymbol $sym60$LEARN;
  private static final SubLSymbol $sym61$LEXIFY;
  private static final SubLSymbol $sym62$REMOVE_REDUNDANT_LEXES;
  private static final SubLString $str63$__GED___S_sentences_;
  private static final SubLString $str64$___;
  private static final SubLString $str65$__GES___S_;
  private static final SubLSymbol $sym66$SENTENCIFY_REMOTELY;
  private static final SubLList $list67;
  private static final SubLString $str68$_sentencify_cgi;
  private static final SubLSymbol $kw69$POST;
  private static final SubLString $str70$_;
  private static final SubLString $str71$_;
  private static final SubLString $str72$string;
  private static final SubLSymbol $kw73$INPUT;
  private static final SubLString $str74$Unable_to_open__S;
  private static final SubLSymbol $sym75$START_TAG;
  private static final SubLString $str76$sentence;
  private static final SubLSymbol $sym77$YIELD;
  private static final SubLSymbol $sym78$CYCLIFY;
  private static final SubLList $list79;
  private static final SubLString $str80$tokens;
  private static final SubLSymbol $sym81$TO_XML;
  private static final SubLSymbol $sym82$END_TAG;
  private static final SubLString $str83$parses;
  private static final SubLSymbol $sym84$OUTSTREAM;
  private static final SubLSymbol $sym85$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str86$___S;
  private static final SubLSymbol $sym87$XML_WRITER;
  private static final SubLSymbol $sym88$SET_STREAM;
  private static final SubLString $str89$cycl_annotated_document;
  private static final SubLSymbol $sym90$FLUSH;
  private static final SubLSymbol $sym91$CLOSE;
  private static final SubLSymbol $sym92$WORD_TREE;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD;
  private static final SubLString $str97$pos;
  private static final SubLString $str98$token;
  private static final SubLSymbol $sym99$GET;
  private static final SubLSymbol $kw100$SEMTRANS;
  private static final SubLList $list101;
  private static final SubLObject $const102$isa;
  private static final SubLSymbol $sym103$GET_LEXES;
  private static final SubLSymbol $sym104$WORD_TREE_TO_XML_METHOD;
  private static final SubLSymbol $sym105$GET_GES_ANNOTATED_LEAVES;
  private static final SubLSymbol $sym106$CAR;
  private static final SubLSymbol $sym107$REMOVAL_LAMBDA;
  private static final SubLSymbol $sym108$CDR;
  private static final SubLSymbol $sym109$GET_CATEGORY;
  private static final SubLSymbol $sym110$GET_GED_ANNOTATED_TREE;
  private static final SubLSymbol $sym111$GET_GES_ANNOTATED_TREE;
  private static final SubLSymbol $kw112$PHRASE_TREE;
  private static final SubLSymbol $sym113$GET_STRING;
  private static final SubLSymbol $sym114$GET_PATH;
  private static final SubLSymbol $kw115$WORD_TREE;
  private static final SubLSymbol $sym116$GES_WORD_STRING;
  private static final SubLSymbol $sym117$EMPTY_STRING_P;
  private static final SubLSymbol $sym118$TRIM_WHITESPACE;
  private static final SubLString $str119$;
  private static final SubLString $str120$_;
  private static final SubLSymbol $sym121$SUBSTRING_;
  private static final SubLSymbol $sym122$GET_GED_ANNOTATED_LEAVES;
  private static final SubLSymbol $sym123$SELECT_SENSE_FOR_WORD;
  private static final SubLSymbol $sym124$GET_NTH_WORD;
  private static final SubLString $str125$Attempted_to_set_sense__A__but_on;
  private static final SubLSymbol $sym126$LEXES;
  private static final SubLSymbol $sym127$FIND_WORD_INDEX_FROM_PATH;
  private static final SubLSymbol $sym128$PRUNE_GES_BY_WFF_CHECKING;
  private static final SubLSymbol $sym129$NAIVE_WFF_SELF_PRUNE;
  private static final SubLSymbol $sym130$LEX_ENTRY_EQUALP;
  private static final SubLSymbol $sym131$PRUNE_GED_SENTENCE_BY_WFF_CHECKING;
  private static final SubLSymbol $sym132$CYCLIFY_GED_SENTENCE;
  private static final SubLSymbol $sym133$PARSE_TREE;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$PRUNE_LEXES;
  private static final SubLSymbol $sym136$PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD;
  private static final SubLList $list137;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD;
  private static final SubLSymbol $sym140$WORD_TREE_PRUNE_LEXES_METHOD;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLSymbol $kw143$DFR2L;
  private static final SubLSymbol $kw144$DFL2R;
  private static final SubLString $str145$_S_is_not_one_of__S;
  private static final SubLSymbol $sym146$PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD;
  private static final SubLSymbol $kw149$TO;
  private static final SubLSymbol $sym150$GET_MOTHER;
  private static final SubLSymbol $kw151$VP;
  private static final SubLSymbol $sym152$WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD;
  private static final SubLSymbol $sym153$PHRASE_TREE;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$PHRASE_TREE_PRUNE_LEXES_METHOD;
  private static final SubLList $list156;
  private static final SubLList $list157;
  private static final SubLString $str158$Attempted_to_get_the__A_word__but;
  private static final SubLSymbol $sym159$PHRASE_TREE_GET_NTH_WORD_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1049L)
  public static SubLObject stop_word_p(final SubLObject category)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( category, $stop_word_categories$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject gui_enabled_document_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_ged( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject gui_enabled_document_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $gui_enabled_document_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject ged_sentences(final SubLObject v_object)
  {
    assert NIL != gui_enabled_document_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject ged_parser(final SubLObject v_object)
  {
    assert NIL != gui_enabled_document_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject ged_lexicon(final SubLObject v_object)
  {
    assert NIL != gui_enabled_document_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject _csetf_ged_sentences(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_document_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject _csetf_ged_parser(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_document_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject _csetf_ged_lexicon(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_document_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject make_gui_enabled_document(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $gui_enabled_document_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw16$SENTENCES ) )
      {
        _csetf_ged_sentences( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$PARSER ) )
      {
        _csetf_ged_parser( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$LEXICON ) )
      {
        _csetf_ged_lexicon( v_new, current_value );
      }
      else
      {
        Errors.error( $str19$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject visit_defstruct_gui_enabled_document(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw20$BEGIN, $sym21$MAKE_GUI_ENABLED_DOCUMENT, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw16$SENTENCES, ged_sentences( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw17$PARSER, ged_parser( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw18$LEXICON, ged_lexicon( obj ) );
    Functions.funcall( visitor_fn, obj, $kw23$END, $sym21$MAKE_GUI_ENABLED_DOCUMENT, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
  public static SubLObject visit_defstruct_object_gui_enabled_document_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_gui_enabled_document( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1295L)
  public static SubLObject new_gui_enabled_document(final SubLObject size, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = object.new_class_instance( $sym26$CYCLIFIER_LEXICON );
    }
    final SubLObject ged = make_gui_enabled_document( UNPROVIDED );
    final SubLObject v_parser = parser.new_stanford_parser( UNPROVIDED, UNPROVIDED );
    final SubLObject sentence_vector = Vectors.make_vector( size, UNPROVIDED );
    _csetf_ged_sentences( ged, sentence_vector );
    _csetf_ged_parser( ged, v_parser );
    _csetf_ged_lexicon( ged, lexicon );
    return ged;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1659L)
  public static SubLObject add_sentence_to_ged(final SubLObject ged, final SubLObject sentence_string, final SubLObject index)
  {
    final SubLObject ges = new_gui_enabled_sentence( sentence_string, ged, ged_parser( ged ) );
    final SubLObject sentence_vector = ged_sentences( ged );
    SubLObject successP = NIL;
    Vectors.set_aref( sentence_vector, index, ges );
    if( NIL != gui_enabled_sentence_p( ges ) && NIL != parse_tree.parse_tree_p( ges_full_parse_tree( ges ) ) )
    {
      successP = T;
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2046L)
  public static SubLObject ged_sentence_number(final SubLObject ged)
  {
    return Sequences.length( ged_sentences( ged ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject gui_enabled_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_ges( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject gui_enabled_sentence_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $gui_enabled_sentence_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject ges_surface_string(final SubLObject v_object)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject ges_gui_tokens(final SubLObject v_object)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject ges_full_parse_tree(final SubLObject v_object)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject ges_current_parse_tree(final SubLObject v_object)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject ges_token_mapping(final SubLObject v_object)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject ges_parent_document(final SubLObject v_object)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject _csetf_ges_surface_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject _csetf_ges_gui_tokens(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject _csetf_ges_full_parse_tree(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject _csetf_ges_current_parse_tree(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject _csetf_ges_token_mapping(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject _csetf_ges_parent_document(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != gui_enabled_sentence_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject make_gui_enabled_sentence(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $gui_enabled_sentence_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw50$SURFACE_STRING ) )
      {
        _csetf_ges_surface_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$GUI_TOKENS ) )
      {
        _csetf_ges_gui_tokens( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$FULL_PARSE_TREE ) )
      {
        _csetf_ges_full_parse_tree( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$CURRENT_PARSE_TREE ) )
      {
        _csetf_ges_current_parse_tree( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$TOKEN_MAPPING ) )
      {
        _csetf_ges_token_mapping( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$PARENT_DOCUMENT ) )
      {
        _csetf_ges_parent_document( v_new, current_value );
      }
      else
      {
        Errors.error( $str19$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject visit_defstruct_gui_enabled_sentence(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw20$BEGIN, $sym56$MAKE_GUI_ENABLED_SENTENCE, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw50$SURFACE_STRING, ges_surface_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw51$GUI_TOKENS, ges_gui_tokens( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw52$FULL_PARSE_TREE, ges_full_parse_tree( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw53$CURRENT_PARSE_TREE, ges_current_parse_tree( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw54$TOKEN_MAPPING, ges_token_mapping( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw55$PARENT_DOCUMENT, ges_parent_document( obj ) );
    Functions.funcall( visitor_fn, obj, $kw23$END, $sym56$MAKE_GUI_ENABLED_SENTENCE, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
  public static SubLObject visit_defstruct_object_gui_enabled_sentence_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_gui_enabled_sentence( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2326L)
  public static SubLObject new_gui_enabled_sentence(final SubLObject sentence_string, final SubLObject v_document, final SubLObject v_parser)
  {
    final SubLObject ges = make_gui_enabled_sentence( UNPROVIDED );
    final SubLObject full_tree = methods.funcall_instance_method_with_1_args( v_parser, $sym59$PARSE, sentence_string );
    final SubLObject current_tree = methods.funcall_instance_method_with_1_args( v_parser, $sym59$PARSE, sentence_string );
    final SubLObject lexicon = ged_lexicon( v_document );
    methods.funcall_instance_method_with_1_args( lexicon, $sym60$LEARN, sentence_string );
    if( NIL != parse_tree.parse_tree_p( full_tree ) )
    {
      methods.funcall_instance_method_with_1_args( full_tree, $sym61$LEXIFY, lexicon );
      methods.funcall_instance_method_with_0_args( full_tree, $sym62$REMOVE_REDUNDANT_LEXES );
      methods.funcall_instance_method_with_1_args( current_tree, $sym61$LEXIFY, lexicon );
      methods.funcall_instance_method_with_0_args( current_tree, $sym62$REMOVE_REDUNDANT_LEXES );
    }
    _csetf_ges_parent_document( ges, v_document );
    _csetf_ges_surface_string( ges, sentence_string );
    _csetf_ges_full_parse_tree( ges, full_tree );
    _csetf_ges_current_parse_tree( ges, current_tree );
    _csetf_ges_gui_tokens( ges, create_token_list( ges ) );
    _csetf_ges_token_mapping( ges, create_ges_token_mapping( ges ) );
    return ges;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 3186L)
  public static SubLObject ges_lexicon(final SubLObject ges)
  {
    final SubLObject parent = ges_parent_document( ges );
    if( NIL != parent )
    {
      return ged_lexicon( parent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 3320L)
  public static SubLObject pprint_ged(final SubLObject ged, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str63$__GED___S_sentences_, Sequences.length( ged_sentences( ged ) ) );
    return ged;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 3477L)
  public static SubLObject pprint_ges(final SubLObject ges, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject string = ges_surface_string( ges );
    SubLObject print_string = string_utilities.string_first_n( TWENTY_INTEGER, string );
    if( Sequences.length( string ).numG( TWENTY_INTEGER ) )
    {
      print_string = Sequences.cconcatenate( print_string, $str64$___ );
    }
    PrintLow.format( stream, $str65$__GES___S_, print_string );
    return ges;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 3789L)
  public static SubLObject new_gui_enabled_document_from_stream(final SubLObject stream)
  {
    final SubLObject string = document.stream_stringify( stream );
    final SubLObject sentences = document.sentencify_string( string );
    final SubLObject ged = new_gui_enabled_document( Sequences.length( sentences ), UNPROVIDED );
    SubLObject list_var = NIL;
    SubLObject sentence = NIL;
    SubLObject i = NIL;
    list_var = sentences;
    sentence = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), sentence = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      add_sentence_to_ged( ged, sentence, i );
    }
    return ged;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 4097L)
  public static SubLObject sentencify_remotely(final SubLObject string, SubLObject path, SubLObject host, SubLObject port, SubLObject method)
  {
    if( path == UNPROVIDED )
    {
      path = Sequences.cconcatenate( web_utilities.$cgi_path$.getDynamicValue(), $str68$_sentencify_cgi );
    }
    if( host == UNPROVIDED )
    {
      host = web_utilities.$cgi_host$.getDynamicValue();
    }
    if( port == UNPROVIDED )
    {
      port = web_utilities.$cgi_port$.getDynamicValue();
    }
    if( method == UNPROVIDED )
    {
      method = $kw69$POST;
    }
    final SubLObject safe_string = string_utilities.string_substitute( $str70$_, $str71$_, string, UNPROVIDED );
    final SubLObject query = ConsesLow.list( ConsesLow.list( $str72$string, safe_string ) );
    final SubLObject safe_sentences = reader.read_from_string( web_utilities.http_retrieve( query, path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    return safe_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 4535L)
  public static SubLObject new_gui_enabled_document_from_file(final SubLObject filepath)
  {
    SubLObject ged = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( filepath, $kw73$INPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str74$Unable_to_open__S, filepath );
      }
      final SubLObject stream_$1 = stream;
      ged = new_gui_enabled_document_from_stream( stream_$1 );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return ged;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 4738L)
  public static SubLObject new_gui_enabled_document_from_string(final SubLObject string)
  {
    return new_gui_enabled_document( string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 4844L)
  public static SubLObject gui_enabled_sentence_to_xml(final SubLObject ges, final SubLObject v_xml_writer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != gui_enabled_sentence_p( ges ) : ges;
    methods.funcall_instance_method_with_4_args( v_xml_writer, $sym75$START_TAG, $str76$sentence, NIL, NIL, T );
    final SubLObject tree = ges_current_parse_tree( ges );
    final SubLObject words = ( NIL != parse_tree.parse_tree_p( tree ) ) ? methods.funcall_instance_method_with_0_args( tree, $sym77$YIELD ) : NIL;
    final SubLObject parses = methods.funcall_instance_method_with_1_args( tree, $sym78$CYCLIFY, $list79 );
    methods.funcall_instance_method_with_4_args( v_xml_writer, $sym75$START_TAG, $str80$tokens, NIL, NIL, T );
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != word_tree.word_tree_p( word ) )
      {
        methods.funcall_instance_method_with_1_args( word, $sym81$TO_XML, v_xml_writer );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    methods.funcall_instance_method_with_3_args( v_xml_writer, $sym82$END_TAG, $str80$tokens, NIL, T );
    methods.funcall_instance_method_with_4_args( v_xml_writer, $sym75$START_TAG, $str83$parses, NIL, NIL, T );
    cdolist_list_var = parses;
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( instances.get_slot( v_xml_writer, $sym84$OUTSTREAM ), thread );
        SubLObject error = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym85$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              cycml_generator.cycml_serialize_object( parse );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$2, thread );
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
          Errors.warn( $str86$___S, error );
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    methods.funcall_instance_method_with_3_args( v_xml_writer, $sym82$END_TAG, $str83$parses, NIL, T );
    methods.funcall_instance_method_with_3_args( v_xml_writer, $sym82$END_TAG, $str76$sentence, NIL, T );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 5709L)
  public static SubLObject ged_to_xml_string(final SubLObject ged)
  {
    final SubLObject v_xml_writer = object.new_class_instance( $sym87$XML_WRITER );
    final SubLObject stream = streams_high.make_string_output_stream();
    SubLObject string = NIL;
    methods.funcall_instance_method_with_1_args( v_xml_writer, $sym88$SET_STREAM, stream );
    methods.funcall_instance_method_with_4_args( v_xml_writer, $sym75$START_TAG, $str89$cycl_annotated_document, NIL, NIL, T );
    final SubLObject vector_var = ged_sentences( ged );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject ges;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      ges = Vectors.aref( vector_var, element_num );
      if( NIL != gui_enabled_sentence_p( ges ) )
      {
        gui_enabled_sentence_to_xml( ges, v_xml_writer );
      }
    }
    methods.funcall_instance_method_with_3_args( v_xml_writer, $sym82$END_TAG, $str89$cycl_annotated_document, NIL, T );
    methods.funcall_instance_method_with_0_args( v_xml_writer, $sym90$FLUSH );
    string = streams_high.get_output_stream_string( stream );
    methods.funcall_instance_method_with_0_args( v_xml_writer, $sym91$CLOSE );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 6275L)
  public static SubLObject word_tree_to_xml_method(final SubLObject self, final SubLObject v_xml_writer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    final SubLObject category = parse_tree.get_parse_tree_category( self );
    final SubLObject string = parse_tree.get_parse_tree_string( self );
    try
    {
      thread.throwStack.push( $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( instances.get_slot( v_xml_writer, $sym84$OUTSTREAM ), thread );
          final SubLObject attributes = ConsesLow.list( $str97$pos, category, $str98$token, string );
          SubLObject cycls = NIL;
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym103$GET_LEXES );
          SubLObject lexeme = NIL;
          lexeme = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject semtrans = methods.funcall_instance_method_with_1_args( lexeme, $sym99$GET, $kw100$SEMTRANS );
            SubLObject v_term = NIL;
            if( semtrans.isCons() )
            {
              if( NIL != subl_promotions.memberP( semtrans.first(), $list101, UNPROVIDED, UNPROVIDED ) )
              {
                v_term = conses_high.third( semtrans );
              }
              else if( NIL == v_term )
              {
                SubLObject csome_list_var = semtrans;
                SubLObject clause = NIL;
                clause = csome_list_var.first();
                while ( NIL == v_term && NIL != csome_list_var)
                {
                  if( clause.isList() && $const102$isa.eql( clause.first() ) )
                  {
                    v_term = conses_high.third( clause );
                  }
                  csome_list_var = csome_list_var.rest();
                  clause = csome_list_var.first();
                }
              }
            }
            if( NIL != forts.fort_p( v_term ) )
            {
              cycls = ConsesLow.cons( v_term, cycls );
            }
            cdolist_list_var = cdolist_list_var.rest();
            lexeme = cdolist_list_var.first();
          }
          methods.funcall_instance_method_with_4_args( v_xml_writer, $sym75$START_TAG, $str98$token, attributes, NIL, T );
          cdolist_list_var = cycls;
          SubLObject cycl = NIL;
          cycl = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            cycml_generator.cycml_serialize_object( cycl );
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
          }
          methods.funcall_instance_method_with_3_args( v_xml_writer, $sym82$END_TAG, $str98$token, NIL, T );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 7075L)
  public static SubLObject removal_lambda(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.numE( v_object, $token_index$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 7182L)
  public static SubLObject get_ges_annotated_leaves(final SubLObject ges)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tokens = ges_gui_tokens( ges );
    final SubLObject token_mapping = ges_token_mapping( ges );
    final SubLObject words = methods.funcall_instance_method_with_0_args( ges_full_parse_tree( ges ), $sym77$YIELD );
    final SubLObject lexicon = ges_lexicon( ges );
    SubLObject annotated_words = NIL;
    SubLObject list_var = NIL;
    SubLObject token = NIL;
    SubLObject i = NIL;
    list_var = tokens;
    token = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), token = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject _prev_bind_0 = $token_index$.currentBinding( thread );
      try
      {
        $token_index$.bind( i, thread );
        final SubLObject indices = Mapping.mapcar( Symbols.symbol_function( $sym106$CAR ), list_utilities.remove_if_not( Symbols.symbol_function( $sym107$REMOVAL_LAMBDA ), token_mapping, Symbols.symbol_function(
            $sym108$CDR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        SubLObject category = T;
        SubLObject lexes = NIL;
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = indices;
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject word = ConsesLow.nth( index, words );
          lexes = Sequences.cconcatenate( lexes, methods.funcall_instance_method_with_0_args( word, $sym103$GET_LEXES ) );
          category = makeBoolean( NIL != category && NIL != stop_word_p( methods.funcall_instance_method_with_0_args( word, $sym109$GET_CATEGORY ) ) );
          cdolist_list_var = cdolist_list_var.rest();
          index = cdolist_list_var.first();
        }
        cdolist_list_var = lexes;
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject extracted = semtrans_lexicon.extract_cycl_from_semtrans_lex_entry( lex, lexicon );
          if( NIL != extracted )
          {
            cycls = ConsesLow.cons( extracted, cycls );
          }
          cdolist_list_var = cdolist_list_var.rest();
          lex = cdolist_list_var.first();
        }
        cycls = list_utilities.fast_delete_duplicates( cycls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        annotated_words = ConsesLow.cons( ConsesLow.list( token, cycls, category ), annotated_words );
      }
      finally
      {
        $token_index$.rebind( _prev_bind_0, thread );
      }
    }
    return Sequences.nreverse( annotated_words );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 8116L)
  public static SubLObject get_ged_annotated_tree(final SubLObject ged, final SubLObject ges_idx)
  {
    final SubLObject ges = Vectors.aref( ged_sentences( ged ), ges_idx );
    return get_ges_annotated_tree( ges );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 8263L)
  public static SubLObject get_ges_annotated_tree(final SubLObject ges)
  {
    final SubLObject tree = ges_full_parse_tree( ges );
    final SubLObject lexicon = ges_lexicon( ges );
    return annotate_parse_tree( tree, lexicon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 8430L)
  public static SubLObject annotate_parse_tree(final SubLObject v_parse_tree, final SubLObject lexicon)
  {
    if( NIL != parse_tree.phrase_tree_p( v_parse_tree ) )
    {
      return annotate_phrase_tree( v_parse_tree, lexicon );
    }
    if( NIL != word_tree.word_tree_p( v_parse_tree ) )
    {
      return annotate_word_tree( v_parse_tree, lexicon );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 8685L)
  public static SubLObject annotate_phrase_tree(final SubLObject phrase_tree, final SubLObject lexicon)
  {
    final SubLObject category = parse_tree.get_parse_tree_category( phrase_tree );
    SubLObject result = NIL;
    result = ConsesLow.cons( ConsesLow.list( $kw112$PHRASE_TREE, category, methods.funcall_instance_method_with_0_args( phrase_tree, $sym113$GET_STRING ), methods.funcall_instance_method_with_0_args( phrase_tree,
        $sym114$GET_PATH ) ), result );
    final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( phrase_tree );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      result = ConsesLow.cons( annotate_parse_tree( daughter, lexicon ), result );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 9077L)
  public static SubLObject annotate_word_tree(final SubLObject v_word_tree, final SubLObject lexicon)
  {
    final SubLObject category = parse_tree.get_parse_tree_category( v_word_tree );
    final SubLObject lexes = methods.funcall_instance_method_with_0_args( v_word_tree, $sym103$GET_LEXES );
    SubLObject cycls = NIL;
    SubLObject cdolist_list_var = lexes;
    SubLObject lex = NIL;
    lex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject extracted = semtrans_lexicon.extract_cycl_from_semtrans_lex_entry( lex, lexicon );
      if( NIL != extracted )
      {
        cycls = ConsesLow.cons( extracted, cycls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex = cdolist_list_var.first();
    }
    return ConsesLow.list( $kw115$WORD_TREE, category, methods.funcall_instance_method_with_0_args( v_word_tree, $sym113$GET_STRING ), methods.funcall_instance_method_with_0_args( v_word_tree, $sym114$GET_PATH ),
        cycls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 9483L)
  public static SubLObject create_ges_token_mapping(final SubLObject ges)
  {
    final SubLObject token_list = ges_gui_tokens( ges );
    final SubLObject full_tree = ges_full_parse_tree( ges );
    final SubLObject words = methods.funcall_instance_method_with_0_args( full_tree, $sym77$YIELD );
    return parsing_utilities.create_token_mapping( token_list, words, Symbols.symbol_function( IDENTITY ), Symbols.symbol_function( $sym116$GES_WORD_STRING ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 9729L)
  public static SubLObject ges_word_string(final SubLObject word)
  {
    return methods.funcall_instance_method_with_0_args( word, $sym113$GET_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 9801L)
  public static SubLObject create_token_list(final SubLObject ges)
  {
    final SubLObject token_list = Sequences.delete_if( Symbols.symbol_function( $sym117$EMPTY_STRING_P ), Mapping.mapcar( Symbols.symbol_function( $sym118$TRIM_WHITESPACE ), string_utilities.split_string(
        ges_surface_string( ges ), UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject words = methods.funcall_instance_method_with_0_args( ges_full_parse_tree( ges ), $sym77$YIELD );
    SubLObject word_strings = NIL;
    SubLObject word_lists = NIL;
    SubLObject cdolist_list_var = words;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      word_strings = ConsesLow.cons( methods.funcall_instance_method_with_0_args( word, $sym113$GET_STRING ), word_strings );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    cdolist_list_var = word_strings;
    SubLObject word_string = NIL;
    word_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject word_list = string_utilities.split_string( word_string, UNPROVIDED );
      if( Sequences.length( word_list ).numG( ONE_INTEGER ) )
      {
        word_lists = ConsesLow.cons( word_list, word_lists );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word_string = cdolist_list_var.first();
    }
    if( NIL != word_lists )
    {
      return nmerge_words( word_lists, token_list );
    }
    return token_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 10374L)
  public static SubLObject nmerge_words(final SubLObject word_lists, final SubLObject string_list)
  {
    SubLObject cdolist_list_var = word_lists;
    SubLObject word_list = NIL;
    word_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      reattach_word( word_list, string_list, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      word_list = cdolist_list_var.first();
    }
    return string_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 10645L)
  public static SubLObject add_spaces(final SubLObject word_list)
  {
    SubLObject string = $str119$;
    SubLObject list_var = NIL;
    SubLObject word = NIL;
    SubLObject i = NIL;
    list_var = word_list;
    word = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), word = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      if( i.numG( ZERO_INTEGER ) )
      {
        string = Sequences.cconcatenate( string, $str120$_ );
      }
      string = Sequences.cconcatenate( string, word );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 10945L)
  public static SubLObject reattach_word(final SubLObject word_list, final SubLObject string_list, SubLObject start)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    final SubLObject index = Sequences.search( word_list, string_list, Symbols.symbol_function( $sym121$SUBSTRING_ ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, start, UNPROVIDED );
    if( NIL != index )
    {
      final SubLObject newtoken = add_spaces( Sequences.subseq( string_list, index, Numbers.add( index, Sequences.length( word_list ) ) ) );
      list_utilities.ncollapse_n_from_pos( Sequences.length( word_list ), index, newtoken, string_list );
      reattach_word( word_list, string_list, Numbers.add( index, ONE_INTEGER ) );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 11374L)
  public static SubLObject get_ged_annotated_leaves(final SubLObject ged, final SubLObject ges_idx)
  {
    final SubLObject ges = Vectors.aref( ged_sentences( ged ), ges_idx );
    return get_ges_annotated_leaves( ges );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 11525L)
  public static SubLObject select_sense_for_word(final SubLObject ged, final SubLObject ges_idx, final SubLObject word_num, final SubLObject sense_num)
  {
    final SubLObject ges = Vectors.aref( ged_sentences( ged ), ges_idx );
    final SubLObject full_tree = ges_full_parse_tree( ges );
    final SubLObject all_lexes = methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( full_tree, $sym124$GET_NTH_WORD, word_num ), $sym103$GET_LEXES );
    SubLObject target = NIL;
    if( Sequences.length( all_lexes ).numGE( sense_num ) )
    {
      target = ConsesLow.nth( sense_num, all_lexes );
    }
    else
    {
      Errors.warn( $str125$Attempted_to_set_sense__A__but_on, sense_num, Sequences.length( all_lexes ) );
    }
    if( NIL != target )
    {
      final SubLObject current_tree = ges_current_parse_tree( ges );
      final SubLObject word = methods.funcall_instance_method_with_1_args( current_tree, $sym124$GET_NTH_WORD, word_num );
      instances.set_slot( word, $sym126$LEXES, ConsesLow.list( ConsesLow.cons( target, ONE_INTEGER ) ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 12134L)
  public static SubLObject find_word_index_from_path(final SubLObject ged, final SubLObject ges_idx, final SubLObject path)
  {
    final SubLObject ges = Vectors.aref( ged_sentences( ged ), ges_idx );
    SubLObject tree = ges_full_parse_tree( ges );
    final SubLObject yield = methods.funcall_instance_method_with_0_args( tree, $sym77$YIELD );
    SubLObject cdolist_list_var = path;
    SubLObject index = NIL;
    index = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      tree = Vectors.aref( parse_tree.get_phrase_tree_daughters( tree ), index );
      cdolist_list_var = cdolist_list_var.rest();
      index = cdolist_list_var.first();
    }
    return list_utilities.list_position( tree, yield, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 12548L)
  public static SubLObject prune_ges_by_wff_checking(final SubLObject ges)
  {
    final SubLObject full_tree = ges_full_parse_tree( ges );
    final SubLObject current_tree = ges_current_parse_tree( ges );
    final SubLObject full_yield = methods.funcall_instance_method_with_0_args( full_tree, $sym77$YIELD );
    final SubLObject current_yield = methods.funcall_instance_method_with_0_args( current_tree, $sym77$YIELD );
    SubLObject message = NIL;
    methods.funcall_instance_method_with_0_args( current_tree, $sym129$NAIVE_WFF_SELF_PRUNE );
    SubLObject full_word = NIL;
    SubLObject full_word_$3 = NIL;
    SubLObject current_word = NIL;
    SubLObject current_word_$4 = NIL;
    full_word = full_yield;
    full_word_$3 = full_word.first();
    current_word = current_yield;
    current_word_$4 = current_word.first();
    while ( NIL != current_word || NIL != full_word)
    {
      final SubLObject full_lexes = methods.funcall_instance_method_with_0_args( full_word_$3, $sym103$GET_LEXES );
      final SubLObject current_lexes = methods.funcall_instance_method_with_0_args( current_word_$4, $sym103$GET_LEXES );
      SubLObject word_message = NIL;
      SubLObject cdolist_list_var = full_lexes;
      SubLObject lex = NIL;
      lex = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != subl_promotions.memberP( lex, current_lexes, Symbols.symbol_function( $sym130$LEX_ENTRY_EQUALP ), UNPROVIDED ) )
        {
          word_message = ConsesLow.cons( ONE_INTEGER, word_message );
        }
        else
        {
          word_message = ConsesLow.cons( ZERO_INTEGER, word_message );
        }
        cdolist_list_var = cdolist_list_var.rest();
        lex = cdolist_list_var.first();
      }
      message = ConsesLow.cons( Sequences.nreverse( word_message ), message );
      full_word = full_word.rest();
      full_word_$3 = full_word.first();
      current_word = current_word.rest();
      current_word_$4 = current_word.first();
    }
    message = Sequences.nreverse( message );
    SubLObject cdolist_list_var2 = Sequences.reverse( ges_token_mapping( ges ) );
    SubLObject mapping = NIL;
    mapping = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject full_parse_position = mapping.first();
      final SubLObject annotated_position = mapping.rest();
      if( !full_parse_position.eql( annotated_position ) )
      {
        list_utilities.delete_nth( full_parse_position, message );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      mapping = cdolist_list_var2.first();
    }
    return message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 13528L)
  public static SubLObject prune_ged_sentence_by_wff_checking(final SubLObject ged, final SubLObject ges_idx)
  {
    final SubLObject ges = Vectors.aref( ged_sentences( ged ), ges_idx );
    return prune_ges_by_wff_checking( ges );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 13690L)
  public static SubLObject cyclify_ged_sentence(final SubLObject ged, final SubLObject ges_idx)
  {
    final SubLObject ges = Vectors.aref( ged_sentences( ged ), ges_idx );
    final SubLObject current_tree = ges_current_parse_tree( ges );
    if( NIL != parse_tree.parse_tree_p( current_tree ) )
    {
      return methods.funcall_instance_method_with_1_args( current_tree, $sym78$CYCLIFY, $list79 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 13938L)
  public static SubLObject parse_tree_naive_wff_self_prune_method(final SubLObject self)
  {
    final SubLObject parses = methods.funcall_instance_method_with_1_args( self, $sym78$CYCLIFY, $list79 );
    SubLObject wff_terms = NIL;
    SubLObject cdolist_list_var = parses;
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$5;
      final SubLObject terms = cdolist_list_var_$5 = list_utilities.flatten( parse );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        if( NIL != forts.fort_p( v_term ) )
        {
          final SubLObject item_var = v_term;
          if( NIL == conses_high.member( item_var, wff_terms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            wff_terms = ConsesLow.cons( item_var, wff_terms );
          }
        }
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        v_term = cdolist_list_var_$5.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    if( NIL != wff_terms )
    {
      methods.funcall_instance_method_with_1_args( self, $sym135$PRUNE_LEXES, wff_terms );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 14301L)
  public static SubLObject word_tree_prune_lexes_method(final SubLObject self, final SubLObject wff_terms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    SubLObject lexes = word_tree.get_word_tree_lexes( self );
    try
    {
      thread.throwStack.push( $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        SubLObject accepted = NIL;
        SubLObject rejected = NIL;
        SubLObject to_redistribute = ZERO_INTEGER;
        SubLObject cdolist_list_var = lexes;
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject semtrans_terms = list_utilities.flatten( semtrans_lexicon.extract_cycl_from_semtrans_lex_entry( cyclifier.rle_lex( rle ), UNPROVIDED ) );
          if( NIL != conses_high.intersection( semtrans_terms, wff_terms, UNPROVIDED, UNPROVIDED ) )
          {
            accepted = ConsesLow.cons( rle, accepted );
          }
          else
          {
            rejected = ConsesLow.cons( rle, rejected );
            to_redistribute = Numbers.add( to_redistribute, cyclifier.rle_confidence( rle ) );
          }
          cdolist_list_var = cdolist_list_var.rest();
          rle = cdolist_list_var.first();
        }
        if( NIL != accepted )
        {
          final SubLObject addendum = Numbers.divide( to_redistribute, Sequences.length( accepted ) );
          SubLObject cdolist_list_var2 = accepted;
          SubLObject a = NIL;
          a = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            cyclifier.rle_set_confidence( a, Numbers.add( cyclifier.rle_confidence( a ), addendum ) );
            cdolist_list_var2 = cdolist_list_var2.rest();
            a = cdolist_list_var2.first();
          }
        }
        lexes = accepted;
        Dynamic.sublisp_throw( $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD, rejected );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          word_tree.set_word_tree_lexes( self, lexes );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 14927L)
  public static SubLObject parse_tree_remove_redundant_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stack = stacks.create_stack();
    final SubLObject order_var = $kw143$DFR2L;
    final SubLObject possible_orders = ConsesLow.list( $kw144$DFL2R, $kw143$DFR2L );
    SubLObject daughter = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str145$_S_is_not_one_of__S, order_var, possible_orders );
    }
    stacks.stack_push( self, stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      daughter = stacks.stack_pop( stack );
      if( NIL != word_tree.word_tree_p( daughter ) )
      {
        methods.funcall_instance_method_with_0_args( daughter, $sym62$REMOVE_REDUNDANT_LEXES );
      }
      if( NIL != parse_tree.phrase_tree_p( daughter ) )
      {
        final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( daughter );
        final SubLObject backwardP_var = Equality.eq( order_var, $kw144$DFL2R );
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter_$6;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          daughter_$6 = Vectors.aref( vector_var, element_num );
          stacks.stack_push( daughter_$6, stack );
        }
      }
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 15149L)
  public static SubLObject word_tree_remove_redundant_lexes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_word_tree_method = NIL;
    SubLObject lexes = word_tree.get_word_tree_lexes( self );
    final SubLObject mother = parse_tree.get_parse_tree_mother( self );
    try
    {
      thread.throwStack.push( $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD );
      try
      {
        if( $kw149$TO == methods.funcall_instance_method_with_0_args( self, $sym109$GET_CATEGORY ) )
        {
          final SubLObject mother_$7 = methods.funcall_instance_method_with_0_args( self, $sym150$GET_MOTHER );
          if( $kw151$VP == methods.funcall_instance_method_with_0_args( mother_$7, $sym109$GET_CATEGORY ) )
          {
            lexes = NIL;
          }
        }
        else
        {
          SubLObject non_redundant = NIL;
          final SubLObject to_redistribute = ZERO_INTEGER;
          SubLObject cdolist_list_var = lexes;
          SubLObject rle = NIL;
          rle = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject semtrans = cycl_utilities.hl_to_el( methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( rle ), $sym99$GET, $kw100$SEMTRANS ) );
            SubLObject fail = NIL;
            if( NIL == fail )
            {
              SubLObject csome_list_var = non_redundant;
              SubLObject old_rle = NIL;
              old_rle = csome_list_var.first();
              while ( NIL == fail && NIL != csome_list_var)
              {
                final SubLObject old_semtrans = methods.funcall_instance_method_with_1_args( cyclifier.rle_lex( old_rle ), $sym99$GET, $kw100$SEMTRANS );
                fail = Equality.equalp( semtrans, old_semtrans );
                csome_list_var = csome_list_var.rest();
                old_rle = csome_list_var.first();
              }
            }
            if( NIL == fail )
            {
              non_redundant = ConsesLow.cons( rle, non_redundant );
            }
            cdolist_list_var = cdolist_list_var.rest();
            rle = cdolist_list_var.first();
          }
          if( NIL != non_redundant )
          {
            final SubLObject addendum = Numbers.divide( to_redistribute, Sequences.length( non_redundant ) );
            SubLObject cdolist_list_var2 = non_redundant;
            SubLObject nr = NIL;
            nr = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              cyclifier.rle_set_confidence( nr, Numbers.add( cyclifier.rle_confidence( nr ), addendum ) );
              cdolist_list_var2 = cdolist_list_var2.rest();
              nr = cdolist_list_var2.first();
            }
          }
          lexes = non_redundant;
        }
        Dynamic.sublisp_throw( $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          word_tree.set_word_tree_lexes( self, lexes );
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
      catch_var_for_word_tree_method = Errors.handleThrowable( ccatch_env_var, $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_word_tree_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 16015L)
  public static SubLObject phrase_tree_prune_lexes_method(final SubLObject self, final SubLObject wff_terms)
  {
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym77$YIELD );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      methods.funcall_instance_method_with_1_args( word, $sym135$PRUNE_LEXES, wff_terms );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 16177L)
  public static SubLObject phrase_tree_get_nth_word_method(final SubLObject self, final SubLObject integer)
  {
    final SubLObject yield = methods.funcall_instance_method_with_0_args( self, $sym77$YIELD );
    if( integer.numG( Sequences.length( yield ) ) )
    {
      Errors.warn( $str158$Attempted_to_get_the__A_word__but, integer, Sequences.length( yield ) );
      return NIL;
    }
    return ConsesLow.nth( integer, yield );
  }

  @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 16464L)
  public static SubLObject lex_entry_equalp(final SubLObject lex1, final SubLObject lex2)
  {
    return Equality.equalp( methods.funcall_instance_method_with_1_args( lex1, $sym99$GET, $kw100$SEMTRANS ), methods.funcall_instance_method_with_1_args( lex2, $sym99$GET, $kw100$SEMTRANS ) );
  }

  public static SubLObject declare_parse_tree_gui_file()
  {
    SubLFiles.declareFunction( me, "stop_word_p", "STOP-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "gui_enabled_document_print_function_trampoline", "GUI-ENABLED-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "gui_enabled_document_p", "GUI-ENABLED-DOCUMENT-P", 1, 0, false );
    new $gui_enabled_document_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ged_sentences", "GED-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "ged_parser", "GED-PARSER", 1, 0, false );
    SubLFiles.declareFunction( me, "ged_lexicon", "GED-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ged_sentences", "_CSETF-GED-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ged_parser", "_CSETF-GED-PARSER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ged_lexicon", "_CSETF-GED-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "make_gui_enabled_document", "MAKE-GUI-ENABLED-DOCUMENT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_gui_enabled_document", "VISIT-DEFSTRUCT-GUI-ENABLED-DOCUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_gui_enabled_document_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-DOCUMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_gui_enabled_document", "NEW-GUI-ENABLED-DOCUMENT", 1, 1, false );
    SubLFiles.declareFunction( me, "add_sentence_to_ged", "ADD-SENTENCE-TO-GED", 3, 0, false );
    SubLFiles.declareFunction( me, "ged_sentence_number", "GED-SENTENCE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "gui_enabled_sentence_print_function_trampoline", "GUI-ENABLED-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "gui_enabled_sentence_p", "GUI-ENABLED-SENTENCE-P", 1, 0, false );
    new $gui_enabled_sentence_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ges_surface_string", "GES-SURFACE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "ges_gui_tokens", "GES-GUI-TOKENS", 1, 0, false );
    SubLFiles.declareFunction( me, "ges_full_parse_tree", "GES-FULL-PARSE-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "ges_current_parse_tree", "GES-CURRENT-PARSE-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "ges_token_mapping", "GES-TOKEN-MAPPING", 1, 0, false );
    SubLFiles.declareFunction( me, "ges_parent_document", "GES-PARENT-DOCUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ges_surface_string", "_CSETF-GES-SURFACE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ges_gui_tokens", "_CSETF-GES-GUI-TOKENS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ges_full_parse_tree", "_CSETF-GES-FULL-PARSE-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ges_current_parse_tree", "_CSETF-GES-CURRENT-PARSE-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ges_token_mapping", "_CSETF-GES-TOKEN-MAPPING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ges_parent_document", "_CSETF-GES-PARENT-DOCUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_gui_enabled_sentence", "MAKE-GUI-ENABLED-SENTENCE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_gui_enabled_sentence", "VISIT-DEFSTRUCT-GUI-ENABLED-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_gui_enabled_sentence_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-SENTENCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_gui_enabled_sentence", "NEW-GUI-ENABLED-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "ges_lexicon", "GES-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "pprint_ged", "PPRINT-GED", 1, 2, false );
    SubLFiles.declareFunction( me, "pprint_ges", "PPRINT-GES", 1, 2, false );
    SubLFiles.declareFunction( me, "new_gui_enabled_document_from_stream", "NEW-GUI-ENABLED-DOCUMENT-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "sentencify_remotely", "SENTENCIFY-REMOTELY", 1, 4, false );
    SubLFiles.declareFunction( me, "new_gui_enabled_document_from_file", "NEW-GUI-ENABLED-DOCUMENT-FROM-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_gui_enabled_document_from_string", "NEW-GUI-ENABLED-DOCUMENT-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "gui_enabled_sentence_to_xml", "GUI-ENABLED-SENTENCE-TO-XML", 2, 0, false );
    SubLFiles.declareFunction( me, "ged_to_xml_string", "GED-TO-XML-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_to_xml_method", "WORD-TREE-TO-XML-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_lambda", "REMOVAL-LAMBDA", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ges_annotated_leaves", "GET-GES-ANNOTATED-LEAVES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ged_annotated_tree", "GET-GED-ANNOTATED-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_ges_annotated_tree", "GET-GES-ANNOTATED-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "annotate_parse_tree", "ANNOTATE-PARSE-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "annotate_phrase_tree", "ANNOTATE-PHRASE-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "annotate_word_tree", "ANNOTATE-WORD-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "create_ges_token_mapping", "CREATE-GES-TOKEN-MAPPING", 1, 0, false );
    SubLFiles.declareFunction( me, "ges_word_string", "GES-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "create_token_list", "CREATE-TOKEN-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "nmerge_words", "NMERGE-WORDS", 2, 0, false );
    SubLFiles.declareFunction( me, "add_spaces", "ADD-SPACES", 1, 0, false );
    SubLFiles.declareFunction( me, "reattach_word", "REATTACH-WORD", 2, 1, false );
    SubLFiles.declareFunction( me, "get_ged_annotated_leaves", "GET-GED-ANNOTATED-LEAVES", 2, 0, false );
    SubLFiles.declareFunction( me, "select_sense_for_word", "SELECT-SENSE-FOR-WORD", 4, 0, false );
    SubLFiles.declareFunction( me, "find_word_index_from_path", "FIND-WORD-INDEX-FROM-PATH", 3, 0, false );
    SubLFiles.declareFunction( me, "prune_ges_by_wff_checking", "PRUNE-GES-BY-WFF-CHECKING", 1, 0, false );
    SubLFiles.declareFunction( me, "prune_ged_sentence_by_wff_checking", "PRUNE-GED-SENTENCE-BY-WFF-CHECKING", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclify_ged_sentence", "CYCLIFY-GED-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_naive_wff_self_prune_method", "PARSE-TREE-NAIVE-WFF-SELF-PRUNE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_prune_lexes_method", "WORD-TREE-PRUNE-LEXES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_remove_redundant_lexes_method", "PARSE-TREE-REMOVE-REDUNDANT-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_tree_remove_redundant_lexes_method", "WORD-TREE-REMOVE-REDUNDANT-LEXES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_prune_lexes_method", "PHRASE-TREE-PRUNE-LEXES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_tree_get_nth_word_method", "PHRASE-TREE-GET-NTH-WORD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "lex_entry_equalp", "LEX-ENTRY-EQUALP", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_parse_tree_gui_file()
  {
    $stop_word_categories$ = SubLFiles.defparameter( "*STOP-WORD-CATEGORIES*", $list0 );
    $dtp_gui_enabled_document$ = SubLFiles.defconstant( "*DTP-GUI-ENABLED-DOCUMENT*", $sym1$GUI_ENABLED_DOCUMENT );
    $dtp_gui_enabled_sentence$ = SubLFiles.defconstant( "*DTP-GUI-ENABLED-SENTENCE*", $sym29$GUI_ENABLED_SENTENCE );
    $token_index$ = SubLFiles.defvar( "*TOKEN-INDEX*", ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_parse_tree_gui_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_gui_enabled_document$.getGlobalValue(), Symbols.symbol_function( $sym8$GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$GED_SENTENCES, $sym11$_CSETF_GED_SENTENCES );
    Structures.def_csetf( $sym12$GED_PARSER, $sym13$_CSETF_GED_PARSER );
    Structures.def_csetf( $sym14$GED_LEXICON, $sym15$_CSETF_GED_LEXICON );
    Equality.identity( $sym1$GUI_ENABLED_DOCUMENT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_gui_enabled_document$.getGlobalValue(), Symbols.symbol_function(
        $sym24$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD ) );
    access_macros.register_external_symbol( $sym25$NEW_GUI_ENABLED_DOCUMENT );
    access_macros.register_external_symbol( $sym27$ADD_SENTENCE_TO_GED );
    access_macros.register_external_symbol( $sym28$GED_SENTENCE_NUMBER );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_gui_enabled_sentence$.getGlobalValue(), Symbols.symbol_function( $sym36$GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list37 );
    Structures.def_csetf( $sym38$GES_SURFACE_STRING, $sym39$_CSETF_GES_SURFACE_STRING );
    Structures.def_csetf( $sym40$GES_GUI_TOKENS, $sym41$_CSETF_GES_GUI_TOKENS );
    Structures.def_csetf( $sym42$GES_FULL_PARSE_TREE, $sym43$_CSETF_GES_FULL_PARSE_TREE );
    Structures.def_csetf( $sym44$GES_CURRENT_PARSE_TREE, $sym45$_CSETF_GES_CURRENT_PARSE_TREE );
    Structures.def_csetf( $sym46$GES_TOKEN_MAPPING, $sym47$_CSETF_GES_TOKEN_MAPPING );
    Structures.def_csetf( $sym48$GES_PARENT_DOCUMENT, $sym49$_CSETF_GES_PARENT_DOCUMENT );
    Equality.identity( $sym29$GUI_ENABLED_SENTENCE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_gui_enabled_sentence$.getGlobalValue(), Symbols.symbol_function(
        $sym57$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD ) );
    access_macros.register_external_symbol( $sym58$NEW_GUI_ENABLED_SENTENCE );
    access_macros.define_obsolete_register( $sym66$SENTENCIFY_REMOTELY, $list67 );
    methods.methods_incorporate_instance_method( $sym81$TO_XML, $sym92$WORD_TREE, $list93, $list94, $list95 );
    methods.subloop_register_instance_method( $sym92$WORD_TREE, $sym81$TO_XML, $sym104$WORD_TREE_TO_XML_METHOD );
    access_macros.register_external_symbol( $sym105$GET_GES_ANNOTATED_LEAVES );
    access_macros.register_external_symbol( $sym110$GET_GED_ANNOTATED_TREE );
    access_macros.register_external_symbol( $sym111$GET_GES_ANNOTATED_TREE );
    access_macros.register_external_symbol( $sym122$GET_GED_ANNOTATED_LEAVES );
    access_macros.register_external_symbol( $sym123$SELECT_SENSE_FOR_WORD );
    access_macros.register_external_symbol( $sym127$FIND_WORD_INDEX_FROM_PATH );
    access_macros.register_external_symbol( $sym128$PRUNE_GES_BY_WFF_CHECKING );
    access_macros.register_external_symbol( $sym131$PRUNE_GED_SENTENCE_BY_WFF_CHECKING );
    access_macros.register_external_symbol( $sym132$CYCLIFY_GED_SENTENCE );
    methods.methods_incorporate_instance_method( $sym129$NAIVE_WFF_SELF_PRUNE, $sym133$PARSE_TREE, $list93, NIL, $list134 );
    methods.subloop_register_instance_method( $sym133$PARSE_TREE, $sym129$NAIVE_WFF_SELF_PRUNE, $sym136$PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD );
    methods.methods_incorporate_instance_method( $sym135$PRUNE_LEXES, $sym92$WORD_TREE, $list93, $list137, $list138 );
    methods.subloop_register_instance_method( $sym92$WORD_TREE, $sym135$PRUNE_LEXES, $sym140$WORD_TREE_PRUNE_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym62$REMOVE_REDUNDANT_LEXES, $sym133$PARSE_TREE, $list141, NIL, $list142 );
    methods.subloop_register_instance_method( $sym133$PARSE_TREE, $sym62$REMOVE_REDUNDANT_LEXES, $sym146$PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym62$REMOVE_REDUNDANT_LEXES, $sym92$WORD_TREE, $list141, NIL, $list147 );
    methods.subloop_register_instance_method( $sym92$WORD_TREE, $sym62$REMOVE_REDUNDANT_LEXES, $sym152$WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym135$PRUNE_LEXES, $sym153$PHRASE_TREE, $list93, $list137, $list154 );
    methods.subloop_register_instance_method( $sym153$PHRASE_TREE, $sym135$PRUNE_LEXES, $sym155$PHRASE_TREE_PRUNE_LEXES_METHOD );
    methods.methods_incorporate_instance_method( $sym124$GET_NTH_WORD, $sym153$PHRASE_TREE, $list93, $list156, $list157 );
    methods.subloop_register_instance_method( $sym153$PHRASE_TREE, $sym124$GET_NTH_WORD, $sym159$PHRASE_TREE_GET_NTH_WORD_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parse_tree_gui_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parse_tree_gui_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parse_tree_gui_file();
  }
  static
  {
    me = new parse_tree_gui();
    $stop_word_categories$ = null;
    $dtp_gui_enabled_document$ = null;
    $dtp_gui_enabled_sentence$ = null;
    $token_index$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { makeKeyword( "DT" ), makeKeyword( "CC" ), makeKeyword( "PRP" ), makeKeyword( "." ), makeKeyword( "," ), makeKeyword( ":" ), makeKeyword( "''" ), makeKeyword( "``" ),
      makeKeyword( "'" ), makeKeyword( "`" ), makeKeyword( "(" ), makeKeyword( ")" ), makeKeyword( "-LRB-" ), makeKeyword( "-RRB-" ), makeKeyword( "LS" )
    } );
    $sym1$GUI_ENABLED_DOCUMENT = makeSymbol( "GUI-ENABLED-DOCUMENT" );
    $sym2$GUI_ENABLED_DOCUMENT_P = makeSymbol( "GUI-ENABLED-DOCUMENT-P" );
    $list3 = ConsesLow.list( makeSymbol( "SENTENCES" ), makeSymbol( "PARSER" ), makeSymbol( "LEXICON" ) );
    $list4 = ConsesLow.list( makeKeyword( "SENTENCES" ), makeKeyword( "PARSER" ), makeKeyword( "LEXICON" ) );
    $list5 = ConsesLow.list( makeSymbol( "GED-SENTENCES" ), makeSymbol( "GED-PARSER" ), makeSymbol( "GED-LEXICON" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-GED-SENTENCES" ), makeSymbol( "_CSETF-GED-PARSER" ), makeSymbol( "_CSETF-GED-LEXICON" ) );
    $sym7$PPRINT_GED = makeSymbol( "PPRINT-GED" );
    $sym8$GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "GUI-ENABLED-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "GUI-ENABLED-DOCUMENT-P" ) );
    $sym10$GED_SENTENCES = makeSymbol( "GED-SENTENCES" );
    $sym11$_CSETF_GED_SENTENCES = makeSymbol( "_CSETF-GED-SENTENCES" );
    $sym12$GED_PARSER = makeSymbol( "GED-PARSER" );
    $sym13$_CSETF_GED_PARSER = makeSymbol( "_CSETF-GED-PARSER" );
    $sym14$GED_LEXICON = makeSymbol( "GED-LEXICON" );
    $sym15$_CSETF_GED_LEXICON = makeSymbol( "_CSETF-GED-LEXICON" );
    $kw16$SENTENCES = makeKeyword( "SENTENCES" );
    $kw17$PARSER = makeKeyword( "PARSER" );
    $kw18$LEXICON = makeKeyword( "LEXICON" );
    $str19$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw20$BEGIN = makeKeyword( "BEGIN" );
    $sym21$MAKE_GUI_ENABLED_DOCUMENT = makeSymbol( "MAKE-GUI-ENABLED-DOCUMENT" );
    $kw22$SLOT = makeKeyword( "SLOT" );
    $kw23$END = makeKeyword( "END" );
    $sym24$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-DOCUMENT-METHOD" );
    $sym25$NEW_GUI_ENABLED_DOCUMENT = makeSymbol( "NEW-GUI-ENABLED-DOCUMENT" );
    $sym26$CYCLIFIER_LEXICON = makeSymbol( "CYCLIFIER-LEXICON" );
    $sym27$ADD_SENTENCE_TO_GED = makeSymbol( "ADD-SENTENCE-TO-GED" );
    $sym28$GED_SENTENCE_NUMBER = makeSymbol( "GED-SENTENCE-NUMBER" );
    $sym29$GUI_ENABLED_SENTENCE = makeSymbol( "GUI-ENABLED-SENTENCE" );
    $sym30$GUI_ENABLED_SENTENCE_P = makeSymbol( "GUI-ENABLED-SENTENCE-P" );
    $list31 = ConsesLow.list( makeSymbol( "SURFACE-STRING" ), makeSymbol( "GUI-TOKENS" ), makeSymbol( "FULL-PARSE-TREE" ), makeSymbol( "CURRENT-PARSE-TREE" ), makeSymbol( "TOKEN-MAPPING" ), makeSymbol(
        "PARENT-DOCUMENT" ) );
    $list32 = ConsesLow.list( makeKeyword( "SURFACE-STRING" ), makeKeyword( "GUI-TOKENS" ), makeKeyword( "FULL-PARSE-TREE" ), makeKeyword( "CURRENT-PARSE-TREE" ), makeKeyword( "TOKEN-MAPPING" ), makeKeyword(
        "PARENT-DOCUMENT" ) );
    $list33 = ConsesLow.list( makeSymbol( "GES-SURFACE-STRING" ), makeSymbol( "GES-GUI-TOKENS" ), makeSymbol( "GES-FULL-PARSE-TREE" ), makeSymbol( "GES-CURRENT-PARSE-TREE" ), makeSymbol( "GES-TOKEN-MAPPING" ),
        makeSymbol( "GES-PARENT-DOCUMENT" ) );
    $list34 = ConsesLow.list( makeSymbol( "_CSETF-GES-SURFACE-STRING" ), makeSymbol( "_CSETF-GES-GUI-TOKENS" ), makeSymbol( "_CSETF-GES-FULL-PARSE-TREE" ), makeSymbol( "_CSETF-GES-CURRENT-PARSE-TREE" ), makeSymbol(
        "_CSETF-GES-TOKEN-MAPPING" ), makeSymbol( "_CSETF-GES-PARENT-DOCUMENT" ) );
    $sym35$PPRINT_GES = makeSymbol( "PPRINT-GES" );
    $sym36$GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "GUI-ENABLED-SENTENCE-PRINT-FUNCTION-TRAMPOLINE" );
    $list37 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "GUI-ENABLED-SENTENCE-P" ) );
    $sym38$GES_SURFACE_STRING = makeSymbol( "GES-SURFACE-STRING" );
    $sym39$_CSETF_GES_SURFACE_STRING = makeSymbol( "_CSETF-GES-SURFACE-STRING" );
    $sym40$GES_GUI_TOKENS = makeSymbol( "GES-GUI-TOKENS" );
    $sym41$_CSETF_GES_GUI_TOKENS = makeSymbol( "_CSETF-GES-GUI-TOKENS" );
    $sym42$GES_FULL_PARSE_TREE = makeSymbol( "GES-FULL-PARSE-TREE" );
    $sym43$_CSETF_GES_FULL_PARSE_TREE = makeSymbol( "_CSETF-GES-FULL-PARSE-TREE" );
    $sym44$GES_CURRENT_PARSE_TREE = makeSymbol( "GES-CURRENT-PARSE-TREE" );
    $sym45$_CSETF_GES_CURRENT_PARSE_TREE = makeSymbol( "_CSETF-GES-CURRENT-PARSE-TREE" );
    $sym46$GES_TOKEN_MAPPING = makeSymbol( "GES-TOKEN-MAPPING" );
    $sym47$_CSETF_GES_TOKEN_MAPPING = makeSymbol( "_CSETF-GES-TOKEN-MAPPING" );
    $sym48$GES_PARENT_DOCUMENT = makeSymbol( "GES-PARENT-DOCUMENT" );
    $sym49$_CSETF_GES_PARENT_DOCUMENT = makeSymbol( "_CSETF-GES-PARENT-DOCUMENT" );
    $kw50$SURFACE_STRING = makeKeyword( "SURFACE-STRING" );
    $kw51$GUI_TOKENS = makeKeyword( "GUI-TOKENS" );
    $kw52$FULL_PARSE_TREE = makeKeyword( "FULL-PARSE-TREE" );
    $kw53$CURRENT_PARSE_TREE = makeKeyword( "CURRENT-PARSE-TREE" );
    $kw54$TOKEN_MAPPING = makeKeyword( "TOKEN-MAPPING" );
    $kw55$PARENT_DOCUMENT = makeKeyword( "PARENT-DOCUMENT" );
    $sym56$MAKE_GUI_ENABLED_SENTENCE = makeSymbol( "MAKE-GUI-ENABLED-SENTENCE" );
    $sym57$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-SENTENCE-METHOD" );
    $sym58$NEW_GUI_ENABLED_SENTENCE = makeSymbol( "NEW-GUI-ENABLED-SENTENCE" );
    $sym59$PARSE = makeSymbol( "PARSE" );
    $sym60$LEARN = makeSymbol( "LEARN" );
    $sym61$LEXIFY = makeSymbol( "LEXIFY" );
    $sym62$REMOVE_REDUNDANT_LEXES = makeSymbol( "REMOVE-REDUNDANT-LEXES" );
    $str63$__GED___S_sentences_ = makeString( "#<GED: ~S sentences>" );
    $str64$___ = makeString( "..." );
    $str65$__GES___S_ = makeString( "#<GES: ~S>" );
    $sym66$SENTENCIFY_REMOTELY = makeSymbol( "SENTENCIFY-REMOTELY" );
    $list67 = ConsesLow.list( makeSymbol( "SENTENCIFY-STRING" ) );
    $str68$_sentencify_cgi = makeString( "/sentencify.cgi" );
    $kw69$POST = makeKeyword( "POST" );
    $str70$_ = makeString( "'" );
    $str71$_ = makeString( "\"" );
    $str72$string = makeString( "string" );
    $kw73$INPUT = makeKeyword( "INPUT" );
    $str74$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym75$START_TAG = makeSymbol( "START-TAG" );
    $str76$sentence = makeString( "sentence" );
    $sym77$YIELD = makeSymbol( "YIELD" );
    $sym78$CYCLIFY = makeSymbol( "CYCLIFY" );
    $list79 = ConsesLow.list( makeKeyword( "LEXICON" ), NIL );
    $str80$tokens = makeString( "tokens" );
    $sym81$TO_XML = makeSymbol( "TO-XML" );
    $sym82$END_TAG = makeSymbol( "END-TAG" );
    $str83$parses = makeString( "parses" );
    $sym84$OUTSTREAM = makeSymbol( "OUTSTREAM" );
    $sym85$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str86$___S = makeString( "~%~S" );
    $sym87$XML_WRITER = makeSymbol( "XML-WRITER" );
    $sym88$SET_STREAM = makeSymbol( "SET-STREAM" );
    $str89$cycl_annotated_document = makeString( "cycl-annotated-document" );
    $sym90$FLUSH = makeSymbol( "FLUSH" );
    $sym91$CLOSE = makeSymbol( "CLOSE" );
    $sym92$WORD_TREE = makeSymbol( "WORD-TREE" );
    $list93 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list94 = ConsesLow.list( makeSymbol( "XML-WRITER" ) );
    $list95 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*XML-STREAM*" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "XML-WRITER" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "OUTSTREAM" ) ) ) ), ConsesLow.list( makeSymbol( "ATTRIBUTES" ), ConsesLow.list( makeSymbol( "LIST" ), makeString( "pos" ), makeSymbol( "CATEGORY" ), makeString( "token" ),
            makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEXEME" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SEMTRANS" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "LEXEME" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ), makeSymbol( "TERM" ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                        ConsesLow.list( makeSymbol( "CONSP" ), makeSymbol( "SEMTRANS" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "MEMBER?" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol(
                            "SEMTRANS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                                makeString( "equals" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "THIRD" ), makeSymbol( "SEMTRANS" ) ) ), ConsesLow.list(
                                    makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "CLAUSE" ), makeSymbol( "SEMTRANS" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                        "LISTP" ), makeSymbol( "CLAUSE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list(
                                            makeSymbol( "FIRST" ), makeSymbol( "CLAUSE" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "THIRD" ), makeSymbol(
                                                "CLAUSE" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FORT-P" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                    makeSymbol( "TERM" ), makeSymbol( "CYCLS" ) ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                        "START-TAG" ) ), makeString( "token" ), makeSymbol( "ATTRIBUTES" ), NIL, T ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CYCL" ),
                                                            makeSymbol( "CYCLS" ) ), ConsesLow.list( makeSymbol( "CYCML-SERIALIZE-OBJECT" ), makeSymbol( "CYCL" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                "XML-WRITER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "END-TAG" ) ), makeString( "token" ), NIL, T ) ) );
    $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $str97$pos = makeString( "pos" );
    $str98$token = makeString( "token" );
    $sym99$GET = makeSymbol( "GET" );
    $kw100$SEMTRANS = makeKeyword( "SEMTRANS" );
    $list101 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ) );
    $const102$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym103$GET_LEXES = makeSymbol( "GET-LEXES" );
    $sym104$WORD_TREE_TO_XML_METHOD = makeSymbol( "WORD-TREE-TO-XML-METHOD" );
    $sym105$GET_GES_ANNOTATED_LEAVES = makeSymbol( "GET-GES-ANNOTATED-LEAVES" );
    $sym106$CAR = makeSymbol( "CAR" );
    $sym107$REMOVAL_LAMBDA = makeSymbol( "REMOVAL-LAMBDA" );
    $sym108$CDR = makeSymbol( "CDR" );
    $sym109$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $sym110$GET_GED_ANNOTATED_TREE = makeSymbol( "GET-GED-ANNOTATED-TREE" );
    $sym111$GET_GES_ANNOTATED_TREE = makeSymbol( "GET-GES-ANNOTATED-TREE" );
    $kw112$PHRASE_TREE = makeKeyword( "PHRASE-TREE" );
    $sym113$GET_STRING = makeSymbol( "GET-STRING" );
    $sym114$GET_PATH = makeSymbol( "GET-PATH" );
    $kw115$WORD_TREE = makeKeyword( "WORD-TREE" );
    $sym116$GES_WORD_STRING = makeSymbol( "GES-WORD-STRING" );
    $sym117$EMPTY_STRING_P = makeSymbol( "EMPTY-STRING-P" );
    $sym118$TRIM_WHITESPACE = makeSymbol( "TRIM-WHITESPACE" );
    $str119$ = makeString( "" );
    $str120$_ = makeString( " " );
    $sym121$SUBSTRING_ = makeSymbol( "SUBSTRING?" );
    $sym122$GET_GED_ANNOTATED_LEAVES = makeSymbol( "GET-GED-ANNOTATED-LEAVES" );
    $sym123$SELECT_SENSE_FOR_WORD = makeSymbol( "SELECT-SENSE-FOR-WORD" );
    $sym124$GET_NTH_WORD = makeSymbol( "GET-NTH-WORD" );
    $str125$Attempted_to_set_sense__A__but_on = makeString( "Attempted to set sense ~A, but only ~A lexes" );
    $sym126$LEXES = makeSymbol( "LEXES" );
    $sym127$FIND_WORD_INDEX_FROM_PATH = makeSymbol( "FIND-WORD-INDEX-FROM-PATH" );
    $sym128$PRUNE_GES_BY_WFF_CHECKING = makeSymbol( "PRUNE-GES-BY-WFF-CHECKING" );
    $sym129$NAIVE_WFF_SELF_PRUNE = makeSymbol( "NAIVE-WFF-SELF-PRUNE" );
    $sym130$LEX_ENTRY_EQUALP = makeSymbol( "LEX-ENTRY-EQUALP" );
    $sym131$PRUNE_GED_SENTENCE_BY_WFF_CHECKING = makeSymbol( "PRUNE-GED-SENTENCE-BY-WFF-CHECKING" );
    $sym132$CYCLIFY_GED_SENTENCE = makeSymbol( "CYCLIFY-GED-SENTENCE" );
    $sym133$PARSE_TREE = makeSymbol( "PARSE-TREE" );
    $list134 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PARSES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "CYCLIFY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "LEXICON" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "WFF-TERMS" ), NIL ) ), ConsesLow.list( makeSymbol(
            "CDOLIST" ), ConsesLow.list( makeSymbol( "PARSE" ), makeSymbol( "PARSES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TERMS" ), ConsesLow.list( makeSymbol(
                "FLATTEN" ), makeSymbol( "PARSE" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TERMS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                    makeSymbol( "FORT-P" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "TERM" ), makeSymbol( "WFF-TERMS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                        "WFF-TERMS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRUNE-LEXES" ) ), makeSymbol( "WFF-TERMS" ) ) ), ConsesLow.list(
                            makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym135$PRUNE_LEXES = makeSymbol( "PRUNE-LEXES" );
    $sym136$PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD = makeSymbol( "PARSE-TREE-NAIVE-WFF-SELF-PRUNE-METHOD" );
    $list137 = ConsesLow.list( makeSymbol( "WFF-TERMS" ) );
    $list138 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ACCEPTED" ), NIL ), ConsesLow.list( makeSymbol( "REJECTED" ), NIL ), ConsesLow.list( makeSymbol(
        "TO-REDISTRIBUTE" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
            makeSymbol( "SEMTRANS-TERMS" ), ConsesLow.list( makeSymbol( "FLATTEN" ), ConsesLow.list( makeSymbol( "EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol(
                "RLE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INTERSECTION" ), makeSymbol( "SEMTRANS-TERMS" ), makeSymbol( "WFF-TERMS" ) ), ConsesLow.list(
                    makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "ACCEPTED" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol( "REJECTED" ) ), ConsesLow.list(
                        makeSymbol( "CINC" ), makeSymbol( "TO-REDISTRIBUTE" ), ConsesLow.list( makeSymbol( "RLE-CONFIDENCE" ), makeSymbol( "RLE" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list(
                            makeSymbol( "NULL" ), makeSymbol( "ACCEPTED" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ADDENDUM" ), ConsesLow.list( makeSymbol( "/" ), makeSymbol(
                                "TO-REDISTRIBUTE" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "ACCEPTED" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "A" ), makeSymbol(
                                    "ACCEPTED" ) ), ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "A" ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "RLE-CONFIDENCE" ), makeSymbol(
                                        "A" ) ), makeSymbol( "ADDENDUM" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "ACCEPTED" ) ), ConsesLow.list( makeSymbol( "RET" ),
                                            makeSymbol( "REJECTED" ) ) ) );
    $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $sym140$WORD_TREE_PRUNE_LEXES_METHOD = makeSymbol( "WORD-TREE-PRUNE-LEXES-METHOD" );
    $list141 = ConsesLow.list( makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) );
    $list142 = ConsesLow.list( ConsesLow.list( makeSymbol( "DO-PARSE-TREE-SUBTREES" ), ConsesLow.list( makeSymbol( "DAUGHTER" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
        "WORD-TREE-P" ), makeSymbol( "DAUGHTER" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "DAUGHTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REMOVE-REDUNDANT-LEXES" ) ) ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $kw143$DFR2L = makeKeyword( "DFR2L" );
    $kw144$DFL2R = makeKeyword( "DFL2R" );
    $str145$_S_is_not_one_of__S = makeString( "~S is not one of ~S" );
    $sym146$PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD = makeSymbol( "PARSE-TREE-REMOVE-REDUNDANT-LEXES-METHOD" );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeKeyword( "TO" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-CATEGORY" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MOTHER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "GET-MOTHER" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeKeyword( "VP" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOTHER" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ), NIL ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "NON-REDUNDANT" ), NIL ), ConsesLow.list( makeSymbol( "TO-REDISTRIBUTE" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "RLE" ), makeSymbol(
                        "LEXES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SEMTRANS" ), ConsesLow.list( makeSymbol( "HL-TO-EL" ), ConsesLow.list( makeSymbol( "FIM" ),
                            ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "RLE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ) ), makeSymbol( "FAIL" ) ), ConsesLow
                                .list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "OLD-RLE" ), makeSymbol( "NON-REDUNDANT" ), makeSymbol( "FAIL" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                    ConsesLow.list( makeSymbol( "OLD-SEMTRANS" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "RLE-LEX" ), makeSymbol( "OLD-RLE" ) ), ConsesLow.list( makeSymbol(
                                        "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "SEMTRANS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FAIL" ), ConsesLow.list( EQUALP, makeSymbol( "SEMTRANS" ),
                                            makeSymbol( "OLD-SEMTRANS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "FAIL" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "RLE" ), makeSymbol(
                                                "NON-REDUNDANT" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NON-REDUNDANT" ) ), ConsesLow.list( makeSymbol(
                                                    "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ADDENDUM" ), ConsesLow.list( makeSymbol( "/" ), makeSymbol( "TO-REDISTRIBUTE" ), ConsesLow.list( makeSymbol(
                                                        "LENGTH" ), makeSymbol( "NON-REDUNDANT" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "NR" ), makeSymbol( "NON-REDUNDANT" ) ),
                                                            ConsesLow.list( makeSymbol( "RLE-SET-CONFIDENCE" ), makeSymbol( "NR" ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "RLE-CONFIDENCE" ),
                                                                makeSymbol( "NR" ) ), makeSymbol( "ADDENDUM" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXES" ), makeSymbol( "NON-REDUNDANT" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WORD-TREE-METHOD" );
    $kw149$TO = makeKeyword( "TO" );
    $sym150$GET_MOTHER = makeSymbol( "GET-MOTHER" );
    $kw151$VP = makeKeyword( "VP" );
    $sym152$WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD = makeSymbol( "WORD-TREE-REMOVE-REDUNDANT-LEXES-METHOD" );
    $sym153$PHRASE_TREE = makeSymbol( "PHRASE-TREE" );
    $list154 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "YIELD" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRUNE-LEXES" ) ), makeSymbol( "WFF-TERMS" ) ) ), ConsesLow.list( makeSymbol(
            "RET" ), makeSymbol( "SELF" ) ) );
    $sym155$PHRASE_TREE_PRUNE_LEXES_METHOD = makeSymbol( "PHRASE-TREE-PRUNE-LEXES-METHOD" );
    $list156 = ConsesLow.list( makeSymbol( "INTEGER" ) );
    $list157 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "YIELD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "YIELD" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "INTEGER" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "YIELD" ) ) ),
            ConsesLow.list( makeSymbol( "WARN" ), makeString( "Attempted to get the ~A word, but there are only ~A words." ), makeSymbol( "INTEGER" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "YIELD" ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NTH" ), makeSymbol( "INTEGER" ), makeSymbol( "YIELD" ) ) ) ) );
    $str158$Attempted_to_get_the__A_word__but = makeString( "Attempted to get the ~A word, but there are only ~A words." );
    $sym159$PHRASE_TREE_GET_NTH_WORD_METHOD = makeSymbol( "PHRASE-TREE-GET-NTH-WORD-METHOD" );
  }

  public static final class $gui_enabled_document_native
      extends
        SubLStructNative
  {
    public SubLObject $sentences;
    public SubLObject $parser;
    public SubLObject $lexicon;
    private static final SubLStructDeclNative structDecl;

    public $gui_enabled_document_native()
    {
      this.$sentences = CommonSymbols.NIL;
      this.$parser = CommonSymbols.NIL;
      this.$lexicon = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $gui_enabled_document_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sentences;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$parser;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lexicon;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sentences = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$parser = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lexicon = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $gui_enabled_document_native.class, $sym1$GUI_ENABLED_DOCUMENT, $sym2$GUI_ENABLED_DOCUMENT_P, $list3, $list4, new String[] { "$sentences", "$parser", "$lexicon"
      }, $list5, $list6, $sym7$PPRINT_GED );
    }
  }

  public static final class $gui_enabled_document_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $gui_enabled_document_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GUI-ENABLED-DOCUMENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return gui_enabled_document_p( arg1 );
    }
  }

  public static final class $gui_enabled_sentence_native
      extends
        SubLStructNative
  {
    public SubLObject $surface_string;
    public SubLObject $gui_tokens;
    public SubLObject $full_parse_tree;
    public SubLObject $current_parse_tree;
    public SubLObject $token_mapping;
    public SubLObject $parent_document;
    private static final SubLStructDeclNative structDecl;

    public $gui_enabled_sentence_native()
    {
      this.$surface_string = CommonSymbols.NIL;
      this.$gui_tokens = CommonSymbols.NIL;
      this.$full_parse_tree = CommonSymbols.NIL;
      this.$current_parse_tree = CommonSymbols.NIL;
      this.$token_mapping = CommonSymbols.NIL;
      this.$parent_document = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $gui_enabled_sentence_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$surface_string;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$gui_tokens;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$full_parse_tree;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$current_parse_tree;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$token_mapping;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$parent_document;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$surface_string = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$gui_tokens = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$full_parse_tree = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$current_parse_tree = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$token_mapping = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$parent_document = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $gui_enabled_sentence_native.class, $sym29$GUI_ENABLED_SENTENCE, $sym30$GUI_ENABLED_SENTENCE_P, $list31, $list32, new String[] { "$surface_string", "$gui_tokens",
        "$full_parse_tree", "$current_parse_tree", "$token_mapping", "$parent_document"
      }, $list33, $list34, $sym35$PPRINT_GES );
    }
  }

  public static final class $gui_enabled_sentence_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $gui_enabled_sentence_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GUI-ENABLED-SENTENCE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return gui_enabled_sentence_p( arg1 );
    }
  }
}
/*
 *
 * Total time: 529 ms
 *
 */