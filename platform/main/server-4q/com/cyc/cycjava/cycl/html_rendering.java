package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_rendering
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.html_rendering";
  public static final String myFingerPrint = "bb4b114cf67aabfdf4481bfd6b4f91b833526b4b36d465ef65b933d006315c74";
  @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 1852L)
  public static SubLSymbol $html_node_rendering_function$;
  @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 2243L)
  public static SubLSymbol $html_node_rendering_background_colormap$;
  private static final SubLSymbol $sym0$HTML_CATEGORIZE_GRAPH_RENDER_NODE;
  private static final SubLSymbol $kw1$NAKED;
  private static final SubLSymbol $kw2$ISOLATED;
  private static final SubLSymbol $kw3$CONNECTED;
  private static final SubLSymbol $kw4$ALL_CONNECTED;
  private static final SubLSymbol $kw5$COLORMAP;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw9$RENDERFN;
  private static final SubLSymbol $sym10$FUNCTION;
  private static final SubLSymbol $sym11$COLORS;
  private static final SubLSymbol $sym12$CLET;
  private static final SubLSymbol $sym13$FIF;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$_HTML_NODE_RENDERING_FUNCTION_;
  private static final SubLSymbol $sym17$_HTML_NODE_RENDERING_BACKGROUND_COLORMAP_;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$CENTER;
  private static final SubLString $str21$Color_Key;
  private static final SubLString $str22$Naked_terms_;
  private static final SubLString $str23$Isolated_terms_;
  private static final SubLString $str24$Connected_terms_;
  private static final SubLString $str25$All_connected_;
  private static final SubLString $str26$_;
  private static final SubLString $str27$_;

  @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 1015L)
  public static SubLObject html_categorize_nodes_via_links(final SubLObject nodes, final SubLObject links, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject connected_groups = graph_utilities.categorize_nodes_via_links( nodes, links, test );
    final SubLObject isolated_groups = thread.secondMultipleValue();
    final SubLObject naked_groups = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    html_render_link_categorized_nodes( connected_groups, isolated_groups, naked_groups );
    html_utilities.html_newline( UNPROVIDED );
    html_display_node_rendering_colormap();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 1949L)
  public static SubLObject construct_html_node_rendering_colormap_helper(final SubLObject naked, final SubLObject isolated, final SubLObject connected, final SubLObject all_connected, final SubLObject colormap)
  {
    return ConsesLow.list( ConsesLow.list( $kw1$NAKED, naked ), ConsesLow.list( $kw2$ISOLATED, isolated ), ConsesLow.list( $kw3$CONNECTED, connected ), ConsesLow.list( $kw4$ALL_CONNECTED, all_connected ), ConsesLow.list(
        $kw5$COLORMAP, colormap ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 2552L)
  public static SubLObject html_render_link_categorized_nodes_my_way(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      if( NIL == conses_high.member( current_$1, $list7, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw8$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    }
    final SubLObject renderfn_tail = cdestructuring_bind.property_list_member( $kw9$RENDERFN, current );
    final SubLObject renderfn = ( NIL != renderfn_tail ) ? conses_high.cadr( renderfn_tail ) : NIL;
    final SubLObject colormap_tail = cdestructuring_bind.property_list_member( $kw5$COLORMAP, current );
    final SubLObject colormap = ( NIL != colormap_tail ) ? conses_high.cadr( colormap_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject function = $sym10$FUNCTION;
    final SubLObject colors = $sym11$COLORS;
    return ConsesLow.listS( $sym12$CLET, ConsesLow.list( ConsesLow.list( function, ConsesLow.listS( $sym13$FIF, renderfn, renderfn, $list14 ) ), ConsesLow.list( colors, ConsesLow.listS( $sym13$FIF, colormap, colormap,
        $list15 ) ), ConsesLow.list( $sym16$_HTML_NODE_RENDERING_FUNCTION_, function ), ConsesLow.list( $sym17$_HTML_NODE_RENDERING_BACKGROUND_COLORMAP_, colors ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 3091L)
  public static SubLObject html_render_link_categorized_nodes(final SubLObject connected_groups, final SubLObject isolated_groups, final SubLObject naked_groups)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject render_function = $html_node_rendering_function$.getDynamicValue( thread );
    final SubLObject backgrounds = $html_node_rendering_background_colormap$.getDynamicValue( thread );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ONE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != naked_groups )
      {
        final SubLObject bgcolor = conses_high.second( conses_high.assoc( $kw1$NAKED, backgrounds, UNPROVIDED, UNPROVIDED ) );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          if( NIL != bgcolor )
          {
            html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( bgcolor );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            SubLObject cdolist_list_var = naked_groups;
            SubLObject island_group = NIL;
            island_group = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = island_group;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
              final SubLObject temp = current.rest();
              current = current.first();
              SubLObject node = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
              node = current.first();
              current = current.rest();
              if( NIL == current )
              {
                current = temp;
                SubLObject links = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                links = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  Functions.funcall( render_function, node );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              island_group = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      if( NIL != isolated_groups )
      {
        final SubLObject bgcolor = conses_high.second( conses_high.assoc( $kw2$ISOLATED, backgrounds, UNPROVIDED, UNPROVIDED ) );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          if( NIL != bgcolor )
          {
            html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( bgcolor );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            SubLObject cdolist_list_var = isolated_groups;
            SubLObject island_group = NIL;
            island_group = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = island_group;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
              final SubLObject temp = current.rest();
              current = current.first();
              SubLObject node = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
              node = current.first();
              current = current.rest();
              if( NIL == current )
              {
                current = temp;
                SubLObject links = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                links = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  Functions.funcall( render_function, node );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              island_group = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      if( NIL != connected_groups )
      {
        final SubLObject bgcolor_type = ( NIL == naked_groups && NIL == isolated_groups && NIL != list_utilities.singletonP( connected_groups ) ) ? $kw4$ALL_CONNECTED : $kw3$CONNECTED;
        final SubLObject bgcolor2 = conses_high.second( conses_high.assoc( bgcolor_type, backgrounds, UNPROVIDED, UNPROVIDED ) );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          if( NIL != bgcolor2 )
          {
            html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( bgcolor2 );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject cdolist_list_var2 = connected_groups;
              SubLObject island_group2 = NIL;
              island_group2 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    SubLObject current2;
                    final SubLObject datum2 = current2 = island_group2;
                    SubLObject nodes = NIL;
                    SubLObject links2 = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list19 );
                    nodes = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list19 );
                    links2 = current2.first();
                    current2 = current2.rest();
                    if( NIL == current2 )
                    {
                      SubLObject cdolist_list_var_$11 = nodes;
                      SubLObject node2 = NIL;
                      node2 = cdolist_list_var_$11.first();
                      while ( NIL != cdolist_list_var_$11)
                      {
                        Functions.funcall( render_function, node2 );
                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        node2 = cdolist_list_var_$11.first();
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum2, $list19 );
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                cdolist_list_var2 = cdolist_list_var2.rest();
                island_group2 = cdolist_list_var2.first();
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 5139L)
  public static SubLObject html_display_node_rendering_colormap()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject backgrounds = $html_node_rendering_background_colormap$.getDynamicValue( thread );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject bgcolor = conses_high.second( conses_high.assoc( $kw5$COLORMAP, backgrounds, UNPROVIDED, UNPROVIDED ) );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        if( NIL != bgcolor )
        {
          html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( bgcolor );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw20$CENTER ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_underlined_head$.getGlobalValue() );
                html_utilities.html_princ( $str21$Color_Key );
                html_utilities.html_markup( html_macros.$html_underlined_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              bgcolor = conses_high.second( conses_high.assoc( $kw1$NAKED, backgrounds, UNPROVIDED, UNPROVIDED ) );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              if( NIL != bgcolor )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( bgcolor );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( MINUS_ONE_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str22$Naked_terms_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              bgcolor = conses_high.second( conses_high.assoc( $kw2$ISOLATED, backgrounds, UNPROVIDED, UNPROVIDED ) );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              if( NIL != bgcolor )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( bgcolor );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( MINUS_ONE_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str23$Isolated_terms_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              bgcolor = conses_high.second( conses_high.assoc( $kw3$CONNECTED, backgrounds, UNPROVIDED, UNPROVIDED ) );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              if( NIL != bgcolor )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( bgcolor );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( MINUS_ONE_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str24$Connected_terms_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              bgcolor = conses_high.second( conses_high.assoc( $kw4$ALL_CONNECTED, backgrounds, UNPROVIDED, UNPROVIDED ) );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              if( NIL != bgcolor )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( bgcolor );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( MINUS_ONE_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str25$All_connected_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 6655L)
  public static SubLObject html_categorize_graph_render_node(final SubLObject node)
  {
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    html_utilities.html_princ( $str26$_ );
    html_utilities.html_princ( node );
    html_utilities.html_princ( $str27$_ );
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject declare_html_rendering_file()
  {
    SubLFiles.declareFunction( me, "html_categorize_nodes_via_links", "HTML-CATEGORIZE-NODES-VIA-LINKS", 2, 1, false );
    SubLFiles.declareFunction( me, "construct_html_node_rendering_colormap_helper", "CONSTRUCT-HTML-NODE-RENDERING-COLORMAP-HELPER", 5, 0, false );
    SubLFiles.declareMacro( me, "html_render_link_categorized_nodes_my_way", "HTML-RENDER-LINK-CATEGORIZED-NODES-MY-WAY" );
    SubLFiles.declareFunction( me, "html_render_link_categorized_nodes", "HTML-RENDER-LINK-CATEGORIZED-NODES", 3, 0, false );
    SubLFiles.declareFunction( me, "html_display_node_rendering_colormap", "HTML-DISPLAY-NODE-RENDERING-COLORMAP", 0, 0, false );
    SubLFiles.declareFunction( me, "html_categorize_graph_render_node", "HTML-CATEGORIZE-GRAPH-RENDER-NODE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_html_rendering_file()
  {
    $html_node_rendering_function$ = SubLFiles.defparameter( "*HTML-NODE-RENDERING-FUNCTION*", $sym0$HTML_CATEGORIZE_GRAPH_RENDER_NODE );
    $html_node_rendering_background_colormap$ = SubLFiles.defparameter( "*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*", ConsesLow.list( ConsesLow.list( $kw1$NAKED, html_macros.$html_color_sat_red$.getGlobalValue() ),
        ConsesLow.list( $kw2$ISOLATED, html_macros.$html_color_sat_yellow$.getGlobalValue() ), ConsesLow.list( $kw3$CONNECTED, html_macros.$html_color_sat_green$.getGlobalValue() ), ConsesLow.list( $kw4$ALL_CONNECTED,
            html_macros.$html_color_white$.getGlobalValue() ), ConsesLow.list( $kw5$COLORMAP, html_macros.$html_color_lighter_grey$.getGlobalValue() ) ) );
    return NIL;
  }

  public static SubLObject setup_html_rendering_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_html_rendering_file();
  }

  @Override
  public void initializeVariables()
  {
    init_html_rendering_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_html_rendering_file();
  }
  static
  {
    me = new html_rendering();
    $html_node_rendering_function$ = null;
    $html_node_rendering_background_colormap$ = null;
    $sym0$HTML_CATEGORIZE_GRAPH_RENDER_NODE = makeSymbol( "HTML-CATEGORIZE-GRAPH-RENDER-NODE" );
    $kw1$NAKED = makeKeyword( "NAKED" );
    $kw2$ISOLATED = makeKeyword( "ISOLATED" );
    $kw3$CONNECTED = makeKeyword( "CONNECTED" );
    $kw4$ALL_CONNECTED = makeKeyword( "ALL-CONNECTED" );
    $kw5$COLORMAP = makeKeyword( "COLORMAP" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "RENDERFN" ), makeSymbol( "COLORMAP" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list7 = ConsesLow.list( makeKeyword( "RENDERFN" ), makeKeyword( "COLORMAP" ) );
    $kw8$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw9$RENDERFN = makeKeyword( "RENDERFN" );
    $sym10$FUNCTION = makeUninternedSymbol( "FUNCTION" );
    $sym11$COLORS = makeUninternedSymbol( "COLORS" );
    $sym12$CLET = makeSymbol( "CLET" );
    $sym13$FIF = makeSymbol( "FIF" );
    $list14 = ConsesLow.list( makeSymbol( "*HTML-NODE-RENDERING-FUNCTION*" ) );
    $list15 = ConsesLow.list( makeSymbol( "*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*" ) );
    $sym16$_HTML_NODE_RENDERING_FUNCTION_ = makeSymbol( "*HTML-NODE-RENDERING-FUNCTION*" );
    $sym17$_HTML_NODE_RENDERING_BACKGROUND_COLORMAP_ = makeSymbol( "*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*" );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "NODE" ) ), makeSymbol( "LINKS" ) );
    $list19 = ConsesLow.list( makeSymbol( "NODES" ), makeSymbol( "LINKS" ) );
    $kw20$CENTER = makeKeyword( "CENTER" );
    $str21$Color_Key = makeString( "Color Key" );
    $str22$Naked_terms_ = makeString( "Naked terms." );
    $str23$Isolated_terms_ = makeString( "Isolated terms." );
    $str24$Connected_terms_ = makeString( "Connected terms." );
    $str25$All_connected_ = makeString( "All connected." );
    $str26$_ = makeString( "[" );
    $str27$_ = makeString( "]" );
  }
}
/*
 * 
 * Total time: 385 ms
 * 
 */