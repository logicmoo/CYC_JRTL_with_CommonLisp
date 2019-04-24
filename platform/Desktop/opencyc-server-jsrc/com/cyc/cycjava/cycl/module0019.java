package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0019 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0019";
    public static final String myFingerPrint = "ec1afa469742b60f6a36fd6f5f7192bf84478683e6000be96c5a3d2e84c8f6c8";
    public static SubLSymbol $g741$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    
    public static SubLObject f991(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic0$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)module0019.NIL;
        SubLObject var8 = (SubLObject)module0019.NIL;
        SubLObject var9 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic0$);
        var8 = var5.first();
        var5 = (var9 = var5.rest());
        var5 = var6;
        SubLObject var10 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic0$);
        var10 = var5.first();
        final SubLObject var11;
        var5 = (var11 = var5.rest());
        final SubLObject var12 = (SubLObject)ConsesLow.cons(var7, (SubLObject)ConsesLow.cons(var8, var9));
        return reader.bq_cons((SubLObject)module0019.$ic1$, ConsesLow.append((SubLObject)((module0019.NIL != Sequences.find((SubLObject)module0019.$ic2$, reader.$features$.getDynamicValue(var3), (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED) && module0019.NIL != Sequences.find((SubLObject)module0019.$ic3$, reader.$features$.getDynamicValue(var3), (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0019.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0019.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0019.$ic5$, var8), (SubLObject)ConsesLow.list((SubLObject)module0019.$ic5$, var7)), ConsesLow.append((SubLObject)((module0019.NIL != Sequences.find((SubLObject)module0019.$ic6$, reader.$features$.getDynamicValue(var3), (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0019.$ic7$, var12, var10, ConsesLow.append(var11, (SubLObject)module0019.NIL))) : module0019.NIL), (SubLObject)module0019.NIL))) : module0019.NIL), (SubLObject)module0019.NIL));
    }
    
    public static SubLObject f992(final SubLObject var8, final SubLObject var7) {
        return (SubLObject)module0019.NIL;
    }
    
    public static SubLObject f993(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic9$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0019.NIL;
        SubLObject var7 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic9$);
        var6 = var4.first();
        var4 = (var7 = var4.rest());
        var4 = var5;
        SubLObject var8 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic9$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0019.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0019.$ic10$, (SubLObject)module0019.$ic11$, reader.bq_cons(var6, var7), var8, ConsesLow.append(var9, (SubLObject)module0019.NIL)));
    }
    
    public static SubLObject f994(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic9$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0019.NIL;
        SubLObject var7 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic9$);
        var6 = var4.first();
        var4 = (var7 = var4.rest());
        var4 = var5;
        SubLObject var8 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic9$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0019.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0019.$ic10$, (SubLObject)module0019.$ic12$, reader.bq_cons(var6, var7), var8, ConsesLow.append(var9, (SubLObject)module0019.NIL)));
    }
    
    public static SubLObject f995(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic13$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic13$);
        final SubLObject var7 = var5.rest();
        var5 = var5.first();
        SubLObject var8 = (SubLObject)module0019.NIL;
        SubLObject var9 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic13$);
        var8 = var5.first();
        var5 = (var9 = var5.rest());
        var5 = var7;
        SubLObject var10 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic13$);
        var10 = var5.first();
        final SubLObject var11;
        var5 = (var11 = var5.rest());
        final SubLObject var12 = (SubLObject)ConsesLow.cons(var6, (SubLObject)ConsesLow.cons(var8, var9));
        return reader.bq_cons((SubLObject)module0019.$ic1$, ConsesLow.append((SubLObject)((module0019.NIL != Sequences.find((SubLObject)module0019.$ic2$, reader.$features$.getDynamicValue(var3), (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED) && module0019.NIL != Sequences.find((SubLObject)module0019.$ic3$, reader.$features$.getDynamicValue(var3), (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED) && module0019.NIL != Sequences.find((SubLObject)module0019.$ic6$, reader.$features$.getDynamicValue(var3), (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0019.$ic7$, var12, var10, ConsesLow.append(var11, (SubLObject)module0019.NIL))) : module0019.NIL), (SubLObject)module0019.NIL));
    }
    
    public static SubLObject f996(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic14$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0019.NIL;
        SubLObject var7 = (SubLObject)module0019.NIL;
        SubLObject var8 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic14$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic14$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic14$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0019.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0019.NIL;
        SubLObject var32_33 = (SubLObject)module0019.NIL;
        while (module0019.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0019.$ic14$);
            var32_33 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0019.$ic14$);
            if (module0019.NIL == conses_high.member(var32_33, (SubLObject)module0019.$ic15$, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED)) {
                var11 = (SubLObject)module0019.T;
            }
            if (var32_33 == module0019.$ic16$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0019.NIL != var11 && module0019.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0019.$ic14$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0019.$ic17$, var4);
        final SubLObject var13 = (SubLObject)((module0019.NIL != var12) ? conses_high.cadr(var12) : module0019.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)((module0019.NIL != var13) ? ConsesLow.list(var6, var7, var8, (SubLObject)module0019.$ic17$, var13) : ConsesLow.list(var6, var7, var8));
        return (SubLObject)ConsesLow.list((SubLObject)module0019.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0019.$ic18$, (SubLObject)module0019.$ic19$, var15, ConsesLow.append(var14, (SubLObject)module0019.NIL)));
    }
    
    public static SubLObject f997(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic14$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0019.NIL;
        SubLObject var7 = (SubLObject)module0019.NIL;
        SubLObject var8 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic14$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic14$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic14$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0019.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0019.NIL;
        SubLObject var44_45 = (SubLObject)module0019.NIL;
        while (module0019.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0019.$ic14$);
            var44_45 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0019.$ic14$);
            if (module0019.NIL == conses_high.member(var44_45, (SubLObject)module0019.$ic15$, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED)) {
                var11 = (SubLObject)module0019.T;
            }
            if (var44_45 == module0019.$ic16$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0019.NIL != var11 && module0019.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0019.$ic14$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0019.$ic17$, var4);
        final SubLObject var13 = (SubLObject)((module0019.NIL != var12) ? conses_high.cadr(var12) : module0019.NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)((module0019.NIL != var13) ? ConsesLow.list(var6, var7, var8, (SubLObject)module0019.$ic17$, var13) : ConsesLow.list(var6, var7, var8));
        return (SubLObject)ConsesLow.list((SubLObject)module0019.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0019.$ic18$, (SubLObject)module0019.$ic20$, var15, ConsesLow.append(var14, (SubLObject)module0019.NIL)));
    }
    
    public static SubLObject f998(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic21$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic21$);
        final SubLObject var7 = var5.rest();
        var5 = var5.first();
        SubLObject var8 = (SubLObject)module0019.NIL;
        SubLObject var9 = (SubLObject)module0019.NIL;
        SubLObject var10 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic21$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic21$);
        var9 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)module0019.$ic21$);
        var10 = var5.first();
        var5 = var5.rest();
        SubLObject var11 = (SubLObject)module0019.NIL;
        SubLObject var12 = var5;
        SubLObject var13 = (SubLObject)module0019.NIL;
        SubLObject var53_54 = (SubLObject)module0019.NIL;
        while (module0019.NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var4, (SubLObject)module0019.$ic21$);
            var53_54 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var4, (SubLObject)module0019.$ic21$);
            if (module0019.NIL == conses_high.member(var53_54, (SubLObject)module0019.$ic15$, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED)) {
                var13 = (SubLObject)module0019.T;
            }
            if (var53_54 == module0019.$ic16$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (module0019.NIL != var13 && module0019.NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)module0019.$ic21$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0019.$ic17$, var5);
        final SubLObject var15 = (SubLObject)((module0019.NIL != var14) ? conses_high.cadr(var14) : module0019.NIL);
        final SubLObject var16;
        var5 = (var16 = var7);
        final SubLObject var17 = (SubLObject)ConsesLow.list((SubLObject)module0019.$ic22$, var6);
        return reader.bq_cons((SubLObject)module0019.$ic1$, ConsesLow.append((SubLObject)((module0019.NIL != Sequences.find((SubLObject)module0019.$ic2$, reader.$features$.getDynamicValue(var3), (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED) && module0019.NIL != Sequences.find((SubLObject)module0019.$ic3$, reader.$features$.getDynamicValue(var3), (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED, (SubLObject)module0019.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0019.$ic1$, (SubLObject)ConsesLow.listS((SubLObject)module0019.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0019.$ic5$, var8), (SubLObject)module0019.$ic24$), (SubLObject)ConsesLow.list((SubLObject)module0019.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0019.$ic5$, var8)), (SubLObject)ConsesLow.listS((SubLObject)module0019.$ic26$, reader.bq_cons(var8, var17), ConsesLow.append(var16, (SubLObject)module0019.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0019.$ic27$, (SubLObject)ConsesLow.list((SubLObject)module0019.$ic5$, var8), var9, var10, var15))) : module0019.NIL), (SubLObject)module0019.NIL));
    }
    
    public static SubLObject f999(final SubLObject var26) {
        return (SubLObject)module0019.NIL;
    }
    
    public static SubLObject f1000(final SubLObject var26, final SubLObject var27, final SubLObject var28, final SubLObject var35) {
        return (SubLObject)module0019.NIL;
    }
    
    public static SubLObject f1001(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic28$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic28$);
        var6 = var4.first();
        var4 = var4.rest();
        if (module0019.NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0019.$ic29$, (SubLObject)module0019.$ic30$, var6, (SubLObject)ConsesLow.listS((SubLObject)module0019.$ic31$, (SubLObject)module0019.$ic32$, ConsesLow.append(var7, (SubLObject)module0019.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0019.$ic28$);
        return (SubLObject)module0019.NIL;
    }
    
    public static SubLObject f1002() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Dynamic.sublisp_throw(module0003.$g3$.getGlobalValue(), Errors.$error_message$.getDynamicValue(var3));
    }
    
    public static SubLObject f1003(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0019.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0019.$ic33$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)module0019.$ic34$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0019.$ic35$, reader.bq_cons((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)module0019.$ic36$, var5)), ConsesLow.append(f1004(var5, var7), (SubLObject)module0019.NIL)), ConsesLow.append(var6, (SubLObject)module0019.NIL));
    }
    
    public static SubLObject f1004(final SubLObject var65, final SubLObject var64) {
        SubLObject var66 = (SubLObject)module0019.NIL;
        SubLObject var67;
        for (var67 = (SubLObject)module0019.NIL, var67 = (SubLObject)module0019.ZERO_INTEGER; var67.numL(var65); var67 = Numbers.add(var67, (SubLObject)module0019.ONE_INTEGER)) {
            var66 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Packages.intern(Symbols.make_symbol(Sequences.cconcatenate((SubLObject)module0019.$ic39$, PrintLow.write_to_string(var67, module0019.EMPTY_SUBL_OBJECT_ARRAY))), (SubLObject)module0019.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)module0019.$ic40$, var67, var64)), var66);
        }
        return Sequences.nreverse(var66);
    }
    
    public static SubLObject f1005() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f991", "S#1966");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0019", "f992", "S#1967", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f993", "S#1968");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f994", "S#1969");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f995", "S#1970");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f996", "S#1971");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f997", "S#1972");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f998", "S#1973");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0019", "f999", "S#1974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0019", "f1000", "S#1975", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f1001", "S#1976");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0019", "f1002", "S#1977", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0019", "f1003", "S#1978");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0019", "f1004", "S#1979", 2, 0, false);
        return (SubLObject)module0019.NIL;
    }
    
    public static SubLObject f1006() {
        module0019.$g741$ = SubLFiles.defparameter("S#1980", (SubLObject)module0019.NIL);
        return (SubLObject)module0019.NIL;
    }
    
    public static SubLObject f1007() {
        module0002.f50((SubLObject)module0019.$ic4$, (SubLObject)module0019.$ic8$);
        module0002.f50((SubLObject)module0019.$ic25$, (SubLObject)module0019.$ic18$);
        module0002.f50((SubLObject)module0019.$ic27$, (SubLObject)module0019.$ic18$);
        module0002.f50((SubLObject)module0019.$ic37$, (SubLObject)module0019.$ic38$);
        return (SubLObject)module0019.NIL;
    }
    
    public void declareFunctions() {
        f1005();
    }
    
    public void initializeVariables() {
        f1006();
    }
    
    public void runTopLevelForms() {
        f1007();
    }
    
    static {
        me = (SubLFile)new module0019();
        module0019.$g741$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#1981", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("S#1982", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#1983", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic2$ = SubLObjectFactory.makeKeyword("CYC-SUBLOOP");
        $ic3$ = SubLObjectFactory.makeKeyword("CYC-SUNIT-FULL");
        $ic4$ = SubLObjectFactory.makeSymbol("S#1967", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic6$ = SubLObjectFactory.makeKeyword("CYC-SUNIT");
        $ic7$ = SubLObjectFactory.makeSymbol("S#1984", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#1966", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("S#1982", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#1983", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#1970", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#1985", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#1986", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("S#1982", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#1983", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1987", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#214", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#254", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1988", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1989", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORIES"));
        $ic16$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic17$ = SubLObjectFactory.makeKeyword("CATEGORIES");
        $ic18$ = SubLObjectFactory.makeSymbol("S#1973", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#1990", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#1991", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1987", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#214", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#254", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1988", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#1989", "CYC"));
        $ic22$ = SubLObjectFactory.makeKeyword("EXTENDS");
        $ic23$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1980", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#1974", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#1992", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#1975", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic29$ = SubLObjectFactory.makeSymbol("CCATCH");
        $ic30$ = SubLObjectFactory.makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*");
        $ic31$ = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1977", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic34$ = SubLObjectFactory.makeUninternedSymbol("US#146E057");
        $ic35$ = SubLObjectFactory.makeSymbol("CLET");
        $ic36$ = SubLObjectFactory.makeSymbol("S#1994", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#1979", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#1978", "CYC");
        $ic39$ = SubLObjectFactory.makeString("VAR");
        $ic40$ = SubLObjectFactory.makeSymbol("NTH");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0019.class
	Total time: 100 ms
	
	Decompiled with Procyon 0.5.32.
*/