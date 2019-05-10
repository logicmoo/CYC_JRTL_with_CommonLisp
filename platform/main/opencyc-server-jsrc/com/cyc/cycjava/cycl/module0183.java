package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0183 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0183";
    public static final String myFingerPrint = "3fbb1eb65f79d4f142ed4086e879f5f5e2144e18c7ad494d70157ea1e734738d";
    public static SubLSymbol $g2225$;
    public static SubLSymbol $g2226$;
    public static SubLSymbol $g2227$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLInteger $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    
    public static SubLObject f11548(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11_12 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic0$);
            var11_12 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var11_12, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var11_12 == $ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic5$, var7), (SubLObject)$ic3$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f11549(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var23_24 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic6$);
            var23_24 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic6$);
            if (NIL == conses_high.member(var23_24, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var23_24 == $ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic6$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var7), (SubLObject)$ic3$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f11550(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var33_34 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic9$);
            var33_34 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic9$);
            if (NIL == conses_high.member(var33_34, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var33_34 == $ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic9$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var4 = (var13 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var7), (SubLObject)$ic3$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f11551(final SubLObject var36, final SubLObject var37) {
        return module0180.f11447(var36, var37);
    }
    
    public static SubLObject f11552(final SubLObject var36) {
        return module0180.f11451(var36);
    }
    
    public static SubLObject f11553(final SubLObject var38) {
        return module0180.f11452(var38);
    }
    
    public static SubLObject f11554(final SubLObject var36, final SubLObject var37) {
        SubLObject var38 = f11552(var36);
        if (NIL == var38) {
            var38 = f11551(var36, var37);
        }
        return var38;
    }
    
    public static SubLObject f11555(final SubLObject var36) {
        SubLObject var37 = f11552(var36);
        if (NIL == var37) {
            var37 = f11556(var36);
        }
        return var37;
    }
    
    public static SubLObject f11556(final SubLObject var36) {
        final SubLObject var37 = module0179.f11436(var36);
        SubLObject var38 = (SubLObject)NIL;
        if (NIL != module0191.f11995(var37)) {
            var38 = module0180.f11447(var36, var37);
        }
        return var38;
    }
    
    public static SubLObject f11557(final SubLObject var7) {
        final SubLObject var8 = module0180.f11453(var7);
        SubLObject var9 = (SubLObject)NIL;
        if (NIL != deduction_handles_oc.f11659(var8)) {
            var9 = module0188.f11781(var8);
        }
        else if (NIL != module0191.f11952(var8)) {
            var9 = var8;
        }
        return var9;
    }
    
    public static SubLObject f11558(final SubLObject var7) {
        final SubLObject var8 = module0180.f11453(var7);
        SubLObject var9 = (SubLObject)NIL;
        if (NIL != deduction_handles_oc.f11659(var8)) {
            var9 = module0188.f11770(var8);
        }
        return var9;
    }
    
    public static SubLObject f11559(final SubLObject var7) {
        final SubLObject var8 = f11557(var7);
        return (SubLObject)((NIL != module0191.f11952(var8)) ? module0191.f11966(var8) : NIL);
    }
    
    public static SubLObject f11560(final SubLObject var7) {
        final SubLObject var8 = f11557(var7);
        return (SubLObject)((NIL != module0191.f11952(var8)) ? module0191.f11961(var8) : NIL);
    }
    
    public static SubLObject f11561(final SubLObject var7) {
        final SubLObject var8 = f11557(var7);
        return (SubLObject)((NIL != module0191.f11952(var8)) ? module0191.f11972(var8) : NIL);
    }
    
    public static SubLObject f11562(final SubLObject var7) {
        final SubLObject var8 = f11557(var7);
        return (SubLObject)((NIL != module0191.f11952(var8)) ? module0191.f11981(var8) : NIL);
    }
    
    public static SubLObject f11563(final SubLObject var7) {
        return module0205.f13144(f11560(var7));
    }
    
    public static SubLObject f11564(final SubLObject var7) {
        final SubLObject var8 = f11560(var7);
        return (NIL != module0202.f12883(var8, (SubLObject)UNPROVIDED)) ? var8 : module0202.f12782(f11561(var7), var8);
    }
    
    public static SubLObject f11565(final SubLObject var7) {
        final SubLObject var8 = f11563(var7);
        return (NIL != module0202.f12883(var8, (SubLObject)UNPROVIDED)) ? var8 : module0202.f12782(f11561(var7), var8);
    }
    
    public static SubLObject f11566(final SubLObject var7) {
        return module0205.f13144(f11561(var7));
    }
    
    public static SubLObject f11567(final SubLObject var7) {
        return module0202.f12762(f11560(var7));
    }
    
    public static SubLObject f11568(final SubLObject var7) {
        final SubLObject var8 = module0180.f11455(var7);
        return Types.sublisp_null(var8);
    }
    
    public static SubLObject f11569(final SubLObject var7) {
        final SubLObject var8 = module0180.f11453(var7);
        return (SubLObject)makeBoolean(NIL == deduction_handles_oc.f11659(var8));
    }
    
    public static SubLObject f11570(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != f11569(var7) || NIL != f11568(var7)) {
            module0180.f11450(var7);
            var8 = (SubLObject)T;
        }
        return var8;
    }
    
    public static SubLObject f11571(SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)ZERO_INTEGER;
        final SubLObject var46 = module0179.f11398();
        final SubLObject var47 = (SubLObject)$ic11$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var54_55 = var46;
            if (NIL == module0065.f4772(var54_55, (SubLObject)$ic13$)) {
                final SubLObject var56_57 = var54_55;
                if (NIL == module0065.f4775(var56_57, (SubLObject)$ic13$)) {
                    final SubLObject var54 = module0065.f4740(var56_57);
                    final SubLObject var55 = (SubLObject)NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                        var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (NIL == module0065.f4749(var59) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            var45 = Numbers.add(var45, f11572(var59, var43));
                        }
                    }
                }
                final SubLObject var63_64 = var54_55;
                if (NIL == module0065.f4777(var63_64) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var60 = module0065.f4738(var63_64);
                    SubLObject var61 = module0065.f4739(var63_64);
                    final SubLObject var62 = module0065.f4734(var63_64);
                    final SubLObject var63 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            var45 = Numbers.add(var45, f11572(var64, var43));
                        }
                        var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return var45;
    }
    
    public static SubLObject f11572(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLObject var44 = module0180.f11455(var7);
        final SubLObject var45 = module0035.count_if_not((SubLObject)$ic14$, var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (var45.numG((SubLObject)ZERO_INTEGER)) {
            SubLObject var46 = (SubLObject)NIL;
            SubLObject var47 = var44;
            SubLObject var48 = (SubLObject)NIL;
            var48 = var47.first();
            while (NIL != var47) {
                if (NIL != deduction_handles_oc.f11671(var48, var43)) {
                    final SubLObject var49 = var48;
                    if (NIL == conses_high.member(var49, var46, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var46 = (SubLObject)ConsesLow.cons(var49, var46);
                    }
                }
                var47 = var47.rest();
                var48 = var47.first();
            }
            module0180.f11459(var7, var46);
        }
        return var45;
    }
    
    public static SubLObject f11573() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)ZERO_INTEGER;
        final SubLObject var46 = module0179.f11398();
        final SubLObject var47 = (SubLObject)$ic15$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var54_74 = var46;
            if (NIL == module0065.f4772(var54_74, (SubLObject)$ic13$)) {
                final SubLObject var56_75 = var54_74;
                if (NIL == module0065.f4775(var56_75, (SubLObject)$ic13$)) {
                    final SubLObject var54 = module0065.f4740(var56_75);
                    final SubLObject var55 = (SubLObject)NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    SubLObject var60;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                        var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (NIL == module0065.f4749(var59) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            var60 = f11557(var59);
                            if (NIL == module0191.f11956(var60)) {
                                module0180.f11450(var59);
                                var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
                final SubLObject var63_76 = var54_74;
                if (NIL == module0065.f4777(var63_76) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var61 = module0065.f4738(var63_76);
                    SubLObject var62 = module0065.f4739(var63_76);
                    final SubLObject var63 = module0065.f4734(var63_76);
                    final SubLObject var64 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var62.numL(var63)) {
                        final SubLObject var65 = Hashtables.gethash_without_values(var62, var61, var64);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var65)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            final SubLObject var66 = f11557(var65);
                            if (NIL == module0191.f11956(var66)) {
                                module0180.f11450(var65);
                                var45 = Numbers.add(var45, (SubLObject)ONE_INTEGER);
                            }
                        }
                        var62 = Numbers.add(var62, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return var45;
    }
    
    public static SubLObject f11574(final SubLObject var37) {
        return Mapping.mapcar((SubLObject)$ic16$, var37);
    }
    
    public static SubLObject f11575(final SubLObject var77) {
        if (NIL != assertion_handles_oc.f11035(var77)) {
            return var77;
        }
        if (NIL != module0179.f11424(var77)) {
            return var77;
        }
        final SubLObject var78 = f11555(var77);
        return (NIL != var78) ? var78 : var77;
    }
    
    public static SubLObject f11576(final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        return (NIL != $g2225$.getDynamicValue(var38)) ? f11577(var37) : var37;
    }
    
    public static SubLObject f11577(final SubLObject var37) {
        return Mapping.mapcar((SubLObject)$ic17$, var37);
    }
    
    public static SubLObject f11578(final SubLObject var77) {
        return (NIL != module0179.f11424(var77)) ? f11557(var77) : var77;
    }
    
    public static SubLObject f11579(SubLObject var78) {
        if (var78 == UNPROVIDED) {
            var78 = Symbols.symbol_function((SubLObject)$ic18$);
        }
        if (module0179.f11409().numG((SubLObject)ZERO_INTEGER)) {
            final SubLObject var79 = module0179.f11411();
            SubLObject var80;
            SubLObject var81;
            for (var80 = (SubLObject)NIL; NIL == var80; var80 = var81) {
                var81 = module0179.f11443(random.random(var79));
                if (NIL != var81 && NIL != Functions.funcall(var78, var81)) {}
            }
            return var80;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11580(SubLObject var82, SubLObject var83, SubLObject var78) {
        if (var82 == UNPROVIDED) {
            var82 = (SubLObject)$ic19$;
        }
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)NIL;
        }
        if (var78 == UNPROVIDED) {
            var78 = Symbols.symbol_function((SubLObject)$ic18$);
        }
        assert NIL != module0004.f106(var82) : var82;
        if (NIL != var83) {
            SubLObject var84 = (SubLObject)NIL;
            SubLObject var85;
            for (var85 = (SubLObject)NIL, var85 = (SubLObject)ZERO_INTEGER; var85.numL(var82); var85 = Numbers.add(var85, (SubLObject)ONE_INTEGER)) {
                var84 = (SubLObject)ConsesLow.cons(f11579(var78), var84);
            }
            return var84;
        }
        SubLObject var84;
        for (var84 = module0032.f1726(var82, Symbols.symbol_function((SubLObject)EQL)); module0032.f1728(var84).numL(var82); var84 = module0032.f1736(f11579(var78), var84, Symbols.symbol_function((SubLObject)EQL))) {}
        return module0032.f1753(var84);
    }
    
    public static SubLObject f11581(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = module0179.f11415(var7);
        final SubLObject var10 = $g2226$.getDynamicValue(var8);
        if (NIL != var10) {
            var9 = module0065.f4750(var10, var9, (SubLObject)UNPROVIDED);
        }
        return var9;
    }
    
    public static SubLObject f11582(final SubLObject var88) {
        return module0179.f11443(var88);
    }
    
    public static SubLObject f11583(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)$ic22$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f11584(final SubLObject var91) {
        module0069.f4937(module0182.$g2213$.getGlobalValue(), var91);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11585(final SubLObject var91) {
        module0182.$g2213$.setGlobalValue(module0069.f4939(var91));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11586(final SubLObject var7) {
        final SubLObject var8 = f11557(var7);
        return (SubLObject)makeBoolean(!var7.eql(f11552(var8)));
    }
    
    public static SubLObject f11587(final SubLObject var7) {
        final SubLObject var8 = f11558(var7);
        return f11588((SubLObject)ConsesLow.list(var7), var8);
    }
    
    public static SubLObject f11588(final SubLObject var92, final SubLObject var37) {
        SubLObject var93 = module0076.f5294(var92, var37, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var93) {
            SubLObject var94 = var37;
            SubLObject var95 = (SubLObject)NIL;
            var95 = var94.first();
            while (NIL == var93 && NIL != var94) {
                if (NIL != module0179.f11424(var95)) {
                    final SubLObject var96 = (SubLObject)ConsesLow.cons(var95, var92);
                    final SubLObject var97 = f11558(var95);
                    if (NIL != f11588(var96, var97)) {
                        var93 = (SubLObject)T;
                    }
                }
                var94 = var94.rest();
                var95 = var94.first();
            }
        }
        return var93;
    }
    
    public static SubLObject f11589(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        SubLObject var44 = (SubLObject)NIL;
        final SubLObject var45 = module0180.f11455(var7);
        SubLObject var46;
        SubLObject var47;
        SubLObject var48;
        for (var46 = module0032.f1741(var45), var47 = (SubLObject)NIL, var47 = module0032.f1742(var46, var45); NIL == var44 && NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
            var48 = module0032.f1745(var46, var47);
            if (NIL != module0032.f1746(var47, var48) && NIL == deduction_handles_oc.f11671(var48, var43)) {
                var44 = (SubLObject)T;
            }
        }
        return var44;
    }
    
    public static SubLObject f11590(final SubLObject var7, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        for (var44 = (SubLObject)NIL, var45 = (SubLObject)NIL, var45 = module0180.f11454(var7); NIL == var44 && NIL != var45; var45 = var45.rest()) {
            var46 = var45.first();
            if (NIL == deduction_handles_oc.f11671(var46, var43)) {
                var44 = (SubLObject)T;
            }
        }
        return var44;
    }
    
    public static SubLObject f11591(final SubLObject var7) {
        final SubLObject var8 = f11557(var7);
        return (SubLObject)makeBoolean(NIL == module0191.f11956(var8));
    }
    
    public static SubLObject f11592(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = module0180.f11455(var7);
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var10 = module0032.f1741(var9), var11 = (SubLObject)NIL, var11 = module0032.f1742(var10, var9); NIL == var8 && NIL == module0032.f1744(var10, var11); var11 = module0032.f1743(var11)) {
            var12 = module0032.f1745(var10, var11);
            if (NIL != module0032.f1746(var11, var12) && NIL != deduction_handles_oc.f11671(var12, (SubLObject)UNPROVIDED)) {
                var13 = (SubLObject)NIL;
                if (NIL == var13) {
                    var14 = module0188.f11770(var12);
                    var15 = (SubLObject)NIL;
                    var15 = var14.first();
                    while (NIL == var13 && NIL != var14) {
                        if (var15.eql(var7)) {
                            var13 = (SubLObject)T;
                        }
                        var14 = var14.rest();
                        var15 = var14.first();
                    }
                }
                if (NIL == var13) {
                    var8 = (SubLObject)T;
                }
            }
        }
        return var8;
    }
    
    public static SubLObject f11593() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = module0179.f11398();
        final SubLObject var47 = (SubLObject)$ic23$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var54_106 = var46;
            if (NIL == module0065.f4772(var54_106, (SubLObject)$ic13$)) {
                final SubLObject var56_107 = var54_106;
                if (NIL == module0065.f4775(var56_107, (SubLObject)$ic13$)) {
                    final SubLObject var54 = module0065.f4740(var56_107);
                    final SubLObject var55 = (SubLObject)NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                        var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (NIL == module0065.f4749(var59) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11586(var59)) {
                                var45 = (SubLObject)ConsesLow.cons(var59, var45);
                            }
                        }
                    }
                }
                final SubLObject var63_108 = var54_106;
                if (NIL == module0065.f4777(var63_108) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var60 = module0065.f4738(var63_108);
                    SubLObject var61 = module0065.f4739(var63_108);
                    final SubLObject var62 = module0065.f4734(var63_108);
                    final SubLObject var63 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11586(var64)) {
                                var45 = (SubLObject)ConsesLow.cons(var64, var45);
                            }
                        }
                        var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f11594() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = module0179.f11398();
        final SubLObject var47 = (SubLObject)$ic24$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var54_110 = var46;
            if (NIL == module0065.f4772(var54_110, (SubLObject)$ic13$)) {
                final SubLObject var56_111 = var54_110;
                if (NIL == module0065.f4775(var56_111, (SubLObject)$ic13$)) {
                    final SubLObject var54 = module0065.f4740(var56_111);
                    final SubLObject var55 = (SubLObject)NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                        var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (NIL == module0065.f4749(var59) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11587(var59)) {
                                var45 = (SubLObject)ConsesLow.cons(var59, var45);
                            }
                        }
                    }
                }
                final SubLObject var63_112 = var54_110;
                if (NIL == module0065.f4777(var63_112) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var60 = module0065.f4738(var63_112);
                    SubLObject var61 = module0065.f4739(var63_112);
                    final SubLObject var62 = module0065.f4734(var63_112);
                    final SubLObject var63 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11587(var64)) {
                                var45 = (SubLObject)ConsesLow.cons(var64, var45);
                            }
                        }
                        var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f11595() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var46 = (SubLObject)NIL;
        final SubLObject var47 = module0179.f11398();
        final SubLObject var48 = (SubLObject)$ic25$;
        final SubLObject var49 = module0065.f4733(var47);
        SubLObject var50 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var48) : var48;
        final SubLObject var51 = module0012.$g75$.currentBinding(var44);
        final SubLObject var52 = module0012.$g76$.currentBinding(var44);
        final SubLObject var53 = module0012.$g77$.currentBinding(var44);
        final SubLObject var54 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var48);
            final SubLObject var54_115 = var47;
            if (NIL == module0065.f4772(var54_115, (SubLObject)$ic13$)) {
                final SubLObject var56_116 = var54_115;
                if (NIL == module0065.f4775(var56_116, (SubLObject)$ic13$)) {
                    final SubLObject var55 = module0065.f4740(var56_116);
                    final SubLObject var56 = (SubLObject)NIL;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    SubLObject var60;
                    SubLObject var61;
                    for (var57 = Sequences.length(var55), var58 = (SubLObject)NIL, var58 = (SubLObject)ZERO_INTEGER; var58.numL(var57); var58 = Numbers.add(var58, (SubLObject)ONE_INTEGER)) {
                        var59 = ((NIL != var56) ? Numbers.subtract(var57, var58, (SubLObject)ONE_INTEGER) : var58);
                        var60 = Vectors.aref(var55, var59);
                        if (NIL == module0065.f4749(var60) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var60)) {
                                var60 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var50, var49);
                            var50 = Numbers.add(var50, (SubLObject)ONE_INTEGER);
                            var61 = f11557(var60);
                            module0084.f5762(var45, var61, var60);
                        }
                    }
                }
                final SubLObject var63_117 = var54_115;
                if (NIL == module0065.f4777(var63_117) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var62 = module0065.f4738(var63_117);
                    SubLObject var63 = module0065.f4739(var63_117);
                    final SubLObject var64 = module0065.f4734(var63_117);
                    final SubLObject var65 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var63.numL(var64)) {
                        final SubLObject var66 = Hashtables.gethash_without_values(var63, var62, var65);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var66)) {
                            module0012.note_percent_progress(var50, var49);
                            var50 = Numbers.add(var50, (SubLObject)ONE_INTEGER);
                            final SubLObject var67 = f11557(var66);
                            module0084.f5762(var45, var67, var66);
                        }
                        var63 = Numbers.add(var63, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var54, var44);
            module0012.$g77$.rebind(var53, var44);
            module0012.$g76$.rebind(var52, var44);
            module0012.$g75$.rebind(var51, var44);
        }
        SubLObject var68;
        for (var68 = module0066.f4838(module0067.f4891(var45)); NIL == module0066.f4841(var68); var68 = module0066.f4840(var68)) {
            var44.resetMultipleValues();
            final SubLObject var69 = module0066.f4839(var68);
            final SubLObject var70 = var44.secondMultipleValue();
            var44.resetMultipleValues();
            if (NIL != module0035.f2002(var70, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                var46 = ConsesLow.nconc(var46, var70);
            }
        }
        module0066.f4842(var68);
        return Sort.sort(var46, Symbols.symbol_function((SubLObject)$ic26$), (SubLObject)$ic27$);
    }
    
    public static SubLObject f11596(SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = module0179.f11398();
        final SubLObject var47 = (SubLObject)$ic28$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var54_119 = var46;
            if (NIL == module0065.f4772(var54_119, (SubLObject)$ic13$)) {
                final SubLObject var56_120 = var54_119;
                if (NIL == module0065.f4775(var56_120, (SubLObject)$ic13$)) {
                    final SubLObject var54 = module0065.f4740(var56_120);
                    final SubLObject var55 = (SubLObject)NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                        var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (NIL == module0065.f4749(var59) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11589(var59, var43)) {
                                var45 = (SubLObject)ConsesLow.cons(var59, var45);
                            }
                        }
                    }
                }
                final SubLObject var63_121 = var54_119;
                if (NIL == module0065.f4777(var63_121) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var60 = module0065.f4738(var63_121);
                    SubLObject var61 = module0065.f4739(var63_121);
                    final SubLObject var62 = module0065.f4734(var63_121);
                    final SubLObject var63 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11589(var64, var43)) {
                                var45 = (SubLObject)ConsesLow.cons(var64, var45);
                            }
                        }
                        var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f11597(SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = module0179.f11398();
        final SubLObject var47 = (SubLObject)$ic29$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var54_122 = var46;
            if (NIL == module0065.f4772(var54_122, (SubLObject)$ic13$)) {
                final SubLObject var56_123 = var54_122;
                if (NIL == module0065.f4775(var56_123, (SubLObject)$ic13$)) {
                    final SubLObject var54 = module0065.f4740(var56_123);
                    final SubLObject var55 = (SubLObject)NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                        var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (NIL == module0065.f4749(var59) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11590(var59, var43)) {
                                var45 = (SubLObject)ConsesLow.cons(var59, var45);
                            }
                        }
                    }
                }
                final SubLObject var63_124 = var54_122;
                if (NIL == module0065.f4777(var63_124) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var60 = module0065.f4738(var63_124);
                    SubLObject var61 = module0065.f4739(var63_124);
                    final SubLObject var62 = module0065.f4734(var63_124);
                    final SubLObject var63 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11590(var64, var43)) {
                                var45 = (SubLObject)ConsesLow.cons(var64, var45);
                            }
                        }
                        var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f11598() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = module0179.f11398();
        final SubLObject var47 = (SubLObject)$ic30$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var54_125 = var46;
            if (NIL == module0065.f4772(var54_125, (SubLObject)$ic13$)) {
                final SubLObject var56_126 = var54_125;
                if (NIL == module0065.f4775(var56_126, (SubLObject)$ic13$)) {
                    final SubLObject var54 = module0065.f4740(var56_126);
                    final SubLObject var55 = (SubLObject)NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                        var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (NIL == module0065.f4749(var59) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11591(var59)) {
                                var45 = (SubLObject)ConsesLow.cons(var59, var45);
                            }
                        }
                    }
                }
                final SubLObject var63_127 = var54_125;
                if (NIL == module0065.f4777(var63_127) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var60 = module0065.f4738(var63_127);
                    SubLObject var61 = module0065.f4739(var63_127);
                    final SubLObject var62 = module0065.f4734(var63_127);
                    final SubLObject var63 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11591(var64)) {
                                var45 = (SubLObject)ConsesLow.cons(var64, var45);
                            }
                        }
                        var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f11599() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)NIL;
        final SubLObject var46 = module0179.f11398();
        final SubLObject var47 = (SubLObject)$ic31$;
        final SubLObject var48 = module0065.f4733(var46);
        SubLObject var49 = (SubLObject)ZERO_INTEGER;
        assert NIL != Types.stringp(var47) : var47;
        final SubLObject var50 = module0012.$g75$.currentBinding(var44);
        final SubLObject var51 = module0012.$g76$.currentBinding(var44);
        final SubLObject var52 = module0012.$g77$.currentBinding(var44);
        final SubLObject var53 = module0012.$g78$.currentBinding(var44);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var44);
            module0012.$g76$.bind((SubLObject)NIL, var44);
            module0012.$g77$.bind((SubLObject)T, var44);
            module0012.$g78$.bind(Time.get_universal_time(), var44);
            module0012.f478(var47);
            final SubLObject var54_128 = var46;
            if (NIL == module0065.f4772(var54_128, (SubLObject)$ic13$)) {
                final SubLObject var56_129 = var54_128;
                if (NIL == module0065.f4775(var56_129, (SubLObject)$ic13$)) {
                    final SubLObject var54 = module0065.f4740(var56_129);
                    final SubLObject var55 = (SubLObject)NIL;
                    SubLObject var56;
                    SubLObject var57;
                    SubLObject var58;
                    SubLObject var59;
                    for (var56 = Sequences.length(var54), var57 = (SubLObject)NIL, var57 = (SubLObject)ZERO_INTEGER; var57.numL(var56); var57 = Numbers.add(var57, (SubLObject)ONE_INTEGER)) {
                        var58 = ((NIL != var55) ? Numbers.subtract(var56, var57, (SubLObject)ONE_INTEGER) : var57);
                        var59 = Vectors.aref(var54, var58);
                        if (NIL == module0065.f4749(var59) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                            if (NIL != module0065.f4749(var59)) {
                                var59 = (SubLObject)$ic13$;
                            }
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11592(var59)) {
                                var45 = (SubLObject)ConsesLow.cons(var59, var45);
                            }
                        }
                    }
                }
                final SubLObject var63_130 = var54_128;
                if (NIL == module0065.f4777(var63_130) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                    final SubLObject var60 = module0065.f4738(var63_130);
                    SubLObject var61 = module0065.f4739(var63_130);
                    final SubLObject var62 = module0065.f4734(var63_130);
                    final SubLObject var63 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                    while (var61.numL(var62)) {
                        final SubLObject var64 = Hashtables.gethash_without_values(var61, var60, var63);
                        if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var64)) {
                            module0012.note_percent_progress(var49, var48);
                            var49 = Numbers.add(var49, (SubLObject)ONE_INTEGER);
                            if (NIL != f11592(var64)) {
                                var45 = (SubLObject)ConsesLow.cons(var64, var45);
                            }
                        }
                        var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var53, var44);
            module0012.$g77$.rebind(var52, var44);
            module0012.$g76$.rebind(var51, var44);
            module0012.$g75$.rebind(var50, var44);
        }
        return Sequences.nreverse(var45);
    }
    
    public static SubLObject f11600(SubLObject var131, SubLObject var132) {
        if (var131 == UNPROVIDED) {
            var131 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        final SubLThread var133 = SubLProcess.currentSubLThread();
        final SubLObject var134 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var135 = (SubLObject)NIL;
        SubLObject var136 = (SubLObject)NIL;
        SubLObject var137 = (SubLObject)NIL;
        SubLObject var138 = (SubLObject)NIL;
        SubLObject var139 = (SubLObject)NIL;
        SubLObject var140 = (SubLObject)NIL;
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = (SubLObject)NIL;
        try {
            var133.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var143 = Errors.$error_handler$.currentBinding(var133);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic32$, var133);
                try {
                    final SubLObject var144 = module0179.f11398();
                    final SubLObject var145 = (SubLObject)$ic33$;
                    final SubLObject var146 = module0065.f4733(var144);
                    SubLObject var147 = (SubLObject)ZERO_INTEGER;
                    assert NIL != Types.stringp(var145) : var145;
                    final SubLObject var50_141 = module0012.$g75$.currentBinding(var133);
                    final SubLObject var148 = module0012.$g76$.currentBinding(var133);
                    final SubLObject var149 = module0012.$g77$.currentBinding(var133);
                    final SubLObject var150 = module0012.$g78$.currentBinding(var133);
                    try {
                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var133);
                        module0012.$g76$.bind((SubLObject)NIL, var133);
                        module0012.$g77$.bind((SubLObject)T, var133);
                        module0012.$g78$.bind(Time.get_universal_time(), var133);
                        module0012.f478(var145);
                        final SubLObject var54_142 = var144;
                        if (NIL == module0065.f4772(var54_142, (SubLObject)$ic13$)) {
                            final SubLObject var56_143 = var54_142;
                            if (NIL == module0065.f4775(var56_143, (SubLObject)$ic13$)) {
                                final SubLObject var151 = module0065.f4740(var56_143);
                                final SubLObject var152 = (SubLObject)NIL;
                                SubLObject var153;
                                SubLObject var154;
                                SubLObject var155;
                                SubLObject var156;
                                SubLObject var157;
                                for (var153 = Sequences.length(var151), var154 = (SubLObject)NIL, var154 = (SubLObject)ZERO_INTEGER; var154.numL(var153); var154 = Numbers.add(var154, (SubLObject)ONE_INTEGER)) {
                                    var155 = ((NIL != var152) ? Numbers.subtract(var153, var154, (SubLObject)ONE_INTEGER) : var154);
                                    var156 = Vectors.aref(var151, var155);
                                    if (NIL == module0065.f4749(var156) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                                        if (NIL != module0065.f4749(var156)) {
                                            var156 = (SubLObject)$ic13$;
                                        }
                                        module0012.note_percent_progress(var147, var146);
                                        var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER);
                                        var157 = f11557(var156);
                                        module0084.f5762(var134, var157, var156);
                                        if (NIL != f11586(var156)) {
                                            var135 = (SubLObject)ConsesLow.cons(var156, var135);
                                        }
                                        if (NIL != f11587(var156)) {
                                            var136 = (SubLObject)ConsesLow.cons(var156, var136);
                                        }
                                        if (NIL != f11589(var156, (SubLObject)UNPROVIDED)) {
                                            var138 = (SubLObject)ConsesLow.cons(var156, var138);
                                        }
                                        if (NIL != f11590(var156, (SubLObject)UNPROVIDED)) {
                                            var139 = (SubLObject)ConsesLow.cons(var156, var139);
                                        }
                                        if (NIL != f11591(var156)) {
                                            var140 = (SubLObject)ConsesLow.cons(var156, var140);
                                        }
                                        if (NIL != f11592(var156)) {
                                            var141 = (SubLObject)ConsesLow.cons(var156, var141);
                                        }
                                    }
                                }
                            }
                            final SubLObject var63_144 = var54_142;
                            if (NIL == module0065.f4777(var63_144) || NIL == module0065.f4773((SubLObject)$ic13$)) {
                                final SubLObject var158 = module0065.f4738(var63_144);
                                SubLObject var159 = module0065.f4739(var63_144);
                                final SubLObject var160 = module0065.f4734(var63_144);
                                final SubLObject var161 = (SubLObject)((NIL != module0065.f4773((SubLObject)$ic13$)) ? NIL : $ic13$);
                                while (var159.numL(var160)) {
                                    final SubLObject var162 = Hashtables.gethash_without_values(var159, var158, var161);
                                    if (NIL == module0065.f4773((SubLObject)$ic13$) || NIL == module0065.f4749(var162)) {
                                        module0012.note_percent_progress(var147, var146);
                                        var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER);
                                        final SubLObject var163 = f11557(var162);
                                        module0084.f5762(var134, var163, var162);
                                        if (NIL != f11586(var162)) {
                                            var135 = (SubLObject)ConsesLow.cons(var162, var135);
                                        }
                                        if (NIL != f11587(var162)) {
                                            var136 = (SubLObject)ConsesLow.cons(var162, var136);
                                        }
                                        if (NIL != f11589(var162, (SubLObject)UNPROVIDED)) {
                                            var138 = (SubLObject)ConsesLow.cons(var162, var138);
                                        }
                                        if (NIL != f11590(var162, (SubLObject)UNPROVIDED)) {
                                            var139 = (SubLObject)ConsesLow.cons(var162, var139);
                                        }
                                        if (NIL != f11591(var162)) {
                                            var140 = (SubLObject)ConsesLow.cons(var162, var140);
                                        }
                                        if (NIL != f11592(var162)) {
                                            var141 = (SubLObject)ConsesLow.cons(var162, var141);
                                        }
                                    }
                                    var159 = Numbers.add(var159, (SubLObject)ONE_INTEGER);
                                }
                            }
                        }
                        module0012.f479();
                    }
                    finally {
                        module0012.$g78$.rebind(var150, var133);
                        module0012.$g77$.rebind(var149, var133);
                        module0012.$g76$.rebind(var148, var133);
                        module0012.$g75$.rebind(var50_141, var133);
                    }
                    SubLObject var164;
                    for (var164 = module0066.f4838(module0067.f4891(var134)); NIL == module0066.f4841(var164); var164 = module0066.f4840(var164)) {
                        var133.resetMultipleValues();
                        final SubLObject var165 = module0066.f4839(var164);
                        final SubLObject var166 = var133.secondMultipleValue();
                        var133.resetMultipleValues();
                        if (NIL != module0035.f2002(var166, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                            var137 = ConsesLow.nconc(var137, var166);
                        }
                    }
                    module0066.f4842(var164);
                    var135 = Sequences.nreverse(var135);
                    var136 = Sequences.nreverse(var136);
                    var137 = Sort.sort(var137, Symbols.symbol_function((SubLObject)$ic26$), (SubLObject)$ic27$);
                    var138 = Sequences.nreverse(var138);
                    var139 = Sequences.nreverse(var139);
                    var140 = Sequences.nreverse(var140);
                    var141 = Sequences.nreverse(var141);
                }
                catch (Throwable var167) {
                    Errors.handleThrowable(var167, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var143, var133);
            }
        }
        catch (Throwable var168) {
            var142 = Errors.handleThrowable(var168, module0003.$g3$.getGlobalValue());
        }
        finally {
            var133.throwStack.pop();
        }
        if (NIL != var131) {
            if (NIL != var142) {
                PrintLow.format(var131, (SubLObject)$ic34$, var142);
            }
            if (NIL != var135) {
                f11601(var131, var135, var132);
            }
            if (NIL != var136) {
                f11602(var131, var136, var132);
            }
            if (NIL != var137) {
                f11603(var131, var137, var132);
            }
            if (NIL != var138) {
                f11604(var131, var138, var132);
            }
            if (NIL != var139) {
                f11605(var131, var139, var132);
            }
            if (NIL != var140) {
                f11606(var131, var140, var132);
            }
            if (NIL != var141) {
                f11607(var131, var141, var132);
            }
        }
        return (SubLObject)makeBoolean(NIL == var135 && NIL == var136 && NIL == var137 && NIL == var138 && NIL == var139 && NIL == var140 && NIL == var141 && NIL == var142);
    }
    
    public static SubLObject f11608(SubLObject var131) {
        if (var131 == UNPROVIDED) {
            var131 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        try {
            var132.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var135 = Errors.$error_handler$.currentBinding(var132);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic32$, var132);
                try {
                    var133 = f11593();
                }
                catch (Throwable var136) {
                    Errors.handleThrowable(var136, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var135, var132);
            }
        }
        catch (Throwable var137) {
            var134 = Errors.handleThrowable(var137, module0003.$g3$.getGlobalValue());
        }
        finally {
            var132.throwStack.pop();
        }
        if (NIL != var131) {
            if (NIL != var134) {
                PrintLow.format(var131, (SubLObject)$ic35$, var134);
            }
            if (NIL != var133) {
                f11601(var131, var133, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)makeBoolean(NIL == var133 && NIL == var134);
    }
    
    public static SubLObject f11601(final SubLObject var131, final SubLObject var105, SubLObject var132) {
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        if (NIL != var132) {
            PrintLow.format(var131, (SubLObject)$ic36$, Sequences.length(var105));
            SubLObject var133 = var105;
            SubLObject var134 = (SubLObject)NIL;
            var134 = var133.first();
            while (NIL != var133) {
                PrintLow.format(var131, (SubLObject)$ic37$, module0179.f11415(var134), var134);
                var133 = var133.rest();
                var134 = var133.first();
            }
        }
        else {
            PrintLow.format(var131, (SubLObject)$ic38$, Sequences.length(var105));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11609(SubLObject var131) {
        if (var131 == UNPROVIDED) {
            var131 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        try {
            var132.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var135 = Errors.$error_handler$.currentBinding(var132);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic32$, var132);
                try {
                    var133 = f11594();
                }
                catch (Throwable var136) {
                    Errors.handleThrowable(var136, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var135, var132);
            }
        }
        catch (Throwable var137) {
            var134 = Errors.handleThrowable(var137, module0003.$g3$.getGlobalValue());
        }
        finally {
            var132.throwStack.pop();
        }
        if (NIL != var131) {
            if (NIL != var134) {
                PrintLow.format(var131, (SubLObject)$ic39$, var134);
            }
            if (NIL != var133) {
                f11602(var131, var133, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)makeBoolean(NIL == var133 && NIL == var134);
    }
    
    public static SubLObject f11602(final SubLObject var131, final SubLObject var134, SubLObject var132) {
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        if (NIL != var132) {
            PrintLow.format(var131, (SubLObject)$ic40$, Sequences.length(var134));
            SubLObject var135 = var134;
            SubLObject var136 = (SubLObject)NIL;
            var136 = var135.first();
            while (NIL != var135) {
                PrintLow.format(var131, (SubLObject)$ic37$, module0179.f11415(var136), var136);
                var135 = var135.rest();
                var136 = var135.first();
            }
        }
        else {
            PrintLow.format(var131, (SubLObject)$ic41$, Sequences.length(var134));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11610(SubLObject var131) {
        if (var131 == UNPROVIDED) {
            var131 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        try {
            var132.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var135 = Errors.$error_handler$.currentBinding(var132);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic32$, var132);
                try {
                    var133 = f11595();
                }
                catch (Throwable var136) {
                    Errors.handleThrowable(var136, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var135, var132);
            }
        }
        catch (Throwable var137) {
            var134 = Errors.handleThrowable(var137, module0003.$g3$.getGlobalValue());
        }
        finally {
            var132.throwStack.pop();
        }
        if (NIL != var131) {
            if (NIL != var134) {
                PrintLow.format(var131, (SubLObject)$ic42$, var134);
            }
            if (NIL != var133) {
                f11603(var131, var133, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)makeBoolean(NIL == var133 && NIL == var134);
    }
    
    public static SubLObject f11603(final SubLObject var131, final SubLObject var92, SubLObject var132) {
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        if (NIL != var132) {
            PrintLow.format(var131, (SubLObject)$ic43$, Sequences.length(var92));
            SubLObject var133 = var92;
            SubLObject var134 = (SubLObject)NIL;
            var134 = var133.first();
            while (NIL != var133) {
                PrintLow.format(var131, (SubLObject)$ic37$, module0179.f11415(var134), var134);
                var133 = var133.rest();
                var134 = var133.first();
            }
        }
        else {
            PrintLow.format(var131, (SubLObject)$ic44$, Sequences.length(var92));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11611(SubLObject var131) {
        if (var131 == UNPROVIDED) {
            var131 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        try {
            var132.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var135 = Errors.$error_handler$.currentBinding(var132);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic32$, var132);
                try {
                    var133 = f11596((SubLObject)UNPROVIDED);
                }
                catch (Throwable var136) {
                    Errors.handleThrowable(var136, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var135, var132);
            }
        }
        catch (Throwable var137) {
            var134 = Errors.handleThrowable(var137, module0003.$g3$.getGlobalValue());
        }
        finally {
            var132.throwStack.pop();
        }
        if (NIL != var131) {
            if (NIL != var134) {
                PrintLow.format(var131, (SubLObject)$ic45$, var134);
            }
            if (NIL != var133) {
                f11604(var131, var133, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)makeBoolean(NIL == var133 && NIL == var134);
    }
    
    public static SubLObject f11604(final SubLObject var131, final SubLObject var92, SubLObject var132) {
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        if (NIL != var132) {
            PrintLow.format(var131, (SubLObject)$ic46$, Sequences.length(var92));
            SubLObject var133 = var92;
            SubLObject var134 = (SubLObject)NIL;
            var134 = var133.first();
            while (NIL != var133) {
                PrintLow.format(var131, (SubLObject)$ic37$, module0179.f11415(var134), var134);
                var133 = var133.rest();
                var134 = var133.first();
            }
        }
        else {
            PrintLow.format(var131, (SubLObject)$ic47$, Sequences.length(var92));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11612(SubLObject var131) {
        if (var131 == UNPROVIDED) {
            var131 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        try {
            var132.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var135 = Errors.$error_handler$.currentBinding(var132);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic32$, var132);
                try {
                    var133 = f11597((SubLObject)UNPROVIDED);
                }
                catch (Throwable var136) {
                    Errors.handleThrowable(var136, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var135, var132);
            }
        }
        catch (Throwable var137) {
            var134 = Errors.handleThrowable(var137, module0003.$g3$.getGlobalValue());
        }
        finally {
            var132.throwStack.pop();
        }
        if (NIL != var131) {
            if (NIL != var134) {
                PrintLow.format(var131, (SubLObject)$ic48$, var134);
            }
            if (NIL != var133) {
                f11605(var131, var133, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)makeBoolean(NIL == var133 && NIL == var134);
    }
    
    public static SubLObject f11605(final SubLObject var131, final SubLObject var92, SubLObject var132) {
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        if (NIL != var132) {
            PrintLow.format(var131, (SubLObject)$ic49$, Sequences.length(var92));
            SubLObject var133 = var92;
            SubLObject var134 = (SubLObject)NIL;
            var134 = var133.first();
            while (NIL != var133) {
                PrintLow.format(var131, (SubLObject)$ic37$, module0179.f11415(var134), var134);
                var133 = var133.rest();
                var134 = var133.first();
            }
        }
        else {
            PrintLow.format(var131, (SubLObject)$ic50$, Sequences.length(var92));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11613(SubLObject var131) {
        if (var131 == UNPROVIDED) {
            var131 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        try {
            var132.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var135 = Errors.$error_handler$.currentBinding(var132);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic32$, var132);
                try {
                    var133 = f11598();
                }
                catch (Throwable var136) {
                    Errors.handleThrowable(var136, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var135, var132);
            }
        }
        catch (Throwable var137) {
            var134 = Errors.handleThrowable(var137, module0003.$g3$.getGlobalValue());
        }
        finally {
            var132.throwStack.pop();
        }
        if (NIL != var131) {
            if (NIL != var134) {
                PrintLow.format(var131, (SubLObject)$ic51$, var134);
            }
            if (NIL != var133) {
                f11606(var131, var133, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)makeBoolean(NIL == var133 && NIL == var134);
    }
    
    public static SubLObject f11606(final SubLObject var131, final SubLObject var92, SubLObject var132) {
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        if (NIL != var132) {
            PrintLow.format(var131, (SubLObject)$ic52$, Sequences.length(var92));
            SubLObject var133 = var92;
            SubLObject var134 = (SubLObject)NIL;
            var134 = var133.first();
            while (NIL != var133) {
                PrintLow.format(var131, (SubLObject)$ic37$, module0179.f11415(var134), var134);
                var133 = var133.rest();
                var134 = var133.first();
            }
        }
        else {
            PrintLow.format(var131, (SubLObject)$ic53$, Sequences.length(var92));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11614(SubLObject var131) {
        if (var131 == UNPROVIDED) {
            var131 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var132 = SubLProcess.currentSubLThread();
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        try {
            var132.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var135 = Errors.$error_handler$.currentBinding(var132);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic32$, var132);
                try {
                    var133 = f11599();
                }
                catch (Throwable var136) {
                    Errors.handleThrowable(var136, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var135, var132);
            }
        }
        catch (Throwable var137) {
            var134 = Errors.handleThrowable(var137, module0003.$g3$.getGlobalValue());
        }
        finally {
            var132.throwStack.pop();
        }
        if (NIL != var131) {
            if (NIL != var134) {
                PrintLow.format(var131, (SubLObject)$ic54$, var134);
            }
            if (NIL != var133) {
                f11607(var131, var133, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)makeBoolean(NIL == var133 && NIL == var134);
    }
    
    public static SubLObject f11607(final SubLObject var131, final SubLObject var92, SubLObject var132) {
        if (var132 == UNPROVIDED) {
            var132 = (SubLObject)NIL;
        }
        if (NIL != var132) {
            PrintLow.format(var131, (SubLObject)$ic55$, Sequences.length(var92));
            SubLObject var133 = var92;
            SubLObject var134 = (SubLObject)NIL;
            var134 = var133.first();
            while (NIL != var133) {
                PrintLow.format(var131, (SubLObject)$ic37$, module0179.f11415(var134), var134);
                var133 = var133.rest();
                var134 = var133.first();
            }
        }
        else {
            PrintLow.format(var131, (SubLObject)$ic56$, Sequences.length(var92));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11615() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        return module0055.f4006($g2227$.getDynamicValue(var44));
    }
    
    public static SubLObject f11616() {
        return f11615();
    }
    
    public static SubLObject f11617(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)$ic59$, (SubLObject)$ic60$, reader.bq_cons((SubLObject)$ic61$, ConsesLow.append(var5, (SubLObject)NIL)), (SubLObject)ConsesLow.listS((SubLObject)$ic21$, (SubLObject)$ic62$, ConsesLow.append(var5, (SubLObject)$ic63$)));
    }
    
    public static SubLObject f11618() {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        while (NIL == module0055.f4019($g2227$.getDynamicValue(var44))) {
            final SubLObject var45 = module0055.f4023($g2227$.getDynamicValue(var44));
            if (module0179.f11415(var45).isInteger()) {
                f11619(var45);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11620(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = f11557(var7);
        module0180.f11457(var7, var9);
        module0055.f4021(var7, $g2227$.getDynamicValue(var8));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11619(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = f11557(var7);
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        if (NIL == f11568(var7)) {
            SubLObject var12 = (SubLObject)NIL;
            try {
                var8.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var13 = Errors.$error_handler$.currentBinding(var8);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic32$, var8);
                    try {
                        var10 = module0333.f22427(var9);
                    }
                    catch (Throwable var14) {
                        Errors.handleThrowable(var14, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var13, var8);
                }
            }
            catch (Throwable var15) {
                var12 = Errors.handleThrowable(var15, module0003.$g3$.getGlobalValue());
            }
            finally {
                var8.throwStack.pop();
            }
            if (var12.isString()) {
                Errors.warn((SubLObject)$ic65$, var12);
            }
        }
        if (NIL != var10) {
            final SubLObject var16 = module0180.f11456(var7);
            if ($ic66$ == var16) {
                f11621(var7);
            }
            else {
                var11 = (SubLObject)T;
            }
        }
        else {
            f11621(var7);
        }
        return var11;
    }
    
    public static SubLObject f11622(final SubLObject var7) {
        return (SubLObject)((NIL != f11616()) ? f11620(var7) : makeBoolean(NIL == f11623(var7)));
    }
    
    public static SubLObject f11623(final SubLObject var7) {
        final SubLObject var8 = f11557(var7);
        SubLObject var9 = (SubLObject)NIL;
        if (NIL != module0333.f22427(var8)) {
            final SubLObject var10 = module0180.f11456(var7);
            if ($ic66$ == var10) {
                f11624(var7);
            }
            else {
                var9 = (SubLObject)T;
            }
        }
        else {
            f11624(var7);
        }
        return var9;
    }
    
    public static SubLObject f11625(final SubLObject var7) {
        final SubLObject var8 = f11557(var7);
        final SubLObject var9 = module0333.f22427(var8);
        if (NIL == var9) {
            f11624(var7);
        }
        return var9;
    }
    
    public static SubLObject f11624(final SubLObject var7) {
        final SubLObject var8 = module0180.f11453(var7);
        if (NIL != deduction_handles_oc.f11659(var8)) {
            if (NIL != module0342.f23108(var8)) {
                f11621(var7);
            }
            else {
                module0342.f23129(var8);
            }
        }
        else {
            f11621(var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11626(final SubLObject var38) {
        SubLObject var39 = (SubLObject)ZERO_INTEGER;
        SubLObject var40 = f11553(var38);
        SubLObject var41 = (SubLObject)NIL;
        var41 = var40.first();
        while (NIL != var40) {
            if (NIL != module0191.f11955(var41, (SubLObject)UNPROVIDED)) {
                f11621(var41);
            }
            var39 = Numbers.add(var39, (SubLObject)ONE_INTEGER);
            var40 = var40.rest();
            var41 = var40.first();
        }
        return var39;
    }
    
    public static SubLObject f11621(final SubLObject var7) {
        final SubLObject var8 = module0180.f11455(var7);
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = module0032.f1741(var8), var10 = (SubLObject)NIL, var10 = module0032.f1742(var9, var8); NIL == module0032.f1744(var9, var10); var10 = module0032.f1743(var10)) {
            var11 = module0032.f1745(var9, var10);
            if (NIL != module0032.f1746(var10, var11)) {
                module0342.f23129(var11);
            }
        }
        module0180.f11450(var7);
        return var7;
    }
    
    public static SubLObject f11627(SubLObject var156) {
        if (var156 == UNPROVIDED) {
            var156 = (SubLObject)NIL;
        }
        final SubLThread var157 = SubLProcess.currentSubLThread();
        final SubLObject var158 = Numbers.ceiling(deduction_handles_oc.f11643(), module0213.f13879());
        module0213.f13886(var158, (SubLObject)NIL);
        final SubLObject var159 = module0018.$g694$.currentBinding(var157);
        try {
            module0018.$g694$.bind((SubLObject)NIL, var157);
            final SubLObject var161;
            final SubLObject var160 = var161 = module0034.f1888();
            final SubLObject var50_160 = module0034.$g879$.currentBinding(var157);
            try {
                module0034.$g879$.bind(var161, var157);
                SubLObject var162 = (SubLObject)NIL;
                if (NIL != var161 && NIL == module0034.f1842(var161)) {
                    var162 = module0034.f1869(var161);
                    final SubLObject var163 = Threads.current_process();
                    if (NIL == var162) {
                        module0034.f1873(var161, var163);
                    }
                    else if (!var162.eql(var163)) {
                        Errors.error((SubLObject)$ic67$);
                    }
                }
                try {
                    final SubLObject var164 = module0139.$g1630$.getDynamicValue(var157);
                    final SubLObject var50_161 = module0139.$g1631$.currentBinding(var157);
                    final SubLObject var165 = module0139.$g1632$.currentBinding(var157);
                    final SubLObject var166 = module0139.$g1630$.currentBinding(var157);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var164, (SubLObject)SIX_INTEGER), var157);
                        module0139.$g1632$.bind(module0139.f9016(var164), var157);
                        module0139.$g1630$.bind((SubLObject)T, var157);
                        module0012.$g82$.setDynamicValue((SubLObject)$ic68$, var157);
                        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var157);
                        module0012.$g83$.setDynamicValue(deduction_handles_oc.f11643(), var157);
                        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var157);
                        final SubLObject var50_162 = module0012.$g75$.currentBinding(var157);
                        final SubLObject var51_166 = module0012.$g76$.currentBinding(var157);
                        final SubLObject var52_167 = module0012.$g77$.currentBinding(var157);
                        final SubLObject var167 = module0012.$g78$.currentBinding(var157);
                        try {
                            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var157);
                            module0012.$g76$.bind((SubLObject)NIL, var157);
                            module0012.$g77$.bind((SubLObject)T, var157);
                            module0012.$g78$.bind(Time.get_universal_time(), var157);
                            module0012.f478(module0012.$g82$.getDynamicValue(var157));
                            SubLObject var168;
                            SubLObject var169;
                            for (var168 = (SubLObject)NIL, var168 = (SubLObject)ZERO_INTEGER; var168.numL(module0012.$g83$.getDynamicValue(var157)); var168 = Numbers.add(var168, (SubLObject)ONE_INTEGER)) {
                                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var157), module0012.$g83$.getDynamicValue(var157));
                                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var157), (SubLObject)ONE_INTEGER), var157);
                                var169 = deduction_handles_oc.f11675(var168);
                                if (NIL != deduction_handles_oc.f11659(var169) && (NIL == var156 || NIL == module0342.f23153(var169))) {
                                    f11628(var169);
                                }
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var167, var157);
                            module0012.$g77$.rebind(var52_167, var157);
                            module0012.$g76$.rebind(var51_166, var157);
                            module0012.$g75$.rebind(var50_162, var157);
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var166, var157);
                        module0139.$g1632$.rebind(var165, var157);
                        module0139.$g1631$.rebind(var50_161, var157);
                    }
                }
                finally {
                    final SubLObject var50_163 = Threads.$is_thread_performing_cleanupP$.currentBinding(var157);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var157);
                        if (NIL != var161 && NIL == var162) {
                            module0034.f1873(var161, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var50_163, var157);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var50_160, var157);
            }
        }
        finally {
            module0018.$g694$.rebind(var159, var157);
        }
        module0179.f11404((SubLObject)UNPROVIDED);
        return module0179.f11409();
    }
    
    public static SubLObject f11628(final SubLObject var155) {
        final SubLThread var156 = SubLProcess.currentSubLThread();
        final SubLObject var157 = module0188.f11770(var155);
        SubLObject var158 = (SubLObject)NIL;
        SubLObject var159 = var157;
        SubLObject var160 = (SubLObject)NIL;
        var160 = var159.first();
        while (NIL != var159) {
            SubLObject var161 = (SubLObject)NIL;
            SubLObject var162 = (SubLObject)NIL;
            try {
                var156.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var163 = Errors.$error_handler$.currentBinding(var156);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic32$, var156);
                    try {
                        var162 = f11575(var160);
                    }
                    catch (Throwable var164) {
                        Errors.handleThrowable(var164, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var163, var156);
                }
            }
            catch (Throwable var165) {
                var161 = Errors.handleThrowable(var165, module0003.$g3$.getGlobalValue());
            }
            finally {
                var156.throwStack.pop();
            }
            if (NIL != var161) {
                Errors.warn((SubLObject)$ic69$, var160, var161);
            }
            else if (NIL != module0179.f11430(var162, (SubLObject)UNPROVIDED)) {
                module0180.f11458(var162, var155);
            }
            var158 = (SubLObject)ConsesLow.cons((NIL != var162) ? var162 : var160, var158);
            var159 = var159.rest();
            var160 = var159.first();
        }
        module0187.f11757(var155, Sequences.nreverse(var158));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11629() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0183", "f11548", "S#14365");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0183", "f11549", "S#14366");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0183", "f11550", "S#14367");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11551", "S#14368", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11552", "S#14303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11553", "S#14369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11554", "S#14370", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11555", "S#14371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11556", "S#14372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11557", "S#14373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11558", "S#14374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11559", "S#14375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11560", "S#14309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11561", "S#14376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11562", "S#14377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11563", "S#14378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11564", "S#14379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11565", "S#14380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11566", "S#14381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11567", "S#14382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11568", "S#14383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11569", "S#14384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11570", "S#14385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11571", "S#14386", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11572", "S#14387", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11573", "S#14388", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11574", "S#14389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11575", "S#14390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11576", "S#14391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11577", "S#14392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11578", "S#14393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11579", "S#14394", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11580", "S#14395", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11581", "S#14396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11582", "S#14397", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0183", "f11583", "S#14253");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11584", "S#14398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11585", "S#14399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11586", "S#14400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11587", "S#14401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11588", "S#14402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11589", "S#14403", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11590", "S#14404", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11591", "S#14405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11592", "S#14406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11593", "S#14407", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11594", "S#14408", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11595", "S#14409", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11596", "S#14410", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11597", "S#14411", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11598", "S#14412", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11599", "S#14413", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11600", "S#14414", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11608", "S#14415", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11601", "S#14416", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11609", "S#14417", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11602", "S#14418", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11610", "S#14419", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11603", "S#14420", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11611", "S#14421", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11604", "S#14422", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11612", "S#14423", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11605", "S#14424", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11613", "S#14425", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11606", "S#14426", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11614", "S#14427", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11607", "S#14428", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11615", "S#14429", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11616", "S#14430", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0183", "f11617", "S#14431");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11618", "S#14432", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11620", "S#14433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11619", "S#14434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11622", "S#14435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11623", "S#14436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11625", "S#14437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11624", "S#14438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11626", "S#13558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11621", "S#14439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11627", "S#14440", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0183", "f11628", "S#14441", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11630() {
        $g2225$ = SubLFiles.defparameter("S#14442", (SubLObject)NIL);
        $g2226$ = SubLFiles.defparameter("S#14443", (SubLObject)NIL);
        $g2227$ = SubLFiles.defparameter("S#14444", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f11631() {
        module0002.f50((SubLObject)$ic57$, (SubLObject)$ic58$);
        module0002.f50((SubLObject)$ic64$, (SubLObject)$ic58$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f11629();
    }
    
    public void initializeVariables() {
        f11630();
    }
    
    public void runTopLevelForms() {
        f11631();
    }
    
    static {
        me = (SubLFile)new module0183();
        $g2225$ = null;
        $g2226$ = null;
        $g2227$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14181", "CYC"), (SubLObject)makeSymbol("S#14196", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("DONE");
        $ic4$ = makeSymbol("DO-LIST");
        $ic5$ = makeSymbol("KB-KB-HL-SUPPORT-ARGUMENTS");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14445", "CYC"), (SubLObject)makeSymbol("S#14196", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = makeSymbol("S#2964", "CYC");
        $ic8$ = makeSymbol("KB-KB-HL-SUPPORT-DEPENDENTS");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14446", "CYC"), (SubLObject)makeSymbol("S#14196", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeSymbol("S#14374", "CYC");
        $ic11$ = makeString("Eliminating invalid KB HL support dependents");
        $ic12$ = makeSymbol("STRINGP");
        $ic13$ = makeKeyword("SKIP");
        $ic14$ = makeSymbol("S#14306", "CYC");
        $ic15$ = makeString("Eliminating KB HL supports with invalid HL supports");
        $ic16$ = makeSymbol("S#14390", "CYC");
        $ic17$ = makeSymbol("S#14393", "CYC");
        $ic18$ = makeSymbol("TRUE");
        $ic19$ = makeInteger(500);
        $ic20$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic21$ = makeSymbol("CLET");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14443", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14215", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9683", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#14396", "CYC"))));
        $ic23$ = makeString("Verifying KB HL support indexing");
        $ic24$ = makeString("Searching for circular KB HL supports");
        $ic25$ = makeString("Searching for duplicate KB HL supports");
        $ic26$ = makeSymbol("<");
        $ic27$ = makeSymbol("S#14246", "CYC");
        $ic28$ = makeString("Searching for KB HL supports with invalid dependents");
        $ic29$ = makeString("Searching for KB HL supports with invalid arguments");
        $ic30$ = makeString("Searching for KB HL supports with invalid HL supports");
        $ic31$ = makeString("Searching for KB HL supports with missing backpointers");
        $ic32$ = makeSymbol("S#38", "CYC");
        $ic33$ = makeString("Verifying KB HL supports");
        $ic34$ = makeString("~&Error during KB HL support verification: ~a~%");
        $ic35$ = makeString("~&Error during indexing verification: ~a~%");
        $ic36$ = makeString("~&The following KB HL supports were not findable via their HL supports (~s in total):~%");
        $ic37$ = makeString(" ~s ~s~%");
        $ic38$ = makeString("~&~s KB HL supports are not finable via their HL supports.~%");
        $ic39$ = makeString("~&Error during non-circularity verification: ~a~%");
        $ic40$ = makeString("~&The following KB HL supports are circular (~s in total):~%");
        $ic41$ = makeString("~&~s KB HL supports are circular.~%");
        $ic42$ = makeString("~&Error during uniqueness verification: ~a~%");
        $ic43$ = makeString("~&The following KB HL supports have duplicates (~s in total):~%");
        $ic44$ = makeString("~&~s KB HL supports have duplicates.~%");
        $ic45$ = makeString("~&Error during dependent verification: ~a~%");
        $ic46$ = makeString("~&The following KB HL supports have invalid dependents (~s in total):~%");
        $ic47$ = makeString("~&~s KB HL supports have invalid dependents.~%");
        $ic48$ = makeString("~&Error during argument verification: ~a~%");
        $ic49$ = makeString("~&The following KB HL supports have invalid arguments (~s in total):~%");
        $ic50$ = makeString("~&~s KB HL supports have invalid arguments.~%");
        $ic51$ = makeString("~&Error during HL support verification: ~a~%");
        $ic52$ = makeString("~&The following KB HL supports have invalid HL supports (~s in total):~%");
        $ic53$ = makeString("~&~s KB HL supports have invalid HL supports.~%");
        $ic54$ = makeString("~&Error during KB HL support backpointer verification: ~a~%");
        $ic55$ = makeString("~&The following KB HL supports have missing backpointers (~s in total):~%");
        $ic56$ = makeString("~&~s KB HL supports have missing backpointers.~%");
        $ic57$ = makeSymbol("S#14430", "CYC");
        $ic58$ = makeSymbol("S#14431", "CYC");
        $ic59$ = makeSymbol("PIF");
        $ic60$ = ConsesLow.list((SubLObject)makeSymbol("S#14430", "CYC"));
        $ic61$ = makeSymbol("PROGN");
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14444", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4669", "CYC"))));
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14432", "CYC")));
        $ic64$ = makeSymbol("S#14432", "CYC");
        $ic65$ = makeString("~A");
        $ic66$ = makeKeyword("UNJUSTIFIABLE");
        $ic67$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic68$ = makeString("Bootstrapping KB HL supports");
        $ic69$ = makeString("Could not create KB HL support for ~s because ~a");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 755 ms
	
	Decompiled with Procyon 0.5.32.
*/