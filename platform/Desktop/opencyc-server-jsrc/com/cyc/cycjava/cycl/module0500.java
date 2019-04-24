package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0500 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0500";
    public static final String myFingerPrint = "96048f2e20e82611ed9d099eddc09f88c7e1a057ed9124e68ea54ba98ed13404";
    private static SubLSymbol $g3781$;
    private static SubLSymbol $g3782$;
    private static SubLSymbol $g3783$;
    private static SubLSymbol $g3784$;
    private static SubLSymbol $g3785$;
    private static SubLSymbol $g3786$;
    private static SubLSymbol $g3787$;
    private static SubLSymbol $g3788$;
    private static SubLSymbol $g3789$;
    private static SubLSymbol $g3790$;
    private static SubLSymbol $g3791$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    
    public static SubLObject f32237(final SubLObject var1) {
        return module0191.f11990((SubLObject)module0500.$ic0$, var1, module0500.$ic1$, (SubLObject)module0500.$ic2$);
    }
    
    public static SubLObject f32238(final SubLObject var1) {
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3782$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32239(final SubLObject var2) {
        return module0617.f37871(var2, (SubLObject)module0500.UNPROVIDED);
    }
    
    public static SubLObject f32240(final SubLObject var1) {
        return f32237(var1);
    }
    
    public static SubLObject f32241(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32238(var1);
    }
    
    public static SubLObject f32242(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32239(var4);
            if (var5.eql(var6)) {
                module0347.f23330(f32240(var1), (SubLObject)module0500.UNPROVIDED, (SubLObject)module0500.UNPROVIDED);
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32243(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32238(var1);
    }
    
    public static SubLObject f32244(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32239(var4);
            if (module0500.NIL != var6 && !var5.eql(var6)) {
                module0347.f23330(f32240(module0205.f13338(var1)), (SubLObject)module0500.UNPROVIDED, (SubLObject)module0500.UNPROVIDED);
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32245(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3783$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32246(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var7 = f32239(var5);
            if (module0500.NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)module0500.T, (SubLObject)module0500.T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (module0500.NIL != var8) {
                    final SubLObject var10 = module0233.f15361(var8, var1);
                    module0347.f23330(f32240(var10), var8, var9);
                }
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32247(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0617.f37879(module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED), (SubLObject)module0500.UNPROVIDED);
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32248(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var7 = module0617.f37868(var6, (SubLObject)module0500.UNPROVIDED);
            if (module0500.NIL != var7) {
                SubLObject var8 = var7;
                SubLObject var9 = (SubLObject)module0500.NIL;
                var9 = var8.first();
                while (module0500.NIL != var8) {
                    var4.resetMultipleValues();
                    final SubLObject var10 = module0235.f15474(var9, var5, (SubLObject)module0500.T, (SubLObject)module0500.T);
                    final SubLObject var11 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    if (module0500.NIL != var10) {
                        final SubLObject var12 = module0233.f15361(var10, var1);
                        module0347.f23330(f32240(var12), var10, var11);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32249(final SubLObject var1) {
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3784$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32250(final SubLObject var2) {
        return module0617.f37872(var2, (SubLObject)module0500.UNPROVIDED);
    }
    
    public static SubLObject f32251(final SubLObject var1) {
        return f32237(var1);
    }
    
    public static SubLObject f32252(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32249(var1);
    }
    
    public static SubLObject f32253(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32250(var4);
            if (var5.eql(var6)) {
                module0347.f23330(f32251(var1), (SubLObject)module0500.UNPROVIDED, (SubLObject)module0500.UNPROVIDED);
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32254(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32249(var1);
    }
    
    public static SubLObject f32255(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32250(var4);
            if (module0500.NIL != var6 && !var5.eql(var6)) {
                module0347.f23330(f32251(module0205.f13338(var1)), (SubLObject)module0500.UNPROVIDED, (SubLObject)module0500.UNPROVIDED);
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32256(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3785$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32257(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var7 = f32250(var5);
            if (module0500.NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)module0500.T, (SubLObject)module0500.T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (module0500.NIL != var8) {
                    final SubLObject var10 = module0233.f15361(var8, var1);
                    module0347.f23330(f32251(var10), var8, var9);
                }
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32258(final SubLObject var1) {
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3786$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32259(final SubLObject var2) {
        return module0617.f37874(var2, (SubLObject)module0500.UNPROVIDED);
    }
    
    public static SubLObject f32260(final SubLObject var1) {
        return f32237(var1);
    }
    
    public static SubLObject f32261(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32258(var1);
    }
    
    public static SubLObject f32262(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32259(var4);
            if (var5.eql(var6)) {
                module0347.f23330(f32260(var1), (SubLObject)module0500.UNPROVIDED, (SubLObject)module0500.UNPROVIDED);
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32263(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32258(var1);
    }
    
    public static SubLObject f32264(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32259(var4);
            if (module0500.NIL != var6 && !var5.eql(var6)) {
                module0347.f23330(f32260(module0205.f13338(var1)), (SubLObject)module0500.UNPROVIDED, (SubLObject)module0500.UNPROVIDED);
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32265(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3787$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32266(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var7 = f32259(var5);
            if (module0500.NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)module0500.T, (SubLObject)module0500.T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (module0500.NIL != var8) {
                    final SubLObject var10 = module0233.f15361(var8, var1);
                    module0347.f23330(f32260(var10), var8, var9);
                }
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32267(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0617.f37881(module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED), (SubLObject)module0500.UNPROVIDED);
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32268(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var7 = module0617.f37869(var6, (SubLObject)module0500.UNPROVIDED);
            if (module0500.NIL != var7) {
                SubLObject var8 = var7;
                SubLObject var9 = (SubLObject)module0500.NIL;
                var9 = var8.first();
                while (module0500.NIL != var8) {
                    var4.resetMultipleValues();
                    final SubLObject var10 = module0235.f15474(var9, var5, (SubLObject)module0500.T, (SubLObject)module0500.T);
                    final SubLObject var11 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    if (module0500.NIL != var10) {
                        final SubLObject var12 = module0233.f15361(var10, var1);
                        module0347.f23330(f32260(var12), var10, var11);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32269(final SubLObject var1) {
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3788$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32270(final SubLObject var2) {
        return module0617.f37875(var2, (SubLObject)module0500.UNPROVIDED);
    }
    
    public static SubLObject f32271(final SubLObject var1) {
        return f32237(var1);
    }
    
    public static SubLObject f32272(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32269(var1);
    }
    
    public static SubLObject f32273(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32270(var4);
            if (var5.eql(var6)) {
                module0347.f23330(f32271(var1), (SubLObject)module0500.UNPROVIDED, (SubLObject)module0500.UNPROVIDED);
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32274(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32269(var1);
    }
    
    public static SubLObject f32275(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32270(var4);
            if (module0500.NIL != var6 && !var5.eql(var6)) {
                module0347.f23330(f32271(module0205.f13338(var1)), (SubLObject)module0500.UNPROVIDED, (SubLObject)module0500.UNPROVIDED);
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32276(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3789$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32277(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var7 = f32270(var5);
            if (module0500.NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)module0500.T, (SubLObject)module0500.T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (module0500.NIL != var8) {
                    final SubLObject var10 = module0233.f15361(var8, var1);
                    module0347.f23330(f32271(var10), var8, var9);
                }
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32278(final SubLObject var1) {
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3790$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32279(final SubLObject var2) {
        final SubLObject var3 = module0617.f37872(var2, (SubLObject)module0500.UNPROVIDED);
        final SubLObject var4 = module0617.f37875(var2, (SubLObject)module0500.UNPROVIDED);
        if (module0500.NIL == var3) {
            return (SubLObject)module0500.NIL;
        }
        if (module0500.NIL == var4) {
            return module0612.f37514(var3);
        }
        final SubLObject var5 = module0051.f3643(var3, var4);
        return module0612.f37426(var5);
    }
    
    public static SubLObject f32280(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32278(var1);
    }
    
    public static SubLObject f32281(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32279(var4);
            if (var5.equal(var6)) {
                final SubLObject var7 = f32250(var4);
                final SubLObject var8 = f32270(var4);
                module0347.f23330(f32251((SubLObject)ConsesLow.list(module0500.$ic14$, var4, var7)), (SubLObject)module0500.NIL, (SubLObject)((module0500.NIL != var8) ? ConsesLow.list(f32271((SubLObject)ConsesLow.list(module0500.$ic30$, var4, var8))) : module0500.NIL));
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32282(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        return f32278(var1);
    }
    
    public static SubLObject f32283(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = f32279(var4);
            if (module0500.NIL != var6 && !var5.equal(var6)) {
                final SubLObject var7 = f32250(var4);
                final SubLObject var8 = f32270(var4);
                final SubLObject var9 = module0612.f37536(var5);
                final SubLObject var10 = module0612.f37537(var5);
                SubLObject var11 = (SubLObject)module0500.NIL;
                if (!var8.equal(var10)) {
                    var11 = (SubLObject)ConsesLow.cons(f32271((SubLObject)ConsesLow.list(module0500.$ic40$, (SubLObject)ConsesLow.list(module0500.$ic30$, var4, var10))), var11);
                }
                if (!var7.equal(var9)) {
                    var11 = (SubLObject)ConsesLow.cons(f32271((SubLObject)ConsesLow.list(module0500.$ic40$, (SubLObject)ConsesLow.list(module0500.$ic14$, var4, var9))), var11);
                }
                module0347.f23330(var11.first(), (SubLObject)module0500.NIL, var11.rest());
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32284(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            return module0500.$g3791$.getGlobalValue();
        }
        return (SubLObject)module0500.ZERO_INTEGER;
    }
    
    public static SubLObject f32285(final SubLObject var1, SubLObject var3) {
        if (var3 == module0500.UNPROVIDED) {
            var3 = (SubLObject)module0500.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0500.NIL != module0147.f9507(module0500.$ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)module0500.UNPROVIDED);
            final SubLObject var7 = f32279(var5);
            if (module0500.NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)module0500.T, (SubLObject)module0500.T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (module0500.NIL != var8) {
                    final SubLObject var10 = f32250(var5);
                    final SubLObject var11 = f32270(var5);
                    final SubLObject var12 = (SubLObject)((module0500.NIL != var11) ? ConsesLow.list(f32271((SubLObject)ConsesLow.list(module0500.$ic30$, var5, var11))) : module0500.NIL);
                    final SubLObject var13 = f32251((SubLObject)ConsesLow.list(module0500.$ic14$, var5, var10));
                    final SubLObject var14 = ConsesLow.append(var9, var12);
                    module0347.f23330(var13, var8, var14);
                }
            }
        }
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32286() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32237", "S#24931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32238", "S#35633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32239", "S#35634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32240", "S#35635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32241", "S#35636", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32242", "S#35637", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32243", "S#35638", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32244", "S#35639", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32245", "S#35640", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32246", "S#35641", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32247", "S#35642", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32248", "S#35643", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32249", "S#35644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32250", "S#35645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32251", "S#35646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32252", "S#35647", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32253", "S#35648", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32254", "S#35649", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32255", "S#35650", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32256", "S#35651", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32257", "S#35652", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32258", "S#35653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32259", "S#35654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32260", "S#35655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32261", "S#35656", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32262", "S#35657", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32263", "S#35658", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32264", "S#35659", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32265", "S#35660", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32266", "S#35661", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32267", "S#35662", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32268", "S#35663", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32269", "S#35664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32270", "S#35665", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32271", "S#35666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32272", "S#35667", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32273", "S#35668", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32274", "S#35669", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32275", "S#35670", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32276", "S#35671", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32277", "S#35672", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32278", "S#35673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32279", "S#35674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32280", "S#35675", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32281", "S#35676", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32282", "S#35677", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32283", "S#35678", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32284", "S#35679", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0500", "f32285", "S#35680", 1, 1, false);
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32287() {
        module0500.$g3781$ = SubLFiles.deflexical("S#35681", module0018.$g658$.getDynamicValue());
        module0500.$g3782$ = SubLFiles.deflexical("S#35682", module0500.$g3781$.getGlobalValue());
        module0500.$g3783$ = SubLFiles.deflexical("S#35683", module0500.$g3781$.getGlobalValue());
        module0500.$g3784$ = SubLFiles.deflexical("S#35684", module0500.$g3781$.getGlobalValue());
        module0500.$g3785$ = SubLFiles.deflexical("S#35685", module0500.$g3781$.getGlobalValue());
        module0500.$g3786$ = SubLFiles.deflexical("S#35686", module0500.$g3781$.getGlobalValue());
        module0500.$g3787$ = SubLFiles.deflexical("S#35687", module0500.$g3781$.getGlobalValue());
        module0500.$g3788$ = SubLFiles.deflexical("S#35688", module0500.$g3781$.getGlobalValue());
        module0500.$g3789$ = SubLFiles.deflexical("S#35689", module0500.$g3781$.getGlobalValue());
        module0500.$g3790$ = SubLFiles.deflexical("S#35690", module0500.$g3781$.getGlobalValue());
        module0500.$g3791$ = SubLFiles.deflexical("S#35691", module0500.$g3781$.getGlobalValue());
        return (SubLObject)module0500.NIL;
    }
    
    public static SubLObject f32288() {
        module0340.f22938(module0500.$ic3$);
        module0358.f23774((SubLObject)module0500.$ic4$, module0500.$ic3$);
        module0358.f23773((SubLObject)module0500.$ic5$, module0500.$ic3$);
        module0340.f22941((SubLObject)module0500.$ic6$, (SubLObject)module0500.$ic7$);
        module0340.f22941((SubLObject)module0500.$ic8$, (SubLObject)module0500.$ic9$);
        module0340.f22941((SubLObject)module0500.$ic10$, (SubLObject)module0500.$ic11$);
        module0340.f22941((SubLObject)module0500.$ic12$, (SubLObject)module0500.$ic13$);
        module0340.f22938(module0500.$ic14$);
        module0358.f23771((SubLObject)module0500.$ic4$, module0500.$ic14$, (SubLObject)module0500.ONE_INTEGER);
        module0358.f23773((SubLObject)module0500.$ic5$, module0500.$ic14$);
        module0340.f22941((SubLObject)module0500.$ic15$, (SubLObject)module0500.$ic16$);
        module0340.f22941((SubLObject)module0500.$ic17$, (SubLObject)module0500.$ic18$);
        module0340.f22941((SubLObject)module0500.$ic19$, (SubLObject)module0500.$ic20$);
        module0340.f22938(module0500.$ic21$);
        module0358.f23774((SubLObject)module0500.$ic4$, module0500.$ic21$);
        module0358.f23773((SubLObject)module0500.$ic5$, module0500.$ic21$);
        module0340.f22941((SubLObject)module0500.$ic22$, (SubLObject)module0500.$ic23$);
        module0340.f22941((SubLObject)module0500.$ic24$, (SubLObject)module0500.$ic25$);
        module0340.f22941((SubLObject)module0500.$ic26$, (SubLObject)module0500.$ic27$);
        module0340.f22941((SubLObject)module0500.$ic28$, (SubLObject)module0500.$ic29$);
        module0340.f22938(module0500.$ic30$);
        module0358.f23771((SubLObject)module0500.$ic4$, module0500.$ic30$, (SubLObject)module0500.ONE_INTEGER);
        module0358.f23773((SubLObject)module0500.$ic5$, module0500.$ic30$);
        module0340.f22941((SubLObject)module0500.$ic31$, (SubLObject)module0500.$ic32$);
        module0340.f22941((SubLObject)module0500.$ic33$, (SubLObject)module0500.$ic34$);
        module0340.f22941((SubLObject)module0500.$ic35$, (SubLObject)module0500.$ic36$);
        module0340.f22938(module0500.$ic37$);
        module0358.f23771((SubLObject)module0500.$ic4$, module0500.$ic37$, (SubLObject)module0500.ONE_INTEGER);
        module0358.f23773((SubLObject)module0500.$ic5$, module0500.$ic37$);
        module0340.f22941((SubLObject)module0500.$ic38$, (SubLObject)module0500.$ic39$);
        module0340.f22941((SubLObject)module0500.$ic41$, (SubLObject)module0500.$ic42$);
        module0340.f22941((SubLObject)module0500.$ic43$, (SubLObject)module0500.$ic44$);
        return (SubLObject)module0500.NIL;
    }
    
    public void declareFunctions() {
        f32286();
    }
    
    public void initializeVariables() {
        f32287();
    }
    
    public void runTopLevelForms() {
        f32288();
    }
    
    static {
        me = (SubLFile)new module0500();
        module0500.$g3781$ = null;
        module0500.$g3782$ = null;
        module0500.$g3783$ = null;
        module0500.$g3784$ = null;
        module0500.$g3785$ = null;
        module0500.$g3786$ = null;
        module0500.$g3787$ = null;
        module0500.$g3788$ = null;
        module0500.$g3789$ = null;
        module0500.$g3790$ = null;
        module0500.$g3791$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("BOOKKEEPING");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic2$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator"));
        $ic4$ = SubLObjectFactory.makeKeyword("POS");
        $ic5$ = SubLObjectFactory.makeKeyword("NEG");
        $ic6$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATOR-CHECK-POS");
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35636", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35637", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreator <fort-p> <fort-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreator #$Dog #$Guzman)") });
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATOR-CHECK-NEG");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35638", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35639", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreator <fort-p> <fort-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreator #$Dog #$Muffet))") });
        $ic10$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG2");
        $ic11$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35640", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35641", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreator <fort-p> <not-fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreator #$Dog ?WHO)") });
        $ic12$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG1");
        $ic13$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreator")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35642", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35643", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreator <not-fully-bound-p> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreator ?WHAT #$Guzman)") });
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime"));
        $ic15$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-POS");
        $ic16$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#4999", "CYC"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35647", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35648", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationTime <fort-p> <universal-date-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationTime #$Dog 19871011)") });
        $ic17$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-NEG");
        $ic18$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#4999", "CYC"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35649", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35650", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreationTime <fort-p> <universal-date-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreationTime #$Dog 19770717))") });
        $ic19$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2");
        $ic20$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationTime")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35651", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35652", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationTime <fort-p> <variable-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationTime #$Dog ?WHEN)") });
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $ic22$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS");
        $ic23$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35656", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35657", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationPurpose <fort-p> <fort-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationPurpose #$Shrew #$GeneralCycKE)") });
        $ic24$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG");
        $ic25$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35658", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35659", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreationPurpose <fort-p> <fort-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreationPurpose #$BritneySpears #$GeneralCycKE))") });
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35660", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35661", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationPurpose <fort-p> <not-fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationPurpose #$Shrew ?WHY)") });
        $ic28$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1");
        $ic29$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35662", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35663", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationPurpose <not-fully-bound-p> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationPurpose ?WHAT #$GeneralCycKE)") });
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond"));
        $ic31$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-POS");
        $ic32$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#5028", "CYC"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35667", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35668", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationSecond <fort-p> <universal-second-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationSecond #$MauveColor 162525)") });
        $ic33$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-NEG");
        $ic34$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#5028", "CYC"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35669", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35670", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreationSecond <fort-p> <universal-second-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreationSecond #$MauveColor 212))") });
        $ic35$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2");
        $ic36$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationSecond")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35671", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35672", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationSecond <fort-p> <variable-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationSecond #$MauveColor ?WHEN)") });
        $ic37$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationDate"));
        $ic38$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-POS");
        $ic39$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationDate")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#24728", "CYC"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35675", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35676", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationDate <fort-p> <date-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationDate #$Martini (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001)))))))") });
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic41$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-NEG");
        $ic42$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationDate")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#24728", "CYC"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35677", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35678", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$myCreationDate <fort-p> <date-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$myCreationDate #$Dog (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001))))))))") });
        $ic43$ = SubLObjectFactory.makeKeyword("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2");
        $ic44$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("myCreationDate")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35679", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35680", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$myCreationDate <fort-p> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$myCreationDate #$Martini ?WHEN)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0500.class
	Total time: 212 ms
	
	Decompiled with Procyon 0.5.32.
*/