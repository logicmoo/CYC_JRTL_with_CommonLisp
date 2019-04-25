package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0365 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0365";
    public static final String myFingerPrint = "213487d44135720ffaff71a41229b3a227c24569a37af8a53e77c315f9f3568b";
    public static SubLSymbol $g3137$;
    public static SubLSymbol $g3138$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
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
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
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
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLList $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    
    
    public static SubLObject f24817(final SubLObject var1, final SubLObject var2) {
        f24818(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24819(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX24101_native.class) ? T : NIL);
    }
    
    public static SubLObject f24820(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f24821(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f24822(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f24823(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f24824(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f24825(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f24826(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f24827(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f24828(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f24829(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f24830(final SubLObject var1) {
        assert NIL != f24819(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f24831(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f24832(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f24833(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f24834(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f24835(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f24836(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f24837(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f24838(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f24839(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f24840(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f24841(final SubLObject var1, final SubLObject var4) {
        assert NIL != f24819(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f24842(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX24101_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic32$)) {
                f24831(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic33$)) {
                f24832(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic34$)) {
                f24833(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic35$)) {
                f24834(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic36$)) {
                f24835(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic37$)) {
                f24836(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic38$)) {
                f24837(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic39$)) {
                f24838(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f24839(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f24840(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f24841(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic43$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f24843(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)ELEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic32$, f24820(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic33$, f24821(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic34$, f24822(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic35$, f24823(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic36$, f24824(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic37$, f24825(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic38$, f24826(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic39$, f24827(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic40$, f24828(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic41$, f24829(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic46$, (SubLObject)$ic42$, f24830(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic47$, (SubLObject)$ic45$, (SubLObject)ELEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f24844(final SubLObject var11, final SubLObject var12) {
        return f24843(var11, var12);
    }
    
    public static SubLObject f24845(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f24819(var13) && NIL == f24846(var13));
    }
    
    public static SubLObject f24847(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f24819(var13) && NIL != f24846(var13));
    }
    
    public static SubLObject f24846(final SubLObject var13) {
        return Equality.eq((SubLObject)$ic49$, f24848(var13));
    }
    
    public static SubLObject f24818(final SubLObject var14, final SubLObject var2, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != f24846(var14)) {
            PrintLow.format(var2, (SubLObject)$ic50$, f24849(var14));
        }
        else {
            final SubLObject var17 = f24850(var14);
            PrintLow.format(var2, (SubLObject)$ic51$, new SubLObject[] { f24851(var14), module0361.f23996(module0363.f24507(var17)), module0363.f24508(var17), f24849(var14), (NIL != $g3137$.getDynamicValue(var16) && NIL != module0373.f26163(var14)) ? NIL : f24852(var14), f24824(var14) });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24853(final SubLObject var14) {
        final SubLObject var15 = f24850(var14);
        if (NIL != module0363.f24504(var15)) {
            return Numbers.logxor(module0363.f24508(var15), f24849(var14));
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f24854(final SubLObject var17, final SubLObject var18, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        assert NIL != module0363.f24478(var17) : var17;
        assert NIL != module0340.f22789(var18) : var18;
        final SubLObject var20 = f24842((SubLObject)UNPROVIDED);
        final SubLObject var21 = module0363.f24610(var17);
        f24831(var20, var21);
        f24832(var20, var17);
        f24833(var20, module0360.f23923(var18));
        f24834(var20, var18);
        f24855(var20, (SubLObject)$ic55$);
        f24840(var20, (SubLObject)NIL);
        f24856(var20, var19);
        module0363.f24666(var17, var20);
        module0413.f28788();
        module0361.f24314(module0363.f24507(var17));
        return var20;
    }
    
    public static SubLObject f24857(final SubLObject var13) {
        if (NIL != f24845(var13)) {
            f24858(var13);
            f24859(var13);
            final SubLObject var14 = f24850(var13);
            f24860(var13);
            if (NIL != module0363.f24687(var14) && module0363.f24611(var14).isZero()) {
                if (NIL != module0363.f24646(var14)) {
                    Errors.error((SubLObject)$ic56$, var14);
                }
                else {
                    module0363.f24544(var14);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24861(final SubLObject var13) {
        final SubLObject var14 = f24850(var13);
        if (NIL != module0363.f24504(var14)) {
            module0363.f24667(var14, var13);
        }
        f24857(var13);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24858(final SubLObject var13) {
        final SubLObject var14 = f24862(var13);
        if (NIL != f24863(var14)) {
            f24864(var14);
            f24840(var13, (SubLObject)NIL);
        }
        return var13;
    }
    
    public static SubLObject f24860(final SubLObject var13) {
        f24841(var13, (SubLObject)$ic49$);
        f24840(var13, (SubLObject)$ic49$);
        f24835(var13, (SubLObject)$ic49$);
        f24836(var13, (SubLObject)$ic49$);
        f24837(var13, (SubLObject)$ic49$);
        f24838(var13, (SubLObject)$ic49$);
        f24834(var13, (SubLObject)$ic49$);
        f24832(var13, (SubLObject)$ic49$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24859(final SubLObject var13) {
        f24839(var13, (SubLObject)$ic49$);
        return var13;
    }
    
    public static SubLObject f24849(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        return f24820(var13);
    }
    
    public static SubLObject f24850(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        return f24821(var13);
    }
    
    public static SubLObject f24865(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        return f24823(var13);
    }
    
    public static SubLObject f24866(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        return f24822(var13);
    }
    
    public static SubLObject f24867(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        SubLObject var14 = f24824(var13);
        if (NIL != module0358.f23680(var14)) {
            var14 = module0358.f23691(var14);
        }
        return var14;
    }
    
    public static SubLObject f24868(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        final SubLObject var14 = f24824(var13);
        if (NIL != var14 && !areAssertionsDisabledFor(me) && NIL == module0358.f23680(var14)) {
            throw new AssertionError(var14);
        }
        return var14;
    }
    
    public static SubLObject f24869(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        return f24825(var13);
    }
    
    public static SubLObject f24852(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert NIL != f24819(var13) : var13;
        if (NIL != $g3137$.getDynamicValue(var14) && NIL != module0373.f26163(var13)) {
            return Errors.error((SubLObject)$ic58$, var13);
        }
        return f24826(var13);
    }
    
    public static SubLObject f24870(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert NIL != f24819(var13) : var13;
        if (NIL != $g3137$.getDynamicValue(var14) && NIL != module0373.f26163(var13)) {
            return Errors.error((SubLObject)$ic58$, var13);
        }
        return f24827(var13);
    }
    
    public static SubLObject f24848(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        return f24828(var13);
    }
    
    public static SubLObject f24862(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        return f24829(var13);
    }
    
    public static SubLObject f24871(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        return f24830(var13);
    }
    
    public static SubLObject f24872(final SubLObject var13, final SubLObject var23) {
        assert NIL != f24819(var13) : var13;
        assert NIL != module0360.f23925(var23) : var23;
        f24835(var13, var23);
        f24836(var13, (SubLObject)$ic60$);
        return var13;
    }
    
    public static SubLObject f24873(final SubLObject var13, final SubLObject var24, final SubLObject var25) {
        assert NIL != f24819(var13) : var13;
        assert NIL != module0358.f23680(var24) : var24;
        f24835(var13, var24);
        f24836(var13, var25);
        return var13;
    }
    
    public static SubLObject f24874(final SubLObject var13, final SubLObject var26, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)T;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        assert NIL != f24819(var13) : var13;
        assert NIL != module0360.f23933(var26) : var26;
        if (NIL != $g3137$.getDynamicValue(var28) && NIL != module0373.f26163(var13)) {
            return var13;
        }
        f24837(var13, var26);
        if (NIL != var27) {
            f24838(var13, var26);
        }
        return var13;
    }
    
    public static SubLObject f24855(final SubLObject var13, final SubLObject var28) {
        assert NIL != f24819(var13) : var13;
        assert NIL != module0360.f23921(var28) : var28;
        f24839(var13, var28);
        return var13;
    }
    
    public static SubLObject f24856(final SubLObject var13, final SubLObject var19) {
        assert NIL != f24819(var13) : var13;
        f24841(var13, var19);
        return var13;
    }
    
    public static SubLObject f24875(final SubLObject var13, final SubLObject var19) {
        assert NIL != module0380.f26995(var13) : var13;
        return f24856(var13, var19);
    }
    
    public static SubLObject f24876(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic64$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic64$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic64$);
        var35 = var32.first();
        var32 = var32.rest();
        if (NIL == var32) {
            final SubLObject var36;
            var32 = (var36 = var33);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic65$, (SubLObject)ConsesLow.list(var34, (SubLObject)ConsesLow.list((SubLObject)$ic66$, var35)), ConsesLow.append(var36, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic64$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24877(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic67$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic67$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic67$);
        var35 = var32.first();
        var32 = var32.rest();
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = var32;
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var43_44 = (SubLObject)NIL;
        while (NIL != var37) {
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)$ic67$);
            var43_44 = var37.first();
            var37 = var37.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var37, var31, (SubLObject)$ic67$);
            if (NIL == conses_high.member(var43_44, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var38 = (SubLObject)T;
            }
            if (var43_44 == $ic69$) {
                var36 = var37.first();
            }
            var37 = var37.rest();
        }
        if (NIL != var38 && NIL == var36) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic67$);
        }
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)$ic70$, var32);
        final SubLObject var40 = (SubLObject)((NIL != var39) ? conses_high.cadr(var39) : NIL);
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var32);
        final SubLObject var42 = (SubLObject)((NIL != var41) ? conses_high.cadr(var41) : NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic36$, var32);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)$ic71$, var32);
        final SubLObject var46 = (SubLObject)((NIL != var45) ? conses_high.cadr(var45) : NIL);
        final SubLObject var47 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var32);
        final SubLObject var48 = (SubLObject)((NIL != var47) ? conses_high.cadr(var47) : NIL);
        final SubLObject var49 = cdestructuring_bind.property_list_member((SubLObject)$ic34$, var32);
        final SubLObject var50 = (SubLObject)((NIL != var49) ? conses_high.cadr(var49) : NIL);
        final SubLObject var51 = cdestructuring_bind.property_list_member((SubLObject)$ic38$, var32);
        final SubLObject var52 = (SubLObject)((NIL != var51) ? conses_high.cadr(var51) : NIL);
        final SubLObject var53;
        var32 = (var53 = var33);
        final SubLObject var54 = (SubLObject)$ic72$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic73$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var54, var35)), (SubLObject)ConsesLow.list((SubLObject)$ic74$, (SubLObject)ConsesLow.list(new SubLObject[] { var34, ConsesLow.list((SubLObject)$ic66$, var54), $ic70$, var40, $ic40$, var42, $ic36$, var44, $ic71$, var46, $ic35$, var48, $ic34$, var50, $ic38$, var52 }), (SubLObject)ConsesLow.listS((SubLObject)$ic75$, (SubLObject)ConsesLow.list((SubLObject)EQ, var34, var54), ConsesLow.append(var53, (SubLObject)NIL))));
    }
    
    public static SubLObject f24878(final SubLObject var13) {
        return Values.values(module0361.f23996(f24879(var13)), module0363.f24508(f24850(var13)), f24849(var13));
    }
    
    public static SubLObject f24880(final SubLObject var17, final SubLObject var55) {
        assert NIL != module0363.f24478(var17) : var17;
        final SubLObject var56 = module0363.f24611(var17);
        final SubLObject var57 = module0048.f_1_(Numbers.subtract(var56, var55));
        if (NIL != module0004.f106(var57)) {
            final SubLObject var58 = module0363.f24517(var17);
            return ConsesLow.nth(var57, var58);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24881(final SubLObject var59, final SubLObject var60, final SubLObject var61) {
        final SubLObject var62 = module0361.f24238(var59, var60);
        if (NIL != var62) {
            final SubLObject var63 = f24880(var62, var61);
            return var63;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24851(final SubLObject var13) {
        return module0340.f22825(f24865(var13));
    }
    
    public static SubLObject f24882(final SubLObject var13) {
        return Equality.eq((SubLObject)$ic55$, f24848(var13));
    }
    
    public static SubLObject f24883(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f24882(var13) && NIL != f24863(f24862(var13)));
    }
    
    public static SubLObject f24884(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL == f24882(var13));
    }
    
    public static SubLObject f24885(final SubLObject var13) {
        return Equality.eq((SubLObject)$ic76$, f24848(var13));
    }
    
    public static SubLObject f24886(final SubLObject var13) {
        return Equality.eq((SubLObject)$ic77$, f24848(var13));
    }
    
    public static SubLObject f24887(final SubLObject var13, final SubLObject var62) {
        if (var62.eql((SubLObject)$ic78$)) {
            return (SubLObject)makeBoolean(NIL == f24886(var13));
        }
        if (var62.eql((SubLObject)$ic79$)) {
            return f24883(var13);
        }
        if (var62.eql((SubLObject)$ic80$)) {
            return (SubLObject)makeBoolean(NIL != f24885(var13) || NIL != f24883(var13));
        }
        return Equality.eq(var62, f24848(var13));
    }
    
    public static SubLObject f24888(final SubLObject var13) {
        return module0340.f22846(f24865(var13));
    }
    
    public static SubLObject f24879(final SubLObject var13) {
        return module0363.f24507(f24850(var13));
    }
    
    public static SubLObject f24889(final SubLObject var13) {
        final SubLObject var14 = f24850(var13);
        return module0363.f24509(var14);
    }
    
    public static SubLObject f24890(final SubLObject var13) {
        final SubLObject var14 = f24850(var13);
        return module0363.f24580(var14);
    }
    
    public static SubLObject f24891(final SubLObject var13, final SubLObject var63) {
        final SubLObject var64 = f24852(var13);
        f24874(var13, var63, (SubLObject)NIL);
        return var13;
    }
    
    public static SubLObject f24892(final SubLObject var13, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var66 = f24852(var13);
        SubLObject var67 = module0360.f23949(var66, var65);
        var67 = Numbers.max(var67, (SubLObject)ZERO_INTEGER);
        f24874(var13, var67, (SubLObject)NIL);
        return var67;
    }
    
    public static SubLObject f24893(final SubLObject var13) {
        f24855(var13, (SubLObject)$ic76$);
        module0413.f28790();
        return var13;
    }
    
    public static SubLObject f24894(final SubLObject var13) {
        if (NIL != f24845(var13)) {
            f24895(var13);
            f24855(var13, (SubLObject)$ic77$);
            module0413.f28792();
            module0367.f25236(var13);
        }
        return var13;
    }
    
    public static SubLObject f24896(final SubLObject var13, final SubLObject var21) {
        assert NIL != f24882(var13) : var13;
        assert NIL != f24863(var21) : var21;
        f24840(var13, var21);
        return var13;
    }
    
    public static SubLObject f24895(final SubLObject var13) {
        assert NIL != f24882(var13) : var13;
        f24858(var13);
        return var13;
    }
    
    public static SubLObject f24897(final SubLObject var13) {
        final SubLObject var14 = f24862(var13);
        SubLObject var15 = (SubLObject)NIL;
        try {
            if (NIL == module0052.f3687(var14)) {
                module0052.f3693(var14);
                var15 = (SubLObject)T;
            }
        }
        finally {
            final SubLObject var16 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if ((NIL == var15 || NIL != module0052.f3687(var14)) && NIL != f24882(var13)) {
                    f24895(var13);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var16);
            }
        }
        return var15;
    }
    
    public static SubLObject f24898(final SubLObject var13, final SubLObject var68) {
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        if (NIL != module0052.f3717(var68)) {
            var69 = module0052.f3720(var68);
        }
        if (NIL != var69) {
            var70 = module0360.f23935(var69);
        }
        if (NIL != module0360.f23933(var70)) {
            f24891(var13, var70);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24899(final SubLObject var58) {
        return module0035.f2378(var58, Symbols.symbol_function((SubLObject)$ic83$), (SubLObject)$ic84$);
    }
    
    public static SubLObject f24900(final SubLObject var58) {
        SubLObject var59 = (SubLObject)ZERO_INTEGER;
        SubLObject var60 = var58;
        SubLObject var61 = (SubLObject)NIL;
        var61 = var60.first();
        while (NIL != var60) {
            var59 = Numbers.add(var59, f24852(var61));
            var60 = var60.rest();
            var61 = var60.first();
        }
        return var59;
    }
    
    public static SubLObject f24901(final SubLObject var17) {
        SubLObject var18 = (SubLObject)ZERO_INTEGER;
        SubLObject var19 = module0363.f24517(var17);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            if (NIL != module0363.f24518(var20, (SubLObject)$ic55$)) {
                var18 = module0360.f23944(var18, f24852(var20));
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return var18;
    }
    
    public static SubLObject f24902(final SubLObject var17) {
        SubLObject var18 = module0048.f3326();
        SubLObject var19 = module0363.f24517(var17);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            if (NIL != module0363.f24518(var20, (SubLObject)$ic55$)) {
                final SubLObject var21 = f24852(var20);
                if (NIL != module0360.f23940(var21, var18)) {
                    var18 = var21;
                }
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return var18;
    }
    
    public static SubLObject f24903(final SubLObject var13) {
        assert NIL != f24819(var13) : var13;
        module0361.f24180(f24879(var13), var13);
        return var13;
    }
    
    public static SubLObject f24904(final SubLObject var72) {
        SubLObject var73 = (SubLObject)ZERO_INTEGER;
        final SubLObject var74 = module0361.f24128(var72);
        if (NIL == module0065.f4772(var74, (SubLObject)$ic85$)) {
            final SubLObject var74_75 = var74;
            if (NIL == module0065.f4775(var74_75, (SubLObject)$ic85$)) {
                final SubLObject var75 = module0065.f4740(var74_75);
                final SubLObject var76 = (SubLObject)NIL;
                SubLObject var77;
                SubLObject var78;
                SubLObject var79;
                SubLObject var80;
                SubLObject var81;
                SubLObject var82;
                for (var77 = Sequences.length(var75), var78 = (SubLObject)NIL, var78 = (SubLObject)ZERO_INTEGER; var78.numL(var77); var78 = Numbers.add(var78, (SubLObject)ONE_INTEGER)) {
                    var79 = ((NIL != var76) ? Numbers.subtract(var77, var78, (SubLObject)ONE_INTEGER) : var78);
                    var80 = Vectors.aref(var75, var79);
                    if (NIL == module0065.f4749(var80) || NIL == module0065.f4773((SubLObject)$ic85$)) {
                        if (NIL != module0065.f4749(var80)) {
                            var80 = (SubLObject)$ic85$;
                        }
                        var81 = module0363.f24517(var80);
                        var82 = (SubLObject)NIL;
                        var82 = var81.first();
                        while (NIL != var81) {
                            var73 = Numbers.add(var73, f24905(var82));
                            var81 = var81.rest();
                            var82 = var81.first();
                        }
                    }
                }
            }
            final SubLObject var81_82 = var74;
            if (NIL == module0065.f4777(var81_82)) {
                final SubLObject var83 = module0065.f4738(var81_82);
                SubLObject var84 = (SubLObject)NIL;
                SubLObject var85 = (SubLObject)NIL;
                final Iterator var86 = Hashtables.getEntrySetIterator(var83);
                try {
                    while (Hashtables.iteratorHasNext(var86)) {
                        final Map.Entry var87 = Hashtables.iteratorNextEntry(var86);
                        var84 = Hashtables.getEntryKey(var87);
                        var85 = Hashtables.getEntryValue(var87);
                        SubLObject var88 = module0363.f24517(var85);
                        SubLObject var89 = (SubLObject)NIL;
                        var89 = var88.first();
                        while (NIL != var88) {
                            var73 = Numbers.add(var73, f24905(var89));
                            var88 = var88.rest();
                            var89 = var88.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var86);
                }
            }
        }
        return var73;
    }
    
    public static SubLObject f24905(final SubLObject var13) {
        if (NIL != module0373.f26176(var13)) {
            return Numbers.round(module0360.f23936(module0373.f26182(var13)), (SubLObject)UNPROVIDED);
        }
        if (NIL != f24885(var13)) {
            return (SubLObject)ONE_INTEGER;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f24863(final SubLObject var14) {
        return module0052.f3674(var14);
    }
    
    public static SubLObject f24906(final SubLObject var86, final SubLObject var13, final SubLObject var87) {
        return module0052.f3689(f24907(var86, var13, var87), (SubLObject)$ic86$, (SubLObject)$ic87$, (SubLObject)$ic88$);
    }
    
    public static SubLObject f24907(final SubLObject var86, final SubLObject var13, final SubLObject var87) {
        return (SubLObject)ConsesLow.list(var87, var86, var13);
    }
    
    public static SubLObject f24908(final SubLObject var89) {
        SubLObject var88_92 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var89, (SubLObject)$ic89$);
        var88_92 = var89.first();
        SubLObject var92 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var92, var89, (SubLObject)$ic89$);
        var90 = var92.first();
        var92 = var92.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var92, var89, (SubLObject)$ic89$);
        var91 = var92.first();
        var92 = var92.rest();
        if (NIL == var92) {
            final SubLObject var93 = var90;
            if (var93.eql((SubLObject)$ic90$)) {
                return Types.sublisp_null(var88_92);
            }
            if (var93.eql((SubLObject)$ic91$)) {
                SubLObject var95_96;
                final SubLObject var93_94 = var95_96 = var88_92;
                SubLObject var94 = (SubLObject)NIL;
                SubLObject var95 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var95_96, var93_94, (SubLObject)$ic92$);
                var94 = var95_96.first();
                var95_96 = var95_96.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var95_96, var93_94, (SubLObject)$ic92$);
                var95 = var95_96.first();
                var95_96 = var95_96.rest();
                if (NIL == var95_96) {
                    return module0052.f3687(var94);
                }
                cdestructuring_bind.cdestructuring_bind_error(var93_94, (SubLObject)$ic92$);
            }
            else {
                if (var93.eql((SubLObject)$ic93$)) {
                    return Types.sublisp_null(var88_92);
                }
                if (var93.eql((SubLObject)$ic94$)) {
                    return module0052.f3687(var88_92);
                }
                if (var93.eql((SubLObject)$ic95$)) {
                    return Types.sublisp_null(var88_92);
                }
                if (var93.eql((SubLObject)$ic96$)) {
                    return module0380.f27004(var91);
                }
                return Errors.error((SubLObject)$ic97$, var90);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)$ic89$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24909(final SubLObject var89) {
        SubLObject var88_100 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var89, (SubLObject)$ic89$);
        var88_100 = var89.first();
        SubLObject var92 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var92, var89, (SubLObject)$ic89$);
        var90 = var92.first();
        var92 = var92.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var92, var89, (SubLObject)$ic89$);
        var91 = var92.first();
        var92 = var92.rest();
        if (NIL == var92) {
            final SubLObject var93 = var90;
            if (var93.eql((SubLObject)$ic90$)) {
                final SubLObject var94 = var88_100.first();
                final SubLObject var95 = var88_100.rest();
                ConsesLow.rplaca(var89, var95);
                final SubLObject var96 = module0376.f26689(var91, var94);
                return Values.values(var96, var89);
            }
            if (var93.eql((SubLObject)$ic91$)) {
                SubLObject var106_107;
                final SubLObject var104_105 = var106_107 = var88_100;
                SubLObject var97 = (SubLObject)NIL;
                SubLObject var98 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var106_107, var104_105, (SubLObject)$ic98$);
                var97 = var106_107.first();
                var106_107 = var106_107.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var106_107, var104_105, (SubLObject)$ic98$);
                var98 = var106_107.first();
                var106_107 = var106_107.rest();
                if (NIL == var106_107) {
                    final SubLObject var99 = module0376.f26694(var91, var97, var98);
                    return Values.values(var99, var89);
                }
                cdestructuring_bind.cdestructuring_bind_error(var104_105, (SubLObject)$ic98$);
            }
            else {
                if (var93.eql((SubLObject)$ic93$)) {
                    final SubLObject var94 = var88_100.first();
                    final SubLObject var95 = var88_100.rest();
                    ConsesLow.rplaca(var89, var95);
                    final SubLObject var96 = module0376.f26642(var91, var94);
                    return Values.values(var96, var89);
                }
                if (var93.eql((SubLObject)$ic94$)) {
                    final SubLObject var100 = module0376.f26639(var91, var88_100);
                    return Values.values(var100, var89);
                }
                if (var93.eql((SubLObject)$ic95$)) {
                    final SubLObject var101 = var88_100.first();
                    final SubLObject var95 = var88_100.rest();
                    ConsesLow.rplaca(var89, var95);
                    final SubLObject var96 = module0377.f26806(var91, var101);
                    return Values.values(var96, var89);
                }
                if (var93.eql((SubLObject)$ic96$)) {
                    module0380.f27007(var91);
                    return Values.values((SubLObject)NIL, var89);
                }
                return Errors.error((SubLObject)$ic99$, var90);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)$ic89$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24910(final SubLObject var89) {
        SubLObject var88_112 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var89, (SubLObject)$ic89$);
        var88_112 = var89.first();
        SubLObject var92 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var92, var89, (SubLObject)$ic89$);
        var90 = var92.first();
        var92 = var92.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var92, var89, (SubLObject)$ic89$);
        var91 = var92.first();
        var92 = var92.rest();
        if (NIL == var92) {
            final SubLObject var93 = var90;
            if (var93.eql((SubLObject)$ic90$)) {
                return (SubLObject)T;
            }
            if (var93.eql((SubLObject)$ic91$)) {
                SubLObject var115_116;
                final SubLObject var113_114 = var115_116 = var88_112;
                SubLObject var94 = (SubLObject)NIL;
                SubLObject var95 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var115_116, var113_114, (SubLObject)$ic98$);
                var94 = var115_116.first();
                var115_116 = var115_116.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var115_116, var113_114, (SubLObject)$ic98$);
                var95 = var115_116.first();
                var115_116 = var115_116.rest();
                if (NIL == var115_116) {
                    return module0052.f3696(var94);
                }
                cdestructuring_bind.cdestructuring_bind_error(var113_114, (SubLObject)$ic98$);
            }
            else {
                if (var93.eql((SubLObject)$ic93$)) {
                    return (SubLObject)T;
                }
                if (var93.eql((SubLObject)$ic94$)) {
                    return module0052.f3696(var88_112);
                }
                if (var93.eql((SubLObject)$ic95$)) {
                    return (SubLObject)T;
                }
                if (var93.eql((SubLObject)$ic96$)) {
                    return (SubLObject)T;
                }
                return Errors.error((SubLObject)$ic100$, var90);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)$ic89$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24864(final SubLObject var21) {
        assert NIL != f24863(var21) : var21;
        module0052.f3696(var21);
        return var21;
    }
    
    public static SubLObject f24911() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24817", "S#27728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24819", "S#26790", 1, 0, false);
        new $f24819$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24820", "S#27729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24821", "S#27730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24822", "S#27731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24823", "S#27732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24824", "S#27733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24825", "S#27734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24826", "S#27735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24827", "S#27736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24828", "S#27737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24829", "S#27738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24830", "S#27739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24831", "S#27740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24832", "S#27741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24833", "S#27742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24834", "S#27743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24835", "S#27744", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24836", "S#27745", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24837", "S#27746", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24838", "S#27747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24839", "S#27748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24840", "S#27749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24841", "S#27750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24842", "S#27751", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24843", "S#27752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24844", "S#27753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24845", "S#27754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24847", "S#27755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24846", "S#27756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24818", "S#27757", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24853", "S#27712", 1, 0, false);
        new $f24853$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24854", "S#27758", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24857", "S#27360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24861", "S#27759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24858", "S#27760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24860", "S#27761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24859", "S#27762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24849", "S#27372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24850", "S#27763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24865", "TACTIC-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24866", "S#27354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24867", "S#27337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24868", "S#27338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24869", "S#27764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24852", "S#27339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24870", "S#27379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24848", "S#27765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24862", "S#27766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24871", "S#27767", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24872", "S#27768", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24873", "S#27769", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24874", "S#27770", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24855", "S#27771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24856", "S#27772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24875", "S#27773", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0365", "f24876", "S#27774");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0365", "f24877", "S#27775");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24878", "S#27776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24880", "S#27777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24881", "S#27778", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24851", "TACTIC-HL-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24882", "S#27583", 1, 0, false);
        new $f24882$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24883", "S#27375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24884", "S#27779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24885", "S#27584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24886", "S#27377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24887", "S#27336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24888", "S#27376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24879", "S#27780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24889", "S#27781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24890", "S#27782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24891", "S#27783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24892", "S#27784", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24893", "S#27785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24894", "S#27786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24896", "S#27787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24895", "S#27788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24897", "S#27789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24898", "S#27790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24899", "S#27791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24900", "S#27792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24901", "S#27793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24902", "S#27794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24903", "S#27795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24904", "S#27796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24905", "S#27797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24863", "S#27798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24906", "S#27799", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24907", "S#27800", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24908", "S#27719", 1, 0, false);
        new $f24908$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24909", "S#27726", 1, 0, false);
        new $f24909$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24910", "S#27727", 1, 0, false);
        new $f24910$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0365", "f24864", "S#27801", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24912() {
        $g3137$ = SubLFiles.defvar("S#27802", (SubLObject)NIL);
        $g3138$ = SubLFiles.defconstant("S#27803", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f24913() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3138$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Structures.def_csetf((SubLObject)$ic26$, (SubLObject)$ic27$);
        Structures.def_csetf((SubLObject)$ic28$, (SubLObject)$ic29$);
        Structures.def_csetf((SubLObject)$ic30$, (SubLObject)$ic31$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3138$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic48$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g3138$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic52$));
        module0012.f419((SubLObject)$ic86$);
        module0012.f419((SubLObject)$ic87$);
        module0012.f419((SubLObject)$ic88$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f24911();
    }
    
    public void initializeVariables() {
        f24912();
    }
    
    public void runTopLevelForms() {
        f24913();
    }
    
    static {
        me = (SubLFile)new module0365();
        $g3137$ = null;
        $g3138$ = null;
        $ic0$ = makeSymbol("S#24101", "CYC");
        $ic1$ = makeSymbol("S#26790", "CYC");
        $ic2$ = makeInteger(210);
        $ic3$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#10593", "CYC"), makeSymbol("S#24274", "CYC"), makeSymbol("TYPE"), makeSymbol("S#14781", "CYC"), makeSymbol("S#25691", "CYC"), makeSymbol("S#27804", "CYC"), makeSymbol("S#26071", "CYC"), makeSymbol("S#27805", "CYC"), makeSymbol("S#5846", "CYC"), makeSymbol("S#27806", "CYC"), makeSymbol("S#1625", "CYC") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("SUID"), makeKeyword("PROBLEM"), makeKeyword("TYPE"), makeKeyword("HL-MODULE"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"), makeKeyword("ORIGINAL-PRODUCTIVITY"), makeKeyword("STATUS"), makeKeyword("PROGRESS-ITERATOR"), makeKeyword("DATA") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#27729", "CYC"), makeSymbol("S#27730", "CYC"), makeSymbol("S#27731", "CYC"), makeSymbol("S#27732", "CYC"), makeSymbol("S#27733", "CYC"), makeSymbol("S#27734", "CYC"), makeSymbol("S#27735", "CYC"), makeSymbol("S#27736", "CYC"), makeSymbol("S#27737", "CYC"), makeSymbol("S#27738", "CYC"), makeSymbol("S#27739", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#27740", "CYC"), makeSymbol("S#27741", "CYC"), makeSymbol("S#27742", "CYC"), makeSymbol("S#27743", "CYC"), makeSymbol("S#27744", "CYC"), makeSymbol("S#27745", "CYC"), makeSymbol("S#27746", "CYC"), makeSymbol("S#27747", "CYC"), makeSymbol("S#27748", "CYC"), makeSymbol("S#27749", "CYC"), makeSymbol("S#27750", "CYC") });
        $ic7$ = makeSymbol("S#27757", "CYC");
        $ic8$ = makeSymbol("S#27728", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#26790", "CYC"));
        $ic10$ = makeSymbol("S#27729", "CYC");
        $ic11$ = makeSymbol("S#27740", "CYC");
        $ic12$ = makeSymbol("S#27730", "CYC");
        $ic13$ = makeSymbol("S#27741", "CYC");
        $ic14$ = makeSymbol("S#27731", "CYC");
        $ic15$ = makeSymbol("S#27742", "CYC");
        $ic16$ = makeSymbol("S#27732", "CYC");
        $ic17$ = makeSymbol("S#27743", "CYC");
        $ic18$ = makeSymbol("S#27733", "CYC");
        $ic19$ = makeSymbol("S#27744", "CYC");
        $ic20$ = makeSymbol("S#27734", "CYC");
        $ic21$ = makeSymbol("S#27745", "CYC");
        $ic22$ = makeSymbol("S#27735", "CYC");
        $ic23$ = makeSymbol("S#27746", "CYC");
        $ic24$ = makeSymbol("S#27736", "CYC");
        $ic25$ = makeSymbol("S#27747", "CYC");
        $ic26$ = makeSymbol("S#27737", "CYC");
        $ic27$ = makeSymbol("S#27748", "CYC");
        $ic28$ = makeSymbol("S#27738", "CYC");
        $ic29$ = makeSymbol("S#27749", "CYC");
        $ic30$ = makeSymbol("S#27739", "CYC");
        $ic31$ = makeSymbol("S#27750", "CYC");
        $ic32$ = makeKeyword("SUID");
        $ic33$ = makeKeyword("PROBLEM");
        $ic34$ = makeKeyword("TYPE");
        $ic35$ = makeKeyword("HL-MODULE");
        $ic36$ = makeKeyword("COMPLETENESS");
        $ic37$ = makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");
        $ic38$ = makeKeyword("PRODUCTIVITY");
        $ic39$ = makeKeyword("ORIGINAL-PRODUCTIVITY");
        $ic40$ = makeKeyword("STATUS");
        $ic41$ = makeKeyword("PROGRESS-ITERATOR");
        $ic42$ = makeKeyword("DATA");
        $ic43$ = makeString("Invalid slot ~S for construction function");
        $ic44$ = makeKeyword("BEGIN");
        $ic45$ = makeSymbol("S#27751", "CYC");
        $ic46$ = makeKeyword("SLOT");
        $ic47$ = makeKeyword("END");
        $ic48$ = makeSymbol("S#27753", "CYC");
        $ic49$ = makeKeyword("FREE");
        $ic50$ = makeString("<Invalid TACTIC ~s>");
        $ic51$ = makeString("<~a TACTIC ~a.~a.~a:(~a ~a)>");
        $ic52$ = makeSymbol("S#27712", "CYC");
        $ic53$ = makeSymbol("S#26082", "CYC");
        $ic54$ = makeSymbol("S#14902", "CYC");
        $ic55$ = makeKeyword("POSSIBLE");
        $ic56$ = makeString("proofy problem ~a is possible but has no tactics");
        $ic57$ = makeSymbol("S#26357", "CYC");
        $ic58$ = makeString("tactical productivity being referenced on ~S");
        $ic59$ = makeSymbol("S#26617", "CYC");
        $ic60$ = makeString("");
        $ic61$ = makeSymbol("S#26625", "CYC");
        $ic62$ = makeSymbol("S#26613", "CYC");
        $ic63$ = makeSymbol("S#27714", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24185", "CYC"), (SubLObject)makeSymbol("S#24101", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic65$ = makeSymbol("S#27450", "CYC");
        $ic66$ = makeSymbol("S#27763", "CYC");
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { makeSymbol("S#27807", "CYC"), makeSymbol("S#24101", "CYC"), makeSymbol("&KEY"), makeSymbol("S#127", "CYC"), makeSymbol("S#5846", "CYC"), makeSymbol("S#25691", "CYC"), makeSymbol("S#26474", "CYC"), makeSymbol("S#14781", "CYC"), makeSymbol("TYPE"), makeSymbol("S#26071", "CYC") }), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("STATUS"), (SubLObject)makeKeyword("COMPLETENESS"), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("HL-MODULE"), (SubLObject)makeKeyword("TYPE"), (SubLObject)makeKeyword("PRODUCTIVITY"));
        $ic69$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic70$ = makeKeyword("DONE");
        $ic71$ = makeKeyword("PREFERENCE-LEVEL");
        $ic72$ = makeUninternedSymbol("US#6B70E19");
        $ic73$ = makeSymbol("CLET");
        $ic74$ = makeSymbol("DO-PROBLEM-TACTICS");
        $ic75$ = makeSymbol("PUNLESS");
        $ic76$ = makeKeyword("EXECUTED");
        $ic77$ = makeKeyword("DISCARDED");
        $ic78$ = makeKeyword("NON-DISCARDED");
        $ic79$ = makeKeyword("IN-PROGRESS");
        $ic80$ = makeKeyword("EXECUTED-OR-IN-PROGRESS");
        $ic81$ = makeSymbol("S#27583", "CYC");
        $ic82$ = makeSymbol("S#27798", "CYC");
        $ic83$ = makeSymbol("<");
        $ic84$ = makeSymbol("S#27339", "CYC");
        $ic85$ = makeKeyword("SKIP");
        $ic86$ = makeSymbol("S#27719", "CYC");
        $ic87$ = makeSymbol("S#27726", "CYC");
        $ic88$ = makeSymbol("S#27727", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("S#27808", "CYC"), (SubLObject)makeSymbol("S#24101", "CYC"));
        $ic90$ = makeKeyword("REMOVAL-EXPAND");
        $ic91$ = makeKeyword("REMOVAL-OUTPUT-GENERATE");
        $ic92$ = ConsesLow.list((SubLObject)makeSymbol("S#27809", "CYC"), (SubLObject)makeSymbol("S#713", "CYC"));
        $ic93$ = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");
        $ic94$ = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");
        $ic95$ = makeKeyword("TRANSFORMATION-RULE-SELECT");
        $ic96$ = makeKeyword("META-STRUCTURAL");
        $ic97$ = makeString("Time to implement tactic-progress-done? for ~S");
        $ic98$ = ConsesLow.list((SubLObject)makeSymbol("S#27809", "CYC"), (SubLObject)makeSymbol("S#27810", "CYC"));
        $ic99$ = makeString("Time to implement tactic-progress-next for ~S");
        $ic100$ = makeString("Time to implement tactic-progress-finalize for ~S");
    }
    
    public static final class $sX24101_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $problem;
        public SubLObject $type;
        public SubLObject $hl_module;
        public SubLObject $completeness;
        public SubLObject $preference_level_justification;
        public SubLObject $productivity;
        public SubLObject $original_productivity;
        public SubLObject $status;
        public SubLObject $progress_iterator;
        public SubLObject $data;
        private static final SubLStructDeclNative structDecl;
        
        public $sX24101_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$problem = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$completeness = (SubLObject)CommonSymbols.NIL;
            this.$preference_level_justification = (SubLObject)CommonSymbols.NIL;
            this.$productivity = (SubLObject)CommonSymbols.NIL;
            this.$original_productivity = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$progress_iterator = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX24101_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$problem;
        }
        
        public SubLObject getField4() {
            return this.$type;
        }
        
        public SubLObject getField5() {
            return this.$hl_module;
        }
        
        public SubLObject getField6() {
            return this.$completeness;
        }
        
        public SubLObject getField7() {
            return this.$preference_level_justification;
        }
        
        public SubLObject getField8() {
            return this.$productivity;
        }
        
        public SubLObject getField9() {
            return this.$original_productivity;
        }
        
        public SubLObject getField10() {
            return this.$status;
        }
        
        public SubLObject getField11() {
            return this.$progress_iterator;
        }
        
        public SubLObject getField12() {
            return this.$data;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$problem = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$completeness = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$preference_level_justification = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$productivity = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$original_productivity = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$progress_iterator = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX24101_native.class, $ic0$, $ic1$, $ic3$, $ic4$, new String[] { "$suid", "$problem", "$type", "$hl_module", "$completeness", "$preference_level_justification", "$productivity", "$original_productivity", "$status", "$progress_iterator", "$data" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f24819$UnaryFunction extends UnaryFunction
    {
        public $f24819$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26790"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24819(var3);
        }
    }
    
    public static final class $f24853$UnaryFunction extends UnaryFunction
    {
        public $f24853$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27712"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24853(var3);
        }
    }
    
    public static final class $f24882$UnaryFunction extends UnaryFunction
    {
        public $f24882$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27583"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24882(var3);
        }
    }
    
    public static final class $f24908$UnaryFunction extends UnaryFunction
    {
        public $f24908$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27719"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24908(var3);
        }
    }
    
    public static final class $f24909$UnaryFunction extends UnaryFunction
    {
        public $f24909$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27726"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24909(var3);
        }
    }
    
    public static final class $f24910$UnaryFunction extends UnaryFunction
    {
        public $f24910$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27727"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f24910(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 370 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/