package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0003 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0003";
    public static final String myFingerPrint = "b40de01fcfc8fed1818aa9ba86b05e7f206c6abd35d3151f52417fa8ec638a64";
    public static SubLSymbol $g3$;
    public static SubLSymbol $g4$;
    public static SubLSymbol $g5$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    
    public static SubLObject f56(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        final SubLObject var6 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic0$);
        var4 = var4.rest();
        final SubLObject var7 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic0$);
        var4 = var4.rest();
        if (NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic2$, var5, (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)), var5, var6), ConsesLow.append((SubLObject)((NIL != var7) ? ConsesLow.list(var7) : NIL), (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var5)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f57(final SubLObject var8) {
        Symbols.put(var8, (SubLObject)$ic7$, (SubLObject)$ic8$);
        return var8;
    }
    
    public static SubLObject f58(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic11$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic11$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)$ic9$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)$ic14$, ConsesLow.append(var7, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic11$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f59() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return Dynamic.sublisp_throw($g3$.getGlobalValue(), Errors.$error_message$.getDynamicValue(var14));
    }
    
    public static SubLObject with_timeout(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic15$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return f60(var6, var7, var8);
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic15$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f60(final SubLObject var18, final SubLObject var19, final SubLObject var13) {
        final SubLObject var20 = (SubLObject)$ic16$;
        final SubLObject var21 = (SubLObject)$ic17$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)ConsesLow.list(reader.bq_cons(var20, (SubLObject)$ic19$)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var20, var19, (SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)ConsesLow.list((SubLObject)$ic20$, var21), (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.listS((SubLObject)$ic18$, (SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)$ic23$, var21, (SubLObject)ConsesLow.list((SubLObject)$ic24$, var18, var20)), ConsesLow.append(var13, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic25$, var21)))));
    }
    
    public static SubLObject f61() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons((SubLObject)$ic27$, $g5$.getDynamicValue(var14));
    }
    
    public static SubLObject f62(final SubLObject var18, final SubLObject var20) {
        if (NIL == module0004.f106(var18)) {
            return (SubLObject)NIL;
        }
        final SubLObject var21 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic28$, f63(var20));
        final SubLObject var22 = Semaphores.new_semaphore(Sequences.cconcatenate(var21, (SubLObject)$ic29$), (SubLObject)UNPROVIDED);
        final SubLObject var23 = Semaphores.new_semaphore(Sequences.cconcatenate(var21, (SubLObject)$ic30$), (SubLObject)UNPROVIDED);
        final SubLObject var24 = module0004.f78(Sequences.cconcatenate(var21, new SubLObject[] { $ic31$, Threads.process_name(Threads.current_process()) }), (SubLObject)$ic32$, (SubLObject)ConsesLow.list(Threads.current_process(), var18, var20, var22, var23));
        Semaphores.semaphore_signal(var22);
        Semaphores.semaphore_wait(var23);
        return var24;
    }
    
    public static SubLObject f63(final SubLObject var20) {
        return var20.rest();
    }
    
    public static SubLObject f64(final SubLObject var21) {
        if (NIL != Threads.valid_process_p(var21)) {
            return Threads.kill_process(var21);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f65(final SubLObject var25, final SubLObject var18, final SubLObject var20, final SubLObject var23, final SubLObject var24) {
        Semaphores.semaphore_signal(var24);
        Semaphores.semaphore_wait(var23);
        Threads.sleep(var18);
        f66(var25, var20);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f66(final SubLObject var25, final SubLObject var20) {
        if (NIL != Threads.valid_process_p(var25)) {
            return module0004.f80(var25, (SubLObject)$ic33$, (SubLObject)ConsesLow.list(var20));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f67(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != $g4$.getDynamicValue(var21)) {
            Dynamic.sublisp_throw(var20, (SubLObject)T);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f68(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var35_36 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic34$);
            var35_36 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic34$);
            if (NIL == conses_high.member(var35_36, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var35_36 == $ic36$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic34$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic38$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : $ic39$);
        final SubLObject var16;
        var4 = (var16 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)ConsesLow.list(var6), (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic23$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var7, var8, var13, var15)), (SubLObject)ConsesLow.listS((SubLObject)$ic41$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var6, var7, var8), ConsesLow.append(var16, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic41$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var6))));
    }
    
    public static SubLObject f69(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic34$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var47_48 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic34$);
            var47_48 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic34$);
            if (NIL == conses_high.member(var47_48, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var47_48 == $ic36$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic34$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic38$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : $ic39$);
        final SubLObject var16;
        var4 = (var16 = var5);
        module0002.f37((SubLObject)$ic44$, (SubLObject)$ic45$);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic46$, (SubLObject)ConsesLow.list(var6, var7, var8, (SubLObject)$ic37$, var13, (SubLObject)$ic38$, var15), ConsesLow.append(var16, (SubLObject)NIL));
    }
    
    public static SubLObject f70(final SubLObject var51, final SubLObject var30, final SubLObject var31) {
        if (NIL == var51) {
            return Errors.error((SubLObject)$ic47$, var30, var31);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f71(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic48$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic48$);
            return (SubLObject)NIL;
        }
        assert NIL != Types.listp(var5) : var5;
        if (NIL == var5) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic1$, var6);
        }
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var8 = (SubLObject)ConsesLow.cons(var10, var8);
            final SubLObject var11 = module0001.f4(var10);
            var7 = (SubLObject)ConsesLow.cons(var11, var7);
            var8 = (SubLObject)ConsesLow.cons(var11, var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic50$, Sequences.nreverse(var7), var6, reader.bq_cons((SubLObject)$ic23$, ConsesLow.append(Sequences.nreverse(var8), (SubLObject)NIL)));
    }
    
    public static SubLObject f72(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic54$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var66_67 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic54$);
            var66_67 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var3, (SubLObject)$ic54$);
            if (NIL == conses_high.member(var66_67, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var66_67 == $ic36$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic54$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var4);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : $ic57$);
        final SubLObject var11;
        var4 = (var11 = var5);
        return f73(var10, var11);
    }
    
    public static SubLObject f73(final SubLObject var69, final SubLObject var13) {
        final SubLObject var70 = (SubLObject)$ic59$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic18$, (SubLObject)ConsesLow.list(var70), (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic23$, var70, (SubLObject)$ic60$), reader.bq_cons((SubLObject)$ic1$, ConsesLow.append(var13, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic41$, var70, (SubLObject)ConsesLow.list((SubLObject)$ic61$, var70), (SubLObject)ConsesLow.list((SubLObject)$ic62$, var70, var69))));
    }
    
    public static SubLObject f74(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic63$);
        var5 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic63$);
            return (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var5) : var5;
        return (SubLObject)$ic65$;
    }
    
    public static SubLObject f75() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0003", "f56", "S#34");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f57", "S#37", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0003", "f58", "CATCH-ERROR-MESSAGE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f59", "S#38", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0003", "with_timeout", "WITH-TIMEOUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f60", "S#39", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f61", "S#40", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f62", "S#41", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f63", "S#42", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f64", "S#43", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f65", "S#44", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f66", "S#45", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f67", "S#46", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0003", "f68", "S#47");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0003", "f69", "S#48");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f70", "S#49", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0003", "f71", "CMULTIPLE-VALUE-SETQ");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0003", "f72", "WITH-SPACE-PROFILING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0003", "f73", "S#50", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0003", "f74", "S#51");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f76() {
        $g3$ = SubLFiles.deflexical("*CATCH-ERROR-MESSAGE-TARGET*", (NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g3$.getGlobalValue() : Symbols.make_symbol((SubLObject)$ic10$));
        $g4$ = SubLFiles.defparameter("S#52", (SubLObject)NIL);
        $g5$ = SubLFiles.defparameter("S#53", (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f77() {
        f57((SubLObject)$ic9$);
        module0002.f50((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0002.f50((SubLObject)$ic24$, (SubLObject)$ic27$);
        module0002.f50((SubLObject)$ic25$, (SubLObject)$ic27$);
        module0002.f50((SubLObject)$ic42$, (SubLObject)$ic46$);
        module0001.f5((SubLObject)$ic51$, (SubLObject)$ic52$);
        module0002.f38((SubLObject)$ic53$);
        module0002.f50((SubLObject)$ic58$, (SubLObject)$ic53$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f75();
    }
    
    public void initializeVariables() {
        f76();
    }
    
    public void runTopLevelForms() {
        f77();
    }
    
    static {
        me = (SubLFile)new module0003();
        $g3$ = null;
        $g4$ = null;
        $g5$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#33", "CYC"), (SubLObject)makeSymbol("DOCUMENTATION"));
        $ic1$ = makeSymbol("PROGN");
        $ic2$ = makeSymbol("DEFLEXICAL");
        $ic3$ = makeSymbol("FIF");
        $ic4$ = makeSymbol("BOUNDP");
        $ic5$ = makeSymbol("QUOTE");
        $ic6$ = makeSymbol("S#37", "CYC");
        $ic7$ = makeKeyword("INITIALIZATION-TYPE");
        $ic8$ = makeKeyword("WORLD");
        $ic9$ = makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*");
        $ic10$ = makeString("ERROR");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic12$ = makeSymbol("CCATCH");
        $ic13$ = makeSymbol("WITH-ERROR-HANDLER");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#38", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("TIME"), (SubLObject)makeSymbol("S#55", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic16$ = makeUninternedSymbol("US#706A092");
        $ic17$ = makeUninternedSymbol("US#32689D5");
        $ic18$ = makeSymbol("CLET");
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#40", "CYC")));
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#52", "CYC"), (SubLObject)T);
        $ic21$ = makeSymbol("CUNWIND-PROTECT");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#53", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("+"), (SubLObject)ONE_INTEGER, (SubLObject)makeSymbol("S#53", "CYC"))));
        $ic23$ = makeSymbol("CSETQ");
        $ic24$ = makeSymbol("S#41", "CYC");
        $ic25$ = makeSymbol("S#43", "CYC");
        $ic26$ = makeSymbol("S#40", "CYC");
        $ic27$ = makeSymbol("WITH-TIMEOUT");
        $ic28$ = makeString("WITH-TIMEOUT ~A");
        $ic29$ = makeString(" client");
        $ic30$ = makeString(" timer");
        $ic31$ = makeString(" Timer for ");
        $ic32$ = makeSymbol("S#44", "CYC");
        $ic33$ = makeSymbol("S#46", "CYC");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#56", "CYC"), (SubLObject)makeSymbol("S#57", "CYC"), (SubLObject)makeSymbol("S#58", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#59", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#60", "CYC"), (SubLObject)makeKeyword("PUBLIC"))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("TIMEOUT"), (SubLObject)makeKeyword("ACCESS-MODE"));
        $ic36$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic37$ = makeKeyword("TIMEOUT");
        $ic38$ = makeKeyword("ACCESS-MODE");
        $ic39$ = makeKeyword("PUBLIC");
        $ic40$ = makeSymbol("S#61", "CYC");
        $ic41$ = makeSymbol("PWHEN");
        $ic42$ = makeSymbol("S#49", "CYC");
        $ic43$ = makeSymbol("CLOSE");
        $ic44$ = makeSymbol("S#48", "CYC");
        $ic45$ = ConsesLow.list((SubLObject)makeSymbol("S#47", "CYC"));
        $ic46$ = makeSymbol("S#47", "CYC");
        $ic47$ = makeString("Connection to ~A:~A timed out.");
        $ic48$ = ConsesLow.list((SubLObject)makeSymbol("S#62", "CYC"), (SubLObject)makeSymbol("S#63", "CYC"));
        $ic49$ = makeSymbol("LISTP");
        $ic50$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic51$ = makeSymbol("CMULTIPLE-VALUE-SETQ");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#62", "CYC"), (SubLObject)makeSymbol("S#63", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic53$ = makeSymbol("WITH-SPACE-PROFILING");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("*STANDARD-OUTPUT*")))), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("STREAM"));
        $ic56$ = makeKeyword("STREAM");
        $ic57$ = makeSymbol("*STANDARD-OUTPUT*");
        $ic58$ = makeSymbol("S#50", "CYC");
        $ic59$ = makeUninternedSymbol("US#260C42F");
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("ADD-SPACE-PROBE", "SUBLISP")));
        $ic61$ = makeSymbol("REMOVE-SPACE-PROBE", "SUBLISP");
        $ic62$ = makeSymbol("%INTERPRET-CSPACE-RESULTS", "SUBLISP");
        $ic63$ = ConsesLow.list((SubLObject)makeSymbol("S#64", "CYC"));
        $ic64$ = makeSymbol("STRINGP");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("PROGN"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 111 ms
	
	Decompiled with Procyon 0.5.32.
*/