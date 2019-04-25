package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0556 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0556";
    public static final String myFingerPrint = "acecc64527eef21f3afaf979e3727f64f1316fccffa8a47f6763b6d93b02efad";
    private static SubLSymbol $g4012$;
    private static SubLSymbol $g4013$;
    private static SubLSymbol $g4014$;
    private static SubLSymbol $g4015$;
    private static SubLSymbol $g4016$;
    private static SubLSymbol $g4017$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLFloat $ic17$;
    private static final SubLFloat $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    
    public static SubLObject f34236(final SubLObject var1) {
        return module0035.f2169(var1, $g4012$.getGlobalValue());
    }
    
    public static SubLObject f34237(final SubLObject var2, final SubLObject var3) {
        if (var2 == $ic1$) {
            return var3;
        }
        if (var3 == $ic1$) {
            return var2;
        }
        if (var2.eql(var3)) {
            return var2;
        }
        if (NIL != module0035.f2385(var2, var3, $g4012$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED)) {
            return var3;
        }
        return var2;
    }
    
    public static SubLObject f34238(final SubLObject var4) {
        assert NIL != module0173.f10955(var4) : var4;
        if (NIL == $g4013$.getGlobalValue()) {
            return (SubLObject)$ic1$;
        }
        if (NIL != module0077.f5320(var4, $g4013$.getGlobalValue())) {
            return (SubLObject)$ic8$;
        }
        if (NIL != module0269.f17705(var4)) {
            if (NIL != module0077.f5320(var4, $g4014$.getGlobalValue())) {
                return (SubLObject)$ic8$;
            }
            if (NIL != module0077.f5320(var4, $g4015$.getGlobalValue())) {
                return (SubLObject)$ic9$;
            }
            return (SubLObject)$ic10$;
        }
        else {
            if (NIL == module0226.f14792(var4)) {
                return (SubLObject)$ic10$;
            }
            if (NIL != module0077.f5320(var4, $g4016$.getGlobalValue())) {
                return (SubLObject)$ic8$;
            }
            if (NIL != module0077.f5320(var4, $g4017$.getGlobalValue())) {
                return (SubLObject)$ic9$;
            }
            return (SubLObject)$ic10$;
        }
    }
    
    public static SubLObject f34239(final SubLObject var5) {
        return f34240(var5, (SubLObject)$ic1$);
    }
    
    public static SubLObject f34240(final SubLObject var1, SubLObject var6) {
        if (var6 != $ic10$) {
            if (NIL != module0173.f10955(var1)) {
                var6 = f34237(var6, f34238(var1));
            }
            else if (var1.isCons()) {
                var6 = f34240(var1.first(), var6);
                var6 = f34240(var1.rest(), var6);
            }
            else if (NIL != assertion_handles_oc.f11035(var1)) {
                var6 = f34240(module0178.f11289(var1), var6);
            }
        }
        return var6;
    }
    
    public static SubLObject f34241(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)T;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = Numbers.integerDivide(module0173.f10962(), (SubLObject)FIVE_INTEGER);
        final SubLObject var10 = Hashtables.make_hash_table(var9, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0139.$g1630$.getDynamicValue(var8);
        final SubLObject var12 = module0139.$g1631$.currentBinding(var8);
        final SubLObject var13 = module0139.$g1632$.currentBinding(var8);
        final SubLObject var14 = module0139.$g1630$.currentBinding(var8);
        final SubLObject var15 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var16 = module0147.$g2095$.currentBinding(var8);
        try {
            module0139.$g1631$.bind(module0139.f9015(var11, (SubLObject)TEN_INTEGER), var8);
            module0139.$g1632$.bind(module0139.f9016(var11), var8);
            module0139.$g1630$.bind((SubLObject)T, var8);
            module0147.$g2094$.bind((SubLObject)$ic11$, var8);
            module0147.$g2095$.bind($ic12$, var8);
            final SubLObject var17 = (SubLObject)$ic13$;
            final SubLObject var18 = module0173.f10962();
            SubLObject var19 = (SubLObject)ZERO_INTEGER;
            final SubLObject var12_20 = module0012.$g75$.currentBinding(var8);
            final SubLObject var13_21 = module0012.$g76$.currentBinding(var8);
            final SubLObject var14_22 = module0012.$g77$.currentBinding(var8);
            final SubLObject var15_23 = module0012.$g78$.currentBinding(var8);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
                module0012.$g76$.bind((SubLObject)NIL, var8);
                module0012.$g77$.bind((SubLObject)T, var8);
                module0012.$g78$.bind(Time.get_universal_time(), var8);
                module0012.f478(var17);
                SubLObject var20 = module0173.f10961();
                SubLObject var21 = (SubLObject)NIL;
                var21 = var20.first();
                while (NIL != var20) {
                    final SubLObject var22 = var21;
                    if (NIL == module0065.f4772(var22, (SubLObject)$ic14$)) {
                        final SubLObject var27_28 = var22;
                        if (NIL == module0065.f4775(var27_28, (SubLObject)$ic14$)) {
                            final SubLObject var23 = module0065.f4740(var27_28);
                            final SubLObject var24 = (SubLObject)NIL;
                            SubLObject var25;
                            SubLObject var26;
                            SubLObject var27;
                            SubLObject var28;
                            SubLObject var24_35;
                            SubLObject var29;
                            SubLObject var30;
                            for (var25 = Sequences.length(var23), var26 = (SubLObject)NIL, var26 = (SubLObject)ZERO_INTEGER; var26.numL(var25); var26 = Numbers.add(var26, (SubLObject)ONE_INTEGER)) {
                                var27 = ((NIL != var24) ? Numbers.subtract(var25, var26, (SubLObject)ONE_INTEGER) : var26);
                                var28 = Vectors.aref(var23, var27);
                                if (NIL == module0065.f4749(var28) || NIL == module0065.f4773((SubLObject)$ic14$)) {
                                    if (NIL != module0065.f4749(var28)) {
                                        var28 = (SubLObject)$ic14$;
                                    }
                                    var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var19, var18);
                                    var29 = (var24_35 = (SubLObject)((NIL != module0269.f17705(var28)) ? module0256.f16531(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : ((NIL != var7) ? module0259.f16840(var28, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL)));
                                    var30 = (SubLObject)NIL;
                                    var30 = var24_35.first();
                                    while (NIL != var24_35) {
                                        if (NIL != module0173.f10955(var30)) {
                                            Hashtables.sethash(var30, var10, Numbers.add(Hashtables.gethash_without_values(var30, var10, (SubLObject)ZERO_INTEGER), (SubLObject)ONE_INTEGER));
                                        }
                                        var24_35 = var24_35.rest();
                                        var30 = var24_35.first();
                                    }
                                }
                            }
                        }
                        final SubLObject var37_38 = var22;
                        if (NIL == module0065.f4777(var37_38) || NIL == module0065.f4773((SubLObject)$ic14$)) {
                            final SubLObject var31 = module0065.f4738(var37_38);
                            SubLObject var32 = module0065.f4739(var37_38);
                            final SubLObject var33 = module0065.f4734(var37_38);
                            final SubLObject var34 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic14$)) ? NIL : $ic14$);
                            while (var32.numL(var33)) {
                                final SubLObject var35 = Hashtables.gethash_without_values(var32, var31, var34);
                                if (NIL == module0065.f4773((SubLObject)$ic14$) || NIL == module0065.f4749(var35)) {
                                    var19 = Numbers.add(var19, (SubLObject)ONE_INTEGER);
                                    module0012.note_percent_progress(var19, var18);
                                    SubLObject var24_36;
                                    final SubLObject var36 = var24_36 = (SubLObject)((NIL != module0269.f17705(var35)) ? module0256.f16531(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : ((NIL != var7) ? module0259.f16840(var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL));
                                    SubLObject var37 = (SubLObject)NIL;
                                    var37 = var24_36.first();
                                    while (NIL != var24_36) {
                                        if (NIL != module0173.f10955(var37)) {
                                            Hashtables.sethash(var37, var10, Numbers.add(Hashtables.gethash_without_values(var37, var10, (SubLObject)ZERO_INTEGER), (SubLObject)ONE_INTEGER));
                                        }
                                        var24_36 = var24_36.rest();
                                        var37 = var24_36.first();
                                    }
                                }
                                var32 = Numbers.add(var32, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                    var20 = var20.rest();
                    var21 = var20.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var15_23, var8);
                module0012.$g77$.rebind(var14_22, var8);
                module0012.$g76$.rebind(var13_21, var8);
                module0012.$g75$.rebind(var12_20, var8);
            }
        }
        finally {
            module0147.$g2095$.rebind(var16, var8);
            module0147.$g2094$.rebind(var15, var8);
            module0139.$g1630$.rebind(var14, var8);
            module0139.$g1632$.rebind(var13, var8);
            module0139.$g1631$.rebind(var12, var8);
        }
        SubLObject var38 = module0030.f1630(var10);
        var38 = Sort.sort(var38, Symbols.symbol_function((SubLObject)$ic15$), Symbols.symbol_function((SubLObject)$ic16$));
        SubLObject var39 = (SubLObject)ZERO_INTEGER;
        SubLObject var40 = var38;
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            var39 = Numbers.add(var39, var41.rest());
            var40 = var40.rest();
            var41 = var40.first();
        }
        return Values.values(var38, var39);
    }
    
    public static SubLObject f34242(final SubLObject var43, SubLObject var46, SubLObject var47) {
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)$ic17$;
        }
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)$ic18$;
        }
        SubLObject var48 = (SubLObject)ZERO_INTEGER;
        SubLObject var49 = var43;
        SubLObject var50 = (SubLObject)NIL;
        var50 = var49.first();
        while (NIL != var49) {
            var48 = Numbers.add(var48, var50.rest());
            var49 = var49.rest();
            var50 = var49.first();
        }
        SubLObject var51 = (SubLObject)NIL;
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        final SubLObject var54 = Numbers.floor(Numbers.multiply(var48, var46), (SubLObject)UNPROVIDED);
        final SubLObject var55 = Numbers.floor(Numbers.multiply(var48, var47), (SubLObject)UNPROVIDED);
        SubLObject var56 = (SubLObject)$ic8$;
        SubLObject var57 = (SubLObject)ZERO_INTEGER;
        SubLObject var58 = var43;
        SubLObject var59 = (SubLObject)NIL;
        var59 = var58.first();
        while (NIL != var58) {
            SubLObject var61;
            final SubLObject var60 = var61 = var59;
            SubLObject var62 = (SubLObject)NIL;
            SubLObject var63 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)$ic19$);
            var62 = var61.first();
            var61 = (var63 = var61.rest());
            final SubLObject var64 = var56;
            if (var64.eql((SubLObject)$ic10$)) {
                var53 = (SubLObject)ConsesLow.cons(var62, var53);
            }
            else if (var64.eql((SubLObject)$ic9$)) {
                var52 = (SubLObject)ConsesLow.cons(var62, var52);
                var57 = Numbers.add(var57, var63);
                if (var57.numG(var55)) {
                    var56 = (SubLObject)$ic10$;
                }
            }
            else if (var64.eql((SubLObject)$ic8$)) {
                var51 = (SubLObject)ConsesLow.cons(var62, var51);
                var57 = Numbers.add(var57, var63);
                if (var57.numG(var54)) {
                    var56 = (SubLObject)$ic9$;
                }
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        var51 = Sequences.nreverse(var51);
        var52 = Sequences.nreverse(var52);
        var53 = Sequences.nreverse(var53);
        return Values.values((SubLObject)ConsesLow.list(var51, var52, var53), (SubLObject)ConsesLow.list(Sequences.length(var51), Sequences.length(var52), Sequences.length(var53)));
    }
    
    public static SubLObject f34243(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var58, var58, (SubLObject)$ic20$);
        var60 = var58.first();
        SubLObject var63 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var58, (SubLObject)$ic20$);
        var61 = var63.first();
        var63 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var58, (SubLObject)$ic20$);
        var62 = var63.first();
        var63 = var63.rest();
        if (NIL == var63) {
            final SubLObject var64 = module0078.f5367(var60, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            final SubLObject var65 = module0078.f5367(var61, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            SubLObject var66 = (SubLObject)NIL;
            SubLObject var67 = (SubLObject)NIL;
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = module0147.$g2094$.currentBinding(var59);
            final SubLObject var70 = module0147.$g2095$.currentBinding(var59);
            try {
                module0147.$g2094$.bind((SubLObject)$ic11$, var59);
                module0147.$g2095$.bind($ic12$, var59);
                final SubLObject var71 = (SubLObject)$ic21$;
                final SubLObject var72 = module0173.f10962();
                SubLObject var73 = (SubLObject)ZERO_INTEGER;
                final SubLObject var12_69 = module0012.$g75$.currentBinding(var59);
                final SubLObject var13_70 = module0012.$g76$.currentBinding(var59);
                final SubLObject var74 = module0012.$g77$.currentBinding(var59);
                final SubLObject var75 = module0012.$g78$.currentBinding(var59);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var59);
                    module0012.$g76$.bind((SubLObject)NIL, var59);
                    module0012.$g77$.bind((SubLObject)T, var59);
                    module0012.$g78$.bind(Time.get_universal_time(), var59);
                    module0012.f478(var71);
                    SubLObject var76 = module0173.f10961();
                    SubLObject var77 = (SubLObject)NIL;
                    var77 = var76.first();
                    while (NIL != var76) {
                        final SubLObject var78 = var77;
                        if (NIL == module0065.f4772(var78, (SubLObject)$ic14$)) {
                            final SubLObject var27_71 = var78;
                            if (NIL == module0065.f4775(var27_71, (SubLObject)$ic14$)) {
                                final SubLObject var79 = module0065.f4740(var27_71);
                                final SubLObject var80 = (SubLObject)NIL;
                                SubLObject var81;
                                SubLObject var82;
                                SubLObject var83;
                                SubLObject var84;
                                SubLObject var85;
                                SubLObject var86;
                                SubLObject var87;
                                SubLObject var88;
                                SubLObject var89;
                                SubLObject var90;
                                SubLObject var91;
                                SubLObject var92;
                                for (var81 = Sequences.length(var79), var82 = (SubLObject)NIL, var82 = (SubLObject)ZERO_INTEGER; var82.numL(var81); var82 = Numbers.add(var82, (SubLObject)ONE_INTEGER)) {
                                    var83 = ((NIL != var80) ? Numbers.subtract(var81, var82, (SubLObject)ONE_INTEGER) : var82);
                                    var84 = Vectors.aref(var79, var83);
                                    if (NIL == module0065.f4749(var84) || NIL == module0065.f4773((SubLObject)$ic14$)) {
                                        if (NIL != module0065.f4749(var84)) {
                                            var84 = (SubLObject)$ic14$;
                                        }
                                        var73 = Numbers.add(var73, (SubLObject)ONE_INTEGER);
                                        module0012.note_percent_progress(var73, var72);
                                        if (NIL != module0226.f14792(var84)) {
                                            var85 = f34244(var84, (SubLObject)UNPROVIDED);
                                            if (NIL != var85) {
                                                var86 = (SubLObject)$ic8$;
                                                for (var87 = (SubLObject)NIL, var88 = (SubLObject)NIL, var88 = var85; NIL == var87 && NIL != var88; var88 = var88.rest()) {
                                                    var89 = var88.first();
                                                    var90 = (SubLObject)NIL;
                                                    if (NIL != module0077.f5320(var89, var64)) {
                                                        var90 = (SubLObject)$ic8$;
                                                    }
                                                    else if (NIL != module0077.f5320(var89, var65)) {
                                                        var90 = (SubLObject)$ic9$;
                                                    }
                                                    else {
                                                        var90 = (SubLObject)$ic10$;
                                                    }
                                                    var91 = var90;
                                                    if (var91.eql((SubLObject)$ic10$)) {
                                                        var86 = (SubLObject)$ic10$;
                                                        var87 = (SubLObject)T;
                                                    }
                                                    else if (var91.eql((SubLObject)$ic9$)) {
                                                        var86 = (SubLObject)$ic9$;
                                                    }
                                                }
                                                var92 = var86;
                                                if (var92.eql((SubLObject)$ic8$)) {
                                                    var66 = (SubLObject)ConsesLow.cons(var84, var66);
                                                }
                                                else if (var92.eql((SubLObject)$ic9$)) {
                                                    var67 = (SubLObject)ConsesLow.cons(var84, var67);
                                                }
                                                else if (var92.eql((SubLObject)$ic10$)) {
                                                    var68 = (SubLObject)ConsesLow.cons(var84, var68);
                                                }
                                            }
                                            else {
                                                var68 = (SubLObject)ConsesLow.cons(var84, var68);
                                            }
                                        }
                                    }
                                }
                            }
                            final SubLObject var37_78 = var78;
                            if (NIL == module0065.f4777(var37_78) || NIL == module0065.f4773((SubLObject)$ic14$)) {
                                final SubLObject var93 = module0065.f4738(var37_78);
                                SubLObject var94 = module0065.f4739(var37_78);
                                final SubLObject var95 = module0065.f4734(var37_78);
                                final SubLObject var96 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic14$)) ? NIL : $ic14$);
                                while (var94.numL(var95)) {
                                    final SubLObject var97 = Hashtables.gethash_without_values(var94, var93, var96);
                                    if (NIL == module0065.f4773((SubLObject)$ic14$) || NIL == module0065.f4749(var97)) {
                                        var73 = Numbers.add(var73, (SubLObject)ONE_INTEGER);
                                        module0012.note_percent_progress(var73, var72);
                                        if (NIL != module0226.f14792(var97)) {
                                            final SubLObject var98 = f34244(var97, (SubLObject)UNPROVIDED);
                                            if (NIL != var98) {
                                                SubLObject var99 = (SubLObject)$ic8$;
                                                SubLObject var100;
                                                SubLObject var101;
                                                SubLObject var102;
                                                SubLObject var103;
                                                SubLObject var104;
                                                for (var100 = (SubLObject)NIL, var101 = (SubLObject)NIL, var101 = var98; NIL == var100 && NIL != var101; var101 = var101.rest()) {
                                                    var102 = var101.first();
                                                    var103 = (SubLObject)NIL;
                                                    if (NIL != module0077.f5320(var102, var64)) {
                                                        var103 = (SubLObject)$ic8$;
                                                    }
                                                    else if (NIL != module0077.f5320(var102, var65)) {
                                                        var103 = (SubLObject)$ic9$;
                                                    }
                                                    else {
                                                        var103 = (SubLObject)$ic10$;
                                                    }
                                                    var104 = var103;
                                                    if (var104.eql((SubLObject)$ic10$)) {
                                                        var99 = (SubLObject)$ic10$;
                                                        var100 = (SubLObject)T;
                                                    }
                                                    else if (var104.eql((SubLObject)$ic9$)) {
                                                        var99 = (SubLObject)$ic9$;
                                                    }
                                                }
                                                final SubLObject var105 = var99;
                                                if (var105.eql((SubLObject)$ic8$)) {
                                                    var66 = (SubLObject)ConsesLow.cons(var97, var66);
                                                }
                                                else if (var105.eql((SubLObject)$ic9$)) {
                                                    var67 = (SubLObject)ConsesLow.cons(var97, var67);
                                                }
                                                else if (var105.eql((SubLObject)$ic10$)) {
                                                    var68 = (SubLObject)ConsesLow.cons(var97, var68);
                                                }
                                            }
                                            else {
                                                var68 = (SubLObject)ConsesLow.cons(var97, var68);
                                            }
                                        }
                                    }
                                    var94 = Numbers.add(var94, (SubLObject)ONE_INTEGER);
                                }
                            }
                        }
                        var76 = var76.rest();
                        var77 = var76.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var75, var59);
                    module0012.$g77$.rebind(var74, var59);
                    module0012.$g76$.rebind(var13_70, var59);
                    module0012.$g75$.rebind(var12_69, var59);
                }
            }
            finally {
                module0147.$g2095$.rebind(var70, var59);
                module0147.$g2094$.rebind(var69, var59);
            }
            var66 = Sort.sort(var66, Symbols.symbol_function((SubLObject)$ic15$), Symbols.symbol_function((SubLObject)$ic22$));
            var67 = Sort.sort(var67, Symbols.symbol_function((SubLObject)$ic15$), Symbols.symbol_function((SubLObject)$ic22$));
            var68 = Sort.sort(var68, Symbols.symbol_function((SubLObject)$ic15$), Symbols.symbol_function((SubLObject)$ic22$));
            return Values.values((SubLObject)ConsesLow.list(var66, var67, var68), (SubLObject)ConsesLow.list(Sequences.length(var66), Sequences.length(var67), Sequences.length(var68)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var58, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34244(final SubLObject var72, SubLObject var79) {
        if (var79 == UNPROVIDED) {
            var79 = (SubLObject)NIL;
        }
        final SubLObject var80 = module0226.f14919(var72, var79);
        final SubLObject var81 = module0226.f14950(var72, var79);
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        if (NIL != module0269.f17708(var72)) {
            var82 = module0226.f14990(var72, var79);
            var83 = module0226.f15014(var72, var79, (SubLObject)UNPROVIDED);
        }
        return ConsesLow.nconc(new SubLObject[] { var80, var81, var82, var83 });
    }
    
    public static SubLObject f34245() {
        return module0259.f16995($ic23$);
    }
    
    public static SubLObject f34246(SubLObject var7, SubLObject var46, SubLObject var47) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)T;
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)$ic17$;
        }
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)$ic18$;
        }
        final SubLObject var48 = f34241(var7);
        final SubLObject var49 = f34242(var48, var46, var47);
        final SubLObject var50 = f34243(var49);
        final SubLObject var51 = f34245();
        return f34247(var49, var50, var51);
    }
    
    public static SubLObject f34248() {
        SubLObject var87 = (SubLObject)NIL;
        if (NIL == module0077.f5302($g4013$.getGlobalValue()) || NIL == module0077.f5302($g4014$.getGlobalValue()) || NIL == module0077.f5302($g4015$.getGlobalValue()) || NIL == module0077.f5302($g4016$.getGlobalValue()) || NIL == module0077.f5302($g4017$.getGlobalValue())) {
            f34246((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var87 = (SubLObject)T;
        }
        return var87;
    }
    
    public static SubLObject f34247(final SubLObject var84, final SubLObject var85, final SubLObject var86) {
        $g4013$.setGlobalValue(module0078.f5367(var86, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        SubLObject var87 = (SubLObject)NIL;
        SubLObject var88 = (SubLObject)NIL;
        SubLObject var89 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var84, (SubLObject)$ic20$);
        var87 = var84.first();
        SubLObject var90 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var90, var84, (SubLObject)$ic20$);
        var88 = var90.first();
        var90 = var90.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var90, var84, (SubLObject)$ic20$);
        var89 = var90.first();
        var90 = var90.rest();
        if (NIL == var90) {
            $g4014$.setGlobalValue(module0078.f5367(var87, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
            $g4015$.setGlobalValue(module0078.f5367(var88, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)$ic20$);
        }
        SubLObject var91 = (SubLObject)NIL;
        SubLObject var92 = (SubLObject)NIL;
        SubLObject var93 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var85, var85, (SubLObject)$ic24$);
        var91 = var85.first();
        SubLObject var94 = var85.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var94, var85, (SubLObject)$ic24$);
        var92 = var94.first();
        var94 = var94.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var94, var85, (SubLObject)$ic24$);
        var93 = var94.first();
        var94 = var94.rest();
        if (NIL == var94) {
            $g4016$.setGlobalValue(module0078.f5367(var91, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
            $g4017$.setGlobalValue(module0078.f5367(var92, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var85, (SubLObject)$ic24$);
        }
        SubLObject var95 = (SubLObject)ZERO_INTEGER;
        SubLObject var96 = (SubLObject)ZERO_INTEGER;
        SubLObject var97 = (SubLObject)ZERO_INTEGER;
        SubLObject var98 = (SubLObject)ZERO_INTEGER;
        SubLObject var99 = (SubLObject)ZERO_INTEGER;
        SubLObject var100 = (SubLObject)ZERO_INTEGER;
        SubLObject var101 = (SubLObject)ZERO_INTEGER;
        final SubLObject var102 = module0077.f5333($g4013$.getGlobalValue());
        SubLObject var103;
        SubLObject var104;
        SubLObject var105;
        for (var103 = module0032.f1741(var102), var104 = (SubLObject)NIL, var104 = module0032.f1742(var103, var102); NIL == module0032.f1744(var103, var104); var104 = module0032.f1743(var104)) {
            var105 = module0032.f1745(var103, var104);
            if (NIL != module0032.f1746(var104, var105)) {
                if (NIL != module0269.f17705(var105)) {
                    if (NIL != module0077.f5320(var105, $g4014$.getGlobalValue())) {
                        var95 = Numbers.add(var95, (SubLObject)ONE_INTEGER);
                        module0077.f5327(var105, $g4014$.getGlobalValue());
                    }
                    else if (NIL != module0077.f5320(var105, $g4015$.getGlobalValue())) {
                        var96 = Numbers.add(var96, (SubLObject)ONE_INTEGER);
                        module0077.f5327(var105, $g4015$.getGlobalValue());
                    }
                    else {
                        var97 = Numbers.add(var97, (SubLObject)ONE_INTEGER);
                    }
                }
                else if (NIL != module0226.f14792(var105)) {
                    if (NIL != module0077.f5320(var105, $g4016$.getGlobalValue())) {
                        var98 = Numbers.add(var98, (SubLObject)ONE_INTEGER);
                        module0077.f5327(var105, $g4016$.getGlobalValue());
                    }
                    else if (NIL != module0077.f5320(var105, $g4017$.getGlobalValue())) {
                        var99 = Numbers.add(var99, (SubLObject)ONE_INTEGER);
                        module0077.f5327(var105, $g4017$.getGlobalValue());
                    }
                    else {
                        var100 = Numbers.add(var100, (SubLObject)ONE_INTEGER);
                    }
                }
                else {
                    var101 = Numbers.add(var101, (SubLObject)ONE_INTEGER);
                }
            }
        }
        final SubLObject var106 = Numbers.add(module0077.f5311($g4013$.getGlobalValue()), module0077.f5311($g4014$.getGlobalValue()), module0077.f5311($g4016$.getGlobalValue()));
        final SubLObject var107 = Numbers.add(module0077.f5311($g4015$.getGlobalValue()), module0077.f5311($g4017$.getGlobalValue()));
        final SubLObject var108 = Numbers.subtract(module0173.f10962(), Numbers.add(var106, var107));
        return Values.values((SubLObject)ConsesLow.list(var106, var107, var108), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var95, var98), (SubLObject)ConsesLow.list(var96, var99), (SubLObject)ConsesLow.list(var97, var100, var101)));
    }
    
    public static SubLObject f34249() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = (SubLObject)ZERO_INTEGER;
        SubLObject var10 = (SubLObject)ZERO_INTEGER;
        SubLObject var11 = (SubLObject)ZERO_INTEGER;
        final SubLObject var12 = assertion_handles_oc.f11010();
        final SubLObject var13 = (SubLObject)$ic25$;
        final SubLObject var14 = module0065.f4733(var12);
        SubLObject var15 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var13) : var13;
        final SubLObject var16 = module0012.$g75$.currentBinding(var8);
        final SubLObject var17 = module0012.$g76$.currentBinding(var8);
        final SubLObject var18 = module0012.$g77$.currentBinding(var8);
        final SubLObject var19 = module0012.$g78$.currentBinding(var8);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var8);
            module0012.$g76$.bind((SubLObject)NIL, var8);
            module0012.$g77$.bind((SubLObject)T, var8);
            module0012.$g78$.bind(Time.get_universal_time(), var8);
            module0012.f478(var13);
            final SubLObject var26_110 = var12;
            if (NIL == module0065.f4772(var26_110, (SubLObject)$ic14$)) {
                final SubLObject var27_111 = var26_110;
                if (NIL == module0065.f4775(var27_111, (SubLObject)$ic14$)) {
                    final SubLObject var20 = module0065.f4740(var27_111);
                    final SubLObject var21 = (SubLObject)NIL;
                    SubLObject var22;
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var25;
                    SubLObject var26;
                    for (var22 = Sequences.length(var20), var23 = (SubLObject)NIL, var23 = (SubLObject)ZERO_INTEGER; var23.numL(var22); var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER)) {
                        var24 = ((NIL != var21) ? Numbers.subtract(var22, var23, (SubLObject)ONE_INTEGER) : var23);
                        var25 = Vectors.aref(var20, var24);
                        if (NIL == module0065.f4749(var25) || NIL == module0065.f4773((SubLObject)$ic14$)) {
                            if (NIL != module0065.f4749(var25)) {
                                var25 = (SubLObject)$ic14$;
                            }
                            module0012.note_percent_progress(var15, var14);
                            var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER);
                            var26 = f34239(var25);
                            if (var26.eql((SubLObject)$ic8$)) {
                                var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
                            }
                            else if (var26.eql((SubLObject)$ic9$)) {
                                var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                            }
                            else if (var26.eql((SubLObject)$ic10$)) {
                                var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var37_113 = var26_110;
                if (NIL == module0065.f4777(var37_113) || NIL == module0065.f4773((SubLObject)$ic14$)) {
                    final SubLObject var27 = module0065.f4738(var37_113);
                    SubLObject var28 = module0065.f4739(var37_113);
                    final SubLObject var29 = module0065.f4734(var37_113);
                    final SubLObject var30 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic14$)) ? NIL : $ic14$);
                    while (var28.numL(var29)) {
                        final SubLObject var31 = Hashtables.gethash_without_values(var28, var27, var30);
                        if (NIL == module0065.f4773((SubLObject)$ic14$) || NIL == module0065.f4749(var31)) {
                            module0012.note_percent_progress(var15, var14);
                            var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER);
                            final SubLObject var32 = f34239(var31);
                            if (var32.eql((SubLObject)$ic8$)) {
                                var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER);
                            }
                            else if (var32.eql((SubLObject)$ic9$)) {
                                var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                            }
                            else if (var32.eql((SubLObject)$ic10$)) {
                                var11 = Numbers.add(var11, (SubLObject)ONE_INTEGER);
                            }
                        }
                        var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var19, var8);
            module0012.$g77$.rebind(var18, var8);
            module0012.$g76$.rebind(var17, var8);
            module0012.$g75$.rebind(var16, var8);
        }
        return (SubLObject)ConsesLow.list(var9, var10, var11);
    }
    
    public static SubLObject f34250() {
        f34248();
        final SubLObject var114 = module0077.f5312($g4013$.getGlobalValue());
        final SubLObject var115 = module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic27$), var114, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var116 = module0077.f5312($g4014$.getGlobalValue());
        final SubLObject var117 = ConsesLow.nconc(var115, var116);
        return module0549.f33908(var117, (SubLObject)$ic28$);
    }
    
    public static SubLObject f34251() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34236", "S#37479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34237", "S#37480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34238", "S#37481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34239", "S#37482", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34240", "S#37483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34241", "S#37484", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34242", "S#37485", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34243", "S#37486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34244", "S#37487", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34245", "S#37488", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34246", "S#37489", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34248", "S#37490", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34247", "S#37491", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34249", "S#37492", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0556", "f34250", "S#37493", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34252() {
        $g4012$ = SubLFiles.deflexical("S#37494", (SubLObject)$ic0$);
        $g4013$ = SubLFiles.deflexical("S#37495", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g4013$.getGlobalValue() : NIL));
        $g4014$ = SubLFiles.deflexical("S#37496", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g4014$.getGlobalValue() : NIL));
        $g4015$ = SubLFiles.deflexical("S#37497", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic4$)) ? $g4015$.getGlobalValue() : NIL));
        $g4016$ = SubLFiles.deflexical("S#37498", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g4016$.getGlobalValue() : NIL));
        $g4017$ = SubLFiles.deflexical("S#37499", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic6$)) ? $g4017$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f34253() {
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0003.f57((SubLObject)$ic4$);
        module0003.f57((SubLObject)$ic5$);
        module0003.f57((SubLObject)$ic6$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f34251();
    }
    
    public void initializeVariables() {
        f34252();
    }
    
    public void runTopLevelForms() {
        f34253();
    }
    
    static {
        me = (SubLFile)new module0556();
        $g4012$ = null;
        $g4013$ = null;
        $g4014$ = null;
        $g4015$ = null;
        $g4016$ = null;
        $g4017$ = null;
        $ic0$ = ConsesLow.list((SubLObject)makeKeyword("UPPER"), (SubLObject)makeKeyword("MIDDLE"), (SubLObject)makeKeyword("LOWER"));
        $ic1$ = makeKeyword("UNKNOWN");
        $ic2$ = makeSymbol("S#37495", "CYC");
        $ic3$ = makeSymbol("S#37496", "CYC");
        $ic4$ = makeSymbol("S#37497", "CYC");
        $ic5$ = makeSymbol("S#37498", "CYC");
        $ic6$ = makeSymbol("S#37499", "CYC");
        $ic7$ = makeSymbol("FORT-P");
        $ic8$ = makeKeyword("UPPER");
        $ic9$ = makeKeyword("MIDDLE");
        $ic10$ = makeKeyword("LOWER");
        $ic11$ = makeSymbol("S#12274", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic13$ = makeString("Computing collection generalization counts");
        $ic14$ = makeKeyword("SKIP");
        $ic15$ = makeSymbol(">");
        $ic16$ = makeSymbol("CDR");
        $ic17$ = (SubLFloat)makeDouble(0.9);
        $ic18$ = (SubLFloat)makeDouble(0.99);
        $ic19$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#10466", "CYC"), (SubLObject)makeSymbol("COUNT"));
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#37500", "CYC"), (SubLObject)makeSymbol("S#37501", "CYC"), (SubLObject)makeSymbol("S#37502", "CYC"));
        $ic21$ = makeString("Computing relation ontology layers");
        $ic22$ = makeSymbol("NUM-INDEX");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("CoreUnionConstant"));
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("S#37503", "CYC"), (SubLObject)makeSymbol("S#37504", "CYC"), (SubLObject)makeSymbol("S#37505", "CYC"));
        $ic25$ = makeString("Computing assertion ontology layer");
        $ic26$ = makeSymbol("STRINGP");
        $ic27$ = makeSymbol("COLLECTION-P");
        $ic28$ = makeKeyword("DESCENDING");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 414 ms
	
	Decompiled with Procyon 0.5.32.
*/