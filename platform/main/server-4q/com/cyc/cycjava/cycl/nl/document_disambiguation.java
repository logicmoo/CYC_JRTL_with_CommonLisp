package com.cyc.cycjava.cycl.nl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.nl_api_datastructures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.document;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class document_disambiguation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl.document_disambiguation";
  public static final String myFingerPrint = "e9d26c22fb9ea0d829f5fd52fdb8716d9ceb5fda179213fcf9499293a1750358";
  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 925L)
  public static SubLSymbol $dtp_simple_disambiguator$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 1586L)
  public static SubLSymbol $document_disambiguate_method_table$;
  private static final SubLSymbol $sym0$SIMPLE_DISAMBIGUATOR;
  private static final SubLSymbol $sym1$SIMPLE_DISAMBIGUATOR_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$SDIS_PRINT;
  private static final SubLSymbol $sym7$SIMPLE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$SDIS_MIN_STRENGTH;
  private static final SubLSymbol $sym10$_CSETF_SDIS_MIN_STRENGTH;
  private static final SubLSymbol $kw11$MIN_STRENGTH;
  private static final SubLString $str12$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw13$BEGIN;
  private static final SubLSymbol $sym14$MAKE_SIMPLE_DISAMBIGUATOR;
  private static final SubLSymbol $kw15$SLOT;
  private static final SubLSymbol $kw16$END;
  private static final SubLSymbol $sym17$VISIT_DEFSTRUCT_OBJECT_SIMPLE_DISAMBIGUATOR_METHOD;
  private static final SubLString $str18$__SIMPLE_DISAMBIGUATOR_;
  private static final SubLString $str19$_;
  private static final SubLInteger $int20$256;
  private static final SubLSymbol $kw21$INTERPS;
  private static final SubLSymbol $sym22$DOCUMENT_DISAMBIGUATE_SIMPLE_DISAMBIGUATOR_METHOD;
  private static final SubLObject $const23$ContextuallyDependentLexicalMappi;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLObject $const26$PrimaryLexicalMapping;

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 925L)
  public static SubLObject simple_disambiguator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    sdis_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 925L)
  public static SubLObject simple_disambiguator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $simple_disambiguator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 925L)
  public static SubLObject sdis_min_strength(final SubLObject v_object)
  {
    assert NIL != simple_disambiguator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 925L)
  public static SubLObject _csetf_sdis_min_strength(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != simple_disambiguator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 925L)
  public static SubLObject make_simple_disambiguator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $simple_disambiguator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw11$MIN_STRENGTH ) )
      {
        _csetf_sdis_min_strength( v_new, current_value );
      }
      else
      {
        Errors.error( $str12$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 925L)
  public static SubLObject visit_defstruct_simple_disambiguator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw13$BEGIN, $sym14$MAKE_SIMPLE_DISAMBIGUATOR, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw15$SLOT, $kw11$MIN_STRENGTH, sdis_min_strength( obj ) );
    Functions.funcall( visitor_fn, obj, $kw16$END, $sym14$MAKE_SIMPLE_DISAMBIGUATOR, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 925L)
  public static SubLObject visit_defstruct_object_simple_disambiguator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_simple_disambiguator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 1132L)
  public static SubLObject new_simple_disambiguator(final SubLObject min_strength)
  {
    final SubLObject disambiguator = make_simple_disambiguator( UNPROVIDED );
    _csetf_sdis_min_strength( disambiguator, min_strength );
    return disambiguator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 1327L)
  public static SubLObject sdis_print(final SubLObject sdis, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str18$__SIMPLE_DISAMBIGUATOR_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( string_utilities.to_string( sdis_min_strength( sdis ) ), stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str19$_, stream, UNPROVIDED, UNPROVIDED );
    return sdis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 1586L)
  public static SubLObject document_disambiguate(final SubLObject disambiguator, final SubLObject doc, SubLObject v_context)
  {
    if( v_context == UNPROVIDED )
    {
      v_context = NIL;
    }
    final SubLObject method_function = Structures.method_func( disambiguator, $document_disambiguate_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, disambiguator, doc, v_context );
    }
    return doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 1708L)
  public static SubLObject document_disambiguate_simple_disambiguator_method(final SubLObject disambiguator, final SubLObject doc, SubLObject v_context)
  {
    if( v_context == UNPROVIDED )
    {
      v_context = NIL;
    }
    final SubLObject vector_var = document.document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$1;
    SubLObject backwardP_var_$2;
    SubLObject length_$3;
    SubLObject v_iteration_$4;
    SubLObject element_num_$5;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    SubLObject interps;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$1 = document.paragraph_sentences( paragraph );
      backwardP_var_$2 = NIL;
      for( length_$3 = Sequences.length( vector_var_$1 ), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL( length_$3 ); v_iteration_$4 = Numbers.add( v_iteration_$4, ONE_INTEGER ) )
      {
        element_num_$5 = ( ( NIL != backwardP_var_$2 ) ? Numbers.subtract( length_$3, v_iteration_$4, ONE_INTEGER ) : v_iteration_$4 );
        sentence = Vectors.aref( vector_var_$1, element_num_$5 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          interps = document.word_interps( word );
          conses_high.putf( document.word_info( word ), $kw21$INTERPS, interps_meeting_threshold( sdis_min_strength( disambiguator ), interps ) );
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 2024L)
  public static SubLObject interps_meeting_threshold(final SubLObject threshold, final SubLObject interps)
  {
    SubLObject ret_list = NIL;
    SubLObject cdolist_list_var = interps;
    SubLObject interp = NIL;
    interp = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pragmatics = nl_api_datastructures.get_nl_interp_pragmatics( interp );
      final SubLObject invalid_strengths = get_invalid_strengths_for_threshold( threshold );
      SubLObject invalidP = NIL;
      if( NIL == invalidP )
      {
        SubLObject csome_list_var = invalid_strengths;
        SubLObject strength = NIL;
        strength = csome_list_var.first();
        while ( NIL == invalidP && NIL != csome_list_var)
        {
          if( NIL != list_utilities.tree_find( strength, pragmatics, UNPROVIDED, UNPROVIDED ) )
          {
            invalidP = T;
          }
          csome_list_var = csome_list_var.rest();
          strength = csome_list_var.first();
        }
      }
      if( NIL == invalidP )
      {
        ret_list = ConsesLow.cons( interp, ret_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      interp = cdolist_list_var.first();
    }
    return Sequences.nreverse( ret_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/document-disambiguation.lisp", position = 2491L)
  public static SubLObject get_invalid_strengths_for_threshold(final SubLObject threshold_strength)
  {
    if( threshold_strength.eql( $const23$ContextuallyDependentLexicalMappi ) )
    {
      return $list24;
    }
    if( threshold_strength.equal( NIL ) )
    {
      return $list25;
    }
    if( threshold_strength.equal( $const26$PrimaryLexicalMapping ) )
    {
      return $list25;
    }
    return NIL;
  }

  public static SubLObject declare_document_disambiguation_file()
  {
    SubLFiles.declareFunction( me, "simple_disambiguator_print_function_trampoline", "SIMPLE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_disambiguator_p", "SIMPLE-DISAMBIGUATOR-P", 1, 0, false );
    new $simple_disambiguator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sdis_min_strength", "SDIS-MIN-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sdis_min_strength", "_CSETF-SDIS-MIN-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "make_simple_disambiguator", "MAKE-SIMPLE-DISAMBIGUATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_simple_disambiguator", "VISIT-DEFSTRUCT-SIMPLE-DISAMBIGUATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_simple_disambiguator_method", "VISIT-DEFSTRUCT-OBJECT-SIMPLE-DISAMBIGUATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_simple_disambiguator", "NEW-SIMPLE-DISAMBIGUATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sdis_print", "SDIS-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "document_disambiguate", "DOCUMENT-DISAMBIGUATE", 2, 1, false );
    SubLFiles.declareFunction( me, "document_disambiguate_simple_disambiguator_method", "DOCUMENT-DISAMBIGUATE-SIMPLE-DISAMBIGUATOR-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "interps_meeting_threshold", "INTERPS-MEETING-THRESHOLD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_invalid_strengths_for_threshold", "GET-INVALID-STRENGTHS-FOR-THRESHOLD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_document_disambiguation_file()
  {
    $dtp_simple_disambiguator$ = SubLFiles.defconstant( "*DTP-SIMPLE-DISAMBIGUATOR*", $sym0$SIMPLE_DISAMBIGUATOR );
    $document_disambiguate_method_table$ = SubLFiles.deflexical( "*DOCUMENT-DISAMBIGUATE-METHOD-TABLE*", Vectors.make_vector( $int20$256, NIL ) );
    return NIL;
  }

  public static SubLObject setup_document_disambiguation_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_simple_disambiguator$.getGlobalValue(), Symbols.symbol_function( $sym7$SIMPLE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$SDIS_MIN_STRENGTH, $sym10$_CSETF_SDIS_MIN_STRENGTH );
    Equality.identity( $sym0$SIMPLE_DISAMBIGUATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_simple_disambiguator$.getGlobalValue(), Symbols.symbol_function(
        $sym17$VISIT_DEFSTRUCT_OBJECT_SIMPLE_DISAMBIGUATOR_METHOD ) );
    Structures.register_method( $document_disambiguate_method_table$.getGlobalValue(), $dtp_simple_disambiguator$.getGlobalValue(), Symbols.symbol_function( $sym22$DOCUMENT_DISAMBIGUATE_SIMPLE_DISAMBIGUATOR_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_document_disambiguation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_document_disambiguation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_document_disambiguation_file();
  }
  static
  {
    me = new document_disambiguation();
    $dtp_simple_disambiguator$ = null;
    $document_disambiguate_method_table$ = null;
    $sym0$SIMPLE_DISAMBIGUATOR = makeSymbol( "SIMPLE-DISAMBIGUATOR" );
    $sym1$SIMPLE_DISAMBIGUATOR_P = makeSymbol( "SIMPLE-DISAMBIGUATOR-P" );
    $list2 = ConsesLow.list( makeSymbol( "MIN-STRENGTH" ) );
    $list3 = ConsesLow.list( makeKeyword( "MIN-STRENGTH" ) );
    $list4 = ConsesLow.list( makeSymbol( "SDIS-MIN-STRENGTH" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-SDIS-MIN-STRENGTH" ) );
    $sym6$SDIS_PRINT = makeSymbol( "SDIS-PRINT" );
    $sym7$SIMPLE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SIMPLE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SIMPLE-DISAMBIGUATOR-P" ) );
    $sym9$SDIS_MIN_STRENGTH = makeSymbol( "SDIS-MIN-STRENGTH" );
    $sym10$_CSETF_SDIS_MIN_STRENGTH = makeSymbol( "_CSETF-SDIS-MIN-STRENGTH" );
    $kw11$MIN_STRENGTH = makeKeyword( "MIN-STRENGTH" );
    $str12$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw13$BEGIN = makeKeyword( "BEGIN" );
    $sym14$MAKE_SIMPLE_DISAMBIGUATOR = makeSymbol( "MAKE-SIMPLE-DISAMBIGUATOR" );
    $kw15$SLOT = makeKeyword( "SLOT" );
    $kw16$END = makeKeyword( "END" );
    $sym17$VISIT_DEFSTRUCT_OBJECT_SIMPLE_DISAMBIGUATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SIMPLE-DISAMBIGUATOR-METHOD" );
    $str18$__SIMPLE_DISAMBIGUATOR_ = makeString( "#<SIMPLE-DISAMBIGUATOR " );
    $str19$_ = makeString( ">" );
    $int20$256 = makeInteger( 256 );
    $kw21$INTERPS = makeKeyword( "INTERPS" );
    $sym22$DOCUMENT_DISAMBIGUATE_SIMPLE_DISAMBIGUATOR_METHOD = makeSymbol( "DOCUMENT-DISAMBIGUATE-SIMPLE-DISAMBIGUATOR-METHOD" );
    $const23$ContextuallyDependentLexicalMappi = constant_handles.reader_make_constant_shell( makeString( "ContextuallyDependentLexicalMapping" ) );
    $list24 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "VanishinglyRareLexicalMapping" ) ) );
    $list25 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "VanishinglyRareLexicalMapping" ) ), constant_handles.reader_make_constant_shell( makeString(
        "ContextuallyDependentLexicalMapping" ) ) );
    $const26$PrimaryLexicalMapping = constant_handles.reader_make_constant_shell( makeString( "PrimaryLexicalMapping" ) );
  }

  public static final class $simple_disambiguator_native
      extends
        SubLStructNative
  {
    public SubLObject $min_strength;
    private static final SubLStructDeclNative structDecl;

    public $simple_disambiguator_native()
    {
      this.$min_strength = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $simple_disambiguator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$min_strength;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$min_strength = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $simple_disambiguator_native.class, $sym0$SIMPLE_DISAMBIGUATOR, $sym1$SIMPLE_DISAMBIGUATOR_P, $list2, $list3, new String[] { "$min_strength"
      }, $list4, $list5, $sym6$SDIS_PRINT );
    }
  }

  public static final class $simple_disambiguator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $simple_disambiguator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SIMPLE-DISAMBIGUATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return simple_disambiguator_p( arg1 );
    }
  }
}
/*
 *
 * Total time: 127 ms
 *
 */