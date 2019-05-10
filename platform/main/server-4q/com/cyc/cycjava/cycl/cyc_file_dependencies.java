package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_file_dependencies
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_file_dependencies";
  public static final String myFingerPrint = "c94368c3693b993a2d27cc91c79752e6b2254374653110a2fc6fc8cd82fb7237";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 1281L)
  public static SubLSymbol $external_file_definitions$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 1281L)
  public static SubLSymbol $html_emitted_file_dependencies$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 10470L)
  private static SubLSymbol $java_default_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 11990L)
  public static SubLSymbol $html_icon_definitions$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13066L)
  private static SubLSymbol $html_icon_default_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13199L)
  private static SubLSymbol $html_missing_icon$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLSymbol $cb_help_definitions$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  private static SubLSymbol $cb_help_default_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLSymbol $cb_icon_definitions$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  private static SubLSymbol $cb_icon_default_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  private static SubLSymbol $cb_missing_icon$;
  private static final SubLSymbol $sym0$_EXTERNAL_FILE_DEFINITIONS_;
  private static final SubLInteger $int1$64;
  private static final SubLSymbol $kw2$UNINITIALIZED;
  private static final SubLSymbol $sym3$CLET;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DEF_EXTERNAL_FILE;
  private static final SubLSymbol $kw8$BUNDLE;
  private static final SubLSymbol $kw9$DEPENDENCIES;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw13$PATH;
  private static final SubLString $str14$js;
  private static final SubLSymbol $sym15$PROGN;
  private static final SubLSymbol $sym16$PUNLESS;
  private static final SubLSymbol $sym17$EXT_DEP_ENDS_WITH;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$WARN;
  private static final SubLString $str20$Defining_javascript_file__S_witho;
  private static final SubLSymbol $kw21$JS;
  private static final SubLList $list22;
  private static final SubLString $str23$css;
  private static final SubLList $list24;
  private static final SubLString $str25$Defining_CSS_file__S_without___cs;
  private static final SubLSymbol $kw26$CSS;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$CHECK_EXTERNAL_FILE_DEFINITION;
  private static final SubLSymbol $sym30$SETHASH;
  private static final SubLSymbol $sym31$LIST;
  private static final SubLSymbol $kw32$FILENAME;
  private static final SubLSymbol $kw33$TYPE;
  private static final SubLString $str34$Unable_to_define__S_because_of_un;
  private static final SubLString $str35$Redefinition_of_external_file__S_;
  private static final SubLString $str36$Emitting__S_with_no_html_file_dep;
  private static final SubLString $str37$text_javascript;
  private static final SubLString $str38$stylesheet;
  private static final SubLString $str39$text_css;
  private static final SubLString $str40$Unable_to_emit_file__S___S__of_ty;
  private static final SubLSymbol $sym41$UNDEFINED_EXTERNAL_DEPENDENCIES;
  private static final SubLSymbol $sym42$REDUNDANT_DEPENDENCY_;
  private static final SubLList $list43;
  private static final SubLString $str44$java_;
  private static final SubLString $str45$_;
  private static final SubLString $str46$_lib_;
  private static final SubLString $str47$jar;
  private static final SubLString $str48$lib_;
  private static final SubLSymbol $sym49$_HTML_ICON_DEFINITIONS_;
  private static final SubLInteger $int50$32;
  private static final SubLList $list51;
  private static final SubLString $str52$;
  private static final SubLString $str53$missing_gif;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$ID;
  private static final SubLSymbol $kw57$NAME;
  private static final SubLSymbol $kw58$ISMAP;
  private static final SubLSymbol $kw59$HEIGHT;
  private static final SubLSymbol $kw60$WIDTH;
  private static final SubLSymbol $kw61$ALT_OVERRIDE;
  private static final SubLSymbol $kw62$ALIGN_OVERRIDE;
  private static final SubLSymbol $kw63$BORDER_OVERRIDE;
  private static final SubLSymbol $sym64$IMAGE_SRC;
  private static final SubLSymbol $sym65$ALIGN;
  private static final SubLSymbol $sym66$ALT;
  private static final SubLSymbol $sym67$BORDER;
  private static final SubLSymbol $sym68$CCONCATENATE;
  private static final SubLSymbol $sym69$_HTML_IMAGE_DIRECTORY_;
  private static final SubLSymbol $sym70$HTML_ICON_SRC;
  private static final SubLSymbol $sym71$FIF;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$GET_HTML_ICON_ALT_STRING;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$HTML_FANCY_IMAGE;
  private static final SubLSymbol $kw76$ALT;
  private static final SubLSymbol $kw77$ALIGN;
  private static final SubLSymbol $kw78$BORDER;
  private static final SubLSymbol $sym79$_CB_HELP_DEFINITIONS_;
  private static final SubLList $list80;
  private static final SubLString $str81$help_;
  private static final SubLString $str82$Help_file_not_found_for__A;
  private static final SubLSymbol $sym83$_CB_ICON_DEFINITIONS_;
  private static final SubLString $str84$cb_;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$IMAGE_SRC;
  private static final SubLSymbol $sym88$ALIGN;
  private static final SubLSymbol $sym89$ALT;
  private static final SubLSymbol $sym90$BORDER;
  private static final SubLSymbol $sym91$CB_ICON_FILE_PATH;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$CB_GET_ICON_ALT_STRING;
  private static final SubLSymbol $sym94$COMPILE_CB_BROWSER_DEPENDENCIES;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$JAVASCRIPT_KEYWORDS;
  private static final SubLSymbol $sym97$JAVASCRIPT_FILE_PATH;
  private static final SubLSymbol $sym98$HTML_ICON_KEYWORDS;
  private static final SubLSymbol $sym99$HTML_ICON_FILE_PATH;
  private static final SubLSymbol $sym100$CB_HELP_KEYWORDS;
  private static final SubLSymbol $sym101$CB_HELP_FILE_PATH;
  private static final SubLSymbol $sym102$CB_ICON_KEYWORDS;
  private static final SubLSymbol $sym103$CSS_KEYWORDS;
  private static final SubLSymbol $sym104$CSS_FILE_PATH;
  private static final SubLSymbol $sym105$CB_BROWSER_DEPENDENCY_MANIFEST;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 1281L)
  public static SubLObject with_new_html_file_dependency_space(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym3$CLET, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 1281L)
  public static SubLObject with_possibly_new_html_file_dependency_space(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym3$CLET, $list5, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 2193L)
  public static SubLObject web_bundle(final SubLObject keyword)
  {
    return emit_external_file_with_dependencies( keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 2193L)
  public static SubLObject def_web_bundle(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject file_keyword = NIL;
    SubLObject dependencies = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    file_keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    dependencies = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym7$DEF_EXTERNAL_FILE, file_keyword, NIL, NIL, $kw8$BUNDLE, $kw9$DEPENDENCIES, dependencies );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
  public static SubLObject javascript(final SubLObject keyword)
  {
    return emit_external_file_with_dependencies( keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
  public static SubLObject def_javascript(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject file_keyword = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    file_keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    filename = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list10 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list10 );
      if( NIL == conses_high.member( current_$1, $list11, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    }
    final SubLObject path_tail = cdestructuring_bind.property_list_member( $kw13$PATH, current );
    final SubLObject path = ( NIL != path_tail ) ? conses_high.cadr( path_tail ) : $str14$js;
    final SubLObject dependencies_tail = cdestructuring_bind.property_list_member( $kw9$DEPENDENCIES, current );
    final SubLObject dependencies = ( NIL != dependencies_tail ) ? conses_high.cadr( dependencies_tail ) : NIL;
    return ConsesLow.list( $sym15$PROGN, ConsesLow.list( $sym16$PUNLESS, ConsesLow.listS( $sym17$EXT_DEP_ENDS_WITH, filename, $list18 ), ConsesLow.list( $sym19$WARN, $str20$Defining_javascript_file__S_witho,
        filename ) ), ConsesLow.list( $sym7$DEF_EXTERNAL_FILE, file_keyword, path, filename, $kw21$JS, $kw9$DEPENDENCIES, dependencies ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
  public static SubLObject javascript_keywords()
  {
    return external_dependencies_of_type( $kw21$JS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
  public static SubLObject get_javascript_filename(final SubLObject keyword)
  {
    return get_external_dependency_filename( keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 3090L)
  public static SubLObject javascript_file_path(final SubLObject keyword)
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), get_external_dependency_data( keyword ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
  public static SubLObject css(final SubLObject keyword)
  {
    return emit_external_file_with_dependencies( keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
  public static SubLObject def_css(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject file_keyword = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    file_keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    filename = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
      if( NIL == conses_high.member( current_$2, $list11, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    }
    final SubLObject path_tail = cdestructuring_bind.property_list_member( $kw13$PATH, current );
    final SubLObject path = ( NIL != path_tail ) ? conses_high.cadr( path_tail ) : $str23$css;
    final SubLObject dependencies_tail = cdestructuring_bind.property_list_member( $kw9$DEPENDENCIES, current );
    final SubLObject dependencies = ( NIL != dependencies_tail ) ? conses_high.cadr( dependencies_tail ) : NIL;
    return ConsesLow.list( $sym15$PROGN, ConsesLow.list( $sym16$PUNLESS, ConsesLow.listS( $sym17$EXT_DEP_ENDS_WITH, filename, $list24 ), ConsesLow.list( $sym19$WARN, $str25$Defining_CSS_file__S_without___cs,
        filename ) ), ConsesLow.list( $sym7$DEF_EXTERNAL_FILE, file_keyword, path, filename, $kw26$CSS, $kw9$DEPENDENCIES, dependencies ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
  public static SubLObject css_keywords()
  {
    return external_dependencies_of_type( $kw26$CSS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
  public static SubLObject get_css_filename(final SubLObject keyword)
  {
    return get_external_dependency_filename( keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 4620L)
  public static SubLObject css_file_path(final SubLObject keyword)
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), get_external_dependency_data( keyword ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject def_external_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject file_keyword = NIL;
    SubLObject path = NIL;
    SubLObject filename = NIL;
    SubLObject file_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    file_keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    path = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    filename = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    file_type = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list27 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list27 );
      if( NIL == conses_high.member( current_$3, $list28, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    }
    final SubLObject dependencies_tail = cdestructuring_bind.property_list_member( $kw9$DEPENDENCIES, current );
    final SubLObject dependencies = ( NIL != dependencies_tail ) ? conses_high.cadr( dependencies_tail ) : NIL;
    return ConsesLow.list( $sym15$PROGN, ConsesLow.list( $sym29$CHECK_EXTERNAL_FILE_DEFINITION, file_keyword, path, filename, file_type, dependencies ), ConsesLow.list( $sym30$SETHASH, file_keyword,
        $sym0$_EXTERNAL_FILE_DEFINITIONS_, ConsesLow.list( new SubLObject[]
        { $sym31$LIST, $kw13$PATH, path, $kw32$FILENAME, filename, $kw9$DEPENDENCIES, dependencies, $kw33$TYPE, file_type
        } ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject check_external_file_definition(final SubLObject file_keyword, final SubLObject path, final SubLObject filename, final SubLObject file_type, final SubLObject dependencies)
  {
    if( NIL != undefined_external_dependencies( dependencies ) )
    {
      Errors.error( $str34$Unable_to_define__S_because_of_un, file_keyword, undefined_external_dependencies( dependencies ) );
    }
    else if( NIL != Hashtables.gethash( file_keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED ) && NIL == redundant_dependencyP( path, filename, dependencies, Hashtables.gethash( file_keyword,
        $external_file_definitions$.getGlobalValue(), UNPROVIDED ) ) )
    {
      Errors.warn( $str35$Redefinition_of_external_file__S_, new SubLObject[] { file_keyword, Hashtables.gethash( file_keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED ), filename, path, file_type,
        dependencies
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject emit_external_file_with_dependencies(final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $html_emitted_file_dependencies$.getDynamicValue( thread ) != $kw2$UNINITIALIZED && NIL != subl_promotions.memberP( keyword, $html_emitted_file_dependencies$.getDynamicValue( thread ), Symbols.symbol_function(
        EQ ), UNPROVIDED ) )
    {
      return NIL;
    }
    if( $html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED )
    {
      Errors.warn( $str36$Emitting__S_with_no_html_file_dep, keyword );
    }
    thread.resetMultipleValues();
    final SubLObject file_path = get_external_dependency_data( keyword );
    final SubLObject file_type = thread.secondMultipleValue();
    final SubLObject dependencies = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = dependencies;
    SubLObject d = NIL;
    d = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      emit_external_file_with_dependencies( d );
      cdolist_list_var = cdolist_list_var.rest();
      d = cdolist_list_var.first();
    }
    final SubLObject _prev_bind_0 = html_macros.$suppress_html_source_readability_terpriP$.currentBinding( thread );
    try
    {
      html_macros.$suppress_html_source_readability_terpriP$.bind( T, thread );
      final SubLObject pcase_var = file_type;
      if( pcase_var.eql( $kw21$JS ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_script_src$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( file_path );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_script_type$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str37$text_javascript );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
        }
        html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
      }
      else if( pcase_var.eql( $kw26$CSS ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_link_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_link_rel$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str38$stylesheet );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != file_path )
        {
          html_utilities.html_markup( html_macros.$html_link_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( file_path );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_link_type$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str39$text_css );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      }
      else if( !pcase_var.eql( $kw8$BUNDLE ) )
      {
        Errors.error( $str40$Unable_to_emit_file__S___S__of_ty, keyword, file_path, file_type );
      }
    }
    finally
    {
      html_macros.$suppress_html_source_readability_terpriP$.rebind( _prev_bind_0, thread );
    }
    if( $html_emitted_file_dependencies$.getDynamicValue( thread ) != $kw2$UNINITIALIZED )
    {
      $html_emitted_file_dependencies$.setDynamicValue( ConsesLow.cons( keyword, $html_emitted_file_dependencies$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject external_dependencies_of_type(final SubLObject type)
  {
    SubLObject keywords = NIL;
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $external_file_definitions$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        if( conses_high.getf( val, $kw33$TYPE, UNPROVIDED ).eql( type ) )
        {
          keywords = ConsesLow.cons( key, keywords );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return keywords;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject get_external_dependency_filename(final SubLObject keyword)
  {
    return conses_high.getf( Hashtables.gethash( keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED ), $kw32$FILENAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject undefined_external_dependencies(final SubLObject dependency_list)
  {
    SubLObject undefined = NIL;
    SubLObject cdolist_list_var = dependency_list;
    SubLObject dependency_keyword = NIL;
    dependency_keyword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == external_dependency_definedP( dependency_keyword ) )
      {
        undefined = ConsesLow.cons( dependency_keyword, undefined );
      }
      cdolist_list_var = cdolist_list_var.rest();
      dependency_keyword = cdolist_list_var.first();
    }
    return undefined;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject external_dependency_definedP(final SubLObject keyword)
  {
    return Hashtables.gethash( keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject redundant_dependencyP(final SubLObject path, final SubLObject filename, final SubLObject dependencies, final SubLObject existing_definition)
  {
    return makeBoolean( conses_high.getf( existing_definition, $kw32$FILENAME, UNPROVIDED ).equal( filename ) && conses_high.getf( existing_definition, $kw13$PATH, UNPROVIDED ).equal( path ) && conses_high.getf(
        existing_definition, $kw9$DEPENDENCIES, UNPROVIDED ).equal( dependencies ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject get_external_dependency_data(final SubLObject keyword)
  {
    final SubLObject file_def = Hashtables.gethash( keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED );
    final SubLObject path = conses_high.getf( file_def, $kw13$PATH, UNPROVIDED );
    final SubLObject filename = conses_high.getf( file_def, $kw32$FILENAME, UNPROVIDED );
    final SubLObject type = conses_high.getf( file_def, $kw33$TYPE, UNPROVIDED );
    final SubLObject dependencies = conses_high.getf( file_def, $kw9$DEPENDENCIES, UNPROVIDED );
    return Values.values( doc_filepath( path, filename ), type, dependencies );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject doc_filepath(final SubLObject relative_path, final SubLObject filename)
  {
    if( !relative_path.isString() || !filename.isString() )
    {
      return NIL;
    }
    return file_utilities.relative_filename( Sequences.cconcatenate( file_utilities.possibly_append_path_separator_char( system_parameters.cyc_documentation_url() ), file_utilities.possibly_append_path_separator_char(
        relative_path ) ), filename, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 6074L)
  public static SubLObject ext_dep_ends_with(final SubLObject string, final SubLObject suffix)
  {
    final SubLObject str_length = Sequences.length( string );
    final SubLObject suff_length = Sequences.length( suffix );
    return makeBoolean( str_length.numGE( suff_length ) && Sequences.subseq( string, Numbers.subtract( str_length, suff_length ), UNPROVIDED ).equal( suffix ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 10470L)
  public static SubLObject java_applet_lib_file_path(final SubLObject java_applet_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.cconcatenate( system_parameters.$http_htdocs_directory$.getDynamicValue( thread ), new SubLObject[] { $str45$_, $java_default_directory$.getGlobalValue(), java_applet_name, $str46$_lib_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 10470L)
  public static SubLObject java_applet_archive_string(final SubLObject java_applet_name)
  {
    final SubLObject jar_directory = java_applet_lib_file_path( java_applet_name );
    final SubLObject filenames = Filesys.directory( jar_directory, UNPROVIDED );
    SubLObject lib_filenames = NIL;
    SubLObject cdolist_list_var = filenames;
    SubLObject filename = NIL;
    filename = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.ends_with( filename, $str47$jar, UNPROVIDED ) )
      {
        lib_filenames = ConsesLow.cons( Sequences.cconcatenate( $str48$lib_, filename ), lib_filenames );
      }
      cdolist_list_var = cdolist_list_var.rest();
      filename = cdolist_list_var.first();
    }
    return string_utilities.bunge( lib_filenames, Characters.CHAR_comma );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12191L)
  public static SubLObject html_icon_keywords()
  {
    return hash_table_utilities.hash_table_keys( $html_icon_definitions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12281L)
  public static SubLObject def_html_icon(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject icon_keyword = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    icon_keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    filename = current.first();
    current = current.rest();
    final SubLObject alt_string = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list51 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym30$SETHASH, icon_keyword, $sym49$_HTML_ICON_DEFINITIONS_, ConsesLow.list( $sym31$LIST, filename, alt_string ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list51 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12702L)
  public static SubLObject get_html_icon_filename(final SubLObject icon_keyword)
  {
    return Hashtables.gethash( icon_keyword, $html_icon_definitions$.getGlobalValue(), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12823L)
  public static SubLObject get_html_icon_alt_string(final SubLObject icon_keyword)
  {
    return conses_high.second( Hashtables.gethash( icon_keyword, $html_icon_definitions$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 12947L)
  public static SubLObject html_icon_existsP(final SubLObject icon_keyword)
  {
    return string_utilities.non_empty_stringP( get_html_icon_filename( icon_keyword ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13367L)
  public static SubLObject html_missing_icon()
  {
    return $html_missing_icon$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13436L)
  public static SubLObject html_icon_file_path(final SubLObject icon_keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject icon_filename = get_html_icon_filename( icon_keyword );
    return Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), new SubLObject[] { $html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename
        : html_missing_icon()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 13722L)
  public static SubLObject html_icon_src(final SubLObject icon_keyword)
  {
    final SubLObject icon_filename = get_html_icon_filename( icon_keyword );
    return Sequences.cconcatenate( $html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : html_missing_icon() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14097L)
  public static SubLObject html_icon(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject icon_keyword = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    icon_keyword = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list54 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list54 );
      if( NIL == conses_high.member( current_$5, $list55, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
    }
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw56$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw57$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject ismap_tail = cdestructuring_bind.property_list_member( $kw58$ISMAP, current );
    final SubLObject ismap = ( NIL != ismap_tail ) ? conses_high.cadr( ismap_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw59$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw60$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject alt_override_tail = cdestructuring_bind.property_list_member( $kw61$ALT_OVERRIDE, current );
    final SubLObject alt_override = ( NIL != alt_override_tail ) ? conses_high.cadr( alt_override_tail ) : NIL;
    final SubLObject align_override_tail = cdestructuring_bind.property_list_member( $kw62$ALIGN_OVERRIDE, current );
    final SubLObject align_override = ( NIL != align_override_tail ) ? conses_high.cadr( align_override_tail ) : NIL;
    final SubLObject border_override_tail = cdestructuring_bind.property_list_member( $kw63$BORDER_OVERRIDE, current );
    final SubLObject border_override = ( NIL != border_override_tail ) ? conses_high.cadr( border_override_tail ) : NIL;
    final SubLObject image_src = $sym64$IMAGE_SRC;
    final SubLObject align = $sym65$ALIGN;
    final SubLObject alt = $sym66$ALT;
    final SubLObject border = $sym67$BORDER;
    return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( image_src, ConsesLow.list( $sym68$CCONCATENATE, $sym69$_HTML_IMAGE_DIRECTORY_, ConsesLow.list( $sym70$HTML_ICON_SRC, icon_keyword ) ) ), ConsesLow
        .list( align, ConsesLow.listS( $sym71$FIF, align_override, align_override, $list72 ) ), ConsesLow.list( alt, ConsesLow.list( $sym71$FIF, alt_override, alt_override, ConsesLow.list(
            $sym73$GET_HTML_ICON_ALT_STRING, icon_keyword ) ) ), ConsesLow.list( border, ConsesLow.listS( $sym71$FIF, border_override, border_override, $list74 ) ) ), ConsesLow.list( new SubLObject[]
            { $sym75$HTML_FANCY_IMAGE, image_src, $kw56$ID, id, $kw57$NAME, name, $kw58$ISMAP, ismap, $kw59$HEIGHT, height, $kw60$WIDTH, width, $kw76$ALT, alt, $kw77$ALIGN, align, $kw78$BORDER, border
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_help_keywords()
  {
    return hash_table_utilities.hash_table_keys( $cb_help_definitions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject def_cb_help(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject help_keyword = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    help_keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    filename = current.first();
    current = current.rest();
    final SubLObject desc_string = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list80 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym30$SETHASH, help_keyword, $sym79$_CB_HELP_DEFINITIONS_, ConsesLow.list( $sym31$LIST, filename, desc_string ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_get_help_filename(final SubLObject help_keyword)
  {
    return Hashtables.gethash( help_keyword, $cb_help_definitions$.getGlobalValue(), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_get_help_desc_string(final SubLObject help_keyword)
  {
    return conses_high.second( Hashtables.gethash( help_keyword, $cb_help_definitions$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_help_existsP(final SubLObject help_keyword)
  {
    return string_utilities.non_empty_stringP( cb_get_help_filename( help_keyword ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_help_file_path(final SubLObject help_keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject help_filename = cb_get_help_filename( help_keyword );
    if( !help_filename.isString() )
    {
      Errors.warn( $str82$Help_file_not_found_for__A, help_keyword );
    }
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( system_parameters.$cyc_documentation_url$.getDynamicValue( thread ) ), new SubLObject[] { $str81$help_, format_nil.format_nil_a_no_copy( help_filename )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_icon_keywords()
  {
    return hash_table_utilities.hash_table_keys( $cb_icon_definitions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject def_cb_icon(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject icon_keyword = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    icon_keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    filename = current.first();
    current = current.rest();
    final SubLObject alt_string = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list51 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym30$SETHASH, icon_keyword, $sym83$_CB_ICON_DEFINITIONS_, ConsesLow.list( $sym31$LIST, filename, alt_string ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list51 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_get_icon_filename(final SubLObject icon_keyword)
  {
    return Hashtables.gethash( icon_keyword, $cb_icon_definitions$.getGlobalValue(), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_get_icon_alt_string(final SubLObject icon_keyword)
  {
    return conses_high.second( Hashtables.gethash( icon_keyword, $cb_icon_definitions$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_icon_existsP(final SubLObject icon_keyword)
  {
    return string_utilities.non_empty_stringP( cb_get_icon_filename( icon_keyword ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_missing_icon()
  {
    return $cb_missing_icon$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_icon_file_path(final SubLObject icon_keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject icon_filename = cb_get_icon_filename( icon_keyword );
    return Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), new SubLObject[] { $cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename
        : $cb_missing_icon$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_icon_src(final SubLObject icon_keyword)
  {
    final SubLObject icon_filename = cb_get_icon_filename( icon_keyword );
    return Sequences.cconcatenate( $cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : $cb_missing_icon$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 14731L)
  public static SubLObject cb_icon(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject icon_keyword = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    icon_keyword = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list85 );
      if( NIL == conses_high.member( current_$6, $list86, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw12$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    }
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw57$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject ismap_tail = cdestructuring_bind.property_list_member( $kw58$ISMAP, current );
    final SubLObject ismap = ( NIL != ismap_tail ) ? conses_high.cadr( ismap_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw59$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw60$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject alt_override_tail = cdestructuring_bind.property_list_member( $kw61$ALT_OVERRIDE, current );
    final SubLObject alt_override = ( NIL != alt_override_tail ) ? conses_high.cadr( alt_override_tail ) : NIL;
    final SubLObject align_override_tail = cdestructuring_bind.property_list_member( $kw62$ALIGN_OVERRIDE, current );
    final SubLObject align_override = ( NIL != align_override_tail ) ? conses_high.cadr( align_override_tail ) : NIL;
    final SubLObject border_override_tail = cdestructuring_bind.property_list_member( $kw63$BORDER_OVERRIDE, current );
    final SubLObject border_override = ( NIL != border_override_tail ) ? conses_high.cadr( border_override_tail ) : NIL;
    final SubLObject image_src = $sym87$IMAGE_SRC;
    final SubLObject align = $sym88$ALIGN;
    final SubLObject alt = $sym89$ALT;
    final SubLObject border = $sym90$BORDER;
    return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( image_src, ConsesLow.list( $sym91$CB_ICON_FILE_PATH, icon_keyword ) ), ConsesLow.list( align, ConsesLow.listS( $sym71$FIF, align_override,
        align_override, $list92 ) ), ConsesLow.list( alt, ConsesLow.list( $sym71$FIF, alt_override, alt_override, ConsesLow.list( $sym93$CB_GET_ICON_ALT_STRING, icon_keyword ) ) ), ConsesLow.list( border, ConsesLow
            .listS( $sym71$FIF, border_override, border_override, $list74 ) ) ), ConsesLow.list( new SubLObject[]
            { $sym75$HTML_FANCY_IMAGE, image_src, $kw57$NAME, name, $kw58$ISMAP, ismap, $kw59$HEIGHT, height, $kw60$WIDTH, width, $kw76$ALT, alt, $kw77$ALIGN, align, $kw78$BORDER, border
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 18419L)
  public static SubLObject compile_cb_browser_dependencies(SubLObject justify)
  {
    if( justify == UNPROVIDED )
    {
      justify = NIL;
    }
    final SubLObject keyword_definitions = compile_cb_browser_dependency_definitions();
    SubLObject paths = NIL;
    SubLObject cdolist_list_var = keyword_definitions;
    SubLObject keyword_definition = NIL;
    keyword_definition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = keyword_definition;
      SubLObject keyword_producer = NIL;
      SubLObject keyword_mapping_fn = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
      keyword_producer = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
      keyword_mapping_fn = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$7;
        final SubLObject keywords = cdolist_list_var_$7 = Functions.funcall( keyword_producer );
        SubLObject keyword = NIL;
        keyword = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          final SubLObject file_path = cb_browser_dependency_map_keyword_to_path( keyword, keyword_mapping_fn );
          final SubLObject datum_$8 = ( NIL != justify ) ? ConsesLow.list( file_path, keyword, keyword_producer ) : file_path;
          paths = ConsesLow.cons( datum_$8, paths );
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          keyword = cdolist_list_var_$7.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list95 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      keyword_definition = cdolist_list_var.first();
    }
    return Sequences.nreverse( paths );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 19423L)
  public static SubLObject compile_cb_browser_dependency_definitions()
  {
    SubLObject keyword_definitions = NIL;
    keyword_definitions = ConsesLow.cons( ConsesLow.list( $sym96$JAVASCRIPT_KEYWORDS, $sym97$JAVASCRIPT_FILE_PATH ), keyword_definitions );
    keyword_definitions = ConsesLow.cons( ConsesLow.list( $sym98$HTML_ICON_KEYWORDS, $sym99$HTML_ICON_FILE_PATH ), keyword_definitions );
    keyword_definitions = ConsesLow.cons( ConsesLow.list( $sym100$CB_HELP_KEYWORDS, $sym101$CB_HELP_FILE_PATH ), keyword_definitions );
    keyword_definitions = ConsesLow.cons( ConsesLow.list( $sym102$CB_ICON_KEYWORDS, $sym91$CB_ICON_FILE_PATH ), keyword_definitions );
    keyword_definitions = ConsesLow.cons( ConsesLow.list( $sym103$CSS_KEYWORDS, $sym104$CSS_FILE_PATH ), keyword_definitions );
    return Sequences.nreverse( keyword_definitions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 20010L)
  public static SubLObject cb_browser_dependency_map_keyword_to_path(final SubLObject keyword, final SubLObject mapping_fn)
  {
    SubLObject file_path = Functions.funcall( mapping_fn, keyword );
    if( NIL != Characters.charE( Characters.CHAR_slash, string_utilities.first_char( file_path ) ) )
    {
      file_path = string_utilities.strip_first( file_path );
    }
    return file_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-file-dependencies.lisp", position = 20284L)
  public static SubLObject cb_browser_dependency_manifest(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject cdolist_list_var = compile_cb_browser_dependencies( UNPROVIDED );
    SubLObject path = NIL;
    path = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      streams_high.write_string( path, stream, UNPROVIDED, UNPROVIDED );
      streams_high.terpri( stream );
      cdolist_list_var = cdolist_list_var.rest();
      path = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_cyc_file_dependencies_file()
  {
    SubLFiles.declareMacro( me, "with_new_html_file_dependency_space", "WITH-NEW-HTML-FILE-DEPENDENCY-SPACE" );
    SubLFiles.declareMacro( me, "with_possibly_new_html_file_dependency_space", "WITH-POSSIBLY-NEW-HTML-FILE-DEPENDENCY-SPACE" );
    SubLFiles.declareFunction( me, "web_bundle", "WEB-BUNDLE", 1, 0, false );
    SubLFiles.declareMacro( me, "def_web_bundle", "DEF-WEB-BUNDLE" );
    SubLFiles.declareFunction( me, "javascript", "JAVASCRIPT", 1, 0, false );
    SubLFiles.declareMacro( me, "def_javascript", "DEF-JAVASCRIPT" );
    SubLFiles.declareFunction( me, "javascript_keywords", "JAVASCRIPT-KEYWORDS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_javascript_filename", "GET-JAVASCRIPT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "javascript_file_path", "JAVASCRIPT-FILE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "css", "CSS", 1, 0, false );
    SubLFiles.declareMacro( me, "def_css", "DEF-CSS" );
    SubLFiles.declareFunction( me, "css_keywords", "CSS-KEYWORDS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_css_filename", "GET-CSS-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "css_file_path", "CSS-FILE-PATH", 1, 0, false );
    SubLFiles.declareMacro( me, "def_external_file", "DEF-EXTERNAL-FILE" );
    SubLFiles.declareFunction( me, "check_external_file_definition", "CHECK-EXTERNAL-FILE-DEFINITION", 5, 0, false );
    SubLFiles.declareFunction( me, "emit_external_file_with_dependencies", "EMIT-EXTERNAL-FILE-WITH-DEPENDENCIES", 1, 0, false );
    SubLFiles.declareFunction( me, "external_dependencies_of_type", "EXTERNAL-DEPENDENCIES-OF-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_external_dependency_filename", "GET-EXTERNAL-DEPENDENCY-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "undefined_external_dependencies", "UNDEFINED-EXTERNAL-DEPENDENCIES", 1, 0, false );
    SubLFiles.declareFunction( me, "external_dependency_definedP", "EXTERNAL-DEPENDENCY-DEFINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "redundant_dependencyP", "REDUNDANT-DEPENDENCY?", 4, 0, false );
    SubLFiles.declareFunction( me, "get_external_dependency_data", "GET-EXTERNAL-DEPENDENCY-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "doc_filepath", "DOC-FILEPATH", 2, 0, false );
    SubLFiles.declareFunction( me, "ext_dep_ends_with", "EXT-DEP-ENDS-WITH", 2, 0, false );
    SubLFiles.declareFunction( me, "java_applet_lib_file_path", "JAVA-APPLET-LIB-FILE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "java_applet_archive_string", "JAVA-APPLET-ARCHIVE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_icon_keywords", "HTML-ICON-KEYWORDS", 0, 0, false );
    SubLFiles.declareMacro( me, "def_html_icon", "DEF-HTML-ICON" );
    SubLFiles.declareFunction( me, "get_html_icon_filename", "GET-HTML-ICON-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "get_html_icon_alt_string", "GET-HTML-ICON-ALT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_icon_existsP", "HTML-ICON-EXISTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "html_missing_icon", "HTML-MISSING-ICON", 0, 0, false );
    SubLFiles.declareFunction( me, "html_icon_file_path", "HTML-ICON-FILE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "html_icon_src", "HTML-ICON-SRC", 1, 0, false );
    SubLFiles.declareMacro( me, "html_icon", "HTML-ICON" );
    SubLFiles.declareFunction( me, "cb_help_keywords", "CB-HELP-KEYWORDS", 0, 0, false );
    SubLFiles.declareMacro( me, "def_cb_help", "DEF-CB-HELP" );
    SubLFiles.declareFunction( me, "cb_get_help_filename", "CB-GET-HELP-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_get_help_desc_string", "CB-GET-HELP-DESC-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_help_existsP", "CB-HELP-EXISTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_help_file_path", "CB-HELP-FILE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_icon_keywords", "CB-ICON-KEYWORDS", 0, 0, false );
    SubLFiles.declareMacro( me, "def_cb_icon", "DEF-CB-ICON" );
    SubLFiles.declareFunction( me, "cb_get_icon_filename", "CB-GET-ICON-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_get_icon_alt_string", "CB-GET-ICON-ALT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_icon_existsP", "CB-ICON-EXISTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_missing_icon", "CB-MISSING-ICON", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_icon_file_path", "CB-ICON-FILE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_icon_src", "CB-ICON-SRC", 1, 0, false );
    SubLFiles.declareMacro( me, "cb_icon", "CB-ICON" );
    SubLFiles.declareFunction( me, "compile_cb_browser_dependencies", "COMPILE-CB-BROWSER-DEPENDENCIES", 0, 1, false );
    SubLFiles.declareFunction( me, "compile_cb_browser_dependency_definitions", "COMPILE-CB-BROWSER-DEPENDENCY-DEFINITIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_browser_dependency_map_keyword_to_path", "CB-BROWSER-DEPENDENCY-MAP-KEYWORD-TO-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_browser_dependency_manifest", "CB-BROWSER-DEPENDENCY-MANIFEST", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_cyc_file_dependencies_file()
  {
    $external_file_definitions$ = SubLFiles.deflexical( "*EXTERNAL-FILE-DEFINITIONS*", maybeDefault( $sym0$_EXTERNAL_FILE_DEFINITIONS_, $external_file_definitions$, () -> ( Hashtables.make_hash_table( $int1$64,
        UNPROVIDED, UNPROVIDED ) ) ) );
    $html_emitted_file_dependencies$ = SubLFiles.defparameter( "*HTML-EMITTED-FILE-DEPENDENCIES*", $kw2$UNINITIALIZED );
    $java_default_directory$ = SubLFiles.deflexical( "*JAVA-DEFAULT-DIRECTORY*", $str44$java_ );
    $html_icon_definitions$ = SubLFiles.deflexical( "*HTML-ICON-DEFINITIONS*", maybeDefault( $sym49$_HTML_ICON_DEFINITIONS_, $html_icon_definitions$, () -> ( Hashtables.make_hash_table( $int50$32, UNPROVIDED,
        UNPROVIDED ) ) ) );
    $html_icon_default_directory$ = SubLFiles.deflexical( "*HTML-ICON-DEFAULT-DIRECTORY*", $str52$ );
    $html_missing_icon$ = SubLFiles.deflexical( "*HTML-MISSING-ICON*", $str53$missing_gif );
    $cb_help_definitions$ = SubLFiles.deflexical( "*CB-HELP-DEFINITIONS*", maybeDefault( $sym79$_CB_HELP_DEFINITIONS_, $cb_help_definitions$, () -> ( Hashtables.make_hash_table( $int50$32, UNPROVIDED, UNPROVIDED ) ) ) );
    $cb_help_default_directory$ = SubLFiles.deflexical( "*CB-HELP-DEFAULT-DIRECTORY*", $str81$help_ );
    $cb_icon_definitions$ = SubLFiles.deflexical( "*CB-ICON-DEFINITIONS*", maybeDefault( $sym83$_CB_ICON_DEFINITIONS_, $cb_icon_definitions$, () -> ( Hashtables.make_hash_table( $int50$32, UNPROVIDED, UNPROVIDED ) ) ) );
    $cb_icon_default_directory$ = SubLFiles.deflexical( "*CB-ICON-DEFAULT-DIRECTORY*", $str84$cb_ );
    $cb_missing_icon$ = SubLFiles.deflexical( "*CB-MISSING-ICON*", $str53$missing_gif );
    return NIL;
  }

  public static SubLObject setup_cyc_file_dependencies_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_EXTERNAL_FILE_DEFINITIONS_ );
    access_macros.register_macro_helper( $sym29$CHECK_EXTERNAL_FILE_DEFINITION, $sym7$DEF_EXTERNAL_FILE );
    access_macros.register_macro_helper( $sym41$UNDEFINED_EXTERNAL_DEPENDENCIES, $sym7$DEF_EXTERNAL_FILE );
    access_macros.register_macro_helper( $sym42$REDUNDANT_DEPENDENCY_, $sym7$DEF_EXTERNAL_FILE );
    access_macros.register_macro_helper( $sym17$EXT_DEP_ENDS_WITH, $list43 );
    subl_macro_promotions.declare_defglobal( $sym49$_HTML_ICON_DEFINITIONS_ );
    subl_macro_promotions.declare_defglobal( $sym79$_CB_HELP_DEFINITIONS_ );
    subl_macro_promotions.declare_defglobal( $sym83$_CB_ICON_DEFINITIONS_ );
    access_macros.register_external_symbol( $sym94$COMPILE_CB_BROWSER_DEPENDENCIES );
    access_macros.register_external_symbol( $sym105$CB_BROWSER_DEPENDENCY_MANIFEST );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyc_file_dependencies_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyc_file_dependencies_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyc_file_dependencies_file();
  }
  static
  {
    me = new cyc_file_dependencies();
    $external_file_definitions$ = null;
    $html_emitted_file_dependencies$ = null;
    $java_default_directory$ = null;
    $html_icon_definitions$ = null;
    $html_icon_default_directory$ = null;
    $html_missing_icon$ = null;
    $cb_help_definitions$ = null;
    $cb_help_default_directory$ = null;
    $cb_icon_definitions$ = null;
    $cb_icon_default_directory$ = null;
    $cb_missing_icon$ = null;
    $sym0$_EXTERNAL_FILE_DEFINITIONS_ = makeSymbol( "*EXTERNAL-FILE-DEFINITIONS*" );
    $int1$64 = makeInteger( 64 );
    $kw2$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym3$CLET = makeSymbol( "CLET" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-EMITTED-FILE-DEPENDENCIES*" ), ConsesLow.list( makeSymbol( "LIST" ) ) ) );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-EMITTED-FILE-DEPENDENCIES*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( EQ, makeSymbol( "*HTML-EMITTED-FILE-DEPENDENCIES*" ), makeKeyword(
        "UNINITIALIZED" ) ), ConsesLow.list( makeSymbol( "LIST" ) ), makeSymbol( "*HTML-EMITTED-FILE-DEPENDENCIES*" ) ) ) );
    $list6 = ConsesLow.list( makeSymbol( "FILE-KEYWORD" ), makeSymbol( "DEPENDENCIES" ) );
    $sym7$DEF_EXTERNAL_FILE = makeSymbol( "DEF-EXTERNAL-FILE" );
    $kw8$BUNDLE = makeKeyword( "BUNDLE" );
    $kw9$DEPENDENCIES = makeKeyword( "DEPENDENCIES" );
    $list10 = ConsesLow.list( makeSymbol( "FILE-KEYWORD" ), makeSymbol( "FILENAME" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PATH" ), makeString( "js" ) ), makeSymbol( "DEPENDENCIES" ) );
    $list11 = ConsesLow.list( makeKeyword( "PATH" ), makeKeyword( "DEPENDENCIES" ) );
    $kw12$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw13$PATH = makeKeyword( "PATH" );
    $str14$js = makeString( "js" );
    $sym15$PROGN = makeSymbol( "PROGN" );
    $sym16$PUNLESS = makeSymbol( "PUNLESS" );
    $sym17$EXT_DEP_ENDS_WITH = makeSymbol( "EXT-DEP-ENDS-WITH" );
    $list18 = ConsesLow.list( makeString( ".js" ) );
    $sym19$WARN = makeSymbol( "WARN" );
    $str20$Defining_javascript_file__S_witho = makeString( "Defining javascript file ~S without '.js' as the suffix." );
    $kw21$JS = makeKeyword( "JS" );
    $list22 = ConsesLow.list( makeSymbol( "FILE-KEYWORD" ), makeSymbol( "FILENAME" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PATH" ), makeString( "css" ) ), makeSymbol( "DEPENDENCIES" ) );
    $str23$css = makeString( "css" );
    $list24 = ConsesLow.list( makeString( ".css" ) );
    $str25$Defining_CSS_file__S_without___cs = makeString( "Defining CSS file ~S without '.css' as the suffix." );
    $kw26$CSS = makeKeyword( "CSS" );
    $list27 = ConsesLow.list( makeSymbol( "FILE-KEYWORD" ), makeSymbol( "PATH" ), makeSymbol( "FILENAME" ), makeSymbol( "FILE-TYPE" ), makeSymbol( "&KEY" ), makeSymbol( "DEPENDENCIES" ) );
    $list28 = ConsesLow.list( makeKeyword( "DEPENDENCIES" ) );
    $sym29$CHECK_EXTERNAL_FILE_DEFINITION = makeSymbol( "CHECK-EXTERNAL-FILE-DEFINITION" );
    $sym30$SETHASH = makeSymbol( "SETHASH" );
    $sym31$LIST = makeSymbol( "LIST" );
    $kw32$FILENAME = makeKeyword( "FILENAME" );
    $kw33$TYPE = makeKeyword( "TYPE" );
    $str34$Unable_to_define__S_because_of_un = makeString( "Unable to define ~S because of undefined dependencies ~S" );
    $str35$Redefinition_of_external_file__S_ = makeString( "Redefinition of external file ~S from ~S to ~S (in ~S) of type ~S with dependencies ~S" );
    $str36$Emitting__S_with_no_html_file_dep = makeString( "Emitting ~S with no html-file-dependency-space." );
    $str37$text_javascript = makeString( "text/javascript" );
    $str38$stylesheet = makeString( "stylesheet" );
    $str39$text_css = makeString( "text/css" );
    $str40$Unable_to_emit_file__S___S__of_ty = makeString( "Unable to emit file ~S (~S) of type ~S" );
    $sym41$UNDEFINED_EXTERNAL_DEPENDENCIES = makeSymbol( "UNDEFINED-EXTERNAL-DEPENDENCIES" );
    $sym42$REDUNDANT_DEPENDENCY_ = makeSymbol( "REDUNDANT-DEPENDENCY?" );
    $list43 = ConsesLow.list( makeSymbol( "DEF-CSS-2" ), makeSymbol( "DEF-JAVASCRIPT-2" ) );
    $str44$java_ = makeString( "java/" );
    $str45$_ = makeString( "/" );
    $str46$_lib_ = makeString( "/lib/" );
    $str47$jar = makeString( "jar" );
    $str48$lib_ = makeString( "lib/" );
    $sym49$_HTML_ICON_DEFINITIONS_ = makeSymbol( "*HTML-ICON-DEFINITIONS*" );
    $int50$32 = makeInteger( 32 );
    $list51 = ConsesLow.list( makeSymbol( "ICON-KEYWORD" ), makeSymbol( "FILENAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ALT-STRING" ) );
    $str52$ = makeString( "" );
    $str53$missing_gif = makeString( "missing.gif" );
    $list54 = ConsesLow.list( new SubLObject[] { makeSymbol( "ICON-KEYWORD" ), makeSymbol( "&KEY" ), makeSymbol( "ID" ), makeSymbol( "NAME" ), makeSymbol( "ISMAP" ), makeSymbol( "HEIGHT" ), makeSymbol( "WIDTH" ),
      makeSymbol( "ALT-OVERRIDE" ), makeSymbol( "ALIGN-OVERRIDE" ), makeSymbol( "BORDER-OVERRIDE" )
    } );
    $list55 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "NAME" ), makeKeyword( "ISMAP" ), makeKeyword( "HEIGHT" ), makeKeyword( "WIDTH" ), makeKeyword( "ALT-OVERRIDE" ), makeKeyword( "ALIGN-OVERRIDE" ),
        makeKeyword( "BORDER-OVERRIDE" ) );
    $kw56$ID = makeKeyword( "ID" );
    $kw57$NAME = makeKeyword( "NAME" );
    $kw58$ISMAP = makeKeyword( "ISMAP" );
    $kw59$HEIGHT = makeKeyword( "HEIGHT" );
    $kw60$WIDTH = makeKeyword( "WIDTH" );
    $kw61$ALT_OVERRIDE = makeKeyword( "ALT-OVERRIDE" );
    $kw62$ALIGN_OVERRIDE = makeKeyword( "ALIGN-OVERRIDE" );
    $kw63$BORDER_OVERRIDE = makeKeyword( "BORDER-OVERRIDE" );
    $sym64$IMAGE_SRC = makeUninternedSymbol( "IMAGE-SRC" );
    $sym65$ALIGN = makeUninternedSymbol( "ALIGN" );
    $sym66$ALT = makeUninternedSymbol( "ALT" );
    $sym67$BORDER = makeUninternedSymbol( "BORDER" );
    $sym68$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym69$_HTML_IMAGE_DIRECTORY_ = makeSymbol( "*HTML-IMAGE-DIRECTORY*" );
    $sym70$HTML_ICON_SRC = makeSymbol( "HTML-ICON-SRC" );
    $sym71$FIF = makeSymbol( "FIF" );
    $list72 = ConsesLow.list( makeKeyword( "CENTER" ) );
    $sym73$GET_HTML_ICON_ALT_STRING = makeSymbol( "GET-HTML-ICON-ALT-STRING" );
    $list74 = ConsesLow.list( ZERO_INTEGER );
    $sym75$HTML_FANCY_IMAGE = makeSymbol( "HTML-FANCY-IMAGE" );
    $kw76$ALT = makeKeyword( "ALT" );
    $kw77$ALIGN = makeKeyword( "ALIGN" );
    $kw78$BORDER = makeKeyword( "BORDER" );
    $sym79$_CB_HELP_DEFINITIONS_ = makeSymbol( "*CB-HELP-DEFINITIONS*" );
    $list80 = ConsesLow.list( makeSymbol( "HELP-KEYWORD" ), makeSymbol( "FILENAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DESC-STRING" ) );
    $str81$help_ = makeString( "help/" );
    $str82$Help_file_not_found_for__A = makeString( "Help file not found for ~A" );
    $sym83$_CB_ICON_DEFINITIONS_ = makeSymbol( "*CB-ICON-DEFINITIONS*" );
    $str84$cb_ = makeString( "cb/" );
    $list85 = ConsesLow.list( new SubLObject[] { makeSymbol( "ICON-KEYWORD" ), makeSymbol( "&KEY" ), makeSymbol( "NAME" ), makeSymbol( "ISMAP" ), makeSymbol( "HEIGHT" ), makeSymbol( "WIDTH" ), makeSymbol(
        "ALT-OVERRIDE" ), makeSymbol( "ALIGN-OVERRIDE" ), makeSymbol( "BORDER-OVERRIDE" )
    } );
    $list86 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "ISMAP" ), makeKeyword( "HEIGHT" ), makeKeyword( "WIDTH" ), makeKeyword( "ALT-OVERRIDE" ), makeKeyword( "ALIGN-OVERRIDE" ), makeKeyword(
        "BORDER-OVERRIDE" ) );
    $sym87$IMAGE_SRC = makeUninternedSymbol( "IMAGE-SRC" );
    $sym88$ALIGN = makeUninternedSymbol( "ALIGN" );
    $sym89$ALT = makeUninternedSymbol( "ALT" );
    $sym90$BORDER = makeUninternedSymbol( "BORDER" );
    $sym91$CB_ICON_FILE_PATH = makeSymbol( "CB-ICON-FILE-PATH" );
    $list92 = ConsesLow.list( makeKeyword( "TOP" ) );
    $sym93$CB_GET_ICON_ALT_STRING = makeSymbol( "CB-GET-ICON-ALT-STRING" );
    $sym94$COMPILE_CB_BROWSER_DEPENDENCIES = makeSymbol( "COMPILE-CB-BROWSER-DEPENDENCIES" );
    $list95 = ConsesLow.list( makeSymbol( "KEYWORD-PRODUCER" ), makeSymbol( "KEYWORD-MAPPING-FN" ) );
    $sym96$JAVASCRIPT_KEYWORDS = makeSymbol( "JAVASCRIPT-KEYWORDS" );
    $sym97$JAVASCRIPT_FILE_PATH = makeSymbol( "JAVASCRIPT-FILE-PATH" );
    $sym98$HTML_ICON_KEYWORDS = makeSymbol( "HTML-ICON-KEYWORDS" );
    $sym99$HTML_ICON_FILE_PATH = makeSymbol( "HTML-ICON-FILE-PATH" );
    $sym100$CB_HELP_KEYWORDS = makeSymbol( "CB-HELP-KEYWORDS" );
    $sym101$CB_HELP_FILE_PATH = makeSymbol( "CB-HELP-FILE-PATH" );
    $sym102$CB_ICON_KEYWORDS = makeSymbol( "CB-ICON-KEYWORDS" );
    $sym103$CSS_KEYWORDS = makeSymbol( "CSS-KEYWORDS" );
    $sym104$CSS_FILE_PATH = makeSymbol( "CSS-FILE-PATH" );
    $sym105$CB_BROWSER_DEPENDENCY_MANIFEST = makeSymbol( "CB-BROWSER-DEPENDENCY-MANIFEST" );
  }
}
/*
 * 
 * Total time: 256 ms
 * 
 */