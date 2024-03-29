package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
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

public final class module0116 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0116";
    public static final String myFingerPrint = "5a844689f54d9dbdd4e9107c74ac32aa1f8060e06a46956a5eae069c8a825ddf";
    public static SubLSymbol $g1453$;
    public static SubLSymbol $g1454$;
    private static SubLSymbol $g1455$;
    public static SubLSymbol $g1456$;
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
    private static final SubLString $ic21$;
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
    private static final SubLList $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
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
    private static final SubLString $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
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
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    
    public static SubLObject f7998(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7999(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10054_native.class) ? T : NIL);
    }
    
    public static SubLObject f8000(final SubLObject var1) {
        assert NIL != f7999(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8001(final SubLObject var1) {
        assert NIL != f7999(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8002(final SubLObject var1) {
        assert NIL != f7999(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8003(final SubLObject var1) {
        assert NIL != f7999(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f8004(final SubLObject var1, final SubLObject var4) {
        assert NIL != f7999(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8005(final SubLObject var1, final SubLObject var4) {
        assert NIL != f7999(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8006(final SubLObject var1, final SubLObject var4) {
        assert NIL != f7999(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8007(final SubLObject var1, final SubLObject var4) {
        assert NIL != f7999(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f8008(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10054_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic17$)) {
                f8004(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f8005(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f8006(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f8007(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8009(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic17$, f8000(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic18$, f8001(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic19$, f8002(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic20$, f8003(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f8010(final SubLObject var11, final SubLObject var12) {
        return f8009(var11, var12);
    }
    
    public static SubLObject f8011(final SubLObject var13, final SubLObject var14) {
        final SubLObject var15 = f8008((SubLObject)UNPROVIDED);
        f8004(var15, var14);
        f8005(var15, var13);
        f8006(var15, (SubLObject)NIL);
        f8007(var15, module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var15;
    }
    
    public static SubLObject f8012(final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        return module0067.f4886(f8003(var15), var16, var17);
    }
    
    public static SubLObject f8013(final SubLObject var15, final SubLObject var16) {
        return module0067.f4884(f8003(var15), var16, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f8014(final SubLObject var15) {
        return Equality.eq((SubLObject)$ic27$, f8013(var15, (SubLObject)$ic28$));
    }
    
    public static SubLObject f8015(final SubLObject var15) {
        return f8012(var15, (SubLObject)$ic28$, (SubLObject)$ic27$);
    }
    
    public static SubLObject f8016(final SubLObject var15) {
        return f8012(var15, (SubLObject)$ic28$, (SubLObject)$ic29$);
    }
    
    public static SubLObject f8017(final SubLObject var15) {
        return Equality.eq((SubLObject)$ic30$, f8013(var15, (SubLObject)$ic31$));
    }
    
    public static SubLObject f8018(final SubLObject var15) {
        return f8012(var15, (SubLObject)$ic31$, (SubLObject)$ic32$);
    }
    
    public static SubLObject f8019(final SubLObject var15) {
        return f8012(var15, (SubLObject)$ic31$, (SubLObject)$ic30$);
    }
    
    public static SubLObject f8020(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8021(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10056_native.class) ? T : NIL);
    }
    
    public static SubLObject f8022(final SubLObject var1) {
        assert NIL != f8021(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8023(final SubLObject var1) {
        assert NIL != f8021(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8024(final SubLObject var1) {
        assert NIL != f8021(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8025(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8021(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8026(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8021(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8027(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8021(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8028(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10056_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic47$)) {
                f8025(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic48$)) {
                f8026(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f8027(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8029(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic49$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic47$, f8022(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic48$, f8023(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic20$, f8024(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic49$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f8030(final SubLObject var11, final SubLObject var12) {
        return f8029(var11, var12);
    }
    
    public static SubLObject f8031() {
        final SubLObject var21 = f8028((SubLObject)UNPROVIDED);
        f8025(var21, Locks.make_lock((SubLObject)$ic51$));
        f8026(var21, module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f8027(var21, module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var21;
    }
    
    public static SubLObject f8032(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic52$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic52$);
        var27 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var28;
            var25 = (var28 = var26);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic41$, var27)), ConsesLow.append(var28, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic52$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8033(final SubLObject var27, final SubLObject var15) {
        assert NIL != f8021(var27) : var27;
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = f8022(var27);
        SubLObject var30 = (SubLObject)NIL;
        try {
            var30 = Locks.seize_lock(var29);
            final SubLObject var31 = f8023(var27);
            final SubLObject var32 = f8001(var15);
            if (NIL != f8034(var27, var32)) {
                var28 = (SubLObject)NIL;
            }
            else {
                module0067.f4886(var31, var32, var15);
                var28 = (SubLObject)T;
            }
        }
        finally {
            if (NIL != var30) {
                Locks.release_lock(var29);
            }
        }
        return var28;
    }
    
    public static SubLObject f8034(final SubLObject var27, final SubLObject var33) {
        assert NIL != f8021(var27) : var27;
        SubLObject var34 = (SubLObject)NIL;
        final SubLObject var35 = f8022(var27);
        SubLObject var36 = (SubLObject)NIL;
        try {
            var36 = Locks.seize_lock(var35);
            final SubLObject var37 = f8023(var27);
            var34 = module0067.f4884(var37, var33, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var36) {
                Locks.release_lock(var35);
            }
        }
        return var34;
    }
    
    public static SubLObject f8035(final SubLObject var36, final SubLObject var27) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)NIL;
        final SubLObject var39 = f8022(var27);
        SubLObject var40 = (SubLObject)NIL;
        try {
            var40 = Locks.seize_lock(var39);
            final SubLObject var41 = f8023(var27);
            SubLObject var42;
            for (var42 = module0066.f4838(module0067.f4891(var41)); NIL == module0066.f4841(var42); var42 = module0066.f4840(var42)) {
                var37.resetMultipleValues();
                final SubLObject var43 = module0066.f4839(var42);
                final SubLObject var44 = var37.secondMultipleValue();
                var37.resetMultipleValues();
                if (var36.eql(f8000(var44))) {
                    var38 = (SubLObject)ConsesLow.cons(var44, var38);
                }
            }
            module0066.f4842(var42);
        }
        finally {
            if (NIL != var40) {
                Locks.release_lock(var39);
            }
        }
        return var38;
    }
    
    public static SubLObject f8036(final SubLObject var27, final SubLObject var33) {
        assert NIL != f8021(var27) : var27;
        SubLObject var34 = (SubLObject)NIL;
        final SubLObject var35 = f8022(var27);
        SubLObject var36 = (SubLObject)NIL;
        try {
            var36 = Locks.seize_lock(var35);
            final SubLObject var37 = f8034(var27, var33);
            if (NIL != f7999(var37) && NIL != f8017(var37) && NIL == f8035(var33, var27)) {
                final SubLObject var38 = f8023(var27);
                module0067.f4887(var38, var33);
                var34 = (SubLObject)T;
            }
        }
        finally {
            if (NIL != var36) {
                Locks.release_lock(var35);
            }
        }
        return var34;
    }
    
    public static SubLObject f8037() {
        if (NIL == f8021($g1455$.getGlobalValue())) {
            $g1455$.setGlobalValue(f8031());
        }
        return $g1455$.getGlobalValue();
    }
    
    public static SubLObject f8038(final SubLObject var46, final SubLObject var14, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (NIL == f8021(var27)) {
            var27 = f8037();
        }
        final SubLObject var47 = f8011(var46, var14);
        if (NIL != var14 && NIL == f8034(var27, var14)) {
            Errors.error((SubLObject)$ic55$, var46, var14);
        }
        f8015(var47);
        f8018(var47);
        f8033(var27, var47);
        return var47;
    }
    
    public static SubLObject f8039(final SubLObject var47, final SubLObject var14, SubLObject var48, SubLObject var27) {
        if (var48 == UNPROVIDED) {
            var48 = (SubLObject)NIL;
        }
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        final SubLObject var49 = f8038(var47, var14, var27);
        if (var48.isString()) {
            f8012(var49, (SubLObject)$ic56$, var48);
        }
        return var49;
    }
    
    public static SubLObject f8040(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic57$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic57$);
        var27 = var25.first();
        var25 = var25.rest();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = var25;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var55_56 = (SubLObject)NIL;
        while (NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var24, (SubLObject)$ic57$);
            var55_56 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var24, (SubLObject)$ic57$);
            if (NIL == conses_high.member(var55_56, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var30 = (SubLObject)T;
            }
            if (var55_56 == $ic59$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (NIL != var30 && NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic57$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic60$, var25);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : NIL);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic17$, var25);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)$ic61$, var25);
        final SubLObject var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : NIL);
        final SubLObject var37;
        var25 = (var37 = var26);
        return (SubLObject)ConsesLow.list((SubLObject)$ic62$, var27, var34, var32, var36);
    }
    
    public static SubLObject f8041(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic85$);
        var26 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic86$, (SubLObject)ConsesLow.list((SubLObject)$ic87$, var26), (SubLObject)ConsesLow.listS((SubLObject)$ic88$, var26, (SubLObject)$ic89$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic85$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8042() {
        return $g1455$.getGlobalValue();
    }
    
    public static SubLObject f8043(final SubLObject var46, final SubLObject var14, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        assert NIL != Types.keywordp(var46) : var46;
        assert NIL != Types.keywordp(var14) : var14;
        if (NIL == var27) {
            var27 = f8037();
        }
        assert NIL != f8021(var27) : var27;
        if (NIL == f8034(var27, var14)) {
            Errors.error((SubLObject)$ic91$, var14);
        }
        final SubLObject var47 = f8011(var46, var14);
        return f8033(var27, var47);
    }
    
    public static SubLObject f8044(final SubLObject var46, SubLObject var27) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        assert NIL != Types.keywordp(var46) : var46;
        if (NIL == var27) {
            var27 = f8037();
        }
        assert NIL != f8021(var27) : var27;
        return f8034(var27, var46);
    }
    
    public static SubLObject f8045(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic92$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic92$);
        var27 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic92$);
        var28 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic92$);
        var29 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var30;
            var25 = (var30 = var26);
            return (SubLObject)ConsesLow.list((SubLObject)$ic93$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var27, var28)), (SubLObject)ConsesLow.list((SubLObject)$ic94$, var27, reader.bq_cons((SubLObject)$ic95$, ConsesLow.append(var30, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic96$, (SubLObject)ConsesLow.listS((SubLObject)EQ, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var27), (SubLObject)$ic97$), (SubLObject)ConsesLow.listS((SubLObject)$ic88$, var27, (SubLObject)$ic98$), (SubLObject)ConsesLow.list((SubLObject)$ic88$, var27, (SubLObject)ConsesLow.list((SubLObject)$ic99$, var29, (SubLObject)ConsesLow.list((SubLObject)$ic9$, var27))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic92$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8046(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic100$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic100$);
        var27 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic100$);
        var28 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic100$);
        var29 = var25.first();
        var25 = var25.rest();
        final SubLObject var30 = (SubLObject)(var25.isCons() ? var25.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var25, var24, (SubLObject)$ic100$);
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var31;
            var25 = (var31 = var26);
            final SubLObject var32 = (SubLObject)$ic101$;
            final SubLObject var33 = (SubLObject)$ic102$;
            final SubLObject var34 = (SubLObject)$ic103$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic93$, (SubLObject)ConsesLow.list(reader.bq_cons(var32, (SubLObject)$ic104$), reader.bq_cons(var29, (SubLObject)$ic98$)), (SubLObject)ConsesLow.list((SubLObject)$ic83$, var30), (SubLObject)ConsesLow.listS((SubLObject)$ic105$, var30, (SubLObject)$ic106$), (SubLObject)ConsesLow.list((SubLObject)$ic107$, var28, var32), (SubLObject)ConsesLow.list((SubLObject)$ic94$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, (SubLObject)ConsesLow.list((SubLObject)$ic109$, var32)), (SubLObject)ConsesLow.listS((SubLObject)$ic93$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)$ic110$, var32)), (SubLObject)ConsesLow.list(var34, (SubLObject)ConsesLow.list((SubLObject)$ic111$, var27, var30))), (SubLObject)ConsesLow.list((SubLObject)$ic88$, var29, var34), ConsesLow.append(var31, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic112$, (SubLObject)ConsesLow.list(var33, var34), (SubLObject)ConsesLow.list((SubLObject)$ic107$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var33), var32)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic100$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8047(SubLObject var27, SubLObject var2) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLObject var28 = module0055.f4017();
        SubLObject var29 = (SubLObject)NIL;
        if (NIL == var27) {
            var27 = f8037();
        }
        assert NIL != f8021(var27) : var27;
        module0055.f4021((SubLObject)$ic63$, var28);
        while (NIL == module0055.f4019(var28)) {
            final SubLObject var30 = module0055.f4023(var28);
            final SubLObject var31 = var29 = f8035(var30, var27);
            PrintLow.format(var2, (SubLObject)$ic113$, var30);
            if (NIL != var29) {
                streams_high.write_string((SubLObject)$ic114$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var32 = var29;
                SubLObject var33 = (SubLObject)NIL;
                var33 = var32.first();
                while (NIL != var32) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic115$, f8001(var33));
                    var32 = var32.rest();
                    var33 = var32.first();
                }
            }
            streams_high.terpri(var2);
            SubLObject var32 = var31;
            SubLObject var34 = (SubLObject)NIL;
            var34 = var32.first();
            while (NIL != var32) {
                module0055.f4021(f8001(var34), var28);
                var32 = var32.rest();
                var34 = var32.first();
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f8048(SubLObject var27, SubLObject var78, SubLObject var2) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)NIL;
        }
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        if (NIL == var27) {
            var27 = f8037();
        }
        assert NIL != f8021(var27) : var27;
        return f8049(var78, var27, var2, (SubLObject)ZERO_INTEGER);
    }
    
    public static SubLObject f8049(final SubLObject var46, final SubLObject var27, final SubLObject var2, final SubLObject var79) {
        module0038.f2648(var2, var79);
        print_high.prin1(var46, var2);
        streams_high.terpri(var2);
        final SubLObject var80 = Numbers.add(var79, (SubLObject)THREE_INTEGER);
        SubLObject var81 = f8035(var46, var27);
        SubLObject var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            f8049(f8001(var82), var27, var2, var80);
            var81 = var81.rest();
            var82 = var81.first();
        }
        return var46;
    }
    
    public static SubLObject f8050(final SubLObject var1, final SubLObject var2) {
        f8051(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8052(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX10058_native.class) ? T : NIL);
    }
    
    public static SubLObject f8053(final SubLObject var1) {
        assert NIL != f8052(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f8054(final SubLObject var1) {
        assert NIL != f8052(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f8055(final SubLObject var1) {
        assert NIL != f8052(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f8056(final SubLObject var1) {
        assert NIL != f8052(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f8057(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8052(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f8058(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8052(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f8059(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8052(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f8060(final SubLObject var1, final SubLObject var4) {
        assert NIL != f8052(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f8061(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX10058_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic132$)) {
                f8057(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic133$)) {
                f8058(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic134$)) {
                f8059(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic135$)) {
                f8060(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f8062(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic136$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic132$, f8053(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic133$, f8054(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic134$, f8055(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic135$, f8056(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic136$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f8063(final SubLObject var11, final SubLObject var12) {
        return f8062(var11, var12);
    }
    
    public static SubLObject f8064(final SubLObject var84, SubLObject var85, SubLObject var86) {
        if (var85 == UNPROVIDED) {
            var85 = (SubLObject)NIL;
        }
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        final SubLObject var87 = f8061((SubLObject)UNPROVIDED);
        f8057(var87, var84);
        f8058(var87, Time.get_universal_time());
        f8059(var87, var86);
        f8060(var87, var85);
        return var87;
    }
    
    public static SubLObject f8051(final SubLObject var87, final SubLObject var2, final SubLObject var88) {
        streams_high.write_string((SubLObject)$ic138$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.princ(f8053(var87), var2);
        streams_high.write_string((SubLObject)$ic139$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != f8055(var87)) {
            streams_high.write_string((SubLObject)$ic140$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f8055(var87), var2);
        }
        streams_high.write_string((SubLObject)$ic141$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.princ(module0051.f3552(f8054(var87)), var2);
        if (NIL != f8056(var87)) {
            streams_high.terpri(var2);
            streams_high.write_string((SubLObject)$ic142$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f8056(var87), var2);
        }
        streams_high.write_string((SubLObject)$ic143$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var87;
    }
    
    public static SubLObject f8065() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f7998", "S#10060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f7999", "S#10055", 1, 0, false);
        new $f7999$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8000", "S#10061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8001", "S#10062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8002", "S#10063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8003", "S#10064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8004", "S#10065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8005", "S#10066", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8006", "S#10067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8007", "S#10068", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8008", "S#10069", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8009", "S#10070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8010", "S#10071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8011", "S#10072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8012", "S#10073", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8013", "S#10074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8014", "S#10075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8015", "S#10076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8016", "S#10077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8017", "S#10078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8018", "S#10079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8019", "S#10080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8020", "S#10081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8021", "S#10057", 1, 0, false);
        new $f8021$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8022", "S#10082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8023", "S#10083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8024", "S#10084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8025", "S#10085", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8026", "S#10086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8027", "S#10087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8028", "S#10088", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8029", "S#10089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8030", "S#10090", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8031", "S#10091", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0116", "f8032", "S#10092");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8033", "S#10093", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8034", "S#10094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8035", "S#10095", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8036", "S#10096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8037", "S#10097", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8038", "S#10098", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8039", "S#10099", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0116", "f8040", "S#10100");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0116", "f8041", "S#10101");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8042", "S#10102", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8043", "S#10103", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8044", "S#10104", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0116", "f8045", "S#10105");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0116", "f8046", "S#10106");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8047", "S#10107", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8048", "S#10108", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8049", "S#10109", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8050", "S#10110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8052", "S#10059", 1, 0, false);
        new $f8052$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8053", "S#10054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8054", "S#10111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8055", "S#10112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8056", "S#10113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8057", "S#10114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8058", "S#10115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8059", "S#10116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8060", "S#10117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8061", "S#10118", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8062", "S#10119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8063", "S#10120", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8064", "S#10121", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0116", "f8051", "S#10122", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8066() {
        $g1453$ = SubLFiles.defconstant("S#10123", (SubLObject)$ic0$);
        $g1454$ = SubLFiles.defconstant("S#10124", (SubLObject)$ic33$);
        $g1455$ = SubLFiles.deflexical("S#10125", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic54$)) ? $g1455$.getGlobalValue() : NIL));
        $g1456$ = SubLFiles.defconstant("S#10126", (SubLObject)$ic116$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f8067() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1453$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1453$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1454$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic39$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic40$);
        Structures.def_csetf((SubLObject)$ic41$, (SubLObject)$ic42$);
        Structures.def_csetf((SubLObject)$ic43$, (SubLObject)$ic44$);
        Structures.def_csetf((SubLObject)$ic45$, (SubLObject)$ic46$);
        Equality.identity((SubLObject)$ic33$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1454$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic50$));
        module0003.f57((SubLObject)$ic54$);
        f8039((SubLObject)$ic63$, (SubLObject)NIL, (SubLObject)$ic64$, (SubLObject)NIL);
        f8039((SubLObject)$ic65$, (SubLObject)$ic63$, (SubLObject)$ic66$, (SubLObject)NIL);
        f8039((SubLObject)$ic67$, (SubLObject)$ic63$, (SubLObject)$ic68$, (SubLObject)NIL);
        f8039((SubLObject)$ic69$, (SubLObject)$ic65$, (SubLObject)$ic70$, (SubLObject)NIL);
        f8039((SubLObject)$ic71$, (SubLObject)$ic67$, (SubLObject)$ic72$, (SubLObject)NIL);
        f8039((SubLObject)$ic73$, (SubLObject)$ic71$, (SubLObject)$ic74$, (SubLObject)NIL);
        f8039((SubLObject)$ic75$, (SubLObject)$ic71$, (SubLObject)$ic76$, (SubLObject)NIL);
        f8039((SubLObject)$ic77$, (SubLObject)$ic71$, (SubLObject)$ic78$, (SubLObject)NIL);
        f8039((SubLObject)$ic79$, (SubLObject)$ic71$, (SubLObject)$ic80$, (SubLObject)NIL);
        f8039((SubLObject)$ic81$, (SubLObject)$ic71$, (SubLObject)$ic82$, (SubLObject)NIL);
        module0002.f50((SubLObject)$ic83$, (SubLObject)$ic84$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1456$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic123$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic124$);
        Structures.def_csetf((SubLObject)$ic0$, (SubLObject)$ic125$);
        Structures.def_csetf((SubLObject)$ic126$, (SubLObject)$ic127$);
        Structures.def_csetf((SubLObject)$ic128$, (SubLObject)$ic129$);
        Structures.def_csetf((SubLObject)$ic130$, (SubLObject)$ic131$);
        Equality.identity((SubLObject)$ic116$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1456$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic137$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f8065();
    }
    
    public void initializeVariables() {
        f8066();
    }
    
    public void runTopLevelForms() {
        f8067();
    }
    
    static {
        me = (SubLFile)new module0116();
        $g1453$ = null;
        $g1454$ = null;
        $g1455$ = null;
        $g1456$ = null;
        $ic0$ = makeSymbol("S#10054", "CYC");
        $ic1$ = makeSymbol("S#10055", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#10127", "CYC"), (SubLObject)makeSymbol("S#10128", "CYC"), (SubLObject)makeSymbol("S#32", "CYC"), (SubLObject)makeSymbol("S#5852", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("PARENT"), (SubLObject)makeKeyword("SELF"), (SubLObject)makeKeyword("PATTERN"), (SubLObject)makeKeyword("PROPERTIES"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#10061", "CYC"), (SubLObject)makeSymbol("S#10062", "CYC"), (SubLObject)makeSymbol("S#10063", "CYC"), (SubLObject)makeSymbol("S#10064", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#10065", "CYC"), (SubLObject)makeSymbol("S#10066", "CYC"), (SubLObject)makeSymbol("S#10067", "CYC"), (SubLObject)makeSymbol("S#10068", "CYC"));
        $ic6$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic7$ = makeSymbol("S#10060", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#10055", "CYC"));
        $ic9$ = makeSymbol("S#10061", "CYC");
        $ic10$ = makeSymbol("S#10065", "CYC");
        $ic11$ = makeSymbol("S#10062", "CYC");
        $ic12$ = makeSymbol("S#10066", "CYC");
        $ic13$ = makeSymbol("S#10063", "CYC");
        $ic14$ = makeSymbol("S#10067", "CYC");
        $ic15$ = makeSymbol("S#10064", "CYC");
        $ic16$ = makeSymbol("S#10068", "CYC");
        $ic17$ = makeKeyword("PARENT");
        $ic18$ = makeKeyword("SELF");
        $ic19$ = makeKeyword("PATTERN");
        $ic20$ = makeKeyword("PROPERTIES");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#10069", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#10071", "CYC");
        $ic27$ = makeKeyword("ABSTRACT");
        $ic28$ = makeKeyword("TYPE");
        $ic29$ = makeKeyword("INSTANTIATABLE");
        $ic30$ = makeKeyword("TRUE");
        $ic31$ = makeKeyword("MUTABLE");
        $ic32$ = makeKeyword("FALSE");
        $ic33$ = makeSymbol("S#10056", "CYC");
        $ic34$ = makeSymbol("S#10057", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#10129", "CYC"), (SubLObject)makeSymbol("S#5852", "CYC"));
        $ic36$ = ConsesLow.list((SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("GRAPH"), (SubLObject)makeKeyword("PROPERTIES"));
        $ic37$ = ConsesLow.list((SubLObject)makeSymbol("S#10082", "CYC"), (SubLObject)makeSymbol("S#10083", "CYC"), (SubLObject)makeSymbol("S#10084", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#10085", "CYC"), (SubLObject)makeSymbol("S#10086", "CYC"), (SubLObject)makeSymbol("S#10087", "CYC"));
        $ic39$ = makeSymbol("S#10081", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#10057", "CYC"));
        $ic41$ = makeSymbol("S#10082", "CYC");
        $ic42$ = makeSymbol("S#10085", "CYC");
        $ic43$ = makeSymbol("S#10083", "CYC");
        $ic44$ = makeSymbol("S#10086", "CYC");
        $ic45$ = makeSymbol("S#10084", "CYC");
        $ic46$ = makeSymbol("S#10087", "CYC");
        $ic47$ = makeKeyword("LOCK");
        $ic48$ = makeKeyword("GRAPH");
        $ic49$ = makeSymbol("S#10088", "CYC");
        $ic50$ = makeSymbol("S#10090", "CYC");
        $ic51$ = makeString("Event Hierarchy");
        $ic52$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic53$ = makeSymbol("WITH-LOCK-HELD");
        $ic54$ = makeSymbol("S#10125", "CYC");
        $ic55$ = makeString("Cannot register base-class ~S with unknown parent ~S.~%");
        $ic56$ = makeKeyword("DOC-STRING");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10131", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#10132", "CYC"), (SubLObject)makeSymbol("S#10127", "CYC"), (SubLObject)makeSymbol("S#10130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic58$ = ConsesLow.list((SubLObject)makeKeyword("DOC"), (SubLObject)makeKeyword("PARENT"), (SubLObject)makeKeyword("HIERARCHY"));
        $ic59$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic60$ = makeKeyword("DOC");
        $ic61$ = makeKeyword("HIERARCHY");
        $ic62$ = makeSymbol("S#10099", "CYC");
        $ic63$ = makeKeyword("EVENT-ROOT");
        $ic64$ = makeString("The root class of all events in the hierarchy.");
        $ic65$ = makeKeyword("SYSTEM-EVENT");
        $ic66$ = makeString("All of the events used by the runtime support system itself.");
        $ic67$ = makeKeyword("APPLICATION-EVENT");
        $ic68$ = makeString("All of the events used by the applications written by the users.");
        $ic69$ = makeKeyword("SUBLISP-EVENT");
        $ic70$ = makeString("All of the events triggered by SubLISP code.");
        $ic71$ = makeKeyword("CYC-EVENT");
        $ic72$ = makeString("All of the events triggered by the CYC implementation.");
        $ic73$ = makeKeyword("KB-STORE-EVENT");
        $ic74$ = makeString("All of the events triggered by the KB implementation.");
        $ic75$ = makeKeyword("INFERENCE-EVENT");
        $ic76$ = makeString("All of the events triggered by the inference engine.");
        $ic77$ = makeKeyword("SBHL-EVENT");
        $ic78$ = makeString("All of the events triggered by the SBHL reasoning subsystem.");
        $ic79$ = makeKeyword("NL-EVENT");
        $ic80$ = makeString("All of the events triggered by the NL subsystem.");
        $ic81$ = makeKeyword("CYC-APPLICATION-EVENT");
        $ic82$ = makeString("The parent for all events that are trigged by applications built on top of CYC.");
        $ic83$ = makeSymbol("S#10101", "CYC");
        $ic84$ = makeSymbol("S#10106", "CYC");
        $ic85$ = ConsesLow.list((SubLObject)makeSymbol("S#10130", "CYC"));
        $ic86$ = makeSymbol("PWHEN");
        $ic87$ = makeSymbol("NULL");
        $ic88$ = makeSymbol("CSETQ");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10097", "CYC")));
        $ic90$ = makeSymbol("KEYWORDP");
        $ic91$ = makeString("Cannot register event ~S for unknown parent ~S.~%");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10133", "CYC"), (SubLObject)makeSymbol("S#10058", "CYC"), (SubLObject)makeSymbol("S#10130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic93$ = makeSymbol("CLET");
        $ic94$ = makeSymbol("WHILE");
        $ic95$ = makeSymbol("PROGN");
        $ic96$ = makeSymbol("PIF");
        $ic97$ = ConsesLow.list((SubLObject)makeKeyword("EVENT-ROOT"));
        $ic98$ = ConsesLow.list((SubLObject)NIL);
        $ic99$ = makeSymbol("S#10094", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10133", "CYC"), (SubLObject)makeSymbol("S#10058", "CYC"), (SubLObject)makeSymbol("S#9176", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic101$ = makeUninternedSymbol("US#356AA47");
        $ic102$ = makeUninternedSymbol("US#1265892");
        $ic103$ = makeUninternedSymbol("US#12658C1");
        $ic104$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4669", "CYC")));
        $ic105$ = makeSymbol("CHECK-TYPE");
        $ic106$ = ConsesLow.list((SubLObject)makeSymbol("S#10057", "CYC"));
        $ic107$ = makeSymbol("S#4670", "CYC");
        $ic108$ = makeSymbol("CNOT");
        $ic109$ = makeSymbol("S#4672", "CYC");
        $ic110$ = makeSymbol("S#4671", "CYC");
        $ic111$ = makeSymbol("S#10095", "CYC");
        $ic112$ = makeSymbol("CDOLIST");
        $ic113$ = makeString(" ~S ");
        $ic114$ = makeString(" => ");
        $ic115$ = makeString(" ~S");
        $ic116$ = makeSymbol("S#10058", "CYC");
        $ic117$ = makeSymbol("S#10059", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)makeSymbol("CLASS"), (SubLObject)makeSymbol("S#4956", "CYC"), (SubLObject)makeSymbol("S#10134", "CYC"), (SubLObject)makeSymbol("S#295", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("TIMESTAMP"), (SubLObject)makeKeyword("SOURCE"), (SubLObject)makeKeyword("MESSAGE"));
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("S#10054", "CYC"), (SubLObject)makeSymbol("S#10111", "CYC"), (SubLObject)makeSymbol("S#10112", "CYC"), (SubLObject)makeSymbol("S#10113", "CYC"));
        $ic121$ = ConsesLow.list((SubLObject)makeSymbol("S#10114", "CYC"), (SubLObject)makeSymbol("S#10115", "CYC"), (SubLObject)makeSymbol("S#10116", "CYC"), (SubLObject)makeSymbol("S#10117", "CYC"));
        $ic122$ = makeSymbol("S#10122", "CYC");
        $ic123$ = makeSymbol("S#10110", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#10059", "CYC"));
        $ic125$ = makeSymbol("S#10114", "CYC");
        $ic126$ = makeSymbol("S#10111", "CYC");
        $ic127$ = makeSymbol("S#10115", "CYC");
        $ic128$ = makeSymbol("S#10112", "CYC");
        $ic129$ = makeSymbol("S#10116", "CYC");
        $ic130$ = makeSymbol("S#10113", "CYC");
        $ic131$ = makeSymbol("S#10117", "CYC");
        $ic132$ = makeKeyword("CLASS");
        $ic133$ = makeKeyword("TIMESTAMP");
        $ic134$ = makeKeyword("SOURCE");
        $ic135$ = makeKeyword("MESSAGE");
        $ic136$ = makeSymbol("S#10118", "CYC");
        $ic137$ = makeSymbol("S#10120", "CYC");
        $ic138$ = makeString("#<EVENT ");
        $ic139$ = makeString(" posted");
        $ic140$ = makeString(" by ");
        $ic141$ = makeString(" at ");
        $ic142$ = makeString("  w/ msg ");
        $ic143$ = makeString("> ");
    }
    
    public static final class $sX10054_native extends SubLStructNative
    {
        public SubLObject $parent;
        public SubLObject $self;
        public SubLObject $pattern;
        public SubLObject $properties;
        public static final SubLStructDeclNative structDecl;
        
        public $sX10054_native() {
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$self = (SubLObject)CommonSymbols.NIL;
            this.$pattern = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$parent;
        }
        
        public SubLObject getField3() {
            return this.$self;
        }
        
        public SubLObject getField4() {
            return this.$pattern;
        }
        
        public SubLObject getField5() {
            return this.$properties;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$parent = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$self = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$pattern = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10054_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$parent", "$self", "$pattern", "$properties" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f7999$UnaryFunction extends UnaryFunction
    {
        public $f7999$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10055"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f7999(var3);
        }
    }
    
    public static final class $sX10056_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $graph;
        public SubLObject $properties;
        public static final SubLStructDeclNative structDecl;
        
        public $sX10056_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$graph = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$lock;
        }
        
        public SubLObject getField3() {
            return this.$graph;
        }
        
        public SubLObject getField4() {
            return this.$properties;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$graph = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10056_native.class, $ic33$, $ic34$, $ic35$, $ic36$, new String[] { "$lock", "$graph", "$properties" }, $ic37$, $ic38$, $ic6$);
        }
    }
    
    public static final class $f8021$UnaryFunction extends UnaryFunction
    {
        public $f8021$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10057"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f8021(var3);
        }
    }
    
    public static final class $sX10058_native extends SubLStructNative
    {
        public SubLObject $class;
        public SubLObject $timestamp;
        public SubLObject $source;
        public SubLObject $message;
        public static final SubLStructDeclNative structDecl;
        
        public $sX10058_native() {
            this.$class = (SubLObject)CommonSymbols.NIL;
            this.$timestamp = (SubLObject)CommonSymbols.NIL;
            this.$source = (SubLObject)CommonSymbols.NIL;
            this.$message = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$class;
        }
        
        public SubLObject getField3() {
            return this.$timestamp;
        }
        
        public SubLObject getField4() {
            return this.$source;
        }
        
        public SubLObject getField5() {
            return this.$message;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$class = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$timestamp = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$source = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$message = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX10058_native.class, $ic116$, $ic117$, $ic118$, $ic119$, new String[] { "$class", "$timestamp", "$source", "$message" }, $ic120$, $ic121$, $ic122$);
        }
    }
    
    public static final class $f8052$UnaryFunction extends UnaryFunction
    {
        public $f8052$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#10059"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f8052(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 276 ms
	
	Decompiled with Procyon 0.5.32.
*/