package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0148 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0148";
    public static final String myFingerPrint = "d12c71ebe4fa6e936557ebc7fbcb0ad0477e99c7c8da3dd0e38331c08ba362a0";
    public static SubLSymbol $g2097$;
    public static SubLSymbol $g2098$;
    public static SubLSymbol $g2099$;
    public static SubLSymbol $g2100$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLList $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    
    public static SubLObject f9565(final SubLObject var1) {
        return (SubLObject)T;
    }
    
    public static SubLObject f9566(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eql($g2097$.getDynamicValue(var2), var1);
    }
    
    public static SubLObject f9567(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0004.f104(var1, $g2098$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9568(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL == f9567(var1));
    }
    
    public static SubLObject f9569(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != f9566(var1) || NIL != module0264.f17432($g2097$.getDynamicValue(var2), var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9570(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0264.f17435($g2097$.getDynamicValue(var2), var1, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f9571(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != f9566(var1) || NIL != module0264.f17432($g2097$.getDynamicValue(var2), var1, (SubLObject)UNPROVIDED) || NIL != module0264.f17435($g2097$.getDynamicValue(var2), var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9572(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != f9573()) {
            return (SubLObject)T;
        }
        final SubLObject var3 = $g2099$.getDynamicValue(var2);
        if (var3.eql((SubLObject)$ic1$)) {
            return f9565(var1);
        }
        if (var3.eql((SubLObject)$ic2$)) {
            return f9566(var1);
        }
        if (var3.eql((SubLObject)$ic3$)) {
            return f9567(var1);
        }
        if (var3.eql((SubLObject)$ic4$)) {
            return f9568(var1);
        }
        if (var3.eql((SubLObject)$ic5$)) {
            return f9569(var1);
        }
        if (var3.eql((SubLObject)$ic6$)) {
            return f9570(var1);
        }
        if (var3.eql((SubLObject)$ic7$)) {
            return f9571(var1);
        }
        if (var3.eql((SubLObject)$ic8$)) {
            return module0239.f15598(var1);
        }
        if (var3.eql((SubLObject)$ic9$)) {
            return f9574(var1);
        }
        if (var3.eql((SubLObject)$ic10$)) {
            return f9575(var1);
        }
        if (var3.eql((SubLObject)$ic11$)) {
            return f9576(var1);
        }
        if (var3.eql((SubLObject)$ic12$)) {
            return f9577(var1);
        }
        if (var3.eql((SubLObject)$ic13$)) {
            return f9578(var1);
        }
        return Functions.funcall($g2099$.getDynamicValue(var2), var1);
    }
    
    public static SubLObject f9573() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == $g2099$.getDynamicValue(var2));
    }
    
    public static SubLObject f9579() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != f9573() || $ic1$ == $g2099$.getDynamicValue(var2));
    }
    
    public static SubLObject f9580() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)$ic2$, $g2099$.getDynamicValue(var2));
    }
    
    public static SubLObject f9581(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic14$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic16$, var8)), ConsesLow.append(var9, (SubLObject)NIL));
    }
    
    public static SubLObject f9582(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)$ic18$, ConsesLow.append(var8, (SubLObject)NIL));
    }
    
    public static SubLObject f9583(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)$ic20$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic21$, var8)), ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f9584(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic22$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)$ic23$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic24$, var8)), ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f9585(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic22$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)$ic25$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic24$, var8)), ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f9586(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)$ic26$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic21$, var8)), ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f9587(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)$ic27$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic21$, var8)), ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f9588(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)$ic28$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic21$, var8)), ConsesLow.append(var9, (SubLObject)NIL)));
    }
    
    public static SubLObject f9589(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic29$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic29$);
        var9 = var7.first();
        final SubLObject var10;
        var7 = (var10 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic30$, var9, (SubLObject)ConsesLow.list((SubLObject)$ic2$, (SubLObject)ConsesLow.listS((SubLObject)$ic31$, var8, ConsesLow.append(var10, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.listS((SubLObject)$ic32$, var8, ConsesLow.append(var10, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.listS((SubLObject)$ic33$, var8, ConsesLow.append(var10, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.listS((SubLObject)$ic34$, var8, ConsesLow.append(var10, (SubLObject)NIL))));
    }
    
    public static SubLObject f9590(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        if (NIL == var8) {
            return reader.bq_cons((SubLObject)$ic35$, ConsesLow.append(var9, (SubLObject)NIL));
        }
        final SubLObject var10 = (SubLObject)$ic36$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var8)), (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var10), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)ConsesLow.list((SubLObject)$ic38$, var10))), ConsesLow.append(var9, (SubLObject)NIL))));
    }
    
    public static SubLObject f9591(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL == var14) {
            return $g2099$.getDynamicValue(var15);
        }
        assert NIL != module0173.f10955(var14) : var14;
        return (SubLObject)$ic2$;
    }
    
    public static SubLObject f9592(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return (NIL != var14) ? var14 : $g2097$.getDynamicValue(var15);
    }
    
    public static SubLObject f9593() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq($g2099$.getDynamicValue(var2), (SubLObject)$ic5$);
    }
    
    public static SubLObject f9594() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq($g2099$.getDynamicValue(var2), (SubLObject)$ic6$);
    }
    
    public static SubLObject f9595() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq($g2099$.getDynamicValue(var2), (SubLObject)$ic7$);
    }
    
    public static SubLObject f9596() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq($g2099$.getDynamicValue(var2), (SubLObject)$ic9$);
    }
    
    public static SubLObject f9597() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq($g2099$.getDynamicValue(var2), (SubLObject)$ic10$);
    }
    
    public static SubLObject f9598() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq($g2099$.getDynamicValue(var2), (SubLObject)$ic11$);
    }
    
    public static SubLObject f9599() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq($g2099$.getDynamicValue(var2), (SubLObject)$ic12$);
    }
    
    public static SubLObject f9574(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12832(module0018.$g637$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != var3 && !var1.eql(var3) && NIL != module0264.f17432(var3, var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9576(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12832(module0018.$g637$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != var3 && !var1.eql(var3) && NIL != module0264.f17438(var3, var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9575(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12832(module0018.$g637$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != var3 && !var1.eql(var3) && NIL != module0264.f17435(var3, var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9577(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12832(module0018.$g637$.getDynamicValue(var2), (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != var3 && !var1.eql(var3) && NIL != module0264.f17441(var3, var1, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9578(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13333(module0018.$g637$.getDynamicValue(var2));
        return (SubLObject)makeBoolean(NIL != var3 && NIL != module0261.f17246(var3, var1, (SubLObject)NIL, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9600(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13333(module0018.$g637$.getDynamicValue(var2));
        return (SubLObject)makeBoolean(NIL != var3 && NIL != module0261.f17250(var3, var1, (SubLObject)NIL, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f9601(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic42$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic42$);
        var9 = var7.first();
        final SubLObject var10;
        var7 = (var10 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic43$, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic44$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic45$, var8)), ConsesLow.append(var10, (SubLObject)NIL)));
    }
    
    public static SubLObject f9602(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic42$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic42$);
        var9 = var7.first();
        final SubLObject var10;
        var7 = (var10 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)ConsesLow.list((SubLObject)$ic46$, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic44$, var9), (SubLObject)ConsesLow.list((SubLObject)$ic45$, var8)), ConsesLow.append(var10, (SubLObject)NIL)));
    }
    
    public static SubLObject f9603(final SubLObject var35) {
        return (SubLObject)($ic48$.eql(var35) ? $ic9$ : $ic11$);
    }
    
    public static SubLObject f9604(final SubLObject var35) {
        return (SubLObject)($ic48$.eql(var35) ? $ic10$ : $ic12$);
    }
    
    public static SubLObject f9605(final SubLObject var39, final SubLObject var40) {
        f9606(var39, var40, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9607(final SubLObject var39) {
        return (SubLObject)((var39.getClass() == $sX12341_native.class) ? T : NIL);
    }
    
    public static SubLObject f9608(final SubLObject var39) {
        assert NIL != f9607(var39) : var39;
        return var39.getField2();
    }
    
    public static SubLObject f9609(final SubLObject var39) {
        assert NIL != f9607(var39) : var39;
        return var39.getField3();
    }
    
    public static SubLObject f9610(final SubLObject var39, final SubLObject var42) {
        assert NIL != f9607(var39) : var39;
        return var39.setField2(var42);
    }
    
    public static SubLObject f9611(final SubLObject var39, final SubLObject var42) {
        assert NIL != f9607(var39) : var39;
        return var39.setField3(var42);
    }
    
    public static SubLObject f9612(SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLObject var44 = (SubLObject)new $sX12341_native();
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var45 = (SubLObject)NIL, var45 = var43; NIL != var45; var45 = conses_high.cddr(var45)) {
            var46 = var45.first();
            var47 = conses_high.cadr(var45);
            var48 = var46;
            if (var48.eql((SubLObject)$ic63$)) {
                f9610(var44, var47);
            }
            else if (var48.eql((SubLObject)$ic64$)) {
                f9611(var44, var47);
            }
            else {
                Errors.error((SubLObject)$ic65$, var46);
            }
        }
        return var44;
    }
    
    public static SubLObject f9613(final SubLObject var48, final SubLObject var49) {
        Functions.funcall(var49, var48, (SubLObject)$ic66$, (SubLObject)$ic67$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var49, var48, (SubLObject)$ic68$, (SubLObject)$ic63$, f9608(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic68$, (SubLObject)$ic64$, f9609(var48));
        Functions.funcall(var49, var48, (SubLObject)$ic69$, (SubLObject)$ic67$, (SubLObject)TWO_INTEGER);
        return var48;
    }
    
    public static SubLObject f9614(final SubLObject var48, final SubLObject var49) {
        return f9613(var48, var49);
    }
    
    public static SubLObject f9606(final SubLObject var50, final SubLObject var40, final SubLObject var51) {
        PrintLow.format(var40, (SubLObject)$ic71$, f9608(var50), f9609(var50));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9615(SubLObject var1, SubLObject var28) {
        if (var1 == UNPROVIDED) {
            var1 = $g2097$.getDynamicValue();
        }
        if (var28 == UNPROVIDED) {
            var28 = $g2099$.getDynamicValue();
        }
        final SubLObject var29 = f9612((SubLObject)UNPROVIDED);
        f9610(var29, var1);
        f9611(var29, var28);
        return var29;
    }
    
    public static SubLObject f9616(SubLObject var1, SubLObject var28) {
        if (var1 == UNPROVIDED) {
            var1 = $g2097$.getDynamicValue();
        }
        if (var28 == UNPROVIDED) {
            var28 = $g2099$.getDynamicValue();
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0034.$g879$.getDynamicValue(var29);
        SubLObject var31 = (SubLObject)NIL;
        if (NIL == var30) {
            return f9615(var1, var28);
        }
        var31 = module0034.f1857(var30, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
        if (NIL == var31) {
            var31 = module0034.f1807(module0034.f1842(var30), (SubLObject)$ic72$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var30, (SubLObject)$ic72$, var31);
        }
        final SubLObject var32 = module0034.f1782(var1, var28);
        final SubLObject var33 = module0034.f1814(var31, var32, (SubLObject)UNPROVIDED);
        if (var33 != $ic73$) {
            SubLObject var34 = var33;
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL != var34) {
                SubLObject var36 = var35.first();
                final SubLObject var37 = conses_high.second(var35);
                if (var1.eql(var36.first())) {
                    var36 = var36.rest();
                    if (NIL != var36 && NIL == var36.rest() && var28.eql(var36.first())) {
                        return module0034.f1959(var37);
                    }
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
        }
        final SubLObject var38 = Values.arg2(var29.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f9615(var1, var28)));
        module0034.f1836(var31, var32, var33, var38, (SubLObject)ConsesLow.list(var1, var28));
        return module0034.f1959(var38);
    }
    
    public static SubLObject f9617() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9565", "S#12343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9566", "S#12344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9567", "S#12345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9568", "S#12346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9569", "S#12347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9570", "S#12348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9571", "S#12349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9572", "S#12350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9573", "S#12351", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9579", "S#12352", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9580", "S#12353", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9581", "S#12354");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9582", "WITH-ALL-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9583", "S#12355");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9584", "S#12356");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9585", "S#12357");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9586", "WITH-ALL-SPEC-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9587", "S#12358");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9588", "S#12359");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9589", "S#12360");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9590", "S#12361");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9591", "S#12362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9592", "S#12363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9593", "S#12364", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9594", "S#12365", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9595", "S#12366", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9596", "S#12367", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9597", "S#12368", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9598", "S#12369", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9599", "S#12370", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9574", "S#12371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9576", "S#12372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9575", "S#12373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9577", "S#12374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9578", "S#12375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9600", "S#12376", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9601", "S#12377");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0148", "f9602", "S#12378");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9603", "S#12379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9604", "S#12380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9605", "S#12381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9607", "S#12342", 1, 0, false);
        new $f9607$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9608", "S#12382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9609", "S#12383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9610", "S#12384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9611", "S#12385", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9612", "S#12386", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9613", "S#12387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9614", "S#12388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9606", "S#12389", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9615", "S#12390", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0148", "f9616", "S#12391", 0, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9618() {
        $g2097$ = SubLFiles.defparameter("S#12392", (SubLObject)NIL);
        $g2098$ = SubLFiles.defparameter("S#12393", (SubLObject)NIL);
        $g2099$ = SubLFiles.defparameter("S#12394", (SubLObject)NIL);
        $g2100$ = SubLFiles.defconstant("S#12395", (SubLObject)$ic50$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f9619() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic0$);
        module0002.f50((SubLObject)$ic37$, (SubLObject)$ic39$);
        module0002.f50((SubLObject)$ic38$, (SubLObject)$ic39$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic41$);
        module0002.f50((SubLObject)$ic43$, (SubLObject)$ic47$);
        module0002.f50((SubLObject)$ic46$, (SubLObject)$ic49$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2100$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic57$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic58$);
        Structures.def_csetf((SubLObject)$ic59$, (SubLObject)$ic60$);
        Structures.def_csetf((SubLObject)$ic61$, (SubLObject)$ic62$);
        Equality.identity((SubLObject)$ic50$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2100$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic70$));
        module0034.f1895((SubLObject)$ic72$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f9617();
    }
    
    public void initializeVariables() {
        f9618();
    }
    
    public void runTopLevelForms() {
        f9619();
    }
    
    static {
        me = (SubLFile)new module0148();
        $g2097$ = null;
        $g2098$ = null;
        $g2099$ = null;
        $g2100$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#12343", "CYC"), (SubLObject)makeSymbol("S#12344", "CYC"), (SubLObject)makeSymbol("S#12345", "CYC"), (SubLObject)makeSymbol("S#12346", "CYC"), (SubLObject)makeSymbol("S#12347", "CYC"), (SubLObject)makeSymbol("S#12348", "CYC"), (SubLObject)makeSymbol("S#12349", "CYC"));
        $ic1$ = makeSymbol("S#12343", "CYC");
        $ic2$ = makeSymbol("S#12344", "CYC");
        $ic3$ = makeSymbol("S#12345", "CYC");
        $ic4$ = makeSymbol("S#12346", "CYC");
        $ic5$ = makeSymbol("S#12347", "CYC");
        $ic6$ = makeSymbol("S#12348", "CYC");
        $ic7$ = makeSymbol("S#12349", "CYC");
        $ic8$ = makeSymbol("S#12336", "CYC");
        $ic9$ = makeSymbol("S#12371", "CYC");
        $ic10$ = makeSymbol("S#12373", "CYC");
        $ic11$ = makeSymbol("S#12372", "CYC");
        $ic12$ = makeSymbol("S#12374", "CYC");
        $ic13$ = makeSymbol("S#12375", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic15$ = makeSymbol("CLET");
        $ic16$ = makeSymbol("S#12394", "CYC");
        $ic17$ = makeSymbol("S#12354", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12343", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12344", "CYC"));
        $ic21$ = makeSymbol("S#12392", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#10994", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12345", "CYC"));
        $ic24$ = makeSymbol("S#12393", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12346", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12347", "CYC"));
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12348", "CYC"));
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#12349", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12396", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic30$ = makeSymbol("PCASE");
        $ic31$ = makeSymbol("S#12355", "CYC");
        $ic32$ = makeSymbol("WITH-ALL-SPEC-PREDICATES");
        $ic33$ = makeSymbol("S#12358", "CYC");
        $ic34$ = makeSymbol("S#12359", "CYC");
        $ic35$ = makeSymbol("PROGN");
        $ic36$ = makeUninternedSymbol("US#2D65271");
        $ic37$ = makeSymbol("S#12362", "CYC");
        $ic38$ = makeSymbol("S#12363", "CYC");
        $ic39$ = makeSymbol("S#12361", "CYC");
        $ic40$ = makeSymbol("FORT-P");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("S#12364", "CYC"), (SubLObject)makeSymbol("S#12365", "CYC"), (SubLObject)makeSymbol("S#12366", "CYC"), (SubLObject)makeSymbol("S#12367", "CYC"), (SubLObject)makeSymbol("S#12368", "CYC"), (SubLObject)makeSymbol("S#12369", "CYC"), (SubLObject)makeSymbol("S#12370", "CYC"));
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#12398", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic43$ = makeSymbol("S#12379", "CYC");
        $ic44$ = makeSymbol("S#1868", "CYC");
        $ic45$ = makeSymbol("S#1869", "CYC");
        $ic46$ = makeSymbol("S#12380", "CYC");
        $ic47$ = makeSymbol("S#12377", "CYC");
        $ic48$ = makeKeyword("POS");
        $ic49$ = makeSymbol("S#12378", "CYC");
        $ic50$ = makeSymbol("S#12341", "CYC");
        $ic51$ = makeSymbol("S#12342", "CYC");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#12396", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)makeKeyword("PRED"), (SubLObject)makeKeyword("RELEVANCE-FUNCTION"));
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("S#12382", "CYC"), (SubLObject)makeSymbol("S#12383", "CYC"));
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#12384", "CYC"), (SubLObject)makeSymbol("S#12385", "CYC"));
        $ic56$ = makeSymbol("S#12389", "CYC");
        $ic57$ = makeSymbol("S#12381", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#12342", "CYC"));
        $ic59$ = makeSymbol("S#12382", "CYC");
        $ic60$ = makeSymbol("S#12384", "CYC");
        $ic61$ = makeSymbol("S#12383", "CYC");
        $ic62$ = makeSymbol("S#12385", "CYC");
        $ic63$ = makeKeyword("PRED");
        $ic64$ = makeKeyword("RELEVANCE-FUNCTION");
        $ic65$ = makeString("Invalid slot ~S for construction function");
        $ic66$ = makeKeyword("BEGIN");
        $ic67$ = makeSymbol("S#12386", "CYC");
        $ic68$ = makeKeyword("SLOT");
        $ic69$ = makeKeyword("END");
        $ic70$ = makeSymbol("S#12388", "CYC");
        $ic71$ = makeString("#<PRED-INFO:~s:~s>");
        $ic72$ = makeSymbol("S#12391", "CYC");
        $ic73$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
    }
    
    public static final class $sX12341_native extends SubLStructNative
    {
        public SubLObject $pred;
        public SubLObject $relevance_function;
        public static final SubLStructDeclNative structDecl;
        
        public $sX12341_native() {
            this.$pred = (SubLObject)CommonSymbols.NIL;
            this.$relevance_function = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX12341_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$pred;
        }
        
        public SubLObject getField3() {
            return this.$relevance_function;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$pred = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$relevance_function = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX12341_native.class, $ic50$, $ic51$, $ic52$, $ic53$, new String[] { "$pred", "$relevance_function" }, $ic54$, $ic55$, $ic56$);
        }
    }
    
    public static final class $f9607$UnaryFunction extends UnaryFunction
    {
        public $f9607$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12342"));
        }
        
        public SubLObject processItem(final SubLObject var41) {
            return f9607(var41);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 249 ms
	
	Decompiled with Procyon 0.5.32.
*/