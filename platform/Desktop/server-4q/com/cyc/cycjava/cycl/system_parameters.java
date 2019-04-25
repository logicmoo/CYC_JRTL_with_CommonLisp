package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_parameters
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.system_parameters";
  public static final String myFingerPrint = "b30f91331706293790e42192d82e7d72b780b877dcefc67ec9e6f7e7dec9649e";
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 894L)
  private static SubLSymbol $system_parameters$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 10478L)
  public static SubLSymbol $auto_continue_transcript_problems$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 10968L)
  public static SubLSymbol $continue_agenda_on_error$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 11283L)
  public static SubLSymbol $suspend_sbhl_type_checkingP$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 11453L)
  public static SubLSymbol $really_count_transcript_ops$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 11773L)
  public static SubLSymbol $dont_record_operations_locally$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 12297L)
  public static SubLSymbol $start_agenda_at_startupP$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 12517L)
  public static SubLSymbol $base_tcp_port$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 12692L)
  public static SubLSymbol $html_port_offset$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 12978L)
  public static SubLSymbol $fi_port_offset$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 13295L)
  public static SubLSymbol $http_port_offset$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 13588L)
  public static SubLSymbol $servlet_port_offset$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 13897L)
  public static SubLSymbol $cfasl_port_offset$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 14215L)
  public static SubLSymbol $sparql_port_offset$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 14980L)
  public static SubLSymbol $permit_api_host_access$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 15230L)
  public static SubLSymbol $use_transcript_server$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 15640L)
  public static SubLSymbol $master_transcript_lock_host$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 15962L)
  public static SubLSymbol $master_transcript_server_port$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 16249L)
  public static SubLSymbol $cb_editing_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 16402L)
  public static SubLSymbol $cb_allow_halt_imageP$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 16554L)
  public static SubLSymbol $allow_guest_to_editP$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 16781L)
  public static SubLSymbol $default_cyclist_name$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 16963L)
  public static SubLSymbol $http_htdocs_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 17134L)
  public static SubLSymbol $html_image_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 17323L)
  public static SubLSymbol $html_javascript_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 17522L)
  public static SubLSymbol $html_css_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 17715L)
  public static SubLSymbol $permit_utf_8_character_display$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 17894L)
  public static SubLSymbol $cyc_documentation_url$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 18155L)
  public static SubLSymbol $cyc_cgi_program$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 18574L)
  public static SubLSymbol $constant_name_grep_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 19095L)
  public static SubLSymbol $cyc_grep_cgi_program$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 19585L)
  private static SubLSymbol $all_cyc_execution_contexts$;
  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 19751L)
  public static SubLSymbol $cyc_execution_context$;
  private static final SubLSymbol $sym0$_SYSTEM_PARAMETERS_;
  private static final SubLSymbol $sym1$FIRST;
  private static final SubLString $str2$_S__S_has_an_unknown_type__S_;
  private static final SubLSymbol $sym3$DEFINE_SYSTEM_PARAMETER;
  private static final SubLSymbol $sym4$SYMBOLP;
  private static final SubLSymbol $sym5$CAR;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PROGN;
  private static final SubLSymbol $sym8$REGISTER_SYSTEM_PARAMETER;
  private static final SubLSymbol $sym9$QUOTE;
  private static final SubLSymbol $sym10$DEFVAR;
  private static final SubLSymbol $kw11$UNSET;
  private static final SubLList $list12;
  private static final SubLString $str13$The_system_parameter__S_is_not_bo;
  private static final SubLString $str14$The_system_parameter__S_was_not_i;
  private static final SubLString $str15$The_system_parameter__A_has_a_bog;
  private static final SubLString $str16$The_system_paramater__S_has_the_v;
  private static final SubLObject $ic17;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$LISP;
  private static final SubLList $list20;
  private static final SubLString $str21$parameters;
  private static final SubLString $str22$lisp;
  private static final SubLSymbol $kw23$OUTPUT;
  private static final SubLString $str24$Unable_to_open__S;
  private static final SubLString $str25$________Mode__LISP__Syntax__ANSI_;
  private static final SubLString $str26$____Cyc_system_parameters__;
  private static final SubLString $str27$_____;
  private static final SubLString $str28$____Generated__A_from_CycL__A____;
  private static final SubLString $str29$_in_package__CYC_____;
  private static final SubLList $list30;
  private static final SubLString $str31$____Possible_Values___A__;
  private static final SubLString $str32$_____A__;
  private static final SubLString $str33$_csetq__A__S_____;
  private static final SubLString $str34$_check_system_parameters___;
  private static final SubLSymbol $kw35$CONFIG;
  private static final SubLList $list36;
  private static final SubLString $str37$_A___A__;
  private static final SubLString $str38$_A___;
  private static final SubLString $str39$_A__;
  private static final SubLSymbol $kw40$INPUT;
  private static final SubLSymbol $kw41$EOF;
  private static final SubLString $str42$System_parameters_file___A__not_l;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$IN_PACKAGE;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$CSETQ;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$CHECK_SYSTEM_PARAMETERS;
  private static final SubLSymbol $sym49$_AUTO_CONTINUE_TRANSCRIPT_PROBLEMS_;
  private static final SubLSymbol $sym50$BOOLEAN;
  private static final SubLString $str51$If___FALSE____transcript_problems;
  private static final SubLSymbol $sym52$_CONTINUE_AGENDA_ON_ERROR_;
  private static final SubLString $str53$If___FALSE____agenda_errors_will_;
  private static final SubLSymbol $sym54$_SUSPEND_SBHL_TYPE_CHECKING__;
  private static final SubLString $str55$Type_checking_occurs_in_SBHL_modu;
  private static final SubLSymbol $sym56$_REALLY_COUNT_TRANSCRIPT_OPS_;
  private static final SubLString $str57$If___FALSE____the_System_Info_pag;
  private static final SubLSymbol $sym58$_DONT_RECORD_OPERATIONS_LOCALLY_;
  private static final SubLString $str59$If___FALSE____a_local_transcript_;
  private static final SubLSymbol $sym60$_START_AGENDA_AT_STARTUP__;
  private static final SubLString $str61$If___FALSE____the_Cyc_agenda_is_n;
  private static final SubLSymbol $sym62$_BASE_TCP_PORT_;
  private static final SubLInteger $int63$3600;
  private static final SubLSymbol $sym64$PORT;
  private static final SubLString $str65$The_base_port_number_for_all_the_;
  private static final SubLSymbol $sym66$_HTML_PORT_OFFSET_;
  private static final SubLSymbol $sym67$PORT_OFFSET;
  private static final SubLString $str68$This_parameter_specifies_the_offs;
  private static final SubLSymbol $sym69$_FI_PORT_OFFSET_;
  private static final SubLString $str70$This_parameter_specifies_the_offs;
  private static final SubLSymbol $sym71$_HTTP_PORT_OFFSET_;
  private static final SubLString $str72$This_parameter_specifies_the_offs;
  private static final SubLSymbol $sym73$_SERVLET_PORT_OFFSET_;
  private static final SubLString $str74$This_parameter_specifies_the_offs;
  private static final SubLSymbol $sym75$_CFASL_PORT_OFFSET_;
  private static final SubLString $str76$This_parameter_specifies_the_offs;
  private static final SubLSymbol $sym77$_SPARQL_PORT_OFFSET_;
  private static final SubLString $str78$This_parameter_specifies_the_offs;
  private static final SubLSymbol $sym79$_TCP_LOCALHOST_ONLY__;
  private static final SubLString $str80$IF___FALSE____then_remote_TCP_cli;
  private static final SubLSymbol $sym81$_PERMIT_API_HOST_ACCESS_;
  private static final SubLString $str82$IF___TRUE____then_API_functions_c;
  private static final SubLSymbol $sym83$_USE_TRANSCRIPT_SERVER_;
  private static final SubLString $str84$IF___TRUE____then_writing_to_the_;
  private static final SubLSymbol $sym85$_MASTER_TRANSCRIPT_LOCK_HOST_;
  private static final SubLList $list86;
  private static final SubLString $str87$This_parameter_is_only_used_if__U;
  private static final SubLSymbol $sym88$_MASTER_TRANSCRIPT_SERVER_PORT_;
  private static final SubLInteger $int89$3608;
  private static final SubLSymbol $sym90$INTEGER;
  private static final SubLString $str91$This_parameter_is_only_used_if__U;
  private static final SubLSymbol $sym92$_CB_EDITING_ENABLED__;
  private static final SubLString $str93$If___FALSE____tools_for_modifying;
  private static final SubLSymbol $sym94$_CB_ALLOW_HALT_IMAGE__;
  private static final SubLString $str95$If___FALSE____the__Halt_this_imag;
  private static final SubLSymbol $sym96$_ALLOW_GUEST_TO_EDIT__;
  private static final SubLString $str97$If___FALSE____require_authenticat;
  private static final SubLSymbol $sym98$_DEFAULT_CYCLIST_NAME_;
  private static final SubLString $str99$Guest;
  private static final SubLSymbol $sym100$STRING;
  private static final SubLString $str101$Specifies_the_name_of_the_default;
  private static final SubLSymbol $sym102$_HTTP_HTDOCS_DIRECTORY_;
  private static final SubLString $str103$httpd_htdocs;
  private static final SubLSymbol $sym104$FULL_PATH;
  private static final SubLString $str105$The_directory_under_which_documen;
  private static final SubLSymbol $sym106$_HTML_IMAGE_DIRECTORY_;
  private static final SubLString $str107$_cycdoc_img_;
  private static final SubLString $str108$The_directory__relative_to__HTTP_;
  private static final SubLSymbol $sym109$_HTML_JAVASCRIPT_DIRECTORY_;
  private static final SubLString $str110$_cycdoc_js_;
  private static final SubLString $str111$The_directory__relative_to__HTTP_;
  private static final SubLSymbol $sym112$_HTML_CSS_DIRECTORY_;
  private static final SubLString $str113$_cycdoc_css_;
  private static final SubLSymbol $sym114$_PERMIT_UTF_8_CHARACTER_DISPLAY_;
  private static final SubLString $str115$If___TRUE____the_html_tools_will_;
  private static final SubLSymbol $sym116$_CYC_DOCUMENTATION_URL_;
  private static final SubLString $str117$_cycdoc_;
  private static final SubLString $str118$The_directory__relative_to__HTTP_;
  private static final SubLSymbol $sym119$_CYC_CGI_PROGRAM_;
  private static final SubLString $str120$cg;
  private static final SubLString $str121$The_name_of_the_CGI_program_that_;
  private static final SubLSymbol $sym122$_CONSTANT_NAME_GREP_ENABLED_;
  private static final SubLString $str123$If___TRUE____the_HTML_browser_all;
  private static final SubLSymbol $sym124$_CYC_GREP_CGI_PROGRAM_;
  private static final SubLString $str125$constant_name_grep;
  private static final SubLString $str126$The_name_of_the_CGI_program_that_;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$_CYC_EXECUTION_CONTEXT_;
  private static final SubLSymbol $kw129$UNKNOWN;
  private static final SubLList $list130;
  private static final SubLString $str131$If_the_execution_context_is_set_t;

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 1238L)
  public static SubLObject all_system_parameters()
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym1$FIRST ), $system_parameters$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 1328L)
  public static SubLObject register_system_parameter(final SubLObject name, final SubLObject v_default, final SubLObject type, final SubLObject description)
  {
    if( NIL == system_parameter_types.valid_system_parameter_typeP( type ) )
    {
      Errors.warn( $str2$_S__S_has_an_unknown_type__S_, $sym3$DEFINE_SYSTEM_PARAMETER, name, type );
    }
    remove_system_parameter( name );
    $system_parameters$.setGlobalValue( ConsesLow.cons( ConsesLow.list( name, v_default, type, description ), $system_parameters$.getGlobalValue() ) );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 1703L)
  public static SubLObject remove_system_parameter(final SubLObject name)
  {
    assert NIL != Types.symbolp( name ) : name;
    $system_parameters$.setGlobalValue( Sequences.delete( name, $system_parameters$.getGlobalValue(), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym5$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 1934L)
  public static SubLObject all_system_parameter_definitions()
  {
    return Sequences.reverse( $system_parameters$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 2081L)
  public static SubLObject define_system_parameter(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject v_default = NIL;
    SubLObject type = NIL;
    SubLObject description = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    v_default = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    description = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym7$PROGN, ConsesLow.list( $sym8$REGISTER_SYSTEM_PARAMETER, ConsesLow.list( $sym9$QUOTE, name ), ConsesLow.list( $sym9$QUOTE, v_default ), ConsesLow.list( $sym9$QUOTE, type ), ConsesLow
          .list( $sym9$QUOTE, description ) ), ConsesLow.list( $sym10$DEFVAR, name, $kw11$UNSET, description ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 2650L)
  public static SubLObject system_parameter_value_unset_p(final SubLObject value)
  {
    return Equality.eq( value, $kw11$UNSET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 2732L)
  public static SubLObject check_system_parameters()
  {
    SubLObject cdolist_list_var = $system_parameters$.getGlobalValue();
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = entry;
      SubLObject symbol = NIL;
      SubLObject v_default = NIL;
      SubLObject type = NIL;
      SubLObject description = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
      symbol = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
      v_default = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
      type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
      description = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == Symbols.boundp( symbol ) )
        {
          Errors.warn( $str13$The_system_parameter__S_is_not_bo, symbol );
        }
        else if( NIL != system_parameter_value_unset_p( Symbols.symbol_value( symbol ) ) )
        {
          Errors.warn( $str14$The_system_parameter__S_was_not_i, symbol );
        }
        else if( NIL == system_parameter_types.valid_system_parameter_typeP( type ) )
        {
          Errors.warn( $str15$The_system_parameter__A_has_a_bog, symbol, type );
        }
        else
        {
          final SubLObject value = Symbols.symbol_value( symbol );
          if( NIL == system_parameter_types.check_system_parameter_value( value, type ) )
          {
            Errors.warn( $str16$The_system_paramater__S_has_the_v, symbol, value, type );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 3551L)
  public static SubLObject alphanumericize_string(final SubLObject string)
  {
    SubLObject size = Numbers.add( Sequences.length( string ), ONE_INTEGER );
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( string ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL == Characters.alphanumericp( Strings.sublisp_char( string, i ) ) )
      {
        size = Numbers.add( size, ONE_INTEGER );
      }
    }
    final SubLObject frobbed = Strings.make_string( size, UNPROVIDED );
    SubLObject idx = ONE_INTEGER;
    Strings.set_char( frobbed, ZERO_INTEGER, Characters.CHAR_E );
    SubLObject cdotimes_end_var2;
    SubLObject j;
    SubLObject v_char;
    SubLObject code;
    SubLObject map;
    for( cdotimes_end_var2 = Sequences.length( string ), j = NIL, j = ZERO_INTEGER; j.numL( cdotimes_end_var2 ); j = Numbers.add( j, ONE_INTEGER ) )
    {
      v_char = Strings.sublisp_char( string, j );
      if( NIL != Characters.alphanumericp( v_char ) )
      {
        Strings.set_char( frobbed, idx, v_char );
        idx = Numbers.add( idx, ONE_INTEGER );
      }
      else
      {
        code = Characters.char_code( v_char );
        map = $ic17;
        Strings.set_char( frobbed, idx, Vectors.aref( map, Numbers.integerDivide( code, SIXTEEN_INTEGER ) ) );
        idx = Numbers.add( idx, ONE_INTEGER );
        Strings.set_char( frobbed, idx, Vectors.aref( map, Numbers.mod( code, SIXTEEN_INTEGER ) ) );
        idx = Numbers.add( idx, ONE_INTEGER );
      }
    }
    return frobbed;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 4556L)
  public static SubLObject get_parameter_description_lines(final SubLObject description, final SubLObject substitutions, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    final SubLObject base_lines = string_utilities.extract_lines( description );
    return localize_boolean_description_lines( base_lines, substitutions, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 5918L)
  public static SubLObject localize_boolean_description_lines(final SubLObject base_lines, final SubLObject substitutions, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    SubLObject lines = NIL;
    SubLObject cdolist_list_var = base_lines;
    SubLObject curr_line = NIL;
    curr_line = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = substitutions;
      SubLObject substitution = NIL;
      substitution = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        SubLObject current;
        final SubLObject datum = current = substitution;
        SubLObject v_new = NIL;
        SubLObject old = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        v_new = current.first();
        current = ( old = current.rest() );
        if( NIL != Sequences.search( old, curr_line, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          curr_line = string_utilities.string_substitute( v_new, old, curr_line, test );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        substitution = cdolist_list_var_$1.first();
      }
      lines = ConsesLow.cons( curr_line, lines );
      cdolist_list_var = cdolist_list_var.rest();
      curr_line = cdolist_list_var.first();
    }
    return Sequences.nreverse( lines );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 6369L)
  public static SubLObject setup_system_parameters(final SubLObject format, SubLObject pathname)
  {
    if( pathname == UNPROVIDED )
    {
      pathname = NIL;
    }
    if( format.eql( $kw19$LISP ) )
    {
      if( NIL == pathname )
      {
        pathname = file_utilities.cyc_home_filename( $list20, $str21$parameters, $str22$lisp );
      }
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( pathname, $kw23$OUTPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str24$Unable_to_open__S, pathname );
        }
        final SubLObject s = stream;
        PrintLow.format( s, $str25$________Mode__LISP__Syntax__ANSI_ );
        PrintLow.format( s, $str26$____Cyc_system_parameters__ );
        PrintLow.format( s, $str27$_____ );
        PrintLow.format( s, $str28$____Generated__A_from_CycL__A____, numeric_date_utilities.timestring( UNPROVIDED ), system_info.cyc_revision_string() );
        PrintLow.format( s, $str29$_in_package__CYC_____ );
        final SubLObject substitutions = $list30;
        SubLObject cdolist_list_var = all_system_parameter_definitions();
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = entry;
          SubLObject symbol = NIL;
          SubLObject v_default = NIL;
          SubLObject type = NIL;
          SubLObject description = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
          symbol = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
          v_default = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
          type = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
          description = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject possible_values = system_parameter_types.determine_system_parameter_type_possible_values_string( type, UNPROVIDED );
            final SubLObject localized = localize_boolean_description_lines( ConsesLow.list( possible_values ), substitutions, UNPROVIDED ).first();
            PrintLow.format( s, $str31$____Possible_Values___A__, localized );
            SubLObject cdolist_list_var_$2 = get_parameter_description_lines( description, substitutions, UNPROVIDED );
            SubLObject line = NIL;
            line = cdolist_list_var_$2.first();
            while ( NIL != cdolist_list_var_$2)
            {
              PrintLow.format( s, $str32$_____A__, line );
              cdolist_list_var_$2 = cdolist_list_var_$2.rest();
              line = cdolist_list_var_$2.first();
            }
            PrintLow.format( s, $str33$_csetq__A__S_____, symbol, v_default );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          entry = cdolist_list_var.first();
        }
        PrintLow.format( s, $str34$_check_system_parameters___ );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    else if( format.eql( $kw35$CONFIG ) )
    {
      if( NIL == pathname )
      {
        pathname = file_utilities.cyc_home_filename( $list36, $str21$parameters, UNPROVIDED );
      }
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( pathname, $kw23$OUTPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str24$Unable_to_open__S, pathname );
        }
        final SubLObject s = stream;
        SubLObject cdolist_list_var2 = Sequences.reverse( $system_parameters$.getGlobalValue() );
        SubLObject entry2 = NIL;
        entry2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          SubLObject current2;
          final SubLObject datum2 = current2 = entry2;
          SubLObject symbol2 = NIL;
          SubLObject v_default2 = NIL;
          SubLObject type2 = NIL;
          SubLObject description2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list12 );
          symbol2 = current2.first();
          current2 = current2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list12 );
          v_default2 = current2.first();
          current2 = current2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list12 );
          type2 = current2.first();
          current2 = current2.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list12 );
          description2 = current2.first();
          current2 = current2.rest();
          if( NIL == current2 )
          {
            final SubLObject string = Strings.string( symbol2 );
            PrintLow.format( s, $str37$_A___A__, alphanumericize_string( string ), string );
            if( v_default2.isString() )
            {
              final SubLObject lines = string_utilities.extract_lines( v_default2 );
              SubLObject cdolist_list_var_$3 = conses_high.butlast( lines, UNPROVIDED );
              SubLObject line2 = NIL;
              line2 = cdolist_list_var_$3.first();
              while ( NIL != cdolist_list_var_$3)
              {
                PrintLow.format( s, $str38$_A___, line2 );
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                line2 = cdolist_list_var_$3.first();
              }
              PrintLow.format( s, $str39$_A__, conses_high.last( lines, UNPROVIDED ).first() );
            }
            else if( v_default2.isSymbol() )
            {
              PrintLow.format( s, $str39$_A__, Symbols.symbol_name( v_default2 ) );
            }
            else
            {
              PrintLow.format( s, $str39$_A__, v_default2 );
            }
            final SubLObject lines = string_utilities.extract_lines( description2 );
            SubLObject cdolist_list_var_$4 = conses_high.butlast( lines, UNPROVIDED );
            SubLObject line2 = NIL;
            line2 = cdolist_list_var_$4.first();
            while ( NIL != cdolist_list_var_$4)
            {
              PrintLow.format( s, $str38$_A___, line2 );
              cdolist_list_var_$4 = cdolist_list_var_$4.rest();
              line2 = cdolist_list_var_$4.first();
            }
            PrintLow.format( s, $str39$_A__, conses_high.last( lines, UNPROVIDED ).first() );
            PrintLow.format( s, $str39$_A__, Sequences.substitute( Characters.CHAR_underbar, Characters.CHAR_hyphen, Strings.string_downcase( Strings.string( type2 ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
                UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
            streams_high.terpri( s );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum2, $list12 );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          entry2 = cdolist_list_var2.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 9113L)
  public static SubLObject load_system_parameters()
  {
    final SubLObject filename = file_utilities.cyc_home_filename( $list20, $str21$parameters, $str22$lisp );
    if( NIL != Filesys.probe_file( filename ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( filename, $kw40$INPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str24$Unable_to_open__S, filename );
        }
        final SubLObject stream_$5 = stream;
        SubLObject done = NIL;
        while ( NIL == done)
        {
          final SubLObject form = read_parameter_form( stream_$5 );
          if( $kw41$EOF == form )
          {
            done = T;
          }
          else
          {
            evaluate_parameter_form( form );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    else
    {
      Errors.warn( $str42$System_parameters_file___A__not_l, filename );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 9647L)
  public static SubLObject read_parameter_form(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject parameter_form = NIL;
    final SubLObject _prev_bind_0 = reader.$read_eval$.currentBinding( thread );
    try
    {
      reader.$read_eval$.bind( NIL, thread );
      parameter_form = reader.read( stream, NIL, $kw41$EOF, UNPROVIDED );
    }
    finally
    {
      reader.$read_eval$.rebind( _prev_bind_0, thread );
    }
    return parameter_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 9842L)
  public static SubLObject evaluate_parameter_form(final SubLObject form)
  {
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( form, form, $list43 );
    operator = form.first();
    final SubLObject args;
    final SubLObject current = args = form.rest();
    final SubLObject pcase_var = operator;
    if( pcase_var.eql( $sym44$IN_PACKAGE ) )
    {
      Eval.eval( $list45 );
    }
    else if( pcase_var.eql( $sym46$CSETQ ) )
    {
      SubLObject current_$7;
      final SubLObject datum_$6 = current_$7 = args;
      SubLObject symbol = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list47 );
      symbol = current_$7.first();
      current_$7 = current_$7.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list47 );
      value = current_$7.first();
      current_$7 = current_$7.rest();
      if( NIL == current_$7 )
      {
        if( NIL != conses_high.member( symbol, $system_parameters$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym1$FIRST ) ) )
        {
          Symbols.set( symbol, evaluate_parameter_value( value ) );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$6, $list47 );
      }
    }
    else if( pcase_var.eql( $sym48$CHECK_SYSTEM_PARAMETERS ) )
    {
      check_system_parameters();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 10266L)
  public static SubLObject evaluate_parameter_value(final SubLObject value)
  {
    if( value.isAtom() )
    {
      return value;
    }
    SubLObject operator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( value, value, $list43 );
    operator = value.first();
    final SubLObject args;
    final SubLObject current = args = value.rest();
    if( $sym9$QUOTE == operator )
    {
      return args.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameters.lisp", position = 18081L)
  public static SubLObject cyc_documentation_url()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cyc_documentation_url$.getDynamicValue( thread );
  }

  public static SubLObject declare_system_parameters_file()
  {
    SubLFiles.declareFunction( me, "all_system_parameters", "ALL-SYSTEM-PARAMETERS", 0, 0, false );
    SubLFiles.declareFunction( me, "register_system_parameter", "REGISTER-SYSTEM-PARAMETER", 4, 0, false );
    SubLFiles.declareFunction( me, "remove_system_parameter", "REMOVE-SYSTEM-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "all_system_parameter_definitions", "ALL-SYSTEM-PARAMETER-DEFINITIONS", 0, 0, false );
    SubLFiles.declareMacro( me, "define_system_parameter", "DEFINE-SYSTEM-PARAMETER" );
    SubLFiles.declareFunction( me, "system_parameter_value_unset_p", "SYSTEM-PARAMETER-VALUE-UNSET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "check_system_parameters", "CHECK-SYSTEM-PARAMETERS", 0, 0, false );
    SubLFiles.declareFunction( me, "alphanumericize_string", "ALPHANUMERICIZE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_parameter_description_lines", "GET-PARAMETER-DESCRIPTION-LINES", 2, 1, false );
    SubLFiles.declareFunction( me, "localize_boolean_description_lines", "LOCALIZE-BOOLEAN-DESCRIPTION-LINES", 2, 1, false );
    SubLFiles.declareFunction( me, "setup_system_parameters", "SETUP-SYSTEM-PARAMETERS", 1, 1, false );
    SubLFiles.declareFunction( me, "load_system_parameters", "LOAD-SYSTEM-PARAMETERS", 0, 0, false );
    SubLFiles.declareFunction( me, "read_parameter_form", "READ-PARAMETER-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluate_parameter_form", "EVALUATE-PARAMETER-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluate_parameter_value", "EVALUATE-PARAMETER-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_documentation_url", "CYC-DOCUMENTATION-URL", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_system_parameters_file()
  {
    $system_parameters$ = SubLFiles.deflexical( "*SYSTEM-PARAMETERS*", ( maybeDefault( $sym0$_SYSTEM_PARAMETERS_, $system_parameters$, NIL ) ) );
    $auto_continue_transcript_problems$ = SubLFiles.defvar( "*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*", $kw11$UNSET );
    $continue_agenda_on_error$ = SubLFiles.defvar( "*CONTINUE-AGENDA-ON-ERROR*", $kw11$UNSET );
    $suspend_sbhl_type_checkingP$ = SubLFiles.defvar( "*SUSPEND-SBHL-TYPE-CHECKING?*", $kw11$UNSET );
    $really_count_transcript_ops$ = SubLFiles.defvar( "*REALLY-COUNT-TRANSCRIPT-OPS*", $kw11$UNSET );
    $dont_record_operations_locally$ = SubLFiles.defvar( "*DONT-RECORD-OPERATIONS-LOCALLY*", $kw11$UNSET );
    $start_agenda_at_startupP$ = SubLFiles.defvar( "*START-AGENDA-AT-STARTUP?*", $kw11$UNSET );
    $base_tcp_port$ = SubLFiles.defvar( "*BASE-TCP-PORT*", $kw11$UNSET );
    $html_port_offset$ = SubLFiles.defvar( "*HTML-PORT-OFFSET*", $kw11$UNSET );
    $fi_port_offset$ = SubLFiles.defvar( "*FI-PORT-OFFSET*", $kw11$UNSET );
    $http_port_offset$ = SubLFiles.defvar( "*HTTP-PORT-OFFSET*", $kw11$UNSET );
    $servlet_port_offset$ = SubLFiles.defvar( "*SERVLET-PORT-OFFSET*", $kw11$UNSET );
    $cfasl_port_offset$ = SubLFiles.defvar( "*CFASL-PORT-OFFSET*", $kw11$UNSET );
    $sparql_port_offset$ = SubLFiles.defvar( "*SPARQL-PORT-OFFSET*", $kw11$UNSET );
    $permit_api_host_access$ = SubLFiles.defvar( "*PERMIT-API-HOST-ACCESS*", $kw11$UNSET );
    $use_transcript_server$ = SubLFiles.defvar( "*USE-TRANSCRIPT-SERVER*", $kw11$UNSET );
    $master_transcript_lock_host$ = SubLFiles.defvar( "*MASTER-TRANSCRIPT-LOCK-HOST*", $kw11$UNSET );
    $master_transcript_server_port$ = SubLFiles.defvar( "*MASTER-TRANSCRIPT-SERVER-PORT*", $kw11$UNSET );
    $cb_editing_enabledP$ = SubLFiles.defvar( "*CB-EDITING-ENABLED?*", $kw11$UNSET );
    $cb_allow_halt_imageP$ = SubLFiles.defvar( "*CB-ALLOW-HALT-IMAGE?*", $kw11$UNSET );
    $allow_guest_to_editP$ = SubLFiles.defvar( "*ALLOW-GUEST-TO-EDIT?*", $kw11$UNSET );
    $default_cyclist_name$ = SubLFiles.defvar( "*DEFAULT-CYCLIST-NAME*", $kw11$UNSET );
    $http_htdocs_directory$ = SubLFiles.defvar( "*HTTP-HTDOCS-DIRECTORY*", $kw11$UNSET );
    $html_image_directory$ = SubLFiles.defvar( "*HTML-IMAGE-DIRECTORY*", $kw11$UNSET );
    $html_javascript_directory$ = SubLFiles.defvar( "*HTML-JAVASCRIPT-DIRECTORY*", $kw11$UNSET );
    $html_css_directory$ = SubLFiles.defvar( "*HTML-CSS-DIRECTORY*", $kw11$UNSET );
    $permit_utf_8_character_display$ = SubLFiles.defvar( "*PERMIT-UTF-8-CHARACTER-DISPLAY*", $kw11$UNSET );
    $cyc_documentation_url$ = SubLFiles.defvar( "*CYC-DOCUMENTATION-URL*", $kw11$UNSET );
    $cyc_cgi_program$ = SubLFiles.defvar( "*CYC-CGI-PROGRAM*", $kw11$UNSET );
    $constant_name_grep_enabled$ = SubLFiles.defvar( "*CONSTANT-NAME-GREP-ENABLED*", $kw11$UNSET );
    $cyc_grep_cgi_program$ = SubLFiles.defvar( "*CYC-GREP-CGI-PROGRAM*", $kw11$UNSET );
    $all_cyc_execution_contexts$ = SubLFiles.deflexical( "*ALL-CYC-EXECUTION-CONTEXTS*", $list127 );
    $cyc_execution_context$ = SubLFiles.defvar( "*CYC-EXECUTION-CONTEXT*", $kw11$UNSET );
    return NIL;
  }

  public static SubLObject setup_system_parameters_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_SYSTEM_PARAMETERS_ );
    register_system_parameter( $sym49$_AUTO_CONTINUE_TRANSCRIPT_PROBLEMS_, T, $sym50$BOOLEAN, $str51$If___FALSE____transcript_problems );
    register_system_parameter( $sym52$_CONTINUE_AGENDA_ON_ERROR_, T, $sym50$BOOLEAN, $str53$If___FALSE____agenda_errors_will_ );
    register_system_parameter( $sym54$_SUSPEND_SBHL_TYPE_CHECKING__, NIL, $sym50$BOOLEAN, $str55$Type_checking_occurs_in_SBHL_modu );
    register_system_parameter( $sym56$_REALLY_COUNT_TRANSCRIPT_OPS_, NIL, $sym50$BOOLEAN, $str57$If___FALSE____the_System_Info_pag );
    register_system_parameter( $sym58$_DONT_RECORD_OPERATIONS_LOCALLY_, NIL, $sym50$BOOLEAN, $str59$If___FALSE____a_local_transcript_ );
    register_system_parameter( $sym60$_START_AGENDA_AT_STARTUP__, T, $sym50$BOOLEAN, $str61$If___FALSE____the_Cyc_agenda_is_n );
    register_system_parameter( $sym62$_BASE_TCP_PORT_, $int63$3600, $sym64$PORT, $str65$The_base_port_number_for_all_the_ );
    register_system_parameter( $sym66$_HTML_PORT_OFFSET_, ZERO_INTEGER, $sym67$PORT_OFFSET, $str68$This_parameter_specifies_the_offs );
    register_system_parameter( $sym69$_FI_PORT_OFFSET_, ONE_INTEGER, $sym67$PORT_OFFSET, $str70$This_parameter_specifies_the_offs );
    register_system_parameter( $sym71$_HTTP_PORT_OFFSET_, TWO_INTEGER, $sym67$PORT_OFFSET, $str72$This_parameter_specifies_the_offs );
    register_system_parameter( $sym73$_SERVLET_PORT_OFFSET_, THREE_INTEGER, $sym67$PORT_OFFSET, $str74$This_parameter_specifies_the_offs );
    register_system_parameter( $sym75$_CFASL_PORT_OFFSET_, FOURTEEN_INTEGER, $sym67$PORT_OFFSET, $str76$This_parameter_specifies_the_offs );
    register_system_parameter( $sym77$_SPARQL_PORT_OFFSET_, FIFTEEN_INTEGER, $sym67$PORT_OFFSET, $str78$This_parameter_specifies_the_offs );
    register_system_parameter( $sym79$_TCP_LOCALHOST_ONLY__, NIL, $sym50$BOOLEAN, $str80$IF___FALSE____then_remote_TCP_cli );
    register_system_parameter( $sym81$_PERMIT_API_HOST_ACCESS_, T, $sym50$BOOLEAN, $str82$IF___TRUE____then_API_functions_c );
    register_system_parameter( $sym83$_USE_TRANSCRIPT_SERVER_, NIL, $sym50$BOOLEAN, $str84$IF___TRUE____then_writing_to_the_ );
    register_system_parameter( $sym85$_MASTER_TRANSCRIPT_LOCK_HOST_, NIL, $list86, $str87$This_parameter_is_only_used_if__U );
    register_system_parameter( $sym88$_MASTER_TRANSCRIPT_SERVER_PORT_, $int89$3608, $sym90$INTEGER, $str91$This_parameter_is_only_used_if__U );
    register_system_parameter( $sym92$_CB_EDITING_ENABLED__, T, $sym50$BOOLEAN, $str93$If___FALSE____tools_for_modifying );
    register_system_parameter( $sym94$_CB_ALLOW_HALT_IMAGE__, T, $sym50$BOOLEAN, $str95$If___FALSE____the__Halt_this_imag );
    register_system_parameter( $sym96$_ALLOW_GUEST_TO_EDIT__, NIL, $sym50$BOOLEAN, $str97$If___FALSE____require_authenticat );
    register_system_parameter( $sym98$_DEFAULT_CYCLIST_NAME_, $str99$Guest, $sym100$STRING, $str101$Specifies_the_name_of_the_default );
    register_system_parameter( $sym102$_HTTP_HTDOCS_DIRECTORY_, $str103$httpd_htdocs, $sym104$FULL_PATH, $str105$The_directory_under_which_documen );
    register_system_parameter( $sym106$_HTML_IMAGE_DIRECTORY_, $str107$_cycdoc_img_, $sym100$STRING, $str108$The_directory__relative_to__HTTP_ );
    register_system_parameter( $sym109$_HTML_JAVASCRIPT_DIRECTORY_, $str110$_cycdoc_js_, $sym100$STRING, $str111$The_directory__relative_to__HTTP_ );
    register_system_parameter( $sym112$_HTML_CSS_DIRECTORY_, $str113$_cycdoc_css_, $sym100$STRING, $str111$The_directory__relative_to__HTTP_ );
    register_system_parameter( $sym114$_PERMIT_UTF_8_CHARACTER_DISPLAY_, T, $sym50$BOOLEAN, $str115$If___TRUE____the_html_tools_will_ );
    register_system_parameter( $sym116$_CYC_DOCUMENTATION_URL_, $str117$_cycdoc_, $sym100$STRING, $str118$The_directory__relative_to__HTTP_ );
    register_system_parameter( $sym119$_CYC_CGI_PROGRAM_, $str120$cg, $sym100$STRING, $str121$The_name_of_the_CGI_program_that_ );
    register_system_parameter( $sym122$_CONSTANT_NAME_GREP_ENABLED_, T, $sym50$BOOLEAN, $str123$If___TRUE____the_HTML_browser_all );
    register_system_parameter( $sym124$_CYC_GREP_CGI_PROGRAM_, $str125$constant_name_grep, $sym100$STRING, $str126$The_name_of_the_CGI_program_that_ );
    register_system_parameter( $sym128$_CYC_EXECUTION_CONTEXT_, $kw129$UNKNOWN, $list130, $str131$If_the_execution_context_is_set_t );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_system_parameters_file();
  }

  @Override
  public void initializeVariables()
  {
    init_system_parameters_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_system_parameters_file();
  }
  static
  {
    me = new system_parameters();
    $system_parameters$ = null;
    $auto_continue_transcript_problems$ = null;
    $continue_agenda_on_error$ = null;
    $suspend_sbhl_type_checkingP$ = null;
    $really_count_transcript_ops$ = null;
    $dont_record_operations_locally$ = null;
    $start_agenda_at_startupP$ = null;
    $base_tcp_port$ = null;
    $html_port_offset$ = null;
    $fi_port_offset$ = null;
    $http_port_offset$ = null;
    $servlet_port_offset$ = null;
    $cfasl_port_offset$ = null;
    $sparql_port_offset$ = null;
    $permit_api_host_access$ = null;
    $use_transcript_server$ = null;
    $master_transcript_lock_host$ = null;
    $master_transcript_server_port$ = null;
    $cb_editing_enabledP$ = null;
    $cb_allow_halt_imageP$ = null;
    $allow_guest_to_editP$ = null;
    $default_cyclist_name$ = null;
    $http_htdocs_directory$ = null;
    $html_image_directory$ = null;
    $html_javascript_directory$ = null;
    $html_css_directory$ = null;
    $permit_utf_8_character_display$ = null;
    $cyc_documentation_url$ = null;
    $cyc_cgi_program$ = null;
    $constant_name_grep_enabled$ = null;
    $cyc_grep_cgi_program$ = null;
    $all_cyc_execution_contexts$ = null;
    $cyc_execution_context$ = null;
    $sym0$_SYSTEM_PARAMETERS_ = makeSymbol( "*SYSTEM-PARAMETERS*" );
    $sym1$FIRST = makeSymbol( "FIRST" );
    $str2$_S__S_has_an_unknown_type__S_ = makeString( "~S ~S has an unknown type ~S." );
    $sym3$DEFINE_SYSTEM_PARAMETER = makeSymbol( "DEFINE-SYSTEM-PARAMETER" );
    $sym4$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym5$CAR = makeSymbol( "CAR" );
    $list6 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "DEFAULT" ), makeSymbol( "TYPE" ), makeSymbol( "DESCRIPTION" ) );
    $sym7$PROGN = makeSymbol( "PROGN" );
    $sym8$REGISTER_SYSTEM_PARAMETER = makeSymbol( "REGISTER-SYSTEM-PARAMETER" );
    $sym9$QUOTE = makeSymbol( "QUOTE" );
    $sym10$DEFVAR = makeSymbol( "DEFVAR" );
    $kw11$UNSET = makeKeyword( "UNSET" );
    $list12 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "DEFAULT" ), makeSymbol( "TYPE" ), makeSymbol( "DESCRIPTION" ) );
    $str13$The_system_parameter__S_is_not_bo = makeString( "The system parameter ~S is not bound." );
    $str14$The_system_parameter__S_was_not_i = makeString( "The system parameter ~S was not initialized." );
    $str15$The_system_parameter__A_has_a_bog = makeString( "The system parameter ~A has a bogus type definition of ~A." );
    $str16$The_system_paramater__S_has_the_v = makeString( "The system paramater ~S has the value ~S, but it is supposed to be ~S." );
    $ic17 = Vectors.vector( new SubLObject[] { Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7, Characters.CHAR_8,
      Characters.CHAR_9, Characters.CHAR_A, Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F
    } );
    $list18 = ConsesLow.cons( makeSymbol( "NEW" ), makeSymbol( "OLD" ) );
    $kw19$LISP = makeKeyword( "LISP" );
    $list20 = ConsesLow.list( makeString( "init" ) );
    $str21$parameters = makeString( "parameters" );
    $str22$lisp = makeString( "lisp" );
    $kw23$OUTPUT = makeKeyword( "OUTPUT" );
    $str24$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str25$________Mode__LISP__Syntax__ANSI_ = makeString( ";;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10; Package: CYC;  -*-~%~%" );
    $str26$____Cyc_system_parameters__ = makeString( ";;; Cyc system parameters~%" );
    $str27$_____ = makeString( ";;;~%" );
    $str28$____Generated__A_from_CycL__A____ = makeString( ";;; Generated ~A from CycL ~A~%~%" );
    $str29$_in_package__CYC_____ = makeString( "(in-package :CYC)~%~%" );
    $list30 = ConsesLow.list( ConsesLow.cons( makeString( "T" ), makeString( "::TRUE::" ) ), ConsesLow.cons( makeString( "NIL" ), makeString( "::FALSE::" ) ) );
    $str31$____Possible_Values___A__ = makeString( ";;; Possible Values: ~A~%" );
    $str32$_____A__ = makeString( ";;; ~A~%" );
    $str33$_csetq__A__S_____ = makeString( "(csetq ~A ~S)~%~%" );
    $str34$_check_system_parameters___ = makeString( "(check-system-parameters)~%" );
    $kw35$CONFIG = makeKeyword( "CONFIG" );
    $list36 = ConsesLow.list( makeString( "data" ) );
    $str37$_A___A__ = makeString( "~A~%~A~%" );
    $str38$_A___ = makeString( "~A\\~%" );
    $str39$_A__ = makeString( "~A~%" );
    $kw40$INPUT = makeKeyword( "INPUT" );
    $kw41$EOF = makeKeyword( "EOF" );
    $str42$System_parameters_file___A__not_l = makeString( "System parameters file (~A) not loaded." );
    $list43 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym44$IN_PACKAGE = makeSymbol( "IN-PACKAGE" );
    $list45 = ConsesLow.list( makeSymbol( "IN-PACKAGE" ), makeString( "CYC" ) );
    $sym46$CSETQ = makeSymbol( "CSETQ" );
    $list47 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "VALUE" ) );
    $sym48$CHECK_SYSTEM_PARAMETERS = makeSymbol( "CHECK-SYSTEM-PARAMETERS" );
    $sym49$_AUTO_CONTINUE_TRANSCRIPT_PROBLEMS_ = makeSymbol( "*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*" );
    $sym50$BOOLEAN = makeSymbol( "BOOLEAN" );
    $str51$If___FALSE____transcript_problems = makeString( "If ::FALSE::, transcript problems will cause error breaks that \nmake the system stop. If ::TRUE::, such problems will not cause the\nthe system to stop." );
    $sym52$_CONTINUE_AGENDA_ON_ERROR_ = makeSymbol( "*CONTINUE-AGENDA-ON-ERROR*" );
    $str53$If___FALSE____agenda_errors_will_ = makeString( "If ::FALSE::, agenda errors will cause the agenda process to halt.  \nIf ::TRUE::, the agenda continue automatically." );
    $sym54$_SUSPEND_SBHL_TYPE_CHECKING__ = makeSymbol( "*SUSPEND-SBHL-TYPE-CHECKING?*" );
    $str55$Type_checking_occurs_in_SBHL_modu = makeString( "Type checking occurs in SBHL modules iff this is ::FALSE::, which\nis slower but correcter." );
    $sym56$_REALLY_COUNT_TRANSCRIPT_OPS_ = makeSymbol( "*REALLY-COUNT-TRANSCRIPT-OPS*" );
    $str57$If___FALSE____the_System_Info_pag = makeString(
        "If ::FALSE::, the System Info page (accessible to administrators \nonly)  will estimate, rather than actually count, the number of \noperations in the transcript.  If ::TRUE::, it will actually \ncount them, which takes longer but is accurate." );
    $sym58$_DONT_RECORD_OPERATIONS_LOCALLY_ = makeSymbol( "*DONT-RECORD-OPERATIONS-LOCALLY*" );
    $str59$If___FALSE____a_local_transcript_ = makeString(
        "If ::FALSE::, a local transcript will always be written when \noperations are done, even if those operations are also being written to \nthe master transcript.  If ::TRUE::, then the image does not write to a \nlocal transcript file, and will write to the master transcript when\nit is set to transmit operations.  This allows an image that is \nstandalone, and transmitting and receiving opertions, to keep only a \nsingle copy of its operations." );
    $sym60$_START_AGENDA_AT_STARTUP__ = makeSymbol( "*START-AGENDA-AT-STARTUP?*" );
    $str61$If___FALSE____the_Cyc_agenda_is_n = makeString( "If ::FALSE::, the Cyc agenda is not started at startup, but can \nbe enabled later by the user.  If ::TRUE::, the agenda is enabled at \nstartup." );
    $sym62$_BASE_TCP_PORT_ = makeSymbol( "*BASE-TCP-PORT*" );
    $int63$3600 = makeInteger( 3600 );
    $sym64$PORT = makeSymbol( "PORT" );
    $str65$The_base_port_number_for_all_the_ = makeString( "The base port number for all the TCP services for the Cyc image." );
    $sym66$_HTML_PORT_OFFSET_ = makeSymbol( "*HTML-PORT-OFFSET*" );
    $sym67$PORT_OFFSET = makeSymbol( "PORT-OFFSET" );
    $str68$This_parameter_specifies_the_offs = makeString(
        "This parameter specifies the offset of the HTML port offset\nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range." );
    $sym69$_FI_PORT_OFFSET_ = makeSymbol( "*FI-PORT-OFFSET*" );
    $str70$This_parameter_specifies_the_offs = makeString(
        "This parameter specifies the offset of the ASCII based Cyc API\n (application program interface) service from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range." );
    $sym71$_HTTP_PORT_OFFSET_ = makeSymbol( "*HTTP-PORT-OFFSET*" );
    $str72$This_parameter_specifies_the_offs = makeString(
        "This parameter specifies the offset of the Cyc-internal HTTP port \nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range." );
    $sym73$_SERVLET_PORT_OFFSET_ = makeSymbol( "*SERVLET-PORT-OFFSET*" );
    $str74$This_parameter_specifies_the_offs = makeString(
        "This parameter specifies the offset of the Cyc-internal servlet-container port \nfrom the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range." );
    $sym75$_CFASL_PORT_OFFSET_ = makeSymbol( "*CFASL-PORT-OFFSET*" );
    $str76$This_parameter_specifies_the_offs = makeString(
        "This parameter specifies the offset of the Cyc CFASL-server,\n a binary form of the FI (API) service, from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range." );
    $sym77$_SPARQL_PORT_OFFSET_ = makeSymbol( "*SPARQL-PORT-OFFSET*" );
    $str78$This_parameter_specifies_the_offs = makeString(
        "This parameter specifies the offset of the Cyc SPARQL-server \nservice from the base port number.\nNotice that the sum of this parameter and the base port number must\nstill be a number in the valid port number range." );
    $sym79$_TCP_LOCALHOST_ONLY__ = makeSymbol( "*TCP-LOCALHOST-ONLY?*" );
    $str80$IF___FALSE____then_remote_TCP_cli = makeString(
        "IF ::FALSE::, then remote TCP clients can connect to Cyc, otherwise \nno remote connections are allowed. The most secure configuration \nleaves this parameter ::TRUE::, and uses a separate Web server to \nredirect HTTP requests to Cyc--which requires the HTML port to be\nconfigured and the HTTP port to be disabled." );
    $sym81$_PERMIT_API_HOST_ACCESS_ = makeSymbol( "*PERMIT-API-HOST-ACCESS*" );
    $str82$IF___TRUE____then_API_functions_c = makeString(
        "IF ::TRUE::, then API functions can access host services \nincluding the file system and outbound tcp connections. The most \nsecure configuration leaves this parameter ::FALSE::." );
    $sym83$_USE_TRANSCRIPT_SERVER_ = makeSymbol( "*USE-TRANSCRIPT-SERVER*" );
    $str84$IF___TRUE____then_writing_to_the_ = makeString(
        "IF ::TRUE::, then writing to the master transcript will be \ncontrolled by the Cyc Transcript Server, which will \nneed to be installed at your site. Set this to ::TRUE:: if \nyou are running multiple instances of Cyc.  If ::FALSE::, \nthen Cyc will read and write to the master transcript \nwithout regard to other processes doing the same." );
    $sym85$_MASTER_TRANSCRIPT_LOCK_HOST_ = makeSymbol( "*MASTER-TRANSCRIPT-LOCK-HOST*" );
    $list86 = ConsesLow.list( makeSymbol( "OR" ), makeSymbol( "STRING" ), makeSymbol( "UNDEFINED" ) );
    $str87$This_parameter_is_only_used_if__U = makeString(
        "This parameter is only used if *USE-TRANSCRIPT-SERVER* is ::TRUE::.  \nIf so, then this parameter should be set to the name of the host \nthat runs the transcript server; the port is specified with\n*MASTER-TRANSCRIPT-SERVER-PORT*." );
    $sym88$_MASTER_TRANSCRIPT_SERVER_PORT_ = makeSymbol( "*MASTER-TRANSCRIPT-SERVER-PORT*" );
    $int89$3608 = makeInteger( 3608 );
    $sym90$INTEGER = makeSymbol( "INTEGER" );
    $str91$This_parameter_is_only_used_if__U = makeString(
        "This parameter is only used if *USE-TRANSCRIPT-SERVER* is ::TRUE::.  \nIf so, then this parameter should be set to the port number \nof the host (specified with *MASTER-TRANSCRIPT-LOCK-HOST*)\nread service." );
    $sym92$_CB_EDITING_ENABLED__ = makeSymbol( "*CB-EDITING-ENABLED?*" );
    $str93$If___FALSE____tools_for_modifying = makeString( "If ::FALSE::, tools for modifying the knowledge base are not accessible." );
    $sym94$_CB_ALLOW_HALT_IMAGE__ = makeSymbol( "*CB-ALLOW-HALT-IMAGE?*" );
    $str95$If___FALSE____the__Halt_this_imag = makeString( "If ::FALSE::, the [Halt this image] link on the System Area page will not\nappear." );
    $sym96$_ALLOW_GUEST_TO_EDIT__ = makeSymbol( "*ALLOW-GUEST-TO-EDIT?*" );
    $str97$If___FALSE____require_authenticat = makeString( "If ::FALSE::, require authentication before allowing modifications\nto the knowledge base.  If ::TRUE::, any user is allowed to modify \nthe knowledge base." );
    $sym98$_DEFAULT_CYCLIST_NAME_ = makeSymbol( "*DEFAULT-CYCLIST-NAME*" );
    $str99$Guest = makeString( "Guest" );
    $sym100$STRING = makeSymbol( "STRING" );
    $str101$Specifies_the_name_of_the_default = makeString( "Specifies the name of the default Cyclist constant under which\nusers browse the system before they log in." );
    $sym102$_HTTP_HTDOCS_DIRECTORY_ = makeSymbol( "*HTTP-HTDOCS-DIRECTORY*" );
    $str103$httpd_htdocs = makeString( "httpd/htdocs" );
    $sym104$FULL_PATH = makeSymbol( "FULL-PATH" );
    $str105$The_directory_under_which_documen = makeString( "The directory under which documents served by the HTTP server are stored." );
    $sym106$_HTML_IMAGE_DIRECTORY_ = makeSymbol( "*HTML-IMAGE-DIRECTORY*" );
    $str107$_cycdoc_img_ = makeString( "/cycdoc/img/" );
    $str108$The_directory__relative_to__HTTP_ = makeString( "The directory, relative to *HTTP-HTDOCS-DIRECTORY*, under which \nCyc images (.gif or otherwise) are stored" );
    $sym109$_HTML_JAVASCRIPT_DIRECTORY_ = makeSymbol( "*HTML-JAVASCRIPT-DIRECTORY*" );
    $str110$_cycdoc_js_ = makeString( "/cycdoc/js/" );
    $str111$The_directory__relative_to__HTTP_ = makeString( "The directory, relative to *HTTP-HTDOCS-DIRECTORY*, under which \nJavascript files used by the browser are stored" );
    $sym112$_HTML_CSS_DIRECTORY_ = makeSymbol( "*HTML-CSS-DIRECTORY*" );
    $str113$_cycdoc_css_ = makeString( "/cycdoc/css/" );
    $sym114$_PERMIT_UTF_8_CHARACTER_DISPLAY_ = makeSymbol( "*PERMIT-UTF-8-CHARACTER-DISPLAY*" );
    $str115$If___TRUE____the_html_tools_will_ = makeString( "If ::TRUE::, the html tools will correctly display UTF-8 text\nderived from Cyc strings." );
    $sym116$_CYC_DOCUMENTATION_URL_ = makeSymbol( "*CYC-DOCUMENTATION-URL*" );
    $str117$_cycdoc_ = makeString( "/cycdoc/" );
    $str118$The_directory__relative_to__HTTP_ = makeString( "The directory, relative to *HTTP-HTDOCS-DIRECTORY*, for the \nCyc system documentation directory." );
    $sym119$_CYC_CGI_PROGRAM_ = makeSymbol( "*CYC-CGI-PROGRAM*" );
    $str120$cg = makeString( "cg" );
    $str121$The_name_of_the_CGI_program_that_ = makeString(
        "The name of the CGI program that acts as the intermediary \nbetween your WWW server and a Cyc server  Normally, the\nprogram will be called ``cg''.  However, if your WWW server requires that\nCGI program names have a certain form, such as ``cg.exe'', then change\nthis parameter to conform. This is relevant only if the HTML service\nis enabled." );
    $sym122$_CONSTANT_NAME_GREP_ENABLED_ = makeSymbol( "*CONSTANT-NAME-GREP-ENABLED*" );
    $str123$If___TRUE____the_HTML_browser_all = makeString(
        "If ::TRUE::, the HTML browser allows users to  search for\nconstants via regular expressions via an external program, rather\nthan the internal search facility. Use of this facility requires the\nconstant-name-grep CGI program and the data file constant-shell.text to\nbe installed on your WWW server, and that the HTML service be enabled." );
    $sym124$_CYC_GREP_CGI_PROGRAM_ = makeSymbol( "*CYC-GREP-CGI-PROGRAM*" );
    $str125$constant_name_grep = makeString( "constant-name-grep" );
    $str126$The_name_of_the_CGI_program_that_ = makeString(
        "The name of the CGI program that is used for performing \nregular expression searches over constant names.  Normally, the\nprogram will be called ``constant-name-grep''.  However, if your WWW server\nrequires that CGI program names have a certain form, such as \n``constant-name-grep.exe'', then change this parameter to conform.\nThis is relevant only if the HTML service is enabled." );
    $list127 = ConsesLow.list( ConsesLow.cons( makeKeyword( "CYCORP" ), makeString( "Assume a Cycorp execution context." ) ), ConsesLow.cons( makeKeyword( "UNKNOWN" ), makeString(
        "Assume an unknown execution context." ) ) );
    $sym128$_CYC_EXECUTION_CONTEXT_ = makeSymbol( "*CYC-EXECUTION-CONTEXT*" );
    $kw129$UNKNOWN = makeKeyword( "UNKNOWN" );
    $list130 = ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "*ALL-CYC-EXECUTION-CONTEXTS*" ) );
    $str131$If_the_execution_context_is_set_t = makeString(
        "If the execution context is set to :CYCORP, then the CYC image \ncan assume that it is running in Cycorp's development environment \nand make strong assumptions about setup and infrastructure." );
  }
}
/*
 * 
 * Total time: 282 ms
 * 
 */