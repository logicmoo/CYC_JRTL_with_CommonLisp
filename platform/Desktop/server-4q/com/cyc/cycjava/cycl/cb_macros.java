package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_macros";
  public static final String myFingerPrint = "81cdde1274be1320f3dd6ecaefd5732aa8708fed42f44258918c038c39435cca";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$RESULT;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$CSETQ;
  private static final SubLSymbol $sym4$PROGN;
  private static final SubLSymbol $sym5$FOO;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$1_;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$NEW_VALUE;
  private static final SubLString $str10$SET__A;
  private static final SubLSymbol $sym11$DEFPARAMETER_HTML;
  private static final SubLSymbol $sym12$DEFINE;
  private static final SubLString $str13$Accessor_for__A;
  private static final SubLSymbol $sym14$RET;
  private static final SubLString $str15$Set_function_for__A;
  private static final SubLList $list16;
  private static final SubLString $str17$_CB_USE__A_;
  private static final SubLString $str18$_CB__A_;
  private static final SubLSymbol $sym19$DEFFILTERVAR;
  private static final SubLString $str20$Should_we_use_the_content_of__A__;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $kw27$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw28$MAX_RESULTS;
  private static final SubLInteger $int29$50;
  private static final SubLSymbol $kw30$MIN_QUERY_LENGTH;
  private static final SubLSymbol $kw31$EMBEDDED_IN_TOOLBAR_FRAME_;
  private static final SubLSymbol $kw32$FILTER_TERM;
  private static final SubLObject $const33$Thing;
  private static final SubLSymbol $sym34$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT;

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 585L)
  public static SubLObject extract_keyword(final SubLObject key, final SubLObject arglist, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLObject binding = conses_high.member( key, arglist, UNPROVIDED, UNPROVIDED );
    if( NIL != binding.rest() )
    {
      return conses_high.cadr( binding );
    }
    return v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 1229L)
  public static SubLObject cprog1(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject answer_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    answer_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject result = $sym1$RESULT;
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( result, body.first() ) ), ConsesLow.append( body.rest(), ConsesLow.list( ConsesLow.list( $sym3$CSETQ, answer_var, result ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 1524L)
  public static SubLObject progfoo(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$PROGN, ConsesLow.list( $sym3$CSETQ, $sym5$FOO, body.first() ), ConsesLow.append( body.rest(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 1789L)
  public static SubLObject cprogfoo(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym5$FOO, body.first() ) ), ConsesLow.append( body.rest(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 2053L)
  public static SubLObject cprogn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject answer_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    answer_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return reader.bq_cons( $sym4$PROGN, ConsesLow.append( conses_high.butlast( body, UNPROVIDED ), ConsesLow.list( ConsesLow.list( $sym3$CSETQ, answer_var, conses_high.last( body, UNPROVIDED ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 2341L)
  public static SubLObject cincf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    place = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym3$CSETQ, place, ConsesLow.list( $sym7$1_, place ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 2403L)
  public static SubLObject deffiltervar(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    SubLObject initval = NIL;
    SubLObject comment = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    initval = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    comment = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject new_value = $sym9$NEW_VALUE;
      final SubLObject varname = Strings.string( var );
      final SubLObject getter_name = Sequences.subseq( varname, ONE_INTEGER, number_utilities.f_1_( Sequences.length( varname ) ) );
      final SubLObject getter = Packages.intern( getter_name, UNPROVIDED );
      final SubLObject setter = Packages.intern( PrintLow.format( NIL, $str10$SET__A, getter_name ), UNPROVIDED );
      return ConsesLow.list( $sym4$PROGN, ConsesLow.list( $sym11$DEFPARAMETER_HTML, var, initval, comment ), ConsesLow.list( $sym12$DEFINE, getter, NIL, PrintLow.format( NIL, $str13$Accessor_for__A, varname ), ConsesLow
          .list( $sym14$RET, var ) ), ConsesLow.list( $sym12$DEFINE, setter, ConsesLow.list( new_value ), PrintLow.format( NIL, $str15$Set_function_for__A, varname ), ConsesLow.list( $sym3$CSETQ, var, new_value ),
              ConsesLow.list( $sym14$RET, var ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 3424L)
  public static SubLObject deffilterset(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject root = NIL;
    SubLObject initval = NIL;
    SubLObject comment = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    root = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    initval = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    comment = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject use_p = Packages.intern( PrintLow.format( NIL, $str17$_CB_USE__A_, Strings.string_upcase( Strings.string( root ), UNPROVIDED, UNPROVIDED ) ), UNPROVIDED );
      final SubLObject filter_params = PrintLow.format( NIL, $str18$_CB__A_, Strings.string_upcase( Strings.string( root ), UNPROVIDED, UNPROVIDED ) );
      return ConsesLow.list( $sym4$PROGN, ConsesLow.list( $sym19$DEFFILTERVAR, use_p, NIL, PrintLow.format( NIL, $str20$Should_we_use_the_content_of__A__, Strings.string_downcase( filter_params, UNPROVIDED,
          UNPROVIDED ) ) ), ConsesLow.list( $sym19$DEFFILTERVAR, Packages.intern( filter_params, UNPROVIDED ), initval, comment ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list16 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 3917L)
  public static SubLObject browsing_new_forward_inference(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject triggering_assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    triggering_assertion = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym2$CLET, $list22, ConsesLow.list( $sym23$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, triggering_assertion ), ConsesLow.append( body, $list24 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-macros.lisp", position = 4483L)
  public static SubLObject html_print_js_autocomplete_setup(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject input_elt_name = NIL;
    SubLObject container_elt_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    input_elt_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    container_elt_name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list25 );
      if( NIL == conses_high.member( current_$1, $list26, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw27$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    }
    final SubLObject max_results_tail = cdestructuring_bind.property_list_member( $kw28$MAX_RESULTS, current );
    final SubLObject max_results = ( NIL != max_results_tail ) ? conses_high.cadr( max_results_tail ) : $int29$50;
    final SubLObject min_query_length_tail = cdestructuring_bind.property_list_member( $kw30$MIN_QUERY_LENGTH, current );
    final SubLObject min_query_length = ( NIL != min_query_length_tail ) ? conses_high.cadr( min_query_length_tail ) : THREE_INTEGER;
    final SubLObject embedded_in_toolbar_frameP_tail = cdestructuring_bind.property_list_member( $kw31$EMBEDDED_IN_TOOLBAR_FRAME_, current );
    final SubLObject embedded_in_toolbar_frameP = ( NIL != embedded_in_toolbar_frameP_tail ) ? conses_high.cadr( embedded_in_toolbar_frameP_tail ) : NIL;
    final SubLObject filter_term_tail = cdestructuring_bind.property_list_member( $kw32$FILTER_TERM, current );
    final SubLObject filter_term = ( NIL != filter_term_tail ) ? conses_high.cadr( filter_term_tail ) : $const33$Thing;
    return ConsesLow.list( $sym34$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT, input_elt_name, container_elt_name, max_results, min_query_length, embedded_in_toolbar_frameP, filter_term );
  }

  public static SubLObject declare_cb_macros_file()
  {
    SubLFiles.declareFunction( me, "extract_keyword", "EXTRACT-KEYWORD", 2, 1, false );
    SubLFiles.declareMacro( me, "cprog1", "CPROG1" );
    SubLFiles.declareMacro( me, "progfoo", "PROGFOO" );
    SubLFiles.declareMacro( me, "cprogfoo", "CPROGFOO" );
    SubLFiles.declareMacro( me, "cprogn", "CPROGN" );
    SubLFiles.declareMacro( me, "cincf", "CINCF" );
    SubLFiles.declareMacro( me, "deffiltervar", "DEFFILTERVAR" );
    SubLFiles.declareMacro( me, "deffilterset", "DEFFILTERSET" );
    SubLFiles.declareMacro( me, "browsing_new_forward_inference", "BROWSING-NEW-FORWARD-INFERENCE" );
    SubLFiles.declareMacro( me, "html_print_js_autocomplete_setup", "HTML-PRINT-JS-AUTOCOMPLETE-SETUP" );
    return NIL;
  }

  public static SubLObject init_cb_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_macros_file();
  }
  static
  {
    me = new cb_macros();
    $list0 = ConsesLow.list( makeSymbol( "ANSWER-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$RESULT = makeUninternedSymbol( "RESULT" );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$CSETQ = makeSymbol( "CSETQ" );
    $sym4$PROGN = makeSymbol( "PROGN" );
    $sym5$FOO = makeSymbol( "FOO" );
    $list6 = ConsesLow.list( makeSymbol( "PLACE" ) );
    $sym7$1_ = makeSymbol( "1+" );
    $list8 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "INITVAL" ), makeSymbol( "COMMENT" ) );
    $sym9$NEW_VALUE = makeUninternedSymbol( "NEW-VALUE" );
    $str10$SET__A = makeString( "SET-~A" );
    $sym11$DEFPARAMETER_HTML = makeSymbol( "DEFPARAMETER-HTML" );
    $sym12$DEFINE = makeSymbol( "DEFINE" );
    $str13$Accessor_for__A = makeString( "Accessor for ~A" );
    $sym14$RET = makeSymbol( "RET" );
    $str15$Set_function_for__A = makeString( "Set function for ~A" );
    $list16 = ConsesLow.list( makeSymbol( "ROOT" ), makeSymbol( "INITVAL" ), makeSymbol( "COMMENT" ) );
    $str17$_CB_USE__A_ = makeString( "*CB-USE-~A*" );
    $str18$_CB__A_ = makeString( "*CB-~A*" );
    $sym19$DEFFILTERVAR = makeSymbol( "DEFFILTERVAR" );
    $str20$Should_we_use_the_content_of__A__ = makeString( "Should we use the content of ~A. This is set to nil when the user is not filtering based on this parameter." );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRIGGERING-ASSERTION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "*BROWSE-FORWARD-INFERENCES?*" ), T ), ConsesLow.list( makeSymbol( "*FORWARD-INFERENCE-BROWSING-CALLBACK*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING" ) ) ), ConsesLow.list( makeSymbol( "*FORWARD-INFERENCE-BROWSING-CALLBACK-MORE-INFO?*" ), T ) );
    $sym23$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE = makeSymbol( "PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE" ) ) );
    $list25 = ConsesLow.list( makeSymbol( "INPUT-ELT-NAME" ), makeSymbol( "CONTAINER-ELT-NAME" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "MAX-RESULTS" ), makeInteger( 50 ) ), ConsesLow.list( makeSymbol(
        "MIN-QUERY-LENGTH" ), THREE_INTEGER ), ConsesLow.list( makeSymbol( "EMBEDDED-IN-TOOLBAR-FRAME?" ), NIL ), ConsesLow.list( makeSymbol( "FILTER-TERM" ), constant_handles.reader_make_constant_shell( makeString(
            "Thing" ) ) ) );
    $list26 = ConsesLow.list( makeKeyword( "MAX-RESULTS" ), makeKeyword( "MIN-QUERY-LENGTH" ), makeKeyword( "EMBEDDED-IN-TOOLBAR-FRAME?" ), makeKeyword( "FILTER-TERM" ) );
    $kw27$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw28$MAX_RESULTS = makeKeyword( "MAX-RESULTS" );
    $int29$50 = makeInteger( 50 );
    $kw30$MIN_QUERY_LENGTH = makeKeyword( "MIN-QUERY-LENGTH" );
    $kw31$EMBEDDED_IN_TOOLBAR_FRAME_ = makeKeyword( "EMBEDDED-IN-TOOLBAR-FRAME?" );
    $kw32$FILTER_TERM = makeKeyword( "FILTER-TERM" );
    $const33$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $sym34$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT = makeSymbol( "HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT" );
  }
}
/*
 * 
 * Total time: 50 ms
 * 
 */