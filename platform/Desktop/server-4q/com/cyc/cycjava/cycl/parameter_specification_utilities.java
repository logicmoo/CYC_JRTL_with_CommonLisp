package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parameter_specification_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.parameter_specification_utilities";
  public static final String myFingerPrint = "ddc3341a9be35f9e7f55de87f1206006dc6ec6b7560655f7d80e29e68582c735";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$EL_SET;
  private static final SubLSymbol $sym2$FORT_P;
  private static final SubLObject $const3$softwareParameterValueInSpecifica;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$FIRST;
  private static final SubLSymbol $sym6$KEYWORDP;
  private static final SubLObject $const7$False;
  private static final SubLObject $const8$True;
  private static final SubLObject $const9$TheEmptySet;
  private static final SubLObject $const10$PlusInfinity;
  private static final SubLSymbol $kw11$POSITIVE_INFINITY;
  private static final SubLObject $const12$softwareParameterShortDescription;
  private static final SubLSymbol $kw13$TRUE;
  private static final SubLObject $const14$softwareParameterLongDescription;
  private static final SubLObject $const15$defaultSoftwareParameterValueInSo;
  private static final SubLObject $const16$subLIdentifier;
  private static final SubLObject $const17$CycAPIMt;
  private static final SubLObject $const18$SubLQuoteFn;
  private static final SubLObject $const19$alternateSoftwareParameterValueIn;
  private static final SubLObject $const20$softwareParameterValueDomainInSof;
  private static final SubLObject $const21$softwareParameterValueShortDescri;
  private static final SubLObject $const22$softwareParameterValueLongDescrip;

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 932L)
  public static SubLObject parameter_specification_tuples(final SubLObject parameter_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( parameter_spec, $list0 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject el_set = list_utilities.alist_lookup_without_values( v_bindings, $sym1$EL_SET, UNPROVIDED, UNPROVIDED );
      SubLObject tuples = NIL;
      SubLObject cdolist_list_var = el_utilities.el_set_items( el_set );
      SubLObject el_list = NIL;
      el_list = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        tuples = ConsesLow.cons( el_utilities.el_list_items( el_list ), tuples );
        cdolist_list_var = cdolist_list_var.rest();
        el_list = cdolist_list_var.first();
      }
      return tuples;
    }
    assert NIL != forts.fort_p( parameter_spec ) : parameter_spec;
    SubLObject tuples2 = kb_mapping_utilities.pred_value_tuples_in_any_mt( parameter_spec, $const3$softwareParameterValueInSpecifica, THREE_INTEGER, $list4, UNPROVIDED );
    tuples2 = Sequences.delete_duplicates( tuples2, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym5$FIRST ), UNPROVIDED, UNPROVIDED );
    return tuples2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 1676L)
  public static SubLObject parameter_from_keyword(final SubLObject keyword, final SubLObject domain)
  {
    assert NIL != Types.keywordp( keyword ) : keyword;
    return subl_identifier.cyc_entity_from_sublid( keyword, domain );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 1813L)
  public static SubLObject keyword_from_parameter(final SubLObject parameter)
  {
    assert NIL != forts.fort_p( parameter ) : parameter;
    return subl_identifier.sublid_from_cyc_entity( parameter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 1940L)
  public static SubLObject parse_standard_parameter_value(final SubLObject value)
  {
    if( value.eql( $const7$False ) )
    {
      return NIL;
    }
    if( value.eql( $const8$True ) )
    {
      return T;
    }
    if( value.eql( $const9$TheEmptySet ) )
    {
      return NIL;
    }
    if( value.eql( $const10$PlusInfinity ) )
    {
      return $kw11$POSITIVE_INFINITY;
    }
    if( NIL != el_utilities.subl_escape_p( value ) )
    {
      return el_utilities.subl_escape_subl( value );
    }
    if( NIL != el_utilities.el_list_p( value ) )
    {
      return el_utilities.el_list_items( value );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 2324L)
  public static SubLObject encode_parameter_value(final SubLObject value)
  {
    if( value == NIL )
    {
      return $const7$False;
    }
    if( value == T )
    {
      return $const8$True;
    }
    if( value == $kw11$POSITIVE_INFINITY )
    {
      return $const10$PlusInfinity;
    }
    if( value.isKeyword() )
    {
      return el_utilities.make_cycl_subl_symbol( value );
    }
    if( value.isCons() )
    {
      return el_utilities.make_el_list( value, UNPROVIDED );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 2666L)
  public static SubLObject software_parameter_short_description(final SubLObject parameter, final SubLObject mt)
  {
    return kb_mapping_utilities.fpred_value_in_mt( parameter, $const12$softwareParameterShortDescription, mt, ONE_INTEGER, TWO_INTEGER, $kw13$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 2822L)
  public static SubLObject software_parameter_long_description(final SubLObject parameter, final SubLObject mt)
  {
    return kb_mapping_utilities.fpred_value_in_mt( parameter, $const14$softwareParameterLongDescription, mt, ONE_INTEGER, TWO_INTEGER, $kw13$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 2976L)
  public static SubLObject software_parameter_default_value(final SubLObject parameter, final SubLObject software_object, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts( $const15$defaultSoftwareParameterValueInSo, parameter, software_object, mt, ONE_INTEGER, THREE_INTEGER, $kw13$TRUE );
    if( NIL != gaf )
    {
      SubLObject default_value = assertions_high.gaf_arg2( gaf );
      if( NIL != forts.fort_p( default_value ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_subl_identifier = software_parameter_value_subl_identifier( default_value );
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != foundP )
        {
          default_value = v_subl_identifier;
        }
      }
      return default_value;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 3495L)
  public static SubLObject software_parameter_value_subl_identifier(final SubLObject parameter)
  {
    final SubLObject value = kb_mapping_utilities.fpred_value_in_mt( parameter, $const16$subLIdentifier, $const17$CycAPIMt, ONE_INTEGER, TWO_INTEGER, $kw13$TRUE );
    if( NIL != el_utilities.el_formula_with_operator_p( value, $const18$SubLQuoteFn ) )
    {
      return Values.values( cycl_utilities.nat_arg1( value, UNPROVIDED ), T );
    }
    return Values.values( value, list_utilities.sublisp_boolean( value ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 3794L)
  public static SubLObject software_parameter_alternate_value(final SubLObject parameter, final SubLObject software_object, final SubLObject mt)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts( $const19$alternateSoftwareParameterValueIn, parameter, software_object, mt, ONE_INTEGER, THREE_INTEGER, $kw13$TRUE );
    if( NIL != gaf )
    {
      return assertions_high.gaf_arg2( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 4065L)
  public static SubLObject software_parameter_value_domain_in_software_object(final SubLObject parameter, final SubLObject software_object, final SubLObject mt)
  {
    final SubLObject gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts( $const20$softwareParameterValueDomainInSof, parameter, software_object, mt, ONE_INTEGER, THREE_INTEGER, $kw13$TRUE );
    if( NIL != gaf )
    {
      return assertions_high.gaf_arg2( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 4350L)
  public static SubLObject software_parameter_value_short_description(final SubLObject parameter, final SubLObject mt)
  {
    return kb_mapping_utilities.fpred_value_in_mt( parameter, $const21$softwareParameterValueShortDescri, mt, ONE_INTEGER, TWO_INTEGER, $kw13$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parameter-specification-utilities.lisp", position = 4519L)
  public static SubLObject software_parameter_value_long_description(final SubLObject parameter, final SubLObject mt)
  {
    return kb_mapping_utilities.fpred_value_in_mt( parameter, $const22$softwareParameterValueLongDescrip, mt, ONE_INTEGER, TWO_INTEGER, $kw13$TRUE );
  }

  public static SubLObject declare_parameter_specification_utilities_file()
  {
    SubLFiles.declareFunction( me, "parameter_specification_tuples", "PARAMETER-SPECIFICATION-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "parameter_from_keyword", "PARAMETER-FROM-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "keyword_from_parameter", "KEYWORD-FROM-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_standard_parameter_value", "PARSE-STANDARD-PARAMETER-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_parameter_value", "ENCODE-PARAMETER-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "software_parameter_short_description", "SOFTWARE-PARAMETER-SHORT-DESCRIPTION", 2, 0, false );
    SubLFiles.declareFunction( me, "software_parameter_long_description", "SOFTWARE-PARAMETER-LONG-DESCRIPTION", 2, 0, false );
    SubLFiles.declareFunction( me, "software_parameter_default_value", "SOFTWARE-PARAMETER-DEFAULT-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "software_parameter_value_subl_identifier", "SOFTWARE-PARAMETER-VALUE-SUBL-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "software_parameter_alternate_value", "SOFTWARE-PARAMETER-ALTERNATE-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "software_parameter_value_domain_in_software_object", "SOFTWARE-PARAMETER-VALUE-DOMAIN-IN-SOFTWARE-OBJECT", 3, 0, false );
    SubLFiles.declareFunction( me, "software_parameter_value_short_description", "SOFTWARE-PARAMETER-VALUE-SHORT-DESCRIPTION", 2, 0, false );
    SubLFiles.declareFunction( me, "software_parameter_value_long_description", "SOFTWARE-PARAMETER-VALUE-LONG-DESCRIPTION", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_parameter_specification_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_parameter_specification_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parameter_specification_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parameter_specification_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parameter_specification_utilities_file();
  }
  static
  {
    me = new parameter_specification_utilities();
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QueryFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EL-SET" ) ) );
    $sym1$EL_SET = makeSymbol( "EL-SET" );
    $sym2$FORT_P = makeSymbol( "FORT-P" );
    $const3$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell( makeString( "softwareParameterValueInSpecification" ) );
    $list4 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER );
    $sym5$FIRST = makeSymbol( "FIRST" );
    $sym6$KEYWORDP = makeSymbol( "KEYWORDP" );
    $const7$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $const8$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const9$TheEmptySet = constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) );
    $const10$PlusInfinity = constant_handles.reader_make_constant_shell( makeString( "PlusInfinity" ) );
    $kw11$POSITIVE_INFINITY = makeKeyword( "POSITIVE-INFINITY" );
    $const12$softwareParameterShortDescription = constant_handles.reader_make_constant_shell( makeString( "softwareParameterShortDescription" ) );
    $kw13$TRUE = makeKeyword( "TRUE" );
    $const14$softwareParameterLongDescription = constant_handles.reader_make_constant_shell( makeString( "softwareParameterLongDescription" ) );
    $const15$defaultSoftwareParameterValueInSo = constant_handles.reader_make_constant_shell( makeString( "defaultSoftwareParameterValueInSoftwareObject" ) );
    $const16$subLIdentifier = constant_handles.reader_make_constant_shell( makeString( "subLIdentifier" ) );
    $const17$CycAPIMt = constant_handles.reader_make_constant_shell( makeString( "CycAPIMt" ) );
    $const18$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $const19$alternateSoftwareParameterValueIn = constant_handles.reader_make_constant_shell( makeString( "alternateSoftwareParameterValueInSoftwareObject" ) );
    $const20$softwareParameterValueDomainInSof = constant_handles.reader_make_constant_shell( makeString( "softwareParameterValueDomainInSoftwareObject" ) );
    $const21$softwareParameterValueShortDescri = constant_handles.reader_make_constant_shell( makeString( "softwareParameterValueShortDescription" ) );
    $const22$softwareParameterValueLongDescrip = constant_handles.reader_make_constant_shell( makeString( "softwareParameterValueLongDescription" ) );
  }
}
/*
 * 
 * Total time: 96 ms
 * 
 */