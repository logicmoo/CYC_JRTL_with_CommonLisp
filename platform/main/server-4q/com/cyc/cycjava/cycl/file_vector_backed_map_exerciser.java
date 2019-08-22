package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_vector_backed_map_exerciser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.file_vector_backed_map_exerciser";
  public static final String myFingerPrint = "6124b491bb3460ad8ba7ea348eadd55a7b978584bce18f9ad833990abf173d5b";
  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLSymbol $default_file_vector_backed_map_size$;
  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLSymbol $default_file_vector_data_file$;
  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLSymbol $default_file_vector_index_file$;
  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLSymbol $file_vector_backed_map_exerciser_map$;
  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLSymbol $file_vector_backed_map_exerciser_file_vector$;
  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLSymbol $file_vector_backed_map_exerciser_loop_times$;
  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLSymbol $file_vector_backed_map_exerciser_lock$;
  private static final SubLString $str0$_A__Started____;
  private static final SubLString $str1$_A__Done__going_away___;
  private static final SubLString $str2$_A__succeeded___;
  private static final SubLString $str3$_A_died_before_success___;
  private static final SubLString $str4$_home_sjoshi_Projects_Test_datafi;
  private static final SubLString $str5$_home_sjoshi_Projects_Test_indexf;
  private static final SubLSymbol $sym6$_FILE_VECTOR_BACKED_MAP_EXERCISER_LOCK_;
  private static final SubLString $str7$File_Vector_Backed_Map_Exerciser_;
  private static final SubLString $str8$File_Vector_Backed_Map_Trainer___;
  private static final SubLString $str9$Spawning_process__D_____;
  private static final SubLSymbol $sym10$FILE_VECTOR_BACKED_MAP_EXERCISER_PROCESS;
  private static final SubLString $str11$_done___;
  private static final SubLSymbol $sym12$FILE_VECTOR_BACKED_MAP_EXERCISER;
  private static final SubLSymbol $kw13$TEST;
  private static final SubLSymbol $kw14$OWNER;
  private static final SubLSymbol $kw15$CLASSES;
  private static final SubLSymbol $kw16$KB;
  private static final SubLSymbol $kw17$TINY;
  private static final SubLSymbol $kw18$WORKING_;
  private static final SubLList $list19;

  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLObject initialize_file_vector_backed_map()
  {
    final SubLObject map = Hashtables.make_hash_table( $default_file_vector_backed_map_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( $default_file_vector_backed_map_size$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      map_utilities.map_put( map, i, i );
    }
    file_vector_utilities.create_file_backing_for_map( map, $default_file_vector_data_file$.getGlobalValue(), $default_file_vector_index_file$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLObject file_vector_backed_map_exerciser_process()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doneP = NIL;
    PrintLow.format( T, $str0$_A__Started____, Threads.current_process() );
    streams_high.force_output( UNPROVIDED );
    final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
    try
    {
      file_vector_utilities.$file_vector_backed_map_read_lock$.bind( $file_vector_backed_map_exerciser_lock$.getGlobalValue(), thread );
      SubLObject i;
      SubLObject key;
      SubLObject value;
      for( i = NIL, i = ZERO_INTEGER; i.numL( $file_vector_backed_map_exerciser_loop_times$.getGlobalValue() ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        key = random.random( $default_file_vector_backed_map_size$.getGlobalValue() );
        value = file_vector_utilities.file_vector_backed_map_get( $file_vector_backed_map_exerciser_map$.getGlobalValue(), $file_vector_backed_map_exerciser_file_vector$.getGlobalValue(), key, UNPROVIDED );
        if( NIL != value )
        {
          file_vector_utilities.swap_out_pristine_file_vector_backed_map_object( $file_vector_backed_map_exerciser_map$.getGlobalValue(), key );
        }
      }
    }
    finally
    {
      file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0, thread );
    }
    doneP = T;
    PrintLow.format( T, $str1$_A__Done__going_away___, Threads.current_process() );
    streams_high.force_output( UNPROVIDED );
    if( NIL != doneP )
    {
      PrintLow.format( T, $str2$_A__succeeded___, Threads.current_process() );
    }
    else
    {
      PrintLow.format( T, $str3$_A_died_before_success___, Threads.current_process() );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
  public static SubLObject file_vector_backed_map_exerciser(final SubLObject num_of_procs, final SubLObject loop_times, SubLObject file_vector_data_file, SubLObject file_vector_index_file)
  {
    if( file_vector_data_file == UNPROVIDED )
    {
      file_vector_data_file = NIL;
    }
    if( file_vector_index_file == UNPROVIDED )
    {
      file_vector_index_file = NIL;
    }
    $file_vector_backed_map_exerciser_loop_times$.setGlobalValue( loop_times );
    $file_vector_backed_map_exerciser_lock$.setGlobalValue( Locks.make_lock( $str7$File_Vector_Backed_Map_Exerciser_ ) );
    if( NIL != file_vector_data_file )
    {
      $default_file_vector_data_file$.setGlobalValue( file_vector_data_file );
    }
    if( NIL != file_vector_index_file )
    {
      $default_file_vector_index_file$.setGlobalValue( file_vector_index_file );
    }
    $file_vector_backed_map_exerciser_file_vector$.setGlobalValue( file_vector.new_file_vector( $default_file_vector_data_file$.getGlobalValue(), $default_file_vector_index_file$.getGlobalValue(), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) );
    initialize_file_vector_backed_map();
    $file_vector_backed_map_exerciser_map$.setGlobalValue( file_vector_utilities.new_file_vector_backed_map( $file_vector_backed_map_exerciser_file_vector$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject return_value = T;
    SubLObject i;
    SubLObject proc_name;
    for( i = NIL, i = ZERO_INTEGER; i.numL( num_of_procs ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      proc_name = PrintLow.format( NIL, $str8$File_Vector_Backed_Map_Trainer___, i );
      PrintLow.format( T, $str9$Spawning_process__D_____, i );
      return_value = makeBoolean( NIL != return_value && NIL != Threads.make_process( proc_name, $sym10$FILE_VECTOR_BACKED_MAP_EXERCISER_PROCESS ) );
      Threads.sleep( ZERO_INTEGER );
      PrintLow.format( T, $str11$_done___ );
      streams_high.force_output( UNPROVIDED );
    }
    return return_value;
  }

  public static SubLObject declare_file_vector_backed_map_exerciser_file()
  {
    SubLFiles.declareFunction( me, "initialize_file_vector_backed_map", "INITIALIZE-FILE-VECTOR-BACKED-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "file_vector_backed_map_exerciser_process", "FILE-VECTOR-BACKED-MAP-EXERCISER-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "file_vector_backed_map_exerciser", "FILE-VECTOR-BACKED-MAP-EXERCISER", 2, 2, false );
    return NIL;
  }

  public static SubLObject init_file_vector_backed_map_exerciser_file()
  {
    $default_file_vector_backed_map_size$ = SubLFiles.deflexical( "*DEFAULT-FILE-VECTOR-BACKED-MAP-SIZE*", THREE_INTEGER );
    $default_file_vector_data_file$ = SubLFiles.deflexical( "*DEFAULT-FILE-VECTOR-DATA-FILE*", $str4$_home_sjoshi_Projects_Test_datafi );
    $default_file_vector_index_file$ = SubLFiles.deflexical( "*DEFAULT-FILE-VECTOR-INDEX-FILE*", $str5$_home_sjoshi_Projects_Test_indexf );
    $file_vector_backed_map_exerciser_map$ = SubLFiles.deflexical( "*FILE-VECTOR-BACKED-MAP-EXERCISER-MAP*", NIL );
    $file_vector_backed_map_exerciser_file_vector$ = SubLFiles.deflexical( "*FILE-VECTOR-BACKED-MAP-EXERCISER-FILE-VECTOR*", NIL );
    $file_vector_backed_map_exerciser_loop_times$ = SubLFiles.deflexical( "*FILE-VECTOR-BACKED-MAP-EXERCISER-LOOP-TIMES*", NIL );
    $file_vector_backed_map_exerciser_lock$ = SubLFiles.deflexical( "*FILE-VECTOR-BACKED-MAP-EXERCISER-LOCK*", ( maybeDefault( $sym6$_FILE_VECTOR_BACKED_MAP_EXERCISER_LOCK_, $file_vector_backed_map_exerciser_lock$,
        NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_file_vector_backed_map_exerciser_file()
  {
    subl_macro_promotions.declare_defglobal( $sym6$_FILE_VECTOR_BACKED_MAP_EXERCISER_LOCK_ );
    generic_testing.define_test_case_table_int( $sym12$FILE_VECTOR_BACKED_MAP_EXERCISER, ConsesLow.list( new SubLObject[] { $kw13$TEST, NIL, $kw14$OWNER, NIL, $kw15$CLASSES, NIL, $kw16$KB, $kw17$TINY, $kw18$WORKING_, T
    } ), $list19 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_file_vector_backed_map_exerciser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_file_vector_backed_map_exerciser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_file_vector_backed_map_exerciser_file();
  }
  static
  {
    me = new file_vector_backed_map_exerciser();
    $default_file_vector_backed_map_size$ = null;
    $default_file_vector_data_file$ = null;
    $default_file_vector_index_file$ = null;
    $file_vector_backed_map_exerciser_map$ = null;
    $file_vector_backed_map_exerciser_file_vector$ = null;
    $file_vector_backed_map_exerciser_loop_times$ = null;
    $file_vector_backed_map_exerciser_lock$ = null;
    $str0$_A__Started____ = makeString( "~A: Started. ~%" );
    $str1$_A__Done__going_away___ = makeString( "~A: Done, going away.~%" );
    $str2$_A__succeeded___ = makeString( "~A: succeeded.~%" );
    $str3$_A_died_before_success___ = makeString( "~A died before success.~%" );
    $str4$_home_sjoshi_Projects_Test_datafi = makeString( "/home/sjoshi/Projects/Test/datafile" );
    $str5$_home_sjoshi_Projects_Test_indexf = makeString( "/home/sjoshi/Projects/Test/indexfile" );
    $sym6$_FILE_VECTOR_BACKED_MAP_EXERCISER_LOCK_ = makeSymbol( "*FILE-VECTOR-BACKED-MAP-EXERCISER-LOCK*" );
    $str7$File_Vector_Backed_Map_Exerciser_ = makeString( "File Vector Backed Map Exerciser Data Stream lock" );
    $str8$File_Vector_Backed_Map_Trainer___ = makeString( "File Vector Backed Map Trainer #~D" );
    $str9$Spawning_process__D_____ = makeString( "Spawning process ~D ... " );
    $sym10$FILE_VECTOR_BACKED_MAP_EXERCISER_PROCESS = makeSymbol( "FILE-VECTOR-BACKED-MAP-EXERCISER-PROCESS" );
    $str11$_done___ = makeString( " done.~%" );
    $sym12$FILE_VECTOR_BACKED_MAP_EXERCISER = makeSymbol( "FILE-VECTOR-BACKED-MAP-EXERCISER" );
    $kw13$TEST = makeKeyword( "TEST" );
    $kw14$OWNER = makeKeyword( "OWNER" );
    $kw15$CLASSES = makeKeyword( "CLASSES" );
    $kw16$KB = makeKeyword( "KB" );
    $kw17$TINY = makeKeyword( "TINY" );
    $kw18$WORKING_ = makeKeyword( "WORKING?" );
    $list19 = ConsesLow.list( ConsesLow.list( ConsesLow.list( THREE_INTEGER, makeInteger( 100 ) ), T ) );
  }
}
/*
 * 
 * Total time: 99 ms
 * 
 */