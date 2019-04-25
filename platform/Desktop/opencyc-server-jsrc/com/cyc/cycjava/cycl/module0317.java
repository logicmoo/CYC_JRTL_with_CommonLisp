package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0317 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0317";
    public static final String myFingerPrint = "6527f4e1f1ed85fdaf5f35761a299cc817cf2218d179f3e32ba12825e435be7b";
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    
    
    public static SubLObject f21388(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var4 == UNPROVIDED) {
            var4 = module0012.$g49$.getGlobalValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0012.$g49$.getGlobalValue();
        }
        if (var6 == UNPROVIDED) {
            var6 = module0012.$g49$.getGlobalValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = module0012.$g49$.getGlobalValue();
        }
        if (var8 == UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0316.f21363(var3, var4, var5, var6, var7, var8);
        final SubLObject var12 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind(module0147.f9531(var11), var9);
            module0147.$g2095$.bind(module0147.f9534(var11), var9);
            if (NIL != f21389(var1, var2, (SubLObject)UNPROVIDED)) {
                final SubLObject var12_14 = module0145.$g1948$.currentBinding(var9);
                final SubLObject var13_15 = module0145.$g1951$.currentBinding(var9);
                final SubLObject var14 = module0145.$g1952$.currentBinding(var9);
                final SubLObject var15 = module0145.$g1888$.currentBinding(var9);
                final SubLObject var16 = module0145.$g1891$.currentBinding(var9);
                final SubLObject var17 = module0145.$g1892$.currentBinding(var9);
                final SubLObject var18 = module0145.$g1955$.currentBinding(var9);
                try {
                    module0145.$g1948$.bind(var1, var9);
                    module0145.$g1951$.bind((SubLObject)TWO_INTEGER, var9);
                    module0145.$g1952$.bind((SubLObject)ONE_INTEGER, var9);
                    module0145.$g1888$.bind(var2, var9);
                    module0145.$g1891$.bind((SubLObject)ONE_INTEGER, var9);
                    module0145.$g1892$.bind((SubLObject)TWO_INTEGER, var9);
                    module0145.$g1955$.bind(module0226.f14800(module0145.$g1888$.getDynamicValue(var9)), var9);
                    var10 = f21390(var3, var4, var5, var6, var7, var8);
                }
                finally {
                    module0145.$g1955$.rebind(var18, var9);
                    module0145.$g1892$.rebind(var17, var9);
                    module0145.$g1891$.rebind(var16, var9);
                    module0145.$g1888$.rebind(var15, var9);
                    module0145.$g1952$.rebind(var14, var9);
                    module0145.$g1951$.rebind(var13_15, var9);
                    module0145.$g1948$.rebind(var12_14, var9);
                }
            }
            else {
                module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic0$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2095$.rebind(var13, var9);
            module0147.$g2094$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f21391(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var4 == UNPROVIDED) {
            var4 = module0012.$g49$.getGlobalValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0012.$g49$.getGlobalValue();
        }
        if (var6 == UNPROVIDED) {
            var6 = module0012.$g49$.getGlobalValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = module0012.$g49$.getGlobalValue();
        }
        if (var8 == UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0316.f21363(var3, var4, var5, var6, var7, var8);
        final SubLObject var12 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind(module0147.f9531(var11), var9);
            module0147.$g2095$.bind(module0147.f9534(var11), var9);
            if (NIL != module0145.f9479() || NIL != f21392(var1, var2, (SubLObject)UNPROVIDED)) {
                final SubLObject var12_21 = module0145.$g1948$.currentBinding(var9);
                final SubLObject var13_22 = module0145.$g1951$.currentBinding(var9);
                final SubLObject var14 = module0145.$g1952$.currentBinding(var9);
                final SubLObject var15 = module0145.$g1888$.currentBinding(var9);
                final SubLObject var16 = module0145.$g1891$.currentBinding(var9);
                final SubLObject var17 = module0145.$g1892$.currentBinding(var9);
                final SubLObject var18 = module0145.$g1955$.currentBinding(var9);
                try {
                    module0145.$g1948$.bind(var1, var9);
                    module0145.$g1951$.bind((SubLObject)ONE_INTEGER, var9);
                    module0145.$g1952$.bind((SubLObject)TWO_INTEGER, var9);
                    module0145.$g1888$.bind(var2, var9);
                    module0145.$g1891$.bind((SubLObject)ONE_INTEGER, var9);
                    module0145.$g1892$.bind((SubLObject)TWO_INTEGER, var9);
                    module0145.$g1955$.bind(module0226.f14800(module0145.$g1888$.getDynamicValue(var9)), var9);
                    var10 = f21390(var3, var4, var5, var6, var7, var8);
                }
                finally {
                    module0145.$g1955$.rebind(var18, var9);
                    module0145.$g1892$.rebind(var17, var9);
                    module0145.$g1891$.rebind(var16, var9);
                    module0145.$g1888$.rebind(var15, var9);
                    module0145.$g1952$.rebind(var14, var9);
                    module0145.$g1951$.rebind(var13_22, var9);
                    module0145.$g1948$.rebind(var12_21, var9);
                }
            }
            else {
                module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic1$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2095$.rebind(var13, var9);
            module0147.$g2094$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f21393(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var4 == UNPROVIDED) {
            var4 = module0012.$g49$.getGlobalValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0012.$g49$.getGlobalValue();
        }
        if (var6 == UNPROVIDED) {
            var6 = module0012.$g49$.getGlobalValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = module0012.$g49$.getGlobalValue();
        }
        if (var8 == UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0316.f21363(var3, var4, var5, var6, var7, var8);
        final SubLObject var12 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind(module0147.f9531(var11), var9);
            module0147.$g2095$.bind(module0147.f9534(var11), var9);
            if (NIL != f21394(var1, var2, (SubLObject)UNPROVIDED)) {
                final SubLObject var12_23 = module0145.$g1948$.currentBinding(var9);
                final SubLObject var13_24 = module0145.$g1951$.currentBinding(var9);
                final SubLObject var14 = module0145.$g1952$.currentBinding(var9);
                final SubLObject var15 = module0145.$g1888$.currentBinding(var9);
                final SubLObject var16 = module0145.$g1891$.currentBinding(var9);
                final SubLObject var17 = module0145.$g1892$.currentBinding(var9);
                final SubLObject var18 = module0145.$g1955$.currentBinding(var9);
                try {
                    module0145.$g1948$.bind(var1, var9);
                    module0145.$g1951$.bind((SubLObject)TWO_INTEGER, var9);
                    module0145.$g1952$.bind((SubLObject)ONE_INTEGER, var9);
                    module0145.$g1888$.bind(var2, var9);
                    module0145.$g1891$.bind((SubLObject)TWO_INTEGER, var9);
                    module0145.$g1892$.bind((SubLObject)ONE_INTEGER, var9);
                    module0145.$g1955$.bind(module0226.f14800(module0145.$g1888$.getDynamicValue(var9)), var9);
                    var10 = f21390(var3, var4, var5, var6, var7, var8);
                }
                finally {
                    module0145.$g1955$.rebind(var18, var9);
                    module0145.$g1892$.rebind(var17, var9);
                    module0145.$g1891$.rebind(var16, var9);
                    module0145.$g1888$.rebind(var15, var9);
                    module0145.$g1952$.rebind(var14, var9);
                    module0145.$g1951$.rebind(var13_24, var9);
                    module0145.$g1948$.rebind(var12_23, var9);
                }
            }
            else {
                module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic2$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2095$.rebind(var13, var9);
            module0147.$g2094$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f21395(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var4 == UNPROVIDED) {
            var4 = module0012.$g49$.getGlobalValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0012.$g49$.getGlobalValue();
        }
        if (var6 == UNPROVIDED) {
            var6 = module0012.$g49$.getGlobalValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = module0012.$g49$.getGlobalValue();
        }
        if (var8 == UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = module0316.f21363(var3, var4, var5, var6, var7, var8);
        final SubLObject var12 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind(module0147.f9531(var11), var9);
            module0147.$g2095$.bind(module0147.f9534(var11), var9);
            if (NIL != f21396(var1, var2, (SubLObject)UNPROVIDED)) {
                final SubLObject var12_25 = module0145.$g1948$.currentBinding(var9);
                final SubLObject var13_26 = module0145.$g1951$.currentBinding(var9);
                final SubLObject var14 = module0145.$g1952$.currentBinding(var9);
                final SubLObject var15 = module0145.$g1888$.currentBinding(var9);
                final SubLObject var16 = module0145.$g1891$.currentBinding(var9);
                final SubLObject var17 = module0145.$g1892$.currentBinding(var9);
                final SubLObject var18 = module0145.$g1955$.currentBinding(var9);
                try {
                    module0145.$g1948$.bind(var1, var9);
                    module0145.$g1951$.bind((SubLObject)ONE_INTEGER, var9);
                    module0145.$g1952$.bind((SubLObject)TWO_INTEGER, var9);
                    module0145.$g1888$.bind(var2, var9);
                    module0145.$g1891$.bind((SubLObject)TWO_INTEGER, var9);
                    module0145.$g1892$.bind((SubLObject)ONE_INTEGER, var9);
                    module0145.$g1955$.bind(module0226.f14800(module0145.$g1888$.getDynamicValue(var9)), var9);
                    var10 = f21390(var3, var4, var5, var6, var7, var8);
                }
                finally {
                    module0145.$g1955$.rebind(var18, var9);
                    module0145.$g1892$.rebind(var17, var9);
                    module0145.$g1891$.rebind(var16, var9);
                    module0145.$g1888$.rebind(var15, var9);
                    module0145.$g1952$.rebind(var14, var9);
                    module0145.$g1951$.rebind(var13_26, var9);
                    module0145.$g1948$.rebind(var12_25, var9);
                }
            }
            else {
                module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic3$, var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0147.$g2095$.rebind(var13, var9);
            module0147.$g2094$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f21389(final SubLObject var1, final SubLObject var2, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return module0220.f14587((SubLObject)ConsesLow.listS($ic4$, var1, var2, (SubLObject)$ic5$), var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21392(final SubLObject var1, final SubLObject var2, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return module0220.f14587((SubLObject)ConsesLow.listS($ic4$, var1, var2, (SubLObject)$ic6$), var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21394(final SubLObject var1, final SubLObject var2, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return module0220.f14587((SubLObject)ConsesLow.listS($ic7$, var1, var2, (SubLObject)$ic5$), var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21396(final SubLObject var1, final SubLObject var2, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return module0220.f14587((SubLObject)ConsesLow.listS($ic7$, var1, var2, (SubLObject)$ic6$), var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21397(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return module0004.f104(var28, module0145.$g1945$.getDynamicValue(var29), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21390(final SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var4 == UNPROVIDED) {
            var4 = module0012.$g49$.getGlobalValue();
        }
        if (var5 == UNPROVIDED) {
            var5 = module0012.$g49$.getGlobalValue();
        }
        if (var6 == UNPROVIDED) {
            var6 = module0012.$g49$.getGlobalValue();
        }
        if (var7 == UNPROVIDED) {
            var7 = module0012.$g49$.getGlobalValue();
        }
        if (var8 == UNPROVIDED) {
            var8 = module0012.$g49$.getGlobalValue();
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        final SubLObject var11 = f21398(var3);
        if (var11.isFunctionSpec()) {
            if (NIL != module0145.$g1924$.getDynamicValue(var9)) {
                var10 = module0316.f21367(var11, var4, var5, var6, var7, var8);
            }
            else {
                final SubLObject var12 = module0145.$g1925$.currentBinding(var9);
                final SubLObject var13 = module0145.$g1924$.currentBinding(var9);
                try {
                    module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var9), var9);
                    module0145.$g1924$.bind((SubLObject)NIL, var9);
                    module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var9);
                    var10 = module0316.f21367(var11, var4, var5, var6, var7, var8);
                }
                finally {
                    module0145.$g1924$.rebind(var13, var9);
                    module0145.$g1925$.rebind(var12, var9);
                }
            }
        }
        else {
            module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic9$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var10;
    }
    
    public static SubLObject f21398(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = conses_high.second(conses_high.assoc(var3, module0145.$g1944$.getDynamicValue(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (var5.isFunctionSpec()) {
            return var5;
        }
        if (NIL != var5) {
            module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic10$, var3, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic11$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21399(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return conses_high.third(conses_high.assoc(var3, module0145.$g1944$.getDynamicValue(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f21400(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        return Sequences.position((SubLObject)$ic12$, Sequences.remove((SubLObject)$ic13$, conses_high.third(conses_high.assoc(var3, module0145.$g1944$.getDynamicValue(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21401(final SubLObject var31, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = module0145.$g1947$.getDynamicValue(var33);
        SubLObject var35 = (SubLObject)NIL;
        var35 = var34.first();
        while (NIL != var34) {
            Symbols.remprop(var31, var35);
            var34 = var34.rest();
            var35 = var34.first();
        }
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        SubLObject var38 = (SubLObject)NIL;
        var36 = var32;
        var37 = var36.first();
        var38 = conses_high.second(var36);
        while (NIL != var36) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var33) && NIL == module0004.f104(var37, module0145.$g1947$.getDynamicValue(var33), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic14$, var37);
            }
            Symbols.put(var31, var37, var38);
            var36 = conses_high.cddr(var36);
            var37 = var36.first();
            var38 = conses_high.second(var36);
        }
        return var31;
    }
    
    public static SubLObject f21402(final SubLObject var1, final SubLObject var2, final SubLObject var38, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21388(var1, var2, (SubLObject)$ic15$, var38, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21403(final SubLObject var1, final SubLObject var2, final SubLObject var38, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21391(var1, var2, (SubLObject)$ic15$, var38, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21404(final SubLObject var1, final SubLObject var2, final SubLObject var38, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21393(var1, var2, (SubLObject)$ic15$, var38, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21405(final SubLObject var1, final SubLObject var2, final SubLObject var38, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21395(var1, var2, (SubLObject)$ic15$, var38, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21406(final SubLObject var38, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)NIL;
        final SubLObject var41 = var27;
        final SubLObject var42 = module0147.$g2094$.currentBinding(var39);
        final SubLObject var43 = module0147.$g2095$.currentBinding(var39);
        try {
            module0147.$g2094$.bind(module0147.f9531(var41), var39);
            module0147.$g2095$.bind(module0147.f9534(var41), var39);
            SubLObject var44 = (SubLObject)NIL;
            try {
                var39.throwStack.push($ic16$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var39) && NIL == module0145.$g1942$.getDynamicValue(var39) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var39)) {
                    module0313.f21154(var38, (SubLObject)$ic17$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var39) && NIL == module0313.f21138((SubLObject)$ic18$)) {
                    Errors.error((SubLObject)$ic19$, (SubLObject)$ic18$);
                }
                final SubLObject var12_41 = module0145.$g1895$.currentBinding(var39);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic18$, var39);
                    assert NIL != module0130.f8511((SubLObject)$ic20$) : $ic20$;
                    final SubLObject var12_42 = module0145.$g1897$.currentBinding(var39);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic20$, var39);
                        final SubLObject var45 = module0138.$g1626$.getGlobalValue();
                        SubLObject var46 = (SubLObject)NIL;
                        try {
                            var46 = ReadWriteLocks.rw_lock_seize_read_lock(var45);
                            var40 = module0314.f21177(var38);
                            if (module0145.$g1941$.getDynamicValue(var39).numGE((SubLObject)FIVE_INTEGER)) {
                                final SubLObject var47 = module0249.f16081((SubLObject)UNPROVIDED);
                                if (NIL != var47) {
                                    module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic22$, Sequences.length(var47), var47, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            if (NIL != var46) {
                                ReadWriteLocks.rw_lock_release_read_lock(var45);
                            }
                        }
                    }
                    finally {
                        module0145.$g1897$.rebind(var12_42, var39);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var12_41, var39);
                }
            }
            catch (Throwable var48) {
                var44 = Errors.handleThrowable(var48, (SubLObject)$ic16$);
            }
            finally {
                var39.throwStack.pop();
            }
        }
        finally {
            module0147.$g2095$.rebind(var43, var39);
            module0147.$g2094$.rebind(var42, var39);
        }
        return var40;
    }
    
    public static SubLObject f21407(final SubLObject var1, final SubLObject var2, final SubLObject var47, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21388(var1, var2, (SubLObject)$ic23$, var47, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21408(final SubLObject var1, final SubLObject var2, final SubLObject var47, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21391(var1, var2, (SubLObject)$ic23$, var47, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21409(final SubLObject var1, final SubLObject var2, final SubLObject var47, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21393(var1, var2, (SubLObject)$ic23$, var47, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21410(final SubLObject var1, final SubLObject var2, final SubLObject var47, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21395(var1, var2, (SubLObject)$ic23$, var47, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21411(final SubLObject var47, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)NIL;
        final SubLObject var50 = var27;
        final SubLObject var51 = module0147.$g2094$.currentBinding(var48);
        final SubLObject var52 = module0147.$g2095$.currentBinding(var48);
        try {
            module0147.$g2094$.bind(module0147.f9531(var50), var48);
            module0147.$g2095$.bind(module0147.f9534(var50), var48);
            SubLObject var53 = (SubLObject)NIL;
            try {
                var48.throwStack.push($ic16$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var48) && NIL == module0145.$g1942$.getDynamicValue(var48) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var48)) {
                    module0313.f21154(var47, (SubLObject)$ic24$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var48) && NIL == module0313.f21138((SubLObject)$ic25$)) {
                    Errors.error((SubLObject)$ic19$, (SubLObject)$ic25$);
                }
                final SubLObject var12_49 = module0145.$g1895$.currentBinding(var48);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic25$, var48);
                    assert NIL != module0130.f8511((SubLObject)$ic20$) : $ic20$;
                    final SubLObject var12_50 = module0145.$g1897$.currentBinding(var48);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic20$, var48);
                        assert NIL != Types.fixnump(module0145.$g1952$.getDynamicValue(var48)) : module0145.$g1952$.getDynamicValue(var48);
                        final SubLObject var12_51 = module0145.$g1912$.currentBinding(var48);
                        try {
                            module0145.$g1912$.bind(module0145.$g1952$.getDynamicValue(var48), var48);
                            assert NIL != Types.fixnump(module0145.$g1951$.getDynamicValue(var48)) : module0145.$g1951$.getDynamicValue(var48);
                            final SubLObject var12_52 = module0145.$g1913$.currentBinding(var48);
                            try {
                                module0145.$g1913$.bind(module0145.$g1951$.getDynamicValue(var48), var48);
                                final SubLObject var54 = module0138.$g1626$.getGlobalValue();
                                SubLObject var55 = (SubLObject)NIL;
                                try {
                                    var55 = ReadWriteLocks.rw_lock_seize_read_lock(var54);
                                    var49 = module0314.f21200(var47, module0145.$g1948$.getDynamicValue(var48));
                                    if (module0145.$g1941$.getDynamicValue(var48).numGE((SubLObject)FIVE_INTEGER)) {
                                        final SubLObject var56 = module0249.f16081((SubLObject)UNPROVIDED);
                                        if (NIL != var56) {
                                            module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic22$, Sequences.length(var56), var56, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                    }
                                }
                                finally {
                                    if (NIL != var55) {
                                        ReadWriteLocks.rw_lock_release_read_lock(var54);
                                    }
                                }
                            }
                            finally {
                                module0145.$g1913$.rebind(var12_52, var48);
                            }
                        }
                        finally {
                            module0145.$g1912$.rebind(var12_51, var48);
                        }
                    }
                    finally {
                        module0145.$g1897$.rebind(var12_50, var48);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var12_49, var48);
                }
            }
            catch (Throwable var57) {
                var53 = Errors.handleThrowable(var57, (SubLObject)$ic16$);
            }
            finally {
                var48.throwStack.pop();
            }
        }
        finally {
            module0147.$g2095$.rebind(var52, var48);
            module0147.$g2094$.rebind(var51, var48);
        }
        return var49;
    }
    
    public static SubLObject f21412(final SubLObject var1, final SubLObject var2, final SubLObject var53, final SubLObject var54, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21388(var1, var2, (SubLObject)$ic27$, var53, var54, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21413(final SubLObject var1, final SubLObject var2, final SubLObject var53, final SubLObject var54, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21391(var1, var2, (SubLObject)$ic27$, var53, var54, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21414(final SubLObject var1, final SubLObject var2, final SubLObject var53, final SubLObject var54, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21393(var1, var2, (SubLObject)$ic27$, var53, var54, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21415(final SubLObject var1, final SubLObject var2, final SubLObject var53, final SubLObject var54, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        return f21395(var1, var2, (SubLObject)$ic27$, var53, var54, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f21416(final SubLObject var53, final SubLObject var54, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        final SubLObject var59 = var27;
        final SubLObject var60 = module0147.$g2094$.currentBinding(var55);
        final SubLObject var61 = module0147.$g2095$.currentBinding(var55);
        try {
            module0147.$g2094$.bind(module0147.f9531(var59), var55);
            module0147.$g2095$.bind(module0147.f9534(var59), var55);
            final SubLObject var62 = module0145.$g1891$.getDynamicValue(var55);
            if (var62.eql((SubLObject)ONE_INTEGER)) {
                var57 = var53;
                var58 = var54;
            }
            else if (var62.eql((SubLObject)TWO_INTEGER)) {
                var57 = var54;
                var58 = var53;
            }
            SubLObject var63 = (SubLObject)NIL;
            try {
                var55.throwStack.push($ic16$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var55) && NIL == module0145.$g1942$.getDynamicValue(var55) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var55)) {
                    module0313.f21154(var57, (SubLObject)$ic17$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var55) && NIL == module0145.$g1942$.getDynamicValue(var55) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var55)) {
                    module0313.f21154(var58, (SubLObject)$ic28$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var55) && NIL == module0313.f21138((SubLObject)$ic18$)) {
                    Errors.error((SubLObject)$ic19$, (SubLObject)$ic18$);
                }
                final SubLObject var12_59 = module0145.$g1895$.currentBinding(var55);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic18$, var55);
                    assert NIL != module0130.f8511((SubLObject)$ic20$) : $ic20$;
                    final SubLObject var12_60 = module0145.$g1897$.currentBinding(var55);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic20$, var55);
                        final SubLObject var64 = module0138.$g1626$.getGlobalValue();
                        SubLObject var65 = (SubLObject)NIL;
                        try {
                            var65 = ReadWriteLocks.rw_lock_seize_read_lock(var64);
                            var56 = f21417(var57, var58, (SubLObject)UNPROVIDED);
                            if (module0145.$g1941$.getDynamicValue(var55).numGE((SubLObject)FIVE_INTEGER)) {
                                final SubLObject var66 = module0249.f16081((SubLObject)UNPROVIDED);
                                if (NIL != var66) {
                                    module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic22$, Sequences.length(var66), var66, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            if (NIL != var65) {
                                ReadWriteLocks.rw_lock_release_read_lock(var64);
                            }
                        }
                    }
                    finally {
                        module0145.$g1897$.rebind(var12_60, var55);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var12_59, var55);
                }
            }
            catch (Throwable var67) {
                var63 = Errors.handleThrowable(var67, (SubLObject)$ic16$);
            }
            finally {
                var55.throwStack.pop();
            }
        }
        finally {
            module0147.$g2095$.rebind(var61, var55);
            module0147.$g2094$.rebind(var60, var55);
        }
        return var56;
    }
    
    public static SubLObject f21418(final SubLObject var53, final SubLObject var54, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)NIL;
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        final SubLObject var59 = var27;
        final SubLObject var60 = module0147.$g2094$.currentBinding(var55);
        final SubLObject var61 = module0147.$g2095$.currentBinding(var55);
        try {
            module0147.$g2094$.bind(module0147.f9531(var59), var55);
            module0147.$g2095$.bind(module0147.f9534(var59), var55);
            final SubLObject var62 = module0145.$g1891$.getDynamicValue(var55);
            if (var62.eql((SubLObject)ONE_INTEGER)) {
                var57 = var53;
                var58 = var54;
            }
            else if (var62.eql((SubLObject)TWO_INTEGER)) {
                var57 = var54;
                var58 = var53;
            }
            SubLObject var63 = (SubLObject)NIL;
            try {
                var55.throwStack.push($ic16$);
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var55) && NIL == module0145.$g1942$.getDynamicValue(var55) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var55)) {
                    module0313.f21154(var57, (SubLObject)$ic17$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Types.$suspend_type_checkingP$.getDynamicValue(var55) && NIL == module0145.$g1942$.getDynamicValue(var55) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var55)) {
                    module0313.f21154(var58, (SubLObject)$ic28$, (SubLObject)THREE_INTEGER);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var55) && NIL == module0313.f21138((SubLObject)$ic18$)) {
                    Errors.error((SubLObject)$ic19$, (SubLObject)$ic18$);
                }
                final SubLObject var12_62 = module0145.$g1895$.currentBinding(var55);
                try {
                    module0145.$g1895$.bind((SubLObject)$ic18$, var55);
                    assert NIL != module0130.f8511((SubLObject)$ic20$) : $ic20$;
                    final SubLObject var12_63 = module0145.$g1897$.currentBinding(var55);
                    try {
                        module0145.$g1897$.bind((SubLObject)$ic20$, var55);
                        final SubLObject var64 = module0138.$g1626$.getGlobalValue();
                        SubLObject var65 = (SubLObject)NIL;
                        try {
                            var65 = ReadWriteLocks.rw_lock_seize_read_lock(var64);
                            var56 = f21419(var57, var58);
                            if (module0145.$g1941$.getDynamicValue(var55).numGE((SubLObject)FIVE_INTEGER)) {
                                final SubLObject var66 = module0249.f16081((SubLObject)UNPROVIDED);
                                if (NIL != var66) {
                                    module0313.f21151((SubLObject)THREE_INTEGER, (SubLObject)$ic22$, Sequences.length(var66), var66, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            if (NIL != var65) {
                                ReadWriteLocks.rw_lock_release_read_lock(var64);
                            }
                        }
                    }
                    finally {
                        module0145.$g1897$.rebind(var12_63, var55);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var12_62, var55);
                }
            }
            catch (Throwable var67) {
                var63 = Errors.handleThrowable(var67, (SubLObject)$ic16$);
            }
            finally {
                var55.throwStack.pop();
            }
        }
        finally {
            module0147.$g2095$.rebind(var61, var55);
            module0147.$g2094$.rebind(var60, var55);
        }
        return var56;
    }
    
    public static SubLObject f21417(final SubLObject var64, final SubLObject var57, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = Symbols.symbol_function((SubLObject)EQ);
        }
        final SubLThread var66 = SubLProcess.currentSubLThread();
        SubLObject var67 = (SubLObject)((NIL != module0226.f14795(module0145.$g1948$.getDynamicValue(var66))) ? Functions.funcall(var65, var64, var57) : NIL);
        if (NIL == var67) {
            final SubLObject var68 = module0145.$g1902$.currentBinding(var66);
            try {
                module0145.$g1902$.bind((SubLObject)NIL, var66);
                SubLObject var69 = (SubLObject)NIL;
                try {
                    final SubLObject var12_67 = module0145.$g1891$.currentBinding(var66);
                    final SubLObject var70 = module0145.$g1892$.currentBinding(var66);
                    final SubLObject var71 = module0145.$g1888$.currentBinding(var66);
                    final SubLObject var72 = module0145.$g1897$.currentBinding(var66);
                    final SubLObject var73 = module0145.$g1902$.currentBinding(var66);
                    try {
                        module0145.$g1891$.bind(module0145.$g1951$.getDynamicValue(var66), var66);
                        module0145.$g1892$.bind(module0145.$g1952$.getDynamicValue(var66), var66);
                        module0145.$g1888$.bind(module0145.$g1948$.getDynamicValue(var66), var66);
                        module0145.$g1897$.bind(module0145.$g1953$.getDynamicValue(var66), var66);
                        module0145.$g1902$.bind((SubLObject)NIL, var66);
                        assert NIL != Types.function_spec_p((SubLObject)$ic29$) : $ic29$;
                        final SubLObject var12_68 = module0145.$g1904$.currentBinding(var66);
                        try {
                            module0145.$g1904$.bind((SubLObject)$ic29$, var66);
                            module0314.f21168(var64, (SubLObject)UNPROVIDED);
                            var69 = module0145.$g1902$.getDynamicValue(var66);
                        }
                        finally {
                            module0145.$g1904$.rebind(var12_68, var66);
                        }
                    }
                    finally {
                        module0145.$g1902$.rebind(var73, var66);
                        module0145.$g1897$.rebind(var72, var66);
                        module0145.$g1888$.rebind(var71, var66);
                        module0145.$g1892$.rebind(var70, var66);
                        module0145.$g1891$.rebind(var12_67, var66);
                    }
                    module0145.$g1902$.setDynamicValue(module0004.f104(var57, var69, var65, (SubLObject)UNPROVIDED), var66);
                    if (NIL == module0145.$g1902$.getDynamicValue(var66)) {
                        final SubLObject var12_69 = module0145.$g1901$.currentBinding(var66);
                        try {
                            module0145.$g1901$.bind(var57, var66);
                            assert NIL != Types.function_spec_p(var65) : var65;
                            final SubLObject var12_70 = module0145.$g1909$.currentBinding(var66);
                            try {
                                module0145.$g1909$.bind(var65, var66);
                                if (NIL != ((NIL != module0145.$g1955$.getDynamicValue(var66)) ? $ic31$ : NIL) && !areAssertionsDisabledFor(me) && NIL == Types.function_spec_p((SubLObject)((NIL != module0145.$g1955$.getDynamicValue(var66)) ? $ic31$ : NIL))) {
                                    throw new AssertionError((NIL != module0145.$g1955$.getDynamicValue(var66)) ? $ic31$ : NIL);
                                }
                                final SubLObject var12_71 = module0145.$g1905$.currentBinding(var66);
                                try {
                                    module0145.$g1905$.bind((SubLObject)((NIL != module0145.$g1955$.getDynamicValue(var66)) ? $ic31$ : NIL), var66);
                                    assert NIL != Types.function_spec_p((SubLObject)$ic32$) : $ic32$;
                                    final SubLObject var12_72 = module0145.$g1904$.currentBinding(var66);
                                    try {
                                        module0145.$g1904$.bind((SubLObject)$ic32$, var66);
                                        if (NIL == module0145.$g1902$.getDynamicValue(var66)) {
                                            SubLObject var74 = var69;
                                            SubLObject var75 = (SubLObject)NIL;
                                            var75 = var74.first();
                                            while (NIL == module0145.$g1902$.getDynamicValue(var66) && NIL != var74) {
                                                if (NIL != module0313.f21137(var75)) {
                                                    module0314.f21168(var75, (SubLObject)UNPROVIDED);
                                                }
                                                var74 = var74.rest();
                                                var75 = var74.first();
                                            }
                                        }
                                    }
                                    finally {
                                        module0145.$g1904$.rebind(var12_72, var66);
                                    }
                                }
                                finally {
                                    module0145.$g1905$.rebind(var12_71, var66);
                                }
                            }
                            finally {
                                module0145.$g1909$.rebind(var12_70, var66);
                            }
                        }
                        finally {
                            module0145.$g1901$.rebind(var12_69, var66);
                        }
                    }
                }
                finally {
                    final SubLObject var12_73 = Threads.$is_thread_performing_cleanupP$.currentBinding(var66);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var66);
                        Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var66));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var12_73, var66);
                    }
                }
                var67 = module0145.$g1902$.getDynamicValue(var66);
            }
            finally {
                module0145.$g1902$.rebind(var68, var66);
            }
        }
        return var67;
    }
    
    public static SubLObject f21419(final SubLObject var64, final SubLObject var57) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = (SubLObject)NIL;
        final SubLObject var68 = module0145.$g1891$.currentBinding(var65);
        final SubLObject var69 = module0145.$g1892$.currentBinding(var65);
        final SubLObject var70 = module0145.$g1888$.currentBinding(var65);
        final SubLObject var71 = module0145.$g1897$.currentBinding(var65);
        final SubLObject var72 = module0145.$g1902$.currentBinding(var65);
        final SubLObject var73 = module0147.$g2094$.currentBinding(var65);
        final SubLObject var74 = module0147.$g2095$.currentBinding(var65);
        try {
            module0145.$g1891$.bind(module0145.$g1951$.getDynamicValue(var65), var65);
            module0145.$g1892$.bind(module0145.$g1952$.getDynamicValue(var65), var65);
            module0145.$g1888$.bind(module0145.$g1948$.getDynamicValue(var65), var65);
            module0145.$g1897$.bind(module0145.$g1953$.getDynamicValue(var65), var65);
            module0145.$g1902$.bind((SubLObject)NIL, var65);
            module0147.$g2094$.bind((SubLObject)$ic33$, var65);
            module0147.$g2095$.bind($ic34$, var65);
            assert NIL != Types.function_spec_p(Symbols.symbol_function((SubLObject)$ic35$)) : Symbols.symbol_function((SubLObject)$ic35$);
            final SubLObject var12_76 = module0145.$g1904$.currentBinding(var65);
            try {
                module0145.$g1904$.bind(Symbols.symbol_function((SubLObject)$ic35$), var65);
                module0314.f21168(var64, (SubLObject)UNPROVIDED);
                var67 = module0145.$g1902$.getDynamicValue(var65);
            }
            finally {
                module0145.$g1904$.rebind(var12_76, var65);
            }
        }
        finally {
            module0147.$g2095$.rebind(var74, var65);
            module0147.$g2094$.rebind(var73, var65);
            module0145.$g1902$.rebind(var72, var65);
            module0145.$g1897$.rebind(var71, var65);
            module0145.$g1888$.rebind(var70, var65);
            module0145.$g1892$.rebind(var69, var65);
            module0145.$g1891$.rebind(var68, var65);
        }
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var67;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            SubLObject var79;
            final SubLObject var78 = var79 = var77;
            SubLObject var80 = (SubLObject)NIL;
            SubLObject var81 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var79, var78, (SubLObject)$ic36$);
            var80 = var79.first();
            var79 = (var81 = var79.rest());
            if (NIL != module0313.f21137(var80)) {
                SubLObject var82 = (SubLObject)NIL;
                final SubLObject var83 = module0147.$g2094$.currentBinding(var65);
                final SubLObject var84 = module0147.$g2095$.currentBinding(var65);
                try {
                    module0147.$g2094$.bind((SubLObject)$ic33$, var65);
                    module0147.$g2095$.bind($ic34$, var65);
                    var82 = module0315.f21345(var80, var57, (SubLObject)$ic37$);
                }
                finally {
                    module0147.$g2095$.rebind(var84, var65);
                    module0147.$g2094$.rebind(var83, var65);
                }
                SubLObject var33_82 = var82;
                SubLObject var85 = (SubLObject)NIL;
                var85 = var33_82.first();
                while (NIL != var33_82) {
                    SubLObject var33_83;
                    final SubLObject var86 = var33_83 = (SubLObject)(var85.eql(var81) ? ConsesLow.list(var81) : module0262.f17370(module0262.f17364((SubLObject)ConsesLow.list(var81, var85), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                    SubLObject var87 = (SubLObject)NIL;
                    var87 = var33_83.first();
                    while (NIL != var33_83) {
                        final SubLObject var88 = var87;
                        if (NIL == conses_high.member(var88, var75, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var75 = (SubLObject)ConsesLow.cons(var88, var75);
                        }
                        var33_83 = var33_83.rest();
                        var87 = var33_83.first();
                    }
                    var33_82 = var33_82.rest();
                    var85 = var33_82.first();
                }
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        var66 = var75;
        return var66;
    }
    
    public static SubLObject f21420() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21388", "S#23912", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21391", "S#23913", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21393", "S#23914", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21395", "S#23915", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21389", "S#23916", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21392", "S#23917", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21394", "S#23918", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21396", "S#23919", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21397", "S#23920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21390", "S#12143", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21398", "S#23921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21399", "S#23922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21400", "S#23923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21401", "S#12144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21402", "S#23924", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21403", "S#23925", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21404", "S#23926", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21405", "S#23927", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21406", "S#12138", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21407", "S#23928", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21408", "S#23929", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21409", "S#23930", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21410", "S#23931", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21411", "S#12139", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21412", "S#23932", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21413", "S#23933", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21414", "S#23934", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21415", "S#23935", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21416", "S#12140", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21418", "S#12142", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21417", "S#23936", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0317", "f21419", "S#23937", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21421() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21422() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21420();
    }
    
    public void initializeVariables() {
        f21421();
    }
    
    public void runTopLevelForms() {
        f21422();
    }
    
    static {
        me = (SubLFile)new module0317();
        $ic0$ = makeString("(#$transitiveViaArg ~s ~s 1) not declared");
        $ic1$ = makeString("(#$transitiveViaArg ~s ~s 2) not declared");
        $ic2$ = makeString("(#$transitiveViaArgInverse ~s ~s 1) not declared");
        $ic3$ = makeString("(#$transitiveViaArgInverse ~s ~s 2) not declared");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArg"));
        $ic5$ = ConsesLow.list((SubLObject)ONE_INTEGER);
        $ic6$ = ConsesLow.list((SubLObject)TWO_INTEGER);
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArgInverse"));
        $ic8$ = makeInteger(128);
        $ic9$ = makeString("invalid gtm method: ~s");
        $ic10$ = makeString("method ~s maps into illegal gt function ~s)");
        $ic11$ = makeString("illegal transfers-through method: ~s");
        $ic12$ = makeSymbol("S#11445", "CYC");
        $ic13$ = makeSymbol("&OPTIONAL");
        $ic14$ = makeString("~s was not a valid transitivity-module parameter");
        $ic15$ = makeKeyword("ALL-TARGETS");
        $ic16$ = makeKeyword("GT-ERROR");
        $ic17$ = makeKeyword("TT-INDEX");
        $ic18$ = makeKeyword("DIRECTED");
        $ic19$ = makeString("invalid gt mode: ~a");
        $ic20$ = makeKeyword("TRUE");
        $ic21$ = makeSymbol("TRUTH-P");
        $ic22$ = makeString("~s marked constants: ~s");
        $ic23$ = makeKeyword("ALL-SOURCES");
        $ic24$ = makeKeyword("TT-GATHER");
        $ic25$ = makeKeyword("INVERSE");
        $ic26$ = makeSymbol("FIXNUMP");
        $ic27$ = makeKeyword("BOOLEAN?");
        $ic28$ = makeKeyword("GT-GATHER");
        $ic29$ = makeSymbol("S#23756", "CYC");
        $ic30$ = makeSymbol("FUNCTION-SPEC-P");
        $ic31$ = makeSymbol("S#23754", "CYC");
        $ic32$ = makeSymbol("S#23757", "CYC");
        $ic33$ = makeSymbol("S#12274", "CYC");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic35$ = makeSymbol("S#23788", "CYC");
        $ic36$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic37$ = makeKeyword("HIERARCHICALLY-DIRECT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 479 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/