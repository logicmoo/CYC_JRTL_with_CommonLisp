package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0326 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0326";
    public static final String myFingerPrint = "f39d09fe1c57884624e0b1db18a5de7cd9482db8897add074285e2e549297d09";
    private static SubLSymbol $g2840$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    
    public static SubLObject f22023(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (var3.eql((SubLObject)module0326.$ic0$)) {
            final SubLObject var6 = module0137.$g1605$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var5);
                module0248.f15956(var1, var4, var2, module0326.$ic2$);
            }
            finally {
                module0137.$g1605$.rebind(var6, var5);
            }
        }
        else if (var3.eql((SubLObject)module0326.$ic3$)) {
            final SubLObject var6 = module0137.$g1605$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic4$), var5);
                module0248.f15956(var1, var4, var2, module0326.$ic2$);
            }
            finally {
                module0137.$g1605$.rebind(var6, var5);
            }
        }
        else if (var3.eql((SubLObject)module0326.$ic5$)) {
            final SubLObject var6 = module0137.$g1605$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic6$), var5);
                module0248.f15956(var1, var4, var2, module0326.$ic2$);
            }
            finally {
                module0137.$g1605$.rebind(var6, var5);
            }
        }
        else if (var3.eql((SubLObject)module0326.$ic7$)) {
            final SubLObject var6 = module0137.$g1605$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic8$), var5);
                module0248.f15956(var1, var4, var2, module0326.$ic2$);
            }
            finally {
                module0137.$g1605$.rebind(var6, var5);
            }
        }
        return (SubLObject)module0326.NIL;
    }
    
    public static SubLObject f22024(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (var3.eql((SubLObject)module0326.$ic0$)) {
            final SubLObject var6 = module0137.$g1605$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var5);
                module0248.f15961(var1, var4, var2, module0326.$ic2$);
            }
            finally {
                module0137.$g1605$.rebind(var6, var5);
            }
        }
        else if (var3.eql((SubLObject)module0326.$ic3$)) {
            final SubLObject var6 = module0137.$g1605$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic4$), var5);
                module0248.f15961(var1, var4, var2, module0326.$ic2$);
            }
            finally {
                module0137.$g1605$.rebind(var6, var5);
            }
        }
        else if (var3.eql((SubLObject)module0326.$ic5$)) {
            final SubLObject var6 = module0137.$g1605$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic6$), var5);
                module0248.f15961(var1, var4, var2, module0326.$ic2$);
            }
            finally {
                module0137.$g1605$.rebind(var6, var5);
            }
        }
        else if (var3.eql((SubLObject)module0326.$ic7$)) {
            final SubLObject var6 = module0137.$g1605$.currentBinding(var5);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic8$), var5);
                module0248.f15961(var1, var4, var2, module0326.$ic2$);
            }
            finally {
                module0137.$g1605$.rebind(var6, var5);
            }
        }
        return (SubLObject)module0326.NIL;
    }
    
    public static SubLObject f22025(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.T;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return module0323.f21853(module0324.f21931(var8), module0324.f21931(var9));
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22026(var8, var9, var2, (SubLObject)module0326.ZERO_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22027(var8, var9, var2, (SubLObject)module0326.ZERO_INTEGER);
        }
        return f22028(var8, var9, var2, (SubLObject)module0326.ZERO_INTEGER);
    }
    
    public static SubLObject f22029(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return module0323.f21852(module0324.f21931(var8), module0324.f21931(var9));
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22026(var8, var9, var2, (SubLObject)module0326.MINUS_ONE_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22027(var8, var9, var2, (SubLObject)module0326.MINUS_ONE_INTEGER);
        }
        return f22028(var8, var9, var2, (SubLObject)module0326.MINUS_ONE_INTEGER);
    }
    
    public static SubLObject f22030(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.T;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return module0323.f21853(module0324.f21931(var8), module0324.f21931(var9));
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22026(var8, var9, var2, (SubLObject)module0326.ONE_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22027(var8, var9, var2, (SubLObject)module0326.ONE_INTEGER);
        }
        return f22028(var8, var9, var2, (SubLObject)module0326.ONE_INTEGER);
    }
    
    public static SubLObject f22031(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return module0323.f21852(module0324.f21931(var8), module0324.f21931(var9));
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22026(var8, var9, var2, (SubLObject)module0326.$ic9$);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22027(var8, var9, var2, (SubLObject)module0326.$ic9$);
        }
        return f22028(var8, var9, var2, (SubLObject)module0326.$ic9$);
    }
    
    public static SubLObject f22032(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.T;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return module0323.f21853(module0324.f21931(var8), module0324.f21931(var9));
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22026(var8, var9, var2, (SubLObject)module0326.TWO_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22027(var8, var9, var2, (SubLObject)module0326.TWO_INTEGER);
        }
        return f22028(var8, var9, var2, (SubLObject)module0326.TWO_INTEGER);
    }
    
    public static SubLObject f22033(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.T;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return module0323.f21853(module0324.f21931(var8), module0324.f21931(var9));
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22026(var8, var9, var2, (SubLObject)module0326.THREE_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22027(var8, var9, var2, (SubLObject)module0326.THREE_INTEGER);
        }
        return f22028(var8, var9, var2, (SubLObject)module0326.THREE_INTEGER);
    }
    
    public static SubLObject f22034(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return module0323.f21852(module0324.f21931(var8), module0324.f21931(var9));
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22026(var8, var9, var2, (SubLObject)module0326.$ic10$);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22027(var8, var9, var2, (SubLObject)module0326.$ic10$);
        }
        return f22028(var8, var9, var2, (SubLObject)module0326.$ic10$);
    }
    
    public static SubLObject f22035(final SubLObject var10, final SubLObject var11, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != f22025(var10, var11, var2) && module0326.NIL != f22025(var11, var10, var2));
    }
    
    public static SubLObject f22036(final SubLObject var12, final SubLObject var13, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != f22029(var12, var13, var2) && module0326.NIL != f22030(var13, var12, var2));
    }
    
    public static SubLObject f22037(final SubLObject var12, final SubLObject var14, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return f22036(var14, var12, var2);
    }
    
    public static SubLObject f22038(final SubLObject var12, final SubLObject var15, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != f22031(var12, var15, var2) && module0326.NIL != f22032(var15, var12, var2));
    }
    
    public static SubLObject f22026(final SubLObject var8, final SubLObject var9, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        final SubLObject var19 = module0141.$g1670$.currentBinding(var17);
        final SubLObject var20 = module0141.$g1671$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1672$.currentBinding(var17);
        final SubLObject var22 = module0141.$g1674$.currentBinding(var17);
        final SubLObject var23 = module0137.$g1605$.currentBinding(var17);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0326.$ic1$), var17);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
            module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
            final SubLObject var7_23 = module0147.$g2095$.currentBinding(var17);
            final SubLObject var18_24 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var19_25 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var17);
                module0147.$g2094$.bind(module0147.f9546(var2), var17);
                module0147.$g2096$.bind(module0147.f9549(var2), var17);
                final SubLObject var24 = (SubLObject)module0326.NIL;
                final SubLObject var7_24 = module0141.$g1714$.currentBinding(var17);
                final SubLObject var18_25 = module0141.$g1715$.currentBinding(var17);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var24) ? var24 : module0141.f9283(), var17);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var24) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var17)), var17);
                    if (module0326.NIL != var24 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var24)) {
                        final SubLObject var25 = module0136.$g1591$.getDynamicValue(var17);
                        if (var25.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var17));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_25 = module0141.$g1710$.currentBinding(var17);
                    final SubLObject var18_26 = module0141.$g1677$.currentBinding(var17);
                    final SubLObject var19_26 = module0138.$g1619$.currentBinding(var17);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var17);
                        module0141.$g1677$.bind(module0141.f9210(), var17);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                        final SubLObject var26 = module0139.f9036();
                        final SubLObject var7_26 = module0139.$g1635$.currentBinding(var17);
                        try {
                            module0139.$g1635$.bind((var26 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                            final SubLObject var7_27 = module0139.$g1636$.currentBinding(var17);
                            try {
                                module0139.$g1636$.bind((var26 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                                final SubLObject var7_28 = module0141.$g1685$.currentBinding(var17);
                                final SubLObject var18_27 = module0141.$g1686$.currentBinding(var17);
                                final SubLObject var19_27 = module0141.$g1683$.currentBinding(var17);
                                final SubLObject var20_38 = module0141.$g1684$.currentBinding(var17);
                                final SubLObject var21_39 = module0141.$g1674$.currentBinding(var17);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
                                    final SubLObject var27 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var28 = (SubLObject)module0326.NIL;
                                    try {
                                        var28 = ReadWriteLocks.rw_lock_seize_read_lock(var27);
                                        var18 = f22039(var9, module0324.f21931(var8), var2, var16);
                                    }
                                    finally {
                                        if (module0326.NIL != var28) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var27);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_39, var17);
                                    module0141.$g1684$.rebind(var20_38, var17);
                                    module0141.$g1683$.rebind(var19_27, var17);
                                    module0141.$g1686$.rebind(var18_27, var17);
                                    module0141.$g1685$.rebind(var7_28, var17);
                                }
                                if (var26 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var17));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_27, var17);
                            }
                            if (var26 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var17));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_26, var17);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_26, var17);
                        module0141.$g1677$.rebind(var18_26, var17);
                        module0141.$g1710$.rebind(var7_25, var17);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_25, var17);
                    module0141.$g1714$.rebind(var7_24, var17);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_25, var17);
                module0147.$g2094$.rebind(var18_24, var17);
                module0147.$g2095$.rebind(var7_23, var17);
            }
        }
        finally {
            module0137.$g1605$.rebind(var23, var17);
            module0141.$g1674$.rebind(var22, var17);
            module0141.$g1672$.rebind(var21, var17);
            module0141.$g1671$.rebind(var20, var17);
            module0141.$g1670$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f22027(final SubLObject var8, final SubLObject var9, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        final SubLObject var19 = module0141.$g1670$.currentBinding(var17);
        final SubLObject var20 = module0141.$g1671$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1672$.currentBinding(var17);
        final SubLObject var22 = module0141.$g1674$.currentBinding(var17);
        final SubLObject var23 = module0137.$g1605$.currentBinding(var17);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0326.$ic1$), var17);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
            module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
            final SubLObject var7_42 = module0147.$g2095$.currentBinding(var17);
            final SubLObject var18_43 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var19_44 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var17);
                module0147.$g2094$.bind(module0147.f9546(var2), var17);
                module0147.$g2096$.bind(module0147.f9549(var2), var17);
                final SubLObject var24 = (SubLObject)module0326.NIL;
                final SubLObject var7_43 = module0141.$g1714$.currentBinding(var17);
                final SubLObject var18_44 = module0141.$g1715$.currentBinding(var17);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var24) ? var24 : module0141.f9283(), var17);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var24) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var17)), var17);
                    if (module0326.NIL != var24 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var24)) {
                        final SubLObject var25 = module0136.$g1591$.getDynamicValue(var17);
                        if (var25.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var17));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_44 = module0141.$g1710$.currentBinding(var17);
                    final SubLObject var18_45 = module0141.$g1677$.currentBinding(var17);
                    final SubLObject var19_45 = module0138.$g1619$.currentBinding(var17);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var17);
                        module0141.$g1677$.bind(module0141.f9208(), var17);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                        final SubLObject var26 = module0139.f9036();
                        final SubLObject var7_45 = module0139.$g1635$.currentBinding(var17);
                        try {
                            module0139.$g1635$.bind((var26 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                            final SubLObject var7_46 = module0139.$g1636$.currentBinding(var17);
                            try {
                                module0139.$g1636$.bind((var26 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                                final SubLObject var7_47 = module0141.$g1685$.currentBinding(var17);
                                final SubLObject var18_46 = module0141.$g1686$.currentBinding(var17);
                                final SubLObject var19_46 = module0141.$g1683$.currentBinding(var17);
                                final SubLObject var20_55 = module0141.$g1684$.currentBinding(var17);
                                final SubLObject var21_56 = module0141.$g1674$.currentBinding(var17);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
                                    final SubLObject var27 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var28 = (SubLObject)module0326.NIL;
                                    try {
                                        var28 = ReadWriteLocks.rw_lock_seize_read_lock(var27);
                                        var18 = f22039(var8, module0324.f21931(var9), var2, var16);
                                    }
                                    finally {
                                        if (module0326.NIL != var28) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var27);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_56, var17);
                                    module0141.$g1684$.rebind(var20_55, var17);
                                    module0141.$g1683$.rebind(var19_46, var17);
                                    module0141.$g1686$.rebind(var18_46, var17);
                                    module0141.$g1685$.rebind(var7_47, var17);
                                }
                                if (var26 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var17));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_46, var17);
                            }
                            if (var26 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var17));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_45, var17);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_45, var17);
                        module0141.$g1677$.rebind(var18_45, var17);
                        module0141.$g1710$.rebind(var7_44, var17);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_44, var17);
                    module0141.$g1714$.rebind(var7_43, var17);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_44, var17);
                module0147.$g2094$.rebind(var18_43, var17);
                module0147.$g2095$.rebind(var7_42, var17);
            }
        }
        finally {
            module0137.$g1605$.rebind(var23, var17);
            module0141.$g1674$.rebind(var22, var17);
            module0141.$g1672$.rebind(var21, var17);
            module0141.$g1671$.rebind(var20, var17);
            module0141.$g1670$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f22039(final SubLObject var12, final SubLObject var57, final SubLObject var2, final SubLObject var16) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0326.NIL;
        SubLObject var60 = (SubLObject)module0326.NIL;
        if (module0326.NIL == var60) {
            SubLObject var61;
            SubLObject var62;
            SubLObject var63;
            SubLObject var64;
            SubLObject var65;
            for (var61 = module0326.$g2840$.getGlobalValue(), var62 = (SubLObject)module0326.NIL, var62 = var61.first(); module0326.NIL == var60 && module0326.NIL != var61; var60 = (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != var59 || var62.eql(var16)), var61 = var61.rest(), var62 = var61.first()) {
                var58.resetMultipleValues();
                var63 = module0323.f21882(var12, var2, var62);
                var64 = var58.secondMultipleValue();
                var65 = var58.thirdMultipleValue();
                var58.resetMultipleValues();
                if (module0326.NIL != var64) {
                    var59 = ((module0326.NIL != module0138.f8972(module0138.f8979())) ? (Numbers.add(var16, Numbers.minus(var62), module0249.f16026(var65)).isNegative() ? module0323.f21852(var64, var57) : module0323.f21853(var64, var57)) : (Numbers.add(var16, Numbers.minus(var62), module0249.f16026(var65)).isNegative() ? module0323.f21854(var64, var57) : module0323.f21855(var64, var57)));
                }
            }
        }
        return var59;
    }
    
    public static SubLObject f22028(final SubLObject var8, final SubLObject var9, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        assert module0326.NIL != Types.integerp(var16) : var16;
        SubLObject var19 = module0142.$g1731$.currentBinding(var17);
        try {
            module0142.$g1731$.bind(var16, var17);
            var18 = module0252.f16335(module0137.f8955(module0326.$ic1$), var8, var9, var2, (SubLObject)module0326.UNPROVIDED);
        }
        finally {
            module0142.$g1731$.rebind(var19, var17);
        }
        if (module0326.NIL == var18) {
            var19 = module0137.$g1605$.currentBinding(var17);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
                SubLObject var20 = (SubLObject)module0326.NIL;
                if (module0326.NIL == var20) {
                    SubLObject var21;
                    SubLObject var22;
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var25;
                    SubLObject var7_69;
                    SubLObject var70_71;
                    SubLObject var72_73;
                    SubLObject var74_75;
                    SubLObject var26;
                    SubLObject var59_77;
                    SubLObject var27;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var7_70;
                    SubLObject var83_84;
                    SubLObject var85_86;
                    SubLObject var87_88;
                    for (var21 = module0326.$g2840$.getGlobalValue(), var22 = (SubLObject)module0326.NIL, var22 = var21.first(); module0326.NIL == var20 && module0326.NIL != var21; var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != var18 || var22.eql(var16)), var21 = var21.rest(), var22 = var21.first()) {
                        var23 = (SubLObject)module0326.NIL;
                        var24 = (SubLObject)module0326.NIL;
                        var25 = (SubLObject)module0326.NIL;
                        var7_69 = module0138.$g1619$.currentBinding(var17);
                        try {
                            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                            var17.resetMultipleValues();
                            var70_71 = module0323.f21882(var8, var2, var22);
                            var72_73 = var17.secondMultipleValue();
                            var74_75 = var17.thirdMultipleValue();
                            var17.resetMultipleValues();
                            var23 = var70_71;
                            var24 = var72_73;
                            var25 = var74_75;
                        }
                        finally {
                            module0138.$g1619$.rebind(var7_69, var17);
                        }
                        if (module0326.NIL != var24) {
                            var26 = (SubLObject)module0326.NIL;
                            if (module0326.NIL == var26) {
                                for (var59_77 = module0326.$g2840$.getGlobalValue(), var27 = (SubLObject)module0326.NIL, var27 = var59_77.first(); module0326.NIL == var26 && module0326.NIL != var59_77; var26 = (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != var18 || var27.eql(var16)), var59_77 = var59_77.rest(), var27 = var59_77.first()) {
                                    var28 = (SubLObject)module0326.NIL;
                                    var29 = (SubLObject)module0326.NIL;
                                    var30 = (SubLObject)module0326.NIL;
                                    var7_70 = module0138.$g1619$.currentBinding(var17);
                                    try {
                                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                                        var17.resetMultipleValues();
                                        var83_84 = module0323.f21882(var9, var2, var27);
                                        var85_86 = var17.secondMultipleValue();
                                        var87_88 = var17.thirdMultipleValue();
                                        var17.resetMultipleValues();
                                        var28 = var83_84;
                                        var29 = var85_86;
                                        var30 = var87_88;
                                    }
                                    finally {
                                        module0138.$g1619$.rebind(var7_70, var17);
                                    }
                                    if (module0326.NIL != var29) {
                                        var18 = (Numbers.add(new SubLObject[] { var16, Numbers.minus(var22), Numbers.minus(var27), module0249.f16026(var25), module0249.f16026(var30) }).isNegative() ? module0323.f21852(var24, var29) : module0323.f21853(var24, var29));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            finally {
                module0137.$g1605$.rebind(var19, var17);
            }
        }
        return var18;
    }
    
    public static SubLObject f22040(final SubLObject var8, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var8)) ? f22041(var8, var2, (SubLObject)module0326.ZERO_INTEGER) : f22042(var8, var2, (SubLObject)module0326.ZERO_INTEGER);
    }
    
    public static SubLObject f22043(final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var9)) ? f22044(var9, var2, (SubLObject)module0326.ZERO_INTEGER) : f22045(var9, var2, (SubLObject)module0326.ZERO_INTEGER);
    }
    
    public static SubLObject f22046(final SubLObject var8, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var8)) ? f22041(var8, var2, (SubLObject)module0326.MINUS_ONE_INTEGER) : f22042(var8, var2, (SubLObject)module0326.MINUS_ONE_INTEGER);
    }
    
    public static SubLObject f22047(final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var9)) ? f22044(var9, var2, (SubLObject)module0326.MINUS_ONE_INTEGER) : f22045(var9, var2, (SubLObject)module0326.MINUS_ONE_INTEGER);
    }
    
    public static SubLObject f22048(final SubLObject var8, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var8)) ? f22041(var8, var2, (SubLObject)module0326.ONE_INTEGER) : f22042(var8, var2, (SubLObject)module0326.ONE_INTEGER);
    }
    
    public static SubLObject f22049(final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var9)) ? f22044(var9, var2, (SubLObject)module0326.ONE_INTEGER) : f22045(var9, var2, (SubLObject)module0326.ONE_INTEGER);
    }
    
    public static SubLObject f22050(final SubLObject var8, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var8)) ? f22041(var8, var2, (SubLObject)module0326.$ic9$) : f22042(var8, var2, (SubLObject)module0326.$ic9$);
    }
    
    public static SubLObject f22051(final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var9)) ? f22044(var9, var2, (SubLObject)module0326.$ic9$) : f22045(var9, var2, (SubLObject)module0326.$ic9$);
    }
    
    public static SubLObject f22052(final SubLObject var8, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var8)) ? f22041(var8, var2, (SubLObject)module0326.TWO_INTEGER) : f22042(var8, var2, (SubLObject)module0326.TWO_INTEGER);
    }
    
    public static SubLObject f22053(final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return (module0326.NIL != module0324.f21976(var9)) ? f22044(var9, var2, (SubLObject)module0326.TWO_INTEGER) : f22045(var9, var2, (SubLObject)module0326.TWO_INTEGER);
    }
    
    public static SubLObject f22041(final SubLObject var8, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0324.f21931(var8);
        SubLObject var19 = (SubLObject)module0326.NIL;
        final SubLObject var20 = module0141.$g1670$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1671$.currentBinding(var17);
        final SubLObject var22 = module0141.$g1672$.currentBinding(var17);
        final SubLObject var23 = module0141.$g1674$.currentBinding(var17);
        final SubLObject var24 = module0137.$g1605$.currentBinding(var17);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0326.$ic1$), var17);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
            module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
            final SubLObject var7_90 = module0147.$g2095$.currentBinding(var17);
            final SubLObject var18_91 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var19_92 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var17);
                module0147.$g2094$.bind(module0147.f9546(var2), var17);
                module0147.$g2096$.bind(module0147.f9549(var2), var17);
                final SubLObject var25 = (SubLObject)module0326.NIL;
                final SubLObject var7_91 = module0141.$g1714$.currentBinding(var17);
                final SubLObject var18_92 = module0141.$g1715$.currentBinding(var17);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var25) ? var25 : module0141.f9283(), var17);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var25) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var17)), var17);
                    if (module0326.NIL != var25 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var25)) {
                        final SubLObject var26 = module0136.$g1591$.getDynamicValue(var17);
                        if (var26.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var25, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var26.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var25, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var26.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var25, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var17));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var25, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_92 = module0141.$g1710$.currentBinding(var17);
                    final SubLObject var18_93 = module0141.$g1677$.currentBinding(var17);
                    final SubLObject var19_93 = module0138.$g1619$.currentBinding(var17);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var17);
                        module0141.$g1677$.bind(module0141.f9208(), var17);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                        final SubLObject var27 = module0139.f9036();
                        final SubLObject var7_93 = module0139.$g1635$.currentBinding(var17);
                        try {
                            module0139.$g1635$.bind((var27 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var17) : module0139.f9038(var27), var17);
                            final SubLObject var7_94 = module0139.$g1636$.currentBinding(var17);
                            try {
                                module0139.$g1636$.bind((var27 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var17) : module0139.f9038(var27), var17);
                                final SubLObject var7_95 = module0141.$g1685$.currentBinding(var17);
                                final SubLObject var18_94 = module0141.$g1686$.currentBinding(var17);
                                final SubLObject var19_94 = module0141.$g1683$.currentBinding(var17);
                                final SubLObject var20_103 = module0141.$g1684$.currentBinding(var17);
                                final SubLObject var21_104 = module0141.$g1674$.currentBinding(var17);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
                                    final SubLObject var28 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var29 = (SubLObject)module0326.NIL;
                                    try {
                                        var29 = ReadWriteLocks.rw_lock_seize_read_lock(var28);
                                        var19 = f22054(var18, var16);
                                    }
                                    finally {
                                        if (module0326.NIL != var29) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var28);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_104, var17);
                                    module0141.$g1684$.rebind(var20_103, var17);
                                    module0141.$g1683$.rebind(var19_94, var17);
                                    module0141.$g1686$.rebind(var18_94, var17);
                                    module0141.$g1685$.rebind(var7_95, var17);
                                }
                                if (var27 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var17));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_94, var17);
                            }
                            if (var27 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var17));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_93, var17);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_93, var17);
                        module0141.$g1677$.rebind(var18_93, var17);
                        module0141.$g1710$.rebind(var7_92, var17);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_92, var17);
                    module0141.$g1714$.rebind(var7_91, var17);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_92, var17);
                module0147.$g2094$.rebind(var18_91, var17);
                module0147.$g2095$.rebind(var7_90, var17);
            }
        }
        finally {
            module0137.$g1605$.rebind(var24, var17);
            module0141.$g1674$.rebind(var23, var17);
            module0141.$g1672$.rebind(var22, var17);
            module0141.$g1671$.rebind(var21, var17);
            module0141.$g1670$.rebind(var20, var17);
        }
        return var19;
    }
    
    public static SubLObject f22044(final SubLObject var9, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0324.f21931(var9);
        SubLObject var19 = (SubLObject)module0326.NIL;
        final SubLObject var20 = module0141.$g1670$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1671$.currentBinding(var17);
        final SubLObject var22 = module0141.$g1672$.currentBinding(var17);
        final SubLObject var23 = module0141.$g1674$.currentBinding(var17);
        final SubLObject var24 = module0137.$g1605$.currentBinding(var17);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0326.$ic1$), var17);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
            module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
            final SubLObject var7_105 = module0147.$g2095$.currentBinding(var17);
            final SubLObject var18_106 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var19_107 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var17);
                module0147.$g2094$.bind(module0147.f9546(var2), var17);
                module0147.$g2096$.bind(module0147.f9549(var2), var17);
                final SubLObject var25 = (SubLObject)module0326.NIL;
                final SubLObject var7_106 = module0141.$g1714$.currentBinding(var17);
                final SubLObject var18_107 = module0141.$g1715$.currentBinding(var17);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var25) ? var25 : module0141.f9283(), var17);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var25) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var17)), var17);
                    if (module0326.NIL != var25 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var25)) {
                        final SubLObject var26 = module0136.$g1591$.getDynamicValue(var17);
                        if (var26.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var25, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var26.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var25, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var26.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var25, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var17));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var25, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_107 = module0141.$g1710$.currentBinding(var17);
                    final SubLObject var18_108 = module0141.$g1677$.currentBinding(var17);
                    final SubLObject var19_108 = module0138.$g1619$.currentBinding(var17);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var17);
                        module0141.$g1677$.bind(module0141.f9210(), var17);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                        final SubLObject var27 = module0139.f9036();
                        final SubLObject var7_108 = module0139.$g1635$.currentBinding(var17);
                        try {
                            module0139.$g1635$.bind((var27 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var17) : module0139.f9038(var27), var17);
                            final SubLObject var7_109 = module0139.$g1636$.currentBinding(var17);
                            try {
                                module0139.$g1636$.bind((var27 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var17) : module0139.f9038(var27), var17);
                                final SubLObject var7_110 = module0141.$g1685$.currentBinding(var17);
                                final SubLObject var18_109 = module0141.$g1686$.currentBinding(var17);
                                final SubLObject var19_109 = module0141.$g1683$.currentBinding(var17);
                                final SubLObject var20_118 = module0141.$g1684$.currentBinding(var17);
                                final SubLObject var21_119 = module0141.$g1674$.currentBinding(var17);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
                                    final SubLObject var28 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var29 = (SubLObject)module0326.NIL;
                                    try {
                                        var29 = ReadWriteLocks.rw_lock_seize_read_lock(var28);
                                        var19 = f22054(var18, var16);
                                    }
                                    finally {
                                        if (module0326.NIL != var29) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var28);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_119, var17);
                                    module0141.$g1684$.rebind(var20_118, var17);
                                    module0141.$g1683$.rebind(var19_109, var17);
                                    module0141.$g1686$.rebind(var18_109, var17);
                                    module0141.$g1685$.rebind(var7_110, var17);
                                }
                                if (var27 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var17));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_109, var17);
                            }
                            if (var27 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var17));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_108, var17);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_108, var17);
                        module0141.$g1677$.rebind(var18_108, var17);
                        module0141.$g1710$.rebind(var7_107, var17);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_107, var17);
                    module0141.$g1714$.rebind(var7_106, var17);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_107, var17);
                module0147.$g2094$.rebind(var18_106, var17);
                module0147.$g2095$.rebind(var7_105, var17);
            }
        }
        finally {
            module0137.$g1605$.rebind(var24, var17);
            module0141.$g1674$.rebind(var23, var17);
            module0141.$g1672$.rebind(var22, var17);
            module0141.$g1671$.rebind(var21, var17);
            module0141.$g1670$.rebind(var20, var17);
        }
        return var19;
    }
    
    public static SubLObject f22042(final SubLObject var8, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        final SubLObject var19 = module0141.$g1670$.currentBinding(var17);
        final SubLObject var20 = module0141.$g1671$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1672$.currentBinding(var17);
        final SubLObject var22 = module0141.$g1674$.currentBinding(var17);
        final SubLObject var23 = module0137.$g1605$.currentBinding(var17);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0326.$ic1$), var17);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
            module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
            final SubLObject var7_120 = module0147.$g2095$.currentBinding(var17);
            final SubLObject var18_121 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var19_122 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var17);
                module0147.$g2094$.bind(module0147.f9546(var2), var17);
                module0147.$g2096$.bind(module0147.f9549(var2), var17);
                final SubLObject var24 = (SubLObject)module0326.NIL;
                final SubLObject var7_121 = module0141.$g1714$.currentBinding(var17);
                final SubLObject var18_122 = module0141.$g1715$.currentBinding(var17);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var24) ? var24 : module0141.f9283(), var17);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var24) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var17)), var17);
                    if (module0326.NIL != var24 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var24)) {
                        final SubLObject var25 = module0136.$g1591$.getDynamicValue(var17);
                        if (var25.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var17));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_122 = module0141.$g1710$.currentBinding(var17);
                    final SubLObject var18_123 = module0141.$g1677$.currentBinding(var17);
                    final SubLObject var19_123 = module0138.$g1619$.currentBinding(var17);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var17);
                        module0141.$g1677$.bind(module0141.f9208(), var17);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                        final SubLObject var26 = module0139.f9036();
                        final SubLObject var7_123 = module0139.$g1635$.currentBinding(var17);
                        try {
                            module0139.$g1635$.bind((var26 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                            final SubLObject var7_124 = module0139.$g1636$.currentBinding(var17);
                            try {
                                module0139.$g1636$.bind((var26 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                                final SubLObject var7_125 = module0141.$g1685$.currentBinding(var17);
                                final SubLObject var18_124 = module0141.$g1686$.currentBinding(var17);
                                final SubLObject var19_124 = module0141.$g1683$.currentBinding(var17);
                                final SubLObject var20_133 = module0141.$g1684$.currentBinding(var17);
                                final SubLObject var21_134 = module0141.$g1674$.currentBinding(var17);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
                                    final SubLObject var27 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var28 = (SubLObject)module0326.NIL;
                                    try {
                                        var28 = ReadWriteLocks.rw_lock_seize_read_lock(var27);
                                        var18 = f22055(var8, var16);
                                    }
                                    finally {
                                        if (module0326.NIL != var28) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var27);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_134, var17);
                                    module0141.$g1684$.rebind(var20_133, var17);
                                    module0141.$g1683$.rebind(var19_124, var17);
                                    module0141.$g1686$.rebind(var18_124, var17);
                                    module0141.$g1685$.rebind(var7_125, var17);
                                }
                                if (var26 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var17));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_124, var17);
                            }
                            if (var26 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var17));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_123, var17);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_123, var17);
                        module0141.$g1677$.rebind(var18_123, var17);
                        module0141.$g1710$.rebind(var7_122, var17);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_122, var17);
                    module0141.$g1714$.rebind(var7_121, var17);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_122, var17);
                module0147.$g2094$.rebind(var18_121, var17);
                module0147.$g2095$.rebind(var7_120, var17);
            }
        }
        finally {
            module0137.$g1605$.rebind(var23, var17);
            module0141.$g1674$.rebind(var22, var17);
            module0141.$g1672$.rebind(var21, var17);
            module0141.$g1671$.rebind(var20, var17);
            module0141.$g1670$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f22045(final SubLObject var9, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        final SubLObject var19 = module0141.$g1670$.currentBinding(var17);
        final SubLObject var20 = module0141.$g1671$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1672$.currentBinding(var17);
        final SubLObject var22 = module0141.$g1674$.currentBinding(var17);
        final SubLObject var23 = module0137.$g1605$.currentBinding(var17);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0326.$ic1$), var17);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
            module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
            final SubLObject var7_135 = module0147.$g2095$.currentBinding(var17);
            final SubLObject var18_136 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var19_137 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var17);
                module0147.$g2094$.bind(module0147.f9546(var2), var17);
                module0147.$g2096$.bind(module0147.f9549(var2), var17);
                final SubLObject var24 = (SubLObject)module0326.NIL;
                final SubLObject var7_136 = module0141.$g1714$.currentBinding(var17);
                final SubLObject var18_137 = module0141.$g1715$.currentBinding(var17);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var24) ? var24 : module0141.f9283(), var17);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var24) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var17)), var17);
                    if (module0326.NIL != var24 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var24)) {
                        final SubLObject var25 = module0136.$g1591$.getDynamicValue(var17);
                        if (var25.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var17));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_137 = module0141.$g1710$.currentBinding(var17);
                    final SubLObject var18_138 = module0141.$g1677$.currentBinding(var17);
                    final SubLObject var19_138 = module0138.$g1619$.currentBinding(var17);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var17);
                        module0141.$g1677$.bind(module0141.f9210(), var17);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                        final SubLObject var26 = module0139.f9036();
                        final SubLObject var7_138 = module0139.$g1635$.currentBinding(var17);
                        try {
                            module0139.$g1635$.bind((var26 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                            final SubLObject var7_139 = module0139.$g1636$.currentBinding(var17);
                            try {
                                module0139.$g1636$.bind((var26 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                                final SubLObject var7_140 = module0141.$g1685$.currentBinding(var17);
                                final SubLObject var18_139 = module0141.$g1686$.currentBinding(var17);
                                final SubLObject var19_139 = module0141.$g1683$.currentBinding(var17);
                                final SubLObject var20_148 = module0141.$g1684$.currentBinding(var17);
                                final SubLObject var21_149 = module0141.$g1674$.currentBinding(var17);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
                                    final SubLObject var27 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var28 = (SubLObject)module0326.NIL;
                                    try {
                                        var28 = ReadWriteLocks.rw_lock_seize_read_lock(var27);
                                        var18 = f22055(var9, var16);
                                    }
                                    finally {
                                        if (module0326.NIL != var28) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var27);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_149, var17);
                                    module0141.$g1684$.rebind(var20_148, var17);
                                    module0141.$g1683$.rebind(var19_139, var17);
                                    module0141.$g1686$.rebind(var18_139, var17);
                                    module0141.$g1685$.rebind(var7_140, var17);
                                }
                                if (var26 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var17));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_139, var17);
                            }
                            if (var26 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var17));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_138, var17);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_138, var17);
                        module0141.$g1677$.rebind(var18_138, var17);
                        module0141.$g1710$.rebind(var7_137, var17);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_137, var17);
                    module0141.$g1714$.rebind(var7_136, var17);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_137, var17);
                module0147.$g2094$.rebind(var18_136, var17);
                module0147.$g2095$.rebind(var7_135, var17);
            }
        }
        finally {
            module0137.$g1605$.rebind(var23, var17);
            module0141.$g1674$.rebind(var22, var17);
            module0141.$g1672$.rebind(var21, var17);
            module0141.$g1671$.rebind(var20, var17);
            module0141.$g1670$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f22054(final SubLObject var57, final SubLObject var16) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0326.NIL;
        final SubLObject var60 = module0141.$g1665$.currentBinding(var58);
        final SubLObject var61 = module0139.$g1648$.currentBinding(var58);
        final SubLObject var62 = module0141.$g1693$.currentBinding(var58);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var58);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var58)), var58);
            module0141.$g1693$.bind((SubLObject)module0326.$ic24$, var58);
            SubLObject var63 = (SubLObject)module0326.NIL;
            SubLObject var64 = (SubLObject)module0326.NIL;
            if (module0326.NIL != module0138.f8972(module0138.f8979())) {
                var63 = var57;
                var64 = (SubLObject)module0326.NIL;
            }
            else {
                var63 = (SubLObject)module0326.NIL;
                var64 = var57;
            }
            final SubLObject var65 = module0323.f21891(var63, var64, module0138.f8979());
            SubLObject var67;
            for (SubLObject var66 = (SubLObject)module0326.NIL; module0326.NIL == var66; var66 = Types.sublisp_null(var67)) {
                var67 = module0135.f8844(var65);
                if (module0326.NIL != var67) {
                    SubLObject var69;
                    final SubLObject var68 = var69 = var67;
                    SubLObject var70 = (SubLObject)module0326.NIL;
                    SubLObject var71 = (SubLObject)module0326.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)module0326.$ic25$);
                    var70 = var69.first();
                    var69 = var69.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)module0326.$ic25$);
                    var71 = var69.first();
                    var69 = var69.rest();
                    if (module0326.NIL == var69) {
                        SubLObject var161_162;
                        final SubLObject var159_160 = var161_162 = var70;
                        SubLObject var72 = (SubLObject)module0326.NIL;
                        SubLObject var73 = (SubLObject)module0326.NIL;
                        SubLObject var74 = (SubLObject)module0326.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var161_162, var159_160, (SubLObject)module0326.$ic26$);
                        var72 = var161_162.first();
                        var161_162 = var161_162.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var161_162, var159_160, (SubLObject)module0326.$ic26$);
                        var73 = var161_162.first();
                        var161_162 = var161_162.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var161_162, var159_160, (SubLObject)module0326.$ic26$);
                        var74 = var161_162.first();
                        var161_162 = var161_162.rest();
                        final SubLObject var75 = (SubLObject)(var161_162.isCons() ? var161_162.first() : module0326.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var161_162, var159_160, (SubLObject)module0326.$ic26$);
                        var161_162 = var161_162.rest();
                        if (module0326.NIL == var161_162) {
                            SubLObject var169_170;
                            final SubLObject var167_168 = var169_170 = var71;
                            SubLObject var76 = (SubLObject)module0326.NIL;
                            SubLObject var77 = (SubLObject)module0326.NIL;
                            SubLObject var78 = (SubLObject)module0326.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var169_170, var167_168, (SubLObject)module0326.$ic27$);
                            var76 = var169_170.first();
                            var169_170 = var169_170.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var169_170, var167_168, (SubLObject)module0326.$ic27$);
                            var77 = var169_170.first();
                            var169_170 = var169_170.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var169_170, var167_168, (SubLObject)module0326.$ic27$);
                            var78 = var169_170.first();
                            var169_170 = var169_170.rest();
                            final SubLObject var166_173 = (SubLObject)(var169_170.isCons() ? var169_170.first() : module0326.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(var169_170, var167_168, (SubLObject)module0326.$ic27$);
                            var169_170 = var169_170.rest();
                            if (module0326.NIL == var169_170) {
                                final SubLObject var79 = (module0326.NIL != module0323.f21851(var57, var74)) ? Numbers.add(var16, module0249.f16026(var76)) : module0142.f9319();
                                assert module0326.NIL != Types.integerp(var79) : var79;
                                final SubLObject var7_175 = module0142.$g1731$.currentBinding(var58);
                                final SubLObject var18_176 = module0141.$g1683$.currentBinding(var58);
                                try {
                                    module0142.$g1731$.bind(var79, var58);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var58);
                                    var59 = ConsesLow.nconc(var59, module0252.f16246(var78));
                                }
                                finally {
                                    module0141.$g1683$.rebind(var18_176, var58);
                                    module0142.$g1731$.rebind(var7_175, var58);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var167_168, (SubLObject)module0326.$ic27$);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var159_160, (SubLObject)module0326.$ic26$);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)module0326.$ic25$);
                    }
                }
            }
        }
        finally {
            module0141.$g1693$.rebind(var62, var58);
            module0139.$g1648$.rebind(var61, var58);
            module0141.$g1665$.rebind(var60, var58);
        }
        return var59;
    }
    
    public static SubLObject f22055(final SubLObject var12, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        final SubLObject var19 = module0141.$g1665$.currentBinding(var17);
        final SubLObject var20 = module0139.$g1648$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1693$.currentBinding(var17);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var17);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var17)), var17);
            module0141.$g1693$.bind((SubLObject)module0326.$ic24$, var17);
            assert module0326.NIL != Types.integerp(var16) : var16;
            final SubLObject var7_177 = module0142.$g1731$.currentBinding(var17);
            try {
                module0142.$g1731$.bind(var16, var17);
                var18 = module0252.f16246(var12);
            }
            finally {
                module0142.$g1731$.rebind(var7_177, var17);
            }
            var17.resetMultipleValues();
            final SubLObject var22 = module0323.f21882(var12, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
            final SubLObject var23 = var17.secondMultipleValue();
            final SubLObject var24 = var17.thirdMultipleValue();
            var17.resetMultipleValues();
            if (module0326.NIL != var22) {
                final SubLObject var25 = module0323.f21887(var22, module0138.f8979(), (SubLObject)module0326.NIL, (SubLObject)module0326.NIL);
                SubLObject var27;
                for (SubLObject var26 = (SubLObject)module0326.NIL; module0326.NIL == var26; var26 = Types.sublisp_null(var27)) {
                    var27 = module0135.f8844(var25);
                    if (module0326.NIL != var27) {
                        SubLObject var29;
                        final SubLObject var28 = var29 = var27;
                        SubLObject var30 = (SubLObject)module0326.NIL;
                        SubLObject var31 = (SubLObject)module0326.NIL;
                        SubLObject var32 = (SubLObject)module0326.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0326.$ic28$);
                        var30 = var29.first();
                        var29 = var29.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0326.$ic28$);
                        var31 = var29.first();
                        var29 = var29.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0326.$ic28$);
                        var32 = var29.first();
                        var29 = var29.rest();
                        if (module0326.NIL == var29) {
                            SubLObject var188_189;
                            final SubLObject var186_187 = var188_189 = var30;
                            SubLObject var33 = (SubLObject)module0326.NIL;
                            SubLObject var34 = (SubLObject)module0326.NIL;
                            SubLObject var35 = (SubLObject)module0326.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var188_189, var186_187, (SubLObject)module0326.$ic29$);
                            var33 = var188_189.first();
                            var188_189 = var188_189.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var188_189, var186_187, (SubLObject)module0326.$ic29$);
                            var34 = var188_189.first();
                            var188_189 = var188_189.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var188_189, var186_187, (SubLObject)module0326.$ic29$);
                            var35 = var188_189.first();
                            var188_189 = var188_189.rest();
                            final SubLObject var36 = (SubLObject)(var188_189.isCons() ? var188_189.first() : module0326.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(var188_189, var186_187, (SubLObject)module0326.$ic29$);
                            var188_189 = var188_189.rest();
                            if (module0326.NIL == var188_189) {
                                SubLObject var193_194;
                                final SubLObject var191_192 = var193_194 = var31;
                                SubLObject var37 = (SubLObject)module0326.NIL;
                                SubLObject var38 = (SubLObject)module0326.NIL;
                                SubLObject var39 = (SubLObject)module0326.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var193_194, var191_192, (SubLObject)module0326.$ic30$);
                                var37 = var193_194.first();
                                var193_194 = var193_194.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var193_194, var191_192, (SubLObject)module0326.$ic30$);
                                var38 = var193_194.first();
                                var193_194 = var193_194.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var193_194, var191_192, (SubLObject)module0326.$ic30$);
                                var39 = var193_194.first();
                                var193_194 = var193_194.rest();
                                final SubLObject var166_198 = (SubLObject)(var193_194.isCons() ? var193_194.first() : module0326.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(var193_194, var191_192, (SubLObject)module0326.$ic30$);
                                var193_194 = var193_194.rest();
                                if (module0326.NIL == var193_194) {
                                    SubLObject var201_202;
                                    final SubLObject var199_200 = var201_202 = var32;
                                    SubLObject var40 = (SubLObject)module0326.NIL;
                                    SubLObject var41 = (SubLObject)module0326.NIL;
                                    SubLObject var42 = (SubLObject)module0326.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var201_202, var199_200, (SubLObject)module0326.$ic31$);
                                    var40 = var201_202.first();
                                    var201_202 = var201_202.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var201_202, var199_200, (SubLObject)module0326.$ic31$);
                                    var41 = var201_202.first();
                                    var201_202 = var201_202.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var201_202, var199_200, (SubLObject)module0326.$ic31$);
                                    var42 = var201_202.first();
                                    var201_202 = var201_202.rest();
                                    final SubLObject var166_199 = (SubLObject)(var201_202.isCons() ? var201_202.first() : module0326.NIL);
                                    cdestructuring_bind.destructuring_bind_must_listp(var201_202, var199_200, (SubLObject)module0326.$ic31$);
                                    var201_202 = var201_202.rest();
                                    if (module0326.NIL == var201_202) {
                                        final SubLObject var43 = (module0326.NIL != module0323.f21851(var35, var39)) ? Numbers.add(var16, module0249.f16026(var33), module0249.f16026(var40)) : module0142.f9319();
                                        assert module0326.NIL != Types.integerp(var43) : var43;
                                        final SubLObject var7_178 = module0142.$g1731$.currentBinding(var17);
                                        final SubLObject var18_208 = module0141.$g1683$.currentBinding(var17);
                                        try {
                                            module0142.$g1731$.bind(var43, var17);
                                            module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                            var18 = ConsesLow.nconc(var18, module0252.f16246(var42));
                                        }
                                        finally {
                                            module0141.$g1683$.rebind(var18_208, var17);
                                            module0142.$g1731$.rebind(var7_178, var17);
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var199_200, (SubLObject)module0326.$ic31$);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var191_192, (SubLObject)module0326.$ic30$);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var186_187, (SubLObject)module0326.$ic29$);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0326.$ic28$);
                        }
                    }
                }
            }
        }
        finally {
            module0141.$g1693$.rebind(var21, var17);
            module0139.$g1648$.rebind(var20, var17);
            module0141.$g1665$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f22056(final SubLObject var12, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return f22057(module0137.f8955(module0326.$ic1$), (SubLObject)module0326.ZERO_INTEGER, var12, var12, var2, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22058(final SubLObject var12, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return f22057(module0137.f8955(module0326.$ic1$), (SubLObject)module0326.MINUS_ONE_INTEGER, var12, var12, var2, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22059(final SubLObject var12, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return f22060(module0137.f8955(module0326.$ic1$), (SubLObject)module0326.MINUS_ONE_INTEGER, var12, var12, var2, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22061(final SubLObject var12, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return f22057(module0137.f8955(module0326.$ic1$), (SubLObject)module0326.$ic9$, var12, var12, var2, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22062(final SubLObject var12, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return f22060(module0137.f8955(module0326.$ic1$), (SubLObject)module0326.$ic9$, var12, var12, var2, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22063(final SubLObject var209, final SubLObject var210, final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return f22057(module0137.f8955(module0326.$ic1$), var209, var8, var9, var2, var210);
    }
    
    public static SubLObject f22057(final SubLObject var211, final SubLObject var16, final SubLObject var10, final SubLObject var11, SubLObject var2, SubLObject var60) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var60 == module0326.UNPROVIDED) {
            var60 = (SubLObject)module0326.NIL;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        assert module0326.NIL != module0137.f8885(var211) : var211;
        SubLObject var213 = (SubLObject)module0326.NIL;
        final SubLObject var214 = module0141.$g1670$.currentBinding(var212);
        final SubLObject var215 = module0141.$g1671$.currentBinding(var212);
        final SubLObject var216 = module0141.$g1672$.currentBinding(var212);
        final SubLObject var217 = module0141.$g1674$.currentBinding(var212);
        final SubLObject var218 = module0137.$g1605$.currentBinding(var212);
        try {
            module0141.$g1670$.bind(var211, var212);
            module0141.$g1671$.bind(module0244.f15739(var211), var212);
            module0141.$g1672$.bind(module0244.f15746(var211), var212);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var212);
            module0137.$g1605$.bind(var211, var212);
            final SubLObject var219 = var2;
            final SubLObject var7_213 = module0147.$g2095$.currentBinding(var212);
            final SubLObject var18_214 = module0147.$g2094$.currentBinding(var212);
            final SubLObject var19_215 = module0147.$g2096$.currentBinding(var212);
            try {
                module0147.$g2095$.bind(module0147.f9545(var219), var212);
                module0147.$g2094$.bind(module0147.f9546(var219), var212);
                module0147.$g2096$.bind(module0147.f9549(var219), var212);
                final SubLObject var220 = (SubLObject)module0326.NIL;
                final SubLObject var7_214 = module0141.$g1714$.currentBinding(var212);
                final SubLObject var18_215 = module0141.$g1715$.currentBinding(var212);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var220) ? var220 : module0141.f9283(), var212);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var220) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var212)), var212);
                    if (module0326.NIL != var220 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var220)) {
                        final SubLObject var221 = module0136.$g1591$.getDynamicValue(var212);
                        if (var221.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var220, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var221.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var220, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var221.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var220, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var212));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var220, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_215 = module0141.$g1710$.currentBinding(var212);
                    final SubLObject var18_216 = module0141.$g1677$.currentBinding(var212);
                    final SubLObject var19_216 = module0138.$g1619$.currentBinding(var212);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var212);
                        module0141.$g1677$.bind(module0141.f9208(), var212);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var212);
                        final SubLObject var222 = module0139.f9036();
                        final SubLObject var7_216 = module0139.$g1635$.currentBinding(var212);
                        try {
                            module0139.$g1635$.bind((var222 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var212) : module0139.f9038(var222), var212);
                            final SubLObject var7_217 = module0139.$g1636$.currentBinding(var212);
                            try {
                                module0139.$g1636$.bind((var222 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var212) : module0139.f9038(var222), var212);
                                final SubLObject var7_218 = module0141.$g1685$.currentBinding(var212);
                                final SubLObject var18_217 = module0141.$g1686$.currentBinding(var212);
                                final SubLObject var19_217 = module0141.$g1683$.currentBinding(var212);
                                final SubLObject var20_226 = module0141.$g1684$.currentBinding(var212);
                                final SubLObject var21_227 = module0141.$g1674$.currentBinding(var212);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var212);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var212);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var212);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var212);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var212);
                                    final SubLObject var223 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var224 = (SubLObject)module0326.NIL;
                                    try {
                                        var224 = ReadWriteLocks.rw_lock_seize_read_lock(var223);
                                        var213 = f22064(var16, var10, var11, var60);
                                    }
                                    finally {
                                        if (module0326.NIL != var224) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var223);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_227, var212);
                                    module0141.$g1684$.rebind(var20_226, var212);
                                    module0141.$g1683$.rebind(var19_217, var212);
                                    module0141.$g1686$.rebind(var18_217, var212);
                                    module0141.$g1685$.rebind(var7_218, var212);
                                }
                                if (var222 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var212));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_217, var212);
                            }
                            if (var222 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var212));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_216, var212);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_216, var212);
                        module0141.$g1677$.rebind(var18_216, var212);
                        module0141.$g1710$.rebind(var7_215, var212);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_215, var212);
                    module0141.$g1714$.rebind(var7_214, var212);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_215, var212);
                module0147.$g2094$.rebind(var18_214, var212);
                module0147.$g2095$.rebind(var7_213, var212);
            }
        }
        finally {
            module0137.$g1605$.rebind(var218, var212);
            module0141.$g1674$.rebind(var217, var212);
            module0141.$g1672$.rebind(var216, var212);
            module0141.$g1671$.rebind(var215, var212);
            module0141.$g1670$.rebind(var214, var212);
        }
        return var213;
    }
    
    public static SubLObject f22060(final SubLObject var211, final SubLObject var16, final SubLObject var10, final SubLObject var11, SubLObject var2, SubLObject var60) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var60 == module0326.UNPROVIDED) {
            var60 = (SubLObject)module0326.NIL;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        assert module0326.NIL != module0137.f8885(var211) : var211;
        SubLObject var213 = (SubLObject)module0326.NIL;
        final SubLObject var214 = module0141.$g1670$.currentBinding(var212);
        final SubLObject var215 = module0141.$g1671$.currentBinding(var212);
        final SubLObject var216 = module0141.$g1672$.currentBinding(var212);
        final SubLObject var217 = module0141.$g1674$.currentBinding(var212);
        final SubLObject var218 = module0137.$g1605$.currentBinding(var212);
        try {
            module0141.$g1670$.bind(var211, var212);
            module0141.$g1671$.bind(module0244.f15739(var211), var212);
            module0141.$g1672$.bind(module0244.f15746(var211), var212);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var212);
            module0137.$g1605$.bind(var211, var212);
            final SubLObject var219 = var2;
            final SubLObject var7_228 = module0147.$g2095$.currentBinding(var212);
            final SubLObject var18_229 = module0147.$g2094$.currentBinding(var212);
            final SubLObject var19_230 = module0147.$g2096$.currentBinding(var212);
            try {
                module0147.$g2095$.bind(module0147.f9545(var219), var212);
                module0147.$g2094$.bind(module0147.f9546(var219), var212);
                module0147.$g2096$.bind(module0147.f9549(var219), var212);
                final SubLObject var220 = (SubLObject)module0326.NIL;
                final SubLObject var7_229 = module0141.$g1714$.currentBinding(var212);
                final SubLObject var18_230 = module0141.$g1715$.currentBinding(var212);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var220) ? var220 : module0141.f9283(), var212);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var220) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var212)), var212);
                    if (module0326.NIL != var220 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var220)) {
                        final SubLObject var221 = module0136.$g1591$.getDynamicValue(var212);
                        if (var221.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var220, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var221.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var220, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var221.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var220, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var212));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var220, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_230 = module0141.$g1710$.currentBinding(var212);
                    final SubLObject var18_231 = module0141.$g1677$.currentBinding(var212);
                    final SubLObject var19_231 = module0138.$g1619$.currentBinding(var212);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var212);
                        module0141.$g1677$.bind(module0141.f9210(), var212);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var212);
                        final SubLObject var222 = module0139.f9036();
                        final SubLObject var7_231 = module0139.$g1635$.currentBinding(var212);
                        try {
                            module0139.$g1635$.bind((var222 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var212) : module0139.f9038(var222), var212);
                            final SubLObject var7_232 = module0139.$g1636$.currentBinding(var212);
                            try {
                                module0139.$g1636$.bind((var222 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var212) : module0139.f9038(var222), var212);
                                final SubLObject var7_233 = module0141.$g1685$.currentBinding(var212);
                                final SubLObject var18_232 = module0141.$g1686$.currentBinding(var212);
                                final SubLObject var19_232 = module0141.$g1683$.currentBinding(var212);
                                final SubLObject var20_241 = module0141.$g1684$.currentBinding(var212);
                                final SubLObject var21_242 = module0141.$g1674$.currentBinding(var212);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var212);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var212);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var212);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var212);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var212);
                                    final SubLObject var223 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var224 = (SubLObject)module0326.NIL;
                                    try {
                                        var224 = ReadWriteLocks.rw_lock_seize_read_lock(var223);
                                        var213 = f22064(var16, var10, var11, var60);
                                    }
                                    finally {
                                        if (module0326.NIL != var224) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var223);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_242, var212);
                                    module0141.$g1684$.rebind(var20_241, var212);
                                    module0141.$g1683$.rebind(var19_232, var212);
                                    module0141.$g1686$.rebind(var18_232, var212);
                                    module0141.$g1685$.rebind(var7_233, var212);
                                }
                                if (var222 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var212));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_232, var212);
                            }
                            if (var222 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var212));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_231, var212);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_231, var212);
                        module0141.$g1677$.rebind(var18_231, var212);
                        module0141.$g1710$.rebind(var7_230, var212);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_230, var212);
                    module0141.$g1714$.rebind(var7_229, var212);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_230, var212);
                module0147.$g2094$.rebind(var18_229, var212);
                module0147.$g2095$.rebind(var7_228, var212);
            }
        }
        finally {
            module0137.$g1605$.rebind(var218, var212);
            module0141.$g1674$.rebind(var217, var212);
            module0141.$g1672$.rebind(var216, var212);
            module0141.$g1671$.rebind(var215, var212);
            module0141.$g1670$.rebind(var214, var212);
        }
        return var213;
    }
    
    public static SubLObject f22064(final SubLObject var16, final SubLObject var10, final SubLObject var11, SubLObject var60) {
        if (var60 == module0326.UNPROVIDED) {
            var60 = (SubLObject)module0326.NIL;
        }
        if (module0326.NIL == var60) {
            var60 = Numbers.minus(var16);
        }
        final SubLObject var61 = (SubLObject)((module0326.NIL != module0324.f21976(var10)) ? module0324.f21931(var10) : module0326.NIL);
        final SubLObject var62 = (SubLObject)((module0326.NIL != module0324.f21976(var11)) ? module0324.f21931(var11) : module0326.NIL);
        if (module0326.NIL != var61 && module0326.NIL != var62) {
            return f22065(var16, var61, var62, var60);
        }
        if (module0326.NIL != var61) {
            return f22066(var16, var61, var11, var60);
        }
        if (module0326.NIL != var62) {
            return f22067(var16, var10, var62, var60);
        }
        return f22068(var16, var10, var11, var60);
    }
    
    public static SubLObject f22065(final SubLObject var16, final SubLObject var245, final SubLObject var246, final SubLObject var60) {
        final SubLThread var247 = SubLProcess.currentSubLThread();
        SubLObject var248 = (SubLObject)module0326.NIL;
        final SubLObject var249 = module0141.$g1665$.currentBinding(var247);
        final SubLObject var250 = module0139.$g1648$.currentBinding(var247);
        final SubLObject var251 = module0139.$g1646$.currentBinding(var247);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var247);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var247)), var247);
            module0139.$g1646$.bind(module0139.f9007(), var247);
            final SubLObject var7_247 = module0139.$g1635$.currentBinding(var247);
            try {
                module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var247), var247);
                var248 = f22069(var16, var245, var246, var60);
            }
            finally {
                module0139.$g1635$.rebind(var7_247, var247);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var247));
        }
        finally {
            module0139.$g1646$.rebind(var251, var247);
            module0139.$g1648$.rebind(var250, var247);
            module0141.$g1665$.rebind(var249, var247);
        }
        return var248;
    }
    
    public static SubLObject f22069(final SubLObject var16, final SubLObject var245, final SubLObject var246, final SubLObject var60) {
        final SubLThread var247 = SubLProcess.currentSubLThread();
        SubLObject var248 = (SubLObject)module0326.NIL;
        if ((module0326.NIL != module0138.f8972(module0138.f8979()) && module0326.NIL != module0323.f21853(var245, var246)) || (module0326.NIL != module0138.f8975(module0138.f8979()) && module0326.NIL != module0323.f21855(var245, var246))) {
            var247.resetMultipleValues();
            final SubLObject var249 = (module0326.NIL != module0323.f21853(var245, var246)) ? Values.values(var245, var246) : Values.values(var246, var245);
            final SubLObject var250 = var247.secondMultipleValue();
            var247.resetMultipleValues();
            final SubLObject var251 = module0323.f21891(var249, var250, module0138.f8979());
            SubLObject var253;
            for (SubLObject var252 = (SubLObject)module0326.NIL; module0326.NIL == var252; var252 = Types.sublisp_null(var253)) {
                var253 = module0135.f8844(var251);
                if (module0326.NIL != var253) {
                    SubLObject var255;
                    final SubLObject var254 = var255 = var253;
                    SubLObject var256 = (SubLObject)module0326.NIL;
                    SubLObject var257 = (SubLObject)module0326.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var255, var254, (SubLObject)module0326.$ic25$);
                    var256 = var255.first();
                    var255 = var255.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var255, var254, (SubLObject)module0326.$ic25$);
                    var257 = var255.first();
                    var255 = var255.rest();
                    if (module0326.NIL == var255) {
                        SubLObject var254_255;
                        final SubLObject var252_253 = var254_255 = var256;
                        SubLObject var258 = (SubLObject)module0326.NIL;
                        SubLObject var259 = (SubLObject)module0326.NIL;
                        SubLObject var260 = (SubLObject)module0326.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var254_255, var252_253, (SubLObject)module0326.$ic33$);
                        var258 = var254_255.first();
                        var254_255 = var254_255.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var254_255, var252_253, (SubLObject)module0326.$ic33$);
                        var259 = var254_255.first();
                        var254_255 = var254_255.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var254_255, var252_253, (SubLObject)module0326.$ic33$);
                        var260 = var254_255.first();
                        var254_255 = var254_255.rest();
                        final SubLObject var261 = (SubLObject)(var254_255.isCons() ? var254_255.first() : module0326.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var254_255, var252_253, (SubLObject)module0326.$ic33$);
                        var254_255 = var254_255.rest();
                        if (module0326.NIL == var254_255) {
                            SubLObject var258_259;
                            final SubLObject var256_257 = var258_259 = var257;
                            SubLObject var262 = (SubLObject)module0326.NIL;
                            SubLObject var263 = (SubLObject)module0326.NIL;
                            SubLObject var264 = (SubLObject)module0326.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var258_259, var256_257, (SubLObject)module0326.$ic27$);
                            var262 = var258_259.first();
                            var258_259 = var258_259.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var258_259, var256_257, (SubLObject)module0326.$ic27$);
                            var263 = var258_259.first();
                            var258_259 = var258_259.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var258_259, var256_257, (SubLObject)module0326.$ic27$);
                            var264 = var258_259.first();
                            var258_259 = var258_259.rest();
                            final SubLObject var166_260 = (SubLObject)(var258_259.isCons() ? var258_259.first() : module0326.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(var258_259, var256_257, (SubLObject)module0326.$ic27$);
                            var258_259 = var258_259.rest();
                            if (module0326.NIL == var258_259) {
                                final SubLObject var265 = (module0326.NIL != module0323.f21856(var260, var249, var250, (SubLObject)module0326.T)) ? module0142.f9319() : Numbers.add(var16, module0249.f16026(var262));
                                assert module0326.NIL != Types.integerp(var265) : var265;
                                final SubLObject var266 = module0142.$g1731$.currentBinding(var247);
                                final SubLObject var267 = module0141.$g1683$.currentBinding(var247);
                                try {
                                    module0142.$g1731$.bind(var265, var247);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var247);
                                    module0251.f16203(var264);
                                }
                                finally {
                                    module0141.$g1683$.rebind(var267, var247);
                                    module0142.$g1731$.rebind(var266, var247);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var256_257, (SubLObject)module0326.$ic27$);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var252_253, (SubLObject)module0326.$ic33$);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var254, (SubLObject)module0326.$ic25$);
                    }
                }
            }
            final SubLObject var268 = module0139.$g1635$.currentBinding(var247);
            try {
                module0139.$g1635$.bind(module0139.f9007(), var247);
                final SubLObject var7_261 = module0139.$g1636$.currentBinding(var247);
                try {
                    module0139.$g1636$.bind(module0139.f9007(), var247);
                    final SubLObject var7_262 = module0138.$g1619$.currentBinding(var247);
                    final SubLObject var269 = module0139.$g1658$.currentBinding(var247);
                    final SubLObject var270 = module0141.$g1693$.currentBinding(var247);
                    try {
                        module0138.$g1619$.bind(module0138.f8980(), var247);
                        module0139.$g1658$.bind((SubLObject)module0326.T, var247);
                        module0141.$g1693$.bind((SubLObject)module0326.$ic24$, var247);
                        final SubLObject var271 = module0323.f21891(var249, var250, module0138.f8979());
                        SubLObject var273;
                        for (SubLObject var272 = (SubLObject)module0326.NIL; module0326.NIL == var272; var272 = Types.sublisp_null(var273)) {
                            var273 = module0135.f8844(var271);
                            if (module0326.NIL != var273) {
                                SubLObject var275;
                                final SubLObject var274 = var275 = var273;
                                SubLObject var276 = (SubLObject)module0326.NIL;
                                SubLObject var277 = (SubLObject)module0326.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var275, var274, (SubLObject)module0326.$ic25$);
                                var276 = var275.first();
                                var275 = var275.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var275, var274, (SubLObject)module0326.$ic25$);
                                var277 = var275.first();
                                var275 = var275.rest();
                                if (module0326.NIL == var275) {
                                    SubLObject var267_268;
                                    final SubLObject var265_266 = var267_268 = var276;
                                    SubLObject var278 = (SubLObject)module0326.NIL;
                                    SubLObject var279 = (SubLObject)module0326.NIL;
                                    SubLObject var280 = (SubLObject)module0326.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var267_268, var265_266, (SubLObject)module0326.$ic33$);
                                    var278 = var267_268.first();
                                    var267_268 = var267_268.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var267_268, var265_266, (SubLObject)module0326.$ic33$);
                                    var279 = var267_268.first();
                                    var267_268 = var267_268.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var267_268, var265_266, (SubLObject)module0326.$ic33$);
                                    var280 = var267_268.first();
                                    var267_268 = var267_268.rest();
                                    final SubLObject var281 = (SubLObject)(var267_268.isCons() ? var267_268.first() : module0326.NIL);
                                    cdestructuring_bind.destructuring_bind_must_listp(var267_268, var265_266, (SubLObject)module0326.$ic33$);
                                    var267_268 = var267_268.rest();
                                    if (module0326.NIL == var267_268) {
                                        SubLObject var271_272;
                                        final SubLObject var269_270 = var271_272 = var277;
                                        SubLObject var282 = (SubLObject)module0326.NIL;
                                        SubLObject var283 = (SubLObject)module0326.NIL;
                                        SubLObject var284 = (SubLObject)module0326.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var271_272, var269_270, (SubLObject)module0326.$ic27$);
                                        var282 = var271_272.first();
                                        var271_272 = var271_272.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var271_272, var269_270, (SubLObject)module0326.$ic27$);
                                        var283 = var271_272.first();
                                        var271_272 = var271_272.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var271_272, var269_270, (SubLObject)module0326.$ic27$);
                                        var284 = var271_272.first();
                                        var271_272 = var271_272.rest();
                                        final SubLObject var166_261 = (SubLObject)(var271_272.isCons() ? var271_272.first() : module0326.NIL);
                                        cdestructuring_bind.destructuring_bind_must_listp(var271_272, var269_270, (SubLObject)module0326.$ic27$);
                                        var271_272 = var271_272.rest();
                                        if (module0326.NIL == var271_272) {
                                            final SubLObject var285 = (module0326.NIL != module0323.f21856(var280, var249, var250, (SubLObject)module0326.T)) ? module0142.f9319() : Numbers.add(var60, module0249.f16026(var282));
                                            assert module0326.NIL != Types.integerp(var285) : var285;
                                            final SubLObject var7_263 = module0142.$g1731$.currentBinding(var247);
                                            final SubLObject var18_275 = module0141.$g1683$.currentBinding(var247);
                                            try {
                                                module0142.$g1731$.bind(var285, var247);
                                                module0141.$g1683$.bind((SubLObject)module0326.NIL, var247);
                                                var248 = ConsesLow.nconc(var248, module0252.f16246(var284));
                                            }
                                            finally {
                                                module0141.$g1683$.rebind(var18_275, var247);
                                                module0142.$g1731$.rebind(var7_263, var247);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var269_270, (SubLObject)module0326.$ic27$);
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var265_266, (SubLObject)module0326.$ic33$);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var274, (SubLObject)module0326.$ic25$);
                                }
                            }
                        }
                    }
                    finally {
                        module0141.$g1693$.rebind(var270, var247);
                        module0139.$g1658$.rebind(var269, var247);
                        module0138.$g1619$.rebind(var7_262, var247);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var247));
                }
                finally {
                    module0139.$g1636$.rebind(var7_261, var247);
                }
                module0139.f9011(module0139.$g1635$.getDynamicValue(var247));
            }
            finally {
                module0139.$g1635$.rebind(var268, var247);
            }
        }
        return module0035.f2269(var248, Symbols.symbol_function((SubLObject)module0326.EQUAL), (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22066(final SubLObject var16, final SubLObject var57, final SubLObject var12, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0326.NIL;
        final SubLObject var63 = module0138.$g1619$.currentBinding(var61);
        try {
            module0138.$g1619$.bind(module0138.f8980(), var61);
            var62 = f22067(var16, var12, var57, var60);
        }
        finally {
            module0138.$g1619$.rebind(var63, var61);
        }
        return var62;
    }
    
    public static SubLObject f22067(final SubLObject var16, final SubLObject var12, final SubLObject var57, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0326.NIL;
        final SubLObject var63 = module0141.$g1665$.currentBinding(var61);
        final SubLObject var64 = module0139.$g1648$.currentBinding(var61);
        final SubLObject var65 = module0139.$g1646$.currentBinding(var61);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var61);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var61)), var61);
            module0139.$g1646$.bind(module0139.f9007(), var61);
            final SubLObject var7_276 = module0139.$g1635$.currentBinding(var61);
            try {
                module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var61), var61);
                assert module0326.NIL != Types.integerp(var16) : var16;
                final SubLObject var7_277 = module0142.$g1731$.currentBinding(var61);
                try {
                    module0142.$g1731$.bind(var16, var61);
                    module0251.f16203(var12);
                }
                finally {
                    module0142.$g1731$.rebind(var7_277, var61);
                }
                var61.resetMultipleValues();
                final SubLObject var66 = module0323.f21882(var12, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                final SubLObject var67 = var61.secondMultipleValue();
                final SubLObject var68 = var61.thirdMultipleValue();
                var61.resetMultipleValues();
                if (module0326.NIL != var67) {
                    final SubLObject var69 = Numbers.add(var16, module0249.f16026(var68));
                    var62 = f22069(var69, var67, var57, var60);
                }
            }
            finally {
                module0139.$g1635$.rebind(var7_276, var61);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var61));
        }
        finally {
            module0139.$g1646$.rebind(var65, var61);
            module0139.$g1648$.rebind(var64, var61);
            module0141.$g1665$.rebind(var63, var61);
        }
        return var62;
    }
    
    public static SubLObject f22068(final SubLObject var16, final SubLObject var10, final SubLObject var11, final SubLObject var60) {
        final SubLThread var61 = SubLProcess.currentSubLThread();
        SubLObject var62 = (SubLObject)module0326.NIL;
        final SubLObject var63 = module0141.$g1665$.currentBinding(var61);
        final SubLObject var64 = module0139.$g1648$.currentBinding(var61);
        final SubLObject var65 = module0139.$g1646$.currentBinding(var61);
        try {
            module0141.$g1665$.bind(module0250.f16095(module0141.f9188(), module0141.f9211(), module0141.f9285()), var61);
            module0139.$g1648$.bind(module0250.f16096(module0141.$g1665$.getDynamicValue(var61)), var61);
            module0139.$g1646$.bind(module0139.f9007(), var61);
            final SubLObject var7_279 = module0139.$g1635$.currentBinding(var61);
            try {
                module0139.$g1635$.bind(module0139.$g1646$.getDynamicValue(var61), var61);
                assert module0326.NIL != Types.integerp(var16) : var16;
                final SubLObject var7_280 = module0142.$g1731$.currentBinding(var61);
                try {
                    module0142.$g1731$.bind(var16, var61);
                    module0251.f16203(var10);
                    final SubLObject var7_281 = module0141.$g1683$.currentBinding(var61);
                    final SubLObject var18_282 = module0138.$g1619$.currentBinding(var61);
                    try {
                        module0141.$g1683$.bind((SubLObject)module0326.NIL, var61);
                        module0138.$g1619$.bind(module0138.f8980(), var61);
                        module0251.f16203(var11);
                    }
                    finally {
                        module0138.$g1619$.rebind(var18_282, var61);
                        module0141.$g1683$.rebind(var7_281, var61);
                    }
                }
                finally {
                    module0142.$g1731$.rebind(var7_280, var61);
                }
                SubLObject var66 = (SubLObject)module0326.NIL;
                SubLObject var67 = (SubLObject)module0326.NIL;
                SubLObject var68 = (SubLObject)module0326.NIL;
                SubLObject var69 = (SubLObject)module0326.NIL;
                SubLObject var70 = (SubLObject)module0326.NIL;
                SubLObject var71 = (SubLObject)module0326.NIL;
                var61.resetMultipleValues();
                final SubLObject var287_288 = module0323.f21882(var10, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                final SubLObject var289_290 = var61.secondMultipleValue();
                final SubLObject var291_292 = var61.thirdMultipleValue();
                var61.resetMultipleValues();
                var66 = var287_288;
                var67 = var289_290;
                var68 = var291_292;
                final SubLObject var7_282 = module0138.$g1619$.currentBinding(var61);
                try {
                    module0138.$g1619$.bind(module0138.f8980(), var61);
                    var61.resetMultipleValues();
                    final SubLObject var294_295 = module0323.f21882(var11, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                    final SubLObject var296_297 = var61.secondMultipleValue();
                    final SubLObject var298_299 = var61.thirdMultipleValue();
                    var61.resetMultipleValues();
                    var69 = var294_295;
                    var70 = var296_297;
                    var71 = var298_299;
                }
                finally {
                    module0138.$g1619$.rebind(var7_282, var61);
                }
                final SubLObject var7_283 = module0139.$g1635$.currentBinding(var61);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var61);
                    final SubLObject var7_284 = module0139.$g1636$.currentBinding(var61);
                    try {
                        module0139.$g1636$.bind(module0139.f9007(), var61);
                        final SubLObject var7_285 = module0141.$g1683$.currentBinding(var61);
                        try {
                            module0141.$g1683$.bind((SubLObject)module0326.NIL, var61);
                            assert module0326.NIL != Types.integerp(var60) : var60;
                            final SubLObject var7_286 = module0142.$g1731$.currentBinding(var61);
                            final SubLObject var18_283 = module0138.$g1619$.currentBinding(var61);
                            final SubLObject var19_305 = module0139.$g1658$.currentBinding(var61);
                            final SubLObject var72 = module0141.$g1693$.currentBinding(var61);
                            try {
                                module0142.$g1731$.bind(var60, var61);
                                module0138.$g1619$.bind(module0138.f8980(), var61);
                                module0139.$g1658$.bind((SubLObject)module0326.T, var61);
                                module0141.$g1693$.bind((SubLObject)module0326.$ic24$, var61);
                                var62 = module0252.f16246(var11);
                            }
                            finally {
                                module0141.$g1693$.rebind(var72, var61);
                                module0139.$g1658$.rebind(var19_305, var61);
                                module0138.$g1619$.rebind(var18_283, var61);
                                module0142.$g1731$.rebind(var7_286, var61);
                            }
                        }
                        finally {
                            module0141.$g1683$.rebind(var7_285, var61);
                        }
                        module0139.f9011(module0139.$g1636$.getDynamicValue(var61));
                    }
                    finally {
                        module0139.$g1636$.rebind(var7_284, var61);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var61));
                }
                finally {
                    module0139.$g1635$.rebind(var7_283, var61);
                }
                if (module0326.NIL != var67 && module0326.NIL != var70) {
                    final SubLObject var73 = Numbers.add(var16, module0249.f16026(var68));
                    final SubLObject var74 = Numbers.add(var60, module0249.f16026(var71));
                    var62 = ConsesLow.nconc(var62, f22069(var73, var67, var70, var74));
                }
            }
            finally {
                module0139.$g1635$.rebind(var7_279, var61);
            }
            module0139.f9011(module0139.$g1646$.getDynamicValue(var61));
        }
        finally {
            module0139.$g1646$.rebind(var65, var61);
            module0139.$g1648$.rebind(var64, var61);
            module0141.$g1665$.rebind(var63, var61);
        }
        return module0035.f2269(var62, Symbols.symbol_function((SubLObject)module0326.EQUAL), (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22070(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22071(var8, var9, var2, (SubLObject)module0326.ZERO_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22072(var8, var9, var2, (SubLObject)module0326.ZERO_INTEGER);
        }
        return f22073(var8, var9, var2, (SubLObject)module0326.ZERO_INTEGER);
    }
    
    public static SubLObject f22074(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22071(var8, var9, var2, (SubLObject)module0326.MINUS_ONE_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22072(var8, var9, var2, (SubLObject)module0326.MINUS_ONE_INTEGER);
        }
        return f22073(var8, var9, var2, (SubLObject)module0326.MINUS_ONE_INTEGER);
    }
    
    public static SubLObject f22075(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22071(var8, var9, var2, (SubLObject)module0326.ONE_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22072(var8, var9, var2, (SubLObject)module0326.ONE_INTEGER);
        }
        return f22073(var8, var9, var2, (SubLObject)module0326.ONE_INTEGER);
    }
    
    public static SubLObject f22076(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22071(var8, var9, var2, (SubLObject)module0326.$ic9$);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22072(var8, var9, var2, (SubLObject)module0326.$ic9$);
        }
        return f22073(var8, var9, var2, (SubLObject)module0326.$ic9$);
    }
    
    public static SubLObject f22077(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22071(var8, var9, var2, (SubLObject)module0326.TWO_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22072(var8, var9, var2, (SubLObject)module0326.TWO_INTEGER);
        }
        return f22073(var8, var9, var2, (SubLObject)module0326.TWO_INTEGER);
    }
    
    public static SubLObject f22078(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22071(var8, var9, var2, (SubLObject)module0326.THREE_INTEGER);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22072(var8, var9, var2, (SubLObject)module0326.THREE_INTEGER);
        }
        return f22073(var8, var9, var2, (SubLObject)module0326.THREE_INTEGER);
    }
    
    public static SubLObject f22079(final SubLObject var8, final SubLObject var9, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var8.eql(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8) && module0326.NIL != module0324.f21976(var9)) {
            return (SubLObject)module0326.NIL;
        }
        if (module0326.NIL != module0324.f21976(var8)) {
            return f22071(var8, var9, var2, (SubLObject)module0326.$ic10$);
        }
        if (module0326.NIL != module0324.f21976(var9)) {
            return f22072(var8, var9, var2, (SubLObject)module0326.$ic10$);
        }
        return f22073(var8, var9, var2, (SubLObject)module0326.$ic10$);
    }
    
    public static SubLObject f22080(final SubLObject var10, final SubLObject var11, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        SubLObject var12 = (SubLObject)module0326.NIL;
        SubLObject var13 = (SubLObject)module0326.NIL;
        var12 = f22070(var10, var11, var2);
        if (module0326.NIL != var12) {
            var13 = f22070(var11, var10, var2);
        }
        return (SubLObject)((module0326.NIL != var12 && module0326.NIL != var13) ? ConsesLow.append(var12, var13) : module0326.NIL);
    }
    
    public static SubLObject f22081(final SubLObject var12, final SubLObject var13, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        SubLObject var14 = (SubLObject)module0326.NIL;
        SubLObject var15 = (SubLObject)module0326.NIL;
        var14 = f22074(var12, var13, var2);
        if (module0326.NIL != var14) {
            var15 = f22075(var13, var12, var2);
        }
        return (SubLObject)((module0326.NIL != var14 && module0326.NIL != var15) ? ConsesLow.append(var14, var15) : module0326.NIL);
    }
    
    public static SubLObject f22082(final SubLObject var12, final SubLObject var14, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        return f22081(var14, var12, var2);
    }
    
    public static SubLObject f22083(final SubLObject var12, final SubLObject var15, SubLObject var2) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        SubLObject var16 = (SubLObject)module0326.NIL;
        SubLObject var17 = (SubLObject)module0326.NIL;
        var16 = f22076(var12, var15, var2);
        if (module0326.NIL != var16) {
            var17 = f22077(var15, var12, var2);
        }
        return (SubLObject)((module0326.NIL != var16 && module0326.NIL != var17) ? ConsesLow.append(var16, var17) : module0326.NIL);
    }
    
    public static SubLObject f22071(final SubLObject var8, final SubLObject var9, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        final SubLObject var19 = module0141.$g1670$.currentBinding(var17);
        final SubLObject var20 = module0141.$g1671$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1672$.currentBinding(var17);
        final SubLObject var22 = module0141.$g1674$.currentBinding(var17);
        final SubLObject var23 = module0137.$g1605$.currentBinding(var17);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0326.$ic1$), var17);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
            module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
            final SubLObject var7_311 = module0147.$g2095$.currentBinding(var17);
            final SubLObject var18_312 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var19_313 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var17);
                module0147.$g2094$.bind(module0147.f9546(var2), var17);
                module0147.$g2096$.bind(module0147.f9549(var2), var17);
                final SubLObject var24 = (SubLObject)module0326.NIL;
                final SubLObject var7_312 = module0141.$g1714$.currentBinding(var17);
                final SubLObject var18_313 = module0141.$g1715$.currentBinding(var17);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var24) ? var24 : module0141.f9283(), var17);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var24) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var17)), var17);
                    if (module0326.NIL != var24 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var24)) {
                        final SubLObject var25 = module0136.$g1591$.getDynamicValue(var17);
                        if (var25.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var17));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_313 = module0141.$g1710$.currentBinding(var17);
                    final SubLObject var18_314 = module0141.$g1677$.currentBinding(var17);
                    final SubLObject var19_314 = module0138.$g1619$.currentBinding(var17);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var17);
                        module0141.$g1677$.bind(module0141.f9210(), var17);
                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                        final SubLObject var26 = module0139.f9036();
                        final SubLObject var7_314 = module0139.$g1635$.currentBinding(var17);
                        try {
                            module0139.$g1635$.bind((var26 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                            final SubLObject var7_315 = module0139.$g1636$.currentBinding(var17);
                            try {
                                module0139.$g1636$.bind((var26 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                                final SubLObject var7_316 = module0141.$g1685$.currentBinding(var17);
                                final SubLObject var18_315 = module0141.$g1686$.currentBinding(var17);
                                final SubLObject var19_315 = module0141.$g1683$.currentBinding(var17);
                                final SubLObject var20_324 = module0141.$g1684$.currentBinding(var17);
                                final SubLObject var21_325 = module0141.$g1674$.currentBinding(var17);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
                                    final SubLObject var27 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var28 = (SubLObject)module0326.NIL;
                                    try {
                                        var28 = ReadWriteLocks.rw_lock_seize_read_lock(var27);
                                        var18 = f22084(var9, module0324.f21931(var8), var2, var16);
                                    }
                                    finally {
                                        if (module0326.NIL != var28) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var27);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_325, var17);
                                    module0141.$g1684$.rebind(var20_324, var17);
                                    module0141.$g1683$.rebind(var19_315, var17);
                                    module0141.$g1686$.rebind(var18_315, var17);
                                    module0141.$g1685$.rebind(var7_316, var17);
                                }
                                if (var26 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var17));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_315, var17);
                            }
                            if (var26 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var17));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_314, var17);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_314, var17);
                        module0141.$g1677$.rebind(var18_314, var17);
                        module0141.$g1710$.rebind(var7_313, var17);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_313, var17);
                    module0141.$g1714$.rebind(var7_312, var17);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_313, var17);
                module0147.$g2094$.rebind(var18_312, var17);
                module0147.$g2095$.rebind(var7_311, var17);
            }
        }
        finally {
            module0137.$g1605$.rebind(var23, var17);
            module0141.$g1674$.rebind(var22, var17);
            module0141.$g1672$.rebind(var21, var17);
            module0141.$g1671$.rebind(var20, var17);
            module0141.$g1670$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f22072(final SubLObject var8, final SubLObject var9, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        final SubLObject var19 = module0141.$g1670$.currentBinding(var17);
        final SubLObject var20 = module0141.$g1671$.currentBinding(var17);
        final SubLObject var21 = module0141.$g1672$.currentBinding(var17);
        final SubLObject var22 = module0141.$g1674$.currentBinding(var17);
        final SubLObject var23 = module0137.$g1605$.currentBinding(var17);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0326.$ic1$), var17);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0326.$ic1$)), var17);
            module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
            module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
            final SubLObject var7_326 = module0147.$g2095$.currentBinding(var17);
            final SubLObject var18_327 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var19_328 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var17);
                module0147.$g2094$.bind(module0147.f9546(var2), var17);
                module0147.$g2096$.bind(module0147.f9549(var2), var17);
                final SubLObject var24 = (SubLObject)module0326.NIL;
                final SubLObject var7_327 = module0141.$g1714$.currentBinding(var17);
                final SubLObject var18_328 = module0141.$g1715$.currentBinding(var17);
                try {
                    module0141.$g1714$.bind((module0326.NIL != var24) ? var24 : module0141.f9283(), var17);
                    module0141.$g1715$.bind((SubLObject)((module0326.NIL != var24) ? module0326.$ic11$ : module0141.$g1715$.getDynamicValue(var17)), var17);
                    if (module0326.NIL != var24 && module0326.NIL != module0136.f8864() && module0326.NIL == module0141.f9279(var24)) {
                        final SubLObject var25 = module0136.$g1591$.getDynamicValue(var17);
                        if (var25.eql((SubLObject)module0326.$ic12$)) {
                            module0136.f8870((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic15$)) {
                            module0136.f8871((SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                        }
                        else if (var25.eql((SubLObject)module0326.$ic17$)) {
                            Errors.warn((SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                        else {
                            Errors.warn((SubLObject)module0326.$ic18$, module0136.$g1591$.getDynamicValue(var17));
                            Errors.cerror((SubLObject)module0326.$ic16$, (SubLObject)module0326.$ic13$, var24, (SubLObject)module0326.$ic14$);
                        }
                    }
                    final SubLObject var7_328 = module0141.$g1710$.currentBinding(var17);
                    final SubLObject var18_329 = module0141.$g1677$.currentBinding(var17);
                    final SubLObject var19_329 = module0138.$g1619$.currentBinding(var17);
                    try {
                        module0141.$g1710$.bind(module0326.$ic19$, var17);
                        module0141.$g1677$.bind(module0141.f9208(), var17);
                        module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                        final SubLObject var26 = module0139.f9036();
                        final SubLObject var7_329 = module0139.$g1635$.currentBinding(var17);
                        try {
                            module0139.$g1635$.bind((var26 == module0326.$ic20$) ? module0139.$g1635$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                            final SubLObject var7_330 = module0139.$g1636$.currentBinding(var17);
                            try {
                                module0139.$g1636$.bind((var26 == module0326.$ic20$) ? module0139.$g1636$.getDynamicValue(var17) : module0139.f9038(var26), var17);
                                final SubLObject var7_331 = module0141.$g1685$.currentBinding(var17);
                                final SubLObject var18_330 = module0141.$g1686$.currentBinding(var17);
                                final SubLObject var19_330 = module0141.$g1683$.currentBinding(var17);
                                final SubLObject var20_339 = module0141.$g1684$.currentBinding(var17);
                                final SubLObject var21_340 = module0141.$g1674$.currentBinding(var17);
                                try {
                                    module0141.$g1685$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1686$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1683$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1684$.bind((SubLObject)module0326.NIL, var17);
                                    module0141.$g1674$.bind((SubLObject)module0326.NIL, var17);
                                    final SubLObject var27 = module0138.$g1626$.getGlobalValue();
                                    SubLObject var28 = (SubLObject)module0326.NIL;
                                    try {
                                        var28 = ReadWriteLocks.rw_lock_seize_read_lock(var27);
                                        var18 = f22084(var8, module0324.f21931(var9), var2, var16);
                                    }
                                    finally {
                                        if (module0326.NIL != var28) {
                                            ReadWriteLocks.rw_lock_release_read_lock(var27);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var21_340, var17);
                                    module0141.$g1684$.rebind(var20_339, var17);
                                    module0141.$g1683$.rebind(var19_330, var17);
                                    module0141.$g1686$.rebind(var18_330, var17);
                                    module0141.$g1685$.rebind(var7_331, var17);
                                }
                                if (var26 == module0326.$ic21$) {
                                    module0139.f9012(module0139.$g1636$.getDynamicValue(var17));
                                }
                            }
                            finally {
                                module0139.$g1636$.rebind(var7_330, var17);
                            }
                            if (var26 == module0326.$ic21$) {
                                module0139.f9012(module0139.$g1635$.getDynamicValue(var17));
                            }
                        }
                        finally {
                            module0139.$g1635$.rebind(var7_329, var17);
                        }
                    }
                    finally {
                        module0138.$g1619$.rebind(var19_329, var17);
                        module0141.$g1677$.rebind(var18_329, var17);
                        module0141.$g1710$.rebind(var7_328, var17);
                    }
                }
                finally {
                    module0141.$g1715$.rebind(var18_328, var17);
                    module0141.$g1714$.rebind(var7_327, var17);
                }
            }
            finally {
                module0147.$g2096$.rebind(var19_328, var17);
                module0147.$g2094$.rebind(var18_327, var17);
                module0147.$g2095$.rebind(var7_326, var17);
            }
        }
        finally {
            module0137.$g1605$.rebind(var23, var17);
            module0141.$g1674$.rebind(var22, var17);
            module0141.$g1672$.rebind(var21, var17);
            module0141.$g1671$.rebind(var20, var17);
            module0141.$g1670$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f22084(final SubLObject var12, final SubLObject var57, final SubLObject var2, final SubLObject var16) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        SubLObject var59 = (SubLObject)module0326.NIL;
        SubLObject var60 = (SubLObject)module0326.NIL;
        if (module0326.NIL == var60) {
            SubLObject var61;
            SubLObject var62;
            SubLObject var63;
            SubLObject var64;
            SubLObject var65;
            SubLObject var66;
            SubLObject var67;
            SubLObject var7_341;
            SubLObject var68;
            for (var61 = module0326.$g2840$.getGlobalValue(), var62 = (SubLObject)module0326.NIL, var62 = var61.first(); module0326.NIL == var60 && module0326.NIL != var61; var60 = (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != var59 || var62.eql(var16)), var61 = var61.rest(), var62 = var61.first()) {
                var58.resetMultipleValues();
                var63 = module0323.f21882(var12, var2, var62);
                var64 = var58.secondMultipleValue();
                var65 = var58.thirdMultipleValue();
                var58.resetMultipleValues();
                if (module0326.NIL != var63 && module0326.NIL != ((module0326.NIL != module0138.f8972(module0138.f8979())) ? (Numbers.add(var16, Numbers.minus(var62), module0249.f16026(var65)).isNegative() ? module0323.f21852(var64, var57) : module0323.f21853(var64, var57)) : (Numbers.add(var16, Numbers.minus(var62), module0249.f16026(var65)).isNegative() ? module0323.f21854(var64, var57) : module0323.f21855(var64, var57)))) {
                    if (!var12.eql(var63)) {
                        var66 = module0142.$g1735$.currentBinding(var58);
                        var67 = module0142.$g1734$.currentBinding(var58);
                        try {
                            module0142.$g1735$.bind((SubLObject)module0326.NIL, var58);
                            module0142.$g1734$.bind((SubLObject)module0326.NIL, var58);
                            assert module0326.NIL != Types.integerp(Numbers.subtract(var16, module0249.f16026(var65))) : Numbers.subtract(var16, module0249.f16026(var65));
                            var7_341 = module0142.$g1731$.currentBinding(var58);
                            try {
                                module0142.$g1731$.bind(Numbers.subtract(var16, module0249.f16026(var65)), var58);
                                var59 = ((module0326.NIL != module0138.f8972(module0138.f8979())) ? f22085(module0137.f8955(module0326.$ic1$), var12, var63, var2, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED) : f22085(module0137.f8955(module0326.$ic1$), var63, var12, var2, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED));
                            }
                            finally {
                                module0142.$g1731$.rebind(var7_341, var58);
                            }
                        }
                        finally {
                            module0142.$g1734$.rebind(var67, var58);
                            module0142.$g1735$.rebind(var66, var58);
                        }
                    }
                    var68 = module0323.f21872(var63, var65, var64, var2);
                    if (module0326.NIL != var68) {
                        var59 = ConsesLow.append(var59, var68);
                    }
                }
            }
        }
        return module0035.f2269(var59, Symbols.symbol_function((SubLObject)module0326.EQUAL), (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22073(final SubLObject var8, final SubLObject var9, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0326.NIL;
        SubLObject var19 = module0142.$g1735$.currentBinding(var17);
        final SubLObject var20 = module0142.$g1734$.currentBinding(var17);
        try {
            module0142.$g1735$.bind((SubLObject)module0326.NIL, var17);
            module0142.$g1734$.bind((SubLObject)module0326.NIL, var17);
            assert module0326.NIL != Types.integerp(var16) : var16;
            final SubLObject var7_343 = module0142.$g1731$.currentBinding(var17);
            try {
                module0142.$g1731$.bind(var16, var17);
                var18 = f22085(module0137.f8955(module0326.$ic1$), var8, var9, var2, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
            }
            finally {
                module0142.$g1731$.rebind(var7_343, var17);
            }
        }
        finally {
            module0142.$g1734$.rebind(var20, var17);
            module0142.$g1735$.rebind(var19, var17);
        }
        if (module0326.NIL == var18) {
            var19 = module0137.$g1605$.currentBinding(var17);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0326.$ic1$), var17);
                SubLObject var21 = (SubLObject)module0326.NIL;
                if (module0326.NIL == var21) {
                    SubLObject var22;
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var25;
                    SubLObject var26;
                    SubLObject var7_344;
                    SubLObject var345_346;
                    SubLObject var347_348;
                    SubLObject var349_350;
                    SubLObject var27;
                    SubLObject var59_351;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var7_345;
                    SubLObject var353_354;
                    SubLObject var355_356;
                    SubLObject var357_358;
                    SubLObject var7_346;
                    SubLObject var32;
                    SubLObject var7_347;
                    SubLObject var7_348;
                    SubLObject var33;
                    SubLObject var7_349;
                    SubLObject var7_350;
                    SubLObject var7_351;
                    for (var22 = module0326.$g2840$.getGlobalValue(), var23 = (SubLObject)module0326.NIL, var23 = var22.first(); module0326.NIL == var21 && module0326.NIL != var22; var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != var18 || var23.eql(var16)), var22 = var22.rest(), var23 = var22.first()) {
                        var24 = (SubLObject)module0326.NIL;
                        var25 = (SubLObject)module0326.NIL;
                        var26 = (SubLObject)module0326.NIL;
                        var7_344 = module0138.$g1619$.currentBinding(var17);
                        try {
                            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                            var17.resetMultipleValues();
                            var345_346 = module0323.f21882(var8, var2, var23);
                            var347_348 = var17.secondMultipleValue();
                            var349_350 = var17.thirdMultipleValue();
                            var17.resetMultipleValues();
                            var24 = var345_346;
                            var25 = var347_348;
                            var26 = var349_350;
                        }
                        finally {
                            module0138.$g1619$.rebind(var7_344, var17);
                        }
                        if (module0326.NIL != var25) {
                            var27 = (SubLObject)module0326.NIL;
                            if (module0326.NIL == var27) {
                                for (var59_351 = module0326.$g2840$.getGlobalValue(), var28 = (SubLObject)module0326.NIL, var28 = var59_351.first(); module0326.NIL == var27 && module0326.NIL != var59_351; var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0326.NIL != var18 || var28.eql(var16)), var59_351 = var59_351.rest(), var28 = var59_351.first()) {
                                    var29 = (SubLObject)module0326.NIL;
                                    var30 = (SubLObject)module0326.NIL;
                                    var31 = (SubLObject)module0326.NIL;
                                    var7_345 = module0138.$g1619$.currentBinding(var17);
                                    try {
                                        module0138.$g1619$.bind(module0244.f15780(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                                        var17.resetMultipleValues();
                                        var353_354 = module0323.f21882(var9, var2, var28);
                                        var355_356 = var17.secondMultipleValue();
                                        var357_358 = var17.thirdMultipleValue();
                                        var17.resetMultipleValues();
                                        var29 = var353_354;
                                        var30 = var355_356;
                                        var31 = var357_358;
                                    }
                                    finally {
                                        module0138.$g1619$.rebind(var7_345, var17);
                                    }
                                    if (module0326.NIL != var30 && module0326.NIL != (Numbers.add(new SubLObject[] { var16, Numbers.minus(var23), Numbers.minus(var28), module0249.f16026(var26), module0249.f16026(var31) }).isNegative() ? module0323.f21852(var25, var30) : module0323.f21853(var25, var30))) {
                                        if (!var8.eql(var24)) {
                                            var7_346 = module0142.$g1735$.currentBinding(var17);
                                            var32 = module0142.$g1734$.currentBinding(var17);
                                            try {
                                                module0142.$g1735$.bind((SubLObject)module0326.NIL, var17);
                                                module0142.$g1734$.bind((SubLObject)module0326.NIL, var17);
                                                assert module0326.NIL != Types.integerp(var23) : var23;
                                                var7_347 = module0142.$g1731$.currentBinding(var17);
                                                try {
                                                    module0142.$g1731$.bind(var23, var17);
                                                    var18 = f22085(module0137.f8955(module0326.$ic1$), var8, var24, var2, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
                                                }
                                                finally {
                                                    module0142.$g1731$.rebind(var7_347, var17);
                                                }
                                            }
                                            finally {
                                                module0142.$g1734$.rebind(var32, var17);
                                                module0142.$g1735$.rebind(var7_346, var17);
                                            }
                                        }
                                        var7_348 = module0138.$g1619$.currentBinding(var17);
                                        try {
                                            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                                            var33 = module0323.f21872(var24, var26, var25, var2);
                                            if (module0326.NIL != var33) {
                                                var18 = ConsesLow.append(var18, var33);
                                            }
                                        }
                                        finally {
                                            module0138.$g1619$.rebind(var7_348, var17);
                                        }
                                        var7_349 = module0138.$g1619$.currentBinding(var17);
                                        try {
                                            module0138.$g1619$.bind(module0244.f15778(module0137.f8955((SubLObject)module0326.UNPROVIDED)), var17);
                                            var33 = module0323.f21874(var30, var31, var29, var2);
                                            if (module0326.NIL != var33) {
                                                var18 = ConsesLow.append(var18, var33);
                                            }
                                        }
                                        finally {
                                            module0138.$g1619$.rebind(var7_349, var17);
                                        }
                                        if (!var29.eql(var9)) {
                                            var7_350 = module0142.$g1735$.currentBinding(var17);
                                            var32 = module0142.$g1734$.currentBinding(var17);
                                            try {
                                                module0142.$g1735$.bind((SubLObject)module0326.NIL, var17);
                                                module0142.$g1734$.bind((SubLObject)module0326.NIL, var17);
                                                assert module0326.NIL != Types.integerp(var28) : var28;
                                                var7_351 = module0142.$g1731$.currentBinding(var17);
                                                try {
                                                    module0142.$g1731$.bind(var28, var17);
                                                    var18 = ConsesLow.append(var18, f22085(module0137.f8955(module0326.$ic1$), var29, var9, var2, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED));
                                                }
                                                finally {
                                                    module0142.$g1731$.rebind(var7_351, var17);
                                                }
                                            }
                                            finally {
                                                module0142.$g1734$.rebind(var32, var17);
                                                module0142.$g1735$.rebind(var7_350, var17);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            finally {
                module0137.$g1605$.rebind(var19, var17);
            }
        }
        return module0035.f2269(var18, Symbols.symbol_function((SubLObject)module0326.EQUAL), (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22085(final SubLObject var211, final SubLObject var10, final SubLObject var11, SubLObject var2, SubLObject var365, SubLObject var366) {
        if (var2 == module0326.UNPROVIDED) {
            var2 = (SubLObject)module0326.NIL;
        }
        if (var365 == module0326.UNPROVIDED) {
            var365 = (SubLObject)module0326.NIL;
        }
        if (var366 == module0326.UNPROVIDED) {
            var366 = (SubLObject)module0326.NIL;
        }
        return module0035.f2269(Functions.apply(Symbols.symbol_function((SubLObject)module0326.$ic34$), module0252.f16349(var211, var10, var11, var2, var365, var366)), Symbols.symbol_function((SubLObject)module0326.EQUAL), (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED, (SubLObject)module0326.UNPROVIDED);
    }
    
    public static SubLObject f22086() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22023", "S#24645", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22024", "S#24646", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22025", "S#24569", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22029", "S#24570", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22030", "S#24571", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22031", "S#24572", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22032", "S#24576", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22033", "S#24577", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22034", "S#24579", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22035", "S#24573", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22036", "S#24574", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22037", "S#24575", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22038", "S#24578", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22026", "S#24647", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22027", "S#24648", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22039", "S#24649", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22028", "S#24650", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22040", "S#24591", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22043", "S#24582", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22046", "S#24592", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22047", "S#24583", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22048", "S#24593", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22049", "S#24584", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22050", "S#24594", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22051", "S#24585", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22052", "S#24595", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22053", "S#24589", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22041", "S#24651", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22044", "S#24652", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22042", "S#24653", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22045", "S#24654", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22054", "S#24655", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22055", "S#24656", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22056", "S#24586", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22058", "S#24588", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22059", "S#24587", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22061", "S#24596", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22062", "S#24590", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22063", "S#24597", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22057", "S#24657", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22060", "S#24658", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22064", "S#24659", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22065", "S#24660", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22069", "S#24661", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22066", "S#24662", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22067", "S#24663", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22068", "S#24664", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22070", "S#24600", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22074", "S#24601", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22075", "S#24602", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22076", "S#24603", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22077", "S#24607", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22078", "S#24608", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22079", "S#24610", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22080", "S#24604", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22081", "S#24605", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22082", "S#24606", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22083", "S#24609", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22071", "S#24665", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22072", "S#24666", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22084", "S#24667", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22073", "S#24668", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0326", "f22085", "S#24669", 3, 3, false);
        return (SubLObject)module0326.NIL;
    }
    
    public static SubLObject f22087() {
        module0326.$g2840$ = SubLFiles.deflexical("S#24670", (SubLObject)module0326.$ic22$);
        return (SubLObject)module0326.NIL;
    }
    
    public static SubLObject f22088() {
        return (SubLObject)module0326.NIL;
    }
    
    public void declareFunctions() {
        f22086();
    }
    
    public void initializeVariables() {
        f22087();
    }
    
    public void runTopLevelForms() {
        f22088();
    }
    
    static {
        me = (SubLFile)new module0326();
        module0326.$g2840$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("WEAK");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("weak-HL-TimePrecedence"));
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue"));
        $ic3$ = SubLObjectFactory.makeKeyword("STRICT");
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("strict-HL-TimePrecedence"));
        $ic5$ = SubLObjectFactory.makeKeyword("WEAK-SUCCESSOR");
        $ic6$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("weakSuccessor-HL-TimePrecedence"));
        $ic7$ = SubLObjectFactory.makeKeyword("SUCCESSOR-STRICT");
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("successorStrict-HL-TimePrecedence"));
        $ic9$ = SubLObjectFactory.makeInteger(-2);
        $ic10$ = SubLObjectFactory.makeInteger(-3);
        $ic11$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic13$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic14$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic16$ = SubLObjectFactory.makeString("continue anyway");
        $ic17$ = SubLObjectFactory.makeKeyword("WARN");
        $ic18$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $ic20$ = SubLObjectFactory.makeKeyword("OLD");
        $ic21$ = SubLObjectFactory.makeKeyword("RESOURCE");
        $ic22$ = ConsesLow.list((SubLObject)module0326.ZERO_INTEGER, (SubLObject)module0326.MINUS_ONE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-2), (SubLObject)module0326.ONE_INTEGER, (SubLObject)module0326.TWO_INTEGER, (SubLObject)module0326.THREE_INTEGER);
        $ic23$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic24$ = SubLObjectFactory.makeSymbol("S#18870", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24489", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24671", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24673", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#33798D3"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24674", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#33798D3"));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24488", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24489", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24490", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24671", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#33798D3"));
        $ic30$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24677", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24678", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24679", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#33798D3"));
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24484", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24485", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13149", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#33798D3"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#11099", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24671", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#33798D3"));
        $ic34$ = SubLObjectFactory.makeSymbol("APPEND");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0326.class
	Total time: 1400 ms
	
	Decompiled with Procyon 0.5.32.
*/