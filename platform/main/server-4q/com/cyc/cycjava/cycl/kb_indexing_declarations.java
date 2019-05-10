package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_indexing_declarations
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_indexing_declarations";
  public static final String myFingerPrint = "825e227b3c5d2ea7e5b5df9f69ec04bb7445acb925803a30ad2aae92693b51d6";
  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 634L)
  private static SubLSymbol $default_intermediate_index_equal_test$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 714L)
  private static SubLSymbol $kb_indexing_declaration_store$;
  private static final SubLSymbol $sym0$_KB_INDEXING_DECLARATION_STORE_;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw4$DONE;
  private static final SubLSymbol $sym5$DO_DICTIONARY;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$KB_INDEXING_DECLARATION_STORE;
  private static final SubLSymbol $sym8$DO_KB_INDICES;
  private static final SubLSymbol $kw9$TOP_LEVEL_KEY;
  private static final SubLList $list10;
  private static final SubLString $str11$Could_not_find_an_index_with_top_;
  private static final SubLSymbol $kw12$KEYS;
  private static final SubLSymbol $kw13$EQUAL_TEST;
  private static final SubLSymbol $kw14$GAF_ARG;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$NART_ARG;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$PREDICATE_EXTENT;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$FUNCTION_EXTENT;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$PREDICATE_RULE;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$DECONTEXTUALIZED_IST_PREDICATE_RULE;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$ISA_RULE;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$QUOTED_ISA_RULE;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$GENLS_RULE;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$GENL_MT_RULE;
  private static final SubLList $list33;
  private static final SubLSymbol $kw34$FUNCTION_RULE;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$EXCEPTION_RULE;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$PRAGMA_RULE;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$MICROTHEORY_CONTENTS;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$MISCELLANEOUS;
  private static final SubLList $list43;

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 790L)
  public static SubLObject do_kb_indices(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject index = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    plist = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      if( NIL == conses_high.member( current_$1, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym5$DO_DICTIONARY, ConsesLow.list( index, plist, $list6, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 963L)
  public static SubLObject kb_indexing_declaration_store()
  {
    return $kb_indexing_declaration_store$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1084L)
  public static SubLObject clear_kb_indexing_declaration_store()
  {
    $kb_indexing_declaration_store$.setGlobalValue( dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    return $kb_indexing_declaration_store$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1310L)
  public static SubLObject add_index_to_kb_indexing_declaration_store(final SubLObject index, final SubLObject plist)
  {
    return dictionary.dictionary_enter( $kb_indexing_declaration_store$.getGlobalValue(), index, plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1456L)
  public static SubLObject remove_index_from_kb_indexing_declaration_store(final SubLObject index)
  {
    return dictionary.dictionary_remove( $kb_indexing_declaration_store$.getGlobalValue(), index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1596L)
  public static SubLObject get_index_from_kb_indexing_declaration_store(final SubLObject index)
  {
    return dictionary.dictionary_lookup( $kb_indexing_declaration_store$.getGlobalValue(), index, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1733L)
  public static SubLObject find_index_by_top_level_key(final SubLObject top_level_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject index = get_index_from_kb_indexing_declaration_store( top_level_key );
    if( NIL != index && top_level_key.eql( get_index_prop( index, $kw9$TOP_LEVEL_KEY ) ) )
    {
      return index;
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( kb_indexing_declaration_store() ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject index2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject plist = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( top_level_key.eql( get_index_prop( index2, $kw9$TOP_LEVEL_KEY ) ) )
      {
        return index2;
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2192L)
  public static SubLObject get_index_key_prop(final SubLObject key_info, final SubLObject indicator, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return conses_high.getf( key_info, indicator, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2310L)
  public static SubLObject get_index_prop(final SubLObject index, final SubLObject indicator)
  {
    return conses_high.getf( get_index_from_kb_indexing_declaration_store( index ), indicator, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2464L)
  public static SubLObject declare_index(final SubLObject index, final SubLObject plist)
  {
    add_index_to_kb_indexing_declaration_store( index, plist );
    return index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2694L)
  public static SubLObject index_equality_test_for_keys(final SubLObject keys)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject top_level_key = NIL;
    SubLObject rest_keys = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( keys, keys, $list10 );
    top_level_key = keys.first();
    final SubLObject current = rest_keys = keys.rest();
    final SubLObject index = find_index_by_top_level_key( top_level_key );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == index )
    {
      Errors.error( $str11$Could_not_find_an_index_with_top_, top_level_key );
    }
    final SubLObject key_info_list = get_index_prop( index, $kw12$KEYS );
    final SubLObject levels_deep = Sequences.length( rest_keys );
    final SubLObject key_info_for_this_level = ConsesLow.nth( levels_deep, key_info_list );
    final SubLObject equal_test = get_index_key_prop( key_info_for_this_level, $kw13$EQUAL_TEST, $default_intermediate_index_equal_test$.getGlobalValue() );
    return equal_test;
  }

  public static SubLObject declare_kb_indexing_declarations_file()
  {
    SubLFiles.declareMacro( me, "do_kb_indices", "DO-KB-INDICES" );
    SubLFiles.declareFunction( me, "kb_indexing_declaration_store", "KB-INDEXING-DECLARATION-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_kb_indexing_declaration_store", "CLEAR-KB-INDEXING-DECLARATION-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "add_index_to_kb_indexing_declaration_store", "ADD-INDEX-TO-KB-INDEXING-DECLARATION-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_index_from_kb_indexing_declaration_store", "REMOVE-INDEX-FROM-KB-INDEXING-DECLARATION-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_index_from_kb_indexing_declaration_store", "GET-INDEX-FROM-KB-INDEXING-DECLARATION-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_index_by_top_level_key", "FIND-INDEX-BY-TOP-LEVEL-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_index_key_prop", "GET-INDEX-KEY-PROP", 2, 1, false );
    SubLFiles.declareFunction( me, "get_index_prop", "GET-INDEX-PROP", 2, 0, false );
    SubLFiles.declareFunction( me, "declare_index", "DECLARE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "index_equality_test_for_keys", "INDEX-EQUALITY-TEST-FOR-KEYS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_indexing_declarations_file()
  {
    $default_intermediate_index_equal_test$ = SubLFiles.deflexical( "*DEFAULT-INTERMEDIATE-INDEX-EQUAL-TEST*", Symbols.symbol_function( EQL ) );
    $kb_indexing_declaration_store$ = SubLFiles.deflexical( "*KB-INDEXING-DECLARATION-STORE*", maybeDefault( $sym0$_KB_INDEXING_DECLARATION_STORE_, $kb_indexing_declaration_store$, () -> ( dictionary.new_dictionary(
        Symbols.symbol_function( EQL ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_kb_indexing_declarations_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_KB_INDEXING_DECLARATION_STORE_ );
    access_macros.register_macro_helper( $sym7$KB_INDEXING_DECLARATION_STORE, $sym8$DO_KB_INDICES );
    declare_index( $kw14$GAF_ARG, $list15 );
    declare_index( $kw16$NART_ARG, $list17 );
    declare_index( $kw18$PREDICATE_EXTENT, $list19 );
    declare_index( $kw20$FUNCTION_EXTENT, $list21 );
    declare_index( $kw22$PREDICATE_RULE, $list23 );
    declare_index( $kw24$DECONTEXTUALIZED_IST_PREDICATE_RULE, $list25 );
    declare_index( $kw26$ISA_RULE, $list27 );
    declare_index( $kw28$QUOTED_ISA_RULE, $list29 );
    declare_index( $kw30$GENLS_RULE, $list31 );
    declare_index( $kw32$GENL_MT_RULE, $list33 );
    declare_index( $kw34$FUNCTION_RULE, $list35 );
    declare_index( $kw36$EXCEPTION_RULE, $list37 );
    declare_index( $kw38$PRAGMA_RULE, $list39 );
    declare_index( $kw40$MICROTHEORY_CONTENTS, $list41 );
    declare_index( $kw42$MISCELLANEOUS, $list43 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_indexing_declarations_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_indexing_declarations_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_indexing_declarations_file();
  }
  static
  {
    me = new kb_indexing_declarations();
    $default_intermediate_index_equal_test$ = null;
    $kb_indexing_declaration_store$ = null;
    $sym0$_KB_INDEXING_DECLARATION_STORE_ = makeSymbol( "*KB-INDEXING-DECLARATION-STORE*" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "PLIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list2 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw3$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw4$DONE = makeKeyword( "DONE" );
    $sym5$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list6 = ConsesLow.list( makeSymbol( "KB-INDEXING-DECLARATION-STORE" ) );
    $sym7$KB_INDEXING_DECLARATION_STORE = makeSymbol( "KB-INDEXING-DECLARATION-STORE" );
    $sym8$DO_KB_INDICES = makeSymbol( "DO-KB-INDICES" );
    $kw9$TOP_LEVEL_KEY = makeKeyword( "TOP-LEVEL-KEY" );
    $list10 = ConsesLow.cons( makeSymbol( "TOP-LEVEL-KEY" ), makeSymbol( "REST-KEYS" ) );
    $str11$Could_not_find_an_index_with_top_ = makeString( "Could not find an index with top-level key ~S" );
    $kw12$KEYS = makeKeyword( "KEYS" );
    $kw13$EQUAL_TEST = makeKeyword( "EQUAL-TEST" );
    $kw14$GAF_ARG = makeKeyword( "GAF-ARG" );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "GAF Arg" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "term" ), makeKeyword( "VALIDITY-TEST" ),
        makeSymbol( "INDEXED-TERM-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "GAF-ARG" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "argnum" ), makeKeyword(
            "VALIDITY-TEST" ), makeSymbol( "POSITIVE-INTEGER-P" ), makeKeyword( "EQUAL-TEST" ), EQL ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "pred" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "FORT-P" ),
                makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-PRED?" ), makeKeyword( "EQUAL-TEST" ), EQL ), ConsesLow.list( new SubLObject[]
                { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
                    "EQUAL-TEST" ), EQUAL
        } ) ), makeKeyword( "RANGE" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "gaf" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "GAF-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
            "A gaf assertion in mt MT with predicate PRED which mentions TERM\nin position ARGNUM" ) ), makeKeyword( "DUPLICATE-VALUES?" ), T, makeKeyword( "NUM-FUNCTION" ), makeSymbol( "NUM-GAF-ARG-INDEX" ),
      makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-GAF-ARG-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol( "RELEVANT-NUM-GAF-ARG-INDEX-WITH-CUTOFF" ), makeKeyword(
          "KEY-FUNCTION" ), makeSymbol( "KEY-GAF-ARG-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol( "RELEVANT-KEY-GAF-ARG-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol(
              "MATCHES-GAF-ARG-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-GAF-ARG-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-GAF-ARG-SUBINDEX" )
    } );
    $kw16$NART_ARG = makeKeyword( "NART-ARG" );
    $list17 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "NART Arg" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "term" ), makeKeyword( "VALIDITY-TEST" ),
        makeSymbol( "INDEXED-TERM-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "NART-ARG" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "argnum" ), makeKeyword(
            "VALIDITY-TEST" ), makeSymbol( "POSITIVE-INTEGER-P" ), makeKeyword( "EQUAL-TEST" ), EQL ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "func" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "FORT-P" ),
                makeKeyword( "EQUAL-TEST" ), EQL ) ), makeKeyword( "RANGE" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "tou-ass" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "TERM-OF-UNIT-ASSERTION-P" ),
                    makeKeyword( "DOCUMENTATION" ), makeString( "A #$termOfUnit assertion whose arg2 is a naut with functor FUNC\nwhich mentions TERM in position ARGNUM" ) ), makeKeyword( "DUPLICATE-VALUES?" ), T,
      makeKeyword( "NUM-FUNCTION" ), makeSymbol( "NUM-NART-ARG-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-NART-ARG-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ),
      makeSymbol( "RELEVANT-NUM-NART-ARG-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-NART-ARG-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol( "RELEVANT-KEY-NART-ARG-INDEX" ),
      makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-NART-ARG-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-NART-ARG-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol(
          "GET-NART-ARG-SUBINDEX" )
    } );
    $kw18$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $list19 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Predicate Extent" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "pred" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "FORT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "PREDICATE-EXTENT" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( new SubLObject[]
        { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
            "EQUAL-TEST" ), EQUAL
        } ) ), makeKeyword( "RANGE" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "gaf" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "GAF-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
            "A gaf assertion in mt MT with predicate PRED." ) ), makeKeyword( "DUPLICATE-VALUES?" ), NIL, makeKeyword( "NUM-FUNCTION" ), makeSymbol( "NUM-PREDICATE-EXTENT-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ),
      makeSymbol( "RELEVANT-NUM-PREDICATE-EXTENT-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol( "RELEVANT-NUM-PREDICATE-EXTENT-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol(
          "KEY-PREDICATE-EXTENT-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol( "RELEVANT-KEY-PREDICATE-EXTENT-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol(
              "MATCHES-PREDICATE-EXTENT-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-PREDICATE-EXTENT-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol(
                  "GET-PREDICATE-EXTENT-SUBINDEX" )
    } );
    $kw20$FUNCTION_EXTENT = makeKeyword( "FUNCTION-EXTENT" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Function Extent" ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "FUNCTION-EXTENT" ), makeKeyword( "DOMAIN" ), ConsesLow.list(
        makeKeyword( "NAME" ), makeString( "func" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "FORT-P" ) ), makeKeyword( "RANGE" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "tou-ass" ), makeKeyword(
            "VALIDITY-TEST" ), makeSymbol( "TERM-OF-UNIT-ASSERTION-P" ), makeKeyword( "DOCUMENTATION" ), makeString( "A #$termOfUnit assertion whose arg2 is a naut with functor FUNC" ) ), makeKeyword(
                "DUPLICATE-VALUES?" ), NIL, makeKeyword( "NUM-FUNCTION" ), makeSymbol( "NUM-FUNCTION-EXTENT-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-FUNCTION-EXTENT-INDEX" ),
      makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol( "RELEVANT-NUM-FUNCTION-EXTENT-INDEX-WITH-CUTOFF" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-FUNCTION-EXTENT-INDEX" ),
      makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-FUNCTION-EXTENT-SUBINDEX" )
    } );
    $kw22$PREDICATE_RULE = makeKeyword( "PREDICATE-RULE" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Predicate Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "pred" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "FORT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "PREDICATE-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "sense" ),
            makeKeyword( "VALIDITY-TEST" ), makeSymbol( "SENSE-P" ), makeKeyword( "EQUAL-TEST" ), EQ ), ConsesLow.list( new SubLObject[]
            { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
                "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate PRED" ) ), makeKeyword( "DUPLICATE-VALUES?" ), T, makeKeyword( "NUM-FUNCTION" ), makeSymbol(
                    "NUM-PREDICATE-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-PREDICATE-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol(
                        "RELEVANT-NUM-PREDICATE-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-PREDICATE-RULE-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol(
                            "RELEVANT-KEY-PREDICATE-RULE-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-PREDICATE-RULE-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol(
                                "SIMPLE-KEY-PREDICATE-RULE-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-PREDICATE-RULE-SUBINDEX" )
    } );
    $kw24$DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword( "DECONTEXTUALIZED-IST-PREDICATE-RULE" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Decontextualized #$ist Predicate Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "pred" ),
        makeKeyword( "VALIDITY-TEST" ), makeSymbol( "FORT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "DECONTEXTUALIZED-IST-PREDICATE-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword(
            "NAME" ), makeString( "sense" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "SENSE-P" ), makeKeyword( "EQUAL-TEST" ), EQ ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword(
                "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ),
                    makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                        "A rule assertion with direction DIRECTION, which contains\na SENSE-lit wrapped in an #$ist with predicate PRED.  The mt of the rule is ignored." ) ), makeKeyword( "DUPLICATE-VALUES?" ), T,
      makeKeyword( "NUM-FUNCTION" ), makeSymbol( "NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" ),
      makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol( "RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol(
          "KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol( "RELEVANT-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ),
      makeSymbol( "MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ),
      makeSymbol( "GET-DECONTEXTUALIZED-IST-PREDICATE-RULE-SUBINDEX" )
    } );
    $kw26$ISA_RULE = makeKeyword( "ISA-RULE" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "#$isa Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "col" ), makeKeyword( "VALIDITY-TEST" ),
        makeSymbol( "FORT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "ISA-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "sense" ), makeKeyword(
            "VALIDITY-TEST" ), makeSymbol( "SENSE-P" ), makeKeyword( "EQUAL-TEST" ), EQ ), ConsesLow.list( new SubLObject[]
            { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
                "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$isa and arg2 COL" ) ), makeKeyword( "DUPLICATE-VALUES?" ), T, makeKeyword( "NUM-FUNCTION" ), makeSymbol(
                    "NUM-ISA-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-ISA-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol(
                        "RELEVANT-NUM-ISA-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-ISA-RULE-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol( "RELEVANT-KEY-ISA-RULE-INDEX" ),
      makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-ISA-RULE-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-ISA-RULE-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol(
          "GET-ISA-RULE-SUBINDEX" )
    } );
    $kw28$QUOTED_ISA_RULE = makeKeyword( "QUOTED-ISA-RULE" );
    $list29 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "#$quotedIsa Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "col" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "FORT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "QUOTED-ISA-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "sense" ),
            makeKeyword( "VALIDITY-TEST" ), makeSymbol( "SENSE-P" ), makeKeyword( "EQUAL-TEST" ), EQ ), ConsesLow.list( new SubLObject[]
            { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
                "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$quotedIsa and arg2 COL" ) ), makeKeyword( "DUPLICATE-VALUES?" ), T, makeKeyword( "NUM-FUNCTION" ),
      makeSymbol( "NUM-QUOTED-ISA-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-QUOTED-ISA-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol(
          "RELEVANT-NUM-QUOTED-ISA-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-QUOTED-ISA-RULE-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol(
              "RELEVANT-KEY-QUOTED-ISA-RULE-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-QUOTED-ISA-RULE-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol(
                  "SIMPLE-KEY-QUOTED-ISA-RULE-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-QUOTED-ISA-RULE-SUBINDEX" )
    } );
    $kw30$GENLS_RULE = makeKeyword( "GENLS-RULE" );
    $list31 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "#$genls Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "col" ), makeKeyword( "VALIDITY-TEST" ),
        makeSymbol( "FORT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "GENLS-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "sense" ), makeKeyword(
            "VALIDITY-TEST" ), makeSymbol( "SENSE-P" ), makeKeyword( "EQUAL-TEST" ), EQ ), ConsesLow.list( new SubLObject[]
            { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
                "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genls and arg2 COL" ) ), makeKeyword( "DUPLICATE-VALUES?" ), T, makeKeyword( "NUM-FUNCTION" ), makeSymbol(
                    "NUM-GENLS-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-GENLS-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol(
                        "RELEVANT-NUM-GENLS-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-GENLS-RULE-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol(
                            "RELEVANT-KEY-GENLS-RULE-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-GENLS-RULE-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol(
                                "SIMPLE-KEY-GENLS-RULE-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-GENLS-RULE-SUBINDEX" )
    } );
    $kw32$GENL_MT_RULE = makeKeyword( "GENL-MT-RULE" );
    $list33 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "#$genlMt Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "genl-mt" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "GENL-MT-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "sense" ),
            makeKeyword( "VALIDITY-TEST" ), makeSymbol( "SENSE-P" ), makeKeyword( "EQUAL-TEST" ), EQ ), ConsesLow.list( new SubLObject[]
            { makeKeyword( "NAME" ), makeString( "rule-mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
                "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt RULE-MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genlMt and arg2 GENL-MT" ) ), makeKeyword( "DUPLICATE-VALUES?" ), T, makeKeyword( "NUM-FUNCTION" ),
      makeSymbol( "NUM-GENL-MT-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-GENL-MT-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol(
          "RELEVANT-NUM-GENL-MT-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-GENL-MT-RULE-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol( "RELEVANT-KEY-GENL-MT-RULE-INDEX" ),
      makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-GENL-MT-RULE-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-GENL-MT-RULE-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ),
      makeSymbol( "GET-GENL-MT-RULE-SUBINDEX" )
    } );
    $kw34$FUNCTION_RULE = makeKeyword( "FUNCTION-RULE" );
    $list35 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Function Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "func" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "FORT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "FUNCTION-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( new SubLObject[]
        { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
            "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION, which contains\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor FUNC" ) ), makeKeyword( "DUPLICATE-VALUES?" ), NIL,
      makeKeyword( "NUM-FUNCTION" ), makeSymbol( "NUM-FUNCTION-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-FUNCTION-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ),
      makeSymbol( "RELEVANT-NUM-FUNCTION-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-FUNCTION-RULE-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol(
          "RELEVANT-KEY-FUNCTION-RULE-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-FUNCTION-RULE-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-FUNCTION-RULE-INDEX" ),
      makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-FUNCTION-RULE-SUBINDEX" )
    } );
    $kw36$EXCEPTION_RULE = makeKeyword( "EXCEPTION-RULE" );
    $list37 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Exception Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "EXCEPTION-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( new SubLObject[]
        { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
            "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "exception-rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE" ) ), makeKeyword( "DUPLICATE-VALUES?" ), NIL, makeKeyword(
                    "NUM-FUNCTION" ), makeSymbol( "NUM-EXCEPTION-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-EXCEPTION-RULE-INDEX" ), makeKeyword(
                        "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol( "RELEVANT-NUM-EXCEPTION-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-EXCEPTION-RULE-INDEX" ), makeKeyword(
                            "RELEVANT-KEY-FUNCTION" ), makeSymbol( "RELEVANT-KEY-EXCEPTION-RULE-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-EXCEPTION-RULE-INDEX" ), makeKeyword(
                                "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-EXCEPTION-RULE-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-EXCEPTION-RULE-SUBINDEX" )
    } );
    $kw38$PRAGMA_RULE = makeKeyword( "PRAGMA-RULE" );
    $list39 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Pragmatic Requirement Rules" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "PRAGMA-RULE" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( new SubLObject[]
        { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
            "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "pragma-rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE" ) ), makeKeyword( "DUPLICATE-VALUES?" ), NIL,
      makeKeyword( "NUM-FUNCTION" ), makeSymbol( "NUM-PRAGMA-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-PRAGMA-RULE-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ),
      makeSymbol( "RELEVANT-NUM-PRAGMA-RULE-INDEX-WITH-CUTOFF" ), makeKeyword( "KEY-FUNCTION" ), makeSymbol( "KEY-PRAGMA-RULE-INDEX" ), makeKeyword( "RELEVANT-KEY-FUNCTION" ), makeSymbol(
          "RELEVANT-KEY-PRAGMA-RULE-INDEX" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-PRAGMA-RULE-INDEX" ), makeKeyword( "SIMPLE-KEY-FUNCTION" ), makeSymbol( "SIMPLE-KEY-PRAGMA-RULE-INDEX" ),
      makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-PRAGMA-RULE-SUBINDEX" )
    } );
    $kw40$MICROTHEORY_CONTENTS = makeKeyword( "MICROTHEORY-CONTENTS" );
    $list41 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Microtheory Contents" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "IST" ), makeKeyword( "RANGE" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "ass" ), makeKeyword(
            "VALIDITY-TEST" ), makeSymbol( "ASSERTION-P" ), makeKeyword( "DOCUMENTATION" ), makeString( "An assertion in mt MT" ) ), makeKeyword( "DUPLICATE-VALUES?" ), NIL, makeKeyword( "NUM-FUNCTION" ), makeSymbol(
                "NUM-MT-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-MT-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol( "RELEVANT-NUM-MT-INDEX-WITH-CUTOFF" ),
      makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-MT-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-MT-SUBINDEX" )
    } );
    $kw42$MISCELLANEOUS = makeKeyword( "MISCELLANEOUS" );
    $list43 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Miscellaneous" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "term" ), makeKeyword( "VALIDITY-TEST" ),
        makeSymbol( "INDEXED-TERM-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "OTHER" ), makeKeyword( "RANGE" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "ass" ), makeKeyword( "VALIDITY-TEST" ),
            makeSymbol( "ASSERTION-P" ), makeKeyword( "DOCUMENTATION" ), makeString( "An assertion mentioning TERM but not indexed by any other means" ) ), makeKeyword( "DUPLICATE-VALUES?" ), NIL, makeKeyword(
                "NUM-FUNCTION" ), makeSymbol( "NUM-OTHER-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION" ), makeSymbol( "RELEVANT-NUM-OTHER-INDEX" ), makeKeyword( "RELEVANT-NUM-FUNCTION-WITH-CUTOFF" ), makeSymbol(
                    "RELEVANT-NUM-OTHER-INDEX-WITH-CUTOFF" ), makeKeyword( "SIMPLE-MATCH-FUNCTION" ), makeSymbol( "MATCHES-OTHER-INDEX" ), makeKeyword( "GET-SUBINDEX-FUNCTION" ), makeSymbol( "GET-OTHER-SUBINDEX" )
    } );
  }
}
/*
 * 
 * Total time: 249 ms
 * 
 */