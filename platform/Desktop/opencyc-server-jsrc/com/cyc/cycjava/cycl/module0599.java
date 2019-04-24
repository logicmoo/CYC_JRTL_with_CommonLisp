package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0599 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0599";
    public static final String myFingerPrint = "615771f23dda87d5d6d3ebe9da3843ecf29c738d8d79e9ef2e74d9fd93f0faf0";
    private static SubLSymbol $g4646$;
    private static SubLSymbol $g4647$;
    private static SubLSymbol $g4648$;
    private static SubLSymbol $g4649$;
    private static SubLSymbol $g4650$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLInteger $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLInteger $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    
    public static SubLObject f36672(final SubLObject var1) {
        return module0274.f18188(module0538.f33478(var1, (SubLObject)module0599.UNPROVIDED), module0178.f11287(var1), (SubLObject)module0599.UNPROVIDED);
    }
    
    public static SubLObject f36673(final SubLObject var1) {
        if (module0599.NIL != module0174.f11035(var1)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0599.$ic0$.eql(module0177.f11163(var1)) || module0599.$ic0$.eql(module0178.f11287(var1)));
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36674(final SubLObject var1) {
        if (module0599.NIL != module0174.f11035(var1)) {
            return Equality.eql((SubLObject)module0599.$ic1$, module0177.f11163(var1));
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36675(final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.$ic2$;
        }
        if (var5 == module0599.UNPROVIDED) {
            var5 = (SubLObject)module0599.$ic3$;
        }
        assert module0599.NIL != module0173.f10955(var2) : var2;
        assert module0599.NIL != module0173.f10955(var3) : var3;
        final SubLObject var6 = var5;
        if (var6.eql((SubLObject)module0599.$ic5$)) {
            return f36676(var2, var3, var4);
        }
        if (var6.eql((SubLObject)module0599.$ic6$)) {
            return f36677(var2, var3, var4);
        }
        if (var6.eql((SubLObject)module0599.$ic3$)) {
            return f36678(var2, var3, var4);
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36676(final SubLObject var7, final SubLObject var8, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.$ic2$;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        assert module0599.NIL != module0173.f10955(var7) : var7;
        assert module0599.NIL != module0173.f10955(var8) : var8;
        SubLObject var10 = (SubLObject)module0599.NIL;
        if (module0599.NIL != module0161.f10513((SubLObject)module0599.$ic2$, var4)) {
            final SubLObject var11 = module0147.$g2094$.currentBinding(var9);
            final SubLObject var12 = module0147.$g2095$.currentBinding(var9);
            try {
                module0147.$g2094$.bind((SubLObject)module0599.$ic12$, var9);
                module0147.$g2095$.bind(module0599.$ic13$, var9);
                var10 = f36679(var7, var8, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var12, var9);
                module0147.$g2094$.rebind(var11, var9);
            }
        }
        else if (module0599.NIL != module0161.f10481(var4)) {
            final SubLObject var13 = var4;
            final SubLObject var14 = module0147.$g2094$.currentBinding(var9);
            final SubLObject var15 = module0147.$g2095$.currentBinding(var9);
            try {
                module0147.$g2094$.bind(module0147.f9531(var13), var9);
                module0147.$g2095$.bind(module0147.f9534(var13), var9);
                var10 = f36679(var7, var8, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var15, var9);
                module0147.$g2094$.rebind(var14, var9);
            }
        }
        return var10;
    }
    
    public static SubLObject f36679(final SubLObject var7, final SubLObject var8, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0599.NIL;
        final SubLObject var11 = var4;
        final SubLObject var12 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind(module0147.f9531(var11), var9);
            module0147.$g2095$.bind(module0147.f9534(var11), var9);
            final SubLObject var14 = module0138.$g1626$.getGlobalValue();
            SubLObject var15 = (SubLObject)module0599.NIL;
            try {
                var15 = ReadWriteLocks.rw_lock_seize_read_lock(var14);
                final SubLObject var16 = module0139.f9008();
                final SubLObject var11_17 = module0139.$g1630$.currentBinding(var9);
                final SubLObject var12_18 = module0139.$g1659$.currentBinding(var9);
                try {
                    module0139.$g1630$.bind((SubLObject)module0599.NIL, var9);
                    module0139.$g1659$.bind(module0139.f9007(), var9);
                    final SubLObject var11_18 = module0139.$g1638$.currentBinding(var9);
                    final SubLObject var12_19 = module0139.$g1630$.currentBinding(var9);
                    final SubLObject var17 = module0139.$g1659$.currentBinding(var9);
                    try {
                        module0139.$g1638$.bind(module0139.$g1659$.getDynamicValue(var9), var9);
                        module0139.$g1630$.bind(var16, var9);
                        module0139.$g1659$.bind(module0139.f9007(), var9);
                        final SubLObject var11_19 = module0141.$g1670$.currentBinding(var9);
                        final SubLObject var12_20 = module0141.$g1671$.currentBinding(var9);
                        final SubLObject var21_24 = module0141.$g1672$.currentBinding(var9);
                        final SubLObject var18 = module0141.$g1674$.currentBinding(var9);
                        final SubLObject var19 = module0137.$g1605$.currentBinding(var9);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0599.$ic14$), var9);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0599.$ic14$)), var9);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0599.$ic14$)), var9);
                            module0141.$g1674$.bind((SubLObject)module0599.NIL, var9);
                            module0137.$g1605$.bind(module0137.f8955(module0599.$ic14$), var9);
                            var10 = f36680(var7, var8);
                        }
                        finally {
                            module0137.$g1605$.rebind(var19, var9);
                            module0141.$g1674$.rebind(var18, var9);
                            module0141.$g1672$.rebind(var21_24, var9);
                            module0141.$g1671$.rebind(var12_20, var9);
                            module0141.$g1670$.rebind(var11_19, var9);
                        }
                        module0139.f9011(module0139.$g1659$.getDynamicValue(var9));
                    }
                    finally {
                        module0139.$g1659$.rebind(var17, var9);
                        module0139.$g1630$.rebind(var12_19, var9);
                        module0139.$g1638$.rebind(var11_18, var9);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var9));
                }
                finally {
                    module0139.$g1659$.rebind(var12_18, var9);
                    module0139.$g1630$.rebind(var11_17, var9);
                }
            }
            finally {
                if (module0599.NIL != var15) {
                    ReadWriteLocks.rw_lock_release_read_lock(var14);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var13, var9);
            module0147.$g2094$.rebind(var12, var9);
        }
        if (module0599.NIL != module0141.$g1709$.getDynamicValue(var9)) {
            return module0260.f17085(var10, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
        }
        if (module0599.NIL != module0141.$g1708$.getDynamicValue(var9)) {
            return module0260.f17027(var10, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
        }
        return var10;
    }
    
    public static SubLObject f36680(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var11 = module0139.$g1639$.currentBinding(var9);
            try {
                module0139.$g1639$.bind(module0139.$g1659$.getDynamicValue(var9), var9);
                module0251.f16232(module0137.f8955(module0599.$ic14$), var7, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_27 = module0139.$g1659$.currentBinding(var9);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var9);
                    var10 = f36681(var7, var8);
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var9));
                }
                finally {
                    module0139.$g1659$.rebind(var11_27, var9);
                }
            }
            finally {
                module0139.$g1639$.rebind(var11, var9);
            }
        }
        finally {
            final SubLObject var12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var9);
                module0251.f16236(module0137.f8955(module0599.$ic14$), var7, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var12, var9);
            }
        }
        return var10;
    }
    
    public static SubLObject f36681(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var11 = module0139.$g1640$.currentBinding(var9);
            try {
                module0139.$g1640$.bind(module0139.$g1659$.getDynamicValue(var9), var9);
                module0251.f16232(module0137.f8955(module0599.$ic14$), var8, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_28 = module0139.$g1659$.currentBinding(var9);
                try {
                    module0139.$g1659$.bind(module0139.$g1638$.getDynamicValue(var9), var9);
                    var10 = f36682(var7, var8);
                }
                finally {
                    module0139.$g1659$.rebind(var11_28, var9);
                }
            }
            finally {
                module0139.$g1640$.rebind(var11, var9);
            }
        }
        finally {
            final SubLObject var12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var9);
                module0251.f16236(module0137.f8955(module0599.$ic14$), var8, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var12, var9);
            }
        }
        return var10;
    }
    
    public static SubLObject f36682(final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0599.NIL;
        try {
            SubLObject var11 = module0597.$g4616$.getDynamicValue(var9);
            SubLObject var12 = (SubLObject)module0599.NIL;
            var12 = var11.first();
            while (module0599.NIL != var11) {
                module0251.f16232(module0137.f8955(module0599.$ic14$), var12, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                var11 = var11.rest();
                var12 = var11.first();
            }
            final SubLObject var13 = module0141.$g1691$.currentBinding(var9);
            try {
                module0141.$g1691$.bind((SubLObject)module0599.NIL, var9);
                try {
                    module0256.f16587((SubLObject)ConsesLow.list(var7, var8), Symbols.symbol_function((SubLObject)module0599.$ic15$), (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                }
                finally {
                    final SubLObject var11_31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var9);
                        var10 = module0141.$g1691$.getDynamicValue(var9);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var11_31, var9);
                    }
                }
            }
            finally {
                module0141.$g1691$.rebind(var13, var9);
            }
        }
        finally {
            final SubLObject var14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var9);
                f36683();
                if (module0599.NIL != module0141.$g1709$.getDynamicValue(var9)) {
                    SubLObject var15 = var10;
                    SubLObject var16 = (SubLObject)module0599.NIL;
                    var16 = var15.first();
                    while (module0599.NIL != var15) {
                        module0251.f16236(module0137.f8955(module0599.$ic16$), var16, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                }
                SubLObject var15 = module0597.$g4616$.getDynamicValue(var9);
                SubLObject var17 = (SubLObject)module0599.NIL;
                var17 = var15.first();
                while (module0599.NIL != var15) {
                    module0251.f16236(module0137.f8955(module0599.$ic14$), var17, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                    var15 = var15.rest();
                    var17 = var15.first();
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var14, var9);
            }
        }
        return var10;
    }
    
    public static SubLObject f36684(final SubLObject var33, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.$ic2$;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        assert module0599.NIL != module0173.f10955(var33) : var33;
        SubLObject var35 = (SubLObject)module0599.NIL;
        if (module0599.NIL != module0161.f10513((SubLObject)module0599.$ic2$, var4)) {
            final SubLObject var36 = module0147.$g2094$.currentBinding(var34);
            final SubLObject var37 = module0147.$g2095$.currentBinding(var34);
            try {
                module0147.$g2094$.bind((SubLObject)module0599.$ic12$, var34);
                module0147.$g2095$.bind(module0599.$ic13$, var34);
                var35 = f36685(var33);
            }
            finally {
                module0147.$g2095$.rebind(var37, var34);
                module0147.$g2094$.rebind(var36, var34);
            }
        }
        else if (module0599.NIL != module0161.f10481(var4)) {
            final SubLObject var38 = var4;
            final SubLObject var39 = module0147.$g2094$.currentBinding(var34);
            final SubLObject var40 = module0147.$g2095$.currentBinding(var34);
            try {
                module0147.$g2094$.bind(module0147.f9531(var38), var34);
                module0147.$g2095$.bind(module0147.f9534(var38), var34);
                var35 = f36685(var33);
            }
            finally {
                module0147.$g2095$.rebind(var40, var34);
                module0147.$g2094$.rebind(var39, var34);
            }
        }
        else if (module0599.NIL == var4) {
            var35 = f36685(var33);
        }
        return var35;
    }
    
    public static SubLObject f36685(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)module0599.NIL;
        final SubLObject var36 = module0018.$g584$.currentBinding(var34);
        try {
            module0018.$g584$.bind(Hashtables.make_hash_table((SubLObject)module0599.$ic17$, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), var34);
            final SubLObject var11_35 = module0139.$g1659$.currentBinding(var34);
            try {
                module0139.$g1659$.bind(module0139.f9007(), var34);
                module0256.f16585(Symbols.symbol_function((SubLObject)module0599.$ic18$), var33, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                module0139.f9011(module0139.$g1659$.getDynamicValue(var34));
            }
            finally {
                module0139.$g1659$.rebind(var11_35, var34);
            }
            var35 = module0018.$g584$.getDynamicValue(var34);
        }
        finally {
            module0018.$g584$.rebind(var36, var34);
        }
        return var35;
    }
    
    public static SubLObject f36686(final SubLObject var33) {
        module0219.f14477(Symbols.symbol_function((SubLObject)module0599.$ic19$), var33, (SubLObject)module0599.THREE_INTEGER, module0599.$ic20$, (SubLObject)module0599.$ic21$, (SubLObject)module0599.UNPROVIDED);
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36687(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0599.NIL != module0178.f11284(var1)) {
            final SubLObject var3 = module0178.f11334(var1);
            final SubLObject var4 = (SubLObject)((module0599.NIL != module0173.f10955(var3)) ? module0178.f11335(var1) : module0599.NIL);
            final SubLObject var5 = (SubLObject)(var4.isInteger() ? module0178.f11336(var1) : module0599.NIL);
            if (module0599.NIL != module0173.f10955(var5) && module0599.NIL != module0210.f13568(var3)) {
                module0030.f1600(var3, var4, module0018.$g584$.getDynamicValue(var2), (SubLObject)module0599.UNPROVIDED);
            }
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36688(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.$ic2$;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0599.NIL != module0173.f10955(var2) : var2;
        assert module0599.NIL != module0173.f10955(var3) : var3;
        SubLObject var6 = (SubLObject)module0599.NIL;
        if (module0599.NIL != module0161.f10513((SubLObject)module0599.$ic2$, var4)) {
            final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind((SubLObject)module0599.$ic12$, var5);
                module0147.$g2095$.bind(module0599.$ic13$, var5);
                var6 = f36689(var2, var3);
            }
            finally {
                module0147.$g2095$.rebind(var8, var5);
                module0147.$g2094$.rebind(var7, var5);
            }
        }
        else if (module0599.NIL != module0161.f10481(var4)) {
            final SubLObject var9 = var4;
            final SubLObject var10 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var11 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind(module0147.f9531(var9), var5);
                module0147.$g2095$.bind(module0147.f9534(var9), var5);
                var6 = f36689(var2, var3);
            }
            finally {
                module0147.$g2095$.rebind(var11, var5);
                module0147.$g2094$.rebind(var10, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f36689(final SubLObject var38, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)module0599.NIL;
        final SubLObject var42 = module0139.$g1659$.currentBinding(var40);
        try {
            module0139.$g1659$.bind(module0139.f9007(), var40);
            final SubLObject var11_40 = module0139.$g1639$.currentBinding(var40);
            try {
                module0139.$g1639$.bind(module0139.$g1659$.getDynamicValue(var40), var40);
                module0251.f16232(module0137.f8955(module0599.$ic22$), var38, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_41 = module0139.$g1659$.currentBinding(var40);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var40);
                    final SubLObject var11_42 = module0139.$g1640$.currentBinding(var40);
                    try {
                        module0139.$g1640$.bind(module0139.$g1659$.getDynamicValue(var40), var40);
                        module0251.f16232(module0137.f8955(module0599.$ic22$), var39, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                        final SubLObject var11_43 = module0599.$g4646$.currentBinding(var40);
                        final SubLObject var43 = module0599.$g4647$.currentBinding(var40);
                        final SubLObject var44 = module0599.$g4648$.currentBinding(var40);
                        try {
                            module0599.$g4646$.bind(Hashtables.make_hash_table((SubLObject)module0599.$ic17$, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), var40);
                            module0599.$g4647$.bind(Hashtables.make_hash_table((SubLObject)module0599.$ic17$, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), var40);
                            module0599.$g4648$.bind(Hashtables.make_hash_table((SubLObject)module0599.$ic17$, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), var40);
                            final SubLObject var11_44 = module0139.$g1659$.currentBinding(var40);
                            try {
                                module0139.$g1659$.bind(module0139.f9007(), var40);
                                final SubLObject var11_45 = module0139.$g1641$.currentBinding(var40);
                                try {
                                    module0139.$g1641$.bind(module0139.$g1659$.getDynamicValue(var40), var40);
                                    final SubLObject var11_46 = module0139.$g1659$.currentBinding(var40);
                                    try {
                                        module0139.$g1659$.bind(module0139.f9007(), var40);
                                        module0259.f16852(Symbols.symbol_function((SubLObject)module0599.$ic23$), var38, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                                        module0139.f9011(module0139.$g1659$.getDynamicValue(var40));
                                    }
                                    finally {
                                        module0139.$g1659$.rebind(var11_46, var40);
                                    }
                                    final SubLObject var11_47 = module0139.$g1659$.currentBinding(var40);
                                    try {
                                        module0139.$g1659$.bind(module0139.f9007(), var40);
                                        module0259.f16852(Symbols.symbol_function((SubLObject)module0599.$ic23$), var39, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                                        module0139.f9011(module0139.$g1659$.getDynamicValue(var40));
                                    }
                                    finally {
                                        module0139.$g1659$.rebind(var11_47, var40);
                                    }
                                }
                                finally {
                                    module0139.$g1641$.rebind(var11_45, var40);
                                }
                                module0139.f9011(module0139.$g1659$.getDynamicValue(var40));
                            }
                            finally {
                                module0139.$g1659$.rebind(var11_44, var40);
                            }
                            final SubLObject var45 = module0599.$g4648$.getDynamicValue(var40);
                            SubLObject var46 = (SubLObject)module0599.NIL;
                            SubLObject var47 = (SubLObject)module0599.NIL;
                            final Iterator var48 = Hashtables.getEntrySetIterator(var45);
                            try {
                                while (Hashtables.iteratorHasNext(var48)) {
                                    final Map.Entry var49 = Hashtables.iteratorNextEntry(var48);
                                    var46 = Hashtables.getEntryKey(var49);
                                    var47 = Hashtables.getEntryValue(var49);
                                    final SubLObject var50 = Hashtables.gethash(var46, module0599.$g4646$.getDynamicValue(var40), (SubLObject)module0599.UNPROVIDED);
                                    final SubLObject var51 = (SubLObject)((module0599.NIL != var50) ? Hashtables.gethash(var46, module0599.$g4647$.getDynamicValue(var40), (SubLObject)module0599.UNPROVIDED) : module0599.NIL);
                                    final SubLObject var52 = (SubLObject)((module0599.NIL != var51) ? SubLObjectFactory.makeBoolean(module0599.NIL != conses_high.second(var50) || module0599.NIL != conses_high.second(var51) || !var50.first().eql(var51.first())) : module0599.NIL);
                                    if (module0599.NIL != var52) {
                                        var41 = (SubLObject)ConsesLow.cons(var46, var41);
                                    }
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var48);
                            }
                        }
                        finally {
                            module0599.$g4648$.rebind(var44, var40);
                            module0599.$g4647$.rebind(var43, var40);
                            module0599.$g4646$.rebind(var11_43, var40);
                        }
                    }
                    finally {
                        module0139.$g1640$.rebind(var11_42, var40);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var40));
                }
                finally {
                    module0139.$g1659$.rebind(var11_41, var40);
                }
            }
            finally {
                module0139.$g1639$.rebind(var11_40, var40);
            }
            module0139.f9011(module0139.$g1659$.getDynamicValue(var40));
        }
        finally {
            module0139.$g1659$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f36690(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0599.NIL == module0251.f16239(var56, module0139.$g1641$.getDynamicValue(var57))) {
            module0251.f16238(var56, module0139.$g1641$.getDynamicValue(var57));
            module0219.f14477(Symbols.symbol_function((SubLObject)module0599.$ic24$), var56, (SubLObject)module0599.THREE_INTEGER, module0599.$ic20$, (SubLObject)module0599.$ic21$, (SubLObject)module0599.UNPROVIDED);
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36691(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.$ic2$;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0599.NIL != module0173.f10955(var2) : var2;
        assert module0599.NIL != module0173.f10955(var3) : var3;
        SubLObject var6 = (SubLObject)module0599.NIL;
        if (module0599.NIL != module0161.f10513((SubLObject)module0599.$ic2$, var4)) {
            final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind((SubLObject)module0599.$ic12$, var5);
                module0147.$g2095$.bind(module0599.$ic13$, var5);
                var6 = f36692(var2, var3);
            }
            finally {
                module0147.$g2095$.rebind(var8, var5);
                module0147.$g2094$.rebind(var7, var5);
            }
        }
        else if (module0599.NIL != module0161.f10481(var4)) {
            final SubLObject var9 = var4;
            final SubLObject var10 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var11 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind(module0147.f9531(var9), var5);
                module0147.$g2095$.bind(module0147.f9534(var9), var5);
                var6 = f36692(var2, var3);
            }
            finally {
                module0147.$g2095$.rebind(var11, var5);
                module0147.$g2094$.rebind(var10, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f36692(final SubLObject var38, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        SubLObject var41 = (SubLObject)module0599.NIL;
        final SubLObject var42 = module0139.$g1659$.currentBinding(var40);
        try {
            module0139.$g1659$.bind(module0139.f9007(), var40);
            final SubLObject var11_57 = module0139.$g1639$.currentBinding(var40);
            try {
                module0139.$g1639$.bind(module0139.$g1659$.getDynamicValue(var40), var40);
                module0251.f16232(module0137.f8955(module0599.$ic22$), var38, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_58 = module0139.$g1659$.currentBinding(var40);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var40);
                    final SubLObject var11_59 = module0139.$g1640$.currentBinding(var40);
                    try {
                        module0139.$g1640$.bind(module0139.$g1659$.getDynamicValue(var40), var40);
                        module0251.f16232(module0137.f8955(module0599.$ic22$), var39, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                        final SubLObject var11_60 = module0599.$g4646$.currentBinding(var40);
                        final SubLObject var43 = module0599.$g4647$.currentBinding(var40);
                        final SubLObject var44 = module0599.$g4648$.currentBinding(var40);
                        try {
                            module0599.$g4646$.bind(Hashtables.make_hash_table((SubLObject)module0599.$ic17$, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), var40);
                            module0599.$g4647$.bind(Hashtables.make_hash_table((SubLObject)module0599.$ic17$, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), var40);
                            module0599.$g4648$.bind(Hashtables.make_hash_table((SubLObject)module0599.$ic17$, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), var40);
                            module0219.f14478(Symbols.symbol_function((SubLObject)module0599.$ic24$), module0599.$ic20$, (SubLObject)module0599.$ic21$, (SubLObject)module0599.UNPROVIDED);
                            final SubLObject var45 = module0599.$g4648$.getDynamicValue(var40);
                            SubLObject var46 = (SubLObject)module0599.NIL;
                            SubLObject var47 = (SubLObject)module0599.NIL;
                            final Iterator var48 = Hashtables.getEntrySetIterator(var45);
                            try {
                                while (Hashtables.iteratorHasNext(var48)) {
                                    final Map.Entry var49 = Hashtables.iteratorNextEntry(var48);
                                    var46 = Hashtables.getEntryKey(var49);
                                    var47 = Hashtables.getEntryValue(var49);
                                    final SubLObject var50 = Hashtables.gethash(var46, module0599.$g4646$.getDynamicValue(var40), (SubLObject)module0599.UNPROVIDED);
                                    final SubLObject var51 = (SubLObject)((module0599.NIL != var50) ? Hashtables.gethash(var46, module0599.$g4647$.getDynamicValue(var40), (SubLObject)module0599.UNPROVIDED) : module0599.NIL);
                                    final SubLObject var52 = (SubLObject)((module0599.NIL != var51) ? SubLObjectFactory.makeBoolean(module0599.NIL != conses_high.second(var50) || module0599.NIL != conses_high.second(var51) || !var50.first().eql(var51.first())) : module0599.NIL);
                                    if (module0599.NIL != var52) {
                                        var41 = (SubLObject)ConsesLow.cons(var46, var41);
                                    }
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var48);
                            }
                        }
                        finally {
                            module0599.$g4648$.rebind(var44, var40);
                            module0599.$g4647$.rebind(var43, var40);
                            module0599.$g4646$.rebind(var11_60, var40);
                        }
                    }
                    finally {
                        module0139.$g1640$.rebind(var11_59, var40);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var40));
                }
                finally {
                    module0139.$g1659$.rebind(var11_58, var40);
                }
            }
            finally {
                module0139.$g1639$.rebind(var11_57, var40);
            }
            module0139.f9011(module0139.$g1659$.getDynamicValue(var40));
        }
        finally {
            module0139.$g1659$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f36693(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0599.NIL != module0178.f11284(var1)) {
            final SubLObject var3 = module0178.f11334(var1);
            final SubLObject var4 = (SubLObject)((module0599.NIL != module0173.f10955(var3)) ? module0178.f11335(var1) : module0599.NIL);
            final SubLObject var5 = (SubLObject)(var4.isInteger() ? module0178.f11336(var1) : module0599.NIL);
            SubLObject var6 = (SubLObject)module0599.NIL;
            if (module0599.NIL != module0173.f10955(var5) && module0599.NIL != module0210.f13568(var3)) {
                if (module0599.NIL != module0251.f16239(var5, module0139.$g1639$.getDynamicValue(var2))) {
                    module0030.f1600(var3, var4, module0599.$g4646$.getDynamicValue(var2), (SubLObject)module0599.UNPROVIDED);
                    var6 = (SubLObject)module0599.T;
                }
                if (module0599.NIL != module0139.f9079(module0139.$g1640$.getDynamicValue(var2)) && module0599.NIL != module0251.f16239(var5, module0139.$g1640$.getDynamicValue(var2))) {
                    module0030.f1600(var3, var4, module0599.$g4647$.getDynamicValue(var2), (SubLObject)module0599.UNPROVIDED);
                    var6 = (SubLObject)module0599.T;
                }
                if (module0599.NIL != var6) {
                    Hashtables.sethash(var3, module0599.$g4648$.getDynamicValue(var2), (SubLObject)module0599.T);
                }
            }
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36677(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.$ic2$;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0599.NIL != module0173.f10955(var2) : var2;
        assert module0599.NIL != module0173.f10955(var3) : var3;
        SubLObject var6 = (SubLObject)module0599.NIL;
        if (module0599.NIL != module0161.f10513((SubLObject)module0599.$ic2$, var4)) {
            final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind((SubLObject)module0599.$ic12$, var5);
                module0147.$g2095$.bind(module0599.$ic13$, var5);
                var6 = f36694(var2, var3, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var8, var5);
                module0147.$g2094$.rebind(var7, var5);
            }
        }
        else if (module0599.NIL != module0161.f10481(var4)) {
            final SubLObject var9 = var4;
            final SubLObject var10 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var11 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind(module0147.f9531(var9), var5);
                module0147.$g2095$.bind(module0147.f9534(var9), var5);
                var6 = f36694(var2, var3, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var11, var5);
                module0147.$g2094$.rebind(var10, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f36694(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0599.NIL;
        final SubLObject var7 = var4;
        final SubLObject var8 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind(module0147.f9531(var7), var5);
            module0147.$g2095$.bind(module0147.f9534(var7), var5);
            final SubLObject var10 = module0138.$g1626$.getGlobalValue();
            SubLObject var11 = (SubLObject)module0599.NIL;
            try {
                var11 = ReadWriteLocks.rw_lock_seize_read_lock(var10);
                final SubLObject var12 = module0139.f9008();
                final SubLObject var11_62 = module0139.$g1630$.currentBinding(var5);
                final SubLObject var12_63 = module0139.$g1659$.currentBinding(var5);
                try {
                    module0139.$g1630$.bind((SubLObject)module0599.NIL, var5);
                    module0139.$g1659$.bind(module0139.f9007(), var5);
                    final SubLObject var11_63 = module0139.$g1638$.currentBinding(var5);
                    final SubLObject var12_64 = module0139.$g1630$.currentBinding(var5);
                    final SubLObject var13 = module0139.$g1659$.currentBinding(var5);
                    try {
                        module0139.$g1638$.bind(module0139.$g1659$.getDynamicValue(var5), var5);
                        module0139.$g1630$.bind(var12, var5);
                        module0139.$g1659$.bind(module0139.f9007(), var5);
                        final SubLObject var11_64 = module0141.$g1670$.currentBinding(var5);
                        final SubLObject var12_65 = module0141.$g1671$.currentBinding(var5);
                        final SubLObject var21_68 = module0141.$g1672$.currentBinding(var5);
                        final SubLObject var14 = module0141.$g1674$.currentBinding(var5);
                        final SubLObject var15 = module0137.$g1605$.currentBinding(var5);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0599.$ic14$), var5);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0599.$ic14$)), var5);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0599.$ic14$)), var5);
                            module0141.$g1674$.bind((SubLObject)module0599.NIL, var5);
                            module0137.$g1605$.bind(module0137.f8955(module0599.$ic14$), var5);
                            var6 = f36695(var2, var3);
                        }
                        finally {
                            module0137.$g1605$.rebind(var15, var5);
                            module0141.$g1674$.rebind(var14, var5);
                            module0141.$g1672$.rebind(var21_68, var5);
                            module0141.$g1671$.rebind(var12_65, var5);
                            module0141.$g1670$.rebind(var11_64, var5);
                        }
                        module0139.f9011(module0139.$g1659$.getDynamicValue(var5));
                    }
                    finally {
                        module0139.$g1659$.rebind(var13, var5);
                        module0139.$g1630$.rebind(var12_64, var5);
                        module0139.$g1638$.rebind(var11_63, var5);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var5));
                }
                finally {
                    module0139.$g1659$.rebind(var12_63, var5);
                    module0139.$g1630$.rebind(var11_62, var5);
                }
            }
            finally {
                if (module0599.NIL != var11) {
                    ReadWriteLocks.rw_lock_release_read_lock(var10);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var9, var5);
            module0147.$g2094$.rebind(var8, var5);
        }
        if (module0599.NIL != module0141.$g1709$.getDynamicValue(var5)) {
            return module0260.f17085(var6, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
        }
        if (module0599.NIL != module0141.$g1708$.getDynamicValue(var5)) {
            return module0260.f17027(var6, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
        }
        return var6;
    }
    
    public static SubLObject f36695(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0139.$g1639$.currentBinding(var4);
            try {
                module0139.$g1639$.bind(module0139.$g1659$.getDynamicValue(var4), var4);
                module0251.f16232(module0137.f8955(module0599.$ic22$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_69 = module0139.$g1659$.currentBinding(var4);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var4);
                    var5 = f36696(var2, var3);
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1659$.rebind(var11_69, var4);
                }
            }
            finally {
                module0139.$g1639$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                module0251.f16236(module0137.f8955(module0599.$ic22$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36696(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0139.$g1640$.currentBinding(var4);
            try {
                module0139.$g1640$.bind(module0139.$g1659$.getDynamicValue(var4), var4);
                module0251.f16232(module0137.f8955(module0599.$ic22$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_70 = module0139.$g1659$.currentBinding(var4);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var4);
                    var5 = f36697(var2, var3);
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1659$.rebind(var11_70, var4);
                }
            }
            finally {
                module0139.$g1640$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                module0251.f16236(module0137.f8955(module0599.$ic22$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36697(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0139.$g1641$.currentBinding(var4);
            try {
                module0139.$g1641$.bind(module0139.$g1659$.getDynamicValue(var4), var4);
                module0251.f16232(module0137.f8955(module0599.$ic14$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_71 = module0139.$g1659$.currentBinding(var4);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var4);
                    var5 = f36698(var2, var3);
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1659$.rebind(var11_71, var4);
                }
            }
            finally {
                module0139.$g1641$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                module0251.f16236(module0137.f8955(module0599.$ic14$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36698(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0139.$g1642$.currentBinding(var4);
            try {
                module0139.$g1642$.bind(module0139.$g1659$.getDynamicValue(var4), var4);
                module0251.f16232(module0137.f8955(module0599.$ic14$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_72 = module0139.$g1659$.currentBinding(var4);
                try {
                    module0139.$g1659$.bind(module0139.$g1638$.getDynamicValue(var4), var4);
                    var5 = f36699(var2, var3);
                }
                finally {
                    module0139.$g1659$.rebind(var11_72, var4);
                }
            }
            finally {
                module0139.$g1642$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                module0251.f16236(module0137.f8955(module0599.$ic14$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36699(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0144.$g1834$.currentBinding(var4);
            final SubLObject var7 = module0144.$g1835$.currentBinding(var4);
            try {
                module0144.$g1834$.bind(var2, var4);
                module0144.$g1835$.bind(var3, var4);
                SubLObject var8 = module0597.$g4616$.getDynamicValue(var4);
                SubLObject var9 = (SubLObject)module0599.NIL;
                var9 = var8.first();
                while (module0599.NIL != var8) {
                    module0251.f16232(module0137.f8955(module0599.$ic14$), var9, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
                final SubLObject var11_73 = module0141.$g1691$.currentBinding(var4);
                try {
                    module0141.$g1691$.bind((SubLObject)module0599.NIL, var4);
                    try {
                        if (module0599.NIL != module0144.$g1857$.getDynamicValue(var4)) {
                            module0305.f20436(Symbols.symbol_function((SubLObject)module0599.$ic25$));
                        }
                        module0256.f16587((SubLObject)ConsesLow.cons(var2, (SubLObject)ConsesLow.cons(var3, ConsesLow.nconc(module0259.f16821(var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), module0259.f16821(var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED)))), Symbols.symbol_function((SubLObject)module0599.$ic26$), (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                    }
                    finally {
                        final SubLObject var11_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                            var5 = module0141.$g1691$.getDynamicValue(var4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var11_74, var4);
                        }
                    }
                }
                finally {
                    module0141.$g1691$.rebind(var11_73, var4);
                }
            }
            finally {
                module0144.$g1835$.rebind(var7, var4);
                module0144.$g1834$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var10 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                f36683();
                if (module0599.NIL != module0141.$g1709$.getDynamicValue(var4)) {
                    SubLObject var11 = var5;
                    SubLObject var12 = (SubLObject)module0599.NIL;
                    var12 = var11.first();
                    while (module0599.NIL != var11) {
                        module0251.f16236(module0137.f8955(module0599.$ic16$), var12, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                        var11 = var11.rest();
                        var12 = var11.first();
                    }
                }
                SubLObject var11 = module0597.$g4616$.getDynamicValue(var4);
                SubLObject var13 = (SubLObject)module0599.NIL;
                var13 = var11.first();
                while (module0599.NIL != var11) {
                    module0251.f16236(module0137.f8955(module0599.$ic14$), var13, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                    var11 = var11.rest();
                    var13 = var11.first();
                }
                if (module0599.NIL != module0144.$g1857$.getDynamicValue(var4)) {
                    final SubLObject var11_75 = module0141.$g1670$.currentBinding(var4);
                    final SubLObject var14 = module0141.$g1671$.currentBinding(var4);
                    final SubLObject var15 = module0141.$g1672$.currentBinding(var4);
                    final SubLObject var16 = module0141.$g1674$.currentBinding(var4);
                    final SubLObject var17 = module0137.$g1605$.currentBinding(var4);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0599.$ic14$), var4);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0599.$ic14$)), var4);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0599.$ic14$)), var4);
                        module0141.$g1674$.bind((SubLObject)module0599.NIL, var4);
                        module0137.$g1605$.bind(module0137.f8955(module0599.$ic14$), var4);
                        module0305.f20436(Symbols.symbol_function((SubLObject)module0599.$ic27$));
                    }
                    finally {
                        module0137.$g1605$.rebind(var17, var4);
                        module0141.$g1674$.rebind(var16, var4);
                        module0141.$g1672$.rebind(var15, var4);
                        module0141.$g1671$.rebind(var14, var4);
                        module0141.$g1670$.rebind(var11_75, var4);
                    }
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var10, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36678(final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0599.NIL != module0173.f10955(var2) : var2;
        assert module0599.NIL != module0173.f10955(var3) : var3;
        SubLObject var6 = (SubLObject)module0599.NIL;
        if (module0599.NIL != module0161.f10513((SubLObject)module0599.$ic2$, var4)) {
            final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind((SubLObject)module0599.$ic12$, var5);
                module0147.$g2095$.bind(module0599.$ic13$, var5);
                var6 = f36700(var2, var3, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var8, var5);
                module0147.$g2094$.rebind(var7, var5);
            }
        }
        else if (module0599.NIL != module0161.f10481(var4)) {
            final SubLObject var9 = module0147.$g2094$.currentBinding(var5);
            final SubLObject var10 = module0147.$g2095$.currentBinding(var5);
            try {
                module0147.$g2094$.bind(module0147.f9531(var4), var5);
                module0147.$g2095$.bind(module0147.f9534(var4), var5);
                var6 = f36700(var2, var3, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var10, var5);
                module0147.$g2094$.rebind(var9, var5);
            }
        }
        return var6;
    }
    
    public static SubLObject f36700(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0599.NIL;
        final SubLObject var7 = var4;
        final SubLObject var8 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var9 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind(module0147.f9531(var7), var5);
            module0147.$g2095$.bind(module0147.f9534(var7), var5);
            final SubLObject var10 = module0138.$g1626$.getGlobalValue();
            SubLObject var11 = (SubLObject)module0599.NIL;
            try {
                var11 = ReadWriteLocks.rw_lock_seize_read_lock(var10);
                final SubLObject var12 = module0139.f9008();
                final SubLObject var11_76 = module0139.$g1630$.currentBinding(var5);
                final SubLObject var12_77 = module0139.$g1659$.currentBinding(var5);
                try {
                    module0139.$g1630$.bind((SubLObject)module0599.NIL, var5);
                    module0139.$g1659$.bind(module0139.f9007(), var5);
                    final SubLObject var11_77 = module0139.$g1638$.currentBinding(var5);
                    final SubLObject var12_78 = module0139.$g1630$.currentBinding(var5);
                    final SubLObject var13 = module0139.$g1659$.currentBinding(var5);
                    try {
                        module0139.$g1638$.bind(module0139.$g1659$.getDynamicValue(var5), var5);
                        module0139.$g1630$.bind(var12, var5);
                        module0139.$g1659$.bind(module0139.f9007(), var5);
                        final SubLObject var11_78 = module0141.$g1670$.currentBinding(var5);
                        final SubLObject var12_79 = module0141.$g1671$.currentBinding(var5);
                        final SubLObject var21_82 = module0141.$g1672$.currentBinding(var5);
                        final SubLObject var14 = module0141.$g1674$.currentBinding(var5);
                        final SubLObject var15 = module0137.$g1605$.currentBinding(var5);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0599.$ic14$), var5);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0599.$ic14$)), var5);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0599.$ic14$)), var5);
                            module0141.$g1674$.bind((SubLObject)module0599.NIL, var5);
                            module0137.$g1605$.bind(module0137.f8955(module0599.$ic14$), var5);
                            var6 = f36701(var2, var3);
                        }
                        finally {
                            module0137.$g1605$.rebind(var15, var5);
                            module0141.$g1674$.rebind(var14, var5);
                            module0141.$g1672$.rebind(var21_82, var5);
                            module0141.$g1671$.rebind(var12_79, var5);
                            module0141.$g1670$.rebind(var11_78, var5);
                        }
                        module0139.f9011(module0139.$g1659$.getDynamicValue(var5));
                    }
                    finally {
                        module0139.$g1659$.rebind(var13, var5);
                        module0139.$g1630$.rebind(var12_78, var5);
                        module0139.$g1638$.rebind(var11_77, var5);
                    }
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var5));
                }
                finally {
                    module0139.$g1659$.rebind(var12_77, var5);
                    module0139.$g1630$.rebind(var11_76, var5);
                }
            }
            finally {
                if (module0599.NIL != var11) {
                    ReadWriteLocks.rw_lock_release_read_lock(var10);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var9, var5);
            module0147.$g2094$.rebind(var8, var5);
        }
        if (module0599.NIL != module0141.$g1709$.getDynamicValue(var5)) {
            return module0260.f17085(var6, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
        }
        if (module0599.NIL != module0141.$g1708$.getDynamicValue(var5)) {
            return module0260.f17027(var6, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
        }
        return var6;
    }
    
    public static SubLObject f36701(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0139.$g1639$.currentBinding(var4);
            try {
                module0139.$g1639$.bind(module0139.$g1659$.getDynamicValue(var4), var4);
                module0251.f16232(module0137.f8955(module0599.$ic22$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                module0251.f16232(module0137.f8955(module0599.$ic14$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_83 = module0139.$g1659$.currentBinding(var4);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var4);
                    var5 = f36702(var2, var3);
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1659$.rebind(var11_83, var4);
                }
            }
            finally {
                module0139.$g1639$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                module0251.f16236(module0137.f8955(module0599.$ic22$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                module0251.f16236(module0137.f8955(module0599.$ic14$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36702(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0139.$g1640$.currentBinding(var4);
            try {
                module0139.$g1640$.bind(module0139.$g1659$.getDynamicValue(var4), var4);
                module0251.f16232(module0137.f8955(module0599.$ic22$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                module0251.f16232(module0137.f8955(module0599.$ic14$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_84 = module0139.$g1659$.currentBinding(var4);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var4);
                    var5 = f36703(var2, var3);
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1659$.rebind(var11_84, var4);
                }
            }
            finally {
                module0139.$g1640$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                module0251.f16236(module0137.f8955(module0599.$ic22$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                module0251.f16236(module0137.f8955(module0599.$ic14$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36703(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0139.$g1641$.currentBinding(var4);
            try {
                module0139.$g1641$.bind(module0139.$g1659$.getDynamicValue(var4), var4);
                module0251.f16232(module0137.f8955(module0599.$ic14$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_85 = module0139.$g1659$.currentBinding(var4);
                try {
                    module0139.$g1659$.bind(module0139.f9007(), var4);
                    var5 = f36704(var2, var3);
                    module0139.f9011(module0139.$g1659$.getDynamicValue(var4));
                }
                finally {
                    module0139.$g1659$.rebind(var11_85, var4);
                }
            }
            finally {
                module0139.$g1641$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                module0251.f16236(module0137.f8955(module0599.$ic14$), var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36704(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0139.$g1642$.currentBinding(var4);
            try {
                module0139.$g1642$.bind(module0139.$g1659$.getDynamicValue(var4), var4);
                module0251.f16232(module0137.f8955(module0599.$ic14$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                final SubLObject var11_86 = module0139.$g1659$.currentBinding(var4);
                try {
                    module0139.$g1659$.bind(module0139.$g1638$.getDynamicValue(var4), var4);
                    var5 = f36705(var2, var3);
                }
                finally {
                    module0139.$g1659$.rebind(var11_86, var4);
                }
            }
            finally {
                module0139.$g1642$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var7 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                module0251.f16236(module0137.f8955(module0599.$ic14$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36705(final SubLObject var2, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0599.NIL;
        try {
            final SubLObject var6 = module0144.$g1834$.currentBinding(var4);
            final SubLObject var7 = module0144.$g1835$.currentBinding(var4);
            try {
                module0144.$g1834$.bind(var2, var4);
                module0144.$g1835$.bind(var3, var4);
                SubLObject var8 = module0597.$g4616$.getDynamicValue(var4);
                SubLObject var9 = (SubLObject)module0599.NIL;
                var9 = var8.first();
                while (module0599.NIL != var8) {
                    module0251.f16232(module0137.f8955(module0599.$ic14$), var9, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                    var8 = var8.rest();
                    var9 = var8.first();
                }
                final SubLObject var11_87 = module0141.$g1691$.currentBinding(var4);
                try {
                    module0141.$g1691$.bind((SubLObject)module0599.NIL, var4);
                    try {
                        if (module0599.NIL != module0144.$g1857$.getDynamicValue(var4)) {
                            module0305.f20436(Symbols.symbol_function((SubLObject)module0599.$ic25$));
                        }
                        module0256.f16587((SubLObject)ConsesLow.cons(var2, (SubLObject)ConsesLow.cons(var3, ConsesLow.nconc(module0259.f16821(var2, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), module0259.f16821(var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED)))), Symbols.symbol_function((SubLObject)module0599.$ic26$), (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                    }
                    finally {
                        final SubLObject var11_88 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                            var5 = module0141.$g1691$.getDynamicValue(var4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var11_88, var4);
                        }
                    }
                }
                finally {
                    module0141.$g1691$.rebind(var11_87, var4);
                }
            }
            finally {
                module0144.$g1835$.rebind(var7, var4);
                module0144.$g1834$.rebind(var6, var4);
            }
        }
        finally {
            final SubLObject var10 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0599.T, var4);
                f36683();
                if (module0599.NIL != module0141.$g1709$.getDynamicValue(var4)) {
                    SubLObject var11 = var5;
                    SubLObject var12 = (SubLObject)module0599.NIL;
                    var12 = var11.first();
                    while (module0599.NIL != var11) {
                        module0251.f16236(module0137.f8955(module0599.$ic16$), var12, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                        var11 = var11.rest();
                        var12 = var11.first();
                    }
                }
                SubLObject var11 = module0597.$g4616$.getDynamicValue(var4);
                SubLObject var13 = (SubLObject)module0599.NIL;
                var13 = var11.first();
                while (module0599.NIL != var11) {
                    module0251.f16236(module0137.f8955(module0599.$ic14$), var13, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                    var11 = var11.rest();
                    var13 = var11.first();
                }
                if (module0599.NIL != module0144.$g1857$.getDynamicValue(var4)) {
                    final SubLObject var11_89 = module0141.$g1670$.currentBinding(var4);
                    final SubLObject var14 = module0141.$g1671$.currentBinding(var4);
                    final SubLObject var15 = module0141.$g1672$.currentBinding(var4);
                    final SubLObject var16 = module0141.$g1674$.currentBinding(var4);
                    final SubLObject var17 = module0137.$g1605$.currentBinding(var4);
                    try {
                        module0141.$g1670$.bind(module0137.f8955(module0599.$ic14$), var4);
                        module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0599.$ic14$)), var4);
                        module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0599.$ic14$)), var4);
                        module0141.$g1674$.bind((SubLObject)module0599.NIL, var4);
                        module0137.$g1605$.bind(module0137.f8955(module0599.$ic14$), var4);
                        module0305.f20436(Symbols.symbol_function((SubLObject)module0599.$ic27$));
                    }
                    finally {
                        module0137.$g1605$.rebind(var17, var4);
                        module0141.$g1674$.rebind(var16, var4);
                        module0141.$g1672$.rebind(var15, var4);
                        module0141.$g1671$.rebind(var14, var4);
                        module0141.$g1670$.rebind(var11_89, var4);
                    }
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var10, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f36706(final SubLObject var56, final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        if (module0599.NIL == module0251.f16239(var56, (SubLObject)module0599.UNPROVIDED)) {
            SubLObject var92 = (SubLObject)module0599.NIL;
            final SubLObject var93 = module0139.$g1659$.currentBinding(var91);
            try {
                module0139.$g1659$.bind(module0139.f9007(), var91);
                var92 = (SubLObject)SubLObjectFactory.makeBoolean(module0599.NIL != module0305.f20364(var56, module0144.$g1834$.getDynamicValue(var91), var90, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED) || module0599.NIL != module0305.f20364(var56, module0144.$g1835$.getDynamicValue(var91), var90, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED));
                module0139.f9011(module0139.$g1659$.getDynamicValue(var91));
            }
            finally {
                module0139.$g1659$.rebind(var93, var91);
            }
            if (module0599.NIL != var92) {
                module0256.f16585(Symbols.symbol_function((SubLObject)module0599.$ic26$), var56, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            }
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36707(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0018.$g590$.currentBinding(var57);
        final SubLObject var59 = module0144.$g1749$.currentBinding(var57);
        final SubLObject var60 = module0144.$g1748$.currentBinding(var57);
        try {
            module0018.$g590$.bind((SubLObject)module0599.ONE_INTEGER, var57);
            module0144.$g1749$.bind((SubLObject)module0599.T, var57);
            module0144.$g1748$.bind((SubLObject)module0599.NIL, var57);
            SubLObject var61 = module0259.f16850(module0599.$ic29$);
            SubLObject var62 = (SubLObject)module0599.NIL;
            var62 = var61.first();
            while (module0599.NIL != var61) {
                module0219.f14477(Symbols.symbol_function((SubLObject)module0599.$ic28$), var56, (SubLObject)module0599.TWO_INTEGER, var62, (SubLObject)module0599.$ic21$, (SubLObject)module0599.UNPROVIDED);
                var61 = var61.rest();
                var62 = var61.first();
            }
        }
        finally {
            module0144.$g1748$.rebind(var60, var57);
            module0144.$g1749$.rebind(var59, var57);
            module0018.$g590$.rebind(var58, var57);
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36708(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0018.$g590$.currentBinding(var57);
        try {
            module0018.$g590$.bind((SubLObject)module0599.ONE_INTEGER, var57);
            final SubLObject var11_93 = module0144.$g1749$.currentBinding(var57);
            try {
                module0144.$g1749$.bind((SubLObject)module0599.T, var57);
                SubLObject var59 = module0259.f16850(module0599.$ic29$);
                SubLObject var60 = (SubLObject)module0599.NIL;
                var60 = var59.first();
                while (module0599.NIL != var59) {
                    module0219.f14477(Symbols.symbol_function((SubLObject)module0599.$ic28$), var56, (SubLObject)module0599.TWO_INTEGER, var60, (SubLObject)module0599.$ic21$, (SubLObject)module0599.UNPROVIDED);
                    var59 = var59.rest();
                    var60 = var59.first();
                }
            }
            finally {
                module0144.$g1749$.rebind(var11_93, var57);
            }
            final SubLObject var11_94 = module0144.$g1748$.currentBinding(var57);
            try {
                module0144.$g1748$.bind((SubLObject)module0599.T, var57);
                SubLObject var59 = module0259.f16850(module0599.$ic30$);
                SubLObject var61 = (SubLObject)module0599.NIL;
                var61 = var59.first();
                while (module0599.NIL != var59) {
                    module0219.f14477(Symbols.symbol_function((SubLObject)module0599.$ic28$), var56, (SubLObject)module0599.TWO_INTEGER, var61, (SubLObject)module0599.$ic21$, (SubLObject)module0599.UNPROVIDED);
                    var59 = var59.rest();
                    var61 = var59.first();
                }
            }
            finally {
                module0144.$g1748$.rebind(var11_94, var57);
            }
        }
        finally {
            module0018.$g590$.rebind(var58, var57);
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36709(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0599.NIL != module0178.f11284(var1)) {
            final SubLObject var3 = module0178.f11331(var1, module0018.$g590$.getDynamicValue(var2));
            if (module0599.NIL != module0173.f10955(var3) && module0599.NIL == module0251.f16239(var3, (SubLObject)module0599.UNPROVIDED) && module0599.NIL != module0210.f13568(var3) && module0599.NIL != f36710(var3)) {
                module0141.$g1691$.setDynamicValue((SubLObject)ConsesLow.cons(var3, module0141.$g1691$.getDynamicValue(var2)), var2);
                if (module0599.NIL != module0141.$g1709$.getDynamicValue(var2)) {
                    module0251.f16232(module0137.f8955(module0599.$ic16$), var3, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36683() {
        f36711();
        f36712();
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36710(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((module0599.NIL == module0144.$g1749$.getDynamicValue(var33) || module0599.NIL != f36713(var32)) && (module0599.NIL == module0144.$g1748$.getDynamicValue(var33) || module0599.NIL != f36714(var32)));
    }
    
    public static SubLObject f36711() {
        final SubLObject var96 = module0599.$g4649$.getGlobalValue();
        if (module0599.NIL != var96) {
            module0034.f1818(var96);
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36715(final SubLObject var32) {
        return module0034.f1829(module0599.$g4649$.getGlobalValue(), (SubLObject)ConsesLow.list(var32), (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
    }
    
    public static SubLObject f36716(final SubLObject var32) {
        return f36717(var32, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
    }
    
    public static SubLObject f36713(final SubLObject var32) {
        SubLObject var33 = module0599.$g4649$.getGlobalValue();
        if (module0599.NIL == var33) {
            var33 = module0034.f1934((SubLObject)module0599.$ic31$, (SubLObject)module0599.$ic32$, (SubLObject)module0599.$ic33$, (SubLObject)module0599.EQL, (SubLObject)module0599.ONE_INTEGER, (SubLObject)module0599.$ic34$);
        }
        SubLObject var34 = module0034.f1814(var33, var32, (SubLObject)module0599.$ic35$);
        if (var34 == module0599.$ic35$) {
            var34 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f36716(var32)));
            module0034.f1816(var33, var32, var34, (SubLObject)module0599.UNPROVIDED);
        }
        return module0034.f1959(var34);
    }
    
    public static SubLObject f36717(final SubLObject var32, SubLObject var99, SubLObject var100) {
        if (var99 == module0599.UNPROVIDED) {
            var99 = module0139.$g1639$.getDynamicValue();
        }
        if (var100 == module0599.UNPROVIDED) {
            var100 = module0139.$g1640$.getDynamicValue();
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (module0599.NIL != module0225.f14775(var32)) {
            SubLObject var102 = (SubLObject)module0599.NIL;
            if (module0599.NIL == var102) {
                SubLObject var103 = module0226.f14888(var32, (SubLObject)module0599.UNPROVIDED);
                SubLObject var104 = (SubLObject)module0599.NIL;
                var104 = var103.first();
                while (module0599.NIL == var102 && module0599.NIL != var103) {
                    SubLObject var105 = module0139.$g1659$.currentBinding(var101);
                    try {
                        module0139.$g1659$.bind(var99, var101);
                        if (module0599.NIL == module0251.f16239(var104, (SubLObject)module0599.UNPROVIDED)) {
                            var102 = (SubLObject)module0599.T;
                        }
                    }
                    finally {
                        module0139.$g1659$.rebind(var105, var101);
                    }
                    var105 = module0139.$g1659$.currentBinding(var101);
                    try {
                        module0139.$g1659$.bind(var100, var101);
                        if (module0599.NIL == module0251.f16239(var104, (SubLObject)module0599.UNPROVIDED)) {
                            var102 = (SubLObject)module0599.T;
                        }
                    }
                    finally {
                        module0139.$g1659$.rebind(var105, var101);
                    }
                    var103 = var103.rest();
                    var104 = var103.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0599.NIL == var102);
        }
        SubLObject var106 = (SubLObject)module0599.NIL;
        final SubLObject var107 = module0225.f14739(var32);
        if (module0599.NIL != module0202.f12909(var107) && module0599.NIL == var106) {
            SubLObject var108 = module0146.$g1959$.getGlobalValue();
            SubLObject var109 = (SubLObject)module0599.NIL;
            var109 = var108.first();
            while (module0599.NIL == var106 && module0599.NIL != var108) {
                if (var109.numLE(var107)) {
                    final SubLObject var110 = module0144.$g1832$.currentBinding(var101);
                    try {
                        module0144.$g1832$.bind(module0144.$g1834$.getDynamicValue(var101), var101);
                        if (module0599.NIL != f36718(var32, module0226.f14903(var109, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), (SubLObject)module0599.ONE_INTEGER, (SubLObject)module0599.TWO_INTEGER, var99, (SubLObject)module0599.UNPROVIDED) && module0599.NIL == var106) {
                            SubLObject var102_107 = module0146.$g1959$.getGlobalValue();
                            SubLObject var111 = (SubLObject)module0599.NIL;
                            var111 = var102_107.first();
                            while (module0599.NIL == var106 && module0599.NIL != var102_107) {
                                if (var111.numLE(var107) && !var109.numE(var111)) {
                                    final SubLObject var11_109 = module0144.$g1832$.currentBinding(var101);
                                    try {
                                        module0144.$g1832$.bind(module0144.$g1835$.getDynamicValue(var101), var101);
                                        var106 = f36718(var32, module0226.f14903(var111, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), (SubLObject)module0599.ONE_INTEGER, (SubLObject)module0599.TWO_INTEGER, var100, (SubLObject)module0599.UNPROVIDED);
                                    }
                                    finally {
                                        module0144.$g1832$.rebind(var11_109, var101);
                                    }
                                }
                                var102_107 = var102_107.rest();
                                var111 = var102_107.first();
                            }
                        }
                    }
                    finally {
                        module0144.$g1832$.rebind(var110, var101);
                    }
                }
                var108 = var108.rest();
                var109 = var108.first();
            }
        }
        return var106;
    }
    
    public static SubLObject f36712() {
        final SubLObject var96 = module0599.$g4650$.getGlobalValue();
        if (module0599.NIL != var96) {
            module0034.f1818(var96);
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36719(final SubLObject var32) {
        return module0034.f1829(module0599.$g4650$.getGlobalValue(), (SubLObject)ConsesLow.list(var32), (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
    }
    
    public static SubLObject f36720(final SubLObject var32) {
        return f36721(var32, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
    }
    
    public static SubLObject f36714(final SubLObject var32) {
        SubLObject var33 = module0599.$g4650$.getGlobalValue();
        if (module0599.NIL == var33) {
            var33 = module0034.f1934((SubLObject)module0599.$ic36$, (SubLObject)module0599.$ic37$, (SubLObject)module0599.$ic33$, (SubLObject)module0599.EQL, (SubLObject)module0599.ONE_INTEGER, (SubLObject)module0599.$ic34$);
        }
        SubLObject var34 = module0034.f1814(var33, var32, (SubLObject)module0599.$ic35$);
        if (var34 == module0599.$ic35$) {
            var34 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f36720(var32)));
            module0034.f1816(var33, var32, var34, (SubLObject)module0599.UNPROVIDED);
        }
        return module0034.f1959(var34);
    }
    
    public static SubLObject f36721(final SubLObject var32, SubLObject var110, SubLObject var111) {
        if (var110 == module0599.UNPROVIDED) {
            var110 = module0139.$g1641$.getDynamicValue();
        }
        if (var111 == module0599.UNPROVIDED) {
            var111 = module0139.$g1642$.getDynamicValue();
        }
        final SubLThread var112 = SubLProcess.currentSubLThread();
        if (module0599.NIL != module0225.f14775(var32)) {
            SubLObject var113 = (SubLObject)module0599.NIL;
            if (module0599.NIL == var113) {
                SubLObject var114 = module0226.f14941(var32, (SubLObject)module0599.UNPROVIDED);
                SubLObject var115 = (SubLObject)module0599.NIL;
                var115 = var114.first();
                while (module0599.NIL == var113 && module0599.NIL != var114) {
                    SubLObject var116 = module0139.$g1659$.currentBinding(var112);
                    try {
                        module0139.$g1659$.bind(var110, var112);
                        if (module0599.NIL == module0251.f16239(var115, (SubLObject)module0599.UNPROVIDED)) {
                            var113 = (SubLObject)module0599.T;
                        }
                    }
                    finally {
                        module0139.$g1659$.rebind(var116, var112);
                    }
                    var116 = module0139.$g1659$.currentBinding(var112);
                    try {
                        module0139.$g1659$.bind(var111, var112);
                        if (module0599.NIL == module0251.f16239(var115, (SubLObject)module0599.UNPROVIDED)) {
                            var113 = (SubLObject)module0599.T;
                        }
                    }
                    finally {
                        module0139.$g1659$.rebind(var116, var112);
                    }
                    var114 = var114.rest();
                    var115 = var114.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(module0599.NIL == var113);
        }
        SubLObject var117 = (SubLObject)module0599.NIL;
        final SubLObject var118 = module0225.f14739(var32);
        if (module0599.NIL != module0202.f12909(var118) && module0599.NIL == var117) {
            SubLObject var119 = module0146.$g1959$.getGlobalValue();
            SubLObject var120 = (SubLObject)module0599.NIL;
            var120 = var119.first();
            while (module0599.NIL == var117 && module0599.NIL != var119) {
                if (var120.numLE(var118)) {
                    final SubLObject var121 = module0144.$g1832$.currentBinding(var112);
                    try {
                        module0144.$g1832$.bind(module0144.$g1834$.getDynamicValue(var112), var112);
                        if (module0599.NIL != f36718(var32, module0226.f14947(var120, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), (SubLObject)module0599.ONE_INTEGER, (SubLObject)module0599.TWO_INTEGER, var110, (SubLObject)module0599.UNPROVIDED) && module0599.NIL == var117) {
                            SubLObject var102_113 = module0146.$g1959$.getGlobalValue();
                            SubLObject var122 = (SubLObject)module0599.NIL;
                            var122 = var102_113.first();
                            while (module0599.NIL == var117 && module0599.NIL != var102_113) {
                                if (var122.numLE(var118) && !var120.numE(var122)) {
                                    final SubLObject var11_114 = module0144.$g1832$.currentBinding(var112);
                                    try {
                                        module0144.$g1832$.bind(module0144.$g1835$.getDynamicValue(var112), var112);
                                        var117 = f36718(var32, module0226.f14947(var122, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED), (SubLObject)module0599.ONE_INTEGER, (SubLObject)module0599.TWO_INTEGER, var111, (SubLObject)module0599.UNPROVIDED);
                                    }
                                    finally {
                                        module0144.$g1832$.rebind(var11_114, var112);
                                    }
                                }
                                var102_113 = var102_113.rest();
                                var122 = var102_113.first();
                            }
                        }
                    }
                    finally {
                        module0144.$g1832$.rebind(var121, var112);
                    }
                }
                var119 = var119.rest();
                var120 = var119.first();
            }
        }
        return var117;
    }
    
    public static SubLObject f36718(final SubLObject var115, final SubLObject var32, final SubLObject var116, final SubLObject var117, final SubLObject var118, SubLObject var119) {
        if (var119 == module0599.UNPROVIDED) {
            var119 = (SubLObject)module0599.$ic21$;
        }
        final SubLThread var120 = SubLProcess.currentSubLThread();
        SubLObject var121 = (SubLObject)module0599.NIL;
        final SubLObject var122 = module0139.$g1659$.currentBinding(var120);
        final SubLObject var123 = module0018.$g584$.currentBinding(var120);
        final SubLObject var124 = module0018.$g590$.currentBinding(var120);
        try {
            module0139.$g1659$.bind(var118, var120);
            module0018.$g584$.bind((SubLObject)module0599.NIL, var120);
            module0018.$g590$.bind(var117, var120);
            module0219.f14477(Symbols.symbol_function((SubLObject)module0599.$ic38$), var115, var116, var32, var119, (SubLObject)module0599.UNPROVIDED);
            var121 = module0018.$g584$.getDynamicValue(var120);
        }
        finally {
            module0018.$g590$.rebind(var124, var120);
            module0018.$g584$.rebind(var123, var120);
            module0139.$g1659$.rebind(var122, var120);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0599.NIL == var121);
    }
    
    public static SubLObject f36722(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0599.NIL == module0251.f16239(module0178.f11331(var1, module0018.$g590$.getDynamicValue(var2)), (SubLObject)module0599.UNPROVIDED) && module0599.NIL == ((module0599.NIL != module0144.$g1832$.getDynamicValue(var2) && module0599.NIL != module0144.$g1857$.getDynamicValue(var2)) ? module0305.f20337(module0178.f11331(var1, module0018.$g590$.getDynamicValue(var2)), module0144.$g1832$.getDynamicValue(var2), (SubLObject)module0599.UNPROVIDED) : module0599.NIL)) {
            module0018.$g584$.setDynamicValue((SubLObject)module0599.T, var2);
            module0012.f425();
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36723(final SubLObject var120, final SubLObject var37, final SubLObject var121, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        SubLObject var122 = var121;
        SubLObject var123 = f36724(var120, var37, var4);
        SubLObject var124 = (SubLObject)module0599.NIL;
        var124 = var123.first();
        while (module0599.NIL != var123) {
            var122 = f36725(var124, var122, var4);
            var123 = var123.rest();
            var124 = var123.first();
        }
        var123 = f36726(var120, var37, var4);
        SubLObject var125 = (SubLObject)module0599.NIL;
        var125 = var123.first();
        while (module0599.NIL != var123) {
            var122 = f36727(var125, var122, var4);
            var123 = var123.rest();
            var125 = var123.first();
        }
        return var122;
    }
    
    public static SubLObject f36728(final SubLObject var120, final SubLObject var37, final SubLObject var121, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        SubLObject var122 = var121;
        SubLObject var123 = f36724(var120, var37, var4);
        SubLObject var124 = (SubLObject)module0599.NIL;
        var124 = var123.first();
        while (module0599.NIL != var123) {
            var122 = f36727(var124, var122, var4);
            var123 = var123.rest();
            var124 = var123.first();
        }
        var123 = f36726(var120, var37, var4);
        SubLObject var125 = (SubLObject)module0599.NIL;
        var125 = var123.first();
        while (module0599.NIL != var123) {
            var122 = f36725(var125, var122, var4);
            var123 = var123.rest();
            var125 = var123.first();
        }
        return var122;
    }
    
    public static SubLObject f36729(final SubLObject var120, final SubLObject var37, final SubLObject var125, final SubLObject var126, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        final SubLObject var127 = module0035.f2269(var125, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
        final SubLObject var128 = module0035.f2269(var126, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
        final SubLObject var129 = module0035.f2220(var127, var128, (SubLObject)module0599.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0599.NIL == var129 || module0599.NIL == conses_high.subsetp(var129, f36728(var120, var37, ConsesLow.append(var129, var128), var4), (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED));
    }
    
    public static SubLObject f36724(final SubLObject var36, final SubLObject var37, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        return module0220.f14597(var36, module0599.$ic39$, var37, var4, (SubLObject)module0599.ONE_INTEGER, (SubLObject)module0599.THREE_INTEGER, (SubLObject)module0599.TWO_INTEGER, (SubLObject)module0599.$ic21$);
    }
    
    public static SubLObject f36726(final SubLObject var36, final SubLObject var37, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        return module0220.f14597(var36, module0599.$ic40$, var37, var4, (SubLObject)module0599.ONE_INTEGER, (SubLObject)module0599.THREE_INTEGER, (SubLObject)module0599.TWO_INTEGER, (SubLObject)module0599.$ic21$);
    }
    
    public static SubLObject f36725(final SubLObject var120, final SubLObject var130, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        if (module0599.NIL != module0244.f15730(var120)) {
            final SubLObject var131 = module0252.f16260(module0137.f8955(var120), var130, var4, (SubLObject)module0599.UNPROVIDED, (SubLObject)module0599.UNPROVIDED);
            return var131;
        }
        if (module0599.NIL != module0226.f14800(var120)) {
            return module0315.f21322(var120, var130, var4, (SubLObject)module0599.UNPROVIDED);
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36727(final SubLObject var120, final SubLObject var130, SubLObject var4) {
        if (var4 == module0599.UNPROVIDED) {
            var4 = (SubLObject)module0599.NIL;
        }
        if (module0599.NIL != module0244.f15730(var120)) {
            final SubLObject var131 = module0252.f16262(module0137.f8955(var120), var130, var4, (SubLObject)module0599.UNPROVIDED);
            return var131;
        }
        if (module0599.NIL != module0226.f14800(var120)) {
            return module0315.f21321(var120, var130, var4);
        }
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36730() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36672", "S#40478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36673", "S#40479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36674", "S#40480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36675", "PREDS-FOR-PAIR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36676", "S#40481", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36679", "S#40482", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36680", "S#40483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36681", "S#40484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36682", "S#40485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36684", "S#40486", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36685", "S#40487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36686", "S#40488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36687", "S#40489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36688", "S#20823", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36689", "S#40490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36690", "S#40491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36691", "S#40492", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36692", "S#40493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36693", "S#40494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36677", "S#40495", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36694", "S#40496", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36695", "S#40497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36696", "S#40498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36697", "S#40499", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36698", "S#40500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36699", "S#40501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36678", "S#40502", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36700", "S#40503", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36701", "S#40504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36702", "S#40505", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36703", "S#40506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36704", "S#40507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36705", "S#40508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36706", "S#40509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36707", "S#40510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36708", "S#40511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36709", "S#40512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36683", "S#40513", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36710", "S#40514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36711", "S#40515", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36715", "S#40516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36716", "S#40517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36713", "S#40518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36717", "S#40519", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36712", "S#40520", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36719", "S#40521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36720", "S#40522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36714", "S#40523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36721", "S#40524", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36718", "S#40525", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36722", "S#40526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36723", "S#20970", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36728", "S#20887", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36729", "S#20886", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36724", "S#40527", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36726", "S#40528", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36725", "S#40529", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0599", "f36727", "S#40530", 2, 1, false);
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36731() {
        module0599.$g4646$ = SubLFiles.defparameter("S#40531", (SubLObject)module0599.NIL);
        module0599.$g4647$ = SubLFiles.defparameter("S#40532", (SubLObject)module0599.NIL);
        module0599.$g4648$ = SubLFiles.defparameter("S#40533", (SubLObject)module0599.NIL);
        module0599.$g4649$ = SubLFiles.deflexical("S#40534", (SubLObject)module0599.NIL);
        module0599.$g4650$ = SubLFiles.deflexical("S#40535", (SubLObject)module0599.NIL);
        return (SubLObject)module0599.NIL;
    }
    
    public static SubLObject f36732() {
        module0012.f368((SubLObject)module0599.$ic7$, (SubLObject)module0599.$ic8$, (SubLObject)module0599.$ic9$, (SubLObject)module0599.$ic10$, (SubLObject)module0599.$ic11$);
        module0034.f1909((SubLObject)module0599.$ic31$);
        module0034.f1909((SubLObject)module0599.$ic36$);
        return (SubLObject)module0599.NIL;
    }
    
    public void declareFunctions() {
        f36730();
    }
    
    public void initializeVariables() {
        f36731();
    }
    
    public void runTopLevelForms() {
        f36732();
    }
    
    static {
        me = (SubLFile)new module0599();
        module0599.$g4646$ = null;
        module0599.$g4647$ = null;
        module0599.$g4648$ = null;
        module0599.$g4649$ = null;
        module0599.$g4650$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("BOGUS");
        $ic1$ = SubLObjectFactory.makeKeyword("FREE");
        $ic2$ = SubLObjectFactory.makeKeyword("ALL");
        $ic3$ = SubLObjectFactory.makeKeyword("MIXED");
        $ic4$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic5$ = SubLObjectFactory.makeKeyword("FIGURATIVE");
        $ic6$ = SubLObjectFactory.makeKeyword("LITERAL");
        $ic7$ = SubLObjectFactory.makeSymbol("PREDS-FOR-PAIR");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12115", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12116", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("MIXED")));
        $ic9$ = SubLObjectFactory.makeString("Return a list of the predicates relevant to relating FORT-1 and FORT-2.\nMODE may be :figurative (instances of collections), \n:literal (constants), or \n:mixed (referents).");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12115", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12116", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $ic12$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic15$ = SubLObjectFactory.makeSymbol("S#40510", "CYC");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic17$ = SubLObjectFactory.makeInteger(512);
        $ic18$ = SubLObjectFactory.makeSymbol("S#40488", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#40489", "CYC");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $ic21$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic23$ = SubLObjectFactory.makeSymbol("S#40491", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#40494", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#40509", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#40511", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#18973", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#40512", "CYC");
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ArgIsaBinaryPredicate"));
        $ic30$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ArgGenlBinaryPredicate"));
        $ic31$ = SubLObjectFactory.makeSymbol("S#40518", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#40534", "CYC");
        $ic33$ = SubLObjectFactory.makeInteger(4096);
        $ic34$ = SubLObjectFactory.makeInteger(2048);
        $ic35$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic36$ = SubLObjectFactory.makeSymbol("S#40523", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#40535", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#40526", "CYC");
        $ic39$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0599.class
	Total time: 825 ms
	
	Decompiled with Procyon 0.5.32.
*/