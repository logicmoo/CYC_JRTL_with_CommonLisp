package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class misc_widgets
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.misc_widgets";
  public static final String myFingerPrint = "b552fc2624926929befe89fee265afa733b393b3d94c5644e914f9924e1c534e";
  private static final SubLString $str0$Bug_Processed;
  private static final SubLString $str1$Bug_;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/misc-widgets.lisp", position = 771L)
  public static SubLObject bugzilla_update_result_page_parse(final SubLObject tokens)
  {
    return list_utilities.sublisp_boolean( xml_parsing_utilities.next_xml_token_position( tokens, $str0$Bug_Processed, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/misc-widgets.lisp", position = 918L)
  public static SubLObject bugzilla_new_bug_result_page_parse(SubLObject tokens, SubLObject query)
  {
    if( query == UNPROVIDED )
    {
      query = NIL;
    }
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str1$Bug_, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str1$Bug_, UNPROVIDED );
    return ConsesLow.list( ConsesLow.list( ZERO_INTEGER, conses_high.cadr( string_utilities.split_string( tokens.first(), UNPROVIDED ) ) ) );
  }

  public static SubLObject declare_misc_widgets_file()
  {
    SubLFiles.declareFunction( me, "bugzilla_update_result_page_parse", "BUGZILLA-UPDATE-RESULT-PAGE-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "bugzilla_new_bug_result_page_parse", "BUGZILLA-NEW-BUG-RESULT-PAGE-PARSE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_misc_widgets_file()
  {
    return NIL;
  }

  public static SubLObject setup_misc_widgets_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_misc_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_misc_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_misc_widgets_file();
  }
  static
  {
    me = new misc_widgets();
    $str0$Bug_Processed = makeString( "Bug Processed" );
    $str1$Bug_ = makeString( "Bug " );
  }
}
/*
 * 
 * Total time: 63 ms
 * 
 */