package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0316 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0316";
    public static final String myFingerPrint = "90c0d6d350c257f028ef02d354edf701e4a32d7254a58765c42c5c352a3e24d1";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    
    public static SubLObject f21361(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0316.$ic0$, (SubLObject)module0316.$ic1$, ConsesLow.append(var5, (SubLObject)module0316.NIL));
    }
    
    public static SubLObject f21362(final SubLObject var6, final SubLObject var7, SubLObject var8, SubLObject var9, SubLObject var10, SubLObject var11, SubLObject var12) {
        if (var8 == module0316.UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        if (var9 == module0316.UNPROVIDED) {
            var9 = module0012.$g49$.getGlobalValue();
        }
        if (var10 == module0316.UNPROVIDED) {
            var10 = module0012.$g49$.getGlobalValue();
        }
        if (var11 == module0316.UNPROVIDED) {
            var11 = module0012.$g49$.getGlobalValue();
        }
        if (var12 == module0316.UNPROVIDED) {
            var12 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        SubLObject var14 = (SubLObject)module0316.NIL;
        final SubLObject var15 = f21363(var7, var8, var9, var10, var11, var12);
        final SubLObject var16 = module0147.$g2095$.currentBinding(var13);
        final SubLObject var17 = module0147.$g2094$.currentBinding(var13);
        final SubLObject var18 = module0147.$g2096$.currentBinding(var13);
        try {
            module0147.$g2095$.bind(module0147.f9545(var15), var13);
            module0147.$g2094$.bind(module0147.f9546(var15), var13);
            module0147.$g2096$.bind(module0147.f9549(var15), var13);
            if (module0316.NIL != module0226.f14800(var6) || module0316.NIL != module0145.$g1916$.getDynamicValue(var13)) {
                final SubLObject var19 = f21364(var7);
                if (var19.isFunctionSpec()) {
                    final SubLObject var16_20 = module0145.$g1888$.currentBinding(var13);
                    final SubLObject var17_21 = module0145.$g1891$.currentBinding(var13);
                    final SubLObject var18_22 = module0145.$g1892$.currentBinding(var13);
                    try {
                        module0145.$g1888$.bind(var6, var13);
                        module0145.$g1891$.bind(f21365(var6), var13);
                        module0145.$g1892$.bind(f21366(var6), var13);
                        if (module0316.NIL != module0145.$g1924$.getDynamicValue(var13)) {
                            var14 = f21367(var19, var8, var9, var10, var11, var12);
                        }
                        else {
                            final SubLObject var16_21 = module0145.$g1924$.currentBinding(var13);
                            try {
                                module0145.$g1924$.bind(module0139.f9007(), var13);
                                var14 = f21367(var19, var8, var9, var10, var11, var12);
                                module0139.f9011(module0145.$g1924$.getDynamicValue(var13));
                            }
                            finally {
                                module0145.$g1924$.rebind(var16_21, var13);
                            }
                        }
                    }
                    finally {
                        module0145.$g1892$.rebind(var18_22, var13);
                        module0145.$g1891$.rebind(var17_21, var13);
                        module0145.$g1888$.rebind(var16_20, var13);
                    }
                }
            }
            else {
                module0313.f21151((SubLObject)module0316.THREE_INTEGER, (SubLObject)module0316.$ic2$, var6, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
            }
        }
        finally {
            module0147.$g2096$.rebind(var18, var13);
            module0147.$g2094$.rebind(var17, var13);
            module0147.$g2095$.rebind(var16, var13);
        }
        return var14;
    }
    
    public static SubLObject f21368(final SubLObject var6, final SubLObject var7, final SubLObject var24, SubLObject var8, SubLObject var9, SubLObject var10) {
        if (var8 == module0316.UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        if (var9 == module0316.UNPROVIDED) {
            var9 = module0012.$g49$.getGlobalValue();
        }
        if (var10 == module0316.UNPROVIDED) {
            var10 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0316.NIL;
        final SubLObject var27 = module0147.$g2094$.currentBinding(var25);
        final SubLObject var28 = module0147.$g2095$.currentBinding(var25);
        try {
            module0147.$g2094$.bind((SubLObject)module0316.$ic3$, var25);
            module0147.$g2095$.bind(var24, var25);
            var26 = f21362(var6, var7, var8, var9, var10, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var28, var25);
            module0147.$g2094$.rebind(var27, var25);
        }
        return var26;
    }
    
    public static SubLObject f21369(final SubLObject var6, final SubLObject var7, SubLObject var8, SubLObject var9, SubLObject var10) {
        if (var8 == module0316.UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        if (var9 == module0316.UNPROVIDED) {
            var9 = module0012.$g49$.getGlobalValue();
        }
        if (var10 == module0316.UNPROVIDED) {
            var10 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0316.NIL;
        final SubLObject var13 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var14 = module0147.$g2095$.currentBinding(var11);
        try {
            module0147.$g2094$.bind((SubLObject)module0316.$ic4$, var11);
            module0147.$g2095$.bind(module0316.$ic5$, var11);
            var12 = f21362(var6, var7, var8, var9, var10, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var14, var11);
            module0147.$g2094$.rebind(var13, var11);
        }
        return var12;
    }
    
    public static SubLObject f21370(final SubLObject var25, final SubLObject var7, SubLObject var8, SubLObject var9, SubLObject var10, SubLObject var11, SubLObject var12) {
        if (var8 == module0316.UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        if (var9 == module0316.UNPROVIDED) {
            var9 = module0012.$g49$.getGlobalValue();
        }
        if (var10 == module0316.UNPROVIDED) {
            var10 = module0012.$g49$.getGlobalValue();
        }
        if (var11 == module0316.UNPROVIDED) {
            var11 = module0012.$g49$.getGlobalValue();
        }
        if (var12 == module0316.UNPROVIDED) {
            var12 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        f21371();
        if (module0316.NIL == f21372(var25)) {
            module0145.$g1943$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0316.$ic6$, (SubLObject)module0316.$ic7$, var25), module0145.$g1943$.getDynamicValue(var26)), var26);
            return (SubLObject)module0316.NIL;
        }
        final SubLObject var27 = f21364(var7);
        if (!var27.isFunctionSpec()) {
            module0145.$g1943$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0316.$ic8$, (SubLObject)module0316.$ic9$, var7), module0145.$g1943$.getDynamicValue(var26)), var26);
            return (SubLObject)module0316.NIL;
        }
        SubLObject var28 = (SubLObject)module0316.NIL;
        final SubLObject var29 = f21373(var25);
        final SubLObject var30 = f21374(var25);
        final SubLObject var31 = module0147.$g2094$.currentBinding(var26);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var26);
        try {
            module0147.$g2094$.bind(module0147.f9531(var30), var26);
            module0147.$g2095$.bind(module0147.f9534(var30), var26);
            if (module0316.NIL != var29) {
                if (module0316.NIL != module0035.f1997(var29)) {
                    SubLObject var34;
                    final SubLObject var33 = var34 = var29.first();
                    SubLObject var35 = (SubLObject)module0316.NIL;
                    SubLObject var36 = (SubLObject)module0316.NIL;
                    SubLObject var37 = (SubLObject)module0316.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0316.$ic10$);
                    var35 = var34.first();
                    var34 = var34.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0316.$ic10$);
                    var36 = var34.first();
                    var34 = var34.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0316.$ic10$);
                    var37 = var34.first();
                    var34 = var34.rest();
                    if (module0316.NIL == var34) {
                        var28 = f21375(var27, var8, var9, var10, var11, var12, var35, var36, var37);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0316.$ic10$);
                    }
                }
                else {
                    var28 = f21376(var27, var8, var9, var10, var11, var12, var29);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var32, var26);
            module0147.$g2094$.rebind(var31, var26);
        }
        return var28;
    }
    
    public static SubLObject f21375(final SubLObject var19, final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var11, final SubLObject var12, final SubLObject var6, final SubLObject var30, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0316.NIL;
        final SubLObject var34 = module0145.$g1888$.currentBinding(var32);
        final SubLObject var35 = module0145.$g1894$.currentBinding(var32);
        final SubLObject var36 = module0145.$g1891$.currentBinding(var32);
        final SubLObject var37 = module0145.$g1892$.currentBinding(var32);
        try {
            module0145.$g1888$.bind(var6, var32);
            module0145.$g1894$.bind((SubLObject)module0316.$ic11$, var32);
            module0145.$g1891$.bind(var30, var32);
            module0145.$g1892$.bind(var31, var32);
            var33 = f21367(var19, var8, var9, var10, var11, var12);
        }
        finally {
            module0145.$g1892$.rebind(var37, var32);
            module0145.$g1891$.rebind(var36, var32);
            module0145.$g1894$.rebind(var35, var32);
            module0145.$g1888$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f21376(final SubLObject var19, final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var11, final SubLObject var12, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)module0316.NIL;
        final SubLObject var29 = module0145.$g1893$.currentBinding(var27);
        final SubLObject var30 = module0145.$g1894$.currentBinding(var27);
        try {
            module0145.$g1893$.bind(var26, var27);
            module0145.$g1894$.bind((SubLObject)module0316.$ic12$, var27);
            var28 = f21367(var19, var8, var9, var10, var11, var12);
        }
        finally {
            module0145.$g1894$.rebind(var30, var27);
            module0145.$g1893$.rebind(var29, var27);
        }
        return var28;
    }
    
    public static SubLObject f21367(final SubLObject var19, final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        if (module0316.NIL != module0012.f421(var8)) {
            return Functions.funcall(var19);
        }
        if (module0316.NIL != module0012.f421(var9)) {
            return Functions.funcall(var19, var8);
        }
        if (module0316.NIL != module0012.f421(var10)) {
            return Functions.funcall(var19, var8, var9);
        }
        if (module0316.NIL != module0012.f421(var11)) {
            return Functions.funcall(var19, var8, var9, var10);
        }
        if (module0316.NIL != module0012.f421(var12)) {
            return Functions.funcall(var19, var8, var9, var10, var11);
        }
        return Functions.funcall(var19, var8, var9, var10, var11, var12);
    }
    
    public static SubLObject f21371() {
        module0145.$g1943$.setDynamicValue((SubLObject)module0316.NIL);
        return (SubLObject)module0316.NIL;
    }
    
    public static SubLObject f21364(final SubLObject var7) {
        final SubLObject var8 = conses_high.second(conses_high.assoc(var7, module0145.$g1884$.getGlobalValue(), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED));
        if (var8.isFunctionSpec()) {
            return var8;
        }
        if (module0316.NIL != var8) {
            module0313.f21151((SubLObject)module0316.THREE_INTEGER, (SubLObject)module0316.$ic13$, var7, var8, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
        }
        else {
            module0313.f21151((SubLObject)module0316.THREE_INTEGER, (SubLObject)module0316.$ic14$, var7, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
        }
        return (SubLObject)module0316.NIL;
    }
    
    public static SubLObject f21377(final SubLObject var7) {
        return conses_high.third(conses_high.assoc(var7, module0145.$g1884$.getGlobalValue(), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED));
    }
    
    public static SubLObject f21378(final SubLObject var34, final SubLObject var35) {
        if (module0316.NIL != module0004.f104((SubLObject)module0316.$ic15$, conses_high.member((SubLObject)module0316.$ic16$, var35, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED) && module0316.NIL != module0161.f10480(var34)) {
            return conses_high.subst((SubLObject)ConsesLow.list((SubLObject)module0316.$ic15$, var34), (SubLObject)module0316.$ic15$, var35, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
        }
        return var35;
    }
    
    public static SubLObject f21379(final SubLObject var7) {
        return Sequences.position((SubLObject)module0316.$ic15$, Sequences.remove((SubLObject)module0316.$ic16$, conses_high.third(conses_high.assoc(var7, module0145.$g1884$.getGlobalValue(), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED)), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
    }
    
    public static SubLObject f21363(final SubLObject var7, SubLObject var8, SubLObject var9, SubLObject var10, SubLObject var11, SubLObject var12) {
        if (var8 == module0316.UNPROVIDED) {
            var8 = (SubLObject)module0316.NIL;
        }
        if (var9 == module0316.UNPROVIDED) {
            var9 = (SubLObject)module0316.NIL;
        }
        if (var10 == module0316.UNPROVIDED) {
            var10 = (SubLObject)module0316.NIL;
        }
        if (var11 == module0316.UNPROVIDED) {
            var11 = (SubLObject)module0316.NIL;
        }
        if (var12 == module0316.UNPROVIDED) {
            var12 = (SubLObject)module0316.NIL;
        }
        SubLObject var13 = (SubLObject)module0316.NIL;
        final SubLObject var14 = f21379(var7);
        if (var14.eql((SubLObject)module0316.ZERO_INTEGER)) {
            var13 = var8;
        }
        else if (var14.eql((SubLObject)module0316.ONE_INTEGER)) {
            var13 = var9;
        }
        else if (var14.eql((SubLObject)module0316.TWO_INTEGER)) {
            var13 = var10;
        }
        else if (var14.eql((SubLObject)module0316.THREE_INTEGER)) {
            var13 = var11;
        }
        else if (var14.eql((SubLObject)module0316.FOUR_INTEGER)) {
            var13 = var12;
        }
        if (module0316.NIL != module0161.f10481(var13)) {
            return var13;
        }
        return (SubLObject)module0316.NIL;
    }
    
    public static SubLObject f21380(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        return module0004.f104(var37, module0145.$g1885$.getDynamicValue(var38), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
    }
    
    public static SubLObject f21372(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        return module0004.f104(var37, module0145.$g1887$.getDynamicValue(var38), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED);
    }
    
    public static SubLObject f21381(final SubLObject var25) {
        return Symbols.get(var25, (SubLObject)module0316.$ic17$, (SubLObject)module0316.UNPROVIDED);
    }
    
    public static SubLObject f21374(final SubLObject var25) {
        return Symbols.get(var25, (SubLObject)module0316.$ic18$, (SubLObject)module0316.UNPROVIDED);
    }
    
    public static SubLObject f21382(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = Symbols.get(var25, (SubLObject)module0316.$ic19$, (SubLObject)module0316.UNPROVIDED);
        if (module0316.NIL != var27) {
            return var27;
        }
        final SubLObject var28 = Symbols.get(var25, (SubLObject)module0316.$ic17$, (SubLObject)module0316.UNPROVIDED);
        if (module0316.NIL != var28) {
            return f21365(var28);
        }
        return module0145.$g1891$.getDynamicValue(var26);
    }
    
    public static SubLObject f21383(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = Symbols.get(var25, (SubLObject)module0316.$ic20$, (SubLObject)module0316.UNPROVIDED);
        if (module0316.NIL != var27) {
            return var27;
        }
        final SubLObject var28 = Symbols.get(var25, (SubLObject)module0316.$ic17$, (SubLObject)module0316.UNPROVIDED);
        if (module0316.NIL != var28) {
            return f21366(var28);
        }
        return module0145.$g1892$.getDynamicValue(var26);
    }
    
    public static SubLObject f21365(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0226.f15068(var6, (SubLObject)module0316.UNPROVIDED);
        if (module0316.NIL != var8) {
            return var8;
        }
        return module0145.$g1891$.getDynamicValue(var7);
    }
    
    public static SubLObject f21366(final SubLObject var6) {
        if (f21365(var6).numE((SubLObject)module0316.TWO_INTEGER)) {
            return (SubLObject)module0316.ONE_INTEGER;
        }
        return (SubLObject)module0316.TWO_INTEGER;
    }
    
    public static SubLObject f21373(final SubLObject var25) {
        final SubLObject var26 = Symbols.get(var25, (SubLObject)module0316.$ic12$, (SubLObject)module0316.UNPROVIDED);
        if (module0316.NIL != var26) {
            return var26;
        }
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(f21381(var25), f21382(var25), f21383(var25)));
    }
    
    public static SubLObject f21384(final SubLObject var25, final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        SubLObject var42 = module0145.$g1886$.getDynamicValue(var41);
        SubLObject var43 = (SubLObject)module0316.NIL;
        var43 = var42.first();
        while (module0316.NIL != var42) {
            Symbols.remprop(var25, var43);
            var42 = var42.rest();
            var43 = var42.first();
        }
        SubLObject var44 = (SubLObject)module0316.NIL;
        SubLObject var45 = (SubLObject)module0316.NIL;
        SubLObject var46 = (SubLObject)module0316.NIL;
        var44 = var40;
        var45 = var44.first();
        var46 = conses_high.second(var44);
        while (module0316.NIL != var44) {
            if (module0316.NIL == Errors.$ignore_mustsP$.getDynamicValue(var41) && module0316.NIL == module0004.f104(var45, module0145.$g1886$.getDynamicValue(var41), (SubLObject)module0316.UNPROVIDED, (SubLObject)module0316.UNPROVIDED)) {
                Errors.error((SubLObject)module0316.$ic21$, var45);
            }
            Symbols.put(var25, var45, var46);
            var44 = conses_high.cddr(var44);
            var45 = var44.first();
            var46 = conses_high.second(var44);
        }
        return var25;
    }
    
    public static SubLObject f21385() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0316", "f21361", "S#23891");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21362", "GTM", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21368", "S#23892", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21369", "S#23893", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21370", "S#23894", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21375", "S#23895", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21376", "S#23896", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21367", "S#23897", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21371", "S#23898", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21364", "S#23899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21377", "S#23900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21378", "S#11998", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21379", "S#23901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21363", "S#23902", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21380", "S#23903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21372", "S#23904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21381", "S#23905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21374", "S#23906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21382", "S#23907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21383", "S#23908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21365", "S#23909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21366", "S#23910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21373", "S#23911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0316", "f21384", "S#12137", 2, 0, false);
        return (SubLObject)module0316.NIL;
    }
    
    public static SubLObject f21386() {
        return (SubLObject)module0316.NIL;
    }
    
    public static SubLObject f21387() {
        return (SubLObject)module0316.NIL;
    }
    
    public void declareFunctions() {
        f21385();
    }
    
    public void initializeVariables() {
        f21386();
    }
    
    public void runTopLevelForms() {
        f21387();
    }
    
    static {
        me = (SubLFile)new module0316();
        $ic0$ = SubLObjectFactory.makeSymbol("S#11279", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#12047", "CYC");
        $ic2$ = SubLObjectFactory.makeString("~s is not a transitive predicate");
        $ic3$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic6$ = SubLObjectFactory.makeKeyword("INVALID-MODULE");
        $ic7$ = SubLObjectFactory.makeString("~s is not a valid transitivity module.");
        $ic8$ = SubLObjectFactory.makeKeyword("INVALID-METHOD");
        $ic9$ = SubLObjectFactory.makeString("~s is not a valid gt method.");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"));
        $ic11$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic12$ = SubLObjectFactory.makeKeyword("ACCESSORS");
        $ic13$ = SubLObjectFactory.makeString("method ~s maps into illegal gt function ~s)");
        $ic14$ = SubLObjectFactory.makeString("illegal transitivity method: ~s");
        $ic15$ = SubLObjectFactory.makeSymbol("S#11445", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $ic17$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic18$ = SubLObjectFactory.makeKeyword("MT");
        $ic19$ = SubLObjectFactory.makeKeyword("INDEX-ARG");
        $ic20$ = SubLObjectFactory.makeKeyword("GATHER-ARG");
        $ic21$ = SubLObjectFactory.makeString("~s was not a valid transitivity-module parameter");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0316.class
	Total time: 155 ms
	
	Decompiled with Procyon 0.5.32.
*/