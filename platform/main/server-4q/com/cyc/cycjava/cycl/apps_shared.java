package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class apps_shared
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.apps_shared";
  public static final String myFingerPrint = "db882b64d0f38661d301cf5325c4c30dc53933518fc3f2b2c17308ad5861a7cb";
  @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 782L)
  public static SubLSymbol $app_communication_mode_map$;
  @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 1054L)
  public static SubLSymbol $app_color_name_map$;
  @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 1624L)
  public static SubLSymbol $app_color_map$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$STRING_LESSP;
  private static final SubLSymbol $sym4$CDR;

  @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 1803L)
  public static SubLObject set_app_colors()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $app_color_map$.getDynamicValue( thread );
    SubLObject form = NIL;
    form = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = form;
      if( NIL == conses_high.member( item_var, html_macros.$html_color_map$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        html_macros.$html_color_map$.setDynamicValue( ConsesLow.cons( item_var, html_macros.$html_color_map$.getDynamicValue( thread ) ), thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      form = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 1923L)
  public static SubLObject sort_app_color_name_map()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $app_color_name_map$.setDynamicValue( Sort.sort( conses_high.copy_list( $app_color_name_map$.getDynamicValue( thread ) ), Symbols.symbol_function( $sym3$STRING_LESSP ), Symbols.symbol_function( $sym4$CDR ) ),
        thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 2066L)
  public static SubLObject configure_app_colors()
  {
    set_app_colors();
    sort_app_color_name_map();
    return NIL;
  }

  public static SubLObject declare_apps_shared_file()
  {
    SubLFiles.declareFunction( me, "set_app_colors", "SET-APP-COLORS", 0, 0, false );
    SubLFiles.declareFunction( me, "sort_app_color_name_map", "SORT-APP-COLOR-NAME-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "configure_app_colors", "CONFIGURE-APP-COLORS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_apps_shared_file()
  {
    $app_communication_mode_map$ = SubLFiles.defparameter( "*APP-COMMUNICATION-MODE-MAP*", $list0 );
    $app_color_name_map$ = SubLFiles.defparameter( "*APP-COLOR-NAME-MAP*", $list1 );
    $app_color_map$ = SubLFiles.defparameter( "*APP-COLOR-MAP*", $list2 );
    return NIL;
  }

  public static SubLObject setup_apps_shared_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_apps_shared_file();
  }

  @Override
  public void initializeVariables()
  {
    init_apps_shared_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_apps_shared_file();
  }
  static
  {
    me = new apps_shared();
    $app_communication_mode_map$ = null;
    $app_color_name_map$ = null;
    $app_color_map$ = null;
    $list0 = ConsesLow.list( ConsesLow.cons( makeString( "transmit and receive" ), makeKeyword( "TRANSMIT-AND-RECEIVE" ) ), ConsesLow.cons( makeString( "receive only" ), makeKeyword( "RECEIVE-ONLY" ) ), ConsesLow.cons(
        makeString( "deaf" ), makeKeyword( "DEAF" ) ), ConsesLow.cons( makeString( "dead" ), makeKeyword( "DEAD" ) ), ConsesLow.cons( makeString( "isolated" ), makeKeyword( "ISOLATED" ) ) );
    $list1 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeKeyword( "BLACK" ), makeString( "black" ) ), ConsesLow.cons( makeKeyword( "BLUE" ), makeString( "blue" ) ), ConsesLow.cons( makeKeyword( "GREEN" ),
        makeString( "green" ) ), ConsesLow.cons( makeKeyword( "CYAN" ), makeString( "cyan" ) ), ConsesLow.cons( makeKeyword( "RED" ), makeString( "red" ) ), ConsesLow.cons( makeKeyword( "MAGENTA" ), makeString(
            "magenta" ) ), ConsesLow.cons( makeKeyword( "YELLOW" ), makeString( "yellow" ) ), ConsesLow.cons( makeKeyword( "WHITE" ), makeString( "white" ) ), ConsesLow.cons( makeKeyword( "LIGHT-BLUE" ), makeString(
                "light blue" ) ), ConsesLow.cons( makeKeyword( "LIGHT-RED" ), makeString( "light red" ) ), ConsesLow.cons( makeKeyword( "LIGHT-YELLOW" ), makeString( "light yellow" ) ), ConsesLow.cons( makeKeyword(
                    "LIGHT-GRAY" ), makeString( "light grey" ) ), ConsesLow.cons( NIL, makeString( "default" ) ), ConsesLow.cons( makeKeyword( "PERIWINKLE" ), makeString( "periwinkle" ) ), ConsesLow.cons( makeKeyword(
                        "SEA-GREEN" ), makeString( "sea green" ) )
    } );
    $list2 = ConsesLow.list( ConsesLow.cons( makeKeyword( "PERIWINKLE" ), makeString( "CDCDFF" ) ), ConsesLow.cons( makeKeyword( "SEA-GREEN" ), makeString( "CDFFCD" ) ) );
    $sym3$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym4$CDR = makeSymbol( "CDR" );
  }
}
/*
 * 
 * Total time: 95 ms
 * 
 */