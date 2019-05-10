package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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

public final class sbhl_link_iterators
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_link_iterators";
  public static final String myFingerPrint = "6ed45359635277fa66024597770de93fb4d798b8e01774a1b3d5153c30c100ed";
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLSymbol $dtp_sbhl_link_node_search_state_iterator_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLSymbol $dtp_sbhl_module_direction_link_search_state_iterator_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLSymbol $dtp_sbhl_module_tv_link_node_search_state_iterator_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLSymbol $dtp_sbhl_module_naut_link_node_search_state_iterator_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27287L)
  public static SubLSymbol $sbhl_link_node_search_state_iterator_state_store$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27469L)
  public static SubLSymbol $sbhl_module_direction_link_search_state_iterator_state_store$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27561L)
  public static SubLSymbol $sbhl_module_tv_link_node_search_state_iterator_state_store$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27651L)
  public static SubLSymbol $sbhl_module_naut_link_node_search_state_iterator_state_store$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27743L)
  public static SubLSymbol $sbhl_link_iterator_resourcingP$;
  private static final SubLSymbol $sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $sym1$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_;
  private static final SubLSymbol $sym10$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_;
  private static final SubLSymbol $sym11$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES;
  private static final SubLSymbol $sym12$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL;
  private static final SubLSymbol $sym13$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA;
  private static final SubLSymbol $sym14$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA;
  private static final SubLSymbol $kw15$SBHL_LINK_NODE_SEARCH_STATE;
  private static final SubLSymbol $kw16$REMAINING_MODULES;
  private static final SubLSymbol $kw17$MODULE_NODE_SEARCH_STATE_ITERATOR;
  private static final SubLString $str18$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw19$BEGIN;
  private static final SubLSymbol $sym20$MAKE_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $kw21$SLOT;
  private static final SubLSymbol $kw22$END;
  private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $sym24$GET_SBHL_MODULE;
  private static final SubLSymbol $sym25$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE;
  private static final SubLSymbol $sym26$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT;
  private static final SubLSymbol $sym27$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE;
  private static final SubLString $str28$_a_is_neither_an_SBHL_node__FORT_;
  private static final SubLString $str29$No__a_direction_links_for__a_with;
  private static final SubLString $str30$No_generating_functions_for_direc;
  private static final SubLSymbol $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $sym32$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT;
  private static final SubLSymbol $sym40$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_;
  private static final SubLSymbol $sym41$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE;
  private static final SubLSymbol $sym42$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_;
  private static final SubLSymbol $sym43$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK;
  private static final SubLSymbol $sym44$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA;
  private static final SubLSymbol $sym45$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE;
  private static final SubLSymbol $sym46$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD;
  private static final SubLSymbol $sym47$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE;
  private static final SubLSymbol $sym48$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD;
  private static final SubLSymbol $sym49$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION;
  private static final SubLSymbol $sym50$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR;
  private static final SubLSymbol $sym51$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER;
  private static final SubLSymbol $sym52$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN;
  private static final SubLSymbol $kw53$MT_LINK_ITERATOR;
  private static final SubLSymbol $kw54$TV_LINK_SEARCH_STATE_ITERATOR;
  private static final SubLSymbol $kw55$GRAPH_LINK;
  private static final SubLSymbol $kw56$MODULE;
  private static final SubLSymbol $kw57$NODE;
  private static final SubLSymbol $kw58$DIRECTION;
  private static final SubLSymbol $kw59$GENL_INVERSE_MODE_;
  private static final SubLSymbol $sym60$MAKE_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_IT;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE;
  private static final SubLSymbol $sym64$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT;
  private static final SubLSymbol $sym65$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym66$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $sym67$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER;
  private static final SubLSymbol $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI;
  private static final SubLSymbol $sym76$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV;
  private static final SubLSymbol $sym77$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE;
  private static final SubLSymbol $sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA;
  private static final SubLSymbol $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE;
  private static final SubLSymbol $sym80$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE;
  private static final SubLSymbol $sym81$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL;
  private static final SubLSymbol $sym82$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE;
  private static final SubLSymbol $sym83$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN;
  private static final SubLSymbol $sym84$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION;
  private static final SubLSymbol $sym85$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC;
  private static final SubLSymbol $sym86$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT;
  private static final SubLSymbol $sym87$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT;
  private static final SubLSymbol $sym88$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE;
  private static final SubLSymbol $sym89$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_;
  private static final SubLSymbol $kw90$TV_LINK_ITERATOR;
  private static final SubLSymbol $kw91$CURRENT_TV;
  private static final SubLSymbol $kw92$CURRENT_REMAINING_NODES;
  private static final SubLSymbol $kw93$PARENT_NODE;
  private static final SubLSymbol $kw94$MT;
  private static final SubLSymbol $sym95$MAKE_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $sym96$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITER;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE;
  private static final SubLSymbol $sym99$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT;
  private static final SubLSymbol $sym100$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym101$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $sym102$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING;
  private static final SubLSymbol $sym110$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN;
  private static final SubLSymbol $sym111$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE;
  private static final SubLSymbol $sym112$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR;
  private static final SubLSymbol $sym113$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE;
  private static final SubLSymbol $sym114$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR;
  private static final SubLSymbol $sym115$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE;
  private static final SubLSymbol $sym116$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD;
  private static final SubLSymbol $sym117$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD;
  private static final SubLSymbol $sym118$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR;
  private static final SubLSymbol $sym119$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION;
  private static final SubLSymbol $sym120$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR;
  private static final SubLSymbol $sym121$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT;
  private static final SubLSymbol $sym122$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT;
  private static final SubLSymbol $sym123$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV;
  private static final SubLSymbol $sym124$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV;
  private static final SubLSymbol $sym125$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER;
  private static final SubLSymbol $sym126$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN;
  private static final SubLSymbol $kw127$GENERATING_FUNCTIONS;
  private static final SubLSymbol $kw128$CURRENT_GENERATING_FUNCTION;
  private static final SubLSymbol $kw129$TV;
  private static final SubLSymbol $sym130$MAKE_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE;
  private static final SubLSymbol $sym131$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_IT;
  private static final SubLSymbol $sym132$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE;
  private static final SubLSymbol $sym133$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT;
  private static final SubLSymbol $sym134$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE;
  private static final SubLSymbol $sym135$CLET;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$WITH_SBHL_ITERATOR_RESOURCING;
  private static final SubLSymbol $sym138$WITH_SBHL_LINK_ITERATOR_STATE_RESOURCING;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject sbhl_link_node_search_state_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject sbhl_link_node_search_state_iterator_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sbhl_link_node_search_state_iterator_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(final SubLObject v_object)
  {
    assert NIL != sbhl_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject sbhl_link_node_search_state_iterator_state_remaining_modules(final SubLObject v_object)
  {
    assert NIL != sbhl_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(final SubLObject v_object)
  {
    assert NIL != sbhl_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject _csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject _csetf_sbhl_link_node_search_state_iterator_state_remaining_modules(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject _csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject make_sbhl_link_node_search_state_iterator_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sbhl_link_node_search_state_iterator_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw15$SBHL_LINK_NODE_SEARCH_STATE ) )
      {
        _csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw16$REMAINING_MODULES ) )
      {
        _csetf_sbhl_link_node_search_state_iterator_state_remaining_modules( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$MODULE_NODE_SEARCH_STATE_ITERATOR ) )
      {
        _csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject visit_defstruct_sbhl_link_node_search_state_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym20$MAKE_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw15$SBHL_LINK_NODE_SEARCH_STATE, sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw16$REMAINING_MODULES, sbhl_link_node_search_state_iterator_state_remaining_modules( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw17$MODULE_NODE_SEARCH_STATE_ITERATOR, sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym20$MAKE_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762L)
  public static SubLObject visit_defstruct_object_sbhl_link_node_search_state_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sbhl_link_node_search_state_iterator_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1909L)
  public static SubLObject generate_new_sbhl_link_node_search_state_iterator_state(final SubLObject sbhl_link_node_search_state)
  {
    final SubLObject state = find_or_create_sbhl_link_node_search_state_iterator_state();
    final SubLObject module = sbhl_search_datastructures.get_sbhl_link_node_search_state_module( sbhl_link_node_search_state );
    final SubLObject accessible_link_preds = sbhl_module_utilities.get_sbhl_accessible_link_preds( module );
    final SubLObject first_module = ( NIL != accessible_link_preds ) ? sbhl_module_vars.get_sbhl_module( accessible_link_preds.first() ) : module;
    _csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state( state, sbhl_link_node_search_state );
    _csetf_sbhl_link_node_search_state_iterator_state_remaining_modules( state, ( NIL != accessible_link_preds ) ? Mapping.mapcar( $sym24$GET_SBHL_MODULE, accessible_link_preds.rest() ) : NIL );
    _csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( state, new_sbhl_module_link_node_search_state_iterator( first_module, sbhl_link_node_search_state ) );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 2899L)
  public static SubLObject get_sbhl_link_node_search_state_iterator_state_next_module(final SubLObject state)
  {
    final SubLObject remaining_modules = sbhl_link_node_search_state_iterator_state_remaining_modules( state );
    if( NIL != remaining_modules )
    {
      _csetf_sbhl_link_node_search_state_iterator_state_remaining_modules( state, remaining_modules.rest() );
    }
    return remaining_modules.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 3269L)
  public static SubLObject update_sbhl_link_node_search_state_iterator_state(final SubLObject state)
  {
    if( NIL != sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( state ) )
    {
      sbhl_iteration.sbhl_iteration_finalize( sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( state ) );
    }
    final SubLObject next_module = get_sbhl_link_node_search_state_iterator_state_next_module( state );
    SubLObject iterator = NIL;
    if( NIL != next_module )
    {
      iterator = new_sbhl_module_link_node_search_state_iterator( next_module, sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state( state ) );
    }
    _csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( state, iterator );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 3966L)
  public static SubLObject sbhl_link_node_search_state_iterator_state_doneP(final SubLObject state)
  {
    return makeBoolean( NIL == sbhl_link_node_search_state_iterator_state_remaining_modules( state ) && ( NIL == sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( state )
        || NIL != sbhl_iteration.sbhl_iteration_doneP( sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( state ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 4348L)
  public static SubLObject new_sbhl_link_node_search_state_iterator(final SubLObject sbhl_search_state)
  {
    return sbhl_iteration.new_sbhl_iterator( generate_new_sbhl_link_node_search_state_iterator_state( sbhl_search_state ), $sym25$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE,
        $sym26$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, $sym27$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 4799L)
  public static SubLObject sbhl_link_node_search_state_iterator_done(final SubLObject state)
  {
    return sbhl_link_node_search_state_iterator_state_doneP( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 4934L)
  public static SubLObject sbhl_link_node_search_state_iterator_next(final SubLObject state)
  {
    SubLObject sbhl_link_node_search_state = NIL;
    SubLObject premature_haltP = NIL;
    while ( NIL == sbhl_link_node_search_state && NIL == premature_haltP)
    {
      sbhl_link_node_search_state = sbhl_iteration.sbhl_iteration_next( sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( state ) );
      if( NIL == sbhl_link_node_search_state )
      {
        update_sbhl_link_node_search_state_iterator_state( state );
        if( NIL == sbhl_link_node_search_state_iterator_state_doneP( state ) )
        {
          continue;
        }
        premature_haltP = T;
      }
    }
    return sbhl_link_node_search_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 5510L)
  public static SubLObject sbhl_link_node_search_state_iterator_finalize(final SubLObject state)
  {
    final SubLObject sbhl_iterator = sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator( state );
    final SubLObject result = makeBoolean( NIL == sbhl_iterator || NIL != sbhl_iteration.sbhl_iteration_finalize( sbhl_iterator ) );
    release_sbhl_link_node_search_state_iterator_state( state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 5869L)
  public static SubLObject new_sbhl_module_link_node_search_state_iterator(final SubLObject module, final SubLObject sbhl_link_node_search_state)
  {
    final SubLObject node = function_terms.naut_to_nart( sbhl_search_datastructures.get_sbhl_link_node_search_state_node( sbhl_link_node_search_state ) );
    if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
    {
      return new_fort_sbhl_module_link_node_search_state_iterator( module, node, sbhl_link_node_search_state );
    }
    if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
    {
      return new_naut_sbhl_module_link_node_search_state_iterator( module, node, sbhl_link_node_search_state );
    }
    sbhl_paranoia.sbhl_error( THREE_INTEGER, $str28$_a_is_neither_an_SBHL_node__FORT_, node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return sbhl_iteration.new_sbhl_null_iterator();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 6606L)
  public static SubLObject new_fort_sbhl_module_link_node_search_state_iterator(final SubLObject module, final SubLObject node, final SubLObject sbhl_link_node_search_state)
  {
    final SubLObject graph_link = sbhl_graphs.get_sbhl_graph_link( node, module );
    if( NIL != graph_link )
    {
      final SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction( sbhl_link_node_search_state );
      final SubLObject genl_inverse_modeP = ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( module, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(
          sbhl_link_node_search_state ) ) : sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP( sbhl_link_node_search_state );
      return new_sbhl_module_direction_link_search_state_iterator( direction, graph_link, module, node, genl_inverse_modeP );
    }
    final SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction( sbhl_link_node_search_state );
    sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str29$No__a_direction_links_for__a_with, direction, node, module, UNPROVIDED, UNPROVIDED );
    return sbhl_iteration.new_sbhl_null_iterator();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 7537L)
  public static SubLObject new_naut_sbhl_module_link_node_search_state_iterator(final SubLObject module, final SubLObject node, final SubLObject sbhl_link_node_search_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject direction = sbhl_search_datastructures.get_sbhl_link_node_search_state_direction( sbhl_link_node_search_state );
    final SubLObject tv = sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread );
    final SubLObject generating_functions = sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( direction, tv, module );
    if( NIL != generating_functions )
    {
      final SubLObject mt = sbhl_search_datastructures.get_sbhl_link_node_search_state_mt( sbhl_link_node_search_state );
      final SubLObject genl_inverse_modeP = ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( module, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP(
          sbhl_link_node_search_state ) ) : sbhl_search_datastructures.get_sbhl_link_node_search_state_genl_inverse_modeP( sbhl_link_node_search_state );
      return new_sbhl_module_naut_link_node_search_state_iterator( module, node, generating_functions, direction, mt, tv, genl_inverse_modeP );
    }
    sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str30$No_generating_functions_for_direc, direction, tv, module, UNPROVIDED, UNPROVIDED );
    return sbhl_iteration.new_sbhl_null_iterator();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sbhl_module_direction_link_search_state_iterator_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(final SubLObject v_object)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(final SubLObject v_object)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_graph_link(final SubLObject v_object)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_module(final SubLObject v_object)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_node(final SubLObject v_object)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_direction(final SubLObject v_object)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_module(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_node(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_direction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject _csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_direction_link_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject make_sbhl_module_direction_link_search_state_iterator_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sbhl_module_direction_link_search_state_iterator_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw53$MT_LINK_ITERATOR ) )
      {
        _csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$TV_LINK_SEARCH_STATE_ITERATOR ) )
      {
        _csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$GRAPH_LINK ) )
      {
        _csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$MODULE ) )
      {
        _csetf_sbhl_module_direction_link_search_state_iterator_state_module( v_new, current_value );
      }
      else if( pcase_var.eql( $kw57$NODE ) )
      {
        _csetf_sbhl_module_direction_link_search_state_iterator_state_node( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$DIRECTION ) )
      {
        _csetf_sbhl_module_direction_link_search_state_iterator_state_direction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$GENL_INVERSE_MODE_ ) )
      {
        _csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject visit_defstruct_sbhl_module_direction_link_search_state_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym60$MAKE_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw53$MT_LINK_ITERATOR, sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw54$TV_LINK_SEARCH_STATE_ITERATOR, sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw55$GRAPH_LINK, sbhl_module_direction_link_search_state_iterator_state_graph_link( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw56$MODULE, sbhl_module_direction_link_search_state_iterator_state_module( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw57$NODE, sbhl_module_direction_link_search_state_iterator_state_node( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw58$DIRECTION, sbhl_module_direction_link_search_state_iterator_state_direction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw59$GENL_INVERSE_MODE_, sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym60$MAKE_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590L)
  public static SubLObject visit_defstruct_object_sbhl_module_direction_link_search_state_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sbhl_module_direction_link_search_state_iterator_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9776L)
  public static SubLObject generate_new_sbhl_module_direction_link_search_state_iterator_state(final SubLObject direction, final SubLObject graph_link, final SubLObject module, final SubLObject node,
      final SubLObject genl_inverse_modeP)
  {
    final SubLObject state = find_or_create_sbhl_module_direction_link_search_state_iterator_state();
    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( graph_link, direction, module );
    _csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator( state, ( NIL != mt_links ) ? sbhl_iteration.new_sbhl_dictionary_iterator( mt_links ) : sbhl_iteration.new_sbhl_null_iterator() );
    _csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state, sbhl_iteration.new_sbhl_null_iterator() );
    _csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link( state, graph_link );
    _csetf_sbhl_module_direction_link_search_state_iterator_state_module( state, module );
    _csetf_sbhl_module_direction_link_search_state_iterator_state_node( state, node );
    _csetf_sbhl_module_direction_link_search_state_iterator_state_direction( state, direction );
    _csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP( state, genl_inverse_modeP );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 10892L)
  public static SubLObject update_sbhl_module_direction_link_search_state_iterator_state(final SubLObject state)
  {
    if( NIL != sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state ) )
    {
      sbhl_iteration.sbhl_iteration_finalize( sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state ) );
    }
    final SubLObject mt_link_iterator = sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator( state );
    final SubLObject mt_link_pair = sbhl_iteration.sbhl_iteration_next( mt_link_iterator );
    SubLObject new_tv_link_iterator = NIL;
    if( NIL != mt_link_pair )
    {
      SubLObject current;
      final SubLObject datum = current = mt_link_pair;
      SubLObject mt = NIL;
      SubLObject tv_links = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      tv_links = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
        {
          final SubLObject module = sbhl_module_direction_link_search_state_iterator_state_module( state );
          final SubLObject node = sbhl_module_direction_link_search_state_iterator_state_node( state );
          final SubLObject direction = sbhl_module_direction_link_search_state_iterator_state_direction( state );
          final SubLObject genl_inverse_modeP = sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP( state );
          new_tv_link_iterator = new_sbhl_module_tv_link_node_search_state_iterator( tv_links, module, node, direction, mt, genl_inverse_modeP );
        }
        else
        {
          new_tv_link_iterator = sbhl_iteration.new_sbhl_null_iterator();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
      }
    }
    _csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state, new_tv_link_iterator );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 12271L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_doneP(final SubLObject state)
  {
    return makeBoolean( NIL != sbhl_iteration.sbhl_iteration_doneP( sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator( state ) )
        && ( NIL == sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state ) || NIL != sbhl_iteration.sbhl_iteration_doneP(
            sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 12702L)
  public static SubLObject new_sbhl_module_direction_link_search_state_iterator(final SubLObject direction, final SubLObject graph_link, final SubLObject module, final SubLObject node,
      final SubLObject genl_inverse_modeP)
  {
    return sbhl_iteration.new_sbhl_iterator( generate_new_sbhl_module_direction_link_search_state_iterator_state( direction, graph_link, module, node, genl_inverse_modeP ),
        $sym63$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE, $sym64$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT, $sym65$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 13321L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_done(final SubLObject state)
  {
    return sbhl_module_direction_link_search_state_iterator_doneP( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 13474L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_next(final SubLObject state)
  {
    SubLObject search_state = NIL;
    SubLObject premature_haltP = NIL;
    while ( NIL == search_state && NIL == premature_haltP)
    {
      search_state = sbhl_iteration.sbhl_iteration_next( sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state ) );
      if( NIL == search_state )
      {
        update_sbhl_module_direction_link_search_state_iterator_state( state );
        if( NIL != sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state ) )
        {
          continue;
        }
        premature_haltP = T;
      }
    }
    return search_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 14043L)
  public static SubLObject sbhl_module_direction_link_search_state_iterator_finalize(final SubLObject state)
  {
    final SubLObject mt_sbhl_iterator = sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator( state );
    final SubLObject tv_sbhl_iterator = sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator( state );
    final SubLObject result_mt = makeBoolean( NIL == mt_sbhl_iterator || NIL != sbhl_iteration.sbhl_iteration_finalize( mt_sbhl_iterator ) );
    final SubLObject result_tv = makeBoolean( NIL == tv_sbhl_iterator || NIL != sbhl_iteration.sbhl_iteration_finalize( tv_sbhl_iterator ) );
    release_sbhl_module_direction_link_search_state_iterator_state( state );
    return makeBoolean( NIL != result_mt && NIL != result_tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sbhl_module_tv_link_node_search_state_iterator_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(final SubLObject v_object)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_current_tv(final SubLObject v_object)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(final SubLObject v_object)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_module(final SubLObject v_object)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_parent_node(final SubLObject v_object)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_direction(final SubLObject v_object)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_mt(final SubLObject v_object)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_module(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject _csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_tv_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject make_sbhl_module_tv_link_node_search_state_iterator_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sbhl_module_tv_link_node_search_state_iterator_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw90$TV_LINK_ITERATOR ) )
      {
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw91$CURRENT_TV ) )
      {
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv( v_new, current_value );
      }
      else if( pcase_var.eql( $kw92$CURRENT_REMAINING_NODES ) )
      {
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$MODULE ) )
      {
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_module( v_new, current_value );
      }
      else if( pcase_var.eql( $kw93$PARENT_NODE ) )
      {
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$DIRECTION ) )
      {
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw94$MT ) )
      {
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$GENL_INVERSE_MODE_ ) )
      {
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject visit_defstruct_sbhl_module_tv_link_node_search_state_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym95$MAKE_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw90$TV_LINK_ITERATOR, sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw91$CURRENT_TV, sbhl_module_tv_link_node_search_state_iterator_state_current_tv( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw92$CURRENT_REMAINING_NODES, sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw56$MODULE, sbhl_module_tv_link_node_search_state_iterator_state_module( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw93$PARENT_NODE, sbhl_module_tv_link_node_search_state_iterator_state_parent_node( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw58$DIRECTION, sbhl_module_tv_link_node_search_state_iterator_state_direction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw94$MT, sbhl_module_tv_link_node_search_state_iterator_state_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw59$GENL_INVERSE_MODE_, sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym95$MAKE_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674L)
  public static SubLObject visit_defstruct_object_sbhl_module_tv_link_node_search_state_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sbhl_module_tv_link_node_search_state_iterator_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15864L)
  public static SubLObject generate_new_sbhl_module_tv_link_node_search_state_iterator_state(final SubLObject tv_links, final SubLObject module, final SubLObject parent_node, final SubLObject direction,
      final SubLObject mt, final SubLObject genl_inverse_modeP)
  {
    final SubLObject state = find_or_create_sbhl_module_tv_link_node_search_state_iterator_state();
    _csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator( state, sbhl_iteration.new_sbhl_dictionary_iterator( tv_links ) );
    _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv( state, NIL );
    _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes( state, NIL );
    _csetf_sbhl_module_tv_link_node_search_state_iterator_state_module( state, module );
    _csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node( state, parent_node );
    _csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction( state, direction );
    _csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt( state, mt );
    _csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP( state, genl_inverse_modeP );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 16902L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_doneP(final SubLObject state)
  {
    return makeBoolean( NIL == sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes( state ) && NIL != sbhl_iteration.sbhl_iteration_doneP(
        sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator( state ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 17201L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state(final SubLObject state)
  {
    SubLObject sbhl_link_node_search_state = NIL;
    while ( NIL == sbhl_link_node_search_state && NIL == sbhl_module_tv_link_node_search_state_iterator_state_doneP( state ))
    {
      final SubLObject remaining_nodes = sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes( state );
      if( NIL != remaining_nodes )
      {
        sbhl_link_node_search_state = sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state( remaining_nodes.first(), state );
        _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes( state, remaining_nodes.rest() );
      }
      else
      {
        final SubLObject tv_link_pair = sbhl_iteration.sbhl_iteration_next( sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator( state ) );
        if( NIL == tv_link_pair )
        {
          continue;
        }
        SubLObject current;
        final SubLObject datum = current = tv_link_pair;
        SubLObject tv = NIL;
        SubLObject links = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
        tv = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
        links = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL == sbhl_search_vars.relevant_sbhl_tvP( tv ) )
          {
            continue;
          }
          _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv( state, tv );
          sbhl_link_node_search_state = sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state( links.first(), state );
          _csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes( state, links.rest() );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list97 );
        }
      }
    }
    return sbhl_link_node_search_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 18544L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(final SubLObject node, final SubLObject state)
  {
    final SubLObject tv = sbhl_module_tv_link_node_search_state_iterator_state_current_tv( state );
    final SubLObject module = sbhl_module_tv_link_node_search_state_iterator_state_module( state );
    final SubLObject parent_node = sbhl_module_tv_link_node_search_state_iterator_state_parent_node( state );
    final SubLObject direction = sbhl_module_tv_link_node_search_state_iterator_state_direction( state );
    final SubLObject mt = sbhl_module_tv_link_node_search_state_iterator_state_mt( state );
    final SubLObject genl_inverse_modeP = sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP( state );
    return sbhl_search_datastructures.new_sbhl_link_node_search_state( node, module, direction, mt, tv, parent_node, genl_inverse_modeP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 19343L)
  public static SubLObject new_sbhl_module_tv_link_node_search_state_iterator(final SubLObject tv_links, final SubLObject module, final SubLObject parent_node, final SubLObject direction, final SubLObject mt,
      final SubLObject genl_inverse_modeP)
  {
    return sbhl_iteration.new_sbhl_iterator( generate_new_sbhl_module_tv_link_node_search_state_iterator_state( tv_links, module, parent_node, direction, mt, genl_inverse_modeP ),
        $sym98$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE, $sym99$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, $sym100$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 19964L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_done(final SubLObject state)
  {
    return sbhl_module_tv_link_node_search_state_iterator_state_doneP( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 20119L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_next(final SubLObject state)
  {
    return sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 20301L)
  public static SubLObject sbhl_module_tv_link_node_search_state_iterator_finalize(final SubLObject state)
  {
    final SubLObject sbhl_iterator = sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator( state );
    final SubLObject result = makeBoolean( NIL == sbhl_iterator || NIL != sbhl_iteration.sbhl_iteration_finalize( sbhl_iterator ) );
    release_sbhl_module_tv_link_node_search_state_iterator_state( state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sbhl_module_naut_link_node_search_state_iterator_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_module(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_parent_node(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_direction(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_mt(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_tv(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_module(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject _csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_naut_link_node_search_state_iterator_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject make_sbhl_module_naut_link_node_search_state_iterator_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sbhl_module_naut_link_node_search_state_iterator_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw127$GENERATING_FUNCTIONS ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw128$CURRENT_GENERATING_FUNCTION ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw92$CURRENT_REMAINING_NODES ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$MODULE ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_module( v_new, current_value );
      }
      else if( pcase_var.eql( $kw93$PARENT_NODE ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$DIRECTION ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw94$MT ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw129$TV ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$GENL_INVERSE_MODE_ ) )
      {
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject visit_defstruct_sbhl_module_naut_link_node_search_state_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym130$MAKE_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw127$GENERATING_FUNCTIONS, sbhl_module_naut_link_node_search_state_iterator_state_generating_functions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw128$CURRENT_GENERATING_FUNCTION, sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw92$CURRENT_REMAINING_NODES, sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw56$MODULE, sbhl_module_naut_link_node_search_state_iterator_state_module( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw93$PARENT_NODE, sbhl_module_naut_link_node_search_state_iterator_state_parent_node( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw58$DIRECTION, sbhl_module_naut_link_node_search_state_iterator_state_direction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw94$MT, sbhl_module_naut_link_node_search_state_iterator_state_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw129$TV, sbhl_module_naut_link_node_search_state_iterator_state_tv( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw59$GENL_INVERSE_MODE_, sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym130$MAKE_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796L)
  public static SubLObject visit_defstruct_object_sbhl_module_naut_link_node_search_state_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sbhl_module_naut_link_node_search_state_iterator_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 22014L)
  public static SubLObject generate_new_sbhl_module_naut_link_node_search_state_iterator_state(final SubLObject generating_functions, final SubLObject module, final SubLObject node, final SubLObject direction,
      final SubLObject mt, final SubLObject tv, final SubLObject genl_inverse_modeP)
  {
    final SubLObject state = find_or_create_sbhl_module_naut_link_node_search_state_iterator_state();
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions( state, generating_functions );
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function( state, NIL );
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes( state, NIL );
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_module( state, module );
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node( state, node );
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction( state, direction );
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt( state, mt );
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv( state, tv );
    _csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP( state, genl_inverse_modeP );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 23155L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_doneP(final SubLObject state)
  {
    return makeBoolean( NIL == sbhl_module_naut_link_node_search_state_iterator_state_generating_functions( state ) && NIL == sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 23448L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state(final SubLObject state)
  {
    SubLObject sbhl_link_node_search_state = NIL;
    while ( NIL == sbhl_link_node_search_state && NIL == sbhl_module_naut_link_node_search_state_iterator_state_doneP( state ))
    {
      final SubLObject remaining_nodes = sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes( state );
      if( NIL != remaining_nodes )
      {
        sbhl_link_node_search_state = sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state( remaining_nodes.first(), state );
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes( state, remaining_nodes.rest() );
      }
      else
      {
        final SubLObject remaining_generating_functions = sbhl_module_naut_link_node_search_state_iterator_state_generating_functions( state );
        if( NIL == remaining_generating_functions )
        {
          continue;
        }
        final SubLObject generating_function = remaining_generating_functions.first();
        final SubLObject node = sbhl_module_naut_link_node_search_state_iterator_state_parent_node( state );
        final SubLObject new_nodes = Functions.funcall( generating_function, node );
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions( state, remaining_generating_functions.rest() );
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function( state, generating_function );
        if( NIL == new_nodes )
        {
          continue;
        }
        sbhl_link_node_search_state = sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state( new_nodes.first(), state );
        _csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes( state, new_nodes.rest() );
      }
    }
    return sbhl_link_node_search_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 25170L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state(final SubLObject node, final SubLObject state)
  {
    final SubLObject generating_function = sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function( state );
    final SubLObject module = sbhl_module_naut_link_node_search_state_iterator_state_module( state );
    final SubLObject parent_node = sbhl_module_naut_link_node_search_state_iterator_state_parent_node( state );
    final SubLObject direction = sbhl_module_naut_link_node_search_state_iterator_state_direction( state );
    final SubLObject mt = sbhl_module_naut_link_node_search_state_iterator_state_mt( state );
    final SubLObject tv = sbhl_module_naut_link_node_search_state_iterator_state_tv( state );
    final SubLObject genl_inverse_modeP = sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP( state );
    return sbhl_search_datastructures.new_sbhl_link_node_search_state( node, module, direction, mt, tv, parent_node, genl_inverse_modeP, generating_function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 26116L)
  public static SubLObject new_sbhl_module_naut_link_node_search_state_iterator(final SubLObject module, final SubLObject node, final SubLObject generating_functions, final SubLObject direction, final SubLObject mt,
      final SubLObject tv, final SubLObject genl_inverse_modeP)
  {
    return sbhl_iteration.new_sbhl_iterator( generate_new_sbhl_module_naut_link_node_search_state_iterator_state( generating_functions, module, node, direction, mt, tv, genl_inverse_modeP ),
        $sym132$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE, $sym133$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT, $sym134$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 26773L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_done(final SubLObject state)
  {
    return sbhl_module_naut_link_node_search_state_iterator_state_doneP( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 26932L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_next(final SubLObject state)
  {
    return sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27118L)
  public static SubLObject sbhl_module_naut_link_node_search_state_iterator_finalize(final SubLObject state)
  {
    release_sbhl_module_naut_link_node_search_state_iterator_state( state );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27806L)
  public static SubLObject within_sbhl_link_iterator_resourcingP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $sbhl_link_iterator_resourcingP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27908L)
  public static SubLObject with_sbhl_link_iterator_state_resourcing(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym135$CLET, $list136, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 28973L)
  public static SubLObject with_sbhl_link_iterator_resourcing(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym137$WITH_SBHL_ITERATOR_RESOURCING, reader.bq_cons( $sym138$WITH_SBHL_LINK_ITERATOR_STATE_RESOURCING, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 29142L)
  public static SubLObject find_or_create_sbhl_link_node_search_state_iterator_state()
  {
    final SubLObject iterator_state_shell = find_sbhl_link_node_search_state_iterator_state();
    return ( NIL != iterator_state_shell ) ? iterator_state_shell : make_sbhl_link_node_search_state_iterator_state( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 29398L)
  public static SubLObject find_sbhl_link_node_search_state_iterator_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != within_sbhl_link_iterator_resourcingP() ) ? sbhl_search_datastructures.sbhl_stack_pop( $sbhl_link_node_search_state_iterator_state_store$.getDynamicValue( thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 29593L)
  public static SubLObject release_sbhl_link_node_search_state_iterator_state(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != within_sbhl_link_iterator_resourcingP() )
    {
      sbhl_search_datastructures.sbhl_stack_push( state, $sbhl_link_node_search_state_iterator_state_store$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 29813L)
  public static SubLObject find_or_create_sbhl_module_direction_link_search_state_iterator_state()
  {
    final SubLObject iterator_state_shell = find_sbhl_module_direction_link_search_state_iterator_state();
    return ( NIL != iterator_state_shell ) ? iterator_state_shell : make_sbhl_module_direction_link_search_state_iterator_state( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 30105L)
  public static SubLObject find_sbhl_module_direction_link_search_state_iterator_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != within_sbhl_link_iterator_resourcingP() ) ? sbhl_search_datastructures.sbhl_stack_pop( $sbhl_module_direction_link_search_state_iterator_state_store$.getDynamicValue( thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 30324L)
  public static SubLObject release_sbhl_module_direction_link_search_state_iterator_state(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != within_sbhl_link_iterator_resourcingP() )
    {
      sbhl_search_datastructures.sbhl_stack_push( state, $sbhl_module_direction_link_search_state_iterator_state_store$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 30568L)
  public static SubLObject find_or_create_sbhl_module_tv_link_node_search_state_iterator_state()
  {
    final SubLObject iterator_state_shell = find_sbhl_module_tv_link_node_search_state_iterator_state();
    return ( NIL != iterator_state_shell ) ? iterator_state_shell : make_sbhl_module_tv_link_node_search_state_iterator_state( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 30854L)
  public static SubLObject find_sbhl_module_tv_link_node_search_state_iterator_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != within_sbhl_link_iterator_resourcingP() ) ? sbhl_search_datastructures.sbhl_stack_pop( $sbhl_module_tv_link_node_search_state_iterator_state_store$.getDynamicValue( thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 31069L)
  public static SubLObject release_sbhl_module_tv_link_node_search_state_iterator_state(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != within_sbhl_link_iterator_resourcingP() )
    {
      sbhl_search_datastructures.sbhl_stack_push( state, $sbhl_module_tv_link_node_search_state_iterator_state_store$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 31309L)
  public static SubLObject find_or_create_sbhl_module_naut_link_node_search_state_iterator_state()
  {
    final SubLObject iterator_state_shell = find_sbhl_module_naut_link_node_search_state_iterator_state();
    return ( NIL != iterator_state_shell ) ? iterator_state_shell : make_sbhl_module_naut_link_node_search_state_iterator_state( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 31601L)
  public static SubLObject find_sbhl_module_naut_link_node_search_state_iterator_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != within_sbhl_link_iterator_resourcingP() ) ? sbhl_search_datastructures.sbhl_stack_pop( $sbhl_module_naut_link_node_search_state_iterator_state_store$.getDynamicValue( thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 31820L)
  public static SubLObject release_sbhl_module_naut_link_node_search_state_iterator_state(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != within_sbhl_link_iterator_resourcingP() )
    {
      sbhl_search_datastructures.sbhl_stack_push( state, $sbhl_module_naut_link_node_search_state_iterator_state_store$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  public static SubLObject declare_sbhl_link_iterators_file()
  {
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_state_p", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false );
    new $sbhl_link_node_search_state_iterator_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_state_remaining_modules", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_link_node_search_state_iterator_state_remaining_modules", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR", 2, 0,
        false );
    SubLFiles.declareFunction( me, "make_sbhl_link_node_search_state_iterator_state", "MAKE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sbhl_link_node_search_state_iterator_state", "VISIT-DEFSTRUCT-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sbhl_link_node_search_state_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_new_sbhl_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_link_node_search_state_iterator_state_next_module", "GET-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "update_sbhl_link_node_search_state_iterator_state", "UPDATE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_state_doneP", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_link_node_search_state_iterator", "NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_done", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_next", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_node_search_state_iterator_finalize", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_module_link_node_search_state_iterator", "NEW-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_fort_sbhl_module_link_node_search_state_iterator", "NEW-FORT-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "new_naut_sbhl_module_link_node_search_state_iterator", "NEW-NAUT-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_p", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false );
    new $sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR", 1, 0,
        false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_graph_link", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_module", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_node", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_direction", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator",
        "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_direction_link_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_direction_link_search_state_iterator_state_node", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_direction_link_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sbhl_module_direction_link_search_state_iterator_state", "MAKE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sbhl_module_direction_link_search_state_iterator_state", "VISIT-DEFSTRUCT-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sbhl_module_direction_link_search_state_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-METHOD", 2, 0,
        false );
    SubLFiles.declareFunction( me, "generate_new_sbhl_module_direction_link_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 5, 0, false );
    SubLFiles.declareFunction( me, "update_sbhl_module_direction_link_search_state_iterator_state", "UPDATE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_doneP", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_module_direction_link_search_state_iterator", "NEW-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR", 5, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_done", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_next", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_direction_link_search_state_iterator_finalize", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_p", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false );
    new $sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_current_tv", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_module", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_parent_node", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_direction", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_mt", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 2, 0,
        false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sbhl_module_tv_link_node_search_state_iterator_state", "MAKE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sbhl_module_tv_link_node_search_state_iterator_state", "VISIT-DEFSTRUCT-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sbhl_module_tv_link_node_search_state_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD", 2, 0,
        false );
    SubLFiles.declareFunction( me, "generate_new_sbhl_module_tv_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 6, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_doneP", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-SBHL-LINK-NODE-SEARCH-STATE", 1, 0,
        false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATE-SBHL-LINK-NODE-SEARCH-STATE",
        2, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_module_tv_link_node_search_state_iterator", "NEW-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR", 6, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_done", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_next", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_tv_link_node_search_state_iterator_finalize", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_p", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false );
    new $sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_generating_functions", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION", 1, 0,
        false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_module", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_parent_node", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_direction", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_mt", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_tv", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS", 2, 0,
        false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION",
        2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 2, 0,
        false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sbhl_module_naut_link_node_search_state_iterator_state", "MAKE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sbhl_module_naut_link_node_search_state_iterator_state", "VISIT-DEFSTRUCT-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sbhl_module_naut_link_node_search_state_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD", 2, 0,
        false );
    SubLFiles.declareFunction( me, "generate_new_sbhl_module_naut_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 7, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_doneP", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-SBHL-LINK-NODE-SEARCH-STATE", 1,
        0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state",
        "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATE-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_module_naut_link_node_search_state_iterator", "NEW-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR", 7, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_done", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_next", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_naut_link_node_search_state_iterator_finalize", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "within_sbhl_link_iterator_resourcingP", "WITHIN-SBHL-LINK-ITERATOR-RESOURCING?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_sbhl_link_iterator_state_resourcing", "WITH-SBHL-LINK-ITERATOR-STATE-RESOURCING" );
    SubLFiles.declareMacro( me, "with_sbhl_link_iterator_resourcing", "WITH-SBHL-LINK-ITERATOR-RESOURCING" );
    SubLFiles.declareFunction( me, "find_or_create_sbhl_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_sbhl_link_node_search_state_iterator_state", "FIND-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "release_sbhl_link_node_search_state_iterator_state", "RELEASE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_sbhl_module_direction_link_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_sbhl_module_direction_link_search_state_iterator_state", "FIND-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "release_sbhl_module_direction_link_search_state_iterator_state", "RELEASE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_sbhl_module_tv_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_sbhl_module_tv_link_node_search_state_iterator_state", "FIND-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "release_sbhl_module_tv_link_node_search_state_iterator_state", "RELEASE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_sbhl_module_naut_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_sbhl_module_naut_link_node_search_state_iterator_state", "FIND-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "release_sbhl_module_naut_link_node_search_state_iterator_state", "RELEASE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sbhl_link_iterators_file()
  {
    $dtp_sbhl_link_node_search_state_iterator_state$ = SubLFiles.defconstant( "*DTP-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", $sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE );
    $dtp_sbhl_module_direction_link_search_state_iterator_state$ = SubLFiles.defconstant( "*DTP-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE*", $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE );
    $dtp_sbhl_module_tv_link_node_search_state_iterator_state$ = SubLFiles.defconstant( "*DTP-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", $sym66$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE );
    $dtp_sbhl_module_naut_link_node_search_state_iterator_state$ = SubLFiles.defconstant( "*DTP-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", $sym101$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE );
    $sbhl_link_node_search_state_iterator_state_store$ = SubLFiles.defparameter( "*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL );
    $sbhl_module_direction_link_search_state_iterator_state_store$ = SubLFiles.defparameter( "*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL );
    $sbhl_module_tv_link_node_search_state_iterator_state_store$ = SubLFiles.defparameter( "*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL );
    $sbhl_module_naut_link_node_search_state_iterator_state_store$ = SubLFiles.defparameter( "*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL );
    $sbhl_link_iterator_resourcingP$ = SubLFiles.defparameter( "*SBHL-LINK-ITERATOR-RESOURCING?*", NIL );
    return NIL;
  }

  public static SubLObject setup_sbhl_link_iterators_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_, $sym10$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_ );
    Structures.def_csetf( $sym11$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES, $sym12$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL );
    Structures.def_csetf( $sym13$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA, $sym14$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA );
    Equality.identity( $sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym23$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym37$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC ) );
    SubLSpecialOperatorDeclarations.proclaim( $list38 );
    Structures.def_csetf( $sym39$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT, $sym40$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_ );
    Structures.def_csetf( $sym41$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE, $sym42$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_ );
    Structures.def_csetf( $sym43$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK, $sym44$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA );
    Structures.def_csetf( $sym45$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym46$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD );
    Structures.def_csetf( $sym47$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE, $sym48$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD );
    Structures.def_csetf( $sym49$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym50$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR );
    Structures.def_csetf( $sym51$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, $sym52$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN );
    Equality.identity( $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym61$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_IT ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym72$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI ) );
    SubLSpecialOperatorDeclarations.proclaim( $list73 );
    Structures.def_csetf( $sym74$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER, $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI );
    Structures.def_csetf( $sym76$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV, $sym77$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE );
    Structures.def_csetf( $sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA, $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE );
    Structures.def_csetf( $sym80$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym81$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL );
    Structures.def_csetf( $sym82$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE, $sym83$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN );
    Structures.def_csetf( $sym84$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym85$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC );
    Structures.def_csetf( $sym86$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, $sym87$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT );
    Structures.def_csetf( $sym88$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE, $sym89$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_ );
    Equality.identity( $sym66$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym96$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITER ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym107$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC ) );
    SubLSpecialOperatorDeclarations.proclaim( $list108 );
    Structures.def_csetf( $sym109$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING, $sym110$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN );
    Structures.def_csetf( $sym111$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE, $sym112$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR );
    Structures.def_csetf( $sym113$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE, $sym114$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR );
    Structures.def_csetf( $sym115$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym116$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD );
    Structures.def_csetf( $sym117$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD, $sym118$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR );
    Structures.def_csetf( $sym119$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym120$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR );
    Structures.def_csetf( $sym121$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, $sym122$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT );
    Structures.def_csetf( $sym123$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV, $sym124$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV );
    Structures.def_csetf( $sym125$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, $sym126$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN );
    Equality.identity( $sym101$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym131$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_IT ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_link_iterators_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_link_iterators_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_link_iterators_file();
  }
  static
  {
    me = new sbhl_link_iterators();
    $dtp_sbhl_link_node_search_state_iterator_state$ = null;
    $dtp_sbhl_module_direction_link_search_state_iterator_state$ = null;
    $dtp_sbhl_module_tv_link_node_search_state_iterator_state$ = null;
    $dtp_sbhl_module_naut_link_node_search_state_iterator_state$ = null;
    $sbhl_link_node_search_state_iterator_state_store$ = null;
    $sbhl_module_direction_link_search_state_iterator_state_store$ = null;
    $sbhl_module_tv_link_node_search_state_iterator_state_store$ = null;
    $sbhl_module_naut_link_node_search_state_iterator_state_store$ = null;
    $sbhl_link_iterator_resourcingP$ = null;
    $sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE" );
    $sym1$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" );
    $list2 = ConsesLow.list( makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE" ), makeSymbol( "REMAINING-MODULES" ), makeSymbol( "MODULE-NODE-SEARCH-STATE-ITERATOR" ) );
    $list3 = ConsesLow.list( makeKeyword( "SBHL-LINK-NODE-SEARCH-STATE" ), makeKeyword( "REMAINING-MODULES" ), makeKeyword( "MODULE-NODE-SEARCH-STATE-ITERATOR" ) );
    $list4 = ConsesLow.list( makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE" ), makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES" ), makeSymbol(
        "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE" ), makeSymbol( "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES" ), makeSymbol(
        "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" ) );
    $sym9$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_ = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE" );
    $sym10$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_ = makeSymbol( "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE" );
    $sym11$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES" );
    $sym12$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL = makeSymbol( "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES" );
    $sym13$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR" );
    $sym14$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA = makeSymbol( "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR" );
    $kw15$SBHL_LINK_NODE_SEARCH_STATE = makeKeyword( "SBHL-LINK-NODE-SEARCH-STATE" );
    $kw16$REMAINING_MODULES = makeKeyword( "REMAINING-MODULES" );
    $kw17$MODULE_NODE_SEARCH_STATE_ITERATOR = makeKeyword( "MODULE-NODE-SEARCH-STATE-ITERATOR" );
    $str18$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw19$BEGIN = makeKeyword( "BEGIN" );
    $sym20$MAKE_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "MAKE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE" );
    $kw21$SLOT = makeKeyword( "SLOT" );
    $kw22$END = makeKeyword( "END" );
    $sym23$VISIT_DEFSTRUCT_OBJECT_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD" );
    $sym24$GET_SBHL_MODULE = makeSymbol( "GET-SBHL-MODULE" );
    $sym25$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE" );
    $sym26$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT" );
    $sym27$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE" );
    $str28$_a_is_neither_an_SBHL_node__FORT_ = makeString( "~a is neither an SBHL node (FORT) nor a NAUT.  Returning a null-iterator." );
    $str29$No__a_direction_links_for__a_with = makeString( "No ~a direction links for ~a with module ~a.  Returning a null-iterator." );
    $str30$No_generating_functions_for_direc = makeString( "No generating functions for direction ~a, TV ~a, and module ~a.  Returning a null-iterator." );
    $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE" );
    $sym32$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P" );
    $list33 = ConsesLow.list( makeSymbol( "MT-LINK-ITERATOR" ), makeSymbol( "TV-LINK-SEARCH-STATE-ITERATOR" ), makeSymbol( "GRAPH-LINK" ), makeSymbol( "MODULE" ), makeSymbol( "NODE" ), makeSymbol( "DIRECTION" ),
        makeSymbol( "GENL-INVERSE-MODE?" ) );
    $list34 = ConsesLow.list( makeKeyword( "MT-LINK-ITERATOR" ), makeKeyword( "TV-LINK-SEARCH-STATE-ITERATOR" ), makeKeyword( "GRAPH-LINK" ), makeKeyword( "MODULE" ), makeKeyword( "NODE" ), makeKeyword( "DIRECTION" ),
        makeKeyword( "GENL-INVERSE-MODE?" ) );
    $list35 = ConsesLow.list( makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR" ), makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR" ),
        makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK" ), makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE" ), makeSymbol(
            "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE" ), makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION" ), makeSymbol(
                "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" ) );
    $list36 = ConsesLow.list( makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR" ), makeSymbol(
        "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR" ), makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK" ), makeSymbol(
            "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE" ), makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE" ), makeSymbol(
                "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION" ), makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" ) );
    $sym37$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list38 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P" ) );
    $sym39$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR" );
    $sym40$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_ = makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR" );
    $sym41$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR" );
    $sym42$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_ = makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR" );
    $sym43$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK" );
    $sym44$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA = makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK" );
    $sym45$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE" );
    $sym46$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD = makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE" );
    $sym47$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE" );
    $sym48$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD = makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE" );
    $sym49$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION" );
    $sym50$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR = makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION" );
    $sym51$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" );
    $sym52$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol( "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" );
    $kw53$MT_LINK_ITERATOR = makeKeyword( "MT-LINK-ITERATOR" );
    $kw54$TV_LINK_SEARCH_STATE_ITERATOR = makeKeyword( "TV-LINK-SEARCH-STATE-ITERATOR" );
    $kw55$GRAPH_LINK = makeKeyword( "GRAPH-LINK" );
    $kw56$MODULE = makeKeyword( "MODULE" );
    $kw57$NODE = makeKeyword( "NODE" );
    $kw58$DIRECTION = makeKeyword( "DIRECTION" );
    $kw59$GENL_INVERSE_MODE_ = makeKeyword( "GENL-INVERSE-MODE?" );
    $sym60$MAKE_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "MAKE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE" );
    $sym61$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_IT = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-METHOD" );
    $list62 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "TV-LINKS" ) );
    $sym63$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE" );
    $sym64$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT" );
    $sym65$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE" );
    $sym66$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE" );
    $sym67$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" );
    $list68 = ConsesLow.list( makeSymbol( "TV-LINK-ITERATOR" ), makeSymbol( "CURRENT-TV" ), makeSymbol( "CURRENT-REMAINING-NODES" ), makeSymbol( "MODULE" ), makeSymbol( "PARENT-NODE" ), makeSymbol( "DIRECTION" ),
        makeSymbol( "MT" ), makeSymbol( "GENL-INVERSE-MODE?" ) );
    $list69 = ConsesLow.list( makeKeyword( "TV-LINK-ITERATOR" ), makeKeyword( "CURRENT-TV" ), makeKeyword( "CURRENT-REMAINING-NODES" ), makeKeyword( "MODULE" ), makeKeyword( "PARENT-NODE" ), makeKeyword( "DIRECTION" ),
        makeKeyword( "MT" ), makeKeyword( "GENL-INVERSE-MODE?" ) );
    $list70 = ConsesLow.list( makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR" ), makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV" ), makeSymbol(
        "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES" ), makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE" ), makeSymbol(
            "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE" ), makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION" ), makeSymbol(
                "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT" ), makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" ) );
    $list71 = ConsesLow.list( makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR" ), makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV" ),
        makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES" ), makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE" ), makeSymbol(
            "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE" ), makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION" ), makeSymbol(
                "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT" ), makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" ) );
    $sym72$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list73 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" ) );
    $sym74$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR" );
    $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI = makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR" );
    $sym76$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV" );
    $sym77$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE = makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV" );
    $sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES" );
    $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE = makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES" );
    $sym80$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE" );
    $sym81$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL = makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE" );
    $sym82$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE" );
    $sym83$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN = makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE" );
    $sym84$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION" );
    $sym85$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC = makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION" );
    $sym86$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT" );
    $sym87$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT" );
    $sym88$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" );
    $sym89$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_ = makeSymbol( "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" );
    $kw90$TV_LINK_ITERATOR = makeKeyword( "TV-LINK-ITERATOR" );
    $kw91$CURRENT_TV = makeKeyword( "CURRENT-TV" );
    $kw92$CURRENT_REMAINING_NODES = makeKeyword( "CURRENT-REMAINING-NODES" );
    $kw93$PARENT_NODE = makeKeyword( "PARENT-NODE" );
    $kw94$MT = makeKeyword( "MT" );
    $sym95$MAKE_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "MAKE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE" );
    $sym96$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITER = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD" );
    $list97 = ConsesLow.list( makeSymbol( "TV" ), makeSymbol( "LINKS" ) );
    $sym98$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE" );
    $sym99$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT" );
    $sym100$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE" );
    $sym101$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE" );
    $sym102$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" );
    $list103 = ConsesLow.list( new SubLObject[] { makeSymbol( "GENERATING-FUNCTIONS" ), makeSymbol( "CURRENT-GENERATING-FUNCTION" ), makeSymbol( "CURRENT-REMAINING-NODES" ), makeSymbol( "MODULE" ), makeSymbol(
        "PARENT-NODE" ), makeSymbol( "DIRECTION" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "GENL-INVERSE-MODE?" )
    } );
    $list104 = ConsesLow.list( new SubLObject[] { makeKeyword( "GENERATING-FUNCTIONS" ), makeKeyword( "CURRENT-GENERATING-FUNCTION" ), makeKeyword( "CURRENT-REMAINING-NODES" ), makeKeyword( "MODULE" ), makeKeyword(
        "PARENT-NODE" ), makeKeyword( "DIRECTION" ), makeKeyword( "MT" ), makeKeyword( "TV" ), makeKeyword( "GENL-INVERSE-MODE?" )
    } );
    $list105 = ConsesLow.list( new SubLObject[] { makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS" ), makeSymbol(
        "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION" ), makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES" ), makeSymbol(
            "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE" ), makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE" ), makeSymbol(
                "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION" ), makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT" ), makeSymbol(
                    "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV" ), makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" )
    } );
    $list106 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS" ), makeSymbol(
        "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION" ), makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES" ), makeSymbol(
            "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE" ), makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE" ), makeSymbol(
                "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION" ), makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT" ), makeSymbol(
                    "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV" ), makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" )
    } );
    $sym107$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list108 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" ) );
    $sym109$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS" );
    $sym110$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS" );
    $sym111$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION" );
    $sym112$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION" );
    $sym113$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES" );
    $sym114$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES" );
    $sym115$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE" );
    $sym116$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE" );
    $sym117$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE" );
    $sym118$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE" );
    $sym119$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION" );
    $sym120$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION" );
    $sym121$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT" );
    $sym122$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT" );
    $sym123$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV" );
    $sym124$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV" );
    $sym125$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" );
    $sym126$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol( "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?" );
    $kw127$GENERATING_FUNCTIONS = makeKeyword( "GENERATING-FUNCTIONS" );
    $kw128$CURRENT_GENERATING_FUNCTION = makeKeyword( "CURRENT-GENERATING-FUNCTION" );
    $kw129$TV = makeKeyword( "TV" );
    $sym130$MAKE_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol( "MAKE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE" );
    $sym131$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_IT = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-METHOD" );
    $sym132$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE" );
    $sym133$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT" );
    $sym134$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE" );
    $sym135$CLET = makeSymbol( "CLET" );
    $list136 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol(
        "WITHIN-SBHL-LINK-ITERATOR-RESOURCING?" ) ), makeSymbol( "*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*" ), ConsesLow.list( makeSymbol( "NEW-SBHL-STACK" ) ) ) ), ConsesLow.list( makeSymbol(
            "*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "WITHIN-SBHL-LINK-ITERATOR-RESOURCING?" ) ), makeSymbol(
                "*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*" ), ConsesLow.list( makeSymbol( "NEW-SBHL-STACK" ) ) ) ), ConsesLow.list( makeSymbol(
                    "*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "WITHIN-SBHL-LINK-ITERATOR-RESOURCING?" ) ), makeSymbol(
                        "*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*" ), ConsesLow.list( makeSymbol( "NEW-SBHL-STACK" ) ) ) ), ConsesLow.list( makeSymbol(
                            "*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "WITHIN-SBHL-LINK-ITERATOR-RESOURCING?" ) ), makeSymbol(
                                "*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*" ), ConsesLow.list( makeSymbol( "NEW-SBHL-STACK" ) ) ) ), ConsesLow.list( makeSymbol( "*SBHL-LINK-ITERATOR-RESOURCING?*" ),
                                    T ) );
    $sym137$WITH_SBHL_ITERATOR_RESOURCING = makeSymbol( "WITH-SBHL-ITERATOR-RESOURCING" );
    $sym138$WITH_SBHL_LINK_ITERATOR_STATE_RESOURCING = makeSymbol( "WITH-SBHL-LINK-ITERATOR-STATE-RESOURCING" );
  }

  public static final class $sbhl_link_node_search_state_iterator_state_native
      extends
        SubLStructNative
  {
    public SubLObject $sbhl_link_node_search_state;
    public SubLObject $remaining_modules;
    public SubLObject $module_node_search_state_iterator;
    private static final SubLStructDeclNative structDecl;

    public $sbhl_link_node_search_state_iterator_state_native()
    {
      this.$sbhl_link_node_search_state = CommonSymbols.NIL;
      this.$remaining_modules = CommonSymbols.NIL;
      this.$module_node_search_state_iterator = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sbhl_link_node_search_state_iterator_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sbhl_link_node_search_state;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$remaining_modules;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$module_node_search_state_iterator;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sbhl_link_node_search_state = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$remaining_modules = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$module_node_search_state_iterator = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sbhl_link_node_search_state_iterator_state_native.class, $sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, $sym1$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, $list2,
          $list3, new String[]
          { "$sbhl_link_node_search_state", "$remaining_modules", "$module_node_search_state_iterator"
          }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sbhl_link_node_search_state_iterator_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_link_node_search_state_iterator_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_link_node_search_state_iterator_state_p( arg1 );
    }
  }

  public static final class $sbhl_module_direction_link_search_state_iterator_state_native
      extends
        SubLStructNative
  {
    public SubLObject $mt_link_iterator;
    public SubLObject $tv_link_search_state_iterator;
    public SubLObject $graph_link;
    public SubLObject $module;
    public SubLObject $node;
    public SubLObject $direction;
    public SubLObject $genl_inverse_modeP;
    private static final SubLStructDeclNative structDecl;

    public $sbhl_module_direction_link_search_state_iterator_state_native()
    {
      this.$mt_link_iterator = CommonSymbols.NIL;
      this.$tv_link_search_state_iterator = CommonSymbols.NIL;
      this.$graph_link = CommonSymbols.NIL;
      this.$module = CommonSymbols.NIL;
      this.$node = CommonSymbols.NIL;
      this.$direction = CommonSymbols.NIL;
      this.$genl_inverse_modeP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sbhl_module_direction_link_search_state_iterator_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$mt_link_iterator;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$tv_link_search_state_iterator;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$graph_link;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$module;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$node;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$direction;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$genl_inverse_modeP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$mt_link_iterator = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$tv_link_search_state_iterator = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$graph_link = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$module = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$node = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$direction = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$genl_inverse_modeP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sbhl_module_direction_link_search_state_iterator_state_native.class, $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE,
          $sym32$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P, $list33, $list34, new String[]
          { "$mt_link_iterator", "$tv_link_search_state_iterator", "$graph_link", "$module", "$node", "$direction", "$genl_inverse_modeP"
          }, $list35, $list36, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_module_direction_link_search_state_iterator_state_p( arg1 );
    }
  }

  public static final class $sbhl_module_tv_link_node_search_state_iterator_state_native
      extends
        SubLStructNative
  {
    public SubLObject $tv_link_iterator;
    public SubLObject $current_tv;
    public SubLObject $current_remaining_nodes;
    public SubLObject $module;
    public SubLObject $parent_node;
    public SubLObject $direction;
    public SubLObject $mt;
    public SubLObject $genl_inverse_modeP;
    private static final SubLStructDeclNative structDecl;

    public $sbhl_module_tv_link_node_search_state_iterator_state_native()
    {
      this.$tv_link_iterator = CommonSymbols.NIL;
      this.$current_tv = CommonSymbols.NIL;
      this.$current_remaining_nodes = CommonSymbols.NIL;
      this.$module = CommonSymbols.NIL;
      this.$parent_node = CommonSymbols.NIL;
      this.$direction = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$genl_inverse_modeP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sbhl_module_tv_link_node_search_state_iterator_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$tv_link_iterator;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$current_tv;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$current_remaining_nodes;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$module;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$parent_node;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$direction;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$genl_inverse_modeP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$tv_link_iterator = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$current_tv = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$current_remaining_nodes = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$module = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$parent_node = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$direction = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$genl_inverse_modeP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sbhl_module_tv_link_node_search_state_iterator_state_native.class, $sym66$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE,
          $sym67$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, $list68, $list69, new String[]
          { "$tv_link_iterator", "$current_tv", "$current_remaining_nodes", "$module", "$parent_node", "$direction", "$mt", "$genl_inverse_modeP"
          }, $list70, $list71, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_module_tv_link_node_search_state_iterator_state_p( arg1 );
    }
  }

  public static final class $sbhl_module_naut_link_node_search_state_iterator_state_native
      extends
        SubLStructNative
  {
    public SubLObject $generating_functions;
    public SubLObject $current_generating_function;
    public SubLObject $current_remaining_nodes;
    public SubLObject $module;
    public SubLObject $parent_node;
    public SubLObject $direction;
    public SubLObject $mt;
    public SubLObject $tv;
    public SubLObject $genl_inverse_modeP;
    private static final SubLStructDeclNative structDecl;

    public $sbhl_module_naut_link_node_search_state_iterator_state_native()
    {
      this.$generating_functions = CommonSymbols.NIL;
      this.$current_generating_function = CommonSymbols.NIL;
      this.$current_remaining_nodes = CommonSymbols.NIL;
      this.$module = CommonSymbols.NIL;
      this.$parent_node = CommonSymbols.NIL;
      this.$direction = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$tv = CommonSymbols.NIL;
      this.$genl_inverse_modeP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sbhl_module_naut_link_node_search_state_iterator_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$generating_functions;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$current_generating_function;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$current_remaining_nodes;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$module;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$parent_node;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$direction;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$tv;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$genl_inverse_modeP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$generating_functions = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$current_generating_function = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$current_remaining_nodes = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$module = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$parent_node = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$direction = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$tv = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$genl_inverse_modeP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sbhl_module_naut_link_node_search_state_iterator_state_native.class, $sym101$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE,
          $sym102$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, $list103, $list104, new String[]
          { "$generating_functions", "$current_generating_function", "$current_remaining_nodes", "$module", "$parent_node", "$direction", "$mt", "$tv", "$genl_inverse_modeP"
          }, $list105, $list106, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_module_naut_link_node_search_state_iterator_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 372 ms
 * 
 */