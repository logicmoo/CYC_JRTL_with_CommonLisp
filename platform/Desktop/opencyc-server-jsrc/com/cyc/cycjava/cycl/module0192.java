package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
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

public final class module0192 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0192";
    public static final String myFingerPrint = "c475ce6f9ac453d3e8369d6bf9654e34a10ce8bbb9fe071da5b4c07e2619c687";
    public static SubLSymbol $g2252$;
    private static SubLSymbol $g2253$;
    private static SubLSymbol $g2254$;
    private static SubLSymbol $g2255$;
    public static SubLSymbol $g2256$;
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
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    
    public static SubLObject f12004(final SubLObject var1, final SubLObject var2) {
        f12005(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12006(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX14782_native.class) ? T : NIL);
    }
    
    public static SubLObject f12007(final SubLObject var1) {
        assert NIL != f12006(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f12008(final SubLObject var1) {
        assert NIL != f12006(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f12009(final SubLObject var1) {
        assert NIL != f12006(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f12010(final SubLObject var1, final SubLObject var4) {
        assert NIL != f12006(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f12011(final SubLObject var1, final SubLObject var4) {
        assert NIL != f12006(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f12012(final SubLObject var1, final SubLObject var4) {
        assert NIL != f12006(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f12013(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX14782_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic16$)) {
                f12010(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic17$)) {
                f12011(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f12012(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic19$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f12014(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic20$, (SubLObject)$ic21$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic16$, f12007(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic17$, f12008(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic18$, f12009(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic23$, (SubLObject)$ic21$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f12015(final SubLObject var11, final SubLObject var12) {
        return f12014(var11, var12);
    }
    
    public static SubLObject f12005(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != f12016(var13, (SubLObject)UNPROVIDED)) {
            final SubLObject var16 = (NIL != assertion_handles_oc.$g2195$.getDynamicValue(var15)) ? f12017(var13) : f12018(var13, module0018.$g583$.getDynamicValue(var15));
            print_high.princ((SubLObject)$ic25$, var2);
            if (var16.isCons()) {
                print_high.prin1(var16, var2);
            }
            else {
                print_high.princ((SubLObject)$ic26$, var2);
            }
            print_high.princ((SubLObject)$ic27$, var2);
        }
        else if (var13.eql(module0338.f22713())) {
            PrintLow.format(var2, (SubLObject)$ic28$);
        }
        else {
            compatibility.default_struct_print_function(var13, var2, var14);
        }
        return var13;
    }
    
    public static SubLObject f12019(final SubLObject var13) {
        final SubLObject var14 = f12007(var13);
        if (var14.isInteger()) {
            return var14;
        }
        return (SubLObject)$ic29$;
    }
    
    public static SubLObject f12020() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = Storage.$current_area$.currentBinding(var15);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var15);
            var16 = f12013((SubLObject)UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(var17, var15);
        }
        return var16;
    }
    
    public static SubLObject f12021(final SubLObject var19) {
        f12010(var19, (SubLObject)NIL);
        f12011(var19, (SubLObject)NIL);
        f12012(var19, (SubLObject)NIL);
        return var19;
    }
    
    public static SubLObject f12022(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f12006(var13) && f12008(var13) == $ic32$);
    }
    
    public static SubLObject f12023(SubLObject var13) {
        assert NIL != f12006(var13) : var13;
        if (NIL == f12022(var13)) {
            var13 = f12021(var13);
            f12011(var13, (SubLObject)$ic32$);
            if (NIL != module0012.$g63$.getGlobalValue()) {
                final SubLObject var14 = $g2254$.getGlobalValue();
                SubLObject var15 = (SubLObject)NIL;
                try {
                    var15 = Locks.seize_lock(var14);
                    f12010(var13, $g2253$.getGlobalValue());
                    $g2253$.setGlobalValue(var13);
                }
                finally {
                    if (NIL != var15) {
                        Locks.release_lock(var14);
                    }
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12024() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != module0012.$g63$.getGlobalValue()) {
            SubLObject var16 = (SubLObject)NIL;
            SubLObject var17 = (SubLObject)NIL;
            final SubLObject var18 = $g2254$.getGlobalValue();
            SubLObject var19 = (SubLObject)NIL;
            try {
                var19 = Locks.seize_lock(var18);
                var16 = $g2253$.getGlobalValue();
                while (NIL == var17 && NIL != var16) {
                    if (NIL != f12022(var16)) {
                        $g2253$.setGlobalValue(f12007(var16));
                        var17 = (SubLObject)T;
                    }
                    else {
                        var16 = f12007(var16);
                    }
                }
                if (NIL == var17) {
                    if (NIL != module0012.$g64$.getDynamicValue(var15)) {
                        var16 = f12020();
                    }
                    else {
                        var16 = f12013((SubLObject)UNPROVIDED);
                    }
                    $g2253$.setGlobalValue((SubLObject)NIL);
                }
            }
            finally {
                if (NIL != var19) {
                    Locks.release_lock(var18);
                }
            }
            return f12021(var16);
        }
        if (NIL != module0012.$g64$.getDynamicValue(var15)) {
            return f12021(f12020());
        }
        return f12021(f12013((SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f12025(final SubLObject var19) {
        assert NIL != f12006(var19) : var19;
        return f12007(var19);
    }
    
    public static SubLObject f12026(final SubLObject var19, final SubLObject var25) {
        f12010(var19, var25);
        return var19;
    }
    
    public static SubLObject f12017(final SubLObject var19) {
        assert NIL != f12006(var19) : var19;
        return f12008(var19);
    }
    
    public static SubLObject f12027(final SubLObject var19) {
        return (SubLObject)makeBoolean(NIL != f12006(var19) && NIL != module0232.f15322(f12017(var19)));
    }
    
    public static SubLObject f12018(final SubLObject var19, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)$ic33$;
        }
        assert NIL != f12006(var19) : var19;
        return module0232.f15328(f12017(var19), var26);
    }
    
    public static SubLObject f12028(final SubLObject var27, final SubLObject var28) {
        SubLObject var30;
        final SubLObject var29 = var30 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic34$);
        final SubLObject var31 = var30.rest();
        var30 = var30.first();
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic34$);
        var32 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic34$);
        var33 = var30.first();
        var30 = var30.rest();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = var30;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var36_37 = (SubLObject)NIL;
        while (NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var29, (SubLObject)$ic34$);
            var36_37 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var29, (SubLObject)$ic34$);
            if (NIL == conses_high.member(var36_37, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var36 = (SubLObject)T;
            }
            if (var36_37 == $ic36$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (NIL != var36 && NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)$ic34$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var30);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        final SubLObject var39;
        var30 = (var39 = var31);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic38$, (SubLObject)ConsesLow.list(var32, (SubLObject)ConsesLow.list((SubLObject)$ic39$, var33), (SubLObject)$ic37$, var38), ConsesLow.append(var39, (SubLObject)NIL));
    }
    
    public static SubLObject f12029(final SubLObject var19) {
        assert NIL != f12006(var19) : var19;
        return f12009(var19);
    }
    
    public static SubLObject f12030(final SubLObject var19, final SubLObject var41) {
        f12012(var19, var41);
        return var19;
    }
    
    public static SubLObject f12016(final SubLObject var19, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        if (NIL == f12006(var19) || !f12025(var19).isInteger()) {
            return (SubLObject)NIL;
        }
        if (NIL == var42) {
            return (SubLObject)T;
        }
        final SubLObject var43 = f12017(var19);
        final SubLObject var44 = f12029(var19);
        return (SubLObject)makeBoolean(NIL != module0232.f15320(var43) && NIL == module0035.f2439(Symbols.symbol_function((SubLObject)$ic40$), var43, (SubLObject)UNPROVIDED) && var44.isCons() && NIL != module0035.f2370(Symbols.symbol_function((SubLObject)$ic41$), var44, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f12031(final SubLObject var19, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != f12006(var19) && NIL == f12016(var19, var42));
    }
    
    public static SubLObject f12032(final SubLObject var17) {
        assert NIL != Types.integerp(var17) : var17;
        return f12033(var17);
    }
    
    public static SubLObject f12034(final SubLObject var43) {
        assert NIL != module0232.f15320(var43) : var43;
        final SubLObject var44 = f12035(var43, (SubLObject)UNPROVIDED);
        return var44;
    }
    
    public static SubLObject f12035(final SubLObject var43, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        assert NIL != module0232.f15320(var43) : var43;
        if (NIL == var17) {
            var17 = f12036();
        }
        assert NIL != Types.integerp(var17) : var17;
        final SubLObject var44 = f12024();
        f12037(var44, var17);
        f12011(var44, var43);
        return var44;
    }
    
    public static SubLObject f12038() {
        if (NIL != module0121.f8276()) {
            Errors.sublisp_break((SubLObject)$ic44$, EMPTY_SUBL_OBJECT_ARRAY);
        }
        return f12024();
    }
    
    public static SubLObject f12039(final SubLObject var19, final SubLObject var45) {
        assert NIL != assertion_handles_oc.f11035(var45) : var45;
        assert NIL != f12006(var19) : var19;
        f12030(var19, (SubLObject)ConsesLow.cons(var45, f12029(var19)));
        return var19;
    }
    
    public static SubLObject f12040(final SubLObject var19) {
        assert NIL != f12006(var19) : var19;
        f12041(f12025(var19));
        f12023(var19);
        return (SubLObject)T;
    }
    
    public static SubLObject f12042(final SubLObject var19, final SubLObject var45) {
        assert NIL != assertion_handles_oc.f11035(var45) : var45;
        assert NIL != f12006(var19) : var19;
        f12030(var19, module0035.f2073(var45, f12029(var19), (SubLObject)UNPROVIDED));
        return f12043(var19);
    }
    
    public static SubLObject f12043(final SubLObject var19) {
        assert NIL != f12006(var19) : var19;
        final SubLObject var20 = f12029(var19);
        if (NIL != module0035.f1997(var20)) {
            final SubLObject var21 = var20.first();
            final SubLObject var22 = f12017(var19);
            assertions_low_oc.f11206(var21, var22);
            f12040(var19);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12044(final SubLObject var27, final SubLObject var28) {
        SubLObject var30;
        final SubLObject var29 = var30 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic47$);
        final SubLObject var31 = var30.rest();
        var30 = var30.first();
        SubLObject var32 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var30, var29, (SubLObject)$ic47$);
        var32 = var30.first();
        var30 = var30.rest();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = var30;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var54_55 = (SubLObject)NIL;
        while (NIL != var34) {
            cdestructuring_bind.destructuring_bind_must_consp(var34, var29, (SubLObject)$ic47$);
            var54_55 = var34.first();
            var34 = var34.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var34, var29, (SubLObject)$ic47$);
            if (NIL == conses_high.member(var54_55, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var35 = (SubLObject)T;
            }
            if (var54_55 == $ic36$) {
                var33 = var34.first();
            }
            var34 = var34.rest();
        }
        if (NIL != var35 && NIL == var33) {
            cdestructuring_bind.cdestructuring_bind_error(var29, (SubLObject)$ic47$);
        }
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic49$, var30);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : $ic50$);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var30);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40;
        var30 = (var40 = var31);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var32, (SubLObject)$ic52$, (SubLObject)$ic49$, var37, (SubLObject)$ic37$, var39), ConsesLow.append(var40, (SubLObject)NIL));
    }
    
    public static SubLObject f12045() {
        return $g2255$.getGlobalValue();
    }
    
    public static SubLObject f12046() {
        if (NIL == $g2255$.getGlobalValue()) {
            return (SubLObject)ZERO_INTEGER;
        }
        return module0065.f4733($g2255$.getGlobalValue());
    }
    
    public static SubLObject f12047() {
        if (f12046().numG((SubLObject)ZERO_INTEGER)) {
            SubLObject var59;
            SubLObject var60;
            for (var59 = f12048(), var60 = (SubLObject)NIL; NIL == var60; var60 = f12032(random.random(var59))) {}
            return var60;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12049() {
        return module0065.f4739($g2255$.getGlobalValue());
    }
    
    public static SubLObject f12050(final SubLObject var61, final SubLObject var62) {
        if (NIL != $g2255$.getGlobalValue()) {
            return (SubLObject)NIL;
        }
        $g2255$.setGlobalValue(module0065.f4745(var61, (SubLObject)ZERO_INTEGER));
        return (SubLObject)T;
    }
    
    public static SubLObject f12051(SubLObject var63) {
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)NIL;
        }
        final SubLThread var64 = SubLProcess.currentSubLThread();
        f12052(var63);
        if (NIL == var63) {
            final SubLObject var65 = Storage.$current_area$.currentBinding(var64);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), var64);
                module0065.f4760($g2255$.getGlobalValue(), (SubLObject)UNPROVIDED);
            }
            finally {
                Storage.$current_area$.rebind(var65, var64);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12053(SubLObject var64) {
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)NIL;
        }
        final SubLThread var65 = SubLProcess.currentSubLThread();
        final SubLObject var66 = f12045();
        final SubLObject var67 = (SubLObject)$ic55$;
        final SubLObject var68 = module0065.f4733(var66);
        SubLObject var69 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var67) : var67;
        final SubLObject var70 = module0012.$g75$.currentBinding(var65);
        final SubLObject var71 = module0012.$g76$.currentBinding(var65);
        final SubLObject var72 = module0012.$g77$.currentBinding(var65);
        final SubLObject var73 = module0012.$g78$.currentBinding(var65);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var65);
            module0012.$g76$.bind((SubLObject)NIL, var65);
            module0012.$g77$.bind((SubLObject)T, var65);
            module0012.$g78$.bind(Time.get_universal_time(), var65);
            module0012.f478(var67);
            final SubLObject var72_73 = var66;
            if (NIL == module0065.f4772(var72_73, (SubLObject)$ic57$)) {
                final SubLObject var74_75 = var72_73;
                if (NIL == module0065.f4775(var74_75, (SubLObject)$ic57$)) {
                    final SubLObject var74 = module0065.f4740(var74_75);
                    final SubLObject var75 = (SubLObject)NIL;
                    SubLObject var76;
                    SubLObject var77;
                    SubLObject var78;
                    SubLObject var79;
                    SubLObject var17_81;
                    SubLObject var80;
                    SubLObject var18_83;
                    SubLObject var81;
                    SubLObject var82;
                    SubLObject var18_84;
                    for (var76 = Sequences.length(var74), var77 = (SubLObject)NIL, var77 = (SubLObject)ZERO_INTEGER; var77.numL(var76); var77 = Numbers.add(var77, (SubLObject)ONE_INTEGER)) {
                        var78 = ((NIL != var75) ? Numbers.subtract(var76, var77, (SubLObject)ONE_INTEGER) : var77);
                        var79 = Vectors.aref(var74, var78);
                        if (NIL == module0065.f4749(var79) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                            if (NIL != module0065.f4749(var79)) {
                                var79 = (SubLObject)$ic57$;
                            }
                            module0012.note_percent_progress(var69, var68);
                            var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER);
                            if (NIL == f12016(var79, (SubLObject)T)) {
                                var17_81 = f12025(var79);
                                var80 = (SubLObject)NIL;
                                try {
                                    var65.throwStack.push($ic58$);
                                    var18_83 = Errors.$error_handler$.currentBinding(var65);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic59$), var65);
                                        try {
                                            try {
                                                if (NIL != var64) {
                                                    Errors.warn((SubLObject)$ic60$, var17_81);
                                                }
                                                var81 = f12029(var79);
                                                var82 = (SubLObject)NIL;
                                                var82 = var81.first();
                                                while (NIL != var81) {
                                                    module0342.f23126(var82);
                                                    var81 = var81.rest();
                                                    var82 = var81.first();
                                                }
                                            }
                                            finally {
                                                var18_84 = Threads.$is_thread_performing_cleanupP$.currentBinding(var65);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var65);
                                                    if (var17_81.isInteger()) {
                                                        f12041(var17_81);
                                                        f12026(var79, (SubLObject)NIL);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_84, var65);
                                                }
                                            }
                                        }
                                        catch (Throwable var83) {
                                            Errors.handleThrowable(var83, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(var18_83, var65);
                                    }
                                }
                                catch (Throwable var84) {
                                    var80 = Errors.handleThrowable(var84, (SubLObject)$ic58$);
                                }
                                finally {
                                    var65.throwStack.pop();
                                }
                            }
                        }
                    }
                }
                final SubLObject var88_89 = var72_73;
                if (NIL == module0065.f4777(var88_89) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                    final SubLObject var85 = module0065.f4738(var88_89);
                    SubLObject var86 = module0065.f4739(var88_89);
                    final SubLObject var87 = module0065.f4734(var88_89);
                    final SubLObject var88 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic57$)) ? NIL : $ic57$);
                    while (var86.numL(var87)) {
                        final SubLObject var89 = Hashtables.gethash_without_values(var86, var85, var88);
                        if (NIL == module0065.f4773((SubLObject)$ic57$) || NIL == module0065.f4749(var89)) {
                            module0012.note_percent_progress(var69, var68);
                            var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER);
                            if (NIL == f12016(var89, (SubLObject)T)) {
                                final SubLObject var17_82 = f12025(var89);
                                SubLObject var90 = (SubLObject)NIL;
                                try {
                                    var65.throwStack.push($ic58$);
                                    final SubLObject var18_85 = Errors.$error_handler$.currentBinding(var65);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic59$), var65);
                                        try {
                                            try {
                                                if (NIL != var64) {
                                                    Errors.warn((SubLObject)$ic60$, var17_82);
                                                }
                                                SubLObject var91 = f12029(var89);
                                                SubLObject var92 = (SubLObject)NIL;
                                                var92 = var91.first();
                                                while (NIL != var91) {
                                                    module0342.f23126(var92);
                                                    var91 = var91.rest();
                                                    var92 = var91.first();
                                                }
                                            }
                                            finally {
                                                final SubLObject var18_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var65);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var65);
                                                    if (var17_82.isInteger()) {
                                                        f12041(var17_82);
                                                        f12026(var89, (SubLObject)NIL);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_86, var65);
                                                }
                                            }
                                        }
                                        catch (Throwable var93) {
                                            Errors.handleThrowable(var93, (SubLObject)NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(var18_85, var65);
                                    }
                                }
                                catch (Throwable var94) {
                                    var90 = Errors.handleThrowable(var94, (SubLObject)$ic58$);
                                }
                                finally {
                                    var65.throwStack.pop();
                                }
                            }
                        }
                        var86 = Numbers.add(var86, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var73, var65);
            module0012.$g77$.rebind(var72, var65);
            module0012.$g76$.rebind(var71, var65);
            module0012.$g75$.rebind(var70, var65);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12054() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = f12045();
        final SubLObject var17 = (SubLObject)$ic61$;
        final SubLObject var18 = module0065.f4733(var16);
        SubLObject var19 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var17) : var17;
        final SubLObject var20 = module0012.$g75$.currentBinding(var15);
        final SubLObject var21 = module0012.$g76$.currentBinding(var15);
        final SubLObject var22 = module0012.$g77$.currentBinding(var15);
        final SubLObject var23 = module0012.$g78$.currentBinding(var15);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var15);
            module0012.$g76$.bind((SubLObject)NIL, var15);
            module0012.$g77$.bind((SubLObject)T, var15);
            module0012.$g78$.bind(Time.get_universal_time(), var15);
            module0012.f478(var17);
            final SubLObject var72_97 = var16;
            if (NIL == module0065.f4772(var72_97, (SubLObject)$ic57$)) {
                final SubLObject var74_98 = var72_97;
                if (NIL == module0065.f4775(var74_98, (SubLObject)$ic57$)) {
                    final SubLObject var24 = module0065.f4740(var74_98);
                    final SubLObject var25 = (SubLObject)NIL;
                    SubLObject var26;
                    SubLObject var27;
                    SubLObject var28;
                    SubLObject var29;
                    for (var26 = Sequences.length(var24), var27 = (SubLObject)NIL, var27 = (SubLObject)ZERO_INTEGER; var27.numL(var26); var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER)) {
                        var28 = ((NIL != var25) ? Numbers.subtract(var26, var27, (SubLObject)ONE_INTEGER) : var27);
                        var29 = Vectors.aref(var24, var28);
                        if (NIL == module0065.f4749(var29) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                            if (NIL != module0065.f4749(var29)) {
                                var29 = (SubLObject)$ic57$;
                            }
                            module0012.note_percent_progress(var19, var18);
                            var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                            f12023(var29);
                        }
                    }
                }
                final SubLObject var88_99 = var72_97;
                if (NIL == module0065.f4777(var88_99) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                    final SubLObject var30 = module0065.f4738(var88_99);
                    SubLObject var31 = module0065.f4739(var88_99);
                    final SubLObject var32 = module0065.f4734(var88_99);
                    final SubLObject var33 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic57$)) ? NIL : $ic57$);
                    while (var31.numL(var32)) {
                        final SubLObject var34 = Hashtables.gethash_without_values(var31, var30, var33);
                        if (NIL == module0065.f4773((SubLObject)$ic57$) || NIL == module0065.f4749(var34)) {
                            module0012.note_percent_progress(var19, var18);
                            var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                            f12023(var34);
                        }
                        var31 = Numbers.add(var31, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var23, var15);
            module0012.$g77$.rebind(var22, var15);
            module0012.$g76$.rebind(var21, var15);
            module0012.$g75$.rebind(var20, var15);
        }
        f12055();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12055() {
        return module0065.f4762($g2255$.getGlobalValue());
    }
    
    public static SubLObject f12048() {
        return module0065.f4734($g2255$.getGlobalValue());
    }
    
    public static SubLObject f12052(SubLObject var63) {
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)NIL;
        }
        final SubLThread var64 = SubLProcess.currentSubLThread();
        SubLObject var65 = (SubLObject)MINUS_ONE_INTEGER;
        if (NIL != var63) {
            var65 = var63;
        }
        else {
            final SubLObject var66 = f12045();
            final SubLObject var67 = (SubLObject)$ic62$;
            final SubLObject var68 = module0065.f4733(var66);
            SubLObject var69 = (SubLObject)ZERO_INTEGER;
            assert NIL != Types.stringp(var67) : var67;
            final SubLObject var70 = module0012.$g75$.currentBinding(var64);
            final SubLObject var71 = module0012.$g76$.currentBinding(var64);
            final SubLObject var72 = module0012.$g77$.currentBinding(var64);
            final SubLObject var73 = module0012.$g78$.currentBinding(var64);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var64);
                module0012.$g76$.bind((SubLObject)NIL, var64);
                module0012.$g77$.bind((SubLObject)T, var64);
                module0012.$g78$.bind(Time.get_universal_time(), var64);
                module0012.f478(var67);
                final SubLObject var72_101 = var66;
                if (NIL == module0065.f4772(var72_101, (SubLObject)$ic57$)) {
                    final SubLObject var74_102 = var72_101;
                    if (NIL == module0065.f4775(var74_102, (SubLObject)$ic57$)) {
                        final SubLObject var74 = module0065.f4740(var74_102);
                        final SubLObject var75 = (SubLObject)NIL;
                        SubLObject var76;
                        SubLObject var77;
                        SubLObject var78;
                        SubLObject var79;
                        for (var76 = Sequences.length(var74), var77 = (SubLObject)NIL, var77 = (SubLObject)ZERO_INTEGER; var77.numL(var76); var77 = Numbers.add(var77, (SubLObject)ONE_INTEGER)) {
                            var78 = ((NIL != var75) ? Numbers.subtract(var76, var77, (SubLObject)ONE_INTEGER) : var77);
                            var79 = Vectors.aref(var74, var78);
                            if (NIL == module0065.f4749(var79) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                                if (NIL != module0065.f4749(var79)) {
                                    var79 = (SubLObject)$ic57$;
                                }
                                module0012.note_percent_progress(var69, var68);
                                var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER);
                                var65 = Numbers.max(var65, f12025(var79));
                            }
                        }
                    }
                    final SubLObject var88_103 = var72_101;
                    if (NIL == module0065.f4777(var88_103) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                        final SubLObject var80 = module0065.f4738(var88_103);
                        SubLObject var81 = module0065.f4739(var88_103);
                        final SubLObject var82 = module0065.f4734(var88_103);
                        final SubLObject var83 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic57$)) ? NIL : $ic57$);
                        while (var81.numL(var82)) {
                            final SubLObject var84 = Hashtables.gethash_without_values(var81, var80, var83);
                            if (NIL == module0065.f4773((SubLObject)$ic57$) || NIL == module0065.f4749(var84)) {
                                module0012.note_percent_progress(var69, var68);
                                var69 = Numbers.add(var69, (SubLObject)ONE_INTEGER);
                                var65 = Numbers.max(var65, f12025(var84));
                            }
                            var81 = Numbers.add(var81, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var73, var64);
                module0012.$g77$.rebind(var72, var64);
                module0012.$g76$.rebind(var71, var64);
                module0012.$g75$.rebind(var70, var64);
            }
        }
        final SubLObject var85 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
        module0065.f4741($g2255$.getGlobalValue(), var85);
        return var85;
    }
    
    public static SubLObject f12037(final SubLObject var19, final SubLObject var17) {
        f12026(var19, var17);
        module0065.f4753($g2255$.getGlobalValue(), var17, var19);
        return var19;
    }
    
    public static SubLObject f12041(final SubLObject var17) {
        return module0065.f4761($g2255$.getGlobalValue(), var17);
    }
    
    public static SubLObject f12033(final SubLObject var17) {
        return module0065.f4750($g2255$.getGlobalValue(), var17, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12036() {
        return module0065.f4746($g2255$.getGlobalValue());
    }
    
    public static SubLObject f12056(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = f12025(var19);
        final SubLObject var22 = $g2256$.getDynamicValue(var20);
        if (NIL != var22) {
            var21 = module0065.f4750(var22, var21, (SubLObject)UNPROVIDED);
        }
        return var21;
    }
    
    public static SubLObject f12057(final SubLObject var106) {
        return f12032(var106);
    }
    
    public static SubLObject f12058(final SubLObject var27, final SubLObject var28) {
        final SubLObject var29 = var27.rest();
        final SubLObject var31;
        final SubLObject var30 = var31 = var29;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic63$, (SubLObject)$ic64$, ConsesLow.append(var31, (SubLObject)NIL));
    }
    
    public static SubLObject f12059() {
        return module0065.f4794($g2255$.getGlobalValue());
    }
    
    public static SubLObject f12060() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)ZERO_INTEGER;
        final SubLObject var17 = f12045();
        final SubLObject var18 = (SubLObject)$ic50$;
        final SubLObject var19 = module0065.f4733(var17);
        SubLObject var20 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var18) : var18;
        final SubLObject var21 = module0012.$g75$.currentBinding(var15);
        final SubLObject var22 = module0012.$g76$.currentBinding(var15);
        final SubLObject var23 = module0012.$g77$.currentBinding(var15);
        final SubLObject var24 = module0012.$g78$.currentBinding(var15);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var15);
            module0012.$g76$.bind((SubLObject)NIL, var15);
            module0012.$g77$.bind((SubLObject)T, var15);
            module0012.$g78$.bind(Time.get_universal_time(), var15);
            module0012.f478(var18);
            final SubLObject var72_110 = var17;
            if (NIL == module0065.f4772(var72_110, (SubLObject)$ic57$)) {
                final SubLObject var74_111 = var72_110;
                if (NIL == module0065.f4775(var74_111, (SubLObject)$ic57$)) {
                    final SubLObject var25 = module0065.f4740(var74_111);
                    final SubLObject var26 = (SubLObject)NIL;
                    SubLObject var27;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    for (var27 = Sequences.length(var25), var28 = (SubLObject)NIL, var28 = (SubLObject)ZERO_INTEGER; var28.numL(var27); var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER)) {
                        var29 = ((NIL != var26) ? Numbers.subtract(var27, var28, (SubLObject)ONE_INTEGER) : var28);
                        var30 = Vectors.aref(var25, var29);
                        if (NIL == module0065.f4749(var30) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                            if (NIL != module0065.f4749(var30)) {
                                var30 = (SubLObject)$ic57$;
                            }
                            module0012.note_percent_progress(var20, var19);
                            var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                            var16 = Numbers.add(var16, Sequences.length(f12029(var30)));
                        }
                    }
                }
                final SubLObject var88_112 = var72_110;
                if (NIL == module0065.f4777(var88_112) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                    final SubLObject var31 = module0065.f4738(var88_112);
                    SubLObject var32 = module0065.f4739(var88_112);
                    final SubLObject var33 = module0065.f4734(var88_112);
                    final SubLObject var34 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic57$)) ? NIL : $ic57$);
                    while (var32.numL(var33)) {
                        final SubLObject var35 = Hashtables.gethash_without_values(var32, var31, var34);
                        if (NIL == module0065.f4773((SubLObject)$ic57$) || NIL == module0065.f4749(var35)) {
                            module0012.note_percent_progress(var20, var19);
                            var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                            var16 = Numbers.add(var16, Sequences.length(f12029(var35)));
                        }
                        var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var24, var15);
            module0012.$g77$.rebind(var23, var15);
            module0012.$g76$.rebind(var22, var15);
            module0012.$g75$.rebind(var21, var15);
        }
        return var16;
    }
    
    public static SubLObject f12061() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var17 = f12045();
        final SubLObject var18 = (SubLObject)$ic50$;
        final SubLObject var19 = module0065.f4733(var17);
        SubLObject var20 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var18) : var18;
        final SubLObject var21 = module0012.$g75$.currentBinding(var15);
        final SubLObject var22 = module0012.$g76$.currentBinding(var15);
        final SubLObject var23 = module0012.$g77$.currentBinding(var15);
        final SubLObject var24 = module0012.$g78$.currentBinding(var15);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var15);
            module0012.$g76$.bind((SubLObject)NIL, var15);
            module0012.$g77$.bind((SubLObject)T, var15);
            module0012.$g78$.bind(Time.get_universal_time(), var15);
            module0012.f478(var18);
            final SubLObject var72_114 = var17;
            if (NIL == module0065.f4772(var72_114, (SubLObject)$ic57$)) {
                final SubLObject var74_115 = var72_114;
                if (NIL == module0065.f4775(var74_115, (SubLObject)$ic57$)) {
                    final SubLObject var25 = module0065.f4740(var74_115);
                    final SubLObject var26 = (SubLObject)NIL;
                    SubLObject var27;
                    SubLObject var28;
                    SubLObject var29;
                    SubLObject var30;
                    SubLObject var31;
                    SubLObject var32;
                    for (var27 = Sequences.length(var25), var28 = (SubLObject)NIL, var28 = (SubLObject)ZERO_INTEGER; var28.numL(var27); var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER)) {
                        var29 = ((NIL != var26) ? Numbers.subtract(var27, var28, (SubLObject)ONE_INTEGER) : var28);
                        var30 = Vectors.aref(var25, var29);
                        if (NIL == module0065.f4749(var30) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                            if (NIL != module0065.f4749(var30)) {
                                var30 = (SubLObject)$ic57$;
                            }
                            module0012.note_percent_progress(var20, var19);
                            var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                            var31 = f12029(var30);
                            var32 = (SubLObject)NIL;
                            var32 = var31.first();
                            while (NIL != var31) {
                                module0084.f5775(var16, module0178.f11287(var32), (SubLObject)UNPROVIDED);
                                var31 = var31.rest();
                                var32 = var31.first();
                            }
                        }
                    }
                }
                final SubLObject var88_116 = var72_114;
                if (NIL == module0065.f4777(var88_116) || NIL == module0065.f4773((SubLObject)$ic57$)) {
                    final SubLObject var33 = module0065.f4738(var88_116);
                    SubLObject var34 = module0065.f4739(var88_116);
                    final SubLObject var35 = module0065.f4734(var88_116);
                    final SubLObject var36 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic57$)) ? NIL : $ic57$);
                    while (var34.numL(var35)) {
                        final SubLObject var37 = Hashtables.gethash_without_values(var34, var33, var36);
                        if (NIL == module0065.f4773((SubLObject)$ic57$) || NIL == module0065.f4749(var37)) {
                            module0012.note_percent_progress(var20, var19);
                            var20 = Numbers.add(var20, (SubLObject)ONE_INTEGER);
                            SubLObject var38 = f12029(var37);
                            SubLObject var39 = (SubLObject)NIL;
                            var39 = var38.first();
                            while (NIL != var38) {
                                module0084.f5775(var16, module0178.f11287(var39), (SubLObject)UNPROVIDED);
                                var38 = var38.rest();
                                var39 = var38.first();
                            }
                        }
                        var34 = Numbers.add(var34, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var24, var15);
            module0012.$g77$.rebind(var23, var15);
            module0012.$g76$.rebind(var22, var15);
            module0012.$g75$.rebind(var21, var15);
        }
        return var16;
    }
    
    public static SubLObject f12062() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12004", "S#14784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12006", "S#13957", 1, 0, false);
        new $f12006$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12007", "S#14785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12008", "S#14786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12009", "S#14787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12010", "S#14788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12011", "S#14789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12012", "S#14790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12013", "S#14791", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12014", "S#14792", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12015", "S#14793", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12005", "S#14794", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12019", "S#14795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12020", "S#14796", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12021", "S#14797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12022", "S#14798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12023", "S#14799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12024", "S#14800", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12025", "S#14801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12026", "S#14802", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12017", "S#13958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12027", "S#14803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12018", "S#14804", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0192", "f12028", "S#14805");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12029", "S#14806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12030", "S#14807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12016", "S#14808", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12031", "S#14809", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12032", "S#14810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12034", "S#13968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12035", "S#14811", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12038", "S#14812", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12039", "S#13967", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12040", "S#14813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12042", "S#13969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12043", "S#14814", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0192", "f12044", "S#14815");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12045", "S#14816", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12046", "S#14817", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12047", "S#14818", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12049", "S#14819", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12050", "S#14820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12051", "S#14821", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12053", "S#14822", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12054", "S#14823", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12055", "S#14824", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12048", "S#14825", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12052", "S#14826", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12037", "S#14827", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12041", "S#14828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12033", "S#14829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12036", "S#14830", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12056", "S#14831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12057", "S#14832", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0192", "f12058", "S#14833");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12059", "S#14834", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12060", "S#14835", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0192", "f12061", "S#14836", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12063() {
        $g2252$ = SubLFiles.defconstant("S#14837", (SubLObject)$ic0$);
        $g2253$ = SubLFiles.deflexical("S#14838", (SubLObject)NIL);
        $g2254$ = SubLFiles.deflexical("S#14839", Locks.make_lock((SubLObject)$ic31$));
        $g2255$ = SubLFiles.deflexical("S#14840", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic46$)) ? $g2255$.getGlobalValue() : NIL));
        $g2256$ = SubLFiles.defparameter("S#14841", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12064() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2252$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2252$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic24$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g2252$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic30$));
        module0003.f57((SubLObject)$ic46$);
        module0002.f50((SubLObject)$ic53$, (SubLObject)$ic54$);
        module0002.f50((SubLObject)$ic65$, (SubLObject)$ic66$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f12062();
    }
    
    public void initializeVariables() {
        f12063();
    }
    
    public void runTopLevelForms() {
        f12064();
    }
    
    static {
        me = (SubLFile)new module0192();
        $g2252$ = null;
        $g2253$ = null;
        $g2254$ = null;
        $g2255$ = null;
        $g2256$ = null;
        $ic0$ = makeSymbol("S#14782", "CYC");
        $ic1$ = makeSymbol("S#13957", "CYC");
        $ic2$ = makeInteger(142);
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#13916", "CYC"), (SubLObject)makeSymbol("S#13093", "CYC"));
        $ic4$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("CNF"), (SubLObject)makeKeyword("ASSERTIONS"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#14785", "CYC"), (SubLObject)makeSymbol("S#14786", "CYC"), (SubLObject)makeSymbol("S#14787", "CYC"));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#14788", "CYC"), (SubLObject)makeSymbol("S#14789", "CYC"), (SubLObject)makeSymbol("S#14790", "CYC"));
        $ic7$ = makeSymbol("S#14794", "CYC");
        $ic8$ = makeSymbol("S#14784", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#13957", "CYC"));
        $ic10$ = makeSymbol("S#14785", "CYC");
        $ic11$ = makeSymbol("S#14788", "CYC");
        $ic12$ = makeSymbol("S#14786", "CYC");
        $ic13$ = makeSymbol("S#14789", "CYC");
        $ic14$ = makeSymbol("S#14787", "CYC");
        $ic15$ = makeSymbol("S#14790", "CYC");
        $ic16$ = makeKeyword("ID");
        $ic17$ = makeKeyword("CNF");
        $ic18$ = makeKeyword("ASSERTIONS");
        $ic19$ = makeString("Invalid slot ~S for construction function");
        $ic20$ = makeKeyword("BEGIN");
        $ic21$ = makeSymbol("S#14791", "CYC");
        $ic22$ = makeKeyword("SLOT");
        $ic23$ = makeKeyword("END");
        $ic24$ = makeSymbol("S#14793", "CYC");
        $ic25$ = makeString("<");
        $ic26$ = makeString("?");
        $ic27$ = makeString(">");
        $ic28$ = makeString("<The CFASL invalid clause struc>");
        $ic29$ = makeInteger(242);
        $ic30$ = makeSymbol("S#14795", "CYC");
        $ic31$ = makeString("CLAUSE-STRUC resource lock");
        $ic32$ = makeKeyword("FREE");
        $ic33$ = makeKeyword("TRUE");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12704", "CYC"), (SubLObject)makeSymbol("S#14782", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic36$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic37$ = makeKeyword("DONE");
        $ic38$ = makeSymbol("DO-LIST");
        $ic39$ = makeSymbol("S#14806", "CYC");
        $ic40$ = makeSymbol("S#2609", "CYC");
        $ic41$ = makeSymbol("S#14110", "CYC");
        $ic42$ = makeSymbol("INTEGERP");
        $ic43$ = makeSymbol("CNF-P");
        $ic44$ = makeString("create-sample-invalid-clause-struc not implemented");
        $ic45$ = makeSymbol("ASSERTION-P");
        $ic46$ = makeSymbol("S#14840", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#130", "CYC"), (SubLObject)makeString("mapping Cyc clause structs")), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic48$ = ConsesLow.list((SubLObject)makeKeyword("PROGRESS-MESSAGE"), (SubLObject)makeKeyword("DONE"));
        $ic49$ = makeKeyword("PROGRESS-MESSAGE");
        $ic50$ = makeString("mapping Cyc clause structs");
        $ic51$ = makeSymbol("DO-KB-SUID-TABLE");
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#14816", "CYC"));
        $ic53$ = makeSymbol("S#14816", "CYC");
        $ic54$ = makeSymbol("S#14815", "CYC");
        $ic55$ = makeString("Cleaning clause-struc table");
        $ic56$ = makeSymbol("STRINGP");
        $ic57$ = makeKeyword("SKIP");
        $ic58$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic59$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic60$ = makeString("invalid clause-struct ~S");
        $ic61$ = makeString("Freeing clause-strucs");
        $ic62$ = makeString("Determining maximum clause-struc ID");
        $ic63$ = makeSymbol("CLET");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14841", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14834", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9685", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#14831", "CYC"))));
        $ic65$ = makeSymbol("S#14834", "CYC");
        $ic66$ = makeSymbol("S#14833", "CYC");
    }
    
    public static final class $sX14782_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $cnf;
        public SubLObject $assertions;
        private static final SubLStructDeclNative structDecl;
        
        public $sX14782_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$cnf = (SubLObject)CommonSymbols.NIL;
            this.$assertions = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX14782_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$cnf;
        }
        
        public SubLObject getField4() {
            return this.$assertions;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$cnf = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$assertions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX14782_native.class, $ic0$, $ic1$, $ic3$, $ic4$, new String[] { "$id", "$cnf", "$assertions" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f12006$UnaryFunction extends UnaryFunction
    {
        public $f12006$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#13957"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f12006(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 443 ms
	
	Decompiled with Procyon 0.5.32.
*/