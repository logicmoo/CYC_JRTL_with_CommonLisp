package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_markable
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subloop_markable";
  public static final String myFingerPrint = "eadfbb3ae0c746a8d3199acd44a8338b32efa89d8cbb366d0b8cbd4264164676";
  private static final SubLSymbol $sym0$SUBLOOP_MARKABLE;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$SUBLOOP_MARKABLE_TEMPLATE;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$CLEAR_ALL_MARKS;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$ADD_MARK;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$REMOVE_MARK;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$HAS_MARK_P;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$INITIALIZE_QUA_SUBLOOP_MARKABLE_TEMPLATE;
  private static final SubLList $list17;

  @SubLTranslatedFile.SubL(source = "cycl/subloop-markable.lisp", position = 822L)
  public static SubLObject subloop_markable_p(final SubLObject v_subloop_markable)
  {
    return interfaces.subloop_instanceof_interface( v_subloop_markable, $sym0$SUBLOOP_MARKABLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-markable.lisp", position = 1061L)
  public static SubLObject subloop_markable_template_p(final SubLObject subloop_markable_template)
  {
    return interfaces.subloop_instanceof_interface( subloop_markable_template, $sym2$SUBLOOP_MARKABLE_TEMPLATE );
  }

  public static SubLObject declare_subloop_markable_file()
  {
    SubLFiles.declareFunction( me, "subloop_markable_p", "SUBLOOP-MARKABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_markable_template_p", "SUBLOOP-MARKABLE-TEMPLATE-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_subloop_markable_file()
  {
    return NIL;
  }

  public static SubLObject setup_subloop_markable_file()
  {
    interfaces.new_interface( $sym0$SUBLOOP_MARKABLE, NIL, NIL, $list1 );
    interfaces.new_interface( $sym2$SUBLOOP_MARKABLE_TEMPLATE, $list3, $list4, $list5 );
    interfaces.interfaces_add_interface_instance_method( $sym6$CLEAR_ALL_MARKS, $sym2$SUBLOOP_MARKABLE_TEMPLATE, $list7, NIL, $list8 );
    interfaces.interfaces_add_interface_instance_method( $sym9$ADD_MARK, $sym2$SUBLOOP_MARKABLE_TEMPLATE, $list7, $list10, $list11 );
    interfaces.interfaces_add_interface_instance_method( $sym12$REMOVE_MARK, $sym2$SUBLOOP_MARKABLE_TEMPLATE, $list7, $list10, $list13 );
    interfaces.interfaces_add_interface_instance_method( $sym14$HAS_MARK_P, $sym2$SUBLOOP_MARKABLE_TEMPLATE, $list7, $list10, $list15 );
    interfaces.interfaces_add_interface_instance_method( $sym16$INITIALIZE_QUA_SUBLOOP_MARKABLE_TEMPLATE, $sym2$SUBLOOP_MARKABLE_TEMPLATE, $list7, NIL, $list17 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_markable_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_markable_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_markable_file();
  }
  static
  {
    me = new subloop_markable();
    $sym0$SUBLOOP_MARKABLE = makeSymbol( "SUBLOOP-MARKABLE" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR-ALL-MARKS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "ADD-MARK" ), ConsesLow.list( makeSymbol( "MARK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE-MARK" ), ConsesLow.list( makeSymbol( "MARK" ) ),
            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HAS-MARK-P" ), ConsesLow.list( makeSymbol( "MARK" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym2$SUBLOOP_MARKABLE_TEMPLATE = makeSymbol( "SUBLOOP-MARKABLE-TEMPLATE" );
    $list3 = ConsesLow.list( makeSymbol( "SUBLOOP-MARKABLE" ) );
    $list4 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "SUBLOOP-MARKABLE" ) ) );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-MARKS-INTERNAL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "SET-MARKS-INTERNAL" ), ConsesLow.list( makeSymbol( "NEW-MARKS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE-QUA-SUBLOOP-MARKABLE-TEMPLATE" ),
            NIL, makeKeyword( "PUBLIC" ) ) );
    $sym6$CLEAR_ALL_MARKS = makeSymbol( "CLEAR-ALL-MARKS" );
    $list7 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-MARKS-INTERNAL" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym9$ADD_MARK = makeSymbol( "ADD-MARK" );
    $list10 = ConsesLow.list( makeSymbol( "MARK" ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LIST-OF-MARKS" ), ConsesLow.list( makeSymbol( "GET-MARKS-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "MARK" ), makeSymbol( "LIST-OF-MARKS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "MARK" ), makeSymbol(
            "LIST-OF-MARKS" ) ), ConsesLow.list( makeSymbol( "SET-MARKS-INTERNAL" ), makeSymbol( "SELF" ), makeSymbol( "LIST-OF-MARKS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MARK" ) ) );
    $sym12$REMOVE_MARK = makeSymbol( "REMOVE-MARK" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-MARKS-INTERNAL" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "DELETE" ), makeSymbol( "MARK" ), ConsesLow.list( makeSymbol( "GET-MARKS-INTERNAL" ),
        makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MARK" ) ) );
    $sym14$HAS_MARK_P = makeSymbol( "HAS-MARK-P" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "MARK" ), ConsesLow.list( makeSymbol( "GET-MARKS-INTERNAL" ),
        makeSymbol( "SELF" ) ) ), T, NIL ) ) );
    $sym16$INITIALIZE_QUA_SUBLOOP_MARKABLE_TEMPLATE = makeSymbol( "INITIALIZE-QUA-SUBLOOP-MARKABLE-TEMPLATE" );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-MARKS-INTERNAL" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
  }
}
/*
 * 
 * Total time: 88 ms
 * 
 */