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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0381 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0381";
    public static final String myFingerPrint = "182831f67fdacb52cf1013bd337530606dd099342a498eff502a1033115624c8";
    public static SubLSymbol $g3218$;
    public static SubLSymbol $g3219$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
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
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
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
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLObject $ic88$;
    
    
    public static SubLObject f27016(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0381.ZERO_INTEGER);
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27017(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX30161_native.class) ? module0381.T : module0381.NIL);
    }
    
    public static SubLObject f27018(final SubLObject var1) {
        assert module0381.NIL != f27017(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f27019(final SubLObject var1) {
        assert module0381.NIL != f27017(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f27020(final SubLObject var1) {
        assert module0381.NIL != f27017(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f27021(final SubLObject var1, final SubLObject var4) {
        assert module0381.NIL != f27017(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f27022(final SubLObject var1, final SubLObject var4) {
        assert module0381.NIL != f27017(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f27023(final SubLObject var1, final SubLObject var4) {
        assert module0381.NIL != f27017(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f27024(SubLObject var5) {
        if (var5 == module0381.UNPROVIDED) {
            var5 = (SubLObject)module0381.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX30161_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0381.NIL, var7 = var5; module0381.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0381.$ic15$)) {
                f27021(var6, var9);
            }
            else if (var10.eql((SubLObject)module0381.$ic16$)) {
                f27022(var6, var9);
            }
            else if (var10.eql((SubLObject)module0381.$ic17$)) {
                f27023(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0381.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f27025(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0381.$ic19$, (SubLObject)module0381.$ic20$, (SubLObject)module0381.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0381.$ic21$, (SubLObject)module0381.$ic15$, f27018(var11));
        Functions.funcall(var12, var11, (SubLObject)module0381.$ic21$, (SubLObject)module0381.$ic16$, f27019(var11));
        Functions.funcall(var12, var11, (SubLObject)module0381.$ic21$, (SubLObject)module0381.$ic17$, f27020(var11));
        Functions.funcall(var12, var11, (SubLObject)module0381.$ic22$, (SubLObject)module0381.$ic20$, (SubLObject)module0381.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f27026(final SubLObject var11, final SubLObject var12) {
        return f27025(var11, var12);
    }
    
    public static SubLObject f27027(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != f27017(var13) && module0381.NIL != module0067.f4852(f27018(var13)));
    }
    
    public static SubLObject f27028() {
        final SubLObject var14 = f27024((SubLObject)module0381.UNPROVIDED);
        f27021(var14, module0067.f4880(Symbols.symbol_function((SubLObject)module0381.EQUAL), (SubLObject)module0381.UNPROVIDED));
        f27022(var14, module0067.f4880(Symbols.symbol_function((SubLObject)module0381.EQUAL), (SubLObject)module0381.UNPROVIDED));
        f27023(var14, module0066.f4824((SubLObject)module0381.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0381.EQ)));
        return var14;
    }
    
    public static SubLObject f27029(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != module0364.f24699(var13) && module0381.$ic24$ == module0364.f24721(var13));
    }
    
    public static SubLObject f27030(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        final SubLObject var18 = module0363.f24527(var15);
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        for (var19 = module0032.f1741(var18), var20 = (SubLObject)module0381.NIL, var20 = module0032.f1742(var19, var18); module0381.NIL == module0032.f1744(var19, var20); var20 = module0032.f1743(var20)) {
            var21 = module0032.f1745(var19, var20);
            if (module0381.NIL != module0032.f1746(var20, var21) && module0381.NIL != module0364.f24748(var21, (SubLObject)module0381.$ic24$)) {
                var22 = f27031(var21);
                if (module0381.NIL != module0364.f24786(var16, var22)) {
                    return Values.values(var21, (SubLObject)module0381.NIL);
                }
            }
        }
        return Values.values(f27032(var15, var16, var17), (SubLObject)module0381.T);
    }
    
    public static SubLObject f27032(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        assert module0381.NIL != module0364.f24774(var16) : var16;
        if (module0381.NIL != var17 && !module0381.areAssertionsDisabledFor(me) && module0381.NIL == module0364.f24774(var17)) {
            throw new AssertionError(var17);
        }
        final SubLObject var18 = module0364.f24729((SubLObject)module0381.$ic24$, var15);
        final SubLObject var19 = f27028();
        module0364.f24744(var18, var19);
        module0364.f24783(var16, var18);
        if (module0381.NIL != var17) {
            module0364.f24783(var17, var18);
        }
        return var18;
    }
    
    public static SubLObject f27033(final SubLObject var24) {
        module0378.f26865(var24);
        final SubLObject var25 = f27034(var24);
        if (module0381.NIL != module0365.f24845(var25)) {
            module0365.f24861(var25);
        }
        final SubLObject var26 = module0364.f24742(var24);
        if (module0381.NIL != f27027(var26)) {
            module0067.f4881(f27018(var26));
            f27021(var26, (SubLObject)module0381.$ic26$);
            module0067.f4881(f27019(var26));
            f27022(var26, (SubLObject)module0381.$ic26$);
            module0066.f4835(f27020(var26));
            f27023(var26, (SubLObject)module0381.$ic26$);
        }
        return var24;
    }
    
    public static SubLObject f27035(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic27$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)module0381.NIL;
        SubLObject var32 = (SubLObject)module0381.NIL;
        SubLObject var33 = (SubLObject)module0381.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic27$);
        var31 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic27$);
        var32 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic27$);
        var33 = var29.first();
        var29 = var29.rest();
        if (module0381.NIL == var29) {
            final SubLObject var34;
            var29 = (var34 = var30);
            final SubLObject var35 = (SubLObject)module0381.$ic28$;
            final SubLObject var36 = (SubLObject)module0381.$ic29$;
            return (SubLObject)ConsesLow.list((SubLObject)module0381.$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var35, (SubLObject)ConsesLow.list((SubLObject)module0381.$ic31$, var33))), (SubLObject)ConsesLow.list((SubLObject)module0381.$ic32$, (SubLObject)ConsesLow.list(var31, var36, var35), (SubLObject)ConsesLow.listS((SubLObject)module0381.$ic33$, (SubLObject)ConsesLow.list(var32, var36), ConsesLow.append(var34, (SubLObject)module0381.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0381.$ic27$);
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27036(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic27$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)module0381.NIL;
        SubLObject var32 = (SubLObject)module0381.NIL;
        SubLObject var33 = (SubLObject)module0381.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic27$);
        var31 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic27$);
        var32 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic27$);
        var33 = var29.first();
        var29 = var29.rest();
        if (module0381.NIL == var29) {
            final SubLObject var34;
            var29 = (var34 = var30);
            final SubLObject var35 = (SubLObject)module0381.$ic34$;
            final SubLObject var36 = (SubLObject)module0381.$ic35$;
            return (SubLObject)ConsesLow.list((SubLObject)module0381.$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var35, (SubLObject)ConsesLow.list((SubLObject)module0381.$ic36$, var33))), (SubLObject)ConsesLow.list((SubLObject)module0381.$ic32$, (SubLObject)ConsesLow.list(var31, var36, var35), (SubLObject)ConsesLow.listS((SubLObject)module0381.$ic33$, (SubLObject)ConsesLow.list(var32, var36), ConsesLow.append(var34, (SubLObject)module0381.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0381.$ic27$);
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27037(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic37$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)module0381.NIL;
        SubLObject var32 = (SubLObject)module0381.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic37$);
        var31 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic37$);
        var32 = var29.first();
        var29 = var29.rest();
        SubLObject var33 = (SubLObject)module0381.NIL;
        SubLObject var34 = var29;
        SubLObject var35 = (SubLObject)module0381.NIL;
        SubLObject var46_47 = (SubLObject)module0381.NIL;
        while (module0381.NIL != var34) {
            cdestructuring_bind.destructuring_bind_must_consp(var34, var28, (SubLObject)module0381.$ic37$);
            var46_47 = var34.first();
            var34 = var34.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var34, var28, (SubLObject)module0381.$ic37$);
            if (module0381.NIL == conses_high.member(var46_47, (SubLObject)module0381.$ic38$, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                var35 = (SubLObject)module0381.T;
            }
            if (var46_47 == module0381.$ic39$) {
                var33 = var34.first();
            }
            var34 = var34.rest();
        }
        if (module0381.NIL != var35 && module0381.NIL == var33) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0381.$ic37$);
        }
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0381.$ic40$, var29);
        final SubLObject var37 = (SubLObject)((module0381.NIL != var36) ? conses_high.cadr(var36) : module0381.NIL);
        final SubLObject var38;
        var29 = (var38 = var30);
        final SubLObject var39 = (SubLObject)module0381.$ic41$;
        final SubLObject var40 = (SubLObject)module0381.$ic42$;
        return (SubLObject)ConsesLow.list((SubLObject)module0381.$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var39, var32)), (SubLObject)ConsesLow.list((SubLObject)module0381.$ic43$, (SubLObject)ConsesLow.list(var40, (SubLObject)ConsesLow.list((SubLObject)module0381.$ic44$, var39), (SubLObject)module0381.$ic45$, (SubLObject)module0381.$ic46$, (SubLObject)module0381.$ic40$, var37), (SubLObject)ConsesLow.list((SubLObject)module0381.$ic47$, (SubLObject)ConsesLow.list((SubLObject)module0381.$ic48$, var40, var39), (SubLObject)ConsesLow.listS((SubLObject)module0381.$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)module0381.$ic49$, var40))), ConsesLow.append(var38, (SubLObject)module0381.NIL)))));
    }
    
    public static SubLObject f27038(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic50$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)module0381.NIL;
        SubLObject var32 = (SubLObject)module0381.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic50$);
        var31 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0381.$ic50$);
        var32 = var29.first();
        var29 = var29.rest();
        SubLObject var33 = (SubLObject)module0381.NIL;
        SubLObject var34 = var29;
        SubLObject var35 = (SubLObject)module0381.NIL;
        SubLObject var60_61 = (SubLObject)module0381.NIL;
        while (module0381.NIL != var34) {
            cdestructuring_bind.destructuring_bind_must_consp(var34, var28, (SubLObject)module0381.$ic50$);
            var60_61 = var34.first();
            var34 = var34.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var34, var28, (SubLObject)module0381.$ic50$);
            if (module0381.NIL == conses_high.member(var60_61, (SubLObject)module0381.$ic38$, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                var35 = (SubLObject)module0381.T;
            }
            if (var60_61 == module0381.$ic39$) {
                var33 = var34.first();
            }
            var34 = var34.rest();
        }
        if (module0381.NIL != var35 && module0381.NIL == var33) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0381.$ic50$);
        }
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0381.$ic40$, var29);
        final SubLObject var37 = (SubLObject)((module0381.NIL != var36) ? conses_high.cadr(var36) : module0381.NIL);
        final SubLObject var38;
        var29 = (var38 = var30);
        final SubLObject var39 = (SubLObject)module0381.$ic51$;
        final SubLObject var40 = (SubLObject)module0381.$ic52$;
        return (SubLObject)ConsesLow.list((SubLObject)module0381.$ic53$, (SubLObject)ConsesLow.list(var39, var32, (SubLObject)module0381.$ic45$, (SubLObject)module0381.$ic46$, (SubLObject)module0381.$ic40$, var37), (SubLObject)ConsesLow.list((SubLObject)module0381.$ic30$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var40, (SubLObject)ConsesLow.list((SubLObject)module0381.$ic54$, var39))), (SubLObject)ConsesLow.list((SubLObject)module0381.$ic53$, (SubLObject)ConsesLow.list(var31, var40, (SubLObject)module0381.$ic45$, (SubLObject)module0381.$ic24$, (SubLObject)module0381.$ic40$, var37), (SubLObject)ConsesLow.list((SubLObject)module0381.$ic47$, (SubLObject)ConsesLow.list((SubLObject)module0381.$ic55$, var31, var39), (SubLObject)ConsesLow.listS((SubLObject)module0381.$ic47$, (SubLObject)ConsesLow.list((SubLObject)module0381.EQ, var40, (SubLObject)ConsesLow.list((SubLObject)module0381.$ic44$, var31)), ConsesLow.append(var38, (SubLObject)module0381.NIL))))));
    }
    
    public static SubLObject f27039(final SubLObject var24) {
        return f27018(module0364.f24742(var24));
    }
    
    public static SubLObject f27040(final SubLObject var24) {
        return f27019(module0364.f24742(var24));
    }
    
    public static SubLObject f27041(final SubLObject var24) {
        return f27020(module0364.f24742(var24));
    }
    
    public static SubLObject f27042(final SubLObject var24, final SubLObject var64) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        SubLObject var66;
        for (var66 = module0066.f4838(f27041(var24)); module0381.NIL == module0066.f4841(var66); var66 = module0066.f4840(var66)) {
            var65.resetMultipleValues();
            final SubLObject var67 = module0066.f4839(var66);
            final SubLObject var68 = var65.secondMultipleValue();
            var65.resetMultipleValues();
            if (var64.eql(var68)) {
                return var67;
            }
        }
        module0066.f4842(var66);
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27043(final SubLObject var24, final SubLObject var64) {
        final SubLObject var65 = f27042(var24, var64);
        return (SubLObject)((module0381.NIL != var65) ? module0364.f24757(var65) : module0381.NIL);
    }
    
    public static SubLObject f27044(final SubLObject var24) {
        return module0066.f4844(f27041(var24));
    }
    
    public static SubLObject f27045(final SubLObject var24, final SubLObject var51) {
        final SubLObject var52 = f27041(var24);
        final SubLObject var53 = module0066.f4830(var52, var51, Symbols.symbol_function((SubLObject)module0381.EQ), (SubLObject)module0381.UNPROVIDED);
        if (module0381.NIL != module0366.f24932(var53)) {
            return var53;
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27031(final SubLObject var24) {
        return conses_high.last(module0364.f24735(var24), (SubLObject)module0381.UNPROVIDED).first();
    }
    
    public static SubLObject f27046(final SubLObject var24) {
        return module0035.f1998(module0364.f24735(var24));
    }
    
    public static SubLObject f27047(final SubLObject var24) {
        if (module0381.NIL != f27048(var24)) {
            return module0364.f24735(var24).first();
        }
        return f27049(var24);
    }
    
    public static SubLObject f27048(final SubLObject var24) {
        return module0035.f1998(module0364.f24735(var24));
    }
    
    public static SubLObject f27050(final SubLObject var24) {
        return module0364.f24736(f27031(var24));
    }
    
    public static SubLObject f27051(final SubLObject var24) {
        return module0364.f24736(f27047(var24));
    }
    
    public static SubLObject f27052(final SubLObject var24, final SubLObject var70) {
        final SubLObject var71 = module0364.f24791(var24, var70);
        return (module0381.NIL != var71) ? var71 : f27049(var24);
    }
    
    public static SubLObject f27053(final SubLObject var24, final SubLObject var72) {
        final SubLObject var73 = f27039(var24);
        final SubLObject var74 = module0373.f26258(var72);
        final SubLObject var75 = module0067.f4885(var73, var74, (SubLObject)module0381.UNPROVIDED);
        return var75;
    }
    
    public static SubLObject f27054(final SubLObject var24, final SubLObject var72) {
        final SubLObject var73 = f27040(var24);
        final SubLObject var74 = module0373.f26258(var72);
        final SubLObject var75 = module0067.f4885(var73, var74, (SubLObject)module0381.UNPROVIDED);
        return var75;
    }
    
    public static SubLObject f27034(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0364.f24725(var24);
        SubLObject var27 = module0363.f24517(var26);
        SubLObject var28 = (SubLObject)module0381.NIL;
        var28 = var27.first();
        while (module0381.NIL != var27) {
            if (module0381.NIL != module0363.f24522(var28, module0381.$g3219$.getDynamicValue(var25)) && var24.eql(f27055(var28))) {
                return var28;
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        if (module0381.NIL == module0363.f24685(var26)) {
            return Errors.error((SubLObject)module0381.$ic58$, var24);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27056(final SubLObject var24, final SubLObject var51) {
        return module0035.sublisp_boolean(module0066.f4831(f27041(var24), var51, Symbols.symbol_function((SubLObject)module0381.EQ), (SubLObject)module0381.NIL));
    }
    
    public static SubLObject f27057(final SubLObject var24) {
        return module0066.f4826(f27041(var24));
    }
    
    public static SubLObject f27058(final SubLObject var24, final SubLObject var78, final SubLObject var64) {
        assert module0381.NIL != f27029(var24) : var24;
        assert module0381.NIL != module0366.f24916(var64) : var64;
        final SubLObject var79 = f27039(var24);
        final SubLObject var80 = module0373.f26258(var78);
        module0084.f5765(var79, var80, var64, Symbols.symbol_function((SubLObject)module0381.EQ), (SubLObject)module0381.UNPROVIDED);
        return var24;
    }
    
    public static SubLObject f27059(final SubLObject var24, final SubLObject var78, final SubLObject var64) {
        assert module0381.NIL != f27029(var24) : var24;
        assert module0381.NIL != module0366.f24916(var64) : var64;
        final SubLObject var79 = f27039(var24);
        final SubLObject var80 = module0373.f26258(var78);
        module0084.f5772(var79, var80, var64, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED);
        return var24;
    }
    
    public static SubLObject f27060(final SubLObject var24, final SubLObject var78, final SubLObject var64) {
        assert module0381.NIL != f27029(var24) : var24;
        assert module0381.NIL != module0366.f24916(var64) : var64;
        final SubLObject var79 = f27040(var24);
        final SubLObject var80 = module0373.f26258(var78);
        module0084.f5765(var79, var80, var64, Symbols.symbol_function((SubLObject)module0381.EQ), (SubLObject)module0381.UNPROVIDED);
        return var24;
    }
    
    public static SubLObject f27061(final SubLObject var24, final SubLObject var78, final SubLObject var64) {
        assert module0381.NIL != f27029(var24) : var24;
        assert module0381.NIL != module0366.f24916(var64) : var64;
        final SubLObject var79 = f27040(var24);
        final SubLObject var80 = module0373.f26258(var78);
        module0084.f5772(var79, var80, var64, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED);
        return var24;
    }
    
    public static SubLObject f27062(final SubLObject var24, final SubLObject var51, final SubLObject var80) {
        assert module0381.NIL != f27029(var24) : var24;
        assert module0381.NIL != module0375.f26571(var51) : var51;
        assert module0381.NIL != module0366.f24916(var80) : var80;
        SubLObject var81 = f27041(var24);
        var81 = module0066.f4833(var81, var51, var80, Symbols.symbol_function((SubLObject)module0381.EQ));
        f27023(module0364.f24742(var24), var81);
        return var24;
    }
    
    public static SubLObject f27063(final SubLObject var24, final SubLObject var51) {
        assert module0381.NIL != f27029(var24) : var24;
        SubLObject var52 = f27041(var24);
        var52 = module0066.f4834(var52, var51, Symbols.symbol_function((SubLObject)module0381.EQ));
        f27023(module0364.f24742(var24), var52);
        return var24;
    }
    
    public static SubLObject f27064(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0364.f24725(var24);
        SubLObject var27 = module0363.f24517(var26);
        SubLObject var28 = (SubLObject)module0381.NIL;
        var28 = var27.first();
        while (module0381.NIL != var27) {
            if (module0381.NIL != module0363.f24522(var28, module0381.$g3219$.getDynamicValue(var25)) && var24.eql(f27055(var28))) {
                return f27065(var28);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27066(final SubLObject var24) {
        final SubLObject var25 = f27064(var24);
        final SubLObject var26 = module0364.f24725(var24);
        final SubLObject var27 = module0363.f24580(var26);
        final SubLObject var28 = module0204.f13105(var25, var27);
        return var28;
    }
    
    public static SubLObject f27067(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != module0365.f24819(var13) && module0381.$g3219$.getDynamicValue(var14).eql(module0365.f24865(var13)));
    }
    
    public static SubLObject f27068(final SubLObject var77) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != f27067(var77) && module0381.NIL != module0204.f13116(f27065(var77)));
    }
    
    public static SubLObject f27069(final SubLObject var84, final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        assert module0381.NIL != f27029(var84) : var84;
        final SubLObject var87 = module0364.f24725(var84);
        final SubLObject var88 = (SubLObject)ConsesLow.list(var84, var85);
        final SubLObject var89 = module0365.f24854(var87, module0381.$g3219$.getDynamicValue(var86), var88);
        final SubLObject var90 = var87;
        final SubLObject var91 = module0363.f24507(var90);
        final SubLObject var92 = module0361.f24123(var91);
        if (module0381.NIL == module0065.f4772(var92, (SubLObject)module0381.$ic62$)) {
            final SubLObject var90_91 = var92;
            if (module0381.NIL == module0065.f4775(var90_91, (SubLObject)module0381.$ic62$)) {
                final SubLObject var93 = module0065.f4740(var90_91);
                final SubLObject var94 = (SubLObject)module0381.NIL;
                SubLObject var95;
                SubLObject var96;
                SubLObject var97;
                SubLObject var98;
                SubLObject var99;
                SubLObject var100;
                SubLObject var101;
                SubLObject var102;
                SubLObject var103;
                for (var95 = Sequences.length(var93), var96 = (SubLObject)module0381.NIL, var96 = (SubLObject)module0381.ZERO_INTEGER; var96.numL(var95); var96 = Numbers.add(var96, (SubLObject)module0381.ONE_INTEGER)) {
                    var97 = ((module0381.NIL != var94) ? Numbers.subtract(var95, var96, (SubLObject)module0381.ONE_INTEGER) : var96);
                    var98 = Vectors.aref(var93, var97);
                    if (module0381.NIL == module0065.f4749(var98) || module0381.NIL == module0065.f4773((SubLObject)module0381.$ic62$)) {
                        if (module0381.NIL != module0065.f4749(var98)) {
                            var98 = (SubLObject)module0381.$ic62$;
                        }
                        if (module0381.NIL != module0363.f24547(var90, var98)) {
                            var99 = var98;
                            var100 = module0077.f5333(module0369.f25473(var99));
                            for (var101 = module0032.f1741(var100), var102 = (SubLObject)module0381.NIL, var102 = module0032.f1742(var101, var100); module0381.NIL == module0032.f1744(var101, var102); var102 = module0032.f1743(var102)) {
                                var103 = module0032.f1745(var101, var102);
                                if (module0381.NIL != module0032.f1746(var102, var103)) {
                                    module0387.f27563(var103, var89);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var100_101 = var92;
            if (module0381.NIL == module0065.f4777(var100_101)) {
                final SubLObject var104 = module0065.f4738(var100_101);
                SubLObject var105 = (SubLObject)module0381.NIL;
                SubLObject var106 = (SubLObject)module0381.NIL;
                final Iterator var107 = Hashtables.getEntrySetIterator(var104);
                try {
                    while (Hashtables.iteratorHasNext(var107)) {
                        final Map.Entry var108 = Hashtables.iteratorNextEntry(var107);
                        var105 = Hashtables.getEntryKey(var108);
                        var106 = Hashtables.getEntryValue(var108);
                        if (module0381.NIL != module0363.f24547(var90, var106)) {
                            final SubLObject var109 = var106;
                            final SubLObject var110 = module0077.f5333(module0369.f25473(var109));
                            SubLObject var111;
                            SubLObject var112;
                            SubLObject var113;
                            for (var111 = module0032.f1741(var110), var112 = (SubLObject)module0381.NIL, var112 = module0032.f1742(var111, var110); module0381.NIL == module0032.f1744(var111, var112); var112 = module0032.f1743(var112)) {
                                var113 = module0032.f1745(var111, var112);
                                if (module0381.NIL != module0032.f1746(var112, var113)) {
                                    module0387.f27563(var113, var89);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var107);
                }
            }
        }
        return var89;
    }
    
    public static SubLObject f27055(final SubLObject var77) {
        return module0365.f24871(var77).first();
    }
    
    public static SubLObject f27065(final SubLObject var77) {
        return conses_high.second(module0365.f24871(var77));
    }
    
    public static SubLObject f27070(final SubLObject var105, final SubLObject var106) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var105.eql(var106) || (module0365.f24850(var105).eql(module0365.f24850(var106)) && module0381.NIL != module0204.f13108(f27065(var105), f27065(var106))));
    }
    
    public static SubLObject f27071(final SubLObject var25) {
        final SubLObject var26 = f27055(var25);
        if (module0381.NIL != var26) {
            return f27031(var26);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27072(final SubLObject var25) {
        final SubLObject var26 = f27055(var25);
        if (module0381.NIL != var26) {
            return f27047(var26);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27073(final SubLObject var77) {
        final SubLObject var78 = f27055(var77);
        final SubLObject var79 = (SubLObject)((module0381.NIL != var78) ? f27050(var78) : module0381.NIL);
        return var79;
    }
    
    public static SubLObject f27074(final SubLObject var15, final SubLObject var107) {
        f27075(var15, var107);
        SubLObject var108 = (SubLObject)module0381.NIL;
        SubLObject var109 = f27076(var15, var107);
        SubLObject var110 = (SubLObject)module0381.NIL;
        var110 = var109.first();
        while (module0381.NIL != var109) {
            final SubLObject var111 = var110;
            if (module0381.NIL == conses_high.member(var111, var108, Symbols.symbol_function((SubLObject)module0381.EQL), Symbols.symbol_function((SubLObject)module0381.IDENTITY))) {
                var108 = (SubLObject)ConsesLow.cons(var111, var108);
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        var109 = f27077(var15, var107);
        var110 = (SubLObject)module0381.NIL;
        var110 = var109.first();
        while (module0381.NIL != var109) {
            final SubLObject var111 = var110;
            if (module0381.NIL == conses_high.member(var111, var108, Symbols.symbol_function((SubLObject)module0381.EQL), Symbols.symbol_function((SubLObject)module0381.IDENTITY))) {
                var108 = (SubLObject)ConsesLow.cons(var111, var108);
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        if (module0381.NIL == f27078(var15)) {
            var109 = module0376.f26631(var107);
            var110 = (SubLObject)module0381.NIL;
            var110 = var109.first();
            while (module0381.NIL != var109) {
                final SubLObject var111 = var110;
                if (module0381.NIL == conses_high.member(var111, var108, Symbols.symbol_function((SubLObject)module0381.EQL), Symbols.symbol_function((SubLObject)module0381.IDENTITY))) {
                    var108 = (SubLObject)ConsesLow.cons(var111, var108);
                }
                var109 = var109.rest();
                var110 = var109.first();
            }
        }
        var109 = Sequences.nreverse(var108);
        var110 = (SubLObject)module0381.NIL;
        var110 = var109.first();
        while (module0381.NIL != var109) {
            f27079(var15, var110, var107);
            var109 = var109.rest();
            var110 = var109.first();
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27078(final SubLObject var86) {
        assert module0381.NIL != module0363.f24478(var86) : var86;
        SubLObject var87 = module0363.f24517(var86);
        SubLObject var88 = (SubLObject)module0381.NIL;
        var88 = var87.first();
        while (module0381.NIL != var87) {
            if (module0381.NIL != module0363.f24524(var88, (SubLObject)module0381.$ic24$) && module0381.NIL != module0387.f27503(var88)) {
                return (SubLObject)module0381.T;
            }
            var87 = var87.rest();
            var88 = var87.first();
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27075(final SubLObject var15, final SubLObject var107) {
        final SubLObject var108 = module0349.f23461(var107);
        SubLObject var109 = (SubLObject)module0381.ZERO_INTEGER;
        SubLObject var110 = module0232.f15306(var107);
        SubLObject var111 = (SubLObject)module0381.NIL;
        var111 = var110.first();
        while (module0381.NIL != var110) {
            final SubLObject var112 = (SubLObject)module0381.$ic64$;
            if (module0381.NIL == var108 || module0381.NIL != module0349.f23462(var111) || module0381.NIL != f27080(module0362.f24436(var111))) {
                f27081(var15, var107, var112, var109);
            }
            var109 = Numbers.add(var109, (SubLObject)module0381.ONE_INTEGER);
            var110 = var110.rest();
            var111 = var110.first();
        }
        var109 = (SubLObject)module0381.ZERO_INTEGER;
        var110 = module0232.f15308(var107);
        var111 = (SubLObject)module0381.NIL;
        var111 = var110.first();
        while (module0381.NIL != var110) {
            final SubLObject var112 = (SubLObject)module0381.$ic65$;
            if (module0381.NIL == var108 || module0381.NIL != module0349.f23462(var111) || module0381.NIL != f27080(module0362.f24436(var111))) {
                f27081(var15, var107, var112, var109);
            }
            var109 = Numbers.add(var109, (SubLObject)module0381.ONE_INTEGER);
            var110 = var110.rest();
            var111 = var110.first();
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27080(final SubLObject var114) {
        return module0202.f12879(var114);
    }
    
    public static SubLObject f27081(final SubLObject var15, final SubLObject var107, final SubLObject var113, final SubLObject var34) {
        final SubLObject var114 = module0204.f13103(var113, var34);
        return f27079(var15, var114, var107);
    }
    
    public static SubLObject f27076(final SubLObject var15, final SubLObject var107) {
        SubLObject var108 = (SubLObject)module0381.NIL;
        if (module0381.NIL != f27082(var15)) {
            final SubLObject var109 = module0363.f24507(var15);
            final SubLObject var110 = module0077.f5333(module0361.f24134(var109));
            SubLObject var111;
            SubLObject var112;
            SubLObject var113;
            SubLObject var114;
            SubLObject var115;
            SubLObject var116;
            SubLObject var117;
            SubLObject var118;
            for (var111 = module0032.f1741(var110), var112 = (SubLObject)module0381.NIL, var112 = module0032.f1742(var111, var110); module0381.NIL == module0032.f1744(var111, var112); var112 = module0032.f1743(var112)) {
                var113 = module0032.f1745(var111, var112);
                if (module0381.NIL != module0032.f1746(var112, var113) && !var113.eql(var15) && module0381.NIL != module0363.f24573(var113)) {
                    var114 = module0363.f24580(var113);
                    var115 = f27083(var107, var114);
                    var116 = (SubLObject)module0381.NIL;
                    var116 = var115.first();
                    while (module0381.NIL != var115) {
                        var117 = module0204.f13110(var107, var116);
                        if (module0381.NIL != module0380.f26987(var117)) {
                            var118 = var116;
                            if (module0381.NIL == conses_high.member(var118, var108, Symbols.symbol_function((SubLObject)module0381.EQUAL), Symbols.symbol_function((SubLObject)module0381.IDENTITY))) {
                                var108 = (SubLObject)ConsesLow.cons(var118, var108);
                            }
                        }
                        var115 = var115.rest();
                        var116 = var115.first();
                    }
                }
            }
        }
        return var108;
    }
    
    public static SubLObject f27082(final SubLObject var15) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != module0363.f24478(var15) && module0361.f24343(module0363.f24507(var15)).numGE((SubLObject)module0381.TWO_INTEGER) && module0381.NIL != module0363.f24603(var15, (SubLObject)module0381.$ic66$));
    }
    
    public static SubLObject f27077(final SubLObject var15, final SubLObject var107) {
        SubLObject var108 = (SubLObject)module0381.NIL;
        if (module0381.NIL == module0349.f23461(var107) && module0381.NIL != module0363.f24603(var15, (SubLObject)module0381.$ic67$)) {
            final SubLObject var109 = module0363.f24530(var15);
            SubLObject var110;
            SubLObject var111;
            SubLObject var112;
            SubLObject var113;
            SubLObject var18_122;
            SubLObject var19_123;
            SubLObject var20_124;
            SubLObject var114;
            SubLObject var115;
            SubLObject var116;
            SubLObject var117;
            SubLObject var118;
            SubLObject var119;
            SubLObject var120;
            for (var110 = module0032.f1741(var109), var111 = (SubLObject)module0381.NIL, var111 = module0032.f1742(var110, var109); module0381.NIL == module0032.f1744(var110, var111); var111 = module0032.f1743(var111)) {
                var112 = module0032.f1745(var110, var111);
                if (module0381.NIL != module0032.f1746(var111, var112) && module0381.NIL != module0364.f24748(var112, (SubLObject)module0381.$ic67$)) {
                    var113 = module0364.f24725(var112);
                    var18_122 = module0363.f24527(var113);
                    for (var19_123 = module0032.f1741(var18_122), var20_124 = (SubLObject)module0381.NIL, var20_124 = module0032.f1742(var19_123, var18_122); module0381.NIL == module0032.f1744(var19_123, var20_124); var20_124 = module0032.f1743(var20_124)) {
                        var114 = module0032.f1745(var19_123, var20_124);
                        if (module0381.NIL != module0032.f1746(var20_124, var114) && module0381.NIL != module0364.f24748(var114, (SubLObject)module0381.$ic67$) && !var114.eql(var112)) {
                            var115 = module0364.f24757(var114);
                            if (!var115.eql(var15) && module0381.NIL != module0363.f24573(var115)) {
                                var116 = module0363.f24580(var115);
                                var117 = f27084(var107, var116);
                                var118 = (SubLObject)module0381.NIL;
                                var118 = var117.first();
                                while (module0381.NIL != var117) {
                                    var119 = module0204.f13110(var107, var118);
                                    if (module0381.NIL != module0380.f26987(var119)) {
                                        var120 = var118;
                                        if (module0381.NIL == conses_high.member(var120, var108, Symbols.symbol_function((SubLObject)module0381.EQUAL), Symbols.symbol_function((SubLObject)module0381.IDENTITY))) {
                                            var108 = (SubLObject)ConsesLow.cons(var120, var108);
                                        }
                                    }
                                    var117 = var117.rest();
                                    var118 = var117.first();
                                }
                            }
                        }
                    }
                }
            }
        }
        return var108;
    }
    
    public static SubLObject f27083(final SubLObject var107, final SubLObject var118) {
        SubLObject var119 = (SubLObject)module0381.NIL;
        final SubLObject var120 = module0232.f15308(var107);
        final SubLObject var121 = module0232.f15306(var107);
        final SubLObject var122 = module0232.f15308(var118);
        final SubLObject var123 = module0232.f15306(var118);
        if (module0381.NIL != module0035.f2008(var120, var122) && module0381.NIL != module0035.f2008(var121, var123) && (module0381.NIL != module0035.f2007(var120, var122) || module0381.NIL != module0035.f2007(var121, var123))) {
            final SubLObject var124 = f27085(var120, var122);
            if (module0381.NIL != var124) {
                final SubLObject var125 = f27085(var121, var123);
                if (module0381.NIL != var125) {
                    final SubLObject var126 = f27086(var124);
                    final SubLObject var127 = f27086(var125);
                    SubLObject var128 = var126;
                    SubLObject var129 = (SubLObject)module0381.NIL;
                    var129 = var128.first();
                    while (module0381.NIL != var128) {
                        SubLObject var76_136 = var127;
                        SubLObject var130 = (SubLObject)module0381.NIL;
                        var130 = var76_136.first();
                        while (module0381.NIL != var76_136) {
                            final SubLObject var131 = module0204.f13098(var130, var129);
                            final SubLObject var132 = module0204.f13110(var107, var131);
                            if (module0381.NIL != module0234.f15444(var132, var118, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                                var119 = (SubLObject)ConsesLow.cons(var131, var119);
                            }
                            var76_136 = var76_136.rest();
                            var130 = var76_136.first();
                        }
                        var128 = var128.rest();
                        var129 = var128.first();
                    }
                }
            }
        }
        return var119;
    }
    
    public static SubLObject f27085(final SubLObject var140, final SubLObject var141) {
        final SubLObject var142 = module0067.f4880(Symbols.symbol_function((SubLObject)module0381.EQ), (SubLObject)module0381.UNPROVIDED);
        SubLObject var143 = (SubLObject)module0381.NIL;
        SubLObject var144 = (SubLObject)module0381.NIL;
        SubLObject var145 = (SubLObject)module0381.NIL;
        SubLObject var146 = (SubLObject)module0381.NIL;
        var144 = var141;
        var145 = var144.first();
        for (var146 = (SubLObject)module0381.ZERO_INTEGER; module0381.NIL == var143 && module0381.NIL != var144; var144 = var144.rest(), var145 = var144.first(), var146 = Numbers.add((SubLObject)module0381.ONE_INTEGER, var146)) {
            SubLObject var147_148 = (SubLObject)module0381.NIL;
            SubLObject var147 = (SubLObject)module0381.NIL;
            SubLObject var148 = (SubLObject)module0381.NIL;
            var147_148 = var140;
            var147 = var147_148.first();
            for (var148 = (SubLObject)module0381.ZERO_INTEGER; module0381.NIL != var147_148; var147_148 = var147_148.rest(), var147 = var147_148.first(), var148 = Numbers.add((SubLObject)module0381.ONE_INTEGER, var148)) {
                if (module0381.NIL != module0234.f15434(var145, var147)) {
                    module0084.f5762(var142, var146, var148);
                }
            }
            if (module0381.NIL == module0067.f4884(var142, var146, (SubLObject)module0381.UNPROVIDED)) {
                var143 = (SubLObject)module0381.T;
            }
        }
        if (module0381.NIL != var143) {
            return (SubLObject)module0381.NIL;
        }
        return var142;
    }
    
    public static SubLObject f27086(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = (SubLObject)module0381.NIL;
        SubLObject var145;
        for (var145 = module0066.f4838(module0067.f4891(var142)); module0381.NIL == module0066.f4841(var145); var145 = module0066.f4840(var145)) {
            var143.resetMultipleValues();
            final SubLObject var146 = module0066.f4839(var145);
            final SubLObject var147 = var143.secondMultipleValue();
            var143.resetMultipleValues();
            var144 = (SubLObject)ConsesLow.cons(var147, var144);
        }
        module0066.f4842(var145);
        return Sequences.delete_if((SubLObject)module0381.$ic68$, module0035.f2489(var144, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED), (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED);
    }
    
    public static SubLObject f27084(final SubLObject var107, final SubLObject var118) {
        SubLObject var119 = (SubLObject)module0381.NIL;
        SubLObject var120 = (SubLObject)module0381.NIL;
        SubLObject var121 = (SubLObject)module0381.NIL;
        final SubLObject var122 = module0232.f15308(var107);
        final SubLObject var123 = module0232.f15308(var118);
        SubLObject var124 = (SubLObject)module0381.NIL;
        SubLObject var125 = (SubLObject)module0381.NIL;
        SubLObject var126 = (SubLObject)module0381.NIL;
        var124 = var122;
        var125 = var124.first();
        for (var126 = (SubLObject)module0381.ZERO_INTEGER; module0381.NIL != var124; var124 = var124.rest(), var125 = var124.first(), var126 = Numbers.add((SubLObject)module0381.ONE_INTEGER, var126)) {
            SubLObject var127 = (SubLObject)module0381.NIL;
            if (module0381.NIL == var127) {
                SubLObject var128 = var123;
                SubLObject var129 = (SubLObject)module0381.NIL;
                var129 = var128.first();
                while (module0381.NIL == var127 && module0381.NIL != var128) {
                    if (module0381.NIL != module0234.f15444(var125, var129, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                        var119 = (SubLObject)ConsesLow.cons(var126, var119);
                        var127 = (SubLObject)module0381.T;
                    }
                    var128 = var128.rest();
                    var129 = var128.first();
                }
            }
        }
        final SubLObject var130 = module0232.f15306(var107);
        final SubLObject var131 = module0232.f15306(var118);
        var124 = (SubLObject)module0381.NIL;
        SubLObject var132 = (SubLObject)module0381.NIL;
        var126 = (SubLObject)module0381.NIL;
        var124 = var130;
        var132 = var124.first();
        for (var126 = (SubLObject)module0381.ZERO_INTEGER; module0381.NIL != var124; var124 = var124.rest(), var132 = var124.first(), var126 = Numbers.add((SubLObject)module0381.ONE_INTEGER, var126)) {
            SubLObject var127 = (SubLObject)module0381.NIL;
            if (module0381.NIL == var127) {
                SubLObject var128 = var131;
                SubLObject var133 = (SubLObject)module0381.NIL;
                var133 = var128.first();
                while (module0381.NIL == var127 && module0381.NIL != var128) {
                    if (module0381.NIL != module0234.f15444(var132, var133, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                        var120 = (SubLObject)ConsesLow.cons(var126, var120);
                        var127 = (SubLObject)module0381.T;
                    }
                    var128 = var128.rest();
                    var133 = var128.first();
                }
            }
        }
        if (Numbers.add(Sequences.length(var119), Sequences.length(var120)).numG((SubLObject)module0381.ONE_INTEGER)) {
            final SubLObject var134 = module0204.f13098(var120, var119);
            if (module0381.NIL == module0204.f13118(var134, var107)) {
                var121 = (SubLObject)ConsesLow.cons(var134, var121);
            }
        }
        return var121;
    }
    
    public static SubLObject f27079(final SubLObject var15, final SubLObject var85, final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        final SubLObject var109 = module0363.f24507(var15);
        final SubLObject var110 = f27087(var109, var107, var85);
        final SubLObject var111 = (SubLObject)module0381.NIL;
        var108.resetMultipleValues();
        final SubLObject var112 = f27030(var15, var110, var111);
        final SubLObject var113 = var108.secondMultipleValue();
        var108.resetMultipleValues();
        f27069(var112, var85);
        if (module0381.NIL != var113) {
            module0373.f26334(var112);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27087(final SubLObject var116, final SubLObject var107, final SubLObject var85) {
        return module0373.f26438(var116, var107, var85);
    }
    
    public static SubLObject f27088(final SubLObject var116, final SubLObject var107, final SubLObject var85) {
        return module0373.f26439(var116, var107, var85);
    }
    
    public static SubLObject f27049(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        if (module0381.NIL == module0361.$g3113$.getDynamicValue(var25)) {
            return (SubLObject)module0381.NIL;
        }
        final SubLObject var26 = module0364.f24763(var24);
        final SubLObject var27 = module0364.f24722(var24);
        final SubLObject var28 = module0363.f24580(module0364.f24725(var24));
        final SubLObject var29 = f27031(var24);
        final SubLObject var30 = module0364.f24736(var29);
        final SubLObject var31 = module0363.f24580(var30);
        final SubLObject var32 = module0364.f24737(var29);
        final SubLObject var33 = module0233.f15362(var32, var31);
        final SubLObject var34 = module0204.f13112(var28, var33);
        final SubLObject var35 = f27088(var27, var28, var34);
        module0364.f24783(var35, var24);
        if (module0381.NIL != var26) {
            module0364.f24780(var24);
            module0364.f24777(var24, var29);
        }
        module0373.f26334(var24);
        return var35;
    }
    
    public static SubLObject f27089(final SubLObject var25, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = f27055(var25);
        if (module0381.NIL == module0358.f23680(module0365.f24868(var25))) {
            var100.resetMultipleValues();
            final SubLObject var102 = f27090(var101, (SubLObject)module0381.$ic69$);
            final SubLObject var103 = var100.secondMultipleValue();
            var100.resetMultipleValues();
            module0365.f24873(var25, var102, var103);
            if (module0381.$ic70$ == var102) {
                module0373.f26390(var25, (SubLObject)module0381.$ic69$);
            }
        }
        var100.resetMultipleValues();
        final SubLObject var104 = f27090(var101, var99);
        final SubLObject var105 = var100.secondMultipleValue();
        var100.resetMultipleValues();
        module0367.f25205(var25, var99, var104, var105);
        if (module0381.$ic70$ == var104) {
            module0373.f26390(var25, var99);
        }
        final SubLObject var106 = f27091(var101, var99);
        module0367.f25206(var25, var99, var106);
        return var25;
    }
    
    public static SubLObject f27091(final SubLObject var84, final SubLObject var99) {
        assert module0381.NIL != f27029(var84) : var84;
        assert module0381.NIL != module0367.f24997(var99) : var99;
        return module0385.f27404(f27050(var84), var99);
    }
    
    public static SubLObject f27090(final SubLObject var84, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        final SubLObject var177 = f27050(var84);
        final SubLObject var178 = f27092(var84);
        var176.resetMultipleValues();
        final SubLObject var179 = module0388.f27577(var177, var175, var178);
        final SubLObject var180 = var176.secondMultipleValue();
        var176.resetMultipleValues();
        return Values.values(var179, var180);
    }
    
    public static SubLObject f27093(final SubLObject var25) {
        final SubLObject var26 = f27071(var25);
        final SubLObject var27 = f27055(var25);
        module0373.f26343(var27, var26);
        module0378.f26879(var27);
        if (module0381.NIL != module0384.f27362(var25, (SubLObject)module0381.$ic69$) && (module0381.NIL == module0387.f27519() || module0381.NIL == module0361.f24164(module0365.f24879(var25)))) {
            module0373.f26209(var25);
        }
        f27094(var25);
        return var25;
    }
    
    public static SubLObject f27094(final SubLObject var25) {
        final SubLObject var27;
        final SubLObject var26 = var27 = module0365.f24850(var25);
        final SubLObject var28 = module0363.f24507(var27);
        final SubLObject var29 = module0361.f24123(var28);
        if (module0381.NIL == module0065.f4772(var29, (SubLObject)module0381.$ic62$)) {
            final SubLObject var90_177 = var29;
            if (module0381.NIL == module0065.f4775(var90_177, (SubLObject)module0381.$ic62$)) {
                final SubLObject var30 = module0065.f4740(var90_177);
                final SubLObject var31 = (SubLObject)module0381.NIL;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                SubLObject var38;
                SubLObject var39;
                SubLObject var40;
                for (var32 = Sequences.length(var30), var33 = (SubLObject)module0381.NIL, var33 = (SubLObject)module0381.ZERO_INTEGER; var33.numL(var32); var33 = Numbers.add(var33, (SubLObject)module0381.ONE_INTEGER)) {
                    var34 = ((module0381.NIL != var31) ? Numbers.subtract(var32, var33, (SubLObject)module0381.ONE_INTEGER) : var33);
                    var35 = Vectors.aref(var30, var34);
                    if (module0381.NIL == module0065.f4749(var35) || module0381.NIL == module0065.f4773((SubLObject)module0381.$ic62$)) {
                        if (module0381.NIL != module0065.f4749(var35)) {
                            var35 = (SubLObject)module0381.$ic62$;
                        }
                        if (module0381.NIL != module0363.f24547(var27, var35)) {
                            var36 = var35;
                            var37 = module0077.f5333(module0369.f25473(var36));
                            for (var38 = module0032.f1741(var37), var39 = (SubLObject)module0381.NIL, var39 = module0032.f1742(var38, var37); module0381.NIL == module0032.f1744(var38, var39); var39 = module0032.f1743(var39)) {
                                var40 = module0032.f1745(var38, var39);
                                if (module0381.NIL != module0032.f1746(var39, var40) && module0381.NIL != module0367.f25204(var25, var40)) {
                                    module0373.f26293(module0365.f24850(var25), var40);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var100_178 = var29;
            if (module0381.NIL == module0065.f4777(var100_178)) {
                final SubLObject var41 = module0065.f4738(var100_178);
                SubLObject var42 = (SubLObject)module0381.NIL;
                SubLObject var43 = (SubLObject)module0381.NIL;
                final Iterator var44 = Hashtables.getEntrySetIterator(var41);
                try {
                    while (Hashtables.iteratorHasNext(var44)) {
                        final Map.Entry var45 = Hashtables.iteratorNextEntry(var44);
                        var42 = Hashtables.getEntryKey(var45);
                        var43 = Hashtables.getEntryValue(var45);
                        if (module0381.NIL != module0363.f24547(var27, var43)) {
                            final SubLObject var46 = var43;
                            final SubLObject var47 = module0077.f5333(module0369.f25473(var46));
                            SubLObject var48;
                            SubLObject var49;
                            SubLObject var50;
                            for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0381.NIL, var49 = module0032.f1742(var48, var47); module0381.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                var50 = module0032.f1745(var48, var49);
                                if (module0381.NIL != module0032.f1746(var49, var50) && module0381.NIL != module0367.f25204(var25, var50)) {
                                    module0373.f26293(module0365.f24850(var25), var50);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var44);
                }
            }
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27095(final SubLObject var77) {
        final SubLObject var78 = f27071(var77);
        return module0364.f24736(var78);
    }
    
    public static SubLObject f27096(final SubLObject var24, final SubLObject var179) {
        return f27097(var24, var179);
    }
    
    public static SubLObject f27098(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != module0366.f24916(var13) && module0381.$ic24$ == module0366.f24989(var13));
    }
    
    public static SubLObject f27099(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != f27098(var13) || module0381.NIL != module0382.f27220(var13));
    }
    
    public static SubLObject f27097(final SubLObject var180, final SubLObject var179) {
        SubLObject var181 = (SubLObject)module0381.NIL;
        SubLObject var182 = (SubLObject)module0381.NIL;
        SubLObject var183 = var179;
        SubLObject var184 = (SubLObject)module0381.NIL;
        var184 = var183.first();
        while (module0381.NIL != var183) {
            SubLObject var186;
            final SubLObject var185 = var186 = var184;
            SubLObject var187 = (SubLObject)module0381.NIL;
            SubLObject var188 = (SubLObject)module0381.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var186, var185, (SubLObject)module0381.$ic72$);
            var187 = var186.first();
            var186 = (var188 = var186.rest());
            var181 = ConsesLow.nconc(conses_high.copy_list(var188), var181);
            var182 = (SubLObject)ConsesLow.cons(var187, var182);
            var183 = var183.rest();
            var184 = var183.first();
        }
        var182 = Sequences.nreverse(var182);
        var181 = module0373.f26256(var181);
        return module0373.f26221(var180, var181, var182);
    }
    
    public static SubLObject f27100(final SubLObject var187, final SubLObject var24, final SubLObject var188) {
        final SubLObject var189 = f27101(var24, var188);
        final SubLObject var190 = module0233.f15384(var189, var187);
        return var190;
    }
    
    public static SubLObject f27102(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0381.NIL;
        final SubLObject var27 = module0364.f24728(var24);
        final SubLObject var28 = module0034.$g879$.currentBinding(var25);
        try {
            module0034.$g879$.bind(var27, var25);
            SubLObject var29 = (SubLObject)module0381.NIL;
            if (module0381.NIL != var27 && module0381.NIL == module0034.f1842(var27)) {
                var29 = module0034.f1869(var27);
                final SubLObject var30 = Threads.current_process();
                if (module0381.NIL == var29) {
                    module0034.f1873(var27, var30);
                }
                else if (!var29.eql(var30)) {
                    Errors.error((SubLObject)module0381.$ic73$);
                }
            }
            try {
                var26 = f27103(var24);
            }
            finally {
                final SubLObject var193_196 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0381.T, var25);
                    if (module0381.NIL != var27 && module0381.NIL == var29) {
                        module0034.f1873(var27, (SubLObject)module0381.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var193_196, var25);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var28, var25);
        }
        return var26;
    }
    
    public static SubLObject f27104(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0361.f24117(module0364.f24722(var24));
        final SubLObject var27 = module0034.$g879$.currentBinding(var25);
        try {
            module0034.$g879$.bind(var26, var25);
            SubLObject var28 = (SubLObject)module0381.NIL;
            if (module0381.NIL != var26 && module0381.NIL == module0034.f1842(var26)) {
                var28 = module0034.f1869(var26);
                final SubLObject var29 = Threads.current_process();
                if (module0381.NIL == var28) {
                    module0034.f1873(var26, var29);
                }
                else if (!var28.eql(var29)) {
                    Errors.error((SubLObject)module0381.$ic73$);
                }
            }
            try {
                return f27105(var24);
            }
            finally {
                final SubLObject var193_197 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0381.T, var25);
                    if (module0381.NIL != var26 && module0381.NIL == var28) {
                        module0034.f1873(var26, (SubLObject)module0381.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var193_197, var25);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var27, var25);
        }
    }
    
    public static SubLObject f27103(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0034.$g879$.getDynamicValue(var25);
        SubLObject var27 = (SubLObject)module0381.NIL;
        if (module0381.NIL == var26) {
            return f27104(var24);
        }
        var27 = module0034.f1857(var26, (SubLObject)module0381.$ic74$, (SubLObject)module0381.UNPROVIDED);
        if (module0381.NIL == var27) {
            var27 = module0034.f1807(module0034.f1842(var26), (SubLObject)module0381.$ic74$, (SubLObject)module0381.ONE_INTEGER, (SubLObject)module0381.NIL, (SubLObject)module0381.EQ, (SubLObject)module0381.UNPROVIDED);
            module0034.f1860(var26, (SubLObject)module0381.$ic74$, var27);
        }
        SubLObject var28 = module0034.f1814(var27, var24, (SubLObject)module0381.$ic76$);
        if (var28 == module0381.$ic76$) {
            var28 = Values.arg2(var25.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27104(var24)));
            module0034.f1816(var27, var24, var28, (SubLObject)module0381.UNPROVIDED);
        }
        return module0034.f1959(var28);
    }
    
    public static SubLObject f27105(final SubLObject var24) {
        final SubLObject var25 = f27031(var24);
        final SubLObject var26 = f27047(var24);
        final SubLObject var27 = module0364.f24737(var25);
        final SubLObject var28 = module0364.f24737(var26);
        final SubLObject var29 = module0233.f15386(var28);
        final SubLObject var30 = module0233.f15390(var27, var29);
        return var30;
    }
    
    public static SubLObject f27106(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        SubLObject var26 = (SubLObject)module0381.NIL;
        final SubLObject var27 = module0364.f24728(var24);
        final SubLObject var28 = module0034.$g879$.currentBinding(var25);
        try {
            module0034.$g879$.bind(var27, var25);
            SubLObject var29 = (SubLObject)module0381.NIL;
            if (module0381.NIL != var27 && module0381.NIL == module0034.f1842(var27)) {
                var29 = module0034.f1869(var27);
                final SubLObject var30 = Threads.current_process();
                if (module0381.NIL == var29) {
                    module0034.f1873(var27, var30);
                }
                else if (!var29.eql(var30)) {
                    Errors.error((SubLObject)module0381.$ic73$);
                }
            }
            try {
                var26 = f27107(var24);
            }
            finally {
                final SubLObject var193_204 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0381.T, var25);
                    if (module0381.NIL != var27 && module0381.NIL == var29) {
                        module0034.f1873(var27, (SubLObject)module0381.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var193_204, var25);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var28, var25);
        }
        return var26;
    }
    
    public static SubLObject f27108(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0361.f24117(module0364.f24722(var24));
        final SubLObject var27 = module0034.$g879$.currentBinding(var25);
        try {
            module0034.$g879$.bind(var26, var25);
            SubLObject var28 = (SubLObject)module0381.NIL;
            if (module0381.NIL != var26 && module0381.NIL == module0034.f1842(var26)) {
                var28 = module0034.f1869(var26);
                final SubLObject var29 = Threads.current_process();
                if (module0381.NIL == var28) {
                    module0034.f1873(var26, var29);
                }
                else if (!var28.eql(var29)) {
                    Errors.error((SubLObject)module0381.$ic73$);
                }
            }
            try {
                return f27109(var24);
            }
            finally {
                final SubLObject var193_205 = Threads.$is_thread_performing_cleanupP$.currentBinding(var25);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0381.T, var25);
                    if (module0381.NIL != var26 && module0381.NIL == var28) {
                        module0034.f1873(var26, (SubLObject)module0381.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var193_205, var25);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var27, var25);
        }
    }
    
    public static SubLObject f27107(final SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        final SubLObject var26 = module0034.$g879$.getDynamicValue(var25);
        SubLObject var27 = (SubLObject)module0381.NIL;
        if (module0381.NIL == var26) {
            return f27108(var24);
        }
        var27 = module0034.f1857(var26, (SubLObject)module0381.$ic77$, (SubLObject)module0381.UNPROVIDED);
        if (module0381.NIL == var27) {
            var27 = module0034.f1807(module0034.f1842(var26), (SubLObject)module0381.$ic77$, (SubLObject)module0381.ONE_INTEGER, (SubLObject)module0381.NIL, (SubLObject)module0381.EQ, (SubLObject)module0381.UNPROVIDED);
            module0034.f1860(var26, (SubLObject)module0381.$ic77$, var27);
        }
        SubLObject var28 = module0034.f1814(var27, var24, (SubLObject)module0381.$ic76$);
        if (var28 == module0381.$ic76$) {
            var28 = Values.arg2(var25.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27108(var24)));
            module0034.f1816(var27, var24, var28, (SubLObject)module0381.UNPROVIDED);
        }
        return module0034.f1959(var28);
    }
    
    public static SubLObject f27109(final SubLObject var24) {
        return module0233.f15386(f27102(var24));
    }
    
    public static SubLObject f27101(final SubLObject var24, final SubLObject var188) {
        return (module0381.NIL != var188) ? f27102(var24) : f27106(var24);
    }
    
    public static SubLObject f27110(final SubLObject var206, final SubLObject var24) {
        final SubLObject var207 = f27102(var24);
        final SubLObject var208 = module0233.f15384(var207, var206);
        return var208;
    }
    
    public static SubLObject f27111(final SubLObject var207, final SubLObject var24) {
        final SubLObject var208 = f27106(var24);
        final SubLObject var209 = module0233.f15384(var208, var207);
        return var209;
    }
    
    public static SubLObject f27112(final SubLObject var209, final SubLObject var210, final SubLObject var24) {
        final SubLObject var211 = f27113(var209, var210, var24);
        f27114(var24, var209, var211);
        if (module0381.NIL == var211) {
            f27115(var209, var210, var24, var211);
        }
        else {
            final SubLObject var212 = f27116(var24, var209);
            f27115(var209, var210, var24, var211);
            if (module0381.NIL != var212) {
                final SubLObject var213 = module0364.f24736(var212);
                final SubLObject var215;
                final SubLObject var214 = var215 = module0364.f24725(var24);
                final SubLObject var216 = module0363.f24507(var215);
                final SubLObject var217 = module0361.f24123(var216);
                if (module0381.NIL == module0065.f4772(var217, (SubLObject)module0381.$ic62$)) {
                    final SubLObject var90_212 = var217;
                    if (module0381.NIL == module0065.f4775(var90_212, (SubLObject)module0381.$ic62$)) {
                        final SubLObject var218 = module0065.f4740(var90_212);
                        final SubLObject var219 = (SubLObject)module0381.NIL;
                        SubLObject var220;
                        SubLObject var221;
                        SubLObject var222;
                        SubLObject var223;
                        SubLObject var224;
                        SubLObject var225;
                        SubLObject var226;
                        SubLObject var227;
                        SubLObject var228;
                        for (var220 = Sequences.length(var218), var221 = (SubLObject)module0381.NIL, var221 = (SubLObject)module0381.ZERO_INTEGER; var221.numL(var220); var221 = Numbers.add(var221, (SubLObject)module0381.ONE_INTEGER)) {
                            var222 = ((module0381.NIL != var219) ? Numbers.subtract(var220, var221, (SubLObject)module0381.ONE_INTEGER) : var221);
                            var223 = Vectors.aref(var218, var222);
                            if (module0381.NIL == module0065.f4749(var223) || module0381.NIL == module0065.f4773((SubLObject)module0381.$ic62$)) {
                                if (module0381.NIL != module0065.f4749(var223)) {
                                    var223 = (SubLObject)module0381.$ic62$;
                                }
                                if (module0381.NIL != module0363.f24547(var215, var223)) {
                                    var224 = var223;
                                    var225 = module0077.f5333(module0369.f25473(var224));
                                    for (var226 = module0032.f1741(var225), var227 = (SubLObject)module0381.NIL, var227 = module0032.f1742(var226, var225); module0381.NIL == module0032.f1744(var226, var227); var227 = module0032.f1743(var227)) {
                                        var228 = module0032.f1745(var226, var227);
                                        if (module0381.NIL != module0032.f1746(var227, var228)) {
                                            module0373.f26347(var228, var213);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final SubLObject var100_213 = var217;
                    if (module0381.NIL == module0065.f4777(var100_213)) {
                        final SubLObject var229 = module0065.f4738(var100_213);
                        SubLObject var230 = (SubLObject)module0381.NIL;
                        SubLObject var231 = (SubLObject)module0381.NIL;
                        final Iterator var232 = Hashtables.getEntrySetIterator(var229);
                        try {
                            while (Hashtables.iteratorHasNext(var232)) {
                                final Map.Entry var233 = Hashtables.iteratorNextEntry(var232);
                                var230 = Hashtables.getEntryKey(var233);
                                var231 = Hashtables.getEntryValue(var233);
                                if (module0381.NIL != module0363.f24547(var215, var231)) {
                                    final SubLObject var234 = var231;
                                    final SubLObject var235 = module0077.f5333(module0369.f25473(var234));
                                    SubLObject var236;
                                    SubLObject var237;
                                    SubLObject var238;
                                    for (var236 = module0032.f1741(var235), var237 = (SubLObject)module0381.NIL, var237 = module0032.f1742(var236, var235); module0381.NIL == module0032.f1744(var236, var237); var237 = module0032.f1743(var237)) {
                                        var238 = module0032.f1745(var236, var237);
                                        if (module0381.NIL != module0032.f1746(var237, var238)) {
                                            module0373.f26347(var238, var213);
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(var232);
                        }
                    }
                }
            }
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27116(final SubLObject var24, final SubLObject var214) {
        if (module0381.NIL == f27117(var24)) {
            return f27118(var24, var214, (SubLObject)module0381.T);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27119(final SubLObject var24, final SubLObject var214) {
        return f27118(var24, var214, (SubLObject)module0381.NIL);
    }
    
    public static SubLObject f27118(final SubLObject var24, final SubLObject var214, final SubLObject var215) {
        final SubLThread var216 = SubLProcess.currentSubLThread();
        final SubLObject var217 = module0366.f24934(var214);
        final SubLObject var218 = f27110(var217, var24);
        var216.resetMultipleValues();
        final SubLObject var219 = f27120(var24, var218, var215);
        final SubLObject var220 = var216.secondMultipleValue();
        var216.resetMultipleValues();
        if (module0381.NIL != var220) {
            f27062(var24, var220, var214);
        }
        return var219;
    }
    
    public static SubLObject f27121(final SubLObject var51) {
        final SubLObject var52 = module0364.f24725(var51);
        final SubLObject var53 = module0363.f24530(var52);
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        for (var54 = module0032.f1741(var53), var55 = (SubLObject)module0381.NIL, var55 = module0032.f1742(var54, var53); module0381.NIL == module0032.f1744(var54, var55); var55 = module0032.f1743(var55)) {
            var56 = module0032.f1745(var54, var55);
            if (module0381.NIL != module0032.f1746(var55, var56) && module0381.NIL != module0364.f24748(var56, (SubLObject)module0381.$ic24$)) {
                f27122(var56, var51);
            }
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27122(final SubLObject var24, final SubLObject var51) {
        final SubLObject var52 = f27045(var24, var51);
        if (module0381.NIL != var52) {
            module0373.f26245(var52);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27123(final SubLObject var24, final SubLObject var207) {
        return f27120(var24, var207, (SubLObject)module0381.T);
    }
    
    public static SubLObject f27124(final SubLObject var24, final SubLObject var207) {
        return f27120(var24, var207, (SubLObject)module0381.NIL);
    }
    
    public static SubLObject f27120(final SubLObject var24, final SubLObject var207, final SubLObject var218) {
        final SubLObject var219 = module0364.f24736(f27047(var24));
        return f27125(var219, var207, var218);
    }
    
    public static SubLObject f27126(final SubLObject var219, final SubLObject var220) {
        return f27125(var219, var220, (SubLObject)module0381.NIL);
    }
    
    public static SubLObject f27125(final SubLObject var219, final SubLObject var220, final SubLObject var218) {
        final SubLThread var221 = SubLProcess.currentSubLThread();
        if (module0381.NIL == Errors.$ignore_mustsP$.getDynamicValue(var221) && module0381.NIL == var220) {
            Errors.error((SubLObject)module0381.$ic78$, var219);
        }
        final SubLObject var222 = f27127(var219, var220, var218);
        SubLObject var223 = (SubLObject)module0381.NIL;
        if (module0381.NIL != var218) {
            var223 = module0375.f26580(var219, var222, var220, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED);
        }
        return Values.values(var222, var223);
    }
    
    public static SubLObject f27128(final SubLObject var219, final SubLObject var220) {
        return f27127(var219, var220, (SubLObject)module0381.T);
    }
    
    public static SubLObject f27127(final SubLObject var219, final SubLObject var220, final SubLObject var218) {
        final SubLThread var221 = SubLProcess.currentSubLThread();
        if (module0381.NIL == Errors.$ignore_mustsP$.getDynamicValue(var221) && module0381.NIL == var220) {
            Errors.error((SubLObject)module0381.$ic79$, var219);
        }
        final SubLObject var222 = module0363.f24509(var219);
        final SubLObject var223 = module0233.f15362(var220, var222);
        final SubLObject var224 = module0363.f24507(var219);
        final SubLObject var225 = (module0381.NIL != var218) ? module0373.f26435(var224, var223, (SubLObject)module0381.UNPROVIDED) : module0373.f26242(var224, var223);
        return var225;
    }
    
    public static SubLObject f27117(final SubLObject var24) {
        final SubLObject var25 = f27050(var24);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != module0363.f24562(var25) && module0381.NIL != module0363.f24659(var25));
    }
    
    public static SubLObject f27129(final SubLObject var224, final SubLObject var24) {
        final SubLObject var225 = f27047(var24);
        final SubLObject var226 = (SubLObject)((module0381.NIL != var225) ? module0364.f24736(var225) : module0381.NIL);
        if (!var224.eql(var226)) {
            return (SubLObject)module0381.NIL;
        }
        final SubLObject var227 = f27031(var24);
        if (module0381.NIL != var227) {
            return module0364.f24736(var227);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27130(final SubLObject var224, final SubLObject var24) {
        final SubLObject var225 = f27031(var24);
        final SubLObject var226 = module0364.f24736(var225);
        if (!var224.eql(var226)) {
            return (SubLObject)module0381.NIL;
        }
        final SubLObject var227 = f27047(var24);
        if (module0381.NIL != var227) {
            return module0364.f24736(var227);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27131(final SubLObject var51, final SubLObject var24) {
        final SubLObject var52 = f27047(var24);
        if (module0381.NIL != var52) {
            final SubLObject var53 = module0364.f24736(var52);
            final SubLObject var54 = module0364.f24725(var51);
            if (!var54.eql(var53)) {
                return (SubLObject)module0381.NIL;
            }
            final SubLObject var55 = module0375.f26570(var51);
            final SubLObject var56 = f27111(var55, var24);
            final SubLObject var57 = (SubLObject)((module0381.NIL != var56) ? f27132(var24, var56) : module0381.NIL);
            if (module0381.NIL != var57) {
                return module0364.f24736(var57);
            }
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27133(final SubLObject var51, final SubLObject var24) {
        return f27056(var24, var51);
    }
    
    public static SubLObject f27134(final SubLObject var51, final SubLObject var24) {
        final SubLObject var52 = f27031(var24);
        final SubLObject var53 = module0364.f24736(var52);
        final SubLObject var54 = module0364.f24725(var51);
        if (var54.eql(var53)) {
            if (module0381.NIL != f27047(var24)) {
                final SubLObject var55 = module0375.f26570(var51);
                final SubLObject var56 = f27110(var55, var24);
                final SubLObject var57 = (SubLObject)((module0381.NIL != var56) ? f27124(var24, var56) : module0381.NIL);
                if (module0381.NIL != var57) {
                    return module0364.f24736(var57);
                }
            }
            return (SubLObject)module0381.NIL;
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27132(final SubLObject var24, final SubLObject var206) {
        final SubLObject var207 = module0364.f24736(f27031(var24));
        return f27126(var207, var206);
    }
    
    public static SubLObject f27113(final SubLObject var185, final SubLObject var226, final SubLObject var24) {
        final SubLObject var227 = f27031(var24);
        final SubLObject var228 = module0364.f24736(var227);
        final SubLObject var229 = module0366.f24956(var185);
        if (var228.eql(var229)) {
            final SubLObject var230 = module0364.f24737(var227);
            if (module0381.NIL != module0233.f15364(var230, var226)) {
                return (SubLObject)module0381.T;
            }
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27135(final SubLObject var24, final SubLObject var188) {
        final SubLThread var189 = SubLProcess.currentSubLThread();
        SubLObject var190 = (SubLObject)module0381.NIL;
        final SubLObject var191 = module0364.f24728(var24);
        final SubLObject var192 = module0034.$g879$.currentBinding(var189);
        try {
            module0034.$g879$.bind(var191, var189);
            SubLObject var193 = (SubLObject)module0381.NIL;
            if (module0381.NIL != var191 && module0381.NIL == module0034.f1842(var191)) {
                var193 = module0034.f1869(var191);
                final SubLObject var194 = Threads.current_process();
                if (module0381.NIL == var193) {
                    module0034.f1873(var191, var194);
                }
                else if (!var193.eql(var194)) {
                    Errors.error((SubLObject)module0381.$ic73$);
                }
            }
            try {
                var190 = f27136(var24, var188);
            }
            finally {
                final SubLObject var193_228 = Threads.$is_thread_performing_cleanupP$.currentBinding(var189);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0381.T, var189);
                    if (module0381.NIL != var191 && module0381.NIL == var193) {
                        module0034.f1873(var191, (SubLObject)module0381.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var193_228, var189);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var192, var189);
        }
        return var190;
    }
    
    public static SubLObject f27137(final SubLObject var24, final SubLObject var188) {
        final SubLThread var189 = SubLProcess.currentSubLThread();
        final SubLObject var190 = module0361.f24117(module0364.f24722(var24));
        final SubLObject var191 = module0034.$g879$.currentBinding(var189);
        try {
            module0034.$g879$.bind(var190, var189);
            SubLObject var192 = (SubLObject)module0381.NIL;
            if (module0381.NIL != var190 && module0381.NIL == module0034.f1842(var190)) {
                var192 = module0034.f1869(var190);
                final SubLObject var193 = Threads.current_process();
                if (module0381.NIL == var192) {
                    module0034.f1873(var190, var193);
                }
                else if (!var192.eql(var193)) {
                    Errors.error((SubLObject)module0381.$ic73$);
                }
            }
            try {
                return f27138(var24, var188);
            }
            finally {
                final SubLObject var193_229 = Threads.$is_thread_performing_cleanupP$.currentBinding(var189);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0381.T, var189);
                    if (module0381.NIL != var190 && module0381.NIL == var192) {
                        module0034.f1873(var190, (SubLObject)module0381.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var193_229, var189);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var191, var189);
        }
    }
    
    public static SubLObject f27136(final SubLObject var24, final SubLObject var188) {
        final SubLThread var189 = SubLProcess.currentSubLThread();
        final SubLObject var190 = module0034.$g879$.getDynamicValue(var189);
        SubLObject var191 = (SubLObject)module0381.NIL;
        if (module0381.NIL == var190) {
            return f27137(var24, var188);
        }
        var191 = module0034.f1857(var190, (SubLObject)module0381.$ic81$, (SubLObject)module0381.UNPROVIDED);
        if (module0381.NIL == var191) {
            var191 = module0034.f1807(module0034.f1842(var190), (SubLObject)module0381.$ic81$, (SubLObject)module0381.TWO_INTEGER, (SubLObject)module0381.NIL, (SubLObject)module0381.EQ, (SubLObject)module0381.UNPROVIDED);
            module0034.f1860(var190, (SubLObject)module0381.$ic81$, var191);
        }
        final SubLObject var192 = module0034.f1782(var24, var188);
        final SubLObject var193 = module0034.f1814(var191, var192, (SubLObject)module0381.UNPROVIDED);
        if (var193 != module0381.$ic76$) {
            SubLObject var194 = var193;
            SubLObject var195 = (SubLObject)module0381.NIL;
            var195 = var194.first();
            while (module0381.NIL != var194) {
                SubLObject var196 = var195.first();
                final SubLObject var197 = conses_high.second(var195);
                if (var24.eql(var196.first())) {
                    var196 = var196.rest();
                    if (module0381.NIL != var196 && module0381.NIL == var196.rest() && var188.eql(var196.first())) {
                        return module0034.f1959(var197);
                    }
                }
                var194 = var194.rest();
                var195 = var194.first();
            }
        }
        final SubLObject var198 = Values.arg2(var189.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f27137(var24, var188)));
        module0034.f1836(var191, var192, var193, var198, (SubLObject)ConsesLow.list(var24, var188));
        return module0034.f1959(var198);
    }
    
    public static SubLObject f27138(final SubLObject var24, final SubLObject var188) {
        if (module0381.NIL != var188) {
            final SubLObject var189 = f27034(var24);
            final SubLObject var190 = f27031(var24);
            final SubLObject var191 = module0363.f24580(module0364.f24736(var190));
            final SubLObject var192 = f27065(var189);
            final SubLObject var193 = module0363.f24580(module0364.f24725(var24));
            final SubLObject var194 = module0204.f13111(var193, var192);
            final SubLObject var195 = module0035.f2399(var194, Symbols.symbol_function((SubLObject)module0381.$ic82$), (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED);
            final SubLObject var196 = module0035.f2399(var191, Symbols.symbol_function((SubLObject)module0381.$ic82$), (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED);
            final SubLObject var197 = module0233.f15362(module0364.f24737(var190), var196);
            final SubLObject var198 = conses_high.intersection(var197, var195, Symbols.symbol_function((SubLObject)module0381.EQ), (SubLObject)module0381.UNPROVIDED);
            final SubLObject var199 = module0233.f15376(module0364.f24737(var190), var198);
            final SubLObject var200 = f27139(var199);
            return var200;
        }
        final SubLObject var201 = f27101(var24, var188);
        return Mapping.mapcar((SubLObject)module0381.$ic83$, var201);
    }
    
    public static SubLObject f27140(final SubLObject var24) {
        return f27135(var24, (SubLObject)module0381.NIL);
    }
    
    public static SubLObject f27092(final SubLObject var24) {
        return f27135(var24, (SubLObject)module0381.T);
    }
    
    public static SubLObject f27139(final SubLObject var245) {
        return var245;
    }
    
    public static SubLObject f27141(final SubLObject var24) {
        final SubLObject var25 = f27135(var24, (SubLObject)module0381.T);
        final SubLObject var26 = f27142(var24);
        final SubLObject var27 = module0233.f15362(var26, var25);
        return var27;
    }
    
    public static SubLObject f27142(final SubLObject var24) {
        final SubLObject var25 = f27031(var24);
        return module0364.f24737(var25);
    }
    
    public static SubLObject f27143(final SubLObject var24) {
        final SubLObject var25 = f27047(var24);
        return module0364.f24737(var25);
    }
    
    public static SubLObject f27114(final SubLObject var24, final SubLObject var80, final SubLObject var188) {
        final SubLThread var189 = SubLProcess.currentSubLThread();
        if (module0381.NIL == Errors.$ignore_mustsP$.getDynamicValue(var189) && module0381.NIL == module0366.f24983(var80)) {
            Errors.error((SubLObject)module0381.$ic84$, var80);
        }
        final SubLObject var190 = f27144(var24, var80, var188);
        if (module0381.NIL != var188) {
            f27058(var24, var190, var80);
        }
        else {
            f27060(var24, var190, var80);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27144(final SubLObject var24, final SubLObject var80, final SubLObject var188) {
        final SubLObject var189 = module0366.f24934(var80);
        return f27145(var24, var189, var188);
    }
    
    public static SubLObject f27146(final SubLObject var24, final SubLObject var80, final SubLObject var187, final SubLObject var188) {
        final SubLObject var189 = f27145(var24, var187, var188);
        if (module0381.NIL != var188) {
            f27059(var24, var189, var80);
        }
        else {
            f27061(var24, var189, var80);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27147(final SubLObject var24, final SubLObject var64, final SubLObject var78) {
        if (module0381.NIL != f27048(var24)) {
            f27146(var24, var64, var78, (SubLObject)module0381.T);
            f27146(var24, var64, var78, (SubLObject)module0381.NIL);
        }
        else {
            f27146(var24, var64, var78, (SubLObject)module0381.T);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27145(final SubLObject var24, final SubLObject var187, final SubLObject var188) {
        final SubLObject var189 = f27135(var24, var188);
        final SubLObject var190 = module0233.f15391(var187, var189);
        return var190;
    }
    
    public static SubLObject f27148(final SubLObject var24, final SubLObject var190, final SubLObject var188) {
        return (module0381.NIL != var188) ? f27054(var24, var190) : f27053(var24, var190);
    }
    
    public static SubLObject f27115(final SubLObject var209, final SubLObject var210, final SubLObject var24, final SubLObject var188) {
        final SubLThread var211 = SubLProcess.currentSubLThread();
        SubLObject var212 = (SubLObject)module0381.NIL;
        final SubLObject var213 = module0366.f24934(var209);
        final SubLObject var214 = f27100(var213, var24, var188);
        final SubLObject var215 = module0035.remove_if_not((SubLObject)module0381.$ic85$, f27148(var24, var214, var188), (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED);
        if (module0381.NIL != var215) {
            final SubLObject var216 = f27149(var24, var188);
            final SubLObject var217 = module0364.f24737(var216);
            SubLObject var218 = (SubLObject)module0381.NIL;
            SubLObject var219 = var215;
            SubLObject var220 = (SubLObject)module0381.NIL;
            var220 = var219.first();
            while (module0381.NIL != var219) {
                final SubLObject var221 = module0233.f15382(var217, module0366.f24934(var220));
                var218 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var220, var221), var218);
                var219 = var219.rest();
                var220 = var219.first();
            }
            var218 = Sequences.nreverse(var218);
            final SubLObject var222 = module0233.f15382(var210, var213);
            final SubLObject var223 = (SubLObject)((module0381.NIL != var188) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var209, var222)), var218) : ConsesLow.list(var218, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(var209, var222))));
            SubLObject var225;
            final SubLObject var224 = var225 = module0035.f2489(var223, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED);
            SubLObject var226 = (SubLObject)module0381.NIL;
            var226 = var225.first();
            while (module0381.NIL != var225) {
                var211.resetMultipleValues();
                final SubLObject var227 = f27096(var24, var226);
                final SubLObject var228 = var211.secondMultipleValue();
                var211.resetMultipleValues();
                if (module0381.NIL != var228) {
                    var212 = (SubLObject)ConsesLow.cons(var227, var212);
                }
                else {
                    module0373.f26245(var209);
                }
                var225 = var225.rest();
                var226 = var225.first();
            }
            SubLObject var229;
            var212 = (var229 = Sequences.nreverse(var212));
            SubLObject var230 = (SubLObject)module0381.NIL;
            var230 = var229.first();
            while (module0381.NIL != var229) {
                module0373.f26265(var230);
                var229 = var229.rest();
                var230 = var229.first();
            }
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27149(final SubLObject var24, final SubLObject var188) {
        return (module0381.NIL != var188) ? f27047(var24) : f27031(var24);
    }
    
    public static SubLObject f27150(final SubLObject var84, final SubLObject var175) {
        SubLObject var176 = (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL == module0373.f26320(f27050(var84), var175));
        if (module0381.NIL != f27048(var84)) {
            final SubLObject var177 = module0363.f24527(f27051(var84));
            SubLObject var178;
            SubLObject var179;
            SubLObject var180;
            SubLObject var181;
            for (var178 = module0032.f1741(var177), var179 = (SubLObject)module0381.NIL, var179 = module0032.f1742(var178, var177); module0381.NIL == var176 && module0381.NIL == module0032.f1744(var178, var179); var179 = module0032.f1743(var179)) {
                var180 = module0032.f1745(var178, var179);
                if (module0381.NIL != module0032.f1746(var179, var180) && module0381.NIL != module0364.f24748(var180, (SubLObject)module0381.$ic46$) && module0381.NIL != f27133(var180, var84)) {
                    var181 = module0364.f24757(var180);
                    var176 = (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL == module0373.f26320(var181, var175));
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL == var176);
    }
    
    public static SubLObject f27151(final SubLObject var24, final SubLObject var265, final SubLObject var175) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0381.NIL != f27152(var24, var265, var175) || module0381.NIL != f27153(var24, var265, var175));
    }
    
    public static SubLObject f27152(final SubLObject var24, final SubLObject var265, final SubLObject var175) {
        final SubLObject var266 = module0364.f24736(f27031(var24));
        final SubLObject var267 = f27092(var24);
        if (module0381.NIL != module0373.f26320(var266, var175) && module0381.$ic86$ == module0388.f27577(var266, var175, var267)) {
            final SubLObject var268 = module0363.f24527(var266);
            SubLObject var269;
            SubLObject var270;
            SubLObject var271;
            for (var269 = module0032.f1741(var268), var270 = (SubLObject)module0381.NIL, var270 = module0032.f1742(var269, var268); module0381.NIL == module0032.f1744(var269, var270); var270 = module0032.f1743(var270)) {
                var271 = module0032.f1745(var269, var270);
                if (module0381.NIL != module0032.f1746(var270, var271) && module0381.NIL == module0373.f26412(var271, var24, var265, var175)) {
                    return (SubLObject)module0381.NIL;
                }
            }
            return (SubLObject)module0381.T;
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27153(final SubLObject var24, final SubLObject var265, final SubLObject var175) {
        if (module0381.NIL != var265) {
            final SubLObject var266 = f27034(var24);
            return module0365.f24886(var266);
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27154(final SubLObject var24) {
        final SubLObject var25 = f27051(var24);
        SubLObject var27;
        final SubLObject var26 = var27 = module0363.f24509(var25);
        SubLObject var28 = (SubLObject)module0381.NIL;
        var28 = var27.first();
        while (module0381.NIL != var27) {
            SubLObject var29 = (SubLObject)module0381.$ic64$;
            SubLObject var30 = (SubLObject)module0381.ZERO_INTEGER;
            SubLObject var76_270 = module0232.f15306(var28);
            SubLObject var31 = (SubLObject)module0381.NIL;
            var31 = var76_270.first();
            while (module0381.NIL != var76_270) {
                SubLObject var33;
                final SubLObject var32 = var33 = var31;
                SubLObject var34 = (SubLObject)module0381.NIL;
                SubLObject var35 = (SubLObject)module0381.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0381.$ic87$);
                var34 = var33.first();
                var33 = var33.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0381.$ic87$);
                var35 = var33.first();
                var33 = var33.rest();
                if (module0381.NIL == var33) {
                    final SubLObject var36 = module0205.f13333(var35);
                    if (module0381.NIL != module0201.f12584(var36) && module0381.NIL != module0004.f104(var36, f27140(var24), (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                        return (SubLObject)module0381.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0381.$ic87$);
                }
                var30 = Numbers.add(var30, (SubLObject)module0381.ONE_INTEGER);
                var76_270 = var76_270.rest();
                var31 = var76_270.first();
            }
            var29 = (SubLObject)module0381.$ic65$;
            var30 = (SubLObject)module0381.ZERO_INTEGER;
            SubLObject var76_271 = module0232.f15308(var28);
            var31 = (SubLObject)module0381.NIL;
            var31 = var76_271.first();
            while (module0381.NIL != var76_271) {
                SubLObject var38;
                final SubLObject var37 = var38 = var31;
                SubLObject var34 = (SubLObject)module0381.NIL;
                SubLObject var35 = (SubLObject)module0381.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0381.$ic87$);
                var34 = var38.first();
                var38 = var38.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0381.$ic87$);
                var35 = var38.first();
                var38 = var38.rest();
                if (module0381.NIL == var38) {
                    final SubLObject var36 = module0205.f13333(var35);
                    if (module0381.NIL != module0201.f12584(var36) && module0381.NIL != module0004.f104(var36, f27140(var24), (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                        return (SubLObject)module0381.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0381.$ic87$);
                }
                var30 = Numbers.add(var30, (SubLObject)module0381.ONE_INTEGER);
                var76_271 = var76_271.rest();
                var31 = var76_271.first();
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27155(final SubLObject var24) {
        final SubLObject var25 = f27051(var24);
        SubLObject var27;
        final SubLObject var26 = var27 = module0363.f24509(var25);
        SubLObject var28 = (SubLObject)module0381.NIL;
        var28 = var27.first();
        while (module0381.NIL != var27) {
            SubLObject var29 = (SubLObject)module0381.$ic64$;
            SubLObject var30 = (SubLObject)module0381.ZERO_INTEGER;
            SubLObject var76_279 = module0232.f15306(var28);
            SubLObject var31 = (SubLObject)module0381.NIL;
            var31 = var76_279.first();
            while (module0381.NIL != var76_279) {
                SubLObject var33;
                final SubLObject var32 = var33 = var31;
                SubLObject var34 = (SubLObject)module0381.NIL;
                SubLObject var35 = (SubLObject)module0381.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0381.$ic87$);
                var34 = var33.first();
                var33 = var33.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0381.$ic87$);
                var35 = var33.first();
                var33 = var33.rest();
                if (module0381.NIL == var33) {
                    final SubLObject var36 = module0205.f13333(var35);
                    final SubLObject var37 = module0205.f13388(var35, (SubLObject)module0381.UNPROVIDED);
                    final SubLObject var38 = module0205.f13388(var35, (SubLObject)module0381.UNPROVIDED);
                    if (var36.eql(module0381.$ic88$) && module0381.NIL != module0193.f12067(var37) && module0381.NIL != module0193.f12067(var38) && module0381.NIL != module0004.f104(var38, f27140(var24), (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                        return (SubLObject)module0381.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0381.$ic87$);
                }
                var30 = Numbers.add(var30, (SubLObject)module0381.ONE_INTEGER);
                var76_279 = var76_279.rest();
                var31 = var76_279.first();
            }
            var29 = (SubLObject)module0381.$ic65$;
            var30 = (SubLObject)module0381.ZERO_INTEGER;
            SubLObject var76_280 = module0232.f15308(var28);
            var31 = (SubLObject)module0381.NIL;
            var31 = var76_280.first();
            while (module0381.NIL != var76_280) {
                SubLObject var40;
                final SubLObject var39 = var40 = var31;
                SubLObject var34 = (SubLObject)module0381.NIL;
                SubLObject var35 = (SubLObject)module0381.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0381.$ic87$);
                var34 = var40.first();
                var40 = var40.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0381.$ic87$);
                var35 = var40.first();
                var40 = var40.rest();
                if (module0381.NIL == var40) {
                    final SubLObject var36 = module0205.f13333(var35);
                    final SubLObject var37 = module0205.f13388(var35, (SubLObject)module0381.UNPROVIDED);
                    final SubLObject var38 = module0205.f13388(var35, (SubLObject)module0381.UNPROVIDED);
                    if (var36.eql(module0381.$ic88$) && module0381.NIL != module0193.f12067(var37) && module0381.NIL != module0193.f12067(var38) && module0381.NIL != module0004.f104(var38, f27140(var24), (SubLObject)module0381.UNPROVIDED, (SubLObject)module0381.UNPROVIDED)) {
                        return (SubLObject)module0381.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0381.$ic87$);
                }
                var30 = Numbers.add(var30, (SubLObject)module0381.ONE_INTEGER);
                var76_280 = var76_280.rest();
                var31 = var76_280.first();
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27156() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27016", "S#30167", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27017", "S#30162", 1, 0, false);
        new $f27017$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27018", "S#30168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27019", "S#30169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27020", "S#30170", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27021", "S#30171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27022", "S#30172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27023", "S#30173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27024", "S#30174", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27025", "S#30175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27026", "S#30176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27027", "S#30177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27028", "S#30178", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27029", "S#29224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27030", "S#30179", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27032", "S#30180", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27033", "S#27591", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0381", "f27035", "S#30181");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0381", "f27036", "S#30182");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0381", "f27037", "S#30183");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0381", "f27038", "S#30184");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27039", "S#30185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27040", "S#30186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27041", "S#30187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27042", "S#29326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27043", "S#29313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27044", "S#30188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27045", "S#30189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27031", "S#28932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27046", "S#29291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27047", "S#29292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27048", "S#30190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27050", "S#29315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27051", "S#26808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27052", "S#30049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27053", "S#30191", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27054", "S#30192", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27034", "S#28943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27056", "S#29324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27057", "S#29325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27058", "S#30193", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27059", "S#30194", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27060", "S#30195", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27061", "S#30196", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27062", "S#30197", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27063", "S#29758", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27064", "S#30198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27066", "S#30199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27067", "S#27352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27068", "S#30200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27069", "S#30201", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27055", "S#29226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27065", "S#29228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27070", "S#30202", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27071", "S#28949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27072", "S#28950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27073", "S#30203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27074", "S#29186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27078", "S#30204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27075", "S#30205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27080", "S#30206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27081", "S#30207", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27076", "S#30208", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27082", "S#30209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27077", "S#30210", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27083", "S#30211", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27085", "S#30212", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27086", "S#30213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27084", "S#30214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27079", "S#30215", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27087", "S#30216", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27088", "S#30217", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27049", "S#30218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27089", "S#29199", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27091", "S#30219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27090", "S#30220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27093", "S#29222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27094", "S#30221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27095", "S#29234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27096", "S#30222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27098", "S#29323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27099", "S#29256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27097", "S#30112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27100", "S#30223", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27102", "S#30224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27104", "S#30225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27103", "S#30226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27105", "S#30227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27106", "S#30228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27108", "S#30229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27107", "S#30230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27109", "S#30231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27101", "S#30232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27110", "S#30233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27111", "S#30234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27112", "S#29262", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27116", "S#30235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27119", "S#30236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27118", "S#30237", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27121", "S#27358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27122", "S#29280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27123", "S#30238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27124", "S#30239", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27120", "S#30240", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27126", "S#30241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27125", "S#30242", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27128", "S#29805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27127", "S#30243", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27117", "S#30244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27129", "S#30245", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27130", "S#30246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27131", "S#30247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27133", "S#29305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27134", "S#29312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27132", "S#30248", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27113", "S#30249", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27135", "S#30250", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27137", "S#30251", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27136", "S#30252", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27138", "S#30253", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27140", "S#30254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27092", "S#29310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27139", "S#30255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27141", "S#30256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27142", "S#30050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27143", "S#30257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27114", "S#30258", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27144", "S#30259", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27146", "S#30260", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27147", "S#27388", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27145", "S#30261", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27148", "S#30262", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27115", "S#30263", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27149", "S#30264", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27150", "S#29298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27151", "S#29311", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27152", "S#30265", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27153", "S#30266", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27154", "S#30267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0381", "f27155", "S#30268", 1, 0, false);
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27157() {
        module0381.$g3218$ = SubLFiles.defconstant("S#30269", (SubLObject)module0381.$ic0$);
        module0381.$g3219$ = SubLFiles.defparameter("S#30270", module0340.f22997((SubLObject)module0381.$ic24$, (SubLObject)module0381.UNPROVIDED));
        return (SubLObject)module0381.NIL;
    }
    
    public static SubLObject f27158() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0381.$g3218$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0381.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0381.$ic8$);
        Structures.def_csetf((SubLObject)module0381.$ic9$, (SubLObject)module0381.$ic10$);
        Structures.def_csetf((SubLObject)module0381.$ic11$, (SubLObject)module0381.$ic12$);
        Structures.def_csetf((SubLObject)module0381.$ic13$, (SubLObject)module0381.$ic14$);
        Equality.identity((SubLObject)module0381.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0381.$g3218$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0381.$ic23$));
        module0002.f50((SubLObject)module0381.$ic31$, (SubLObject)module0381.$ic56$);
        module0002.f50((SubLObject)module0381.$ic36$, (SubLObject)module0381.$ic57$);
        module0034.f1895((SubLObject)module0381.$ic74$);
        module0034.f1895((SubLObject)module0381.$ic77$);
        module0002.f50((SubLObject)module0381.$ic48$, (SubLObject)module0381.$ic80$);
        module0034.f1895((SubLObject)module0381.$ic81$);
        return (SubLObject)module0381.NIL;
    }
    
    public void declareFunctions() {
        f27156();
    }
    
    public void initializeVariables() {
        f27157();
    }
    
    public void runTopLevelForms() {
        f27158();
    }
    
    static {
        me = (SubLFile)new module0381();
        module0381.$g3218$ = null;
        module0381.$g3219$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#30161", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#30162", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30271", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30272", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30273", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCAL-PROOF-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("NON-FOCAL-PROOF-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("RESTRICTED-NON-FOCAL-LINK-INDEX"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30169", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30170", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30171", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30172", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30173", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#30167", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#30162", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#30168", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#30171", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#30169", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#30172", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#30170", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#30173", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("FOCAL-PROOF-INDEX");
        $ic16$ = SubLObjectFactory.makeKeyword("NON-FOCAL-PROOF-INDEX");
        $ic17$ = SubLObjectFactory.makeKeyword("RESTRICTED-NON-FOCAL-LINK-INDEX");
        $ic18$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic19$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic20$ = SubLObjectFactory.makeSymbol("S#30174", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic22$ = SubLObjectFactory.makeKeyword("END");
        $ic23$ = SubLObjectFactory.makeSymbol("S#30176", "CYC");
        $ic24$ = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $ic25$ = SubLObjectFactory.makeSymbol("S#27608", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("FREE");
        $ic27$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30274", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25415", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30275", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic28$ = SubLObjectFactory.makeUninternedSymbol("US#13A64D7");
        $ic29$ = SubLObjectFactory.makeUninternedSymbol("US#D2A5C4");
        $ic30$ = SubLObjectFactory.makeSymbol("CLET");
        $ic31$ = SubLObjectFactory.makeSymbol("S#30185", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic33$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic34$ = SubLObjectFactory.makeUninternedSymbol("US#13A64D7");
        $ic35$ = SubLObjectFactory.makeUninternedSymbol("US#D2A5C4");
        $ic36$ = SubLObjectFactory.makeSymbol("S#30186", "CYC");
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30276", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30275", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic39$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic40$ = SubLObjectFactory.makeKeyword("DONE");
        $ic41$ = SubLObjectFactory.makeUninternedSymbol("US#513E608");
        $ic42$ = SubLObjectFactory.makeUninternedSymbol("US#64015D3");
        $ic43$ = SubLObjectFactory.makeSymbol("S#25369", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#26808", "CYC");
        $ic45$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic46$ = SubLObjectFactory.makeKeyword("RESTRICTION");
        $ic47$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic48$ = SubLObjectFactory.makeSymbol("S#29305", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#27652", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30277", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30278", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic51$ = SubLObjectFactory.makeUninternedSymbol("US#64015D3");
        $ic52$ = SubLObjectFactory.makeUninternedSymbol("US#3B43535");
        $ic53$ = SubLObjectFactory.makeSymbol("S#25413", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
        $ic55$ = SubLObjectFactory.makeSymbol("S#29324", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#30181", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#30182", "CYC");
        $ic58$ = SubLObjectFactory.makeString("Could not find the tactic for ~a");
        $ic59$ = SubLObjectFactory.makeSymbol("S#29224", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#26816", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#27357", "CYC");
        $ic62$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic63$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic64$ = SubLObjectFactory.makeKeyword("NEG");
        $ic65$ = SubLObjectFactory.makeKeyword("POS");
        $ic66$ = SubLObjectFactory.makeKeyword("ANSWER");
        $ic67$ = SubLObjectFactory.makeKeyword("UNION");
        $ic68$ = SubLObjectFactory.makeSymbol("S#3502", "CYC");
        $ic69$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic70$ = SubLObjectFactory.makeKeyword("DOOMED");
        $ic71$ = SubLObjectFactory.makeSymbol("S#27896", "CYC");
        $ic72$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#30279", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30280", "CYC"));
        $ic73$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic74$ = SubLObjectFactory.makeSymbol("S#30226", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic76$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic77$ = SubLObjectFactory.makeSymbol("S#30230", "CYC");
        $ic78$ = SubLObjectFactory.makeString("Finding or creating a restricted problem of ~a requires bindings");
        $ic79$ = SubLObjectFactory.makeString("Creating a restricted problem of ~a requires bindings");
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#30183", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30184", "CYC"));
        $ic81$ = SubLObjectFactory.makeSymbol("S#30252", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic83$ = SubLObjectFactory.makeSymbol("S#18076", "CYC");
        $ic84$ = SubLObjectFactory.makeString("~a was a rejected proof");
        $ic85$ = SubLObjectFactory.makeSymbol("S#27819", "CYC");
        $ic86$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic88$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
    }
    
    public static final class $sX30161_native extends SubLStructNative
    {
        public SubLObject $focal_proof_index;
        public SubLObject $non_focal_proof_index;
        public SubLObject $restricted_non_focal_link_index;
        private static final SubLStructDeclNative structDecl;
        
        public $sX30161_native() {
            this.$focal_proof_index = (SubLObject)CommonSymbols.NIL;
            this.$non_focal_proof_index = (SubLObject)CommonSymbols.NIL;
            this.$restricted_non_focal_link_index = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX30161_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$focal_proof_index;
        }
        
        public SubLObject getField3() {
            return this.$non_focal_proof_index;
        }
        
        public SubLObject getField4() {
            return this.$restricted_non_focal_link_index;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$focal_proof_index = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$non_focal_proof_index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$restricted_non_focal_link_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX30161_native.class, module0381.$ic0$, module0381.$ic1$, module0381.$ic2$, module0381.$ic3$, new String[] { "$focal_proof_index", "$non_focal_proof_index", "$restricted_non_focal_link_index" }, module0381.$ic4$, module0381.$ic5$, module0381.$ic6$);
        }
    }
    
    public static final class $f27017$UnaryFunction extends UnaryFunction
    {
        public $f27017$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#30162"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0381.f27017(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0381.class
	Total time: 694 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/