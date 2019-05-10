package com.cyc.cycjava.cycl.rtp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.rkf_text_processors;
import com.cyc.cycjava.cycl.rkf_formula_optimizer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_iterators
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_iterators";
  public static final String myFingerPrint = "4775715ee1182f9b7818218cd244b5c984c02da7195afa9511c15b5a43c1602a";
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLSymbol $dtp_itp_result_iterator$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLSymbol $dtp_itp_section_iterator$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLSymbol $dtp_itp_child_iterator$;
  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLSymbol $dtp_rtp_iterator$;
  private static final SubLSymbol $sym0$ITP_RESULT_ITERATOR;
  private static final SubLSymbol $sym1$ITP_RESULT_ITERATOR_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$ITP_RESULT_ITERATOR_STYLE;
  private static final SubLSymbol $sym10$_CSETF_ITP_RESULT_ITERATOR_STYLE;
  private static final SubLSymbol $sym11$ITP_RESULT_ITERATOR_PARSES;
  private static final SubLSymbol $sym12$_CSETF_ITP_RESULT_ITERATOR_PARSES;
  private static final SubLSymbol $sym13$ITP_RESULT_ITERATOR_SPAN;
  private static final SubLSymbol $sym14$_CSETF_ITP_RESULT_ITERATOR_SPAN;
  private static final SubLSymbol $sym15$ITP_RESULT_ITERATOR_SECTION_ITERATOR;
  private static final SubLSymbol $sym16$_CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR;
  private static final SubLSymbol $kw17$STYLE;
  private static final SubLSymbol $kw18$PARSES;
  private static final SubLSymbol $kw19$SPAN;
  private static final SubLSymbol $kw20$SECTION_ITERATOR;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_ITP_RESULT_ITERATOR;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD;
  private static final SubLSymbol $sym27$ITP_SECTION_ITERATOR;
  private static final SubLSymbol $sym28$ITP_SECTION_ITERATOR_P;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$ITP_PRINT_SECTION_ITERATOR;
  private static final SubLSymbol $sym34$ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$ITP_SECTION_ITERATOR_PARENT;
  private static final SubLSymbol $sym37$_CSETF_ITP_SECTION_ITERATOR_PARENT;
  private static final SubLSymbol $sym38$ITP_SECTION_ITERATOR_SPAN;
  private static final SubLSymbol $sym39$_CSETF_ITP_SECTION_ITERATOR_SPAN;
  private static final SubLSymbol $sym40$ITP_SECTION_ITERATOR_SECTION;
  private static final SubLSymbol $sym41$_CSETF_ITP_SECTION_ITERATOR_SECTION;
  private static final SubLSymbol $sym42$ITP_SECTION_ITERATOR_CURRENT;
  private static final SubLSymbol $sym43$_CSETF_ITP_SECTION_ITERATOR_CURRENT;
  private static final SubLSymbol $kw44$PARENT;
  private static final SubLSymbol $kw45$SECTION;
  private static final SubLSymbol $kw46$CURRENT;
  private static final SubLSymbol $sym47$MAKE_ITP_SECTION_ITERATOR;
  private static final SubLSymbol $sym48$VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD;
  private static final SubLString $str49$_ITP_SECTION___S_;
  private static final SubLSymbol $sym50$ITP_CHILD_ITERATOR;
  private static final SubLSymbol $sym51$ITP_CHILD_ITERATOR_P;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$ITP_PRINT_CHILD_ITERATOR;
  private static final SubLSymbol $sym57$ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$ITP_CHILD_ITERATOR_PARENT;
  private static final SubLSymbol $sym60$_CSETF_ITP_CHILD_ITERATOR_PARENT;
  private static final SubLSymbol $sym61$ITP_CHILD_ITERATOR_ROP_FORMULA;
  private static final SubLSymbol $sym62$_CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA;
  private static final SubLSymbol $sym63$ITP_CHILD_ITERATOR_SECTION;
  private static final SubLSymbol $sym64$_CSETF_ITP_CHILD_ITERATOR_SECTION;
  private static final SubLSymbol $kw65$ROP_FORMULA;
  private static final SubLSymbol $sym66$MAKE_ITP_CHILD_ITERATOR;
  private static final SubLSymbol $sym67$VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD;
  private static final SubLString $str68$_ITP_CHILD___S_;
  private static final SubLSymbol $kw69$SIMPLE;
  private static final SubLSymbol $sym70$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const71$EverythingPSC;
  private static final SubLSymbol $kw72$RANKED;
  private static final SubLSymbol $kw73$ASSERTION;
  private static final SubLSymbol $kw74$UNAVAILABLE;
  private static final SubLSymbol $sym75$RTP_ITERATOR;
  private static final SubLSymbol $sym76$RTP_ITERATOR_P;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$RTP_ITERATOR_STRING;
  private static final SubLSymbol $sym84$_CSETF_RTP_ITERATOR_STRING;
  private static final SubLSymbol $sym85$RTP_ITERATOR_PARSING_MT;
  private static final SubLSymbol $sym86$_CSETF_RTP_ITERATOR_PARSING_MT;
  private static final SubLSymbol $sym87$RTP_ITERATOR_SEMANTIC_MT;
  private static final SubLSymbol $sym88$_CSETF_RTP_ITERATOR_SEMANTIC_MT;
  private static final SubLSymbol $sym89$RTP_ITERATOR_STRENGTHEN_;
  private static final SubLSymbol $sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_;
  private static final SubLSymbol $sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_;
  private static final SubLSymbol $sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_;
  private static final SubLSymbol $sym93$RTP_ITERATOR_WFF_CHECK_;
  private static final SubLSymbol $sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_;
  private static final SubLSymbol $sym95$RTP_ITERATOR_FORCE;
  private static final SubLSymbol $sym96$_CSETF_RTP_ITERATOR_FORCE;
  private static final SubLSymbol $sym97$RTP_ITERATOR_RAW_PARSES;
  private static final SubLSymbol $sym98$_CSETF_RTP_ITERATOR_RAW_PARSES;
  private static final SubLSymbol $sym99$RTP_ITERATOR_RESULT_QUEUE;
  private static final SubLSymbol $sym100$_CSETF_RTP_ITERATOR_RESULT_QUEUE;
  private static final SubLSymbol $sym101$RTP_ITERATOR_INITIALIZED;
  private static final SubLSymbol $sym102$_CSETF_RTP_ITERATOR_INITIALIZED;
  private static final SubLSymbol $sym103$RTP_ITERATOR_TEMPLATE_CATEGORY;
  private static final SubLSymbol $sym104$_CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY;
  private static final SubLSymbol $sym105$RTP_ITERATOR_MEMOIZATION_STATE;
  private static final SubLSymbol $sym106$_CSETF_RTP_ITERATOR_MEMOIZATION_STATE;
  private static final SubLSymbol $sym107$RTP_ITERATOR_SBHL_RESOURCE;
  private static final SubLSymbol $sym108$_CSETF_RTP_ITERATOR_SBHL_RESOURCE;
  private static final SubLSymbol $kw109$STRING;
  private static final SubLSymbol $kw110$PARSING_MT;
  private static final SubLSymbol $kw111$SEMANTIC_MT;
  private static final SubLSymbol $kw112$STRENGTHEN_;
  private static final SubLSymbol $kw113$MULTIPLE_QUANTIFICATIONS_;
  private static final SubLSymbol $kw114$WFF_CHECK_;
  private static final SubLSymbol $kw115$FORCE;
  private static final SubLSymbol $kw116$RAW_PARSES;
  private static final SubLSymbol $kw117$RESULT_QUEUE;
  private static final SubLSymbol $kw118$INITIALIZED;
  private static final SubLSymbol $kw119$TEMPLATE_CATEGORY;
  private static final SubLSymbol $kw120$MEMOIZATION_STATE;
  private static final SubLSymbol $kw121$SBHL_RESOURCE;
  private static final SubLSymbol $sym122$MAKE_RTP_ITERATOR;
  private static final SubLSymbol $sym123$VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD;
  private static final SubLSymbol $sym124$RTP_ITERATOR_DONE;
  private static final SubLSymbol $sym125$RTP_ITERATOR_NEXT;
  private static final SubLObject $const126$RKFParsingMt;
  private static final SubLSymbol $kw127$DECLARATIVE;
  private static final SubLObject $const128$STemplate;
  private static final SubLSymbol $kw129$QUERY;
  private static final SubLObject $const130$QuestionTemplate;
  private static final SubLSymbol $kw131$QUESTION;
  private static final SubLSymbol $sym132$EL_WFF_;
  private static final SubLSymbol $kw133$FAILURE;

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject itp_result_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject itp_result_iterator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $itp_result_iterator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject itp_result_iterator_style(final SubLObject v_object)
  {
    assert NIL != itp_result_iterator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject itp_result_iterator_parses(final SubLObject v_object)
  {
    assert NIL != itp_result_iterator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject itp_result_iterator_span(final SubLObject v_object)
  {
    assert NIL != itp_result_iterator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject itp_result_iterator_section_iterator(final SubLObject v_object)
  {
    assert NIL != itp_result_iterator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject _csetf_itp_result_iterator_style(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_result_iterator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject _csetf_itp_result_iterator_parses(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_result_iterator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject _csetf_itp_result_iterator_span(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_result_iterator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject _csetf_itp_result_iterator_section_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_result_iterator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject make_itp_result_iterator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $itp_result_iterator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$STYLE ) )
      {
        _csetf_itp_result_iterator_style( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$PARSES ) )
      {
        _csetf_itp_result_iterator_parses( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$SPAN ) )
      {
        _csetf_itp_result_iterator_span( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$SECTION_ITERATOR ) )
      {
        _csetf_itp_result_iterator_section_iterator( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject visit_defstruct_itp_result_iterator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_ITP_RESULT_ITERATOR, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$STYLE, itp_result_iterator_style( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$PARSES, itp_result_iterator_parses( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$SPAN, itp_result_iterator_span( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$SECTION_ITERATOR, itp_result_iterator_section_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_ITP_RESULT_ITERATOR, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
  public static SubLObject visit_defstruct_object_itp_result_iterator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_itp_result_iterator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject itp_section_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    itp_print_section_iterator( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject itp_section_iterator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $itp_section_iterator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject itp_section_iterator_parent(final SubLObject v_object)
  {
    assert NIL != itp_section_iterator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject itp_section_iterator_span(final SubLObject v_object)
  {
    assert NIL != itp_section_iterator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject itp_section_iterator_section(final SubLObject v_object)
  {
    assert NIL != itp_section_iterator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject itp_section_iterator_current(final SubLObject v_object)
  {
    assert NIL != itp_section_iterator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject _csetf_itp_section_iterator_parent(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_section_iterator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject _csetf_itp_section_iterator_span(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_section_iterator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject _csetf_itp_section_iterator_section(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_section_iterator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject _csetf_itp_section_iterator_current(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_section_iterator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject make_itp_section_iterator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $itp_section_iterator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw44$PARENT ) )
      {
        _csetf_itp_section_iterator_parent( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$SPAN ) )
      {
        _csetf_itp_section_iterator_span( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$SECTION ) )
      {
        _csetf_itp_section_iterator_section( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$CURRENT ) )
      {
        _csetf_itp_section_iterator_current( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject visit_defstruct_itp_section_iterator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym47$MAKE_ITP_SECTION_ITERATOR, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw44$PARENT, itp_section_iterator_parent( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$SPAN, itp_section_iterator_span( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw45$SECTION, itp_section_iterator_section( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw46$CURRENT, itp_section_iterator_current( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym47$MAKE_ITP_SECTION_ITERATOR, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
  public static SubLObject visit_defstruct_object_itp_section_iterator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_itp_section_iterator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2200L)
  public static SubLObject itp_print_section_iterator(final SubLObject entry, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str49$_ITP_SECTION___S_, itp_section_iterator_span( entry ) );
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject itp_child_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    itp_print_child_iterator( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject itp_child_iterator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $itp_child_iterator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject itp_child_iterator_parent(final SubLObject v_object)
  {
    assert NIL != itp_child_iterator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject itp_child_iterator_rop_formula(final SubLObject v_object)
  {
    assert NIL != itp_child_iterator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject itp_child_iterator_section(final SubLObject v_object)
  {
    assert NIL != itp_child_iterator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject _csetf_itp_child_iterator_parent(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_child_iterator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject _csetf_itp_child_iterator_rop_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_child_iterator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject _csetf_itp_child_iterator_section(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != itp_child_iterator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject make_itp_child_iterator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $itp_child_iterator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw44$PARENT ) )
      {
        _csetf_itp_child_iterator_parent( v_new, current_value );
      }
      else if( pcase_var.eql( $kw65$ROP_FORMULA ) )
      {
        _csetf_itp_child_iterator_rop_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$SECTION ) )
      {
        _csetf_itp_child_iterator_section( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject visit_defstruct_itp_child_iterator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym66$MAKE_ITP_CHILD_ITERATOR, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw44$PARENT, itp_child_iterator_parent( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw65$ROP_FORMULA, itp_child_iterator_rop_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw45$SECTION, itp_child_iterator_section( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym66$MAKE_ITP_CHILD_ITERATOR, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
  public static SubLObject visit_defstruct_object_itp_child_iterator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_itp_child_iterator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2707L)
  public static SubLObject itp_print_child_iterator(final SubLObject entry, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str68$_ITP_CHILD___S_, itp_child_iterator_rop_formula( entry ) );
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2889L)
  public static SubLObject new_itp_result_iterator(final SubLObject parses, SubLObject style, SubLObject string)
  {
    if( style == UNPROVIDED )
    {
      style = NIL;
    }
    if( string == UNPROVIDED )
    {
      string = NIL;
    }
    final SubLObject iterator = make_itp_result_iterator( UNPROVIDED );
    if( NIL == style )
    {
      style = determine_parse_result_style( parses );
    }
    _csetf_itp_result_iterator_style( iterator, style );
    _csetf_itp_result_iterator_parses( iterator, parses );
    itp_result_iterator_reset( iterator );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 3305L)
  public static SubLObject determine_parse_result_style(final SubLObject parses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject first_span_set = conses_high.second( parses.first() );
    final SubLObject first_parse = first_span_set.first();
    SubLObject result = $kw69$SIMPLE;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym70$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const71$EverythingPSC, thread );
      if( NIL != rtp_constituent_weeders.itp_semantics_p( first_parse ) )
      {
        result = $kw72$RANKED;
      }
      else if( first_parse.isList() && NIL != assertion_handles.assertion_p( conses_high.second( first_parse ) ) )
      {
        result = $kw73$ASSERTION;
      }
      else if( first_parse.isList() && conses_high.second( first_parse ).isList() && NIL != assertion_handles.assertion_p( conses_high.second( first_parse ).first() ) )
      {
        result = $kw73$ASSERTION;
      }
      else
      {
        result = $kw69$SIMPLE;
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 3882L)
  public static SubLObject copy_itp_result_iterator(final SubLObject result_iterator)
  {
    final SubLObject result = make_itp_result_iterator( UNPROVIDED );
    _csetf_itp_result_iterator_style( result, itp_result_iterator_style( result_iterator ) );
    _csetf_itp_result_iterator_parses( result, itp_result_iterator_parses( result_iterator ) );
    _csetf_itp_result_iterator_span( result, itp_result_iterator_span( result_iterator ) );
    _csetf_itp_result_iterator_section_iterator( result, itp_result_iterator_section_iterator( result_iterator ) );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 4412L)
  public static SubLObject new_itp_section_iterator(final SubLObject parent, final SubLObject span)
  {
    final SubLObject iterator = make_itp_section_iterator( UNPROVIDED );
    _csetf_itp_section_iterator_parent( iterator, parent );
    final SubLObject the_span = span.first();
    final SubLObject the_section = conses_high.second( span );
    _csetf_itp_section_iterator_span( iterator, the_span );
    _csetf_itp_section_iterator_section( iterator, the_section );
    itp_section_iterator_reset( iterator );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 4847L)
  public static SubLObject new_itp_child_iterator(final SubLObject parent, final SubLObject rop_formula)
  {
    final SubLObject iterator = make_itp_child_iterator( UNPROVIDED );
    _csetf_itp_child_iterator_parent( iterator, parent );
    _csetf_itp_child_iterator_rop_formula( iterator, rop_formula );
    final SubLObject span = parsing_utilities.result_of_parsing_span_wXo_thelist( rop_formula );
    _csetf_itp_child_iterator_section( iterator, find_itp_section_iterator( parent, span ) );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 5273L)
  public static SubLObject new_itp_root_children_iterator(final SubLObject parent)
  {
    final SubLObject iterator = make_itp_child_iterator( UNPROVIDED );
    _csetf_itp_child_iterator_parent( iterator, parent );
    _csetf_itp_child_iterator_section( iterator, itp_result_iterator_curr( parent ) );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 5548L)
  public static SubLObject is_itp_root_children_iteratorP(final SubLObject iterator)
  {
    return makeBoolean( NIL != itp_child_iterator_p( iterator ) && NIL == itp_child_iterator_rop_formula( iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 5717L)
  public static SubLObject is_equivalent_rtp_child_iteratorP(final SubLObject iterator_1, final SubLObject iterator_2)
  {
    return Equality.equalp( itp_child_iterator_rop_formula( iterator_1 ), itp_child_iterator_rop_formula( iterator_2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 5970L)
  public static SubLObject itp_result_iterator_reset(final SubLObject iterator)
  {
    final SubLObject span = itp_result_iterator_parses( iterator );
    _csetf_itp_result_iterator_span( iterator, span );
    return update_itp_result_section_iterator( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6234L)
  public static SubLObject itp_result_iterator_curr(final SubLObject iterator)
  {
    return itp_result_iterator_section_iterator( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6343L)
  public static SubLObject itp_section_iterator_reset(final SubLObject iterator)
  {
    final SubLObject current = itp_section_iterator_section( iterator );
    _csetf_itp_section_iterator_current( iterator, current );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6539L)
  public static SubLObject itp_section_iterator_curr(final SubLObject iterator)
  {
    return itp_section_iterator_current( iterator ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6735L)
  public static SubLObject itp_section_iterator_set_curr(final SubLObject iterator, final SubLObject element)
  {
    ConsesLow.rplaca( itp_section_iterator_current( iterator ), element );
    return element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6876L)
  public static SubLObject itp_section_iterator_curr_span(final SubLObject iterator)
  {
    return itp_section_iterator_span( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6980L)
  public static SubLObject itp_section_iterator_curr_cycl(final SubLObject iterator)
  {
    final SubLObject pcase_var = itp_result_iterator_style( itp_section_iterator_parent( iterator ) );
    if( pcase_var.eql( $kw69$SIMPLE ) )
    {
      return itp_section_iterator_curr( iterator );
    }
    if( pcase_var.eql( $kw73$ASSERTION ) )
    {
      return itp_section_iterator_curr( iterator ).first();
    }
    if( pcase_var.eql( $kw72$RANKED ) )
    {
      return rtp_constituent_weeders.itp_semantics_cycl( itp_section_iterator_curr( iterator ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 7338L)
  public static SubLObject itp_section_iterator_curr_assertion(final SubLObject iterator)
  {
    final SubLObject pcase_var = itp_result_iterator_style( itp_section_iterator_parent( iterator ) );
    if( pcase_var.eql( $kw73$ASSERTION ) )
    {
      return conses_high.second( itp_section_iterator_curr( iterator ) );
    }
    if( pcase_var.eql( $kw72$RANKED ) )
    {
      return rtp_constituent_weeders.itp_semantics_supports( itp_section_iterator_curr( iterator ) );
    }
    return $kw74$UNAVAILABLE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 7671L)
  public static SubLObject itp_section_iterator_curr_pred(final SubLObject iterator)
  {
    final SubLObject pcase_var = itp_result_iterator_style( itp_section_iterator_parent( iterator ) );
    if( pcase_var.eql( $kw69$SIMPLE ) )
    {
      return $kw74$UNAVAILABLE;
    }
    if( pcase_var.eql( $kw73$ASSERTION ) )
    {
      return args_from_assertions( ZERO_INTEGER, itp_section_iterator_curr_assertion( iterator ) );
    }
    if( pcase_var.eql( $kw72$RANKED ) )
    {
      return rtp_constituent_weeders.itp_semantics_force( itp_section_iterator_curr( iterator ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 8028L)
  public static SubLObject itp_section_iterator_curr_cat(final SubLObject iterator)
  {
    final SubLObject pcase_var = itp_result_iterator_style( itp_section_iterator_parent( iterator ) );
    if( pcase_var.eql( $kw69$SIMPLE ) )
    {
      return $kw74$UNAVAILABLE;
    }
    if( pcase_var.eql( $kw73$ASSERTION ) )
    {
      return args_from_assertions( ONE_INTEGER, itp_section_iterator_curr_assertion( iterator ) );
    }
    if( pcase_var.eql( $kw72$RANKED ) )
    {
      return rtp_constituent_weeders.itp_semantics_category( itp_section_iterator_curr( iterator ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 8387L)
  public static SubLObject itp_section_iterator_curr_confidence(final SubLObject iterator)
  {
    final SubLObject pcase_var = itp_result_iterator_style( itp_section_iterator_parent( iterator ) );
    if( pcase_var.eql( $kw72$RANKED ) )
    {
      return rtp_constituent_weeders.itp_semantics_confidence( itp_section_iterator_curr( iterator ) );
    }
    return $kw74$UNAVAILABLE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 8654L)
  public static SubLObject args_from_assertions(final SubLObject arg_num, final SubLObject asserts)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = asserts;
    SubLObject v_assert = NIL;
    v_assert = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( v_assert ) )
      {
        result = ConsesLow.cons( assertions_high.gaf_arg( v_assert, arg_num ), result );
      }
      else
      {
        result = ConsesLow.cons( v_assert, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_assert = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 8904L)
  public static SubLObject find_itp_section_iterator(final SubLObject result_iterator, final SubLObject span)
  {
    final SubLObject iterator = copy_itp_result_iterator( result_iterator );
    SubLObject section_iterator = NIL;
    itp_result_iterator_reset( iterator );
    while ( NIL == itp_result_iterator_doneP( iterator ))
    {
      section_iterator = itp_result_iterator_curr( iterator );
      if( span.equal( itp_section_iterator_span( section_iterator ) ) )
      {
        return section_iterator;
      }
      itp_result_iterator_next( iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 9441L)
  public static SubLObject itp_child_iterator_reset(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_reset( section_iterator );
    }
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 9693L)
  public static SubLObject itp_child_iterator_curr(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_curr( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 9936L)
  public static SubLObject itp_child_iterator_curr_span(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_curr_span( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 10190L)
  public static SubLObject itp_child_iterator_curr_cycl(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_curr_cycl( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 10443L)
  public static SubLObject itp_child_iterator_curr_assertion(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_curr_assertion( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 10706L)
  public static SubLObject itp_child_iterator_curr_pred(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_curr_pred( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 10962L)
  public static SubLObject itp_child_iterator_curr_cat(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_curr_cat( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 11216L)
  public static SubLObject itp_child_iterator_curr_confidence(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_curr_confidence( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 11483L)
  public static SubLObject itp_result_iterator_doneP(final SubLObject iterator)
  {
    return Types.sublisp_null( itp_result_iterator_span( iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 11625L)
  public static SubLObject itp_result_iterator_next(final SubLObject iterator)
  {
    if( NIL == itp_result_iterator_doneP( iterator ) )
    {
      final SubLObject span = itp_result_iterator_span( iterator );
      _csetf_itp_result_iterator_span( iterator, span.rest() );
      update_itp_result_section_iterator( iterator );
    }
    return itp_result_iterator_curr( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 11941L)
  public static SubLObject itp_result_iterator_prev(final SubLObject iterator)
  {
    final SubLObject span = itp_result_iterator_span( iterator );
    SubLObject start = itp_result_iterator_parses( iterator );
    if( !span.eql( start ) )
    {
      while ( !start.rest().eql( span ))
      {
        start = start.rest();
      }
      _csetf_itp_result_iterator_span( iterator, start );
    }
    update_itp_result_section_iterator( iterator );
    return itp_result_iterator_curr( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 12360L)
  public static SubLObject itp_section_iterator_next(final SubLObject iterator)
  {
    if( NIL == itp_section_iterator_doneP( iterator ) )
    {
      final SubLObject current = itp_section_iterator_current( iterator );
      _csetf_itp_section_iterator_current( iterator, current.rest() );
    }
    return itp_section_iterator_current( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 12647L)
  public static SubLObject itp_section_iterator_prev(final SubLObject iterator)
  {
    final SubLObject current = itp_section_iterator_current( iterator );
    SubLObject start = itp_section_iterator_section( iterator );
    if( !current.eql( start ) )
    {
      while ( !start.rest().eql( current ))
      {
        start = start.rest();
      }
      _csetf_itp_section_iterator_current( iterator, start );
    }
    return itp_section_iterator_curr( iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13039L)
  public static SubLObject itp_section_iterator_doneP(final SubLObject iterator)
  {
    return Types.sublisp_null( itp_section_iterator_current( iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13149L)
  public static SubLObject itp_child_iterator_next(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_next( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13396L)
  public static SubLObject itp_child_iterator_prev(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_prev( section_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13641L)
  public static SubLObject itp_child_iterator_doneP(final SubLObject iterator)
  {
    final SubLObject section_iterator = itp_child_iterator_section( iterator );
    if( NIL != itp_section_iterator_p( section_iterator ) )
    {
      return itp_section_iterator_doneP( section_iterator );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13931L)
  public static SubLObject itp_longest_parse_cycls(final SubLObject parses)
  {
    final SubLObject result_iterator = new_itp_result_iterator( parses, UNPROVIDED, UNPROVIDED );
    SubLObject max_span_length = ZERO_INTEGER;
    SubLObject max_span = NIL;
    SubLObject output_cycls = NIL;
    while ( NIL == itp_result_iterator_doneP( result_iterator ))
    {
      final SubLObject section_iterator = itp_result_iterator_curr( result_iterator );
      final SubLObject span = itp_section_iterator_curr_span( section_iterator );
      if( NIL != list_utilities.lengthG( span, max_span_length, UNPROVIDED ) )
      {
        max_span_length = Sequences.length( span );
        max_span = span;
        output_cycls = NIL;
        while ( NIL == itp_section_iterator_doneP( section_iterator ))
        {
          output_cycls = ConsesLow.cons( itp_section_iterator_curr_cycl( section_iterator ), output_cycls );
          itp_section_iterator_next( section_iterator );
        }
      }
      itp_result_iterator_next( result_iterator );
    }
    return Values.values( Sequences.nreverse( output_cycls ), max_span );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 14920L)
  public static SubLObject update_itp_result_section_iterator(final SubLObject iterator)
  {
    final SubLObject span = itp_result_iterator_span( iterator );
    SubLObject section_iterator = NIL;
    section_iterator = new_itp_section_iterator( iterator, span.first() );
    _csetf_itp_result_iterator_section_iterator( iterator, section_iterator );
    return section_iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rtp_iterator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_string(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_parsing_mt(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_semantic_mt(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_strengthenP(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_multiple_quantificationsP(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_wff_checkP(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_force(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_raw_parses(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_result_queue(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_initialized(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_template_category(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_memoization_state(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject rtp_iterator_sbhl_resource(final SubLObject v_object)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_parsing_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_semantic_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_strengthenP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_multiple_quantificationsP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_wff_checkP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_force(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_raw_parses(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_result_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_initialized(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_template_category(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_memoization_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject _csetf_rtp_iterator_sbhl_resource(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rtp_iterator_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject make_rtp_iterator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rtp_iterator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw109$STRING ) )
      {
        _csetf_rtp_iterator_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw110$PARSING_MT ) )
      {
        _csetf_rtp_iterator_parsing_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw111$SEMANTIC_MT ) )
      {
        _csetf_rtp_iterator_semantic_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw112$STRENGTHEN_ ) )
      {
        _csetf_rtp_iterator_strengthenP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw113$MULTIPLE_QUANTIFICATIONS_ ) )
      {
        _csetf_rtp_iterator_multiple_quantificationsP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw114$WFF_CHECK_ ) )
      {
        _csetf_rtp_iterator_wff_checkP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw115$FORCE ) )
      {
        _csetf_rtp_iterator_force( v_new, current_value );
      }
      else if( pcase_var.eql( $kw116$RAW_PARSES ) )
      {
        _csetf_rtp_iterator_raw_parses( v_new, current_value );
      }
      else if( pcase_var.eql( $kw117$RESULT_QUEUE ) )
      {
        _csetf_rtp_iterator_result_queue( v_new, current_value );
      }
      else if( pcase_var.eql( $kw118$INITIALIZED ) )
      {
        _csetf_rtp_iterator_initialized( v_new, current_value );
      }
      else if( pcase_var.eql( $kw119$TEMPLATE_CATEGORY ) )
      {
        _csetf_rtp_iterator_template_category( v_new, current_value );
      }
      else if( pcase_var.eql( $kw120$MEMOIZATION_STATE ) )
      {
        _csetf_rtp_iterator_memoization_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw121$SBHL_RESOURCE ) )
      {
        _csetf_rtp_iterator_sbhl_resource( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject visit_defstruct_rtp_iterator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym122$MAKE_RTP_ITERATOR, THIRTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw109$STRING, rtp_iterator_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw110$PARSING_MT, rtp_iterator_parsing_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw111$SEMANTIC_MT, rtp_iterator_semantic_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw112$STRENGTHEN_, rtp_iterator_strengthenP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw113$MULTIPLE_QUANTIFICATIONS_, rtp_iterator_multiple_quantificationsP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw114$WFF_CHECK_, rtp_iterator_wff_checkP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw115$FORCE, rtp_iterator_force( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw116$RAW_PARSES, rtp_iterator_raw_parses( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw117$RESULT_QUEUE, rtp_iterator_result_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw118$INITIALIZED, rtp_iterator_initialized( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw119$TEMPLATE_CATEGORY, rtp_iterator_template_category( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw120$MEMOIZATION_STATE, rtp_iterator_memoization_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw121$SBHL_RESOURCE, rtp_iterator_sbhl_resource( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym122$MAKE_RTP_ITERATOR, THIRTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
  public static SubLObject visit_defstruct_object_rtp_iterator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rtp_iterator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15774L)
  public static SubLObject new_rtp_iterator(final SubLObject string, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    return iteration.new_iterator( new_rtp_iterator_state( string, v_properties ), $sym124$RTP_ITERATOR_DONE, $sym125$RTP_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 16008L)
  public static SubLObject new_rtp_iterator_state(final SubLObject string, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLObject iter = make_rtp_iterator( UNPROVIDED );
    final SubLObject parsing_mt = conses_high.getf( v_properties, $kw110$PARSING_MT, $const126$RKFParsingMt );
    final SubLObject semantic_mt = conses_high.getf( v_properties, $kw111$SEMANTIC_MT, parsing_mt );
    final SubLObject strengthenP = conses_high.getf( v_properties, $kw112$STRENGTHEN_, T );
    final SubLObject multiple_quantificationsP = conses_high.getf( v_properties, $kw113$MULTIPLE_QUANTIFICATIONS_, NIL );
    final SubLObject force = conses_high.getf( v_properties, $kw115$FORCE, $kw127$DECLARATIVE );
    final SubLObject wff_checkP = conses_high.getf( v_properties, $kw114$WFF_CHECK_, T );
    _csetf_rtp_iterator_string( iter, string );
    _csetf_rtp_iterator_parsing_mt( iter, parsing_mt );
    _csetf_rtp_iterator_semantic_mt( iter, semantic_mt );
    _csetf_rtp_iterator_strengthenP( iter, strengthenP );
    _csetf_rtp_iterator_multiple_quantificationsP( iter, multiple_quantificationsP );
    _csetf_rtp_iterator_force( iter, force );
    _csetf_rtp_iterator_template_category( iter, rtp_iter_cat_for_force( force ) );
    _csetf_rtp_iterator_wff_checkP( iter, wff_checkP );
    _csetf_rtp_iterator_initialized( iter, NIL );
    _csetf_rtp_iterator_result_queue( iter, queues.create_queue( UNPROVIDED ) );
    _csetf_rtp_iterator_memoization_state( iter, memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    _csetf_rtp_iterator_sbhl_resource( iter, sbhl_marking_vars.new_sbhl_marking_space_resource( FOUR_INTEGER ) );
    return iter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 17215L)
  public static SubLObject rtp_iter_cat_for_force(final SubLObject force)
  {
    if( force.eql( $kw127$DECLARATIVE ) )
    {
      return $const128$STemplate;
    }
    if( force.eql( $kw129$QUERY ) )
    {
      return $const130$QuestionTemplate;
    }
    if( force.eql( $kw131$QUESTION ) )
    {
      return $const130$QuestionTemplate;
    }
    return $const128$STemplate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 17442L)
  public static SubLObject rtp_iterator_done(final SubLObject iter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == queues.queue_empty_p( rtp_iterator_result_queue( iter ) ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject local_state = rtp_iterator_memoization_state( iter );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        if( NIL == rtp_iterator_initialized( iter ) )
        {
          rtp_iterator_add_raw_parse( iter );
        }
        if( NIL == rtp_iterator_raw_parses( iter ) && NIL != queues.queue_empty_p( rtp_iterator_result_queue( iter ) ) )
        {
          result = T;
        }
        while ( NIL != queues.queue_empty_p( rtp_iterator_result_queue( iter ) ) && NIL != rtp_iterator_raw_parses( iter ) && NIL == result)
        {
          rtp_iterator_reformulate_one_parse( iter );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    if( NIL == result )
    {
      result = queues.queue_empty_p( rtp_iterator_result_queue( iter ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 18141L)
  public static SubLObject rtp_iterator_reformulate_one_parse(final SubLObject iter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sbhl_resource = rtp_iterator_sbhl_resource( iter );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_resource, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
      try
      {
        final SubLObject raw_parses = rtp_iterator_raw_parses( iter );
        final SubLObject first_parse = raw_parses.first();
        final SubLObject semantic_mt = rtp_iterator_semantic_mt( iter );
        final SubLObject strengthenP = rtp_iterator_strengthenP( iter );
        final SubLObject reformulated_parses = rkf_formula_optimizer.rkf_reformulate_into_many( first_parse, semantic_mt, strengthenP, UNPROVIDED, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( semantic_mt, thread );
          final SubLObject wff_parses = ( NIL != rtp_iterator_wff_checkP( iter ) ) ? list_utilities.remove_if_not( $sym132$EL_WFF_, reformulated_parses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
              : reformulated_parses;
          _csetf_rtp_iterator_raw_parses( iter, raw_parses.rest() );
          SubLObject cdolist_list_var = wff_parses;
          SubLObject reformulated_parse = NIL;
          reformulated_parse = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            queues.enqueue( reformulated_parse, rtp_iterator_result_queue( iter ) );
            cdolist_list_var = cdolist_list_var.rest();
            reformulated_parse = cdolist_list_var.first();
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$2, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0, thread );
    }
    return iter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 19080L)
  public static SubLObject rtp_iterator_add_raw_parse(final SubLObject iter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_text_proc_resolve_parses$.currentBinding( thread );
    try
    {
      rkf_text_processors.$rkf_text_proc_resolve_parses$.bind( T, thread );
      final SubLObject rkf_return_multiple_quantifications = rtp_iterator_multiple_quantificationsP( iter );
      final SubLObject _prev_bind_0_$4 = parsing_vars.$rkf_template_wff_filter_level$.currentBinding( thread );
      try
      {
        parsing_vars.$rkf_template_wff_filter_level$.bind( ( NIL != rtp_iterator_wff_checkP( iter ) ) ? TWO_INTEGER : ZERO_INTEGER, thread );
        final SubLObject parsing_mt = rtp_iterator_parsing_mt( iter );
        final SubLObject semantic_mt = rtp_iterator_semantic_mt( iter );
        final SubLObject string = rtp_iterator_string( iter );
        final SubLObject template_category = rtp_iterator_template_category( iter );
        final SubLObject raw_parser_output = rkf_text_processors.rkf_utterance_reader( string, template_category, parsing_mt, semantic_mt );
        final SubLObject top_level_parses = rkf_text_processors.top_level_parses( raw_parser_output );
        _csetf_rtp_iterator_raw_parses( iter, top_level_parses );
        _csetf_rtp_iterator_initialized( iter, T );
      }
      finally
      {
        parsing_vars.$rkf_template_wff_filter_level$.rebind( _prev_bind_0_$4, thread );
      }
    }
    finally
    {
      rkf_text_processors.$rkf_text_proc_resolve_parses$.rebind( _prev_bind_0, thread );
    }
    return iter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 20069L)
  public static SubLObject rtp_iterator_next(final SubLObject iter)
  {
    if( NIL != rtp_iterator_done( iter ) )
    {
      return Values.values( $kw133$FAILURE, iter, NIL );
    }
    final SubLObject result = queues.dequeue( rtp_iterator_result_queue( iter ) );
    return Values.values( result, iter, NIL );
  }

  public static SubLObject declare_rtp_iterators_file()
  {
    SubLFiles.declareFunction( me, "itp_result_iterator_print_function_trampoline", "ITP-RESULT-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_p", "ITP-RESULT-ITERATOR-P", 1, 0, false );
    new $itp_result_iterator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "itp_result_iterator_style", "ITP-RESULT-ITERATOR-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_parses", "ITP-RESULT-ITERATOR-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_span", "ITP-RESULT-ITERATOR-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_section_iterator", "ITP-RESULT-ITERATOR-SECTION-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_result_iterator_style", "_CSETF-ITP-RESULT-ITERATOR-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_result_iterator_parses", "_CSETF-ITP-RESULT-ITERATOR-PARSES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_result_iterator_span", "_CSETF-ITP-RESULT-ITERATOR-SPAN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_result_iterator_section_iterator", "_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "make_itp_result_iterator", "MAKE-ITP-RESULT-ITERATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_itp_result_iterator", "VISIT-DEFSTRUCT-ITP-RESULT-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_itp_result_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-RESULT-ITERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_print_function_trampoline", "ITP-SECTION-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_p", "ITP-SECTION-ITERATOR-P", 1, 0, false );
    new $itp_section_iterator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "itp_section_iterator_parent", "ITP-SECTION-ITERATOR-PARENT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_span", "ITP-SECTION-ITERATOR-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_section", "ITP-SECTION-ITERATOR-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_current", "ITP-SECTION-ITERATOR-CURRENT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_section_iterator_parent", "_CSETF-ITP-SECTION-ITERATOR-PARENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_section_iterator_span", "_CSETF-ITP-SECTION-ITERATOR-SPAN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_section_iterator_section", "_CSETF-ITP-SECTION-ITERATOR-SECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_section_iterator_current", "_CSETF-ITP-SECTION-ITERATOR-CURRENT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_itp_section_iterator", "MAKE-ITP-SECTION-ITERATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_itp_section_iterator", "VISIT-DEFSTRUCT-ITP-SECTION-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_itp_section_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-SECTION-ITERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_print_section_iterator", "ITP-PRINT-SECTION-ITERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_print_function_trampoline", "ITP-CHILD-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_p", "ITP-CHILD-ITERATOR-P", 1, 0, false );
    new $itp_child_iterator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "itp_child_iterator_parent", "ITP-CHILD-ITERATOR-PARENT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_rop_formula", "ITP-CHILD-ITERATOR-ROP-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_section", "ITP-CHILD-ITERATOR-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_child_iterator_parent", "_CSETF-ITP-CHILD-ITERATOR-PARENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_child_iterator_rop_formula", "_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_itp_child_iterator_section", "_CSETF-ITP-CHILD-ITERATOR-SECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_itp_child_iterator", "MAKE-ITP-CHILD-ITERATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_itp_child_iterator", "VISIT-DEFSTRUCT-ITP-CHILD-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_itp_child_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-CHILD-ITERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_print_child_iterator", "ITP-PRINT-CHILD-ITERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_itp_result_iterator", "NEW-ITP-RESULT-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "determine_parse_result_style", "DETERMINE-PARSE-RESULT-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_itp_result_iterator", "COPY-ITP-RESULT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_itp_section_iterator", "NEW-ITP-SECTION-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_itp_child_iterator", "NEW-ITP-CHILD-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_itp_root_children_iterator", "NEW-ITP-ROOT-CHILDREN-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "is_itp_root_children_iteratorP", "IS-ITP-ROOT-CHILDREN-ITERATOR?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_equivalent_rtp_child_iteratorP", "IS-EQUIVALENT-RTP-CHILD-ITERATOR?", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_reset", "ITP-RESULT-ITERATOR-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_curr", "ITP-RESULT-ITERATOR-CURR", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_reset", "ITP-SECTION-ITERATOR-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_curr", "ITP-SECTION-ITERATOR-CURR", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_set_curr", "ITP-SECTION-ITERATOR-SET-CURR", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_curr_span", "ITP-SECTION-ITERATOR-CURR-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_curr_cycl", "ITP-SECTION-ITERATOR-CURR-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_curr_assertion", "ITP-SECTION-ITERATOR-CURR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_curr_pred", "ITP-SECTION-ITERATOR-CURR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_curr_cat", "ITP-SECTION-ITERATOR-CURR-CAT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_curr_confidence", "ITP-SECTION-ITERATOR-CURR-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "args_from_assertions", "ARGS-FROM-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_itp_section_iterator", "FIND-ITP-SECTION-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_reset", "ITP-CHILD-ITERATOR-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_curr", "ITP-CHILD-ITERATOR-CURR", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_curr_span", "ITP-CHILD-ITERATOR-CURR-SPAN", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_curr_cycl", "ITP-CHILD-ITERATOR-CURR-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_curr_assertion", "ITP-CHILD-ITERATOR-CURR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_curr_pred", "ITP-CHILD-ITERATOR-CURR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_curr_cat", "ITP-CHILD-ITERATOR-CURR-CAT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_curr_confidence", "ITP-CHILD-ITERATOR-CURR-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_doneP", "ITP-RESULT-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_next", "ITP-RESULT-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_result_iterator_prev", "ITP-RESULT-ITERATOR-PREV", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_next", "ITP-SECTION-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_prev", "ITP-SECTION-ITERATOR-PREV", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_section_iterator_doneP", "ITP-SECTION-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_next", "ITP-CHILD-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_prev", "ITP-CHILD-ITERATOR-PREV", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_child_iterator_doneP", "ITP-CHILD-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "itp_longest_parse_cycls", "ITP-LONGEST-PARSE-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "update_itp_result_section_iterator", "UPDATE-ITP-RESULT-SECTION-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_print_function_trampoline", "RTP-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_p", "RTP-ITERATOR-P", 1, 0, false );
    new $rtp_iterator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rtp_iterator_string", "RTP-ITERATOR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_parsing_mt", "RTP-ITERATOR-PARSING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_semantic_mt", "RTP-ITERATOR-SEMANTIC-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_strengthenP", "RTP-ITERATOR-STRENGTHEN?", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_multiple_quantificationsP", "RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_wff_checkP", "RTP-ITERATOR-WFF-CHECK?", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_force", "RTP-ITERATOR-FORCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_raw_parses", "RTP-ITERATOR-RAW-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_result_queue", "RTP-ITERATOR-RESULT-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_initialized", "RTP-ITERATOR-INITIALIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_template_category", "RTP-ITERATOR-TEMPLATE-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_memoization_state", "RTP-ITERATOR-MEMOIZATION-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_sbhl_resource", "RTP-ITERATOR-SBHL-RESOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_string", "_CSETF-RTP-ITERATOR-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_parsing_mt", "_CSETF-RTP-ITERATOR-PARSING-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_semantic_mt", "_CSETF-RTP-ITERATOR-SEMANTIC-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_strengthenP", "_CSETF-RTP-ITERATOR-STRENGTHEN?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_multiple_quantificationsP", "_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_wff_checkP", "_CSETF-RTP-ITERATOR-WFF-CHECK?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_force", "_CSETF-RTP-ITERATOR-FORCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_raw_parses", "_CSETF-RTP-ITERATOR-RAW-PARSES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_result_queue", "_CSETF-RTP-ITERATOR-RESULT-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_initialized", "_CSETF-RTP-ITERATOR-INITIALIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_template_category", "_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_memoization_state", "_CSETF-RTP-ITERATOR-MEMOIZATION-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rtp_iterator_sbhl_resource", "_CSETF-RTP-ITERATOR-SBHL-RESOURCE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rtp_iterator", "MAKE-RTP-ITERATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rtp_iterator", "VISIT-DEFSTRUCT-RTP-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rtp_iterator_method", "VISIT-DEFSTRUCT-OBJECT-RTP-ITERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_rtp_iterator", "NEW-RTP-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "new_rtp_iterator_state", "NEW-RTP-ITERATOR-STATE", 1, 1, false );
    SubLFiles.declareFunction( me, "rtp_iter_cat_for_force", "RTP-ITER-CAT-FOR-FORCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_done", "RTP-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_reformulate_one_parse", "RTP-ITERATOR-REFORMULATE-ONE-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_add_raw_parse", "RTP-ITERATOR-ADD-RAW-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "rtp_iterator_next", "RTP-ITERATOR-NEXT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rtp_iterators_file()
  {
    $dtp_itp_result_iterator$ = SubLFiles.defconstant( "*DTP-ITP-RESULT-ITERATOR*", $sym0$ITP_RESULT_ITERATOR );
    $dtp_itp_section_iterator$ = SubLFiles.defconstant( "*DTP-ITP-SECTION-ITERATOR*", $sym27$ITP_SECTION_ITERATOR );
    $dtp_itp_child_iterator$ = SubLFiles.defconstant( "*DTP-ITP-CHILD-ITERATOR*", $sym50$ITP_CHILD_ITERATOR );
    $dtp_rtp_iterator$ = SubLFiles.defconstant( "*DTP-RTP-ITERATOR*", $sym75$RTP_ITERATOR );
    return NIL;
  }

  public static SubLObject setup_rtp_iterators_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_itp_result_iterator$.getGlobalValue(), Symbols.symbol_function( $sym7$ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$ITP_RESULT_ITERATOR_STYLE, $sym10$_CSETF_ITP_RESULT_ITERATOR_STYLE );
    Structures.def_csetf( $sym11$ITP_RESULT_ITERATOR_PARSES, $sym12$_CSETF_ITP_RESULT_ITERATOR_PARSES );
    Structures.def_csetf( $sym13$ITP_RESULT_ITERATOR_SPAN, $sym14$_CSETF_ITP_RESULT_ITERATOR_SPAN );
    Structures.def_csetf( $sym15$ITP_RESULT_ITERATOR_SECTION_ITERATOR, $sym16$_CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR );
    Equality.identity( $sym0$ITP_RESULT_ITERATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_result_iterator$.getGlobalValue(), Symbols.symbol_function(
        $sym26$VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_itp_section_iterator$.getGlobalValue(), Symbols.symbol_function( $sym34$ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list35 );
    Structures.def_csetf( $sym36$ITP_SECTION_ITERATOR_PARENT, $sym37$_CSETF_ITP_SECTION_ITERATOR_PARENT );
    Structures.def_csetf( $sym38$ITP_SECTION_ITERATOR_SPAN, $sym39$_CSETF_ITP_SECTION_ITERATOR_SPAN );
    Structures.def_csetf( $sym40$ITP_SECTION_ITERATOR_SECTION, $sym41$_CSETF_ITP_SECTION_ITERATOR_SECTION );
    Structures.def_csetf( $sym42$ITP_SECTION_ITERATOR_CURRENT, $sym43$_CSETF_ITP_SECTION_ITERATOR_CURRENT );
    Equality.identity( $sym27$ITP_SECTION_ITERATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_section_iterator$.getGlobalValue(), Symbols.symbol_function(
        $sym48$VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_itp_child_iterator$.getGlobalValue(), Symbols.symbol_function( $sym57$ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list58 );
    Structures.def_csetf( $sym59$ITP_CHILD_ITERATOR_PARENT, $sym60$_CSETF_ITP_CHILD_ITERATOR_PARENT );
    Structures.def_csetf( $sym61$ITP_CHILD_ITERATOR_ROP_FORMULA, $sym62$_CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA );
    Structures.def_csetf( $sym63$ITP_CHILD_ITERATOR_SECTION, $sym64$_CSETF_ITP_CHILD_ITERATOR_SECTION );
    Equality.identity( $sym50$ITP_CHILD_ITERATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_child_iterator$.getGlobalValue(), Symbols.symbol_function(
        $sym67$VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rtp_iterator$.getGlobalValue(), Symbols.symbol_function( $sym81$RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list82 );
    Structures.def_csetf( $sym83$RTP_ITERATOR_STRING, $sym84$_CSETF_RTP_ITERATOR_STRING );
    Structures.def_csetf( $sym85$RTP_ITERATOR_PARSING_MT, $sym86$_CSETF_RTP_ITERATOR_PARSING_MT );
    Structures.def_csetf( $sym87$RTP_ITERATOR_SEMANTIC_MT, $sym88$_CSETF_RTP_ITERATOR_SEMANTIC_MT );
    Structures.def_csetf( $sym89$RTP_ITERATOR_STRENGTHEN_, $sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_ );
    Structures.def_csetf( $sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_, $sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ );
    Structures.def_csetf( $sym93$RTP_ITERATOR_WFF_CHECK_, $sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_ );
    Structures.def_csetf( $sym95$RTP_ITERATOR_FORCE, $sym96$_CSETF_RTP_ITERATOR_FORCE );
    Structures.def_csetf( $sym97$RTP_ITERATOR_RAW_PARSES, $sym98$_CSETF_RTP_ITERATOR_RAW_PARSES );
    Structures.def_csetf( $sym99$RTP_ITERATOR_RESULT_QUEUE, $sym100$_CSETF_RTP_ITERATOR_RESULT_QUEUE );
    Structures.def_csetf( $sym101$RTP_ITERATOR_INITIALIZED, $sym102$_CSETF_RTP_ITERATOR_INITIALIZED );
    Structures.def_csetf( $sym103$RTP_ITERATOR_TEMPLATE_CATEGORY, $sym104$_CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY );
    Structures.def_csetf( $sym105$RTP_ITERATOR_MEMOIZATION_STATE, $sym106$_CSETF_RTP_ITERATOR_MEMOIZATION_STATE );
    Structures.def_csetf( $sym107$RTP_ITERATOR_SBHL_RESOURCE, $sym108$_CSETF_RTP_ITERATOR_SBHL_RESOURCE );
    Equality.identity( $sym75$RTP_ITERATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rtp_iterator$.getGlobalValue(), Symbols.symbol_function( $sym123$VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rtp_iterators_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rtp_iterators_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rtp_iterators_file();
  }
  static
  {
    me = new rtp_iterators();
    $dtp_itp_result_iterator$ = null;
    $dtp_itp_section_iterator$ = null;
    $dtp_itp_child_iterator$ = null;
    $dtp_rtp_iterator$ = null;
    $sym0$ITP_RESULT_ITERATOR = makeSymbol( "ITP-RESULT-ITERATOR" );
    $sym1$ITP_RESULT_ITERATOR_P = makeSymbol( "ITP-RESULT-ITERATOR-P" );
    $list2 = ConsesLow.list( makeSymbol( "STYLE" ), makeSymbol( "PARSES" ), makeSymbol( "SPAN" ), makeSymbol( "SECTION-ITERATOR" ) );
    $list3 = ConsesLow.list( makeKeyword( "STYLE" ), makeKeyword( "PARSES" ), makeKeyword( "SPAN" ), makeKeyword( "SECTION-ITERATOR" ) );
    $list4 = ConsesLow.list( makeSymbol( "ITP-RESULT-ITERATOR-STYLE" ), makeSymbol( "ITP-RESULT-ITERATOR-PARSES" ), makeSymbol( "ITP-RESULT-ITERATOR-SPAN" ), makeSymbol( "ITP-RESULT-ITERATOR-SECTION-ITERATOR" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-ITP-RESULT-ITERATOR-STYLE" ), makeSymbol( "_CSETF-ITP-RESULT-ITERATOR-PARSES" ), makeSymbol( "_CSETF-ITP-RESULT-ITERATOR-SPAN" ), makeSymbol(
        "_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ITP-RESULT-ITERATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ITP-RESULT-ITERATOR-P" ) );
    $sym9$ITP_RESULT_ITERATOR_STYLE = makeSymbol( "ITP-RESULT-ITERATOR-STYLE" );
    $sym10$_CSETF_ITP_RESULT_ITERATOR_STYLE = makeSymbol( "_CSETF-ITP-RESULT-ITERATOR-STYLE" );
    $sym11$ITP_RESULT_ITERATOR_PARSES = makeSymbol( "ITP-RESULT-ITERATOR-PARSES" );
    $sym12$_CSETF_ITP_RESULT_ITERATOR_PARSES = makeSymbol( "_CSETF-ITP-RESULT-ITERATOR-PARSES" );
    $sym13$ITP_RESULT_ITERATOR_SPAN = makeSymbol( "ITP-RESULT-ITERATOR-SPAN" );
    $sym14$_CSETF_ITP_RESULT_ITERATOR_SPAN = makeSymbol( "_CSETF-ITP-RESULT-ITERATOR-SPAN" );
    $sym15$ITP_RESULT_ITERATOR_SECTION_ITERATOR = makeSymbol( "ITP-RESULT-ITERATOR-SECTION-ITERATOR" );
    $sym16$_CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR = makeSymbol( "_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR" );
    $kw17$STYLE = makeKeyword( "STYLE" );
    $kw18$PARSES = makeKeyword( "PARSES" );
    $kw19$SPAN = makeKeyword( "SPAN" );
    $kw20$SECTION_ITERATOR = makeKeyword( "SECTION-ITERATOR" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_ITP_RESULT_ITERATOR = makeSymbol( "MAKE-ITP-RESULT-ITERATOR" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ITP-RESULT-ITERATOR-METHOD" );
    $sym27$ITP_SECTION_ITERATOR = makeSymbol( "ITP-SECTION-ITERATOR" );
    $sym28$ITP_SECTION_ITERATOR_P = makeSymbol( "ITP-SECTION-ITERATOR-P" );
    $list29 = ConsesLow.list( makeSymbol( "PARENT" ), makeSymbol( "SPAN" ), makeSymbol( "SECTION" ), makeSymbol( "CURRENT" ) );
    $list30 = ConsesLow.list( makeKeyword( "PARENT" ), makeKeyword( "SPAN" ), makeKeyword( "SECTION" ), makeKeyword( "CURRENT" ) );
    $list31 = ConsesLow.list( makeSymbol( "ITP-SECTION-ITERATOR-PARENT" ), makeSymbol( "ITP-SECTION-ITERATOR-SPAN" ), makeSymbol( "ITP-SECTION-ITERATOR-SECTION" ), makeSymbol( "ITP-SECTION-ITERATOR-CURRENT" ) );
    $list32 = ConsesLow.list( makeSymbol( "_CSETF-ITP-SECTION-ITERATOR-PARENT" ), makeSymbol( "_CSETF-ITP-SECTION-ITERATOR-SPAN" ), makeSymbol( "_CSETF-ITP-SECTION-ITERATOR-SECTION" ), makeSymbol(
        "_CSETF-ITP-SECTION-ITERATOR-CURRENT" ) );
    $sym33$ITP_PRINT_SECTION_ITERATOR = makeSymbol( "ITP-PRINT-SECTION-ITERATOR" );
    $sym34$ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ITP-SECTION-ITERATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list35 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ITP-SECTION-ITERATOR-P" ) );
    $sym36$ITP_SECTION_ITERATOR_PARENT = makeSymbol( "ITP-SECTION-ITERATOR-PARENT" );
    $sym37$_CSETF_ITP_SECTION_ITERATOR_PARENT = makeSymbol( "_CSETF-ITP-SECTION-ITERATOR-PARENT" );
    $sym38$ITP_SECTION_ITERATOR_SPAN = makeSymbol( "ITP-SECTION-ITERATOR-SPAN" );
    $sym39$_CSETF_ITP_SECTION_ITERATOR_SPAN = makeSymbol( "_CSETF-ITP-SECTION-ITERATOR-SPAN" );
    $sym40$ITP_SECTION_ITERATOR_SECTION = makeSymbol( "ITP-SECTION-ITERATOR-SECTION" );
    $sym41$_CSETF_ITP_SECTION_ITERATOR_SECTION = makeSymbol( "_CSETF-ITP-SECTION-ITERATOR-SECTION" );
    $sym42$ITP_SECTION_ITERATOR_CURRENT = makeSymbol( "ITP-SECTION-ITERATOR-CURRENT" );
    $sym43$_CSETF_ITP_SECTION_ITERATOR_CURRENT = makeSymbol( "_CSETF-ITP-SECTION-ITERATOR-CURRENT" );
    $kw44$PARENT = makeKeyword( "PARENT" );
    $kw45$SECTION = makeKeyword( "SECTION" );
    $kw46$CURRENT = makeKeyword( "CURRENT" );
    $sym47$MAKE_ITP_SECTION_ITERATOR = makeSymbol( "MAKE-ITP-SECTION-ITERATOR" );
    $sym48$VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ITP-SECTION-ITERATOR-METHOD" );
    $str49$_ITP_SECTION___S_ = makeString( "<ITP-SECTION: ~S>" );
    $sym50$ITP_CHILD_ITERATOR = makeSymbol( "ITP-CHILD-ITERATOR" );
    $sym51$ITP_CHILD_ITERATOR_P = makeSymbol( "ITP-CHILD-ITERATOR-P" );
    $list52 = ConsesLow.list( makeSymbol( "PARENT" ), makeSymbol( "ROP-FORMULA" ), makeSymbol( "SECTION" ) );
    $list53 = ConsesLow.list( makeKeyword( "PARENT" ), makeKeyword( "ROP-FORMULA" ), makeKeyword( "SECTION" ) );
    $list54 = ConsesLow.list( makeSymbol( "ITP-CHILD-ITERATOR-PARENT" ), makeSymbol( "ITP-CHILD-ITERATOR-ROP-FORMULA" ), makeSymbol( "ITP-CHILD-ITERATOR-SECTION" ) );
    $list55 = ConsesLow.list( makeSymbol( "_CSETF-ITP-CHILD-ITERATOR-PARENT" ), makeSymbol( "_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA" ), makeSymbol( "_CSETF-ITP-CHILD-ITERATOR-SECTION" ) );
    $sym56$ITP_PRINT_CHILD_ITERATOR = makeSymbol( "ITP-PRINT-CHILD-ITERATOR" );
    $sym57$ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ITP-CHILD-ITERATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list58 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ITP-CHILD-ITERATOR-P" ) );
    $sym59$ITP_CHILD_ITERATOR_PARENT = makeSymbol( "ITP-CHILD-ITERATOR-PARENT" );
    $sym60$_CSETF_ITP_CHILD_ITERATOR_PARENT = makeSymbol( "_CSETF-ITP-CHILD-ITERATOR-PARENT" );
    $sym61$ITP_CHILD_ITERATOR_ROP_FORMULA = makeSymbol( "ITP-CHILD-ITERATOR-ROP-FORMULA" );
    $sym62$_CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA = makeSymbol( "_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA" );
    $sym63$ITP_CHILD_ITERATOR_SECTION = makeSymbol( "ITP-CHILD-ITERATOR-SECTION" );
    $sym64$_CSETF_ITP_CHILD_ITERATOR_SECTION = makeSymbol( "_CSETF-ITP-CHILD-ITERATOR-SECTION" );
    $kw65$ROP_FORMULA = makeKeyword( "ROP-FORMULA" );
    $sym66$MAKE_ITP_CHILD_ITERATOR = makeSymbol( "MAKE-ITP-CHILD-ITERATOR" );
    $sym67$VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ITP-CHILD-ITERATOR-METHOD" );
    $str68$_ITP_CHILD___S_ = makeString( "<ITP-CHILD: ~S>" );
    $kw69$SIMPLE = makeKeyword( "SIMPLE" );
    $sym70$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const71$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw72$RANKED = makeKeyword( "RANKED" );
    $kw73$ASSERTION = makeKeyword( "ASSERTION" );
    $kw74$UNAVAILABLE = makeKeyword( "UNAVAILABLE" );
    $sym75$RTP_ITERATOR = makeSymbol( "RTP-ITERATOR" );
    $sym76$RTP_ITERATOR_P = makeSymbol( "RTP-ITERATOR-P" );
    $list77 = ConsesLow.list( new SubLObject[] { makeSymbol( "STRING" ), makeSymbol( "PARSING-MT" ), makeSymbol( "SEMANTIC-MT" ), makeSymbol( "STRENGTHEN?" ), makeSymbol( "MULTIPLE-QUANTIFICATIONS?" ), makeSymbol(
        "WFF-CHECK?" ), makeSymbol( "FORCE" ), makeSymbol( "RAW-PARSES" ), makeSymbol( "RESULT-QUEUE" ), makeSymbol( "INITIALIZED" ), makeSymbol( "TEMPLATE-CATEGORY" ), makeSymbol( "MEMOIZATION-STATE" ), makeSymbol(
            "SBHL-RESOURCE" )
    } );
    $list78 = ConsesLow.list( new SubLObject[] { makeKeyword( "STRING" ), makeKeyword( "PARSING-MT" ), makeKeyword( "SEMANTIC-MT" ), makeKeyword( "STRENGTHEN?" ), makeKeyword( "MULTIPLE-QUANTIFICATIONS?" ), makeKeyword(
        "WFF-CHECK?" ), makeKeyword( "FORCE" ), makeKeyword( "RAW-PARSES" ), makeKeyword( "RESULT-QUEUE" ), makeKeyword( "INITIALIZED" ), makeKeyword( "TEMPLATE-CATEGORY" ), makeKeyword( "MEMOIZATION-STATE" ),
      makeKeyword( "SBHL-RESOURCE" )
    } );
    $list79 = ConsesLow.list( new SubLObject[] { makeSymbol( "RTP-ITERATOR-STRING" ), makeSymbol( "RTP-ITERATOR-PARSING-MT" ), makeSymbol( "RTP-ITERATOR-SEMANTIC-MT" ), makeSymbol( "RTP-ITERATOR-STRENGTHEN?" ),
      makeSymbol( "RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?" ), makeSymbol( "RTP-ITERATOR-WFF-CHECK?" ), makeSymbol( "RTP-ITERATOR-FORCE" ), makeSymbol( "RTP-ITERATOR-RAW-PARSES" ), makeSymbol(
          "RTP-ITERATOR-RESULT-QUEUE" ), makeSymbol( "RTP-ITERATOR-INITIALIZED" ), makeSymbol( "RTP-ITERATOR-TEMPLATE-CATEGORY" ), makeSymbol( "RTP-ITERATOR-MEMOIZATION-STATE" ), makeSymbol(
              "RTP-ITERATOR-SBHL-RESOURCE" )
    } );
    $list80 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-RTP-ITERATOR-STRING" ), makeSymbol( "_CSETF-RTP-ITERATOR-PARSING-MT" ), makeSymbol( "_CSETF-RTP-ITERATOR-SEMANTIC-MT" ), makeSymbol(
        "_CSETF-RTP-ITERATOR-STRENGTHEN?" ), makeSymbol( "_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?" ), makeSymbol( "_CSETF-RTP-ITERATOR-WFF-CHECK?" ), makeSymbol( "_CSETF-RTP-ITERATOR-FORCE" ), makeSymbol(
            "_CSETF-RTP-ITERATOR-RAW-PARSES" ), makeSymbol( "_CSETF-RTP-ITERATOR-RESULT-QUEUE" ), makeSymbol( "_CSETF-RTP-ITERATOR-INITIALIZED" ), makeSymbol( "_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY" ), makeSymbol(
                "_CSETF-RTP-ITERATOR-MEMOIZATION-STATE" ), makeSymbol( "_CSETF-RTP-ITERATOR-SBHL-RESOURCE" )
    } );
    $sym81$RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RTP-ITERATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list82 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RTP-ITERATOR-P" ) );
    $sym83$RTP_ITERATOR_STRING = makeSymbol( "RTP-ITERATOR-STRING" );
    $sym84$_CSETF_RTP_ITERATOR_STRING = makeSymbol( "_CSETF-RTP-ITERATOR-STRING" );
    $sym85$RTP_ITERATOR_PARSING_MT = makeSymbol( "RTP-ITERATOR-PARSING-MT" );
    $sym86$_CSETF_RTP_ITERATOR_PARSING_MT = makeSymbol( "_CSETF-RTP-ITERATOR-PARSING-MT" );
    $sym87$RTP_ITERATOR_SEMANTIC_MT = makeSymbol( "RTP-ITERATOR-SEMANTIC-MT" );
    $sym88$_CSETF_RTP_ITERATOR_SEMANTIC_MT = makeSymbol( "_CSETF-RTP-ITERATOR-SEMANTIC-MT" );
    $sym89$RTP_ITERATOR_STRENGTHEN_ = makeSymbol( "RTP-ITERATOR-STRENGTHEN?" );
    $sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_ = makeSymbol( "_CSETF-RTP-ITERATOR-STRENGTHEN?" );
    $sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = makeSymbol( "RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?" );
    $sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = makeSymbol( "_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?" );
    $sym93$RTP_ITERATOR_WFF_CHECK_ = makeSymbol( "RTP-ITERATOR-WFF-CHECK?" );
    $sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_ = makeSymbol( "_CSETF-RTP-ITERATOR-WFF-CHECK?" );
    $sym95$RTP_ITERATOR_FORCE = makeSymbol( "RTP-ITERATOR-FORCE" );
    $sym96$_CSETF_RTP_ITERATOR_FORCE = makeSymbol( "_CSETF-RTP-ITERATOR-FORCE" );
    $sym97$RTP_ITERATOR_RAW_PARSES = makeSymbol( "RTP-ITERATOR-RAW-PARSES" );
    $sym98$_CSETF_RTP_ITERATOR_RAW_PARSES = makeSymbol( "_CSETF-RTP-ITERATOR-RAW-PARSES" );
    $sym99$RTP_ITERATOR_RESULT_QUEUE = makeSymbol( "RTP-ITERATOR-RESULT-QUEUE" );
    $sym100$_CSETF_RTP_ITERATOR_RESULT_QUEUE = makeSymbol( "_CSETF-RTP-ITERATOR-RESULT-QUEUE" );
    $sym101$RTP_ITERATOR_INITIALIZED = makeSymbol( "RTP-ITERATOR-INITIALIZED" );
    $sym102$_CSETF_RTP_ITERATOR_INITIALIZED = makeSymbol( "_CSETF-RTP-ITERATOR-INITIALIZED" );
    $sym103$RTP_ITERATOR_TEMPLATE_CATEGORY = makeSymbol( "RTP-ITERATOR-TEMPLATE-CATEGORY" );
    $sym104$_CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY = makeSymbol( "_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY" );
    $sym105$RTP_ITERATOR_MEMOIZATION_STATE = makeSymbol( "RTP-ITERATOR-MEMOIZATION-STATE" );
    $sym106$_CSETF_RTP_ITERATOR_MEMOIZATION_STATE = makeSymbol( "_CSETF-RTP-ITERATOR-MEMOIZATION-STATE" );
    $sym107$RTP_ITERATOR_SBHL_RESOURCE = makeSymbol( "RTP-ITERATOR-SBHL-RESOURCE" );
    $sym108$_CSETF_RTP_ITERATOR_SBHL_RESOURCE = makeSymbol( "_CSETF-RTP-ITERATOR-SBHL-RESOURCE" );
    $kw109$STRING = makeKeyword( "STRING" );
    $kw110$PARSING_MT = makeKeyword( "PARSING-MT" );
    $kw111$SEMANTIC_MT = makeKeyword( "SEMANTIC-MT" );
    $kw112$STRENGTHEN_ = makeKeyword( "STRENGTHEN?" );
    $kw113$MULTIPLE_QUANTIFICATIONS_ = makeKeyword( "MULTIPLE-QUANTIFICATIONS?" );
    $kw114$WFF_CHECK_ = makeKeyword( "WFF-CHECK?" );
    $kw115$FORCE = makeKeyword( "FORCE" );
    $kw116$RAW_PARSES = makeKeyword( "RAW-PARSES" );
    $kw117$RESULT_QUEUE = makeKeyword( "RESULT-QUEUE" );
    $kw118$INITIALIZED = makeKeyword( "INITIALIZED" );
    $kw119$TEMPLATE_CATEGORY = makeKeyword( "TEMPLATE-CATEGORY" );
    $kw120$MEMOIZATION_STATE = makeKeyword( "MEMOIZATION-STATE" );
    $kw121$SBHL_RESOURCE = makeKeyword( "SBHL-RESOURCE" );
    $sym122$MAKE_RTP_ITERATOR = makeSymbol( "MAKE-RTP-ITERATOR" );
    $sym123$VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RTP-ITERATOR-METHOD" );
    $sym124$RTP_ITERATOR_DONE = makeSymbol( "RTP-ITERATOR-DONE" );
    $sym125$RTP_ITERATOR_NEXT = makeSymbol( "RTP-ITERATOR-NEXT" );
    $const126$RKFParsingMt = constant_handles.reader_make_constant_shell( makeString( "RKFParsingMt" ) );
    $kw127$DECLARATIVE = makeKeyword( "DECLARATIVE" );
    $const128$STemplate = constant_handles.reader_make_constant_shell( makeString( "STemplate" ) );
    $kw129$QUERY = makeKeyword( "QUERY" );
    $const130$QuestionTemplate = constant_handles.reader_make_constant_shell( makeString( "QuestionTemplate" ) );
    $kw131$QUESTION = makeKeyword( "QUESTION" );
    $sym132$EL_WFF_ = makeSymbol( "EL-WFF?" );
    $kw133$FAILURE = makeKeyword( "FAILURE" );
  }

  public static final class $itp_result_iterator_native
      extends
        SubLStructNative
  {
    public SubLObject $style;
    public SubLObject $parses;
    public SubLObject $span;
    public SubLObject $section_iterator;
    private static final SubLStructDeclNative structDecl;

    public $itp_result_iterator_native()
    {
      this.$style = CommonSymbols.NIL;
      this.$parses = CommonSymbols.NIL;
      this.$span = CommonSymbols.NIL;
      this.$section_iterator = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $itp_result_iterator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$style;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$parses;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$span;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$section_iterator;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$style = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$parses = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$span = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$section_iterator = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $itp_result_iterator_native.class, $sym0$ITP_RESULT_ITERATOR, $sym1$ITP_RESULT_ITERATOR_P, $list2, $list3, new String[] { "$style", "$parses", "$span",
        "$section_iterator"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $itp_result_iterator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $itp_result_iterator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITP-RESULT-ITERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return itp_result_iterator_p( arg1 );
    }
  }

  public static final class $itp_section_iterator_native
      extends
        SubLStructNative
  {
    public SubLObject $parent;
    public SubLObject $span;
    public SubLObject $section;
    public SubLObject $current;
    private static final SubLStructDeclNative structDecl;

    public $itp_section_iterator_native()
    {
      this.$parent = CommonSymbols.NIL;
      this.$span = CommonSymbols.NIL;
      this.$section = CommonSymbols.NIL;
      this.$current = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $itp_section_iterator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$parent;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$span;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$section;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$current;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$parent = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$span = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$section = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$current = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $itp_section_iterator_native.class, $sym27$ITP_SECTION_ITERATOR, $sym28$ITP_SECTION_ITERATOR_P, $list29, $list30, new String[] { "$parent", "$span", "$section",
        "$current"
      }, $list31, $list32, $sym33$ITP_PRINT_SECTION_ITERATOR );
    }
  }

  public static final class $itp_section_iterator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $itp_section_iterator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITP-SECTION-ITERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return itp_section_iterator_p( arg1 );
    }
  }

  public static final class $itp_child_iterator_native
      extends
        SubLStructNative
  {
    public SubLObject $parent;
    public SubLObject $rop_formula;
    public SubLObject $section;
    private static final SubLStructDeclNative structDecl;

    public $itp_child_iterator_native()
    {
      this.$parent = CommonSymbols.NIL;
      this.$rop_formula = CommonSymbols.NIL;
      this.$section = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $itp_child_iterator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$parent;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$rop_formula;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$section;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$parent = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$rop_formula = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$section = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $itp_child_iterator_native.class, $sym50$ITP_CHILD_ITERATOR, $sym51$ITP_CHILD_ITERATOR_P, $list52, $list53, new String[] { "$parent", "$rop_formula", "$section"
      }, $list54, $list55, $sym56$ITP_PRINT_CHILD_ITERATOR );
    }
  }

  public static final class $itp_child_iterator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $itp_child_iterator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ITP-CHILD-ITERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return itp_child_iterator_p( arg1 );
    }
  }

  public static final class $rtp_iterator_native
      extends
        SubLStructNative
  {
    public SubLObject $string;
    public SubLObject $parsing_mt;
    public SubLObject $semantic_mt;
    public SubLObject $strengthenP;
    public SubLObject $multiple_quantificationsP;
    public SubLObject $wff_checkP;
    public SubLObject $force;
    public SubLObject $raw_parses;
    public SubLObject $result_queue;
    public SubLObject $initialized;
    public SubLObject $template_category;
    public SubLObject $memoization_state;
    public SubLObject $sbhl_resource;
    private static final SubLStructDeclNative structDecl;

    public $rtp_iterator_native()
    {
      this.$string = CommonSymbols.NIL;
      this.$parsing_mt = CommonSymbols.NIL;
      this.$semantic_mt = CommonSymbols.NIL;
      this.$strengthenP = CommonSymbols.NIL;
      this.$multiple_quantificationsP = CommonSymbols.NIL;
      this.$wff_checkP = CommonSymbols.NIL;
      this.$force = CommonSymbols.NIL;
      this.$raw_parses = CommonSymbols.NIL;
      this.$result_queue = CommonSymbols.NIL;
      this.$initialized = CommonSymbols.NIL;
      this.$template_category = CommonSymbols.NIL;
      this.$memoization_state = CommonSymbols.NIL;
      this.$sbhl_resource = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rtp_iterator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$string;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$parsing_mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$semantic_mt;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$strengthenP;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$multiple_quantificationsP;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$wff_checkP;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$force;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$raw_parses;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$result_queue;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$initialized;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$template_category;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$memoization_state;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$sbhl_resource;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$string = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$parsing_mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$semantic_mt = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$strengthenP = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$multiple_quantificationsP = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$wff_checkP = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$force = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$raw_parses = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$result_queue = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$initialized = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$template_category = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$memoization_state = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$sbhl_resource = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rtp_iterator_native.class, $sym75$RTP_ITERATOR, $sym76$RTP_ITERATOR_P, $list77, $list78, new String[] { "$string", "$parsing_mt", "$semantic_mt", "$strengthenP",
        "$multiple_quantificationsP", "$wff_checkP", "$force", "$raw_parses", "$result_queue", "$initialized", "$template_category", "$memoization_state", "$sbhl_resource"
      }, $list79, $list80, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $rtp_iterator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rtp_iterator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RTP-ITERATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rtp_iterator_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 317 ms
 * 
 */