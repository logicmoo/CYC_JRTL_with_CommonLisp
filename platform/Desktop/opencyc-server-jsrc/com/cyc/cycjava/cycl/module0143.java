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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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

public final class module0143 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0143";
    public static final String myFingerPrint = "6ed45359635277fa66024597770de93fb4d798b8e01774a1b3d5153c30c100ed";
    public static SubLSymbol $g1737$;
    public static SubLSymbol $g1738$;
    public static SubLSymbol $g1739$;
    public static SubLSymbol $g1740$;
    public static SubLSymbol $g1741$;
    public static SubLSymbol $g1742$;
    public static SubLSymbol $g1743$;
    public static SubLSymbol $g1744$;
    public static SubLSymbol $g1745$;
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
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
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
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLList $ic69$;
    private static final SubLList $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
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
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    private static final SubLList $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLList $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    
    public static SubLObject f9327(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0143.ZERO_INTEGER);
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9328(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX11719_native.class) ? module0143.T : module0143.NIL);
    }
    
    public static SubLObject f9329(final SubLObject var1) {
        assert module0143.NIL != f9328(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f9330(final SubLObject var1) {
        assert module0143.NIL != f9328(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f9331(final SubLObject var1) {
        assert module0143.NIL != f9328(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f9332(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9328(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f9333(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9328(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f9334(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9328(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f9335(SubLObject var5) {
        if (var5 == module0143.UNPROVIDED) {
            var5 = (SubLObject)module0143.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX11719_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0143.NIL, var7 = var5; module0143.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0143.$ic15$)) {
                f9332(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic16$)) {
                f9333(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic17$)) {
                f9334(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0143.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f9336(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic19$, (SubLObject)module0143.$ic20$, (SubLObject)module0143.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic15$, f9329(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic16$, f9330(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic17$, f9331(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic22$, (SubLObject)module0143.$ic20$, (SubLObject)module0143.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f9337(final SubLObject var11, final SubLObject var12) {
        return f9336(var11, var12);
    }
    
    public static SubLObject f9338(final SubLObject var13) {
        final SubLObject var14 = f9339();
        final SubLObject var15 = module0140.f9133(var13);
        final SubLObject var16 = module0244.f15751(var15);
        final SubLObject var17 = (module0143.NIL != var16) ? module0137.f8955(var16.first()) : var15;
        f9332(var14, var13);
        f9333(var14, (SubLObject)((module0143.NIL != var16) ? Mapping.mapcar((SubLObject)module0143.$ic24$, var16.rest()) : module0143.NIL));
        f9334(var14, f9340(var17, var13));
        return var14;
    }
    
    public static SubLObject f9341(final SubLObject var14) {
        final SubLObject var15 = f9330(var14);
        if (module0143.NIL != var15) {
            f9333(var14, var15.rest());
        }
        return var15.first();
    }
    
    public static SubLObject f9342(final SubLObject var14) {
        if (module0143.NIL != f9331(var14)) {
            module0135.f8849(f9331(var14));
        }
        final SubLObject var15 = f9341(var14);
        SubLObject var16 = (SubLObject)module0143.NIL;
        if (module0143.NIL != var15) {
            var16 = f9340(var15, f9329(var14));
        }
        f9334(var14, var16);
        return var14;
    }
    
    public static SubLObject f9343(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL == f9330(var14) && (module0143.NIL == f9331(var14) || module0143.NIL != module0135.f8838(f9331(var14))));
    }
    
    public static SubLObject f9344(final SubLObject var21) {
        return module0135.f8839(f9338(var21), (SubLObject)module0143.$ic25$, (SubLObject)module0143.$ic26$, (SubLObject)module0143.$ic27$);
    }
    
    public static SubLObject f9345(final SubLObject var14) {
        return f9343(var14);
    }
    
    public static SubLObject f9346(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0143.NIL;
        SubLObject var16 = (SubLObject)module0143.NIL;
        while (module0143.NIL == var15 && module0143.NIL == var16) {
            var15 = module0135.f8844(f9331(var14));
            if (module0143.NIL == var15) {
                f9342(var14);
                if (module0143.NIL == f9343(var14)) {
                    continue;
                }
                var16 = (SubLObject)module0143.T;
            }
        }
        return var15;
    }
    
    public static SubLObject f9347(final SubLObject var14) {
        final SubLObject var15 = f9331(var14);
        final SubLObject var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL == var15 || module0143.NIL != module0135.f8849(var15));
        f9348(var14);
        return var16;
    }
    
    public static SubLObject f9340(final SubLObject var15, final SubLObject var13) {
        final SubLObject var16 = module0228.f15229(module0140.f9132(var13));
        if (module0143.NIL != module0138.f8992(var16)) {
            return f9349(var15, var16, var13);
        }
        if (module0143.NIL != module0155.f9785(var16, (SubLObject)module0143.UNPROVIDED)) {
            return f9350(var15, var16, var13);
        }
        module0136.f8870((SubLObject)module0143.THREE_INTEGER, (SubLObject)module0143.$ic28$, var16, (SubLObject)module0143.UNPROVIDED, (SubLObject)module0143.UNPROVIDED, (SubLObject)module0143.UNPROVIDED, (SubLObject)module0143.UNPROVIDED);
        return module0135.f8853();
    }
    
    public static SubLObject f9349(final SubLObject var15, final SubLObject var25, final SubLObject var13) {
        final SubLObject var26 = module0242.f15664(var25, var15);
        if (module0143.NIL != var26) {
            final SubLObject var27 = module0140.f9134(var13);
            final SubLObject var28 = (SubLObject)((module0143.NIL != module0141.f9205(var15, (SubLObject)module0143.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0143.NIL == module0140.f9138(var13)) : module0140.f9138(var13));
            return f9351(var27, var26, var15, var25, var28);
        }
        final SubLObject var27 = module0140.f9134(var13);
        module0136.f8870((SubLObject)module0143.FIVE_INTEGER, (SubLObject)module0143.$ic29$, var27, var25, var15, (SubLObject)module0143.UNPROVIDED, (SubLObject)module0143.UNPROVIDED);
        return module0135.f8853();
    }
    
    public static SubLObject f9350(final SubLObject var15, final SubLObject var25, final SubLObject var13) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0140.f9134(var13);
        final SubLObject var28 = module0141.$g1714$.getDynamicValue(var26);
        final SubLObject var29 = module0244.f15760(var27, var28, var15);
        if (module0143.NIL != var29) {
            final SubLObject var30 = module0140.f9135(var13);
            final SubLObject var31 = (SubLObject)((module0143.NIL != module0141.f9205(var15, (SubLObject)module0143.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0143.NIL == module0140.f9138(var13)) : module0140.f9138(var13));
            return f9352(var15, var25, var29, var27, var30, var28, var31);
        }
        module0136.f8870((SubLObject)module0143.FIVE_INTEGER, (SubLObject)module0143.$ic30$, var27, var28, var15, (SubLObject)module0143.UNPROVIDED, (SubLObject)module0143.UNPROVIDED);
        return module0135.f8853();
    }
    
    public static SubLObject f9353(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0143.ZERO_INTEGER);
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9354(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX11725_native.class) ? module0143.T : module0143.NIL);
    }
    
    public static SubLObject f9355(final SubLObject var1) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f9356(final SubLObject var1) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f9357(final SubLObject var1) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f9358(final SubLObject var1) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f9359(final SubLObject var1) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f9360(final SubLObject var1) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f9361(final SubLObject var1) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f9362(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f9363(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f9364(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f9365(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f9366(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f9367(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f9368(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9354(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f9369(SubLObject var5) {
        if (var5 == module0143.UNPROVIDED) {
            var5 = (SubLObject)module0143.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX11725_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0143.NIL, var7 = var5; module0143.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0143.$ic53$)) {
                f9362(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic54$)) {
                f9363(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic55$)) {
                f9364(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic56$)) {
                f9365(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic57$)) {
                f9366(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic58$)) {
                f9367(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic59$)) {
                f9368(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0143.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f9370(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic19$, (SubLObject)module0143.$ic60$, (SubLObject)module0143.SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic53$, f9355(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic54$, f9356(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic55$, f9357(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic56$, f9358(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic57$, f9359(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic58$, f9360(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic59$, f9361(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic22$, (SubLObject)module0143.$ic60$, (SubLObject)module0143.SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f9371(final SubLObject var11, final SubLObject var12) {
        return f9370(var11, var12);
    }
    
    public static SubLObject f9372(final SubLObject var27, final SubLObject var26, final SubLObject var15, final SubLObject var25, final SubLObject var28) {
        final SubLObject var29 = f9373();
        final SubLObject var30 = module0245.f15834(var26, var27, var15);
        f9362(var29, (module0143.NIL != var30) ? module0135.f8859(var30) : module0135.f8853());
        f9363(var29, module0135.f8853());
        f9364(var29, var26);
        f9365(var29, var15);
        f9366(var29, var25);
        f9367(var29, var27);
        f9368(var29, var28);
        return var29;
    }
    
    public static SubLObject f9374(final SubLObject var14) {
        if (module0143.NIL != f9356(var14)) {
            module0135.f8849(f9356(var14));
        }
        final SubLObject var15 = f9355(var14);
        final SubLObject var16 = module0135.f8844(var15);
        SubLObject var17 = (SubLObject)module0143.NIL;
        if (module0143.NIL != var16) {
            SubLObject var19;
            final SubLObject var18 = var19 = var16;
            SubLObject var20 = (SubLObject)module0143.NIL;
            SubLObject var21 = (SubLObject)module0143.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0143.$ic62$);
            var20 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0143.$ic62$);
            var21 = var19.first();
            var19 = var19.rest();
            if (module0143.NIL == var19) {
                if (module0143.NIL != module0147.f9507(var20)) {
                    final SubLObject var22 = f9358(var14);
                    final SubLObject var23 = f9359(var14);
                    final SubLObject var24 = f9360(var14);
                    final SubLObject var25 = f9361(var14);
                    var17 = f9375(var21, var22, var23, var24, var20, var25);
                }
                else {
                    var17 = module0135.f8853();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)module0143.$ic62$);
            }
        }
        f9363(var14, var17);
        return var14;
    }
    
    public static SubLObject f9376(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL != module0135.f8838(f9355(var14)) && (module0143.NIL == f9356(var14) || module0143.NIL != module0135.f8838(f9356(var14))));
    }
    
    public static SubLObject f9351(final SubLObject var27, final SubLObject var26, final SubLObject var15, final SubLObject var25, final SubLObject var28) {
        return module0135.f8839(f9372(var27, var26, var15, var25, var28), (SubLObject)module0143.$ic63$, (SubLObject)module0143.$ic64$, (SubLObject)module0143.$ic65$);
    }
    
    public static SubLObject f9377(final SubLObject var14) {
        return f9376(var14);
    }
    
    public static SubLObject f9378(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0143.NIL;
        SubLObject var16 = (SubLObject)module0143.NIL;
        while (module0143.NIL == var15 && module0143.NIL == var16) {
            var15 = module0135.f8844(f9356(var14));
            if (module0143.NIL == var15) {
                f9374(var14);
                if (module0143.NIL != f9356(var14)) {
                    continue;
                }
                var16 = (SubLObject)module0143.T;
            }
        }
        return var15;
    }
    
    public static SubLObject f9379(final SubLObject var14) {
        final SubLObject var15 = f9355(var14);
        final SubLObject var16 = f9356(var14);
        final SubLObject var17 = (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL == var15 || module0143.NIL != module0135.f8849(var15));
        final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL == var16 || module0143.NIL != module0135.f8849(var16));
        f9380(var14);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL != var17 && module0143.NIL != var18);
    }
    
    public static SubLObject f9381(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0143.ZERO_INTEGER);
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9382(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX11728_native.class) ? module0143.T : module0143.NIL);
    }
    
    public static SubLObject f9383(final SubLObject var1) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f9384(final SubLObject var1) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f9385(final SubLObject var1) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f9386(final SubLObject var1) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f9387(final SubLObject var1) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f9388(final SubLObject var1) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f9389(final SubLObject var1) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f9390(final SubLObject var1) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f9391(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f9392(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f9393(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f9394(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f9395(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f9396(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f9397(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f9398(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9382(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f9399(SubLObject var5) {
        if (var5 == module0143.UNPROVIDED) {
            var5 = (SubLObject)module0143.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX11728_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0143.NIL, var7 = var5; module0143.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0143.$ic90$)) {
                f9391(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic91$)) {
                f9392(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic92$)) {
                f9393(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic56$)) {
                f9394(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic93$)) {
                f9395(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic58$)) {
                f9396(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic94$)) {
                f9397(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic59$)) {
                f9398(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0143.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f9400(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic19$, (SubLObject)module0143.$ic95$, (SubLObject)module0143.EIGHT_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic90$, f9383(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic91$, f9384(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic92$, f9385(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic56$, f9386(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic93$, f9387(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic58$, f9388(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic94$, f9389(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic59$, f9390(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic22$, (SubLObject)module0143.$ic95$, (SubLObject)module0143.EIGHT_INTEGER);
        return var11;
    }
    
    public static SubLObject f9401(final SubLObject var11, final SubLObject var12) {
        return f9400(var11, var12);
    }
    
    public static SubLObject f9402(final SubLObject var42, final SubLObject var15, final SubLObject var51, final SubLObject var27, final SubLObject var32, final SubLObject var28) {
        final SubLObject var52 = f9403();
        f9391(var52, module0135.f8859(var42));
        f9392(var52, (SubLObject)module0143.NIL);
        f9393(var52, (SubLObject)module0143.NIL);
        f9394(var52, var15);
        f9395(var52, var51);
        f9396(var52, var27);
        f9397(var52, var32);
        f9398(var52, var28);
        return var52;
    }
    
    public static SubLObject f9404(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL == f9385(var14) && module0143.NIL != module0135.f8838(f9383(var14)));
    }
    
    public static SubLObject f9405(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0143.NIL;
        while (module0143.NIL == var15 && module0143.NIL == f9404(var14)) {
            final SubLObject var16 = f9385(var14);
            if (module0143.NIL != var16) {
                var15 = f9406(var16.first(), var14);
                f9393(var14, var16.rest());
            }
            else {
                final SubLObject var17 = module0135.f8844(f9383(var14));
                if (module0143.NIL == var17) {
                    continue;
                }
                SubLObject var19;
                final SubLObject var18 = var19 = var17;
                SubLObject var20 = (SubLObject)module0143.NIL;
                SubLObject var21 = (SubLObject)module0143.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0143.$ic97$);
                var20 = var19.first();
                var19 = var19.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0143.$ic97$);
                var21 = var19.first();
                var19 = var19.rest();
                if (module0143.NIL == var19) {
                    if (module0143.NIL == module0141.f9289(var20)) {
                        continue;
                    }
                    f9392(var14, var20);
                    var15 = f9406(var21.first(), var14);
                    f9393(var14, var21.rest());
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)module0143.$ic97$);
                }
            }
        }
        return var15;
    }
    
    public static SubLObject f9406(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f9384(var14);
        final SubLObject var27 = f9386(var14);
        final SubLObject var28 = f9387(var14);
        final SubLObject var29 = f9388(var14);
        final SubLObject var30 = f9389(var14);
        final SubLObject var31 = f9390(var14);
        return module0140.f9131(var25, var27, var29, var30, var26, var28, var31, (SubLObject)module0143.UNPROVIDED);
    }
    
    public static SubLObject f9375(final SubLObject var42, final SubLObject var15, final SubLObject var51, final SubLObject var27, final SubLObject var32, final SubLObject var28) {
        return module0135.f8839(f9402(var42, var15, var51, var27, var32, var28), (SubLObject)module0143.$ic98$, (SubLObject)module0143.$ic99$, (SubLObject)module0143.$ic100$);
    }
    
    public static SubLObject f9407(final SubLObject var14) {
        return f9404(var14);
    }
    
    public static SubLObject f9408(final SubLObject var14) {
        return f9405(var14);
    }
    
    public static SubLObject f9409(final SubLObject var14) {
        final SubLObject var15 = f9383(var14);
        final SubLObject var16 = (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL == var15 || module0143.NIL != module0135.f8849(var15));
        f9410(var14);
        return var16;
    }
    
    public static SubLObject f9411(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0143.ZERO_INTEGER);
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9412(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX11730_native.class) ? module0143.T : module0143.NIL);
    }
    
    public static SubLObject f9413(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f9414(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f9415(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f9416(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f9417(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f9418(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f9419(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f9420(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f9421(final SubLObject var1) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f9422(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f9423(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f9424(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f9425(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f9426(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f9427(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f9428(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f9429(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f9430(final SubLObject var1, final SubLObject var4) {
        assert module0143.NIL != f9412(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f9431(SubLObject var5) {
        if (var5 == module0143.UNPROVIDED) {
            var5 = (SubLObject)module0143.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX11730_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0143.NIL, var7 = var5; module0143.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0143.$ic127$)) {
                f9422(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic128$)) {
                f9423(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic92$)) {
                f9424(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic56$)) {
                f9425(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic93$)) {
                f9426(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic58$)) {
                f9427(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic94$)) {
                f9428(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic129$)) {
                f9429(var6, var9);
            }
            else if (var10.eql((SubLObject)module0143.$ic59$)) {
                f9430(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0143.$ic18$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f9432(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic19$, (SubLObject)module0143.$ic130$, (SubLObject)module0143.NINE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic127$, f9413(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic128$, f9414(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic92$, f9415(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic56$, f9416(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic93$, f9417(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic58$, f9418(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic94$, f9419(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic129$, f9420(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic21$, (SubLObject)module0143.$ic59$, f9421(var11));
        Functions.funcall(var12, var11, (SubLObject)module0143.$ic22$, (SubLObject)module0143.$ic130$, (SubLObject)module0143.NINE_INTEGER);
        return var11;
    }
    
    public static SubLObject f9433(final SubLObject var11, final SubLObject var12) {
        return f9432(var11, var12);
    }
    
    public static SubLObject f9434(final SubLObject var31, final SubLObject var15, final SubLObject var25, final SubLObject var27, final SubLObject var32, final SubLObject var30, final SubLObject var28) {
        final SubLObject var33 = f9435();
        f9422(var33, var31);
        f9423(var33, (SubLObject)module0143.NIL);
        f9424(var33, (SubLObject)module0143.NIL);
        f9425(var33, var15);
        f9426(var33, var25);
        f9427(var33, var27);
        f9428(var33, var32);
        f9429(var33, var30);
        f9430(var33, var28);
        return var33;
    }
    
    public static SubLObject f9436(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0143.NIL == f9413(var14) && module0143.NIL == f9415(var14));
    }
    
    public static SubLObject f9437(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0143.NIL;
        while (module0143.NIL == var15 && module0143.NIL == f9436(var14)) {
            final SubLObject var16 = f9415(var14);
            if (module0143.NIL != var16) {
                var15 = f9438(var16.first(), var14);
                f9424(var14, var16.rest());
            }
            else {
                final SubLObject var17 = f9413(var14);
                if (module0143.NIL == var17) {
                    continue;
                }
                final SubLObject var18 = var17.first();
                final SubLObject var19 = f9417(var14);
                final SubLObject var20 = Functions.funcall(var18, var19);
                f9422(var14, var17.rest());
                f9423(var14, var18);
                if (module0143.NIL == var20) {
                    continue;
                }
                var15 = f9438(var20.first(), var14);
                f9424(var14, var20.rest());
            }
        }
        return var15;
    }
    
    public static SubLObject f9438(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f9414(var14);
        final SubLObject var27 = f9416(var14);
        final SubLObject var28 = f9417(var14);
        final SubLObject var29 = f9418(var14);
        final SubLObject var30 = f9419(var14);
        final SubLObject var31 = f9420(var14);
        final SubLObject var32 = f9421(var14);
        return module0140.f9131(var25, var27, var29, var30, var31, var28, var32, var26);
    }
    
    public static SubLObject f9352(final SubLObject var15, final SubLObject var25, final SubLObject var31, final SubLObject var27, final SubLObject var32, final SubLObject var30, final SubLObject var28) {
        return module0135.f8839(f9434(var31, var15, var25, var27, var32, var30, var28), (SubLObject)module0143.$ic132$, (SubLObject)module0143.$ic133$, (SubLObject)module0143.$ic134$);
    }
    
    public static SubLObject f9439(final SubLObject var14) {
        return f9436(var14);
    }
    
    public static SubLObject f9440(final SubLObject var14) {
        return f9437(var14);
    }
    
    public static SubLObject f9441(final SubLObject var14) {
        f9442(var14);
        return (SubLObject)module0143.T;
    }
    
    public static SubLObject f9443() {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return module0143.$g1745$.getDynamicValue(var29);
    }
    
    public static SubLObject f9444(final SubLObject var63, final SubLObject var64) {
        final SubLObject var65 = var63.rest();
        final SubLObject var67;
        final SubLObject var66 = var67 = var65;
        return (SubLObject)ConsesLow.listS((SubLObject)module0143.$ic135$, (SubLObject)module0143.$ic136$, ConsesLow.append(var67, (SubLObject)module0143.NIL));
    }
    
    public static SubLObject f9445(final SubLObject var63, final SubLObject var64) {
        final SubLObject var65 = var63.rest();
        final SubLObject var67;
        final SubLObject var66 = var67 = var65;
        return (SubLObject)ConsesLow.list((SubLObject)module0143.$ic137$, reader.bq_cons((SubLObject)module0143.$ic138$, ConsesLow.append(var67, (SubLObject)module0143.NIL)));
    }
    
    public static SubLObject f9339() {
        final SubLObject var70 = f9446();
        return (module0143.NIL != var70) ? var70 : f9335((SubLObject)module0143.UNPROVIDED);
    }
    
    public static SubLObject f9446() {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0143.NIL != f9443()) ? module0140.f9106(module0143.$g1741$.getDynamicValue(var29)) : module0143.NIL);
    }
    
    public static SubLObject f9348(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0143.NIL != f9443()) {
            module0140.f9105(var14, module0143.$g1741$.getDynamicValue(var15));
        }
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9373() {
        final SubLObject var70 = f9447();
        return (module0143.NIL != var70) ? var70 : f9369((SubLObject)module0143.UNPROVIDED);
    }
    
    public static SubLObject f9447() {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0143.NIL != f9443()) ? module0140.f9106(module0143.$g1742$.getDynamicValue(var29)) : module0143.NIL);
    }
    
    public static SubLObject f9380(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0143.NIL != f9443()) {
            module0140.f9105(var14, module0143.$g1742$.getDynamicValue(var15));
        }
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9403() {
        final SubLObject var70 = f9448();
        return (module0143.NIL != var70) ? var70 : f9399((SubLObject)module0143.UNPROVIDED);
    }
    
    public static SubLObject f9448() {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0143.NIL != f9443()) ? module0140.f9106(module0143.$g1743$.getDynamicValue(var29)) : module0143.NIL);
    }
    
    public static SubLObject f9410(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0143.NIL != f9443()) {
            module0140.f9105(var14, module0143.$g1743$.getDynamicValue(var15));
        }
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9435() {
        final SubLObject var70 = f9449();
        return (module0143.NIL != var70) ? var70 : f9431((SubLObject)module0143.UNPROVIDED);
    }
    
    public static SubLObject f9449() {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0143.NIL != f9443()) ? module0140.f9106(module0143.$g1744$.getDynamicValue(var29)) : module0143.NIL);
    }
    
    public static SubLObject f9442(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0143.NIL != f9443()) {
            module0140.f9105(var14, module0143.$g1744$.getDynamicValue(var15));
        }
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9450() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9327", "S#11732", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9328", "S#11720", 1, 0, false);
        new $f9328$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9329", "S#11733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9330", "S#11734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9331", "S#11735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9332", "S#11736", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9333", "S#11737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9334", "S#11738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9335", "S#11739", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9336", "S#11740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9337", "S#11741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9338", "S#11742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9341", "S#11743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9342", "S#11744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9343", "S#11745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9344", "S#11746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9345", "S#11005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9346", "S#11013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9347", "S#11021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9340", "S#11747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9349", "S#11748", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9350", "S#11749", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9353", "S#11750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9354", "S#11726", 1, 0, false);
        new $f9354$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9355", "S#11751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9356", "S#11752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9357", "S#11753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9358", "S#11754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9359", "S#11755", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9360", "S#11756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9361", "S#11757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9362", "S#11758", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9363", "S#11759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9364", "S#11760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9365", "S#11761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9366", "S#11762", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9367", "S#11763", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9368", "S#11764", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9369", "S#11765", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9370", "S#11766", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9371", "S#11767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9372", "S#11768", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9374", "S#11769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9376", "S#11770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9351", "S#11771", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9377", "S#11006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9378", "S#11014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9379", "S#11022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9381", "S#11772", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9382", "S#11729", 1, 0, false);
        new $f9382$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9383", "S#11773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9384", "S#11774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9385", "S#11775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9386", "S#11776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9387", "S#11777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9388", "S#11778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9389", "S#11779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9390", "S#11780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9391", "S#11781", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9392", "S#11782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9393", "S#11783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9394", "S#11784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9395", "S#11785", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9396", "S#11786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9397", "S#11787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9398", "S#11788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9399", "S#11789", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9400", "S#11790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9401", "S#11791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9402", "S#11792", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9404", "S#11793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9405", "S#11794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9406", "S#11795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9375", "S#11796", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9407", "S#11007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9408", "S#11015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9409", "S#11023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9411", "S#11797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9412", "S#11731", 1, 0, false);
        new $f9412$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9413", "S#11798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9414", "S#11799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9415", "S#11800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9416", "S#11801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9417", "S#11802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9418", "S#11803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9419", "S#11804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9420", "S#11805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9421", "S#11806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9422", "S#11807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9423", "S#11808", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9424", "S#11809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9425", "S#11810", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9426", "S#11811", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9427", "S#11812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9428", "S#11813", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9429", "S#11814", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9430", "S#11815", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9431", "S#11816", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9432", "S#11817", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9433", "S#11818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9434", "S#11819", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9436", "S#11820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9437", "S#11821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9438", "S#11822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9352", "S#11823", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9439", "S#11008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9440", "S#11016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9441", "S#11024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9443", "S#11824", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0143", "f9444", "S#11825");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0143", "f9445", "S#11826");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9339", "S#11827", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9446", "S#11828", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9348", "S#11829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9373", "S#11830", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9447", "S#11831", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9380", "S#11832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9403", "S#11833", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9448", "S#11834", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9410", "S#11835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9435", "S#11836", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9449", "S#11837", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0143", "f9442", "S#11838", 1, 0, false);
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9451() {
        module0143.$g1737$ = SubLFiles.defconstant("S#11839", (SubLObject)module0143.$ic0$);
        module0143.$g1738$ = SubLFiles.defconstant("S#11840", (SubLObject)module0143.$ic31$);
        module0143.$g1739$ = SubLFiles.defconstant("S#11841", (SubLObject)module0143.$ic66$);
        module0143.$g1740$ = SubLFiles.defconstant("S#11842", (SubLObject)module0143.$ic101$);
        module0143.$g1741$ = SubLFiles.defparameter("S#11843", (SubLObject)module0143.NIL);
        module0143.$g1742$ = SubLFiles.defparameter("S#11844", (SubLObject)module0143.NIL);
        module0143.$g1743$ = SubLFiles.defparameter("S#11845", (SubLObject)module0143.NIL);
        module0143.$g1744$ = SubLFiles.defparameter("S#11846", (SubLObject)module0143.NIL);
        module0143.$g1745$ = SubLFiles.defparameter("S#11847", (SubLObject)module0143.NIL);
        return (SubLObject)module0143.NIL;
    }
    
    public static SubLObject f9452() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0143.$g1737$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0143.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0143.$ic8$);
        Structures.def_csetf((SubLObject)module0143.$ic9$, (SubLObject)module0143.$ic10$);
        Structures.def_csetf((SubLObject)module0143.$ic11$, (SubLObject)module0143.$ic12$);
        Structures.def_csetf((SubLObject)module0143.$ic13$, (SubLObject)module0143.$ic14$);
        Equality.identity((SubLObject)module0143.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0143.$g1737$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0143.$ic23$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0143.$g1738$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0143.$ic37$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0143.$ic38$);
        Structures.def_csetf((SubLObject)module0143.$ic39$, (SubLObject)module0143.$ic40$);
        Structures.def_csetf((SubLObject)module0143.$ic41$, (SubLObject)module0143.$ic42$);
        Structures.def_csetf((SubLObject)module0143.$ic43$, (SubLObject)module0143.$ic44$);
        Structures.def_csetf((SubLObject)module0143.$ic45$, (SubLObject)module0143.$ic46$);
        Structures.def_csetf((SubLObject)module0143.$ic47$, (SubLObject)module0143.$ic48$);
        Structures.def_csetf((SubLObject)module0143.$ic49$, (SubLObject)module0143.$ic50$);
        Structures.def_csetf((SubLObject)module0143.$ic51$, (SubLObject)module0143.$ic52$);
        Equality.identity((SubLObject)module0143.$ic31$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0143.$g1738$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0143.$ic61$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0143.$g1739$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0143.$ic72$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0143.$ic73$);
        Structures.def_csetf((SubLObject)module0143.$ic74$, (SubLObject)module0143.$ic75$);
        Structures.def_csetf((SubLObject)module0143.$ic76$, (SubLObject)module0143.$ic77$);
        Structures.def_csetf((SubLObject)module0143.$ic78$, (SubLObject)module0143.$ic79$);
        Structures.def_csetf((SubLObject)module0143.$ic80$, (SubLObject)module0143.$ic81$);
        Structures.def_csetf((SubLObject)module0143.$ic82$, (SubLObject)module0143.$ic83$);
        Structures.def_csetf((SubLObject)module0143.$ic84$, (SubLObject)module0143.$ic85$);
        Structures.def_csetf((SubLObject)module0143.$ic86$, (SubLObject)module0143.$ic87$);
        Structures.def_csetf((SubLObject)module0143.$ic88$, (SubLObject)module0143.$ic89$);
        Equality.identity((SubLObject)module0143.$ic66$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0143.$g1739$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0143.$ic96$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0143.$g1740$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0143.$ic107$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0143.$ic108$);
        Structures.def_csetf((SubLObject)module0143.$ic109$, (SubLObject)module0143.$ic110$);
        Structures.def_csetf((SubLObject)module0143.$ic111$, (SubLObject)module0143.$ic112$);
        Structures.def_csetf((SubLObject)module0143.$ic113$, (SubLObject)module0143.$ic114$);
        Structures.def_csetf((SubLObject)module0143.$ic115$, (SubLObject)module0143.$ic116$);
        Structures.def_csetf((SubLObject)module0143.$ic117$, (SubLObject)module0143.$ic118$);
        Structures.def_csetf((SubLObject)module0143.$ic119$, (SubLObject)module0143.$ic120$);
        Structures.def_csetf((SubLObject)module0143.$ic121$, (SubLObject)module0143.$ic122$);
        Structures.def_csetf((SubLObject)module0143.$ic123$, (SubLObject)module0143.$ic124$);
        Structures.def_csetf((SubLObject)module0143.$ic125$, (SubLObject)module0143.$ic126$);
        Equality.identity((SubLObject)module0143.$ic101$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0143.$g1740$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0143.$ic131$));
        return (SubLObject)module0143.NIL;
    }
    
    public void declareFunctions() {
        f9450();
    }
    
    public void initializeVariables() {
        f9451();
    }
    
    public void runTopLevelForms() {
        f9452();
    }
    
    static {
        me = (SubLFile)new module0143();
        module0143.$g1737$ = null;
        module0143.$g1738$ = null;
        module0143.$g1739$ = null;
        module0143.$g1740$ = null;
        module0143.$g1741$ = null;
        module0143.$g1742$ = null;
        module0143.$g1743$ = null;
        module0143.$g1744$ = null;
        module0143.$g1745$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#11719", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#11720", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11398", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11848", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11849", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SBHL-LINK-NODE-SEARCH-STATE"), (SubLObject)SubLObjectFactory.makeKeyword("REMAINING-MODULES"), (SubLObject)SubLObjectFactory.makeKeyword("MODULE-NODE-SEARCH-STATE-ITERATOR"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11733", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11734", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11735", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11736", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11737", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11738", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = SubLObjectFactory.makeSymbol("S#11732", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11720", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#11733", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#11736", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#11734", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#11737", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#11735", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#11738", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("SBHL-LINK-NODE-SEARCH-STATE");
        $ic16$ = SubLObjectFactory.makeKeyword("REMAINING-MODULES");
        $ic17$ = SubLObjectFactory.makeKeyword("MODULE-NODE-SEARCH-STATE-ITERATOR");
        $ic18$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic19$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic20$ = SubLObjectFactory.makeSymbol("S#11739", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic22$ = SubLObjectFactory.makeKeyword("END");
        $ic23$ = SubLObjectFactory.makeSymbol("S#11741", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#11102", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#11005", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#11013", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#11021", "CYC");
        $ic28$ = SubLObjectFactory.makeString("~a is neither an SBHL node (FORT) nor a NAUT.  Returning a null-iterator.");
        $ic29$ = SubLObjectFactory.makeString("No ~a direction links for ~a with module ~a.  Returning a null-iterator.");
        $ic30$ = SubLObjectFactory.makeString("No generating functions for direction ~a, TV ~a, and module ~a.  Returning a null-iterator.");
        $ic31$ = SubLObjectFactory.makeSymbol("S#11725", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#11726", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11850", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11851", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9182", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11447", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT-LINK-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("TV-LINK-SEARCH-STATE-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("GRAPH-LINK"), (SubLObject)SubLObjectFactory.makeKeyword("MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("NODE"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("GENL-INVERSE-MODE?"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11751", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11752", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11753", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11754", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11755", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11756", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11757", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11758", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11759", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11760", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11761", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11762", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11763", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11764", "CYC"));
        $ic37$ = SubLObjectFactory.makeSymbol("S#11750", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11726", "CYC"));
        $ic39$ = SubLObjectFactory.makeSymbol("S#11751", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#11758", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#11752", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#11759", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#11753", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#11760", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#11754", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#11761", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#11755", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#11762", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#11756", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#11763", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#11757", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#11764", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("MT-LINK-ITERATOR");
        $ic54$ = SubLObjectFactory.makeKeyword("TV-LINK-SEARCH-STATE-ITERATOR");
        $ic55$ = SubLObjectFactory.makeKeyword("GRAPH-LINK");
        $ic56$ = SubLObjectFactory.makeKeyword("MODULE");
        $ic57$ = SubLObjectFactory.makeKeyword("NODE");
        $ic58$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic59$ = SubLObjectFactory.makeKeyword("GENL-INVERSE-MODE?");
        $ic60$ = SubLObjectFactory.makeSymbol("S#11765", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#11767", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11853", "CYC"));
        $ic63$ = SubLObjectFactory.makeSymbol("S#11006", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#11014", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#11022", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#11728", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#11729", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11854", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11855", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11856", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11446", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11447", "CYC"));
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TV-LINK-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-TV"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-REMAINING-NODES"), (SubLObject)SubLObjectFactory.makeKeyword("MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT-NODE"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("GENL-INVERSE-MODE?"));
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11773", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11774", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11775", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11776", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11777", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11778", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11779", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11780", "CYC"));
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11781", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11782", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11783", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11784", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11785", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11786", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11787", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11788", "CYC"));
        $ic72$ = SubLObjectFactory.makeSymbol("S#11772", "CYC");
        $ic73$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11729", "CYC"));
        $ic74$ = SubLObjectFactory.makeSymbol("S#11773", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#11781", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#11774", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#11782", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#11775", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#11783", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#11776", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#11784", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#11777", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#11785", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#11778", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#11786", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#11779", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#11787", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#11780", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#11788", "CYC");
        $ic90$ = SubLObjectFactory.makeKeyword("TV-LINK-ITERATOR");
        $ic91$ = SubLObjectFactory.makeKeyword("CURRENT-TV");
        $ic92$ = SubLObjectFactory.makeKeyword("CURRENT-REMAINING-NODES");
        $ic93$ = SubLObjectFactory.makeKeyword("PARENT-NODE");
        $ic94$ = SubLObjectFactory.makeKeyword("MT");
        $ic95$ = SubLObjectFactory.makeSymbol("S#11789", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#11791", "CYC");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9175", "CYC"));
        $ic98$ = SubLObjectFactory.makeSymbol("S#11007", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#11015", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("S#11023", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("S#11730", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#11731", "CYC");
        $ic103$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#11857", "CYC"), SubLObjectFactory.makeSymbol("S#11858", "CYC"), SubLObjectFactory.makeSymbol("S#11856", "CYC"), SubLObjectFactory.makeSymbol("S#205", "CYC"), SubLObjectFactory.makeSymbol("S#11446", "CYC"), SubLObjectFactory.makeSymbol("S#5432", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#10995", "CYC"), SubLObjectFactory.makeSymbol("S#11447", "CYC") });
        $ic104$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("GENERATING-FUNCTIONS"), SubLObjectFactory.makeKeyword("CURRENT-GENERATING-FUNCTION"), SubLObjectFactory.makeKeyword("CURRENT-REMAINING-NODES"), SubLObjectFactory.makeKeyword("MODULE"), SubLObjectFactory.makeKeyword("PARENT-NODE"), SubLObjectFactory.makeKeyword("DIRECTION"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("TV"), SubLObjectFactory.makeKeyword("GENL-INVERSE-MODE?") });
        $ic105$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#11798", "CYC"), SubLObjectFactory.makeSymbol("S#11799", "CYC"), SubLObjectFactory.makeSymbol("S#11800", "CYC"), SubLObjectFactory.makeSymbol("S#11801", "CYC"), SubLObjectFactory.makeSymbol("S#11802", "CYC"), SubLObjectFactory.makeSymbol("S#11803", "CYC"), SubLObjectFactory.makeSymbol("S#11804", "CYC"), SubLObjectFactory.makeSymbol("S#11805", "CYC"), SubLObjectFactory.makeSymbol("S#11806", "CYC") });
        $ic106$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#11807", "CYC"), SubLObjectFactory.makeSymbol("S#11808", "CYC"), SubLObjectFactory.makeSymbol("S#11809", "CYC"), SubLObjectFactory.makeSymbol("S#11810", "CYC"), SubLObjectFactory.makeSymbol("S#11811", "CYC"), SubLObjectFactory.makeSymbol("S#11812", "CYC"), SubLObjectFactory.makeSymbol("S#11813", "CYC"), SubLObjectFactory.makeSymbol("S#11814", "CYC"), SubLObjectFactory.makeSymbol("S#11815", "CYC") });
        $ic107$ = SubLObjectFactory.makeSymbol("S#11797", "CYC");
        $ic108$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11731", "CYC"));
        $ic109$ = SubLObjectFactory.makeSymbol("S#11798", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#11807", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#11799", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#11808", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#11800", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#11809", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#11801", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#11810", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#11802", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#11811", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#11803", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#11812", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#11804", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#11813", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#11805", "CYC");
        $ic124$ = SubLObjectFactory.makeSymbol("S#11814", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#11806", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#11815", "CYC");
        $ic127$ = SubLObjectFactory.makeKeyword("GENERATING-FUNCTIONS");
        $ic128$ = SubLObjectFactory.makeKeyword("CURRENT-GENERATING-FUNCTION");
        $ic129$ = SubLObjectFactory.makeKeyword("TV");
        $ic130$ = SubLObjectFactory.makeSymbol("S#11816", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#11818", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#11008", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#11016", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#11024", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("CLET");
        $ic136$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11843", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11824", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11843", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11073", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11844", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11824", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11844", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11073", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11845", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11824", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11845", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11073", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11846", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11824", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#11846", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11073", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11847", "CYC"), (SubLObject)module0143.T));
        $ic137$ = SubLObjectFactory.makeSymbol("S#11030", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#11825", "CYC");
    }
    
    public static final class $sX11719_native extends SubLStructNative
    {
        public SubLObject $sbhl_link_node_search_state;
        public SubLObject $remaining_modules;
        public SubLObject $module_node_search_state_iterator;
        private static final SubLStructDeclNative structDecl;
        
        public $sX11719_native() {
            this.$sbhl_link_node_search_state = (SubLObject)CommonSymbols.NIL;
            this.$remaining_modules = (SubLObject)CommonSymbols.NIL;
            this.$module_node_search_state_iterator = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX11719_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$sbhl_link_node_search_state;
        }
        
        public SubLObject getField3() {
            return this.$remaining_modules;
        }
        
        public SubLObject getField4() {
            return this.$module_node_search_state_iterator;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$sbhl_link_node_search_state = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$remaining_modules = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$module_node_search_state_iterator = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX11719_native.class, module0143.$ic0$, module0143.$ic1$, module0143.$ic2$, module0143.$ic3$, new String[] { "$sbhl_link_node_search_state", "$remaining_modules", "$module_node_search_state_iterator" }, module0143.$ic4$, module0143.$ic5$, module0143.$ic6$);
        }
    }
    
    public static final class $f9328$UnaryFunction extends UnaryFunction
    {
        public $f9328$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11720"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0143.f9328(var3);
        }
    }
    
    public static final class $sX11725_native extends SubLStructNative
    {
        public SubLObject $mt_link_iterator;
        public SubLObject $tv_link_search_state_iterator;
        public SubLObject $graph_link;
        public SubLObject $module;
        public SubLObject $node;
        public SubLObject $direction;
        public SubLObject $genl_inverse_modeP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX11725_native() {
            this.$mt_link_iterator = (SubLObject)CommonSymbols.NIL;
            this.$tv_link_search_state_iterator = (SubLObject)CommonSymbols.NIL;
            this.$graph_link = (SubLObject)CommonSymbols.NIL;
            this.$module = (SubLObject)CommonSymbols.NIL;
            this.$node = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$genl_inverse_modeP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX11725_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$mt_link_iterator;
        }
        
        public SubLObject getField3() {
            return this.$tv_link_search_state_iterator;
        }
        
        public SubLObject getField4() {
            return this.$graph_link;
        }
        
        public SubLObject getField5() {
            return this.$module;
        }
        
        public SubLObject getField6() {
            return this.$node;
        }
        
        public SubLObject getField7() {
            return this.$direction;
        }
        
        public SubLObject getField8() {
            return this.$genl_inverse_modeP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$mt_link_iterator = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$tv_link_search_state_iterator = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$graph_link = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$module = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$node = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$genl_inverse_modeP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX11725_native.class, module0143.$ic31$, module0143.$ic32$, module0143.$ic33$, module0143.$ic34$, new String[] { "$mt_link_iterator", "$tv_link_search_state_iterator", "$graph_link", "$module", "$node", "$direction", "$genl_inverse_modeP" }, module0143.$ic35$, module0143.$ic36$, module0143.$ic6$);
        }
    }
    
    public static final class $f9354$UnaryFunction extends UnaryFunction
    {
        public $f9354$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11726"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0143.f9354(var3);
        }
    }
    
    public static final class $sX11728_native extends SubLStructNative
    {
        public SubLObject $tv_link_iterator;
        public SubLObject $current_tv;
        public SubLObject $current_remaining_nodes;
        public SubLObject $module;
        public SubLObject $parent_node;
        public SubLObject $direction;
        public SubLObject $mt;
        public SubLObject $genl_inverse_modeP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX11728_native() {
            this.$tv_link_iterator = (SubLObject)CommonSymbols.NIL;
            this.$current_tv = (SubLObject)CommonSymbols.NIL;
            this.$current_remaining_nodes = (SubLObject)CommonSymbols.NIL;
            this.$module = (SubLObject)CommonSymbols.NIL;
            this.$parent_node = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$genl_inverse_modeP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX11728_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$tv_link_iterator;
        }
        
        public SubLObject getField3() {
            return this.$current_tv;
        }
        
        public SubLObject getField4() {
            return this.$current_remaining_nodes;
        }
        
        public SubLObject getField5() {
            return this.$module;
        }
        
        public SubLObject getField6() {
            return this.$parent_node;
        }
        
        public SubLObject getField7() {
            return this.$direction;
        }
        
        public SubLObject getField8() {
            return this.$mt;
        }
        
        public SubLObject getField9() {
            return this.$genl_inverse_modeP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$tv_link_iterator = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$current_tv = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$current_remaining_nodes = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$module = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$parent_node = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$genl_inverse_modeP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX11728_native.class, module0143.$ic66$, module0143.$ic67$, module0143.$ic68$, module0143.$ic69$, new String[] { "$tv_link_iterator", "$current_tv", "$current_remaining_nodes", "$module", "$parent_node", "$direction", "$mt", "$genl_inverse_modeP" }, module0143.$ic70$, module0143.$ic71$, module0143.$ic6$);
        }
    }
    
    public static final class $f9382$UnaryFunction extends UnaryFunction
    {
        public $f9382$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11729"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0143.f9382(var3);
        }
    }
    
    public static final class $sX11730_native extends SubLStructNative
    {
        public SubLObject $generating_functions;
        public SubLObject $current_generating_function;
        public SubLObject $current_remaining_nodes;
        public SubLObject $module;
        public SubLObject $parent_node;
        public SubLObject $direction;
        public SubLObject $mt;
        public SubLObject $tv;
        public SubLObject $genl_inverse_modeP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX11730_native() {
            this.$generating_functions = (SubLObject)CommonSymbols.NIL;
            this.$current_generating_function = (SubLObject)CommonSymbols.NIL;
            this.$current_remaining_nodes = (SubLObject)CommonSymbols.NIL;
            this.$module = (SubLObject)CommonSymbols.NIL;
            this.$parent_node = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$tv = (SubLObject)CommonSymbols.NIL;
            this.$genl_inverse_modeP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX11730_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$generating_functions;
        }
        
        public SubLObject getField3() {
            return this.$current_generating_function;
        }
        
        public SubLObject getField4() {
            return this.$current_remaining_nodes;
        }
        
        public SubLObject getField5() {
            return this.$module;
        }
        
        public SubLObject getField6() {
            return this.$parent_node;
        }
        
        public SubLObject getField7() {
            return this.$direction;
        }
        
        public SubLObject getField8() {
            return this.$mt;
        }
        
        public SubLObject getField9() {
            return this.$tv;
        }
        
        public SubLObject getField10() {
            return this.$genl_inverse_modeP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$generating_functions = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$current_generating_function = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$current_remaining_nodes = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$module = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$parent_node = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$tv = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$genl_inverse_modeP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX11730_native.class, module0143.$ic101$, module0143.$ic102$, module0143.$ic103$, module0143.$ic104$, new String[] { "$generating_functions", "$current_generating_function", "$current_remaining_nodes", "$module", "$parent_node", "$direction", "$mt", "$tv", "$genl_inverse_modeP" }, module0143.$ic105$, module0143.$ic106$, module0143.$ic6$);
        }
    }
    
    public static final class $f9412$UnaryFunction extends UnaryFunction
    {
        public $f9412$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#11731"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0143.f9412(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0143.class
	Total time: 350 ms
	
	Decompiled with Procyon 0.5.32.
*/