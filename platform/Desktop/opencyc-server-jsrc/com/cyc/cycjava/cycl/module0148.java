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
        return (SubLObject)module0148.T;
    }
    
    public static SubLObject f9566(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eql(module0148.$g2097$.getDynamicValue(var2), var1);
    }
    
    public static SubLObject f9567(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0004.f104(var1, module0148.$g2098$.getDynamicValue(var2), (SubLObject)module0148.UNPROVIDED, (SubLObject)module0148.UNPROVIDED);
    }
    
    public static SubLObject f9568(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL == f9567(var1));
    }
    
    public static SubLObject f9569(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != f9566(var1) || module0148.NIL != module0264.f17432(module0148.$g2097$.getDynamicValue(var2), var1, (SubLObject)module0148.UNPROVIDED));
    }
    
    public static SubLObject f9570(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0264.f17435(module0148.$g2097$.getDynamicValue(var2), var1, (SubLObject)module0148.UNPROVIDED);
    }
    
    public static SubLObject f9571(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != f9566(var1) || module0148.NIL != module0264.f17432(module0148.$g2097$.getDynamicValue(var2), var1, (SubLObject)module0148.UNPROVIDED) || module0148.NIL != module0264.f17435(module0148.$g2097$.getDynamicValue(var2), var1, (SubLObject)module0148.UNPROVIDED));
    }
    
    public static SubLObject f9572(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0148.NIL != f9573()) {
            return (SubLObject)module0148.T;
        }
        final SubLObject var3 = module0148.$g2099$.getDynamicValue(var2);
        if (var3.eql((SubLObject)module0148.$ic1$)) {
            return f9565(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic2$)) {
            return f9566(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic3$)) {
            return f9567(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic4$)) {
            return f9568(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic5$)) {
            return f9569(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic6$)) {
            return f9570(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic7$)) {
            return f9571(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic8$)) {
            return module0239.f15598(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic9$)) {
            return f9574(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic10$)) {
            return f9575(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic11$)) {
            return f9576(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic12$)) {
            return f9577(var1);
        }
        if (var3.eql((SubLObject)module0148.$ic13$)) {
            return f9578(var1);
        }
        return Functions.funcall(module0148.$g2099$.getDynamicValue(var2), var1);
    }
    
    public static SubLObject f9573() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL == module0148.$g2099$.getDynamicValue(var2));
    }
    
    public static SubLObject f9579() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != f9573() || module0148.$ic1$ == module0148.$g2099$.getDynamicValue(var2));
    }
    
    public static SubLObject f9580() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)module0148.$ic2$, module0148.$g2099$.getDynamicValue(var2));
    }
    
    public static SubLObject f9581(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic14$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic16$, var8)), ConsesLow.append(var9, (SubLObject)module0148.NIL));
    }
    
    public static SubLObject f9582(final SubLObject var4, final SubLObject var5) {
        final SubLObject var6 = var4.rest();
        final SubLObject var8;
        final SubLObject var7 = var8 = var6;
        return (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic17$, (SubLObject)module0148.$ic18$, ConsesLow.append(var8, (SubLObject)module0148.NIL));
    }
    
    public static SubLObject f9583(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)module0148.$ic20$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic21$, var8)), ConsesLow.append(var9, (SubLObject)module0148.NIL)));
    }
    
    public static SubLObject f9584(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic22$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)module0148.$ic23$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic24$, var8)), ConsesLow.append(var9, (SubLObject)module0148.NIL)));
    }
    
    public static SubLObject f9585(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic22$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)module0148.$ic25$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic24$, var8)), ConsesLow.append(var9, (SubLObject)module0148.NIL)));
    }
    
    public static SubLObject f9586(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)module0148.$ic26$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic21$, var8)), ConsesLow.append(var9, (SubLObject)module0148.NIL)));
    }
    
    public static SubLObject f9587(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)module0148.$ic27$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic21$, var8)), ConsesLow.append(var9, (SubLObject)module0148.NIL)));
    }
    
    public static SubLObject f9588(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)module0148.$ic28$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic21$, var8)), ConsesLow.append(var9, (SubLObject)module0148.NIL)));
    }
    
    public static SubLObject f9589(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        SubLObject var9 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic29$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic29$);
        var9 = var7.first();
        final SubLObject var10;
        var7 = (var10 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic30$, var9, (SubLObject)ConsesLow.list((SubLObject)module0148.$ic2$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic31$, var8, ConsesLow.append(var10, (SubLObject)module0148.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0148.$ic5$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic32$, var8, ConsesLow.append(var10, (SubLObject)module0148.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0148.$ic6$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic33$, var8, ConsesLow.append(var10, (SubLObject)module0148.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0148.$ic7$, (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic34$, var8, ConsesLow.append(var10, (SubLObject)module0148.NIL))));
    }
    
    public static SubLObject f9590(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic19$);
        var8 = var7.first();
        final SubLObject var9;
        var7 = (var9 = var7.rest());
        if (module0148.NIL == var8) {
            return reader.bq_cons((SubLObject)module0148.$ic35$, ConsesLow.append(var9, (SubLObject)module0148.NIL));
        }
        final SubLObject var10 = (SubLObject)module0148.$ic36$;
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var10, var8)), (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0148.$ic37$, var10), (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic21$, (SubLObject)ConsesLow.list((SubLObject)module0148.$ic38$, var10))), ConsesLow.append(var9, (SubLObject)module0148.NIL))));
    }
    
    public static SubLObject f9591(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0148.NIL == var14) {
            return module0148.$g2099$.getDynamicValue(var15);
        }
        assert module0148.NIL != module0173.f10955(var14) : var14;
        return (SubLObject)module0148.$ic2$;
    }
    
    public static SubLObject f9592(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return (module0148.NIL != var14) ? var14 : module0148.$g2097$.getDynamicValue(var15);
    }
    
    public static SubLObject f9593() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq(module0148.$g2099$.getDynamicValue(var2), (SubLObject)module0148.$ic5$);
    }
    
    public static SubLObject f9594() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq(module0148.$g2099$.getDynamicValue(var2), (SubLObject)module0148.$ic6$);
    }
    
    public static SubLObject f9595() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq(module0148.$g2099$.getDynamicValue(var2), (SubLObject)module0148.$ic7$);
    }
    
    public static SubLObject f9596() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq(module0148.$g2099$.getDynamicValue(var2), (SubLObject)module0148.$ic9$);
    }
    
    public static SubLObject f9597() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq(module0148.$g2099$.getDynamicValue(var2), (SubLObject)module0148.$ic10$);
    }
    
    public static SubLObject f9598() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq(module0148.$g2099$.getDynamicValue(var2), (SubLObject)module0148.$ic11$);
    }
    
    public static SubLObject f9599() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Equality.eq(module0148.$g2099$.getDynamicValue(var2), (SubLObject)module0148.$ic12$);
    }
    
    public static SubLObject f9574(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12832(module0018.$g637$.getDynamicValue(var2), (SubLObject)module0148.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != var3 && !var1.eql(var3) && module0148.NIL != module0264.f17432(var3, var1, (SubLObject)module0148.UNPROVIDED));
    }
    
    public static SubLObject f9576(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12832(module0018.$g637$.getDynamicValue(var2), (SubLObject)module0148.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != var3 && !var1.eql(var3) && module0148.NIL != module0264.f17438(var3, var1, (SubLObject)module0148.UNPROVIDED));
    }
    
    public static SubLObject f9575(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12832(module0018.$g637$.getDynamicValue(var2), (SubLObject)module0148.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != var3 && !var1.eql(var3) && module0148.NIL != module0264.f17435(var3, var1, (SubLObject)module0148.UNPROVIDED));
    }
    
    public static SubLObject f9577(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0202.f12832(module0018.$g637$.getDynamicValue(var2), (SubLObject)module0148.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != var3 && !var1.eql(var3) && module0148.NIL != module0264.f17441(var3, var1, (SubLObject)module0148.UNPROVIDED));
    }
    
    public static SubLObject f9578(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13333(module0018.$g637$.getDynamicValue(var2));
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != var3 && module0148.NIL != module0261.f17246(var3, var1, (SubLObject)module0148.NIL, (SubLObject)module0148.UNPROVIDED));
    }
    
    public static SubLObject f9600(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0205.f13333(module0018.$g637$.getDynamicValue(var2));
        return (SubLObject)SubLObjectFactory.makeBoolean(module0148.NIL != var3 && module0148.NIL != module0261.f17250(var3, var1, (SubLObject)module0148.NIL, (SubLObject)module0148.UNPROVIDED));
    }
    
    public static SubLObject f9601(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        SubLObject var9 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic42$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic42$);
        var9 = var7.first();
        final SubLObject var10;
        var7 = (var10 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0148.$ic43$, var8), (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic44$, var9), (SubLObject)ConsesLow.list((SubLObject)module0148.$ic45$, var8)), ConsesLow.append(var10, (SubLObject)module0148.NIL)));
    }
    
    public static SubLObject f9602(final SubLObject var4, final SubLObject var5) {
        SubLObject var7;
        final SubLObject var6 = var7 = var4.rest();
        SubLObject var8 = (SubLObject)module0148.NIL;
        SubLObject var9 = (SubLObject)module0148.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic42$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0148.$ic42$);
        var9 = var7.first();
        final SubLObject var10;
        var7 = (var10 = var7.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0148.$ic17$, (SubLObject)ConsesLow.list((SubLObject)module0148.$ic46$, var8), (SubLObject)ConsesLow.listS((SubLObject)module0148.$ic15$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0148.$ic44$, var9), (SubLObject)ConsesLow.list((SubLObject)module0148.$ic45$, var8)), ConsesLow.append(var10, (SubLObject)module0148.NIL)));
    }
    
    public static SubLObject f9603(final SubLObject var35) {
        return (SubLObject)(module0148.$ic48$.eql(var35) ? module0148.$ic9$ : module0148.$ic11$);
    }
    
    public static SubLObject f9604(final SubLObject var35) {
        return (SubLObject)(module0148.$ic48$.eql(var35) ? module0148.$ic10$ : module0148.$ic12$);
    }
    
    public static SubLObject f9605(final SubLObject var39, final SubLObject var40) {
        f9606(var39, var40, (SubLObject)module0148.ZERO_INTEGER);
        return (SubLObject)module0148.NIL;
    }
    
    public static SubLObject f9607(final SubLObject var39) {
        return (SubLObject)((var39.getClass() == $sX12341_native.class) ? module0148.T : module0148.NIL);
    }
    
    public static SubLObject f9608(final SubLObject var39) {
        assert module0148.NIL != f9607(var39) : var39;
        return var39.getField2();
    }
    
    public static SubLObject f9609(final SubLObject var39) {
        assert module0148.NIL != f9607(var39) : var39;
        return var39.getField3();
    }
    
    public static SubLObject f9610(final SubLObject var39, final SubLObject var42) {
        assert module0148.NIL != f9607(var39) : var39;
        return var39.setField2(var42);
    }
    
    public static SubLObject f9611(final SubLObject var39, final SubLObject var42) {
        assert module0148.NIL != f9607(var39) : var39;
        return var39.setField3(var42);
    }
    
    public static SubLObject f9612(SubLObject var43) {
        if (var43 == module0148.UNPROVIDED) {
            var43 = (SubLObject)module0148.NIL;
        }
        final SubLObject var44 = (SubLObject)new $sX12341_native();
        SubLObject var45;
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var45 = (SubLObject)module0148.NIL, var45 = var43; module0148.NIL != var45; var45 = conses_high.cddr(var45)) {
            var46 = var45.first();
            var47 = conses_high.cadr(var45);
            var48 = var46;
            if (var48.eql((SubLObject)module0148.$ic63$)) {
                f9610(var44, var47);
            }
            else if (var48.eql((SubLObject)module0148.$ic64$)) {
                f9611(var44, var47);
            }
            else {
                Errors.error((SubLObject)module0148.$ic65$, var46);
            }
        }
        return var44;
    }
    
    public static SubLObject f9613(final SubLObject var48, final SubLObject var49) {
        Functions.funcall(var49, var48, (SubLObject)module0148.$ic66$, (SubLObject)module0148.$ic67$, (SubLObject)module0148.TWO_INTEGER);
        Functions.funcall(var49, var48, (SubLObject)module0148.$ic68$, (SubLObject)module0148.$ic63$, f9608(var48));
        Functions.funcall(var49, var48, (SubLObject)module0148.$ic68$, (SubLObject)module0148.$ic64$, f9609(var48));
        Functions.funcall(var49, var48, (SubLObject)module0148.$ic69$, (SubLObject)module0148.$ic67$, (SubLObject)module0148.TWO_INTEGER);
        return var48;
    }
    
    public static SubLObject f9614(final SubLObject var48, final SubLObject var49) {
        return f9613(var48, var49);
    }
    
    public static SubLObject f9606(final SubLObject var50, final SubLObject var40, final SubLObject var51) {
        PrintLow.format(var40, (SubLObject)module0148.$ic71$, f9608(var50), f9609(var50));
        return (SubLObject)module0148.NIL;
    }
    
    public static SubLObject f9615(SubLObject var1, SubLObject var28) {
        if (var1 == module0148.UNPROVIDED) {
            var1 = module0148.$g2097$.getDynamicValue();
        }
        if (var28 == module0148.UNPROVIDED) {
            var28 = module0148.$g2099$.getDynamicValue();
        }
        final SubLObject var29 = f9612((SubLObject)module0148.UNPROVIDED);
        f9610(var29, var1);
        f9611(var29, var28);
        return var29;
    }
    
    public static SubLObject f9616(SubLObject var1, SubLObject var28) {
        if (var1 == module0148.UNPROVIDED) {
            var1 = module0148.$g2097$.getDynamicValue();
        }
        if (var28 == module0148.UNPROVIDED) {
            var28 = module0148.$g2099$.getDynamicValue();
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        final SubLObject var30 = module0034.$g879$.getDynamicValue(var29);
        SubLObject var31 = (SubLObject)module0148.NIL;
        if (module0148.NIL == var30) {
            return f9615(var1, var28);
        }
        var31 = module0034.f1857(var30, (SubLObject)module0148.$ic72$, (SubLObject)module0148.UNPROVIDED);
        if (module0148.NIL == var31) {
            var31 = module0034.f1807(module0034.f1842(var30), (SubLObject)module0148.$ic72$, (SubLObject)module0148.TWO_INTEGER, (SubLObject)module0148.NIL, (SubLObject)module0148.EQL, (SubLObject)module0148.UNPROVIDED);
            module0034.f1860(var30, (SubLObject)module0148.$ic72$, var31);
        }
        final SubLObject var32 = module0034.f1782(var1, var28);
        final SubLObject var33 = module0034.f1814(var31, var32, (SubLObject)module0148.UNPROVIDED);
        if (var33 != module0148.$ic73$) {
            SubLObject var34 = var33;
            SubLObject var35 = (SubLObject)module0148.NIL;
            var35 = var34.first();
            while (module0148.NIL != var34) {
                SubLObject var36 = var35.first();
                final SubLObject var37 = conses_high.second(var35);
                if (var1.eql(var36.first())) {
                    var36 = var36.rest();
                    if (module0148.NIL != var36 && module0148.NIL == var36.rest() && var28.eql(var36.first())) {
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
        return (SubLObject)module0148.NIL;
    }
    
    public static SubLObject f9618() {
        module0148.$g2097$ = SubLFiles.defparameter("S#12392", (SubLObject)module0148.NIL);
        module0148.$g2098$ = SubLFiles.defparameter("S#12393", (SubLObject)module0148.NIL);
        module0148.$g2099$ = SubLFiles.defparameter("S#12394", (SubLObject)module0148.NIL);
        module0148.$g2100$ = SubLFiles.defconstant("S#12395", (SubLObject)module0148.$ic50$);
        return (SubLObject)module0148.NIL;
    }
    
    public static SubLObject f9619() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0148.$ic0$);
        module0002.f50((SubLObject)module0148.$ic37$, (SubLObject)module0148.$ic39$);
        module0002.f50((SubLObject)module0148.$ic38$, (SubLObject)module0148.$ic39$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0148.$ic41$);
        module0002.f50((SubLObject)module0148.$ic43$, (SubLObject)module0148.$ic47$);
        module0002.f50((SubLObject)module0148.$ic46$, (SubLObject)module0148.$ic49$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0148.$g2100$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0148.$ic57$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0148.$ic58$);
        Structures.def_csetf((SubLObject)module0148.$ic59$, (SubLObject)module0148.$ic60$);
        Structures.def_csetf((SubLObject)module0148.$ic61$, (SubLObject)module0148.$ic62$);
        Equality.identity((SubLObject)module0148.$ic50$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0148.$g2100$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0148.$ic70$));
        module0034.f1895((SubLObject)module0148.$ic72$);
        return (SubLObject)module0148.NIL;
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
        module0148.$g2097$ = null;
        module0148.$g2098$ = null;
        module0148.$g2099$ = null;
        module0148.$g2100$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12343", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12344", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12345", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12346", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12347", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12348", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12349", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#12343", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#12344", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#12345", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#12346", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#12347", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#12348", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#12349", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#12336", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#12371", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#12373", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#12372", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#12374", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#12375", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic15$ = SubLObjectFactory.makeSymbol("CLET");
        $ic16$ = SubLObjectFactory.makeSymbol("S#12394", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#12354", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12343", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12344", "CYC"));
        $ic21$ = SubLObjectFactory.makeSymbol("S#12392", "CYC");
        $ic22$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10994", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12345", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("S#12393", "CYC");
        $ic25$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12346", "CYC"));
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12347", "CYC"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12348", "CYC"));
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12349", "CYC"));
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12396", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic30$ = SubLObjectFactory.makeSymbol("PCASE");
        $ic31$ = SubLObjectFactory.makeSymbol("S#12355", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("WITH-ALL-SPEC-PREDICATES");
        $ic33$ = SubLObjectFactory.makeSymbol("S#12358", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#12359", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic36$ = SubLObjectFactory.makeUninternedSymbol("US#2D65271");
        $ic37$ = SubLObjectFactory.makeSymbol("S#12362", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#12363", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#12361", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#12364", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12365", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12366", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12367", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12368", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12369", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12370", "CYC"));
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic43$ = SubLObjectFactory.makeSymbol("S#12379", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#1868", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#1869", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#12380", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#12377", "CYC");
        $ic48$ = SubLObjectFactory.makeKeyword("POS");
        $ic49$ = SubLObjectFactory.makeSymbol("S#12378", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#12341", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#12342", "CYC");
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12396", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("RELEVANCE-FUNCTION"));
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12382", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12383", "CYC"));
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12384", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12385", "CYC"));
        $ic56$ = SubLObjectFactory.makeSymbol("S#12389", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#12381", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12342", "CYC"));
        $ic59$ = SubLObjectFactory.makeSymbol("S#12382", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#12384", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#12383", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#12385", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("PRED");
        $ic64$ = SubLObjectFactory.makeKeyword("RELEVANCE-FUNCTION");
        $ic65$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic66$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic67$ = SubLObjectFactory.makeSymbol("S#12386", "CYC");
        $ic68$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic69$ = SubLObjectFactory.makeKeyword("END");
        $ic70$ = SubLObjectFactory.makeSymbol("S#12388", "CYC");
        $ic71$ = SubLObjectFactory.makeString("#<PRED-INFO:~s:~s>");
        $ic72$ = SubLObjectFactory.makeSymbol("S#12391", "CYC");
        $ic73$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
    }
    
    public static final class $sX12341_native extends SubLStructNative
    {
        public SubLObject $pred;
        public SubLObject $relevance_function;
        private static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX12341_native.class, module0148.$ic50$, module0148.$ic51$, module0148.$ic52$, module0148.$ic53$, new String[] { "$pred", "$relevance_function" }, module0148.$ic54$, module0148.$ic55$, module0148.$ic56$);
        }
    }
    
    public static final class $f9607$UnaryFunction extends UnaryFunction
    {
        public $f9607$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#12342"));
        }
        
        public SubLObject processItem(final SubLObject var41) {
            return module0148.f9607(var41);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0148.class
	Total time: 249 ms
	
	Decompiled with Procyon 0.5.32.
*/