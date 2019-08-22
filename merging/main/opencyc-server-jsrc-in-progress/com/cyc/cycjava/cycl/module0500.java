package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return module0191.f11990((SubLObject)$ic0$, var1, $ic1$, (SubLObject)$ic2$);
    }
    
    public static SubLObject f32238(final SubLObject var1) {
        if (NIL != module0147.f9507($ic1$)) {
            return $g3782$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32239(final SubLObject var2) {
        return module0617.f37871(var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32240(final SubLObject var1) {
        return f32237(var1);
    }
    
    public static SubLObject f32241(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32238(var1);
    }
    
    public static SubLObject f32242(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32239(var4);
            if (var5.eql(var6)) {
                module0347.f23330(f32240(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32243(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32238(var1);
    }
    
    public static SubLObject f32244(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32239(var4);
            if (NIL != var6 && !var5.eql(var6)) {
                module0347.f23330(f32240(module0205.f13338(var1)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32245(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            return $g3783$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32246(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var7 = f32239(var5);
            if (NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)T, (SubLObject)T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (NIL != var8) {
                    final SubLObject var10 = module0233.f15361(var8, var1);
                    module0347.f23330(f32240(var10), var8, var9);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32247(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            return module0617.f37879(module0205.f13380(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32248(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var7 = module0617.f37868(var6, (SubLObject)UNPROVIDED);
            if (NIL != var7) {
                SubLObject var8 = var7;
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    var4.resetMultipleValues();
                    final SubLObject var10 = module0235.f15474(var9, var5, (SubLObject)T, (SubLObject)T);
                    final SubLObject var11 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    if (NIL != var10) {
                        final SubLObject var12 = module0233.f15361(var10, var1);
                        module0347.f23330(f32240(var12), var10, var11);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32249(final SubLObject var1) {
        if (NIL != module0147.f9507($ic1$)) {
            return $g3784$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32250(final SubLObject var2) {
        return module0617.f37872(var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32251(final SubLObject var1) {
        return f32237(var1);
    }
    
    public static SubLObject f32252(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32249(var1);
    }
    
    public static SubLObject f32253(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32250(var4);
            if (var5.eql(var6)) {
                module0347.f23330(f32251(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32254(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32249(var1);
    }
    
    public static SubLObject f32255(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32250(var4);
            if (NIL != var6 && !var5.eql(var6)) {
                module0347.f23330(f32251(module0205.f13338(var1)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32256(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            return $g3785$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32257(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var7 = f32250(var5);
            if (NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)T, (SubLObject)T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (NIL != var8) {
                    final SubLObject var10 = module0233.f15361(var8, var1);
                    module0347.f23330(f32251(var10), var8, var9);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32258(final SubLObject var1) {
        if (NIL != module0147.f9507($ic1$)) {
            return $g3786$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32259(final SubLObject var2) {
        return module0617.f37874(var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32260(final SubLObject var1) {
        return f32237(var1);
    }
    
    public static SubLObject f32261(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32258(var1);
    }
    
    public static SubLObject f32262(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32259(var4);
            if (var5.eql(var6)) {
                module0347.f23330(f32260(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32263(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32258(var1);
    }
    
    public static SubLObject f32264(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32259(var4);
            if (NIL != var6 && !var5.eql(var6)) {
                module0347.f23330(f32260(module0205.f13338(var1)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32265(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            return $g3787$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32266(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var7 = f32259(var5);
            if (NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)T, (SubLObject)T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (NIL != var8) {
                    final SubLObject var10 = module0233.f15361(var8, var1);
                    module0347.f23330(f32260(var10), var8, var9);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32267(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            return module0617.f37881(module0205.f13380(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32268(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var7 = module0617.f37869(var6, (SubLObject)UNPROVIDED);
            if (NIL != var7) {
                SubLObject var8 = var7;
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    var4.resetMultipleValues();
                    final SubLObject var10 = module0235.f15474(var9, var5, (SubLObject)T, (SubLObject)T);
                    final SubLObject var11 = var4.secondMultipleValue();
                    var4.resetMultipleValues();
                    if (NIL != var10) {
                        final SubLObject var12 = module0233.f15361(var10, var1);
                        module0347.f23330(f32260(var12), var10, var11);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32269(final SubLObject var1) {
        if (NIL != module0147.f9507($ic1$)) {
            return $g3788$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32270(final SubLObject var2) {
        return module0617.f37875(var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f32271(final SubLObject var1) {
        return f32237(var1);
    }
    
    public static SubLObject f32272(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32269(var1);
    }
    
    public static SubLObject f32273(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32270(var4);
            if (var5.eql(var6)) {
                module0347.f23330(f32271(var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32274(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32269(var1);
    }
    
    public static SubLObject f32275(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32270(var4);
            if (NIL != var6 && !var5.eql(var6)) {
                module0347.f23330(f32271(module0205.f13338(var1)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32276(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            return $g3789$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32277(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var7 = f32270(var5);
            if (NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)T, (SubLObject)T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (NIL != var8) {
                    final SubLObject var10 = module0233.f15361(var8, var1);
                    module0347.f23330(f32271(var10), var8, var9);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32278(final SubLObject var1) {
        if (NIL != module0147.f9507($ic1$)) {
            return $g3790$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32279(final SubLObject var2) {
        final SubLObject var3 = module0617.f37872(var2, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0617.f37875(var2, (SubLObject)UNPROVIDED);
        if (NIL == var3) {
            return (SubLObject)NIL;
        }
        if (NIL == var4) {
            return module0612.f37514(var3);
        }
        final SubLObject var5 = module0051.f3643(var3, var4);
        return module0612.f37426(var5);
    }
    
    public static SubLObject f32280(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32278(var1);
    }
    
    public static SubLObject f32281(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32279(var4);
            if (var5.equal(var6)) {
                final SubLObject var7 = f32250(var4);
                final SubLObject var8 = f32270(var4);
                module0347.f23330(f32251((SubLObject)ConsesLow.list($ic14$, var4, var7)), (SubLObject)NIL, (SubLObject)((NIL != var8) ? ConsesLow.list(f32271((SubLObject)ConsesLow.list($ic30$, var4, var8))) : NIL));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32282(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f32278(var1);
    }
    
    public static SubLObject f32283(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var4 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = f32279(var4);
            if (NIL != var6 && !var5.equal(var6)) {
                final SubLObject var7 = f32250(var4);
                final SubLObject var8 = f32270(var4);
                final SubLObject var9 = module0612.f37536(var5);
                final SubLObject var10 = module0612.f37537(var5);
                SubLObject var11 = (SubLObject)NIL;
                if (!var8.equal(var10)) {
                    var11 = (SubLObject)ConsesLow.cons(f32271((SubLObject)ConsesLow.list($ic40$, (SubLObject)ConsesLow.list($ic30$, var4, var10))), var11);
                }
                if (!var7.equal(var9)) {
                    var11 = (SubLObject)ConsesLow.cons(f32271((SubLObject)ConsesLow.list($ic40$, (SubLObject)ConsesLow.list($ic14$, var4, var9))), var11);
                }
                module0347.f23330(var11.first(), (SubLObject)NIL, var11.rest());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32284(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (NIL != module0147.f9507($ic1$)) {
            return $g3791$.getGlobalValue();
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f32285(final SubLObject var1, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (NIL != module0147.f9507($ic1$)) {
            final SubLObject var5 = module0205.f13379(var1, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13380(var1, (SubLObject)UNPROVIDED);
            final SubLObject var7 = f32279(var5);
            if (NIL != var7) {
                var4.resetMultipleValues();
                final SubLObject var8 = module0235.f15474(var7, var6, (SubLObject)T, (SubLObject)T);
                final SubLObject var9 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (NIL != var8) {
                    final SubLObject var10 = f32250(var5);
                    final SubLObject var11 = f32270(var5);
                    final SubLObject var12 = (SubLObject)((NIL != var11) ? ConsesLow.list(f32271((SubLObject)ConsesLow.list($ic30$, var5, var11))) : NIL);
                    final SubLObject var13 = f32251((SubLObject)ConsesLow.list($ic14$, var5, var10));
                    final SubLObject var14 = ConsesLow.append(var9, var12);
                    module0347.f23330(var13, var8, var14);
                }
            }
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32287() {
        $g3781$ = SubLFiles.deflexical("S#35681", module0018.$g658$.getDynamicValue());
        $g3782$ = SubLFiles.deflexical("S#35682", $g3781$.getGlobalValue());
        $g3783$ = SubLFiles.deflexical("S#35683", $g3781$.getGlobalValue());
        $g3784$ = SubLFiles.deflexical("S#35684", $g3781$.getGlobalValue());
        $g3785$ = SubLFiles.deflexical("S#35685", $g3781$.getGlobalValue());
        $g3786$ = SubLFiles.deflexical("S#35686", $g3781$.getGlobalValue());
        $g3787$ = SubLFiles.deflexical("S#35687", $g3781$.getGlobalValue());
        $g3788$ = SubLFiles.deflexical("S#35688", $g3781$.getGlobalValue());
        $g3789$ = SubLFiles.deflexical("S#35689", $g3781$.getGlobalValue());
        $g3790$ = SubLFiles.deflexical("S#35690", $g3781$.getGlobalValue());
        $g3791$ = SubLFiles.deflexical("S#35691", $g3781$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32288() {
        module0340.f22938($ic3$);
        module0358.f23774((SubLObject)$ic4$, $ic3$);
        module0358.f23773((SubLObject)$ic5$, $ic3$);
        module0340.f22941((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0340.f22941((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0340.f22941((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0340.f22938($ic14$);
        module0358.f23771((SubLObject)$ic4$, $ic14$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic5$, $ic14$);
        module0340.f22941((SubLObject)$ic15$, (SubLObject)$ic16$);
        module0340.f22941((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0340.f22941((SubLObject)$ic19$, (SubLObject)$ic20$);
        module0340.f22938($ic21$);
        module0358.f23774((SubLObject)$ic4$, $ic21$);
        module0358.f23773((SubLObject)$ic5$, $ic21$);
        module0340.f22941((SubLObject)$ic22$, (SubLObject)$ic23$);
        module0340.f22941((SubLObject)$ic24$, (SubLObject)$ic25$);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0340.f22941((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0340.f22938($ic30$);
        module0358.f23771((SubLObject)$ic4$, $ic30$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic5$, $ic30$);
        module0340.f22941((SubLObject)$ic31$, (SubLObject)$ic32$);
        module0340.f22941((SubLObject)$ic33$, (SubLObject)$ic34$);
        module0340.f22941((SubLObject)$ic35$, (SubLObject)$ic36$);
        module0340.f22938($ic37$);
        module0358.f23771((SubLObject)$ic4$, $ic37$, (SubLObject)ONE_INTEGER);
        module0358.f23773((SubLObject)$ic5$, $ic37$);
        module0340.f22941((SubLObject)$ic38$, (SubLObject)$ic39$);
        module0340.f22941((SubLObject)$ic41$, (SubLObject)$ic42$);
        module0340.f22941((SubLObject)$ic43$, (SubLObject)$ic44$);
        return (SubLObject)NIL;
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
        $g3781$ = null;
        $g3782$ = null;
        $g3783$ = null;
        $g3784$ = null;
        $g3785$ = null;
        $g3786$ = null;
        $g3787$ = null;
        $g3788$ = null;
        $g3789$ = null;
        $g3790$ = null;
        $g3791$ = null;
        $ic0$ = makeKeyword("BOOKKEEPING");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic2$ = makeKeyword("TRUE-MON");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("myCreator"));
        $ic4$ = makeKeyword("POS");
        $ic5$ = makeKeyword("NEG");
        $ic6$ = makeKeyword("REMOVAL-MY-CREATOR-CHECK-POS");
        $ic7$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreator")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreator")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35636", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35637", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog #$Guzman)") });
        $ic8$ = makeKeyword("REMOVAL-MY-CREATOR-CHECK-NEG");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreator")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreator")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35638", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35639", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreator <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreator #$Dog #$Muffet))") });
        $ic10$ = makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG2");
        $ic11$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreator")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreator")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35640", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35641", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator #$Dog ?WHO)") });
        $ic12$ = makeKeyword("REMOVAL-MY-CREATOR-UNIFY-ARG1");
        $ic13$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreator")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreator")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35642", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35643", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreator <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreator ?WHAT #$Guzman)") });
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationTime"));
        $ic15$ = makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-POS");
        $ic16$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#4999", "CYC"))), makeKeyword("COST"), makeSymbol("S#35647", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35648", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <universal-date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog 19871011)") });
        $ic17$ = makeKeyword("REMOVAL-MY-CREATION-TIME-CHECK-NEG");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#4999", "CYC"))), makeKeyword("COST"), makeSymbol("S#35649", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35650", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationTime <fort-p> <universal-date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationTime #$Dog 19770717))") });
        $ic19$ = makeKeyword("REMOVAL-MY-CREATION-TIME-UNIFY-ARG2");
        $ic20$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationTime")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("S#35651", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35652", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationTime <fort-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationTime #$Dog ?WHEN)") });
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose"));
        $ic22$ = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-POS");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35656", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35657", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <fort-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew #$GeneralCycKE)") });
        $ic24$ = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35658", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35659", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationPurpose <fort-p> <fort-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationPurpose #$BritneySpears #$GeneralCycKE))") });
        $ic26$ = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35660", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35661", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <fort-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose #$Shrew ?WHY)") });
        $ic28$ = makeKeyword("REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1");
        $ic29$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationPurpose")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("S#35662", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35663", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationPurpose <not-fully-bound-p> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationPurpose ?WHAT #$GeneralCycKE)") });
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond"));
        $ic31$ = makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-POS");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#5028", "CYC"))), makeKeyword("COST"), makeSymbol("S#35667", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35668", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <universal-second-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor 162525)") });
        $ic33$ = makeKeyword("REMOVAL-MY-CREATION-SECOND-CHECK-NEG");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#5028", "CYC"))), makeKeyword("COST"), makeSymbol("S#35669", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35670", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationSecond <fort-p> <universal-second-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationSecond #$MauveColor 212))") });
        $ic35$ = makeKeyword("REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2");
        $ic36$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationSecond")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("S#35671", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35672", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationSecond <fort-p> <variable-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationSecond #$MauveColor ?WHEN)") });
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("myCreationDate"));
        $ic38$ = makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-POS");
        $ic39$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationDate")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24728", "CYC"))), makeKeyword("COST"), makeSymbol("S#35675", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35676", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <date-p>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001)))))))") });
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic41$ = makeKeyword("REMOVAL-MY-CREATION-DATE-CHECK-NEG");
        $ic42$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationDate")), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#24728", "CYC"))), makeKeyword("COST"), makeSymbol("S#35677", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35678", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$myCreationDate <fort-p> <date-p>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$myCreationDate #$Dog (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001))))))))") });
        $ic43$ = makeKeyword("REMOVAL-MY-CREATION-DATE-UNIFY-ARG2");
        $ic44$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("myCreationDate")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("myCreationDate")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("S#35679", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35680", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$myCreationDate <fort-p> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$myCreationDate #$Martini ?WHEN)") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 212 ms
	
	Decompiled with Procyon 0.5.32.
*/