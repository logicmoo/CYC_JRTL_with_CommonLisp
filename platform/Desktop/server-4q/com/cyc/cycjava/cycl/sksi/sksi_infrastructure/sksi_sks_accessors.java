package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_sks_accessors
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors";
  public static final String myFingerPrint = "22ebc547b52a53f04e4abbb0c25bc5d6a4b19d8b96be64b3acfa0670ce08ed47";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 7393L)
  private static SubLSymbol $sks_inverse_lookup_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 13644L)
  private static SubLSymbol $sks_type_to_subtype_pred_plist$;
  private static final SubLObject $const0$StructuredKnowledgeSource;
  private static final SubLObject $const1$StructuredKnowledgeSource_Complex;
  private static final SubLObject $const2$StructuredKnowledgeSource_Atomic;
  private static final SubLSymbol $sym3$NON_EMPTY_STRING_;
  private static final SubLSymbol $sym4$SKS_COMPLEX_P;
  private static final SubLSymbol $sym5$HLMT_P;
  private static final SubLSymbol $sym6$SKS_TYPE_P;
  private static final SubLObject $const7$isa;
  private static final SubLObject $const8$UniversalVocabularyMt;
  private static final SubLString $str9$No_defining_mt_found_;
  private static final SubLObject $const10$definingMt;
  private static final SubLObject $const11$BaseKB;
  private static final SubLObject $const12$Microtheory;
  private static final SubLString $str13$Given_sks_type__A_conflicts_with_;
  private static final SubLObject $const14$comment;
  private static final SubLObject $const15$subKS_Direct;
  private static final SubLObject $const16$structuredKnowledgeSourceName;
  private static final SubLObject $const17$genlMt;
  private static final SubLObject $const18$ContentMtFn;
  private static final SubLObject $const19$SKSIMt;
  private static final SubLSymbol $sym20$SKS_P;
  private static final SubLString $str21$The__;
  private static final SubLString $str22$__table_in___;
  private static final SubLString $str23$_;
  private static final SubLString $str24$The_top_level_knowledge_source_fo;
  private static final SubLString $str25$_KS;
  private static final SubLString $str26$KS;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$FORT_P;
  private static final SubLSymbol $kw29$ALL;
  private static final SubLString $str30$more_than_one__A_found_for__A__re;
  private static final SubLString $str31$;
  private static final SubLObject $const32$sksIsa;
  private static final SubLObject $const33$mappingMt;
  private static final SubLObject $const34$contentMt;
  private static final SubLSymbol $sym35$SKS_GET_TOP_SKS;
  private static final SubLString $str36$too_many_possible_skss_for_conten;
  private static final SubLObject $const37$StructuredKnowledgeSource_TopLeve;
  private static final SubLSymbol $sym38$FORT_NAME_;
  private static final SubLObject $const39$rowCount_SKS;
  private static final SubLSymbol $sym40$NUMBERP;
  private static final SubLObject $const41$MappingMtFn;
  private static final SubLObject $const42$SKSISupportedStructuredKnowledgeS;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$SKS_SUBTYPE_P;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 1117L)
  public static SubLObject sks_p(final SubLObject sks)
  {
    return makeBoolean( NIL != forts.fort_p( sks ) && NIL != isa.isa_in_any_mtP( sks, $const0$StructuredKnowledgeSource ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 2700L)
  public static SubLObject sks_complex_p(final SubLObject sks)
  {
    return makeBoolean( NIL != sks_p( sks ) && ( NIL == sks_atomic_p( sks ) || NIL != isa.isa_in_any_mtP( sks, $const1$StructuredKnowledgeSource_Complex ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 2866L)
  public static SubLObject sks_atomic_p(final SubLObject sks)
  {
    return makeBoolean( NIL != forts.fort_p( sks ) && NIL != isa.isa_in_any_mtP( sks, $const2$StructuredKnowledgeSource_Atomic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 2995L)
  public static SubLObject new_sks(final SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt, SubLObject sks_type)
  {
    if( super_sks == UNPROVIDED )
    {
      super_sks = NIL;
    }
    if( defining_mt == UNPROVIDED )
    {
      defining_mt = NIL;
    }
    if( sks_type == UNPROVIDED )
    {
      sks_type = NIL;
    }
    assert NIL != string_utilities.non_empty_stringP( sks_name ) : sks_name;
    if( NIL != super_sks && !assertionsDisabledInClass && NIL == sks_complex_p( super_sks ) )
    {
      throw new AssertionError( super_sks );
    }
    if( NIL != defining_mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p( defining_mt ) )
    {
      throw new AssertionError( defining_mt );
    }
    if( NIL != sks_type && !assertionsDisabledInClass && NIL == sks_type_p( sks_type ) )
    {
      throw new AssertionError( sks_type );
    }
    final SubLObject sks_description = make_new_sks_description( sks_name, super_sks );
    final SubLObject sks_constant_name = make_new_sks_constant_name( sks_name, super_sks );
    final SubLObject sks = sksi_kb_accessors.sksi_find_or_create( sks_constant_name );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const7$isa, sks, $const0$StructuredKnowledgeSource ), $const8$UniversalVocabularyMt );
    if( NIL == hlmt.hlmt_p( defining_mt ) )
    {
      defining_mt = ( NIL != sks_p( super_sks ) ) ? sks_get_defining_mt( super_sks, UNPROVIDED ) : NIL;
      if( NIL == hlmt.hlmt_p( defining_mt ) )
      {
        defining_mt = make_sks_legacy_mapping_mt( sks );
        if( NIL == hlmt.hlmt_p( defining_mt ) )
        {
          Errors.error( $str9$No_defining_mt_found_ );
        }
      }
    }
    if( NIL != sks )
    {
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const10$definingMt, sks, defining_mt ), $const11$BaseKB );
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const7$isa, defining_mt, $const12$Microtheory ), $const8$UniversalVocabularyMt );
      if( NIL != sks_p( super_sks ) )
      {
        sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas( sks, super_sks );
        final SubLObject super_sks_type = sks_get_type( super_sks );
        if( NIL != sks_type_p( super_sks_type ) && NIL != sks_type_p( sks_type ) && !super_sks_type.equal( sks_type ) )
        {
          Errors.error( $str13$Given_sks_type__A_conflicts_with_, super_sks_type, sks_type );
        }
        else if( NIL == sks_type )
        {
          sks_type = super_sks_type;
        }
      }
      if( NIL != sks_type_p( sks_type ) )
      {
        sks_set_type( sks, sks_type );
      }
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const14$comment, sks, sks_description ), defining_mt );
      if( NIL != super_sks )
      {
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const15$subKS_Direct, super_sks, sks ), defining_mt );
      }
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const16$structuredKnowledgeSourceName, sks, sks_name ), defining_mt );
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const17$genlMt, el_utilities.make_unary_nat_formula( $const18$ContentMtFn, sks ), $const11$BaseKB ), $const8$UniversalVocabularyMt );
      sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const17$genlMt, el_utilities.make_unary_nat_formula( $const18$ContentMtFn, sks ), $const19$SKSIMt ), $const8$UniversalVocabularyMt );
    }
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 5167L)
  public static SubLObject new_sks_complex(final SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt, SubLObject sks_type)
  {
    if( super_sks == UNPROVIDED )
    {
      super_sks = NIL;
    }
    if( defining_mt == UNPROVIDED )
    {
      defining_mt = NIL;
    }
    if( sks_type == UNPROVIDED )
    {
      sks_type = NIL;
    }
    assert NIL != string_utilities.non_empty_stringP( sks_name ) : sks_name;
    if( NIL != super_sks && !assertionsDisabledInClass && NIL == sks_complex_p( super_sks ) )
    {
      throw new AssertionError( super_sks );
    }
    if( NIL != defining_mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p( defining_mt ) )
    {
      throw new AssertionError( defining_mt );
    }
    if( NIL != sks_type && !assertionsDisabledInClass && NIL == sks_type_p( sks_type ) )
    {
      throw new AssertionError( sks_type );
    }
    final SubLObject sks = new_sks( sks_name, super_sks, defining_mt, sks_type );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const7$isa, sks, $const1$StructuredKnowledgeSource_Complex ), $const8$UniversalVocabularyMt );
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 5636L)
  public static SubLObject new_sks_atomic(final SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt)
  {
    if( super_sks == UNPROVIDED )
    {
      super_sks = NIL;
    }
    if( defining_mt == UNPROVIDED )
    {
      defining_mt = NIL;
    }
    assert NIL != string_utilities.non_empty_stringP( sks_name ) : sks_name;
    if( NIL != super_sks && !assertionsDisabledInClass && NIL == sks_complex_p( super_sks ) )
    {
      throw new AssertionError( super_sks );
    }
    if( NIL != defining_mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p( defining_mt ) )
    {
      throw new AssertionError( defining_mt );
    }
    final SubLObject sks = new_sks( sks_name, super_sks, defining_mt, UNPROVIDED );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const7$isa, sks, $const2$StructuredKnowledgeSource_Atomic ), $const8$UniversalVocabularyMt );
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 6039L)
  public static SubLObject destroy_sks(final SubLObject sks)
  {
    assert NIL != sks_p( sks ) : sks;
    return sksi_kb_accessors.sksi_kill( sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 6126L)
  public static SubLObject make_new_sks_description(final SubLObject sks_name, SubLObject super_sks)
  {
    if( super_sks == UNPROVIDED )
    {
      super_sks = NIL;
    }
    assert NIL != string_utilities.non_empty_stringP( sks_name ) : sks_name;
    if( NIL != super_sks && !assertionsDisabledInClass && NIL == sks_p( super_sks ) )
    {
      throw new AssertionError( super_sks );
    }
    SubLObject result = NIL;
    if( NIL != sks_p( super_sks ) )
    {
      result = Sequences.cconcatenate( $str21$The__, new SubLObject[] { format_nil.format_nil_a_no_copy( sks_name ), $str22$__table_in___, format_nil.format_nil_a_no_copy( sks_get_string( super_sks ) ), $str23$_
      } );
    }
    else
    {
      result = Sequences.cconcatenate( $str24$The_top_level_knowledge_source_fo, new SubLObject[] { format_nil.format_nil_a_no_copy( sks_name ), $str23$_
      } );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 6611L)
  public static SubLObject make_new_sks_constant_name(final SubLObject sks_name, SubLObject super_sks)
  {
    if( super_sks == UNPROVIDED )
    {
      super_sks = NIL;
    }
    assert NIL != string_utilities.non_empty_stringP( sks_name ) : sks_name;
    if( NIL != super_sks && !assertionsDisabledInClass && NIL == sks_p( super_sks ) )
    {
      throw new AssertionError( super_sks );
    }
    SubLObject result = NIL;
    if( NIL != sks_p( super_sks ) )
    {
      result = string_utilities.bunge( ConsesLow.list( string_utilities.post_remove( sks_get_string( super_sks ), $str25$_KS, UNPROVIDED ), sks_name, $str26$KS ), Characters.CHAR_hyphen );
    }
    else if( NIL != string_utilities.ends_with( sks_name, $str25$_KS, UNPROVIDED ) )
    {
      result = string_utilities.make_valid_constant_name( sks_name, UNPROVIDED );
    }
    else
    {
      result = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( string_utilities.make_valid_constant_name( sks_name, UNPROVIDED ) ), $str25$_KS );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 7122L)
  public static SubLObject find_sks(final SubLObject sks_name, SubLObject super_sks)
  {
    if( super_sks == UNPROVIDED )
    {
      super_sks = NIL;
    }
    assert NIL != string_utilities.non_empty_stringP( sks_name ) : sks_name;
    if( NIL != super_sks && !assertionsDisabledInClass && NIL == sks_complex_p( super_sks ) )
    {
      throw new AssertionError( super_sks );
    }
    final SubLObject sks_constant_name = make_new_sks_constant_name( sks_name, super_sks );
    return sksi_kb_accessors.sksi_find( sks_constant_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 7487L)
  public static SubLObject sks_get(final SubLObject sks, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sks_p( sks ) : sks;
    assert NIL != forts.fort_p( pred ) : pred;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    if( NIL == mt )
    {
      mt = sks_get_defining_mt( sks, T );
    }
    final SubLObject reverse_argsP = subl_promotions.memberP( pred, $sks_inverse_lookup_preds$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    final SubLObject index_arg = ( NIL != reverse_argsP ) ? TWO_INTEGER : ONE_INTEGER;
    final SubLObject gather_arg = ( NIL != reverse_argsP ) ? ONE_INTEGER : TWO_INTEGER;
    SubLObject result = NIL;
    if( NIL == mt || mt == $kw29$ALL )
    {
      result = kb_mapping_utilities.pred_values_in_any_mt( sks, pred, index_arg, gather_arg, UNPROVIDED );
    }
    else
    {
      result = kb_mapping_utilities.pred_values_in_relevant_mts( sks, pred, mt, index_arg, gather_arg, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 8337L)
  public static SubLObject sks_fget(final SubLObject sks, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject sks_get_results = sks_get( sks, pred, mt );
    if( NIL != sks_get_results && NIL == list_utilities.singletonP( sks_get_results ) )
    {
      Errors.warn( $str30$more_than_one__A_found_for__A__re, pred, sks );
    }
    return sks_get_results.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 8636L)
  public static SubLObject sks_fset(final SubLObject sks, final SubLObject pred, final SubLObject value, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == mt )
    {
      mt = sks_get_defining_mt( sks, UNPROVIDED );
    }
    final SubLObject current_value = sks_fget( sks, pred, mt );
    final SubLObject current_formula = el_utilities.make_binary_formula( pred, sks_get_term( sks ), current_value );
    final SubLObject new_formula = el_utilities.make_binary_formula( pred, sks_get_term( sks ), value );
    sksi_kb_accessors.sksi_unassert( current_formula, mt );
    if( NIL != value )
    {
      return sksi_kb_accessors.sksi_assert_if_new( new_formula, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 9074L)
  public static SubLObject sks_get_term(final SubLObject sks)
  {
    assert NIL != sks_p( sks ) : sks;
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 9156L)
  public static SubLObject sks_get_name(final SubLObject sks, SubLObject pred)
  {
    if( pred == UNPROVIDED )
    {
      pred = $const16$structuredKnowledgeSourceName;
    }
    assert NIL != sks_p( sks ) : sks;
    SubLObject result = sks_fget( sks, pred, UNPROVIDED );
    if( NIL == result )
    {
      result = $str31$;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 9376L)
  public static SubLObject sks_get_string(final SubLObject sks)
  {
    assert NIL != sks_p( sks ) : sks;
    return constants_high.constant_name( sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 9470L)
  public static SubLObject sks_get_type(final SubLObject sks)
  {
    assert NIL != sks_p( sks ) : sks;
    return sks_fget( sks, $const32$sksIsa, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 9566L)
  public static SubLObject sks_set_type(final SubLObject sks, final SubLObject sks_type)
  {
    assert NIL != sks_p( sks ) : sks;
    assert NIL != sks_type_p( sks_type ) : sks_type;
    final SubLObject defining_mt = sks_get_defining_mt( sks, UNPROVIDED );
    if( NIL != hlmt.hlmt_p( defining_mt ) )
    {
      final SubLObject current_sks_type = sks_get_type( sks );
      if( !sks_type.equal( current_sks_type ) )
      {
        sksi_kb_accessors.sksi_unassert( el_utilities.make_binary_formula( $const32$sksIsa, sks, current_sks_type ), defining_mt );
        sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const32$sksIsa, sks, sks_type ), defining_mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 10031L)
  public static SubLObject sks_get_subtype(final SubLObject sks, final SubLObject sks_type)
  {
    assert NIL != sks_p( sks ) : sks;
    assert NIL != sks_type_p( sks_type ) : sks_type;
    final SubLObject pred = sks_type_get_subtype_pred( sks_type );
    final SubLObject result = ( NIL != pred ) ? sks_fget( sks, pred, UNPROVIDED ) : NIL;
    if( NIL != forts.fort_p( result ) )
    {
      return result;
    }
    final SubLObject super_sks = sks_get_super_sks( sks );
    if( NIL != sks_p( super_sks ) )
    {
      return sks_get_subtype( super_sks, sks_type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 10479L)
  public static SubLObject sks_get_super_sks(final SubLObject sks)
  {
    assert NIL != sks_p( sks ) : sks;
    return kb_mapping_utilities.fpred_value_in_any_mt( sks, $const15$subKS_Direct, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 10603L)
  public static SubLObject sks_get_defining_mt(final SubLObject sks, SubLObject strict_definitionP)
  {
    if( strict_definitionP == UNPROVIDED )
    {
      strict_definitionP = NIL;
    }
    assert NIL != sks_p( sks ) : sks;
    final SubLObject defining_mt = kb_mapping_utilities.fpred_value_in_mt( sks, $const10$definingMt, $const11$BaseKB, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
    if( NIL != hlmt.hlmt_p( defining_mt ) )
    {
      return defining_mt;
    }
    if( NIL != strict_definitionP )
    {
      return NIL;
    }
    final SubLObject legacy_mapping_mt = sks_fget( sks_get_top_sks( sks ), $const33$mappingMt, UNPROVIDED );
    if( NIL != hlmt.hlmt_p( legacy_mapping_mt ) )
    {
      return legacy_mapping_mt;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 11429L)
  public static SubLObject sks_get_content_mt(final SubLObject sks)
  {
    assert NIL != sks_p( sks ) : sks;
    return sks_fget( sks, $const34$contentMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 11534L)
  public static SubLObject find_sks_by_content_mt(final SubLObject content_mt)
  {
    assert NIL != hlmt.hlmt_p( content_mt ) : content_mt;
    final SubLObject skss = kb_mapping_utilities.pred_values_in_any_mt( content_mt, $const34$contentMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    final SubLObject sks_tops = Mapping.mapcar( $sym35$SKS_GET_TOP_SKS, skss );
    if( Sequences.length( sks_tops ).numG( ONE_INTEGER ) )
    {
      Errors.warn( $str36$too_many_possible_skss_for_conten, content_mt );
    }
    return sks_tops.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 11864L)
  public static SubLObject get_all_skss()
  {
    final SubLObject skss = isa.all_fort_instances_in_all_mts( $const37$StructuredKnowledgeSource_TopLeve );
    return Sort.sort( skss, $sym38$FORT_NAME_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 12021L)
  public static SubLObject sks_get_connection(final SubLObject sks)
  {
    assert NIL != sks_p( sks ) : sks;
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 12107L)
  public static SubLObject sks_get_row_count(final SubLObject sks)
  {
    assert NIL != sks_p( sks ) : sks;
    return sks_fget( sks, $const39$rowCount_SKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 12242L)
  public static SubLObject sks_set_row_count(final SubLObject sks, final SubLObject row_count)
  {
    assert NIL != sks_p( sks ) : sks;
    assert NIL != Types.numberp( row_count ) : row_count;
    return sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const39$rowCount_SKS, sks, Numbers.round( row_count, UNPROVIDED ) ), sks_get_defining_mt( sks, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 12600L)
  public static SubLObject sks_get_top_sks(final SubLObject sks)
  {
    final SubLObject super_sks = sks_get_super_sks( sks );
    if( NIL != sks_p( super_sks ) )
    {
      return sks_get_top_sks( super_sks );
    }
    return sks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 12777L)
  public static SubLObject make_sks_legacy_mapping_mt(final SubLObject sks)
  {
    final SubLObject mt_formula = el_utilities.make_unary_nat_formula( $const41$MappingMtFn, sks );
    sksi_kb_accessors.sksi_assert_if_new( el_utilities.make_binary_formula( $const33$mappingMt, sks, mt_formula ), $const8$UniversalVocabularyMt );
    return sksi_kb_accessors.sksi_find_nart( mt_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 13188L)
  public static SubLObject sks_type_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && ( NIL == control_vars.kb_loaded() || NIL != isa.isa_in_any_mtP( v_object, $const42$SKSISupportedStructuredKnowledgeS ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 13473L)
  public static SubLObject sks_type_get_name(final SubLObject sks_type)
  {
    assert NIL != sks_type_p( sks_type ) : sks_type;
    return constants_high.constant_name( sks_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 13753L)
  public static SubLObject sks_type_get_subtype_pred(final SubLObject sks_type)
  {
    assert NIL != sks_type_p( sks_type ) : sks_type;
    return conses_high.getf( $sks_type_to_subtype_pred_plist$.getGlobalValue(), sks_type, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 13902L)
  public static SubLObject sks_subtype_p(final SubLObject v_object)
  {
    return forts.fort_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-sks-accessors.lisp", position = 14086L)
  public static SubLObject sks_subtype_get_name(final SubLObject sks_subtype)
  {
    assert NIL != sks_subtype_p( sks_subtype ) : sks_subtype;
    return constants_high.constant_name( sks_subtype );
  }

  public static SubLObject declare_sksi_sks_accessors_file()
  {
    SubLFiles.declareFunction( me, "sks_p", "SKS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_complex_p", "SKS-COMPLEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_atomic_p", "SKS-ATOMIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sks", "NEW-SKS", 1, 3, false );
    SubLFiles.declareFunction( me, "new_sks_complex", "NEW-SKS-COMPLEX", 1, 3, false );
    SubLFiles.declareFunction( me, "new_sks_atomic", "NEW-SKS-ATOMIC", 1, 2, false );
    SubLFiles.declareFunction( me, "destroy_sks", "DESTROY-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_new_sks_description", "MAKE-NEW-SKS-DESCRIPTION", 1, 1, false );
    SubLFiles.declareFunction( me, "make_new_sks_constant_name", "MAKE-NEW-SKS-CONSTANT-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "find_sks", "FIND-SKS", 1, 1, false );
    SubLFiles.declareFunction( me, "sks_get", "SKS-GET", 2, 1, false );
    SubLFiles.declareFunction( me, "sks_fget", "SKS-FGET", 2, 1, false );
    SubLFiles.declareFunction( me, "sks_fset", "SKS-FSET", 3, 1, false );
    SubLFiles.declareFunction( me, "sks_get_term", "SKS-GET-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_name", "SKS-GET-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "sks_get_string", "SKS-GET-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_type", "SKS-GET-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_set_type", "SKS-SET-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_get_subtype", "SKS-GET-SUBTYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_get_super_sks", "SKS-GET-SUPER-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_defining_mt", "SKS-GET-DEFINING-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "sks_get_content_mt", "SKS-GET-CONTENT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "find_sks_by_content_mt", "FIND-SKS-BY-CONTENT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_all_skss", "GET-ALL-SKSS", 0, 0, false );
    SubLFiles.declareFunction( me, "sks_get_connection", "SKS-GET-CONNECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_get_row_count", "SKS-GET-ROW-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_set_row_count", "SKS-SET-ROW-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_get_top_sks", "SKS-GET-TOP-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_sks_legacy_mapping_mt", "MAKE-SKS-LEGACY-MAPPING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_type_p", "SKS-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_type_get_name", "SKS-TYPE-GET-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_type_get_subtype_pred", "SKS-TYPE-GET-SUBTYPE-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_subtype_p", "SKS-SUBTYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_subtype_get_name", "SKS-SUBTYPE-GET-NAME", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_sks_accessors_file()
  {
    $sks_inverse_lookup_preds$ = SubLFiles.defparameter( "*SKS-INVERSE-LOOKUP-PREDS*", $list27 );
    $sks_type_to_subtype_pred_plist$ = SubLFiles.deflexical( "*SKS-TYPE-TO-SUBTYPE-PRED-PLIST*", $list43 );
    return NIL;
  }

  public static SubLObject setup_sksi_sks_accessors_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_sks_accessors_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_sks_accessors_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_sks_accessors_file();
  }
  static
  {
    me = new sksi_sks_accessors();
    $sks_inverse_lookup_preds$ = null;
    $sks_type_to_subtype_pred_plist$ = null;
    $const0$StructuredKnowledgeSource = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource" ) );
    $const1$StructuredKnowledgeSource_Complex = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-Complex" ) );
    $const2$StructuredKnowledgeSource_Atomic = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-Atomic" ) );
    $sym3$NON_EMPTY_STRING_ = makeSymbol( "NON-EMPTY-STRING?" );
    $sym4$SKS_COMPLEX_P = makeSymbol( "SKS-COMPLEX-P" );
    $sym5$HLMT_P = makeSymbol( "HLMT-P" );
    $sym6$SKS_TYPE_P = makeSymbol( "SKS-TYPE-P" );
    $const7$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const8$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $str9$No_defining_mt_found_ = makeString( "No defining mt found!" );
    $const10$definingMt = constant_handles.reader_make_constant_shell( makeString( "definingMt" ) );
    $const11$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const12$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $str13$Given_sks_type__A_conflicts_with_ = makeString( "Given sks-type ~A conflicts with super-sks-type ~A" );
    $const14$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $const15$subKS_Direct = constant_handles.reader_make_constant_shell( makeString( "subKS-Direct" ) );
    $const16$structuredKnowledgeSourceName = constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceName" ) );
    $const17$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const18$ContentMtFn = constant_handles.reader_make_constant_shell( makeString( "ContentMtFn" ) );
    $const19$SKSIMt = constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) );
    $sym20$SKS_P = makeSymbol( "SKS-P" );
    $str21$The__ = makeString( "The \"" );
    $str22$__table_in___ = makeString( "\" table in #$" );
    $str23$_ = makeString( "." );
    $str24$The_top_level_knowledge_source_fo = makeString( "The top-level knowledge source for the " );
    $str25$_KS = makeString( "-KS" );
    $str26$KS = makeString( "KS" );
    $list27 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "physicalSchemaSourceMap" ) ) );
    $sym28$FORT_P = makeSymbol( "FORT-P" );
    $kw29$ALL = makeKeyword( "ALL" );
    $str30$more_than_one__A_found_for__A__re = makeString( "more than one ~A found for ~A, returning only one." );
    $str31$ = makeString( "" );
    $const32$sksIsa = constant_handles.reader_make_constant_shell( makeString( "sksIsa" ) );
    $const33$mappingMt = constant_handles.reader_make_constant_shell( makeString( "mappingMt" ) );
    $const34$contentMt = constant_handles.reader_make_constant_shell( makeString( "contentMt" ) );
    $sym35$SKS_GET_TOP_SKS = makeSymbol( "SKS-GET-TOP-SKS" );
    $str36$too_many_possible_skss_for_conten = makeString( "too many possible skss for content-mt ~A" );
    $const37$StructuredKnowledgeSource_TopLeve = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-TopLevel" ) );
    $sym38$FORT_NAME_ = makeSymbol( "FORT-NAME<" );
    $const39$rowCount_SKS = constant_handles.reader_make_constant_shell( makeString( "rowCount-SKS" ) );
    $sym40$NUMBERP = makeSymbol( "NUMBERP" );
    $const41$MappingMtFn = constant_handles.reader_make_constant_shell( makeString( "MappingMtFn" ) );
    $const42$SKSISupportedStructuredKnowledgeS = constant_handles.reader_make_constant_shell( makeString( "SKSISupportedStructuredKnowledgeSourceType" ) );
    $list43 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) ), constant_handles.reader_make_constant_shell( makeString( "sqlProgramForSKS" ) ) );
    $sym44$SKS_SUBTYPE_P = makeSymbol( "SKS-SUBTYPE-P" );
  }
}
/*
 * 
 * Total time: 209 ms synthetic
 */