package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_parameter_declarations
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_parameter_declarations";
  public static final String myFingerPrint = "9d1b582b4408a7178612c25a37a91116d8f0d229a64d146da94c38b834494738";
  private static final SubLSymbol $sym0$SET_PPH_LEXICAL_CONTEXT_INTERNAL;
  private static final SubLSymbol $sym1$SET_PPH_LEXICAL_CONTEXT;
  private static final SubLSymbol $sym2$LEXICAL_CONTEXT_P;
  private static final SubLSymbol $sym3$PPH_MUTABLE_API_PARAMS_P;
  private static final SubLSymbol $kw4$PPH_LEXICAL_CONTEXT;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PARAMS;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$SETTER;
  private static final SubLSymbol $sym9$SET_PPH_SEMANTIC_MT_INTERNAL;
  private static final SubLSymbol $sym10$SET_PPH_SEMANTIC_MT;
  private static final SubLSymbol $sym11$HLMT_P;
  private static final SubLSymbol $kw12$PPH_SEMANTIC_MT;
  private static final SubLSymbol $sym13$PARAMS;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$SET_PPH_BACKGROUND_DISCOURSE_INTERNAL;
  private static final SubLSymbol $sym16$SET_PPH_BACKGROUND_DISCOURSE;
  private static final SubLSymbol $sym17$TRUE;
  private static final SubLSymbol $kw18$PPH_BACKGROUND_DISCOURSE;
  private static final SubLSymbol $sym19$PARAMS;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL;
  private static final SubLSymbol $sym22$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE;
  private static final SubLSymbol $kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE;
  private static final SubLSymbol $sym24$PARAMS;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$SET_PPH_GENERATION_COUNT_INTERNAL;
  private static final SubLSymbol $sym27$SET_PPH_GENERATION_COUNT;
  private static final SubLSymbol $sym28$POSITIVE_POTENTIALLY_INFINITE_INTEGER_P;
  private static final SubLSymbol $kw29$PPH_GENERATION_COUNT;
  private static final SubLSymbol $sym30$PARAMS;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$SET_PPH_AGREEMENT_INTERNAL;
  private static final SubLSymbol $sym33$SET_PPH_AGREEMENT;
  private static final SubLSymbol $sym34$VALID_EXTERNAL_PPH_NL_PREDS_;
  private static final SubLSymbol $kw35$PPH_AGREEMENT;
  private static final SubLSymbol $sym36$PARAMS;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$SET_PPH_SENTENTIAL_FORCE_INTERNAL;
  private static final SubLSymbol $sym39$SET_PPH_SENTENTIAL_FORCE;
  private static final SubLSymbol $sym40$PPH_FORCE_P;
  private static final SubLSymbol $kw41$PPH_SENTENTIAL_FORCE;
  private static final SubLSymbol $sym42$PARAMS;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$SET_PPH_TIMEOUT_INTERNAL;
  private static final SubLSymbol $sym45$SET_PPH_TIMEOUT;
  private static final SubLSymbol $kw46$PPH_TIMEOUT;
  private static final SubLSymbol $sym47$PARAMS;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$TOP_LEVEL;
  private static final SubLSymbol $sym50$TOP_LEVEL_PPH_API_PARAM_P;
  private static final SubLSymbol $sym51$SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL;
  private static final SubLSymbol $sym52$SET_MAX_DIGITS_WITHOUT_COMMA;
  private static final SubLSymbol $kw53$MAX_DIGITS_WITHOUT_COMMA;
  private static final SubLSymbol $sym54$PARAMS;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL;
  private static final SubLSymbol $sym57$SET_SIGNIFICANT_DIGITS_CUTOFF;
  private static final SubLSymbol $kw58$SIGNIFICANT_DIGITS_CUTOFF;
  private static final SubLSymbol $sym59$PARAMS;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$SET_USE_INDEXICAL_DATES__INTERNAL;
  private static final SubLSymbol $sym62$SET_USE_INDEXICAL_DATES_;
  private static final SubLSymbol $sym63$BOOLEANP;
  private static final SubLSymbol $kw64$USE_INDEXICAL_DATES_;
  private static final SubLSymbol $sym65$PARAMS;
  private static final SubLList $list66;
  private static final SubLSymbol $kw67$PPH_FORMAT;
  private static final SubLSymbol $sym68$PPH_FORMAT_PARAM_P;
  private static final SubLSymbol $sym69$SET_DEMERIT_CUTOFF_INTERNAL;
  private static final SubLSymbol $sym70$SET_DEMERIT_CUTOFF;
  private static final SubLSymbol $sym71$NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P;
  private static final SubLSymbol $kw72$DEMERIT_CUTOFF;
  private static final SubLSymbol $sym73$PARAMS;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL;
  private static final SubLSymbol $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_;
  private static final SubLSymbol $kw77$USE_SMART_VARIABLE_REPLACEMENT_;
  private static final SubLSymbol $sym78$PARAMS;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL;
  private static final SubLSymbol $sym81$SET_GENLPREDS_BACKOFF_LIMIT;
  private static final SubLSymbol $sym82$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $kw83$GENLPREDS_BACKOFF_LIMIT;
  private static final SubLSymbol $sym84$PARAMS;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$PPH_GOODNESS;
  private static final SubLSymbol $sym87$PPH_GOODNESS_PARAM_P;
  private static final SubLSymbol $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL;
  private static final SubLSymbol $sym89$SET_PREFER_TERSE_PARAPHRASE_;
  private static final SubLSymbol $kw90$PREFER_TERSE_PARAPHRASE_;
  private static final SubLSymbol $sym91$PARAMS;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$SET_MAXIMIZE_LINKS__INTERNAL;
  private static final SubLSymbol $sym94$SET_MAXIMIZE_LINKS_;
  private static final SubLSymbol $kw95$MAXIMIZE_LINKS_;
  private static final SubLSymbol $sym96$PARAMS;
  private static final SubLList $list97;
  private static final SubLSymbol $kw98$PPH_PRECISION;
  private static final SubLSymbol $sym99$PPH_PRECISION_PARAM_P;
  private static final SubLSymbol $kw100$PPH_FORMALITY;
  private static final SubLSymbol $sym101$PPH_FORMALITY_PARAM_P;
  private static final SubLSymbol $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL;
  private static final SubLSymbol $sym103$SET_USE_TITLE_CAPITALIZATION_;
  private static final SubLSymbol $kw104$USE_TITLE_CAPITALIZATION_;
  private static final SubLSymbol $sym105$PARAMS;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL;
  private static final SubLSymbol $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_;
  private static final SubLSymbol $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_;
  private static final SubLSymbol $sym110$PARAMS;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$SET_QUANTIFY_VARIABLES__INTERNAL;
  private static final SubLSymbol $sym113$SET_QUANTIFY_VARIABLES_;
  private static final SubLSymbol $kw114$QUANTIFY_VARIABLES_;
  private static final SubLSymbol $sym115$PARAMS;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL;
  private static final SubLSymbol $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_;
  private static final SubLSymbol $kw119$HIDE_EXPLICIT_UNIVERSALS_;
  private static final SubLSymbol $sym120$PARAMS;
  private static final SubLList $list121;
  private static final SubLSymbol $kw122$PPH_MISC;
  private static final SubLSymbol $sym123$PPH_MISC_PARAM_P;

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 855L)
  public static SubLObject set_pph_lexical_context_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != nl_generation_api.lexical_context_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw4$PPH_LEXICAL_CONTEXT, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 855L)
  public static SubLObject set_pph_lexical_context(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym6$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym0$SET_PPH_LEXICAL_CONTEXT_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1101L)
  public static SubLObject set_pph_semantic_mt_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != hlmt.hlmt_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw12$PPH_SEMANTIC_MT, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1101L)
  public static SubLObject set_pph_semantic_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym13$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym9$SET_PPH_SEMANTIC_MT_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1325L)
  public static SubLObject set_pph_background_discourse_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.sublisp_true( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw18$PPH_BACKGROUND_DISCOURSE, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1325L)
  public static SubLObject set_pph_background_discourse(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym19$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym15$SET_PPH_BACKGROUND_DISCOURSE_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1541L)
  public static SubLObject set_pph_discourse_contexts_to_update_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.sublisp_true( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1541L)
  public static SubLObject set_pph_discourse_contexts_to_update(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym24$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym21$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1811L)
  public static SubLObject set_pph_generation_count_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != number_utilities.positive_potentially_infinite_integer_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw29$PPH_GENERATION_COUNT, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1811L)
  public static SubLObject set_pph_generation_count(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym30$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym26$SET_PPH_GENERATION_COUNT_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2027L)
  public static SubLObject set_pph_agreement_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != pph_utilities.valid_external_pph_nl_predsP( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw35$PPH_AGREEMENT, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2027L)
  public static SubLObject set_pph_agreement(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym36$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym32$SET_PPH_AGREEMENT_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2349L)
  public static SubLObject set_pph_sentential_force_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != pph_speech_act.pph_force_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw41$PPH_SENTENTIAL_FORCE, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2349L)
  public static SubLObject set_pph_sentential_force(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym42$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym38$SET_PPH_SENTENTIAL_FORCE_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2645L)
  public static SubLObject set_pph_timeout_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != number_utilities.positive_potentially_infinite_integer_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw46$PPH_TIMEOUT, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2645L)
  public static SubLObject set_pph_timeout(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym47$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym44$SET_PPH_TIMEOUT_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2955L)
  public static SubLObject top_level_pph_api_param_p(final SubLObject param_name)
  {
    return Equality.eq( $kw49$TOP_LEVEL, pph_parameter_declaration.get_pph_param_type( param_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3070L)
  public static SubLObject top_level_pph_api_param_list_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym50$TOP_LEVEL_PPH_API_PARAM_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3303L)
  public static SubLObject set_max_digits_without_comma_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != number_utilities.positive_potentially_infinite_integer_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw53$MAX_DIGITS_WITHOUT_COMMA, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3303L)
  public static SubLObject set_max_digits_without_comma(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym54$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym51$SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3579L)
  public static SubLObject set_significant_digits_cutoff_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != number_utilities.positive_potentially_infinite_integer_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw58$SIGNIFICANT_DIGITS_CUTOFF, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3579L)
  public static SubLObject set_significant_digits_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym59$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym56$SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3860L)
  public static SubLObject set_use_indexical_datesP_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.booleanp( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw64$USE_INDEXICAL_DATES_, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3860L)
  public static SubLObject set_use_indexical_datesP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym65$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym61$SET_USE_INDEXICAL_DATES__INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4090L)
  public static SubLObject pph_format_param_p(final SubLObject param_name)
  {
    return Equality.eq( pph_parameter_declaration.get_pph_param_type( param_name ), $kw67$PPH_FORMAT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4196L)
  public static SubLObject pph_format_param_list_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym68$PPH_FORMAT_PARAM_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4299L)
  public static SubLObject set_demerit_cutoff_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != number_utilities.non_negative_potentially_infinite_number_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw72$DEMERIT_CUTOFF, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4299L)
  public static SubLObject set_demerit_cutoff(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym73$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym69$SET_DEMERIT_CUTOFF_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4758L)
  public static SubLObject set_use_smart_variable_replacementP_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.booleanp( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw77$USE_SMART_VARIABLE_REPLACEMENT_, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4758L)
  public static SubLObject set_use_smart_variable_replacementP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym78$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5068L)
  public static SubLObject set_genlpreds_backoff_limit_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != subl_promotions.non_negative_integer_p( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw83$GENLPREDS_BACKOFF_LIMIT, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5068L)
  public static SubLObject set_genlpreds_backoff_limit(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym84$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym80$SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5438L)
  public static SubLObject pph_goodness_param_p(final SubLObject param_name)
  {
    return Equality.eq( pph_parameter_declaration.get_pph_param_type( param_name ), $kw86$PPH_GOODNESS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5548L)
  public static SubLObject pph_goodness_param_list_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym87$PPH_GOODNESS_PARAM_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5656L)
  public static SubLObject set_prefer_terse_paraphraseP_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.booleanp( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw90$PREFER_TERSE_PARAPHRASE_, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5656L)
  public static SubLObject set_prefer_terse_paraphraseP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym91$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5856L)
  public static SubLObject set_maximize_linksP_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.booleanp( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw95$MAXIMIZE_LINKS_, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5856L)
  public static SubLObject set_maximize_linksP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym96$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym93$SET_MAXIMIZE_LINKS__INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6147L)
  public static SubLObject pph_precision_param_p(final SubLObject param_name)
  {
    return Equality.eq( pph_parameter_declaration.get_pph_param_type( param_name ), $kw98$PPH_PRECISION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6259L)
  public static SubLObject pph_precision_param_list_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym99$PPH_PRECISION_PARAM_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6369L)
  public static SubLObject pph_formality_param_p(final SubLObject param_name)
  {
    return Equality.eq( pph_parameter_declaration.get_pph_param_type( param_name ), $kw100$PPH_FORMALITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6482L)
  public static SubLObject pph_formality_param_list_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym101$PPH_FORMALITY_PARAM_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6592L)
  public static SubLObject set_use_title_capitalizationP_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.booleanp( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw104$USE_TITLE_CAPITALIZATION_, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6592L)
  public static SubLObject set_use_title_capitalizationP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym105$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6825L)
  public static SubLObject set_add_determiners_before_variablesP_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.booleanp( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6825L)
  public static SubLObject set_add_determiners_before_variablesP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym110$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7072L)
  public static SubLObject set_quantify_variablesP_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.booleanp( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw114$QUANTIFY_VARIABLES_, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7072L)
  public static SubLObject set_quantify_variablesP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym115$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym112$SET_QUANTIFY_VARIABLES__INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7334L)
  public static SubLObject set_hide_explicit_universalsP_internal(final SubLObject params, final SubLObject value)
  {
    assert NIL != Types.booleanp( value ) : value;
    assert NIL != nl_generation_api.pph_mutable_api_params_p( params ) : params;
    pph_parameter_declaration.set_pph_parameter_value( params, $kw119$HIDE_EXPLICIT_UNIVERSALS_, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7334L)
  public static SubLObject set_hide_explicit_universalsP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject params_form = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    params_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject params = $sym120$PARAMS;
      return pph_parameter_declaration.pph_parameter_setter_body( params_form, params, value, $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7552L)
  public static SubLObject pph_misc_param_p(final SubLObject param_name)
  {
    return Equality.eq( pph_parameter_declaration.get_pph_param_type( param_name ), $kw122$PPH_MISC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7654L)
  public static SubLObject pph_misc_param_list_p(final SubLObject v_object)
  {
    return list_utilities.plist_of_type_p( v_object, $sym123$PPH_MISC_PARAM_P );
  }

  public static SubLObject declare_pph_parameter_declarations_file()
  {
    SubLFiles.declareFunction( me, "set_pph_lexical_context_internal", "SET-PPH-LEXICAL-CONTEXT-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_pph_lexical_context", "SET-PPH-LEXICAL-CONTEXT" );
    SubLFiles.declareFunction( me, "set_pph_semantic_mt_internal", "SET-PPH-SEMANTIC-MT-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_pph_semantic_mt", "SET-PPH-SEMANTIC-MT" );
    SubLFiles.declareFunction( me, "set_pph_background_discourse_internal", "SET-PPH-BACKGROUND-DISCOURSE-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_pph_background_discourse", "SET-PPH-BACKGROUND-DISCOURSE" );
    SubLFiles.declareFunction( me, "set_pph_discourse_contexts_to_update_internal", "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_pph_discourse_contexts_to_update", "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE" );
    SubLFiles.declareFunction( me, "set_pph_generation_count_internal", "SET-PPH-GENERATION-COUNT-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_pph_generation_count", "SET-PPH-GENERATION-COUNT" );
    SubLFiles.declareFunction( me, "set_pph_agreement_internal", "SET-PPH-AGREEMENT-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_pph_agreement", "SET-PPH-AGREEMENT" );
    SubLFiles.declareFunction( me, "set_pph_sentential_force_internal", "SET-PPH-SENTENTIAL-FORCE-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_pph_sentential_force", "SET-PPH-SENTENTIAL-FORCE" );
    SubLFiles.declareFunction( me, "set_pph_timeout_internal", "SET-PPH-TIMEOUT-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_pph_timeout", "SET-PPH-TIMEOUT" );
    SubLFiles.declareFunction( me, "top_level_pph_api_param_p", "TOP-LEVEL-PPH-API-PARAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "top_level_pph_api_param_list_p", "TOP-LEVEL-PPH-API-PARAM-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_max_digits_without_comma_internal", "SET-MAX-DIGITS-WITHOUT-COMMA-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_max_digits_without_comma", "SET-MAX-DIGITS-WITHOUT-COMMA" );
    SubLFiles.declareFunction( me, "set_significant_digits_cutoff_internal", "SET-SIGNIFICANT-DIGITS-CUTOFF-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_significant_digits_cutoff", "SET-SIGNIFICANT-DIGITS-CUTOFF" );
    SubLFiles.declareFunction( me, "set_use_indexical_datesP_internal", "SET-USE-INDEXICAL-DATES?-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_use_indexical_datesP", "SET-USE-INDEXICAL-DATES?" );
    SubLFiles.declareFunction( me, "pph_format_param_p", "PPH-FORMAT-PARAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_format_param_list_p", "PPH-FORMAT-PARAM-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_demerit_cutoff_internal", "SET-DEMERIT-CUTOFF-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_demerit_cutoff", "SET-DEMERIT-CUTOFF" );
    SubLFiles.declareFunction( me, "set_use_smart_variable_replacementP_internal", "SET-USE-SMART-VARIABLE-REPLACEMENT?-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_use_smart_variable_replacementP", "SET-USE-SMART-VARIABLE-REPLACEMENT?" );
    SubLFiles.declareFunction( me, "set_genlpreds_backoff_limit_internal", "SET-GENLPREDS-BACKOFF-LIMIT-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_genlpreds_backoff_limit", "SET-GENLPREDS-BACKOFF-LIMIT" );
    SubLFiles.declareFunction( me, "pph_goodness_param_p", "PPH-GOODNESS-PARAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_goodness_param_list_p", "PPH-GOODNESS-PARAM-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_prefer_terse_paraphraseP_internal", "SET-PREFER-TERSE-PARAPHRASE?-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_prefer_terse_paraphraseP", "SET-PREFER-TERSE-PARAPHRASE?" );
    SubLFiles.declareFunction( me, "set_maximize_linksP_internal", "SET-MAXIMIZE-LINKS?-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_maximize_linksP", "SET-MAXIMIZE-LINKS?" );
    SubLFiles.declareFunction( me, "pph_precision_param_p", "PPH-PRECISION-PARAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_precision_param_list_p", "PPH-PRECISION-PARAM-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_formality_param_p", "PPH-FORMALITY-PARAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_formality_param_list_p", "PPH-FORMALITY-PARAM-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_use_title_capitalizationP_internal", "SET-USE-TITLE-CAPITALIZATION?-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_use_title_capitalizationP", "SET-USE-TITLE-CAPITALIZATION?" );
    SubLFiles.declareFunction( me, "set_add_determiners_before_variablesP_internal", "SET-ADD-DETERMINERS-BEFORE-VARIABLES?-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_add_determiners_before_variablesP", "SET-ADD-DETERMINERS-BEFORE-VARIABLES?" );
    SubLFiles.declareFunction( me, "set_quantify_variablesP_internal", "SET-QUANTIFY-VARIABLES?-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_quantify_variablesP", "SET-QUANTIFY-VARIABLES?" );
    SubLFiles.declareFunction( me, "set_hide_explicit_universalsP_internal", "SET-HIDE-EXPLICIT-UNIVERSALS?-INTERNAL", 2, 0, false );
    SubLFiles.declareMacro( me, "set_hide_explicit_universalsP", "SET-HIDE-EXPLICIT-UNIVERSALS?" );
    SubLFiles.declareFunction( me, "pph_misc_param_p", "PPH-MISC-PARAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_misc_param_list_p", "PPH-MISC-PARAM-LIST-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_parameter_declarations_file()
  {
    return NIL;
  }

  public static SubLObject setup_pph_parameter_declarations_file()
  {
    access_macros.register_macro_helper( $sym0$SET_PPH_LEXICAL_CONTEXT_INTERNAL, $sym1$SET_PPH_LEXICAL_CONTEXT );
    access_macros.register_external_symbol( $sym1$SET_PPH_LEXICAL_CONTEXT );
    SubLObject v_properties = $list7;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw4$PPH_LEXICAL_CONTEXT ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw4$PPH_LEXICAL_CONTEXT, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw4$PPH_LEXICAL_CONTEXT, v_properties );
    access_macros.register_macro_helper( $sym9$SET_PPH_SEMANTIC_MT_INTERNAL, $sym10$SET_PPH_SEMANTIC_MT );
    access_macros.register_external_symbol( $sym10$SET_PPH_SEMANTIC_MT );
    v_properties = $list14;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw12$PPH_SEMANTIC_MT ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw12$PPH_SEMANTIC_MT, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw12$PPH_SEMANTIC_MT, v_properties );
    access_macros.register_macro_helper( $sym15$SET_PPH_BACKGROUND_DISCOURSE_INTERNAL, $sym16$SET_PPH_BACKGROUND_DISCOURSE );
    access_macros.register_external_symbol( $sym16$SET_PPH_BACKGROUND_DISCOURSE );
    v_properties = $list20;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw18$PPH_BACKGROUND_DISCOURSE ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw18$PPH_BACKGROUND_DISCOURSE, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw18$PPH_BACKGROUND_DISCOURSE, v_properties );
    access_macros.register_macro_helper( $sym21$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL, $sym22$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE );
    access_macros.register_external_symbol( $sym22$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE );
    v_properties = $list25;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties );
    access_macros.register_macro_helper( $sym26$SET_PPH_GENERATION_COUNT_INTERNAL, $sym27$SET_PPH_GENERATION_COUNT );
    access_macros.register_external_symbol( $sym27$SET_PPH_GENERATION_COUNT );
    v_properties = $list31;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw29$PPH_GENERATION_COUNT ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw29$PPH_GENERATION_COUNT, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw29$PPH_GENERATION_COUNT, v_properties );
    access_macros.register_macro_helper( $sym32$SET_PPH_AGREEMENT_INTERNAL, $sym33$SET_PPH_AGREEMENT );
    access_macros.register_external_symbol( $sym33$SET_PPH_AGREEMENT );
    v_properties = $list37;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw35$PPH_AGREEMENT ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw35$PPH_AGREEMENT, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw35$PPH_AGREEMENT, v_properties );
    access_macros.register_macro_helper( $sym38$SET_PPH_SENTENTIAL_FORCE_INTERNAL, $sym39$SET_PPH_SENTENTIAL_FORCE );
    access_macros.register_external_symbol( $sym39$SET_PPH_SENTENTIAL_FORCE );
    v_properties = $list43;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw41$PPH_SENTENTIAL_FORCE ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw41$PPH_SENTENTIAL_FORCE, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw41$PPH_SENTENTIAL_FORCE, v_properties );
    access_macros.register_macro_helper( $sym44$SET_PPH_TIMEOUT_INTERNAL, $sym45$SET_PPH_TIMEOUT );
    access_macros.register_external_symbol( $sym45$SET_PPH_TIMEOUT );
    v_properties = $list48;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw46$PPH_TIMEOUT ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw46$PPH_TIMEOUT, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw46$PPH_TIMEOUT, v_properties );
    access_macros.register_macro_helper( $sym51$SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL, $sym52$SET_MAX_DIGITS_WITHOUT_COMMA );
    access_macros.register_external_symbol( $sym52$SET_MAX_DIGITS_WITHOUT_COMMA );
    v_properties = $list55;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw53$MAX_DIGITS_WITHOUT_COMMA ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw53$MAX_DIGITS_WITHOUT_COMMA, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw53$MAX_DIGITS_WITHOUT_COMMA, v_properties );
    access_macros.register_macro_helper( $sym56$SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL, $sym57$SET_SIGNIFICANT_DIGITS_CUTOFF );
    access_macros.register_external_symbol( $sym57$SET_SIGNIFICANT_DIGITS_CUTOFF );
    v_properties = $list60;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw58$SIGNIFICANT_DIGITS_CUTOFF ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw58$SIGNIFICANT_DIGITS_CUTOFF, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw58$SIGNIFICANT_DIGITS_CUTOFF, v_properties );
    access_macros.register_macro_helper( $sym61$SET_USE_INDEXICAL_DATES__INTERNAL, $sym62$SET_USE_INDEXICAL_DATES_ );
    access_macros.register_external_symbol( $sym62$SET_USE_INDEXICAL_DATES_ );
    v_properties = $list66;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw64$USE_INDEXICAL_DATES_ ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw64$USE_INDEXICAL_DATES_, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw64$USE_INDEXICAL_DATES_, v_properties );
    access_macros.register_macro_helper( $sym69$SET_DEMERIT_CUTOFF_INTERNAL, $sym70$SET_DEMERIT_CUTOFF );
    access_macros.register_external_symbol( $sym70$SET_DEMERIT_CUTOFF );
    v_properties = $list74;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw72$DEMERIT_CUTOFF ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw72$DEMERIT_CUTOFF, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw72$DEMERIT_CUTOFF, v_properties );
    access_macros.register_macro_helper( $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL, $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_ );
    access_macros.register_external_symbol( $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_ );
    v_properties = $list79;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw77$USE_SMART_VARIABLE_REPLACEMENT_ ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties );
    access_macros.register_macro_helper( $sym80$SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL, $sym81$SET_GENLPREDS_BACKOFF_LIMIT );
    access_macros.register_external_symbol( $sym81$SET_GENLPREDS_BACKOFF_LIMIT );
    v_properties = $list85;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw83$GENLPREDS_BACKOFF_LIMIT ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw83$GENLPREDS_BACKOFF_LIMIT, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw83$GENLPREDS_BACKOFF_LIMIT, v_properties );
    access_macros.register_macro_helper( $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL, $sym89$SET_PREFER_TERSE_PARAPHRASE_ );
    access_macros.register_external_symbol( $sym89$SET_PREFER_TERSE_PARAPHRASE_ );
    v_properties = $list92;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw90$PREFER_TERSE_PARAPHRASE_ ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw90$PREFER_TERSE_PARAPHRASE_, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw90$PREFER_TERSE_PARAPHRASE_, v_properties );
    access_macros.register_macro_helper( $sym93$SET_MAXIMIZE_LINKS__INTERNAL, $sym94$SET_MAXIMIZE_LINKS_ );
    access_macros.register_external_symbol( $sym94$SET_MAXIMIZE_LINKS_ );
    v_properties = $list97;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw95$MAXIMIZE_LINKS_ ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw95$MAXIMIZE_LINKS_, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw95$MAXIMIZE_LINKS_, v_properties );
    access_macros.register_macro_helper( $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL, $sym103$SET_USE_TITLE_CAPITALIZATION_ );
    access_macros.register_external_symbol( $sym103$SET_USE_TITLE_CAPITALIZATION_ );
    v_properties = $list106;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw104$USE_TITLE_CAPITALIZATION_ ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw104$USE_TITLE_CAPITALIZATION_, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw104$USE_TITLE_CAPITALIZATION_, v_properties );
    access_macros.register_macro_helper( $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL, $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_ );
    access_macros.register_external_symbol( $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_ );
    v_properties = $list111;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_ ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties );
    access_macros.register_macro_helper( $sym112$SET_QUANTIFY_VARIABLES__INTERNAL, $sym113$SET_QUANTIFY_VARIABLES_ );
    access_macros.register_external_symbol( $sym113$SET_QUANTIFY_VARIABLES_ );
    v_properties = $list116;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw114$QUANTIFY_VARIABLES_ ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw114$QUANTIFY_VARIABLES_, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw114$QUANTIFY_VARIABLES_, v_properties );
    access_macros.register_macro_helper( $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL, $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_ );
    access_macros.register_external_symbol( $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_ );
    v_properties = $list121;
    v_properties = conses_high.putf( v_properties, $kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name( $kw119$HIDE_EXPLICIT_UNIVERSALS_ ) );
    pph_parameter_declaration.validate_pph_parameter_declaration( $kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties );
    pph_parameter_declaration.enter_pph_parameter_declaration( $kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_parameter_declarations_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_parameter_declarations_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_parameter_declarations_file();
  }
  static
  {
    me = new pph_parameter_declarations();
    $sym0$SET_PPH_LEXICAL_CONTEXT_INTERNAL = makeSymbol( "SET-PPH-LEXICAL-CONTEXT-INTERNAL" );
    $sym1$SET_PPH_LEXICAL_CONTEXT = makeSymbol( "SET-PPH-LEXICAL-CONTEXT" );
    $sym2$LEXICAL_CONTEXT_P = makeSymbol( "LEXICAL-CONTEXT-P" );
    $sym3$PPH_MUTABLE_API_PARAMS_P = makeSymbol( "PPH-MUTABLE-API-PARAMS-P" );
    $kw4$PPH_LEXICAL_CONTEXT = makeKeyword( "PPH-LEXICAL-CONTEXT" );
    $list5 = ConsesLow.list( makeSymbol( "PARAMS-FORM" ), makeSymbol( "VALUE" ) );
    $sym6$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list7 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TOP-LEVEL" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-LANGUAGE-MT*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "LEXICAL-CONTEXT-P" ),
        makeKeyword( "DOCUMENTATION" ), makeString( "The context from which to look up lexical information and paraphrase templates." ) );
    $kw8$SETTER = makeKeyword( "SETTER" );
    $sym9$SET_PPH_SEMANTIC_MT_INTERNAL = makeSymbol( "SET-PPH-SEMANTIC-MT-INTERNAL" );
    $sym10$SET_PPH_SEMANTIC_MT = makeSymbol( "SET-PPH-SEMANTIC-MT" );
    $sym11$HLMT_P = makeSymbol( "HLMT-P" );
    $kw12$PPH_SEMANTIC_MT = makeKeyword( "PPH-SEMANTIC-MT" );
    $sym13$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list14 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TOP-LEVEL" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-DOMAIN-MT*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "HLMT-P" ), makeKeyword(
        "DOCUMENTATION" ), makeString( "The context from which to look up information about the domain of discourse." ) );
    $sym15$SET_PPH_BACKGROUND_DISCOURSE_INTERNAL = makeSymbol( "SET-PPH-BACKGROUND-DISCOURSE-INTERNAL" );
    $sym16$SET_PPH_BACKGROUND_DISCOURSE = makeSymbol( "SET-PPH-BACKGROUND-DISCOURSE" );
    $sym17$TRUE = makeSymbol( "TRUE" );
    $kw18$PPH_BACKGROUND_DISCOURSE = makeKeyword( "PPH-BACKGROUND-DISCOURSE" );
    $sym19$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list20 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TOP-LEVEL" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "TRUE" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "The background discourse for paraphrasing." ), makeKeyword( "DEFAULT-VALUE-FORM" ), NIL );
    $sym21$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL = makeSymbol( "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE-INTERNAL" );
    $sym22$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE = makeSymbol( "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE" );
    $kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE = makeKeyword( "PPH-DISCOURSE-CONTEXTS-TO-UPDATE" );
    $sym24$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list25 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TOP-LEVEL" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "TRUE" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "Discourse contexts that should be updated with information from this paraphrase." ), makeKeyword( "DEFAULT-VALUE-FORM" ), NIL );
    $sym26$SET_PPH_GENERATION_COUNT_INTERNAL = makeSymbol( "SET-PPH-GENERATION-COUNT-INTERNAL" );
    $sym27$SET_PPH_GENERATION_COUNT = makeSymbol( "SET-PPH-GENERATION-COUNT" );
    $sym28$POSITIVE_POTENTIALLY_INFINITE_INTEGER_P = makeSymbol( "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P" );
    $kw29$PPH_GENERATION_COUNT = makeKeyword( "PPH-GENERATION-COUNT" );
    $sym30$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list31 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TOP-LEVEL" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "The maximum number of paraphrases to generate." ), makeKeyword( "DEFAULT-VALUE-FORM" ), ONE_INTEGER );
    $sym32$SET_PPH_AGREEMENT_INTERNAL = makeSymbol( "SET-PPH-AGREEMENT-INTERNAL" );
    $sym33$SET_PPH_AGREEMENT = makeSymbol( "SET-PPH-AGREEMENT" );
    $sym34$VALID_EXTERNAL_PPH_NL_PREDS_ = makeSymbol( "VALID-EXTERNAL-PPH-NL-PREDS?" );
    $kw35$PPH_AGREEMENT = makeKeyword( "PPH-AGREEMENT" );
    $sym36$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list37 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TOP-LEVEL" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "VALID-EXTERNAL-PPH-NL-PREDS?" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "Which agreement predicates are preferred for the head of this phrase? If left at the default, the paraphrase code will attempt to set this parameter appropriately." ), makeKeyword( "DEFAULT-VALUE-FORM" ),
        makeKeyword( "DEFAULT" ) );
    $sym38$SET_PPH_SENTENTIAL_FORCE_INTERNAL = makeSymbol( "SET-PPH-SENTENTIAL-FORCE-INTERNAL" );
    $sym39$SET_PPH_SENTENTIAL_FORCE = makeSymbol( "SET-PPH-SENTENTIAL-FORCE" );
    $sym40$PPH_FORCE_P = makeSymbol( "PPH-FORCE-P" );
    $kw41$PPH_SENTENTIAL_FORCE = makeKeyword( "PPH-SENTENTIAL-FORCE" );
    $sym42$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list43 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TOP-LEVEL" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "PPH-FORCE-P" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "What sentential force should be used for paraphrases? If left at the default, the paraphrase code will attempt to set this parameter appropriately." ), makeKeyword( "DEFAULT-VALUE-FORM" ), makeKeyword(
            "DEFAULT" ) );
    $sym44$SET_PPH_TIMEOUT_INTERNAL = makeSymbol( "SET-PPH-TIMEOUT-INTERNAL" );
    $sym45$SET_PPH_TIMEOUT = makeSymbol( "SET-PPH-TIMEOUT" );
    $kw46$PPH_TIMEOUT = makeKeyword( "PPH-TIMEOUT" );
    $sym47$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list48 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "TOP-LEVEL" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "After how many seconds should we give up? Granularity is the internal time unit of the image, typically millisecond or microsecond." ), makeKeyword( "DEFAULT-VALUE-FORM" ), ConsesLow.list( makeSymbol(
            "POSITIVE-INFINITY" ) ) );
    $kw49$TOP_LEVEL = makeKeyword( "TOP-LEVEL" );
    $sym50$TOP_LEVEL_PPH_API_PARAM_P = makeSymbol( "TOP-LEVEL-PPH-API-PARAM-P" );
    $sym51$SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL = makeSymbol( "SET-MAX-DIGITS-WITHOUT-COMMA-INTERNAL" );
    $sym52$SET_MAX_DIGITS_WITHOUT_COMMA = makeSymbol( "SET-MAX-DIGITS-WITHOUT-COMMA" );
    $kw53$MAX_DIGITS_WITHOUT_COMMA = makeKeyword( "MAX-DIGITS-WITHOUT-COMMA" );
    $sym54$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list55 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-FORMAT" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "max number of digits a number can have and still generate with no commas." ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-MAX-NO-COMMA-LENGTH*" ) );
    $sym56$SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL = makeSymbol( "SET-SIGNIFICANT-DIGITS-CUTOFF-INTERNAL" );
    $sym57$SET_SIGNIFICANT_DIGITS_CUTOFF = makeSymbol( "SET-SIGNIFICANT-DIGITS-CUTOFF" );
    $kw58$SIGNIFICANT_DIGITS_CUTOFF = makeKeyword( "SIGNIFICANT-DIGITS-CUTOFF" );
    $sym59$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list60 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-FORMAT" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "To how many significant digits should we truncate the display of numbers?" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-SIGNIFICANT-DIGITS-CUTOFF*" ) );
    $sym61$SET_USE_INDEXICAL_DATES__INTERNAL = makeSymbol( "SET-USE-INDEXICAL-DATES?-INTERNAL" );
    $sym62$SET_USE_INDEXICAL_DATES_ = makeSymbol( "SET-USE-INDEXICAL-DATES?" );
    $sym63$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw64$USE_INDEXICAL_DATES_ = makeKeyword( "USE-INDEXICAL-DATES?" );
    $sym65$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list66 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-FORMAT" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "BOOLEANP" ), makeKeyword( "DOCUMENTATION" ), makeString(
        "Should we use 'yesterday', etc. for dates that we can identify?" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-USE-INDEXICAL-DATES?*" ) );
    $kw67$PPH_FORMAT = makeKeyword( "PPH-FORMAT" );
    $sym68$PPH_FORMAT_PARAM_P = makeSymbol( "PPH-FORMAT-PARAM-P" );
    $sym69$SET_DEMERIT_CUTOFF_INTERNAL = makeSymbol( "SET-DEMERIT-CUTOFF-INTERNAL" );
    $sym70$SET_DEMERIT_CUTOFF = makeSymbol( "SET-DEMERIT-CUTOFF" );
    $sym71$NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P = makeSymbol( "NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P" );
    $kw72$DEMERIT_CUTOFF = makeKeyword( "DEMERIT-CUTOFF" );
    $sym73$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list74 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "PPH-GOODNESS" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-DEMERIT-CUTOFF*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol(
        "NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P" ), makeKeyword( "DOCUMENTATION" ), makeString(
            "What is the worst paraphase quality we should tolerate before returning NIL instead of a string.\nDefault is to consider any string better than nothing.\nSee @xref *PPH-SUGGESTED-DEMERIT-CUTOFF* for a middle-of-the-road value." ),
      makeKeyword( "DEFAULT-VALUE-FORM" ), makeSymbol( "*PPH-DEMERIT-CUTOFF*" )
    } );
    $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL = makeSymbol( "SET-USE-SMART-VARIABLE-REPLACEMENT?-INTERNAL" );
    $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_ = makeSymbol( "SET-USE-SMART-VARIABLE-REPLACEMENT?" );
    $kw77$USE_SMART_VARIABLE_REPLACEMENT_ = makeKeyword( "USE-SMART-VARIABLE-REPLACEMENT?" );
    $sym78$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list79 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-GOODNESS" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-USE-SMART-VARIABLE-REPLACEMENT?*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol(
        "BOOLEANP" ), makeKeyword( "DOCUMENTATION" ), makeString( "Should the paraphrase code 'intelligently' use NL phrases for variables that look like they need it?" ) );
    $sym80$SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL = makeSymbol( "SET-GENLPREDS-BACKOFF-LIMIT-INTERNAL" );
    $sym81$SET_GENLPREDS_BACKOFF_LIMIT = makeSymbol( "SET-GENLPREDS-BACKOFF-LIMIT" );
    $sym82$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $kw83$GENLPREDS_BACKOFF_LIMIT = makeKeyword( "GENLPREDS-BACKOFF-LIMIT" );
    $sym84$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list85 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-GOODNESS" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-SEARCH-LIMIT*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol(
        "NON-NEGATIVE-INTEGER-P" ), makeKeyword( "DOCUMENTATION" ), makeString(
            "When traversing the genl-preds hierarchy looking for alternative preds with which to paraphrase the input, stop looking after you've looked this many times -- then meaning starts getting lost." ) );
    $kw86$PPH_GOODNESS = makeKeyword( "PPH-GOODNESS" );
    $sym87$PPH_GOODNESS_PARAM_P = makeSymbol( "PPH-GOODNESS-PARAM-P" );
    $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL = makeSymbol( "SET-PREFER-TERSE-PARAPHRASE?-INTERNAL" );
    $sym89$SET_PREFER_TERSE_PARAPHRASE_ = makeSymbol( "SET-PREFER-TERSE-PARAPHRASE?" );
    $kw90$PREFER_TERSE_PARAPHRASE_ = makeKeyword( "PREFER-TERSE-PARAPHRASE?" );
    $sym91$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list92 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-PRECISION" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-TERSE-MODE?*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "BOOLEANP" ),
        makeKeyword( "DOCUMENTATION" ), makeString( "Should we prefer terse paraphrases?" ) );
    $sym93$SET_MAXIMIZE_LINKS__INTERNAL = makeSymbol( "SET-MAXIMIZE-LINKS?-INTERNAL" );
    $sym94$SET_MAXIMIZE_LINKS_ = makeSymbol( "SET-MAXIMIZE-LINKS?" );
    $kw95$MAXIMIZE_LINKS_ = makeKeyword( "MAXIMIZE-LINKS?" );
    $sym96$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list97 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-PRECISION" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-MAXIMIZE-LINKS?*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "BOOLEANP" ),
        makeKeyword( "DOCUMENTATION" ), makeString( "Should we link as much of the input CycL to output strings as we can? The tradeoff for this is typically terseness and readability." ) );
    $kw98$PPH_PRECISION = makeKeyword( "PPH-PRECISION" );
    $sym99$PPH_PRECISION_PARAM_P = makeSymbol( "PPH-PRECISION-PARAM-P" );
    $kw100$PPH_FORMALITY = makeKeyword( "PPH-FORMALITY" );
    $sym101$PPH_FORMALITY_PARAM_P = makeSymbol( "PPH-FORMALITY-PARAM-P" );
    $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL = makeSymbol( "SET-USE-TITLE-CAPITALIZATION?-INTERNAL" );
    $sym103$SET_USE_TITLE_CAPITALIZATION_ = makeSymbol( "SET-USE-TITLE-CAPITALIZATION?" );
    $kw104$USE_TITLE_CAPITALIZATION_ = makeKeyword( "USE-TITLE-CAPITALIZATION?" );
    $sym105$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list106 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-MISC" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-USE-TITLE-CAPITALIZATION?*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol(
        "BOOLEANP" ), makeKeyword( "DOCUMENTATION" ), makeString( "Should we capitalize the output like a book, etc., title?" ) );
    $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL = makeSymbol( "SET-ADD-DETERMINERS-BEFORE-VARIABLES?-INTERNAL" );
    $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_ = makeSymbol( "SET-ADD-DETERMINERS-BEFORE-VARIABLES?" );
    $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_ = makeKeyword( "ADD-DETERMINERS-BEFORE-VARIABLES?" );
    $sym110$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list111 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-MISC" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*DETERMINERS-BEFORE-VARIABLES*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol(
        "BOOLEANP" ), makeKeyword( "DOCUMENTATION" ), makeString( "Shall we try to put the correct determiner before variables, too?" ) );
    $sym112$SET_QUANTIFY_VARIABLES__INTERNAL = makeSymbol( "SET-QUANTIFY-VARIABLES?-INTERNAL" );
    $sym113$SET_QUANTIFY_VARIABLES_ = makeSymbol( "SET-QUANTIFY-VARIABLES?" );
    $kw114$QUANTIFY_VARIABLES_ = makeKeyword( "QUANTIFY-VARIABLES?" );
    $sym115$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list116 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-MISC" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-QUANTIFY-VARS?*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol( "BOOLEANP" ),
        makeKeyword( "DOCUMENTATION" ), makeString( "Should the paraphrase code 'intelligently' add quantification for variables that look like they need it?" ) );
    $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL = makeSymbol( "SET-HIDE-EXPLICIT-UNIVERSALS?-INTERNAL" );
    $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_ = makeSymbol( "SET-HIDE-EXPLICIT-UNIVERSALS?" );
    $kw119$HIDE_EXPLICIT_UNIVERSALS_ = makeKeyword( "HIDE-EXPLICIT-UNIVERSALS?" );
    $sym120$PARAMS = makeUninternedSymbol( "PARAMS" );
    $list121 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "PPH-MISC" ), makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "*PPH-HIDE-EXPLICIT-UNIVERSALS?*" ), makeKeyword( "CHECK-TYPE" ), makeSymbol(
        "BOOLEANP" ), makeKeyword( "DOCUMENTATION" ), makeString( "Should we skip the 'For every X, Y, and Z'?" ) );
    $kw122$PPH_MISC = makeKeyword( "PPH-MISC" );
    $sym123$PPH_MISC_PARAM_P = makeSymbol( "PPH-MISC-PARAM-P" );
  }
}
/*
 * 
 * Total time: 212 ms
 * 
 */