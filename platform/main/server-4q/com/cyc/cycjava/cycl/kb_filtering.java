package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_filtering
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_filtering";
  public static final String myFingerPrint = "5f1f11225582cd6d7b0ce42cad502ebe48580dfc26ccc8a0f97d65e8ef3f592a";
  private static final SubLObject $const0$myCreationPurpose;
  private static final SubLObject $const1$BookkeepingMt;

  @SubLTranslatedFile.SubL(source = "cycl/kb-filtering.lisp", position = 1255L)
  public static SubLObject constants_for_projects_between(SubLObject projects, final SubLObject start_date, final SubLObject end_date, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = NIL;
    }
    if( NIL != forts.fort_p( projects ) )
    {
      projects = ConsesLow.list( projects );
    }
    return filter_constants_by_projects( kb_utilities.constants_created_between( start_date, end_date, cyclist ), projects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-filtering.lisp", position = 1941L)
  public static SubLObject assertions_for_projects_between(SubLObject projects, final SubLObject start_date, final SubLObject end_date, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = NIL;
    }
    if( NIL != forts.fort_p( projects ) )
    {
      projects = ConsesLow.list( projects );
    }
    return filter_assertions_by_projects( kb_utilities.assertions_between( start_date, end_date, cyclist ), projects );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-filtering.lisp", position = 2569L)
  public static SubLObject filter_constants_by_projects(final SubLObject constants, SubLObject projects)
  {
    SubLObject result = NIL;
    if( projects.isAtom() )
    {
      projects = ConsesLow.list( projects );
    }
    SubLObject cdolist_list_var = constants;
    SubLObject v_const = NIL;
    v_const = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( bookkeeping_store.creation_purpose( v_const, UNPROVIDED ), projects, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( v_const, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_const = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-filtering.lisp", position = 3086L)
  public static SubLObject filter_assertions_by_projects(final SubLObject assertions, SubLObject projects)
  {
    SubLObject result = NIL;
    if( projects.isAtom() )
    {
      projects = ConsesLow.list( projects );
    }
    SubLObject cdolist_list_var = assertions;
    SubLObject assn = NIL;
    assn = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( assertions_high.asserted_why( assn ), projects, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( assn, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assn = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-filtering.lisp", position = 3551L)
  public static SubLObject filter_assertions_by_cyclists(final SubLObject assertions, SubLObject cyclists)
  {
    SubLObject result = NIL;
    if( NIL != forts.fort_p( cyclists ) )
    {
      cyclists = ConsesLow.list( cyclists );
    }
    SubLObject cdolist_list_var = assertions;
    SubLObject assn = NIL;
    assn = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( assertions_high.asserted_by( assn ), cyclists, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( assn, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assn = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-filtering.lisp", position = 3997L)
  public static SubLObject filter_assertions_by_dates(final SubLObject assertions, final SubLObject start_date, final SubLObject end_date)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject assn = NIL;
    assn = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date = assertions_high.asserted_when( assn );
      if( NIL != date && date.numGE( start_date ) && date.numLE( end_date ) )
      {
        result = ConsesLow.cons( assn, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assn = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-filtering.lisp", position = 4561L)
  public static SubLObject my_creation_purpose_arg2_okP(final SubLObject v_term)
  {
    return at_admitted.admitted_argumentP( v_term, TWO_INTEGER, $const0$myCreationPurpose, $const1$BookkeepingMt );
  }

  public static SubLObject declare_kb_filtering_file()
  {
    SubLFiles.declareFunction( me, "constants_for_projects_between", "CONSTANTS-FOR-PROJECTS-BETWEEN", 3, 1, false );
    SubLFiles.declareFunction( me, "assertions_for_projects_between", "ASSERTIONS-FOR-PROJECTS-BETWEEN", 3, 1, false );
    SubLFiles.declareFunction( me, "filter_constants_by_projects", "FILTER-CONSTANTS-BY-PROJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "filter_assertions_by_projects", "FILTER-ASSERTIONS-BY-PROJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "filter_assertions_by_cyclists", "FILTER-ASSERTIONS-BY-CYCLISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "filter_assertions_by_dates", "FILTER-ASSERTIONS-BY-DATES", 3, 0, false );
    SubLFiles.declareFunction( me, "my_creation_purpose_arg2_okP", "MY-CREATION-PURPOSE-ARG2-OK?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_filtering_file()
  {
    return NIL;
  }

  public static SubLObject setup_kb_filtering_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_filtering_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_filtering_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_filtering_file();
  }
  static
  {
    me = new kb_filtering();
    $const0$myCreationPurpose = constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) );
    $const1$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
  }
}
/*
 * 
 * Total time: 100 ms
 * 
 */