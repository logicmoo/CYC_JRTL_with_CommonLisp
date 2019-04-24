package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0071 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0071";
    public static final String myFingerPrint = "432f730c828fdccb34931aaf1543d2267c61c8c9e999021f55de4958c7cbb9e2";
    public static SubLSymbol $g1105$;
    private static SubLSymbol $g1106$;
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
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    
    
    public static SubLObject f5016(final SubLObject var1, final SubLObject var2) {
        f5017(var1, var2, (SubLObject)module0071.ZERO_INTEGER);
        return (SubLObject)module0071.NIL;
    }
    
    public static SubLObject f5018(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX6591_native.class) ? module0071.T : module0071.NIL);
    }
    
    public static SubLObject f5019(final SubLObject var1) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f5020(final SubLObject var1) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f5021(final SubLObject var1) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f5022(final SubLObject var1) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f5023(final SubLObject var1) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f5024(final SubLObject var1) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f5025(final SubLObject var1) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f5026(final SubLObject var1, final SubLObject var4) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f5027(final SubLObject var1, final SubLObject var4) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f5028(final SubLObject var1, final SubLObject var4) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f5029(final SubLObject var1, final SubLObject var4) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f5030(final SubLObject var1, final SubLObject var4) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f5031(final SubLObject var1, final SubLObject var4) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f5032(final SubLObject var1, final SubLObject var4) {
        assert module0071.NIL != f5018(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f5033(SubLObject var5) {
        if (var5 == module0071.UNPROVIDED) {
            var5 = (SubLObject)module0071.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX6591_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0071.NIL, var7 = var5; module0071.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0071.$ic23$)) {
                f5026(var6, var9);
            }
            else if (var10.eql((SubLObject)module0071.$ic24$)) {
                f5027(var6, var9);
            }
            else if (var10.eql((SubLObject)module0071.$ic25$)) {
                f5028(var6, var9);
            }
            else if (var10.eql((SubLObject)module0071.$ic26$)) {
                f5029(var6, var9);
            }
            else if (var10.eql((SubLObject)module0071.$ic27$)) {
                f5030(var6, var9);
            }
            else if (var10.eql((SubLObject)module0071.$ic28$)) {
                f5031(var6, var9);
            }
            else if (var10.eql((SubLObject)module0071.$ic29$)) {
                f5032(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0071.$ic30$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f5034(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic31$, (SubLObject)module0071.$ic32$, (SubLObject)module0071.SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic33$, (SubLObject)module0071.$ic23$, f5019(var11));
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic33$, (SubLObject)module0071.$ic24$, f5020(var11));
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic33$, (SubLObject)module0071.$ic25$, f5021(var11));
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic33$, (SubLObject)module0071.$ic26$, f5022(var11));
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic33$, (SubLObject)module0071.$ic27$, f5023(var11));
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic33$, (SubLObject)module0071.$ic28$, f5024(var11));
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic33$, (SubLObject)module0071.$ic29$, f5025(var11));
        Functions.funcall(var12, var11, (SubLObject)module0071.$ic34$, (SubLObject)module0071.$ic32$, (SubLObject)module0071.SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f5035(final SubLObject var11, final SubLObject var12) {
        return f5034(var11, var12);
    }
    
    public static SubLObject f5017(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0071.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0071.$ic36$, var2, (SubLObject)module0071.UNPROVIDED, (SubLObject)module0071.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0071.$ic37$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            streams_high.write_string((SubLObject)module0071.$ic38$, var2, (SubLObject)module0071.UNPROVIDED, (SubLObject)module0071.UNPROVIDED);
            print_high.princ(module0030.f1592(f5036(var13)), var2);
            streams_high.write_string((SubLObject)module0071.$ic39$, var2, (SubLObject)module0071.UNPROVIDED, (SubLObject)module0071.UNPROVIDED);
            streams_high.write_string((SubLObject)module0071.$ic40$, var2, (SubLObject)module0071.UNPROVIDED, (SubLObject)module0071.UNPROVIDED);
            print_high.princ(f5037(var13), var2);
            if (module0071.NIL != f5038(var13)) {
                streams_high.write_string((SubLObject)module0071.$ic41$, var2, (SubLObject)module0071.UNPROVIDED, (SubLObject)module0071.UNPROVIDED);
                print_high.princ(f5038(var13), var2);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0071.$ic37$, var2, module0071.$ic42$, module0071.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f5039(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)module0071.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0071.$ic43$);
        var24 = var23.first();
        final SubLObject var25;
        var23 = (var25 = var23.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0071.$ic44$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0071.$ic15$, var24)), ConsesLow.append(var25, (SubLObject)module0071.NIL));
    }
    
    public static SubLObject f5040() {
        return module0057.f4173((SubLObject)module0071.UNPROVIDED, (SubLObject)module0071.UNPROVIDED, (SubLObject)module0071.UNPROVIDED);
    }
    
    public static SubLObject f5041(final SubLObject var24) {
        final SubLObject var25 = f5021(var24);
        return module0057.f4174(var25);
    }
    
    public static SubLObject f5042(final SubLObject var24) {
        final SubLObject var25 = f5021(var24);
        return module0057.f4175(var25);
    }
    
    public static SubLObject f5043(final SubLObject var27, final SubLObject var28) {
        return module0067.f4880(var27, var28);
    }
    
    public static SubLObject f5044(final SubLObject var24) {
        final SubLObject var25 = f5023(var24);
        return module0067.f4881(var25);
    }
    
    public static SubLObject f5045(final SubLObject var24) {
        final SubLObject var25 = f5023(var24);
        if (module0071.NIL != module0067.f4852(var25)) {
            return (SubLObject)module0071.$ic45$;
        }
        return (SubLObject)module0071.$ic46$;
    }
    
    public static SubLObject f5046(final SubLObject var24) {
        final SubLObject var25 = f5023(var24);
        return module0067.f4861(var25);
    }
    
    public static SubLObject f5047(final SubLObject var24, final SubLObject var30, final SubLObject var13) {
        final SubLObject var31 = f5023(var24);
        return module0067.f4886(var31, var30, var13);
    }
    
    public static SubLObject f5048(final SubLObject var24, final SubLObject var30, final SubLObject var31) {
        final SubLObject var32 = f5023(var24);
        return module0067.f4884(var32, var30, var31);
    }
    
    public static SubLObject f5049(final SubLObject var24, final SubLObject var30) {
        final SubLObject var31 = f5023(var24);
        return module0067.f4887(var31, var30);
    }
    
    public static SubLObject f5050(final SubLObject var27, final SubLObject var28) {
        return module0067.f4880(var27, var28);
    }
    
    public static SubLObject f5051(final SubLObject var24) {
        final SubLObject var25 = f5024(var24);
        return module0067.f4881(var25);
    }
    
    public static SubLObject f5052(final SubLObject var24) {
        final SubLObject var25 = f5024(var24);
        if (module0071.NIL != module0067.f4852(var25)) {
            return (SubLObject)module0071.$ic45$;
        }
        return (SubLObject)module0071.$ic46$;
    }
    
    public static SubLObject f5053(final SubLObject var24, final SubLObject var13, final SubLObject var30) {
        final SubLObject var31 = f5024(var24);
        return module0067.f4886(var31, var13, var30);
    }
    
    public static SubLObject f5054(final SubLObject var24, final SubLObject var13, final SubLObject var31) {
        final SubLObject var32 = f5024(var24);
        return module0067.f4884(var32, var13, var31);
    }
    
    public static SubLObject f5055(final SubLObject var24, final SubLObject var13) {
        final SubLObject var25 = f5024(var24);
        return module0067.f4887(var25, var13);
    }
    
    public static SubLObject f5056(final SubLObject var13) {
        return module0004.f106(var13);
    }
    
    public static SubLObject f5057(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0071.NIL == f5056(var13));
    }
    
    public static SubLObject f5058(SubLObject var27, SubLObject var28, SubLObject var33) {
        if (var27 == module0071.UNPROVIDED) {
            var27 = Symbols.symbol_function((SubLObject)module0071.EQL);
        }
        if (var28 == module0071.UNPROVIDED) {
            var28 = (SubLObject)module0071.NIL;
        }
        if (var33 == module0071.UNPROVIDED) {
            var33 = (SubLObject)module0071.NIL;
        }
        assert module0071.NIL != module0030.f1591(var27) : var27;
        if (module0071.NIL != var28 && !module0071.areAssertionsDisabledFor(me) && module0071.NIL == module0004.f106(var28)) {
            throw new AssertionError(var28);
        }
        if (module0071.NIL != var33) {
            assert module0071.NIL != module0004.f106(var33) : var33;
            var33 = (SubLObject)module0071.NIL;
        }
        final SubLObject var34 = f5033((SubLObject)module0071.UNPROVIDED);
        f5026(var34, module0030.f1592(var27));
        f5027(var34, var33);
        f5059(var34, var28);
        return var34;
    }
    
    public static SubLObject f5060(final SubLObject var24) {
        assert module0071.NIL != f5018(var24) : var24;
        return f5061(var24);
    }
    
    public static SubLObject f5059(final SubLObject var24, SubLObject var28) {
        if (module0071.NIL == var28) {
            var28 = module0071.$g1106$.getGlobalValue();
        }
        final SubLObject var29 = f5036(var24);
        f5028(var24, f5040());
        f5029(var24, Locks.make_lock((SubLObject)module0071.$ic50$));
        f5030(var24, f5043(var29, var28));
        f5031(var24, f5050(var29, var28));
        return var24;
    }
    
    public static SubLObject f5061(final SubLObject var24) {
        final SubLObject var25 = f5022(var24);
        SubLObject var26 = (SubLObject)module0071.NIL;
        try {
            var26 = Locks.seize_lock(var25);
            f5041(var24);
            f5044(var24);
            f5051(var24);
        }
        finally {
            if (module0071.NIL != var26) {
                Locks.release_lock(var25);
            }
        }
        return var24;
    }
    
    public static SubLObject f5036(final SubLObject var24) {
        assert module0071.NIL != f5018(var24) : var24;
        return f5019(var24);
    }
    
    public static SubLObject f5062(final SubLObject var24) {
        assert module0071.NIL != f5018(var24) : var24;
        return f5020(var24);
    }
    
    public static SubLObject f5037(final SubLObject var24) {
        assert module0071.NIL != f5018(var24) : var24;
        return f5046(var24);
    }
    
    public static SubLObject f5038(final SubLObject var24) {
        assert module0071.NIL != f5018(var24) : var24;
        return f5025(var24);
    }
    
    public static SubLObject f5063(final SubLObject var24, final SubLObject var30, SubLObject var31) {
        if (var31 == module0071.UNPROVIDED) {
            var31 = (SubLObject)module0071.NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0071.NIL != f5018(var24) : var24;
        assert module0071.NIL != f5056(var30) : var30;
        SubLObject var33 = (SubLObject)module0071.NIL;
        SubLObject var34 = (SubLObject)module0071.NIL;
        final SubLObject var35 = f5022(var24);
        SubLObject var36 = (SubLObject)module0071.NIL;
        try {
            var36 = Locks.seize_lock(var35);
            var32.resetMultipleValues();
            final SubLObject var39_40 = f5048(var24, var30, var31);
            final SubLObject var41_42 = var32.secondMultipleValue();
            var32.resetMultipleValues();
            var33 = var39_40;
            var34 = var41_42;
        }
        finally {
            if (module0071.NIL != var36) {
                Locks.release_lock(var35);
            }
        }
        return Values.values(var33, var34);
    }
    
    public static SubLObject f5064(final SubLObject var24, final SubLObject var13, SubLObject var31) {
        if (var31 == module0071.UNPROVIDED) {
            var31 = (SubLObject)module0071.NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0071.NIL != f5018(var24) : var24;
        SubLObject var33 = (SubLObject)module0071.NIL;
        SubLObject var34 = (SubLObject)module0071.NIL;
        final SubLObject var35 = f5022(var24);
        SubLObject var36 = (SubLObject)module0071.NIL;
        try {
            var36 = Locks.seize_lock(var35);
            var32.resetMultipleValues();
            final SubLObject var45_46 = f5054(var24, var13, var31);
            final SubLObject var47_48 = var32.secondMultipleValue();
            var32.resetMultipleValues();
            var33 = var45_46;
            var34 = var47_48;
        }
        finally {
            if (module0071.NIL != var36) {
                Locks.release_lock(var35);
            }
        }
        return Values.values(var33, var34);
    }
    
    public static SubLObject f5065(final SubLObject var24, final SubLObject var13) {
        assert module0071.NIL != f5018(var24) : var24;
        final SubLObject var25 = f5064(var24, var13, (SubLObject)module0071.NIL);
        if (module0071.NIL != f5056(var25)) {
            return var25;
        }
        final SubLObject var26 = f5042(var24);
        f5066(var24, var26, var13);
        return var26;
    }
    
    public static SubLObject f5067(final SubLObject var24, final SubLObject var13) {
        assert module0071.NIL != f5018(var24) : var24;
        final SubLObject var25 = f5064(var24, var13, (SubLObject)module0071.NIL);
        return f5068(var24, var25, var13);
    }
    
    public static SubLObject f5069(final SubLObject var24, final SubLObject var30) {
        assert module0071.NIL != f5018(var24) : var24;
        assert module0071.NIL != f5056(var30) : var30;
        final SubLObject var31 = f5063(var24, var30, (SubLObject)module0071.NIL);
        return f5068(var24, var30, var31);
    }
    
    public static SubLObject f5070(final SubLObject var24, final SubLObject var51) {
        assert module0071.NIL != f5018(var24) : var24;
        final SubLObject var52 = f5022(var24);
        SubLObject var53 = (SubLObject)module0071.NIL;
        try {
            var53 = Locks.seize_lock(var52);
            f5032(var24, var51);
        }
        finally {
            if (module0071.NIL != var53) {
                Locks.release_lock(var52);
            }
        }
        return var24;
    }
    
    public static SubLObject f5066(final SubLObject var24, final SubLObject var30, final SubLObject var13) {
        final SubLObject var31 = f5022(var24);
        SubLObject var32 = (SubLObject)module0071.NIL;
        try {
            var32 = Locks.seize_lock(var31);
            f5047(var24, var30, var13);
            f5053(var24, var13, var30);
        }
        finally {
            if (module0071.NIL != var32) {
                Locks.release_lock(var31);
            }
        }
        return var24;
    }
    
    public static SubLObject f5068(final SubLObject var24, final SubLObject var30, final SubLObject var13) {
        final SubLObject var31 = f5022(var24);
        SubLObject var32 = (SubLObject)module0071.NIL;
        try {
            var32 = Locks.seize_lock(var31);
            f5049(var24, var30);
            f5055(var24, var13);
        }
        finally {
            if (module0071.NIL != var32) {
                Locks.release_lock(var31);
            }
        }
        return var24;
    }
    
    public static SubLObject f5071(final SubLObject var24) {
        assert module0071.NIL != f5018(var24) : var24;
        return module0067.f4889(f5023(var24));
    }
    
    public static SubLObject f5072(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0071.$ic52$);
        final SubLObject var24 = var23.rest();
        var23 = var23.first();
        SubLObject var25 = (SubLObject)module0071.NIL;
        SubLObject var26 = (SubLObject)module0071.NIL;
        SubLObject var27 = (SubLObject)module0071.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0071.$ic52$);
        var25 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0071.$ic52$);
        var26 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0071.$ic52$);
        var27 = var23.first();
        var23 = var23.rest();
        SubLObject var28 = (SubLObject)module0071.NIL;
        SubLObject var29 = var23;
        SubLObject var30 = (SubLObject)module0071.NIL;
        SubLObject var64_65 = (SubLObject)module0071.NIL;
        while (module0071.NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0071.$ic52$);
            var64_65 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var22, (SubLObject)module0071.$ic52$);
            if (module0071.NIL == conses_high.member(var64_65, (SubLObject)module0071.$ic53$, (SubLObject)module0071.UNPROVIDED, (SubLObject)module0071.UNPROVIDED)) {
                var30 = (SubLObject)module0071.T;
            }
            if (var64_65 == module0071.$ic54$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (module0071.NIL != var30 && module0071.NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0071.$ic52$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)module0071.$ic55$, var23);
        final SubLObject var32 = (SubLObject)((module0071.NIL != var31) ? conses_high.cadr(var31) : module0071.NIL);
        final SubLObject var33;
        var23 = (var33 = var24);
        return (SubLObject)ConsesLow.listS((SubLObject)module0071.$ic56$, (SubLObject)ConsesLow.listS(var25, var26, (SubLObject)ConsesLow.list((SubLObject)module0071.$ic57$, var27), ConsesLow.append((SubLObject)((module0071.NIL != var32) ? ConsesLow.list(var32) : module0071.NIL), (SubLObject)module0071.NIL)), ConsesLow.append(var33, (SubLObject)module0071.NIL));
    }
    
    public static SubLObject f5073(final SubLObject var24) {
        assert module0071.NIL != f5018(var24) : var24;
        return f5023(var24);
    }
    
    public static SubLObject f5074(final SubLObject var24) {
        return module0084.f5789(f5023(var24), (SubLObject)module0071.UNPROVIDED);
    }
    
    public static SubLObject f5075() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5016", "S#6593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5018", "S#6592", 1, 0, false);
        new $f5018$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5019", "S#6594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5020", "S#6595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5021", "S#6596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5022", "S#6597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5023", "S#6598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5024", "S#6599", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5025", "S#6600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5026", "S#6601", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5027", "S#6602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5028", "S#6603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5029", "S#6604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5030", "S#6605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5031", "S#6606", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5032", "S#6607", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5033", "S#6608", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5034", "S#6609", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5035", "S#6610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5017", "S#6611", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0071", "f5039", "S#6612");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5040", "S#6613", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5041", "S#6614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5042", "S#6615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5043", "S#6616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5044", "S#6617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5045", "S#6618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5046", "S#6619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5047", "S#6620", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5048", "S#6621", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5049", "S#6622", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5050", "S#6623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5051", "S#6624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5052", "S#6625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5053", "S#6626", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5054", "S#6627", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5055", "S#6628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5056", "S#6629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5057", "S#6630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5058", "S#6631", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5060", "S#6632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5059", "S#6633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5061", "S#6634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5036", "S#6635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5062", "S#6636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5037", "S#6637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5038", "S#6638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5063", "S#6639", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5064", "S#6640", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5065", "S#6641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5067", "S#6642", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5069", "S#6643", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5070", "S#6644", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5066", "S#6645", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5068", "S#6646", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5071", "S#6647", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0071", "f5072", "S#6648");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5073", "S#6649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0071", "f5074", "S#6650", 1, 0, false);
        return (SubLObject)module0071.NIL;
    }
    
    public static SubLObject f5076() {
        module0071.$g1105$ = SubLFiles.defconstant("S#6651", (SubLObject)module0071.$ic0$);
        module0071.$g1106$ = SubLFiles.deflexical("S#6652", (SubLObject)module0071.$ic49$);
        return (SubLObject)module0071.NIL;
    }
    
    public static SubLObject f5077() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0071.$g1105$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0071.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0071.$ic8$);
        Structures.def_csetf((SubLObject)module0071.$ic9$, (SubLObject)module0071.$ic10$);
        Structures.def_csetf((SubLObject)module0071.$ic11$, (SubLObject)module0071.$ic12$);
        Structures.def_csetf((SubLObject)module0071.$ic13$, (SubLObject)module0071.$ic14$);
        Structures.def_csetf((SubLObject)module0071.$ic15$, (SubLObject)module0071.$ic16$);
        Structures.def_csetf((SubLObject)module0071.$ic17$, (SubLObject)module0071.$ic18$);
        Structures.def_csetf((SubLObject)module0071.$ic19$, (SubLObject)module0071.$ic20$);
        Structures.def_csetf((SubLObject)module0071.$ic21$, (SubLObject)module0071.$ic22$);
        Equality.identity((SubLObject)module0071.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0071.$g1105$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0071.$ic35$));
        module0002.f50((SubLObject)module0071.$ic57$, (SubLObject)module0071.$ic58$);
        return (SubLObject)module0071.NIL;
    }
    
    public void declareFunctions() {
        f5075();
    }
    
    public void initializeVariables() {
        f5076();
    }
    
    public void runTopLevelForms() {
        f5077();
    }
    
    static {
        me = (SubLFile)new module0071();
        module0071.$g1105$ = null;
        module0071.$g1106$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#6591", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#6592", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5610", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6653", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6654", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2605", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("ID-STATE"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("BACK-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6594", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6596", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6597", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6598", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6599", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6600", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6601", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6602", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6603", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6604", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6605", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6606", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6607", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#6611", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#6593", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#6592", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#6594", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#6601", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#6595", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#6602", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#6596", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#6603", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#6597", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#6604", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#6598", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#6605", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#6599", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#6606", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#6600", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#6607", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("TEST");
        $ic24$ = SubLObjectFactory.makeKeyword("MAX-SIZE");
        $ic25$ = SubLObjectFactory.makeKeyword("ID-STATE");
        $ic26$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic27$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic28$ = SubLObjectFactory.makeKeyword("BACK-INDEX");
        $ic29$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic30$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic31$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic32$ = SubLObjectFactory.makeSymbol("S#6608", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic34$ = SubLObjectFactory.makeKeyword("END");
        $ic35$ = SubLObjectFactory.makeSymbol("S#6610", "CYC");
        $ic36$ = SubLObjectFactory.makeString("#<");
        $ic37$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic38$ = SubLObjectFactory.makeString("(");
        $ic39$ = SubLObjectFactory.makeString(")");
        $ic40$ = SubLObjectFactory.makeString(" size=");
        $ic41$ = SubLObjectFactory.makeString(" owner=");
        $ic42$ = SubLObjectFactory.makeKeyword("BASE");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6591", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic44$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic45$ = SubLObjectFactory.makeKeyword("DICTIONARY");
        $ic46$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic47$ = SubLObjectFactory.makeSymbol("S#2831", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic49$ = SubLObjectFactory.makeInteger(50);
        $ic50$ = SubLObjectFactory.makeString("glob lock");
        $ic51$ = SubLObjectFactory.makeSymbol("S#6629", "CYC");
        $ic52$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6591", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic54$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic55$ = SubLObjectFactory.makeKeyword("DONE");
        $ic56$ = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $ic57$ = SubLObjectFactory.makeSymbol("S#6649", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#6648", "CYC");
    }
    
    public static final class $sX6591_native extends SubLStructNative
    {
        public SubLObject $test;
        public SubLObject $max_size;
        public SubLObject $id_state;
        public SubLObject $lock;
        public SubLObject $index;
        public SubLObject $back_index;
        public SubLObject $owner;
        private static final SubLStructDeclNative structDecl;
        
        public $sX6591_native() {
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$max_size = (SubLObject)CommonSymbols.NIL;
            this.$id_state = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$back_index = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX6591_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$test;
        }
        
        public SubLObject getField3() {
            return this.$max_size;
        }
        
        public SubLObject getField4() {
            return this.$id_state;
        }
        
        public SubLObject getField5() {
            return this.$lock;
        }
        
        public SubLObject getField6() {
            return this.$index;
        }
        
        public SubLObject getField7() {
            return this.$back_index;
        }
        
        public SubLObject getField8() {
            return this.$owner;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$max_size = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$id_state = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$index = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$back_index = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$owner = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6591_native.class, module0071.$ic0$, module0071.$ic1$, module0071.$ic2$, module0071.$ic3$, new String[] { "$test", "$max_size", "$id_state", "$lock", "$index", "$back_index", "$owner" }, module0071.$ic4$, module0071.$ic5$, module0071.$ic6$);
        }
    }
    
    public static final class $f5018$UnaryFunction extends UnaryFunction
    {
        public $f5018$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#6592"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0071.f5018(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0071.class
	Total time: 163 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/