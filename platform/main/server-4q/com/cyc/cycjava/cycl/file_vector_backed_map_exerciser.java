package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class file_vector_backed_map_exerciser extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new file_vector_backed_map_exerciser();

    public static final String myName = "com.cyc.cycjava_2.cycl.file_vector_backed_map_exerciser";


    // deflexical
    public static final SubLSymbol $default_file_vector_backed_map_size$ = makeSymbol("*DEFAULT-FILE-VECTOR-BACKED-MAP-SIZE*");

    // deflexical
    public static final SubLSymbol $default_file_vector_data_file$ = makeSymbol("*DEFAULT-FILE-VECTOR-DATA-FILE*");

    // deflexical
    public static final SubLSymbol $default_file_vector_index_file$ = makeSymbol("*DEFAULT-FILE-VECTOR-INDEX-FILE*");

    // deflexical
    public static final SubLSymbol $file_vector_backed_map_exerciser_map$ = makeSymbol("*FILE-VECTOR-BACKED-MAP-EXERCISER-MAP*");

    // deflexical
    public static final SubLSymbol $file_vector_backed_map_exerciser_file_vector$ = makeSymbol("*FILE-VECTOR-BACKED-MAP-EXERCISER-FILE-VECTOR*");

    // deflexical
    public static final SubLSymbol $file_vector_backed_map_exerciser_loop_times$ = makeSymbol("*FILE-VECTOR-BACKED-MAP-EXERCISER-LOOP-TIMES*");



    private static final SubLString $str0$_A__Started____ = makeString("~A: Started. ~%");

    private static final SubLString $str1$_A__Done__going_away___ = makeString("~A: Done, going away.~%");

    private static final SubLString $str2$_A__succeeded___ = makeString("~A: succeeded.~%");

    private static final SubLString $str3$_A_died_before_success___ = makeString("~A died before success.~%");

    private static final SubLString $str4$_home_sjoshi_Projects_Test_datafi = makeString("/home/sjoshi/Projects/Test/datafile");

    private static final SubLString $str5$_home_sjoshi_Projects_Test_indexf = makeString("/home/sjoshi/Projects/Test/indexfile");

    public static final SubLSymbol $file_vector_backed_map_exerciser_lock$ = makeSymbol("*FILE-VECTOR-BACKED-MAP-EXERCISER-LOCK*");

    private static final SubLString $str7$File_Vector_Backed_Map_Exerciser_ = makeString("File Vector Backed Map Exerciser Data Stream lock");

    private static final SubLString $str8$File_Vector_Backed_Map_Trainer___ = makeString("File Vector Backed Map Trainer #~D");

    private static final SubLString $str9$Spawning_process__D_____ = makeString("Spawning process ~D ... ");

    private static final SubLSymbol FILE_VECTOR_BACKED_MAP_EXERCISER_PROCESS = makeSymbol("FILE-VECTOR-BACKED-MAP-EXERCISER-PROCESS");

    private static final SubLString $str11$_done___ = makeString(" done.~%");

    private static final SubLSymbol FILE_VECTOR_BACKED_MAP_EXERCISER = makeSymbol("FILE-VECTOR-BACKED-MAP-EXERCISER");













    private static final SubLList $list19 = list(list(list(THREE_INTEGER, makeInteger(100)), T));

    public static SubLObject initialize_file_vector_backed_map() {
        final SubLObject map = make_hash_table($default_file_vector_backed_map_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL($default_file_vector_backed_map_size$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
            map_utilities.map_put(map, i, i);
        }
        file_vector_utilities.create_file_backing_for_map(map, $default_file_vector_data_file$.getGlobalValue(), $default_file_vector_index_file$.getGlobalValue());
        return NIL;
    }

    public static SubLObject file_vector_backed_map_exerciser_process() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        format(T, $str0$_A__Started____, current_process());
        force_output(UNPROVIDED);
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($file_vector_backed_map_exerciser_lock$.getGlobalValue(), thread);
            SubLObject i;
            SubLObject key;
            SubLObject value;
            for (i = NIL, i = ZERO_INTEGER; i.numL($file_vector_backed_map_exerciser_loop_times$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
                key = random.random($default_file_vector_backed_map_size$.getGlobalValue());
                value = file_vector_utilities.file_vector_backed_map_get($file_vector_backed_map_exerciser_map$.getGlobalValue(), $file_vector_backed_map_exerciser_file_vector$.getGlobalValue(), key, UNPROVIDED);
                if (NIL != value) {
                    file_vector_utilities.swap_out_pristine_file_vector_backed_map_object($file_vector_backed_map_exerciser_map$.getGlobalValue(), key);
                }
            }
        } finally {
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        doneP = T;
        format(T, $str1$_A__Done__going_away___, current_process());
        force_output(UNPROVIDED);
        if (NIL != doneP) {
            format(T, $str2$_A__succeeded___, current_process());
        } else {
            format(T, $str3$_A_died_before_success___, current_process());
        }
        return T;
    }

    public static SubLObject file_vector_backed_map_exerciser(final SubLObject num_of_procs, final SubLObject loop_times, SubLObject file_vector_data_file, SubLObject file_vector_index_file) {
        if (file_vector_data_file == UNPROVIDED) {
            file_vector_data_file = NIL;
        }
        if (file_vector_index_file == UNPROVIDED) {
            file_vector_index_file = NIL;
        }
        $file_vector_backed_map_exerciser_loop_times$.setGlobalValue(loop_times);
        $file_vector_backed_map_exerciser_lock$.setGlobalValue(make_lock($str7$File_Vector_Backed_Map_Exerciser_));
        if (NIL != file_vector_data_file) {
            $default_file_vector_data_file$.setGlobalValue(file_vector_data_file);
        }
        if (NIL != file_vector_index_file) {
            $default_file_vector_index_file$.setGlobalValue(file_vector_index_file);
        }
        $file_vector_backed_map_exerciser_file_vector$.setGlobalValue(file_vector.new_file_vector($default_file_vector_data_file$.getGlobalValue(), $default_file_vector_index_file$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        initialize_file_vector_backed_map();
        $file_vector_backed_map_exerciser_map$.setGlobalValue(file_vector_utilities.new_file_vector_backed_map($file_vector_backed_map_exerciser_file_vector$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject return_value = T;
        SubLObject i;
        SubLObject proc_name;
        for (i = NIL, i = ZERO_INTEGER; i.numL(num_of_procs); i = add(i, ONE_INTEGER)) {
            proc_name = format(NIL, $str8$File_Vector_Backed_Map_Trainer___, i);
            format(T, $str9$Spawning_process__D_____, i);
            return_value = makeBoolean((NIL != return_value) && (NIL != make_process(proc_name, FILE_VECTOR_BACKED_MAP_EXERCISER_PROCESS)));
            sleep(ZERO_INTEGER);
            format(T, $str11$_done___);
            force_output(UNPROVIDED);
        }
        return return_value;
    }

    public static SubLObject declare_file_vector_backed_map_exerciser_file() {
        declareFunction("initialize_file_vector_backed_map", "INITIALIZE-FILE-VECTOR-BACKED-MAP", 0, 0, false);
        declareFunction("file_vector_backed_map_exerciser_process", "FILE-VECTOR-BACKED-MAP-EXERCISER-PROCESS", 0, 0, false);
        declareFunction("file_vector_backed_map_exerciser", "FILE-VECTOR-BACKED-MAP-EXERCISER", 2, 2, false);
        return NIL;
    }

    public static SubLObject init_file_vector_backed_map_exerciser_file() {
        deflexical("*DEFAULT-FILE-VECTOR-BACKED-MAP-SIZE*", THREE_INTEGER);
        deflexical("*DEFAULT-FILE-VECTOR-DATA-FILE*", $str4$_home_sjoshi_Projects_Test_datafi);
        deflexical("*DEFAULT-FILE-VECTOR-INDEX-FILE*", $str5$_home_sjoshi_Projects_Test_indexf);
        deflexical("*FILE-VECTOR-BACKED-MAP-EXERCISER-MAP*", NIL);
        deflexical("*FILE-VECTOR-BACKED-MAP-EXERCISER-FILE-VECTOR*", NIL);
        deflexical("*FILE-VECTOR-BACKED-MAP-EXERCISER-LOOP-TIMES*", NIL);
        deflexical("*FILE-VECTOR-BACKED-MAP-EXERCISER-LOCK*", SubLTrampolineFile.maybeDefault($file_vector_backed_map_exerciser_lock$, $file_vector_backed_map_exerciser_lock$, NIL));
        return NIL;
    }

    public static SubLObject setup_file_vector_backed_map_exerciser_file() {
        declare_defglobal($file_vector_backed_map_exerciser_lock$);
        define_test_case_table_int(FILE_VECTOR_BACKED_MAP_EXERCISER, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list19);
        return NIL;
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




























    }
}

/**
 * Total time: 99 ms
 */
