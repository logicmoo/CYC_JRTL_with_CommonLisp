/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryType;
import java.lang.management.MemoryUsage;
import java.util.List;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.management.HeapDumper;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Storage implements SubLFile {
    private static void room_print_stats_helper(String info, long maxMemory, long totalMemory, long usedMemory, long freeMemory) {
        StringBuilder buf = new StringBuilder(2048);
        buf.append(info);
        if (maxMemory > totalMemory)
            buf.append(" max=").append((int) (maxMemory / 1048576.0)).append("MB, ");
        else
            buf.append(" max=");
        buf.append("committed=").append((int) (totalMemory / 1048576.0)).append("MB");
        if (maxMemory > totalMemory)
            buf.append("(").append((int) (100L * totalMemory / maxMemory)).append("%)");
        buf.append(", used=").append((int) (usedMemory / 1048576.0)).append("MB");
        buf.append("(").append((int) (100L * usedMemory / maxMemory)).append("%)");
        buf.append(", free=").append((int) (freeMemory / 1048576.0)).append("MB");
        buf.append("(").append((int) (100L * freeMemory / maxMemory)).append("%)").append("\n");
        PrintLow.format(StreamsLow.$terminal_io$.getDynamicValue().getStream(true), SubLObjectFactory.makeString(buf.toString()));
        streams_high.force_output(StreamsLow.$terminal_io$.getDynamicValue().getStream(true));
    }

    public static SubLObject deregister_low_memory_callback(SubLObject func) {
        SubLMain.deregisterLowMemoryCallback(func.getFunc());
        return SubLNil.NIL;
    }

    public static SubLObject dump_heap(SubLObject fileName) {
        HeapDumper.dumpHeap(fileName.getStringValue(), true);
        return SubLNil.NIL;
    }

    public static SubLObject gc(SubLObject level) {
        return gc_dynamic();
    }

    public static SubLObject gc_dynamic() {
        return gc_ephemeral();
    }

    public static SubLObject gc_ephemeral() {
        Runtime.getRuntime().gc();
        return SubLNil.NIL;
    }

    public static SubLObject gc_full() {
        return gc_dynamic();
    }

    public static SubLObject get_static_area() {
        return SubLNil.NIL;
    }

    public static SubLObject get_thread_private_area() {
        return SubLNil.NIL;
    }

    public static SubLObject get_working_area() {
        return SubLNil.NIL;
    }

    public static SubLObject low_memory_callbacks() {
        return SubLMain.lowMemoryCallbacks();
    }

    public static SubLObject register_low_memory_callback(SubLObject func) {
        SubLMain.registerLowMemoryCallback(func.getFunc());
        return SubLNil.NIL;
    }

    public static SubLObject room(SubLObject x) {
        Runtime rt = Runtime.getRuntime();
        long maxMemory = rt.maxMemory();
        long totalMemory = rt.totalMemory();
        long freeMemory = rt.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        freeMemory = maxMemory - usedMemory;
        room_print_stats_helper("VM memory:", maxMemory, totalMemory, usedMemory, freeMemory);
        if (x == CommonSymbols.T) {
            List<MemoryPoolMXBean> pools = ManagementFactory.getMemoryPoolMXBeans();
            for (MemoryPoolMXBean pool : pools) {
                MemoryType curPoolType = pool.getType();
                MemoryUsage usage = pool.getUsage();
                room_print_stats_helper(" " + pool.getName() + " (" + pool.getType() + "):", usage.getMax(), usage.getCommitted(), usage.getUsed(), usage.getMax() - usage.getUsed());
            }
        }
        return SubLNil.NIL;
    }

    public static SubLFile me;
    public static double oneMB = 1048576.0;
    public static double oneGB = 1.073741824E9;
    public static SubLSymbol $current_area$;
    static {
        me = new Storage();
    }

    @Override
    public void declareFunctions() {
        SubLFiles.declareFunction(Storage.me, "gc_dynamic", "GC-DYNAMIC", 0, 0, false);
        SubLFiles.declareFunction(Storage.me, "gc_ephemeral", "GC-EPHEMERAL", 0, 0, false);
        SubLFiles.declareFunction(Storage.me, "gc_full", "GC-FULL", 0, 0, false);
        SubLFiles.declareFunction(Storage.me, "gc", "GC", 0, 1, false);
        SubLFiles.declareFunction(Storage.me, "dump_heap", "DUMP-HEAP", 1, 0, false);
        SubLFiles.declareFunction(Storage.me, "room", "ROOM", 0, 1, false);
        SubLFiles.declareFunction(Storage.me, "register_low_memory_callback", "REGISTER-LOW-MEMORY-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction(Storage.me, "deregister_low_memory_callback", "DEREGISTER-LOW-MEMORY-CALLBACK", 1, 0, false);
        SubLFiles.declareFunction(Storage.me, "low_memory_callbacks", "LOW-MEMORY-CALLBACKS", 0, 0, false);
        SubLFiles.declareFunction(Storage.me, "get_static_area", "GET-STATIC-AREA", 0, 0, false);
        SubLFiles.declareFunction(Storage.me, "get_thread_private_area", "GET-THREAD-PRIVATE-AREA", 0, 0, false);
        SubLFiles.declareFunction(Storage.me, "get_working_area", "GET-WORKING-AREA", 0, 0, false);
    }

    @Override
    public void initializeVariables() {
        Storage.$current_area$ = SubLFiles.defvar(Storage.me, "*CURRENT-AREA*", SubLNil.NIL);
    }

    @Override
    public void runTopLevelForms() {
    }

    public Storage() {
        BeanShellCntrl.addSubLFile(this);
    }
}
