package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_text
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ke_text";
  public static final String myFingerPrint = "525c8166049655251f365db83a6c6f90291a98b017a110d2130c34102c454f0f";
  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 997L)
  private static SubLSymbol $ke_text_error_count_abort_num$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 1218L)
  public static SubLSymbol $ke_text_failures_log_file$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 9061L)
  private static SubLSymbol $ket_string_to_directive$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 10491L)
  private static SubLSymbol $ket_string_to_direction$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 10803L)
  private static SubLSymbol $ket_string_to_strength$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PIF;
  private static final SubLSymbol $sym2$FILE_VALID_FOR_WRITING_P;
  private static final SubLSymbol $sym3$CLET;
  private static final SubLSymbol $sym4$_KE_TEXT_FAILURES_LOG_FILE_;
  private static final SubLSymbol $sym5$PROGN;
  private static final SubLSymbol $sym6$WARN;
  private static final SubLString $str7$Unable_to_log_failures_to__S_beca;
  private static final SubLSymbol $kw8$END_OF_DIRECTIVE;
  private static final SubLList $list9;
  private static final SubLString $str10$Too_many_close_parenthesis_on_lin;
  private static final SubLSymbol $kw11$END_OF_DATA;
  private static final SubLList $list12;
  private static final SubLString $str13$Missing_data_for_directive__A;
  private static final SubLString $str14$Unclosed_open_parenthesis_on_line;
  private static final SubLString $str15$Unfinished_expression_at_end_of_f;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$MONOTONIC;
  private static final SubLSymbol $kw20$DEFAULT;
  private static final SubLObject $const21$DefaultMonotonicPredicate;
  private static final SubLSymbol $kw22$FORWARD;
  private static final SubLSymbol $kw23$BACKWARD;
  private static final SubLSymbol $kw24$CODE;
  private static final SubLString $str25$Something_is_nil;
  private static final SubLString $str26$Bad_reference_to_a_killed_or_rena;
  private static final SubLString $str27$A_single_colon_is_an_invalid_keyw;
  private static final SubLString $str28$A_single_question_mark_is_an_inva;
  private static final SubLList $list29;
  private static final SubLString $str30$Malformed_string;
  private static final SubLString $str31$Gratutuious_single_quote;
  private static final SubLSymbol $kw32$DOT_FOR_DOTTED_LIST;
  private static final SubLString $str33$Bad_number___A_;
  private static final SubLString $str34$nil;
  private static final SubLString $str35$t;
  private static final SubLString $str36$Constant_not_found___A_;
  private static final SubLString $str37$Couldn_t_figure_out_string___A___;
  private static final SubLString $str38$Couldn_t_figure_out___A_;
  private static final SubLSymbol $kw39$ENTER;
  private static final SubLString $str40$TheAssertionSentence;
  private static final SubLString $str41$__TheAssertionSentence;
  private static final SubLString $str42$Formula____TheAssertionSentence_i;
  private static final SubLString $str43$Microtheory_not_specified;
  private static final SubLString $str44$Invalid_dotted_list;
  private static final SubLSymbol $kw45$DELETE;
  private static final SubLSymbol $kw46$UNASSERT;
  private static final SubLSymbol $kw47$ASSERT;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$FORMULA;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $kw52$CONSTANT;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLString $str56$Constant__Constant_already_exists;
  private static final SubLSymbol $kw57$CREATE;
  private static final SubLString $str58$Constant__Unrecognized_constant__;
  private static final SubLSymbol $kw59$KILL;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLSymbol $kw65$RENAME;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLString $str70$Rename__Can_t_rename_a_constant_r;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLString $str74$Rename__Can_t_rename_to_constant_;
  private static final SubLString $str75$Rename__Can_t_rename_to_existing_;
  private static final SubLSymbol $kw76$NEW_CONSTANT;
  private static final SubLString $str77$Rename__Unrecognized_constant___A;
  private static final SubLSymbol $kw78$MERGE;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$IN_MT;
  private static final SubLList $list87;
  private static final SubLString $str88$In_Mt__NAT_mt_must_be_a_hlmt_p___;
  private static final SubLString $str89$In_Mt__Unrecognized_mt___A_;
  private static final SubLSymbol $kw90$DEFAULT_MT;
  private static final SubLList $list91;
  private static final SubLString $str92$Default_Mt__NAT_mt_must_be_a_hlmt;
  private static final SubLString $str93$Default_Mt__Unrecognized_mt___A_;
  private static final SubLSymbol $kw94$STRENGTH;
  private static final SubLList $list95;
  private static final SubLString $str96$Strength__Unrecognized_strength__;
  private static final SubLSymbol $kw97$DIRECTION;
  private static final SubLList $list98;
  private static final SubLString $str99$Direction__Unrecognized_direction;
  private static final SubLSymbol $sym100$STRING_;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const104$EverythingPSC;
  private static final SubLString $str105$Constant_must_be_specified;
  private static final SubLString $str106$Unexpected_argument_to_unary_pred;
  private static final SubLString $str107$No_argument_found_for_binary_pred;
  private static final SubLString $str108$No_argument_found_for_arity__A_pr;
  private static final SubLString $str109$List_argument_expected_for_arity_;
  private static final SubLString $str110$Unexpected_argument_for_predicate;
  private static final SubLSymbol $kw111$AGENDA;
  private static final SubLSymbol $sym112$FI_CREATE;
  private static final SubLSymbol $sym113$FI_TIMESTAMP_CONSTANT;
  private static final SubLSymbol $sym114$QUOTE;
  private static final SubLSymbol $kw115$NOW;
  private static final SubLSymbol $sym116$RESOLVE_NEW_CONSTANTS;
  private static final SubLSymbol $sym117$FI_ASSERT;
  private static final SubLSymbol $sym118$FI_TIMESTAMP_ASSERTION;
  private static final SubLSymbol $sym119$FI_UNASSERT;
  private static final SubLSymbol $sym120$FI_RENAME;
  private static final SubLObject $const121$oldConstantName;
  private static final SubLObject $const122$BookkeepingMt;
  private static final SubLSymbol $sym123$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $kw124$GAF;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$FI_KILL;
  private static final SubLSymbol $sym127$FI_MERGE;
  private static final SubLString $str128$Constant_does_not_exist___A_;
  private static final SubLString $str129$_new_constant_must_be_followed_by;
  private static final SubLList $list130;
  private static final SubLList $list131;
  private static final SubLSymbol $kw132$INPUT;
  private static final SubLString $str133$Unable_to_open__S;
  private static final SubLSymbol $sym134$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw135$EOF;
  private static final SubLList $list136;
  private static final SubLString $str137$;
  private static final SubLString $str138$_A__;
  private static final SubLString $str139$_A__A__;
  private static final SubLString $str140$_A___;
  private static final SubLString $str141$__A__;
  private static final SubLString $str142$___;
  private static final SubLString $str143$_A;
  private static final SubLString $str144$el_;
  private static final SubLString $str145$____;
  private static final SubLSymbol $kw146$NORMAL;
  private static final SubLSymbol $sym147$STRINGP;
  private static final SubLString $str148$__Sorry___s_is_not_known_to_be_a_;
  private static final SubLString $str149$_A__;
  private static final SubLString $str150$merged;
  private static final SubLString $str151$renamed;
  private static final SubLString $str152$killed;
  private static final SubLString $str153$created;
  private static final SubLList $list154;
  private static final SubLList $list155;
  private static final SubLList $list156;
  private static final SubLSymbol $kw157$QUIET;
  private static final SubLString $str158$The_following_constants_will_be_;
  private static final SubLString $str159$_;
  private static final SubLString $str160$__;
  private static final SubLString $str161$__Create___A__;
  private static final SubLString $str162$__Kill___A__;
  private static final SubLString $str163$__Rename___A_to__A__;
  private static final SubLString $str164$Evaluating__A_forms_____;
  private static final SubLSymbol $kw165$APPEND;
  private static final SubLSymbol $sym166$LOAD_KE_TEXT_FILE;
  private static final SubLList $list167;
  private static final SubLString $str168$Call_the_ke_text_engine_on_a_file;
  private static final SubLList $list169;
  private static final SubLList $list170;
  private static final SubLSymbol $kw171$KE_OPERATIONS;
  private static final SubLSymbol $kw172$ERROR_LISTS;
  private static final SubLList $list173;

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 1401L)
  public static SubLObject with_ke_text_failures_to_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    filename = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$PIF, ConsesLow.list( $sym2$FILE_VALID_FOR_WRITING_P, filename ), ConsesLow.listS( $sym3$CLET, ConsesLow.list( ConsesLow.list( $sym4$_KE_TEXT_FAILURES_LOG_FILE_, filename ) ), ConsesLow
        .append( body, NIL ) ), ConsesLow.listS( $sym5$PROGN, ConsesLow.list( $sym6$WARN, $str7$Unable_to_log_failures_to__S_beca, filename ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 1832L)
  public static SubLObject ke_text_list_to_token_lists(final SubLObject ke_text_list, SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject token_lists = NIL;
    SubLObject error_lists = NIL;
    SubLObject line_number_start = ONE_INTEGER;
    SubLObject line_number_end = ZERO_INTEGER;
    SubLObject char_list = NIL;
    SubLObject the_directive = NIL;
    SubLObject the_data = NIL;
    SubLObject looking_for = $kw8$END_OF_DIRECTIVE;
    SubLObject ignore_whitespaceP = T;
    SubLObject next_char_quotedP = NIL;
    SubLObject inside_stringP = NIL;
    SubLObject inside_commentP = NIL;
    SubLObject paren_depth = ZERO_INTEGER;
    SubLObject last_paren_line = NIL;
    SubLObject had_bad_directiveP = NIL;
    SubLObject had_bad_dataP = NIL;
    SubLObject abortP = NIL;
    if( !filename.isString() )
    {
      filename = NIL;
    }
    if( NIL == abortP )
    {
      SubLObject csome_list_var = ke_text_list;
      SubLObject text_line = NIL;
      text_line = csome_list_var.first();
      while ( NIL == abortP && NIL != csome_list_var)
      {
        if( Sequences.length( error_lists ).numG( $ke_text_error_count_abort_num$.getDynamicValue( thread ) ) )
        {
          error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list9 ), error_lists );
          abortP = T;
        }
        final SubLObject text_line_length = Sequences.length( text_line );
        line_number_end = Numbers.add( line_number_end, ONE_INTEGER );
        if( text_line_length.numE( ZERO_INTEGER ) && line_number_start.numE( line_number_end ) )
        {
          line_number_start = Numbers.add( line_number_start, ONE_INTEGER );
        }
        if( NIL != char_list )
        {
          if( NIL != inside_stringP )
          {
            char_list = ConsesLow.cons( Characters.CHAR_newline, char_list );
          }
          else
          {
            char_list = ConsesLow.cons( Characters.CHAR_space, char_list );
          }
        }
        inside_commentP = NIL;
        ignore_whitespaceP = T;
        SubLObject char_number;
        SubLObject this_char;
        SubLObject directive_s_poss;
        SubLObject directive_s;
        SubLObject error_strings;
        SubLObject cdolist_list_var;
        SubLObject error_string;
        SubLObject data_s_poss;
        SubLObject data;
        for( char_number = NIL, char_number = ZERO_INTEGER; !char_number.numE( text_line_length ); char_number = Numbers.add( char_number, ONE_INTEGER ) )
        {
          this_char = Strings.sublisp_char( text_line, char_number );
          if( NIL == ignore_whitespaceP || NIL == string_utilities.whitespacep( this_char ) )
          {
            ignore_whitespaceP = NIL;
            if( !this_char.equal( Characters.CHAR_return ) )
            {
              if( !T.equal( inside_commentP ) )
              {
                if( T.equal( next_char_quotedP ) )
                {
                  char_list = ConsesLow.cons( this_char, char_list );
                  next_char_quotedP = NIL;
                }
                else if( this_char.eql( Characters.CHAR_backslash ) )
                {
                  char_list = ConsesLow.cons( this_char, char_list );
                  next_char_quotedP = T;
                }
                else if( T.equal( inside_stringP ) )
                {
                  char_list = ConsesLow.cons( this_char, char_list );
                  if( this_char.eql( Characters.CHAR_quotation ) )
                  {
                    inside_stringP = NIL;
                  }
                }
                else if( this_char.eql( Characters.CHAR_quotation ) )
                {
                  char_list = ConsesLow.cons( this_char, char_list );
                  inside_stringP = T;
                }
                else if( this_char.eql( Characters.CHAR_semicolon ) )
                {
                  inside_commentP = T;
                }
                else if( this_char.eql( Characters.CHAR_lparen ) )
                {
                  char_list = ConsesLow.cons( this_char, char_list );
                  if( NIL == last_paren_line )
                  {
                    last_paren_line = line_number_end;
                  }
                  paren_depth = Numbers.add( paren_depth, ONE_INTEGER );
                }
                else if( this_char.eql( Characters.CHAR_rparen ) )
                {
                  char_list = ConsesLow.cons( this_char, char_list );
                  paren_depth = Numbers.subtract( paren_depth, ONE_INTEGER );
                  if( paren_depth.numE( ZERO_INTEGER ) )
                  {
                    last_paren_line = NIL;
                  }
                  if( paren_depth.numL( ZERO_INTEGER ) )
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str10$Too_many_close_parenthesis_on_lin, line_number_end ) ), error_lists );
                  }
                }
                else if( !paren_depth.numE( ZERO_INTEGER ) )
                {
                  char_list = ConsesLow.cons( this_char, char_list );
                }
                else if( this_char.eql( Characters.CHAR_colon ) )
                {
                  if( looking_for == $kw11$END_OF_DATA )
                  {
                    char_list = ConsesLow.cons( this_char, char_list );
                  }
                  else
                  {
                    if( NIL == char_list )
                    {
                      error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list12 ), error_lists );
                    }
                    else
                    {
                      directive_s_poss = string_utilities.char_list_to_string( Sequences.nreverse( char_list ) );
                      char_list = NIL;
                      thread.resetMultipleValues();
                      directive_s = string_utilities.listify_string( directive_s_poss, UNPROVIDED );
                      error_strings = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      if( NIL != error_strings )
                      {
                        cdolist_list_var = error_strings;
                        error_string = NIL;
                        error_string = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string, directive_s_poss ), error_lists );
                          cdolist_list_var = cdolist_list_var.rest();
                          error_string = cdolist_list_var.first();
                        }
                        had_bad_directiveP = T;
                      }
                      else
                      {
                        looking_for = $kw11$END_OF_DATA;
                        the_directive = directive_s;
                      }
                    }
                    ignore_whitespaceP = T;
                    char_list = NIL;
                  }
                }
                else if( this_char.eql( Characters.CHAR_period ) )
                {
                  if( looking_for == $kw8$END_OF_DIRECTIVE )
                  {
                    if( NIL == char_list )
                    {
                      error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list12 ), error_lists );
                    }
                    else
                    {
                      directive_s_poss = string_utilities.char_list_to_string( Sequences.nreverse( char_list ) );
                      char_list = NIL;
                      thread.resetMultipleValues();
                      directive_s = string_utilities.listify_string( directive_s_poss, UNPROVIDED );
                      error_strings = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      if( NIL != error_strings )
                      {
                        cdolist_list_var = error_strings;
                        error_string = NIL;
                        error_string = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string, directive_s_poss ), error_lists );
                          cdolist_list_var = cdolist_list_var.rest();
                          error_string = cdolist_list_var.first();
                        }
                        had_bad_directiveP = T;
                      }
                      else
                      {
                        the_directive = directive_s;
                      }
                    }
                  }
                  else if( NIL == char_list )
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str13$Missing_data_for_directive__A, the_directive ) ), error_lists );
                  }
                  else
                  {
                    data_s_poss = string_utilities.char_list_to_string( Sequences.nreverse( char_list ) );
                    char_list = NIL;
                    thread.resetMultipleValues();
                    data = string_utilities.listify_string( data_s_poss, UNPROVIDED );
                    error_strings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != error_strings )
                    {
                      cdolist_list_var = error_strings;
                      error_string = NIL;
                      error_string = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string, data_s_poss ), error_lists );
                        cdolist_list_var = cdolist_list_var.rest();
                        error_string = cdolist_list_var.first();
                      }
                      had_bad_dataP = T;
                    }
                    else
                    {
                      the_data = data;
                    }
                  }
                  if( NIL == had_bad_directiveP && NIL == had_bad_dataP )
                  {
                    token_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, the_directive, the_data ), token_lists );
                  }
                  the_directive = NIL;
                  the_data = NIL;
                  had_bad_dataP = NIL;
                  had_bad_directiveP = NIL;
                  char_list = NIL;
                  ignore_whitespaceP = T;
                  looking_for = $kw8$END_OF_DIRECTIVE;
                  line_number_start = Numbers.add( ONE_INTEGER, line_number_end );
                }
                else
                {
                  char_list = ConsesLow.cons( this_char, char_list );
                }
              }
            }
          }
        }
        csome_list_var = csome_list_var.rest();
        text_line = csome_list_var.first();
      }
    }
    if( NIL != char_list )
    {
      if( paren_depth.numG( ZERO_INTEGER ) )
      {
        error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str14$Unclosed_open_parenthesis_on_line, last_paren_line ) ), error_lists );
      }
      else
      {
        error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str15$Unfinished_expression_at_end_of_f, string_utilities.char_list_to_string( Sequences
            .nreverse( char_list ) ) ) ), error_lists );
      }
    }
    return Values.values( Sequences.nreverse( token_lists ), Sequences.nreverse( error_lists ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 11017L)
  public static SubLObject ket_lookup_string(final SubLObject string_list, final SubLObject assoc)
  {
    SubLObject cdolist_list_var = string_list;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !string.isString() )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    SubLObject key_string = Strings.string_downcase( string_utilities.bunge( string_list, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    if( NIL != Characters.charE( Characters.CHAR_colon, Strings.sublisp_char( key_string, ZERO_INTEGER ) ) )
    {
      key_string = string_utilities.substring( key_string, ONE_INTEGER, Sequences.length( key_string ) );
    }
    final SubLObject possible_keyword = conses_high.assoc( key_string, assoc, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != possible_keyword )
    {
      return possible_keyword.rest();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 11774L)
  public static SubLObject ket_directive_list_to_directive(final SubLObject directive_list, SubLObject new_constant_names)
  {
    if( new_constant_names == UNPROVIDED )
    {
      new_constant_names = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_stringsP = T;
    SubLObject cdolist_list_var = directive_list;
    SubLObject directive_thing = NIL;
    directive_thing = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !directive_thing.isString() )
      {
        all_stringsP = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      directive_thing = cdolist_list_var.first();
    }
    if( NIL != all_stringsP )
    {
      final SubLObject directive_string = string_utilities.bunge( directive_list, UNPROVIDED );
      final SubLObject possible_keyword = conses_high.assoc( Strings.string_downcase( directive_string, UNPROVIDED, UNPROVIDED ), $ket_string_to_directive$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ),
          UNPROVIDED ).rest();
      final SubLObject possible_predicate = ke_utilities.fort_from_string( directive_string );
      if( NIL != possible_keyword )
      {
        return possible_keyword;
      }
      if( NIL != fort_types_interface.predicate_in_any_mtP( possible_predicate ) )
      {
        return possible_predicate;
      }
      if( NIL != conses_high.member( directive_string, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        return make_new_constant_wrapper( directive_string );
      }
    }
    else if( ONE_INTEGER.equal( Sequences.length( directive_list ) ) )
    {
      final SubLObject possible_nat_predicate = narts_high.find_nart( ket_unknown_to_known( directive_list.first(), UNPROVIDED, UNPROVIDED ) );
      if( NIL != fort_types_interface.predicate_in_any_mtP( possible_nat_predicate ) )
      {
        return possible_nat_predicate;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 13061L)
  public static SubLObject ket_relevant_mt(final SubLObject current_mt, final SubLObject current_default_mt, final SubLObject new_constant_names)
  {
    final SubLObject possible_mt = ( NIL != current_mt ) ? current_mt : current_default_mt;
    if( NIL == possible_mt )
    {
      return NIL;
    }
    if( NIL != Eval.constantp( possible_mt, UNPROVIDED ) )
    {
      return possible_mt;
    }
    if( NIL != hlmt.hlmt_p( possible_mt ) )
    {
      return possible_mt;
    }
    if( possible_mt.isString() && NIL != conses_high.member( possible_mt, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return make_new_constant_wrapper( possible_mt );
    }
    if( !possible_mt.isList() )
    {
      return NIL;
    }
    final SubLObject possible_nart_mt = narts_high.find_nart( possible_mt );
    if( NIL != hlmt.hlmt_p( possible_nart_mt ) )
    {
      return possible_nart_mt;
    }
    if( NIL != new_constant_wrapperp( possible_mt ) )
    {
      return possible_mt;
    }
    return possible_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 14196L)
  public static SubLObject ket_relevant_strength(final SubLObject override_strength, final SubLObject pred)
  {
    if( $kw19$MONOTONIC == override_strength )
    {
      return override_strength;
    }
    if( $kw20$DEFAULT == override_strength )
    {
      return override_strength;
    }
    if( NIL != forts.fort_p( pred ) && NIL != isa.isa_in_any_mtP( pred, $const21$DefaultMonotonicPredicate ) )
    {
      return $kw19$MONOTONIC;
    }
    return $kw20$DEFAULT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 14761L)
  public static SubLObject ket_relevant_direction(final SubLObject override_direction, final SubLObject formula)
  {
    if( $kw22$FORWARD == override_direction )
    {
      return override_direction;
    }
    if( $kw23$BACKWARD == override_direction )
    {
      return override_direction;
    }
    if( $kw24$CODE == override_direction )
    {
      return override_direction;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 15573L)
  public static SubLObject ket_unknown_to_known(final SubLObject unknown, SubLObject new_constant_names, SubLObject killed_constant_names)
  {
    if( new_constant_names == UNPROVIDED )
    {
      new_constant_names = NIL;
    }
    if( killed_constant_names == UNPROVIDED )
    {
      killed_constant_names = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject known = NIL;
    SubLObject error_strings = NIL;
    if( NIL == unknown )
    {
      error_strings = ConsesLow.cons( $str25$Something_is_nil, error_strings );
      known = unknown;
    }
    else if( NIL != forts.fort_p( unknown ) )
    {
      known = unknown;
    }
    else if( unknown.isNumber() )
    {
      known = unknown;
    }
    else if( unknown.isKeyword() )
    {
      known = unknown;
    }
    else if( unknown.isSymbol() )
    {
      known = unknown;
    }
    else if( unknown.isList() )
    {
      if( NIL != new_constant_wrapperp( unknown ) )
      {
        return unknown;
      }
      SubLObject cdolist_list_var = unknown;
      SubLObject unknown_item = NIL;
      unknown_item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject known_item = ket_unknown_to_known( unknown_item, new_constant_names, killed_constant_names );
        final SubLObject more_error_strings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        error_strings = ConsesLow.append( more_error_strings, error_strings );
        known = ConsesLow.cons( known_item, known );
        cdolist_list_var = cdolist_list_var.rest();
        unknown_item = cdolist_list_var.first();
      }
      known = Sequences.nreverse( known );
    }
    else if( NIL != unicode_strings.non_ascii_string_p( unknown ) )
    {
      known = unicode_nauts.unicode_string_to_cycl_safe_string( unknown );
    }
    else if( unknown.isString() )
    {
      final SubLObject possible_constant_name = string_utilities.string_remove_constant_reader_prefix( unknown );
      final SubLObject first_char = string_utilities.first_char( unknown );
      if( NIL != conses_high.member( unknown, killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        error_strings = ConsesLow.cons( PrintLow.format( NIL, $str26$Bad_reference_to_a_killed_or_rena, unknown ), error_strings );
      }
      else if( NIL != Characters.charE( Characters.CHAR_colon, first_char ) )
      {
        if( ONE_INTEGER.numL( Sequences.length( unknown ) ) )
        {
          known = string_utilities.keyword_from_string( Strings.string_upcase( string_utilities.substring( unknown, ONE_INTEGER, Sequences.length( unknown ) ), UNPROVIDED, UNPROVIDED ) );
        }
        else
        {
          error_strings = ConsesLow.cons( $str27$A_single_colon_is_an_invalid_keyw, error_strings );
        }
      }
      else if( NIL != Characters.charE( Characters.CHAR_question, first_char ) )
      {
        if( ONE_INTEGER.numL( Sequences.length( unknown ) ) )
        {
          known = cycl_variables.make_el_var( unknown );
        }
        else
        {
          error_strings = ConsesLow.cons( $str28$A_single_question_mark_is_an_inva, error_strings );
        }
      }
      else if( NIL != Characters.charE( Characters.CHAR_quotation, first_char ) )
      {
        if( Sequences.length( unknown ).numG( ONE_INTEGER ) && Characters.CHAR_quotation.eql( string_utilities.last_char( unknown ) ) )
        {
          known = string_utilities.string_trim_symmetric_n( $list29, unknown, ONE_INTEGER );
          if( NIL != unicode_strings.non_ascii_string_p( known ) )
          {
            known = unicode_nauts.non_ascii_string_to_unicode( known );
          }
        }
        else
        {
          error_strings = ConsesLow.cons( $str30$Malformed_string, error_strings );
        }
      }
      else if( NIL != Characters.charE( Characters.CHAR_quote, first_char ) )
      {
        if( ONE_INTEGER.numL( Sequences.length( unknown ) ) )
        {
          known = Packages.intern( Strings.string_upcase( string_utilities.substring( unknown, ONE_INTEGER, Sequences.length( unknown ) ), UNPROVIDED, UNPROVIDED ), UNPROVIDED );
        }
        else
        {
          error_strings = ConsesLow.cons( $str31$Gratutuious_single_quote, error_strings );
        }
      }
      else if( NIL != Characters.charE( Characters.CHAR_period, first_char ) && ONE_INTEGER.numE( Sequences.length( unknown ) ) )
      {
        known = $kw32$DOT_FOR_DOTTED_LIST;
      }
      else if( NIL != conses_high.member( unknown, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        known = make_new_constant_wrapper( unknown );
      }
      else if( NIL != number_utilities.number_string_p( unknown ) )
      {
        final SubLObject possible_number = reader.read_from_string_ignoring_errors( unknown, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != possible_number )
        {
          known = possible_number;
        }
        else
        {
          known = unknown;
          error_strings = ConsesLow.cons( PrintLow.format( NIL, $str33$Bad_number___A_, unknown ), error_strings );
        }
      }
      else if( Strings.string_downcase( unknown, UNPROVIDED, UNPROVIDED ).equal( $str34$nil ) )
      {
        known = NIL;
      }
      else if( Strings.string_downcase( unknown, UNPROVIDED, UNPROVIDED ).equal( $str35$t ) )
      {
        known = T;
      }
      else if( NIL != constant_completion_high.valid_constant_name_p( possible_constant_name ) )
      {
        final SubLObject possible_constant = ket_maybe_find_constant( possible_constant_name );
        if( NIL != constant_handles.valid_constantP( possible_constant, UNPROVIDED ) )
        {
          known = possible_constant;
        }
        else if( NIL != conses_high.member( possible_constant_name, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          known = make_new_constant_wrapper( possible_constant_name );
        }
        else
        {
          error_strings = ConsesLow.cons( PrintLow.format( NIL, $str36$Constant_not_found___A_, unknown ), error_strings );
        }
      }
      else
      {
        error_strings = ConsesLow.cons( PrintLow.format( NIL, $str37$Couldn_t_figure_out_string___A___, unknown ), error_strings );
        known = unknown;
      }
    }
    else
    {
      error_strings = ConsesLow.cons( PrintLow.format( NIL, $str38$Couldn_t_figure_out___A_, unknown ), error_strings );
      known = unknown;
    }
    return Values.values( known, Sequences.nreverse( error_strings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 20033L)
  public static SubLObject ket_maybe_find_constant(final SubLObject possible_constant_name)
  {
    return constants_high.find_constant( string_utilities.string_remove_constant_reader_prefix( possible_constant_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 20301L)
  public static SubLObject ket_make_ke_operation(SubLObject unresolved_formula, final SubLObject mt, SubLObject strength_override, SubLObject direction_override, SubLObject new_constant_names,
      SubLObject killed_constant_names, SubLObject mode, SubLObject current_ist_sentence)
  {
    if( strength_override == UNPROVIDED )
    {
      strength_override = NIL;
    }
    if( direction_override == UNPROVIDED )
    {
      direction_override = NIL;
    }
    if( new_constant_names == UNPROVIDED )
    {
      new_constant_names = NIL;
    }
    if( killed_constant_names == UNPROVIDED )
    {
      killed_constant_names = NIL;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw39$ENTER;
    }
    if( current_ist_sentence == UNPROVIDED )
    {
      current_ist_sentence = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ke_operation = NIL;
    SubLObject error_strings = NIL;
    SubLObject replaced_the_assertion_sentenceP = NIL;
    if( NIL != list_utilities.tree_find( $str40$TheAssertionSentence, unresolved_formula, EQUAL, UNPROVIDED ) || NIL != list_utilities.tree_find( $str41$__TheAssertionSentence, unresolved_formula, EQUAL, UNPROVIDED ) )
    {
      if( NIL == current_ist_sentence )
      {
        error_strings = ConsesLow.cons( $str42$Formula____TheAssertionSentence_i, error_strings );
      }
      unresolved_formula = cycl_utilities.expression_subst( current_ist_sentence, $str40$TheAssertionSentence, unresolved_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      unresolved_formula = cycl_utilities.expression_subst( current_ist_sentence, $str41$__TheAssertionSentence, unresolved_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      replaced_the_assertion_sentenceP = T;
    }
    if( NIL == replaced_the_assertion_sentenceP && mode == $kw39$ENTER )
    {
      current_ist_sentence = el_utilities.make_ist_sentence( mt, unresolved_formula );
    }
    thread.resetMultipleValues();
    SubLObject formula = ket_unknown_to_known( unresolved_formula, new_constant_names, killed_constant_names );
    final SubLObject some_error_strings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != some_error_strings )
    {
      SubLObject cdolist_list_var = some_error_strings;
      SubLObject some_error_string = NIL;
      some_error_string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        error_strings = ConsesLow.cons( some_error_string, error_strings );
        cdolist_list_var = cdolist_list_var.rest();
        some_error_string = cdolist_list_var.first();
      }
    }
    if( NIL == mt )
    {
      error_strings = ConsesLow.cons( $str43$Microtheory_not_specified, error_strings );
    }
    final SubLObject predicate = formula.first();
    final SubLObject strength = ket_relevant_strength( strength_override, predicate );
    final SubLObject direction = ket_relevant_direction( direction_override, formula );
    thread.resetMultipleValues();
    final SubLObject dotted_formula = list_utilities.possible_dotted_list_to_dotted_list( formula, UNPROVIDED );
    final SubLObject dotted_formula_okP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != dotted_formula_okP )
    {
      formula = dotted_formula;
    }
    else
    {
      error_strings = ConsesLow.cons( $str44$Invalid_dotted_list, error_strings );
    }
    if( mode == $kw45$DELETE )
    {
      ke_operation = ConsesLow.list( $kw46$UNASSERT, formula, mt );
    }
    else
    {
      ke_operation = ConsesLow.list( $kw47$ASSERT, formula, mt, strength, direction );
    }
    return Values.values( ke_operation, error_strings, current_ist_sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 23252L)
  public static SubLObject ke_text_token_lists_to_ke_operations(final SubLObject token_lists, SubLObject new_constant_names, SubLObject killed_constant_names)
  {
    if( new_constant_names == UNPROVIDED )
    {
      new_constant_names = NIL;
    }
    if( killed_constant_names == UNPROVIDED )
    {
      killed_constant_names = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_constant = NIL;
    SubLObject current_default_mt = NIL;
    SubLObject current_ist_sentence = NIL;
    SubLObject current_assert_mode = $kw39$ENTER;
    SubLObject next_assert_strength = NIL;
    SubLObject next_assert_direction = NIL;
    SubLObject current_mt = NIL;
    SubLObject ke_operations = NIL;
    SubLObject error_lists = NIL;
    SubLObject abortP = NIL;
    if( NIL == abortP )
    {
      SubLObject csome_list_var = token_lists;
      SubLObject token_list = NIL;
      token_list = csome_list_var.first();
      while ( NIL == abortP && NIL != csome_list_var)
      {
        final SubLObject filename = token_list.first();
        final SubLObject line_number_start = conses_high.second( token_list );
        final SubLObject line_number_end = conses_high.third( token_list );
        final SubLObject directive_list = conses_high.fourth( token_list );
        final SubLObject data_list = conses_high.fifth( token_list );
        final SubLObject directive = ket_directive_list_to_directive( directive_list, new_constant_names );
        if( Sequences.length( error_lists ).numG( $ke_text_error_count_abort_num$.getDynamicValue( thread ) ) )
        {
          error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list9 ), error_lists );
          abortP = T;
        }
        if( NIL == directive )
        {
          error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list48 ), error_lists );
        }
        else if( directive.isKeyword() )
        {
          final SubLObject pcase_var = directive;
          if( pcase_var.eql( $kw49$FORMULA ) )
          {
            final SubLObject mt = ket_relevant_mt( current_mt, current_default_mt, new_constant_names );
            SubLObject cdolist_list_var = data_list;
            SubLObject formula = NIL;
            formula = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == formula )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list50 ), error_lists );
              }
              else if( formula.isAtom() && NIL == Strings.stringE( formula, $str41$__TheAssertionSentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Strings.stringE( formula, $str40$TheAssertionSentence,
                  UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list51 ), error_lists );
              }
              else
              {
                thread.resetMultipleValues();
                final SubLObject ke_operation = ket_make_ke_operation( formula, mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence );
                final SubLObject error_strings = thread.secondMultipleValue();
                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                current_ist_sentence = next_ist_sentence;
                next_assert_strength = NIL;
                next_assert_direction = NIL;
                if( NIL != error_strings )
                {
                  SubLObject cdolist_list_var_$1 = error_strings;
                  SubLObject error_string = NIL;
                  error_string = cdolist_list_var_$1.first();
                  while ( NIL != cdolist_list_var_$1)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string ), error_lists );
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    error_string = cdolist_list_var_$1.first();
                  }
                }
                else
                {
                  ke_operations = ConsesLow.cons( ke_operation, ke_operations );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              formula = cdolist_list_var.first();
            }
          }
          else if( pcase_var.eql( $kw52$CONSTANT ) )
          {
            current_mt = NIL;
            if( !data_list.isList() )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list53 ), error_lists );
            }
            else if( Sequences.length( data_list ).numG( ONE_INTEGER ) )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list54 ), error_lists );
            }
            else
            {
              SubLObject constant_thing = data_list.first();
              if( NIL == constant_thing )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list53 ), error_lists );
              }
              else if( constant_thing.isList() )
              {
                thread.resetMultipleValues();
                final SubLObject known_constant_thing = ket_unknown_to_known( constant_thing, new_constant_names, UNPROVIDED );
                final SubLObject error_strings2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != error_strings2 )
                {
                  SubLObject cdolist_list_var2 = error_strings2;
                  SubLObject error_string2 = NIL;
                  error_string2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string2 ), error_lists );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    error_string2 = cdolist_list_var2.first();
                  }
                }
                else
                {
                  final SubLObject possible_nat = narts_high.find_nart( known_constant_thing );
                  if( NIL != nart_handles.nart_p( possible_nat ) )
                  {
                    current_constant = constant_thing;
                  }
                  else
                  {
                    current_constant = constant_thing;
                    new_constant_names = ConsesLow.cons( constant_thing, new_constant_names );
                  }
                }
              }
              else if( constant_thing.isString() )
              {
                constant_thing = string_utilities.string_remove_constant_reader_prefix( constant_thing );
                if( NIL == constant_completion_high.valid_constant_name_p( constant_thing ) )
                {
                  error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list55 ), error_lists );
                }
                else if( NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue( thread ) && NIL != constant_completion_high.constant_name_case_collision( constant_thing ) )
                {
                  error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str56$Constant__Constant_already_exists, constant_completion_high
                      .constant_name_case_collision( constant_thing ) ) ), error_lists );
                }
                else
                {
                  final SubLObject possible_constant = ket_maybe_find_constant( constant_thing );
                  if( NIL != conses_high.member( constant_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                  {
                    current_constant = make_new_constant_wrapper( constant_thing );
                  }
                  else if( NIL != constant_handles.valid_constantP( possible_constant, UNPROVIDED ) && NIL == subl_promotions.memberP( constants_high.constant_name( possible_constant ), killed_constant_names, Symbols
                      .symbol_function( EQUAL ), UNPROVIDED ) )
                  {
                    current_constant = possible_constant;
                  }
                  else
                  {
                    ke_operations = ConsesLow.cons( ConsesLow.list( $kw57$CREATE, constant_thing ), ke_operations );
                    current_constant = make_new_constant_wrapper( constant_thing );
                    new_constant_names = ConsesLow.cons( constant_thing, new_constant_names );
                    killed_constant_names = Sequences.remove( constant_thing, killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                }
              }
              else
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str58$Constant__Unrecognized_constant__, constant_thing ) ), error_lists );
              }
            }
          }
          else if( pcase_var.eql( $kw59$KILL ) )
          {
            if( !data_list.isList() )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list60 ), error_lists );
            }
            else if( Sequences.length( data_list ).numG( ONE_INTEGER ) )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list61 ), error_lists );
            }
            else
            {
              final SubLObject constant_thing = data_list.first();
              SubLObject possible_constant = NIL;
              if( NIL == constant_thing )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list60 ), error_lists );
              }
              else if( constant_thing.isList() )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list62 ), error_lists );
              }
              else if( !constant_thing.isString() )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list63 ), error_lists );
              }
              else if( NIL != conses_high.member( constant_thing, killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list64 ), error_lists );
              }
              else
              {
                possible_constant = ket_maybe_find_constant( constant_thing );
                if( NIL != conses_high.member( constant_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  ke_operations = ConsesLow.cons( ConsesLow.list( $kw59$KILL, make_new_constant_wrapper( constant_thing ) ), ke_operations );
                  killed_constant_names = ConsesLow.cons( new_constant_names, killed_constant_names );
                  new_constant_names = Sequences.remove( constant_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( NIL != constant_handles.constant_p( possible_constant ) )
                {
                  ke_operations = ConsesLow.cons( ConsesLow.list( $kw59$KILL, possible_constant ), ke_operations );
                  killed_constant_names = ConsesLow.cons( constants_high.constant_name( possible_constant ), killed_constant_names );
                  new_constant_names = Sequences.remove( constants_high.constant_name( possible_constant ), new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
            }
          }
          else if( pcase_var.eql( $kw65$RENAME ) )
          {
            if( !data_list.isList() )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list66 ), error_lists );
            }
            else
            {
              final SubLObject old_constant_thing = data_list.first();
              SubLObject possible_existing_old_constant = NIL;
              final SubLObject new_constant_thing = conses_high.second( data_list );
              SubLObject unquoted_new_constant_thing = NIL;
              SubLObject possible_existing_new_constant = NIL;
              SubLObject continue_counter = ZERO_INTEGER;
              if( NIL == old_constant_thing )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list67 ), error_lists );
              }
              else if( old_constant_thing.isList() )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list68 ), error_lists );
              }
              else if( !old_constant_thing.isString() )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list69 ), error_lists );
              }
              else if( NIL != conses_high.member( old_constant_thing, killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str70$Rename__Can_t_rename_a_constant_r, old_constant_thing ) ), error_lists );
              }
              else
              {
                possible_existing_old_constant = ket_maybe_find_constant( old_constant_thing );
                continue_counter = Numbers.add( continue_counter, ONE_INTEGER );
              }
              if( !new_constant_thing.isString() )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list71 ), error_lists );
              }
              else if( NIL == Characters.charE( Characters.CHAR_quotation, Strings.sublisp_char( new_constant_thing, ZERO_INTEGER ) ) )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list72 ), error_lists );
              }
              else
              {
                unquoted_new_constant_thing = string_utilities.string_remove_constant_reader_prefix( string_utilities.string_trim_symmetric_n( $list29, new_constant_thing, ONE_INTEGER ) );
                possible_existing_new_constant = ket_maybe_find_constant( unquoted_new_constant_thing );
                if( NIL == constant_completion_high.valid_constant_name_p( unquoted_new_constant_thing ) )
                {
                  error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list73 ), error_lists );
                }
                else if( NIL != conses_high.member( unquoted_new_constant_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str74$Rename__Can_t_rename_to_constant_, unquoted_new_constant_thing ) ),
                      error_lists );
                }
                else if( NIL != constant_handles.valid_constantP( possible_existing_new_constant, UNPROVIDED ) && NIL == subl_promotions.memberP( constants_high.constant_name( possible_existing_new_constant ),
                    killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str75$Rename__Can_t_rename_to_existing_, unquoted_new_constant_thing ) ),
                      error_lists );
                }
                else
                {
                  continue_counter = Numbers.add( continue_counter, ONE_INTEGER );
                }
              }
              if( continue_counter.eql( TWO_INTEGER ) )
              {
                if( NIL != constant_handles.constant_p( possible_existing_old_constant ) )
                {
                  ke_operations = ConsesLow.cons( ConsesLow.list( $kw65$RENAME, possible_existing_old_constant, unquoted_new_constant_thing ), ke_operations );
                  new_constant_names = ConsesLow.cons( unquoted_new_constant_thing, new_constant_names );
                  new_constant_names = Sequences.remove( constants_high.constant_name( possible_existing_old_constant ), new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                  killed_constant_names = ConsesLow.cons( constants_high.constant_name( possible_existing_old_constant ), killed_constant_names );
                  killed_constant_names = Sequences.remove( unquoted_new_constant_thing, killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  if( possible_existing_old_constant.eql( current_constant ) )
                  {
                    current_constant = make_new_constant_wrapper( unquoted_new_constant_thing );
                  }
                }
                else if( NIL != conses_high.member( old_constant_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  ke_operations = ConsesLow.cons( ConsesLow.list( $kw65$RENAME, ConsesLow.list( $kw76$NEW_CONSTANT, old_constant_thing ), unquoted_new_constant_thing ), ke_operations );
                  new_constant_names = Sequences.remove( old_constant_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  new_constant_names = ConsesLow.cons( unquoted_new_constant_thing, new_constant_names );
                  killed_constant_names = ConsesLow.cons( old_constant_thing, killed_constant_names );
                  killed_constant_names = Sequences.remove( unquoted_new_constant_thing, killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  if( NIL != list_utilities.tree_find( old_constant_thing, current_constant, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                  {
                    current_constant = make_new_constant_wrapper( unquoted_new_constant_thing );
                  }
                }
                else
                {
                  error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str77$Rename__Unrecognized_constant___A, old_constant_thing ) ), error_lists );
                }
              }
            }
          }
          else if( pcase_var.eql( $kw78$MERGE ) )
          {
            if( !data_list.isList() )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list79 ), error_lists );
            }
            else
            {
              final SubLObject kill_fort_thing = data_list.first();
              SubLObject known_kill_fort_thing = NIL;
              SubLObject kill_fort = NIL;
              final SubLObject keep_fort_thing = conses_high.second( data_list );
              SubLObject known_keep_fort_thing = NIL;
              SubLObject keep_fort = NIL;
              SubLObject error_strings3 = NIL;
              SubLObject continue_counter2 = ZERO_INTEGER;
              if( NIL == kill_fort_thing )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list80 ), error_lists );
              }
              else if( NIL != conses_high.member( kill_fort_thing, killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list81 ), error_lists );
              }
              else
              {
                thread.resetMultipleValues();
                final SubLObject known_kill_fort_thing_$2 = ket_unknown_to_known( kill_fort_thing, new_constant_names, killed_constant_names );
                final SubLObject error_strings_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                known_kill_fort_thing = known_kill_fort_thing_$2;
                error_strings3 = error_strings_$3;
                kill_fort = ke_utilities.fort_from_string( known_kill_fort_thing );
                if( NIL != error_strings3 )
                {
                  SubLObject cdolist_list_var3 = error_strings3;
                  SubLObject error_string3 = NIL;
                  error_string3 = cdolist_list_var3.first();
                  while ( NIL != cdolist_list_var3)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string3 ), error_lists );
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    error_string3 = cdolist_list_var3.first();
                  }
                }
                else if( NIL == forts.fort_p( kill_fort ) && NIL == conses_high.member( kill_fort_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list82 ), error_lists );
                }
                else
                {
                  continue_counter2 = Numbers.add( continue_counter2, ONE_INTEGER );
                }
              }
              if( NIL == keep_fort_thing )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list83 ), error_lists );
              }
              else if( NIL != conses_high.member( keep_fort_thing, killed_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list84 ), error_lists );
              }
              else
              {
                thread.resetMultipleValues();
                final SubLObject known_keep_fort_thing_$4 = ket_unknown_to_known( keep_fort_thing, new_constant_names, killed_constant_names );
                final SubLObject error_strings_$4 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                known_keep_fort_thing = known_keep_fort_thing_$4;
                error_strings3 = error_strings_$4;
                keep_fort = ke_utilities.fort_from_string( known_keep_fort_thing );
                if( NIL != error_strings3 )
                {
                  SubLObject cdolist_list_var3 = error_strings3;
                  SubLObject error_string3 = NIL;
                  error_string3 = cdolist_list_var3.first();
                  while ( NIL != cdolist_list_var3)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string3 ), error_lists );
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    error_string3 = cdolist_list_var3.first();
                  }
                }
                else if( NIL == forts.fort_p( keep_fort ) && NIL == conses_high.member( keep_fort_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list85 ), error_lists );
                }
                else
                {
                  continue_counter2 = Numbers.add( continue_counter2, ONE_INTEGER );
                }
              }
              if( continue_counter2.eql( TWO_INTEGER ) )
              {
                new_constant_names = Sequences.remove( kill_fort_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                killed_constant_names = ConsesLow.cons( kill_fort_thing, killed_constant_names );
                if( NIL != forts.fort_p( kill_fort ) )
                {
                  if( NIL != forts.fort_p( keep_fort ) )
                  {
                    ke_operations = ConsesLow.cons( ConsesLow.list( $kw78$MERGE, kill_fort, keep_fort ), ke_operations );
                  }
                  else
                  {
                    ke_operations = ConsesLow.cons( ConsesLow.list( $kw78$MERGE, kill_fort, make_new_constant_wrapper( keep_fort_thing ) ), ke_operations );
                  }
                }
                else if( NIL != forts.fort_p( keep_fort ) )
                {
                  ke_operations = ConsesLow.cons( ConsesLow.list( $kw78$MERGE, make_new_constant_wrapper( kill_fort_thing ), keep_fort ), ke_operations );
                }
                else
                {
                  ke_operations = ConsesLow.cons( ConsesLow.list( $kw78$MERGE, make_new_constant_wrapper( kill_fort_thing ), make_new_constant_wrapper( keep_fort_thing ) ), ke_operations );
                }
              }
            }
          }
          else if( pcase_var.eql( $kw39$ENTER ) )
          {
            current_assert_mode = $kw39$ENTER;
          }
          else if( pcase_var.eql( $kw45$DELETE ) )
          {
            current_assert_mode = $kw45$DELETE;
          }
          else if( pcase_var.eql( $kw86$IN_MT ) )
          {
            if( !data_list.isList() )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list87 ), error_lists );
            }
            else
            {
              final SubLObject mt_thing = data_list.first();
              if( NIL == mt_thing )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list87 ), error_lists );
              }
              else if( mt_thing.isList() )
              {
                thread.resetMultipleValues();
                SubLObject known_mt_thing = ket_unknown_to_known( mt_thing, new_constant_names, killed_constant_names );
                final SubLObject error_strings2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != error_strings2 )
                {
                  SubLObject cdolist_list_var2 = error_strings2;
                  SubLObject error_string2 = NIL;
                  error_string2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string2 ), error_lists );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    error_string2 = cdolist_list_var2.first();
                  }
                }
                else
                {
                  final SubLObject possible_nat_mt = narts_high.find_nart( known_mt_thing );
                  if( NIL != nart_handles.nart_p( possible_nat_mt ) )
                  {
                    known_mt_thing = possible_nat_mt;
                  }
                  current_mt = known_mt_thing;
                }
              }
              else if( NIL != constant_handles.constant_p( mt_thing ) )
              {
                current_mt = mt_thing;
              }
              else if( mt_thing.isString() )
              {
                final SubLObject possible_mt = ket_maybe_find_constant( mt_thing );
                if( NIL != constant_handles.valid_constantP( possible_mt, UNPROVIDED ) )
                {
                  current_mt = possible_mt;
                }
                else if( NIL != subl_promotions.memberP( mt_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  current_mt = make_new_constant_wrapper( mt_thing );
                }
                else
                {
                  error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str89$In_Mt__Unrecognized_mt___A_, mt_thing ) ), error_lists );
                }
              }
              else
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str89$In_Mt__Unrecognized_mt___A_, mt_thing ) ), error_lists );
              }
            }
          }
          else if( pcase_var.eql( $kw90$DEFAULT_MT ) )
          {
            if( !data_list.isList() )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list91 ), error_lists );
            }
            else
            {
              final SubLObject mt_thing = data_list.first();
              if( NIL == mt_thing )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list91 ), error_lists );
              }
              else if( mt_thing.isList() )
              {
                thread.resetMultipleValues();
                SubLObject known_mt_thing = ket_unknown_to_known( mt_thing, new_constant_names, killed_constant_names );
                final SubLObject error_strings2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != error_strings2 )
                {
                  SubLObject cdolist_list_var2 = error_strings2;
                  SubLObject error_string2 = NIL;
                  error_string2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string2 ), error_lists );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    error_string2 = cdolist_list_var2.first();
                  }
                }
                else
                {
                  final SubLObject possible_nat_mt = narts_high.find_nart( known_mt_thing );
                  if( NIL != nart_handles.nart_p( possible_nat_mt ) )
                  {
                    known_mt_thing = possible_nat_mt;
                  }
                  current_mt = NIL;
                  current_default_mt = known_mt_thing;
                }
              }
              else if( NIL != constant_handles.constant_p( mt_thing ) )
              {
                current_mt = NIL;
                current_default_mt = mt_thing;
              }
              else if( mt_thing.isString() )
              {
                final SubLObject possible_mt = ket_maybe_find_constant( mt_thing );
                if( NIL != constant_handles.valid_constantP( possible_mt, UNPROVIDED ) )
                {
                  current_mt = NIL;
                  current_default_mt = possible_mt;
                }
                else if( NIL != subl_promotions.memberP( mt_thing, new_constant_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                {
                  current_mt = NIL;
                  current_default_mt = make_new_constant_wrapper( mt_thing );
                }
                else
                {
                  error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str93$Default_Mt__Unrecognized_mt___A_, mt_thing ) ), error_lists );
                }
              }
              else
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str93$Default_Mt__Unrecognized_mt___A_, mt_thing ) ), error_lists );
              }
            }
          }
          else if( pcase_var.eql( $kw94$STRENGTH ) )
          {
            if( !data_list.isList() )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list95 ), error_lists );
            }
            else
            {
              final SubLObject strength_keyword = ket_lookup_string( data_list, $ket_string_to_strength$.getDynamicValue( thread ) );
              if( NIL == strength_keyword )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list95 ), error_lists );
              }
              else if( strength_keyword.isKeyword() )
              {
                next_assert_strength = strength_keyword;
              }
              else
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str96$Strength__Unrecognized_strength__, data_list ) ), error_lists );
              }
            }
          }
          else if( pcase_var.eql( $kw97$DIRECTION ) )
          {
            if( !data_list.isList() )
            {
              error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list98 ), error_lists );
            }
            else
            {
              final SubLObject direction_keyword = ket_lookup_string( data_list, $ket_string_to_direction$.getDynamicValue( thread ) );
              if( NIL == direction_keyword )
              {
                error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list98 ), error_lists );
              }
              else if( direction_keyword.isKeyword() )
              {
                next_assert_direction = direction_keyword;
              }
              else
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str99$Direction__Unrecognized_direction, data_list ) ), error_lists );
              }
            }
          }
        }
        else if( directive.isString() && NIL == subl_promotions.memberP( directive, new_constant_names, Symbols.symbol_function( $sym100$STRING_ ), UNPROVIDED ) )
        {
          error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list101 ), error_lists );
        }
        else if( directive.isList() && NIL == new_constant_wrapperp( directive ) )
        {
          error_lists = ConsesLow.cons( ConsesLow.listS( filename, line_number_start, line_number_end, $list102 ), error_lists );
        }
        else
        {
          SubLObject known_arity = ( NIL != fort_types_interface.predicateP( directive ) ) ? arity.arity( directive ) : NIL;
          final SubLObject mt = ket_relevant_mt( current_mt, current_default_mt, new_constant_names );
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym103$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const104$EverythingPSC, thread );
            known_arity = ( NIL != fort_types_interface.predicateP( directive ) ) ? arity.arity( directive ) : NIL;
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
          if( NIL == current_constant )
          {
            error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str105$Constant_must_be_specified, directive ) ), error_lists );
          }
          else if( ONE_INTEGER.eql( known_arity ) )
          {
            if( NIL == data_list )
            {
              thread.resetMultipleValues();
              final SubLObject ke_operation2 = ket_make_ke_operation( ConsesLow.list( directive, current_constant ), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names,
                  current_assert_mode, current_ist_sentence );
              final SubLObject error_strings2 = thread.secondMultipleValue();
              final SubLObject next_ist_sentence2 = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              current_ist_sentence = next_ist_sentence2;
              next_assert_strength = NIL;
              next_assert_direction = NIL;
              if( NIL != error_strings2 )
              {
                SubLObject cdolist_list_var4 = error_strings2;
                SubLObject error_string4 = NIL;
                error_string4 = cdolist_list_var4.first();
                while ( NIL != cdolist_list_var4)
                {
                  error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string4 ), error_lists );
                  cdolist_list_var4 = cdolist_list_var4.rest();
                  error_string4 = cdolist_list_var4.first();
                }
              }
              else
              {
                ke_operations = ConsesLow.cons( ke_operation2, ke_operations );
              }
            }
            else
            {
              error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str106$Unexpected_argument_to_unary_pred, directive ) ), error_lists );
            }
          }
          else if( TWO_INTEGER.eql( known_arity ) )
          {
            SubLObject cdolist_list_var = data_list;
            SubLObject formula_arg3 = NIL;
            formula_arg3 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == formula_arg3 )
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str107$No_argument_found_for_binary_pred, directive ) ), error_lists );
              }
              else
              {
                thread.resetMultipleValues();
                final SubLObject ke_operation = ket_make_ke_operation( ConsesLow.list( directive, current_constant, formula_arg3 ), mt, next_assert_strength, next_assert_direction, new_constant_names,
                    killed_constant_names, current_assert_mode, current_ist_sentence );
                final SubLObject error_strings = thread.secondMultipleValue();
                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                current_ist_sentence = next_ist_sentence;
                next_assert_strength = NIL;
                next_assert_direction = NIL;
                if( NIL != error_strings )
                {
                  SubLObject cdolist_list_var_$2 = error_strings;
                  SubLObject error_string = NIL;
                  error_string = cdolist_list_var_$2.first();
                  while ( NIL != cdolist_list_var_$2)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string ), error_lists );
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    error_string = cdolist_list_var_$2.first();
                  }
                }
                else
                {
                  ke_operations = ConsesLow.cons( ke_operation, ke_operations );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              formula_arg3 = cdolist_list_var.first();
            }
          }
          else if( known_arity.isInteger() && known_arity.numGE( THREE_INTEGER ) )
          {
            SubLObject cdolist_list_var = data_list;
            SubLObject formula_rest_rest = NIL;
            formula_rest_rest = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == formula_rest_rest )
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str108$No_argument_found_for_arity__A_pr, known_arity, directive ) ), error_lists );
              }
              else if( formula_rest_rest.isAtom() )
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str109$List_argument_expected_for_arity_, known_arity, directive ) ), error_lists );
              }
              else
              {
                thread.resetMultipleValues();
                final SubLObject ke_operation = ket_make_ke_operation( ConsesLow.listS( directive, current_constant, ConsesLow.append( formula_rest_rest, NIL ) ), mt, next_assert_strength, next_assert_direction,
                    new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence );
                final SubLObject error_strings = thread.secondMultipleValue();
                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                current_ist_sentence = next_ist_sentence;
                next_assert_strength = NIL;
                next_assert_direction = NIL;
                if( NIL != error_strings )
                {
                  SubLObject cdolist_list_var_$3 = error_strings;
                  SubLObject error_string = NIL;
                  error_string = cdolist_list_var_$3.first();
                  while ( NIL != cdolist_list_var_$3)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string ), error_lists );
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    error_string = cdolist_list_var_$3.first();
                  }
                }
                else
                {
                  ke_operations = ConsesLow.cons( ke_operation, ke_operations );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              formula_rest_rest = cdolist_list_var.first();
            }
          }
          else if( NIL == data_list )
          {
            thread.resetMultipleValues();
            final SubLObject ke_operation2 = ket_make_ke_operation( ConsesLow.list( directive, current_constant ), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names,
                current_assert_mode, current_ist_sentence );
            final SubLObject error_strings2 = thread.secondMultipleValue();
            final SubLObject next_ist_sentence2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            current_ist_sentence = next_ist_sentence2;
            next_assert_strength = NIL;
            next_assert_direction = NIL;
            if( NIL != error_strings2 )
            {
              SubLObject cdolist_list_var4 = error_strings2;
              SubLObject error_string4 = NIL;
              error_string4 = cdolist_list_var4.first();
              while ( NIL != cdolist_list_var4)
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string4 ), error_lists );
                cdolist_list_var4 = cdolist_list_var4.rest();
                error_string4 = cdolist_list_var4.first();
              }
            }
            else
            {
              ke_operations = ConsesLow.cons( ke_operation2, ke_operations );
            }
          }
          else
          {
            SubLObject cdolist_list_var = data_list;
            SubLObject formula_args = NIL;
            formula_args = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == formula_args )
              {
                thread.resetMultipleValues();
                final SubLObject ke_operation = ket_make_ke_operation( ConsesLow.list( directive, current_constant ), mt, next_assert_strength, next_assert_direction, new_constant_names, killed_constant_names,
                    current_assert_mode, current_ist_sentence );
                final SubLObject error_strings = thread.secondMultipleValue();
                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                current_ist_sentence = next_ist_sentence;
                next_assert_strength = NIL;
                next_assert_direction = NIL;
                if( NIL != error_strings )
                {
                  SubLObject cdolist_list_var_$4 = error_strings;
                  SubLObject error_string = NIL;
                  error_string = cdolist_list_var_$4.first();
                  while ( NIL != cdolist_list_var_$4)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string ), error_lists );
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    error_string = cdolist_list_var_$4.first();
                  }
                }
                else
                {
                  ke_operations = ConsesLow.cons( ke_operation, ke_operations );
                }
              }
              else if( NIL != formula_args )
              {
                thread.resetMultipleValues();
                final SubLObject ke_operation = ket_make_ke_operation( ConsesLow.list( directive, current_constant, formula_args ), mt, next_assert_strength, next_assert_direction, new_constant_names,
                    killed_constant_names, current_assert_mode, current_ist_sentence );
                final SubLObject error_strings = thread.secondMultipleValue();
                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                current_ist_sentence = next_ist_sentence;
                next_assert_strength = NIL;
                next_assert_direction = NIL;
                if( NIL != error_strings )
                {
                  SubLObject cdolist_list_var_$5 = error_strings;
                  SubLObject error_string = NIL;
                  error_string = cdolist_list_var_$5.first();
                  while ( NIL != cdolist_list_var_$5)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string ), error_lists );
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    error_string = cdolist_list_var_$5.first();
                  }
                }
                else
                {
                  ke_operations = ConsesLow.cons( ke_operation, ke_operations );
                }
              }
              else if( NIL != ConsesLow.list( formula_args ) )
              {
                thread.resetMultipleValues();
                final SubLObject ke_operation = ket_make_ke_operation( ConsesLow.listS( directive, current_constant, ConsesLow.append( formula_args, NIL ) ), mt, next_assert_strength, next_assert_direction,
                    new_constant_names, killed_constant_names, current_assert_mode, current_ist_sentence );
                final SubLObject error_strings = thread.secondMultipleValue();
                final SubLObject next_ist_sentence = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                current_ist_sentence = next_ist_sentence;
                next_assert_strength = NIL;
                next_assert_direction = NIL;
                if( NIL != error_strings )
                {
                  SubLObject cdolist_list_var_$6 = error_strings;
                  SubLObject error_string = NIL;
                  error_string = cdolist_list_var_$6.first();
                  while ( NIL != cdolist_list_var_$6)
                  {
                    error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, error_string ), error_lists );
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    error_string = cdolist_list_var_$6.first();
                  }
                }
                else
                {
                  ke_operations = ConsesLow.cons( ke_operation, ke_operations );
                }
              }
              else
              {
                error_lists = ConsesLow.cons( ConsesLow.list( filename, line_number_start, line_number_end, PrintLow.format( NIL, $str110$Unexpected_argument_for_predicate, directive ) ), error_lists );
              }
              cdolist_list_var = cdolist_list_var.rest();
              formula_args = cdolist_list_var.first();
            }
          }
        }
        csome_list_var = csome_list_var.rest();
        token_list = csome_list_var.first();
      }
    }
    return Values.values( Sequences.nreverse( ke_operations ), Sequences.nreverse( error_lists ), new_constant_names, killed_constant_names );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 53148L)
  public static SubLObject do_ke_operation(final SubLObject operation, SubLObject method)
  {
    if( method == UNPROVIDED )
    {
      method = $kw111$AGENDA;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject operation_type = operation.first();
    final SubLObject operation_args = operation.rest();
    final SubLObject pcase_var = operation_type;
    if( pcase_var.eql( $kw57$CREATE ) )
    {
      final SubLObject name = operation_args.first();
      final SubLObject pcase_var_$11 = method;
      if( pcase_var_$11.eql( $kw111$AGENDA ) )
      {
        operation_queues.add_to_local_queue( ConsesLow.list( $sym112$FI_CREATE, name ), UNPROVIDED );
        operation_queues.add_to_local_queue( ConsesLow.list( $sym113$FI_TIMESTAMP_CONSTANT, ConsesLow.list( $sym114$QUOTE, operation_communication.the_cyclist() ), ConsesLow.list( $sym114$QUOTE, fi.the_date() ),
            ConsesLow.list( $sym114$QUOTE, fi.ke_purpose() ), ConsesLow.list( $sym114$QUOTE, fi.the_second() ) ), UNPROVIDED );
        return NIL;
      }
      if( pcase_var_$11.eql( $kw115$NOW ) )
      {
        return ke.ke_create_now( name, UNPROVIDED );
      }
    }
    else if( pcase_var.eql( $kw47$ASSERT ) )
    {
      SubLObject formula = operation_args.first();
      SubLObject mt = conses_high.second( operation_args );
      final SubLObject strength = conses_high.third( operation_args );
      final SubLObject direction = conses_high.fourth( operation_args );
      if( NIL != list_utilities.tree_find( $kw76$NEW_CONSTANT, formula, UNPROVIDED, UNPROVIDED ) )
      {
        formula = ConsesLow.list( $sym116$RESOLVE_NEW_CONSTANTS, ConsesLow.list( $sym114$QUOTE, formula ) );
      }
      else
      {
        formula = ConsesLow.list( $sym114$QUOTE, formula );
      }
      if( NIL != list_utilities.tree_find( $kw76$NEW_CONSTANT, mt, UNPROVIDED, UNPROVIDED ) )
      {
        mt = ConsesLow.list( $sym116$RESOLVE_NEW_CONSTANTS, ConsesLow.list( $sym114$QUOTE, mt ) );
      }
      else
      {
        mt = ConsesLow.list( $sym114$QUOTE, mt );
      }
      final SubLObject pcase_var_$12 = method;
      if( pcase_var_$12.eql( $kw111$AGENDA ) )
      {
        operation_queues.add_to_local_queue( ConsesLow.list( $sym117$FI_ASSERT, formula, mt, strength, direction ), UNPROVIDED );
        operation_queues.add_to_local_queue( ConsesLow.list( $sym118$FI_TIMESTAMP_ASSERTION, ConsesLow.list( $sym114$QUOTE, operation_communication.the_cyclist() ), ConsesLow.list( $sym114$QUOTE, fi.the_date() ),
            ConsesLow.list( $sym114$QUOTE, fi.ke_purpose() ), ConsesLow.list( $sym114$QUOTE, fi.the_second() ) ), UNPROVIDED );
        return NIL;
      }
      if( pcase_var_$12.eql( $kw115$NOW ) )
      {
        formula = Eval.eval( formula );
        mt = Eval.eval( mt );
        return ke.ke_assert_now( formula, mt, strength, direction );
      }
    }
    else if( pcase_var.eql( $kw46$UNASSERT ) )
    {
      SubLObject formula = operation_args.first();
      SubLObject mt = conses_high.second( operation_args );
      if( NIL != list_utilities.tree_find( $kw76$NEW_CONSTANT, formula, UNPROVIDED, UNPROVIDED ) )
      {
        formula = ConsesLow.list( $sym116$RESOLVE_NEW_CONSTANTS, ConsesLow.list( $sym114$QUOTE, formula ) );
      }
      else
      {
        formula = ConsesLow.list( $sym114$QUOTE, formula );
      }
      if( NIL != list_utilities.tree_find( $kw76$NEW_CONSTANT, mt, UNPROVIDED, UNPROVIDED ) )
      {
        mt = ConsesLow.list( $sym116$RESOLVE_NEW_CONSTANTS, ConsesLow.list( $sym114$QUOTE, mt ) );
      }
      else
      {
        mt = ConsesLow.list( $sym114$QUOTE, mt );
      }
      final SubLObject pcase_var_$13 = method;
      if( pcase_var_$13.eql( $kw111$AGENDA ) )
      {
        operation_queues.add_to_local_queue( ConsesLow.list( $sym119$FI_UNASSERT, formula, mt ), UNPROVIDED );
        return NIL;
      }
      if( pcase_var_$13.eql( $kw115$NOW ) )
      {
        formula = Eval.eval( formula );
        mt = Eval.eval( mt );
        return ke.ke_unassert_now( formula, mt );
      }
    }
    else if( pcase_var.eql( $kw65$RENAME ) )
    {
      SubLObject constant = operation_args.first();
      final SubLObject name2 = conses_high.second( operation_args );
      SubLObject quoted_constant = NIL;
      SubLObject old_name = NIL;
      if( NIL != list_utilities.tree_find( $kw76$NEW_CONSTANT, constant, UNPROVIDED, UNPROVIDED ) )
      {
        quoted_constant = ConsesLow.list( $sym116$RESOLVE_NEW_CONSTANTS, ConsesLow.list( $sym114$QUOTE, constant ) );
        constant = NIL;
      }
      else
      {
        old_name = constants_high.constant_name( constant );
        quoted_constant = ConsesLow.list( $sym114$QUOTE, constant );
      }
      final SubLObject pcase_var_$14 = method;
      if( pcase_var_$14.eql( $kw111$AGENDA ) )
      {
        operation_queues.add_to_local_queue( ConsesLow.list( $sym120$FI_RENAME, quoted_constant, name2 ), UNPROVIDED );
        if( NIL != constant && NIL != ke.$note_old_constant_name$.getDynamicValue( thread ) && old_name.isString() )
        {
          if( NIL != kb_mapping_utilities.some_pred_value_in_mt( constant, $const121$oldConstantName, $const122$BookkeepingMt, UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym123$RELEVANT_MT_IS_EQ, thread );
              mt_relevance_macros.$mt$.bind( $const122$BookkeepingMt, thread );
              final SubLObject pred_var = $const121$oldConstantName;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( constant, ONE_INTEGER, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( constant, ONE_INTEGER, pred_var );
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw124$GAF, NIL, NIL );
                      SubLObject done_var_$15 = NIL;
                      final SubLObject token_var_$16 = NIL;
                      while ( NIL == done_var_$15)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$16 );
                        final SubLObject valid_$17 = makeBoolean( !token_var_$16.eql( assertion ) );
                        if( NIL != valid_$17 )
                        {
                          final SubLObject old_formula = ke.ke_assertion_find_formula( assertion );
                          final SubLObject old_mt = assertions_high.assertion_mt( assertion );
                          if( NIL != old_formula && NIL != old_mt )
                          {
                            operation_queues.add_to_local_queue( ConsesLow.list( $sym119$FI_UNASSERT, ConsesLow.list( $sym114$QUOTE, old_formula ), ConsesLow.list( $sym114$QUOTE, old_mt ) ), UNPROVIDED );
                          }
                        }
                        done_var_$15 = makeBoolean( NIL == valid_$17 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
              }
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
            }
          }
          operation_queues.add_to_local_queue( ConsesLow.listS( $sym117$FI_ASSERT, ConsesLow.list( $sym114$QUOTE, ConsesLow.list( $const121$oldConstantName, constant, old_name ) ), $list125 ), UNPROVIDED );
          operation_queues.add_to_local_queue( ConsesLow.list( $sym118$FI_TIMESTAMP_ASSERTION, ConsesLow.list( $sym114$QUOTE, operation_communication.the_cyclist() ), ConsesLow.list( $sym114$QUOTE, fi.the_date() ),
              ConsesLow.list( $sym114$QUOTE, fi.ke_purpose() ), ConsesLow.list( $sym114$QUOTE, fi.the_second() ) ), UNPROVIDED );
        }
        return NIL;
      }
      if( pcase_var_$14.eql( $kw115$NOW ) )
      {
        constant = Eval.eval( quoted_constant );
        return ke.ke_rename_now( constant, name2 );
      }
    }
    else if( pcase_var.eql( $kw59$KILL ) )
    {
      SubLObject constant = operation_args.first();
      if( NIL != list_utilities.tree_find( $kw76$NEW_CONSTANT, constant, UNPROVIDED, UNPROVIDED ) )
      {
        constant = ConsesLow.list( $sym116$RESOLVE_NEW_CONSTANTS, ConsesLow.list( $sym114$QUOTE, constant ) );
      }
      else
      {
        constant = ConsesLow.list( $sym114$QUOTE, constant );
      }
      final SubLObject pcase_var_$15 = method;
      if( pcase_var_$15.eql( $kw111$AGENDA ) )
      {
        operation_queues.add_to_local_queue( ConsesLow.list( $sym126$FI_KILL, constant ), UNPROVIDED );
        return NIL;
      }
      if( pcase_var_$15.eql( $kw115$NOW ) )
      {
        return ke.ke_kill_now( constant );
      }
    }
    else
    {
      if( !pcase_var.eql( $kw78$MERGE ) )
      {
        return NIL;
      }
      SubLObject kill_fort = operation_args.first();
      SubLObject keep_fort = conses_high.second( operation_args );
      if( NIL != list_utilities.tree_find( $kw76$NEW_CONSTANT, kill_fort, UNPROVIDED, UNPROVIDED ) )
      {
        kill_fort = ConsesLow.list( $sym116$RESOLVE_NEW_CONSTANTS, ConsesLow.list( $sym114$QUOTE, kill_fort ) );
      }
      else
      {
        kill_fort = ConsesLow.list( $sym114$QUOTE, kill_fort );
      }
      if( NIL != list_utilities.tree_find( $kw76$NEW_CONSTANT, keep_fort, UNPROVIDED, UNPROVIDED ) )
      {
        keep_fort = ConsesLow.list( $sym116$RESOLVE_NEW_CONSTANTS, ConsesLow.list( $sym114$QUOTE, keep_fort ) );
      }
      else
      {
        keep_fort = ConsesLow.list( $sym114$QUOTE, keep_fort );
      }
      final SubLObject pcase_var_$16 = method;
      if( pcase_var_$16.eql( $kw111$AGENDA ) )
      {
        operation_queues.add_to_local_queue( ConsesLow.list( $sym127$FI_MERGE, kill_fort, keep_fort ), UNPROVIDED );
        return NIL;
      }
      if( pcase_var_$16.eql( $kw115$NOW ) )
      {
        kill_fort = Eval.eval( kill_fort );
        keep_fort = Eval.eval( keep_fort );
        return ke.ke_merge_now( kill_fort, keep_fort );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 58115L)
  public static SubLObject new_constant_wrapperp(final SubLObject possible_wrapper)
  {
    if( possible_wrapper.isCons() && $kw76$NEW_CONSTANT.equal( possible_wrapper.first() ) && TWO_INTEGER.eql( Sequences.length( possible_wrapper ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 58465L)
  public static SubLObject make_new_constant_wrapper(final SubLObject new_constant_name)
  {
    return ConsesLow.list( $kw76$NEW_CONSTANT, new_constant_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 58573L)
  public static SubLObject resolve_new_constants(final SubLObject expr)
  {
    if( expr.isAtom() )
    {
      return expr;
    }
    if( !expr.first().eql( $kw76$NEW_CONSTANT ) )
    {
      return ConsesLow.cons( resolve_new_constants( expr.first() ), resolve_new_constants( expr.rest() ) );
    }
    final SubLObject second_expr = conses_high.second( expr );
    if( NIL != constant_handles.constant_p( second_expr ) )
    {
      return second_expr;
    }
    if( second_expr.isString() )
    {
      final SubLObject the_constant = ket_maybe_find_constant( second_expr );
      if( NIL != the_constant )
      {
        return the_constant;
      }
      Errors.error( $str128$Constant_does_not_exist___A_, second_expr );
    }
    else
    {
      Errors.error( $str129$_new_constant_must_be_followed_by );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 59534L)
  public static SubLObject ke_text_list_to_ke_operations(final SubLObject ke_text_list, SubLObject filename, SubLObject new_constant_names, SubLObject killed_constant_names)
  {
    if( filename == UNPROVIDED )
    {
      filename = NIL;
    }
    if( new_constant_names == UNPROVIDED )
    {
      new_constant_names = NIL;
    }
    if( killed_constant_names == UNPROVIDED )
    {
      killed_constant_names = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject token_lists = ke_text_list_to_token_lists( ke_text_list, filename );
    final SubLObject error_lists = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error_lists )
    {
      return Values.values( NIL, error_lists );
    }
    thread.resetMultipleValues();
    final SubLObject ke_operations = ke_text_token_lists_to_ke_operations( token_lists, new_constant_names, killed_constant_names );
    final SubLObject error_lists_$21 = thread.secondMultipleValue();
    final SubLObject new_constant_names_$22 = thread.thirdMultipleValue();
    final SubLObject killed_constant_names_$23 = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return Values.values( ke_operations, error_lists_$21, new_constant_names_$22, killed_constant_names_$23 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 60221L)
  public static SubLObject ke_text_file_to_ke_text_list(final SubLObject ke_text_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ke_text_list = NIL;
    SubLObject error_list = NIL;
    if( !ke_text_filename.isString() )
    {
      return Values.values( NIL, ConsesLow.list( reader.bq_cons( ke_text_filename, $list130 ) ) );
    }
    if( NIL != string_utilities.null_stringP( ke_text_filename ) )
    {
      return Values.values( NIL, ConsesLow.list( reader.bq_cons( ke_text_filename, $list131 ) ) );
    }
    if( NIL == Filesys.probe_file( ke_text_filename ) )
    {
      return Values.values( NIL, ConsesLow.list( ConsesLow.list( ke_text_filename, ZERO_INTEGER, ZERO_INTEGER, file_utilities.why_not_probe_fileP( ke_text_filename ) ) ) );
    }
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( ke_text_filename, $kw132$INPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str133$Unable_to_open__S, ke_text_filename );
      }
      final SubLObject ke_text_stream = stream;
      thread.resetMultipleValues();
      final SubLObject ke_text_list_$24 = ke_text_to_ke_text_list_internal( ke_text_stream, ke_text_filename );
      final SubLObject error_list_$25 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      ke_text_list = ke_text_list_$24;
      error_list = error_list_$25;
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
    return Values.values( ke_text_list, error_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 61243L)
  public static SubLObject ke_text_to_ke_text_list(final SubLObject content, final SubLObject ke_text_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ke_text_list = NIL;
    SubLObject error_list = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_input_stream( content, ZERO_INTEGER, NIL );
      thread.resetMultipleValues();
      final SubLObject ke_text_list_$26 = ke_text_to_ke_text_list_internal( stream, ke_text_file );
      final SubLObject error_list_$27 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      ke_text_list = ke_text_list_$26;
      error_list = error_list_$27;
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( ke_text_list, error_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 61556L)
  public static SubLObject ke_text_to_ke_text_list_internal(final SubLObject stream, SubLObject source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ke_text_list = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym134$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject text_line;
          for( text_line = NIL, text_line = streams_high.read_line( stream, NIL, UNPROVIDED, UNPROVIDED ); text_line != $kw135$EOF && NIL != text_line; text_line = streams_high.read_line( stream, NIL, UNPROVIDED,
              UNPROVIDED ) )
          {
            ke_text_list = ConsesLow.cons( text_line, ke_text_list );
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      return Values.values( NIL, ConsesLow.list( ConsesLow.list( source, ZERO_INTEGER, ZERO_INTEGER, error_message ) ) );
    }
    return Values.values( Sequences.nreverse( ke_text_list ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 62068L)
  public static SubLObject ke_operations_new_killed_renamed_merged_constant_names(final SubLObject ke_operations)
  {
    SubLObject new_killed_renamed_merged_constants = NIL;
    SubLObject new_constantsP = NIL;
    SubLObject killed_constantsP = NIL;
    SubLObject renamed_constantsP = NIL;
    SubLObject merged_constantsP = NIL;
    SubLObject cdolist_list_var = ke_operations;
    SubLObject ke_operation = NIL;
    ke_operation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject operation_type = ke_operation.first();
      SubLObject operation_arg1 = conses_high.second( ke_operation );
      SubLObject operation_arg2 = conses_high.third( ke_operation );
      if( NIL != new_constant_wrapperp( operation_arg1 ) )
      {
        operation_arg1 = conses_high.second( operation_arg1 );
      }
      if( NIL != new_constant_wrapperp( operation_arg2 ) )
      {
        operation_arg2 = conses_high.second( operation_arg2 );
      }
      final SubLObject pcase_var = operation_type;
      if( pcase_var.eql( $kw57$CREATE ) )
      {
        new_constantsP = T;
        new_killed_renamed_merged_constants = ConsesLow.cons( ConsesLow.list( $kw57$CREATE, NIL, operation_arg1 ), new_killed_renamed_merged_constants );
      }
      else if( pcase_var.eql( $kw59$KILL ) )
      {
        killed_constantsP = T;
        new_killed_renamed_merged_constants = ConsesLow.cons( ConsesLow.listS( $kw59$KILL, operation_arg1, $list136 ), new_killed_renamed_merged_constants );
      }
      else if( pcase_var.eql( $kw65$RENAME ) )
      {
        renamed_constantsP = T;
        new_killed_renamed_merged_constants = ConsesLow.cons( ConsesLow.list( $kw65$RENAME, operation_arg1, operation_arg2 ), new_killed_renamed_merged_constants );
      }
      else if( pcase_var.eql( $kw78$MERGE ) )
      {
        merged_constantsP = T;
        new_killed_renamed_merged_constants = ConsesLow.cons( ConsesLow.list( $kw78$MERGE, operation_arg1, operation_arg2 ), new_killed_renamed_merged_constants );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ke_operation = cdolist_list_var.first();
    }
    new_killed_renamed_merged_constants = Sequences.nreverse( new_killed_renamed_merged_constants );
    return Values.values( new_killed_renamed_merged_constants, new_constantsP, killed_constantsP, renamed_constantsP, merged_constantsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 63540L)
  public static SubLObject ke_text_error_message(final SubLObject error_list)
  {
    SubLObject error_message = $str137$;
    final SubLObject error_file = error_list.first();
    final SubLObject error_line_number_start = conses_high.second( error_list );
    final SubLObject error_line_number_end = conses_high.third( error_list );
    final SubLObject error_string = conses_high.fourth( error_list );
    if( NIL != error_file )
    {
      error_message = Sequences.cconcatenate( error_message, PrintLow.format( NIL, $str138$_A__, error_file ) );
    }
    if( NIL != error_line_number_start )
    {
      if( NIL != error_line_number_end )
      {
        error_message = Sequences.cconcatenate( error_message, PrintLow.format( NIL, $str139$_A__A__, error_line_number_start, error_line_number_end ) );
      }
      else
      {
        error_message = Sequences.cconcatenate( error_message, PrintLow.format( NIL, $str140$_A___, error_line_number_start ) );
      }
    }
    else if( NIL != error_line_number_end )
    {
      error_message = Sequences.cconcatenate( error_message, PrintLow.format( NIL, $str141$__A__, error_line_number_end ) );
    }
    else
    {
      error_message = Sequences.cconcatenate( error_message, PrintLow.format( NIL, $str142$___ ) );
    }
    error_message = Sequences.cconcatenate( error_message, PrintLow.format( NIL, $str143$_A, error_string ) );
    return error_message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 64514L)
  public static SubLObject format_el_sentence_as_ke_text(final SubLObject stream, final SubLObject el_sentence)
  {
    PrintLow.format( stream, $str144$el_ );
    format_cycl_expression.format_cycl_expression( el_sentence, stream, UNPROVIDED );
    PrintLow.format( stream, $str145$____ );
    return el_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 64717L)
  public static SubLObject load_ke_text_file(final SubLObject cyclist, final SubLObject filename, SubLObject method, SubLObject no_user_interactionP, SubLObject verbosity)
  {
    if( method == UNPROVIDED )
    {
      method = $kw111$AGENDA;
    }
    if( no_user_interactionP == UNPROVIDED )
    {
      no_user_interactionP = T;
    }
    if( verbosity == UNPROVIDED )
    {
      verbosity = $kw146$NORMAL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( filename, $sym147$STRINGP );
    final SubLObject the_cyclist = cyclist.isString() ? constants_high.find_constant( cyclist ) : cyclist;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym103$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const104$EverythingPSC, thread );
      if( NIL == kb_accessors.cyclistP( the_cyclist ) )
      {
        PrintLow.format( T, $str148$__Sorry___s_is_not_known_to_be_a_, cyclist );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    final SubLObject old_cyclist = operation_communication.the_cyclist();
    try
    {
      operation_communication.set_the_cyclist( the_cyclist );
      thread.resetMultipleValues();
      final SubLObject ke_text_list = ke_text_file_to_ke_text_list( filename );
      final SubLObject error_lists = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != error_lists )
      {
        SubLObject cdolist_list_var = error_lists;
        SubLObject error_list = NIL;
        error_list = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( T, $str149$_A__, ke_text_error_message( error_list ) );
          cdolist_list_var = cdolist_list_var.rest();
          error_list = cdolist_list_var.first();
        }
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject ke_operations = ke_text_list_to_ke_operations( ke_text_list, filename, UNPROVIDED, UNPROVIDED );
        final SubLObject error_lists_$28 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != error_lists_$28 )
        {
          SubLObject cdolist_list_var2 = error_lists_$28;
          SubLObject error_list2 = NIL;
          error_list2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            PrintLow.format( T, $str149$_A__, ke_text_error_message( error_list2 ) );
            cdolist_list_var2 = cdolist_list_var2.rest();
            error_list2 = cdolist_list_var2.first();
          }
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject new_killed_renamed_merged_constants = ke_operations_new_killed_renamed_merged_constant_names( ke_operations );
          final SubLObject new_constantsP = thread.secondMultipleValue();
          final SubLObject killed_constantsP = thread.thirdMultipleValue();
          final SubLObject renamed_constantsP = thread.fourthMultipleValue();
          final SubLObject merged_constantsP = thread.fifthMultipleValue();
          thread.resetMultipleValues();
          SubLObject string_list = NIL;
          SubLObject filler_list = NIL;
          if( NIL != merged_constantsP )
          {
            string_list = ConsesLow.cons( $str150$merged, string_list );
          }
          if( NIL != renamed_constantsP )
          {
            string_list = ConsesLow.cons( $str151$renamed, string_list );
          }
          if( NIL != killed_constantsP )
          {
            string_list = ConsesLow.cons( $str152$killed, string_list );
          }
          if( NIL != new_constantsP )
          {
            string_list = ConsesLow.cons( $str153$created, string_list );
          }
          final SubLObject pcase_var = Sequences.length( string_list );
          if( pcase_var.eql( TWO_INTEGER ) )
          {
            filler_list = $list154;
          }
          else if( pcase_var.eql( THREE_INTEGER ) )
          {
            filler_list = $list155;
          }
          else if( pcase_var.eql( FOUR_INTEGER ) )
          {
            filler_list = $list156;
          }
          if( verbosity != $kw157$QUIET )
          {
            if( NIL != string_list )
            {
              PrintLow.format( T, $str158$The_following_constants_will_be_ );
              SubLObject string = NIL;
              SubLObject string_$29 = NIL;
              SubLObject filler = NIL;
              SubLObject filler_$30 = NIL;
              string = string_list;
              string_$29 = string.first();
              filler = filler_list;
              filler_$30 = filler.first();
              while ( NIL != filler || NIL != string)
              {
                if( NIL != string_$29 )
                {
                  PrintLow.format( T, string_$29 );
                }
                if( NIL != filler_$30 )
                {
                  PrintLow.format( T, filler_$30 );
                }
                string = string.rest();
                string_$29 = string.first();
                filler = filler.rest();
                filler_$30 = filler.first();
              }
              PrintLow.format( T, $str159$_ );
            }
            PrintLow.format( T, $str160$__ );
            SubLObject cdolist_list_var3 = new_killed_renamed_merged_constants;
            SubLObject new_killed_renamed_constant = NIL;
            new_killed_renamed_constant = cdolist_list_var3.first();
            while ( NIL != cdolist_list_var3)
            {
              final SubLObject operation_type = new_killed_renamed_constant.first();
              final SubLObject column1 = conses_high.second( new_killed_renamed_constant );
              final SubLObject column2 = conses_high.third( new_killed_renamed_constant );
              final SubLObject pcase_var2 = operation_type;
              if( pcase_var2.eql( $kw57$CREATE ) )
              {
                PrintLow.format( T, $str161$__Create___A__, column2 );
              }
              else if( pcase_var2.eql( $kw59$KILL ) )
              {
                PrintLow.format( T, $str162$__Kill___A__, column1 );
              }
              else if( pcase_var2.eql( $kw65$RENAME ) )
              {
                PrintLow.format( T, $str163$__Rename___A_to__A__, column1, column2 );
              }
              cdolist_list_var3 = cdolist_list_var3.rest();
              new_killed_renamed_constant = cdolist_list_var3.first();
            }
          }
          if( verbosity != $kw157$QUIET )
          {
            SubLObject cdolist_list_var2 = ke_operations;
            SubLObject ke_operation = NIL;
            ke_operation = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              print_high.print( ke_operation, UNPROVIDED );
              cdolist_list_var2 = cdolist_list_var2.rest();
              ke_operation = cdolist_list_var2.first();
            }
          }
          final SubLObject num_ops = Sequences.length( ke_operations );
          SubLObject cur_op = ZERO_INTEGER;
          final SubLObject _prev_bind_3 = utilities_macros.$silent_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$silent_progressP$.bind( Equality.eq( verbosity, $kw157$QUIET ), thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( PrintLow.format( NIL, $str164$Evaluating__A_forms_____, num_ops ) );
              SubLObject cdolist_list_var3 = ke_operations;
              SubLObject ke_operation2 = NIL;
              ke_operation2 = cdolist_list_var3.first();
              while ( NIL != cdolist_list_var3)
              {
                cur_op = Numbers.add( cur_op, ONE_INTEGER );
                utilities_macros.note_percent_progress( cur_op, num_ops );
                if( NIL != $ke_text_failures_log_file$.getDynamicValue( thread ) )
                {
                  SubLObject stream = NIL;
                  try
                  {
                    final SubLObject _prev_bind_0_$31 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                    try
                    {
                      stream_macros.$stream_requires_locking$.bind( NIL, thread );
                      stream = compatibility.open_text( $ke_text_failures_log_file$.getDynamicValue( thread ), $kw165$APPEND );
                    }
                    finally
                    {
                      stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$31, thread );
                    }
                    if( !stream.isStream() )
                    {
                      Errors.error( $str133$Unable_to_open__S, $ke_text_failures_log_file$.getDynamicValue( thread ) );
                    }
                    final SubLObject s = stream;
                    thread.resetMultipleValues();
                    final SubLObject result = do_ke_operation( ke_operation2, method );
                    final SubLObject error = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != error )
                    {
                      PrintLow.format( s, $str143$_A, error );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
                    }
                  }
                }
                else
                {
                  do_ke_operation( ke_operation2, method );
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                ke_operation2 = cdolist_list_var3.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_7, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_5, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_4, thread );
            utilities_macros.$silent_progressP$.rebind( _prev_bind_3, thread );
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        operation_communication.set_the_cyclist( old_cyclist );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_8, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 68367L)
  public static SubLObject parse_ke_text_string(final SubLObject ke_text_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ke_text_list = string_utilities.string_tokenize( ke_text_string, ConsesLow.list( Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject ke_operations = ke_text_list_to_ke_operations( ke_text_list, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject error_lists = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return list_utilities.make_plist( $list170, ConsesLow.list( ke_operations, error_lists ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-text.lisp", position = 68714L)
  public static SubLObject load_ke_text_string(final SubLObject ke_text_string, SubLObject method)
  {
    if( method == UNPROVIDED )
    {
      method = $kw111$AGENDA;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject errors = NIL;
    final SubLObject parse = parse_ke_text_string( ke_text_string );
    final SubLObject ke_operations = conses_high.getf( parse, $kw171$KE_OPERATIONS, UNPROVIDED );
    final SubLObject error_lists = conses_high.getf( parse, $kw172$ERROR_LISTS, UNPROVIDED );
    SubLObject results = NIL;
    if( NIL == error_lists )
    {
      SubLObject cdolist_list_var = ke_operations;
      SubLObject ke_operation = NIL;
      ke_operation = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject result = do_ke_operation( ke_operation, method );
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        results = ConsesLow.cons( result, results );
        if( NIL != error )
        {
          errors = ConsesLow.cons( error, errors );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ke_operation = cdolist_list_var.first();
      }
    }
    return list_utilities.make_plist( $list173, ConsesLow.list( ke_operations, error_lists, errors ) );
  }

  public static SubLObject declare_ke_text_file()
  {
    SubLFiles.declareMacro( me, "with_ke_text_failures_to_file", "WITH-KE-TEXT-FAILURES-TO-FILE" );
    SubLFiles.declareFunction( me, "ke_text_list_to_token_lists", "KE-TEXT-LIST-TO-TOKEN-LISTS", 1, 1, false );
    SubLFiles.declareFunction( me, "ket_lookup_string", "KET-LOOKUP-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "ket_directive_list_to_directive", "KET-DIRECTIVE-LIST-TO-DIRECTIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "ket_relevant_mt", "KET-RELEVANT-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "ket_relevant_strength", "KET-RELEVANT-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "ket_relevant_direction", "KET-RELEVANT-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "ket_unknown_to_known", "KET-UNKNOWN-TO-KNOWN", 1, 2, false );
    SubLFiles.declareFunction( me, "ket_maybe_find_constant", "KET-MAYBE-FIND-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "ket_make_ke_operation", "KET-MAKE-KE-OPERATION", 2, 6, false );
    SubLFiles.declareFunction( me, "ke_text_token_lists_to_ke_operations", "KE-TEXT-TOKEN-LISTS-TO-KE-OPERATIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "do_ke_operation", "DO-KE-OPERATION", 1, 1, false );
    SubLFiles.declareFunction( me, "new_constant_wrapperp", "NEW-CONSTANT-WRAPPERP", 1, 0, false );
    SubLFiles.declareFunction( me, "make_new_constant_wrapper", "MAKE-NEW-CONSTANT-WRAPPER", 1, 0, false );
    SubLFiles.declareFunction( me, "resolve_new_constants", "RESOLVE-NEW-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_text_list_to_ke_operations", "KE-TEXT-LIST-TO-KE-OPERATIONS", 1, 3, false );
    SubLFiles.declareFunction( me, "ke_text_file_to_ke_text_list", "KE-TEXT-FILE-TO-KE-TEXT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_text_to_ke_text_list", "KE-TEXT-TO-KE-TEXT-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_text_to_ke_text_list_internal", "KE-TEXT-TO-KE-TEXT-LIST-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_operations_new_killed_renamed_merged_constant_names", "KE-OPERATIONS-NEW-KILLED-RENAMED-MERGED-CONSTANT-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_text_error_message", "KE-TEXT-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "format_el_sentence_as_ke_text", "FORMAT-EL-SENTENCE-AS-KE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "load_ke_text_file", "LOAD-KE-TEXT-FILE", 2, 3, false );
    SubLFiles.declareFunction( me, "parse_ke_text_string", "PARSE-KE-TEXT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "load_ke_text_string", "LOAD-KE-TEXT-STRING", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_ke_text_file()
  {
    $ke_text_error_count_abort_num$ = SubLFiles.defparameter( "*KE-TEXT-ERROR-COUNT-ABORT-NUM*", TEN_INTEGER );
    $ke_text_failures_log_file$ = SubLFiles.defparameter( "*KE-TEXT-FAILURES-LOG-FILE*", NIL );
    $ket_string_to_directive$ = SubLFiles.defparameter( "*KET-STRING-TO-DIRECTIVE*", $list16 );
    $ket_string_to_direction$ = SubLFiles.defparameter( "*KET-STRING-TO-DIRECTION*", $list17 );
    $ket_string_to_strength$ = SubLFiles.defparameter( "*KET-STRING-TO-STRENGTH*", $list18 );
    return NIL;
  }

  public static SubLObject setup_ke_text_file()
  {
    utilities_macros.register_cyc_api_function( $sym166$LOAD_KE_TEXT_FILE, $list167, $str168$Call_the_ke_text_engine_on_a_file, $list169, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ke_text_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ke_text_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ke_text_file();
  }
  static
  {
    me = new ke_text();
    $ke_text_error_count_abort_num$ = null;
    $ke_text_failures_log_file$ = null;
    $ket_string_to_directive$ = null;
    $ket_string_to_direction$ = null;
    $ket_string_to_strength$ = null;
    $list0 = ConsesLow.list( makeSymbol( "FILENAME" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$PIF = makeSymbol( "PIF" );
    $sym2$FILE_VALID_FOR_WRITING_P = makeSymbol( "FILE-VALID-FOR-WRITING-P" );
    $sym3$CLET = makeSymbol( "CLET" );
    $sym4$_KE_TEXT_FAILURES_LOG_FILE_ = makeSymbol( "*KE-TEXT-FAILURES-LOG-FILE*" );
    $sym5$PROGN = makeSymbol( "PROGN" );
    $sym6$WARN = makeSymbol( "WARN" );
    $str7$Unable_to_log_failures_to__S_beca = makeString( "Unable to log failures to ~S because file is not writeable.  Continuing without logging." );
    $kw8$END_OF_DIRECTIVE = makeKeyword( "END-OF-DIRECTIVE" );
    $list9 = ConsesLow.list( makeString( "Aborting: Too many errors found" ) );
    $str10$Too_many_close_parenthesis_on_lin = makeString( "Too many close parenthesis on line ~A" );
    $kw11$END_OF_DATA = makeKeyword( "END-OF-DATA" );
    $list12 = ConsesLow.list( makeString( "Missing directive" ) );
    $str13$Missing_data_for_directive__A = makeString( "Missing data for directive ~A" );
    $str14$Unclosed_open_parenthesis_on_line = makeString( "Unclosed open parenthesis on line ~A" );
    $str15$Unfinished_expression_at_end_of_f = makeString( "Unfinished expression at end of file" );
    $list16 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeString( "constant" ), makeKeyword( "CONSTANT" ) ), ConsesLow.cons( makeString( "collection" ), makeKeyword( "CONSTANT" ) ), ConsesLow.cons( makeString(
        "individual" ), makeKeyword( "CONSTANT" ) ), ConsesLow.cons( makeString( "function" ), makeKeyword( "CONSTANT" ) ), ConsesLow.cons( makeString( "microtheory" ), makeKeyword( "CONSTANT" ) ), ConsesLow.cons(
            makeString( "unit" ), makeKeyword( "CONSTANT" ) ), ConsesLow.cons( makeString( "formula" ), makeKeyword( "FORMULA" ) ), ConsesLow.cons( makeString( "f" ), makeKeyword( "FORMULA" ) ), ConsesLow.cons(
                makeString( "el" ), makeKeyword( "FORMULA" ) ), ConsesLow.cons( makeString( "enter" ), makeKeyword( "ENTER" ) ), ConsesLow.cons( makeString( "delete" ), makeKeyword( "DELETE" ) ), ConsesLow.cons(
                    makeString( "assert" ), makeKeyword( "ENTER" ) ), ConsesLow.cons( makeString( "unassert" ), makeKeyword( "DELETE" ) ), ConsesLow.cons( makeString( "in mt" ), makeKeyword( "IN-MT" ) ), ConsesLow.cons(
                        makeString( "mt" ), makeKeyword( "IN-MT" ) ), ConsesLow.cons( makeString( "default mt" ), makeKeyword( "DEFAULT-MT" ) ), ConsesLow.cons( makeString( "direction" ), makeKeyword( "DIRECTION" ) ),
      ConsesLow.cons( makeString( "d" ), makeKeyword( "DIRECTION" ) ), ConsesLow.cons( makeString( "al" ), makeKeyword( "DIRECTION" ) ), ConsesLow.cons( makeString( "access level" ), makeKeyword( "DIRECTION" ) ),
      ConsesLow.cons( makeString( "strength" ), makeKeyword( "STRENGTH" ) ), ConsesLow.cons( makeString( "truth value" ), makeKeyword( "STRENGTH" ) ), ConsesLow.cons( makeString( "tv" ), makeKeyword( "STRENGTH" ) ),
      ConsesLow.cons( makeString( "kill" ), makeKeyword( "KILL" ) ), ConsesLow.cons( makeString( "rename" ), makeKeyword( "RENAME" ) ), ConsesLow.cons( makeString( "merge" ), makeKeyword( "MERGE" ) )
    } );
    $list17 = ConsesLow.list( ConsesLow.cons( makeString( "forward" ), makeKeyword( "FORWARD" ) ), ConsesLow.cons( makeString( "0" ), makeKeyword( "FORWARD" ) ), ConsesLow.cons( makeString( "backward" ), makeKeyword(
        "BACKWARD" ) ), ConsesLow.cons( makeString( "4" ), makeKeyword( "BACKWARD" ) ), ConsesLow.cons( makeString( "code" ), makeKeyword( "CODE" ) ), ConsesLow.cons( makeString( "unknown" ), makeKeyword(
            "UNKNOWN" ) ) );
    $list18 = ConsesLow.list( ConsesLow.cons( makeString( "default" ), makeKeyword( "DEFAULT" ) ), ConsesLow.cons( makeString( "monotonic" ), makeKeyword( "MONOTONIC" ) ), ConsesLow.cons( makeString( "unknown" ),
        makeKeyword( "UNKNOWN" ) ) );
    $kw19$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw20$DEFAULT = makeKeyword( "DEFAULT" );
    $const21$DefaultMonotonicPredicate = constant_handles.reader_make_constant_shell( makeString( "DefaultMonotonicPredicate" ) );
    $kw22$FORWARD = makeKeyword( "FORWARD" );
    $kw23$BACKWARD = makeKeyword( "BACKWARD" );
    $kw24$CODE = makeKeyword( "CODE" );
    $str25$Something_is_nil = makeString( "Something is nil" );
    $str26$Bad_reference_to_a_killed_or_rena = makeString( "Bad reference to a killed or renamed constant (~A)" );
    $str27$A_single_colon_is_an_invalid_keyw = makeString( "A single colon is an invalid keyword name" );
    $str28$A_single_question_mark_is_an_inva = makeString( "A single question mark is an invalid variable name" );
    $list29 = ConsesLow.list( Characters.CHAR_quotation );
    $str30$Malformed_string = makeString( "Malformed string" );
    $str31$Gratutuious_single_quote = makeString( "Gratutuious single quote" );
    $kw32$DOT_FOR_DOTTED_LIST = makeKeyword( "DOT-FOR-DOTTED-LIST" );
    $str33$Bad_number___A_ = makeString( "Bad number (~A)" );
    $str34$nil = makeString( "nil" );
    $str35$t = makeString( "t" );
    $str36$Constant_not_found___A_ = makeString( "Constant not found (~A)" );
    $str37$Couldn_t_figure_out_string___A___ = makeString( "Couldn't figure out string (~A) (did you forget a period?)" );
    $str38$Couldn_t_figure_out___A_ = makeString( "Couldn't figure out (~A)" );
    $kw39$ENTER = makeKeyword( "ENTER" );
    $str40$TheAssertionSentence = makeString( "TheAssertionSentence" );
    $str41$__TheAssertionSentence = makeString( "#$TheAssertionSentence" );
    $str42$Formula____TheAssertionSentence_i = makeString( "Formula: #$TheAssertionSentence is not yet set" );
    $str43$Microtheory_not_specified = makeString( "Microtheory not specified" );
    $str44$Invalid_dotted_list = makeString( "Invalid dotted list" );
    $kw45$DELETE = makeKeyword( "DELETE" );
    $kw46$UNASSERT = makeKeyword( "UNASSERT" );
    $kw47$ASSERT = makeKeyword( "ASSERT" );
    $list48 = ConsesLow.list( makeString( "Unknown directive" ) );
    $kw49$FORMULA = makeKeyword( "FORMULA" );
    $list50 = ConsesLow.list( makeString( "Formula: No formula specified" ) );
    $list51 = ConsesLow.list( makeString( "Formula: Formula specified must be a list" ) );
    $kw52$CONSTANT = makeKeyword( "CONSTANT" );
    $list53 = ConsesLow.list( makeString( "Constant: No constant specified" ) );
    $list54 = ConsesLow.list( makeString( "Constant: Only one constant may be specified" ) );
    $list55 = ConsesLow.list( makeString( "Constant: Invalid constant name" ) );
    $str56$Constant__Constant_already_exists = makeString( "Constant: Constant already exists with different case: ~A" );
    $kw57$CREATE = makeKeyword( "CREATE" );
    $str58$Constant__Unrecognized_constant__ = makeString( "Constant: Unrecognized constant (~A)" );
    $kw59$KILL = makeKeyword( "KILL" );
    $list60 = ConsesLow.list( makeString( "Kill: No constant specified" ) );
    $list61 = ConsesLow.list( makeString( "Kill: Only one constant may be specified" ) );
    $list62 = ConsesLow.list( makeString( "Kill: Can't kill a NART." ) );
    $list63 = ConsesLow.list( makeString( "Kill: Constant name must be a string." ) );
    $list64 = ConsesLow.list( makeString( "Kill: Constant already killed." ) );
    $kw65$RENAME = makeKeyword( "RENAME" );
    $list66 = ConsesLow.list( makeString( "Rename: Nothing to rename" ) );
    $list67 = ConsesLow.list( makeString( "Rename: Old constant name not specified" ) );
    $list68 = ConsesLow.list( makeString( "Rename: Can't rename NATs" ) );
    $list69 = ConsesLow.list( makeString( "Rename: Old constant name must be a string" ) );
    $str70$Rename__Can_t_rename_a_constant_r = makeString( "Rename: Can't rename a constant recently killed or renamed (~A)" );
    $list71 = ConsesLow.list( makeString( "Rename: New constant name must be a string" ) );
    $list72 = ConsesLow.list( makeString( "Rename: New constant name must be a string inside double quotes." ) );
    $list73 = ConsesLow.list( makeString( "Rename: New constant name is not a valid name for a constant." ) );
    $str74$Rename__Can_t_rename_to_constant_ = makeString( "Rename: Can't rename to constant recently created (~A)" );
    $str75$Rename__Can_t_rename_to_existing_ = makeString( "Rename: Can't rename to existing constant in KB (~A)" );
    $kw76$NEW_CONSTANT = makeKeyword( "NEW-CONSTANT" );
    $str77$Rename__Unrecognized_constant___A = makeString( "Rename: Unrecognized constant (~A)" );
    $kw78$MERGE = makeKeyword( "MERGE" );
    $list79 = ConsesLow.list( makeString( "Merge: Nothing to merge" ) );
    $list80 = ConsesLow.list( makeString( "Merge: No kill term given" ) );
    $list81 = ConsesLow.list( makeString( "Merge: Can't merge from killed term" ) );
    $list82 = ConsesLow.list( makeString( "Merge: Kill term must be a FORT" ) );
    $list83 = ConsesLow.list( makeString( "Merge: No keep term given" ) );
    $list84 = ConsesLow.list( makeString( "Merge: Can't merge onto killed term" ) );
    $list85 = ConsesLow.list( makeString( "Merge: Keep term must be a FORT" ) );
    $kw86$IN_MT = makeKeyword( "IN-MT" );
    $list87 = ConsesLow.list( makeString( "In Mt: No mt specified" ) );
    $str88$In_Mt__NAT_mt_must_be_a_hlmt_p___ = makeString( "In Mt: NAT mt must be a hlmt-p (~A)" );
    $str89$In_Mt__Unrecognized_mt___A_ = makeString( "In Mt: Unrecognized mt (~A)" );
    $kw90$DEFAULT_MT = makeKeyword( "DEFAULT-MT" );
    $list91 = ConsesLow.list( makeString( "Default-Mt: No mt specified" ) );
    $str92$Default_Mt__NAT_mt_must_be_a_hlmt = makeString( "Default Mt: NAT mt must be a hlmt-p (~A)" );
    $str93$Default_Mt__Unrecognized_mt___A_ = makeString( "Default Mt: Unrecognized mt (~A)" );
    $kw94$STRENGTH = makeKeyword( "STRENGTH" );
    $list95 = ConsesLow.list( makeString( "Strength: No strength specified" ) );
    $str96$Strength__Unrecognized_strength__ = makeString( "Strength: Unrecognized strength (~A)" );
    $kw97$DIRECTION = makeKeyword( "DIRECTION" );
    $list98 = ConsesLow.list( makeString( "Direction: No direction specified" ) );
    $str99$Direction__Unrecognized_direction = makeString( "Direction: Unrecognized direction (~A)" );
    $sym100$STRING_ = makeSymbol( "STRING=" );
    $list101 = ConsesLow.list( makeString( "Unrecognized predicate" ) );
    $list102 = ConsesLow.list( makeString( "NAT predicates unsupported" ) );
    $sym103$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const104$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str105$Constant_must_be_specified = makeString( "Constant must be specified" );
    $str106$Unexpected_argument_to_unary_pred = makeString( "Unexpected argument to unary predicate (~A)" );
    $str107$No_argument_found_for_binary_pred = makeString( "No argument found for binary predicate (~A)" );
    $str108$No_argument_found_for_arity__A_pr = makeString( "No argument found for arity ~A predicate (~A)" );
    $str109$List_argument_expected_for_arity_ = makeString( "List argument expected for arity ~A predicate (~A)" );
    $str110$Unexpected_argument_for_predicate = makeString( "Unexpected argument for predicate (~A)" );
    $kw111$AGENDA = makeKeyword( "AGENDA" );
    $sym112$FI_CREATE = makeSymbol( "FI-CREATE" );
    $sym113$FI_TIMESTAMP_CONSTANT = makeSymbol( "FI-TIMESTAMP-CONSTANT" );
    $sym114$QUOTE = makeSymbol( "QUOTE" );
    $kw115$NOW = makeKeyword( "NOW" );
    $sym116$RESOLVE_NEW_CONSTANTS = makeSymbol( "RESOLVE-NEW-CONSTANTS" );
    $sym117$FI_ASSERT = makeSymbol( "FI-ASSERT" );
    $sym118$FI_TIMESTAMP_ASSERTION = makeSymbol( "FI-TIMESTAMP-ASSERTION" );
    $sym119$FI_UNASSERT = makeSymbol( "FI-UNASSERT" );
    $sym120$FI_RENAME = makeSymbol( "FI-RENAME" );
    $const121$oldConstantName = constant_handles.reader_make_constant_shell( makeString( "oldConstantName" ) );
    $const122$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $sym123$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $kw124$GAF = makeKeyword( "GAF" );
    $list125 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) ) ) );
    $sym126$FI_KILL = makeSymbol( "FI-KILL" );
    $sym127$FI_MERGE = makeSymbol( "FI-MERGE" );
    $str128$Constant_does_not_exist___A_ = makeString( "Constant does not exist (~A)" );
    $str129$_new_constant_must_be_followed_by = makeString( ":new-constant must be followed by a string or constant" );
    $list130 = ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER, makeString( "Filename is not a string" ) );
    $list131 = ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER, makeString( "Filename is null string" ) );
    $kw132$INPUT = makeKeyword( "INPUT" );
    $str133$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym134$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw135$EOF = makeKeyword( "EOF" );
    $list136 = ConsesLow.list( NIL );
    $str137$ = makeString( "" );
    $str138$_A__ = makeString( "~A: " );
    $str139$_A__A__ = makeString( "~A-~A: " );
    $str140$_A___ = makeString( "~A-: " );
    $str141$__A__ = makeString( "-~A: " );
    $str142$___ = makeString( "?: " );
    $str143$_A = makeString( "~A" );
    $str144$el_ = makeString( "el:" );
    $str145$____ = makeString( " .~%" );
    $kw146$NORMAL = makeKeyword( "NORMAL" );
    $sym147$STRINGP = makeSymbol( "STRINGP" );
    $str148$__Sorry___s_is_not_known_to_be_a_ = makeString( "~%Sorry, ~s is not known to be a Cyclist." );
    $str149$_A__ = makeString( "~A~%" );
    $str150$merged = makeString( "merged" );
    $str151$renamed = makeString( "renamed" );
    $str152$killed = makeString( "killed" );
    $str153$created = makeString( "created" );
    $list154 = ConsesLow.list( makeString( " or " ) );
    $list155 = ConsesLow.list( makeString( ", " ), makeString( ", or " ) );
    $list156 = ConsesLow.list( makeString( ", " ), makeString( ", " ), makeString( " or " ) );
    $kw157$QUIET = makeKeyword( "QUIET" );
    $str158$The_following_constants_will_be_ = makeString( "The following constants will be " );
    $str159$_ = makeString( ":" );
    $str160$__ = makeString( "~%" );
    $str161$__Create___A__ = makeString( "  Create: ~A~%" );
    $str162$__Kill___A__ = makeString( "  Kill: ~A~%" );
    $str163$__Rename___A_to__A__ = makeString( "  Rename: ~A to ~A~%" );
    $str164$Evaluating__A_forms_____ = makeString( "Evaluating ~A forms...~%" );
    $kw165$APPEND = makeKeyword( "APPEND" );
    $sym166$LOAD_KE_TEXT_FILE = makeSymbol( "LOAD-KE-TEXT-FILE" );
    $list167 = ConsesLow.list( makeSymbol( "CYCLIST" ), makeSymbol( "FILENAME" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "METHOD" ), makeKeyword( "AGENDA" ) ), ConsesLow.list( makeSymbol(
        "NO-USER-INTERACTION?" ), T ), ConsesLow.list( makeSymbol( "VERBOSITY" ), makeKeyword( "NORMAL" ) ) );
    $str168$Call_the_ke_text_engine_on_a_file = makeString(
        "Call the ke text engine on a file from the lisp interactor.\n@param CYCLIST (string or constant) \n@param FILENAME string\n@param METHOD keyword ;; can be :agenda or :now.\n@param NO-USER-INTERACTION? boolean ;; this parameter is ignored\n@param VERBOSITY keyword-p; either :normal or :quiet.  If :quiet, will only show errors.\n" );
    $list169 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILENAME" ), makeSymbol( "STRINGP" ) ) );
    $list170 = ConsesLow.list( makeKeyword( "KE-OPERATIONS" ), makeKeyword( "ERROR-LISTS" ) );
    $kw171$KE_OPERATIONS = makeKeyword( "KE-OPERATIONS" );
    $kw172$ERROR_LISTS = makeKeyword( "ERROR-LISTS" );
    $list173 = ConsesLow.list( makeKeyword( "KE-OPERATIONS" ), makeKeyword( "ERROR-LISTS" ), makeKeyword( "ERRORS" ) );
  }
}
/*
 * 
 * Total time: 1462 ms
 * 
 */