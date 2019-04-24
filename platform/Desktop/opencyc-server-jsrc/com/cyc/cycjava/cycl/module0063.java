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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
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

public final class module0063 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0063";
    public static final String myFingerPrint = "63c2034ccd68b8e09c42febc79c365cb89d31757554afbe46cf04c5c8bea04f8";
    public static SubLSymbol $g1064$;
    public static SubLSymbol $g1065$;
    public static SubLSymbol $g1066$;
    public static SubLSymbol $g1067$;
    private static SubLSymbol $g1068$;
    private static SubLSymbol $g1069$;
    private static SubLSymbol $g1070$;
    public static SubLSymbol $g1071$;
    public static SubLSymbol $g1072$;
    public static SubLSymbol $g1073$;
    public static SubLSymbol $g1074$;
    public static SubLSymbol $g1075$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
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
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
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
    private static final SubLString $ic72$;
    private static final SubLInteger $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    
    public static SubLObject f4521(final SubLObject var1, final SubLObject var2) {
        f4522(var1, var2, (SubLObject)module0063.ZERO_INTEGER);
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4523(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX6063_native.class) ? module0063.T : module0063.NIL);
    }
    
    public static SubLObject f4524(final SubLObject var1) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f4525(final SubLObject var1) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f4526(final SubLObject var1) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f4527(final SubLObject var1) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f4528(final SubLObject var1) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f4529(final SubLObject var1) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f4530(final SubLObject var1) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f4531(final SubLObject var1) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f4532(final SubLObject var1, final SubLObject var4) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f4533(final SubLObject var1, final SubLObject var4) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f4534(final SubLObject var1, final SubLObject var4) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f4535(final SubLObject var1, final SubLObject var4) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f4536(final SubLObject var1, final SubLObject var4) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f4537(final SubLObject var1, final SubLObject var4) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f4538(final SubLObject var1, final SubLObject var4) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f4539(final SubLObject var1, final SubLObject var4) {
        assert module0063.NIL != f4523(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f4540(SubLObject var5) {
        if (var5 == module0063.UNPROVIDED) {
            var5 = (SubLObject)module0063.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX6063_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0063.NIL, var7 = var5; module0063.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0063.$ic26$)) {
                f4532(var6, var9);
            }
            else if (var10.eql((SubLObject)module0063.$ic27$)) {
                f4533(var6, var9);
            }
            else if (var10.eql((SubLObject)module0063.$ic28$)) {
                f4534(var6, var9);
            }
            else if (var10.eql((SubLObject)module0063.$ic29$)) {
                f4535(var6, var9);
            }
            else if (var10.eql((SubLObject)module0063.$ic30$)) {
                f4536(var6, var9);
            }
            else if (var10.eql((SubLObject)module0063.$ic31$)) {
                f4537(var6, var9);
            }
            else if (var10.eql((SubLObject)module0063.$ic32$)) {
                f4538(var6, var9);
            }
            else if (var10.eql((SubLObject)module0063.$ic33$)) {
                f4539(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0063.$ic34$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f4541(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic35$, (SubLObject)module0063.$ic36$, (SubLObject)module0063.EIGHT_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic37$, (SubLObject)module0063.$ic26$, f4524(var11));
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic37$, (SubLObject)module0063.$ic27$, f4525(var11));
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic37$, (SubLObject)module0063.$ic28$, f4526(var11));
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic37$, (SubLObject)module0063.$ic29$, f4527(var11));
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic37$, (SubLObject)module0063.$ic30$, f4528(var11));
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic37$, (SubLObject)module0063.$ic31$, f4529(var11));
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic37$, (SubLObject)module0063.$ic32$, f4530(var11));
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic37$, (SubLObject)module0063.$ic33$, f4531(var11));
        Functions.funcall(var12, var11, (SubLObject)module0063.$ic38$, (SubLObject)module0063.$ic36$, (SubLObject)module0063.EIGHT_INTEGER);
        return var11;
    }
    
    public static SubLObject f4542(final SubLObject var11, final SubLObject var12) {
        return f4541(var11, var12);
    }
    
    public static SubLObject f4522(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLObject var15 = f4524(var13);
        PrintLow.format(var2, (SubLObject)module0063.$ic40$);
        if (module0063.NIL != var15) {
            PrintLow.format(var2, (SubLObject)module0063.$ic41$, var15);
        }
        else {
            final SubLObject var16 = f4526(var13);
            final SubLObject var17 = f4528(var13);
            final SubLObject var18 = f4527(var13);
            final SubLObject var19 = f4529(var13);
            if (module0063.NIL != var16) {
                PrintLow.format(var2, (SubLObject)module0063.$ic42$);
            }
            PrintLow.format(var2, (SubLObject)module0063.$ic41$, var17);
            if (module0063.NIL != var18) {
                PrintLow.format(var2, (SubLObject)module0063.$ic43$);
            }
            else {
                PrintLow.format(var2, (SubLObject)module0063.$ic44$);
            }
            if (module0063.NIL != var19) {
                PrintLow.format(var2, (SubLObject)module0063.$ic45$, f4530(var13));
            }
        }
        PrintLow.format(var2, (SubLObject)module0063.$ic46$);
        return var13;
    }
    
    public static SubLObject f4543() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)module0063.NIL;
        final SubLObject var22 = Storage.$current_area$.currentBinding(var20);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var20);
            var21 = f4540((SubLObject)module0063.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f4544(final SubLObject var22) {
        f4532(var22, (SubLObject)module0063.NIL);
        f4533(var22, (SubLObject)module0063.NIL);
        f4534(var22, (SubLObject)module0063.NIL);
        f4535(var22, (SubLObject)module0063.NIL);
        f4536(var22, (SubLObject)module0063.NIL);
        f4537(var22, (SubLObject)module0063.NIL);
        f4538(var22, (SubLObject)module0063.NIL);
        f4539(var22, (SubLObject)module0063.NIL);
        return var22;
    }
    
    public static SubLObject f4545(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0063.NIL != f4523(var13) && f4525(var13) == module0063.$ic48$);
    }
    
    public static SubLObject f4546(SubLObject var13) {
        assert module0063.NIL != f4523(var13) : var13;
        if (module0063.NIL == f4545(var13)) {
            var13 = f4544(var13);
            f4533(var13, (SubLObject)module0063.$ic48$);
            if (module0063.NIL != module0012.$g63$.getGlobalValue()) {
                final SubLObject var14 = module0063.$g1069$.getGlobalValue();
                SubLObject var15 = (SubLObject)module0063.NIL;
                try {
                    var15 = Locks.seize_lock(var14);
                    f4532(var13, module0063.$g1068$.getGlobalValue());
                    module0063.$g1068$.setGlobalValue(var13);
                }
                finally {
                    if (module0063.NIL != var15) {
                        Locks.release_lock(var14);
                    }
                }
            }
            return (SubLObject)module0063.T;
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4547() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0063.NIL != module0012.$g63$.getGlobalValue()) {
            SubLObject var21 = (SubLObject)module0063.NIL;
            SubLObject var22 = (SubLObject)module0063.NIL;
            final SubLObject var23 = module0063.$g1069$.getGlobalValue();
            SubLObject var24 = (SubLObject)module0063.NIL;
            try {
                var24 = Locks.seize_lock(var23);
                var21 = module0063.$g1068$.getGlobalValue();
                while (module0063.NIL == var22 && module0063.NIL != var21) {
                    if (module0063.NIL != f4545(var21)) {
                        module0063.$g1068$.setGlobalValue(f4524(var21));
                        var22 = (SubLObject)module0063.T;
                    }
                    else {
                        var21 = f4524(var21);
                    }
                }
                if (module0063.NIL == var22) {
                    if (module0063.NIL != module0012.$g64$.getDynamicValue(var20)) {
                        var21 = f4543();
                    }
                    else {
                        var21 = f4540((SubLObject)module0063.UNPROVIDED);
                    }
                    module0063.$g1068$.setGlobalValue((SubLObject)module0063.NIL);
                }
            }
            finally {
                if (module0063.NIL != var24) {
                    Locks.release_lock(var23);
                }
            }
            return f4544(var21);
        }
        if (module0063.NIL != module0012.$g64$.getDynamicValue(var20)) {
            return f4544(f4543());
        }
        return f4544(f4540((SubLObject)module0063.UNPROVIDED));
    }
    
    public static SubLObject f4548(final SubLObject var28) {
        final SubLObject var29 = var28.first();
        return var29.isAtom() ? var29 : var29.first();
    }
    
    public static SubLObject f4549(final SubLObject var28) {
        return var28.rest();
    }
    
    public static SubLObject f4550(final SubLObject var28) {
        return var28.rest();
    }
    
    public static SubLObject f4551(final SubLObject var28) {
        return Equality.eq(f4548(var28), (SubLObject)module0063.$ic38$);
    }
    
    public static SubLObject f4552(final SubLObject var13, final SubLObject var30) {
        return (SubLObject)((module0063.NIL != var30) ? ConsesLow.cons((SubLObject)module0063.$ic38$, var13) : ConsesLow.list((SubLObject)module0063.$ic38$, var13));
    }
    
    public static SubLObject f4553(final SubLObject var31, final SubLObject var18) {
        return (SubLObject)ConsesLow.cons((module0063.NIL != var18) ? var31 : Characters.char_downcase(var31), (SubLObject)module0063.NIL);
    }
    
    public static SubLObject f4554(final SubLObject var32, final SubLObject var33, final SubLObject var18) {
        return (module0063.NIL != var18) ? Characters.charE(var32, var33) : Characters.char_equal(var32, var33);
    }
    
    public static SubLObject f4555(final SubLObject var32, final SubLObject var33, final SubLObject var18) {
        return (module0063.NIL != var18) ? Characters.charL(var32, var33) : Characters.char_lessp(var32, var33);
    }
    
    public static SubLObject f4556(final SubLObject var32, final SubLObject var33, final SubLObject var18) {
        return (module0063.NIL != var18) ? Characters.charLE(var32, var33) : Characters.char_not_greaterp(var32, var33);
    }
    
    public static SubLObject f4557(final SubLObject var32, final SubLObject var33, final SubLObject var18) {
        return f4555(var33, var32, var18);
    }
    
    public static SubLObject f4558(final SubLObject var32, final SubLObject var33, final SubLObject var18) {
        return f4556(var33, var32, var18);
    }
    
    public static SubLObject f4559(final SubLObject var28, final SubLObject var34, final SubLObject var18) {
        final SubLObject var35 = f4550(var28);
        final SubLObject var36 = f4548(var34);
        SubLObject var37 = (SubLObject)module0063.NIL;
        SubLObject var38 = (SubLObject)module0063.NIL;
        SubLObject var39 = (SubLObject)module0063.NIL;
        var37 = var28;
        for (var38 = var35, var39 = f4548(var38.first()); module0063.NIL != var38 && var36 != module0063.$ic38$ && (var39 == module0063.$ic38$ || module0063.NIL != f4555(var39, var36, var18)); var38 = var38.rest(), var39 = f4548(var38.first())) {
            var37 = var38;
        }
        ConsesLow.rplacd(var37, (SubLObject)ConsesLow.cons(var34, var38));
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4560(final SubLObject var16, SubLObject var15, SubLObject var18, SubLObject var40) {
        if (var15 == module0063.UNPROVIDED) {
            var15 = (SubLObject)module0063.NIL;
        }
        if (var18 == module0063.UNPROVIDED) {
            var18 = (SubLObject)module0063.T;
        }
        if (var40 == module0063.UNPROVIDED) {
            var40 = (SubLObject)module0063.EQL;
        }
        final SubLObject var41 = f4547();
        f4532(var41, var15);
        f4533(var41, (SubLObject)ConsesLow.listS((SubLObject)module0063.$ic49$, (SubLObject)module0063.NIL));
        f4534(var41, var16);
        f4535(var41, var18);
        f4536(var41, var40);
        f4537(var41, (SubLObject)module0063.NIL);
        return var41;
    }
    
    public static SubLObject f4561(final SubLObject var41, final SubLObject var16, SubLObject var18, SubLObject var40, SubLObject var42) {
        if (var18 == module0063.UNPROVIDED) {
            var18 = (SubLObject)module0063.T;
        }
        if (var40 == module0063.UNPROVIDED) {
            var40 = (SubLObject)module0063.NIL;
        }
        if (var42 == module0063.UNPROVIDED) {
            var42 = (SubLObject)module0063.NIL;
        }
        if (module0063.NIL == var40) {
            if (module0063.NIL != var42) {
                var40 = (SubLObject)((module0063.NIL != var18) ? module0063.EQUAL : module0063.EQUALP);
            }
            else {
                var40 = (SubLObject)module0063.EQL;
            }
        }
        final SubLObject var43 = f4560(var16, (SubLObject)module0063.NIL, var18, var40);
        SubLObject var44 = var41;
        SubLObject var45 = (SubLObject)module0063.NIL;
        var45 = var44.first();
        while (module0063.NIL != var44) {
            f4562(var43, var45, (SubLObject)((module0063.NIL != var42) ? var45 : module0063.T), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED);
            var44 = var44.rest();
            var45 = var44.first();
        }
        return var43;
    }
    
    public static SubLObject f4563(final SubLObject var22) {
        assert module0063.NIL != f4523(var22) : var22;
        final SubLObject var23 = f4525(var22);
        ConsesLow.rplacd(var23, (SubLObject)module0063.NIL);
        if (module0063.NIL != f4529(var22)) {
            final SubLObject var24 = f4564(var23);
            final SubLObject var25 = f4530(var22);
            SubLObject var26 = var24;
            SubLObject var27 = (SubLObject)module0063.NIL;
            var27 = var26.first();
            while (module0063.NIL != var26) {
                f4565(var23, var27);
                var26 = var26.rest();
                var27 = var26.first();
            }
            var26 = var25;
            var27 = (SubLObject)module0063.NIL;
            var27 = var26.first();
            while (module0063.NIL != var26) {
                f4566(var23, var27);
                var26 = var26.rest();
                var27 = var26.first();
            }
        }
        return var22;
    }
    
    public static SubLObject f4567(final SubLObject var22) {
        assert module0063.NIL != f4523(var22) : var22;
        return Types.sublisp_null(f4525(var22).rest());
    }
    
    public static SubLObject f4568(final SubLObject var22) {
        return f4569(f4525(var22), f4526(var22));
    }
    
    public static SubLObject f4569(final SubLObject var28, final SubLObject var30) {
        SubLObject var31 = (SubLObject)module0063.ZERO_INTEGER;
        if (module0063.NIL != var28) {
            if (module0063.NIL != f4551(var28)) {
                if (module0063.NIL != var30) {
                    var31 = Numbers.add(var31, (SubLObject)module0063.ONE_INTEGER);
                }
                else {
                    var31 = Numbers.add(var31, Sequences.length(f4549(var28)));
                }
            }
            else {
                SubLObject var32 = f4550(var28);
                SubLObject var33 = (SubLObject)module0063.NIL;
                var33 = var32.first();
                while (module0063.NIL != var32) {
                    var31 = Numbers.add(var31, f4569(var33, var30));
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
        }
        return var31;
    }
    
    public static SubLObject f4570(final SubLObject var22, SubLObject var2) {
        if (var2 == module0063.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        streams_high.terpri(var2);
        f4571(f4525(var22), var2, (SubLObject)module0063.ZERO_INTEGER, (SubLObject)module0063.NIL);
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4571(final SubLObject var28, final SubLObject var2, final SubLObject var14, final SubLObject var50) {
        if (module0063.NIL != var50) {
            streams_high.terpri(var2);
            module0038.f2648(var2, var14);
        }
        final SubLObject var51 = f4548(var28);
        final SubLObject var52 = f4564(var28);
        if (var51.isChar()) {
            final SubLObject var53 = f4550(var28);
            if (module0063.NIL != var53) {
                print_high.princ(var51, (SubLObject)module0063.UNPROVIDED);
                if (module0063.NIL != var52) {
                    PrintLow.format(var2, (SubLObject)module0063.$ic50$, var52);
                }
                f4571(var53.first(), var2, Numbers.add(var14, (SubLObject)module0063.ONE_INTEGER), var52);
                SubLObject var54 = var53.rest();
                SubLObject var55 = (SubLObject)module0063.NIL;
                var55 = var54.first();
                while (module0063.NIL != var54) {
                    f4571(var55, var2, Numbers.add(var14, (SubLObject)module0063.ONE_INTEGER), (SubLObject)module0063.T);
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
        }
        else if (var51 == module0063.$ic38$) {
            PrintLow.format(var2, (SubLObject)module0063.$ic51$, f4549(var28));
        }
        else if (var51 == module0063.$ic49$) {
            if (module0063.NIL != var52) {
                PrintLow.format(var2, (SubLObject)module0063.$ic50$, var52);
            }
            final SubLObject var53 = f4550(var28);
            if (module0063.NIL != var53) {
                f4571(var53.first(), var2, (SubLObject)module0063.ZERO_INTEGER, var52);
                SubLObject var54 = var53.rest();
                SubLObject var55 = (SubLObject)module0063.NIL;
                var55 = var54.first();
                while (module0063.NIL != var54) {
                    f4571(var55, var2, (SubLObject)module0063.ZERO_INTEGER, (SubLObject)module0063.T);
                    var54 = var54.rest();
                    var55 = var54.first();
                }
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4562(final SubLObject var22, final SubLObject var44, SubLObject var13, SubLObject var53, SubLObject var54) {
        if (var13 == module0063.UNPROVIDED) {
            var13 = var44;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4523(var22) : var22;
        assert module0063.NIL != Types.stringp(var44) : var44;
        final SubLObject var55 = f4526(var22);
        final SubLObject var56 = f4527(var22);
        final SubLObject var57 = f4528(var22);
        final SubLObject var58 = (module0063.NIL != var54) ? var54 : Sequences.length(var44);
        SubLObject var59 = f4525(var22);
        SubLObject var60 = (SubLObject)module0063.NIL;
        SubLObject var61 = (SubLObject)module0063.NIL;
        f4572(var59);
        SubLObject var62 = (SubLObject)module0063.NIL;
        SubLObject var63 = (SubLObject)module0063.NIL;
        var62 = (SubLObject)module0063.NIL;
        for (var63 = var53; !var63.numE(var58); var63 = Numbers.add(var63, (SubLObject)module0063.ONE_INTEGER)) {
            var61 = Strings.sublisp_char(var44, var63);
            if (module0063.NIL == var62) {
                SubLObject var64 = f4550(var59);
                SubLObject var65 = (SubLObject)module0063.NIL;
                var65 = var64.first();
                while (module0063.NIL == var62 && module0063.NIL != var64) {
                    final SubLObject var66 = f4548(var65);
                    if (var66.isChar() && module0063.NIL != f4554(var61, var66, var56)) {
                        var62 = var65;
                    }
                    var64 = var64.rest();
                    var65 = var64.first();
                }
            }
            if (module0063.NIL != var62) {
                var59 = var62;
            }
            else {
                final SubLObject var67 = f4553(var61, var56);
                f4559(var59, var67, var56);
                var59 = var67;
            }
            f4573(var59);
            var62 = (SubLObject)module0063.NIL;
        }
        if (module0063.NIL == var60) {
            SubLObject var64 = f4550(var59);
            SubLObject var65 = (SubLObject)module0063.NIL;
            var65 = var64.first();
            while (module0063.NIL == var60 && module0063.NIL != var64) {
                if (module0063.NIL != f4551(var65)) {
                    var60 = var65;
                }
                var64 = var64.rest();
                var65 = var64.first();
            }
        }
        if (module0063.NIL != var60) {
            f4573(var60);
            if (module0063.NIL != var55) {
                if (module0063.NIL == Functions.funcall(var57, var13, f4549(var60))) {
                    Errors.error((SubLObject)module0063.$ic53$, f4549(var60), var57, var13);
                }
            }
            else {
                final SubLObject var68 = f4549(var60);
                if (module0063.NIL == module0004.f104(var13, var68, var57, (SubLObject)module0063.UNPROVIDED)) {
                    f4574(var22, var13);
                    final SubLObject var69 = (SubLObject)ConsesLow.cons(var13, var68);
                    ConsesLow.rplacd(var60, var69);
                }
            }
        }
        else {
            final SubLObject var70 = f4552(var13, var55);
            f4575(var22, var13);
            f4559(var59, var70, var56);
        }
        f4576();
        return var22;
    }
    
    public static SubLObject f4577(final SubLObject var22, final SubLObject var44, SubLObject var13, SubLObject var53, SubLObject var54) {
        if (var13 == module0063.UNPROVIDED) {
            var13 = var44;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4523(var22) : var22;
        assert module0063.NIL != Types.stringp(var44) : var44;
        final SubLObject var55 = f4526(var22);
        final SubLObject var56 = f4527(var22);
        final SubLObject var57 = f4528(var22);
        final SubLObject var58 = (module0063.NIL != var54) ? var54 : Sequences.length(var44);
        SubLObject var59 = f4525(var22);
        SubLObject var60 = (SubLObject)module0063.NIL;
        SubLObject var61 = (SubLObject)module0063.NIL;
        SubLObject var62 = (SubLObject)module0063.NIL;
        SubLObject var63 = (SubLObject)module0063.NIL;
        f4572(var59);
        SubLObject var64 = (SubLObject)module0063.NIL;
        SubLObject var65 = (SubLObject)module0063.NIL;
        var64 = (SubLObject)module0063.NIL;
        for (var65 = var53; !var65.numE(var58); var65 = Numbers.add(var65, (SubLObject)module0063.ONE_INTEGER)) {
            var63 = Strings.sublisp_char(var44, var65);
            if (module0063.NIL == var64) {
                SubLObject var66 = f4550(var59);
                SubLObject var67 = (SubLObject)module0063.NIL;
                var67 = var66.first();
                while (module0063.NIL == var64 && module0063.NIL != var66) {
                    final SubLObject var68 = f4548(var67);
                    if (var68.isChar() && module0063.NIL != f4554(var63, var68, var56)) {
                        var64 = var67;
                    }
                    var66 = var66.rest();
                    var67 = var66.first();
                }
            }
            if (module0063.NIL == var64) {
                f4576();
                return var22;
            }
            if (module0063.NIL != f4550(var59).rest()) {
                var60 = var59;
                var62 = var64;
            }
            var59 = var64;
            f4573(var59);
            var64 = (SubLObject)module0063.NIL;
        }
        if (module0063.NIL == var61) {
            SubLObject var66 = f4550(var59);
            SubLObject var67 = (SubLObject)module0063.NIL;
            var67 = var66.first();
            while (module0063.NIL == var61 && module0063.NIL != var66) {
                if (module0063.NIL != f4551(var67)) {
                    f4573(var67);
                    var61 = var67;
                }
                var66 = var66.rest();
                var67 = var66.first();
            }
        }
        if (module0063.NIL == var61) {
            f4576();
            return var22;
        }
        if (module0063.NIL != var55) {
            if (module0063.NIL == Functions.funcall(var57, var13, f4549(var61))) {
                Errors.cerror((SubLObject)module0063.$ic54$, (SubLObject)module0063.$ic55$, var44, f4549(var61), var13);
            }
        }
        else {
            final SubLObject var69 = f4549(var61);
            final SubLObject var70 = Sequences.delete(var13, var69, var57, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED);
            if (!var69.eql(var70)) {
                ConsesLow.rplacd(var61, var70);
            }
            if (module0063.NIL != var70) {
                f4578(var22, var13);
                f4576();
                return var22;
            }
        }
        f4578(var22, var13);
        if (module0063.NIL != f4550(var59).rest()) {
            ConsesLow.rplacd(var59, Sequences.delete(var61, f4550(var59), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED));
        }
        else if (module0063.NIL != var62 && module0063.NIL != var60) {
            var60 = Sequences.delete(var62, var60, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED);
        }
        else {
            f4563(var22);
        }
        f4576();
        return var22;
    }
    
    public static SubLObject f4579(final SubLObject var22, final SubLObject var44, SubLObject var53, SubLObject var54) {
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4523(var22) : var22;
        assert module0063.NIL != Types.stringp(var44) : var44;
        final SubLObject var55 = f4527(var22);
        final SubLObject var56 = (module0063.NIL != var54) ? var54 : Sequences.length(var44);
        SubLObject var57 = f4525(var22);
        SubLObject var58 = (SubLObject)module0063.NIL;
        SubLObject var59 = (SubLObject)module0063.NIL;
        SubLObject var60 = (SubLObject)module0063.NIL;
        SubLObject var61 = (SubLObject)module0063.ZERO_INTEGER;
        f4572(var57);
        SubLObject var62 = (SubLObject)module0063.NIL;
        SubLObject var63 = (SubLObject)module0063.NIL;
        var62 = (SubLObject)module0063.NIL;
        for (var63 = var53; !var63.numE(var56); var63 = Numbers.add(var63, (SubLObject)module0063.ONE_INTEGER)) {
            var60 = Strings.sublisp_char(var44, var63);
            if (module0063.NIL == var62) {
                SubLObject var64 = f4550(var57);
                SubLObject var65 = (SubLObject)module0063.NIL;
                var65 = var64.first();
                while (module0063.NIL == var62 && module0063.NIL != var64) {
                    final SubLObject var66 = f4548(var65);
                    if (var66.isChar() && module0063.NIL != f4554(var60, var66, var55)) {
                        var62 = var65;
                    }
                    var64 = var64.rest();
                    var65 = var64.first();
                }
            }
            if (module0063.NIL == var62) {
                f4576();
                return var61;
            }
            if (module0063.NIL != f4550(var57).rest()) {
                var58 = var57;
                var59 = var62;
            }
            var57 = var62;
            f4573(var57);
            var62 = (SubLObject)module0063.NIL;
        }
        if (module0063.NIL != var59 && module0063.NIL != var58) {
            var61 = f4569(var57, f4526(var22));
            f4580(var22);
            var58 = Sequences.delete(var59, var58, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED);
        }
        else {
            var61 = f4568(var22);
            f4563(var22);
        }
        f4576();
        return var61;
    }
    
    public static SubLObject f4581(final SubLObject var22, final SubLObject var44, SubLObject var68, SubLObject var53, SubLObject var54) {
        if (var68 == module0063.UNPROVIDED) {
            var68 = (SubLObject)module0063.NIL;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        assert module0063.NIL != f4523(var22) : var22;
        assert module0063.NIL != Types.stringp(var44) : var44;
        if (module0063.NIL == Errors.$ignore_mustsP$.getDynamicValue(var69) && module0063.NIL == f4526(var22)) {
            Errors.error((SubLObject)module0063.$ic56$, var22);
        }
        var68 = (SubLObject)SubLObjectFactory.makeBoolean(module0063.NIL != var68 && module0063.NIL != f4527(var22));
        SubLObject var70 = f4525(var22);
        SubLObject var71 = (SubLObject)module0063.NIL;
        SubLObject var72 = (SubLObject)module0063.NIL;
        final SubLObject var73 = (module0063.NIL != var54) ? var54 : Sequences.length(var44);
        f4572(var70);
        SubLObject var74 = (SubLObject)module0063.NIL;
        SubLObject var75 = (SubLObject)module0063.NIL;
        var74 = var53;
        var75 = (SubLObject)module0063.NIL;
        while (!var74.numE(var73) && (!var74.numG((SubLObject)module0063.ZERO_INTEGER) || module0063.NIL != var70)) {
            var71 = Strings.sublisp_char(var44, var74);
            if (module0063.NIL == var75) {
                SubLObject var76 = f4550(var70);
                SubLObject var77 = (SubLObject)module0063.NIL;
                var77 = var76.first();
                while (module0063.NIL == var75 && module0063.NIL != var76) {
                    final SubLObject var78 = f4548(var77);
                    if (var78.isChar() && module0063.NIL != f4554(var71, var78, var68)) {
                        var75 = var77;
                    }
                    var76 = var76.rest();
                    var77 = var76.first();
                }
            }
            var70 = var75;
            f4573(var70);
            var74 = Numbers.add(var74, (SubLObject)module0063.ONE_INTEGER);
            var75 = (SubLObject)module0063.NIL;
        }
        if (module0063.NIL != var70 && module0063.NIL == var72) {
            SubLObject var76 = f4550(var70);
            SubLObject var77 = (SubLObject)module0063.NIL;
            var77 = var76.first();
            while (module0063.NIL == var72 && module0063.NIL != var76) {
                if (module0063.NIL != f4551(var77)) {
                    f4573(var77);
                    if (module0063.NIL != f4582(var22)) {
                        final SubLObject var79 = f4549(var77);
                        if (module0063.NIL != f4583(var22, var79)) {
                            var72 = var79;
                        }
                    }
                }
                var76 = var76.rest();
                var77 = var76.first();
            }
        }
        f4576();
        return var72;
    }
    
    public static SubLObject f4584(final SubLObject var22, final SubLObject var44, SubLObject var68, SubLObject var72, SubLObject var53, SubLObject var54) {
        if (var68 == module0063.UNPROVIDED) {
            var68 = (SubLObject)module0063.NIL;
        }
        if (var72 == module0063.UNPROVIDED) {
            var72 = (SubLObject)module0063.NIL;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        if (module0063.NIL != var68 || module0063.NIL == f4527(var22)) {
            return f4585(var22, var44, var72, var53, var54);
        }
        return f4586(var22, var44, var72, var53, var54);
    }
    
    public static SubLObject f4585(final SubLObject var22, final SubLObject var44, final SubLObject var72, SubLObject var53, SubLObject var54) {
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        final SubLThread var73 = SubLProcess.currentSubLThread();
        assert module0063.NIL != f4523(var22) : var22;
        assert module0063.NIL != Types.stringp(var44) : var44;
        SubLObject var74 = (SubLObject)module0063.NIL;
        final SubLObject var75 = module0063.$g1064$.currentBinding(var73);
        try {
            module0063.$g1064$.bind((SubLObject)module0063.NIL, var73);
            final SubLObject var76 = f4527(var22);
            final SubLObject var77 = (module0063.NIL != var54) ? var54 : Sequences.length(var44);
            SubLObject var78 = (SubLObject)module0063.NIL;
            SubLObject var79 = (SubLObject)module0063.NIL;
            final SubLObject var80 = f4526(var22);
            SubLObject var81 = f4525(var22);
            f4572(var81);
            SubLObject var82 = (SubLObject)module0063.NIL;
            SubLObject var83 = (SubLObject)module0063.NIL;
            var82 = var53;
            var83 = (SubLObject)module0063.NIL;
            while (!var82.numE(var77) && (!var82.numG((SubLObject)module0063.ZERO_INTEGER) || module0063.NIL != var81)) {
                var78 = Strings.sublisp_char(var44, var82);
                if (module0063.NIL == var83) {
                    SubLObject var84 = f4550(var81);
                    SubLObject var85 = (SubLObject)module0063.NIL;
                    var85 = var84.first();
                    while (module0063.NIL == var83 && module0063.NIL != var84) {
                        final SubLObject var86 = f4548(var85);
                        if (var86.isChar() && module0063.NIL != f4554(var78, var86, var76)) {
                            var83 = var85;
                        }
                        var81 = var83;
                        f4573(var81);
                        var84 = var84.rest();
                        var85 = var84.first();
                    }
                }
                var82 = Numbers.add(var82, (SubLObject)module0063.ONE_INTEGER);
                var83 = (SubLObject)module0063.NIL;
            }
            if (module0063.NIL != var81) {
                if (module0063.NIL != var72) {
                    if (module0063.NIL == var79) {
                        SubLObject var84 = f4550(var81);
                        SubLObject var85 = (SubLObject)module0063.NIL;
                        var85 = var84.first();
                        while (module0063.NIL == var79 && module0063.NIL != var84) {
                            if (module0063.NIL != f4551(var85)) {
                                var79 = var85;
                                f4573(var85);
                            }
                            var84 = var84.rest();
                            var85 = var84.first();
                        }
                    }
                    if (module0063.NIL != var79 && module0063.NIL != f4582(var22)) {
                        final SubLObject var87 = f4549(var79);
                        if (module0063.NIL != var80) {
                            if (module0063.NIL != f4583(var22, var87)) {
                                module0063.$g1064$.setDynamicValue((SubLObject)ConsesLow.list(var87), var73);
                            }
                        }
                        else {
                            module0063.$g1064$.setDynamicValue(f4587(var22, var87), var73);
                        }
                    }
                }
                else {
                    f4588(var22, var81, var80);
                }
            }
            var74 = module0063.$g1064$.getDynamicValue(var73);
        }
        finally {
            module0063.$g1064$.rebind(var75, var73);
        }
        f4576();
        return Sequences.nreverse(var74);
    }
    
    public static SubLObject f4586(final SubLObject var22, final SubLObject var44, final SubLObject var72, SubLObject var53, SubLObject var54) {
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        final SubLThread var73 = SubLProcess.currentSubLThread();
        assert module0063.NIL != f4523(var22) : var22;
        assert module0063.NIL != Types.stringp(var44) : var44;
        SubLObject var74 = (SubLObject)module0063.NIL;
        final SubLObject var75 = module0063.$g1064$.currentBinding(var73);
        try {
            module0063.$g1064$.bind((SubLObject)module0063.NIL, var73);
            final SubLObject var76 = f4525(var22);
            f4572(var76);
            if (module0063.NIL != f4582(var22)) {
                SubLObject var77 = f4550(var76);
                SubLObject var78 = (SubLObject)module0063.NIL;
                var78 = var77.first();
                while (module0063.NIL != var77) {
                    f4573(var78);
                    if (module0063.NIL != f4582(var22)) {
                        f4589(var22, var78, var44, var53, (module0063.NIL != var54) ? var54 : Sequences.length(var44), var72, f4526(var22));
                    }
                    f4590();
                    var77 = var77.rest();
                    var78 = var77.first();
                }
            }
            var74 = module0063.$g1064$.getDynamicValue(var73);
            f4576();
        }
        finally {
            module0063.$g1064$.rebind(var75, var73);
        }
        return Sequences.nreverse(var74);
    }
    
    public static SubLObject f4589(final SubLObject var22, final SubLObject var28, final SubLObject var44, final SubLObject var59, final SubLObject var70, final SubLObject var72, final SubLObject var30) {
        if (var59.numE(var70)) {
            if (module0063.NIL != var72) {
                if (module0063.NIL != f4551(var28)) {
                    f4591(var22, var28, var30);
                }
            }
            else {
                f4588(var22, var28, var30);
            }
        }
        else {
            final SubLObject var73 = f4548(var28);
            if (!var73.isChar() || module0063.NIL == Characters.char_equal(Strings.sublisp_char(var44, var59), var73)) {
                return (SubLObject)module0063.NIL;
            }
            SubLObject var74 = f4550(var28);
            SubLObject var75 = (SubLObject)module0063.NIL;
            var75 = var74.first();
            while (module0063.NIL != var74) {
                f4573(var75);
                if (module0063.NIL != f4582(var22)) {
                    f4589(var22, var75, var44, Numbers.add(var59, (SubLObject)module0063.ONE_INTEGER), var70, var72, var30);
                }
                f4590();
                var74 = var74.rest();
                var75 = var74.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4588(final SubLObject var22, final SubLObject var28, final SubLObject var30) {
        if (module0063.NIL != var28) {
            if (module0063.NIL != f4551(var28)) {
                f4591(var22, var28, var30);
            }
            else {
                SubLObject var31 = f4550(var28);
                SubLObject var32 = (SubLObject)module0063.NIL;
                var32 = var31.first();
                while (module0063.NIL != var31) {
                    f4573(var32);
                    if (module0063.NIL != f4582(var22)) {
                        f4588(var22, var32, var30);
                    }
                    f4590();
                    var31 = var31.rest();
                    var32 = var31.first();
                }
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4591(final SubLObject var22, final SubLObject var28, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = f4549(var28);
        if (module0063.NIL != var30) {
            if (module0063.NIL != f4583(var22, var32)) {
                module0063.$g1064$.setDynamicValue((SubLObject)ConsesLow.cons(var32, module0063.$g1064$.getDynamicValue(var31)), var31);
            }
        }
        else {
            var32 = f4587(var22, var32);
            module0063.$g1064$.setDynamicValue(ConsesLow.append(var32, module0063.$g1064$.getDynamicValue(var31)), var31);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4592(final SubLObject var22, final SubLObject var44, SubLObject var68, SubLObject var53, SubLObject var54) {
        if (var68 == module0063.UNPROVIDED) {
            var68 = (SubLObject)module0063.NIL;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        assert module0063.NIL != f4523(var22) : var22;
        assert module0063.NIL != Types.stringp(var44) : var44;
        var68 = (SubLObject)SubLObjectFactory.makeBoolean(module0063.NIL != var68 && module0063.NIL != f4527(var22));
        SubLObject var70 = (SubLObject)module0063.NIL;
        final SubLObject var71 = module0063.$g1064$.currentBinding(var69);
        try {
            module0063.$g1064$.bind((SubLObject)module0063.NIL, var69);
            final SubLObject var72 = f4526(var22);
            final SubLObject var73 = Strings.make_string(module0063.$g1070$.getDynamicValue(var69), (SubLObject)module0063.UNPROVIDED);
            final SubLObject var74 = (SubLObject)module0063.ZERO_INTEGER;
            final SubLObject var75 = Numbers.subtract((module0063.NIL != var54) ? var54 : Sequences.length(var44), (SubLObject)module0063.ONE_INTEGER);
            final SubLObject var76 = f4525(var22);
            f4572(var76);
            if (module0063.NIL != f4582(var22)) {
                SubLObject var77 = f4550(var76);
                SubLObject var78 = (SubLObject)module0063.NIL;
                var78 = var77.first();
                while (module0063.NIL != var77) {
                    f4573(var78);
                    if (module0063.NIL != f4582(var22)) {
                        f4593(var22, var78, var44, var53, var75, var73, var74, var68, var72);
                    }
                    f4590();
                    var77 = var77.rest();
                    var78 = var77.first();
                }
            }
            var70 = module0063.$g1064$.getDynamicValue(var69);
            f4576();
        }
        finally {
            module0063.$g1064$.rebind(var71, var69);
        }
        return Sequences.nreverse(var70);
    }
    
    public static SubLObject f4593(final SubLObject var22, final SubLObject var28, final SubLObject var44, final SubLObject var78, final SubLObject var77, final SubLObject var75, SubLObject var76, final SubLObject var68, final SubLObject var30) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        final SubLObject var80 = f4548(var28);
        if (module0063.NIL != module0035.f1994(var75, var76, (SubLObject)module0063.UNPROVIDED)) {
            Errors.error((SubLObject)module0063.$ic58$, var75, module0063.$g1070$.getDynamicValue(var79));
        }
        if (var80.isChar()) {
            Strings.set_char(var75, var76, var80);
            if (module0063.NIL != f4594(var44, var78, var77, var75, var76, var68)) {
                f4588(var22, var28, var30);
            }
            else {
                var76 = Numbers.add(var76, (SubLObject)module0063.ONE_INTEGER);
                SubLObject var81 = f4550(var28);
                SubLObject var82 = (SubLObject)module0063.NIL;
                var82 = var81.first();
                while (module0063.NIL != var81) {
                    f4573(var82);
                    if (module0063.NIL != f4582(var22)) {
                        f4593(var22, var82, var44, var78, var77, var75, var76, var68, var30);
                    }
                    f4590();
                    var81 = var81.rest();
                    var82 = var81.first();
                }
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4594(final SubLObject var44, final SubLObject var78, final SubLObject var77, final SubLObject var79, final SubLObject var80, final SubLObject var68) {
        if (var80.numGE(Numbers.subtract(var77, var78))) {
            SubLObject var81;
            SubLObject var82;
            SubLObject var83;
            SubLObject var84;
            for (var81 = (SubLObject)module0063.NIL, var82 = (SubLObject)module0063.NIL, var81 = var77, var82 = var80; !var81.numL(var78) && !var82.isNegative(); var81 = Numbers.subtract(var81, (SubLObject)module0063.ONE_INTEGER), var82 = Numbers.subtract(var82, (SubLObject)module0063.ONE_INTEGER)) {
                var83 = Strings.sublisp_char(var44, var81);
                var84 = Strings.sublisp_char(var79, var82);
                if (module0063.NIL == ((module0063.NIL != var68) ? Characters.charE(var83, var84) : Characters.char_equal(var83, var84))) {
                    return (SubLObject)module0063.NIL;
                }
            }
            return (SubLObject)module0063.T;
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4595(final SubLObject var84, final SubLObject var22) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0063.NIL != f4523(var22) : var22;
        final SubLObject var86 = f4525(var22);
        f4572(var86);
        if (module0063.NIL != f4582(var22)) {
            SubLObject var87 = (SubLObject)module0063.NIL;
            try {
                var85.throwStack.push(module0063.$ic59$);
                f4596(var84, var22, var86, f4526(var22));
            }
            catch (Throwable var88) {
                var87 = Errors.handleThrowable(var88, (SubLObject)module0063.$ic59$);
            }
            finally {
                var85.throwStack.pop();
            }
        }
        f4576();
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4596(final SubLObject var84, final SubLObject var22, final SubLObject var28, final SubLObject var30) {
        if (module0063.NIL != f4551(var28)) {
            final SubLObject var85 = f4549(var28);
            if (module0063.NIL != var30) {
                if (module0063.NIL != f4583(var22, var85)) {
                    Functions.funcall(var84, var85);
                }
            }
            else {
                SubLObject var86 = var85;
                SubLObject var87 = (SubLObject)module0063.NIL;
                var87 = var86.first();
                while (module0063.NIL != var86) {
                    if (module0063.NIL != f4583(var22, var87)) {
                        Functions.funcall(var84, var87);
                    }
                    var86 = var86.rest();
                    var87 = var86.first();
                }
            }
        }
        else {
            SubLObject var88 = f4550(var28);
            SubLObject var89 = (SubLObject)module0063.NIL;
            var89 = var88.first();
            while (module0063.NIL != var88) {
                f4573(var89);
                if (module0063.NIL != f4582(var22)) {
                    f4596(var84, var22, var89, var30);
                }
                f4590();
                var88 = var88.rest();
                var89 = var88.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4597(final SubLObject var84, final SubLObject var22, final SubLObject var44, SubLObject var53, SubLObject var54, SubLObject var88) {
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        if (var88 == module0063.UNPROVIDED) {
            var88 = (SubLObject)module0063.T;
        }
        assert module0063.NIL != f4523(var22) : var22;
        assert module0063.NIL != Types.stringp(var44) : var44;
        if (module0063.NIL == var54) {
            var54 = Sequences.length(var44);
        }
        final SubLObject var89 = f4525(var22);
        final SubLObject var90 = f4526(var22);
        final SubLObject var91 = f4527(var22);
        f4572(var89);
        if (module0063.NIL != f4582(var22)) {
            if (module0063.NIL != var88) {
                f4598(var84, var22, var89, var90, var91, var44, var53, var54);
            }
            else {
                f4599(var84, var22, var89, var90, var91, var44, var53, var54);
            }
        }
        f4576();
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4598(final SubLObject var84, final SubLObject var22, final SubLObject var28, final SubLObject var16, final SubLObject var18, final SubLObject var44, final SubLObject var89, final SubLObject var90) {
        if (module0063.NIL != var44) {
            if (var89.numE(var90)) {
                f4598(var84, var22, var28, var16, var18, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL);
            }
            else {
                final SubLObject var91 = Strings.sublisp_char(var44, var89);
                SubLObject var92 = f4550(var28);
                SubLObject var93 = (SubLObject)module0063.NIL;
                var93 = var92.first();
                while (module0063.NIL != var92) {
                    f4573(var93);
                    if (module0063.NIL != f4582(var22)) {
                        final SubLObject var94 = f4548(var93);
                        if (var94 != module0063.$ic38$) {
                            if (module0063.NIL == f4555(var94, var91, var18)) {
                                if (module0063.NIL != f4554(var94, var91, var18)) {
                                    f4598(var84, var22, var93, var16, var18, var44, Numbers.add(var89, (SubLObject)module0063.ONE_INTEGER), var90);
                                }
                                else {
                                    f4598(var84, var22, var93, var16, var18, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL);
                                }
                            }
                        }
                    }
                    f4590();
                    var92 = var92.rest();
                    var93 = var92.first();
                }
            }
        }
        else if (module0063.NIL != f4551(var28)) {
            final SubLObject var95 = f4549(var28);
            if (module0063.NIL != var16) {
                if (module0063.NIL != f4583(var22, var95)) {
                    Functions.funcall(var84, var95);
                }
            }
            else {
                SubLObject var92 = var95;
                SubLObject var96 = (SubLObject)module0063.NIL;
                var96 = var92.first();
                while (module0063.NIL != var92) {
                    if (module0063.NIL != f4583(var22, var96)) {
                        Functions.funcall(var84, var96);
                    }
                    var92 = var92.rest();
                    var96 = var92.first();
                }
            }
        }
        else {
            SubLObject var97 = f4550(var28);
            SubLObject var98 = (SubLObject)module0063.NIL;
            var98 = var97.first();
            while (module0063.NIL != var97) {
                f4573(var98);
                if (module0063.NIL != f4582(var22)) {
                    f4598(var84, var22, var98, var16, var18, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL);
                }
                f4590();
                var97 = var97.rest();
                var98 = var97.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4599(final SubLObject var84, final SubLObject var22, final SubLObject var28, final SubLObject var16, final SubLObject var18, final SubLObject var44, final SubLObject var89, final SubLObject var90) {
        if (module0063.NIL != var44) {
            if (!var89.numE(var90)) {
                final SubLObject var91 = Strings.sublisp_char(var44, var89);
                final SubLObject var92 = f4550(var28);
                SubLObject var93;
                SubLObject var94;
                SubLObject var95;
                SubLObject var96;
                SubLObject var97;
                for (var93 = Sequences.length(var92), var94 = (SubLObject)module0063.NIL, var94 = (SubLObject)module0063.ZERO_INTEGER; var94.numL(var93); var94 = Numbers.add(var94, (SubLObject)module0063.ONE_INTEGER)) {
                    var95 = Numbers.subtract(var93, var94, (SubLObject)module0063.ONE_INTEGER);
                    var96 = ConsesLow.nth(var95, var92);
                    var97 = f4548(var96);
                    f4573(var96);
                    if (module0063.NIL != f4582(var22)) {
                        if (var97 == module0063.$ic38$) {
                            f4599(var84, var22, var96, var16, var18, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL);
                        }
                        else if (module0063.NIL != f4555(var97, var91, var18)) {
                            f4599(var84, var22, var96, var16, var18, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL);
                        }
                        else if (module0063.NIL != f4554(var97, var91, var18)) {
                            f4599(var84, var22, var96, var16, var18, var44, Numbers.add(var89, (SubLObject)module0063.ONE_INTEGER), var90);
                        }
                    }
                    f4590();
                }
            }
        }
        else if (module0063.NIL != f4551(var28)) {
            final SubLObject var98 = f4549(var28);
            if (module0063.NIL != var16) {
                if (module0063.NIL != f4583(var22, var98)) {
                    Functions.funcall(var84, var98);
                }
            }
            else {
                SubLObject var99 = var98;
                SubLObject var100 = (SubLObject)module0063.NIL;
                var100 = var99.first();
                while (module0063.NIL != var99) {
                    if (module0063.NIL != f4583(var22, var100)) {
                        Functions.funcall(var84, var100);
                    }
                    var99 = var99.rest();
                    var100 = var99.first();
                }
            }
        }
        else {
            final SubLObject var101 = f4550(var28);
            SubLObject var102;
            SubLObject var103;
            SubLObject var104;
            SubLObject var105;
            for (var102 = Sequences.length(var101), var103 = (SubLObject)module0063.NIL, var103 = (SubLObject)module0063.ZERO_INTEGER; var103.numL(var102); var103 = Numbers.add(var103, (SubLObject)module0063.ONE_INTEGER)) {
                var104 = Numbers.subtract(var102, var103, (SubLObject)module0063.ONE_INTEGER);
                var105 = ConsesLow.nth(var104, var101);
                f4573(var105);
                if (module0063.NIL != f4582(var22)) {
                    f4599(var84, var22, var105, var16, var18, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL, (SubLObject)module0063.NIL);
                }
                f4590();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4600(final SubLObject var95, final SubLObject var96) {
        SubLObject var98;
        final SubLObject var97 = var98 = var95.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var98, var97, (SubLObject)module0063.$ic60$);
        final SubLObject var99 = var98.rest();
        var98 = var98.first();
        SubLObject var100 = (SubLObject)module0063.NIL;
        SubLObject var101 = (SubLObject)module0063.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var98, var97, (SubLObject)module0063.$ic60$);
        var100 = var98.first();
        var98 = var98.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var98, var97, (SubLObject)module0063.$ic60$);
        var101 = var98.first();
        var98 = var98.rest();
        SubLObject var102 = (SubLObject)module0063.NIL;
        SubLObject var103 = var98;
        SubLObject var104 = (SubLObject)module0063.NIL;
        SubLObject var103_104 = (SubLObject)module0063.NIL;
        while (module0063.NIL != var103) {
            cdestructuring_bind.destructuring_bind_must_consp(var103, var97, (SubLObject)module0063.$ic60$);
            var103_104 = var103.first();
            var103 = var103.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var103, var97, (SubLObject)module0063.$ic60$);
            if (module0063.NIL == conses_high.member(var103_104, (SubLObject)module0063.$ic61$, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                var104 = (SubLObject)module0063.T;
            }
            if (var103_104 == module0063.$ic62$) {
                var102 = var103.first();
            }
            var103 = var103.rest();
        }
        if (module0063.NIL != var104 && module0063.NIL == var102) {
            cdestructuring_bind.cdestructuring_bind_error(var97, (SubLObject)module0063.$ic60$);
        }
        final SubLObject var105 = cdestructuring_bind.property_list_member((SubLObject)module0063.$ic63$, var98);
        final SubLObject var106 = (SubLObject)((module0063.NIL != var105) ? conses_high.cadr(var105) : module0063.NIL);
        final SubLObject var107 = cdestructuring_bind.property_list_member((SubLObject)module0063.$ic64$, var98);
        final SubLObject var108 = (SubLObject)((module0063.NIL != var107) ? conses_high.cadr(var107) : module0063.T);
        final SubLObject var109;
        var98 = (var109 = var99);
        final SubLObject var110 = (SubLObject)module0063.$ic65$;
        return (SubLObject)ConsesLow.list((SubLObject)module0063.$ic66$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var110, (SubLObject)ConsesLow.list((SubLObject)module0063.$ic67$, var101, var108))), (SubLObject)ConsesLow.listS((SubLObject)module0063.$ic68$, (SubLObject)ConsesLow.list(var100, var110, (SubLObject)module0063.$ic63$, var106), ConsesLow.append(var109, (SubLObject)module0063.NIL)));
    }
    
    public static SubLObject f4601(final SubLObject var22, SubLObject var110) {
        if (var110 == module0063.UNPROVIDED) {
            var110 = (SubLObject)module0063.T;
        }
        final SubLObject var111 = f4602(var22, var110);
        return module0052.f3689(var111, (SubLObject)module0063.$ic69$, (SubLObject)module0063.$ic70$, (SubLObject)module0063.$ic71$);
    }
    
    public static SubLObject f4602(final SubLObject var22, final SubLObject var110) {
        final SubLObject var111 = Vectors.make_vector((SubLObject)module0063.FIVE_INTEGER, (SubLObject)module0063.NIL);
        Vectors.set_aref(var111, (SubLObject)module0063.ZERO_INTEGER, var22);
        Vectors.set_aref(var111, (SubLObject)module0063.ONE_INTEGER, f4525(var22));
        Vectors.set_aref(var111, (SubLObject)module0063.TWO_INTEGER, var110);
        Vectors.set_aref(var111, (SubLObject)module0063.THREE_INTEGER, (SubLObject)((module0063.NIL != f4526(var22)) ? module0063.NIL : module0055.f4017()));
        Vectors.set_aref(var111, (SubLObject)module0063.FOUR_INTEGER, module0054.f3968());
        return var111;
    }
    
    public static SubLObject f4603(final SubLObject var111) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0063.NIL != f4604(Vectors.aref(var111, (SubLObject)module0063.ONE_INTEGER)) && module0063.NIL != f4605(Vectors.aref(var111, (SubLObject)module0063.THREE_INTEGER)) && module0063.NIL != f4606(Vectors.aref(var111, (SubLObject)module0063.FOUR_INTEGER)));
    }
    
    public static SubLObject f4604(final SubLObject var28) {
        return Types.sublisp_null(var28);
    }
    
    public static SubLObject f4605(final SubLObject var112) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0063.NIL == module0055.f4006(var112) || module0063.NIL != module0055.f4019(var112));
    }
    
    public static SubLObject f4606(final SubLObject var75) {
        return module0054.f3970(var75);
    }
    
    public static SubLObject f4607(final SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        final SubLObject var113 = Vectors.aref(var111, (SubLObject)module0063.ZERO_INTEGER);
        final SubLObject var114 = Vectors.aref(var111, (SubLObject)module0063.ONE_INTEGER);
        final SubLObject var115 = Vectors.aref(var111, (SubLObject)module0063.TWO_INTEGER);
        final SubLObject var116 = Vectors.aref(var111, (SubLObject)module0063.THREE_INTEGER);
        final SubLObject var117 = Vectors.aref(var111, (SubLObject)module0063.FOUR_INTEGER);
        var112.resetMultipleValues();
        final SubLObject var118 = (module0063.NIL != module0055.f4006(var116)) ? f4608(var113, var114, var115, var116, var117) : f4609(var113, var114, var115, var117);
        final SubLObject var119 = var112.secondMultipleValue();
        final SubLObject var120 = var112.thirdMultipleValue();
        var112.resetMultipleValues();
        if (module0063.NIL != var119) {
            Vectors.set_aref(var111, (SubLObject)module0063.ONE_INTEGER, (SubLObject)module0063.NIL);
            Vectors.set_aref(var111, (SubLObject)module0063.THREE_INTEGER, (SubLObject)module0063.NIL);
            module0054.f3969(var117);
        }
        else {
            Vectors.set_aref(var111, (SubLObject)module0063.ONE_INTEGER, var120);
        }
        return Values.values(var118, var111, var119);
    }
    
    public static SubLObject f4609(final SubLObject var22, SubLObject var28, final SubLObject var110, final SubLObject var75) {
        SubLObject var111;
        SubLObject var112;
        for (var111 = (SubLObject)module0063.NIL, var112 = (SubLObject)module0063.NIL; module0063.NIL == var111 && module0063.NIL == var112; var112 = (SubLObject)module0063.T) {
            if (module0063.NIL != f4551(var28)) {
                final SubLObject var113 = f4549(var28);
                if (module0063.NIL != f4583(var22, var113)) {
                    var111 = var113;
                }
            }
            else {
                final SubLObject var114 = f4550(var28);
                if (module0063.NIL != var110) {
                    SubLObject var115 = Sequences.reverse(var114);
                    SubLObject var116 = (SubLObject)module0063.NIL;
                    var116 = var115.first();
                    while (module0063.NIL != var115) {
                        module0054.f3973(var116, var75);
                        var115 = var115.rest();
                        var116 = var115.first();
                    }
                }
                else {
                    SubLObject var115 = var114;
                    SubLObject var116 = (SubLObject)module0063.NIL;
                    var116 = var115.first();
                    while (module0063.NIL != var115) {
                        module0054.f3973(var116, var75);
                        var115 = var115.rest();
                        var116 = var115.first();
                    }
                }
            }
            var28 = module0054.f3974(var75);
            if (module0063.NIL == var111 && module0063.NIL == var28 && module0063.NIL != module0054.f3970(var75)) {}
        }
        return Values.values(var111, var112, var28);
    }
    
    public static SubLObject f4608(final SubLObject var22, SubLObject var28, final SubLObject var110, final SubLObject var113, final SubLObject var75) {
        SubLObject var114;
        SubLObject var115;
        for (var114 = (SubLObject)module0063.NIL, var115 = (SubLObject)module0063.NIL; module0063.NIL == var114 && module0063.NIL == var115; var115 = (SubLObject)module0063.T) {
            if (module0063.NIL != module0055.f4019(var113)) {
                if (module0063.NIL != f4551(var28)) {
                    SubLObject var117;
                    final SubLObject var116 = var117 = f4549(var28);
                    SubLObject var118 = (SubLObject)module0063.NIL;
                    var118 = var117.first();
                    while (module0063.NIL != var117) {
                        if (module0063.NIL != f4583(var22, var118)) {
                            module0055.f4021(var118, var113);
                        }
                        var117 = var117.rest();
                        var118 = var117.first();
                    }
                }
                else {
                    final SubLObject var119 = f4550(var28);
                    if (module0063.NIL != var110) {
                        SubLObject var117 = Sequences.reverse(var119);
                        SubLObject var120 = (SubLObject)module0063.NIL;
                        var120 = var117.first();
                        while (module0063.NIL != var117) {
                            module0054.f3973(var120, var75);
                            var117 = var117.rest();
                            var120 = var117.first();
                        }
                    }
                    else {
                        SubLObject var117 = var119;
                        SubLObject var120 = (SubLObject)module0063.NIL;
                        var120 = var117.first();
                        while (module0063.NIL != var117) {
                            module0054.f3973(var120, var75);
                            var117 = var117.rest();
                            var120 = var117.first();
                        }
                    }
                }
                var28 = module0054.f3974(var75);
            }
            else {
                var114 = module0055.f4023(var113);
            }
            if (module0063.NIL == var114 && module0063.NIL == var28 && module0063.NIL != module0054.f3970(var75) && module0063.NIL != module0055.f4019(var113)) {}
        }
        return Values.values(var114, var115, var28);
    }
    
    public static SubLObject f4610(SubLObject var111) {
        if (module0063.NIL != module0055.f4006(Vectors.aref(var111, (SubLObject)module0063.THREE_INTEGER))) {
            module0055.f4018(Vectors.aref(var111, (SubLObject)module0063.THREE_INTEGER));
        }
        module0054.f3969(Vectors.aref(var111, (SubLObject)module0063.FOUR_INTEGER));
        SubLObject var112;
        for (var112 = (SubLObject)module0063.NIL, var112 = (SubLObject)module0063.ZERO_INTEGER; var112.numL((SubLObject)module0063.FIVE_INTEGER); var112 = Numbers.add(var112, (SubLObject)module0063.ONE_INTEGER)) {
            Vectors.set_aref(var111, var112, (SubLObject)module0063.NIL);
        }
        var111 = (SubLObject)module0063.NIL;
        return (SubLObject)module0063.T;
    }
    
    public static SubLObject f4611(final SubLObject var22, final SubLObject var44, SubLObject var68, SubLObject var53, SubLObject var54, SubLObject var110, SubLObject var115) {
        if (var68 == module0063.UNPROVIDED) {
            var68 = (SubLObject)module0063.NIL;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        if (var110 == module0063.UNPROVIDED) {
            var110 = (SubLObject)module0063.T;
        }
        if (var115 == module0063.UNPROVIDED) {
            var115 = (SubLObject)module0063.NIL;
        }
        final SubLObject var116 = f4612(var22, var44, var68, var53, var54, var110, var115);
        return module0052.f3689(var116, (SubLObject)module0063.$ic69$, (SubLObject)module0063.$ic70$, (SubLObject)module0063.$ic71$);
    }
    
    public static SubLObject f4612(final SubLObject var22, final SubLObject var44, final SubLObject var68, final SubLObject var53, final SubLObject var54, final SubLObject var110, final SubLObject var115) {
        final SubLObject var116 = Vectors.make_vector((SubLObject)module0063.FIVE_INTEGER, (SubLObject)module0063.NIL);
        final SubLObject var117 = f4613(var22, var44, var68, var53, var54, var110, var115);
        final SubLObject var118 = module0054.f3974(var117);
        Vectors.set_aref(var116, (SubLObject)module0063.ZERO_INTEGER, var22);
        Vectors.set_aref(var116, (SubLObject)module0063.ONE_INTEGER, var118);
        Vectors.set_aref(var116, (SubLObject)module0063.TWO_INTEGER, var110);
        Vectors.set_aref(var116, (SubLObject)module0063.THREE_INTEGER, (SubLObject)((module0063.NIL != f4526(var22)) ? module0063.NIL : module0055.f4017()));
        Vectors.set_aref(var116, (SubLObject)module0063.FOUR_INTEGER, var117);
        return var116;
    }
    
    public static SubLObject f4613(final SubLObject var22, final SubLObject var44, final SubLObject var68, final SubLObject var53, final SubLObject var54, final SubLObject var110, final SubLObject var115) {
        final SubLObject var116 = f4525(var22);
        final SubLObject var117 = Sequences.subseq(var44, var53, var54);
        final SubLObject var118 = module0054.f3968();
        if (module0063.NIL != var110) {
            f4614(var116, var118, var117, var68, var115);
        }
        else {
            f4615(var116, var118, var117, var68, var115);
        }
        return var118;
    }
    
    public static SubLObject f4614(final SubLObject var28, final SubLObject var75, final SubLObject var44, final SubLObject var68, final SubLObject var118) {
        if (module0063.NIL != module0035.f1995(var44, (SubLObject)module0063.ZERO_INTEGER, (SubLObject)module0063.UNPROVIDED)) {
            if (module0063.NIL == var118) {
                final SubLObject var119 = f4550(var28);
                SubLObject var120 = Sequences.reverse(var119);
                SubLObject var121 = (SubLObject)module0063.NIL;
                var121 = var120.first();
                while (module0063.NIL != var120) {
                    module0054.f3973(var121, var75);
                    var120 = var120.rest();
                    var121 = var120.first();
                }
            }
        }
        else {
            final SubLObject var119 = f4550(var28);
            final SubLObject var122 = Sequences.elt(var44, (SubLObject)module0063.ZERO_INTEGER);
            SubLObject var123 = (SubLObject)module0063.NIL;
            SubLObject var124 = Sequences.reverse(var119);
            SubLObject var125 = (SubLObject)module0063.NIL;
            var125 = var124.first();
            while (module0063.NIL != var124) {
                final SubLObject var126 = f4548(var125);
                if (var126 != module0063.$ic38$) {
                    if (module0063.NIL == f4555(var126, var122, var68)) {
                        if (module0063.NIL != f4554(var126, var122, var68)) {
                            var123 = (SubLObject)ConsesLow.cons(var125, var123);
                        }
                        else {
                            module0054.f3973(var125, var75);
                        }
                    }
                }
                var124 = var124.rest();
                var125 = var124.first();
            }
            var123 = (var124 = Sequences.nreverse(var123));
            var125 = (SubLObject)module0063.NIL;
            var125 = var124.first();
            while (module0063.NIL != var124) {
                f4614(var125, var75, Sequences.subseq(var44, (SubLObject)module0063.ONE_INTEGER, (SubLObject)module0063.UNPROVIDED), var68, var118);
                var124 = var124.rest();
                var125 = var124.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4615(final SubLObject var28, final SubLObject var75, final SubLObject var44, final SubLObject var68, final SubLObject var120) {
        if (module0063.NIL != module0035.f1995(var44, (SubLObject)module0063.ZERO_INTEGER, (SubLObject)module0063.UNPROVIDED)) {
            if (module0063.NIL == var120) {
                SubLObject var122;
                final SubLObject var121 = var122 = f4550(var28);
                SubLObject var123 = (SubLObject)module0063.NIL;
                var123 = var122.first();
                while (module0063.NIL != var122) {
                    module0054.f3973(var123, var75);
                    var122 = var122.rest();
                    var123 = var122.first();
                }
            }
        }
        else {
            final SubLObject var121 = f4550(var28);
            final SubLObject var124 = Sequences.elt(var44, (SubLObject)module0063.ZERO_INTEGER);
            SubLObject var125 = (SubLObject)module0063.NIL;
            SubLObject var126 = var121;
            SubLObject var127 = (SubLObject)module0063.NIL;
            var127 = var126.first();
            while (module0063.NIL != var126) {
                final SubLObject var128 = f4548(var127);
                if (var128 == module0063.$ic38$) {
                    module0054.f3973(var127, var75);
                }
                else if (module0063.NIL != f4555(var128, var124, var68)) {
                    module0054.f3973(var127, var75);
                }
                else if (module0063.NIL != f4554(var128, var124, var68)) {
                    var125 = (SubLObject)ConsesLow.cons(var127, var125);
                }
                var126 = var126.rest();
                var127 = var126.first();
            }
            var125 = (var126 = Sequences.nreverse(var125));
            var127 = (SubLObject)module0063.NIL;
            var127 = var126.first();
            while (module0063.NIL != var126) {
                f4615(var127, var75, Sequences.subseq(var44, (SubLObject)module0063.ONE_INTEGER, (SubLObject)module0063.UNPROVIDED), var68, var120);
                var126 = var126.rest();
                var127 = var126.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4616() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return Vectors.make_vector(module0063.$g1073$.getDynamicValue(var20), (SubLObject)module0063.NIL);
    }
    
    public static SubLObject f4617() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)module0063.NIL;
        final SubLObject var22 = module0063.$g1072$.getDynamicValue(var20);
        SubLObject var23 = (SubLObject)module0063.NIL;
        try {
            var23 = Locks.seize_lock(var22);
            if (module0063.NIL != module0063.$g1071$.getDynamicValue(var20)) {
                final SubLObject var24 = module0063.$g1071$.getDynamicValue(var20);
                module0063.$g1071$.setDynamicValue(Vectors.aref(var24, (SubLObject)module0063.ZERO_INTEGER), var20);
                Vectors.set_aref(var24, (SubLObject)module0063.ZERO_INTEGER, (SubLObject)module0063.NIL);
                var21 = var24;
            }
        }
        finally {
            if (module0063.NIL != var23) {
                Locks.release_lock(var22);
            }
        }
        if (module0063.NIL == var21) {
            var21 = f4616();
        }
        return var21;
    }
    
    public static SubLObject f4618(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (var124.isVector()) {
            final SubLObject var126 = module0063.$g1072$.getDynamicValue(var125);
            SubLObject var127 = (SubLObject)module0063.NIL;
            try {
                var127 = Locks.seize_lock(var126);
                Vectors.set_aref(var124, (SubLObject)module0063.ZERO_INTEGER, module0063.$g1071$.getDynamicValue(var125));
                module0063.$g1071$.setDynamicValue(var124, var125);
            }
            finally {
                if (module0063.NIL != var127) {
                    Locks.release_lock(var126);
                }
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4572(final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        if (module0063.NIL != module0063.$g1066$.getDynamicValue(var46)) {
            module0063.$g1074$.setDynamicValue(f4617(), var46);
            module0063.$g1075$.setDynamicValue((SubLObject)module0063.ZERO_INTEGER, var46);
            f4573(var45);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4576() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0063.NIL != module0063.$g1066$.getDynamicValue(var20)) {
            f4618(module0063.$g1074$.getDynamicValue(var20));
            module0063.$g1075$.setDynamicValue((SubLObject)module0063.ZERO_INTEGER, var20);
            module0063.$g1074$.setDynamicValue((SubLObject)module0063.NIL, var20);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4573(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0063.NIL != module0063.$g1066$.getDynamicValue(var29)) {
            if (module0063.$g1075$.getDynamicValue(var29).numGE(Sequences.length(module0063.$g1074$.getDynamicValue(var29)))) {
                module0063.$g1074$.setDynamicValue(module0037.f2565(module0063.$g1074$.getDynamicValue(var29), (SubLObject)module0063.NIL, (SubLObject)module0063.TWO_INTEGER), var29);
            }
            Vectors.set_aref(module0063.$g1074$.getDynamicValue(var29), module0063.$g1075$.getDynamicValue(var29), var28);
            module0063.$g1075$.setDynamicValue(Numbers.add(module0063.$g1075$.getDynamicValue(var29), (SubLObject)module0063.ONE_INTEGER), var29);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4590() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0063.NIL != module0063.$g1066$.getDynamicValue(var20)) {
            module0063.$g1075$.setDynamicValue(Numbers.subtract(module0063.$g1075$.getDynamicValue(var20), (SubLObject)module0063.ONE_INTEGER), var20);
            Vectors.set_aref(module0063.$g1074$.getDynamicValue(var20), module0063.$g1075$.getDynamicValue(var20), (SubLObject)module0063.NIL);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4619() {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        return Values.values(module0063.$g1074$.getDynamicValue(var20), module0063.$g1075$.getDynamicValue(var20));
    }
    
    public static SubLObject f4620(final SubLObject var127) {
        return Numbers.numE(var127, (SubLObject)module0063.ZERO_INTEGER);
    }
    
    public static SubLObject f4621(final SubLObject var128, final SubLObject var127) {
        if (module0063.NIL != f4620(var127)) {
            return (SubLObject)module0063.NIL;
        }
        return Vectors.aref(var128, Numbers.subtract(var127, (SubLObject)module0063.ONE_INTEGER));
    }
    
    public static SubLObject f4622(final SubLObject var128, final SubLObject var127) {
        return f4621(var128, var127);
    }
    
    public static SubLObject f4623(final SubLObject var127) {
        return Numbers.subtract(var127, (SubLObject)module0063.ONE_INTEGER);
    }
    
    public static SubLObject f4624(final SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLThread var129 = SubLProcess.currentSubLThread();
        SubLObject var130 = (SubLObject)module0063.NIL;
        SubLObject var131 = (SubLObject)module0063.NIL;
        try {
            var129.throwStack.push(module0063.$ic59$);
            SubLObject var132;
            SubLObject var133;
            SubLObject var134;
            for (var132 = Numbers.subtract(var127, (SubLObject)module0063.ONE_INTEGER), var133 = (SubLObject)module0063.NIL, var133 = (SubLObject)module0063.ZERO_INTEGER; var133.numL(var132); var133 = Numbers.add(var133, (SubLObject)module0063.ONE_INTEGER)) {
                var134 = Vectors.aref(var128, var133);
                if (module0063.NIL != f4625(var134, var48)) {
                    var130 = (SubLObject)module0063.T;
                    module0012.f425();
                }
            }
        }
        catch (Throwable var135) {
            var131 = Errors.handleThrowable(var135, (SubLObject)module0063.$ic59$);
        }
        finally {
            var129.throwStack.pop();
        }
        return var130;
    }
    
    public static SubLObject f4626(final SubLObject var16, final SubLObject var132, SubLObject var15, SubLObject var18, SubLObject var40) {
        if (var15 == module0063.UNPROVIDED) {
            var15 = (SubLObject)module0063.NIL;
        }
        if (var18 == module0063.UNPROVIDED) {
            var18 = (SubLObject)module0063.T;
        }
        if (var40 == module0063.UNPROVIDED) {
            var40 = (SubLObject)module0063.EQL;
        }
        final SubLObject var133 = f4560(var16, var15, var18, var40);
        f4533(var133, (SubLObject)module0063.$ic74$);
        f4537(var133, (SubLObject)module0063.T);
        f4539(var133, var132);
        f4538(var133, (SubLObject)module0063.NIL);
        return var133;
    }
    
    public static SubLObject f4627(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0063.NIL != f4523(var13) && module0063.NIL != f4529(var13));
    }
    
    public static SubLObject f4628(final SubLObject var22, SubLObject var133) {
        if (var133 == module0063.UNPROVIDED) {
            var133 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4627(var22) : var22;
        f4533(var22, (SubLObject)module0063.$ic74$);
        if (module0063.NIL != var133) {
            f4538(var22, (SubLObject)module0063.NIL);
        }
        else {
            SubLObject var134 = f4530(var22);
            SubLObject var135 = (SubLObject)module0063.NIL;
            var135 = var134.first();
            while (module0063.NIL != var134) {
                SubLObject var137;
                final SubLObject var136 = var137 = var135;
                SubLObject var138 = (SubLObject)module0063.NIL;
                SubLObject var139 = (SubLObject)module0063.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var137, var136, (SubLObject)module0063.$ic76$);
                var138 = var137.first();
                var137 = (var139 = var137.rest());
                f4563(var139);
                var134 = var134.rest();
                var135 = var134.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4629(final SubLObject var22, final SubLObject var48) {
        assert module0063.NIL != f4627(var22) : var22;
        final SubLObject var49 = f4526(var22);
        final SubLObject var50 = f4524(var22);
        final SubLObject var51 = f4527(var22);
        final SubLObject var52 = f4528(var22);
        final SubLObject var53 = PrintLow.format((SubLObject)module0063.NIL, (SubLObject)module0063.$ic77$, var50, var48);
        final SubLObject var54 = f4560(var49, var53, var51, var52);
        f4538(var22, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var48, var54), f4530(var22)));
        return var48;
    }
    
    public static SubLObject f4630(final SubLObject var22, final SubLObject var48) {
        assert module0063.NIL != f4627(var22) : var22;
        f4538(var22, Sequences.delete(var48, f4530(var22), Symbols.symbol_function((SubLObject)module0063.EQL), Symbols.symbol_function((SubLObject)module0063.$ic78$), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED));
        return var48;
    }
    
    public static SubLObject f4631(final SubLObject var22) {
        assert module0063.NIL != f4627(var22) : var22;
        SubLObject var23 = (SubLObject)module0063.NIL;
        if (module0063.NIL == var23) {
            SubLObject var24 = f4530(var22);
            SubLObject var25 = (SubLObject)module0063.NIL;
            var25 = var24.first();
            while (module0063.NIL == var23 && module0063.NIL != var24) {
                SubLObject var27;
                final SubLObject var26 = var27 = var25;
                SubLObject var28 = (SubLObject)module0063.NIL;
                SubLObject var29 = (SubLObject)module0063.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0063.$ic79$);
                var28 = var27.first();
                var27 = (var29 = var27.rest());
                var23 = (SubLObject)SubLObjectFactory.makeBoolean(module0063.NIL == f4567(var29));
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0063.NIL == var23);
    }
    
    public static SubLObject f4632(final SubLObject var22) {
        assert module0063.NIL != f4627(var22) : var22;
        SubLObject var23 = (SubLObject)module0063.ZERO_INTEGER;
        SubLObject var24 = f4530(var22);
        SubLObject var25 = (SubLObject)module0063.NIL;
        var25 = var24.first();
        while (module0063.NIL != var24) {
            SubLObject var27;
            final SubLObject var26 = var27 = var25;
            SubLObject var28 = (SubLObject)module0063.NIL;
            SubLObject var29 = (SubLObject)module0063.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var27, var26, (SubLObject)module0063.$ic79$);
            var28 = var27.first();
            var27 = (var29 = var27.rest());
            var23 = Numbers.add(var23, f4568(var29));
            var24 = var24.rest();
            var25 = var24.first();
        }
        return var23;
    }
    
    public static SubLObject f4633(final SubLObject var22, SubLObject var2) {
        if (var2 == module0063.UNPROVIDED) {
            var2 = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert module0063.NIL != f4627(var22) : var22;
        PrintLow.format(var2, (SubLObject)module0063.$ic80$, Sequences.length(f4530(var22)));
        SubLObject var23 = f4530(var22);
        SubLObject var24 = (SubLObject)module0063.NIL;
        var24 = var23.first();
        while (module0063.NIL != var23) {
            SubLObject var26;
            final SubLObject var25 = var26 = var24;
            SubLObject var27 = (SubLObject)module0063.NIL;
            SubLObject var28 = (SubLObject)module0063.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0063.$ic79$);
            var27 = var26.first();
            var26 = (var28 = var26.rest());
            PrintLow.format(var2, (SubLObject)module0063.$ic81$, var27);
            f4570(var28, var2);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f4634(final SubLObject var22, final SubLObject var44, SubLObject var13, SubLObject var53, SubLObject var54) {
        if (var13 == module0063.UNPROVIDED) {
            var13 = var44;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4627(var22) : var22;
        final SubLObject var55 = f4531(var22);
        final SubLObject var56 = Functions.funcall(var55, var13);
        final SubLObject var57 = conses_high.assoc(var56, f4530(var22), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED).rest();
        if (module0063.NIL != f4523(var57)) {
            f4562(var57, var44, var13, var53, var54);
            return (SubLObject)module0063.T;
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4635(final SubLObject var22, final SubLObject var44, SubLObject var13, SubLObject var53, SubLObject var54) {
        if (var13 == module0063.UNPROVIDED) {
            var13 = var44;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4627(var22) : var22;
        final SubLObject var55 = f4531(var22);
        final SubLObject var56 = Functions.funcall(var55, var13);
        final SubLObject var57 = conses_high.assoc(var56, f4530(var22), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED).rest();
        if (module0063.NIL != f4523(var57)) {
            f4577(var57, var44, var13, var53, var54);
            return (SubLObject)module0063.T;
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4636(final SubLObject var22, final SubLObject var44, SubLObject var53, SubLObject var54) {
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4627(var22) : var22;
        SubLObject var55 = (SubLObject)module0063.ZERO_INTEGER;
        SubLObject var56 = f4530(var22);
        SubLObject var57 = (SubLObject)module0063.NIL;
        var57 = var56.first();
        while (module0063.NIL != var56) {
            SubLObject var59;
            final SubLObject var58 = var59 = var57;
            SubLObject var60 = (SubLObject)module0063.NIL;
            SubLObject var61 = (SubLObject)module0063.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var59, var58, (SubLObject)module0063.$ic79$);
            var60 = var59.first();
            var59 = (var61 = var59.rest());
            var55 = Numbers.add(var55, f4579(var61, var44, var53, var54));
            var56 = var56.rest();
            var57 = var56.first();
        }
        return var55;
    }
    
    public static SubLObject f4637(final SubLObject var22, final SubLObject var44, SubLObject var68, SubLObject var151, SubLObject var53, SubLObject var54) {
        if (var68 == module0063.UNPROVIDED) {
            var68 = (SubLObject)module0063.NIL;
        }
        if (var151 == module0063.UNPROVIDED) {
            var151 = (SubLObject)module0063.$ic0$;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4627(var22) : var22;
        SubLObject var152 = (SubLObject)module0063.NIL;
        SubLObject var153 = f4530(var22);
        SubLObject var154 = (SubLObject)module0063.NIL;
        var154 = var153.first();
        while (module0063.NIL != var153) {
            SubLObject var156;
            final SubLObject var155 = var156 = var154;
            SubLObject var157 = (SubLObject)module0063.NIL;
            SubLObject var158 = (SubLObject)module0063.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var156, var155, (SubLObject)module0063.$ic79$);
            var157 = var156.first();
            var156 = (var158 = var156.rest());
            if (var151 == module0063.$ic0$ || module0063.NIL != conses_high.member(var157, var151, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                final SubLObject var159 = f4581(var158, var44, var68, var53, var54);
                if (module0063.NIL != var159) {
                    var152 = (SubLObject)ConsesLow.cons(var159, var152);
                }
            }
            var153 = var153.rest();
            var154 = var153.first();
        }
        return Sequences.nreverse(var152);
    }
    
    public static SubLObject f4638(final SubLObject var22, final SubLObject var44, SubLObject var68, SubLObject var72, SubLObject var151, SubLObject var53, SubLObject var54) {
        if (var68 == module0063.UNPROVIDED) {
            var68 = (SubLObject)module0063.NIL;
        }
        if (var72 == module0063.UNPROVIDED) {
            var72 = (SubLObject)module0063.NIL;
        }
        if (var151 == module0063.UNPROVIDED) {
            var151 = (SubLObject)module0063.$ic0$;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4627(var22) : var22;
        SubLObject var152 = (SubLObject)module0063.NIL;
        SubLObject var153 = f4530(var22);
        SubLObject var154 = (SubLObject)module0063.NIL;
        var154 = var153.first();
        while (module0063.NIL != var153) {
            SubLObject var156;
            final SubLObject var155 = var156 = var154;
            SubLObject var157 = (SubLObject)module0063.NIL;
            SubLObject var158 = (SubLObject)module0063.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var156, var155, (SubLObject)module0063.$ic79$);
            var157 = var156.first();
            var156 = (var158 = var156.rest());
            if (var151 == module0063.$ic0$ || module0063.NIL != conses_high.member(var157, var151, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                final SubLObject var159 = f4584(var158, var44, var68, var72, var53, var54);
                var152 = ConsesLow.append(var159, var152);
            }
            var153 = var153.rest();
            var154 = var153.first();
        }
        return Sequences.nreverse(var152);
    }
    
    public static SubLObject f4639(final SubLObject var22, final SubLObject var44, SubLObject var68, SubLObject var151, SubLObject var53, SubLObject var54) {
        if (var68 == module0063.UNPROVIDED) {
            var68 = (SubLObject)module0063.NIL;
        }
        if (var151 == module0063.UNPROVIDED) {
            var151 = (SubLObject)module0063.$ic0$;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        assert module0063.NIL != f4627(var22) : var22;
        SubLObject var152 = (SubLObject)module0063.NIL;
        SubLObject var153 = f4530(var22);
        SubLObject var154 = (SubLObject)module0063.NIL;
        var154 = var153.first();
        while (module0063.NIL != var153) {
            SubLObject var156;
            final SubLObject var155 = var156 = var154;
            SubLObject var157 = (SubLObject)module0063.NIL;
            SubLObject var158 = (SubLObject)module0063.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var156, var155, (SubLObject)module0063.$ic79$);
            var157 = var156.first();
            var156 = (var158 = var156.rest());
            if (var151 == module0063.$ic0$ || module0063.NIL != conses_high.member(var157, var151, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                final SubLObject var159 = f4592(var158, var44, var68, var53, var54);
                var152 = ConsesLow.append(var159, var152);
            }
            var153 = var153.rest();
            var154 = var153.first();
        }
        return Sequences.nreverse(var152);
    }
    
    public static SubLObject f4640(final SubLObject var84, final SubLObject var22, SubLObject var151) {
        if (var151 == module0063.UNPROVIDED) {
            var151 = (SubLObject)module0063.$ic0$;
        }
        assert module0063.NIL != f4627(var22) : var22;
        SubLObject var152 = f4530(var22);
        SubLObject var153 = (SubLObject)module0063.NIL;
        var153 = var152.first();
        while (module0063.NIL != var152) {
            SubLObject var155;
            final SubLObject var154 = var155 = var153;
            SubLObject var156 = (SubLObject)module0063.NIL;
            SubLObject var157 = (SubLObject)module0063.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var155, var154, (SubLObject)module0063.$ic79$);
            var156 = var155.first();
            var155 = (var157 = var155.rest());
            if (var151 == module0063.$ic0$ || module0063.NIL != conses_high.member(var156, var151, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                f4595(var84, var157);
            }
            var152 = var152.rest();
            var153 = var152.first();
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4641(final SubLObject var84, final SubLObject var22, final SubLObject var48) {
        assert module0063.NIL != f4627(var22) : var22;
        final SubLObject var85 = conses_high.assoc(var48, f4530(var22), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED).rest();
        if (module0063.NIL != f4523(var85)) {
            f4595(var84, var85);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4642(final SubLObject var84, final SubLObject var22, final SubLObject var44, SubLObject var151, SubLObject var53, SubLObject var54, SubLObject var88) {
        if (var151 == module0063.UNPROVIDED) {
            var151 = (SubLObject)module0063.$ic0$;
        }
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        if (var88 == module0063.UNPROVIDED) {
            var88 = (SubLObject)module0063.T;
        }
        assert module0063.NIL != f4627(var22) : var22;
        SubLObject var152 = f4530(var22);
        SubLObject var153 = (SubLObject)module0063.NIL;
        var153 = var152.first();
        while (module0063.NIL != var152) {
            SubLObject var155;
            final SubLObject var154 = var155 = var153;
            SubLObject var156 = (SubLObject)module0063.NIL;
            SubLObject var157 = (SubLObject)module0063.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var155, var154, (SubLObject)module0063.$ic79$);
            var156 = var155.first();
            var155 = (var157 = var155.rest());
            if (var151 == module0063.$ic0$ || module0063.NIL != conses_high.member(var156, var151, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                f4597(var84, var157, var44, var53, var54, var88);
            }
            var152 = var152.rest();
            var153 = var152.first();
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4643(final SubLObject var84, final SubLObject var22, final SubLObject var44, final SubLObject var48, SubLObject var53, SubLObject var54, SubLObject var88) {
        if (var53 == module0063.UNPROVIDED) {
            var53 = (SubLObject)module0063.ZERO_INTEGER;
        }
        if (var54 == module0063.UNPROVIDED) {
            var54 = (SubLObject)module0063.NIL;
        }
        if (var88 == module0063.UNPROVIDED) {
            var88 = (SubLObject)module0063.T;
        }
        assert module0063.NIL != f4627(var22) : var22;
        final SubLObject var89 = conses_high.assoc(var48, f4530(var22), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED).rest();
        if (module0063.NIL != f4523(var89)) {
            f4597(var84, var89, var44, var53, var54, var88);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4582(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0063.NIL == f4529(var22)) {
            return (SubLObject)module0063.T;
        }
        if (module0063.NIL == module0063.$g1065$.getDynamicValue(var23)) {
            return (SubLObject)module0063.NIL;
        }
        if (module0063.$g1065$.getDynamicValue(var23).isAtom()) {
            return (SubLObject)module0063.T;
        }
        SubLObject var24 = (SubLObject)module0063.NIL;
        var23.resetMultipleValues();
        final SubLObject var25 = f4619();
        final SubLObject var26 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        if (module0063.NIL == var24) {
            SubLObject var27 = module0063.$g1065$.getDynamicValue(var23);
            SubLObject var28 = (SubLObject)module0063.NIL;
            var28 = var27.first();
            while (module0063.NIL == var24 && module0063.NIL != var27) {
                SubLObject var29 = (SubLObject)module0063.NIL;
                SubLObject var30 = (SubLObject)module0063.NIL;
                try {
                    var23.throwStack.push(module0063.$ic59$);
                    SubLObject var31;
                    SubLObject var32;
                    for (var31 = (SubLObject)module0063.NIL, var31 = (SubLObject)module0063.ZERO_INTEGER; var31.numL(var26); var31 = Numbers.add(var31, (SubLObject)module0063.ONE_INTEGER)) {
                        var32 = Vectors.aref(var25, var31);
                        if (module0063.NIL != ((module0063.NIL != f4551(var32)) ? f4644(var22, var32, var28) : f4625(var32, var28))) {
                            var29 = (SubLObject)module0063.T;
                            module0012.f425();
                        }
                    }
                }
                catch (Throwable var33) {
                    var30 = Errors.handleThrowable(var33, (SubLObject)module0063.$ic59$);
                }
                finally {
                    var23.throwStack.pop();
                }
                if (module0063.NIL == var29) {
                    var24 = (SubLObject)module0063.T;
                }
                var27 = var27.rest();
                var28 = var27.first();
            }
        }
        return var24;
    }
    
    public static SubLObject f4583(final SubLObject var22, final SubLObject var13) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0063.NIL == f4529(var22)) {
            return (SubLObject)module0063.T;
        }
        if (module0063.NIL == module0063.$g1065$.getDynamicValue(var23)) {
            return (SubLObject)module0063.NIL;
        }
        if (module0063.$g1065$.getDynamicValue(var23).isAtom()) {
            return (SubLObject)module0063.T;
        }
        final SubLObject var24 = Functions.funcall(f4531(var22), var13);
        return conses_high.member(var24, module0063.$g1065$.getDynamicValue(var23), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED);
    }
    
    public static SubLObject f4587(final SubLObject var22, final SubLObject var167) {
        SubLObject var168 = (SubLObject)module0063.NIL;
        SubLObject var169 = var167;
        SubLObject var170 = (SubLObject)module0063.NIL;
        var170 = var169.first();
        while (module0063.NIL != var169) {
            if (module0063.NIL != f4583(var22, var170)) {
                var168 = (SubLObject)ConsesLow.cons(var170, var168);
            }
            var169 = var169.rest();
            var170 = var169.first();
        }
        return var168;
    }
    
    public static SubLObject f4645(final SubLObject var22, final SubLObject var48) {
        assert module0063.NIL != f4523(var22) : var22;
        if (module0063.NIL != f4529(var22)) {
            final SubLObject var49 = f4530(var22);
            if (module0063.NIL == Sequences.find(var48, var49, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                f4538(var22, (SubLObject)ConsesLow.cons(var48, var49));
                f4566(f4525(var22), var48);
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4646(final SubLObject var22, final SubLObject var48) {
        assert module0063.NIL != f4523(var22) : var22;
        if (module0063.NIL != f4529(var22)) {
            final SubLObject var49 = f4530(var22);
            if (module0063.NIL != Sequences.find(var48, var49, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                f4538(var22, module0035.f2073(var48, var49, (SubLObject)module0063.UNPROVIDED));
                f4565(f4525(var22), var48);
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4564(final SubLObject var28) {
        final SubLObject var29 = var28.first();
        if (var29.isCons()) {
            return var29.rest();
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4625(final SubLObject var28, final SubLObject var48) {
        return Sequences.find(var48, f4564(var28), (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED);
    }
    
    public static SubLObject f4647(final SubLObject var28, final SubLObject var51) {
        final SubLObject var52 = f4548(var28);
        if (var52 != module0063.$ic38$) {
            if (module0063.NIL == var51) {
                ConsesLow.rplaca(var28, var52);
            }
            else {
                final SubLObject var53 = var28.first();
                if (var53.isCons()) {
                    ConsesLow.rplacd(var53, var51);
                }
                else {
                    ConsesLow.rplaca(var28, (SubLObject)ConsesLow.cons(var52, var51));
                }
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4644(final SubLObject var22, final SubLObject var168, final SubLObject var48) {
        final SubLObject var169 = f4549(var168);
        final SubLObject var170 = f4531(var22);
        if (module0063.NIL != f4526(var22)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(!var48.eql(Functions.funcall(var170, var169)));
        }
        SubLObject var171 = var169;
        SubLObject var172 = (SubLObject)module0063.NIL;
        var172 = var171.first();
        while (module0063.NIL != var171) {
            if (var48.eql(Functions.funcall(var170, var172))) {
                return (SubLObject)module0063.NIL;
            }
            var171 = var171.rest();
            var172 = var171.first();
        }
        return (SubLObject)module0063.T;
    }
    
    public static SubLObject f4566(final SubLObject var28, final SubLObject var48) {
        if (module0063.NIL == f4551(var28)) {
            final SubLObject var49 = f4564(var28);
            if (module0063.NIL == Sequences.find(var48, var49, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                f4647(var28, (SubLObject)ConsesLow.cons(var48, var49));
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4565(final SubLObject var28, final SubLObject var48) {
        if (module0063.NIL == f4551(var28)) {
            final SubLObject var49 = f4564(var28);
            if (module0063.NIL != Sequences.find(var48, var49, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED, (SubLObject)module0063.UNPROVIDED)) {
                f4647(var28, module0035.f2073(var48, var49, (SubLObject)module0063.UNPROVIDED));
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4648(final SubLObject var22, SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLObject var129 = f4621(var128, var127);
        var127 = f4623(var127);
        if (module0063.NIL != f4625(var129, var48)) {
            return f4565(var129, var48);
        }
        final SubLObject var130 = f4622(var128, var127);
        SubLObject var132;
        final SubLObject var131 = var132 = f4550(var130);
        SubLObject var133 = (SubLObject)module0063.NIL;
        var133 = var132.first();
        while (module0063.NIL != var132) {
            if (!var129.eql(var133) && module0063.NIL == f4551(var133)) {
                f4566(var133, var48);
            }
            var132 = var132.rest();
            var133 = var132.first();
        }
        return f4648(var22, var127, var128, var48);
    }
    
    public static SubLObject f4649(final SubLObject var22, SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLObject var129 = f4621(var128, var127);
        var127 = f4623(var127);
        if (module0063.NIL != f4620(var127)) {
            return f4566(var129, var48);
        }
        final SubLObject var130 = f4622(var128, var127);
        SubLObject var132;
        final SubLObject var131 = var132 = f4550(var130);
        SubLObject var133 = (SubLObject)module0063.NIL;
        var133 = var132.first();
        while (module0063.NIL != var132) {
            if (!var129.eql(var133)) {
                if (module0063.NIL != f4551(var133)) {
                    if (module0063.NIL == f4644(var22, var133, var48)) {
                        return f4566(var129, var48);
                    }
                }
                else if (module0063.NIL == f4625(var133, var48)) {
                    return f4566(var129, var48);
                }
            }
            var132 = var132.rest();
            var133 = var132.first();
        }
        var132 = var131;
        var133 = (SubLObject)module0063.NIL;
        var133 = var132.first();
        while (module0063.NIL != var132) {
            if (!var129.eql(var133) && module0063.NIL == f4551(var133)) {
                f4565(var133, var48);
            }
            var132 = var132.rest();
            var133 = var132.first();
        }
        return f4649(var22, var127, var128, var48);
    }
    
    public static SubLObject f4574(final SubLObject var22, final SubLObject var13) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0063.NIL != f4529(var22)) {
            var23.resetMultipleValues();
            final SubLObject var24 = f4619();
            final SubLObject var25 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            final SubLObject var26 = Functions.funcall(f4531(var22), var13);
            final SubLObject var27 = f4530(var22);
            final SubLObject var28 = f4621(var24, var25);
            assert module0063.NIL != f4551(var28) : var28;
            SubLObject var29 = var27;
            SubLObject var30 = (SubLObject)module0063.NIL;
            var30 = var29.first();
            while (module0063.NIL != var29) {
                if (var30.eql(var26)) {
                    f4650(var22, var25, var24, var30);
                }
                else {
                    f4651(var22, var25, var24, var30);
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4650(final SubLObject var22, final SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLObject var129 = f4624(var127, var128, var48);
        if (module0063.NIL != var129) {
            f4648(var22, var127, var128, var48);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4651(final SubLObject var22, final SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLObject var129 = f4624(var127, var128, var48);
        if (module0063.NIL != var129) {
            return (SubLObject)module0063.NIL;
        }
        final SubLObject var130 = f4621(var128, var127);
        if (module0063.NIL == f4644(var22, var130, var48)) {
            return (SubLObject)module0063.NIL;
        }
        f4649(var22, var127, var128, var48);
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4575(final SubLObject var22, final SubLObject var13) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0063.NIL != f4529(var22)) {
            var23.resetMultipleValues();
            final SubLObject var24 = f4619();
            final SubLObject var25 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            final SubLObject var26 = Functions.funcall(f4531(var22), var13);
            SubLObject var28;
            final SubLObject var27 = var28 = f4530(var22);
            SubLObject var29 = (SubLObject)module0063.NIL;
            var29 = var28.first();
            while (module0063.NIL != var28) {
                if (var29.eql(var26)) {
                    f4652(var22, var25, var24, var29);
                }
                else {
                    f4653(var22, var25, var24, var29);
                }
                var28 = var28.rest();
                var29 = var28.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4652(final SubLObject var22, final SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLObject var129 = f4624(var127, var128, var48);
        if (module0063.NIL != var129) {
            return f4648(var22, var127, var128, var48);
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4653(final SubLObject var22, final SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLObject var129 = f4624(var127, var128, var48);
        if (module0063.NIL != var129) {
            return (SubLObject)module0063.NIL;
        }
        final SubLObject var130 = f4621(var128, var127);
        if (module0063.NIL != f4550(var130)) {
            return (SubLObject)module0063.NIL;
        }
        f4649(var22, var127, var128, var48);
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4578(final SubLObject var22, final SubLObject var13) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0063.NIL != f4529(var22)) {
            var23.resetMultipleValues();
            final SubLObject var24 = f4619();
            final SubLObject var25 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            final SubLObject var26 = Functions.funcall(f4531(var22), var13);
            final SubLObject var27 = f4621(var24, var25);
            assert module0063.NIL != f4551(var27) : var27;
            if (module0063.NIL != f4644(var22, var27, var26)) {
                f4654(var22, var25, var24, var26);
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4654(final SubLObject var22, final SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLObject var129 = f4624(var127, var128, var48);
        if (module0063.NIL != var129) {
            return (SubLObject)module0063.NIL;
        }
        f4649(var22, var127, var128, var48);
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4580(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0063.NIL != f4529(var22)) {
            var23.resetMultipleValues();
            final SubLObject var24 = f4619();
            final SubLObject var25 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            SubLObject var27;
            final SubLObject var26 = var27 = f4530(var22);
            SubLObject var28 = (SubLObject)module0063.NIL;
            var28 = var27.first();
            while (module0063.NIL != var27) {
                f4655(var22, var25, var24, var28);
                var27 = var27.rest();
                var28 = var27.first();
            }
        }
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4655(final SubLObject var22, final SubLObject var127, final SubLObject var128, final SubLObject var48) {
        final SubLObject var129 = f4624(var127, var128, var48);
        if (module0063.NIL != var129) {
            return (SubLObject)module0063.NIL;
        }
        f4649(var22, var127, var128, var48);
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4656() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4521", "S#6064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4523", "S#3939", 1, 0, false);
        new $f4523$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4524", "S#6065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4525", "S#6066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4526", "S#6067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4527", "S#6068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4528", "S#6069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4529", "S#6070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4530", "S#6071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4531", "S#6072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4532", "S#6073", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4533", "S#6074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4534", "S#6075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4535", "S#6076", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4536", "S#6077", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4537", "S#6078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4538", "S#6079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4539", "S#6080", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4540", "S#6081", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4541", "S#6082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4542", "S#6083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4522", "S#6084", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4543", "S#6085", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4544", "S#6086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4545", "S#6087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4546", "S#6088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4547", "S#6089", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4548", "S#6090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4549", "S#6091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4550", "S#6092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4551", "S#6093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4552", "S#6094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4553", "S#6095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4554", "S#6096", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4555", "S#6097", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4556", "S#6098", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4557", "S#6099", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4558", "S#6100", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4559", "S#6101", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4560", "S#6102", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4561", "S#6103", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4563", "S#6104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4567", "S#6105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4568", "S#6106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4569", "S#6107", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4570", "S#6108", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4571", "S#6109", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4562", "S#6110", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4577", "S#6111", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4579", "S#6112", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4581", "S#3940", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4584", "S#6113", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4585", "S#6114", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4586", "S#6115", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4589", "S#6116", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4588", "S#6117", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4591", "S#6118", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4592", "S#6119", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4593", "S#6120", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4594", "S#6121", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4595", "S#6122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4596", "S#6123", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4597", "S#6124", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4598", "S#6125", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4599", "S#6126", 8, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0063", "f4600", "S#6127");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4601", "S#6128", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4602", "S#6129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4603", "S#6130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4604", "S#6131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4605", "S#6132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4606", "S#6133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4607", "S#6134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4609", "S#6135", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4608", "S#6136", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4610", "S#6137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4611", "S#6138", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4612", "S#6139", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4613", "S#6140", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4614", "S#6141", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4615", "S#6142", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4616", "S#6143", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4617", "S#6144", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4618", "S#6145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4572", "S#6146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4576", "S#6147", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4573", "S#6148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4590", "S#6149", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4619", "S#6150", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4620", "S#6151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4621", "S#6152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4622", "S#6153", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4623", "S#6154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4624", "S#6155", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4626", "S#6156", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4627", "S#6157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4628", "S#6158", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4629", "S#6159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4630", "S#6160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4631", "S#6161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4632", "S#6162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4633", "S#6163", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4634", "S#6164", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4635", "S#6165", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4636", "S#6166", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4637", "S#6167", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4638", "S#6168", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4639", "S#6169", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4640", "S#6170", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4641", "S#6171", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4642", "S#6172", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4643", "S#6173", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4582", "S#6174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4583", "S#6175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4587", "S#6176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4645", "S#6177", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4646", "S#6178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4564", "S#6179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4625", "S#6180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4647", "S#6181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4644", "S#6182", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4566", "S#6183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4565", "S#6184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4648", "S#6185", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4649", "S#6186", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4574", "S#6187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4650", "S#6188", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4651", "S#6189", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4575", "S#6190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4652", "S#6191", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4653", "S#6192", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4578", "S#6193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4654", "S#6194", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4580", "S#6195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0063", "f4655", "S#6196", 4, 0, false);
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4657() {
        module0063.$g1064$ = SubLFiles.defparameter("S#6197", (SubLObject)module0063.NIL);
        module0063.$g1065$ = SubLFiles.defparameter("S#6198", (SubLObject)module0063.$ic0$);
        module0063.$g1066$ = SubLFiles.defparameter("S#6199", (SubLObject)module0063.NIL);
        module0063.$g1067$ = SubLFiles.defconstant("S#6200", (SubLObject)module0063.$ic1$);
        module0063.$g1068$ = SubLFiles.deflexical("S#6201", (SubLObject)module0063.NIL);
        module0063.$g1069$ = SubLFiles.deflexical("S#6202", Locks.make_lock((SubLObject)module0063.$ic47$));
        module0063.$g1070$ = SubLFiles.defparameter("S#6203", (SubLObject)module0063.$ic57$);
        module0063.$g1071$ = SubLFiles.defparameter("S#6204", (SubLObject)module0063.NIL);
        module0063.$g1072$ = SubLFiles.defparameter("S#6205", Locks.make_lock((SubLObject)module0063.$ic72$));
        module0063.$g1073$ = SubLFiles.defparameter("S#6206", (SubLObject)module0063.$ic73$);
        module0063.$g1074$ = SubLFiles.defparameter("S#6207", (SubLObject)module0063.NIL);
        module0063.$g1075$ = SubLFiles.defparameter("S#6208", (SubLObject)module0063.NIL);
        return (SubLObject)module0063.NIL;
    }
    
    public static SubLObject f4658() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0063.$g1067$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0063.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0063.$ic9$);
        Structures.def_csetf((SubLObject)module0063.$ic10$, (SubLObject)module0063.$ic11$);
        Structures.def_csetf((SubLObject)module0063.$ic12$, (SubLObject)module0063.$ic13$);
        Structures.def_csetf((SubLObject)module0063.$ic14$, (SubLObject)module0063.$ic15$);
        Structures.def_csetf((SubLObject)module0063.$ic16$, (SubLObject)module0063.$ic17$);
        Structures.def_csetf((SubLObject)module0063.$ic18$, (SubLObject)module0063.$ic19$);
        Structures.def_csetf((SubLObject)module0063.$ic20$, (SubLObject)module0063.$ic21$);
        Structures.def_csetf((SubLObject)module0063.$ic22$, (SubLObject)module0063.$ic23$);
        Structures.def_csetf((SubLObject)module0063.$ic24$, (SubLObject)module0063.$ic25$);
        Equality.identity((SubLObject)module0063.$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0063.$g1067$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0063.$ic39$));
        return (SubLObject)module0063.NIL;
    }
    
    public void declareFunctions() {
        f4656();
    }
    
    public void initializeVariables() {
        f4657();
    }
    
    public void runTopLevelForms() {
        f4658();
    }
    
    static {
        me = (SubLFile)new module0063();
        module0063.$g1064$ = null;
        module0063.$g1065$ = null;
        module0063.$g1066$ = null;
        module0063.$g1067$ = null;
        module0063.$g1068$ = null;
        module0063.$g1069$ = null;
        module0063.$g1070$ = null;
        module0063.$g1071$ = null;
        module0063.$g1072$ = null;
        module0063.$g1073$ = null;
        module0063.$g1074$ = null;
        module0063.$g1075$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("ALL");
        $ic1$ = SubLObjectFactory.makeSymbol("S#6063", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#3939", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6209", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6210", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6211", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6212", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6213", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6214", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6215", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-NODE"), (SubLObject)SubLObjectFactory.makeKeyword("UNIQUE"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVE"), (SubLObject)SubLObjectFactory.makeKeyword("ENTRY-TEST-FUNC"), (SubLObject)SubLObjectFactory.makeKeyword("MULTI"), (SubLObject)SubLObjectFactory.makeKeyword("MULTI-KEYS"), (SubLObject)SubLObjectFactory.makeKeyword("MULTI-KEY-FUNC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6065", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6066", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6067", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6068", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6069", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6070", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6072", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6073", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6074", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6075", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6076", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6077", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6078", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6079", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6080", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#6084", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#6064", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#3939", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#6065", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#6073", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#6066", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#6074", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#6067", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#6075", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#6068", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#6076", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#6069", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#6077", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#6070", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#6078", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#6071", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#6079", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#6072", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#6080", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("NAME");
        $ic27$ = SubLObjectFactory.makeKeyword("TOP-NODE");
        $ic28$ = SubLObjectFactory.makeKeyword("UNIQUE");
        $ic29$ = SubLObjectFactory.makeKeyword("CASE-SENSITIVE");
        $ic30$ = SubLObjectFactory.makeKeyword("ENTRY-TEST-FUNC");
        $ic31$ = SubLObjectFactory.makeKeyword("MULTI");
        $ic32$ = SubLObjectFactory.makeKeyword("MULTI-KEYS");
        $ic33$ = SubLObjectFactory.makeKeyword("MULTI-KEY-FUNC");
        $ic34$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic35$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic36$ = SubLObjectFactory.makeSymbol("S#6081", "CYC");
        $ic37$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic38$ = SubLObjectFactory.makeKeyword("END");
        $ic39$ = SubLObjectFactory.makeSymbol("S#6083", "CYC");
        $ic40$ = SubLObjectFactory.makeString("#<TRIE");
        $ic41$ = SubLObjectFactory.makeString(" ~A");
        $ic42$ = SubLObjectFactory.makeString(" UNIQUE");
        $ic43$ = SubLObjectFactory.makeString(" SENSITIVE");
        $ic44$ = SubLObjectFactory.makeString(" INSENSITIVE");
        $ic45$ = SubLObjectFactory.makeString(" ~S");
        $ic46$ = SubLObjectFactory.makeString(">");
        $ic47$ = SubLObjectFactory.makeString("TRIE resource lock");
        $ic48$ = SubLObjectFactory.makeKeyword("FREE");
        $ic49$ = SubLObjectFactory.makeKeyword("TOP");
        $ic50$ = SubLObjectFactory.makeString("<m> ~S");
        $ic51$ = SubLObjectFactory.makeString(" :  ~S");
        $ic52$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic53$ = SubLObjectFactory.makeString("There is already an object ~S not ~S to ~S in the trie!");
        $ic54$ = SubLObjectFactory.makeString("Remove it anyway");
        $ic55$ = SubLObjectFactory.makeString("The object found in trie for ~S is ~S, not ~S");
        $ic56$ = SubLObjectFactory.makeString("TRIE ~S does not have unique entries");
        $ic57$ = SubLObjectFactory.makeInteger(1000);
        $ic58$ = SubLObjectFactory.makeString("~S will result in a search that is larger than the maximum search size of ~S");
        $ic59$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#154", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6063", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6216", "CYC"), (SubLObject)module0063.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $ic62$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic63$ = SubLObjectFactory.makeKeyword("DONE");
        $ic64$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic65$ = SubLObjectFactory.makeUninternedSymbol("US#2A76813");
        $ic66$ = SubLObjectFactory.makeSymbol("CLET");
        $ic67$ = SubLObjectFactory.makeSymbol("S#6128", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#5129", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#6130", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#6134", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#6137", "CYC");
        $ic72$ = SubLObjectFactory.makeString("Ancestor Tracking Resource");
        $ic73$ = SubLObjectFactory.makeInteger(100);
        $ic74$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic75$ = SubLObjectFactory.makeSymbol("S#6157", "CYC");
        $ic76$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6217", "CYC"));
        $ic77$ = SubLObjectFactory.makeString("~A:~A");
        $ic78$ = SubLObjectFactory.makeSymbol("CAR");
        $ic79$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#6218", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6217", "CYC"));
        $ic80$ = SubLObjectFactory.makeString("~%~S sub-tries");
        $ic81$ = SubLObjectFactory.makeString("~%~%Sub-Trie ~S");
        $ic82$ = SubLObjectFactory.makeSymbol("S#6093", "CYC");
    }
    
    public static final class $sX6063_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $top_node;
        public SubLObject $unique;
        public SubLObject $case_sensitive;
        public SubLObject $entry_test_func;
        public SubLObject $multi;
        public SubLObject $multi_keys;
        public SubLObject $multi_key_func;
        private static final SubLStructDeclNative structDecl;
        
        public $sX6063_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$top_node = (SubLObject)CommonSymbols.NIL;
            this.$unique = (SubLObject)CommonSymbols.NIL;
            this.$case_sensitive = (SubLObject)CommonSymbols.NIL;
            this.$entry_test_func = (SubLObject)CommonSymbols.NIL;
            this.$multi = (SubLObject)CommonSymbols.NIL;
            this.$multi_keys = (SubLObject)CommonSymbols.NIL;
            this.$multi_key_func = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX6063_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$top_node;
        }
        
        public SubLObject getField4() {
            return this.$unique;
        }
        
        public SubLObject getField5() {
            return this.$case_sensitive;
        }
        
        public SubLObject getField6() {
            return this.$entry_test_func;
        }
        
        public SubLObject getField7() {
            return this.$multi;
        }
        
        public SubLObject getField8() {
            return this.$multi_keys;
        }
        
        public SubLObject getField9() {
            return this.$multi_key_func;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$top_node = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$unique = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$case_sensitive = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$entry_test_func = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$multi = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$multi_keys = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$multi_key_func = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX6063_native.class, module0063.$ic1$, module0063.$ic2$, module0063.$ic3$, module0063.$ic4$, new String[] { "$name", "$top_node", "$unique", "$case_sensitive", "$entry_test_func", "$multi", "$multi_keys", "$multi_key_func" }, module0063.$ic5$, module0063.$ic6$, module0063.$ic7$);
        }
    }
    
    public static final class $f4523$UnaryFunction extends UnaryFunction
    {
        public $f4523$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#3939"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0063.f4523(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0063.class
	Total time: 619 ms
	
	Decompiled with Procyon 0.5.32.
*/