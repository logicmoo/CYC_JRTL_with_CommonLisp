package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0651 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0651";
    public static final String myFingerPrint = "eb05735445bb4b8b89152a7f4bfc0b0150dc7291d7d53689a61ad6cda1ebca18";
    public static SubLSymbol $g5058$;
    public static SubLSymbol $g5059$;
    public static SubLSymbol $g5060$;
    public static SubLSymbol $g5061$;
    public static SubLSymbol $g5062$;
    public static SubLSymbol $g5063$;
    public static SubLSymbol $g5064$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLList $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLList $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
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
    private static final SubLObject $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLList $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    
    public static SubLObject f39707(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic8$, var6)), ConsesLow.append(var7, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39708(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic10$, var6)), ConsesLow.append(var7, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39709(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic12$, var6)), ConsesLow.append(var7, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39710(final SubLObject var14, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = $g5058$.getDynamicValue();
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        if (NIL != module0259.f16867(var14, $ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic15$);
        }
        else {
            final SubLObject var18 = module0147.f9540(var15);
            final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
            final SubLObject var20 = module0147.$g2094$.currentBinding(var16);
            final SubLObject var21 = module0147.$g2096$.currentBinding(var16);
            try {
                module0147.$g2095$.bind(module0147.f9545(var18), var16);
                module0147.$g2094$.bind(module0147.f9546(var18), var16);
                module0147.$g2096$.bind(module0147.f9549(var18), var16);
                final SubLObject var22 = module0434.f30578((SubLObject)$ic16$, (SubLObject)ConsesLow.listS($ic17$, var14, (SubLObject)$ic18$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0084.f5762(var17, (SubLObject)$ic19$, var22);
                SubLObject var23 = (SubLObject)NIL;
                SubLObject var24 = (SubLObject)NIL;
                SubLObject var25 = $g5064$.getDynamicValue(var16);
                SubLObject var26 = (SubLObject)NIL;
                var26 = var25.first();
                while (NIL != var25) {
                    SubLObject var25_27;
                    var24 = (var25_27 = f39711(var26, var14, (SubLObject)UNPROVIDED));
                    SubLObject var27 = (SubLObject)NIL;
                    var27 = var25_27.first();
                    while (NIL != var25_27) {
                        var23 = (SubLObject)ConsesLow.cons(var27, var23);
                        var25_27 = var25_27.rest();
                        var27 = var25_27.first();
                    }
                    var25 = var25.rest();
                    var26 = var25.first();
                }
                module0084.f5762(var17, (SubLObject)$ic20$, var23);
            }
            finally {
                module0147.$g2096$.rebind(var21, var16);
                module0147.$g2094$.rebind(var20, var16);
                module0147.$g2095$.rebind(var19, var16);
            }
        }
        return module0084.f5780(var17);
    }
    
    public static SubLObject f39711(final SubLObject var29, final SubLObject var30, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = $g5058$.getDynamicValue();
        }
        final SubLObject var31 = module0412.f28668((SubLObject)NIL);
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        if (var29.equal($ic22$)) {
            var32 = (SubLObject)ConsesLow.listS($ic22$, var30, (SubLObject)$ic23$);
            var33 = (SubLObject)ConsesLow.listS($ic22$, var30, (SubLObject)$ic23$);
        }
        else {
            if (!var29.equalp($ic24$)) {
                return (SubLObject)NIL;
            }
            var32 = (SubLObject)ConsesLow.listS($ic24$, var30, (SubLObject)$ic25$);
            var33 = (SubLObject)ConsesLow.listS($ic24$, var30, (SubLObject)$ic25$);
        }
        var34 = module0434.f30576(var33, var32, var15, var31);
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic26$), var34);
    }
    
    public static SubLObject f39712(final SubLObject var35, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = $g5058$.getDynamicValue();
        }
        return f39713(var35, var15);
    }
    
    public static SubLObject f39713(final SubLObject var36, final SubLObject var15) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        var38 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)ZERO_INTEGER);
        var39 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)ZERO_INTEGER);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var37) && NIL == module0226.f14811(var36)) {
            Errors.error((SubLObject)$ic28$, var36);
        }
        SubLObject var40 = $g5060$.getDynamicValue(var37);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            if (NIL != module0035.f2180(module0260.f17007(var41, var15, (SubLObject)UNPROVIDED), $g5060$.getDynamicValue(var37), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0084.f5762(var39, var41, (SubLObject)$ic29$);
            }
            if (NIL != module0035.f2180(module0260.f17015(var41, var15, (SubLObject)UNPROVIDED), $g5060$.getDynamicValue(var37), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0084.f5762(var39, var41, (SubLObject)$ic30$);
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        final SubLObject var42 = module0147.f9540(var15);
        final SubLObject var43 = module0147.$g2095$.currentBinding(var37);
        final SubLObject var44 = module0147.$g2094$.currentBinding(var37);
        final SubLObject var45 = module0147.$g2096$.currentBinding(var37);
        try {
            module0147.$g2095$.bind(module0147.f9545(var42), var37);
            module0147.$g2094$.bind(module0147.f9546(var42), var37);
            module0147.$g2096$.bind(module0147.f9549(var42), var37);
            final SubLObject var46 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var36, (SubLObject)NIL, var46)) {
                final SubLObject var47 = module0158.f10011(var36, (SubLObject)NIL, var46);
                SubLObject var48 = (SubLObject)NIL;
                final SubLObject var49 = (SubLObject)NIL;
                while (NIL == var48) {
                    final SubLObject var50 = module0052.f3695(var47, var49);
                    final SubLObject var51 = (SubLObject)makeBoolean(!var49.eql(var50));
                    if (NIL != var51) {
                        SubLObject var52 = (SubLObject)NIL;
                        try {
                            var52 = module0158.f10316(var50, (SubLObject)$ic31$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var41_46 = (SubLObject)NIL;
                            final SubLObject var42_47 = (SubLObject)NIL;
                            while (NIL == var41_46) {
                                final SubLObject var53 = module0052.f3695(var52, var42_47);
                                final SubLObject var44_48 = (SubLObject)makeBoolean(!var42_47.eql(var53));
                                if (NIL != var44_48) {
                                    final SubLObject var54 = module0178.f11333(var53);
                                    SubLObject var55 = (SubLObject)NIL;
                                    SubLObject var56 = (SubLObject)NIL;
                                    SubLObject var57 = (SubLObject)NIL;
                                    SubLObject var58 = (SubLObject)NIL;
                                    SubLObject var59 = (SubLObject)NIL;
                                    if (module0178.f11335(var53).equalp(var36)) {
                                        var56 = (SubLObject)$ic32$;
                                    }
                                    else {
                                        var56 = (SubLObject)$ic33$;
                                    }
                                    if (NIL != module0004.f104(var54, $g5060$.getDynamicValue(var37), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var55 = module0067.f4884(var39, var54, (SubLObject)UNPROVIDED);
                                        if (var55.equalp((SubLObject)$ic29$)) {
                                            SubLObject var60;
                                            var57 = (var60 = module0084.f5761(var38, var56));
                                            SubLObject var61 = (SubLObject)NIL;
                                            var61 = var60.first();
                                            while (NIL != var60) {
                                                if (module0178.f11335(var61).equal(module0178.f11335(var53)) && NIL != module0004.f104(module0178.f11333(var61), module0260.f17007(var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                    var59 = (SubLObject)ConsesLow.cons(var61, var59);
                                                }
                                                var60 = var60.rest();
                                                var61 = var60.first();
                                            }
                                            var57 = module0035.f2235(var57, var59, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0084.f5762(var38, var56, var57);
                                        }
                                        else {
                                            var58 = (SubLObject)NIL;
                                            var57 = module0067.f4884(var38, var56, (SubLObject)UNPROVIDED);
                                            SubLObject var61;
                                            SubLObject var62;
                                            for (var62 = (SubLObject)NIL, var62 = var57; NIL == var58 && NIL != var62; var62 = var62.rest()) {
                                                var61 = var62.first();
                                                if (module0178.f11335(var61).equal(module0178.f11335(var53)) && NIL != module0004.f104(module0178.f11333(var61), module0260.f17015(var54, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                    var58 = (SubLObject)T;
                                                }
                                            }
                                            if (NIL == var58) {
                                                module0084.f5762(var38, var56, var53);
                                            }
                                        }
                                    }
                                    if (NIL != module0004.f104(var54, $g5062$.getDynamicValue(var37), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        module0084.f5762(var38, (SubLObject)$ic34$, var53);
                                    }
                                }
                                var41_46 = (SubLObject)makeBoolean(NIL == var44_48);
                            }
                        }
                        finally {
                            final SubLObject var19_56 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var37);
                                if (NIL != var52) {
                                    module0158.f10319(var52);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var19_56, var37);
                            }
                        }
                    }
                    var48 = (SubLObject)makeBoolean(NIL == var51);
                }
            }
            SubLObject var63 = f39714(var36, var15);
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL != var63) {
                module0084.f5762(var38, (SubLObject)$ic32$, var64);
                var63 = var63.rest();
                var64 = var63.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var45, var37);
            module0147.$g2094$.rebind(var44, var37);
            module0147.$g2095$.rebind(var43, var37);
        }
        return module0084.f5780(var38);
    }
    
    public static SubLObject f39715(final SubLObject var58, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = $g5058$.getDynamicValue();
        }
        final SubLObject var59 = module0055.f4017();
        final SubLObject var60 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0055.f4021(var58, var59);
        while (NIL == module0055.f4019(var59)) {
            final SubLObject var61 = module0055.f4023(var59);
            final SubLObject var62 = f39712(var61, var15);
            module0067.f4886(var60, var61, var62);
            SubLObject var64;
            final SubLObject var63 = var64 = conses_high.assoc((SubLObject)$ic33$, var62, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).rest();
            SubLObject var65 = (SubLObject)NIL;
            var65 = var64.first();
            while (NIL != var64) {
                final SubLObject var66 = module0289.f19396(var65);
                final SubLObject var67 = module0205.f13204(var66, (SubLObject)UNPROVIDED);
                if ($ic36$ == module0067.f4884(var60, var67, (SubLObject)$ic36$)) {
                    module0055.f4021(var67, var59);
                }
                var64 = var64.rest();
                var65 = var64.first();
            }
        }
        return module0084.f5780(var60);
    }
    
    public static SubLObject f39716(final SubLObject var62, final SubLObject var67, final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = conses_high.copy_tree(var62);
        SubLObject var71;
        for (var71 = module0066.f4838(module0067.f4891(var67)); NIL == module0066.f4841(var71); var71 = module0066.f4840(var71)) {
            var69.resetMultipleValues();
            final SubLObject var72 = module0066.f4839(var71);
            final SubLObject var73 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            if (NIL != assertion_handles_oc.f11035(var72)) {
                final SubLObject var74 = module0289.f19401(var72);
                final SubLObject var75 = (SubLObject)ConsesLow.list((SubLObject)$ic38$, var73, (SubLObject)$ic39$, var74);
                var70 = module0035.f2457(var70, var72, var75);
            }
            else {
                var70 = module0035.f2457(var70, var72, var73);
            }
        }
        module0066.f4842(var71);
        for (var71 = module0066.f4838(module0067.f4891(var68)); NIL == module0066.f4841(var71); var71 = module0066.f4840(var71)) {
            var69.resetMultipleValues();
            final SubLObject var76 = module0066.f4839(var71);
            final SubLObject var77 = var69.secondMultipleValue();
            var69.resetMultipleValues();
            var70 = module0035.f2457(var70, var76, var77);
        }
        module0066.f4842(var71);
        return var70;
    }
    
    public static SubLObject f39717(final SubLObject var75, final SubLObject var35, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = $g5058$.getDynamicValue();
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        final SubLObject var77 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var78 = module0202.f12720($ic41$, $g5062$.getDynamicValue(var76), (SubLObject)UNPROVIDED);
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        var79 = module0434.f30578((SubLObject)$ic42$, (SubLObject)ConsesLow.listS($ic43$, var35, (SubLObject)$ic44$), var15, (SubLObject)UNPROVIDED);
        if (NIL == conses_high.member(var35, var79, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            var79 = (SubLObject)ConsesLow.cons(var35, var79);
        }
        var79 = module0202.f12720($ic41$, var79, (SubLObject)UNPROVIDED);
        var80 = (SubLObject)ConsesLow.list($ic45$, (SubLObject)ConsesLow.list($ic46$, (SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic48$, var75)), (SubLObject)ConsesLow.list($ic49$, (SubLObject)$ic47$, var78), (SubLObject)ConsesLow.list($ic49$, (SubLObject)$ic48$, var79));
        SubLObject var82;
        var81 = (var82 = module0434.f30576((SubLObject)ConsesLow.list((SubLObject)$ic47$, (SubLObject)$ic48$, var75), var80, var15, (SubLObject)UNPROVIDED));
        SubLObject var83 = (SubLObject)NIL;
        var83 = var82.first();
        while (NIL != var82) {
            final SubLObject var84 = module0288.f19340(var83, var15);
            module0084.f5762(var77, (SubLObject)$ic34$, var84);
            var82 = var82.rest();
            var83 = var82.first();
        }
        return module0084.f5780(var77);
    }
    
    public static SubLObject f39714(final SubLObject var79, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = $g5058$.getDynamicValue();
        }
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        var81 = module0412.f28668((SubLObject)NIL);
        conses_high.putf(var81, (SubLObject)$ic51$, (SubLObject)$ic52$);
        SubLObject var83;
        var80 = (var83 = module0434.f30576((SubLObject)$ic53$, (SubLObject)ConsesLow.listS($ic45$, (SubLObject)ConsesLow.list($ic43$, (SubLObject)$ic54$, var79), (SubLObject)$ic55$), $ic1$, var81));
        SubLObject var84 = (SubLObject)NIL;
        var84 = var83.first();
        while (NIL != var83) {
            SubLObject var86;
            final SubLObject var85 = var86 = var84;
            SubLObject var87 = (SubLObject)NIL;
            SubLObject var88 = (SubLObject)NIL;
            SubLObject var89 = (SubLObject)NIL;
            SubLObject var90 = (SubLObject)NIL;
            SubLObject var91 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)$ic56$);
            var87 = var86.first();
            var86 = var86.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)$ic56$);
            var88 = var86.first();
            var86 = var86.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)$ic56$);
            var89 = var86.first();
            var86 = var86.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)$ic56$);
            var90 = var86.first();
            var86 = var86.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)$ic56$);
            var91 = var86.first();
            var86 = var86.rest();
            if (NIL == var86) {
                if (var89.equal(var79)) {
                    final SubLObject var92 = module0288.f19340((SubLObject)ConsesLow.list($ic43$, var87, var88), var90);
                    var82 = (SubLObject)ConsesLow.cons(var92, var82);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var85, (SubLObject)$ic56$);
            }
            var83 = var83.rest();
            var84 = var83.first();
        }
        return var82;
    }
    
    public static SubLObject f39718(final SubLObject var75, final SubLObject var90, final SubLObject var30, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = $g5058$.getDynamicValue();
        }
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = (SubLObject)NIL;
        SubLObject var93 = (SubLObject)NIL;
        SubLObject var94 = (SubLObject)NIL;
        final SubLObject var95 = module0147.f9540(var15);
        final SubLObject var96 = module0147.$g2095$.currentBinding(var91);
        final SubLObject var97 = module0147.$g2094$.currentBinding(var91);
        final SubLObject var98 = module0147.$g2096$.currentBinding(var91);
        try {
            module0147.$g2095$.bind(module0147.f9545(var95), var91);
            module0147.$g2094$.bind(module0147.f9546(var95), var91);
            module0147.$g2096$.bind(module0147.f9549(var95), var91);
        }
        finally {
            module0147.$g2096$.rebind(var98, var91);
            module0147.$g2094$.rebind(var97, var91);
            module0147.$g2095$.rebind(var96, var91);
        }
        SubLObject var99 = var92;
        SubLObject var100 = (SubLObject)NIL;
        var100 = var99.first();
        while (NIL != var99) {
            if (var75.equal(conses_high.third(var100))) {
                final SubLObject var101 = var100;
                if (NIL == conses_high.member(var101, var93, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var93 = (SubLObject)ConsesLow.cons(var101, var93);
                }
            }
            var99 = var99.rest();
            var100 = var99.first();
        }
        final SubLObject var102 = f39710(var30, var15);
        final SubLObject var103 = module0035.f2293(var102, (SubLObject)$ic20$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var104 = (SubLObject)NIL;
        SubLObject var105 = var103.first();
        SubLObject var106 = (SubLObject)NIL;
        var106 = var105.first();
        while (NIL != var105) {
            var104 = var106.first();
            if (var104.equal($ic22$)) {
                final SubLObject var107 = conses_high.second(var106);
                final SubLObject var108 = conses_high.third(var106);
                final SubLObject var109 = conses_high.fourth(var106);
                final SubLObject var110 = conses_high.fifth(var106);
                final SubLObject var111 = conses_high.sixth(var106);
                final SubLObject var112 = f39719(var93, (SubLObject)ConsesLow.list(var108, var110));
                final SubLObject var113 = module0067.f4884(var112, var108, (SubLObject)UNPROVIDED);
                final SubLObject var114 = module0067.f4884(var112, var110, (SubLObject)UNPROVIDED);
                if (NIL != var113 && NIL != var114) {
                    SubLObject var25_106 = var113;
                    SubLObject var115 = (SubLObject)NIL;
                    var115 = var25_106.first();
                    while (NIL != var25_106) {
                        if (NIL != module0259.f16854(conses_high.second(var115), var109, var15, (SubLObject)UNPROVIDED)) {
                            SubLObject var25_107 = var114;
                            SubLObject var116 = (SubLObject)NIL;
                            var116 = var25_107.first();
                            while (NIL != var25_107) {
                                if (NIL != module0259.f16854(conses_high.second(var116), var111, var15, (SubLObject)UNPROVIDED)) {
                                    SubLObject var117 = (SubLObject)ConsesLow.list(conses_high.second(var115), var108);
                                    if (NIL == conses_high.member(var117, var94, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var94 = (SubLObject)ConsesLow.cons(var117, var94);
                                    }
                                    var117 = (SubLObject)ConsesLow.list(conses_high.second(var116), var110);
                                    if (NIL == conses_high.member(var117, var94, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var94 = (SubLObject)ConsesLow.cons(var117, var94);
                                    }
                                }
                                var25_107 = var25_107.rest();
                                var116 = var25_107.first();
                            }
                        }
                        var25_106 = var25_106.rest();
                        var115 = var25_106.first();
                    }
                }
            }
            else if (var104.equal($ic24$)) {
                final SubLObject var107 = conses_high.second(var106);
                final SubLObject var118 = conses_high.third(var106);
                final SubLObject var109 = conses_high.fourth(var106);
                final SubLObject var119 = conses_high.fifth(var106);
                final SubLObject var120 = f39719(var93, (SubLObject)ConsesLow.list(var118, var119));
                final SubLObject var121 = module0067.f4884(var120, var118, (SubLObject)UNPROVIDED);
                final SubLObject var122 = module0067.f4884(var120, var119, (SubLObject)UNPROVIDED);
                if (NIL != var121 && NIL != var122) {
                    SubLObject var25_108 = var121;
                    SubLObject var123 = (SubLObject)NIL;
                    var123 = var25_108.first();
                    while (NIL != var25_108) {
                        if (NIL != module0259.f16854(conses_high.second(var123), var107, var15, (SubLObject)UNPROVIDED)) {
                            SubLObject var25_109 = var122;
                            SubLObject var124 = (SubLObject)NIL;
                            var124 = var25_109.first();
                            while (NIL != var25_109) {
                                if (NIL != module0259.f16854(conses_high.second(var124), var109, var15, (SubLObject)UNPROVIDED)) {
                                    SubLObject var125 = (SubLObject)ConsesLow.list(conses_high.second(var123), var118);
                                    if (NIL == conses_high.member(var125, var94, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var94 = (SubLObject)ConsesLow.cons(var125, var94);
                                    }
                                    var125 = (SubLObject)ConsesLow.list(conses_high.second(var124), var119);
                                    if (NIL == conses_high.member(var125, var94, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var94 = (SubLObject)ConsesLow.cons(var125, var94);
                                    }
                                }
                                var25_109 = var25_109.rest();
                                var124 = var25_109.first();
                            }
                        }
                        var25_108 = var25_108.rest();
                        var123 = var25_108.first();
                    }
                }
            }
            var105 = var105.rest();
            var106 = var105.first();
        }
        return var94;
    }
    
    public static SubLObject f39719(final SubLObject var114, final SubLObject var115) {
        final SubLObject var116 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var117 = var115;
        SubLObject var118 = (SubLObject)NIL;
        var118 = var117.first();
        while (NIL != var117) {
            SubLObject var25_117 = var114;
            SubLObject var119 = (SubLObject)NIL;
            var119 = var25_117.first();
            while (NIL != var25_117) {
                if (var119.first().equalp(var118)) {
                    module0084.f5762(var116, var118, var119);
                }
                var25_117 = var25_117.rest();
                var119 = var25_117.first();
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        return var116;
    }
    
    public static SubLObject f39720() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0651", "f39707", "WITH-ROLE-PLAYER-INSTANCE-LEVEL-RELATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0651", "f39708", "WITH-SUB-SITUATION-INSTANCE-LEVEL-RELATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0651", "f39709", "WITH-ROLE-PLAYER-TYPE-LEVEL-RELATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39710", "GET-SCRIPT-GRAPH-INFO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39711", "GET-ROLE-PLAYER-EQUIVALENCES-FOR-PRED-AND-SCRIPT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39712", "GET-GRAPH-FOR-SCRIPT-INSTANCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39713", "S#43596", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39715", "GET-COMPLETE-GRAPH-FOR-SCRIPT-INSTANCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39716", "AUGMENT-COMPLETE-GRAPH-FOR-SCRIPT-INSTANCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39717", "GET-GRAPH-FOR-SCRIPT-ROLE-PLAYER-INSTANCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39714", "GET-ANCESTOR-NODES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39718", "GET-ROLE-PLAYER-EQUIVALENCES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0651", "f39719", "S#43597", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39721() {
        $g5058$ = SubLFiles.defparameter("*SCRIPT-INSTANCE-EDITOR-MT*", $ic1$);
        $g5059$ = SubLFiles.deflexical("S#43598", (SubLObject)$ic2$);
        $g5060$ = SubLFiles.defparameter("S#43599", $g5059$.getGlobalValue());
        $g5061$ = SubLFiles.deflexical("S#43600", (SubLObject)$ic3$);
        $g5062$ = SubLFiles.defparameter("S#43601", $g5061$.getGlobalValue());
        $g5063$ = SubLFiles.deflexical("S#43602", (SubLObject)$ic4$);
        $g5064$ = SubLFiles.defparameter("S#43603", $g5063$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f39722() {
        module0002.f38((SubLObject)$ic0$);
        module0002.f38((SubLObject)$ic5$);
        module0002.f38((SubLObject)$ic9$);
        module0002.f38((SubLObject)$ic11$);
        module0002.f38((SubLObject)$ic13$);
        module0002.f38((SubLObject)$ic21$);
        module0002.f38((SubLObject)$ic27$);
        module0002.f38((SubLObject)$ic35$);
        module0002.f38((SubLObject)$ic37$);
        module0002.f38((SubLObject)$ic40$);
        module0002.f38((SubLObject)$ic50$);
        module0002.f38((SubLObject)$ic57$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f39720();
    }
    
    public void initializeVariables() {
        f39721();
    }
    
    public void runTopLevelForms() {
        f39722();
    }
    
    static {
        me = (SubLFile)new module0651();
        $g5058$ = null;
        $g5059$ = null;
        $g5060$ = null;
        $g5061$ = null;
        $g5062$ = null;
        $g5063$ = null;
        $g5064$ = null;
        $ic0$ = makeSymbol("*SCRIPT-INSTANCE-EDITOR-MT*");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic2$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("firstSubEvents")), constant_handles_oc.f8479((SubLObject)makeString("properSubEvents")), constant_handles_oc.f8479((SubLObject)makeString("lastSubEvents")));
        $ic3$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("perpetrator")), constant_handles_oc.f8479((SubLObject)makeString("hostages")), constant_handles_oc.f8479((SubLObject)makeString("dateOfEvent")), constant_handles_oc.f8479((SubLObject)makeString("losesControl")), constant_handles_oc.f8479((SubLObject)makeString("objectOfControlTransfer")), constant_handles_oc.f8479((SubLObject)makeString("agreeingAgents")), constant_handles_oc.f8479((SubLObject)makeString("ransomDemanded")), constant_handles_oc.f8479((SubLObject)makeString("senderOfInfo")), constant_handles_oc.f8479((SubLObject)makeString("agreementCreated")), constant_handles_oc.f8479((SubLObject)makeString("crimeVictim")), constant_handles_oc.f8479((SubLObject)makeString("eventOccursAt")) });
        $ic4$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("equivRolePlayers")), constant_handles_oc.f8479((SubLObject)makeString("equivRolePlayersOfType")), constant_handles_oc.f8479((SubLObject)makeString("equivalentRolePlayers-SitTypeToSubSitType")), constant_handles_oc.f8479((SubLObject)makeString("equivalentRolePlayers-SitTypeToSubSitType-Unique")), constant_handles_oc.f8479((SubLObject)makeString("equivalentRolePlayers-SubSitTypeToSubSitType")), constant_handles_oc.f8479((SubLObject)makeString("equivalentRolePlayers-SubSitTypeToSubSitType-Unique")), constant_handles_oc.f8479((SubLObject)makeString("equivalentRolePlayersOfType-SubSitTypeToSubSitType")));
        $ic5$ = makeSymbol("WITH-ROLE-PLAYER-INSTANCE-LEVEL-RELATIONS");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#43604", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = makeSymbol("CLET");
        $ic8$ = makeSymbol("S#43601", "CYC");
        $ic9$ = makeSymbol("WITH-SUB-SITUATION-INSTANCE-LEVEL-RELATIONS");
        $ic10$ = makeSymbol("S#43599", "CYC");
        $ic11$ = makeSymbol("WITH-ROLE-PLAYER-TYPE-LEVEL-RELATIONS");
        $ic12$ = makeSymbol("S#43603", "CYC");
        $ic13$ = makeSymbol("GET-SCRIPT-GRAPH-INFO");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("SituationType"));
        $ic15$ = makeString("Argument not a situation type");
        $ic16$ = makeKeyword("SUB-EVT-TYPE");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("properSubSituationTypes"));
        $ic18$ = ConsesLow.list((SubLObject)makeKeyword("SUB-EVT-TYPE"));
        $ic19$ = makeKeyword("SUB-EVENT-TYPES");
        $ic20$ = makeKeyword("ROLE-PLAYER-EQUIVALENCES");
        $ic21$ = makeSymbol("GET-ROLE-PLAYER-EQUIVALENCES-FOR-PRED-AND-SCRIPT");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("equivalentRolePlayers-SubSitTypeToSubSitType"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("?SUB-SIT-TYPE-1"), (SubLObject)makeSymbol("?SIT-ROLE-1"), (SubLObject)makeSymbol("?SUB-SIT-TYPE-2"), (SubLObject)makeSymbol("?SUB-SIT-ROLE-2"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("equivalentRolePlayers-SitTypeToSubSitType"));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("?SIT-ROLE"), (SubLObject)makeSymbol("?SUB-SIT-TYPE"), (SubLObject)makeSymbol("?SUB-SIT-ROLE"));
        $ic26$ = makeSymbol("CANONICALIZE-TERM");
        $ic27$ = makeSymbol("GET-GRAPH-FOR-SCRIPT-INSTANCE");
        $ic28$ = makeString("~A is not an individual.");
        $ic29$ = makeKeyword("GENLS");
        $ic30$ = makeKeyword("SPEC");
        $ic31$ = makeKeyword("GAF");
        $ic32$ = makeKeyword("PARENT-EVENTS");
        $ic33$ = makeKeyword("SUB-EVENTS");
        $ic34$ = makeKeyword("ROLE-PLAYERS");
        $ic35$ = makeSymbol("GET-COMPLETE-GRAPH-FOR-SCRIPT-INSTANCE");
        $ic36$ = makeKeyword("NOT-FOUND");
        $ic37$ = makeSymbol("AUGMENT-COMPLETE-GRAPH-FOR-SCRIPT-INSTANCE");
        $ic38$ = makeKeyword("SENTENCE");
        $ic39$ = makeKeyword("ELMT");
        $ic40$ = makeSymbol("GET-GRAPH-FOR-SCRIPT-ROLE-PLAYER-INSTANCE");
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic42$ = makeKeyword("EVT");
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("properSubEvents"));
        $ic44$ = ConsesLow.list((SubLObject)makeKeyword("EVT"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("assertedSentence"));
        $ic47$ = makeSymbol("?PRED");
        $ic48$ = makeSymbol("?SUB-EVENT");
        $ic49$ = constant_handles_oc.f8479((SubLObject)makeString("elementOf"));
        $ic50$ = makeSymbol("GET-ANCESTOR-NODES");
        $ic51$ = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $ic52$ = makeKeyword("COMPUTE-UNION");
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("?SUB"), (SubLObject)makeSymbol("?SUB1"), (SubLObject)makeSymbol("?SUB2"), (SubLObject)makeSymbol("?SUB-MT"), (SubLObject)makeSymbol("?SUB2-MT"));
        $ic54$ = makeSymbol("?SUB1");
        $ic55$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("join-left")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)makeSymbol("?SUB-MT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("properSubEvents")), (SubLObject)makeSymbol("?SUB"), (SubLObject)makeSymbol("?SUB1"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted")), (SubLObject)makeSymbol("?SUB2-MT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("properSubEvents")), (SubLObject)makeSymbol("?SUB1"), (SubLObject)makeSymbol("?SUB2")))));
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("S#43605", "CYC"), (SubLObject)makeSymbol("S#43606", "CYC"), (SubLObject)makeSymbol("S#143", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#34275", "CYC"));
        $ic57$ = makeSymbol("GET-ROLE-PLAYER-EQUIVALENCES");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 306 ms
	
	Decompiled with Procyon 0.5.32.
*/