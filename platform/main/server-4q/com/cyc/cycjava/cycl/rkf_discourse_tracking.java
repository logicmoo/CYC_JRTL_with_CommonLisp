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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_discourse_tracking
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_discourse_tracking";
  public static final String myFingerPrint = "fd5af7eed034a86f808e1f9b5466f08c23b89ca9e5459345b6e0624b8205c7d3";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1767L)
  public static SubLSymbol $rkf_discourse_context$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLSymbol $dtp_rkf_discourse_context$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLSymbol $dtp_rkf_discourse_mapping$;
  private static final SubLObject $const0$TheResultOfParsing;
  private static final SubLSymbol $sym1$RKF_DISC_DISCOURSE_ENTITY_;
  private static final SubLSymbol $sym2$RKF_DISCOURSE_CONTEXT;
  private static final SubLSymbol $sym3$RKF_DISCOURSE_CONTEXT_P;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym9$RKF_DISCOURSE_CONTEXT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$RKF_DC_EXPLICIT_MAPPINGS;
  private static final SubLSymbol $sym12$_CSETF_RKF_DC_EXPLICIT_MAPPINGS;
  private static final SubLSymbol $sym13$RKF_DC_DISCOURSE_MT;
  private static final SubLSymbol $sym14$_CSETF_RKF_DC_DISCOURSE_MT;
  private static final SubLSymbol $sym15$RKF_DC_PARENT_CONTEXT;
  private static final SubLSymbol $sym16$_CSETF_RKF_DC_PARENT_CONTEXT;
  private static final SubLSymbol $sym17$RKF_DC_PHRASE_INDEX;
  private static final SubLSymbol $sym18$_CSETF_RKF_DC_PHRASE_INDEX;
  private static final SubLSymbol $sym19$RKF_DC_INDEXICAL_INDEX;
  private static final SubLSymbol $sym20$_CSETF_RKF_DC_INDEXICAL_INDEX;
  private static final SubLSymbol $kw21$EXPLICIT_MAPPINGS;
  private static final SubLSymbol $kw22$DISCOURSE_MT;
  private static final SubLSymbol $kw23$PARENT_CONTEXT;
  private static final SubLSymbol $kw24$PHRASE_INDEX;
  private static final SubLSymbol $kw25$INDEXICAL_INDEX;
  private static final SubLString $str26$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw27$BEGIN;
  private static final SubLSymbol $sym28$MAKE_RKF_DISCOURSE_CONTEXT;
  private static final SubLSymbol $kw29$SLOT;
  private static final SubLSymbol $kw30$END;
  private static final SubLSymbol $sym31$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_CONTEXT_METHOD;
  private static final SubLSymbol $sym32$RKF_DISCOURSE_MAPPING;
  private static final SubLSymbol $sym33$RKF_DISCOURSE_MAPPING_P;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$RKF_DISCOURSE_MAPPING_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$RKF_DM_INTERPRETATION;
  private static final SubLSymbol $sym41$_CSETF_RKF_DM_INTERPRETATION;
  private static final SubLSymbol $sym42$RKF_DM_INDEXICALS;
  private static final SubLSymbol $sym43$_CSETF_RKF_DM_INDEXICALS;
  private static final SubLSymbol $sym44$RKF_DM_PHRASES;
  private static final SubLSymbol $sym45$_CSETF_RKF_DM_PHRASES;
  private static final SubLSymbol $kw46$INTERPRETATION;
  private static final SubLSymbol $kw47$INDEXICALS;
  private static final SubLSymbol $kw48$PHRASES;
  private static final SubLSymbol $sym49$MAKE_RKF_DISCOURSE_MAPPING;
  private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_MAPPING_METHOD;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $sym54$NEW_RKF_DISCOURSE_MAPPING;
  private static final SubLString $str55$mapping_indexicals___S__;
  private static final SubLObject $const56$CourseOfAction;
  private static final SubLSymbol $sym57$_X;
  private static final SubLObject $const58$coaDescribingSpecification;
  private static final SubLList $list59;
  private static final SubLObject $const60$implies;
  private static final SubLObject $const61$TheSalientInstance;
  private static final SubLObject $const62$SomeFn;
  private static final SubLObject $const63$isa;
  private static final SubLString $str64$_S_is_not_a_valid_indexical;
  private static final SubLObject $const65$genls;
  private static final SubLObject $const66$and;
  private static final SubLObject $const67$TheSalientFn;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 806L)
  public static SubLObject rkf_disc_resolve_sentence_entities(final SubLObject sentence, final SubLObject v_context)
  {
    final SubLObject entities = rkf_disc_find_discourse_entities( sentence );
    SubLObject in_queue = ConsesLow.list( sentence );
    SubLObject out_queue = NIL;
    SubLObject cdolist_list_var = entities;
    SubLObject entity = NIL;
    entity = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject resolutions = rkf_disc_resolve_entity( entity, sentence, v_context );
      SubLObject cdolist_list_var_$1 = in_queue;
      SubLObject sentence_$2 = NIL;
      sentence_$2 = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        SubLObject cdolist_list_var_$2 = resolutions;
        SubLObject resolution = NIL;
        resolution = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          out_queue = ConsesLow.cons( cycl_utilities.expression_subst( resolution, entity, sentence_$2, EQUAL, UNPROVIDED ), out_queue );
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          resolution = cdolist_list_var_$2.first();
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        sentence_$2 = cdolist_list_var_$1.first();
      }
      in_queue = out_queue;
      out_queue = NIL;
      cdolist_list_var = cdolist_list_var.rest();
      entity = cdolist_list_var.first();
    }
    return in_queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1320L)
  public static SubLObject rkf_disc_resolve_entity(final SubLObject entity, final SubLObject sentence, final SubLObject v_context)
  {
    if( ( NIL != narts_high.naut_p( entity ) && cycl_utilities.formula_arg0( entity ).eql( $const0$TheResultOfParsing ) ) || entity.isString() )
    {
      return rkf_disc_resolve_phrase( v_context, entity );
    }
    return rkf_disc_resolve_indexical( v_context, entity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1640L)
  public static SubLObject rkf_disc_find_discourse_entities(final SubLObject sentence)
  {
    return cycl_utilities.expression_gather( sentence, $sym1$RKF_DISC_DISCOURSE_ENTITY_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject rkf_discourse_context_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject rkf_discourse_context_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rkf_discourse_context_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject rkf_dc_explicit_mappings(final SubLObject v_object)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject rkf_dc_discourse_mt(final SubLObject v_object)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject rkf_dc_parent_context(final SubLObject v_object)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject rkf_dc_phrase_index(final SubLObject v_object)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject rkf_dc_indexical_index(final SubLObject v_object)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject _csetf_rkf_dc_explicit_mappings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject _csetf_rkf_dc_discourse_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject _csetf_rkf_dc_parent_context(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject _csetf_rkf_dc_phrase_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject _csetf_rkf_dc_indexical_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_discourse_context_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject make_rkf_discourse_context(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rkf_discourse_context_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw21$EXPLICIT_MAPPINGS ) )
      {
        _csetf_rkf_dc_explicit_mappings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$DISCOURSE_MT ) )
      {
        _csetf_rkf_dc_discourse_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$PARENT_CONTEXT ) )
      {
        _csetf_rkf_dc_parent_context( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$PHRASE_INDEX ) )
      {
        _csetf_rkf_dc_phrase_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$INDEXICAL_INDEX ) )
      {
        _csetf_rkf_dc_indexical_index( v_new, current_value );
      }
      else
      {
        Errors.error( $str26$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject visit_defstruct_rkf_discourse_context(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw27$BEGIN, $sym28$MAKE_RKF_DISCOURSE_CONTEXT, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw29$SLOT, $kw21$EXPLICIT_MAPPINGS, rkf_dc_explicit_mappings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$SLOT, $kw22$DISCOURSE_MT, rkf_dc_discourse_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$SLOT, $kw23$PARENT_CONTEXT, rkf_dc_parent_context( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$SLOT, $kw24$PHRASE_INDEX, rkf_dc_phrase_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$SLOT, $kw25$INDEXICAL_INDEX, rkf_dc_indexical_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$END, $sym28$MAKE_RKF_DISCOURSE_CONTEXT, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
  public static SubLObject visit_defstruct_object_rkf_discourse_context_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rkf_discourse_context( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2142L)
  public static SubLObject new_rkf_discourse_context(final SubLObject mt)
  {
    final SubLObject obj = make_rkf_discourse_context( UNPROVIDED );
    _csetf_rkf_dc_discourse_mt( obj, mt );
    _csetf_rkf_dc_parent_context( obj, NIL );
    _csetf_rkf_dc_explicit_mappings( obj, dictionary.new_dictionary( EQUAL, UNPROVIDED ) );
    _csetf_rkf_dc_phrase_index( obj, dictionary.new_dictionary( EQUAL, UNPROVIDED ) );
    _csetf_rkf_dc_indexical_index( obj, dictionary.new_dictionary( EQUAL, UNPROVIDED ) );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2529L)
  public static SubLObject rkf_dc_link_parent_child_discourse(final SubLObject parent_disc, final SubLObject child_disc)
  {
    _csetf_rkf_dc_parent_context( child_disc, parent_disc );
    return parent_disc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2685L)
  public static SubLObject rkf_dc_unlink_parent_child_discourse(final SubLObject parent_disc, final SubLObject child_disc)
  {
    _csetf_rkf_dc_parent_context( child_disc, NIL );
    return parent_disc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject rkf_discourse_mapping_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject rkf_discourse_mapping_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rkf_discourse_mapping_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject rkf_dm_interpretation(final SubLObject v_object)
  {
    assert NIL != rkf_discourse_mapping_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject rkf_dm_indexicals(final SubLObject v_object)
  {
    assert NIL != rkf_discourse_mapping_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject rkf_dm_phrases(final SubLObject v_object)
  {
    assert NIL != rkf_discourse_mapping_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject _csetf_rkf_dm_interpretation(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_discourse_mapping_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject _csetf_rkf_dm_indexicals(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_discourse_mapping_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject _csetf_rkf_dm_phrases(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rkf_discourse_mapping_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject make_rkf_discourse_mapping(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rkf_discourse_mapping_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw46$INTERPRETATION ) )
      {
        _csetf_rkf_dm_interpretation( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$INDEXICALS ) )
      {
        _csetf_rkf_dm_indexicals( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$PHRASES ) )
      {
        _csetf_rkf_dm_phrases( v_new, current_value );
      }
      else
      {
        Errors.error( $str26$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject visit_defstruct_rkf_discourse_mapping(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw27$BEGIN, $sym49$MAKE_RKF_DISCOURSE_MAPPING, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw29$SLOT, $kw46$INTERPRETATION, rkf_dm_interpretation( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$SLOT, $kw47$INDEXICALS, rkf_dm_indexicals( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$SLOT, $kw48$PHRASES, rkf_dm_phrases( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$END, $sym49$MAKE_RKF_DISCOURSE_MAPPING, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
  public static SubLObject visit_defstruct_object_rkf_discourse_mapping_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rkf_discourse_mapping( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3069L)
  public static SubLObject new_rkf_discourse_mapping(final SubLObject interp, final SubLObject indexicals, final SubLObject phrases)
  {
    final SubLObject mapping = make_rkf_discourse_mapping( UNPROVIDED );
    _csetf_rkf_dm_interpretation( mapping, interp );
    _csetf_rkf_dm_indexicals( mapping, indexicals );
    _csetf_rkf_dm_phrases( mapping, phrases );
    return mapping;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3358L)
  public static SubLObject create_rkf_discourse_indexicals_mapping(final SubLObject interp, final SubLObject indexicals)
  {
    return new_rkf_discourse_mapping( interp, indexicals, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3493L)
  public static SubLObject create_rkf_discourse_phrases_mapping(final SubLObject interp, final SubLObject phrases)
  {
    return new_rkf_discourse_mapping( interp, NIL, phrases );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3619L)
  public static SubLObject create_rkf_discourse_mapping(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interp = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    interp = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list51 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list51 );
      if( NIL == conses_high.member( current_$4, $list52, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw53$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list51 );
    }
    final SubLObject indexicals_tail = cdestructuring_bind.property_list_member( $kw47$INDEXICALS, current );
    final SubLObject indexicals = ( NIL != indexicals_tail ) ? conses_high.cadr( indexicals_tail ) : NIL;
    final SubLObject phrases_tail = cdestructuring_bind.property_list_member( $kw48$PHRASES, current );
    final SubLObject phrases = ( NIL != phrases_tail ) ? conses_high.cadr( phrases_tail ) : NIL;
    return ConsesLow.list( $sym54$NEW_RKF_DISCOURSE_MAPPING, interp, indexicals, phrases );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3766L)
  public static SubLObject rkf_dc_add_mapping(final SubLObject v_context, final SubLObject mapping)
  {
    final SubLObject mappings = rkf_dc_explicit_mappings( v_context );
    final SubLObject phrase_index = rkf_dc_phrase_index( v_context );
    final SubLObject phrases = rkf_dm_phrases( mapping );
    final SubLObject indexical_index = rkf_dc_indexical_index( v_context );
    final SubLObject indexicals = rkf_dm_indexicals( mapping );
    Errors.warn( $str55$mapping_indexicals___S__, indexicals );
    SubLObject cdolist_list_var = phrases;
    SubLObject phrase = NIL;
    phrase = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_pushnew( phrase_index, phrase, mapping, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      phrase = cdolist_list_var.first();
    }
    cdolist_list_var = indexicals;
    SubLObject indexical = NIL;
    indexical = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_pushnew( indexical_index, indexical, mapping, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      indexical = cdolist_list_var.first();
    }
    return dictionary_utilities.dictionary_pushnew( mappings, rkf_dm_interpretation( mapping ), mapping, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 4562L)
  public static SubLObject rkf_dc_remove_mapping(final SubLObject v_context, final SubLObject mapping)
  {
    final SubLObject mappings = rkf_dc_explicit_mappings( v_context );
    final SubLObject phrase_index = rkf_dc_phrase_index( v_context );
    final SubLObject phrases = rkf_dm_phrases( mapping );
    final SubLObject indexical_index = rkf_dc_indexical_index( v_context );
    SubLObject cdolist_list_var;
    final SubLObject indexicals = cdolist_list_var = rkf_dm_indexicals( mapping );
    SubLObject indexical = NIL;
    indexical = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_remove_from_value( indexical_index, indexical, mapping, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      indexical = cdolist_list_var.first();
    }
    cdolist_list_var = phrases;
    SubLObject phrase = NIL;
    phrase = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_remove_from_value( phrase_index, phrase, mapping, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      phrase = cdolist_list_var.first();
    }
    return dictionary_utilities.dictionary_remove_from_value( mappings, rkf_dm_interpretation( mapping ), mapping, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 5153L)
  public static SubLObject rkf_disc_resolve_phrase_local(final SubLObject v_context, final SubLObject phrase)
  {
    final SubLObject phrase_index = rkf_dc_phrase_index( v_context );
    SubLObject result = NIL;
    result = rkf_disc_interp_for_phrase( phrase_index, phrase );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 5371L)
  public static SubLObject rkf_disc_interp_for_phrase(final SubLObject index, final SubLObject entity)
  {
    final SubLObject phrase = rkf_disc_phrase_from_phrase_entity( entity );
    final SubLObject mappings = dictionary.dictionary_lookup( index, phrase, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = mappings;
    SubLObject mapping = NIL;
    mapping = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = rkf_dm_interpretation( mapping );
      if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mapping = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 5656L)
  public static SubLObject rkf_disc_phrase_from_phrase_entity(final SubLObject entity)
  {
    if( entity.isString() )
    {
      return entity;
    }
    if( NIL != parsing_utilities.result_of_parsing_formulaP( entity ) )
    {
      return parsing_utilities.result_of_parsing_words( entity );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 5861L)
  public static SubLObject rkf_disc_resolve_indexical_local(final SubLObject v_context, final SubLObject indexical)
  {
    SubLObject result = rkf_disc_resolve_indexical_wXlocal_mappings( v_context, indexical );
    if( NIL == result )
    {
      result = rkf_disc_resolve_coa( v_context, indexical );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 6120L)
  public static SubLObject rkf_disc_resolve_coa(final SubLObject v_context, final SubLObject indexical)
  {
    if( NIL != rkf_disc_salient_individual_of_type_formulaP( indexical, $const56$CourseOfAction ) )
    {
      final SubLObject mt = rkf_dc_discourse_mt( v_context );
      SubLObject result = backward.removal_ask_variable( $sym57$_X, ConsesLow.list( $const58$coaDescribingSpecification, $sym57$_X, mt ), mt, UNPROVIDED, UNPROVIDED );
      if( NIL == result )
      {
        result = $list59;
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 6491L)
  public static SubLObject rkf_disc_resolve_indexical_wXlocal_mappings(final SubLObject v_context, final SubLObject indexical)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject index = rkf_dc_indexical_index( v_context );
    final SubLObject mt = rkf_dc_discourse_mt( v_context );
    SubLObject result = NIL;
    dictionary_utilities.print_dictionary_contents( index, UNPROVIDED );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( index ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject known_indexical = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject mappings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject query = rkf_disc_easily_testable_formula( known_indexical, indexical );
      if( NIL == query )
      {
        final SubLObject var = cycl_utilities.formula_arg1( known_indexical, UNPROVIDED );
        final SubLObject antecedent = cycl_utilities.formula_arg2( known_indexical, UNPROVIDED );
        final SubLObject consequent = rkf_disc_consequent_from_indexical( var, indexical );
        query = ConsesLow.list( $const60$implies, antecedent, consequent );
      }
      if( NIL != rkf_query_utilities.rkf_query( query, mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var = mappings;
        SubLObject mapping = NIL;
        mapping = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var = rkf_dm_interpretation( mapping );
          if( NIL == conses_high.member( item_var, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          mapping = cdolist_list_var.first();
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 7405L)
  public static SubLObject rkf_disc_consequent_from_indexical(final SubLObject var, final SubLObject indexical)
  {
    if( cycl_utilities.formula_arg0( indexical ).eql( $const61$TheSalientInstance ) || cycl_utilities.formula_arg0( indexical ).eql( $const62$SomeFn ) )
    {
      return ConsesLow.list( $const63$isa, var, cycl_utilities.formula_arg1( indexical, UNPROVIDED ) );
    }
    return Errors.error( $str64$_S_is_not_a_valid_indexical, indexical );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 7693L)
  public static SubLObject rkf_disc_easily_testable_formula(final SubLObject known_indexical, final SubLObject indexical)
  {
    final SubLObject var = cycl_utilities.formula_arg1( known_indexical, UNPROVIDED );
    final SubLObject indexical_constraint_sentence = cycl_utilities.formula_arg2( known_indexical, UNPROVIDED );
    final SubLObject indexical_constraint_list = indexical_constraint_sentence.rest();
    final SubLObject isa_to_resolve = cycl_utilities.formula_arg1( indexical, UNPROVIDED );
    if( NIL != list_utilities.lengthE( indexical_constraint_list, ONE_INTEGER, UNPROVIDED ) && cycl_utilities.formula_arg0( indexical_constraint_list.first() ).eql( $const63$isa ) )
    {
      return ConsesLow.list( $const65$genls, isa_to_resolve, cycl_utilities.formula_arg2( indexical_constraint_list.first(), UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 8415L)
  public static SubLObject rkf_disc_resolve_phrase(final SubLObject v_context, final SubLObject phrase)
  {
    final SubLObject result = rkf_disc_resolve_phrase_local( v_context, phrase );
    if( NIL != result )
    {
      return result;
    }
    if( NIL != rkf_dc_parent_context( v_context ) )
    {
      return rkf_disc_resolve_phrase( rkf_dc_parent_context( v_context ), phrase );
    }
    return ConsesLow.list( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 8827L)
  public static SubLObject rkf_disc_resolve_indexical(final SubLObject v_context, final SubLObject indexical)
  {
    final SubLObject local_result = rkf_disc_resolve_indexical_local( v_context, indexical );
    if( NIL != local_result )
    {
      return local_result;
    }
    if( NIL != rkf_dc_parent_context( v_context ) )
    {
      return rkf_disc_resolve_indexical( rkf_dc_parent_context( v_context ), indexical );
    }
    return ConsesLow.list( indexical );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9347L)
  public static SubLObject rkf_disc_potentially_resolvable_entityP(final SubLObject entity, final SubLObject v_context)
  {
    if( NIL != parsing_utilities.result_of_parsing_formulaP( entity ) )
    {
      return list_utilities.sublisp_boolean( rkf_disc_resolve_phrase( v_context, entity ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9547L)
  public static SubLObject rkf_disc_salient_individual_of_type_formulaP(final SubLObject formula, final SubLObject type)
  {
    return makeBoolean( NIL != rkf_disc_salient_individual_formulaP( formula ) && cycl_utilities.formula_arg1( formula, UNPROVIDED ).equal( type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9730L)
  public static SubLObject rkf_disc_salient_individual_formulaP(final SubLObject obj)
  {
    return makeBoolean( NIL != rkf_disc_salient_instance_formulaP( obj ) || NIL != rkf_disc_somefn_formulaP( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9882L)
  public static SubLObject rkf_disc_somefn_formulaP(final SubLObject obj)
  {
    return makeBoolean( NIL != narts_high.naut_p( obj ) && cycl_utilities.formula_arg0( obj ).eql( $const62$SomeFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9998L)
  public static SubLObject rkf_disc_salient_instance_formulaP(final SubLObject obj)
  {
    return makeBoolean( NIL != narts_high.naut_p( obj ) && cycl_utilities.formula_arg0( obj ).eql( $const61$TheSalientInstance ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10136L)
  public static SubLObject rkf_disc_discourse_entityP(final SubLObject obj)
  {
    return makeBoolean( NIL != rkf_disc_salient_instance_formulaP( obj ) || NIL != parsing_utilities.result_of_parsing_formulaP( obj ) || ( NIL != narts_high.naut_p( obj ) && $const62$SomeFn.eql( cycl_utilities
        .formula_arg0( obj ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10342L)
  public static SubLObject rkf_disc_implied_indexicals_formulaP(final SubLObject obj)
  {
    return rkf_disc_salient_instance_formulaP( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10457L)
  public static SubLObject rkf_make_discourse_formula_from_constraints(final SubLObject isas, final SubLObject v_genls)
  {
    final SubLObject variable = $sym57$_X;
    SubLObject formula = NIL;
    SubLObject cdolist_list_var = isas;
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      formula = ConsesLow.cons( el_utilities.make_binary_formula( $const63$isa, variable, v_isa ), formula );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    cdolist_list_var = v_genls;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      formula = ConsesLow.cons( el_utilities.make_binary_formula( $const65$genls, variable, genl ), formula );
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    formula = ConsesLow.cons( $const66$and, formula );
    return el_utilities.make_binary_formula( $const67$TheSalientFn, variable, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10841L)
  public static SubLObject rkf_discourse_bundle_ar_concept(final SubLObject obj)
  {
    return obj.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10920L)
  public static SubLObject rkf_discourse_bundle_original(final SubLObject obj)
  {
    return conses_high.second( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10997L)
  public static SubLObject rkf_discourse_bundle_options(final SubLObject obj)
  {
    return conses_high.third( obj );
  }

  public static SubLObject declare_rkf_discourse_tracking_file()
  {
    SubLFiles.declareFunction( me, "rkf_disc_resolve_sentence_entities", "RKF-DISC-RESOLVE-SENTENCE-ENTITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_resolve_entity", "RKF-DISC-RESOLVE-ENTITY", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_find_discourse_entities", "RKF-DISC-FIND-DISCOURSE-ENTITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_discourse_context_print_function_trampoline", "RKF-DISCOURSE-CONTEXT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_discourse_context_p", "RKF-DISCOURSE-CONTEXT-P", 1, 0, false );
    new $rkf_discourse_context_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rkf_dc_explicit_mappings", "RKF-DC-EXPLICIT-MAPPINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_dc_discourse_mt", "RKF-DC-DISCOURSE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_dc_parent_context", "RKF-DC-PARENT-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_dc_phrase_index", "RKF-DC-PHRASE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_dc_indexical_index", "RKF-DC-INDEXICAL-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_dc_explicit_mappings", "_CSETF-RKF-DC-EXPLICIT-MAPPINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_dc_discourse_mt", "_CSETF-RKF-DC-DISCOURSE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_dc_parent_context", "_CSETF-RKF-DC-PARENT-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_dc_phrase_index", "_CSETF-RKF-DC-PHRASE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_dc_indexical_index", "_CSETF-RKF-DC-INDEXICAL-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rkf_discourse_context", "MAKE-RKF-DISCOURSE-CONTEXT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rkf_discourse_context", "VISIT-DEFSTRUCT-RKF-DISCOURSE-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rkf_discourse_context_method", "VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-CONTEXT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_rkf_discourse_context", "NEW-RKF-DISCOURSE-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_dc_link_parent_child_discourse", "RKF-DC-LINK-PARENT-CHILD-DISCOURSE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_dc_unlink_parent_child_discourse", "RKF-DC-UNLINK-PARENT-CHILD-DISCOURSE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_discourse_mapping_print_function_trampoline", "RKF-DISCOURSE-MAPPING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_discourse_mapping_p", "RKF-DISCOURSE-MAPPING-P", 1, 0, false );
    new $rkf_discourse_mapping_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rkf_dm_interpretation", "RKF-DM-INTERPRETATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_dm_indexicals", "RKF-DM-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_dm_phrases", "RKF-DM-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_dm_interpretation", "_CSETF-RKF-DM-INTERPRETATION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_dm_indexicals", "_CSETF-RKF-DM-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rkf_dm_phrases", "_CSETF-RKF-DM-PHRASES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rkf_discourse_mapping", "MAKE-RKF-DISCOURSE-MAPPING", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rkf_discourse_mapping", "VISIT-DEFSTRUCT-RKF-DISCOURSE-MAPPING", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rkf_discourse_mapping_method", "VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-MAPPING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_rkf_discourse_mapping", "NEW-RKF-DISCOURSE-MAPPING", 3, 0, false );
    SubLFiles.declareFunction( me, "create_rkf_discourse_indexicals_mapping", "CREATE-RKF-DISCOURSE-INDEXICALS-MAPPING", 2, 0, false );
    SubLFiles.declareFunction( me, "create_rkf_discourse_phrases_mapping", "CREATE-RKF-DISCOURSE-PHRASES-MAPPING", 2, 0, false );
    SubLFiles.declareMacro( me, "create_rkf_discourse_mapping", "CREATE-RKF-DISCOURSE-MAPPING" );
    SubLFiles.declareFunction( me, "rkf_dc_add_mapping", "RKF-DC-ADD-MAPPING", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_dc_remove_mapping", "RKF-DC-REMOVE-MAPPING", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_resolve_phrase_local", "RKF-DISC-RESOLVE-PHRASE-LOCAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_interp_for_phrase", "RKF-DISC-INTERP-FOR-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_phrase_from_phrase_entity", "RKF-DISC-PHRASE-FROM-PHRASE-ENTITY", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_resolve_indexical_local", "RKF-DISC-RESOLVE-INDEXICAL-LOCAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_resolve_coa", "RKF-DISC-RESOLVE-COA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_resolve_indexical_wXlocal_mappings", "RKF-DISC-RESOLVE-INDEXICAL-W/LOCAL-MAPPINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_consequent_from_indexical", "RKF-DISC-CONSEQUENT-FROM-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_easily_testable_formula", "RKF-DISC-EASILY-TESTABLE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_resolve_phrase", "RKF-DISC-RESOLVE-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_resolve_indexical", "RKF-DISC-RESOLVE-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_potentially_resolvable_entityP", "RKF-DISC-POTENTIALLY-RESOLVABLE-ENTITY?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_salient_individual_of_type_formulaP", "RKF-DISC-SALIENT-INDIVIDUAL-OF-TYPE-FORMULA?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_salient_individual_formulaP", "RKF-DISC-SALIENT-INDIVIDUAL-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_somefn_formulaP", "RKF-DISC-SOMEFN-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_salient_instance_formulaP", "RKF-DISC-SALIENT-INSTANCE-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_discourse_entityP", "RKF-DISC-DISCOURSE-ENTITY?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_disc_implied_indexicals_formulaP", "RKF-DISC-IMPLIED-INDEXICALS-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_make_discourse_formula_from_constraints", "RKF-MAKE-DISCOURSE-FORMULA-FROM-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_discourse_bundle_ar_concept", "RKF-DISCOURSE-BUNDLE-AR-CONCEPT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_discourse_bundle_original", "RKF-DISCOURSE-BUNDLE-ORIGINAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_discourse_bundle_options", "RKF-DISCOURSE-BUNDLE-OPTIONS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_discourse_tracking_file()
  {
    $rkf_discourse_context$ = SubLFiles.defparameter( "*RKF-DISCOURSE-CONTEXT*", NIL );
    $dtp_rkf_discourse_context$ = SubLFiles.defconstant( "*DTP-RKF-DISCOURSE-CONTEXT*", $sym2$RKF_DISCOURSE_CONTEXT );
    $dtp_rkf_discourse_mapping$ = SubLFiles.defconstant( "*DTP-RKF-DISCOURSE-MAPPING*", $sym32$RKF_DISCOURSE_MAPPING );
    return NIL;
  }

  public static SubLObject setup_rkf_discourse_tracking_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rkf_discourse_context$.getGlobalValue(), Symbols.symbol_function( $sym9$RKF_DISCOURSE_CONTEXT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list10 );
    Structures.def_csetf( $sym11$RKF_DC_EXPLICIT_MAPPINGS, $sym12$_CSETF_RKF_DC_EXPLICIT_MAPPINGS );
    Structures.def_csetf( $sym13$RKF_DC_DISCOURSE_MT, $sym14$_CSETF_RKF_DC_DISCOURSE_MT );
    Structures.def_csetf( $sym15$RKF_DC_PARENT_CONTEXT, $sym16$_CSETF_RKF_DC_PARENT_CONTEXT );
    Structures.def_csetf( $sym17$RKF_DC_PHRASE_INDEX, $sym18$_CSETF_RKF_DC_PHRASE_INDEX );
    Structures.def_csetf( $sym19$RKF_DC_INDEXICAL_INDEX, $sym20$_CSETF_RKF_DC_INDEXICAL_INDEX );
    Equality.identity( $sym2$RKF_DISCOURSE_CONTEXT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_discourse_context$.getGlobalValue(), Symbols.symbol_function(
        $sym31$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_CONTEXT_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rkf_discourse_mapping$.getGlobalValue(), Symbols.symbol_function( $sym38$RKF_DISCOURSE_MAPPING_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list39 );
    Structures.def_csetf( $sym40$RKF_DM_INTERPRETATION, $sym41$_CSETF_RKF_DM_INTERPRETATION );
    Structures.def_csetf( $sym42$RKF_DM_INDEXICALS, $sym43$_CSETF_RKF_DM_INDEXICALS );
    Structures.def_csetf( $sym44$RKF_DM_PHRASES, $sym45$_CSETF_RKF_DM_PHRASES );
    Equality.identity( $sym32$RKF_DISCOURSE_MAPPING );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_discourse_mapping$.getGlobalValue(), Symbols.symbol_function(
        $sym50$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_MAPPING_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_discourse_tracking_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_discourse_tracking_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_discourse_tracking_file();
  }
  static
  {
    me = new rkf_discourse_tracking();
    $rkf_discourse_context$ = null;
    $dtp_rkf_discourse_context$ = null;
    $dtp_rkf_discourse_mapping$ = null;
    $const0$TheResultOfParsing = constant_handles.reader_make_constant_shell( makeString( "TheResultOfParsing" ) );
    $sym1$RKF_DISC_DISCOURSE_ENTITY_ = makeSymbol( "RKF-DISC-DISCOURSE-ENTITY?" );
    $sym2$RKF_DISCOURSE_CONTEXT = makeSymbol( "RKF-DISCOURSE-CONTEXT" );
    $sym3$RKF_DISCOURSE_CONTEXT_P = makeSymbol( "RKF-DISCOURSE-CONTEXT-P" );
    $list4 = ConsesLow.list( makeSymbol( "EXPLICIT-MAPPINGS" ), makeSymbol( "DISCOURSE-MT" ), makeSymbol( "PARENT-CONTEXT" ), makeSymbol( "PHRASE-INDEX" ), makeSymbol( "INDEXICAL-INDEX" ) );
    $list5 = ConsesLow.list( makeKeyword( "EXPLICIT-MAPPINGS" ), makeKeyword( "DISCOURSE-MT" ), makeKeyword( "PARENT-CONTEXT" ), makeKeyword( "PHRASE-INDEX" ), makeKeyword( "INDEXICAL-INDEX" ) );
    $list6 = ConsesLow.list( makeSymbol( "RKF-DC-EXPLICIT-MAPPINGS" ), makeSymbol( "RKF-DC-DISCOURSE-MT" ), makeSymbol( "RKF-DC-PARENT-CONTEXT" ), makeSymbol( "RKF-DC-PHRASE-INDEX" ), makeSymbol(
        "RKF-DC-INDEXICAL-INDEX" ) );
    $list7 = ConsesLow.list( makeSymbol( "_CSETF-RKF-DC-EXPLICIT-MAPPINGS" ), makeSymbol( "_CSETF-RKF-DC-DISCOURSE-MT" ), makeSymbol( "_CSETF-RKF-DC-PARENT-CONTEXT" ), makeSymbol( "_CSETF-RKF-DC-PHRASE-INDEX" ),
        makeSymbol( "_CSETF-RKF-DC-INDEXICAL-INDEX" ) );
    $sym8$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym9$RKF_DISCOURSE_CONTEXT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RKF-DISCOURSE-CONTEXT-PRINT-FUNCTION-TRAMPOLINE" );
    $list10 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RKF-DISCOURSE-CONTEXT-P" ) );
    $sym11$RKF_DC_EXPLICIT_MAPPINGS = makeSymbol( "RKF-DC-EXPLICIT-MAPPINGS" );
    $sym12$_CSETF_RKF_DC_EXPLICIT_MAPPINGS = makeSymbol( "_CSETF-RKF-DC-EXPLICIT-MAPPINGS" );
    $sym13$RKF_DC_DISCOURSE_MT = makeSymbol( "RKF-DC-DISCOURSE-MT" );
    $sym14$_CSETF_RKF_DC_DISCOURSE_MT = makeSymbol( "_CSETF-RKF-DC-DISCOURSE-MT" );
    $sym15$RKF_DC_PARENT_CONTEXT = makeSymbol( "RKF-DC-PARENT-CONTEXT" );
    $sym16$_CSETF_RKF_DC_PARENT_CONTEXT = makeSymbol( "_CSETF-RKF-DC-PARENT-CONTEXT" );
    $sym17$RKF_DC_PHRASE_INDEX = makeSymbol( "RKF-DC-PHRASE-INDEX" );
    $sym18$_CSETF_RKF_DC_PHRASE_INDEX = makeSymbol( "_CSETF-RKF-DC-PHRASE-INDEX" );
    $sym19$RKF_DC_INDEXICAL_INDEX = makeSymbol( "RKF-DC-INDEXICAL-INDEX" );
    $sym20$_CSETF_RKF_DC_INDEXICAL_INDEX = makeSymbol( "_CSETF-RKF-DC-INDEXICAL-INDEX" );
    $kw21$EXPLICIT_MAPPINGS = makeKeyword( "EXPLICIT-MAPPINGS" );
    $kw22$DISCOURSE_MT = makeKeyword( "DISCOURSE-MT" );
    $kw23$PARENT_CONTEXT = makeKeyword( "PARENT-CONTEXT" );
    $kw24$PHRASE_INDEX = makeKeyword( "PHRASE-INDEX" );
    $kw25$INDEXICAL_INDEX = makeKeyword( "INDEXICAL-INDEX" );
    $str26$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw27$BEGIN = makeKeyword( "BEGIN" );
    $sym28$MAKE_RKF_DISCOURSE_CONTEXT = makeSymbol( "MAKE-RKF-DISCOURSE-CONTEXT" );
    $kw29$SLOT = makeKeyword( "SLOT" );
    $kw30$END = makeKeyword( "END" );
    $sym31$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_CONTEXT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-CONTEXT-METHOD" );
    $sym32$RKF_DISCOURSE_MAPPING = makeSymbol( "RKF-DISCOURSE-MAPPING" );
    $sym33$RKF_DISCOURSE_MAPPING_P = makeSymbol( "RKF-DISCOURSE-MAPPING-P" );
    $list34 = ConsesLow.list( makeSymbol( "INTERPRETATION" ), makeSymbol( "INDEXICALS" ), makeSymbol( "PHRASES" ) );
    $list35 = ConsesLow.list( makeKeyword( "INTERPRETATION" ), makeKeyword( "INDEXICALS" ), makeKeyword( "PHRASES" ) );
    $list36 = ConsesLow.list( makeSymbol( "RKF-DM-INTERPRETATION" ), makeSymbol( "RKF-DM-INDEXICALS" ), makeSymbol( "RKF-DM-PHRASES" ) );
    $list37 = ConsesLow.list( makeSymbol( "_CSETF-RKF-DM-INTERPRETATION" ), makeSymbol( "_CSETF-RKF-DM-INDEXICALS" ), makeSymbol( "_CSETF-RKF-DM-PHRASES" ) );
    $sym38$RKF_DISCOURSE_MAPPING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RKF-DISCOURSE-MAPPING-PRINT-FUNCTION-TRAMPOLINE" );
    $list39 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RKF-DISCOURSE-MAPPING-P" ) );
    $sym40$RKF_DM_INTERPRETATION = makeSymbol( "RKF-DM-INTERPRETATION" );
    $sym41$_CSETF_RKF_DM_INTERPRETATION = makeSymbol( "_CSETF-RKF-DM-INTERPRETATION" );
    $sym42$RKF_DM_INDEXICALS = makeSymbol( "RKF-DM-INDEXICALS" );
    $sym43$_CSETF_RKF_DM_INDEXICALS = makeSymbol( "_CSETF-RKF-DM-INDEXICALS" );
    $sym44$RKF_DM_PHRASES = makeSymbol( "RKF-DM-PHRASES" );
    $sym45$_CSETF_RKF_DM_PHRASES = makeSymbol( "_CSETF-RKF-DM-PHRASES" );
    $kw46$INTERPRETATION = makeKeyword( "INTERPRETATION" );
    $kw47$INDEXICALS = makeKeyword( "INDEXICALS" );
    $kw48$PHRASES = makeKeyword( "PHRASES" );
    $sym49$MAKE_RKF_DISCOURSE_MAPPING = makeSymbol( "MAKE-RKF-DISCOURSE-MAPPING" );
    $sym50$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_MAPPING_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-MAPPING-METHOD" );
    $list51 = ConsesLow.list( makeSymbol( "INTERP" ), makeSymbol( "&KEY" ), makeSymbol( "INDEXICALS" ), makeSymbol( "PHRASES" ) );
    $list52 = ConsesLow.list( makeKeyword( "INDEXICALS" ), makeKeyword( "PHRASES" ) );
    $kw53$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $sym54$NEW_RKF_DISCOURSE_MAPPING = makeSymbol( "NEW-RKF-DISCOURSE-MAPPING" );
    $str55$mapping_indexicals___S__ = makeString( "mapping-indexicals: ~S~%" );
    $const56$CourseOfAction = constant_handles.reader_make_constant_shell( makeString( "CourseOfAction" ) );
    $sym57$_X = makeSymbol( "?X" );
    $const58$coaDescribingSpecification = constant_handles.reader_make_constant_shell( makeString( "coaDescribingSpecification" ) );
    $list59 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSalientInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "CourseOfAction" ) ) );
    $const60$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $const61$TheSalientInstance = constant_handles.reader_make_constant_shell( makeString( "TheSalientInstance" ) );
    $const62$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $const63$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str64$_S_is_not_a_valid_indexical = makeString( "~S is not a valid indexical" );
    $const65$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const66$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const67$TheSalientFn = constant_handles.reader_make_constant_shell( makeString( "TheSalientFn" ) );
  }

  public static final class $rkf_discourse_context_native
      extends
        SubLStructNative
  {
    public SubLObject $explicit_mappings;
    public SubLObject $discourse_mt;
    public SubLObject $parent_context;
    public SubLObject $phrase_index;
    public SubLObject $indexical_index;
    private static final SubLStructDeclNative structDecl;

    public $rkf_discourse_context_native()
    {
      this.$explicit_mappings = CommonSymbols.NIL;
      this.$discourse_mt = CommonSymbols.NIL;
      this.$parent_context = CommonSymbols.NIL;
      this.$phrase_index = CommonSymbols.NIL;
      this.$indexical_index = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rkf_discourse_context_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$explicit_mappings;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$discourse_mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$parent_context;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$phrase_index;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$indexical_index;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$explicit_mappings = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$discourse_mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$parent_context = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$phrase_index = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$indexical_index = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rkf_discourse_context_native.class, $sym2$RKF_DISCOURSE_CONTEXT, $sym3$RKF_DISCOURSE_CONTEXT_P, $list4, $list5, new String[] { "$explicit_mappings", "$discourse_mt",
        "$parent_context", "$phrase_index", "$indexical_index"
      }, $list6, $list7, $sym8$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $rkf_discourse_context_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rkf_discourse_context_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RKF-DISCOURSE-CONTEXT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rkf_discourse_context_p( arg1 );
    }
  }

  public static final class $rkf_discourse_mapping_native
      extends
        SubLStructNative
  {
    public SubLObject $interpretation;
    public SubLObject $indexicals;
    public SubLObject $phrases;
    private static final SubLStructDeclNative structDecl;

    public $rkf_discourse_mapping_native()
    {
      this.$interpretation = CommonSymbols.NIL;
      this.$indexicals = CommonSymbols.NIL;
      this.$phrases = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rkf_discourse_mapping_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$interpretation;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$indexicals;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$phrases;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$interpretation = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$indexicals = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$phrases = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rkf_discourse_mapping_native.class, $sym32$RKF_DISCOURSE_MAPPING, $sym33$RKF_DISCOURSE_MAPPING_P, $list34, $list35, new String[] { "$interpretation", "$indexicals",
        "$phrases"
      }, $list36, $list37, $sym8$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $rkf_discourse_mapping_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rkf_discourse_mapping_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RKF-DISCOURSE-MAPPING-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rkf_discourse_mapping_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 156 ms
 * 
 */