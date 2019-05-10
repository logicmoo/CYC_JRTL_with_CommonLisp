package com.cyc.cycjava.cycl.sksi.sksi_testing;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_cache
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache";
  public static final String myFingerPrint = "58bdeda64ae359301095e440a6e6839c3eeb3ebeb643e6403658074d86612b34";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 876L)
  private static SubLSymbol $sksi_language_spoken_table$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 1645L)
  private static SubLSymbol $sksi_language_spoken_table_name$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 1728L)
  private static SubLSymbol $sksi_language_spoken_field_list$;
  private static final SubLList $list0;
  private static final SubLString $str1$Person_Languages;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLString $str5$PERSON;
  private static final SubLString $str6$LANGUAGE;
  private static final SubLString $str7$boolean_CSQL_expression__a_encoun;
  private static final SubLList $list8;
  private static final SubLString $str9$CSQL_expression__a_selects_fields;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$VALUES;
  private static final SubLString $str13$malformed_csql_subexpression__a__;
  private static final SubLSymbol $kw14$INSERT;
  private static final SubLSymbol $kw15$DELETE;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 1815L)
  public static SubLObject sksi_language_spoken_person_language_check_guts(final SubLObject person, final SubLObject language)
  {
    SubLObject answers = NIL;
    if( NIL == answers )
    {
      SubLObject csome_list_var = $sksi_language_spoken_table$.getGlobalValue();
      SubLObject tuple = NIL;
      tuple = csome_list_var.first();
      while ( NIL == answers && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = tuple;
        SubLObject tuple_person = NIL;
        SubLObject tuple_language = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
        tuple_person = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
        tuple_language = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( person.equal( tuple_person ) && language.equal( tuple_language ) )
          {
            final SubLObject v_answer = ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY );
            answers = ConsesLow.cons( v_answer, answers );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
        }
        csome_list_var = csome_list_var.rest();
        tuple = csome_list_var.first();
      }
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 2224L)
  public static SubLObject sksi_language_spoken_persons_by_language_guts(final SubLObject language)
  {
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject tuple_person = NIL;
      SubLObject tuple_language = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_person = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_language = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( language.equal( tuple_language ) )
        {
          answers = ConsesLow.cons( tuple_person, answers );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 2529L)
  public static SubLObject sksi_language_spoken_languages_by_person_guts(final SubLObject person)
  {
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject tuple_person = NIL;
      SubLObject tuple_language = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_person = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_language = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( person.equal( tuple_person ) )
        {
          answers = ConsesLow.cons( tuple_language, answers );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 2830L)
  public static SubLObject sksi_language_spoken_languages_and_persons_guts()
  {
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject tuple_person = NIL;
      SubLObject tuple_language = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_person = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_language = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject v_answer = ConsesLow.list( tuple_person, tuple_language );
        answers = ConsesLow.cons( v_answer, answers );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 3151L)
  public static SubLObject sksi_language_spoken_persons_guts()
  {
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject tuple_person = NIL;
      SubLObject tuple_language = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_person = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_language = current.first();
      current = current.rest();
      if( NIL == current )
      {
        answers = ConsesLow.cons( tuple_person, answers );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 3456L)
  public static SubLObject sksi_language_spoken_languages_guts()
  {
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = $sksi_language_spoken_table$.getGlobalValue();
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject tuple_person = NIL;
      SubLObject tuple_language = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_person = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tuple_language = current.first();
      current = current.rest();
      if( NIL == current )
      {
        answers = ConsesLow.cons( tuple_language, answers );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 3763L)
  public static SubLObject sksi_language_spoken_person_language_check(final SubLObject person, final SubLObject language)
  {
    return sksi_language_spoken_person_language_check_guts( person, language );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 4159L)
  public static SubLObject sksi_language_spoken_persons_by_language(final SubLObject language)
  {
    return sksi_language_spoken_persons_by_language_guts( language );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 4347L)
  public static SubLObject sksi_language_spoken_languages_by_person(final SubLObject person)
  {
    return sksi_language_spoken_languages_by_person_guts( person );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 4527L)
  public static SubLObject sksi_language_spoken_languages_and_persons()
  {
    return sksi_language_spoken_languages_and_persons_guts();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 4702L)
  public static SubLObject sksi_language_spoken_persons()
  {
    return sksi_language_spoken_persons_guts();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 4796L)
  public static SubLObject sksi_language_spoken_languages()
  {
    return sksi_language_spoken_languages_guts();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 4894L)
  public static SubLObject generate_language_spoken_iterator_from_csql(final SubLObject csql)
  {
    SubLObject select_keyword = NIL;
    SubLObject fields = NIL;
    SubLObject from = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( csql, csql, $list4 );
    select_keyword = csql.first();
    SubLObject current = csql.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list4 );
    fields = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list4 );
    from = current.first();
    current = current.rest();
    final SubLObject where = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, csql, $list4 );
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != list_utilities.doubletonP( fields ) )
      {
        return iteration.new_list_iterator( sksi_language_spoken_languages_and_persons() );
      }
      if( NIL == list_utilities.singletonP( fields ) )
      {
        Errors.error( $str7$boolean_CSQL_expression__a_encoun, csql );
        return NIL;
      }
      final SubLObject field = fields.first();
      final SubLObject field_name = conses_high.second( field );
      if( field_name.equal( $str5$PERSON ) )
      {
        final SubLObject language = conses_high.third( conses_high.second( where ).first() );
        if( NIL != language )
        {
          return sksi_result_set_iterators.new_sksi_list_iterator( sksi_language_spoken_persons_by_language( language ) );
        }
        return sksi_result_set_iterators.new_sksi_list_iterator( sksi_language_spoken_persons() );
      }
      else if( field_name.equal( $str6$LANGUAGE ) )
      {
        final SubLObject person = conses_high.third( conses_high.second( where ).first() );
        if( NIL != person )
        {
          return sksi_result_set_iterators.new_sksi_list_iterator( sksi_language_spoken_languages_by_person( person ) );
        }
        return sksi_result_set_iterators.new_sksi_list_iterator( sksi_language_spoken_languages() );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( csql, $list4 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 6517L)
  public static SubLObject generate_language_spoken_boolean_from_csql(final SubLObject csql)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject select_keyword = NIL;
    SubLObject fields = NIL;
    SubLObject from = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( csql, csql, $list4 );
    select_keyword = csql.first();
    SubLObject current = csql.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list4 );
    fields = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list4 );
    from = current.first();
    current = current.rest();
    final SubLObject where = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, csql, $list4 );
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !fields.equal( $list8 ) )
      {
        Errors.error( $str9$CSQL_expression__a_selects_fields, csql );
      }
      final SubLObject person = conses_high.third( conses_high.second( where ).first() );
      final SubLObject language = conses_high.third( conses_high.second( conses_high.second( where ) ) );
      return sksi_language_spoken_person_language_check( person, language );
    }
    cdestructuring_bind.cdestructuring_bind_error( csql, $list4 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-testing/sksi-cache.lisp", position = 7049L)
  public static SubLObject sksi_store_or_delete_raw_value_in_language_spoken_cache(final SubLObject csql)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator_keyword = NIL;
    SubLObject into_or_from = NIL;
    SubLObject fields = NIL;
    SubLObject field_values = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( csql, csql, $list10 );
    operator_keyword = csql.first();
    SubLObject current = csql.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list10 );
    into_or_from = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list10 );
    fields = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, csql, $list10 );
    field_values = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject current_$2;
      final SubLObject datum_$1 = current_$2 = field_values;
      SubLObject values_keyword = NIL;
      SubLObject field_value_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list11 );
      values_keyword = current_$2.first();
      current_$2 = current_$2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list11 );
      field_value_list = current_$2.first();
      current_$2 = current_$2.rest();
      if( NIL == current_$2 )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw12$VALUES != values_keyword )
        {
          Errors.error( $str13$malformed_csql_subexpression__a__, values_keyword );
        }
        final SubLObject pcase_var = operator_keyword;
        if( pcase_var.eql( $kw14$INSERT ) )
        {
          $sksi_language_spoken_table$.setGlobalValue( ConsesLow.cons( field_value_list, $sksi_language_spoken_table$.getGlobalValue() ) );
        }
        else if( pcase_var.eql( $kw15$DELETE ) )
        {
          $sksi_language_spoken_table$.setGlobalValue( Sequences.remove( field_value_list, $sksi_language_spoken_table$.getGlobalValue(), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        return $sksi_language_spoken_table$.getGlobalValue();
      }
      cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list11 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( csql, $list10 );
    }
    return NIL;
  }

  public static SubLObject declare_sksi_cache_file()
  {
    SubLFiles.declareFunction( me, "sksi_language_spoken_person_language_check_guts", "SKSI-LANGUAGE-SPOKEN-PERSON-LANGUAGE-CHECK-GUTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_persons_by_language_guts", "SKSI-LANGUAGE-SPOKEN-PERSONS-BY-LANGUAGE-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_languages_by_person_guts", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-BY-PERSON-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_languages_and_persons_guts", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-AND-PERSONS-GUTS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_persons_guts", "SKSI-LANGUAGE-SPOKEN-PERSONS-GUTS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_languages_guts", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-GUTS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_person_language_check", "SKSI-LANGUAGE-SPOKEN-PERSON-LANGUAGE-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_persons_by_language", "SKSI-LANGUAGE-SPOKEN-PERSONS-BY-LANGUAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_languages_by_person", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-BY-PERSON", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_languages_and_persons", "SKSI-LANGUAGE-SPOKEN-LANGUAGES-AND-PERSONS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_persons", "SKSI-LANGUAGE-SPOKEN-PERSONS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_language_spoken_languages", "SKSI-LANGUAGE-SPOKEN-LANGUAGES", 0, 0, false );
    SubLFiles.declareFunction( me, "generate_language_spoken_iterator_from_csql", "GENERATE-LANGUAGE-SPOKEN-ITERATOR-FROM-CSQL", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_language_spoken_boolean_from_csql", "GENERATE-LANGUAGE-SPOKEN-BOOLEAN-FROM-CSQL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_store_or_delete_raw_value_in_language_spoken_cache", "SKSI-STORE-OR-DELETE-RAW-VALUE-IN-LANGUAGE-SPOKEN-CACHE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_cache_file()
  {
    $sksi_language_spoken_table$ = SubLFiles.deflexical( "*SKSI-LANGUAGE-SPOKEN-TABLE*", $list0 );
    $sksi_language_spoken_table_name$ = SubLFiles.deflexical( "*SKSI-LANGUAGE-SPOKEN-TABLE-NAME*", $str1$Person_Languages );
    $sksi_language_spoken_field_list$ = SubLFiles.deflexical( "*SKSI-LANGUAGE-SPOKEN-FIELD-LIST*", $list2 );
    return NIL;
  }

  public static SubLObject setup_sksi_cache_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_cache_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_cache_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_cache_file();
  }
  static
  {
    me = new sksi_cache();
    $sksi_language_spoken_table$ = null;
    $sksi_language_spoken_table_name$ = null;
    $sksi_language_spoken_field_list$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeString( "Goolsbey" ), makeString( "EnglishLanguage" ) ), ConsesLow.list( makeString( "Goolsbey" ), makeString( "GermanLanguage" ) ), ConsesLow.list(
        makeString( "Kahlert" ), makeString( "EnglishLanguage" ) ), ConsesLow.list( makeString( "Kahlert" ), makeString( "GermanLanguage" ) ), ConsesLow.list( makeString( "Pace" ), makeString( "EnglishLanguage" ) ),
      ConsesLow.list( makeString( "Pace" ), makeString( "FinnishLanguage" ) ), ConsesLow.list( makeString( "Hagen" ), makeString( "Magyarul" ) ), ConsesLow.list( makeString( "SDeVoy" ), makeString( "EnglishLanguage" ) ),
      ConsesLow.list( makeString( "SDeVoy" ), makeString( "SpanishLanguage" ) ), ConsesLow.list( makeString( "Zelal" ), makeString( "Turkce" ) )
    } );
    $str1$Person_Languages = makeString( "Person_Languages" );
    $list2 = ConsesLow.list( makeString( "PERSON" ), makeString( "LANGUAGE" ) );
    $list3 = ConsesLow.list( makeSymbol( "TUPLE-PERSON" ), makeSymbol( "TUPLE-LANGUAGE" ) );
    $list4 = ConsesLow.list( makeSymbol( "SELECT-KEYWORD" ), makeSymbol( "FIELDS" ), makeSymbol( "FROM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "WHERE" ) );
    $str5$PERSON = makeString( "PERSON" );
    $str6$LANGUAGE = makeString( "LANGUAGE" );
    $str7$boolean_CSQL_expression__a_encoun = makeString( "boolean CSQL expression ~a encountered when select expression expected" );
    $list8 = ConsesLow.list( makeKeyword( "COUNT" ), makeKeyword( "ALL" ) );
    $str9$CSQL_expression__a_selects_fields = makeString( "CSQL expression ~a selects fields, not a boolean check expression" );
    $list10 = ConsesLow.list( makeSymbol( "OPERATOR-KEYWORD" ), makeSymbol( "INTO-OR-FROM" ), makeSymbol( "FIELDS" ), makeSymbol( "FIELD-VALUES" ) );
    $list11 = ConsesLow.list( makeSymbol( "VALUES-KEYWORD" ), makeSymbol( "FIELD-VALUE-LIST" ) );
    $kw12$VALUES = makeKeyword( "VALUES" );
    $str13$malformed_csql_subexpression__a__ = makeString( "malformed csql subexpression ~a, expected :values" );
    $kw14$INSERT = makeKeyword( "INSERT" );
    $kw15$DELETE = makeKeyword( "DELETE" );
  }
}
/*
 * 
 * Total time: 110 ms
 * 
 */