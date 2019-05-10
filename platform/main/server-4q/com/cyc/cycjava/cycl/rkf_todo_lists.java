package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_todo_lists
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_todo_lists";
  public static final String myFingerPrint = "3f718b86155894f83b0ece298c593137e7e49667d36329b9a3678b14dfa1a78e";
  private static final SubLSymbol $sym0$_ITEM;
  private static final SubLSymbol $kw1$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw2$MAX_NUMBER;
  private static final SubLObject $const3$thereExists;
  private static final SubLSymbol $sym4$_LIST;
  private static final SubLObject $const5$and;
  private static final SubLObject $const6$myToDoList;
  private static final SubLList $list7;
  private static final SubLObject $const8$toDoListItem;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-todo-lists.lisp", position = 871L)
  public static SubLObject rkf_get_todolist_items(final SubLObject owner, final SubLObject mt, SubLObject number)
  {
    if( number == UNPROVIDED )
    {
      number = TWENTY_INTEGER;
    }
    final SubLObject variable = $sym0$_ITEM;
    final SubLObject v_properties = ConsesLow.list( $kw1$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw2$MAX_NUMBER, number );
    final SubLObject sentence = ConsesLow.list( $const3$thereExists, $sym4$_LIST, ConsesLow.list( $const5$and, ConsesLow.listS( $const6$myToDoList, owner, $list7 ), ConsesLow.list( $const8$toDoListItem, $sym4$_LIST,
        variable ) ) );
    SubLObject v_bindings = NIL;
    SubLObject results = NIL;
    SubLObject cdolist_list_var;
    v_bindings = ( cdolist_list_var = inference_kernel.new_cyc_query( sentence, mt, v_properties ) );
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject result = conses_high.assoc( variable, binding, UNPROVIDED, UNPROVIDED ).rest();
      results = ConsesLow.cons( result, results );
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( results );
  }

  public static SubLObject declare_rkf_todo_lists_file()
  {
    SubLFiles.declareFunction( me, "rkf_get_todolist_items", "RKF-GET-TODOLIST-ITEMS", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_rkf_todo_lists_file()
  {
    return NIL;
  }

  public static SubLObject setup_rkf_todo_lists_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_todo_lists_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_todo_lists_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_todo_lists_file();
  }
  static
  {
    me = new rkf_todo_lists();
    $sym0$_ITEM = makeSymbol( "?ITEM" );
    $kw1$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw2$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $const3$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym4$_LIST = makeSymbol( "?LIST" );
    $const5$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const6$myToDoList = constant_handles.reader_make_constant_shell( makeString( "myToDoList" ) );
    $list7 = ConsesLow.list( makeSymbol( "?LIST" ) );
    $const8$toDoListItem = constant_handles.reader_make_constant_shell( makeString( "toDoListItem" ) );
  }
}
/*
 * 
 * Total time: 65 ms
 * 
 */