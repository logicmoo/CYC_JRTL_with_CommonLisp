package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_pragmatics
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_pragmatics";
  public static final String myFingerPrint = "a8d9592b1931bd70e655b6add907ce0c26f7c46334fcaecbca45ae2d78f2de74";
  private static final SubLObject $const0$SlangSpeech;
  private static final SubLObject $const1$ArchaicSpeech;

  @SubLTranslatedFile.SubL(source = "cycl/nl-pragmatics.lisp", position = 829L)
  public static SubLObject pragmatically_acceptableP(final SubLObject pragmatic_attribute)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != lexicon_vars.lexicon_filter_activeP( lexicon_vars.$exclude_vulgaritiesP$.getDynamicValue( thread ) ) && NIL != lexicon_accessors.potentially_offensive_politeness_levelP( pragmatic_attribute ) )
    {
      return NIL;
    }
    if( NIL != lexicon_vars.lexicon_filter_activeP( lexicon_vars.$exclude_slangP$.getDynamicValue( thread ) ) && $const0$SlangSpeech.eql( pragmatic_attribute ) )
    {
      return NIL;
    }
    if( NIL != lexicon_vars.lexicon_filter_activeP( lexicon_vars.$exclude_archaic_speechP$.getDynamicValue( thread ) ) && $const1$ArchaicSpeech.eql( pragmatic_attribute ) )
    {
      return NIL;
    }
    return T;
  }

  public static SubLObject declare_nl_pragmatics_file()
  {
    SubLFiles.declareFunction( me, "pragmatically_acceptableP", "PRAGMATICALLY-ACCEPTABLE?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_nl_pragmatics_file()
  {
    return NIL;
  }

  public static SubLObject setup_nl_pragmatics_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nl_pragmatics_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nl_pragmatics_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nl_pragmatics_file();
  }
  static
  {
    me = new nl_pragmatics();
    $const0$SlangSpeech = constant_handles.reader_make_constant_shell( makeString( "SlangSpeech" ) );
    $const1$ArchaicSpeech = constant_handles.reader_make_constant_shell( makeString( "ArchaicSpeech" ) );
  }
}
/*
 * 
 * Total time: 61 ms
 * 
 */