package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_vector_backed_map_exerciser extends SubLTranslatedFile
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
    public static SubLObject initialize_file_vector_backed_map() {
        final SubLObject map = Hashtables.make_hash_table(file_vector_backed_map_exerciser.$default_file_vector_backed_map_size$.getGlobalValue(), (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED, (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)file_vector_backed_map_exerciser.NIL, i = (SubLObject)file_vector_backed_map_exerciser.ZERO_INTEGER; i.numL(file_vector_backed_map_exerciser.$default_file_vector_backed_map_size$.getGlobalValue()); i = Numbers.add(i, (SubLObject)file_vector_backed_map_exerciser.ONE_INTEGER)) {
            map_utilities.map_put(map, i, i);
        }
        file_vector_utilities.create_file_backing_for_map(map, file_vector_backed_map_exerciser.$default_file_vector_data_file$.getGlobalValue(), file_vector_backed_map_exerciser.$default_file_vector_index_file$.getGlobalValue());
        return (SubLObject)file_vector_backed_map_exerciser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
    public static SubLObject file_vector_backed_map_exerciser_process() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = (SubLObject)file_vector_backed_map_exerciser.NIL;
        PrintLow.format((SubLObject)file_vector_backed_map_exerciser.T, (SubLObject)file_vector_backed_map_exerciser.$str0$_A__Started____, Threads.current_process());
        streams_high.force_output((SubLObject)file_vector_backed_map_exerciser.UNPROVIDED);
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_lock$.getGlobalValue(), thread);
            SubLObject i;
            SubLObject key;
            SubLObject value;
            for (i = (SubLObject)file_vector_backed_map_exerciser.NIL, i = (SubLObject)file_vector_backed_map_exerciser.ZERO_INTEGER; i.numL(file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_loop_times$.getGlobalValue()); i = Numbers.add(i, (SubLObject)file_vector_backed_map_exerciser.ONE_INTEGER)) {
                key = random.random(file_vector_backed_map_exerciser.$default_file_vector_backed_map_size$.getGlobalValue());
                value = file_vector_utilities.file_vector_backed_map_get(file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_map$.getGlobalValue(), file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_file_vector$.getGlobalValue(), key, (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED);
                if (file_vector_backed_map_exerciser.NIL != value) {
                    file_vector_utilities.swap_out_pristine_file_vector_backed_map_object(file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_map$.getGlobalValue(), key);
                }
            }
        }
        finally {
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        doneP = (SubLObject)file_vector_backed_map_exerciser.T;
        PrintLow.format((SubLObject)file_vector_backed_map_exerciser.T, (SubLObject)file_vector_backed_map_exerciser.$str1$_A__Done__going_away___, Threads.current_process());
        streams_high.force_output((SubLObject)file_vector_backed_map_exerciser.UNPROVIDED);
        if (file_vector_backed_map_exerciser.NIL != doneP) {
            PrintLow.format((SubLObject)file_vector_backed_map_exerciser.T, (SubLObject)file_vector_backed_map_exerciser.$str2$_A__succeeded___, Threads.current_process());
        }
        else {
            PrintLow.format((SubLObject)file_vector_backed_map_exerciser.T, (SubLObject)file_vector_backed_map_exerciser.$str3$_A_died_before_success___, Threads.current_process());
        }
        return (SubLObject)file_vector_backed_map_exerciser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-backed-map-exerciser.lisp", position = 111L)
    public static SubLObject file_vector_backed_map_exerciser(final SubLObject num_of_procs, final SubLObject loop_times, SubLObject file_vector_data_file, SubLObject file_vector_index_file) {
        if (file_vector_data_file == file_vector_backed_map_exerciser.UNPROVIDED) {
            file_vector_data_file = (SubLObject)file_vector_backed_map_exerciser.NIL;
        }
        if (file_vector_index_file == file_vector_backed_map_exerciser.UNPROVIDED) {
            file_vector_index_file = (SubLObject)file_vector_backed_map_exerciser.NIL;
        }
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_loop_times$.setGlobalValue(loop_times);
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_lock$.setGlobalValue(Locks.make_lock((SubLObject)file_vector_backed_map_exerciser.$str7$File_Vector_Backed_Map_Exerciser_));
        if (file_vector_backed_map_exerciser.NIL != file_vector_data_file) {
            file_vector_backed_map_exerciser.$default_file_vector_data_file$.setGlobalValue(file_vector_data_file);
        }
        if (file_vector_backed_map_exerciser.NIL != file_vector_index_file) {
            file_vector_backed_map_exerciser.$default_file_vector_index_file$.setGlobalValue(file_vector_index_file);
        }
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_file_vector$.setGlobalValue(file_vector.new_file_vector(file_vector_backed_map_exerciser.$default_file_vector_data_file$.getGlobalValue(), file_vector_backed_map_exerciser.$default_file_vector_index_file$.getGlobalValue(), (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED, (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED, (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED, (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED));
        initialize_file_vector_backed_map();
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_map$.setGlobalValue(file_vector_utilities.new_file_vector_backed_map(file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_file_vector$.getGlobalValue(), (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED, (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED, (SubLObject)file_vector_backed_map_exerciser.UNPROVIDED));
        SubLObject return_value = (SubLObject)file_vector_backed_map_exerciser.T;
        SubLObject i;
        SubLObject proc_name;
        for (i = (SubLObject)file_vector_backed_map_exerciser.NIL, i = (SubLObject)file_vector_backed_map_exerciser.ZERO_INTEGER; i.numL(num_of_procs); i = Numbers.add(i, (SubLObject)file_vector_backed_map_exerciser.ONE_INTEGER)) {
            proc_name = PrintLow.format((SubLObject)file_vector_backed_map_exerciser.NIL, (SubLObject)file_vector_backed_map_exerciser.$str8$File_Vector_Backed_Map_Trainer___, i);
            PrintLow.format((SubLObject)file_vector_backed_map_exerciser.T, (SubLObject)file_vector_backed_map_exerciser.$str9$Spawning_process__D_____, i);
            return_value = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_backed_map_exerciser.NIL != return_value && file_vector_backed_map_exerciser.NIL != Threads.make_process(proc_name, (SubLObject)file_vector_backed_map_exerciser.$sym10$FILE_VECTOR_BACKED_MAP_EXERCISER_PROCESS));
            Threads.sleep((SubLObject)file_vector_backed_map_exerciser.ZERO_INTEGER);
            PrintLow.format((SubLObject)file_vector_backed_map_exerciser.T, (SubLObject)file_vector_backed_map_exerciser.$str11$_done___);
            streams_high.force_output((SubLObject)file_vector_backed_map_exerciser.UNPROVIDED);
        }
        return return_value;
    }
    
    public static SubLObject declare_file_vector_backed_map_exerciser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_backed_map_exerciser", "initialize_file_vector_backed_map", "INITIALIZE-FILE-VECTOR-BACKED-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_backed_map_exerciser", "file_vector_backed_map_exerciser_process", "FILE-VECTOR-BACKED-MAP-EXERCISER-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_backed_map_exerciser", "file_vector_backed_map_exerciser", "FILE-VECTOR-BACKED-MAP-EXERCISER", 2, 2, false);
        return (SubLObject)file_vector_backed_map_exerciser.NIL;
    }
    
    public static SubLObject init_file_vector_backed_map_exerciser_file() {
        file_vector_backed_map_exerciser.$default_file_vector_backed_map_size$ = SubLFiles.deflexical("*DEFAULT-FILE-VECTOR-BACKED-MAP-SIZE*", (SubLObject)file_vector_backed_map_exerciser.THREE_INTEGER);
        file_vector_backed_map_exerciser.$default_file_vector_data_file$ = SubLFiles.deflexical("*DEFAULT-FILE-VECTOR-DATA-FILE*", (SubLObject)file_vector_backed_map_exerciser.$str4$_home_sjoshi_Projects_Test_datafi);
        file_vector_backed_map_exerciser.$default_file_vector_index_file$ = SubLFiles.deflexical("*DEFAULT-FILE-VECTOR-INDEX-FILE*", (SubLObject)file_vector_backed_map_exerciser.$str5$_home_sjoshi_Projects_Test_indexf);
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_map$ = SubLFiles.deflexical("*FILE-VECTOR-BACKED-MAP-EXERCISER-MAP*", (SubLObject)file_vector_backed_map_exerciser.NIL);
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_file_vector$ = SubLFiles.deflexical("*FILE-VECTOR-BACKED-MAP-EXERCISER-FILE-VECTOR*", (SubLObject)file_vector_backed_map_exerciser.NIL);
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_loop_times$ = SubLFiles.deflexical("*FILE-VECTOR-BACKED-MAP-EXERCISER-LOOP-TIMES*", (SubLObject)file_vector_backed_map_exerciser.NIL);
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_lock$ = SubLFiles.deflexical("*FILE-VECTOR-BACKED-MAP-EXERCISER-LOCK*", (SubLObject)(maybeDefault((SubLObject)file_vector_backed_map_exerciser.$sym6$_FILE_VECTOR_BACKED_MAP_EXERCISER_LOCK_, file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_lock$, file_vector_backed_map_exerciser.NIL)));
        return (SubLObject)file_vector_backed_map_exerciser.NIL;
    }
    
    public static SubLObject setup_file_vector_backed_map_exerciser_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)file_vector_backed_map_exerciser.$sym6$_FILE_VECTOR_BACKED_MAP_EXERCISER_LOCK_);
        generic_testing.define_test_case_table_int((SubLObject)file_vector_backed_map_exerciser.$sym12$FILE_VECTOR_BACKED_MAP_EXERCISER, (SubLObject)ConsesLow.list(new SubLObject[] { file_vector_backed_map_exerciser.$kw13$TEST, file_vector_backed_map_exerciser.NIL, file_vector_backed_map_exerciser.$kw14$OWNER, file_vector_backed_map_exerciser.NIL, file_vector_backed_map_exerciser.$kw15$CLASSES, file_vector_backed_map_exerciser.NIL, file_vector_backed_map_exerciser.$kw16$KB, file_vector_backed_map_exerciser.$kw17$TINY, file_vector_backed_map_exerciser.$kw18$WORKING_, file_vector_backed_map_exerciser.T }), (SubLObject)file_vector_backed_map_exerciser.$list19);
        return (SubLObject)file_vector_backed_map_exerciser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_file_vector_backed_map_exerciser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_file_vector_backed_map_exerciser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_file_vector_backed_map_exerciser_file();
    }
    
    static {
        me = (SubLFile)new file_vector_backed_map_exerciser();
        file_vector_backed_map_exerciser.$default_file_vector_backed_map_size$ = null;
        file_vector_backed_map_exerciser.$default_file_vector_data_file$ = null;
        file_vector_backed_map_exerciser.$default_file_vector_index_file$ = null;
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_map$ = null;
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_file_vector$ = null;
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_loop_times$ = null;
        file_vector_backed_map_exerciser.$file_vector_backed_map_exerciser_lock$ = null;
        $str0$_A__Started____ = SubLObjectFactory.makeString("~A: Started. ~%");
        $str1$_A__Done__going_away___ = SubLObjectFactory.makeString("~A: Done, going away.~%");
        $str2$_A__succeeded___ = SubLObjectFactory.makeString("~A: succeeded.~%");
        $str3$_A_died_before_success___ = SubLObjectFactory.makeString("~A died before success.~%");
        $str4$_home_sjoshi_Projects_Test_datafi = SubLObjectFactory.makeString("/home/sjoshi/Projects/Test/datafile");
        $str5$_home_sjoshi_Projects_Test_indexf = SubLObjectFactory.makeString("/home/sjoshi/Projects/Test/indexfile");
        $sym6$_FILE_VECTOR_BACKED_MAP_EXERCISER_LOCK_ = SubLObjectFactory.makeSymbol("*FILE-VECTOR-BACKED-MAP-EXERCISER-LOCK*");
        $str7$File_Vector_Backed_Map_Exerciser_ = SubLObjectFactory.makeString("File Vector Backed Map Exerciser Data Stream lock");
        $str8$File_Vector_Backed_Map_Trainer___ = SubLObjectFactory.makeString("File Vector Backed Map Trainer #~D");
        $str9$Spawning_process__D_____ = SubLObjectFactory.makeString("Spawning process ~D ... ");
        $sym10$FILE_VECTOR_BACKED_MAP_EXERCISER_PROCESS = SubLObjectFactory.makeSymbol("FILE-VECTOR-BACKED-MAP-EXERCISER-PROCESS");
        $str11$_done___ = SubLObjectFactory.makeString(" done.~%");
        $sym12$FILE_VECTOR_BACKED_MAP_EXERCISER = SubLObjectFactory.makeSymbol("FILE-VECTOR-BACKED-MAP-EXERCISER");
        $kw13$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw14$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw15$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw16$KB = SubLObjectFactory.makeKeyword("KB");
        $kw17$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw18$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_vector_backed_map_exerciser.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(100)), (SubLObject)file_vector_backed_map_exerciser.T));
    }
}

/*

	Total time: 99 ms
	
*/