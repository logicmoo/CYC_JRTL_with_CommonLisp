package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class defns
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.defns";
  public static final String myFingerPrint = "14e8cb379dbc10f8869aca5e214e3d572c58f0bb0c719ac815be8721c2577ae5";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4521L)
  private static SubLSymbol $index_to_defns_cache_vector$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4742L)
  public static SubLSymbol $has_suf_defn_cache_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4785L)
  public static SubLSymbol $has_quoted_suf_defn_cache_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4835L)
  public static SubLSymbol $iff_defns_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4869L)
  public static SubLSymbol $quoted_iff_defns_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4910L)
  public static SubLSymbol $suf_defns_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4944L)
  public static SubLSymbol $quoted_suf_defns_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4985L)
  public static SubLSymbol $nec_defns_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5019L)
  public static SubLSymbol $quoted_nec_defns_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5060L)
  public static SubLSymbol $suf_defn_cache_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5099L)
  public static SubLSymbol $suf_quoted_defn_cache_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5145L)
  public static SubLSymbol $suf_function_cache_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5189L)
  public static SubLSymbol $suf_quoted_function_cache_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17716L)
  private static SubLSymbol $defn_term$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17750L)
  private static SubLSymbol $org_collection$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17788L)
  private static SubLSymbol $failing_suf_defns$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17971L)
  public static SubLSymbol $new_defns_admitP_meters$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19230L)
  public static SubLSymbol $new_defns_rejectP_meters$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20350L)
  public static SubLSymbol $new_quoted_defns_admitP_meters$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20628L)
  public static SubLSymbol $new_quoted_defns_rejectP_meters$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28269L)
  public static SubLSymbol $nec_defn_rejectsP_meters$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37106L)
  private static SubLSymbol $min_defn_admits_map$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38367L)
  private static SubLSymbol $min_quoted_defn_admits_map$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43468L)
  public static SubLSymbol $new_handle_added_genl_for_suf_defns_meters$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43638L)
  public static SubLSymbol $new_handle_added_genl_for_suf_quoted_defns_meters$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44238L)
  public static SubLSymbol $new_handle_removed_genl_for_suf_defns_meters$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44412L)
  public static SubLSymbol $new_handle_removed_genl_for_suf_quoted_defns_meters$;
  private static final SubLSymbol $sym0$_INDEX_TO_DEFNS_CACHE_VECTOR_;
  private static final SubLInteger $int1$256;
  private static final SubLInteger $int2$200;
  private static final SubLInteger $int3$64;
  private static final SubLSymbol $sym4$DEFNS_CACHE_INDEX_P;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw8$DONE;
  private static final SubLSymbol $sym9$CDOHASH;
  private static final SubLSymbol $sym10$GET_DEFN_CACHE_FROM_INDEX;
  private static final SubLSymbol $sym11$PROGRESS_CDOHASH;
  private static final SubLSymbol $sym12$_NEW_DEFNS_ADMIT__METERS_;
  private static final SubLSymbol $kw13$CALLS;
  private static final SubLSymbol $kw14$TIMES;
  private static final SubLSymbol $kw15$RESULTS;
  private static final SubLSymbol $kw16$ARGS;
  private static final SubLSymbol $kw17$ARG_LIST;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$FUNCTION;
  private static final SubLSymbol $sym20$NEW_DEFNS_ADMIT_;
  private static final SubLSymbol $kw21$RESET;
  private static final SubLSymbol $sym22$RESET_NEW_DEFNS_ADMIT__METERS;
  private static final SubLSymbol $kw23$ADMITTED;
  private static final SubLSymbol $kw24$REJECTED;
  private static final SubLSymbol $sym25$_NEW_DEFNS_REJECT__METERS_;
  private static final SubLSymbol $sym26$NEW_DEFNS_REJECT_;
  private static final SubLSymbol $sym27$RESET_NEW_DEFNS_REJECT__METERS;
  private static final SubLSymbol $sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
  private static final SubLSymbol $sym29$NEW_QUOTED_DEFNS_ADMIT_;
  private static final SubLSymbol $sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS;
  private static final SubLSymbol $sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_;
  private static final SubLSymbol $sym32$NEW_QUOTED_DEFNS_REJECT_;
  private static final SubLSymbol $sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS;
  private static final SubLSymbol $kw34$BREADTH;
  private static final SubLSymbol $kw35$QUEUE;
  private static final SubLSymbol $kw36$STACK;
  private static final SubLSymbol $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw38$ERROR;
  private static final SubLString $str39$_A_is_not_a__A;
  private static final SubLSymbol $sym40$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw41$CERROR;
  private static final SubLString $str42$continue_anyway;
  private static final SubLSymbol $kw43$WARN;
  private static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const45$genls;
  private static final SubLString $str46$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str47$attempting_to_bind_direction_link;
  private static final SubLString $str48$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw49$DISJOINT;
  private static final SubLSymbol $sym50$COL_QUOTED_DEFN_ADMITS_;
  private static final SubLSymbol $sym51$COL_DEFN_ADMITS_;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$AT_CONSTRAINT_GAF;
  private static final SubLSymbol $kw54$MAL_ARG_WRT_QUOTED_SUF_DEFNS;
  private static final SubLSymbol $kw55$MAL_ARG_WRT_SUF_DEFNS;
  private static final SubLSymbol $kw56$MAL_ARG_WRT_QUOTED_IFF_DEFN;
  private static final SubLSymbol $kw57$MAL_ARG_WRT_IFF_DEFN;
  private static final SubLSymbol $sym58$_NEC_DEFN_REJECTS__METERS_;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$NEC_DEFN_REJECTS_;
  private static final SubLSymbol $sym61$RESET_NEC_DEFN_REJECTS__METERS;
  private static final SubLSymbol $kw62$MAL_ARG_WRT_QUOTED_NEC_DEFN;
  private static final SubLSymbol $kw63$MAL_ARG_WRT_NEC_DEFN;
  private static final SubLObject $const64$EverythingPSC;
  private static final SubLSymbol $kw65$GENLS;
  private static final SubLSymbol $sym66$ADMITTING_QUOTED_DEFN_ASSERTION;
  private static final SubLSymbol $sym67$ADMITTING_DEFN_ASSERTION;
  private static final SubLSymbol $sym68$ADMITTING_QUOTED_DEFN_ASSERTIONS;
  private static final SubLSymbol $sym69$ADMITTING_DEFN_ASSERTIONS;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$ASCENDING;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLObject $const75$CollectionIntersection2Fn;
  private static final SubLObject $const76$CollectionIntersectionFn;
  private static final SubLObject $const77$SomeFn;
  private static final SubLSymbol $kw78$IFF;
  private static final SubLSymbol $sym79$NEW_ADD_IFF_DEFN;
  private static final SubLSymbol $sym80$NEW_REMOVE_IFF_DEFN;
  private static final SubLSymbol $kw81$SUF;
  private static final SubLSymbol $sym82$NEW_ADD_SUF_DEFN;
  private static final SubLSymbol $sym83$NEW_REMOVE_SUF_DEFN;
  private static final SubLSymbol $kw84$NEC;
  private static final SubLSymbol $sym85$ADD_NEC_DEFN;
  private static final SubLSymbol $sym86$REMOVE_NEC_DEFN;
  private static final SubLSymbol $kw87$QIFF;
  private static final SubLSymbol $sym88$NEW_ADD_IFF_QUOTED_DEFN;
  private static final SubLSymbol $sym89$NEW_REMOVE_IFF_QUOTED_DEFN;
  private static final SubLSymbol $kw90$QSUF;
  private static final SubLSymbol $sym91$NEW_ADD_SUF_QUOTED_DEFN;
  private static final SubLSymbol $sym92$NEW_REMOVE_SUF_QUOTED_DEFN;
  private static final SubLSymbol $kw93$QNEC;
  private static final SubLSymbol $sym94$ADD_NEC_QUOTED_DEFN;
  private static final SubLSymbol $sym95$REMOVE_NEC_QUOTED_DEFN;
  private static final SubLSymbol $sym96$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLSymbol $sym97$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS;
  private static final SubLSymbol $sym100$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS;
  private static final SubLSymbol $sym101$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
  private static final SubLSymbol $sym102$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS;
  private static final SubLSymbol $sym103$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS;
  private static final SubLSymbol $sym104$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_;
  private static final SubLSymbol $sym105$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS;
  private static final SubLSymbol $sym106$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS;
  private static final SubLSymbol $sym107$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
  private static final SubLSymbol $sym108$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS;
  private static final SubLSymbol $sym109$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS;
  private static final SubLInteger $int110$400;
  private static final SubLInteger $int111$100;
  private static final SubLString $str112$Initializing_defns___;
  private static final SubLObject $const113$defnIff;
  private static final SubLSymbol $kw114$GAF;
  private static final SubLSymbol $kw115$TRUE;
  private static final SubLObject $const116$defnSufficient;
  private static final SubLObject $const117$defnNecessary;
  private static final SubLObject $const118$quotedDefnIff;
  private static final SubLObject $const119$quotedDefnSufficient;
  private static final SubLObject $const120$quotedDefnNecessary;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5240L)
  public static SubLObject get_index_to_defns_cache_vector()
  {
    if( NIL == $index_to_defns_cache_vector$.getGlobalValue() )
    {
      $index_to_defns_cache_vector$.setGlobalValue( Vectors.make_vector( TWELVE_INTEGER, UNPROVIDED ) );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $has_suf_defn_cache_index$.getGlobalValue(), NIL );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $has_quoted_suf_defn_cache_index$.getGlobalValue(), NIL );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $iff_defns_index$.getGlobalValue(), NIL );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $quoted_iff_defns_index$.getGlobalValue(), NIL );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $suf_defns_index$.getGlobalValue(), NIL );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $quoted_suf_defns_index$.getGlobalValue(), NIL );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $nec_defns_index$.getGlobalValue(), NIL );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $quoted_nec_defns_index$.getGlobalValue(), NIL );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $suf_defn_cache_index$.getGlobalValue(), Hashtables.make_hash_table( $int1$256, UNPROVIDED, UNPROVIDED ) );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $suf_quoted_defn_cache_index$.getGlobalValue(), Hashtables.make_hash_table( $int2$200, UNPROVIDED, UNPROVIDED ) );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $suf_function_cache_index$.getGlobalValue(), Hashtables.make_hash_table( $int1$256, UNPROVIDED, UNPROVIDED ) );
      Vectors.set_aref( $index_to_defns_cache_vector$.getGlobalValue(), $suf_quoted_function_cache_index$.getGlobalValue(), Hashtables.make_hash_table( $int3$64, UNPROVIDED, UNPROVIDED ) );
    }
    return $index_to_defns_cache_vector$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6402L)
  public static SubLObject get_defn_cache_from_index(final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    final SubLObject defns_cache = Vectors.aref( get_index_to_defns_cache_vector(), defn_cache_index );
    return defns_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6737L)
  public static SubLObject defns_cache_index_p(final SubLObject possible_index)
  {
    return ( possible_index.isInteger() && possible_index.numGE( ZERO_INTEGER ) && possible_index.numL( TWELVE_INTEGER ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7509L)
  public static SubLObject defns_cache_make_hash_table(final SubLObject defn_cache_index, final SubLObject size)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    Vectors.set_aref( get_index_to_defns_cache_vector(), defn_cache_index, Hashtables.make_hash_table( size, UNPROVIDED, UNPROVIDED ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8029L)
  public static SubLObject defns_cache_definedP(final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return ( NIL != get_defn_cache_from_index( defn_cache_index ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8347L)
  public static SubLObject defns_cache_hash_table_p(final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return Types.hash_table_p( get_defn_cache_from_index( defn_cache_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8676L)
  public static SubLObject defns_cache_hash_table_empty_p(final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return hash_table_utilities.hash_table_empty_p( get_defn_cache_from_index( defn_cache_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9032L)
  public static SubLObject defns_cache_clrhash(final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return Hashtables.clrhash( get_defn_cache_from_index( defn_cache_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9354L)
  public static SubLObject defns_cache_gethash(final SubLObject key, final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return Hashtables.gethash( key, get_defn_cache_from_index( defn_cache_index ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9688L)
  public static SubLObject defns_cache_sethash(final SubLObject key, final SubLObject defn_cache_index, final SubLObject value)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return Hashtables.sethash( key, get_defn_cache_from_index( defn_cache_index ), value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10044L)
  public static SubLObject defns_cache_remhash(final SubLObject key, final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return Hashtables.remhash( key, get_defn_cache_from_index( defn_cache_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10379L)
  public static SubLObject defns_cache_remove_value_from_hash(final SubLObject key, final SubLObject value, final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return hash_table_utilities.remove_value_from_hash( key, value, get_defn_cache_from_index( defn_cache_index ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10776L)
  public static SubLObject defns_cache_push_hash(final SubLObject key, final SubLObject value, final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return hash_table_utilities.push_hash( key, value, get_defn_cache_from_index( defn_cache_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11126L)
  public static SubLObject defns_cache_gethash_without_values(final SubLObject key, final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return Hashtables.gethash_without_values( key, get_defn_cache_from_index( defn_cache_index ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11505L)
  public static SubLObject defns_cache_hash_table_to_alist(final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return hash_table_utilities.hash_table_to_alist( get_defn_cache_from_index( defn_cache_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11865L)
  public static SubLObject defns_cache_hash_table_count(final SubLObject defn_cache_index)
  {
    assert NIL != defns_cache_index_p( defn_cache_index ) : defn_cache_index;
    return Hashtables.hash_table_count( get_defn_cache_from_index( defn_cache_index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12217L)
  public static SubLObject do_defns_cache_hash(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject val = NIL;
    SubLObject defn_cache_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    val = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    defn_cache_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list5 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list5 );
      if( NIL == conses_high.member( current_$1, $list6, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw7$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw8$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym9$CDOHASH, ConsesLow.list( key, val, ConsesLow.list( $sym10$GET_DEFN_CACHE_FROM_INDEX, defn_cache_index ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12786L)
  public static SubLObject progress_do_defns_cache_hash(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject val = NIL;
    SubLObject defn_cache_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    val = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    defn_cache_index = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list5 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list5 );
      if( NIL == conses_high.member( current_$2, $list6, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw7$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw8$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym11$PROGRESS_CDOHASH, ConsesLow.list( key, val, ConsesLow.list( $sym10$GET_DEFN_CACHE_FROM_INDEX, defn_cache_index ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13757L)
  public static SubLObject suf_defn_count(final SubLObject col, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $has_suf_defn_cache_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $has_quoted_suf_defn_cache_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_gethash( col, $has_quoted_suf_defn_cache_index$.getGlobalValue() );
    }
    return defns_cache_gethash( col, $has_suf_defn_cache_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14301L)
  public static SubLObject has_suf_defn_somewhereP(final SubLObject col, final SubLObject quotedP)
  {
    return list_utilities.sublisp_boolean( suf_defn_count( col, quotedP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14430L)
  public static SubLObject set_suf_defn_count(final SubLObject col, final SubLObject count, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $has_suf_defn_cache_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $has_quoted_suf_defn_cache_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_sethash( col, $has_quoted_suf_defn_cache_index$.getGlobalValue(), count );
    }
    return defns_cache_sethash( col, $has_suf_defn_cache_index$.getGlobalValue(), count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14835L)
  public static SubLObject rem_suf_defn_count(final SubLObject col, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $has_suf_defn_cache_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $has_quoted_suf_defn_cache_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_remhash( col, $has_quoted_suf_defn_cache_index$.getGlobalValue() );
    }
    return defns_cache_remhash( col, $has_suf_defn_cache_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15222L)
  public static SubLObject iff_defn(final SubLObject col, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $iff_defns_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $quoted_iff_defns_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_gethash( col, $quoted_iff_defns_index$.getGlobalValue() );
    }
    return defns_cache_gethash( col, $iff_defns_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15567L)
  public static SubLObject rem_iff_defn(final SubLObject col, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $iff_defns_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $quoted_iff_defns_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_remhash( col, $quoted_iff_defns_index$.getGlobalValue() );
    }
    return defns_cache_remhash( col, $iff_defns_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15913L)
  public static SubLObject suf_defns(final SubLObject col, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $suf_defns_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $quoted_suf_defns_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_gethash( col, $quoted_suf_defns_index$.getGlobalValue() );
    }
    return defns_cache_gethash( col, $suf_defns_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16256L)
  public static SubLObject rem_suf_defn(final SubLObject col, final SubLObject assertion, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $suf_defns_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $quoted_suf_defns_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_remove_value_from_hash( col, assertion, $quoted_suf_defns_index$.getGlobalValue() );
    }
    return defns_cache_remove_value_from_hash( col, assertion, $suf_defns_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16661L)
  public static SubLObject new_suf_defnP(final SubLObject col, final SubLObject defn, SubLObject quotedP)
  {
    if( quotedP == UNPROVIDED )
    {
      quotedP = NIL;
    }
    SubLObject foundP = NIL;
    if( NIL == foundP )
    {
      SubLObject csome_list_var = suf_defns( col, quotedP );
      SubLObject assertion = NIL;
      assertion = csome_list_var.first();
      while ( NIL == foundP && NIL != csome_list_var)
      {
        if( NIL != assertions_high.valid_assertion( assertion, UNPROVIDED ) )
        {
          foundP = Equality.eq( defn, el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg2( assertion ) ) );
        }
        csome_list_var = csome_list_var.rest();
        assertion = csome_list_var.first();
      }
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16967L)
  public static SubLObject nec_defns(final SubLObject col, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $nec_defns_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $quoted_nec_defns_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_gethash( col, $quoted_nec_defns_index$.getGlobalValue() );
    }
    return defns_cache_gethash( col, $nec_defns_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17311L)
  public static SubLObject rem_nec_defn(final SubLObject col, final SubLObject assertion, final SubLObject quotedP)
  {
    if( NIL == defns_cache_definedP( $nec_defns_index$.getGlobalValue() ) && NIL == defns_cache_definedP( $quoted_nec_defns_index$.getGlobalValue() ) )
    {
      initialize_defns_cache();
    }
    if( NIL != quotedP )
    {
      return defns_cache_remove_value_from_hash( col, assertion, $quoted_nec_defns_index$.getGlobalValue() );
    }
    return defns_cache_remove_value_from_hash( col, assertion, $nec_defns_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17829L)
  public static SubLObject has_some_defnP(final SubLObject col, final SubLObject quotedP)
  {
    return makeBoolean( NIL != iff_defn( col, quotedP ) || NIL != suf_defns( col, quotedP ) || NIL != nec_defns( col, quotedP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17971L)
  public static SubLObject reset_new_defns_admitP_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $new_defns_admitP_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $new_defns_admitP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $new_defns_admitP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $new_defns_admitP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $new_defns_admitP_meters$.getDynamicValue( thread ), $list18 );
    Hashtables.sethash( $kw19$FUNCTION, $new_defns_admitP_meters$.getDynamicValue( thread ), $sym20$NEW_DEFNS_ADMIT_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17971L)
  public static SubLObject new_defns_admitP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return defns_admitP_int( col, v_term, mt, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17971L)
  public static SubLObject new_defns_admitP(final SubLObject col, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = new_defns_admitP_metered( col, v_term, mt );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $new_defns_admitP_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $new_defns_admitP_meters$.getDynamicValue( thread ), UNPROVIDED ),
          ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $new_defns_admitP_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES, $new_defns_admitP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $new_defns_admitP_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS, $new_defns_admitP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $new_defns_admitP_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( col, v_term, mt ), Hashtables.gethash( $kw16$ARGS, $new_defns_admitP_meters$.getDynamicValue(
          thread ), UNPROVIDED ) ) );
      return result;
    }
    return new_defns_admitP_metered( col, v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18237L)
  public static SubLObject defns_admitP_int(SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != obsolete.reifiable_natP( col, UNPROVIDED, UNPROVIDED ) )
    {
      col = narts_high.find_nart( col );
    }
    if( NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP() )
    {
      if( NIL != quotedP )
      {
        if( NIL != isa.quoted_isaP( v_term, col, mt, UNPROVIDED ) )
        {
          return T;
        }
      }
      else if( NIL != isa.isaP( v_term, col, mt, UNPROVIDED ) )
      {
        return T;
      }
    }
    if( NIL == forts.fort_p( col ) && NIL == has_suf_defn_somewhereP( col, quotedP ) )
    {
      return NIL;
    }
    SubLObject admittedP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding( thread );
    final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding( thread );
    try
    {
      at_vars.$defn_fn_history$.bind( at_macros.make_defn_fn_history_table(), thread );
      at_vars.$quoted_defn_fn_history$.bind( at_macros.make_quoted_defn_fn_history_table(), thread );
      at_vars.$defn_col_history$.bind( at_macros.make_defn_col_history_table(), thread );
      at_vars.$quoted_defn_col_history$.bind( at_macros.make_quoted_defn_col_history_table(), thread );
      try
      {
        final SubLObject pcase_var = initial_check_defn_admit_status( col, v_term, mt, quotedP );
        if( pcase_var.eql( $kw23$ADMITTED ) )
        {
          admittedP = T;
        }
        else if( pcase_var.eql( $kw24$REJECTED ) )
        {
          admittedP = NIL;
        }
        else if( NIL != defns_walk_admitP( col, v_term, mt, quotedP ) )
        {
          admittedP = T;
        }
        else if( NIL == quotedP && NIL != cycl_grammar.fast_quote_term_p( v_term ) )
        {
          final SubLObject denoted_term = czer_main.unquote_quoted_term( v_term, UNPROVIDED );
          if( NIL != denoted_term && NIL != at_defns.quoted_defns_admitP( col, denoted_term, mt ) )
          {
            admittedP = T;
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          at_defns.clear_defn_space();
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
      at_vars.$quoted_defn_col_history$.rebind( _prev_bind_4, thread );
      at_vars.$defn_col_history$.rebind( _prev_bind_3, thread );
      at_vars.$quoted_defn_fn_history$.rebind( _prev_bind_2, thread );
      at_vars.$defn_fn_history$.rebind( _prev_bind_0, thread );
    }
    return admittedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19230L)
  public static SubLObject reset_new_defns_rejectP_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $new_defns_rejectP_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $new_defns_rejectP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $new_defns_rejectP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $new_defns_rejectP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $new_defns_rejectP_meters$.getDynamicValue( thread ), $list18 );
    Hashtables.sethash( $kw19$FUNCTION, $new_defns_rejectP_meters$.getDynamicValue( thread ), $sym26$NEW_DEFNS_REJECT_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19230L)
  public static SubLObject new_defns_rejectP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return defns_rejectP_int( col, v_term, mt, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19230L)
  public static SubLObject new_defns_rejectP(final SubLObject col, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = new_defns_rejectP_metered( col, v_term, mt );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $new_defns_rejectP_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $new_defns_rejectP_meters$.getDynamicValue( thread ), UNPROVIDED ),
          ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $new_defns_rejectP_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES, $new_defns_rejectP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $new_defns_rejectP_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS, $new_defns_rejectP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $new_defns_rejectP_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( col, v_term, mt ), Hashtables.gethash( $kw16$ARGS, $new_defns_rejectP_meters$.getDynamicValue(
          thread ), UNPROVIDED ) ) );
      return result;
    }
    return new_defns_rejectP_metered( col, v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19346L)
  public static SubLObject defns_rejectP_int(SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != obsolete.reifiable_natP( col, UNPROVIDED, UNPROVIDED ) )
    {
      col = narts_high.find_nart( col );
    }
    if( NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP() )
    {
      if( NIL != quotedP )
      {
        if( NIL != isa.quoted_isaP( v_term, col, mt, UNPROVIDED ) )
        {
          return NIL;
        }
      }
      else if( NIL != isa.isaP( v_term, col, mt, UNPROVIDED ) )
      {
        return NIL;
      }
    }
    if( NIL == forts.fort_p( col ) )
    {
      return NIL;
    }
    SubLObject rejectedP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding( thread );
    final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding( thread );
    try
    {
      at_vars.$defn_fn_history$.bind( at_macros.possibly_make_defn_fn_history_table(), thread );
      at_vars.$quoted_defn_fn_history$.bind( at_macros.possibly_make_quoted_defn_fn_history_table(), thread );
      at_vars.$defn_col_history$.bind( at_macros.possibly_make_defn_col_history_table(), thread );
      at_vars.$quoted_defn_col_history$.bind( at_macros.possibly_make_quoted_defn_col_history_table(), thread );
      try
      {
        final SubLObject pcase_var = initial_check_defn_admit_status( col, v_term, mt, quotedP );
        if( pcase_var.eql( $kw23$ADMITTED ) )
        {
          rejectedP = NIL;
        }
        else if( pcase_var.eql( $kw24$REJECTED ) )
        {
          rejectedP = T;
        }
        else if( NIL != nec_defn_rejectsP( col, v_term, mt, quotedP, UNPROVIDED ) )
        {
          rejectedP = T;
        }
        else if( NIL == quotedP && NIL != cycl_grammar.fast_quote_term_p( v_term ) )
        {
          final SubLObject denoted_term = czer_main.unquote_quoted_term( v_term, UNPROVIDED );
          if( NIL != denoted_term && NIL != at_defns.quoted_defns_rejectP( col, denoted_term, mt ) )
          {
            rejectedP = T;
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          at_defns.clear_defn_space();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      at_vars.$quoted_defn_col_history$.rebind( _prev_bind_4, thread );
      at_vars.$defn_col_history$.rebind( _prev_bind_3, thread );
      at_vars.$quoted_defn_fn_history$.rebind( _prev_bind_2, thread );
      at_vars.$defn_fn_history$.rebind( _prev_bind_0, thread );
    }
    if( NIL == rejectedP && $kw24$REJECTED == final_check_defn_admit_status( col, v_term, mt, quotedP ) )
    {
      rejectedP = T;
    }
    return rejectedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20350L)
  public static SubLObject reset_new_quoted_defns_admitP_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), $list18 );
    Hashtables.sethash( $kw19$FUNCTION, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), $sym29$NEW_QUOTED_DEFNS_ADMIT_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20350L)
  public static SubLObject new_quoted_defns_admitP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return defns_admitP_int( col, v_term, mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20350L)
  public static SubLObject new_quoted_defns_admitP(final SubLObject col, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = new_quoted_defns_admitP_metered( col, v_term, mt );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), UNPROVIDED ),
          ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $new_quoted_defns_admitP_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( col, v_term, mt ), Hashtables.gethash( $kw16$ARGS, $new_quoted_defns_admitP_meters$
          .getDynamicValue( thread ), UNPROVIDED ) ) );
      return result;
    }
    return new_quoted_defns_admitP_metered( col, v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20628L)
  public static SubLObject reset_new_quoted_defns_rejectP_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), $list18 );
    Hashtables.sethash( $kw19$FUNCTION, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), $sym32$NEW_QUOTED_DEFNS_REJECT_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20628L)
  public static SubLObject new_quoted_defns_rejectP_metered(final SubLObject col, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return defns_rejectP_int( col, v_term, mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20628L)
  public static SubLObject new_quoted_defns_rejectP(final SubLObject col, final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = new_quoted_defns_rejectP_metered( col, v_term, mt );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), UNPROVIDED ),
          ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS, $new_quoted_defns_rejectP_meters$.getDynamicValue(
          thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $new_quoted_defns_rejectP_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( col, v_term, mt ), Hashtables.gethash( $kw16$ARGS, $new_quoted_defns_rejectP_meters$
          .getDynamicValue( thread ), UNPROVIDED ) ) );
      return result;
    }
    return new_quoted_defns_rejectP_metered( col, v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20749L)
  public static SubLObject initial_check_defn_admit_status(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject admit_status = defining_defns_admitsP( col, v_term, mt, quotedP );
    SubLObject doneP = NIL;
    final SubLObject pcase_var = admit_status;
    if( !pcase_var.eql( $kw23$ADMITTED ) )
    {
      if( !pcase_var.eql( $kw24$REJECTED ) )
      {
        if( NIL != at_vars.$at_apply_necessary_defnsP$.getDynamicValue( thread ) )
        {
          final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding( thread );
          try
          {
            at_vars.$defn_collection$.bind( col, thread );
            if( NIL == doneP )
            {
              SubLObject node_var = col;
              final SubLObject deck_type = $kw36$STACK;
              final SubLObject recur_deck = deck.create_deck( deck_type );
              final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                try
                {
                  final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding( thread );
                  final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
                  try
                  {
                    mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
                    mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
                    mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                      sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                      if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                      {
                        final SubLObject pcase_var_$9 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                        if( pcase_var_$9.eql( $kw38$ERROR ) )
                        {
                          sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                        else if( pcase_var_$9.eql( $kw41$CERROR ) )
                        {
                          sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                        else if( pcase_var_$9.eql( $kw43$WARN ) )
                        {
                          Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                        }
                        else
                        {
                          Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                          Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                        }
                      }
                      final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                      final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                        sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                        if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                        {
                          final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$10 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                          final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars
                                .get_sbhl_module( $const45$genls ) ), thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                            sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                            while ( NIL != node_var && NIL == doneP)
                            {
                              final SubLObject genl = node_var;
                              if( !genl.eql( col ) && NIL != nec_defn_rejectsP( genl, v_term, mt, quotedP, T ) )
                              {
                                doneP = T;
                                admit_status = $kw24$REJECTED;
                              }
                              final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genls ) );
                              SubLObject rest;
                              SubLObject module_var;
                              SubLObject _prev_bind_0_$10;
                              SubLObject _prev_bind_1_$11;
                              SubLObject node;
                              SubLObject d_link;
                              SubLObject mt_links;
                              SubLObject iteration_state;
                              SubLObject mt_$18;
                              SubLObject tv_links;
                              SubLObject _prev_bind_0_$11;
                              SubLObject iteration_state_$20;
                              SubLObject tv;
                              SubLObject link_nodes;
                              SubLObject _prev_bind_0_$12;
                              SubLObject sol;
                              SubLObject set_contents_var;
                              SubLObject basis_object;
                              SubLObject state;
                              SubLObject node_vars_link_node;
                              SubLObject csome_list_var;
                              SubLObject node_vars_link_node2;
                              SubLObject new_list;
                              SubLObject rest_$22;
                              SubLObject generating_fn;
                              SubLObject _prev_bind_0_$13;
                              SubLObject sol2;
                              SubLObject link_nodes2;
                              SubLObject set_contents_var2;
                              SubLObject basis_object2;
                              SubLObject state2;
                              SubLObject node_vars_link_node3;
                              SubLObject csome_list_var2;
                              SubLObject node_vars_link_node4;
                              for( rest = NIL, rest = accessible_modules; NIL == doneP && NIL != rest; rest = rest.rest() )
                              {
                                module_var = rest.first();
                                _prev_bind_0_$10 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                      .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                  node = function_terms.naut_to_nart( node_var );
                                  if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                  {
                                    d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != d_link )
                                    {
                                      mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                      if( NIL != mt_links )
                                      {
                                        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == doneP && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                        {
                                          thread.resetMultipleValues();
                                          mt_$18 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                          tv_links = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != mt_relevance_macros.relevant_mtP( mt_$18 ) )
                                          {
                                            _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.bind( mt_$18, thread );
                                              for( iteration_state_$20 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == doneP && NIL == dictionary_contents
                                                  .do_dictionary_contents_doneP( iteration_state_$20 ); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next( iteration_state_$20 ) )
                                              {
                                                thread.resetMultipleValues();
                                                tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$20 );
                                                link_nodes = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                {
                                                  _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                  try
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                    sol = link_nodes;
                                                    if( NIL != set.set_p( sol ) )
                                                    {
                                                      set_contents_var = set.do_set_internal( sol );
                                                      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                          set_contents_var ); NIL == doneP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                      {
                                                        node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                        if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                            node_vars_link_node, UNPROVIDED ) )
                                                        {
                                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                          deck.deck_push( node_vars_link_node, recur_deck );
                                                        }
                                                      }
                                                    }
                                                    else if( sol.isList() )
                                                    {
                                                      if( NIL == doneP )
                                                      {
                                                        csome_list_var = sol;
                                                        node_vars_link_node2 = NIL;
                                                        node_vars_link_node2 = csome_list_var.first();
                                                        while ( NIL == doneP && NIL != csome_list_var)
                                                        {
                                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                          {
                                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                            deck.deck_push( node_vars_link_node2, recur_deck );
                                                          }
                                                          csome_list_var = csome_list_var.rest();
                                                          node_vars_link_node2 = csome_list_var.first();
                                                        }
                                                      }
                                                    }
                                                    else
                                                    {
                                                      Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$12, thread );
                                                  }
                                                }
                                              }
                                              dictionary_contents.do_dictionary_contents_finalize( iteration_state_$20 );
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$11, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                      }
                                    }
                                    else
                                    {
                                      sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                    }
                                  }
                                  else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                  {
                                    new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                        .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                        : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                            sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                    for( rest_$22 = NIL, rest_$22 = new_list; NIL == doneP && NIL != rest_$22; rest_$22 = rest_$22.rest() )
                                    {
                                      generating_fn = rest_$22.first();
                                      _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                        link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                        if( NIL != set.set_p( sol2 ) )
                                        {
                                          set_contents_var2 = set.do_set_internal( sol2 );
                                          for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                              set_contents_var2 ); NIL == doneP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                          {
                                            node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                            if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                                UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                              deck.deck_push( node_vars_link_node3, recur_deck );
                                            }
                                          }
                                        }
                                        else if( sol2.isList() )
                                        {
                                          if( NIL == doneP )
                                          {
                                            csome_list_var2 = sol2;
                                            node_vars_link_node4 = NIL;
                                            node_vars_link_node4 = csome_list_var2.first();
                                            while ( NIL == doneP && NIL != csome_list_var2)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node4, recur_deck );
                                              }
                                              csome_list_var2 = csome_list_var2.rest();
                                              node_vars_link_node4 = csome_list_var2.first();
                                            }
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$13, thread );
                                      }
                                    }
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$11, thread );
                                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$10, thread );
                                }
                              }
                              node_var = deck.deck_pop( recur_deck );
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$13, thread );
                            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$10, thread );
                            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$9, thread );
                          }
                        }
                        else
                        {
                          sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                              UNPROVIDED, UNPROVIDED );
                        }
                      }
                      finally
                      {
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$12, thread );
                        sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$9, thread );
                        sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$8, thread );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$8, thread );
                      sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$7, thread );
                    }
                  }
                  finally
                  {
                    mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                    mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
                    mt_relevance_macros.$mt$.rebind( _prev_bind_0_$6, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$5, thread );
              }
            }
          }
          finally
          {
            at_vars.$defn_collection$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    return admit_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21788L)
  public static SubLObject final_check_defn_admit_status(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject admit_status = NIL;
    if( NIL != at_vars.$at_additional_defn_checking$.getDynamicValue( thread ) )
    {
      final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding( thread );
      final SubLObject _prev_bind_2 = sdc.$ignoring_sdcP$.currentBinding( thread );
      try
      {
        at_vars.$defn_collection$.bind( col, thread );
        sdc.$ignoring_sdcP$.bind( Equality.eq( at_vars.$at_additional_defn_checking$.getDynamicValue( thread ), $kw49$DISJOINT ), thread );
        final SubLObject admitting_cols = ( NIL != quotedP ) ? all_quoted_defn_admits( v_term, mt ) : all_defn_admits( v_term, mt );
        if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( admitting_cols, ConsesLow.list( col ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          admit_status = $kw24$REJECTED;
        }
      }
      finally
      {
        sdc.$ignoring_sdcP$.rebind( _prev_bind_2, thread );
        at_vars.$defn_collection$.rebind( _prev_bind_0, thread );
      }
    }
    return admit_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22474L)
  public static SubLObject defns_walk_admitP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $defn_term$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $org_collection$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $failing_suf_defns$.currentBinding( thread );
    try
    {
      $defn_term$.bind( v_term, thread );
      $org_collection$.bind( col, thread );
      $failing_suf_defns$.bind( NIL, thread );
      if( NIL != quotedP )
      {
        result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune( sbhl_module_vars.get_sbhl_module( $const45$genls ), col, Symbols.symbol_function( $sym50$COL_QUOTED_DEFN_ADMITS_ ),
            mt, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        result = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune( sbhl_module_vars.get_sbhl_module( $const45$genls ), col, Symbols.symbol_function( $sym51$COL_DEFN_ADMITS_ ), mt,
            UNPROVIDED, UNPROVIDED );
      }
      if( NIL == result && NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) && NIL != wff_vars.$include_suf_defn_violationsP$.getDynamicValue( thread ) && NIL != $failing_suf_defns$.getDynamicValue(
          thread ) && NIL != at_utilities.note_at_violationP() )
      {
        at_routines.note_at_violations( sufficient_defn_violations( col, v_term, $failing_suf_defns$.getDynamicValue( thread ), quotedP, mt ) );
      }
    }
    finally
    {
      $failing_suf_defns$.rebind( _prev_bind_3, thread );
      $org_collection$.rebind( _prev_bind_2, thread );
      $defn_term$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23203L)
  public static SubLObject sufficient_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject v_defns, final SubLObject quotedP, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == dictionary.dictionary_p( at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue( thread ) ) )
    {
      return ConsesLow.list( at_defns.sufficient_defn_violation_data( col, v_term, v_defns, quotedP, mt ) );
    }
    final SubLObject constraints = dictionary.dictionary_lookup( at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), col, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( sufficient_defn_violation( col, v_term, v_defns, quotedP, mt, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23698L)
  public static SubLObject sufficient_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject v_defns, final SubLObject quotedP, final SubLObject mt, final SubLObject constraint_details)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject data = NIL;
    SubLObject constraint_reln = NIL;
    SubLObject via = NIL;
    SubLObject constraint_gaf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint_details, constraint_details, $list52 );
    constraint_reln = constraint_details.first();
    SubLObject current = constraint_details.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list52 );
    via = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list52 );
    constraint_gaf = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( constraint_details, $list52 );
      return NIL;
    }
    if( NIL != constraint_reln && NIL != at_vars.$at_reln$.getDynamicValue( thread ) && !constraint_reln.eql( at_vars.$at_reln$.getDynamicValue( thread ) ) )
    {
      data = ConsesLow.cons( ConsesLow.list( via, constraint_reln ), data );
    }
    if( NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue( thread ) && NIL != constraint_gaf )
    {
      data = ConsesLow.cons( ConsesLow.list( $kw53$AT_CONSTRAINT_GAF, constraint_gaf ), data );
    }
    if( NIL != mt )
    {
      data = ConsesLow.cons( mt, data );
    }
    else
    {
      data = ConsesLow.cons( mt_relevance_macros.$mt$.getDynamicValue( thread ), data );
    }
    if( NIL != quotedP )
    {
      return ConsesLow.listS( $kw54$MAL_ARG_WRT_QUOTED_SUF_DEFNS, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ), col, v_defns, data
      } );
    }
    return ConsesLow.listS( $kw55$MAL_ARG_WRT_SUF_DEFNS, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ), col, v_defns, data
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24391L)
  public static SubLObject col_defn_admitsP(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return col_defn_admitsP_int( col, $defn_term$.getDynamicValue( thread ), mt_relevance_macros.$mt$.getDynamicValue( thread ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24492L)
  public static SubLObject col_quoted_defn_admitsP(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return col_defn_admitsP_int( col, $defn_term$.getDynamicValue( thread ), mt_relevance_macros.$mt$.getDynamicValue( thread ), T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24594L)
  public static SubLObject col_defn_admitsP_int(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == has_suf_defn_somewhereP( col, quotedP ) )
    {
      return ConsesLow.list( NIL, T );
    }
    if( NIL == has_some_defnP( col, quotedP ) )
    {
      return ConsesLow.list( NIL, NIL );
    }
    SubLObject result = NIL;
    SubLObject doneP = NIL;
    final SubLObject pcase_var = $org_collection$.getDynamicValue( thread ).eql( col ) ? T : defining_defns_admitsP( col, v_term, mt, quotedP );
    if( pcase_var.eql( $kw23$ADMITTED ) )
    {
      result = T;
      doneP = T;
    }
    else if( pcase_var.eql( $kw24$REJECTED ) )
    {
      result = NIL;
      doneP = T;
    }
    else if( NIL != nec_defn_permitsP( col, v_term, mt, quotedP, NIL ) )
    {
      if( NIL != suf_defn_admitsP( col, v_term, mt, quotedP ) )
      {
        result = T;
        doneP = T;
      }
    }
    else
    {
      result = NIL;
      doneP = T;
    }
    return ConsesLow.list( result, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25328L)
  public static SubLObject defining_defns_admitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iff_defn = iff_defn( col, quotedP );
    SubLObject admit_status = NIL;
    if( NIL == iff_defn )
    {
      return NIL;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      if( NIL != assertions_high.valid_assertion( iff_defn, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( iff_defn ) ) )
      {
        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg2( iff_defn ) );
        final SubLObject _prev_bind_0_$25 = at_vars.$defn_collection$.currentBinding( thread );
        try
        {
          at_vars.$defn_collection$.bind( col, thread );
          if( NIL != at_defns.viable_defnP( defn, col ) )
          {
            if( NIL != ( ( NIL != quotedP ) ? at_defns.quoted_defn_admitsP( defn, v_term, col, mt ) : at_defns.defn_admitsP( defn, v_term, col, mt ) ) )
            {
              admit_status = $kw23$ADMITTED;
            }
            else
            {
              admit_status = $kw24$REJECTED;
              if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
              {
                at_routines.note_at_violations( defining_defn_violations( col, v_term, defn, quotedP, mt ) );
              }
            }
          }
        }
        finally
        {
          at_vars.$defn_collection$.rebind( _prev_bind_0_$25, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return admit_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26103L)
  public static SubLObject defining_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject defn, final SubLObject quotedP, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == dictionary.dictionary_p( at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue( thread ) ) )
    {
      return ConsesLow.list( at_defns.defining_defn_violation_data( col, v_term, defn, quotedP, mt ) );
    }
    final SubLObject constraints = dictionary.dictionary_lookup( at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), col, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( defining_defn_violation( col, v_term, defn, quotedP, mt, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26588L)
  public static SubLObject defining_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject defn, final SubLObject quotedP, final SubLObject mt, final SubLObject constraint_details)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject data = NIL;
    SubLObject constraint_reln = NIL;
    SubLObject via = NIL;
    SubLObject constraint_gaf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint_details, constraint_details, $list52 );
    constraint_reln = constraint_details.first();
    SubLObject current = constraint_details.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list52 );
    via = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list52 );
    constraint_gaf = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != constraint_reln && NIL != at_vars.$at_reln$.getDynamicValue( thread ) && !constraint_reln.eql( at_vars.$at_reln$.getDynamicValue( thread ) ) )
      {
        data = ConsesLow.cons( ConsesLow.list( via, constraint_reln ), data );
      }
      if( NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue( thread ) && NIL != constraint_gaf )
      {
        data = ConsesLow.cons( ConsesLow.list( $kw53$AT_CONSTRAINT_GAF, constraint_gaf ), data );
      }
      if( NIL != mt )
      {
        data = ConsesLow.cons( mt, data );
      }
      else
      {
        data = ConsesLow.cons( mt_relevance_macros.$mt$.getDynamicValue( thread ), data );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( constraint_details, $list52 );
    }
    if( NIL != quotedP )
    {
      return ConsesLow.listS( $kw56$MAL_ARG_WRT_QUOTED_IFF_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ), col, defn, data
      } );
    }
    return ConsesLow.listS( $kw57$MAL_ARG_WRT_IFF_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ), col, defn, data
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27264L)
  public static SubLObject suf_defn_admitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject suf_defns = suf_defns( col, quotedP );
    SubLObject admittedP = NIL;
    SubLObject doneP = NIL;
    if( NIL == suf_defns )
    {
      return NIL;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      if( NIL == doneP )
      {
        SubLObject csome_list_var = suf_defns;
        SubLObject suf_defn = NIL;
        suf_defn = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          if( NIL != assertions_high.valid_assertion( suf_defn, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( suf_defn ) ) )
          {
            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg2( suf_defn ) );
            final SubLObject _prev_bind_0_$26 = at_vars.$defn_collection$.currentBinding( thread );
            try
            {
              at_vars.$defn_collection$.bind( col, thread );
              if( NIL != at_defns.viable_defnP( defn, col ) )
              {
                if( NIL != ( ( NIL != quotedP ) ? at_defns.quiet_quoted_defn_admitsP( defn, v_term, col, mt ) : at_defns.quiet_defn_admitsP( defn, v_term, col, mt ) ) )
                {
                  admittedP = T;
                  doneP = T;
                }
                else
                {
                  admittedP = NIL;
                  doneP = NIL;
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    final SubLObject item_var = defn;
                    if( NIL == conses_high.member( item_var, $failing_suf_defns$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      $failing_suf_defns$.setDynamicValue( ConsesLow.cons( item_var, $failing_suf_defns$.getDynamicValue( thread ) ), thread );
                    }
                  }
                }
              }
            }
            finally
            {
              at_vars.$defn_collection$.rebind( _prev_bind_0_$26, thread );
            }
          }
          csome_list_var = csome_list_var.rest();
          suf_defn = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return admittedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28104L)
  public static SubLObject nec_defn_permitsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP)
  {
    if( consider_iff_as_necP == UNPROVIDED )
    {
      consider_iff_as_necP = NIL;
    }
    return makeBoolean( NIL == nec_defn_rejectsP( col, v_term, mt, quotedP, consider_iff_as_necP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28269L)
  public static SubLObject reset_nec_defn_rejectsP_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), $list59 );
    Hashtables.sethash( $kw19$FUNCTION, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), $sym60$NEC_DEFN_REJECTS_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28269L)
  public static SubLObject nec_defn_rejectsP_metered(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP)
  {
    if( consider_iff_as_necP == UNPROVIDED )
    {
      consider_iff_as_necP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject nec_defns = nec_defns( col, quotedP );
    SubLObject rejectedP = NIL;
    SubLObject doneP = NIL;
    if( NIL == nec_defns )
    {
      if( NIL != consider_iff_as_necP )
      {
        nec_defns = ConsesLow.list( iff_defn( col, quotedP ) );
      }
      if( NIL == nec_defns )
      {
        return NIL;
      }
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      if( NIL == doneP )
      {
        SubLObject csome_list_var = nec_defns;
        SubLObject nec_defn = NIL;
        nec_defn = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          if( NIL != assertions_high.valid_assertion( nec_defn, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( nec_defn ) ) )
          {
            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg2( nec_defn ) );
            final SubLObject _prev_bind_0_$27 = at_vars.$defn_collection$.currentBinding( thread );
            try
            {
              at_vars.$defn_collection$.bind( col, thread );
              if( NIL != at_defns.viable_defnP( defn, col ) )
              {
                if( NIL != ( ( NIL != quotedP ) ? at_defns.quoted_defn_admitsP( defn, v_term, col, mt ) : at_defns.defn_admitsP( defn, v_term, col, mt ) ) )
                {
                  rejectedP = NIL;
                  doneP = NIL;
                }
                else
                {
                  rejectedP = T;
                  doneP = T;
                  if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
                  {
                    at_routines.note_at_violations( necessary_defn_violations( at_vars.$defn_collection$.getDynamicValue( thread ), v_term, col, defn, quotedP, mt ) );
                  }
                }
              }
            }
            finally
            {
              at_vars.$defn_collection$.rebind( _prev_bind_0_$27, thread );
            }
          }
          csome_list_var = csome_list_var.rest();
          nec_defn = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return rejectedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28269L)
  public static SubLObject nec_defn_rejectsP(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP, SubLObject consider_iff_as_necP)
  {
    if( consider_iff_as_necP == UNPROVIDED )
    {
      consider_iff_as_necP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = nec_defn_rejectsP_metered( col, v_term, mt, quotedP, consider_iff_as_necP );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), UNPROVIDED ),
          ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES, $nec_defn_rejectsP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS, $nec_defn_rejectsP_meters$.getDynamicValue( thread ),
          UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $nec_defn_rejectsP_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( col, v_term, mt, quotedP, consider_iff_as_necP ), Hashtables.gethash( $kw16$ARGS,
          $nec_defn_rejectsP_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      return result;
    }
    return nec_defn_rejectsP_metered( col, v_term, mt, quotedP, consider_iff_as_necP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29367L)
  public static SubLObject necessary_defn_violations(final SubLObject col, final SubLObject v_term, final SubLObject defn_col, final SubLObject defn, final SubLObject quotedP, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == dictionary.dictionary_p( at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue( thread ) ) )
    {
      return ConsesLow.list( at_defns.necessary_defn_violation_data( col, v_term, defn_col, defn, quotedP, mt ) );
    }
    final SubLObject constraints = dictionary.dictionary_lookup( at_routines.$at_applicable_arg_types_with_assertions$.getDynamicValue( thread ), col, UNPROVIDED );
    SubLObject violations = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint_details = NIL;
    constraint_details = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      violations = ConsesLow.cons( necessary_defn_violation( col, v_term, defn_col, defn, quotedP, mt, constraint_details ), violations );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_details = cdolist_list_var.first();
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29882L)
  public static SubLObject necessary_defn_violation(final SubLObject col, final SubLObject v_term, final SubLObject defn_col, final SubLObject defn, final SubLObject quotedP, final SubLObject mt,
      final SubLObject constraint_details)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject data = NIL;
    SubLObject constraint_reln = NIL;
    SubLObject via = NIL;
    SubLObject constraint_gaf = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint_details, constraint_details, $list52 );
    constraint_reln = constraint_details.first();
    SubLObject current = constraint_details.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list52 );
    via = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint_details, $list52 );
    constraint_gaf = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != constraint_reln && NIL != at_vars.$at_reln$.getDynamicValue( thread ) && !constraint_reln.eql( at_vars.$at_reln$.getDynamicValue( thread ) ) )
      {
        data = ConsesLow.cons( ConsesLow.list( via, constraint_reln ), data );
      }
      if( NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue( thread ) && NIL != constraint_gaf )
      {
        data = ConsesLow.cons( ConsesLow.list( $kw53$AT_CONSTRAINT_GAF, constraint_gaf ), data );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( constraint_details, $list52 );
    }
    if( NIL != mt )
    {
      data = ConsesLow.cons( mt, data );
    }
    else
    {
      data = ConsesLow.cons( mt_relevance_macros.$mt$.getDynamicValue( thread ), data );
    }
    if( NIL != quotedP )
    {
      return ConsesLow.listS( $kw62$MAL_ARG_WRT_QUOTED_NEC_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ), col, defn_col, defn, data
      } );
    }
    return ConsesLow.listS( $kw63$MAL_ARG_WRT_NEC_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ), col, defn_col, defn, data
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30578L)
  public static SubLObject new_mts_of_admitting_defns(final SubLObject v_term, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
    try
    {
      at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
      result = mts_from_defn_assertions( col, assertions_of_admitting_defns( v_term, col, $const64$EverythingPSC, NIL, T ) );
    }
    finally
    {
      at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30971L)
  public static SubLObject mts_of_admitting_quoted_defns(final SubLObject v_term, final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding( thread );
    try
    {
      at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind( NIL, thread );
      result = mts_from_defn_assertions( col, assertions_of_admitting_defns( v_term, col, $const64$EverythingPSC, T, T ) );
    }
    finally
    {
      at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31313L)
  public static SubLObject new_hl_justify_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject v_defns = assertions_of_admitting_defns( v_term, collection, mt, NIL, T );
    SubLObject supports = NIL;
    SubLObject cdolist_list_var = v_defns;
    SubLObject defn = NIL;
    defn = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject defn_collection = assertions_high.gaf_arg1( defn );
      if( !defn_collection.eql( collection ) )
      {
        supports = ConsesLow.cons( arguments.make_hl_support( $kw65$GENLS, ConsesLow.list( $const45$genls, defn_collection, collection ), UNPROVIDED, UNPROVIDED ), supports );
      }
      supports = ConsesLow.cons( defn, supports );
      cdolist_list_var = cdolist_list_var.rest();
      defn = cdolist_list_var.first();
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31729L)
  public static SubLObject hl_justify_quoted_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject v_defns = assertions_of_admitting_defns( v_term, collection, mt, T, T );
    SubLObject supports = NIL;
    SubLObject cdolist_list_var = v_defns;
    SubLObject defn = NIL;
    defn = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject defn_collection = assertions_high.gaf_arg1( defn );
      if( !defn_collection.eql( collection ) )
      {
        supports = ConsesLow.cons( arguments.make_hl_support( $kw65$GENLS, ConsesLow.list( $const45$genls, defn_collection, collection ), UNPROVIDED, UNPROVIDED ), supports );
      }
      supports = ConsesLow.cons( defn, supports );
      cdolist_list_var = cdolist_list_var.rest();
      defn = cdolist_list_var.first();
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32146L)
  public static SubLObject assertions_of_admitting_defns(final SubLObject v_term, SubLObject col, final SubLObject mt, final SubLObject quotedP, final SubLObject gather_only_firstP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != obsolete.reifiable_natP( col, UNPROVIDED, UNPROVIDED ) )
    {
      col = narts_high.find_nart( col );
    }
    if( NIL == forts.fort_p( col ) && NIL == has_suf_defn_somewhereP( col, quotedP ) )
    {
      return NIL;
    }
    SubLObject v_defns = NIL;
    SubLObject iff_defn = NIL;
    SubLObject admit_status = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$defn_fn_history$.currentBinding( thread );
    final SubLObject _prev_bind_4 = at_vars.$quoted_defn_fn_history$.currentBinding( thread );
    final SubLObject _prev_bind_5 = at_vars.$defn_col_history$.currentBinding( thread );
    final SubLObject _prev_bind_6 = at_vars.$quoted_defn_col_history$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      at_vars.$defn_fn_history$.bind( at_macros.possibly_make_defn_fn_history_table(), thread );
      at_vars.$quoted_defn_fn_history$.bind( at_macros.possibly_make_quoted_defn_fn_history_table(), thread );
      at_vars.$defn_col_history$.bind( at_macros.possibly_make_defn_col_history_table(), thread );
      at_vars.$quoted_defn_col_history$.bind( at_macros.possibly_make_quoted_defn_col_history_table(), thread );
      try
      {
        thread.resetMultipleValues();
        final SubLObject admit_status_$28 = initial_check_admit_defn( col, v_term, quotedP );
        final SubLObject iff_defn_$29 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        admit_status = admit_status_$28;
        iff_defn = iff_defn_$29;
      }
      finally
      {
        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          final SubLObject pcase_var = admit_status;
          if( pcase_var.eql( $kw23$ADMITTED ) )
          {
            v_defns = ConsesLow.cons( iff_defn, v_defns );
            if( NIL == gather_only_firstP )
            {
              v_defns = ConsesLow.nconc( v_defns, defns_of_admitting_sufficient_defns( v_term, col, quotedP, gather_only_firstP ) );
            }
          }
          else if( !pcase_var.eql( $kw24$REJECTED ) )
          {
            v_defns = defns_of_admitting_sufficient_defns( v_term, col, quotedP, gather_only_firstP );
          }
          if( NIL == quotedP && NIL == v_defns && NIL != cycl_grammar.fast_quote_term_p( v_term ) )
          {
            final SubLObject denoted_term = czer_main.unquote_quoted_term( v_term, UNPROVIDED );
            if( NIL != denoted_term )
            {
              v_defns = assertions_of_admitting_defns( v_term, col, mt, T, gather_only_firstP );
            }
          }
          at_defns.clear_defn_space();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
        }
      }
    }
    finally
    {
      at_vars.$quoted_defn_col_history$.rebind( _prev_bind_6, thread );
      at_vars.$defn_col_history$.rebind( _prev_bind_5, thread );
      at_vars.$quoted_defn_fn_history$.rebind( _prev_bind_4, thread );
      at_vars.$defn_fn_history$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.flatten( v_defns );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33206L)
  public static SubLObject mts_from_defn_assertions(final SubLObject col, final SubLObject v_defns)
  {
    SubLObject mt_sets = NIL;
    SubLObject cdolist_list_var = v_defns;
    SubLObject defn = NIL;
    defn = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject defn_collection = assertions_high.gaf_arg1( defn );
      final SubLObject mt = assertions_high.assertion_mt( defn );
      SubLObject cdolist_list_var_$31 = genls.min_mts_of_genls_paths( defn_collection, col, UNPROVIDED );
      SubLObject mt_set = NIL;
      mt_set = cdolist_list_var_$31.first();
      while ( NIL != cdolist_list_var_$31)
      {
        mt_sets = ConsesLow.cons( ConsesLow.cons( mt, mt_set ), mt_sets );
        cdolist_list_var_$31 = cdolist_list_var_$31.rest();
        mt_set = cdolist_list_var_$31.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      defn = cdolist_list_var.first();
    }
    return genl_mts.max_floor_mts_from_mt_sets( mt_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33535L)
  public static SubLObject initial_check_admit_defn(final SubLObject col, final SubLObject v_term, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject admit_status = defining_defns_admitsP( col, v_term, mt_relevance_macros.$mt$.getDynamicValue( thread ), quotedP );
    SubLObject doneP = NIL;
    SubLObject defn = NIL;
    final SubLObject pcase_var = admit_status;
    if( pcase_var.eql( $kw23$ADMITTED ) )
    {
      defn = iff_defn( col, quotedP );
    }
    else if( !pcase_var.eql( $kw24$REJECTED ) )
    {
      final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding( thread );
      try
      {
        at_vars.$defn_collection$.bind( col, thread );
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
        if( NIL == doneP )
        {
          SubLObject node_var = col;
          final SubLObject deck_type = $kw36$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$32 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject mt_var = mt;
              final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var_$36 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var_$36.eql( $kw38$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var_$36.eql( $kw41$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var_$36.eql( $kw43$WARN ) )
                    {
                      Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$39 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$37 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                            $const45$genls ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                        while ( NIL != node_var && NIL == doneP)
                        {
                          final SubLObject genl = node_var;
                          if( !genl.eql( col ) && NIL != nec_defn_rejectsP( genl, v_term, mt, quotedP, T ) )
                          {
                            doneP = T;
                            admit_status = $kw24$REJECTED;
                          }
                          final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genls ) );
                          SubLObject rest;
                          SubLObject module_var;
                          SubLObject _prev_bind_0_$37;
                          SubLObject _prev_bind_1_$38;
                          SubLObject node;
                          SubLObject d_link;
                          SubLObject mt_links;
                          SubLObject iteration_state;
                          SubLObject mt_$45;
                          SubLObject tv_links;
                          SubLObject _prev_bind_0_$38;
                          SubLObject iteration_state_$47;
                          SubLObject tv;
                          SubLObject link_nodes;
                          SubLObject _prev_bind_0_$39;
                          SubLObject sol;
                          SubLObject set_contents_var;
                          SubLObject basis_object;
                          SubLObject state;
                          SubLObject node_vars_link_node;
                          SubLObject csome_list_var;
                          SubLObject node_vars_link_node2;
                          SubLObject new_list;
                          SubLObject rest_$49;
                          SubLObject generating_fn;
                          SubLObject _prev_bind_0_$40;
                          SubLObject sol2;
                          SubLObject link_nodes2;
                          SubLObject set_contents_var2;
                          SubLObject basis_object2;
                          SubLObject state2;
                          SubLObject node_vars_link_node3;
                          SubLObject csome_list_var2;
                          SubLObject node_vars_link_node4;
                          for( rest = NIL, rest = accessible_modules; NIL == doneP && NIL != rest; rest = rest.rest() )
                          {
                            module_var = rest.first();
                            _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            _prev_bind_1_$38 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              node = function_terms.naut_to_nart( node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == doneP && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      mt_$45 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$45 ) )
                                      {
                                        _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$45, thread );
                                          for( iteration_state_$47 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == doneP && NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$47 ); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next( iteration_state_$47 ) )
                                          {
                                            thread.resetMultipleValues();
                                            tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$47 );
                                            link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  set_contents_var = set.do_set_internal( sol );
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == doneP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  if( NIL == doneP )
                                                  {
                                                    csome_list_var = sol;
                                                    node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var.first();
                                                    while ( NIL == doneP && NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node2, recur_deck );
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      node_vars_link_node2 = csome_list_var.first();
                                                    }
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$39, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$47 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$38, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                    .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                for( rest_$49 = NIL, rest_$49 = new_list; NIL == doneP && NIL != rest_$49; rest_$49 = rest_$49.rest() )
                                {
                                  generating_fn = rest_$49.first();
                                  _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      set_contents_var2 = set.do_set_internal( sol2 );
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == doneP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      if( NIL == doneP )
                                      {
                                        csome_list_var2 = sol2;
                                        node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var2.first();
                                        while ( NIL == doneP && NIL != csome_list_var2)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                            deck.deck_push( node_vars_link_node4, recur_deck );
                                          }
                                          csome_list_var2 = csome_list_var2.rest();
                                          node_vars_link_node4 = csome_list_var2.first();
                                        }
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$40, thread );
                                  }
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$38, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$37, thread );
                            }
                          }
                          node_var = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$40, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$37, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$36, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$39, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$36, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$35, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$35, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$34, thread );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$33, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$32, thread );
          }
        }
      }
      finally
      {
        at_vars.$defn_collection$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( admit_status, defn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34077L)
  public static SubLObject defns_of_admitting_sufficient_defns(final SubLObject v_term, final SubLObject col, final SubLObject quotedP, final SubLObject gather_only_firstP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_defns = NIL;
    final SubLObject _prev_bind_0 = $defn_term$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$defn_collection$.currentBinding( thread );
    try
    {
      $defn_term$.bind( v_term, thread );
      at_vars.$defn_collection$.bind( col, thread );
      final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
      if( NIL != gather_only_firstP )
      {
        if( NIL != quotedP )
        {
          v_defns = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune( sbhl_module_vars.get_sbhl_module( $const45$genls ), col, Symbols.symbol_function(
              $sym66$ADMITTING_QUOTED_DEFN_ASSERTION ), mt, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          v_defns = sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune( sbhl_module_vars.get_sbhl_module( $const45$genls ), col, Symbols.symbol_function(
              $sym67$ADMITTING_DEFN_ASSERTION ), mt, UNPROVIDED, UNPROVIDED );
        }
      }
      else if( NIL != quotedP )
      {
        v_defns = sbhl_search_methods.sbhl_all_backward_true_nodes_with_prune( sbhl_module_vars.get_sbhl_module( $const45$genls ), col, Symbols.symbol_function( $sym68$ADMITTING_QUOTED_DEFN_ASSERTIONS ), mt,
            UNPROVIDED );
      }
      else
      {
        v_defns = sbhl_search_methods.sbhl_all_backward_true_nodes_with_prune( sbhl_module_vars.get_sbhl_module( $const45$genls ), col, Symbols.symbol_function( $sym69$ADMITTING_DEFN_ASSERTIONS ), mt, UNPROVIDED );
      }
    }
    finally
    {
      at_vars.$defn_collection$.rebind( _prev_bind_2, thread );
      $defn_term$.rebind( _prev_bind_0, thread );
    }
    return v_defns;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34925L)
  public static SubLObject admitting_defn_assertions(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return admitting_defn_assertions_int( col, $defn_term$.getDynamicValue( thread ), NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35070L)
  public static SubLObject admitting_quoted_defn_assertions(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return admitting_defn_assertions_int( col, $defn_term$.getDynamicValue( thread ), T, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35227L)
  public static SubLObject admitting_defn_assertion(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return admitting_defn_assertions_int( col, $defn_term$.getDynamicValue( thread ), NIL, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35370L)
  public static SubLObject admitting_quoted_defn_assertion(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return admitting_defn_assertions_int( col, $defn_term$.getDynamicValue( thread ), T, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35525L)
  public static SubLObject admitting_defn_assertions_int(final SubLObject col, final SubLObject v_term, final SubLObject quotedP, final SubLObject gather_only_firstP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == has_suf_defn_somewhereP( col, quotedP ) )
    {
      return ConsesLow.list( NIL, T );
    }
    if( NIL == has_some_defnP( col, quotedP ) )
    {
      return ConsesLow.list( NIL, NIL );
    }
    final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    SubLObject v_defns = NIL;
    SubLObject doneP = NIL;
    final SubLObject pcase_var = at_vars.$defn_collection$.getDynamicValue( thread ).eql( col ) ? T : defining_defns_admitsP( col, v_term, mt, quotedP );
    if( pcase_var.eql( $kw23$ADMITTED ) )
    {
      v_defns = ConsesLow.cons( iff_defn( col, quotedP ), v_defns );
      doneP = gather_only_firstP;
    }
    else if( pcase_var.eql( $kw24$REJECTED ) )
    {
      v_defns = NIL;
      doneP = T;
    }
    else if( NIL != nec_defn_permitsP( col, v_term, mt, quotedP, NIL ) )
    {
      final SubLObject suf_defns = suf_admitting_defns( col, v_term, mt, quotedP );
      if( NIL != suf_defns )
      {
        v_defns = ConsesLow.cons( suf_defns, v_defns );
        doneP = gather_only_firstP;
      }
    }
    else
    {
      v_defns = NIL;
      doneP = T;
    }
    return ConsesLow.list( v_defns, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36419L)
  public static SubLObject suf_admitting_defns(final SubLObject col, final SubLObject v_term, final SubLObject mt, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject suf_defns = suf_defns( col, quotedP );
    SubLObject admitting_defns = NIL;
    if( NIL == suf_defns )
    {
      return NIL;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      SubLObject cdolist_list_var = suf_defns;
      SubLObject suf_defn = NIL;
      suf_defn = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != assertions_high.valid_assertion( suf_defn, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( suf_defn ) ) )
        {
          final SubLObject defn = el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg2( suf_defn ) );
          if( NIL != at_defns.viable_defnP( defn, col ) && NIL != ( ( NIL != quotedP ) ? at_defns.quiet_quoted_defn_admitsP( defn, v_term, col, mt ) : at_defns.quiet_defn_admitsP( defn, v_term, col, mt ) ) )
          {
            admitting_defns = ConsesLow.cons( suf_defn, admitting_defns );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        suf_defn = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return admitting_defns;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37602L)
  public static SubLObject min_defn_admits(final SubLObject v_object, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject nearest_isa = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == nearest_isa )
      {
        SubLObject csome_list_var = $min_defn_admits_map$.getGlobalValue();
        SubLObject defn_info = NIL;
        defn_info = csome_list_var.first();
        while ( NIL == nearest_isa && NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = defn_info;
          SubLObject defn = NIL;
          SubLObject collection = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
          defn = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
          collection = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != Functions.funcall( defn, v_object ) )
            {
              nearest_isa = collection;
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
          }
          csome_list_var = csome_list_var.rest();
          defn_info = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != nearest_isa )
    {
      return ConsesLow.list( nearest_isa );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38039L)
  public static SubLObject all_defn_admits(final SubLObject v_object, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject nearest_isas = min_defn_admits( v_object, domain_mt );
      result = genls.union_all_genls( nearest_isas, domain_mt, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return cardinality_estimates.sort_by_generality_estimate( conses_high.copy_list( result ), $kw72$ASCENDING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38741L)
  public static SubLObject min_quoted_defn_admits(final SubLObject v_object, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject nearest_quoted_isa = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == nearest_quoted_isa )
      {
        SubLObject csome_list_var = $min_quoted_defn_admits_map$.getGlobalValue();
        SubLObject quoted_defn_info = NIL;
        quoted_defn_info = csome_list_var.first();
        while ( NIL == nearest_quoted_isa && NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = quoted_defn_info;
          SubLObject quoted_defn = NIL;
          SubLObject collection = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
          quoted_defn = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
          collection = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != Functions.funcall( quoted_defn, v_object ) )
            {
              nearest_quoted_isa = collection;
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list74 );
          }
          csome_list_var = csome_list_var.rest();
          quoted_defn_info = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != nearest_quoted_isa )
    {
      return ConsesLow.list( nearest_quoted_isa );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39262L)
  public static SubLObject all_quoted_defn_admits(final SubLObject v_object, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = domain_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject nearest_quoted_isas = min_quoted_defn_admits( v_object, domain_mt );
      result = genls.union_all_genls( nearest_quoted_isas, domain_mt, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return cardinality_estimates.sort_by_generality_estimate( conses_high.copy_list( result ), $kw72$ASCENDING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39618L)
  public static SubLObject min_generalizations(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != fort_types_interface.isa_collection_in_any_mtP( v_object ) )
    {
      return genls.min_genls( v_object, mt, UNPROVIDED );
    }
    if( NIL != cycl_grammar.cycl_unrepresented_term_p( v_object ) )
    {
      return min_defn_admits( v_object, mt );
    }
    return isa.min_isa( v_object, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39939L)
  public static SubLObject genericize_term_wrt_types(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject types = min_generalizations( v_term, mt );
    final SubLObject collectionP = fort_types_interface.isa_collectionP( v_term, mt );
    return genericize_term_types_int( types, collectionP, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40215L)
  public static SubLObject genericize_constraints_wrt_types(final SubLObject isa_constraints, final SubLObject genls_constraints, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != genls_constraints )
    {
      return genericize_term_types_int( genls_constraints, T, mt );
    }
    return genericize_term_types_int( isa_constraints, NIL, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40472L)
  public static SubLObject genericize_term_types_int(final SubLObject types, final SubLObject qua_collectionP, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject col = ( NIL != list_utilities.singletonP( types ) ) ? types.first()
        : ( ( NIL != list_utilities.doubletonP( types ) ) ? el_utilities.make_formula( $const75$CollectionIntersection2Fn, types, UNPROVIDED )
            : el_utilities.make_unary_formula( $const76$CollectionIntersectionFn, el_utilities.make_el_set( types, UNPROVIDED ) ) );
    if( NIL != qua_collectionP )
    {
      return col;
    }
    return el_utilities.make_unary_formula( $const77$SomeFn, col );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40962L)
  public static SubLObject update_iff_or_suf_defn(final SubLObject assertion, final SubLObject addP, final SubLObject quotedP, final SubLObject type)
  {
    final SubLObject col = assertions_high.gaf_arg1( assertion );
    update_suf_defn_cache( col, addP, quotedP );
    update_defns( col, assertion, addP, type );
    return col;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41337L)
  public static SubLObject update_nec_defn(final SubLObject assertion, final SubLObject addP, final SubLObject type)
  {
    final SubLObject col = assertions_high.gaf_arg1( assertion );
    update_defns( col, assertion, addP, type );
    return col;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41488L)
  public static SubLObject new_add_iff_defn(SubLObject source, final SubLObject assertion)
  {
    return update_iff_or_suf_defn( assertion, T, NIL, $kw78$IFF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41619L)
  public static SubLObject new_remove_iff_defn(SubLObject source, final SubLObject assertion)
  {
    return update_iff_or_suf_defn( assertion, NIL, NIL, $kw78$IFF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41757L)
  public static SubLObject new_add_suf_defn(SubLObject source, final SubLObject assertion)
  {
    return update_iff_or_suf_defn( assertion, T, NIL, $kw81$SUF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41888L)
  public static SubLObject new_remove_suf_defn(SubLObject source, final SubLObject assertion)
  {
    return update_iff_or_suf_defn( assertion, NIL, NIL, $kw81$SUF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42026L)
  public static SubLObject add_nec_defn(SubLObject source, final SubLObject assertion)
  {
    return update_nec_defn( assertion, T, $kw84$NEC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42142L)
  public static SubLObject remove_nec_defn(SubLObject source, final SubLObject assertion)
  {
    return update_nec_defn( assertion, NIL, $kw84$NEC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42265L)
  public static SubLObject new_add_iff_quoted_defn(SubLObject source, final SubLObject assertion)
  {
    return update_iff_or_suf_defn( assertion, T, T, $kw87$QIFF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42402L)
  public static SubLObject new_remove_iff_quoted_defn(SubLObject source, final SubLObject assertion)
  {
    return update_iff_or_suf_defn( assertion, NIL, T, $kw87$QIFF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42546L)
  public static SubLObject new_add_suf_quoted_defn(SubLObject source, final SubLObject assertion)
  {
    return update_iff_or_suf_defn( assertion, T, T, $kw90$QSUF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42683L)
  public static SubLObject new_remove_suf_quoted_defn(SubLObject source, final SubLObject assertion)
  {
    return update_iff_or_suf_defn( assertion, NIL, T, $kw90$QSUF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42827L)
  public static SubLObject add_nec_quoted_defn(SubLObject source, final SubLObject assertion)
  {
    return update_nec_defn( assertion, T, $kw93$QNEC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42951L)
  public static SubLObject remove_nec_quoted_defn(SubLObject source, final SubLObject assertion)
  {
    return update_nec_defn( assertion, NIL, $kw93$QNEC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43082L)
  public static SubLObject handle_added_genl_for_suf_defns_int(final SubLObject spec, final SubLObject genl, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject spec_suf_count = suf_defn_count( spec, quotedP );
    if( spec_suf_count.isInteger() && spec_suf_count.numG( ZERO_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym96$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const64$EverythingPSC, thread );
        SubLObject node_var = genl;
        final SubLObject deck_type = $kw36$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$52 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw38$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw41$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw43$WARN ) )
                {
                  Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$55 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( genl, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$56 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$59 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const45$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject genl_col = node_var;
                      inc_suf_defn_count( genl_col, quotedP, spec_suf_count );
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$56 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$57 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$63;
                                      for( iteration_state_$63 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$63 ); iteration_state_$63 = dictionary_contents.do_dictionary_contents_next( iteration_state_$63 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$63 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$58, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$63 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$57, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$65;
                            final SubLObject new_list = cdolist_list_var_$65 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$65.first();
                            while ( NIL != cdolist_list_var_$65)
                            {
                              final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$59, thread );
                              }
                              cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                              generating_fn = cdolist_list_var_$65.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$57, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$56, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$59, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$56, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$55, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$55, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$54, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$54, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$53, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$60, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$52, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43468L)
  public static SubLObject reset_new_handle_added_genl_for_suf_defns_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), $list98 );
    Hashtables.sethash( $kw19$FUNCTION, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), $sym99$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43468L)
  public static SubLObject new_handle_added_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl)
  {
    return handle_added_genl_for_suf_defns_int( spec, genl, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43468L)
  public static SubLObject new_handle_added_genl_for_suf_defns(final SubLObject spec, final SubLObject genl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = new_handle_added_genl_for_suf_defns_metered( spec, genl );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(
          thread ), UNPROVIDED ), ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES, $new_handle_added_genl_for_suf_defns_meters$
          .getDynamicValue( thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS, $new_handle_added_genl_for_suf_defns_meters$
          .getDynamicValue( thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( spec, genl ), Hashtables.gethash( $kw16$ARGS,
          $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      return result;
    }
    return new_handle_added_genl_for_suf_defns_metered( spec, genl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43638L)
  public static SubLObject reset_new_handle_added_genl_for_suf_quoted_defns_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), $list98 );
    Hashtables.sethash( $kw19$FUNCTION, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), $sym102$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43638L)
  public static SubLObject new_handle_added_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl)
  {
    return handle_added_genl_for_suf_defns_int( spec, genl, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43638L)
  public static SubLObject new_handle_added_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = new_handle_added_genl_for_suf_quoted_defns_metered( spec, genl );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $new_handle_added_genl_for_suf_quoted_defns_meters$
          .getDynamicValue( thread ), UNPROVIDED ), ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES,
          $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS,
          $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( spec, genl ), Hashtables.gethash( $kw16$ARGS,
          $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      return result;
    }
    return new_handle_added_genl_for_suf_quoted_defns_metered( spec, genl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43813L)
  public static SubLObject handle_removed_genl_for_suf_defns_int(final SubLObject spec, final SubLObject genl, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym96$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const64$EverythingPSC, thread );
      if( NIL == genls.genlP( spec, genl, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject spec_suf_count = suf_defn_count( spec, quotedP );
        if( spec_suf_count.isInteger() && spec_suf_count.numG( ZERO_INTEGER ) )
        {
          SubLObject node_var = genl;
          final SubLObject deck_type = $kw36$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$68 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$69 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$70 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw38$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw41$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw43$WARN ) )
                  {
                    Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$70 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$71 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( genl, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$71 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$72 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                          $const45$genls ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                      while ( NIL != node_var)
                      {
                        final SubLObject genl_col = node_var;
                        dec_suf_defn_count( genl_col, quotedP, spec_suf_count );
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genls ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$72 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$79;
                                        for( iteration_state_$79 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$79 ); iteration_state_$79 = dictionary_contents.do_dictionary_contents_next( iteration_state_$79 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$79 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$74, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$79 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$73, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$81;
                              final SubLObject new_list = cdolist_list_var_$81 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$81.first();
                              while ( NIL != cdolist_list_var_$81)
                              {
                                final SubLObject _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var2 = sol2;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$75, thread );
                                }
                                cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                                generating_fn = cdolist_list_var_$81.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$73, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$72, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        node_var = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$75, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$72, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$71, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$71, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$70, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$70, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$69, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$76, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$68, thread );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44238L)
  public static SubLObject reset_new_handle_removed_genl_for_suf_defns_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), $list98 );
    Hashtables.sethash( $kw19$FUNCTION, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), $sym105$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44238L)
  public static SubLObject new_handle_removed_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl)
  {
    return handle_removed_genl_for_suf_defns_int( spec, genl, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44238L)
  public static SubLObject new_handle_removed_genl_for_suf_defns(final SubLObject spec, final SubLObject genl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = new_handle_removed_genl_for_suf_defns_metered( spec, genl );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $new_handle_removed_genl_for_suf_defns_meters$
          .getDynamicValue( thread ), UNPROVIDED ), ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES, $new_handle_removed_genl_for_suf_defns_meters$
          .getDynamicValue( thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS, $new_handle_removed_genl_for_suf_defns_meters$
          .getDynamicValue( thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( spec, genl ), Hashtables.gethash( $kw16$ARGS,
          $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      return result;
    }
    return new_handle_removed_genl_for_suf_defns_metered( spec, genl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44412L)
  public static SubLObject reset_new_handle_removed_genl_for_suf_quoted_defns_meters()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( $kw13$CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), ZERO_INTEGER );
    Hashtables.sethash( $kw14$TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw15$RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw16$ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), NIL );
    Hashtables.sethash( $kw17$ARG_LIST, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), $list98 );
    Hashtables.sethash( $kw19$FUNCTION, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), $sym108$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44412L)
  public static SubLObject new_handle_removed_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl)
  {
    return handle_removed_genl_for_suf_defns_int( spec, genl, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44412L)
  public static SubLObject new_handle_removed_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$defn_metersP$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject run_time = NIL;
      final SubLObject time_var = Time.get_internal_real_time();
      result = new_handle_removed_genl_for_suf_quoted_defns_metered( spec, genl );
      run_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      Hashtables.sethash( $kw13$CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), Numbers.add( Hashtables.gethash( $kw13$CALLS, $new_handle_removed_genl_for_suf_quoted_defns_meters$
          .getDynamicValue( thread ), UNPROVIDED ), ONE_INTEGER ) );
      Hashtables.sethash( $kw14$TIMES, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( run_time, Hashtables.gethash( $kw14$TIMES,
          $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw15$RESULTS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( result, Hashtables.gethash( $kw15$RESULTS,
          $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      Hashtables.sethash( $kw16$ARGS, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), ConsesLow.cons( ConsesLow.list( spec, genl ), Hashtables.gethash( $kw16$ARGS,
          $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue( thread ), UNPROVIDED ) ) );
      return result;
    }
    return new_handle_removed_genl_for_suf_quoted_defns_metered( spec, genl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44591L)
  public static SubLObject clear_defns()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL != defns_cache_definedP( $has_suf_defn_cache_index$.getGlobalValue() ) )
    {
      defns_cache_clrhash( $has_suf_defn_cache_index$.getGlobalValue() );
    }
    if( NIL != defns_cache_definedP( $iff_defns_index$.getGlobalValue() ) )
    {
      defns_cache_clrhash( $iff_defns_index$.getGlobalValue() );
    }
    if( NIL != defns_cache_definedP( $suf_defns_index$.getGlobalValue() ) )
    {
      defns_cache_clrhash( $suf_defns_index$.getGlobalValue() );
    }
    if( NIL != defns_cache_definedP( $nec_defns_index$.getGlobalValue() ) )
    {
      defns_cache_clrhash( $nec_defns_index$.getGlobalValue() );
    }
    if( NIL != defns_cache_definedP( $has_quoted_suf_defn_cache_index$.getGlobalValue() ) )
    {
      defns_cache_clrhash( $has_quoted_suf_defn_cache_index$.getGlobalValue() );
    }
    if( NIL != defns_cache_definedP( $quoted_iff_defns_index$.getGlobalValue() ) )
    {
      defns_cache_clrhash( $quoted_iff_defns_index$.getGlobalValue() );
    }
    if( NIL != defns_cache_definedP( $quoted_suf_defns_index$.getGlobalValue() ) )
    {
      defns_cache_clrhash( $quoted_suf_defns_index$.getGlobalValue() );
    }
    if( NIL != defns_cache_definedP( $quoted_nec_defns_index$.getGlobalValue() ) )
    {
      defns_cache_clrhash( $quoted_nec_defns_index$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45543L)
  public static SubLObject initialize_defns_cache()
  {
    if( NIL == defns_cache_definedP( $has_suf_defn_cache_index$.getGlobalValue() ) )
    {
      defns_cache_make_hash_table( $has_suf_defn_cache_index$.getGlobalValue(), $int110$400 );
    }
    if( NIL == defns_cache_definedP( $iff_defns_index$.getGlobalValue() ) )
    {
      defns_cache_make_hash_table( $iff_defns_index$.getGlobalValue(), $int111$100 );
    }
    if( NIL == defns_cache_definedP( $suf_defns_index$.getGlobalValue() ) )
    {
      defns_cache_make_hash_table( $suf_defns_index$.getGlobalValue(), $int111$100 );
    }
    if( NIL == defns_cache_definedP( $nec_defns_index$.getGlobalValue() ) )
    {
      defns_cache_make_hash_table( $nec_defns_index$.getGlobalValue(), $int111$100 );
    }
    if( NIL == defns_cache_definedP( $has_quoted_suf_defn_cache_index$.getGlobalValue() ) )
    {
      defns_cache_make_hash_table( $has_quoted_suf_defn_cache_index$.getGlobalValue(), $int110$400 );
    }
    if( NIL == defns_cache_definedP( $quoted_iff_defns_index$.getGlobalValue() ) )
    {
      defns_cache_make_hash_table( $quoted_iff_defns_index$.getGlobalValue(), $int111$100 );
    }
    if( NIL == defns_cache_definedP( $quoted_suf_defns_index$.getGlobalValue() ) )
    {
      defns_cache_make_hash_table( $quoted_suf_defns_index$.getGlobalValue(), $int111$100 );
    }
    if( NIL == defns_cache_definedP( $quoted_nec_defns_index$.getGlobalValue() ) )
    {
      defns_cache_make_hash_table( $quoted_nec_defns_index$.getGlobalValue(), $int111$100 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46565L)
  public static SubLObject initialize_defns()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_defns.$use_new_defns_functionsP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    final SubLObject str = $str112$Initializing_defns___;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
      utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
      utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
      utilities_macros.$is_noting_progressP$.bind( T, thread );
      utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
      utilities_macros.noting_progress_preamble( str );
      initialize_defns_cache();
      clear_defns();
      final SubLObject _prev_bind_0_$84 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$85 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym96$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const64$EverythingPSC, thread );
        SubLObject pred_var = $const113$defnIff;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str_$86 = NIL;
          final SubLObject _prev_bind_0_$85 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$86 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$89 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_3_$90 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_4_$91 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_5_$92 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_6_$93 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_7_$94 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str_$86 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str_$86 );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw114$GAF, $kw115$TRUE, NIL );
                  SubLObject done_var_$95 = NIL;
                  final SubLObject token_var_$96 = NIL;
                  while ( NIL == done_var_$95)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$96 );
                    final SubLObject valid_$97 = makeBoolean( !token_var_$96.eql( assertion ) );
                    if( NIL != valid_$97 )
                    {
                      at_defns.add_iff_defn( assertion, assertion );
                    }
                    done_var_$95 = makeBoolean( NIL == valid_$97 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$86, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_7_$94, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_6_$93, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_5_$92, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_4_$91, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$90, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$89, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$86, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$85, thread );
          }
        }
        pred_var = $const116$defnSufficient;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str_$87 = NIL;
          final SubLObject _prev_bind_0_$87 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$87 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$90 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_3_$91 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_4_$92 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_5_$93 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_6_$94 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_7_$95 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str_$87 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str_$87 );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw114$GAF, $kw115$TRUE, NIL );
                  SubLObject done_var_$96 = NIL;
                  final SubLObject token_var_$97 = NIL;
                  while ( NIL == done_var_$96)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$97 );
                    final SubLObject valid_$98 = makeBoolean( !token_var_$97.eql( assertion ) );
                    if( NIL != valid_$98 )
                    {
                      at_defns.add_suf_defn( assertion, assertion );
                    }
                    done_var_$96 = makeBoolean( NIL == valid_$98 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$88, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_7_$95, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_6_$94, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_5_$93, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_4_$92, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$91, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$90, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$87, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$87, thread );
          }
        }
        pred_var = $const117$defnNecessary;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str_$88 = NIL;
          final SubLObject _prev_bind_0_$89 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$88 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$91 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_3_$92 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_4_$93 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_5_$94 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_6_$95 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_7_$96 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str_$88 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str_$88 );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw114$GAF, $kw115$TRUE, NIL );
                  SubLObject done_var_$97 = NIL;
                  final SubLObject token_var_$98 = NIL;
                  while ( NIL == done_var_$97)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$98 );
                    final SubLObject valid_$99 = makeBoolean( !token_var_$98.eql( assertion ) );
                    if( NIL != valid_$99 )
                    {
                      add_nec_defn( assertion, assertion );
                    }
                    done_var_$97 = makeBoolean( NIL == valid_$99 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$90, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_7_$96, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_6_$95, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_5_$94, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_4_$93, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$92, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$91, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$88, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$89, thread );
          }
        }
        pred_var = $const118$quotedDefnIff;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str_$89 = NIL;
          final SubLObject _prev_bind_0_$91 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$89 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$92 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_3_$93 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_4_$94 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_5_$95 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_6_$96 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_7_$97 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str_$89 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str_$89 );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw114$GAF, $kw115$TRUE, NIL );
                  SubLObject done_var_$98 = NIL;
                  final SubLObject token_var_$99 = NIL;
                  while ( NIL == done_var_$98)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$99 );
                    final SubLObject valid_$100 = makeBoolean( !token_var_$99.eql( assertion ) );
                    if( NIL != valid_$100 )
                    {
                      at_defns.add_iff_quoted_defn( assertion, assertion );
                    }
                    done_var_$98 = makeBoolean( NIL == valid_$100 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$92, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_7_$97, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_6_$96, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_5_$95, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_4_$94, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$93, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$92, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$89, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$91, thread );
          }
        }
        pred_var = $const119$quotedDefnSufficient;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str_$90 = NIL;
          final SubLObject _prev_bind_0_$93 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$90 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$93 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_3_$94 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_4_$95 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_5_$96 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_6_$97 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_7_$98 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str_$90 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str_$90 );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw114$GAF, $kw115$TRUE, NIL );
                  SubLObject done_var_$99 = NIL;
                  final SubLObject token_var_$100 = NIL;
                  while ( NIL == done_var_$99)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$100 );
                    final SubLObject valid_$101 = makeBoolean( !token_var_$100.eql( assertion ) );
                    if( NIL != valid_$101 )
                    {
                      at_defns.add_suf_quoted_defn( assertion, assertion );
                    }
                    done_var_$99 = makeBoolean( NIL == valid_$101 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$94, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_7_$98, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_6_$97, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_5_$96, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_4_$95, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$94, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$93, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$90, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$93, thread );
          }
        }
        pred_var = $const120$quotedDefnNecessary;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str_$91 = NIL;
          final SubLObject _prev_bind_0_$95 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$91 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$94 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_3_$95 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_4_$96 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_5_$97 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_6_$98 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_7_$99 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str_$91 ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str_$91 );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw114$GAF, $kw115$TRUE, NIL );
                  SubLObject done_var_$100 = NIL;
                  final SubLObject token_var_$101 = NIL;
                  while ( NIL == done_var_$100)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$101 );
                    final SubLObject valid_$102 = makeBoolean( !token_var_$101.eql( assertion ) );
                    if( NIL != valid_$102 )
                    {
                      add_nec_quoted_defn( assertion, assertion );
                    }
                    done_var_$100 = makeBoolean( NIL == valid_$102 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$96 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values6 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values6 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$96, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_7_$99, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_6_$98, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_5_$97, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_4_$96, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$95, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$94, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$91, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$95, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$85, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$84, thread );
      }
      utilities_macros.noting_progress_postamble();
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
      utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47524L)
  public static SubLObject inc_suf_defn_count(final SubLObject col, final SubLObject quotedP, SubLObject count)
  {
    if( count == UNPROVIDED )
    {
      count = ONE_INTEGER;
    }
    SubLObject suf_defn_count = suf_defn_count( col, quotedP );
    if( NIL == suf_defn_count )
    {
      suf_defn_count = ZERO_INTEGER;
    }
    suf_defn_count = Numbers.add( suf_defn_count, count );
    set_suf_defn_count( col, suf_defn_count, quotedP );
    return suf_defn_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47848L)
  public static SubLObject dec_suf_defn_count(final SubLObject col, final SubLObject quotedP, SubLObject count)
  {
    if( count == UNPROVIDED )
    {
      count = ONE_INTEGER;
    }
    SubLObject suf_defn_count = suf_defn_count( col, quotedP );
    if( !suf_defn_count.isInteger() )
    {
      suf_defn_count = ZERO_INTEGER;
    }
    suf_defn_count = Numbers.subtract( suf_defn_count, count );
    if( suf_defn_count.numG( ZERO_INTEGER ) )
    {
      set_suf_defn_count( col, suf_defn_count, quotedP );
    }
    else
    {
      rem_suf_defn_count( col, quotedP );
    }
    return suf_defn_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48247L)
  public static SubLObject update_suf_defn_cache(final SubLObject col, final SubLObject incP, final SubLObject quotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym96$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const64$EverythingPSC, thread );
      if( NIL != incP )
      {
        SubLObject node_var = col;
        final SubLObject deck_type = $kw36$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$164 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$165 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$166 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw38$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw41$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw43$WARN ) )
                {
                  Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$166 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$167 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$167 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$168 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$171 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const45$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject genl = node_var;
                      inc_suf_defn_count( genl, quotedP, UNPROVIDED );
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$168 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$169 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$169 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$175;
                                      for( iteration_state_$175 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$175 ); iteration_state_$175 = dictionary_contents.do_dictionary_contents_next( iteration_state_$175 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$175 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$170 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$170, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$175 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$169, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$177;
                            final SubLObject new_list = cdolist_list_var_$177 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$177.first();
                            while ( NIL != cdolist_list_var_$177)
                            {
                              final SubLObject _prev_bind_0_$171 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$171, thread );
                              }
                              cdolist_list_var_$177 = cdolist_list_var_$177.rest();
                              generating_fn = cdolist_list_var_$177.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$169, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$168, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$171, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$168, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$167, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$167, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$166, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$166, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$165, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$172 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$172, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$164, thread );
        }
      }
      else
      {
        SubLObject node_var = col;
        final SubLObject deck_type = $kw36$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$173 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$174 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$170 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw38$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw41$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw43$WARN ) )
                {
                  Errors.warn( $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str42$continue_anyway, $str39$_A_is_not_a__A, tv_var, $sym40$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$175 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$171 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$176 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$172 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$172 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const45$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject genl = node_var;
                      dec_suf_defn_count( genl, quotedP, UNPROVIDED );
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$177 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$173 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$178 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$176;
                                      for( iteration_state_$176 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$176 ); iteration_state_$176 = dictionary_contents.do_dictionary_contents_next( iteration_state_$176 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$176 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$179 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$179, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$176 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$178, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str47$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$178;
                            final SubLObject new_list = cdolist_list_var_$178 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$178.first();
                            while ( NIL != cdolist_list_var_$178)
                            {
                              final SubLObject _prev_bind_0_$180 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str46$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$180, thread );
                              }
                              cdolist_list_var_$178 = cdolist_list_var_$178.rest();
                              generating_fn = cdolist_list_var_$178.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$173, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$177, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$172, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$172, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$176, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str48$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$171, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$175, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$170, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$174, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$181 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$181, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$173, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48510L)
  public static SubLObject update_defns(final SubLObject col, final SubLObject defn_assertion, final SubLObject addP, final SubLObject type)
  {
    if( type.eql( $kw78$IFF ) )
    {
      if( NIL != addP )
      {
        return defns_cache_sethash( col, $iff_defns_index$.getGlobalValue(), defn_assertion );
      }
      return defns_cache_remhash( col, $iff_defns_index$.getGlobalValue() );
    }
    else if( type.eql( $kw87$QIFF ) )
    {
      if( NIL != addP )
      {
        return defns_cache_sethash( col, $quoted_iff_defns_index$.getGlobalValue(), defn_assertion );
      }
      return defns_cache_remhash( col, $quoted_iff_defns_index$.getGlobalValue() );
    }
    else if( type.eql( $kw81$SUF ) )
    {
      if( NIL != addP )
      {
        return defns_cache_push_hash( col, defn_assertion, $suf_defns_index$.getGlobalValue() );
      }
      return defns_cache_remove_value_from_hash( col, defn_assertion, $suf_defns_index$.getGlobalValue() );
    }
    else if( type.eql( $kw90$QSUF ) )
    {
      if( NIL != addP )
      {
        return defns_cache_push_hash( col, defn_assertion, $quoted_suf_defns_index$.getGlobalValue() );
      }
      return defns_cache_remove_value_from_hash( col, defn_assertion, $quoted_suf_defns_index$.getGlobalValue() );
    }
    else if( type.eql( $kw84$NEC ) )
    {
      if( NIL != addP )
      {
        return defns_cache_push_hash( col, defn_assertion, $nec_defns_index$.getGlobalValue() );
      }
      return defns_cache_remove_value_from_hash( col, defn_assertion, $nec_defns_index$.getGlobalValue() );
    }
    else
    {
      if( !type.eql( $kw93$QNEC ) )
      {
        return NIL;
      }
      if( NIL != addP )
      {
        return defns_cache_push_hash( col, defn_assertion, $quoted_nec_defns_index$.getGlobalValue() );
      }
      return defns_cache_remove_value_from_hash( col, defn_assertion, $quoted_nec_defns_index$.getGlobalValue() );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49675L)
  public static SubLObject defns_cache_unbuiltP()
  {
    return makeBoolean( NIL == defns_cache_hash_table_p( $has_suf_defn_cache_index$.getGlobalValue() ) || NIL != defns_cache_hash_table_empty_p( $has_suf_defn_cache_index$.getGlobalValue() )
        || NIL == defns_cache_hash_table_p( $iff_defns_index$.getGlobalValue() ) || NIL != defns_cache_hash_table_empty_p( $iff_defns_index$.getGlobalValue() ) || NIL == defns_cache_hash_table_p( $suf_defns_index$
            .getGlobalValue() ) || NIL != defns_cache_hash_table_empty_p( $suf_defns_index$.getGlobalValue() ) || NIL == defns_cache_hash_table_p( $nec_defns_index$.getGlobalValue() )
        || NIL != defns_cache_hash_table_empty_p( $nec_defns_index$.getGlobalValue() ) || NIL == defns_cache_hash_table_p( $has_quoted_suf_defn_cache_index$.getGlobalValue() ) || NIL != defns_cache_hash_table_empty_p(
            $has_quoted_suf_defn_cache_index$.getGlobalValue() ) || NIL == defns_cache_hash_table_p( $quoted_iff_defns_index$.getGlobalValue() ) || NIL != defns_cache_hash_table_empty_p( $quoted_iff_defns_index$
                .getGlobalValue() ) || NIL == defns_cache_hash_table_p( $quoted_suf_defns_index$.getGlobalValue() ) || NIL == defns_cache_hash_table_p( $quoted_nec_defns_index$.getGlobalValue() )
        || NIL == defns_cache_hash_table_p( $suf_defn_cache_index$.getGlobalValue() ) || NIL != defns_cache_hash_table_empty_p( $suf_defn_cache_index$.getGlobalValue() ) || NIL == defns_cache_hash_table_p(
            $suf_quoted_defn_cache_index$.getGlobalValue() ) || NIL != defns_cache_hash_table_empty_p( $suf_quoted_defn_cache_index$.getGlobalValue() ) || NIL == defns_cache_hash_table_p( $suf_function_cache_index$
                .getGlobalValue() ) || NIL != defns_cache_hash_table_empty_p( $suf_function_cache_index$.getGlobalValue() ) || NIL == defns_cache_hash_table_p( $suf_quoted_function_cache_index$.getGlobalValue() )
        || NIL != defns_cache_hash_table_empty_p( $suf_quoted_function_cache_index$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51332L)
  public static SubLObject clear_defns_cache()
  {
    clear_defns();
    at_defns.clear_suf_defns();
    at_defns.clear_suf_quoted_defns();
    at_defns.clear_suf_functions();
    at_defns.clear_suf_quoted_functions();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51535L)
  public static SubLObject rebuild_defns_cache()
  {
    clear_defns_cache();
    initialize_defns();
    at_defns.initialize_sufficient_defns_cache();
    at_defns.initialize_sufficient_quoted_defns_cache();
    at_defns.initialize_sufficient_functions_cache();
    at_defns.initialize_sufficient_quoted_functions_cache();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51839L)
  public static SubLObject dump_defns_cache_to_stream(final SubLObject stream)
  {
    cfasl.cfasl_output( get_defn_cache_from_index( $has_suf_defn_cache_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $iff_defns_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $suf_defns_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $nec_defns_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $has_quoted_suf_defn_cache_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $quoted_iff_defns_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $quoted_suf_defns_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $quoted_nec_defns_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $suf_defn_cache_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $suf_quoted_defn_cache_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $suf_function_cache_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( get_defn_cache_from_index( $suf_quoted_function_cache_index$.getGlobalValue() ), stream );
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( NIL, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53006L)
  public static SubLObject load_defns_cache_from_stream(final SubLObject stream)
  {
    SubLObject dummy = NIL;
    Vectors.set_aref( get_index_to_defns_cache_vector(), $has_suf_defn_cache_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $iff_defns_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $suf_defns_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $nec_defns_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $has_quoted_suf_defn_cache_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $quoted_iff_defns_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $quoted_suf_defns_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $quoted_nec_defns_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $suf_defn_cache_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $suf_quoted_defn_cache_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $suf_function_cache_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    Vectors.set_aref( get_index_to_defns_cache_vector(), $suf_quoted_function_cache_index$.getGlobalValue(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  public static SubLObject declare_defns_file()
  {
    SubLFiles.declareFunction( me, "get_index_to_defns_cache_vector", "GET-INDEX-TO-DEFNS-CACHE-VECTOR", 0, 0, false );
    SubLFiles.declareFunction( me, "get_defn_cache_from_index", "GET-DEFN-CACHE-FROM-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_index_p", "DEFNS-CACHE-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_make_hash_table", "DEFNS-CACHE-MAKE-HASH-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_definedP", "DEFNS-CACHE-DEFINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_hash_table_p", "DEFNS-CACHE-HASH-TABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_hash_table_empty_p", "DEFNS-CACHE-HASH-TABLE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_clrhash", "DEFNS-CACHE-CLRHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_gethash", "DEFNS-CACHE-GETHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_sethash", "DEFNS-CACHE-SETHASH", 3, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_remhash", "DEFNS-CACHE-REMHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_remove_value_from_hash", "DEFNS-CACHE-REMOVE-VALUE-FROM-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_push_hash", "DEFNS-CACHE-PUSH-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_gethash_without_values", "DEFNS-CACHE-GETHASH-WITHOUT-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_hash_table_to_alist", "DEFNS-CACHE-HASH-TABLE-TO-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_hash_table_count", "DEFNS-CACHE-HASH-TABLE-COUNT", 1, 0, false );
    SubLFiles.declareMacro( me, "do_defns_cache_hash", "DO-DEFNS-CACHE-HASH" );
    SubLFiles.declareMacro( me, "progress_do_defns_cache_hash", "PROGRESS-DO-DEFNS-CACHE-HASH" );
    SubLFiles.declareFunction( me, "suf_defn_count", "SUF-DEFN-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "has_suf_defn_somewhereP", "HAS-SUF-DEFN-SOMEWHERE?", 2, 0, false );
    SubLFiles.declareFunction( me, "set_suf_defn_count", "SET-SUF-DEFN-COUNT", 3, 0, false );
    SubLFiles.declareFunction( me, "rem_suf_defn_count", "REM-SUF-DEFN-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "iff_defn", "IFF-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_iff_defn", "REM-IFF-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "suf_defns", "SUF-DEFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_suf_defn", "REM-SUF-DEFN", 3, 0, false );
    SubLFiles.declareFunction( me, "new_suf_defnP", "NEW-SUF-DEFN?", 2, 1, false );
    SubLFiles.declareFunction( me, "nec_defns", "NEC-DEFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_nec_defn", "REM-NEC-DEFN", 3, 0, false );
    SubLFiles.declareFunction( me, "has_some_defnP", "HAS-SOME-DEFN?", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_new_defns_admitP_meters", "RESET-NEW-DEFNS-ADMIT?-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_defns_admitP_metered", "NEW-DEFNS-ADMIT?-METERED", 2, 1, false );
    SubLFiles.declareFunction( me, "new_defns_admitP", "NEW-DEFNS-ADMIT?", 2, 1, false );
    SubLFiles.declareFunction( me, "defns_admitP_int", "DEFNS-ADMIT?-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "reset_new_defns_rejectP_meters", "RESET-NEW-DEFNS-REJECT?-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_defns_rejectP_metered", "NEW-DEFNS-REJECT?-METERED", 2, 1, false );
    SubLFiles.declareFunction( me, "new_defns_rejectP", "NEW-DEFNS-REJECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "defns_rejectP_int", "DEFNS-REJECT?-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "reset_new_quoted_defns_admitP_meters", "RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_quoted_defns_admitP_metered", "NEW-QUOTED-DEFNS-ADMIT?-METERED", 2, 1, false );
    SubLFiles.declareFunction( me, "new_quoted_defns_admitP", "NEW-QUOTED-DEFNS-ADMIT?", 2, 1, false );
    SubLFiles.declareFunction( me, "reset_new_quoted_defns_rejectP_meters", "RESET-NEW-QUOTED-DEFNS-REJECT?-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_quoted_defns_rejectP_metered", "NEW-QUOTED-DEFNS-REJECT?-METERED", 2, 1, false );
    SubLFiles.declareFunction( me, "new_quoted_defns_rejectP", "NEW-QUOTED-DEFNS-REJECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "initial_check_defn_admit_status", "INITIAL-CHECK-DEFN-ADMIT-STATUS", 4, 0, false );
    SubLFiles.declareFunction( me, "final_check_defn_admit_status", "FINAL-CHECK-DEFN-ADMIT-STATUS", 4, 0, false );
    SubLFiles.declareFunction( me, "defns_walk_admitP", "DEFNS-WALK-ADMIT?", 4, 0, false );
    SubLFiles.declareFunction( me, "sufficient_defn_violations", "SUFFICIENT-DEFN-VIOLATIONS", 5, 0, false );
    SubLFiles.declareFunction( me, "sufficient_defn_violation", "SUFFICIENT-DEFN-VIOLATION", 6, 0, false );
    SubLFiles.declareFunction( me, "col_defn_admitsP", "COL-DEFN-ADMITS?", 1, 0, false );
    new $col_defn_admitsP$UnaryFunction();
    SubLFiles.declareFunction( me, "col_quoted_defn_admitsP", "COL-QUOTED-DEFN-ADMITS?", 1, 0, false );
    SubLFiles.declareFunction( me, "col_defn_admitsP_int", "COL-DEFN-ADMITS?-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "defining_defns_admitsP", "DEFINING-DEFNS-ADMITS?", 4, 0, false );
    SubLFiles.declareFunction( me, "defining_defn_violations", "DEFINING-DEFN-VIOLATIONS", 5, 0, false );
    SubLFiles.declareFunction( me, "defining_defn_violation", "DEFINING-DEFN-VIOLATION", 6, 0, false );
    SubLFiles.declareFunction( me, "suf_defn_admitsP", "SUF-DEFN-ADMITS?", 4, 0, false );
    SubLFiles.declareFunction( me, "nec_defn_permitsP", "NEC-DEFN-PERMITS?", 4, 1, false );
    SubLFiles.declareFunction( me, "reset_nec_defn_rejectsP_meters", "RESET-NEC-DEFN-REJECTS?-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "nec_defn_rejectsP_metered", "NEC-DEFN-REJECTS?-METERED", 4, 1, false );
    SubLFiles.declareFunction( me, "nec_defn_rejectsP", "NEC-DEFN-REJECTS?", 4, 1, false );
    SubLFiles.declareFunction( me, "necessary_defn_violations", "NECESSARY-DEFN-VIOLATIONS", 6, 0, false );
    SubLFiles.declareFunction( me, "necessary_defn_violation", "NECESSARY-DEFN-VIOLATION", 7, 0, false );
    SubLFiles.declareFunction( me, "new_mts_of_admitting_defns", "NEW-MTS-OF-ADMITTING-DEFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "mts_of_admitting_quoted_defns", "MTS-OF-ADMITTING-QUOTED-DEFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "new_hl_justify_isa_via_defns", "NEW-HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false );
    SubLFiles.declareFunction( me, "hl_justify_quoted_isa_via_defns", "HL-JUSTIFY-QUOTED-ISA-VIA-DEFNS", 2, 1, false );
    SubLFiles.declareFunction( me, "assertions_of_admitting_defns", "ASSERTIONS-OF-ADMITTING-DEFNS", 5, 0, false );
    SubLFiles.declareFunction( me, "mts_from_defn_assertions", "MTS-FROM-DEFN-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "initial_check_admit_defn", "INITIAL-CHECK-ADMIT-DEFN", 3, 0, false );
    SubLFiles.declareFunction( me, "defns_of_admitting_sufficient_defns", "DEFNS-OF-ADMITTING-SUFFICIENT-DEFNS", 4, 0, false );
    SubLFiles.declareFunction( me, "admitting_defn_assertions", "ADMITTING-DEFN-ASSERTIONS", 1, 0, false );
    new $admitting_defn_assertions$UnaryFunction();
    SubLFiles.declareFunction( me, "admitting_quoted_defn_assertions", "ADMITTING-QUOTED-DEFN-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "admitting_defn_assertion", "ADMITTING-DEFN-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "admitting_quoted_defn_assertion", "ADMITTING-QUOTED-DEFN-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "admitting_defn_assertions_int", "ADMITTING-DEFN-ASSERTIONS-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "suf_admitting_defns", "SUF-ADMITTING-DEFNS", 4, 0, false );
    SubLFiles.declareFunction( me, "min_defn_admits", "MIN-DEFN-ADMITS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_defn_admits", "ALL-DEFN-ADMITS", 1, 1, false );
    SubLFiles.declareFunction( me, "min_quoted_defn_admits", "MIN-QUOTED-DEFN-ADMITS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_quoted_defn_admits", "ALL-QUOTED-DEFN-ADMITS", 1, 1, false );
    SubLFiles.declareFunction( me, "min_generalizations", "MIN-GENERALIZATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "genericize_term_wrt_types", "GENERICIZE-TERM-WRT-TYPES", 1, 1, false );
    SubLFiles.declareFunction( me, "genericize_constraints_wrt_types", "GENERICIZE-CONSTRAINTS-WRT-TYPES", 2, 1, false );
    SubLFiles.declareFunction( me, "genericize_term_types_int", "GENERICIZE-TERM-TYPES-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "update_iff_or_suf_defn", "UPDATE-IFF-OR-SUF-DEFN", 4, 0, false );
    SubLFiles.declareFunction( me, "update_nec_defn", "UPDATE-NEC-DEFN", 3, 0, false );
    SubLFiles.declareFunction( me, "new_add_iff_defn", "NEW-ADD-IFF-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "new_remove_iff_defn", "NEW-REMOVE-IFF-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "new_add_suf_defn", "NEW-ADD-SUF-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "new_remove_suf_defn", "NEW-REMOVE-SUF-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "add_nec_defn", "ADD-NEC-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_nec_defn", "REMOVE-NEC-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "new_add_iff_quoted_defn", "NEW-ADD-IFF-QUOTED-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "new_remove_iff_quoted_defn", "NEW-REMOVE-IFF-QUOTED-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "new_add_suf_quoted_defn", "NEW-ADD-SUF-QUOTED-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "new_remove_suf_quoted_defn", "NEW-REMOVE-SUF-QUOTED-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "add_nec_quoted_defn", "ADD-NEC-QUOTED-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_nec_quoted_defn", "REMOVE-NEC-QUOTED-DEFN", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_added_genl_for_suf_defns_int", "HANDLE-ADDED-GENL-FOR-SUF-DEFNS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "reset_new_handle_added_genl_for_suf_defns_meters", "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_handle_added_genl_for_suf_defns_metered", "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false );
    SubLFiles.declareFunction( me, "new_handle_added_genl_for_suf_defns", "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_new_handle_added_genl_for_suf_quoted_defns_meters", "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_handle_added_genl_for_suf_quoted_defns_metered", "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false );
    SubLFiles.declareFunction( me, "new_handle_added_genl_for_suf_quoted_defns", "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_removed_genl_for_suf_defns_int", "HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "reset_new_handle_removed_genl_for_suf_defns_meters", "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_handle_removed_genl_for_suf_defns_metered", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false );
    SubLFiles.declareFunction( me, "new_handle_removed_genl_for_suf_defns", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_new_handle_removed_genl_for_suf_quoted_defns_meters", "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_handle_removed_genl_for_suf_quoted_defns_metered", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false );
    SubLFiles.declareFunction( me, "new_handle_removed_genl_for_suf_quoted_defns", "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_defns", "CLEAR-DEFNS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_defns_cache", "INITIALIZE-DEFNS-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_defns", "INITIALIZE-DEFNS", 0, 0, false );
    SubLFiles.declareFunction( me, "inc_suf_defn_count", "INC-SUF-DEFN-COUNT", 2, 1, false );
    SubLFiles.declareFunction( me, "dec_suf_defn_count", "DEC-SUF-DEFN-COUNT", 2, 1, false );
    SubLFiles.declareFunction( me, "update_suf_defn_cache", "UPDATE-SUF-DEFN-CACHE", 3, 0, false );
    SubLFiles.declareFunction( me, "update_defns", "UPDATE-DEFNS", 4, 0, false );
    SubLFiles.declareFunction( me, "defns_cache_unbuiltP", "DEFNS-CACHE-UNBUILT?", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_defns_cache", "CLEAR-DEFNS-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "rebuild_defns_cache", "REBUILD-DEFNS-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_defns_cache_to_stream", "DUMP-DEFNS-CACHE-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "load_defns_cache_from_stream", "LOAD-DEFNS-CACHE-FROM-STREAM", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_defns_file()
  {
    $index_to_defns_cache_vector$ = SubLFiles.deflexical( "*INDEX-TO-DEFNS-CACHE-VECTOR*", ( maybeDefault( $sym0$_INDEX_TO_DEFNS_CACHE_VECTOR_, $index_to_defns_cache_vector$, NIL ) ) );
    $has_suf_defn_cache_index$ = SubLFiles.defconstant( "*HAS-SUF-DEFN-CACHE-INDEX*", ZERO_INTEGER );
    $has_quoted_suf_defn_cache_index$ = SubLFiles.defconstant( "*HAS-QUOTED-SUF-DEFN-CACHE-INDEX*", ONE_INTEGER );
    $iff_defns_index$ = SubLFiles.defconstant( "*IFF-DEFNS-INDEX*", TWO_INTEGER );
    $quoted_iff_defns_index$ = SubLFiles.defconstant( "*QUOTED-IFF-DEFNS-INDEX*", THREE_INTEGER );
    $suf_defns_index$ = SubLFiles.defconstant( "*SUF-DEFNS-INDEX*", FOUR_INTEGER );
    $quoted_suf_defns_index$ = SubLFiles.defconstant( "*QUOTED-SUF-DEFNS-INDEX*", FIVE_INTEGER );
    $nec_defns_index$ = SubLFiles.defconstant( "*NEC-DEFNS-INDEX*", SIX_INTEGER );
    $quoted_nec_defns_index$ = SubLFiles.defconstant( "*QUOTED-NEC-DEFNS-INDEX*", SEVEN_INTEGER );
    $suf_defn_cache_index$ = SubLFiles.defconstant( "*SUF-DEFN-CACHE-INDEX*", EIGHT_INTEGER );
    $suf_quoted_defn_cache_index$ = SubLFiles.defconstant( "*SUF-QUOTED-DEFN-CACHE-INDEX*", NINE_INTEGER );
    $suf_function_cache_index$ = SubLFiles.defconstant( "*SUF-FUNCTION-CACHE-INDEX*", TEN_INTEGER );
    $suf_quoted_function_cache_index$ = SubLFiles.defconstant( "*SUF-QUOTED-FUNCTION-CACHE-INDEX*", ELEVEN_INTEGER );
    $defn_term$ = SubLFiles.defvar( "*DEFN-TERM*", NIL );
    $org_collection$ = SubLFiles.defvar( "*ORG-COLLECTION*", NIL );
    $failing_suf_defns$ = SubLFiles.defvar( "*FAILING-SUF-DEFNS*", NIL );
    $new_defns_admitP_meters$ = SubLFiles.defparameter( "*NEW-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $new_defns_rejectP_meters$ = SubLFiles.defparameter( "*NEW-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $new_quoted_defns_admitP_meters$ = SubLFiles.defparameter( "*NEW-QUOTED-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $new_quoted_defns_rejectP_meters$ = SubLFiles.defparameter( "*NEW-QUOTED-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $nec_defn_rejectsP_meters$ = SubLFiles.defparameter( "*NEC-DEFN-REJECTS?-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $min_defn_admits_map$ = SubLFiles.deflexical( "*MIN-DEFN-ADMITS-MAP*", $list70 );
    $min_quoted_defn_admits_map$ = SubLFiles.deflexical( "*MIN-QUOTED-DEFN-ADMITS-MAP*", $list73 );
    $new_handle_added_genl_for_suf_defns_meters$ = SubLFiles.defparameter( "*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $new_handle_added_genl_for_suf_quoted_defns_meters$ = SubLFiles.defparameter( "*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $new_handle_removed_genl_for_suf_defns_meters$ = SubLFiles.defparameter( "*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $new_handle_removed_genl_for_suf_quoted_defns_meters$ = SubLFiles.defparameter( "*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table( EIGHT_INTEGER, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_defns_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_INDEX_TO_DEFNS_CACHE_VECTOR_ );
    SubLObject item_var = $sym12$_NEW_DEFNS_ADMIT__METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_new_defns_admitP_meters();
    Hashtables.sethash( $kw21$RESET, $new_defns_admitP_meters$.getDynamicValue(), $sym22$RESET_NEW_DEFNS_ADMIT__METERS );
    SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    SubLObject v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym20$NEW_DEFNS_ADMIT_ == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $new_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    item_var = $sym25$_NEW_DEFNS_REJECT__METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_new_defns_rejectP_meters();
    Hashtables.sethash( $kw21$RESET, $new_defns_rejectP_meters$.getDynamicValue(), $sym27$RESET_NEW_DEFNS_REJECT__METERS );
    cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym26$NEW_DEFNS_REJECT_ == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $new_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    item_var = $sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_new_quoted_defns_admitP_meters();
    Hashtables.sethash( $kw21$RESET, $new_quoted_defns_admitP_meters$.getDynamicValue(), $sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS );
    cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym29$NEW_QUOTED_DEFNS_ADMIT_ == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $new_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    item_var = $sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_new_quoted_defns_rejectP_meters();
    Hashtables.sethash( $kw21$RESET, $new_quoted_defns_rejectP_meters$.getDynamicValue(), $sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS );
    cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym32$NEW_QUOTED_DEFNS_REJECT_ == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $new_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    item_var = $sym58$_NEC_DEFN_REJECTS__METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_nec_defn_rejectsP_meters();
    Hashtables.sethash( $kw21$RESET, $nec_defn_rejectsP_meters$.getDynamicValue(), $sym61$RESET_NEC_DEFN_REJECTS__METERS );
    cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym60$NEC_DEFN_REJECTS_ == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $nec_defn_rejectsP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    utilities_macros.register_kb_function( $sym79$NEW_ADD_IFF_DEFN );
    utilities_macros.register_kb_function( $sym80$NEW_REMOVE_IFF_DEFN );
    utilities_macros.register_kb_function( $sym82$NEW_ADD_SUF_DEFN );
    utilities_macros.register_kb_function( $sym83$NEW_REMOVE_SUF_DEFN );
    utilities_macros.register_kb_function( $sym85$ADD_NEC_DEFN );
    utilities_macros.register_kb_function( $sym86$REMOVE_NEC_DEFN );
    utilities_macros.register_kb_function( $sym88$NEW_ADD_IFF_QUOTED_DEFN );
    utilities_macros.register_kb_function( $sym89$NEW_REMOVE_IFF_QUOTED_DEFN );
    utilities_macros.register_kb_function( $sym91$NEW_ADD_SUF_QUOTED_DEFN );
    utilities_macros.register_kb_function( $sym92$NEW_REMOVE_SUF_QUOTED_DEFN );
    utilities_macros.register_kb_function( $sym94$ADD_NEC_QUOTED_DEFN );
    utilities_macros.register_kb_function( $sym95$REMOVE_NEC_QUOTED_DEFN );
    item_var = $sym97$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_new_handle_added_genl_for_suf_defns_meters();
    Hashtables.sethash( $kw21$RESET, $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), $sym100$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS );
    cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym99$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $new_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    item_var = $sym101$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_new_handle_added_genl_for_suf_quoted_defns_meters();
    Hashtables.sethash( $kw21$RESET, $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), $sym103$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS );
    cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym102$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $new_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    item_var = $sym104$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_new_handle_removed_genl_for_suf_defns_meters();
    Hashtables.sethash( $kw21$RESET, $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), $sym106$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS );
    cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym105$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $new_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    item_var = $sym107$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$defn_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$defn_state_variables$.getGlobalValue() ) );
    }
    reset_new_handle_removed_genl_for_suf_quoted_defns_meters();
    Hashtables.sethash( $kw21$RESET, $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), $sym109$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS );
    cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
    v_cache = NIL;
    v_cache = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $sym108$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash( $kw19$FUNCTION, v_cache, UNPROVIDED ) )
      {
        at_vars.$defn_meter_caches$.setDynamicValue( Sequences.delete( v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Hashtables.clrhash( v_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_cache = cdolist_list_var.first();
    }
    at_vars.$defn_meter_caches$.setDynamicValue( ConsesLow.cons( $new_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue() ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_defns_file();
  }

  @Override
  public void initializeVariables()
  {
    init_defns_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_defns_file();
  }
  static
  {
    me = new defns();
    $index_to_defns_cache_vector$ = null;
    $has_suf_defn_cache_index$ = null;
    $has_quoted_suf_defn_cache_index$ = null;
    $iff_defns_index$ = null;
    $quoted_iff_defns_index$ = null;
    $suf_defns_index$ = null;
    $quoted_suf_defns_index$ = null;
    $nec_defns_index$ = null;
    $quoted_nec_defns_index$ = null;
    $suf_defn_cache_index$ = null;
    $suf_quoted_defn_cache_index$ = null;
    $suf_function_cache_index$ = null;
    $suf_quoted_function_cache_index$ = null;
    $defn_term$ = null;
    $org_collection$ = null;
    $failing_suf_defns$ = null;
    $new_defns_admitP_meters$ = null;
    $new_defns_rejectP_meters$ = null;
    $new_quoted_defns_admitP_meters$ = null;
    $new_quoted_defns_rejectP_meters$ = null;
    $nec_defn_rejectsP_meters$ = null;
    $min_defn_admits_map$ = null;
    $min_quoted_defn_admits_map$ = null;
    $new_handle_added_genl_for_suf_defns_meters$ = null;
    $new_handle_added_genl_for_suf_quoted_defns_meters$ = null;
    $new_handle_removed_genl_for_suf_defns_meters$ = null;
    $new_handle_removed_genl_for_suf_quoted_defns_meters$ = null;
    $sym0$_INDEX_TO_DEFNS_CACHE_VECTOR_ = makeSymbol( "*INDEX-TO-DEFNS-CACHE-VECTOR*" );
    $int1$256 = makeInteger( 256 );
    $int2$200 = makeInteger( 200 );
    $int3$64 = makeInteger( 64 );
    $sym4$DEFNS_CACHE_INDEX_P = makeSymbol( "DEFNS-CACHE-INDEX-P" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VAL" ), makeSymbol( "DEFN-CACHE-INDEX" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list6 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw7$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw8$DONE = makeKeyword( "DONE" );
    $sym9$CDOHASH = makeSymbol( "CDOHASH" );
    $sym10$GET_DEFN_CACHE_FROM_INDEX = makeSymbol( "GET-DEFN-CACHE-FROM-INDEX" );
    $sym11$PROGRESS_CDOHASH = makeSymbol( "PROGRESS-CDOHASH" );
    $sym12$_NEW_DEFNS_ADMIT__METERS_ = makeSymbol( "*NEW-DEFNS-ADMIT?-METERS*" );
    $kw13$CALLS = makeKeyword( "CALLS" );
    $kw14$TIMES = makeKeyword( "TIMES" );
    $kw15$RESULTS = makeKeyword( "RESULTS" );
    $kw16$ARGS = makeKeyword( "ARGS" );
    $kw17$ARG_LIST = makeKeyword( "ARG-LIST" );
    $list18 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "TERM" ), makeSymbol( "MT" ) );
    $kw19$FUNCTION = makeKeyword( "FUNCTION" );
    $sym20$NEW_DEFNS_ADMIT_ = makeSymbol( "NEW-DEFNS-ADMIT?" );
    $kw21$RESET = makeKeyword( "RESET" );
    $sym22$RESET_NEW_DEFNS_ADMIT__METERS = makeSymbol( "RESET-NEW-DEFNS-ADMIT?-METERS" );
    $kw23$ADMITTED = makeKeyword( "ADMITTED" );
    $kw24$REJECTED = makeKeyword( "REJECTED" );
    $sym25$_NEW_DEFNS_REJECT__METERS_ = makeSymbol( "*NEW-DEFNS-REJECT?-METERS*" );
    $sym26$NEW_DEFNS_REJECT_ = makeSymbol( "NEW-DEFNS-REJECT?" );
    $sym27$RESET_NEW_DEFNS_REJECT__METERS = makeSymbol( "RESET-NEW-DEFNS-REJECT?-METERS" );
    $sym28$_NEW_QUOTED_DEFNS_ADMIT__METERS_ = makeSymbol( "*NEW-QUOTED-DEFNS-ADMIT?-METERS*" );
    $sym29$NEW_QUOTED_DEFNS_ADMIT_ = makeSymbol( "NEW-QUOTED-DEFNS-ADMIT?" );
    $sym30$RESET_NEW_QUOTED_DEFNS_ADMIT__METERS = makeSymbol( "RESET-NEW-QUOTED-DEFNS-ADMIT?-METERS" );
    $sym31$_NEW_QUOTED_DEFNS_REJECT__METERS_ = makeSymbol( "*NEW-QUOTED-DEFNS-REJECT?-METERS*" );
    $sym32$NEW_QUOTED_DEFNS_REJECT_ = makeSymbol( "NEW-QUOTED-DEFNS-REJECT?" );
    $sym33$RESET_NEW_QUOTED_DEFNS_REJECT__METERS = makeSymbol( "RESET-NEW-QUOTED-DEFNS-REJECT?-METERS" );
    $kw34$BREADTH = makeKeyword( "BREADTH" );
    $kw35$QUEUE = makeKeyword( "QUEUE" );
    $kw36$STACK = makeKeyword( "STACK" );
    $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw38$ERROR = makeKeyword( "ERROR" );
    $str39$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym40$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw41$CERROR = makeKeyword( "CERROR" );
    $str42$continue_anyway = makeString( "continue anyway" );
    $kw43$WARN = makeKeyword( "WARN" );
    $str44$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const45$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $str46$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str47$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str48$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw49$DISJOINT = makeKeyword( "DISJOINT" );
    $sym50$COL_QUOTED_DEFN_ADMITS_ = makeSymbol( "COL-QUOTED-DEFN-ADMITS?" );
    $sym51$COL_DEFN_ADMITS_ = makeSymbol( "COL-DEFN-ADMITS?" );
    $list52 = ConsesLow.list( makeSymbol( "CONSTRAINT-RELN" ), makeSymbol( "VIA" ), makeSymbol( "CONSTRAINT-GAF" ) );
    $kw53$AT_CONSTRAINT_GAF = makeKeyword( "AT-CONSTRAINT-GAF" );
    $kw54$MAL_ARG_WRT_QUOTED_SUF_DEFNS = makeKeyword( "MAL-ARG-WRT-QUOTED-SUF-DEFNS" );
    $kw55$MAL_ARG_WRT_SUF_DEFNS = makeKeyword( "MAL-ARG-WRT-SUF-DEFNS" );
    $kw56$MAL_ARG_WRT_QUOTED_IFF_DEFN = makeKeyword( "MAL-ARG-WRT-QUOTED-IFF-DEFN" );
    $kw57$MAL_ARG_WRT_IFF_DEFN = makeKeyword( "MAL-ARG-WRT-IFF-DEFN" );
    $sym58$_NEC_DEFN_REJECTS__METERS_ = makeSymbol( "*NEC-DEFN-REJECTS?-METERS*" );
    $list59 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "TERM" ), makeSymbol( "MT" ), makeSymbol( "QUOTED?" ), makeSymbol( "CONSIDER-IFF-AS-NEC?" ) );
    $sym60$NEC_DEFN_REJECTS_ = makeSymbol( "NEC-DEFN-REJECTS?" );
    $sym61$RESET_NEC_DEFN_REJECTS__METERS = makeSymbol( "RESET-NEC-DEFN-REJECTS?-METERS" );
    $kw62$MAL_ARG_WRT_QUOTED_NEC_DEFN = makeKeyword( "MAL-ARG-WRT-QUOTED-NEC-DEFN" );
    $kw63$MAL_ARG_WRT_NEC_DEFN = makeKeyword( "MAL-ARG-WRT-NEC-DEFN" );
    $const64$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw65$GENLS = makeKeyword( "GENLS" );
    $sym66$ADMITTING_QUOTED_DEFN_ASSERTION = makeSymbol( "ADMITTING-QUOTED-DEFN-ASSERTION" );
    $sym67$ADMITTING_DEFN_ASSERTION = makeSymbol( "ADMITTING-DEFN-ASSERTION" );
    $sym68$ADMITTING_QUOTED_DEFN_ASSERTIONS = makeSymbol( "ADMITTING-QUOTED-DEFN-ASSERTIONS" );
    $sym69$ADMITTING_DEFN_ASSERTIONS = makeSymbol( "ADMITTING-DEFN-ASSERTIONS" );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRINGP" ), constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) ) ), ConsesLow.list( makeSymbol( "POSITIVE-INTEGER-P" ),
        constant_handles.reader_make_constant_shell( makeString( "PositiveInteger" ) ) ), ConsesLow.list( makeSymbol( "NON-NEGATIVE-INTEGER-P" ), constant_handles.reader_make_constant_shell( makeString(
            "NonNegativeInteger" ) ) ), ConsesLow.list( makeSymbol( "INTEGERP" ), constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) ), ConsesLow.list( makeSymbol( "FLOATP" ), constant_handles
                .reader_make_constant_shell( makeString( "RealNumber" ) ) ), ConsesLow.list( makeSymbol( "TRUE" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) );
    $list71 = ConsesLow.list( makeSymbol( "DEFN" ), makeSymbol( "COLLECTION" ) );
    $kw72$ASCENDING = makeKeyword( "ASCENDING" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRINGP" ), constant_handles.reader_make_constant_shell( makeString( "SubLString" ) ) ), ConsesLow.list( makeSymbol( "INTEGERP" ), constant_handles
        .reader_make_constant_shell( makeString( "SubLInteger" ) ) ), ConsesLow.list( makeSymbol( "FLOATP" ), constant_handles.reader_make_constant_shell( makeString( "SubLRealNumber" ) ) ), ConsesLow.list( makeSymbol(
            "SYMBOLP" ), constant_handles.reader_make_constant_shell( makeString( "SubLSymbol" ) ) ), ConsesLow.list( makeSymbol( "CONSTANT-P" ), constant_handles.reader_make_constant_shell( makeString(
                "CycLConstant" ) ) ), ConsesLow.list( makeSymbol( "NART-P" ), constant_handles.reader_make_constant_shell( makeString( "CycLNonAtomicReifiedTerm" ) ) ), ConsesLow.list( makeSymbol( "ASSERTION-P" ),
                    constant_handles.reader_make_constant_shell( makeString( "CycLAssertion" ) ) ), ConsesLow.list( makeSymbol( "TRUE" ), constant_handles.reader_make_constant_shell( makeString( "CycLExpression" ) ) ) );
    $list74 = ConsesLow.list( makeSymbol( "QUOTED-DEFN" ), makeSymbol( "COLLECTION" ) );
    $const75$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $const76$CollectionIntersectionFn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersectionFn" ) );
    $const77$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $kw78$IFF = makeKeyword( "IFF" );
    $sym79$NEW_ADD_IFF_DEFN = makeSymbol( "NEW-ADD-IFF-DEFN" );
    $sym80$NEW_REMOVE_IFF_DEFN = makeSymbol( "NEW-REMOVE-IFF-DEFN" );
    $kw81$SUF = makeKeyword( "SUF" );
    $sym82$NEW_ADD_SUF_DEFN = makeSymbol( "NEW-ADD-SUF-DEFN" );
    $sym83$NEW_REMOVE_SUF_DEFN = makeSymbol( "NEW-REMOVE-SUF-DEFN" );
    $kw84$NEC = makeKeyword( "NEC" );
    $sym85$ADD_NEC_DEFN = makeSymbol( "ADD-NEC-DEFN" );
    $sym86$REMOVE_NEC_DEFN = makeSymbol( "REMOVE-NEC-DEFN" );
    $kw87$QIFF = makeKeyword( "QIFF" );
    $sym88$NEW_ADD_IFF_QUOTED_DEFN = makeSymbol( "NEW-ADD-IFF-QUOTED-DEFN" );
    $sym89$NEW_REMOVE_IFF_QUOTED_DEFN = makeSymbol( "NEW-REMOVE-IFF-QUOTED-DEFN" );
    $kw90$QSUF = makeKeyword( "QSUF" );
    $sym91$NEW_ADD_SUF_QUOTED_DEFN = makeSymbol( "NEW-ADD-SUF-QUOTED-DEFN" );
    $sym92$NEW_REMOVE_SUF_QUOTED_DEFN = makeSymbol( "NEW-REMOVE-SUF-QUOTED-DEFN" );
    $kw93$QNEC = makeKeyword( "QNEC" );
    $sym94$ADD_NEC_QUOTED_DEFN = makeSymbol( "ADD-NEC-QUOTED-DEFN" );
    $sym95$REMOVE_NEC_QUOTED_DEFN = makeSymbol( "REMOVE-NEC-QUOTED-DEFN" );
    $sym96$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $sym97$_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_ = makeSymbol( "*NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*" );
    $list98 = ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "GENL" ) );
    $sym99$NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS = makeSymbol( "NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS" );
    $sym100$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol( "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS" );
    $sym101$_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = makeSymbol( "*NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*" );
    $sym102$NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol( "NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS" );
    $sym103$RESET_NEW_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol( "RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS" );
    $sym104$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_ = makeSymbol( "*NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*" );
    $sym105$NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS = makeSymbol( "NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS" );
    $sym106$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol( "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS" );
    $sym107$_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = makeSymbol( "*NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*" );
    $sym108$NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol( "NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS" );
    $sym109$RESET_NEW_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol( "RESET-NEW-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS" );
    $int110$400 = makeInteger( 400 );
    $int111$100 = makeInteger( 100 );
    $str112$Initializing_defns___ = makeString( "Initializing .." );
    $const113$defnIff = constant_handles.reader_make_constant_shell( makeString( "defnIff" ) );
    $kw114$GAF = makeKeyword( "GAF" );
    $kw115$TRUE = makeKeyword( "TRUE" );
    $const116$defnSufficient = constant_handles.reader_make_constant_shell( makeString( "defnSufficient" ) );
    $const117$defnNecessary = constant_handles.reader_make_constant_shell( makeString( "defnNecessary" ) );
    $const118$quotedDefnIff = constant_handles.reader_make_constant_shell( makeString( "quotedDefnIff" ) );
    $const119$quotedDefnSufficient = constant_handles.reader_make_constant_shell( makeString( "quotedDefnSufficient" ) );
    $const120$quotedDefnNecessary = constant_handles.reader_make_constant_shell( makeString( "quotedDefnNecessary" ) );
  }

  public static final class $col_defn_admitsP$UnaryFunction
      extends
        UnaryFunction
  {
    public $col_defn_admitsP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "COL-DEFN-ADMITS?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return col_defn_admitsP( arg1 );
    }
  }

  public static final class $admitting_defn_assertions$UnaryFunction
      extends
        UnaryFunction
  {
    public $admitting_defn_assertions$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ADMITTING-DEFN-ASSERTIONS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return admitting_defn_assertions( arg1 );
    }
  }
}
/*
 * 
 * Total time: 3406 ms
 * 
 */