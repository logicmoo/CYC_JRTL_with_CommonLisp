package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0327 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0327";
    public static final String myFingerPrint = "2e7b93bf34747f8c18694a2f5479922cb3ce3b07f33f55385ff2d75e32dcbe58";
    public static SubLSymbol $g2465$;
    public static SubLSymbol $g2841$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLString $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    
    public static SubLObject f22089(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0327.UNPROVIDED) {
            var3 = (SubLObject)module0327.T;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0327.NIL != module0142.f9311() && (module0327.NIL == var3 || module0327.NIL == module0004.f104(var1, module0178.f11299(var2), Symbols.symbol_function((SubLObject)module0327.$ic4$), (SubLObject)module0327.UNPROVIDED))) {
            final SubLObject var5 = module0138.$g1628$.currentBinding(var4);
            final SubLObject var6 = module0138.$g1627$.currentBinding(var4);
            try {
                module0138.$g1628$.bind(var1, var4);
                module0138.$g1627$.bind(var2, var4);
                final SubLObject var7 = module0178.f11292(var2);
                final SubLObject var8 = module0130.f8513(var7);
                final SubLObject var9 = module0178.f11287(var2);
                final SubLObject var10 = module0178.f11333(var2);
                final SubLObject var11 = module0178.f11334(var2);
                final SubLObject var12 = module0178.f11335(var2);
                final SubLObject var5_13 = module0147.$g2094$.currentBinding(var4);
                final SubLObject var6_14 = module0147.$g2095$.currentBinding(var4);
                try {
                    module0147.$g2094$.bind((SubLObject)module0327.$ic5$, var4);
                    module0147.$g2095$.bind(var9, var4);
                    if (module0327.NIL == module0324.f21954(var10)) {
                        module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic7$, var10, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                    }
                    else if (module0327.NIL == module0324.f21947(var11)) {
                        module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic8$, var11, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                    }
                    else if (module0327.NIL == module0324.f21947(var12)) {
                        module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic8$, var12, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                    }
                    else if (module0327.NIL == f22090(var10, var11, var12)) {
                        module0136.f8871((SubLObject)module0327.FOUR_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic9$, (SubLObject)ConsesLow.list(var10, var11, var12), var7, var9, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                    }
                    else {
                        final SubLObject var5_14 = module0142.$g1717$.currentBinding(var4);
                        try {
                            module0142.$g1717$.bind((SubLObject)module0327.T, var4);
                            if (module0327.NIL != module0325.f21982(var10, var11, var12, module0130.f8517(var8), var9)) {
                                f22091(var10, var11, var12, var8, var9, (SubLObject)module0327.$ic10$);
                            }
                            else {
                                f22092(var2, var10, var11, var12, var8, var9);
                            }
                        }
                        finally {
                            module0142.$g1717$.rebind(var5_14, var4);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var6_14, var4);
                    module0147.$g2094$.rebind(var5_13, var4);
                }
            }
            finally {
                module0138.$g1627$.rebind(var6, var4);
                module0138.$g1628$.rebind(var5, var4);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22093(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0327.UNPROVIDED) {
            var3 = (SubLObject)module0327.T;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0327.NIL != module0142.f9311() && (module0327.NIL == var3 || module0327.NIL == module0004.f104(var1, module0178.f11299(var2), Symbols.symbol_function((SubLObject)module0327.$ic4$), (SubLObject)module0327.UNPROVIDED))) {
            final SubLObject var5 = module0138.$g1628$.currentBinding(var4);
            final SubLObject var6 = module0138.$g1627$.currentBinding(var4);
            try {
                module0138.$g1628$.bind(var1, var4);
                module0138.$g1627$.bind(var2, var4);
                final SubLObject var7 = module0178.f11292(var2);
                final SubLObject var8 = module0130.f8513(var7);
                final SubLObject var9 = module0178.f11287(var2);
                final SubLObject var10 = module0178.f11333(var2);
                final SubLObject var11 = module0178.f11334(var2);
                final SubLObject var12 = module0178.f11335(var2);
                final SubLObject var5_16 = module0147.$g2094$.currentBinding(var4);
                final SubLObject var6_17 = module0147.$g2095$.currentBinding(var4);
                try {
                    module0147.$g2094$.bind((SubLObject)module0327.$ic5$, var4);
                    module0147.$g2095$.bind(var9, var4);
                    if (module0327.NIL == module0324.f21954(var10)) {
                        module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic7$, var10, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                    }
                    else if (module0327.NIL == module0324.f21947(var11)) {
                        module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic8$, var11, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                    }
                    else if (module0327.NIL == module0324.f21947(var12)) {
                        module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic8$, var12, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                    }
                    else if (module0327.NIL == f22090(var10, var11, var12)) {
                        module0136.f8871((SubLObject)module0327.FOUR_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic9$, (SubLObject)ConsesLow.list(var10, var11, var12), var7, var9, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                    }
                    else {
                        final SubLObject var5_17 = module0142.$g1717$.currentBinding(var4);
                        try {
                            module0142.$g1717$.bind((SubLObject)module0327.T, var4);
                            f22092(var2, var10, var11, var12, var8, var9);
                        }
                        finally {
                            module0142.$g1717$.rebind(var5_17, var4);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var6_17, var4);
                    module0147.$g2094$.rebind(var5_16, var4);
                }
            }
            finally {
                module0138.$g1627$.rebind(var6, var4);
                module0138.$g1628$.rebind(var5, var4);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22094(final SubLObject var1, final SubLObject var2, SubLObject var19) {
        if (var19 == module0327.UNPROVIDED) {
            var19 = (SubLObject)module0327.T;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0327.NIL != module0142.f9311()) {
            final SubLObject var21 = module0178.f11292(var2);
            final SubLObject var22 = module0130.f8513(var21);
            final SubLObject var23 = module0178.f11287(var2);
            final SubLObject var24 = module0178.f11333(var2);
            final SubLObject var25 = module0178.f11334(var2);
            final SubLObject var26 = module0178.f11335(var2);
            final SubLObject var27 = module0147.$g2094$.currentBinding(var20);
            final SubLObject var28 = module0147.$g2095$.currentBinding(var20);
            try {
                module0147.$g2094$.bind((SubLObject)module0327.$ic12$, var20);
                module0147.$g2095$.bind(var23, var20);
                if (module0327.NIL != var19 && module0327.NIL != module0226.f15088(var2, var21)) {
                    module0136.f8872((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic13$, var2, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                }
                else if (module0327.NIL == module0324.f21954(var24)) {
                    module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic7$, var24, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                }
                else if (module0327.NIL == module0324.f21947(var25)) {
                    module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic8$, var25, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                }
                else if (module0327.NIL == module0324.f21947(var26)) {
                    module0136.f8871((SubLObject)module0327.THREE_INTEGER, (SubLObject)module0327.$ic6$, (SubLObject)module0327.$ic8$, var26, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
                }
                else {
                    f22095(var2, var24, var25, var26, var22, var23);
                }
            }
            finally {
                module0147.$g2095$.rebind(var28, var20);
                module0147.$g2094$.rebind(var27, var20);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22090(final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        if (module0327.NIL == module0324.f21953(var10, var11, var12)) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var13 = module0328.f22143(var10, (SubLObject)module0327.$ic15$, (SubLObject)module0327.UNPROVIDED);
        if (module0327.NIL == Symbols.fboundp(var13)) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var14 = Functions.funcall(var13, var11, var12);
        SubLObject var15 = (SubLObject)module0327.NIL;
        if (module0327.NIL == var15) {
            SubLObject var16;
            SubLObject var17;
            for (var16 = var14, var17 = (SubLObject)module0327.NIL, var17 = var16.first(); module0327.NIL == var15 && module0327.NIL != var16; var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0327.NIL == module0325.f22000(var17)), var16 = var16.rest(), var17 = var16.first()) {}
        }
        return var15;
    }
    
    public static SubLObject f22092(final SubLObject var25, final SubLObject var10, final SubLObject var11, final SubLObject var12, final SubLObject var8, final SubLObject var9) {
        if (module0327.NIL == module0324.f21953(var10, var11, var12)) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var26 = module0328.f22143(var10, (SubLObject)module0327.$ic15$, (SubLObject)module0327.UNPROVIDED);
        if (module0327.NIL == Symbols.fboundp(var26)) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var27 = Functions.funcall(var26, var11, var12);
        if (var8.eql((SubLObject)module0327.$ic16$)) {
            if (module0327.NIL != module0324.f21970(var10)) {
                f22096(var25, var27, var9);
            }
            else if (module0327.NIL != module0324.f21971(var10)) {
                f22097(var25, var27, var9);
            }
        }
        else if (var8.eql((SubLObject)module0327.$ic17$)) {
            if (module0327.NIL != module0324.f21970(var10)) {
                f22097(var25, var27, var9);
            }
            else if (module0327.NIL != module0324.f21971(var10)) {
                f22096(var25, var27, var9);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22095(final SubLObject var25, final SubLObject var10, final SubLObject var11, final SubLObject var12, final SubLObject var8, final SubLObject var9) {
        if (module0327.NIL == module0324.f21953(var10, var11, var12)) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var26 = module0328.f22143(var10, (SubLObject)module0327.$ic15$, (SubLObject)module0327.UNPROVIDED);
        if (module0327.NIL == Symbols.fboundp(var26)) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var27 = Functions.funcall(var26, var11, var12);
        if (var8.eql((SubLObject)module0327.$ic16$)) {
            if (module0327.NIL != module0324.f21970(var10)) {
                f22098(var25, var27, var9);
            }
            else if (module0327.NIL != module0324.f21971(var10)) {
                f22099(var25, var27, var9);
            }
        }
        else if (var8.eql((SubLObject)module0327.$ic17$)) {
            if (module0327.NIL != module0324.f21970(var10)) {
                f22099(var25, var27, var9);
            }
            else if (module0327.NIL != module0324.f21971(var10)) {
                f22098(var25, var27, var9);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22096(final SubLObject var25, final SubLObject var21, final SubLObject var9) {
        if (module0327.NIL == module0325.f22000(var21.first())) {
            SubLObject var26 = var21;
            SubLObject var27 = (SubLObject)module0327.NIL;
            var27 = var26.first();
            while (module0327.NIL != var26) {
                final SubLObject var28 = var27.first();
                final SubLObject var29 = f22100(conses_high.second(var27));
                final SubLObject var30 = f22100(conses_high.third(var27));
                f22101(var25, var28, var29, var30, var9);
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22098(final SubLObject var25, final SubLObject var21, final SubLObject var9) {
        SubLObject var26 = var21;
        SubLObject var27 = (SubLObject)module0327.NIL;
        var27 = var26.first();
        while (module0327.NIL != var26) {
            final SubLObject var28 = var27.first();
            final SubLObject var29 = f22102(conses_high.second(var27));
            final SubLObject var30 = f22102(conses_high.third(var27));
            f22103(var25, var28, var29, var30, var9);
            var26 = var26.rest();
            var27 = var26.first();
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22100(final SubLObject var31) {
        final SubLObject var32 = var31.first();
        final SubLObject var33 = conses_high.second(var31);
        final SubLObject var34 = var32;
        if (var34.eql((SubLObject)module0327.$ic18$)) {
            if (var33.isInteger()) {
                f22104(var33);
            }
            else if (module0327.NIL != module0202.f12691(var33, (SubLObject)module0327.UNPROVIDED)) {
                f22105(var33);
            }
            return module0324.f21943(var33);
        }
        if (var34.eql((SubLObject)module0327.$ic19$)) {
            if (var33.isInteger()) {
                f22106(var33);
            }
            else if (module0327.NIL != module0202.f12691(var33, (SubLObject)module0327.UNPROVIDED)) {
                f22107(var33);
            }
            return module0324.f21944(var33);
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22102(final SubLObject var31) {
        final SubLObject var32 = var31.first();
        final SubLObject var33 = conses_high.second(var31);
        final SubLObject var34 = var32;
        if (var34.eql((SubLObject)module0327.$ic18$)) {
            return module0324.f21943(var33);
        }
        if (var34.eql((SubLObject)module0327.$ic19$)) {
            return module0324.f21944(var33);
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22105(final SubLObject var34) {
        final SubLObject var35 = module0324.f21943(var34);
        final SubLObject var36 = module0324.f21944(var34);
        f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic21$, var35, var36, module0327.$g2465$.getGlobalValue());
        f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic21$, module0324.f21944((SubLObject)module0327.$ic22$), var35, module0327.$g2465$.getGlobalValue());
        f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic21$, var36, module0324.f21943((SubLObject)module0327.$ic23$), module0327.$g2465$.getGlobalValue());
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22108(final SubLObject var34) {
        return module0324.f21943(var34);
    }
    
    public static SubLObject f22107(final SubLObject var34) {
        final SubLObject var35 = module0324.f21944(var34);
        final SubLObject var36 = module0324.f21943(var34);
        f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic21$, var36, var35, module0327.$g2465$.getGlobalValue());
        f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic21$, module0324.f21944((SubLObject)module0327.$ic22$), var36, module0327.$g2465$.getGlobalValue());
        f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic21$, var35, module0324.f21943((SubLObject)module0327.$ic23$), module0327.$g2465$.getGlobalValue());
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22109(final SubLObject var34) {
        return module0324.f21944(var34);
    }
    
    public static SubLObject f22104(final SubLObject var37) {
        final SubLObject var38 = module0324.f21943(var37);
        if (module0327.NIL == module0324.f21949(var38)) {
            if (module0327.NIL == module0004.f104(var37, module0142.$g1723$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0327.EQL), (SubLObject)module0327.UNPROVIDED)) {
                module0142.$g1723$.setGlobalValue(Sort.cmerge(conses_high.copy_list(module0142.$g1723$.getGlobalValue()), (SubLObject)ConsesLow.list(var37), (SubLObject)module0327.$ic24$, (SubLObject)module0327.UNPROVIDED));
            }
            final SubLObject var39 = module0324.f21944(var37);
            final SubLObject var40 = Sequences.position(var37, module0142.$g1723$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
            final SubLObject var41 = Numbers.subtract(Sequences.length(module0142.$g1723$.getGlobalValue()), (SubLObject)module0327.ONE_INTEGER);
            SubLObject var42 = (SubLObject)module0327.NIL;
            SubLObject var43 = (SubLObject)module0327.NIL;
            SubLObject var44 = (SubLObject)module0327.NIL;
            SubLObject var45 = (SubLObject)module0327.NIL;
            if (var40.numG((SubLObject)module0327.ZERO_INTEGER)) {
                var42 = ConsesLow.nth(Numbers.subtract(var40, (SubLObject)module0327.ONE_INTEGER), module0142.$g1723$.getGlobalValue());
                var43 = f22110(var42);
            }
            if (var40.numL(var41)) {
                var44 = ConsesLow.nth(Numbers.add(var40, (SubLObject)module0327.ONE_INTEGER), module0142.$g1723$.getGlobalValue());
                var45 = f22111(var44);
            }
            if (module0327.NIL != var43) {
                if (var42.numE(module0051.f3650(var37)) && module0327.NIL != module0324.f21924(var43)) {
                    f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic25$, var43, var38, module0327.$g2465$.getGlobalValue());
                }
                else {
                    f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var43, var38, module0327.$g2465$.getGlobalValue());
                }
            }
            if (module0327.NIL != module0324.f21949(var39)) {
                f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var38, var39, module0327.$g2465$.getGlobalValue());
            }
            else if (module0327.NIL != var45) {
                f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var38, var45, module0327.$g2465$.getGlobalValue());
            }
            if (module0327.NIL != var43) {
                if (module0327.NIL != module0324.f21949(var39)) {
                    f22103((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var43, var39, module0327.$g2465$.getGlobalValue());
                }
                else if (module0327.NIL != var45) {
                    f22103((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var43, var45, module0327.$g2465$.getGlobalValue());
                }
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22106(final SubLObject var37) {
        final SubLObject var38 = module0324.f21944(var37);
        if (module0327.NIL == module0324.f21949(var38)) {
            if (module0327.NIL == module0004.f104(var37, module0142.$g1723$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED)) {
                module0142.$g1723$.setGlobalValue(Sort.cmerge(conses_high.copy_list(module0142.$g1723$.getGlobalValue()), (SubLObject)ConsesLow.list(var37), (SubLObject)module0327.$ic24$, (SubLObject)module0327.UNPROVIDED));
            }
            final SubLObject var39 = module0324.f21943(var37);
            final SubLObject var40 = Sequences.position(var37, module0142.$g1723$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
            final SubLObject var41 = Numbers.subtract(Sequences.length(module0142.$g1723$.getGlobalValue()), (SubLObject)module0327.ONE_INTEGER);
            SubLObject var42 = (SubLObject)module0327.NIL;
            SubLObject var43 = (SubLObject)module0327.NIL;
            SubLObject var44 = (SubLObject)module0327.NIL;
            SubLObject var45 = (SubLObject)module0327.NIL;
            if (var40.numG((SubLObject)module0327.ZERO_INTEGER)) {
                var42 = ConsesLow.nth(Numbers.subtract(var40, (SubLObject)module0327.ONE_INTEGER), module0142.$g1723$.getGlobalValue());
                var43 = f22110(var42);
            }
            if (var40.numL(var41)) {
                var44 = ConsesLow.nth(Numbers.add(var40, (SubLObject)module0327.ONE_INTEGER), module0142.$g1723$.getGlobalValue());
                var45 = f22111(var44);
            }
            if (module0327.NIL != module0324.f21949(var39)) {
                f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var39, var38, module0327.$g2465$.getGlobalValue());
            }
            else if (module0327.NIL != var43) {
                f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var43, var38, module0327.$g2465$.getGlobalValue());
            }
            if (module0327.NIL != var45) {
                if (var44.numE(module0051.f3652(var37)) && module0327.NIL != module0324.f21916(var45)) {
                    f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic25$, var38, var45, module0327.$g2465$.getGlobalValue());
                }
                else {
                    f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var38, var45, module0327.$g2465$.getGlobalValue());
                }
            }
            if (module0327.NIL != var45) {
                if (module0327.NIL != module0324.f21949(var39)) {
                    f22103((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var39, var45, module0327.$g2465$.getGlobalValue());
                }
                else if (module0327.NIL != var43) {
                    f22103((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var43, var45, module0327.$g2465$.getGlobalValue());
                }
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22111(final SubLObject var34) {
        SubLObject var35 = module0324.f21943(var34);
        if (module0327.NIL != module0324.f21949(var35)) {
            return var35;
        }
        var35 = module0324.f21944(var34);
        return (SubLObject)((module0327.NIL != module0324.f21949(var35)) ? var35 : module0327.NIL);
    }
    
    public static SubLObject f22110(final SubLObject var34) {
        SubLObject var35 = module0324.f21944(var34);
        if (module0327.NIL != module0324.f21949(var35)) {
            return var35;
        }
        var35 = module0324.f21943(var34);
        return (SubLObject)((module0327.NIL != module0324.f21949(var35)) ? var35 : module0327.NIL);
    }
    
    public static SubLObject f22101(final SubLObject var25, final SubLObject var45, final SubLObject var29, final SubLObject var30, final SubLObject var9) {
        SubLObject var46 = (SubLObject)module0327.NIL;
        if (!var29.eql(var30) && module0327.NIL != module0324.f21934(var29) && module0327.NIL != module0324.f21934(var30)) {
            if (module0327.NIL != module0035.f2169(var45, (SubLObject)module0327.$ic27$)) {
                var46 = f22112(var25, var45, var29, var30, var9);
            }
            else if (var45 == module0327.$ic28$) {
                var46 = f22112(var25, (SubLObject)module0327.$ic21$, var29, var30, var9);
                var46 = (SubLObject)SubLObjectFactory.makeBoolean(module0327.NIL != f22112(var25, (SubLObject)module0327.$ic21$, var30, var29, var9) || module0327.NIL != var46);
            }
            else if (var45 == module0327.$ic25$) {
                var46 = f22112(var25, (SubLObject)module0327.$ic29$, var29, var30, var9);
                var46 = (SubLObject)SubLObjectFactory.makeBoolean(module0327.NIL != f22112(var25, (SubLObject)module0327.$ic30$, var30, var29, var9) || module0327.NIL != var46);
            }
        }
        return var46;
    }
    
    public static SubLObject f22103(final SubLObject var25, final SubLObject var45, final SubLObject var29, final SubLObject var30, final SubLObject var9) {
        if (module0327.NIL != module0324.f21934(var29) && module0327.NIL != module0324.f21934(var30)) {
            if (module0327.NIL != module0035.f2169(var45, (SubLObject)module0327.$ic27$)) {
                f22113(var25, var45, var29, var30, var9);
            }
            else if (var45 == module0327.$ic28$) {
                f22113(var25, (SubLObject)module0327.$ic21$, var29, var30, var9);
                f22113(var25, (SubLObject)module0327.$ic21$, var30, var29, var9);
            }
            else if (var45 == module0327.$ic25$) {
                f22113(var25, (SubLObject)module0327.$ic29$, var29, var30, var9);
                f22113(var25, (SubLObject)module0327.$ic30$, var30, var29, var9);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22112(final SubLObject var25, final SubLObject var45, final SubLObject var29, final SubLObject var30, final SubLObject var9) {
        if (module0327.NIL != module0324.f21976(var29) || module0327.NIL != module0324.f21976(var30)) {
            return module0323.f21876(var25, var45, var29, var30, var9);
        }
        if (module0327.NIL != f22114(var45, var29, var30, var9)) {
            if (!var25.isCons()) {
                f22115(var25, var45, var29, var30, var9);
            }
            return (SubLObject)module0327.NIL;
        }
        module0326.f22023(var29, var9, var45, var30);
        f22115(var25, var45, var29, var30, var9);
        return (SubLObject)module0327.T;
    }
    
    public static SubLObject f22113(final SubLObject var25, final SubLObject var45, final SubLObject var29, final SubLObject var30, final SubLObject var9) {
        if (module0327.NIL != module0324.f21976(var29) || module0327.NIL != module0324.f21976(var30)) {
            module0323.f21878(var25, var45, var29, var30, var9);
        }
        else {
            f22116(var25, var45, var29, var30, var9);
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22114(final SubLObject var45, final SubLObject var29, final SubLObject var30, final SubLObject var9) {
        return f22117((SubLObject)ConsesLow.list(var45, var29, var30, var9), module0142.$g1720$.getGlobalValue());
    }
    
    public static SubLObject f22117(final SubLObject var47, final SubLObject var48) {
        final SubLObject var49 = Hashtables.gethash_without_values(var47, var48, (SubLObject)module0327.UNPROVIDED);
        SubLObject var51;
        SubLObject var50 = var51 = var49;
        SubLObject var52 = (SubLObject)module0327.NIL;
        var52 = var51.first();
        while (module0327.NIL != var51) {
            if (module0327.NIL != module0174.f11035(var52) && module0327.NIL == module0178.f11361(var52, (SubLObject)module0327.UNPROVIDED)) {
                var50 = Sequences.remove(var52, var50, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
            }
            var51 = var51.rest();
            var52 = var51.first();
        }
        if (module0327.NIL == var50) {
            Hashtables.remhash(var47, var48);
        }
        else if (!var49.equal(var50)) {
            Hashtables.sethash(var47, var48, var50);
        }
        return module0035.sublisp_boolean(var50);
    }
    
    public static SubLObject f22115(final SubLObject var25, final SubLObject var45, final SubLObject var29, final SubLObject var30, final SubLObject var9) {
        return f22118(var25, (SubLObject)ConsesLow.list(var45, var29, var30, var9), module0142.$g1720$.getGlobalValue());
    }
    
    public static SubLObject f22118(final SubLObject var25, final SubLObject var47, final SubLObject var48) {
        module0030.f1600(var47, var25, var48, Symbols.symbol_function((SubLObject)module0327.EQUAL));
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22116(final SubLObject var25, final SubLObject var45, final SubLObject var29, final SubLObject var30, final SubLObject var9) {
        final SubLObject var46 = (SubLObject)ConsesLow.list(var45, var29, var30, var9);
        SubLObject var47 = Hashtables.gethash_without_values(var46, module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
        SubLObject var48;
        var47 = (var48 = Sequences.remove(var25, var47, Symbols.symbol_function((SubLObject)module0327.EQUAL), (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED));
        SubLObject var49 = (SubLObject)module0327.NIL;
        var49 = var48.first();
        while (module0327.NIL != var48) {
            if (module0327.NIL != module0174.f11035(var49) && module0327.NIL == module0178.f11361(var49, (SubLObject)module0327.UNPROVIDED)) {
                var47 = Sequences.remove(var49, var47, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        if (module0327.NIL != var47) {
            Hashtables.sethash(var46, module0142.$g1720$.getGlobalValue(), var47);
        }
        else {
            module0326.f22024(var29, var9, var45, var30);
            Hashtables.remhash(var46, module0142.$g1720$.getGlobalValue());
            if (module0327.NIL != module0174.f11035(var25)) {
                f22119(var29);
                f22119(var30);
                f22120(var29);
                f22120(var30);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22120(final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (module0327.NIL != module0324.f21934(var53) && module0327.NIL == module0324.f21949(var53) && module0327.NIL == Hashtables.gethash_without_values(var53, module0142.$g1722$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED) && module0327.NIL == module0004.f104(var53, module0142.$g1726$.getDynamicValue(var54), Symbols.symbol_function((SubLObject)module0327.EQL), (SubLObject)module0327.UNPROVIDED)) {
            final SubLObject var55 = module0142.$g1726$.currentBinding(var54);
            try {
                module0142.$g1726$.bind((SubLObject)ConsesLow.cons(var53, module0142.$g1726$.getDynamicValue(var54)), var54);
                module0324.f21941(var53);
            }
            finally {
                module0142.$g1726$.rebind(var55, var54);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22119(final SubLObject var53) {
        if (module0327.NIL == module0324.f21951(var53)) {
            if (module0327.NIL != module0324.f21976(var53)) {
                f22121(var53);
            }
            else {
                f22122(var53);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22121(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        final SubLObject var46 = module0205.f13203(var44, (SubLObject)module0327.UNPROVIDED);
        SubLObject var47 = (SubLObject)module0327.NIL;
        SubLObject var48 = (SubLObject)module0327.NIL;
        SubLObject var49 = (SubLObject)module0327.NIL;
        SubLObject var50 = (SubLObject)module0327.NIL;
        SubLObject var51 = (SubLObject)module0327.NIL;
        SubLObject var52 = (SubLObject)module0327.NIL;
        SubLObject var53 = (SubLObject)module0327.NIL;
        SubLObject var54 = (SubLObject)module0327.NIL;
        SubLObject var55;
        SubLObject var56;
        SubLObject var57;
        SubLObject var59;
        SubLObject var58;
        SubLObject var60;
        SubLObject var61;
        SubLObject var67_68;
        SubLObject var62;
        SubLObject var63;
        SubLObject var61_70;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        SubLObject var67;
        SubLObject var68;
        SubLObject var73_75;
        SubLObject var69;
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        SubLObject var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        SubLObject var77;
        SubLObject var61_71;
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        SubLObject var73_76;
        SubLObject var81;
        for (var55 = (SubLObject)module0327.NIL, var56 = (SubLObject)module0327.NIL, var56 = module0137.f8931(); module0327.NIL == var55 && module0327.NIL != var56; var56 = var56.rest()) {
            var57 = var56.first();
            var58 = (var59 = var57);
            var60 = (SubLObject)module0327.NIL;
            var61 = (SubLObject)module0327.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)module0327.$ic31$);
            var60 = var59.first();
            var59 = (var61 = var59.rest());
            if (module0327.NIL != module0244.f15733(var61)) {
                var67_68 = var61;
                var62 = module0137.$g1605$.currentBinding(var45);
                try {
                    module0137.$g1605$.bind((module0327.NIL != var67_68) ? var67_68 : module0137.$g1605$.getDynamicValue(var45), var45);
                    var63 = module0242.f15664(var44, var67_68);
                    if (module0327.NIL != var63) {
                        for (var61_70 = (SubLObject)module0327.NIL, var61_70 = module0244.f15784(var67_68); module0327.NIL == var55 && module0327.NIL != var61_70; var61_70 = var61_70.rest()) {
                            var64 = var61_70.first();
                            var65 = module0245.f15834(var63, var64, var67_68);
                            if (module0327.NIL != var65 && var64.eql(module0244.f15778(var67_68))) {
                                for (var66 = module0066.f4838(module0067.f4891(var65)); module0327.NIL == var55 && module0327.NIL == module0066.f4841(var66); var66 = module0066.f4840(var66)) {
                                    var45.resetMultipleValues();
                                    var67 = module0066.f4839(var66);
                                    var68 = var45.secondMultipleValue();
                                    var45.resetMultipleValues();
                                    for (var73_75 = module0066.f4838(module0067.f4891(var68)); module0327.NIL == var55 && module0327.NIL == module0066.f4841(var73_75); var73_75 = module0066.f4840(var73_75)) {
                                        var45.resetMultipleValues();
                                        var69 = module0066.f4839(var73_75);
                                        var70 = var45.secondMultipleValue();
                                        var45.resetMultipleValues();
                                        if (module0327.NIL != module0141.f9279(var69)) {
                                            var71 = var70;
                                            if (module0327.NIL != module0077.f5302(var71)) {
                                                var72 = module0077.f5333(var71);
                                                for (var73 = module0032.f1741(var72), var74 = (SubLObject)module0327.NIL, var74 = module0032.f1742(var73, var72); module0327.NIL == var55 && module0327.NIL == module0032.f1744(var73, var74); var74 = module0032.f1743(var74)) {
                                                    var75 = module0032.f1745(var73, var74);
                                                    if (module0327.NIL != module0032.f1746(var74, var75)) {
                                                        if (module0327.NIL != var48) {
                                                            var55 = (SubLObject)module0327.T;
                                                        }
                                                        else {
                                                            var48 = var75;
                                                            var50 = module0244.f15765(var67_68);
                                                        }
                                                    }
                                                }
                                            }
                                            else if (var71.isList()) {
                                                if (module0327.NIL == var55) {
                                                    var76 = var71;
                                                    var77 = (SubLObject)module0327.NIL;
                                                    var77 = var76.first();
                                                    while (module0327.NIL == var55 && module0327.NIL != var76) {
                                                        if (module0327.NIL != var48) {
                                                            var55 = (SubLObject)module0327.T;
                                                        }
                                                        else {
                                                            var48 = var77;
                                                            var50 = module0244.f15765(var67_68);
                                                        }
                                                        var76 = var76.rest();
                                                        var77 = var76.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)module0327.$ic32$, var71);
                                            }
                                        }
                                    }
                                    module0066.f4842(var73_75);
                                }
                                module0066.f4842(var66);
                            }
                        }
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var62, var45);
                }
                var62 = module0137.$g1605$.currentBinding(var45);
                try {
                    module0137.$g1605$.bind((module0327.NIL != var67_68) ? var67_68 : module0137.$g1605$.getDynamicValue(var45), var45);
                    var63 = module0242.f15664(var44, var67_68);
                    if (module0327.NIL != var63) {
                        for (var61_71 = (SubLObject)module0327.NIL, var61_71 = module0244.f15784(var67_68); module0327.NIL == var55 && module0327.NIL != var61_71; var61_71 = var61_71.rest()) {
                            var78 = var61_71.first();
                            var79 = module0245.f15834(var63, var78, var67_68);
                            if (module0327.NIL != var79 && var78.eql(module0244.f15780(var67_68))) {
                                for (var66 = module0066.f4838(module0067.f4891(var79)); module0327.NIL == var55 && module0327.NIL == module0066.f4841(var66); var66 = module0066.f4840(var66)) {
                                    var45.resetMultipleValues();
                                    var67 = module0066.f4839(var66);
                                    var80 = var45.secondMultipleValue();
                                    var45.resetMultipleValues();
                                    for (var73_76 = module0066.f4838(module0067.f4891(var80)); module0327.NIL == var55 && module0327.NIL == module0066.f4841(var73_76); var73_76 = module0066.f4840(var73_76)) {
                                        var45.resetMultipleValues();
                                        var69 = module0066.f4839(var73_76);
                                        var81 = var45.secondMultipleValue();
                                        var45.resetMultipleValues();
                                        if (module0327.NIL != module0141.f9279(var69)) {
                                            var71 = var81;
                                            if (module0327.NIL != module0077.f5302(var71)) {
                                                var72 = module0077.f5333(var71);
                                                for (var73 = module0032.f1741(var72), var74 = (SubLObject)module0327.NIL, var74 = module0032.f1742(var73, var72); module0327.NIL == var55 && module0327.NIL == module0032.f1744(var73, var74); var74 = module0032.f1743(var74)) {
                                                    var75 = module0032.f1745(var73, var74);
                                                    if (module0327.NIL != module0032.f1746(var74, var75)) {
                                                        if (module0327.NIL != var47) {
                                                            var55 = (SubLObject)module0327.T;
                                                        }
                                                        else {
                                                            var47 = var75;
                                                            var49 = module0244.f15765(var67_68);
                                                        }
                                                    }
                                                }
                                            }
                                            else if (var71.isList()) {
                                                if (module0327.NIL == var55) {
                                                    var76 = var71;
                                                    var77 = (SubLObject)module0327.NIL;
                                                    var77 = var76.first();
                                                    while (module0327.NIL == var55 && module0327.NIL != var76) {
                                                        if (module0327.NIL != var47) {
                                                            var55 = (SubLObject)module0327.T;
                                                        }
                                                        else {
                                                            var47 = var77;
                                                            var49 = module0244.f15765(var67_68);
                                                        }
                                                        var76 = var76.rest();
                                                        var77 = var76.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)module0327.$ic32$, var71);
                                            }
                                        }
                                    }
                                    module0066.f4842(var73_76);
                                }
                                module0066.f4842(var66);
                            }
                        }
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var62, var45);
                }
            }
        }
        if (module0327.NIL != var55 || module0327.NIL == var47 || module0327.NIL == var48) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var82 = (SubLObject)ConsesLow.list(var49, var47, var44, module0327.$g2465$.getGlobalValue());
        final SubLObject var83 = Hashtables.gethash_without_values(var82, module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
        if (!var83.eql((SubLObject)module0327.$ic33$)) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var84 = (SubLObject)ConsesLow.list(var50, var44, var48, module0327.$g2465$.getGlobalValue());
        final SubLObject var85 = Hashtables.gethash_without_values(var84, module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
        if (!var85.eql((SubLObject)module0327.$ic33$)) {
            return (SubLObject)module0327.NIL;
        }
        SubLObject var86 = var49;
        if (var86.eql((SubLObject)module0327.$ic29$)) {
            var51 = (SubLObject)module0327.$ic25$;
            var52 = var47;
        }
        else if (var86.eql((SubLObject)module0327.$ic26$)) {
            var51 = (SubLObject)module0327.$ic26$;
            var52 = var47;
        }
        var86 = var50;
        if (var86.eql((SubLObject)module0327.$ic29$)) {
            var53 = (SubLObject)module0327.$ic25$;
            var54 = var48;
        }
        else if (var86.eql((SubLObject)module0327.$ic26$)) {
            var53 = (SubLObject)module0327.$ic26$;
            var54 = var48;
        }
        if (module0327.NIL != var52 && module0327.NIL != var54) {
            f22101((SubLObject)module0327.$ic20$, (SubLObject)module0327.$ic26$, var52, var54, module0327.$g2465$.getGlobalValue());
            f22103((SubLObject)module0327.$ic20$, var51, var52, var44, module0327.$g2465$.getGlobalValue());
            f22103((SubLObject)module0327.$ic20$, var53, var44, var54, module0327.$g2465$.getGlobalValue());
        }
        else if (module0327.NIL != var52) {
            f22103((SubLObject)module0327.$ic20$, var51, var52, var44, module0327.$g2465$.getGlobalValue());
        }
        else if (module0327.NIL != var54) {
            f22103((SubLObject)module0327.$ic20$, var53, var44, var54, module0327.$g2465$.getGlobalValue());
        }
        module0142.$g1723$.setGlobalValue(Sequences.remove(var46, module0142.$g1723$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED));
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22123(final SubLObject var93) {
        assert module0327.NIL != Types.symbolp(var93) : var93;
        if (var93.eql((SubLObject)module0327.$ic35$)) {
            return (SubLObject)module0327.$ic21$;
        }
        if (var93.eql((SubLObject)module0327.$ic36$)) {
            return (SubLObject)module0327.$ic29$;
        }
        if (var93.eql((SubLObject)module0327.$ic37$)) {
            return (SubLObject)module0327.$ic30$;
        }
        if (var93.eql((SubLObject)module0327.$ic38$)) {
            return (SubLObject)module0327.$ic26$;
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22122(final SubLObject var53) {
        if (module0327.NIL != module0324.f21916(var53)) {
            f22124(var53);
        }
        else if (module0327.NIL != module0324.f21924(var53)) {
            f22125(var53);
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22124(final SubLObject var29) {
        final SubLThread var30 = SubLProcess.currentSubLThread();
        SubLObject var31 = (SubLObject)module0327.NIL;
        SubLObject var32 = (SubLObject)module0327.NIL;
        SubLObject var33;
        SubLObject var34;
        SubLObject var35;
        SubLObject var37;
        SubLObject var36;
        SubLObject var38;
        SubLObject var39;
        SubLObject var67_96;
        SubLObject var40;
        SubLObject var41;
        SubLObject var61_97;
        SubLObject var42;
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        SubLObject var73_98;
        SubLObject var47;
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var61_98;
        SubLObject var56;
        SubLObject var57;
        SubLObject var58;
        SubLObject var73_99;
        SubLObject var59;
        for (var33 = (SubLObject)module0327.NIL, var34 = (SubLObject)module0327.NIL, var34 = module0137.f8931(); module0327.NIL == var33 && module0327.NIL != var34; var34 = var34.rest()) {
            var35 = var34.first();
            var36 = (var37 = var35);
            var38 = (SubLObject)module0327.NIL;
            var39 = (SubLObject)module0327.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0327.$ic31$);
            var38 = var37.first();
            var37 = (var39 = var37.rest());
            if (module0327.NIL != module0244.f15733(var39)) {
                var67_96 = var39;
                var40 = module0137.$g1605$.currentBinding(var30);
                try {
                    module0137.$g1605$.bind((module0327.NIL != var67_96) ? var67_96 : module0137.$g1605$.getDynamicValue(var30), var30);
                    var41 = module0242.f15664(var29, var67_96);
                    if (module0327.NIL != var41) {
                        for (var61_97 = (SubLObject)module0327.NIL, var61_97 = module0244.f15784(var67_96); module0327.NIL == var33 && module0327.NIL != var61_97; var61_97 = var61_97.rest()) {
                            var42 = var61_97.first();
                            var43 = module0245.f15834(var41, var42, var67_96);
                            if (module0327.NIL != var43 && var42.eql(module0244.f15780(var67_96))) {
                                for (var44 = module0066.f4838(module0067.f4891(var43)); module0327.NIL == var33 && module0327.NIL == module0066.f4841(var44); var44 = module0066.f4840(var44)) {
                                    var30.resetMultipleValues();
                                    var45 = module0066.f4839(var44);
                                    var46 = var30.secondMultipleValue();
                                    var30.resetMultipleValues();
                                    for (var73_98 = module0066.f4838(module0067.f4891(var46)); module0327.NIL == var33 && module0327.NIL == module0066.f4841(var73_98); var73_98 = module0066.f4840(var73_98)) {
                                        var30.resetMultipleValues();
                                        var47 = module0066.f4839(var73_98);
                                        var48 = var30.secondMultipleValue();
                                        var30.resetMultipleValues();
                                        if (module0327.NIL != module0141.f9279(var47)) {
                                            var49 = var48;
                                            if (module0327.NIL != module0077.f5302(var49)) {
                                                var50 = module0077.f5333(var49);
                                                for (var51 = module0032.f1741(var50), var52 = (SubLObject)module0327.NIL, var52 = module0032.f1742(var51, var50); module0327.NIL == var33 && module0327.NIL == module0032.f1744(var51, var52); var52 = module0032.f1743(var52)) {
                                                    var53 = module0032.f1745(var51, var52);
                                                    if (module0327.NIL != module0032.f1746(var52, var53)) {
                                                        var33 = (SubLObject)module0327.T;
                                                    }
                                                }
                                            }
                                            else if (var49.isList()) {
                                                if (module0327.NIL == var33) {
                                                    var54 = var49;
                                                    var55 = (SubLObject)module0327.NIL;
                                                    var55 = var54.first();
                                                    while (module0327.NIL == var33 && module0327.NIL != var54) {
                                                        var33 = (SubLObject)module0327.T;
                                                        var54 = var54.rest();
                                                        var55 = var54.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)module0327.$ic32$, var49);
                                            }
                                        }
                                    }
                                    module0066.f4842(var73_98);
                                }
                                module0066.f4842(var44);
                            }
                        }
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var40, var30);
                }
                var40 = module0137.$g1605$.currentBinding(var30);
                try {
                    module0137.$g1605$.bind((module0327.NIL != var67_96) ? var67_96 : module0137.$g1605$.getDynamicValue(var30), var30);
                    var41 = module0242.f15664(var29, var67_96);
                    if (module0327.NIL != var41) {
                        for (var61_98 = (SubLObject)module0327.NIL, var61_98 = module0244.f15784(var67_96); module0327.NIL == var33 && module0327.NIL != var61_98; var61_98 = var61_98.rest()) {
                            var56 = var61_98.first();
                            var57 = module0245.f15834(var41, var56, var67_96);
                            if (module0327.NIL != var57 && var56.eql(module0244.f15778(var67_96))) {
                                for (var44 = module0066.f4838(module0067.f4891(var57)); module0327.NIL == var33 && module0327.NIL == module0066.f4841(var44); var44 = module0066.f4840(var44)) {
                                    var30.resetMultipleValues();
                                    var45 = module0066.f4839(var44);
                                    var58 = var30.secondMultipleValue();
                                    var30.resetMultipleValues();
                                    for (var73_99 = module0066.f4838(module0067.f4891(var58)); module0327.NIL == var33 && module0327.NIL == module0066.f4841(var73_99); var73_99 = module0066.f4840(var73_99)) {
                                        var30.resetMultipleValues();
                                        var47 = module0066.f4839(var73_99);
                                        var59 = var30.secondMultipleValue();
                                        var30.resetMultipleValues();
                                        if (module0327.NIL != module0141.f9279(var47)) {
                                            var49 = var59;
                                            if (module0327.NIL != module0077.f5302(var49)) {
                                                var50 = module0077.f5333(var49);
                                                for (var51 = module0032.f1741(var50), var52 = (SubLObject)module0327.NIL, var52 = module0032.f1742(var51, var50); module0327.NIL == var33 && module0327.NIL == module0032.f1744(var51, var52); var52 = module0032.f1743(var52)) {
                                                    var53 = module0032.f1745(var51, var52);
                                                    if (module0327.NIL != module0032.f1746(var52, var53)) {
                                                        if (module0327.NIL != var31) {
                                                            var33 = (SubLObject)module0327.T;
                                                        }
                                                        else {
                                                            var31 = var53;
                                                            var32 = module0244.f15765(var67_96);
                                                        }
                                                    }
                                                }
                                            }
                                            else if (var49.isList()) {
                                                if (module0327.NIL == var33) {
                                                    var54 = var49;
                                                    var55 = (SubLObject)module0327.NIL;
                                                    var55 = var54.first();
                                                    while (module0327.NIL == var33 && module0327.NIL != var54) {
                                                        if (module0327.NIL != var31) {
                                                            var33 = (SubLObject)module0327.T;
                                                        }
                                                        else {
                                                            var31 = var55;
                                                            var32 = module0244.f15765(var67_96);
                                                        }
                                                        var54 = var54.rest();
                                                        var55 = var54.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)module0327.$ic32$, var49);
                                            }
                                        }
                                    }
                                    module0066.f4842(var73_99);
                                }
                                module0066.f4842(var44);
                            }
                        }
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var40, var30);
                }
            }
        }
        if (module0327.NIL != var33 || module0327.NIL == var31) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var60 = (SubLObject)ConsesLow.list(var32, var29, var31, module0327.$g2465$.getGlobalValue());
        final SubLObject var61 = Hashtables.gethash_without_values(var60, module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
        if (!var61.equal((SubLObject)module0327.$ic33$)) {
            return (SubLObject)module0327.NIL;
        }
        f22103((SubLObject)module0327.$ic20$, var32, var29, var31, module0327.$g2465$.getGlobalValue());
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22125(final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0327.NIL;
        SubLObject var33 = (SubLObject)module0327.NIL;
        SubLObject var34;
        SubLObject var35;
        SubLObject var36;
        SubLObject var38;
        SubLObject var37;
        SubLObject var39;
        SubLObject var40;
        SubLObject var67_103;
        SubLObject var41;
        SubLObject var42;
        SubLObject var61_104;
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        SubLObject var73_105;
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        SubLObject var52;
        SubLObject var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        SubLObject var61_105;
        SubLObject var57;
        SubLObject var58;
        SubLObject var59;
        SubLObject var73_106;
        SubLObject var60;
        for (var34 = (SubLObject)module0327.NIL, var35 = (SubLObject)module0327.NIL, var35 = module0137.f8931(); module0327.NIL == var34 && module0327.NIL != var35; var35 = var35.rest()) {
            var36 = var35.first();
            var37 = (var38 = var36);
            var39 = (SubLObject)module0327.NIL;
            var40 = (SubLObject)module0327.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0327.$ic31$);
            var39 = var38.first();
            var38 = (var40 = var38.rest());
            if (module0327.NIL != module0244.f15733(var40)) {
                var67_103 = var40;
                var41 = module0137.$g1605$.currentBinding(var31);
                try {
                    module0137.$g1605$.bind((module0327.NIL != var67_103) ? var67_103 : module0137.$g1605$.getDynamicValue(var31), var31);
                    var42 = module0242.f15664(var30, var67_103);
                    if (module0327.NIL != var42) {
                        for (var61_104 = (SubLObject)module0327.NIL, var61_104 = module0244.f15784(var67_103); module0327.NIL == var34 && module0327.NIL != var61_104; var61_104 = var61_104.rest()) {
                            var43 = var61_104.first();
                            var44 = module0245.f15834(var42, var43, var67_103);
                            if (module0327.NIL != var44 && var43.eql(module0244.f15778(var67_103))) {
                                for (var45 = module0066.f4838(module0067.f4891(var44)); module0327.NIL == var34 && module0327.NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                    var31.resetMultipleValues();
                                    var46 = module0066.f4839(var45);
                                    var47 = var31.secondMultipleValue();
                                    var31.resetMultipleValues();
                                    for (var73_105 = module0066.f4838(module0067.f4891(var47)); module0327.NIL == var34 && module0327.NIL == module0066.f4841(var73_105); var73_105 = module0066.f4840(var73_105)) {
                                        var31.resetMultipleValues();
                                        var48 = module0066.f4839(var73_105);
                                        var49 = var31.secondMultipleValue();
                                        var31.resetMultipleValues();
                                        if (module0327.NIL != module0141.f9279(var48)) {
                                            var50 = var49;
                                            if (module0327.NIL != module0077.f5302(var50)) {
                                                var51 = module0077.f5333(var50);
                                                for (var52 = module0032.f1741(var51), var53 = (SubLObject)module0327.NIL, var53 = module0032.f1742(var52, var51); module0327.NIL == var34 && module0327.NIL == module0032.f1744(var52, var53); var53 = module0032.f1743(var53)) {
                                                    var54 = module0032.f1745(var52, var53);
                                                    if (module0327.NIL != module0032.f1746(var53, var54)) {
                                                        var34 = (SubLObject)module0327.T;
                                                    }
                                                }
                                            }
                                            else if (var50.isList()) {
                                                if (module0327.NIL == var34) {
                                                    var55 = var50;
                                                    var56 = (SubLObject)module0327.NIL;
                                                    var56 = var55.first();
                                                    while (module0327.NIL == var34 && module0327.NIL != var55) {
                                                        var34 = (SubLObject)module0327.T;
                                                        var55 = var55.rest();
                                                        var56 = var55.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)module0327.$ic32$, var50);
                                            }
                                        }
                                    }
                                    module0066.f4842(var73_105);
                                }
                                module0066.f4842(var45);
                            }
                        }
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var41, var31);
                }
                var41 = module0137.$g1605$.currentBinding(var31);
                try {
                    module0137.$g1605$.bind((module0327.NIL != var67_103) ? var67_103 : module0137.$g1605$.getDynamicValue(var31), var31);
                    var42 = module0242.f15664(var30, var67_103);
                    if (module0327.NIL != var42) {
                        for (var61_105 = (SubLObject)module0327.NIL, var61_105 = module0244.f15784(var67_103); module0327.NIL == var34 && module0327.NIL != var61_105; var61_105 = var61_105.rest()) {
                            var57 = var61_105.first();
                            var58 = module0245.f15834(var42, var57, var67_103);
                            if (module0327.NIL != var58 && var57.eql(module0244.f15780(var67_103))) {
                                for (var45 = module0066.f4838(module0067.f4891(var58)); module0327.NIL == var34 && module0327.NIL == module0066.f4841(var45); var45 = module0066.f4840(var45)) {
                                    var31.resetMultipleValues();
                                    var46 = module0066.f4839(var45);
                                    var59 = var31.secondMultipleValue();
                                    var31.resetMultipleValues();
                                    for (var73_106 = module0066.f4838(module0067.f4891(var59)); module0327.NIL == var34 && module0327.NIL == module0066.f4841(var73_106); var73_106 = module0066.f4840(var73_106)) {
                                        var31.resetMultipleValues();
                                        var48 = module0066.f4839(var73_106);
                                        var60 = var31.secondMultipleValue();
                                        var31.resetMultipleValues();
                                        if (module0327.NIL != module0141.f9279(var48)) {
                                            var50 = var60;
                                            if (module0327.NIL != module0077.f5302(var50)) {
                                                var51 = module0077.f5333(var50);
                                                for (var52 = module0032.f1741(var51), var53 = (SubLObject)module0327.NIL, var53 = module0032.f1742(var52, var51); module0327.NIL == var34 && module0327.NIL == module0032.f1744(var52, var53); var53 = module0032.f1743(var53)) {
                                                    var54 = module0032.f1745(var52, var53);
                                                    if (module0327.NIL != module0032.f1746(var53, var54)) {
                                                        if (module0327.NIL != var32) {
                                                            var34 = (SubLObject)module0327.T;
                                                        }
                                                        else {
                                                            var32 = var54;
                                                            var33 = module0244.f15765(var67_103);
                                                        }
                                                    }
                                                }
                                            }
                                            else if (var50.isList()) {
                                                if (module0327.NIL == var34) {
                                                    var55 = var50;
                                                    var56 = (SubLObject)module0327.NIL;
                                                    var56 = var55.first();
                                                    while (module0327.NIL == var34 && module0327.NIL != var55) {
                                                        if (module0327.NIL != var32) {
                                                            var34 = (SubLObject)module0327.T;
                                                        }
                                                        else {
                                                            var32 = var56;
                                                            var33 = module0244.f15765(var67_103);
                                                        }
                                                        var55 = var55.rest();
                                                        var56 = var55.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)module0327.$ic32$, var50);
                                            }
                                        }
                                    }
                                    module0066.f4842(var73_106);
                                }
                                module0066.f4842(var45);
                            }
                        }
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var41, var31);
                }
            }
        }
        if (module0327.NIL != var34 || module0327.NIL == var32) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var61 = (SubLObject)ConsesLow.list(var33, var32, var30, module0327.$g2465$.getGlobalValue());
        final SubLObject var62 = Hashtables.gethash_without_values(var61, module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
        if (!var62.equal((SubLObject)module0327.$ic33$)) {
            return (SubLObject)module0327.NIL;
        }
        f22103((SubLObject)module0327.$ic20$, var33, var32, var30, module0327.$g2465$.getGlobalValue());
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22097(final SubLObject var25, final SubLObject var21, final SubLObject var9) {
        if (module0327.NIL == module0325.f22000(var21.first())) {
            final SubLObject var26 = module0325.f21988(var21);
            if (module0327.NIL != module0035.f1997(var26)) {
                f22096(var25, var26, var9);
            }
            else {
                f22126(var25, var26, var9);
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22099(final SubLObject var25, final SubLObject var21, final SubLObject var9) {
        final SubLObject var26 = module0325.f21988(var21);
        if (module0327.NIL != module0035.f1997(var26)) {
            f22098(var25, var26, var9);
        }
        else {
            f22127(var25, var26, var9);
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22126(final SubLObject var25, final SubLObject var108, final SubLObject var9) {
        final SubLObject var109 = (SubLObject)ConsesLow.list(var108, var9);
        if (module0327.NIL != f22128(var109)) {
            f22129(var25, var109);
        }
        else {
            f22129(var25, var109);
            f22130(var109);
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22127(final SubLObject var25, final SubLObject var108, final SubLObject var9) {
        f22131(var25, (SubLObject)ConsesLow.list(var108, var9));
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22128(final SubLObject var109) {
        return f22117(var109, module0142.$g1721$.getGlobalValue());
    }
    
    public static SubLObject f22129(final SubLObject var25, final SubLObject var109) {
        f22118(var25, var109, module0142.$g1721$.getGlobalValue());
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22131(final SubLObject var25, final SubLObject var109) {
        SubLObject var110 = Hashtables.gethash_without_values(var109, module0142.$g1721$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
        SubLObject var111;
        var110 = (var111 = Sequences.remove(var25, var110, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED));
        SubLObject var112 = (SubLObject)module0327.NIL;
        var112 = var111.first();
        while (module0327.NIL != var111) {
            if (module0327.NIL == module0178.f11361(var112, (SubLObject)module0327.UNPROVIDED)) {
                var110 = Sequences.remove(var112, var110, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
            }
            var111 = var111.rest();
            var112 = var111.first();
        }
        if (module0327.NIL != var110) {
            Hashtables.sethash(var109, module0142.$g1721$.getGlobalValue(), var110);
        }
        else {
            Hashtables.remhash(var109, module0142.$g1721$.getGlobalValue());
            f22132(var109);
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22130(final SubLObject var109) {
        final SubLObject var110 = var109.first();
        SubLObject var111 = (SubLObject)module0327.NIL;
        SubLObject var112 = var110;
        SubLObject var113 = (SubLObject)module0327.NIL;
        var113 = var112.first();
        while (module0327.NIL != var112) {
            final SubLObject var114 = f22100(conses_high.second(var113));
            final SubLObject var115 = f22100(conses_high.third(var113));
            SubLObject var116 = var114;
            if (module0327.NIL == conses_high.member(var116, var111, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                var111 = (SubLObject)ConsesLow.cons(var116, var111);
            }
            var116 = var115;
            if (module0327.NIL == conses_high.member(var116, var111, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                var111 = (SubLObject)ConsesLow.cons(var116, var111);
            }
            var112 = var112.rest();
            var113 = var112.first();
        }
        var112 = var111;
        SubLObject var117 = (SubLObject)module0327.NIL;
        var117 = var112.first();
        while (module0327.NIL != var112) {
            f22133(var109, var117);
            var112 = var112.rest();
            var117 = var112.first();
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22132(final SubLObject var109) {
        final SubLObject var110 = var109.first();
        SubLObject var111 = (SubLObject)module0327.NIL;
        SubLObject var112 = var110;
        SubLObject var113 = (SubLObject)module0327.NIL;
        var113 = var112.first();
        while (module0327.NIL != var112) {
            final SubLObject var114 = f22102(conses_high.second(var113));
            final SubLObject var115 = f22102(conses_high.third(var113));
            if (module0327.NIL != var114) {
                final SubLObject var116 = var114;
                if (module0327.NIL == conses_high.member(var116, var111, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                    var111 = (SubLObject)ConsesLow.cons(var116, var111);
                }
            }
            if (module0327.NIL != var115) {
                final SubLObject var116 = var115;
                if (module0327.NIL == conses_high.member(var116, var111, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                    var111 = (SubLObject)ConsesLow.cons(var116, var111);
                }
            }
            var112 = var112.rest();
            var113 = var112.first();
        }
        var112 = var111;
        SubLObject var117 = (SubLObject)module0327.NIL;
        var117 = var112.first();
        while (module0327.NIL != var112) {
            f22134(var109, var117);
            var112 = var112.rest();
            var117 = var112.first();
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22133(final SubLObject var25, final SubLObject var53) {
        f22118(var25, var53, module0142.$g1722$.getGlobalValue());
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22134(final SubLObject var25, final SubLObject var53) {
        SubLObject var54 = Hashtables.gethash_without_values(var53, module0142.$g1722$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
        var54 = Sequences.remove(var25, var54, Symbols.symbol_function((SubLObject)module0327.EQUAL), (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED, (SubLObject)module0327.UNPROVIDED);
        if (module0327.NIL != var54) {
            Hashtables.sethash(var53, module0142.$g1722$.getGlobalValue(), var54);
        }
        else {
            Hashtables.remhash(var53, module0142.$g1722$.getGlobalValue());
            f22119(var53);
            f22120(var53);
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22135(final SubLObject var114) {
        final SubLThread var115 = SubLProcess.currentSubLThread();
        assert module0327.NIL != module0173.f10955(var114) : var114;
        if (module0327.NIL != module0324.f21942(var114)) {
            final SubLObject var116 = module0324.f21936(var114);
            final SubLObject var117 = module0324.f21937(var114);
            if (module0327.NIL == module0004.f104(var116, module0142.$g1726$.getDynamicValue(var115), Symbols.symbol_function((SubLObject)module0327.EQL), (SubLObject)module0327.UNPROVIDED)) {
                final SubLObject var118 = module0142.$g1726$.currentBinding(var115);
                try {
                    module0142.$g1726$.bind((SubLObject)ConsesLow.cons(var116, module0142.$g1726$.getDynamicValue(var115)), var115);
                    SubLObject var120;
                    final SubLObject var119 = var120 = f22136(var116);
                    SubLObject var121 = (SubLObject)module0327.NIL;
                    var121 = var120.first();
                    while (module0327.NIL != var120) {
                        f22094((SubLObject)module0327.NIL, var121, (SubLObject)module0327.NIL);
                        var120 = var120.rest();
                        var121 = var120.first();
                    }
                }
                finally {
                    module0142.$g1726$.rebind(var118, var115);
                }
            }
            module0324.f21938(var114, var116);
            if (module0327.NIL == module0004.f104(var117, module0142.$g1726$.getDynamicValue(var115), Symbols.symbol_function((SubLObject)module0327.EQL), (SubLObject)module0327.UNPROVIDED)) {
                final SubLObject var118 = module0142.$g1726$.currentBinding(var115);
                try {
                    module0142.$g1726$.bind((SubLObject)ConsesLow.cons(var117, module0142.$g1726$.getDynamicValue(var115)), var115);
                    SubLObject var120;
                    final SubLObject var119 = var120 = f22136(var117);
                    SubLObject var121 = (SubLObject)module0327.NIL;
                    var121 = var120.first();
                    while (module0327.NIL != var120) {
                        f22094((SubLObject)module0327.NIL, var121, (SubLObject)module0327.NIL);
                        var120 = var120.rest();
                        var121 = var120.first();
                    }
                }
                finally {
                    module0142.$g1726$.rebind(var118, var115);
                }
            }
            module0324.f21940(var114, var117);
        }
        SubLObject var122 = module0137.f8931();
        SubLObject var123 = (SubLObject)module0327.NIL;
        var123 = var122.first();
        while (module0327.NIL != var122) {
            SubLObject var125;
            final SubLObject var124 = var125 = var123;
            SubLObject var126 = (SubLObject)module0327.NIL;
            SubLObject var127 = (SubLObject)module0327.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var125, var124, (SubLObject)module0327.$ic31$);
            var126 = var125.first();
            var125 = (var127 = var125.rest());
            if (module0327.NIL != module0244.f15733(var127)) {
                final SubLObject var67_120 = var127;
                final SubLObject var128 = module0137.f8917(var67_120);
                final SubLObject var129 = module0147.$g2094$.currentBinding(var115);
                final SubLObject var130 = module0147.$g2095$.currentBinding(var115);
                try {
                    module0147.$g2094$.bind((SubLObject)module0327.$ic40$, var115);
                    module0147.$g2095$.bind(module0327.$ic41$, var115);
                    SubLObject var131 = var128;
                    if (module0327.NIL != module0158.f10010(var114, (SubLObject)module0327.ONE_INTEGER, var131)) {
                        final SubLObject var132 = module0158.f10011(var114, (SubLObject)module0327.ONE_INTEGER, var131);
                        SubLObject var133 = (SubLObject)module0327.NIL;
                        final SubLObject var134 = (SubLObject)module0327.NIL;
                        while (module0327.NIL == var133) {
                            final SubLObject var135 = module0052.f3695(var132, var134);
                            final SubLObject var136 = (SubLObject)SubLObjectFactory.makeBoolean(!var134.eql(var135));
                            if (module0327.NIL != var136) {
                                SubLObject var137 = (SubLObject)module0327.NIL;
                                try {
                                    var137 = module0158.f10316(var135, (SubLObject)module0327.$ic42$, (SubLObject)module0327.NIL, (SubLObject)module0327.NIL);
                                    SubLObject var123_128 = (SubLObject)module0327.NIL;
                                    final SubLObject var124_129 = (SubLObject)module0327.NIL;
                                    while (module0327.NIL == var123_128) {
                                        final SubLObject var138 = module0052.f3695(var137, var124_129);
                                        final SubLObject var126_130 = (SubLObject)SubLObjectFactory.makeBoolean(!var124_129.eql(var138));
                                        if (module0327.NIL != var126_130) {
                                            f22094((SubLObject)module0327.NIL, var138, (SubLObject)module0327.NIL);
                                        }
                                        var123_128 = (SubLObject)SubLObjectFactory.makeBoolean(module0327.NIL == var126_130);
                                    }
                                }
                                finally {
                                    final SubLObject var5_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var115);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0327.T, var115);
                                        if (module0327.NIL != var137) {
                                            module0158.f10319(var137);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var5_131, var115);
                                    }
                                }
                            }
                            var133 = (SubLObject)SubLObjectFactory.makeBoolean(module0327.NIL == var136);
                        }
                    }
                    var131 = var128;
                    if (module0327.NIL != module0158.f10010(var114, (SubLObject)module0327.TWO_INTEGER, var131)) {
                        final SubLObject var132 = module0158.f10011(var114, (SubLObject)module0327.TWO_INTEGER, var131);
                        SubLObject var133 = (SubLObject)module0327.NIL;
                        final SubLObject var134 = (SubLObject)module0327.NIL;
                        while (module0327.NIL == var133) {
                            final SubLObject var135 = module0052.f3695(var132, var134);
                            final SubLObject var136 = (SubLObject)SubLObjectFactory.makeBoolean(!var134.eql(var135));
                            if (module0327.NIL != var136) {
                                SubLObject var137 = (SubLObject)module0327.NIL;
                                try {
                                    var137 = module0158.f10316(var135, (SubLObject)module0327.$ic42$, (SubLObject)module0327.NIL, (SubLObject)module0327.NIL);
                                    SubLObject var123_129 = (SubLObject)module0327.NIL;
                                    final SubLObject var124_130 = (SubLObject)module0327.NIL;
                                    while (module0327.NIL == var123_129) {
                                        final SubLObject var138 = module0052.f3695(var137, var124_130);
                                        final SubLObject var126_131 = (SubLObject)SubLObjectFactory.makeBoolean(!var124_130.eql(var138));
                                        if (module0327.NIL != var126_131) {
                                            f22094((SubLObject)module0327.NIL, var138, (SubLObject)module0327.NIL);
                                        }
                                        var123_129 = (SubLObject)SubLObjectFactory.makeBoolean(module0327.NIL == var126_131);
                                    }
                                }
                                finally {
                                    final SubLObject var5_132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var115);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0327.T, var115);
                                        if (module0327.NIL != var137) {
                                            module0158.f10319(var137);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var5_132, var115);
                                    }
                                }
                            }
                            var133 = (SubLObject)SubLObjectFactory.makeBoolean(module0327.NIL == var136);
                        }
                    }
                }
                finally {
                    module0147.$g2095$.rebind(var130, var115);
                    module0147.$g2094$.rebind(var129, var115);
                }
            }
            var122 = var122.rest();
            var123 = var122.first();
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22136(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        final SubLObject var46 = Hashtables.gethash_without_values(var44, module0142.$g1722$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
        SubLObject var47 = (SubLObject)module0327.NIL;
        SubLObject var48 = module0137.f8931();
        SubLObject var49 = (SubLObject)module0327.NIL;
        var49 = var48.first();
        while (module0327.NIL != var48) {
            SubLObject var51;
            final SubLObject var50 = var51 = var49;
            SubLObject var52 = (SubLObject)module0327.NIL;
            SubLObject var53 = (SubLObject)module0327.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var51, var50, (SubLObject)module0327.$ic31$);
            var52 = var51.first();
            var51 = (var53 = var51.rest());
            if (module0327.NIL != module0244.f15733(var53)) {
                final SubLObject var67_139 = var53;
                final SubLObject var54 = module0244.f15765(var67_139);
                SubLObject var55 = module0137.$g1605$.currentBinding(var45);
                try {
                    module0137.$g1605$.bind((module0327.NIL != var67_139) ? var67_139 : module0137.$g1605$.getDynamicValue(var45), var45);
                    final SubLObject var56 = module0242.f15664(var44, var67_139);
                    if (module0327.NIL != var56) {
                        SubLObject var27_141 = module0244.f15784(var67_139);
                        SubLObject var57 = (SubLObject)module0327.NIL;
                        var57 = var27_141.first();
                        while (module0327.NIL != var27_141) {
                            final SubLObject var58 = module0245.f15834(var56, var57, var67_139);
                            if (module0327.NIL != var58 && var57.eql(module0244.f15778(var67_139))) {
                                SubLObject var59;
                                for (var59 = module0066.f4838(module0067.f4891(var58)); module0327.NIL == module0066.f4841(var59); var59 = module0066.f4840(var59)) {
                                    var45.resetMultipleValues();
                                    final SubLObject var60 = module0066.f4839(var59);
                                    final SubLObject var61 = var45.secondMultipleValue();
                                    var45.resetMultipleValues();
                                    SubLObject var73_142;
                                    for (var73_142 = module0066.f4838(module0067.f4891(var61)); module0327.NIL == module0066.f4841(var73_142); var73_142 = module0066.f4840(var73_142)) {
                                        var45.resetMultipleValues();
                                        final SubLObject var62 = module0066.f4839(var73_142);
                                        final SubLObject var63 = var45.secondMultipleValue();
                                        var45.resetMultipleValues();
                                        if (module0327.NIL != module0141.f9279(var62)) {
                                            final SubLObject var64 = var63;
                                            if (module0327.NIL != module0077.f5302(var64)) {
                                                final SubLObject var65 = module0077.f5333(var64);
                                                SubLObject var66;
                                                SubLObject var67;
                                                SubLObject var68;
                                                SubLObject var27_142;
                                                SubLObject var69;
                                                SubLObject var70;
                                                SubLObject var71;
                                                for (var66 = module0032.f1741(var65), var67 = (SubLObject)module0327.NIL, var67 = module0032.f1742(var66, var65); module0327.NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                    var68 = module0032.f1745(var66, var67);
                                                    if (module0327.NIL != module0032.f1746(var67, var68)) {
                                                        var69 = (var27_142 = Hashtables.gethash_without_values((SubLObject)ConsesLow.list(var54, var44, var68, var60), module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED));
                                                        var70 = (SubLObject)module0327.NIL;
                                                        var70 = var27_142.first();
                                                        while (module0327.NIL != var27_142) {
                                                            if (module0327.NIL != module0178.f11361(var70, (SubLObject)module0327.UNPROVIDED)) {
                                                                var71 = var70;
                                                                if (module0327.NIL == conses_high.member(var71, var47, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                                                                    var47 = (SubLObject)ConsesLow.cons(var71, var47);
                                                                }
                                                            }
                                                            var27_142 = var27_142.rest();
                                                            var70 = var27_142.first();
                                                        }
                                                    }
                                                }
                                            }
                                            else if (var64.isList()) {
                                                SubLObject var72 = var64;
                                                SubLObject var73 = (SubLObject)module0327.NIL;
                                                var73 = var72.first();
                                                while (module0327.NIL != var72) {
                                                    SubLObject var27_143;
                                                    final SubLObject var74 = var27_143 = Hashtables.gethash_without_values((SubLObject)ConsesLow.list(var54, var44, var73, var60), module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
                                                    SubLObject var75 = (SubLObject)module0327.NIL;
                                                    var75 = var27_143.first();
                                                    while (module0327.NIL != var27_143) {
                                                        if (module0327.NIL != module0178.f11361(var75, (SubLObject)module0327.UNPROVIDED)) {
                                                            final SubLObject var76 = var75;
                                                            if (module0327.NIL == conses_high.member(var76, var47, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                                                                var47 = (SubLObject)ConsesLow.cons(var76, var47);
                                                            }
                                                        }
                                                        var27_143 = var27_143.rest();
                                                        var75 = var27_143.first();
                                                    }
                                                    var72 = var72.rest();
                                                    var73 = var72.first();
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)module0327.$ic32$, var64);
                                            }
                                        }
                                    }
                                    module0066.f4842(var73_142);
                                }
                                module0066.f4842(var59);
                            }
                            var27_141 = var27_141.rest();
                            var57 = var27_141.first();
                        }
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var55, var45);
                }
                var55 = module0137.$g1605$.currentBinding(var45);
                try {
                    module0137.$g1605$.bind((module0327.NIL != var67_139) ? var67_139 : module0137.$g1605$.getDynamicValue(var45), var45);
                    final SubLObject var56 = module0242.f15664(var44, var67_139);
                    if (module0327.NIL != var56) {
                        SubLObject var27_144 = module0244.f15784(var67_139);
                        SubLObject var77 = (SubLObject)module0327.NIL;
                        var77 = var27_144.first();
                        while (module0327.NIL != var27_144) {
                            final SubLObject var78 = module0245.f15834(var56, var77, var67_139);
                            if (module0327.NIL != var78 && var77.eql(module0244.f15780(var67_139))) {
                                SubLObject var59;
                                for (var59 = module0066.f4838(module0067.f4891(var78)); module0327.NIL == module0066.f4841(var59); var59 = module0066.f4840(var59)) {
                                    var45.resetMultipleValues();
                                    final SubLObject var60 = module0066.f4839(var59);
                                    final SubLObject var79 = var45.secondMultipleValue();
                                    var45.resetMultipleValues();
                                    SubLObject var73_143;
                                    for (var73_143 = module0066.f4838(module0067.f4891(var79)); module0327.NIL == module0066.f4841(var73_143); var73_143 = module0066.f4840(var73_143)) {
                                        var45.resetMultipleValues();
                                        final SubLObject var62 = module0066.f4839(var73_143);
                                        final SubLObject var80 = var45.secondMultipleValue();
                                        var45.resetMultipleValues();
                                        if (module0327.NIL != module0141.f9279(var62)) {
                                            final SubLObject var64 = var80;
                                            if (module0327.NIL != module0077.f5302(var64)) {
                                                final SubLObject var65 = module0077.f5333(var64);
                                                SubLObject var66;
                                                SubLObject var67;
                                                SubLObject var69;
                                                SubLObject var70;
                                                SubLObject var71;
                                                SubLObject var81;
                                                SubLObject var27_145;
                                                for (var66 = module0032.f1741(var65), var67 = (SubLObject)module0327.NIL, var67 = module0032.f1742(var66, var65); module0327.NIL == module0032.f1744(var66, var67); var67 = module0032.f1743(var67)) {
                                                    var81 = module0032.f1745(var66, var67);
                                                    if (module0327.NIL != module0032.f1746(var67, var81)) {
                                                        var69 = (var27_145 = Hashtables.gethash_without_values((SubLObject)ConsesLow.list(var54, var81, var44, var60), module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED));
                                                        var70 = (SubLObject)module0327.NIL;
                                                        var70 = var27_145.first();
                                                        while (module0327.NIL != var27_145) {
                                                            if (module0327.NIL != module0178.f11361(var70, (SubLObject)module0327.UNPROVIDED)) {
                                                                var71 = var70;
                                                                if (module0327.NIL == conses_high.member(var71, var47, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                                                                    var47 = (SubLObject)ConsesLow.cons(var71, var47);
                                                                }
                                                            }
                                                            var27_145 = var27_145.rest();
                                                            var70 = var27_145.first();
                                                        }
                                                    }
                                                }
                                            }
                                            else if (var64.isList()) {
                                                SubLObject var72 = var64;
                                                SubLObject var82 = (SubLObject)module0327.NIL;
                                                var82 = var72.first();
                                                while (module0327.NIL != var72) {
                                                    SubLObject var27_146;
                                                    final SubLObject var74 = var27_146 = Hashtables.gethash_without_values((SubLObject)ConsesLow.list(var54, var82, var44, var60), module0142.$g1720$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
                                                    SubLObject var75 = (SubLObject)module0327.NIL;
                                                    var75 = var27_146.first();
                                                    while (module0327.NIL != var27_146) {
                                                        if (module0327.NIL != module0178.f11361(var75, (SubLObject)module0327.UNPROVIDED)) {
                                                            final SubLObject var76 = var75;
                                                            if (module0327.NIL == conses_high.member(var76, var47, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                                                                var47 = (SubLObject)ConsesLow.cons(var76, var47);
                                                            }
                                                        }
                                                        var27_146 = var27_146.rest();
                                                        var75 = var27_146.first();
                                                    }
                                                    var72 = var72.rest();
                                                    var82 = var72.first();
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)module0327.$ic32$, var64);
                                            }
                                        }
                                    }
                                    module0066.f4842(var73_143);
                                }
                                module0066.f4842(var59);
                            }
                            var27_144 = var27_144.rest();
                            var77 = var27_144.first();
                        }
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var55, var45);
                }
            }
            var48 = var48.rest();
            var49 = var48.first();
        }
        var48 = var46;
        SubLObject var83 = (SubLObject)module0327.NIL;
        var83 = var48.first();
        while (module0327.NIL != var48) {
            SubLObject var27_147;
            final SubLObject var84 = var27_147 = Hashtables.gethash_without_values(var83, module0142.$g1721$.getGlobalValue(), (SubLObject)module0327.UNPROVIDED);
            SubLObject var85 = (SubLObject)module0327.NIL;
            var85 = var27_147.first();
            while (module0327.NIL != var27_147) {
                if (module0327.NIL != module0178.f11361(var85, (SubLObject)module0327.UNPROVIDED)) {
                    final SubLObject var86 = var85;
                    if (module0327.NIL == conses_high.member(var86, var47, Symbols.symbol_function((SubLObject)module0327.EQL), Symbols.symbol_function((SubLObject)module0327.IDENTITY))) {
                        var47 = (SubLObject)ConsesLow.cons(var86, var47);
                    }
                }
                var27_147 = var27_147.rest();
                var85 = var27_147.first();
            }
            var48 = var48.rest();
            var83 = var48.first();
        }
        return var47;
    }
    
    public static SubLObject f22091(final SubLObject var10, final SubLObject var11, final SubLObject var12, final SubLObject var8, final SubLObject var9, SubLObject var151) {
        if (var151 == module0327.UNPROVIDED) {
            var151 = (SubLObject)module0327.NIL;
        }
        final SubLThread var152 = SubLProcess.currentSubLThread();
        if (module0327.NIL == module0324.f21953(var10, var11, var12)) {
            return (SubLObject)module0327.NIL;
        }
        final SubLObject var153 = module0172.f10930(module0538.f33483((SubLObject)ConsesLow.list(var10, var11, var12)));
        final SubLObject var154 = module0130.f8518(var8);
        if (module0327.NIL == module0018.$g672$.getDynamicValue(var152)) {
            Errors.warn((SubLObject)module0327.$ic43$, var153, var154, var9);
            if (module0327.NIL == module0018.$g673$.getDynamicValue(var152)) {
                final SubLObject var155 = module0142.$g1718$.currentBinding(var152);
                try {
                    module0142.$g1718$.bind((SubLObject)module0327.NIL, var152);
                    final SubLObject var156 = module0325.f22015(var10, var11, var12, module0130.f8517(var8), var9);
                    f22137((SubLObject)module0327.$ic44$, var153, var154, var9, var156);
                }
                finally {
                    module0142.$g1718$.rebind(var155, var152);
                }
                module0334.$g2842$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var153, var9, var154, var151), module0334.$g2842$.getGlobalValue()));
                module0334.$g2843$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var153, var9, var154, var151), module0334.$g2843$.getGlobalValue()));
            }
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22137(final SubLObject var154, final SubLObject var152, final SubLObject var7, final SubLObject var9, SubLObject var50) {
        if (var50 == module0327.UNPROVIDED) {
            var50 = (SubLObject)module0327.NIL;
        }
        final SubLObject var155 = Sequences.cconcatenate(var154, (SubLObject)module0327.$ic45$);
        if (module0327.NIL != module0593.f36269()) {
            final SubLObject var156 = module0593.f36290();
            if (var156.eql((SubLObject)module0327.$ic46$)) {
                Errors.warn(var155, new SubLObject[] { var152, var7, var9, var50 });
            }
            else if (var156.eql((SubLObject)module0327.$ic47$)) {
                module0018.$g679$.setGlobalValue(var50);
                Errors.error(var154, var152, var7, var9);
            }
            else if (var156.eql((SubLObject)module0327.$ic48$)) {
                Errors.cerror((SubLObject)module0327.$ic49$, var155, new SubLObject[] { var152, var7, var9, var50 });
            }
        }
        else {
            Errors.cerror((SubLObject)module0327.$ic49$, var155, new SubLObject[] { var152, var7, var9, var50 });
        }
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22138() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22089", "ADD-TEMPORAL-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22093", "S#18659", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22094", "REMOVE-TEMPORAL-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22090", "S#24682", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22092", "S#24683", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22095", "S#24684", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22096", "S#24685", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22098", "S#24686", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22100", "S#24580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22102", "S#24581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22105", "S#24687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22108", "S#24688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22107", "S#24689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22109", "S#24690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22104", "S#24691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22106", "S#24692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22111", "S#24693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22110", "S#24694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22101", "S#18655", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22103", "S#24568", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22112", "S#24695", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22113", "S#24696", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22114", "S#24697", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22117", "S#24698", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22115", "S#24699", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22118", "S#24700", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22116", "S#24701", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22120", "S#24702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22119", "S#24703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22121", "S#24704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22123", "S#24705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22122", "S#24706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22124", "S#24707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22125", "S#24708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22097", "S#24709", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22099", "S#24710", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22126", "S#24711", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22127", "S#24712", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22128", "S#24713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22129", "S#24714", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22131", "S#24715", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22130", "S#24716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22132", "S#24717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22133", "S#24718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22134", "S#24719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22135", "S#13555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22136", "S#24720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22091", "S#24721", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0327", "f22137", "S#24722", 4, 1, false);
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22139() {
        module0327.$g2465$ = SubLFiles.deflexical("S#24723", (module0327.NIL != Symbols.boundp((SubLObject)module0327.$ic0$)) ? module0327.$g2465$.getGlobalValue() : module0327.$ic1$);
        module0327.$g2841$ = SubLFiles.deflexical("S#24724", (module0327.NIL != Symbols.boundp((SubLObject)module0327.$ic2$)) ? module0327.$g2841$.getGlobalValue() : module0327.$ic1$);
        return (SubLObject)module0327.NIL;
    }
    
    public static SubLObject f22140() {
        module0003.f57((SubLObject)module0327.$ic0$);
        module0132.f8593((SubLObject)module0327.$ic0$, (SubLObject)module0327.NIL);
        module0003.f57((SubLObject)module0327.$ic2$);
        module0132.f8593((SubLObject)module0327.$ic2$, module0327.$ic3$);
        module0012.f416((SubLObject)module0327.$ic11$);
        module0012.f416((SubLObject)module0327.$ic14$);
        return (SubLObject)module0327.NIL;
    }
    
    public void declareFunctions() {
        f22138();
    }
    
    public void initializeVariables() {
        f22139();
    }
    
    public void runTopLevelForms() {
        f22140();
    }
    
    static {
        me = (SubLFile)new module0327();
        module0327.$g2465$ = null;
        module0327.$g2841$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#24723", "CYC");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#24724", "CYC");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HL-StartFn"));
        $ic4$ = SubLObjectFactory.makeSymbol("S#3302", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic6$ = SubLObjectFactory.makeString("skip subsumption op");
        $ic7$ = SubLObjectFactory.makeString("~s is not a sbhl-time-predicate-p");
        $ic8$ = SubLObjectFactory.makeString("~s is not a sbhl-time-arg-p");
        $ic9$ = SubLObjectFactory.makeString("gaf is effectively date-date assertion: ~s ~a ~a~%");
        $ic10$ = SubLObjectFactory.makeKeyword("ADD");
        $ic11$ = SubLObjectFactory.makeSymbol("ADD-TEMPORAL-RELATION");
        $ic12$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic13$ = SubLObjectFactory.makeString("[sbhl :genls] skipping remove op; assertion still there: ~%~s");
        $ic14$ = SubLObjectFactory.makeSymbol("REMOVE-TEMPORAL-RELATION");
        $ic15$ = SubLObjectFactory.makeKeyword("CONJUNCTION-FN");
        $ic16$ = SubLObjectFactory.makeKeyword("POS");
        $ic17$ = SubLObjectFactory.makeKeyword("NEG");
        $ic18$ = SubLObjectFactory.makeKeyword("START");
        $ic19$ = SubLObjectFactory.makeKeyword("END");
        $ic20$ = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $ic21$ = SubLObjectFactory.makeKeyword("WEAK");
        $ic22$ = SubLObjectFactory.makeKeyword("BEGINNING-OF-TIME");
        $ic23$ = SubLObjectFactory.makeKeyword("END-OF-TIME");
        $ic24$ = SubLObjectFactory.makeSymbol("S#5051", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("SUCCESSOR");
        $ic26$ = SubLObjectFactory.makeKeyword("SUCCESSOR-STRICT");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WEAK"), (SubLObject)SubLObjectFactory.makeKeyword("STRICT"), (SubLObject)SubLObjectFactory.makeKeyword("WEAK-SUCCESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSOR-STRICT"));
        $ic28$ = SubLObjectFactory.makeKeyword("COORDINATE");
        $ic29$ = SubLObjectFactory.makeKeyword("STRICT");
        $ic30$ = SubLObjectFactory.makeKeyword("WEAK-SUCCESSOR");
        $ic31$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3165895"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#12F0EC7"));
        $ic32$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFINITIONAL"));
        $ic34$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic35$ = SubLObjectFactory.makeSymbol("<=");
        $ic36$ = SubLObjectFactory.makeSymbol("<");
        $ic37$ = SubLObjectFactory.makeSymbol("S#24725", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#24726", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic40$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic42$ = SubLObjectFactory.makeKeyword("GAF");
        $ic43$ = SubLObjectFactory.makeString("sbhl conflict: ~s ~a ~a~%");
        $ic44$ = SubLObjectFactory.makeString("sbhl conflict: ~s ~a ~a~%      because:");
        $ic45$ = SubLObjectFactory.makeString(" ~a");
        $ic46$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic47$ = SubLObjectFactory.makeKeyword("HALT");
        $ic48$ = SubLObjectFactory.makeKeyword("DEBUG");
        $ic49$ = SubLObjectFactory.makeString("leave the kb inconsistent for now and resolve the conflict later");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0327.class
	Total time: 886 ms
	
	Decompiled with Procyon 0.5.32.
*/