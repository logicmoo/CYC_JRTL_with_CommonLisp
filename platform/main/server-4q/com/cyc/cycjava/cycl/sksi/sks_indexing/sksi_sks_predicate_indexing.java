package com.cyc.cycjava.cycl.sksi.sks_indexing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_predicate_indexing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing";
  public static final String myFingerPrint = "92a8ebdd651e7dac51db4acf13cbb66a99961ad71e3c2252136bddea99288641";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLSymbol $dtp_sksi_supported_predicate_cache_entry$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 3628L)
  private static SubLSymbol $sksi_supported_predicate_cache$;
  private static final SubLSymbol $sym0$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY;
  private static final SubLSymbol $sym1$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY;
  private static final SubLSymbol $sym7$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$SKSI_PRED_ENTRY_MEANING_SENTENCE;
  private static final SubLSymbol $sym10$_CSETF_SKSI_PRED_ENTRY_MEANING_SENTENCE;
  private static final SubLSymbol $sym11$SKSI_PRED_ENTRY_QUERY_FORM;
  private static final SubLSymbol $sym12$_CSETF_SKSI_PRED_ENTRY_QUERY_FORM;
  private static final SubLSymbol $sym13$SKSI_PRED_ENTRY_MT;
  private static final SubLSymbol $sym14$_CSETF_SKSI_PRED_ENTRY_MT;
  private static final SubLSymbol $sym15$SKSI_PRED_ENTRY_COUNT;
  private static final SubLSymbol $sym16$_CSETF_SKSI_PRED_ENTRY_COUNT;
  private static final SubLSymbol $sym17$SKSI_PRED_ENTRY_MODULES;
  private static final SubLSymbol $sym18$_CSETF_SKSI_PRED_ENTRY_MODULES;
  private static final SubLSymbol $kw19$MEANING_SENTENCE;
  private static final SubLSymbol $kw20$QUERY_FORM;
  private static final SubLSymbol $kw21$MT;
  private static final SubLSymbol $kw22$COUNT;
  private static final SubLSymbol $kw23$MODULES;
  private static final SubLString $str24$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw25$BEGIN;
  private static final SubLSymbol $sym26$MAKE_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY;
  private static final SubLSymbol $kw27$SLOT;
  private static final SubLSymbol $kw28$END;
  private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_METHO;
  private static final SubLString $str30$__PCE__s__s__s__s_;
  private static final SubLSymbol $sym31$_SKSI_SUPPORTED_PREDICATE_CACHE_;
  private static final SubLSymbol $sym32$SKSI_TERM___W__CONSTANTS_BY_NAME_ON;
  private static final SubLSymbol $sym33$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT;
  private static final SubLSymbol $sym34$HLMT_EQUAL;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject sksi_supported_predicate_cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_sksi_supported_predicate_cache_entry( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject sksi_supported_predicate_cache_entry_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sksi_supported_predicate_cache_entry_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject sksi_pred_entry_meaning_sentence(final SubLObject v_object)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject sksi_pred_entry_query_form(final SubLObject v_object)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject sksi_pred_entry_mt(final SubLObject v_object)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject sksi_pred_entry_count(final SubLObject v_object)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject sksi_pred_entry_modules(final SubLObject v_object)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject _csetf_sksi_pred_entry_meaning_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject _csetf_sksi_pred_entry_query_form(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject _csetf_sksi_pred_entry_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject _csetf_sksi_pred_entry_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject _csetf_sksi_pred_entry_modules(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sksi_supported_predicate_cache_entry_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject make_sksi_supported_predicate_cache_entry(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sksi_supported_predicate_cache_entry_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw19$MEANING_SENTENCE ) )
      {
        _csetf_sksi_pred_entry_meaning_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$QUERY_FORM ) )
      {
        _csetf_sksi_pred_entry_query_form( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$MT ) )
      {
        _csetf_sksi_pred_entry_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$COUNT ) )
      {
        _csetf_sksi_pred_entry_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$MODULES ) )
      {
        _csetf_sksi_pred_entry_modules( v_new, current_value );
      }
      else
      {
        Errors.error( $str24$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject visit_defstruct_sksi_supported_predicate_cache_entry(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw25$BEGIN, $sym26$MAKE_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw19$MEANING_SENTENCE, sksi_pred_entry_meaning_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw20$QUERY_FORM, sksi_pred_entry_query_form( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw21$MT, sksi_pred_entry_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw22$COUNT, sksi_pred_entry_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw27$SLOT, $kw23$MODULES, sksi_pred_entry_modules( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$END, $sym26$MAKE_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2009L)
  public static SubLObject visit_defstruct_object_sksi_supported_predicate_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sksi_supported_predicate_cache_entry( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2220L)
  public static SubLObject new_sksi_supported_predicate_cache_entry(final SubLObject meaning_sentence, final SubLObject query_form, final SubLObject mt, final SubLObject count, final SubLObject module)
  {
    final SubLObject entry = make_sksi_supported_predicate_cache_entry( UNPROVIDED );
    _csetf_sksi_pred_entry_meaning_sentence( entry, meaning_sentence );
    _csetf_sksi_pred_entry_query_form( entry, query_form );
    _csetf_sksi_pred_entry_mt( entry, mt );
    _csetf_sksi_pred_entry_count( entry, count );
    _csetf_sksi_pred_entry_modules( entry, ConsesLow.list( module ) );
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2683L)
  public static SubLObject sksi_supported_predicate_cache_entry_meaning_sentence(final SubLObject entry)
  {
    return sksi_pred_entry_meaning_sentence( entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2812L)
  public static SubLObject sksi_supported_predicate_cache_entry_query_form(final SubLObject entry)
  {
    return sksi_pred_entry_query_form( entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 2929L)
  public static SubLObject sksi_supported_predicate_cache_entry_mt(final SubLObject entry)
  {
    return sksi_pred_entry_mt( entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 3030L)
  public static SubLObject sksi_supported_predicate_cache_entry_count(final SubLObject entry)
  {
    return sksi_pred_entry_count( entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 3137L)
  public static SubLObject sksi_supported_predicate_cache_entry_modules(final SubLObject entry)
  {
    return sksi_pred_entry_modules( entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 3248L)
  public static SubLObject print_sksi_supported_predicate_cache_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str30$__PCE__s__s__s__s_, new SubLObject[] { sksi_supported_predicate_cache_entry_query_form( v_object ), sksi_supported_predicate_cache_entry_mt( v_object ),
      sksi_supported_predicate_cache_entry_count( v_object ), sksi_supported_predicate_cache_entry_modules( v_object )
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 3914L)
  public static SubLObject clear_sksi_supported_predicate_cache()
  {
    return dictionary.clear_dictionary( $sksi_supported_predicate_cache$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 4034L)
  public static SubLObject sksi_supported_predicate_cache_lookup(final SubLObject pred)
  {
    return dictionary.dictionary_lookup_without_values( $sksi_supported_predicate_cache$.getGlobalValue(), pred, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 4182L)
  public static SubLObject sksi_supported_predicate_browsing_registeredP()
  {
    return makeBoolean( NIL == dictionary.dictionary_empty_p( $sksi_supported_predicate_cache$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 4320L)
  public static SubLObject sksi_supported_predicate_cache_enter(final SubLObject pred, final SubLObject entry)
  {
    final SubLObject new_query_form = sksi_supported_predicate_cache_entry_query_form( entry );
    final SubLObject new_modules = sksi_supported_predicate_cache_entry_modules( entry );
    final SubLObject new_count = sksi_supported_predicate_cache_entry_count( entry );
    final SubLObject current_entries = sksi_supported_predicate_cache_entries_for_predicate_and_mt( pred, sksi_supported_predicate_cache_entry_mt( entry ) );
    SubLObject mergedP = NIL;
    if( NIL == mergedP )
    {
      SubLObject csome_list_var = current_entries;
      SubLObject current_entry = NIL;
      current_entry = csome_list_var.first();
      while ( NIL == mergedP && NIL != csome_list_var)
      {
        final SubLObject current_query_form = sksi_supported_predicate_cache_entry_query_form( current_entry );
        final SubLObject current_modules = sksi_supported_predicate_cache_entry_modules( current_entry );
        if( NIL != sksi_sks_indexing_utilities.sksi_query_forms_unifyP( new_query_form, current_query_form ) )
        {
          _csetf_sksi_pred_entry_modules( current_entry, ConsesLow.append( current_modules, new_modules ) );
          _csetf_sksi_pred_entry_count( current_entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_merge( sksi_pred_entry_count( current_entry ), new_count ) );
          mergedP = T;
        }
        csome_list_var = csome_list_var.rest();
        current_entry = csome_list_var.first();
      }
    }
    if( NIL == mergedP )
    {
      dictionary_utilities.dictionary_add_to_value_sorted( $sksi_supported_predicate_cache$.getGlobalValue(), pred, entry, $sym32$SKSI_TERM___W__CONSTANTS_BY_NAME_ON, $sym33$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT );
    }
    return sksi_supported_predicate_cache_lookup( pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 5909L)
  public static SubLObject sksi_supported_predicate_cache_remove(final SubLObject pred, final SubLObject entry, final SubLObject module, final SubLObject count)
  {
    final SubLObject entry_modules = sksi_supported_predicate_cache_entry_modules( entry );
    SubLObject removedP = NIL;
    if( NIL != subl_promotions.memberP( module, entry_modules, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != list_utilities.singletonP( entry_modules ) )
      {
        dictionary_utilities.dictionary_delete_from_value( $sksi_supported_predicate_cache$.getGlobalValue(), pred, entry, Symbols.symbol_function( EQUALP ), UNPROVIDED );
      }
      else
      {
        _csetf_sksi_pred_entry_modules( entry, Sequences.remove( module, entry_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        _csetf_sksi_pred_entry_count( entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_demerge( sksi_pred_entry_count( entry ), count ) );
      }
      removedP = T;
    }
    return removedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 6794L)
  public static SubLObject sksi_supported_predicate_cache_entries_for_predicate(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject all_pred_entries = sksi_supported_predicate_cache_lookup( pred );
    if( NIL != hlmt.hlmt_p( mt ) )
    {
      SubLObject all_pred_entries_for_mt = NIL;
      SubLObject cdolist_list_var = all_pred_entries;
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != genl_mts.genl_mtP( mt, sksi_supported_predicate_cache_entry_mt( entry ), UNPROVIDED, UNPROVIDED ) )
        {
          all_pred_entries_for_mt = ConsesLow.cons( entry, all_pred_entries_for_mt );
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
      return Sequences.nreverse( all_pred_entries_for_mt );
    }
    return all_pred_entries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 7627L)
  public static SubLObject sksi_supported_predicate_mt_list_for_pred(final SubLObject pred, SubLObject visible_mt)
  {
    if( visible_mt == UNPROVIDED )
    {
      visible_mt = NIL;
    }
    return list_utilities.fast_delete_duplicates( Mapping.mapcar( $sym33$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT, sksi_supported_predicate_cache_entries_for_predicate( pred, visible_mt ) ), $sym34$HLMT_EQUAL, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 7895L)
  public static SubLObject sksi_supported_predicate_mt_count_pairs_for_predicate(final SubLObject predicate, SubLObject visible_mt)
  {
    if( visible_mt == UNPROVIDED )
    {
      visible_mt = NIL;
    }
    final SubLObject cache_entries = sksi_supported_predicate_cache_entries_for_predicate( predicate, visible_mt );
    SubLObject mt_count_pairs = NIL;
    SubLObject cdolist_list_var = cache_entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mt = sksi_supported_predicate_cache_entry_mt( entry );
      if( NIL != sksi_sks_mt_indexing.content_mt_of_activated_external_sourceP( mt ) )
      {
        SubLObject count = sksi_supported_predicate_cache_entry_count( entry );
        final SubLObject last_entry = mt_count_pairs.first();
        final SubLObject last_entry_mt = last_entry.first();
        final SubLObject last_entry_count = conses_high.second( last_entry );
        if( mt.eql( last_entry_mt ) )
        {
          if( last_entry_count.isInteger() )
          {
            if( count.isInteger() )
            {
              count = Numbers.add( count, last_entry_count );
            }
            else
            {
              count = last_entry_count;
            }
          }
          mt_count_pairs = ConsesLow.rplaca( mt_count_pairs, ConsesLow.list( mt, count ) );
        }
        else
        {
          mt_count_pairs = ConsesLow.cons( ConsesLow.list( mt, count ), mt_count_pairs );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return Sequences.nreverse( mt_count_pairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 8819L)
  public static SubLObject sksi_supported_predicate_cache_entries_for_predicate_and_mt(final SubLObject predicate, final SubLObject mt)
  {
    final SubLObject cache_entries_for_pred = sksi_supported_predicate_cache_entries_for_predicate( predicate, UNPROVIDED );
    return list_utilities.find_all( mt, cache_entries_for_pred, $sym34$HLMT_EQUAL, $sym33$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 9117L)
  public static SubLObject gather_query_form_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate_and_mt(final SubLObject predicate, final SubLObject mt)
  {
    final SubLObject cache_entries_for_pred = sksi_supported_predicate_cache_entries_for_predicate( predicate, UNPROVIDED );
    SubLObject query_form_module_list_pairs = NIL;
    SubLObject cdolist_list_var = cache_entries_for_pred;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != hlmt.hlmt_equal( mt, sksi_supported_predicate_cache_entry_mt( entry ) ) )
      {
        query_form_module_list_pairs = ConsesLow.cons( ConsesLow.list( sksi_supported_predicate_cache_entry_query_form( entry ), sksi_supported_predicate_cache_entry_modules( entry ) ), query_form_module_list_pairs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return Sequences.nreverse( query_form_module_list_pairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 9734L)
  public static SubLObject gather_query_form_mt_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate(final SubLObject predicate)
  {
    final SubLObject cache_entries_for_pred = sksi_supported_predicate_cache_entries_for_predicate( predicate, UNPROVIDED );
    SubLObject query_form_module_list_pairs = NIL;
    SubLObject cdolist_list_var = cache_entries_for_pred;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_relevance_macros.relevant_mtP( sksi_supported_predicate_cache_entry_mt( entry ) ) )
      {
        query_form_module_list_pairs = ConsesLow.cons( ConsesLow.list( sksi_supported_predicate_cache_entry_query_form( entry ), sksi_supported_predicate_cache_entry_mt( entry ),
            sksi_supported_predicate_cache_entry_modules( entry ) ), query_form_module_list_pairs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return Sequences.nreverse( query_form_module_list_pairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 10398L)
  public static SubLObject gather_relevant_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject meaning_sentence_query_form_mt_module_list_tuples = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $sksi_supported_predicate_cache$.getGlobalValue() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject entries = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != sksi_tva_utilities.sksi_gt_relevant_predP( pred ) )
      {
        final SubLObject pred_tuples = gather_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache_entries( entries );
        meaning_sentence_query_form_mt_module_list_tuples = ConsesLow.nconc( meaning_sentence_query_form_mt_module_list_tuples, pred_tuples );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return meaning_sentence_query_form_mt_module_list_tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 11028L)
  public static SubLObject gather_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache_entries(final SubLObject cache_entries)
  {
    SubLObject meaning_sentence_query_form_mt_module_list_tuples = NIL;
    SubLObject cdolist_list_var = cache_entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_relevance_macros.relevant_mtP( sksi_supported_predicate_cache_entry_mt( entry ) ) )
      {
        meaning_sentence_query_form_mt_module_list_tuples = ConsesLow.cons( ConsesLow.list( sksi_supported_predicate_cache_entry_meaning_sentence( entry ), sksi_supported_predicate_cache_entry_query_form( entry ),
            sksi_supported_predicate_cache_entry_mt( entry ), sksi_supported_predicate_cache_entry_modules( entry ) ), meaning_sentence_query_form_mt_module_list_tuples );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return Sequences.nreverse( meaning_sentence_query_form_mt_module_list_tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 11728L)
  public static SubLObject predicate_sksi_indexed_relevant_in_mtP(final SubLObject predicate)
  {
    final SubLObject cache_entries = sksi_supported_predicate_cache_entries_for_predicate( predicate, UNPROVIDED );
    SubLObject v_answer = NIL;
    if( NIL == v_answer )
    {
      SubLObject csome_list_var = cache_entries;
      SubLObject entry = NIL;
      entry = csome_list_var.first();
      while ( NIL == v_answer && NIL != csome_list_var)
      {
        if( NIL != mt_relevance_macros.relevant_mtP( sksi_supported_predicate_cache_entry_mt( entry ) ) )
        {
          v_answer = T;
        }
        csome_list_var = csome_list_var.rest();
        entry = csome_list_var.first();
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 12501L)
  public static SubLObject sksi_indexed_predicate_extent_count_in_relevant_mts(final SubLObject predicate)
  {
    final SubLObject cache_entries = sksi_supported_predicate_cache_entries_for_predicate( predicate, UNPROVIDED );
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = cache_entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_relevance_macros.relevant_mtP( sksi_supported_predicate_cache_entry_mt( entry ) ) )
      {
        final SubLObject entry_count = sksi_supported_predicate_cache_entry_count( entry );
        if( entry_count.isNumber() )
        {
          count = Numbers.add( count, entry_count );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 12956L)
  public static SubLObject sksi_supported_predicateP(final SubLObject v_term)
  {
    if( NIL != sksi_supported_predicate_browsing_registeredP() && NIL == sksi_kb_accessors.isa_logical_schemaP( v_term ) )
    {
      return sksi_supported_predicate_cache_lookup( v_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 13373L)
  public static SubLObject register_sksi_supported_predicates(final SubLObject pred_list, final SubLObject meaning_sentence, final SubLObject required_pattern, final SubLObject required_mt, final SubLObject count,
      final SubLObject module)
  {
    final SubLObject query_form = sksi_external_browser_utilities.sksi_create_query_form_from_required_pattern( required_pattern );
    if( NIL != query_form )
    {
      SubLObject cdolist_list_var = pred_list;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p( pred, UNPROVIDED ) )
        {
          register_sksi_supported_predicate( pred, meaning_sentence, query_form, required_mt, count, module );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 13801L)
  public static SubLObject register_sksi_supported_predicate(final SubLObject pred, final SubLObject meaning_sentence, final SubLObject query_form, final SubLObject required_mt, final SubLObject count,
      final SubLObject module)
  {
    final SubLObject cache_entry_query_form = el_utilities.make_el_formula( pred, cycl_utilities.formula_args( query_form, UNPROVIDED ), UNPROVIDED );
    final SubLObject cache_entry = new_sksi_supported_predicate_cache_entry( meaning_sentence, cache_entry_query_form, required_mt, count, module );
    return sksi_supported_predicate_cache_enter( pred, cache_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-indexing/sksi-sks-predicate-indexing.lisp", position = 14188L)
  public static SubLObject deregister_sksi_supported_predicate(final SubLObject pred, final SubLObject required_mt, final SubLObject module, final SubLObject count)
  {
    SubLObject cdolist_list_var;
    final SubLObject cache_entries = cdolist_list_var = sksi_supported_predicate_cache_entries_for_predicate_and_mt( pred, required_mt );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_supported_predicate_cache_remove( pred, entry, module, count );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return sksi_supported_predicate_cache_entries_for_predicate( pred, UNPROVIDED );
  }

  public static SubLObject declare_sksi_sks_predicate_indexing_file()
  {
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entry_print_function_trampoline", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entry_p", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-P", 1, 0, false );
    new $sksi_supported_predicate_cache_entry_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sksi_pred_entry_meaning_sentence", "SKSI-PRED-ENTRY-MEANING-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pred_entry_query_form", "SKSI-PRED-ENTRY-QUERY-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pred_entry_mt", "SKSI-PRED-ENTRY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pred_entry_count", "SKSI-PRED-ENTRY-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_pred_entry_modules", "SKSI-PRED-ENTRY-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sksi_pred_entry_meaning_sentence", "_CSETF-SKSI-PRED-ENTRY-MEANING-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sksi_pred_entry_query_form", "_CSETF-SKSI-PRED-ENTRY-QUERY-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sksi_pred_entry_mt", "_CSETF-SKSI-PRED-ENTRY-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sksi_pred_entry_count", "_CSETF-SKSI-PRED-ENTRY-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sksi_pred_entry_modules", "_CSETF-SKSI-PRED-ENTRY-MODULES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sksi_supported_predicate_cache_entry", "MAKE-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sksi_supported_predicate_cache_entry", "VISIT-DEFSTRUCT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sksi_supported_predicate_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sksi_supported_predicate_cache_entry", "NEW-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY", 5, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entry_meaning_sentence", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-MEANING-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entry_query_form", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-QUERY-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entry_mt", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entry_count", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entry_modules", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-MODULES", 1, 0, false );
    SubLFiles.declareFunction( me, "print_sksi_supported_predicate_cache_entry", "PRINT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_sksi_supported_predicate_cache", "CLEAR-SKSI-SUPPORTED-PREDICATE-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_lookup", "SKSI-SUPPORTED-PREDICATE-CACHE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_browsing_registeredP", "SKSI-SUPPORTED-PREDICATE-BROWSING-REGISTERED?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_enter", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTER", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_remove", "SKSI-SUPPORTED-PREDICATE-CACHE-REMOVE", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entries_for_predicate", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES-FOR-PREDICATE", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_mt_list_for_pred", "SKSI-SUPPORTED-PREDICATE-MT-LIST-FOR-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_mt_count_pairs_for_predicate", "SKSI-SUPPORTED-PREDICATE-MT-COUNT-PAIRS-FOR-PREDICATE", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_cache_entries_for_predicate_and_mt", "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES-FOR-PREDICATE-AND-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_query_form_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate_and_mt",
        "GATHER-QUERY-FORM-MODULE-LIST-PAIRS-FROM-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES-FOR-PREDICATE-AND-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_query_form_mt_module_list_pairs_from_sksi_supported_predicate_cache_entries_for_predicate",
        "GATHER-QUERY-FORM-MT-MODULE-LIST-PAIRS-FROM-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES-FOR-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_relevant_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache",
        "GATHER-RELEVANT-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_meaning_sentence_query_form_mt_module_list_tuples_from_sksi_supported_predicate_cache_entries",
        "GATHER-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_sksi_indexed_relevant_in_mtP", "PREDICATE-SKSI-INDEXED-RELEVANT-IN-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_indexed_predicate_extent_count_in_relevant_mts", "SKSI-INDEXED-PREDICATE-EXTENT-COUNT-IN-RELEVANT-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicateP", "SKSI-SUPPORTED-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "register_sksi_supported_predicates", "REGISTER-SKSI-SUPPORTED-PREDICATES", 6, 0, false );
    SubLFiles.declareFunction( me, "register_sksi_supported_predicate", "REGISTER-SKSI-SUPPORTED-PREDICATE", 6, 0, false );
    SubLFiles.declareFunction( me, "deregister_sksi_supported_predicate", "DEREGISTER-SKSI-SUPPORTED-PREDICATE", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_sks_predicate_indexing_file()
  {
    $dtp_sksi_supported_predicate_cache_entry$ = SubLFiles.defconstant( "*DTP-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY*", $sym0$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY );
    $sksi_supported_predicate_cache$ = SubLFiles.deflexical( "*SKSI-SUPPORTED-PREDICATE-CACHE*", maybeDefault( $sym31$_SKSI_SUPPORTED_PREDICATE_CACHE_, $sksi_supported_predicate_cache$, () -> ( dictionary.new_dictionary(
        Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_sksi_sks_predicate_indexing_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sksi_supported_predicate_cache_entry$.getGlobalValue(), Symbols.symbol_function(
        $sym7$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$SKSI_PRED_ENTRY_MEANING_SENTENCE, $sym10$_CSETF_SKSI_PRED_ENTRY_MEANING_SENTENCE );
    Structures.def_csetf( $sym11$SKSI_PRED_ENTRY_QUERY_FORM, $sym12$_CSETF_SKSI_PRED_ENTRY_QUERY_FORM );
    Structures.def_csetf( $sym13$SKSI_PRED_ENTRY_MT, $sym14$_CSETF_SKSI_PRED_ENTRY_MT );
    Structures.def_csetf( $sym15$SKSI_PRED_ENTRY_COUNT, $sym16$_CSETF_SKSI_PRED_ENTRY_COUNT );
    Structures.def_csetf( $sym17$SKSI_PRED_ENTRY_MODULES, $sym18$_CSETF_SKSI_PRED_ENTRY_MODULES );
    Equality.identity( $sym0$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sksi_supported_predicate_cache_entry$.getGlobalValue(), Symbols.symbol_function(
        $sym29$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_METHO ) );
    subl_macro_promotions.declare_defglobal( $sym31$_SKSI_SUPPORTED_PREDICATE_CACHE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_sks_predicate_indexing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_sks_predicate_indexing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_sks_predicate_indexing_file();
  }
  static
  {
    me = new sksi_sks_predicate_indexing();
    $dtp_sksi_supported_predicate_cache_entry$ = null;
    $sksi_supported_predicate_cache$ = null;
    $sym0$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY = makeSymbol( "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY" );
    $sym1$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_P = makeSymbol( "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-P" );
    $list2 = ConsesLow.list( makeSymbol( "MEANING-SENTENCE" ), makeSymbol( "QUERY-FORM" ), makeSymbol( "MT" ), makeSymbol( "COUNT" ), makeSymbol( "MODULES" ) );
    $list3 = ConsesLow.list( makeKeyword( "MEANING-SENTENCE" ), makeKeyword( "QUERY-FORM" ), makeKeyword( "MT" ), makeKeyword( "COUNT" ), makeKeyword( "MODULES" ) );
    $list4 = ConsesLow.list( makeSymbol( "SKSI-PRED-ENTRY-MEANING-SENTENCE" ), makeSymbol( "SKSI-PRED-ENTRY-QUERY-FORM" ), makeSymbol( "SKSI-PRED-ENTRY-MT" ), makeSymbol( "SKSI-PRED-ENTRY-COUNT" ), makeSymbol(
        "SKSI-PRED-ENTRY-MODULES" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-SKSI-PRED-ENTRY-MEANING-SENTENCE" ), makeSymbol( "_CSETF-SKSI-PRED-ENTRY-QUERY-FORM" ), makeSymbol( "_CSETF-SKSI-PRED-ENTRY-MT" ), makeSymbol(
        "_CSETF-SKSI-PRED-ENTRY-COUNT" ), makeSymbol( "_CSETF-SKSI-PRED-ENTRY-MODULES" ) );
    $sym6$PRINT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY = makeSymbol( "PRINT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY" );
    $sym7$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-P" ) );
    $sym9$SKSI_PRED_ENTRY_MEANING_SENTENCE = makeSymbol( "SKSI-PRED-ENTRY-MEANING-SENTENCE" );
    $sym10$_CSETF_SKSI_PRED_ENTRY_MEANING_SENTENCE = makeSymbol( "_CSETF-SKSI-PRED-ENTRY-MEANING-SENTENCE" );
    $sym11$SKSI_PRED_ENTRY_QUERY_FORM = makeSymbol( "SKSI-PRED-ENTRY-QUERY-FORM" );
    $sym12$_CSETF_SKSI_PRED_ENTRY_QUERY_FORM = makeSymbol( "_CSETF-SKSI-PRED-ENTRY-QUERY-FORM" );
    $sym13$SKSI_PRED_ENTRY_MT = makeSymbol( "SKSI-PRED-ENTRY-MT" );
    $sym14$_CSETF_SKSI_PRED_ENTRY_MT = makeSymbol( "_CSETF-SKSI-PRED-ENTRY-MT" );
    $sym15$SKSI_PRED_ENTRY_COUNT = makeSymbol( "SKSI-PRED-ENTRY-COUNT" );
    $sym16$_CSETF_SKSI_PRED_ENTRY_COUNT = makeSymbol( "_CSETF-SKSI-PRED-ENTRY-COUNT" );
    $sym17$SKSI_PRED_ENTRY_MODULES = makeSymbol( "SKSI-PRED-ENTRY-MODULES" );
    $sym18$_CSETF_SKSI_PRED_ENTRY_MODULES = makeSymbol( "_CSETF-SKSI-PRED-ENTRY-MODULES" );
    $kw19$MEANING_SENTENCE = makeKeyword( "MEANING-SENTENCE" );
    $kw20$QUERY_FORM = makeKeyword( "QUERY-FORM" );
    $kw21$MT = makeKeyword( "MT" );
    $kw22$COUNT = makeKeyword( "COUNT" );
    $kw23$MODULES = makeKeyword( "MODULES" );
    $str24$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw25$BEGIN = makeKeyword( "BEGIN" );
    $sym26$MAKE_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY = makeSymbol( "MAKE-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY" );
    $kw27$SLOT = makeKeyword( "SLOT" );
    $kw28$END = makeKeyword( "END" );
    $sym29$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_METHO = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-METHOD" );
    $str30$__PCE__s__s__s__s_ = makeString( "#<PCE:~s:~s:~s:~s>" );
    $sym31$_SKSI_SUPPORTED_PREDICATE_CACHE_ = makeSymbol( "*SKSI-SUPPORTED-PREDICATE-CACHE*" );
    $sym32$SKSI_TERM___W__CONSTANTS_BY_NAME_ON = makeSymbol( "SKSI-TERM-<-W/-CONSTANTS-BY-NAME-ON" );
    $sym33$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_MT = makeSymbol( "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-MT" );
    $sym34$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
  }

  public static final class $sksi_supported_predicate_cache_entry_native
      extends
        SubLStructNative
  {
    public SubLObject $meaning_sentence;
    public SubLObject $query_form;
    public SubLObject $mt;
    public SubLObject $count;
    public SubLObject $modules;
    private static final SubLStructDeclNative structDecl;

    public $sksi_supported_predicate_cache_entry_native()
    {
      this.$meaning_sentence = CommonSymbols.NIL;
      this.$query_form = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$count = CommonSymbols.NIL;
      this.$modules = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sksi_supported_predicate_cache_entry_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$meaning_sentence;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$query_form;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$count;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$modules;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$meaning_sentence = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$query_form = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$count = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$modules = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sksi_supported_predicate_cache_entry_native.class, $sym0$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY, $sym1$SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY_P, $list2, $list3,
          new String[]
          { "$meaning_sentence", "$query_form", "$mt", "$count", "$modules"
          }, $list4, $list5, $sym6$PRINT_SKSI_SUPPORTED_PREDICATE_CACHE_ENTRY );
    }
  }

  public static final class $sksi_supported_predicate_cache_entry_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sksi_supported_predicate_cache_entry_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SKSI-SUPPORTED-PREDICATE-CACHE-ENTRY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sksi_supported_predicate_cache_entry_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 160 ms
 * 
 */