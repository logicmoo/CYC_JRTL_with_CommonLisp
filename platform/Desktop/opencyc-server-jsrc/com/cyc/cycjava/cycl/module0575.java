package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0575 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0575";
    public static final String myFingerPrint = "17e333a37b0f18896118d8e0ff3123bc7120f87bfafd5e6c80f941f7d2506959";
    private static SubLSymbol $g4200$;
    public static SubLSymbol $g4201$;
    public static SubLSymbol $g4196$;
    public static SubLSymbol $g4202$;
    public static SubLSymbol $g4198$;
    public static SubLSymbol $g4203$;
    public static SubLSymbol $g4204$;
    public static SubLSymbol $g4205$;
    public static SubLSymbol $g4197$;
    public static SubLSymbol $g4206$;
    public static SubLSymbol $g4207$;
    public static SubLSymbol $g4208$;
    public static SubLSymbol $g4209$;
    public static SubLSymbol $g4210$;
    public static SubLSymbol $g4211$;
    public static SubLSymbol $g3927$;
    private static SubLSymbol $g4212$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    
    public static SubLObject f35243() {
        return module0055.f4016(module0575.$g4200$.getGlobalValue());
    }
    
    public static SubLObject f35244() {
        return module0055.f4019(module0575.$g4200$.getGlobalValue());
    }
    
    public static SubLObject f35245() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0575.$g4201$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0575.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            module0055.f4018(module0575.$g4200$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35246(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0575.$g4201$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0575.NIL;
        try {
            var7 = Locks.seize_lock(var6);
            module0055.f4021(var4, module0575.$g4200$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var7) {
                Locks.release_lock(var6);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35247() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4201$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4023(module0575.$g4200$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35248() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4201$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4030(module0575.$g4200$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35249() {
        return module0055.f4020(module0575.$g4200$.getGlobalValue());
    }
    
    public static SubLObject f35250() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4201$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0575.$g4200$.getGlobalValue();
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35251(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0575.NIL == f35244()) {
            Errors.warn((SubLObject)module0575.$ic2$, f35243());
        }
        final SubLObject var17 = module0575.$g4201$.getDynamicValue(var16);
        SubLObject var18 = (SubLObject)module0575.NIL;
        try {
            var18 = Locks.seize_lock(var17);
            module0575.$g4200$.setGlobalValue(var15);
        }
        finally {
            if (module0575.NIL != var18) {
                Locks.release_lock(var17);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35252() {
        return module0055.f4016(module0575.$g4196$.getGlobalValue());
    }
    
    public static SubLObject f35253() {
        return module0055.f4019(module0575.$g4196$.getGlobalValue());
    }
    
    public static SubLObject f35254() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0575.$g4202$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0575.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            module0055.f4018(module0575.$g4196$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35255(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0575.$g4202$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0575.NIL;
        try {
            var7 = Locks.seize_lock(var6);
            module0055.f4021(var4, module0575.$g4196$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var7) {
                Locks.release_lock(var6);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35256() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4202$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4023(module0575.$g4196$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35257() {
        return module0055.f4016(module0575.$g4198$.getGlobalValue());
    }
    
    public static SubLObject f35258() {
        return module0055.f4019(module0575.$g4198$.getGlobalValue());
    }
    
    public static SubLObject f35259() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0575.$g4203$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0575.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            module0055.f4018(module0575.$g4198$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35260(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0575.$g4203$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0575.NIL;
        try {
            var7 = Locks.seize_lock(var6);
            module0055.f4021(var4, module0575.$g4198$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var7) {
                Locks.release_lock(var6);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35261() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4203$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4023(module0575.$g4198$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35262() {
        return module0055.f4016(module0575.$g4204$.getGlobalValue());
    }
    
    public static SubLObject f35263() {
        return module0055.f4019(module0575.$g4204$.getGlobalValue());
    }
    
    public static SubLObject f35264() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0575.$g4205$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0575.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            module0055.f4018(module0575.$g4204$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35265(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0575.$g4205$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0575.NIL;
        try {
            var7 = Locks.seize_lock(var6);
            module0055.f4021(var4, module0575.$g4204$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var7) {
                Locks.release_lock(var6);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35266() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4205$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4023(module0575.$g4204$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35267() {
        return module0055.f4016(module0575.$g4197$.getGlobalValue());
    }
    
    public static SubLObject f35268() {
        return module0055.f4019(module0575.$g4197$.getGlobalValue());
    }
    
    public static SubLObject f35269() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0575.$g4206$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0575.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            module0055.f4018(module0575.$g4197$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35270(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0575.$g4206$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0575.NIL;
        try {
            var7 = Locks.seize_lock(var6);
            module0055.f4021(var4, module0575.$g4197$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var7) {
                Locks.release_lock(var6);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35271() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4206$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4023(module0575.$g4197$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35272() {
        return module0055.f4016(module0575.$g4207$.getGlobalValue());
    }
    
    public static SubLObject f35273() {
        return module0055.f4019(module0575.$g4207$.getGlobalValue());
    }
    
    public static SubLObject f35274() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0575.$g4208$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0575.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            module0055.f4018(module0575.$g4207$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35275(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0575.$g4208$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0575.NIL;
        try {
            var7 = Locks.seize_lock(var6);
            module0055.f4021(var4, module0575.$g4207$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var7) {
                Locks.release_lock(var6);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35276() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4208$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4023(module0575.$g4207$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35277() {
        return module0055.f4016(module0575.$g4209$.getGlobalValue());
    }
    
    public static SubLObject f35278() {
        return module0055.f4019(module0575.$g4209$.getGlobalValue());
    }
    
    public static SubLObject f35279() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0575.$g4210$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0575.NIL;
        try {
            var3 = Locks.seize_lock(var2);
            module0055.f4018(module0575.$g4209$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var3) {
                Locks.release_lock(var2);
            }
        }
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35280(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0575.$g4210$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)module0575.NIL;
        try {
            var7 = Locks.seize_lock(var6);
            module0055.f4021(var4, module0575.$g4209$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var7) {
                Locks.release_lock(var6);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35281() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        final SubLObject var3 = module0575.$g4210$.getDynamicValue(var1);
        SubLObject var4 = (SubLObject)module0575.NIL;
        try {
            var4 = Locks.seize_lock(var3);
            var2 = module0055.f4023(module0575.$g4209$.getGlobalValue());
        }
        finally {
            if (module0575.NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f35282() {
        return module0055.f4020(module0575.$g4209$.getGlobalValue());
    }
    
    public static SubLObject f35283() {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0575.NIL == f35244() || module0575.NIL == f35258() || module0575.NIL == f35278());
    }
    
    public static SubLObject f35284(final SubLObject var54, SubLObject var55) {
        if (var55 == module0575.UNPROVIDED) {
            var55 = (SubLObject)module0575.T;
        }
        final SubLObject var56 = (module0575.NIL != var55) ? f35285(var54) : var54;
        f35246(var56);
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35286() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = f35247();
        if (module0575.NIL != var2) {
            final SubLObject var3 = module0111.$g1406$.currentBinding(var1);
            try {
                module0111.$g1406$.bind((SubLObject)module0575.NIL, var1);
                module0018.$g677$.setGlobalValue(var2);
                final SubLObject var4 = f35287(var2);
                if (module0575.NIL != var4) {
                    module0112.f7688(var4);
                }
            }
            finally {
                module0111.$g1406$.rebind(var3, var1);
            }
            if (module0575.NIL != f35244()) {
                module0574.f35172();
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35288(final SubLObject var54) {
        if (module0575.NIL != module0574.f35199(var54)) {
            module0574.f35149(Numbers.add((SubLObject)module0575.ONE_INTEGER, module0574.f35148()));
        }
        else {
            f35255(conses_high.fourth(var54));
        }
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35289() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0575.$g4211$.getDynamicValue(var1);
    }
    
    public static SubLObject f35290() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        var2 = f35256();
        final SubLObject var3 = module0111.$g1406$.currentBinding(var1);
        final SubLObject var4 = module0018.$g689$.currentBinding(var1);
        final SubLObject var5 = module0575.$g4211$.currentBinding(var1);
        try {
            module0111.$g1406$.bind((SubLObject)module0575.NIL, var1);
            module0018.$g689$.bind((SubLObject)module0575.NIL, var1);
            module0575.$g4211$.bind((SubLObject)module0575.T, var1);
            if (module0575.NIL != var2) {
                module0574.f35149(Numbers.add((SubLObject)module0575.ONE_INTEGER, module0574.f35148()));
                module0018.$g677$.setGlobalValue(var2);
                if (module0575.NIL != module0018.$g681$.getDynamicValue(var1)) {
                    SubLObject var6 = (SubLObject)module0575.NIL;
                    try {
                        var1.throwStack.push(module0003.$g3$.getGlobalValue());
                        final SubLObject var58_62 = Errors.$error_handler$.currentBinding(var1);
                        try {
                            Errors.$error_handler$.bind((SubLObject)module0575.$ic15$, var1);
                            try {
                                f35291(var2);
                            }
                            catch (Throwable var7) {
                                Errors.handleThrowable(var7, (SubLObject)module0575.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var58_62, var1);
                        }
                    }
                    catch (Throwable var8) {
                        var6 = Errors.handleThrowable(var8, module0003.$g3$.getGlobalValue());
                    }
                    finally {
                        var1.throwStack.pop();
                    }
                    if (module0575.NIL != var6) {
                        Errors.warn((SubLObject)module0575.$ic16$, var6);
                    }
                }
                else {
                    f35291(var2);
                }
            }
        }
        finally {
            module0575.$g4211$.rebind(var5, var1);
            module0018.$g689$.rebind(var4, var1);
            module0111.$g1406$.rebind(var3, var1);
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35291(final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var59 = f35287(var57);
            if (module0575.NIL != var59) {
                final SubLObject var60 = Errors.$continue_cerrorP$.currentBinding(var58);
                try {
                    Errors.$continue_cerrorP$.bind((SubLObject)module0575.T, var58);
                    module0112.f7688(var59);
                    module0574.f35151(Numbers.add((SubLObject)module0575.ONE_INTEGER, module0574.f35150()));
                }
                finally {
                    Errors.$continue_cerrorP$.rebind(var60, var58);
                }
            }
        }
        finally {
            final SubLObject var61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var58);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0575.T, var58);
                module0574.f35141(Numbers.add((SubLObject)module0575.ONE_INTEGER, module0574.f35140()));
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var61, var58);
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35292(final SubLObject var54) {
        f35270(conses_high.fourth(var54));
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35293() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0575.NIL;
        var2 = f35271();
        final SubLObject var3 = module0111.$g1406$.currentBinding(var1);
        final SubLObject var4 = module0018.$g689$.currentBinding(var1);
        try {
            module0111.$g1406$.bind((SubLObject)module0575.NIL, var1);
            module0018.$g689$.bind((SubLObject)module0575.NIL, var1);
            if (module0575.NIL != var2) {
                module0018.$g677$.setGlobalValue(var2);
                final SubLObject var5 = f35287(var2);
                if (module0575.NIL != var5) {
                    module0112.f7688(var5);
                    module0574.f35143();
                }
            }
        }
        finally {
            module0018.$g689$.rebind(var4, var1);
            module0111.$g1406$.rebind(var3, var1);
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35294(final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        if (module0575.NIL != module0018.$g689$.getDynamicValue(var66)) {
            return f35295(var65);
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35295(final SubLObject var65) {
        f35260((SubLObject)ConsesLow.list(module0571.f34986(module0574.f35152()), module0018.f967(), module0051.f3557((SubLObject)module0575.UNPROVIDED, (SubLObject)module0575.UNPROVIDED), var65));
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35296(final SubLObject var54) {
        if (var54.isCons()) {
            final SubLObject var55 = var54.first();
            if (module0575.NIL == module0004.f104(var55, module0575.$g4212$.getGlobalValue(), (SubLObject)module0575.UNPROVIDED, (SubLObject)module0575.UNPROVIDED)) {
                return (SubLObject)module0575.T;
            }
        }
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35297(final SubLObject var65) {
        f35265((SubLObject)ConsesLow.list(module0571.f34986(module0574.f35152()), module0018.f967(), module0051.f3557((SubLObject)module0575.UNPROVIDED, (SubLObject)module0575.UNPROVIDED), var65));
        return (SubLObject)module0575.T;
    }
    
    public static SubLObject f35287(SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0575.NIL;
        final SubLObject var59 = module0018.$g693$.currentBinding(var57);
        try {
            module0018.$g693$.bind((SubLObject)module0575.T, var57);
            try {
                var57.throwStack.push(module0575.$ic18$);
                var58 = module0571.f34994(var56);
            }
            catch (Throwable var60) {
                var56 = Errors.handleThrowable(var60, (SubLObject)module0575.$ic18$);
            }
            finally {
                var57.throwStack.pop();
            }
        }
        finally {
            module0018.$g693$.rebind(var59, var57);
        }
        return var58;
    }
    
    public static SubLObject f35285(final SubLObject var54) {
        final SubLObject var55 = module0539.f33492();
        if (module0575.NIL != var55) {
            return module0571.f34986((SubLObject)ConsesLow.list((SubLObject)module0575.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0575.$ic20$, var55), var54));
        }
        return module0571.f34986(var54);
    }
    
    public static SubLObject f35298() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35243", "S#38534", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35244", "S#38537", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35245", "S#38541", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35246", "S#38679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35247", "S#38680", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35248", "S#38681", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35249", "S#38682", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35250", "S#38539", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35251", "S#38544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35252", "S#38532", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35253", "S#38527", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35254", "S#38540", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35255", "S#38683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35256", "S#38684", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35257", "S#38535", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35258", "S#38521", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35259", "S#38543", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35260", "S#38685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35261", "S#38522", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35262", "S#38686", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35263", "S#38524", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35264", "S#38687", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35265", "S#38688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35266", "S#38525", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35267", "S#38531", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35268", "S#38689", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35269", "S#38542", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35270", "S#38690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35271", "S#38691", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35272", "S#38477", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35273", "S#38478", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35274", "S#38518", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35275", "S#38519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35276", "S#38479", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35277", "S#38536", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35278", "S#38384", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35279", "S#38386", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35280", "S#38523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35281", "S#38520", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35282", "S#38385", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35283", "S#38533", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35284", "S#36764", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35286", "S#38538", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35288", "S#38480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35289", "S#32038", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35290", "S#38528", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35291", "S#38692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35292", "S#38529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35293", "S#38693", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35294", "S#37020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35295", "S#36765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35296", "S#36766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35297", "S#36767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35287", "S#38694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0575", "f35285", "S#38382", 1, 0, false);
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35299() {
        module0575.$g4200$ = SubLFiles.deflexical("S#38695", (module0575.NIL != Symbols.boundp((SubLObject)module0575.$ic0$)) ? module0575.$g4200$.getGlobalValue() : module0055.f4017());
        module0575.$g4201$ = SubLFiles.defparameter("S#38696", Locks.make_lock((SubLObject)module0575.$ic1$));
        module0575.$g4196$ = SubLFiles.deflexical("S#38697", (module0575.NIL != Symbols.boundp((SubLObject)module0575.$ic3$)) ? module0575.$g4196$.getGlobalValue() : module0055.f4017());
        module0575.$g4202$ = SubLFiles.defparameter("S#38698", Locks.make_lock((SubLObject)module0575.$ic4$));
        module0575.$g4198$ = SubLFiles.deflexical("S#38699", (module0575.NIL != Symbols.boundp((SubLObject)module0575.$ic5$)) ? module0575.$g4198$.getGlobalValue() : module0055.f4017());
        module0575.$g4203$ = SubLFiles.defparameter("S#38700", Locks.make_lock((SubLObject)module0575.$ic6$));
        module0575.$g4204$ = SubLFiles.deflexical("S#38701", (module0575.NIL != Symbols.boundp((SubLObject)module0575.$ic7$)) ? module0575.$g4204$.getGlobalValue() : module0055.f4017());
        module0575.$g4205$ = SubLFiles.defparameter("S#38702", Locks.make_lock((SubLObject)module0575.$ic8$));
        module0575.$g4197$ = SubLFiles.deflexical("S#38703", (module0575.NIL != Symbols.boundp((SubLObject)module0575.$ic9$)) ? module0575.$g4197$.getGlobalValue() : module0055.f4017());
        module0575.$g4206$ = SubLFiles.defparameter("S#38704", Locks.make_lock((SubLObject)module0575.$ic10$));
        module0575.$g4207$ = SubLFiles.deflexical("S#38705", (module0575.NIL != Symbols.boundp((SubLObject)module0575.$ic11$)) ? module0575.$g4207$.getGlobalValue() : module0055.f4017());
        module0575.$g4208$ = SubLFiles.defparameter("S#38706", Locks.make_lock((SubLObject)module0575.$ic12$));
        module0575.$g4209$ = SubLFiles.deflexical("S#38707", (module0575.NIL != Symbols.boundp((SubLObject)module0575.$ic13$)) ? module0575.$g4209$.getGlobalValue() : module0055.f4017());
        module0575.$g4210$ = SubLFiles.defparameter("S#38708", Locks.make_lock((SubLObject)module0575.$ic14$));
        module0575.$g4211$ = SubLFiles.defparameter("S#38709", (SubLObject)module0575.NIL);
        module0575.$g3927$ = SubLFiles.defparameter("S#38710", (SubLObject)module0575.NIL);
        module0575.$g4212$ = SubLFiles.deflexical("S#38711", (SubLObject)module0575.$ic17$);
        return (SubLObject)module0575.NIL;
    }
    
    public static SubLObject f35300() {
        module0003.f57((SubLObject)module0575.$ic0$);
        module0003.f57((SubLObject)module0575.$ic3$);
        module0003.f57((SubLObject)module0575.$ic5$);
        module0003.f57((SubLObject)module0575.$ic7$);
        module0003.f57((SubLObject)module0575.$ic9$);
        module0003.f57((SubLObject)module0575.$ic11$);
        module0003.f57((SubLObject)module0575.$ic13$);
        return (SubLObject)module0575.NIL;
    }
    
    public void declareFunctions() {
        f35298();
    }
    
    public void initializeVariables() {
        f35299();
    }
    
    public void runTopLevelForms() {
        f35300();
    }
    
    static {
        me = (SubLFile)new module0575();
        module0575.$g4200$ = null;
        module0575.$g4201$ = null;
        module0575.$g4196$ = null;
        module0575.$g4202$ = null;
        module0575.$g4198$ = null;
        module0575.$g4203$ = null;
        module0575.$g4204$ = null;
        module0575.$g4205$ = null;
        module0575.$g4197$ = null;
        module0575.$g4206$ = null;
        module0575.$g4207$ = null;
        module0575.$g4208$ = null;
        module0575.$g4209$ = null;
        module0575.$g4210$ = null;
        module0575.$g4211$ = null;
        module0575.$g3927$ = null;
        module0575.$g4212$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#38695", "CYC");
        $ic1$ = SubLObjectFactory.makeString("Local Queue Lock");
        $ic2$ = SubLObjectFactory.makeString("Local queue being overwritten, ~A operations lost");
        $ic3$ = SubLObjectFactory.makeSymbol("S#38697", "CYC");
        $ic4$ = SubLObjectFactory.makeString("Remote Queue Lock");
        $ic5$ = SubLObjectFactory.makeSymbol("S#38699", "CYC");
        $ic6$ = SubLObjectFactory.makeString("Transcript Queue Lock");
        $ic7$ = SubLObjectFactory.makeSymbol("S#38701", "CYC");
        $ic8$ = SubLObjectFactory.makeString("HL Transcript Queue Lock");
        $ic9$ = SubLObjectFactory.makeSymbol("S#38703", "CYC");
        $ic10$ = SubLObjectFactory.makeString("Auxiliary Queue Lock");
        $ic11$ = SubLObjectFactory.makeSymbol("S#38705", "CYC");
        $ic12$ = SubLObjectFactory.makeString("Transmit Queue Lock");
        $ic13$ = SubLObjectFactory.makeSymbol("S#38707", "CYC");
        $ic14$ = SubLObjectFactory.makeString("Local Operation Queue Lock");
        $ic15$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic16$ = SubLObjectFactory.makeString("~A");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FI-ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-BLAST"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION"));
        $ic18$ = SubLObjectFactory.makeKeyword("UNENCAPSULATION-ERROR");
        $ic19$ = SubLObjectFactory.makeSymbol("WITH-BOOKKEEPING-INFO");
        $ic20$ = SubLObjectFactory.makeSymbol("QUOTE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0575.class
	Total time: 156 ms
	
	Decompiled with Procyon 0.5.32.
*/