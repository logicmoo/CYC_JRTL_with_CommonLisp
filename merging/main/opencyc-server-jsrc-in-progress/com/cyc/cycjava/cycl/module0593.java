package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0593 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0593";
    public static final String myFingerPrint = "c62b112a2dda76359b56babb9fba7c733fd5882a97bde13cf5fef7227655fbe0";
    private static SubLSymbol $g4518$;
    private static SubLSymbol $g4519$;
    private static SubLSymbol $g4520$;
    private static SubLSymbol $g4521$;
    private static SubLSymbol $g4522$;
    private static SubLSymbol $g4523$;
    private static SubLSymbol $g4524$;
    private static SubLSymbol $g4525$;
    private static SubLSymbol $g4526$;
    private static SubLSymbol $g4527$;
    private static SubLSymbol $g4528$;
    private static SubLSymbol $g4529$;
    private static SubLSymbol $g4530$;
    private static SubLSymbol $g4531$;
    private static SubLSymbol $g4532$;
    private static SubLSymbol $g4533$;
    private static SubLSymbol $g4534$;
    private static SubLSymbol $g4535$;
    private static SubLSymbol $g4536$;
    private static SubLSymbol $g4537$;
    private static SubLSymbol $g4538$;
    private static SubLSymbol $g4539$;
    private static SubLSymbol $g4540$;
    public static SubLSymbol $g4541$;
    private static SubLSymbol $g4542$;
    private static SubLSymbol $g4543$;
    private static SubLSymbol $g4544$;
    private static SubLSymbol $g4545$;
    private static SubLSymbol $g4546$;
    private static SubLSymbol $g4547$;
    private static SubLSymbol $g4548$;
    private static SubLSymbol $g4549$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLInteger $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLList $ic58$;
    private static final SubLInteger $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLInteger $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLInteger $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLInteger $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLInteger $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLInteger $ic84$;
    private static final SubLString $ic85$;
    private static final SubLInteger $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    
    public static SubLObject f36266() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0574.f35127(module0574.$g4170$.getDynamicValue(var1));
        if (NIL != module0110.$g1377$.getDynamicValue(var1) && NIL == f36267()) {
            f36268((SubLObject)TEN_INTEGER);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f36269() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4520$.getDynamicValue(var1);
    }
    
    public static SubLObject f36270() {
        return module0571.f34996(module0018.$g677$.getGlobalValue());
    }
    
    public static SubLObject f36271() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f36272();
        if (NIL != f36273()) {
            Threads.set_process_priority(f36274(), Threads.$process_background_priority$.getGlobalValue());
            try {
                f36275();
                $g4519$.setGlobalValue((SubLObject)NIL);
                final SubLObject var2 = Packages.$package$.currentBinding(var1);
                try {
                    Packages.$package$.bind($g4521$.getGlobalValue(), var1);
                    final SubLObject var3 = module0139.$g1630$.getDynamicValue(var1);
                    final SubLObject var2_4 = module0139.$g1631$.currentBinding(var1);
                    final SubLObject var4 = module0139.$g1632$.currentBinding(var1);
                    final SubLObject var5 = module0139.$g1630$.currentBinding(var1);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var3, $g4522$.getDynamicValue(var1)), var1);
                        module0139.$g1632$.bind(module0139.f9016(var3), var1);
                        module0139.$g1630$.bind((SubLObject)T, var1);
                        while (NIL == $g4518$.getGlobalValue()) {
                            while (NIL == $g4518$.getGlobalValue() && NIL != f36276()) {
                                f36277();
                            }
                            Threads.process_wait((SubLObject)$ic3$, Symbols.symbol_function((SubLObject)$ic4$));
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var5, var1);
                        module0139.$g1632$.rebind(var4, var1);
                        module0139.$g1631$.rebind(var2_4, var1);
                    }
                }
                finally {
                    Packages.$package$.rebind(var2, var1);
                }
            }
            finally {
                final SubLObject var6 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var1);
                    f36278();
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var6, var1);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36268(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (NIL != f36267()) {
            f36279((SubLObject)UNPROVIDED);
        }
        $g4518$.setGlobalValue((SubLObject)NIL);
        Threads.make_process((SubLObject)$ic5$, Symbols.symbol_function((SubLObject)$ic6$));
        if (NIL != var7) {
            f36280(var7);
        }
        return f36267();
    }
    
    public static SubLObject f36281(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (NIL != f36267()) {
            f36279((SubLObject)TWENTY_INTEGER);
        }
        return f36268(var7);
    }
    
    public static SubLObject f36279(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        $g4518$.setGlobalValue((SubLObject)T);
        if (NIL != f36267() && NIL != var7) {
            f36282(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36283() {
        $g4518$.setGlobalValue((SubLObject)T);
        if (NIL != f36267()) {
            Threads.kill_process(f36274());
            f36278();
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36284() {
        if (NIL != f36267()) {
            f36283();
            return f36268((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36280(SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var9 = module0051.time_from_now(var8);
        while (NIL == f36267() && NIL == Time.time_has_arrivedP(var9)) {
            Threads.sleep((SubLObject)ONE_INTEGER);
        }
        return f36267();
    }
    
    public static SubLObject f36282(SubLObject var8) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var9 = module0051.time_from_now(var8);
        while (NIL != f36267() && NIL == Time.time_has_arrivedP(var9)) {
            Threads.sleep((SubLObject)ONE_INTEGER);
        }
        return (SubLObject)makeBoolean(NIL == f36267());
    }
    
    public static SubLObject f36285() {
        $g4518$.setGlobalValue((SubLObject)NIL);
        if (NIL == f36267()) {
            f36268((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36274() {
        return $g4523$.getGlobalValue();
    }
    
    public static SubLObject f36267() {
        return Threads.valid_process_p(f36274());
    }
    
    public static SubLObject f36286() {
        if (NIL != f36267()) {
            return Threads.process_whostate(f36274());
        }
        return (SubLObject)$ic9$;
    }
    
    public static SubLObject f36273() {
        return Equality.eq(Threads.current_process(), f36274());
    }
    
    public static SubLObject f36287() {
        return (SubLObject)makeBoolean(NIL != f36267() && NIL != module0059.f4196(f36274()));
    }
    
    public static SubLObject f36288() {
        return (SubLObject)makeBoolean(NIL != f36267() && NIL != module0059.f4197(f36274()));
    }
    
    public static SubLObject f36272() {
        final SubLObject var10 = $g4524$.getGlobalValue();
        SubLObject var11 = (SubLObject)NIL;
        try {
            var11 = Locks.seize_lock(var10);
            if (NIL == $g4523$.getGlobalValue()) {
                $g4523$.setGlobalValue(Threads.current_process());
            }
        }
        finally {
            if (NIL != var11) {
                Locks.release_lock(var10);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36278() {
        final SubLObject var12 = $g4524$.getGlobalValue();
        SubLObject var13 = (SubLObject)NIL;
        try {
            var13 = Locks.seize_lock(var12);
            $g4523$.setGlobalValue((SubLObject)NIL);
        }
        finally {
            if (NIL != var13) {
                Locks.release_lock(var12);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36289() {
        return $g4525$.getGlobalValue();
    }
    
    public static SubLObject f36290() {
        return $g4526$.getGlobalValue();
    }
    
    public static SubLObject f36291(final SubLObject var14) {
        if (NIL != module0004.f104(var14, $g4525$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            $g4526$.setGlobalValue(var14);
            return var14;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36292() {
        return Equality.eq(f36290(), (SubLObject)$ic14$);
    }
    
    public static SubLObject f36293(final SubLObject var15) {
        if (NIL != module0075.f5193(var15)) {
            $g4527$.setDynamicValue(var15);
            return var15;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36294() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g4527$.getDynamicValue(var1);
    }
    
    public static SubLObject f36275() {
        if (NIL == module0572.f35035()) {
            module0572.f35017();
        }
        if (NIL == module0572.f35020()) {
            module0572.f35018((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36276() {
        SubLObject var16 = f36295();
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            final SubLObject var18 = f36296(var17);
            if (NIL != Symbols.fboundp(var18) && NIL != Functions.funcall(var18)) {
                final SubLObject var19 = f36297(var17);
                if (NIL != Symbols.fboundp(var19)) {
                    return var17;
                }
            }
            var16 = var16.rest();
            var17 = var16.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36298() {
        module0018.$g678$.setGlobalValue((SubLObject)NIL);
        module0018.$g679$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36277() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f36298();
        final SubLObject var2 = f36276();
        if (NIL != var2) {
            final SubLObject var3 = f36297(var2);
            final SubLObject var4 = $g4520$.currentBinding(var1);
            try {
                $g4520$.bind((SubLObject)T, var1);
                Functions.funcall(var3);
            }
            finally {
                $g4520$.rebind(var4, var1);
            }
        }
        return var2;
    }
    
    public static SubLObject f36299(final SubLObject var18, final SubLObject var19, final SubLObject var20) {
        assert NIL != Types.symbolp(var18) : var18;
        assert NIL != Types.symbolp(var19) : var19;
        assert NIL != Types.numberp(var20) : var20;
        f36300(var18);
        final SubLObject var21 = $g4529$.getGlobalValue();
        SubLObject var22 = (SubLObject)NIL;
        try {
            var22 = Locks.seize_lock(var21);
            $g4528$.setGlobalValue(module0035.f2245((SubLObject)ConsesLow.list(var18, var19, var20), $g4528$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic19$), Symbols.symbol_function((SubLObject)$ic20$)));
        }
        finally {
            if (NIL != var22) {
                Locks.release_lock(var21);
            }
        }
        return var18;
    }
    
    public static SubLObject f36300(final SubLObject var18) {
        final SubLObject var19 = $g4529$.getGlobalValue();
        SubLObject var20 = (SubLObject)NIL;
        try {
            var20 = Locks.seize_lock(var19);
            $g4528$.setGlobalValue(Sequences.delete(var18, $g4528$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var20) {
                Locks.release_lock(var19);
            }
        }
        return var18;
    }
    
    public static SubLObject f36295() {
        return $g4528$.getGlobalValue();
    }
    
    public static SubLObject f36296(final SubLObject var17) {
        return var17.first();
    }
    
    public static SubLObject f36297(final SubLObject var17) {
        return conses_high.second(var17);
    }
    
    public static SubLObject f36301(final SubLObject var17) {
        return conses_high.third(var17);
    }
    
    public static SubLObject f36302() {
        return $g4518$.getGlobalValue();
    }
    
    public static SubLObject f36303() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36304() {
        return $g4519$.getGlobalValue();
    }
    
    public static SubLObject f36305() {
        return (SubLObject)makeBoolean(NIL != module0574.f35138() && ((NIL != Time.time_has_arrivedP($g4532$.getGlobalValue()) && NIL == module0575.f35258() && NIL != module0575.f35244()) || module0575.f35257().numG($g4530$.getGlobalValue())));
    }
    
    public static SubLObject f36306() {
        $g4532$.setGlobalValue(module0051.time_from_now(Numbers.add($g4531$.getGlobalValue(), random.random((SubLObject)TWENTY_INTEGER))));
        module0574.f35172();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36307() {
        return (SubLObject)makeBoolean(NIL != module0574.f35120() && ((NIL != Time.time_has_arrivedP($g4535$.getGlobalValue()) && NIL == module0575.f35273()) || module0575.f35272().numGE($g4534$.getGlobalValue())));
    }
    
    public static SubLObject f36308() {
        $g4535$.setGlobalValue(module0051.time_from_now(Numbers.add($g4533$.getGlobalValue(), random.random((SubLObject)TWENTY_INTEGER))));
        module0574.f35205();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36309() {
        return (SubLObject)makeBoolean(NIL != module0574.f35136() && NIL == module0575.f35268());
    }
    
    public static SubLObject f36310() {
        return f36311((SubLObject)$ic33$);
    }
    
    public static SubLObject f36311(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        final SubLObject var28 = module0538.$g3922$.currentBinding(var26);
        final SubLObject var29 = module0538.$g3921$.currentBinding(var26);
        try {
            module0538.$g3922$.bind((SubLObject)NIL, var26);
            module0538.$g3921$.bind((SubLObject)NIL, var26);
            final SubLObject var2_27 = Errors.$continue_cerrorP$.currentBinding(var26);
            final SubLObject var5_28 = module0111.$g1406$.currentBinding(var26);
            final SubLObject var30 = module0018.$g689$.currentBinding(var26);
            final SubLObject var31 = module0575.$g4211$.currentBinding(var26);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)T, var26);
                module0111.$g1406$.bind((SubLObject)NIL, var26);
                module0018.$g689$.bind((SubLObject)NIL, var26);
                module0575.$g4211$.bind((SubLObject)T, var26);
                try {
                    var26.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var2_28 = Errors.$error_handler$.currentBinding(var26);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic36$, var26);
                        try {
                            Functions.funcall(var25);
                        }
                        catch (Throwable var32) {
                            Errors.handleThrowable(var32, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var2_28, var26);
                    }
                }
                catch (Throwable var33) {
                    var27 = Errors.handleThrowable(var33, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var26.throwStack.pop();
                }
            }
            finally {
                module0575.$g4211$.rebind(var31, var26);
                module0018.$g689$.rebind(var30, var26);
                module0111.$g1406$.rebind(var5_28, var26);
                Errors.$continue_cerrorP$.rebind(var2_27, var26);
            }
            if (NIL == var27) {
                try {
                    var26.throwStack.push(module0003.$g3$.getGlobalValue());
                    final SubLObject var2_29 = Errors.$error_handler$.currentBinding(var26);
                    try {
                        Errors.$error_handler$.bind((SubLObject)$ic36$, var26);
                        try {
                            f36312();
                        }
                        catch (Throwable var34) {
                            Errors.handleThrowable(var34, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var2_29, var26);
                    }
                }
                catch (Throwable var35) {
                    var27 = Errors.handleThrowable(var35, module0003.$g3$.getGlobalValue());
                }
                finally {
                    var26.throwStack.pop();
                }
            }
            if (NIL != var27) {
                Errors.warn((SubLObject)$ic37$, var27);
            }
        }
        finally {
            module0538.$g3921$.rebind(var29, var26);
            module0538.$g3922$.rebind(var28, var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36312() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != module0538.f33324()) {
            SubLObject var3;
            final SubLObject var2 = var3 = module0538.f33325();
            SubLObject var4 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)$ic38$);
            var4 = var3.first();
            var3 = var3.rest();
            final SubLObject var5 = (SubLObject)(var3.isCons() ? var3.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var3, var2, (SubLObject)$ic38$);
            final SubLObject var6;
            var3 = (var6 = var3.rest());
            Functions.apply(Symbols.symbol_function((SubLObject)$ic39$), (SubLObject)$ic40$, new SubLObject[] { Sequences.cconcatenate((SubLObject)$ic41$, (NIL != var5) ? var5 : PrintLow.format((SubLObject)NIL, (SubLObject)$ic42$, var4)), f36270(), var6 });
            module0538.f33317();
        }
        else if (NIL != module0018.$g680$.getDynamicValue(var1) && NIL == Errors.$ignore_warnsP$.getDynamicValue(var1) && NIL != module0538.f33321()) {
            SubLObject var8;
            final SubLObject var7 = var8 = module0538.f33322();
            SubLObject var9 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic43$);
            var9 = var8.first();
            var8 = var8.rest();
            final SubLObject var5 = (SubLObject)(var8.isCons() ? var8.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var8, var7, (SubLObject)$ic43$);
            final SubLObject var6;
            var8 = (var6 = var8.rest());
            Functions.apply(Symbols.symbol_function((SubLObject)$ic44$), Sequences.cconcatenate((SubLObject)$ic41$, (NIL != var5) ? var5 : PrintLow.format((SubLObject)NIL, (SubLObject)$ic45$, var9)), new SubLObject[] { f36270(), var6 });
            module0538.f33318();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36313() {
        return (SubLObject)makeBoolean(NIL != module0574.f35134() && NIL == module0575.f35244());
    }
    
    public static SubLObject f36314() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0538.$g3922$.currentBinding(var1);
        final SubLObject var4 = module0538.$g3921$.currentBinding(var1);
        try {
            module0538.$g3922$.bind((SubLObject)NIL, var1);
            module0538.$g3921$.bind((SubLObject)NIL, var1);
            SubLObject var5 = f36290();
            if (var5.eql((SubLObject)$ic46$)) {
                try {
                    var1.throwStack.push($ic47$);
                    final SubLObject var2_43 = Errors.$error_abort_handler$.currentBinding(var1);
                    try {
                        Errors.$error_abort_handler$.bind(Symbols.symbol_function((SubLObject)$ic48$), var1);
                        module0575.f35286();
                    }
                    finally {
                        Errors.$error_abort_handler$.rebind(var2_43, var1);
                    }
                }
                catch (Throwable var6) {
                    var2 = Errors.handleThrowable(var6, (SubLObject)$ic47$);
                }
                finally {
                    var1.throwStack.pop();
                }
            }
            else {
                final SubLObject var2_44 = Errors.$continue_cerrorP$.currentBinding(var1);
                try {
                    Errors.$continue_cerrorP$.bind((SubLObject)T, var1);
                    try {
                        var1.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var2_45 = Errors.$error_handler$.currentBinding(var1);
                        try {
                            Errors.$error_handler$.bind((SubLObject)$ic36$, var1);
                            try {
                                module0575.f35286();
                            }
                            catch (Throwable var7) {
                                Errors.handleThrowable(var7, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var2_45, var1);
                        }
                    }
                    catch (Throwable var8) {
                        var2 = Errors.handleThrowable(var8, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var1.throwStack.pop();
                    }
                }
                finally {
                    Errors.$continue_cerrorP$.rebind(var2_44, var1);
                }
            }
            var5 = f36290();
            if (var5.eql((SubLObject)$ic49$)) {
                if (NIL == var2) {
                    try {
                        var1.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var2_46 = Errors.$error_handler$.currentBinding(var1);
                        try {
                            Errors.$error_handler$.bind((SubLObject)$ic36$, var1);
                            try {
                                f36312();
                            }
                            catch (Throwable var9) {
                                Errors.handleThrowable(var9, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var2_46, var1);
                        }
                    }
                    catch (Throwable var6) {
                        var2 = Errors.handleThrowable(var6, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var1.throwStack.pop();
                    }
                }
                if (NIL != var2) {
                    Errors.warn((SubLObject)$ic37$, var2);
                }
            }
            else if (var5.eql((SubLObject)$ic13$)) {
                if (NIL == var2) {
                    try {
                        var1.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var2_47 = Errors.$error_handler$.currentBinding(var1);
                        try {
                            Errors.$error_handler$.bind((SubLObject)$ic36$, var1);
                            try {
                                f36312();
                            }
                            catch (Throwable var9) {
                                Errors.handleThrowable(var9, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var2_47, var1);
                        }
                    }
                    catch (Throwable var6) {
                        var2 = Errors.handleThrowable(var6, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var1.throwStack.pop();
                    }
                }
                if (NIL != var2) {
                    module0018.$g678$.setGlobalValue(var2);
                    f36279((SubLObject)UNPROVIDED);
                }
            }
            else if (var5.eql((SubLObject)$ic46$)) {
                f36312();
            }
            else if (var5.eql((SubLObject)$ic14$)) {
                if (NIL == var2) {
                    try {
                        var1.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var2_48 = Errors.$error_handler$.currentBinding(var1);
                        try {
                            Errors.$error_handler$.bind((SubLObject)$ic36$, var1);
                            try {
                                f36312();
                            }
                            catch (Throwable var9) {
                                Errors.handleThrowable(var9, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var2_48, var1);
                        }
                    }
                    catch (Throwable var6) {
                        var2 = Errors.handleThrowable(var6, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var1.throwStack.pop();
                    }
                }
                if (NIL != var2) {
                    f36315(module0018.$g677$.getGlobalValue());
                }
            }
        }
        finally {
            module0538.$g3921$.rebind(var4, var1);
            module0538.$g3922$.rebind(var3, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36316() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        Dynamic.sublisp_throw((SubLObject)$ic47$, Errors.$error_message$.getDynamicValue(var1));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36315(final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        SubLObject var51 = module0575.f35248();
        final SubLObject var52 = module0574.f35152();
        final SubLObject var53 = module0051.f3557((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == f36317(var51)) {
            var51 = f36318();
        }
        final SubLObject var54 = (SubLObject)ConsesLow.list(module0571.f34986(var52), module0018.f967(), var53, var49);
        final SubLObject var55 = (SubLObject)ConsesLow.list(module0571.f34986(var52), module0018.f967(), var53, var51);
        SubLObject var56 = (SubLObject)NIL;
        try {
            var56 = compatibility.open_text($g4527$.getDynamicValue(var50), (SubLObject)$ic53$);
            if (!var56.isStream()) {
                Errors.error((SubLObject)$ic54$, $g4527$.getDynamicValue(var50));
            }
            final SubLObject var57 = var56;
            PrintLow.format(var57, (SubLObject)$ic55$, var54);
            PrintLow.format(var57, (SubLObject)$ic55$, var55);
        }
        finally {
            final SubLObject var58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var50);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var50);
                if (var56.isStream()) {
                    streams_high.close(var56, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var58, var50);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36317(final SubLObject var57) {
        return (SubLObject)makeBoolean(var57.isList() && var57.first() == $ic56$);
    }
    
    public static SubLObject f36318() {
        return (SubLObject)ConsesLow.listS((SubLObject)$ic56$, module0571.f34986($ic57$), (SubLObject)$ic58$);
    }
    
    public static SubLObject f36319() {
        return (SubLObject)makeBoolean(NIL != Time.time_has_arrivedP($g4537$.getGlobalValue()) && NIL == module0575.f35273() && NIL != module0574.f35120() && NIL != module0575.f35244() && NIL != module0575.f35258());
    }
    
    public static SubLObject f36320() {
        $g4537$.setGlobalValue(module0051.time_from_now(Numbers.add($g4536$.getGlobalValue(), random.random((SubLObject)TWENTY_INTEGER))));
        module0574.f35205();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36321() {
        return module0574.f35216();
    }
    
    public static SubLObject f36322() {
        return f36311((SubLObject)$ic64$);
    }
    
    public static SubLObject f36323() {
        final SubLObject var58 = module0574.f35132();
        if (NIL != var58 && NIL != $g4540$.getGlobalValue()) {
            return Time.time_has_arrivedP($g4539$.getGlobalValue());
        }
        $g4540$.setGlobalValue(var58);
        return var58;
    }
    
    public static SubLObject f36324() {
        $g4539$.setGlobalValue(module0051.time_from_now((SubLObject)((NIL == module0018.f976()) ? ZERO_INTEGER : Numbers.add($g4538$.getGlobalValue(), random.random((SubLObject)TWENTY_INTEGER)))));
        module0574.f35214();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36325() {
        return (SubLObject)makeBoolean(NIL != $g4541$.getGlobalValue() && NIL != Time.time_has_arrivedP($g4543$.getGlobalValue()));
    }
    
    public static SubLObject f36326() {
        $g4543$.setGlobalValue(module0051.time_from_now($g4542$.getGlobalValue()));
        return module0414.f28946();
    }
    
    public static SubLObject f36327() {
        return (SubLObject)makeBoolean(NIL != module0018.f978() && NIL != Time.time_has_arrivedP($g4545$.getGlobalValue()));
    }
    
    public static SubLObject f36328() {
        $g4545$.setGlobalValue(module0051.time_from_now($g4544$.getGlobalValue()));
        return module0414.f28990();
    }
    
    public static SubLObject f36329(final SubLObject var59, final SubLObject var60, final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && (!var59.isInteger() || !ZERO_INTEGER.numLE(var59) || !var59.numLE((SubLObject)$ic84$))) {
            Errors.error((SubLObject)$ic85$);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && (!var60.isInteger() || !ZERO_INTEGER.numLE(var60) || !var60.numLE((SubLObject)$ic86$))) {
            Errors.error((SubLObject)$ic87$);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && (!var61.isInteger() || !ZERO_INTEGER.numLE(var61) || !var61.numLE((SubLObject)$ic86$))) {
            Errors.error((SubLObject)$ic88$);
        }
        final SubLObject var63 = $g4546$.getGlobalValue();
        SubLObject var64 = (SubLObject)NIL;
        try {
            var64 = Locks.seize_lock(var63);
            $g4548$.setGlobalValue((SubLObject)ConsesLow.list(var59, var60, var61));
            f36330();
            $g4547$.setGlobalValue((SubLObject)T);
        }
        finally {
            if (NIL != var64) {
                Locks.release_lock(var63);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36331() {
        final SubLObject var64 = $g4546$.getGlobalValue();
        SubLObject var65 = (SubLObject)NIL;
        try {
            var65 = Locks.seize_lock(var64);
            $g4547$.setGlobalValue((SubLObject)NIL);
        }
        finally {
            if (NIL != var65) {
                Locks.release_lock(var64);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36332() {
        return (SubLObject)makeBoolean(NIL != $g4547$.getGlobalValue() && NIL != $g4549$.getGlobalValue() && NIL != Time.time_has_arrivedP($g4549$.getGlobalValue()));
    }
    
    public static SubLObject f36333() {
        final SubLObject var66 = Sequences.cconcatenate((SubLObject)$ic90$, module0006.f203(module0051.f3552((SubLObject)UNPROVIDED)));
        f36334();
        Storage.gc_full();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36330() {
        SubLObject var68;
        final SubLObject var67 = var68 = $g4548$.getGlobalValue();
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)$ic93$);
        var69 = var68.first();
        var68 = var68.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)$ic93$);
        var70 = var68.first();
        var68 = var68.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var68, var67, (SubLObject)$ic93$);
        var71 = var68.first();
        var68 = var68.rest();
        if (NIL == var68) {
            $g4549$.setGlobalValue(module0051.f3566(var71, var70, var69));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var67, (SubLObject)$ic93$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36334() {
        Threads.sleep((SubLObject)ONE_INTEGER);
        final SubLObject var69 = $g4546$.getGlobalValue();
        SubLObject var70 = (SubLObject)NIL;
        try {
            var70 = Locks.seize_lock(var69);
            f36330();
        }
        finally {
            if (NIL != var70) {
                Locks.release_lock(var69);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36335() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36266", "INITIALIZE-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36269", "S#24680", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36270", "S#39988", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36271", "S#39989", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36268", "START-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36281", "S#39990", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36279", "HALT-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36283", "S#39991", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36284", "S#39992", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36280", "S#39993", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36282", "S#39994", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36285", "S#39995", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36274", "S#39996", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36267", "AGENDA-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36286", "S#38530", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36273", "S#39997", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36287", "S#39998", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36288", "S#38545", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36272", "S#39999", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36278", "S#40000", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36289", "S#40001", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36290", "S#24681", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36291", "S#40002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36292", "S#40003", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36293", "S#40004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36294", "S#40005", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36275", "S#40006", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36276", "S#39975", 0, 0, false);
        new $f36276$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36298", "S#40007", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36277", "S#40008", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36299", "S#40009", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36300", "S#40010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36295", "S#40011", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36296", "S#40012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36297", "S#40013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36301", "S#40014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36302", "S#39976", 0, 0, false);
        new $f36302$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36303", "S#40015", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36304", "S#39977", 0, 0, false);
        new $f36304$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36305", "S#39978", 0, 0, false);
        new $f36305$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36306", "S#40016", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36307", "S#39979", 0, 0, false);
        new $f36307$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36308", "S#40017", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36309", "S#39980", 0, 0, false);
        new $f36309$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36310", "S#40018", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36311", "S#40019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36312", "S#40020", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36313", "S#39981", 0, 0, false);
        new $f36313$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36314", "S#40021", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36316", "S#40022", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36315", "S#40023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36317", "S#40024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36318", "S#40025", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36319", "S#39982", 0, 0, false);
        new $f36319$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36320", "S#40026", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36321", "S#39983", 0, 0, false);
        new $f36321$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36322", "S#40027", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36323", "S#39984", 0, 0, false);
        new $f36323$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36324", "S#40028", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36325", "S#39985", 0, 0, false);
        new $f36325$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36326", "S#40029", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36327", "S#39986", 0, 0, false);
        new $f36327$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36328", "S#40030", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36329", "S#40031", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36331", "S#40032", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36332", "S#39987", 0, 0, false);
        new $f36332$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36333", "S#40033", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36330", "S#40034", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0593", "f36334", "S#40035", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36336() {
        $g4518$ = SubLFiles.deflexical("S#40036", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g4518$.getGlobalValue() : NIL));
        $g4519$ = SubLFiles.deflexical("S#40037", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g4519$.getGlobalValue() : NIL));
        $g4520$ = SubLFiles.defparameter("S#40038", (SubLObject)NIL);
        $g4521$ = SubLFiles.deflexical("S#40039", Packages.find_package((SubLObject)$ic2$));
        $g4522$ = SubLFiles.defparameter("S#40040", (SubLObject)TEN_INTEGER);
        $g4523$ = SubLFiles.deflexical("S#40041", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic7$)) ? $g4523$.getGlobalValue() : NIL));
        $g4524$ = SubLFiles.deflexical("S#40042", Locks.make_lock((SubLObject)$ic10$));
        $g4525$ = SubLFiles.deflexical("S#40043", (SubLObject)$ic11$);
        $g4526$ = SubLFiles.deflexical("S#40044", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic12$)) ? $g4526$.getGlobalValue() : $ic13$));
        $g4527$ = SubLFiles.defvar("S#40045", (SubLObject)NIL);
        $g4528$ = SubLFiles.deflexical("S#40046", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic15$)) ? $g4528$.getGlobalValue() : NIL));
        $g4529$ = SubLFiles.deflexical("S#40047", Locks.make_lock((SubLObject)$ic16$));
        $g4530$ = SubLFiles.deflexical("S#40048", (SubLObject)TWENTY_INTEGER);
        $g4531$ = SubLFiles.deflexical("S#40049", (SubLObject)$ic25$);
        $g4532$ = SubLFiles.deflexical("S#40050", (NIL != Symbols.boundp((SubLObject)$ic26$)) ? $g4532$.getGlobalValue() : Time.get_universal_time());
        $g4533$ = SubLFiles.deflexical("S#40051", Numbers.multiply((SubLObject)TEN_INTEGER, (SubLObject)$ic25$));
        $g4534$ = SubLFiles.deflexical("S#40052", (SubLObject)$ic29$);
        $g4535$ = SubLFiles.deflexical("S#40053", (NIL != Symbols.boundp((SubLObject)$ic30$)) ? $g4535$.getGlobalValue() : Time.get_universal_time());
        $g4536$ = SubLFiles.deflexical("S#40054", (SubLObject)$ic59$);
        $g4537$ = SubLFiles.deflexical("S#40055", (NIL != Symbols.boundp((SubLObject)$ic60$)) ? $g4537$.getGlobalValue() : Time.get_universal_time());
        $g4538$ = SubLFiles.deflexical("S#40056", (SubLObject)$ic59$);
        $g4539$ = SubLFiles.deflexical("S#40057", (NIL != Symbols.boundp((SubLObject)$ic68$)) ? $g4539$.getGlobalValue() : Time.get_universal_time());
        $g4540$ = SubLFiles.deflexical("S#40058", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic69$)) ? $g4540$.getGlobalValue() : NIL));
        $g4541$ = SubLFiles.deflexical("S#40059", (SubLObject)T);
        $g4542$ = SubLFiles.deflexical("S#40060", Numbers.multiply((SubLObject)$ic25$, (SubLObject)TEN_INTEGER));
        $g4543$ = SubLFiles.deflexical("S#40061", (NIL != Symbols.boundp((SubLObject)$ic73$)) ? $g4543$.getGlobalValue() : Time.get_universal_time());
        $g4544$ = SubLFiles.deflexical("S#40062", Numbers.multiply((SubLObject)$ic25$, (SubLObject)ONE_INTEGER));
        $g4545$ = SubLFiles.deflexical("S#40063", (NIL != Symbols.boundp((SubLObject)$ic76$)) ? $g4545$.getGlobalValue() : Time.get_universal_time());
        $g4546$ = SubLFiles.deflexical("S#40064", Locks.make_lock((SubLObject)$ic80$));
        $g4547$ = SubLFiles.deflexical("S#40065", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic81$)) ? $g4547$.getGlobalValue() : NIL));
        $g4548$ = SubLFiles.deflexical("S#40066", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic82$)) ? $g4548$.getGlobalValue() : $ic83$));
        $g4549$ = SubLFiles.deflexical("S#40067", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic89$)) ? $g4549$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36337() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        module0003.f57((SubLObject)$ic7$);
        module0002.f38((SubLObject)$ic8$);
        module0003.f57((SubLObject)$ic12$);
        module0003.f57((SubLObject)$ic15$);
        f36299((SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)ZERO_INTEGER);
        f36299((SubLObject)$ic24$, (SubLObject)$ic23$, (SubLObject)ZERO_INTEGER);
        module0003.f57((SubLObject)$ic26$);
        f36299((SubLObject)$ic27$, (SubLObject)$ic28$, (SubLObject)TEN_INTEGER);
        module0003.f57((SubLObject)$ic30$);
        f36299((SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)FIFTEEN_INTEGER);
        f36299((SubLObject)$ic34$, (SubLObject)$ic35$, (SubLObject)TWENTY_INTEGER);
        f36299((SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)$ic52$);
        module0003.f57((SubLObject)$ic60$);
        f36299((SubLObject)$ic61$, (SubLObject)$ic62$, (SubLObject)$ic63$);
        f36299((SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)$ic67$);
        module0003.f57((SubLObject)$ic68$);
        module0003.f57((SubLObject)$ic69$);
        f36299((SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic72$);
        module0003.f57((SubLObject)$ic73$);
        f36299((SubLObject)$ic74$, (SubLObject)$ic75$, (SubLObject)$ic25$);
        module0003.f57((SubLObject)$ic76$);
        f36299((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)$ic79$);
        module0003.f57((SubLObject)$ic81$);
        module0003.f57((SubLObject)$ic82$);
        module0003.f57((SubLObject)$ic89$);
        f36299((SubLObject)$ic91$, (SubLObject)$ic92$, (SubLObject)$ic29$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f36335();
    }
    
    public void initializeVariables() {
        f36336();
    }
    
    public void runTopLevelForms() {
        f36337();
    }
    
    static {
        me = (SubLFile)new module0593();
        $g4518$ = null;
        $g4519$ = null;
        $g4520$ = null;
        $g4521$ = null;
        $g4522$ = null;
        $g4523$ = null;
        $g4524$ = null;
        $g4525$ = null;
        $g4526$ = null;
        $g4527$ = null;
        $g4528$ = null;
        $g4529$ = null;
        $g4530$ = null;
        $g4531$ = null;
        $g4532$ = null;
        $g4533$ = null;
        $g4534$ = null;
        $g4535$ = null;
        $g4536$ = null;
        $g4537$ = null;
        $g4538$ = null;
        $g4539$ = null;
        $g4540$ = null;
        $g4541$ = null;
        $g4542$ = null;
        $g4543$ = null;
        $g4544$ = null;
        $g4545$ = null;
        $g4546$ = null;
        $g4547$ = null;
        $g4548$ = null;
        $g4549$ = null;
        $ic0$ = makeSymbol("S#40036", "CYC");
        $ic1$ = makeSymbol("S#40037", "CYC");
        $ic2$ = makeString("CYC");
        $ic3$ = makeString("Idle");
        $ic4$ = makeSymbol("S#39975", "CYC");
        $ic5$ = makeString("Cyc Agenda");
        $ic6$ = makeSymbol("S#39989", "CYC");
        $ic7$ = makeSymbol("S#40041", "CYC");
        $ic8$ = makeSymbol("AGENDA-RUNNING");
        $ic9$ = makeString("None");
        $ic10$ = makeString("Agenda Process Lock");
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("IGNORE"), (SubLObject)makeKeyword("HALT"), (SubLObject)makeKeyword("DEBUG"), (SubLObject)makeKeyword("LOG"));
        $ic12$ = makeSymbol("S#40044", "CYC");
        $ic13$ = makeKeyword("HALT");
        $ic14$ = makeKeyword("LOG");
        $ic15$ = makeSymbol("S#40046", "CYC");
        $ic16$ = makeString("Agenda Action Table Lock");
        $ic17$ = makeSymbol("SYMBOLP");
        $ic18$ = makeSymbol("NUMBERP");
        $ic19$ = makeSymbol("<");
        $ic20$ = makeSymbol("S#40014", "CYC");
        $ic21$ = makeSymbol("FIRST");
        $ic22$ = makeSymbol("S#39976", "CYC");
        $ic23$ = makeSymbol("S#40015", "CYC");
        $ic24$ = makeSymbol("S#39977", "CYC");
        $ic25$ = makeInteger(60);
        $ic26$ = makeSymbol("S#40050", "CYC");
        $ic27$ = makeSymbol("S#39978", "CYC");
        $ic28$ = makeSymbol("S#40016", "CYC");
        $ic29$ = makeInteger(1000);
        $ic30$ = makeSymbol("S#40053", "CYC");
        $ic31$ = makeSymbol("S#39979", "CYC");
        $ic32$ = makeSymbol("S#40017", "CYC");
        $ic33$ = makeSymbol("S#38693", "CYC");
        $ic34$ = makeSymbol("S#39980", "CYC");
        $ic35$ = makeSymbol("S#40018", "CYC");
        $ic36$ = makeSymbol("S#38", "CYC");
        $ic37$ = makeString("~A");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("ERROR"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic39$ = makeSymbol("CERROR");
        $ic40$ = makeString("Continue the agenda");
        $ic41$ = makeString("~%Last operation: ~S~%");
        $ic42$ = makeString("FI error: ~A");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("WARNING"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic44$ = makeSymbol("WARN");
        $ic45$ = makeString("FI warning: ~A");
        $ic46$ = makeKeyword("DEBUG");
        $ic47$ = makeKeyword("AGENDA-ABORT");
        $ic48$ = makeSymbol("S#40022", "CYC");
        $ic49$ = makeKeyword("IGNORE");
        $ic50$ = makeSymbol("S#39981", "CYC");
        $ic51$ = makeSymbol("S#40021", "CYC");
        $ic52$ = makeInteger(25);
        $ic53$ = makeKeyword("APPEND");
        $ic54$ = makeString("Unable to open ~S");
        $ic55$ = makeString("~s~%");
        $ic56$ = makeSymbol("FI-TIMESTAMP-ASSERTION");
        $ic57$ = constant_handles_oc.f8479((SubLObject)makeString("Guest"));
        $ic58$ = ConsesLow.list((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        $ic59$ = makeInteger(120);
        $ic60$ = makeSymbol("S#40055", "CYC");
        $ic61$ = makeSymbol("S#39982", "CYC");
        $ic62$ = makeSymbol("S#40026", "CYC");
        $ic63$ = makeInteger(35);
        $ic64$ = makeSymbol("S#38528", "CYC");
        $ic65$ = makeSymbol("S#39983", "CYC");
        $ic66$ = makeSymbol("S#40027", "CYC");
        $ic67$ = makeInteger(40);
        $ic68$ = makeSymbol("S#40057", "CYC");
        $ic69$ = makeSymbol("S#40058", "CYC");
        $ic70$ = makeSymbol("S#39984", "CYC");
        $ic71$ = makeSymbol("S#40028", "CYC");
        $ic72$ = makeInteger(45);
        $ic73$ = makeSymbol("S#40061", "CYC");
        $ic74$ = makeSymbol("S#39985", "CYC");
        $ic75$ = makeSymbol("S#40029", "CYC");
        $ic76$ = makeSymbol("S#40063", "CYC");
        $ic77$ = makeSymbol("S#39986", "CYC");
        $ic78$ = makeSymbol("S#40030", "CYC");
        $ic79$ = makeInteger(30);
        $ic80$ = makeString("Agenda Daily GC");
        $ic81$ = makeSymbol("S#40065", "CYC");
        $ic82$ = makeSymbol("S#40066", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)FOUR_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        $ic84$ = makeInteger(23);
        $ic85$ = makeString("Hour must be an integer in the range 0 - 23");
        $ic86$ = makeInteger(59);
        $ic87$ = makeString("Minute must be an integer in the range 0 - 59");
        $ic88$ = makeString("Second must be an integer in the range 0 - 59");
        $ic89$ = makeSymbol("S#40067", "CYC");
        $ic90$ = makeString("Doing Agenda Daily GC at ");
        $ic91$ = makeSymbol("S#39987", "CYC");
        $ic92$ = makeSymbol("S#40033", "CYC");
        $ic93$ = ConsesLow.list((SubLObject)makeSymbol("S#9940", "CYC"), (SubLObject)makeSymbol("S#40068", "CYC"), (SubLObject)makeSymbol("SECOND"));
    }
    
    public static final class $f36276$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36276$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39975"));
        }
        
        public SubLObject processItem() {
            return f36276();
        }
    }
    
    public static final class $f36302$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36302$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39976"));
        }
        
        public SubLObject processItem() {
            return f36302();
        }
    }
    
    public static final class $f36304$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36304$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39977"));
        }
        
        public SubLObject processItem() {
            return f36304();
        }
    }
    
    public static final class $f36305$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36305$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39978"));
        }
        
        public SubLObject processItem() {
            return f36305();
        }
    }
    
    public static final class $f36307$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36307$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39979"));
        }
        
        public SubLObject processItem() {
            return f36307();
        }
    }
    
    public static final class $f36309$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36309$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39980"));
        }
        
        public SubLObject processItem() {
            return f36309();
        }
    }
    
    public static final class $f36313$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36313$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39981"));
        }
        
        public SubLObject processItem() {
            return f36313();
        }
    }
    
    public static final class $f36319$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36319$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39982"));
        }
        
        public SubLObject processItem() {
            return f36319();
        }
    }
    
    public static final class $f36321$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36321$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39983"));
        }
        
        public SubLObject processItem() {
            return f36321();
        }
    }
    
    public static final class $f36323$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36323$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39984"));
        }
        
        public SubLObject processItem() {
            return f36323();
        }
    }
    
    public static final class $f36325$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36325$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39985"));
        }
        
        public SubLObject processItem() {
            return f36325();
        }
    }
    
    public static final class $f36327$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36327$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39986"));
        }
        
        public SubLObject processItem() {
            return f36327();
        }
    }
    
    public static final class $f36332$ZeroArityFunction extends ZeroArityFunction
    {
        public $f36332$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39987"));
        }
        
        public SubLObject processItem() {
            return f36332();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 395 ms
	
	Decompiled with Procyon 0.5.32.
*/