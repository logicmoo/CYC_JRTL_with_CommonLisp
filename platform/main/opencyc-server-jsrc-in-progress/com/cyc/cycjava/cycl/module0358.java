package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0358 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0358";
    public static final String myFingerPrint = "eb6bb4363ef0e1a056dbae9e6f343d2973660f6c3bd2dd1fbbb40cd484fffd59";
    private static SubLSymbol $g3006$;
    public static SubLSymbol $g3004$;
    public static SubLSymbol $g3007$;
    public static SubLSymbol $g3008$;
    private static SubLSymbol $g3009$;
    private static SubLSymbol $g3010$;
    private static SubLSymbol $g3011$;
    private static SubLSymbol $g3005$;
    private static SubLSymbol $g3012$;
    private static SubLSymbol $g3013$;
    public static SubLSymbol $g3014$;
    private static SubLSymbol $g3015$;
    private static SubLSymbol $g3016$;
    private static SubLSymbol $g3017$;
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
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
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
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLList $ic87$;
    private static final SubLList $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLList $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLList $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    
    
    public static SubLObject f23655(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10_11 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic0$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var10_11, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var10_11 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic5$, (SubLObject)$ic3$, var11), ConsesLow.append(var12, (SubLObject)NIL));
    }
    
    public static SubLObject f23656(final SubLObject var1, final SubLObject var2) {
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
        SubLObject var22_23 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic6$);
            var22_23 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic6$);
            if (NIL == conses_high.member(var22_23, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var22_23 == $ic2$) {
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
        return (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var7), var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f23657(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic9$);
        var9 = var4.first();
        var4 = var4.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var4;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var34_35 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)$ic9$);
            var34_35 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)$ic9$);
            if (NIL == conses_high.member(var34_35, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var34_35 == $ic2$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic9$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic10$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var16, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var7))), (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic3$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var6, var7, var8, var9), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic3$, var14), (SubLObject)ConsesLow.listS((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var6, var7, var8, var9), ConsesLow.append(var15, (SubLObject)NIL))));
    }
    
    public static SubLObject f23658(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var43_44 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic0$);
            var43_44 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var43_44, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var43_44 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12;
        var4 = (var12 = var5);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic17$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic18$, (SubLObject)$ic3$, var11), ConsesLow.append(var12, (SubLObject)NIL));
    }
    
    public static SubLObject f23659(final SubLObject var46, final SubLObject var47, final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        assert NIL != module0363.f24562(var46) : var46;
        SubLObject var50 = (SubLObject)NIL;
        SubLObject var51 = (SubLObject)NIL;
        var49.resetMultipleValues();
        final SubLObject var52 = module0363.f24569(var46);
        final SubLObject var53 = var49.secondMultipleValue();
        final SubLObject var54 = var49.thirdMultipleValue();
        var49.resetMultipleValues();
        final SubLObject var55 = var52;
        final SubLObject var56 = module0147.$g2095$.currentBinding(var49);
        final SubLObject var57 = module0147.$g2094$.currentBinding(var49);
        final SubLObject var58 = module0147.$g2096$.currentBinding(var49);
        try {
            module0147.$g2095$.bind(module0147.f9545(var55), var49);
            module0147.$g2094$.bind(module0147.f9546(var55), var49);
            module0147.$g2096$.bind(module0147.f9549(var55), var49);
            var49.resetMultipleValues();
            final SubLObject var57_58 = f23660(var53, var54, var48, var47);
            final SubLObject var59_60 = var49.secondMultipleValue();
            var49.resetMultipleValues();
            var50 = var57_58;
            var51 = var59_60;
        }
        finally {
            module0147.$g2096$.rebind(var58, var49);
            module0147.$g2094$.rebind(var57, var49);
            module0147.$g2095$.rebind(var56, var49);
        }
        return Values.values(var50, var51);
    }
    
    public static SubLObject f23660(final SubLObject var28, final SubLObject var29, final SubLObject var30, final SubLObject var47) {
        SubLObject var48 = $g3004$.getGlobalValue();
        SubLObject var49 = (SubLObject)$ic20$;
        SubLObject var50 = (SubLObject)NIL;
        if (NIL != var30) {
            final SubLObject var51 = f23661(var28, var29, var30);
            SubLObject var52;
            SubLObject var53;
            SubLObject var54;
            for (var52 = (SubLObject)NIL, var52 = var51; NIL == var50 && NIL != var52; var52 = var52.rest()) {
                var53 = var52.first();
                var54 = f23662(var53, var28, var30, var47);
                if (NIL != var54) {
                    if (NIL != f23663(var54, var48)) {
                        var48 = var54;
                        var49 = module0038.f2638(f23664(var53));
                    }
                    if ($ic21$ == var54) {
                        var50 = (SubLObject)T;
                    }
                }
            }
        }
        return Values.values(var48, var49);
    }
    
    public static SubLObject f23661(final SubLObject var28, final SubLObject var29, final SubLObject var30) {
        SubLObject var31 = (SubLObject)NIL;
        final SubLObject var32 = module0205.f13333(var28);
        SubLObject var33 = f23665(var32);
        SubLObject var34 = (SubLObject)NIL;
        var34 = var33.first();
        while (NIL != var33) {
            if (NIL != f23666(var34, var28, var29, var30)) {
                var31 = (SubLObject)ConsesLow.cons(var34, var31);
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        final SubLObject var35 = module0077.f5333($g3005$.getGlobalValue());
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        for (var36 = module0032.f1741(var35), var37 = (SubLObject)NIL, var37 = module0032.f1742(var36, var35); NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
            var38 = module0032.f1745(var36, var37);
            if (NIL != module0032.f1746(var37, var38) && NIL != f23666(var38, var28, var29, var30)) {
                var31 = (SubLObject)ConsesLow.cons(var38, var31);
            }
        }
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var31;
        SubLObject var42 = (SubLObject)NIL;
        var42 = var41.first();
        while (NIL != var41) {
            if ($ic22$ != var40 && NIL == module0035.f2169(f23664(var42), var40)) {
                if (NIL != f23667(var42)) {
                    final SubLObject var43 = f23668(var42);
                    if ($ic22$ == var43) {
                        var40 = (SubLObject)$ic22$;
                        var39 = (SubLObject)NIL;
                    }
                    else {
                        SubLObject var72_75 = var43;
                        SubLObject var44 = (SubLObject)NIL;
                        var44 = var72_75.first();
                        while (NIL != var72_75) {
                            var39 = Sequences.delete(var44, var39, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic23$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var45 = var44;
                            if (NIL == conses_high.member(var45, var40, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var40 = (SubLObject)ConsesLow.cons(var45, var40);
                            }
                            var72_75 = var72_75.rest();
                            var44 = var72_75.first();
                        }
                    }
                }
                var39 = (SubLObject)ConsesLow.cons(var42, var39);
            }
            var41 = var41.rest();
            var42 = var41.first();
        }
        return var39;
    }
    
    public static SubLObject f23669(final SubLObject var78, final SubLObject var29, final SubLObject var79, final SubLObject var52) {
        final SubLThread var80 = SubLProcess.currentSubLThread();
        SubLObject var81 = (SubLObject)NIL;
        final SubLObject var82 = module0147.$g2095$.currentBinding(var80);
        final SubLObject var83 = module0147.$g2094$.currentBinding(var80);
        final SubLObject var84 = module0147.$g2096$.currentBinding(var80);
        try {
            module0147.$g2095$.bind(module0147.f9545(var52), var80);
            module0147.$g2094$.bind(module0147.f9546(var52), var80);
            module0147.$g2096$.bind(module0147.f9549(var52), var80);
            final SubLObject var85 = module0285.f18910(var78, (SubLObject)UNPROVIDED);
            assert NIL != module0035.f1997(var85) : var85;
            final SubLObject var86 = var85.first();
            SubLObject var88;
            final SubLObject var87 = var88 = var86;
            SubLObject var89 = (SubLObject)NIL;
            SubLObject var90 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var88, var87, (SubLObject)$ic25$);
            var89 = var88.first();
            var88 = var88.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var88, var87, (SubLObject)$ic25$);
            var90 = var88.first();
            var88 = var88.rest();
            if (NIL == var88) {
                assert NIL != module0204.f13045(var89) : var89;
                final SubLObject var91 = module0204.f13052(var89);
                final SubLObject var92 = module0233.f15362(var90, var79);
                var81 = f23660(var91, var29, var92, (SubLObject)$ic27$);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var87, (SubLObject)$ic25$);
            }
        }
        finally {
            module0147.$g2096$.rebind(var84, var80);
            module0147.$g2094$.rebind(var83, var80);
            module0147.$g2095$.rebind(var82, var80);
        }
        return var81;
    }
    
    public static SubLObject f23670(final SubLObject var88, SubLObject var52) {
        if (var52 == UNPROVIDED) {
            var52 = (SubLObject)NIL;
        }
        return f23671(var88, var52, (SubLObject)NIL);
    }
    
    public static SubLObject f23671(final SubLObject var88, final SubLObject var52, final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        if (NIL == var88) {
            return Sequences.nreverse(var89);
        }
        var90.resetMultipleValues();
        final SubLObject var91 = f23672(var88, var89);
        final SubLObject var92 = var90.secondMultipleValue();
        var90.resetMultipleValues();
        return f23671(var92, var52, (SubLObject)ConsesLow.cons(var91, var89));
    }
    
    public static SubLObject f23672(final SubLObject var88, final SubLObject var89) {
        if (NIL != module0035.f1997(var88)) {
            return Values.values(var88.first(), (SubLObject)NIL);
        }
        SubLObject var90 = (SubLObject)$ic28$;
        SubLObject var91 = (SubLObject)$ic28$;
        SubLObject var92 = (SubLObject)$ic28$;
        SubLObject var93 = (SubLObject)$ic28$;
        SubLObject var94 = var88;
        SubLObject var95 = (SubLObject)NIL;
        var95 = var94.first();
        while (NIL != var94) {
            final SubLObject var96 = Sequences.remove(var95, var88, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var97 = module0193.f12102(var89);
            final SubLObject var98 = module0193.f12102(var95);
            final SubLObject var99 = module0193.f12102(var96);
            final SubLObject var100 = conses_high.intersection(var98, var99, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            final SubLObject var101 = conses_high.intersection(var98, var97, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            final SubLObject var102 = conses_high.set_difference(var100, var97, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            final SubLObject var103 = (NIL != module0205.f13337(var95)) ? module0205.f13338(var95) : var95;
            final SubLObject var104 = (SubLObject)((NIL != module0205.f13337(var95)) ? $ic29$ : $ic30$);
            final SubLObject var105 = f23673(var103, var101);
            final SubLObject var106 = f23674(var105, var104, var102);
            final SubLObject var107 = f23675(var105, var104);
            if ($ic28$.eql(var92) || NIL != f23676(var106, var92) || (var106.equal(var92) && var107.numL(var93))) {
                var90 = var95;
                var91 = var96;
                var92 = var106;
                var93 = var107;
            }
            var94 = var94.rest();
            var95 = var94.first();
        }
        return Values.values(var90, var91);
    }
    
    public static SubLObject f23673(SubLObject var28, final SubLObject var100) {
        if (NIL != var100) {
            final SubLObject var101 = module0205.f13333(var28);
            final SubLObject var102 = f23677(var101);
            SubLObject var103 = var100;
            SubLObject var104 = (SubLObject)NIL;
            var104 = var103.first();
            while (NIL != var103) {
                if (NIL != module0035.f2434(var104, var28)) {
                    var28 = conses_high.subst(var102, var104, var28, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
                }
                var103 = var103.rest();
                var104 = var103.first();
            }
        }
        return var28;
    }
    
    public static SubLObject f23677(final SubLObject var106) {
        if (var106.eql($ic31$) || var106.eql($ic32$)) {
            return $ic33$;
        }
        return (SubLObject)$ic34$;
    }
    
    public static SubLObject f23678() {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        return $g3006$.getDynamicValue(var49);
    }
    
    public static SubLObject f23674(final SubLObject var28, final SubLObject var29, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != module0193.f12105(var28)) {
            return Values.values((SubLObject)$ic35$, (SubLObject)$ic36$);
        }
        if (var29 == $ic29$ && NIL != var30) {
            return Values.values((SubLObject)$ic21$, (SubLObject)$ic37$);
        }
        if (NIL == module0376.f26666(var28, var29, (SubLObject)UNPROVIDED)) {
            return Values.values((SubLObject)$ic21$, (SubLObject)$ic38$);
        }
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = $g3006$.currentBinding(var31);
        try {
            $g3006$.bind((SubLObject)T, var31);
            var31.resetMultipleValues();
            final SubLObject var112_113 = f23660(var28, var29, var30, (SubLObject)$ic27$);
            final SubLObject var114_115 = var31.secondMultipleValue();
            var31.resetMultipleValues();
            var32 = var112_113;
            var33 = var114_115;
        }
        finally {
            $g3006$.rebind(var34, var31);
        }
        return Values.values(var32, var33);
    }
    
    public static SubLObject f23675(final SubLObject var28, final SubLObject var29) {
        return module0411.f28638(var28, var29, $ic39$, module0450.f31011());
    }
    
    public static SubLObject f23679(final SubLObject var50) {
        if (NIL != var50 && !areAssertionsDisabledFor(me) && NIL == f23680(var50)) {
            throw new AssertionError(var50);
        }
        if (var50.eql((SubLObject)$ic35$)) {
            return (SubLObject)$ic43$;
        }
        if (var50.eql((SubLObject)$ic44$)) {
            return (SubLObject)$ic45$;
        }
        if (var50.eql((SubLObject)$ic46$)) {
            return (SubLObject)$ic47$;
        }
        if (var50.eql((SubLObject)$ic21$)) {
            return (SubLObject)$ic48$;
        }
        if (var50.eql((SubLObject)$ic40$)) {
            return (SubLObject)$ic49$;
        }
        if (var50.eql((SubLObject)NIL)) {
            return (SubLObject)$ic50$;
        }
        Errors.error((SubLObject)$ic51$, var50);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23680(final SubLObject var116) {
        return module0035.f2169(var116, $g3009$.getGlobalValue());
    }
    
    public static SubLObject f23681(final SubLObject var116) {
        return Equality.eq((SubLObject)$ic21$, var116);
    }
    
    public static SubLObject f23682(final SubLObject var116) {
        return Equality.eq((SubLObject)$ic40$, var116);
    }
    
    public static SubLObject f23683(final SubLObject var116) {
        return (SubLObject)makeBoolean($ic21$ == var116 || $ic40$ == var116);
    }
    
    public static SubLObject f23663(final SubLObject var117, final SubLObject var118) {
        assert NIL != f23680(var117) : var117;
        assert NIL != f23680(var118) : var118;
        return module0035.f2385(var117, var118, $g3009$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23676(final SubLObject var117, final SubLObject var118) {
        return f23663(var118, var117);
    }
    
    public static SubLObject f23684(final SubLObject var117, final SubLObject var118) {
        return (SubLObject)makeBoolean(NIL == f23676(var117, var118));
    }
    
    public static SubLObject f23685(final SubLObject var117, final SubLObject var118) {
        return (SubLObject)makeBoolean(NIL == f23663(var117, var118));
    }
    
    public static SubLObject f23686(final SubLObject var119) {
        return (NIL != var119) ? module0035.f2378(var119, (SubLObject)$ic52$, (SubLObject)UNPROVIDED) : conses_high.last($g3009$.getGlobalValue(), (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f23687(final SubLObject var117, final SubLObject var118) {
        return (NIL != f23663(var118, var117)) ? var118 : var117;
    }
    
    public static SubLObject f23688(final SubLObject var119) {
        return (NIL != var119) ? module0035.f2378(var119, (SubLObject)$ic53$, (SubLObject)UNPROVIDED) : $g3009$.getGlobalValue().first();
    }
    
    public static SubLObject f23689(final SubLObject var117, final SubLObject var118) {
        return (NIL != f23663(var118, var117)) ? var117 : var118;
    }
    
    public static SubLObject f23690(final SubLObject var120) {
        if (var120.eql((SubLObject)$ic54$)) {
            return (SubLObject)$ic35$;
        }
        if (var120.eql((SubLObject)$ic55$)) {
            return (SubLObject)$ic44$;
        }
        if (var120.eql((SubLObject)$ic56$)) {
            return (SubLObject)$ic46$;
        }
        if (var120.eql((SubLObject)$ic57$)) {
            return (SubLObject)$ic21$;
        }
        return Errors.error((SubLObject)$ic58$, var120);
    }
    
    public static SubLObject f23691(final SubLObject var50) {
        if (var50.eql((SubLObject)$ic35$)) {
            return (SubLObject)$ic54$;
        }
        if (var50.eql((SubLObject)$ic44$)) {
            return (SubLObject)$ic55$;
        }
        if (var50.eql((SubLObject)$ic46$)) {
            return (SubLObject)$ic56$;
        }
        if (var50.eql((SubLObject)$ic21$)) {
            return (SubLObject)$ic57$;
        }
        if (var50.eql((SubLObject)$ic40$)) {
            return (SubLObject)$ic57$;
        }
        return Errors.error((SubLObject)$ic59$, var50);
    }
    
    public static SubLObject f23692(final SubLObject var116) {
        return module0035.f2169(var116, $g3010$.getGlobalValue());
    }
    
    public static SubLObject f23693(final SubLObject var121) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        SubLObject var123;
        SubLObject var124;
        SubLObject var125;
        SubLObject var126;
        for (var123 = (SubLObject)NIL, var123 = var121; NIL != var123; var123 = conses_high.cddr(var123)) {
            var124 = var123.first();
            var125 = conses_high.cadr(var123);
            assert NIL != f23692(var124) : var124;
            var126 = var124;
            if (var126.eql((SubLObject)$ic62$)) {
                assert NIL != module0173.f10955(var125) : var125;
            }
            else if (var126.eql((SubLObject)$ic64$)) {
                assert NIL != module0130.f8516(var125) : var125;
            }
            else if (var126.eql((SubLObject)$ic66$)) {
                assert NIL != Types.consp(var125) : var125;
            }
            else if (var126.eql((SubLObject)$ic68$)) {
                assert NIL != module0205.f13297(var125) : var125;
            }
            else if (var126.eql((SubLObject)$ic70$)) {
                assert NIL != Types.listp(var125) : var125;
            }
            else if (var126.eql((SubLObject)$ic72$)) {
                assert NIL != Types.function_spec_p(var125) : var125;
            }
            else if (var126.eql((SubLObject)$ic74$)) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var122) && var125 != $ic22$ && (NIL == module0035.f2014(var125) || NIL == module0035.f2370((SubLObject)$ic75$, var125, (SubLObject)UNPROVIDED))) {
                    Errors.error((SubLObject)$ic76$, var125);
                }
            }
            else if (var126.eql((SubLObject)$ic77$)) {
                assert NIL != f23680(var125) : var125;
            }
            else if (var126.eql((SubLObject)$ic78$)) {
                assert NIL != Types.symbolp(var125) : var125;
            }
            else {
                Errors.error((SubLObject)$ic79$, var124);
            }
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var122) && NIL == conses_high.getf(var121, (SubLObject)$ic64$, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic80$, var121);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var122) && makeBoolean(NIL == conses_high.getf(var121, (SubLObject)$ic77$, (SubLObject)UNPROVIDED)).eql((SubLObject)makeBoolean(NIL == conses_high.getf(var121, (SubLObject)$ic78$, (SubLObject)UNPROVIDED)))) {
            Errors.error((SubLObject)$ic81$, var121);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f23694() {
        module0067.f4904($g3012$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23695() {
        return module0077.f5312($g3005$.getGlobalValue());
    }
    
    public static SubLObject f23696() {
        return module0077.f5311($g3005$.getGlobalValue());
    }
    
    public static SubLObject f23697() {
        return module0067.f4861($g3012$.getGlobalValue());
    }
    
    public static SubLObject f23698() {
        return Numbers.add(f23696(), f23697());
    }
    
    public static SubLObject f23699() {
        return module0067.f4902($g3012$.getGlobalValue());
    }
    
    public static SubLObject f23665(final SubLObject var18) {
        return module0067.f4885($g3012$.getGlobalValue(), var18, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23700(final SubLObject var106) {
        return module0035.sublisp_boolean(f23665(var106));
    }
    
    public static SubLObject f23701(final SubLObject var6, final SubLObject var125) {
        if (NIL == var125) {
            module0067.f4887($g3013$.getGlobalValue(), var6);
        }
        else {
            module0067.f4886($g3013$.getGlobalValue(), var6, var125);
        }
        return var6;
    }
    
    public static SubLObject f23667(final SubLObject var6) {
        return module0035.sublisp_boolean(module0067.f4885($g3013$.getGlobalValue(), var6, (SubLObject)NIL));
    }
    
    public static SubLObject f23668(final SubLObject var6) {
        return module0067.f4885($g3013$.getGlobalValue(), var6, (SubLObject)NIL);
    }
    
    public static SubLObject f23702(final SubLObject var6) {
        final SubLObject var7 = f23703(var6);
        if (NIL != var7) {
            module0084.f5772($g3012$.getGlobalValue(), var7, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0077.f5327(var6, $g3005$.getGlobalValue());
        module0067.f4887($g3011$.getGlobalValue(), f23664(var6));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23704(final SubLObject var6) {
        module0067.f4886($g3011$.getGlobalValue(), f23664(var6), var6);
        final SubLObject var7 = f23703(var6);
        if (NIL != var7) {
            module0084.f5762($g3012$.getGlobalValue(), var7, var6);
        }
        else {
            module0077.f5326(var6, $g3005$.getGlobalValue());
        }
        return var6;
    }
    
    public static SubLObject f23705(final SubLObject var106) {
        SubLObject var107 = (SubLObject)ZERO_INTEGER;
        SubLObject var108 = f23665(var106);
        SubLObject var109 = (SubLObject)NIL;
        var109 = var108.first();
        while (NIL != var108) {
            f23702(var109);
            var107 = Numbers.add(var107, (SubLObject)ONE_INTEGER);
            var108 = var108.rest();
            var109 = var108.first();
        }
        return var107;
    }
    
    public static SubLObject f23706(final SubLObject var127, final SubLObject var128) {
        f23707(var127, var128, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23708(final SubLObject var127) {
        return (SubLObject)((var127.getClass() == $sX26334_native.class) ? T : NIL);
    }
    
    public static SubLObject f23709(final SubLObject var127) {
        assert NIL != f23708(var127) : var127;
        return var127.getField2();
    }
    
    public static SubLObject f23710(final SubLObject var127) {
        assert NIL != f23708(var127) : var127;
        return var127.getField3();
    }
    
    public static SubLObject f23711(final SubLObject var127) {
        assert NIL != f23708(var127) : var127;
        return var127.getField4();
    }
    
    public static SubLObject f23712(final SubLObject var127) {
        assert NIL != f23708(var127) : var127;
        return var127.getField5();
    }
    
    public static SubLObject f23713(final SubLObject var127) {
        assert NIL != f23708(var127) : var127;
        return var127.getField6();
    }
    
    public static SubLObject f23714(final SubLObject var127) {
        assert NIL != f23708(var127) : var127;
        return var127.getField7();
    }
    
    public static SubLObject f23715(final SubLObject var127) {
        assert NIL != f23708(var127) : var127;
        return var127.getField8();
    }
    
    public static SubLObject f23716(final SubLObject var127) {
        assert NIL != f23708(var127) : var127;
        return var127.getField9();
    }
    
    public static SubLObject f23717(final SubLObject var127, final SubLObject var130) {
        assert NIL != f23708(var127) : var127;
        return var127.setField2(var130);
    }
    
    public static SubLObject f23718(final SubLObject var127, final SubLObject var130) {
        assert NIL != f23708(var127) : var127;
        return var127.setField3(var130);
    }
    
    public static SubLObject f23719(final SubLObject var127, final SubLObject var130) {
        assert NIL != f23708(var127) : var127;
        return var127.setField4(var130);
    }
    
    public static SubLObject f23720(final SubLObject var127, final SubLObject var130) {
        assert NIL != f23708(var127) : var127;
        return var127.setField5(var130);
    }
    
    public static SubLObject f23721(final SubLObject var127, final SubLObject var130) {
        assert NIL != f23708(var127) : var127;
        return var127.setField6(var130);
    }
    
    public static SubLObject f23722(final SubLObject var127, final SubLObject var130) {
        assert NIL != f23708(var127) : var127;
        return var127.setField7(var130);
    }
    
    public static SubLObject f23723(final SubLObject var127, final SubLObject var130) {
        assert NIL != f23708(var127) : var127;
        return var127.setField8(var130);
    }
    
    public static SubLObject f23724(final SubLObject var127, final SubLObject var130) {
        assert NIL != f23708(var127) : var127;
        return var127.setField9(var130);
    }
    
    public static SubLObject f23725(SubLObject var131) {
        if (var131 == UNPROVIDED) {
            var131 = (SubLObject)NIL;
        }
        final SubLObject var132 = (SubLObject)new $sX26334_native();
        SubLObject var133;
        SubLObject var134;
        SubLObject var135;
        SubLObject var136;
        for (var133 = (SubLObject)NIL, var133 = var131; NIL != var133; var133 = conses_high.cddr(var133)) {
            var134 = var133.first();
            var135 = conses_high.cadr(var133);
            var136 = var134;
            if (var136.eql((SubLObject)$ic109$)) {
                f23717(var132, var135);
            }
            else if (var136.eql((SubLObject)$ic62$)) {
                f23718(var132, var135);
            }
            else if (var136.eql((SubLObject)$ic64$)) {
                f23719(var132, var135);
            }
            else if (var136.eql((SubLObject)$ic66$)) {
                f23720(var132, var135);
            }
            else if (var136.eql((SubLObject)$ic77$)) {
                f23721(var132, var135);
            }
            else if (var136.eql((SubLObject)$ic110$)) {
                f23722(var132, var135);
            }
            else if (var136.eql((SubLObject)$ic68$)) {
                f23723(var132, var135);
            }
            else if (var136.eql((SubLObject)$ic70$)) {
                f23724(var132, var135);
            }
            else {
                Errors.error((SubLObject)$ic111$, var134);
            }
        }
        return var132;
    }
    
    public static SubLObject f23726(final SubLObject var136, final SubLObject var137) {
        Functions.funcall(var137, var136, (SubLObject)$ic112$, (SubLObject)$ic113$, (SubLObject)EIGHT_INTEGER);
        Functions.funcall(var137, var136, (SubLObject)$ic114$, (SubLObject)$ic109$, f23709(var136));
        Functions.funcall(var137, var136, (SubLObject)$ic114$, (SubLObject)$ic62$, f23710(var136));
        Functions.funcall(var137, var136, (SubLObject)$ic114$, (SubLObject)$ic64$, f23711(var136));
        Functions.funcall(var137, var136, (SubLObject)$ic114$, (SubLObject)$ic66$, f23712(var136));
        Functions.funcall(var137, var136, (SubLObject)$ic114$, (SubLObject)$ic77$, f23713(var136));
        Functions.funcall(var137, var136, (SubLObject)$ic114$, (SubLObject)$ic110$, f23714(var136));
        Functions.funcall(var137, var136, (SubLObject)$ic114$, (SubLObject)$ic68$, f23715(var136));
        Functions.funcall(var137, var136, (SubLObject)$ic114$, (SubLObject)$ic70$, f23716(var136));
        Functions.funcall(var137, var136, (SubLObject)$ic115$, (SubLObject)$ic113$, (SubLObject)EIGHT_INTEGER);
        return var136;
    }
    
    public static SubLObject f23727(final SubLObject var136, final SubLObject var137) {
        return f23726(var136, var137);
    }
    
    public static SubLObject f23707(final SubLObject var116, final SubLObject var128, final SubLObject var138) {
        PrintLow.format(var128, (SubLObject)$ic117$, f23709(var116));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23728(final SubLObject var116) {
        return Sxhash.sxhash(f23709(var116));
    }
    
    public static SubLObject f23729(final SubLObject var139) {
        assert NIL != Types.keywordp(var139) : var139;
        return module0067.f4885($g3011$.getGlobalValue(), var139, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23730(final SubLObject var139, final SubLObject var121) {
        assert NIL != Types.keywordp(var139) : var139;
        f23693(var121);
        SubLObject var140 = f23729(var139);
        if (NIL != var140) {
            f23702(var140);
        }
        else {
            var140 = f23725((SubLObject)UNPROVIDED);
        }
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = var121;
        SubLObject var143 = (SubLObject)NIL;
        SubLObject var145_146 = (SubLObject)NIL;
        while (NIL != var142) {
            cdestructuring_bind.destructuring_bind_must_consp(var142, var121, (SubLObject)$ic120$);
            var145_146 = var142.first();
            var142 = var142.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var142, var121, (SubLObject)$ic120$);
            if (NIL == conses_high.member(var145_146, (SubLObject)$ic121$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var143 = (SubLObject)T;
            }
            if (var145_146 == $ic2$) {
                var141 = var142.first();
            }
            var142 = var142.rest();
        }
        if (NIL != var143 && NIL == var141) {
            cdestructuring_bind.cdestructuring_bind_error(var121, (SubLObject)$ic120$);
        }
        final SubLObject var144 = cdestructuring_bind.property_list_member((SubLObject)$ic62$, var121);
        final SubLObject var145 = (SubLObject)((NIL != var144) ? conses_high.cadr(var144) : NIL);
        final SubLObject var146 = cdestructuring_bind.property_list_member((SubLObject)$ic64$, var121);
        final SubLObject var147 = (SubLObject)((NIL != var146) ? conses_high.cadr(var146) : NIL);
        final SubLObject var148 = cdestructuring_bind.property_list_member((SubLObject)$ic70$, var121);
        final SubLObject var149 = (SubLObject)((NIL != var148) ? conses_high.cadr(var148) : NIL);
        final SubLObject var150 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var121);
        final SubLObject var151 = (SubLObject)((NIL != var150) ? conses_high.cadr(var150) : NIL);
        final SubLObject var152 = cdestructuring_bind.property_list_member((SubLObject)$ic68$, var121);
        final SubLObject var153 = (SubLObject)((NIL != var152) ? conses_high.cadr(var152) : NIL);
        final SubLObject var154 = cdestructuring_bind.property_list_member((SubLObject)$ic74$, var121);
        final SubLObject var155 = (SubLObject)((NIL != var154) ? conses_high.cadr(var154) : NIL);
        final SubLObject var156 = cdestructuring_bind.property_list_member((SubLObject)$ic77$, var121);
        final SubLObject var157 = (SubLObject)((NIL != var156) ? conses_high.cadr(var156) : NIL);
        final SubLObject var158 = cdestructuring_bind.property_list_member((SubLObject)$ic78$, var121);
        final SubLObject var159 = (SubLObject)((NIL != var158) ? conses_high.cadr(var158) : NIL);
        f23717(var140, var139);
        f23718(var140, var145);
        f23724(var140, var149);
        f23719(var140, var147);
        f23720(var140, var151);
        f23723(var140, var153);
        f23721(var140, var157);
        f23722(var140, var159);
        f23701(var140, var155);
        f23704(var140);
        return var140;
    }
    
    public static SubLObject f23731(final SubLObject var139) {
        final SubLObject var140 = f23729(var139);
        if (NIL != var140) {
            f23702(var140);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23664(final SubLObject var6) {
        assert NIL != f23708(var6) : var6;
        return f23709(var6);
    }
    
    public static SubLObject f23703(final SubLObject var6) {
        assert NIL != f23708(var6) : var6;
        return f23710(var6);
    }
    
    public static SubLObject f23732(final SubLObject var6) {
        assert NIL != f23708(var6) : var6;
        return f23716(var6);
    }
    
    public static SubLObject f23733(final SubLObject var6) {
        assert NIL != f23708(var6) : var6;
        return f23711(var6);
    }
    
    public static SubLObject f23734(final SubLObject var6) {
        assert NIL != f23708(var6) : var6;
        return f23712(var6);
    }
    
    public static SubLObject f23735(final SubLObject var6) {
        assert NIL != f23708(var6) : var6;
        return f23715(var6);
    }
    
    public static SubLObject f23736(final SubLObject var6) {
        assert NIL != f23708(var6) : var6;
        return f23713(var6);
    }
    
    public static SubLObject f23737(final SubLObject var6) {
        assert NIL != f23708(var6) : var6;
        return f23714(var6);
    }
    
    public static SubLObject f23738(final SubLObject var6) {
        final SubLObject var7 = f23664(var6);
        module0642.f39019((SubLObject)$ic122$);
        module0642.f39021(var7);
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var8 = f23733(var6);
        module0642.f39019((SubLObject)$ic123$);
        module0642.f39019(var8);
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var9 = f23703(var6);
        if (NIL != var9) {
            module0642.f39019((SubLObject)$ic124$);
            module0656.f39804(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        final SubLObject var10 = f23732(var6);
        if (NIL != var10) {
            module0642.f39019((SubLObject)$ic125$);
            module0656.f39804(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        final SubLObject var11 = f23734(var6);
        if (NIL != var11) {
            module0642.f39019((SubLObject)$ic126$);
            module0656.f39804(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        final SubLObject var12 = f23735(var6);
        if (NIL != var12) {
            module0642.f39019((SubLObject)$ic127$);
            module0656.f39804(var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        final SubLObject var13 = f23736(var6);
        if (NIL != var13) {
            module0642.f39019((SubLObject)$ic128$);
            module0642.f39019(var13);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        final SubLObject var14 = f23737(var6);
        if (NIL != var14) {
            module0642.f39019((SubLObject)$ic129$);
            module0642.f39019(var14);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23666(final SubLObject var6, final SubLObject var28, final SubLObject var29, final SubLObject var30) {
        if (NIL != f23739(var6, module0205.f13333(var28)) && NIL != f23740(var6, var29) && NIL != f23741(var6, var28, var30) && NIL != f23742(var6)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23739(final SubLObject var6, final SubLObject var18) {
        final SubLObject var19 = f23703(var6);
        if (NIL != var19) {
            return Equality.eql(var19, var18);
        }
        final SubLObject var20 = f23732(var6);
        if (NIL != var20) {
            return module0004.f104(var18, var20, (SubLObject)$ic130$, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f23740(final SubLObject var6, final SubLObject var29) {
        return Equality.eql(var29, f23733(var6));
    }
    
    public static SubLObject f23741(final SubLObject var6, final SubLObject var28, final SubLObject var30) {
        final SubLObject var31 = f23734(var6);
        return (SubLObject)makeBoolean(NIL == var31 || NIL != module0337.f22630(var28, var31));
    }
    
    public static SubLObject f23742(final SubLObject var6) {
        final SubLObject var7 = f23735(var6);
        return (SubLObject)makeBoolean(NIL == var7 || NIL != module0147.f9507(var7));
    }
    
    public static SubLObject f23662(final SubLObject var6, final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        final SubLObject var48 = f23736(var6);
        if (NIL != var48) {
            return var48;
        }
        final SubLObject var49 = f23737(var6);
        return f23743(var49, var28, var30, var47);
    }
    
    public static SubLObject f23743(final SubLObject var159, final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        if (var159.eql((SubLObject)$ic131$)) {
            return module0499.f32188(var28, var30, var47);
        }
        return Functions.funcall(var159, var28, var30, var47);
    }
    
    public static SubLObject f23744(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23746((SubLObject)ONE_INTEGER, var28, var30));
    }
    
    public static SubLObject f23747(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23746((SubLObject)TWO_INTEGER, var28, var30));
    }
    
    public static SubLObject f23748(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23746((SubLObject)THREE_INTEGER, var28, var30));
    }
    
    public static SubLObject f23749(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23746((SubLObject)FOUR_INTEGER, var28, var30));
    }
    
    public static SubLObject f23750(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23746((SubLObject)FIVE_INTEGER, var28, var30));
    }
    
    public static SubLObject f23751(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23752((SubLObject)$ic137$, var28, var30));
    }
    
    public static SubLObject f23753(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23752((SubLObject)$ic139$, var28, var30));
    }
    
    public static SubLObject f23754(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23752((SubLObject)$ic141$, var28, var30));
    }
    
    public static SubLObject f23755(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23752((SubLObject)$ic143$, var28, var30));
    }
    
    public static SubLObject f23756(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        final SubLObject var48 = (SubLObject)makeBoolean(NIL != f23746((SubLObject)ONE_INTEGER, var28, var30) || NIL != f23746((SubLObject)TWO_INTEGER, var28, var30));
        return f23745(var48);
    }
    
    public static SubLObject f23757(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        final SubLObject var48 = (SubLObject)makeBoolean(NIL != f23746((SubLObject)ONE_INTEGER, var28, var30) || NIL != f23746((SubLObject)THREE_INTEGER, var28, var30));
        return f23745(var48);
    }
    
    public static SubLObject f23758(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        final SubLObject var48 = (SubLObject)makeBoolean(NIL != f23746((SubLObject)TWO_INTEGER, var28, var30) || NIL != f23746((SubLObject)THREE_INTEGER, var28, var30));
        return f23745(var48);
    }
    
    public static SubLObject f23759(final SubLObject var28, final SubLObject var30, final SubLObject var47) {
        return f23745(f23760(var28, var30));
    }
    
    public static SubLObject f23745(final SubLObject var165) {
        if (NIL != var165) {
            return (SubLObject)$ic21$;
        }
        return (SubLObject)$ic40$;
    }
    
    public static SubLObject f23760(final SubLObject var28, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = module0205.f13207(var28, (SubLObject)$ic149$);
        SubLObject var33 = (SubLObject)NIL;
        var33 = var32.first();
        while (NIL != var32) {
            if (NIL != f23761(var33, var30)) {
                return (SubLObject)NIL;
            }
            var32 = var32.rest();
            var33 = var32.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f23752(final SubLObject var168, final SubLObject var28, final SubLObject var30) {
        SubLObject var169 = var168;
        SubLObject var170 = (SubLObject)NIL;
        var170 = var169.first();
        while (NIL != var169) {
            if (NIL == f23746(var170, var28, var30)) {
                return (SubLObject)NIL;
            }
            var169 = var169.rest();
            var170 = var169.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f23746(final SubLObject var169, final SubLObject var28, final SubLObject var30) {
        final SubLObject var170 = module0205.f13384(var28, var169, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL == f23761(var170, var30));
    }
    
    public static SubLObject f23762(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != module0193.f12067(var116) && NIL == module0004.f104(var116, $g3015$.getDynamicValue(var117), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f23761(final SubLObject var170, final SubLObject var30) {
        final SubLThread var171 = SubLProcess.currentSubLThread();
        final SubLObject var172 = $g3015$.currentBinding(var171);
        try {
            $g3015$.bind(var30, var171);
            return module0035.f2439((SubLObject)$ic151$, var170, (SubLObject)UNPROVIDED);
        }
        finally {
            $g3015$.rebind(var172, var171);
        }
    }
    
    public static SubLObject f23763(final SubLObject var116) {
        return (SubLObject)makeBoolean(NIL != module0130.f8516(var116) || $ic152$ == var116);
    }
    
    public static SubLObject f23764(final SubLObject var116) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var116) && NIL != module0173.f10955(module0205.f13342(var116)));
    }
    
    public static SubLObject f23765(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        final SubLObject var173 = module0035.f2293($g3016$.getGlobalValue(), var171, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var172) && NIL == var173) {
            Errors.error((SubLObject)$ic154$, var171);
        }
        return var173;
    }
    
    public static SubLObject f23766(final SubLObject var29, final SubLObject var172) {
        return module0435.f30626(module0038.f2638(var172), var29);
    }
    
    public static SubLObject f23767(final SubLObject var106, final SubLObject var171) {
        SubLObject var172 = (SubLObject)NIL;
        SubLObject var173;
        SubLObject var174;
        for (var173 = module0048.f_1_(var171), var174 = (SubLObject)NIL, var174 = (SubLObject)ZERO_INTEGER; var174.numL(var173); var174 = Numbers.add(var174, (SubLObject)ONE_INTEGER)) {
            var172 = (SubLObject)ConsesLow.cons((SubLObject)$ic155$, var172);
        }
        var172 = (SubLObject)ConsesLow.cons((SubLObject)$ic156$, var172);
        var172 = Sequences.nreverse(var172);
        var172 = module0035.f2021((SubLObject)$ic155$, var172);
        var172 = ConsesLow.nconc((SubLObject)ConsesLow.list(var106), var172);
        return var172;
    }
    
    public static SubLObject f23768(final SubLObject var175, final SubLObject var139) {
        return module0067.f4886($g3017$.getGlobalValue(), var175, var139);
    }
    
    public static SubLObject f23769(final SubLObject var175) {
        return module0067.f4885($g3017$.getGlobalValue(), var175, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23770(final SubLObject var175) {
        return module0035.sublisp_boolean(f23769(var175));
    }
    
    public static SubLObject f23771(final SubLObject var176, final SubLObject var106, final SubLObject var171) {
        assert NIL != module0004.f106(var171) : var171;
        final SubLObject var177 = f23765(var171);
        final SubLObject var178 = f23767(var106, var171);
        return f23772(var176, var178, var177);
    }
    
    public static SubLObject f23773(final SubLObject var176, final SubLObject var106) {
        assert NIL != module0173.f10955(var106) : var106;
        return f23772(var176, reader.bq_cons(var106, (SubLObject)$ic156$), (SubLObject)$ic148$);
    }
    
    public static SubLObject f23774(final SubLObject var176, final SubLObject var177) {
        assert NIL != module0173.f10955(var177) : var177;
        return f23772(var176, reader.bq_cons(var177, (SubLObject)$ic159$), (SubLObject)$ic145$);
    }
    
    public static SubLObject f23772(final SubLObject var176, final SubLObject var172, final SubLObject var159) {
        assert NIL != f23763(var176) : var176;
        assert NIL != f23764(var172) : var172;
        SubLObject var178;
        final SubLObject var177 = var178 = (SubLObject)(($ic152$ == var176) ? $ic162$ : ConsesLow.list(var176));
        SubLObject var179 = (SubLObject)NIL;
        var179 = var178.first();
        while (NIL != var178) {
            final SubLObject var180 = module0205.f13342(var172);
            final SubLObject var181 = (SubLObject)ConsesLow.list((SubLObject)$ic64$, var179, (SubLObject)$ic62$, var180, (SubLObject)$ic66$, var172, (SubLObject)$ic78$, var159);
            if (NIL == f23770(var181)) {
                final SubLObject var182 = f23766(var179, var172);
                f23768(var181, var182);
                return f23730(var182, var181);
            }
            var178 = var178.rest();
            var179 = var178.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23775() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0358", "f23655", "S#26340");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0358", "f23656", "S#26341");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0358", "f23657", "S#26342");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0358", "f23658", "S#26343");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23659", "S#26344", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23660", "S#26345", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23661", "S#26346", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23669", "S#26347", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23670", "S#26348", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23671", "S#26349", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23672", "S#26350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23673", "S#26351", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23677", "S#26352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23678", "S#26353", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23674", "S#26354", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23675", "S#26355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23679", "S#26356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23680", "S#26357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23681", "S#26358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23682", "S#26359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23683", "S#26360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23663", "S#26361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23676", "S#26362", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23684", "S#26363", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23685", "S#26364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23686", "S#26365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23687", "S#26366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23688", "S#26367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23689", "S#26368", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23690", "S#26369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23691", "S#26370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23692", "S#26371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23693", "S#26372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23694", "S#25444", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23695", "S#26373", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23696", "S#26374", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23697", "S#26375", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23698", "S#26376", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23699", "S#26377", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23665", "S#26378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23700", "S#26379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23701", "S#26380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23667", "S#26381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23668", "S#26382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23702", "S#26383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23704", "S#26384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23705", "S#26385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23706", "S#26386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23708", "S#26335", 1, 0, false);
        new $f23708$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23709", "S#26387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23710", "S#26388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23711", "S#26389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23712", "S#26390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23713", "S#26391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23714", "S#26392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23715", "S#26393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23716", "S#26394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23717", "S#26395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23718", "S#26396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23719", "S#26397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23720", "S#26398", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23721", "S#26399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23722", "S#26400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23723", "S#26401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23724", "S#26402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23725", "S#26403", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23726", "S#26404", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23727", "S#26405", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23707", "S#26406", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23728", "S#26336", 1, 0, false);
        new $f23728$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23729", "S#26407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23730", "S#26408", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23731", "S#26409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23664", "S#26410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23703", "S#26411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23732", "S#26412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23733", "S#26413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23734", "S#26414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23735", "S#26415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23736", "S#26416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23737", "S#26417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23738", "S#26418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23666", "S#26419", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23739", "S#26420", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23740", "S#26421", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23741", "S#26422", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23742", "S#26423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23662", "S#26424", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23743", "S#26425", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23744", "S#26426", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23747", "S#26427", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23748", "S#26428", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23749", "S#26429", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23750", "S#26430", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23751", "S#26431", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23753", "S#26432", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23754", "S#26433", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23755", "S#26434", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23756", "S#26435", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23757", "S#26436", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23758", "S#26437", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23759", "S#26438", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23745", "S#26439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23760", "S#26440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23752", "S#26441", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23746", "S#26442", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23762", "S#26443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23761", "S#26444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23763", "S#26445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23764", "S#26446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23765", "S#26447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23766", "S#26448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23767", "S#26449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23768", "S#26450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23769", "S#26451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23770", "S#26452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23771", "S#26453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23773", "S#26454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23774", "S#26455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0358", "f23772", "S#26456", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23776() {
        $g3006$ = SubLFiles.defvar("S#26457", (SubLObject)NIL);
        $g3004$ = SubLFiles.deflexical("S#26458", (SubLObject)$ic35$);
        $g3007$ = SubLFiles.deflexical("S#26459", (SubLObject)$ic40$);
        $g3008$ = SubLFiles.deflexical("S#26460", (SubLObject)$ic21$);
        $g3009$ = SubLFiles.deflexical("S#26461", (SubLObject)$ic41$);
        $g3010$ = SubLFiles.deflexical("S#26462", (SubLObject)$ic60$);
        $g3011$ = SubLFiles.deflexical("S#26463", (NIL != Symbols.boundp((SubLObject)$ic18$)) ? $g3011$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3005$ = SubLFiles.deflexical("S#26464", (NIL != Symbols.boundp((SubLObject)$ic5$)) ? $g3005$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3012$ = SubLFiles.deflexical("S#26465", (NIL != Symbols.boundp((SubLObject)$ic82$)) ? $g3012$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g3013$ = SubLFiles.deflexical("S#26466", (NIL != Symbols.boundp((SubLObject)$ic83$)) ? $g3013$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3014$ = SubLFiles.defconstant("S#26467", (SubLObject)$ic84$);
        $g3015$ = SubLFiles.defparameter("S#26468", (SubLObject)NIL);
        $g3016$ = SubLFiles.deflexical("S#26469", (SubLObject)$ic153$);
        $g3017$ = SubLFiles.deflexical("S#26470", (NIL != Symbols.boundp((SubLObject)$ic157$)) ? $g3017$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23777() {
        module0003.f57((SubLObject)$ic18$);
        module0003.f57((SubLObject)$ic5$);
        module0003.f57((SubLObject)$ic82$);
        module0003.f57((SubLObject)$ic83$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3014$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic91$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic92$);
        Structures.def_csetf((SubLObject)$ic93$, (SubLObject)$ic94$);
        Structures.def_csetf((SubLObject)$ic95$, (SubLObject)$ic96$);
        Structures.def_csetf((SubLObject)$ic97$, (SubLObject)$ic98$);
        Structures.def_csetf((SubLObject)$ic99$, (SubLObject)$ic100$);
        Structures.def_csetf((SubLObject)$ic101$, (SubLObject)$ic102$);
        Structures.def_csetf((SubLObject)$ic103$, (SubLObject)$ic104$);
        Structures.def_csetf((SubLObject)$ic105$, (SubLObject)$ic106$);
        Structures.def_csetf((SubLObject)$ic107$, (SubLObject)$ic108$);
        Equality.identity((SubLObject)$ic84$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3014$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic116$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g3014$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic118$));
        module0012.f419((SubLObject)$ic132$);
        module0012.f419((SubLObject)$ic133$);
        module0012.f419((SubLObject)$ic134$);
        module0012.f419((SubLObject)$ic135$);
        module0012.f419((SubLObject)$ic136$);
        module0012.f419((SubLObject)$ic138$);
        module0012.f419((SubLObject)$ic140$);
        module0012.f419((SubLObject)$ic142$);
        module0012.f419((SubLObject)$ic144$);
        module0012.f419((SubLObject)$ic145$);
        module0012.f419((SubLObject)$ic146$);
        module0012.f419((SubLObject)$ic147$);
        module0012.f419((SubLObject)$ic148$);
        module0003.f57((SubLObject)$ic157$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23775();
    }
    
    public void initializeVariables() {
        f23776();
    }
    
    public void runTopLevelForms() {
        f23777();
    }
    
    static {
        me = (SubLFile)new module0358();
        $g3006$ = null;
        $g3004$ = null;
        $g3007$ = null;
        $g3008$ = null;
        $g3009$ = null;
        $g3010$ = null;
        $g3011$ = null;
        $g3005$ = null;
        $g3012$ = null;
        $g3013$ = null;
        $g3014$ = null;
        $g3015$ = null;
        $g3016$ = null;
        $g3017$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#26471", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("DONE");
        $ic4$ = makeSymbol("S#708", "CYC");
        $ic5$ = makeSymbol("S#26464", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#26471", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic7$ = makeSymbol("CSOME");
        $ic8$ = makeSymbol("S#26378", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#26471", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#26472", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic10$ = makeUninternedSymbol("US#34A80D6");
        $ic11$ = makeSymbol("CLET");
        $ic12$ = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic13$ = makeSymbol("S#26341", "CYC");
        $ic14$ = makeSymbol("PWHEN");
        $ic15$ = makeSymbol("S#26419", "CYC");
        $ic16$ = makeSymbol("S#26340", "CYC");
        $ic17$ = makeSymbol("S#7436", "CYC");
        $ic18$ = makeSymbol("S#26463", "CYC");
        $ic19$ = makeSymbol("S#26331", "CYC");
        $ic20$ = makeString("no preference modules applicable");
        $ic21$ = makeKeyword("DISALLOWED");
        $ic22$ = makeKeyword("ALL");
        $ic23$ = makeSymbol("S#26410", "CYC");
        $ic24$ = makeSymbol("SINGLETON?");
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#26473", "CYC"), (SubLObject)makeSymbol("S#713", "CYC"));
        $ic26$ = makeSymbol("S#15946", "CYC");
        $ic27$ = makeKeyword("TACTICAL");
        $ic28$ = makeKeyword("UNSPECIFIED");
        $ic29$ = makeKeyword("NEG");
        $ic30$ = makeKeyword("POS");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic34$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SomeFn")), constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic35$ = makeKeyword("PREFERRED");
        $ic36$ = makeString("closed asent");
        $ic37$ = makeString("open negation");
        $ic38$ = makeString("no removal options");
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic40$ = makeKeyword("DOOMED");
        $ic41$ = ConsesLow.list((SubLObject)makeKeyword("DOOMED"), (SubLObject)makeKeyword("DISALLOWED"), (SubLObject)makeKeyword("GROSSLY-DISPREFERRED"), (SubLObject)makeKeyword("DISPREFERRED"), (SubLObject)makeKeyword("PREFERRED"));
        $ic42$ = makeSymbol("S#26357", "CYC");
        $ic43$ = makeString("Preferred");
        $ic44$ = makeKeyword("DISPREFERRED");
        $ic45$ = makeString("Dispreferred");
        $ic46$ = makeKeyword("GROSSLY-DISPREFERRED");
        $ic47$ = makeString("Grossly Dispreferred");
        $ic48$ = makeString("Disallowed");
        $ic49$ = makeString("Doomed");
        $ic50$ = makeString("Undetermined");
        $ic51$ = makeString("Unexpected preference-level ~a");
        $ic52$ = makeSymbol("S#26361", "CYC");
        $ic53$ = makeSymbol("S#26362", "CYC");
        $ic54$ = makeKeyword("COMPLETE");
        $ic55$ = makeKeyword("INCOMPLETE");
        $ic56$ = makeKeyword("GROSSLY-INCOMPLETE");
        $ic57$ = makeKeyword("IMPOSSIBLE");
        $ic58$ = makeString("unexpected completeness ~s");
        $ic59$ = makeString("unexpected preference-level ~s");
        $ic60$ = ConsesLow.list((SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)makeKeyword("REQUIRED-MT"), (SubLObject)makeKeyword("ANY-PREDICATES"), (SubLObject)makeKeyword("SUPPLANTS"), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("PREFERENCE"));
        $ic61$ = makeSymbol("S#26371", "CYC");
        $ic62$ = makeKeyword("PREDICATE");
        $ic63$ = makeSymbol("FORT-P");
        $ic64$ = makeKeyword("SENSE");
        $ic65$ = makeSymbol("SENSE-P");
        $ic66$ = makeKeyword("REQUIRED-PATTERN");
        $ic67$ = makeSymbol("CONSP");
        $ic68$ = makeKeyword("REQUIRED-MT");
        $ic69$ = makeSymbol("S#16178", "CYC");
        $ic70$ = makeKeyword("ANY-PREDICATES");
        $ic71$ = makeSymbol("LISTP");
        $ic72$ = makeKeyword("EXCLUSIVE");
        $ic73$ = makeSymbol("FUNCTION-SPEC-P");
        $ic74$ = makeKeyword("SUPPLANTS");
        $ic75$ = makeSymbol("SYMBOLP");
        $ic76$ = makeString("invalid :supplants value ~s");
        $ic77$ = makeKeyword("PREFERENCE-LEVEL");
        $ic78$ = makeKeyword("PREFERENCE");
        $ic79$ = makeString("unexpected preference module property ~s");
        $ic80$ = makeString("~s must specify :sense");
        $ic81$ = makeString("~s must specify exactly one of :preference-level or :preference");
        $ic82$ = makeSymbol("S#26465", "CYC");
        $ic83$ = makeSymbol("S#26466", "CYC");
        $ic84$ = makeSymbol("S#26334", "CYC");
        $ic85$ = makeSymbol("S#26335", "CYC");
        $ic86$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("S#12397", "CYC"), (SubLObject)makeSymbol("S#25688", "CYC"), (SubLObject)makeSymbol("S#26474", "CYC"), (SubLObject)makeSymbol("S#26475", "CYC"), (SubLObject)makeSymbol("S#15031", "CYC"), (SubLObject)makeSymbol("S#15032", "CYC"));
        $ic87$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("PREFERENCE-FUNC"), (SubLObject)makeKeyword("REQUIRED-MT"), (SubLObject)makeKeyword("ANY-PREDICATES"));
        $ic88$ = ConsesLow.list((SubLObject)makeSymbol("S#26387", "CYC"), (SubLObject)makeSymbol("S#26388", "CYC"), (SubLObject)makeSymbol("S#26389", "CYC"), (SubLObject)makeSymbol("S#26390", "CYC"), (SubLObject)makeSymbol("S#26391", "CYC"), (SubLObject)makeSymbol("S#26392", "CYC"), (SubLObject)makeSymbol("S#26393", "CYC"), (SubLObject)makeSymbol("S#26394", "CYC"));
        $ic89$ = ConsesLow.list((SubLObject)makeSymbol("S#26395", "CYC"), (SubLObject)makeSymbol("S#26396", "CYC"), (SubLObject)makeSymbol("S#26397", "CYC"), (SubLObject)makeSymbol("S#26398", "CYC"), (SubLObject)makeSymbol("S#26399", "CYC"), (SubLObject)makeSymbol("S#26400", "CYC"), (SubLObject)makeSymbol("S#26401", "CYC"), (SubLObject)makeSymbol("S#26402", "CYC"));
        $ic90$ = makeSymbol("S#26406", "CYC");
        $ic91$ = makeSymbol("S#26386", "CYC");
        $ic92$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#26335", "CYC"));
        $ic93$ = makeSymbol("S#26387", "CYC");
        $ic94$ = makeSymbol("S#26395", "CYC");
        $ic95$ = makeSymbol("S#26388", "CYC");
        $ic96$ = makeSymbol("S#26396", "CYC");
        $ic97$ = makeSymbol("S#26389", "CYC");
        $ic98$ = makeSymbol("S#26397", "CYC");
        $ic99$ = makeSymbol("S#26390", "CYC");
        $ic100$ = makeSymbol("S#26398", "CYC");
        $ic101$ = makeSymbol("S#26391", "CYC");
        $ic102$ = makeSymbol("S#26399", "CYC");
        $ic103$ = makeSymbol("S#26392", "CYC");
        $ic104$ = makeSymbol("S#26400", "CYC");
        $ic105$ = makeSymbol("S#26393", "CYC");
        $ic106$ = makeSymbol("S#26401", "CYC");
        $ic107$ = makeSymbol("S#26394", "CYC");
        $ic108$ = makeSymbol("S#26402", "CYC");
        $ic109$ = makeKeyword("NAME");
        $ic110$ = makeKeyword("PREFERENCE-FUNC");
        $ic111$ = makeString("Invalid slot ~S for construction function");
        $ic112$ = makeKeyword("BEGIN");
        $ic113$ = makeSymbol("S#26403", "CYC");
        $ic114$ = makeKeyword("SLOT");
        $ic115$ = makeKeyword("END");
        $ic116$ = makeSymbol("S#26405", "CYC");
        $ic117$ = makeString("[PREFMOD ~a]");
        $ic118$ = makeSymbol("S#26336", "CYC");
        $ic119$ = makeSymbol("KEYWORDP");
        $ic120$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#717", "CYC"), makeSymbol("S#12397", "CYC"), makeSymbol("S#15032", "CYC"), makeSymbol("S#25688", "CYC"), makeSymbol("S#15031", "CYC"), makeSymbol("S#15035", "CYC"), makeSymbol("S#26474", "CYC"), makeSymbol("S#26476", "CYC") });
        $ic121$ = ConsesLow.list((SubLObject)makeKeyword("PREDICATE"), (SubLObject)makeKeyword("SENSE"), (SubLObject)makeKeyword("ANY-PREDICATES"), (SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)makeKeyword("REQUIRED-MT"), (SubLObject)makeKeyword("SUPPLANTS"), (SubLObject)makeKeyword("PREFERENCE-LEVEL"), (SubLObject)makeKeyword("PREFERENCE"));
        $ic122$ = makeString("module ");
        $ic123$ = makeString("sense : ");
        $ic124$ = makeString("predicate : ");
        $ic125$ = makeString("any predicates : ");
        $ic126$ = makeString("required pattern : ");
        $ic127$ = makeString("required mt : ");
        $ic128$ = makeString("preference level : ");
        $ic129$ = makeString("preference function : ");
        $ic130$ = makeSymbol("S#14908", "CYC");
        $ic131$ = makeSymbol("S#26338", "CYC");
        $ic132$ = makeSymbol("S#26426", "CYC");
        $ic133$ = makeSymbol("S#26427", "CYC");
        $ic134$ = makeSymbol("S#26428", "CYC");
        $ic135$ = makeSymbol("S#26429", "CYC");
        $ic136$ = makeSymbol("S#26430", "CYC");
        $ic137$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER);
        $ic138$ = makeSymbol("S#26431", "CYC");
        $ic139$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER);
        $ic140$ = makeSymbol("S#26432", "CYC");
        $ic141$ = ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER);
        $ic142$ = makeSymbol("S#26433", "CYC");
        $ic143$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)THREE_INTEGER);
        $ic144$ = makeSymbol("S#26434", "CYC");
        $ic145$ = makeSymbol("S#26435", "CYC");
        $ic146$ = makeSymbol("S#26436", "CYC");
        $ic147$ = makeSymbol("S#26437", "CYC");
        $ic148$ = makeSymbol("S#26438", "CYC");
        $ic149$ = makeKeyword("REGULARIZE");
        $ic150$ = makeSymbol("S#5859", "CYC");
        $ic151$ = makeSymbol("S#26443", "CYC");
        $ic152$ = makeKeyword("BOTH");
        $ic153$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ONE_INTEGER, (SubLObject)makeSymbol("S#26426", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)TWO_INTEGER, (SubLObject)makeSymbol("S#26427", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)THREE_INTEGER, (SubLObject)makeSymbol("S#26428", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)FOUR_INTEGER, (SubLObject)makeSymbol("S#26429", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)FIVE_INTEGER, (SubLObject)makeSymbol("S#26430", "CYC")));
        $ic154$ = makeString("No preference function registered for bindable args ~s");
        $ic155$ = makeKeyword("ANYTHING");
        $ic156$ = makeKeyword("NOT-FULLY-BOUND");
        $ic157$ = makeSymbol("S#26470", "CYC");
        $ic158$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic159$ = ConsesLow.list((SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)makeKeyword("NOT-FULLY-BOUND"));
        $ic160$ = makeSymbol("S#26445", "CYC");
        $ic161$ = makeSymbol("S#26446", "CYC");
        $ic162$ = ConsesLow.list((SubLObject)makeKeyword("POS"), (SubLObject)makeKeyword("NEG"));
    }
    
    public static final class $sX26334_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $predicate;
        public SubLObject $sense;
        public SubLObject $required_pattern;
        public SubLObject $preference_level;
        public SubLObject $preference_func;
        public SubLObject $required_mt;
        public SubLObject $any_predicates;
        public static final SubLStructDeclNative structDecl;
        
        public $sX26334_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
            this.$sense = (SubLObject)CommonSymbols.NIL;
            this.$required_pattern = (SubLObject)CommonSymbols.NIL;
            this.$preference_level = (SubLObject)CommonSymbols.NIL;
            this.$preference_func = (SubLObject)CommonSymbols.NIL;
            this.$required_mt = (SubLObject)CommonSymbols.NIL;
            this.$any_predicates = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX26334_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$predicate;
        }
        
        public SubLObject getField4() {
            return this.$sense;
        }
        
        public SubLObject getField5() {
            return this.$required_pattern;
        }
        
        public SubLObject getField6() {
            return this.$preference_level;
        }
        
        public SubLObject getField7() {
            return this.$preference_func;
        }
        
        public SubLObject getField8() {
            return this.$required_mt;
        }
        
        public SubLObject getField9() {
            return this.$any_predicates;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$predicate = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sense = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$required_pattern = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$preference_level = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$preference_func = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$required_mt = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$any_predicates = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX26334_native.class, $ic84$, $ic85$, $ic86$, $ic87$, new String[] { "$name", "$predicate", "$sense", "$required_pattern", "$preference_level", "$preference_func", "$required_mt", "$any_predicates" }, $ic88$, $ic89$, $ic90$);
        }
    }
    
    public static final class $f23708$UnaryFunction extends UnaryFunction
    {
        public $f23708$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26335"));
        }
        
        public SubLObject processItem(final SubLObject var129) {
            return f23708(var129);
        }
    }
    
    public static final class $f23728$UnaryFunction extends UnaryFunction
    {
        public $f23728$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#26336"));
        }
        
        public SubLObject processItem(final SubLObject var129) {
            return f23728(var129);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 512 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/