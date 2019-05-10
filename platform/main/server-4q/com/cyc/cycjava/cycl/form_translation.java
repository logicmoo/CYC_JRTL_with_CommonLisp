package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class form_translation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.form_translation";
  public static final String myFingerPrint = "829fbca44c1183cb0d4eaea0e5f78ca054c996b847b972ddac89821644063b53";
  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 863L)
  private static SubLSymbol $translator_within_binding_constructP$;
  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 7953L)
  private static SubLSymbol $consider_translator_expansion_factor$;
  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 10959L)
  private static SubLSymbol $operator_translators$;
  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 33820L)
  private static SubLSymbol $translator_current_method$;
  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 56605L)
  private static SubLSymbol $translator_implementation_symbols$;
  private static final SubLSymbol $kw0$SL2C;
  private static final SubLString $str1$unexpected_form____S;
  private static final SubLSymbol $kw2$UNSPECIFIED;
  private static final SubLSymbol $kw3$LOCAL;
  private static final SubLSymbol $kw4$DYNAMIC;
  private static final SubLSymbol $sym5$_DYN;
  private static final SubLSymbol $kw6$LEXICAL;
  private static final SubLSymbol $sym7$_LEX;
  private static final SubLSymbol $kw8$CONSTANT;
  private static final SubLString $str9$Unexpected_binding_type__S_for_va;
  private static final SubLString $str10$time_to_implement__S;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$VACCESS;
  private static final SubLSymbol $sym14$PROTECTED;
  private static final SubLSymbol $sym15$FACCESS;
  private static final SubLSymbol $sym16$PRIVATE;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$BINDING_TYPE;
  private static final SubLSymbol $sym21$OPTIMIZE_FUNCALL;
  private static final SubLInteger $int22$50;
  private static final SubLString $str23$Method__S_undergoes_a__Sx_expansi;
  private static final SubLSymbol $sym24$_;
  private static final SubLSymbol $sym25$SECOND;
  private static final SubLString $str26$__Total_forms______________S;
  private static final SubLString $str27$__Mean_form_size___________S;
  private static final SubLString $str28$__Mean_expansion_factor____Sx;
  private static final SubLString $str29$__Largest_expansions__;
  private static final SubLList $list30;
  private static final SubLString $str31$___4___Dx___S;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$CAND;
  private static final SubLSymbol $sym35$_DTB;
  private static final SubLSymbol $sym36$_BTD;
  private static final SubLSymbol $sym37$_AND;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$CCATCH;
  private static final SubLSymbol $sym40$CCATCH_ENV_VAR;
  private static final SubLSymbol $sym41$_CCATCH;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$CDEC;
  private static final SubLSymbol $sym44$CSETF;
  private static final SubLSymbol $sym45$_;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$CDO;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$CSETQ;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$CNOT;
  private static final SubLSymbol $sym52$CLET;
  private static final SubLSymbol $sym53$_FOR;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$_CDO_SYMBOLS;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$CDO_SYMBOLS;
  private static final SubLSymbol $sym58$CDO_SYMBOLS_PACKAGE;
  private static final SubLSymbol $sym59$CDO_SYMBOLS_ITERATOR;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$_CDOHASH;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$CDOHASH;
  private static final SubLSymbol $sym64$CDOHASH_TABLE;
  private static final SubLSymbol $sym65$CDOHASH_ITERATOR;
  private static final SubLSymbol $sym66$CDOHASH_ENTRY;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$CDOLIST;
  private static final SubLSymbol $sym69$CDOLIST_LIST_VAR;
  private static final SubLSymbol $sym70$CLET_LOCAL;
  private static final SubLSymbol $sym71$FOR;
  private static final SubLSymbol $sym72$FIRST;
  private static final SubLSymbol $sym73$NULL;
  private static final SubLSymbol $sym74$REST;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$CDOTIMES;
  private static final SubLSymbol $sym77$CDOTIMES_END_VAR;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$_;
  private static final SubLSymbol $sym80$CINC;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$CHECK_TYPE;
  private static final SubLSymbol $sym83$QUOTE;
  private static final SubLSymbol $sym84$_DP_CHECK_TYPE;
  private static final SubLSymbol $sym85$_;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLSymbol $kw88$UNSET;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$CLET_BIND;
  private static final SubLString $str91$CLET_of_lexical_variable__S_being;
  private static final SubLString $str92$CLET_of_constant__S_is_not_allowe;
  private static final SubLString $str93$Unexpected_variable__S;
  private static final SubLSymbol $sym94$PROGN;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$CMULTIPLE_VALUE_BIND;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$_MVAL;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$_NOT;
  private static final SubLSymbol $sym102$COR;
  private static final SubLSymbol $sym103$_OR;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$CPOP;
  private static final SubLSymbol $sym106$CDR;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$CPROGV;
  private static final SubLSymbol $sym109$CPROGV_VAR;
  private static final SubLSymbol $sym110$_CPROGV;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$CPUSH;
  private static final SubLSymbol $sym113$CONS;
  private static final SubLList $list114;
  private static final SubLList $list115;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$CPUSHNEW;
  private static final SubLSymbol $sym118$ITEM_VAR;
  private static final SubLSymbol $sym119$PUNLESS;
  private static final SubLSymbol $sym120$MEMBER;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$CAR;
  private static final SubLSymbol $sym123$RPLACA;
  private static final SubLSymbol $sym124$RPLACD;
  private static final SubLSymbol $sym125$NTH;
  private static final SubLSymbol $sym126$SET_NTH;
  private static final SubLSymbol $sym127$GETHASH;
  private static final SubLSymbol $sym128$SETHASH;
  private static final SubLSymbol $sym129$GETHASH_WITHOUT_VALUES;
  private static final SubLSymbol $sym130$CHAR;
  private static final SubLSymbol $sym131$SET_CHAR;
  private static final SubLSymbol $sym132$AREF;
  private static final SubLSymbol $sym133$SET_AREF;
  private static final SubLSymbol $sym134$GET;
  private static final SubLSymbol $sym135$PUT;
  private static final SubLSymbol $sym136$SYMBOL_VALUE;
  private static final SubLSymbol $sym137$SET;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$SETTER_FROM_ACCESSOR;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$CSOME;
  private static final SubLSymbol $sym144$CSOME_LIST_VAR;
  private static final SubLList $list145;
  private static final SubLSymbol $sym146$CTIME;
  private static final SubLSymbol $sym147$TIME_VAR;
  private static final SubLList $list148;
  private static final SubLSymbol $sym149$_;
  private static final SubLList $list150;
  private static final SubLList $list151;
  private static final SubLList $list152;
  private static final SubLSymbol $sym153$CUNWIND_PROTECT;
  private static final SubLSymbol $sym154$CUNWIND_PROTECT_ENV_VAR;
  private static final SubLSymbol $sym155$_CUNWIND_PROTECT;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$DECLAIM;
  private static final SubLSymbol $sym158$PROCLAIM;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$DECLARE;
  private static final SubLList $list161;
  private static final SubLSymbol $sym162$DEFCONSTANT;
  private static final SubLSymbol $sym163$SYMBOLP;
  private static final SubLList $list164;
  private static final SubLSymbol $sym165$DEFINE;
  private static final SubLList $list166;
  private static final SubLList $list167;
  private static final SubLSymbol $sym168$RET;
  private static final SubLSymbol $sym169$POSSIBLY_NOTE_FUNCTION_ENTRY;
  private static final SubLSymbol $sym170$THREAD;
  private static final SubLSymbol $sym171$_WITH_CURRENT_THREAD;
  private static final SubLSymbol $sym172$TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P;
  private static final SubLList $list173;
  private static final SubLSymbol $sym174$DEFLEXICAL;
  private static final SubLList $list175;
  private static final SubLSymbol $sym176$DEFMACRO;
  private static final SubLList $list177;
  private static final SubLSymbol $sym178$CDESTRUCTURING_BIND;
  private static final SubLList $list179;
  private static final SubLSymbol $sym180$DEFINE_MACROEXPANDER;
  private static final SubLSymbol $sym181$DEFPARAMETER;
  private static final SubLList $list182;
  private static final SubLSymbol $sym183$DEFSTRUCT;
  private static final SubLSymbol $sym184$_DEFSTRUCT_CLASS;
  private static final SubLList $list185;
  private static final SubLSymbol $kw186$NAME;
  private static final SubLSymbol $kw187$C_STRUCTURE_TAG;
  private static final SubLSymbol $kw188$PREDICATE;
  private static final SubLSymbol $kw189$SLOTS;
  private static final SubLSymbol $kw190$SLOT_KEYWORDS;
  private static final SubLSymbol $kw191$GETTERS;
  private static final SubLSymbol $kw192$SETTERS;
  private static final SubLSymbol $kw193$PRINT_FUNCTION;
  private static final SubLSymbol $sym194$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLList $list195;
  private static final SubLSymbol $sym196$DEFVAR;
  private static final SubLList $list197;
  private static final SubLSymbol $sym198$ENFORCE_TYPE;
  private static final SubLSymbol $sym199$_DP_ENFORCE_TYPE;
  private static final SubLList $list200;
  private static final SubLSymbol $sym201$ENFORCE_MUST;
  private static final SubLSymbol $sym202$ERROR;
  private static final SubLList $list203;
  private static final SubLSymbol $sym204$FIF;
  private static final SubLList $list205;
  private static final SubLSymbol $sym206$FUNCTION;
  private static final SubLSymbol $sym207$SYMBOL_FUNCTION;
  private static final SubLList $list208;
  private static final SubLSymbol $sym209$FUNLESS;
  private static final SubLList $list210;
  private static final SubLSymbol $sym211$FWHEN;
  private static final SubLList $list212;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$MULTIPLE_VALUE_LIST;
  private static final SubLSymbol $sym215$MUST;
  private static final SubLSymbol $sym216$_IGNORE_MUSTS__;
  private static final SubLList $list217;
  private static final SubLSymbol $sym218$NTH_VALUE;
  private static final SubLList $list219;
  private static final SubLSymbol $sym220$PCASE;
  private static final SubLSymbol $sym221$PCASE_VAR;
  private static final SubLSymbol $sym222$PCOND;
  private static final SubLList $list223;
  private static final SubLSymbol $sym224$OTHERWISE;
  private static final SubLString $str225$_AEncountered_a_PCASE_that_uses_T;
  private static final SubLString $str226$Within_;
  private static final SubLString $str227$___;
  private static final SubLString $str228$;
  private static final SubLList $list229;
  private static final SubLList $list230;
  private static final SubLList $list231;
  private static final SubLSymbol $sym232$PIF;
  private static final SubLList $list233;
  private static final SubLList $list234;
  private static final SubLList $list235;
  private static final SubLList $list236;
  private static final SubLList $list237;
  private static final SubLSymbol $sym238$INLINE;
  private static final SubLSymbol $sym239$NOTINLINE;
  private static final SubLSymbol $sym240$_PROCLAIM;
  private static final SubLList $list241;
  private static final SubLList $list242;
  private static final SubLList $list243;
  private static final SubLSymbol $sym244$PWHEN;
  private static final SubLList $list245;
  private static final SubLList $list246;
  private static final SubLList $list247;
  private static final SubLSymbol $sym248$WITH_ERROR_HANDLER;
  private static final SubLSymbol $sym249$CATCH_VAR;
  private static final SubLSymbol $sym250$ERROR_VAR;
  private static final SubLSymbol $sym251$_WITH_ERROR_HANDLER;
  private static final SubLSymbol $sym252$WITH_PROCESS_RESOURCE_TRACKING;
  private static final SubLSymbol $sym253$RESOURCE_TRACKING_ENV_VAR;
  private static final SubLSymbol $sym254$_WITH_PROCESS_RESOURCE_TRACKING;
  private static final SubLSymbol $sym255$WITH_STATIC_AREA;
  private static final SubLList $list256;
  private static final SubLSymbol $sym257$WITH_THREAD_PRIVATE_AREA;
  private static final SubLList $list258;
  private static final SubLSymbol $sym259$WITH_WORKING_AREA;
  private static final SubLList $list260;
  private static final SubLList $list261;
  private static final SubLList $list262;
  private static final SubLList $list263;
  private static final SubLList $list264;
  private static final SubLSymbol $sym265$_DEFSTRUCT_CONSTRUCT;
  private static final SubLSymbol $sym266$INTEGERP;
  private static final SubLList $list267;
  private static final SubLSymbol $sym268$_DEFSTRUCT_GET_SLOT;
  private static final SubLList $list269;
  private static final SubLSymbol $sym270$_DEFSTRUCT_OBJECT_P;
  private static final SubLList $list271;
  private static final SubLSymbol $sym272$_DEFSTRUCT_SET_SLOT;
  private static final SubLList $list273;
  private static final SubLList $list274;
  private static final SubLList $list275;
  private static final SubLList $list276;
  private static final SubLSymbol $sym277$IN_PACKAGE;
  private static final SubLSymbol $sym278$_PACKAGE_;
  private static final SubLSymbol $sym279$FIND_PACKAGE;
  private static final SubLList $list280;
  private static final SubLList $list281;
  private static final SubLSymbol $sym282$UNTIL;
  private static final SubLSymbol $sym283$WHILE;
  private static final SubLList $list284;
  private static final SubLList $list285;
  private static final SubLList $list286;
  private static final SubLList $list287;
  private static final SubLList $list288;
  private static final SubLList $list289;
  private static final SubLList $list290;
  private static final SubLList $list291;
  private static final SubLList $list292;
  private static final SubLList $list293;
  private static final SubLList $list294;
  private static final SubLList $list295;
  private static final SubLList $list296;
  private static final SubLList $list297;
  private static final SubLList $list298;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 1048L)
  public static SubLObject translator_within_binding_constructP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $translator_within_binding_constructP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 1153L)
  public static SubLObject translate_form(SubLObject form)
  {
    if( form.isAtom() )
    {
      return translate_atom( form );
    }
    form = possibly_translate_implementation_symbols( form );
    final SubLObject operator = form.first();
    final SubLObject translator = operator_translator( operator );
    if( NIL != translator )
    {
      return translate_form_via_translator( translator, form );
    }
    if( operator.isMacroOperator() )
    {
      return translate_form_via_macroexpansion( form );
    }
    return translate_form_as_function_call( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 1823L)
  public static SubLObject test_translate_form(final SubLObject form, SubLObject backend, SubLObject translation_features)
  {
    if( backend == UNPROVIDED )
    {
      backend = $kw0$SL2C;
    }
    if( translation_features == UNPROVIDED )
    {
      translation_features = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = reader.$features$.currentBinding( thread );
    try
    {
      reader.$features$.bind( conses_high.adjoin( backend, translation_features, UNPROVIDED, UNPROVIDED ), thread );
      result = translate_form( form );
    }
    finally
    {
      reader.$features$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 2064L)
  public static SubLObject translate_atom(final SubLObject form)
  {
    if( form.isKeyword() )
    {
      return translate_constant_atom( form );
    }
    if( form == NIL || form == T )
    {
      return translate_constant_atom( form );
    }
    if( form.isSymbol() )
    {
      return translate_variable_reference( form );
    }
    if( NIL != Eval.constantp( form, UNPROVIDED ) )
    {
      return translate_constant_atom( form );
    }
    return Errors.error( $str1$unexpected_form____S, form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 2689L)
  public static SubLObject translate_constant_atom(final SubLObject form)
  {
    return file_translation.tsf_possibly_convert_internal_constant( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 2792L)
  public static SubLObject translator_variable_binding_type(final SubLObject variable)
  {
    SubLObject binding_type = xref_database.xref_global_binding_type( variable );
    if( binding_type != $kw2$UNSPECIFIED )
    {
      return binding_type;
    }
    binding_type = file_translation.current_ts_file_global_binding_type( variable );
    if( binding_type != $kw2$UNSPECIFIED )
    {
      return binding_type;
    }
    return $kw3$LOCAL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 3180L)
  public static SubLObject translate_variable_reference(final SubLObject variable)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject binding_type = translator_variable_binding_type( variable );
    if( binding_type != $kw3$LOCAL )
    {
      xref_database.xref_note_global_reference( variable );
    }
    final SubLObject pcase_var = binding_type;
    if( pcase_var.eql( $kw3$LOCAL ) )
    {
      return translate_variable( variable );
    }
    if( pcase_var.eql( $kw4$DYNAMIC ) )
    {
      return ConsesLow.list( $sym5$_DYN, translate_variable( variable ) );
    }
    if( pcase_var.eql( $kw6$LEXICAL ) )
    {
      return ConsesLow.list( $sym7$_LEX, translate_variable( variable ) );
    }
    if( pcase_var.eql( $kw8$CONSTANT ) )
    {
      return ConsesLow.list( $sym7$_LEX, translate_variable( variable ) );
    }
    return Errors.error( $str9$Unexpected_binding_type__S_for_va, binding_type, variable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 3773L)
  public static SubLObject translate_variable(final SubLObject variable)
  {
    final SubLObject binding_type = translator_variable_binding_type( variable );
    if( binding_type != $kw3$LOCAL )
    {
      file_translation.tsf_possibly_note_referenced_global( variable );
    }
    return variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4000L)
  public static SubLObject translate_form_via_translator(final SubLObject translator, final SubLObject form)
  {
    if( NIL == subl_promotions.function_symbol_p( translator ) )
    {
      return Errors.error( $str10$time_to_implement__S, translator );
    }
    return Functions.funcall( translator, form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4195L)
  public static SubLObject translate_form_via_macroexpansion(final SubLObject form)
  {
    SubLObject macro = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list11 );
    macro = form.first();
    final SubLObject args;
    final SubLObject current = args = form.rest();
    xref_database.xref_note_macro_use( macro );
    return translate_form( Eval.macroexpand_1( form, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4400L)
  public static SubLObject translate_form_as_function_call(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list12 );
    operator = form.first();
    final SubLObject args;
    final SubLObject current = args = form.rest();
    xref_database.xref_note_function_call( operator );
    final SubLObject translated_operator = translate_function_symbol( operator );
    SubLObject translated_args = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      translated_args = ConsesLow.cons( translate_form( arg ), translated_args );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return reader.bq_cons( translated_operator, ConsesLow.append( Sequences.nreverse( translated_args ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4782L)
  public static SubLObject translate_function_symbol(final SubLObject form)
  {
    file_translation.tsf_possibly_note_referenced_function( form );
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4893L)
  public static SubLObject vaccess_level(final SubLObject symbol)
  {
    return Symbols.get( symbol, $sym13$VACCESS, $sym14$PROTECTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 5330L)
  public static SubLObject faccess_level(final SubLObject symbol)
  {
    return Symbols.get( symbol, $sym15$FACCESS, $sym14$PROTECTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 5525L)
  public static SubLObject private_global_p(final SubLObject symbol)
  {
    return makeBoolean( symbol.isSymbol() && $sym16$PRIVATE == vaccess_level( symbol ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 5647L)
  public static SubLObject private_method_p(final SubLObject symbol)
  {
    return makeBoolean( symbol.isSymbol() && $sym16$PRIVATE == faccess_level( symbol ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 5768L)
  public static SubLObject translate_body(final SubLObject body)
  {
    SubLObject translated_body = NIL;
    SubLObject cdolist_list_var = body;
    SubLObject form = NIL;
    form = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject translated_form = translate_form( form );
      translated_body = ConsesLow.cons( translated_form, translated_body );
      cdolist_list_var = cdolist_list_var.rest();
      form = cdolist_list_var.first();
    }
    return common_optimization.translator_optimize_body( Sequences.nreverse( translated_body ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6025L)
  public static SubLObject translate_arglist(final SubLObject arglist)
  {
    SubLObject translated_arglist = NIL;
    SubLObject cdolist_list_var = arglist;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isCons() )
      {
        SubLObject current;
        final SubLObject datum = current = arg;
        SubLObject variable = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list17 );
        current = current.rest();
        final SubLObject providedP = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list17 );
        current = current.rest();
        if( NIL == current )
        {
          translated_arglist = ConsesLow.cons( ConsesLow.listS( variable, translate_form( initialization ), ConsesLow.append( ( NIL != providedP ) ? ConsesLow.list( providedP ) : NIL, NIL ) ), translated_arglist );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
        }
      }
      else
      {
        translated_arglist = ConsesLow.cons( arg, translated_arglist );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Sequences.nreverse( translated_arglist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6432L)
  public static SubLObject translate_empty_progn(SubLObject form)
  {
    if( form == UNPROVIDED )
    {
      form = NIL;
    }
    return $list18;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6522L)
  public static SubLObject binding_type_p(final SubLObject obj)
  {
    return list_utilities.member_eqP( obj, $list19 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6745L)
  public static SubLObject dynamic_global_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && $kw4$DYNAMIC == Symbols.get( v_object, $kw20$BINDING_TYPE, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6989L)
  public static SubLObject lexical_global_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && $kw6$LEXICAL == Symbols.get( v_object, $kw20$BINDING_TYPE, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 7233L)
  public static SubLObject constant_global_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && $kw8$CONSTANT == Symbols.get( v_object, $kw20$BINDING_TYPE, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 7509L)
  public static SubLObject global_binding_type(final SubLObject global)
  {
    if( NIL != dynamic_global_p( global ) )
    {
      return $kw4$DYNAMIC;
    }
    if( NIL != lexical_global_p( global ) )
    {
      return $kw6$LEXICAL;
    }
    if( NIL != constant_global_p( global ) )
    {
      return $kw8$CONSTANT;
    }
    return $kw2$UNSPECIFIED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 7798L)
  public static SubLObject optimize_funcall_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && NIL != Symbols.get( v_object, $sym21$OPTIMIZE_FUNCALL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 8465L)
  public static SubLObject translator_consider_expansion_factor(final SubLObject method, final SubLObject form, final SubLObject translated_form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $consider_translator_expansion_factor$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    final SubLObject form_size = list_utilities.cons_count( form );
    final SubLObject translated_form_size = list_utilities.cons_count( translated_form );
    final SubLObject expansion_factor = translate_form_expansion_factor_int( form_size, translated_form_size );
    final SubLObject expansion_cutoff = $int22$50;
    SubLObject stats = NIL;
    if( $consider_translator_expansion_factor$.getDynamicValue( thread ).isVector() )
    {
      stats = $consider_translator_expansion_factor$.getDynamicValue( thread );
      Vectors.set_aref( stats, ZERO_INTEGER, Numbers.add( Vectors.aref( stats, ZERO_INTEGER ), ONE_INTEGER ) );
      Vectors.set_aref( stats, ONE_INTEGER, Numbers.add( Vectors.aref( stats, ONE_INTEGER ), form_size ) );
      Vectors.set_aref( stats, TWO_INTEGER, Numbers.add( Vectors.aref( stats, TWO_INTEGER ), translated_form_size ) );
      Vectors.set_aref( stats, THREE_INTEGER, Numbers.add( Vectors.aref( stats, THREE_INTEGER ), expansion_factor ) );
    }
    if( expansion_factor.numG( expansion_cutoff ) )
    {
      if( $consider_translator_expansion_factor$.getDynamicValue( thread ).isVector() )
      {
        Vectors.set_aref( stats, FOUR_INTEGER, ConsesLow.cons( ConsesLow.list( method, expansion_factor ), Vectors.aref( stats, FOUR_INTEGER ) ) );
      }
      else
      {
        Errors.warn( $str23$Method__S_undergoes_a__Sx_expansi, method, Numbers.round( number_utilities.significant_digits( expansion_factor, TWO_INTEGER ), UNPROVIDED ) );
      }
    }
    return expansion_factor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 9454L)
  public static SubLObject translate_form_expansion_factor(final SubLObject form, final SubLObject backend, final SubLObject features)
  {
    final SubLObject translated_form = test_translate_form( form, backend, features );
    final SubLObject form_size = list_utilities.cons_count( form );
    final SubLObject translated_form_size = list_utilities.cons_count( translated_form );
    return translate_form_expansion_factor_int( form_size, translated_form_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 9854L)
  public static SubLObject translate_form_expansion_factor_int(final SubLObject form_size, final SubLObject translated_form_size)
  {
    return form_size.isZero() ? ZERO_INTEGER : Numbers.divide( translated_form_size, form_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 10037L)
  public static SubLObject show_translation_expansion_factor_stats(SubLObject stats, SubLObject stream)
  {
    if( stats == UNPROVIDED )
    {
      stats = $consider_translator_expansion_factor$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject total_forms = Vectors.aref( stats, ZERO_INTEGER );
    final SubLObject total_form_size = Vectors.aref( stats, ONE_INTEGER );
    final SubLObject total_translated_form_size = Vectors.aref( stats, TWO_INTEGER );
    final SubLObject largest_expansions = Sort.sort( conses_high.copy_list( Vectors.aref( stats, FOUR_INTEGER ) ), Symbols.symbol_function( $sym24$_ ), Symbols.symbol_function( $sym25$SECOND ) );
    PrintLow.format( stream, $str26$__Total_forms______________S, total_forms );
    PrintLow.format( stream, $str27$__Mean_form_size___________S, number_utilities.significant_digits( Numbers.divide( total_form_size, total_forms ), THREE_INTEGER ) );
    PrintLow.format( stream, $str28$__Mean_expansion_factor____Sx, number_utilities.significant_digits( Numbers.divide( total_translated_form_size, total_form_size ), THREE_INTEGER ) );
    PrintLow.format( stream, $str29$__Largest_expansions__ );
    SubLObject cdolist_list_var = largest_expansions;
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum_$1 = current = datum;
      SubLObject method = NIL;
      SubLObject expansion_factor = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum_$1, $list30 );
      method = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum_$1, $list30 );
      expansion_factor = current.first();
      current = current.rest();
      if( NIL == current )
      {
        PrintLow.format( stream, $str31$___4___Dx___S, Numbers.round( number_utilities.significant_digits( expansion_factor, THREE_INTEGER ), UNPROVIDED ), method );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list30 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 15583L)
  public static SubLObject operator_translator(final SubLObject operator)
  {
    return list_utilities.alist_lookup_without_values( $operator_translators$.getGlobalValue(), operator, Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 15707L)
  public static SubLObject translate_cand(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list33 );
    operator = form.first();
    final SubLObject expressions;
    final SubLObject current = expressions = form.rest();
    list_utilities.verify_operator( operator, $sym34$CAND );
    SubLObject translated_expressions = NIL;
    SubLObject cdolist_list_var = expressions;
    SubLObject expression = NIL;
    expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject translated_expression = translate_Xdtb( ConsesLow.list( $sym35$_DTB, expression ) );
      translated_expressions = ConsesLow.cons( translated_expression, translated_expressions );
      cdolist_list_var = cdolist_list_var.rest();
      expression = cdolist_list_var.first();
    }
    return common_optimization.translator_optimize_Xbtd( ConsesLow.list( $sym36$_BTD, common_optimization.translator_optimize_Xand( reader.bq_cons( $sym37$_AND, ConsesLow.append( Sequences.nreverse(
        translated_expressions ), NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 16381L)
  public static SubLObject translate_ccatch(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject tag = NIL;
    SubLObject ans_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list38 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list38 );
    tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list38 );
    ans_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym39$CCATCH );
    final SubLObject translated_tag = translate_form( tag );
    final SubLObject translated_body = translate_binding_construct_body( body );
    final SubLObject ccatch_env_var = $sym40$CCATCH_ENV_VAR;
    return ConsesLow.listS( $sym41$_CCATCH, ConsesLow.list( translated_tag, ans_var, ccatch_env_var ), ConsesLow.append( translated_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 16809L)
  public static SubLObject translate_binding_construct_body(final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $translator_within_binding_constructP$.currentBinding( thread );
    try
    {
      $translator_within_binding_constructP$.bind( T, thread );
      result = translate_body( body );
    }
    finally
    {
      $translator_within_binding_constructP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 17001L)
  public static SubLObject translate_binding_construct_form(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $translator_within_binding_constructP$.currentBinding( thread );
    try
    {
      $translator_within_binding_constructP$.bind( T, thread );
      result = translate_form( form );
    }
    finally
    {
      $translator_within_binding_constructP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 17193L)
  public static SubLObject translate_cdec(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list42 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list42 );
    place = current.first();
    current = current.rest();
    final SubLObject delta = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list42 );
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym43$CDEC );
      return translate_csetf( ConsesLow.list( $sym44$CSETF, place, ConsesLow.list( $sym45$_, place, delta ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list42 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 17410L)
  public static SubLObject translate_cdo(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject vars = NIL;
    SubLObject endtest = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list46 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list46 );
    vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list46 );
    endtest = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym47$CDO );
    SubLObject clet_vars = NIL;
    SubLObject for_initializations = NIL;
    SubLObject for_test = NIL;
    SubLObject for_updates = NIL;
    SubLObject result_body = NIL;
    SubLObject cdolist_list_var = vars;
    SubLObject var_form = NIL;
    var_form = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$3;
      final SubLObject datum_$2 = current_$3 = var_form;
      SubLObject var = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$3, datum_$2, $list48 );
      var = current_$3.first();
      current_$3 = current_$3.rest();
      final SubLObject initialization = current_$3.isCons() ? current_$3.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current_$3, datum_$2, $list48 );
      current_$3 = current_$3.rest();
      final SubLObject update = current_$3.isCons() ? current_$3.first() : NIL;
      final SubLObject updateP = Types.consp( current_$3 );
      cdestructuring_bind.destructuring_bind_must_listp( current_$3, datum_$2, $list48 );
      current_$3 = current_$3.rest();
      if( NIL == current_$3 )
      {
        clet_vars = ConsesLow.cons( var, clet_vars );
        for_initializations = ConsesLow.cons( ConsesLow.list( $sym49$CSETQ, var, initialization ), for_initializations );
        if( NIL != updateP )
        {
          for_updates = ConsesLow.cons( ConsesLow.list( $sym49$CSETQ, var, update ), for_updates );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$2, $list48 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var_form = cdolist_list_var.first();
    }
    clet_vars = Sequences.nreverse( clet_vars );
    for_initializations = Sequences.nreverse( for_initializations );
    for_updates = Sequences.nreverse( for_updates );
    SubLObject current_$4;
    final SubLObject datum_$3 = current_$4 = endtest;
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$4, datum_$3, $list50 );
    test = current_$4.first();
    final SubLObject result;
    current_$4 = ( result = current_$4.rest() );
    for_test = ConsesLow.list( $sym51$CNOT, test );
    result_body = result;
    return translate_clet( ConsesLow.listS( $sym52$CLET, clet_vars, ConsesLow.listS( $sym53$_FOR, ConsesLow.list( for_initializations, for_test, for_updates ), ConsesLow.append( body, NIL ) ), ConsesLow.append(
        result_body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 18449L)
  public static SubLObject translate_Xcdo_symbols(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list54 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list54 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sym = NIL;
    SubLObject v_package = NIL;
    SubLObject iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list54 );
    sym = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list54 );
    v_package = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list54 );
    iterator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym55$_CDO_SYMBOLS );
      final SubLObject translated_body = translate_body( body );
      return ConsesLow.listS( $sym55$_CDO_SYMBOLS, ConsesLow.list( sym, v_package, iterator ), ConsesLow.append( translated_body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list54 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 18875L)
  public static SubLObject translate_cdo_symbols(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list56 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list56 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sym = NIL;
    SubLObject v_package = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list56 );
    sym = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list56 );
    v_package = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym57$CDO_SYMBOLS );
      final SubLObject cdo_symbols_package = $sym58$CDO_SYMBOLS_PACKAGE;
      final SubLObject cdo_symbols_iterator = $sym59$CDO_SYMBOLS_ITERATOR;
      return translate_clet( ConsesLow.list( $sym52$CLET, ConsesLow.list( ConsesLow.list( cdo_symbols_package, v_package ), cdo_symbols_iterator, sym ), ConsesLow.listS( $sym55$_CDO_SYMBOLS, ConsesLow.list( sym,
          cdo_symbols_package, cdo_symbols_iterator ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 19309L)
  public static SubLObject translate_Xcdohash(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list60 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject val = NIL;
    SubLObject table = NIL;
    SubLObject iterator = NIL;
    SubLObject entry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list60 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list60 );
    val = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list60 );
    table = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list60 );
    iterator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list60 );
    entry = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym61$_CDOHASH );
      final SubLObject translated_body = translate_body( body );
      final SubLObject translated_table = translate_form( table );
      return ConsesLow.listS( $sym61$_CDOHASH, ConsesLow.list( key, val, translated_table, iterator, entry ), ConsesLow.append( translated_body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 19729L)
  public static SubLObject translate_cdohash(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list62 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list62 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject val = NIL;
    SubLObject table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list62 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list62 );
    val = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list62 );
    table = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list62 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    list_utilities.verify_operator( operator, $sym63$CDOHASH );
    if( !table.isAtom() || NIL != dynamic_global_p( table ) )
    {
      final SubLObject cdohash_table = $sym64$CDOHASH_TABLE;
      return translate_clet( ConsesLow.list( $sym52$CLET, ConsesLow.list( ConsesLow.list( cdohash_table, table ) ), ConsesLow.listS( $sym63$CDOHASH, ConsesLow.list( key, val, cdohash_table ), ConsesLow.append( body,
          NIL ) ) ) );
    }
    final SubLObject cdohash_iterator = $sym65$CDOHASH_ITERATOR;
    final SubLObject cdohash_entry = $sym66$CDOHASH_ENTRY;
    return translate_clet( ConsesLow.list( $sym52$CLET, ConsesLow.list( key, val ), ConsesLow.listS( $sym61$_CDOHASH, ConsesLow.list( key, val, table, cdohash_iterator, cdohash_entry ), ConsesLow.append( body,
        NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 20301L)
  public static SubLObject translate_cdolist(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list67 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list67 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject listform = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list67 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list67 );
    listform = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym68$CDOLIST );
      final SubLObject cdolist_list_var = $sym69$CDOLIST_LIST_VAR;
      return translate_clet_local( ConsesLow.list( $sym70$CLET_LOCAL, ConsesLow.list( ConsesLow.list( cdolist_list_var, listform ) ), ConsesLow.listS( $sym71$FOR, ConsesLow.list( ConsesLow.list( ConsesLow.list( var,
          ConsesLow.list( $sym72$FIRST, cdolist_list_var ) ) ), ConsesLow.list( $sym51$CNOT, ConsesLow.list( $sym73$NULL, cdolist_list_var ) ), ConsesLow.list( ConsesLow.list( $sym49$CSETQ, cdolist_list_var, ConsesLow
              .list( $sym74$REST, cdolist_list_var ) ), ConsesLow.list( $sym49$CSETQ, var, ConsesLow.list( $sym72$FIRST, cdolist_list_var ) ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list67 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 20809L)
  public static SubLObject translate_cdotimes(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list75 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list75 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject integer = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list75 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list75 );
    integer = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list75 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    list_utilities.verify_operator( operator, $sym76$CDOTIMES );
    if( !integer.isAtom() )
    {
      final SubLObject cdotimes_end_var = $sym77$CDOTIMES_END_VAR;
      return translate_clet_local( ConsesLow.list( $sym70$CLET_LOCAL, ConsesLow.list( ConsesLow.list( cdotimes_end_var, integer ) ), ConsesLow.listS( $sym76$CDOTIMES, ConsesLow.list( var, cdotimes_end_var ), ConsesLow
          .append( body, NIL ) ) ) );
    }
    return translate_for( ConsesLow.listS( $sym71$FOR, ConsesLow.list( ConsesLow.list( reader.bq_cons( var, $list78 ) ), ConsesLow.list( $sym79$_, var, integer ), ConsesLow.list( ConsesLow.list( $sym80$CINC, var ) ) ),
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 21270L)
  public static SubLObject translate_check_type(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list81 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list81 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list81 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym82$CHECK_TYPE );
      xref_database.xref_note_function_call( pred );
      final SubLObject translated_object = translate_form( v_object );
      final SubLObject translated_pred = translate_function_symbol( pred );
      translate_form( ConsesLow.list( $sym83$QUOTE, pred ) );
      return ConsesLow.list( $sym84$_DP_CHECK_TYPE, translated_object, translated_pred );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list81 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 21749L)
  public static SubLObject translate_cinc(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list42 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list42 );
    place = current.first();
    current = current.rest();
    final SubLObject delta = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list42 );
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym80$CINC );
      return translate_csetf( ConsesLow.list( $sym44$CSETF, place, ConsesLow.list( $sym85$_, place, delta ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list42 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 21966L)
  public static SubLObject translate_clet(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list86 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list86 );
    v_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym52$CLET );
    return translate_clet_int( NIL, v_bindings, body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 22161L)
  public static SubLObject translate_clet_int(final SubLObject some_globalP, final SubLObject v_bindings, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == v_bindings )
    {
      return translate_final_clet_body( some_globalP, body );
    }
    SubLObject first_binding = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( v_bindings, v_bindings, $list87 );
    first_binding = v_bindings.first();
    final SubLObject rest_bindings;
    final SubLObject current = rest_bindings = v_bindings.rest();
    SubLObject variable = $kw88$UNSET;
    SubLObject initialization = NIL;
    if( first_binding.isCons() )
    {
      SubLObject current_$7;
      final SubLObject datum_$6 = current_$7 = first_binding;
      SubLObject binding_variable = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list89 );
      binding_variable = current_$7.first();
      current_$7 = current_$7.rest();
      final SubLObject binding_initialization = current_$7.isCons() ? current_$7.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current_$7, datum_$6, $list89 );
      current_$7 = current_$7.rest();
      if( NIL == current_$7 )
      {
        variable = binding_variable;
        initialization = binding_initialization;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$6, $list89 );
      }
    }
    else
    {
      variable = first_binding;
    }
    final SubLObject binding_type = translator_variable_binding_type( variable );
    final SubLObject translated_variable = translate_variable( variable );
    final SubLObject translated_initialization = translate_form( initialization );
    final SubLObject translated_sub_body = translate_clet_int( makeBoolean( NIL != some_globalP || binding_type == $kw4$DYNAMIC ), rest_bindings, body );
    final SubLObject pcase_var = binding_type;
    if( pcase_var.eql( $kw3$LOCAL ) )
    {
      return common_optimization.translator_optimize_clet_local( ConsesLow.list( $sym70$CLET_LOCAL, ConsesLow.list( ConsesLow.list( translated_variable, translated_initialization ) ), translated_sub_body ) );
    }
    if( pcase_var.eql( $kw4$DYNAMIC ) )
    {
      xref_database.xref_note_global_binding( variable );
      return common_optimization.translator_optimize_clet_bind( ConsesLow.list( $sym90$CLET_BIND, ConsesLow.list( ConsesLow.list( translated_variable, translated_initialization ) ), translated_sub_body ) );
    }
    if( pcase_var.eql( $kw6$LEXICAL ) )
    {
      return Errors.error( $str91$CLET_of_lexical_variable__S_being, variable );
    }
    if( pcase_var.eql( $kw8$CONSTANT ) )
    {
      return Errors.error( $str92$CLET_of_constant__S_is_not_allowe, variable );
    }
    return Errors.error( $str93$Unexpected_variable__S, variable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 24088L)
  public static SubLObject translate_final_clet_body(final SubLObject some_globalP, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != some_globalP )
    {
      final SubLObject _prev_bind_0 = $translator_within_binding_constructP$.currentBinding( thread );
      try
      {
        $translator_within_binding_constructP$.bind( T, thread );
        result = translate_final_clet_body( NIL, body );
      }
      finally
      {
        $translator_within_binding_constructP$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      result = translate_progn( reader.bq_cons( $sym94$PROGN, ConsesLow.append( body, NIL ) ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 24377L)
  public static SubLObject translate_cmultiple_value_bind(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject vars = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list95 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list95 );
    vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list95 );
    value = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym96$CMULTIPLE_VALUE_BIND );
    final SubLObject v_bindings = translate_cmultiple_value_bind_bindings( vars, value );
    return translate_progn( ConsesLow.list( $sym94$PROGN, $list97, ConsesLow.listS( $sym52$CLET, v_bindings, $list97, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 24770L)
  public static SubLObject translate_cmultiple_value_bind_bindings(final SubLObject vars, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject first_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( vars, vars, $list98 );
    first_var = vars.first();
    final SubLObject rest_vars;
    final SubLObject current = rest_vars = vars.rest();
    SubLObject v_bindings = ConsesLow.list( ConsesLow.list( first_var, value ) );
    SubLObject list_var = NIL;
    SubLObject var = NIL;
    SubLObject num = NIL;
    list_var = rest_vars;
    var = list_var.first();
    for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), var = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
    {
      v_bindings = ConsesLow.cons( ConsesLow.list( var, ConsesLow.list( $sym99$_MVAL, number_utilities.f_1X( num ) ) ), v_bindings );
    }
    return Sequences.nreverse( v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 25071L)
  public static SubLObject translate_cnot(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list100 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list100 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym51$CNOT );
      final SubLObject translated_expression = translate_Xdtb( ConsesLow.list( $sym35$_DTB, expression ) );
      return common_optimization.translator_optimize_Xbtd( ConsesLow.list( $sym36$_BTD, common_optimization.translator_optimize_Xnot( ConsesLow.list( $sym101$_NOT, translated_expression ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list100 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 25388L)
  public static SubLObject translate_cor(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list33 );
    operator = form.first();
    final SubLObject expressions;
    final SubLObject current = expressions = form.rest();
    list_utilities.verify_operator( operator, $sym102$COR );
    SubLObject translated_expressions = NIL;
    SubLObject cdolist_list_var = expressions;
    SubLObject expression = NIL;
    expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject translated_expression = translate_Xdtb( ConsesLow.list( $sym35$_DTB, expression ) );
      translated_expressions = ConsesLow.cons( translated_expression, translated_expressions );
      cdolist_list_var = cdolist_list_var.rest();
      expression = cdolist_list_var.first();
    }
    return common_optimization.translator_optimize_Xbtd( ConsesLow.list( $sym36$_BTD, common_optimization.translator_optimize_Xor( reader.bq_cons( $sym103$_OR, ConsesLow.append( Sequences.nreverse(
        translated_expressions ), NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 25855L)
  public static SubLObject translate_cpop(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list104 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list104 );
    place = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym105$CPOP );
      return translate_csetf( ConsesLow.list( $sym44$CSETF, place, ConsesLow.list( $sym106$CDR, place ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list104 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 26047L)
  public static SubLObject translate_cprogv(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject special_vars = NIL;
    SubLObject v_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list107 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list107 );
    special_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list107 );
    v_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym108$CPROGV );
    final SubLObject translated_special_vars = translate_form( special_vars );
    final SubLObject translated_bindings = translate_form( v_bindings );
    final SubLObject translated_body = translate_body( body );
    final SubLObject cprogv_var = $sym109$CPROGV_VAR;
    return ConsesLow.listS( $sym110$_CPROGV, ConsesLow.list( translated_special_vars, translated_bindings, cprogv_var ), ConsesLow.append( translated_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 26561L)
  public static SubLObject translate_cpush(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject item = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list111 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list111 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list111 );
    place = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym112$CPUSH );
      return translate_csetf( ConsesLow.list( $sym44$CSETF, place, ConsesLow.list( $sym113$CONS, item, place ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list111 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 26768L)
  public static SubLObject translate_cpushnew(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject item = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list114 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list114 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list114 );
    place = current.first();
    current = current.rest();
    final SubLObject test = current.isCons() ? current.first() : $list115;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list114 );
    current = current.rest();
    final SubLObject key = current.isCons() ? current.first() : $list116;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list114 );
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym117$CPUSHNEW );
      final SubLObject item_var = $sym118$ITEM_VAR;
      return translate_clet( ConsesLow.list( $sym52$CLET, ConsesLow.list( ConsesLow.list( item_var, item ) ), ConsesLow.list( $sym119$PUNLESS, ConsesLow.list( $sym120$MEMBER, item_var, place, test, key ), ConsesLow.list(
          $sym112$CPUSH, item_var, place ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list114 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 27136L)
  public static SubLObject translate_csetf(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject place = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list121 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list121 );
    place = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list121 );
    value = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list121 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym44$CSETF );
    if( place.isAtom() )
    {
      return translate_csetq( ConsesLow.list( $sym49$CSETQ, place, value ) );
    }
    final SubLObject accessor = place.first();
    SubLObject expansion = NIL;
    final SubLObject pcase_var = accessor;
    if( pcase_var.eql( $sym122$CAR ) )
    {
      expansion = ConsesLow.list( $sym123$RPLACA, conses_high.second( place ), value );
    }
    else if( pcase_var.eql( $sym106$CDR ) )
    {
      expansion = ConsesLow.list( $sym124$RPLACD, conses_high.second( place ), value );
    }
    else if( pcase_var.eql( $sym125$NTH ) )
    {
      expansion = ConsesLow.list( $sym126$SET_NTH, conses_high.second( place ), conses_high.third( place ), value );
    }
    else if( pcase_var.eql( $sym127$GETHASH ) )
    {
      expansion = ConsesLow.list( $sym128$SETHASH, conses_high.second( place ), conses_high.third( place ), value );
    }
    else if( pcase_var.eql( $sym129$GETHASH_WITHOUT_VALUES ) )
    {
      expansion = ConsesLow.list( $sym128$SETHASH, conses_high.second( place ), conses_high.third( place ), value );
    }
    else if( pcase_var.eql( $sym130$CHAR ) )
    {
      expansion = ConsesLow.list( $sym131$SET_CHAR, conses_high.second( place ), conses_high.third( place ), value );
    }
    else if( pcase_var.eql( $sym132$AREF ) )
    {
      expansion = ConsesLow.list( $sym133$SET_AREF, conses_high.second( place ), conses_high.third( place ), value );
    }
    else if( pcase_var.eql( $sym134$GET ) )
    {
      expansion = ConsesLow.list( $sym135$PUT, conses_high.second( place ), conses_high.third( place ), value );
    }
    else if( pcase_var.eql( $sym136$SYMBOL_VALUE ) )
    {
      expansion = ConsesLow.list( $sym137$SET, conses_high.second( place ), value );
    }
    else
    {
      SubLObject current_$9;
      final SubLObject datum_$8 = current_$9 = place;
      SubLObject accessor_$10 = NIL;
      SubLObject expression = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list138 );
      accessor_$10 = current_$9.first();
      current_$9 = current_$9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list138 );
      expression = current_$9.first();
      current_$9 = current_$9.rest();
      if( NIL == current_$9 )
      {
        final SubLObject setter = translator_setter_from_accessor( accessor_$10 );
        expansion = ConsesLow.list( setter, expression, value );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$8, $list138 );
      }
    }
    return translate_form( expansion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 28626L)
  public static SubLObject translator_setter_from_accessor(final SubLObject accessor)
  {
    return Functions.funcall( $sym139$SETTER_FROM_ACCESSOR, accessor );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 28816L)
  public static SubLObject translate_csetq(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject var = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list140 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list140 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list140 );
    value = current.first();
    final SubLObject var_val_pairs;
    current = ( var_val_pairs = current.rest() );
    list_utilities.verify_operator( operator, $sym49$CSETQ );
    translate_possibly_note_global_modification( var );
    final SubLObject translated_variable = translate_variable( var );
    final SubLObject translated_value = translate_form( value );
    if( NIL == var_val_pairs )
    {
      return ConsesLow.list( $sym49$CSETQ, translated_variable, translated_value );
    }
    final SubLObject more_forms = translate_csetq_int( var_val_pairs );
    return ConsesLow.listS( $sym94$PROGN, ConsesLow.list( $sym49$CSETQ, translated_variable, translated_value ), ConsesLow.append( more_forms, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 29386L)
  public static SubLObject translate_csetq_int(final SubLObject var_val_pairs)
  {
    if( NIL == var_val_pairs )
    {
      return NIL;
    }
    SubLObject var = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var_val_pairs, var_val_pairs, $list141 );
    var = var_val_pairs.first();
    SubLObject current = var_val_pairs.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, var_val_pairs, $list141 );
    value = current.first();
    final SubLObject more_var_val_pairs;
    current = ( more_var_val_pairs = current.rest() );
    translate_possibly_note_global_modification( var );
    final SubLObject translated_variable = translate_variable( var );
    final SubLObject translated_value = translate_form( value );
    final SubLObject more_forms = translate_csetq_int( more_var_val_pairs );
    return reader.bq_cons( ConsesLow.list( $sym49$CSETQ, translated_variable, translated_value ), ConsesLow.append( more_forms, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 29861L)
  public static SubLObject translate_possibly_note_global_modification(final SubLObject variable)
  {
    final SubLObject pcase_var;
    final SubLObject binding_type = pcase_var = translator_variable_binding_type( variable );
    if( pcase_var.eql( $kw6$LEXICAL ) || pcase_var.eql( $kw4$DYNAMIC ) )
    {
      xref_database.xref_note_global_modification( variable );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 30120L)
  public static SubLObject translate_csome(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list142 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list142 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject listform = NIL;
    SubLObject endvar = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list142 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list142 );
    listform = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list142 );
    endvar = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym143$CSOME );
      final SubLObject csome_list_var = $sym144$CSOME_LIST_VAR;
      return translate_punless( ConsesLow.list( $sym119$PUNLESS, endvar, ConsesLow.list( $sym70$CLET_LOCAL, ConsesLow.list( ConsesLow.list( csome_list_var, listform ) ), ConsesLow.listS( $sym71$FOR, ConsesLow.list(
          ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym72$FIRST, csome_list_var ) ) ), ConsesLow.list( $sym51$CNOT, ConsesLow.list( $sym102$COR, endvar, ConsesLow.list( $sym73$NULL, csome_list_var ) ) ),
          ConsesLow.list( ConsesLow.list( $sym49$CSETQ, csome_list_var, ConsesLow.list( $sym74$REST, csome_list_var ) ), ConsesLow.list( $sym49$CSETQ, var, ConsesLow.list( $sym72$FIRST, csome_list_var ) ) ) ), ConsesLow
              .append( body, NIL ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list142 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 30646L)
  public static SubLObject translate_ctime(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list145 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list145 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym146$CTIME );
    final SubLObject time_var = $sym147$TIME_VAR;
    return translate_clet_local( ConsesLow.listS( $sym70$CLET_LOCAL, ConsesLow.list( reader.bq_cons( time_var, $list148 ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym49$CSETQ, var, ConsesLow.listS(
        $sym149$_, ConsesLow.list( $sym45$_, $list150, time_var ), $list151 ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 31039L)
  public static SubLObject translate_cunwind_protect(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject protected_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list152 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list152 );
    protected_form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym153$CUNWIND_PROTECT );
    final SubLObject translated_protected_form = translate_binding_construct_form( protected_form );
    final SubLObject translated_body = translate_body( body );
    final SubLObject cunwind_protect_env_var = $sym154$CUNWIND_PROTECT_ENV_VAR;
    return common_optimization.translator_optimize_Xcunwind_protect( ConsesLow.listS( $sym155$_CUNWIND_PROTECT, cunwind_protect_env_var, translated_protected_form, ConsesLow.append( translated_body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 31569L)
  public static SubLObject translate_cvs_id(final SubLObject form)
  {
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 31635L)
  public static SubLObject translate_declaim(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list156 );
    operator = form.first();
    final SubLObject declaration_specifiers;
    final SubLObject current = declaration_specifiers = form.rest();
    list_utilities.verify_operator( operator, $sym157$DECLAIM );
    SubLObject result_forms = NIL;
    SubLObject cdolist_list_var = declaration_specifiers;
    SubLObject declaration_specifier = NIL;
    declaration_specifier = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result_forms = ConsesLow.cons( ConsesLow.list( $sym158$PROCLAIM, list_utilities.quotify( declaration_specifier ) ), result_forms );
      cdolist_list_var = cdolist_list_var.rest();
      declaration_specifier = cdolist_list_var.first();
    }
    return translate_progn( reader.bq_cons( $sym94$PROGN, ConsesLow.append( Sequences.nreverse( result_forms ), NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 32038L)
  public static SubLObject translate_declare(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list159 );
    operator = form.first();
    final SubLObject declarations;
    final SubLObject current = declarations = form.rest();
    list_utilities.verify_operator( operator, $sym160$DECLARE );
    return translate_empty_progn( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 32257L)
  public static SubLObject translate_defconstant(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list161 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list161 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list161 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list161 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list161 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym162$DEFCONSTANT );
    file_translation.tsf_possibly_note_defined_global_binding_type( variable, $kw8$CONSTANT );
    SubLObject translated_form = NIL;
    final SubLObject global_var = variable;
    assert NIL != Types.symbolp( global_var ) : global_var;
    final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding( thread );
    try
    {
      xref_database.$xref_global_scope$.bind( global_var, thread );
      xref_database.xref_note_global_definition( variable );
      xref_database.xref_note_global_binding_type( variable, $kw8$CONSTANT );
      final SubLObject translated_initialization = translate_form( initialization );
      translated_form = ConsesLow.listS( $sym162$DEFCONSTANT, variable, translated_initialization, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) );
    }
    finally
    {
      xref_database.$xref_global_scope$.rebind( _prev_bind_0, thread );
    }
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 32908L)
  public static SubLObject translate_define(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list164 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list164 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list164 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym165$DEFINE );
    file_translation.tsf_possibly_note_defined_function_arglist( name, arglist );
    SubLObject current_$12;
    final SubLObject datum_$11 = current_$12 = body;
    SubLObject documentation = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$11, $list166 );
    documentation = current_$12.first();
    SubLObject real_body;
    current_$12 = ( real_body = current_$12.rest() );
    if( !documentation.isString() )
    {
      documentation = NIL;
      real_body = body;
    }
    SubLObject translated_form = NIL;
    final SubLObject method_var = name;
    assert NIL != Types.symbolp( method_var ) : method_var;
    final SubLObject _prev_bind_0 = xref_database.$xref_method_scope$.currentBinding( thread );
    try
    {
      xref_database.$xref_method_scope$.bind( method_var, thread );
      xref_database.xref_note_function_definition( name );
      xref_database.xref_note_method_formal_arglist( name, arglist );
      final SubLObject translated_arglist = translate_arglist( arglist );
      final SubLObject translated_real_body = translate_method_body( name, real_body );
      translated_form = ConsesLow.listS( $sym165$DEFINE, name, translated_arglist, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, translated_real_body, NIL ) );
    }
    finally
    {
      xref_database.$xref_method_scope$.rebind( _prev_bind_0, thread );
    }
    translator_consider_expansion_factor( name, form, translated_form );
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 33952L)
  public static SubLObject translator_current_method()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $translator_current_method$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 34035L)
  public static SubLObject translate_method_body(final SubLObject name, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject translated_body = NIL;
    final SubLObject _prev_bind_0 = $translator_current_method$.currentBinding( thread );
    try
    {
      $translator_current_method$.bind( name, thread );
      translated_body = translate_method_possibly_add_final_ret( body );
      translated_body = translate_method_possibly_add_entry( name, body );
      translated_body = translate_body( translated_body );
      translated_body = translate_method_possibly_add_with_current_thread( translated_body );
    }
    finally
    {
      $translator_current_method$.rebind( _prev_bind_0, thread );
    }
    return translated_body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 34505L)
  public static SubLObject translate_method_possibly_add_final_ret(final SubLObject body)
  {
    if( NIL == body )
    {
      return conses_high.copy_tree( $list167 );
    }
    final SubLObject last_cons = conses_high.last( body, UNPROVIDED );
    final SubLObject last_form = last_cons.first();
    if( last_form.isCons() )
    {
      SubLObject current;
      final SubLObject datum = current = last_form;
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
      operator = current.first();
      final SubLObject args;
      current = ( args = current.rest() );
      if( $sym168$RET == operator )
      {
        return body;
      }
    }
    final SubLObject final_ret_forms = conses_high.copy_tree( $list167 );
    ConsesLow.rplacd( last_cons, final_ret_forms );
    return body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 34948L)
  public static SubLObject translate_method_possibly_add_entry(final SubLObject name, SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != complex_special_forms.$call_profiling_enabledP$.getDynamicValue( thread ) )
    {
      body = reader.bq_cons( ConsesLow.list( $sym169$POSSIBLY_NOTE_FUNCTION_ENTRY, ConsesLow.list( $sym83$QUOTE, name ) ), ConsesLow.append( body, NIL ) );
    }
    return body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 35140L)
  public static SubLObject translate_method_possibly_add_with_current_thread(SubLObject translated_body)
  {
    if( NIL != translator_body_accesses_current_thread_p( translated_body ) )
    {
      final SubLObject thread = $sym170$THREAD;
      translated_body = ConsesLow.list( ConsesLow.listS( $sym171$_WITH_CURRENT_THREAD, thread, ConsesLow.append( translated_body, NIL ) ) );
    }
    return translated_body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 35441L)
  public static SubLObject translator_body_accesses_current_thread_p(final SubLObject body)
  {
    return list_utilities.tree_find_if( $sym172$TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P, body, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 35582L)
  public static SubLObject translator_current_thread_access_construct_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( v_object.isSymbol() && NIL != list_utilities.member_eqP( v_object, $list173 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 35796L)
  public static SubLObject translate_deflexical(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list161 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list161 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list161 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list161 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list161 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym174$DEFLEXICAL );
    file_translation.tsf_possibly_note_defined_global_binding_type( variable, $kw6$LEXICAL );
    SubLObject translated_form = NIL;
    final SubLObject global_var = variable;
    assert NIL != Types.symbolp( global_var ) : global_var;
    final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding( thread );
    try
    {
      xref_database.$xref_global_scope$.bind( global_var, thread );
      xref_database.xref_note_global_definition( variable );
      xref_database.xref_note_global_binding_type( variable, $kw6$LEXICAL );
      final SubLObject translated_initialization = translate_form( initialization );
      translated_form = ConsesLow.listS( $sym174$DEFLEXICAL, variable, translated_initialization, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) );
    }
    finally
    {
      xref_database.$xref_global_scope$.rebind( _prev_bind_0, thread );
    }
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 36441L)
  public static SubLObject translate_defmacro(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject name = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list175 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list175 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list175 );
    pattern = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym176$DEFMACRO );
    SubLObject current_$14;
    final SubLObject datum_$13 = current_$14 = body;
    SubLObject documentation = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$14, datum_$13, $list166 );
    documentation = current_$14.first();
    SubLObject real_body;
    current_$14 = ( real_body = current_$14.rest() );
    if( !documentation.isString() )
    {
      documentation = NIL;
      real_body = body;
    }
    final SubLObject macroexpander_arglist = $list177;
    final SubLObject macroexpander_body = ConsesLow.list( ConsesLow.listS( $sym178$CDESTRUCTURING_BIND, pattern, $list179, ConsesLow.append( real_body, NIL ) ) );
    SubLObject translated_form = NIL;
    final SubLObject method_var = name;
    assert NIL != Types.symbolp( method_var ) : method_var;
    final SubLObject _prev_bind_0 = xref_database.$xref_method_scope$.currentBinding( thread );
    try
    {
      xref_database.$xref_method_scope$.bind( method_var, thread );
      xref_database.xref_note_macro_definition( name );
      xref_database.xref_note_method_formal_arglist( name, pattern );
      final SubLObject translated_arglist = macroexpander_arglist;
      final SubLObject translated_body = translate_method_body( name, macroexpander_body );
      translated_form = ConsesLow.listS( $sym180$DEFINE_MACROEXPANDER, name, translated_arglist, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, translated_body, NIL ) );
    }
    finally
    {
      xref_database.$xref_method_scope$.rebind( _prev_bind_0, thread );
    }
    translator_consider_expansion_factor( name, form, translated_form );
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 37462L)
  public static SubLObject translate_defparameter(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    SubLObject initialization = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list161 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list161 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list161 );
    initialization = current.first();
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list161 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list161 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym181$DEFPARAMETER );
    file_translation.tsf_possibly_note_defined_global_binding_type( variable, $kw4$DYNAMIC );
    SubLObject translated_form = NIL;
    final SubLObject global_var = variable;
    assert NIL != Types.symbolp( global_var ) : global_var;
    final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding( thread );
    try
    {
      xref_database.$xref_global_scope$.bind( global_var, thread );
      xref_database.xref_note_global_definition( variable );
      xref_database.xref_note_global_binding_type( variable, $kw4$DYNAMIC );
      final SubLObject translated_initialization = translate_form( initialization );
      translated_form = ConsesLow.listS( $sym181$DEFPARAMETER, variable, translated_initialization, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) );
    }
    finally
    {
      xref_database.$xref_global_scope$.rebind( _prev_bind_0, thread );
    }
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 38115L)
  public static SubLObject translate_defstruct(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list182 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list182 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list182 );
    name = current.first();
    final SubLObject options;
    current = ( options = current.rest() );
    final SubLObject v_slots;
    current = ( v_slots = temp );
    list_utilities.verify_operator( operator, $sym183$DEFSTRUCT );
    final SubLObject analysis = complex_special_forms.defstruct_analyze( name, options, v_slots );
    translate_defstruct_ensure_translated_constants( analysis );
    final SubLObject class_form = reader.bq_cons( $sym184$_DEFSTRUCT_CLASS, ConsesLow.append( analysis, NIL ) );
    final SubLObject translated_form = translate_form_via_macroexpansion( form );
    SubLObject current_$16;
    final SubLObject datum_$15 = current_$16 = translated_form;
    SubLObject operator_$17 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list185 );
    operator_$17 = current_$16.first();
    final SubLObject translated_body;
    current_$16 = ( translated_body = current_$16.rest() );
    list_utilities.verify_operator( operator_$17, $sym94$PROGN );
    final SubLObject final_translated_form = ConsesLow.listS( $sym94$PROGN, class_form, ConsesLow.append( translated_body, NIL ) );
    return final_translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 38781L)
  public static SubLObject translate_defstruct_ensure_translated_constants(final SubLObject analysis)
  {
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw186$NAME, analysis );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject c_structure_tag_tail = cdestructuring_bind.property_list_member( $kw187$C_STRUCTURE_TAG, analysis );
    final SubLObject c_structure_tag = ( NIL != c_structure_tag_tail ) ? conses_high.cadr( c_structure_tag_tail ) : NIL;
    final SubLObject predicate_tail = cdestructuring_bind.property_list_member( $kw188$PREDICATE, analysis );
    final SubLObject predicate = ( NIL != predicate_tail ) ? conses_high.cadr( predicate_tail ) : NIL;
    final SubLObject slots_tail = cdestructuring_bind.property_list_member( $kw189$SLOTS, analysis );
    final SubLObject v_slots = ( NIL != slots_tail ) ? conses_high.cadr( slots_tail ) : NIL;
    final SubLObject slot_keywords_tail = cdestructuring_bind.property_list_member( $kw190$SLOT_KEYWORDS, analysis );
    final SubLObject slot_keywords = ( NIL != slot_keywords_tail ) ? conses_high.cadr( slot_keywords_tail ) : NIL;
    final SubLObject getters_tail = cdestructuring_bind.property_list_member( $kw191$GETTERS, analysis );
    final SubLObject getters = ( NIL != getters_tail ) ? conses_high.cadr( getters_tail ) : NIL;
    final SubLObject setters_tail = cdestructuring_bind.property_list_member( $kw192$SETTERS, analysis );
    final SubLObject setters = ( NIL != setters_tail ) ? conses_high.cadr( setters_tail ) : NIL;
    final SubLObject print_function_tail = cdestructuring_bind.property_list_member( $kw193$PRINT_FUNCTION, analysis );
    SubLObject print_function = ( NIL != print_function_tail ) ? conses_high.cadr( print_function_tail ) : NIL;
    if( NIL == print_function )
    {
      print_function = $sym194$DEFAULT_STRUCT_PRINT_FUNCTION;
    }
    translate_form( ConsesLow.list( $sym83$QUOTE, name ) );
    translate_form( ConsesLow.list( $sym83$QUOTE, predicate ) );
    translate_form( ConsesLow.list( $sym83$QUOTE, c_structure_tag ) );
    translate_form( ConsesLow.list( $sym83$QUOTE, v_slots ) );
    translate_form( ConsesLow.list( $sym83$QUOTE, slot_keywords ) );
    translate_form( ConsesLow.list( $sym83$QUOTE, getters ) );
    translate_form( ConsesLow.list( $sym83$QUOTE, setters ) );
    translate_form( ConsesLow.list( $sym83$QUOTE, print_function ) );
    SubLObject end_var;
    SubLObject index;
    for( end_var = Numbers.add( TWO_INTEGER, Sequences.length( v_slots ) ), index = NIL, index = TWO_INTEGER; !index.numGE( end_var ); index = number_utilities.f_1X( index ) )
    {
      translate_form( ConsesLow.list( $sym83$QUOTE, index ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 39603L)
  public static SubLObject translate_defvar(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list195 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list195 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list195 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, form, $list195 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list195 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym196$DEFVAR );
    file_translation.tsf_possibly_note_defined_global_binding_type( variable, $kw4$DYNAMIC );
    SubLObject translated_form = NIL;
    final SubLObject global_var = variable;
    assert NIL != Types.symbolp( global_var ) : global_var;
    final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding( thread );
    try
    {
      xref_database.$xref_global_scope$.bind( global_var, thread );
      xref_database.xref_note_global_definition( variable );
      xref_database.xref_note_global_binding_type( variable, $kw4$DYNAMIC );
      final SubLObject translated_initialization = translate_form( initialization );
      translated_form = ConsesLow.listS( $sym196$DEFVAR, variable, translated_initialization, ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) );
    }
    finally
    {
      xref_database.$xref_global_scope$.rebind( _prev_bind_0, thread );
    }
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 40232L)
  public static SubLObject translate_Xdtb(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list197 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list197 );
    condition = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym35$_DTB );
      final SubLObject translated_condition = translate_form( condition );
      return common_optimization.translator_optimize_Xdtb( ConsesLow.list( $sym35$_DTB, translated_condition ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list197 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 40500L)
  public static SubLObject translate_enforce_type(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list81 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list81 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list81 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym198$ENFORCE_TYPE );
      xref_database.xref_note_function_call( pred );
      final SubLObject translated_object = translate_form( v_object );
      final SubLObject translated_pred = translate_function_symbol( pred );
      translate_form( ConsesLow.list( $sym83$QUOTE, pred ) );
      return ConsesLow.list( $sym199$_DP_ENFORCE_TYPE, translated_object, translated_pred );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list81 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 40987L)
  public static SubLObject translate_enforce_must(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject form_$18 = NIL;
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list200 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list200 );
    form_$18 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list200 );
    format_string = current.first();
    final SubLObject v_arguments;
    current = ( v_arguments = current.rest() );
    list_utilities.verify_operator( operator, $sym201$ENFORCE_MUST );
    return translate_punless( ConsesLow.list( $sym119$PUNLESS, form_$18, ConsesLow.listS( $sym202$ERROR, format_string, ConsesLow.append( v_arguments, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 41263L)
  public static SubLObject translate_fif(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    SubLObject true_value = NIL;
    SubLObject false_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list203 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list203 );
    condition = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list203 );
    true_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list203 );
    false_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym204$FIF );
      final SubLObject translated_condition = translate_Xdtb( ConsesLow.list( $sym35$_DTB, condition ) );
      final SubLObject translated_true_value = translate_form( true_value );
      final SubLObject translated_false_value = translate_form( false_value );
      return common_optimization.translator_optimize_fif( ConsesLow.list( $sym204$FIF, translated_condition, translated_true_value, translated_false_value ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list203 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 41735L)
  public static SubLObject translate_function(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject symbol = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list205 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list205 );
    symbol = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym206$FUNCTION );
      return translate_form( ConsesLow.list( $sym207$SYMBOL_FUNCTION, ConsesLow.list( $sym83$QUOTE, symbol ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list205 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 41938L)
  public static SubLObject translate_funless(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    SubLObject false_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list208 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list208 );
    condition = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list208 );
    false_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym209$FUNLESS );
      return translate_fif( ConsesLow.list( $sym204$FIF, condition, NIL, false_value ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list208 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 42159L)
  public static SubLObject translate_fwhen(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    SubLObject true_value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list210 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list210 );
    condition = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list210 );
    true_value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym211$FWHEN );
      return translate_fif( ConsesLow.listS( $sym204$FIF, condition, true_value, $list212 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list210 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 42372L)
  public static SubLObject translate_ignore(final SubLObject form)
  {
    return translate_empty_progn( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 42462L)
  public static SubLObject translate_multiple_value_list(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject subform = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list213 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list213 );
    subform = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym214$MULTIPLE_VALUE_LIST );
      final SubLObject translated_subform = translate_form( subform );
      return ConsesLow.list( $sym214$MULTIPLE_VALUE_LIST, translated_subform );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list213 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 42755L)
  public static SubLObject translate_must(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject form_$19 = NIL;
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list200 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list200 );
    form_$19 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list200 );
    format_string = current.first();
    final SubLObject v_arguments;
    current = ( v_arguments = current.rest() );
    list_utilities.verify_operator( operator, $sym215$MUST );
    return translate_punless( ConsesLow.list( $sym119$PUNLESS, $sym216$_IGNORE_MUSTS__, ConsesLow.listS( $sym201$ENFORCE_MUST, form_$19, format_string, ConsesLow.append( v_arguments, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 43030L)
  public static SubLObject translate_nth_value(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject n = NIL;
    SubLObject subform = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list217 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list217 );
    n = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list217 );
    subform = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym218$NTH_VALUE );
      final SubLObject translated_n = translate_form( n );
      final SubLObject translated_subform = translate_form( subform );
      return ConsesLow.list( $sym218$NTH_VALUE, translated_n, translated_subform );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list217 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 43344L)
  public static SubLObject translate_pcase(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject test_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list219 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list219 );
    test_object = current.first();
    final SubLObject v_clauses;
    current = ( v_clauses = current.rest() );
    list_utilities.verify_operator( operator, $sym220$PCASE );
    final SubLObject pcase_var = $sym221$PCASE_VAR;
    SubLObject pcond_clauses = NIL;
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pcond_clauses = ConsesLow.cons( translate_pcase_clause( pcase_var, clause ), pcond_clauses );
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    return translate_clet_local( ConsesLow.list( $sym70$CLET_LOCAL, ConsesLow.list( ConsesLow.list( pcase_var, test_object ) ), reader.bq_cons( $sym222$PCOND, ConsesLow.append( Sequences.nreverse( pcond_clauses ),
        NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 43781L)
  public static SubLObject translate_pcase_clause(final SubLObject test_object, final SubLObject clause)
  {
    SubLObject key = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( clause, clause, $list223 );
    key = clause.first();
    final SubLObject clause_body;
    final SubLObject current = clause_body = clause.rest();
    SubLObject pcond_test = NIL;
    if( key == $sym224$OTHERWISE )
    {
      pcond_test = T;
    }
    else if( key == T )
    {
      Errors.warn( $str225$_AEncountered_a_PCASE_that_uses_T, ( NIL != translator_current_method() ) ? Sequences.cconcatenate( $str226$Within_, new SubLObject[] { format_nil.format_nil_s_no_copy(
          translator_current_method() ), $str227$___
      } ) : $str228$ );
      pcond_test = T;
    }
    else if( key.isCons() )
    {
      SubLObject disjuncts = NIL;
      SubLObject cdolist_list_var = key;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        disjuncts = ConsesLow.cons( ConsesLow.list( EQL, test_object, list_utilities.quotify( item ) ), disjuncts );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      pcond_test = reader.bq_cons( $sym102$COR, ConsesLow.append( Sequences.nreverse( disjuncts ), NIL ) );
    }
    else
    {
      pcond_test = ConsesLow.list( EQL, test_object, list_utilities.quotify( key ) );
    }
    return reader.bq_cons( pcond_test, ConsesLow.append( clause_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 44507L)
  public static SubLObject translate_pcond(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list229 );
    operator = form.first();
    final SubLObject v_clauses;
    final SubLObject current = v_clauses = form.rest();
    list_utilities.verify_operator( operator, $sym222$PCOND );
    SubLObject translated_clauses = NIL;
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$21;
      final SubLObject datum_$20 = current_$21 = clause;
      SubLObject condition = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$21, datum_$20, $list230 );
      condition = current_$21.first();
      final SubLObject clause_body;
      current_$21 = ( clause_body = current_$21.rest() );
      final SubLObject translated_condition = translate_Xdtb( ConsesLow.list( $sym35$_DTB, condition ) );
      final SubLObject translated_clause_body = translate_body( clause_body );
      translated_clauses = ConsesLow.cons( reader.bq_cons( translated_condition, ConsesLow.append( translated_clause_body, NIL ) ), translated_clauses );
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    return common_optimization.translator_optimize_pcond( reader.bq_cons( $sym222$PCOND, ConsesLow.append( Sequences.nreverse( translated_clauses ), NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 45097L)
  public static SubLObject translate_pif(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    SubLObject action = NIL;
    SubLObject else_action = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list231 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list231 );
    condition = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list231 );
    action = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list231 );
    else_action = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym232$PIF );
      return translate_pcond( ConsesLow.list( $sym222$PCOND, ConsesLow.list( condition, action ), ConsesLow.list( T, else_action ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list231 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 45341L)
  public static SubLObject translate_proclaim(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject declaration_specifier = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list233 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list233 );
    declaration_specifier = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym158$PROCLAIM );
      final SubLObject evaluated_declaration_specifier = Eval.eval( declaration_specifier );
      SubLObject result_forms = NIL;
      if( declaration_specifier.isCons() )
      {
        SubLObject current_$23;
        final SubLObject datum_$22 = current_$23 = evaluated_declaration_specifier;
        SubLObject declaration_identifier = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$23, datum_$22, $list234 );
        declaration_identifier = current_$23.first();
        final SubLObject args;
        current_$23 = ( args = current_$23.rest() );
        if( $sym15$FACCESS == declaration_identifier )
        {
          SubLObject current_$24;
          final SubLObject datum_$23 = current_$24 = args;
          SubLObject visibility = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$24, datum_$23, $list235 );
          visibility = current_$24.first();
          final SubLObject v_methods;
          current_$24 = ( v_methods = current_$24.rest() );
          if( NIL != list_utilities.member_eqP( visibility, $list236 ) )
          {
            SubLObject cdolist_list_var = v_methods;
            SubLObject method = NIL;
            method = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              file_translation.tsf_possibly_note_defined_method_visibility( method, visibility );
              cdolist_list_var = cdolist_list_var.rest();
              method = cdolist_list_var.first();
            }
          }
        }
        else if( $sym13$VACCESS == declaration_identifier )
        {
          SubLObject current_$25;
          final SubLObject datum_$24 = current_$25 = args;
          SubLObject visibility = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$25, datum_$24, $list237 );
          visibility = current_$25.first();
          final SubLObject globals;
          current_$25 = ( globals = current_$25.rest() );
          if( NIL != list_utilities.member_eqP( visibility, $list236 ) )
          {
            SubLObject cdolist_list_var = globals;
            SubLObject global = NIL;
            global = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              file_translation.tsf_possibly_note_defined_global_visibility( global, visibility );
              cdolist_list_var = cdolist_list_var.rest();
              global = cdolist_list_var.first();
            }
          }
        }
        else if( $sym21$OPTIMIZE_FUNCALL == declaration_identifier || $sym238$INLINE == declaration_identifier || $sym239$NOTINLINE == declaration_identifier )
        {
          result_forms = ConsesLow.cons( ConsesLow.list( $sym240$_PROCLAIM, list_utilities.quotify( evaluated_declaration_specifier ) ), result_forms );
        }
      }
      return translate_progn( reader.bq_cons( $sym94$PROGN, ConsesLow.append( Sequences.nreverse( result_forms ), NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list233 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 46658L)
  public static SubLObject translate_progn(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list241 );
    operator = form.first();
    final SubLObject body;
    final SubLObject current = body = form.rest();
    list_utilities.verify_operator( operator, $sym94$PROGN );
    final SubLObject translated_body = translate_body( body );
    return common_optimization.translator_optimize_progn( reader.bq_cons( $sym94$PROGN, ConsesLow.append( translated_body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 46930L)
  public static SubLObject translate_punless(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list242 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list242 );
    condition = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym119$PUNLESS );
    return translate_pcond( ConsesLow.listS( $sym222$PCOND, reader.bq_cons( ConsesLow.list( $sym51$CNOT, condition ), ConsesLow.append( body, NIL ) ), $list243 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 47172L)
  public static SubLObject translate_pwhen(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject condition = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list242 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list242 );
    condition = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym244$PWHEN );
    return translate_pcond( ConsesLow.listS( $sym222$PCOND, reader.bq_cons( condition, ConsesLow.append( body, NIL ) ), $list243 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 47401L)
  public static SubLObject translate_quote(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list245 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list245 );
    v_object = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list245 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym83$QUOTE );
    final SubLObject object_to_use = file_translation.tsf_possibly_convert_internal_constant( v_object );
    if( object_to_use.eql( v_object ) )
    {
      return form;
    }
    return object_to_use;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 47750L)
  public static SubLObject translate_ret(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list100 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list100 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym168$RET );
      if( NIL != translator_within_binding_constructP() )
      {
        file_translation.tsf_possibly_note_method_returns_within_binding_construct( translator_current_method() );
        translate_form( $list246 );
      }
      final SubLObject translated_expression = translate_form( expression );
      return ConsesLow.list( $sym168$RET, translated_expression );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list100 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 48252L)
  public static SubLObject translate_with_error_handler(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject handler = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list247 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list247 );
    handler = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym248$WITH_ERROR_HANDLER );
    final SubLObject translated_handler = translate_form( handler );
    final SubLObject translated_body = translate_binding_construct_body( body );
    final SubLObject catch_var = $sym249$CATCH_VAR;
    final SubLObject error_var = $sym250$ERROR_VAR;
    return ConsesLow.listS( $sym251$_WITH_ERROR_HANDLER, ConsesLow.list( translated_handler, catch_var, error_var ), ConsesLow.append( translated_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 48752L)
  public static SubLObject translate_with_process_resource_tracking(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list145 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list145 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym252$WITH_PROCESS_RESOURCE_TRACKING );
    final SubLObject resource_tracking_env_var = $sym253$RESOURCE_TRACKING_ENV_VAR;
    final SubLObject translated_body = translate_binding_construct_body( body );
    return ConsesLow.listS( $sym254$_WITH_PROCESS_RESOURCE_TRACKING, resource_tracking_env_var, var, ConsesLow.append( translated_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 49279L)
  public static SubLObject translate_with_static_area(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list241 );
    operator = form.first();
    final SubLObject body;
    final SubLObject current = body = form.rest();
    list_utilities.verify_operator( operator, $sym255$WITH_STATIC_AREA );
    return translate_clet( ConsesLow.listS( $sym52$CLET, $list256, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 49548L)
  public static SubLObject translate_with_thread_private_area(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list241 );
    operator = form.first();
    final SubLObject body;
    final SubLObject current = body = form.rest();
    list_utilities.verify_operator( operator, $sym257$WITH_THREAD_PRIVATE_AREA );
    return translate_clet( ConsesLow.listS( $sym52$CLET, $list258, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 49849L)
  public static SubLObject translate_with_working_area(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list241 );
    operator = form.first();
    final SubLObject body;
    final SubLObject current = body = form.rest();
    list_utilities.verify_operator( operator, $sym259$WITH_WORKING_AREA );
    return translate_clet( ConsesLow.listS( $sym52$CLET, $list260, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 50122L)
  public static SubLObject translate_clet_bind(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject dynamic_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list261 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list261 );
    dynamic_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym90$CLET_BIND );
    if( NIL == dynamic_bindings )
    {
      return translate_progn( reader.bq_cons( $sym94$PROGN, ConsesLow.append( body, NIL ) ) );
    }
    SubLObject translated_bindings = NIL;
    final SubLObject translated_body = translate_binding_construct_body( body );
    SubLObject cdolist_list_var = dynamic_bindings;
    SubLObject dynamic_binding = NIL;
    dynamic_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$29;
      final SubLObject datum_$28 = current_$29 = dynamic_binding;
      SubLObject variable = NIL;
      SubLObject initialization = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$29, datum_$28, $list262 );
      variable = current_$29.first();
      current_$29 = current_$29.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$29, datum_$28, $list262 );
      initialization = current_$29.first();
      current_$29 = current_$29.rest();
      if( NIL == current_$29 )
      {
        xref_database.xref_note_global_binding( variable );
        final SubLObject translated_variable = translate_variable( variable );
        final SubLObject translated_initialization = translate_form( initialization );
        translated_bindings = ConsesLow.cons( ConsesLow.list( translated_variable, translated_initialization ), translated_bindings );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$28, $list262 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      dynamic_binding = cdolist_list_var.first();
    }
    return common_optimization.translator_optimize_clet_bind( ConsesLow.listS( $sym90$CLET_BIND, Sequences.nreverse( translated_bindings ), ConsesLow.append( translated_body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 51199L)
  public static SubLObject translate_clet_local(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject local_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list263 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list263 );
    local_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym70$CLET_LOCAL );
    if( NIL == local_bindings )
    {
      return translate_progn( reader.bq_cons( $sym94$PROGN, ConsesLow.append( body, NIL ) ) );
    }
    SubLObject translated_bindings = NIL;
    final SubLObject translated_body = translate_body( body );
    SubLObject cdolist_list_var = local_bindings;
    SubLObject local_binding = NIL;
    local_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$31;
      final SubLObject datum_$30 = current_$31 = local_binding;
      SubLObject variable = NIL;
      SubLObject initialization = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list262 );
      variable = current_$31.first();
      current_$31 = current_$31.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list262 );
      initialization = current_$31.first();
      current_$31 = current_$31.rest();
      if( NIL == current_$31 )
      {
        final SubLObject translated_variable = translate_variable( variable );
        final SubLObject translated_initialization = translate_form( initialization );
        translated_bindings = ConsesLow.cons( ConsesLow.list( translated_variable, translated_initialization ), translated_bindings );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$30, $list262 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      local_binding = cdolist_list_var.first();
    }
    return common_optimization.translator_optimize_clet_local( ConsesLow.listS( $sym70$CLET_LOCAL, Sequences.nreverse( translated_bindings ), ConsesLow.append( translated_body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 51989L)
  public static SubLObject translate_code_comment(final SubLObject form)
  {
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 52067L)
  public static SubLObject translate_defstruct_construct(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject c_structure_tag = NIL;
    SubLObject size = NIL;
    SubLObject type_var = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list264 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list264 );
    c_structure_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list264 );
    size = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list264 );
    type_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list264 );
    type = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list264 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym265$_DEFSTRUCT_CONSTRUCT );
    if( NIL != c_structure_tag && !assertionsDisabledSynth && NIL == Types.integerp( c_structure_tag ) )
    {
      throw new AssertionError( c_structure_tag );
    }
    assert NIL != Types.integerp( size ) : size;
    assert NIL != Types.symbolp( type_var ) : type_var;
    assert NIL != Types.symbolp( type ) : type;
    final SubLObject translated_type_var = translate_variable( type_var );
    return ConsesLow.list( $sym265$_DEFSTRUCT_CONSTRUCT, c_structure_tag, size, translated_type_var, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 52657L)
  public static SubLObject translate_defstruct_get_slot(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    SubLObject index = NIL;
    SubLObject type = NIL;
    SubLObject slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list267 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list267 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list267 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list267 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list267 );
    slot = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list267 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym268$_DEFSTRUCT_GET_SLOT );
    assert NIL != Types.symbolp( type ) : type;
    assert NIL != Types.symbolp( slot ) : slot;
    final SubLObject translated_object = translate_form( v_object );
    return ConsesLow.list( $sym268$_DEFSTRUCT_GET_SLOT, translated_object, index, type, slot );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 53052L)
  public static SubLObject translate_defstruct_object_p(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    SubLObject c_structure_tag = NIL;
    SubLObject type_var = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list269 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list269 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list269 );
    c_structure_tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list269 );
    type_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list269 );
    type = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list269 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym270$_DEFSTRUCT_OBJECT_P );
    if( NIL != c_structure_tag && !assertionsDisabledSynth && NIL == Types.integerp( c_structure_tag ) )
    {
      throw new AssertionError( c_structure_tag );
    }
    assert NIL != Types.symbolp( type_var ) : type_var;
    assert NIL != Types.symbolp( type ) : type;
    final SubLObject translated_object = translate_form( v_object );
    final SubLObject translated_type_var = translate_variable( type_var );
    return ConsesLow.list( $sym270$_DEFSTRUCT_OBJECT_P, translated_object, c_structure_tag, translated_type_var, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 53607L)
  public static SubLObject translate_defstruct_set_slot(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject v_object = NIL;
    SubLObject index = NIL;
    SubLObject value = NIL;
    SubLObject type = NIL;
    SubLObject slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list271 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list271 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list271 );
    index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list271 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list271 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list271 );
    slot = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list271 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym272$_DEFSTRUCT_SET_SLOT );
    assert NIL != Types.symbolp( type ) : type;
    assert NIL != Types.symbolp( slot ) : slot;
    final SubLObject translated_object = translate_form( v_object );
    final SubLObject translated_value = translate_form( value );
    return ConsesLow.list( $sym272$_DEFSTRUCT_SET_SLOT, translated_object, index, translated_value, type, slot );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 54073L)
  public static SubLObject translate_Xfor(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list273 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list273 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject initializations = NIL;
    SubLObject test = NIL;
    SubLObject updates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list273 );
    initializations = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list273 );
    test = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list273 );
    updates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym53$_FOR );
      final SubLObject translated_initializations = translate_body( initializations );
      final SubLObject translated_test = translate_form( test );
      final SubLObject translated_updates = translate_body( updates );
      final SubLObject translated_body = translate_body( body );
      return common_optimization.translator_optimize_Xfor( ConsesLow.listS( $sym53$_FOR, ConsesLow.list( translated_initializations, ConsesLow.list( $sym35$_DTB, translated_test ), translated_updates ), ConsesLow.append(
          translated_body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list273 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 54636L)
  public static SubLObject translate_for(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list274 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list274 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_bindings = NIL;
    SubLObject test = NIL;
    SubLObject updates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list274 );
    v_bindings = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list274 );
    test = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list274 );
    updates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      list_utilities.verify_operator( operator, $sym71$FOR );
      thread.resetMultipleValues();
      final SubLObject clet_vars = translate_for_bindings( v_bindings );
      final SubLObject initializations = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return translate_clet( ConsesLow.list( $sym52$CLET, clet_vars, ConsesLow.listS( $sym53$_FOR, ConsesLow.list( initializations, test, updates ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list274 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 54996L)
  public static SubLObject translate_for_bindings(final SubLObject v_bindings)
  {
    SubLObject clet_vars = NIL;
    SubLObject initializations = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding;
      SubLObject variable = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list275 );
      variable = current.first();
      current = current.rest();
      final SubLObject initialization = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list275 );
      current = current.rest();
      if( NIL == current )
      {
        clet_vars = ConsesLow.cons( variable, clet_vars );
        initializations = ConsesLow.cons( ConsesLow.list( $sym49$CSETQ, variable, initialization ), initializations );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list275 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( clet_vars ), Sequences.nreverse( initializations ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 55366L)
  public static SubLObject translate_in_package(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list276 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list276 );
    name = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( form, $list276 );
      return NIL;
    }
    list_utilities.verify_operator( operator, $sym277$IN_PACKAGE );
    if( NIL != translator_current_method() )
    {
      return translate_csetq( ConsesLow.list( $sym49$CSETQ, $sym278$_PACKAGE_, ConsesLow.list( $sym279$FIND_PACKAGE, ConsesLow.list( $sym83$QUOTE, name ) ) ) );
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 55704L)
  public static SubLObject translate_Xmval(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject n = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list280 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list280 );
    n = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( operator, $sym99$_MVAL );
      final SubLObject translated_n = translate_form( n );
      return ConsesLow.list( $sym99$_MVAL, translated_n );
    }
    cdestructuring_bind.cdestructuring_bind_error( form, $list280 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 55917L)
  public static SubLObject translate_Xreset_mval(final SubLObject form)
  {
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 55993L)
  public static SubLObject translate_until(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list281 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list281 );
    test = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym282$UNTIL );
    final SubLObject negated_test = ConsesLow.list( $sym51$CNOT, test );
    return translate_while( ConsesLow.listS( $sym283$WHILE, negated_test, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 56253L)
  public static SubLObject translate_while(final SubLObject form)
  {
    SubLObject operator = NIL;
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list281 );
    operator = form.first();
    SubLObject current = form.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, form, $list281 );
    test = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    list_utilities.verify_operator( operator, $sym283$WHILE );
    final SubLObject translated_test = translate_form( test );
    final SubLObject translated_body = translate_body( body );
    return ConsesLow.listS( $sym283$WHILE, ConsesLow.list( $sym35$_DTB, translated_test ), ConsesLow.append( translated_body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 57570L)
  public static SubLObject translator_implementation_symbol_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && NIL != list_utilities.sublisp_boolean( list_utilities.alist_lookup_without_values( $translator_implementation_symbols$.getGlobalValue(), v_object, Symbols.symbol_function(
        EQ ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 57758L)
  public static SubLObject translate_implementation_symbol(final SubLObject symbol)
  {
    return list_utilities.alist_lookup_without_values( $translator_implementation_symbols$.getGlobalValue(), symbol, Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 57934L)
  public static SubLObject possibly_translate_implementation_symbols(SubLObject form)
  {
    if( NIL != translator_implementation_symbol_p( form ) )
    {
      form = translate_implementation_symbol( form );
    }
    else if( form.isCons() )
    {
      SubLObject current;
      final SubLObject datum = current = form;
      SubLObject operator = NIL;
      SubLObject args = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list284 );
      operator = current.first();
      current = ( args = current.rest() );
      if( NIL != translator_implementation_symbol_p( operator ) )
      {
        operator = translate_implementation_symbol( operator );
        form = reader.bq_cons( operator, ConsesLow.append( args, NIL ) );
      }
    }
    return form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 58351L)
  public static SubLObject clet_bind(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject dynamic_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list285 );
    dynamic_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == dynamic_bindings )
    {
      return reader.bq_cons( $sym94$PROGN, ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym52$CLET, dynamic_bindings, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 58814L)
  public static SubLObject clet_local(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject local_bindings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list286 );
    local_bindings = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == local_bindings )
    {
      return reader.bq_cons( $sym94$PROGN, ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym52$CLET, local_bindings, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59040L)
  public static SubLObject csetq_dynamic(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym49$CSETQ, variable, value );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list287 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59170L)
  public static SubLObject csetq_lexical(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym49$CSETQ, variable, value );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list287 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59299L)
  public static SubLObject csetq_local(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list287 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym49$CSETQ, variable, value );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list287 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59420L)
  public static SubLObject sublisp_for(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list288 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_bindings = NIL;
    SubLObject test = NIL;
    SubLObject updates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list288 );
    v_bindings = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list288 );
    test = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list288 );
    updates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym52$CLET, v_bindings, ConsesLow.listS( $sym283$WHILE, ConsesLow.list( $sym51$CNOT, test ), ConsesLow.append( body, updates, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list288 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59578L)
  public static SubLObject Xfor(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list289 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject initializations = NIL;
    SubLObject test = NIL;
    SubLObject updates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list289 );
    initializations = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list289 );
    test = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list289 );
    updates = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return reader.bq_cons( $sym94$PROGN, ConsesLow.append( initializations, ConsesLow.list( ConsesLow.listS( $sym283$WHILE, ConsesLow.list( $sym51$CNOT, test ), ConsesLow.append( body, updates, NIL ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list289 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59728L)
  public static SubLObject Xcdohash(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject val = NIL;
    SubLObject table = NIL;
    SubLObject table_var = NIL;
    SubLObject iterator_var = NIL;
    SubLObject entry_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    val = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    table = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    table_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    iterator_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    entry_var = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list290 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( iterator_var ) : iterator_var;
    assert NIL != Types.symbolp( entry_var ) : entry_var;
    return ConsesLow.list( $sym52$CLET, ConsesLow.list( ConsesLow.list( table_var, table ) ), ConsesLow.listS( $sym63$CDOHASH, ConsesLow.list( key, val, table_var ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59970L)
  public static SubLObject Xccatch(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tag = NIL;
    SubLObject ans_var = NIL;
    SubLObject env_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    ans_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    env_var = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list291 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( env_var ) : env_var;
    return ConsesLow.listS( $sym39$CCATCH, tag, ans_var, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60098L)
  public static SubLObject Xcunwind_protect(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject env_var = NIL;
    SubLObject protected_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list292 );
    env_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list292 );
    protected_form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.symbolp( env_var ) : env_var;
    return ConsesLow.listS( $sym153$CUNWIND_PROTECT, protected_form, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60252L)
  public static SubLObject Xcprogv(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject special_vars = NIL;
    SubLObject v_bindings = NIL;
    SubLObject internal_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    special_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    v_bindings = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list293 );
    internal_var = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list293 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( internal_var ) : internal_var;
    return ConsesLow.listS( $sym108$CPROGV, special_vars, v_bindings, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60410L)
  public static SubLObject Xcdo_symbols(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list294 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sym = NIL;
    SubLObject v_package = NIL;
    SubLObject package_var = NIL;
    SubLObject iterator_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list294 );
    sym = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list294 );
    v_package = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list294 );
    package_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list294 );
    iterator_var = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list294 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( package_var ) : package_var;
    assert NIL != Types.symbolp( iterator_var ) : iterator_var;
    return ConsesLow.listS( $sym57$CDO_SYMBOLS, ConsesLow.list( sym, v_package ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60607L)
  public static SubLObject Xwith_error_handler(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list295 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject handler = NIL;
    SubLObject catch_var = NIL;
    SubLObject error_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list295 );
    handler = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list295 );
    catch_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list295 );
    error_var = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list295 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( catch_var ) : catch_var;
    assert NIL != Types.symbolp( error_var ) : error_var;
    return ConsesLow.listS( $sym248$WITH_ERROR_HANDLER, handler, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60797L)
  public static SubLObject Xwith_process_resource_tracking(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject resource_var = NIL;
    SubLObject result_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    resource_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    result_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.symbolp( resource_var ) : resource_var;
    assert NIL != Types.symbolp( result_var ) : result_var;
    return ConsesLow.listS( $sym252$WITH_PROCESS_RESOURCE_TRACKING, result_var, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 61012L)
  public static SubLObject Xwith_current_thread(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject thread_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list297 );
    thread_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.symbolp( thread_var ) : thread_var;
    return ConsesLow.listS( $sym52$CLET, ConsesLow.list( reader.bq_cons( thread_var, $list298 ) ), ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_form_translation_file()
  {
    SubLFiles.declareFunction( me, "translator_within_binding_constructP", "TRANSLATOR-WITHIN-BINDING-CONSTRUCT?", 0, 0, false );
    SubLFiles.declareFunction( me, "translate_form", "TRANSLATE-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "test_translate_form", "TEST-TRANSLATE-FORM", 1, 2, false );
    SubLFiles.declareFunction( me, "translate_atom", "TRANSLATE-ATOM", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_constant_atom", "TRANSLATE-CONSTANT-ATOM", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_variable_binding_type", "TRANSLATOR-VARIABLE-BINDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_variable_reference", "TRANSLATE-VARIABLE-REFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_variable", "TRANSLATE-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_form_via_translator", "TRANSLATE-FORM-VIA-TRANSLATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "translate_form_via_macroexpansion", "TRANSLATE-FORM-VIA-MACROEXPANSION", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_form_as_function_call", "TRANSLATE-FORM-AS-FUNCTION-CALL", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_function_symbol", "TRANSLATE-FUNCTION-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "vaccess_level", "VACCESS-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "faccess_level", "FACCESS-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "private_global_p", "PRIVATE-GLOBAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "private_method_p", "PRIVATE-METHOD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_body", "TRANSLATE-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_arglist", "TRANSLATE-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_empty_progn", "TRANSLATE-EMPTY-PROGN", 0, 1, false );
    SubLFiles.declareFunction( me, "binding_type_p", "BINDING-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "dynamic_global_p", "DYNAMIC-GLOBAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lexical_global_p", "LEXICAL-GLOBAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_global_p", "CONSTANT-GLOBAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "global_binding_type", "GLOBAL-BINDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "optimize_funcall_p", "OPTIMIZE-FUNCALL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_consider_expansion_factor", "TRANSLATOR-CONSIDER-EXPANSION-FACTOR", 3, 0, false );
    SubLFiles.declareFunction( me, "translate_form_expansion_factor", "TRANSLATE-FORM-EXPANSION-FACTOR", 3, 0, false );
    SubLFiles.declareFunction( me, "translate_form_expansion_factor_int", "TRANSLATE-FORM-EXPANSION-FACTOR-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "show_translation_expansion_factor_stats", "SHOW-TRANSLATION-EXPANSION-FACTOR-STATS", 0, 2, false );
    SubLFiles.declareFunction( me, "operator_translator", "OPERATOR-TRANSLATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cand", "TRANSLATE-CAND", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_ccatch", "TRANSLATE-CCATCH", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_binding_construct_body", "TRANSLATE-BINDING-CONSTRUCT-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_binding_construct_form", "TRANSLATE-BINDING-CONSTRUCT-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cdec", "TRANSLATE-CDEC", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cdo", "TRANSLATE-CDO", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_Xcdo_symbols", "TRANSLATE-%CDO-SYMBOLS", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cdo_symbols", "TRANSLATE-CDO-SYMBOLS", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_Xcdohash", "TRANSLATE-%CDOHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cdohash", "TRANSLATE-CDOHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cdolist", "TRANSLATE-CDOLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cdotimes", "TRANSLATE-CDOTIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_check_type", "TRANSLATE-CHECK-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cinc", "TRANSLATE-CINC", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_clet", "TRANSLATE-CLET", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_clet_int", "TRANSLATE-CLET-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "translate_final_clet_body", "TRANSLATE-FINAL-CLET-BODY", 2, 0, false );
    SubLFiles.declareFunction( me, "translate_cmultiple_value_bind", "TRANSLATE-CMULTIPLE-VALUE-BIND", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cmultiple_value_bind_bindings", "TRANSLATE-CMULTIPLE-VALUE-BIND-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "translate_cnot", "TRANSLATE-CNOT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cor", "TRANSLATE-COR", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cpop", "TRANSLATE-CPOP", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cprogv", "TRANSLATE-CPROGV", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cpush", "TRANSLATE-CPUSH", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cpushnew", "TRANSLATE-CPUSHNEW", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_csetf", "TRANSLATE-CSETF", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_setter_from_accessor", "TRANSLATOR-SETTER-FROM-ACCESSOR", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_csetq", "TRANSLATE-CSETQ", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_csetq_int", "TRANSLATE-CSETQ-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_possibly_note_global_modification", "TRANSLATE-POSSIBLY-NOTE-GLOBAL-MODIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_csome", "TRANSLATE-CSOME", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_ctime", "TRANSLATE-CTIME", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cunwind_protect", "TRANSLATE-CUNWIND-PROTECT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_cvs_id", "TRANSLATE-CVS-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_declaim", "TRANSLATE-DECLAIM", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_declare", "TRANSLATE-DECLARE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defconstant", "TRANSLATE-DEFCONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_define", "TRANSLATE-DEFINE", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_current_method", "TRANSLATOR-CURRENT-METHOD", 0, 0, false );
    SubLFiles.declareFunction( me, "translate_method_body", "TRANSLATE-METHOD-BODY", 2, 0, false );
    SubLFiles.declareFunction( me, "translate_method_possibly_add_final_ret", "TRANSLATE-METHOD-POSSIBLY-ADD-FINAL-RET", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_method_possibly_add_entry", "TRANSLATE-METHOD-POSSIBLY-ADD-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "translate_method_possibly_add_with_current_thread", "TRANSLATE-METHOD-POSSIBLY-ADD-WITH-CURRENT-THREAD", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_body_accesses_current_thread_p", "TRANSLATOR-BODY-ACCESSES-CURRENT-THREAD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_current_thread_access_construct_p", "TRANSLATOR-CURRENT-THREAD-ACCESS-CONSTRUCT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_deflexical", "TRANSLATE-DEFLEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defmacro", "TRANSLATE-DEFMACRO", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defparameter", "TRANSLATE-DEFPARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defstruct", "TRANSLATE-DEFSTRUCT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defstruct_ensure_translated_constants", "TRANSLATE-DEFSTRUCT-ENSURE-TRANSLATED-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defvar", "TRANSLATE-DEFVAR", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_Xdtb", "TRANSLATE-%DTB", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_enforce_type", "TRANSLATE-ENFORCE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_enforce_must", "TRANSLATE-ENFORCE-MUST", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_fif", "TRANSLATE-FIF", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_function", "TRANSLATE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_funless", "TRANSLATE-FUNLESS", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_fwhen", "TRANSLATE-FWHEN", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_ignore", "TRANSLATE-IGNORE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_multiple_value_list", "TRANSLATE-MULTIPLE-VALUE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_must", "TRANSLATE-MUST", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_nth_value", "TRANSLATE-NTH-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_pcase", "TRANSLATE-PCASE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_pcase_clause", "TRANSLATE-PCASE-CLAUSE", 2, 0, false );
    SubLFiles.declareFunction( me, "translate_pcond", "TRANSLATE-PCOND", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_pif", "TRANSLATE-PIF", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_proclaim", "TRANSLATE-PROCLAIM", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_progn", "TRANSLATE-PROGN", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_punless", "TRANSLATE-PUNLESS", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_pwhen", "TRANSLATE-PWHEN", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_quote", "TRANSLATE-QUOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_ret", "TRANSLATE-RET", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_with_error_handler", "TRANSLATE-WITH-ERROR-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_with_process_resource_tracking", "TRANSLATE-WITH-PROCESS-RESOURCE-TRACKING", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_with_static_area", "TRANSLATE-WITH-STATIC-AREA", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_with_thread_private_area", "TRANSLATE-WITH-THREAD-PRIVATE-AREA", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_with_working_area", "TRANSLATE-WITH-WORKING-AREA", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_clet_bind", "TRANSLATE-CLET-BIND", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_clet_local", "TRANSLATE-CLET-LOCAL", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_code_comment", "TRANSLATE-CODE-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defstruct_construct", "TRANSLATE-DEFSTRUCT-CONSTRUCT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defstruct_get_slot", "TRANSLATE-DEFSTRUCT-GET-SLOT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defstruct_object_p", "TRANSLATE-DEFSTRUCT-OBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_defstruct_set_slot", "TRANSLATE-DEFSTRUCT-SET-SLOT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_Xfor", "TRANSLATE-%FOR", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_for", "TRANSLATE-FOR", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_for_bindings", "TRANSLATE-FOR-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_in_package", "TRANSLATE-IN-PACKAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_Xmval", "TRANSLATE-%MVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_Xreset_mval", "TRANSLATE-%RESET-MVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_until", "TRANSLATE-UNTIL", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_while", "TRANSLATE-WHILE", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_implementation_symbol_p", "TRANSLATOR-IMPLEMENTATION-SYMBOL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_implementation_symbol", "TRANSLATE-IMPLEMENTATION-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_translate_implementation_symbols", "POSSIBLY-TRANSLATE-IMPLEMENTATION-SYMBOLS", 1, 0, false );
    SubLFiles.declareMacro( me, "clet_bind", "CLET-BIND" );
    SubLFiles.declareMacro( me, "clet_local", "CLET-LOCAL" );
    SubLFiles.declareMacro( me, "csetq_dynamic", "CSETQ-DYNAMIC" );
    SubLFiles.declareMacro( me, "csetq_lexical", "CSETQ-LEXICAL" );
    SubLFiles.declareMacro( me, "csetq_local", "CSETQ-LOCAL" );
    SubLFiles.declareMacro( me, "sublisp_for", "FOR" );
    SubLFiles.declareMacro( me, "Xfor", "%FOR" );
    SubLFiles.declareMacro( me, "Xcdohash", "%CDOHASH" );
    SubLFiles.declareMacro( me, "Xccatch", "%CCATCH" );
    SubLFiles.declareMacro( me, "Xcunwind_protect", "%CUNWIND-PROTECT" );
    SubLFiles.declareMacro( me, "Xcprogv", "%CPROGV" );
    SubLFiles.declareMacro( me, "Xcdo_symbols", "%CDO-SYMBOLS" );
    SubLFiles.declareMacro( me, "Xwith_error_handler", "%WITH-ERROR-HANDLER" );
    SubLFiles.declareMacro( me, "Xwith_process_resource_tracking", "%WITH-PROCESS-RESOURCE-TRACKING" );
    SubLFiles.declareMacro( me, "Xwith_current_thread", "%WITH-CURRENT-THREAD" );
    return NIL;
  }

  public static SubLObject init_form_translation_file()
  {
    $translator_within_binding_constructP$ = SubLFiles.defparameter( "*TRANSLATOR-WITHIN-BINDING-CONSTRUCT?*", NIL );
    $consider_translator_expansion_factor$ = SubLFiles.defvar( "*CONSIDER-TRANSLATOR-EXPANSION-FACTOR*", NIL );
    $operator_translators$ = SubLFiles.deflexical( "*OPERATOR-TRANSLATORS*", $list32 );
    $translator_current_method$ = SubLFiles.defparameter( "*TRANSLATOR-CURRENT-METHOD*", NIL );
    $translator_implementation_symbols$ = SubLFiles.deflexical( "*TRANSLATOR-IMPLEMENTATION-SYMBOLS*", NIL );
    return NIL;
  }

  public static SubLObject setup_form_translation_file()
  {
    utilities_macros.note_funcall_helper_function( $sym172$TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_form_translation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_form_translation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_form_translation_file();
  }
  static
  {
    me = new form_translation();
    $translator_within_binding_constructP$ = null;
    $consider_translator_expansion_factor$ = null;
    $operator_translators$ = null;
    $translator_current_method$ = null;
    $translator_implementation_symbols$ = null;
    $kw0$SL2C = makeKeyword( "SL2C" );
    $str1$unexpected_form____S = makeString( "unexpected form : ~S" );
    $kw2$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $kw3$LOCAL = makeKeyword( "LOCAL" );
    $kw4$DYNAMIC = makeKeyword( "DYNAMIC" );
    $sym5$_DYN = makeSymbol( "%DYN" );
    $kw6$LEXICAL = makeKeyword( "LEXICAL" );
    $sym7$_LEX = makeSymbol( "%LEX" );
    $kw8$CONSTANT = makeKeyword( "CONSTANT" );
    $str9$Unexpected_binding_type__S_for_va = makeString( "Unexpected binding type ~S for variable ~S" );
    $str10$time_to_implement__S = makeString( "time to implement ~S" );
    $list11 = ConsesLow.list( makeSymbol( "MACRO" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $list12 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym13$VACCESS = makeSymbol( "VACCESS" );
    $sym14$PROTECTED = makeSymbol( "PROTECTED" );
    $sym15$FACCESS = makeSymbol( "FACCESS" );
    $sym16$PRIVATE = makeSymbol( "PRIVATE" );
    $list17 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "PROVIDED?" ) );
    $list18 = ConsesLow.list( makeSymbol( "PROGN" ) );
    $list19 = ConsesLow.list( makeKeyword( "DYNAMIC" ), makeKeyword( "LEXICAL" ), makeKeyword( "CONSTANT" ) );
    $kw20$BINDING_TYPE = makeKeyword( "BINDING-TYPE" );
    $sym21$OPTIMIZE_FUNCALL = makeSymbol( "OPTIMIZE-FUNCALL" );
    $int22$50 = makeInteger( 50 );
    $str23$Method__S_undergoes_a__Sx_expansi = makeString( "Method ~S undergoes a ~Sx expansion when translated" );
    $sym24$_ = makeSymbol( ">" );
    $sym25$SECOND = makeSymbol( "SECOND" );
    $str26$__Total_forms______________S = makeString( "~%Total forms :           ~S" );
    $str27$__Mean_form_size___________S = makeString( "~%Mean form size :        ~S" );
    $str28$__Mean_expansion_factor____Sx = makeString( "~%Mean expansion factor : ~Sx" );
    $str29$__Largest_expansions__ = makeString( "~%Largest expansions :" );
    $list30 = ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "EXPANSION-FACTOR" ) );
    $str31$___4___Dx___S = makeString( "~%~4,' Dx  ~S" );
    $list32 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeSymbol( "CAND" ), makeSymbol( "TRANSLATE-CAND" ) ), ConsesLow.cons( makeSymbol( "CCATCH" ), makeSymbol( "TRANSLATE-CCATCH" ) ), ConsesLow.cons(
        makeSymbol( "CDEC" ), makeSymbol( "TRANSLATE-CDEC" ) ), ConsesLow.cons( makeSymbol( "CDO" ), makeSymbol( "TRANSLATE-CDO" ) ), ConsesLow.cons( makeSymbol( "CDO-ALL-SYMBOLS" ), makeSymbol(
            "TRANSLATE-CDO-ALL-SYMBOLS" ) ), ConsesLow.cons( makeSymbol( "CDO-EXTERNAL-SYMBOLS" ), makeSymbol( "TRANSLATE-CDO-EXTERNAL-SYMBOLS" ) ), ConsesLow.cons( makeSymbol( "%CDO-SYMBOLS" ), makeSymbol(
                "TRANSLATE-%CDO-SYMBOLS" ) ), ConsesLow.cons( makeSymbol( "CDO-SYMBOLS" ), makeSymbol( "TRANSLATE-CDO-SYMBOLS" ) ), ConsesLow.cons( makeSymbol( "%CDOHASH" ), makeSymbol( "TRANSLATE-%CDOHASH" ) ),
      ConsesLow.cons( makeSymbol( "CDOHASH" ), makeSymbol( "TRANSLATE-CDOHASH" ) ), ConsesLow.cons( makeSymbol( "CDOLIST" ), makeSymbol( "TRANSLATE-CDOLIST" ) ), ConsesLow.cons( makeSymbol( "CDOTIMES" ), makeSymbol(
          "TRANSLATE-CDOTIMES" ) ), ConsesLow.cons( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TRANSLATE-CHECK-TYPE" ) ), ConsesLow.cons( makeSymbol( "CINC" ), makeSymbol( "TRANSLATE-CINC" ) ), ConsesLow.cons( makeSymbol(
              "CLET" ), makeSymbol( "TRANSLATE-CLET" ) ), ConsesLow.cons( makeSymbol( "CMULTIPLE-VALUE-BIND" ), makeSymbol( "TRANSLATE-CMULTIPLE-VALUE-BIND" ) ), ConsesLow.cons( makeSymbol( "CNOT" ), makeSymbol(
                  "TRANSLATE-CNOT" ) ), ConsesLow.cons( makeSymbol( "COR" ), makeSymbol( "TRANSLATE-COR" ) ), ConsesLow.cons( makeSymbol( "CPOP" ), makeSymbol( "TRANSLATE-CPOP" ) ), ConsesLow.cons( makeSymbol(
                      "CPROGV" ), makeSymbol( "TRANSLATE-CPROGV" ) ), ConsesLow.cons( makeSymbol( "CPUSH" ), makeSymbol( "TRANSLATE-CPUSH" ) ), ConsesLow.cons( makeSymbol( "CPUSHNEW" ), makeSymbol(
                          "TRANSLATE-CPUSHNEW" ) ), ConsesLow.cons( makeSymbol( "CSETF" ), makeSymbol( "TRANSLATE-CSETF" ) ), ConsesLow.cons( makeSymbol( "CSETQ" ), makeSymbol( "TRANSLATE-CSETQ" ) ), ConsesLow.cons(
                              makeSymbol( "CSOME" ), makeSymbol( "TRANSLATE-CSOME" ) ), ConsesLow.cons( makeSymbol( "CTIME" ), makeSymbol( "TRANSLATE-CTIME" ) ), ConsesLow.cons( makeSymbol( "CUNWIND-PROTECT" ),
                                  makeSymbol( "TRANSLATE-CUNWIND-PROTECT" ) ), ConsesLow.cons( makeSymbol( "CVS-ID" ), makeSymbol( "TRANSLATE-CVS-ID" ) ), ConsesLow.cons( makeSymbol( "DECLAIM" ), makeSymbol(
                                      "TRANSLATE-DECLAIM" ) ), ConsesLow.cons( makeSymbol( "DECLARE" ), makeSymbol( "TRANSLATE-DECLARE" ) ), ConsesLow.cons( makeSymbol( "DEFCONSTANT" ), makeSymbol(
                                          "TRANSLATE-DEFCONSTANT" ) ), ConsesLow.cons( makeSymbol( "DEFINE" ), makeSymbol( "TRANSLATE-DEFINE" ) ), ConsesLow.cons( makeSymbol( "DEFLEXICAL" ), makeSymbol(
                                              "TRANSLATE-DEFLEXICAL" ) ), ConsesLow.cons( makeSymbol( "DEFMACRO" ), makeSymbol( "TRANSLATE-DEFMACRO" ) ), ConsesLow.cons( makeSymbol( "DEFPARAMETER" ), makeSymbol(
                                                  "TRANSLATE-DEFPARAMETER" ) ), ConsesLow.cons( makeSymbol( "DEFSTRUCT" ), makeSymbol( "TRANSLATE-DEFSTRUCT" ) ), ConsesLow.cons( makeSymbol( "DEFVAR" ), makeSymbol(
                                                      "TRANSLATE-DEFVAR" ) ), ConsesLow.cons( makeSymbol( "%DTB" ), makeSymbol( "TRANSLATE-%DTB" ) ), ConsesLow.cons( makeSymbol( "ENFORCE-TYPE" ), makeSymbol(
                                                          "TRANSLATE-ENFORCE-TYPE" ) ), ConsesLow.cons( makeSymbol( "ENFORCE-MUST" ), makeSymbol( "TRANSLATE-ENFORCE-MUST" ) ), ConsesLow.cons( makeSymbol( "FIF" ),
                                                              makeSymbol( "TRANSLATE-FIF" ) ), ConsesLow.cons( makeSymbol( "FUNCTION" ), makeSymbol( "TRANSLATE-FUNCTION" ) ), ConsesLow.cons( makeSymbol( "FUNLESS" ),
                                                                  makeSymbol( "TRANSLATE-FUNLESS" ) ), ConsesLow.cons( makeSymbol( "FWHEN" ), makeSymbol( "TRANSLATE-FWHEN" ) ), ConsesLow.cons( makeSymbol( "IGNORE" ),
                                                                      makeSymbol( "TRANSLATE-IGNORE" ) ), ConsesLow.cons( makeSymbol( "MULTIPLE-VALUE-LIST" ), makeSymbol( "TRANSLATE-MULTIPLE-VALUE-LIST" ) ), ConsesLow
                                                                          .cons( makeSymbol( "MUST" ), makeSymbol( "TRANSLATE-MUST" ) ), ConsesLow.cons( makeSymbol( "NTH-VALUE" ), makeSymbol( "TRANSLATE-NTH-VALUE" ) ),
      ConsesLow.cons( makeSymbol( "PCASE" ), makeSymbol( "TRANSLATE-PCASE" ) ), ConsesLow.cons( makeSymbol( "PCOND" ), makeSymbol( "TRANSLATE-PCOND" ) ), ConsesLow.cons( makeSymbol( "PIF" ), makeSymbol(
          "TRANSLATE-PIF" ) ), ConsesLow.cons( makeSymbol( "PROCLAIM" ), makeSymbol( "TRANSLATE-PROCLAIM" ) ), ConsesLow.cons( makeSymbol( "PROGN" ), makeSymbol( "TRANSLATE-PROGN" ) ), ConsesLow.cons( makeSymbol(
              "PUNLESS" ), makeSymbol( "TRANSLATE-PUNLESS" ) ), ConsesLow.cons( makeSymbol( "PWHEN" ), makeSymbol( "TRANSLATE-PWHEN" ) ), ConsesLow.cons( makeSymbol( "QUOTE" ), makeSymbol( "TRANSLATE-QUOTE" ) ),
      ConsesLow.cons( makeSymbol( "RET" ), makeSymbol( "TRANSLATE-RET" ) ), ConsesLow.cons( makeSymbol( "WITH-ERROR-HANDLER" ), makeSymbol( "TRANSLATE-WITH-ERROR-HANDLER" ) ), ConsesLow.cons( makeSymbol(
          "WITH-PROCESS-RESOURCE-TRACKING" ), makeSymbol( "TRANSLATE-WITH-PROCESS-RESOURCE-TRACKING" ) ), ConsesLow.cons( makeSymbol( "WITH-STATIC-AREA" ), makeSymbol( "TRANSLATE-WITH-STATIC-AREA" ) ), ConsesLow.cons(
              makeSymbol( "WITH-THREAD-PRIVATE-AREA" ), makeSymbol( "TRANSLATE-WITH-THREAD-PRIVATE-AREA" ) ), ConsesLow.cons( makeSymbol( "WITH-WORKING-AREA" ), makeSymbol( "TRANSLATE-WITH-WORKING-AREA" ) ), ConsesLow
                  .cons( makeSymbol( "VOLATILE" ), makeSymbol( "TRANSLATE-VOLATILE" ) ), ConsesLow.cons( makeSymbol( "CLET-BIND" ), makeSymbol( "TRANSLATE-CLET-BIND" ) ), ConsesLow.cons( makeSymbol( "CLET-LOCAL" ),
                      makeSymbol( "TRANSLATE-CLET-LOCAL" ) ), ConsesLow.cons( makeSymbol( "CODE-COMMENT" ), makeSymbol( "TRANSLATE-CODE-COMMENT" ) ), ConsesLow.cons( makeSymbol( "CSETQ-DYNAMIC" ), makeSymbol(
                          "TRANSLATE-CSETQ-DYNAMIC" ) ), ConsesLow.cons( makeSymbol( "CSETQ-LEXICAL" ), makeSymbol( "TRANSLATE-CSETQ-LEXICAL" ) ), ConsesLow.cons( makeSymbol( "CSETQ-LOCAL" ), makeSymbol(
                              "TRANSLATE-CSETQ-LOCAL" ) ), ConsesLow.cons( makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" ), makeSymbol( "TRANSLATE-DEFSTRUCT-CONSTRUCT" ) ), ConsesLow.cons( makeSymbol(
                                  "_DEFSTRUCT-GET-SLOT", "SUBLISP" ), makeSymbol( "TRANSLATE-DEFSTRUCT-GET-SLOT" ) ), ConsesLow.cons( makeSymbol( "_DEFSTRUCT-OBJECT-P", "SUBLISP" ), makeSymbol(
                                      "TRANSLATE-DEFSTRUCT-OBJECT-P" ) ), ConsesLow.cons( makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" ), makeSymbol( "TRANSLATE-DEFSTRUCT-SET-SLOT" ) ), ConsesLow.cons( makeSymbol(
                                          "%FOR" ), makeSymbol( "TRANSLATE-%FOR" ) ), ConsesLow.cons( makeSymbol( "FOR" ), makeSymbol( "TRANSLATE-FOR" ) ), ConsesLow.cons( makeSymbol( "IN-PACKAGE" ), makeSymbol(
                                              "TRANSLATE-IN-PACKAGE" ) ), ConsesLow.cons( makeSymbol( "%MVAL" ), makeSymbol( "TRANSLATE-%MVAL" ) ), ConsesLow.cons( makeSymbol( "%RESET-MVAL" ), makeSymbol(
                                                  "TRANSLATE-%RESET-MVAL" ) ), ConsesLow.cons( makeSymbol( "UNTIL" ), makeSymbol( "TRANSLATE-UNTIL" ) ), ConsesLow.cons( makeSymbol( "WHILE" ), makeSymbol(
                                                      "TRANSLATE-WHILE" ) )
    } );
    $list33 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "EXPRESSIONS" ) );
    $sym34$CAND = makeSymbol( "CAND" );
    $sym35$_DTB = makeSymbol( "%DTB" );
    $sym36$_BTD = makeSymbol( "%BTD" );
    $sym37$_AND = makeSymbol( "%AND" );
    $list38 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "TAG" ), makeSymbol( "ANS-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym39$CCATCH = makeSymbol( "CCATCH" );
    $sym40$CCATCH_ENV_VAR = makeUninternedSymbol( "CCATCH-ENV-VAR" );
    $sym41$_CCATCH = makeSymbol( "%CCATCH" );
    $list42 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "PLACE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DELTA" ), ONE_INTEGER ) );
    $sym43$CDEC = makeSymbol( "CDEC" );
    $sym44$CSETF = makeSymbol( "CSETF" );
    $sym45$_ = makeSymbol( "-" );
    $list46 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VARS" ), makeSymbol( "ENDTEST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym47$CDO = makeSymbol( "CDO" );
    $list48 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), ConsesLow.list( makeSymbol( "UPDATE" ), NIL, makeSymbol( "UPDATE?" ) ) );
    $sym49$CSETQ = makeSymbol( "CSETQ" );
    $list50 = ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "&REST" ), makeSymbol( "RESULT" ) );
    $sym51$CNOT = makeSymbol( "CNOT" );
    $sym52$CLET = makeSymbol( "CLET" );
    $sym53$_FOR = makeSymbol( "%FOR" );
    $list54 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "SYM" ), makeSymbol( "PACKAGE" ), makeSymbol( "ITERATOR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym55$_CDO_SYMBOLS = makeSymbol( "%CDO-SYMBOLS" );
    $list56 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "SYM" ), makeSymbol( "PACKAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym57$CDO_SYMBOLS = makeSymbol( "CDO-SYMBOLS" );
    $sym58$CDO_SYMBOLS_PACKAGE = makeUninternedSymbol( "CDO-SYMBOLS-PACKAGE" );
    $sym59$CDO_SYMBOLS_ITERATOR = makeUninternedSymbol( "CDO-SYMBOLS-ITERATOR" );
    $list60 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VAL" ), makeSymbol( "TABLE" ), makeSymbol( "ITERATOR" ), makeSymbol( "ENTRY" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym61$_CDOHASH = makeSymbol( "%CDOHASH" );
    $list62 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VAL" ), makeSymbol( "TABLE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym63$CDOHASH = makeSymbol( "CDOHASH" );
    $sym64$CDOHASH_TABLE = makeUninternedSymbol( "CDOHASH-TABLE" );
    $sym65$CDOHASH_ITERATOR = makeUninternedSymbol( "CDOHASH-ITERATOR" );
    $sym66$CDOHASH_ENTRY = makeUninternedSymbol( "CDOHASH-ENTRY" );
    $list67 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LISTFORM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym68$CDOLIST = makeSymbol( "CDOLIST" );
    $sym69$CDOLIST_LIST_VAR = makeUninternedSymbol( "CDOLIST-LIST-VAR" );
    $sym70$CLET_LOCAL = makeSymbol( "CLET-LOCAL" );
    $sym71$FOR = makeSymbol( "FOR" );
    $sym72$FIRST = makeSymbol( "FIRST" );
    $sym73$NULL = makeSymbol( "NULL" );
    $sym74$REST = makeSymbol( "REST" );
    $list75 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "INTEGER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym76$CDOTIMES = makeSymbol( "CDOTIMES" );
    $sym77$CDOTIMES_END_VAR = makeUninternedSymbol( "CDOTIMES-END-VAR" );
    $list78 = ConsesLow.list( ZERO_INTEGER );
    $sym79$_ = makeSymbol( "<" );
    $sym80$CINC = makeSymbol( "CINC" );
    $list81 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "OBJECT" ), makeSymbol( "PRED" ) );
    $sym82$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $sym83$QUOTE = makeSymbol( "QUOTE" );
    $sym84$_DP_CHECK_TYPE = makeSymbol( "%DP-CHECK-TYPE" );
    $sym85$_ = makeSymbol( "+" );
    $list86 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list87 = ConsesLow.list( makeSymbol( "FIRST-BINDING" ), makeSymbol( "&REST" ), makeSymbol( "REST-BINDINGS" ) );
    $kw88$UNSET = makeKeyword( "UNSET" );
    $list89 = ConsesLow.list( makeSymbol( "BINDING-VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "BINDING-INITIALIZATION" ) );
    $sym90$CLET_BIND = makeSymbol( "CLET-BIND" );
    $str91$CLET_of_lexical_variable__S_being = makeString( "CLET of lexical variable ~S being converted to CUNWIND-PROTECT CSETQ idiom" );
    $str92$CLET_of_constant__S_is_not_allowe = makeString( "CLET of constant ~S is not allowed" );
    $str93$Unexpected_variable__S = makeString( "Unexpected variable ~S" );
    $sym94$PROGN = makeSymbol( "PROGN" );
    $list95 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VARS" ), makeSymbol( "VALUE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym96$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $list97 = ConsesLow.list( makeSymbol( "%RESET-MVAL" ) );
    $list98 = ConsesLow.list( makeSymbol( "FIRST-VAR" ), makeSymbol( "&REST" ), makeSymbol( "REST-VARS" ) );
    $sym99$_MVAL = makeSymbol( "%MVAL" );
    $list100 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "EXPRESSION" ) );
    $sym101$_NOT = makeSymbol( "%NOT" );
    $sym102$COR = makeSymbol( "COR" );
    $sym103$_OR = makeSymbol( "%OR" );
    $list104 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "PLACE" ) );
    $sym105$CPOP = makeSymbol( "CPOP" );
    $sym106$CDR = makeSymbol( "CDR" );
    $list107 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "SPECIAL-VARS" ), makeSymbol( "BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym108$CPROGV = makeSymbol( "CPROGV" );
    $sym109$CPROGV_VAR = makeUninternedSymbol( "CPROGV-VAR" );
    $sym110$_CPROGV = makeSymbol( "%CPROGV" );
    $list111 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "ITEM" ), makeSymbol( "PLACE" ) );
    $sym112$CPUSH = makeSymbol( "CPUSH" );
    $sym113$CONS = makeSymbol( "CONS" );
    $list114 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "ITEM" ), makeSymbol( "PLACE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
        .list( makeSymbol( "FUNCTION" ), EQL ) ) ), ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ) );
    $list115 = ConsesLow.list( makeSymbol( "FUNCTION" ), EQL );
    $list116 = ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY );
    $sym117$CPUSHNEW = makeSymbol( "CPUSHNEW" );
    $sym118$ITEM_VAR = makeUninternedSymbol( "ITEM-VAR" );
    $sym119$PUNLESS = makeSymbol( "PUNLESS" );
    $sym120$MEMBER = makeSymbol( "MEMBER" );
    $list121 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "PLACE" ), makeSymbol( "VALUE" ) );
    $sym122$CAR = makeSymbol( "CAR" );
    $sym123$RPLACA = makeSymbol( "RPLACA" );
    $sym124$RPLACD = makeSymbol( "RPLACD" );
    $sym125$NTH = makeSymbol( "NTH" );
    $sym126$SET_NTH = makeSymbol( "SET-NTH" );
    $sym127$GETHASH = makeSymbol( "GETHASH" );
    $sym128$SETHASH = makeSymbol( "SETHASH" );
    $sym129$GETHASH_WITHOUT_VALUES = makeSymbol( "GETHASH-WITHOUT-VALUES" );
    $sym130$CHAR = makeSymbol( "CHAR" );
    $sym131$SET_CHAR = makeSymbol( "SET-CHAR" );
    $sym132$AREF = makeSymbol( "AREF" );
    $sym133$SET_AREF = makeSymbol( "SET-AREF" );
    $sym134$GET = makeSymbol( "GET" );
    $sym135$PUT = makeSymbol( "PUT" );
    $sym136$SYMBOL_VALUE = makeSymbol( "SYMBOL-VALUE" );
    $sym137$SET = makeSymbol( "SET" );
    $list138 = ConsesLow.list( makeSymbol( "ACCESSOR" ), makeSymbol( "EXPRESSION" ) );
    $sym139$SETTER_FROM_ACCESSOR = makeSymbol( "SETTER-FROM-ACCESSOR", "SUBLISP" );
    $list140 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VAR" ), makeSymbol( "VALUE" ), makeSymbol( "&REST" ), makeSymbol( "VAR-VAL-PAIRS" ) );
    $list141 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VALUE" ), makeSymbol( "&REST" ), makeSymbol( "MORE-VAR-VAL-PAIRS" ) );
    $list142 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LISTFORM" ), makeSymbol( "ENDVAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym143$CSOME = makeSymbol( "CSOME" );
    $sym144$CSOME_LIST_VAR = makeUninternedSymbol( "CSOME-LIST-VAR" );
    $list145 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym146$CTIME = makeSymbol( "CTIME" );
    $sym147$TIME_VAR = makeUninternedSymbol( "TIME-VAR" );
    $list148 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-INTERNAL-REAL-TIME" ) ) );
    $sym149$_ = makeSymbol( "/" );
    $list150 = ConsesLow.list( makeSymbol( "GET-INTERNAL-REAL-TIME" ) );
    $list151 = ConsesLow.list( makeSymbol( "*INTERNAL-TIME-UNITS-PER-SECOND*" ) );
    $list152 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "PROTECTED-FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym153$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym154$CUNWIND_PROTECT_ENV_VAR = makeUninternedSymbol( "CUNWIND-PROTECT-ENV-VAR" );
    $sym155$_CUNWIND_PROTECT = makeSymbol( "%CUNWIND-PROTECT" );
    $list156 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "DECLARATION-SPECIFIERS" ) );
    $sym157$DECLAIM = makeSymbol( "DECLAIM" );
    $sym158$PROCLAIM = makeSymbol( "PROCLAIM" );
    $list159 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "DECLARATIONS" ) );
    $sym160$DECLARE = makeSymbol( "DECLARE" );
    $list161 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VARIABLE" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DOCUMENTATION" ) );
    $sym162$DEFCONSTANT = makeSymbol( "DEFCONSTANT" );
    $sym163$SYMBOLP = makeSymbol( "SYMBOLP" );
    $list164 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym165$DEFINE = makeSymbol( "DEFINE" );
    $list166 = ConsesLow.list( makeSymbol( "DOCUMENTATION" ), makeSymbol( "&BODY" ), makeSymbol( "REAL-BODY" ) );
    $list167 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym168$RET = makeSymbol( "RET" );
    $sym169$POSSIBLY_NOTE_FUNCTION_ENTRY = makeSymbol( "POSSIBLY-NOTE-FUNCTION-ENTRY", "SUBLISP" );
    $sym170$THREAD = makeUninternedSymbol( "THREAD" );
    $sym171$_WITH_CURRENT_THREAD = makeSymbol( "%WITH-CURRENT-THREAD" );
    $sym172$TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P = makeSymbol( "TRANSLATOR-CURRENT-THREAD-ACCESS-CONSTRUCT-P" );
    $list173 = ConsesLow.list( makeSymbol( "%RESET-MVAL" ), makeSymbol( "%MVAL" ), makeSymbol( "CLET-BIND" ), makeSymbol( "%DYN" ), makeSymbol( "%CCATCH" ) );
    $sym174$DEFLEXICAL = makeSymbol( "DEFLEXICAL" );
    $list175 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "NAME" ), makeSymbol( "PATTERN" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym176$DEFMACRO = makeSymbol( "DEFMACRO" );
    $list177 = ConsesLow.list( makeSymbol( "MACROFORM" ), makeSymbol( "ENVIRONMENT" ) );
    $sym178$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $list179 = ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "MACROFORM" ) );
    $sym180$DEFINE_MACROEXPANDER = makeSymbol( "DEFINE-MACROEXPANDER" );
    $sym181$DEFPARAMETER = makeSymbol( "DEFPARAMETER" );
    $list182 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "OPTIONS" ) ), makeSymbol( "&BODY" ), makeSymbol( "SLOTS" ) );
    $sym183$DEFSTRUCT = makeSymbol( "DEFSTRUCT" );
    $sym184$_DEFSTRUCT_CLASS = makeSymbol( "%DEFSTRUCT-CLASS" );
    $list185 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&BODY" ), makeSymbol( "TRANSLATED-BODY" ) );
    $kw186$NAME = makeKeyword( "NAME" );
    $kw187$C_STRUCTURE_TAG = makeKeyword( "C-STRUCTURE-TAG" );
    $kw188$PREDICATE = makeKeyword( "PREDICATE" );
    $kw189$SLOTS = makeKeyword( "SLOTS" );
    $kw190$SLOT_KEYWORDS = makeKeyword( "SLOT-KEYWORDS" );
    $kw191$GETTERS = makeKeyword( "GETTERS" );
    $kw192$SETTERS = makeKeyword( "SETTERS" );
    $kw193$PRINT_FUNCTION = makeKeyword( "PRINT-FUNCTION" );
    $sym194$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $list195 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ) );
    $sym196$DEFVAR = makeSymbol( "DEFVAR" );
    $list197 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ) );
    $sym198$ENFORCE_TYPE = makeSymbol( "ENFORCE-TYPE" );
    $sym199$_DP_ENFORCE_TYPE = makeSymbol( "%DP-ENFORCE-TYPE" );
    $list200 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "FORM" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGUMENTS" ) );
    $sym201$ENFORCE_MUST = makeSymbol( "ENFORCE-MUST" );
    $sym202$ERROR = makeSymbol( "ERROR" );
    $list203 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ), makeSymbol( "TRUE-VALUE" ), makeSymbol( "FALSE-VALUE" ) );
    $sym204$FIF = makeSymbol( "FIF" );
    $list205 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "SYMBOL" ) );
    $sym206$FUNCTION = makeSymbol( "FUNCTION" );
    $sym207$SYMBOL_FUNCTION = makeSymbol( "SYMBOL-FUNCTION" );
    $list208 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ), makeSymbol( "FALSE-VALUE" ) );
    $sym209$FUNLESS = makeSymbol( "FUNLESS" );
    $list210 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ), makeSymbol( "TRUE-VALUE" ) );
    $sym211$FWHEN = makeSymbol( "FWHEN" );
    $list212 = ConsesLow.list( NIL );
    $list213 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "SUBFORM" ) );
    $sym214$MULTIPLE_VALUE_LIST = makeSymbol( "MULTIPLE-VALUE-LIST" );
    $sym215$MUST = makeSymbol( "MUST" );
    $sym216$_IGNORE_MUSTS__ = makeSymbol( "*IGNORE-MUSTS?*" );
    $list217 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "N" ), makeSymbol( "SUBFORM" ) );
    $sym218$NTH_VALUE = makeSymbol( "NTH-VALUE" );
    $list219 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "TEST-OBJECT" ), makeSymbol( "&REST" ), makeSymbol( "CLAUSES" ) );
    $sym220$PCASE = makeSymbol( "PCASE" );
    $sym221$PCASE_VAR = makeUninternedSymbol( "PCASE-VAR" );
    $sym222$PCOND = makeSymbol( "PCOND" );
    $list223 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "&BODY" ), makeSymbol( "CLAUSE-BODY" ) );
    $sym224$OTHERWISE = makeSymbol( "OTHERWISE" );
    $str225$_AEncountered_a_PCASE_that_uses_T = makeString( "~AEncountered a PCASE that uses T rather than OTHERWISE" );
    $str226$Within_ = makeString( "Within " );
    $str227$___ = makeString( " : " );
    $str228$ = makeString( "" );
    $list229 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "CLAUSES" ) );
    $list230 = ConsesLow.list( makeSymbol( "CONDITION" ), makeSymbol( "&BODY" ), makeSymbol( "CLAUSE-BODY" ) );
    $list231 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ), makeSymbol( "ACTION" ), makeSymbol( "ELSE-ACTION" ) );
    $sym232$PIF = makeSymbol( "PIF" );
    $list233 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "DECLARATION-SPECIFIER" ) );
    $list234 = ConsesLow.list( makeSymbol( "DECLARATION-IDENTIFIER" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $list235 = ConsesLow.list( makeSymbol( "VISIBILITY" ), makeSymbol( "&REST" ), makeSymbol( "METHODS" ) );
    $list236 = ConsesLow.list( makeSymbol( "PRIVATE" ), makeSymbol( "PROTECTED" ), makeSymbol( "PUBLIC" ) );
    $list237 = ConsesLow.list( makeSymbol( "VISIBILITY" ), makeSymbol( "&REST" ), makeSymbol( "GLOBALS" ) );
    $sym238$INLINE = makeSymbol( "INLINE" );
    $sym239$NOTINLINE = makeSymbol( "NOTINLINE" );
    $sym240$_PROCLAIM = makeSymbol( "%PROCLAIM" );
    $list241 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list242 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "CONDITION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list243 = ConsesLow.list( ConsesLow.list( T ) );
    $sym244$PWHEN = makeSymbol( "PWHEN" );
    $list245 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "OBJECT" ) );
    $list246 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "%EXIT" ) );
    $list247 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "HANDLER" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym248$WITH_ERROR_HANDLER = makeSymbol( "WITH-ERROR-HANDLER" );
    $sym249$CATCH_VAR = makeUninternedSymbol( "CATCH-VAR" );
    $sym250$ERROR_VAR = makeUninternedSymbol( "ERROR-VAR" );
    $sym251$_WITH_ERROR_HANDLER = makeSymbol( "%WITH-ERROR-HANDLER" );
    $sym252$WITH_PROCESS_RESOURCE_TRACKING = makeSymbol( "WITH-PROCESS-RESOURCE-TRACKING" );
    $sym253$RESOURCE_TRACKING_ENV_VAR = makeUninternedSymbol( "RESOURCE-TRACKING-ENV-VAR" );
    $sym254$_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol( "%WITH-PROCESS-RESOURCE-TRACKING" );
    $sym255$WITH_STATIC_AREA = makeSymbol( "WITH-STATIC-AREA" );
    $list256 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CURRENT-AREA*" ), ConsesLow.list( makeSymbol( "GET-STATIC-AREA" ) ) ) );
    $sym257$WITH_THREAD_PRIVATE_AREA = makeSymbol( "WITH-THREAD-PRIVATE-AREA" );
    $list258 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CURRENT-AREA*" ), ConsesLow.list( makeSymbol( "GET-THREAD-PRIVATE-AREA" ) ) ) );
    $sym259$WITH_WORKING_AREA = makeSymbol( "WITH-WORKING-AREA" );
    $list260 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CURRENT-AREA*" ), ConsesLow.list( makeSymbol( "GET-WORKING-AREA" ) ) ) );
    $list261 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "DYNAMIC-BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list262 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "INITIALIZATION" ) );
    $list263 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "LOCAL-BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list264 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "C-STRUCTURE-TAG" ), makeSymbol( "SIZE" ), makeSymbol( "TYPE-VAR" ), makeSymbol( "TYPE" ) );
    $sym265$_DEFSTRUCT_CONSTRUCT = makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" );
    $sym266$INTEGERP = makeSymbol( "INTEGERP" );
    $list267 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "OBJECT" ), makeSymbol( "INDEX" ), makeSymbol( "TYPE" ), makeSymbol( "SLOT" ) );
    $sym268$_DEFSTRUCT_GET_SLOT = makeSymbol( "_DEFSTRUCT-GET-SLOT", "SUBLISP" );
    $list269 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "OBJECT" ), makeSymbol( "C-STRUCTURE-TAG" ), makeSymbol( "TYPE-VAR" ), makeSymbol( "TYPE" ) );
    $sym270$_DEFSTRUCT_OBJECT_P = makeSymbol( "_DEFSTRUCT-OBJECT-P", "SUBLISP" );
    $list271 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "OBJECT" ), makeSymbol( "INDEX" ), makeSymbol( "VALUE" ), makeSymbol( "TYPE" ), makeSymbol( "SLOT" ) );
    $sym272$_DEFSTRUCT_SET_SLOT = makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" );
    $list273 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "INITIALIZATIONS" ), makeSymbol( "TEST" ), makeSymbol( "UPDATES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list274 = ConsesLow.list( makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "TEST" ), makeSymbol( "UPDATES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list275 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ) );
    $list276 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "NAME" ) );
    $sym277$IN_PACKAGE = makeSymbol( "IN-PACKAGE" );
    $sym278$_PACKAGE_ = makeSymbol( "*PACKAGE*" );
    $sym279$FIND_PACKAGE = makeSymbol( "FIND-PACKAGE" );
    $list280 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "N" ) );
    $list281 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "TEST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym282$UNTIL = makeSymbol( "UNTIL" );
    $sym283$WHILE = makeSymbol( "WHILE" );
    $list284 = ConsesLow.cons( makeSymbol( "OPERATOR" ), makeSymbol( "ARGS" ) );
    $list285 = ConsesLow.list( makeSymbol( "DYNAMIC-BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list286 = ConsesLow.list( makeSymbol( "LOCAL-BINDINGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list287 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
    $list288 = ConsesLow.list( ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "TEST" ), makeSymbol( "UPDATES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list289 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZATIONS" ), makeSymbol( "TEST" ), makeSymbol( "UPDATES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list290 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VAL" ), makeSymbol( "TABLE" ), makeSymbol( "TABLE-VAR" ), makeSymbol( "ITERATOR-VAR" ), makeSymbol( "ENTRY-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list291 = ConsesLow.list( ConsesLow.list( makeSymbol( "TAG" ), makeSymbol( "ANS-VAR" ), makeSymbol( "ENV-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list292 = ConsesLow.list( makeSymbol( "ENV-VAR" ), makeSymbol( "PROTECTED-FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list293 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPECIAL-VARS" ), makeSymbol( "BINDINGS" ), makeSymbol( "INTERNAL-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list294 = ConsesLow.list( ConsesLow.list( makeSymbol( "SYM" ), makeSymbol( "PACKAGE" ), makeSymbol( "PACKAGE-VAR" ), makeSymbol( "ITERATOR-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list295 = ConsesLow.list( ConsesLow.list( makeSymbol( "HANDLER" ), makeSymbol( "CATCH-VAR" ), makeSymbol( "ERROR-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list296 = ConsesLow.list( makeSymbol( "RESOURCE-VAR" ), makeSymbol( "RESULT-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list297 = ConsesLow.list( makeSymbol( "THREAD-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list298 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-PROCESS" ) ) );
  }
}
/*
 * 
 * Total time: 897 ms synthetic
 */