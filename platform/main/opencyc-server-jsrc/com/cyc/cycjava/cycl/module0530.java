package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0530 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0530";
    public static final String myFingerPrint = "f5287db990953ae66c4a321ead57c789b2d75577e45a6deb82d69c1450eb4744";
    private static SubLSymbol $g3899$;
    private static SubLSymbol $g3900$;
    private static SubLSymbol $g3901$;
    private static SubLSymbol $g3902$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLList $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLList $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLList $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLObject $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLList $ic108$;
    
    public static SubLObject f33014() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return conses_high.copy_list($g3899$.getDynamicValue(var1));
    }
    
    public static SubLObject f33015() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return Sequences.length($g3899$.getDynamicValue(var1));
    }
    
    public static SubLObject f33016(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0340.f22789(var2) && NIL != conses_high.member(var2, $g3899$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f33017(final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var7;
        final SubLObject var6 = var7 = module0340.f22843(var3, (SubLObject)$ic0$, var4);
        if (NIL == conses_high.member(var7, $g3899$.getDynamicValue(var5), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g3899$.setDynamicValue((SubLObject)ConsesLow.cons(var7, $g3899$.getDynamicValue(var5)), var5);
        }
        return var6;
    }
    
    public static SubLObject f33018(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        final SubLObject var5 = module0340.f22786(var3);
        if (NIL != var5) {
            module0340.f22836(var5);
            $g3899$.setDynamicValue(Sequences.delete(var5, $g3899$.getDynamicValue(var4), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var4);
            return var5;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33019(final SubLObject var7, final SubLObject var8) {
        SubLObject var10;
        final SubLObject var9 = var10 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic1$);
        final SubLObject var11 = var10.rest();
        var10 = var10.first();
        SubLObject var12 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var10, var9, (SubLObject)$ic1$);
        var12 = var10.first();
        var10 = var10.rest();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var10;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var15_16 = (SubLObject)NIL;
        while (NIL != var14) {
            cdestructuring_bind.destructuring_bind_must_consp(var14, var9, (SubLObject)$ic1$);
            var15_16 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var9, (SubLObject)$ic1$);
            if (NIL == conses_high.member(var15_16, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var15 = (SubLObject)T;
            }
            if (var15_16 == $ic3$) {
                var13 = var14.first();
            }
            var14 = var14.rest();
        }
        if (NIL != var15 && NIL == var13) {
            cdestructuring_bind.cdestructuring_bind_error(var9, (SubLObject)$ic1$);
        }
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var10);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18;
        var10 = (var18 = var11);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list(var12, (SubLObject)$ic6$, (SubLObject)$ic4$, var17), ConsesLow.append(var18, (SubLObject)NIL));
    }
    
    public static SubLObject f33020() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g3899$.getDynamicValue(var1);
    }
    
    public static SubLObject f33021(final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24, SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        $g3900$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var20, var21, var22, var23, var24, var25), $g3900$.getDynamicValue(var26)), var26);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33022(final SubLObject var26, final SubLObject var27, final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        SubLObject var30 = (SubLObject)NIL;
        if (NIL != module0035.sublisp_boolean(module0528.f32946())) {
            final SubLObject var31 = $g3900$.currentBinding(var29);
            try {
                $g3900$.bind((SubLObject)NIL, var29);
                final SubLObject var32 = module0147.f9540(var28);
                final SubLObject var30_32 = module0147.$g2095$.currentBinding(var29);
                final SubLObject var33 = module0147.$g2094$.currentBinding(var29);
                final SubLObject var34 = module0147.$g2096$.currentBinding(var29);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var32), var29);
                    module0147.$g2094$.bind(module0147.f9546(var32), var29);
                    module0147.$g2096$.bind(module0147.f9549(var32), var29);
                    SubLObject var35 = f33023(var26, var27);
                    SubLObject var36 = (SubLObject)NIL;
                    var36 = var35.first();
                    while (NIL != var35) {
                        f33024(var36, var26);
                        var35 = var35.rest();
                        var36 = var35.first();
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var34, var29);
                    module0147.$g2094$.rebind(var33, var29);
                    module0147.$g2095$.rebind(var30_32, var29);
                }
                var30 = Sequences.nreverse($g3900$.getDynamicValue(var29));
            }
            finally {
                $g3900$.rebind(var31, var29);
            }
        }
        return module0035.f2269(var30, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33023(final SubLObject var37, final SubLObject var38) {
        final SubLObject var39 = module0205.f13333(var37);
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42;
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var47;
        SubLObject var46;
        SubLObject var49;
        SubLObject var48;
        SubLObject var50;
        SubLObject var51;
        SubLObject var52;
        for (var42 = (SubLObject)NIL, var43 = (SubLObject)NIL, var43 = f33020(); NIL == var42 && NIL != var43; var43 = var43.rest()) {
            var44 = var43.first();
            if (NIL != module0340.f22910(var44, (SubLObject)NIL) && (NIL == var41 || NIL == conses_high.member(var44, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && NIL != module0340.f22850(var44, var38) && NIL != module0340.f22878(var44, var39) && NIL != module0340.f22852(var44, var37)) {
                var45 = module0340.f22882(var44);
                if (NIL == var45 || NIL != Functions.funcall(var45, var37)) {
                    if (NIL != var45) {
                        var46 = (var47 = module0340.f22883(var44));
                        if (var47.eql((SubLObject)$ic9$)) {
                            var40 = (SubLObject)NIL;
                            var42 = (SubLObject)T;
                        }
                        else {
                            var48 = (var49 = var46);
                            var50 = (SubLObject)NIL;
                            var50 = var49.first();
                            while (NIL != var49) {
                                var51 = module0340.f22786(var50);
                                if (NIL != var51) {
                                    var41 = (SubLObject)ConsesLow.cons(var51, var41);
                                    var40 = module0035.f2073(var51, var40, Symbols.symbol_function((SubLObject)EQL));
                                }
                                var49 = var49.rest();
                                var50 = var49.first();
                            }
                        }
                    }
                    var52 = module0340.f22857(var44);
                    if (NIL == var52 || NIL != Functions.funcall(var52, var37)) {
                        var40 = (SubLObject)ConsesLow.cons(var44, var40);
                    }
                }
            }
        }
        return Sequences.nreverse(var40);
    }
    
    public static SubLObject f33024(final SubLObject var36, final SubLObject var26) {
        final SubLObject var37 = f33025(var36, var26);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? f33026(var36, var26, var37) : NIL);
        return f33027(var36, var26, var38);
    }
    
    public static SubLObject f33025(final SubLObject var36, final SubLObject var26) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        if (NIL != module0528.f32947()) {
            final SubLObject var38 = module0340.f22871(var36);
            return (SubLObject)(var38.isFunctionSpec() ? Functions.funcall(var38, var26) : NIL);
        }
        return module0131.$g1537$.getDynamicValue(var37);
    }
    
    public static SubLObject f33026(final SubLObject var36, final SubLObject var26, final SubLObject var52) {
        final SubLObject var53 = module0340.f22872(var36);
        if (var53.isFunctionSpec() && NIL == module0528.f32947()) {
            SubLObject var54 = (SubLObject)NIL;
            SubLObject var55 = var52;
            SubLObject var56 = (SubLObject)NIL;
            var56 = var55.first();
            while (NIL != var55) {
                if (NIL != Functions.funcall(var53, var26, var56)) {
                    var54 = (SubLObject)ConsesLow.cons(var56, var54);
                }
                var55 = var55.rest();
                var56 = var55.first();
            }
            return Sequences.nreverse(var54);
        }
        return var52;
    }
    
    public static SubLObject f33027(final SubLObject var36, final SubLObject var26, final SubLObject var52) {
        final SubLObject var53 = module0340.f22873(var36);
        if (var53.isFunctionSpec()) {
            SubLObject var54 = var52;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                Functions.funcall(var53, var26, var55);
                var54 = var54.rest();
                var55 = var54.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33028(final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = module0351.f23567();
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            if (NIL != module0158.f10084(var57, (SubLObject)$ic10$, var60)) {
                final SubLObject var61 = module0158.f10085(var57, (SubLObject)$ic10$, var60);
                SubLObject var62 = (SubLObject)NIL;
                final SubLObject var63 = (SubLObject)NIL;
                while (NIL == var62) {
                    final SubLObject var64 = module0052.f3695(var61, var63);
                    final SubLObject var65 = (SubLObject)makeBoolean(!var63.eql(var64));
                    if (NIL != var65) {
                        SubLObject var66 = (SubLObject)NIL;
                        try {
                            var66 = module0158.f10316(var64, (SubLObject)$ic11$, (SubLObject)NIL, var60);
                            SubLObject var60_65 = (SubLObject)NIL;
                            final SubLObject var61_66 = (SubLObject)NIL;
                            while (NIL == var60_65) {
                                final SubLObject var67 = module0052.f3695(var66, var61_66);
                                final SubLObject var63_67 = (SubLObject)makeBoolean(!var61_66.eql(var67));
                                if (NIL != var63_67) {
                                    var58 = (SubLObject)ConsesLow.cons(var67, var58);
                                }
                                var60_65 = (SubLObject)makeBoolean(NIL == var63_67);
                            }
                        }
                        finally {
                            final SubLObject var68 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var66) {
                                    module0158.f10319(var66);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var68);
                            }
                        }
                    }
                    var62 = (SubLObject)makeBoolean(NIL == var65);
                }
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        var58 = module0035.f2269(var58, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var58;
    }
    
    public static SubLObject f33029(final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = module0351.f23567();
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            if (NIL != module0158.f10084(var57, (SubLObject)$ic12$, var60)) {
                final SubLObject var61 = module0158.f10085(var57, (SubLObject)$ic12$, var60);
                SubLObject var62 = (SubLObject)NIL;
                final SubLObject var63 = (SubLObject)NIL;
                while (NIL == var62) {
                    final SubLObject var64 = module0052.f3695(var61, var63);
                    final SubLObject var65 = (SubLObject)makeBoolean(!var63.eql(var64));
                    if (NIL != var65) {
                        SubLObject var66 = (SubLObject)NIL;
                        try {
                            var66 = module0158.f10316(var64, (SubLObject)$ic11$, (SubLObject)NIL, var60);
                            SubLObject var60_68 = (SubLObject)NIL;
                            final SubLObject var61_69 = (SubLObject)NIL;
                            while (NIL == var60_68) {
                                final SubLObject var67 = module0052.f3695(var66, var61_69);
                                final SubLObject var63_70 = (SubLObject)makeBoolean(!var61_69.eql(var67));
                                if (NIL != var63_70) {
                                    var58 = (SubLObject)ConsesLow.cons(var67, var58);
                                }
                                var60_68 = (SubLObject)makeBoolean(NIL == var63_70);
                            }
                        }
                        finally {
                            final SubLObject var68 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var66) {
                                    module0158.f10319(var66);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var68);
                            }
                        }
                    }
                    var62 = (SubLObject)makeBoolean(NIL == var65);
                }
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        var58 = module0035.f2269(var58, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var58;
    }
    
    public static SubLObject f33030(final SubLObject var57) {
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = module0351.f23567();
        SubLObject var60 = (SubLObject)NIL;
        var60 = var59.first();
        while (NIL != var59) {
            if (NIL != module0158.f10112(var57, (SubLObject)NIL, var60)) {
                final SubLObject var61 = module0158.f10113(var57, (SubLObject)NIL, var60);
                SubLObject var62 = (SubLObject)NIL;
                final SubLObject var63 = (SubLObject)NIL;
                while (NIL == var62) {
                    final SubLObject var64 = module0052.f3695(var61, var63);
                    final SubLObject var65 = (SubLObject)makeBoolean(!var63.eql(var64));
                    if (NIL != var65) {
                        SubLObject var66 = (SubLObject)NIL;
                        try {
                            var66 = module0158.f10316(var64, (SubLObject)$ic11$, (SubLObject)NIL, var60);
                            SubLObject var60_72 = (SubLObject)NIL;
                            final SubLObject var61_73 = (SubLObject)NIL;
                            while (NIL == var60_72) {
                                final SubLObject var67 = module0052.f3695(var66, var61_73);
                                final SubLObject var63_74 = (SubLObject)makeBoolean(!var61_73.eql(var67));
                                if (NIL != var63_74) {
                                    var58 = (SubLObject)ConsesLow.cons(var67, var58);
                                }
                                var60_72 = (SubLObject)makeBoolean(NIL == var63_74);
                            }
                        }
                        finally {
                            final SubLObject var68 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var66) {
                                    module0158.f10319(var66);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var68);
                            }
                        }
                    }
                    var62 = (SubLObject)makeBoolean(NIL == var65);
                }
            }
            var59 = var59.rest();
            var60 = var59.first();
        }
        var58 = module0035.f2269(var58, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var58;
    }
    
    public static SubLObject f33031(final SubLObject var37) {
        return f33028(module0205.f13333(var37));
    }
    
    public static SubLObject f33032(final SubLObject var37, final SubLObject var24) {
        return f33033(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33034(final SubLObject var37, final SubLObject var24) {
        SubLObject var38 = f33033(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        var39 = var38.first();
        while (NIL != var38) {
            f33021(var37, (SubLObject)$ic12$, var39, (SubLObject)$ic10$, var24, (SubLObject)UNPROVIDED);
            var38 = var38.rest();
            var39 = var38.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33033(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = var79;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15306(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var80 = (SubLObject)ConsesLow.cons(var84, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33035(final SubLObject var37) {
        return f33029(module0205.f13333(var37));
    }
    
    public static SubLObject f33036(final SubLObject var37, final SubLObject var24) {
        return f33037(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33038(final SubLObject var37, final SubLObject var24) {
        SubLObject var38 = f33037(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        var39 = var38.first();
        while (NIL != var38) {
            f33021(var37, (SubLObject)$ic10$, var39, (SubLObject)$ic12$, var24, (SubLObject)UNPROVIDED);
            var38 = var38.rest();
            var39 = var38.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33037(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = var79;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15308(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var80 = (SubLObject)ConsesLow.cons(var84, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33039(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = f33040(var38);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            SubLObject var35_86 = module0351.f23567();
            SubLObject var42 = (SubLObject)NIL;
            var42 = var35_86.first();
            while (NIL != var35_86) {
                if (NIL != module0158.f10135(var41, (SubLObject)$ic10$, var42)) {
                    final SubLObject var43 = module0158.f10137(var41, (SubLObject)$ic10$, var42);
                    SubLObject var44 = (SubLObject)NIL;
                    final SubLObject var45 = (SubLObject)NIL;
                    while (NIL == var44) {
                        final SubLObject var46 = module0052.f3695(var43, var45);
                        final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                        if (NIL != var47) {
                            SubLObject var48 = (SubLObject)NIL;
                            try {
                                var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                SubLObject var60_88 = (SubLObject)NIL;
                                final SubLObject var61_89 = (SubLObject)NIL;
                                while (NIL == var60_88) {
                                    final SubLObject var49 = module0052.f3695(var48, var61_89);
                                    final SubLObject var63_90 = (SubLObject)makeBoolean(!var61_89.eql(var49));
                                    if (NIL != var63_90) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                    var60_88 = (SubLObject)makeBoolean(NIL == var63_90);
                                }
                            }
                            finally {
                                final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var48) {
                                        module0158.f10319(var48);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                }
                            }
                        }
                        var44 = (SubLObject)makeBoolean(NIL == var47);
                    }
                }
                var35_86 = var35_86.rest();
                var42 = var35_86.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33041(final SubLObject var37, final SubLObject var24) {
        return f33042(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33043(final SubLObject var37, final SubLObject var24) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var41 = module0528.$g3889$.currentBinding(var38);
        try {
            module0528.$g3889$.bind((SubLObject)T, var38);
            SubLObject var42 = f33042(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL != var42) {
                final SubLObject var44 = module0205.f13388(var43, (SubLObject)UNPROVIDED);
                final SubLObject var45 = (SubLObject)ConsesLow.list($ic19$, var39, var44);
                final SubLObject var46 = (SubLObject)(var44.eql(var40) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic20$, (SubLObject)ConsesLow.list($ic21$, var40, var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                f33021(var45, (SubLObject)$ic12$, var43, (SubLObject)$ic10$, var24, var46);
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0528.$g3889$.rebind(var41, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33042(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15306(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if ($ic19$.eql(module0205.f13333(var83))) {
                var84 = module0205.f13388(var83, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var84) && NIL != f33044(var79, var84)) {
                    var80 = (SubLObject)ConsesLow.cons(var83, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33044(final SubLObject var93, final SubLObject var94) {
        return module0004.f104(var94, f33040(var93), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33045(final SubLObject var84) {
        return module0256.f16531(var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33040(final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        final SubLObject var86 = module0034.$g879$.getDynamicValue(var85);
        SubLObject var87 = (SubLObject)NIL;
        if (NIL == var86) {
            return f33045(var84);
        }
        var87 = module0034.f1857(var86, (SubLObject)$ic22$, (SubLObject)UNPROVIDED);
        if (NIL == var87) {
            var87 = module0034.f1807(module0034.f1842(var86), (SubLObject)$ic22$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var86, (SubLObject)$ic22$, var87);
        }
        SubLObject var88 = module0034.f1814(var87, var84, (SubLObject)$ic23$);
        if (var88 == $ic23$) {
            var88 = Values.arg2(var85.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33045(var84)));
            module0034.f1816(var87, var84, var88, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var88);
    }
    
    public static SubLObject f33046(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0256.f16552(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            SubLObject var35_99 = module0351.f23567();
            SubLObject var42 = (SubLObject)NIL;
            var42 = var35_99.first();
            while (NIL != var35_99) {
                if (NIL != module0158.f10135(var41, (SubLObject)$ic12$, var42)) {
                    final SubLObject var43 = module0158.f10137(var41, (SubLObject)$ic12$, var42);
                    SubLObject var44 = (SubLObject)NIL;
                    final SubLObject var45 = (SubLObject)NIL;
                    while (NIL == var44) {
                        final SubLObject var46 = module0052.f3695(var43, var45);
                        final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                        if (NIL != var47) {
                            SubLObject var48 = (SubLObject)NIL;
                            try {
                                var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                SubLObject var60_100 = (SubLObject)NIL;
                                final SubLObject var61_101 = (SubLObject)NIL;
                                while (NIL == var60_100) {
                                    final SubLObject var49 = module0052.f3695(var48, var61_101);
                                    final SubLObject var63_102 = (SubLObject)makeBoolean(!var61_101.eql(var49));
                                    if (NIL != var63_102) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                    var60_100 = (SubLObject)makeBoolean(NIL == var63_102);
                                }
                            }
                            finally {
                                final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var48) {
                                        module0158.f10319(var48);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                }
                            }
                        }
                        var44 = (SubLObject)makeBoolean(NIL == var47);
                    }
                }
                var35_99 = var35_99.rest();
                var42 = var35_99.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33047(final SubLObject var37, final SubLObject var24) {
        return f33048(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33049(final SubLObject var37, final SubLObject var24) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var41 = module0528.$g3889$.currentBinding(var38);
        try {
            module0528.$g3889$.bind((SubLObject)T, var38);
            SubLObject var42 = f33048(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL != var42) {
                final SubLObject var44 = module0205.f13388(var43, (SubLObject)UNPROVIDED);
                final SubLObject var45 = (SubLObject)ConsesLow.list($ic19$, var39, var44);
                final SubLObject var46 = (SubLObject)(var44.eql(var40) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic20$, (SubLObject)ConsesLow.list($ic21$, var44, var40), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                f33021(var45, (SubLObject)$ic10$, var43, (SubLObject)$ic12$, var24, var46);
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0528.$g3889$.rebind(var41, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33048(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15308(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if ($ic19$.eql(module0205.f13333(var83))) {
                var84 = module0205.f13388(var83, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var84) && NIL != module0256.f16577(var79, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var80 = (SubLObject)ConsesLow.cons(var83, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33050(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = f33040(var38);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            SubLObject var35_103 = module0351.f23567();
            SubLObject var42 = (SubLObject)NIL;
            var42 = var35_103.first();
            while (NIL != var35_103) {
                if (NIL != module0158.f10140(var41, (SubLObject)$ic10$, var42)) {
                    final SubLObject var43 = module0158.f10141(var41, (SubLObject)$ic10$, var42);
                    SubLObject var44 = (SubLObject)NIL;
                    final SubLObject var45 = (SubLObject)NIL;
                    while (NIL == var44) {
                        final SubLObject var46 = module0052.f3695(var43, var45);
                        final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                        if (NIL != var47) {
                            SubLObject var48 = (SubLObject)NIL;
                            try {
                                var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                SubLObject var60_105 = (SubLObject)NIL;
                                final SubLObject var61_106 = (SubLObject)NIL;
                                while (NIL == var60_105) {
                                    final SubLObject var49 = module0052.f3695(var48, var61_106);
                                    final SubLObject var63_107 = (SubLObject)makeBoolean(!var61_106.eql(var49));
                                    if (NIL != var63_107) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                    var60_105 = (SubLObject)makeBoolean(NIL == var63_107);
                                }
                            }
                            finally {
                                final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var48) {
                                        module0158.f10319(var48);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                }
                            }
                        }
                        var44 = (SubLObject)makeBoolean(NIL == var47);
                    }
                }
                var35_103 = var35_103.rest();
                var42 = var35_103.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33051(final SubLObject var37, final SubLObject var24) {
        return f33052(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33053(final SubLObject var37, final SubLObject var24) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var41 = module0528.$g3889$.currentBinding(var38);
        try {
            module0528.$g3889$.bind((SubLObject)T, var38);
            SubLObject var42 = f33052(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL != var42) {
                final SubLObject var44 = module0205.f13388(var43, (SubLObject)UNPROVIDED);
                final SubLObject var45 = (SubLObject)ConsesLow.list($ic28$, var39, var44);
                final SubLObject var46 = (SubLObject)(var44.eql(var40) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic20$, (SubLObject)ConsesLow.list($ic21$, var40, var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                f33021(var45, (SubLObject)$ic12$, var43, (SubLObject)$ic10$, var24, var46);
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0528.$g3889$.rebind(var41, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33052(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15306(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if ($ic28$.eql(module0205.f13333(var83))) {
                var84 = module0205.f13388(var83, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var84) && NIL != f33044(var79, var84)) {
                    var80 = (SubLObject)ConsesLow.cons(var83, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33054(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0256.f16552(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            SubLObject var35_108 = module0351.f23567();
            SubLObject var42 = (SubLObject)NIL;
            var42 = var35_108.first();
            while (NIL != var35_108) {
                if (NIL != module0158.f10140(var41, (SubLObject)$ic12$, var42)) {
                    final SubLObject var43 = module0158.f10141(var41, (SubLObject)$ic12$, var42);
                    SubLObject var44 = (SubLObject)NIL;
                    final SubLObject var45 = (SubLObject)NIL;
                    while (NIL == var44) {
                        final SubLObject var46 = module0052.f3695(var43, var45);
                        final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                        if (NIL != var47) {
                            SubLObject var48 = (SubLObject)NIL;
                            try {
                                var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                SubLObject var60_109 = (SubLObject)NIL;
                                final SubLObject var61_110 = (SubLObject)NIL;
                                while (NIL == var60_109) {
                                    final SubLObject var49 = module0052.f3695(var48, var61_110);
                                    final SubLObject var63_111 = (SubLObject)makeBoolean(!var61_110.eql(var49));
                                    if (NIL != var63_111) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                    var60_109 = (SubLObject)makeBoolean(NIL == var63_111);
                                }
                            }
                            finally {
                                final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var48) {
                                        module0158.f10319(var48);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                }
                            }
                        }
                        var44 = (SubLObject)makeBoolean(NIL == var47);
                    }
                }
                var35_108 = var35_108.rest();
                var42 = var35_108.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33055(final SubLObject var37, final SubLObject var24) {
        return f33056(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33057(final SubLObject var37, final SubLObject var24) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var41 = module0528.$g3889$.currentBinding(var38);
        try {
            module0528.$g3889$.bind((SubLObject)T, var38);
            SubLObject var42 = f33056(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL != var42) {
                final SubLObject var44 = module0205.f13388(var43, (SubLObject)UNPROVIDED);
                final SubLObject var45 = (SubLObject)ConsesLow.list($ic28$, var39, var44);
                final SubLObject var46 = (SubLObject)(var44.eql(var40) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic20$, (SubLObject)ConsesLow.list($ic21$, var44, var40), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                f33021(var45, (SubLObject)$ic10$, var43, (SubLObject)$ic12$, var24, var46);
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0528.$g3889$.rebind(var41, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33056(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15308(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if ($ic28$.eql(module0205.f13333(var83))) {
                var84 = module0205.f13388(var83, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var84) && NIL != module0256.f16577(var79, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var80 = (SubLObject)ConsesLow.cons(var83, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33058(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = f33040(var38);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            SubLObject var35_112 = module0351.f23567();
            SubLObject var42 = (SubLObject)NIL;
            var42 = var35_112.first();
            while (NIL != var35_112) {
                if (NIL != module0158.f10143(var41, (SubLObject)$ic10$, var42)) {
                    final SubLObject var43 = module0158.f10144(var41, (SubLObject)$ic10$, var42);
                    SubLObject var44 = (SubLObject)NIL;
                    final SubLObject var45 = (SubLObject)NIL;
                    while (NIL == var44) {
                        final SubLObject var46 = module0052.f3695(var43, var45);
                        final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                        if (NIL != var47) {
                            SubLObject var48 = (SubLObject)NIL;
                            try {
                                var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                SubLObject var60_114 = (SubLObject)NIL;
                                final SubLObject var61_115 = (SubLObject)NIL;
                                while (NIL == var60_114) {
                                    final SubLObject var49 = module0052.f3695(var48, var61_115);
                                    final SubLObject var63_116 = (SubLObject)makeBoolean(!var61_115.eql(var49));
                                    if (NIL != var63_116) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                    var60_114 = (SubLObject)makeBoolean(NIL == var63_116);
                                }
                            }
                            finally {
                                final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var48) {
                                        module0158.f10319(var48);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                }
                            }
                        }
                        var44 = (SubLObject)makeBoolean(NIL == var47);
                    }
                }
                var35_112 = var35_112.rest();
                var42 = var35_112.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33059(final SubLObject var37, final SubLObject var24) {
        return f33060(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33061(final SubLObject var37, final SubLObject var24) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var41 = module0528.$g3889$.currentBinding(var38);
        try {
            module0528.$g3889$.bind((SubLObject)T, var38);
            SubLObject var42 = f33060(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL != var42) {
                final SubLObject var44 = module0205.f13388(var43, (SubLObject)UNPROVIDED);
                final SubLObject var45 = (SubLObject)ConsesLow.list($ic21$, var39, var44);
                final SubLObject var46 = (SubLObject)(var44.eql(var40) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic20$, (SubLObject)ConsesLow.list($ic21$, var40, var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                f33021(var45, (SubLObject)$ic12$, var43, (SubLObject)$ic10$, var24, var46);
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0528.$g3889$.rebind(var41, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33060(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15306(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if ($ic21$.eql(module0205.f13333(var83))) {
                var84 = module0205.f13388(var83, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var84) && NIL != f33044(var79, var84)) {
                    var80 = (SubLObject)ConsesLow.cons(var83, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33062(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0256.f16552(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            SubLObject var35_117 = module0351.f23567();
            SubLObject var42 = (SubLObject)NIL;
            var42 = var35_117.first();
            while (NIL != var35_117) {
                if (NIL != module0158.f10143(var41, (SubLObject)$ic12$, var42)) {
                    final SubLObject var43 = module0158.f10144(var41, (SubLObject)$ic12$, var42);
                    SubLObject var44 = (SubLObject)NIL;
                    final SubLObject var45 = (SubLObject)NIL;
                    while (NIL == var44) {
                        final SubLObject var46 = module0052.f3695(var43, var45);
                        final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                        if (NIL != var47) {
                            SubLObject var48 = (SubLObject)NIL;
                            try {
                                var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                SubLObject var60_118 = (SubLObject)NIL;
                                final SubLObject var61_119 = (SubLObject)NIL;
                                while (NIL == var60_118) {
                                    final SubLObject var49 = module0052.f3695(var48, var61_119);
                                    final SubLObject var63_120 = (SubLObject)makeBoolean(!var61_119.eql(var49));
                                    if (NIL != var63_120) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                    var60_118 = (SubLObject)makeBoolean(NIL == var63_120);
                                }
                            }
                            finally {
                                final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var48) {
                                        module0158.f10319(var48);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                }
                            }
                        }
                        var44 = (SubLObject)makeBoolean(NIL == var47);
                    }
                }
                var35_117 = var35_117.rest();
                var42 = var35_117.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33063(final SubLObject var37, final SubLObject var24) {
        return f33064(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33065(final SubLObject var37, final SubLObject var24) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var41 = module0528.$g3889$.currentBinding(var38);
        try {
            module0528.$g3889$.bind((SubLObject)T, var38);
            SubLObject var42 = f33060(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var43 = (SubLObject)NIL;
            var43 = var42.first();
            while (NIL != var42) {
                final SubLObject var44 = module0205.f13388(var43, (SubLObject)UNPROVIDED);
                final SubLObject var45 = (SubLObject)ConsesLow.list($ic21$, var39, var44);
                final SubLObject var46 = (SubLObject)(var44.eql(var40) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic20$, (SubLObject)ConsesLow.list($ic21$, var44, var40), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
                f33021(var45, (SubLObject)$ic10$, var43, (SubLObject)$ic12$, var24, var46);
                var42 = var42.rest();
                var43 = var42.first();
            }
        }
        finally {
            module0528.$g3889$.rebind(var41, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33064(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15308(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if ($ic21$.eql(module0205.f13333(var83))) {
                var84 = module0205.f13388(var83, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var84) && NIL != module0256.f16577(var79, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var80 = (SubLObject)ConsesLow.cons(var83, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33066(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0262.f17311(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            SubLObject var35_123 = module0351.f23567();
            SubLObject var42 = (SubLObject)NIL;
            var42 = var35_123.first();
            while (NIL != var35_123) {
                if (NIL != module0158.f10146(var41, (SubLObject)$ic10$, var42)) {
                    final SubLObject var43 = module0158.f10147(var41, (SubLObject)$ic10$, var42);
                    SubLObject var44 = (SubLObject)NIL;
                    final SubLObject var45 = (SubLObject)NIL;
                    while (NIL == var44) {
                        final SubLObject var46 = module0052.f3695(var43, var45);
                        final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                        if (NIL != var47) {
                            SubLObject var48 = (SubLObject)NIL;
                            try {
                                var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                SubLObject var60_125 = (SubLObject)NIL;
                                final SubLObject var61_126 = (SubLObject)NIL;
                                while (NIL == var60_125) {
                                    final SubLObject var49 = module0052.f3695(var48, var61_126);
                                    final SubLObject var63_127 = (SubLObject)makeBoolean(!var61_126.eql(var49));
                                    if (NIL != var63_127) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                    var60_125 = (SubLObject)makeBoolean(NIL == var63_127);
                                }
                            }
                            finally {
                                final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var48) {
                                        module0158.f10319(var48);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                }
                            }
                        }
                        var44 = (SubLObject)makeBoolean(NIL == var47);
                    }
                }
                var35_123 = var35_123.rest();
                var42 = var35_123.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33067(final SubLObject var37, final SubLObject var24) {
        return f33068(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33069(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var39 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var40 = f33068(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            final SubLObject var42 = module0205.f13388(var41, (SubLObject)UNPROVIDED);
            final SubLObject var43 = (SubLObject)ConsesLow.list($ic37$, var38, var42);
            final SubLObject var44 = (SubLObject)(var42.eql(var39) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic38$, (SubLObject)ConsesLow.list($ic37$, var39, var42), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            f33021(var43, (SubLObject)$ic12$, var41, (SubLObject)$ic10$, var24, var44);
            var40 = var40.rest();
            var41 = var40.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33068(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15306(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if ($ic37$.eql(module0205.f13333(var83))) {
                var84 = module0205.f13388(var83, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var84) && NIL != module0262.f17336(var79, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var80 = (SubLObject)ConsesLow.cons(var83, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33070(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0262.f17312(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            SubLObject var35_131 = module0351.f23567();
            SubLObject var42 = (SubLObject)NIL;
            var42 = var35_131.first();
            while (NIL != var35_131) {
                if (NIL != module0158.f10146(var41, (SubLObject)$ic12$, var42)) {
                    final SubLObject var43 = module0158.f10147(var41, (SubLObject)$ic12$, var42);
                    SubLObject var44 = (SubLObject)NIL;
                    final SubLObject var45 = (SubLObject)NIL;
                    while (NIL == var44) {
                        final SubLObject var46 = module0052.f3695(var43, var45);
                        final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                        if (NIL != var47) {
                            SubLObject var48 = (SubLObject)NIL;
                            try {
                                var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                SubLObject var60_132 = (SubLObject)NIL;
                                final SubLObject var61_133 = (SubLObject)NIL;
                                while (NIL == var60_132) {
                                    final SubLObject var49 = module0052.f3695(var48, var61_133);
                                    final SubLObject var63_134 = (SubLObject)makeBoolean(!var61_133.eql(var49));
                                    if (NIL != var63_134) {
                                        var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                    }
                                    var60_132 = (SubLObject)makeBoolean(NIL == var63_134);
                                }
                            }
                            finally {
                                final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    if (NIL != var48) {
                                        module0158.f10319(var48);
                                    }
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                }
                            }
                        }
                        var44 = (SubLObject)makeBoolean(NIL == var47);
                    }
                }
                var35_131 = var35_131.rest();
                var42 = var35_131.first();
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33071(final SubLObject var37, final SubLObject var24) {
        return f33072(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33073(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var39 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var40 = f33072(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            final SubLObject var42 = module0205.f13388(var41, (SubLObject)UNPROVIDED);
            final SubLObject var43 = (SubLObject)ConsesLow.list($ic37$, var42, var38);
            final SubLObject var44 = (SubLObject)(var42.eql(var39) ? NIL : ConsesLow.list(module0191.f11990((SubLObject)$ic38$, (SubLObject)ConsesLow.list($ic37$, var42, var39), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            f33021(var43, (SubLObject)$ic10$, var41, (SubLObject)$ic12$, var24, var44);
            var40 = var40.rest();
            var41 = var40.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33072(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15308(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if ($ic37$.eql(module0205.f13333(var83))) {
                var84 = module0205.f13388(var83, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var84) && NIL != module0262.f17339(var79, var84, (SubLObject)UNPROVIDED)) {
                    var80 = (SubLObject)ConsesLow.cons(var83, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33074(final SubLObject var37) {
        return f33028(module0205.f13333(var37));
    }
    
    public static SubLObject f33075(final SubLObject var37, final SubLObject var24) {
        return f33076(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33077(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = module0439.f30675(var37);
        final SubLObject var40 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic43$, (SubLObject)ConsesLow.listS($ic19$, var38, (SubLObject)$ic44$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var41 = f33076(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            f33021(var39, (SubLObject)$ic12$, var42, (SubLObject)$ic10$, var24, var40);
            var41 = var41.rest();
            var42 = var41.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33076(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = var79;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15306(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var80 = (SubLObject)ConsesLow.cons(var84, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33078(final SubLObject var37) {
        return f33029(module0205.f13333(var37));
    }
    
    public static SubLObject f33079(final SubLObject var37, final SubLObject var24) {
        return f33080(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33081(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = module0439.f30675(var37);
        final SubLObject var40 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic43$, (SubLObject)ConsesLow.listS($ic19$, var38, (SubLObject)$ic44$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var41 = f33080(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            f33021(var39, (SubLObject)$ic10$, var42, (SubLObject)$ic12$, var24, var40);
            var41 = var41.rest();
            var42 = var41.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33080(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = var79;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15308(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var80 = (SubLObject)ConsesLow.cons(var84, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33082(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = (SubLObject)$ic49$;
        return (SubLObject)makeBoolean(NIL != module0131.$g1532$.getDynamicValue(var38) && NIL != module0337.f22630(var37, var39));
    }
    
    public static SubLObject f33083(final SubLObject var37) {
        return f33028(module0205.f13333(var37));
    }
    
    public static SubLObject f33084(final SubLObject var37, final SubLObject var24) {
        return f33085(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33086(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = module0439.f30675(var37);
        final SubLObject var40 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic43$, (SubLObject)ConsesLow.listS($ic19$, var38, (SubLObject)$ic50$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var41 = f33085(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            f33021(var39, (SubLObject)$ic10$, var42, (SubLObject)$ic12$, var24, var40);
            var41 = var41.rest();
            var42 = var41.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33085(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = var79;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15308(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var80 = (SubLObject)ConsesLow.cons(var84, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33087(final SubLObject var37) {
        return f33028(module0205.f13333(var37));
    }
    
    public static SubLObject f33088(final SubLObject var37, final SubLObject var24) {
        return f33089(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33090(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = (SubLObject)((NIL != module0349.f23390(var38)) ? ConsesLow.list(module0191.f11990((SubLObject)$ic43$, (SubLObject)ConsesLow.listS($ic19$, var38, (SubLObject)$ic53$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : ConsesLow.list(module0191.f11990((SubLObject)$ic43$, (SubLObject)ConsesLow.listS($ic19$, var38, (SubLObject)$ic54$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        if (NIL != module0202.f12598(var37)) {
            final SubLObject var40 = module0439.f30674(var37);
            SubLObject var41 = f33089(var40, var24, (SubLObject)UNPROVIDED);
            SubLObject var42 = (SubLObject)NIL;
            var42 = var41.first();
            while (NIL != var41) {
                f33021(var40, (SubLObject)$ic12$, var42, (SubLObject)$ic10$, var24, var39);
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        else {
            SubLObject var43 = module0205.f13275(var37, (SubLObject)UNPROVIDED);
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                if (!var44.equal(var37)) {
                    SubLObject var35_137 = f33089(var44, var24, (SubLObject)UNPROVIDED);
                    SubLObject var45 = (SubLObject)NIL;
                    var45 = var35_137.first();
                    while (NIL != var35_137) {
                        f33021(var44, (SubLObject)$ic12$, var45, (SubLObject)$ic10$, var24, var39);
                        var35_137 = var35_137.rest();
                        var45 = var35_137.first();
                    }
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33089(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = var79;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15306(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var80 = (SubLObject)ConsesLow.cons(var84, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33091(final SubLObject var37) {
        return f33029(module0205.f13333(var37));
    }
    
    public static SubLObject f33092(final SubLObject var37, final SubLObject var24) {
        return f33093(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33094(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = (SubLObject)((NIL != module0349.f23390(var38)) ? ConsesLow.list(module0191.f11990((SubLObject)$ic43$, (SubLObject)ConsesLow.listS($ic19$, var38, (SubLObject)$ic53$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : ConsesLow.list(module0191.f11990((SubLObject)$ic43$, (SubLObject)ConsesLow.listS($ic19$, var38, (SubLObject)$ic54$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        if (NIL != module0202.f12598(var37)) {
            final SubLObject var40 = module0439.f30674(var37);
            SubLObject var41 = f33093(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var42 = (SubLObject)NIL;
            var42 = var41.first();
            while (NIL != var41) {
                f33021(var40, (SubLObject)$ic10$, var42, (SubLObject)$ic12$, var24, var39);
                var41 = var41.rest();
                var42 = var41.first();
            }
        }
        else {
            SubLObject var43 = module0205.f13275(var37, (SubLObject)UNPROVIDED);
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                if (!var44.equal(var37)) {
                    SubLObject var35_138 = f33093(var37, var24, (SubLObject)UNPROVIDED);
                    SubLObject var45 = (SubLObject)NIL;
                    var45 = var35_138.first();
                    while (NIL != var35_138) {
                        f33021(var44, (SubLObject)$ic10$, var45, (SubLObject)$ic12$, var24, var39);
                        var35_138 = var35_138.rest();
                        var45 = var35_138.first();
                    }
                }
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33093(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = var79;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15308(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var80 = (SubLObject)ConsesLow.cons(var84, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33095(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = Sequences.remove(var38, f33096(var38), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = module0351.f23567();
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            if (NIL != module0158.f10084($ic59$, (SubLObject)$ic10$, var42)) {
                final SubLObject var43 = module0158.f10085($ic59$, (SubLObject)$ic10$, var42);
                SubLObject var44 = (SubLObject)NIL;
                final SubLObject var45 = (SubLObject)NIL;
                while (NIL == var44) {
                    final SubLObject var46 = module0052.f3695(var43, var45);
                    final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                    if (NIL != var47) {
                        SubLObject var48 = (SubLObject)NIL;
                        try {
                            var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                            SubLObject var60_140 = (SubLObject)NIL;
                            final SubLObject var61_141 = (SubLObject)NIL;
                            while (NIL == var60_140) {
                                final SubLObject var49 = module0052.f3695(var48, var61_141);
                                final SubLObject var63_142 = (SubLObject)makeBoolean(!var61_141.eql(var49));
                                if (NIL != var63_142) {
                                    SubLObject var50 = (SubLObject)NIL;
                                    final SubLObject var51 = $ic59$;
                                    final SubLObject var52 = var49;
                                    final SubLObject var53 = module0178.f11282(var52);
                                    SubLObject var54;
                                    SubLObject var55;
                                    SubLObject var56;
                                    for (var54 = (SubLObject)NIL, var54 = module0232.f15306(var53); NIL == var50 && NIL != var54; var54 = var54.rest()) {
                                        var55 = var54.first();
                                        if (var51.eql(module0205.f13333(var55))) {
                                            var56 = module0205.f13388(var55, (SubLObject)UNPROVIDED);
                                            if (NIL != module0004.f104(var56, var40, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                                                var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                                var50 = (SubLObject)T;
                                            }
                                        }
                                    }
                                }
                                var60_140 = (SubLObject)makeBoolean(NIL == var63_142);
                            }
                        }
                        finally {
                            final SubLObject var57 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var48) {
                                    module0158.f10319(var48);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var57);
                            }
                        }
                    }
                    var44 = (SubLObject)makeBoolean(NIL == var47);
                }
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        final SubLObject var58 = f33097(var38);
        var41 = module0351.f23567();
        var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            if (NIL != module0158.f10084($ic60$, (SubLObject)$ic10$, var42)) {
                final SubLObject var43 = module0158.f10085($ic60$, (SubLObject)$ic10$, var42);
                SubLObject var44 = (SubLObject)NIL;
                final SubLObject var45 = (SubLObject)NIL;
                while (NIL == var44) {
                    final SubLObject var46 = module0052.f3695(var43, var45);
                    final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                    if (NIL != var47) {
                        SubLObject var48 = (SubLObject)NIL;
                        try {
                            var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                            SubLObject var60_141 = (SubLObject)NIL;
                            final SubLObject var61_142 = (SubLObject)NIL;
                            while (NIL == var60_141) {
                                final SubLObject var49 = module0052.f3695(var48, var61_142);
                                final SubLObject var63_143 = (SubLObject)makeBoolean(!var61_142.eql(var49));
                                if (NIL != var63_143) {
                                    SubLObject var50 = (SubLObject)NIL;
                                    final SubLObject var51 = $ic60$;
                                    final SubLObject var52 = var49;
                                    final SubLObject var53 = module0178.f11282(var52);
                                    SubLObject var54;
                                    SubLObject var55;
                                    SubLObject var56;
                                    for (var54 = (SubLObject)NIL, var54 = module0232.f15306(var53); NIL == var50 && NIL != var54; var54 = var54.rest()) {
                                        var55 = var54.first();
                                        if (var51.eql(module0205.f13333(var55))) {
                                            var56 = module0205.f13388(var55, (SubLObject)UNPROVIDED);
                                            if (NIL != module0004.f104(var56, var58, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                                                var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                                var50 = (SubLObject)T;
                                            }
                                        }
                                    }
                                }
                                var60_141 = (SubLObject)makeBoolean(NIL == var63_143);
                            }
                        }
                        finally {
                            final SubLObject var59 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var48) {
                                    module0158.f10319(var48);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var59);
                            }
                        }
                    }
                    var44 = (SubLObject)makeBoolean(NIL == var47);
                }
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var39;
    }
    
    public static SubLObject f33098() {
        final SubLObject var149 = $g3901$.getGlobalValue();
        if (NIL != var149) {
            module0034.f1818(var149);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33099(final SubLObject var57) {
        return module0034.f1829($g3901$.getGlobalValue(), (SubLObject)ConsesLow.list(var57), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33100(final SubLObject var57) {
        return module0260.f17032(var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33096(final SubLObject var57) {
        SubLObject var58 = $g3901$.getGlobalValue();
        if (NIL == var58) {
            var58 = module0034.f1934((SubLObject)$ic61$, (SubLObject)$ic62$, (SubLObject)SIXTEEN_INTEGER, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic63$);
        }
        SubLObject var59 = module0034.f1814(var58, var57, (SubLObject)$ic23$);
        if (var59 == $ic23$) {
            var59 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33100(var57)));
            module0034.f1816(var58, var57, var59, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var59);
    }
    
    public static SubLObject f33101() {
        final SubLObject var149 = $g3902$.getGlobalValue();
        if (NIL != var149) {
            module0034.f1818(var149);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33102(final SubLObject var57) {
        return module0034.f1829($g3902$.getGlobalValue(), (SubLObject)ConsesLow.list(var57), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33103(final SubLObject var57) {
        return module0260.f17030(var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33097(final SubLObject var57) {
        SubLObject var58 = $g3902$.getGlobalValue();
        if (NIL == var58) {
            var58 = module0034.f1934((SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)SIXTEEN_INTEGER, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic66$);
        }
        SubLObject var59 = module0034.f1814(var58, var57, (SubLObject)$ic23$);
        if (var59 == $ic23$) {
            var59 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f33103(var57)));
            module0034.f1816(var58, var57, var59, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var59);
    }
    
    public static SubLObject f33104(final SubLObject var37, final SubLObject var24) {
        return f33105(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33106(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var39 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var40 = f33105(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            final SubLObject var42 = module0205.f13333(var41);
            final SubLObject var43 = module0205.f13388(var41, (SubLObject)UNPROVIDED);
            final SubLObject var44 = (SubLObject)ConsesLow.list(var42, var38, var43);
            final SubLObject var45 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic67$, (SubLObject)ConsesLow.list(var42, var39, var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            f33021(var44, (SubLObject)$ic10$, var41, (SubLObject)$ic12$, var24, var45);
            var40 = var40.rest();
            var41 = var40.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33105(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var80 = f33096(var79);
        final SubLObject var81 = f33097(var79);
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = $ic59$;
        SubLObject var84 = module0178.f11282(var24);
        SubLObject var85;
        SubLObject var86;
        SubLObject var87;
        for (var85 = (SubLObject)NIL, var85 = module0232.f15306(var84); (NIL == var78 || NIL == var82) && NIL != var85; var85 = var85.rest()) {
            var86 = var85.first();
            if (var83.eql(module0205.f13333(var86))) {
                var87 = module0205.f13388(var86, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var87) && NIL != module0004.f104(var87, var80, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                    var82 = (SubLObject)ConsesLow.cons(var86, var82);
                }
            }
        }
        var83 = $ic60$;
        var84 = module0178.f11282(var24);
        for (var85 = (SubLObject)NIL, var85 = module0232.f15306(var84); (NIL == var78 || NIL == var82) && NIL != var85; var85 = var85.rest()) {
            var86 = var85.first();
            if (var83.eql(module0205.f13333(var86))) {
                var87 = module0205.f13388(var86, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var87) && NIL != module0004.f104(var87, var81, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                    var82 = (SubLObject)ConsesLow.cons(var86, var82);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var82) : var82;
    }
    
    public static SubLObject f33107(final SubLObject var37) {
        return f33035(var37);
    }
    
    public static SubLObject f33108(final SubLObject var37, final SubLObject var24) {
        return f33036(var37, var24);
    }
    
    public static SubLObject f33109(final SubLObject var37, final SubLObject var24) {
        return f33038(var37, var24);
    }
    
    public static SubLObject f33110(final SubLObject var37) {
        final SubLObject var38 = module0205.f13333(var37);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = Sequences.remove(var38, f33096(var38), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            if (NIL == module0333.f22416(var41)) {
                SubLObject var35_157 = module0351.f23567();
                SubLObject var42 = (SubLObject)NIL;
                var42 = var35_157.first();
                while (NIL != var35_157) {
                    if (NIL != module0158.f10084(var41, (SubLObject)$ic10$, var42)) {
                        final SubLObject var43 = module0158.f10085(var41, (SubLObject)$ic10$, var42);
                        SubLObject var44 = (SubLObject)NIL;
                        final SubLObject var45 = (SubLObject)NIL;
                        while (NIL == var44) {
                            final SubLObject var46 = module0052.f3695(var43, var45);
                            final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                            if (NIL != var47) {
                                SubLObject var48 = (SubLObject)NIL;
                                try {
                                    var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                    SubLObject var60_158 = (SubLObject)NIL;
                                    final SubLObject var61_159 = (SubLObject)NIL;
                                    while (NIL == var60_158) {
                                        final SubLObject var49 = module0052.f3695(var48, var61_159);
                                        final SubLObject var63_160 = (SubLObject)makeBoolean(!var61_159.eql(var49));
                                        if (NIL != var63_160) {
                                            var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                        }
                                        var60_158 = (SubLObject)makeBoolean(NIL == var63_160);
                                    }
                                }
                                finally {
                                    final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var48) {
                                            module0158.f10319(var48);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                    }
                                }
                            }
                            var44 = (SubLObject)makeBoolean(NIL == var47);
                        }
                    }
                    var35_157 = var35_157.rest();
                    var42 = var35_157.first();
                }
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33111(final SubLObject var37, final SubLObject var24) {
        return f33112(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33113(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = module0205.f13385(var37, (SubLObject)UNPROVIDED);
        SubLObject var40 = f33112(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            final SubLObject var42 = module0205.f13333(var41);
            final SubLObject var43 = reader.bq_cons(var42, ConsesLow.append(var39, (SubLObject)NIL));
            final SubLObject var44 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic67$, (SubLObject)ConsesLow.list($ic59$, var38, var42), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            f33021(var43, (SubLObject)$ic12$, var41, (SubLObject)$ic10$, var24, var44);
            var40 = var40.rest();
            var41 = var40.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33112(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        final SubLObject var80 = f33096(var79);
        SubLObject var81 = (SubLObject)NIL;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15306(var82); (NIL == var78 || NIL == var81) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            var85 = module0205.f13333(var84);
            if (NIL != module0193.f12105(var85) && !var79.eql(var85) && NIL == module0333.f22416(var85) && NIL != module0004.f104(var85, var80, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                var81 = (SubLObject)ConsesLow.cons(var84, var81);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var81) : var81;
    }
    
    public static SubLObject f33114(final SubLObject var37) {
        final SubLObject var38 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = Sequences.remove(var38, f33096(var38), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = module0351.f23567();
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            if (NIL != module0158.f10084($ic60$, (SubLObject)$ic10$, var42)) {
                final SubLObject var43 = module0158.f10085($ic60$, (SubLObject)$ic10$, var42);
                SubLObject var44 = (SubLObject)NIL;
                final SubLObject var45 = (SubLObject)NIL;
                while (NIL == var44) {
                    final SubLObject var46 = module0052.f3695(var43, var45);
                    final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                    if (NIL != var47) {
                        SubLObject var48 = (SubLObject)NIL;
                        try {
                            var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                            SubLObject var60_162 = (SubLObject)NIL;
                            final SubLObject var61_163 = (SubLObject)NIL;
                            while (NIL == var60_162) {
                                final SubLObject var49 = module0052.f3695(var48, var61_163);
                                final SubLObject var63_164 = (SubLObject)makeBoolean(!var61_163.eql(var49));
                                if (NIL != var63_164) {
                                    SubLObject var50 = (SubLObject)NIL;
                                    final SubLObject var51 = $ic59$;
                                    final SubLObject var52 = var49;
                                    final SubLObject var53 = module0178.f11282(var52);
                                    SubLObject var54;
                                    SubLObject var55;
                                    SubLObject var56;
                                    for (var54 = (SubLObject)NIL, var54 = module0232.f15306(var53); NIL == var50 && NIL != var54; var54 = var54.rest()) {
                                        var55 = var54.first();
                                        if (var51.eql(module0205.f13333(var55))) {
                                            var56 = module0205.f13388(var55, (SubLObject)UNPROVIDED);
                                            if (NIL != module0004.f104(var56, var40, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                                                var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                                var50 = (SubLObject)T;
                                            }
                                        }
                                    }
                                }
                                var60_162 = (SubLObject)makeBoolean(NIL == var63_164);
                            }
                        }
                        finally {
                            final SubLObject var57 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var48) {
                                    module0158.f10319(var48);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var57);
                            }
                        }
                    }
                    var44 = (SubLObject)makeBoolean(NIL == var47);
                }
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        final SubLObject var58 = f33097(var38);
        var41 = module0351.f23567();
        var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            if (NIL != module0158.f10084($ic59$, (SubLObject)$ic10$, var42)) {
                final SubLObject var43 = module0158.f10085($ic59$, (SubLObject)$ic10$, var42);
                SubLObject var44 = (SubLObject)NIL;
                final SubLObject var45 = (SubLObject)NIL;
                while (NIL == var44) {
                    final SubLObject var46 = module0052.f3695(var43, var45);
                    final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                    if (NIL != var47) {
                        SubLObject var48 = (SubLObject)NIL;
                        try {
                            var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                            SubLObject var60_163 = (SubLObject)NIL;
                            final SubLObject var61_164 = (SubLObject)NIL;
                            while (NIL == var60_163) {
                                final SubLObject var49 = module0052.f3695(var48, var61_164);
                                final SubLObject var63_165 = (SubLObject)makeBoolean(!var61_164.eql(var49));
                                if (NIL != var63_165) {
                                    SubLObject var50 = (SubLObject)NIL;
                                    final SubLObject var51 = $ic60$;
                                    final SubLObject var52 = var49;
                                    final SubLObject var53 = module0178.f11282(var52);
                                    SubLObject var54;
                                    SubLObject var55;
                                    SubLObject var56;
                                    for (var54 = (SubLObject)NIL, var54 = module0232.f15306(var53); NIL == var50 && NIL != var54; var54 = var54.rest()) {
                                        var55 = var54.first();
                                        if (var51.eql(module0205.f13333(var55))) {
                                            var56 = module0205.f13388(var55, (SubLObject)UNPROVIDED);
                                            if (NIL != module0004.f104(var56, var58, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                                                var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                                var50 = (SubLObject)T;
                                            }
                                        }
                                    }
                                }
                                var60_163 = (SubLObject)makeBoolean(NIL == var63_165);
                            }
                        }
                        finally {
                            final SubLObject var59 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var48) {
                                    module0158.f10319(var48);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var59);
                            }
                        }
                    }
                    var44 = (SubLObject)makeBoolean(NIL == var47);
                }
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var39;
    }
    
    public static SubLObject f33115(final SubLObject var37, final SubLObject var24) {
        return f33116(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33117(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var39 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var40 = f33116(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            final SubLObject var42 = module0205.f13333(var41);
            final SubLObject var43 = module0205.f13388(var41, (SubLObject)UNPROVIDED);
            final SubLObject var44 = (SubLObject)ConsesLow.list(var42, var38, var43);
            final SubLObject var45 = (SubLObject)(var42.eql($ic60$) ? ConsesLow.list(module0191.f11990((SubLObject)$ic67$, (SubLObject)ConsesLow.list($ic59$, var39, var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : ConsesLow.list(module0191.f11990((SubLObject)$ic67$, (SubLObject)ConsesLow.list($ic60$, var39, var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
            f33021(var44, (SubLObject)$ic10$, var41, (SubLObject)$ic12$, var24, var45);
            var40 = var40.rest();
            var41 = var40.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33116(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var80 = f33096(var79);
        final SubLObject var81 = f33097(var79);
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = $ic60$;
        SubLObject var84 = module0178.f11282(var24);
        SubLObject var85;
        SubLObject var86;
        SubLObject var87;
        for (var85 = (SubLObject)NIL, var85 = module0232.f15306(var84); (NIL == var78 || NIL == var82) && NIL != var85; var85 = var85.rest()) {
            var86 = var85.first();
            if (var83.eql(module0205.f13333(var86))) {
                var87 = module0205.f13388(var86, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var87) && NIL != module0004.f104(var87, var80, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                    var82 = (SubLObject)ConsesLow.cons(var86, var82);
                }
            }
        }
        var83 = $ic59$;
        var84 = module0178.f11282(var24);
        for (var85 = (SubLObject)NIL, var85 = module0232.f15306(var84); (NIL == var78 || NIL == var82) && NIL != var85; var85 = var85.rest()) {
            var86 = var85.first();
            if (var83.eql(module0205.f13333(var86))) {
                var87 = module0205.f13388(var86, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12105(var87) && NIL != module0004.f104(var87, var81, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                    var82 = (SubLObject)ConsesLow.cons(var86, var82);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var82) : var82;
    }
    
    public static SubLObject f33118(final SubLObject var37) {
        return f33035(var37);
    }
    
    public static SubLObject f33119(final SubLObject var37, final SubLObject var24) {
        return f33036(var37, var24);
    }
    
    public static SubLObject f33120(final SubLObject var37, final SubLObject var24) {
        return f33038(var37, var24);
    }
    
    public static SubLObject f33121(final SubLObject var37) {
        final SubLObject var38 = module0205.f13333(var37);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = f33097(var38);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            if (NIL == module0333.f22416(var41)) {
                SubLObject var35_169 = module0351.f23567();
                SubLObject var42 = (SubLObject)NIL;
                var42 = var35_169.first();
                while (NIL != var35_169) {
                    if (NIL != module0158.f10084(var41, (SubLObject)$ic10$, var42)) {
                        final SubLObject var43 = module0158.f10085(var41, (SubLObject)$ic10$, var42);
                        SubLObject var44 = (SubLObject)NIL;
                        final SubLObject var45 = (SubLObject)NIL;
                        while (NIL == var44) {
                            final SubLObject var46 = module0052.f3695(var43, var45);
                            final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                            if (NIL != var47) {
                                SubLObject var48 = (SubLObject)NIL;
                                try {
                                    var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                    SubLObject var60_170 = (SubLObject)NIL;
                                    final SubLObject var61_171 = (SubLObject)NIL;
                                    while (NIL == var60_170) {
                                        final SubLObject var49 = module0052.f3695(var48, var61_171);
                                        final SubLObject var63_172 = (SubLObject)makeBoolean(!var61_171.eql(var49));
                                        if (NIL != var63_172) {
                                            var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                        }
                                        var60_170 = (SubLObject)makeBoolean(NIL == var63_172);
                                    }
                                }
                                finally {
                                    final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var48) {
                                            module0158.f10319(var48);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                    }
                                }
                            }
                            var44 = (SubLObject)makeBoolean(NIL == var47);
                        }
                    }
                    var35_169 = var35_169.rest();
                    var42 = var35_169.first();
                }
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33122(final SubLObject var37, final SubLObject var24) {
        return f33123(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33124(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var41 = f33123(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            final SubLObject var43 = module0205.f13333(var42);
            final SubLObject var44 = (SubLObject)ConsesLow.list(var43, var40, var39);
            final SubLObject var45 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic67$, (SubLObject)ConsesLow.list($ic60$, var38, var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            f33021(var44, (SubLObject)$ic12$, var42, (SubLObject)$ic10$, var24, var45);
            var41 = var41.rest();
            var42 = var41.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33123(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        final SubLObject var80 = f33097(var79);
        SubLObject var81 = (SubLObject)NIL;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15306(var82); (NIL == var78 || NIL == var81) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            var85 = module0205.f13333(var84);
            if (NIL != module0193.f12105(var85) && NIL == module0333.f22416(var85) && NIL != module0004.f104(var85, var80, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED)) {
                var81 = (SubLObject)ConsesLow.cons(var84, var81);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var81) : var81;
    }
    
    public static SubLObject f33125(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (NIL != module0131.$g1532$.getDynamicValue(var38)) {
            final SubLObject var39 = (SubLObject)$ic80$;
            return module0337.f22630(var37, var39);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33126(final SubLObject var37) {
        final SubLObject var38 = module0205.f13333(var37);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0261.f17224(var38, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            if (NIL == module0333.f22416(var41)) {
                SubLObject var35_174 = module0351.f23567();
                SubLObject var42 = (SubLObject)NIL;
                var42 = var35_174.first();
                while (NIL != var35_174) {
                    if (NIL != module0158.f10084(var41, (SubLObject)$ic12$, var42)) {
                        final SubLObject var43 = module0158.f10085(var41, (SubLObject)$ic12$, var42);
                        SubLObject var44 = (SubLObject)NIL;
                        final SubLObject var45 = (SubLObject)NIL;
                        while (NIL == var44) {
                            final SubLObject var46 = module0052.f3695(var43, var45);
                            final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                            if (NIL != var47) {
                                SubLObject var48 = (SubLObject)NIL;
                                try {
                                    var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                    SubLObject var60_175 = (SubLObject)NIL;
                                    final SubLObject var61_176 = (SubLObject)NIL;
                                    while (NIL == var60_175) {
                                        final SubLObject var49 = module0052.f3695(var48, var61_176);
                                        final SubLObject var63_177 = (SubLObject)makeBoolean(!var61_176.eql(var49));
                                        if (NIL != var63_177) {
                                            var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                        }
                                        var60_175 = (SubLObject)makeBoolean(NIL == var63_177);
                                    }
                                }
                                finally {
                                    final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var48) {
                                            module0158.f10319(var48);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                    }
                                }
                            }
                            var44 = (SubLObject)makeBoolean(NIL == var47);
                        }
                    }
                    var35_174 = var35_174.rest();
                    var42 = var35_174.first();
                }
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33127(final SubLObject var37, final SubLObject var24) {
        return f33128(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33129(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = module0205.f13385(var37, (SubLObject)UNPROVIDED);
        SubLObject var40 = f33128(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            final SubLObject var42 = module0205.f13333(var41);
            final SubLObject var43 = reader.bq_cons(var42, ConsesLow.append(var39, (SubLObject)NIL));
            final SubLObject var44 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic81$, (SubLObject)ConsesLow.list($ic82$, var38, var42), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            f33021(var43, (SubLObject)$ic10$, var41, (SubLObject)$ic12$, var24, var44);
            var40 = var40.rest();
            var41 = var40.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33128(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15306(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            var84 = module0205.f13333(var83);
            if (NIL != module0193.f12105(var84) && NIL == module0333.f22416(var84) && NIL != module0261.f17247(var79, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var80 = (SubLObject)ConsesLow.cons(var83, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33130(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        if (NIL != module0131.$g1532$.getDynamicValue(var38)) {
            final SubLObject var39 = (SubLObject)$ic85$;
            return module0337.f22630(var37, var39);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33131(final SubLObject var37) {
        final SubLObject var38 = module0205.f13333(var37);
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0261.f17225(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            if (NIL == module0333.f22416(var41)) {
                SubLObject var35_179 = module0351.f23567();
                SubLObject var42 = (SubLObject)NIL;
                var42 = var35_179.first();
                while (NIL != var35_179) {
                    if (NIL != module0158.f10084(var41, (SubLObject)$ic12$, var42)) {
                        final SubLObject var43 = module0158.f10085(var41, (SubLObject)$ic12$, var42);
                        SubLObject var44 = (SubLObject)NIL;
                        final SubLObject var45 = (SubLObject)NIL;
                        while (NIL == var44) {
                            final SubLObject var46 = module0052.f3695(var43, var45);
                            final SubLObject var47 = (SubLObject)makeBoolean(!var45.eql(var46));
                            if (NIL != var47) {
                                SubLObject var48 = (SubLObject)NIL;
                                try {
                                    var48 = module0158.f10316(var46, (SubLObject)$ic11$, (SubLObject)NIL, var42);
                                    SubLObject var60_180 = (SubLObject)NIL;
                                    final SubLObject var61_181 = (SubLObject)NIL;
                                    while (NIL == var60_180) {
                                        final SubLObject var49 = module0052.f3695(var48, var61_181);
                                        final SubLObject var63_182 = (SubLObject)makeBoolean(!var61_181.eql(var49));
                                        if (NIL != var63_182) {
                                            var39 = (SubLObject)ConsesLow.cons(var49, var39);
                                        }
                                        var60_180 = (SubLObject)makeBoolean(NIL == var63_182);
                                    }
                                }
                                finally {
                                    final SubLObject var50 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                        if (NIL != var48) {
                                            module0158.f10319(var48);
                                        }
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var50);
                                    }
                                }
                            }
                            var44 = (SubLObject)makeBoolean(NIL == var47);
                        }
                    }
                    var35_179 = var35_179.rest();
                    var42 = var35_179.first();
                }
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33132(final SubLObject var37, final SubLObject var24) {
        return f33133(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33134(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13333(var37);
        final SubLObject var39 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        SubLObject var41 = f33133(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            final SubLObject var43 = module0205.f13333(var42);
            final SubLObject var44 = (SubLObject)ConsesLow.list(var43, var40, var39);
            final SubLObject var45 = (SubLObject)ConsesLow.list(module0191.f11990((SubLObject)$ic81$, (SubLObject)ConsesLow.list($ic86$, var38, var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            f33021(var44, (SubLObject)$ic10$, var42, (SubLObject)$ic12$, var24, var45);
            var41 = var41.rest();
            var42 = var41.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33133(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        SubLObject var84;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15306(var81); (NIL == var78 || NIL == var80) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            var84 = module0205.f13333(var83);
            if (NIL != module0193.f12105(var84) && NIL == module0333.f22416(var84) && NIL != module0261.f17251(var79, var84, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var80 = (SubLObject)ConsesLow.cons(var83, var80);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33135(final SubLObject var37) {
        final SubLObject var38 = (SubLObject)$ic89$;
        return module0337.f22630(var37, var38);
    }
    
    public static SubLObject f33136(final SubLObject var37, final SubLObject var24) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33137(final SubLObject var37) {
        final SubLObject var38 = (SubLObject)$ic89$;
        return module0337.f22630(var37, var38);
    }
    
    public static SubLObject f33138(final SubLObject var37, final SubLObject var24) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33139(final SubLObject var37) {
        final SubLObject var38 = module0205.f13364(module0205.f13388(var37, (SubLObject)UNPROVIDED));
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = module0351.f23567();
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            if (NIL != module0158.f10175(var38, var41)) {
                final SubLObject var42 = module0158.f10176(var38, var41);
                SubLObject var43 = (SubLObject)NIL;
                final SubLObject var44 = (SubLObject)NIL;
                while (NIL == var43) {
                    final SubLObject var45 = module0052.f3695(var42, var44);
                    final SubLObject var46 = (SubLObject)makeBoolean(!var44.eql(var45));
                    if (NIL != var46) {
                        SubLObject var47 = (SubLObject)NIL;
                        try {
                            var47 = module0158.f10316(var45, (SubLObject)$ic11$, (SubLObject)NIL, var41);
                            SubLObject var60_185 = (SubLObject)NIL;
                            final SubLObject var61_186 = (SubLObject)NIL;
                            while (NIL == var60_185) {
                                final SubLObject var48 = module0052.f3695(var47, var61_186);
                                final SubLObject var63_187 = (SubLObject)makeBoolean(!var61_186.eql(var48));
                                if (NIL != var63_187) {
                                    var39 = (SubLObject)ConsesLow.cons(var48, var39);
                                }
                                var60_185 = (SubLObject)makeBoolean(NIL == var63_187);
                            }
                        }
                        finally {
                            final SubLObject var49 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var47) {
                                    module0158.f10319(var47);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var49);
                            }
                        }
                    }
                    var43 = (SubLObject)makeBoolean(NIL == var46);
                }
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f33140(final SubLObject var37, final SubLObject var24) {
        return f33141(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33142(final SubLObject var37, final SubLObject var24) {
        SubLObject var38 = f33141(var37, var24, (SubLObject)UNPROVIDED);
        SubLObject var39 = (SubLObject)NIL;
        var39 = var38.first();
        while (NIL != var38) {
            f33021(var37, (SubLObject)$ic12$, var39, (SubLObject)$ic10$, var24, (SubLObject)UNPROVIDED);
            var38 = var38.rest();
            var39 = var38.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33141(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13364(module0205.f13388(var37, (SubLObject)UNPROVIDED));
        SubLObject var80 = (SubLObject)NIL;
        final SubLObject var81 = $ic94$;
        final SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15306(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var85 = module0205.f13364(module0205.f13388(var84, (SubLObject)UNPROVIDED));
                if (var79.eql(var85)) {
                    var80 = (SubLObject)ConsesLow.cons(var84, var80);
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33143(final SubLObject var37) {
        return f33028($ic97$);
    }
    
    public static SubLObject f33144(final SubLObject var37, final SubLObject var24) {
        return f33145(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33146(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0205.f13387(var37, (SubLObject)UNPROVIDED);
        final SubLObject var39 = module0205.f13388(var37, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0205.f13364(var39);
        if (NIL != var40) {
            final SubLObject var41 = module0462.f31422();
            final SubLObject var42 = (SubLObject)ConsesLow.list($ic97$, var38, var40);
            SubLObject var43 = f33145(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var44 = (SubLObject)NIL;
            var44 = var43.first();
            while (NIL != var43) {
                f33021(var42, (SubLObject)$ic12$, var44, (SubLObject)$ic10$, var24, var41);
                var43 = var43.rest();
                var44 = var43.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33145(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        SubLObject var79 = (SubLObject)NIL;
        final SubLObject var80 = $ic97$;
        final SubLObject var81 = module0178.f11282(var24);
        SubLObject var82;
        SubLObject var83;
        for (var82 = (SubLObject)NIL, var82 = module0232.f15306(var81); (NIL == var78 || NIL == var79) && NIL != var82; var82 = var82.rest()) {
            var83 = var82.first();
            if (var80.eql(module0205.f13333(var83))) {
                var79 = (SubLObject)ConsesLow.cons(var83, var79);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var79) : var79;
    }
    
    public static SubLObject f33147(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        return module0018.$g648$.getDynamicValue(var38);
    }
    
    public static SubLObject f33148(final SubLObject var37) {
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = module0351.f23567();
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            if (NIL != module0158.f10244((SubLObject)$ic10$, var40)) {
                final SubLObject var41 = module0158.f10245((SubLObject)$ic10$, var40);
                SubLObject var42 = (SubLObject)NIL;
                final SubLObject var43 = (SubLObject)NIL;
                while (NIL == var42) {
                    final SubLObject var44 = module0052.f3695(var41, var43);
                    final SubLObject var45 = (SubLObject)makeBoolean(!var43.eql(var44));
                    if (NIL != var45) {
                        SubLObject var46 = (SubLObject)NIL;
                        try {
                            var46 = module0158.f10316(var44, (SubLObject)$ic11$, (SubLObject)NIL, var40);
                            SubLObject var60_192 = (SubLObject)NIL;
                            final SubLObject var61_193 = (SubLObject)NIL;
                            while (NIL == var60_192) {
                                final SubLObject var47 = module0052.f3695(var46, var61_193);
                                final SubLObject var63_194 = (SubLObject)makeBoolean(!var61_193.eql(var47));
                                if (NIL != var63_194) {
                                    var38 = (SubLObject)ConsesLow.cons(var47, var38);
                                }
                                var60_192 = (SubLObject)makeBoolean(NIL == var63_194);
                            }
                        }
                        finally {
                            final SubLObject var48 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var46) {
                                    module0158.f10319(var46);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var48);
                            }
                        }
                    }
                    var42 = (SubLObject)makeBoolean(NIL == var45);
                }
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        return var38;
    }
    
    public static SubLObject f33149(final SubLObject var37, final SubLObject var24) {
        return f33150(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33151(final SubLObject var37, final SubLObject var24) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0528.$g3889$.currentBinding(var38);
        try {
            module0528.$g3889$.bind((SubLObject)T, var38);
            SubLObject var40 = f33150(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var41 = (SubLObject)NIL;
            var41 = var40.first();
            while (NIL != var40) {
                f33021(var37, (SubLObject)$ic12$, var41, (SubLObject)$ic10$, var24, (SubLObject)UNPROVIDED);
                var40 = var40.rest();
                var41 = var40.first();
            }
        }
        finally {
            module0528.$g3889$.rebind(var39, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33150(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        SubLObject var79 = (SubLObject)NIL;
        final SubLObject var80 = module0178.f11282(var24);
        SubLObject var81;
        SubLObject var82;
        for (var81 = (SubLObject)NIL, var81 = module0232.f15306(var80); (NIL == var78 || NIL == var79) && NIL != var81; var81 = var81.rest()) {
            var82 = var81.first();
            if (NIL != module0193.f12106(module0205.f13333(var82))) {
                var79 = (SubLObject)ConsesLow.cons(var82, var79);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var79) : var79;
    }
    
    public static SubLObject f33152(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        return module0018.$g648$.getDynamicValue(var38);
    }
    
    public static SubLObject f33153(final SubLObject var37) {
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = module0351.f23567();
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            if (NIL != module0158.f10244((SubLObject)$ic12$, var40)) {
                final SubLObject var41 = module0158.f10245((SubLObject)$ic12$, var40);
                SubLObject var42 = (SubLObject)NIL;
                final SubLObject var43 = (SubLObject)NIL;
                while (NIL == var42) {
                    final SubLObject var44 = module0052.f3695(var41, var43);
                    final SubLObject var45 = (SubLObject)makeBoolean(!var43.eql(var44));
                    if (NIL != var45) {
                        SubLObject var46 = (SubLObject)NIL;
                        try {
                            var46 = module0158.f10316(var44, (SubLObject)$ic11$, (SubLObject)NIL, var40);
                            SubLObject var60_195 = (SubLObject)NIL;
                            final SubLObject var61_196 = (SubLObject)NIL;
                            while (NIL == var60_195) {
                                final SubLObject var47 = module0052.f3695(var46, var61_196);
                                final SubLObject var63_197 = (SubLObject)makeBoolean(!var61_196.eql(var47));
                                if (NIL != var63_197) {
                                    var38 = (SubLObject)ConsesLow.cons(var47, var38);
                                }
                                var60_195 = (SubLObject)makeBoolean(NIL == var63_197);
                            }
                        }
                        finally {
                            final SubLObject var48 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var46) {
                                    module0158.f10319(var46);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var48);
                            }
                        }
                    }
                    var42 = (SubLObject)makeBoolean(NIL == var45);
                }
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        return var38;
    }
    
    public static SubLObject f33154(final SubLObject var37, final SubLObject var24) {
        return f33155(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33156(final SubLObject var37, final SubLObject var24) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0528.$g3889$.currentBinding(var38);
        try {
            module0528.$g3889$.bind((SubLObject)T, var38);
            SubLObject var40 = f33155(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var41 = (SubLObject)NIL;
            var41 = var40.first();
            while (NIL != var40) {
                f33021(var37, (SubLObject)$ic10$, var41, (SubLObject)$ic12$, var24, (SubLObject)UNPROVIDED);
                var40 = var40.rest();
                var41 = var40.first();
            }
        }
        finally {
            module0528.$g3889$.rebind(var39, var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33155(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        SubLObject var79 = (SubLObject)NIL;
        final SubLObject var80 = module0178.f11282(var24);
        SubLObject var81;
        SubLObject var82;
        for (var81 = (SubLObject)NIL, var81 = module0232.f15308(var80); (NIL == var78 || NIL == var79) && NIL != var81; var81 = var81.rest()) {
            var82 = var81.first();
            if (NIL != module0193.f12106(module0205.f13333(var82))) {
                var79 = (SubLObject)ConsesLow.cons(var82, var79);
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var79) : var79;
    }
    
    public static SubLObject f33157(final SubLObject var37) {
        return module0152.f9721();
    }
    
    public static SubLObject f33158(final SubLObject var37) {
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = module0351.f23567();
        SubLObject var40 = (SubLObject)NIL;
        var40 = var39.first();
        while (NIL != var39) {
            SubLObject var35_198 = module0274.f18220();
            SubLObject var41 = (SubLObject)NIL;
            var41 = var35_198.first();
            while (NIL != var35_198) {
                if (var40.eql(module0178.f11291(var41))) {
                    var38 = (SubLObject)ConsesLow.cons(var41, var38);
                }
                var35_198 = var35_198.rest();
                var41 = var35_198.first();
            }
            var39 = var39.rest();
            var40 = var39.first();
        }
        return var38;
    }
    
    public static SubLObject f33159(final SubLObject var37, final SubLObject var24) {
        return f33150(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33160(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0528.f32908();
        if (NIL != var38 && NIL != module0274.f18077(var37, module0178.f11287(var38), (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return f33151(var37, var24);
    }
    
    public static SubLObject f33161(final SubLObject var37) {
        return f33030(module0205.f13333(var37));
    }
    
    public static SubLObject f33162(final SubLObject var37, final SubLObject var24) {
        return f33163(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33164(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0528.f32910();
        if (NIL != var38) {
            final SubLObject var39 = module0178.f11287(var38);
            SubLObject var40 = f33163(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var41 = (SubLObject)NIL;
            var41 = var40.first();
            while (NIL != var40) {
                final SubLObject var42 = (SubLObject)((NIL != module0202.f12592(var41)) ? $ic12$ : $ic10$);
                f33021(module0202.f12782(var39, var37), (SubLObject)$ic12$, var41, var42, var24, (SubLObject)UNPROVIDED);
                var40 = var40.rest();
                var41 = var40.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33163(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = $ic106$;
        SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15306(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var85 = module0202.f12835(var84, (SubLObject)UNPROVIDED);
                if (NIL == module0202.f12592(var85)) {
                    var86 = module0202.f12832(var85, (SubLObject)UNPROVIDED);
                    if (var79.eql(var86)) {
                        var80 = (SubLObject)ConsesLow.cons(var84, var80);
                    }
                }
            }
        }
        var81 = $ic106$;
        var82 = module0178.f11282(var24);
        for (var83 = (SubLObject)NIL, var83 = module0232.f15308(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var85 = module0202.f12835(var84, (SubLObject)UNPROVIDED);
                if (NIL != module0202.f12592(var85)) {
                    var86 = module0202.f12832(var85, (SubLObject)UNPROVIDED);
                    if (var79.eql(var86)) {
                        var80 = (SubLObject)ConsesLow.cons(var84, var80);
                    }
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33165(final SubLObject var37) {
        return f33030(module0205.f13333(var37));
    }
    
    public static SubLObject f33166(final SubLObject var37, final SubLObject var24) {
        return f33167(var37, var24, (SubLObject)T);
    }
    
    public static SubLObject f33168(final SubLObject var37, final SubLObject var24) {
        final SubLObject var38 = module0528.f32910();
        if (NIL != var38) {
            final SubLObject var39 = module0178.f11287(var38);
            SubLObject var40 = f33167(var37, var24, (SubLObject)UNPROVIDED);
            SubLObject var41 = (SubLObject)NIL;
            var41 = var40.first();
            while (NIL != var40) {
                final SubLObject var42 = (SubLObject)((NIL != module0202.f12592(var41)) ? $ic10$ : $ic12$);
                f33021(module0202.f12782(var39, module0202.f12771(var37)), (SubLObject)$ic12$, var41, var42, var24, (SubLObject)UNPROVIDED);
                var40 = var40.rest();
                var41 = var40.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33167(final SubLObject var37, final SubLObject var24, SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = (SubLObject)NIL;
        }
        final SubLObject var79 = module0205.f13333(var37);
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = $ic106$;
        SubLObject var82 = module0178.f11282(var24);
        SubLObject var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var83 = (SubLObject)NIL, var83 = module0232.f15308(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var85 = module0202.f12835(var84, (SubLObject)UNPROVIDED);
                if (NIL == module0202.f12592(var85)) {
                    var86 = module0202.f12832(var85, (SubLObject)UNPROVIDED);
                    if (var79.eql(var86)) {
                        var80 = (SubLObject)ConsesLow.cons(var84, var80);
                    }
                }
            }
        }
        var81 = $ic106$;
        var82 = module0178.f11282(var24);
        for (var83 = (SubLObject)NIL, var83 = module0232.f15306(var82); (NIL == var78 || NIL == var80) && NIL != var83; var83 = var83.rest()) {
            var84 = var83.first();
            if (var81.eql(module0205.f13333(var84))) {
                var85 = module0202.f12835(var84, (SubLObject)UNPROVIDED);
                if (NIL != module0202.f12592(var85)) {
                    var86 = module0202.f12832(var85, (SubLObject)UNPROVIDED);
                    if (var79.eql(var86)) {
                        var80 = (SubLObject)ConsesLow.cons(var84, var80);
                    }
                }
            }
        }
        return (NIL != var78) ? module0035.sublisp_boolean(var80) : var80;
    }
    
    public static SubLObject f33169() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33014", "S#36493", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33015", "S#33870", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33016", "S#36494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33017", "S#36495", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33018", "S#36496", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0530", "f33019", "S#36497");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33020", "S#36498", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33021", "S#36499", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33022", "S#36342", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33023", "S#36500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33024", "S#36501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33025", "S#36502", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33026", "S#36503", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33027", "S#36504", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33028", "S#36505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33029", "S#36506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33030", "S#36507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33031", "S#36479", 1, 0, false);
        new $f33031$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33032", "S#36508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33034", "S#36480", 2, 0, false);
        new $f33034$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33033", "S#36509", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33035", "S#36510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33036", "S#36511", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33038", "S#36512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33037", "S#36513", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33039", "S#36481", 1, 0, false);
        new $f33039$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33041", "S#36514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33043", "S#36482", 2, 0, false);
        new $f33043$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33042", "S#36515", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33044", "S#36516", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33045", "S#36517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33040", "S#36518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33046", "S#36519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33047", "S#36520", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33049", "S#36521", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33048", "S#36522", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33050", "S#36523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33051", "S#36524", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33053", "S#36525", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33052", "S#36526", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33054", "S#36527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33055", "S#36528", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33057", "S#36529", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33056", "S#36530", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33058", "S#36531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33059", "S#36532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33061", "S#36533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33060", "S#36534", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33062", "S#36535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33063", "S#36536", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33065", "S#36537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33064", "S#36538", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33066", "S#36539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33067", "S#36540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33069", "S#36541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33068", "S#36542", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33070", "S#36543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33071", "S#36544", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33073", "S#36545", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33072", "S#36546", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33074", "S#36483", 1, 0, false);
        new $f33074$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33075", "S#36547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33077", "S#36548", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33076", "S#36549", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33078", "S#36550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33079", "S#36551", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33081", "S#36552", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33080", "S#36553", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33082", "S#36484", 1, 0, false);
        new $f33082$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33083", "S#36554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33084", "S#36555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33086", "S#36556", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33085", "S#36557", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33087", "S#36558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33088", "S#36559", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33090", "S#36560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33089", "S#36561", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33091", "S#36562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33092", "S#36563", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33094", "S#36564", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33093", "S#36565", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33095", "S#36566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33098", "S#36567", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33099", "S#36568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33100", "S#36569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33096", "S#36570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33101", "S#36571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33102", "S#36572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33103", "S#36573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33097", "S#36574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33104", "S#36575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33106", "S#36576", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33105", "S#36577", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33107", "S#36578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33108", "S#36579", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33109", "S#36580", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33110", "S#36485", 1, 0, false);
        new $f33110$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33111", "S#36581", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33113", "S#36582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33112", "S#36583", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33114", "S#36584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33115", "S#36585", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33117", "S#36586", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33116", "S#36587", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33118", "S#36588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33119", "S#36589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33120", "S#36590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33121", "S#36486", 1, 0, false);
        new $f33121$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33122", "S#36591", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33124", "S#36592", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33123", "S#36593", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33125", "S#36487", 1, 0, false);
        new $f33125$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33126", "S#36594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33127", "S#36595", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33129", "S#36596", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33128", "S#36597", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33130", "S#36488", 1, 0, false);
        new $f33130$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33131", "S#36598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33132", "S#36599", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33134", "S#36600", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33133", "S#36601", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33135", "S#36489", 1, 0, false);
        new $f33135$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33136", "S#36602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33137", "S#36603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33138", "S#36604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33139", "S#36605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33140", "S#36606", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33142", "S#36607", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33141", "S#36608", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33143", "S#36609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33144", "S#36610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33146", "S#36611", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33145", "S#36612", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33147", "S#36490", 1, 0, false);
        new $f33147$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33148", "S#36613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33149", "S#36614", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33151", "S#36615", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33150", "S#36616", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33152", "S#36617", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33153", "S#36618", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33154", "S#36619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33156", "S#36620", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33155", "S#36621", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33157", "S#36622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33158", "S#36623", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33159", "S#36624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33160", "S#36625", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33161", "S#36491", 1, 0, false);
        new $f33161$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33162", "S#36626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33164", "S#36492", 2, 0, false);
        new $f33164$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33163", "S#36627", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33165", "S#36628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33166", "S#36629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33168", "S#36630", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0530", "f33167", "S#36631", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33170() {
        $g3899$ = SubLFiles.defparameter("S#36632", (SubLObject)NIL);
        $g3900$ = SubLFiles.defparameter("S#36633", (SubLObject)NIL);
        $g3901$ = SubLFiles.deflexical("S#36634", (SubLObject)NIL);
        $g3902$ = SubLFiles.deflexical("S#36635", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33171() {
        module0002.f50((SubLObject)$ic7$, (SubLObject)$ic8$);
        f33017((SubLObject)$ic13$, (SubLObject)$ic14$);
        f33017((SubLObject)$ic15$, (SubLObject)$ic16$);
        f33017((SubLObject)$ic17$, (SubLObject)$ic18$);
        module0034.f1895((SubLObject)$ic22$);
        f33017((SubLObject)$ic24$, (SubLObject)$ic25$);
        f33017((SubLObject)$ic26$, (SubLObject)$ic27$);
        f33017((SubLObject)$ic29$, (SubLObject)$ic30$);
        f33017((SubLObject)$ic31$, (SubLObject)$ic32$);
        f33017((SubLObject)$ic33$, (SubLObject)$ic34$);
        f33017((SubLObject)$ic35$, (SubLObject)$ic36$);
        f33017((SubLObject)$ic39$, (SubLObject)$ic40$);
        f33017((SubLObject)$ic41$, (SubLObject)$ic42$);
        f33017((SubLObject)$ic45$, (SubLObject)$ic46$);
        f33017((SubLObject)$ic47$, (SubLObject)$ic48$);
        f33017((SubLObject)$ic51$, (SubLObject)$ic52$);
        f33017((SubLObject)$ic55$, (SubLObject)$ic56$);
        f33017((SubLObject)$ic57$, (SubLObject)$ic58$);
        module0034.f1909((SubLObject)$ic61$);
        module0034.f1909((SubLObject)$ic64$);
        f33017((SubLObject)$ic68$, (SubLObject)$ic69$);
        f33017((SubLObject)$ic70$, (SubLObject)$ic71$);
        f33017((SubLObject)$ic72$, (SubLObject)$ic73$);
        f33017((SubLObject)$ic74$, (SubLObject)$ic75$);
        f33017((SubLObject)$ic76$, (SubLObject)$ic77$);
        f33017((SubLObject)$ic78$, (SubLObject)$ic79$);
        f33017((SubLObject)$ic83$, (SubLObject)$ic84$);
        f33017((SubLObject)$ic87$, (SubLObject)$ic88$);
        f33017((SubLObject)$ic90$, (SubLObject)$ic91$);
        f33017((SubLObject)$ic92$, (SubLObject)$ic93$);
        f33017((SubLObject)$ic95$, (SubLObject)$ic96$);
        f33017((SubLObject)$ic98$, (SubLObject)$ic99$);
        f33017((SubLObject)$ic100$, (SubLObject)$ic101$);
        f33017((SubLObject)$ic102$, (SubLObject)$ic103$);
        f33017((SubLObject)$ic104$, (SubLObject)$ic105$);
        f33017((SubLObject)$ic107$, (SubLObject)$ic108$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33169();
    }
    
    public void initializeVariables() {
        f33170();
    }
    
    public void runTopLevelForms() {
        f33171();
    }
    
    static {
        me = (SubLFile)new module0530();
        $g3899$ = null;
        $g3900$ = null;
        $g3901$ = null;
        $g3902$ = null;
        $ic0$ = makeKeyword("FORWARD");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic3$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic4$ = makeKeyword("DONE");
        $ic5$ = makeSymbol("DO-LIST");
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#36498", "CYC"));
        $ic7$ = makeSymbol("S#36498", "CYC");
        $ic8$ = makeSymbol("S#36497", "CYC");
        $ic9$ = makeKeyword("ALL");
        $ic10$ = makeKeyword("NEG");
        $ic11$ = makeKeyword("RULE");
        $ic12$ = makeKeyword("POS");
        $ic13$ = makeKeyword("FORWARD-NORMAL-POS");
        $ic14$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("RULE-SELECT"), (SubLObject)makeSymbol("S#36479", "CYC"), (SubLObject)makeKeyword("RULE-FILTER"), (SubLObject)makeSymbol("S#36508", "CYC"), (SubLObject)makeKeyword("EXPAND"), (SubLObject)makeSymbol("S#36480", "CYC"));
        $ic15$ = makeKeyword("FORWARD-NORMAL-NEG");
        $ic16$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("NEG"), (SubLObject)makeKeyword("RULE-SELECT"), (SubLObject)makeSymbol("S#36510", "CYC"), (SubLObject)makeKeyword("RULE-FILTER"), (SubLObject)makeSymbol("S#36511", "CYC"), (SubLObject)makeKeyword("EXPAND"), (SubLObject)makeSymbol("S#36512", "CYC"));
        $ic17$ = makeKeyword("FORWARD-ISA");
        $ic18$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("RULE-SELECT"), makeSymbol("S#36481", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36514", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36482", "CYC") });
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic20$ = makeKeyword("GENLS");
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic22$ = makeSymbol("S#36518", "CYC");
        $ic23$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic24$ = makeKeyword("FORWARD-NOT-ISA");
        $ic25$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("isa")), makeKeyword("RULE-SELECT"), makeSymbol("S#36519", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36520", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36521", "CYC") });
        $ic26$ = makeKeyword("FORWARD-QUOTED-ISA");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("RULE-SELECT"), makeSymbol("S#36523", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36524", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36525", "CYC") });
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic29$ = makeKeyword("FORWARD-NOT-QUOTED-ISA");
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("quotedIsa")), makeKeyword("RULE-SELECT"), makeSymbol("S#36527", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36528", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36529", "CYC") });
        $ic31$ = makeKeyword("FORWARD-GENLS");
        $ic32$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genls")), makeKeyword("RULE-SELECT"), makeSymbol("S#36531", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36532", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36533", "CYC") });
        $ic33$ = makeKeyword("FORWARD-NOT-GENLS");
        $ic34$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genls")), makeKeyword("RULE-SELECT"), makeSymbol("S#36535", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36536", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36537", "CYC") });
        $ic35$ = makeKeyword("FORWARD-GENLMT");
        $ic36$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), makeKeyword("RULE-SELECT"), makeSymbol("S#36539", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36540", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36541", "CYC") });
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic38$ = makeKeyword("GENLMT");
        $ic39$ = makeKeyword("FORWARD-NOT-GENLMT");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlMt")), makeKeyword("RULE-SELECT"), makeSymbol("S#36543", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36544", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36545", "CYC") });
        $ic41$ = makeKeyword("FORWARD-SYMMETRIC-POS");
        $ic42$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26074", "CYC"))), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("S#36483", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36547", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36548", "CYC") });
        $ic43$ = makeKeyword("ISA");
        $ic44$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SymmetricBinaryPredicate")));
        $ic45$ = makeKeyword("FORWARD-SYMMETRIC-NEG");
        $ic46$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26074", "CYC"))), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("S#36550", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36551", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36552", "CYC") });
        $ic47$ = makeKeyword("FORWARD-ASYMMETRIC");
        $ic48$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("S#36484", "CYC"), makeKeyword("RULE-SELECT"), makeSymbol("S#36554", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36555", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36556", "CYC") });
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26095", "CYC"))), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"));
        $ic50$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("AsymmetricBinaryPredicate")));
        $ic51$ = makeKeyword("FORWARD-COMMUTATIVE-POS");
        $ic52$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26094", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("RULE-SELECT"), makeSymbol("S#36558", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36559", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36560", "CYC") });
        $ic53$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CommutativePredicate")));
        $ic54$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("PartiallyCommutativePredicate")));
        $ic55$ = makeKeyword("FORWARD-COMMUTATIVE-NEG");
        $ic56$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26094", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), makeKeyword("RULE-SELECT"), makeSymbol("S#36562", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36563", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36564", "CYC") });
        $ic57$ = makeKeyword("FORWARD-GENLPREDS-GAF");
        $ic58$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26081", "CYC")))), makeKeyword("RULE-SELECT"), makeSymbol("S#36566", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36575", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36576", "CYC") });
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic60$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic61$ = makeSymbol("S#36570", "CYC");
        $ic62$ = makeSymbol("S#36634", "CYC");
        $ic63$ = makeSymbol("S#36567", "CYC");
        $ic64$ = makeSymbol("S#36574", "CYC");
        $ic65$ = makeSymbol("S#36635", "CYC");
        $ic66$ = makeSymbol("S#36571", "CYC");
        $ic67$ = makeKeyword("GENLPREDS");
        $ic68$ = makeKeyword("FORWARD-NOT-GENLPREDS-GAF");
        $ic69$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), makeKeyword("RULE-SELECT"), makeSymbol("S#36578", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36579", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36580", "CYC") });
        $ic70$ = makeKeyword("FORWARD-GENLPREDS-POS");
        $ic71$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26081", "CYC"))), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("S#36485", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36581", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36582", "CYC") });
        $ic72$ = makeKeyword("FORWARD-GENLINVERSE-GAF");
        $ic73$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26081", "CYC")))), makeKeyword("RULE-SELECT"), makeSymbol("S#36584", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36585", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36586", "CYC") });
        $ic74$ = makeKeyword("FORWARD-NOT-GENLINVERSE-GAF");
        $ic75$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("genlInverse")), makeKeyword("RULE-SELECT"), makeSymbol("S#36588", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36589", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36590", "CYC") });
        $ic76$ = makeKeyword("FORWARD-GENLINVERSE-POS");
        $ic77$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26081", "CYC"))), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("S#36486", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36591", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36592", "CYC") });
        $ic78$ = makeKeyword("FORWARD-NEGATIONPREDS");
        $ic79$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("S#36487", "CYC"), makeKeyword("RULE-SELECT"), makeSymbol("S#36594", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36595", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36596", "CYC") });
        $ic80$ = (SubLList)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26101", "CYC"))), (SubLObject)makeKeyword("ANYTHING"));
        $ic81$ = makeKeyword("NEGATIONPREDS");
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("negationPreds"));
        $ic83$ = makeKeyword("FORWARD-NEGATIONINVERSE");
        $ic84$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("S#36488", "CYC"), makeKeyword("RULE-SELECT"), makeSymbol("S#36598", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36599", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36600", "CYC") });
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26101", "CYC"))), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"));
        $ic86$ = constant_handles_oc.f8479((SubLObject)makeString("negationInverse"));
        $ic87$ = makeKeyword("FORWARD-EVAL-POS");
        $ic88$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("EXCLUSIVE"), (SubLObject)makeSymbol("S#36489", "CYC"), (SubLObject)makeKeyword("EXPAND"), (SubLObject)makeSymbol("S#36602", "CYC"));
        $ic89$ = (SubLList)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("NON-HL-PREDICATE-P")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26078", "CYC"))), (SubLObject)makeKeyword("ANYTHING"));
        $ic90$ = makeKeyword("FORWARD-EVAL-NEG");
        $ic91$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("NEG"), (SubLObject)makeKeyword("EXCLUSIVE"), (SubLObject)makeSymbol("S#36603", "CYC"), (SubLObject)makeKeyword("EXPAND"), (SubLObject)makeSymbol("S#36604", "CYC"));
        $ic92$ = makeKeyword("FORWARD-TERM-OF-UNIT");
        $ic93$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), makeKeyword("RULE-SELECT"), makeSymbol("S#36605", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36606", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36607", "CYC") });
        $ic94$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic95$ = makeKeyword("FORWARD-NAT-FUNCTION");
        $ic96$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("termOfUnit")), makeKeyword("RULE-SELECT"), makeSymbol("S#36609", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36610", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36611", "CYC") });
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("natFunction"));
        $ic98$ = makeKeyword("FORWARD-UNBOUND-PRED-POS");
        $ic99$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("S#36490", "CYC"), makeKeyword("RULE-SELECT"), makeSymbol("S#36613", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36614", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36615", "CYC") });
        $ic100$ = makeKeyword("FORWARD-UNBOUND-PRED-NEG");
        $ic101$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED"), makeSymbol("S#36617", "CYC"), makeKeyword("RULE-SELECT"), makeSymbol("S#36618", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36619", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36620", "CYC") });
        $ic102$ = makeKeyword("FORWARD-ASSERTIVE-WFF-UNBOUND-PRED-POS");
        $ic103$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("S#36622", "CYC"), makeKeyword("RULE-SELECT"), makeSymbol("S#36623", "CYC"), makeKeyword("RULE-FILTER"), makeSymbol("S#36624", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#36625", "CYC") });
        $ic104$ = makeKeyword("FORWARD-IST-POS");
        $ic105$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("RULE-SELECT"), (SubLObject)makeSymbol("S#36491", "CYC"), (SubLObject)makeKeyword("RULE-FILTER"), (SubLObject)makeSymbol("S#36626", "CYC"), (SubLObject)makeKeyword("EXPAND"), (SubLObject)makeSymbol("S#36492", "CYC"));
        $ic106$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic107$ = makeKeyword("FORWARD-IST-NEG");
        $ic108$ = ConsesLow.list((SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("NEG"), (SubLObject)makeKeyword("RULE-SELECT"), (SubLObject)makeSymbol("S#36628", "CYC"), (SubLObject)makeKeyword("RULE-FILTER"), (SubLObject)makeSymbol("S#36629", "CYC"), (SubLObject)makeKeyword("EXPAND"), (SubLObject)makeSymbol("S#36630", "CYC"));
    }
    
    public static final class $f33031$UnaryFunction extends UnaryFunction
    {
        public $f33031$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36479"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33031(var75);
        }
    }
    
    public static final class $f33034$BinaryFunction extends BinaryFunction
    {
        public $f33034$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36480"));
        }
        
        public SubLObject processItem(final SubLObject var75, final SubLObject var77) {
            return f33034(var75, var77);
        }
    }
    
    public static final class $f33039$UnaryFunction extends UnaryFunction
    {
        public $f33039$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36481"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33039(var75);
        }
    }
    
    public static final class $f33043$BinaryFunction extends BinaryFunction
    {
        public $f33043$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36482"));
        }
        
        public SubLObject processItem(final SubLObject var75, final SubLObject var77) {
            return f33043(var75, var77);
        }
    }
    
    public static final class $f33074$UnaryFunction extends UnaryFunction
    {
        public $f33074$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36483"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33074(var75);
        }
    }
    
    public static final class $f33082$UnaryFunction extends UnaryFunction
    {
        public $f33082$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36484"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33082(var75);
        }
    }
    
    public static final class $f33110$UnaryFunction extends UnaryFunction
    {
        public $f33110$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36485"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33110(var75);
        }
    }
    
    public static final class $f33121$UnaryFunction extends UnaryFunction
    {
        public $f33121$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36486"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33121(var75);
        }
    }
    
    public static final class $f33125$UnaryFunction extends UnaryFunction
    {
        public $f33125$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36487"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33125(var75);
        }
    }
    
    public static final class $f33130$UnaryFunction extends UnaryFunction
    {
        public $f33130$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36488"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33130(var75);
        }
    }
    
    public static final class $f33135$UnaryFunction extends UnaryFunction
    {
        public $f33135$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36489"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33135(var75);
        }
    }
    
    public static final class $f33147$UnaryFunction extends UnaryFunction
    {
        public $f33147$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36490"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33147(var75);
        }
    }
    
    public static final class $f33161$UnaryFunction extends UnaryFunction
    {
        public $f33161$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36491"));
        }
        
        public SubLObject processItem(final SubLObject var75) {
            return f33161(var75);
        }
    }
    
    public static final class $f33164$BinaryFunction extends BinaryFunction
    {
        public $f33164$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#36492"));
        }
        
        public SubLObject processItem(final SubLObject var75, final SubLObject var77) {
            return f33164(var75, var77);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1225 ms
	
	Decompiled with Procyon 0.5.32.
*/