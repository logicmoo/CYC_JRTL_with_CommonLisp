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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subcyclifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subcyclifier";
  public static final String myFingerPrint = "1a52cdac748c469de4d3d2df790c311e2fdac9b16423af009d40d9ad0051083f";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3298L)
  public static SubLSymbol $dtp_cyclifier_pool$;
  private static final SubLSymbol $sym0$SUBCYCLIFIER;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$PROGN;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$DATE_CYCLIFIER;
  private static final SubLSymbol $sym5$OBJECT;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$INSTANCE_COUNT;
  private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS;
  private static final SubLSymbol $sym10$ISOLATED_P;
  private static final SubLSymbol $sym11$INSTANCE_NUMBER;
  private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE;
  private static final SubLSymbol $sym13$APPLICABLE_P;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$GET_SISTER;
  private static final SubLSymbol $sym18$DATE_CYCLIFIER_APPLICABLE_P_METHOD;
  private static final SubLSymbol $sym19$CYCLIFY;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$GET_REFS;
  private static final SubLSymbol $sym22$GET_STRING;
  private static final SubLObject $const23$equals;
  private static final SubLSymbol $sym24$DATE_CYCLIFIER_CYCLIFY_METHOD;
  private static final SubLSymbol $sym25$CYCLIFIER_POOL;
  private static final SubLSymbol $sym26$CYCLIFIER_POOL_P;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$CYCLIFIER_POOL_PRINT;
  private static final SubLSymbol $sym32$CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$CYCLIFIER_POOL_CYCLIFIERS;
  private static final SubLSymbol $sym35$_CSETF_CYCLIFIER_POOL_CYCLIFIERS;
  private static final SubLSymbol $kw36$CYCLIFIERS;
  private static final SubLString $str37$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw38$BEGIN;
  private static final SubLSymbol $sym39$MAKE_CYCLIFIER_POOL;
  private static final SubLSymbol $kw40$SLOT;
  private static final SubLSymbol $kw41$END;
  private static final SubLSymbol $sym42$VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD;
  private static final SubLString $str43$__CYCLIFIER_POOL__;
  private static final SubLString $str44$_;
  private static final SubLSymbol $sym45$LISTP;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1586L)
  public static SubLObject subcyclifier_p(final SubLObject v_subcyclifier)
  {
    return interfaces.subloop_instanceof_interface( v_subcyclifier, $sym0$SUBCYCLIFIER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1839L)
  public static SubLObject with_subcyclifier_assistance(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$PROGN, $list3, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2098L)
  public static SubLObject subcyclifier_cyclify(final SubLObject tree)
  {
    final SubLObject pool = cyclifier.get_subcyclifier_pool( tree );
    if( NIL != pool )
    {
      return cyclifier_pool_cyclify( pool, tree );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2251L)
  public static SubLObject subloop_reserved_initialize_date_cyclifier_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym8$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2251L)
  public static SubLObject subloop_reserved_initialize_date_cyclifier_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym10$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym11$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2251L)
  public static SubLObject date_cyclifier_p(final SubLObject date_cyclifier)
  {
    return classes.subloop_instanceof_class( date_cyclifier, $sym4$DATE_CYCLIFIER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2455L)
  public static SubLObject date_cyclifier_applicable_p_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( NIL != cyclifier_interface.cyclifiable_noun_phrase_p( tree ) && NIL != methods.funcall_instance_method_with_1_args( tree, $sym17$GET_SISTER, MINUS_ONE_INTEGER ) && NIL != cyclifier_interface
        .prepositional_or_particle_word_p( methods.funcall_instance_method_with_1_args( tree, $sym17$GET_SISTER, MINUS_ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2842L)
  public static SubLObject date_cyclifier_cyclify_method(final SubLObject self, final SubLObject tree)
  {
    if( NIL != methods.funcall_instance_method_with_1_args( self, $sym13$APPLICABLE_P, tree ) )
    {
      final SubLObject ref = methods.funcall_instance_method_with_0_args( tree, $sym21$GET_REFS ).first();
      final SubLObject dates0 = ( NIL != ref ) ? date_utilities.parse_date_from_string( methods.funcall_instance_method_with_0_args( tree, $sym22$GET_STRING ) ) : NIL;
      SubLObject dates2 = NIL;
      SubLObject cdolist_list_var = dates0;
      SubLObject date = NIL;
      date = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        dates2 = ConsesLow.cons( ConsesLow.list( $const23$equals, ref, date ), dates2 );
        cdolist_list_var = cdolist_list_var.rest();
        date = cdolist_list_var.first();
      }
      return dates2;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3298L)
  public static SubLObject cyclifier_pool_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    cyclifier_pool_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3298L)
  public static SubLObject cyclifier_pool_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cyclifier_pool_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3298L)
  public static SubLObject cyclifier_pool_cyclifiers(final SubLObject v_object)
  {
    assert NIL != cyclifier_pool_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3298L)
  public static SubLObject _csetf_cyclifier_pool_cyclifiers(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyclifier_pool_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3298L)
  public static SubLObject make_cyclifier_pool(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cyclifier_pool_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw36$CYCLIFIERS ) )
      {
        _csetf_cyclifier_pool_cyclifiers( v_new, current_value );
      }
      else
      {
        Errors.error( $str37$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3298L)
  public static SubLObject visit_defstruct_cyclifier_pool(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw38$BEGIN, $sym39$MAKE_CYCLIFIER_POOL, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw40$SLOT, $kw36$CYCLIFIERS, cyclifier_pool_cyclifiers( obj ) );
    Functions.funcall( visitor_fn, obj, $kw41$END, $sym39$MAKE_CYCLIFIER_POOL, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3298L)
  public static SubLObject visit_defstruct_object_cyclifier_pool_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cyclifier_pool( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3435L)
  public static SubLObject cyclifier_pool_print(final SubLObject pool, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str43$__CYCLIFIER_POOL__, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( cyclifier_pool_cyclifiers( pool ), stream );
    streams_high.write_string( $str44$_, stream, UNPROVIDED, UNPROVIDED );
    return pool;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3691L)
  public static SubLObject new_cyclifier_pool(final SubLObject cyclifiers)
  {
    assert NIL != Types.listp( cyclifiers ) : cyclifiers;
    final SubLObject pool = make_cyclifier_pool( UNPROVIDED );
    SubLObject cdolist_list_var = Sequences.reverse( cyclifiers );
    SubLObject v_cyclifier = NIL;
    v_cyclifier = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cyclifier_pool_add( pool, v_cyclifier );
      cdolist_list_var = cdolist_list_var.rest();
      v_cyclifier = cdolist_list_var.first();
    }
    return pool;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4066L)
  public static SubLObject cyclifier_pool_add(final SubLObject pool, final SubLObject v_cyclifier)
  {
    assert NIL != cyclifier_pool_p( pool ) : pool;
    _csetf_cyclifier_pool_cyclifiers( pool, ConsesLow.cons( v_cyclifier, cyclifier_pool_cyclifiers( pool ) ) );
    return pool;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4342L)
  public static SubLObject cyclifier_pool_cyclify(final SubLObject pool, final SubLObject v_object)
  {
    assert NIL != cyclifier_pool_p( pool ) : pool;
    SubLObject result = NIL;
    if( NIL == result )
    {
      SubLObject csome_list_var = cyclifier_pool_cyclifiers( pool );
      SubLObject v_cyclifier = NIL;
      v_cyclifier = csome_list_var.first();
      while ( NIL == result && NIL != csome_list_var)
      {
        if( NIL != methods.funcall_instance_method_with_1_args( v_cyclifier, $sym13$APPLICABLE_P, v_object ) )
        {
          result = methods.funcall_instance_method_with_1_args( v_cyclifier, $sym19$CYCLIFY, v_object );
        }
        csome_list_var = csome_list_var.rest();
        v_cyclifier = csome_list_var.first();
      }
    }
    return result;
  }

  public static SubLObject declare_subcyclifier_file()
  {
    SubLFiles.declareFunction( me, "subcyclifier_p", "SUBCYCLIFIER-P", 1, 0, false );
    SubLFiles.declareMacro( me, "with_subcyclifier_assistance", "WITH-SUBCYCLIFIER-ASSISTANCE" );
    SubLFiles.declareFunction( me, "subcyclifier_cyclify", "SUBCYCLIFIER-CYCLIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_date_cyclifier_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_date_cyclifier_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "date_cyclifier_p", "DATE-CYCLIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "date_cyclifier_applicable_p_method", "DATE-CYCLIFIER-APPLICABLE-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "date_cyclifier_cyclify_method", "DATE-CYCLIFIER-CYCLIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_pool_print_function_trampoline", "CYCLIFIER-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_pool_p", "CYCLIFIER-POOL-P", 1, 0, false );
    new $cyclifier_pool_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cyclifier_pool_cyclifiers", "CYCLIFIER-POOL-CYCLIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cyclifier_pool_cyclifiers", "_CSETF-CYCLIFIER-POOL-CYCLIFIERS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cyclifier_pool", "MAKE-CYCLIFIER-POOL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cyclifier_pool", "VISIT-DEFSTRUCT-CYCLIFIER-POOL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cyclifier_pool_method", "VISIT-DEFSTRUCT-OBJECT-CYCLIFIER-POOL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_pool_print", "CYCLIFIER-POOL-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "new_cyclifier_pool", "NEW-CYCLIFIER-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_pool_add", "CYCLIFIER-POOL-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "cyclifier_pool_cyclify", "CYCLIFIER-POOL-CYCLIFY", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_subcyclifier_file()
  {
    $dtp_cyclifier_pool$ = SubLFiles.defconstant( "*DTP-CYCLIFIER-POOL*", $sym25$CYCLIFIER_POOL );
    return NIL;
  }

  public static SubLObject setup_subcyclifier_file()
  {
    interfaces.new_interface( $sym0$SUBCYCLIFIER, NIL, NIL, $list1 );
    classes.subloop_new_class( $sym4$DATE_CYCLIFIER, $sym5$OBJECT, $list6, NIL, $list7 );
    classes.class_set_implements_slot_listeners( $sym4$DATE_CYCLIFIER, NIL );
    classes.subloop_note_class_initialization_function( $sym4$DATE_CYCLIFIER, $sym9$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym4$DATE_CYCLIFIER, $sym12$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE );
    subloop_reserved_initialize_date_cyclifier_class( $sym4$DATE_CYCLIFIER );
    methods.methods_incorporate_instance_method( $sym13$APPLICABLE_P, $sym4$DATE_CYCLIFIER, $list14, $list15, $list16 );
    methods.subloop_register_instance_method( $sym4$DATE_CYCLIFIER, $sym13$APPLICABLE_P, $sym18$DATE_CYCLIFIER_APPLICABLE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym19$CYCLIFY, $sym4$DATE_CYCLIFIER, $list14, $list15, $list20 );
    methods.subloop_register_instance_method( $sym4$DATE_CYCLIFIER, $sym19$CYCLIFY, $sym24$DATE_CYCLIFIER_CYCLIFY_METHOD );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cyclifier_pool$.getGlobalValue(), Symbols.symbol_function( $sym32$CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list33 );
    Structures.def_csetf( $sym34$CYCLIFIER_POOL_CYCLIFIERS, $sym35$_CSETF_CYCLIFIER_POOL_CYCLIFIERS );
    Equality.identity( $sym25$CYCLIFIER_POOL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyclifier_pool$.getGlobalValue(), Symbols.symbol_function( $sym42$VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subcyclifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subcyclifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subcyclifier_file();
  }
  static
  {
    me = new subcyclifier();
    $dtp_cyclifier_pool$ = null;
    $sym0$SUBCYCLIFIER = makeSymbol( "SUBCYCLIFIER" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPLICABLE-P" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "CYCLIFY" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ) );
    $sym2$PROGN = makeSymbol( "PROGN" );
    $list3 = ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POOL" ), ConsesLow.list( makeSymbol( "GET-SUBCYCLIFIER-POOL" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
        "CYCLS" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "POOL" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "CYCLIFIER-POOL-CYCLIFY" ), makeSymbol(
            "POOL" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CYCLS" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCLS" ) ) ) ) );
    $sym4$DATE_CYCLIFIER = makeSymbol( "DATE-CYCLIFIER" );
    $sym5$OBJECT = makeSymbol( "OBJECT" );
    $list6 = ConsesLow.list( makeSymbol( "SUBCYCLIFIER" ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPLICABLE-P" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "CYCLIFY" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym8$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym9$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-CLASS" );
    $sym10$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym11$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym12$SUBLOOP_RESERVED_INITIALIZE_DATE_CYCLIFIER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DATE-CYCLIFIER-INSTANCE" );
    $sym13$APPLICABLE_P = makeSymbol( "APPLICABLE-P" );
    $list14 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list15 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list16 = ConsesLow.list( makeString( "@param TREE parse-tree-interface-p; the tree to be checked for applicability of this cyclifier\n   @return booleanp; t if this cyclifier can cyclify TREE, nil otherwise" ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CYCLIFIABLE-NOUN-PHRASE-P" ), makeSymbol( "TREE" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), MINUS_ONE_INTEGER ), ConsesLow.list( makeSymbol( "PREPOSITIONAL-OR-PARTICLE-WORD-P" ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), MINUS_ONE_INTEGER ) ) ) ) );
    $sym17$GET_SISTER = makeSymbol( "GET-SISTER" );
    $sym18$DATE_CYCLIFIER_APPLICABLE_P_METHOD = makeSymbol( "DATE-CYCLIFIER-APPLICABLE-P-METHOD" );
    $sym19$CYCLIFY = makeSymbol( "CYCLIFY" );
    $list20 = ConsesLow.list( makeString( "@param TREE parse-tree-interface-p; the tree that needs cyclification\n   @return listp; a list of cycl translations of TREE" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
        .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "APPLICABLE-P" ) ), makeSymbol( "TREE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
            .list( makeSymbol( "REF" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ), ConsesLow
                .list( makeSymbol( "DATES0" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "REF" ), ConsesLow.list( makeSymbol( "PARSE-DATE-FROM-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                    "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "DATES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                        makeSymbol( "DATE" ), makeSymbol( "DATES0" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ),
                            makeSymbol( "REF" ), makeSymbol( "DATE" ) ), makeSymbol( "DATES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DATES" ) ) ) ) );
    $sym21$GET_REFS = makeSymbol( "GET-REFS" );
    $sym22$GET_STRING = makeSymbol( "GET-STRING" );
    $const23$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $sym24$DATE_CYCLIFIER_CYCLIFY_METHOD = makeSymbol( "DATE-CYCLIFIER-CYCLIFY-METHOD" );
    $sym25$CYCLIFIER_POOL = makeSymbol( "CYCLIFIER-POOL" );
    $sym26$CYCLIFIER_POOL_P = makeSymbol( "CYCLIFIER-POOL-P" );
    $list27 = ConsesLow.list( makeSymbol( "CYCLIFIERS" ) );
    $list28 = ConsesLow.list( makeKeyword( "CYCLIFIERS" ) );
    $list29 = ConsesLow.list( makeSymbol( "CYCLIFIER-POOL-CYCLIFIERS" ) );
    $list30 = ConsesLow.list( makeSymbol( "_CSETF-CYCLIFIER-POOL-CYCLIFIERS" ) );
    $sym31$CYCLIFIER_POOL_PRINT = makeSymbol( "CYCLIFIER-POOL-PRINT" );
    $sym32$CYCLIFIER_POOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CYCLIFIER-POOL-PRINT-FUNCTION-TRAMPOLINE" );
    $list33 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CYCLIFIER-POOL-P" ) );
    $sym34$CYCLIFIER_POOL_CYCLIFIERS = makeSymbol( "CYCLIFIER-POOL-CYCLIFIERS" );
    $sym35$_CSETF_CYCLIFIER_POOL_CYCLIFIERS = makeSymbol( "_CSETF-CYCLIFIER-POOL-CYCLIFIERS" );
    $kw36$CYCLIFIERS = makeKeyword( "CYCLIFIERS" );
    $str37$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw38$BEGIN = makeKeyword( "BEGIN" );
    $sym39$MAKE_CYCLIFIER_POOL = makeSymbol( "MAKE-CYCLIFIER-POOL" );
    $kw40$SLOT = makeKeyword( "SLOT" );
    $kw41$END = makeKeyword( "END" );
    $sym42$VISIT_DEFSTRUCT_OBJECT_CYCLIFIER_POOL_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CYCLIFIER-POOL-METHOD" );
    $str43$__CYCLIFIER_POOL__ = makeString( "#<CYCLIFIER-POOL: " );
    $str44$_ = makeString( ">" );
    $sym45$LISTP = makeSymbol( "LISTP" );
  }

  public static final class $cyclifier_pool_native
      extends
        SubLStructNative
  {
    public SubLObject $cyclifiers;
    private static final SubLStructDeclNative structDecl;

    public $cyclifier_pool_native()
    {
      this.$cyclifiers = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cyclifier_pool_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$cyclifiers;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$cyclifiers = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cyclifier_pool_native.class, $sym25$CYCLIFIER_POOL, $sym26$CYCLIFIER_POOL_P, $list27, $list28, new String[] { "$cyclifiers"
      }, $list29, $list30, $sym31$CYCLIFIER_POOL_PRINT );
    }
  }

  public static final class $cyclifier_pool_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cyclifier_pool_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CYCLIFIER-POOL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cyclifier_pool_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 169 ms
 * 
 */