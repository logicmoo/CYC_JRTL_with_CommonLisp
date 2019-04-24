package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0013 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0013";
    public static final String myFingerPrint = "0b8c8b97a5ccad1d408f339d214b4e9834caafd5d4d13b622c041742a43cfb57";
    private static SubLSymbol $g105$;
    private static SubLSymbol $g106$;
    private static SubLSymbol $g107$;
    private static SubLSymbol $g108$;
    private static SubLSymbol $g109$;
    public static SubLSymbol $g110$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLList $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    
    public static SubLObject f616(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0013.$ic0$, reader.bq_cons((SubLObject)module0013.$ic1$, ConsesLow.append(var5, (SubLObject)module0013.NIL)));
    }
    
    public static SubLObject f617(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic0$, (SubLObject)module0013.$ic2$, ConsesLow.append(var5, (SubLObject)module0013.NIL));
    }
    
    public static SubLObject f618(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic0$, (SubLObject)module0013.$ic3$, ConsesLow.append(var5, (SubLObject)module0013.NIL));
    }
    
    public static SubLObject f619(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0013.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic4$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic0$, (SubLObject)ConsesLow.list((SubLObject)module0013.$ic5$, (SubLObject)module0013.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0013.$ic7$, var5)), ConsesLow.append(var6, (SubLObject)module0013.NIL));
    }
    
    public static SubLObject f620(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = Hashtables.gethash(var13, module0013.$g106$.getDynamicValue(var14), (SubLObject)module0013.UNPROVIDED);
        return (SubLObject)ConsesLow.cons(var13, f621(var15));
    }
    
    public static SubLObject f621(final SubLObject var15) {
        final SubLObject var16 = f622(var15);
        final SubLObject var17 = f623(var15);
        final SubLObject var18 = f624(var15);
        final SubLObject var19 = Numbers.divide(var17, var16);
        return (SubLObject)ConsesLow.list(var19, var18);
    }
    
    public static SubLObject f625(SubLObject var20) {
        if (var20 == module0013.UNPROVIDED) {
            var20 = (SubLObject)module0013.NIL;
        }
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0013.NIL;
        final SubLObject var23 = module0013.$g106$.getDynamicValue(var21);
        SubLObject var24 = (SubLObject)module0013.NIL;
        SubLObject var25 = (SubLObject)module0013.NIL;
        final Iterator var26 = Hashtables.getEntrySetIterator(var23);
        try {
            while (Hashtables.iteratorHasNext(var26)) {
                final Map.Entry var27 = Hashtables.iteratorNextEntry(var26);
                var24 = Hashtables.getEntryKey(var27);
                var25 = Hashtables.getEntryValue(var27);
                var22 = (SubLObject)ConsesLow.cons(f620(var24), var22);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var26);
        }
        if (module0013.NIL != var20) {
            Hashtables.sethash(var20, module0013.$g105$.getDynamicValue(var21), var22);
            f626();
        }
        return var22;
    }
    
    public static SubLObject f627() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0013.NIL;
        final SubLObject var16 = module0013.$g105$.getDynamicValue(var14);
        SubLObject var17 = (SubLObject)module0013.NIL;
        SubLObject var18 = (SubLObject)module0013.NIL;
        final Iterator var19 = Hashtables.getEntrySetIterator(var16);
        try {
            while (Hashtables.iteratorHasNext(var19)) {
                final Map.Entry var20 = Hashtables.iteratorNextEntry(var19);
                var17 = Hashtables.getEntryKey(var20);
                var18 = Hashtables.getEntryValue(var20);
                var15 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var17, (SubLObject)ConsesLow.list(var18)), var15);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var19);
        }
        return var15;
    }
    
    public static SubLObject f626() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        Hashtables.clrhash(module0013.$g106$.getDynamicValue(var14));
        return (SubLObject)module0013.$ic8$;
    }
    
    public static SubLObject f628() {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        Hashtables.clrhash(module0013.$g105$.getDynamicValue(var14));
        return (SubLObject)module0013.$ic9$;
    }
    
    public static SubLObject f629(final SubLObject var27, final SubLObject var28) {
        f630(var27, var28, (SubLObject)module0013.ZERO_INTEGER);
        return (SubLObject)module0013.NIL;
    }
    
    public static SubLObject f631(final SubLObject var27) {
        return (SubLObject)((var27.getClass() == $sX555_native.class) ? module0013.T : module0013.NIL);
    }
    
    public static SubLObject f622(final SubLObject var27) {
        assert module0013.NIL != f631(var27) : var27;
        return var27.getField2();
    }
    
    public static SubLObject f623(final SubLObject var27) {
        assert module0013.NIL != f631(var27) : var27;
        return var27.getField3();
    }
    
    public static SubLObject f624(final SubLObject var27) {
        assert module0013.NIL != f631(var27) : var27;
        return var27.getField4();
    }
    
    public static SubLObject f632(final SubLObject var27, final SubLObject var30) {
        assert module0013.NIL != f631(var27) : var27;
        return var27.setField2(var30);
    }
    
    public static SubLObject f633(final SubLObject var27, final SubLObject var30) {
        assert module0013.NIL != f631(var27) : var27;
        return var27.setField3(var30);
    }
    
    public static SubLObject f634(final SubLObject var27, final SubLObject var30) {
        assert module0013.NIL != f631(var27) : var27;
        return var27.setField4(var30);
    }
    
    public static SubLObject f635(SubLObject var31) {
        if (var31 == module0013.UNPROVIDED) {
            var31 = (SubLObject)module0013.NIL;
        }
        final SubLObject var32 = (SubLObject)new $sX555_native();
        SubLObject var33;
        SubLObject var34;
        SubLObject var35;
        SubLObject var36;
        for (var33 = (SubLObject)module0013.NIL, var33 = var31; module0013.NIL != var33; var33 = conses_high.cddr(var33)) {
            var34 = var33.first();
            var35 = conses_high.cadr(var33);
            var36 = var34;
            if (var36.eql((SubLObject)module0013.$ic25$)) {
                f632(var32, var35);
            }
            else if (var36.eql((SubLObject)module0013.$ic26$)) {
                f633(var32, var35);
            }
            else if (var36.eql((SubLObject)module0013.$ic27$)) {
                f634(var32, var35);
            }
            else {
                Errors.error((SubLObject)module0013.$ic28$, var34);
            }
        }
        return var32;
    }
    
    public static SubLObject f636(final SubLObject var37, final SubLObject var38) {
        Functions.funcall(var38, var37, (SubLObject)module0013.$ic29$, (SubLObject)module0013.$ic30$, (SubLObject)module0013.THREE_INTEGER);
        Functions.funcall(var38, var37, (SubLObject)module0013.$ic31$, (SubLObject)module0013.$ic25$, f622(var37));
        Functions.funcall(var38, var37, (SubLObject)module0013.$ic31$, (SubLObject)module0013.$ic26$, f623(var37));
        Functions.funcall(var38, var37, (SubLObject)module0013.$ic31$, (SubLObject)module0013.$ic27$, f624(var37));
        Functions.funcall(var38, var37, (SubLObject)module0013.$ic32$, (SubLObject)module0013.$ic30$, (SubLObject)module0013.THREE_INTEGER);
        return var37;
    }
    
    public static SubLObject f637(final SubLObject var37, final SubLObject var38) {
        return f636(var37, var38);
    }
    
    public static SubLObject f630(final SubLObject var39, final SubLObject var28, final SubLObject var40) {
        PrintLow.format(var28, (SubLObject)module0013.$ic34$, new SubLObject[] { f622(var39), f623(var39), f624(var39) });
        return var39;
    }
    
    public static SubLObject f638(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0013.NIL != module0013.$g107$.getDynamicValue(var42) && (module0013.NIL != module0013.$g108$.getDynamicValue(var42) || module0013.NIL != module0004.f104(var41, module0013.$g109$.getDynamicValue(var42), (SubLObject)module0013.UNPROVIDED, (SubLObject)module0013.UNPROVIDED)));
    }
    
    public static SubLObject f639(final SubLObject var41, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = Hashtables.gethash(var41, module0013.$g106$.getDynamicValue(var43), (SubLObject)module0013.UNPROVIDED);
        if (module0013.NIL != var44) {
            f640(var44, var42);
        }
        else {
            Hashtables.sethash(var41, module0013.$g106$.getDynamicValue(var43), f641(var42));
        }
        return var44;
    }
    
    public static SubLObject f641(final SubLObject var42) {
        final SubLObject var43 = f635((SubLObject)module0013.UNPROVIDED);
        f632(var43, (SubLObject)module0013.ONE_INTEGER);
        f633(var43, var42);
        f634(var43, var42);
        return var43;
    }
    
    public static SubLObject f640(final SubLObject var15, final SubLObject var42) {
        f632(var15, Numbers.add(f622(var15), (SubLObject)module0013.ONE_INTEGER));
        f633(var15, Numbers.add(f623(var15), var42));
        if (var42.numG(f624(var15))) {
            f634(var15, var42);
        }
        return var15;
    }
    
    public static SubLObject f642(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0013.NIL;
        SubLObject var6 = (SubLObject)module0013.NIL;
        SubLObject var7 = (SubLObject)module0013.NIL;
        SubLObject var8 = (SubLObject)module0013.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic35$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic35$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic35$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic35$);
        var8 = var4.first();
        final SubLObject var9;
        var4 = (var9 = var4.rest());
        final SubLObject var10 = (SubLObject)module0013.$ic36$;
        final SubLObject var11 = (SubLObject)module0013.$ic37$;
        final SubLObject var12 = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(var6), (SubLObject)module0013.$ic38$), (SubLObject)module0013.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)module0013.$ic39$, (SubLObject)ConsesLow.listS(var5, var6, var7, ConsesLow.append(var8, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0013.$ic40$, (SubLObject)ConsesLow.list((SubLObject)module0013.$ic41$, (SubLObject)ConsesLow.list((SubLObject)module0013.$ic42$, var6)), (SubLObject)ConsesLow.list((SubLObject)module0013.$ic0$, (SubLObject)ConsesLow.list(var10, var11), (SubLObject)ConsesLow.list((SubLObject)module0013.$ic43$, var10, (SubLObject)ConsesLow.list((SubLObject)module0013.$ic44$, var11, (SubLObject)ConsesLow.list((SubLObject)module0013.$ic45$, reader.bq_cons(var12, ConsesLow.append(module0012.f539(var7), (SubLObject)module0013.NIL))))), (SubLObject)ConsesLow.list((SubLObject)module0013.$ic46$, (SubLObject)ConsesLow.list((SubLObject)module0013.$ic42$, var6), var10), (SubLObject)ConsesLow.list((SubLObject)module0013.$ic47$, (SubLObject)ConsesLow.list((SubLObject)module0013.$ic48$, var11))), (SubLObject)ConsesLow.list((SubLObject)module0013.$ic47$, reader.bq_cons(var12, ConsesLow.append(module0012.f539(var7), (SubLObject)module0013.NIL))))))), (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic49$, var12, var7, ConsesLow.append(var9, (SubLObject)module0013.NIL)));
    }
    
    public static SubLObject f643(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0013.NIL;
        SubLObject var6 = (SubLObject)module0013.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        final SubLObject var7 = var4.rest();
        final SubLObject var8;
        var4 = (var8 = var4.first());
        final SubLObject var9;
        var4 = (var9 = var7);
        return (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic51$, (SubLObject)module0013.$ic49$, var5, var6, var8, ConsesLow.append(var9, (SubLObject)module0013.NIL));
    }
    
    public static SubLObject f644(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0013.NIL;
        SubLObject var6 = (SubLObject)module0013.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        final SubLObject var7 = var4.rest();
        final SubLObject var8;
        var4 = (var8 = var4.first());
        final SubLObject var9;
        var4 = (var9 = var7);
        return (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic51$, (SubLObject)module0013.$ic52$, var5, var6, var8, ConsesLow.append(var9, (SubLObject)module0013.NIL));
    }
    
    public static SubLObject f645(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0013.NIL;
        SubLObject var6 = (SubLObject)module0013.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        final SubLObject var7 = var4.rest();
        final SubLObject var8;
        var4 = (var8 = var4.first());
        final SubLObject var9;
        var4 = (var9 = var7);
        return (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic51$, (SubLObject)module0013.$ic53$, var5, var6, var8, ConsesLow.append(var9, (SubLObject)module0013.NIL));
    }
    
    public static SubLObject f646(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0013.NIL;
        SubLObject var6 = (SubLObject)module0013.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        final SubLObject var7 = var4.rest();
        final SubLObject var8;
        var4 = (var8 = var4.first());
        final SubLObject var9;
        var4 = (var9 = var7);
        return (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic51$, (SubLObject)module0013.$ic54$, var5, var6, var8, ConsesLow.append(var9, (SubLObject)module0013.NIL));
    }
    
    public static SubLObject f647(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0013.NIL;
        SubLObject var6 = (SubLObject)module0013.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0013.$ic50$);
        final SubLObject var7 = var4.rest();
        final SubLObject var8;
        var4 = (var8 = var4.first());
        final SubLObject var9;
        var4 = (var9 = var7);
        return (SubLObject)ConsesLow.listS((SubLObject)module0013.$ic51$, (SubLObject)module0013.$ic55$, var5, var6, var8, ConsesLow.append(var9, (SubLObject)module0013.NIL));
    }
    
    public static SubLObject f648() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f616", "S#774");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f617", "S#775");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f618", "S#776");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f619", "S#777");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f620", "S#778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f621", "S#779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f625", "S#780", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f627", "S#781", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f626", "S#782", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f628", "S#783", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f629", "S#784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f631", "S#773", 1, 0, false);
        new $f631$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f622", "S#785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f623", "S#786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f624", "S#787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f632", "S#788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f633", "S#789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f634", "S#790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f635", "S#791", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f636", "S#792", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f637", "S#793", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f630", "S#794", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f638", "S#795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f639", "S#796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f641", "S#797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0013", "f640", "S#798", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f642", "S#799");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f643", "S#800");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f644", "S#801");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f645", "S#802");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f646", "S#803");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0013", "f647", "S#804");
        return (SubLObject)module0013.NIL;
    }
    
    public static SubLObject f649() {
        module0013.$g105$ = SubLFiles.defparameter("S#805", Hashtables.make_hash_table((SubLObject)module0013.TEN_INTEGER, (SubLObject)module0013.UNPROVIDED, (SubLObject)module0013.UNPROVIDED));
        module0013.$g106$ = SubLFiles.defparameter("S#806", Hashtables.make_hash_table((SubLObject)module0013.TEN_INTEGER, (SubLObject)module0013.UNPROVIDED, (SubLObject)module0013.UNPROVIDED));
        module0013.$g107$ = SubLFiles.defparameter("S#807", (SubLObject)module0013.T);
        module0013.$g108$ = SubLFiles.defparameter("S#808", (SubLObject)module0013.NIL);
        module0013.$g109$ = SubLFiles.defparameter("S#809", (SubLObject)module0013.NIL);
        module0013.$g110$ = SubLFiles.defconstant("S#810", (SubLObject)module0013.$ic10$);
        return (SubLObject)module0013.NIL;
    }
    
    public static SubLObject f650() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0013.$g110$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0013.$ic17$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0013.$ic18$);
        Structures.def_csetf((SubLObject)module0013.$ic19$, (SubLObject)module0013.$ic20$);
        Structures.def_csetf((SubLObject)module0013.$ic21$, (SubLObject)module0013.$ic22$);
        Structures.def_csetf((SubLObject)module0013.$ic23$, (SubLObject)module0013.$ic24$);
        Equality.identity((SubLObject)module0013.$ic10$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0013.$g110$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0013.$ic33$));
        return (SubLObject)module0013.NIL;
    }
    
    public void declareFunctions() {
        f648();
    }
    
    public void initializeVariables() {
        f649();
    }
    
    public void runTopLevelForms() {
        f650();
    }
    
    static {
        me = (SubLFile)new module0013();
        module0013.$g105$ = null;
        module0013.$g106$ = null;
        module0013.$g107$ = null;
        module0013.$g108$ = null;
        module0013.$g109$ = null;
        module0013.$g110$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#806", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)module0013.TEN_INTEGER));
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#807", "CYC"), (SubLObject)module0013.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#808", "CYC"), (SubLObject)module0013.NIL));
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#807", "CYC"), (SubLObject)module0013.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#808", "CYC"), (SubLObject)module0013.T));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#807", "CYC"), (SubLObject)module0013.T);
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#808", "CYC"), (SubLObject)module0013.NIL);
        $ic7$ = SubLObjectFactory.makeSymbol("S#809", "CYC");
        $ic8$ = SubLObjectFactory.makeString("Timing info cleared");
        $ic9$ = SubLObjectFactory.makeString("Time testing environment cleared");
        $ic10$ = SubLObjectFactory.makeSymbol("S#555", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#773", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("S#702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"));
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX"));
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#786", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#787", "CYC"));
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#788", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#789", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#790", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("S#794", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#784", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#773", "CYC"));
        $ic19$ = SubLObjectFactory.makeSymbol("S#785", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#788", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#786", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#789", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#787", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#790", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("COUNT");
        $ic26$ = SubLObjectFactory.makeKeyword("TOTAL");
        $ic27$ = SubLObjectFactory.makeKeyword("MAX");
        $ic28$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic29$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic30$ = SubLObjectFactory.makeSymbol("S#791", "CYC");
        $ic31$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic32$ = SubLObjectFactory.makeKeyword("END");
        $ic33$ = SubLObjectFactory.makeSymbol("S#793", "CYC");
        $ic34$ = SubLObjectFactory.makeString("~&#<TIMING-INFO: Count=~S Total=~S Max=~S>~%");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#812", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#814", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic36$ = SubLObjectFactory.makeUninternedSymbol("US#51810F2");
        $ic37$ = SubLObjectFactory.makeUninternedSymbol("US#703B6C2");
        $ic38$ = SubLObjectFactory.makeString("-IN-TIMER");
        $ic39$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic40$ = SubLObjectFactory.makeSymbol("PIF");
        $ic41$ = SubLObjectFactory.makeSymbol("S#795", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic43$ = SubLObjectFactory.makeSymbol("CTIME");
        $ic44$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic45$ = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $ic46$ = SubLObjectFactory.makeSymbol("S#796", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("RET");
        $ic48$ = SubLObjectFactory.makeSymbol("VALUES-LIST");
        $ic49$ = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#814", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic51$ = SubLObjectFactory.makeSymbol("S#799", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $ic53$ = SubLObjectFactory.makeSymbol("DEFINE");
        $ic54$ = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#369", "CYC");
    }
    
    public static final class $sX555_native extends SubLStructNative
    {
        public SubLObject $count;
        public SubLObject $total;
        public SubLObject $max;
        private static final SubLStructDeclNative structDecl;
        
        public $sX555_native() {
            this.$count = (SubLObject)CommonSymbols.NIL;
            this.$total = (SubLObject)CommonSymbols.NIL;
            this.$max = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX555_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$count;
        }
        
        public SubLObject getField3() {
            return this.$total;
        }
        
        public SubLObject getField4() {
            return this.$max;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$count = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$total = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$max = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX555_native.class, module0013.$ic10$, module0013.$ic11$, module0013.$ic12$, module0013.$ic13$, new String[] { "$count", "$total", "$max" }, module0013.$ic14$, module0013.$ic15$, module0013.$ic16$);
        }
    }
    
    public static final class $f631$UnaryFunction extends UnaryFunction
    {
        public $f631$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#773"));
        }
        
        public SubLObject processItem(final SubLObject var29) {
            return module0013.f631(var29);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0013.class
	Total time: 129 ms
	
	Decompiled with Procyon 0.5.32.
*/