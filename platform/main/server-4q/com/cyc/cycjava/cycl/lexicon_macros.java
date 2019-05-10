package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexicon_macros";
  public static final String myFingerPrint = "e4c748af1818ebbbecd6d689fb27405affb060fcccbfd84b3fe7ae66698aa126";
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2398L)
  public static SubLSymbol $nl_trie_assumed_validP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2763L)
  public static SubLSymbol $nl_trie_accessor_default_case_sensitivity$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 4278L)
  public static SubLSymbol $nl_trie_subword_index_default_case_sensitivity$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5584L)
  public static SubLSymbol $nl_trie_assume_standardized_stringsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5994L)
  public static SubLSymbol $lexicon_memoization_state$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLSymbol $sym2$_EXCLUDE_VULGARITIES__;
  private static final SubLSymbol $sym3$MEMBER_;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_EXCLUDE_SLANG__;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$_EXCLUDE_ARCHAIC_SPEECH__;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$_EXCLUDE_INDIRECT_RELATIONS__;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLObject $const12$LexicalAffix;
  private static final SubLString $str13$Mapping_reified_affixes;
  private static final SubLSymbol $sym14$TOTAL;
  private static final SubLSymbol $sym15$SO_FAR;
  private static final SubLSymbol $sym16$REIFIED_AFFIXES;
  private static final SubLSymbol $sym17$ALL_FORT_INSTANCES;
  private static final SubLSymbol $sym18$LENGTH;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym21$CDOLIST;
  private static final SubLSymbol $sym22$CINC;
  private static final SubLSymbol $sym23$NOTE_PERCENT_PROGRESS;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw27$MT;
  private static final SubLSymbol $kw28$ANY;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$PWHEN;
  private static final SubLSymbol $sym31$DERIVED_PRED_;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $kw34$DONE;
  private static final SubLSymbol $sym35$RULE;
  private static final SubLSymbol $sym36$CSOME;
  private static final SubLSymbol $sym37$SUFFIX_RULES_FOR_PRED;
  private static final SubLSymbol $sym38$CDESTRUCTURING_BIND;
  private static final SubLSymbol $sym39$REST;
  private static final SubLSymbol $sym40$GAF_ARGS;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$OFF;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_;
  private static final SubLSymbol $sym45$FIF;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$CNOT;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$_NL_TRIE_SUBWORD_INDEX_DEFAULT_CASE_SENSITIVITY_;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$WITH_MEMOIZATION_STATE;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE;
  private static final SubLSymbol $sym61$WITH_LEXICON_MEMOIZATION;
  private static final SubLSymbol $kw62$REUSED;
  private static final SubLSymbol $kw63$NEW;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$PROGN;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$_USE_SME_LEXWIZ_;
  private static final SubLSymbol $sym70$WITH_SME_LEXWIZ_CONDITIONED;

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 754L)
  public static SubLObject with_lexicon_filters(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject filters = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    filters = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym2$_EXCLUDE_VULGARITIES__, ConsesLow.list( $sym3$MEMBER_, $list4, filters ) ), ConsesLow.list( $sym5$_EXCLUDE_SLANG__, ConsesLow.list(
        $sym3$MEMBER_, $list6, filters ) ), ConsesLow.list( $sym7$_EXCLUDE_ARCHAIC_SPEECH__, ConsesLow.list( $sym3$MEMBER_, $list8, filters ) ), ConsesLow.list( $sym9$_EXCLUDE_INDIRECT_RELATIONS__, ConsesLow.list(
            $sym3$MEMBER_, $list10, filters ) ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 1216L)
  public static SubLObject do_reified_affixes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject reified_affix = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    reified_affix = current.first();
    current = current.rest();
    final SubLObject affix_type = current.isCons() ? current.first() : $const12$LexicalAffix;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list11 );
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str13$Mapping_reified_affixes;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list11 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject total = $sym14$TOTAL;
      final SubLObject so_far = $sym15$SO_FAR;
      final SubLObject reified_affixes = $sym16$REIFIED_AFFIXES;
      return ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( reified_affixes, ConsesLow.list( $sym17$ALL_FORT_INSTANCES, affix_type ) ), ConsesLow.list( total, ConsesLow.list( $sym18$LENGTH,
          reified_affixes ) ), reader.bq_cons( so_far, $list19 ) ), ConsesLow.list( $sym20$NOTING_PERCENT_PROGRESS, message, ConsesLow.listS( $sym21$CDOLIST, ConsesLow.list( reified_affix, reified_affixes ), ConsesLow
              .append( body, ConsesLow.list( ConsesLow.list( $sym22$CINC, so_far ), ConsesLow.list( $sym23$NOTE_PERCENT_PROGRESS, so_far, total ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 1847L)
  public static SubLObject do_derived_preds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject derived_pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    derived_pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list24 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list24 );
      if( NIL == conses_high.member( current_$1, $list25, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw26$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw27$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : $kw28$ANY;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym21$CDOLIST, reader.bq_cons( derived_pred, $list29 ), ConsesLow.listS( $sym30$PWHEN, ConsesLow.list( $sym31$DERIVED_PRED_, derived_pred, mt ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2129L)
  public static SubLObject do_suffix_rules_for_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject base_pred = NIL;
    SubLObject suffix = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    base_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    suffix = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list32 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list32 );
      if( NIL == conses_high.member( current_$2, $list33, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw26$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw34$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject rule = $sym35$RULE;
    return ConsesLow.list( $sym36$CSOME, ConsesLow.list( rule, ConsesLow.list( $sym37$SUFFIX_RULES_FOR_PRED, pred ), done ), ConsesLow.listS( $sym38$CDESTRUCTURING_BIND, ConsesLow.list( base_pred, suffix ), ConsesLow
        .list( $sym39$REST, ConsesLow.list( $sym40$GAF_ARGS, rule ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2512L)
  public static SubLObject assuming_nl_trie_validity(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list41, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2685L)
  public static SubLObject assume_nl_trie_validP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $nl_trie_assumed_validP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 3058L)
  public static SubLObject with_nl_trie_case_sensitivity_boolean(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject bool = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
    bool = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym44$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_, ConsesLow.listS( $sym45$FIF, bool, $list46 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 3360L)
  public static SubLObject with_nl_trie_case_sensitivity_on(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list47, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 3567L)
  public static SubLObject with_nl_trie_case_sensitivity_off(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list48, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 3778L)
  public static SubLObject with_nl_trie_case_sensitivity_preferred(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list49, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 4009L)
  public static SubLObject with_nl_trie_case_sensitivity_on_unless(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    test = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym44$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_, ConsesLow.listS( $sym45$FIF, ConsesLow.list( $sym51$CNOT, test ), $list46 ) ) ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 4590L)
  public static SubLObject with_nl_trie_subword_index_case_sensitivity_on(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list52, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 4816L)
  public static SubLObject with_nl_trie_subword_index_case_sensitivity_off(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list53, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5046L)
  public static SubLObject with_nl_trie_subword_index_case_sensitivity_preferred(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list54, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5296L)
  public static SubLObject with_nl_trie_subword_index_case_sensitivity_on_unless(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    test = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym55$_NL_TRIE_SUBWORD_INDEX_DEFAULT_CASE_SENSITIVITY_, ConsesLow.listS( $sym45$FIF, ConsesLow.list( $sym51$CNOT, test ), $list46 ) ) ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5740L)
  public static SubLObject with_nl_trie_standard_strings(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list56, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 6111L)
  public static SubLObject with_lexicon_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym1$CLET, $list57, ConsesLow.listS( $sym58$WITH_MEMOIZATION_STATE, $list59, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 6574L)
  public static SubLObject find_or_create_lexicon_memoization_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != memoization_state.memoization_state_p( $lexicon_memoization_state$.getDynamicValue( thread ) ) ) ? Values.values( $lexicon_memoization_state$.getDynamicValue( thread ), $kw62$REUSED )
        : Values.values( memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $kw63$NEW );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 6834L)
  public static SubLObject parsing_morphologically_as_fallback(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fallbackP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    fallbackP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym65$PROGN, ConsesLow.listS( $sym1$CLET, $list66, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym30$PWHEN, fallbackP, ConsesLow.listS( $sym1$CLET, $list67, ConsesLow.append( body,
          NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 7189L)
  public static SubLObject with_sme_lexwiz_conditioned(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject use_sme_lexwizP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    use_sme_lexwizP = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym69$_USE_SME_LEXWIZ_, use_sme_lexwizP ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 7474L)
  public static SubLObject with_sme_lexwiz(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym70$WITH_SME_LEXWIZ_CONDITIONED, T, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 7766L)
  public static SubLObject with_oe_lexwiz(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym70$WITH_SME_LEXWIZ_CONDITIONED, NIL, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_lexicon_macros_file()
  {
    SubLFiles.declareMacro( me, "with_lexicon_filters", "WITH-LEXICON-FILTERS" );
    SubLFiles.declareMacro( me, "do_reified_affixes", "DO-REIFIED-AFFIXES" );
    SubLFiles.declareMacro( me, "do_derived_preds", "DO-DERIVED-PREDS" );
    SubLFiles.declareMacro( me, "do_suffix_rules_for_pred", "DO-SUFFIX-RULES-FOR-PRED" );
    SubLFiles.declareMacro( me, "assuming_nl_trie_validity", "ASSUMING-NL-TRIE-VALIDITY" );
    SubLFiles.declareFunction( me, "assume_nl_trie_validP", "ASSUME-NL-TRIE-VALID?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_nl_trie_case_sensitivity_boolean", "WITH-NL-TRIE-CASE-SENSITIVITY-BOOLEAN" );
    SubLFiles.declareMacro( me, "with_nl_trie_case_sensitivity_on", "WITH-NL-TRIE-CASE-SENSITIVITY-ON" );
    SubLFiles.declareMacro( me, "with_nl_trie_case_sensitivity_off", "WITH-NL-TRIE-CASE-SENSITIVITY-OFF" );
    SubLFiles.declareMacro( me, "with_nl_trie_case_sensitivity_preferred", "WITH-NL-TRIE-CASE-SENSITIVITY-PREFERRED" );
    SubLFiles.declareMacro( me, "with_nl_trie_case_sensitivity_on_unless", "WITH-NL-TRIE-CASE-SENSITIVITY-ON-UNLESS" );
    SubLFiles.declareMacro( me, "with_nl_trie_subword_index_case_sensitivity_on", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON" );
    SubLFiles.declareMacro( me, "with_nl_trie_subword_index_case_sensitivity_off", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-OFF" );
    SubLFiles.declareMacro( me, "with_nl_trie_subword_index_case_sensitivity_preferred", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-PREFERRED" );
    SubLFiles.declareMacro( me, "with_nl_trie_subword_index_case_sensitivity_on_unless", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON-UNLESS" );
    SubLFiles.declareMacro( me, "with_nl_trie_standard_strings", "WITH-NL-TRIE-STANDARD-STRINGS" );
    SubLFiles.declareMacro( me, "with_lexicon_memoization", "WITH-LEXICON-MEMOIZATION" );
    SubLFiles.declareFunction( me, "find_or_create_lexicon_memoization_state", "FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE", 0, 0, false );
    SubLFiles.declareMacro( me, "parsing_morphologically_as_fallback", "PARSING-MORPHOLOGICALLY-AS-FALLBACK" );
    SubLFiles.declareMacro( me, "with_sme_lexwiz_conditioned", "WITH-SME-LEXWIZ-CONDITIONED" );
    SubLFiles.declareMacro( me, "with_sme_lexwiz", "WITH-SME-LEXWIZ" );
    SubLFiles.declareMacro( me, "with_oe_lexwiz", "WITH-OE-LEXWIZ" );
    return NIL;
  }

  public static SubLObject init_lexicon_macros_file()
  {
    $nl_trie_assumed_validP$ = SubLFiles.defparameter( "*NL-TRIE-ASSUMED-VALID?*", NIL );
    $nl_trie_accessor_default_case_sensitivity$ = SubLFiles.defparameter( "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*", $kw42$OFF );
    $nl_trie_subword_index_default_case_sensitivity$ = SubLFiles.defparameter( "*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*", $kw42$OFF );
    $nl_trie_assume_standardized_stringsP$ = SubLFiles.defparameter( "*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*", NIL );
    $lexicon_memoization_state$ = SubLFiles.defparameter( "*LEXICON-MEMOIZATION-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_lexicon_macros_file()
  {
    access_macros.register_macro_helper( $sym60$FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE, $sym61$WITH_LEXICON_MEMOIZATION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_macros_file();
  }
  static
  {
    me = new lexicon_macros();
    $nl_trie_assumed_validP$ = null;
    $nl_trie_accessor_default_case_sensitivity$ = null;
    $nl_trie_subword_index_default_case_sensitivity$ = null;
    $nl_trie_assume_standardized_stringsP$ = null;
    $lexicon_memoization_state$ = null;
    $list0 = ConsesLow.list( makeSymbol( "FILTERS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $sym2$_EXCLUDE_VULGARITIES__ = makeSymbol( "*EXCLUDE-VULGARITIES?*" );
    $sym3$MEMBER_ = makeSymbol( "MEMBER?" );
    $list4 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*EXCLUDE-VULGARITIES?*" ) );
    $sym5$_EXCLUDE_SLANG__ = makeSymbol( "*EXCLUDE-SLANG?*" );
    $list6 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*EXCLUDE-SLANG?*" ) );
    $sym7$_EXCLUDE_ARCHAIC_SPEECH__ = makeSymbol( "*EXCLUDE-ARCHAIC-SPEECH?*" );
    $list8 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*EXCLUDE-ARCHAIC-SPEECH?*" ) );
    $sym9$_EXCLUDE_INDIRECT_RELATIONS__ = makeSymbol( "*EXCLUDE-INDIRECT-RELATIONS?*" );
    $list10 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*EXCLUDE-INDIRECT-RELATIONS?*" ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "REIFIED-AFFIX" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "AFFIX-TYPE" ), constant_handles.reader_make_constant_shell( makeString(
        "LexicalAffix" ) ) ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "Mapping reified affixes" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $const12$LexicalAffix = constant_handles.reader_make_constant_shell( makeString( "LexicalAffix" ) );
    $str13$Mapping_reified_affixes = makeString( "Mapping reified affixes" );
    $sym14$TOTAL = makeUninternedSymbol( "TOTAL" );
    $sym15$SO_FAR = makeUninternedSymbol( "SO-FAR" );
    $sym16$REIFIED_AFFIXES = makeUninternedSymbol( "REIFIED-AFFIXES" );
    $sym17$ALL_FORT_INSTANCES = makeSymbol( "ALL-FORT-INSTANCES" );
    $sym18$LENGTH = makeSymbol( "LENGTH" );
    $list19 = ConsesLow.list( ZERO_INTEGER );
    $sym20$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym21$CDOLIST = makeSymbol( "CDOLIST" );
    $sym22$CINC = makeSymbol( "CINC" );
    $sym23$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "DERIVED-PRED" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "MT" ), makeKeyword( "ANY" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list25 = ConsesLow.list( makeKeyword( "MT" ) );
    $kw26$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw27$MT = makeKeyword( "MT" );
    $kw28$ANY = makeKeyword( "ANY" );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "HASH-TABLE-KEYS" ), ConsesLow.list( makeSymbol( "DERIVED-PREDS" ) ) ) );
    $sym30$PWHEN = makeSymbol( "PWHEN" );
    $sym31$DERIVED_PRED_ = makeSymbol( "DERIVED-PRED?" );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "BASE-PRED" ), makeSymbol( "SUFFIX" ), makeSymbol( "PRED" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list33 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw34$DONE = makeKeyword( "DONE" );
    $sym35$RULE = makeUninternedSymbol( "RULE" );
    $sym36$CSOME = makeSymbol( "CSOME" );
    $sym37$SUFFIX_RULES_FOR_PRED = makeSymbol( "SUFFIX-RULES-FOR-PRED" );
    $sym38$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym39$REST = makeSymbol( "REST" );
    $sym40$GAF_ARGS = makeSymbol( "GAF-ARGS" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NL-TRIE-ASSUMED-VALID?*" ), T ) );
    $kw42$OFF = makeKeyword( "OFF" );
    $list43 = ConsesLow.list( ConsesLow.list( makeSymbol( "BOOL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym44$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_ = makeSymbol( "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" );
    $sym45$FIF = makeSymbol( "FIF" );
    $list46 = ConsesLow.list( makeKeyword( "ON" ), makeKeyword( "OFF" ) );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" ), makeKeyword( "ON" ) ) );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" ), makeKeyword( "OFF" ) ) );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" ), makeKeyword( "PREFERRED" ) ) );
    $list50 = ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym51$CNOT = makeSymbol( "CNOT" );
    $list52 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*" ), makeKeyword( "ON" ) ) );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*" ), makeKeyword( "OFF" ) ) );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*" ), makeKeyword( "PREFERRED" ) ) );
    $sym55$_NL_TRIE_SUBWORD_INDEX_DEFAULT_CASE_SENSITIVITY_ = makeSymbol( "*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*" ), T ) );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-STATE" ), ConsesLow.list( makeSymbol( "CURRENT-MEMOIZATION-STATE" ) ) ), ConsesLow.list( makeSymbol( "*LEXICON-MEMOIZATION-STATE*" ), ConsesLow.list(
        makeSymbol( "FIRST-OF" ), makeSymbol( "CURRENT-STATE" ), ConsesLow.list( makeSymbol( "FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE" ) ) ) ) );
    $sym58$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $list59 = ConsesLow.list( makeSymbol( "*LEXICON-MEMOIZATION-STATE*" ) );
    $sym60$FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE = makeSymbol( "FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE" );
    $sym61$WITH_LEXICON_MEMOIZATION = makeSymbol( "WITH-LEXICON-MEMOIZATION" );
    $kw62$REUSED = makeKeyword( "REUSED" );
    $kw63$NEW = makeKeyword( "NEW" );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "FALLBACK?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym65$PROGN = makeSymbol( "PROGN" );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PARSE-MORPHOLOGICALLY*" ), makeKeyword( "NEVER" ) ) );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PARSE-MORPHOLOGICALLY*" ), makeKeyword( "ONLY" ) ) );
    $list68 = ConsesLow.list( makeSymbol( "USE-SME-LEXWIZ?" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym69$_USE_SME_LEXWIZ_ = makeSymbol( "*USE-SME-LEXWIZ*" );
    $sym70$WITH_SME_LEXWIZ_CONDITIONED = makeSymbol( "WITH-SME-LEXWIZ-CONDITIONED" );
  }
}
/*
 * 
 * Total time: 129 ms
 * 
 */