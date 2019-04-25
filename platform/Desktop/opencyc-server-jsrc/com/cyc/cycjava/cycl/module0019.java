package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var8 = var5.first();
        var5 = (var9 = var5.rest());
        var5 = var6;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic0$);
        var10 = var5.first();
        final SubLObject var11;
        var5 = (var11 = var5.rest());
        final SubLObject var12 = (SubLObject)ConsesLow.cons(var7, (SubLObject)ConsesLow.cons(var8, var9));
        return reader.bq_cons((SubLObject)$ic1$, ConsesLow.append((SubLObject)((NIL != Sequences.find((SubLObject)$ic2$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != Sequences.find((SubLObject)$ic3$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7)), ConsesLow.append((SubLObject)((NIL != Sequences.find((SubLObject)$ic6$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic7$, var12, var10, ConsesLow.append(var11, (SubLObject)NIL))) : NIL), (SubLObject)NIL))) : NIL), (SubLObject)NIL));
    }
    
    public static SubLObject f992(final SubLObject var8, final SubLObject var7) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f993(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var6 = var4.first();
        var4 = (var7 = var4.rest());
        var4 = var5;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)$ic11$, reader.bq_cons(var6, var7), var8, ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f994(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var6 = var4.first();
        var4 = (var7 = var4.rest());
        var4 = var5;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic10$, (SubLObject)$ic12$, reader.bq_cons(var6, var7), var8, ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f995(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic13$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic13$);
        final SubLObject var7 = var5.rest();
        var5 = var5.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic13$);
        var8 = var5.first();
        var5 = (var9 = var5.rest());
        var5 = var7;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic13$);
        var10 = var5.first();
        final SubLObject var11;
        var5 = (var11 = var5.rest());
        final SubLObject var12 = (SubLObject)ConsesLow.cons(var6, (SubLObject)ConsesLow.cons(var8, var9));
        return reader.bq_cons((SubLObject)$ic1$, ConsesLow.append((SubLObject)((NIL != Sequences.find((SubLObject)$ic2$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != Sequences.find((SubLObject)$ic3$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != Sequences.find((SubLObject)$ic6$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic7$, var12, var10, ConsesLow.append(var11, (SubLObject)NIL))) : NIL), (SubLObject)NIL));
    }
    
    public static SubLObject f996(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic14$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic14$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic14$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic14$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var32_33 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic14$);
            var32_33 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic14$);
            if (NIL == conses_high.member(var32_33, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var32_33 == $ic16$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic14$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic17$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)((NIL != var13) ? ConsesLow.list(var6, var7, var8, (SubLObject)$ic17$, var13) : ConsesLow.list(var6, var7, var8));
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic18$, (SubLObject)$ic19$, var15, ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f997(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic14$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic14$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic14$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic14$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var44_45 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic14$);
            var44_45 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic14$);
            if (NIL == conses_high.member(var44_45, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var44_45 == $ic16$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic14$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic17$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var4 = (var14 = var5);
        final SubLObject var15 = (SubLObject)((NIL != var13) ? ConsesLow.list(var6, var7, var8, (SubLObject)$ic17$, var13) : ConsesLow.list(var6, var7, var8));
        return (SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic18$, (SubLObject)$ic20$, var15, ConsesLow.append(var14, (SubLObject)NIL)));
    }
    
    public static SubLObject f998(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic21$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic21$);
        final SubLObject var7 = var5.rest();
        var5 = var5.first();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic21$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic21$);
        var9 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic21$);
        var10 = var5.first();
        var5 = var5.rest();
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var5;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var53_54 = (SubLObject)NIL;
        while (NIL != var12) {
            cdestructuring_bind.destructuring_bind_must_consp(var12, var4, (SubLObject)$ic21$);
            var53_54 = var12.first();
            var12 = var12.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var12, var4, (SubLObject)$ic21$);
            if (NIL == conses_high.member(var53_54, (SubLObject)$ic15$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)T;
            }
            if (var53_54 == $ic16$) {
                var11 = var12.first();
            }
            var12 = var12.rest();
        }
        if (NIL != var13 && NIL == var11) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic21$);
        }
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic17$, var5);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var5 = (var16 = var7);
        final SubLObject var17 = (SubLObject)ConsesLow.list((SubLObject)$ic22$, var6);
        return reader.bq_cons((SubLObject)$ic1$, ConsesLow.append((SubLObject)((NIL != Sequences.find((SubLObject)$ic2$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != Sequences.find((SubLObject)$ic3$, reader.$features$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic1$, (SubLObject)ConsesLow.listS((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var8), (SubLObject)$ic24$), (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var8)), (SubLObject)ConsesLow.listS((SubLObject)$ic26$, reader.bq_cons(var8, var17), ConsesLow.append(var16, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var8), var9, var10, var15))) : NIL), (SubLObject)NIL));
    }
    
    public static SubLObject f999(final SubLObject var26) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1000(final SubLObject var26, final SubLObject var27, final SubLObject var28, final SubLObject var35) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1001(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic28$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic28$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)$ic30$, var6, (SubLObject)ConsesLow.listS((SubLObject)$ic31$, (SubLObject)$ic32$, ConsesLow.append(var7, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic28$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1002() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return Dynamic.sublisp_throw(module0003.$g3$.getGlobalValue(), Errors.$error_message$.getDynamicValue(var3));
    }
    
    public static SubLObject f1003(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic33$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic34$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic35$, reader.bq_cons((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic36$, var5)), ConsesLow.append(f1004(var5, var7), (SubLObject)NIL)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f1004(final SubLObject var65, final SubLObject var64) {
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67;
        for (var67 = (SubLObject)NIL, var67 = (SubLObject)ZERO_INTEGER; var67.numL(var65); var67 = Numbers.add(var67, (SubLObject)ONE_INTEGER)) {
            var66 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Packages.intern(Symbols.make_symbol(Sequences.cconcatenate((SubLObject)$ic39$, PrintLow.write_to_string(var67, EMPTY_SUBL_OBJECT_ARRAY))), (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)$ic40$, var67, var64)), var66);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1006() {
        $g741$ = SubLFiles.defparameter("S#1980", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1007() {
        module0002.f50((SubLObject)$ic4$, (SubLObject)$ic8$);
        module0002.f50((SubLObject)$ic25$, (SubLObject)$ic18$);
        module0002.f50((SubLObject)$ic27$, (SubLObject)$ic18$);
        module0002.f50((SubLObject)$ic37$, (SubLObject)$ic38$);
        return (SubLObject)NIL;
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
        $g741$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)makeSymbol("S#1981", "CYC"), (SubLObject)makeSymbol("CLASS-NAME"), (SubLObject)makeSymbol("S#1982", "CYC")), (SubLObject)makeSymbol("S#1983", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = makeSymbol("PROGN");
        $ic2$ = makeKeyword("CYC-SUBLOOP");
        $ic3$ = makeKeyword("CYC-SUNIT-FULL");
        $ic4$ = makeSymbol("S#1967", "CYC");
        $ic5$ = makeSymbol("QUOTE");
        $ic6$ = makeKeyword("CYC-SUNIT");
        $ic7$ = makeSymbol("S#1984", "CYC");
        $ic8$ = makeSymbol("S#1966", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeSymbol("CLASS-NAME"), (SubLObject)makeSymbol("S#1982", "CYC")), (SubLObject)makeSymbol("S#1983", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeSymbol("S#1970", "CYC");
        $ic11$ = makeSymbol("S#1985", "CYC");
        $ic12$ = makeSymbol("S#1986", "CYC");
        $ic13$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)ConsesLow.cons((SubLObject)makeSymbol("CLASS-NAME"), (SubLObject)makeSymbol("S#1982", "CYC")), (SubLObject)makeSymbol("S#1983", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic14$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1987", "CYC"), (SubLObject)makeSymbol("S#214", "CYC"), (SubLObject)makeSymbol("S#254", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#1988", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#1989", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)makeKeyword("CATEGORIES"));
        $ic16$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic17$ = makeKeyword("CATEGORIES");
        $ic18$ = makeSymbol("S#1973", "CYC");
        $ic19$ = makeSymbol("S#1990", "CYC");
        $ic20$ = makeSymbol("S#1991", "CYC");
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1987", "CYC"), (SubLObject)makeSymbol("S#214", "CYC"), (SubLObject)makeSymbol("S#254", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#1988", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#1989", "CYC"));
        $ic22$ = makeKeyword("EXTENDS");
        $ic23$ = makeSymbol("CPUSH");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#1980", "CYC"));
        $ic25$ = makeSymbol("S#1974", "CYC");
        $ic26$ = makeSymbol("S#1992", "CYC");
        $ic27$ = makeSymbol("S#1975", "CYC");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic29$ = makeSymbol("CCATCH");
        $ic30$ = makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*");
        $ic31$ = makeSymbol("WITH-ERROR-HANDLER");
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#1977", "CYC"));
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#1993", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic34$ = makeUninternedSymbol("US#146E057");
        $ic35$ = makeSymbol("CLET");
        $ic36$ = makeSymbol("S#1994", "CYC");
        $ic37$ = makeSymbol("S#1979", "CYC");
        $ic38$ = makeSymbol("S#1978", "CYC");
        $ic39$ = makeString("VAR");
        $ic40$ = makeSymbol("NTH");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 100 ms
	
	Decompiled with Procyon 0.5.32.
*/