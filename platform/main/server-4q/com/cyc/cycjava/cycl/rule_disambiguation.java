package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.nl.document_disambiguation;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rule_disambiguation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rule_disambiguation";
  public static final String myFingerPrint = "891c642dbb822fe6626a2e438c6789a014bae17b876bd1204b065b2df69a6775";
  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1212L)
  private static SubLSymbol $word_sense_disambiguation_rule_file$;
  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1346L)
  private static SubLSymbol $word_sense_disambiguation_count_file$;
  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLSymbol $dtp_rule_disambiguator$;
  private static final SubLString $str0$data_word_sense_disambiguation_ru;
  private static final SubLString $str1$data_word_sense_disambiguation_co;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CLET;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$FINALIZE_RULE_DISAMBIGUATOR;
  private static final SubLSymbol $sym6$RULE_DISAMBIGUATOR;
  private static final SubLSymbol $sym7$RULE_DISAMBIGUATOR_P;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$RDIS_PRINT;
  private static final SubLSymbol $sym13$RULE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$RDIS_RULE_FILE;
  private static final SubLSymbol $sym16$_CSETF_RDIS_RULE_FILE;
  private static final SubLSymbol $sym17$RDIS_COUNT_FILE;
  private static final SubLSymbol $sym18$_CSETF_RDIS_COUNT_FILE;
  private static final SubLSymbol $sym19$RDIS_RULES;
  private static final SubLSymbol $sym20$_CSETF_RDIS_RULES;
  private static final SubLSymbol $sym21$RDIS_COUNTS;
  private static final SubLSymbol $sym22$_CSETF_RDIS_COUNTS;
  private static final SubLSymbol $kw23$RULE_FILE;
  private static final SubLSymbol $kw24$COUNT_FILE;
  private static final SubLSymbol $kw25$RULES;
  private static final SubLSymbol $kw26$COUNTS;
  private static final SubLString $str27$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw28$BEGIN;
  private static final SubLSymbol $sym29$MAKE_RULE_DISAMBIGUATOR;
  private static final SubLSymbol $kw30$SLOT;
  private static final SubLSymbol $kw31$END;
  private static final SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_RULE_DISAMBIGUATOR_METHOD;
  private static final SubLSymbol $sym33$STRINGP;
  private static final SubLString $str34$__RULE_DISAMBIGUATOR_;
  private static final SubLString $str35$_;
  private static final SubLString $str36$_;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$CYCL;
  private static final SubLSymbol $sym39$GENL_CYCL;
  private static final SubLSymbol $sym40$PROGN;
  private static final SubLSymbol $sym41$CDOLIST;
  private static final SubLSymbol $sym42$WORD_CYCLS;
  private static final SubLSymbol $sym43$CINC_HASH;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$GET_UPWARDS_CLOSURE;
  private static final SubLSymbol $sym46$DOCUMENT_DISAMBIGUATE_RULE_DISAMBIGUATOR_METHOD;
  private static final SubLSymbol $sym47$DOCUMENT_P;
  private static final SubLSymbol $sym48$HASH_TABLE_P;
  private static final SubLSymbol $kw49$INTERPS;
  private static final SubLObject $const50$VanishinglyRareLexicalMapping;
  private static final SubLObject $const51$ContextuallyDependentLexicalMappi;
  private static final SubLSymbol $kw52$NOT_FOUND;
  private static final SubLString $str53$Can_t_load_rules_from__a;
  private static final SubLString $str54$Can_t_load_counts_from__a;
  private static final SubLInteger $int55$1024;
  private static final SubLList $list56;
  private static final SubLObject $const57$InferencePSC;
  private static final SubLList $list58;
  private static final SubLString $str59$data_word_sense_disambiguation_ru;
  private static final SubLObject $const60$isLicensedBy;
  private static final SubLObject $const61$isDelicensedBy;
  private static final SubLInteger $int62$65536;
  private static final SubLSymbol $kw63$OUTPUT;
  private static final SubLString $str64$Unable_to_open__S;
  private static final SubLString $str65$___;
  private static final SubLString $str66$__S____S___;
  private static final SubLString $str67$___;
  private static final SubLSymbol $kw68$DONE;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$INFERENCE_MODE;
  private static final SubLSymbol $kw71$SHALLOW;
  private static final SubLSymbol $kw72$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw73$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw74$COMPUTE_INTERSECTION;
  private static final SubLSymbol $kw75$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw76$MINIMAL;
  private static final SubLSymbol $kw77$MAX_TIME;
  private static final SubLInteger $int78$57600;
  private static final SubLSymbol $kw79$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLFloat $float80$1_0;
  private static final SubLSymbol $kw81$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw82$EL;
  private static final SubLSymbol $kw83$CONTINUABLE_;
  private static final SubLSymbol $kw84$PROBLEM_STORE;
  private static final SubLString $str85$_tmp_;
  private static final SubLSymbol $sym86$LISTP;
  private static final SubLString $str87$_a_is_invalid;
  private static final SubLString $str88$Can_t_load__a___a;
  private static final SubLSymbol $kw89$INPUT;
  private static final SubLString $str90$cdolist;
  private static final SubLSymbol $kw91$IMAGE_INDEPENDENT_CFASL;
  private static final SubLString $str92$Iterating_over_FHT;
  private static final SubLList $list93;
  private static final SubLString $str94$don_t_know_how_to_convert__A;
  private static final SubLString $str95$_A__A_;
  private static final SubLString $str96$_A_;
  private static final SubLString $str97$__;
  private static final SubLList $list98;
  private static final SubLString $str99$mapping_Cyc_FORTs;
  private static final SubLSymbol $kw100$SKIP;
  private static final SubLString $str101$_host_george_term_id_lists_;
  private static final SubLString $str102$_host_george_disambig_rules_;
  private static final SubLString $str103$_Afort_id__4__0D_cfasl;
  private static final SubLString $str104$_Adisambiguator_rule_file__4__0D_;
  private static final SubLString $str105$created_using_CREATE_RULE_DISAMBI;
  private static final SubLString $str106$arguments______progn__load____hom;
  private static final SubLString $str107$queue____;

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1457L)
  public static SubLObject with_new_rule_disambiguator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject disambiguator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    disambiguator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym3$CLET, ConsesLow.list( reader.bq_cons( disambiguator, $list4 ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym5$FINALIZE_RULE_DISAMBIGUATOR, disambiguator ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject rule_disambiguator_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    rdis_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject rule_disambiguator_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rule_disambiguator_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject rdis_rule_file(final SubLObject v_object)
  {
    assert NIL != rule_disambiguator_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject rdis_count_file(final SubLObject v_object)
  {
    assert NIL != rule_disambiguator_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject rdis_rules(final SubLObject v_object)
  {
    assert NIL != rule_disambiguator_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject rdis_counts(final SubLObject v_object)
  {
    assert NIL != rule_disambiguator_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject _csetf_rdis_rule_file(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rule_disambiguator_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject _csetf_rdis_count_file(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rule_disambiguator_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject _csetf_rdis_rules(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rule_disambiguator_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject _csetf_rdis_counts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rule_disambiguator_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject make_rule_disambiguator(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rule_disambiguator_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw23$RULE_FILE ) )
      {
        _csetf_rdis_rule_file( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$COUNT_FILE ) )
      {
        _csetf_rdis_count_file( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$RULES ) )
      {
        _csetf_rdis_rules( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$COUNTS ) )
      {
        _csetf_rdis_counts( v_new, current_value );
      }
      else
      {
        Errors.error( $str27$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject visit_defstruct_rule_disambiguator(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw28$BEGIN, $sym29$MAKE_RULE_DISAMBIGUATOR, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw23$RULE_FILE, rdis_rule_file( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw24$COUNT_FILE, rdis_count_file( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw25$RULES, rdis_rules( obj ) );
    Functions.funcall( visitor_fn, obj, $kw30$SLOT, $kw26$COUNTS, rdis_counts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$END, $sym29$MAKE_RULE_DISAMBIGUATOR, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
  public static SubLObject visit_defstruct_object_rule_disambiguator_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rule_disambiguator( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 2076L)
  public static SubLObject new_rule_disambiguator(SubLObject rulepath, SubLObject countpath)
  {
    if( rulepath == UNPROVIDED )
    {
      rulepath = $word_sense_disambiguation_rule_file$.getDynamicValue();
    }
    if( countpath == UNPROVIDED )
    {
      countpath = $word_sense_disambiguation_count_file$.getDynamicValue();
    }
    assert NIL != Types.stringp( rulepath ) : rulepath;
    assert NIL != Types.stringp( countpath ) : countpath;
    final SubLObject dis = make_rule_disambiguator( UNPROVIDED );
    _csetf_rdis_rule_file( dis, rulepath );
    _csetf_rdis_rules( dis, load_disambiguator_rules( rulepath ) );
    _csetf_rdis_count_file( dis, countpath );
    _csetf_rdis_counts( dis, load_disambiguator_counts( countpath ) );
    return dis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 2666L)
  public static SubLObject finalize_rule_disambiguator(final SubLObject rdis)
  {
    assert NIL != rule_disambiguator_p( rdis ) : rdis;
    file_backed_cache.file_backed_cache_finalize( rdis_rules( rdis ) );
    file_backed_cache.file_backed_cache_finalize( rdis_counts( rdis ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 2914L)
  public static SubLObject rdis_print(final SubLObject rdis, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str34$__RULE_DISAMBIGUATOR_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( rdis_rule_file( rdis ), stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str35$_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( rdis_count_file( rdis ), stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str36$_, stream, UNPROVIDED, UNPROVIDED );
    return rdis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 3234L)
  public static SubLObject with_sense_bag_excepting_word(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_bag = NIL;
    SubLObject word = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    v_bag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    word = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject cycl = $sym38$CYCL;
      final SubLObject genl_cycl = $sym39$GENL_CYCL;
      return ConsesLow.listS( $sym40$PROGN, ConsesLow.list( $sym41$CDOLIST, ConsesLow.list( cycl, ConsesLow.list( $sym42$WORD_CYCLS, word ) ), ConsesLow.listS( $sym43$CINC_HASH, cycl, v_bag, $list44 ), ConsesLow.list(
          $sym41$CDOLIST, ConsesLow.list( genl_cycl, ConsesLow.list( $sym45$GET_UPWARDS_CLOSURE, cycl ) ), ConsesLow.listS( $sym43$CINC_HASH, genl_cycl, v_bag, $list44 ) ) ), ConsesLow.append( body, ConsesLow.list(
              ConsesLow.list( $sym41$CDOLIST, ConsesLow.list( cycl, ConsesLow.list( $sym42$WORD_CYCLS, word ) ), ConsesLow.list( $sym43$CINC_HASH, cycl, v_bag ), ConsesLow.list( $sym41$CDOLIST, ConsesLow.list( genl_cycl,
                  ConsesLow.list( $sym45$GET_UPWARDS_CLOSURE, cycl ) ), ConsesLow.list( $sym43$CINC_HASH, genl_cycl, v_bag ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 3830L)
  public static SubLObject document_disambiguate_rule_disambiguator_method(final SubLObject disambiguator, final SubLObject doc, SubLObject v_context)
  {
    if( v_context == UNPROVIDED )
    {
      v_context = new_sense_bag( doc );
    }
    return rdis_disambiguate( disambiguator, doc, v_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 4004L)
  public static SubLObject rdis_disambiguate(final SubLObject rdis, final SubLObject doc, SubLObject v_context)
  {
    if( v_context == UNPROVIDED )
    {
      v_context = new_sense_bag( doc );
    }
    assert NIL != rule_disambiguator_p( rdis ) : rdis;
    assert NIL != document.document_p( doc ) : doc;
    assert NIL != Types.hash_table_p( v_context ) : v_context;
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
    SubLObject cdolist_list_var_$6;
    SubLObject cycl;
    SubLObject cdolist_list_var_$7;
    SubLObject genl_cycl;
    SubLObject sense_markers;
    SubLObject new_senses;
    SubLObject cdolist_list_var_$8;
    SubLObject sense_marker;
    SubLObject cdolist_list_var_$9;
    SubLObject cdolist_list_var_$10;
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
          cdolist_list_var_$6 = document.word_cycls( word );
          cycl = NIL;
          cycl = cdolist_list_var_$6.first();
          while ( NIL != cdolist_list_var_$6)
          {
            hash_table_utilities.cinc_hash( cycl, v_context, MINUS_ONE_INTEGER, UNPROVIDED );
            cdolist_list_var_$7 = document_annotation_widgets.get_upwards_closure( cycl );
            genl_cycl = NIL;
            genl_cycl = cdolist_list_var_$7.first();
            while ( NIL != cdolist_list_var_$7)
            {
              hash_table_utilities.cinc_hash( genl_cycl, v_context, MINUS_ONE_INTEGER, UNPROVIDED );
              cdolist_list_var_$7 = cdolist_list_var_$7.rest();
              genl_cycl = cdolist_list_var_$7.first();
            }
            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
            cycl = cdolist_list_var_$6.first();
          }
          sense_markers = document.word_interps( word );
          new_senses = NIL;
          cdolist_list_var_$8 = sense_markers;
          sense_marker = NIL;
          sense_marker = cdolist_list_var_$8.first();
          while ( NIL != cdolist_list_var_$8)
          {
            if( NIL != is_licensed_p( sense_marker, rdis_rules( rdis ), v_context ) )
            {
              new_senses = ConsesLow.cons( sense_marker, new_senses );
            }
            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
            sense_marker = cdolist_list_var_$8.first();
          }
          if( NIL == new_senses )
          {
            new_senses = sense_markers_not_requiring_licensing( rule_void( sense_markers, rdis_rules( rdis ) ) );
          }
          conses_high.putf( document.word_info( word ), $kw49$INTERPS, new_senses );
          cdolist_list_var_$9 = document.word_cycls( word );
          cycl = NIL;
          cycl = cdolist_list_var_$9.first();
          while ( NIL != cdolist_list_var_$9)
          {
            hash_table_utilities.cinc_hash( cycl, v_context, UNPROVIDED, UNPROVIDED );
            cdolist_list_var_$10 = document_annotation_widgets.get_upwards_closure( cycl );
            genl_cycl = NIL;
            genl_cycl = cdolist_list_var_$10.first();
            while ( NIL != cdolist_list_var_$10)
            {
              hash_table_utilities.cinc_hash( genl_cycl, v_context, UNPROVIDED, UNPROVIDED );
              cdolist_list_var_$10 = cdolist_list_var_$10.rest();
              genl_cycl = cdolist_list_var_$10.first();
            }
            cdolist_list_var_$9 = cdolist_list_var_$9.rest();
            cycl = cdolist_list_var_$9.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 5337L)
  public static SubLObject sense_markers_not_requiring_licensing(final SubLObject sense_markers)
  {
    SubLObject valid_markers = NIL;
    SubLObject cdolist_list_var = sense_markers;
    SubLObject sense_marker = NIL;
    sense_marker = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == list_utilities.tree_find( $const50$VanishinglyRareLexicalMapping, nl_api_datastructures.get_nl_interp_pragmatics( sense_marker ), UNPROVIDED, UNPROVIDED ) && NIL == list_utilities.tree_find(
          $const51$ContextuallyDependentLexicalMappi, nl_api_datastructures.get_nl_interp_pragmatics( sense_marker ), UNPROVIDED, UNPROVIDED ) )
      {
        valid_markers = ConsesLow.cons( sense_marker, valid_markers );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sense_marker = cdolist_list_var.first();
    }
    return valid_markers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 5764L)
  public static SubLObject rule_void(final SubLObject sense_markers, final SubLObject rules)
  {
    SubLObject rule_void = NIL;
    SubLObject cdolist_list_var = sense_markers;
    SubLObject sense_marker = NIL;
    sense_marker = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( file_backed_cache.file_backed_cache_lookup( sense_marker, rules, UNPROVIDED, UNPROVIDED ) == $kw52$NOT_FOUND )
      {
        rule_void = ConsesLow.cons( sense_marker, rule_void );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sense_marker = cdolist_list_var.first();
    }
    return rule_void;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 6093L)
  public static SubLObject load_disambiguator_rules(final SubLObject path)
  {
    if( NIL == Filesys.probe_file( path ) )
    {
      Errors.error( $str53$Can_t_load_rules_from__a, path );
    }
    return file_backed_cache.file_backed_cache_create( path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 6307L)
  public static SubLObject load_disambiguator_counts(final SubLObject path)
  {
    if( NIL == Filesys.probe_file( path ) )
    {
      Errors.error( $str54$Can_t_load_counts_from__a, path );
    }
    return file_backed_cache.file_backed_cache_create( path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 6519L)
  public static SubLObject highest_count_sense_markers(final SubLObject sense_markers, final SubLObject counts)
  {
    SubLObject max_count = ZERO_INTEGER;
    SubLObject highest_count_sense_markers = NIL;
    SubLObject count = NIL;
    SubLObject cdolist_list_var = sense_markers;
    SubLObject sense_marker = NIL;
    sense_marker = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = file_backed_cache.file_backed_cache_lookup( nl_api_datastructures.get_nl_interp_cycl( sense_marker ), counts, ZERO_INTEGER, UNPROVIDED );
      if( count.numG( max_count ) )
      {
        max_count = count;
        highest_count_sense_markers = ConsesLow.list( sense_marker );
      }
      else if( count.numE( max_count ) )
      {
        highest_count_sense_markers = ConsesLow.cons( sense_marker, highest_count_sense_markers );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sense_marker = cdolist_list_var.first();
    }
    return Sequences.nreverse( highest_count_sense_markers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 7224L)
  public static SubLObject ambiguous_p(final SubLObject word)
  {
    return Numbers.numG( Sequences.length( document.word_interps( word ) ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 7384L)
  public static SubLObject is_licensed_p(final SubLObject sense_marker, final SubLObject rules, final SubLObject v_context)
  {
    final SubLObject sense = nl_api_datastructures.get_nl_interp_cycl( sense_marker );
    final SubLObject rule = file_backed_cache.file_backed_cache_lookup( sense, rules, NIL, UNPROVIDED );
    SubLObject is_licensed = NIL;
    SubLObject not_licensed = NIL;
    SubLObject v_term = NIL;
    if( NIL == is_licensed )
    {
      SubLObject csome_list_var = rule;
      SubLObject clause = NIL;
      clause = csome_list_var.first();
      while ( NIL == is_licensed && NIL != csome_list_var)
      {
        if( NIL != positive_clause_p( clause ) )
        {
          v_term = clause_term( clause );
          is_licensed = makeBoolean( NIL != is_licensed || NIL != sense_bag_licensesP( v_term, v_context ) );
        }
        csome_list_var = csome_list_var.rest();
        clause = csome_list_var.first();
      }
    }
    if( NIL != is_licensed && NIL == not_licensed )
    {
      SubLObject csome_list_var = rule;
      SubLObject clause = NIL;
      clause = csome_list_var.first();
      while ( NIL == not_licensed && NIL != csome_list_var)
      {
        if( NIL != negative_clause_p( clause ) )
        {
          v_term = clause_term( clause );
          is_licensed = makeBoolean( NIL != is_licensed && NIL == sense_bag_licensesP( v_term, v_context ) );
          not_licensed = makeBoolean( NIL == is_licensed );
        }
        csome_list_var = csome_list_var.rest();
        clause = csome_list_var.first();
      }
    }
    return is_licensed;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8422L)
  public static SubLObject positive_clause_p(final SubLObject clause)
  {
    return clause_sign( clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8542L)
  public static SubLObject negative_clause_p(final SubLObject clause)
  {
    return makeBoolean( NIL == clause_sign( clause ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8669L)
  public static SubLObject clause_sign(final SubLObject clause)
  {
    return clause.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8760L)
  public static SubLObject clause_term(final SubLObject clause)
  {
    return clause.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8851L)
  public static SubLObject new_sense_bag(final SubLObject doc)
  {
    assert NIL != document.document_p( doc ) : doc;
    final SubLObject senses = Hashtables.make_hash_table( $int55$1024, EQUAL, UNPROVIDED );
    SubLObject sense = NIL;
    final SubLObject vector_var = document.document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$11;
    SubLObject backwardP_var_$12;
    SubLObject length_$13;
    SubLObject v_iteration_$14;
    SubLObject element_num_$15;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    SubLObject cdolist_list_var_$16;
    SubLObject sense_marker;
    SubLObject cdolist_list_var_$17;
    SubLObject general;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$11 = document.paragraph_sentences( paragraph );
      backwardP_var_$12 = NIL;
      for( length_$13 = Sequences.length( vector_var_$11 ), v_iteration_$14 = NIL, v_iteration_$14 = ZERO_INTEGER; v_iteration_$14.numL( length_$13 ); v_iteration_$14 = Numbers.add( v_iteration_$14, ONE_INTEGER ) )
      {
        element_num_$15 = ( ( NIL != backwardP_var_$12 ) ? Numbers.subtract( length_$13, v_iteration_$14, ONE_INTEGER ) : v_iteration_$14 );
        sentence = Vectors.aref( vector_var_$11, element_num_$15 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cdolist_list_var_$16 = document.word_interps( word );
          sense_marker = NIL;
          sense_marker = cdolist_list_var_$16.first();
          while ( NIL != cdolist_list_var_$16)
          {
            sense = nl_api_datastructures.get_nl_interp_cycl( sense_marker );
            hash_table_utilities.cinc_hash( sense, senses, UNPROVIDED, UNPROVIDED );
            cdolist_list_var_$17 = document_annotation_widgets.get_upwards_closure( sense );
            general = NIL;
            general = cdolist_list_var_$17.first();
            while ( NIL != cdolist_list_var_$17)
            {
              hash_table_utilities.cinc_hash( general, senses, UNPROVIDED, UNPROVIDED );
              cdolist_list_var_$17 = cdolist_list_var_$17.rest();
              general = cdolist_list_var_$17.first();
            }
            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
            sense_marker = cdolist_list_var_$16.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return senses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 9387L)
  public static SubLObject sense_bag_licensesP(final SubLObject v_term, final SubLObject v_bag)
  {
    return subl_promotions.positive_integer_p( Hashtables.gethash_without_values( v_term, v_bag, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 9550L)
  public static SubLObject disambiguation_rule_query(final SubLObject pred)
  {
    return ask_utilities.query_template( $list56, reader.bq_cons( pred, $list56 ), $const57$InferencePSC, $list58 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 9968L)
  public static SubLObject create_disambiguator_rules_file(SubLObject f_out)
  {
    if( f_out == UNPROVIDED )
    {
      f_out = $str59$data_word_sense_disambiguation_ru;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject licensing_term_pairs = disambiguation_rule_query( $const60$isLicensedBy );
    final SubLObject delicensing_term_pairs = disambiguation_rule_query( $const61$isDelicensedBy );
    final SubLObject rule_hash_table = Hashtables.make_hash_table( $int62$65536, EQUAL, UNPROVIDED );
    SubLObject cdolist_list_var = licensing_term_pairs;
    SubLObject licensing_term_pair = NIL;
    licensing_term_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      hash_table_utilities.push_hash( licensing_term_pair.first(), ConsesLow.cons( T, conses_high.second( licensing_term_pair ) ), rule_hash_table );
      cdolist_list_var = cdolist_list_var.rest();
      licensing_term_pair = cdolist_list_var.first();
    }
    cdolist_list_var = delicensing_term_pairs;
    SubLObject delicensing_term_pair = NIL;
    delicensing_term_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      hash_table_utilities.push_hash( delicensing_term_pair.first(), ConsesLow.cons( NIL, conses_high.second( delicensing_term_pair ) ), rule_hash_table );
      cdolist_list_var = cdolist_list_var.rest();
      delicensing_term_pair = cdolist_list_var.first();
    }
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( f_out, $kw63$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str64$Unable_to_open__S, f_out );
      }
      final SubLObject s_out = stream;
      final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
      try
      {
        print_high.$print_pretty$.bind( NIL, thread );
        PrintLow.format( s_out, $str65$___ );
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( rule_hash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            value = Hashtables.getEntryValue( cdohash_entry );
            PrintLow.format( s_out, $str66$__S____S___, key, value );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        PrintLow.format( s_out, $str67$___ );
      }
      finally
      {
        print_high.$print_pretty$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return $kw68$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 10880L)
  public static SubLObject fort_disambiguation_rule_query(final SubLObject fort, final SubLObject pred, final SubLObject pstore)
  {
    return ask_utilities.query_template( reader.bq_cons( fort, $list69 ), ConsesLow.listS( pred, fort, $list69 ), $const57$InferencePSC, ConsesLow.list( new SubLObject[] { $kw70$INFERENCE_MODE, $kw71$SHALLOW,
      $kw72$ALLOW_INDETERMINATE_RESULTS_, NIL, $kw73$DISJUNCTION_FREE_EL_VARS_POLICY, $kw74$COMPUTE_INTERSECTION, $kw75$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw76$MINIMAL, $kw77$MAX_TIME, $int78$57600,
      $kw79$PROBABLY_APPROXIMATELY_DONE, $float80$1_0, $kw81$ANSWER_LANGUAGE, $kw82$EL, $kw83$CONTINUABLE_, NIL, $kw84$PROBLEM_STORE, pstore
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 11335L)
  public static SubLObject term_alist_to_file_hash_table(final SubLObject alist, final SubLObject path, SubLObject testfn, SubLObject serialization, SubLObject tempstem)
  {
    if( testfn == UNPROVIDED )
    {
      testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
    }
    if( serialization == UNPROVIDED )
    {
      serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
    }
    if( tempstem == UNPROVIDED )
    {
      tempstem = $str85$_tmp_;
    }
    assert NIL != Types.listp( alist ) : alist;
    assert NIL != Types.stringp( path ) : path;
    final SubLObject fht = file_hash_table.fast_create_file_hash_table( path, tempstem, testfn, serialization );
    SubLObject cdolist_list_var = Sequences.reverse( alist );
    SubLObject keyXvalue = NIL;
    keyXvalue = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject key = keyXvalue.first();
      if( NIL != constant_handles.invalid_constantP( key, UNPROVIDED ) || NIL != narts_high.invalid_nartP( key, UNPROVIDED ) )
      {
        Errors.warn( $str87$_a_is_invalid, key );
      }
      else
      {
        file_hash_table.fast_put_file_hash_table( keyXvalue.first(), fht, keyXvalue.rest() );
      }
      cdolist_list_var = cdolist_list_var.rest();
      keyXvalue = cdolist_list_var.first();
    }
    file_hash_table.finalize_fast_create_file_hash_table( fht, UNPROVIDED, UNPROVIDED );
    return path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 12115L)
  public static SubLObject alist_file_to_fht(final SubLObject infile, final SubLObject outfht)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( infile ) : infile;
    assert NIL != Types.stringp( outfht ) : outfht;
    if( NIL == Filesys.probe_file( infile ) )
    {
      Errors.error( $str88$Can_t_load__a___a, infile, file_utilities.why_not_probe_fileP( infile ) );
    }
    SubLObject alist = NIL;
    final SubLObject hash = Hashtables.make_hash_table( $int55$1024, EQUAL, UNPROVIDED );
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( infile, $kw89$INPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str64$Unable_to_open__S, infile );
      }
      final SubLObject in = stream;
      alist = reader.read( in, T, NIL, UNPROVIDED );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject list_var = alist;
    final SubLObject _prev_bind_2 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str90$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject keyXvalue = NIL;
        keyXvalue = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject key = keyXvalue.first();
          if( NIL != constant_handles.invalid_constantP( key, UNPROVIDED ) || NIL != narts_high.invalid_nartP( key, UNPROVIDED ) )
          {
            Errors.warn( $str87$_a_is_invalid, key );
          }
          else
          {
            Hashtables.sethash( keyXvalue.first(), hash, keyXvalue.rest() );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          keyXvalue = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_9, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_8, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_2, thread );
    }
    return file_hash_table.hash_table_to_file_hash_table( hash, outfht, $str85$_tmp_, EQUAL, $kw91$IMAGE_INDEPENDENT_CFASL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 12774L)
  public static SubLObject disambiguator_rule_fht_to_hl_id_text_file(final SubLObject infht, final SubLObject outfile)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Filesys.probe_file( infht ) )
    {
      Errors.error( $str88$Can_t_load__a___a, infht, file_utilities.why_not_probe_fileP( infht ) );
    }
    final SubLObject fht = file_hash_table.open_file_hash_table_read_only( infht, UNPROVIDED, UNPROVIDED );
    final SubLObject doneP = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( outfile, $kw63$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str64$Unable_to_open__S, outfile );
      }
      final SubLObject out = stream;
      final SubLObject table_var = fht;
      utilities_macros.$progress_note$.setDynamicValue( $str92$Iterating_over_FHT, thread );
      utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.setDynamicValue( file_hash_table.file_hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject continuation = NIL;
          SubLObject next;
          for( SubLObject completeP = NIL; NIL == doneP && NIL == completeP; completeP = Types.sublisp_null( next ) )
          {
            thread.resetMultipleValues();
            final SubLObject the_key = file_hash_table.get_file_hash_table_any( table_var, continuation, NIL );
            final SubLObject the_value = thread.secondMultipleValue();
            next = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL != next )
            {
              final SubLObject key = the_key;
              final SubLObject licensers = the_value;
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              SubLObject licensing_terms = NIL;
              SubLObject cdolist_list_var = licensers;
              SubLObject licenser = NIL;
              licenser = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = licenser;
                SubLObject licensedP = NIL;
                SubLObject v_term = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list93 );
                licensedP = current.first();
                current = ( v_term = current.rest() );
                if( licensedP == T )
                {
                  licensing_terms = ConsesLow.cons( v_term, licensing_terms );
                }
                else
                {
                  Errors.warn( $str94$don_t_know_how_to_convert__A, licensedP );
                }
                cdolist_list_var = cdolist_list_var.rest();
                licenser = cdolist_list_var.first();
              }
              PrintLow.format( out, $str95$_A__A_, kb_utilities.compact_hl_external_id_string( key ), T );
              cdolist_list_var = licensing_terms;
              SubLObject v_term2 = NIL;
              v_term2 = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                PrintLow.format( out, $str96$_A_, kb_utilities.compact_hl_external_id_string( v_term2 ) );
                cdolist_list_var = cdolist_list_var.rest();
                v_term2 = cdolist_list_var.first();
              }
              PrintLow.format( out, $str97$__ );
            }
            continuation = next;
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return outfile;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 13597L)
  public static SubLObject create_disambiguator_rules_file_from_forts(final SubLObject f_out)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( f_out ) : f_out;
    final SubLObject rule_hash_table = Hashtables.make_hash_table( $int62$65536, EQUAL, UNPROVIDED );
    SubLObject store = NIL;
    try
    {
      store = inference_datastructures_problem_store.new_problem_store( $list98 );
      final SubLObject message = $str99$mapping_Cyc_FORTs;
      final SubLObject total = forts.fort_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message );
          SubLObject cdolist_list_var = forts.do_forts_tables();
          SubLObject table_var = NIL;
          table_var = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject idx = table_var;
            if( NIL == id_index.id_index_objects_empty_p( idx, $kw100$SKIP ) )
            {
              final SubLObject idx_$20 = idx;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$20, $kw100$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$20 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject fort;
                SubLObject cdolist_list_var_$21;
                SubLObject pair;
                SubLObject cdolist_list_var_$22;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  fort = Vectors.aref( vector_var, id );
                  if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw100$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( fort ) )
                    {
                      fort = $kw100$SKIP;
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                    cdolist_list_var_$21 = fort_disambiguation_rule_query( fort, $const60$isLicensedBy, store );
                    pair = NIL;
                    pair = cdolist_list_var_$21.first();
                    while ( NIL != cdolist_list_var_$21)
                    {
                      hash_table_utilities.push_hash( pair.first(), ConsesLow.cons( T, conses_high.second( pair ) ), rule_hash_table );
                      cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                      pair = cdolist_list_var_$21.first();
                    }
                    cdolist_list_var_$22 = fort_disambiguation_rule_query( fort, $const61$isDelicensedBy, store );
                    pair = NIL;
                    pair = cdolist_list_var_$22.first();
                    while ( NIL != cdolist_list_var_$22)
                    {
                      hash_table_utilities.push_hash( pair.first(), ConsesLow.cons( NIL, conses_high.second( pair ) ), rule_hash_table );
                      cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                      pair = cdolist_list_var_$22.first();
                    }
                  }
                }
              }
              final SubLObject idx_$21 = idx;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$21 ) || NIL == id_index.id_index_skip_tombstones_p( $kw100$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$21 );
                SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$21 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$21 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw100$SKIP ) ) ? NIL : $kw100$SKIP;
                while ( id2.numL( end_id ))
                {
                  final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw100$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                  {
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                    SubLObject cdolist_list_var_$23 = fort_disambiguation_rule_query( fort2, $const60$isLicensedBy, store );
                    SubLObject pair2 = NIL;
                    pair2 = cdolist_list_var_$23.first();
                    while ( NIL != cdolist_list_var_$23)
                    {
                      hash_table_utilities.push_hash( pair2.first(), ConsesLow.cons( T, conses_high.second( pair2 ) ), rule_hash_table );
                      cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                      pair2 = cdolist_list_var_$23.first();
                    }
                    SubLObject cdolist_list_var_$24 = fort_disambiguation_rule_query( fort2, $const61$isDelicensedBy, store );
                    pair2 = NIL;
                    pair2 = cdolist_list_var_$24.first();
                    while ( NIL != cdolist_list_var_$24)
                    {
                      hash_table_utilities.push_hash( pair2.first(), ConsesLow.cons( NIL, conses_high.second( pair2 ) ), rule_hash_table );
                      cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                      pair2 = cdolist_list_var_$24.first();
                    }
                  }
                  id2 = Numbers.add( id2, ONE_INTEGER );
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_var = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        inference_datastructures_problem_store.destroy_problem_store( store );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( f_out, $kw63$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str64$Unable_to_open__S, f_out );
      }
      final SubLObject s_out = stream;
      final SubLObject _prev_bind_6 = print_high.$print_pretty$.currentBinding( thread );
      try
      {
        print_high.$print_pretty$.bind( NIL, thread );
        PrintLow.format( s_out, $str65$___ );
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( rule_hash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            value = Hashtables.getEntryValue( cdohash_entry );
            PrintLow.format( s_out, $str66$__S____S___, key, value );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        PrintLow.format( s_out, $str67$___ );
      }
      finally
      {
        print_high.$print_pretty$.rebind( _prev_bind_6, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_7, thread );
      }
    }
    return $kw68$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 15516L)
  public static SubLObject create_disambiguator_rules_file_from_fort_list(final SubLObject fort_list, final SubLObject f_out)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( f_out ) : f_out;
    final SubLObject rule_hash_table = Hashtables.make_hash_table( $int62$65536, EQUAL, UNPROVIDED );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str90$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( fort_list ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = fort_list;
        SubLObject fort = NIL;
        fort = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          SubLObject store = NIL;
          try
          {
            store = inference_datastructures_problem_store.new_problem_store( NIL );
            SubLObject cdolist_list_var = fort_disambiguation_rule_query( fort, $const60$isLicensedBy, store );
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              hash_table_utilities.push_hash( pair.first(), ConsesLow.cons( T, conses_high.second( pair ) ), rule_hash_table );
              cdolist_list_var = cdolist_list_var.rest();
              pair = cdolist_list_var.first();
            }
            cdolist_list_var = fort_disambiguation_rule_query( fort, $const61$isDelicensedBy, store );
            pair = NIL;
            pair = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              hash_table_utilities.push_hash( pair.first(), ConsesLow.cons( NIL, conses_high.second( pair ) ), rule_hash_table );
              cdolist_list_var = cdolist_list_var.rest();
              pair = cdolist_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              inference_datastructures_problem_store.destroy_problem_store( store );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          fort = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( f_out, $kw63$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str64$Unable_to_open__S, f_out );
      }
      final SubLObject s_out = stream;
      final SubLObject _prev_bind_9 = print_high.$print_pretty$.currentBinding( thread );
      try
      {
        print_high.$print_pretty$.bind( NIL, thread );
        PrintLow.format( s_out, $str65$___ );
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( rule_hash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            value = Hashtables.getEntryValue( cdohash_entry );
            PrintLow.format( s_out, $str66$__S____S___, key, value );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        PrintLow.format( s_out, $str67$___ );
      }
      finally
      {
        print_high.$print_pretty$.rebind( _prev_bind_9, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_10, thread );
      }
    }
    return $kw68$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 16350L)
  public static SubLObject create_disambiguator_rules_file_from_fort_file_id(final SubLObject file_id_num, SubLObject in_path, SubLObject out_path)
  {
    if( in_path == UNPROVIDED )
    {
      in_path = $str101$_host_george_term_id_lists_;
    }
    if( out_path == UNPROVIDED )
    {
      out_path = $str102$_host_george_disambig_rules_;
    }
    final SubLObject file_name = PrintLow.format( NIL, $str103$_Afort_id__4__0D_cfasl, in_path, file_id_num );
    final SubLObject terms = cfasl_utilities.cfasl_load( file_name );
    final SubLObject out_file_name = PrintLow.format( NIL, $str104$_Adisambiguator_rule_file__4__0D_, out_path, file_id_num );
    return create_disambiguator_rules_file_from_fort_list( terms, out_file_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 16812L)
  public static SubLObject create_rule_disambugation_condor_jobs(final SubLObject count)
  {
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( count ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      PrintLow.format( T, $str105$created_using_CREATE_RULE_DISAMBI );
      PrintLow.format( T, $str106$arguments______progn__load____hom, n );
      PrintLow.format( T, $str107$queue____ );
    }
    return NIL;
  }

  public static SubLObject declare_rule_disambiguation_file()
  {
    SubLFiles.declareMacro( me, "with_new_rule_disambiguator", "WITH-NEW-RULE-DISAMBIGUATOR" );
    SubLFiles.declareFunction( me, "rule_disambiguator_print_function_trampoline", "RULE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rule_disambiguator_p", "RULE-DISAMBIGUATOR-P", 1, 0, false );
    new $rule_disambiguator_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rdis_rule_file", "RDIS-RULE-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "rdis_count_file", "RDIS-COUNT-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "rdis_rules", "RDIS-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdis_counts", "RDIS-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdis_rule_file", "_CSETF-RDIS-RULE-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdis_count_file", "_CSETF-RDIS-COUNT-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdis_rules", "_CSETF-RDIS-RULES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdis_counts", "_CSETF-RDIS-COUNTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rule_disambiguator", "MAKE-RULE-DISAMBIGUATOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rule_disambiguator", "VISIT-DEFSTRUCT-RULE-DISAMBIGUATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rule_disambiguator_method", "VISIT-DEFSTRUCT-OBJECT-RULE-DISAMBIGUATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_rule_disambiguator", "NEW-RULE-DISAMBIGUATOR", 0, 2, false );
    SubLFiles.declareFunction( me, "finalize_rule_disambiguator", "FINALIZE-RULE-DISAMBIGUATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "rdis_print", "RDIS-PRINT", 3, 0, false );
    SubLFiles.declareMacro( me, "with_sense_bag_excepting_word", "WITH-SENSE-BAG-EXCEPTING-WORD" );
    SubLFiles.declareFunction( me, "document_disambiguate_rule_disambiguator_method", "DOCUMENT-DISAMBIGUATE-RULE-DISAMBIGUATOR-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "rdis_disambiguate", "RDIS-DISAMBIGUATE", 2, 1, false );
    SubLFiles.declareFunction( me, "sense_markers_not_requiring_licensing", "SENSE-MARKERS-NOT-REQUIRING-LICENSING", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_void", "RULE-VOID", 2, 0, false );
    SubLFiles.declareFunction( me, "load_disambiguator_rules", "LOAD-DISAMBIGUATOR-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "load_disambiguator_counts", "LOAD-DISAMBIGUATOR-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "highest_count_sense_markers", "HIGHEST-COUNT-SENSE-MARKERS", 2, 0, false );
    SubLFiles.declareFunction( me, "ambiguous_p", "AMBIGUOUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "is_licensed_p", "IS-LICENSED-P", 3, 0, false );
    SubLFiles.declareFunction( me, "positive_clause_p", "POSITIVE-CLAUSE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "negative_clause_p", "NEGATIVE-CLAUSE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clause_sign", "CLAUSE-SIGN", 1, 0, false );
    SubLFiles.declareFunction( me, "clause_term", "CLAUSE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sense_bag", "NEW-SENSE-BAG", 1, 0, false );
    SubLFiles.declareFunction( me, "sense_bag_licensesP", "SENSE-BAG-LICENSES?", 2, 0, false );
    SubLFiles.declareFunction( me, "disambiguation_rule_query", "DISAMBIGUATION-RULE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "create_disambiguator_rules_file", "CREATE-DISAMBIGUATOR-RULES-FILE", 0, 1, false );
    SubLFiles.declareFunction( me, "fort_disambiguation_rule_query", "FORT-DISAMBIGUATION-RULE-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "term_alist_to_file_hash_table", "TERM-ALIST-TO-FILE-HASH-TABLE", 2, 3, false );
    SubLFiles.declareFunction( me, "alist_file_to_fht", "ALIST-FILE-TO-FHT", 2, 0, false );
    SubLFiles.declareFunction( me, "disambiguator_rule_fht_to_hl_id_text_file", "DISAMBIGUATOR-RULE-FHT-TO-HL-ID-TEXT-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "create_disambiguator_rules_file_from_forts", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "create_disambiguator_rules_file_from_fort_list", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORT-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "create_disambiguator_rules_file_from_fort_file_id", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORT-FILE-ID", 1, 2, false );
    SubLFiles.declareFunction( me, "create_rule_disambugation_condor_jobs", "CREATE-RULE-DISAMBUGATION-CONDOR-JOBS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rule_disambiguation_file()
  {
    $word_sense_disambiguation_rule_file$ = SubLFiles.defparameter( "*WORD-SENSE-DISAMBIGUATION-RULE-FILE*", $str0$data_word_sense_disambiguation_ru );
    $word_sense_disambiguation_count_file$ = SubLFiles.defparameter( "*WORD-SENSE-DISAMBIGUATION-COUNT-FILE*", $str1$data_word_sense_disambiguation_co );
    $dtp_rule_disambiguator$ = SubLFiles.defconstant( "*DTP-RULE-DISAMBIGUATOR*", $sym6$RULE_DISAMBIGUATOR );
    return NIL;
  }

  public static SubLObject setup_rule_disambiguation_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rule_disambiguator$.getGlobalValue(), Symbols.symbol_function( $sym13$RULE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list14 );
    Structures.def_csetf( $sym15$RDIS_RULE_FILE, $sym16$_CSETF_RDIS_RULE_FILE );
    Structures.def_csetf( $sym17$RDIS_COUNT_FILE, $sym18$_CSETF_RDIS_COUNT_FILE );
    Structures.def_csetf( $sym19$RDIS_RULES, $sym20$_CSETF_RDIS_RULES );
    Structures.def_csetf( $sym21$RDIS_COUNTS, $sym22$_CSETF_RDIS_COUNTS );
    Equality.identity( $sym6$RULE_DISAMBIGUATOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rule_disambiguator$.getGlobalValue(), Symbols.symbol_function(
        $sym32$VISIT_DEFSTRUCT_OBJECT_RULE_DISAMBIGUATOR_METHOD ) );
    Structures.register_method( document_disambiguation.$document_disambiguate_method_table$.getGlobalValue(), $dtp_rule_disambiguator$.getGlobalValue(), Symbols.symbol_function(
        $sym46$DOCUMENT_DISAMBIGUATE_RULE_DISAMBIGUATOR_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rule_disambiguation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rule_disambiguation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rule_disambiguation_file();
  }
  static
  {
    me = new rule_disambiguation();
    $word_sense_disambiguation_rule_file$ = null;
    $word_sense_disambiguation_count_file$ = null;
    $dtp_rule_disambiguator$ = null;
    $str0$data_word_sense_disambiguation_ru = makeString( "data/word-sense-disambiguation-rules.fht" );
    $str1$data_word_sense_disambiguation_co = makeString( "data/word-sense-disambiguation-counts.fht" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DISAMBIGUATOR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym3$CLET = makeSymbol( "CLET" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-RULE-DISAMBIGUATOR" ) ) );
    $sym5$FINALIZE_RULE_DISAMBIGUATOR = makeSymbol( "FINALIZE-RULE-DISAMBIGUATOR" );
    $sym6$RULE_DISAMBIGUATOR = makeSymbol( "RULE-DISAMBIGUATOR" );
    $sym7$RULE_DISAMBIGUATOR_P = makeSymbol( "RULE-DISAMBIGUATOR-P" );
    $list8 = ConsesLow.list( makeSymbol( "RULE-FILE" ), makeSymbol( "COUNT-FILE" ), makeSymbol( "RULES" ), makeSymbol( "COUNTS" ) );
    $list9 = ConsesLow.list( makeKeyword( "RULE-FILE" ), makeKeyword( "COUNT-FILE" ), makeKeyword( "RULES" ), makeKeyword( "COUNTS" ) );
    $list10 = ConsesLow.list( makeSymbol( "RDIS-RULE-FILE" ), makeSymbol( "RDIS-COUNT-FILE" ), makeSymbol( "RDIS-RULES" ), makeSymbol( "RDIS-COUNTS" ) );
    $list11 = ConsesLow.list( makeSymbol( "_CSETF-RDIS-RULE-FILE" ), makeSymbol( "_CSETF-RDIS-COUNT-FILE" ), makeSymbol( "_CSETF-RDIS-RULES" ), makeSymbol( "_CSETF-RDIS-COUNTS" ) );
    $sym12$RDIS_PRINT = makeSymbol( "RDIS-PRINT" );
    $sym13$RULE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RULE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list14 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RULE-DISAMBIGUATOR-P" ) );
    $sym15$RDIS_RULE_FILE = makeSymbol( "RDIS-RULE-FILE" );
    $sym16$_CSETF_RDIS_RULE_FILE = makeSymbol( "_CSETF-RDIS-RULE-FILE" );
    $sym17$RDIS_COUNT_FILE = makeSymbol( "RDIS-COUNT-FILE" );
    $sym18$_CSETF_RDIS_COUNT_FILE = makeSymbol( "_CSETF-RDIS-COUNT-FILE" );
    $sym19$RDIS_RULES = makeSymbol( "RDIS-RULES" );
    $sym20$_CSETF_RDIS_RULES = makeSymbol( "_CSETF-RDIS-RULES" );
    $sym21$RDIS_COUNTS = makeSymbol( "RDIS-COUNTS" );
    $sym22$_CSETF_RDIS_COUNTS = makeSymbol( "_CSETF-RDIS-COUNTS" );
    $kw23$RULE_FILE = makeKeyword( "RULE-FILE" );
    $kw24$COUNT_FILE = makeKeyword( "COUNT-FILE" );
    $kw25$RULES = makeKeyword( "RULES" );
    $kw26$COUNTS = makeKeyword( "COUNTS" );
    $str27$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw28$BEGIN = makeKeyword( "BEGIN" );
    $sym29$MAKE_RULE_DISAMBIGUATOR = makeSymbol( "MAKE-RULE-DISAMBIGUATOR" );
    $kw30$SLOT = makeKeyword( "SLOT" );
    $kw31$END = makeKeyword( "END" );
    $sym32$VISIT_DEFSTRUCT_OBJECT_RULE_DISAMBIGUATOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RULE-DISAMBIGUATOR-METHOD" );
    $sym33$STRINGP = makeSymbol( "STRINGP" );
    $str34$__RULE_DISAMBIGUATOR_ = makeString( "#<RULE-DISAMBIGUATOR " );
    $str35$_ = makeString( " " );
    $str36$_ = makeString( ">" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "BAG" ), makeSymbol( "WORD" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$CYCL = makeUninternedSymbol( "CYCL" );
    $sym39$GENL_CYCL = makeUninternedSymbol( "GENL-CYCL" );
    $sym40$PROGN = makeSymbol( "PROGN" );
    $sym41$CDOLIST = makeSymbol( "CDOLIST" );
    $sym42$WORD_CYCLS = makeSymbol( "WORD-CYCLS" );
    $sym43$CINC_HASH = makeSymbol( "CINC-HASH" );
    $list44 = ConsesLow.list( MINUS_ONE_INTEGER );
    $sym45$GET_UPWARDS_CLOSURE = makeSymbol( "GET-UPWARDS-CLOSURE" );
    $sym46$DOCUMENT_DISAMBIGUATE_RULE_DISAMBIGUATOR_METHOD = makeSymbol( "DOCUMENT-DISAMBIGUATE-RULE-DISAMBIGUATOR-METHOD" );
    $sym47$DOCUMENT_P = makeSymbol( "DOCUMENT-P" );
    $sym48$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $kw49$INTERPS = makeKeyword( "INTERPS" );
    $const50$VanishinglyRareLexicalMapping = constant_handles.reader_make_constant_shell( makeString( "VanishinglyRareLexicalMapping" ) );
    $const51$ContextuallyDependentLexicalMappi = constant_handles.reader_make_constant_shell( makeString( "ContextuallyDependentLexicalMapping" ) );
    $kw52$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $str53$Can_t_load_rules_from__a = makeString( "Can't load rules from ~a" );
    $str54$Can_t_load_counts_from__a = makeString( "Can't load counts from ~a" );
    $int55$1024 = makeInteger( 1024 );
    $list56 = ConsesLow.list( makeSymbol( "?X" ), makeSymbol( "?Y" ) );
    $const57$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list58 = ConsesLow.list( new SubLObject[] { makeKeyword( "INFERENCE-MODE" ), makeKeyword( "SHALLOW" ), makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL, makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" ),
      makeKeyword( "COMPUTE-INTERSECTION" ), makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "MINIMAL" ), makeKeyword( "MAX-TIME" ), makeInteger( 57600 ), makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ),
      makeDouble( 1.0 ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "EL" ), makeKeyword( "CONTINUABLE?" ), NIL
    } );
    $str59$data_word_sense_disambiguation_ru = makeString( "data/word-sense-disambiguation-rules.txt" );
    $const60$isLicensedBy = constant_handles.reader_make_constant_shell( makeString( "isLicensedBy" ) );
    $const61$isDelicensedBy = constant_handles.reader_make_constant_shell( makeString( "isDelicensedBy" ) );
    $int62$65536 = makeInteger( 65536 );
    $kw63$OUTPUT = makeKeyword( "OUTPUT" );
    $str64$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str65$___ = makeString( "(~%" );
    $str66$__S____S___ = makeString( "(~S . ~S)~%" );
    $str67$___ = makeString( ")~%" );
    $kw68$DONE = makeKeyword( "DONE" );
    $list69 = ConsesLow.list( makeSymbol( "?LICENSOR" ) );
    $kw70$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw71$SHALLOW = makeKeyword( "SHALLOW" );
    $kw72$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw73$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw74$COMPUTE_INTERSECTION = makeKeyword( "COMPUTE-INTERSECTION" );
    $kw75$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw76$MINIMAL = makeKeyword( "MINIMAL" );
    $kw77$MAX_TIME = makeKeyword( "MAX-TIME" );
    $int78$57600 = makeInteger( 57600 );
    $kw79$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $float80$1_0 = makeDouble( 1.0 );
    $kw81$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw82$EL = makeKeyword( "EL" );
    $kw83$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw84$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $str85$_tmp_ = makeString( "/tmp/" );
    $sym86$LISTP = makeSymbol( "LISTP" );
    $str87$_a_is_invalid = makeString( "~a is invalid" );
    $str88$Can_t_load__a___a = makeString( "Can't load ~a: ~a" );
    $kw89$INPUT = makeKeyword( "INPUT" );
    $str90$cdolist = makeString( "cdolist" );
    $kw91$IMAGE_INDEPENDENT_CFASL = makeKeyword( "IMAGE-INDEPENDENT-CFASL" );
    $str92$Iterating_over_FHT = makeString( "Iterating over FHT" );
    $list93 = ConsesLow.cons( makeSymbol( "LICENSED?" ), makeSymbol( "TERM" ) );
    $str94$don_t_know_how_to_convert__A = makeString( "don't know how to convert ~A" );
    $str95$_A__A_ = makeString( "~A,~A," );
    $str96$_A_ = makeString( "~A," );
    $str97$__ = makeString( "~%" );
    $list98 = ConsesLow.list( makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" ), makeKeyword( "MINIMAL" ) );
    $str99$mapping_Cyc_FORTs = makeString( "mapping Cyc FORTs" );
    $kw100$SKIP = makeKeyword( "SKIP" );
    $str101$_host_george_term_id_lists_ = makeString( "/host/george/term-id-lists/" );
    $str102$_host_george_disambig_rules_ = makeString( "/host/george/disambig-rules/" );
    $str103$_Afort_id__4__0D_cfasl = makeString( "~Afort-id-~4,'0D.cfasl" );
    $str104$_Adisambiguator_rule_file__4__0D_ = makeString( "~Adisambiguator-rule-file-~4,'0D.txt" );
    $str105$created_using_CREATE_RULE_DISAMBI = makeString( "created using CREATE-RULE-DISAMBIGUATION-CONDOR-JOBS in RULE-DISAMBIGUATION" );
    $str106$arguments______progn__load____hom = makeString(
        "arguments = \"'(progn (load \"\"/home/daves/cycl/rule-disambiguation.lisp\"\") (load-transcript-file \"\"/cyc/top/transcripts/0917/billie-20061025103022-21843-local-0-sent.ts\"\" nil :none) (load-transcript-file \"\"/cyc/top/transcripts/0917/billie-20061025103022-21843-local-1-sent.ts\"\" nil :none) (create-disambiguator-rules-file-from-fort-file-id ~A))'\"~%" );
    $str107$queue____ = makeString( "queue~%~%" );
  }

  public static final class $rule_disambiguator_native
      extends
        SubLStructNative
  {
    public SubLObject $rule_file;
    public SubLObject $count_file;
    public SubLObject $rules;
    public SubLObject $counts;
    private static final SubLStructDeclNative structDecl;

    public $rule_disambiguator_native()
    {
      this.$rule_file = CommonSymbols.NIL;
      this.$count_file = CommonSymbols.NIL;
      this.$rules = CommonSymbols.NIL;
      this.$counts = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rule_disambiguator_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$rule_file;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$count_file;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$rules;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$counts;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$rule_file = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$count_file = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$rules = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$counts = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rule_disambiguator_native.class, $sym6$RULE_DISAMBIGUATOR, $sym7$RULE_DISAMBIGUATOR_P, $list8, $list9, new String[] { "$rule_file", "$count_file", "$rules", "$counts"
      }, $list10, $list11, $sym12$RDIS_PRINT );
    }
  }

  public static final class $rule_disambiguator_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rule_disambiguator_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RULE-DISAMBIGUATOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rule_disambiguator_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 755 ms
 * 
 */